/*
 * Idfy.Signature
 * Sign contracts, declarations, forms and other documents using digital signatures.   ## Last update   Last build date for this endpoint: 18.03.2019
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */

package io.idfy.signature.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;
import java.io.Serializable;

/**
 * The signer&#39;s mobile number. Define this if you are using notifications.
 */
@JsonDeserialize(builder = Mobile.Builder.class)
public class Mobile  implements Serializable {
  /**
   * The country code.
   */
  private final String countryCode;  // Default value is: null

  /**
   * The mobile number.
   */
  private final String number;  // Default value is: null

  private Mobile(Builder builder) {
      countryCode = builder.countryCode;
      number = builder.number;
  }

      /**
      * The country code.
      * @return countryCode
      **/
      public String getCountryCode() {return countryCode;}

      /**
      * The mobile number.
      * @return number
      **/
      public String getNumber() {return number;}


  public static final class Builder {
      private String countryCode;
      private String number;

    public Builder() {
    }

    public Builder(Mobile copy) {
        this.countryCode = copy.getCountryCode();
        this.number = copy.getNumber();
    }

    public Builder withCountryCode(String countryCode) {
      this.countryCode = countryCode;
      return this;
    }

    public Builder withNumber(String number) {
      this.number = number;
      return this;
    }


    public Mobile build() { return new Mobile(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mobile mobile = (Mobile) o;
    return Objects.equals(this.countryCode, mobile.countryCode) &&
        Objects.equals(this.number, mobile.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryCode, number);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mobile {\n");
    
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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
