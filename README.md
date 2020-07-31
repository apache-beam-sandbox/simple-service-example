## Simple GRPC Service using Guice

Simple GRPC service using Google Guice.

## Generate the grpc source code

```
mvn generate-source
```

## Package to a dependencies-included (shade) fat .jar file

```
mvn package
java -jar target/service-example-0.1-shaded.jar
```

## Test with BloomRPCGUI
Download or install bloomrpc
https://github.com/uw-labs/bloomrpc

<img width="1147" alt="Screen Shot 2020-07-30 at 8 12 48 PM" src="https://user-images.githubusercontent.com/3783738/88996155-638d6580-d2a1-11ea-8b97-a120ac9fe56d.png">