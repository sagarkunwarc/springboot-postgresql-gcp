FROM maven:3.9.2-eclipse-temurin-17 as builder

# Copy local code to the container image.
WORKDIR /app
COPY pom.xml .
COPY src ./src

# Build a release artifact.
RUN mvn package -DskipTests

# Use Eclipse Temurin for base image.
FROM eclipse-temurin:17-jre-jammy

# Copy the jar to the production image from the builder stage.
COPY --from=builder /app/target/motorvehiclereport-0.0.1-SNAPSHOT.jar motorvehiclereport.jar


# Run the web service on container startup.
CMD ["java", "-jar", "/motorvehiclereport.jar"]