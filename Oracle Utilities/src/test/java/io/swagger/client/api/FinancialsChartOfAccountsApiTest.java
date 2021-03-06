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
 * API tests for FinancialsChartOfAccountsApi
 */
@Ignore
public class FinancialsChartOfAccountsApiTest {

    private final FinancialsChartOfAccountsApi api = new FinancialsChartOfAccountsApi();

    
    /**
     * Synchronize Chart of Accounts
     *
     * This REST service synchronizes Enterprise Resource Planning (ERP) Chart of Accounts with Work and Asset Management Cost Center and Expense Codes, by creating Work and Asset Management Cost Center Ongoing Data Synchronization objects to process the requests.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void syncChartOfAccountsTest() throws Exception {
        api.syncChartOfAccounts();

        // TODO: test validations
    }
    
}
