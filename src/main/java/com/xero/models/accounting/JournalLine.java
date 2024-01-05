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
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/** JournalLine */
public class JournalLine {
  StringUtil util = new StringUtil();

  @JsonProperty("JournalLineID")
  private UUID journalLineID;

  @JsonProperty("AccountID")
  private UUID accountID;

  @JsonProperty("AccountCode")
  private String accountCode;

  @JsonProperty("AccountType")
  private AccountType accountType;

  @JsonProperty("AccountName")
  private String accountName;

  @JsonProperty("Description")
  private String description;

  @JsonProperty("NetAmount")
  private Double netAmount;

  @JsonProperty("GrossAmount")
  private Double grossAmount;

  @JsonProperty("TaxAmount")
  private Double taxAmount;

  @JsonProperty("TaxType")
  private String taxType;

  @JsonProperty("TaxName")
  private String taxName;

  @JsonProperty("TrackingCategories")
  private List<TrackingCategory> trackingCategories = new ArrayList<TrackingCategory>();
  /**
   * Xero identifier for Journal
   *
   * @param journalLineID UUID
   * @return JournalLine
   */
  public JournalLine journalLineID(UUID journalLineID) {
    this.journalLineID = journalLineID;
    return this;
  }

  /**
   * Xero identifier for Journal
   *
   * @return journalLineID
   */
  @ApiModelProperty(
      example = "7be9db36-3598-4755-ba5c-c2dbc8c4a7a2",
      value = "Xero identifier for Journal")
  /**
   * Xero identifier for Journal
   *
   * @return journalLineID UUID
   */
  public UUID getJournalLineID() {
    return journalLineID;
  }

  /**
   * Xero identifier for Journal
   *
   * @param journalLineID UUID
   */
  public void setJournalLineID(UUID journalLineID) {
    this.journalLineID = journalLineID;
  }

  /**
   * See Accounts
   *
   * @param accountID UUID
   * @return JournalLine
   */
  public JournalLine accountID(UUID accountID) {
    this.accountID = accountID;
    return this;
  }

  /**
   * See Accounts
   *
   * @return accountID
   */
  @ApiModelProperty(example = "ceef66a5-a545-413b-9312-78a53caadbc4", value = "See Accounts")
  /**
   * See Accounts
   *
   * @return accountID UUID
   */
  public UUID getAccountID() {
    return accountID;
  }

  /**
   * See Accounts
   *
   * @param accountID UUID
   */
  public void setAccountID(UUID accountID) {
    this.accountID = accountID;
  }

  /**
   * See Accounts
   *
   * @param accountCode String
   * @return JournalLine
   */
  public JournalLine accountCode(String accountCode) {
    this.accountCode = accountCode;
    return this;
  }

  /**
   * See Accounts
   *
   * @return accountCode
   */
  @ApiModelProperty(example = "90.0", value = "See Accounts")
  /**
   * See Accounts
   *
   * @return accountCode String
   */
  public String getAccountCode() {
    return accountCode;
  }

  /**
   * See Accounts
   *
   * @param accountCode String
   */
  public void setAccountCode(String accountCode) {
    this.accountCode = accountCode;
  }

