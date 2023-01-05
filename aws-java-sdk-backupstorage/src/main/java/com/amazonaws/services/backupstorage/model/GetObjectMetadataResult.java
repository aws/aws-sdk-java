/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.backupstorage.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/GetObjectMetadata" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetObjectMetadataResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** Metadata string. */
    private String metadataString;
    /** Metadata blob. */
    private java.io.InputStream metadataBlob;
    /** The size of MetadataBlob. */
    private Long metadataBlobLength;
    /** MetadataBlob checksum. */
    private String metadataBlobChecksum;
    /** Checksum algorithm. */
    private String metadataBlobChecksumAlgorithm;

    /**
     * Metadata string.
     * 
     * @param metadataString
     *        Metadata string.
     */

    public void setMetadataString(String metadataString) {
        this.metadataString = metadataString;
    }

    /**
     * Metadata string.
     * 
     * @return Metadata string.
     */

    public String getMetadataString() {
        return this.metadataString;
    }

    /**
     * Metadata string.
     * 
     * @param metadataString
     *        Metadata string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetObjectMetadataResult withMetadataString(String metadataString) {
        setMetadataString(metadataString);
        return this;
    }

    /**
     * Metadata blob.
     * 
     * @param metadataBlob
     *        Metadata blob.
     */

    public void setMetadataBlob(java.io.InputStream metadataBlob) {
        this.metadataBlob = metadataBlob;
    }

    /**
     * Metadata blob.
     * 
     * @return Metadata blob.
     */

    public java.io.InputStream getMetadataBlob() {
        return this.metadataBlob;
    }

    /**
     * Metadata blob.
     * 
     * @param metadataBlob
     *        Metadata blob.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetObjectMetadataResult withMetadataBlob(java.io.InputStream metadataBlob) {
        setMetadataBlob(metadataBlob);
        return this;
    }

    /**
     * The size of MetadataBlob.
     * 
     * @param metadataBlobLength
     *        The size of MetadataBlob.
     */

    public void setMetadataBlobLength(Long metadataBlobLength) {
        this.metadataBlobLength = metadataBlobLength;
    }

    /**
     * The size of MetadataBlob.
     * 
     * @return The size of MetadataBlob.
     */

    public Long getMetadataBlobLength() {
        return this.metadataBlobLength;
    }

    /**
     * The size of MetadataBlob.
     * 
     * @param metadataBlobLength
     *        The size of MetadataBlob.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetObjectMetadataResult withMetadataBlobLength(Long metadataBlobLength) {
        setMetadataBlobLength(metadataBlobLength);
        return this;
    }

    /**
     * MetadataBlob checksum.
     * 
     * @param metadataBlobChecksum
     *        MetadataBlob checksum.
     */

    public void setMetadataBlobChecksum(String metadataBlobChecksum) {
        this.metadataBlobChecksum = metadataBlobChecksum;
    }

    /**
     * MetadataBlob checksum.
     * 
     * @return MetadataBlob checksum.
     */

    public String getMetadataBlobChecksum() {
        return this.metadataBlobChecksum;
    }

    /**
     * MetadataBlob checksum.
     * 
     * @param metadataBlobChecksum
     *        MetadataBlob checksum.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetObjectMetadataResult withMetadataBlobChecksum(String metadataBlobChecksum) {
        setMetadataBlobChecksum(metadataBlobChecksum);
        return this;
    }

    /**
     * Checksum algorithm.
     * 
     * @param metadataBlobChecksumAlgorithm
     *        Checksum algorithm.
     * @see DataChecksumAlgorithm
     */

    public void setMetadataBlobChecksumAlgorithm(String metadataBlobChecksumAlgorithm) {
        this.metadataBlobChecksumAlgorithm = metadataBlobChecksumAlgorithm;
    }

    /**
     * Checksum algorithm.
     * 
     * @return Checksum algorithm.
     * @see DataChecksumAlgorithm
     */

    public String getMetadataBlobChecksumAlgorithm() {
        return this.metadataBlobChecksumAlgorithm;
    }

    /**
     * Checksum algorithm.
     * 
     * @param metadataBlobChecksumAlgorithm
     *        Checksum algorithm.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataChecksumAlgorithm
     */

    public GetObjectMetadataResult withMetadataBlobChecksumAlgorithm(String metadataBlobChecksumAlgorithm) {
        setMetadataBlobChecksumAlgorithm(metadataBlobChecksumAlgorithm);
        return this;
    }

    /**
     * Checksum algorithm.
     * 
     * @param metadataBlobChecksumAlgorithm
     *        Checksum algorithm.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataChecksumAlgorithm
     */

    public GetObjectMetadataResult withMetadataBlobChecksumAlgorithm(DataChecksumAlgorithm metadataBlobChecksumAlgorithm) {
        this.metadataBlobChecksumAlgorithm = metadataBlobChecksumAlgorithm.toString();
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
        if (getMetadataString() != null)
            sb.append("MetadataString: ").append(getMetadataString()).append(",");
        if (getMetadataBlob() != null)
            sb.append("MetadataBlob: ").append(getMetadataBlob()).append(",");
        if (getMetadataBlobLength() != null)
            sb.append("MetadataBlobLength: ").append(getMetadataBlobLength()).append(",");
        if (getMetadataBlobChecksum() != null)
            sb.append("MetadataBlobChecksum: ").append(getMetadataBlobChecksum()).append(",");
        if (getMetadataBlobChecksumAlgorithm() != null)
            sb.append("MetadataBlobChecksumAlgorithm: ").append(getMetadataBlobChecksumAlgorithm());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetObjectMetadataResult == false)
            return false;
        GetObjectMetadataResult other = (GetObjectMetadataResult) obj;
        if (other.getMetadataString() == null ^ this.getMetadataString() == null)
            return false;
        if (other.getMetadataString() != null && other.getMetadataString().equals(this.getMetadataString()) == false)
            return false;
        if (other.getMetadataBlob() == null ^ this.getMetadataBlob() == null)
            return false;
        if (other.getMetadataBlob() != null && other.getMetadataBlob().equals(this.getMetadataBlob()) == false)
            return false;
        if (other.getMetadataBlobLength() == null ^ this.getMetadataBlobLength() == null)
            return false;
        if (other.getMetadataBlobLength() != null && other.getMetadataBlobLength().equals(this.getMetadataBlobLength()) == false)
            return false;
        if (other.getMetadataBlobChecksum() == null ^ this.getMetadataBlobChecksum() == null)
            return false;
        if (other.getMetadataBlobChecksum() != null && other.getMetadataBlobChecksum().equals(this.getMetadataBlobChecksum()) == false)
            return false;
        if (other.getMetadataBlobChecksumAlgorithm() == null ^ this.getMetadataBlobChecksumAlgorithm() == null)
            return false;
        if (other.getMetadataBlobChecksumAlgorithm() != null
                && other.getMetadataBlobChecksumAlgorithm().equals(this.getMetadataBlobChecksumAlgorithm()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetadataString() == null) ? 0 : getMetadataString().hashCode());
        hashCode = prime * hashCode + ((getMetadataBlob() == null) ? 0 : getMetadataBlob().hashCode());
        hashCode = prime * hashCode + ((getMetadataBlobLength() == null) ? 0 : getMetadataBlobLength().hashCode());
        hashCode = prime * hashCode + ((getMetadataBlobChecksum() == null) ? 0 : getMetadataBlobChecksum().hashCode());
        hashCode = prime * hashCode + ((getMetadataBlobChecksumAlgorithm() == null) ? 0 : getMetadataBlobChecksumAlgorithm().hashCode());
        return hashCode;
    }

    @Override
    public GetObjectMetadataResult clone() {
        try {
            return (GetObjectMetadataResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
