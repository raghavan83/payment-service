# Use the official OpenJDK 17 image as the base image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the host machine to the container
COPY target/payment-service-0.0.1-SNAPSHOT.jar /app/payment-service.jar

# Expose the port the application will run on
EXPOSE 8082

# Command to run the application
ENTRYPOINT ["java", "-jar", "/app/payment-service.jar"]
