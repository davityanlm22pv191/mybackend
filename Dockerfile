# 1. Используем образ с Gradle для сборки проекта
FROM gradle:8.5-jdk21 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
# Собираем "толстый" JAR файл со всеми зависимостями
RUN ./gradlew buildFatJar --no-daemon

# 2. Используем легкий образ Java для запуска
FROM openjdk:21-slim
EXPOSE 8080
RUN mkdir /app
# Копируем собранный файл из первого шага во второй
COPY --from=build /home/gradle/src/build/libs/*-all.jar /app/server.jar
# Запускаем сервер
ENTRYPOINT ["java", "-jar", "/app/server.jar"]