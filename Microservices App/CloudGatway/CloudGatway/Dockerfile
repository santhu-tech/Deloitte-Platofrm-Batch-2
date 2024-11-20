FROM maven:3.8.6-openjdk-17 AS build
WORKDIR /app
COPY Docker .
RUN mvn clean package -DskipTests

# Use a Java image to run the JAR
FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} cloudgateway.jar
ENTRYPOINT ["java", "-jar", "/cloudgateway.jar"]
EXPOSE 9090