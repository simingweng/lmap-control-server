package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * InlineResponse20010
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T22:37:00.102Z")

public class InlineResponse20010   {
  @JsonProperty("agent-id")
  private String agentId = null;

  @JsonProperty("device-id")
  private String deviceId = null;

  @JsonProperty("hardware")
  private String hardware = null;

  @JsonProperty("firmware")
  private String firmware = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("last-started")
  private String lastStarted = null;

  public InlineResponse20010 agentId(String agentId) {
    this.agentId = agentId;
    return this;
  }

   /**
   * The agent-id identifies a measurement agent with a very low probability of collision. In certain deployments, the agent-id may be considered sensitive and hence this object is optional.
   * @return agentId
  **/
  @ApiModelProperty(required = true, value = "The agent-id identifies a measurement agent with a very low probability of collision. In certain deployments, the agent-id may be considered sensitive and hence this object is optional.")
  @NotNull
  public String getAgentId() {
    return agentId;
  }

  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }

  public InlineResponse20010 deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * The device-id identifies a property of the device running the measurement agent. In certain deployments, the device-id may be considered sensitive and hence this object is optional.
   * @return deviceId
  **/
  @ApiModelProperty(required = true, value = "The device-id identifies a property of the device running the measurement agent. In certain deployments, the device-id may be considered sensitive and hence this object is optional.")
  @NotNull
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public InlineResponse20010 hardware(String hardware) {
    this.hardware = hardware;
    return this;
  }

   /**
   * A short description of the hardware the measurement agent is running on. This should include the version number of the hardware
   * @return hardware
  **/
  @ApiModelProperty(required = true, value = "A short description of the hardware the measurement agent is running on. This should include the version number of the hardware")
  @NotNull
  public String getHardware() {
    return hardware;
  }

  public void setHardware(String hardware) {
    this.hardware = hardware;
  }

  public InlineResponse20010 firmware(String firmware) {
    this.firmware = firmware;
    return this;
  }

   /**
   * A short description of the firmware the measurement agent is running on. This should include the version number of the firmware.
   * @return firmware
  **/
  @ApiModelProperty(required = true, value = "A short description of the firmware the measurement agent is running on. This should include the version number of the firmware.")
  @NotNull
  public String getFirmware() {
    return firmware;
  }

  public void setFirmware(String firmware) {
    this.firmware = firmware;
  }

  public InlineResponse20010 version(String version) {
    this.version = version;
    return this;
  }

   /**
   * A short description of the software implementing the measurement agent. This should include the version number of the measurement agent software.
   * @return version
  **/
  @ApiModelProperty(required = true, value = "A short description of the software implementing the measurement agent. This should include the version number of the measurement agent software.")
  @NotNull
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public InlineResponse20010 lastStarted(String lastStarted) {
    this.lastStarted = lastStarted;
    return this;
  }

   /**
   * The date and time the measurement agent last started.
   * @return lastStarted
  **/
  @ApiModelProperty(required = true, value = "The date and time the measurement agent last started.")
  @NotNull
  public String getLastStarted() {
    return lastStarted;
  }

  public void setLastStarted(String lastStarted) {
    this.lastStarted = lastStarted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20010 inlineResponse20010 = (InlineResponse20010) o;
    return Objects.equals(this.agentId, inlineResponse20010.agentId) &&
        Objects.equals(this.deviceId, inlineResponse20010.deviceId) &&
        Objects.equals(this.hardware, inlineResponse20010.hardware) &&
        Objects.equals(this.firmware, inlineResponse20010.firmware) &&
        Objects.equals(this.version, inlineResponse20010.version) &&
        Objects.equals(this.lastStarted, inlineResponse20010.lastStarted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, deviceId, hardware, firmware, version, lastStarted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20010 {\n");
    
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    hardware: ").append(toIndentedString(hardware)).append("\n");
    sb.append("    firmware: ").append(toIndentedString(firmware)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    lastStarted: ").append(toIndentedString(lastStarted)).append("\n");
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

