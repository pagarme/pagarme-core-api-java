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
public class GetSellersRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4506300870722416743L;
    private String name;
    private String document;
    private String code;
    private String status;
    private String type;
    private String createdSince;
    private String createdUntil;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("name")
    public String getName ( ) { 
        return this.name;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("name")
    public void setName (String value) { 
        this.name = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("document")
    public String getDocument ( ) { 
        return this.document;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("document")
    public void setDocument (String value) { 
        this.document = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("code")
    public String getCode ( ) { 
        return this.code;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("code")
    public void setCode (String value) { 
        this.code = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("status")
    public String getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("status")
    public void setStatus (String value) { 
        this.status = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("created_Since")
    public String getCreatedSince ( ) { 
        return this.createdSince;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("created_Since")
    public void setCreatedSince (String value) { 
        this.createdSince = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("created_Until")
    public String getCreatedUntil ( ) { 
        return this.createdUntil;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("created_Until")
    public void setCreatedUntil (String value) { 
        this.createdUntil = value;
    }
 
}
