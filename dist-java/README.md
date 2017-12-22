# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import kr.appkr.swagger_poc_api.*;
import kr.appkr.swagger_poc_api.auth.*;
import kr.appkr.swagger_poc_api.model.*;
import kr.appkr.swagger_poc_api.service.AuthApi;

import java.io.File;
import java.util.*;

public class AuthApiExample {

    public static void main(String[] args) {
        
        AuthApi apiInstance = new AuthApi();
        LoginRequest body = new LoginRequest(); // LoginRequest | 
        try {
            AccessToken result = apiInstance.login(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#login");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthApi* | [**login**](docs/AuthApi.md#login) | **POST** /auth/login | 로그인합니다.
*AuthApi* | [**logout**](docs/AuthApi.md#logout) | **POST** /auth/logout | 로그아웃합니다.
*AuthApi* | [**me**](docs/AuthApi.md#me) | **POST** /auth/me | 프로필 정보를 확인합니다.
*AuthApi* | [**refreshToken**](docs/AuthApi.md#refreshToken) | **POST** /auth/refresh | 로그인합니다.
*ProductApi* | [**createProduct**](docs/ProductApi.md#createProduct) | **POST** /v1/products | 새 상품을 등록합니다.
*ProductApi* | [**deleteProduct**](docs/ProductApi.md#deleteProduct) | **DELETE** /v1/products/{productId} | 상품을 삭제합니다.
*ProductApi* | [**listProducts**](docs/ProductApi.md#listProducts) | **GET** /v1/products | 상품 목록을 조회합니다.
*ProductApi* | [**updateProduct**](docs/ProductApi.md#updateProduct) | **PUT** /v1/products/{productId} | 상품을 수정합니다.
*ReviewApi* | [**createReview**](docs/ReviewApi.md#createReview) | **POST** /v1/products/{productId}/reviews | 새 리뷰를 등록합니다.
*ReviewApi* | [**deleteReview**](docs/ReviewApi.md#deleteReview) | **DELETE** /v1/products/{productId}/reviews/{reviewId} | 리뷰를 삭제합니다.
*ReviewApi* | [**listReviews**](docs/ReviewApi.md#listReviews) | **GET** /v1/products/{productId}/reviews | 상품에 대한 리뷰 목록을 조회합니다.
*ReviewApi* | [**updateReview**](docs/ReviewApi.md#updateReview) | **PUT** /v1/products/{productId}/reviews/{reviewId} | 리뷰를 수정합니다.


## Documentation for Models

 - [AccessToken](docs/AccessToken.md)
 - [ErrorDto](docs/ErrorDto.md)
 - [LoginRequest](docs/LoginRequest.md)
 - [Meta](docs/Meta.md)
 - [NewProductRequest](docs/NewProductRequest.md)
 - [NewReviewRequest](docs/NewReviewRequest.md)
 - [Paginator](docs/Paginator.md)
 - [PaginatorLink](docs/PaginatorLink.md)
 - [ProductListResponse](docs/ProductListResponse.md)
 - [ReviewListResponse](docs/ReviewListResponse.md)
 - [NewUserRequest](docs/NewUserRequest.md)
 - [ProductDto](docs/ProductDto.md)
 - [ReviewDto](docs/ReviewDto.md)
 - [UserDto](docs/UserDto.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### JWT

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

juwonkim@me.com

