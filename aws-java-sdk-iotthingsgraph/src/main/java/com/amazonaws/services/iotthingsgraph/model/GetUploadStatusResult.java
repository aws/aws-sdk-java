/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotthingsgraph.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/GetUploadStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetUploadStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the upload.
     * </p>
     */
    private String uploadId;
    /**
     * <p>
     * The status of the upload. The initial status is <code>IN_PROGRESS</code>. The response show all validation
     * failures if the upload fails.
     * </p>
     */
    private String uploadStatus;
    /**
     * <p>
     * The ARN of the upload.
     * </p>
     */
    private String namespaceArn;
    /**
     * <p>
     * The name of the upload's namespace.
     * </p>
     */
    private String namespaceName;
    /**
     * <p>
     * The version of the user's namespace. Defaults to the latest version of the user's namespace.
     * </p>
     */
    private Long namespaceVersion;
    /**
     * <p>
     * The reason for an upload failure.
     * </p>
     */
    private java.util.List<String> failureReason;
    /**
     * <p>
     * The date at which the upload was created.
     * </p>
     */
    private java.util.Date createdDate;

    /**
     * <p>
     * The ID of the upload.
     * </p>
     * 
     * @param uploadId
     *        The ID of the upload.
     */

    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    /**
     * <p>
     * The ID of the upload.
     * </p>
     * 
     * @return The ID of the upload.
     */

    public String getUploadId() {
        return this.uploadId;
    }

    /**
     * <p>
     * The ID of the upload.
     * </p>
     * 
     * @param uploadId
     *        The ID of the upload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUploadStatusResult withUploadId(String uploadId) {
        setUploadId(uploadId);
        return this;
    }

    /**
     * <p>
     * The status of the upload. The initial status is <code>IN_PROGRESS</code>. The response show all validation
     * failures if the upload fails.
     * </p>
     * 
     * @param uploadStatus
     *        The status of the upload. The initial status is <code>IN_PROGRESS</code>. The response show all validation
     *        failures if the upload fails.
     * @see UploadStatus
     */

    public void setUploadStatus(String uploadStatus) {
        this.uploadStatus = uploadStatus;
    }

    /**
     * <p>
     * The status of the upload. The initial status is <code>IN_PROGRESS</code>. The response show all validation
     * failures if the upload fails.
     * </p>
     * 
     * @return The status of the upload. The initial status is <code>IN_PROGRESS</code>. The response show all
     *         validation failures if the upload fails.
     * @see UploadStatus
     */

    public String getUploadStatus() {
        return this.uploadStatus;
    }

    /**
     * <p>
     * The status of the upload. The initial status is <code>IN_PROGRESS</code>. The response show all validation
     * failures if the upload fails.
     * </p>
     * 
     * @param uploadStatus
     *        The status of the upload. The initial status is <code>IN_PROGRESS</code>. The response show all validation
     *        failures if the upload fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UploadStatus
     */

    public GetUploadStatusResult withUploadStatus(String uploadStatus) {
        setUploadStatus(uploadStatus);
        return this;
    }

    /**
     * <p>
     * The status of the upload. The initial status is <code>IN_PROGRESS</code>. The response show all validation
     * failures if the upload fails.
     * </p>
     * 
     * @param uploadStatus
     *        The status of the upload. The initial status is <code>IN_PROGRESS</code>. The response show all validation
     *        failures if the upload fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UploadStatus
     */

    public GetUploadStatusResult withUploadStatus(UploadStatus uploadStatus) {
        this.uploadStatus = uploadStatus.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the upload.
     * </p>
     * 
     * @param namespaceArn
     *        The ARN of the upload.
     */

    public void setNamespaceArn(String namespaceArn) {
        this.namespaceArn = namespaceArn;
    }

    /**
     * <p>
     * The ARN of the upload.
     * </p>
     * 
     * @return The ARN of the upload.
     */

    public String getNamespaceArn() {
        return this.namespaceArn;
    }

    /**
     * <p>
     * The ARN of the upload.
     * </p>
     * 
     * @param namespaceArn
     *        The ARN of the upload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUploadStatusResult withNamespaceArn(String namespaceArn) {
        setNamespaceArn(namespaceArn);
        return this;
    }

    /**
     * <p>
     * The name of the upload's namespace.
     * </p>
     * 
     * @param namespaceName
     *        The name of the upload's namespace.
     */

    public void setNamespaceName(String namespaceName) {
        this.namespaceName = namespaceName;
    }

    /**
     * <p>
     * The name of the upload's namespace.
     * </p>
     * 
     * @return The name of the upload's namespace.
     */

    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * <p>
     * The name of the upload's namespace.
     * </p>
     * 
     * @param namespaceName
     *        The name of the upload's namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUploadStatusResult withNamespaceName(String namespaceName) {
        setNamespaceName(namespaceName);
        return this;
    }

    /**
     * <p>
     * The version of the user's namespace. Defaults to the latest version of the user's namespace.
     * </p>
     * 
     * @param namespaceVersion
     *        The version of the user's namespace. Defaults to the latest version of the user's namespace.
     */

    public void setNamespaceVersion(Long namespaceVersion) {
        this.namespaceVersion = namespaceVersion;
    }

    /**
     * <p>
     * The version of the user's namespace. Defaults to the latest version of the user's namespace.
     * </p>
     * 
     * @return The version of the user's namespace. Defaults to the latest version of the user's namespace.
     */

    public Long getNamespaceVersion() {
        return this.namespaceVersion;
    }

    /**
     * <p>
     * The version of the user's namespace. Defaults to the latest version of the user's namespace.
     * </p>
     * 
     * @param namespaceVersion
     *        The version of the user's namespace. Defaults to the latest version of the user's namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUploadStatusResult withNamespaceVersion(Long namespaceVersion) {
        setNamespaceVersion(namespaceVersion);
        return this;
    }

    /**
     * <p>
     * The reason for an upload failure.
     * </p>
     * 
     * @return The reason for an upload failure.
     */

    public java.util.List<String> getFailureReason() {
        return failureReason;
    }

    /**
     * <p>
     * The reason for an upload failure.
     * </p>
     * 
     * @param failureReason
     *        The reason for an upload failure.
     */

    public void setFailureReason(java.util.Collection<String> failureReason) {
        if (failureReason == null) {
            this.failureReason = null;
            return;
        }

        this.failureReason = new java.util.ArrayList<String>(failureReason);
    }

    /**
     * <p>
     * The reason for an upload failure.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailureReason(java.util.Collection)} or {@link #withFailureReason(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param failureReason
     *        The reason for an upload failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUploadStatusResult withFailureReason(String... failureReason) {
        if (this.failureReason == null) {
            setFailureReason(new java.util.ArrayList<String>(failureReason.length));
        }
        for (String ele : failureReason) {
            this.failureReason.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The reason for an upload failure.
     * </p>
     * 
     * @param failureReason
     *        The reason for an upload failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUploadStatusResult withFailureReason(java.util.Collection<String> failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The date at which the upload was created.
     * </p>
     * 
     * @param createdDate
     *        The date at which the upload was created.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date at which the upload was created.
     * </p>
     * 
     * @return The date at which the upload was created.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date at which the upload was created.
     * </p>
     * 
     * @param createdDate
     *        The date at which the upload was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUploadStatusResult withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
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
        if (getUploadId() != null)
            sb.append("UploadId: ").append(getUploadId()).append(",");
        if (getUploadStatus() != null)
            sb.append("UploadStatus: ").append(getUploadStatus()).append(",");
        if (getNamespaceArn() != null)
            sb.append("NamespaceArn: ").append(getNamespaceArn()).append(",");
        if (getNamespaceName() != null)
            sb.append("NamespaceName: ").append(getNamespaceName()).append(",");
        if (getNamespaceVersion() != null)
            sb.append("NamespaceVersion: ").append(getNamespaceVersion()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUploadStatusResult == false)
            return false;
        GetUploadStatusResult other = (GetUploadStatusResult) obj;
        if (other.getUploadId() == null ^ this.getUploadId() == null)
            return false;
        if (other.getUploadId() != null && other.getUploadId().equals(this.getUploadId()) == false)
            return false;
        if (other.getUploadStatus() == null ^ this.getUploadStatus() == null)
            return false;
        if (other.getUploadStatus() != null && other.getUploadStatus().equals(this.getUploadStatus()) == false)
            return false;
        if (other.getNamespaceArn() == null ^ this.getNamespaceArn() == null)
            return false;
        if (other.getNamespaceArn() != null && other.getNamespaceArn().equals(this.getNamespaceArn()) == false)
            return false;
        if (other.getNamespaceName() == null ^ this.getNamespaceName() == null)
            return false;
        if (other.getNamespaceName() != null && other.getNamespaceName().equals(this.getNamespaceName()) == false)
            return false;
        if (other.getNamespaceVersion() == null ^ this.getNamespaceVersion() == null)
            return false;
        if (other.getNamespaceVersion() != null && other.getNamespaceVersion().equals(this.getNamespaceVersion()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUploadId() == null) ? 0 : getUploadId().hashCode());
        hashCode = prime * hashCode + ((getUploadStatus() == null) ? 0 : getUploadStatus().hashCode());
        hashCode = prime * hashCode + ((getNamespaceArn() == null) ? 0 : getNamespaceArn().hashCode());
        hashCode = prime * hashCode + ((getNamespaceName() == null) ? 0 : getNamespaceName().hashCode());
        hashCode = prime * hashCode + ((getNamespaceVersion() == null) ? 0 : getNamespaceVersion().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        return hashCode;
    }

    @Override
    public GetUploadStatusResult clone() {
        try {
            return (GetUploadStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
