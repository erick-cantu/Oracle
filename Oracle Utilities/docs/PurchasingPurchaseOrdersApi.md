# PurchasingPurchaseOrdersApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**syncPurchaseOrder**](PurchasingPurchaseOrdersApi.md#syncPurchaseOrder) | **POST** https://server:port/rest/apis/asset/purchasing/purchaseOrderSynchronization/ | Synchronize Purchase Order


<a name="syncPurchaseOrder"></a>
# **syncPurchaseOrder**
> syncPurchaseOrder()

Synchronize Purchase Order

This REST service synchronizes an Enterprise Resource Planning (ERP) Purchase Order with the Work and Asset Management Purchase Order inbound integration object.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PurchasingPurchaseOrdersApi;


PurchasingPurchaseOrdersApi apiInstance = new PurchasingPurchaseOrdersApi();
try {
    apiInstance.syncPurchaseOrder();
} catch (ApiException e) {
    System.err.println("Exception when calling PurchasingPurchaseOrdersApi#syncPurchaseOrder");
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

