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
 * Provides details about an array of <code>BackupRule</code> objects, each of which specifies a scheduled task that is
 * used to back up a selection of resources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsBackupBackupPlanRuleDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsBackupBackupPlanRuleDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique
     * to the Amazon Web Services account used to create them and the Amazon Web Services Region where they are created.
     * They consist of letters, numbers, and hyphens.
     * </p>
     */
    private String targetBackupVault;
    /**
     * <p>
     * A value in minutes after a backup is scheduled before a job will be canceled if it doesn't start successfully.
     * </p>
     */
    private Long startWindowMinutes;
    /**
     * <p>
     * A cron expression in UTC specifying when Backup initiates a backup job.
     * </p>
     */
    private String scheduleExpression;
    /**
     * <p>
     * A display name for a backup rule. Must contain 1 to 50 alphanumeric or '-_.' characters.
     * </p>
     */
    private String ruleName;
    /**
     * <p>
     * Uniquely identifies a rule that is used to schedule the backup of a selection of resources.
     * </p>
     */
    private String ruleId;
    /**
     * <p>
     * Specifies whether Backup creates continuous backups capable of point-in-time restore (PITR).
     * </p>
     */
    private Boolean enableContinuousBackup;
    /**
     * <p>
     * A value in minutes after a backup job is successfully started before it must be completed, or it is canceled by
     * Backup.
     * </p>
     */
    private Long completionWindowMinutes;
    /**
     * <p>
     * An array of <code>CopyAction</code> objects, each of which contains details of the copy operation.
     * </p>
     */
    private java.util.List<AwsBackupBackupPlanRuleCopyActionsDetails> copyActions;
    /**
     * <p>
     * Defines when a protected resource is transitioned to cold storage and when it expires. Backup transitions and
     * expires backups automatically according to the lifecycle that you define. If you do not specify a lifecycle,
     * Backup applies the lifecycle policy of the source backup to the destination backup.
     * </p>
     * <p>
     * Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days.
     * </p>
     */
    private AwsBackupBackupPlanLifecycleDetails lifecycle;

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique
     * to the Amazon Web Services account used to create them and the Amazon Web Services Region where they are created.
     * They consist of letters, numbers, and hyphens.
     * </p>
     * 
     * @param targetBackupVault
     *        The name of a logical container where backups are stored. Backup vaults are identified by names that are
     *        unique to the Amazon Web Services account used to create them and the Amazon Web Services Region where
     *        they are created. They consist of letters, numbers, and hyphens.
     */

    public void setTargetBackupVault(String targetBackupVault) {
        this.targetBackupVault = targetBackupVault;
    }

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique
     * to the Amazon Web Services account used to create them and the Amazon Web Services Region where they are created.
     * They consist of letters, numbers, and hyphens.
     * </p>
     * 
     * @return The name of a logical container where backups are stored. Backup vaults are identified by names that are
     *         unique to the Amazon Web Services account used to create them and the Amazon Web Services Region where
     *         they are created. They consist of letters, numbers, and hyphens.
     */

    public String getTargetBackupVault() {
        return this.targetBackupVault;
    }

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique
     * to the Amazon Web Services account used to create them and the Amazon Web Services Region where they are created.
     * They consist of letters, numbers, and hyphens.
     * </p>
     * 
     * @param targetBackupVault
     *        The name of a logical container where backups are stored. Backup vaults are identified by names that are
     *        unique to the Amazon Web Services account used to create them and the Amazon Web Services Region where
     *        they are created. They consist of letters, numbers, and hyphens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupBackupPlanRuleDetails withTargetBackupVault(String targetBackupVault) {
        setTargetBackupVault(targetBackupVault);
        return this;
    }

    /**
     * <p>
     * A value in minutes after a backup is scheduled before a job will be canceled if it doesn't start successfully.
     * </p>
     * 
     * @param startWindowMinutes
     *        A value in minutes after a backup is scheduled before a job will be canceled if it doesn't start
     *        successfully.
     */

    public void setStartWindowMinutes(Long startWindowMinutes) {
        this.startWindowMinutes = startWindowMinutes;
    }

    /**
     * <p>
     * A value in minutes after a backup is scheduled before a job will be canceled if it doesn't start successfully.
     * </p>
     * 
     * @return A value in minutes after a backup is scheduled before a job will be canceled if it doesn't start
     *         successfully.
     */

    public Long getStartWindowMinutes() {
        return this.startWindowMinutes;
    }

    /**
     * <p>
     * A value in minutes after a backup is scheduled before a job will be canceled if it doesn't start successfully.
     * </p>
     * 
     * @param startWindowMinutes
     *        A value in minutes after a backup is scheduled before a job will be canceled if it doesn't start
     *        successfully.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupBackupPlanRuleDetails withStartWindowMinutes(Long startWindowMinutes) {
        setStartWindowMinutes(startWindowMinutes);
        return this;
    }

    /**
     * <p>
     * A cron expression in UTC specifying when Backup initiates a backup job.
     * </p>
     * 
     * @param scheduleExpression
     *        A cron expression in UTC specifying when Backup initiates a backup job.
     */

    public void setScheduleExpression(String scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
    }

    /**
     * <p>
     * A cron expression in UTC specifying when Backup initiates a backup job.
     * </p>
     * 
     * @return A cron expression in UTC specifying when Backup initiates a backup job.
     */

    public String getScheduleExpression() {
        return this.scheduleExpression;
    }

    /**
     * <p>
     * A cron expression in UTC specifying when Backup initiates a backup job.
     * </p>
     * 
     * @param scheduleExpression
     *        A cron expression in UTC specifying when Backup initiates a backup job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupBackupPlanRuleDetails withScheduleExpression(String scheduleExpression) {
        setScheduleExpression(scheduleExpression);
        return this;
    }

    /**
     * <p>
     * A display name for a backup rule. Must contain 1 to 50 alphanumeric or '-_.' characters.
     * </p>
     * 
     * @param ruleName
     *        A display name for a backup rule. Must contain 1 to 50 alphanumeric or '-_.' characters.
     */

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * <p>
     * A display name for a backup rule. Must contain 1 to 50 alphanumeric or '-_.' characters.
     * </p>
     * 
     * @return A display name for a backup rule. Must contain 1 to 50 alphanumeric or '-_.' characters.
     */

    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * <p>
     * A display name for a backup rule. Must contain 1 to 50 alphanumeric or '-_.' characters.
     * </p>
     * 
     * @param ruleName
     *        A display name for a backup rule. Must contain 1 to 50 alphanumeric or '-_.' characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupBackupPlanRuleDetails withRuleName(String ruleName) {
        setRuleName(ruleName);
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

    public AwsBackupBackupPlanRuleDetails withRuleId(String ruleId) {
        setRuleId(ruleId);
        return this;
    }

    /**
     * <p>
     * Specifies whether Backup creates continuous backups capable of point-in-time restore (PITR).
     * </p>
     * 
     * @param enableContinuousBackup
     *        Specifies whether Backup creates continuous backups capable of point-in-time restore (PITR).
     */

    public void setEnableContinuousBackup(Boolean enableContinuousBackup) {
        this.enableContinuousBackup = enableContinuousBackup;
    }

    /**
     * <p>
     * Specifies whether Backup creates continuous backups capable of point-in-time restore (PITR).
     * </p>
     * 
     * @return Specifies whether Backup creates continuous backups capable of point-in-time restore (PITR).
     */

    public Boolean getEnableContinuousBackup() {
        return this.enableContinuousBackup;
    }

    /**
     * <p>
     * Specifies whether Backup creates continuous backups capable of point-in-time restore (PITR).
     * </p>
     * 
     * @param enableContinuousBackup
     *        Specifies whether Backup creates continuous backups capable of point-in-time restore (PITR).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupBackupPlanRuleDetails withEnableContinuousBackup(Boolean enableContinuousBackup) {
        setEnableContinuousBackup(enableContinuousBackup);
        return this;
    }

    /**
     * <p>
     * Specifies whether Backup creates continuous backups capable of point-in-time restore (PITR).
     * </p>
     * 
     * @return Specifies whether Backup creates continuous backups capable of point-in-time restore (PITR).
     */

    public Boolean isEnableContinuousBackup() {
        return this.enableContinuousBackup;
    }

    /**
     * <p>
     * A value in minutes after a backup job is successfully started before it must be completed, or it is canceled by
     * Backup.
     * </p>
     * 
     * @param completionWindowMinutes
     *        A value in minutes after a backup job is successfully started before it must be completed, or it is
     *        canceled by Backup.
     */

    public void setCompletionWindowMinutes(Long completionWindowMinutes) {
        this.completionWindowMinutes = completionWindowMinutes;
    }

    /**
     * <p>
     * A value in minutes after a backup job is successfully started before it must be completed, or it is canceled by
     * Backup.
     * </p>
     * 
     * @return A value in minutes after a backup job is successfully started before it must be completed, or it is
     *         canceled by Backup.
     */

    public Long getCompletionWindowMinutes() {
        return this.completionWindowMinutes;
    }

    /**
     * <p>
     * A value in minutes after a backup job is successfully started before it must be completed, or it is canceled by
     * Backup.
     * </p>
     * 
     * @param completionWindowMinutes
     *        A value in minutes after a backup job is successfully started before it must be completed, or it is
     *        canceled by Backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupBackupPlanRuleDetails withCompletionWindowMinutes(Long completionWindowMinutes) {
        setCompletionWindowMinutes(completionWindowMinutes);
        return this;
    }

    /**
     * <p>
     * An array of <code>CopyAction</code> objects, each of which contains details of the copy operation.
     * </p>
     * 
     * @return An array of <code>CopyAction</code> objects, each of which contains details of the copy operation.
     */

    public java.util.List<AwsBackupBackupPlanRuleCopyActionsDetails> getCopyActions() {
        return copyActions;
    }

    /**
     * <p>
     * An array of <code>CopyAction</code> objects, each of which contains details of the copy operation.
     * </p>
     * 
     * @param copyActions
     *        An array of <code>CopyAction</code> objects, each of which contains details of the copy operation.
     */

    public void setCopyActions(java.util.Collection<AwsBackupBackupPlanRuleCopyActionsDetails> copyActions) {
        if (copyActions == null) {
            this.copyActions = null;
            return;
        }

        this.copyActions = new java.util.ArrayList<AwsBackupBackupPlanRuleCopyActionsDetails>(copyActions);
    }

    /**
     * <p>
     * An array of <code>CopyAction</code> objects, each of which contains details of the copy operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCopyActions(java.util.Collection)} or {@link #withCopyActions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param copyActions
     *        An array of <code>CopyAction</code> objects, each of which contains details of the copy operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupBackupPlanRuleDetails withCopyActions(AwsBackupBackupPlanRuleCopyActionsDetails... copyActions) {
        if (this.copyActions == null) {
            setCopyActions(new java.util.ArrayList<AwsBackupBackupPlanRuleCopyActionsDetails>(copyActions.length));
        }
        for (AwsBackupBackupPlanRuleCopyActionsDetails ele : copyActions) {
            this.copyActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>CopyAction</code> objects, each of which contains details of the copy operation.
     * </p>
     * 
     * @param copyActions
     *        An array of <code>CopyAction</code> objects, each of which contains details of the copy operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupBackupPlanRuleDetails withCopyActions(java.util.Collection<AwsBackupBackupPlanRuleCopyActionsDetails> copyActions) {
        setCopyActions(copyActions);
        return this;
    }

    /**
     * <p>
     * Defines when a protected resource is transitioned to cold storage and when it expires. Backup transitions and
     * expires backups automatically according to the lifecycle that you define. If you do not specify a lifecycle,
     * Backup applies the lifecycle policy of the source backup to the destination backup.
     * </p>
     * <p>
     * Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days.
     * </p>
     * 
     * @param lifecycle
     *        Defines when a protected resource is transitioned to cold storage and when it expires. Backup transitions
     *        and expires backups automatically according to the lifecycle that you define. If you do not specify a
     *        lifecycle, Backup applies the lifecycle policy of the source backup to the destination backup.</p>
     *        <p>
     *        Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days.
     */

    public void setLifecycle(AwsBackupBackupPlanLifecycleDetails lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * <p>
     * Defines when a protected resource is transitioned to cold storage and when it expires. Backup transitions and
     * expires backups automatically according to the lifecycle that you define. If you do not specify a lifecycle,
     * Backup applies the lifecycle policy of the source backup to the destination backup.
     * </p>
     * <p>
     * Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days.
     * </p>
     * 
     * @return Defines when a protected resource is transitioned to cold storage and when it expires. Backup transitions
     *         and expires backups automatically according to the lifecycle that you define. If you do not specify a
     *         lifecycle, Backup applies the lifecycle policy of the source backup to the destination backup.</p>
     *         <p>
     *         Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days.
     */

    public AwsBackupBackupPlanLifecycleDetails getLifecycle() {
        return this.lifecycle;
    }

    /**
     * <p>
     * Defines when a protected resource is transitioned to cold storage and when it expires. Backup transitions and
     * expires backups automatically according to the lifecycle that you define. If you do not specify a lifecycle,
     * Backup applies the lifecycle policy of the source backup to the destination backup.
     * </p>
     * <p>
     * Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days.
     * </p>
     * 
     * @param lifecycle
     *        Defines when a protected resource is transitioned to cold storage and when it expires. Backup transitions
     *        and expires backups automatically according to the lifecycle that you define. If you do not specify a
     *        lifecycle, Backup applies the lifecycle policy of the source backup to the destination backup.</p>
     *        <p>
     *        Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsBackupBackupPlanRuleDetails withLifecycle(AwsBackupBackupPlanLifecycleDetails lifecycle) {
        setLifecycle(lifecycle);
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
        if (getTargetBackupVault() != null)
            sb.append("TargetBackupVault: ").append(getTargetBackupVault()).append(",");
        if (getStartWindowMinutes() != null)
            sb.append("StartWindowMinutes: ").append(getStartWindowMinutes()).append(",");
        if (getScheduleExpression() != null)
            sb.append("ScheduleExpression: ").append(getScheduleExpression()).append(",");
        if (getRuleName() != null)
            sb.append("RuleName: ").append(getRuleName()).append(",");
        if (getRuleId() != null)
            sb.append("RuleId: ").append(getRuleId()).append(",");
        if (getEnableContinuousBackup() != null)
            sb.append("EnableContinuousBackup: ").append(getEnableContinuousBackup()).append(",");
        if (getCompletionWindowMinutes() != null)
            sb.append("CompletionWindowMinutes: ").append(getCompletionWindowMinutes()).append(",");
        if (getCopyActions() != null)
            sb.append("CopyActions: ").append(getCopyActions()).append(",");
        if (getLifecycle() != null)
            sb.append("Lifecycle: ").append(getLifecycle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsBackupBackupPlanRuleDetails == false)
            return false;
        AwsBackupBackupPlanRuleDetails other = (AwsBackupBackupPlanRuleDetails) obj;
        if (other.getTargetBackupVault() == null ^ this.getTargetBackupVault() == null)
            return false;
        if (other.getTargetBackupVault() != null && other.getTargetBackupVault().equals(this.getTargetBackupVault()) == false)
            return false;
        if (other.getStartWindowMinutes() == null ^ this.getStartWindowMinutes() == null)
            return false;
        if (other.getStartWindowMinutes() != null && other.getStartWindowMinutes().equals(this.getStartWindowMinutes()) == false)
            return false;
        if (other.getScheduleExpression() == null ^ this.getScheduleExpression() == null)
            return false;
        if (other.getScheduleExpression() != null && other.getScheduleExpression().equals(this.getScheduleExpression()) == false)
            return false;
        if (other.getRuleName() == null ^ this.getRuleName() == null)
            return false;
        if (other.getRuleName() != null && other.getRuleName().equals(this.getRuleName()) == false)
            return false;
        if (other.getRuleId() == null ^ this.getRuleId() == null)
            return false;
        if (other.getRuleId() != null && other.getRuleId().equals(this.getRuleId()) == false)
            return false;
        if (other.getEnableContinuousBackup() == null ^ this.getEnableContinuousBackup() == null)
            return false;
        if (other.getEnableContinuousBackup() != null && other.getEnableContinuousBackup().equals(this.getEnableContinuousBackup()) == false)
            return false;
        if (other.getCompletionWindowMinutes() == null ^ this.getCompletionWindowMinutes() == null)
            return false;
        if (other.getCompletionWindowMinutes() != null && other.getCompletionWindowMinutes().equals(this.getCompletionWindowMinutes()) == false)
            return false;
        if (other.getCopyActions() == null ^ this.getCopyActions() == null)
            return false;
        if (other.getCopyActions() != null && other.getCopyActions().equals(this.getCopyActions()) == false)
            return false;
        if (other.getLifecycle() == null ^ this.getLifecycle() == null)
            return false;
        if (other.getLifecycle() != null && other.getLifecycle().equals(this.getLifecycle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetBackupVault() == null) ? 0 : getTargetBackupVault().hashCode());
        hashCode = prime * hashCode + ((getStartWindowMinutes() == null) ? 0 : getStartWindowMinutes().hashCode());
        hashCode = prime * hashCode + ((getScheduleExpression() == null) ? 0 : getScheduleExpression().hashCode());
        hashCode = prime * hashCode + ((getRuleName() == null) ? 0 : getRuleName().hashCode());
        hashCode = prime * hashCode + ((getRuleId() == null) ? 0 : getRuleId().hashCode());
        hashCode = prime * hashCode + ((getEnableContinuousBackup() == null) ? 0 : getEnableContinuousBackup().hashCode());
        hashCode = prime * hashCode + ((getCompletionWindowMinutes() == null) ? 0 : getCompletionWindowMinutes().hashCode());
        hashCode = prime * hashCode + ((getCopyActions() == null) ? 0 : getCopyActions().hashCode());
        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        return hashCode;
    }

    @Override
    public AwsBackupBackupPlanRuleDetails clone() {
        try {
            return (AwsBackupBackupPlanRuleDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsBackupBackupPlanRuleDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
