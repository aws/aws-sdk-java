/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.glacier.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.glacier.AmazonGlacier#addTagsToVault(AddTagsToVaultRequest) AddTagsToVault operation}.
 * <p>
 * This operation adds the specified tags to a vault. Each tag is
 * composed of a key and a value. Each vault can have up to 10 tags. If
 * your request would cause the tag limit for the vault to be exceeded,
 * the operation throws the <code>LimitExceededException</code> error. If
 * a tag already exists on the vault under a specified key, the existing
 * key value will be overwritten. For more information about tags, see
 * <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/tagging.html"> Tagging Amazon Glacier Resources </a>
 * .
 * </p>
 *
 * @see com.amazonaws.services.glacier.AmazonGlacier#addTagsToVault(AddTagsToVaultRequest)
 */
public class AddTagsToVaultRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The <code>AccountId</code> value is the AWS account ID of the account
     * that owns the vault. You can either specify an AWS account ID or
     * optionally a single '<code>-</code>' (hyphen), in which case Amazon
     * Glacier uses the AWS account ID associated with the credentials used
     * to sign the request. If you use an account ID, do not include any
     * hyphens ('-') in the ID.
     */
    private String accountId;

    /**
     * The name of the vault.
     */
    private String vaultName;

    /**
     * The tags to add to the vault. Each tag is composed of a key and a
     * value. The value can be an empty string.
     */
    private java.util.Map<String,String> tags;

    /**
     * The <code>AccountId</code> value is the AWS account ID of the account
     * that owns the vault. You can either specify an AWS account ID or
     * optionally a single '<code>-</code>' (hyphen), in which case Amazon
     * Glacier uses the AWS account ID associated with the credentials used
     * to sign the request. If you use an account ID, do not include any
     * hyphens ('-') in the ID.
     *
     * @return The <code>AccountId</code> value is the AWS account ID of the account
     *         that owns the vault. You can either specify an AWS account ID or
     *         optionally a single '<code>-</code>' (hyphen), in which case Amazon
     *         Glacier uses the AWS account ID associated with the credentials used
     *         to sign the request. If you use an account ID, do not include any
     *         hyphens ('-') in the ID.
     */
    public String getAccountId() {
        return accountId;
    }
    
    /**
     * The <code>AccountId</code> value is the AWS account ID of the account
     * that owns the vault. You can either specify an AWS account ID or
     * optionally a single '<code>-</code>' (hyphen), in which case Amazon
     * Glacier uses the AWS account ID associated with the credentials used
     * to sign the request. If you use an account ID, do not include any
     * hyphens ('-') in the ID.
     *
     * @param accountId The <code>AccountId</code> value is the AWS account ID of the account
     *         that owns the vault. You can either specify an AWS account ID or
     *         optionally a single '<code>-</code>' (hyphen), in which case Amazon
     *         Glacier uses the AWS account ID associated with the credentials used
     *         to sign the request. If you use an account ID, do not include any
     *         hyphens ('-') in the ID.
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    
    /**
     * The <code>AccountId</code> value is the AWS account ID of the account
     * that owns the vault. You can either specify an AWS account ID or
     * optionally a single '<code>-</code>' (hyphen), in which case Amazon
     * Glacier uses the AWS account ID associated with the credentials used
     * to sign the request. If you use an account ID, do not include any
     * hyphens ('-') in the ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accountId The <code>AccountId</code> value is the AWS account ID of the account
     *         that owns the vault. You can either specify an AWS account ID or
     *         optionally a single '<code>-</code>' (hyphen), in which case Amazon
     *         Glacier uses the AWS account ID associated with the credentials used
     *         to sign the request. If you use an account ID, do not include any
     *         hyphens ('-') in the ID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddTagsToVaultRequest withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * The name of the vault.
     *
     * @return The name of the vault.
     */
    public String getVaultName() {
        return vaultName;
    }
    
    /**
     * The name of the vault.
     *
     * @param vaultName The name of the vault.
     */
    public void setVaultName(String vaultName) {
        this.vaultName = vaultName;
    }
    
    /**
     * The name of the vault.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vaultName The name of the vault.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddTagsToVaultRequest withVaultName(String vaultName) {
        this.vaultName = vaultName;
        return this;
    }

    /**
     * The tags to add to the vault. Each tag is composed of a key and a
     * value. The value can be an empty string.
     *
     * @return The tags to add to the vault. Each tag is composed of a key and a
     *         value. The value can be an empty string.
     */
    public java.util.Map<String,String> getTags() {
        
        if (tags == null) {
            tags = new java.util.HashMap<String,String>();
        }
        return tags;
    }
    
    /**
     * The tags to add to the vault. Each tag is composed of a key and a
     * value. The value can be an empty string.
     *
     * @param tags The tags to add to the vault. Each tag is composed of a key and a
     *         value. The value can be an empty string.
     */
    public void setTags(java.util.Map<String,String> tags) {
        this.tags = tags;
    }
    
    /**
     * The tags to add to the vault. Each tag is composed of a key and a
     * value. The value can be an empty string.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The tags to add to the vault. Each tag is composed of a key and a
     *         value. The value can be an empty string.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddTagsToVaultRequest withTags(java.util.Map<String,String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * The tags to add to the vault. Each tag is composed of a key and a
     * value. The value can be an empty string.
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns
     * a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     */
  public AddTagsToVaultRequest addTagsEntry(String key, String value) {
    if (null == this.tags) {
      this.tags = new java.util.HashMap<String,String>();
    }
    if (this.tags.containsKey(key))
      throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
    this.tags.put(key, value);
    return this;
  }

  /**
   * Removes all the entries added into Tags.
   * <p>
   * Returns a reference to this object so that method calls can be chained together.
   */
  public AddTagsToVaultRequest clearTagsEntries() {
    this.tags = null;
    return this;
  }
  
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAccountId() != null) sb.append("AccountId: " + getAccountId() + ",");
        if (getVaultName() != null) sb.append("VaultName: " + getVaultName() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode()); 
        hashCode = prime * hashCode + ((getVaultName() == null) ? 0 : getVaultName().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AddTagsToVaultRequest == false) return false;
        AddTagsToVaultRequest other = (AddTagsToVaultRequest)obj;
        
        if (other.getAccountId() == null ^ this.getAccountId() == null) return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false) return false; 
        if (other.getVaultName() == null ^ this.getVaultName() == null) return false;
        if (other.getVaultName() != null && other.getVaultName().equals(this.getVaultName()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
    @Override
    public AddTagsToVaultRequest clone() {
        
            return (AddTagsToVaultRequest) super.clone();
    }

}
    