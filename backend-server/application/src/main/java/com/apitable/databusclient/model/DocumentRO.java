/*
 * databus-server
 * databus-server APIs
 *
 * The version of the OpenAPI document: 1.2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.apitable.databusclient.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.apitable.databusclient.JSON;

/**
 * DocumentRO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DocumentRO {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private File data;

  public static final String SERIALIZED_NAME_DOCUMENT_TYPE = "document_type";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE)
  private Integer documentType;

  public static final String SERIALIZED_NAME_PROPS = "props";
  @SerializedName(SERIALIZED_NAME_PROPS)
  private String props;

  public static final String SERIALIZED_NAME_RESOURCE_ID = "resource_id";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
  private String resourceId;

  public static final String SERIALIZED_NAME_SPACE_ID = "space_id";
  @SerializedName(SERIALIZED_NAME_SPACE_ID)
  private String spaceId;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_UPDATED_BY = "updated_by";
  @SerializedName(SERIALIZED_NAME_UPDATED_BY)
  private Long updatedBy;

  public DocumentRO() {
  }

  public DocumentRO data(File data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nonnull
  public File getData() {
    return data;
  }


  public void setData(File data) {
    this.data = data;
  }


  public DocumentRO documentType(Integer documentType) {
    
    this.documentType = documentType;
    return this;
  }

   /**
   * Get documentType
   * minimum: 0
   * @return documentType
  **/
  @javax.annotation.Nonnull
  public Integer getDocumentType() {
    return documentType;
  }


  public void setDocumentType(Integer documentType) {
    this.documentType = documentType;
  }


  public DocumentRO props(String props) {
    
    this.props = props;
    return this;
  }

   /**
   * Get props
   * @return props
  **/
  @javax.annotation.Nullable
  public String getProps() {
    return props;
  }


  public void setProps(String props) {
    this.props = props;
  }


  public DocumentRO resourceId(String resourceId) {
    
    this.resourceId = resourceId;
    return this;
  }

   /**
   * Get resourceId
   * @return resourceId
  **/
  @javax.annotation.Nonnull
  public String getResourceId() {
    return resourceId;
  }


  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }


  public DocumentRO spaceId(String spaceId) {
    
    this.spaceId = spaceId;
    return this;
  }

   /**
   * Get spaceId
   * @return spaceId
  **/
  @javax.annotation.Nonnull
  public String getSpaceId() {
    return spaceId;
  }


  public void setSpaceId(String spaceId) {
    this.spaceId = spaceId;
  }


  public DocumentRO title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public DocumentRO updatedBy(Long updatedBy) {
    
    this.updatedBy = updatedBy;
    return this;
  }

   /**
   * Get updatedBy
   * minimum: 0
   * @return updatedBy
  **/
  @javax.annotation.Nullable
  public Long getUpdatedBy() {
    return updatedBy;
  }


  public void setUpdatedBy(Long updatedBy) {
    this.updatedBy = updatedBy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentRO documentRO = (DocumentRO) o;
    return Objects.equals(this.data, documentRO.data) &&
        Objects.equals(this.documentType, documentRO.documentType) &&
        Objects.equals(this.props, documentRO.props) &&
        Objects.equals(this.resourceId, documentRO.resourceId) &&
        Objects.equals(this.spaceId, documentRO.spaceId) &&
        Objects.equals(this.title, documentRO.title) &&
        Objects.equals(this.updatedBy, documentRO.updatedBy);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, documentType, props, resourceId, spaceId, title, updatedBy);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentRO {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("data");
    openapiFields.add("document_type");
    openapiFields.add("props");
    openapiFields.add("resource_id");
    openapiFields.add("space_id");
    openapiFields.add("title");
    openapiFields.add("updated_by");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("data");
    openapiRequiredFields.add("document_type");
    openapiRequiredFields.add("resource_id");
    openapiRequiredFields.add("space_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DocumentRO
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DocumentRO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocumentRO is not found in the empty JSON string", DocumentRO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DocumentRO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DocumentRO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DocumentRO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("props") != null && !jsonObj.get("props").isJsonNull()) && !jsonObj.get("props").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `props` to be a primitive type in the JSON string but got `%s`", jsonObj.get("props").toString()));
      }
      if (!jsonObj.get("resource_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resource_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resource_id").toString()));
      }
      if (!jsonObj.get("space_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `space_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("space_id").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocumentRO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocumentRO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocumentRO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocumentRO.class));

       return (TypeAdapter<T>) new TypeAdapter<DocumentRO>() {
           @Override
           public void write(JsonWriter out, DocumentRO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DocumentRO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DocumentRO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DocumentRO
  * @throws IOException if the JSON string is invalid with respect to DocumentRO
  */
  public static DocumentRO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocumentRO.class);
  }

 /**
  * Convert an instance of DocumentRO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

