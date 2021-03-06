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
import io.idfy.deposit.models.Advanced;
import io.idfy.deposit.models.ContactInformation;
import io.idfy.deposit.models.ContractResponse;
import io.idfy.deposit.models.LandlordResponse;
import io.idfy.deposit.models.RentObjectRequest;
import io.idfy.deposit.models.Status;
import io.idfy.deposit.models.TenantsResponse;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.io.Serializable;

/**
 * CreateDepositResponse
 */
@JsonDeserialize(builder = CreateDepositResponse.Builder.class)
public class CreateDepositResponse  implements Serializable {
  /**
   * The deposit's unique identifier.
   */
  private final UUID id;  // Default value is: null

  /**
   * The document's unique identifier.
   */
  private final UUID documentId;  // Default value is: null

  /**
   * Array of tenants for the deposit
   */
  private final List<TenantsResponse> tenants;  // Default value is: new ArrayList<>()

  private final LandlordResponse landlord;  // Default value is: null

  /**
   * Date of creation
   */
  private final OffsetDateTime created;  // Default value is: null

  private final ContractResponse contract;  // Default value is: null

  private final Status status;  // Default value is: null

  /**
   * Your reference for the contract.
   */
  private final String externalId;  // Default value is: null

  private final RentObjectRequest rentObject;  // Default value is: null

  private final ContactInformation contactDetails;  // Default value is: null

  private final Advanced advanced;  // Default value is: null

  private CreateDepositResponse(Builder builder) {
      id = builder.id;
      documentId = builder.documentId;
      tenants = builder.tenants;
      landlord = builder.landlord;
      created = builder.created;
      contract = builder.contract;
      status = builder.status;
      externalId = builder.externalId;
      rentObject = builder.rentObject;
      contactDetails = builder.contactDetails;
      advanced = builder.advanced;
  }

      /**
      * The deposit's unique identifier.
      * @return id
      **/
      public UUID getId() {return id;}

      /**
      * The document's unique identifier.
      * @return documentId
      **/
      public UUID getDocumentId() {return documentId;}

      /**
      * Array of tenants for the deposit
      * @return tenants
      **/
      public List<TenantsResponse> getTenants() {return tenants;}

      /**
      * Get landlord
      * @return landlord
      **/
      public LandlordResponse getLandlord() {return landlord;}

      /**
      * Date of creation
      * @return created
      **/
      public OffsetDateTime getCreated() {return created;}

      /**
      * Get contract
      * @return contract
      **/
      public ContractResponse getContract() {return contract;}

      /**
      * Get status
      * @return status
      **/
      public Status getStatus() {return status;}

      /**
      * Your reference for the contract.
      * @return externalId
      **/
      public String getExternalId() {return externalId;}

      /**
      * Get rentObject
      * @return rentObject
      **/
      public RentObjectRequest getRentObject() {return rentObject;}

      /**
      * Get contactDetails
      * @return contactDetails
      **/
      public ContactInformation getContactDetails() {return contactDetails;}

      /**
      * Get advanced
      * @return advanced
      **/
      public Advanced getAdvanced() {return advanced;}


  public static final class Builder {
      private UUID id;
      private UUID documentId;
      private List<TenantsResponse> tenants;
      private LandlordResponse landlord;
      private OffsetDateTime created;
      private ContractResponse contract;
      private Status status;
      private String externalId;
      private RentObjectRequest rentObject;
      private ContactInformation contactDetails;
      private Advanced advanced;

    public Builder() {
    }

    public Builder(CreateDepositResponse copy) {
        this.id = copy.getId();
        this.documentId = copy.getDocumentId();
        this.tenants = copy.getTenants();
        this.landlord = copy.getLandlord();
        this.created = copy.getCreated();
        this.contract = copy.getContract();
        this.status = copy.getStatus();
        this.externalId = copy.getExternalId();
        this.rentObject = copy.getRentObject();
        this.contactDetails = copy.getContactDetails();
        this.advanced = copy.getAdvanced();
    }

    public Builder withId(UUID id) {
      this.id = id;
      return this;
    }

    public Builder withDocumentId(UUID documentId) {
      this.documentId = documentId;
      return this;
    }

    public Builder withTenants(List<TenantsResponse> tenants) {
      this.tenants = tenants;
      return this;
    }

    public Builder addTenantsItem(TenantsResponse tenantsItem) {
      if (this.tenants == null) {
        this.tenants = new ArrayList<>();
      }
      this.tenants.add(tenantsItem);
      return this;
    }

    public Builder withLandlord(LandlordResponse landlord) {
      this.landlord = landlord;
      return this;
    }

    public Builder withCreated(OffsetDateTime created) {
      this.created = created;
      return this;
    }

    public Builder withContract(ContractResponse contract) {
      this.contract = contract;
      return this;
    }

    public Builder withStatus(Status status) {
      this.status = status;
      return this;
    }

    public Builder withExternalId(String externalId) {
      this.externalId = externalId;
      return this;
    }

    public Builder withRentObject(RentObjectRequest rentObject) {
      this.rentObject = rentObject;
      return this;
    }

    public Builder withContactDetails(ContactInformation contactDetails) {
      this.contactDetails = contactDetails;
      return this;
    }

    public Builder withAdvanced(Advanced advanced) {
      this.advanced = advanced;
      return this;
    }


    public CreateDepositResponse build() { return new CreateDepositResponse(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDepositResponse createDepositResponse = (CreateDepositResponse) o;
    return Objects.equals(this.id, createDepositResponse.id) &&
        Objects.equals(this.documentId, createDepositResponse.documentId) &&
        Objects.equals(this.tenants, createDepositResponse.tenants) &&
        Objects.equals(this.landlord, createDepositResponse.landlord) &&
        Objects.equals(this.created, createDepositResponse.created) &&
        Objects.equals(this.contract, createDepositResponse.contract) &&
        Objects.equals(this.status, createDepositResponse.status) &&
        Objects.equals(this.externalId, createDepositResponse.externalId) &&
        Objects.equals(this.rentObject, createDepositResponse.rentObject) &&
        Objects.equals(this.contactDetails, createDepositResponse.contactDetails) &&
        Objects.equals(this.advanced, createDepositResponse.advanced);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, documentId, tenants, landlord, created, contract, status, externalId, rentObject, contactDetails, advanced);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDepositResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    tenants: ").append(toIndentedString(tenants)).append("\n");
    sb.append("    landlord: ").append(toIndentedString(landlord)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    rentObject: ").append(toIndentedString(rentObject)).append("\n");
    sb.append("    contactDetails: ").append(toIndentedString(contactDetails)).append("\n");
    sb.append("    advanced: ").append(toIndentedString(advanced)).append("\n");
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
