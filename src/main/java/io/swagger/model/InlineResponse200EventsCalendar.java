package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * InlineResponse200EventsCalendar
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T22:37:00.102Z")

public class InlineResponse200EventsCalendar   {
  @JsonProperty("start")
  private String start = null;

  @JsonProperty("end")
  private String end = null;

  @JsonProperty("month")
  private List<String> month = new ArrayList<String>();

  @JsonProperty("day-of-month")
  private List<String> dayOfMonth = new ArrayList<String>();

  @JsonProperty("day-of-week")
  private List<String> dayOfWeek = new ArrayList<String>();

  @JsonProperty("hour")
  private List<String> hour = new ArrayList<String>();

  @JsonProperty("minute")
  private List<String> minute = new ArrayList<String>();

  @JsonProperty("second")
  private List<String> second = new ArrayList<String>();

  @JsonProperty("timezone-offset")
  private String timezoneOffset = null;

  public InlineResponse200EventsCalendar start(String start) {
    this.start = start;
    return this;
  }

   /**
   * The date and time when the timing object starts to create triggers.
   * @return start
  **/
  @ApiModelProperty(value = "The date and time when the timing object starts to create triggers.")
  public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }

  public InlineResponse200EventsCalendar end(String end) {
    this.end = end;
    return this;
  }

   /**
   * The date and time when the timing object stops to create triggers.  It is generally a good idea to always configure an end time and to refresh the configuration of timing object as needed to ensure that agents that loose connectivity to their controller do not continue their tasks forever.
   * @return end
  **/
  @ApiModelProperty(value = "The date and time when the timing object stops to create triggers.  It is generally a good idea to always configure an end time and to refresh the configuration of timing object as needed to ensure that agents that loose connectivity to their controller do not continue their tasks forever.")
  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }

  public InlineResponse200EventsCalendar month(List<String> month) {
    this.month = month;
    return this;
  }

  public InlineResponse200EventsCalendar addMonthItem(String monthItem) {
    this.month.add(monthItem);
    return this;
  }

   /**
   * Get month
   * @return month
  **/
  @ApiModelProperty(value = "")
  public List<String> getMonth() {
    return month;
  }

  public void setMonth(List<String> month) {
    this.month = month;
  }

  public InlineResponse200EventsCalendar dayOfMonth(List<String> dayOfMonth) {
    this.dayOfMonth = dayOfMonth;
    return this;
  }

  public InlineResponse200EventsCalendar addDayOfMonthItem(String dayOfMonthItem) {
    this.dayOfMonth.add(dayOfMonthItem);
    return this;
  }

   /**
   * Get dayOfMonth
   * @return dayOfMonth
  **/
  @ApiModelProperty(value = "")
  public List<String> getDayOfMonth() {
    return dayOfMonth;
  }

  public void setDayOfMonth(List<String> dayOfMonth) {
    this.dayOfMonth = dayOfMonth;
  }

  public InlineResponse200EventsCalendar dayOfWeek(List<String> dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

  public InlineResponse200EventsCalendar addDayOfWeekItem(String dayOfWeekItem) {
    this.dayOfWeek.add(dayOfWeekItem);
    return this;
  }

   /**
   * Get dayOfWeek
   * @return dayOfWeek
  **/
  @ApiModelProperty(value = "")
  public List<String> getDayOfWeek() {
    return dayOfWeek;
  }

  public void setDayOfWeek(List<String> dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  public InlineResponse200EventsCalendar hour(List<String> hour) {
    this.hour = hour;
    return this;
  }

  public InlineResponse200EventsCalendar addHourItem(String hourItem) {
    this.hour.add(hourItem);
    return this;
  }

   /**
   * Get hour
   * @return hour
  **/
  @ApiModelProperty(value = "")
  public List<String> getHour() {
    return hour;
  }

  public void setHour(List<String> hour) {
    this.hour = hour;
  }

  public InlineResponse200EventsCalendar minute(List<String> minute) {
    this.minute = minute;
    return this;
  }

  public InlineResponse200EventsCalendar addMinuteItem(String minuteItem) {
    this.minute.add(minuteItem);
    return this;
  }

   /**
   * Get minute
   * @return minute
  **/
  @ApiModelProperty(value = "")
  public List<String> getMinute() {
    return minute;
  }

  public void setMinute(List<String> minute) {
    this.minute = minute;
  }

  public InlineResponse200EventsCalendar second(List<String> second) {
    this.second = second;
    return this;
  }

  public InlineResponse200EventsCalendar addSecondItem(String secondItem) {
    this.second.add(secondItem);
    return this;
  }

   /**
   * Get second
   * @return second
  **/
  @ApiModelProperty(value = "")
  public List<String> getSecond() {
    return second;
  }

  public void setSecond(List<String> second) {
    this.second = second;
  }

  public InlineResponse200EventsCalendar timezoneOffset(String timezoneOffset) {
    this.timezoneOffset = timezoneOffset;
    return this;
  }

   /**
   * The timezone in which this calendar timing object will be evaluated. If not present, the systems' local timezone will be used.
   * @return timezoneOffset
  **/
  @ApiModelProperty(value = "The timezone in which this calendar timing object will be evaluated. If not present, the systems' local timezone will be used.")
  public String getTimezoneOffset() {
    return timezoneOffset;
  }

  public void setTimezoneOffset(String timezoneOffset) {
    this.timezoneOffset = timezoneOffset;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200EventsCalendar inlineResponse200EventsCalendar = (InlineResponse200EventsCalendar) o;
    return Objects.equals(this.start, inlineResponse200EventsCalendar.start) &&
        Objects.equals(this.end, inlineResponse200EventsCalendar.end) &&
        Objects.equals(this.month, inlineResponse200EventsCalendar.month) &&
        Objects.equals(this.dayOfMonth, inlineResponse200EventsCalendar.dayOfMonth) &&
        Objects.equals(this.dayOfWeek, inlineResponse200EventsCalendar.dayOfWeek) &&
        Objects.equals(this.hour, inlineResponse200EventsCalendar.hour) &&
        Objects.equals(this.minute, inlineResponse200EventsCalendar.minute) &&
        Objects.equals(this.second, inlineResponse200EventsCalendar.second) &&
        Objects.equals(this.timezoneOffset, inlineResponse200EventsCalendar.timezoneOffset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end, month, dayOfMonth, dayOfWeek, hour, minute, second, timezoneOffset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200EventsCalendar {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    dayOfMonth: ").append(toIndentedString(dayOfMonth)).append("\n");
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    minute: ").append(toIndentedString(minute)).append("\n");
    sb.append("    second: ").append(toIndentedString(second)).append("\n");
    sb.append("    timezoneOffset: ").append(toIndentedString(timezoneOffset)).append("\n");
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

