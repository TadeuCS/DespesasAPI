TAG="1.0.0"

build:
	docker build -t despesa-api .

login:
	docker login

tag: login
	docker tag despesa-api tadeucs/despesa-api:$(TAG)

push: tag
	docker push tadeucs/despesa-api:$(TAG)