package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InlineResponse2009SchedulesAction;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * InlineResponse20013
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T22:37:00.102Z")

public class InlineResponse20013   {
  @JsonProperty("name")
  private String name = null;

  /**
   * The current state of the schedule.
   */
  public enum StateEnum {
    ENABLED("enabled"),
    
    DISABLED("disabled"),
    
    RUNNING("running"),
    
    SUPPRESSED("suppressed");

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

  @JsonProperty("invocations")
  private Integer invocations = null;

  @JsonProperty("suppressions")
  private Integer suppressions = null;

  @JsonProperty("overlaps")
  private Integer overlaps = null;

  @JsonProperty("failures")
  private Integer failures = null;

  @JsonProperty("last-invocation")
  private String lastInvocation = null;

  @JsonProperty("action")
  private List<InlineResponse2009SchedulesAction> action = new ArrayList<InlineResponse2009SchedulesAction>();

  public InlineResponse20013 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The locally-unique, administratively assigned name for this schedule.
   * @return name
  **/
  @ApiModelProperty(value = "The locally-unique, administratively assigned name for this schedule.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InlineResponse20013 state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * The current state of the schedule.
   * @return state
  **/
  @ApiModelProperty(value = "The current state of the schedule.")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public InlineResponse20013 invocations(Integer invocations) {
    this.invocations = invocations;
    return this;
  }

   /**
   * Number of invocations of this schedule. This counter does not include suppressed invocations or invocations that were prevented due to an overlap with a previous invocation of this schedule.
   * @return invocations
  **/
  @ApiModelProperty(value = "Number of invocations of this schedule. This counter does not include suppressed invocations or invocations that were prevented due to an overlap with a previous invocation of this schedule.")
  public Integer getInvocations() {
    return invocations;
  }

  public void setInvocations(Integer invocations) {
    this.invocations = invocations;
  }

  public InlineResponse20013 suppressions(Integer suppressions) {
    this.suppressions = suppressions;
    return this;
  }

   /**
   * Number of suppressed executions of this schedule.
   * @return suppressions
  **/
  @ApiModelProperty(value = "Number of suppressed executions of this schedule.")
  public Integer getSuppressions() {
    return suppressions;
  }

  public void setSuppressions(Integer suppressions) {
    this.suppressions = suppressions;
  }

  public InlineResponse20013 overlaps(Integer overlaps) {
    this.overlaps = overlaps;
    return this;
  }

   /**
   * Number of executions prevented due to overlaps with a previous invocation of this schedule.
   * @return overlaps
  **/
  @ApiModelProperty(value = "Number of executions prevented due to overlaps with a previous invocation of this schedule.")
  public Integer getOverlaps() {
    return overlaps;
  }

  public void setOverlaps(Integer overlaps) {
    this.overlaps = overlaps;
  }

  public InlineResponse20013 failures(Integer failures) {
    this.failures = failures;
    return this;
  }

   /**
   * Number of failed executions of this schedule. A failed execution is an execution where at least one action failed.
   * @return failures
  **/
  @ApiModelProperty(value = "Number of failed executions of this schedule. A failed execution is an execution where at least one action failed.")
  public Integer getFailures() {
    return failures;
  }

  public void setFailures(Integer failures) {
    this.failures = failures;
  }

  public InlineResponse20013 lastInvocation(String lastInvocation) {
    this.lastInvocation = lastInvocation;
    return this;
  }

   /**
   * The date and time of the last invocation of this schedule.
   * @return lastInvocation
  **/
  @ApiModelProperty(value = "The date and time of the last invocation of this schedule.")
  public String getLastInvocation() {
    return lastInvocation;
  }

  public void setLastInvocation(String lastInvocation) {
    this.lastInvocation = lastInvocation;
  }

  public InlineResponse20013 action(List<InlineResponse2009SchedulesAction> action) {
    this.action = action;
    return this;
  }

  public InlineResponse20013 addActionItem(InlineResponse2009SchedulesAction actionItem) {
    this.action.add(actionItem);
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse2009SchedulesAction> getAction() {
    return action;
  }

  public void setAction(List<InlineResponse2009SchedulesAction> action) {
    this.action = action;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20013 inlineResponse20013 = (InlineResponse20013) o;
    return Objects.equals(this.name, inlineResponse20013.name) &&
        Objects.equals(this.state, inlineResponse20013.state) &&
        Objects.equals(this.invocations, inlineResponse20013.invocations) &&
        Objects.equals(this.suppressions, inlineResponse20013.suppressions) &&
        Objects.equals(this.overlaps, inlineResponse20013.overlaps) &&
        Objects.equals(this.failures, inlineResponse20013.failures) &&
        Objects.equals(this.lastInvocation, inlineResponse20013.lastInvocation) &&
        Objects.equals(this.action, inlineResponse20013.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, state, invocations, suppressions, overlaps, failures, lastInvocation, action);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20013 {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    invocations: ").append(toIndentedString(invocations)).append("\n");
    sb.append("    suppressions: ").append(toIndentedString(suppressions)).append("\n");
    sb.append("    overlaps: ").append(toIndentedString(overlaps)).append("\n");
    sb.append("    failures: ").append(toIndentedString(failures)).append("\n");
    sb.append("    lastInvocation: ").append(toIndentedString(lastInvocation)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

