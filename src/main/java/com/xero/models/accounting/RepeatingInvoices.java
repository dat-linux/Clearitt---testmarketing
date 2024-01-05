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

/** RepeatingInvoices */
public class RepeatingInvoices {
  StringUtil util = new StringUtil();

  @JsonProperty("RepeatingInvoices")
  private List<RepeatingInvoice> repeatingInvoices = new ArrayList<RepeatingInvoice>();
  /**
   * repeatingInvoices
   *
   * @param repeatingInvoices List&lt;RepeatingInvoice&gt;
   * @return RepeatingInvoices
   */
  public RepeatingInvoices repeatingInvoices(List<RepeatingInvoice> repeatingInvoices) {
    this.repeatingInvoices = repeatingInvoices;
    return this;
  }

  /**
   * repeatingInvoices
   *
   * @param repeatingInvoicesItem RepeatingInvoice
   * @return RepeatingInvoices
   */
  public RepeatingInvoices addRepeatingInvoicesItem(RepeatingInvoice repeatingInvoicesItem) {
    if (this.repeatingInvoices == null) {
      this.repeatingInvoices = new ArrayList<RepeatingInvoice>();
    }
    this.repeatingInvoices.add(repeatingInvoicesItem);
    return this;
  }

  /**
   * Get repeatingInvoices
   *
   * @return repeatingInvoices
   */
  @ApiModelProperty(value = "")
  /**
   * repeatingInvoices
   *
   * @return repeatingInvoices List<RepeatingInvoice>
   */
  public List<RepeatingInvoice> getRepeatingInvoices() {
    return repeatingInvoices;
  }

  /**
   * repeatingInvoices
   *
   * @param repeatingInvoices List&lt;RepeatingInvoice&gt;
   */
  public void setRepeatingInvoices(List<RepeatingInvoice> repeatingInvoices) {
    this.repeatingInvoices = repeatingInvoices;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepeatingInvoices repeatingInvoices = (RepeatingInvoices) o;
    return Objects.equals(this.repeatingInvoices, repeatingInvoices.repeatingInvoices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repeatingInvoices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepeatingInvoices {\n");
    sb.append("    repeatingInvoices: ").append(toIndentedString(repeatingInvoices)).append("\n");
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
