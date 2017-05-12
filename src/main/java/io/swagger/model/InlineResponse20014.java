package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * InlineResponse20014
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T22:37:00.102Z")

public class InlineResponse20014   {
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

  public InlineResponse20014 name(String name) {
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

  public InlineResponse20014 state(StateEnum state) {
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

  public InlineResponse20014 invocations(Integer invocations) {
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

  public InlineResponse20014 suppressions(Integer suppressions) {
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

  public InlineResponse20014 overlaps(Integer overlaps) {
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

  public InlineResponse20014 failures(Integer failures) {
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

  public InlineResponse20014 lastInvocation(String lastInvocation) {
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

  public InlineResponse20014 lastCompletion(String lastCompletion) {
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

  public InlineResponse20014 lastStatus(Integer lastStatus) {
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

  public InlineResponse20014 lastMessage(String lastMessage) {
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

  public InlineResponse20014 lastFailedCompletion(String lastFailedCompletion) {
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

  public InlineResponse20014 lastFailedStatus(Integer lastFailedStatus) {
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

  public InlineResponse20014 lastFailedMessage(String lastFailedMessage) {
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
    InlineResponse20014 inlineResponse20014 = (InlineResponse20014) o;
    return Objects.equals(this.name, inlineResponse20014.name) &&
        Objects.equals(this.state, inlineResponse20014.state) &&
        Objects.equals(this.invocations, inlineResponse20014.invocations) &&
        Objects.equals(this.suppressions, inlineResponse20014.suppressions) &&
        Objects.equals(this.overlaps, inlineResponse20014.overlaps) &&
        Objects.equals(this.failures, inlineResponse20014.failures) &&
        Objects.equals(this.lastInvocation, inlineResponse20014.lastInvocation) &&
        Objects.equals(this.lastCompletion, inlineResponse20014.lastCompletion) &&
        Objects.equals(this.lastStatus, inlineResponse20014.lastStatus) &&
        Objects.equals(this.lastMessage, inlineResponse20014.lastMessage) &&
        Objects.equals(this.lastFailedCompletion, inlineResponse20014.lastFailedCompletion) &&
        Objects.equals(this.lastFailedStatus, inlineResponse20014.lastFailedStatus) &&
        Objects.equals(this.lastFailedMessage, inlineResponse20014.lastFailedMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, state, invocations, suppressions, overlaps, failures, lastInvocation, lastCompletion, lastStatus, lastMessage, lastFailedCompletion, lastFailedStatus, lastFailedMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20014 {\n");
    
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

