/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api;

import me.pagar.api.controllers.*;
import me.pagar.api.http.client.HttpClient;

public class PagarmeCoreApiClient {
    /**
     * Singleton access to Subscriptions controller
     * @return	Returns the SubscriptionsController instance 
     */
    public SubscriptionsController getSubscriptions() {
        return SubscriptionsController.getInstance();
    }

    /**
     * Singleton access to Orders controller
     * @return	Returns the OrdersController instance 
     */
    public OrdersController getOrders() {
        return OrdersController.getInstance();
    }

    /**
     * Singleton access to Plans controller
     * @return	Returns the PlansController instance 
     */
    public PlansController getPlans() {
        return PlansController.getInstance();
    }

    /**
     * Singleton access to Invoices controller
     * @return	Returns the InvoicesController instance 
     */
    public InvoicesController getInvoices() {
        return InvoicesController.getInstance();
    }

    /**
     * Singleton access to Customers controller
     * @return	Returns the CustomersController instance 
     */
    public CustomersController getCustomers() {
        return CustomersController.getInstance();
    }

    /**
     * Singleton access to Charges controller
     * @return	Returns the ChargesController instance 
     */
    public ChargesController getCharges() {
        return ChargesController.getInstance();
    }

    /**
     * Singleton access to Recipients controller
     * @return	Returns the RecipientsController instance 
     */
    public RecipientsController getRecipients() {
        return RecipientsController.getInstance();
    }

    /**
     * Singleton access to Tokens controller
     * @return	Returns the TokensController instance 
     */
    public TokensController getTokens() {
        return TokensController.getInstance();
    }

    /**
     * Singleton access to Transfers controller
     * @return	Returns the TransfersController instance 
     */
    public TransfersController getTransfers() {
        return TransfersController.getInstance();
    }

    /**
     * Singleton access to Transactions controller
     * @return	Returns the TransactionsController instance 
     */
    public TransactionsController getTransactions() {
        return TransactionsController.getInstance();
    }

    /**
     * Get the shared http client currently being used for API calls
     * @return The http client instance currently being used
     */
    public HttpClient getSharedHttpClient() {
        return BaseController.getClientInstance();
    }
    
    /**
     * Set a shared http client to be used for API calls
     * @param httpClient The http client to use
     */
    public void setSharedHttpClient(HttpClient httpClient) {
        BaseController.setClientInstance(httpClient);
    }

    /**
     * Default constructor 
     */     
    public PagarmeCoreApiClient() {
    }

    /**
     * Client initialization constructor 
     */     
    public PagarmeCoreApiClient(String basicAuthUserName, String basicAuthPassword, String serviceRefererName) {
        this();
        Configuration.basicAuthUserName = basicAuthUserName;
        Configuration.basicAuthPassword = basicAuthPassword;
        Configuration.serviceRefererName = serviceRefererName;
    }
}
