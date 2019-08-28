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
 * Links
 */
@JsonDeserialize(builder = Links.Builder.class)
public class Links  implements Serializable {
  private final String next;  // Default value is: null

  private final String previous;  // Default value is: null

  private final String first;  // Default value is: null

  private Links(Builder builder) {
      next = builder.next;
      previous = builder.previous;
      first = builder.first;
  }

      /**
      * Get next
      * @return next
      **/
      public String getNext() {return next;}

      /**
      * Get previous
      * @return previous
      **/
      public String getPrevious() {return previous;}

      /**
      * Get first
      * @return first
      **/
      public String getFirst() {return first;}


  public static final class Builder {
      private String next;
      private String previous;
      private String first;

    public Builder() {
    }

    public Builder(Links copy) {
        this.next = copy.getNext();
        this.previous = copy.getPrevious();
        this.first = copy.getFirst();
    }

    public Builder withNext(String next) {
      this.next = next;
      return this;
    }

    public Builder withPrevious(String previous) {
      this.previous = previous;
      return this;
    }

    public Builder withFirst(String first) {
      this.first = first;
      return this;
    }


    public Links build() { return new Links(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Links links = (Links) o;
    return Objects.equals(this.next, links.next) &&
        Objects.equals(this.previous, links.previous) &&
        Objects.equals(this.first, links.first);
  }

  @Override
  public int hashCode() {
    return Objects.hash(next, previous, first);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Links {\n");
    
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
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
