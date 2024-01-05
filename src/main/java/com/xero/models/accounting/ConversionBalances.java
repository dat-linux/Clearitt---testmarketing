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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Balance supplied for each account that has a value as at the conversion date. */
@ApiModel(
    description = "Balance supplied for each account that has a value as at the conversion date.")
public class ConversionBalances {
  StringUtil util = new StringUtil();

  @JsonProperty("AccountCode")
  private String accountCode;

  @JsonProperty("Balance")
  private Double balance;

  @JsonProperty("BalanceDetails")
  private List<BalanceDetails> balanceDetails = new ArrayList<BalanceDetails>();
  /**
   * The account code for a account
   *
   * @param accountCode String
   * @return ConversionBalances
   */
  public ConversionBalances accountCode(String accountCode) {
    this.accountCode = accountCode;
    return this;
  }

  /**
   * The account code for a account
   *
   * @return accountCode
   */
  @ApiModelProperty(value = "The account code for a account")
  /**
   * The account code for a account
   *
   * @return accountCode String
   */
  public String getAccountCode() {
    return accountCode;
  }

  /**
   * The account code for a account
   *
   * @param accountCode String
   */
  public void setAccountCode(String accountCode) {
    this.accountCode = accountCode;
  }

  /**
   * The opening balances of the account. Debits are positive, credits are negative values
   *
   * @param balance Double
   * @return ConversionBalances
   */
  public ConversionBalances balance(Double balance) {
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
   * balanceDetails
   *
   * @param balanceDetails List&lt;BalanceDetails&gt;
   * @return ConversionBalances
   */
  public ConversionBalances balanceDetails(List<BalanceDetails> balanceDetails) {
    this.balanceDetails = balanceDetails;
    return this;
  }

  /**
   * balanceDetails
   *
   * @param balanceDetailsItem BalanceDetails
   * @return ConversionBalances
   */
  public ConversionBalances addBalanceDetailsItem(BalanceDetails balanceDetailsItem) {
    if (this.balanceDetails == null) {
      this.balanceDetails = new ArrayList<BalanceDetails>();
    }
    this.balanceDetails.add(balanceDetailsItem);
    return this;
  }

  /**
   * Get balanceDetails
   *
   * @return balanceDetails
   */
  @ApiModelProperty(value = "")
  /**
   * balanceDetails
   *
   * @return balanceDetails List<BalanceDetails>
   */
  public List<BalanceDetails> getBalanceDetails() {
    return balanceDetails;
  }

  /**
   * balanceDetails
   *
   * @param balanceDetails List&lt;BalanceDetails&gt;
   */
  public void setBalanceDetails(List<BalanceDetails> balanceDetails) {
    this.balanceDetails = balanceDetails;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionBalances conversionBalances = (ConversionBalances) o;
    return Objects.equals(this.accountCode, conversionBalances.accountCode)
        && Objects.equals(this.balance, conversionBalances.balance)
        && Objects.equals(this.balanceDetails, conversionBalances.balanceDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountCode, balance, balanceDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionBalances {\n");
    sb.append("    accountCode: ").append(toIndentedString(accountCode)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    balanceDetails: ").append(toIndentedString(balanceDetails)).append("\n");
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