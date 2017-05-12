package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * InlineResponse2001
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T22:37:00.102Z")

public class InlineResponse2001   {
  @JsonProperty("agent-id")
  private String agentId = null;

  @JsonProperty("device-id")
  private String deviceId = null;

  @JsonProperty("group-id")
  private String groupId = null;

  @JsonProperty("measurement-point")
  private String measurementPoint = null;

  @JsonProperty("report-agent-id")
  private Boolean reportAgentId = false;

  @JsonProperty("report-measurement-point")
  private Boolean reportMeasurementPoint = false;

  @JsonProperty("controller-timeout")
  private Integer controllerTimeout = null;

  public InlineResponse2001 agentId(String agentId) {
    this.agentId = agentId;
    return this;
  }

   /**
   * The agent-id identifies a measurement agent with a very low probability of collision. In certain deployments, the agent-id may be considered sensitive and hence this object is optional.
   * @return agentId
  **/
  @ApiModelProperty(value = "The agent-id identifies a measurement agent with a very low probability of collision. In certain deployments, the agent-id may be considered sensitive and hence this object is optional.")
  public String getAgentId() {
    return agentId;
  }

  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }

  public InlineResponse2001 deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * The device-id identifies a property of the device running the measurement agent. In certain deployments, the device-id may be considered sensitive and hence this object is optional.
   * @return deviceId
  **/
  @ApiModelProperty(value = "The device-id identifies a property of the device running the measurement agent. In certain deployments, the device-id may be considered sensitive and hence this object is optional.")
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public InlineResponse2001 groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * The group-id identifies a group of measurement agents. In certain deployments, the group-id may be considered less sensitive than the agent-id.
   * @return groupId
  **/
  @ApiModelProperty(value = "The group-id identifies a group of measurement agents. In certain deployments, the group-id may be considered less sensitive than the agent-id.")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public InlineResponse2001 measurementPoint(String measurementPoint) {
    this.measurementPoint = measurementPoint;
    return this;
  }

   /**
   * The measurement point indicating where the  measurement agent is located on a path.
   * @return measurementPoint
  **/
  @ApiModelProperty(value = "The measurement point indicating where the  measurement agent is located on a path.")
  public String getMeasurementPoint() {
    return measurementPoint;
  }

  public void setMeasurementPoint(String measurementPoint) {
    this.measurementPoint = measurementPoint;
  }

  public InlineResponse2001 reportAgentId(Boolean reportAgentId) {
    this.reportAgentId = reportAgentId;
    return this;
  }

   /**
   * The 'report-agent-id' controls whether the  'agent-id' is reported to collectors if the 'group-id' is configured. If the 'group-id' is not configured, the agent-id is always reported.
   * @return reportAgentId
  **/
  @ApiModelProperty(value = "The 'report-agent-id' controls whether the  'agent-id' is reported to collectors if the 'group-id' is configured. If the 'group-id' is not configured, the agent-id is always reported.")
  public Boolean getReportAgentId() {
    return reportAgentId;
  }

  public void setReportAgentId(Boolean reportAgentId) {
    this.reportAgentId = reportAgentId;
  }

  public InlineResponse2001 reportMeasurementPoint(Boolean reportMeasurementPoint) {
    this.reportMeasurementPoint = reportMeasurementPoint;
    return this;
  }

   /**
   * The 'report-measurement-point' controls whether the 'measurement-point' is reported to collectors if the 'measurement-point' is configured.
   * @return reportMeasurementPoint
  **/
  @ApiModelProperty(value = "The 'report-measurement-point' controls whether the 'measurement-point' is reported to collectors if the 'measurement-point' is configured.")
  public Boolean getReportMeasurementPoint() {
    return reportMeasurementPoint;
  }

  public void setReportMeasurementPoint(Boolean reportMeasurementPoint) {
    this.reportMeasurementPoint = reportMeasurementPoint;
  }

  public InlineResponse2001 controllerTimeout(Integer controllerTimeout) {
    this.controllerTimeout = controllerTimeout;
    return this;
  }

   /**
   * A timer is started after each successful contact with a controller. When the timer reaches the controller-timeout, an event is raised indicating that connectivity to the controller has been lost.
   * @return controllerTimeout
  **/
  @ApiModelProperty(value = "A timer is started after each successful contact with a controller. When the timer reaches the controller-timeout, an event is raised indicating that connectivity to the controller has been lost.")
  public Integer getControllerTimeout() {
    return controllerTimeout;
  }

  public void setControllerTimeout(Integer controllerTimeout) {
    this.controllerTimeout = controllerTimeout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001 inlineResponse2001 = (InlineResponse2001) o;
    return Objects.equals(this.agentId, inlineResponse2001.agentId) &&
        Objects.equals(this.deviceId, inlineResponse2001.deviceId) &&
        Objects.equals(this.groupId, inlineResponse2001.groupId) &&
        Objects.equals(this.measurementPoint, inlineResponse2001.measurementPoint) &&
        Objects.equals(this.reportAgentId, inlineResponse2001.reportAgentId) &&
        Objects.equals(this.reportMeasurementPoint, inlineResponse2001.reportMeasurementPoint) &&
        Objects.equals(this.controllerTimeout, inlineResponse2001.controllerTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, deviceId, groupId, measurementPoint, reportAgentId, reportMeasurementPoint, controllerTimeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");
    
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    measurementPoint: ").append(toIndentedString(measurementPoint)).append("\n");
    sb.append("    reportAgentId: ").append(toIndentedString(reportAgentId)).append("\n");
    sb.append("    reportMeasurementPoint: ").append(toIndentedString(reportMeasurementPoint)).append("\n");
    sb.append("    controllerTimeout: ").append(toIndentedString(controllerTimeout)).append("\n");
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

