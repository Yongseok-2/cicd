# 1. 베이스 이미지를 Java 21 (Eclipse Temurin)으로 변경
# (OpenJDK 공식 이미지인 openjdk:21-jdk를 사용해도 됩니다)
FROM eclipse-temurin:21-jdk

ARG VERSION

# 2. JAR 파일 경로는 Java 21로 빌드한 파일 경로와 일치해야 합니다.
COPY build/libs/docker-0.0.1-SNAPSHOT.jar /app/guestbook.jar

LABEL maintainer="LYS<8465867@naver.com>" \
      title="Guestbook App" \
      version="$VERSION" \
      description="This image is guestbook service"

ENV APP_HOME /app

# 3. Spring Boot 기본 포트인 8080을 노출
EXPOSE 8080

VOLUME /app/upload

WORKDIR $APP_HOME

ENTRYPOINT ["java"]
CMD ["-jar", "guestbook.jar"]