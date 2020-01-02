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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribeIndex" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeIndexResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the index.
     * </p>
     */
    private String name;
    /**
     * <p>
     * the name of the index.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that gives Amazon Kendra permission to write to your Amazon
     * Cloudwatch logs.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The identifier of the AWS KMS customer master key (CMK) used to encrypt your data. Amazon Kendra doesn't support
     * asymmetric CMKs.
     * </p>
     */
    private ServerSideEncryptionConfiguration serverSideEncryptionConfiguration;
    /**
     * <p>
     * The current status of the index. When the value is <code>ACTIVE</code>, the index is ready for use. If the
     * <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field contains a message
     * that explains why.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The description of the index.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Unix datetime that the index was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Unix datetime that the index was last updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * Configuration settings for any metadata applied to the documents in the index.
     * </p>
     */
    private java.util.List<DocumentMetadataConfiguration> documentMetadataConfigurations;
    /**
     * <p>
     * Provides information about the number of FAQ questions and answers and the number of text documents indexed.
     * </p>
     */
    private IndexStatistics indexStatistics;
    /**
     * <p>
     * When th e<code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field contains a
     * message that explains why.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The name of the index.
     * </p>
     * 
     * @param name
     *        The name of the index.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the index.
     * </p>
     * 
     * @return The name of the index.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the index.
     * </p>
     * 
     * @param name
     *        The name of the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIndexResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * the name of the index.
     * </p>
     * 
     * @param id
     *        the name of the index.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * the name of the index.
     * </p>
     * 
     * @return the name of the index.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * the name of the index.
     * </p>
     * 
     * @param id
     *        the name of the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIndexResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that gives Amazon Kendra permission to write to your Amazon
     * Cloudwatch logs.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role that gives Amazon Kendra permission to write to your Amazon
     *        Cloudwatch logs.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that gives Amazon Kendra permission to write to your Amazon
     * Cloudwatch logs.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM role that gives Amazon Kendra permission to write to your
     *         Amazon Cloudwatch logs.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM role that gives Amazon Kendra permission to write to your Amazon
     * Cloudwatch logs.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the IAM role that gives Amazon Kendra permission to write to your Amazon
     *        Cloudwatch logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIndexResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the AWS KMS customer master key (CMK) used to encrypt your data. Amazon Kendra doesn't support
     * asymmetric CMKs.
     * </p>
     * 
     * @param serverSideEncryptionConfiguration
     *        The identifier of the AWS KMS customer master key (CMK) used to encrypt your data. Amazon Kendra doesn't
     *        support asymmetric CMKs.
     */

    public void setServerSideEncryptionConfiguration(ServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
        this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
    }

    /**
     * <p>
     * The identifier of the AWS KMS customer master key (CMK) used to encrypt your data. Amazon Kendra doesn't support
     * asymmetric CMKs.
     * </p>
     * 
     * @return The identifier of the AWS KMS customer master key (CMK) used to encrypt your data. Amazon Kendra doesn't
     *         support asymmetric CMKs.
     */

    public ServerSideEncryptionConfiguration getServerSideEncryptionConfiguration() {
        return this.serverSideEncryptionConfiguration;
    }

    /**
     * <p>
     * The identifier of the AWS KMS customer master key (CMK) used to encrypt your data. Amazon Kendra doesn't support
     * asymmetric CMKs.
     * </p>
     * 
     * @param serverSideEncryptionConfiguration
     *        The identifier of the AWS KMS customer master key (CMK) used to encrypt your data. Amazon Kendra doesn't
     *        support asymmetric CMKs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIndexResult withServerSideEncryptionConfiguration(ServerSideEncryptionConfiguration serverSideEncryptionConfiguration) {
        setServerSideEncryptionConfiguration(serverSideEncryptionConfiguration);
        return this;
    }

    /**
     * <p>
     * The current status of the index. When the value is <code>ACTIVE</code>, the index is ready for use. If the
     * <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field contains a message
     * that explains why.
     * </p>
     * 
     * @param status
     *        The current status of the index. When the value is <code>ACTIVE</code>, the index is ready for use. If the
     *        <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field contains a
     *        message that explains why.
     * @see IndexStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the index. When the value is <code>ACTIVE</code>, the index is ready for use. If the
     * <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field contains a message
     * that explains why.
     * </p>
     * 
     * @return The current status of the index. When the value is <code>ACTIVE</code>, the index is ready for use. If
     *         the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field contains
     *         a message that explains why.
     * @see IndexStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the index. When the value is <code>ACTIVE</code>, the index is ready for use. If the
     * <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field contains a message
     * that explains why.
     * </p>
     * 
     * @param status
     *        The current status of the index. When the value is <code>ACTIVE</code>, the index is ready for use. If the
     *        <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field contains a
     *        message that explains why.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IndexStatus
     */

    public DescribeIndexResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the index. When the value is <code>ACTIVE</code>, the index is ready for use. If the
     * <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field contains a message
     * that explains why.
     * </p>
     * 
     * @param status
     *        The current status of the index. When the value is <code>ACTIVE</code>, the index is ready for use. If the
     *        <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field contains a
     *        message that explains why.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IndexStatus
     */

    public DescribeIndexResult withStatus(IndexStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The description of the index.
     * </p>
     * 
     * @param description
     *        The description of the index.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the index.
     * </p>
     * 
     * @return The description of the index.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the index.
     * </p>
     * 
     * @param description
     *        The description of the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIndexResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Unix datetime that the index was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix datetime that the index was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix datetime that the index was created.
     * </p>
     * 
     * @return The Unix datetime that the index was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The Unix datetime that the index was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix datetime that the index was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIndexResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Unix datetime that the index was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix datetime that the index was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The Unix datetime that the index was last updated.
     * </p>
     * 
     * @return The Unix datetime that the index was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The Unix datetime that the index was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix datetime that the index was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIndexResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * Configuration settings for any metadata applied to the documents in the index.
     * </p>
     * 
     * @return Configuration settings for any metadata applied to the documents in the index.
     */

    public java.util.List<DocumentMetadataConfiguration> getDocumentMetadataConfigurations() {
        return documentMetadataConfigurations;
    }

    /**
     * <p>
     * Configuration settings for any metadata applied to the documents in the index.
     * </p>
     * 
     * @param documentMetadataConfigurations
     *        Configuration settings for any metadata applied to the documents in the index.
     */

    public void setDocumentMetadataConfigurations(java.util.Collection<DocumentMetadataConfiguration> documentMetadataConfigurations) {
        if (documentMetadataConfigurations == null) {
            this.documentMetadataConfigurations = null;
            return;
        }

        this.documentMetadataConfigurations = new java.util.ArrayList<DocumentMetadataConfiguration>(documentMetadataConfigurations);
    }

    /**
     * <p>
     * Configuration settings for any metadata applied to the documents in the index.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDocumentMetadataConfigurations(java.util.Collection)} or
     * {@link #withDocumentMetadataConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param documentMetadataConfigurations
     *        Configuration settings for any metadata applied to the documents in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIndexResult withDocumentMetadataConfigurations(DocumentMetadataConfiguration... documentMetadataConfigurations) {
        if (this.documentMetadataConfigurations == null) {
            setDocumentMetadataConfigurations(new java.util.ArrayList<DocumentMetadataConfiguration>(documentMetadataConfigurations.length));
        }
        for (DocumentMetadataConfiguration ele : documentMetadataConfigurations) {
            this.documentMetadataConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Configuration settings for any metadata applied to the documents in the index.
     * </p>
     * 
     * @param documentMetadataConfigurations
     *        Configuration settings for any metadata applied to the documents in the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIndexResult withDocumentMetadataConfigurations(java.util.Collection<DocumentMetadataConfiguration> documentMetadataConfigurations) {
        setDocumentMetadataConfigurations(documentMetadataConfigurations);
        return this;
    }

    /**
     * <p>
     * Provides information about the number of FAQ questions and answers and the number of text documents indexed.
     * </p>
     * 
     * @param indexStatistics
     *        Provides information about the number of FAQ questions and answers and the number of text documents
     *        indexed.
     */

    public void setIndexStatistics(IndexStatistics indexStatistics) {
        this.indexStatistics = indexStatistics;
    }

    /**
     * <p>
     * Provides information about the number of FAQ questions and answers and the number of text documents indexed.
     * </p>
     * 
     * @return Provides information about the number of FAQ questions and answers and the number of text documents
     *         indexed.
     */

    public IndexStatistics getIndexStatistics() {
        return this.indexStatistics;
    }

    /**
     * <p>
     * Provides information about the number of FAQ questions and answers and the number of text documents indexed.
     * </p>
     * 
     * @param indexStatistics
     *        Provides information about the number of FAQ questions and answers and the number of text documents
     *        indexed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIndexResult withIndexStatistics(IndexStatistics indexStatistics) {
        setIndexStatistics(indexStatistics);
        return this;
    }

    /**
     * <p>
     * When th e<code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field contains a
     * message that explains why.
     * </p>
     * 
     * @param errorMessage
     *        When th e<code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field
     *        contains a message that explains why.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * When th e<code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field contains a
     * message that explains why.
     * </p>
     * 
     * @return When th e<code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field
     *         contains a message that explains why.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * When th e<code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field contains a
     * message that explains why.
     * </p>
     * 
     * @param errorMessage
     *        When th e<code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field
     *        contains a message that explains why.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIndexResult withErrorMessage(String errorMessage) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getServerSideEncryptionConfiguration() != null)
            sb.append("ServerSideEncryptionConfiguration: ").append(getServerSideEncryptionConfiguration()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getDocumentMetadataConfigurations() != null)
            sb.append("DocumentMetadataConfigurations: ").append(getDocumentMetadataConfigurations()).append(",");
        if (getIndexStatistics() != null)
            sb.append("IndexStatistics: ").append(getIndexStatistics()).append(",");
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

        if (obj instanceof DescribeIndexResult == false)
            return false;
        DescribeIndexResult other = (DescribeIndexResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getServerSideEncryptionConfiguration() == null ^ this.getServerSideEncryptionConfiguration() == null)
            return false;
        if (other.getServerSideEncryptionConfiguration() != null
                && other.getServerSideEncryptionConfiguration().equals(this.getServerSideEncryptionConfiguration()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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
        if (other.getDocumentMetadataConfigurations() == null ^ this.getDocumentMetadataConfigurations() == null)
            return false;
        if (other.getDocumentMetadataConfigurations() != null
                && other.getDocumentMetadataConfigurations().equals(this.getDocumentMetadataConfigurations()) == false)
            return false;
        if (other.getIndexStatistics() == null ^ this.getIndexStatistics() == null)
            return false;
        if (other.getIndexStatistics() != null && other.getIndexStatistics().equals(this.getIndexStatistics()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getServerSideEncryptionConfiguration() == null) ? 0 : getServerSideEncryptionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getDocumentMetadataConfigurations() == null) ? 0 : getDocumentMetadataConfigurations().hashCode());
        hashCode = prime * hashCode + ((getIndexStatistics() == null) ? 0 : getIndexStatistics().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public DescribeIndexResult clone() {
        try {
            return (DescribeIndexResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
