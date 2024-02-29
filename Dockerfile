FROM openjdk:17-oracle
EXPOSE 8080
ADD target/docker-jenkins-test-project.jar docker-jenkins-test-project.jar
ENTRYPOINT ["java","-jar","docker-jenkins-test-project.jar"]