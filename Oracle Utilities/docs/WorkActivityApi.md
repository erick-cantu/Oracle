# WorkActivityApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**w1PrjActDtl**](WorkActivityApi.md#w1PrjActDtl) | **GET** https://server:port/rest/apis/asset/work/workActivity/{activityId} | Get Work Activity
[**w1UpdSchWin**](WorkActivityApi.md#w1UpdSchWin) | **PATCH** https://server:port/rest/apis/asset/work/workActivity/scheduleWindow/{activityId} | Patch Work Activity Schedule Window


<a name="w1PrjActDtl"></a>
# **w1PrjActDtl**
> w1PrjActDtl(activityId)

Get Work Activity

Retrieves activity details for project planning, not including attachments.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WorkActivityApi;


WorkActivityApi apiInstance = new WorkActivityApi();
Object activityId = null; // Object | System generated primary key up to 14 numeric digit identifier for the work activity record.
try {
    apiInstance.w1PrjActDtl(activityId);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkActivityApi#w1PrjActDtl");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **activityId** | [**Object**](.md)| System generated primary key up to 14 numeric digit identifier for the work activity record. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="w1UpdSchWin"></a>
# **w1UpdSchWin**
> w1UpdSchWin(activityId)

Patch Work Activity Schedule Window

Updates the scheduling window of activities. There is a work window start date/time through a work window end date/time that can be updated from other external systems that manage enterprise project planning.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WorkActivityApi;


WorkActivityApi apiInstance = new WorkActivityApi();
Object activityId = null; // Object | System generated primary key up to 14 numeric digit identifier for the work activity record.
try {
    apiInstance.w1UpdSchWin(activityId);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkActivityApi#w1UpdSchWin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **activityId** | [**Object**](.md)| System generated primary key up to 14 numeric digit identifier for the work activity record. |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

