/*
 * Idfy.Admin
 * In this API you can manage your account details, logo, styling or manage your openid / oauth api clients. If you are a dealer you can also manage the accounts registered to this dealer.   ## Last update   Last build date for this API: 14.01.2018  
 *
 * OpenAPI spec version: v1
 * Contact: support@idfy.io
 */

package io.idfy.admin.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.Arrays;
import java.util.UUID;
import java.io.Serializable;

/**
 * AccountLogo
 */
@JsonDeserialize(builder = AccountLogo.Builder.class)
public class AccountLogo  implements Serializable {
  private final UUID accountId;  // Default value is: null

  private final String base64EncodedLogo;  // Default value is: null

  private final String fileName;  // Default value is: null

  private AccountLogo(Builder builder) {
      accountId = builder.accountId;
      base64EncodedLogo = builder.base64EncodedLogo;
      fileName = builder.fileName;
  }

      /**
      * Get accountId
      * @return accountId
      **/
      public UUID getAccountId() {return accountId;}

      /**
      * Get base64EncodedLogo
      * @return base64EncodedLogo
      **/
      public String getBase64EncodedLogo() {return base64EncodedLogo;}

      /**
      * Get fileName
      * @return fileName
      **/
      public String getFileName() {return fileName;}


  public static final class Builder {
      private UUID accountId;
      private String base64EncodedLogo;
      private String fileName;

    public Builder() {
    }

    public Builder(AccountLogo copy) {
        this.accountId = copy.getAccountId();
        this.base64EncodedLogo = copy.getBase64EncodedLogo();
        this.fileName = copy.getFileName();
    }

    public Builder withAccountId(UUID accountId) {
      this.accountId = accountId;
      return this;
    }

    public Builder withBase64EncodedLogo(String base64EncodedLogo) {
      this.base64EncodedLogo = base64EncodedLogo;
      return this;
    }

    public Builder withFileName(String fileName) {
      this.fileName = fileName;
      return this;
    }


    public AccountLogo build() { return new AccountLogo(this); }
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountLogo accountLogo = (AccountLogo) o;
    return Objects.equals(this.accountId, accountLogo.accountId) &&
        Objects.equals(this.base64EncodedLogo, accountLogo.base64EncodedLogo) &&
        Objects.equals(this.fileName, accountLogo.fileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, base64EncodedLogo, fileName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountLogo {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    base64EncodedLogo: ").append(toIndentedString(base64EncodedLogo)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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