  /**
   * accountType
   *
   * @param accountType AccountType
   * @return JournalLine
   */
  public JournalLine accountType(AccountType accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Get accountType
   *
   * @return accountType
   */
  @ApiModelProperty(value = "")
  /**
   * accountType
   *
   * @return accountType AccountType
   */
  public AccountType getAccountType() {
    return accountType;
  }

  /**
   * accountType
   *
   * @param accountType AccountType
   */
  public void setAccountType(AccountType accountType) {
    this.accountType = accountType;
  }

  /**
   * See AccountCodes
   *
   * @param accountName String
   * @return JournalLine
   */
  public JournalLine accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * See AccountCodes
   *
   * @return accountName
   */
  @ApiModelProperty(example = "Checking Account", value = "See AccountCodes")
  /**
   * See AccountCodes
   *
   * @return accountName String
   */
  public String getAccountName() {
    return accountName;
  }

  /**
   * See AccountCodes
   *
   * @param accountName String
   */
  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  /**
   * The description from the source transaction line item. Only returned if populated.
   *
   * @param description String
   * @return JournalLine
   */
  public JournalLine description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description from the source transaction line item. Only returned if populated.
   *
   * @return description
   */
  @ApiModelProperty(
      example = "My business checking account",
      value = "The description from the source transaction line item. Only returned if populated.")
  /**
   * The description from the source transaction line item. Only returned if populated.
   *
   * @return description String
   */
  public String getDescription() {
    return description;
  }

  /**
   * The description from the source transaction line item. Only returned if populated.
   *
   * @param description String
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Net amount of journal line. This will be a positive value for a debit and negative for a credit
   *
   * @param netAmount Double
   * @return JournalLine
   */
  public JournalLine netAmount(Double netAmount) {
    this.netAmount = netAmount;
    return this;
  }

  /**
   * Net amount of journal line. This will be a positive value for a debit and negative for a credit
   *
   * @return netAmount
   */
  @ApiModelProperty(
      example = "4130.98",
      value =
          "Net amount of journal line. This will be a positive value for a debit and negative for"
              + " a credit")
  /**
   * Net amount of journal line. This will be a positive value for a debit and negative for a credit
   *
   * @return netAmount Double
   */
  public Double getNetAmount() {
    return netAmount;
  }

  /**
   * Net amount of journal line. This will be a positive value for a debit and negative for a credit
   *
   * @param netAmount Double
   */
  public void setNetAmount(Double netAmount) {
    this.netAmount = netAmount;
  }

  /**
   * Gross amount of journal line (NetAmount + TaxAmount).
   *
   * @param grossAmount Double
   * @return JournalLine
   */
  public JournalLine grossAmount(Double grossAmount) {
    this.grossAmount = grossAmount;
    return this;
  }

  /**
   * Gross amount of journal line (NetAmount + TaxAmount).
   *
   * @return grossAmount
   */
  @ApiModelProperty(
      example = "4130.98",
      value = "Gross amount of journal line (NetAmount + TaxAmount).")
  /**
   * Gross amount of journal line (NetAmount + TaxAmount).
   *
   * @return grossAmount Double
   */
  public Double getGrossAmount() {
    return grossAmount;
  }

  /**
   * Gross amount of journal line (NetAmount + TaxAmount).
   *
   * @param grossAmount Double
   */
  public void setGrossAmount(Double grossAmount) {
    this.grossAmount = grossAmount;
  }

  /**
   * Total tax on a journal line
   *
   * @return taxAmount
   */
  @ApiModelProperty(example = "0.0", value = "Total tax on a journal line")
  /**
   * Total tax on a journal line
   *
   * @return taxAmount Double
   */
  public Double getTaxAmount() {
    return taxAmount;
  }

  /**
   * The tax type from taxRates
   *
   * @param taxType String
   * @return JournalLine
   */
  public JournalLine taxType(String taxType) {
    this.taxType = taxType;
    return this;
  }

  /**
   * The tax type from taxRates
   *
   * @return taxType
   */
  @ApiModelProperty(value = "The tax type from taxRates")
  /**
   * The tax type from taxRates
   *
   * @return taxType String
   */
  public String getTaxType() {
    return taxType;
  }

  /**
   * The tax type from taxRates
   *
   * @param taxType String
   */
  public void setTaxType(String taxType) {
    this.taxType = taxType;
  }

  /**
   * see TaxRates
   *
   * @param taxName String
   * @return JournalLine
   */
  public JournalLine taxName(String taxName) {
    this.taxName = taxName;
    return this;
  }

  /**
   * see TaxRates
   *
   * @return taxName
   */
  @ApiModelProperty(example = "Tax Exempt", value = "see TaxRates")
  /**
   * see TaxRates
   *
   * @return taxName String
   */
  public String getTaxName() {
    return taxName;
  }

  /**
   * see TaxRates
   *
   * @param taxName String
   */
  public void setTaxName(String taxName) {
    this.taxName = taxName;
  }

  /**
   * Optional Tracking Category – see Tracking. Any JournalLine can have a maximum of 2
   * &lt;TrackingCategory&gt; elements.
   *
   * @param trackingCategories List&lt;TrackingCategory&gt;
   * @return JournalLine
   */
  public JournalLine trackingCategories(List<TrackingCategory> trackingCategories) {
    this.trackingCategories = trackingCategories;
    return this;
  }

  /**
   * Optional Tracking Category – see Tracking. Any JournalLine can have a maximum of 2
   * &lt;TrackingCategory&gt; elements.
   *
   * @param trackingCategoriesItem TrackingCategory
   * @return JournalLine
   */
  public JournalLine addTrackingCategoriesItem(TrackingCategory trackingCategoriesItem) {
    if (this.trackingCategories == null) {
      this.trackingCategories = new ArrayList<TrackingCategory>();
    }
    this.trackingCategories.add(trackingCategoriesItem);
    return this;
  }

  /**
   * Optional Tracking Category – see Tracking. Any JournalLine can have a maximum of 2
   * &lt;TrackingCategory&gt; elements.
   *
   * @return trackingCategories
   */
  @ApiModelProperty(
      value =
          "Optional Tracking Category – see Tracking. Any JournalLine can have a maximum of 2"
              + " <TrackingCategory> elements.")
  /**
   * Optional Tracking Category – see Tracking. Any JournalLine can have a maximum of 2
   * &lt;TrackingCategory&gt; elements.
   *
   * @return trackingCategories List<TrackingCategory>
   */
  public List<TrackingCategory> getTrackingCategories() {
    return trackingCategories;
  }

  /**
   * Optional Tracking Category – see Tracking. Any JournalLine can have a maximum of 2
   * &lt;TrackingCategory&gt; elements.
   *
   * @param trackingCategories List&lt;TrackingCategory&gt;
   */
  public void setTrackingCategories(List<TrackingCategory> trackingCategories) {
    this.trackingCategories = trackingCategories;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JournalLine journalLine = (JournalLine) o;
    return Objects.equals(this.journalLineID, journalLine.journalLineID)
        && Objects.equals(this.accountID, journalLine.accountID)
        && Objects.equals(this.accountCode, journalLine.accountCode)
        && Objects.equals(this.accountType, journalLine.accountType)
        && Objects.equals(this.accountName, journalLine.accountName)
        && Objects.equals(this.description, journalLine.description)
        && Objects.equals(this.netAmount, journalLine.netAmount)
        && Objects.equals(this.grossAmount, journalLine.grossAmount)
        && Objects.equals(this.taxAmount, journalLine.taxAmount)
        && Objects.equals(this.taxType, journalLine.taxType)
        && Objects.equals(this.taxName, journalLine.taxName)
        && Objects.equals(this.trackingCategories, journalLine.trackingCategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        journalLineID,
        accountID,
        accountCode,
        accountType,
        accountName,
        description,
        netAmount,
        grossAmount,
        taxAmount,
        taxType,
        taxName,
        trackingCategories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JournalLine {\n");
    sb.append("    journalLineID: ").append(toIndentedString(journalLineID)).append("\n");
    sb.append("    accountID: ").append(toIndentedString(accountID)).append("\n");
    sb.append("    accountCode: ").append(toIndentedString(accountCode)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    netAmount: ").append(toIndentedString(netAmount)).append("\n");
    sb.append("    grossAmount: ").append(toIndentedString(grossAmount)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    taxType: ").append(toIndentedString(taxType)).append("\n");
    sb.append("    taxName: ").append(toIndentedString(taxName)).append("\n");
    sb.append("    trackingCategories: ").append(toIndentedString(trackingCategories)).append("\n");
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