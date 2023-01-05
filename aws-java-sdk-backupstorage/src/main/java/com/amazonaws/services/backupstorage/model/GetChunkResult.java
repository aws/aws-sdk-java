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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/GetChunk" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetChunkResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** Chunk data */
    private java.io.InputStream data;
    /** Data length */
    private Long length;
    /** Data checksum */
    private String checksum;
    /** Checksum algorithm */
    private String checksumAlgorithm;

    /**
     * Chunk data
     * 
     * @param data
     *        Chunk data
     */

    public void setData(java.io.InputStream data) {
        this.data = data;
    }

    /**
     * Chunk data
     * 
     * @return Chunk data
     */

    public java.io.InputStream getData() {
        return this.data;
    }

    /**
     * Chunk data
     * 
     * @param data
     *        Chunk data
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetChunkResult withData(java.io.InputStream data) {
        setData(data);
        return this;
    }

    /**
     * Data length
     * 
     * @param length
     *        Data length
     */

    public void setLength(Long length) {
        this.length = length;
    }

    /**
     * Data length
     * 
     * @return Data length
     */

    public Long getLength() {
        return this.length;
    }

    /**
     * Data length
     * 
     * @param length
     *        Data length
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetChunkResult withLength(Long length) {
        setLength(length);
        return this;
    }

    /**
     * Data checksum
     * 
     * @param checksum
     *        Data checksum
     */

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    /**
     * Data checksum
     * 
     * @return Data checksum
     */

    public String getChecksum() {
        return this.checksum;
    }

    /**
     * Data checksum
     * 
     * @param checksum
     *        Data checksum
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetChunkResult withChecksum(String checksum) {
        setChecksum(checksum);
        return this;
    }

    /**
     * Checksum algorithm
     * 
     * @param checksumAlgorithm
     *        Checksum algorithm
     * @see DataChecksumAlgorithm
     */

    public void setChecksumAlgorithm(String checksumAlgorithm) {
        this.checksumAlgorithm = checksumAlgorithm;
    }

    /**
     * Checksum algorithm
     * 
     * @return Checksum algorithm
     * @see DataChecksumAlgorithm
     */

    public String getChecksumAlgorithm() {
        return this.checksumAlgorithm;
    }

    /**
     * Checksum algorithm
     * 
     * @param checksumAlgorithm
     *        Checksum algorithm
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataChecksumAlgorithm
     */

    public GetChunkResult withChecksumAlgorithm(String checksumAlgorithm) {
        setChecksumAlgorithm(checksumAlgorithm);
        return this;
    }

    /**
     * Checksum algorithm
     * 
     * @param checksumAlgorithm
     *        Checksum algorithm
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataChecksumAlgorithm
     */

    public GetChunkResult withChecksumAlgorithm(DataChecksumAlgorithm checksumAlgorithm) {
        this.checksumAlgorithm = checksumAlgorithm.toString();
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
        if (getData() != null)
            sb.append("Data: ").append(getData()).append(",");
        if (getLength() != null)
            sb.append("Length: ").append(getLength()).append(",");
        if (getChecksum() != null)
            sb.append("Checksum: ").append(getChecksum()).append(",");
        if (getChecksumAlgorithm() != null)
            sb.append("ChecksumAlgorithm: ").append(getChecksumAlgorithm());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetChunkResult == false)
            return false;
        GetChunkResult other = (GetChunkResult) obj;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        if (other.getLength() == null ^ this.getLength() == null)
            return false;
        if (other.getLength() != null && other.getLength().equals(this.getLength()) == false)
            return false;
        if (other.getChecksum() == null ^ this.getChecksum() == null)
            return false;
        if (other.getChecksum() != null && other.getChecksum().equals(this.getChecksum()) == false)
            return false;
        if (other.getChecksumAlgorithm() == null ^ this.getChecksumAlgorithm() == null)
            return false;
        if (other.getChecksumAlgorithm() != null && other.getChecksumAlgorithm().equals(this.getChecksumAlgorithm()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        hashCode = prime * hashCode + ((getLength() == null) ? 0 : getLength().hashCode());
        hashCode = prime * hashCode + ((getChecksum() == null) ? 0 : getChecksum().hashCode());
        hashCode = prime * hashCode + ((getChecksumAlgorithm() == null) ? 0 : getChecksumAlgorithm().hashCode());
        return hashCode;
    }

    @Override
    public GetChunkResult clone() {
        try {
            return (GetChunkResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
