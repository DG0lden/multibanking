/*
 * finAPI RESTful Services
 * finAPI RESTful Services
 *
 * OpenAPI spec version: v1.20.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Container for parameters for the execution of a submitted SEPA money transfer order
 */
@ApiModel(description = "Container for parameters for the execution of a submitted SEPA money transfer order")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-17T14:26:47.047Z")
public class ExecuteSepaMoneyTransferParams {
  @SerializedName("accountId")
  private Long accountId = null;

  @SerializedName("bankingTan")
  private String bankingTan = null;

  public ExecuteSepaMoneyTransferParams accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Identifier of the bank account that you want to transfer money from
   * @return accountId
  **/
  @ApiModelProperty(example = "null", required = true, value = "Identifier of the bank account that you want to transfer money from")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public ExecuteSepaMoneyTransferParams bankingTan(String bankingTan) {
    this.bankingTan = bankingTan;
    return this;
  }

   /**
   * Banking TAN that the user received from the bank for executing the money transfer order
   * @return bankingTan
  **/
  @ApiModelProperty(example = "null", required = true, value = "Banking TAN that the user received from the bank for executing the money transfer order")
  public String getBankingTan() {
    return bankingTan;
  }

  public void setBankingTan(String bankingTan) {
    this.bankingTan = bankingTan;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteSepaMoneyTransferParams executeSepaMoneyTransferParams = (ExecuteSepaMoneyTransferParams) o;
    return Objects.equals(this.accountId, executeSepaMoneyTransferParams.accountId) &&
        Objects.equals(this.bankingTan, executeSepaMoneyTransferParams.bankingTan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, bankingTan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteSepaMoneyTransferParams {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    bankingTan: ").append(toIndentedString(bankingTan)).append("\n");
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

