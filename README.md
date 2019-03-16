## gRPC 入门项目

#### build
```
mvn protobuf:compile
mvn protobuf:compile-custom
```

#### 注意事项
1. 需要将proto文件放在`src/main/proto`目录下
2. 注意protobuf与protoc的版本兼容性
   ```xml
   <!-- protoc的版本号与protobuf-java的版本号要一致 -->
   <protocArtifact>com.google.protobuf:protoc:3.6.1:exe:${os.detected.classifier}</protocArtifact>
   ```
3. [grpc-java的Github地址](https://github.com/grpc/grpc-java)