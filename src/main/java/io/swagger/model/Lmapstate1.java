package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InlineResponse2009Agent;
import io.swagger.model.InlineResponse2009Schedules;
import io.swagger.model.InlineResponse2009Suppressions;
import io.swagger.model.InlineResponse2009Tasks;
import javax.validation.constraints.*;
/**
 * Lmapstate1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T22:37:00.102Z")

public class Lmapstate1   {
  @JsonProperty("agent")
  private InlineResponse2009Agent agent = null;

  @JsonProperty("tasks")
  private InlineResponse2009Tasks tasks = null;

  @JsonProperty("schedules")
  private InlineResponse2009Schedules schedules = null;

  @JsonProperty("suppressions")
  private InlineResponse2009Suppressions suppressions = null;

  public Lmapstate1 agent(InlineResponse2009Agent agent) {
    this.agent = agent;
    return this;
  }

   /**
   * Get agent
   * @return agent
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2009Agent getAgent() {
    return agent;
  }

  public void setAgent(InlineResponse2009Agent agent) {
    this.agent = agent;
  }

  public Lmapstate1 tasks(InlineResponse2009Tasks tasks) {
    this.tasks = tasks;
    return this;
  }

   /**
   * Get tasks
   * @return tasks
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2009Tasks getTasks() {
    return tasks;
  }

  public void setTasks(InlineResponse2009Tasks tasks) {
    this.tasks = tasks;
  }

  public Lmapstate1 schedules(InlineResponse2009Schedules schedules) {
    this.schedules = schedules;
    return this;
  }

   /**
   * Get schedules
   * @return schedules
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2009Schedules getSchedules() {
    return schedules;
  }

  public void setSchedules(InlineResponse2009Schedules schedules) {
    this.schedules = schedules;
  }

  public Lmapstate1 suppressions(InlineResponse2009Suppressions suppressions) {
    this.suppressions = suppressions;
    return this;
  }

   /**
   * Get suppressions
   * @return suppressions
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2009Suppressions getSuppressions() {
    return suppressions;
  }

  public void setSuppressions(InlineResponse2009Suppressions suppressions) {
    this.suppressions = suppressions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Lmapstate1 lmapstate1 = (Lmapstate1) o;
    return Objects.equals(this.agent, lmapstate1.agent) &&
        Objects.equals(this.tasks, lmapstate1.tasks) &&
        Objects.equals(this.schedules, lmapstate1.schedules) &&
        Objects.equals(this.suppressions, lmapstate1.suppressions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agent, tasks, schedules, suppressions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Lmapstate1 {\n");
    
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
    sb.append("    schedules: ").append(toIndentedString(schedules)).append("\n");
    sb.append("    suppressions: ").append(toIndentedString(suppressions)).append("\n");
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

