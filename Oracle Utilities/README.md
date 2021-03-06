# swagger-java-client

Oracle Utilities REST API for Work and Asset
- API version: 2021.12.08-oas3-oas3
  - Build date: 2022-03-02T06:21:50.429Z

This documentation helps you to get started using the REST APIs for Oracle Utilities Work and Asset Cloud Service and Oracle Utilities Work and Asset Management.


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.FinancialsChartOfAccountsApi;

import java.io.File;
import java.util.*;

public class FinancialsChartOfAccountsApiExample {

    public static void main(String[] args) {
        
        FinancialsChartOfAccountsApi apiInstance = new FinancialsChartOfAccountsApi();
        try {
            apiInstance.syncChartOfAccounts();
        } catch (ApiException e) {
            System.err.println("Exception when calling FinancialsChartOfAccountsApi#syncChartOfAccounts");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*FinancialsChartOfAccountsApi* | [**syncChartOfAccounts**](docs/FinancialsChartOfAccountsApi.md#syncChartOfAccounts) | **POST** https://server:port/rest/apis/asset/financials/chartOfAccountsSynchronization/ | Synchronize Chart of Accounts
*InventoryStockItemsApi* | [**sync**](docs/InventoryStockItemsApi.md#sync) | **POST** https://server:port/rest/apis/asset/inventory/stockItemSync/sync | Synchronize Stock Item
*PurchasingBlanketContractApi* | [**syncBlanketContract**](docs/PurchasingBlanketContractApi.md#syncBlanketContract) | **POST** https://server:port/rest/apis/asset/purchasing/blanketContractSynchronization/ | Synchronize Blanket Contract
*PurchasingInvoicingApi* | [**syncInvoice**](docs/PurchasingInvoicingApi.md#syncInvoice) | **POST** https://server:port/rest/apis/asset/purchasing/invoiceSynchronization/ | Synchronize Invoice
*PurchasingPurchaseOrdersApi* | [**syncPurchaseOrder**](docs/PurchasingPurchaseOrdersApi.md#syncPurchaseOrder) | **POST** https://server:port/rest/apis/asset/purchasing/purchaseOrderSynchronization/ | Synchronize Purchase Order
*PurchasingVendorsApi* | [**syncVendorLocation**](docs/PurchasingVendorsApi.md#syncVendorLocation) | **POST** https://server:port/rest/apis/asset/purchasing/vendorLocationSynchronization/ | Synchronize Vendor Location
*ResourcesAbsencesApi* | [**updateAddLeave**](docs/ResourcesAbsencesApi.md#updateAddLeave) | **PUT** https://server:port/rest/apis/asset/resources/leave/{externalId} | Create or Update Leave
*ResourcesCraftsApi* | [**externalUpdateAddCraft**](docs/ResourcesCraftsApi.md#externalUpdateAddCraft) | **PUT** https://server:port/rest/apis/asset/resources/crafts/{externalSystem}/{externalId} | Create or Update Craft
*ResourcesEmployeesApi* | [**syncEmployee**](docs/ResourcesEmployeesApi.md#syncEmployee) | **POST** https://server:port/rest/apis/asset/resources/employeeSynchronization/ | Synchronize Employee
*WorkActivityApi* | [**w1PrjActDtl**](docs/WorkActivityApi.md#w1PrjActDtl) | **GET** https://server:port/rest/apis/asset/work/workActivity/{activityId} | Get Work Activity
*WorkActivityApi* | [**w1UpdSchWin**](docs/WorkActivityApi.md#w1UpdSchWin) | **PATCH** https://server:port/rest/apis/asset/work/workActivity/scheduleWindow/{activityId} | Patch Work Activity Schedule Window


## Documentation for Models

 - [Model](docs/Model.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



