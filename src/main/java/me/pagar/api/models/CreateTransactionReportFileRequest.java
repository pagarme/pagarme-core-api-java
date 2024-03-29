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
public class CreateTransactionReportFileRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = -36178607326019824L;
    private String name;
    private DateTime startAt;
    private String endAt;
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
    @JsonGetter("start_at")
    @JsonSerialize(using=DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public DateTime getStartAt ( ) { 
        return this.startAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("start_at")
    @JsonDeserialize(using=DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setStartAt (DateTime value) { 
        this.startAt = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("end_at")
    public String getEndAt ( ) { 
        return this.endAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("end_at")
    public void setEndAt (String value) { 
        this.endAt = value;
    }
 
}
