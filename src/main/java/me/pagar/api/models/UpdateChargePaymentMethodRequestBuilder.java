/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;

public class UpdateChargePaymentMethodRequestBuilder {
    //the instance to build
    private UpdateChargePaymentMethodRequest updateChargePaymentMethodRequest;

    /**
     * Default constructor to initialize the instance
     */
    public UpdateChargePaymentMethodRequestBuilder() {
        updateChargePaymentMethodRequest = new UpdateChargePaymentMethodRequest();
    }

    /**
     * Indicates if the payment method from the subscription must also be updated
     */
    public UpdateChargePaymentMethodRequestBuilder updateSubscription(boolean updateSubscription) {
        updateChargePaymentMethodRequest.setUpdateSubscription(updateSubscription);
        return this;
    }

    /**
     * The new payment method
     */
    public UpdateChargePaymentMethodRequestBuilder paymentMethod(String paymentMethod) {
        updateChargePaymentMethodRequest.setPaymentMethod(paymentMethod);
        return this;
    }

    /**
     * The settings for creating a credit card payment
     */
    public UpdateChargePaymentMethodRequestBuilder creditCard(CreateCreditCardPaymentRequest creditCard) {
        updateChargePaymentMethodRequest.setCreditCard(creditCard);
        return this;
    }

    /**
     * The settings for creating a debit card payment
     */
    public UpdateChargePaymentMethodRequestBuilder debitCard(CreateDebitCardPaymentRequest debitCard) {
        updateChargePaymentMethodRequest.setDebitCard(debitCard);
        return this;
    }

    /**
     * Contains the settings for creating a boleto payment
     */
    public UpdateChargePaymentMethodRequestBuilder boleto(CreateBoletoPaymentRequest boleto) {
        updateChargePaymentMethodRequest.setBoleto(boleto);
        return this;
    }

    /**
     * The settings for creating a voucher payment
     */
    public UpdateChargePaymentMethodRequestBuilder voucher(CreateVoucherPaymentRequest voucher) {
        updateChargePaymentMethodRequest.setVoucher(voucher);
        return this;
    }

    public UpdateChargePaymentMethodRequestBuilder cash(CreateCashPaymentRequest cash) {
        updateChargePaymentMethodRequest.setCash(cash);
        return this;
    }

    /**
     * Request for creating a bank transfer payment
     */
    public UpdateChargePaymentMethodRequestBuilder bankTransfer(CreateBankTransferPaymentRequest bankTransfer) {
        updateChargePaymentMethodRequest.setBankTransfer(bankTransfer);
        return this;
    }

    /**
     * The settings for creating a private label payment
     */
    public UpdateChargePaymentMethodRequestBuilder privateLabel(CreatePrivateLabelPaymentRequest privateLabel) {
        updateChargePaymentMethodRequest.setPrivateLabel(privateLabel);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UpdateChargePaymentMethodRequest build() {
        return updateChargePaymentMethodRequest;
    }
}