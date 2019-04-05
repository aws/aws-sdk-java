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
package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * Container for information regarding encryption based configuration for replicas.
 *
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3-2006-03-01/EncryptionConfiguration" target="_top">AWS API
 * Documentation</a>
 */
public class EncryptionConfiguration implements Serializable, Cloneable {

    private String replicaKmsKeyID;

    /**
     * @return The id of the KMS key used to encrypt the replica object
     */
    public String getReplicaKmsKeyID() {
        return replicaKmsKeyID;
    }

    /**
     * Sets the id of the KMS key used to encrypt the replica object
     *
     * @param replicaKmsKeyID New KMS key id.
     */
    public void setReplicaKmsKeyID(String replicaKmsKeyID) {
        this.replicaKmsKeyID = replicaKmsKeyID;
    }

    /**
     * Sets the id of the KMS key used to encrypt the replica object
     *
     * @param replicaKmsKeyID New KMS key id.
     * @return This object for method chaining.
     */
    public EncryptionConfiguration withReplicaKmsKeyID(String replicaKmsKeyID) {
        setReplicaKmsKeyID(replicaKmsKeyID);
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
        if (getReplicaKmsKeyID() != null) {
            sb.append("ReplicaKmsKeyID: ").append(getReplicaKmsKeyID()).append(",");
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

        if (obj instanceof EncryptionConfiguration == false) {
            return false;
        }
        EncryptionConfiguration other = (EncryptionConfiguration) obj;
        if (other.getReplicaKmsKeyID() == null ^ this.getReplicaKmsKeyID() == null) {
            return false;
        }
        if (other.getReplicaKmsKeyID() != null && other.getReplicaKmsKeyID().equals(this.getReplicaKmsKeyID()) == false) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicaKmsKeyID() == null) ? 0 : getReplicaKmsKeyID().hashCode());
        return hashCode;
    }

    @Override
    public EncryptionConfiguration clone() {
        try {
            return (EncryptionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
