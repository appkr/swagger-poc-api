# DbLockPoc.AuthApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**login**](AuthApi.md#login) | **POST** /auth/login | 로그인합니다.
[**logout**](AuthApi.md#logout) | **POST** /auth/logout | 로그아웃합니다.
[**me**](AuthApi.md#me) | **POST** /auth/me | 프로필 정보를 확인합니다.
[**refreshToken**](AuthApi.md#refreshToken) | **POST** /auth/refresh | 로그인합니다.


<a name="login"></a>
# **login**
> AccessToken login(body)

로그인합니다.

### Example
```javascript
import DbLockPoc from 'db_lock_poc';

let apiInstance = new DbLockPoc.AuthApi();

let body = new DbLockPoc.LoginRequest(); // LoginRequest | 


apiInstance.login(body, (error, data, response) => {
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
 **body** | [**LoginRequest**](LoginRequest.md)|  | 

### Return type

[**AccessToken**](AccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="logout"></a>
# **logout**
> logout(authorization)

로그아웃합니다.

### Example
```javascript
import DbLockPoc from 'db_lock_poc';

let apiInstance = new DbLockPoc.AuthApi();

let authorization = "Bearer "; // String | 액세스 토큰


apiInstance.logout(authorization, (error, data, response) => {
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

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="me"></a>
# **me**
> UserDto me(authorization)

프로필 정보를 확인합니다.

### Example
```javascript
import DbLockPoc from 'db_lock_poc';

let apiInstance = new DbLockPoc.AuthApi();

let authorization = "Bearer "; // String | 액세스 토큰


apiInstance.me(authorization, (error, data, response) => {
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

### Return type

[**UserDto**](UserDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="refreshToken"></a>
# **refreshToken**
> AccessToken refreshToken(authorization)

로그인합니다.

### Example
```javascript
import DbLockPoc from 'db_lock_poc';

let apiInstance = new DbLockPoc.AuthApi();

let authorization = "Bearer "; // String | 액세스 토큰


apiInstance.refreshToken(authorization, (error, data, response) => {
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

### Return type

[**AccessToken**](AccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded
 - **Accept**: application/json

