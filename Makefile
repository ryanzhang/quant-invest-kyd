.ONESHELL:
SHELL = /bin/bash

.PHONY: help
help:             ## Show the help.
	@echo "Usage: make <target>"
	@echo ""
	@echo "Targets:"
	@fgrep "##" Makefile | fgrep -v fgrep


.PHONY: show
show:             ## Show the current environment.
	@echo "Current environment:"
	@if [ "$(USING_POETRY)" ]; then poetry env info && exit; fi
	@echo "Running using $(ENV_PREFIX)"
	@$(ENV_PREFIX)python -V
	@$(ENV_PREFIX)python -m site

.PHONY: fmt
fmt:              ## Format code using black & isort.
	mvn formatter:format

.PHONY: lint
lint:             ## Run pep8, black, mypy linters.
	$(ENV_PREFIX)flake8 kupy/
	$(ENV_PREFIX)black -l 79 --check kupy/
	$(ENV_PREFIX)black -l 79 --check tests/
	$(ENV_PREFIX)mypy --ignore-missing-imports kupy/

.PHONY: dev
dev:              ## Format code using black & isort.
	mvn clean package
	java -jar target/quarkus-app/quarkus-run.jar

stage:              ## Format code using black & isort.
	mvn clean package -Dquarkus.kubernetes.deploy=true -DskipTests
