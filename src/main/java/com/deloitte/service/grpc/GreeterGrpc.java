package com.deloitte.service.grpc;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: Greeter.proto")
public class GreeterGrpc {

  private GreeterGrpc() {}

  public static final String SERVICE_NAME = "Greeter";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.deloitte.service.grpc.GreeterOuterClass.HelloRequest,
      com.deloitte.service.grpc.GreeterOuterClass.HelloReply> METHOD_SAY_HELLO =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "Greeter", "SayHello"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.deloitte.service.grpc.GreeterOuterClass.HelloRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.deloitte.service.grpc.GreeterOuterClass.HelloReply.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.deloitte.service.grpc.GreeterOuterClass.HelloRequest,
      com.deloitte.service.grpc.GreeterOuterClass.HelloReply> METHOD_SAY_HELLO_AGAIN =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "Greeter", "SayHelloAgain"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.deloitte.service.grpc.GreeterOuterClass.HelloRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.deloitte.service.grpc.GreeterOuterClass.HelloReply.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.deloitte.service.grpc.GreeterOuterClass.HelloRequest,
      com.deloitte.service.grpc.GreeterOuterClass.HelloReply> METHOD_SAY_HELLO_DATE_TIME =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "Greeter", "SayHelloDateTime"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.deloitte.service.grpc.GreeterOuterClass.HelloRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.deloitte.service.grpc.GreeterOuterClass.HelloReply.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreeterStub newStub(io.grpc.Channel channel) {
    return new GreeterStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreeterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GreeterBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static GreeterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GreeterFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class GreeterImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(com.deloitte.service.grpc.GreeterOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.deloitte.service.grpc.GreeterOuterClass.HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SAY_HELLO, responseObserver);
    }

    /**
     * <pre>
     * Sends another greeting
     * </pre>
     */
    public void sayHelloAgain(com.deloitte.service.grpc.GreeterOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.deloitte.service.grpc.GreeterOuterClass.HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SAY_HELLO_AGAIN, responseObserver);
    }

    /**
     * <pre>
     * Sends greeting with time stamp
     * </pre>
     */
    public void sayHelloDateTime(com.deloitte.service.grpc.GreeterOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.deloitte.service.grpc.GreeterOuterClass.HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SAY_HELLO_DATE_TIME, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SAY_HELLO,
            asyncUnaryCall(
              new MethodHandlers<
                com.deloitte.service.grpc.GreeterOuterClass.HelloRequest,
                com.deloitte.service.grpc.GreeterOuterClass.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .addMethod(
            METHOD_SAY_HELLO_AGAIN,
            asyncUnaryCall(
              new MethodHandlers<
                com.deloitte.service.grpc.GreeterOuterClass.HelloRequest,
                com.deloitte.service.grpc.GreeterOuterClass.HelloReply>(
                  this, METHODID_SAY_HELLO_AGAIN)))
          .addMethod(
            METHOD_SAY_HELLO_DATE_TIME,
            asyncUnaryCall(
              new MethodHandlers<
                com.deloitte.service.grpc.GreeterOuterClass.HelloRequest,
                com.deloitte.service.grpc.GreeterOuterClass.HelloReply>(
                  this, METHODID_SAY_HELLO_DATE_TIME)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterStub extends io.grpc.stub.AbstractStub<GreeterStub> {
    private GreeterStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(com.deloitte.service.grpc.GreeterOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.deloitte.service.grpc.GreeterOuterClass.HelloReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SAY_HELLO, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sends another greeting
     * </pre>
     */
    public void sayHelloAgain(com.deloitte.service.grpc.GreeterOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.deloitte.service.grpc.GreeterOuterClass.HelloReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SAY_HELLO_AGAIN, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sends greeting with time stamp
     * </pre>
     */
    public void sayHelloDateTime(com.deloitte.service.grpc.GreeterOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.deloitte.service.grpc.GreeterOuterClass.HelloReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SAY_HELLO_DATE_TIME, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterBlockingStub extends io.grpc.stub.AbstractStub<GreeterBlockingStub> {
    private GreeterBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.deloitte.service.grpc.GreeterOuterClass.HelloReply sayHello(com.deloitte.service.grpc.GreeterOuterClass.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SAY_HELLO, getCallOptions(), request);
    }

    /**
     * <pre>
     * Sends another greeting
     * </pre>
     */
    public com.deloitte.service.grpc.GreeterOuterClass.HelloReply sayHelloAgain(com.deloitte.service.grpc.GreeterOuterClass.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SAY_HELLO_AGAIN, getCallOptions(), request);
    }

    /**
     * <pre>
     * Sends greeting with time stamp
     * </pre>
     */
    public com.deloitte.service.grpc.GreeterOuterClass.HelloReply sayHelloDateTime(com.deloitte.service.grpc.GreeterOuterClass.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SAY_HELLO_DATE_TIME, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterFutureStub extends io.grpc.stub.AbstractStub<GreeterFutureStub> {
    private GreeterFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.deloitte.service.grpc.GreeterOuterClass.HelloReply> sayHello(
        com.deloitte.service.grpc.GreeterOuterClass.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SAY_HELLO, getCallOptions()), request);
    }

    /**
     * <pre>
     * Sends another greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.deloitte.service.grpc.GreeterOuterClass.HelloReply> sayHelloAgain(
        com.deloitte.service.grpc.GreeterOuterClass.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SAY_HELLO_AGAIN, getCallOptions()), request);
    }

    /**
     * <pre>
     * Sends greeting with time stamp
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.deloitte.service.grpc.GreeterOuterClass.HelloReply> sayHelloDateTime(
        com.deloitte.service.grpc.GreeterOuterClass.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SAY_HELLO_DATE_TIME, getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_SAY_HELLO_AGAIN = 1;
  private static final int METHODID_SAY_HELLO_DATE_TIME = 2;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreeterImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(GreeterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.deloitte.service.grpc.GreeterOuterClass.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.deloitte.service.grpc.GreeterOuterClass.HelloReply>) responseObserver);
          break;
        case METHODID_SAY_HELLO_AGAIN:
          serviceImpl.sayHelloAgain((com.deloitte.service.grpc.GreeterOuterClass.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.deloitte.service.grpc.GreeterOuterClass.HelloReply>) responseObserver);
          break;
        case METHODID_SAY_HELLO_DATE_TIME:
          serviceImpl.sayHelloDateTime((com.deloitte.service.grpc.GreeterOuterClass.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.deloitte.service.grpc.GreeterOuterClass.HelloReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_SAY_HELLO,
        METHOD_SAY_HELLO_AGAIN,
        METHOD_SAY_HELLO_DATE_TIME);
  }

}
