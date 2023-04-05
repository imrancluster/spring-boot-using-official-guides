FROM maven:3.8.3-openjdk-17 AS MAVEN_BUILD

WORKDIR /usr/src/app

COPY . /usr/src/app

# Compile and package the application to an executable JAR
RUN mvn package 


FROM openjdk:latest

ARG JAR_FILE=spring_guides.jar

WORKDIR /opt/app

COPY --from=MAVEN_BUILD /usr/src/app/target/${JAR_FILE} /opt/app/

ENTRYPOINT ["java","-jar","spring_guides.jar"]