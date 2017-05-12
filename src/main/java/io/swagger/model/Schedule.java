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
 * Schedule
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T22:37:00.102Z")

public class Schedule   {
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

  public Schedule end(String end) {
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

  public Schedule duration(Integer duration) {
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

  public Schedule name(String name) {
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

  public Schedule start(String start) {
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

  public Schedule executionMode(ExecutionModeEnum executionMode) {
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

  public Schedule stop(Object stop) {
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

  public Schedule tag(List<String> tag) {
    this.tag = tag;
    return this;
  }

  public Schedule addTagItem(String tagItem) {
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

  public Schedule suppressionTag(List<String> suppressionTag) {
    this.suppressionTag = suppressionTag;
    return this;
  }

  public Schedule addSuppressionTagItem(String suppressionTagItem) {
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

  public Schedule action(List<InlineResponse200SchedulesAction> action) {
    this.action = action;
    return this;
  }

  public Schedule addActionItem(InlineResponse200SchedulesAction actionItem) {
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
    Schedule schedule = (Schedule) o;
    return Objects.equals(this.end, schedule.end) &&
        Objects.equals(this.duration, schedule.duration) &&
        Objects.equals(this.name, schedule.name) &&
        Objects.equals(this.start, schedule.start) &&
        Objects.equals(this.executionMode, schedule.executionMode) &&
        Objects.equals(this.stop, schedule.stop) &&
        Objects.equals(this.tag, schedule.tag) &&
        Objects.equals(this.suppressionTag, schedule.suppressionTag) &&
        Objects.equals(this.action, schedule.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, duration, name, start, executionMode, stop, tag, suppressionTag, action);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schedule {\n");
    
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

