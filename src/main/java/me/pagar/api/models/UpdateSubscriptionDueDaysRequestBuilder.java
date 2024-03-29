/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;

public class UpdateSubscriptionDueDaysRequestBuilder {
    //the instance to build
    private UpdateSubscriptionDueDaysRequest updateSubscriptionDueDaysRequest;

    /**
     * Default constructor to initialize the instance
     */
    public UpdateSubscriptionDueDaysRequestBuilder() {
        updateSubscriptionDueDaysRequest = new UpdateSubscriptionDueDaysRequest();
    }

    public UpdateSubscriptionDueDaysRequestBuilder boletoDueDays(int boletoDueDays) {
        updateSubscriptionDueDaysRequest.setBoletoDueDays(boletoDueDays);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UpdateSubscriptionDueDaysRequest build() {
        return updateSubscriptionDueDaysRequest;
    }
}