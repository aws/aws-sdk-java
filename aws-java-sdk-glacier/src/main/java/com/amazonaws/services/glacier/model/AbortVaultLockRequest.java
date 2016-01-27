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
 * Container for the parameters to the {@link com.amazonaws.services.glacier.AmazonGlacier#abortVaultLock(AbortVaultLockRequest) AbortVaultLock operation}.
 * <p>
 * This operation aborts the vault locking process if the vault lock is
 * not in the <code>Locked</code> state. If the vault lock is in the
 * <code>Locked</code> state when this operation is requested, the
 * operation returns an <code>AccessDeniedException</code> error.
 * Aborting the vault locking process removes the vault lock policy from
 * the specified vault.
 * </p>
 * <p>
 * A vault lock is put into the <code>InProgress</code> state by calling
 * InitiateVaultLock. A vault lock is put into the <code>Locked</code>
 * state by calling CompleteVaultLock. You can get the state of a vault
 * lock by calling GetVaultLock. For more information about the vault
 * locking process, see
 * <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-lock.html"> Amazon Glacier Vault Lock </a> . For more information about vault lock policies, see <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-lock-policy.html"> Amazon Glacier Access Control with Vault Lock Policies </a>
 * .
 * </p>
 * <p>
 * This operation is idempotent. You can successfully invoke this
 * operation multiple times, if the vault lock is in the
 * <code>InProgress</code> state or if there is no policy associated with
 * the vault.
 * </p>
 *
 * @see com.amazonaws.services.glacier.AmazonGlacier#abortVaultLock(AbortVaultLockRequest)
 */
public class AbortVaultLockRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The <code>AccountId</code> value is the AWS account ID. This value
     * must match the AWS account ID associated with the credentials used to
     * sign the request. You can either specify an AWS account ID or
     * optionally a single '<code>-</code>' (hyphen), in which case Amazon
     * Glacier uses the AWS account ID associated with the credentials used
     * to sign the request. If you specify your account ID, do not include
     * any hyphens ('-') in the ID.
     */
    private String accountId;

    /**
     * The name of the vault.
     */
    private String vaultName;

    /**
     * The <code>AccountId</code> value is the AWS account ID. This value
     * must match the AWS account ID associated with the credentials used to
     * sign the request. You can either specify an AWS account ID or
     * optionally a single '<code>-</code>' (hyphen), in which case Amazon
     * Glacier uses the AWS account ID associated with the credentials used
     * to sign the request. If you specify your account ID, do not include
     * any hyphens ('-') in the ID.
     *
     * @return The <code>AccountId</code> value is the AWS account ID. This value
     *         must match the AWS account ID associated with the credentials used to
     *         sign the request. You can either specify an AWS account ID or
     *         optionally a single '<code>-</code>' (hyphen), in which case Amazon
     *         Glacier uses the AWS account ID associated with the credentials used
     *         to sign the request. If you specify your account ID, do not include
     *         any hyphens ('-') in the ID.
     */
    public String getAccountId() {
        return accountId;
    }
    
    /**
     * The <code>AccountId</code> value is the AWS account ID. This value
     * must match the AWS account ID associated with the credentials used to
     * sign the request. You can either specify an AWS account ID or
     * optionally a single '<code>-</code>' (hyphen), in which case Amazon
     * Glacier uses the AWS account ID associated with the credentials used
     * to sign the request. If you specify your account ID, do not include
     * any hyphens ('-') in the ID.
     *
     * @param accountId The <code>AccountId</code> value is the AWS account ID. This value
     *         must match the AWS account ID associated with the credentials used to
     *         sign the request. You can either specify an AWS account ID or
     *         optionally a single '<code>-</code>' (hyphen), in which case Amazon
     *         Glacier uses the AWS account ID associated with the credentials used
     *         to sign the request. If you specify your account ID, do not include
     *         any hyphens ('-') in the ID.
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    
    /**
     * The <code>AccountId</code> value is the AWS account ID. This value
     * must match the AWS account ID associated with the credentials used to
     * sign the request. You can either specify an AWS account ID or
     * optionally a single '<code>-</code>' (hyphen), in which case Amazon
     * Glacier uses the AWS account ID associated with the credentials used
     * to sign the request. If you specify your account ID, do not include
     * any hyphens ('-') in the ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accountId The <code>AccountId</code> value is the AWS account ID. This value
     *         must match the AWS account ID associated with the credentials used to
     *         sign the request. You can either specify an AWS account ID or
     *         optionally a single '<code>-</code>' (hyphen), in which case Amazon
     *         Glacier uses the AWS account ID associated with the credentials used
     *         to sign the request. If you specify your account ID, do not include
     *         any hyphens ('-') in the ID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AbortVaultLockRequest withAccountId(String accountId) {
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
    public AbortVaultLockRequest withVaultName(String vaultName) {
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

        if (obj instanceof AbortVaultLockRequest == false) return false;
        AbortVaultLockRequest other = (AbortVaultLockRequest)obj;
        
        if (other.getAccountId() == null ^ this.getAccountId() == null) return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false) return false; 
        if (other.getVaultName() == null ^ this.getVaultName() == null) return false;
        if (other.getVaultName() != null && other.getVaultName().equals(this.getVaultName()) == false) return false; 
        return true;
    }
    
    @Override
    public AbortVaultLockRequest clone() {
        
            return (AbortVaultLockRequest) super.clone();
    }

}
    