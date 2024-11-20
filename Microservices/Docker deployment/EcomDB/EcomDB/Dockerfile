#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} ecomdb.jar
#ENTRYPOINT ["java", "-jar", "/ecomdb.jar"]
#
#
#EXPOSE 9181

## Step 1: Build the application JAR file using an available Maven image with Java 17
#FROM maven:3.8.7-eclipse-temurin-17 AS build
#WORKDIR /app
#COPY .. .
#RUN mvn clean package -DskipTests
#
## Step 2: Use a lightweight JDK image to run the application
#FROM openjdk:17-jdk-slim
#WORKDIR /app
#ARG JAR_FILE=target/*.jar
#COPY --from=build /app/${JAR_FILE} ecomdb.jar
#ENTRYPOINT ["java", "-jar", "/app/ecomdb.jar"]
#EXPOSE 9181
# Use a Maven or Gradle image to build the JAR
FROM maven:3.8.6-openjdk-17 AS build
WORKDIR /app
COPY Docker .
RUN mvn clean package -DskipTests

# Use a Java image to run the JAR
FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} ecomdb.jar
ENTRYPOINT ["java", "-jar", "/ecomdb.jar"]
EXPOSE 9181