package com.deloitte.service.configuration;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.deloitte.service.ServerMain;
import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class ServerConfiguration extends AbstractModule {

	private static final Logger logger = LoggerFactory.getLogger(ServerMain.class);
	private static final int cores = Runtime.getRuntime().availableProcessors();
	private static final String propertyFileName = "application.properties";

	InputStream inputStream;

	@Override
	protected void configure() {

		try {
			Properties prop = new Properties();
			inputStream = getClass().getClassLoader().getResourceAsStream(propertyFileName);

			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propertyFileName + "' not found in the classpath");
			}

			String server = prop.getProperty("server");
			int port = Integer.parseInt(prop.getProperty("port"));

			bind(Integer.class).annotatedWith(Names.named("ServerPort")).toInstance(port);
			bind(String.class).annotatedWith(Names.named("ServerHost")).toInstance(server);
			bind(ScheduledExecutorService.class).toInstance(Executors.newScheduledThreadPool(cores));
			bind(ServerMain.class).asEagerSingleton();

		} catch (Exception ex) {
			logger.error("unable to configure server, error =", ex.getMessage());

		} finally {

			try {
				inputStream.close();
			} catch (IOException ioex) {
				logger.error("unable to reead or load application.properties file, this is pretty bad ...");
			}
		}
	}
}