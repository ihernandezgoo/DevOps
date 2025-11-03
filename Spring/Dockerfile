## Multi-stage Dockerfile for building and running the Spring Boot application
# Build stage: use Maven to compile and package the application
FROM maven:3.9.5-eclipse-temurin-17 as build

WORKDIR /workspace

# Copy pom and download dependencies first (leverages Docker layer cache)
COPY pom.xml ./
RUN mvn -B -f pom.xml dependency:go-offline

# Copy source and build
COPY src ./src
RUN mvn -B -f pom.xml package -DskipTests

# Runtime stage: use a slim JRE image
FROM eclipse-temurin:17-jre-jammy

WORKDIR /app

# Copy the packaged jar from the build stage. Adjust the jar name pattern if different.
COPY --from=build /workspace/target/*.jar app.jar

# Expose default Spring Boot port
EXPOSE 8080

ENTRYPOINT ["java","-jar","/app/app.jar"]
