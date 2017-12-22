# ReviewApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createReview**](ReviewApi.md#createReview) | **POST** /v1/products/{productId}/reviews | 새 리뷰를 등록합니다.
[**deleteReview**](ReviewApi.md#deleteReview) | **DELETE** /v1/products/{productId}/reviews/{reviewId} | 리뷰를 삭제합니다.
[**listReviews**](ReviewApi.md#listReviews) | **GET** /v1/products/{productId}/reviews | 상품에 대한 리뷰 목록을 조회합니다.
[**updateReview**](ReviewApi.md#updateReview) | **PUT** /v1/products/{productId}/reviews/{reviewId} | 리뷰를 수정합니다.


<a name="createReview"></a>
# **createReview**
> ReviewDto createReview(authorization, productId, body)

새 리뷰를 등록합니다.

### Example
```java
// Import classes:
//import kr.appkr.swagger_poc_api.ApiException;
//import kr.appkr.swagger_poc_api.service.ReviewApi;


ReviewApi apiInstance = new ReviewApi();
String authorization = "Bearer "; // String | 액세스 토큰
Long productId = 789L; // Long | 
NewReviewRequest body = new NewReviewRequest(); // NewReviewRequest | 
try {
    ReviewDto result = apiInstance.createReview(authorization, productId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReviewApi#createReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| 액세스 토큰 | [default to Bearer ]
 **productId** | **Long**|  |
 **body** | [**NewReviewRequest**](NewReviewRequest.md)|  |

### Return type

[**ReviewDto**](ReviewDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="deleteReview"></a>
# **deleteReview**
> deleteReview(authorization, productId, reviewId)

리뷰를 삭제합니다.

### Example
```java
// Import classes:
//import kr.appkr.swagger_poc_api.ApiException;
//import kr.appkr.swagger_poc_api.service.ReviewApi;


ReviewApi apiInstance = new ReviewApi();
String authorization = "Bearer "; // String | 액세스 토큰
Long productId = 789L; // Long | 
Long reviewId = 789L; // Long | 
try {
    apiInstance.deleteReview(authorization, productId, reviewId);
} catch (ApiException e) {
    System.err.println("Exception when calling ReviewApi#deleteReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| 액세스 토큰 | [default to Bearer ]
 **productId** | **Long**|  |
 **reviewId** | **Long**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="listReviews"></a>
# **listReviews**
> ReviewListResponse listReviews(authorization, productId, q, userId, sortKey, sortDirection, page, size)

상품에 대한 리뷰 목록을 조회합니다.

### Example
```java
// Import classes:
//import kr.appkr.swagger_poc_api.ApiException;
//import kr.appkr.swagger_poc_api.service.ReviewApi;


ReviewApi apiInstance = new ReviewApi();
String authorization = "Bearer "; // String | 액세스 토큰
Long productId = 789L; // Long | 
String q = "q_example"; // String | 검색어
Long userId = 789L; // Long | 작성자 ID
String sortKey = "CREATED_AT"; // String | 정렬 필드
String sortDirection = "DESC"; // String | 정렬 방향
Integer page = 1; // Integer | 페이지
Integer size = 10; // Integer | 페이지당 표시할 아이템 개수
try {
    ReviewListResponse result = apiInstance.listReviews(authorization, productId, q, userId, sortKey, sortDirection, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReviewApi#listReviews");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| 액세스 토큰 | [default to Bearer ]
 **productId** | **Long**|  |
 **q** | **String**| 검색어 | [optional]
 **userId** | **Long**| 작성자 ID | [optional]
 **sortKey** | **String**| 정렬 필드 | [optional] [default to CREATED_AT] [enum: CREATED_AT]
 **sortDirection** | **String**| 정렬 방향 | [optional] [default to DESC] [enum: ASC, DESC]
 **page** | **Integer**| 페이지 | [optional] [default to 1]
 **size** | **Integer**| 페이지당 표시할 아이템 개수 | [optional] [default to 10]

### Return type

[**ReviewListResponse**](ReviewListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateReview"></a>
# **updateReview**
> ReviewDto updateReview(authorization, productId, reviewId, body)

리뷰를 수정합니다.

### Example
```java
// Import classes:
//import kr.appkr.swagger_poc_api.ApiException;
//import kr.appkr.swagger_poc_api.service.ReviewApi;


ReviewApi apiInstance = new ReviewApi();
String authorization = "Bearer "; // String | 액세스 토큰
Long productId = 789L; // Long | 
Long reviewId = 789L; // Long | 
NewReviewRequest body = new NewReviewRequest(); // NewReviewRequest | 
try {
    ReviewDto result = apiInstance.updateReview(authorization, productId, reviewId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReviewApi#updateReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| 액세스 토큰 | [default to Bearer ]
 **productId** | **Long**|  |
 **reviewId** | **Long**|  |
 **body** | [**NewReviewRequest**](NewReviewRequest.md)|  | [optional]

### Return type

[**ReviewDto**](ReviewDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

