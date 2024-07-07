FROM openjdk:17-jdk-slim

RUN apt-get update && apt-get install -y curl

WORKDIR /app
COPY build/libs/app-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]
