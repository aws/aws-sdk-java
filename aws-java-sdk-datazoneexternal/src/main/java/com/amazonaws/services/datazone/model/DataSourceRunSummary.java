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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of a data source run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DataSourceRunSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSourceRunSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The timestamp of when a data source run was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The identifier of the data source of the data source run.
     * </p>
     */
    private String dataSourceId;

    private DataSourceErrorMessage errorMessage;
    /**
     * <p>
     * The identifier of the data source run.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The project ID of the data source run.
     * </p>
     */
    private String projectId;

    private RunStatisticsForAssets runStatisticsForAssets;
    /**
     * <p>
     * The timestamp of when a data source run was started.
     * </p>
     */
    private java.util.Date startedAt;
    /**
     * <p>
     * The status of the data source run.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The timestamp of when a data source run was stopped.
     * </p>
     */
    private java.util.Date stoppedAt;
    /**
     * <p>
     * The type of the data source run.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The timestamp of when a data source run was updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The timestamp of when a data source run was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when a data source run was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when a data source run was created.
     * </p>
     * 
     * @return The timestamp of when a data source run was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when a data source run was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when a data source run was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceRunSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The identifier of the data source of the data source run.
     * </p>
     * 
     * @param dataSourceId
     *        The identifier of the data source of the data source run.
     */

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * <p>
     * The identifier of the data source of the data source run.
     * </p>
     * 
     * @return The identifier of the data source of the data source run.
     */

    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * <p>
     * The identifier of the data source of the data source run.
     * </p>
     * 
     * @param dataSourceId
     *        The identifier of the data source of the data source run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceRunSummary withDataSourceId(String dataSourceId) {
        setDataSourceId(dataSourceId);
        return this;
    }

    /**
     * @param errorMessage
     */

    public void setErrorMessage(DataSourceErrorMessage errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * @return
     */

    public DataSourceErrorMessage getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @param errorMessage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceRunSummary withErrorMessage(DataSourceErrorMessage errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The identifier of the data source run.
     * </p>
     * 
     * @param id
     *        The identifier of the data source run.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the data source run.
     * </p>
     * 
     * @return The identifier of the data source run.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the data source run.
     * </p>
     * 
     * @param id
     *        The identifier of the data source run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceRunSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The project ID of the data source run.
     * </p>
     * 
     * @param projectId
     *        The project ID of the data source run.
     */

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * <p>
     * The project ID of the data source run.
     * </p>
     * 
     * @return The project ID of the data source run.
     */

    public String getProjectId() {
        return this.projectId;
    }

    /**
     * <p>
     * The project ID of the data source run.
     * </p>
     * 
     * @param projectId
     *        The project ID of the data source run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceRunSummary withProjectId(String projectId) {
        setProjectId(projectId);
        return this;
    }

    /**
     * @param runStatisticsForAssets
     */

    public void setRunStatisticsForAssets(RunStatisticsForAssets runStatisticsForAssets) {
        this.runStatisticsForAssets = runStatisticsForAssets;
    }

    /**
     * @return
     */

    public RunStatisticsForAssets getRunStatisticsForAssets() {
        return this.runStatisticsForAssets;
    }

    /**
     * @param runStatisticsForAssets
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceRunSummary withRunStatisticsForAssets(RunStatisticsForAssets runStatisticsForAssets) {
        setRunStatisticsForAssets(runStatisticsForAssets);
        return this;
    }

    /**
     * <p>
     * The timestamp of when a data source run was started.
     * </p>
     * 
     * @param startedAt
     *        The timestamp of when a data source run was started.
     */

    public void setStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * The timestamp of when a data source run was started.
     * </p>
     * 
     * @return The timestamp of when a data source run was started.
     */

    public java.util.Date getStartedAt() {
        return this.startedAt;
    }

    /**
     * <p>
     * The timestamp of when a data source run was started.
     * </p>
     * 
     * @param startedAt
     *        The timestamp of when a data source run was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceRunSummary withStartedAt(java.util.Date startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * The status of the data source run.
     * </p>
     * 
     * @param status
     *        The status of the data source run.
     * @see DataSourceRunStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the data source run.
     * </p>
     * 
     * @return The status of the data source run.
     * @see DataSourceRunStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the data source run.
     * </p>
     * 
     * @param status
     *        The status of the data source run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceRunStatus
     */

    public DataSourceRunSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the data source run.
     * </p>
     * 
     * @param status
     *        The status of the data source run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceRunStatus
     */

    public DataSourceRunSummary withStatus(DataSourceRunStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp of when a data source run was stopped.
     * </p>
     * 
     * @param stoppedAt
     *        The timestamp of when a data source run was stopped.
     */

    public void setStoppedAt(java.util.Date stoppedAt) {
        this.stoppedAt = stoppedAt;
    }

    /**
     * <p>
     * The timestamp of when a data source run was stopped.
     * </p>
     * 
     * @return The timestamp of when a data source run was stopped.
     */

    public java.util.Date getStoppedAt() {
        return this.stoppedAt;
    }

    /**
     * <p>
     * The timestamp of when a data source run was stopped.
     * </p>
     * 
     * @param stoppedAt
     *        The timestamp of when a data source run was stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceRunSummary withStoppedAt(java.util.Date stoppedAt) {
        setStoppedAt(stoppedAt);
        return this;
    }

    /**
     * <p>
     * The type of the data source run.
     * </p>
     * 
     * @param type
     *        The type of the data source run.
     * @see DataSourceRunType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the data source run.
     * </p>
     * 
     * @return The type of the data source run.
     * @see DataSourceRunType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the data source run.
     * </p>
     * 
     * @param type
     *        The type of the data source run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceRunType
     */

    public DataSourceRunSummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the data source run.
     * </p>
     * 
     * @param type
     *        The type of the data source run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceRunType
     */

    public DataSourceRunSummary withType(DataSourceRunType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp of when a data source run was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when a data source run was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp of when a data source run was updated.
     * </p>
     * 
     * @return The timestamp of when a data source run was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp of when a data source run was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when a data source run was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceRunSummary withUpdatedAt(java.util.Date updatedAt) {
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
        if (getDataSourceId() != null)
            sb.append("DataSourceId: ").append(getDataSourceId()).append(",");
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

        if (obj instanceof DataSourceRunSummary == false)
            return false;
        DataSourceRunSummary other = (DataSourceRunSummary) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDataSourceId() == null ^ this.getDataSourceId() == null)
            return false;
        if (other.getDataSourceId() != null && other.getDataSourceId().equals(this.getDataSourceId()) == false)
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
        hashCode = prime * hashCode + ((getDataSourceId() == null) ? 0 : getDataSourceId().hashCode());
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
    public DataSourceRunSummary clone() {
        try {
            return (DataSourceRunSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.DataSourceRunSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
