# ResourcesEmployeesApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**syncEmployee**](ResourcesEmployeesApi.md#syncEmployee) | **POST** https://server:port/rest/apis/asset/resources/employeeSynchronization/ | Synchronize Employee


<a name="syncEmployee"></a>
# **syncEmployee**
> syncEmployee()

Synchronize Employee

This REST web service synchronizes Enterprise Resource Planning - Human Capital Management Employee records with Work and Asset Management.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ResourcesEmployeesApi;


ResourcesEmployeesApi apiInstance = new ResourcesEmployeesApi();
try {
    apiInstance.syncEmployee();
} catch (ApiException e) {
    System.err.println("Exception when calling ResourcesEmployeesApi#syncEmployee");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

