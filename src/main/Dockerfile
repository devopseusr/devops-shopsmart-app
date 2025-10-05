FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/shopsmart-1.0.0.jar shopsmart.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "shopsmart.jar"]
