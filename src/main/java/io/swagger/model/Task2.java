package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InlineResponse200TasksMetric;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * Task2
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T22:37:00.102Z")

public class Task2   {
  @JsonProperty("metric")
  private List<InlineResponse200TasksMetric> metric = new ArrayList<InlineResponse200TasksMetric>();

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("program")
  private String program = null;

  public Task2 metric(List<InlineResponse200TasksMetric> metric) {
    this.metric = metric;
    return this;
  }

  public Task2 addMetricItem(InlineResponse200TasksMetric metricItem) {
    this.metric.add(metricItem);
    return this;
  }

   /**
   * Get metric
   * @return metric
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse200TasksMetric> getMetric() {
    return metric;
  }

  public void setMetric(List<InlineResponse200TasksMetric> metric) {
    this.metric = metric;
  }

  public Task2 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The unique name of a task.
   * @return name
  **/
  @ApiModelProperty(value = "The unique name of a task.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Task2 version(String version) {
    this.version = version;
    return this;
  }

   /**
   * A short description of the software implementing the task. This should include the version number of the measurement task software.
   * @return version
  **/
  @ApiModelProperty(value = "A short description of the software implementing the task. This should include the version number of the measurement task software.")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public Task2 program(String program) {
    this.program = program;
    return this;
  }

   /**
   * The (local) program to invoke in order to execute the task.
   * @return program
  **/
  @ApiModelProperty(value = "The (local) program to invoke in order to execute the task.")
  public String getProgram() {
    return program;
  }

  public void setProgram(String program) {
    this.program = program;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Task2 task2 = (Task2) o;
    return Objects.equals(this.metric, task2.metric) &&
        Objects.equals(this.name, task2.name) &&
        Objects.equals(this.version, task2.version) &&
        Objects.equals(this.program, task2.program);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, name, version, program);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Task2 {\n");
    
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    program: ").append(toIndentedString(program)).append("\n");
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

