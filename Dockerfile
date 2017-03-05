FROM java:8u111-jdk
COPY  /usr/src/myapp
WORKDIR /usr/src/myapp
EXPOSE 8000
CMD ["java", "-jar", "springbootsample-0.0.1-SNAPSHOT.war"]