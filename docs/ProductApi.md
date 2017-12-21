# DbLockPoc.ProductApi

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
```javascript
import DbLockPoc from 'db_lock_poc';

let apiInstance = new DbLockPoc.ProductApi();

let authorization = "Bearer "; // String | 액세스 토큰

let body = new DbLockPoc.NewProductRequest(); // NewProductRequest | 


apiInstance.createProduct(authorization, body, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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
```javascript
import DbLockPoc from 'db_lock_poc';

let apiInstance = new DbLockPoc.ProductApi();

let authorization = "Bearer "; // String | 액세스 토큰

let productId = 789; // Number | 


apiInstance.deleteProduct(authorization, productId, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| 액세스 토큰 | [default to Bearer ]
 **productId** | **Number**|  | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="listProducts"></a>
# **listProducts**
> ProductListResponse listProducts(authorization, opts)

상품 목록을 조회합니다.

### Example
```javascript
import DbLockPoc from 'db_lock_poc';

let apiInstance = new DbLockPoc.ProductApi();

let authorization = "Bearer "; // String | 액세스 토큰

let opts = { 
  'q': "q_example", // String | 검색어
  'priceFrom': 789, // Number | 최소 가격
  'priceTo': 789, // Number | 최대 가격
  'sortKey': "CREATED_AT", // String | 정렬 필드
  'sortDirection': "DESC", // String | 정렬 방향
  'page': 1, // Number | 페이지
  'size': 10 // Number | 페이지당 표시할 아이템 개수
};

apiInstance.listProducts(authorization, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| 액세스 토큰 | [default to Bearer ]
 **q** | **String**| 검색어 | [optional] 
 **priceFrom** | **Number**| 최소 가격 | [optional] 
 **priceTo** | **Number**| 최대 가격 | [optional] 
 **sortKey** | **String**| 정렬 필드 | [optional] [default to CREATED_AT]
 **sortDirection** | **String**| 정렬 방향 | [optional] [default to DESC]
 **page** | **Number**| 페이지 | [optional] [default to 1]
 **size** | **Number**| 페이지당 표시할 아이템 개수 | [optional] [default to 10]

### Return type

[**ProductListResponse**](ProductListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProduct"></a>
# **updateProduct**
> ProductDto updateProduct(authorization, productId, opts)

상품을 수정합니다 (ON PURPOSE 10 SEC DELAY TO TEST PESSIMISTIC/OPTIMISTIC DB LOCK).

### Example
```javascript
import DbLockPoc from 'db_lock_poc';

let apiInstance = new DbLockPoc.ProductApi();

let authorization = "Bearer "; // String | 액세스 토큰

let productId = 789; // Number | 

let opts = { 
  'body': new DbLockPoc.NewProductRequest() // NewProductRequest | 
};

apiInstance.updateProduct(authorization, productId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| 액세스 토큰 | [default to Bearer ]
 **productId** | **Number**|  | 
 **body** | [**NewProductRequest**](NewProductRequest.md)|  | [optional] 

### Return type

[**ProductDto**](ProductDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

