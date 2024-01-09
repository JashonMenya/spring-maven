# Builder stage with Maven and JDK 17
FROM maven:3.8.1-openjdk-17 as BUILDER
WORKDIR /build/
COPY pom.xml /build/
COPY src /build/src/
RUN mvn clean package

# Final stage
FROM openjdk:17-jdk-slim
WORKDIR /app/
COPY --from=BUILDER /build/target/repositories-0.0.2-SNAPSHOT.jar /app/application.jar
CMD java -jar /app/application.jar
