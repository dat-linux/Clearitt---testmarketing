/*
 * Xero Payroll AU API
 * This is the Xero Payroll API for orgs in Australia region.
 *
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrollau;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Objects;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/** LeaveType */
public class LeaveType {
  StringUtil util = new StringUtil();

  @JsonProperty("Name")
  private String name;

  @JsonProperty("TypeOfUnits")
  private String typeOfUnits;

  @JsonProperty("LeaveTypeID")
  private UUID leaveTypeID;

  @JsonProperty("NormalEntitlement")
  private Double normalEntitlement;

  @JsonProperty("LeaveLoadingRate")
  private Double leaveLoadingRate;

  @JsonProperty("UpdatedDateUTC")
  private String updatedDateUTC;

  @JsonProperty("IsPaidLeave")
  private Boolean isPaidLeave;

  @JsonProperty("ShowOnPayslip")
  private Boolean showOnPayslip;

  @JsonProperty("CurrentRecord")
  private Boolean currentRecord;

  @JsonProperty("LeaveCategoryCode")
  private LeaveCategoryCode leaveCategoryCode;

  @JsonProperty("SGCExempt")
  private Boolean sgCExempt;
  /**
   * Name of the earnings rate (max length &#x3D; 100)
   *
   * @param name String
   * @return LeaveType
   */
  public LeaveType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the earnings rate (max length &#x3D; 100)
   *
   * @return name
   */
  @ApiModelProperty(example = "PTO", value = "Name of the earnings rate (max length = 100)")
  /**
   * Name of the earnings rate (max length &#x3D; 100)
   *
   * @return name String
   */
  public String getName() {
    return name;
  }

  /**
   * Name of the earnings rate (max length &#x3D; 100)
   *
   * @param name String
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The type of units by which leave entitlements are normally tracked. These are typically the
   * same as the type of units used for the employee’s ordinary earnings rate
   *
   * @param typeOfUnits String
   * @return LeaveType
   */
  public LeaveType typeOfUnits(String typeOfUnits) {
    this.typeOfUnits = typeOfUnits;
    return this;
  }

  /**
   * The type of units by which leave entitlements are normally tracked. These are typically the
   * same as the type of units used for the employee’s ordinary earnings rate
   *
   * @return typeOfUnits
   */
  @ApiModelProperty(
      example = "Hours",
      value =
          "The type of units by which leave entitlements are normally tracked. These are typically"
              + " the same as the type of units used for the employee’s ordinary earnings rate")
  /**
   * The type of units by which leave entitlements are normally tracked. These are typically the
   * same as the type of units used for the employee’s ordinary earnings rate
   *
   * @return typeOfUnits String
   */
  public String getTypeOfUnits() {
    return typeOfUnits;
  }

  /**
   * The type of units by which leave entitlements are normally tracked. These are typically the
   * same as the type of units used for the employee’s ordinary earnings rate
   *
   * @param typeOfUnits String
   */
  public void setTypeOfUnits(String typeOfUnits) {
    this.typeOfUnits = typeOfUnits;
  }

  /**
   * Xero identifier
   *
   * @param leaveTypeID UUID
   * @return LeaveType
   */
  public LeaveType leaveTypeID(UUID leaveTypeID) {
    this.leaveTypeID = leaveTypeID;
    return this;
  }

  /**
   * Xero identifier
   *
   * @return leaveTypeID
   */
  @ApiModelProperty(example = "e0eb6747-7c17-4075-b804-989f8d4e5d39", value = "Xero identifier")
  /**
   * Xero identifier
   *
   * @return leaveTypeID UUID
   */
  public UUID getLeaveTypeID() {
    return leaveTypeID;
  }

  /**
   * Xero identifier
   *
   * @param leaveTypeID UUID
   */
  public void setLeaveTypeID(UUID leaveTypeID) {
    this.leaveTypeID = leaveTypeID;
  }

  /**
   * The number of units the employee is entitled to each year
   *
   * @param normalEntitlement Double
   * @return LeaveType
   */
  public LeaveType normalEntitlement(Double normalEntitlement) {
    this.normalEntitlement = normalEntitlement;
    return this;
  }

  /**
   * The number of units the employee is entitled to each year
   *
   * @return normalEntitlement
   */
  @ApiModelProperty(
      example = "152.0",
      value = "The number of units the employee is entitled to each year")
  /**
   * The number of units the employee is entitled to each year
   *
   * @return normalEntitlement Double
   */
  public Double getNormalEntitlement() {
    return normalEntitlement;
  }

  /**
   * The number of units the employee is entitled to each year
   *
   * @param normalEntitlement Double
   */
  public void setNormalEntitlement(Double normalEntitlement) {
    this.normalEntitlement = normalEntitlement;
  }

  /**
   * Enter an amount here if your organisation pays an additional percentage on top of ordinary
   * earnings when your employees take leave (typically 17.5%)
   *
   * @param leaveLoadingRate Double
   * @return LeaveType
   */
  public LeaveType leaveLoadingRate(Double leaveLoadingRate) {
    this.leaveLoadingRate = leaveLoadingRate;
    return this;
  }

  /**
   * Enter an amount here if your organisation pays an additional percentage on top of ordinary
   * earnings when your employees take leave (typically 17.5%)
   *
   * @return leaveLoadingRate
   */
  @ApiModelProperty(
      example = "2.0",
      value =
          "Enter an amount here if your organisation pays an additional percentage on top of"
              + " ordinary earnings when your employees take leave (typically 17.5%)")
  /**
   * Enter an amount here if your organisation pays an additional percentage on top of ordinary
   * earnings when your employees take leave (typically 17.5%)
   *
   * @return leaveLoadingRate Double
   */
  public Double getLeaveLoadingRate() {
    return leaveLoadingRate;
  }

  /**
   * Enter an amount here if your organisation pays an additional percentage on top of ordinary
   * earnings when your employees take leave (typically 17.5%)
   *
   * @param leaveLoadingRate Double
   */
  public void setLeaveLoadingRate(Double leaveLoadingRate) {
    this.leaveLoadingRate = leaveLoadingRate;
  }

  /**
   * Last modified timestamp
   *
   * @return updatedDateUTC
   */
  @ApiModelProperty(example = "/Date(1583967733054+0000)/", value = "Last modified timestamp")
  /**
   * Last modified timestamp
   *
   * @return updatedDateUTC String
   */
  public String getUpdatedDateUTC() {
    return updatedDateUTC;
  }
  /**
   * Last modified timestamp
   *
   * @return OffsetDateTime
   */
  public OffsetDateTime getUpdatedDateUTCAsDate() {
    if (this.updatedDateUTC != null) {
      try {
        return util.convertStringToOffsetDateTime(this.updatedDateUTC);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  /**
   * Set this to indicate that an employee will be paid when taking this type of leave
   *
   * @param isPaidLeave Boolean
   * @return LeaveType
   */
  public LeaveType isPaidLeave(Boolean isPaidLeave) {
    this.isPaidLeave = isPaidLeave;
    return this;
  }

  /**
   * Set this to indicate that an employee will be paid when taking this type of leave
   *
   * @return isPaidLeave
   */
  @ApiModelProperty(
      example = "true",
      value = "Set this to indicate that an employee will be paid when taking this type of leave")
  /**
   * Set this to indicate that an employee will be paid when taking this type of leave
   *
   * @return isPaidLeave Boolean
   */
  public Boolean getIsPaidLeave() {
    return isPaidLeave;
  }

  /**
   * Set this to indicate that an employee will be paid when taking this type of leave
   *
   * @param isPaidLeave Boolean
   */
  public void setIsPaidLeave(Boolean isPaidLeave) {
    this.isPaidLeave = isPaidLeave;
  }

  /**
   * Set this if you want a balance for this leave type to be shown on your employee’s payslips
   *
   * @param showOnPayslip Boolean
   * @return LeaveType
   */
  public LeaveType showOnPayslip(Boolean showOnPayslip) {
    this.showOnPayslip = showOnPayslip;
    return this;
  }

  /**
   * Set this if you want a balance for this leave type to be shown on your employee’s payslips
   *
   * @return showOnPayslip
   */
  @ApiModelProperty(
      example = "true",
      value =
          "Set this if you want a balance for this leave type to be shown on your employee’s"
              + " payslips")
  /**
   * Set this if you want a balance for this leave type to be shown on your employee’s payslips
   *
   * @return showOnPayslip Boolean
   */
  public Boolean getShowOnPayslip() {
    return showOnPayslip;
  }

  /**
   * Set this if you want a balance for this leave type to be shown on your employee’s payslips
   *
   * @param showOnPayslip Boolean
   */
  public void setShowOnPayslip(Boolean showOnPayslip) {
    this.showOnPayslip = showOnPayslip;
  }

  /**
   * Is the current record
   *
   * @param currentRecord Boolean
   * @return LeaveType
   */
  public LeaveType currentRecord(Boolean currentRecord) {
    this.currentRecord = currentRecord;
    return this;
  }

  /**
   * Is the current record
   *
   * @return currentRecord
   */
  @ApiModelProperty(example = "true", value = "Is the current record")
  /**
   * Is the current record
   *
   * @return currentRecord Boolean
   */
  public Boolean getCurrentRecord() {
    return currentRecord;
  }

  /**
   * Is the current record
   *
   * @param currentRecord Boolean
   */
  public void setCurrentRecord(Boolean currentRecord) {
    this.currentRecord = currentRecord;
  }

  /**
   * leaveCategoryCode
   *
   * @param leaveCategoryCode LeaveCategoryCode
   * @return LeaveType
   */
  public LeaveType leaveCategoryCode(LeaveCategoryCode leaveCategoryCode) {
    this.leaveCategoryCode = leaveCategoryCode;
    return this;
  }

  /**
   * Get leaveCategoryCode
   *
   * @return leaveCategoryCode
   */
  @ApiModelProperty(value = "")
  /**
   * leaveCategoryCode
   *
   * @return leaveCategoryCode LeaveCategoryCode
   */
  public LeaveCategoryCode getLeaveCategoryCode() {
    return leaveCategoryCode;
  }

  /**
   * leaveCategoryCode
   *
   * @param leaveCategoryCode LeaveCategoryCode
   */
  public void setLeaveCategoryCode(LeaveCategoryCode leaveCategoryCode) {
    this.leaveCategoryCode = leaveCategoryCode;
  }

  /**
   * Set this to indicate that the leave type is exempt from superannuation guarantee contribution
   *
   * @param sgCExempt Boolean
   * @return LeaveType
   */
  public LeaveType sgCExempt(Boolean sgCExempt) {
    this.sgCExempt = sgCExempt;
    return this;
  }

  /**
   * Set this to indicate that the leave type is exempt from superannuation guarantee contribution
   *
   * @return sgCExempt
   */
  @ApiModelProperty(
      example = "true",
      value =
          "Set this to indicate that the leave type is exempt from superannuation guarantee"
              + " contribution")
  /**
   * Set this to indicate that the leave type is exempt from superannuation guarantee contribution
   *
   * @return sgCExempt Boolean
   */
  public Boolean getSgCExempt() {
    return sgCExempt;
  }

  /**
   * Set this to indicate that the leave type is exempt from superannuation guarantee contribution
   *
   * @param sgCExempt Boolean
   */
  public void setSgCExempt(Boolean sgCExempt) {
    this.sgCExempt = sgCExempt;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeaveType leaveType = (LeaveType) o;
    return Objects.equals(this.name, leaveType.name)
        && Objects.equals(this.typeOfUnits, leaveType.typeOfUnits)
        && Objects.equals(this.leaveTypeID, leaveType.leaveTypeID)
        && Objects.equals(this.normalEntitlement, leaveType.normalEntitlement)
        && Objects.equals(this.leaveLoadingRate, leaveType.leaveLoadingRate)
        && Objects.equals(this.updatedDateUTC, leaveType.updatedDateUTC)
        && Objects.equals(this.isPaidLeave, leaveType.isPaidLeave)
        && Objects.equals(this.showOnPayslip, leaveType.showOnPayslip)
        && Objects.equals(this.currentRecord, leaveType.currentRecord)
        && Objects.equals(this.leaveCategoryCode, leaveType.leaveCategoryCode)
        && Objects.equals(this.sgCExempt, leaveType.sgCExempt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        name,
        typeOfUnits,
        leaveTypeID,
        normalEntitlement,
        leaveLoadingRate,
        updatedDateUTC,
        isPaidLeave,
        showOnPayslip,
        currentRecord,
        leaveCategoryCode,
        sgCExempt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaveType {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    typeOfUnits: ").append(toIndentedString(typeOfUnits)).append("\n");
    sb.append("    leaveTypeID: ").append(toIndentedString(leaveTypeID)).append("\n");
    sb.append("    normalEntitlement: ").append(toIndentedString(normalEntitlement)).append("\n");
    sb.append("    leaveLoadingRate: ").append(toIndentedString(leaveLoadingRate)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
    sb.append("    isPaidLeave: ").append(toIndentedString(isPaidLeave)).append("\n");
    sb.append("    showOnPayslip: ").append(toIndentedString(showOnPayslip)).append("\n");
    sb.append("    currentRecord: ").append(toIndentedString(currentRecord)).append("\n");
    sb.append("    leaveCategoryCode: ").append(toIndentedString(leaveCategoryCode)).append("\n");
    sb.append("    sgCExempt: ").append(toIndentedString(sgCExempt)).append("\n");
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
