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
 * Container for the parameters to the {@link com.amazonaws.services.glacier.AmazonGlacier#completeVaultLock(CompleteVaultLockRequest) CompleteVaultLock operation}.
 * <p>
 * This operation completes the vault locking process by transitioning
 * the vault lock from the <code>InProgress</code> state to the
 * <code>Locked</code> state, which causes the vault lock policy to
 * become unchangeable. A vault lock is put into the
 * <code>InProgress</code> state by calling InitiateVaultLock. You can
 * obtain the state of the vault lock by calling GetVaultLock. For more
 * information about the vault locking process,
 * <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-lock.html"> Amazon Glacier Vault Lock </a>
 * .
 * </p>
 * <p>
 * This operation is idempotent. This request is always successful if the
 * vault lock is in the <code>Locked</code> state and the provided lock
 * ID matches the lock ID originally used to lock the vault.
 * </p>
 * <p>
 * If an invalid lock ID is passed in the request when the vault lock is
 * in the <code>Locked</code> state, the operation returns an
 * <code>AccessDeniedException</code> error. If an invalid lock ID is
 * passed in the request when the vault lock is in the
 * <code>InProgress</code> state, the operation throws an
 * <code>InvalidParameter</code> error.
 * </p>
 *
 * @see com.amazonaws.services.glacier.AmazonGlacier#completeVaultLock(CompleteVaultLockRequest)
 */
public class CompleteVaultLockRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The <code>lockId</code> value is the lock ID obtained from a
     * <a>InitiateVaultLock</a> request.
     */
    private String lockId;

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
    public CompleteVaultLockRequest withAccountId(String accountId) {
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
    public CompleteVaultLockRequest withVaultName(String vaultName) {
        this.vaultName = vaultName;
        return this;
    }

    /**
     * The <code>lockId</code> value is the lock ID obtained from a
     * <a>InitiateVaultLock</a> request.
     *
     * @return The <code>lockId</code> value is the lock ID obtained from a
     *         <a>InitiateVaultLock</a> request.
     */
    public String getLockId() {
        return lockId;
    }
    
    /**
     * The <code>lockId</code> value is the lock ID obtained from a
     * <a>InitiateVaultLock</a> request.
     *
     * @param lockId The <code>lockId</code> value is the lock ID obtained from a
     *         <a>InitiateVaultLock</a> request.
     */
    public void setLockId(String lockId) {
        this.lockId = lockId;
    }
    
    /**
     * The <code>lockId</code> value is the lock ID obtained from a
     * <a>InitiateVaultLock</a> request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lockId The <code>lockId</code> value is the lock ID obtained from a
     *         <a>InitiateVaultLock</a> request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CompleteVaultLockRequest withLockId(String lockId) {
        this.lockId = lockId;
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
        if (getLockId() != null) sb.append("LockId: " + getLockId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode()); 
        hashCode = prime * hashCode + ((getVaultName() == null) ? 0 : getVaultName().hashCode()); 
        hashCode = prime * hashCode + ((getLockId() == null) ? 0 : getLockId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CompleteVaultLockRequest == false) return false;
        CompleteVaultLockRequest other = (CompleteVaultLockRequest)obj;
        
        if (other.getAccountId() == null ^ this.getAccountId() == null) return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false) return false; 
        if (other.getVaultName() == null ^ this.getVaultName() == null) return false;
        if (other.getVaultName() != null && other.getVaultName().equals(this.getVaultName()) == false) return false; 
        if (other.getLockId() == null ^ this.getLockId() == null) return false;
        if (other.getLockId() != null && other.getLockId().equals(this.getLockId()) == false) return false; 
        return true;
    }
    
    @Override
    public CompleteVaultLockRequest clone() {
        
            return (CompleteVaultLockRequest) super.clone();
    }

}
    