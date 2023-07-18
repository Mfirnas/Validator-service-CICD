FROM openjdk:11

EXPOSE 9081
ADD target/validate-service-k8s.jar validate-service-k8s.jar
ENTRYPOINT ["java","-jar","/validate-service-k8s.jar"]