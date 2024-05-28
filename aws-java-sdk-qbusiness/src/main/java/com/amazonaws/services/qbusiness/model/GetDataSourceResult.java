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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/GetDataSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDataSourceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Q Business application.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The identifier of the index linked to the data source connector.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * The identifier of the data source connector.
     * </p>
     */
    private String dataSourceId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data source.
     * </p>
     */
    private String dataSourceArn;
    /**
     * <p>
     * The name for the data source connector.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The type of the data source connector. For example, <code>S3</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Configuration information for an Amazon VPC (Virtual Private Cloud) to connect to your data source.
     * </p>
     */
    private DataSourceVpcConfiguration vpcConfiguration;
    /**
     * <p>
     * The Unix timestamp when the data source connector was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The Unix timestamp when the data source connector was last updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The description for the data source connector.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The current status of the data source connector. When the <code>Status</code> field value is <code>FAILED</code>,
     * the <code>ErrorMessage</code> field contains a description of the error that caused the data source connector to
     * fail.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The schedule for Amazon Q Business to update the index.
     * </p>
     */
    private String syncSchedule;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role with permission to access the data source and required resources.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * When the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field contains a
     * description of the error that caused the data source connector to fail.
     * </p>
     */
    private ErrorDetail error;

    private DocumentEnrichmentConfiguration documentEnrichmentConfiguration;

    /**
     * <p>
     * The identifier of the Amazon Q Business application.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the Amazon Q Business application.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business application.
     * </p>
     * 
     * @return The identifier of the Amazon Q Business application.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The identifier of the Amazon Q Business application.
     * </p>
     * 
     * @param applicationId
     *        The identifier of the Amazon Q Business application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The identifier of the index linked to the data source connector.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index linked to the data source connector.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index linked to the data source connector.
     * </p>
     * 
     * @return The identifier of the index linked to the data source connector.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index linked to the data source connector.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index linked to the data source connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * The identifier of the data source connector.
     * </p>
     * 
     * @param dataSourceId
     *        The identifier of the data source connector.
     */

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * <p>
     * The identifier of the data source connector.
     * </p>
     * 
     * @return The identifier of the data source connector.
     */

    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * <p>
     * The identifier of the data source connector.
     * </p>
     * 
     * @param dataSourceId
     *        The identifier of the data source connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withDataSourceId(String dataSourceId) {
        setDataSourceId(dataSourceId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data source.
     * </p>
     * 
     * @param dataSourceArn
     *        The Amazon Resource Name (ARN) of the data source.
     */

    public void setDataSourceArn(String dataSourceArn) {
        this.dataSourceArn = dataSourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data source.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the data source.
     */

    public String getDataSourceArn() {
        return this.dataSourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data source.
     * </p>
     * 
     * @param dataSourceArn
     *        The Amazon Resource Name (ARN) of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withDataSourceArn(String dataSourceArn) {
        setDataSourceArn(dataSourceArn);
        return this;
    }

    /**
     * <p>
     * The name for the data source connector.
     * </p>
     * 
     * @param displayName
     *        The name for the data source connector.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name for the data source connector.
     * </p>
     * 
     * @return The name for the data source connector.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name for the data source connector.
     * </p>
     * 
     * @param displayName
     *        The name for the data source connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The type of the data source connector. For example, <code>S3</code>.
     * </p>
     * 
     * @param type
     *        The type of the data source connector. For example, <code>S3</code>.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the data source connector. For example, <code>S3</code>.
     * </p>
     * 
     * @return The type of the data source connector. For example, <code>S3</code>.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the data source connector. For example, <code>S3</code>.
     * </p>
     * 
     * @param type
     *        The type of the data source connector. For example, <code>S3</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Configuration information for an Amazon VPC (Virtual Private Cloud) to connect to your data source.
     * </p>
     * 
     * @param vpcConfiguration
     *        Configuration information for an Amazon VPC (Virtual Private Cloud) to connect to your data source.
     */

    public void setVpcConfiguration(DataSourceVpcConfiguration vpcConfiguration) {
        this.vpcConfiguration = vpcConfiguration;
    }

    /**
     * <p>
     * Configuration information for an Amazon VPC (Virtual Private Cloud) to connect to your data source.
     * </p>
     * 
     * @return Configuration information for an Amazon VPC (Virtual Private Cloud) to connect to your data source.
     */

    public DataSourceVpcConfiguration getVpcConfiguration() {
        return this.vpcConfiguration;
    }

    /**
     * <p>
     * Configuration information for an Amazon VPC (Virtual Private Cloud) to connect to your data source.
     * </p>
     * 
     * @param vpcConfiguration
     *        Configuration information for an Amazon VPC (Virtual Private Cloud) to connect to your data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withVpcConfiguration(DataSourceVpcConfiguration vpcConfiguration) {
        setVpcConfiguration(vpcConfiguration);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp when the data source connector was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp when the data source connector was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix timestamp when the data source connector was created.
     * </p>
     * 
     * @return The Unix timestamp when the data source connector was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The Unix timestamp when the data source connector was created.
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp when the data source connector was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp when the data source connector was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix timestamp when the data source connector was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The Unix timestamp when the data source connector was last updated.
     * </p>
     * 
     * @return The Unix timestamp when the data source connector was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The Unix timestamp when the data source connector was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The Unix timestamp when the data source connector was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The description for the data source connector.
     * </p>
     * 
     * @param description
     *        The description for the data source connector.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the data source connector.
     * </p>
     * 
     * @return The description for the data source connector.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the data source connector.
     * </p>
     * 
     * @param description
     *        The description for the data source connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The current status of the data source connector. When the <code>Status</code> field value is <code>FAILED</code>,
     * the <code>ErrorMessage</code> field contains a description of the error that caused the data source connector to
     * fail.
     * </p>
     * 
     * @param status
     *        The current status of the data source connector. When the <code>Status</code> field value is
     *        <code>FAILED</code>, the <code>ErrorMessage</code> field contains a description of the error that caused
     *        the data source connector to fail.
     * @see DataSourceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the data source connector. When the <code>Status</code> field value is <code>FAILED</code>,
     * the <code>ErrorMessage</code> field contains a description of the error that caused the data source connector to
     * fail.
     * </p>
     * 
     * @return The current status of the data source connector. When the <code>Status</code> field value is
     *         <code>FAILED</code>, the <code>ErrorMessage</code> field contains a description of the error that caused
     *         the data source connector to fail.
     * @see DataSourceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the data source connector. When the <code>Status</code> field value is <code>FAILED</code>,
     * the <code>ErrorMessage</code> field contains a description of the error that caused the data source connector to
     * fail.
     * </p>
     * 
     * @param status
     *        The current status of the data source connector. When the <code>Status</code> field value is
     *        <code>FAILED</code>, the <code>ErrorMessage</code> field contains a description of the error that caused
     *        the data source connector to fail.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceStatus
     */

    public GetDataSourceResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the data source connector. When the <code>Status</code> field value is <code>FAILED</code>,
     * the <code>ErrorMessage</code> field contains a description of the error that caused the data source connector to
     * fail.
     * </p>
     * 
     * @param status
     *        The current status of the data source connector. When the <code>Status</code> field value is
     *        <code>FAILED</code>, the <code>ErrorMessage</code> field contains a description of the error that caused
     *        the data source connector to fail.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceStatus
     */

    public GetDataSourceResult withStatus(DataSourceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The schedule for Amazon Q Business to update the index.
     * </p>
     * 
     * @param syncSchedule
     *        The schedule for Amazon Q Business to update the index.
     */

    public void setSyncSchedule(String syncSchedule) {
        this.syncSchedule = syncSchedule;
    }

    /**
     * <p>
     * The schedule for Amazon Q Business to update the index.
     * </p>
     * 
     * @return The schedule for Amazon Q Business to update the index.
     */

    public String getSyncSchedule() {
        return this.syncSchedule;
    }

    /**
     * <p>
     * The schedule for Amazon Q Business to update the index.
     * </p>
     * 
     * @param syncSchedule
     *        The schedule for Amazon Q Business to update the index.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withSyncSchedule(String syncSchedule) {
        setSyncSchedule(syncSchedule);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role with permission to access the data source and required resources.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role with permission to access the data source and required
     *        resources.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role with permission to access the data source and required resources.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the role with permission to access the data source and required
     *         resources.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role with permission to access the data source and required resources.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role with permission to access the data source and required
     *        resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * When the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field contains a
     * description of the error that caused the data source connector to fail.
     * </p>
     * 
     * @param error
     *        When the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field
     *        contains a description of the error that caused the data source connector to fail.
     */

    public void setError(ErrorDetail error) {
        this.error = error;
    }

    /**
     * <p>
     * When the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field contains a
     * description of the error that caused the data source connector to fail.
     * </p>
     * 
     * @return When the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field
     *         contains a description of the error that caused the data source connector to fail.
     */

    public ErrorDetail getError() {
        return this.error;
    }

    /**
     * <p>
     * When the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field contains a
     * description of the error that caused the data source connector to fail.
     * </p>
     * 
     * @param error
     *        When the <code>Status</code> field value is <code>FAILED</code>, the <code>ErrorMessage</code> field
     *        contains a description of the error that caused the data source connector to fail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withError(ErrorDetail error) {
        setError(error);
        return this;
    }

    /**
     * @param documentEnrichmentConfiguration
     */

    public void setDocumentEnrichmentConfiguration(DocumentEnrichmentConfiguration documentEnrichmentConfiguration) {
        this.documentEnrichmentConfiguration = documentEnrichmentConfiguration;
    }

    /**
     * @return
     */

    public DocumentEnrichmentConfiguration getDocumentEnrichmentConfiguration() {
        return this.documentEnrichmentConfiguration;
    }

    /**
     * @param documentEnrichmentConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceResult withDocumentEnrichmentConfiguration(DocumentEnrichmentConfiguration documentEnrichmentConfiguration) {
        setDocumentEnrichmentConfiguration(documentEnrichmentConfiguration);
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
        if (getDataSourceId() != null)
            sb.append("DataSourceId: ").append(getDataSourceId()).append(",");
        if (getDataSourceArn() != null)
            sb.append("DataSourceArn: ").append(getDataSourceArn()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getVpcConfiguration() != null)
            sb.append("VpcConfiguration: ").append(getVpcConfiguration()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSyncSchedule() != null)
            sb.append("SyncSchedule: ").append(getSyncSchedule()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError()).append(",");
        if (getDocumentEnrichmentConfiguration() != null)
            sb.append("DocumentEnrichmentConfiguration: ").append(getDocumentEnrichmentConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDataSourceResult == false)
            return false;
        GetDataSourceResult other = (GetDataSourceResult) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getDataSourceId() == null ^ this.getDataSourceId() == null)
            return false;
        if (other.getDataSourceId() != null && other.getDataSourceId().equals(this.getDataSourceId()) == false)
            return false;
        if (other.getDataSourceArn() == null ^ this.getDataSourceArn() == null)
            return false;
        if (other.getDataSourceArn() != null && other.getDataSourceArn().equals(this.getDataSourceArn()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getVpcConfiguration() == null ^ this.getVpcConfiguration() == null)
            return false;
        if (other.getVpcConfiguration() != null && other.getVpcConfiguration().equals(this.getVpcConfiguration()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSyncSchedule() == null ^ this.getSyncSchedule() == null)
            return false;
        if (other.getSyncSchedule() != null && other.getSyncSchedule().equals(this.getSyncSchedule()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getDocumentEnrichmentConfiguration() == null ^ this.getDocumentEnrichmentConfiguration() == null)
            return false;
        if (other.getDocumentEnrichmentConfiguration() != null
                && other.getDocumentEnrichmentConfiguration().equals(this.getDocumentEnrichmentConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getDataSourceId() == null) ? 0 : getDataSourceId().hashCode());
        hashCode = prime * hashCode + ((getDataSourceArn() == null) ? 0 : getDataSourceArn().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getVpcConfiguration() == null) ? 0 : getVpcConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSyncSchedule() == null) ? 0 : getSyncSchedule().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getDocumentEnrichmentConfiguration() == null) ? 0 : getDocumentEnrichmentConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public GetDataSourceResult clone() {
        try {
            return (GetDataSourceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
