/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains detailed information about a saved recovery point.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/RecoveryPointByResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecoveryPointByResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a recovery point; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     * </p>
     */
    private String recoveryPointArn;
    /**
     * <p>
     * The date and time a recovery point is created, in Unix format and Coordinated Universal Time (UTC). The value of
     * <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents Friday,
     * January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * A status code specifying the state of the recovery point.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A message explaining the reason of the recovery point deletion failure.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The server-side encryption key that is used to protect your backups; for example,
     * <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     */
    private String encryptionKeyArn;
    /**
     * <p>
     * The size, in bytes, of a backup.
     * </p>
     */
    private Long backupSizeBytes;
    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique
     * to the account used to create them and the Amazon Web Services Region where they are created. They consist of
     * lowercase letters, numbers, and hyphens.
     * </p>
     */
    private String backupVaultName;
    /**
     * <p>
     * This is a boolean value indicating this is a parent (composite) recovery point.
     * </p>
     */
    private Boolean isParent;
    /**
     * <p>
     * This is the Amazon Resource Name (ARN) of the parent (composite) recovery point.
     * </p>
     */
    private String parentRecoveryPointArn;

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a recovery point; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     * </p>
     * 
     * @param recoveryPointArn
     *        An Amazon Resource Name (ARN) that uniquely identifies a recovery point; for example,
     *        <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     */

    public void setRecoveryPointArn(String recoveryPointArn) {
        this.recoveryPointArn = recoveryPointArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a recovery point; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     * </p>
     * 
     * @return An Amazon Resource Name (ARN) that uniquely identifies a recovery point; for example,
     *         <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     */

    public String getRecoveryPointArn() {
        return this.recoveryPointArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a recovery point; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     * </p>
     * 
     * @param recoveryPointArn
     *        An Amazon Resource Name (ARN) that uniquely identifies a recovery point; for example,
     *        <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryPointByResource withRecoveryPointArn(String recoveryPointArn) {
        setRecoveryPointArn(recoveryPointArn);
        return this;
    }

    /**
     * <p>
     * The date and time a recovery point is created, in Unix format and Coordinated Universal Time (UTC). The value of
     * <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents Friday,
     * January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param creationDate
     *        The date and time a recovery point is created, in Unix format and Coordinated Universal Time (UTC). The
     *        value of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087
     *        represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time a recovery point is created, in Unix format and Coordinated Universal Time (UTC). The value of
     * <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents Friday,
     * January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @return The date and time a recovery point is created, in Unix format and Coordinated Universal Time (UTC). The
     *         value of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087
     *         represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date and time a recovery point is created, in Unix format and Coordinated Universal Time (UTC). The value of
     * <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents Friday,
     * January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param creationDate
     *        The date and time a recovery point is created, in Unix format and Coordinated Universal Time (UTC). The
     *        value of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087
     *        represents Friday, January 26, 2018 12:11:30.087 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryPointByResource withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * A status code specifying the state of the recovery point.
     * </p>
     * 
     * @param status
     *        A status code specifying the state of the recovery point.
     * @see RecoveryPointStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * A status code specifying the state of the recovery point.
     * </p>
     * 
     * @return A status code specifying the state of the recovery point.
     * @see RecoveryPointStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * A status code specifying the state of the recovery point.
     * </p>
     * 
     * @param status
     *        A status code specifying the state of the recovery point.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecoveryPointStatus
     */

    public RecoveryPointByResource withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A status code specifying the state of the recovery point.
     * </p>
     * 
     * @param status
     *        A status code specifying the state of the recovery point.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecoveryPointStatus
     */

    public RecoveryPointByResource withStatus(RecoveryPointStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A message explaining the reason of the recovery point deletion failure.
     * </p>
     * 
     * @param statusMessage
     *        A message explaining the reason of the recovery point deletion failure.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A message explaining the reason of the recovery point deletion failure.
     * </p>
     * 
     * @return A message explaining the reason of the recovery point deletion failure.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * A message explaining the reason of the recovery point deletion failure.
     * </p>
     * 
     * @param statusMessage
     *        A message explaining the reason of the recovery point deletion failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryPointByResource withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The server-side encryption key that is used to protect your backups; for example,
     * <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * 
     * @param encryptionKeyArn
     *        The server-side encryption key that is used to protect your backups; for example,
     *        <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     */

    public void setEncryptionKeyArn(String encryptionKeyArn) {
        this.encryptionKeyArn = encryptionKeyArn;
    }

    /**
     * <p>
     * The server-side encryption key that is used to protect your backups; for example,
     * <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * 
     * @return The server-side encryption key that is used to protect your backups; for example,
     *         <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     */

    public String getEncryptionKeyArn() {
        return this.encryptionKeyArn;
    }

    /**
     * <p>
     * The server-side encryption key that is used to protect your backups; for example,
     * <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * 
     * @param encryptionKeyArn
     *        The server-side encryption key that is used to protect your backups; for example,
     *        <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryPointByResource withEncryptionKeyArn(String encryptionKeyArn) {
        setEncryptionKeyArn(encryptionKeyArn);
        return this;
    }

    /**
     * <p>
     * The size, in bytes, of a backup.
     * </p>
     * 
     * @param backupSizeBytes
     *        The size, in bytes, of a backup.
     */

    public void setBackupSizeBytes(Long backupSizeBytes) {
        this.backupSizeBytes = backupSizeBytes;
    }

    /**
     * <p>
     * The size, in bytes, of a backup.
     * </p>
     * 
     * @return The size, in bytes, of a backup.
     */

    public Long getBackupSizeBytes() {
        return this.backupSizeBytes;
    }

    /**
     * <p>
     * The size, in bytes, of a backup.
     * </p>
     * 
     * @param backupSizeBytes
     *        The size, in bytes, of a backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryPointByResource withBackupSizeBytes(Long backupSizeBytes) {
        setBackupSizeBytes(backupSizeBytes);
        return this;
    }

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique
     * to the account used to create them and the Amazon Web Services Region where they are created. They consist of
     * lowercase letters, numbers, and hyphens.
     * </p>
     * 
     * @param backupVaultName
     *        The name of a logical container where backups are stored. Backup vaults are identified by names that are
     *        unique to the account used to create them and the Amazon Web Services Region where they are created. They
     *        consist of lowercase letters, numbers, and hyphens.
     */

    public void setBackupVaultName(String backupVaultName) {
        this.backupVaultName = backupVaultName;
    }

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique
     * to the account used to create them and the Amazon Web Services Region where they are created. They consist of
     * lowercase letters, numbers, and hyphens.
     * </p>
     * 
     * @return The name of a logical container where backups are stored. Backup vaults are identified by names that are
     *         unique to the account used to create them and the Amazon Web Services Region where they are created. They
     *         consist of lowercase letters, numbers, and hyphens.
     */

    public String getBackupVaultName() {
        return this.backupVaultName;
    }

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique
     * to the account used to create them and the Amazon Web Services Region where they are created. They consist of
     * lowercase letters, numbers, and hyphens.
     * </p>
     * 
     * @param backupVaultName
     *        The name of a logical container where backups are stored. Backup vaults are identified by names that are
     *        unique to the account used to create them and the Amazon Web Services Region where they are created. They
     *        consist of lowercase letters, numbers, and hyphens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryPointByResource withBackupVaultName(String backupVaultName) {
        setBackupVaultName(backupVaultName);
        return this;
    }

    /**
     * <p>
     * This is a boolean value indicating this is a parent (composite) recovery point.
     * </p>
     * 
     * @param isParent
     *        This is a boolean value indicating this is a parent (composite) recovery point.
     */

    public void setIsParent(Boolean isParent) {
        this.isParent = isParent;
    }

    /**
     * <p>
     * This is a boolean value indicating this is a parent (composite) recovery point.
     * </p>
     * 
     * @return This is a boolean value indicating this is a parent (composite) recovery point.
     */

    public Boolean getIsParent() {
        return this.isParent;
    }

    /**
     * <p>
     * This is a boolean value indicating this is a parent (composite) recovery point.
     * </p>
     * 
     * @param isParent
     *        This is a boolean value indicating this is a parent (composite) recovery point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryPointByResource withIsParent(Boolean isParent) {
        setIsParent(isParent);
        return this;
    }

    /**
     * <p>
     * This is a boolean value indicating this is a parent (composite) recovery point.
     * </p>
     * 
     * @return This is a boolean value indicating this is a parent (composite) recovery point.
     */

    public Boolean isParent() {
        return this.isParent;
    }

    /**
     * <p>
     * This is the Amazon Resource Name (ARN) of the parent (composite) recovery point.
     * </p>
     * 
     * @param parentRecoveryPointArn
     *        This is the Amazon Resource Name (ARN) of the parent (composite) recovery point.
     */

    public void setParentRecoveryPointArn(String parentRecoveryPointArn) {
        this.parentRecoveryPointArn = parentRecoveryPointArn;
    }

    /**
     * <p>
     * This is the Amazon Resource Name (ARN) of the parent (composite) recovery point.
     * </p>
     * 
     * @return This is the Amazon Resource Name (ARN) of the parent (composite) recovery point.
     */

    public String getParentRecoveryPointArn() {
        return this.parentRecoveryPointArn;
    }

    /**
     * <p>
     * This is the Amazon Resource Name (ARN) of the parent (composite) recovery point.
     * </p>
     * 
     * @param parentRecoveryPointArn
     *        This is the Amazon Resource Name (ARN) of the parent (composite) recovery point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecoveryPointByResource withParentRecoveryPointArn(String parentRecoveryPointArn) {
        setParentRecoveryPointArn(parentRecoveryPointArn);
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
        if (getRecoveryPointArn() != null)
            sb.append("RecoveryPointArn: ").append(getRecoveryPointArn()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getEncryptionKeyArn() != null)
            sb.append("EncryptionKeyArn: ").append(getEncryptionKeyArn()).append(",");
        if (getBackupSizeBytes() != null)
            sb.append("BackupSizeBytes: ").append(getBackupSizeBytes()).append(",");
        if (getBackupVaultName() != null)
            sb.append("BackupVaultName: ").append(getBackupVaultName()).append(",");
        if (getIsParent() != null)
            sb.append("IsParent: ").append(getIsParent()).append(",");
        if (getParentRecoveryPointArn() != null)
            sb.append("ParentRecoveryPointArn: ").append(getParentRecoveryPointArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecoveryPointByResource == false)
            return false;
        RecoveryPointByResource other = (RecoveryPointByResource) obj;
        if (other.getRecoveryPointArn() == null ^ this.getRecoveryPointArn() == null)
            return false;
        if (other.getRecoveryPointArn() != null && other.getRecoveryPointArn().equals(this.getRecoveryPointArn()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getEncryptionKeyArn() == null ^ this.getEncryptionKeyArn() == null)
            return false;
        if (other.getEncryptionKeyArn() != null && other.getEncryptionKeyArn().equals(this.getEncryptionKeyArn()) == false)
            return false;
        if (other.getBackupSizeBytes() == null ^ this.getBackupSizeBytes() == null)
            return false;
        if (other.getBackupSizeBytes() != null && other.getBackupSizeBytes().equals(this.getBackupSizeBytes()) == false)
            return false;
        if (other.getBackupVaultName() == null ^ this.getBackupVaultName() == null)
            return false;
        if (other.getBackupVaultName() != null && other.getBackupVaultName().equals(this.getBackupVaultName()) == false)
            return false;
        if (other.getIsParent() == null ^ this.getIsParent() == null)
            return false;
        if (other.getIsParent() != null && other.getIsParent().equals(this.getIsParent()) == false)
            return false;
        if (other.getParentRecoveryPointArn() == null ^ this.getParentRecoveryPointArn() == null)
            return false;
        if (other.getParentRecoveryPointArn() != null && other.getParentRecoveryPointArn().equals(this.getParentRecoveryPointArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecoveryPointArn() == null) ? 0 : getRecoveryPointArn().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getEncryptionKeyArn() == null) ? 0 : getEncryptionKeyArn().hashCode());
        hashCode = prime * hashCode + ((getBackupSizeBytes() == null) ? 0 : getBackupSizeBytes().hashCode());
        hashCode = prime * hashCode + ((getBackupVaultName() == null) ? 0 : getBackupVaultName().hashCode());
        hashCode = prime * hashCode + ((getIsParent() == null) ? 0 : getIsParent().hashCode());
        hashCode = prime * hashCode + ((getParentRecoveryPointArn() == null) ? 0 : getParentRecoveryPointArn().hashCode());
        return hashCode;
    }

    @Override
    public RecoveryPointByResource clone() {
        try {
            return (RecoveryPointByResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backup.model.transform.RecoveryPointByResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
