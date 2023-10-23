# Use an official Java 11 runtime as a parent image
FROM openjdk:11-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the application JAR file from the target directory into the container
COPY /var/lib/jenkins/workspace/achat\ backend/backend/achat/target/achat-1.0.jar achat.jar

# Expose a port (change the port number if necessary)
EXPOSE 8080

# Define the command to run the application when the container starts
CMD ["java", "-jar", "achat.jar"]
