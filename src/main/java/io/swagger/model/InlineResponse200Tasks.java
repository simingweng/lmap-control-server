package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InlineResponse200TasksTask;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * Configuration of LMAP tasks.
 */
@ApiModel(description = "Configuration of LMAP tasks.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T22:37:00.102Z")

public class InlineResponse200Tasks   {
  @JsonProperty("task")
  private List<InlineResponse200TasksTask> task = new ArrayList<InlineResponse200TasksTask>();

  public InlineResponse200Tasks task(List<InlineResponse200TasksTask> task) {
    this.task = task;
    return this;
  }

  public InlineResponse200Tasks addTaskItem(InlineResponse200TasksTask taskItem) {
    this.task.add(taskItem);
    return this;
  }

   /**
   * Get task
   * @return task
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse200TasksTask> getTask() {
    return task;
  }

  public void setTask(List<InlineResponse200TasksTask> task) {
    this.task = task;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200Tasks inlineResponse200Tasks = (InlineResponse200Tasks) o;
    return Objects.equals(this.task, inlineResponse200Tasks.task);
  }

  @Override
  public int hashCode() {
    return Objects.hash(task);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200Tasks {\n");
    
    sb.append("    task: ").append(toIndentedString(task)).append("\n");
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

