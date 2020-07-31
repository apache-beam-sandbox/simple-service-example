package com.deloitte.service;

import java.io.IOException;

import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.deloitte.service.configuration.ServerConfiguration;
import com.deloitte.service.grpc.GreetingServiceGrpc;
import com.google.inject.Guice;

import com.deloitte.service.grpc.GreetingServiceGrpc;

import io.grpc.Server;
import io.grpc.netty.NettyServerBuilder;

public class ServerMain {

	private static final Logger logger = LoggerFactory.getLogger(ServerMain.class);
	private final GreetingService service;
	private final Integer port;

	private Server server;

	/**
	 * Initialize a new instance of the ServerMain class.
	 *
	 * @param service The service instance to host.
	 * @param port    The port to host the service on.
	 */
	@Inject
	public ServerMain(GreetingService service, @Named("ServerPort") Integer port) {
		this.service = service;
		this.port = port;
	}

	/**
	 * The main runner point for the server main. This simply starts an instance
	 * that is created by Guice.
	 *
	 * @param args Any command line arguments to the program.
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		Guice.createInjector(new ServerConfiguration()).getInstance(ServerMain.class).start();
	}

	/**
	 * Starts the server and attaches any callback methods.
	 *
	 * @throws Exception
	 */
	public void start() throws Exception {
		startServer();
		logger.info("server listening on " + port);
		startShutdownHook();
	}

	/**
	 * Stops the underlying GRPC server.
	 */
	public void stop() {
		if (server != null) {
			logger.info("server shutting down " + port);
			server.shutdown();
		}
	}

	/**
	 * Creates and starts the underlying GRPC server.
	 *
	 * @throws IOException
	 */
	private void startServer() throws IOException {
		server = NettyServerBuilder.forPort(port)
			//	.addService(GreetingServiceGrpc.bindService(service))
				.build().start();
	}

	/**
	 * Attaches a shutdown runtime hook to stop the server cleanly on JVM exit.
	 *
	 * @throws Exception
	 */
	private void startShutdownHook() throws Exception {
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				System.err.println("*** force stopping the running server***");
				ServerMain.this.stop();
			}
		});
		server.awaitTermination();
	}
}
