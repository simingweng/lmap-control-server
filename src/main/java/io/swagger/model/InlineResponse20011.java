package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InlineResponse2009TasksTask;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * InlineResponse20011
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T22:37:00.102Z")

public class InlineResponse20011   {
  @JsonProperty("task")
  private List<InlineResponse2009TasksTask> task = new ArrayList<InlineResponse2009TasksTask>();

  public InlineResponse20011 task(List<InlineResponse2009TasksTask> task) {
    this.task = task;
    return this;
  }

  public InlineResponse20011 addTaskItem(InlineResponse2009TasksTask taskItem) {
    this.task.add(taskItem);
    return this;
  }

   /**
   * Get task
   * @return task
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse2009TasksTask> getTask() {
    return task;
  }

  public void setTask(List<InlineResponse2009TasksTask> task) {
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
    InlineResponse20011 inlineResponse20011 = (InlineResponse20011) o;
    return Objects.equals(this.task, inlineResponse20011.task);
  }

  @Override
  public int hashCode() {
    return Objects.hash(task);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20011 {\n");
    
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

