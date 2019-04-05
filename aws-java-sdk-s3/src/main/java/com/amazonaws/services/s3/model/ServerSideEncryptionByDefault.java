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
 * Describes the default server-side encryption to apply to new objects in the bucket. If Put Object request does not specify any
 * server-side encryption, this default encryption will be applied.
 *
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3-2006-03-01/ServerSideEncryptionByDefault" target="_top">AWS API
 * Documentation</a>
 */
public class ServerSideEncryptionByDefault implements Serializable, Cloneable {

    private String sseAlgorithm;
    private String kmsMasterKeyID;

    /**
     * @return Server-side encryption algorithm to use for the default encryption.
     */
    public String getSSEAlgorithm() {
        return sseAlgorithm;
    }

    /**
     * Sets the server-side encryption algorithm to use for the default encryption.
     *
     * @param sseAlgorithm SSE algorithm to use.
     */
    public void setSSEAlgorithm(String sseAlgorithm) {
        this.sseAlgorithm = sseAlgorithm;
    }

    /**
     * Sets the server-side encryption algorithm to use for the default encryption.
     *
     * @param sseAlgorithm SSE algorithm to use.
     * @return This object for method chaining.
     */
    public ServerSideEncryptionByDefault withSSEAlgorithm(String sseAlgorithm) {
        setSSEAlgorithm(sseAlgorithm);
        return this;
    }

    /**
     * Sets the server-side encryption algorithm to use for the default encryption.
     *
     * @param sseAlgorithm SSE algorithm to use.
     * @return This object for method chaining.
     */
    public ServerSideEncryptionByDefault withSSEAlgorithm(SSEAlgorithm sseAlgorithm) {
        setSSEAlgorithm(sseAlgorithm == null ? null : sseAlgorithm.toString());
        return this;
    }

    /**
     * @return KMS master key ID to use for the default encryption. This parameter is allowed if SSEAlgorithm is aws:kms.
     */
    public String getKMSMasterKeyID() {
        return kmsMasterKeyID;
    }

    /**
     * Sets the KMS master key ID to use for the default encryption. This parameter is allowed if SSEAlgorithm is aws:kms.
     *
     * @param kmsMasterKeyID KMS key to use.
     */
    public void setKMSMasterKeyID(String kmsMasterKeyID) {
        this.kmsMasterKeyID = kmsMasterKeyID;
    }

    /**
     * Sets the KMS master key ID to use for the default encryption. This parameter is allowed if SSEAlgorithm is aws:kms.
     *
     * @param kmsMasterKeyID KMS key to use.
     * @return This object for method chaining.
     */
    public ServerSideEncryptionByDefault withKMSMasterKeyID(String kmsMasterKeyID) {
        setKMSMasterKeyID(kmsMasterKeyID);
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
        if (getSSEAlgorithm() != null) {
            sb.append("SSEAlgorithm: ").append(getSSEAlgorithm()).append(",");
        }
        if (getKMSMasterKeyID() != null) {
            sb.append("KMSMasterKeyID: ").append(getKMSMasterKeyID()).append(",");
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

        if (obj instanceof ServerSideEncryptionByDefault == false) {
            return false;
        }
        ServerSideEncryptionByDefault other = (ServerSideEncryptionByDefault) obj;
        if (other.getSSEAlgorithm() == null ^ this.getSSEAlgorithm() == null) {
            return false;
        }
        if (other.getSSEAlgorithm() != null
            && other.getSSEAlgorithm().equals(this.getSSEAlgorithm()) == false) {
            return false;
        }
        if (other.getKMSMasterKeyID() == null ^ this.getKMSMasterKeyID() == null) {
            return false;
        }
        if (other.getKMSMasterKeyID() != null
            && other.getKMSMasterKeyID().equals(this.getKMSMasterKeyID()) == false) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSSEAlgorithm() == null) ? 0 : getSSEAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getKMSMasterKeyID() == null) ? 0 : getKMSMasterKeyID().hashCode());
        return hashCode;
    }

    @Override
    public ServerSideEncryptionByDefault clone() {
        try {
            return (ServerSideEncryptionByDefault) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
