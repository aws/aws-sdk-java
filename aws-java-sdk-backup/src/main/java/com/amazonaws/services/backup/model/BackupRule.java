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
 * Specifies a scheduled task used to back up a selection of resources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/BackupRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BackupRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An optional display name for a backup rule.
     * </p>
     */
    private String ruleName;
    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique
     * to the account used to create them and the AWS Region where they are created. They consist of lowercase letters,
     * numbers, and hyphens.
     * </p>
     */
    private String targetBackupVaultName;
    /**
     * <p>
     * A CRON expression specifying when AWS Backup initiates a backup job.
     * </p>
     */
    private String scheduleExpression;
    /**
     * <p>
     * An optional value that specifies a period of time in minutes after a backup is scheduled before a job is canceled
     * if it doesn't start successfully.
     * </p>
     */
    private Long startWindowMinutes;
    /**
     * <p>
     * A value in minutes after a backup job is successfully started before it must be completed or it is canceled by
     * AWS Backup. This value is optional.
     * </p>
     */
    private Long completionWindowMinutes;
    /**
     * <p>
     * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup
     * transitions and expires backups automatically according to the lifecycle that you define.
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
     * An array of key-value pair strings that are assigned to resources that are associated with this rule when
     * restored from backup.
     * </p>
     */
    private java.util.Map<String, String> recoveryPointTags;
    /**
     * <p>
     * Uniquely identifies a rule that is used to schedule the backup of a selection of resources.
     * </p>
     */
    private String ruleId;

    /**
     * <p>
     * An optional display name for a backup rule.
     * </p>
     * 
     * @param ruleName
     *        An optional display name for a backup rule.
     */

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * <p>
     * An optional display name for a backup rule.
     * </p>
     * 
     * @return An optional display name for a backup rule.
     */

    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * <p>
     * An optional display name for a backup rule.
     * </p>
     * 
     * @param ruleName
     *        An optional display name for a backup rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupRule withRuleName(String ruleName) {
        setRuleName(ruleName);
        return this;
    }

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique
     * to the account used to create them and the AWS Region where they are created. They consist of lowercase letters,
     * numbers, and hyphens.
     * </p>
     * 
     * @param targetBackupVaultName
     *        The name of a logical container where backups are stored. Backup vaults are identified by names that are
     *        unique to the account used to create them and the AWS Region where they are created. They consist of
     *        lowercase letters, numbers, and hyphens.
     */

    public void setTargetBackupVaultName(String targetBackupVaultName) {
        this.targetBackupVaultName = targetBackupVaultName;
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

    public String getTargetBackupVaultName() {
        return this.targetBackupVaultName;
    }

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique
     * to the account used to create them and the AWS Region where they are created. They consist of lowercase letters,
     * numbers, and hyphens.
     * </p>
     * 
     * @param targetBackupVaultName
     *        The name of a logical container where backups are stored. Backup vaults are identified by names that are
     *        unique to the account used to create them and the AWS Region where they are created. They consist of
     *        lowercase letters, numbers, and hyphens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupRule withTargetBackupVaultName(String targetBackupVaultName) {
        setTargetBackupVaultName(targetBackupVaultName);
        return this;
    }

    /**
     * <p>
     * A CRON expression specifying when AWS Backup initiates a backup job.
     * </p>
     * 
     * @param scheduleExpression
     *        A CRON expression specifying when AWS Backup initiates a backup job.
     */

    public void setScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
    }

    /**
     * <p>
     * A CRON expression specifying when AWS Backup initiates a backup job.
     * </p>
     * 
     * @return A CRON expression specifying when AWS Backup initiates a backup job.
     */

    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    /**
     * <p>
     * A CRON expression specifying when AWS Backup initiates a backup job.
     * </p>
     * 
     * @param scheduleExpression
     *        A CRON expression specifying when AWS Backup initiates a backup job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupRule withScheduleExpression(String scheduleExpression) {
        setScheduleExpression(scheduleExpression);
        return this;
    }

    /**
     * <p>
     * An optional value that specifies a period of time in minutes after a backup is scheduled before a job is canceled
     * if it doesn't start successfully.
     * </p>
     * 
     * @param startWindowMinutes
     *        An optional value that specifies a period of time in minutes after a backup is scheduled before a job is
     *        canceled if it doesn't start successfully.
     */

    public void setStartWindowMinutes(Long startWindowMinutes) {
        this.startWindowMinutes = startWindowMinutes;
    }

    /**
     * <p>
     * An optional value that specifies a period of time in minutes after a backup is scheduled before a job is canceled
     * if it doesn't start successfully.
     * </p>
     * 
     * @return An optional value that specifies a period of time in minutes after a backup is scheduled before a job is
     *         canceled if it doesn't start successfully.
     */

    public Long getStartWindowMinutes() {
        return this.startWindowMinutes;
    }

    /**
     * <p>
     * An optional value that specifies a period of time in minutes after a backup is scheduled before a job is canceled
     * if it doesn't start successfully.
     * </p>
     * 
     * @param startWindowMinutes
     *        An optional value that specifies a period of time in minutes after a backup is scheduled before a job is
     *        canceled if it doesn't start successfully.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupRule withStartWindowMinutes(Long startWindowMinutes) {
        setStartWindowMinutes(startWindowMinutes);
        return this;
    }

    /**
     * <p>
     * A value in minutes after a backup job is successfully started before it must be completed or it is canceled by
     * AWS Backup. This value is optional.
     * </p>
     * 
     * @param completionWindowMinutes
     *        A value in minutes after a backup job is successfully started before it must be completed or it is
     *        canceled by AWS Backup. This value is optional.
     */

    public void setCompletionWindowMinutes(Long completionWindowMinutes) {
        this.completionWindowMinutes = completionWindowMinutes;
    }

    /**
     * <p>
     * A value in minutes after a backup job is successfully started before it must be completed or it is canceled by
     * AWS Backup. This value is optional.
     * </p>
     * 
     * @return A value in minutes after a backup job is successfully started before it must be completed or it is
     *         canceled by AWS Backup. This value is optional.
     */

    public Long getCompletionWindowMinutes() {
        return this.completionWindowMinutes;
    }

    /**
     * <p>
     * A value in minutes after a backup job is successfully started before it must be completed or it is canceled by
     * AWS Backup. This value is optional.
     * </p>
     * 
     * @param completionWindowMinutes
     *        A value in minutes after a backup job is successfully started before it must be completed or it is
     *        canceled by AWS Backup. This value is optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupRule withCompletionWindowMinutes(Long completionWindowMinutes) {
        setCompletionWindowMinutes(completionWindowMinutes);
        return this;
    }

    /**
     * <p>
     * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup
     * transitions and expires backups automatically according to the lifecycle that you define.
     * </p>
     * <p>
     * Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the
     * “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The
     * “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold.
     * </p>
     * 
     * @param lifecycle
     *        The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS
     *        Backup transitions and expires backups automatically according to the lifecycle that you define. </p>
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
     * transitions and expires backups automatically according to the lifecycle that you define.
     * </p>
     * <p>
     * Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the
     * “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The
     * “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold.
     * </p>
     * 
     * @return The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS
     *         Backup transitions and expires backups automatically according to the lifecycle that you define. </p>
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
     * transitions and expires backups automatically according to the lifecycle that you define.
     * </p>
     * <p>
     * Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the
     * “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The
     * “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold.
     * </p>
     * 
     * @param lifecycle
     *        The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS
     *        Backup transitions and expires backups automatically according to the lifecycle that you define. </p>
     *        <p>
     *        Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore,
     *        the “expire after days” setting must be 90 days greater than the “transition to cold after days” setting.
     *        The “transition to cold after days” setting cannot be changed after a backup has been transitioned to
     *        cold.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupRule withLifecycle(Lifecycle lifecycle) {
        setLifecycle(lifecycle);
        return this;
    }

    /**
     * <p>
     * An array of key-value pair strings that are assigned to resources that are associated with this rule when
     * restored from backup.
     * </p>
     * 
     * @return An array of key-value pair strings that are assigned to resources that are associated with this rule when
     *         restored from backup.
     */

    public java.util.Map<String, String> getRecoveryPointTags() {
        return recoveryPointTags;
    }

    /**
     * <p>
     * An array of key-value pair strings that are assigned to resources that are associated with this rule when
     * restored from backup.
     * </p>
     * 
     * @param recoveryPointTags
     *        An array of key-value pair strings that are assigned to resources that are associated with this rule when
     *        restored from backup.
     */

    public void setRecoveryPointTags(java.util.Map<String, String> recoveryPointTags) {
        this.recoveryPointTags = recoveryPointTags;
    }

    /**
     * <p>
     * An array of key-value pair strings that are assigned to resources that are associated with this rule when
     * restored from backup.
     * </p>
     * 
     * @param recoveryPointTags
     *        An array of key-value pair strings that are assigned to resources that are associated with this rule when
     *        restored from backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupRule withRecoveryPointTags(java.util.Map<String, String> recoveryPointTags) {
        setRecoveryPointTags(recoveryPointTags);
        return this;
    }

    public BackupRule addRecoveryPointTagsEntry(String key, String value) {
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

    public BackupRule clearRecoveryPointTagsEntries() {
        this.recoveryPointTags = null;
        return this;
    }

    /**
     * <p>
     * Uniquely identifies a rule that is used to schedule the backup of a selection of resources.
     * </p>
     * 
     * @param ruleId
     *        Uniquely identifies a rule that is used to schedule the backup of a selection of resources.
     */

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * <p>
     * Uniquely identifies a rule that is used to schedule the backup of a selection of resources.
     * </p>
     * 
     * @return Uniquely identifies a rule that is used to schedule the backup of a selection of resources.
     */

    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * <p>
     * Uniquely identifies a rule that is used to schedule the backup of a selection of resources.
     * </p>
     * 
     * @param ruleId
     *        Uniquely identifies a rule that is used to schedule the backup of a selection of resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BackupRule withRuleId(String ruleId) {
        setRuleId(ruleId);
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
        if (getRuleName() != null)
            sb.append("RuleName: ").append(getRuleName()).append(",");
        if (getTargetBackupVaultName() != null)
            sb.append("TargetBackupVaultName: ").append(getTargetBackupVaultName()).append(",");
        if (getScheduleExpression() != null)
            sb.append("ScheduleExpression: ").append(getScheduleExpression()).append(",");
        if (getStartWindowMinutes() != null)
            sb.append("StartWindowMinutes: ").append(getStartWindowMinutes()).append(",");
        if (getCompletionWindowMinutes() != null)
            sb.append("CompletionWindowMinutes: ").append(getCompletionWindowMinutes()).append(",");
        if (getLifecycle() != null)
            sb.append("Lifecycle: ").append(getLifecycle()).append(",");
        if (getRecoveryPointTags() != null)
            sb.append("RecoveryPointTags: ").append("***Sensitive Data Redacted***").append(",");
        if (getRuleId() != null)
            sb.append("RuleId: ").append(getRuleId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BackupRule == false)
            return false;
        BackupRule other = (BackupRule) obj;
        if (other.getRuleName() == null ^ this.getRuleName() == null)
            return false;
        if (other.getRuleName() != null && other.getRuleName().equals(this.getRuleName()) == false)
            return false;
        if (other.getTargetBackupVaultName() == null ^ this.getTargetBackupVaultName() == null)
            return false;
        if (other.getTargetBackupVaultName() != null && other.getTargetBackupVaultName().equals(this.getTargetBackupVaultName()) == false)
            return false;
        if (other.getScheduleExpression() == null ^ this.getScheduleExpression() == null)
            return false;
        if (other.getScheduleExpression() != null && other.getScheduleExpression().equals(this.getScheduleExpression()) == false)
            return false;
        if (other.getStartWindowMinutes() == null ^ this.getStartWindowMinutes() == null)
            return false;
        if (other.getStartWindowMinutes() != null && other.getStartWindowMinutes().equals(this.getStartWindowMinutes()) == false)
            return false;
        if (other.getCompletionWindowMinutes() == null ^ this.getCompletionWindowMinutes() == null)
            return false;
        if (other.getCompletionWindowMinutes() != null && other.getCompletionWindowMinutes().equals(this.getCompletionWindowMinutes()) == false)
            return false;
        if (other.getLifecycle() == null ^ this.getLifecycle() == null)
            return false;
        if (other.getLifecycle() != null && other.getLifecycle().equals(this.getLifecycle()) == false)
            return false;
        if (other.getRecoveryPointTags() == null ^ this.getRecoveryPointTags() == null)
            return false;
        if (other.getRecoveryPointTags() != null && other.getRecoveryPointTags().equals(this.getRecoveryPointTags()) == false)
            return false;
        if (other.getRuleId() == null ^ this.getRuleId() == null)
            return false;
        if (other.getRuleId() != null && other.getRuleId().equals(this.getRuleId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleName() == null) ? 0 : getRuleName().hashCode());
        hashCode = prime * hashCode + ((getTargetBackupVaultName() == null) ? 0 : getTargetBackupVaultName().hashCode());
        hashCode = prime * hashCode + ((getScheduleExpression() == null) ? 0 : getScheduleExpression().hashCode());
        hashCode = prime * hashCode + ((getStartWindowMinutes() == null) ? 0 : getStartWindowMinutes().hashCode());
        hashCode = prime * hashCode + ((getCompletionWindowMinutes() == null) ? 0 : getCompletionWindowMinutes().hashCode());
        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        hashCode = prime * hashCode + ((getRecoveryPointTags() == null) ? 0 : getRecoveryPointTags().hashCode());
        hashCode = prime * hashCode + ((getRuleId() == null) ? 0 : getRuleId().hashCode());
        return hashCode;
    }

    @Override
    public BackupRule clone() {
        try {
            return (BackupRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backup.model.transform.BackupRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
