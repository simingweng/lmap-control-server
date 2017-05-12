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
 * Metric1
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T22:37:00.102Z")

public class Metric1   {
  @JsonProperty("uri")
  private String uri = null;

  @JsonProperty("role")
  private List<String> role = new ArrayList<String>();

  public Metric1 uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * A URI identifying an entry in a metrics registry.
   * @return uri
  **/
  @ApiModelProperty(value = "A URI identifying an entry in a metrics registry.")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public Metric1 role(List<String> role) {
    this.role = role;
    return this;
  }

  public Metric1 addRoleItem(String roleItem) {
    this.role.add(roleItem);
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(value = "")
  public List<String> getRole() {
    return role;
  }

  public void setRole(List<String> role) {
    this.role = role;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Metric1 metric1 = (Metric1) o;
    return Objects.equals(this.uri, metric1.uri) &&
        Objects.equals(this.role, metric1.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Metric1 {\n");
    
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

