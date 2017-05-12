package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * Suppression3
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T22:37:00.102Z")

public class Suppression3   {
  @JsonProperty("name")
  private String name = null;

  /**
   * The current state of the suppression.
   */
  public enum StateEnum {
    ENABLED("enabled"),
    
    DISABLED("disabled"),
    
    ACTIVE("active");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("state")
  private StateEnum state = null;

  public Suppression3 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The locally-unique, administratively assigned name for this suppression.
   * @return name
  **/
  @ApiModelProperty(value = "The locally-unique, administratively assigned name for this suppression.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Suppression3 state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * The current state of the suppression.
   * @return state
  **/
  @ApiModelProperty(value = "The current state of the suppression.")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Suppression3 suppression3 = (Suppression3) o;
    return Objects.equals(this.name, suppression3.name) &&
        Objects.equals(this.state, suppression3.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Suppression3 {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

