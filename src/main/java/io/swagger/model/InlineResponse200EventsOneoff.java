package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * A one-off timing object triggers exactly once.
 */
@ApiModel(description = "A one-off timing object triggers exactly once.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T22:37:00.102Z")

public class InlineResponse200EventsOneoff   {
  @JsonProperty("time")
  private String time = null;

  public InlineResponse200EventsOneoff time(String time) {
    this.time = time;
    return this;
  }

   /**
   * This one-off timing object triggers once at the configured date and time.
   * @return time
  **/
  @ApiModelProperty(required = true, value = "This one-off timing object triggers once at the configured date and time.")
  @NotNull
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200EventsOneoff inlineResponse200EventsOneoff = (InlineResponse200EventsOneoff) o;
    return Objects.equals(this.time, inlineResponse200EventsOneoff.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200EventsOneoff {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

