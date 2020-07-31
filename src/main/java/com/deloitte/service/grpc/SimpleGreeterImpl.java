package com.deloitte.service.grpc;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.deloitte.service.grpc.GreeterOuterClass.HelloReply;
import com.deloitte.service.grpc.GreeterOuterClass.HelloRequest;

import io.grpc.stub.StreamObserver;

public class SimpleGreeterImpl extends GreeterGrpc.GreeterImplBase {

	private static final Logger logger = LoggerFactory.getLogger(SimpleGreeterImpl.class);
	private static final DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

	@Override
	public void sayHello(HelloRequest req, StreamObserver<HelloReply> responseObserver) {

		logger.info("sayHello request receieved = "+ req.toString());
		
		HelloReply reply = HelloReply.newBuilder()
				.setMessage("Hello " + req.getName())
				.build();
		
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
	}

	@Override
	public void sayHelloAgain(HelloRequest req, StreamObserver<HelloReply> responseObserver) {
		
		logger.info("sayHelloAgain request receieved = "+ req.toString());
		
		HelloReply reply = HelloReply.newBuilder()
				.setMessage("Hello again " + req.getName())
				.build();
		
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
	}

	@Override
	public void sayHelloDateTime(HelloRequest req, StreamObserver<HelloReply> responseObserver) {
		
		logger.info("sayHelloDateTime request receieved = "+ req.toString());
		
		LocalDateTime now = LocalDateTime.now();
		HelloReply reply = HelloReply.newBuilder()
				.setMessage("Hello " + req.getName() + ", the current time is : " + dateTimeFormat.format(now))
				.build();
		
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
	}

}