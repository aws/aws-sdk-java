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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribeFaq" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFaqResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the FAQ.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The identifier of the index that contains the FAQ.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * The name that you gave the FAQ when it was created.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the FAQ that you provided when it was created.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The date and time that the FAQ was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The date and time that the FAQ was last updated.
     * </p>
     */
    private java.util.Date updatedAt;

    private S3Path s3Path;
    /**
     * <p>
     * The status of the FAQ. It is ready to use when the status is <code>ACTIVE</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that provides access to the S3 bucket containing the input files for
     * the FAQ.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * If the <code>Status</code> field is <code>FAILED</code>, the <code>ErrorMessage</code> field contains the reason
     * why the FAQ failed.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The identifier of the FAQ.
     * </p>
     * 
     * @param id
     *        The identifier of the FAQ.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the FAQ.
     * </p>
     * 
     * @return The identifier of the FAQ.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the FAQ.
     * </p>
     * 
     * @param id
     *        The identifier of the FAQ.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFaqResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The identifier of the index that contains the FAQ.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index that contains the FAQ.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index that contains the FAQ.
     * </p>
     * 
     * @return The identifier of the index that contains the FAQ.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index that contains the FAQ.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index that contains the FAQ.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFaqResult withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * The name that you gave the FAQ when it was created.
     * </p>
     * 
     * @param name
     *        The name that you gave the FAQ when it was created.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name that you gave the FAQ when it was created.
     * </p>
     * 
     * @return The name that you gave the FAQ when it was created.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name that you gave the FAQ when it was created.
     * </p>
     * 
     * @param name
     *        The name that you gave the FAQ when it was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFaqResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the FAQ that you provided when it was created.
     * </p>
     * 
     * @param description
     *        The description of the FAQ that you provided when it was created.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the FAQ that you provided when it was created.
     * </p>
     * 
     * @return The description of the FAQ that you provided when it was created.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the FAQ that you provided when it was created.
     * </p>
     * 
     * @param description
     *        The description of the FAQ that you provided when it was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFaqResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The date and time that the FAQ was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the FAQ was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time that the FAQ was created.
     * </p>
     * 
     * @return The date and time that the FAQ was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time that the FAQ was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the FAQ was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFaqResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The date and time that the FAQ was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time that the FAQ was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time that the FAQ was last updated.
     * </p>
     * 
     * @return The date and time that the FAQ was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date and time that the FAQ was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time that the FAQ was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFaqResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * @param s3Path
     */

    public void setS3Path(S3Path s3Path) {
        this.s3Path = s3Path;
    }

    /**
     * @return
     */

    public S3Path getS3Path() {
        return this.s3Path;
    }

    /**
     * @param s3Path
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFaqResult withS3Path(S3Path s3Path) {
        setS3Path(s3Path);
        return this;
    }

    /**
     * <p>
     * The status of the FAQ. It is ready to use when the status is <code>ACTIVE</code>.
     * </p>
     * 
     * @param status
     *        The status of the FAQ. It is ready to use when the status is <code>ACTIVE</code>.
     * @see FaqStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the FAQ. It is ready to use when the status is <code>ACTIVE</code>.
     * </p>
     * 
     * @return The status of the FAQ. It is ready to use when the status is <code>ACTIVE</code>.
     * @see FaqStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the FAQ. It is ready to use when the status is <code>ACTIVE</code>.
     * </p>
     * 
     * @param status
     *        The status of the FAQ. It is ready to use when the status is <code>ACTIVE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FaqStatus
     */

    public DescribeFaqResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the FAQ. It is ready to use when the status is <code>ACTIVE</code>.
     * </p>
     * 
     * @param status
     *        The status of the FAQ. It is ready to use when the status is <code>ACTIVE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FaqStatus
     */

    public DescribeFaqResult withStatus(FaqStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that provides access to the S3 bucket containing the input files for
     * the FAQ.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role that provides access to the S3 bucket containing the input
     *        files for the FAQ.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that provides access to the S3 bucket containing the input files for
     * the FAQ.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the role that provides access to the S3 bucket containing the input
     *         files for the FAQ.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that provides access to the S3 bucket containing the input files for
     * the FAQ.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role that provides access to the S3 bucket containing the input
     *        files for the FAQ.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFaqResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * If the <code>Status</code> field is <code>FAILED</code>, the <code>ErrorMessage</code> field contains the reason
     * why the FAQ failed.
     * </p>
     * 
     * @param errorMessage
     *        If the <code>Status</code> field is <code>FAILED</code>, the <code>ErrorMessage</code> field contains the
     *        reason why the FAQ failed.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * If the <code>Status</code> field is <code>FAILED</code>, the <code>ErrorMessage</code> field contains the reason
     * why the FAQ failed.
     * </p>
     * 
     * @return If the <code>Status</code> field is <code>FAILED</code>, the <code>ErrorMessage</code> field contains the
     *         reason why the FAQ failed.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * If the <code>Status</code> field is <code>FAILED</code>, the <code>ErrorMessage</code> field contains the reason
     * why the FAQ failed.
     * </p>
     * 
     * @param errorMessage
     *        If the <code>Status</code> field is <code>FAILED</code>, the <code>ErrorMessage</code> field contains the
     *        reason why the FAQ failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFaqResult withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getS3Path() != null)
            sb.append("S3Path: ").append(getS3Path()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFaqResult == false)
            return false;
        DescribeFaqResult other = (DescribeFaqResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getS3Path() == null ^ this.getS3Path() == null)
            return false;
        if (other.getS3Path() != null && other.getS3Path().equals(this.getS3Path()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getS3Path() == null) ? 0 : getS3Path().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFaqResult clone() {
        try {
            return (DescribeFaqResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
