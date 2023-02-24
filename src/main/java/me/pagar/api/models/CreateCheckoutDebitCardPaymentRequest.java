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
public class CreateCheckoutDebitCardPaymentRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 6023346449062375754L;
    private String statementDescriptor;
    private CreatePaymentAuthenticationRequest authentication;
    /** GETTER
     * Card invoice text descriptor
     */
    @JsonGetter("statement_descriptor")
    public String getStatementDescriptor ( ) { 
        return this.statementDescriptor;
    }
    
    /** SETTER
     * Card invoice text descriptor
     */
    @JsonSetter("statement_descriptor")
    public void setStatementDescriptor (String value) { 
        this.statementDescriptor = value;
    }
 
    /** GETTER
     * The payment authentication request
     */
    @JsonGetter("authentication")
    public CreatePaymentAuthenticationRequest getAuthentication ( ) { 
        return this.authentication;
    }
    
    /** SETTER
     * The payment authentication request
     */
    @JsonSetter("authentication")
    public void setAuthentication (CreatePaymentAuthenticationRequest value) { 
        this.authentication = value;
    }
 
}
