# Appkr\SwaggerPocApi\AuthApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**login**](AuthApi.md#login) | **POST** /auth/login | 로그인합니다.
[**logout**](AuthApi.md#logout) | **POST** /auth/logout | 로그아웃합니다.
[**me**](AuthApi.md#me) | **POST** /auth/me | 프로필 정보를 확인합니다.
[**refreshToken**](AuthApi.md#refreshToken) | **POST** /auth/refresh | 로그인합니다.


# **login**
> \Appkr\SwaggerPocApi\Model\AccessToken login($body)

로그인합니다.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Appkr\SwaggerPocApi\Api\AuthApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$body = new \Appkr\SwaggerPocApi\Model\LoginRequest(); // \Appkr\SwaggerPocApi\Model\LoginRequest | 

try {
    $result = $apiInstance->login($body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuthApi->login: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**\Appkr\SwaggerPocApi\Model\LoginRequest**](../Model/LoginRequest.md)|  |

### Return type

[**\Appkr\SwaggerPocApi\Model\AccessToken**](../Model/AccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **logout**
> logout($authorization)

로그아웃합니다.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Appkr\SwaggerPocApi\Api\AuthApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$authorization = "Bearer"; // string | 액세스 토큰

try {
    $apiInstance->logout($authorization);
} catch (Exception $e) {
    echo 'Exception when calling AuthApi->logout: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| 액세스 토큰 | [default to Bearer ]

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **me**
> \Appkr\SwaggerPocApi\Model\UserDto me($authorization)

프로필 정보를 확인합니다.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Appkr\SwaggerPocApi\Api\AuthApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$authorization = "Bearer"; // string | 액세스 토큰

try {
    $result = $apiInstance->me($authorization);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuthApi->me: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| 액세스 토큰 | [default to Bearer ]

### Return type

[**\Appkr\SwaggerPocApi\Model\UserDto**](../Model/UserDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **refreshToken**
> \Appkr\SwaggerPocApi\Model\AccessToken refreshToken($authorization)

로그인합니다.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Appkr\SwaggerPocApi\Api\AuthApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$authorization = "Bearer"; // string | 액세스 토큰

try {
    $result = $apiInstance->refreshToken($authorization);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuthApi->refreshToken: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| 액세스 토큰 | [default to Bearer ]

### Return type

[**\Appkr\SwaggerPocApi\Model\AccessToken**](../Model/AccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

