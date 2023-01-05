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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribeQuerySuggestionsBlockList"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeQuerySuggestionsBlockListResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The identifier of the index for the block list.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * The identifier of the block list.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the block list.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description for the block list.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The current status of the block list. When the value is <code>ACTIVE</code>, the block list is ready for use.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The error message containing details if there are issues processing the block list.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * The date-time a block list for query suggestions was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The date-time a block list for query suggestions was last updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * Shows the current S3 path to your block list text file in your S3 bucket.
     * </p>
     * <p>
     * Each block word or phrase should be on a separate line in a text file.
     * </p>
     * <p>
     * For information on the current quota limits for block lists, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas for Amazon Kendra</a>.
     * </p>
     */
    private S3Path sourceS3Path;
    /**
     * <p>
     * The current number of valid, non-empty words or phrases in the block list text file.
     * </p>
     */
    private Integer itemCount;
    /**
     * <p>
     * The current size of the block list text file in S3.
     * </p>
     */
    private Long fileSizeBytes;
    /**
     * <p>
     * The IAM (Identity and Access Management) role used by Amazon Kendra to access the block list text file in S3.
     * </p>
     * <p>
     * The role needs S3 read permissions to your file in S3 and needs to give STS (Security Token Service) assume role
     * permissions to Amazon Kendra.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The identifier of the index for the block list.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index for the block list.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index for the block list.
     * </p>
     * 
     * @return The identifier of the index for the block list.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index for the block list.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index for the block list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeQuerySuggestionsBlockListResult withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * The identifier of the block list.
     * </p>
     * 
     * @param id
     *        The identifier of the block list.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the block list.
     * </p>
     * 
     * @return The identifier of the block list.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the block list.
     * </p>
     * 
     * @param id
     *        The identifier of the block list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeQuerySuggestionsBlockListResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the block list.
     * </p>
     * 
     * @param name
     *        The name of the block list.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the block list.
     * </p>
     * 
     * @return The name of the block list.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the block list.
     * </p>
     * 
     * @param name
     *        The name of the block list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeQuerySuggestionsBlockListResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description for the block list.
     * </p>
     * 
     * @param description
     *        The description for the block list.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the block list.
     * </p>
     * 
     * @return The description for the block list.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the block list.
     * </p>
     * 
     * @param description
     *        The description for the block list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeQuerySuggestionsBlockListResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The current status of the block list. When the value is <code>ACTIVE</code>, the block list is ready for use.
     * </p>
     * 
     * @param status
     *        The current status of the block list. When the value is <code>ACTIVE</code>, the block list is ready for
     *        use.
     * @see QuerySuggestionsBlockListStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the block list. When the value is <code>ACTIVE</code>, the block list is ready for use.
     * </p>
     * 
     * @return The current status of the block list. When the value is <code>ACTIVE</code>, the block list is ready for
     *         use.
     * @see QuerySuggestionsBlockListStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the block list. When the value is <code>ACTIVE</code>, the block list is ready for use.
     * </p>
     * 
     * @param status
     *        The current status of the block list. When the value is <code>ACTIVE</code>, the block list is ready for
     *        use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QuerySuggestionsBlockListStatus
     */

    public DescribeQuerySuggestionsBlockListResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the block list. When the value is <code>ACTIVE</code>, the block list is ready for use.
     * </p>
     * 
     * @param status
     *        The current status of the block list. When the value is <code>ACTIVE</code>, the block list is ready for
     *        use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QuerySuggestionsBlockListStatus
     */

    public DescribeQuerySuggestionsBlockListResult withStatus(QuerySuggestionsBlockListStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The error message containing details if there are issues processing the block list.
     * </p>
     * 
     * @param errorMessage
     *        The error message containing details if there are issues processing the block list.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message containing details if there are issues processing the block list.
     * </p>
     * 
     * @return The error message containing details if there are issues processing the block list.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The error message containing details if there are issues processing the block list.
     * </p>
     * 
     * @param errorMessage
     *        The error message containing details if there are issues processing the block list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeQuerySuggestionsBlockListResult withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The date-time a block list for query suggestions was created.
     * </p>
     * 
     * @param createdAt
     *        The date-time a block list for query suggestions was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date-time a block list for query suggestions was created.
     * </p>
     * 
     * @return The date-time a block list for query suggestions was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date-time a block list for query suggestions was created.
     * </p>
     * 
     * @param createdAt
     *        The date-time a block list for query suggestions was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeQuerySuggestionsBlockListResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The date-time a block list for query suggestions was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The date-time a block list for query suggestions was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date-time a block list for query suggestions was last updated.
     * </p>
     * 
     * @return The date-time a block list for query suggestions was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date-time a block list for query suggestions was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The date-time a block list for query suggestions was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeQuerySuggestionsBlockListResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * Shows the current S3 path to your block list text file in your S3 bucket.
     * </p>
     * <p>
     * Each block word or phrase should be on a separate line in a text file.
     * </p>
     * <p>
     * For information on the current quota limits for block lists, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas for Amazon Kendra</a>.
     * </p>
     * 
     * @param sourceS3Path
     *        Shows the current S3 path to your block list text file in your S3 bucket.</p>
     *        <p>
     *        Each block word or phrase should be on a separate line in a text file.
     *        </p>
     *        <p>
     *        For information on the current quota limits for block lists, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas for Amazon Kendra</a>.
     */

    public void setSourceS3Path(S3Path sourceS3Path) {
        this.sourceS3Path = sourceS3Path;
    }

    /**
     * <p>
     * Shows the current S3 path to your block list text file in your S3 bucket.
     * </p>
     * <p>
     * Each block word or phrase should be on a separate line in a text file.
     * </p>
     * <p>
     * For information on the current quota limits for block lists, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas for Amazon Kendra</a>.
     * </p>
     * 
     * @return Shows the current S3 path to your block list text file in your S3 bucket.</p>
     *         <p>
     *         Each block word or phrase should be on a separate line in a text file.
     *         </p>
     *         <p>
     *         For information on the current quota limits for block lists, see <a
     *         href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas for Amazon Kendra</a>.
     */

    public S3Path getSourceS3Path() {
        return this.sourceS3Path;
    }

    /**
     * <p>
     * Shows the current S3 path to your block list text file in your S3 bucket.
     * </p>
     * <p>
     * Each block word or phrase should be on a separate line in a text file.
     * </p>
     * <p>
     * For information on the current quota limits for block lists, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas for Amazon Kendra</a>.
     * </p>
     * 
     * @param sourceS3Path
     *        Shows the current S3 path to your block list text file in your S3 bucket.</p>
     *        <p>
     *        Each block word or phrase should be on a separate line in a text file.
     *        </p>
     *        <p>
     *        For information on the current quota limits for block lists, see <a
     *        href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas for Amazon Kendra</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeQuerySuggestionsBlockListResult withSourceS3Path(S3Path sourceS3Path) {
        setSourceS3Path(sourceS3Path);
        return this;
    }

    /**
     * <p>
     * The current number of valid, non-empty words or phrases in the block list text file.
     * </p>
     * 
     * @param itemCount
     *        The current number of valid, non-empty words or phrases in the block list text file.
     */

    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    /**
     * <p>
     * The current number of valid, non-empty words or phrases in the block list text file.
     * </p>
     * 
     * @return The current number of valid, non-empty words or phrases in the block list text file.
     */

    public Integer getItemCount() {
        return this.itemCount;
    }

    /**
     * <p>
     * The current number of valid, non-empty words or phrases in the block list text file.
     * </p>
     * 
     * @param itemCount
     *        The current number of valid, non-empty words or phrases in the block list text file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeQuerySuggestionsBlockListResult withItemCount(Integer itemCount) {
        setItemCount(itemCount);
        return this;
    }

    /**
     * <p>
     * The current size of the block list text file in S3.
     * </p>
     * 
     * @param fileSizeBytes
     *        The current size of the block list text file in S3.
     */

    public void setFileSizeBytes(Long fileSizeBytes) {
        this.fileSizeBytes = fileSizeBytes;
    }

    /**
     * <p>
     * The current size of the block list text file in S3.
     * </p>
     * 
     * @return The current size of the block list text file in S3.
     */

    public Long getFileSizeBytes() {
        return this.fileSizeBytes;
    }

    /**
     * <p>
     * The current size of the block list text file in S3.
     * </p>
     * 
     * @param fileSizeBytes
     *        The current size of the block list text file in S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeQuerySuggestionsBlockListResult withFileSizeBytes(Long fileSizeBytes) {
        setFileSizeBytes(fileSizeBytes);
        return this;
    }

    /**
     * <p>
     * The IAM (Identity and Access Management) role used by Amazon Kendra to access the block list text file in S3.
     * </p>
     * <p>
     * The role needs S3 read permissions to your file in S3 and needs to give STS (Security Token Service) assume role
     * permissions to Amazon Kendra.
     * </p>
     * 
     * @param roleArn
     *        The IAM (Identity and Access Management) role used by Amazon Kendra to access the block list text file in
     *        S3.</p>
     *        <p>
     *        The role needs S3 read permissions to your file in S3 and needs to give STS (Security Token Service)
     *        assume role permissions to Amazon Kendra.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The IAM (Identity and Access Management) role used by Amazon Kendra to access the block list text file in S3.
     * </p>
     * <p>
     * The role needs S3 read permissions to your file in S3 and needs to give STS (Security Token Service) assume role
     * permissions to Amazon Kendra.
     * </p>
     * 
     * @return The IAM (Identity and Access Management) role used by Amazon Kendra to access the block list text file in
     *         S3.</p>
     *         <p>
     *         The role needs S3 read permissions to your file in S3 and needs to give STS (Security Token Service)
     *         assume role permissions to Amazon Kendra.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The IAM (Identity and Access Management) role used by Amazon Kendra to access the block list text file in S3.
     * </p>
     * <p>
     * The role needs S3 read permissions to your file in S3 and needs to give STS (Security Token Service) assume role
     * permissions to Amazon Kendra.
     * </p>
     * 
     * @param roleArn
     *        The IAM (Identity and Access Management) role used by Amazon Kendra to access the block list text file in
     *        S3.</p>
     *        <p>
     *        The role needs S3 read permissions to your file in S3 and needs to give STS (Security Token Service)
     *        assume role permissions to Amazon Kendra.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeQuerySuggestionsBlockListResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getSourceS3Path() != null)
            sb.append("SourceS3Path: ").append(getSourceS3Path()).append(",");
        if (getItemCount() != null)
            sb.append("ItemCount: ").append(getItemCount()).append(",");
        if (getFileSizeBytes() != null)
            sb.append("FileSizeBytes: ").append(getFileSizeBytes()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeQuerySuggestionsBlockListResult == false)
            return false;
        DescribeQuerySuggestionsBlockListResult other = (DescribeQuerySuggestionsBlockListResult) obj;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getSourceS3Path() == null ^ this.getSourceS3Path() == null)
            return false;
        if (other.getSourceS3Path() != null && other.getSourceS3Path().equals(this.getSourceS3Path()) == false)
            return false;
        if (other.getItemCount() == null ^ this.getItemCount() == null)
            return false;
        if (other.getItemCount() != null && other.getItemCount().equals(this.getItemCount()) == false)
            return false;
        if (other.getFileSizeBytes() == null ^ this.getFileSizeBytes() == null)
            return false;
        if (other.getFileSizeBytes() != null && other.getFileSizeBytes().equals(this.getFileSizeBytes()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getSourceS3Path() == null) ? 0 : getSourceS3Path().hashCode());
        hashCode = prime * hashCode + ((getItemCount() == null) ? 0 : getItemCount().hashCode());
        hashCode = prime * hashCode + ((getFileSizeBytes() == null) ? 0 : getFileSizeBytes().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeQuerySuggestionsBlockListResult clone() {
        try {
            return (DescribeQuerySuggestionsBlockListResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
