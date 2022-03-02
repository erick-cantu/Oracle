# PurchasingInvoicingApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**syncInvoice**](PurchasingInvoicingApi.md#syncInvoice) | **POST** https://server:port/rest/apis/asset/purchasing/invoiceSynchronization/ | Synchronize Invoice


<a name="syncInvoice"></a>
# **syncInvoice**
> syncInvoice()

Synchronize Invoice

This REST service synchronizes Enterprise Resource Planning (ERP) Invoice and Payments with Work and Asset Management, by creating Work and Asset Management Invoice inbound integration objects.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PurchasingInvoicingApi;


PurchasingInvoicingApi apiInstance = new PurchasingInvoicingApi();
try {
    apiInstance.syncInvoice();
} catch (ApiException e) {
    System.err.println("Exception when calling PurchasingInvoicingApi#syncInvoice");
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

