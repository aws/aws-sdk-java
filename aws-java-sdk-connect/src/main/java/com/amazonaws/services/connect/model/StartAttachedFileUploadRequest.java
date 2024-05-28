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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/StartAttachedFileUpload" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartAttachedFileUploadRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The unique identifier of the Connect instance.
     * </p>
     */
    private String instanceId;
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
     * Optional override for the expiry of the pre-signed S3 URL in seconds. The default value is 300.
     * </p>
     */
    private Integer urlExpiryInSeconds;
    /**
     * <p>
     * The use case for the file.
     * </p>
     */
    private String fileUseCaseType;
    /**
     * <p>
     * The resource to which the attached file is (being) uploaded to. <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html">Cases</a> are
     * the only current supported resource.
     * </p>
     * <note>
     * <p>
     * This value must be a valid ARN.
     * </p>
     * </note>
     */
    private String associatedResourceArn;
    /**
     * <p>
     * Represents the identity that created the file.
     * </p>
     */
    private CreatedByInfo createdBy;
    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example,
     * <code>{ "Tags": {"key1":"value1", "key2":"value2"} }</code>.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not
     *        provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     *        href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries
     *        safe with idempotent APIs</a>.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not
     *         provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see
     *         <a href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making
     *         retries safe with idempotent APIs</a>.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided,
     * the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     * href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries safe with
     * idempotent APIs</a>.
     * </p>
     * 
     * @param clientToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not
     *        provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see <a
     *        href="https://aws.amazon.com/builders-library/making-retries-safe-with-idempotent-APIs/">Making retries
     *        safe with idempotent APIs</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAttachedFileUploadRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the Connect instance.
     * </p>
     * 
     * @param instanceId
     *        The unique identifier of the Connect instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The unique identifier of the Connect instance.
     * </p>
     * 
     * @return The unique identifier of the Connect instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The unique identifier of the Connect instance.
     * </p>
     * 
     * @param instanceId
     *        The unique identifier of the Connect instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAttachedFileUploadRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
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

    public StartAttachedFileUploadRequest withFileName(String fileName) {
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

    public StartAttachedFileUploadRequest withFileSizeInBytes(Long fileSizeInBytes) {
        setFileSizeInBytes(fileSizeInBytes);
        return this;
    }

    /**
     * <p>
     * Optional override for the expiry of the pre-signed S3 URL in seconds. The default value is 300.
     * </p>
     * 
     * @param urlExpiryInSeconds
     *        Optional override for the expiry of the pre-signed S3 URL in seconds. The default value is 300.
     */

    public void setUrlExpiryInSeconds(Integer urlExpiryInSeconds) {
        this.urlExpiryInSeconds = urlExpiryInSeconds;
    }

    /**
     * <p>
     * Optional override for the expiry of the pre-signed S3 URL in seconds. The default value is 300.
     * </p>
     * 
     * @return Optional override for the expiry of the pre-signed S3 URL in seconds. The default value is 300.
     */

    public Integer getUrlExpiryInSeconds() {
        return this.urlExpiryInSeconds;
    }

    /**
     * <p>
     * Optional override for the expiry of the pre-signed S3 URL in seconds. The default value is 300.
     * </p>
     * 
     * @param urlExpiryInSeconds
     *        Optional override for the expiry of the pre-signed S3 URL in seconds. The default value is 300.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAttachedFileUploadRequest withUrlExpiryInSeconds(Integer urlExpiryInSeconds) {
        setUrlExpiryInSeconds(urlExpiryInSeconds);
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

    public StartAttachedFileUploadRequest withFileUseCaseType(String fileUseCaseType) {
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

    public StartAttachedFileUploadRequest withFileUseCaseType(FileUseCaseType fileUseCaseType) {
        this.fileUseCaseType = fileUseCaseType.toString();
        return this;
    }

    /**
     * <p>
     * The resource to which the attached file is (being) uploaded to. <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html">Cases</a> are
     * the only current supported resource.
     * </p>
     * <note>
     * <p>
     * This value must be a valid ARN.
     * </p>
     * </note>
     * 
     * @param associatedResourceArn
     *        The resource to which the attached file is (being) uploaded to. <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html">Cases</a>
     *        are the only current supported resource.</p> <note>
     *        <p>
     *        This value must be a valid ARN.
     *        </p>
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
     * <note>
     * <p>
     * This value must be a valid ARN.
     * </p>
     * </note>
     * 
     * @return The resource to which the attached file is (being) uploaded to. <a
     *         href="https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html"
     *         >Cases</a> are the only current supported resource.</p> <note>
     *         <p>
     *         This value must be a valid ARN.
     *         </p>
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
     * <note>
     * <p>
     * This value must be a valid ARN.
     * </p>
     * </note>
     * 
     * @param associatedResourceArn
     *        The resource to which the attached file is (being) uploaded to. <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_connect-cases_CreateCase.html">Cases</a>
     *        are the only current supported resource.</p> <note>
     *        <p>
     *        This value must be a valid ARN.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAttachedFileUploadRequest withAssociatedResourceArn(String associatedResourceArn) {
        setAssociatedResourceArn(associatedResourceArn);
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

    public StartAttachedFileUploadRequest withCreatedBy(CreatedByInfo createdBy) {
        setCreatedBy(createdBy);
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

    public StartAttachedFileUploadRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see StartAttachedFileUploadRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartAttachedFileUploadRequest addTagsEntry(String key, String value) {
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

    public StartAttachedFileUploadRequest clearTagsEntries() {
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getFileName() != null)
            sb.append("FileName: ").append(getFileName()).append(",");
        if (getFileSizeInBytes() != null)
            sb.append("FileSizeInBytes: ").append(getFileSizeInBytes()).append(",");
        if (getUrlExpiryInSeconds() != null)
            sb.append("UrlExpiryInSeconds: ").append(getUrlExpiryInSeconds()).append(",");
        if (getFileUseCaseType() != null)
            sb.append("FileUseCaseType: ").append(getFileUseCaseType()).append(",");
        if (getAssociatedResourceArn() != null)
            sb.append("AssociatedResourceArn: ").append(getAssociatedResourceArn()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
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

        if (obj instanceof StartAttachedFileUploadRequest == false)
            return false;
        StartAttachedFileUploadRequest other = (StartAttachedFileUploadRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getFileName() == null ^ this.getFileName() == null)
            return false;
        if (other.getFileName() != null && other.getFileName().equals(this.getFileName()) == false)
            return false;
        if (other.getFileSizeInBytes() == null ^ this.getFileSizeInBytes() == null)
            return false;
        if (other.getFileSizeInBytes() != null && other.getFileSizeInBytes().equals(this.getFileSizeInBytes()) == false)
            return false;
        if (other.getUrlExpiryInSeconds() == null ^ this.getUrlExpiryInSeconds() == null)
            return false;
        if (other.getUrlExpiryInSeconds() != null && other.getUrlExpiryInSeconds().equals(this.getUrlExpiryInSeconds()) == false)
            return false;
        if (other.getFileUseCaseType() == null ^ this.getFileUseCaseType() == null)
            return false;
        if (other.getFileUseCaseType() != null && other.getFileUseCaseType().equals(this.getFileUseCaseType()) == false)
            return false;
        if (other.getAssociatedResourceArn() == null ^ this.getAssociatedResourceArn() == null)
            return false;
        if (other.getAssociatedResourceArn() != null && other.getAssociatedResourceArn().equals(this.getAssociatedResourceArn()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
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

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getFileName() == null) ? 0 : getFileName().hashCode());
        hashCode = prime * hashCode + ((getFileSizeInBytes() == null) ? 0 : getFileSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getUrlExpiryInSeconds() == null) ? 0 : getUrlExpiryInSeconds().hashCode());
        hashCode = prime * hashCode + ((getFileUseCaseType() == null) ? 0 : getFileUseCaseType().hashCode());
        hashCode = prime * hashCode + ((getAssociatedResourceArn() == null) ? 0 : getAssociatedResourceArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public StartAttachedFileUploadRequest clone() {
        return (StartAttachedFileUploadRequest) super.clone();
    }

}
