package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * TimingStartEndGrouping
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T22:37:00.102Z")

public class TimingStartEndGrouping   {
  @JsonProperty("start")
  private String start = null;

  @JsonProperty("end")
  private String end = null;

  public TimingStartEndGrouping start(String start) {
    this.start = start;
    return this;
  }

   /**
   * The date and time when the timing object starts to create triggers.
   * @return start
  **/
  @ApiModelProperty(value = "The date and time when the timing object starts to create triggers.")
  public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }

  public TimingStartEndGrouping end(String end) {
    this.end = end;
    return this;
  }

   /**
   * The date and time when the timing object stops to create triggers.  It is generally a good idea to always configure an end time and to refresh the configuration of timing object as needed to ensure that agents that loose connectivity to their controller do not continue their tasks forever.
   * @return end
  **/
  @ApiModelProperty(value = "The date and time when the timing object stops to create triggers.  It is generally a good idea to always configure an end time and to refresh the configuration of timing object as needed to ensure that agents that loose connectivity to their controller do not continue their tasks forever.")
  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimingStartEndGrouping timingStartEndGrouping = (TimingStartEndGrouping) o;
    return Objects.equals(this.start, timingStartEndGrouping.start) &&
        Objects.equals(this.end, timingStartEndGrouping.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimingStartEndGrouping {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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

