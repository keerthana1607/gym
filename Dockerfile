FROM openjdk:18
WORKDIR /app
COPY ./target/Gym-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
CMD ["java", "-jar", "Gym-0.0.1-SNAPSHOT.jar"]
