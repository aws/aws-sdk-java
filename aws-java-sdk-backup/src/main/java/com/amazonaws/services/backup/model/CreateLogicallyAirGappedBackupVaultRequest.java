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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/CreateLogicallyAirGappedBackupVault"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLogicallyAirGappedBackupVaultRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * This is the name of the vault that is being created.
     * </p>
     */
    private String backupVaultName;
    /**
     * <p>
     * These are the tags that will be included in the newly-created vault.
     * </p>
     */
    private java.util.Map<String, String> backupVaultTags;
    /**
     * <p>
     * This is the ID of the creation request.
     * </p>
     * <p>
     * This parameter is optional. If used, this parameter must contain 1 to 50 alphanumeric or '-_.' characters.
     * </p>
     */
    private String creatorRequestId;
    /**
     * <p>
     * This setting specifies the minimum retention period that the vault retains its recovery points. If this parameter
     * is not specified, no minimum retention period is enforced.
     * </p>
     * <p>
     * If specified, any backup or copy job to the vault must have a lifecycle policy with a retention period equal to
     * or longer than the minimum retention period. If a job retention period is shorter than that minimum retention
     * period, then the vault fails the backup or copy job, and you should either modify your lifecycle settings or use
     * a different vault.
     * </p>
     */
    private Long minRetentionDays;
    /**
     * <p>
     * This is the setting that specifies the maximum retention period that the vault retains its recovery points. If
     * this parameter is not specified, Backup does not enforce a maximum retention period on the recovery points in the
     * vault (allowing indefinite storage).
     * </p>
     * <p>
     * If specified, any backup or copy job to the vault must have a lifecycle policy with a retention period equal to
     * or shorter than the maximum retention period. If the job retention period is longer than that maximum retention
     * period, then the vault fails the backup or copy job, and you should either modify your lifecycle settings or use
     * a different vault.
     * </p>
     */
    private Long maxRetentionDays;

    /**
     * <p>
     * This is the name of the vault that is being created.
     * </p>
     * 
     * @param backupVaultName
     *        This is the name of the vault that is being created.
     */

    public void setBackupVaultName(String backupVaultName) {
        this.backupVaultName = backupVaultName;
    }

    /**
     * <p>
     * This is the name of the vault that is being created.
     * </p>
     * 
     * @return This is the name of the vault that is being created.
     */

    public String getBackupVaultName() {
        return this.backupVaultName;
    }

    /**
     * <p>
     * This is the name of the vault that is being created.
     * </p>
     * 
     * @param backupVaultName
     *        This is the name of the vault that is being created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLogicallyAirGappedBackupVaultRequest withBackupVaultName(String backupVaultName) {
        setBackupVaultName(backupVaultName);
        return this;
    }

    /**
     * <p>
     * These are the tags that will be included in the newly-created vault.
     * </p>
     * 
     * @return These are the tags that will be included in the newly-created vault.
     */

    public java.util.Map<String, String> getBackupVaultTags() {
        return backupVaultTags;
    }

    /**
     * <p>
     * These are the tags that will be included in the newly-created vault.
     * </p>
     * 
     * @param backupVaultTags
     *        These are the tags that will be included in the newly-created vault.
     */

    public void setBackupVaultTags(java.util.Map<String, String> backupVaultTags) {
        this.backupVaultTags = backupVaultTags;
    }

    /**
     * <p>
     * These are the tags that will be included in the newly-created vault.
     * </p>
     * 
     * @param backupVaultTags
     *        These are the tags that will be included in the newly-created vault.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLogicallyAirGappedBackupVaultRequest withBackupVaultTags(java.util.Map<String, String> backupVaultTags) {
        setBackupVaultTags(backupVaultTags);
        return this;
    }

    /**
     * Add a single BackupVaultTags entry
     *
     * @see CreateLogicallyAirGappedBackupVaultRequest#withBackupVaultTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateLogicallyAirGappedBackupVaultRequest addBackupVaultTagsEntry(String key, String value) {
        if (null == this.backupVaultTags) {
            this.backupVaultTags = new java.util.HashMap<String, String>();
        }
        if (this.backupVaultTags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.backupVaultTags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into BackupVaultTags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLogicallyAirGappedBackupVaultRequest clearBackupVaultTagsEntries() {
        this.backupVaultTags = null;
        return this;
    }

    /**
     * <p>
     * This is the ID of the creation request.
     * </p>
     * <p>
     * This parameter is optional. If used, this parameter must contain 1 to 50 alphanumeric or '-_.' characters.
     * </p>
     * 
     * @param creatorRequestId
     *        This is the ID of the creation request.</p>
     *        <p>
     *        This parameter is optional. If used, this parameter must contain 1 to 50 alphanumeric or '-_.' characters.
     */

    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * <p>
     * This is the ID of the creation request.
     * </p>
     * <p>
     * This parameter is optional. If used, this parameter must contain 1 to 50 alphanumeric or '-_.' characters.
     * </p>
     * 
     * @return This is the ID of the creation request.</p>
     *         <p>
     *         This parameter is optional. If used, this parameter must contain 1 to 50 alphanumeric or '-_.'
     *         characters.
     */

    public String getCreatorRequestId() {
        return this.creatorRequestId;
    }

    /**
     * <p>
     * This is the ID of the creation request.
     * </p>
     * <p>
     * This parameter is optional. If used, this parameter must contain 1 to 50 alphanumeric or '-_.' characters.
     * </p>
     * 
     * @param creatorRequestId
     *        This is the ID of the creation request.</p>
     *        <p>
     *        This parameter is optional. If used, this parameter must contain 1 to 50 alphanumeric or '-_.' characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLogicallyAirGappedBackupVaultRequest withCreatorRequestId(String creatorRequestId) {
        setCreatorRequestId(creatorRequestId);
        return this;
    }

    /**
     * <p>
     * This setting specifies the minimum retention period that the vault retains its recovery points. If this parameter
     * is not specified, no minimum retention period is enforced.
     * </p>
     * <p>
     * If specified, any backup or copy job to the vault must have a lifecycle policy with a retention period equal to
     * or longer than the minimum retention period. If a job retention period is shorter than that minimum retention
     * period, then the vault fails the backup or copy job, and you should either modify your lifecycle settings or use
     * a different vault.
     * </p>
     * 
     * @param minRetentionDays
     *        This setting specifies the minimum retention period that the vault retains its recovery points. If this
     *        parameter is not specified, no minimum retention period is enforced.</p>
     *        <p>
     *        If specified, any backup or copy job to the vault must have a lifecycle policy with a retention period
     *        equal to or longer than the minimum retention period. If a job retention period is shorter than that
     *        minimum retention period, then the vault fails the backup or copy job, and you should either modify your
     *        lifecycle settings or use a different vault.
     */

    public void setMinRetentionDays(Long minRetentionDays) {
        this.minRetentionDays = minRetentionDays;
    }

    /**
     * <p>
     * This setting specifies the minimum retention period that the vault retains its recovery points. If this parameter
     * is not specified, no minimum retention period is enforced.
     * </p>
     * <p>
     * If specified, any backup or copy job to the vault must have a lifecycle policy with a retention period equal to
     * or longer than the minimum retention period. If a job retention period is shorter than that minimum retention
     * period, then the vault fails the backup or copy job, and you should either modify your lifecycle settings or use
     * a different vault.
     * </p>
     * 
     * @return This setting specifies the minimum retention period that the vault retains its recovery points. If this
     *         parameter is not specified, no minimum retention period is enforced.</p>
     *         <p>
     *         If specified, any backup or copy job to the vault must have a lifecycle policy with a retention period
     *         equal to or longer than the minimum retention period. If a job retention period is shorter than that
     *         minimum retention period, then the vault fails the backup or copy job, and you should either modify your
     *         lifecycle settings or use a different vault.
     */

    public Long getMinRetentionDays() {
        return this.minRetentionDays;
    }

    /**
     * <p>
     * This setting specifies the minimum retention period that the vault retains its recovery points. If this parameter
     * is not specified, no minimum retention period is enforced.
     * </p>
     * <p>
     * If specified, any backup or copy job to the vault must have a lifecycle policy with a retention period equal to
     * or longer than the minimum retention period. If a job retention period is shorter than that minimum retention
     * period, then the vault fails the backup or copy job, and you should either modify your lifecycle settings or use
     * a different vault.
     * </p>
     * 
     * @param minRetentionDays
     *        This setting specifies the minimum retention period that the vault retains its recovery points. If this
     *        parameter is not specified, no minimum retention period is enforced.</p>
     *        <p>
     *        If specified, any backup or copy job to the vault must have a lifecycle policy with a retention period
     *        equal to or longer than the minimum retention period. If a job retention period is shorter than that
     *        minimum retention period, then the vault fails the backup or copy job, and you should either modify your
     *        lifecycle settings or use a different vault.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLogicallyAirGappedBackupVaultRequest withMinRetentionDays(Long minRetentionDays) {
        setMinRetentionDays(minRetentionDays);
        return this;
    }

    /**
     * <p>
     * This is the setting that specifies the maximum retention period that the vault retains its recovery points. If
     * this parameter is not specified, Backup does not enforce a maximum retention period on the recovery points in the
     * vault (allowing indefinite storage).
     * </p>
     * <p>
     * If specified, any backup or copy job to the vault must have a lifecycle policy with a retention period equal to
     * or shorter than the maximum retention period. If the job retention period is longer than that maximum retention
     * period, then the vault fails the backup or copy job, and you should either modify your lifecycle settings or use
     * a different vault.
     * </p>
     * 
     * @param maxRetentionDays
     *        This is the setting that specifies the maximum retention period that the vault retains its recovery
     *        points. If this parameter is not specified, Backup does not enforce a maximum retention period on the
     *        recovery points in the vault (allowing indefinite storage).</p>
     *        <p>
     *        If specified, any backup or copy job to the vault must have a lifecycle policy with a retention period
     *        equal to or shorter than the maximum retention period. If the job retention period is longer than that
     *        maximum retention period, then the vault fails the backup or copy job, and you should either modify your
     *        lifecycle settings or use a different vault.
     */

    public void setMaxRetentionDays(Long maxRetentionDays) {
        this.maxRetentionDays = maxRetentionDays;
    }

    /**
     * <p>
     * This is the setting that specifies the maximum retention period that the vault retains its recovery points. If
     * this parameter is not specified, Backup does not enforce a maximum retention period on the recovery points in the
     * vault (allowing indefinite storage).
     * </p>
     * <p>
     * If specified, any backup or copy job to the vault must have a lifecycle policy with a retention period equal to
     * or shorter than the maximum retention period. If the job retention period is longer than that maximum retention
     * period, then the vault fails the backup or copy job, and you should either modify your lifecycle settings or use
     * a different vault.
     * </p>
     * 
     * @return This is the setting that specifies the maximum retention period that the vault retains its recovery
     *         points. If this parameter is not specified, Backup does not enforce a maximum retention period on the
     *         recovery points in the vault (allowing indefinite storage).</p>
     *         <p>
     *         If specified, any backup or copy job to the vault must have a lifecycle policy with a retention period
     *         equal to or shorter than the maximum retention period. If the job retention period is longer than that
     *         maximum retention period, then the vault fails the backup or copy job, and you should either modify your
     *         lifecycle settings or use a different vault.
     */

    public Long getMaxRetentionDays() {
        return this.maxRetentionDays;
    }

    /**
     * <p>
     * This is the setting that specifies the maximum retention period that the vault retains its recovery points. If
     * this parameter is not specified, Backup does not enforce a maximum retention period on the recovery points in the
     * vault (allowing indefinite storage).
     * </p>
     * <p>
     * If specified, any backup or copy job to the vault must have a lifecycle policy with a retention period equal to
     * or shorter than the maximum retention period. If the job retention period is longer than that maximum retention
     * period, then the vault fails the backup or copy job, and you should either modify your lifecycle settings or use
     * a different vault.
     * </p>
     * 
     * @param maxRetentionDays
     *        This is the setting that specifies the maximum retention period that the vault retains its recovery
     *        points. If this parameter is not specified, Backup does not enforce a maximum retention period on the
     *        recovery points in the vault (allowing indefinite storage).</p>
     *        <p>
     *        If specified, any backup or copy job to the vault must have a lifecycle policy with a retention period
     *        equal to or shorter than the maximum retention period. If the job retention period is longer than that
     *        maximum retention period, then the vault fails the backup or copy job, and you should either modify your
     *        lifecycle settings or use a different vault.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLogicallyAirGappedBackupVaultRequest withMaxRetentionDays(Long maxRetentionDays) {
        setMaxRetentionDays(maxRetentionDays);
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
        if (getBackupVaultTags() != null)
            sb.append("BackupVaultTags: ").append("***Sensitive Data Redacted***").append(",");
        if (getCreatorRequestId() != null)
            sb.append("CreatorRequestId: ").append(getCreatorRequestId()).append(",");
        if (getMinRetentionDays() != null)
            sb.append("MinRetentionDays: ").append(getMinRetentionDays()).append(",");
        if (getMaxRetentionDays() != null)
            sb.append("MaxRetentionDays: ").append(getMaxRetentionDays());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLogicallyAirGappedBackupVaultRequest == false)
            return false;
        CreateLogicallyAirGappedBackupVaultRequest other = (CreateLogicallyAirGappedBackupVaultRequest) obj;
        if (other.getBackupVaultName() == null ^ this.getBackupVaultName() == null)
            return false;
        if (other.getBackupVaultName() != null && other.getBackupVaultName().equals(this.getBackupVaultName()) == false)
            return false;
        if (other.getBackupVaultTags() == null ^ this.getBackupVaultTags() == null)
            return false;
        if (other.getBackupVaultTags() != null && other.getBackupVaultTags().equals(this.getBackupVaultTags()) == false)
            return false;
        if (other.getCreatorRequestId() == null ^ this.getCreatorRequestId() == null)
            return false;
        if (other.getCreatorRequestId() != null && other.getCreatorRequestId().equals(this.getCreatorRequestId()) == false)
            return false;
        if (other.getMinRetentionDays() == null ^ this.getMinRetentionDays() == null)
            return false;
        if (other.getMinRetentionDays() != null && other.getMinRetentionDays().equals(this.getMinRetentionDays()) == false)
            return false;
        if (other.getMaxRetentionDays() == null ^ this.getMaxRetentionDays() == null)
            return false;
        if (other.getMaxRetentionDays() != null && other.getMaxRetentionDays().equals(this.getMaxRetentionDays()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupVaultName() == null) ? 0 : getBackupVaultName().hashCode());
        hashCode = prime * hashCode + ((getBackupVaultTags() == null) ? 0 : getBackupVaultTags().hashCode());
        hashCode = prime * hashCode + ((getCreatorRequestId() == null) ? 0 : getCreatorRequestId().hashCode());
        hashCode = prime * hashCode + ((getMinRetentionDays() == null) ? 0 : getMinRetentionDays().hashCode());
        hashCode = prime * hashCode + ((getMaxRetentionDays() == null) ? 0 : getMaxRetentionDays().hashCode());
        return hashCode;
    }

    @Override
    public CreateLogicallyAirGappedBackupVaultRequest clone() {
        return (CreateLogicallyAirGappedBackupVaultRequest) super.clone();
    }

}
