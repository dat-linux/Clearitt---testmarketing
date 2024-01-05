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
import org.threeten.bp.LocalDate;

/** EmployeeTax */
public class EmployeeTax {
  StringUtil util = new StringUtil();

  @JsonProperty("irdNumber")
  private String irdNumber;

  @JsonProperty("taxCode")
  private TaxCode taxCode;

  @JsonProperty("specialTaxRatePercentage")
  private Double specialTaxRatePercentage;

  @JsonProperty("hasSpecialStudentLoanRate")
  private Boolean hasSpecialStudentLoanRate;

  @JsonProperty("specialStudentLoanRatePercentage")
  private Double specialStudentLoanRatePercentage;

  @JsonProperty("isEligibleForKiwiSaver")
  private Boolean isEligibleForKiwiSaver;

  @JsonProperty("esctRatePercentage")
  private Double esctRatePercentage;
  /**
   * Contribution Option which can be &#39;MakeContributions&#39; &#39;OptOut&#39;,
   * &#39;OnAContributionsHoliday&#39;, &#39;OnASavingsSuspension&#39;,
   * &#39;NotCurrentlyAKiwiSaverMember&#39; for employees without a KiwiSaver membership
   */
  public enum KiwiSaverContributionsEnum {
    /** MAKECONTRIBUTIONS */
    MAKECONTRIBUTIONS("MakeContributions"),

    /** OPTOUT */
    OPTOUT("OptOut"),

    /** ONACONTRIBUTIONSHOLIDAY */
    ONACONTRIBUTIONSHOLIDAY("OnAContributionsHoliday"),

    /** ONASAVINGSSUSPENSION */
    ONASAVINGSSUSPENSION("OnASavingsSuspension"),

    /** NOTCURRENTLYAKIWISAVERMEMBER */
    NOTCURRENTLYAKIWISAVERMEMBER("NotCurrentlyAKiwiSaverMember");

    private String value;

