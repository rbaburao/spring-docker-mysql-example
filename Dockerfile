FROM openjdk:8
ADD ./target/docker-mysql.jar docker-mysql.jar
EXPOSE 8090
ENTRYPOINT ["java","-jar","docker-mysql.jar"]