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

/**
 * <p>
 * Contains the Amazon Glacier response to your request.
 * </p>
 */
public class GetVaultLockResult implements Serializable, Cloneable {

    /**
     * The vault lock policy as a JSON string, which uses "\" as an escape
     * character.
     */
    private String policy;

    /**
     * The state of the vault lock. <code>InProgress</code> or
     * <code>Locked</code>.
     */
    private String state;

    /**
     * The UTC date and time at which the lock ID expires. This value can be
     * <code>null</code> if the vault lock is in a <code>Locked</code> state.
     */
    private String expirationDate;

    /**
     * The UTC date and time at which the vault lock was put into the
     * <code>InProgress</code> state.
     */
    private String creationDate;

    /**
     * The vault lock policy as a JSON string, which uses "\" as an escape
     * character.
     *
     * @return The vault lock policy as a JSON string, which uses "\" as an escape
     *         character.
     */
    public String getPolicy() {
        return policy;
    }
    
    /**
     * The vault lock policy as a JSON string, which uses "\" as an escape
     * character.
     *
     * @param policy The vault lock policy as a JSON string, which uses "\" as an escape
     *         character.
     */
    public void setPolicy(String policy) {
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
    public GetVaultLockResult withPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * The state of the vault lock. <code>InProgress</code> or
     * <code>Locked</code>.
     *
     * @return The state of the vault lock. <code>InProgress</code> or
     *         <code>Locked</code>.
     */
    public String getState() {
        return state;
    }
    
    /**
     * The state of the vault lock. <code>InProgress</code> or
     * <code>Locked</code>.
     *
     * @param state The state of the vault lock. <code>InProgress</code> or
     *         <code>Locked</code>.
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * The state of the vault lock. <code>InProgress</code> or
     * <code>Locked</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param state The state of the vault lock. <code>InProgress</code> or
     *         <code>Locked</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetVaultLockResult withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * The UTC date and time at which the lock ID expires. This value can be
     * <code>null</code> if the vault lock is in a <code>Locked</code> state.
     *
     * @return The UTC date and time at which the lock ID expires. This value can be
     *         <code>null</code> if the vault lock is in a <code>Locked</code> state.
     */
    public String getExpirationDate() {
        return expirationDate;
    }
    
    /**
     * The UTC date and time at which the lock ID expires. This value can be
     * <code>null</code> if the vault lock is in a <code>Locked</code> state.
     *
     * @param expirationDate The UTC date and time at which the lock ID expires. This value can be
     *         <code>null</code> if the vault lock is in a <code>Locked</code> state.
     */
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
    
    /**
     * The UTC date and time at which the lock ID expires. This value can be
     * <code>null</code> if the vault lock is in a <code>Locked</code> state.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param expirationDate The UTC date and time at which the lock ID expires. This value can be
     *         <code>null</code> if the vault lock is in a <code>Locked</code> state.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetVaultLockResult withExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    /**
     * The UTC date and time at which the vault lock was put into the
     * <code>InProgress</code> state.
     *
     * @return The UTC date and time at which the vault lock was put into the
     *         <code>InProgress</code> state.
     */
    public String getCreationDate() {
        return creationDate;
    }
    
    /**
     * The UTC date and time at which the vault lock was put into the
     * <code>InProgress</code> state.
     *
     * @param creationDate The UTC date and time at which the vault lock was put into the
     *         <code>InProgress</code> state.
     */
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
    
    /**
     * The UTC date and time at which the vault lock was put into the
     * <code>InProgress</code> state.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param creationDate The UTC date and time at which the vault lock was put into the
     *         <code>InProgress</code> state.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetVaultLockResult withCreationDate(String creationDate) {
        this.creationDate = creationDate;
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
        if (getPolicy() != null) sb.append("Policy: " + getPolicy() + ",");
        if (getState() != null) sb.append("State: " + getState() + ",");
        if (getExpirationDate() != null) sb.append("ExpirationDate: " + getExpirationDate() + ",");
        if (getCreationDate() != null) sb.append("CreationDate: " + getCreationDate() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode()); 
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode()); 
        hashCode = prime * hashCode + ((getExpirationDate() == null) ? 0 : getExpirationDate().hashCode()); 
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetVaultLockResult == false) return false;
        GetVaultLockResult other = (GetVaultLockResult)obj;
        
        if (other.getPolicy() == null ^ this.getPolicy() == null) return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false) return false; 
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        if (other.getExpirationDate() == null ^ this.getExpirationDate() == null) return false;
        if (other.getExpirationDate() != null && other.getExpirationDate().equals(this.getExpirationDate()) == false) return false; 
        if (other.getCreationDate() == null ^ this.getCreationDate() == null) return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false) return false; 
        return true;
    }
    
    @Override
    public GetVaultLockResult clone() {
        try {
            return (GetVaultLockResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    