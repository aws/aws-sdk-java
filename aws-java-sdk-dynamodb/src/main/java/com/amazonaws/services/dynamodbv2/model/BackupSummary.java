/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details for the backup.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/BackupSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BackupSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the table.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * Unique identifier for the table.
     * </p>
     */
    private String tableId;
    /**
     * <p>
     * ARN associated with the table.
     * </p>
     */
    private String tableArn;
    /**
     * <p>
     * ARN associated with the backup.
     * </p>
     */
    private String backupArn;
    /**
     * <p>
     * Name of the specified backup.
     * </p>
     */
    private String backupName;
    /**
     * <p>
     * Time at which the backup was created.
     * </p>
     */
    private java.util.Date backupCreationDateTime;
    /**
     * <p>
     * Backup can be in one of the following states: CREATING, ACTIVE, DELETED.
     * </p>
     */
    private String backupStatus;
    /**
     * <p>
     * Size of the backup in bytes.
     * </p>
     */
    private Long backupSizeBytes;

    /**
     * <p>
     * Name of the table.
     * </p>
     * 
     * @param tableName
     *        Name of the table.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * Name of the table.
     * </p>
     * 
     * @return Name of the table.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * Name of the table.
     * </p>
     * 
     * @param tableName
     *        Name of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupSummary withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * Unique identifier for the table.
     * </p>
     * 
     * @param tableId
     *        Unique identifier for the table.
     */

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    /**
     * <p>
     * Unique identifier for the table.
     * </p>
     * 
     * @return Unique identifier for the table.
     */

    public String getTableId() {
        return this.tableId;
    }

    /**
     * <p>
     * Unique identifier for the table.
     * </p>
     * 
     * @param tableId
     *        Unique identifier for the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupSummary withTableId(String tableId) {
        setTableId(tableId);
        return this;
    }

    /**
     * <p>
     * ARN associated with the table.
     * </p>
     * 
     * @param tableArn
     *        ARN associated with the table.
     */

    public void setTableArn(String tableArn) {
        this.tableArn = tableArn;
    }

    /**
     * <p>
     * ARN associated with the table.
     * </p>
     * 
     * @return ARN associated with the table.
     */

    public String getTableArn() {
        return this.tableArn;
    }

    /**
     * <p>
     * ARN associated with the table.
     * </p>
     * 
     * @param tableArn
     *        ARN associated with the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupSummary withTableArn(String tableArn) {
        setTableArn(tableArn);
        return this;
    }

    /**
     * <p>
     * ARN associated with the backup.
     * </p>
     * 
     * @param backupArn
     *        ARN associated with the backup.
     */

    public void setBackupArn(String backupArn) {
        this.backupArn = backupArn;
    }

    /**
     * <p>
     * ARN associated with the backup.
     * </p>
     * 
     * @return ARN associated with the backup.
     */

    public String getBackupArn() {
        return this.backupArn;
    }

    /**
     * <p>
     * ARN associated with the backup.
     * </p>
     * 
     * @param backupArn
     *        ARN associated with the backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupSummary withBackupArn(String backupArn) {
        setBackupArn(backupArn);
        return this;
    }

    /**
     * <p>
     * Name of the specified backup.
     * </p>
     * 
     * @param backupName
     *        Name of the specified backup.
     */

    public void setBackupName(String backupName) {
        this.backupName = backupName;
    }

    /**
     * <p>
     * Name of the specified backup.
     * </p>
     * 
     * @return Name of the specified backup.
     */

    public String getBackupName() {
        return this.backupName;
    }

    /**
     * <p>
     * Name of the specified backup.
     * </p>
     * 
     * @param backupName
     *        Name of the specified backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupSummary withBackupName(String backupName) {
        setBackupName(backupName);
        return this;
    }

    /**
     * <p>
     * Time at which the backup was created.
     * </p>
     * 
     * @param backupCreationDateTime
     *        Time at which the backup was created.
     */

    public void setBackupCreationDateTime(java.util.Date backupCreationDateTime) {
        this.backupCreationDateTime = backupCreationDateTime;
    }

    /**
     * <p>
     * Time at which the backup was created.
     * </p>
     * 
     * @return Time at which the backup was created.
     */

    public java.util.Date getBackupCreationDateTime() {
        return this.backupCreationDateTime;
    }

    /**
     * <p>
     * Time at which the backup was created.
     * </p>
     * 
     * @param backupCreationDateTime
     *        Time at which the backup was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupSummary withBackupCreationDateTime(java.util.Date backupCreationDateTime) {
        setBackupCreationDateTime(backupCreationDateTime);
        return this;
    }

    /**
     * <p>
     * Backup can be in one of the following states: CREATING, ACTIVE, DELETED.
     * </p>
     * 
     * @param backupStatus
     *        Backup can be in one of the following states: CREATING, ACTIVE, DELETED.
     * @see BackupStatus
     */

    public void setBackupStatus(String backupStatus) {
        this.backupStatus = backupStatus;
    }

    /**
     * <p>
     * Backup can be in one of the following states: CREATING, ACTIVE, DELETED.
     * </p>
     * 
     * @return Backup can be in one of the following states: CREATING, ACTIVE, DELETED.
     * @see BackupStatus
     */

    public String getBackupStatus() {
        return this.backupStatus;
    }

    /**
     * <p>
     * Backup can be in one of the following states: CREATING, ACTIVE, DELETED.
     * </p>
     * 
     * @param backupStatus
     *        Backup can be in one of the following states: CREATING, ACTIVE, DELETED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BackupStatus
     */

    public BackupSummary withBackupStatus(String backupStatus) {
        setBackupStatus(backupStatus);
        return this;
    }

    /**
     * <p>
     * Backup can be in one of the following states: CREATING, ACTIVE, DELETED.
     * </p>
     * 
     * @param backupStatus
     *        Backup can be in one of the following states: CREATING, ACTIVE, DELETED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BackupStatus
     */

    public BackupSummary withBackupStatus(BackupStatus backupStatus) {
        this.backupStatus = backupStatus.toString();
        return this;
    }

    /**
     * <p>
     * Size of the backup in bytes.
     * </p>
     * 
     * @param backupSizeBytes
     *        Size of the backup in bytes.
     */

    public void setBackupSizeBytes(Long backupSizeBytes) {
        this.backupSizeBytes = backupSizeBytes;
    }

    /**
     * <p>
     * Size of the backup in bytes.
     * </p>
     * 
     * @return Size of the backup in bytes.
     */

    public Long getBackupSizeBytes() {
        return this.backupSizeBytes;
    }

    /**
     * <p>
     * Size of the backup in bytes.
     * </p>
     * 
     * @param backupSizeBytes
     *        Size of the backup in bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupSummary withBackupSizeBytes(Long backupSizeBytes) {
        setBackupSizeBytes(backupSizeBytes);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getTableId() != null)
            sb.append("TableId: ").append(getTableId()).append(",");
        if (getTableArn() != null)
            sb.append("TableArn: ").append(getTableArn()).append(",");
        if (getBackupArn() != null)
            sb.append("BackupArn: ").append(getBackupArn()).append(",");
        if (getBackupName() != null)
            sb.append("BackupName: ").append(getBackupName()).append(",");
        if (getBackupCreationDateTime() != null)
            sb.append("BackupCreationDateTime: ").append(getBackupCreationDateTime()).append(",");
        if (getBackupStatus() != null)
            sb.append("BackupStatus: ").append(getBackupStatus()).append(",");
        if (getBackupSizeBytes() != null)
            sb.append("BackupSizeBytes: ").append(getBackupSizeBytes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BackupSummary == false)
            return false;
        BackupSummary other = (BackupSummary) obj;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getTableId() == null ^ this.getTableId() == null)
            return false;
        if (other.getTableId() != null && other.getTableId().equals(this.getTableId()) == false)
            return false;
        if (other.getTableArn() == null ^ this.getTableArn() == null)
            return false;
        if (other.getTableArn() != null && other.getTableArn().equals(this.getTableArn()) == false)
            return false;
        if (other.getBackupArn() == null ^ this.getBackupArn() == null)
            return false;
        if (other.getBackupArn() != null && other.getBackupArn().equals(this.getBackupArn()) == false)
            return false;
        if (other.getBackupName() == null ^ this.getBackupName() == null)
            return false;
        if (other.getBackupName() != null && other.getBackupName().equals(this.getBackupName()) == false)
            return false;
        if (other.getBackupCreationDateTime() == null ^ this.getBackupCreationDateTime() == null)
            return false;
        if (other.getBackupCreationDateTime() != null && other.getBackupCreationDateTime().equals(this.getBackupCreationDateTime()) == false)
            return false;
        if (other.getBackupStatus() == null ^ this.getBackupStatus() == null)
            return false;
        if (other.getBackupStatus() != null && other.getBackupStatus().equals(this.getBackupStatus()) == false)
            return false;
        if (other.getBackupSizeBytes() == null ^ this.getBackupSizeBytes() == null)
            return false;
        if (other.getBackupSizeBytes() != null && other.getBackupSizeBytes().equals(this.getBackupSizeBytes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getTableId() == null) ? 0 : getTableId().hashCode());
        hashCode = prime * hashCode + ((getTableArn() == null) ? 0 : getTableArn().hashCode());
        hashCode = prime * hashCode + ((getBackupArn() == null) ? 0 : getBackupArn().hashCode());
        hashCode = prime * hashCode + ((getBackupName() == null) ? 0 : getBackupName().hashCode());
        hashCode = prime * hashCode + ((getBackupCreationDateTime() == null) ? 0 : getBackupCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getBackupStatus() == null) ? 0 : getBackupStatus().hashCode());
        hashCode = prime * hashCode + ((getBackupSizeBytes() == null) ? 0 : getBackupSizeBytes().hashCode());
        return hashCode;
    }

    @Override
    public BackupSummary clone() {
        try {
            return (BackupSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.BackupSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
