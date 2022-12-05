FROM openjdk:8-jdk-alpine
MAINTAINER xbakhromjon.com
RUN addgroup -S mygroup && adduser -S myuser -G mygroup
USER myuser:mygroup
ARG JAR_FILE=target/SpringBootProdApplication.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
EXPOSE 5000