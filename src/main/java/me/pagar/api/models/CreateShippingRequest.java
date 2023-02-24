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
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import me.pagar.api.DateTimeHelper;
import org.joda.time.DateTime;

@JsonInclude(Include.ALWAYS)
public class CreateShippingRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 7845437958986733056L;
    private int amount;
    private String description;
    private String recipientName;
    private String recipientPhone;
    private String addressId;
    private CreateAddressRequest address;
    private DateTime maxDeliveryDate;
    private DateTime estimatedDeliveryDate;
    private String type;
    /** GETTER
     * Shipping amount
     */
    @JsonGetter("amount")
    public int getAmount ( ) { 
        return this.amount;
    }
    
    /** SETTER
     * Shipping amount
     */
    @JsonSetter("amount")
    public void setAmount (int value) { 
        this.amount = value;
    }
 
    /** GETTER
     * Description
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * Description
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
    /** GETTER
     * Recipient name
     */
    @JsonGetter("recipient_name")
    public String getRecipientName ( ) { 
        return this.recipientName;
    }
    
    /** SETTER
     * Recipient name
     */
    @JsonSetter("recipient_name")
    public void setRecipientName (String value) { 
        this.recipientName = value;
    }
 
    /** GETTER
     * Recipient phone number
     */
    @JsonGetter("recipient_phone")
    public String getRecipientPhone ( ) { 
        return this.recipientPhone;
    }
    
    /** SETTER
     * Recipient phone number
     */
    @JsonSetter("recipient_phone")
    public void setRecipientPhone (String value) { 
        this.recipientPhone = value;
    }
 
    /** GETTER
     * The id of the address that will be used for shipping
     */
    @JsonGetter("address_id")
    public String getAddressId ( ) { 
        return this.addressId;
    }
    
    /** SETTER
     * The id of the address that will be used for shipping
     */
    @JsonSetter("address_id")
    public void setAddressId (String value) { 
        this.addressId = value;
    }
 
    /** GETTER
     * Request for creating a new Address
     */
    @JsonGetter("address")
    public CreateAddressRequest getAddress ( ) { 
        return this.address;
    }
    
    /** SETTER
     * Request for creating a new Address
     */
    @JsonSetter("address")
    public void setAddress (CreateAddressRequest value) { 
        this.address = value;
    }
 
    /** GETTER
     * Data máxima de entrega
     */
    @JsonGetter("max_delivery_date")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getMaxDeliveryDate ( ) { 
        return this.maxDeliveryDate;
    }
    
    /** SETTER
     * Data máxima de entrega
     */
    @JsonSetter("max_delivery_date")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setMaxDeliveryDate (DateTime value) { 
        this.maxDeliveryDate = value;
    }
 
    /** GETTER
     * Prazo estimado de entrega
     */
    @JsonGetter("estimated_delivery_date")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getEstimatedDeliveryDate ( ) { 
        return this.estimatedDeliveryDate;
    }
    
    /** SETTER
     * Prazo estimado de entrega
     */
    @JsonSetter("estimated_delivery_date")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setEstimatedDeliveryDate (DateTime value) { 
        this.estimatedDeliveryDate = value;
    }
 
    /** GETTER
     * Shipping type
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * Shipping type
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
}
