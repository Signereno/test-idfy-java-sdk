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
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * Contract information
 */
@JsonDeserialize(builder = ContractResponse.Builder.class)
public class ContractResponse  implements Serializable {
  /**
   * Monthly rent for the contract if this was specified
   */
  private final Double monthlyRent;  // Default value is: null

  /**
   * Deposit factor if this was specified
   */
  private final Double depositFactor;  // Default value is: null

  /**
   * The Deposit amount
   */
  private final Double depositAmount;  // Default value is: null

  /**
   * Date used to inform the tenant about payment deadline.
   */
  private final OffsetDateTime paymentDeadline;  // Default value is: null

  private final OffsetDateTime from;  // Default value is: null

  private final OffsetDateTime to;  // Default value is: null

  private ContractResponse(Builder builder) {
      monthlyRent = builder.monthlyRent;
      depositFactor = builder.depositFactor;
      depositAmount = builder.depositAmount;
      paymentDeadline = builder.paymentDeadline;
      from = builder.from;
      to = builder.to;
  }

      /**
      * Monthly rent for the contract if this was specified
      * @return monthlyRent
      **/
      public Double getMonthlyRent() {return monthlyRent;}

      /**
      * Deposit factor if this was specified
      * @return depositFactor
      **/
      public Double getDepositFactor() {return depositFactor;}

      /**
      * The Deposit amount
      * @return depositAmount
      **/
      public Double getDepositAmount() {return depositAmount;}

      /**
      * Date used to inform the tenant about payment deadline.
      * @return paymentDeadline
      **/
      public OffsetDateTime getPaymentDeadline() {return paymentDeadline;}

      /**
      * Get from
      * @return from
      **/
      public OffsetDateTime getFrom() {return from;}

      /**
      * Get to
      * @return to
      **/
      public OffsetDateTime getTo() {return to;}


  public static final class Builder {
      private Double monthlyRent;
      private Double depositFactor;
      private Double depositAmount;
      private OffsetDateTime paymentDeadline;
      private OffsetDateTime from;
      private OffsetDateTime to;

    public Builder() {
    }

    public Builder(ContractResponse copy) {
        this.monthlyRent = copy.getMonthlyRent();
        this.depositFactor = copy.getDepositFactor();
        this.depositAmount = copy.getDepositAmount();
        this.paymentDeadline = copy.getPaymentDeadline();
        this.from = copy.getFrom();
        this.to = copy.getTo();
    }

    public Builder withMonthlyRent(Double monthlyRent) {
      this.monthlyRent = monthlyRent;
      return this;
    }

    public Builder withDepositFactor(Double depositFactor) {
      this.depositFactor = depositFactor;
      return this;
    }

    public Builder withDepositAmount(Double depositAmount) {
      this.depositAmount = depositAmount;
      return this;
    }

    public Builder withPaymentDeadline(OffsetDateTime paymentDeadline) {
      this.paymentDeadline = paymentDeadline;
      return this;
    }

    public Builder withFrom(OffsetDateTime from) {
      this.from = from;
      return this;
    }

    public Builder withTo(OffsetDateTime to) {
      this.to = to;
      return this;
    }


    public ContractResponse build() { return new ContractResponse(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContractResponse contractResponse = (ContractResponse) o;
    return Objects.equals(this.monthlyRent, contractResponse.monthlyRent) &&
        Objects.equals(this.depositFactor, contractResponse.depositFactor) &&
        Objects.equals(this.depositAmount, contractResponse.depositAmount) &&
        Objects.equals(this.paymentDeadline, contractResponse.paymentDeadline) &&
        Objects.equals(this.from, contractResponse.from) &&
        Objects.equals(this.to, contractResponse.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monthlyRent, depositFactor, depositAmount, paymentDeadline, from, to);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContractResponse {\n");
    
    sb.append("    monthlyRent: ").append(toIndentedString(monthlyRent)).append("\n");
    sb.append("    depositFactor: ").append(toIndentedString(depositFactor)).append("\n");
    sb.append("    depositAmount: ").append(toIndentedString(depositAmount)).append("\n");
    sb.append("    paymentDeadline: ").append(toIndentedString(paymentDeadline)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
