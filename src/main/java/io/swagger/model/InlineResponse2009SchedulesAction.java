package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * The state of the actions associated with this schedule entry.
 */
@ApiModel(description = "The state of the actions associated with this schedule entry.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T22:37:00.102Z")

public class InlineResponse2009SchedulesAction   {
  @JsonProperty("name")
  private String name = null;

  /**
   * The current state of the action.
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

  @JsonProperty("last-completion")
  private String lastCompletion = null;

  @JsonProperty("last-status")
  private Integer lastStatus = null;

  @JsonProperty("last-message")
  private String lastMessage = null;

  @JsonProperty("last-failed-completion")
  private String lastFailedCompletion = null;

  @JsonProperty("last-failed-status")
  private Integer lastFailedStatus = null;

  @JsonProperty("last-failed-message")
  private String lastFailedMessage = null;

  public InlineResponse2009SchedulesAction name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The unique identifier for this action.
   * @return name
  **/
  @ApiModelProperty(value = "The unique identifier for this action.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InlineResponse2009SchedulesAction state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * The current state of the action.
   * @return state
  **/
  @ApiModelProperty(value = "The current state of the action.")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public InlineResponse2009SchedulesAction invocations(Integer invocations) {
    this.invocations = invocations;
    return this;
  }

   /**
   * Number of invocations of this action. This counter does not include suppressed invocations or invocations that were prevented due to an overlap with a previous invocation of this action.
   * @return invocations
  **/
  @ApiModelProperty(value = "Number of invocations of this action. This counter does not include suppressed invocations or invocations that were prevented due to an overlap with a previous invocation of this action.")
  public Integer getInvocations() {
    return invocations;
  }

  public void setInvocations(Integer invocations) {
    this.invocations = invocations;
  }

  public InlineResponse2009SchedulesAction suppressions(Integer suppressions) {
    this.suppressions = suppressions;
    return this;
  }

   /**
   * Number of suppressed executions of this action.
   * @return suppressions
  **/
  @ApiModelProperty(value = "Number of suppressed executions of this action.")
  public Integer getSuppressions() {
    return suppressions;
  }

  public void setSuppressions(Integer suppressions) {
    this.suppressions = suppressions;
  }

  public InlineResponse2009SchedulesAction overlaps(Integer overlaps) {
    this.overlaps = overlaps;
    return this;
  }

   /**
   * Number of executions prevented due to overlaps with a previous invocation of this action.
   * @return overlaps
  **/
  @ApiModelProperty(value = "Number of executions prevented due to overlaps with a previous invocation of this action.")
  public Integer getOverlaps() {
    return overlaps;
  }

  public void setOverlaps(Integer overlaps) {
    this.overlaps = overlaps;
  }

  public InlineResponse2009SchedulesAction failures(Integer failures) {
    this.failures = failures;
    return this;
  }

   /**
   * Number of failed executions of this action.
   * @return failures
  **/
  @ApiModelProperty(value = "Number of failed executions of this action.")
  public Integer getFailures() {
    return failures;
  }

  public void setFailures(Integer failures) {
    this.failures = failures;
  }

  public InlineResponse2009SchedulesAction lastInvocation(String lastInvocation) {
    this.lastInvocation = lastInvocation;
    return this;
  }

   /**
   * The date and time of the last invocation of this action.
   * @return lastInvocation
  **/
  @ApiModelProperty(value = "The date and time of the last invocation of this action.")
  public String getLastInvocation() {
    return lastInvocation;
  }

  public void setLastInvocation(String lastInvocation) {
    this.lastInvocation = lastInvocation;
  }

  public InlineResponse2009SchedulesAction lastCompletion(String lastCompletion) {
    this.lastCompletion = lastCompletion;
    return this;
  }

   /**
   * The date and time of the last completion of this action.
   * @return lastCompletion
  **/
  @ApiModelProperty(value = "The date and time of the last completion of this action.")
  public String getLastCompletion() {
    return lastCompletion;
  }

  public void setLastCompletion(String lastCompletion) {
    this.lastCompletion = lastCompletion;
  }

  public InlineResponse2009SchedulesAction lastStatus(Integer lastStatus) {
    this.lastStatus = lastStatus;
    return this;
  }

   /**
   * The status code returned by the last execution of this action.
   * @return lastStatus
  **/
  @ApiModelProperty(value = "The status code returned by the last execution of this action.")
  public Integer getLastStatus() {
    return lastStatus;
  }

  public void setLastStatus(Integer lastStatus) {
    this.lastStatus = lastStatus;
  }

  public InlineResponse2009SchedulesAction lastMessage(String lastMessage) {
    this.lastMessage = lastMessage;
    return this;
  }

   /**
   * The status message produced by the last execution of this action.
   * @return lastMessage
  **/
  @ApiModelProperty(value = "The status message produced by the last execution of this action.")
  public String getLastMessage() {
    return lastMessage;
  }

  public void setLastMessage(String lastMessage) {
    this.lastMessage = lastMessage;
  }

  public InlineResponse2009SchedulesAction lastFailedCompletion(String lastFailedCompletion) {
    this.lastFailedCompletion = lastFailedCompletion;
    return this;
  }

   /**
   * The date and time of the last failed completion of this action.
   * @return lastFailedCompletion
  **/
  @ApiModelProperty(value = "The date and time of the last failed completion of this action.")
  public String getLastFailedCompletion() {
    return lastFailedCompletion;
  }

  public void setLastFailedCompletion(String lastFailedCompletion) {
    this.lastFailedCompletion = lastFailedCompletion;
  }

  public InlineResponse2009SchedulesAction lastFailedStatus(Integer lastFailedStatus) {
    this.lastFailedStatus = lastFailedStatus;
    return this;
  }

   /**
   * The status code returned by the last failed execution of this action.
   * @return lastFailedStatus
  **/
  @ApiModelProperty(value = "The status code returned by the last failed execution of this action.")
  public Integer getLastFailedStatus() {
    return lastFailedStatus;
  }

  public void setLastFailedStatus(Integer lastFailedStatus) {
    this.lastFailedStatus = lastFailedStatus;
  }

  public InlineResponse2009SchedulesAction lastFailedMessage(String lastFailedMessage) {
    this.lastFailedMessage = lastFailedMessage;
    return this;
  }

   /**
   * The status message produced by the last failed execution of this action.
   * @return lastFailedMessage
  **/
  @ApiModelProperty(value = "The status message produced by the last failed execution of this action.")
  public String getLastFailedMessage() {
    return lastFailedMessage;
  }

  public void setLastFailedMessage(String lastFailedMessage) {
    this.lastFailedMessage = lastFailedMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2009SchedulesAction inlineResponse2009SchedulesAction = (InlineResponse2009SchedulesAction) o;
    return Objects.equals(this.name, inlineResponse2009SchedulesAction.name) &&
        Objects.equals(this.state, inlineResponse2009SchedulesAction.state) &&
        Objects.equals(this.invocations, inlineResponse2009SchedulesAction.invocations) &&
        Objects.equals(this.suppressions, inlineResponse2009SchedulesAction.suppressions) &&
        Objects.equals(this.overlaps, inlineResponse2009SchedulesAction.overlaps) &&
        Objects.equals(this.failures, inlineResponse2009SchedulesAction.failures) &&
        Objects.equals(this.lastInvocation, inlineResponse2009SchedulesAction.lastInvocation) &&
        Objects.equals(this.lastCompletion, inlineResponse2009SchedulesAction.lastCompletion) &&
        Objects.equals(this.lastStatus, inlineResponse2009SchedulesAction.lastStatus) &&
        Objects.equals(this.lastMessage, inlineResponse2009SchedulesAction.lastMessage) &&
        Objects.equals(this.lastFailedCompletion, inlineResponse2009SchedulesAction.lastFailedCompletion) &&
        Objects.equals(this.lastFailedStatus, inlineResponse2009SchedulesAction.lastFailedStatus) &&
        Objects.equals(this.lastFailedMessage, inlineResponse2009SchedulesAction.lastFailedMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, state, invocations, suppressions, overlaps, failures, lastInvocation, lastCompletion, lastStatus, lastMessage, lastFailedCompletion, lastFailedStatus, lastFailedMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2009SchedulesAction {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    invocations: ").append(toIndentedString(invocations)).append("\n");
    sb.append("    suppressions: ").append(toIndentedString(suppressions)).append("\n");
    sb.append("    overlaps: ").append(toIndentedString(overlaps)).append("\n");
    sb.append("    failures: ").append(toIndentedString(failures)).append("\n");
    sb.append("    lastInvocation: ").append(toIndentedString(lastInvocation)).append("\n");
    sb.append("    lastCompletion: ").append(toIndentedString(lastCompletion)).append("\n");
    sb.append("    lastStatus: ").append(toIndentedString(lastStatus)).append("\n");
    sb.append("    lastMessage: ").append(toIndentedString(lastMessage)).append("\n");
    sb.append("    lastFailedCompletion: ").append(toIndentedString(lastFailedCompletion)).append("\n");
    sb.append("    lastFailedStatus: ").append(toIndentedString(lastFailedStatus)).append("\n");
    sb.append("    lastFailedMessage: ").append(toIndentedString(lastFailedMessage)).append("\n");
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

