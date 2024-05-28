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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/UpdateQueue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateQueueRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The storage profile IDs to add.
     * </p>
     */
    private java.util.List<String> allowedStorageProfileIdsToAdd;
    /**
     * <p>
     * The storage profile ID to remove.
     * </p>
     */
    private java.util.List<String> allowedStorageProfileIdsToRemove;
    /**
     * <p>
     * The idempotency token to update in the queue.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The default action to take for a queue update if a budget isn't configured.
     * </p>
     */
    private String defaultBudgetAction;
    /**
     * <p>
     * The description of the queue to update.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The display name of the queue to update.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The farm ID to update in the queue.
     * </p>
     */
    private String farmId;
    /**
     * <p>
     * The job attachment settings to update for the queue.
     * </p>
     */
    private JobAttachmentSettings jobAttachmentSettings;
    /**
     * <p>
     * Update the jobs in the queue to run as a specified POSIX user.
     * </p>
     */
    private JobRunAsUser jobRunAsUser;
    /**
     * <p>
     * The queue ID to update.
     * </p>
     */
    private String queueId;
    /**
     * <p>
     * The required file system location names to add to the queue.
     * </p>
     */
    private java.util.List<String> requiredFileSystemLocationNamesToAdd;
    /**
     * <p>
     * The required file system location names to remove from the queue.
     * </p>
     */
    private java.util.List<String> requiredFileSystemLocationNamesToRemove;
    /**
     * <p>
     * The IAM role ARN that's used to run jobs from this queue.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The storage profile IDs to add.
     * </p>
     * 
     * @return The storage profile IDs to add.
     */

    public java.util.List<String> getAllowedStorageProfileIdsToAdd() {
        return allowedStorageProfileIdsToAdd;
    }

    /**
     * <p>
     * The storage profile IDs to add.
     * </p>
     * 
     * @param allowedStorageProfileIdsToAdd
     *        The storage profile IDs to add.
     */

    public void setAllowedStorageProfileIdsToAdd(java.util.Collection<String> allowedStorageProfileIdsToAdd) {
        if (allowedStorageProfileIdsToAdd == null) {
            this.allowedStorageProfileIdsToAdd = null;
            return;
        }

        this.allowedStorageProfileIdsToAdd = new java.util.ArrayList<String>(allowedStorageProfileIdsToAdd);
    }

    /**
     * <p>
     * The storage profile IDs to add.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedStorageProfileIdsToAdd(java.util.Collection)} or
     * {@link #withAllowedStorageProfileIdsToAdd(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param allowedStorageProfileIdsToAdd
     *        The storage profile IDs to add.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQueueRequest withAllowedStorageProfileIdsToAdd(String... allowedStorageProfileIdsToAdd) {
        if (this.allowedStorageProfileIdsToAdd == null) {
            setAllowedStorageProfileIdsToAdd(new java.util.ArrayList<String>(allowedStorageProfileIdsToAdd.length));
        }
        for (String ele : allowedStorageProfileIdsToAdd) {
            this.allowedStorageProfileIdsToAdd.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The storage profile IDs to add.
     * </p>
     * 
     * @param allowedStorageProfileIdsToAdd
     *        The storage profile IDs to add.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQueueRequest withAllowedStorageProfileIdsToAdd(java.util.Collection<String> allowedStorageProfileIdsToAdd) {
        setAllowedStorageProfileIdsToAdd(allowedStorageProfileIdsToAdd);
        return this;
    }

    /**
     * <p>
     * The storage profile ID to remove.
     * </p>
     * 
     * @return The storage profile ID to remove.
     */

    public java.util.List<String> getAllowedStorageProfileIdsToRemove() {
        return allowedStorageProfileIdsToRemove;
    }

    /**
     * <p>
     * The storage profile ID to remove.
     * </p>
     * 
     * @param allowedStorageProfileIdsToRemove
     *        The storage profile ID to remove.
     */

    public void setAllowedStorageProfileIdsToRemove(java.util.Collection<String> allowedStorageProfileIdsToRemove) {
        if (allowedStorageProfileIdsToRemove == null) {
            this.allowedStorageProfileIdsToRemove = null;
            return;
        }

        this.allowedStorageProfileIdsToRemove = new java.util.ArrayList<String>(allowedStorageProfileIdsToRemove);
    }

    /**
     * <p>
     * The storage profile ID to remove.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedStorageProfileIdsToRemove(java.util.Collection)} or
     * {@link #withAllowedStorageProfileIdsToRemove(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param allowedStorageProfileIdsToRemove
     *        The storage profile ID to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQueueRequest withAllowedStorageProfileIdsToRemove(String... allowedStorageProfileIdsToRemove) {
        if (this.allowedStorageProfileIdsToRemove == null) {
            setAllowedStorageProfileIdsToRemove(new java.util.ArrayList<String>(allowedStorageProfileIdsToRemove.length));
        }
        for (String ele : allowedStorageProfileIdsToRemove) {
            this.allowedStorageProfileIdsToRemove.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The storage profile ID to remove.
     * </p>
     * 
     * @param allowedStorageProfileIdsToRemove
     *        The storage profile ID to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQueueRequest withAllowedStorageProfileIdsToRemove(java.util.Collection<String> allowedStorageProfileIdsToRemove) {
        setAllowedStorageProfileIdsToRemove(allowedStorageProfileIdsToRemove);
        return this;
    }

    /**
     * <p>
     * The idempotency token to update in the queue.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token to update in the queue.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The idempotency token to update in the queue.
     * </p>
     * 
     * @return The idempotency token to update in the queue.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The idempotency token to update in the queue.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token to update in the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQueueRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The default action to take for a queue update if a budget isn't configured.
     * </p>
     * 
     * @param defaultBudgetAction
     *        The default action to take for a queue update if a budget isn't configured.
     * @see DefaultQueueBudgetAction
     */

    public void setDefaultBudgetAction(String defaultBudgetAction) {
        this.defaultBudgetAction = defaultBudgetAction;
    }

    /**
     * <p>
     * The default action to take for a queue update if a budget isn't configured.
     * </p>
     * 
     * @return The default action to take for a queue update if a budget isn't configured.
     * @see DefaultQueueBudgetAction
     */

    public String getDefaultBudgetAction() {
        return this.defaultBudgetAction;
    }

    /**
     * <p>
     * The default action to take for a queue update if a budget isn't configured.
     * </p>
     * 
     * @param defaultBudgetAction
     *        The default action to take for a queue update if a budget isn't configured.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultQueueBudgetAction
     */

    public UpdateQueueRequest withDefaultBudgetAction(String defaultBudgetAction) {
        setDefaultBudgetAction(defaultBudgetAction);
        return this;
    }

    /**
     * <p>
     * The default action to take for a queue update if a budget isn't configured.
     * </p>
     * 
     * @param defaultBudgetAction
     *        The default action to take for a queue update if a budget isn't configured.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultQueueBudgetAction
     */

    public UpdateQueueRequest withDefaultBudgetAction(DefaultQueueBudgetAction defaultBudgetAction) {
        this.defaultBudgetAction = defaultBudgetAction.toString();
        return this;
    }

    /**
     * <p>
     * The description of the queue to update.
     * </p>
     * 
     * @param description
     *        The description of the queue to update.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the queue to update.
     * </p>
     * 
     * @return The description of the queue to update.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the queue to update.
     * </p>
     * 
     * @param description
     *        The description of the queue to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQueueRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The display name of the queue to update.
     * </p>
     * 
     * @param displayName
     *        The display name of the queue to update.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the queue to update.
     * </p>
     * 
     * @return The display name of the queue to update.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name of the queue to update.
     * </p>
     * 
     * @param displayName
     *        The display name of the queue to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQueueRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The farm ID to update in the queue.
     * </p>
     * 
     * @param farmId
     *        The farm ID to update in the queue.
     */

    public void setFarmId(String farmId) {
        this.farmId = farmId;
    }

    /**
     * <p>
     * The farm ID to update in the queue.
     * </p>
     * 
     * @return The farm ID to update in the queue.
     */

    public String getFarmId() {
        return this.farmId;
    }

    /**
     * <p>
     * The farm ID to update in the queue.
     * </p>
     * 
     * @param farmId
     *        The farm ID to update in the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQueueRequest withFarmId(String farmId) {
        setFarmId(farmId);
        return this;
    }

    /**
     * <p>
     * The job attachment settings to update for the queue.
     * </p>
     * 
     * @param jobAttachmentSettings
     *        The job attachment settings to update for the queue.
     */

    public void setJobAttachmentSettings(JobAttachmentSettings jobAttachmentSettings) {
        this.jobAttachmentSettings = jobAttachmentSettings;
    }

    /**
     * <p>
     * The job attachment settings to update for the queue.
     * </p>
     * 
     * @return The job attachment settings to update for the queue.
     */

    public JobAttachmentSettings getJobAttachmentSettings() {
        return this.jobAttachmentSettings;
    }

    /**
     * <p>
     * The job attachment settings to update for the queue.
     * </p>
     * 
     * @param jobAttachmentSettings
     *        The job attachment settings to update for the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQueueRequest withJobAttachmentSettings(JobAttachmentSettings jobAttachmentSettings) {
        setJobAttachmentSettings(jobAttachmentSettings);
        return this;
    }

    /**
     * <p>
     * Update the jobs in the queue to run as a specified POSIX user.
     * </p>
     * 
     * @param jobRunAsUser
     *        Update the jobs in the queue to run as a specified POSIX user.
     */

    public void setJobRunAsUser(JobRunAsUser jobRunAsUser) {
        this.jobRunAsUser = jobRunAsUser;
    }

    /**
     * <p>
     * Update the jobs in the queue to run as a specified POSIX user.
     * </p>
     * 
     * @return Update the jobs in the queue to run as a specified POSIX user.
     */

    public JobRunAsUser getJobRunAsUser() {
        return this.jobRunAsUser;
    }

    /**
     * <p>
     * Update the jobs in the queue to run as a specified POSIX user.
     * </p>
     * 
     * @param jobRunAsUser
     *        Update the jobs in the queue to run as a specified POSIX user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQueueRequest withJobRunAsUser(JobRunAsUser jobRunAsUser) {
        setJobRunAsUser(jobRunAsUser);
        return this;
    }

    /**
     * <p>
     * The queue ID to update.
     * </p>
     * 
     * @param queueId
     *        The queue ID to update.
     */

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    /**
     * <p>
     * The queue ID to update.
     * </p>
     * 
     * @return The queue ID to update.
     */

    public String getQueueId() {
        return this.queueId;
    }

    /**
     * <p>
     * The queue ID to update.
     * </p>
     * 
     * @param queueId
     *        The queue ID to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQueueRequest withQueueId(String queueId) {
        setQueueId(queueId);
        return this;
    }

    /**
     * <p>
     * The required file system location names to add to the queue.
     * </p>
     * 
     * @return The required file system location names to add to the queue.
     */

    public java.util.List<String> getRequiredFileSystemLocationNamesToAdd() {
        return requiredFileSystemLocationNamesToAdd;
    }

    /**
     * <p>
     * The required file system location names to add to the queue.
     * </p>
     * 
     * @param requiredFileSystemLocationNamesToAdd
     *        The required file system location names to add to the queue.
     */

    public void setRequiredFileSystemLocationNamesToAdd(java.util.Collection<String> requiredFileSystemLocationNamesToAdd) {
        if (requiredFileSystemLocationNamesToAdd == null) {
            this.requiredFileSystemLocationNamesToAdd = null;
            return;
        }

        this.requiredFileSystemLocationNamesToAdd = new java.util.ArrayList<String>(requiredFileSystemLocationNamesToAdd);
    }

    /**
     * <p>
     * The required file system location names to add to the queue.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRequiredFileSystemLocationNamesToAdd(java.util.Collection)} or
     * {@link #withRequiredFileSystemLocationNamesToAdd(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param requiredFileSystemLocationNamesToAdd
     *        The required file system location names to add to the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQueueRequest withRequiredFileSystemLocationNamesToAdd(String... requiredFileSystemLocationNamesToAdd) {
        if (this.requiredFileSystemLocationNamesToAdd == null) {
            setRequiredFileSystemLocationNamesToAdd(new java.util.ArrayList<String>(requiredFileSystemLocationNamesToAdd.length));
        }
        for (String ele : requiredFileSystemLocationNamesToAdd) {
            this.requiredFileSystemLocationNamesToAdd.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The required file system location names to add to the queue.
     * </p>
     * 
     * @param requiredFileSystemLocationNamesToAdd
     *        The required file system location names to add to the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQueueRequest withRequiredFileSystemLocationNamesToAdd(java.util.Collection<String> requiredFileSystemLocationNamesToAdd) {
        setRequiredFileSystemLocationNamesToAdd(requiredFileSystemLocationNamesToAdd);
        return this;
    }

    /**
     * <p>
     * The required file system location names to remove from the queue.
     * </p>
     * 
     * @return The required file system location names to remove from the queue.
     */

    public java.util.List<String> getRequiredFileSystemLocationNamesToRemove() {
        return requiredFileSystemLocationNamesToRemove;
    }

    /**
     * <p>
     * The required file system location names to remove from the queue.
     * </p>
     * 
     * @param requiredFileSystemLocationNamesToRemove
     *        The required file system location names to remove from the queue.
     */

    public void setRequiredFileSystemLocationNamesToRemove(java.util.Collection<String> requiredFileSystemLocationNamesToRemove) {
        if (requiredFileSystemLocationNamesToRemove == null) {
            this.requiredFileSystemLocationNamesToRemove = null;
            return;
        }

        this.requiredFileSystemLocationNamesToRemove = new java.util.ArrayList<String>(requiredFileSystemLocationNamesToRemove);
    }

    /**
     * <p>
     * The required file system location names to remove from the queue.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRequiredFileSystemLocationNamesToRemove(java.util.Collection)} or
     * {@link #withRequiredFileSystemLocationNamesToRemove(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param requiredFileSystemLocationNamesToRemove
     *        The required file system location names to remove from the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQueueRequest withRequiredFileSystemLocationNamesToRemove(String... requiredFileSystemLocationNamesToRemove) {
        if (this.requiredFileSystemLocationNamesToRemove == null) {
            setRequiredFileSystemLocationNamesToRemove(new java.util.ArrayList<String>(requiredFileSystemLocationNamesToRemove.length));
        }
        for (String ele : requiredFileSystemLocationNamesToRemove) {
            this.requiredFileSystemLocationNamesToRemove.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The required file system location names to remove from the queue.
     * </p>
     * 
     * @param requiredFileSystemLocationNamesToRemove
     *        The required file system location names to remove from the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQueueRequest withRequiredFileSystemLocationNamesToRemove(java.util.Collection<String> requiredFileSystemLocationNamesToRemove) {
        setRequiredFileSystemLocationNamesToRemove(requiredFileSystemLocationNamesToRemove);
        return this;
    }

    /**
     * <p>
     * The IAM role ARN that's used to run jobs from this queue.
     * </p>
     * 
     * @param roleArn
     *        The IAM role ARN that's used to run jobs from this queue.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The IAM role ARN that's used to run jobs from this queue.
     * </p>
     * 
     * @return The IAM role ARN that's used to run jobs from this queue.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The IAM role ARN that's used to run jobs from this queue.
     * </p>
     * 
     * @param roleArn
     *        The IAM role ARN that's used to run jobs from this queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateQueueRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getAllowedStorageProfileIdsToAdd() != null)
            sb.append("AllowedStorageProfileIdsToAdd: ").append(getAllowedStorageProfileIdsToAdd()).append(",");
        if (getAllowedStorageProfileIdsToRemove() != null)
            sb.append("AllowedStorageProfileIdsToRemove: ").append(getAllowedStorageProfileIdsToRemove()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getDefaultBudgetAction() != null)
            sb.append("DefaultBudgetAction: ").append(getDefaultBudgetAction()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getFarmId() != null)
            sb.append("FarmId: ").append(getFarmId()).append(",");
        if (getJobAttachmentSettings() != null)
            sb.append("JobAttachmentSettings: ").append(getJobAttachmentSettings()).append(",");
        if (getJobRunAsUser() != null)
            sb.append("JobRunAsUser: ").append(getJobRunAsUser()).append(",");
        if (getQueueId() != null)
            sb.append("QueueId: ").append(getQueueId()).append(",");
        if (getRequiredFileSystemLocationNamesToAdd() != null)
            sb.append("RequiredFileSystemLocationNamesToAdd: ").append("***Sensitive Data Redacted***").append(",");
        if (getRequiredFileSystemLocationNamesToRemove() != null)
            sb.append("RequiredFileSystemLocationNamesToRemove: ").append("***Sensitive Data Redacted***").append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateQueueRequest == false)
            return false;
        UpdateQueueRequest other = (UpdateQueueRequest) obj;
        if (other.getAllowedStorageProfileIdsToAdd() == null ^ this.getAllowedStorageProfileIdsToAdd() == null)
            return false;
        if (other.getAllowedStorageProfileIdsToAdd() != null
                && other.getAllowedStorageProfileIdsToAdd().equals(this.getAllowedStorageProfileIdsToAdd()) == false)
            return false;
        if (other.getAllowedStorageProfileIdsToRemove() == null ^ this.getAllowedStorageProfileIdsToRemove() == null)
            return false;
        if (other.getAllowedStorageProfileIdsToRemove() != null
                && other.getAllowedStorageProfileIdsToRemove().equals(this.getAllowedStorageProfileIdsToRemove()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDefaultBudgetAction() == null ^ this.getDefaultBudgetAction() == null)
            return false;
        if (other.getDefaultBudgetAction() != null && other.getDefaultBudgetAction().equals(this.getDefaultBudgetAction()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getFarmId() == null ^ this.getFarmId() == null)
            return false;
        if (other.getFarmId() != null && other.getFarmId().equals(this.getFarmId()) == false)
            return false;
        if (other.getJobAttachmentSettings() == null ^ this.getJobAttachmentSettings() == null)
            return false;
        if (other.getJobAttachmentSettings() != null && other.getJobAttachmentSettings().equals(this.getJobAttachmentSettings()) == false)
            return false;
        if (other.getJobRunAsUser() == null ^ this.getJobRunAsUser() == null)
            return false;
        if (other.getJobRunAsUser() != null && other.getJobRunAsUser().equals(this.getJobRunAsUser()) == false)
            return false;
        if (other.getQueueId() == null ^ this.getQueueId() == null)
            return false;
        if (other.getQueueId() != null && other.getQueueId().equals(this.getQueueId()) == false)
            return false;
        if (other.getRequiredFileSystemLocationNamesToAdd() == null ^ this.getRequiredFileSystemLocationNamesToAdd() == null)
            return false;
        if (other.getRequiredFileSystemLocationNamesToAdd() != null
                && other.getRequiredFileSystemLocationNamesToAdd().equals(this.getRequiredFileSystemLocationNamesToAdd()) == false)
            return false;
        if (other.getRequiredFileSystemLocationNamesToRemove() == null ^ this.getRequiredFileSystemLocationNamesToRemove() == null)
            return false;
        if (other.getRequiredFileSystemLocationNamesToRemove() != null
                && other.getRequiredFileSystemLocationNamesToRemove().equals(this.getRequiredFileSystemLocationNamesToRemove()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowedStorageProfileIdsToAdd() == null) ? 0 : getAllowedStorageProfileIdsToAdd().hashCode());
        hashCode = prime * hashCode + ((getAllowedStorageProfileIdsToRemove() == null) ? 0 : getAllowedStorageProfileIdsToRemove().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDefaultBudgetAction() == null) ? 0 : getDefaultBudgetAction().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getFarmId() == null) ? 0 : getFarmId().hashCode());
        hashCode = prime * hashCode + ((getJobAttachmentSettings() == null) ? 0 : getJobAttachmentSettings().hashCode());
        hashCode = prime * hashCode + ((getJobRunAsUser() == null) ? 0 : getJobRunAsUser().hashCode());
        hashCode = prime * hashCode + ((getQueueId() == null) ? 0 : getQueueId().hashCode());
        hashCode = prime * hashCode + ((getRequiredFileSystemLocationNamesToAdd() == null) ? 0 : getRequiredFileSystemLocationNamesToAdd().hashCode());
        hashCode = prime * hashCode + ((getRequiredFileSystemLocationNamesToRemove() == null) ? 0 : getRequiredFileSystemLocationNamesToRemove().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public UpdateQueueRequest clone() {
        return (UpdateQueueRequest) super.clone();
    }

}
