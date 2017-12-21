# AuthApi

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
```java
// Import classes:
//import kr.appkr.swagger_poc_api.ApiException;
//import kr.appkr.swagger_poc_api.service.AuthApi;


AuthApi apiInstance = new AuthApi();
LoginRequest body = new LoginRequest(); // LoginRequest | 
try {
    AccessToken result = apiInstance.login(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#login");
    e.printStackTrace();
}
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
```java
// Import classes:
//import kr.appkr.swagger_poc_api.ApiException;
//import kr.appkr.swagger_poc_api.service.AuthApi;


AuthApi apiInstance = new AuthApi();
String authorization = "Bearer "; // String | 액세스 토큰
try {
    apiInstance.logout(authorization);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#logout");
    e.printStackTrace();
}
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
```java
// Import classes:
//import kr.appkr.swagger_poc_api.ApiException;
//import kr.appkr.swagger_poc_api.service.AuthApi;


AuthApi apiInstance = new AuthApi();
String authorization = "Bearer "; // String | 액세스 토큰
try {
    UserDto result = apiInstance.me(authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#me");
    e.printStackTrace();
}
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
```java
// Import classes:
//import kr.appkr.swagger_poc_api.ApiException;
//import kr.appkr.swagger_poc_api.service.AuthApi;


AuthApi apiInstance = new AuthApi();
String authorization = "Bearer "; // String | 액세스 토큰
try {
    AccessToken result = apiInstance.refreshToken(authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#refreshToken");
    e.printStackTrace();
}
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

