/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;

public class CreateCancelChargeRequestBuilder {
    //the instance to build
    private CreateCancelChargeRequest createCancelChargeRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CreateCancelChargeRequestBuilder() {
        createCancelChargeRequest = new CreateCancelChargeRequest();
    }

    /**
     * The amount that will be canceled.
     */
    public CreateCancelChargeRequestBuilder amount(Integer amount) {
        createCancelChargeRequest.setAmount(amount);
        return this;
    }

    /**
     * The split rules request
     */
    public CreateCancelChargeRequestBuilder splitRules(List<CreateCancelChargeSplitRulesRequest> splitRules) {
        createCancelChargeRequest.setSplitRules(splitRules);
        return this;
    }

    /**
     * Splits
     */
    public CreateCancelChargeRequestBuilder split(List<CreateSplitRequest> split) {
        createCancelChargeRequest.setSplit(split);
        return this;
    }

    public CreateCancelChargeRequestBuilder operationReference(String operationReference) {
        createCancelChargeRequest.setOperationReference(operationReference);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateCancelChargeRequest build() {
        return createCancelChargeRequest;
    }
}