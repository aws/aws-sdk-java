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
package com.amazonaws.services.timestreamwrite.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about a batch load task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/BatchLoadTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchLoadTask implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the batch load task.
     * </p>
     */
    private String taskId;
    /**
     * <p>
     * Status of the batch load task.
     * </p>
     */
    private String taskStatus;
    /**
     * <p>
     * Database name for the database into which a batch load task loads data.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * Table name for the table into which a batch load task loads data.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * The time when the Timestream batch load task was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time when the Timestream batch load task was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * </p>
     */
    private java.util.Date resumableUntil;

    /**
     * <p>
     * The ID of the batch load task.
     * </p>
     * 
     * @param taskId
     *        The ID of the batch load task.
     */

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The ID of the batch load task.
     * </p>
     * 
     * @return The ID of the batch load task.
     */

    public String getTaskId() {
        return this.taskId;
    }

    /**
     * <p>
     * The ID of the batch load task.
     * </p>
     * 
     * @param taskId
     *        The ID of the batch load task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchLoadTask withTaskId(String taskId) {
        setTaskId(taskId);
        return this;
    }

    /**
     * <p>
     * Status of the batch load task.
     * </p>
     * 
     * @param taskStatus
     *        Status of the batch load task.
     * @see BatchLoadStatus
     */

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    /**
     * <p>
     * Status of the batch load task.
     * </p>
     * 
     * @return Status of the batch load task.
     * @see BatchLoadStatus
     */

    public String getTaskStatus() {
        return this.taskStatus;
    }

    /**
     * <p>
     * Status of the batch load task.
     * </p>
     * 
     * @param taskStatus
     *        Status of the batch load task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchLoadStatus
     */

    public BatchLoadTask withTaskStatus(String taskStatus) {
        setTaskStatus(taskStatus);
        return this;
    }

    /**
     * <p>
     * Status of the batch load task.
     * </p>
     * 
     * @param taskStatus
     *        Status of the batch load task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchLoadStatus
     */

    public BatchLoadTask withTaskStatus(BatchLoadStatus taskStatus) {
        this.taskStatus = taskStatus.toString();
        return this;
    }

    /**
     * <p>
     * Database name for the database into which a batch load task loads data.
     * </p>
     * 
     * @param databaseName
     *        Database name for the database into which a batch load task loads data.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * Database name for the database into which a batch load task loads data.
     * </p>
     * 
     * @return Database name for the database into which a batch load task loads data.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * Database name for the database into which a batch load task loads data.
     * </p>
     * 
     * @param databaseName
     *        Database name for the database into which a batch load task loads data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchLoadTask withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * Table name for the table into which a batch load task loads data.
     * </p>
     * 
     * @param tableName
     *        Table name for the table into which a batch load task loads data.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * Table name for the table into which a batch load task loads data.
     * </p>
     * 
     * @return Table name for the table into which a batch load task loads data.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * Table name for the table into which a batch load task loads data.
     * </p>
     * 
     * @param tableName
     *        Table name for the table into which a batch load task loads data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchLoadTask withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * The time when the Timestream batch load task was created.
     * </p>
     * 
     * @param creationTime
     *        The time when the Timestream batch load task was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time when the Timestream batch load task was created.
     * </p>
     * 
     * @return The time when the Timestream batch load task was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time when the Timestream batch load task was created.
     * </p>
     * 
     * @param creationTime
     *        The time when the Timestream batch load task was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchLoadTask withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time when the Timestream batch load task was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time when the Timestream batch load task was last updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The time when the Timestream batch load task was last updated.
     * </p>
     * 
     * @return The time when the Timestream batch load task was last updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The time when the Timestream batch load task was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time when the Timestream batch load task was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchLoadTask withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param resumableUntil
     */

    public void setResumableUntil(java.util.Date resumableUntil) {
        this.resumableUntil = resumableUntil;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public java.util.Date getResumableUntil() {
        return this.resumableUntil;
    }

    /**
     * <p>
     * </p>
     * 
     * @param resumableUntil
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchLoadTask withResumableUntil(java.util.Date resumableUntil) {
        setResumableUntil(resumableUntil);
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
        if (getTaskId() != null)
            sb.append("TaskId: ").append(getTaskId()).append(",");
        if (getTaskStatus() != null)
            sb.append("TaskStatus: ").append(getTaskStatus()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getResumableUntil() != null)
            sb.append("ResumableUntil: ").append(getResumableUntil());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchLoadTask == false)
            return false;
        BatchLoadTask other = (BatchLoadTask) obj;
        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        if (other.getTaskStatus() == null ^ this.getTaskStatus() == null)
            return false;
        if (other.getTaskStatus() != null && other.getTaskStatus().equals(this.getTaskStatus()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getResumableUntil() == null ^ this.getResumableUntil() == null)
            return false;
        if (other.getResumableUntil() != null && other.getResumableUntil().equals(this.getResumableUntil()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        hashCode = prime * hashCode + ((getTaskStatus() == null) ? 0 : getTaskStatus().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getResumableUntil() == null) ? 0 : getResumableUntil().hashCode());
        return hashCode;
    }

    @Override
    public BatchLoadTask clone() {
        try {
            return (BatchLoadTask) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamwrite.model.transform.BatchLoadTaskMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
