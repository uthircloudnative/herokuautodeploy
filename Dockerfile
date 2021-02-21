# Multi-stage Build

# Stage 1: Build .jar
FROM openjdk:11.0-jdk-slim as builder
VOLUME /tmp
COPY . .
RUN ./gradlew build

# Stage 2: Run JRE for the .jar
FROM openjdk:11.0-jre-slim
WORKDIR /app
COPY --from=builder build/libs/*.jar app.jar

# PORT binding is required as this app is deployed in Heroku
CMD [ "sh", "-c", "java -Xmx300m -Xss512k -Dserver.port=$PORT -jar /app/app.jar" ]
EXPOSE 8081