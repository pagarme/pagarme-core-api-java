/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;

public class UpdateSubscriptionItemRequestBuilder {
    //the instance to build
    private UpdateSubscriptionItemRequest updateSubscriptionItemRequest;

    /**
     * Default constructor to initialize the instance
     */
    public UpdateSubscriptionItemRequestBuilder() {
        updateSubscriptionItemRequest = new UpdateSubscriptionItemRequest();
    }

    /**
     * Description
     */
    public UpdateSubscriptionItemRequestBuilder description(String description) {
        updateSubscriptionItemRequest.setDescription(description);
        return this;
    }

    /**
     * Status
     */
    public UpdateSubscriptionItemRequestBuilder status(String status) {
        updateSubscriptionItemRequest.setStatus(status);
        return this;
    }

    /**
     * Request for updating a pricing scheme
     */
    public UpdateSubscriptionItemRequestBuilder pricingScheme(UpdatePricingSchemeRequest pricingScheme) {
        updateSubscriptionItemRequest.setPricingScheme(pricingScheme);
        return this;
    }

    /**
     * Item name
     */
    public UpdateSubscriptionItemRequestBuilder name(String name) {
        updateSubscriptionItemRequest.setName(name);
        return this;
    }

    /**
     * Number of cycles that the item will be charged
     */
    public UpdateSubscriptionItemRequestBuilder cycles(Integer cycles) {
        updateSubscriptionItemRequest.setCycles(cycles);
        return this;
    }

    /**
     * Quantity
     */
    public UpdateSubscriptionItemRequestBuilder quantity(Integer quantity) {
        updateSubscriptionItemRequest.setQuantity(quantity);
        return this;
    }

    /**
     * Minimum price
     */
    public UpdateSubscriptionItemRequestBuilder minimumPrice(Integer minimumPrice) {
        updateSubscriptionItemRequest.setMinimumPrice(minimumPrice);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UpdateSubscriptionItemRequest build() {
        return updateSubscriptionItemRequest;
    }
}