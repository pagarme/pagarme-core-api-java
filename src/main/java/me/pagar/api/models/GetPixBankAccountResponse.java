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
public class GetPixBankAccountResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 2903761731985901937L;
    private String bankName;
    private String ispb;
    private String branchCode;
    private String accountNumber;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("bank_name")
    public String getBankName ( ) { 
        return this.bankName;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("bank_name")
    public void setBankName (String value) { 
        this.bankName = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ispb")
    public String getIspb ( ) { 
        return this.ispb;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ispb")
    public void setIspb (String value) { 
        this.ispb = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("branch_code")
    public String getBranchCode ( ) { 
        return this.branchCode;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("branch_code")
    public void setBranchCode (String value) { 
        this.branchCode = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("account_number")
    public String getAccountNumber ( ) { 
        return this.accountNumber;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("account_number")
    public void setAccountNumber (String value) { 
        this.accountNumber = value;
    }
 
}
