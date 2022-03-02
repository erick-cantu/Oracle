# ResourcesCraftsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**externalUpdateAddCraft**](ResourcesCraftsApi.md#externalUpdateAddCraft) | **PUT** https://server:port/rest/apis/asset/resources/crafts/{externalSystem}/{externalId} | Create or Update Craft


<a name="externalUpdateAddCraft"></a>
# **externalUpdateAddCraft**
> externalUpdateAddCraft(externalId, externalSystem)

Create or Update Craft

This REST service synchronizes Enterprise Resource Planning (ERP) - Human Capital Management (HCM) Jobs with Work and Asset Management (WAM) Crafts, by creating WAM Craft records or updating existing records.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ResourcesCraftsApi;


ResourcesCraftsApi apiInstance = new ResourcesCraftsApi();
Object externalId = null; // Object | A unique identifier of the leave record as represented in the external system  - Human Capital Management
Object externalSystem = null; // Object | The Work and Asset Management code that represents the external system.
try {
    apiInstance.externalUpdateAddCraft(externalId, externalSystem);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourcesCraftsApi#externalUpdateAddCraft");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalId** | [**Object**](.md)| A unique identifier of the leave record as represented in the external system  - Human Capital Management |
 **externalSystem** | [**Object**](.md)| The Work and Asset Management code that represents the external system. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

