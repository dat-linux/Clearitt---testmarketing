/*
 * Xero Assets API
 * The Assets API exposes fixed asset related functions of the Xero Accounting application and can be used for a variety of purposes such as creating assets, retrieving asset valuations etc.
 *
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.assets;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** Pagination */
public class Pagination {
  StringUtil util = new StringUtil();

  @JsonProperty("page")
  private Integer page;

  @JsonProperty("pageSize")
  private Integer pageSize;

  @JsonProperty("pageCount")
  private Integer pageCount;

  @JsonProperty("itemCount")
  private Integer itemCount;
  /**
   * page
   *
   * @param page Integer
   * @return Pagination
   */
  public Pagination page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   *
   * @return page
   */
  @ApiModelProperty(example = "1", value = "")
  /**
   * page
   *
   * @return page Integer
   */
  public Integer getPage() {
    return page;
  }

  /**
   * page
   *
   * @param page Integer
   */
  public void setPage(Integer page) {
    this.page = page;
  }

  /**
   * pageSize
   *
   * @param pageSize Integer
   * @return Pagination
   */
  public Pagination pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Get pageSize
   *
   * @return pageSize
   */
  @ApiModelProperty(example = "10", value = "")
  /**
   * pageSize
   *
   * @return pageSize Integer
   */
  public Integer getPageSize() {
    return pageSize;
  }

  /**
   * pageSize
   *
   * @param pageSize Integer
   */
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  /**
   * pageCount
   *
   * @param pageCount Integer
   * @return Pagination
   */
  public Pagination pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }

  /**
   * Get pageCount
   *
   * @return pageCount
   */
  @ApiModelProperty(example = "1", value = "")
  /**
   * pageCount
   *
   * @return pageCount Integer
   */
  public Integer getPageCount() {
    return pageCount;
  }

  /**
   * pageCount
   *
   * @param pageCount Integer
   */
  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }

  /**
   * itemCount
   *
   * @param itemCount Integer
   * @return Pagination
   */
  public Pagination itemCount(Integer itemCount) {
    this.itemCount = itemCount;
    return this;
  }

  /**
   * Get itemCount
   *
   * @return itemCount
   */
  @ApiModelProperty(example = "2", value = "")
  /**
   * itemCount
   *
   * @return itemCount Integer
   */
  public Integer getItemCount() {
    return itemCount;
  }

  /**
   * itemCount
   *
   * @param itemCount Integer
   */
  public void setItemCount(Integer itemCount) {
    this.itemCount = itemCount;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pagination pagination = (Pagination) o;
    return Objects.equals(this.page, pagination.page)
        && Objects.equals(this.pageSize, pagination.pageSize)
        && Objects.equals(this.pageCount, pagination.pageCount)
        && Objects.equals(this.itemCount, pagination.itemCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, pageSize, pageCount, itemCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pagination {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
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