# Release Process
* Pump pom.xml version to new tag version
* In classic-dev namespac
```
mvn clean mvn package -DskipTests -Dquarkus.kubernetes.deploy=true
```
* 部署其他相关的微服务
* 等待一切正常
* oc tag classic-dev/newtag quant-invest/newtag
* oc tag 其他微服务 如果适用
* git tag -a newtag
* git push origin newtag
* pump up pom.xml to new snapshot
