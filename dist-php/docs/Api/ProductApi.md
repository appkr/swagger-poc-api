# Appkr\SwaggerPocApi\ProductApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProduct**](ProductApi.md#createProduct) | **POST** /v1/products | 새 상품을 등록합니다.
[**deleteProduct**](ProductApi.md#deleteProduct) | **DELETE** /v1/products/{productId} | 상품을 삭제합니다.
[**listProducts**](ProductApi.md#listProducts) | **GET** /v1/products | 상품 목록을 조회합니다.
[**updateProduct**](ProductApi.md#updateProduct) | **PUT** /v1/products/{productId} | 상품을 수정합니다 (ON PURPOSE 10 SEC DELAY TO TEST PESSIMISTIC/OPTIMISTIC DB LOCK).


# **createProduct**
> \Appkr\SwaggerPocApi\Model\ProductDto createProduct($authorization, $body)

새 상품을 등록합니다.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Appkr\SwaggerPocApi\Api\ProductApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$authorization = "Bearer"; // string | 액세스 토큰
$body = new \Appkr\SwaggerPocApi\Model\NewProductRequest(); // \Appkr\SwaggerPocApi\Model\NewProductRequest | 

try {
    $result = $apiInstance->createProduct($authorization, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProductApi->createProduct: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| 액세스 토큰 | [default to Bearer ]
 **body** | [**\Appkr\SwaggerPocApi\Model\NewProductRequest**](../Model/NewProductRequest.md)|  |

### Return type

[**\Appkr\SwaggerPocApi\Model\ProductDto**](../Model/ProductDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteProduct**
> deleteProduct($authorization, $productId)

상품을 삭제합니다.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Appkr\SwaggerPocApi\Api\ProductApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$authorization = "Bearer"; // string | 액세스 토큰
$productId = 789; // int | 

try {
    $apiInstance->deleteProduct($authorization, $productId);
} catch (Exception $e) {
    echo 'Exception when calling ProductApi->deleteProduct: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| 액세스 토큰 | [default to Bearer ]
 **productId** | **int**|  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **listProducts**
> \Appkr\SwaggerPocApi\Model\ProductListResponse listProducts($authorization, $q, $priceFrom, $priceTo, $sortKey, $sortDirection, $page, $size)

상품 목록을 조회합니다.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Appkr\SwaggerPocApi\Api\ProductApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$authorization = "Bearer"; // string | 액세스 토큰
$q = "q_example"; // string | 검색어
$priceFrom = 789; // int | 최소 가격
$priceTo = 789; // int | 최대 가격
$sortKey = "CREATED_AT"; // string | 정렬 필드
$sortDirection = "DESC"; // string | 정렬 방향
$page = 1; // int | 페이지
$size = 10; // int | 페이지당 표시할 아이템 개수

try {
    $result = $apiInstance->listProducts($authorization, $q, $priceFrom, $priceTo, $sortKey, $sortDirection, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProductApi->listProducts: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| 액세스 토큰 | [default to Bearer ]
 **q** | **string**| 검색어 | [optional]
 **priceFrom** | **int**| 최소 가격 | [optional]
 **priceTo** | **int**| 최대 가격 | [optional]
 **sortKey** | **string**| 정렬 필드 | [optional] [default to CREATED_AT]
 **sortDirection** | **string**| 정렬 방향 | [optional] [default to DESC]
 **page** | **int**| 페이지 | [optional] [default to 1]
 **size** | **int**| 페이지당 표시할 아이템 개수 | [optional] [default to 10]

### Return type

[**\Appkr\SwaggerPocApi\Model\ProductListResponse**](../Model/ProductListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateProduct**
> \Appkr\SwaggerPocApi\Model\ProductDto updateProduct($authorization, $productId, $body)

상품을 수정합니다 (ON PURPOSE 10 SEC DELAY TO TEST PESSIMISTIC/OPTIMISTIC DB LOCK).

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Appkr\SwaggerPocApi\Api\ProductApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$authorization = "Bearer"; // string | 액세스 토큰
$productId = 789; // int | 
$body = new \Appkr\SwaggerPocApi\Model\NewProductRequest(); // \Appkr\SwaggerPocApi\Model\NewProductRequest | 

try {
    $result = $apiInstance->updateProduct($authorization, $productId, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ProductApi->updateProduct: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| 액세스 토큰 | [default to Bearer ]
 **productId** | **int**|  |
 **body** | [**\Appkr\SwaggerPocApi\Model\NewProductRequest**](../Model/NewProductRequest.md)|  | [optional]

### Return type

[**\Appkr\SwaggerPocApi\Model\ProductDto**](../Model/ProductDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

