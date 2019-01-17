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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/StartBackupJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartBackupJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource
     * type.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * Specifies the IAM role ARN used to create the target recovery point; for example,
     * <code>arn:aws:iam::123456789012:role/S3Access</code>.
     * </p>
     */
    private String iamRoleArn;
    /**
     * <p>
     * A customer chosen string that can be used to distinguish between calls to <code>StartBackupJob</code>.
     * Idempotency tokens time out after one hour. Therefore, if you call <code>StartBackupJob</code> multiple times
     * with the same idempotency token within one hour, AWS Backup recognizes that you are requesting only one backup
     * job and initiates only one. If you change the idempotency token for each call, AWS Backup recognizes that you are
     * requesting to start multiple backups.
     * </p>
     */
    private String idempotencyToken;
    /**
     * <p>
     * The amount of time in minutes before beginning a backup.
     * </p>
     */
    private Long startWindowMinutes;
    /**
     * <p>
     * The amount of time AWS Backup attempts a backup before canceling the job and returning an error.
     * </p>
     */
    private Long completeWindowMinutes;
    /**
     * <p>
     * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup
     * will transition and expire backups automatically according to the lifecycle that you define.
     * </p>
     * <p>
     * Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the
     * “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The
     * “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold.
     * </p>
     */
    private Lifecycle lifecycle;
    /**
     * <p>
     * To help organize your resources, you can assign your own metadata to the resources that you create. Each tag is a
     * key-value pair.
     * </p>
     */
    private java.util.Map<String, String> recoveryPointTags;

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

    public StartBackupJobRequest withBackupVaultName(String backupVaultName) {
        setBackupVaultName(backupVaultName);
        return this;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource
     * type.
     * </p>
     * 
     * @param resourceArn
     *        An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the
     *        resource type.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
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

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource
     * type.
     * </p>
     * 
     * @param resourceArn
     *        An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the
     *        resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBackupJobRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
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

    public StartBackupJobRequest withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
        return this;
    }

    /**
     * <p>
     * A customer chosen string that can be used to distinguish between calls to <code>StartBackupJob</code>.
     * Idempotency tokens time out after one hour. Therefore, if you call <code>StartBackupJob</code> multiple times
     * with the same idempotency token within one hour, AWS Backup recognizes that you are requesting only one backup
     * job and initiates only one. If you change the idempotency token for each call, AWS Backup recognizes that you are
     * requesting to start multiple backups.
     * </p>
     * 
     * @param idempotencyToken
     *        A customer chosen string that can be used to distinguish between calls to <code>StartBackupJob</code>.
     *        Idempotency tokens time out after one hour. Therefore, if you call <code>StartBackupJob</code> multiple
     *        times with the same idempotency token within one hour, AWS Backup recognizes that you are requesting only
     *        one backup job and initiates only one. If you change the idempotency token for each call, AWS Backup
     *        recognizes that you are requesting to start multiple backups.
     */

    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * A customer chosen string that can be used to distinguish between calls to <code>StartBackupJob</code>.
     * Idempotency tokens time out after one hour. Therefore, if you call <code>StartBackupJob</code> multiple times
     * with the same idempotency token within one hour, AWS Backup recognizes that you are requesting only one backup
     * job and initiates only one. If you change the idempotency token for each call, AWS Backup recognizes that you are
     * requesting to start multiple backups.
     * </p>
     * 
     * @return A customer chosen string that can be used to distinguish between calls to <code>StartBackupJob</code>.
     *         Idempotency tokens time out after one hour. Therefore, if you call <code>StartBackupJob</code> multiple
     *         times with the same idempotency token within one hour, AWS Backup recognizes that you are requesting only
     *         one backup job and initiates only one. If you change the idempotency token for each call, AWS Backup
     *         recognizes that you are requesting to start multiple backups.
     */

    public String getIdempotencyToken() {
        return this.idempotencyToken;
    }

    /**
     * <p>
     * A customer chosen string that can be used to distinguish between calls to <code>StartBackupJob</code>.
     * Idempotency tokens time out after one hour. Therefore, if you call <code>StartBackupJob</code> multiple times
     * with the same idempotency token within one hour, AWS Backup recognizes that you are requesting only one backup
     * job and initiates only one. If you change the idempotency token for each call, AWS Backup recognizes that you are
     * requesting to start multiple backups.
     * </p>
     * 
     * @param idempotencyToken
     *        A customer chosen string that can be used to distinguish between calls to <code>StartBackupJob</code>.
     *        Idempotency tokens time out after one hour. Therefore, if you call <code>StartBackupJob</code> multiple
     *        times with the same idempotency token within one hour, AWS Backup recognizes that you are requesting only
     *        one backup job and initiates only one. If you change the idempotency token for each call, AWS Backup
     *        recognizes that you are requesting to start multiple backups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBackupJobRequest withIdempotencyToken(String idempotencyToken) {
        setIdempotencyToken(idempotencyToken);
        return this;
    }

    /**
     * <p>
     * The amount of time in minutes before beginning a backup.
     * </p>
     * 
     * @param startWindowMinutes
     *        The amount of time in minutes before beginning a backup.
     */

    public void setStartWindowMinutes(Long startWindowMinutes) {
        this.startWindowMinutes = startWindowMinutes;
    }

    /**
     * <p>
     * The amount of time in minutes before beginning a backup.
     * </p>
     * 
     * @return The amount of time in minutes before beginning a backup.
     */

    public Long getStartWindowMinutes() {
        return this.startWindowMinutes;
    }

    /**
     * <p>
     * The amount of time in minutes before beginning a backup.
     * </p>
     * 
     * @param startWindowMinutes
     *        The amount of time in minutes before beginning a backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBackupJobRequest withStartWindowMinutes(Long startWindowMinutes) {
        setStartWindowMinutes(startWindowMinutes);
        return this;
    }

    /**
     * <p>
     * The amount of time AWS Backup attempts a backup before canceling the job and returning an error.
     * </p>
     * 
     * @param completeWindowMinutes
     *        The amount of time AWS Backup attempts a backup before canceling the job and returning an error.
     */

    public void setCompleteWindowMinutes(Long completeWindowMinutes) {
        this.completeWindowMinutes = completeWindowMinutes;
    }

    /**
     * <p>
     * The amount of time AWS Backup attempts a backup before canceling the job and returning an error.
     * </p>
     * 
     * @return The amount of time AWS Backup attempts a backup before canceling the job and returning an error.
     */

    public Long getCompleteWindowMinutes() {
        return this.completeWindowMinutes;
    }

    /**
     * <p>
     * The amount of time AWS Backup attempts a backup before canceling the job and returning an error.
     * </p>
     * 
     * @param completeWindowMinutes
     *        The amount of time AWS Backup attempts a backup before canceling the job and returning an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBackupJobRequest withCompleteWindowMinutes(Long completeWindowMinutes) {
        setCompleteWindowMinutes(completeWindowMinutes);
        return this;
    }

    /**
     * <p>
     * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup
     * will transition and expire backups automatically according to the lifecycle that you define.
     * </p>
     * <p>
     * Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the
     * “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The
     * “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold.
     * </p>
     * 
     * @param lifecycle
     *        The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS
     *        Backup will transition and expire backups automatically according to the lifecycle that you define. </p>
     *        <p>
     *        Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore,
     *        the “expire after days” setting must be 90 days greater than the “transition to cold after days” setting.
     *        The “transition to cold after days” setting cannot be changed after a backup has been transitioned to
     *        cold.
     */

    public void setLifecycle(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * <p>
     * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup
     * will transition and expire backups automatically according to the lifecycle that you define.
     * </p>
     * <p>
     * Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the
     * “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The
     * “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold.
     * </p>
     * 
     * @return The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS
     *         Backup will transition and expire backups automatically according to the lifecycle that you define. </p>
     *         <p>
     *         Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore,
     *         the “expire after days” setting must be 90 days greater than the “transition to cold after days” setting.
     *         The “transition to cold after days” setting cannot be changed after a backup has been transitioned to
     *         cold.
     */

    public Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    /**
     * <p>
     * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup
     * will transition and expire backups automatically according to the lifecycle that you define.
     * </p>
     * <p>
     * Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the
     * “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The
     * “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold.
     * </p>
     * 
     * @param lifecycle
     *        The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS
     *        Backup will transition and expire backups automatically according to the lifecycle that you define. </p>
     *        <p>
     *        Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore,
     *        the “expire after days” setting must be 90 days greater than the “transition to cold after days” setting.
     *        The “transition to cold after days” setting cannot be changed after a backup has been transitioned to
     *        cold.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBackupJobRequest withLifecycle(Lifecycle lifecycle) {
        setLifecycle(lifecycle);
        return this;
    }

    /**
     * <p>
     * To help organize your resources, you can assign your own metadata to the resources that you create. Each tag is a
     * key-value pair.
     * </p>
     * 
     * @return To help organize your resources, you can assign your own metadata to the resources that you create. Each
     *         tag is a key-value pair.
     */

    public java.util.Map<String, String> getRecoveryPointTags() {
        return recoveryPointTags;
    }

    /**
     * <p>
     * To help organize your resources, you can assign your own metadata to the resources that you create. Each tag is a
     * key-value pair.
     * </p>
     * 
     * @param recoveryPointTags
     *        To help organize your resources, you can assign your own metadata to the resources that you create. Each
     *        tag is a key-value pair.
     */

    public void setRecoveryPointTags(java.util.Map<String, String> recoveryPointTags) {
        this.recoveryPointTags = recoveryPointTags;
    }

    /**
     * <p>
     * To help organize your resources, you can assign your own metadata to the resources that you create. Each tag is a
     * key-value pair.
     * </p>
     * 
     * @param recoveryPointTags
     *        To help organize your resources, you can assign your own metadata to the resources that you create. Each
     *        tag is a key-value pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBackupJobRequest withRecoveryPointTags(java.util.Map<String, String> recoveryPointTags) {
        setRecoveryPointTags(recoveryPointTags);
        return this;
    }

    public StartBackupJobRequest addRecoveryPointTagsEntry(String key, String value) {
        if (null == this.recoveryPointTags) {
            this.recoveryPointTags = new java.util.HashMap<String, String>();
        }
        if (this.recoveryPointTags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.recoveryPointTags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RecoveryPointTags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartBackupJobRequest clearRecoveryPointTagsEntries() {
        this.recoveryPointTags = null;
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
        if (getBackupVaultName() != null)
            sb.append("BackupVaultName: ").append(getBackupVaultName()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: ").append(getIamRoleArn()).append(",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: ").append(getIdempotencyToken()).append(",");
        if (getStartWindowMinutes() != null)
            sb.append("StartWindowMinutes: ").append(getStartWindowMinutes()).append(",");
        if (getCompleteWindowMinutes() != null)
            sb.append("CompleteWindowMinutes: ").append(getCompleteWindowMinutes()).append(",");
        if (getLifecycle() != null)
            sb.append("Lifecycle: ").append(getLifecycle()).append(",");
        if (getRecoveryPointTags() != null)
            sb.append("RecoveryPointTags: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartBackupJobRequest == false)
            return false;
        StartBackupJobRequest other = (StartBackupJobRequest) obj;
        if (other.getBackupVaultName() == null ^ this.getBackupVaultName() == null)
            return false;
        if (other.getBackupVaultName() != null && other.getBackupVaultName().equals(this.getBackupVaultName()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
            return false;
        if (other.getStartWindowMinutes() == null ^ this.getStartWindowMinutes() == null)
            return false;
        if (other.getStartWindowMinutes() != null && other.getStartWindowMinutes().equals(this.getStartWindowMinutes()) == false)
            return false;
        if (other.getCompleteWindowMinutes() == null ^ this.getCompleteWindowMinutes() == null)
            return false;
        if (other.getCompleteWindowMinutes() != null && other.getCompleteWindowMinutes().equals(this.getCompleteWindowMinutes()) == false)
            return false;
        if (other.getLifecycle() == null ^ this.getLifecycle() == null)
            return false;
        if (other.getLifecycle() != null && other.getLifecycle().equals(this.getLifecycle()) == false)
            return false;
        if (other.getRecoveryPointTags() == null ^ this.getRecoveryPointTags() == null)
            return false;
        if (other.getRecoveryPointTags() != null && other.getRecoveryPointTags().equals(this.getRecoveryPointTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupVaultName() == null) ? 0 : getBackupVaultName().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        hashCode = prime * hashCode + ((getStartWindowMinutes() == null) ? 0 : getStartWindowMinutes().hashCode());
        hashCode = prime * hashCode + ((getCompleteWindowMinutes() == null) ? 0 : getCompleteWindowMinutes().hashCode());
        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        hashCode = prime * hashCode + ((getRecoveryPointTags() == null) ? 0 : getRecoveryPointTags().hashCode());
        return hashCode;
    }

    @Override
    public StartBackupJobRequest clone() {
        return (StartBackupJobRequest) super.clone();
    }

}
