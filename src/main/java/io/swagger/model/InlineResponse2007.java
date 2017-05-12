package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * InlineResponse2007
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T22:37:00.102Z")

public class InlineResponse2007   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("start")
  private String start = null;

  @JsonProperty("end")
  private String end = null;

  @JsonProperty("stop-running")
  private Boolean stopRunning = false;

  @JsonProperty("match")
  private List<String> match = new ArrayList<String>();

  public InlineResponse2007 name(String name) {
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

  public InlineResponse2007 start(String start) {
    this.start = start;
    return this;
  }

   /**
   * The event source controlling the start of the suppression period.
   * @return start
  **/
  @ApiModelProperty(value = "The event source controlling the start of the suppression period.")
  public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }

  public InlineResponse2007 end(String end) {
    this.end = end;
    return this;
  }

   /**
   * The event source controlling the end of the suppression period. If not present, supression continues indefinitely.
   * @return end
  **/
  @ApiModelProperty(value = "The event source controlling the end of the suppression period. If not present, supression continues indefinitely.")
  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }

  public InlineResponse2007 stopRunning(Boolean stopRunning) {
    this.stopRunning = stopRunning;
    return this;
  }

   /**
   * Setting 'stop-running' to true will cause running tasks to be terminated if suppression is activated. Otherwise, running tasks will not be affected if suppression is activated.
   * @return stopRunning
  **/
  @ApiModelProperty(value = "Setting 'stop-running' to true will cause running tasks to be terminated if suppression is activated. Otherwise, running tasks will not be affected if suppression is activated.")
  public Boolean getStopRunning() {
    return stopRunning;
  }

  public void setStopRunning(Boolean stopRunning) {
    this.stopRunning = stopRunning;
  }

  public InlineResponse2007 match(List<String> match) {
    this.match = match;
    return this;
  }

  public InlineResponse2007 addMatchItem(String matchItem) {
    this.match.add(matchItem);
    return this;
  }

   /**
   * Get match
   * @return match
  **/
  @ApiModelProperty(value = "")
  public List<String> getMatch() {
    return match;
  }

  public void setMatch(List<String> match) {
    this.match = match;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2007 inlineResponse2007 = (InlineResponse2007) o;
    return Objects.equals(this.name, inlineResponse2007.name) &&
        Objects.equals(this.start, inlineResponse2007.start) &&
        Objects.equals(this.end, inlineResponse2007.end) &&
        Objects.equals(this.stopRunning, inlineResponse2007.stopRunning) &&
        Objects.equals(this.match, inlineResponse2007.match);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, start, end, stopRunning, match);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2007 {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    stopRunning: ").append(toIndentedString(stopRunning)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
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

