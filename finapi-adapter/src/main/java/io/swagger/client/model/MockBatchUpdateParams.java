/*
 * finAPI RESTful Services
 * finAPI RESTful Services
 *
 * OpenAPI spec version: v1.20.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Apiv1testsmockBatchUpdateMockBankConnectionUpdates;
import java.util.ArrayList;
import java.util.List;

/**
 * Data for mock bank connection updates
 */
@ApiModel(description = "Data for mock bank connection updates")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-17T14:26:47.047Z")
public class MockBatchUpdateParams {
  @SerializedName("mockBankConnectionUpdates")
  private List<Apiv1testsmockBatchUpdateMockBankConnectionUpdates> mockBankConnectionUpdates = new ArrayList<Apiv1testsmockBatchUpdateMockBankConnectionUpdates>();

  @SerializedName("triggerNotifications")
  private Boolean triggerNotifications = false;

  public MockBatchUpdateParams mockBankConnectionUpdates(List<Apiv1testsmockBatchUpdateMockBankConnectionUpdates> mockBankConnectionUpdates) {
    this.mockBankConnectionUpdates = mockBankConnectionUpdates;
    return this;
  }

  public MockBatchUpdateParams addMockBankConnectionUpdatesItem(Apiv1testsmockBatchUpdateMockBankConnectionUpdates mockBankConnectionUpdatesItem) {
    this.mockBankConnectionUpdates.add(mockBankConnectionUpdatesItem);
    return this;
  }

   /**
   * List of mock bank connection updates
   * @return mockBankConnectionUpdates
  **/
  @ApiModelProperty(example = "null", required = true, value = "List of mock bank connection updates")
  public List<Apiv1testsmockBatchUpdateMockBankConnectionUpdates> getMockBankConnectionUpdates() {
    return mockBankConnectionUpdates;
  }

  public void setMockBankConnectionUpdates(List<Apiv1testsmockBatchUpdateMockBankConnectionUpdates> mockBankConnectionUpdates) {
    this.mockBankConnectionUpdates = mockBankConnectionUpdates;
  }

  public MockBatchUpdateParams triggerNotifications(Boolean triggerNotifications) {
    this.triggerNotifications = triggerNotifications;
    return this;
  }

   /**
   * Whether this call should trigger the dispatching of notifications. Default is 'false'.
   * @return triggerNotifications
  **/
  @ApiModelProperty(example = "null", value = "Whether this call should trigger the dispatching of notifications. Default is 'false'.")
  public Boolean getTriggerNotifications() {
    return triggerNotifications;
  }

  public void setTriggerNotifications(Boolean triggerNotifications) {
    this.triggerNotifications = triggerNotifications;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MockBatchUpdateParams mockBatchUpdateParams = (MockBatchUpdateParams) o;
    return Objects.equals(this.mockBankConnectionUpdates, mockBatchUpdateParams.mockBankConnectionUpdates) &&
        Objects.equals(this.triggerNotifications, mockBatchUpdateParams.triggerNotifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mockBankConnectionUpdates, triggerNotifications);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MockBatchUpdateParams {\n");
    
    sb.append("    mockBankConnectionUpdates: ").append(toIndentedString(mockBankConnectionUpdates)).append("\n");
    sb.append("    triggerNotifications: ").append(toIndentedString(triggerNotifications)).append("\n");
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

