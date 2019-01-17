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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DescribeRecoveryPoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRecoveryPointResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An ARN that uniquely identifies a recovery point; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     * </p>
     */
    private String recoveryPointArn;
    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique
     * to the account used to create them and the Region where they are created. They consist of lowercase letters,
     * numbers, and hyphens.
     * </p>
     */
    private String backupVaultName;
    /**
     * <p>
     * An ARN that uniquely identifies a backup vault; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     */
    private String backupVaultArn;
    /**
     * <p>
     * An ARN that uniquely identifies a saved resource. The format of the ARN depends on the resource type.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The type of AWS resource to save as a recovery point; for example, an Amazon Elastic Block Store (Amazon EBS)
     * volume or an Amazon Relational Database Service (Amazon RDS) database.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * Contains identifying information about the creation of a recovery point, including the <code>BackupPlanArn</code>, <code>BackupPlanId</code>, <code>BackupPlanVersion</code>, and <code>BackupRuleId</code> of the backup plan
     * used to create it.
     * </p>
     */
    private RecoveryPointCreator createdBy;
    /**
     * <p>
     * Specifies the IAM role ARN used to create the target recovery point; for example,
     * <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     */
    private String iamRoleArn;
    /**
     * <p>
     * A status code specifying the state of the recovery point.
     * </p>
     * <note>
     * <p>
     * A partial status indicates that the recovery point was not successfully re-created and must be retried.
     * </p>
     * </note>
     */
    private String status;
    /**
     * <p>
     * The date and time that a recovery point is created, in Unix format and Coordinated Universal Time (UTC). The
     * value of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The date and time that a job to create a recovery point is completed, in Unix format and Coordinated Universal
     * Time (UTC). The value of <code>CompletionDate</code> is accurate to milliseconds. For example, the value
     * 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date completionDate;
    /**
     * <p>
     * The size, in bytes, of a backup.
     * </p>
     */
    private Long backupSizeInBytes;
    /**
     * <p>
     * A <code>CalculatedLifecycle</code> object containing <code>DeleteAt</code> and <code>MoveToColdStorageAt</code>
     * timestamps.
     * </p>
     */
    private CalculatedLifecycle calculatedLifecycle;
    /**
     * <p>
     * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup
     * transitions and expires backups automatically according to the lifecycle that you define.
     * </p>
     * <p>
     * Backups that are transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore,
     * the “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The
     * “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold.
     * </p>
     */
    private Lifecycle lifecycle;
    /**
     * <p>
     * The server-side encryption key used to protect your backups; for example,
     * <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     */
    private String encryptionKeyArn;
    /**
     * <p>
     * A Boolean value that is returned as <code>TRUE</code> if the specified recovery point is encrypted, or
     * <code>FALSE</code> if the recovery point is not encrypted.
     * </p>
     */
    private Boolean isEncrypted;
    /**
     * <p>
     * Specifies the storage class of the recovery point. Valid values are <code>WARM</code> or <code>COLD</code>.
     * </p>
     */
    private String storageClass;
    /**
     * <p>
     * The date and time that a recovery point was last restored, in Unix format and Coordinated Universal Time (UTC).
     * The value of <code>LastRestoreTime</code> is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date lastRestoreTime;

    /**
     * <p>
     * An ARN that uniquely identifies a recovery point; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     * </p>
     * 
     * @param recoveryPointArn
     *        An ARN that uniquely identifies a recovery point; for example,
     *        <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     */

    public void setRecoveryPointArn(String recoveryPointArn) {
        this.recoveryPointArn = recoveryPointArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a recovery point; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     * </p>
     * 
     * @return An ARN that uniquely identifies a recovery point; for example,
     *         <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     */

    public String getRecoveryPointArn() {
        return this.recoveryPointArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a recovery point; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     * </p>
     * 
     * @param recoveryPointArn
     *        An ARN that uniquely identifies a recovery point; for example,
     *        <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecoveryPointResult withRecoveryPointArn(String recoveryPointArn) {
        setRecoveryPointArn(recoveryPointArn);
        return this;
    }

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique
     * to the account used to create them and the Region where they are created. They consist of lowercase letters,
     * numbers, and hyphens.
     * </p>
     * 
     * @param backupVaultName
     *        The name of a logical container where backups are stored. Backup vaults are identified by names that are
     *        unique to the account used to create them and the Region where they are created. They consist of lowercase
     *        letters, numbers, and hyphens.
     */

    public void setBackupVaultName(String backupVaultName) {
        this.backupVaultName = backupVaultName;
    }

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique
     * to the account used to create them and the Region where they are created. They consist of lowercase letters,
     * numbers, and hyphens.
     * </p>
     * 
     * @return The name of a logical container where backups are stored. Backup vaults are identified by names that are
     *         unique to the account used to create them and the Region where they are created. They consist of
     *         lowercase letters, numbers, and hyphens.
     */

    public String getBackupVaultName() {
        return this.backupVaultName;
    }

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique
     * to the account used to create them and the Region where they are created. They consist of lowercase letters,
     * numbers, and hyphens.
     * </p>
     * 
     * @param backupVaultName
     *        The name of a logical container where backups are stored. Backup vaults are identified by names that are
     *        unique to the account used to create them and the Region where they are created. They consist of lowercase
     *        letters, numbers, and hyphens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecoveryPointResult withBackupVaultName(String backupVaultName) {
        setBackupVaultName(backupVaultName);
        return this;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a backup vault; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     * 
     * @param backupVaultArn
     *        An ARN that uniquely identifies a backup vault; for example,
     *        <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     */

    public void setBackupVaultArn(String backupVaultArn) {
        this.backupVaultArn = backupVaultArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a backup vault; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     * 
     * @return An ARN that uniquely identifies a backup vault; for example,
     *         <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     */

    public String getBackupVaultArn() {
        return this.backupVaultArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a backup vault; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     * 
     * @param backupVaultArn
     *        An ARN that uniquely identifies a backup vault; for example,
     *        <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecoveryPointResult withBackupVaultArn(String backupVaultArn) {
        setBackupVaultArn(backupVaultArn);
        return this;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a saved resource. The format of the ARN depends on the resource type.
     * </p>
     * 
     * @param resourceArn
     *        An ARN that uniquely identifies a saved resource. The format of the ARN depends on the resource type.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a saved resource. The format of the ARN depends on the resource type.
     * </p>
     * 
     * @return An ARN that uniquely identifies a saved resource. The format of the ARN depends on the resource type.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * An ARN that uniquely identifies a saved resource. The format of the ARN depends on the resource type.
     * </p>
     * 
     * @param resourceArn
     *        An ARN that uniquely identifies a saved resource. The format of the ARN depends on the resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecoveryPointResult withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The type of AWS resource to save as a recovery point; for example, an Amazon Elastic Block Store (Amazon EBS)
     * volume or an Amazon Relational Database Service (Amazon RDS) database.
     * </p>
     * 
     * @param resourceType
     *        The type of AWS resource to save as a recovery point; for example, an Amazon Elastic Block Store (Amazon
     *        EBS) volume or an Amazon Relational Database Service (Amazon RDS) database.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of AWS resource to save as a recovery point; for example, an Amazon Elastic Block Store (Amazon EBS)
     * volume or an Amazon Relational Database Service (Amazon RDS) database.
     * </p>
     * 
     * @return The type of AWS resource to save as a recovery point; for example, an Amazon Elastic Block Store (Amazon
     *         EBS) volume or an Amazon Relational Database Service (Amazon RDS) database.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of AWS resource to save as a recovery point; for example, an Amazon Elastic Block Store (Amazon EBS)
     * volume or an Amazon Relational Database Service (Amazon RDS) database.
     * </p>
     * 
     * @param resourceType
     *        The type of AWS resource to save as a recovery point; for example, an Amazon Elastic Block Store (Amazon
     *        EBS) volume or an Amazon Relational Database Service (Amazon RDS) database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecoveryPointResult withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * Contains identifying information about the creation of a recovery point, including the <code>BackupPlanArn</code>, <code>BackupPlanId</code>, <code>BackupPlanVersion</code>, and <code>BackupRuleId</code> of the backup plan
     * used to create it.
     * </p>
     * 
     * @param createdBy
     *        Contains identifying information about the creation of a recovery point, including the
     *        <code>BackupPlanArn</code>, <code>BackupPlanId</code>, <code>BackupPlanVersion</code>, and
     *        <code>BackupRuleId</code> of the backup plan used to create it.
     */

    public void setCreatedBy(RecoveryPointCreator createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * Contains identifying information about the creation of a recovery point, including the <code>BackupPlanArn</code>, <code>BackupPlanId</code>, <code>BackupPlanVersion</code>, and <code>BackupRuleId</code> of the backup plan
     * used to create it.
     * </p>
     * 
     * @return Contains identifying information about the creation of a recovery point, including the
     *         <code>BackupPlanArn</code>, <code>BackupPlanId</code>, <code>BackupPlanVersion</code>, and
     *         <code>BackupRuleId</code> of the backup plan used to create it.
     */

    public RecoveryPointCreator getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * Contains identifying information about the creation of a recovery point, including the <code>BackupPlanArn</code>, <code>BackupPlanId</code>, <code>BackupPlanVersion</code>, and <code>BackupRuleId</code> of the backup plan
     * used to create it.
     * </p>
     * 
     * @param createdBy
     *        Contains identifying information about the creation of a recovery point, including the
     *        <code>BackupPlanArn</code>, <code>BackupPlanId</code>, <code>BackupPlanVersion</code>, and
     *        <code>BackupRuleId</code> of the backup plan used to create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecoveryPointResult withCreatedBy(RecoveryPointCreator createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * Specifies the IAM role ARN used to create the target recovery point; for example,
     * <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     * 
     * @param iamRoleArn
     *        Specifies the IAM role ARN used to create the target recovery point; for example,
     *        <code>arn:aws:iam::123456789012:role/S3Access</code>.
     */

    public void setIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }

    /**
     * <p>
     * Specifies the IAM role ARN used to create the target recovery point; for example,
     * <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     * 
     * @return Specifies the IAM role ARN used to create the target recovery point; for example,
     *         <code>arn:aws:iam::123456789012:role/S3Access</code>.
     */

    public String getIamRoleArn() {
        return this.iamRoleArn;
    }

    /**
     * <p>
     * Specifies the IAM role ARN used to create the target recovery point; for example,
     * <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     * 
     * @param iamRoleArn
     *        Specifies the IAM role ARN used to create the target recovery point; for example,
     *        <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecoveryPointResult withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
        return this;
    }

    /**
     * <p>
     * A status code specifying the state of the recovery point.
     * </p>
     * <note>
     * <p>
     * A partial status indicates that the recovery point was not successfully re-created and must be retried.
     * </p>
     * </note>
     * 
     * @param status
     *        A status code specifying the state of the recovery point.</p> <note>
     *        <p>
     *        A partial status indicates that the recovery point was not successfully re-created and must be retried.
     *        </p>
     * @see RecoveryPointStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * A status code specifying the state of the recovery point.
     * </p>
     * <note>
     * <p>
     * A partial status indicates that the recovery point was not successfully re-created and must be retried.
     * </p>
     * </note>
     * 
     * @return A status code specifying the state of the recovery point.</p> <note>
     *         <p>
     *         A partial status indicates that the recovery point was not successfully re-created and must be retried.
     *         </p>
     * @see RecoveryPointStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * A status code specifying the state of the recovery point.
     * </p>
     * <note>
     * <p>
     * A partial status indicates that the recovery point was not successfully re-created and must be retried.
     * </p>
     * </note>
     * 
     * @param status
     *        A status code specifying the state of the recovery point.</p> <note>
     *        <p>
     *        A partial status indicates that the recovery point was not successfully re-created and must be retried.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecoveryPointStatus
     */

    public DescribeRecoveryPointResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A status code specifying the state of the recovery point.
     * </p>
     * <note>
     * <p>
     * A partial status indicates that the recovery point was not successfully re-created and must be retried.
     * </p>
     * </note>
     * 
     * @param status
     *        A status code specifying the state of the recovery point.</p> <note>
     *        <p>
     *        A partial status indicates that the recovery point was not successfully re-created and must be retried.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecoveryPointStatus
     */

    public DescribeRecoveryPointResult withStatus(RecoveryPointStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that a recovery point is created, in Unix format and Coordinated Universal Time (UTC). The
     * value of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param creationDate
     *        The date and time that a recovery point is created, in Unix format and Coordinated Universal Time (UTC).
     *        The value of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087
     *        represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time that a recovery point is created, in Unix format and Coordinated Universal Time (UTC). The
     * value of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @return The date and time that a recovery point is created, in Unix format and Coordinated Universal Time (UTC).
     *         The value of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087
     *         represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date and time that a recovery point is created, in Unix format and Coordinated Universal Time (UTC). The
     * value of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param creationDate
     *        The date and time that a recovery point is created, in Unix format and Coordinated Universal Time (UTC).
     *        The value of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087
     *        represents Friday, January 26, 2018 12:11:30.087 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecoveryPointResult withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The date and time that a job to create a recovery point is completed, in Unix format and Coordinated Universal
     * Time (UTC). The value of <code>CompletionDate</code> is accurate to milliseconds. For example, the value
     * 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param completionDate
     *        The date and time that a job to create a recovery point is completed, in Unix format and Coordinated
     *        Universal Time (UTC). The value of <code>CompletionDate</code> is accurate to milliseconds. For example,
     *        the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public void setCompletionDate(java.util.Date completionDate) {
        this.completionDate = completionDate;
    }

    /**
     * <p>
     * The date and time that a job to create a recovery point is completed, in Unix format and Coordinated Universal
     * Time (UTC). The value of <code>CompletionDate</code> is accurate to milliseconds. For example, the value
     * 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @return The date and time that a job to create a recovery point is completed, in Unix format and Coordinated
     *         Universal Time (UTC). The value of <code>CompletionDate</code> is accurate to milliseconds. For example,
     *         the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public java.util.Date getCompletionDate() {
        return this.completionDate;
    }

    /**
     * <p>
     * The date and time that a job to create a recovery point is completed, in Unix format and Coordinated Universal
     * Time (UTC). The value of <code>CompletionDate</code> is accurate to milliseconds. For example, the value
     * 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param completionDate
     *        The date and time that a job to create a recovery point is completed, in Unix format and Coordinated
     *        Universal Time (UTC). The value of <code>CompletionDate</code> is accurate to milliseconds. For example,
     *        the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecoveryPointResult withCompletionDate(java.util.Date completionDate) {
        setCompletionDate(completionDate);
        return this;
    }

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

    public DescribeRecoveryPointResult withBackupSizeInBytes(Long backupSizeInBytes) {
        setBackupSizeInBytes(backupSizeInBytes);
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

    public void setCalculatedLifecycle(CalculatedLifecycle calculatedLifecycle) {
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

    public CalculatedLifecycle getCalculatedLifecycle() {
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

    public DescribeRecoveryPointResult withCalculatedLifecycle(CalculatedLifecycle calculatedLifecycle) {
        setCalculatedLifecycle(calculatedLifecycle);
        return this;
    }

    /**
     * <p>
     * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup
     * transitions and expires backups automatically according to the lifecycle that you define.
     * </p>
     * <p>
     * Backups that are transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore,
     * the “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The
     * “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold.
     * </p>
     * 
     * @param lifecycle
     *        The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS
     *        Backup transitions and expires backups automatically according to the lifecycle that you define. </p>
     *        <p>
     *        Backups that are transitioned to cold storage must be stored in cold storage for a minimum of 90 days.
     *        Therefore, the “expire after days” setting must be 90 days greater than the “transition to cold after
     *        days” setting. The “transition to cold after days” setting cannot be changed after a backup has been
     *        transitioned to cold.
     */

    public void setLifecycle(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * <p>
     * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup
     * transitions and expires backups automatically according to the lifecycle that you define.
     * </p>
     * <p>
     * Backups that are transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore,
     * the “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The
     * “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold.
     * </p>
     * 
     * @return The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS
     *         Backup transitions and expires backups automatically according to the lifecycle that you define. </p>
     *         <p>
     *         Backups that are transitioned to cold storage must be stored in cold storage for a minimum of 90 days.
     *         Therefore, the “expire after days” setting must be 90 days greater than the “transition to cold after
     *         days” setting. The “transition to cold after days” setting cannot be changed after a backup has been
     *         transitioned to cold.
     */

    public Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    /**
     * <p>
     * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup
     * transitions and expires backups automatically according to the lifecycle that you define.
     * </p>
     * <p>
     * Backups that are transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore,
     * the “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The
     * “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold.
     * </p>
     * 
     * @param lifecycle
     *        The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS
     *        Backup transitions and expires backups automatically according to the lifecycle that you define. </p>
     *        <p>
     *        Backups that are transitioned to cold storage must be stored in cold storage for a minimum of 90 days.
     *        Therefore, the “expire after days” setting must be 90 days greater than the “transition to cold after
     *        days” setting. The “transition to cold after days” setting cannot be changed after a backup has been
     *        transitioned to cold.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecoveryPointResult withLifecycle(Lifecycle lifecycle) {
        setLifecycle(lifecycle);
        return this;
    }

    /**
     * <p>
     * The server-side encryption key used to protect your backups; for example,
     * <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * 
     * @param encryptionKeyArn
     *        The server-side encryption key used to protect your backups; for example,
     *        <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     */

    public void setEncryptionKeyArn(String encryptionKeyArn) {
        this.encryptionKeyArn = encryptionKeyArn;
    }

    /**
     * <p>
     * The server-side encryption key used to protect your backups; for example,
     * <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * 
     * @return The server-side encryption key used to protect your backups; for example,
     *         <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     */

    public String getEncryptionKeyArn() {
        return this.encryptionKeyArn;
    }

    /**
     * <p>
     * The server-side encryption key used to protect your backups; for example,
     * <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * 
     * @param encryptionKeyArn
     *        The server-side encryption key used to protect your backups; for example,
     *        <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecoveryPointResult withEncryptionKeyArn(String encryptionKeyArn) {
        setEncryptionKeyArn(encryptionKeyArn);
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

    public DescribeRecoveryPointResult withIsEncrypted(Boolean isEncrypted) {
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
     * Specifies the storage class of the recovery point. Valid values are <code>WARM</code> or <code>COLD</code>.
     * </p>
     * 
     * @param storageClass
     *        Specifies the storage class of the recovery point. Valid values are <code>WARM</code> or <code>COLD</code>
     *        .
     * @see StorageClass
     */

    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    /**
     * <p>
     * Specifies the storage class of the recovery point. Valid values are <code>WARM</code> or <code>COLD</code>.
     * </p>
     * 
     * @return Specifies the storage class of the recovery point. Valid values are <code>WARM</code> or
     *         <code>COLD</code>.
     * @see StorageClass
     */

    public String getStorageClass() {
        return this.storageClass;
    }

    /**
     * <p>
     * Specifies the storage class of the recovery point. Valid values are <code>WARM</code> or <code>COLD</code>.
     * </p>
     * 
     * @param storageClass
     *        Specifies the storage class of the recovery point. Valid values are <code>WARM</code> or <code>COLD</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageClass
     */

    public DescribeRecoveryPointResult withStorageClass(String storageClass) {
        setStorageClass(storageClass);
        return this;
    }

    /**
     * <p>
     * Specifies the storage class of the recovery point. Valid values are <code>WARM</code> or <code>COLD</code>.
     * </p>
     * 
     * @param storageClass
     *        Specifies the storage class of the recovery point. Valid values are <code>WARM</code> or <code>COLD</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageClass
     */

    public DescribeRecoveryPointResult withStorageClass(StorageClass storageClass) {
        this.storageClass = storageClass.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that a recovery point was last restored, in Unix format and Coordinated Universal Time (UTC).
     * The value of <code>LastRestoreTime</code> is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param lastRestoreTime
     *        The date and time that a recovery point was last restored, in Unix format and Coordinated Universal Time
     *        (UTC). The value of <code>LastRestoreTime</code> is accurate to milliseconds. For example, the value
     *        1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public void setLastRestoreTime(java.util.Date lastRestoreTime) {
        this.lastRestoreTime = lastRestoreTime;
    }

    /**
     * <p>
     * The date and time that a recovery point was last restored, in Unix format and Coordinated Universal Time (UTC).
     * The value of <code>LastRestoreTime</code> is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @return The date and time that a recovery point was last restored, in Unix format and Coordinated Universal Time
     *         (UTC). The value of <code>LastRestoreTime</code> is accurate to milliseconds. For example, the value
     *         1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public java.util.Date getLastRestoreTime() {
        return this.lastRestoreTime;
    }

    /**
     * <p>
     * The date and time that a recovery point was last restored, in Unix format and Coordinated Universal Time (UTC).
     * The value of <code>LastRestoreTime</code> is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param lastRestoreTime
     *        The date and time that a recovery point was last restored, in Unix format and Coordinated Universal Time
     *        (UTC). The value of <code>LastRestoreTime</code> is accurate to milliseconds. For example, the value
     *        1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecoveryPointResult withLastRestoreTime(java.util.Date lastRestoreTime) {
        setLastRestoreTime(lastRestoreTime);
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
        if (getBackupVaultName() != null)
            sb.append("BackupVaultName: ").append(getBackupVaultName()).append(",");
        if (getBackupVaultArn() != null)
            sb.append("BackupVaultArn: ").append(getBackupVaultArn()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: ").append(getIamRoleArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getCompletionDate() != null)
            sb.append("CompletionDate: ").append(getCompletionDate()).append(",");
        if (getBackupSizeInBytes() != null)
            sb.append("BackupSizeInBytes: ").append(getBackupSizeInBytes()).append(",");
        if (getCalculatedLifecycle() != null)
            sb.append("CalculatedLifecycle: ").append(getCalculatedLifecycle()).append(",");
        if (getLifecycle() != null)
            sb.append("Lifecycle: ").append(getLifecycle()).append(",");
        if (getEncryptionKeyArn() != null)
            sb.append("EncryptionKeyArn: ").append(getEncryptionKeyArn()).append(",");
        if (getIsEncrypted() != null)
            sb.append("IsEncrypted: ").append(getIsEncrypted()).append(",");
        if (getStorageClass() != null)
            sb.append("StorageClass: ").append(getStorageClass()).append(",");
        if (getLastRestoreTime() != null)
            sb.append("LastRestoreTime: ").append(getLastRestoreTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRecoveryPointResult == false)
            return false;
        DescribeRecoveryPointResult other = (DescribeRecoveryPointResult) obj;
        if (other.getRecoveryPointArn() == null ^ this.getRecoveryPointArn() == null)
            return false;
        if (other.getRecoveryPointArn() != null && other.getRecoveryPointArn().equals(this.getRecoveryPointArn()) == false)
            return false;
        if (other.getBackupVaultName() == null ^ this.getBackupVaultName() == null)
            return false;
        if (other.getBackupVaultName() != null && other.getBackupVaultName().equals(this.getBackupVaultName()) == false)
            return false;
        if (other.getBackupVaultArn() == null ^ this.getBackupVaultArn() == null)
            return false;
        if (other.getBackupVaultArn() != null && other.getBackupVaultArn().equals(this.getBackupVaultArn()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getCompletionDate() == null ^ this.getCompletionDate() == null)
            return false;
        if (other.getCompletionDate() != null && other.getCompletionDate().equals(this.getCompletionDate()) == false)
            return false;
        if (other.getBackupSizeInBytes() == null ^ this.getBackupSizeInBytes() == null)
            return false;
        if (other.getBackupSizeInBytes() != null && other.getBackupSizeInBytes().equals(this.getBackupSizeInBytes()) == false)
            return false;
        if (other.getCalculatedLifecycle() == null ^ this.getCalculatedLifecycle() == null)
            return false;
        if (other.getCalculatedLifecycle() != null && other.getCalculatedLifecycle().equals(this.getCalculatedLifecycle()) == false)
            return false;
        if (other.getLifecycle() == null ^ this.getLifecycle() == null)
            return false;
        if (other.getLifecycle() != null && other.getLifecycle().equals(this.getLifecycle()) == false)
            return false;
        if (other.getEncryptionKeyArn() == null ^ this.getEncryptionKeyArn() == null)
            return false;
        if (other.getEncryptionKeyArn() != null && other.getEncryptionKeyArn().equals(this.getEncryptionKeyArn()) == false)
            return false;
        if (other.getIsEncrypted() == null ^ this.getIsEncrypted() == null)
            return false;
        if (other.getIsEncrypted() != null && other.getIsEncrypted().equals(this.getIsEncrypted()) == false)
            return false;
        if (other.getStorageClass() == null ^ this.getStorageClass() == null)
            return false;
        if (other.getStorageClass() != null && other.getStorageClass().equals(this.getStorageClass()) == false)
            return false;
        if (other.getLastRestoreTime() == null ^ this.getLastRestoreTime() == null)
            return false;
        if (other.getLastRestoreTime() != null && other.getLastRestoreTime().equals(this.getLastRestoreTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecoveryPointArn() == null) ? 0 : getRecoveryPointArn().hashCode());
        hashCode = prime * hashCode + ((getBackupVaultName() == null) ? 0 : getBackupVaultName().hashCode());
        hashCode = prime * hashCode + ((getBackupVaultArn() == null) ? 0 : getBackupVaultArn().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getCompletionDate() == null) ? 0 : getCompletionDate().hashCode());
        hashCode = prime * hashCode + ((getBackupSizeInBytes() == null) ? 0 : getBackupSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getCalculatedLifecycle() == null) ? 0 : getCalculatedLifecycle().hashCode());
        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        hashCode = prime * hashCode + ((getEncryptionKeyArn() == null) ? 0 : getEncryptionKeyArn().hashCode());
        hashCode = prime * hashCode + ((getIsEncrypted() == null) ? 0 : getIsEncrypted().hashCode());
        hashCode = prime * hashCode + ((getStorageClass() == null) ? 0 : getStorageClass().hashCode());
        hashCode = prime * hashCode + ((getLastRestoreTime() == null) ? 0 : getLastRestoreTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRecoveryPointResult clone() {
        try {
            return (DescribeRecoveryPointResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
