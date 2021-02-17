/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;

public class GetLocationResponseBuilder {
    //the instance to build
    private GetLocationResponse getLocationResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetLocationResponseBuilder() {
        getLocationResponse = new GetLocationResponse();
    }

    /**
     * Latitude
     */
    public GetLocationResponseBuilder latitude(String latitude) {
        getLocationResponse.setLatitude(latitude);
        return this;
    }

    /**
     * Longitude
     */
    public GetLocationResponseBuilder longitude(String longitude) {
        getLocationResponse.setLongitude(longitude);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetLocationResponse build() {
        return getLocationResponse;
    }
}