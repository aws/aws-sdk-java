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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetQueue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetQueueResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The storage profile IDs for the queue.
     * </p>
     */
    private java.util.List<String> allowedStorageProfileIds;
    /**
     * <p>
     * The reason the queue was blocked.
     * </p>
     */
    private String blockedReason;
    /**
     * <p>
     * The date and time the resource was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The user or system that created this resource.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The default action taken on a queue if a budget wasn't configured.
     * </p>
     */
    private String defaultBudgetAction;
    /**
     * <p>
     * The description of the queue.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The display name of the queue.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The farm ID for the queue.
     * </p>
     */
    private String farmId;
    /**
     * <p>
     * The job attachment settings for the queue.
     * </p>
     */
    private JobAttachmentSettings jobAttachmentSettings;
    /**
     * <p>
     * The jobs in the queue ran as this specified POSIX user.
     * </p>
     */
    private JobRunAsUser jobRunAsUser;
    /**
     * <p>
     * The queue ID.
     * </p>
     */
    private String queueId;
    /**
     * <p>
     * A list of the required file system location names in the queue.
     * </p>
     */
    private java.util.List<String> requiredFileSystemLocationNames;
    /**
     * <p>
     * The IAM role ARN.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The status of the queue.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>–The queue is active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SCHEDULING</code>–The queue is scheduling.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SCHEDULING_BLOCKED</code>–The queue scheduling is blocked. See the provided reason.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The date and time the resource was updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The user or system that updated this resource.
     * </p>
     */
    private String updatedBy;

    /**
     * <p>
     * The storage profile IDs for the queue.
     * </p>
     * 
     * @return The storage profile IDs for the queue.
     */

    public java.util.List<String> getAllowedStorageProfileIds() {
        return allowedStorageProfileIds;
    }

    /**
     * <p>
     * The storage profile IDs for the queue.
     * </p>
     * 
     * @param allowedStorageProfileIds
     *        The storage profile IDs for the queue.
     */

    public void setAllowedStorageProfileIds(java.util.Collection<String> allowedStorageProfileIds) {
        if (allowedStorageProfileIds == null) {
            this.allowedStorageProfileIds = null;
            return;
        }

        this.allowedStorageProfileIds = new java.util.ArrayList<String>(allowedStorageProfileIds);
    }

    /**
     * <p>
     * The storage profile IDs for the queue.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedStorageProfileIds(java.util.Collection)} or
     * {@link #withAllowedStorageProfileIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param allowedStorageProfileIds
     *        The storage profile IDs for the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueueResult withAllowedStorageProfileIds(String... allowedStorageProfileIds) {
        if (this.allowedStorageProfileIds == null) {
            setAllowedStorageProfileIds(new java.util.ArrayList<String>(allowedStorageProfileIds.length));
        }
        for (String ele : allowedStorageProfileIds) {
            this.allowedStorageProfileIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The storage profile IDs for the queue.
     * </p>
     * 
     * @param allowedStorageProfileIds
     *        The storage profile IDs for the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueueResult withAllowedStorageProfileIds(java.util.Collection<String> allowedStorageProfileIds) {
        setAllowedStorageProfileIds(allowedStorageProfileIds);
        return this;
    }

    /**
     * <p>
     * The reason the queue was blocked.
     * </p>
     * 
     * @param blockedReason
     *        The reason the queue was blocked.
     * @see QueueBlockedReason
     */

    public void setBlockedReason(String blockedReason) {
        this.blockedReason = blockedReason;
    }

    /**
     * <p>
     * The reason the queue was blocked.
     * </p>
     * 
     * @return The reason the queue was blocked.
     * @see QueueBlockedReason
     */

    public String getBlockedReason() {
        return this.blockedReason;
    }

    /**
     * <p>
     * The reason the queue was blocked.
     * </p>
     * 
     * @param blockedReason
     *        The reason the queue was blocked.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueueBlockedReason
     */

    public GetQueueResult withBlockedReason(String blockedReason) {
        setBlockedReason(blockedReason);
        return this;
    }

    /**
     * <p>
     * The reason the queue was blocked.
     * </p>
     * 
     * @param blockedReason
     *        The reason the queue was blocked.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueueBlockedReason
     */

    public GetQueueResult withBlockedReason(QueueBlockedReason blockedReason) {
        this.blockedReason = blockedReason.toString();
        return this;
    }

    /**
     * <p>
     * The date and time the resource was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time the resource was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time the resource was created.
     * </p>
     * 
     * @return The date and time the resource was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time the resource was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time the resource was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueueResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The user or system that created this resource.
     * </p>
     * 
     * @param createdBy
     *        The user or system that created this resource.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The user or system that created this resource.
     * </p>
     * 
     * @return The user or system that created this resource.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The user or system that created this resource.
     * </p>
     * 
     * @param createdBy
     *        The user or system that created this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueueResult withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The default action taken on a queue if a budget wasn't configured.
     * </p>
     * 
     * @param defaultBudgetAction
     *        The default action taken on a queue if a budget wasn't configured.
     * @see DefaultQueueBudgetAction
     */

    public void setDefaultBudgetAction(String defaultBudgetAction) {
        this.defaultBudgetAction = defaultBudgetAction;
    }

    /**
     * <p>
     * The default action taken on a queue if a budget wasn't configured.
     * </p>
     * 
     * @return The default action taken on a queue if a budget wasn't configured.
     * @see DefaultQueueBudgetAction
     */

    public String getDefaultBudgetAction() {
        return this.defaultBudgetAction;
    }

    /**
     * <p>
     * The default action taken on a queue if a budget wasn't configured.
     * </p>
     * 
     * @param defaultBudgetAction
     *        The default action taken on a queue if a budget wasn't configured.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultQueueBudgetAction
     */

    public GetQueueResult withDefaultBudgetAction(String defaultBudgetAction) {
        setDefaultBudgetAction(defaultBudgetAction);
        return this;
    }

    /**
     * <p>
     * The default action taken on a queue if a budget wasn't configured.
     * </p>
     * 
     * @param defaultBudgetAction
     *        The default action taken on a queue if a budget wasn't configured.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultQueueBudgetAction
     */

    public GetQueueResult withDefaultBudgetAction(DefaultQueueBudgetAction defaultBudgetAction) {
        this.defaultBudgetAction = defaultBudgetAction.toString();
        return this;
    }

    /**
     * <p>
     * The description of the queue.
     * </p>
     * 
     * @param description
     *        The description of the queue.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the queue.
     * </p>
     * 
     * @return The description of the queue.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the queue.
     * </p>
     * 
     * @param description
     *        The description of the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueueResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The display name of the queue.
     * </p>
     * 
     * @param displayName
     *        The display name of the queue.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the queue.
     * </p>
     * 
     * @return The display name of the queue.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name of the queue.
     * </p>
     * 
     * @param displayName
     *        The display name of the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueueResult withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The farm ID for the queue.
     * </p>
     * 
     * @param farmId
     *        The farm ID for the queue.
     */

    public void setFarmId(String farmId) {
        this.farmId = farmId;
    }

    /**
     * <p>
     * The farm ID for the queue.
     * </p>
     * 
     * @return The farm ID for the queue.
     */

    public String getFarmId() {
        return this.farmId;
    }

    /**
     * <p>
     * The farm ID for the queue.
     * </p>
     * 
     * @param farmId
     *        The farm ID for the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueueResult withFarmId(String farmId) {
        setFarmId(farmId);
        return this;
    }

    /**
     * <p>
     * The job attachment settings for the queue.
     * </p>
     * 
     * @param jobAttachmentSettings
     *        The job attachment settings for the queue.
     */

    public void setJobAttachmentSettings(JobAttachmentSettings jobAttachmentSettings) {
        this.jobAttachmentSettings = jobAttachmentSettings;
    }

    /**
     * <p>
     * The job attachment settings for the queue.
     * </p>
     * 
     * @return The job attachment settings for the queue.
     */

    public JobAttachmentSettings getJobAttachmentSettings() {
        return this.jobAttachmentSettings;
    }

    /**
     * <p>
     * The job attachment settings for the queue.
     * </p>
     * 
     * @param jobAttachmentSettings
     *        The job attachment settings for the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueueResult withJobAttachmentSettings(JobAttachmentSettings jobAttachmentSettings) {
        setJobAttachmentSettings(jobAttachmentSettings);
        return this;
    }

    /**
     * <p>
     * The jobs in the queue ran as this specified POSIX user.
     * </p>
     * 
     * @param jobRunAsUser
     *        The jobs in the queue ran as this specified POSIX user.
     */

    public void setJobRunAsUser(JobRunAsUser jobRunAsUser) {
        this.jobRunAsUser = jobRunAsUser;
    }

    /**
     * <p>
     * The jobs in the queue ran as this specified POSIX user.
     * </p>
     * 
     * @return The jobs in the queue ran as this specified POSIX user.
     */

    public JobRunAsUser getJobRunAsUser() {
        return this.jobRunAsUser;
    }

    /**
     * <p>
     * The jobs in the queue ran as this specified POSIX user.
     * </p>
     * 
     * @param jobRunAsUser
     *        The jobs in the queue ran as this specified POSIX user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueueResult withJobRunAsUser(JobRunAsUser jobRunAsUser) {
        setJobRunAsUser(jobRunAsUser);
        return this;
    }

    /**
     * <p>
     * The queue ID.
     * </p>
     * 
     * @param queueId
     *        The queue ID.
     */

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    /**
     * <p>
     * The queue ID.
     * </p>
     * 
     * @return The queue ID.
     */

    public String getQueueId() {
        return this.queueId;
    }

    /**
     * <p>
     * The queue ID.
     * </p>
     * 
     * @param queueId
     *        The queue ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueueResult withQueueId(String queueId) {
        setQueueId(queueId);
        return this;
    }

    /**
     * <p>
     * A list of the required file system location names in the queue.
     * </p>
     * 
     * @return A list of the required file system location names in the queue.
     */

    public java.util.List<String> getRequiredFileSystemLocationNames() {
        return requiredFileSystemLocationNames;
    }

    /**
     * <p>
     * A list of the required file system location names in the queue.
     * </p>
     * 
     * @param requiredFileSystemLocationNames
     *        A list of the required file system location names in the queue.
     */

    public void setRequiredFileSystemLocationNames(java.util.Collection<String> requiredFileSystemLocationNames) {
        if (requiredFileSystemLocationNames == null) {
            this.requiredFileSystemLocationNames = null;
            return;
        }

        this.requiredFileSystemLocationNames = new java.util.ArrayList<String>(requiredFileSystemLocationNames);
    }

    /**
     * <p>
     * A list of the required file system location names in the queue.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRequiredFileSystemLocationNames(java.util.Collection)} or
     * {@link #withRequiredFileSystemLocationNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param requiredFileSystemLocationNames
     *        A list of the required file system location names in the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueueResult withRequiredFileSystemLocationNames(String... requiredFileSystemLocationNames) {
        if (this.requiredFileSystemLocationNames == null) {
            setRequiredFileSystemLocationNames(new java.util.ArrayList<String>(requiredFileSystemLocationNames.length));
        }
        for (String ele : requiredFileSystemLocationNames) {
            this.requiredFileSystemLocationNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the required file system location names in the queue.
     * </p>
     * 
     * @param requiredFileSystemLocationNames
     *        A list of the required file system location names in the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueueResult withRequiredFileSystemLocationNames(java.util.Collection<String> requiredFileSystemLocationNames) {
        setRequiredFileSystemLocationNames(requiredFileSystemLocationNames);
        return this;
    }

    /**
     * <p>
     * The IAM role ARN.
     * </p>
     * 
     * @param roleArn
     *        The IAM role ARN.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The IAM role ARN.
     * </p>
     * 
     * @return The IAM role ARN.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The IAM role ARN.
     * </p>
     * 
     * @param roleArn
     *        The IAM role ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueueResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The status of the queue.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>–The queue is active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SCHEDULING</code>–The queue is scheduling.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SCHEDULING_BLOCKED</code>–The queue scheduling is blocked. See the provided reason.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the queue.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code>–The queue is active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SCHEDULING</code>–The queue is scheduling.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SCHEDULING_BLOCKED</code>–The queue scheduling is blocked. See the provided reason.
     *        </p>
     *        </li>
     * @see QueueStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the queue.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>–The queue is active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SCHEDULING</code>–The queue is scheduling.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SCHEDULING_BLOCKED</code>–The queue scheduling is blocked. See the provided reason.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the queue.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code>–The queue is active.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SCHEDULING</code>–The queue is scheduling.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SCHEDULING_BLOCKED</code>–The queue scheduling is blocked. See the provided reason.
     *         </p>
     *         </li>
     * @see QueueStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the queue.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>–The queue is active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SCHEDULING</code>–The queue is scheduling.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SCHEDULING_BLOCKED</code>–The queue scheduling is blocked. See the provided reason.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the queue.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code>–The queue is active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SCHEDULING</code>–The queue is scheduling.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SCHEDULING_BLOCKED</code>–The queue scheduling is blocked. See the provided reason.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueueStatus
     */

    public GetQueueResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the queue.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>–The queue is active.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SCHEDULING</code>–The queue is scheduling.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SCHEDULING_BLOCKED</code>–The queue scheduling is blocked. See the provided reason.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the queue.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code>–The queue is active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SCHEDULING</code>–The queue is scheduling.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SCHEDULING_BLOCKED</code>–The queue scheduling is blocked. See the provided reason.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueueStatus
     */

    public GetQueueResult withStatus(QueueStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date and time the resource was updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time the resource was updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The date and time the resource was updated.
     * </p>
     * 
     * @return The date and time the resource was updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The date and time the resource was updated.
     * </p>
     * 
     * @param updatedAt
     *        The date and time the resource was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueueResult withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The user or system that updated this resource.
     * </p>
     * 
     * @param updatedBy
     *        The user or system that updated this resource.
     */

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * <p>
     * The user or system that updated this resource.
     * </p>
     * 
     * @return The user or system that updated this resource.
     */

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * <p>
     * The user or system that updated this resource.
     * </p>
     * 
     * @param updatedBy
     *        The user or system that updated this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQueueResult withUpdatedBy(String updatedBy) {
        setUpdatedBy(updatedBy);
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
        if (getAllowedStorageProfileIds() != null)
            sb.append("AllowedStorageProfileIds: ").append(getAllowedStorageProfileIds()).append(",");
        if (getBlockedReason() != null)
            sb.append("BlockedReason: ").append(getBlockedReason()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
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
        if (getRequiredFileSystemLocationNames() != null)
            sb.append("RequiredFileSystemLocationNames: ").append("***Sensitive Data Redacted***").append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getUpdatedBy() != null)
            sb.append("UpdatedBy: ").append(getUpdatedBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetQueueResult == false)
            return false;
        GetQueueResult other = (GetQueueResult) obj;
        if (other.getAllowedStorageProfileIds() == null ^ this.getAllowedStorageProfileIds() == null)
            return false;
        if (other.getAllowedStorageProfileIds() != null && other.getAllowedStorageProfileIds().equals(this.getAllowedStorageProfileIds()) == false)
            return false;
        if (other.getBlockedReason() == null ^ this.getBlockedReason() == null)
            return false;
        if (other.getBlockedReason() != null && other.getBlockedReason().equals(this.getBlockedReason()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
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
        if (other.getRequiredFileSystemLocationNames() == null ^ this.getRequiredFileSystemLocationNames() == null)
            return false;
        if (other.getRequiredFileSystemLocationNames() != null
                && other.getRequiredFileSystemLocationNames().equals(this.getRequiredFileSystemLocationNames()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getUpdatedBy() == null ^ this.getUpdatedBy() == null)
            return false;
        if (other.getUpdatedBy() != null && other.getUpdatedBy().equals(this.getUpdatedBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowedStorageProfileIds() == null) ? 0 : getAllowedStorageProfileIds().hashCode());
        hashCode = prime * hashCode + ((getBlockedReason() == null) ? 0 : getBlockedReason().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getDefaultBudgetAction() == null) ? 0 : getDefaultBudgetAction().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getFarmId() == null) ? 0 : getFarmId().hashCode());
        hashCode = prime * hashCode + ((getJobAttachmentSettings() == null) ? 0 : getJobAttachmentSettings().hashCode());
        hashCode = prime * hashCode + ((getJobRunAsUser() == null) ? 0 : getJobRunAsUser().hashCode());
        hashCode = prime * hashCode + ((getQueueId() == null) ? 0 : getQueueId().hashCode());
        hashCode = prime * hashCode + ((getRequiredFileSystemLocationNames() == null) ? 0 : getRequiredFileSystemLocationNames().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedBy() == null) ? 0 : getUpdatedBy().hashCode());
        return hashCode;
    }

    @Override
    public GetQueueResult clone() {
        try {
            return (GetQueueResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
