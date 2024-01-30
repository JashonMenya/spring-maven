# Use ARG to specify a build argument for the project version
ARG PROJECT_VERSION=0.0.4-SNAPSHOT

# Builder stage with Maven and JDK 17
FROM maven:3.8.1-openjdk-17 as BUILDER
WORKDIR /build/
COPY pom.xml /build/
COPY src /build/src/
RUN mvn clean package -Dproject.version=${PROJECT_VERSION}

# Final stage
FROM openjdk:17-jdk-slim
WORKDIR /app/
# Use the same build argument here to specify the version
ARG PROJECT_VERSION
COPY --from=BUILDER /build/target/ioc-${PROJECT_VERSION}.jar /app/application.jar
CMD java -jar /app/application.jar
EXPOSE 8080



# use this if you want to pass in the version duing docker build command
# docker build --build-arg PROJECT_VERSION=1.0.0 -t my-app-image:1.0.0 .
# otherwise docker build -t ioc .
# to include tag docker build -t ioc:003-SNAPSHOT .
# to run a container from image docker run -d ioc:003-SNAPSHOT
# exposing a port docker run -d -p 8080:8080 ioc:003-SNAPSHOT