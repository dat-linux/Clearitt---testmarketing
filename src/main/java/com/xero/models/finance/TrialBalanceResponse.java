/*
 * Xero Finance API
 * The Finance API is a collection of endpoints which customers can use in the course of a loan application, which may assist lenders to gain the confidence they need to provide capital.
 *
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.finance;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.threeten.bp.LocalDate;

/** TrialBalanceResponse */
public class TrialBalanceResponse {
  StringUtil util = new StringUtil();

  @JsonProperty("startDate")
  private LocalDate startDate;

  @JsonProperty("endDate")
  private LocalDate endDate;

  @JsonProperty("accounts")
  private List<TrialBalanceAccount> accounts = new ArrayList<TrialBalanceAccount>();
  /**
   * Start date of the report
   *
   * @param startDate LocalDate
   * @return TrialBalanceResponse
   */
  public TrialBalanceResponse startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Start date of the report
   *
   * @return startDate
   */
  @ApiModelProperty(value = "Start date of the report")
  /**
   * Start date of the report
   *
   * @return startDate LocalDate
   */
  public LocalDate getStartDate() {
    return startDate;
  }

  /**
   * Start date of the report
   *
   * @param startDate LocalDate
   */
  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  /**
   * End date of the report
   *
   * @param endDate LocalDate
   * @return TrialBalanceResponse
   */
  public TrialBalanceResponse endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * End date of the report
   *
   * @return endDate
   */
  @ApiModelProperty(value = "End date of the report")
  /**
   * End date of the report
   *
   * @return endDate LocalDate
   */
  public LocalDate getEndDate() {
    return endDate;
  }

  /**
   * End date of the report
   *
   * @param endDate LocalDate
   */
  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }

  /**
   * Refer to the accounts section below
   *
   * @param accounts List&lt;TrialBalanceAccount&gt;
   * @return TrialBalanceResponse
   */
  public TrialBalanceResponse accounts(List<TrialBalanceAccount> accounts) {
    this.accounts = accounts;
    return this;
  }

  /**
   * Refer to the accounts section below
   *
   * @param accountsItem TrialBalanceAccount
   * @return TrialBalanceResponse
   */
  public TrialBalanceResponse addAccountsItem(TrialBalanceAccount accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<TrialBalanceAccount>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

  /**
   * Refer to the accounts section below
   *
   * @return accounts
   */
  @ApiModelProperty(value = "Refer to the accounts section below")
  /**
   * Refer to the accounts section below
   *
   * @return accounts List<TrialBalanceAccount>
   */
  public List<TrialBalanceAccount> getAccounts() {
    return accounts;
  }

  /**
   * Refer to the accounts section below
   *
   * @param accounts List&lt;TrialBalanceAccount&gt;
   */
  public void setAccounts(List<TrialBalanceAccount> accounts) {
    this.accounts = accounts;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrialBalanceResponse trialBalanceResponse = (TrialBalanceResponse) o;
    return Objects.equals(this.startDate, trialBalanceResponse.startDate)
        && Objects.equals(this.endDate, trialBalanceResponse.endDate)
        && Objects.equals(this.accounts, trialBalanceResponse.accounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, accounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrialBalanceResponse {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
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
