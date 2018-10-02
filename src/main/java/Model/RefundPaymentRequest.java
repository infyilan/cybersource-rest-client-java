/*
 * CyberSource Flex API
 * Simple PAN tokenization service
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Model;

import java.util.Objects;
import Model.V2paymentsClientReferenceInformation;
import Model.V2paymentsDeviceInformation;
import Model.V2paymentsMerchantDefinedInformation;
import Model.V2paymentsidcapturesAggregatorInformation;
import Model.V2paymentsidcapturesBuyerInformation;
import Model.V2paymentsidrefundsMerchantInformation;
import Model.V2paymentsidrefundsOrderInformation;
import Model.V2paymentsidrefundsPaymentInformation;
import Model.V2paymentsidrefundsPointOfSaleInformation;
import Model.V2paymentsidrefundsProcessingInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * RefundPaymentRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-22T07:56:07.186+05:30")
public class RefundPaymentRequest {
  @SerializedName("clientReferenceInformation")
  private V2paymentsClientReferenceInformation clientReferenceInformation = null;

  @SerializedName("processingInformation")
  private V2paymentsidrefundsProcessingInformation processingInformation = null;

  @SerializedName("paymentInformation")
  private V2paymentsidrefundsPaymentInformation paymentInformation = null;

  @SerializedName("orderInformation")
  private V2paymentsidrefundsOrderInformation orderInformation = null;

  @SerializedName("buyerInformation")
  private V2paymentsidcapturesBuyerInformation buyerInformation = null;

  @SerializedName("deviceInformation")
  private V2paymentsDeviceInformation deviceInformation = null;

  @SerializedName("merchantInformation")
  private V2paymentsidrefundsMerchantInformation merchantInformation = null;

  @SerializedName("aggregatorInformation")
  private V2paymentsidcapturesAggregatorInformation aggregatorInformation = null;

  @SerializedName("pointOfSaleInformation")
  private V2paymentsidrefundsPointOfSaleInformation pointOfSaleInformation = null;

  @SerializedName("merchantDefinedInformation")
  private List<V2paymentsMerchantDefinedInformation> merchantDefinedInformation = null;

  public RefundPaymentRequest clientReferenceInformation(V2paymentsClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
    return this;
  }

   /**
   * Get clientReferenceInformation
   * @return clientReferenceInformation
  **/
  @ApiModelProperty(value = "")
  public V2paymentsClientReferenceInformation getClientReferenceInformation() {
    return clientReferenceInformation;
  }

  public void setClientReferenceInformation(V2paymentsClientReferenceInformation clientReferenceInformation) {
    this.clientReferenceInformation = clientReferenceInformation;
  }

  public RefundPaymentRequest processingInformation(V2paymentsidrefundsProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
    return this;
  }

   /**
   * Get processingInformation
   * @return processingInformation
  **/
  @ApiModelProperty(value = "")
  public V2paymentsidrefundsProcessingInformation getProcessingInformation() {
    return processingInformation;
  }

  public void setProcessingInformation(V2paymentsidrefundsProcessingInformation processingInformation) {
    this.processingInformation = processingInformation;
  }

  public RefundPaymentRequest paymentInformation(V2paymentsidrefundsPaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
    return this;
  }

   /**
   * Get paymentInformation
   * @return paymentInformation
  **/
  @ApiModelProperty(value = "")
  public V2paymentsidrefundsPaymentInformation getPaymentInformation() {
    return paymentInformation;
  }

  public void setPaymentInformation(V2paymentsidrefundsPaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
  }

  public RefundPaymentRequest orderInformation(V2paymentsidrefundsOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
    return this;
  }

   /**
   * Get orderInformation
   * @return orderInformation
  **/
  @ApiModelProperty(value = "")
  public V2paymentsidrefundsOrderInformation getOrderInformation() {
    return orderInformation;
  }

  public void setOrderInformation(V2paymentsidrefundsOrderInformation orderInformation) {
    this.orderInformation = orderInformation;
  }

  public RefundPaymentRequest buyerInformation(V2paymentsidcapturesBuyerInformation buyerInformation) {
    this.buyerInformation = buyerInformation;
    return this;
  }

   /**
   * Get buyerInformation
   * @return buyerInformation
  **/
  @ApiModelProperty(value = "")
  public V2paymentsidcapturesBuyerInformation getBuyerInformation() {
    return buyerInformation;
  }

  public void setBuyerInformation(V2paymentsidcapturesBuyerInformation buyerInformation) {
    this.buyerInformation = buyerInformation;
  }

  public RefundPaymentRequest deviceInformation(V2paymentsDeviceInformation deviceInformation) {
    this.deviceInformation = deviceInformation;
    return this;
  }

   /**
   * Get deviceInformation
   * @return deviceInformation
  **/
  @ApiModelProperty(value = "")
  public V2paymentsDeviceInformation getDeviceInformation() {
    return deviceInformation;
  }

  public void setDeviceInformation(V2paymentsDeviceInformation deviceInformation) {
    this.deviceInformation = deviceInformation;
  }

  public RefundPaymentRequest merchantInformation(V2paymentsidrefundsMerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
    return this;
  }

   /**
   * Get merchantInformation
   * @return merchantInformation
  **/
  @ApiModelProperty(value = "")
  public V2paymentsidrefundsMerchantInformation getMerchantInformation() {
    return merchantInformation;
  }

  public void setMerchantInformation(V2paymentsidrefundsMerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
  }

  public RefundPaymentRequest aggregatorInformation(V2paymentsidcapturesAggregatorInformation aggregatorInformation) {
    this.aggregatorInformation = aggregatorInformation;
    return this;
  }

   /**
   * Get aggregatorInformation
   * @return aggregatorInformation
  **/
  @ApiModelProperty(value = "")
  public V2paymentsidcapturesAggregatorInformation getAggregatorInformation() {
    return aggregatorInformation;
  }

  public void setAggregatorInformation(V2paymentsidcapturesAggregatorInformation aggregatorInformation) {
    this.aggregatorInformation = aggregatorInformation;
  }

  public RefundPaymentRequest pointOfSaleInformation(V2paymentsidrefundsPointOfSaleInformation pointOfSaleInformation) {
    this.pointOfSaleInformation = pointOfSaleInformation;
    return this;
  }

   /**
   * Get pointOfSaleInformation
   * @return pointOfSaleInformation
  **/
  @ApiModelProperty(value = "")
  public V2paymentsidrefundsPointOfSaleInformation getPointOfSaleInformation() {
    return pointOfSaleInformation;
  }

  public void setPointOfSaleInformation(V2paymentsidrefundsPointOfSaleInformation pointOfSaleInformation) {
    this.pointOfSaleInformation = pointOfSaleInformation;
  }

  public RefundPaymentRequest merchantDefinedInformation(List<V2paymentsMerchantDefinedInformation> merchantDefinedInformation) {
    this.merchantDefinedInformation = merchantDefinedInformation;
    return this;
  }

  public RefundPaymentRequest addMerchantDefinedInformationItem(V2paymentsMerchantDefinedInformation merchantDefinedInformationItem) {
    if (this.merchantDefinedInformation == null) {
      this.merchantDefinedInformation = new ArrayList<V2paymentsMerchantDefinedInformation>();
    }
    this.merchantDefinedInformation.add(merchantDefinedInformationItem);
    return this;
  }

   /**
   * TBD
   * @return merchantDefinedInformation
  **/
  @ApiModelProperty(value = "TBD")
  public List<V2paymentsMerchantDefinedInformation> getMerchantDefinedInformation() {
    return merchantDefinedInformation;
  }

  public void setMerchantDefinedInformation(List<V2paymentsMerchantDefinedInformation> merchantDefinedInformation) {
    this.merchantDefinedInformation = merchantDefinedInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundPaymentRequest refundPaymentRequest = (RefundPaymentRequest) o;
    return Objects.equals(this.clientReferenceInformation, refundPaymentRequest.clientReferenceInformation) &&
        Objects.equals(this.processingInformation, refundPaymentRequest.processingInformation) &&
        Objects.equals(this.paymentInformation, refundPaymentRequest.paymentInformation) &&
        Objects.equals(this.orderInformation, refundPaymentRequest.orderInformation) &&
        Objects.equals(this.buyerInformation, refundPaymentRequest.buyerInformation) &&
        Objects.equals(this.deviceInformation, refundPaymentRequest.deviceInformation) &&
        Objects.equals(this.merchantInformation, refundPaymentRequest.merchantInformation) &&
        Objects.equals(this.aggregatorInformation, refundPaymentRequest.aggregatorInformation) &&
        Objects.equals(this.pointOfSaleInformation, refundPaymentRequest.pointOfSaleInformation) &&
        Objects.equals(this.merchantDefinedInformation, refundPaymentRequest.merchantDefinedInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientReferenceInformation, processingInformation, paymentInformation, orderInformation, buyerInformation, deviceInformation, merchantInformation, aggregatorInformation, pointOfSaleInformation, merchantDefinedInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundPaymentRequest {\n");
    
    sb.append("    clientReferenceInformation: ").append(toIndentedString(clientReferenceInformation)).append("\n");
    sb.append("    processingInformation: ").append(toIndentedString(processingInformation)).append("\n");
    sb.append("    paymentInformation: ").append(toIndentedString(paymentInformation)).append("\n");
    sb.append("    orderInformation: ").append(toIndentedString(orderInformation)).append("\n");
    sb.append("    buyerInformation: ").append(toIndentedString(buyerInformation)).append("\n");
    sb.append("    deviceInformation: ").append(toIndentedString(deviceInformation)).append("\n");
    sb.append("    merchantInformation: ").append(toIndentedString(merchantInformation)).append("\n");
    sb.append("    aggregatorInformation: ").append(toIndentedString(aggregatorInformation)).append("\n");
    sb.append("    pointOfSaleInformation: ").append(toIndentedString(pointOfSaleInformation)).append("\n");
    sb.append("    merchantDefinedInformation: ").append(toIndentedString(merchantDefinedInformation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
