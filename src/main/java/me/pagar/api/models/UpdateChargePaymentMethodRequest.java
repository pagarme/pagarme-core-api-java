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
public class UpdateChargePaymentMethodRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 1454816263909885485L;
    private boolean updateSubscription;
    private String paymentMethod;
    private CreateCreditCardPaymentRequest creditCard;
    private CreateDebitCardPaymentRequest debitCard;
    private CreateBoletoPaymentRequest boleto;
    private CreateVoucherPaymentRequest voucher;
    private CreateCashPaymentRequest cash;
    private CreateBankTransferPaymentRequest bankTransfer;
    private CreatePrivateLabelPaymentRequest privateLabel;
    /** GETTER
     * Indicates if the payment method from the subscription must also be updated
     */
    @JsonGetter("update_subscription")
    public boolean getUpdateSubscription ( ) { 
        return this.updateSubscription;
    }
    
    /** SETTER
     * Indicates if the payment method from the subscription must also be updated
     */
    @JsonSetter("update_subscription")
    public void setUpdateSubscription (boolean value) { 
        this.updateSubscription = value;
    }
 
    /** GETTER
     * The new payment method
     */
    @JsonGetter("payment_method")
    public String getPaymentMethod ( ) { 
        return this.paymentMethod;
    }
    
    /** SETTER
     * The new payment method
     */
    @JsonSetter("payment_method")
    public void setPaymentMethod (String value) { 
        this.paymentMethod = value;
    }
 
    /** GETTER
     * The settings for creating a credit card payment
     */
    @JsonGetter("credit_card")
    public CreateCreditCardPaymentRequest getCreditCard ( ) { 
        return this.creditCard;
    }
    
    /** SETTER
     * The settings for creating a credit card payment
     */
    @JsonSetter("credit_card")
    public void setCreditCard (CreateCreditCardPaymentRequest value) { 
        this.creditCard = value;
    }
 
    /** GETTER
     * The settings for creating a debit card payment
     */
    @JsonGetter("debit_card")
    public CreateDebitCardPaymentRequest getDebitCard ( ) { 
        return this.debitCard;
    }
    
    /** SETTER
     * The settings for creating a debit card payment
     */
    @JsonSetter("debit_card")
    public void setDebitCard (CreateDebitCardPaymentRequest value) { 
        this.debitCard = value;
    }
 
    /** GETTER
     * Contains the settings for creating a boleto payment
     */
    @JsonGetter("boleto")
    public CreateBoletoPaymentRequest getBoleto ( ) { 
        return this.boleto;
    }
    
    /** SETTER
     * Contains the settings for creating a boleto payment
     */
    @JsonSetter("boleto")
    public void setBoleto (CreateBoletoPaymentRequest value) { 
        this.boleto = value;
    }
 
    /** GETTER
     * The settings for creating a voucher payment
     */
    @JsonGetter("voucher")
    public CreateVoucherPaymentRequest getVoucher ( ) { 
        return this.voucher;
    }
    
    /** SETTER
     * The settings for creating a voucher payment
     */
    @JsonSetter("voucher")
    public void setVoucher (CreateVoucherPaymentRequest value) { 
        this.voucher = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("cash")
    public CreateCashPaymentRequest getCash ( ) { 
        return this.cash;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("cash")
    public void setCash (CreateCashPaymentRequest value) { 
        this.cash = value;
    }
 
    /** GETTER
     * Request for creating a bank transfer payment
     */
    @JsonGetter("bank_transfer")
    public CreateBankTransferPaymentRequest getBankTransfer ( ) { 
        return this.bankTransfer;
    }
    
    /** SETTER
     * Request for creating a bank transfer payment
     */
    @JsonSetter("bank_transfer")
    public void setBankTransfer (CreateBankTransferPaymentRequest value) { 
        this.bankTransfer = value;
    }
 
    /** GETTER
     * The settings for creating a private label payment
     */
    @JsonGetter("private_label")
    public CreatePrivateLabelPaymentRequest getPrivateLabel ( ) { 
        return this.privateLabel;
    }
    
    /** SETTER
     * The settings for creating a private label payment
     */
    @JsonSetter("private_label")
    public void setPrivateLabel (CreatePrivateLabelPaymentRequest value) { 
        this.privateLabel = value;
    }
 
}
