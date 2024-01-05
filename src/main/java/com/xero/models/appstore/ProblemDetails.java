/*
 * Xero AppStore API
 * These endpoints are for Xero Partners to interact with the App Store Billing platform
 *
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.appstore;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ProblemDetails */
public class ProblemDetails {
  StringUtil util = new StringUtil();

  @JsonProperty("detail")
  private String detail;

  @JsonProperty("extensions")
  private Object extensions;

  @JsonProperty("instance")
  private String instance;

  @JsonProperty("status")
  private Integer status;

  @JsonProperty("title")
  private String title;

  @JsonProperty("type")
  private String type;
  /**
   * detail
   *
   * @param detail String
   * @return ProblemDetails
   */
  public ProblemDetails detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * Get detail
   *
   * @return detail
   */
  @ApiModelProperty(value = "")
  /**
   * detail
   *
   * @return detail String
   */
  public String getDetail() {
    return detail;
  }

  /**
   * detail
   *
   * @param detail String
   */
  public void setDetail(String detail) {
    this.detail = detail;
  }

  /**
   * extensions
   *
   * @param extensions Object
   * @return ProblemDetails
   */
  public ProblemDetails extensions(Object extensions) {
    this.extensions = extensions;
    return this;
  }

  /**
   * Get extensions
   *
   * @return extensions
   */
  @ApiModelProperty(value = "")
  /**
   * extensions
   *
   * @return extensions Object
   */
  public Object getExtensions() {
    return extensions;
  }

  /**
   * extensions
   *
   * @param extensions Object
   */
  public void setExtensions(Object extensions) {
    this.extensions = extensions;
  }

  /**
   * instance
   *
   * @param instance String
   * @return ProblemDetails
   */
  public ProblemDetails instance(String instance) {
    this.instance = instance;
    return this;
  }

  /**
   * Get instance
   *
   * @return instance
   */
  @ApiModelProperty(value = "")
  /**
   * instance
   *
   * @return instance String
   */
  public String getInstance() {
    return instance;
  }

  /**
   * instance
   *
   * @param instance String
   */
  public void setInstance(String instance) {
    this.instance = instance;
  }

  /**
   * status
   *
   * @param status Integer
   * @return ProblemDetails
   */
  public ProblemDetails status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   *
   * @return status
   */
  @ApiModelProperty(value = "")
  /**
   * status
   *
   * @return status Integer
   */
  public Integer getStatus() {
    return status;
  }

  /**
   * status
   *
   * @param status Integer
   */
  public void setStatus(Integer status) {
    this.status = status;
  }

  /**
   * title
   *
   * @param title String
   * @return ProblemDetails
   */
  public ProblemDetails title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   *
   * @return title
   */
  @ApiModelProperty(value = "")
  /**
   * title
   *
   * @return title String
   */
  public String getTitle() {
    return title;
  }

  /**
   * title
   *
   * @param title String
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * type
   *
   * @param type String
   * @return ProblemDetails
   */
  public ProblemDetails type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @ApiModelProperty(value = "")
  /**
   * type
   *
   * @return type String
   */
  public String getType() {
    return type;
  }

  /**
   * type
   *
   * @param type String
   */
  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProblemDetails problemDetails = (ProblemDetails) o;
    return Objects.equals(this.detail, problemDetails.detail)
        && Objects.equals(this.extensions, problemDetails.extensions)
        && Objects.equals(this.instance, problemDetails.instance)
        && Objects.equals(this.status, problemDetails.status)
        && Objects.equals(this.title, problemDetails.title)
        && Objects.equals(this.type, problemDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detail, extensions, instance, status, title, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProblemDetails {\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
