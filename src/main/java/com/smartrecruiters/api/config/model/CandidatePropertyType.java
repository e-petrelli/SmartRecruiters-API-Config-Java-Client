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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets CandidatePropertyType
 */
@JsonAdapter(CandidatePropertyType.Adapter.class)
public enum CandidatePropertyType {
  
  BOOLEAN("BOOLEAN"),
  
  COUNTRY("COUNTRY"),
  
  CURRENCY("CURRENCY"),
  
  DATE("DATE"),
  
  NUMBER("NUMBER"),
  
  PERCENT("PERCENT"),
  
  REGION("REGION"),
  
  TEXT("TEXT"),
  
  USER("USER"),
  
  SINGLE_SELECT("SINGLE_SELECT");

  private String value;

  CandidatePropertyType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CandidatePropertyType fromValue(String value) {
    for (CandidatePropertyType b : CandidatePropertyType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CandidatePropertyType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CandidatePropertyType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CandidatePropertyType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CandidatePropertyType.fromValue(value);
    }
  }
}
