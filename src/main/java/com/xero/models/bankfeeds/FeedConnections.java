/*
 * Xero Bank Feeds API
 * The Bank Feeds API is a closed API that is only available to financial institutions that have an established financial services partnership with Xero. If you're an existing financial services partner that wants access, contact your local Partner Manager. If you're a financial institution who wants to provide bank feeds to your business customers, contact us to become a financial services partner.
 *
 * Contact: api@xero.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.xero.models.bankfeeds;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xero.api.StringUtil;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** FeedConnections */
public class FeedConnections {
  StringUtil util = new StringUtil();

  @JsonProperty("pagination")
  private Pagination pagination;

  @JsonProperty("items")
  private List<FeedConnection> items = new ArrayList<FeedConnection>();
  /**
   * pagination
   *
   * @param pagination Pagination
   * @return FeedConnections
   */
  public FeedConnections pagination(Pagination pagination) {
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
   * items
   *
   * @param items List&lt;FeedConnection&gt;
   * @return FeedConnections
   */
  public FeedConnections items(List<FeedConnection> items) {
    this.items = items;
    return this;
  }

  /**
   * items
   *
   * @param itemsItem FeedConnection
   * @return FeedConnections
   */
  public FeedConnections addItemsItem(FeedConnection itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<FeedConnection>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   *
   * @return items
   */
  @ApiModelProperty(value = "")
  /**
   * items
   *
   * @return items List<FeedConnection>
   */
  public List<FeedConnection> getItems() {
    return items;
  }

  /**
   * items
   *
   * @param items List&lt;FeedConnection&gt;
   */
  public void setItems(List<FeedConnection> items) {
    this.items = items;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedConnections feedConnections = (FeedConnections) o;
    return Objects.equals(this.pagination, feedConnections.pagination)
        && Objects.equals(this.items, feedConnections.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedConnections {\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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