FROM java:8u111-jdk
COPY target/*.war /usr/src/myapp/app.war
WORKDIR /usr/src/myapp
EXPOSE 8000
CMD ["java", "-jar", "app.war"]