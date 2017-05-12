package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InlineResponse2009SuppressionsSuppression;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * Suppressions3
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-12T22:37:00.102Z")

public class Suppressions3   {
  @JsonProperty("suppression")
  private List<InlineResponse2009SuppressionsSuppression> suppression = new ArrayList<InlineResponse2009SuppressionsSuppression>();

  public Suppressions3 suppression(List<InlineResponse2009SuppressionsSuppression> suppression) {
    this.suppression = suppression;
    return this;
  }

  public Suppressions3 addSuppressionItem(InlineResponse2009SuppressionsSuppression suppressionItem) {
    this.suppression.add(suppressionItem);
    return this;
  }

   /**
   * Get suppression
   * @return suppression
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse2009SuppressionsSuppression> getSuppression() {
    return suppression;
  }

  public void setSuppression(List<InlineResponse2009SuppressionsSuppression> suppression) {
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
    Suppressions3 suppressions3 = (Suppressions3) o;
    return Objects.equals(this.suppression, suppressions3.suppression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suppression);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Suppressions3 {\n");
    
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

