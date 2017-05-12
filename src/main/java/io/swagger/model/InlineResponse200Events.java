package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InlineResponse200EventsEvent;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * Configuration of LMAP events.  Implementations may be forced to delay acting upon the occurance of events in the face of local constraints. An action triggered by an event therefore should not rely on the accuracy provided by the scheduler implementation.
 */
@ApiModel(description = "Configuration of LMAP events.  Implementations may be forced to delay acting upon the occurance of events in the face of local constraints. An action triggered by an event therefore should not rely on the accuracy provided by the scheduler implementation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T22:37:00.102Z")

public class InlineResponse200Events   {
  @JsonProperty("event")
  private List<InlineResponse200EventsEvent> event = new ArrayList<InlineResponse200EventsEvent>();

  public InlineResponse200Events event(List<InlineResponse200EventsEvent> event) {
    this.event = event;
    return this;
  }

  public InlineResponse200Events addEventItem(InlineResponse200EventsEvent eventItem) {
    this.event.add(eventItem);
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse200EventsEvent> getEvent() {
    return event;
  }

  public void setEvent(List<InlineResponse200EventsEvent> event) {
    this.event = event;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200Events inlineResponse200Events = (InlineResponse200Events) o;
    return Objects.equals(this.event, inlineResponse200Events.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200Events {\n");
    
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
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

