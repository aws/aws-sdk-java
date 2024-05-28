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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/CreateQueue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateQueueRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The storage profile IDs to include in the queue.
     * </p>
     */
    private java.util.List<String> allowedStorageProfileIds;
    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The default action to take on a queue if a budget isn't configured.
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
     * The farm ID of the farm to connect to the queue.
     * </p>
     */
    private String farmId;
    /**
     * <p>
     * The job attachment settings for the queue. These are the Amazon S3 bucket name and the Amazon S3 prefix.
     * </p>
     */
    private JobAttachmentSettings jobAttachmentSettings;
    /**
     * <p>
     * The jobs in the queue run as the specified POSIX user.
     * </p>
     */
    private JobRunAsUser jobRunAsUser;
    /**
     * <p>
     * The file system location name to include in the queue.
     * </p>
     */
    private java.util.List<String> requiredFileSystemLocationNames;
    /**
     * <p>
     * The IAM role ARN that workers will use while running jobs for this queue.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * Each tag consists of a tag key and a tag value. Tag keys and values are both required, but tag values can be
     * empty strings.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The storage profile IDs to include in the queue.
     * </p>
     * 
     * @return The storage profile IDs to include in the queue.
     */

    public java.util.List<String> getAllowedStorageProfileIds() {
        return allowedStorageProfileIds;
    }

    /**
     * <p>
     * The storage profile IDs to include in the queue.
     * </p>
     * 
     * @param allowedStorageProfileIds
     *        The storage profile IDs to include in the queue.
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
     * The storage profile IDs to include in the queue.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedStorageProfileIds(java.util.Collection)} or
     * {@link #withAllowedStorageProfileIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param allowedStorageProfileIds
     *        The storage profile IDs to include in the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQueueRequest withAllowedStorageProfileIds(String... allowedStorageProfileIds) {
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
     * The storage profile IDs to include in the queue.
     * </p>
     * 
     * @param allowedStorageProfileIds
     *        The storage profile IDs to include in the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQueueRequest withAllowedStorageProfileIds(java.util.Collection<String> allowedStorageProfileIds) {
        setAllowedStorageProfileIds(allowedStorageProfileIds);
        return this;
    }

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     * 
     * @param clientToken
     *        The unique token which the server uses to recognize retries of the same request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     * 
     * @return The unique token which the server uses to recognize retries of the same request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The unique token which the server uses to recognize retries of the same request.
     * </p>
     * 
     * @param clientToken
     *        The unique token which the server uses to recognize retries of the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQueueRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The default action to take on a queue if a budget isn't configured.
     * </p>
     * 
     * @param defaultBudgetAction
     *        The default action to take on a queue if a budget isn't configured.
     * @see DefaultQueueBudgetAction
     */

    public void setDefaultBudgetAction(String defaultBudgetAction) {
        this.defaultBudgetAction = defaultBudgetAction;
    }

    /**
     * <p>
     * The default action to take on a queue if a budget isn't configured.
     * </p>
     * 
     * @return The default action to take on a queue if a budget isn't configured.
     * @see DefaultQueueBudgetAction
     */

    public String getDefaultBudgetAction() {
        return this.defaultBudgetAction;
    }

    /**
     * <p>
     * The default action to take on a queue if a budget isn't configured.
     * </p>
     * 
     * @param defaultBudgetAction
     *        The default action to take on a queue if a budget isn't configured.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultQueueBudgetAction
     */

    public CreateQueueRequest withDefaultBudgetAction(String defaultBudgetAction) {
        setDefaultBudgetAction(defaultBudgetAction);
        return this;
    }

    /**
     * <p>
     * The default action to take on a queue if a budget isn't configured.
     * </p>
     * 
     * @param defaultBudgetAction
     *        The default action to take on a queue if a budget isn't configured.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultQueueBudgetAction
     */

    public CreateQueueRequest withDefaultBudgetAction(DefaultQueueBudgetAction defaultBudgetAction) {
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

    public CreateQueueRequest withDescription(String description) {
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

    public CreateQueueRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The farm ID of the farm to connect to the queue.
     * </p>
     * 
     * @param farmId
     *        The farm ID of the farm to connect to the queue.
     */

    public void setFarmId(String farmId) {
        this.farmId = farmId;
    }

    /**
     * <p>
     * The farm ID of the farm to connect to the queue.
     * </p>
     * 
     * @return The farm ID of the farm to connect to the queue.
     */

    public String getFarmId() {
        return this.farmId;
    }

    /**
     * <p>
     * The farm ID of the farm to connect to the queue.
     * </p>
     * 
     * @param farmId
     *        The farm ID of the farm to connect to the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQueueRequest withFarmId(String farmId) {
        setFarmId(farmId);
        return this;
    }

    /**
     * <p>
     * The job attachment settings for the queue. These are the Amazon S3 bucket name and the Amazon S3 prefix.
     * </p>
     * 
     * @param jobAttachmentSettings
     *        The job attachment settings for the queue. These are the Amazon S3 bucket name and the Amazon S3 prefix.
     */

    public void setJobAttachmentSettings(JobAttachmentSettings jobAttachmentSettings) {
        this.jobAttachmentSettings = jobAttachmentSettings;
    }

    /**
     * <p>
     * The job attachment settings for the queue. These are the Amazon S3 bucket name and the Amazon S3 prefix.
     * </p>
     * 
     * @return The job attachment settings for the queue. These are the Amazon S3 bucket name and the Amazon S3 prefix.
     */

    public JobAttachmentSettings getJobAttachmentSettings() {
        return this.jobAttachmentSettings;
    }

    /**
     * <p>
     * The job attachment settings for the queue. These are the Amazon S3 bucket name and the Amazon S3 prefix.
     * </p>
     * 
     * @param jobAttachmentSettings
     *        The job attachment settings for the queue. These are the Amazon S3 bucket name and the Amazon S3 prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQueueRequest withJobAttachmentSettings(JobAttachmentSettings jobAttachmentSettings) {
        setJobAttachmentSettings(jobAttachmentSettings);
        return this;
    }

    /**
     * <p>
     * The jobs in the queue run as the specified POSIX user.
     * </p>
     * 
     * @param jobRunAsUser
     *        The jobs in the queue run as the specified POSIX user.
     */

    public void setJobRunAsUser(JobRunAsUser jobRunAsUser) {
        this.jobRunAsUser = jobRunAsUser;
    }

    /**
     * <p>
     * The jobs in the queue run as the specified POSIX user.
     * </p>
     * 
     * @return The jobs in the queue run as the specified POSIX user.
     */

    public JobRunAsUser getJobRunAsUser() {
        return this.jobRunAsUser;
    }

    /**
     * <p>
     * The jobs in the queue run as the specified POSIX user.
     * </p>
     * 
     * @param jobRunAsUser
     *        The jobs in the queue run as the specified POSIX user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQueueRequest withJobRunAsUser(JobRunAsUser jobRunAsUser) {
        setJobRunAsUser(jobRunAsUser);
        return this;
    }

    /**
     * <p>
     * The file system location name to include in the queue.
     * </p>
     * 
     * @return The file system location name to include in the queue.
     */

    public java.util.List<String> getRequiredFileSystemLocationNames() {
        return requiredFileSystemLocationNames;
    }

    /**
     * <p>
     * The file system location name to include in the queue.
     * </p>
     * 
     * @param requiredFileSystemLocationNames
     *        The file system location name to include in the queue.
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
     * The file system location name to include in the queue.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRequiredFileSystemLocationNames(java.util.Collection)} or
     * {@link #withRequiredFileSystemLocationNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param requiredFileSystemLocationNames
     *        The file system location name to include in the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQueueRequest withRequiredFileSystemLocationNames(String... requiredFileSystemLocationNames) {
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
     * The file system location name to include in the queue.
     * </p>
     * 
     * @param requiredFileSystemLocationNames
     *        The file system location name to include in the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQueueRequest withRequiredFileSystemLocationNames(java.util.Collection<String> requiredFileSystemLocationNames) {
        setRequiredFileSystemLocationNames(requiredFileSystemLocationNames);
        return this;
    }

    /**
     * <p>
     * The IAM role ARN that workers will use while running jobs for this queue.
     * </p>
     * 
     * @param roleArn
     *        The IAM role ARN that workers will use while running jobs for this queue.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The IAM role ARN that workers will use while running jobs for this queue.
     * </p>
     * 
     * @return The IAM role ARN that workers will use while running jobs for this queue.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The IAM role ARN that workers will use while running jobs for this queue.
     * </p>
     * 
     * @param roleArn
     *        The IAM role ARN that workers will use while running jobs for this queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQueueRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * Each tag consists of a tag key and a tag value. Tag keys and values are both required, but tag values can be
     * empty strings.
     * </p>
     * 
     * @return Each tag consists of a tag key and a tag value. Tag keys and values are both required, but tag values can
     *         be empty strings.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Each tag consists of a tag key and a tag value. Tag keys and values are both required, but tag values can be
     * empty strings.
     * </p>
     * 
     * @param tags
     *        Each tag consists of a tag key and a tag value. Tag keys and values are both required, but tag values can
     *        be empty strings.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Each tag consists of a tag key and a tag value. Tag keys and values are both required, but tag values can be
     * empty strings.
     * </p>
     * 
     * @param tags
     *        Each tag consists of a tag key and a tag value. Tag keys and values are both required, but tag values can
     *        be empty strings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQueueRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateQueueRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateQueueRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateQueueRequest clearTagsEntries() {
        this.tags = null;
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
        if (getRequiredFileSystemLocationNames() != null)
            sb.append("RequiredFileSystemLocationNames: ").append("***Sensitive Data Redacted***").append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateQueueRequest == false)
            return false;
        CreateQueueRequest other = (CreateQueueRequest) obj;
        if (other.getAllowedStorageProfileIds() == null ^ this.getAllowedStorageProfileIds() == null)
            return false;
        if (other.getAllowedStorageProfileIds() != null && other.getAllowedStorageProfileIds().equals(this.getAllowedStorageProfileIds()) == false)
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
        if (other.getRequiredFileSystemLocationNames() == null ^ this.getRequiredFileSystemLocationNames() == null)
            return false;
        if (other.getRequiredFileSystemLocationNames() != null
                && other.getRequiredFileSystemLocationNames().equals(this.getRequiredFileSystemLocationNames()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowedStorageProfileIds() == null) ? 0 : getAllowedStorageProfileIds().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDefaultBudgetAction() == null) ? 0 : getDefaultBudgetAction().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getFarmId() == null) ? 0 : getFarmId().hashCode());
        hashCode = prime * hashCode + ((getJobAttachmentSettings() == null) ? 0 : getJobAttachmentSettings().hashCode());
        hashCode = prime * hashCode + ((getJobRunAsUser() == null) ? 0 : getJobRunAsUser().hashCode());
        hashCode = prime * hashCode + ((getRequiredFileSystemLocationNames() == null) ? 0 : getRequiredFileSystemLocationNames().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateQueueRequest clone() {
        return (CreateQueueRequest) super.clone();
    }

}