    KiwiSaverContributionsEnum(String value) {
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
    public static KiwiSaverContributionsEnum fromValue(String value) {
      for (KiwiSaverContributionsEnum b : KiwiSaverContributionsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("kiwiSaverContributions")
  private KiwiSaverContributionsEnum kiwiSaverContributions;

  @JsonProperty("kiwiSaverEmployeeContributionRatePercentage")
  private Double kiwiSaverEmployeeContributionRatePercentage;

  @JsonProperty("kiwiSaverEmployerContributionRatePercentage")
  private Double kiwiSaverEmployerContributionRatePercentage;

  @JsonProperty("kiwiSaverEmployerSalarySacrificeContributionRatePercentage")
  private Double kiwiSaverEmployerSalarySacrificeContributionRatePercentage;

  @JsonProperty("kiwiSaverOptOutDate")
  private LocalDate kiwiSaverOptOutDate;

  @JsonProperty("kiwiSaverContributionHolidayEndDate")
  private LocalDate kiwiSaverContributionHolidayEndDate;

  @JsonProperty("hasStudentLoanBalance")
  private Boolean hasStudentLoanBalance;

  @JsonProperty("studentLoanBalance")
  private Double studentLoanBalance;

  @JsonProperty("studentLoanAsAt")
  private LocalDate studentLoanAsAt;
  /**
   * The IRD Number.
   *
   * @param irdNumber String
   * @return EmployeeTax
   */
  public EmployeeTax irdNumber(String irdNumber) {
    this.irdNumber = irdNumber;
    return this;
  }

  /**
   * The IRD Number.
   *
   * @return irdNumber
   */
  @ApiModelProperty(example = "111111111", value = "The IRD Number.")
  /**
   * The IRD Number.
   *
   * @return irdNumber String
   */
  public String getIrdNumber() {
    return irdNumber;
  }

  /**
   * The IRD Number.
   *
   * @param irdNumber String
   */
  public void setIrdNumber(String irdNumber) {
    this.irdNumber = irdNumber;
  }

  /**
   * taxCode
   *
   * @param taxCode TaxCode
   * @return EmployeeTax
   */
  public EmployeeTax taxCode(TaxCode taxCode) {
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
   * Special tax rate percentage.
   *
   * @param specialTaxRatePercentage Double
   * @return EmployeeTax
   */
  public EmployeeTax specialTaxRatePercentage(Double specialTaxRatePercentage) {
    this.specialTaxRatePercentage = specialTaxRatePercentage;
    return this;
  }

  /**
   * Special tax rate percentage.
   *
   * @return specialTaxRatePercentage
   */
  @ApiModelProperty(example = "17.5", value = "Special tax rate percentage.")
  /**
   * Special tax rate percentage.
   *
   * @return specialTaxRatePercentage Double
   */
  public Double getSpecialTaxRatePercentage() {
    return specialTaxRatePercentage;
  }

  /**
   * Special tax rate percentage.
   *
   * @param specialTaxRatePercentage Double
   */
  public void setSpecialTaxRatePercentage(Double specialTaxRatePercentage) {
    this.specialTaxRatePercentage = specialTaxRatePercentage;
  }

  /**
   * Does the employee has a special student loan rate?
   *
   * @param hasSpecialStudentLoanRate Boolean
   * @return EmployeeTax
   */
  public EmployeeTax hasSpecialStudentLoanRate(Boolean hasSpecialStudentLoanRate) {
    this.hasSpecialStudentLoanRate = hasSpecialStudentLoanRate;
    return this;
  }

  /**
   * Does the employee has a special student loan rate?
   *
   * @return hasSpecialStudentLoanRate
   */
  @ApiModelProperty(example = "true", value = "Does the employee has a special student loan rate?")
  /**
   * Does the employee has a special student loan rate?
   *
   * @return hasSpecialStudentLoanRate Boolean
   */
  public Boolean getHasSpecialStudentLoanRate() {
    return hasSpecialStudentLoanRate;
  }

  /**
   * Does the employee has a special student loan rate?
   *
   * @param hasSpecialStudentLoanRate Boolean
   */
  public void setHasSpecialStudentLoanRate(Boolean hasSpecialStudentLoanRate) {
    this.hasSpecialStudentLoanRate = hasSpecialStudentLoanRate;
  }

  /**
   * The employee student loan rate percentage.
   *
   * @param specialStudentLoanRatePercentage Double
   * @return EmployeeTax
   */
  public EmployeeTax specialStudentLoanRatePercentage(Double specialStudentLoanRatePercentage) {
    this.specialStudentLoanRatePercentage = specialStudentLoanRatePercentage;
    return this;
  }

  /**
   * The employee student loan rate percentage.
   *
   * @return specialStudentLoanRatePercentage
   */
  @ApiModelProperty(example = "2.0", value = "The employee student loan rate percentage.")
  /**
   * The employee student loan rate percentage.
   *
   * @return specialStudentLoanRatePercentage Double
   */
  public Double getSpecialStudentLoanRatePercentage() {
    return specialStudentLoanRatePercentage;
  }

  /**
   * The employee student loan rate percentage.
   *
   * @param specialStudentLoanRatePercentage Double
   */
  public void setSpecialStudentLoanRatePercentage(Double specialStudentLoanRatePercentage) {
    this.specialStudentLoanRatePercentage = specialStudentLoanRatePercentage;
  }

  /**
   * The employee eligibility for KiwiSaver.
   *
   * @param isEligibleForKiwiSaver Boolean
   * @return EmployeeTax
   */
  public EmployeeTax isEligibleForKiwiSaver(Boolean isEligibleForKiwiSaver) {
    this.isEligibleForKiwiSaver = isEligibleForKiwiSaver;
    return this;
  }

  /**
   * The employee eligibility for KiwiSaver.
   *
   * @return isEligibleForKiwiSaver
   */
  @ApiModelProperty(example = "true", value = "The employee eligibility for KiwiSaver.")
  /**
   * The employee eligibility for KiwiSaver.
   *
   * @return isEligibleForKiwiSaver Boolean
   */
  public Boolean getIsEligibleForKiwiSaver() {
    return isEligibleForKiwiSaver;
  }

  /**
   * The employee eligibility for KiwiSaver.
   *
   * @param isEligibleForKiwiSaver Boolean
   */
  public void setIsEligibleForKiwiSaver(Boolean isEligibleForKiwiSaver) {
    this.isEligibleForKiwiSaver = isEligibleForKiwiSaver;
  }

  /**
   * Employer superannuation contribution tax rate.
   *
   * @param esctRatePercentage Double
   * @return EmployeeTax
   */
  public EmployeeTax esctRatePercentage(Double esctRatePercentage) {
    this.esctRatePercentage = esctRatePercentage;
    return this;
  }

  /**
   * Employer superannuation contribution tax rate.
   *
   * @return esctRatePercentage
   */
  @ApiModelProperty(example = "1.0", value = "Employer superannuation contribution tax rate.")
  /**
   * Employer superannuation contribution tax rate.
   *
   * @return esctRatePercentage Double
   */
  public Double getEsctRatePercentage() {
    return esctRatePercentage;
  }

  /**
   * Employer superannuation contribution tax rate.
   *
   * @param esctRatePercentage Double
   */
  public void setEsctRatePercentage(Double esctRatePercentage) {
    this.esctRatePercentage = esctRatePercentage;
  }

  /**
   * Contribution Option which can be &#39;MakeContributions&#39; &#39;OptOut&#39;,
   * &#39;OnAContributionsHoliday&#39;, &#39;OnASavingsSuspension&#39;,
   * &#39;NotCurrentlyAKiwiSaverMember&#39; for employees without a KiwiSaver membership
   *
   * @param kiwiSaverContributions KiwiSaverContributionsEnum
   * @return EmployeeTax
   */
  public EmployeeTax kiwiSaverContributions(KiwiSaverContributionsEnum kiwiSaverContributions) {
    this.kiwiSaverContributions = kiwiSaverContributions;
    return this;
  }

  /**
   * Contribution Option which can be &#39;MakeContributions&#39; &#39;OptOut&#39;,
   * &#39;OnAContributionsHoliday&#39;, &#39;OnASavingsSuspension&#39;,
   * &#39;NotCurrentlyAKiwiSaverMember&#39; for employees without a KiwiSaver membership
   *
   * @return kiwiSaverContributions
   */
  @ApiModelProperty(
      example = "MakeContributions",
      value =
          "Contribution Option which can be 'MakeContributions' 'OptOut',"
              + " 'OnAContributionsHoliday', 'OnASavingsSuspension',"
              + " 'NotCurrentlyAKiwiSaverMember' for employees without a KiwiSaver membership")
  /**
   * Contribution Option which can be &#39;MakeContributions&#39; &#39;OptOut&#39;,
   * &#39;OnAContributionsHoliday&#39;, &#39;OnASavingsSuspension&#39;,
   * &#39;NotCurrentlyAKiwiSaverMember&#39; for employees without a KiwiSaver membership
   *
   * @return kiwiSaverContributions KiwiSaverContributionsEnum
   */
  public KiwiSaverContributionsEnum getKiwiSaverContributions() {
    return kiwiSaverContributions;
  }

  /**
   * Contribution Option which can be &#39;MakeContributions&#39; &#39;OptOut&#39;,
   * &#39;OnAContributionsHoliday&#39;, &#39;OnASavingsSuspension&#39;,
   * &#39;NotCurrentlyAKiwiSaverMember&#39; for employees without a KiwiSaver membership
   *
   * @param kiwiSaverContributions KiwiSaverContributionsEnum
   */
  public void setKiwiSaverContributions(KiwiSaverContributionsEnum kiwiSaverContributions) {
    this.kiwiSaverContributions = kiwiSaverContributions;
  }

  /**
   * Employee Contribution percentage.
   *
   * @param kiwiSaverEmployeeContributionRatePercentage Double
   * @return EmployeeTax
   */
  public EmployeeTax kiwiSaverEmployeeContributionRatePercentage(
      Double kiwiSaverEmployeeContributionRatePercentage) {
    this.kiwiSaverEmployeeContributionRatePercentage = kiwiSaverEmployeeContributionRatePercentage;
    return this;
  }

  /**
   * Employee Contribution percentage.
   *
   * @return kiwiSaverEmployeeContributionRatePercentage
   */
  @ApiModelProperty(example = "4.0", value = "Employee Contribution percentage.")
  /**
   * Employee Contribution percentage.
   *
   * @return kiwiSaverEmployeeContributionRatePercentage Double
   */
  public Double getKiwiSaverEmployeeContributionRatePercentage() {
    return kiwiSaverEmployeeContributionRatePercentage;
  }

  /**
   * Employee Contribution percentage.
   *
   * @param kiwiSaverEmployeeContributionRatePercentage Double
   */
  public void setKiwiSaverEmployeeContributionRatePercentage(
      Double kiwiSaverEmployeeContributionRatePercentage) {
    this.kiwiSaverEmployeeContributionRatePercentage = kiwiSaverEmployeeContributionRatePercentage;
  }

  /**
   * Employer Contribution percentage.
   *
   * @param kiwiSaverEmployerContributionRatePercentage Double
   * @return EmployeeTax
   */
  public EmployeeTax kiwiSaverEmployerContributionRatePercentage(
      Double kiwiSaverEmployerContributionRatePercentage) {
    this.kiwiSaverEmployerContributionRatePercentage = kiwiSaverEmployerContributionRatePercentage;
    return this;
  }

  /**
   * Employer Contribution percentage.
   *
   * @return kiwiSaverEmployerContributionRatePercentage
   */
  @ApiModelProperty(example = "10.0", value = "Employer Contribution percentage.")
  /**
   * Employer Contribution percentage.
   *
   * @return kiwiSaverEmployerContributionRatePercentage Double
   */
  public Double getKiwiSaverEmployerContributionRatePercentage() {
    return kiwiSaverEmployerContributionRatePercentage;
  }

  /**
   * Employer Contribution percentage.
   *
   * @param kiwiSaverEmployerContributionRatePercentage Double
   */
  public void setKiwiSaverEmployerContributionRatePercentage(
      Double kiwiSaverEmployerContributionRatePercentage) {
    this.kiwiSaverEmployerContributionRatePercentage = kiwiSaverEmployerContributionRatePercentage;
  }

  /**
   * Employer Contribution through Salary Sacrifice percentage.
   *
   * @param kiwiSaverEmployerSalarySacrificeContributionRatePercentage Double
   * @return EmployeeTax
   */
  public EmployeeTax kiwiSaverEmployerSalarySacrificeContributionRatePercentage(
      Double kiwiSaverEmployerSalarySacrificeContributionRatePercentage) {
    this.kiwiSaverEmployerSalarySacrificeContributionRatePercentage =
        kiwiSaverEmployerSalarySacrificeContributionRatePercentage;
    return this;
  }

  /**
   * Employer Contribution through Salary Sacrifice percentage.
   *
   * @return kiwiSaverEmployerSalarySacrificeContributionRatePercentage
   */
  @ApiModelProperty(
      example = "2.0",
      value = "Employer Contribution through Salary Sacrifice percentage.")
  /**
   * Employer Contribution through Salary Sacrifice percentage.
   *
   * @return kiwiSaverEmployerSalarySacrificeContributionRatePercentage Double
   */
  public Double getKiwiSaverEmployerSalarySacrificeContributionRatePercentage() {
    return kiwiSaverEmployerSalarySacrificeContributionRatePercentage;
  }

  /**
   * Employer Contribution through Salary Sacrifice percentage.
   *
   * @param kiwiSaverEmployerSalarySacrificeContributionRatePercentage Double
   */
  public void setKiwiSaverEmployerSalarySacrificeContributionRatePercentage(
      Double kiwiSaverEmployerSalarySacrificeContributionRatePercentage) {
    this.kiwiSaverEmployerSalarySacrificeContributionRatePercentage =
        kiwiSaverEmployerSalarySacrificeContributionRatePercentage;
  }

  /**
   * Opt Out Date.
   *
   * @param kiwiSaverOptOutDate LocalDate
   * @return EmployeeTax
   */
  public EmployeeTax kiwiSaverOptOutDate(LocalDate kiwiSaverOptOutDate) {
    this.kiwiSaverOptOutDate = kiwiSaverOptOutDate;
    return this;
  }

  /**
   * Opt Out Date.
   *
   * @return kiwiSaverOptOutDate
   */
  @ApiModelProperty(value = "Opt Out Date.")
  /**
   * Opt Out Date.
   *
   * @return kiwiSaverOptOutDate LocalDate
   */
  public LocalDate getKiwiSaverOptOutDate() {
    return kiwiSaverOptOutDate;
  }

  /**
   * Opt Out Date.
   *
   * @param kiwiSaverOptOutDate LocalDate
   */
  public void setKiwiSaverOptOutDate(LocalDate kiwiSaverOptOutDate) {
    this.kiwiSaverOptOutDate = kiwiSaverOptOutDate;
  }

  /**
   * Contribution holiday expiry date or end date.
   *
   * @param kiwiSaverContributionHolidayEndDate LocalDate
   * @return EmployeeTax
   */
  public EmployeeTax kiwiSaverContributionHolidayEndDate(
      LocalDate kiwiSaverContributionHolidayEndDate) {
    this.kiwiSaverContributionHolidayEndDate = kiwiSaverContributionHolidayEndDate;
    return this;
  }

  /**
   * Contribution holiday expiry date or end date.
   *
   * @return kiwiSaverContributionHolidayEndDate
   */
  @ApiModelProperty(value = "Contribution holiday expiry date or end date.")
  /**
   * Contribution holiday expiry date or end date.
   *
   * @return kiwiSaverContributionHolidayEndDate LocalDate
   */
  public LocalDate getKiwiSaverContributionHolidayEndDate() {
    return kiwiSaverContributionHolidayEndDate;
  }

  /**
   * Contribution holiday expiry date or end date.
   *
   * @param kiwiSaverContributionHolidayEndDate LocalDate
   */
  public void setKiwiSaverContributionHolidayEndDate(
      LocalDate kiwiSaverContributionHolidayEndDate) {
    this.kiwiSaverContributionHolidayEndDate = kiwiSaverContributionHolidayEndDate;
  }

  /**
   * Does the employee have a remaining student loan balance? Set a remaining balance if you have
   * received a letter from IR.
   *
   * @param hasStudentLoanBalance Boolean
   * @return EmployeeTax
   */
  public EmployeeTax hasStudentLoanBalance(Boolean hasStudentLoanBalance) {
    this.hasStudentLoanBalance = hasStudentLoanBalance;
    return this;
  }

  /**
   * Does the employee have a remaining student loan balance? Set a remaining balance if you have
   * received a letter from IR.
   *
   * @return hasStudentLoanBalance
   */
  @ApiModelProperty(
      example = "false",
      value =
          "Does the employee have a remaining student loan balance? Set a remaining balance if you"
              + " have received a letter from IR.")
  /**
   * Does the employee have a remaining student loan balance? Set a remaining balance if you have
   * received a letter from IR.
   *
   * @return hasStudentLoanBalance Boolean
   */
  public Boolean getHasStudentLoanBalance() {
    return hasStudentLoanBalance;
  }

  /**
   * Does the employee have a remaining student loan balance? Set a remaining balance if you have
   * received a letter from IR.
   *
   * @param hasStudentLoanBalance Boolean
   */
  public void setHasStudentLoanBalance(Boolean hasStudentLoanBalance) {
    this.hasStudentLoanBalance = hasStudentLoanBalance;
  }

  /**
   * The employee&#39;s student loan balance shown on the letter from IR.
   *
   * @param studentLoanBalance Double
   * @return EmployeeTax
   */
  public EmployeeTax studentLoanBalance(Double studentLoanBalance) {
    this.studentLoanBalance = studentLoanBalance;
    return this;
  }

  /**
   * The employee&#39;s student loan balance shown on the letter from IR.
   *
   * @return studentLoanBalance
   */
  @ApiModelProperty(
      example = "30.0",
      value = "The employee's student loan balance shown on the letter from IR.")
  /**
   * The employee&#39;s student loan balance shown on the letter from IR.
   *
   * @return studentLoanBalance Double
   */
  public Double getStudentLoanBalance() {
    return studentLoanBalance;
  }

  /**
   * The employee&#39;s student loan balance shown on the letter from IR.
   *
   * @param studentLoanBalance Double
   */
  public void setStudentLoanBalance(Double studentLoanBalance) {
    this.studentLoanBalance = studentLoanBalance;
  }

  /**
   * The date of the letter from IR.
   *
   * @param studentLoanAsAt LocalDate
   * @return EmployeeTax
   */
  public EmployeeTax studentLoanAsAt(LocalDate studentLoanAsAt) {
    this.studentLoanAsAt = studentLoanAsAt;
    return this;
  }

  /**
   * The date of the letter from IR.
   *
   * @return studentLoanAsAt
   */
  @ApiModelProperty(value = "The date of the letter from IR.")
  /**
   * The date of the letter from IR.
   *
   * @return studentLoanAsAt LocalDate
   */
  public LocalDate getStudentLoanAsAt() {
    return studentLoanAsAt;
  }

  /**
   * The date of the letter from IR.
   *
   * @param studentLoanAsAt LocalDate
   */
  public void setStudentLoanAsAt(LocalDate studentLoanAsAt) {
    this.studentLoanAsAt = studentLoanAsAt;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeeTax employeeTax = (EmployeeTax) o;
    return Objects.equals(this.irdNumber, employeeTax.irdNumber)
        && Objects.equals(this.taxCode, employeeTax.taxCode)
        && Objects.equals(this.specialTaxRatePercentage, employeeTax.specialTaxRatePercentage)
        && Objects.equals(this.hasSpecialStudentLoanRate, employeeTax.hasSpecialStudentLoanRate)
        && Objects.equals(
            this.specialStudentLoanRatePercentage, employeeTax.specialStudentLoanRatePercentage)
        && Objects.equals(this.isEligibleForKiwiSaver, employeeTax.isEligibleForKiwiSaver)
        && Objects.equals(this.esctRatePercentage, employeeTax.esctRatePercentage)
        && Objects.equals(this.kiwiSaverContributions, employeeTax.kiwiSaverContributions)
        && Objects.equals(
            this.kiwiSaverEmployeeContributionRatePercentage,
            employeeTax.kiwiSaverEmployeeContributionRatePercentage)
        && Objects.equals(
            this.kiwiSaverEmployerContributionRatePercentage,
            employeeTax.kiwiSaverEmployerContributionRatePercentage)
        && Objects.equals(
            this.kiwiSaverEmployerSalarySacrificeContributionRatePercentage,
            employeeTax.kiwiSaverEmployerSalarySacrificeContributionRatePercentage)
        && Objects.equals(this.kiwiSaverOptOutDate, employeeTax.kiwiSaverOptOutDate)
        && Objects.equals(
            this.kiwiSaverContributionHolidayEndDate,
            employeeTax.kiwiSaverContributionHolidayEndDate)
        && Objects.equals(this.hasStudentLoanBalance, employeeTax.hasStudentLoanBalance)
        && Objects.equals(this.studentLoanBalance, employeeTax.studentLoanBalance)
        && Objects.equals(this.studentLoanAsAt, employeeTax.studentLoanAsAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        irdNumber,
        taxCode,
        specialTaxRatePercentage,
        hasSpecialStudentLoanRate,
        specialStudentLoanRatePercentage,
        isEligibleForKiwiSaver,
        esctRatePercentage,
        kiwiSaverContributions,
        kiwiSaverEmployeeContributionRatePercentage,
        kiwiSaverEmployerContributionRatePercentage,
        kiwiSaverEmployerSalarySacrificeContributionRatePercentage,
        kiwiSaverOptOutDate,
        kiwiSaverContributionHolidayEndDate,
        hasStudentLoanBalance,
        studentLoanBalance,
        studentLoanAsAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeTax {\n");
    sb.append("    irdNumber: ").append(toIndentedString(irdNumber)).append("\n");
    sb.append("    taxCode: ").append(toIndentedString(taxCode)).append("\n");
    sb.append("    specialTaxRatePercentage: ")
        .append(toIndentedString(specialTaxRatePercentage))
        .append("\n");
    sb.append("    hasSpecialStudentLoanRate: ")
        .append(toIndentedString(hasSpecialStudentLoanRate))
        .append("\n");
    sb.append("    specialStudentLoanRatePercentage: ")
        .append(toIndentedString(specialStudentLoanRatePercentage))
        .append("\n");
    sb.append("    isEligibleForKiwiSaver: ")
        .append(toIndentedString(isEligibleForKiwiSaver))
        .append("\n");
    sb.append("    esctRatePercentage: ").append(toIndentedString(esctRatePercentage)).append("\n");
    sb.append("    kiwiSaverContributions: ")
        .append(toIndentedString(kiwiSaverContributions))
        .append("\n");
    sb.append("    kiwiSaverEmployeeContributionRatePercentage: ")
        .append(toIndentedString(kiwiSaverEmployeeContributionRatePercentage))
        .append("\n");
    sb.append("    kiwiSaverEmployerContributionRatePercentage: ")
        .append(toIndentedString(kiwiSaverEmployerContributionRatePercentage))
        .append("\n");
    sb.append("    kiwiSaverEmployerSalarySacrificeContributionRatePercentage: ")
        .append(toIndentedString(kiwiSaverEmployerSalarySacrificeContributionRatePercentage))
        .append("\n");
    sb.append("    kiwiSaverOptOutDate: ")
        .append(toIndentedString(kiwiSaverOptOutDate))
        .append("\n");
    sb.append("    kiwiSaverContributionHolidayEndDate: ")
        .append(toIndentedString(kiwiSaverContributionHolidayEndDate))
        .append("\n");
    sb.append("    hasStudentLoanBalance: ")
        .append(toIndentedString(hasStudentLoanBalance))
        .append("\n");
    sb.append("    studentLoanBalance: ").append(toIndentedString(studentLoanBalance)).append("\n");
    sb.append("    studentLoanAsAt: ").append(toIndentedString(studentLoanAsAt)).append("\n");
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