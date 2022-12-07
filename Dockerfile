FROM openjdk:11
ADD target/clientone.jar clientone.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","clientone.jar"]