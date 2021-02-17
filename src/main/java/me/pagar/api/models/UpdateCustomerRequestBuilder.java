/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;

public class UpdateCustomerRequestBuilder {
    //the instance to build
    private UpdateCustomerRequest updateCustomerRequest;

    /**
     * Default constructor to initialize the instance
     */
    public UpdateCustomerRequestBuilder() {
        updateCustomerRequest = new UpdateCustomerRequest();
    }

    /**
     * Name
     */
    public UpdateCustomerRequestBuilder name(String name) {
        updateCustomerRequest.setName(name);
        return this;
    }

    /**
     * Email
     */
    public UpdateCustomerRequestBuilder email(String email) {
        updateCustomerRequest.setEmail(email);
        return this;
    }

    /**
     * Document number
     */
    public UpdateCustomerRequestBuilder document(String document) {
        updateCustomerRequest.setDocument(document);
        return this;
    }

    /**
     * Person type
     */
    public UpdateCustomerRequestBuilder type(String type) {
        updateCustomerRequest.setType(type);
        return this;
    }

    /**
     * Address
     */
    public UpdateCustomerRequestBuilder address(CreateAddressRequest address) {
        updateCustomerRequest.setAddress(address);
        return this;
    }

    /**
     * Metadata
     */
    public UpdateCustomerRequestBuilder metadata(LinkedHashMap<String, String> metadata) {
        updateCustomerRequest.setMetadata(metadata);
        return this;
    }

    public UpdateCustomerRequestBuilder phones(CreatePhonesRequest phones) {
        updateCustomerRequest.setPhones(phones);
        return this;
    }

    /**
     * Código de referência do cliente no sistema da loja. Max: 52 caracteres
     */
    public UpdateCustomerRequestBuilder code(String code) {
        updateCustomerRequest.setCode(code);
        return this;
    }

    /**
     * Gênero do cliente
     */
    public UpdateCustomerRequestBuilder gender(String gender) {
        updateCustomerRequest.setGender(gender);
        return this;
    }

    public UpdateCustomerRequestBuilder documentType(String documentType) {
        updateCustomerRequest.setDocumentType(documentType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UpdateCustomerRequest build() {
        return updateCustomerRequest;
    }
}