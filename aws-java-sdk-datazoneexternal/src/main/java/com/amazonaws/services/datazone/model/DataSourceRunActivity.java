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
 * The activity details of the data source run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DataSourceRunActivity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSourceRunActivity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The timestamp of when data source run activity was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The identifier of the asset included in the data source run activity.
     * </p>
     */
    private String dataAssetId;
    /**
     * <p>
     * The status of the asset included in the data source run activity.
     * </p>
     */
    private String dataAssetStatus;
    /**
     * <p>
     * The identifier of the data source for the data source run activity.
     * </p>
     */
    private String dataSourceRunId;
    /**
     * <p>
     * The database included in the data source run activity.
     * </p>
     */
    private String database;

    private DataSourceErrorMessage errorMessage;
    /**
     * <p>
     * The project ID included in the data source run activity.
     * </p>
     */
    private String projectId;
    /**
     * <p>
     * The technical description included in the data source run activity.
     * </p>
     */
    private String technicalDescription;
    /**
     * <p>
     * The technical name included in the data source run activity.
     * </p>
     */
    private String technicalName;
    /**
     * <p>
     * The timestamp of when data source run activity was updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The timestamp of when data source run activity was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when data source run activity was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when data source run activity was created.
     * </p>
     * 
     * @return The timestamp of when data source run activity was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when data source run activity was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when data source run activity was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceRunActivity withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The identifier of the asset included in the data source run activity.
     * </p>
     * 
     * @param dataAssetId
     *        The identifier of the asset included in the data source run activity.
     */

    public void setDataAssetId(String dataAssetId) {
        this.dataAssetId = dataAssetId;
    }

    /**
     * <p>
     * The identifier of the asset included in the data source run activity.
     * </p>
     * 
     * @return The identifier of the asset included in the data source run activity.
     */

    public String getDataAssetId() {
        return this.dataAssetId;
    }

    /**
     * <p>
     * The identifier of the asset included in the data source run activity.
     * </p>
     * 
     * @param dataAssetId
     *        The identifier of the asset included in the data source run activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceRunActivity withDataAssetId(String dataAssetId) {
        setDataAssetId(dataAssetId);
        return this;
    }

    /**
     * <p>
     * The status of the asset included in the data source run activity.
     * </p>
     * 
     * @param dataAssetStatus
     *        The status of the asset included in the data source run activity.
     * @see DataAssetActivityStatus
     */

    public void setDataAssetStatus(String dataAssetStatus) {
        this.dataAssetStatus = dataAssetStatus;
    }

    /**
     * <p>
     * The status of the asset included in the data source run activity.
     * </p>
     * 
     * @return The status of the asset included in the data source run activity.
     * @see DataAssetActivityStatus
     */

    public String getDataAssetStatus() {
        return this.dataAssetStatus;
    }

    /**
     * <p>
     * The status of the asset included in the data source run activity.
     * </p>
     * 
     * @param dataAssetStatus
     *        The status of the asset included in the data source run activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataAssetActivityStatus
     */

    public DataSourceRunActivity withDataAssetStatus(String dataAssetStatus) {
        setDataAssetStatus(dataAssetStatus);
        return this;
    }

    /**
     * <p>
     * The status of the asset included in the data source run activity.
     * </p>
     * 
     * @param dataAssetStatus
     *        The status of the asset included in the data source run activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataAssetActivityStatus
     */

    public DataSourceRunActivity withDataAssetStatus(DataAssetActivityStatus dataAssetStatus) {
        this.dataAssetStatus = dataAssetStatus.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the data source for the data source run activity.
     * </p>
     * 
     * @param dataSourceRunId
     *        The identifier of the data source for the data source run activity.
     */

    public void setDataSourceRunId(String dataSourceRunId) {
        this.dataSourceRunId = dataSourceRunId;
    }

    /**
     * <p>
     * The identifier of the data source for the data source run activity.
     * </p>
     * 
     * @return The identifier of the data source for the data source run activity.
     */

    public String getDataSourceRunId() {
        return this.dataSourceRunId;
    }

    /**
     * <p>
     * The identifier of the data source for the data source run activity.
     * </p>
     * 
     * @param dataSourceRunId
     *        The identifier of the data source for the data source run activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceRunActivity withDataSourceRunId(String dataSourceRunId) {
        setDataSourceRunId(dataSourceRunId);
        return this;
    }

    /**
     * <p>
     * The database included in the data source run activity.
     * </p>
     * 
     * @param database
     *        The database included in the data source run activity.
     */

    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * <p>
     * The database included in the data source run activity.
     * </p>
     * 
     * @return The database included in the data source run activity.
     */

    public String getDatabase() {
        return this.database;
    }

    /**
     * <p>
     * The database included in the data source run activity.
     * </p>
     * 
     * @param database
     *        The database included in the data source run activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceRunActivity withDatabase(String database) {
        setDatabase(database);
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

    public DataSourceRunActivity withErrorMessage(DataSourceErrorMessage errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The project ID included in the data source run activity.
     * </p>
     * 
     * @param projectId
     *        The project ID included in the data source run activity.
     */

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * <p>
     * The project ID included in the data source run activity.
     * </p>
     * 
     * @return The project ID included in the data source run activity.
     */

    public String getProjectId() {
        return this.projectId;
    }

    /**
     * <p>
     * The project ID included in the data source run activity.
     * </p>
     * 
     * @param projectId
     *        The project ID included in the data source run activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceRunActivity withProjectId(String projectId) {
        setProjectId(projectId);
        return this;
    }

    /**
     * <p>
     * The technical description included in the data source run activity.
     * </p>
     * 
     * @param technicalDescription
     *        The technical description included in the data source run activity.
     */

    public void setTechnicalDescription(String technicalDescription) {
        this.technicalDescription = technicalDescription;
    }

    /**
     * <p>
     * The technical description included in the data source run activity.
     * </p>
     * 
     * @return The technical description included in the data source run activity.
     */

    public String getTechnicalDescription() {
        return this.technicalDescription;
    }

    /**
     * <p>
     * The technical description included in the data source run activity.
     * </p>
     * 
     * @param technicalDescription
     *        The technical description included in the data source run activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceRunActivity withTechnicalDescription(String technicalDescription) {
        setTechnicalDescription(technicalDescription);
        return this;
    }

    /**
     * <p>
     * The technical name included in the data source run activity.
     * </p>
     * 
     * @param technicalName
     *        The technical name included in the data source run activity.
     */

    public void setTechnicalName(String technicalName) {
        this.technicalName = technicalName;
    }

    /**
     * <p>
     * The technical name included in the data source run activity.
     * </p>
     * 
     * @return The technical name included in the data source run activity.
     */

    public String getTechnicalName() {
        return this.technicalName;
    }

    /**
     * <p>
     * The technical name included in the data source run activity.
     * </p>
     * 
     * @param technicalName
     *        The technical name included in the data source run activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceRunActivity withTechnicalName(String technicalName) {
        setTechnicalName(technicalName);
        return this;
    }

    /**
     * <p>
     * The timestamp of when data source run activity was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when data source run activity was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp of when data source run activity was updated.
     * </p>
     * 
     * @return The timestamp of when data source run activity was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp of when data source run activity was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when data source run activity was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceRunActivity withUpdatedAt(java.util.Date updatedAt) {
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
        if (getDataAssetId() != null)
            sb.append("DataAssetId: ").append(getDataAssetId()).append(",");
        if (getDataAssetStatus() != null)
            sb.append("DataAssetStatus: ").append(getDataAssetStatus()).append(",");
        if (getDataSourceRunId() != null)
            sb.append("DataSourceRunId: ").append(getDataSourceRunId()).append(",");
        if (getDatabase() != null)
            sb.append("Database: ").append("***Sensitive Data Redacted***").append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getProjectId() != null)
            sb.append("ProjectId: ").append(getProjectId()).append(",");
        if (getTechnicalDescription() != null)
            sb.append("TechnicalDescription: ").append("***Sensitive Data Redacted***").append(",");
        if (getTechnicalName() != null)
            sb.append("TechnicalName: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof DataSourceRunActivity == false)
            return false;
        DataSourceRunActivity other = (DataSourceRunActivity) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDataAssetId() == null ^ this.getDataAssetId() == null)
            return false;
        if (other.getDataAssetId() != null && other.getDataAssetId().equals(this.getDataAssetId()) == false)
            return false;
        if (other.getDataAssetStatus() == null ^ this.getDataAssetStatus() == null)
            return false;
        if (other.getDataAssetStatus() != null && other.getDataAssetStatus().equals(this.getDataAssetStatus()) == false)
            return false;
        if (other.getDataSourceRunId() == null ^ this.getDataSourceRunId() == null)
            return false;
        if (other.getDataSourceRunId() != null && other.getDataSourceRunId().equals(this.getDataSourceRunId()) == false)
            return false;
        if (other.getDatabase() == null ^ this.getDatabase() == null)
            return false;
        if (other.getDatabase() != null && other.getDatabase().equals(this.getDatabase()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getProjectId() == null ^ this.getProjectId() == null)
            return false;
        if (other.getProjectId() != null && other.getProjectId().equals(this.getProjectId()) == false)
            return false;
        if (other.getTechnicalDescription() == null ^ this.getTechnicalDescription() == null)
            return false;
        if (other.getTechnicalDescription() != null && other.getTechnicalDescription().equals(this.getTechnicalDescription()) == false)
            return false;
        if (other.getTechnicalName() == null ^ this.getTechnicalName() == null)
            return false;
        if (other.getTechnicalName() != null && other.getTechnicalName().equals(this.getTechnicalName()) == false)
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
        hashCode = prime * hashCode + ((getDataAssetId() == null) ? 0 : getDataAssetId().hashCode());
        hashCode = prime * hashCode + ((getDataAssetStatus() == null) ? 0 : getDataAssetStatus().hashCode());
        hashCode = prime * hashCode + ((getDataSourceRunId() == null) ? 0 : getDataSourceRunId().hashCode());
        hashCode = prime * hashCode + ((getDatabase() == null) ? 0 : getDatabase().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getProjectId() == null) ? 0 : getProjectId().hashCode());
        hashCode = prime * hashCode + ((getTechnicalDescription() == null) ? 0 : getTechnicalDescription().hashCode());
        hashCode = prime * hashCode + ((getTechnicalName() == null) ? 0 : getTechnicalName().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public DataSourceRunActivity clone() {
        try {
            return (DataSourceRunActivity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.DataSourceRunActivityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
