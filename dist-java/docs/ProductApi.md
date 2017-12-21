# ProductApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProduct**](ProductApi.md#createProduct) | **POST** /v1/products | 새 상품을 등록합니다.
[**deleteProduct**](ProductApi.md#deleteProduct) | **DELETE** /v1/products/{productId} | 상품을 삭제합니다.
[**listProducts**](ProductApi.md#listProducts) | **GET** /v1/products | 상품 목록을 조회합니다.
[**updateProduct**](ProductApi.md#updateProduct) | **PUT** /v1/products/{productId} | 상품을 수정합니다 (ON PURPOSE 10 SEC DELAY TO TEST PESSIMISTIC/OPTIMISTIC DB LOCK).


<a name="createProduct"></a>
# **createProduct**
> ProductDto createProduct(authorization, body)

새 상품을 등록합니다.

### Example
```java
// Import classes:
//import kr.appkr.swagger_poc_api.ApiException;
//import kr.appkr.swagger_poc_api.service.ProductApi;


ProductApi apiInstance = new ProductApi();
String authorization = "Bearer "; // String | 액세스 토큰
NewProductRequest body = new NewProductRequest(); // NewProductRequest | 
try {
    ProductDto result = apiInstance.createProduct(authorization, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#createProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| 액세스 토큰 | [default to Bearer ]
 **body** | [**NewProductRequest**](NewProductRequest.md)|  |

### Return type

[**ProductDto**](ProductDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="deleteProduct"></a>
# **deleteProduct**
> deleteProduct(authorization, productId)

상품을 삭제합니다.

### Example
```java
// Import classes:
//import kr.appkr.swagger_poc_api.ApiException;
//import kr.appkr.swagger_poc_api.service.ProductApi;


ProductApi apiInstance = new ProductApi();
String authorization = "Bearer "; // String | 액세스 토큰
Long productId = 789L; // Long | 
try {
    apiInstance.deleteProduct(authorization, productId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#deleteProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| 액세스 토큰 | [default to Bearer ]
 **productId** | **Long**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="listProducts"></a>
# **listProducts**
> ProductListResponse listProducts(authorization, q, priceFrom, priceTo, sortKey, sortDirection, page, size)

상품 목록을 조회합니다.

### Example
```java
// Import classes:
//import kr.appkr.swagger_poc_api.ApiException;
//import kr.appkr.swagger_poc_api.service.ProductApi;


ProductApi apiInstance = new ProductApi();
String authorization = "Bearer "; // String | 액세스 토큰
String q = "q_example"; // String | 검색어
Long priceFrom = 789L; // Long | 최소 가격
Long priceTo = 789L; // Long | 최대 가격
String sortKey = "CREATED_AT"; // String | 정렬 필드
String sortDirection = "DESC"; // String | 정렬 방향
Integer page = 1; // Integer | 페이지
Integer size = 10; // Integer | 페이지당 표시할 아이템 개수
try {
    ProductListResponse result = apiInstance.listProducts(authorization, q, priceFrom, priceTo, sortKey, sortDirection, page, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#listProducts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| 액세스 토큰 | [default to Bearer ]
 **q** | **String**| 검색어 | [optional]
 **priceFrom** | **Long**| 최소 가격 | [optional]
 **priceTo** | **Long**| 최대 가격 | [optional]
 **sortKey** | **String**| 정렬 필드 | [optional] [default to CREATED_AT] [enum: CREATED_AT, PRICE, STOCK]
 **sortDirection** | **String**| 정렬 방향 | [optional] [default to DESC] [enum: ASC, DESC]
 **page** | **Integer**| 페이지 | [optional] [default to 1]
 **size** | **Integer**| 페이지당 표시할 아이템 개수 | [optional] [default to 10]

### Return type

[**ProductListResponse**](ProductListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProduct"></a>
# **updateProduct**
> ProductDto updateProduct(authorization, productId, body)

상품을 수정합니다 (ON PURPOSE 10 SEC DELAY TO TEST PESSIMISTIC/OPTIMISTIC DB LOCK).

### Example
```java
// Import classes:
//import kr.appkr.swagger_poc_api.ApiException;
//import kr.appkr.swagger_poc_api.service.ProductApi;


ProductApi apiInstance = new ProductApi();
String authorization = "Bearer "; // String | 액세스 토큰
Long productId = 789L; // Long | 
NewProductRequest body = new NewProductRequest(); // NewProductRequest | 
try {
    ProductDto result = apiInstance.updateProduct(authorization, productId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductApi#updateProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| 액세스 토큰 | [default to Bearer ]
 **productId** | **Long**|  |
 **body** | [**NewProductRequest**](NewProductRequest.md)|  | [optional]

### Return type

[**ProductDto**](ProductDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

