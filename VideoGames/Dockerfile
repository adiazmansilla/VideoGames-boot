FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/VideoGames-0.0.1-SNAPSHOT.jar VideoGames-0.0.1-SNAPSHOT.jar
CMD [“java”,”-Djava.security.egd=file:/dev/./urandom”,”-jar”,”/VideoGames-0.0.1-SNAPSHOT.jar”]