FROM openjdk:17-jdk-slim
COPY target/shop-0.0.1-SNAPSHOT.jar shop-api.jar
ENTRYPOINT ["java","-jar","/shop-api.jar"]