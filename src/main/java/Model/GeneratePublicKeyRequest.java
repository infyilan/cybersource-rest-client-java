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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GeneratePublicKeyRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-08T03:47:28.632+05:30")
public class GeneratePublicKeyRequest {
  @SerializedName("encryptionType")
  private String encryptionType = null;

  @SerializedName("targetOrigin")
  private String targetOrigin = null;

  @SerializedName("unmaskedLeft")
  private Integer unmaskedLeft = null;

  @SerializedName("unmaskedRight")
  private Integer unmaskedRight = null;

  @SerializedName("enableBillingAddress")
  private Boolean enableBillingAddress = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("enableAutoAuth")
  private Boolean enableAutoAuth = null;

  public GeneratePublicKeyRequest encryptionType(String encryptionType) {
    this.encryptionType = encryptionType;
    return this;
  }

   /**
   * How the card number should be encrypted in the subsequent Tokenize Card request. Possible values are RsaOaep256 or None (if using this value the card number must be in plain text when included in the Tokenize Card request). The Tokenize Card request uses a secure connection (TLS 1.2+) regardless of what encryption type is specified.
   * @return encryptionType
  **/
  @ApiModelProperty(required = true, value = "How the card number should be encrypted in the subsequent Tokenize Card request. Possible values are RsaOaep256 or None (if using this value the card number must be in plain text when included in the Tokenize Card request). The Tokenize Card request uses a secure connection (TLS 1.2+) regardless of what encryption type is specified.")
  public String getEncryptionType() {
    return encryptionType;
  }

  public void setEncryptionType(String encryptionType) {
    this.encryptionType = encryptionType;
  }

  public GeneratePublicKeyRequest targetOrigin(String targetOrigin) {
    this.targetOrigin = targetOrigin;
    return this;
  }

   /**
   * This should only be used if using the Microform implementation. This is the protocol, URL, and if used, port number of the page that will host the Microform. Unless using http://localhost, the protocol must be https://. For example, if serving Microform on example.com, the targetOrigin is https://example.com The value is used to restrict the frame ancestor of the Microform. If there is a mismatch between this value and the frame ancestor, the Microfrom will not load.
   * @return targetOrigin
  **/
  @ApiModelProperty(value = "This should only be used if using the Microform implementation. This is the protocol, URL, and if used, port number of the page that will host the Microform. Unless using http://localhost, the protocol must be https://. For example, if serving Microform on example.com, the targetOrigin is https://example.com The value is used to restrict the frame ancestor of the Microform. If there is a mismatch between this value and the frame ancestor, the Microfrom will not load.")
  public String getTargetOrigin() {
    return targetOrigin;
  }

  public void setTargetOrigin(String targetOrigin) {
    this.targetOrigin = targetOrigin;
  }

  public GeneratePublicKeyRequest unmaskedLeft(Integer unmaskedLeft) {
    this.unmaskedLeft = unmaskedLeft;
    return this;
  }

   /**
   * Specifies the number of card number digits to be returned un-masked from the left. For example, setting this value to 6 will return: 411111XXXXXXXXXX Default value: 6 Maximum value: 6
   * @return unmaskedLeft
  **/
  @ApiModelProperty(value = "Specifies the number of card number digits to be returned un-masked from the left. For example, setting this value to 6 will return: 411111XXXXXXXXXX Default value: 6 Maximum value: 6")
  public Integer getUnmaskedLeft() {
    return unmaskedLeft;
  }

  public void setUnmaskedLeft(Integer unmaskedLeft) {
    this.unmaskedLeft = unmaskedLeft;
  }

  public GeneratePublicKeyRequest unmaskedRight(Integer unmaskedRight) {
    this.unmaskedRight = unmaskedRight;
    return this;
  }

