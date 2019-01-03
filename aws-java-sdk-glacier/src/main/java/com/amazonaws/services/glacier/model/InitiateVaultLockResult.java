/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.glacier.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the Amazon Glacier response to your request.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InitiateVaultLockResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The lock ID, which is used to complete the vault locking process.
     * </p>
     */
    private String lockId;

    /**
     * <p>
     * The lock ID, which is used to complete the vault locking process.
     * </p>
     * 
     * @param lockId
     *        The lock ID, which is used to complete the vault locking process.
     */

    public void setLockId(String lockId) {
        this.lockId = lockId;
    }

    /**
     * <p>
     * The lock ID, which is used to complete the vault locking process.
     * </p>
     * 
     * @return The lock ID, which is used to complete the vault locking process.
     */

    public String getLockId() {
        return this.lockId;
    }

    /**
     * <p>
     * The lock ID, which is used to complete the vault locking process.
     * </p>
     * 
     * @param lockId
     *        The lock ID, which is used to complete the vault locking process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InitiateVaultLockResult withLockId(String lockId) {
        setLockId(lockId);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLockId() != null)
            sb.append("LockId: ").append(getLockId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InitiateVaultLockResult == false)
            return false;
        InitiateVaultLockResult other = (InitiateVaultLockResult) obj;
        if (other.getLockId() == null ^ this.getLockId() == null)
            return false;
        if (other.getLockId() != null && other.getLockId().equals(this.getLockId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLockId() == null) ? 0 : getLockId().hashCode());
        return hashCode;
    }

    @Override
    public InitiateVaultLockResult clone() {
        try {
            return (InitiateVaultLockResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
