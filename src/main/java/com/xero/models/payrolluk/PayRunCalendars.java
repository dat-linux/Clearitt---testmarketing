/*
 * Xero Payroll UK
 * This is the Xero Payroll API for orgs in the UK region.
 *
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.payrolluk;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** PayRunCalendars */
public class PayRunCalendars {
  StringUtil util = new StringUtil();

  @JsonProperty("pagination")
  private Pagination pagination;

  @JsonProperty("problem")
  private Problem problem;

  @JsonProperty("payRunCalendars")
  private List<PayRunCalendar> payRunCalendars = new ArrayList<PayRunCalendar>();
  /**
   * pagination
   *
   * @param pagination Pagination
   * @return PayRunCalendars
   */
  public PayRunCalendars pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

  /**
   * Get pagination
   *
   * @return pagination
   */
  @ApiModelProperty(value = "")
  /**
   * pagination
   *
   * @return pagination Pagination
   */
  public Pagination getPagination() {
    return pagination;
  }

  /**
   * pagination
   *
   * @param pagination Pagination
   */
  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }

  /**
   * problem
   *
   * @param problem Problem
   * @return PayRunCalendars
   */
  public PayRunCalendars problem(Problem problem) {
    this.problem = problem;
    return this;
  }

  /**
   * Get problem
   *
   * @return problem
   */
  @ApiModelProperty(value = "")
  /**
   * problem
   *
   * @return problem Problem
   */
  public Problem getProblem() {
    return problem;
  }

  /**
   * problem
   *
   * @param problem Problem
   */
  public void setProblem(Problem problem) {
    this.problem = problem;
  }

  /**
   * payRunCalendars
   *
   * @param payRunCalendars List&lt;PayRunCalendar&gt;
   * @return PayRunCalendars
   */
  public PayRunCalendars payRunCalendars(List<PayRunCalendar> payRunCalendars) {
    this.payRunCalendars = payRunCalendars;
    return this;
  }

  /**
   * payRunCalendars
   *
   * @param payRunCalendarsItem PayRunCalendar
   * @return PayRunCalendars
   */
  public PayRunCalendars addPayRunCalendarsItem(PayRunCalendar payRunCalendarsItem) {
    if (this.payRunCalendars == null) {
      this.payRunCalendars = new ArrayList<PayRunCalendar>();
    }
    this.payRunCalendars.add(payRunCalendarsItem);
    return this;
  }

  /**
   * Get payRunCalendars
   *
   * @return payRunCalendars
   */
  @ApiModelProperty(value = "")
  /**
   * payRunCalendars
   *
   * @return payRunCalendars List<PayRunCalendar>
   */
  public List<PayRunCalendar> getPayRunCalendars() {
    return payRunCalendars;
  }

  /**
   * payRunCalendars
   *
   * @param payRunCalendars List&lt;PayRunCalendar&gt;
   */
  public void setPayRunCalendars(List<PayRunCalendar> payRunCalendars) {
    this.payRunCalendars = payRunCalendars;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayRunCalendars payRunCalendars = (PayRunCalendars) o;
    return Objects.equals(this.pagination, payRunCalendars.pagination)
        && Objects.equals(this.problem, payRunCalendars.problem)
        && Objects.equals(this.payRunCalendars, payRunCalendars.payRunCalendars);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, problem, payRunCalendars);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayRunCalendars {\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    problem: ").append(toIndentedString(problem)).append("\n");
    sb.append("    payRunCalendars: ").append(toIndentedString(payRunCalendars)).append("\n");
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
