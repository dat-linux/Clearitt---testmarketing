/*
 * Xero Accounting API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.accounting;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** An array to specify multiple currency balances of an account */
@ApiModel(description = "An array to specify multiple currency balances of an account")
public class BalanceDetails {
  StringUtil util = new StringUtil();

  @JsonProperty("Balance")
  private Double balance;

  @JsonProperty("CurrencyCode")
  private String currencyCode;

  @JsonProperty("CurrencyRate")
  private Double currencyRate;
  /**
   * The opening balances of the account. Debits are positive, credits are negative values
   *
   * @param balance Double
   * @return BalanceDetails
   */
  public BalanceDetails balance(Double balance) {
    this.balance = balance;
    return this;
  }

  /**
   * The opening balances of the account. Debits are positive, credits are negative values
   *
   * @return balance
   */
  @ApiModelProperty(
      value =
          "The opening balances of the account. Debits are positive, credits are negative values")
  /**
   * The opening balances of the account. Debits are positive, credits are negative values
   *
   * @return balance Double
   */
  public Double getBalance() {
    return balance;
  }

  /**
   * The opening balances of the account. Debits are positive, credits are negative values
   *
   * @param balance Double
   */
  public void setBalance(Double balance) {
    this.balance = balance;
  }

  /**
   * The currency of the balance (Not required for base currency)
   *
   * @param currencyCode String
   * @return BalanceDetails
   */
  public BalanceDetails currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * The currency of the balance (Not required for base currency)
   *
   * @return currencyCode
   */
  @ApiModelProperty(value = "The currency of the balance (Not required for base currency)")
  /**
   * The currency of the balance (Not required for base currency)
   *
   * @return currencyCode String
   */
  public String getCurrencyCode() {
    return currencyCode;
  }

  /**
   * The currency of the balance (Not required for base currency)
   *
   * @param currencyCode String
   */
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  /**
   * (Optional) Exchange rate to base currency when money is spent or received. If not specified, XE
   * rate for the day is applied
   *
   * @param currencyRate Double
   * @return BalanceDetails
   */
  public BalanceDetails currencyRate(Double currencyRate) {
    this.currencyRate = currencyRate;
    return this;
  }

  /**
   * (Optional) Exchange rate to base currency when money is spent or received. If not specified, XE
   * rate for the day is applied
   *
   * @return currencyRate
   */
  @ApiModelProperty(
      value =
          "(Optional) Exchange rate to base currency when money is spent or received. If not"
              + " specified, XE rate for the day is applied")
  /**
   * (Optional) Exchange rate to base currency when money is spent or received. If not specified, XE
   * rate for the day is applied
   *
   * @return currencyRate Double
   */
  public Double getCurrencyRate() {
    return currencyRate;
  }

  /**
   * (Optional) Exchange rate to base currency when money is spent or received. If not specified, XE
   * rate for the day is applied
   *
   * @param currencyRate Double
   */
  public void setCurrencyRate(Double currencyRate) {
    this.currencyRate = currencyRate;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalanceDetails balanceDetails = (BalanceDetails) o;
    return Objects.equals(this.balance, balanceDetails.balance)
        && Objects.equals(this.currencyCode, balanceDetails.currencyCode)
        && Objects.equals(this.currencyRate, balanceDetails.currencyRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, currencyCode, currencyRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceDetails {\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    currencyRate: ").append(toIndentedString(currencyRate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
