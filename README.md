# Horizon Account project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

if you have your mvn setup in your environment, Use mvn instead of ./mvnw in the following.

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.
# Design Descrition
## Hexagon architecture
This service follow the [High level design of Horion0 microservice](https://cgcmy.atlassian.net/wiki/spaces/RKB/pages/280199203/Horizon0+High+Level+Architecture+Design) 

This rep java package follow  [hexagon archtecture style](https://en.wikipedia.org/wiki/Hexagonal_architecture_(software))  to construct the microservice:


Description for the initial package structure:
```
├── adaptor  # Holding different external system adaptor Object
│   ├── email
│   └── smsopt
├── domain  # Holding domain object, include Aggregate_root and value object, entity etc
│   ├── Account.java
│   └── enumerate # Holding enumerate structure 
│       ├── ...
├── errorhandle # Holding Error Handling logic
│   └── ...
├── messaging # Holding message communication(async) interface if applied
└── restapi    
    ├── health # Health check for this service
    ├── AccountResource.java
    └── vo  # value objects for Rest API
```

## RestAPI
This service comply with Rest api materity level 3. 

## Data Persistence and OR Mapping
This service is using [Active Record Pattern](https://en.wikipedia.org/wiki/Active_record_pattern) for data persistence; 

All the db relevant persistence logic embedded in Domain objects.

## Error Handling
When error happens, this service return json format error code and message to upstream.

ErrorHandling and Customize Business Exception are placed in:
```
src/main/java/com/cgc/horizon0/account/errorhandle/
```

Error/Exceptions Return mesage example:
```
{"msg":"RESTEASY003210: Could not find resource for full path: http://account-redhat-ryanzhang-dev.apps.ocp-dev.cgc.com.my/api/account","code":"500","debugMessage":"javax.ws.rs.NotFoundException: RESTEASY003210: Could not find resource for full path: http://account-redhat-ryanzhang-dev.apps.ocp-dev.cgc.com.my/api/account\n\tat org.jboss.resteasy.core.registry.ClassNode.match(ClassNode.java:70)\n\
...
```

## Logging


## Testing
Description for testing folder:
```
src/test/java/com/cgc/horizon0/account/
├── adaptor # Unit test for adaptor package
├── domain # Unit Test for different package
├── errorhandle # UnitTest for errorhandle package
│   └── ...
├── integrationtest  # Contain integration test
│   └── ...
├── restapi # Unit Test for restapi 
└── systemtest # Contain system test including external system testing
```

### How to run different category test 

### Integration Test

### SystemTEst


# flyway
## 命名规范一定要使用__

