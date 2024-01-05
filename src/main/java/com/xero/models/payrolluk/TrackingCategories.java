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
import java.util.Objects;

/** TrackingCategories */
public class TrackingCategories {
  StringUtil util = new StringUtil();

  @JsonProperty("pagination")
  private Pagination pagination;

  @JsonProperty("problem")
  private Problem problem;

  @JsonProperty("trackingCategories")
  private TrackingCategory trackingCategories;
  /**
   * pagination
   *
   * @param pagination Pagination
   * @return TrackingCategories
   */
  public TrackingCategories pagination(Pagination pagination) {
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
   * @return TrackingCategories
   */
  public TrackingCategories problem(Problem problem) {
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
   * trackingCategories
   *
   * @param trackingCategories TrackingCategory
   * @return TrackingCategories
   */
  public TrackingCategories trackingCategories(TrackingCategory trackingCategories) {
    this.trackingCategories = trackingCategories;
    return this;
  }

  /**
   * Get trackingCategories
   *
   * @return trackingCategories
   */
  @ApiModelProperty(value = "")
  /**
   * trackingCategories
   *
   * @return trackingCategories TrackingCategory
   */
  public TrackingCategory getTrackingCategories() {
    return trackingCategories;
  }

  /**
   * trackingCategories
   *
   * @param trackingCategories TrackingCategory
   */
  public void setTrackingCategories(TrackingCategory trackingCategories) {
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
    TrackingCategories trackingCategories = (TrackingCategories) o;
    return Objects.equals(this.pagination, trackingCategories.pagination)
        && Objects.equals(this.problem, trackingCategories.problem)
        && Objects.equals(this.trackingCategories, trackingCategories.trackingCategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, problem, trackingCategories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackingCategories {\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    problem: ").append(toIndentedString(problem)).append("\n");
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