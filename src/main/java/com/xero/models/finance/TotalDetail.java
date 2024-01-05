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
import java.util.Objects;

/** TotalDetail */
public class TotalDetail {
  StringUtil util = new StringUtil();

  @JsonProperty("totalPaid")
  private Double totalPaid;

  @JsonProperty("totalOutstanding")
  private Double totalOutstanding;

  @JsonProperty("totalCreditedUnApplied")
  private Double totalCreditedUnApplied;
  /**
   * Total paid invoice and cash value within the period.
   *
   * @param totalPaid Double
   * @return TotalDetail
   */
  public TotalDetail totalPaid(Double totalPaid) {
    this.totalPaid = totalPaid;
    return this;
  }

  /**
   * Total paid invoice and cash value within the period.
   *
   * @return totalPaid
   */
  @ApiModelProperty(value = "Total paid invoice and cash value within the period.")
  /**
   * Total paid invoice and cash value within the period.
   *
   * @return totalPaid Double
   */
  public Double getTotalPaid() {
    return totalPaid;
  }

  /**
   * Total paid invoice and cash value within the period.
   *
   * @param totalPaid Double
   */
  public void setTotalPaid(Double totalPaid) {
    this.totalPaid = totalPaid;
  }

  /**
   * Total outstanding invoice value within the period.
   *
   * @param totalOutstanding Double
   * @return TotalDetail
   */
  public TotalDetail totalOutstanding(Double totalOutstanding) {
    this.totalOutstanding = totalOutstanding;
    return this;
  }

  /**
   * Total outstanding invoice value within the period.
   *
   * @return totalOutstanding
   */
  @ApiModelProperty(value = "Total outstanding invoice value within the period.")
  /**
   * Total outstanding invoice value within the period.
   *
   * @return totalOutstanding Double
   */
  public Double getTotalOutstanding() {
    return totalOutstanding;
  }

  /**
   * Total outstanding invoice value within the period.
   *
   * @param totalOutstanding Double
   */
  public void setTotalOutstanding(Double totalOutstanding) {
    this.totalOutstanding = totalOutstanding;
  }

  /**
   * Total unapplied credited value within the period.
   *
   * @param totalCreditedUnApplied Double
   * @return TotalDetail
   */
  public TotalDetail totalCreditedUnApplied(Double totalCreditedUnApplied) {
    this.totalCreditedUnApplied = totalCreditedUnApplied;
    return this;
  }

  /**
   * Total unapplied credited value within the period.
   *
   * @return totalCreditedUnApplied
   */
  @ApiModelProperty(value = "Total unapplied credited value within the period.")
  /**
   * Total unapplied credited value within the period.
   *
   * @return totalCreditedUnApplied Double
   */
  public Double getTotalCreditedUnApplied() {
    return totalCreditedUnApplied;
  }

  /**
   * Total unapplied credited value within the period.
   *
   * @param totalCreditedUnApplied Double
   */
  public void setTotalCreditedUnApplied(Double totalCreditedUnApplied) {
    this.totalCreditedUnApplied = totalCreditedUnApplied;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TotalDetail totalDetail = (TotalDetail) o;
    return Objects.equals(this.totalPaid, totalDetail.totalPaid)
        && Objects.equals(this.totalOutstanding, totalDetail.totalOutstanding)
        && Objects.equals(this.totalCreditedUnApplied, totalDetail.totalCreditedUnApplied);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalPaid, totalOutstanding, totalCreditedUnApplied);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TotalDetail {\n");
    sb.append("    totalPaid: ").append(toIndentedString(totalPaid)).append("\n");
    sb.append("    totalOutstanding: ").append(toIndentedString(totalOutstanding)).append("\n");
    sb.append("    totalCreditedUnApplied: ")
        .append(toIndentedString(totalCreditedUnApplied))
        .append("\n");
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
