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
 * Container for the parameters to the {@link com.amazonaws.services.glacier.AmazonGlacier#getVaultLock(GetVaultLockRequest) GetVaultLock operation}.
 * <p>
 * This operation retrieves the following attributes from the
 * <code>lock-policy</code> subresource set on the specified vault:
 * <ul>
 * <li> <p>
 * The vault lock policy set on the vault.
 * </p>
 * </li>
 * <li> <p>
 * The state of the vault lock, which is either <code>InProgess</code> or
 * <code>Locked</code> .
 * </p>
 * </li>
 * <li> <p>
 * When the lock ID expires. The lock ID is used to complete the vault
 * locking process.
 * </p>
 * </li>
 * <li> <p>
 * When the vault lock was initiated and put into the
 * <code>InProgress</code> state.
 * </p>
 * </li>
 * 
 * </ul>
 * 
 * </p>
 * <p>
 * A vault lock is put into the <code>InProgress</code> state by calling
 * InitiateVaultLock. A vault lock is put into the <code>Locked</code>
 * state by calling CompleteVaultLock. You can abort the vault locking
 * process by calling AbortVaultLock. For more information about the
 * vault locking process,
 * <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-lock.html"> Amazon Glacier Vault Lock </a>
 * .
 * </p>
 * <p>
 * If there is no vault lock policy set on the vault, the operation
 * returns a <code>404 Not found</code> error. For more information about
 * vault lock policies,
 * <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-lock-policy.html"> Amazon Glacier Access Control with Vault Lock Policies </a>
 * .
 * </p>
 *
 * @see com.amazonaws.services.glacier.AmazonGlacier#getVaultLock(GetVaultLockRequest)
 */
public class GetVaultLockRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

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
    public GetVaultLockRequest withAccountId(String accountId) {
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
    public GetVaultLockRequest withVaultName(String vaultName) {
        this.vaultName = vaultName;
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
        if (getVaultName() != null) sb.append("VaultName: " + getVaultName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode()); 
        hashCode = prime * hashCode + ((getVaultName() == null) ? 0 : getVaultName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetVaultLockRequest == false) return false;
        GetVaultLockRequest other = (GetVaultLockRequest)obj;
        
        if (other.getAccountId() == null ^ this.getAccountId() == null) return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false) return false; 
        if (other.getVaultName() == null ^ this.getVaultName() == null) return false;
        if (other.getVaultName() != null && other.getVaultName().equals(this.getVaultName()) == false) return false; 
        return true;
    }
    
    @Override
    public GetVaultLockRequest clone() {
        
            return (GetVaultLockRequest) super.clone();
    }

}
    