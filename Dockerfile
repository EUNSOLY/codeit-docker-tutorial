# 베이스 이미지 설정 (도커 컨테이너 실행을 위해 필요한 프로그램 집합 - 제일 기본)
FROM amazoncorretto:17-alpine

# build 실행 시 전달 할 수 있는 매개 변수 기본값 설정
ARG JAR_FILE=build/libs/*.jar

# JAR_FILE에 있는 파일을 app.jar로 도커 이미니 내에 갖고있겠다.
# 호스트 영역 내 파일 이미지를 생성하는 빌드 컨테이너 영역 내 파일
COPY ${JAR_FILE} app.jar

# 이미지가 컨테이너로 실행 될 때 실행될 명령어
ENTRYPOINT ["java", "-jar", "/app.jar"]

# 참고 ./gradlew clean build을 통해 호스트 영역에 파일을 만들어줘야지만 COPY가 정상적으로 실행