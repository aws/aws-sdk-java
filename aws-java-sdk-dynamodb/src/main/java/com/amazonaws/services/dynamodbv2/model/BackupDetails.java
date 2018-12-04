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
 * Contains the details of the backup created for the table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/BackupDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BackupDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * ARN associated with the backup.
     * </p>
     */
    private String backupArn;
    /**
     * <p>
     * Name of the requested backup.
     * </p>
     */
    private String backupName;
    /**
     * <p>
     * Size of the backup in bytes.
     * </p>
     */
    private Long backupSizeBytes;
    /**
     * <p>
     * Backup can be in one of the following states: CREATING, ACTIVE, DELETED.
     * </p>
     */
    private String backupStatus;
    /**
     * <p>
     * Time at which the backup was created. This is the request time of the backup.
     * </p>
     */
    private java.util.Date backupCreationDateTime;

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

    public BackupDetails withBackupArn(String backupArn) {
        setBackupArn(backupArn);
        return this;
    }

    /**
     * <p>
     * Name of the requested backup.
     * </p>
     * 
     * @param backupName
     *        Name of the requested backup.
     */

    public void setBackupName(String backupName) {
        this.backupName = backupName;
    }

    /**
     * <p>
     * Name of the requested backup.
     * </p>
     * 
     * @return Name of the requested backup.
     */

    public String getBackupName() {
        return this.backupName;
    }

    /**
     * <p>
     * Name of the requested backup.
     * </p>
     * 
     * @param backupName
     *        Name of the requested backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupDetails withBackupName(String backupName) {
        setBackupName(backupName);
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

    public BackupDetails withBackupSizeBytes(Long backupSizeBytes) {
        setBackupSizeBytes(backupSizeBytes);
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

    public BackupDetails withBackupStatus(String backupStatus) {
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

    public BackupDetails withBackupStatus(BackupStatus backupStatus) {
        this.backupStatus = backupStatus.toString();
        return this;
    }

    /**
     * <p>
     * Time at which the backup was created. This is the request time of the backup.
     * </p>
     * 
     * @param backupCreationDateTime
     *        Time at which the backup was created. This is the request time of the backup.
     */

    public void setBackupCreationDateTime(java.util.Date backupCreationDateTime) {
        this.backupCreationDateTime = backupCreationDateTime;
    }

    /**
     * <p>
     * Time at which the backup was created. This is the request time of the backup.
     * </p>
     * 
     * @return Time at which the backup was created. This is the request time of the backup.
     */

    public java.util.Date getBackupCreationDateTime() {
        return this.backupCreationDateTime;
    }

    /**
     * <p>
     * Time at which the backup was created. This is the request time of the backup.
     * </p>
     * 
     * @param backupCreationDateTime
     *        Time at which the backup was created. This is the request time of the backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupDetails withBackupCreationDateTime(java.util.Date backupCreationDateTime) {
        setBackupCreationDateTime(backupCreationDateTime);
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
        if (getBackupArn() != null)
            sb.append("BackupArn: ").append(getBackupArn()).append(",");
        if (getBackupName() != null)
            sb.append("BackupName: ").append(getBackupName()).append(",");
        if (getBackupSizeBytes() != null)
            sb.append("BackupSizeBytes: ").append(getBackupSizeBytes()).append(",");
        if (getBackupStatus() != null)
            sb.append("BackupStatus: ").append(getBackupStatus()).append(",");
        if (getBackupCreationDateTime() != null)
            sb.append("BackupCreationDateTime: ").append(getBackupCreationDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BackupDetails == false)
            return false;
        BackupDetails other = (BackupDetails) obj;
        if (other.getBackupArn() == null ^ this.getBackupArn() == null)
            return false;
        if (other.getBackupArn() != null && other.getBackupArn().equals(this.getBackupArn()) == false)
            return false;
        if (other.getBackupName() == null ^ this.getBackupName() == null)
            return false;
        if (other.getBackupName() != null && other.getBackupName().equals(this.getBackupName()) == false)
            return false;
        if (other.getBackupSizeBytes() == null ^ this.getBackupSizeBytes() == null)
            return false;
        if (other.getBackupSizeBytes() != null && other.getBackupSizeBytes().equals(this.getBackupSizeBytes()) == false)
            return false;
        if (other.getBackupStatus() == null ^ this.getBackupStatus() == null)
            return false;
        if (other.getBackupStatus() != null && other.getBackupStatus().equals(this.getBackupStatus()) == false)
            return false;
        if (other.getBackupCreationDateTime() == null ^ this.getBackupCreationDateTime() == null)
            return false;
        if (other.getBackupCreationDateTime() != null && other.getBackupCreationDateTime().equals(this.getBackupCreationDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupArn() == null) ? 0 : getBackupArn().hashCode());
        hashCode = prime * hashCode + ((getBackupName() == null) ? 0 : getBackupName().hashCode());
        hashCode = prime * hashCode + ((getBackupSizeBytes() == null) ? 0 : getBackupSizeBytes().hashCode());
        hashCode = prime * hashCode + ((getBackupStatus() == null) ? 0 : getBackupStatus().hashCode());
        hashCode = prime * hashCode + ((getBackupCreationDateTime() == null) ? 0 : getBackupCreationDateTime().hashCode());
        return hashCode;
    }

    @Override
    public BackupDetails clone() {
        try {
            return (BackupDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.BackupDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
