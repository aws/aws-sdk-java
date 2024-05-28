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
 * The details of the data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DataSourceSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSourceSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The timestamp of when the data source was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The ID of the data source.
     * </p>
     */
    private String dataSourceId;
    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the data source exists.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * Specifies whether the data source is enabled.
     * </p>
     */
    private String enableSetting;
    /**
     * <p>
     * The ID of the environment in which the data source exists.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * The count of the assets created during the last data source run.
     * </p>
     */
    private Integer lastRunAssetCount;
    /**
     * <p>
     * The timestamp of when the data source run was last performed.
     * </p>
     */
    private java.util.Date lastRunAt;

    private DataSourceErrorMessage lastRunErrorMessage;
    /**
     * <p>
     * The status of the last data source run.
     * </p>
     */
    private String lastRunStatus;
    /**
     * <p>
     * The name of the data source.
     * </p>
     */
    private String name;

    private ScheduleConfiguration schedule;
    /**
     * <p>
     * The status of the data source.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The type of the data source.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The timestamp of when the data source was updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The timestamp of when the data source was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the data source was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when the data source was created.
     * </p>
     * 
     * @return The timestamp of when the data source was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when the data source was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the data source was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The ID of the data source.
     * </p>
     * 
     * @param dataSourceId
     *        The ID of the data source.
     */

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * <p>
     * The ID of the data source.
     * </p>
     * 
     * @return The ID of the data source.
     */

    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * <p>
     * The ID of the data source.
     * </p>
     * 
     * @param dataSourceId
     *        The ID of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceSummary withDataSourceId(String dataSourceId) {
        setDataSourceId(dataSourceId);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the data source exists.
     * </p>
     * 
     * @param domainId
     *        The ID of the Amazon DataZone domain in which the data source exists.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the data source exists.
     * </p>
     * 
     * @return The ID of the Amazon DataZone domain in which the data source exists.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain in which the data source exists.
     * </p>
     * 
     * @param domainId
     *        The ID of the Amazon DataZone domain in which the data source exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceSummary withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * Specifies whether the data source is enabled.
     * </p>
     * 
     * @param enableSetting
     *        Specifies whether the data source is enabled.
     * @see EnableSetting
     */

    public void setEnableSetting(String enableSetting) {
        this.enableSetting = enableSetting;
    }

    /**
     * <p>
     * Specifies whether the data source is enabled.
     * </p>
     * 
     * @return Specifies whether the data source is enabled.
     * @see EnableSetting
     */

    public String getEnableSetting() {
        return this.enableSetting;
    }

    /**
     * <p>
     * Specifies whether the data source is enabled.
     * </p>
     * 
     * @param enableSetting
     *        Specifies whether the data source is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnableSetting
     */

    public DataSourceSummary withEnableSetting(String enableSetting) {
        setEnableSetting(enableSetting);
        return this;
    }

    /**
     * <p>
     * Specifies whether the data source is enabled.
     * </p>
     * 
     * @param enableSetting
     *        Specifies whether the data source is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnableSetting
     */

    public DataSourceSummary withEnableSetting(EnableSetting enableSetting) {
        this.enableSetting = enableSetting.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the environment in which the data source exists.
     * </p>
     * 
     * @param environmentId
     *        The ID of the environment in which the data source exists.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The ID of the environment in which the data source exists.
     * </p>
     * 
     * @return The ID of the environment in which the data source exists.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * The ID of the environment in which the data source exists.
     * </p>
     * 
     * @param environmentId
     *        The ID of the environment in which the data source exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceSummary withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * The count of the assets created during the last data source run.
     * </p>
     * 
     * @param lastRunAssetCount
     *        The count of the assets created during the last data source run.
     */

    public void setLastRunAssetCount(Integer lastRunAssetCount) {
        this.lastRunAssetCount = lastRunAssetCount;
    }

    /**
     * <p>
     * The count of the assets created during the last data source run.
     * </p>
     * 
     * @return The count of the assets created during the last data source run.
     */

    public Integer getLastRunAssetCount() {
        return this.lastRunAssetCount;
    }

    /**
     * <p>
     * The count of the assets created during the last data source run.
     * </p>
     * 
     * @param lastRunAssetCount
     *        The count of the assets created during the last data source run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceSummary withLastRunAssetCount(Integer lastRunAssetCount) {
        setLastRunAssetCount(lastRunAssetCount);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the data source run was last performed.
     * </p>
     * 
     * @param lastRunAt
     *        The timestamp of when the data source run was last performed.
     */

    public void setLastRunAt(java.util.Date lastRunAt) {
        this.lastRunAt = lastRunAt;
    }

    /**
     * <p>
     * The timestamp of when the data source run was last performed.
     * </p>
     * 
     * @return The timestamp of when the data source run was last performed.
     */

    public java.util.Date getLastRunAt() {
        return this.lastRunAt;
    }

    /**
     * <p>
     * The timestamp of when the data source run was last performed.
     * </p>
     * 
     * @param lastRunAt
     *        The timestamp of when the data source run was last performed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceSummary withLastRunAt(java.util.Date lastRunAt) {
        setLastRunAt(lastRunAt);
        return this;
    }

    /**
     * @param lastRunErrorMessage
     */

    public void setLastRunErrorMessage(DataSourceErrorMessage lastRunErrorMessage) {
        this.lastRunErrorMessage = lastRunErrorMessage;
    }

    /**
     * @return
     */

    public DataSourceErrorMessage getLastRunErrorMessage() {
        return this.lastRunErrorMessage;
    }

    /**
     * @param lastRunErrorMessage
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceSummary withLastRunErrorMessage(DataSourceErrorMessage lastRunErrorMessage) {
        setLastRunErrorMessage(lastRunErrorMessage);
        return this;
    }

    /**
     * <p>
     * The status of the last data source run.
     * </p>
     * 
     * @param lastRunStatus
     *        The status of the last data source run.
     * @see DataSourceRunStatus
     */

    public void setLastRunStatus(String lastRunStatus) {
        this.lastRunStatus = lastRunStatus;
    }

    /**
     * <p>
     * The status of the last data source run.
     * </p>
     * 
     * @return The status of the last data source run.
     * @see DataSourceRunStatus
     */

    public String getLastRunStatus() {
        return this.lastRunStatus;
    }

    /**
     * <p>
     * The status of the last data source run.
     * </p>
     * 
     * @param lastRunStatus
     *        The status of the last data source run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceRunStatus
     */

    public DataSourceSummary withLastRunStatus(String lastRunStatus) {
        setLastRunStatus(lastRunStatus);
        return this;
    }

    /**
     * <p>
     * The status of the last data source run.
     * </p>
     * 
     * @param lastRunStatus
     *        The status of the last data source run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceRunStatus
     */

    public DataSourceSummary withLastRunStatus(DataSourceRunStatus lastRunStatus) {
        this.lastRunStatus = lastRunStatus.toString();
        return this;
    }

    /**
     * <p>
     * The name of the data source.
     * </p>
     * 
     * @param name
     *        The name of the data source.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the data source.
     * </p>
     * 
     * @return The name of the data source.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the data source.
     * </p>
     * 
     * @param name
     *        The name of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param schedule
     */

    public void setSchedule(ScheduleConfiguration schedule) {
        this.schedule = schedule;
    }

    /**
     * @return
     */

    public ScheduleConfiguration getSchedule() {
        return this.schedule;
    }

    /**
     * @param schedule
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceSummary withSchedule(ScheduleConfiguration schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * The status of the data source.
     * </p>
     * 
     * @param status
     *        The status of the data source.
     * @see DataSourceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the data source.
     * </p>
     * 
     * @return The status of the data source.
     * @see DataSourceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the data source.
     * </p>
     * 
     * @param status
     *        The status of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceStatus
     */

    public DataSourceSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the data source.
     * </p>
     * 
     * @param status
     *        The status of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceStatus
     */

    public DataSourceSummary withStatus(DataSourceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The type of the data source.
     * </p>
     * 
     * @param type
     *        The type of the data source.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the data source.
     * </p>
     * 
     * @return The type of the data source.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the data source.
     * </p>
     * 
     * @param type
     *        The type of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceSummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the data source was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the data source was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the data source was updated.
     * </p>
     * 
     * @return The timestamp of when the data source was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the data source was updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the data source was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceSummary withUpdatedAt(java.util.Date updatedAt) {
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
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getEnableSetting() != null)
            sb.append("EnableSetting: ").append(getEnableSetting()).append(",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getLastRunAssetCount() != null)
            sb.append("LastRunAssetCount: ").append(getLastRunAssetCount()).append(",");
        if (getLastRunAt() != null)
            sb.append("LastRunAt: ").append(getLastRunAt()).append(",");
        if (getLastRunErrorMessage() != null)
            sb.append("LastRunErrorMessage: ").append(getLastRunErrorMessage()).append(",");
        if (getLastRunStatus() != null)
            sb.append("LastRunStatus: ").append(getLastRunStatus()).append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getSchedule() != null)
            sb.append("Schedule: ").append("***Sensitive Data Redacted***").append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof DataSourceSummary == false)
            return false;
        DataSourceSummary other = (DataSourceSummary) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDataSourceId() == null ^ this.getDataSourceId() == null)
            return false;
        if (other.getDataSourceId() != null && other.getDataSourceId().equals(this.getDataSourceId()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getEnableSetting() == null ^ this.getEnableSetting() == null)
            return false;
        if (other.getEnableSetting() != null && other.getEnableSetting().equals(this.getEnableSetting()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getLastRunAssetCount() == null ^ this.getLastRunAssetCount() == null)
            return false;
        if (other.getLastRunAssetCount() != null && other.getLastRunAssetCount().equals(this.getLastRunAssetCount()) == false)
            return false;
        if (other.getLastRunAt() == null ^ this.getLastRunAt() == null)
            return false;
        if (other.getLastRunAt() != null && other.getLastRunAt().equals(this.getLastRunAt()) == false)
            return false;
        if (other.getLastRunErrorMessage() == null ^ this.getLastRunErrorMessage() == null)
            return false;
        if (other.getLastRunErrorMessage() != null && other.getLastRunErrorMessage().equals(this.getLastRunErrorMessage()) == false)
            return false;
        if (other.getLastRunStatus() == null ^ this.getLastRunStatus() == null)
            return false;
        if (other.getLastRunStatus() != null && other.getLastRunStatus().equals(this.getLastRunStatus()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getEnableSetting() == null) ? 0 : getEnableSetting().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getLastRunAssetCount() == null) ? 0 : getLastRunAssetCount().hashCode());
        hashCode = prime * hashCode + ((getLastRunAt() == null) ? 0 : getLastRunAt().hashCode());
        hashCode = prime * hashCode + ((getLastRunErrorMessage() == null) ? 0 : getLastRunErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getLastRunStatus() == null) ? 0 : getLastRunStatus().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public DataSourceSummary clone() {
        try {
            return (DataSourceSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.DataSourceSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
