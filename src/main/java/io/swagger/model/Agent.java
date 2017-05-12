package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * Agent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T22:37:00.102Z")

public class Agent   {
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

  public Agent agentId(String agentId) {
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

  public Agent deviceId(String deviceId) {
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

  public Agent groupId(String groupId) {
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

  public Agent measurementPoint(String measurementPoint) {
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

  public Agent reportAgentId(Boolean reportAgentId) {
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

  public Agent reportMeasurementPoint(Boolean reportMeasurementPoint) {
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

  public Agent controllerTimeout(Integer controllerTimeout) {
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
    Agent agent = (Agent) o;
    return Objects.equals(this.agentId, agent.agentId) &&
        Objects.equals(this.deviceId, agent.deviceId) &&
        Objects.equals(this.groupId, agent.groupId) &&
        Objects.equals(this.measurementPoint, agent.measurementPoint) &&
        Objects.equals(this.reportAgentId, agent.reportAgentId) &&
        Objects.equals(this.reportMeasurementPoint, agent.reportMeasurementPoint) &&
        Objects.equals(this.controllerTimeout, agent.controllerTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, deviceId, groupId, measurementPoint, reportAgentId, reportMeasurementPoint, controllerTimeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Agent {\n");
    
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

