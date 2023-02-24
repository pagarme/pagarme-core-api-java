/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;

public class CreateCheckoutDebitCardPaymentRequestBuilder {
    //the instance to build
    private CreateCheckoutDebitCardPaymentRequest createCheckoutDebitCardPaymentRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CreateCheckoutDebitCardPaymentRequestBuilder() {
        createCheckoutDebitCardPaymentRequest = new CreateCheckoutDebitCardPaymentRequest();
    }

    /**
     * Card invoice text descriptor
     */
    public CreateCheckoutDebitCardPaymentRequestBuilder statementDescriptor(String statementDescriptor) {
        createCheckoutDebitCardPaymentRequest.setStatementDescriptor(statementDescriptor);
        return this;
    }

    /**
     * The payment authentication request
     */
    public CreateCheckoutDebitCardPaymentRequestBuilder authentication(CreatePaymentAuthenticationRequest authentication) {
        createCheckoutDebitCardPaymentRequest.setAuthentication(authentication);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateCheckoutDebitCardPaymentRequest build() {
        return createCheckoutDebitCardPaymentRequest;
    }
}