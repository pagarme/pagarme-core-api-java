/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;

public class CreateCheckoutPaymentRequestBuilder {
    //the instance to build
    private CreateCheckoutPaymentRequest createCheckoutPaymentRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CreateCheckoutPaymentRequestBuilder() {
        createCheckoutPaymentRequest = new CreateCheckoutPaymentRequest();
    }

    /**
     * Accepted Payment Methods
     */
    public CreateCheckoutPaymentRequestBuilder acceptedPaymentMethods(List<String> acceptedPaymentMethods) {
        createCheckoutPaymentRequest.setAcceptedPaymentMethods(acceptedPaymentMethods);
        return this;
    }

    /**
     * Accepted Multi Payment Methods
     */
    public CreateCheckoutPaymentRequestBuilder acceptedMultiPaymentMethods(List<Object> acceptedMultiPaymentMethods) {
        createCheckoutPaymentRequest.setAcceptedMultiPaymentMethods(acceptedMultiPaymentMethods);
        return this;
    }

    /**
     * Success url
     */
    public CreateCheckoutPaymentRequestBuilder successUrl(String successUrl) {
        createCheckoutPaymentRequest.setSuccessUrl(successUrl);
        return this;
    }

    /**
     * Default payment method
     */
    public CreateCheckoutPaymentRequestBuilder defaultPaymentMethod(String defaultPaymentMethod) {
        createCheckoutPaymentRequest.setDefaultPaymentMethod(defaultPaymentMethod);
        return this;
    }

    /**
     * Gateway Affiliation Id
     */
    public CreateCheckoutPaymentRequestBuilder gatewayAffiliationId(String gatewayAffiliationId) {
        createCheckoutPaymentRequest.setGatewayAffiliationId(gatewayAffiliationId);
        return this;
    }

    /**
     * Credit Card payment request
     */
    public CreateCheckoutPaymentRequestBuilder creditCard(CreateCheckoutCreditCardPaymentRequest creditCard) {
        createCheckoutPaymentRequest.setCreditCard(creditCard);
        return this;
    }

    /**
     * Debit Card payment request
     */
    public CreateCheckoutPaymentRequestBuilder debitCard(CreateCheckoutDebitCardPaymentRequest debitCard) {
        createCheckoutPaymentRequest.setDebitCard(debitCard);
        return this;
    }

    /**
     * Boleto payment request
     */
    public CreateCheckoutPaymentRequestBuilder boleto(CreateCheckoutBoletoPaymentRequest boleto) {
        createCheckoutPaymentRequest.setBoleto(boleto);
        return this;
    }

    /**
     * Customer is editable?
     */
    public CreateCheckoutPaymentRequestBuilder customerEditable(Boolean customerEditable) {
        createCheckoutPaymentRequest.setCustomerEditable(customerEditable);
        return this;
    }

    /**
     * Time in minutes for expiration
     */
    public CreateCheckoutPaymentRequestBuilder expiresIn(Integer expiresIn) {
        createCheckoutPaymentRequest.setExpiresIn(expiresIn);
        return this;
    }

    /**
     * Skip postpay success screen?
     */
    public CreateCheckoutPaymentRequestBuilder skipCheckoutSuccessPage(boolean skipCheckoutSuccessPage) {
        createCheckoutPaymentRequest.setSkipCheckoutSuccessPage(skipCheckoutSuccessPage);
        return this;
    }

    /**
     * Billing Address is editable?
     */
    public CreateCheckoutPaymentRequestBuilder billingAddressEditable(boolean billingAddressEditable) {
        createCheckoutPaymentRequest.setBillingAddressEditable(billingAddressEditable);
        return this;
    }

    /**
     * Billing Address
     */
    public CreateCheckoutPaymentRequestBuilder billingAddress(CreateAddressRequest billingAddress) {
        createCheckoutPaymentRequest.setBillingAddress(billingAddress);
        return this;
    }

    /**
     * Bank Transfer payment request
     */
    public CreateCheckoutPaymentRequestBuilder bankTransfer(CreateCheckoutBankTransferRequest bankTransfer) {
        createCheckoutPaymentRequest.setBankTransfer(bankTransfer);
        return this;
    }

    /**
     * Accepted Brands
     */
    public CreateCheckoutPaymentRequestBuilder acceptedBrands(List<String> acceptedBrands) {
        createCheckoutPaymentRequest.setAcceptedBrands(acceptedBrands);
        return this;
    }

    /**
     * Pix payment request
     */
    public CreateCheckoutPaymentRequestBuilder pix(CreateCheckoutPixPaymentRequest pix) {
        createCheckoutPaymentRequest.setPix(pix);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateCheckoutPaymentRequest build() {
        return createCheckoutPaymentRequest;
    }
}