FROM openjdk
WORKDIR /usr/src/myapp
ENV PORT 8081
EXPOSE 8081
COPY . /usr/src/myapp
CMD ["java", "-jar", "swatiidevops-0.0.1-SNAPSHOT.jar"]

