# Use a lightweight Java image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the application JAR file
COPY target/EmpDB-0.0.1-SNAPSHOT.jar empdb.jar

# Expose the application port
EXPOSE 8080

# Start the application
ENTRYPOINT ["java", "-jar", "empdb.jar"]
