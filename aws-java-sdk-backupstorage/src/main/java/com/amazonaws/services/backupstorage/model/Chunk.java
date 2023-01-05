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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Chunk
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/Chunk" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Chunk implements Serializable, Cloneable, StructuredPojo {

    /** Chunk index */
    private Long index;
    /** Chunk length */
    private Long length;
    /** Chunk checksum */
    private String checksum;
    /** Checksum algorithm */
    private String checksumAlgorithm;
    /** Chunk token */
    private String chunkToken;

    /**
     * Chunk index
     * 
     * @param index
     *        Chunk index
     */

    public void setIndex(Long index) {
        this.index = index;
    }

    /**
     * Chunk index
     * 
     * @return Chunk index
     */

    public Long getIndex() {
        return this.index;
    }

    /**
     * Chunk index
     * 
     * @param index
     *        Chunk index
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Chunk withIndex(Long index) {
        setIndex(index);
        return this;
    }

    /**
     * Chunk length
     * 
     * @param length
     *        Chunk length
     */

    public void setLength(Long length) {
        this.length = length;
    }

    /**
     * Chunk length
     * 
     * @return Chunk length
     */

    public Long getLength() {
        return this.length;
    }

    /**
     * Chunk length
     * 
     * @param length
     *        Chunk length
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Chunk withLength(Long length) {
        setLength(length);
        return this;
    }

    /**
     * Chunk checksum
     * 
     * @param checksum
     *        Chunk checksum
     */

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    /**
     * Chunk checksum
     * 
     * @return Chunk checksum
     */

    public String getChecksum() {
        return this.checksum;
    }

    /**
     * Chunk checksum
     * 
     * @param checksum
     *        Chunk checksum
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Chunk withChecksum(String checksum) {
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

    public Chunk withChecksumAlgorithm(String checksumAlgorithm) {
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

    public Chunk withChecksumAlgorithm(DataChecksumAlgorithm checksumAlgorithm) {
        this.checksumAlgorithm = checksumAlgorithm.toString();
        return this;
    }

    /**
     * Chunk token
     * 
     * @param chunkToken
     *        Chunk token
     */

    public void setChunkToken(String chunkToken) {
        this.chunkToken = chunkToken;
    }

    /**
     * Chunk token
     * 
     * @return Chunk token
     */

    public String getChunkToken() {
        return this.chunkToken;
    }

    /**
     * Chunk token
     * 
     * @param chunkToken
     *        Chunk token
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Chunk withChunkToken(String chunkToken) {
        setChunkToken(chunkToken);
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
        if (getIndex() != null)
            sb.append("Index: ").append(getIndex()).append(",");
        if (getLength() != null)
            sb.append("Length: ").append(getLength()).append(",");
        if (getChecksum() != null)
            sb.append("Checksum: ").append(getChecksum()).append(",");
        if (getChecksumAlgorithm() != null)
            sb.append("ChecksumAlgorithm: ").append(getChecksumAlgorithm()).append(",");
        if (getChunkToken() != null)
            sb.append("ChunkToken: ").append(getChunkToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Chunk == false)
            return false;
        Chunk other = (Chunk) obj;
        if (other.getIndex() == null ^ this.getIndex() == null)
            return false;
        if (other.getIndex() != null && other.getIndex().equals(this.getIndex()) == false)
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
        if (other.getChunkToken() == null ^ this.getChunkToken() == null)
            return false;
        if (other.getChunkToken() != null && other.getChunkToken().equals(this.getChunkToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndex() == null) ? 0 : getIndex().hashCode());
        hashCode = prime * hashCode + ((getLength() == null) ? 0 : getLength().hashCode());
        hashCode = prime * hashCode + ((getChecksum() == null) ? 0 : getChecksum().hashCode());
        hashCode = prime * hashCode + ((getChecksumAlgorithm() == null) ? 0 : getChecksumAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getChunkToken() == null) ? 0 : getChunkToken().hashCode());
        return hashCode;
    }

    @Override
    public Chunk clone() {
        try {
            return (Chunk) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backupstorage.model.transform.ChunkMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
