package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InlineResponse200EventsCalendar;
import io.swagger.model.InlineResponse200EventsOneoff;
import io.swagger.model.InlineResponse200EventsPeriodic;
import javax.validation.constraints.*;
/**
 * InlineResponse200EventsEvent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T22:37:00.102Z")

public class InlineResponse200EventsEvent   {
  @JsonProperty("periodic")
  private InlineResponse200EventsPeriodic periodic = null;

  @JsonProperty("calendar")
  private InlineResponse200EventsCalendar calendar = null;

  @JsonProperty("one-off")
  private InlineResponse200EventsOneoff oneOff = null;

  @JsonProperty("immediate")
  private String immediate = null;

  @JsonProperty("startup")
  private String startup = null;

  @JsonProperty("controller-lost")
  private String controllerLost = null;

  @JsonProperty("controller-connected")
  private String controllerConnected = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("random-spread")
  private Integer randomSpread = null;

  @JsonProperty("event-type")
  private Object eventType = null;

  public InlineResponse200EventsEvent periodic(InlineResponse200EventsPeriodic periodic) {
    this.periodic = periodic;
    return this;
  }

   /**
   * Get periodic
   * @return periodic
  **/
  @ApiModelProperty(value = "")
  public InlineResponse200EventsPeriodic getPeriodic() {
    return periodic;
  }

  public void setPeriodic(InlineResponse200EventsPeriodic periodic) {
    this.periodic = periodic;
  }

  public InlineResponse200EventsEvent calendar(InlineResponse200EventsCalendar calendar) {
    this.calendar = calendar;
    return this;
  }

   /**
   * Get calendar
   * @return calendar
  **/
  @ApiModelProperty(value = "")
  public InlineResponse200EventsCalendar getCalendar() {
    return calendar;
  }

  public void setCalendar(InlineResponse200EventsCalendar calendar) {
    this.calendar = calendar;
  }

  public InlineResponse200EventsEvent oneOff(InlineResponse200EventsOneoff oneOff) {
    this.oneOff = oneOff;
    return this;
  }

   /**
   * Get oneOff
   * @return oneOff
  **/
  @ApiModelProperty(value = "")
  public InlineResponse200EventsOneoff getOneOff() {
    return oneOff;
  }

  public void setOneOff(InlineResponse200EventsOneoff oneOff) {
    this.oneOff = oneOff;
  }

  public InlineResponse200EventsEvent immediate(String immediate) {
    this.immediate = immediate;
    return this;
  }

   /**
   * This immediate event object triggers immediately when it is configured.
   * @return immediate
  **/
  @ApiModelProperty(value = "This immediate event object triggers immediately when it is configured.")
  public String getImmediate() {
    return immediate;
  }

  public void setImmediate(String immediate) {
    this.immediate = immediate;
  }

  public InlineResponse200EventsEvent startup(String startup) {
    this.startup = startup;
    return this;
  }

   /**
   * This startup event object triggers whenever the LMAP agent (re)starts.
   * @return startup
  **/
  @ApiModelProperty(value = "This startup event object triggers whenever the LMAP agent (re)starts.")
  public String getStartup() {
    return startup;
  }

  public void setStartup(String startup) {
    this.startup = startup;
  }

  public InlineResponse200EventsEvent controllerLost(String controllerLost) {
    this.controllerLost = controllerLost;
    return this;
  }

   /**
   * The controller-lost event object triggers when the connectivity to the controller has been lost for at least 'controller-timeout' seconds.
   * @return controllerLost
  **/
  @ApiModelProperty(value = "The controller-lost event object triggers when the connectivity to the controller has been lost for at least 'controller-timeout' seconds.")
  public String getControllerLost() {
    return controllerLost;
  }

  public void setControllerLost(String controllerLost) {
    this.controllerLost = controllerLost;
  }

  public InlineResponse200EventsEvent controllerConnected(String controllerConnected) {
    this.controllerConnected = controllerConnected;
    return this;
  }

   /**
   * The controller-connected event object triggers when the connectivity to the controller has been restored after it was lost for at least 'controller-timeout' seconds.
   * @return controllerConnected
  **/
  @ApiModelProperty(value = "The controller-connected event object triggers when the connectivity to the controller has been restored after it was lost for at least 'controller-timeout' seconds.")
  public String getControllerConnected() {
    return controllerConnected;
  }

  public void setControllerConnected(String controllerConnected) {
    this.controllerConnected = controllerConnected;
  }

  public InlineResponse200EventsEvent name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The unique name of an event source.
   * @return name
  **/
  @ApiModelProperty(value = "The unique name of an event source.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InlineResponse200EventsEvent randomSpread(Integer randomSpread) {
    this.randomSpread = randomSpread;
    return this;
  }

   /**
   * This optional leaf adds a random spread to the computation of the event's trigger time. The random spread is a uniformly distributed random number taken from the interval [0:random-spread].
   * @return randomSpread
  **/
  @ApiModelProperty(value = "This optional leaf adds a random spread to the computation of the event's trigger time. The random spread is a uniformly distributed random number taken from the interval [0:random-spread].")
  public Integer getRandomSpread() {
    return randomSpread;
  }

  public void setRandomSpread(Integer randomSpread) {
    this.randomSpread = randomSpread;
  }

  public InlineResponse200EventsEvent eventType(Object eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * Different types of events are handled by different branches of this choice. Note that this choice can be extended via augmentations.
   * @return eventType
  **/
  @ApiModelProperty(value = "Different types of events are handled by different branches of this choice. Note that this choice can be extended via augmentations.")
  public Object getEventType() {
    return eventType;
  }

  public void setEventType(Object eventType) {
    this.eventType = eventType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200EventsEvent inlineResponse200EventsEvent = (InlineResponse200EventsEvent) o;
    return Objects.equals(this.periodic, inlineResponse200EventsEvent.periodic) &&
        Objects.equals(this.calendar, inlineResponse200EventsEvent.calendar) &&
        Objects.equals(this.oneOff, inlineResponse200EventsEvent.oneOff) &&
        Objects.equals(this.immediate, inlineResponse200EventsEvent.immediate) &&
        Objects.equals(this.startup, inlineResponse200EventsEvent.startup) &&
        Objects.equals(this.controllerLost, inlineResponse200EventsEvent.controllerLost) &&
        Objects.equals(this.controllerConnected, inlineResponse200EventsEvent.controllerConnected) &&
        Objects.equals(this.name, inlineResponse200EventsEvent.name) &&
        Objects.equals(this.randomSpread, inlineResponse200EventsEvent.randomSpread) &&
        Objects.equals(this.eventType, inlineResponse200EventsEvent.eventType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periodic, calendar, oneOff, immediate, startup, controllerLost, controllerConnected, name, randomSpread, eventType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200EventsEvent {\n");
    
    sb.append("    periodic: ").append(toIndentedString(periodic)).append("\n");
    sb.append("    calendar: ").append(toIndentedString(calendar)).append("\n");
    sb.append("    oneOff: ").append(toIndentedString(oneOff)).append("\n");
    sb.append("    immediate: ").append(toIndentedString(immediate)).append("\n");
    sb.append("    startup: ").append(toIndentedString(startup)).append("\n");
    sb.append("    controllerLost: ").append(toIndentedString(controllerLost)).append("\n");
    sb.append("    controllerConnected: ").append(toIndentedString(controllerConnected)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    randomSpread: ").append(toIndentedString(randomSpread)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
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

