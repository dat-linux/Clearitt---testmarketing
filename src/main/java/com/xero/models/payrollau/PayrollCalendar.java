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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.ZoneId;

/** PayrollCalendar */
public class PayrollCalendar {
  StringUtil util = new StringUtil();

  @JsonProperty("Name")
  private String name;

  @JsonProperty("CalendarType")
  private CalendarType calendarType;

  @JsonProperty("StartDate")
  private String startDate;

  @JsonProperty("PaymentDate")
  private String paymentDate;

  @JsonProperty("PayrollCalendarID")
  private UUID payrollCalendarID;

  @JsonProperty("UpdatedDateUTC")
  private String updatedDateUTC;

  @JsonProperty("ReferenceDate")
  private String referenceDate;

  @JsonProperty("ValidationErrors")
  private List<ValidationError> validationErrors = new ArrayList<ValidationError>();
  /**
   * Name of the Payroll Calendar
   *
   * @param name String
   * @return PayrollCalendar
   */
  public PayrollCalendar name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the Payroll Calendar
   *
   * @return name
   */
  @ApiModelProperty(example = "Fortnightly Calendar", value = "Name of the Payroll Calendar")
  /**
   * Name of the Payroll Calendar
   *
   * @return name String
   */
  public String getName() {
    return name;
  }

  /**
   * Name of the Payroll Calendar
   *
   * @param name String
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * calendarType
   *
   * @param calendarType CalendarType
   * @return PayrollCalendar
   */
  public PayrollCalendar calendarType(CalendarType calendarType) {
    this.calendarType = calendarType;
    return this;
  }

  /**
   * Get calendarType
   *
   * @return calendarType
   */
  @ApiModelProperty(value = "")
  /**
   * calendarType
   *
   * @return calendarType CalendarType
   */
  public CalendarType getCalendarType() {
    return calendarType;
  }

  /**
   * calendarType
   *
   * @param calendarType CalendarType
   */
  public void setCalendarType(CalendarType calendarType) {
    this.calendarType = calendarType;
  }

