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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/PutRecord" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutRecordResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the record.
     * </p>
     */
    private String recordId;
    /**
     * <p>
     * Indicates whether server-side encryption (SSE) was enabled during this operation.
     * </p>
     */
    private Boolean encrypted;

    /**
     * <p>
     * The ID of the record.
     * </p>
     * 
     * @param recordId
     *        The ID of the record.
     */

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    /**
     * <p>
     * The ID of the record.
     * </p>
     * 
     * @return The ID of the record.
     */

    public String getRecordId() {
        return this.recordId;
    }

    /**
     * <p>
     * The ID of the record.
     * </p>
     * 
     * @param recordId
     *        The ID of the record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRecordResult withRecordId(String recordId) {
        setRecordId(recordId);
        return this;
    }

    /**
     * <p>
     * Indicates whether server-side encryption (SSE) was enabled during this operation.
     * </p>
     * 
     * @param encrypted
     *        Indicates whether server-side encryption (SSE) was enabled during this operation.
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Indicates whether server-side encryption (SSE) was enabled during this operation.
     * </p>
     * 
     * @return Indicates whether server-side encryption (SSE) was enabled during this operation.
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * Indicates whether server-side encryption (SSE) was enabled during this operation.
     * </p>
     * 
     * @param encrypted
     *        Indicates whether server-side encryption (SSE) was enabled during this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRecordResult withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * Indicates whether server-side encryption (SSE) was enabled during this operation.
     * </p>
     * 
     * @return Indicates whether server-side encryption (SSE) was enabled during this operation.
     */

    public Boolean isEncrypted() {
        return this.encrypted;
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
        if (getRecordId() != null)
            sb.append("RecordId: ").append(getRecordId()).append(",");
        if (getEncrypted() != null)
            sb.append("Encrypted: ").append(getEncrypted());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutRecordResult == false)
            return false;
        PutRecordResult other = (PutRecordResult) obj;
        if (other.getRecordId() == null ^ this.getRecordId() == null)
            return false;
        if (other.getRecordId() != null && other.getRecordId().equals(this.getRecordId()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecordId() == null) ? 0 : getRecordId().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        return hashCode;
    }

    @Override
    public PutRecordResult clone() {
        try {
            return (PutRecordResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
