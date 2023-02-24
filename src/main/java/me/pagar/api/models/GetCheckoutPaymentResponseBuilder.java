/*
 * PagarmeCoreApiLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package me.pagar.api.models;

import java.util.*;
import org.joda.time.DateTime;

public class GetCheckoutPaymentResponseBuilder {
    //the instance to build
    private GetCheckoutPaymentResponse getCheckoutPaymentResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GetCheckoutPaymentResponseBuilder() {
        getCheckoutPaymentResponse = new GetCheckoutPaymentResponse();
    }

    public GetCheckoutPaymentResponseBuilder id(String id) {
        getCheckoutPaymentResponse.setId(id);
        return this;
    }

    /**
     * Valor em centavos
     */
    public GetCheckoutPaymentResponseBuilder amount(Integer amount) {
        getCheckoutPaymentResponse.setAmount(amount);
        return this;
    }

    /**
     * Meio de pagamento padrão no checkout
     */
    public GetCheckoutPaymentResponseBuilder defaultPaymentMethod(String defaultPaymentMethod) {
        getCheckoutPaymentResponse.setDefaultPaymentMethod(defaultPaymentMethod);
        return this;
    }

    /**
     * Url de redirecionamento de sucesso após o checkou
     */
    public GetCheckoutPaymentResponseBuilder successUrl(String successUrl) {
        getCheckoutPaymentResponse.setSuccessUrl(successUrl);
        return this;
    }

    /**
     * Url para pagamento usando o checkout
     */
    public GetCheckoutPaymentResponseBuilder paymentUrl(String paymentUrl) {
        getCheckoutPaymentResponse.setPaymentUrl(paymentUrl);
        return this;
    }

    /**
     * Código da afiliação onde o pagamento será processado no gateway
     */
    public GetCheckoutPaymentResponseBuilder gatewayAffiliationId(String gatewayAffiliationId) {
        getCheckoutPaymentResponse.setGatewayAffiliationId(gatewayAffiliationId);
        return this;
    }

    /**
     * Meios de pagamento aceitos no checkout
     */
    public GetCheckoutPaymentResponseBuilder acceptedPaymentMethods(List<String> acceptedPaymentMethods) {
        getCheckoutPaymentResponse.setAcceptedPaymentMethods(acceptedPaymentMethods);
        return this;
    }

    /**
     * Status do checkout
     */
    public GetCheckoutPaymentResponseBuilder status(String status) {
        getCheckoutPaymentResponse.setStatus(status);
        return this;
    }

    /**
     * Pular tela de sucesso pós-pagamento?
     */
    public GetCheckoutPaymentResponseBuilder skipCheckoutSuccessPage(boolean skipCheckoutSuccessPage) {
        getCheckoutPaymentResponse.setSkipCheckoutSuccessPage(skipCheckoutSuccessPage);
        return this;
    }

    /**
     * Data de criação
     */
    public GetCheckoutPaymentResponseBuilder createdAt(DateTime createdAt) {
        getCheckoutPaymentResponse.setCreatedAt(createdAt);
        return this;
    }

    /**
     * Data de atualização
     */
    public GetCheckoutPaymentResponseBuilder updatedAt(DateTime updatedAt) {
        getCheckoutPaymentResponse.setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * Data de cancelamento
     */
    public GetCheckoutPaymentResponseBuilder canceledAt(DateTime canceledAt) {
        getCheckoutPaymentResponse.setCanceledAt(canceledAt);
        return this;
    }

    /**
     * Torna o objeto customer editável
     */
    public GetCheckoutPaymentResponseBuilder customerEditable(boolean customerEditable) {
        getCheckoutPaymentResponse.setCustomerEditable(customerEditable);
        return this;
    }

    /**
     * Response object for getting a customer
     */
    public GetCheckoutPaymentResponseBuilder customer(GetCustomerResponse customer) {
        getCheckoutPaymentResponse.setCustomer(customer);
        return this;
    }

    /**
     * Response object for getting an Address
     */
    public GetCheckoutPaymentResponseBuilder billingaddress(GetAddressResponse billingaddress) {
        getCheckoutPaymentResponse.setBillingaddress(billingaddress);
        return this;
    }

    public GetCheckoutPaymentResponseBuilder creditCard(GetCheckoutCreditCardPaymentResponse creditCard) {
        getCheckoutPaymentResponse.setCreditCard(creditCard);
        return this;
    }

    public GetCheckoutPaymentResponseBuilder boleto(GetCheckoutBoletoPaymentResponse boleto) {
        getCheckoutPaymentResponse.setBoleto(boleto);
        return this;
    }

    /**
     * Indica se o billing address poderá ser editado
     */
    public GetCheckoutPaymentResponseBuilder billingAddressEditable(boolean billingAddressEditable) {
        getCheckoutPaymentResponse.setBillingAddressEditable(billingAddressEditable);
        return this;
    }

    /**
     * Response object for getting the shipping data
     */
    public GetCheckoutPaymentResponseBuilder shipping(GetShippingResponse shipping) {
        getCheckoutPaymentResponse.setShipping(shipping);
        return this;
    }

    /**
     * Indica se possui entrega
     */
    public GetCheckoutPaymentResponseBuilder shippable(boolean shippable) {
        getCheckoutPaymentResponse.setShippable(shippable);
        return this;
    }

    /**
     * Data de fechamento
     */
    public GetCheckoutPaymentResponseBuilder closedAt(DateTime closedAt) {
        getCheckoutPaymentResponse.setClosedAt(closedAt);
        return this;
    }

    /**
     * Data de expiração
     */
    public GetCheckoutPaymentResponseBuilder expiresAt(DateTime expiresAt) {
        getCheckoutPaymentResponse.setExpiresAt(expiresAt);
        return this;
    }

    /**
     * Moeda
     */
    public GetCheckoutPaymentResponseBuilder currency(String currency) {
        getCheckoutPaymentResponse.setCurrency(currency);
        return this;
    }

    public GetCheckoutPaymentResponseBuilder debitCard(GetCheckoutDebitCardPaymentResponse debitCard) {
        getCheckoutPaymentResponse.setDebitCard(debitCard);
        return this;
    }

    /**
     * Bank transfer checkout response
     */
    public GetCheckoutPaymentResponseBuilder bankTransfer(GetCheckoutBankTransferPaymentResponse bankTransfer) {
        getCheckoutPaymentResponse.setBankTransfer(bankTransfer);
        return this;
    }

    /**
     * Accepted Brands
     */
    public GetCheckoutPaymentResponseBuilder acceptedBrands(List<String> acceptedBrands) {
        getCheckoutPaymentResponse.setAcceptedBrands(acceptedBrands);
        return this;
    }

    /**
     * Checkout pix payment response
     */
    public GetCheckoutPaymentResponseBuilder pix(GetCheckoutPixPaymentResponse pix) {
        getCheckoutPaymentResponse.setPix(pix);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetCheckoutPaymentResponse build() {
        return getCheckoutPaymentResponse;
    }
}