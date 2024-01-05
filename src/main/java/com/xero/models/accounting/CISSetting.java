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

/** CISSetting */
public class CISSetting {
  StringUtil util = new StringUtil();

  @JsonProperty("CISEnabled")
  private Boolean ciSEnabled;

  @JsonProperty("Rate")
  private Double rate;
  /**
   * Boolean that describes if the contact is a CIS Subcontractor
   *
   * @param ciSEnabled Boolean
   * @return CISSetting
   */
  public CISSetting ciSEnabled(Boolean ciSEnabled) {
    this.ciSEnabled = ciSEnabled;
    return this;
  }

  /**
   * Boolean that describes if the contact is a CIS Subcontractor
   *
   * @return ciSEnabled
   */
  @ApiModelProperty(value = "Boolean that describes if the contact is a CIS Subcontractor")
  /**
   * Boolean that describes if the contact is a CIS Subcontractor
   *
   * @return ciSEnabled Boolean
   */
  public Boolean getCiSEnabled() {
    return ciSEnabled;
  }

  /**
   * Boolean that describes if the contact is a CIS Subcontractor
   *
   * @param ciSEnabled Boolean
   */
  public void setCiSEnabled(Boolean ciSEnabled) {
    this.ciSEnabled = ciSEnabled;
  }

  /**
   * CIS Deduction rate for the contact if he is a subcontractor. If the contact is not CISEnabled,
   * then the rate is not returned
   *
   * @return rate
   */
  @ApiModelProperty(
      value =
          "CIS Deduction rate for the contact if he is a subcontractor. If the contact is not"
              + " CISEnabled, then the rate is not returned")
  /**
   * CIS Deduction rate for the contact if he is a subcontractor. If the contact is not CISEnabled,
   * then the rate is not returned
   *
   * @return rate Double
   */
  public Double getRate() {
    return rate;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CISSetting ciSSetting = (CISSetting) o;
    return Objects.equals(this.ciSEnabled, ciSSetting.ciSEnabled)
        && Objects.equals(this.rate, ciSSetting.rate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ciSEnabled, rate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CISSetting {\n");
    sb.append("    ciSEnabled: ").append(toIndentedString(ciSEnabled)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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