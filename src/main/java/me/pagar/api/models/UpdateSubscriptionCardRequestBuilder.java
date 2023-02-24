/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;

public class UpdateSubscriptionCardRequestBuilder {
    //the instance to build
    private UpdateSubscriptionCardRequest updateSubscriptionCardRequest;

    /**
     * Default constructor to initialize the instance
     */
    public UpdateSubscriptionCardRequestBuilder() {
        updateSubscriptionCardRequest = new UpdateSubscriptionCardRequest();
    }

    /**
     * Card data
     */
    public UpdateSubscriptionCardRequestBuilder card(CreateCardRequest card) {
        updateSubscriptionCardRequest.setCard(card);
        return this;
    }

    /**
     * Credit card id
     */
    public UpdateSubscriptionCardRequestBuilder cardId(String cardId) {
        updateSubscriptionCardRequest.setCardId(cardId);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UpdateSubscriptionCardRequest build() {
        return updateSubscriptionCardRequest;
    }
}