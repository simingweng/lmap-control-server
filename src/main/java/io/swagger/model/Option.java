package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * Option
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T22:37:00.102Z")

public class Option   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("value")
  private String value = null;

  public Option id(String id) {
    this.id = id;
    return this;
  }

   /**
   * An identifier uniquely identifying an option. This identifier is required by YANG to uniquely identify a name value pair but it otherwise has no semantic value
   * @return id
  **/
  @ApiModelProperty(value = "An identifier uniquely identifying an option. This identifier is required by YANG to uniquely identify a name value pair but it otherwise has no semantic value")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Option name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the option.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the option.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Option value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value of the option.
   * @return value
  **/
  @ApiModelProperty(value = "The value of the option.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Option option = (Option) o;
    return Objects.equals(this.id, option.id) &&
        Objects.equals(this.name, option.name) &&
        Objects.equals(this.value, option.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Option {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

