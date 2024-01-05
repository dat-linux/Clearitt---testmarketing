/*
 * Xero Payroll NZ
 * This is the Xero Payroll API for orgs in the NZ region.
 *
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrollnz;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** TaxSettings */
public class TaxSettings {
  StringUtil util = new StringUtil();

  @JsonProperty("periodUnits")
  private Double periodUnits;
  /** The type of period (\&quot;weeks\&quot; or \&quot;months\&quot;) */
  public enum PeriodTypeEnum {
    /** WEEKS */
    WEEKS("weeks"),

    /** MONTHS */
    MONTHS("months");

    private String value;

    PeriodTypeEnum(String value) {
      this.value = value;
    }

    /**
     * getValue
     *
     * @return String value
     */
    @JsonValue
    public String getValue() {
      return value;
    }

    /**
     * toString
     *
     * @return String value
     */
    @Override
    public String toString() {
      return String.valueOf(value);
    }

    /**
     * fromValue
     *
     * @param value String
     */
    @JsonCreator
    public static PeriodTypeEnum fromValue(String value) {
      for (PeriodTypeEnum b : PeriodTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("periodType")
  private PeriodTypeEnum periodType;

  @JsonProperty("taxCode")
  private TaxCode taxCode;

  @JsonProperty("specialTaxRate")
  private String specialTaxRate;

  @JsonProperty("lumpSumTaxCode")
  private String lumpSumTaxCode;

  @JsonProperty("lumpSumAmount")
  private String lumpSumAmount;
  /**
   * The number of units for the period type
   *
   * @param periodUnits Double
   * @return TaxSettings
   */
  public TaxSettings periodUnits(Double periodUnits) {
    this.periodUnits = periodUnits;
    return this;
  }

  /**
   * The number of units for the period type
   *
   * @return periodUnits
   */
  @ApiModelProperty(value = "The number of units for the period type")
  /**
   * The number of units for the period type
   *
   * @return periodUnits Double
   */
  public Double getPeriodUnits() {
    return periodUnits;
  }

  /**
   * The number of units for the period type
   *
   * @param periodUnits Double
   */
  public void setPeriodUnits(Double periodUnits) {
    this.periodUnits = periodUnits;
  }

  /**
   * The type of period (\&quot;weeks\&quot; or \&quot;months\&quot;)
   *
   * @param periodType PeriodTypeEnum
   * @return TaxSettings
   */
  public TaxSettings periodType(PeriodTypeEnum periodType) {
    this.periodType = periodType;
    return this;
  }

  /**
   * The type of period (\&quot;weeks\&quot; or \&quot;months\&quot;)
   *
   * @return periodType
   */
  @ApiModelProperty(example = "weeks", value = "The type of period (\"weeks\" or \"months\")")
  /**
   * The type of period (\&quot;weeks\&quot; or \&quot;months\&quot;)
   *
   * @return periodType PeriodTypeEnum
   */
  public PeriodTypeEnum getPeriodType() {
    return periodType;
  }

  /**
   * The type of period (\&quot;weeks\&quot; or \&quot;months\&quot;)
   *
   * @param periodType PeriodTypeEnum
   */
  public void setPeriodType(PeriodTypeEnum periodType) {
    this.periodType = periodType;
  }

  /**
   * taxCode
   *
   * @param taxCode TaxCode
   * @return TaxSettings
   */
  public TaxSettings taxCode(TaxCode taxCode) {
    this.taxCode = taxCode;
    return this;
  }

  /**
   * Get taxCode
   *
   * @return taxCode
   */
  @ApiModelProperty(value = "")
  /**
   * taxCode
   *
   * @return taxCode TaxCode
   */
  public TaxCode getTaxCode() {
    return taxCode;
  }

  /**
   * taxCode
   *
   * @param taxCode TaxCode
   */
  public void setTaxCode(TaxCode taxCode) {
    this.taxCode = taxCode;
  }

  /**
   * Tax rate for STC and WT
   *
   * @param specialTaxRate String
   * @return TaxSettings
   */
  public TaxSettings specialTaxRate(String specialTaxRate) {
    this.specialTaxRate = specialTaxRate;
    return this;
  }

  /**
   * Tax rate for STC and WT
   *
   * @return specialTaxRate
   */
  @ApiModelProperty(value = "Tax rate for STC and WT")
  /**
   * Tax rate for STC and WT
   *
   * @return specialTaxRate String
   */
  public String getSpecialTaxRate() {
    return specialTaxRate;
  }

  /**
   * Tax rate for STC and WT
   *
   * @param specialTaxRate String
   */
  public void setSpecialTaxRate(String specialTaxRate) {
    this.specialTaxRate = specialTaxRate;
  }

  /**
   * Tax code for a lump sum amount
   *
   * @param lumpSumTaxCode String
   * @return TaxSettings
   */
  public TaxSettings lumpSumTaxCode(String lumpSumTaxCode) {
    this.lumpSumTaxCode = lumpSumTaxCode;
    return this;
  }

  /**
   * Tax code for a lump sum amount
   *
   * @return lumpSumTaxCode
   */
  @ApiModelProperty(value = "Tax code for a lump sum amount")
  /**
   * Tax code for a lump sum amount
   *
   * @return lumpSumTaxCode String
   */
  public String getLumpSumTaxCode() {
    return lumpSumTaxCode;
  }

  /**
   * Tax code for a lump sum amount
   *
   * @param lumpSumTaxCode String
   */
  public void setLumpSumTaxCode(String lumpSumTaxCode) {
    this.lumpSumTaxCode = lumpSumTaxCode;
  }

  /**
   * The total of the lump sum amount
   *
   * @param lumpSumAmount String
   * @return TaxSettings
   */
  public TaxSettings lumpSumAmount(String lumpSumAmount) {
    this.lumpSumAmount = lumpSumAmount;
    return this;
  }

  /**
   * The total of the lump sum amount
   *
   * @return lumpSumAmount
   */
  @ApiModelProperty(value = "The total of the lump sum amount")
  /**
   * The total of the lump sum amount
   *
   * @return lumpSumAmount String
   */
  public String getLumpSumAmount() {
    return lumpSumAmount;
  }

  /**
   * The total of the lump sum amount
   *
   * @param lumpSumAmount String
   */
  public void setLumpSumAmount(String lumpSumAmount) {
    this.lumpSumAmount = lumpSumAmount;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxSettings taxSettings = (TaxSettings) o;
    return Objects.equals(this.periodUnits, taxSettings.periodUnits)
        && Objects.equals(this.periodType, taxSettings.periodType)
        && Objects.equals(this.taxCode, taxSettings.taxCode)
        && Objects.equals(this.specialTaxRate, taxSettings.specialTaxRate)
        && Objects.equals(this.lumpSumTaxCode, taxSettings.lumpSumTaxCode)
        && Objects.equals(this.lumpSumAmount, taxSettings.lumpSumAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        periodUnits, periodType, taxCode, specialTaxRate, lumpSumTaxCode, lumpSumAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxSettings {\n");
    sb.append("    periodUnits: ").append(toIndentedString(periodUnits)).append("\n");
    sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
    sb.append("    taxCode: ").append(toIndentedString(taxCode)).append("\n");
    sb.append("    specialTaxRate: ").append(toIndentedString(specialTaxRate)).append("\n");
    sb.append("    lumpSumTaxCode: ").append(toIndentedString(lumpSumTaxCode)).append("\n");
    sb.append("    lumpSumAmount: ").append(toIndentedString(lumpSumAmount)).append("\n");
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
