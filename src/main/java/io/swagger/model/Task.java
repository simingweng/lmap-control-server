package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InlineResponse200TasksMetric;
import io.swagger.model.InlineResponse200TasksOption;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * Task
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T22:37:00.102Z")

public class Task   {
  @JsonProperty("metric")
  private List<InlineResponse200TasksMetric> metric = new ArrayList<InlineResponse200TasksMetric>();

  @JsonProperty("option")
  private List<InlineResponse200TasksOption> option = new ArrayList<InlineResponse200TasksOption>();

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("program")
  private String program = null;

  @JsonProperty("suppress-by-default")
  private Boolean suppressByDefault = true;

  @JsonProperty("tag")
  private List<String> tag = new ArrayList<String>();

  public Task metric(List<InlineResponse200TasksMetric> metric) {
    this.metric = metric;
    return this;
  }

  public Task addMetricItem(InlineResponse200TasksMetric metricItem) {
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

  public Task option(List<InlineResponse200TasksOption> option) {
    this.option = option;
    return this;
  }

  public Task addOptionItem(InlineResponse200TasksOption optionItem) {
    this.option.add(optionItem);
    return this;
  }

   /**
   * Get option
   * @return option
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse200TasksOption> getOption() {
    return option;
  }

  public void setOption(List<InlineResponse200TasksOption> option) {
    this.option = option;
  }

  public Task name(String name) {
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

  public Task program(String program) {
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

  public Task suppressByDefault(Boolean suppressByDefault) {
    this.suppressByDefault = suppressByDefault;
    return this;
  }

   /**
   * Indicates whether the task will be suppressed by a default supression.
   * @return suppressByDefault
  **/
  @ApiModelProperty(value = "Indicates whether the task will be suppressed by a default supression.")
  public Boolean getSuppressByDefault() {
    return suppressByDefault;
  }

  public void setSuppressByDefault(Boolean suppressByDefault) {
    this.suppressByDefault = suppressByDefault;
  }

  public Task tag(List<String> tag) {
    this.tag = tag;
    return this;
  }

  public Task addTagItem(String tagItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Task task = (Task) o;
    return Objects.equals(this.metric, task.metric) &&
        Objects.equals(this.option, task.option) &&
        Objects.equals(this.name, task.name) &&
        Objects.equals(this.program, task.program) &&
        Objects.equals(this.suppressByDefault, task.suppressByDefault) &&
        Objects.equals(this.tag, task.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, option, name, program, suppressByDefault, tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Task {\n");
    
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    option: ").append(toIndentedString(option)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    program: ").append(toIndentedString(program)).append("\n");
    sb.append("    suppressByDefault: ").append(toIndentedString(suppressByDefault)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

