// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hello_service.proto

package com.leuncle.demo.service;

public final class GreetingService {
  private GreetingService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\023hello_service.proto\022\025com.leuncle.demo." +
      "grpc\032\013hello.proto2e\n\014HelloService\022U\n\010say" +
      "Hello\022#.com.leuncle.demo.grpc.HelloReque" +
      "st\032$.com.leuncle.demo.grpc.HelloResponse" +
      "B-\n\030com.leuncle.demo.serviceB\017GreetingSe" +
      "rviceP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.leuncle.demo.model.Hello.getDescriptor(),
        }, assigner);
    com.leuncle.demo.model.Hello.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
