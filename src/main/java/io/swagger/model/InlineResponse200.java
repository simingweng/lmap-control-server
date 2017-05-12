package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InlineResponse200Agent;
import io.swagger.model.InlineResponse200Events;
import io.swagger.model.InlineResponse200Schedules;
import io.swagger.model.InlineResponse200Suppressions;
import io.swagger.model.InlineResponse200Tasks;
import javax.validation.constraints.*;
/**
 * InlineResponse200
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T22:37:00.102Z")

public class InlineResponse200   {
  @JsonProperty("agent")
  private InlineResponse200Agent agent = null;

  @JsonProperty("tasks")
  private InlineResponse200Tasks tasks = null;

  @JsonProperty("schedules")
  private InlineResponse200Schedules schedules = null;

  @JsonProperty("suppressions")
  private InlineResponse200Suppressions suppressions = null;

  @JsonProperty("events")
  private InlineResponse200Events events = null;

  public InlineResponse200 agent(InlineResponse200Agent agent) {
    this.agent = agent;
    return this;
  }

   /**
   * Get agent
   * @return agent
  **/
  @ApiModelProperty(value = "")
  public InlineResponse200Agent getAgent() {
    return agent;
  }

  public void setAgent(InlineResponse200Agent agent) {
    this.agent = agent;
  }

  public InlineResponse200 tasks(InlineResponse200Tasks tasks) {
    this.tasks = tasks;
    return this;
  }

   /**
   * Get tasks
   * @return tasks
  **/
  @ApiModelProperty(value = "")
  public InlineResponse200Tasks getTasks() {
    return tasks;
  }

  public void setTasks(InlineResponse200Tasks tasks) {
    this.tasks = tasks;
  }

  public InlineResponse200 schedules(InlineResponse200Schedules schedules) {
    this.schedules = schedules;
    return this;
  }

   /**
   * Get schedules
   * @return schedules
  **/
  @ApiModelProperty(value = "")
  public InlineResponse200Schedules getSchedules() {
    return schedules;
  }

  public void setSchedules(InlineResponse200Schedules schedules) {
    this.schedules = schedules;
  }

  public InlineResponse200 suppressions(InlineResponse200Suppressions suppressions) {
    this.suppressions = suppressions;
    return this;
  }

   /**
   * Get suppressions
   * @return suppressions
  **/
  @ApiModelProperty(value = "")
  public InlineResponse200Suppressions getSuppressions() {
    return suppressions;
  }

  public void setSuppressions(InlineResponse200Suppressions suppressions) {
    this.suppressions = suppressions;
  }

  public InlineResponse200 events(InlineResponse200Events events) {
    this.events = events;
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @ApiModelProperty(value = "")
  public InlineResponse200Events getEvents() {
    return events;
  }

  public void setEvents(InlineResponse200Events events) {
    this.events = events;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.agent, inlineResponse200.agent) &&
        Objects.equals(this.tasks, inlineResponse200.tasks) &&
        Objects.equals(this.schedules, inlineResponse200.schedules) &&
        Objects.equals(this.suppressions, inlineResponse200.suppressions) &&
        Objects.equals(this.events, inlineResponse200.events);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agent, tasks, schedules, suppressions, events);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
    sb.append("    schedules: ").append(toIndentedString(schedules)).append("\n");
    sb.append("    suppressions: ").append(toIndentedString(suppressions)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
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

