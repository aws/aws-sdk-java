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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/GetDataSourceRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDataSourceRunResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The timestamp of when the data source run was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The configuration snapshot of the data source run.
     * </p>
     */
    private String dataSourceConfigurationSnapshot;
    /**
     * <p>
     * The ID of the data source for this data source run.
     * </p>
     */
    private String dataSourceId;
    /**
     * <p>
     * The ID of the domain in which this data source run was performed.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * Specifies the error message that is returned if the operation cannot be successfully completed.
     * </p>
     */
    private DataSourceErrorMessage errorMessage;
    /**
     * <p>
     * The ID of the data source run.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The ID of the project in which this data source run occured.
     * </p>
     */
    private String projectId;
    /**
     * <p>
     * The asset statistics from this data source run.
     * </p>
     */
    private RunStatisticsForAssets runStatisticsForAssets;
    /**
     * <p>
     * The timestamp of when this data source run started.
     * </p>
     */
    private java.util.Date startedAt;
    /**
     * <p>
     * The status of this data source run.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The timestamp of when this data source run stopped.
     * </p>
     */
    private java.util.Date stoppedAt;
    /**
     * <p>
     * The type of this data source run.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The timestamp of when this data source run was updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The timestamp of when the data source run was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the data source run was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when the data source run was created.
     * </p>
     * 
     * @return The timestamp of when the data source run was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when the data source run was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the data source run was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceRunResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The configuration snapshot of the data source run.
     * </p>
     * 
     * @param dataSourceConfigurationSnapshot
     *        The configuration snapshot of the data source run.
     */

    public void setDataSourceConfigurationSnapshot(String dataSourceConfigurationSnapshot) {
        this.dataSourceConfigurationSnapshot = dataSourceConfigurationSnapshot;
    }

    /**
     * <p>
     * The configuration snapshot of the data source run.
     * </p>
     * 
     * @return The configuration snapshot of the data source run.
     */

    public String getDataSourceConfigurationSnapshot() {
        return this.dataSourceConfigurationSnapshot;
    }

    /**
     * <p>
     * The configuration snapshot of the data source run.
     * </p>
     * 
     * @param dataSourceConfigurationSnapshot
     *        The configuration snapshot of the data source run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceRunResult withDataSourceConfigurationSnapshot(String dataSourceConfigurationSnapshot) {
        setDataSourceConfigurationSnapshot(dataSourceConfigurationSnapshot);
        return this;
    }

    /**
     * <p>
     * The ID of the data source for this data source run.
     * </p>
     * 
     * @param dataSourceId
     *        The ID of the data source for this data source run.
     */

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * <p>
     * The ID of the data source for this data source run.
     * </p>
     * 
     * @return The ID of the data source for this data source run.
     */

    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * <p>
     * The ID of the data source for this data source run.
     * </p>
     * 
     * @param dataSourceId
     *        The ID of the data source for this data source run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceRunResult withDataSourceId(String dataSourceId) {
        setDataSourceId(dataSourceId);
        return this;
    }

    /**
     * <p>
     * The ID of the domain in which this data source run was performed.
     * </p>
     * 
     * @param domainId
     *        The ID of the domain in which this data source run was performed.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The ID of the domain in which this data source run was performed.
     * </p>
     * 
     * @return The ID of the domain in which this data source run was performed.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The ID of the domain in which this data source run was performed.
     * </p>
     * 
     * @param domainId
     *        The ID of the domain in which this data source run was performed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceRunResult withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * Specifies the error message that is returned if the operation cannot be successfully completed.
     * </p>
     * 
     * @param errorMessage
     *        Specifies the error message that is returned if the operation cannot be successfully completed.
     */

    public void setErrorMessage(DataSourceErrorMessage errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * Specifies the error message that is returned if the operation cannot be successfully completed.
     * </p>
     * 
     * @return Specifies the error message that is returned if the operation cannot be successfully completed.
     */

    public DataSourceErrorMessage getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * Specifies the error message that is returned if the operation cannot be successfully completed.
     * </p>
     * 
     * @param errorMessage
     *        Specifies the error message that is returned if the operation cannot be successfully completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceRunResult withErrorMessage(DataSourceErrorMessage errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The ID of the data source run.
     * </p>
     * 
     * @param id
     *        The ID of the data source run.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the data source run.
     * </p>
     * 
     * @return The ID of the data source run.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the data source run.
     * </p>
     * 
     * @param id
     *        The ID of the data source run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceRunResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The ID of the project in which this data source run occured.
     * </p>
     * 
     * @param projectId
     *        The ID of the project in which this data source run occured.
     */

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * <p>
     * The ID of the project in which this data source run occured.
     * </p>
     * 
     * @return The ID of the project in which this data source run occured.
     */

    public String getProjectId() {
        return this.projectId;
    }

    /**
     * <p>
     * The ID of the project in which this data source run occured.
     * </p>
     * 
     * @param projectId
     *        The ID of the project in which this data source run occured.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceRunResult withProjectId(String projectId) {
        setProjectId(projectId);
        return this;
    }

    /**
     * <p>
     * The asset statistics from this data source run.
     * </p>
     * 
     * @param runStatisticsForAssets
     *        The asset statistics from this data source run.
     */

    public void setRunStatisticsForAssets(RunStatisticsForAssets runStatisticsForAssets) {
        this.runStatisticsForAssets = runStatisticsForAssets;
    }

    /**
     * <p>
     * The asset statistics from this data source run.
     * </p>
     * 
     * @return The asset statistics from this data source run.
     */

    public RunStatisticsForAssets getRunStatisticsForAssets() {
        return this.runStatisticsForAssets;
    }

    /**
     * <p>
     * The asset statistics from this data source run.
     * </p>
     * 
     * @param runStatisticsForAssets
     *        The asset statistics from this data source run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceRunResult withRunStatisticsForAssets(RunStatisticsForAssets runStatisticsForAssets) {
        setRunStatisticsForAssets(runStatisticsForAssets);
        return this;
    }

    /**
     * <p>
     * The timestamp of when this data source run started.
     * </p>
     * 
     * @param startedAt
     *        The timestamp of when this data source run started.
     */

    public void setStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * The timestamp of when this data source run started.
     * </p>
     * 
     * @return The timestamp of when this data source run started.
     */

    public java.util.Date getStartedAt() {
        return this.startedAt;
    }

    /**
     * <p>
     * The timestamp of when this data source run started.
     * </p>
     * 
     * @param startedAt
     *        The timestamp of when this data source run started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceRunResult withStartedAt(java.util.Date startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * The status of this data source run.
     * </p>
     * 
     * @param status
     *        The status of this data source run.
     * @see DataSourceRunStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of this data source run.
     * </p>
     * 
     * @return The status of this data source run.
     * @see DataSourceRunStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of this data source run.
     * </p>
     * 
     * @param status
     *        The status of this data source run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceRunStatus
     */

    public GetDataSourceRunResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of this data source run.
     * </p>
     * 
     * @param status
     *        The status of this data source run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceRunStatus
     */

    public GetDataSourceRunResult withStatus(DataSourceRunStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp of when this data source run stopped.
     * </p>
     * 
     * @param stoppedAt
     *        The timestamp of when this data source run stopped.
     */

    public void setStoppedAt(java.util.Date stoppedAt) {
        this.stoppedAt = stoppedAt;
    }

    /**
     * <p>
     * The timestamp of when this data source run stopped.
     * </p>
     * 
     * @return The timestamp of when this data source run stopped.
     */

    public java.util.Date getStoppedAt() {
        return this.stoppedAt;
    }

    /**
     * <p>
     * The timestamp of when this data source run stopped.
     * </p>
     * 
     * @param stoppedAt
     *        The timestamp of when this data source run stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceRunResult withStoppedAt(java.util.Date stoppedAt) {
        setStoppedAt(stoppedAt);
        return this;
    }

    /**
     * <p>
     * The type of this data source run.
     * </p>
     * 
     * @param type
     *        The type of this data source run.
     * @see DataSourceRunType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of this data source run.
     * </p>
     * 
     * @return The type of this data source run.
     * @see DataSourceRunType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of this data source run.
     * </p>
     * 
     * @param type
     *        The type of this data source run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceRunType
     */

    public GetDataSourceRunResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of this data source run.
     * </p>
     * 
     * @param type
     *        The type of this data source run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceRunType
     */

    public GetDataSourceRunResult withType(DataSourceRunType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp of when this data source run was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when this data source run was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp of when this data source run was updated.
     * </p>
     * 
     * @return The timestamp of when this data source run was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp of when this data source run was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when this data source run was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDataSourceRunResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDataSourceConfigurationSnapshot() != null)
            sb.append("DataSourceConfigurationSnapshot: ").append(getDataSourceConfigurationSnapshot()).append(",");
        if (getDataSourceId() != null)
            sb.append("DataSourceId: ").append(getDataSourceId()).append(",");
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getProjectId() != null)
            sb.append("ProjectId: ").append(getProjectId()).append(",");
        if (getRunStatisticsForAssets() != null)
            sb.append("RunStatisticsForAssets: ").append(getRunStatisticsForAssets()).append(",");
        if (getStartedAt() != null)
            sb.append("StartedAt: ").append(getStartedAt()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStoppedAt() != null)
            sb.append("StoppedAt: ").append(getStoppedAt()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDataSourceRunResult == false)
            return false;
        GetDataSourceRunResult other = (GetDataSourceRunResult) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDataSourceConfigurationSnapshot() == null ^ this.getDataSourceConfigurationSnapshot() == null)
            return false;
        if (other.getDataSourceConfigurationSnapshot() != null
                && other.getDataSourceConfigurationSnapshot().equals(this.getDataSourceConfigurationSnapshot()) == false)
            return false;
        if (other.getDataSourceId() == null ^ this.getDataSourceId() == null)
            return false;
        if (other.getDataSourceId() != null && other.getDataSourceId().equals(this.getDataSourceId()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getProjectId() == null ^ this.getProjectId() == null)
            return false;
        if (other.getProjectId() != null && other.getProjectId().equals(this.getProjectId()) == false)
            return false;
        if (other.getRunStatisticsForAssets() == null ^ this.getRunStatisticsForAssets() == null)
            return false;
        if (other.getRunStatisticsForAssets() != null && other.getRunStatisticsForAssets().equals(this.getRunStatisticsForAssets()) == false)
            return false;
        if (other.getStartedAt() == null ^ this.getStartedAt() == null)
            return false;
        if (other.getStartedAt() != null && other.getStartedAt().equals(this.getStartedAt()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStoppedAt() == null ^ this.getStoppedAt() == null)
            return false;
        if (other.getStoppedAt() != null && other.getStoppedAt().equals(this.getStoppedAt()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDataSourceConfigurationSnapshot() == null) ? 0 : getDataSourceConfigurationSnapshot().hashCode());
        hashCode = prime * hashCode + ((getDataSourceId() == null) ? 0 : getDataSourceId().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        hashCode = prime * hashCode + ((getRunStatisticsForAssets() == null) ? 0 : getRunStatisticsForAssets().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStoppedAt() == null) ? 0 : getStoppedAt().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public GetDataSourceRunResult clone() {
        try {
            return (GetDataSourceRunResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
