/*
 * Node Public API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: operators@constellationnetwork.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Balance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T20:15:22.967531+02:00[Europe/Warsaw]")
public class Balance {
  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private BigDecimal balance;

  public static final String SERIALIZED_NAME_MEM_POOL_BALANCE = "memPoolBalance";
  @SerializedName(SERIALIZED_NAME_MEM_POOL_BALANCE)
  private BigDecimal memPoolBalance;

  public static final String SERIALIZED_NAME_BALANCE_BY_LATEST_SNAPSHOT = "balanceByLatestSnapshot";
  @SerializedName(SERIALIZED_NAME_BALANCE_BY_LATEST_SNAPSHOT)
  private BigDecimal balanceByLatestSnapshot;

  public static final String SERIALIZED_NAME_REWARDS_BALANCE = "rewardsBalance";
  @SerializedName(SERIALIZED_NAME_REWARDS_BALANCE)
  private BigDecimal rewardsBalance;

  public static final String SERIALIZED_NAME_REPUTATION = "reputation";
  @SerializedName(SERIALIZED_NAME_REPUTATION)
  private BigDecimal reputation;

  public static final String SERIALIZED_NAME_ANCESTOR_BALANCES = "ancestorBalances";
  @SerializedName(SERIALIZED_NAME_ANCESTOR_BALANCES)
  private Object ancestorBalances;

  public static final String SERIALIZED_NAME_ANCESTOR_REPUTATION = "ancestorReputation";
  @SerializedName(SERIALIZED_NAME_ANCESTOR_REPUTATION)
  private Object ancestorReputation;


  public Balance balance(BigDecimal balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getBalance() {
    return balance;
  }


  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }


  public Balance memPoolBalance(BigDecimal memPoolBalance) {
    
    this.memPoolBalance = memPoolBalance;
    return this;
  }

   /**
   * Get memPoolBalance
   * @return memPoolBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getMemPoolBalance() {
    return memPoolBalance;
  }


  public void setMemPoolBalance(BigDecimal memPoolBalance) {
    this.memPoolBalance = memPoolBalance;
  }


  public Balance balanceByLatestSnapshot(BigDecimal balanceByLatestSnapshot) {
    
    this.balanceByLatestSnapshot = balanceByLatestSnapshot;
    return this;
  }

   /**
   * Get balanceByLatestSnapshot
   * @return balanceByLatestSnapshot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getBalanceByLatestSnapshot() {
    return balanceByLatestSnapshot;
  }


  public void setBalanceByLatestSnapshot(BigDecimal balanceByLatestSnapshot) {
    this.balanceByLatestSnapshot = balanceByLatestSnapshot;
  }


  public Balance rewardsBalance(BigDecimal rewardsBalance) {
    
    this.rewardsBalance = rewardsBalance;
    return this;
  }

   /**
   * Get rewardsBalance
   * @return rewardsBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getRewardsBalance() {
    return rewardsBalance;
  }


  public void setRewardsBalance(BigDecimal rewardsBalance) {
    this.rewardsBalance = rewardsBalance;
  }


  public Balance reputation(BigDecimal reputation) {
    
    this.reputation = reputation;
    return this;
  }

   /**
   * Get reputation
   * @return reputation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getReputation() {
    return reputation;
  }


  public void setReputation(BigDecimal reputation) {
    this.reputation = reputation;
  }


  public Balance ancestorBalances(Object ancestorBalances) {
    
    this.ancestorBalances = ancestorBalances;
    return this;
  }

   /**
   * Get ancestorBalances
   * @return ancestorBalances
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getAncestorBalances() {
    return ancestorBalances;
  }


  public void setAncestorBalances(Object ancestorBalances) {
    this.ancestorBalances = ancestorBalances;
  }


  public Balance ancestorReputation(Object ancestorReputation) {
    
    this.ancestorReputation = ancestorReputation;
    return this;
  }

   /**
   * Get ancestorReputation
   * @return ancestorReputation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getAncestorReputation() {
    return ancestorReputation;
  }


  public void setAncestorReputation(Object ancestorReputation) {
    this.ancestorReputation = ancestorReputation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Balance balance = (Balance) o;
    return Objects.equals(this.balance, balance.balance) &&
        Objects.equals(this.memPoolBalance, balance.memPoolBalance) &&
        Objects.equals(this.balanceByLatestSnapshot, balance.balanceByLatestSnapshot) &&
        Objects.equals(this.rewardsBalance, balance.rewardsBalance) &&
        Objects.equals(this.reputation, balance.reputation) &&
        Objects.equals(this.ancestorBalances, balance.ancestorBalances) &&
        Objects.equals(this.ancestorReputation, balance.ancestorReputation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, memPoolBalance, balanceByLatestSnapshot, rewardsBalance, reputation, ancestorBalances, ancestorReputation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Balance {\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    memPoolBalance: ").append(toIndentedString(memPoolBalance)).append("\n");
    sb.append("    balanceByLatestSnapshot: ").append(toIndentedString(balanceByLatestSnapshot)).append("\n");
    sb.append("    rewardsBalance: ").append(toIndentedString(rewardsBalance)).append("\n");
    sb.append("    reputation: ").append(toIndentedString(reputation)).append("\n");
    sb.append("    ancestorBalances: ").append(toIndentedString(ancestorBalances)).append("\n");
    sb.append("    ancestorReputation: ").append(toIndentedString(ancestorReputation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

