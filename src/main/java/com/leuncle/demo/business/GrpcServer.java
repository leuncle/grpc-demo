package com.leuncle.demo.business;

import com.leuncle.demo.model.HelloRequest;
import com.leuncle.demo.model.HelloResponse;
import com.leuncle.demo.service.HelloServiceGrpc;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.logging.Logger;

public class GrpcServer {
    private static final Logger logger = Logger.getLogger(GrpcServer.class.getName());

    private int port = 7089;
    private Server server;

    public  static  void main(String[] args) throws IOException, InterruptedException {

        final GrpcServer server = new GrpcServer();
        server.start();
        server.blockUntilShutdown();
    }

    private void start() throws IOException {
        server = ServerBuilder.forPort(port)
                .addService(new HelloServiceImpl())
                .build()
                .start();
        logger.info("Server started, listening on "+ port);

        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run() {
                System.err.println("*** shutting down gRPC business since JVM is shutting down");
                GrpcServer.this.stop();
                System.err.println("*** business shut down");
            }
        });
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null){
            server.awaitTermination();
        }
    }

    private void stop(){
        if (server != null){
            server.shutdown();
        }
    }

    private class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {

        @Override
        public void sayHello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
            HelloResponse response = HelloResponse.newBuilder().setMessage(("Hello "+ request.getName())).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
            System.out.println("Message from gRPC-Client:" + request.getName());
        }
    }
}
