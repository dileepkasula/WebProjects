FROM openjdk:21-jdk-oraclelinux8
COPY ReactiveWebService/target/ReactiveWebService-1.0-SNAPSHOT.jar reactive-service.jar
ENTRYPOINT ["java","-jar","/reactive-service.jar"]