@REM MAVEN
call "./mvnw.cmd" clean -f "pom.xml"
call "./mvnw.cmd" package -f "pom.xml"

@REM DOCKER
call docker-compose down --rmi all --remove-orphans
call docker-compose up -d