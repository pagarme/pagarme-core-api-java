/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;

public class GetSellerResponseBuilder {
    //the instance to build
    private GetSellerResponse getSellerResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetSellerResponseBuilder() {
        getSellerResponse = new GetSellerResponse();
    }

    /**
     * Identification
     */
    public GetSellerResponseBuilder id(String id) {
        getSellerResponse.setId(id);
        return this;
    }

    public GetSellerResponseBuilder name(String name) {
        getSellerResponse.setName(name);
        return this;
    }

    public GetSellerResponseBuilder code(String code) {
        getSellerResponse.setCode(code);
        return this;
    }

    public GetSellerResponseBuilder document(String document) {
        getSellerResponse.setDocument(document);
        return this;
    }

    /**
     * Description
     */
    public GetSellerResponseBuilder description(String description) {
        getSellerResponse.setDescription(description);
        return this;
    }

    /**
     * Status
     */
    public GetSellerResponseBuilder status(String status) {
        getSellerResponse.setStatus(status);
        return this;
    }

    /**
     * Creation date
     */
    public GetSellerResponseBuilder createdAt(String createdAt) {
        getSellerResponse.setCreatedAt(createdAt);
        return this;
    }

    /**
     * Updated date
     */
    public GetSellerResponseBuilder updatedAt(String updatedAt) {
        getSellerResponse.setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * Address
     */
    public GetSellerResponseBuilder address(GetAddressResponse address) {
        getSellerResponse.setAddress(address);
        return this;
    }

    /**
     * Metadata
     */
    public GetSellerResponseBuilder metadata(LinkedHashMap<String, String> metadata) {
        getSellerResponse.setMetadata(metadata);
        return this;
    }

    /**
     * Deleted date
     */
    public GetSellerResponseBuilder deletedAt(String deletedAt) {
        getSellerResponse.setDeletedAt(deletedAt);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetSellerResponse build() {
        return getSellerResponse;
    }
}