  /**
   * The start date of the upcoming pay period. The end date will be calculated based upon this
   * date, and the calendar type selected (YYYY-MM-DD)
   *
   * @param startDate String
   * @return PayrollCalendar
   */
  public PayrollCalendar startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * The start date of the upcoming pay period. The end date will be calculated based upon this
   * date, and the calendar type selected (YYYY-MM-DD)
   *
   * @return startDate
   */
  @ApiModelProperty(
      example = "/Date(322560000000+0000)/",
      value =
          "The start date of the upcoming pay period. The end date will be calculated based upon"
              + " this date, and the calendar type selected (YYYY-MM-DD)")
  /**
   * The start date of the upcoming pay period. The end date will be calculated based upon this
   * date, and the calendar type selected (YYYY-MM-DD)
   *
   * @return startDate String
   */
  public String getStartDate() {
    return startDate;
  }
  /**
   * The start date of the upcoming pay period. The end date will be calculated based upon this
   * date, and the calendar type selected (YYYY-MM-DD)
   *
   * @return LocalDate
   */
  public LocalDate getStartDateAsDate() {
    if (this.startDate != null) {
      try {
        return util.convertStringToDate(this.startDate);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  /**
   * The start date of the upcoming pay period. The end date will be calculated based upon this
   * date, and the calendar type selected (YYYY-MM-DD)
   *
   * @param startDate String
   */
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  /**
   * The start date of the upcoming pay period. The end date will be calculated based upon this
   * date, and the calendar type selected (YYYY-MM-DD)
   *
   * @param startDate LocalDateTime
   */
  public void setStartDate(LocalDate startDate) {
    // CONVERT LocalDate args into MS DateFromat String
    Instant instant = startDate.atStartOfDay(ZoneId.of("UTC").normalized()).toInstant();
    long timeInMillis = instant.toEpochMilli();

    this.startDate = "/Date(" + Long.toString(timeInMillis) + "+0000)/";
  }

  /**
   * The date on which employees will be paid for the upcoming pay period (YYYY-MM-DD)
   *
   * @param paymentDate String
   * @return PayrollCalendar
   */
  public PayrollCalendar paymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
    return this;
  }

  /**
   * The date on which employees will be paid for the upcoming pay period (YYYY-MM-DD)
   *
   * @return paymentDate
   */
  @ApiModelProperty(
      example = "/Date(322560000000+0000)/",
      value = "The date on which employees will be paid for the upcoming pay period (YYYY-MM-DD)")
  /**
   * The date on which employees will be paid for the upcoming pay period (YYYY-MM-DD)
   *
   * @return paymentDate String
   */
  public String getPaymentDate() {
    return paymentDate;
  }
  /**
   * The date on which employees will be paid for the upcoming pay period (YYYY-MM-DD)
   *
   * @return LocalDate
   */
  public LocalDate getPaymentDateAsDate() {
    if (this.paymentDate != null) {
      try {
        return util.convertStringToDate(this.paymentDate);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  /**
   * The date on which employees will be paid for the upcoming pay period (YYYY-MM-DD)
   *
   * @param paymentDate String
   */
  public void setPaymentDate(String paymentDate) {
    this.paymentDate = paymentDate;
  }

  /**
   * The date on which employees will be paid for the upcoming pay period (YYYY-MM-DD)
   *
   * @param paymentDate LocalDateTime
   */
  public void setPaymentDate(LocalDate paymentDate) {
    // CONVERT LocalDate args into MS DateFromat String
    Instant instant = paymentDate.atStartOfDay(ZoneId.of("UTC").normalized()).toInstant();
    long timeInMillis = instant.toEpochMilli();

    this.paymentDate = "/Date(" + Long.toString(timeInMillis) + "+0000)/";
  }

  /**
   * Xero identifier
   *
   * @param payrollCalendarID UUID
   * @return PayrollCalendar
   */
  public PayrollCalendar payrollCalendarID(UUID payrollCalendarID) {
    this.payrollCalendarID = payrollCalendarID;
    return this;
  }

  /**
   * Xero identifier
   *
   * @return payrollCalendarID
   */
  @ApiModelProperty(example = "e0eb6747-7c17-4075-b804-989f8d4e5d39", value = "Xero identifier")
  /**
   * Xero identifier
   *
   * @return payrollCalendarID UUID
   */
  public UUID getPayrollCalendarID() {
    return payrollCalendarID;
  }

  /**
   * Xero identifier
   *
   * @param payrollCalendarID UUID
   */
  public void setPayrollCalendarID(UUID payrollCalendarID) {
    this.payrollCalendarID = payrollCalendarID;
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
   * Reference Date (YYYY-MM-DD)
   *
   * @param referenceDate String
   * @return PayrollCalendar
   */
  public PayrollCalendar referenceDate(String referenceDate) {
    this.referenceDate = referenceDate;
    return this;
  }

  /**
   * Reference Date (YYYY-MM-DD)
   *
   * @return referenceDate
   */
  @ApiModelProperty(example = "/Date(322560000000+0000)/", value = "Reference Date (YYYY-MM-DD)")
  /**
   * Reference Date (YYYY-MM-DD)
   *
   * @return referenceDate String
   */
  public String getReferenceDate() {
    return referenceDate;
  }
  /**
   * Reference Date (YYYY-MM-DD)
   *
   * @return LocalDate
   */
  public LocalDate getReferenceDateAsDate() {
    if (this.referenceDate != null) {
      try {
        return util.convertStringToDate(this.referenceDate);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return null;
  }

  /**
   * Reference Date (YYYY-MM-DD)
   *
   * @param referenceDate String
   */
  public void setReferenceDate(String referenceDate) {
    this.referenceDate = referenceDate;
  }

  /**
   * Reference Date (YYYY-MM-DD)
   *
   * @param referenceDate LocalDateTime
   */
  public void setReferenceDate(LocalDate referenceDate) {
    // CONVERT LocalDate args into MS DateFromat String
    Instant instant = referenceDate.atStartOfDay(ZoneId.of("UTC").normalized()).toInstant();
    long timeInMillis = instant.toEpochMilli();

    this.referenceDate = "/Date(" + Long.toString(timeInMillis) + "+0000)/";
  }

  /**
   * Displays array of validation error messages from the API
   *
   * @param validationErrors List&lt;ValidationError&gt;
   * @return PayrollCalendar
   */
  public PayrollCalendar validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  /**
   * Displays array of validation error messages from the API
   *
   * @param validationErrorsItem ValidationError
   * @return PayrollCalendar
   */
  public PayrollCalendar addValidationErrorsItem(ValidationError validationErrorsItem) {
    if (this.validationErrors == null) {
      this.validationErrors = new ArrayList<ValidationError>();
    }
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

  /**
   * Displays array of validation error messages from the API
   *
   * @return validationErrors
   */
  @ApiModelProperty(value = "Displays array of validation error messages from the API")
  /**
   * Displays array of validation error messages from the API
   *
   * @return validationErrors List<ValidationError>
   */
  public List<ValidationError> getValidationErrors() {
    return validationErrors;
  }

  /**
   * Displays array of validation error messages from the API
   *
   * @param validationErrors List&lt;ValidationError&gt;
   */
  public void setValidationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayrollCalendar payrollCalendar = (PayrollCalendar) o;
    return Objects.equals(this.name, payrollCalendar.name)
        && Objects.equals(this.calendarType, payrollCalendar.calendarType)
        && Objects.equals(this.startDate, payrollCalendar.startDate)
        && Objects.equals(this.paymentDate, payrollCalendar.paymentDate)
        && Objects.equals(this.payrollCalendarID, payrollCalendar.payrollCalendarID)
        && Objects.equals(this.updatedDateUTC, payrollCalendar.updatedDateUTC)
        && Objects.equals(this.referenceDate, payrollCalendar.referenceDate)
        && Objects.equals(this.validationErrors, payrollCalendar.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        name,
        calendarType,
        startDate,
        paymentDate,
        payrollCalendarID,
        updatedDateUTC,
        referenceDate,
        validationErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayrollCalendar {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    calendarType: ").append(toIndentedString(calendarType)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
    sb.append("    payrollCalendarID: ").append(toIndentedString(payrollCalendarID)).append("\n");
    sb.append("    updatedDateUTC: ").append(toIndentedString(updatedDateUTC)).append("\n");
    sb.append("    referenceDate: ").append(toIndentedString(referenceDate)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
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
