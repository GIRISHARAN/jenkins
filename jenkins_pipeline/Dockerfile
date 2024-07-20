# Use an official Java runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the application JAR file into the container
COPY target/*.jar /app/student_application.jar

# Expose the port your application will run on
EXPOSE 9090

# Define the command to run the application
CMD ["java", "-jar", "student_application.jar"]
