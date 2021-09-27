/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;

public class GetSubscriptionSplitResponseBuilder {
    //the instance to build
    private GetSubscriptionSplitResponse getSubscriptionSplitResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetSubscriptionSplitResponseBuilder() {
        getSubscriptionSplitResponse = new GetSubscriptionSplitResponse();
    }

    /**
     * Defines if the split is enabled
     */
    public GetSubscriptionSplitResponseBuilder enable(boolean enable) {
        getSubscriptionSplitResponse.setEnable(enable);
        return this;
    }

    /**
     * Split
     */
    public GetSubscriptionSplitResponseBuilder rules(GetSplitResponse rules) {
        getSubscriptionSplitResponse.setRules(rules);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetSubscriptionSplitResponse build() {
        return getSubscriptionSplitResponse;
    }
}