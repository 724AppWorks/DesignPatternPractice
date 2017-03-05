FROM java:8u111-jdk
COPY target/*.jar /usr/src/myapp/app.jar
WORKDIR /usr/src/myapp
EXPOSE 8000
CMD ["java", "-jar", "app.jar"]