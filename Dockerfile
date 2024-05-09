FROM openjdk:8
EXPOSE 8080
ADD target/jenkins-war.jar jenkins-war.jar
ENTRYPOINT ["java","-jar","/jenkins-war.jar"]