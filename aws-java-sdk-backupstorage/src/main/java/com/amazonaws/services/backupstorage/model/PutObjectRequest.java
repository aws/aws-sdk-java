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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.auth.SignerTypeAware;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/PutObject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutObjectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable, SignerTypeAware {

    /** Backup job Id for the in-progress backup. */
    private String backupJobId;
    /** The name of the Object to be uploaded. */
    private String objectName;
    /** Store user defined metadata like backup checksum, disk ids, restore metadata etc. */
    private String metadataString;
    /** Inline chunk data to be uploaded. */
    private java.io.InputStream inlineChunk;
    /** Length of the inline chunk data. */
    private Long inlineChunkLength;
    /** Inline chunk checksum */
    private String inlineChunkChecksum;
    /** Inline chunk checksum algorithm */
    private String inlineChunkChecksumAlgorithm;
    /** object checksum */
    private String objectChecksum;
    /** object checksum algorithm */
    private String objectChecksumAlgorithm;
    /** Throw an exception if Object name is already exist. */
    private Boolean throwOnDuplicate;

    /**
     * Backup job Id for the in-progress backup.
     * 
     * @param backupJobId
     *        Backup job Id for the in-progress backup.
     */

    public void setBackupJobId(String backupJobId) {
        this.backupJobId = backupJobId;
    }

    /**
     * Backup job Id for the in-progress backup.
     * 
     * @return Backup job Id for the in-progress backup.
     */

    public String getBackupJobId() {
        return this.backupJobId;
    }

    /**
     * Backup job Id for the in-progress backup.
     * 
     * @param backupJobId
     *        Backup job Id for the in-progress backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutObjectRequest withBackupJobId(String backupJobId) {
        setBackupJobId(backupJobId);
        return this;
    }

    /**
     * The name of the Object to be uploaded.
     * 
     * @param objectName
     *        The name of the Object to be uploaded.
     */

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    /**
     * The name of the Object to be uploaded.
     * 
     * @return The name of the Object to be uploaded.
     */

    public String getObjectName() {
        return this.objectName;
    }

    /**
     * The name of the Object to be uploaded.
     * 
     * @param objectName
     *        The name of the Object to be uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutObjectRequest withObjectName(String objectName) {
        setObjectName(objectName);
        return this;
    }

    /**
     * Store user defined metadata like backup checksum, disk ids, restore metadata etc.
     * 
     * @param metadataString
     *        Store user defined metadata like backup checksum, disk ids, restore metadata etc.
     */

    public void setMetadataString(String metadataString) {
        this.metadataString = metadataString;
    }

    /**
     * Store user defined metadata like backup checksum, disk ids, restore metadata etc.
     * 
     * @return Store user defined metadata like backup checksum, disk ids, restore metadata etc.
     */

    public String getMetadataString() {
        return this.metadataString;
    }

    /**
     * Store user defined metadata like backup checksum, disk ids, restore metadata etc.
     * 
     * @param metadataString
     *        Store user defined metadata like backup checksum, disk ids, restore metadata etc.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutObjectRequest withMetadataString(String metadataString) {
        setMetadataString(metadataString);
        return this;
    }

    /**
     * Inline chunk data to be uploaded.
     * 
     * @param inlineChunk
     *        Inline chunk data to be uploaded.
     */

    public void setInlineChunk(java.io.InputStream inlineChunk) {
        this.inlineChunk = inlineChunk;
    }

    /**
     * Inline chunk data to be uploaded.
     * 
     * @return Inline chunk data to be uploaded.
     */

    public java.io.InputStream getInlineChunk() {
        return this.inlineChunk;
    }

    /**
     * Inline chunk data to be uploaded.
     * 
     * @param inlineChunk
     *        Inline chunk data to be uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutObjectRequest withInlineChunk(java.io.InputStream inlineChunk) {
        setInlineChunk(inlineChunk);
        return this;
    }

    /**
     * Length of the inline chunk data.
     * 
     * @param inlineChunkLength
     *        Length of the inline chunk data.
     */

    public void setInlineChunkLength(Long inlineChunkLength) {
        this.inlineChunkLength = inlineChunkLength;
    }

    /**
     * Length of the inline chunk data.
     * 
     * @return Length of the inline chunk data.
     */

    public Long getInlineChunkLength() {
        return this.inlineChunkLength;
    }

    /**
     * Length of the inline chunk data.
     * 
     * @param inlineChunkLength
     *        Length of the inline chunk data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutObjectRequest withInlineChunkLength(Long inlineChunkLength) {
        setInlineChunkLength(inlineChunkLength);
        return this;
    }

    /**
     * Inline chunk checksum
     * 
     * @param inlineChunkChecksum
     *        Inline chunk checksum
     */

    public void setInlineChunkChecksum(String inlineChunkChecksum) {
        this.inlineChunkChecksum = inlineChunkChecksum;
    }

    /**
     * Inline chunk checksum
     * 
     * @return Inline chunk checksum
     */

    public String getInlineChunkChecksum() {
        return this.inlineChunkChecksum;
    }

    /**
     * Inline chunk checksum
     * 
     * @param inlineChunkChecksum
     *        Inline chunk checksum
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutObjectRequest withInlineChunkChecksum(String inlineChunkChecksum) {
        setInlineChunkChecksum(inlineChunkChecksum);
        return this;
    }

    /**
     * Inline chunk checksum algorithm
     * 
     * @param inlineChunkChecksumAlgorithm
     *        Inline chunk checksum algorithm
     */

    public void setInlineChunkChecksumAlgorithm(String inlineChunkChecksumAlgorithm) {
        this.inlineChunkChecksumAlgorithm = inlineChunkChecksumAlgorithm;
    }

    /**
     * Inline chunk checksum algorithm
     * 
     * @return Inline chunk checksum algorithm
     */

    public String getInlineChunkChecksumAlgorithm() {
        return this.inlineChunkChecksumAlgorithm;
    }

    /**
     * Inline chunk checksum algorithm
     * 
     * @param inlineChunkChecksumAlgorithm
     *        Inline chunk checksum algorithm
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutObjectRequest withInlineChunkChecksumAlgorithm(String inlineChunkChecksumAlgorithm) {
        setInlineChunkChecksumAlgorithm(inlineChunkChecksumAlgorithm);
        return this;
    }

    /**
     * object checksum
     * 
     * @param objectChecksum
     *        object checksum
     */

    public void setObjectChecksum(String objectChecksum) {
        this.objectChecksum = objectChecksum;
    }

    /**
     * object checksum
     * 
     * @return object checksum
     */

    public String getObjectChecksum() {
        return this.objectChecksum;
    }

    /**
     * object checksum
     * 
     * @param objectChecksum
     *        object checksum
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutObjectRequest withObjectChecksum(String objectChecksum) {
        setObjectChecksum(objectChecksum);
        return this;
    }

    /**
     * object checksum algorithm
     * 
     * @param objectChecksumAlgorithm
     *        object checksum algorithm
     * @see SummaryChecksumAlgorithm
     */

    public void setObjectChecksumAlgorithm(String objectChecksumAlgorithm) {
        this.objectChecksumAlgorithm = objectChecksumAlgorithm;
    }

    /**
     * object checksum algorithm
     * 
     * @return object checksum algorithm
     * @see SummaryChecksumAlgorithm
     */

    public String getObjectChecksumAlgorithm() {
        return this.objectChecksumAlgorithm;
    }

    /**
     * object checksum algorithm
     * 
     * @param objectChecksumAlgorithm
     *        object checksum algorithm
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SummaryChecksumAlgorithm
     */

    public PutObjectRequest withObjectChecksumAlgorithm(String objectChecksumAlgorithm) {
        setObjectChecksumAlgorithm(objectChecksumAlgorithm);
        return this;
    }

    /**
     * object checksum algorithm
     * 
     * @param objectChecksumAlgorithm
     *        object checksum algorithm
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SummaryChecksumAlgorithm
     */

    public PutObjectRequest withObjectChecksumAlgorithm(SummaryChecksumAlgorithm objectChecksumAlgorithm) {
        this.objectChecksumAlgorithm = objectChecksumAlgorithm.toString();
        return this;
    }

    /**
     * Throw an exception if Object name is already exist.
     * 
     * @param throwOnDuplicate
     *        Throw an exception if Object name is already exist.
     */

    public void setThrowOnDuplicate(Boolean throwOnDuplicate) {
        this.throwOnDuplicate = throwOnDuplicate;
    }

    /**
     * Throw an exception if Object name is already exist.
     * 
     * @return Throw an exception if Object name is already exist.
     */

    public Boolean getThrowOnDuplicate() {
        return this.throwOnDuplicate;
    }

    /**
     * Throw an exception if Object name is already exist.
     * 
     * @param throwOnDuplicate
     *        Throw an exception if Object name is already exist.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutObjectRequest withThrowOnDuplicate(Boolean throwOnDuplicate) {
        setThrowOnDuplicate(throwOnDuplicate);
        return this;
    }

    /**
     * Throw an exception if Object name is already exist.
     * 
     * @return Throw an exception if Object name is already exist.
     */

    public Boolean isThrowOnDuplicate() {
        return this.throwOnDuplicate;
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
        if (getBackupJobId() != null)
            sb.append("BackupJobId: ").append(getBackupJobId()).append(",");
        if (getObjectName() != null)
            sb.append("ObjectName: ").append(getObjectName()).append(",");
        if (getMetadataString() != null)
            sb.append("MetadataString: ").append(getMetadataString()).append(",");
        if (getInlineChunk() != null)
            sb.append("InlineChunk: ").append(getInlineChunk()).append(",");
        if (getInlineChunkLength() != null)
            sb.append("InlineChunkLength: ").append(getInlineChunkLength()).append(",");
        if (getInlineChunkChecksum() != null)
            sb.append("InlineChunkChecksum: ").append(getInlineChunkChecksum()).append(",");
        if (getInlineChunkChecksumAlgorithm() != null)
            sb.append("InlineChunkChecksumAlgorithm: ").append(getInlineChunkChecksumAlgorithm()).append(",");
        if (getObjectChecksum() != null)
            sb.append("ObjectChecksum: ").append(getObjectChecksum()).append(",");
        if (getObjectChecksumAlgorithm() != null)
            sb.append("ObjectChecksumAlgorithm: ").append(getObjectChecksumAlgorithm()).append(",");
        if (getThrowOnDuplicate() != null)
            sb.append("ThrowOnDuplicate: ").append(getThrowOnDuplicate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutObjectRequest == false)
            return false;
        PutObjectRequest other = (PutObjectRequest) obj;
        if (other.getBackupJobId() == null ^ this.getBackupJobId() == null)
            return false;
        if (other.getBackupJobId() != null && other.getBackupJobId().equals(this.getBackupJobId()) == false)
            return false;
        if (other.getObjectName() == null ^ this.getObjectName() == null)
            return false;
        if (other.getObjectName() != null && other.getObjectName().equals(this.getObjectName()) == false)
            return false;
        if (other.getMetadataString() == null ^ this.getMetadataString() == null)
            return false;
        if (other.getMetadataString() != null && other.getMetadataString().equals(this.getMetadataString()) == false)
            return false;
        if (other.getInlineChunk() == null ^ this.getInlineChunk() == null)
            return false;
        if (other.getInlineChunk() != null && other.getInlineChunk().equals(this.getInlineChunk()) == false)
            return false;
        if (other.getInlineChunkLength() == null ^ this.getInlineChunkLength() == null)
            return false;
        if (other.getInlineChunkLength() != null && other.getInlineChunkLength().equals(this.getInlineChunkLength()) == false)
            return false;
        if (other.getInlineChunkChecksum() == null ^ this.getInlineChunkChecksum() == null)
            return false;
        if (other.getInlineChunkChecksum() != null && other.getInlineChunkChecksum().equals(this.getInlineChunkChecksum()) == false)
            return false;
        if (other.getInlineChunkChecksumAlgorithm() == null ^ this.getInlineChunkChecksumAlgorithm() == null)
            return false;
        if (other.getInlineChunkChecksumAlgorithm() != null && other.getInlineChunkChecksumAlgorithm().equals(this.getInlineChunkChecksumAlgorithm()) == false)
            return false;
        if (other.getObjectChecksum() == null ^ this.getObjectChecksum() == null)
            return false;
        if (other.getObjectChecksum() != null && other.getObjectChecksum().equals(this.getObjectChecksum()) == false)
            return false;
        if (other.getObjectChecksumAlgorithm() == null ^ this.getObjectChecksumAlgorithm() == null)
            return false;
        if (other.getObjectChecksumAlgorithm() != null && other.getObjectChecksumAlgorithm().equals(this.getObjectChecksumAlgorithm()) == false)
            return false;
        if (other.getThrowOnDuplicate() == null ^ this.getThrowOnDuplicate() == null)
            return false;
        if (other.getThrowOnDuplicate() != null && other.getThrowOnDuplicate().equals(this.getThrowOnDuplicate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupJobId() == null) ? 0 : getBackupJobId().hashCode());
        hashCode = prime * hashCode + ((getObjectName() == null) ? 0 : getObjectName().hashCode());
        hashCode = prime * hashCode + ((getMetadataString() == null) ? 0 : getMetadataString().hashCode());
        hashCode = prime * hashCode + ((getInlineChunk() == null) ? 0 : getInlineChunk().hashCode());
        hashCode = prime * hashCode + ((getInlineChunkLength() == null) ? 0 : getInlineChunkLength().hashCode());
        hashCode = prime * hashCode + ((getInlineChunkChecksum() == null) ? 0 : getInlineChunkChecksum().hashCode());
        hashCode = prime * hashCode + ((getInlineChunkChecksumAlgorithm() == null) ? 0 : getInlineChunkChecksumAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getObjectChecksum() == null) ? 0 : getObjectChecksum().hashCode());
        hashCode = prime * hashCode + ((getObjectChecksumAlgorithm() == null) ? 0 : getObjectChecksumAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getThrowOnDuplicate() == null) ? 0 : getThrowOnDuplicate().hashCode());
        return hashCode;
    }

    @Override
    public PutObjectRequest clone() {
        return (PutObjectRequest) super.clone();
    }

    @Override
    public String getSignerType() {
        return "AWS4UnsignedPayloadSignerType";
    }

}
