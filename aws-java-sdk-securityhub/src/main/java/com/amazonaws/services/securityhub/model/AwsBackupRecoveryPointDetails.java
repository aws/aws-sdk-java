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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains detailed information about the recovery points stored in an Backup backup vault. A backup, or recovery
 * point, represents the content of a resource at a specified time.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsBackupRecoveryPointDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsBackupRecoveryPointDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The size, in bytes, of a backup.
     * </p>
     */
    private Long backupSizeInBytes;
    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a backup vault.
     * </p>
     */
    private String backupVaultArn;
    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique
     * to the Amazon Web Services account used to create them and the Amazon Web Services Region where they are created.
     * They consist of lowercase letters, numbers, and hyphens.
     * </p>
     */
    private String backupVaultName;
    /**
     * <p>
     * A <code>CalculatedLifecycle</code> object containing <code>DeleteAt</code> and <code>MoveToColdStorageAt</code>
     * timestamps.
     * </p>
     */
    private AwsBackupRecoveryPointCalculatedLifecycleDetails calculatedLifecycle;
    /**
     * <p>
     * The date and time that a job to create a recovery point is completed, in Unix format and UTC. The value of
     * <code>CompletionDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents Friday,
     * January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private String completionDate;
    /**
     * <p>
     * Contains identifying information about the creation of a recovery point, including the <code>BackupPlanArn</code>, <code>BackupPlanId</code>, <code>BackupPlanVersion</code>, and <code>BackupRuleId</code> of the backup plan
     * that is used to create it.
     * </p>
     */
    private AwsBackupRecoveryPointCreatedByDetails createdBy;
    /**
     * <p>
     * The date and time a recovery point is created, in Unix format and UTC. The value of <code>CreationDate</code> is
     * accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087
     * AM.
     * </p>
     */
    private String creationDate;
    /**
     * <p>
     * The ARN for the server-side encryption key that is used to protect your backups.
     * </p>
     */
    private String encryptionKeyArn;
    /**
     * <p>
     * Specifies the IAM role ARN used to create the target recovery point
     * </p>
     */
    private String iamRoleArn;
    /**
     * <p>
     * A Boolean value that is returned as <code>TRUE</code> if the specified recovery point is encrypted, or
     * <code>FALSE</code> if the recovery point is not encrypted.
     * </p>
     */
    private Boolean isEncrypted;
    /**
     * <p>
     * The date and time that a recovery point was last restored, in Unix format and UTC. The value of
     * <code>LastRestoreTime</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private String lastRestoreTime;
    /**
     * <p>
     * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. Backup
     * transitions and expires backups automatically according to the lifecycle that you define
     * </p>
     */
    private AwsBackupRecoveryPointLifecycleDetails lifecycle;
    /**
     * <p>
     * An ARN that uniquely identifies a recovery point.
     * </p>
     */
    private String recoveryPointArn;
    /**
     * <p>
     * An ARN that uniquely identifies a resource. The format of the ARN depends on the resource type.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The type of Amazon Web Services resource saved as a recovery point, such as an Amazon EBS volume or an Amazon RDS
     * database.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The ARN for the backup vault where the recovery point was originally copied from. If the recovery point is
     * restored to the same account, this value will be null.
     * </p>
     */
    private String sourceBackupVaultArn;
    /**
     * <p>
     * A status code specifying the state of the recovery point. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPLETED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXPIRED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PARTIAL</code>
     * </p>
     * </li>
     * </ul>
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
     * Specifies the storage class of the recovery point. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COLD</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WARM</code>
     * </p>
     * </li>
     * </ul>
     */
    private String storageClass;

    /**
     * <p>
     * The size, in bytes, of a backup.
     * </p>
     * 
     * @param backupSizeInBytes
     *        The size, in bytes, of a backup.
     */

    public void setBackupSizeInBytes(Long backupSizeInBytes) {
        this.backupSizeInBytes = backupSizeInBytes;
    }

    /**
     * <p>
     * The size, in bytes, of a backup.
     * </p>
     * 
     * @return The size, in bytes, of a backup.
     */

    public Long getBackupSizeInBytes() {
        return this.backupSizeInBytes;
    }

    /**
     * <p>
     * The size, in bytes, of a backup.
     * </p>
     * 
     * @param backupSizeInBytes
     *        The size, in bytes, of a backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupRecoveryPointDetails withBackupSizeInBytes(Long backupSizeInBytes) {
        setBackupSizeInBytes(backupSizeInBytes);
        return this;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a backup vault.
     * </p>
     * 
     * @param backupVaultArn
     *        An Amazon Resource Name (ARN) that uniquely identifies a backup vault.
     */

    public void setBackupVaultArn(String backupVaultArn) {
        this.backupVaultArn = backupVaultArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a backup vault.
     * </p>
     * 
     * @return An Amazon Resource Name (ARN) that uniquely identifies a backup vault.
     */

    public String getBackupVaultArn() {
        return this.backupVaultArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a backup vault.
     * </p>
     * 
     * @param backupVaultArn
     *        An Amazon Resource Name (ARN) that uniquely identifies a backup vault.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupRecoveryPointDetails withBackupVaultArn(String backupVaultArn) {
        setBackupVaultArn(backupVaultArn);
        return this;
    }

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique
     * to the Amazon Web Services account used to create them and the Amazon Web Services Region where they are created.
     * They consist of lowercase letters, numbers, and hyphens.
     * </p>
     * 
     * @param backupVaultName
     *        The name of a logical container where backups are stored. Backup vaults are identified by names that are
     *        unique to the Amazon Web Services account used to create them and the Amazon Web Services Region where
     *        they are created. They consist of lowercase letters, numbers, and hyphens.
     */

    public void setBackupVaultName(String backupVaultName) {
        this.backupVaultName = backupVaultName;
    }

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique
     * to the Amazon Web Services account used to create them and the Amazon Web Services Region where they are created.
     * They consist of lowercase letters, numbers, and hyphens.
     * </p>
     * 
     * @return The name of a logical container where backups are stored. Backup vaults are identified by names that are
     *         unique to the Amazon Web Services account used to create them and the Amazon Web Services Region where
     *         they are created. They consist of lowercase letters, numbers, and hyphens.
     */

    public String getBackupVaultName() {
        return this.backupVaultName;
    }

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique
     * to the Amazon Web Services account used to create them and the Amazon Web Services Region where they are created.
     * They consist of lowercase letters, numbers, and hyphens.
     * </p>
     * 
     * @param backupVaultName
     *        The name of a logical container where backups are stored. Backup vaults are identified by names that are
     *        unique to the Amazon Web Services account used to create them and the Amazon Web Services Region where
     *        they are created. They consist of lowercase letters, numbers, and hyphens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupRecoveryPointDetails withBackupVaultName(String backupVaultName) {
        setBackupVaultName(backupVaultName);
        return this;
    }

    /**
     * <p>
     * A <code>CalculatedLifecycle</code> object containing <code>DeleteAt</code> and <code>MoveToColdStorageAt</code>
     * timestamps.
     * </p>
     * 
     * @param calculatedLifecycle
     *        A <code>CalculatedLifecycle</code> object containing <code>DeleteAt</code> and
     *        <code>MoveToColdStorageAt</code> timestamps.
     */

    public void setCalculatedLifecycle(AwsBackupRecoveryPointCalculatedLifecycleDetails calculatedLifecycle) {
        this.calculatedLifecycle = calculatedLifecycle;
    }

    /**
     * <p>
     * A <code>CalculatedLifecycle</code> object containing <code>DeleteAt</code> and <code>MoveToColdStorageAt</code>
     * timestamps.
     * </p>
     * 
     * @return A <code>CalculatedLifecycle</code> object containing <code>DeleteAt</code> and
     *         <code>MoveToColdStorageAt</code> timestamps.
     */

    public AwsBackupRecoveryPointCalculatedLifecycleDetails getCalculatedLifecycle() {
        return this.calculatedLifecycle;
    }

    /**
     * <p>
     * A <code>CalculatedLifecycle</code> object containing <code>DeleteAt</code> and <code>MoveToColdStorageAt</code>
     * timestamps.
     * </p>
     * 
     * @param calculatedLifecycle
     *        A <code>CalculatedLifecycle</code> object containing <code>DeleteAt</code> and
     *        <code>MoveToColdStorageAt</code> timestamps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupRecoveryPointDetails withCalculatedLifecycle(AwsBackupRecoveryPointCalculatedLifecycleDetails calculatedLifecycle) {
        setCalculatedLifecycle(calculatedLifecycle);
        return this;
    }

    /**
     * <p>
     * The date and time that a job to create a recovery point is completed, in Unix format and UTC. The value of
     * <code>CompletionDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents Friday,
     * January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param completionDate
     *        The date and time that a job to create a recovery point is completed, in Unix format and UTC. The value of
     *        <code>CompletionDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     *        Friday, January 26, 2018 12:11:30.087 AM.
     */

    public void setCompletionDate(String completionDate) {
        this.completionDate = completionDate;
    }

    /**
     * <p>
     * The date and time that a job to create a recovery point is completed, in Unix format and UTC. The value of
     * <code>CompletionDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents Friday,
     * January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @return The date and time that a job to create a recovery point is completed, in Unix format and UTC. The value
     *         of <code>CompletionDate</code> is accurate to milliseconds. For example, the value 1516925490.087
     *         represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public String getCompletionDate() {
        return this.completionDate;
    }

    /**
     * <p>
     * The date and time that a job to create a recovery point is completed, in Unix format and UTC. The value of
     * <code>CompletionDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents Friday,
     * January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param completionDate
     *        The date and time that a job to create a recovery point is completed, in Unix format and UTC. The value of
     *        <code>CompletionDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     *        Friday, January 26, 2018 12:11:30.087 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupRecoveryPointDetails withCompletionDate(String completionDate) {
        setCompletionDate(completionDate);
        return this;
    }

    /**
     * <p>
     * Contains identifying information about the creation of a recovery point, including the <code>BackupPlanArn</code>, <code>BackupPlanId</code>, <code>BackupPlanVersion</code>, and <code>BackupRuleId</code> of the backup plan
     * that is used to create it.
     * </p>
     * 
     * @param createdBy
     *        Contains identifying information about the creation of a recovery point, including the
     *        <code>BackupPlanArn</code>, <code>BackupPlanId</code>, <code>BackupPlanVersion</code>, and
     *        <code>BackupRuleId</code> of the backup plan that is used to create it.
     */

    public void setCreatedBy(AwsBackupRecoveryPointCreatedByDetails createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * Contains identifying information about the creation of a recovery point, including the <code>BackupPlanArn</code>, <code>BackupPlanId</code>, <code>BackupPlanVersion</code>, and <code>BackupRuleId</code> of the backup plan
     * that is used to create it.
     * </p>
     * 
     * @return Contains identifying information about the creation of a recovery point, including the
     *         <code>BackupPlanArn</code>, <code>BackupPlanId</code>, <code>BackupPlanVersion</code>, and
     *         <code>BackupRuleId</code> of the backup plan that is used to create it.
     */

    public AwsBackupRecoveryPointCreatedByDetails getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * Contains identifying information about the creation of a recovery point, including the <code>BackupPlanArn</code>, <code>BackupPlanId</code>, <code>BackupPlanVersion</code>, and <code>BackupRuleId</code> of the backup plan
     * that is used to create it.
     * </p>
     * 
     * @param createdBy
     *        Contains identifying information about the creation of a recovery point, including the
     *        <code>BackupPlanArn</code>, <code>BackupPlanId</code>, <code>BackupPlanVersion</code>, and
     *        <code>BackupRuleId</code> of the backup plan that is used to create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupRecoveryPointDetails withCreatedBy(AwsBackupRecoveryPointCreatedByDetails createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The date and time a recovery point is created, in Unix format and UTC. The value of <code>CreationDate</code> is
     * accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087
     * AM.
     * </p>
     * 
     * @param creationDate
     *        The date and time a recovery point is created, in Unix format and UTC. The value of
     *        <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     *        Friday, January 26, 2018 12:11:30.087 AM.
     */

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time a recovery point is created, in Unix format and UTC. The value of <code>CreationDate</code> is
     * accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087
     * AM.
     * </p>
     * 
     * @return The date and time a recovery point is created, in Unix format and UTC. The value of
     *         <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     *         Friday, January 26, 2018 12:11:30.087 AM.
     */

    public String getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date and time a recovery point is created, in Unix format and UTC. The value of <code>CreationDate</code> is
     * accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087
     * AM.
     * </p>
     * 
     * @param creationDate
     *        The date and time a recovery point is created, in Unix format and UTC. The value of
     *        <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     *        Friday, January 26, 2018 12:11:30.087 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupRecoveryPointDetails withCreationDate(String creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The ARN for the server-side encryption key that is used to protect your backups.
     * </p>
     * 
     * @param encryptionKeyArn
     *        The ARN for the server-side encryption key that is used to protect your backups.
     */

    public void setEncryptionKeyArn(String encryptionKeyArn) {
        this.encryptionKeyArn = encryptionKeyArn;
    }

    /**
     * <p>
     * The ARN for the server-side encryption key that is used to protect your backups.
     * </p>
     * 
     * @return The ARN for the server-side encryption key that is used to protect your backups.
     */

    public String getEncryptionKeyArn() {
        return this.encryptionKeyArn;
    }

    /**
     * <p>
     * The ARN for the server-side encryption key that is used to protect your backups.
     * </p>
     * 
     * @param encryptionKeyArn
     *        The ARN for the server-side encryption key that is used to protect your backups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupRecoveryPointDetails withEncryptionKeyArn(String encryptionKeyArn) {
        setEncryptionKeyArn(encryptionKeyArn);
        return this;
    }

    /**
     * <p>
     * Specifies the IAM role ARN used to create the target recovery point
     * </p>
     * 
     * @param iamRoleArn
     *        Specifies the IAM role ARN used to create the target recovery point
     */

    public void setIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }

    /**
     * <p>
     * Specifies the IAM role ARN used to create the target recovery point
     * </p>
     * 
     * @return Specifies the IAM role ARN used to create the target recovery point
     */

    public String getIamRoleArn() {
        return this.iamRoleArn;
    }

    /**
     * <p>
     * Specifies the IAM role ARN used to create the target recovery point
     * </p>
     * 
     * @param iamRoleArn
     *        Specifies the IAM role ARN used to create the target recovery point
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupRecoveryPointDetails withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
        return this;
    }

    /**
     * <p>
     * A Boolean value that is returned as <code>TRUE</code> if the specified recovery point is encrypted, or
     * <code>FALSE</code> if the recovery point is not encrypted.
     * </p>
     * 
     * @param isEncrypted
     *        A Boolean value that is returned as <code>TRUE</code> if the specified recovery point is encrypted, or
     *        <code>FALSE</code> if the recovery point is not encrypted.
     */

    public void setIsEncrypted(Boolean isEncrypted) {
        this.isEncrypted = isEncrypted;
    }

    /**
     * <p>
     * A Boolean value that is returned as <code>TRUE</code> if the specified recovery point is encrypted, or
     * <code>FALSE</code> if the recovery point is not encrypted.
     * </p>
     * 
     * @return A Boolean value that is returned as <code>TRUE</code> if the specified recovery point is encrypted, or
     *         <code>FALSE</code> if the recovery point is not encrypted.
     */

    public Boolean getIsEncrypted() {
        return this.isEncrypted;
    }

    /**
     * <p>
     * A Boolean value that is returned as <code>TRUE</code> if the specified recovery point is encrypted, or
     * <code>FALSE</code> if the recovery point is not encrypted.
     * </p>
     * 
     * @param isEncrypted
     *        A Boolean value that is returned as <code>TRUE</code> if the specified recovery point is encrypted, or
     *        <code>FALSE</code> if the recovery point is not encrypted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupRecoveryPointDetails withIsEncrypted(Boolean isEncrypted) {
        setIsEncrypted(isEncrypted);
        return this;
    }

    /**
     * <p>
     * A Boolean value that is returned as <code>TRUE</code> if the specified recovery point is encrypted, or
     * <code>FALSE</code> if the recovery point is not encrypted.
     * </p>
     * 
     * @return A Boolean value that is returned as <code>TRUE</code> if the specified recovery point is encrypted, or
     *         <code>FALSE</code> if the recovery point is not encrypted.
     */

    public Boolean isEncrypted() {
        return this.isEncrypted;
    }

    /**
     * <p>
     * The date and time that a recovery point was last restored, in Unix format and UTC. The value of
     * <code>LastRestoreTime</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param lastRestoreTime
     *        The date and time that a recovery point was last restored, in Unix format and UTC. The value of
     *        <code>LastRestoreTime</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     *        Friday, January 26, 2018 12:11:30.087 AM.
     */

    public void setLastRestoreTime(String lastRestoreTime) {
        this.lastRestoreTime = lastRestoreTime;
    }

    /**
     * <p>
     * The date and time that a recovery point was last restored, in Unix format and UTC. The value of
     * <code>LastRestoreTime</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @return The date and time that a recovery point was last restored, in Unix format and UTC. The value of
     *         <code>LastRestoreTime</code> is accurate to milliseconds. For example, the value 1516925490.087
     *         represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public String getLastRestoreTime() {
        return this.lastRestoreTime;
    }

    /**
     * <p>
     * The date and time that a recovery point was last restored, in Unix format and UTC. The value of
     * <code>LastRestoreTime</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param lastRestoreTime
     *        The date and time that a recovery point was last restored, in Unix format and UTC. The value of
     *        <code>LastRestoreTime</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     *        Friday, January 26, 2018 12:11:30.087 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupRecoveryPointDetails withLastRestoreTime(String lastRestoreTime) {
        setLastRestoreTime(lastRestoreTime);
        return this;
    }

    /**
     * <p>
     * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. Backup
     * transitions and expires backups automatically according to the lifecycle that you define
     * </p>
     * 
     * @param lifecycle
     *        The lifecycle defines when a protected resource is transitioned to cold storage and when it expires.
     *        Backup transitions and expires backups automatically according to the lifecycle that you define
     */

    public void setLifecycle(AwsBackupRecoveryPointLifecycleDetails lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * <p>
     * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. Backup
     * transitions and expires backups automatically according to the lifecycle that you define
     * </p>
     * 
     * @return The lifecycle defines when a protected resource is transitioned to cold storage and when it expires.
     *         Backup transitions and expires backups automatically according to the lifecycle that you define
     */

    public AwsBackupRecoveryPointLifecycleDetails getLifecycle() {
        return this.lifecycle;
    }

    /**
     * <p>
     * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. Backup
     * transitions and expires backups automatically according to the lifecycle that you define
     * </p>
     * 
     * @param lifecycle
     *        The lifecycle defines when a protected resource is transitioned to cold storage and when it expires.
     *        Backup transitions and expires backups automatically according to the lifecycle that you define
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupRecoveryPointDetails withLifecycle(AwsBackupRecoveryPointLifecycleDetails lifecycle) {
        setLifecycle(lifecycle);
        return this;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a recovery point.
     * </p>
     * 
     * @param recoveryPointArn
     *        An ARN that uniquely identifies a recovery point.
     */

    public void setRecoveryPointArn(String recoveryPointArn) {
        this.recoveryPointArn = recoveryPointArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a recovery point.
     * </p>
     * 
     * @return An ARN that uniquely identifies a recovery point.
     */

    public String getRecoveryPointArn() {
        return this.recoveryPointArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a recovery point.
     * </p>
     * 
     * @param recoveryPointArn
     *        An ARN that uniquely identifies a recovery point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupRecoveryPointDetails withRecoveryPointArn(String recoveryPointArn) {
        setRecoveryPointArn(recoveryPointArn);
        return this;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a resource. The format of the ARN depends on the resource type.
     * </p>
     * 
     * @param resourceArn
     *        An ARN that uniquely identifies a resource. The format of the ARN depends on the resource type.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a resource. The format of the ARN depends on the resource type.
     * </p>
     * 
     * @return An ARN that uniquely identifies a resource. The format of the ARN depends on the resource type.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a resource. The format of the ARN depends on the resource type.
     * </p>
     * 
     * @param resourceArn
     *        An ARN that uniquely identifies a resource. The format of the ARN depends on the resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupRecoveryPointDetails withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The type of Amazon Web Services resource saved as a recovery point, such as an Amazon EBS volume or an Amazon RDS
     * database.
     * </p>
     * 
     * @param resourceType
     *        The type of Amazon Web Services resource saved as a recovery point, such as an Amazon EBS volume or an
     *        Amazon RDS database.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of Amazon Web Services resource saved as a recovery point, such as an Amazon EBS volume or an Amazon RDS
     * database.
     * </p>
     * 
     * @return The type of Amazon Web Services resource saved as a recovery point, such as an Amazon EBS volume or an
     *         Amazon RDS database.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of Amazon Web Services resource saved as a recovery point, such as an Amazon EBS volume or an Amazon RDS
     * database.
     * </p>
     * 
     * @param resourceType
     *        The type of Amazon Web Services resource saved as a recovery point, such as an Amazon EBS volume or an
     *        Amazon RDS database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupRecoveryPointDetails withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The ARN for the backup vault where the recovery point was originally copied from. If the recovery point is
     * restored to the same account, this value will be null.
     * </p>
     * 
     * @param sourceBackupVaultArn
     *        The ARN for the backup vault where the recovery point was originally copied from. If the recovery point is
     *        restored to the same account, this value will be null.
     */

    public void setSourceBackupVaultArn(String sourceBackupVaultArn) {
        this.sourceBackupVaultArn = sourceBackupVaultArn;
    }

    /**
     * <p>
     * The ARN for the backup vault where the recovery point was originally copied from. If the recovery point is
     * restored to the same account, this value will be null.
     * </p>
     * 
     * @return The ARN for the backup vault where the recovery point was originally copied from. If the recovery point
     *         is restored to the same account, this value will be null.
     */

    public String getSourceBackupVaultArn() {
        return this.sourceBackupVaultArn;
    }

    /**
     * <p>
     * The ARN for the backup vault where the recovery point was originally copied from. If the recovery point is
     * restored to the same account, this value will be null.
     * </p>
     * 
     * @param sourceBackupVaultArn
     *        The ARN for the backup vault where the recovery point was originally copied from. If the recovery point is
     *        restored to the same account, this value will be null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupRecoveryPointDetails withSourceBackupVaultArn(String sourceBackupVaultArn) {
        setSourceBackupVaultArn(sourceBackupVaultArn);
        return this;
    }

    /**
     * <p>
     * A status code specifying the state of the recovery point. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPLETED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXPIRED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PARTIAL</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        A status code specifying the state of the recovery point. Valid values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EXPIRED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PARTIAL</code>
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * A status code specifying the state of the recovery point. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPLETED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXPIRED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PARTIAL</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return A status code specifying the state of the recovery point. Valid values are as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>COMPLETED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EXPIRED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PARTIAL</code>
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * A status code specifying the state of the recovery point. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COMPLETED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXPIRED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PARTIAL</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        A status code specifying the state of the recovery point. Valid values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EXPIRED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PARTIAL</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupRecoveryPointDetails withStatus(String status) {
        setStatus(status);
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

    public AwsBackupRecoveryPointDetails withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * Specifies the storage class of the recovery point. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COLD</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WARM</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param storageClass
     *        Specifies the storage class of the recovery point. Valid values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COLD</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WARM</code>
     *        </p>
     *        </li>
     */

    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    /**
     * <p>
     * Specifies the storage class of the recovery point. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COLD</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WARM</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the storage class of the recovery point. Valid values are as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>COLD</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>WARM</code>
     *         </p>
     *         </li>
     */

    public String getStorageClass() {
        return this.storageClass;
    }

    /**
     * <p>
     * Specifies the storage class of the recovery point. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>COLD</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WARM</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param storageClass
     *        Specifies the storage class of the recovery point. Valid values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>COLD</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WARM</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupRecoveryPointDetails withStorageClass(String storageClass) {
        setStorageClass(storageClass);
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
        if (getBackupSizeInBytes() != null)
            sb.append("BackupSizeInBytes: ").append(getBackupSizeInBytes()).append(",");
        if (getBackupVaultArn() != null)
            sb.append("BackupVaultArn: ").append(getBackupVaultArn()).append(",");
        if (getBackupVaultName() != null)
            sb.append("BackupVaultName: ").append(getBackupVaultName()).append(",");
        if (getCalculatedLifecycle() != null)
            sb.append("CalculatedLifecycle: ").append(getCalculatedLifecycle()).append(",");
        if (getCompletionDate() != null)
            sb.append("CompletionDate: ").append(getCompletionDate()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getEncryptionKeyArn() != null)
            sb.append("EncryptionKeyArn: ").append(getEncryptionKeyArn()).append(",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: ").append(getIamRoleArn()).append(",");
        if (getIsEncrypted() != null)
            sb.append("IsEncrypted: ").append(getIsEncrypted()).append(",");
        if (getLastRestoreTime() != null)
            sb.append("LastRestoreTime: ").append(getLastRestoreTime()).append(",");
        if (getLifecycle() != null)
            sb.append("Lifecycle: ").append(getLifecycle()).append(",");
        if (getRecoveryPointArn() != null)
            sb.append("RecoveryPointArn: ").append(getRecoveryPointArn()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getSourceBackupVaultArn() != null)
            sb.append("SourceBackupVaultArn: ").append(getSourceBackupVaultArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getStorageClass() != null)
            sb.append("StorageClass: ").append(getStorageClass());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsBackupRecoveryPointDetails == false)
            return false;
        AwsBackupRecoveryPointDetails other = (AwsBackupRecoveryPointDetails) obj;
        if (other.getBackupSizeInBytes() == null ^ this.getBackupSizeInBytes() == null)
            return false;
        if (other.getBackupSizeInBytes() != null && other.getBackupSizeInBytes().equals(this.getBackupSizeInBytes()) == false)
            return false;
        if (other.getBackupVaultArn() == null ^ this.getBackupVaultArn() == null)
            return false;
        if (other.getBackupVaultArn() != null && other.getBackupVaultArn().equals(this.getBackupVaultArn()) == false)
            return false;
        if (other.getBackupVaultName() == null ^ this.getBackupVaultName() == null)
            return false;
        if (other.getBackupVaultName() != null && other.getBackupVaultName().equals(this.getBackupVaultName()) == false)
            return false;
        if (other.getCalculatedLifecycle() == null ^ this.getCalculatedLifecycle() == null)
            return false;
        if (other.getCalculatedLifecycle() != null && other.getCalculatedLifecycle().equals(this.getCalculatedLifecycle()) == false)
            return false;
        if (other.getCompletionDate() == null ^ this.getCompletionDate() == null)
            return false;
        if (other.getCompletionDate() != null && other.getCompletionDate().equals(this.getCompletionDate()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getEncryptionKeyArn() == null ^ this.getEncryptionKeyArn() == null)
            return false;
        if (other.getEncryptionKeyArn() != null && other.getEncryptionKeyArn().equals(this.getEncryptionKeyArn()) == false)
            return false;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        if (other.getIsEncrypted() == null ^ this.getIsEncrypted() == null)
            return false;
        if (other.getIsEncrypted() != null && other.getIsEncrypted().equals(this.getIsEncrypted()) == false)
            return false;
        if (other.getLastRestoreTime() == null ^ this.getLastRestoreTime() == null)
            return false;
        if (other.getLastRestoreTime() != null && other.getLastRestoreTime().equals(this.getLastRestoreTime()) == false)
            return false;
        if (other.getLifecycle() == null ^ this.getLifecycle() == null)
            return false;
        if (other.getLifecycle() != null && other.getLifecycle().equals(this.getLifecycle()) == false)
            return false;
        if (other.getRecoveryPointArn() == null ^ this.getRecoveryPointArn() == null)
            return false;
        if (other.getRecoveryPointArn() != null && other.getRecoveryPointArn().equals(this.getRecoveryPointArn()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getSourceBackupVaultArn() == null ^ this.getSourceBackupVaultArn() == null)
            return false;
        if (other.getSourceBackupVaultArn() != null && other.getSourceBackupVaultArn().equals(this.getSourceBackupVaultArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getStorageClass() == null ^ this.getStorageClass() == null)
            return false;
        if (other.getStorageClass() != null && other.getStorageClass().equals(this.getStorageClass()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupSizeInBytes() == null) ? 0 : getBackupSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getBackupVaultArn() == null) ? 0 : getBackupVaultArn().hashCode());
        hashCode = prime * hashCode + ((getBackupVaultName() == null) ? 0 : getBackupVaultName().hashCode());
        hashCode = prime * hashCode + ((getCalculatedLifecycle() == null) ? 0 : getCalculatedLifecycle().hashCode());
        hashCode = prime * hashCode + ((getCompletionDate() == null) ? 0 : getCompletionDate().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getEncryptionKeyArn() == null) ? 0 : getEncryptionKeyArn().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getIsEncrypted() == null) ? 0 : getIsEncrypted().hashCode());
        hashCode = prime * hashCode + ((getLastRestoreTime() == null) ? 0 : getLastRestoreTime().hashCode());
        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        hashCode = prime * hashCode + ((getRecoveryPointArn() == null) ? 0 : getRecoveryPointArn().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getSourceBackupVaultArn() == null) ? 0 : getSourceBackupVaultArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getStorageClass() == null) ? 0 : getStorageClass().hashCode());
        return hashCode;
    }

    @Override
    public AwsBackupRecoveryPointDetails clone() {
        try {
            return (AwsBackupRecoveryPointDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsBackupRecoveryPointDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
