FROM openjdk:11
WORKDIR /app
COPY target/*.jar /app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "achat.jar"]
