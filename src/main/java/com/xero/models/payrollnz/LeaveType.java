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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import java.util.UUID;
import org.threeten.bp.LocalDateTime;

/** LeaveType */
public class LeaveType {
  StringUtil util = new StringUtil();

  @JsonProperty("leaveTypeID")
  private UUID leaveTypeID;

  @JsonProperty("name")
  private String name;

  @JsonProperty("isPaidLeave")
  private Boolean isPaidLeave;

  @JsonProperty("showOnPayslip")
  private Boolean showOnPayslip;

  @JsonProperty("updatedDateUTC")
  private LocalDateTime updatedDateUTC;

  @JsonProperty("isActive")
  private Boolean isActive;
  /**
   * Xero unique identifier for the leave type
   *
   * @param leaveTypeID UUID
   * @return LeaveType
   */
  public LeaveType leaveTypeID(UUID leaveTypeID) {
    this.leaveTypeID = leaveTypeID;
    return this;
  }

  /**
   * Xero unique identifier for the leave type
   *
   * @return leaveTypeID
   */
  @ApiModelProperty(value = "Xero unique identifier for the leave type")
  /**
   * Xero unique identifier for the leave type
   *
   * @return leaveTypeID UUID
   */
  public UUID getLeaveTypeID() {
    return leaveTypeID;
  }

  /**
   * Xero unique identifier for the leave type
   *
   * @param leaveTypeID UUID
   */
  public void setLeaveTypeID(UUID leaveTypeID) {
    this.leaveTypeID = leaveTypeID;
  }

  /**
   * Name of the leave type
   *
   * @param name String
   * @return LeaveType
   */
  public LeaveType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the leave type
   *
   * @return name
   */
  @ApiModelProperty(required = true, value = "Name of the leave type")
  /**
   * Name of the leave type
   *
   * @return name String
   */
  public String getName() {
    return name;
  }

  /**
   * Name of the leave type
   *
   * @param name String
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Indicate that an employee will be paid when taking this type of leave
   *
   * @param isPaidLeave Boolean
   * @return LeaveType
   */
  public LeaveType isPaidLeave(Boolean isPaidLeave) {
    this.isPaidLeave = isPaidLeave;
    return this;
  }

  /**
   * Indicate that an employee will be paid when taking this type of leave
   *
   * @return isPaidLeave
   */
  @ApiModelProperty(
      required = true,
      value = "Indicate that an employee will be paid when taking this type of leave")
  /**
   * Indicate that an employee will be paid when taking this type of leave
   *
   * @return isPaidLeave Boolean
   */
  public Boolean getIsPaidLeave() {
    return isPaidLeave;
  }

  /**
   * Indicate that an employee will be paid when taking this type of leave
   *
   * @param isPaidLeave Boolean
   */
  public void setIsPaidLeave(Boolean isPaidLeave) {
    this.isPaidLeave = isPaidLeave;
  }

  /**
   * Indicate that a balance for this leave type to be shown on the employee’s payslips
   *
   * @param showOnPayslip Boolean
   * @return LeaveType
   */
  public LeaveType showOnPayslip(Boolean showOnPayslip) {
    this.showOnPayslip = showOnPayslip;
    return this;
  }

  /**
   * Indicate that a balance for this leave type to be shown on the employee’s payslips
   *
   * @return showOnPayslip
   */
  @ApiModelProperty(
      required = true,
      value = "Indicate that a balance for this leave type to be shown on the employee’s payslips")
  /**
   * Indicate that a balance for this leave type to be shown on the employee’s payslips
   *
   * @return showOnPayslip Boolean
   */
  public Boolean getShowOnPayslip() {
    return showOnPayslip;
  }

  /**
   * Indicate that a balance for this leave type to be shown on the employee’s payslips
   *
   * @param showOnPayslip Boolean
   */
  public void setShowOnPayslip(Boolean showOnPayslip) {
    this.showOnPayslip = showOnPayslip;
  }

  /**
   * UTC timestamp of last update to the leave type note
   *
   * @param updatedDateUTC LocalDateTime
   * @return LeaveType
   */
  public LeaveType updatedDateUTC(LocalDateTime updatedDateUTC) {
    this.updatedDateUTC = updatedDateUTC;
    return this;
  }

  /**
   * UTC timestamp of last update to the leave type note
   *
   * @return updatedDateUTC
   */
  @ApiModelProperty(value = "UTC timestamp of last update to the leave type note")
  /**
   * UTC timestamp of last update to the leave type note
   *
   * @return updatedDateUTC LocalDateTime
   */
  public LocalDateTime getUpdatedDateUTC() {
    return updatedDateUTC;
  }

  /**
   * UTC timestamp of last update to the leave type note
   *
   * @param updatedDateUTC LocalDateTime
   */
  public void setUpdatedDateUTC(LocalDateTime updatedDateUTC) {
    this.updatedDateUTC = updatedDateUTC;
  }

  /**
   * Shows whether the leave type is active or not
   *
   * @param isActive Boolean
   * @return LeaveType
   */
  public LeaveType isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Shows whether the leave type is active or not
   *
   * @return isActive
   */
  @ApiModelProperty(value = "Shows whether the leave type is active or not")
  /**
   * Shows whether the leave type is active or not
   *
   * @return isActive Boolean
   */
  public Boolean getIsActive() {
    return isActive;
  }

  /**
   * Shows whether the leave type is active or not
   *
   * @param isActive Boolean
   */
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
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
    return Objects.equals(this.leaveTypeID, leaveType.leaveTypeID)
        && Objects.equals(this.name, leaveType.name)
        && Objects.equals(this.isPaidLeave, leaveType.isPaidLeave)
        && Objects.equals(this.showOnPayslip, leaveType.showOnPayslip)
        && Objects.equals(this.updatedDateUTC, leaveType.updatedDateUTC)
        && Objects.equals(this.isActive, leaveType.isActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leaveTypeID, name, isPaidLeave, showOnPayslip, updatedDateUTC, isActive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaveType {\n");
    sb.append("    leaveTypeID: ").append(toIndentedString(leaveTypeID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isPaidLeave: ").append(toIndentedString(isPaidLeave)).append("\n");
    sb.append("    showOnPayslip: ").append(toIndentedString(showOnPayslip)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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
