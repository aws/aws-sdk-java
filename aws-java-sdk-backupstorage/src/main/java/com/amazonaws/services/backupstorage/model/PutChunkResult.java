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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/PutChunk" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutChunkResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** Chunk checksum */
    private String chunkChecksum;
    /** Checksum algorithm */
    private String chunkChecksumAlgorithm;

    /**
     * Chunk checksum
     * 
     * @param chunkChecksum
     *        Chunk checksum
     */

    public void setChunkChecksum(String chunkChecksum) {
        this.chunkChecksum = chunkChecksum;
    }

    /**
     * Chunk checksum
     * 
     * @return Chunk checksum
     */

    public String getChunkChecksum() {
        return this.chunkChecksum;
    }

    /**
     * Chunk checksum
     * 
     * @param chunkChecksum
     *        Chunk checksum
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutChunkResult withChunkChecksum(String chunkChecksum) {
        setChunkChecksum(chunkChecksum);
        return this;
    }

    /**
     * Checksum algorithm
     * 
     * @param chunkChecksumAlgorithm
     *        Checksum algorithm
     * @see DataChecksumAlgorithm
     */

    public void setChunkChecksumAlgorithm(String chunkChecksumAlgorithm) {
        this.chunkChecksumAlgorithm = chunkChecksumAlgorithm;
    }

    /**
     * Checksum algorithm
     * 
     * @return Checksum algorithm
     * @see DataChecksumAlgorithm
     */

    public String getChunkChecksumAlgorithm() {
        return this.chunkChecksumAlgorithm;
    }

    /**
     * Checksum algorithm
     * 
     * @param chunkChecksumAlgorithm
     *        Checksum algorithm
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataChecksumAlgorithm
     */

    public PutChunkResult withChunkChecksumAlgorithm(String chunkChecksumAlgorithm) {
        setChunkChecksumAlgorithm(chunkChecksumAlgorithm);
        return this;
    }

    /**
     * Checksum algorithm
     * 
     * @param chunkChecksumAlgorithm
     *        Checksum algorithm
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataChecksumAlgorithm
     */

    public PutChunkResult withChunkChecksumAlgorithm(DataChecksumAlgorithm chunkChecksumAlgorithm) {
        this.chunkChecksumAlgorithm = chunkChecksumAlgorithm.toString();
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
        if (getChunkChecksum() != null)
            sb.append("ChunkChecksum: ").append(getChunkChecksum()).append(",");
        if (getChunkChecksumAlgorithm() != null)
            sb.append("ChunkChecksumAlgorithm: ").append(getChunkChecksumAlgorithm());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutChunkResult == false)
            return false;
        PutChunkResult other = (PutChunkResult) obj;
        if (other.getChunkChecksum() == null ^ this.getChunkChecksum() == null)
            return false;
        if (other.getChunkChecksum() != null && other.getChunkChecksum().equals(this.getChunkChecksum()) == false)
            return false;
        if (other.getChunkChecksumAlgorithm() == null ^ this.getChunkChecksumAlgorithm() == null)
            return false;
        if (other.getChunkChecksumAlgorithm() != null && other.getChunkChecksumAlgorithm().equals(this.getChunkChecksumAlgorithm()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChunkChecksum() == null) ? 0 : getChunkChecksum().hashCode());
        hashCode = prime * hashCode + ((getChunkChecksumAlgorithm() == null) ? 0 : getChunkChecksumAlgorithm().hashCode());
        return hashCode;
    }

    @Override
    public PutChunkResult clone() {
        try {
            return (PutChunkResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
