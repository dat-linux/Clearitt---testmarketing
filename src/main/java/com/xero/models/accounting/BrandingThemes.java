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

/** BrandingThemes */
public class BrandingThemes {
  StringUtil util = new StringUtil();

  @JsonProperty("BrandingThemes")
  private List<BrandingTheme> brandingThemes = new ArrayList<BrandingTheme>();
  /**
   * brandingThemes
   *
   * @param brandingThemes List&lt;BrandingTheme&gt;
   * @return BrandingThemes
   */
  public BrandingThemes brandingThemes(List<BrandingTheme> brandingThemes) {
    this.brandingThemes = brandingThemes;
    return this;
  }

  /**
   * brandingThemes
   *
   * @param brandingThemesItem BrandingTheme
   * @return BrandingThemes
   */
  public BrandingThemes addBrandingThemesItem(BrandingTheme brandingThemesItem) {
    if (this.brandingThemes == null) {
      this.brandingThemes = new ArrayList<BrandingTheme>();
    }
    this.brandingThemes.add(brandingThemesItem);
    return this;
  }

  /**
   * Get brandingThemes
   *
   * @return brandingThemes
   */
  @ApiModelProperty(value = "")
  /**
   * brandingThemes
   *
   * @return brandingThemes List<BrandingTheme>
   */
  public List<BrandingTheme> getBrandingThemes() {
    return brandingThemes;
  }

  /**
   * brandingThemes
   *
   * @param brandingThemes List&lt;BrandingTheme&gt;
   */
  public void setBrandingThemes(List<BrandingTheme> brandingThemes) {
    this.brandingThemes = brandingThemes;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandingThemes brandingThemes = (BrandingThemes) o;
    return Objects.equals(this.brandingThemes, brandingThemes.brandingThemes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandingThemes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandingThemes {\n");
    sb.append("    brandingThemes: ").append(toIndentedString(brandingThemes)).append("\n");
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