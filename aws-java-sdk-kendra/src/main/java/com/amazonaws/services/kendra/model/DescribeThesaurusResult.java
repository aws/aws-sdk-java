/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribeThesaurus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeThesaurusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the thesaurus.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The identifier of the index associated with the thesaurus to describe.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * The thesaurus name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The thesaurus description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The current status of the thesaurus. When the value is <code>ACTIVE</code>, queries are able to use the
     * thesaurus. If the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field
     * provides more information.
     * </p>
     * <p>
     * If the status is <code>ACTIVE_BUT_UPDATE_FAILED</code>, it means that Amazon Kendra could not ingest the new
     * thesaurus file. The old thesaurus file is still active.
     * </p>
     */
    private String status;
    /**
     * <p>
     * When the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field provides
     * more information.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * The Unix datetime that the thesaurus was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Unix datetime that the thesaurus was last updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * An AWS Identity and Access Management (IAM) role that gives Amazon Kendra permissions to access thesaurus file
     * specified in <code>SourceS3Path</code>.
     * </p>
     */
    private String roleArn;

    private S3Path sourceS3Path;
    /**
     * <p>
     * The size of the thesaurus file in bytes.
     * </p>
     */
    private Long fileSizeBytes;
    /**
     * <p>
     * The number of unique terms in the thesaurus file. For example, the synonyms <code>a,b,c</code> and
     * <code>a=&gt;d</code>, the term count would be 4.
     * </p>
     */
    private Long termCount;
    /**
     * <p>
     * The number of synonym rules in the thesaurus file.
     * </p>
     */
    private Long synonymRuleCount;

    /**
     * <p>
     * The identifier of the thesaurus.
     * </p>
     * 
     * @param id
     *        The identifier of the thesaurus.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the thesaurus.
     * </p>
     * 
     * @return The identifier of the thesaurus.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the thesaurus.
     * </p>
     * 
     * @param id
     *        The identifier of the thesaurus.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThesaurusResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The identifier of the index associated with the thesaurus to describe.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index associated with the thesaurus to describe.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index associated with the thesaurus to describe.
     * </p>
     * 
     * @return The identifier of the index associated with the thesaurus to describe.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index associated with the thesaurus to describe.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index associated with the thesaurus to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThesaurusResult withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * The thesaurus name.
     * </p>
     * 
     * @param name
     *        The thesaurus name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The thesaurus name.
     * </p>
     * 
     * @return The thesaurus name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The thesaurus name.
     * </p>
     * 
     * @param name
     *        The thesaurus name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThesaurusResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The thesaurus description.
     * </p>
     * 
     * @param description
     *        The thesaurus description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The thesaurus description.
     * </p>
     * 
     * @return The thesaurus description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The thesaurus description.
     * </p>
     * 
     * @param description
     *        The thesaurus description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThesaurusResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The current status of the thesaurus. When the value is <code>ACTIVE</code>, queries are able to use the
     * thesaurus. If the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field
     * provides more information.
     * </p>
     * <p>
     * If the status is <code>ACTIVE_BUT_UPDATE_FAILED</code>, it means that Amazon Kendra could not ingest the new
     * thesaurus file. The old thesaurus file is still active.
     * </p>
     * 
     * @param status
     *        The current status of the thesaurus. When the value is <code>ACTIVE</code>, queries are able to use the
     *        thesaurus. If the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code>
     *        field provides more information. </p>
     *        <p>
     *        If the status is <code>ACTIVE_BUT_UPDATE_FAILED</code>, it means that Amazon Kendra could not ingest the
     *        new thesaurus file. The old thesaurus file is still active.
     * @see ThesaurusStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the thesaurus. When the value is <code>ACTIVE</code>, queries are able to use the
     * thesaurus. If the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field
     * provides more information.
     * </p>
     * <p>
     * If the status is <code>ACTIVE_BUT_UPDATE_FAILED</code>, it means that Amazon Kendra could not ingest the new
     * thesaurus file. The old thesaurus file is still active.
     * </p>
     * 
     * @return The current status of the thesaurus. When the value is <code>ACTIVE</code>, queries are able to use the
     *         thesaurus. If the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code>
     *         field provides more information. </p>
     *         <p>
     *         If the status is <code>ACTIVE_BUT_UPDATE_FAILED</code>, it means that Amazon Kendra could not ingest the
     *         new thesaurus file. The old thesaurus file is still active.
     * @see ThesaurusStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the thesaurus. When the value is <code>ACTIVE</code>, queries are able to use the
     * thesaurus. If the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field
     * provides more information.
     * </p>
     * <p>
     * If the status is <code>ACTIVE_BUT_UPDATE_FAILED</code>, it means that Amazon Kendra could not ingest the new
     * thesaurus file. The old thesaurus file is still active.
     * </p>
     * 
     * @param status
     *        The current status of the thesaurus. When the value is <code>ACTIVE</code>, queries are able to use the
     *        thesaurus. If the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code>
     *        field provides more information. </p>
     *        <p>
     *        If the status is <code>ACTIVE_BUT_UPDATE_FAILED</code>, it means that Amazon Kendra could not ingest the
     *        new thesaurus file. The old thesaurus file is still active.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThesaurusStatus
     */

    public DescribeThesaurusResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the thesaurus. When the value is <code>ACTIVE</code>, queries are able to use the
     * thesaurus. If the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field
     * provides more information.
     * </p>
     * <p>
     * If the status is <code>ACTIVE_BUT_UPDATE_FAILED</code>, it means that Amazon Kendra could not ingest the new
     * thesaurus file. The old thesaurus file is still active.
     * </p>
     * 
     * @param status
     *        The current status of the thesaurus. When the value is <code>ACTIVE</code>, queries are able to use the
     *        thesaurus. If the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code>
     *        field provides more information. </p>
     *        <p>
     *        If the status is <code>ACTIVE_BUT_UPDATE_FAILED</code>, it means that Amazon Kendra could not ingest the
     *        new thesaurus file. The old thesaurus file is still active.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThesaurusStatus
     */

    public DescribeThesaurusResult withStatus(ThesaurusStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * When the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field provides
     * more information.
     * </p>
     * 
     * @param errorMessage
     *        When the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field
     *        provides more information.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * When the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field provides
     * more information.
     * </p>
     * 
     * @return When the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field
     *         provides more information.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * When the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field provides
     * more information.
     * </p>
     * 
     * @param errorMessage
     *        When the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field
     *        provides more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThesaurusResult withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The Unix datetime that the thesaurus was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix datetime that the thesaurus was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix datetime that the thesaurus was created.
     * </p>
     * 
     * @return The Unix datetime that the thesaurus was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The Unix datetime that the thesaurus was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix datetime that the thesaurus was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThesaurusResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Unix datetime that the thesaurus was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix datetime that the thesaurus was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The Unix datetime that the thesaurus was last updated.
     * </p>
     * 
     * @return The Unix datetime that the thesaurus was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The Unix datetime that the thesaurus was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix datetime that the thesaurus was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThesaurusResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * An AWS Identity and Access Management (IAM) role that gives Amazon Kendra permissions to access thesaurus file
     * specified in <code>SourceS3Path</code>.
     * </p>
     * 
     * @param roleArn
     *        An AWS Identity and Access Management (IAM) role that gives Amazon Kendra permissions to access thesaurus
     *        file specified in <code>SourceS3Path</code>.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * An AWS Identity and Access Management (IAM) role that gives Amazon Kendra permissions to access thesaurus file
     * specified in <code>SourceS3Path</code>.
     * </p>
     * 
     * @return An AWS Identity and Access Management (IAM) role that gives Amazon Kendra permissions to access thesaurus
     *         file specified in <code>SourceS3Path</code>.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * An AWS Identity and Access Management (IAM) role that gives Amazon Kendra permissions to access thesaurus file
     * specified in <code>SourceS3Path</code>.
     * </p>
     * 
     * @param roleArn
     *        An AWS Identity and Access Management (IAM) role that gives Amazon Kendra permissions to access thesaurus
     *        file specified in <code>SourceS3Path</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThesaurusResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * @param sourceS3Path
     */

    public void setSourceS3Path(S3Path sourceS3Path) {
        this.sourceS3Path = sourceS3Path;
    }

    /**
     * @return
     */

    public S3Path getSourceS3Path() {
        return this.sourceS3Path;
    }

    /**
     * @param sourceS3Path
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThesaurusResult withSourceS3Path(S3Path sourceS3Path) {
        setSourceS3Path(sourceS3Path);
        return this;
    }

    /**
     * <p>
     * The size of the thesaurus file in bytes.
     * </p>
     * 
     * @param fileSizeBytes
     *        The size of the thesaurus file in bytes.
     */

    public void setFileSizeBytes(Long fileSizeBytes) {
        this.fileSizeBytes = fileSizeBytes;
    }

    /**
     * <p>
     * The size of the thesaurus file in bytes.
     * </p>
     * 
     * @return The size of the thesaurus file in bytes.
     */

    public Long getFileSizeBytes() {
        return this.fileSizeBytes;
    }

    /**
     * <p>
     * The size of the thesaurus file in bytes.
     * </p>
     * 
     * @param fileSizeBytes
     *        The size of the thesaurus file in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThesaurusResult withFileSizeBytes(Long fileSizeBytes) {
        setFileSizeBytes(fileSizeBytes);
        return this;
    }

    /**
     * <p>
     * The number of unique terms in the thesaurus file. For example, the synonyms <code>a,b,c</code> and
     * <code>a=&gt;d</code>, the term count would be 4.
     * </p>
     * 
     * @param termCount
     *        The number of unique terms in the thesaurus file. For example, the synonyms <code>a,b,c</code> and
     *        <code>a=&gt;d</code>, the term count would be 4.
     */

    public void setTermCount(Long termCount) {
        this.termCount = termCount;
    }

    /**
     * <p>
     * The number of unique terms in the thesaurus file. For example, the synonyms <code>a,b,c</code> and
     * <code>a=&gt;d</code>, the term count would be 4.
     * </p>
     * 
     * @return The number of unique terms in the thesaurus file. For example, the synonyms <code>a,b,c</code> and
     *         <code>a=&gt;d</code>, the term count would be 4.
     */

    public Long getTermCount() {
        return this.termCount;
    }

    /**
     * <p>
     * The number of unique terms in the thesaurus file. For example, the synonyms <code>a,b,c</code> and
     * <code>a=&gt;d</code>, the term count would be 4.
     * </p>
     * 
     * @param termCount
     *        The number of unique terms in the thesaurus file. For example, the synonyms <code>a,b,c</code> and
     *        <code>a=&gt;d</code>, the term count would be 4.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThesaurusResult withTermCount(Long termCount) {
        setTermCount(termCount);
        return this;
    }

    /**
     * <p>
     * The number of synonym rules in the thesaurus file.
     * </p>
     * 
     * @param synonymRuleCount
     *        The number of synonym rules in the thesaurus file.
     */

    public void setSynonymRuleCount(Long synonymRuleCount) {
        this.synonymRuleCount = synonymRuleCount;
    }

    /**
     * <p>
     * The number of synonym rules in the thesaurus file.
     * </p>
     * 
     * @return The number of synonym rules in the thesaurus file.
     */

    public Long getSynonymRuleCount() {
        return this.synonymRuleCount;
    }

    /**
     * <p>
     * The number of synonym rules in the thesaurus file.
     * </p>
     * 
     * @param synonymRuleCount
     *        The number of synonym rules in the thesaurus file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThesaurusResult withSynonymRuleCount(Long synonymRuleCount) {
        setSynonymRuleCount(synonymRuleCount);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getSourceS3Path() != null)
            sb.append("SourceS3Path: ").append(getSourceS3Path()).append(",");
        if (getFileSizeBytes() != null)
            sb.append("FileSizeBytes: ").append(getFileSizeBytes()).append(",");
        if (getTermCount() != null)
            sb.append("TermCount: ").append(getTermCount()).append(",");
        if (getSynonymRuleCount() != null)
            sb.append("SynonymRuleCount: ").append(getSynonymRuleCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeThesaurusResult == false)
            return false;
        DescribeThesaurusResult other = (DescribeThesaurusResult) obj;
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
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getSourceS3Path() == null ^ this.getSourceS3Path() == null)
            return false;
        if (other.getSourceS3Path() != null && other.getSourceS3Path().equals(this.getSourceS3Path()) == false)
            return false;
        if (other.getFileSizeBytes() == null ^ this.getFileSizeBytes() == null)
            return false;
        if (other.getFileSizeBytes() != null && other.getFileSizeBytes().equals(this.getFileSizeBytes()) == false)
            return false;
        if (other.getTermCount() == null ^ this.getTermCount() == null)
            return false;
        if (other.getTermCount() != null && other.getTermCount().equals(this.getTermCount()) == false)
            return false;
        if (other.getSynonymRuleCount() == null ^ this.getSynonymRuleCount() == null)
            return false;
        if (other.getSynonymRuleCount() != null && other.getSynonymRuleCount().equals(this.getSynonymRuleCount()) == false)
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
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSourceS3Path() == null) ? 0 : getSourceS3Path().hashCode());
        hashCode = prime * hashCode + ((getFileSizeBytes() == null) ? 0 : getFileSizeBytes().hashCode());
        hashCode = prime * hashCode + ((getTermCount() == null) ? 0 : getTermCount().hashCode());
        hashCode = prime * hashCode + ((getSynonymRuleCount() == null) ? 0 : getSynonymRuleCount().hashCode());
        return hashCode;
    }

    @Override
    public DescribeThesaurusResult clone() {
        try {
            return (DescribeThesaurusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
