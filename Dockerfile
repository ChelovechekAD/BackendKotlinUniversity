FROM gradle:8.10.2-jdk17 AS builder
WORKDIR /app
COPY . /app
RUN gradle bootJar

FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=builder /app/build/libs/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
