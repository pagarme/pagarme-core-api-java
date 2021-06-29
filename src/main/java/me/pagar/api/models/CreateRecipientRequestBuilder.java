/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;

public class CreateRecipientRequestBuilder {
    //the instance to build
    private CreateRecipientRequest createRecipientRequest;

    /**
     * Default constructor to initialize the instance
     */
    public CreateRecipientRequestBuilder() {
        createRecipientRequest = new CreateRecipientRequest();
    }

    /**
     * Recipient name
     */
    public CreateRecipientRequestBuilder name(String name) {
        createRecipientRequest.setName(name);
        return this;
    }

    /**
     * Recipient email
     */
    public CreateRecipientRequestBuilder email(String email) {
        createRecipientRequest.setEmail(email);
        return this;
    }

    /**
     * Recipient description
     */
    public CreateRecipientRequestBuilder description(String description) {
        createRecipientRequest.setDescription(description);
        return this;
    }

    /**
     * Recipient document number
     */
    public CreateRecipientRequestBuilder document(String document) {
        createRecipientRequest.setDocument(document);
        return this;
    }

    /**
     * Recipient type
     */
    public CreateRecipientRequestBuilder type(String type) {
        createRecipientRequest.setType(type);
        return this;
    }

    /**
     * Bank account
     */
    public CreateRecipientRequestBuilder defaultBankAccount(CreateBankAccountRequest defaultBankAccount) {
        createRecipientRequest.setDefaultBankAccount(defaultBankAccount);
        return this;
    }

    /**
     * Metadata
     */
    public CreateRecipientRequestBuilder metadata(LinkedHashMap<String, String> metadata) {
        createRecipientRequest.setMetadata(metadata);
        return this;
    }

    /**
     * Receiver Transfer Information
     */
    public CreateRecipientRequestBuilder transferSettings(CreateTransferSettingsRequest transferSettings) {
        createRecipientRequest.setTransferSettings(transferSettings);
        return this;
    }

    /**
     * Recipient code
     */
    public CreateRecipientRequestBuilder code(String code) {
        createRecipientRequest.setCode(code);
        return this;
    }

    /**
     * Payment mode
     */
    public CreateRecipientRequestBuilder paymentMode(String paymentMode) {
        createRecipientRequest.setPaymentMode(paymentMode);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateRecipientRequest build() {
        return createRecipientRequest;
    }
}