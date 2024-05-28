/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * Response from StartAttachedFileUpload API.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartAttachedFileUpload" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartAttachedFileUploadResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the attached file resource (ARN).
     * </p>
     */
    private String fileArn;
    /**
     * <p>
     * The unique identifier of the attached file resource.
     * </p>
     */
    private String fileId;
    /**
     * <p>
     * The time of Creation of the file resource as an ISO timestamp. It's specified in ISO 8601 format:
     * <code>yyyy-MM-ddThh:mm:ss.SSSZ</code>. For example, <code>2024-05-03T02:41:28.172Z</code>.
     * </p>
     */
    private String creationTime;
    /**
     * <p>
     * The current status of the attached file.
     * </p>
     */
    private String fileStatus;
    /**
     * <p>
     * Represents the identity that created the file.
     * </p>
     */
    private CreatedByInfo createdBy;
    /**
     * <p>
     * Information to be used while uploading the attached file.
     * </p>
     */
    private UploadUrlMetadata uploadUrlMetadata;

    /**
     * <p>
     * The unique identifier of the attached file resource (ARN).
     * </p>
     * 
     * @param fileArn
     *        The unique identifier of the attached file resource (ARN).
     */

    public void setFileArn(String fileArn) {
        this.fileArn = fileArn;
    }

    /**
     * <p>
     * The unique identifier of the attached file resource (ARN).
     * </p>
     * 
     * @return The unique identifier of the attached file resource (ARN).
     */

    public String getFileArn() {
        return this.fileArn;
    }

    /**
     * <p>
     * The unique identifier of the attached file resource (ARN).
     * </p>
     * 
     * @param fileArn
     *        The unique identifier of the attached file resource (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAttachedFileUploadResult withFileArn(String fileArn) {
        setFileArn(fileArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the attached file resource.
     * </p>
     * 
     * @param fileId
     *        The unique identifier of the attached file resource.
     */

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    /**
     * <p>
     * The unique identifier of the attached file resource.
     * </p>
     * 
     * @return The unique identifier of the attached file resource.
     */

    public String getFileId() {
        return this.fileId;
    }

    /**
     * <p>
     * The unique identifier of the attached file resource.
     * </p>
     * 
     * @param fileId
     *        The unique identifier of the attached file resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAttachedFileUploadResult withFileId(String fileId) {
        setFileId(fileId);
        return this;
    }

    /**
     * <p>
     * The time of Creation of the file resource as an ISO timestamp. It's specified in ISO 8601 format:
     * <code>yyyy-MM-ddThh:mm:ss.SSSZ</code>. For example, <code>2024-05-03T02:41:28.172Z</code>.
     * </p>
     * 
     * @param creationTime
     *        The time of Creation of the file resource as an ISO timestamp. It's specified in ISO 8601 format:
     *        <code>yyyy-MM-ddThh:mm:ss.SSSZ</code>. For example, <code>2024-05-03T02:41:28.172Z</code>.
     */

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time of Creation of the file resource as an ISO timestamp. It's specified in ISO 8601 format:
     * <code>yyyy-MM-ddThh:mm:ss.SSSZ</code>. For example, <code>2024-05-03T02:41:28.172Z</code>.
     * </p>
     * 
     * @return The time of Creation of the file resource as an ISO timestamp. It's specified in ISO 8601 format:
     *         <code>yyyy-MM-ddThh:mm:ss.SSSZ</code>. For example, <code>2024-05-03T02:41:28.172Z</code>.
     */

    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time of Creation of the file resource as an ISO timestamp. It's specified in ISO 8601 format:
     * <code>yyyy-MM-ddThh:mm:ss.SSSZ</code>. For example, <code>2024-05-03T02:41:28.172Z</code>.
     * </p>
     * 
     * @param creationTime
     *        The time of Creation of the file resource as an ISO timestamp. It's specified in ISO 8601 format:
     *        <code>yyyy-MM-ddThh:mm:ss.SSSZ</code>. For example, <code>2024-05-03T02:41:28.172Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAttachedFileUploadResult withCreationTime(String creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The current status of the attached file.
     * </p>
     * 
     * @param fileStatus
     *        The current status of the attached file.
     * @see FileStatusType
     */

    public void setFileStatus(String fileStatus) {
        this.fileStatus = fileStatus;
    }

    /**
     * <p>
     * The current status of the attached file.
     * </p>
     * 
     * @return The current status of the attached file.
     * @see FileStatusType
     */

    public String getFileStatus() {
        return this.fileStatus;
    }

    /**
     * <p>
     * The current status of the attached file.
     * </p>
     * 
     * @param fileStatus
     *        The current status of the attached file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileStatusType
     */

    public StartAttachedFileUploadResult withFileStatus(String fileStatus) {
        setFileStatus(fileStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the attached file.
     * </p>
     * 
     * @param fileStatus
     *        The current status of the attached file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileStatusType
     */

    public StartAttachedFileUploadResult withFileStatus(FileStatusType fileStatus) {
        this.fileStatus = fileStatus.toString();
        return this;
    }

    /**
     * <p>
     * Represents the identity that created the file.
     * </p>
     * 
     * @param createdBy
     *        Represents the identity that created the file.
     */

    public void setCreatedBy(CreatedByInfo createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * Represents the identity that created the file.
     * </p>
     * 
     * @return Represents the identity that created the file.
     */

    public CreatedByInfo getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * Represents the identity that created the file.
     * </p>
     * 
     * @param createdBy
     *        Represents the identity that created the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAttachedFileUploadResult withCreatedBy(CreatedByInfo createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * Information to be used while uploading the attached file.
     * </p>
     * 
     * @param uploadUrlMetadata
     *        Information to be used while uploading the attached file.
     */

    public void setUploadUrlMetadata(UploadUrlMetadata uploadUrlMetadata) {
        this.uploadUrlMetadata = uploadUrlMetadata;
    }

    /**
     * <p>
     * Information to be used while uploading the attached file.
     * </p>
     * 
     * @return Information to be used while uploading the attached file.
     */

    public UploadUrlMetadata getUploadUrlMetadata() {
        return this.uploadUrlMetadata;
    }

    /**
     * <p>
     * Information to be used while uploading the attached file.
     * </p>
     * 
     * @param uploadUrlMetadata
     *        Information to be used while uploading the attached file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAttachedFileUploadResult withUploadUrlMetadata(UploadUrlMetadata uploadUrlMetadata) {
        setUploadUrlMetadata(uploadUrlMetadata);
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
        if (getFileArn() != null)
            sb.append("FileArn: ").append(getFileArn()).append(",");
        if (getFileId() != null)
            sb.append("FileId: ").append(getFileId()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getFileStatus() != null)
            sb.append("FileStatus: ").append(getFileStatus()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getUploadUrlMetadata() != null)
            sb.append("UploadUrlMetadata: ").append(getUploadUrlMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartAttachedFileUploadResult == false)
            return false;
        StartAttachedFileUploadResult other = (StartAttachedFileUploadResult) obj;
        if (other.getFileArn() == null ^ this.getFileArn() == null)
            return false;
        if (other.getFileArn() != null && other.getFileArn().equals(this.getFileArn()) == false)
            return false;
        if (other.getFileId() == null ^ this.getFileId() == null)
            return false;
        if (other.getFileId() != null && other.getFileId().equals(this.getFileId()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getFileStatus() == null ^ this.getFileStatus() == null)
            return false;
        if (other.getFileStatus() != null && other.getFileStatus().equals(this.getFileStatus()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getUploadUrlMetadata() == null ^ this.getUploadUrlMetadata() == null)
            return false;
        if (other.getUploadUrlMetadata() != null && other.getUploadUrlMetadata().equals(this.getUploadUrlMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileArn() == null) ? 0 : getFileArn().hashCode());
        hashCode = prime * hashCode + ((getFileId() == null) ? 0 : getFileId().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getFileStatus() == null) ? 0 : getFileStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getUploadUrlMetadata() == null) ? 0 : getUploadUrlMetadata().hashCode());
        return hashCode;
    }

    @Override
    public StartAttachedFileUploadResult clone() {
        try {
            return (StartAttachedFileUploadResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
