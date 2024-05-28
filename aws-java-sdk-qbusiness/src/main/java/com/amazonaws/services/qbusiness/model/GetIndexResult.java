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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetIndex" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIndexResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Q Business application associated with the index.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The identifier of the Amazon Q Business index.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * The name of the Amazon Q Business index.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The type of index attached to your Amazon Q Business application.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Q Business index.
     * </p>
     */
    private String indexArn;
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
     * The description for the Amazon Q Business index.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business index was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business index was last updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The storage capacity units chosen for your Amazon Q Business index.
     * </p>
     */
    private IndexCapacityConfiguration capacityConfiguration;
    /**
     * <p>
     * Configuration information for document attributes or metadata. Document metadata are fields associated with your
     * documents. For example, the company department name associated with each document. For more information, see <a
     * href="https://docs.aws.amazon.com/amazonq/latest/business-use-dg/doc-attributes-types.html#doc-attributes">
     * Understanding document attributes</a>.
     * </p>
     */
    private java.util.List<DocumentAttributeConfiguration> documentAttributeConfigurations;
    /**
     * <p>
     * When the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field contains a
     * message that explains why.
     * </p>
     */
    private ErrorDetail error;
    /**
     * <p>
     * Provides information about the number of documents indexed.
     * </p>
     */
    private IndexStatistics indexStatistics;

    /**
     * <p>
     * The identifier of the Amazon Q Business application associated with the index.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the Amazon Q Business application associated with the index.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business application associated with the index.
     * </p>
     * 
     * @return The identifier of the Amazon Q Business application associated with the index.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business application associated with the index.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the Amazon Q Business application associated with the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIndexResult withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business index.
     * </p>
     * 
     * @param indexId
     *        The identifier of the Amazon Q Business index.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business index.
     * </p>
     * 
     * @return The identifier of the Amazon Q Business index.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business index.
     * </p>
     * 
     * @param indexId
     *        The identifier of the Amazon Q Business index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIndexResult withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Q Business index.
     * </p>
     * 
     * @param displayName
     *        The name of the Amazon Q Business index.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the Amazon Q Business index.
     * </p>
     * 
     * @return The name of the Amazon Q Business index.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name of the Amazon Q Business index.
     * </p>
     * 
     * @param displayName
     *        The name of the Amazon Q Business index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIndexResult withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The type of index attached to your Amazon Q Business application.
     * </p>
     * 
     * @param type
     *        The type of index attached to your Amazon Q Business application.
     * @see IndexType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of index attached to your Amazon Q Business application.
     * </p>
     * 
     * @return The type of index attached to your Amazon Q Business application.
     * @see IndexType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of index attached to your Amazon Q Business application.
     * </p>
     * 
     * @param type
     *        The type of index attached to your Amazon Q Business application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IndexType
     */

    public GetIndexResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of index attached to your Amazon Q Business application.
     * </p>
     * 
     * @param type
     *        The type of index attached to your Amazon Q Business application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IndexType
     */

    public GetIndexResult withType(IndexType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Q Business index.
     * </p>
     * 
     * @param indexArn
     *        The Amazon Resource Name (ARN) of the Amazon Q Business index.
     */

    public void setIndexArn(String indexArn) {
        this.indexArn = indexArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Q Business index.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon Q Business index.
     */

    public String getIndexArn() {
        return this.indexArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon Q Business index.
     * </p>
     * 
     * @param indexArn
     *        The Amazon Resource Name (ARN) of the Amazon Q Business index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIndexResult withIndexArn(String indexArn) {
        setIndexArn(indexArn);
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

    public GetIndexResult withStatus(String status) {
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

    public GetIndexResult withStatus(IndexStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The description for the Amazon Q Business index.
     * </p>
     * 
     * @param description
     *        The description for the Amazon Q Business index.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the Amazon Q Business index.
     * </p>
     * 
     * @return The description for the Amazon Q Business index.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the Amazon Q Business index.
     * </p>
     * 
     * @param description
     *        The description for the Amazon Q Business index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIndexResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business index was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp when the Amazon Q Business index was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business index was created.
     * </p>
     * 
     * @return The Unix timestamp when the Amazon Q Business index was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business index was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp when the Amazon Q Business index was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIndexResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business index was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix timestamp when the Amazon Q Business index was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business index was last updated.
     * </p>
     * 
     * @return The Unix timestamp when the Amazon Q Business index was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The Unix timestamp when the Amazon Q Business index was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix timestamp when the Amazon Q Business index was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIndexResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The storage capacity units chosen for your Amazon Q Business index.
     * </p>
     * 
     * @param capacityConfiguration
     *        The storage capacity units chosen for your Amazon Q Business index.
     */

    public void setCapacityConfiguration(IndexCapacityConfiguration capacityConfiguration) {
        this.capacityConfiguration = capacityConfiguration;
    }

    /**
     * <p>
     * The storage capacity units chosen for your Amazon Q Business index.
     * </p>
     * 
     * @return The storage capacity units chosen for your Amazon Q Business index.
     */

    public IndexCapacityConfiguration getCapacityConfiguration() {
        return this.capacityConfiguration;
    }

    /**
     * <p>
     * The storage capacity units chosen for your Amazon Q Business index.
     * </p>
     * 
     * @param capacityConfiguration
     *        The storage capacity units chosen for your Amazon Q Business index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIndexResult withCapacityConfiguration(IndexCapacityConfiguration capacityConfiguration) {
        setCapacityConfiguration(capacityConfiguration);
        return this;
    }

    /**
     * <p>
     * Configuration information for document attributes or metadata. Document metadata are fields associated with your
     * documents. For example, the company department name associated with each document. For more information, see <a
     * href="https://docs.aws.amazon.com/amazonq/latest/business-use-dg/doc-attributes-types.html#doc-attributes">
     * Understanding document attributes</a>.
     * </p>
     * 
     * @return Configuration information for document attributes or metadata. Document metadata are fields associated
     *         with your documents. For example, the company department name associated with each document. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/amazonq/latest/business-use-dg/doc-attributes-types.html#doc-attributes"
     *         >Understanding document attributes</a>.
     */

    public java.util.List<DocumentAttributeConfiguration> getDocumentAttributeConfigurations() {
        return documentAttributeConfigurations;
    }

    /**
     * <p>
     * Configuration information for document attributes or metadata. Document metadata are fields associated with your
     * documents. For example, the company department name associated with each document. For more information, see <a
     * href="https://docs.aws.amazon.com/amazonq/latest/business-use-dg/doc-attributes-types.html#doc-attributes">
     * Understanding document attributes</a>.
     * </p>
     * 
     * @param documentAttributeConfigurations
     *        Configuration information for document attributes or metadata. Document metadata are fields associated
     *        with your documents. For example, the company department name associated with each document. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/amazonq/latest/business-use-dg/doc-attributes-types.html#doc-attributes"
     *        >Understanding document attributes</a>.
     */

    public void setDocumentAttributeConfigurations(java.util.Collection<DocumentAttributeConfiguration> documentAttributeConfigurations) {
        if (documentAttributeConfigurations == null) {
            this.documentAttributeConfigurations = null;
            return;
        }

        this.documentAttributeConfigurations = new java.util.ArrayList<DocumentAttributeConfiguration>(documentAttributeConfigurations);
    }

    /**
     * <p>
     * Configuration information for document attributes or metadata. Document metadata are fields associated with your
     * documents. For example, the company department name associated with each document. For more information, see <a
     * href="https://docs.aws.amazon.com/amazonq/latest/business-use-dg/doc-attributes-types.html#doc-attributes">
     * Understanding document attributes</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDocumentAttributeConfigurations(java.util.Collection)} or
     * {@link #withDocumentAttributeConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param documentAttributeConfigurations
     *        Configuration information for document attributes or metadata. Document metadata are fields associated
     *        with your documents. For example, the company department name associated with each document. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/amazonq/latest/business-use-dg/doc-attributes-types.html#doc-attributes"
     *        >Understanding document attributes</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIndexResult withDocumentAttributeConfigurations(DocumentAttributeConfiguration... documentAttributeConfigurations) {
        if (this.documentAttributeConfigurations == null) {
            setDocumentAttributeConfigurations(new java.util.ArrayList<DocumentAttributeConfiguration>(documentAttributeConfigurations.length));
        }
        for (DocumentAttributeConfiguration ele : documentAttributeConfigurations) {
            this.documentAttributeConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Configuration information for document attributes or metadata. Document metadata are fields associated with your
     * documents. For example, the company department name associated with each document. For more information, see <a
     * href="https://docs.aws.amazon.com/amazonq/latest/business-use-dg/doc-attributes-types.html#doc-attributes">
     * Understanding document attributes</a>.
     * </p>
     * 
     * @param documentAttributeConfigurations
     *        Configuration information for document attributes or metadata. Document metadata are fields associated
     *        with your documents. For example, the company department name associated with each document. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/amazonq/latest/business-use-dg/doc-attributes-types.html#doc-attributes"
     *        >Understanding document attributes</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIndexResult withDocumentAttributeConfigurations(java.util.Collection<DocumentAttributeConfiguration> documentAttributeConfigurations) {
        setDocumentAttributeConfigurations(documentAttributeConfigurations);
        return this;
    }

    /**
     * <p>
     * When the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field contains a
     * message that explains why.
     * </p>
     * 
     * @param error
     *        When the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field
     *        contains a message that explains why.
     */

    public void setError(ErrorDetail error) {
        this.error = error;
    }

    /**
     * <p>
     * When the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field contains a
     * message that explains why.
     * </p>
     * 
     * @return When the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field
     *         contains a message that explains why.
     */

    public ErrorDetail getError() {
        return this.error;
    }

    /**
     * <p>
     * When the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field contains a
     * message that explains why.
     * </p>
     * 
     * @param error
     *        When the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field
     *        contains a message that explains why.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIndexResult withError(ErrorDetail error) {
        setError(error);
        return this;
    }

    /**
     * <p>
     * Provides information about the number of documents indexed.
     * </p>
     * 
     * @param indexStatistics
     *        Provides information about the number of documents indexed.
     */

    public void setIndexStatistics(IndexStatistics indexStatistics) {
        this.indexStatistics = indexStatistics;
    }

    /**
     * <p>
     * Provides information about the number of documents indexed.
     * </p>
     * 
     * @return Provides information about the number of documents indexed.
     */

    public IndexStatistics getIndexStatistics() {
        return this.indexStatistics;
    }

    /**
     * <p>
     * Provides information about the number of documents indexed.
     * </p>
     * 
     * @param indexStatistics
     *        Provides information about the number of documents indexed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetIndexResult withIndexStatistics(IndexStatistics indexStatistics) {
        setIndexStatistics(indexStatistics);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getIndexArn() != null)
            sb.append("IndexArn: ").append(getIndexArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getCapacityConfiguration() != null)
            sb.append("CapacityConfiguration: ").append(getCapacityConfiguration()).append(",");
        if (getDocumentAttributeConfigurations() != null)
            sb.append("DocumentAttributeConfigurations: ").append(getDocumentAttributeConfigurations()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError()).append(",");
        if (getIndexStatistics() != null)
            sb.append("IndexStatistics: ").append(getIndexStatistics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetIndexResult == false)
            return false;
        GetIndexResult other = (GetIndexResult) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getIndexArn() == null ^ this.getIndexArn() == null)
            return false;
        if (other.getIndexArn() != null && other.getIndexArn().equals(this.getIndexArn()) == false)
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
        if (other.getCapacityConfiguration() == null ^ this.getCapacityConfiguration() == null)
            return false;
        if (other.getCapacityConfiguration() != null && other.getCapacityConfiguration().equals(this.getCapacityConfiguration()) == false)
            return false;
        if (other.getDocumentAttributeConfigurations() == null ^ this.getDocumentAttributeConfigurations() == null)
            return false;
        if (other.getDocumentAttributeConfigurations() != null
                && other.getDocumentAttributeConfigurations().equals(this.getDocumentAttributeConfigurations()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getIndexStatistics() == null ^ this.getIndexStatistics() == null)
            return false;
        if (other.getIndexStatistics() != null && other.getIndexStatistics().equals(this.getIndexStatistics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getIndexArn() == null) ? 0 : getIndexArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getCapacityConfiguration() == null) ? 0 : getCapacityConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDocumentAttributeConfigurations() == null) ? 0 : getDocumentAttributeConfigurations().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getIndexStatistics() == null) ? 0 : getIndexStatistics().hashCode());
        return hashCode;
    }

    @Override
    public GetIndexResult clone() {
        try {
            return (GetIndexResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
