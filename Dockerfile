FROM openjdk:11
COPY ./target/codereview-0.1.0.2-jar-with-dependencies.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "codereview-0.1.0.2-jar-with-dependencies.jar"]