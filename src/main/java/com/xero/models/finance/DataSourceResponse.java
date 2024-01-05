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

/** DataSourceResponse */
public class DataSourceResponse {
  StringUtil util = new StringUtil();

  @JsonProperty("directBankFeed")
  private Double directBankFeed;

  @JsonProperty("indirectBankFeed")
  private Double indirectBankFeed;

  @JsonProperty("fileUpload")
  private Double fileUpload;

  @JsonProperty("manual")
  private Double manual;

  @JsonProperty("directBankFeedPos")
  private Double directBankFeedPos;

  @JsonProperty("indirectBankFeedPos")
  private Double indirectBankFeedPos;

  @JsonProperty("fileUploadPos")
  private Double fileUploadPos;

  @JsonProperty("manualPos")
  private Double manualPos;

  @JsonProperty("directBankFeedNeg")
  private Double directBankFeedNeg;

  @JsonProperty("indirectBankFeedNeg")
  private Double indirectBankFeedNeg;

  @JsonProperty("fileUploadNeg")
  private Double fileUploadNeg;

  @JsonProperty("manualNeg")
  private Double manualNeg;

  @JsonProperty("otherPos")
  private Double otherPos;

  @JsonProperty("otherNeg")
  private Double otherNeg;

  @JsonProperty("other")
  private Double other;
  /**
   * Sum of the amounts of all statement lines where the source of the data was a direct bank feed
   * in to Xero. This gives an indication on the certainty of correctness of the data.
   *
   * @param directBankFeed Double
   * @return DataSourceResponse
   */
  public DataSourceResponse directBankFeed(Double directBankFeed) {
    this.directBankFeed = directBankFeed;
    return this;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was a direct bank feed
   * in to Xero. This gives an indication on the certainty of correctness of the data.
   *
   * @return directBankFeed
   */
  @ApiModelProperty(
      value =
          "Sum of the amounts of all statement lines where the source of the data was a direct"
              + " bank feed in to Xero.   This gives an indication on the certainty of correctness"
              + " of the data.")
  /**
   * Sum of the amounts of all statement lines where the source of the data was a direct bank feed
   * in to Xero. This gives an indication on the certainty of correctness of the data.
   *
   * @return directBankFeed Double
   */
  public Double getDirectBankFeed() {
    return directBankFeed;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was a direct bank feed
   * in to Xero. This gives an indication on the certainty of correctness of the data.
   *
   * @param directBankFeed Double
   */
  public void setDirectBankFeed(Double directBankFeed) {
    this.directBankFeed = directBankFeed;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was a indirect bank feed
   * to Xero (usually via Yodlee). This gives an indication on the certainty of correctness of the
   * data.
   *
   * @param indirectBankFeed Double
   * @return DataSourceResponse
   */
  public DataSourceResponse indirectBankFeed(Double indirectBankFeed) {
    this.indirectBankFeed = indirectBankFeed;
    return this;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was a indirect bank feed
   * to Xero (usually via Yodlee). This gives an indication on the certainty of correctness of the
   * data.
   *
   * @return indirectBankFeed
   */
  @ApiModelProperty(
      value =
          "Sum of the amounts of all statement lines where the source of the data was a indirect"
              + " bank feed to Xero (usually via Yodlee).   This gives an indication on the"
              + " certainty of correctness of the data.")
  /**
   * Sum of the amounts of all statement lines where the source of the data was a indirect bank feed
   * to Xero (usually via Yodlee). This gives an indication on the certainty of correctness of the
   * data.
   *
   * @return indirectBankFeed Double
   */
  public Double getIndirectBankFeed() {
    return indirectBankFeed;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was a indirect bank feed
   * to Xero (usually via Yodlee). This gives an indication on the certainty of correctness of the
   * data.
   *
   * @param indirectBankFeed Double
   */
  public void setIndirectBankFeed(Double indirectBankFeed) {
    this.indirectBankFeed = indirectBankFeed;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was a CSV file upload in
   * to Xero. This gives an indication on the certainty of correctness of the data.
   *
   * @param fileUpload Double
   * @return DataSourceResponse
   */
  public DataSourceResponse fileUpload(Double fileUpload) {
    this.fileUpload = fileUpload;
    return this;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was a CSV file upload in
   * to Xero. This gives an indication on the certainty of correctness of the data.
   *
   * @return fileUpload
   */
  @ApiModelProperty(
      value =
          "Sum of the amounts of all statement lines where the source of the data was a CSV file"
              + " upload in to Xero.   This gives an indication on the certainty of correctness of"
              + " the data.")
  /**
   * Sum of the amounts of all statement lines where the source of the data was a CSV file upload in
   * to Xero. This gives an indication on the certainty of correctness of the data.
   *
   * @return fileUpload Double
   */
  public Double getFileUpload() {
    return fileUpload;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was a CSV file upload in
   * to Xero. This gives an indication on the certainty of correctness of the data.
   *
   * @param fileUpload Double
   */
  public void setFileUpload(Double fileUpload) {
    this.fileUpload = fileUpload;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was manually keyed in to
   * Xero. This gives an indication on the certainty of correctness of the data.
   *
   * @param manual Double
   * @return DataSourceResponse
   */
  public DataSourceResponse manual(Double manual) {
    this.manual = manual;
    return this;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was manually keyed in to
   * Xero. This gives an indication on the certainty of correctness of the data.
   *
   * @return manual
   */
  @ApiModelProperty(
      value =
          "Sum of the amounts of all statement lines where the source of the data was manually"
              + " keyed in to Xero.   This gives an indication on the certainty of correctness of"
              + " the data.")
  /**
   * Sum of the amounts of all statement lines where the source of the data was manually keyed in to
   * Xero. This gives an indication on the certainty of correctness of the data.
   *
   * @return manual Double
   */
  public Double getManual() {
    return manual;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was manually keyed in to
   * Xero. This gives an indication on the certainty of correctness of the data.
   *
   * @param manual Double
   */
  public void setManual(Double manual) {
    this.manual = manual;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was a direct bank feed
   * in to Xero. This gives an indication on the certainty of correctness of the data. Only positive
   * transactions are included.
   *
   * @param directBankFeedPos Double
   * @return DataSourceResponse
   */
  public DataSourceResponse directBankFeedPos(Double directBankFeedPos) {
    this.directBankFeedPos = directBankFeedPos;
    return this;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was a direct bank feed
   * in to Xero. This gives an indication on the certainty of correctness of the data. Only positive
   * transactions are included.
   *
   * @return directBankFeedPos
   */
  @ApiModelProperty(
      value =
          "Sum of the amounts of all statement lines where the source of the data was a direct"
              + " bank feed in to Xero.  This gives an indication on the certainty of correctness"
              + " of the data.  Only positive transactions are included.")
  /**
   * Sum of the amounts of all statement lines where the source of the data was a direct bank feed
   * in to Xero. This gives an indication on the certainty of correctness of the data. Only positive
   * transactions are included.
   *
   * @return directBankFeedPos Double
   */
  public Double getDirectBankFeedPos() {
    return directBankFeedPos;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was a direct bank feed
   * in to Xero. This gives an indication on the certainty of correctness of the data. Only positive
   * transactions are included.
   *
   * @param directBankFeedPos Double
   */
  public void setDirectBankFeedPos(Double directBankFeedPos) {
    this.directBankFeedPos = directBankFeedPos;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was a indirect bank feed
   * to Xero (usually via Yodlee). This gives an indication on the certainty of correctness of the
   * data. Only positive transactions are included.
   *
   * @param indirectBankFeedPos Double
   * @return DataSourceResponse
   */
  public DataSourceResponse indirectBankFeedPos(Double indirectBankFeedPos) {
    this.indirectBankFeedPos = indirectBankFeedPos;
    return this;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was a indirect bank feed
   * to Xero (usually via Yodlee). This gives an indication on the certainty of correctness of the
   * data. Only positive transactions are included.
   *
   * @return indirectBankFeedPos
   */
  @ApiModelProperty(
      value =
          "Sum of the amounts of all statement lines where the source of the data was a indirect"
              + " bank feed to Xero (usually via Yodlee).   This gives an indication on the"
              + " certainty of correctness of the data. Only positive transactions are included.")
  /**
   * Sum of the amounts of all statement lines where the source of the data was a indirect bank feed
   * to Xero (usually via Yodlee). This gives an indication on the certainty of correctness of the
   * data. Only positive transactions are included.
   *
   * @return indirectBankFeedPos Double
   */
  public Double getIndirectBankFeedPos() {
    return indirectBankFeedPos;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was a indirect bank feed
   * to Xero (usually via Yodlee). This gives an indication on the certainty of correctness of the
   * data. Only positive transactions are included.
   *
   * @param indirectBankFeedPos Double
   */
  public void setIndirectBankFeedPos(Double indirectBankFeedPos) {
    this.indirectBankFeedPos = indirectBankFeedPos;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was a CSV file upload in
   * to Xero. This gives an indication on the certainty of correctness of the data. Only positive
   * transactions are included.
   *
   * @param fileUploadPos Double
   * @return DataSourceResponse
   */
  public DataSourceResponse fileUploadPos(Double fileUploadPos) {
    this.fileUploadPos = fileUploadPos;
    return this;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was a CSV file upload in
   * to Xero. This gives an indication on the certainty of correctness of the data. Only positive
   * transactions are included.
   *
   * @return fileUploadPos
   */
  @ApiModelProperty(
      value =
          "Sum of the amounts of all statement lines where the source of the data was a CSV file"
              + " upload in to Xero.   This gives an indication on the certainty of correctness of"
              + " the data. Only positive transactions are included.")
  /**
   * Sum of the amounts of all statement lines where the source of the data was a CSV file upload in
   * to Xero. This gives an indication on the certainty of correctness of the data. Only positive
   * transactions are included.
   *
   * @return fileUploadPos Double
   */
  public Double getFileUploadPos() {
    return fileUploadPos;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was a CSV file upload in
   * to Xero. This gives an indication on the certainty of correctness of the data. Only positive
   * transactions are included.
   *
   * @param fileUploadPos Double
   */
  public void setFileUploadPos(Double fileUploadPos) {
    this.fileUploadPos = fileUploadPos;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was manually keyed in to
   * Xero. This gives an indication on the certainty of correctness of the data. Only positive
   * transactions are included.
   *
   * @param manualPos Double
   * @return DataSourceResponse
   */
  public DataSourceResponse manualPos(Double manualPos) {
    this.manualPos = manualPos;
    return this;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was manually keyed in to
   * Xero. This gives an indication on the certainty of correctness of the data. Only positive
   * transactions are included.
   *
   * @return manualPos
   */
  @ApiModelProperty(
      value =
          "Sum of the amounts of all statement lines where the source of the data was manually"
              + " keyed in to Xero.   This gives an indication on the certainty of correctness of"
              + " the data. Only positive transactions are included.")
  /**
   * Sum of the amounts of all statement lines where the source of the data was manually keyed in to
   * Xero. This gives an indication on the certainty of correctness of the data. Only positive
   * transactions are included.
   *
   * @return manualPos Double
   */
  public Double getManualPos() {
    return manualPos;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was manually keyed in to
   * Xero. This gives an indication on the certainty of correctness of the data. Only positive
   * transactions are included.
   *
   * @param manualPos Double
   */
  public void setManualPos(Double manualPos) {
    this.manualPos = manualPos;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was a direct bank feed
   * in to Xero. This gives an indication on the certainty of correctness of the data. Only negative
   * transactions are included.
   *
   * @param directBankFeedNeg Double
   * @return DataSourceResponse
   */
  public DataSourceResponse directBankFeedNeg(Double directBankFeedNeg) {
    this.directBankFeedNeg = directBankFeedNeg;
    return this;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was a direct bank feed
   * in to Xero. This gives an indication on the certainty of correctness of the data. Only negative
   * transactions are included.
   *
   * @return directBankFeedNeg
   */
  @ApiModelProperty(
      value =
          "Sum of the amounts of all statement lines where the source of the data was a direct"
              + " bank feed in to Xero.   This gives an indication on the certainty of correctness"
              + " of the data.  Only negative transactions are included.")
  /**
   * Sum of the amounts of all statement lines where the source of the data was a direct bank feed
   * in to Xero. This gives an indication on the certainty of correctness of the data. Only negative
   * transactions are included.
   *
   * @return directBankFeedNeg Double
   */
  public Double getDirectBankFeedNeg() {
    return directBankFeedNeg;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was a direct bank feed
   * in to Xero. This gives an indication on the certainty of correctness of the data. Only negative
   * transactions are included.
   *
   * @param directBankFeedNeg Double
   */
  public void setDirectBankFeedNeg(Double directBankFeedNeg) {
    this.directBankFeedNeg = directBankFeedNeg;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was a indirect bank feed
   * to Xero (usually via Yodlee). This gives an indication on the certainty of correctness of the
   * data. Only negative transactions are included.
   *
   * @param indirectBankFeedNeg Double
   * @return DataSourceResponse
   */
  public DataSourceResponse indirectBankFeedNeg(Double indirectBankFeedNeg) {
    this.indirectBankFeedNeg = indirectBankFeedNeg;
    return this;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was a indirect bank feed
   * to Xero (usually via Yodlee). This gives an indication on the certainty of correctness of the
   * data. Only negative transactions are included.
   *
   * @return indirectBankFeedNeg
   */
  @ApiModelProperty(
      value =
          "Sum of the amounts of all statement lines where the source of the data was a indirect"
              + " bank feed to Xero (usually via Yodlee).   This gives an indication on the"
              + " certainty of correctness of the data.  Only negative transactions are included.")
  /**
   * Sum of the amounts of all statement lines where the source of the data was a indirect bank feed
   * to Xero (usually via Yodlee). This gives an indication on the certainty of correctness of the
   * data. Only negative transactions are included.
   *
   * @return indirectBankFeedNeg Double
   */
  public Double getIndirectBankFeedNeg() {
    return indirectBankFeedNeg;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was a indirect bank feed
   * to Xero (usually via Yodlee). This gives an indication on the certainty of correctness of the
   * data. Only negative transactions are included.
   *
   * @param indirectBankFeedNeg Double
   */
  public void setIndirectBankFeedNeg(Double indirectBankFeedNeg) {
    this.indirectBankFeedNeg = indirectBankFeedNeg;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was a CSV file upload in
   * to Xero. This gives an indication on the certainty of correctness of the data. Only negative
   * transactions are included.
   *
   * @param fileUploadNeg Double
   * @return DataSourceResponse
   */
  public DataSourceResponse fileUploadNeg(Double fileUploadNeg) {
    this.fileUploadNeg = fileUploadNeg;
    return this;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was a CSV file upload in
   * to Xero. This gives an indication on the certainty of correctness of the data. Only negative
   * transactions are included.
   *
   * @return fileUploadNeg
   */
  @ApiModelProperty(
      value =
          "Sum of the amounts of all statement lines where the source of the data was a CSV file"
              + " upload in to Xero.   This gives an indication on the certainty of correctness of"
              + " the data.  Only negative transactions are included.")
  /**
   * Sum of the amounts of all statement lines where the source of the data was a CSV file upload in
   * to Xero. This gives an indication on the certainty of correctness of the data. Only negative
   * transactions are included.
   *
   * @return fileUploadNeg Double
   */
  public Double getFileUploadNeg() {
    return fileUploadNeg;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was a CSV file upload in
   * to Xero. This gives an indication on the certainty of correctness of the data. Only negative
   * transactions are included.
   *
   * @param fileUploadNeg Double
   */
  public void setFileUploadNeg(Double fileUploadNeg) {
    this.fileUploadNeg = fileUploadNeg;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was manually keyed in to
   * Xero. This gives an indication on the certainty of correctness of the data. Only negative
   * transactions are included.
   *
   * @param manualNeg Double
   * @return DataSourceResponse
   */
  public DataSourceResponse manualNeg(Double manualNeg) {
    this.manualNeg = manualNeg;
    return this;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was manually keyed in to
   * Xero. This gives an indication on the certainty of correctness of the data. Only negative
   * transactions are included.
   *
   * @return manualNeg
   */
  @ApiModelProperty(
      value =
          "Sum of the amounts of all statement lines where the source of the data was manually"
              + " keyed in to Xero.   This gives an indication on the certainty of correctness of"
              + " the data.  Only negative transactions are included.")
  /**
   * Sum of the amounts of all statement lines where the source of the data was manually keyed in to
   * Xero. This gives an indication on the certainty of correctness of the data. Only negative
   * transactions are included.
   *
   * @return manualNeg Double
   */
  public Double getManualNeg() {
    return manualNeg;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was manually keyed in to
   * Xero. This gives an indication on the certainty of correctness of the data. Only negative
   * transactions are included.
   *
   * @param manualNeg Double
   */
  public void setManualNeg(Double manualNeg) {
    this.manualNeg = manualNeg;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was any other category.
   * This gives an indication on the certainty of correctness of the data. Only positive
   * transactions are included.
   *
   * @param otherPos Double
   * @return DataSourceResponse
   */
  public DataSourceResponse otherPos(Double otherPos) {
    this.otherPos = otherPos;
    return this;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was any other category.
   * This gives an indication on the certainty of correctness of the data. Only positive
   * transactions are included.
   *
   * @return otherPos
   */
  @ApiModelProperty(
      value =
          "Sum of the amounts of all statement lines where the source of the data was any other"
              + " category.   This gives an indication on the certainty of correctness of the"
              + " data.  Only positive transactions are included.")
  /**
   * Sum of the amounts of all statement lines where the source of the data was any other category.
   * This gives an indication on the certainty of correctness of the data. Only positive
   * transactions are included.
   *
   * @return otherPos Double
   */
  public Double getOtherPos() {
    return otherPos;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was any other category.
   * This gives an indication on the certainty of correctness of the data. Only positive
   * transactions are included.
   *
   * @param otherPos Double
   */
  public void setOtherPos(Double otherPos) {
    this.otherPos = otherPos;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was any other category.
   * This gives an indication on the certainty of correctness of the data. Only negative
   * transactions are included.
   *
   * @param otherNeg Double
   * @return DataSourceResponse
   */
  public DataSourceResponse otherNeg(Double otherNeg) {
    this.otherNeg = otherNeg;
    return this;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was any other category.
   * This gives an indication on the certainty of correctness of the data. Only negative
   * transactions are included.
   *
   * @return otherNeg
   */
  @ApiModelProperty(
      value =
          "Sum of the amounts of all statement lines where the source of the data was any other"
              + " category.   This gives an indication on the certainty of correctness of the"
              + " data.  Only negative transactions are included.")
  /**
   * Sum of the amounts of all statement lines where the source of the data was any other category.
   * This gives an indication on the certainty of correctness of the data. Only negative
   * transactions are included.
   *
   * @return otherNeg Double
   */
  public Double getOtherNeg() {
    return otherNeg;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was any other category.
   * This gives an indication on the certainty of correctness of the data. Only negative
   * transactions are included.
   *
   * @param otherNeg Double
   */
  public void setOtherNeg(Double otherNeg) {
    this.otherNeg = otherNeg;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was any other category.
   * This gives an indication on the certainty of correctness of the data.
   *
   * @param other Double
   * @return DataSourceResponse
   */
  public DataSourceResponse other(Double other) {
    this.other = other;
    return this;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was any other category.
   * This gives an indication on the certainty of correctness of the data.
   *
   * @return other
   */
  @ApiModelProperty(
      value =
          "Sum of the amounts of all statement lines where the source of the data was any other"
              + " category.   This gives an indication on the certainty of correctness of the"
              + " data.")
  /**
   * Sum of the amounts of all statement lines where the source of the data was any other category.
   * This gives an indication on the certainty of correctness of the data.
   *
   * @return other Double
   */
  public Double getOther() {
    return other;
  }

  /**
   * Sum of the amounts of all statement lines where the source of the data was any other category.
   * This gives an indication on the certainty of correctness of the data.
   *
   * @param other Double
   */
  public void setOther(Double other) {
    this.other = other;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataSourceResponse dataSourceResponse = (DataSourceResponse) o;
    return Objects.equals(this.directBankFeed, dataSourceResponse.directBankFeed)
        && Objects.equals(this.indirectBankFeed, dataSourceResponse.indirectBankFeed)
        && Objects.equals(this.fileUpload, dataSourceResponse.fileUpload)
        && Objects.equals(this.manual, dataSourceResponse.manual)
        && Objects.equals(this.directBankFeedPos, dataSourceResponse.directBankFeedPos)
        && Objects.equals(this.indirectBankFeedPos, dataSourceResponse.indirectBankFeedPos)
        && Objects.equals(this.fileUploadPos, dataSourceResponse.fileUploadPos)
        && Objects.equals(this.manualPos, dataSourceResponse.manualPos)
        && Objects.equals(this.directBankFeedNeg, dataSourceResponse.directBankFeedNeg)
        && Objects.equals(this.indirectBankFeedNeg, dataSourceResponse.indirectBankFeedNeg)
        && Objects.equals(this.fileUploadNeg, dataSourceResponse.fileUploadNeg)
        && Objects.equals(this.manualNeg, dataSourceResponse.manualNeg)
        && Objects.equals(this.otherPos, dataSourceResponse.otherPos)
        && Objects.equals(this.otherNeg, dataSourceResponse.otherNeg)
        && Objects.equals(this.other, dataSourceResponse.other);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        directBankFeed,
        indirectBankFeed,
        fileUpload,
        manual,
        directBankFeedPos,
        indirectBankFeedPos,
        fileUploadPos,
        manualPos,
        directBankFeedNeg,
        indirectBankFeedNeg,
        fileUploadNeg,
        manualNeg,
        otherPos,
        otherNeg,
        other);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataSourceResponse {\n");
    sb.append("    directBankFeed: ").append(toIndentedString(directBankFeed)).append("\n");
    sb.append("    indirectBankFeed: ").append(toIndentedString(indirectBankFeed)).append("\n");
    sb.append("    fileUpload: ").append(toIndentedString(fileUpload)).append("\n");
    sb.append("    manual: ").append(toIndentedString(manual)).append("\n");
    sb.append("    directBankFeedPos: ").append(toIndentedString(directBankFeedPos)).append("\n");
    sb.append("    indirectBankFeedPos: ")
        .append(toIndentedString(indirectBankFeedPos))
        .append("\n");
    sb.append("    fileUploadPos: ").append(toIndentedString(fileUploadPos)).append("\n");
    sb.append("    manualPos: ").append(toIndentedString(manualPos)).append("\n");
    sb.append("    directBankFeedNeg: ").append(toIndentedString(directBankFeedNeg)).append("\n");
    sb.append("    indirectBankFeedNeg: ")
        .append(toIndentedString(indirectBankFeedNeg))
        .append("\n");
    sb.append("    fileUploadNeg: ").append(toIndentedString(fileUploadNeg)).append("\n");
    sb.append("    manualNeg: ").append(toIndentedString(manualNeg)).append("\n");
    sb.append("    otherPos: ").append(toIndentedString(otherPos)).append("\n");
    sb.append("    otherNeg: ").append(toIndentedString(otherNeg)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
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