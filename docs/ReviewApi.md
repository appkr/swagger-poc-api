# DbLockPoc.ReviewApi

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
```javascript
import DbLockPoc from 'db_lock_poc';

let apiInstance = new DbLockPoc.ReviewApi();

let authorization = "Bearer "; // String | 액세스 토큰

let productId = 789; // Number | 

let body = new DbLockPoc.NewReviewRequest(); // NewReviewRequest | 


apiInstance.createReview(authorization, productId, body, (error, data, response) => {
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
```javascript
import DbLockPoc from 'db_lock_poc';

let apiInstance = new DbLockPoc.ReviewApi();

let authorization = "Bearer "; // String | 액세스 토큰

let productId = 789; // Number | 

let reviewId = 789; // Number | 


apiInstance.deleteReview(authorization, productId, reviewId, (error, data, response) => {
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
 **reviewId** | **Number**|  | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="listReviews"></a>
# **listReviews**
> ReviewListResponse listReviews(authorization, productId, opts)

상품에 대한 리뷰 목록을 조회합니다.

### Example
```javascript
import DbLockPoc from 'db_lock_poc';

let apiInstance = new DbLockPoc.ReviewApi();

let authorization = "Bearer "; // String | 액세스 토큰

let productId = 789; // Number | 

let opts = { 
  'q': "q_example", // String | 검색어
  'userId': 789, // Number | 작성자 ID
  'sortKey': "CREATED_AT", // String | 정렬 필드
  'sortDirection': "DESC", // String | 정렬 방향
  'page': 1, // Number | 페이지
  'size': 10 // Number | 페이지당 표시할 아이템 개수
};

apiInstance.listReviews(authorization, productId, opts, (error, data, response) => {
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
 **q** | **String**| 검색어 | [optional] 
 **userId** | **Number**| 작성자 ID | [optional] 
 **sortKey** | **String**| 정렬 필드 | [optional] [default to CREATED_AT]
 **sortDirection** | **String**| 정렬 방향 | [optional] [default to DESC]
 **page** | **Number**| 페이지 | [optional] [default to 1]
 **size** | **Number**| 페이지당 표시할 아이템 개수 | [optional] [default to 10]

### Return type

[**ReviewListResponse**](ReviewListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateReview"></a>
# **updateReview**
> ReviewDto updateReview(authorization, productId, reviewId, opts)

리뷰를 수정합니다.

### Example
```javascript
import DbLockPoc from 'db_lock_poc';

let apiInstance = new DbLockPoc.ReviewApi();

let authorization = "Bearer "; // String | 액세스 토큰

let productId = 789; // Number | 

let reviewId = 789; // Number | 

let opts = { 
  'body': new DbLockPoc.NewReviewRequest() // NewReviewRequest | 
};

apiInstance.updateReview(authorization, productId, reviewId, opts, (error, data, response) => {
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
 **reviewId** | **Number**|  | 
 **body** | [**NewReviewRequest**](NewReviewRequest.md)|  | [optional] 

### Return type

[**ReviewDto**](ReviewDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

