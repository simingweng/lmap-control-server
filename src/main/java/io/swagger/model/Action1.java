package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InlineResponse200SchedulesParameters;
import io.swagger.model.InlineResponse200TasksOption;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * Action1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T22:37:00.102Z")

public class Action1   {
  @JsonProperty("option")
  private List<InlineResponse200TasksOption> option = new ArrayList<InlineResponse200TasksOption>();

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("task")
  private String task = null;

  @JsonProperty("parameters")
  private InlineResponse200SchedulesParameters parameters = null;

  @JsonProperty("destination")
  private List<String> destination = new ArrayList<String>();

  @JsonProperty("tag")
  private List<String> tag = new ArrayList<String>();

  @JsonProperty("suppression-tag")
  private List<String> suppressionTag = new ArrayList<String>();

  public Action1 option(List<InlineResponse200TasksOption> option) {
    this.option = option;
    return this;
  }

  public Action1 addOptionItem(InlineResponse200TasksOption optionItem) {
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

  public Action1 name(String name) {
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

  public Action1 task(String task) {
    this.task = task;
    return this;
  }

   /**
   * The task invoked by this action.
   * @return task
  **/
  @ApiModelProperty(required = true, value = "The task invoked by this action.")
  @NotNull
  public String getTask() {
    return task;
  }

  public void setTask(String task) {
    this.task = task;
  }

  public Action1 parameters(InlineResponse200SchedulesParameters parameters) {
    this.parameters = parameters;
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @ApiModelProperty(value = "")
  public InlineResponse200SchedulesParameters getParameters() {
    return parameters;
  }

  public void setParameters(InlineResponse200SchedulesParameters parameters) {
    this.parameters = parameters;
  }

  public Action1 destination(List<String> destination) {
    this.destination = destination;
    return this;
  }

  public Action1 addDestinationItem(String destinationItem) {
    this.destination.add(destinationItem);
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  @ApiModelProperty(value = "")
  public List<String> getDestination() {
    return destination;
  }

  public void setDestination(List<String> destination) {
    this.destination = destination;
  }

  public Action1 tag(List<String> tag) {
    this.tag = tag;
    return this;
  }

  public Action1 addTagItem(String tagItem) {
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

  public Action1 suppressionTag(List<String> suppressionTag) {
    this.suppressionTag = suppressionTag;
    return this;
  }

  public Action1 addSuppressionTagItem(String suppressionTagItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Action1 action1 = (Action1) o;
    return Objects.equals(this.option, action1.option) &&
        Objects.equals(this.name, action1.name) &&
        Objects.equals(this.task, action1.task) &&
        Objects.equals(this.parameters, action1.parameters) &&
        Objects.equals(this.destination, action1.destination) &&
        Objects.equals(this.tag, action1.tag) &&
        Objects.equals(this.suppressionTag, action1.suppressionTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(option, name, task, parameters, destination, tag, suppressionTag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Action1 {\n");
    
    sb.append("    option: ").append(toIndentedString(option)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    task: ").append(toIndentedString(task)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    suppressionTag: ").append(toIndentedString(suppressionTag)).append("\n");
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

