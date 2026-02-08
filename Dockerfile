# 1. Используем образ с Gradle для сборки проекта
FROM gradle:8.5-jdk21 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
# Собираем "толстый" JAR файл
RUN ./gradlew buildFatJar --no-daemon

# 2. Используем современный и легкий образ Java для запуска (Amazon Corretto)
FROM amazoncorretto:21-al2023-headless
EXPOSE 8080
RUN mkdir /app
# Копируем собранный файл
COPY --from=build /home/gradle/src/build/libs/*-all.jar /app/server.jar
# Запускаем сервер
ENTRYPOINT ["java", "-jar", "/app/server.jar"]