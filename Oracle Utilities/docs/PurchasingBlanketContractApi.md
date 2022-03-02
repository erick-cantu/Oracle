# PurchasingBlanketContractApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**syncBlanketContract**](PurchasingBlanketContractApi.md#syncBlanketContract) | **POST** https://server:port/rest/apis/asset/purchasing/blanketContractSynchronization/ | Synchronize Blanket Contract


<a name="syncBlanketContract"></a>
# **syncBlanketContract**
> syncBlanketContract()

Synchronize Blanket Contract

This REST service synchronizes Enterprise Resource Planning Blanket Contracts with Work and Asset Management.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PurchasingBlanketContractApi;


PurchasingBlanketContractApi apiInstance = new PurchasingBlanketContractApi();
try {
    apiInstance.syncBlanketContract();
} catch (ApiException e) {
    System.err.println("Exception when calling PurchasingBlanketContractApi#syncBlanketContract");
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

