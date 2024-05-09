FROM openjdk:8
EXPOSE 8080
ADD target/Jenkins-War.jar Jenkins-War.jar
ENTRYPOINT ["java","-jar","/Jenkins-War.jar"]