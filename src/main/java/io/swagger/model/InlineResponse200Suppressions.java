package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InlineResponse200SuppressionsSuppression;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * Suppression information to prevent schedules or certain actions from starting.
 */
@ApiModel(description = "Suppression information to prevent schedules or certain actions from starting.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T22:37:00.102Z")

public class InlineResponse200Suppressions   {
  @JsonProperty("suppression")
  private List<InlineResponse200SuppressionsSuppression> suppression = new ArrayList<InlineResponse200SuppressionsSuppression>();

  public InlineResponse200Suppressions suppression(List<InlineResponse200SuppressionsSuppression> suppression) {
    this.suppression = suppression;
    return this;
  }

  public InlineResponse200Suppressions addSuppressionItem(InlineResponse200SuppressionsSuppression suppressionItem) {
    this.suppression.add(suppressionItem);
    return this;
  }

   /**
   * Get suppression
   * @return suppression
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse200SuppressionsSuppression> getSuppression() {
    return suppression;
  }

  public void setSuppression(List<InlineResponse200SuppressionsSuppression> suppression) {
    this.suppression = suppression;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200Suppressions inlineResponse200Suppressions = (InlineResponse200Suppressions) o;
    return Objects.equals(this.suppression, inlineResponse200Suppressions.suppression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suppression);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200Suppressions {\n");
    
    sb.append("    suppression: ").append(toIndentedString(suppression)).append("\n");
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

