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
public class InitiateVaultLockResult implements Serializable, Cloneable {

    /**
     * The lock ID, which is used to complete the vault locking process.
     */
    private String lockId;

    /**
     * The lock ID, which is used to complete the vault locking process.
     *
     * @return The lock ID, which is used to complete the vault locking process.
     */
    public String getLockId() {
        return lockId;
    }
    
    /**
     * The lock ID, which is used to complete the vault locking process.
     *
     * @param lockId The lock ID, which is used to complete the vault locking process.
     */
    public void setLockId(String lockId) {
        this.lockId = lockId;
    }
    
    /**
     * The lock ID, which is used to complete the vault locking process.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lockId The lock ID, which is used to complete the vault locking process.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InitiateVaultLockResult withLockId(String lockId) {
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
        if (getLockId() != null) sb.append("LockId: " + getLockId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLockId() == null) ? 0 : getLockId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InitiateVaultLockResult == false) return false;
        InitiateVaultLockResult other = (InitiateVaultLockResult)obj;
        
        if (other.getLockId() == null ^ this.getLockId() == null) return false;
        if (other.getLockId() != null && other.getLockId().equals(this.getLockId()) == false) return false; 
        return true;
    }
    
    @Override
    public InitiateVaultLockResult clone() {
        try {
            return (InitiateVaultLockResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    