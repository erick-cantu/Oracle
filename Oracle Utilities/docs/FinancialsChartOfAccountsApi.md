# FinancialsChartOfAccountsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**syncChartOfAccounts**](FinancialsChartOfAccountsApi.md#syncChartOfAccounts) | **POST** https://server:port/rest/apis/asset/financials/chartOfAccountsSynchronization/ | Synchronize Chart of Accounts


<a name="syncChartOfAccounts"></a>
# **syncChartOfAccounts**
> syncChartOfAccounts()

Synchronize Chart of Accounts

This REST service synchronizes Enterprise Resource Planning (ERP) Chart of Accounts with Work and Asset Management Cost Center and Expense Codes, by creating Work and Asset Management Cost Center Ongoing Data Synchronization objects to process the requests.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.FinancialsChartOfAccountsApi;


FinancialsChartOfAccountsApi apiInstance = new FinancialsChartOfAccountsApi();
try {
    apiInstance.syncChartOfAccounts();
} catch (ApiException e) {
    System.err.println("Exception when calling FinancialsChartOfAccountsApi#syncChartOfAccounts");
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

