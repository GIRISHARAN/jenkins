# Stage 1: Build the JAR file
FROM maven:3.8.5-openjdk-17 AS build

# Set the working directory inside the container
WORKDIR /app

# Copy the pom.xml and the source code into the container
COPY pom.xml ./
COPY src ./src

# Build the JAR file
RUN mvn clean package -DskipTests

# Stage 2: Create the final image
FROM openjdk:17-alpine3.14

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the build stage
COPY --from=build /app/target/*.jar /app/student_application.jar

# Expose the port your application will run on
EXPOSE 9090

# Define the command to run the application
CMD ["java", "-jar", "student_application.jar"]
