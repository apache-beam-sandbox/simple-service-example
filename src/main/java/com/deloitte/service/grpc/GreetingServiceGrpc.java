package com.deloitte.service.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Defining a Service, a Service can have multiple RPC operations
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: GreetingService.proto")
public class GreetingServiceGrpc {

  private GreetingServiceGrpc() {}

  public static final String SERVICE_NAME = "GreetingService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.deloitte.service.grpc.GreetingServiceOuterClass.HelloRequest,
      com.deloitte.service.grpc.GreetingServiceOuterClass.HelloResponse> METHOD_GREETING =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "GreetingService", "greeting"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.deloitte.service.grpc.GreetingServiceOuterClass.HelloRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.deloitte.service.grpc.GreetingServiceOuterClass.HelloResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreetingServiceStub newStub(io.grpc.Channel channel) {
    return new GreetingServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreetingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GreetingServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static GreetingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GreetingServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Defining a Service, a Service can have multiple RPC operations
   * </pre>
   */
  public static abstract class GreetingServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Define a RPC operation
     * </pre>
     */
    public void greeting(com.deloitte.service.grpc.GreetingServiceOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.deloitte.service.grpc.GreetingServiceOuterClass.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GREETING, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GREETING,
            asyncUnaryCall(
              new MethodHandlers<
                com.deloitte.service.grpc.GreetingServiceOuterClass.HelloRequest,
                com.deloitte.service.grpc.GreetingServiceOuterClass.HelloResponse>(
                  this, METHODID_GREETING)))
          .build();
    }
  }

  /**
   * <pre>
   * Defining a Service, a Service can have multiple RPC operations
   * </pre>
   */
  public static final class GreetingServiceStub extends io.grpc.stub.AbstractStub<GreetingServiceStub> {
    private GreetingServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetingServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetingServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Define a RPC operation
     * </pre>
     */
    public void greeting(com.deloitte.service.grpc.GreetingServiceOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.deloitte.service.grpc.GreetingServiceOuterClass.HelloResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GREETING, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Defining a Service, a Service can have multiple RPC operations
   * </pre>
   */
  public static final class GreetingServiceBlockingStub extends io.grpc.stub.AbstractStub<GreetingServiceBlockingStub> {
    private GreetingServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetingServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetingServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetingServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Define a RPC operation
     * </pre>
     */
    public com.deloitte.service.grpc.GreetingServiceOuterClass.HelloResponse greeting(com.deloitte.service.grpc.GreetingServiceOuterClass.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GREETING, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Defining a Service, a Service can have multiple RPC operations
   * </pre>
   */
  public static final class GreetingServiceFutureStub extends io.grpc.stub.AbstractStub<GreetingServiceFutureStub> {
    private GreetingServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetingServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetingServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetingServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Define a RPC operation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.deloitte.service.grpc.GreetingServiceOuterClass.HelloResponse> greeting(
        com.deloitte.service.grpc.GreetingServiceOuterClass.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GREETING, getCallOptions()), request);
    }
  }

  private static final int METHODID_GREETING = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreetingServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(GreetingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GREETING:
          serviceImpl.greeting((com.deloitte.service.grpc.GreetingServiceOuterClass.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.deloitte.service.grpc.GreetingServiceOuterClass.HelloResponse>) responseObserver);
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
        METHOD_GREETING);
  }

}
