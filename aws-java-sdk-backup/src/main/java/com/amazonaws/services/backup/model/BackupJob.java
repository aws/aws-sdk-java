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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains detailed information about a backup job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/BackupJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BackupJob implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Uniquely identifies a request to AWS Backup to back up a resource.
     * </p>
     */
    private String backupJobId;
    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique
     * to the account used to create them and the AWS Region where they are created. They consist of lowercase letters,
     * numbers, and hyphens.
     * </p>
     */
    private String backupVaultName;
    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a backup vault; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     */
    private String backupVaultArn;
    /**
     * <p>
     * An ARN that uniquely identifies a recovery point; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
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
     * The date and time a backup job is created, in Unix format and Coordinated Universal Time (UTC). The value of
     * <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents Friday,
     * January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The date and time a job to create a backup job is completed, in Unix format and Coordinated Universal Time (UTC).
     * The value of <code>CompletionDate</code> is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date completionDate;
    /**
     * <p>
     * The current state of a resource recovery point.
     * </p>
     */
    private String state;
    /**
     * <p>
     * A detailed message explaining the status of the job to back up a resource.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * Contains an estimated percentage complete of a job at the time the job status was queried.
     * </p>
     */
    private String percentDone;
    /**
     * <p>
     * The size, in bytes, of a backup.
     * </p>
     */
    private Long backupSizeInBytes;
    /**
     * <p>
     * Specifies the IAM role ARN used to create the target recovery point; for example,
     * <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     */
    private String iamRoleArn;
    /**
     * <p>
     * Contains identifying information about the creation of a backup job, including the <code>BackupPlanArn</code>,
     * <code>BackupPlanId</code>, <code>BackupPlanVersion</code>, and <code>BackupRuleId</code> of the backup plan used
     * to create it.
     * </p>
     */
    private RecoveryPointCreator createdBy;
    /**
     * <p>
     * The date and time a job to back up resources is expected to be completed, in Unix format and Coordinated
     * Universal Time (UTC). The value of <code>ExpectedCompletionDate</code> is accurate to milliseconds. For example,
     * the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date expectedCompletionDate;
    /**
     * <p>
     * Specifies the time in Unix format and Coordinated Universal Time (UTC) when a backup job must be started before
     * it is canceled. The value is calculated by adding the start window to the scheduled time. So if the scheduled
     * time were 6:00 PM and the start window is 2 hours, the <code>StartBy</code> time would be 8:00 PM on the date
     * specified. The value of <code>StartBy</code> is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date startBy;
    /**
     * <p>
     * The type of AWS resource to be backed-up; for example, an Amazon Elastic Block Store (Amazon EBS) volume or an
     * Amazon Relational Database Service (Amazon RDS) database.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The size in bytes transferred to a backup vault at the time that the job status was queried.
     * </p>
     */
    private Long bytesTransferred;

    /**
     * <p>
     * Uniquely identifies a request to AWS Backup to back up a resource.
     * </p>
     * 
     * @param backupJobId
     *        Uniquely identifies a request to AWS Backup to back up a resource.
     */

    public void setBackupJobId(String backupJobId) {
        this.backupJobId = backupJobId;
    }

    /**
     * <p>
     * Uniquely identifies a request to AWS Backup to back up a resource.
     * </p>
     * 
     * @return Uniquely identifies a request to AWS Backup to back up a resource.
     */

    public String getBackupJobId() {
        return this.backupJobId;
    }

    /**
     * <p>
     * Uniquely identifies a request to AWS Backup to back up a resource.
     * </p>
     * 
     * @param backupJobId
     *        Uniquely identifies a request to AWS Backup to back up a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupJob withBackupJobId(String backupJobId) {
        setBackupJobId(backupJobId);
        return this;
    }

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique
     * to the account used to create them and the AWS Region where they are created. They consist of lowercase letters,
     * numbers, and hyphens.
     * </p>
     * 
     * @param backupVaultName
     *        The name of a logical container where backups are stored. Backup vaults are identified by names that are
     *        unique to the account used to create them and the AWS Region where they are created. They consist of
     *        lowercase letters, numbers, and hyphens.
     */

    public void setBackupVaultName(String backupVaultName) {
        this.backupVaultName = backupVaultName;
    }

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique
     * to the account used to create them and the AWS Region where they are created. They consist of lowercase letters,
     * numbers, and hyphens.
     * </p>
     * 
     * @return The name of a logical container where backups are stored. Backup vaults are identified by names that are
     *         unique to the account used to create them and the AWS Region where they are created. They consist of
     *         lowercase letters, numbers, and hyphens.
     */

    public String getBackupVaultName() {
        return this.backupVaultName;
    }

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique
     * to the account used to create them and the AWS Region where they are created. They consist of lowercase letters,
     * numbers, and hyphens.
     * </p>
     * 
     * @param backupVaultName
     *        The name of a logical container where backups are stored. Backup vaults are identified by names that are
     *        unique to the account used to create them and the AWS Region where they are created. They consist of
     *        lowercase letters, numbers, and hyphens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupJob withBackupVaultName(String backupVaultName) {
        setBackupVaultName(backupVaultName);
        return this;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a backup vault; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     * 
     * @param backupVaultArn
     *        An Amazon Resource Name (ARN) that uniquely identifies a backup vault; for example,
     *        <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     */

    public void setBackupVaultArn(String backupVaultArn) {
        this.backupVaultArn = backupVaultArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a backup vault; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     * 
     * @return An Amazon Resource Name (ARN) that uniquely identifies a backup vault; for example,
     *         <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     */

    public String getBackupVaultArn() {
        return this.backupVaultArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a backup vault; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     * 
     * @param backupVaultArn
     *        An Amazon Resource Name (ARN) that uniquely identifies a backup vault; for example,
     *        <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupJob withBackupVaultArn(String backupVaultArn) {
        setBackupVaultArn(backupVaultArn);
        return this;
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

    public BackupJob withRecoveryPointArn(String recoveryPointArn) {
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

    public BackupJob withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The date and time a backup job is created, in Unix format and Coordinated Universal Time (UTC). The value of
     * <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents Friday,
     * January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param creationDate
     *        The date and time a backup job is created, in Unix format and Coordinated Universal Time (UTC). The value
     *        of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     *        Friday, January 26, 2018 12:11:30.087 AM.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time a backup job is created, in Unix format and Coordinated Universal Time (UTC). The value of
     * <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents Friday,
     * January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @return The date and time a backup job is created, in Unix format and Coordinated Universal Time (UTC). The value
     *         of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087
     *         represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date and time a backup job is created, in Unix format and Coordinated Universal Time (UTC). The value of
     * <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents Friday,
     * January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param creationDate
     *        The date and time a backup job is created, in Unix format and Coordinated Universal Time (UTC). The value
     *        of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     *        Friday, January 26, 2018 12:11:30.087 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupJob withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The date and time a job to create a backup job is completed, in Unix format and Coordinated Universal Time (UTC).
     * The value of <code>CompletionDate</code> is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param completionDate
     *        The date and time a job to create a backup job is completed, in Unix format and Coordinated Universal Time
     *        (UTC). The value of <code>CompletionDate</code> is accurate to milliseconds. For example, the value
     *        1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public void setCompletionDate(java.util.Date completionDate) {
        this.completionDate = completionDate;
    }

    /**
     * <p>
     * The date and time a job to create a backup job is completed, in Unix format and Coordinated Universal Time (UTC).
     * The value of <code>CompletionDate</code> is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @return The date and time a job to create a backup job is completed, in Unix format and Coordinated Universal
     *         Time (UTC). The value of <code>CompletionDate</code> is accurate to milliseconds. For example, the value
     *         1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public java.util.Date getCompletionDate() {
        return this.completionDate;
    }

    /**
     * <p>
     * The date and time a job to create a backup job is completed, in Unix format and Coordinated Universal Time (UTC).
     * The value of <code>CompletionDate</code> is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param completionDate
     *        The date and time a job to create a backup job is completed, in Unix format and Coordinated Universal Time
     *        (UTC). The value of <code>CompletionDate</code> is accurate to milliseconds. For example, the value
     *        1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupJob withCompletionDate(java.util.Date completionDate) {
        setCompletionDate(completionDate);
        return this;
    }

    /**
     * <p>
     * The current state of a resource recovery point.
     * </p>
     * 
     * @param state
     *        The current state of a resource recovery point.
     * @see BackupJobState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of a resource recovery point.
     * </p>
     * 
     * @return The current state of a resource recovery point.
     * @see BackupJobState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of a resource recovery point.
     * </p>
     * 
     * @param state
     *        The current state of a resource recovery point.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BackupJobState
     */

    public BackupJob withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of a resource recovery point.
     * </p>
     * 
     * @param state
     *        The current state of a resource recovery point.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BackupJobState
     */

    public BackupJob withState(BackupJobState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * A detailed message explaining the status of the job to back up a resource.
     * </p>
     * 
     * @param statusMessage
     *        A detailed message explaining the status of the job to back up a resource.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A detailed message explaining the status of the job to back up a resource.
     * </p>
     * 
     * @return A detailed message explaining the status of the job to back up a resource.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * A detailed message explaining the status of the job to back up a resource.
     * </p>
     * 
     * @param statusMessage
     *        A detailed message explaining the status of the job to back up a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupJob withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * Contains an estimated percentage complete of a job at the time the job status was queried.
     * </p>
     * 
     * @param percentDone
     *        Contains an estimated percentage complete of a job at the time the job status was queried.
     */

    public void setPercentDone(String percentDone) {
        this.percentDone = percentDone;
    }

    /**
     * <p>
     * Contains an estimated percentage complete of a job at the time the job status was queried.
     * </p>
     * 
     * @return Contains an estimated percentage complete of a job at the time the job status was queried.
     */

    public String getPercentDone() {
        return this.percentDone;
    }

    /**
     * <p>
     * Contains an estimated percentage complete of a job at the time the job status was queried.
     * </p>
     * 
     * @param percentDone
     *        Contains an estimated percentage complete of a job at the time the job status was queried.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupJob withPercentDone(String percentDone) {
        setPercentDone(percentDone);
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

    public BackupJob withBackupSizeInBytes(Long backupSizeInBytes) {
        setBackupSizeInBytes(backupSizeInBytes);
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

    public BackupJob withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
        return this;
    }

    /**
     * <p>
     * Contains identifying information about the creation of a backup job, including the <code>BackupPlanArn</code>,
     * <code>BackupPlanId</code>, <code>BackupPlanVersion</code>, and <code>BackupRuleId</code> of the backup plan used
     * to create it.
     * </p>
     * 
     * @param createdBy
     *        Contains identifying information about the creation of a backup job, including the
     *        <code>BackupPlanArn</code>, <code>BackupPlanId</code>, <code>BackupPlanVersion</code>, and
     *        <code>BackupRuleId</code> of the backup plan used to create it.
     */

    public void setCreatedBy(RecoveryPointCreator createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * Contains identifying information about the creation of a backup job, including the <code>BackupPlanArn</code>,
     * <code>BackupPlanId</code>, <code>BackupPlanVersion</code>, and <code>BackupRuleId</code> of the backup plan used
     * to create it.
     * </p>
     * 
     * @return Contains identifying information about the creation of a backup job, including the
     *         <code>BackupPlanArn</code>, <code>BackupPlanId</code>, <code>BackupPlanVersion</code>, and
     *         <code>BackupRuleId</code> of the backup plan used to create it.
     */

    public RecoveryPointCreator getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * Contains identifying information about the creation of a backup job, including the <code>BackupPlanArn</code>,
     * <code>BackupPlanId</code>, <code>BackupPlanVersion</code>, and <code>BackupRuleId</code> of the backup plan used
     * to create it.
     * </p>
     * 
     * @param createdBy
     *        Contains identifying information about the creation of a backup job, including the
     *        <code>BackupPlanArn</code>, <code>BackupPlanId</code>, <code>BackupPlanVersion</code>, and
     *        <code>BackupRuleId</code> of the backup plan used to create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupJob withCreatedBy(RecoveryPointCreator createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The date and time a job to back up resources is expected to be completed, in Unix format and Coordinated
     * Universal Time (UTC). The value of <code>ExpectedCompletionDate</code> is accurate to milliseconds. For example,
     * the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param expectedCompletionDate
     *        The date and time a job to back up resources is expected to be completed, in Unix format and Coordinated
     *        Universal Time (UTC). The value of <code>ExpectedCompletionDate</code> is accurate to milliseconds. For
     *        example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public void setExpectedCompletionDate(java.util.Date expectedCompletionDate) {
        this.expectedCompletionDate = expectedCompletionDate;
    }

    /**
     * <p>
     * The date and time a job to back up resources is expected to be completed, in Unix format and Coordinated
     * Universal Time (UTC). The value of <code>ExpectedCompletionDate</code> is accurate to milliseconds. For example,
     * the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @return The date and time a job to back up resources is expected to be completed, in Unix format and Coordinated
     *         Universal Time (UTC). The value of <code>ExpectedCompletionDate</code> is accurate to milliseconds. For
     *         example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public java.util.Date getExpectedCompletionDate() {
        return this.expectedCompletionDate;
    }

    /**
     * <p>
     * The date and time a job to back up resources is expected to be completed, in Unix format and Coordinated
     * Universal Time (UTC). The value of <code>ExpectedCompletionDate</code> is accurate to milliseconds. For example,
     * the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param expectedCompletionDate
     *        The date and time a job to back up resources is expected to be completed, in Unix format and Coordinated
     *        Universal Time (UTC). The value of <code>ExpectedCompletionDate</code> is accurate to milliseconds. For
     *        example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupJob withExpectedCompletionDate(java.util.Date expectedCompletionDate) {
        setExpectedCompletionDate(expectedCompletionDate);
        return this;
    }

    /**
     * <p>
     * Specifies the time in Unix format and Coordinated Universal Time (UTC) when a backup job must be started before
     * it is canceled. The value is calculated by adding the start window to the scheduled time. So if the scheduled
     * time were 6:00 PM and the start window is 2 hours, the <code>StartBy</code> time would be 8:00 PM on the date
     * specified. The value of <code>StartBy</code> is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param startBy
     *        Specifies the time in Unix format and Coordinated Universal Time (UTC) when a backup job must be started
     *        before it is canceled. The value is calculated by adding the start window to the scheduled time. So if the
     *        scheduled time were 6:00 PM and the start window is 2 hours, the <code>StartBy</code> time would be 8:00
     *        PM on the date specified. The value of <code>StartBy</code> is accurate to milliseconds. For example, the
     *        value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public void setStartBy(java.util.Date startBy) {
        this.startBy = startBy;
    }

    /**
     * <p>
     * Specifies the time in Unix format and Coordinated Universal Time (UTC) when a backup job must be started before
     * it is canceled. The value is calculated by adding the start window to the scheduled time. So if the scheduled
     * time were 6:00 PM and the start window is 2 hours, the <code>StartBy</code> time would be 8:00 PM on the date
     * specified. The value of <code>StartBy</code> is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @return Specifies the time in Unix format and Coordinated Universal Time (UTC) when a backup job must be started
     *         before it is canceled. The value is calculated by adding the start window to the scheduled time. So if
     *         the scheduled time were 6:00 PM and the start window is 2 hours, the <code>StartBy</code> time would be
     *         8:00 PM on the date specified. The value of <code>StartBy</code> is accurate to milliseconds. For
     *         example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public java.util.Date getStartBy() {
        return this.startBy;
    }

    /**
     * <p>
     * Specifies the time in Unix format and Coordinated Universal Time (UTC) when a backup job must be started before
     * it is canceled. The value is calculated by adding the start window to the scheduled time. So if the scheduled
     * time were 6:00 PM and the start window is 2 hours, the <code>StartBy</code> time would be 8:00 PM on the date
     * specified. The value of <code>StartBy</code> is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param startBy
     *        Specifies the time in Unix format and Coordinated Universal Time (UTC) when a backup job must be started
     *        before it is canceled. The value is calculated by adding the start window to the scheduled time. So if the
     *        scheduled time were 6:00 PM and the start window is 2 hours, the <code>StartBy</code> time would be 8:00
     *        PM on the date specified. The value of <code>StartBy</code> is accurate to milliseconds. For example, the
     *        value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupJob withStartBy(java.util.Date startBy) {
        setStartBy(startBy);
        return this;
    }

    /**
     * <p>
     * The type of AWS resource to be backed-up; for example, an Amazon Elastic Block Store (Amazon EBS) volume or an
     * Amazon Relational Database Service (Amazon RDS) database.
     * </p>
     * 
     * @param resourceType
     *        The type of AWS resource to be backed-up; for example, an Amazon Elastic Block Store (Amazon EBS) volume
     *        or an Amazon Relational Database Service (Amazon RDS) database.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of AWS resource to be backed-up; for example, an Amazon Elastic Block Store (Amazon EBS) volume or an
     * Amazon Relational Database Service (Amazon RDS) database.
     * </p>
     * 
     * @return The type of AWS resource to be backed-up; for example, an Amazon Elastic Block Store (Amazon EBS) volume
     *         or an Amazon Relational Database Service (Amazon RDS) database.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of AWS resource to be backed-up; for example, an Amazon Elastic Block Store (Amazon EBS) volume or an
     * Amazon Relational Database Service (Amazon RDS) database.
     * </p>
     * 
     * @param resourceType
     *        The type of AWS resource to be backed-up; for example, an Amazon Elastic Block Store (Amazon EBS) volume
     *        or an Amazon Relational Database Service (Amazon RDS) database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupJob withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The size in bytes transferred to a backup vault at the time that the job status was queried.
     * </p>
     * 
     * @param bytesTransferred
     *        The size in bytes transferred to a backup vault at the time that the job status was queried.
     */

    public void setBytesTransferred(Long bytesTransferred) {
        this.bytesTransferred = bytesTransferred;
    }

    /**
     * <p>
     * The size in bytes transferred to a backup vault at the time that the job status was queried.
     * </p>
     * 
     * @return The size in bytes transferred to a backup vault at the time that the job status was queried.
     */

    public Long getBytesTransferred() {
        return this.bytesTransferred;
    }

    /**
     * <p>
     * The size in bytes transferred to a backup vault at the time that the job status was queried.
     * </p>
     * 
     * @param bytesTransferred
     *        The size in bytes transferred to a backup vault at the time that the job status was queried.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupJob withBytesTransferred(Long bytesTransferred) {
        setBytesTransferred(bytesTransferred);
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
        if (getBackupJobId() != null)
            sb.append("BackupJobId: ").append(getBackupJobId()).append(",");
        if (getBackupVaultName() != null)
            sb.append("BackupVaultName: ").append(getBackupVaultName()).append(",");
        if (getBackupVaultArn() != null)
            sb.append("BackupVaultArn: ").append(getBackupVaultArn()).append(",");
        if (getRecoveryPointArn() != null)
            sb.append("RecoveryPointArn: ").append(getRecoveryPointArn()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getCompletionDate() != null)
            sb.append("CompletionDate: ").append(getCompletionDate()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getPercentDone() != null)
            sb.append("PercentDone: ").append(getPercentDone()).append(",");
        if (getBackupSizeInBytes() != null)
            sb.append("BackupSizeInBytes: ").append(getBackupSizeInBytes()).append(",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: ").append(getIamRoleArn()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getExpectedCompletionDate() != null)
            sb.append("ExpectedCompletionDate: ").append(getExpectedCompletionDate()).append(",");
        if (getStartBy() != null)
            sb.append("StartBy: ").append(getStartBy()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getBytesTransferred() != null)
            sb.append("BytesTransferred: ").append(getBytesTransferred());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BackupJob == false)
            return false;
        BackupJob other = (BackupJob) obj;
        if (other.getBackupJobId() == null ^ this.getBackupJobId() == null)
            return false;
        if (other.getBackupJobId() != null && other.getBackupJobId().equals(this.getBackupJobId()) == false)
            return false;
        if (other.getBackupVaultName() == null ^ this.getBackupVaultName() == null)
            return false;
        if (other.getBackupVaultName() != null && other.getBackupVaultName().equals(this.getBackupVaultName()) == false)
            return false;
        if (other.getBackupVaultArn() == null ^ this.getBackupVaultArn() == null)
            return false;
        if (other.getBackupVaultArn() != null && other.getBackupVaultArn().equals(this.getBackupVaultArn()) == false)
            return false;
        if (other.getRecoveryPointArn() == null ^ this.getRecoveryPointArn() == null)
            return false;
        if (other.getRecoveryPointArn() != null && other.getRecoveryPointArn().equals(this.getRecoveryPointArn()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getCompletionDate() == null ^ this.getCompletionDate() == null)
            return false;
        if (other.getCompletionDate() != null && other.getCompletionDate().equals(this.getCompletionDate()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getPercentDone() == null ^ this.getPercentDone() == null)
            return false;
        if (other.getPercentDone() != null && other.getPercentDone().equals(this.getPercentDone()) == false)
            return false;
        if (other.getBackupSizeInBytes() == null ^ this.getBackupSizeInBytes() == null)
            return false;
        if (other.getBackupSizeInBytes() != null && other.getBackupSizeInBytes().equals(this.getBackupSizeInBytes()) == false)
            return false;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getExpectedCompletionDate() == null ^ this.getExpectedCompletionDate() == null)
            return false;
        if (other.getExpectedCompletionDate() != null && other.getExpectedCompletionDate().equals(this.getExpectedCompletionDate()) == false)
            return false;
        if (other.getStartBy() == null ^ this.getStartBy() == null)
            return false;
        if (other.getStartBy() != null && other.getStartBy().equals(this.getStartBy()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getBytesTransferred() == null ^ this.getBytesTransferred() == null)
            return false;
        if (other.getBytesTransferred() != null && other.getBytesTransferred().equals(this.getBytesTransferred()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupJobId() == null) ? 0 : getBackupJobId().hashCode());
        hashCode = prime * hashCode + ((getBackupVaultName() == null) ? 0 : getBackupVaultName().hashCode());
        hashCode = prime * hashCode + ((getBackupVaultArn() == null) ? 0 : getBackupVaultArn().hashCode());
        hashCode = prime * hashCode + ((getRecoveryPointArn() == null) ? 0 : getRecoveryPointArn().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getCompletionDate() == null) ? 0 : getCompletionDate().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getPercentDone() == null) ? 0 : getPercentDone().hashCode());
        hashCode = prime * hashCode + ((getBackupSizeInBytes() == null) ? 0 : getBackupSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getExpectedCompletionDate() == null) ? 0 : getExpectedCompletionDate().hashCode());
        hashCode = prime * hashCode + ((getStartBy() == null) ? 0 : getStartBy().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getBytesTransferred() == null) ? 0 : getBytesTransferred().hashCode());
        return hashCode;
    }

    @Override
    public BackupJob clone() {
        try {
            return (BackupJob) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backup.model.transform.BackupJobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
