# SWAGGER-POC-API

이 프로젝트는 아래에 나열한 API 서버 프로젝트에서 생산한 Swagger Spec으로 만든 플랫폼별 클라이언트 라이브러리를 담고 있습니다.

- API 서버 프로젝트(Laravel+Swagger): https://github.com/appkr/db-lock-poc
- PHP API 클라이언트 예제 프로젝트: https://github.com/appkr/swagger-api-client-poc

## 클라이언트 라이브러리 만들기

Swagger Codegen 바이너리를 설치합니다.

```bash
~ $ brew install swagger-codegen --HEAD
~ $ /usr/local/bin/swagger-codegen version
2.3.0-SNAPSHOT
```

PHP 클라이언트 라이브러리를 생성합니다. Swagger Spec은 http://localhost/docs/swagger.json 위치에 있다고 가정하겠습니다. 다른 클라이언트 플랫폼을 위한 레시피는 [Makefile](Makefile)을 참고해주세요.

```bash
~/swagger-poc-api $ /usr/local/bin/swagger-codegen generate \
    --lang php \
    --input-spec http://localhost/docs/swagger.json \
    --config ./config-php.json \
    --output ./dist-php

# Publish
~/swagger-poc-api $ git subtree push --prefix dist-php origin dist-php
```

PHP 클라이언트 프로젝트에서 위에서 생성/배포한 라이브러리를 vendor로 가져와서 사용합니다.

```bash
~/client-project $ composer require "appkr/swagger-poc-api:dev-dist-php"
```

## Sponsor

[Jetbrains](https://www.jetbrains.com/) 사에서 IntelliJ IDE를 제공해주셨습니다.

![](https://github.com/appkr/db-lock-poc/raw/master/intellij_logo.png)