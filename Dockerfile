FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/testDevopsEureka-1.0-SNAPSHOT.jar
COPY ${JAR_FILE} testDevopsEureka-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/testDevopsEureka-1.0-SNAPSHOT.jar"]