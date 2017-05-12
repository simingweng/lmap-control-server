package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InlineResponse200SchedulesSchedule;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * Configuration of LMAP schedules. Schedules control which tasks are executed by the LMAP implementation.
 */
@ApiModel(description = "Configuration of LMAP schedules. Schedules control which tasks are executed by the LMAP implementation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T22:37:00.102Z")

public class InlineResponse200Schedules   {
  @JsonProperty("schedule")
  private List<InlineResponse200SchedulesSchedule> schedule = new ArrayList<InlineResponse200SchedulesSchedule>();

  public InlineResponse200Schedules schedule(List<InlineResponse200SchedulesSchedule> schedule) {
    this.schedule = schedule;
    return this;
  }

  public InlineResponse200Schedules addScheduleItem(InlineResponse200SchedulesSchedule scheduleItem) {
    this.schedule.add(scheduleItem);
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse200SchedulesSchedule> getSchedule() {
    return schedule;
  }

  public void setSchedule(List<InlineResponse200SchedulesSchedule> schedule) {
    this.schedule = schedule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200Schedules inlineResponse200Schedules = (InlineResponse200Schedules) o;
    return Objects.equals(this.schedule, inlineResponse200Schedules.schedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200Schedules {\n");
    
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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

