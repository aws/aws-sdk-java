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
 * Contains metadata about a restore job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/RestoreJobsListMember" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreJobsListMember implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Uniquely identifies the job that restores a recovery point.
     * </p>
     */
    private String restoreJobId;
    /**
     * <p>
     * An ARN that uniquely identifies a recovery point; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45</code>.
     * </p>
     */
    private String recoveryPointArn;
    /**
     * <p>
     * The date and time a restore job is created, in Unix format and Coordinated Universal Time (UTC). The value of
     * <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents Friday,
     * January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The date and time a job to restore a recovery point is completed, in Unix format and Coordinated Universal Time
     * (UTC). The value of <code>CompletionDate</code> is accurate to milliseconds. For example, the value
     * 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date completionDate;
    /**
     * <p>
     * A status code specifying the state of the job initiated by AWS Backup to restore a recovery point.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A detailed message explaining the status of the job to restore a recovery point.
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
     * The size, in bytes, of the restored resource.
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
     * The amount of time in minutes that a job restoring a recovery point is expected to take.
     * </p>
     */
    private Long expectedCompletionTimeMinutes;
    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource
     * type.
     * </p>
     */
    private String createdResourceArn;

    /**
     * <p>
     * Uniquely identifies the job that restores a recovery point.
     * </p>
     * 
     * @param restoreJobId
     *        Uniquely identifies the job that restores a recovery point.
     */

    public void setRestoreJobId(String restoreJobId) {
        this.restoreJobId = restoreJobId;
    }

    /**
     * <p>
     * Uniquely identifies the job that restores a recovery point.
     * </p>
     * 
     * @return Uniquely identifies the job that restores a recovery point.
     */

    public String getRestoreJobId() {
        return this.restoreJobId;
    }

    /**
     * <p>
     * Uniquely identifies the job that restores a recovery point.
     * </p>
     * 
     * @param restoreJobId
     *        Uniquely identifies the job that restores a recovery point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreJobsListMember withRestoreJobId(String restoreJobId) {
        setRestoreJobId(restoreJobId);
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

    public RestoreJobsListMember withRecoveryPointArn(String recoveryPointArn) {
        setRecoveryPointArn(recoveryPointArn);
        return this;
    }

    /**
     * <p>
     * The date and time a restore job is created, in Unix format and Coordinated Universal Time (UTC). The value of
     * <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents Friday,
     * January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param creationDate
     *        The date and time a restore job is created, in Unix format and Coordinated Universal Time (UTC). The value
     *        of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     *        Friday, January 26, 2018 12:11:30.087 AM.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time a restore job is created, in Unix format and Coordinated Universal Time (UTC). The value of
     * <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents Friday,
     * January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @return The date and time a restore job is created, in Unix format and Coordinated Universal Time (UTC). The
     *         value of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087
     *         represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date and time a restore job is created, in Unix format and Coordinated Universal Time (UTC). The value of
     * <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents Friday,
     * January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param creationDate
     *        The date and time a restore job is created, in Unix format and Coordinated Universal Time (UTC). The value
     *        of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     *        Friday, January 26, 2018 12:11:30.087 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreJobsListMember withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The date and time a job to restore a recovery point is completed, in Unix format and Coordinated Universal Time
     * (UTC). The value of <code>CompletionDate</code> is accurate to milliseconds. For example, the value
     * 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param completionDate
     *        The date and time a job to restore a recovery point is completed, in Unix format and Coordinated Universal
     *        Time (UTC). The value of <code>CompletionDate</code> is accurate to milliseconds. For example, the value
     *        1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public void setCompletionDate(java.util.Date completionDate) {
        this.completionDate = completionDate;
    }

    /**
     * <p>
     * The date and time a job to restore a recovery point is completed, in Unix format and Coordinated Universal Time
     * (UTC). The value of <code>CompletionDate</code> is accurate to milliseconds. For example, the value
     * 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @return The date and time a job to restore a recovery point is completed, in Unix format and Coordinated
     *         Universal Time (UTC). The value of <code>CompletionDate</code> is accurate to milliseconds. For example,
     *         the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public java.util.Date getCompletionDate() {
        return this.completionDate;
    }

    /**
     * <p>
     * The date and time a job to restore a recovery point is completed, in Unix format and Coordinated Universal Time
     * (UTC). The value of <code>CompletionDate</code> is accurate to milliseconds. For example, the value
     * 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param completionDate
     *        The date and time a job to restore a recovery point is completed, in Unix format and Coordinated Universal
     *        Time (UTC). The value of <code>CompletionDate</code> is accurate to milliseconds. For example, the value
     *        1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreJobsListMember withCompletionDate(java.util.Date completionDate) {
        setCompletionDate(completionDate);
        return this;
    }

    /**
     * <p>
     * A status code specifying the state of the job initiated by AWS Backup to restore a recovery point.
     * </p>
     * 
     * @param status
     *        A status code specifying the state of the job initiated by AWS Backup to restore a recovery point.
     * @see RestoreJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * A status code specifying the state of the job initiated by AWS Backup to restore a recovery point.
     * </p>
     * 
     * @return A status code specifying the state of the job initiated by AWS Backup to restore a recovery point.
     * @see RestoreJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * A status code specifying the state of the job initiated by AWS Backup to restore a recovery point.
     * </p>
     * 
     * @param status
     *        A status code specifying the state of the job initiated by AWS Backup to restore a recovery point.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RestoreJobStatus
     */

    public RestoreJobsListMember withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A status code specifying the state of the job initiated by AWS Backup to restore a recovery point.
     * </p>
     * 
     * @param status
     *        A status code specifying the state of the job initiated by AWS Backup to restore a recovery point.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RestoreJobStatus
     */

    public RestoreJobsListMember withStatus(RestoreJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A detailed message explaining the status of the job to restore a recovery point.
     * </p>
     * 
     * @param statusMessage
     *        A detailed message explaining the status of the job to restore a recovery point.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A detailed message explaining the status of the job to restore a recovery point.
     * </p>
     * 
     * @return A detailed message explaining the status of the job to restore a recovery point.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * A detailed message explaining the status of the job to restore a recovery point.
     * </p>
     * 
     * @param statusMessage
     *        A detailed message explaining the status of the job to restore a recovery point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreJobsListMember withStatusMessage(String statusMessage) {
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

    public RestoreJobsListMember withPercentDone(String percentDone) {
        setPercentDone(percentDone);
        return this;
    }

    /**
     * <p>
     * The size, in bytes, of the restored resource.
     * </p>
     * 
     * @param backupSizeInBytes
     *        The size, in bytes, of the restored resource.
     */

    public void setBackupSizeInBytes(Long backupSizeInBytes) {
        this.backupSizeInBytes = backupSizeInBytes;
    }

    /**
     * <p>
     * The size, in bytes, of the restored resource.
     * </p>
     * 
     * @return The size, in bytes, of the restored resource.
     */

    public Long getBackupSizeInBytes() {
        return this.backupSizeInBytes;
    }

    /**
     * <p>
     * The size, in bytes, of the restored resource.
     * </p>
     * 
     * @param backupSizeInBytes
     *        The size, in bytes, of the restored resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreJobsListMember withBackupSizeInBytes(Long backupSizeInBytes) {
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

    public RestoreJobsListMember withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
        return this;
    }

    /**
     * <p>
     * The amount of time in minutes that a job restoring a recovery point is expected to take.
     * </p>
     * 
     * @param expectedCompletionTimeMinutes
     *        The amount of time in minutes that a job restoring a recovery point is expected to take.
     */

    public void setExpectedCompletionTimeMinutes(Long expectedCompletionTimeMinutes) {
        this.expectedCompletionTimeMinutes = expectedCompletionTimeMinutes;
    }

    /**
     * <p>
     * The amount of time in minutes that a job restoring a recovery point is expected to take.
     * </p>
     * 
     * @return The amount of time in minutes that a job restoring a recovery point is expected to take.
     */

    public Long getExpectedCompletionTimeMinutes() {
        return this.expectedCompletionTimeMinutes;
    }

    /**
     * <p>
     * The amount of time in minutes that a job restoring a recovery point is expected to take.
     * </p>
     * 
     * @param expectedCompletionTimeMinutes
     *        The amount of time in minutes that a job restoring a recovery point is expected to take.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreJobsListMember withExpectedCompletionTimeMinutes(Long expectedCompletionTimeMinutes) {
        setExpectedCompletionTimeMinutes(expectedCompletionTimeMinutes);
        return this;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource
     * type.
     * </p>
     * 
     * @param createdResourceArn
     *        An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the
     *        resource type.
     */

    public void setCreatedResourceArn(String createdResourceArn) {
        this.createdResourceArn = createdResourceArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource
     * type.
     * </p>
     * 
     * @return An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the
     *         resource type.
     */

    public String getCreatedResourceArn() {
        return this.createdResourceArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource
     * type.
     * </p>
     * 
     * @param createdResourceArn
     *        An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the
     *        resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreJobsListMember withCreatedResourceArn(String createdResourceArn) {
        setCreatedResourceArn(createdResourceArn);
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
        if (getRestoreJobId() != null)
            sb.append("RestoreJobId: ").append(getRestoreJobId()).append(",");
        if (getRecoveryPointArn() != null)
            sb.append("RecoveryPointArn: ").append(getRecoveryPointArn()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getCompletionDate() != null)
            sb.append("CompletionDate: ").append(getCompletionDate()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getPercentDone() != null)
            sb.append("PercentDone: ").append(getPercentDone()).append(",");
        if (getBackupSizeInBytes() != null)
            sb.append("BackupSizeInBytes: ").append(getBackupSizeInBytes()).append(",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: ").append(getIamRoleArn()).append(",");
        if (getExpectedCompletionTimeMinutes() != null)
            sb.append("ExpectedCompletionTimeMinutes: ").append(getExpectedCompletionTimeMinutes()).append(",");
        if (getCreatedResourceArn() != null)
            sb.append("CreatedResourceArn: ").append(getCreatedResourceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreJobsListMember == false)
            return false;
        RestoreJobsListMember other = (RestoreJobsListMember) obj;
        if (other.getRestoreJobId() == null ^ this.getRestoreJobId() == null)
            return false;
        if (other.getRestoreJobId() != null && other.getRestoreJobId().equals(this.getRestoreJobId()) == false)
            return false;
        if (other.getRecoveryPointArn() == null ^ this.getRecoveryPointArn() == null)
            return false;
        if (other.getRecoveryPointArn() != null && other.getRecoveryPointArn().equals(this.getRecoveryPointArn()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getCompletionDate() == null ^ this.getCompletionDate() == null)
            return false;
        if (other.getCompletionDate() != null && other.getCompletionDate().equals(this.getCompletionDate()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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
        if (other.getExpectedCompletionTimeMinutes() == null ^ this.getExpectedCompletionTimeMinutes() == null)
            return false;
        if (other.getExpectedCompletionTimeMinutes() != null
                && other.getExpectedCompletionTimeMinutes().equals(this.getExpectedCompletionTimeMinutes()) == false)
            return false;
        if (other.getCreatedResourceArn() == null ^ this.getCreatedResourceArn() == null)
            return false;
        if (other.getCreatedResourceArn() != null && other.getCreatedResourceArn().equals(this.getCreatedResourceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestoreJobId() == null) ? 0 : getRestoreJobId().hashCode());
        hashCode = prime * hashCode + ((getRecoveryPointArn() == null) ? 0 : getRecoveryPointArn().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getCompletionDate() == null) ? 0 : getCompletionDate().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getPercentDone() == null) ? 0 : getPercentDone().hashCode());
        hashCode = prime * hashCode + ((getBackupSizeInBytes() == null) ? 0 : getBackupSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getExpectedCompletionTimeMinutes() == null) ? 0 : getExpectedCompletionTimeMinutes().hashCode());
        hashCode = prime * hashCode + ((getCreatedResourceArn() == null) ? 0 : getCreatedResourceArn().hashCode());
        return hashCode;
    }

    @Override
    public RestoreJobsListMember clone() {
        try {
            return (RestoreJobsListMember) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backup.model.transform.RestoreJobsListMemberMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
