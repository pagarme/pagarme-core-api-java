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
public class GetSplitOptionsResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5808561537441955439L;
    private boolean liable;
    private boolean chargeProcessingFee;
    private String chargeRemainderFee;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("liable")
    public boolean getLiable ( ) { 
        return this.liable;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("liable")
    public void setLiable (boolean value) { 
        this.liable = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("charge_processing_fee")
    public boolean getChargeProcessingFee ( ) { 
        return this.chargeProcessingFee;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("charge_processing_fee")
    public void setChargeProcessingFee (boolean value) { 
        this.chargeProcessingFee = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("charge_remainder_fee")
    public String getChargeRemainderFee ( ) { 
        return this.chargeRemainderFee;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("charge_remainder_fee")
    public void setChargeRemainderFee (String value) { 
        this.chargeRemainderFee = value;
    }
 
}
