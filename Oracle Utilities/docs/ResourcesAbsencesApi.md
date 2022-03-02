# ResourcesAbsencesApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**updateAddLeave**](ResourcesAbsencesApi.md#updateAddLeave) | **PUT** https://server:port/rest/apis/asset/resources/leave/{externalId} | Create or Update Leave


<a name="updateAddLeave"></a>
# **updateAddLeave**
> updateAddLeave(externalId)

Create or Update Leave

This REST web service synchronizes Enterprise Resource Planning (ERP) - Human Capital Management (HCM) Absence with a Work and Asset Management Employee Unavailability. This web service creates WAM Employee Unavailability creates new or updates existing records.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ResourcesAbsencesApi;


ResourcesAbsencesApi apiInstance = new ResourcesAbsencesApi();
Object externalId = null; // Object | A unique identifier of the leave record as represented in the external system  - Human Capital Management
try {
    apiInstance.updateAddLeave(externalId);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourcesAbsencesApi#updateAddLeave");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalId** | [**Object**](.md)| A unique identifier of the leave record as represented in the external system  - Human Capital Management |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

