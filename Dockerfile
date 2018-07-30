from java:8
expose 8080
add /target/app1-1.0-SNAPSHOT.jar /opt/app1-1.0-SNAPSHOT.jar.jar
workdir /opt
entrypoint ["java","-jar","app1-1.0-SNAPSHOT.jar.jar"]