FROM openjdk:11
EXPOSE 8080
COPY target/*.jar application.jar
ENTRYPOINT ["java","-jar","application.jar"]
