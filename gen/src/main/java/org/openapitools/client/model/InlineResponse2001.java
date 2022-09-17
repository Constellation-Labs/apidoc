/*
 * Node Public API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: operators@constellationnetwork.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * InlineResponse2001
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T20:15:22.967531+02:00[Europe/Warsaw]")
public class InlineResponse2001 {
  public static final String SERIALIZED_NAME_PREV_HASH = "prevHash";
  @SerializedName(SERIALIZED_NAME_PREV_HASH)
  private String prevHash;

  public static final String SERIALIZED_NAME_ORDINAL = "ordinal";
  @SerializedName(SERIALIZED_NAME_ORDINAL)
  private BigDecimal ordinal;


  public InlineResponse2001 prevHash(String prevHash) {
    
    this.prevHash = prevHash;
    return this;
  }

   /**
   * Get prevHash
   * @return prevHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrevHash() {
    return prevHash;
  }


  public void setPrevHash(String prevHash) {
    this.prevHash = prevHash;
  }


  public InlineResponse2001 ordinal(BigDecimal ordinal) {
    
    this.ordinal = ordinal;
    return this;
  }

   /**
   * Get ordinal
   * @return ordinal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getOrdinal() {
    return ordinal;
  }


  public void setOrdinal(BigDecimal ordinal) {
    this.ordinal = ordinal;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001 inlineResponse2001 = (InlineResponse2001) o;
    return Objects.equals(this.prevHash, inlineResponse2001.prevHash) &&
        Objects.equals(this.ordinal, inlineResponse2001.ordinal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prevHash, ordinal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");
    sb.append("    prevHash: ").append(toIndentedString(prevHash)).append("\n");
    sb.append("    ordinal: ").append(toIndentedString(ordinal)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
