/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * BackupType:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>USER</code> - You create and manage these using the on-demand backup feature.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SYSTEM</code> - If you delete a table with point-in-time recovery enabled, a <code>SYSTEM</code> backup is
     * automatically created and is retained for 35 days (at no additional cost). System backups allow you to restore
     * the deleted table to the state it was in just before the point of deletion.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_BACKUP</code> - On-demand backup created by you from AWS Backup service.
     * </p>
     * </li>
     * </ul>
     */
    private String backupType;
    /**
     * <p>
     * Time at which the backup was created. This is the request time of the backup.
     * </p>
     */
    private java.util.Date backupCreationDateTime;
    /**
     * <p>
     * Time at which the automatic on-demand backup created by DynamoDB will expire. This <code>SYSTEM</code> on-demand
     * backup expires automatically 35 days after its creation.
     * </p>
     */
    private java.util.Date backupExpiryDateTime;

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
     * BackupType:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>USER</code> - You create and manage these using the on-demand backup feature.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SYSTEM</code> - If you delete a table with point-in-time recovery enabled, a <code>SYSTEM</code> backup is
     * automatically created and is retained for 35 days (at no additional cost). System backups allow you to restore
     * the deleted table to the state it was in just before the point of deletion.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_BACKUP</code> - On-demand backup created by you from AWS Backup service.
     * </p>
     * </li>
     * </ul>
     * 
     * @param backupType
     *        BackupType:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>USER</code> - You create and manage these using the on-demand backup feature.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SYSTEM</code> - If you delete a table with point-in-time recovery enabled, a <code>SYSTEM</code>
     *        backup is automatically created and is retained for 35 days (at no additional cost). System backups allow
     *        you to restore the deleted table to the state it was in just before the point of deletion.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS_BACKUP</code> - On-demand backup created by you from AWS Backup service.
     *        </p>
     *        </li>
     * @see BackupType
     */

    public void setBackupType(String backupType) {
        this.backupType = backupType;
    }

    /**
     * <p>
     * BackupType:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>USER</code> - You create and manage these using the on-demand backup feature.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SYSTEM</code> - If you delete a table with point-in-time recovery enabled, a <code>SYSTEM</code> backup is
     * automatically created and is retained for 35 days (at no additional cost). System backups allow you to restore
     * the deleted table to the state it was in just before the point of deletion.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_BACKUP</code> - On-demand backup created by you from AWS Backup service.
     * </p>
     * </li>
     * </ul>
     * 
     * @return BackupType:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>USER</code> - You create and manage these using the on-demand backup feature.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SYSTEM</code> - If you delete a table with point-in-time recovery enabled, a <code>SYSTEM</code>
     *         backup is automatically created and is retained for 35 days (at no additional cost). System backups allow
     *         you to restore the deleted table to the state it was in just before the point of deletion.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS_BACKUP</code> - On-demand backup created by you from AWS Backup service.
     *         </p>
     *         </li>
     * @see BackupType
     */

    public String getBackupType() {
        return this.backupType;
    }

    /**
     * <p>
     * BackupType:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>USER</code> - You create and manage these using the on-demand backup feature.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SYSTEM</code> - If you delete a table with point-in-time recovery enabled, a <code>SYSTEM</code> backup is
     * automatically created and is retained for 35 days (at no additional cost). System backups allow you to restore
     * the deleted table to the state it was in just before the point of deletion.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_BACKUP</code> - On-demand backup created by you from AWS Backup service.
     * </p>
     * </li>
     * </ul>
     * 
     * @param backupType
     *        BackupType:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>USER</code> - You create and manage these using the on-demand backup feature.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SYSTEM</code> - If you delete a table with point-in-time recovery enabled, a <code>SYSTEM</code>
     *        backup is automatically created and is retained for 35 days (at no additional cost). System backups allow
     *        you to restore the deleted table to the state it was in just before the point of deletion.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS_BACKUP</code> - On-demand backup created by you from AWS Backup service.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BackupType
     */

    public BackupDetails withBackupType(String backupType) {
        setBackupType(backupType);
        return this;
    }

    /**
     * <p>
     * BackupType:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>USER</code> - You create and manage these using the on-demand backup feature.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SYSTEM</code> - If you delete a table with point-in-time recovery enabled, a <code>SYSTEM</code> backup is
     * automatically created and is retained for 35 days (at no additional cost). System backups allow you to restore
     * the deleted table to the state it was in just before the point of deletion.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_BACKUP</code> - On-demand backup created by you from AWS Backup service.
     * </p>
     * </li>
     * </ul>
     * 
     * @param backupType
     *        BackupType:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>USER</code> - You create and manage these using the on-demand backup feature.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SYSTEM</code> - If you delete a table with point-in-time recovery enabled, a <code>SYSTEM</code>
     *        backup is automatically created and is retained for 35 days (at no additional cost). System backups allow
     *        you to restore the deleted table to the state it was in just before the point of deletion.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS_BACKUP</code> - On-demand backup created by you from AWS Backup service.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BackupType
     */

    public BackupDetails withBackupType(BackupType backupType) {
        this.backupType = backupType.toString();
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
     * <p>
     * Time at which the automatic on-demand backup created by DynamoDB will expire. This <code>SYSTEM</code> on-demand
     * backup expires automatically 35 days after its creation.
     * </p>
     * 
     * @param backupExpiryDateTime
     *        Time at which the automatic on-demand backup created by DynamoDB will expire. This <code>SYSTEM</code>
     *        on-demand backup expires automatically 35 days after its creation.
     */

    public void setBackupExpiryDateTime(java.util.Date backupExpiryDateTime) {
        this.backupExpiryDateTime = backupExpiryDateTime;
    }

    /**
     * <p>
     * Time at which the automatic on-demand backup created by DynamoDB will expire. This <code>SYSTEM</code> on-demand
     * backup expires automatically 35 days after its creation.
     * </p>
     * 
     * @return Time at which the automatic on-demand backup created by DynamoDB will expire. This <code>SYSTEM</code>
     *         on-demand backup expires automatically 35 days after its creation.
     */

    public java.util.Date getBackupExpiryDateTime() {
        return this.backupExpiryDateTime;
    }

    /**
     * <p>
     * Time at which the automatic on-demand backup created by DynamoDB will expire. This <code>SYSTEM</code> on-demand
     * backup expires automatically 35 days after its creation.
     * </p>
     * 
     * @param backupExpiryDateTime
     *        Time at which the automatic on-demand backup created by DynamoDB will expire. This <code>SYSTEM</code>
     *        on-demand backup expires automatically 35 days after its creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupDetails withBackupExpiryDateTime(java.util.Date backupExpiryDateTime) {
        setBackupExpiryDateTime(backupExpiryDateTime);
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
        if (getBackupArn() != null)
            sb.append("BackupArn: ").append(getBackupArn()).append(",");
        if (getBackupName() != null)
            sb.append("BackupName: ").append(getBackupName()).append(",");
        if (getBackupSizeBytes() != null)
            sb.append("BackupSizeBytes: ").append(getBackupSizeBytes()).append(",");
        if (getBackupStatus() != null)
            sb.append("BackupStatus: ").append(getBackupStatus()).append(",");
        if (getBackupType() != null)
            sb.append("BackupType: ").append(getBackupType()).append(",");
        if (getBackupCreationDateTime() != null)
            sb.append("BackupCreationDateTime: ").append(getBackupCreationDateTime()).append(",");
        if (getBackupExpiryDateTime() != null)
            sb.append("BackupExpiryDateTime: ").append(getBackupExpiryDateTime());
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
        if (other.getBackupType() == null ^ this.getBackupType() == null)
            return false;
        if (other.getBackupType() != null && other.getBackupType().equals(this.getBackupType()) == false)
            return false;
        if (other.getBackupCreationDateTime() == null ^ this.getBackupCreationDateTime() == null)
            return false;
        if (other.getBackupCreationDateTime() != null && other.getBackupCreationDateTime().equals(this.getBackupCreationDateTime()) == false)
            return false;
        if (other.getBackupExpiryDateTime() == null ^ this.getBackupExpiryDateTime() == null)
            return false;
        if (other.getBackupExpiryDateTime() != null && other.getBackupExpiryDateTime().equals(this.getBackupExpiryDateTime()) == false)
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
        hashCode = prime * hashCode + ((getBackupType() == null) ? 0 : getBackupType().hashCode());
        hashCode = prime * hashCode + ((getBackupCreationDateTime() == null) ? 0 : getBackupCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getBackupExpiryDateTime() == null) ? 0 : getBackupExpiryDateTime().hashCode());
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
