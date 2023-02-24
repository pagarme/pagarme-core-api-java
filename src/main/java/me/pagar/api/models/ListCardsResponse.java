/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class ListCardsResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = -5447478474665259359L;
    private List<GetCardResponse> data;
    private PagingResponse paging;
    /** GETTER
     * The card objects
     */
    @JsonGetter("data")
    public List<GetCardResponse> getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * The card objects
     */
    @JsonSetter("data")
    public void setData (List<GetCardResponse> value) { 
        this.data = value;
    }
 
    /** GETTER
     * Object used for returning lists of objects with pagination
     */
    @JsonGetter("paging")
    public PagingResponse getPaging ( ) { 
        return this.paging;
    }
    
    /** SETTER
     * Object used for returning lists of objects with pagination
     */
    @JsonSetter("paging")
    public void setPaging (PagingResponse value) { 
        this.paging = value;
    }
 
}
