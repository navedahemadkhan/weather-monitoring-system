# Use the official OpenJDK image as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy only the relevant files into the container
COPY src/main/java/weather/ /app

# Compile the Java program
RUN javac main.java

# Run the compiled Java program
CMD ["java", "main"]
