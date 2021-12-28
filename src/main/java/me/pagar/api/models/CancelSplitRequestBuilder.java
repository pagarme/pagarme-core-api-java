/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;

public class CancelSplitRequestBuilder {
    //the instance to build
    private CancelSplitRequest cancelSplitRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CancelSplitRequestBuilder() {
        cancelSplitRequest = new CancelSplitRequest();
    }

    /**
     * Split type
     */
    public CancelSplitRequestBuilder type(String type) {
        cancelSplitRequest.setType(type);
        return this;
    }

    /**
     * Amount
     */
    public CancelSplitRequestBuilder amount(int amount) {
        cancelSplitRequest.setAmount(amount);
        return this;
    }

    /**
     * Recipient id
     */
    public CancelSplitRequestBuilder recipientId(String recipientId) {
        cancelSplitRequest.setRecipientId(recipientId);
        return this;
    }

    /**
     * The split options request
     */
    public CancelSplitRequestBuilder options(CreateSplitOptionsRequest options) {
        cancelSplitRequest.setOptions(options);
        return this;
    }

    /**
     * Rule id
     */
    public CancelSplitRequestBuilder splitRuleID(String splitRuleID) {
        cancelSplitRequest.setSplitRuleID(splitRuleID);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CancelSplitRequest build() {
        return cancelSplitRequest;
    }
}