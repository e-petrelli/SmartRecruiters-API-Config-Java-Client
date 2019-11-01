/*
 * Configuration API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.smartrecruiters.api.config.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.smartrecruiters.api.config.model.DependentJobPropertyValuesRelation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DependentJobPropertyValuesRelations
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-01T11:44:28.029340+01:00[Europe/Rome]")
public class DependentJobPropertyValuesRelations {
  public static final String SERIALIZED_NAME_TOTAL_FOUND = "totalFound";
  @SerializedName(SERIALIZED_NAME_TOTAL_FOUND)
  private Integer totalFound;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private List<DependentJobPropertyValuesRelation> content = new ArrayList<DependentJobPropertyValuesRelation>();


  public DependentJobPropertyValuesRelations totalFound(Integer totalFound) {
    
    this.totalFound = totalFound;
    return this;
  }

   /**
   * Get totalFound
   * @return totalFound
  **/
  @ApiModelProperty(required = true, value = "")

  public Integer getTotalFound() {
    return totalFound;
  }



  public void setTotalFound(Integer totalFound) {
    this.totalFound = totalFound;
  }


  public DependentJobPropertyValuesRelations content(List<DependentJobPropertyValuesRelation> content) {
    
    this.content = content;
    return this;
  }

  public DependentJobPropertyValuesRelations addContentItem(DependentJobPropertyValuesRelation contentItem) {
    this.content.add(contentItem);
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(required = true, value = "")

  public List<DependentJobPropertyValuesRelation> getContent() {
    return content;
  }



  public void setContent(List<DependentJobPropertyValuesRelation> content) {
    this.content = content;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DependentJobPropertyValuesRelations dependentJobPropertyValuesRelations = (DependentJobPropertyValuesRelations) o;
    return Objects.equals(this.totalFound, dependentJobPropertyValuesRelations.totalFound) &&
        Objects.equals(this.content, dependentJobPropertyValuesRelations.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalFound, content);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DependentJobPropertyValuesRelations {\n");
    sb.append("    totalFound: ").append(toIndentedString(totalFound)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
