FROM eclipse-temurin:21-jdk-alpine
EXPOSE 8080
ADD target/practicacicd.jar practicacicd-new.jar
ENTRYPOINT ["java", "-jar", "practicacicd-new.jar"]