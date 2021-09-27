/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;
import org.joda.time.DateTime;

public class CreateSubscriptionRequestBuilder {
    //the instance to build
    private CreateSubscriptionRequest createSubscriptionRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CreateSubscriptionRequestBuilder() {
        createSubscriptionRequest = new CreateSubscriptionRequest();
    }

    /**
     * Customer
     */
    public CreateSubscriptionRequestBuilder customer(CreateCustomerRequest customer) {
        createSubscriptionRequest.setCustomer(customer);
        return this;
    }

    /**
     * Card
     */
    public CreateSubscriptionRequestBuilder card(CreateCardRequest card) {
        createSubscriptionRequest.setCard(card);
        return this;
    }

    /**
     * Subscription code
     */
    public CreateSubscriptionRequestBuilder code(String code) {
        createSubscriptionRequest.setCode(code);
        return this;
    }

    /**
     * Payment method
     */
    public CreateSubscriptionRequestBuilder paymentMethod(String paymentMethod) {
        createSubscriptionRequest.setPaymentMethod(paymentMethod);
        return this;
    }

    /**
     * Billing type
     */
    public CreateSubscriptionRequestBuilder billingType(String billingType) {
        createSubscriptionRequest.setBillingType(billingType);
        return this;
    }

    /**
     * Statement descriptor for credit card subscriptions
     */
    public CreateSubscriptionRequestBuilder statementDescriptor(String statementDescriptor) {
        createSubscriptionRequest.setStatementDescriptor(statementDescriptor);
        return this;
    }

    /**
     * Subscription description
     */
    public CreateSubscriptionRequestBuilder description(String description) {
        createSubscriptionRequest.setDescription(description);
        return this;
    }

    /**
     * Currency
     */
    public CreateSubscriptionRequestBuilder currency(String currency) {
        createSubscriptionRequest.setCurrency(currency);
        return this;
    }

    /**
     * Interval
     */
    public CreateSubscriptionRequestBuilder interval(String interval) {
        createSubscriptionRequest.setInterval(interval);
        return this;
    }

    /**
     * Interval count
     */
    public CreateSubscriptionRequestBuilder intervalCount(int intervalCount) {
        createSubscriptionRequest.setIntervalCount(intervalCount);
        return this;
    }

    /**
     * Subscription pricing scheme
     */
    public CreateSubscriptionRequestBuilder pricingScheme(CreatePricingSchemeRequest pricingScheme) {
        createSubscriptionRequest.setPricingScheme(pricingScheme);
        return this;
    }

    /**
     * Subscription items
     */
    public CreateSubscriptionRequestBuilder items(List<CreateSubscriptionItemRequest> items) {
        createSubscriptionRequest.setItems(items);
        return this;
    }

    /**
     * Shipping
     */
    public CreateSubscriptionRequestBuilder shipping(CreateShippingRequest shipping) {
        createSubscriptionRequest.setShipping(shipping);
        return this;
    }

    /**
     * Discounts
     */
    public CreateSubscriptionRequestBuilder discounts(List<CreateDiscountRequest> discounts) {
        createSubscriptionRequest.setDiscounts(discounts);
        return this;
    }

    /**
     * Metadata
     */
    public CreateSubscriptionRequestBuilder metadata(LinkedHashMap<String, String> metadata) {
        createSubscriptionRequest.setMetadata(metadata);
        return this;
    }

    /**
     * Setup data
     */
    public CreateSubscriptionRequestBuilder setup(CreateSetupRequest setup) {
        createSubscriptionRequest.setSetup(setup);
        return this;
    }

    /**
     * Plan id
     */
    public CreateSubscriptionRequestBuilder planId(String planId) {
        createSubscriptionRequest.setPlanId(planId);
        return this;
    }

    /**
     * Customer id
     */
    public CreateSubscriptionRequestBuilder customerId(String customerId) {
        createSubscriptionRequest.setCustomerId(customerId);
        return this;
    }

    /**
     * Card id
     */
    public CreateSubscriptionRequestBuilder cardId(String cardId) {
        createSubscriptionRequest.setCardId(cardId);
        return this;
    }

    /**
     * Billing day
     */
    public CreateSubscriptionRequestBuilder billingDay(Integer billingDay) {
        createSubscriptionRequest.setBillingDay(billingDay);
        return this;
    }

    /**
     * Number of installments
     */
    public CreateSubscriptionRequestBuilder installments(Integer installments) {
        createSubscriptionRequest.setInstallments(installments);
        return this;
    }

    /**
     * Subscription start date
     */
    public CreateSubscriptionRequestBuilder startAt(DateTime startAt) {
        createSubscriptionRequest.setStartAt(startAt);
        return this;
    }

    /**
     * Subscription minimum price
     */
    public CreateSubscriptionRequestBuilder minimumPrice(Integer minimumPrice) {
        createSubscriptionRequest.setMinimumPrice(minimumPrice);
        return this;
    }

    /**
     * Number of cycles
     */
    public CreateSubscriptionRequestBuilder cycles(Integer cycles) {
        createSubscriptionRequest.setCycles(cycles);
        return this;
    }

    /**
     * Card token
     */
    public CreateSubscriptionRequestBuilder cardToken(String cardToken) {
        createSubscriptionRequest.setCardToken(cardToken);
        return this;
    }

    /**
     * Gateway Affiliation code
     */
    public CreateSubscriptionRequestBuilder gatewayAffiliationId(String gatewayAffiliationId) {
        createSubscriptionRequest.setGatewayAffiliationId(gatewayAffiliationId);
        return this;
    }

    /**
     * Quantity
     */
    public CreateSubscriptionRequestBuilder quantity(Integer quantity) {
        createSubscriptionRequest.setQuantity(quantity);
        return this;
    }

    /**
     * Days until boleto expires
     */
    public CreateSubscriptionRequestBuilder boletoDueDays(Integer boletoDueDays) {
        createSubscriptionRequest.setBoletoDueDays(boletoDueDays);
        return this;
    }

    /**
     * Increments
     */
    public CreateSubscriptionRequestBuilder increments(List<CreateIncrementRequest> increments) {
        createSubscriptionRequest.setIncrements(increments);
        return this;
    }

    public CreateSubscriptionRequestBuilder period(CreatePeriodRequest period) {
        createSubscriptionRequest.setPeriod(period);
        return this;
    }

    /**
     * SubMerchant
     */
    public CreateSubscriptionRequestBuilder submerchant(CreateSubMerchantRequest submerchant) {
        createSubscriptionRequest.setSubmerchant(submerchant);
        return this;
    }

    /**
     * Split
     */
    public CreateSubscriptionRequestBuilder split(CreateSubscriptionSplitRequest split) {
        createSubscriptionRequest.setSplit(split);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateSubscriptionRequest build() {
        return createSubscriptionRequest;
    }
}