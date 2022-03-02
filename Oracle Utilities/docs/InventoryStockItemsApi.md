# InventoryStockItemsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sync**](InventoryStockItemsApi.md#sync) | **POST** https://server:port/rest/apis/asset/inventory/stockItemSync/sync | Synchronize Stock Item


<a name="sync"></a>
# **sync**
> sync()

Synchronize Stock Item

A stock item sync request record manages the creation or update of a stock item.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.InventoryStockItemsApi;


InventoryStockItemsApi apiInstance = new InventoryStockItemsApi();
try {
    apiInstance.sync();
} catch (ApiException e) {
    System.err.println("Exception when calling InventoryStockItemsApi#sync");
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

