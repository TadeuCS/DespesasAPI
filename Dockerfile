FROM openjdk:8-jdk-alpine
ENV MARIADB_URI=jdbc:mariadb://MariaDB:3306/imc
ARG JAR_FILE=target/*.war
COPY ${JAR_FILE} despesas-api.war
ENTRYPOINT ["java","-jar","despesas-api.war"]