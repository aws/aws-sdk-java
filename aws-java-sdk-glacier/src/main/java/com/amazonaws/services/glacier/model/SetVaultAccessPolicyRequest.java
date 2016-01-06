/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.glacier.AmazonGlacier#setVaultAccessPolicy(SetVaultAccessPolicyRequest) SetVaultAccessPolicy operation}.
 * <p>
 * This operation configures an access policy for a vault and will
 * overwrite an existing policy. To configure a vault access policy, send
 * a PUT request to the <code>access-policy</code> subresource of the
 * vault. An access policy is specific to a vault and is also called a
 * vault subresource. You can set one access policy per vault and the
 * policy can be up to 20 KB in size. For more information about vault
 * access policies, see
 * <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-access-policy.html"> Amazon Glacier Access Control with Vault Access Policies </a>
 * .
 * </p>
 *
 * @see com.amazonaws.services.glacier.AmazonGlacier#setVaultAccessPolicy(SetVaultAccessPolicyRequest)
 */
public class SetVaultAccessPolicyRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The vault access policy as a JSON string.
     */
    private VaultAccessPolicy policy;

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
    public SetVaultAccessPolicyRequest withAccountId(String accountId) {
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
    public SetVaultAccessPolicyRequest withVaultName(String vaultName) {
        this.vaultName = vaultName;
        return this;
    }

    /**
     * The vault access policy as a JSON string.
     *
     * @return The vault access policy as a JSON string.
     */
    public VaultAccessPolicy getPolicy() {
        return policy;
    }
    
    /**
     * The vault access policy as a JSON string.
     *
     * @param policy The vault access policy as a JSON string.
     */
    public void setPolicy(VaultAccessPolicy policy) {
        this.policy = policy;
    }
    
    /**
     * The vault access policy as a JSON string.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policy The vault access policy as a JSON string.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SetVaultAccessPolicyRequest withPolicy(VaultAccessPolicy policy) {
        this.policy = policy;
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
        if (getPolicy() != null) sb.append("Policy: " + getPolicy() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode()); 
        hashCode = prime * hashCode + ((getVaultName() == null) ? 0 : getVaultName().hashCode()); 
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SetVaultAccessPolicyRequest == false) return false;
        SetVaultAccessPolicyRequest other = (SetVaultAccessPolicyRequest)obj;
        
        if (other.getAccountId() == null ^ this.getAccountId() == null) return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false) return false; 
        if (other.getVaultName() == null ^ this.getVaultName() == null) return false;
        if (other.getVaultName() != null && other.getVaultName().equals(this.getVaultName()) == false) return false; 
        if (other.getPolicy() == null ^ this.getPolicy() == null) return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false) return false; 
        return true;
    }
    
    @Override
    public SetVaultAccessPolicyRequest clone() {
        
            return (SetVaultAccessPolicyRequest) super.clone();
    }

}
    