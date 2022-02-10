FROM openjdk:latest
COPY ./target/Set08103-G11-0.1.0.2-jar-with-dependencies.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "Set08103-G11-0.1.0.2-jar-with-dependencies.jar"]