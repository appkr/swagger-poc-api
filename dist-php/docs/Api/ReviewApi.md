# Appkr\SwaggerPocApi\ReviewApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createReview**](ReviewApi.md#createReview) | **POST** /v1/products/{productId}/reviews | 새 리뷰를 등록합니다.
[**deleteReview**](ReviewApi.md#deleteReview) | **DELETE** /v1/products/{productId}/reviews/{reviewId} | 리뷰를 삭제합니다.
[**listReviews**](ReviewApi.md#listReviews) | **GET** /v1/products/{productId}/reviews | 상품에 대한 리뷰 목록을 조회합니다.
[**updateReview**](ReviewApi.md#updateReview) | **PUT** /v1/products/{productId}/reviews/{reviewId} | 리뷰를 수정합니다.


# **createReview**
> \Appkr\SwaggerPocApi\Model\ReviewDto createReview($authorization, $productId, $body)

새 리뷰를 등록합니다.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Appkr\SwaggerPocApi\Api\ReviewApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$authorization = "Bearer"; // string | 액세스 토큰
$productId = 789; // int | 
$body = new \Appkr\SwaggerPocApi\Model\NewReviewRequest(); // \Appkr\SwaggerPocApi\Model\NewReviewRequest | 

try {
    $result = $apiInstance->createReview($authorization, $productId, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ReviewApi->createReview: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| 액세스 토큰 | [default to Bearer ]
 **productId** | **int**|  |
 **body** | [**\Appkr\SwaggerPocApi\Model\NewReviewRequest**](../Model/NewReviewRequest.md)|  |

### Return type

[**\Appkr\SwaggerPocApi\Model\ReviewDto**](../Model/ReviewDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **deleteReview**
> deleteReview($authorization, $productId, $reviewId)

리뷰를 삭제합니다.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Appkr\SwaggerPocApi\Api\ReviewApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$authorization = "Bearer"; // string | 액세스 토큰
$productId = 789; // int | 
$reviewId = 789; // int | 

try {
    $apiInstance->deleteReview($authorization, $productId, $reviewId);
} catch (Exception $e) {
    echo 'Exception when calling ReviewApi->deleteReview: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| 액세스 토큰 | [default to Bearer ]
 **productId** | **int**|  |
 **reviewId** | **int**|  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **listReviews**
> \Appkr\SwaggerPocApi\Model\ReviewListResponse listReviews($authorization, $productId, $q, $userId, $sortKey, $sortDirection, $page, $size)

상품에 대한 리뷰 목록을 조회합니다.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Appkr\SwaggerPocApi\Api\ReviewApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$authorization = "Bearer"; // string | 액세스 토큰
$productId = 789; // int | 
$q = "q_example"; // string | 검색어
$userId = 789; // int | 작성자 ID
$sortKey = "CREATED_AT"; // string | 정렬 필드
$sortDirection = "DESC"; // string | 정렬 방향
$page = 1; // int | 페이지
$size = 10; // int | 페이지당 표시할 아이템 개수

try {
    $result = $apiInstance->listReviews($authorization, $productId, $q, $userId, $sortKey, $sortDirection, $page, $size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ReviewApi->listReviews: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| 액세스 토큰 | [default to Bearer ]
 **productId** | **int**|  |
 **q** | **string**| 검색어 | [optional]
 **userId** | **int**| 작성자 ID | [optional]
 **sortKey** | **string**| 정렬 필드 | [optional] [default to CREATED_AT]
 **sortDirection** | **string**| 정렬 방향 | [optional] [default to DESC]
 **page** | **int**| 페이지 | [optional] [default to 1]
 **size** | **int**| 페이지당 표시할 아이템 개수 | [optional] [default to 10]

### Return type

[**\Appkr\SwaggerPocApi\Model\ReviewListResponse**](../Model/ReviewListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateReview**
> \Appkr\SwaggerPocApi\Model\ReviewDto updateReview($authorization, $productId, $reviewId, $body)

리뷰를 수정합니다.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Appkr\SwaggerPocApi\Api\ReviewApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$authorization = "Bearer"; // string | 액세스 토큰
$productId = 789; // int | 
$reviewId = 789; // int | 
$body = new \Appkr\SwaggerPocApi\Model\NewReviewRequest(); // \Appkr\SwaggerPocApi\Model\NewReviewRequest | 

try {
    $result = $apiInstance->updateReview($authorization, $productId, $reviewId, $body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ReviewApi->updateReview: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| 액세스 토큰 | [default to Bearer ]
 **productId** | **int**|  |
 **reviewId** | **int**|  |
 **body** | [**\Appkr\SwaggerPocApi\Model\NewReviewRequest**](../Model/NewReviewRequest.md)|  | [optional]

### Return type

[**\Appkr\SwaggerPocApi\Model\ReviewDto**](../Model/ReviewDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

