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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/NotifyObjectComplete" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotifyObjectCompleteRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable, SignerTypeAware {

    /** Backup job Id for the in-progress backup */
    private String backupJobId;
    /** Upload Id for the in-progress upload */
    private String uploadId;
    /** Object checksum */
    private String objectChecksum;
    /** Checksum algorithm */
    private String objectChecksumAlgorithm;
    /** Optional metadata associated with an Object. Maximum string length is 256 bytes. */
    private String metadataString;
    /** Optional metadata associated with an Object. Maximum length is 4MB. */
    private java.io.InputStream metadataBlob;
    /** The size of MetadataBlob. */
    private Long metadataBlobLength;
    /** Checksum of MetadataBlob. */
    private String metadataBlobChecksum;
    /** Checksum algorithm. */
    private String metadataBlobChecksumAlgorithm;

    /**
     * Backup job Id for the in-progress backup
     * 
     * @param backupJobId
     *        Backup job Id for the in-progress backup
     */

    public void setBackupJobId(String backupJobId) {
        this.backupJobId = backupJobId;
    }

    /**
     * Backup job Id for the in-progress backup
     * 
     * @return Backup job Id for the in-progress backup
     */

    public String getBackupJobId() {
        return this.backupJobId;
    }

    /**
     * Backup job Id for the in-progress backup
     * 
     * @param backupJobId
     *        Backup job Id for the in-progress backup
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyObjectCompleteRequest withBackupJobId(String backupJobId) {
        setBackupJobId(backupJobId);
        return this;
    }

    /**
     * Upload Id for the in-progress upload
     * 
     * @param uploadId
     *        Upload Id for the in-progress upload
     */

    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    /**
     * Upload Id for the in-progress upload
     * 
     * @return Upload Id for the in-progress upload
     */

    public String getUploadId() {
        return this.uploadId;
    }

    /**
     * Upload Id for the in-progress upload
     * 
     * @param uploadId
     *        Upload Id for the in-progress upload
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyObjectCompleteRequest withUploadId(String uploadId) {
        setUploadId(uploadId);
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

    public NotifyObjectCompleteRequest withObjectChecksum(String objectChecksum) {
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

    public NotifyObjectCompleteRequest withObjectChecksumAlgorithm(String objectChecksumAlgorithm) {
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

    public NotifyObjectCompleteRequest withObjectChecksumAlgorithm(SummaryChecksumAlgorithm objectChecksumAlgorithm) {
        this.objectChecksumAlgorithm = objectChecksumAlgorithm.toString();
        return this;
    }

    /**
     * Optional metadata associated with an Object. Maximum string length is 256 bytes.
     * 
     * @param metadataString
     *        Optional metadata associated with an Object. Maximum string length is 256 bytes.
     */

    public void setMetadataString(String metadataString) {
        this.metadataString = metadataString;
    }

    /**
     * Optional metadata associated with an Object. Maximum string length is 256 bytes.
     * 
     * @return Optional metadata associated with an Object. Maximum string length is 256 bytes.
     */

    public String getMetadataString() {
        return this.metadataString;
    }

    /**
     * Optional metadata associated with an Object. Maximum string length is 256 bytes.
     * 
     * @param metadataString
     *        Optional metadata associated with an Object. Maximum string length is 256 bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyObjectCompleteRequest withMetadataString(String metadataString) {
        setMetadataString(metadataString);
        return this;
    }

    /**
     * Optional metadata associated with an Object. Maximum length is 4MB.
     * 
     * @param metadataBlob
     *        Optional metadata associated with an Object. Maximum length is 4MB.
     */

    public void setMetadataBlob(java.io.InputStream metadataBlob) {
        this.metadataBlob = metadataBlob;
    }

    /**
     * Optional metadata associated with an Object. Maximum length is 4MB.
     * 
     * @return Optional metadata associated with an Object. Maximum length is 4MB.
     */

    public java.io.InputStream getMetadataBlob() {
        return this.metadataBlob;
    }

    /**
     * Optional metadata associated with an Object. Maximum length is 4MB.
     * 
     * @param metadataBlob
     *        Optional metadata associated with an Object. Maximum length is 4MB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyObjectCompleteRequest withMetadataBlob(java.io.InputStream metadataBlob) {
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

    public NotifyObjectCompleteRequest withMetadataBlobLength(Long metadataBlobLength) {
        setMetadataBlobLength(metadataBlobLength);
        return this;
    }

    /**
     * Checksum of MetadataBlob.
     * 
     * @param metadataBlobChecksum
     *        Checksum of MetadataBlob.
     */

    public void setMetadataBlobChecksum(String metadataBlobChecksum) {
        this.metadataBlobChecksum = metadataBlobChecksum;
    }

    /**
     * Checksum of MetadataBlob.
     * 
     * @return Checksum of MetadataBlob.
     */

    public String getMetadataBlobChecksum() {
        return this.metadataBlobChecksum;
    }

    /**
     * Checksum of MetadataBlob.
     * 
     * @param metadataBlobChecksum
     *        Checksum of MetadataBlob.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyObjectCompleteRequest withMetadataBlobChecksum(String metadataBlobChecksum) {
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

    public NotifyObjectCompleteRequest withMetadataBlobChecksumAlgorithm(String metadataBlobChecksumAlgorithm) {
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

    public NotifyObjectCompleteRequest withMetadataBlobChecksumAlgorithm(DataChecksumAlgorithm metadataBlobChecksumAlgorithm) {
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
        if (getBackupJobId() != null)
            sb.append("BackupJobId: ").append(getBackupJobId()).append(",");
        if (getUploadId() != null)
            sb.append("UploadId: ").append(getUploadId()).append(",");
        if (getObjectChecksum() != null)
            sb.append("ObjectChecksum: ").append(getObjectChecksum()).append(",");
        if (getObjectChecksumAlgorithm() != null)
            sb.append("ObjectChecksumAlgorithm: ").append(getObjectChecksumAlgorithm()).append(",");
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

        if (obj instanceof NotifyObjectCompleteRequest == false)
            return false;
        NotifyObjectCompleteRequest other = (NotifyObjectCompleteRequest) obj;
        if (other.getBackupJobId() == null ^ this.getBackupJobId() == null)
            return false;
        if (other.getBackupJobId() != null && other.getBackupJobId().equals(this.getBackupJobId()) == false)
            return false;
        if (other.getUploadId() == null ^ this.getUploadId() == null)
            return false;
        if (other.getUploadId() != null && other.getUploadId().equals(this.getUploadId()) == false)
            return false;
        if (other.getObjectChecksum() == null ^ this.getObjectChecksum() == null)
            return false;
        if (other.getObjectChecksum() != null && other.getObjectChecksum().equals(this.getObjectChecksum()) == false)
            return false;
        if (other.getObjectChecksumAlgorithm() == null ^ this.getObjectChecksumAlgorithm() == null)
            return false;
        if (other.getObjectChecksumAlgorithm() != null && other.getObjectChecksumAlgorithm().equals(this.getObjectChecksumAlgorithm()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getBackupJobId() == null) ? 0 : getBackupJobId().hashCode());
        hashCode = prime * hashCode + ((getUploadId() == null) ? 0 : getUploadId().hashCode());
        hashCode = prime * hashCode + ((getObjectChecksum() == null) ? 0 : getObjectChecksum().hashCode());
        hashCode = prime * hashCode + ((getObjectChecksumAlgorithm() == null) ? 0 : getObjectChecksumAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getMetadataString() == null) ? 0 : getMetadataString().hashCode());
        hashCode = prime * hashCode + ((getMetadataBlob() == null) ? 0 : getMetadataBlob().hashCode());
        hashCode = prime * hashCode + ((getMetadataBlobLength() == null) ? 0 : getMetadataBlobLength().hashCode());
        hashCode = prime * hashCode + ((getMetadataBlobChecksum() == null) ? 0 : getMetadataBlobChecksum().hashCode());
        hashCode = prime * hashCode + ((getMetadataBlobChecksumAlgorithm() == null) ? 0 : getMetadataBlobChecksumAlgorithm().hashCode());
        return hashCode;
    }

    @Override
    public NotifyObjectCompleteRequest clone() {
        return (NotifyObjectCompleteRequest) super.clone();
    }

    @Override
    public String getSignerType() {
        return "AWS4UnsignedPayloadSignerType";
    }

}
