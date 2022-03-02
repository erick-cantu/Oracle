# PurchasingVendorsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**syncVendorLocation**](PurchasingVendorsApi.md#syncVendorLocation) | **POST** https://server:port/rest/apis/asset/purchasing/vendorLocationSynchronization/ | Synchronize Vendor Location


<a name="syncVendorLocation"></a>
# **syncVendorLocation**
> syncVendorLocation()

Synchronize Vendor Location

This REST service synchronizes Enterprise Resource Planning (ERP) Suppliers with Work and Asset Management Vendor and Vendor Locations, by creating Work and Asset Management Vendor Location Data Synchronization objects.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PurchasingVendorsApi;


PurchasingVendorsApi apiInstance = new PurchasingVendorsApi();
try {
    apiInstance.syncVendorLocation();
} catch (ApiException e) {
    System.err.println("Exception when calling PurchasingVendorsApi#syncVendorLocation");
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

