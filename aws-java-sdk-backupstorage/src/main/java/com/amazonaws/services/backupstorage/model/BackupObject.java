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
 * Object
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/BackupObject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BackupObject implements Serializable, Cloneable, StructuredPojo {

    /** Object name */
    private String name;
    /** Number of chunks in object */
    private Long chunksCount;
    /** Metadata string associated with the Object */
    private String metadataString;
    /** Object checksum */
    private String objectChecksum;
    /** Checksum algorithm */
    private String objectChecksumAlgorithm;
    /** Object token */
    private String objectToken;

    /**
     * Object name
     * 
     * @param name
     *        Object name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Object name
     * 
     * @return Object name
     */

    public String getName() {
        return this.name;
    }

    /**
     * Object name
     * 
     * @param name
     *        Object name
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupObject withName(String name) {
        setName(name);
        return this;
    }

    /**
     * Number of chunks in object
     * 
     * @param chunksCount
     *        Number of chunks in object
     */

    public void setChunksCount(Long chunksCount) {
        this.chunksCount = chunksCount;
    }

    /**
     * Number of chunks in object
     * 
     * @return Number of chunks in object
     */

    public Long getChunksCount() {
        return this.chunksCount;
    }

    /**
     * Number of chunks in object
     * 
     * @param chunksCount
     *        Number of chunks in object
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupObject withChunksCount(Long chunksCount) {
        setChunksCount(chunksCount);
        return this;
    }

    /**
     * Metadata string associated with the Object
     * 
     * @param metadataString
     *        Metadata string associated with the Object
     */

    public void setMetadataString(String metadataString) {
        this.metadataString = metadataString;
    }

    /**
     * Metadata string associated with the Object
     * 
     * @return Metadata string associated with the Object
     */

    public String getMetadataString() {
        return this.metadataString;
    }

    /**
     * Metadata string associated with the Object
     * 
     * @param metadataString
     *        Metadata string associated with the Object
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupObject withMetadataString(String metadataString) {
        setMetadataString(metadataString);
        return this;
    }

    /**
     * Object checksum
     * 
     * @param objectChecksum
     *        Object checksum
     */

    public void setObjectChecksum(String objectChecksum) {
        this.objectChecksum = objectChecksum;
    }

    /**
     * Object checksum
     * 
     * @return Object checksum
     */

    public String getObjectChecksum() {
        return this.objectChecksum;
    }

    /**
     * Object checksum
     * 
     * @param objectChecksum
     *        Object checksum
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupObject withObjectChecksum(String objectChecksum) {
        setObjectChecksum(objectChecksum);
        return this;
    }

    /**
     * Checksum algorithm
     * 
     * @param objectChecksumAlgorithm
     *        Checksum algorithm
     * @see SummaryChecksumAlgorithm
     */

    public void setObjectChecksumAlgorithm(String objectChecksumAlgorithm) {
        this.objectChecksumAlgorithm = objectChecksumAlgorithm;
    }

    /**
     * Checksum algorithm
     * 
     * @return Checksum algorithm
     * @see SummaryChecksumAlgorithm
     */

    public String getObjectChecksumAlgorithm() {
        return this.objectChecksumAlgorithm;
    }

    /**
     * Checksum algorithm
     * 
     * @param objectChecksumAlgorithm
     *        Checksum algorithm
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SummaryChecksumAlgorithm
     */

    public BackupObject withObjectChecksumAlgorithm(String objectChecksumAlgorithm) {
        setObjectChecksumAlgorithm(objectChecksumAlgorithm);
        return this;
    }

    /**
     * Checksum algorithm
     * 
     * @param objectChecksumAlgorithm
     *        Checksum algorithm
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SummaryChecksumAlgorithm
     */

    public BackupObject withObjectChecksumAlgorithm(SummaryChecksumAlgorithm objectChecksumAlgorithm) {
        this.objectChecksumAlgorithm = objectChecksumAlgorithm.toString();
        return this;
    }

    /**
     * Object token
     * 
     * @param objectToken
     *        Object token
     */

    public void setObjectToken(String objectToken) {
        this.objectToken = objectToken;
    }

    /**
     * Object token
     * 
     * @return Object token
     */

    public String getObjectToken() {
        return this.objectToken;
    }

    /**
     * Object token
     * 
     * @param objectToken
     *        Object token
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupObject withObjectToken(String objectToken) {
        setObjectToken(objectToken);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getChunksCount() != null)
            sb.append("ChunksCount: ").append(getChunksCount()).append(",");
        if (getMetadataString() != null)
            sb.append("MetadataString: ").append(getMetadataString()).append(",");
        if (getObjectChecksum() != null)
            sb.append("ObjectChecksum: ").append(getObjectChecksum()).append(",");
        if (getObjectChecksumAlgorithm() != null)
            sb.append("ObjectChecksumAlgorithm: ").append(getObjectChecksumAlgorithm()).append(",");
        if (getObjectToken() != null)
            sb.append("ObjectToken: ").append(getObjectToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BackupObject == false)
            return false;
        BackupObject other = (BackupObject) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getChunksCount() == null ^ this.getChunksCount() == null)
            return false;
        if (other.getChunksCount() != null && other.getChunksCount().equals(this.getChunksCount()) == false)
            return false;
        if (other.getMetadataString() == null ^ this.getMetadataString() == null)
            return false;
        if (other.getMetadataString() != null && other.getMetadataString().equals(this.getMetadataString()) == false)
            return false;
        if (other.getObjectChecksum() == null ^ this.getObjectChecksum() == null)
            return false;
        if (other.getObjectChecksum() != null && other.getObjectChecksum().equals(this.getObjectChecksum()) == false)
            return false;
        if (other.getObjectChecksumAlgorithm() == null ^ this.getObjectChecksumAlgorithm() == null)
            return false;
        if (other.getObjectChecksumAlgorithm() != null && other.getObjectChecksumAlgorithm().equals(this.getObjectChecksumAlgorithm()) == false)
            return false;
        if (other.getObjectToken() == null ^ this.getObjectToken() == null)
            return false;
        if (other.getObjectToken() != null && other.getObjectToken().equals(this.getObjectToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getChunksCount() == null) ? 0 : getChunksCount().hashCode());
        hashCode = prime * hashCode + ((getMetadataString() == null) ? 0 : getMetadataString().hashCode());
        hashCode = prime * hashCode + ((getObjectChecksum() == null) ? 0 : getObjectChecksum().hashCode());
        hashCode = prime * hashCode + ((getObjectChecksumAlgorithm() == null) ? 0 : getObjectChecksumAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getObjectToken() == null) ? 0 : getObjectToken().hashCode());
        return hashCode;
    }

    @Override
    public BackupObject clone() {
        try {
            return (BackupObject) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backupstorage.model.transform.BackupObjectMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