   /**
   * Specifies the number of card number digits to be returned un-masked from the right. For example, setting this value to 4 will return: 411111XXXXXX1111 Default value: 4 Maximum value: 4
   * @return unmaskedRight
  **/
  @ApiModelProperty(value = "Specifies the number of card number digits to be returned un-masked from the right. For example, setting this value to 4 will return: 411111XXXXXX1111 Default value: 4 Maximum value: 4")
  public Integer getUnmaskedRight() {
    return unmaskedRight;
  }

  public void setUnmaskedRight(Integer unmaskedRight) {
    this.unmaskedRight = unmaskedRight;
  }

  public GeneratePublicKeyRequest enableBillingAddress(Boolean enableBillingAddress) {
    this.enableBillingAddress = enableBillingAddress;
    return this;
  }

   /**
   * Specifies whether or not &#39;dummy&#39; address data should be specified in the create token request. If you have &#39;Relaxed AVS&#39; enabled for your MID, this value can be set to False.Default value: true
   * @return enableBillingAddress
  **/
  @ApiModelProperty(value = "Specifies whether or not 'dummy' address data should be specified in the create token request. If you have 'Relaxed AVS' enabled for your MID, this value can be set to False.Default value: true")
  public Boolean getEnableBillingAddress() {
    return enableBillingAddress;
  }

  public void setEnableBillingAddress(Boolean enableBillingAddress) {
    this.enableBillingAddress = enableBillingAddress;
  }

  public GeneratePublicKeyRequest currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Three character ISO currency code to be associated with the token. Required for legacy integrations. Default value: USD.
   * @return currency
  **/
  @ApiModelProperty(value = "Three character ISO currency code to be associated with the token. Required for legacy integrations. Default value: USD.")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public GeneratePublicKeyRequest enableAutoAuth(Boolean enableAutoAuth) {
    this.enableAutoAuth = enableAutoAuth;
    return this;
  }

   /**
   * Specifies whether or not an account verification authorization ($0 Authorization) is carried out on token creation. Default is false, as it is assumed a full or zero amount authorization will be carried out in a separate call from your server.
   * @return enableAutoAuth
  **/
  @ApiModelProperty(value = "Specifies whether or not an account verification authorization ($0 Authorization) is carried out on token creation. Default is false, as it is assumed a full or zero amount authorization will be carried out in a separate call from your server.")
  public Boolean getEnableAutoAuth() {
    return enableAutoAuth;
  }

  public void setEnableAutoAuth(Boolean enableAutoAuth) {
    this.enableAutoAuth = enableAutoAuth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneratePublicKeyRequest generatePublicKeyRequest = (GeneratePublicKeyRequest) o;
    return Objects.equals(this.encryptionType, generatePublicKeyRequest.encryptionType) &&
        Objects.equals(this.targetOrigin, generatePublicKeyRequest.targetOrigin) &&
        Objects.equals(this.unmaskedLeft, generatePublicKeyRequest.unmaskedLeft) &&
        Objects.equals(this.unmaskedRight, generatePublicKeyRequest.unmaskedRight) &&
        Objects.equals(this.enableBillingAddress, generatePublicKeyRequest.enableBillingAddress) &&
        Objects.equals(this.currency, generatePublicKeyRequest.currency) &&
        Objects.equals(this.enableAutoAuth, generatePublicKeyRequest.enableAutoAuth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encryptionType, targetOrigin, unmaskedLeft, unmaskedRight, enableBillingAddress, currency, enableAutoAuth);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneratePublicKeyRequest {\n");
    
    sb.append("    encryptionType: ").append(toIndentedString(encryptionType)).append("\n");
    sb.append("    targetOrigin: ").append(toIndentedString(targetOrigin)).append("\n");
    sb.append("    unmaskedLeft: ").append(toIndentedString(unmaskedLeft)).append("\n");
    sb.append("    unmaskedRight: ").append(toIndentedString(unmaskedRight)).append("\n");
    sb.append("    enableBillingAddress: ").append(toIndentedString(enableBillingAddress)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    enableAutoAuth: ").append(toIndentedString(enableAutoAuth)).append("\n");
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

