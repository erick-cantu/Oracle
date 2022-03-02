/*
 * Oracle Utilities REST API for Work and Asset
 * This documentation helps you to get started using the REST APIs for Oracle Utilities Work and Asset Cloud Service and Oracle Utilities Work and Asset Management.
 *
 * OpenAPI spec version: 2021.12.08-oas3-oas3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PurchasingPurchaseOrdersApi
 */
@Ignore
public class PurchasingPurchaseOrdersApiTest {

    private final PurchasingPurchaseOrdersApi api = new PurchasingPurchaseOrdersApi();

    
    /**
     * Synchronize Purchase Order
     *
     * This REST service synchronizes an Enterprise Resource Planning (ERP) Purchase Order with the Work and Asset Management Purchase Order inbound integration object.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void syncPurchaseOrderTest() throws Exception {
        api.syncPurchaseOrder();

        // TODO: test validations
    }
    
}
