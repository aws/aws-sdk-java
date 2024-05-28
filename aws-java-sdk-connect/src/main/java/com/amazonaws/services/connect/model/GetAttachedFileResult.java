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
 * Response from GetAttachedFile API.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/GetAttachedFile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAttachedFileResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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
     * A case-sensitive name of the attached file being uploaded.
     * </p>
     */
    private String fileName;
    /**
     * <p>
     * The size of the attached file in bytes.
     * </p>
     */
    private Long fileSizeInBytes;
    /**
     * <p>
     * The resource to which the attached file is (being) uploaded to. <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html">Cases</a> are
     * the only current supported resource.
     * </p>
     */
    private String associatedResourceArn;
    /**
     * <p>
     * The use case for the file.
     * </p>
     */
    private String fileUseCaseType;
    /**
     * <p>
     * Represents the identity that created the file.
     * </p>
     */
    private CreatedByInfo createdBy;
    /**
     * <p>
     * URL and expiry to be used when downloading the attached file.
     * </p>
     */
    private DownloadUrlMetadata downloadUrlMetadata;
    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example,
     * <code>{ "Tags": {"key1":"value1", "key2":"value2"} }</code>.
     * </p>
     */
    private java.util.Map<String, String> tags;

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

    public GetAttachedFileResult withFileArn(String fileArn) {
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

    public GetAttachedFileResult withFileId(String fileId) {
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

    public GetAttachedFileResult withCreationTime(String creationTime) {
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

    public GetAttachedFileResult withFileStatus(String fileStatus) {
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

    public GetAttachedFileResult withFileStatus(FileStatusType fileStatus) {
        this.fileStatus = fileStatus.toString();
        return this;
    }

    /**
     * <p>
     * A case-sensitive name of the attached file being uploaded.
     * </p>
     * 
     * @param fileName
     *        A case-sensitive name of the attached file being uploaded.
     */

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * <p>
     * A case-sensitive name of the attached file being uploaded.
     * </p>
     * 
     * @return A case-sensitive name of the attached file being uploaded.
     */

    public String getFileName() {
        return this.fileName;
    }

    /**
     * <p>
     * A case-sensitive name of the attached file being uploaded.
     * </p>
     * 
     * @param fileName
     *        A case-sensitive name of the attached file being uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAttachedFileResult withFileName(String fileName) {
        setFileName(fileName);
        return this;
    }

    /**
     * <p>
     * The size of the attached file in bytes.
     * </p>
     * 
     * @param fileSizeInBytes
     *        The size of the attached file in bytes.
     */

    public void setFileSizeInBytes(Long fileSizeInBytes) {
        this.fileSizeInBytes = fileSizeInBytes;
    }

    /**
     * <p>
     * The size of the attached file in bytes.
     * </p>
     * 
     * @return The size of the attached file in bytes.
     */

    public Long getFileSizeInBytes() {
        return this.fileSizeInBytes;
    }

    /**
     * <p>
     * The size of the attached file in bytes.
     * </p>
     * 
     * @param fileSizeInBytes
     *        The size of the attached file in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAttachedFileResult withFileSizeInBytes(Long fileSizeInBytes) {
        setFileSizeInBytes(fileSizeInBytes);
        return this;
    }

    /**
     * <p>
     * The resource to which the attached file is (being) uploaded to. <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html">Cases</a> are
     * the only current supported resource.
     * </p>
     * 
     * @param associatedResourceArn
     *        The resource to which the attached file is (being) uploaded to. <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html">Cases</a>
     *        are the only current supported resource.
     */

    public void setAssociatedResourceArn(String associatedResourceArn) {
        this.associatedResourceArn = associatedResourceArn;
    }

    /**
     * <p>
     * The resource to which the attached file is (being) uploaded to. <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html">Cases</a> are
     * the only current supported resource.
     * </p>
     * 
     * @return The resource to which the attached file is (being) uploaded to. <a
     *         href="https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html"
     *         >Cases</a> are the only current supported resource.
     */

    public String getAssociatedResourceArn() {
        return this.associatedResourceArn;
    }

    /**
     * <p>
     * The resource to which the attached file is (being) uploaded to. <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html">Cases</a> are
     * the only current supported resource.
     * </p>
     * 
     * @param associatedResourceArn
     *        The resource to which the attached file is (being) uploaded to. <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html">Cases</a>
     *        are the only current supported resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAttachedFileResult withAssociatedResourceArn(String associatedResourceArn) {
        setAssociatedResourceArn(associatedResourceArn);
        return this;
    }

    /**
     * <p>
     * The use case for the file.
     * </p>
     * 
     * @param fileUseCaseType
     *        The use case for the file.
     * @see FileUseCaseType
     */

    public void setFileUseCaseType(String fileUseCaseType) {
        this.fileUseCaseType = fileUseCaseType;
    }

    /**
     * <p>
     * The use case for the file.
     * </p>
     * 
     * @return The use case for the file.
     * @see FileUseCaseType
     */

    public String getFileUseCaseType() {
        return this.fileUseCaseType;
    }

    /**
     * <p>
     * The use case for the file.
     * </p>
     * 
     * @param fileUseCaseType
     *        The use case for the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileUseCaseType
     */

    public GetAttachedFileResult withFileUseCaseType(String fileUseCaseType) {
        setFileUseCaseType(fileUseCaseType);
        return this;
    }

    /**
     * <p>
     * The use case for the file.
     * </p>
     * 
     * @param fileUseCaseType
     *        The use case for the file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileUseCaseType
     */

    public GetAttachedFileResult withFileUseCaseType(FileUseCaseType fileUseCaseType) {
        this.fileUseCaseType = fileUseCaseType.toString();
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

    public GetAttachedFileResult withCreatedBy(CreatedByInfo createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * URL and expiry to be used when downloading the attached file.
     * </p>
     * 
     * @param downloadUrlMetadata
     *        URL and expiry to be used when downloading the attached file.
     */

    public void setDownloadUrlMetadata(DownloadUrlMetadata downloadUrlMetadata) {
        this.downloadUrlMetadata = downloadUrlMetadata;
    }

    /**
     * <p>
     * URL and expiry to be used when downloading the attached file.
     * </p>
     * 
     * @return URL and expiry to be used when downloading the attached file.
     */

    public DownloadUrlMetadata getDownloadUrlMetadata() {
        return this.downloadUrlMetadata;
    }

    /**
     * <p>
     * URL and expiry to be used when downloading the attached file.
     * </p>
     * 
     * @param downloadUrlMetadata
     *        URL and expiry to be used when downloading the attached file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAttachedFileResult withDownloadUrlMetadata(DownloadUrlMetadata downloadUrlMetadata) {
        setDownloadUrlMetadata(downloadUrlMetadata);
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example,
     * <code>{ "Tags": {"key1":"value1", "key2":"value2"} }</code>.
     * </p>
     * 
     * @return The tags used to organize, track, or control access for this resource. For example,
     *         <code>{ "Tags": {"key1":"value1", "key2":"value2"} }</code>.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example,
     * <code>{ "Tags": {"key1":"value1", "key2":"value2"} }</code>.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource. For example,
     *        <code>{ "Tags": {"key1":"value1", "key2":"value2"} }</code>.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example,
     * <code>{ "Tags": {"key1":"value1", "key2":"value2"} }</code>.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource. For example,
     *        <code>{ "Tags": {"key1":"value1", "key2":"value2"} }</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAttachedFileResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetAttachedFileResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetAttachedFileResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAttachedFileResult clearTagsEntries() {
        this.tags = null;
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
        if (getFileName() != null)
            sb.append("FileName: ").append(getFileName()).append(",");
        if (getFileSizeInBytes() != null)
            sb.append("FileSizeInBytes: ").append(getFileSizeInBytes()).append(",");
        if (getAssociatedResourceArn() != null)
            sb.append("AssociatedResourceArn: ").append(getAssociatedResourceArn()).append(",");
        if (getFileUseCaseType() != null)
            sb.append("FileUseCaseType: ").append(getFileUseCaseType()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getDownloadUrlMetadata() != null)
            sb.append("DownloadUrlMetadata: ").append(getDownloadUrlMetadata()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAttachedFileResult == false)
            return false;
        GetAttachedFileResult other = (GetAttachedFileResult) obj;
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
        if (other.getFileName() == null ^ this.getFileName() == null)
            return false;
        if (other.getFileName() != null && other.getFileName().equals(this.getFileName()) == false)
            return false;
        if (other.getFileSizeInBytes() == null ^ this.getFileSizeInBytes() == null)
            return false;
        if (other.getFileSizeInBytes() != null && other.getFileSizeInBytes().equals(this.getFileSizeInBytes()) == false)
            return false;
        if (other.getAssociatedResourceArn() == null ^ this.getAssociatedResourceArn() == null)
            return false;
        if (other.getAssociatedResourceArn() != null && other.getAssociatedResourceArn().equals(this.getAssociatedResourceArn()) == false)
            return false;
        if (other.getFileUseCaseType() == null ^ this.getFileUseCaseType() == null)
            return false;
        if (other.getFileUseCaseType() != null && other.getFileUseCaseType().equals(this.getFileUseCaseType()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getDownloadUrlMetadata() == null ^ this.getDownloadUrlMetadata() == null)
            return false;
        if (other.getDownloadUrlMetadata() != null && other.getDownloadUrlMetadata().equals(this.getDownloadUrlMetadata()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getFileName() == null) ? 0 : getFileName().hashCode());
        hashCode = prime * hashCode + ((getFileSizeInBytes() == null) ? 0 : getFileSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getAssociatedResourceArn() == null) ? 0 : getAssociatedResourceArn().hashCode());
        hashCode = prime * hashCode + ((getFileUseCaseType() == null) ? 0 : getFileUseCaseType().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getDownloadUrlMetadata() == null) ? 0 : getDownloadUrlMetadata().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public GetAttachedFileResult clone() {
        try {
            return (GetAttachedFileResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
