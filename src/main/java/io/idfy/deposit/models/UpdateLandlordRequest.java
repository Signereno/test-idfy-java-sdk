/*
 * Idfy Deposit
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */

package io.idfy.deposit.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;
import io.idfy.deposit.models.Address;
import java.io.Serializable;

/**
 * UpdateLandlordRequest
 */
@JsonDeserialize(builder = UpdateLandlordRequest.Builder.class)
public class UpdateLandlordRequest  implements Serializable {
  private final String organizationNumber;  // Default value is: null

  private final Address address;  // Default value is: null

  private final String ssn;  // Default value is: null

  private UpdateLandlordRequest(Builder builder) {
      organizationNumber = builder.organizationNumber;
      address = builder.address;
      ssn = builder.ssn;
  }

      /**
      * Get organizationNumber
      * @return organizationNumber
      **/
      public String getOrganizationNumber() {return organizationNumber;}

      /**
      * Get address
      * @return address
      **/
      public Address getAddress() {return address;}

      /**
      * Get ssn
      * @return ssn
      **/
      public String getSsn() {return ssn;}


  public static final class Builder {
      private String organizationNumber;
      private Address address;
      private String ssn;

    public Builder() {
    }

    public Builder(UpdateLandlordRequest copy) {
        this.organizationNumber = copy.getOrganizationNumber();
        this.address = copy.getAddress();
        this.ssn = copy.getSsn();
    }

    public Builder withOrganizationNumber(String organizationNumber) {
      this.organizationNumber = organizationNumber;
      return this;
    }

    public Builder withAddress(Address address) {
      this.address = address;
      return this;
    }

    public Builder withSsn(String ssn) {
      this.ssn = ssn;
      return this;
    }


    public UpdateLandlordRequest build() { return new UpdateLandlordRequest(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateLandlordRequest updateLandlordRequest = (UpdateLandlordRequest) o;
    return Objects.equals(this.organizationNumber, updateLandlordRequest.organizationNumber) &&
        Objects.equals(this.address, updateLandlordRequest.address) &&
        Objects.equals(this.ssn, updateLandlordRequest.ssn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationNumber, address, ssn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateLandlordRequest {\n");
    
    sb.append("    organizationNumber: ").append(toIndentedString(organizationNumber)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
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
