package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InlineResponse2009SchedulesSchedule;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * Schedules3
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T22:37:00.102Z")

public class Schedules3   {
  @JsonProperty("schedule")
  private List<InlineResponse2009SchedulesSchedule> schedule = new ArrayList<InlineResponse2009SchedulesSchedule>();

  public Schedules3 schedule(List<InlineResponse2009SchedulesSchedule> schedule) {
    this.schedule = schedule;
    return this;
  }

  public Schedules3 addScheduleItem(InlineResponse2009SchedulesSchedule scheduleItem) {
    this.schedule.add(scheduleItem);
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse2009SchedulesSchedule> getSchedule() {
    return schedule;
  }

  public void setSchedule(List<InlineResponse2009SchedulesSchedule> schedule) {
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
    Schedules3 schedules3 = (Schedules3) o;
    return Objects.equals(this.schedule, schedules3.schedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schedules3 {\n");
    
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

