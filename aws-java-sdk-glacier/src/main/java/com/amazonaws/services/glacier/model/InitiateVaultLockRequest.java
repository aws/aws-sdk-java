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
 * Container for the parameters to the {@link com.amazonaws.services.glacier.AmazonGlacier#initiateVaultLock(InitiateVaultLockRequest) InitiateVaultLock operation}.
 * <p>
 * This operation initiates the vault locking process by doing the
 * following:
 * <ul>
 * <li> <p>
 * Installing a vault lock policy on the specified vault.
 * </p>
 * </li>
 * <li> <p>
 * Setting the lock state of vault lock to <code>InProgress</code> .
 * </p>
 * </li>
 * <li> <p>
 * Returning a lock ID, which is used to complete the vault locking
 * process.
 * </p>
 * </li>
 * 
 * </ul>
 * 
 * </p>
 * <p>
 * You can set one vault lock policy for each vault and this policy can
 * be up to 20 KB in size. For more information about vault lock
 * policies, see
 * <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-lock-policy.html"> Amazon Glacier Access Control with Vault Lock Policies </a>
 * .
 * </p>
 * <p>
 * You must complete the vault locking process within 24 hours after the
 * vault lock enters the <code>InProgress</code> state. After the 24 hour
 * window ends, the lock ID expires, the vault automatically exits the
 * <code>InProgress</code> state, and the vault lock policy is removed
 * from the vault. You call CompleteVaultLock to complete the vault
 * locking process by setting the state of the vault lock to
 * <code>Locked</code> .
 * </p>
 * <p>
 * After a vault lock is in the <code>Locked</code> state, you cannot
 * initiate a new vault lock for the vault.
 * </p>
 * <p>
 * You can abort the vault locking process by calling AbortVaultLock. You
 * can get the state of the vault lock by calling GetVaultLock. For more
 * information about the vault locking process,
 * <a href="http://docs.aws.amazon.com/amazonglacier/latest/dev/vault-lock.html"> Amazon Glacier Vault Lock </a>
 * .
 * </p>
 * <p>
 * If this operation is called when the vault lock is in the
 * <code>InProgress</code> state, the operation returns an
 * <code>AccessDeniedException</code> error. When the vault lock is in
 * the <code>InProgress</code> state you must call AbortVaultLock before
 * you can initiate a new vault lock policy.
 * </p>
 *
 * @see com.amazonaws.services.glacier.AmazonGlacier#initiateVaultLock(InitiateVaultLockRequest)
 */
public class InitiateVaultLockRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The vault lock policy as a JSON string, which uses "\" as an escape
     * character.
     */
    private VaultLockPolicy policy;

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
    public InitiateVaultLockRequest withAccountId(String accountId) {
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
    public InitiateVaultLockRequest withVaultName(String vaultName) {
        this.vaultName = vaultName;
        return this;
    }

    /**
     * The vault lock policy as a JSON string, which uses "\" as an escape
     * character.
     *
     * @return The vault lock policy as a JSON string, which uses "\" as an escape
     *         character.
     */
    public VaultLockPolicy getPolicy() {
        return policy;
    }
    
    /**
     * The vault lock policy as a JSON string, which uses "\" as an escape
     * character.
     *
     * @param policy The vault lock policy as a JSON string, which uses "\" as an escape
     *         character.
     */
    public void setPolicy(VaultLockPolicy policy) {
        this.policy = policy;
    }
    
    /**
     * The vault lock policy as a JSON string, which uses "\" as an escape
     * character.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policy The vault lock policy as a JSON string, which uses "\" as an escape
     *         character.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InitiateVaultLockRequest withPolicy(VaultLockPolicy policy) {
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

        if (obj instanceof InitiateVaultLockRequest == false) return false;
        InitiateVaultLockRequest other = (InitiateVaultLockRequest)obj;
        
        if (other.getAccountId() == null ^ this.getAccountId() == null) return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false) return false; 
        if (other.getVaultName() == null ^ this.getVaultName() == null) return false;
        if (other.getVaultName() != null && other.getVaultName().equals(this.getVaultName()) == false) return false; 
        if (other.getPolicy() == null ^ this.getPolicy() == null) return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false) return false; 
        return true;
    }
    
    @Override
    public InitiateVaultLockRequest clone() {
        
            return (InitiateVaultLockRequest) super.clone();
    }

}
    