/*
 * Copyright 2012-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.model.inventory;

import java.io.Serializable;

/**
 * Implementation of {@link InventoryEncryption} for server side encryption with KMS.
 *
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3-2006-03-01/SSEKMS" target="_top">AWS API
 * Documentation</a>
 */
public class ServerSideEncryptionKMS implements InventoryEncryption, Serializable, Cloneable {

    private String keyId;

    /**
     * @return KMS key id used to encrypt the inventory contents.
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * Sets the KMS key id to use to encrypt the inventory contents.
     *
     * @param keyId New KMS key id.
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * Sets the KMS key id to use to encrypt the inventory contents.
     *
     * @param keyId New KMS key id.
     * @return This object for method chaining.
     */
    public ServerSideEncryptionKMS withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getKeyId() != null) {
            sb.append("KeyId: ").append(getKeyId()).append(",");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }

        if (obj instanceof ServerSideEncryptionKMS == false) {
            return false;
        }
        ServerSideEncryptionKMS other = (ServerSideEncryptionKMS) obj;
        if (other.getKeyId() == null ^ this.getKeyId() == null) {
            return false;
        }
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        return hashCode;
    }

    @Override
    public ServerSideEncryptionKMS clone() {
        try {
            return (ServerSideEncryptionKMS) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
