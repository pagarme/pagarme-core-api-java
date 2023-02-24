/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;

public class ListPlansResponseBuilder {
    //the instance to build
    private ListPlansResponse listPlansResponse;

    /**
     * Default constructor to initialize the instance
     */
    public ListPlansResponseBuilder() {
        listPlansResponse = new ListPlansResponse();
    }

    /**
     * The plan objects
     */
    public ListPlansResponseBuilder data(List<GetPlanResponse> data) {
        listPlansResponse.setData(data);
        return this;
    }

    /**
     * Object used for returning lists of objects with pagination
     */
    public ListPlansResponseBuilder paging(PagingResponse paging) {
        listPlansResponse.setPaging(paging);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ListPlansResponse build() {
        return listPlansResponse;
    }
}