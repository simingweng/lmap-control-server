package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InlineResponse200SchedulesAction;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * InlineResponse200SchedulesSchedule
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T22:37:00.102Z")

public class InlineResponse200SchedulesSchedule   {
  @JsonProperty("end")
  private String end = null;

  @JsonProperty("duration")
  private Integer duration = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("start")
  private String start = null;

  /**
   * The execution mode of this schedule determins in which order the actions of the schedule are executed.
   */
  public enum ExecutionModeEnum {
    SEQUENTIAL("sequential"),
    
    PARALLEL("parallel"),
    
    PIPELINED("pipelined");

    private String value;

    ExecutionModeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ExecutionModeEnum fromValue(String text) {
      for (ExecutionModeEnum b : ExecutionModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("execution-mode")
  private ExecutionModeEnum executionMode = ExecutionModeEnum.PIPELINED;

  @JsonProperty("stop")
  private Object stop = null;

  @JsonProperty("tag")
  private List<String> tag = new ArrayList<String>();

  @JsonProperty("suppression-tag")
  private List<String> suppressionTag = new ArrayList<String>();

  @JsonProperty("action")
  private List<InlineResponse200SchedulesAction> action = new ArrayList<InlineResponse200SchedulesAction>();

  public InlineResponse200SchedulesSchedule end(String end) {
    this.end = end;
    return this;
  }

   /**
   * The event source controlling the graceful forced termination of the scheduled actions.
   * @return end
  **/
  @ApiModelProperty(value = "The event source controlling the graceful forced termination of the scheduled actions.")
  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }

  public InlineResponse200SchedulesSchedule duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * The duration controlling the graceful forced termination of the scheduled actions.
   * @return duration
  **/
  @ApiModelProperty(value = "The duration controlling the graceful forced termination of the scheduled actions.")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public InlineResponse200SchedulesSchedule name(String name) {
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

  public InlineResponse200SchedulesSchedule start(String start) {
    this.start = start;
    return this;
  }

   /**
   * The event source controlling the start of the scheduled actions.
   * @return start
  **/
  @ApiModelProperty(required = true, value = "The event source controlling the start of the scheduled actions.")
  @NotNull
  public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }

  public InlineResponse200SchedulesSchedule executionMode(ExecutionModeEnum executionMode) {
    this.executionMode = executionMode;
    return this;
  }

   /**
   * The execution mode of this schedule determins in which order the actions of the schedule are executed.
   * @return executionMode
  **/
  @ApiModelProperty(value = "The execution mode of this schedule determins in which order the actions of the schedule are executed.")
  public ExecutionModeEnum getExecutionMode() {
    return executionMode;
  }

  public void setExecutionMode(ExecutionModeEnum executionMode) {
    this.executionMode = executionMode;
  }

  public InlineResponse200SchedulesSchedule stop(Object stop) {
    this.stop = stop;
    return this;
  }

   /**
   * This choice contains optional leafs that control the graceful forced termination of scheduled actions. When the end has been reached, the scheduled actions should be forced to terminate the measurements. This may involve being active some additional time in order to properly finish the action's activity (e.g., waiting for any still outstanding messages).
   * @return stop
  **/
  @ApiModelProperty(value = "This choice contains optional leafs that control the graceful forced termination of scheduled actions. When the end has been reached, the scheduled actions should be forced to terminate the measurements. This may involve being active some additional time in order to properly finish the action's activity (e.g., waiting for any still outstanding messages).")
  public Object getStop() {
    return stop;
  }

  public void setStop(Object stop) {
    this.stop = stop;
  }

  public InlineResponse200SchedulesSchedule tag(List<String> tag) {
    this.tag = tag;
    return this;
  }

  public InlineResponse200SchedulesSchedule addTagItem(String tagItem) {
    this.tag.add(tagItem);
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
  @ApiModelProperty(value = "")
  public List<String> getTag() {
    return tag;
  }

  public void setTag(List<String> tag) {
    this.tag = tag;
  }

  public InlineResponse200SchedulesSchedule suppressionTag(List<String> suppressionTag) {
    this.suppressionTag = suppressionTag;
    return this;
  }

  public InlineResponse200SchedulesSchedule addSuppressionTagItem(String suppressionTagItem) {
    this.suppressionTag.add(suppressionTagItem);
    return this;
  }

   /**
   * Get suppressionTag
   * @return suppressionTag
  **/
  @ApiModelProperty(value = "")
  public List<String> getSuppressionTag() {
    return suppressionTag;
  }

  public void setSuppressionTag(List<String> suppressionTag) {
    this.suppressionTag = suppressionTag;
  }

  public InlineResponse200SchedulesSchedule action(List<InlineResponse200SchedulesAction> action) {
    this.action = action;
    return this;
  }

  public InlineResponse200SchedulesSchedule addActionItem(InlineResponse200SchedulesAction actionItem) {
    this.action.add(actionItem);
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse200SchedulesAction> getAction() {
    return action;
  }

  public void setAction(List<InlineResponse200SchedulesAction> action) {
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
    InlineResponse200SchedulesSchedule inlineResponse200SchedulesSchedule = (InlineResponse200SchedulesSchedule) o;
    return Objects.equals(this.end, inlineResponse200SchedulesSchedule.end) &&
        Objects.equals(this.duration, inlineResponse200SchedulesSchedule.duration) &&
        Objects.equals(this.name, inlineResponse200SchedulesSchedule.name) &&
        Objects.equals(this.start, inlineResponse200SchedulesSchedule.start) &&
        Objects.equals(this.executionMode, inlineResponse200SchedulesSchedule.executionMode) &&
        Objects.equals(this.stop, inlineResponse200SchedulesSchedule.stop) &&
        Objects.equals(this.tag, inlineResponse200SchedulesSchedule.tag) &&
        Objects.equals(this.suppressionTag, inlineResponse200SchedulesSchedule.suppressionTag) &&
        Objects.equals(this.action, inlineResponse200SchedulesSchedule.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, duration, name, start, executionMode, stop, tag, suppressionTag, action);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200SchedulesSchedule {\n");
    
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    executionMode: ").append(toIndentedString(executionMode)).append("\n");
    sb.append("    stop: ").append(toIndentedString(stop)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    suppressionTag: ").append(toIndentedString(suppressionTag)).append("\n");
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

