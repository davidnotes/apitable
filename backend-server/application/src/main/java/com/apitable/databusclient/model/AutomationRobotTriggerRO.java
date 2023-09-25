/*
 * databus-server
 * databus-server APIs
 *
 * The version of the OpenAPI document: 1.1.0
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
 * AutomationRobotTriggerRO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AutomationRobotTriggerRO {
  public static final String SERIALIZED_NAME_INPUT = "input";
  @SerializedName(SERIALIZED_NAME_INPUT)
  private String input;

  public static final String SERIALIZED_NAME_LIMIT_COUNT = "limit_count";
  @SerializedName(SERIALIZED_NAME_LIMIT_COUNT)
  private Long limitCount;

  public static final String SERIALIZED_NAME_PREV_TRIGGER_ID = "prev_trigger_id";
  @SerializedName(SERIALIZED_NAME_PREV_TRIGGER_ID)
  private String prevTriggerId;

  public static final String SERIALIZED_NAME_RESOURCE_ID = "resource_id";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
  private String resourceId;

  public static final String SERIALIZED_NAME_TRIGGER_ID = "trigger_id";
  @SerializedName(SERIALIZED_NAME_TRIGGER_ID)
  private String triggerId;

  public static final String SERIALIZED_NAME_TRIGGER_TYPE_ID = "trigger_type_id";
  @SerializedName(SERIALIZED_NAME_TRIGGER_TYPE_ID)
  private String triggerTypeId;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Long userId;

  public AutomationRobotTriggerRO() {
  }

  public AutomationRobotTriggerRO input(String input) {
    
    this.input = input;
    return this;
  }

   /**
   * Get input
   * @return input
  **/
  @javax.annotation.Nullable
  public String getInput() {
    return input;
  }


  public void setInput(String input) {
    this.input = input;
  }


  public AutomationRobotTriggerRO limitCount(Long limitCount) {
    
    this.limitCount = limitCount;
    return this;
  }

   /**
   * Get limitCount
   * @return limitCount
  **/
  @javax.annotation.Nullable
  public Long getLimitCount() {
    return limitCount;
  }


  public void setLimitCount(Long limitCount) {
    this.limitCount = limitCount;
  }


  public AutomationRobotTriggerRO prevTriggerId(String prevTriggerId) {
    
    this.prevTriggerId = prevTriggerId;
    return this;
  }

   /**
   * Get prevTriggerId
   * @return prevTriggerId
  **/
  @javax.annotation.Nullable
  public String getPrevTriggerId() {
    return prevTriggerId;
  }


  public void setPrevTriggerId(String prevTriggerId) {
    this.prevTriggerId = prevTriggerId;
  }


  public AutomationRobotTriggerRO resourceId(String resourceId) {
    
    this.resourceId = resourceId;
    return this;
  }

   /**
   * Get resourceId
   * @return resourceId
  **/
  @javax.annotation.Nullable
  public String getResourceId() {
    return resourceId;
  }


  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }


  public AutomationRobotTriggerRO triggerId(String triggerId) {
    
    this.triggerId = triggerId;
    return this;
  }

   /**
   * Get triggerId
   * @return triggerId
  **/
  @javax.annotation.Nullable
  public String getTriggerId() {
    return triggerId;
  }


  public void setTriggerId(String triggerId) {
    this.triggerId = triggerId;
  }


  public AutomationRobotTriggerRO triggerTypeId(String triggerTypeId) {
    
    this.triggerTypeId = triggerTypeId;
    return this;
  }

   /**
   * Get triggerTypeId
   * @return triggerTypeId
  **/
  @javax.annotation.Nullable
  public String getTriggerTypeId() {
    return triggerTypeId;
  }


  public void setTriggerTypeId(String triggerTypeId) {
    this.triggerTypeId = triggerTypeId;
  }


  public AutomationRobotTriggerRO userId(Long userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * minimum: 0
   * @return userId
  **/
  @javax.annotation.Nonnull
  public Long getUserId() {
    return userId;
  }


  public void setUserId(Long userId) {
    this.userId = userId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutomationRobotTriggerRO automationRobotTriggerRO = (AutomationRobotTriggerRO) o;
    return Objects.equals(this.input, automationRobotTriggerRO.input) &&
        Objects.equals(this.limitCount, automationRobotTriggerRO.limitCount) &&
        Objects.equals(this.prevTriggerId, automationRobotTriggerRO.prevTriggerId) &&
        Objects.equals(this.resourceId, automationRobotTriggerRO.resourceId) &&
        Objects.equals(this.triggerId, automationRobotTriggerRO.triggerId) &&
        Objects.equals(this.triggerTypeId, automationRobotTriggerRO.triggerTypeId) &&
        Objects.equals(this.userId, automationRobotTriggerRO.userId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(input, limitCount, prevTriggerId, resourceId, triggerId, triggerTypeId, userId);
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
    sb.append("class AutomationRobotTriggerRO {\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    limitCount: ").append(toIndentedString(limitCount)).append("\n");
    sb.append("    prevTriggerId: ").append(toIndentedString(prevTriggerId)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    triggerId: ").append(toIndentedString(triggerId)).append("\n");
    sb.append("    triggerTypeId: ").append(toIndentedString(triggerTypeId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
    openapiFields.add("input");
    openapiFields.add("limit_count");
    openapiFields.add("prev_trigger_id");
    openapiFields.add("resource_id");
    openapiFields.add("trigger_id");
    openapiFields.add("trigger_type_id");
    openapiFields.add("user_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("user_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AutomationRobotTriggerRO
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AutomationRobotTriggerRO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AutomationRobotTriggerRO is not found in the empty JSON string", AutomationRobotTriggerRO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AutomationRobotTriggerRO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AutomationRobotTriggerRO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AutomationRobotTriggerRO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("input") != null && !jsonObj.get("input").isJsonNull()) && !jsonObj.get("input").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `input` to be a primitive type in the JSON string but got `%s`", jsonObj.get("input").toString()));
      }
      if ((jsonObj.get("prev_trigger_id") != null && !jsonObj.get("prev_trigger_id").isJsonNull()) && !jsonObj.get("prev_trigger_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prev_trigger_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prev_trigger_id").toString()));
      }
      if ((jsonObj.get("resource_id") != null && !jsonObj.get("resource_id").isJsonNull()) && !jsonObj.get("resource_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resource_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resource_id").toString()));
      }
      if ((jsonObj.get("trigger_id") != null && !jsonObj.get("trigger_id").isJsonNull()) && !jsonObj.get("trigger_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trigger_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trigger_id").toString()));
      }
      if ((jsonObj.get("trigger_type_id") != null && !jsonObj.get("trigger_type_id").isJsonNull()) && !jsonObj.get("trigger_type_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trigger_type_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trigger_type_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AutomationRobotTriggerRO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AutomationRobotTriggerRO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AutomationRobotTriggerRO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AutomationRobotTriggerRO.class));

       return (TypeAdapter<T>) new TypeAdapter<AutomationRobotTriggerRO>() {
           @Override
           public void write(JsonWriter out, AutomationRobotTriggerRO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AutomationRobotTriggerRO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AutomationRobotTriggerRO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AutomationRobotTriggerRO
  * @throws IOException if the JSON string is invalid with respect to AutomationRobotTriggerRO
  */
  public static AutomationRobotTriggerRO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AutomationRobotTriggerRO.class);
  }

 /**
  * Convert an instance of AutomationRobotTriggerRO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
