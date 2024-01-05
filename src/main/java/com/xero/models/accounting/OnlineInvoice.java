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
import java.util.Objects;

/** OnlineInvoice */
public class OnlineInvoice {
  StringUtil util = new StringUtil();

  @JsonProperty("OnlineInvoiceUrl")
  private String onlineInvoiceUrl;
  /**
   * the URL to an online invoice
   *
   * @param onlineInvoiceUrl String
   * @return OnlineInvoice
   */
  public OnlineInvoice onlineInvoiceUrl(String onlineInvoiceUrl) {
    this.onlineInvoiceUrl = onlineInvoiceUrl;
    return this;
  }

  /**
   * the URL to an online invoice
   *
   * @return onlineInvoiceUrl
   */
  @ApiModelProperty(value = "the URL to an online invoice")
  /**
   * the URL to an online invoice
   *
   * @return onlineInvoiceUrl String
   */
  public String getOnlineInvoiceUrl() {
    return onlineInvoiceUrl;
  }

  /**
   * the URL to an online invoice
   *
   * @param onlineInvoiceUrl String
   */
  public void setOnlineInvoiceUrl(String onlineInvoiceUrl) {
    this.onlineInvoiceUrl = onlineInvoiceUrl;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OnlineInvoice onlineInvoice = (OnlineInvoice) o;
    return Objects.equals(this.onlineInvoiceUrl, onlineInvoice.onlineInvoiceUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onlineInvoiceUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OnlineInvoice {\n");
    sb.append("    onlineInvoiceUrl: ").append(toIndentedString(onlineInvoiceUrl)).append("\n");
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