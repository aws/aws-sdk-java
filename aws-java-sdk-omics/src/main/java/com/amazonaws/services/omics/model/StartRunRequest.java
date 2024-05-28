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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/StartRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartRunRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The run's workflow ID.
     * </p>
     */
    private String workflowId;
    /**
     * <p>
     * The run's workflow type.
     * </p>
     */
    private String workflowType;
    /**
     * <p>
     * The ID of a run to duplicate.
     * </p>
     */
    private String runId;
    /**
     * <p>
     * A service role for the run.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * A name for the run.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The run's group ID.
     * </p>
     */
    private String runGroupId;
    /**
     * <p>
     * A priority for the run.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * A storage capacity for the run in gibibytes. This field is not required if the storage type is dynamic (the
     * system ignores any value that you enter).
     * </p>
     */
    private Integer storageCapacity;
    /**
     * <p>
     * An output URI for the run.
     * </p>
     */
    private String outputUri;
    /**
     * <p>
     * A log level for the run.
     * </p>
     */
    private String logLevel;
    /**
     * <p>
     * Tags for the run.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * To ensure that requests don't run multiple times, specify a unique ID for each request.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * The retention mode for the run.
     * </p>
     */
    private String retentionMode;
    /**
     * <p>
     * The run's storage type. By default, the run uses STATIC storage type, which allocates a fixed amount of storage.
     * If you set the storage type to DYNAMIC, HealthOmics dynamically scales the storage up or down, based on file
     * system utilization.
     * </p>
     */
    private String storageType;
    /**
     * <p>
     * The ID of the workflow owner.
     * </p>
     */
    private String workflowOwnerId;

    /**
     * <p>
     * The run's workflow ID.
     * </p>
     * 
     * @param workflowId
     *        The run's workflow ID.
     */

    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }

    /**
     * <p>
     * The run's workflow ID.
     * </p>
     * 
     * @return The run's workflow ID.
     */

    public String getWorkflowId() {
        return this.workflowId;
    }

    /**
     * <p>
     * The run's workflow ID.
     * </p>
     * 
     * @param workflowId
     *        The run's workflow ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartRunRequest withWorkflowId(String workflowId) {
        setWorkflowId(workflowId);
        return this;
    }

    /**
     * <p>
     * The run's workflow type.
     * </p>
     * 
     * @param workflowType
     *        The run's workflow type.
     * @see WorkflowType
     */

    public void setWorkflowType(String workflowType) {
        this.workflowType = workflowType;
    }

    /**
     * <p>
     * The run's workflow type.
     * </p>
     * 
     * @return The run's workflow type.
     * @see WorkflowType
     */

    public String getWorkflowType() {
        return this.workflowType;
    }

    /**
     * <p>
     * The run's workflow type.
     * </p>
     * 
     * @param workflowType
     *        The run's workflow type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowType
     */

    public StartRunRequest withWorkflowType(String workflowType) {
        setWorkflowType(workflowType);
        return this;
    }

    /**
     * <p>
     * The run's workflow type.
     * </p>
     * 
     * @param workflowType
     *        The run's workflow type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkflowType
     */

    public StartRunRequest withWorkflowType(WorkflowType workflowType) {
        this.workflowType = workflowType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of a run to duplicate.
     * </p>
     * 
     * @param runId
     *        The ID of a run to duplicate.
     */

    public void setRunId(String runId) {
        this.runId = runId;
    }

    /**
     * <p>
     * The ID of a run to duplicate.
     * </p>
     * 
     * @return The ID of a run to duplicate.
     */

    public String getRunId() {
        return this.runId;
    }

    /**
     * <p>
     * The ID of a run to duplicate.
     * </p>
     * 
     * @param runId
     *        The ID of a run to duplicate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartRunRequest withRunId(String runId) {
        setRunId(runId);
        return this;
    }

    /**
     * <p>
     * A service role for the run.
     * </p>
     * 
     * @param roleArn
     *        A service role for the run.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * A service role for the run.
     * </p>
     * 
     * @return A service role for the run.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * A service role for the run.
     * </p>
     * 
     * @param roleArn
     *        A service role for the run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartRunRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * A name for the run.
     * </p>
     * 
     * @param name
     *        A name for the run.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the run.
     * </p>
     * 
     * @return A name for the run.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the run.
     * </p>
     * 
     * @param name
     *        A name for the run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartRunRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The run's group ID.
     * </p>
     * 
     * @param runGroupId
     *        The run's group ID.
     */

    public void setRunGroupId(String runGroupId) {
        this.runGroupId = runGroupId;
    }

    /**
     * <p>
     * The run's group ID.
     * </p>
     * 
     * @return The run's group ID.
     */

    public String getRunGroupId() {
        return this.runGroupId;
    }

    /**
     * <p>
     * The run's group ID.
     * </p>
     * 
     * @param runGroupId
     *        The run's group ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartRunRequest withRunGroupId(String runGroupId) {
        setRunGroupId(runGroupId);
        return this;
    }

    /**
     * <p>
     * A priority for the run.
     * </p>
     * 
     * @param priority
     *        A priority for the run.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * A priority for the run.
     * </p>
     * 
     * @return A priority for the run.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * A priority for the run.
     * </p>
     * 
     * @param priority
     *        A priority for the run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartRunRequest withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * A storage capacity for the run in gibibytes. This field is not required if the storage type is dynamic (the
     * system ignores any value that you enter).
     * </p>
     * 
     * @param storageCapacity
     *        A storage capacity for the run in gibibytes. This field is not required if the storage type is dynamic
     *        (the system ignores any value that you enter).
     */

    public void setStorageCapacity(Integer storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    /**
     * <p>
     * A storage capacity for the run in gibibytes. This field is not required if the storage type is dynamic (the
     * system ignores any value that you enter).
     * </p>
     * 
     * @return A storage capacity for the run in gibibytes. This field is not required if the storage type is dynamic
     *         (the system ignores any value that you enter).
     */

    public Integer getStorageCapacity() {
        return this.storageCapacity;
    }

    /**
     * <p>
     * A storage capacity for the run in gibibytes. This field is not required if the storage type is dynamic (the
     * system ignores any value that you enter).
     * </p>
     * 
     * @param storageCapacity
     *        A storage capacity for the run in gibibytes. This field is not required if the storage type is dynamic
     *        (the system ignores any value that you enter).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartRunRequest withStorageCapacity(Integer storageCapacity) {
        setStorageCapacity(storageCapacity);
        return this;
    }

    /**
     * <p>
     * An output URI for the run.
     * </p>
     * 
     * @param outputUri
     *        An output URI for the run.
     */

    public void setOutputUri(String outputUri) {
        this.outputUri = outputUri;
    }

    /**
     * <p>
     * An output URI for the run.
     * </p>
     * 
     * @return An output URI for the run.
     */

    public String getOutputUri() {
        return this.outputUri;
    }

    /**
     * <p>
     * An output URI for the run.
     * </p>
     * 
     * @param outputUri
     *        An output URI for the run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartRunRequest withOutputUri(String outputUri) {
        setOutputUri(outputUri);
        return this;
    }

    /**
     * <p>
     * A log level for the run.
     * </p>
     * 
     * @param logLevel
     *        A log level for the run.
     * @see RunLogLevel
     */

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    /**
     * <p>
     * A log level for the run.
     * </p>
     * 
     * @return A log level for the run.
     * @see RunLogLevel
     */

    public String getLogLevel() {
        return this.logLevel;
    }

    /**
     * <p>
     * A log level for the run.
     * </p>
     * 
     * @param logLevel
     *        A log level for the run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RunLogLevel
     */

    public StartRunRequest withLogLevel(String logLevel) {
        setLogLevel(logLevel);
        return this;
    }

    /**
     * <p>
     * A log level for the run.
     * </p>
     * 
     * @param logLevel
     *        A log level for the run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RunLogLevel
     */

    public StartRunRequest withLogLevel(RunLogLevel logLevel) {
        this.logLevel = logLevel.toString();
        return this;
    }

    /**
     * <p>
     * Tags for the run.
     * </p>
     * 
     * @return Tags for the run.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags for the run.
     * </p>
     * 
     * @param tags
     *        Tags for the run.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags for the run.
     * </p>
     * 
     * @param tags
     *        Tags for the run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartRunRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see StartRunRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartRunRequest addTagsEntry(String key, String value) {
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

    public StartRunRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * To ensure that requests don't run multiple times, specify a unique ID for each request.
     * </p>
     * 
     * @param requestId
     *        To ensure that requests don't run multiple times, specify a unique ID for each request.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * To ensure that requests don't run multiple times, specify a unique ID for each request.
     * </p>
     * 
     * @return To ensure that requests don't run multiple times, specify a unique ID for each request.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * To ensure that requests don't run multiple times, specify a unique ID for each request.
     * </p>
     * 
     * @param requestId
     *        To ensure that requests don't run multiple times, specify a unique ID for each request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartRunRequest withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * The retention mode for the run.
     * </p>
     * 
     * @param retentionMode
     *        The retention mode for the run.
     * @see RunRetentionMode
     */

    public void setRetentionMode(String retentionMode) {
        this.retentionMode = retentionMode;
    }

    /**
     * <p>
     * The retention mode for the run.
     * </p>
     * 
     * @return The retention mode for the run.
     * @see RunRetentionMode
     */

    public String getRetentionMode() {
        return this.retentionMode;
    }

    /**
     * <p>
     * The retention mode for the run.
     * </p>
     * 
     * @param retentionMode
     *        The retention mode for the run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RunRetentionMode
     */

    public StartRunRequest withRetentionMode(String retentionMode) {
        setRetentionMode(retentionMode);
        return this;
    }

    /**
     * <p>
     * The retention mode for the run.
     * </p>
     * 
     * @param retentionMode
     *        The retention mode for the run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RunRetentionMode
     */

    public StartRunRequest withRetentionMode(RunRetentionMode retentionMode) {
        this.retentionMode = retentionMode.toString();
        return this;
    }

    /**
     * <p>
     * The run's storage type. By default, the run uses STATIC storage type, which allocates a fixed amount of storage.
     * If you set the storage type to DYNAMIC, HealthOmics dynamically scales the storage up or down, based on file
     * system utilization.
     * </p>
     * 
     * @param storageType
     *        The run's storage type. By default, the run uses STATIC storage type, which allocates a fixed amount of
     *        storage. If you set the storage type to DYNAMIC, HealthOmics dynamically scales the storage up or down,
     *        based on file system utilization.
     * @see StorageType
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * The run's storage type. By default, the run uses STATIC storage type, which allocates a fixed amount of storage.
     * If you set the storage type to DYNAMIC, HealthOmics dynamically scales the storage up or down, based on file
     * system utilization.
     * </p>
     * 
     * @return The run's storage type. By default, the run uses STATIC storage type, which allocates a fixed amount of
     *         storage. If you set the storage type to DYNAMIC, HealthOmics dynamically scales the storage up or down,
     *         based on file system utilization.
     * @see StorageType
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * The run's storage type. By default, the run uses STATIC storage type, which allocates a fixed amount of storage.
     * If you set the storage type to DYNAMIC, HealthOmics dynamically scales the storage up or down, based on file
     * system utilization.
     * </p>
     * 
     * @param storageType
     *        The run's storage type. By default, the run uses STATIC storage type, which allocates a fixed amount of
     *        storage. If you set the storage type to DYNAMIC, HealthOmics dynamically scales the storage up or down,
     *        based on file system utilization.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageType
     */

    public StartRunRequest withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p>
     * The run's storage type. By default, the run uses STATIC storage type, which allocates a fixed amount of storage.
     * If you set the storage type to DYNAMIC, HealthOmics dynamically scales the storage up or down, based on file
     * system utilization.
     * </p>
     * 
     * @param storageType
     *        The run's storage type. By default, the run uses STATIC storage type, which allocates a fixed amount of
     *        storage. If you set the storage type to DYNAMIC, HealthOmics dynamically scales the storage up or down,
     *        based on file system utilization.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageType
     */

    public StartRunRequest withStorageType(StorageType storageType) {
        this.storageType = storageType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the workflow owner.
     * </p>
     * 
     * @param workflowOwnerId
     *        The ID of the workflow owner.
     */

    public void setWorkflowOwnerId(String workflowOwnerId) {
        this.workflowOwnerId = workflowOwnerId;
    }

    /**
     * <p>
     * The ID of the workflow owner.
     * </p>
     * 
     * @return The ID of the workflow owner.
     */

    public String getWorkflowOwnerId() {
        return this.workflowOwnerId;
    }

    /**
     * <p>
     * The ID of the workflow owner.
     * </p>
     * 
     * @param workflowOwnerId
     *        The ID of the workflow owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartRunRequest withWorkflowOwnerId(String workflowOwnerId) {
        setWorkflowOwnerId(workflowOwnerId);
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
        if (getWorkflowId() != null)
            sb.append("WorkflowId: ").append(getWorkflowId()).append(",");
        if (getWorkflowType() != null)
            sb.append("WorkflowType: ").append(getWorkflowType()).append(",");
        if (getRunId() != null)
            sb.append("RunId: ").append(getRunId()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRunGroupId() != null)
            sb.append("RunGroupId: ").append(getRunGroupId()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getStorageCapacity() != null)
            sb.append("StorageCapacity: ").append(getStorageCapacity()).append(",");
        if (getOutputUri() != null)
            sb.append("OutputUri: ").append(getOutputUri()).append(",");
        if (getLogLevel() != null)
            sb.append("LogLevel: ").append(getLogLevel()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
        if (getRetentionMode() != null)
            sb.append("RetentionMode: ").append(getRetentionMode()).append(",");
        if (getStorageType() != null)
            sb.append("StorageType: ").append(getStorageType()).append(",");
        if (getWorkflowOwnerId() != null)
            sb.append("WorkflowOwnerId: ").append(getWorkflowOwnerId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartRunRequest == false)
            return false;
        StartRunRequest other = (StartRunRequest) obj;
        if (other.getWorkflowId() == null ^ this.getWorkflowId() == null)
            return false;
        if (other.getWorkflowId() != null && other.getWorkflowId().equals(this.getWorkflowId()) == false)
            return false;
        if (other.getWorkflowType() == null ^ this.getWorkflowType() == null)
            return false;
        if (other.getWorkflowType() != null && other.getWorkflowType().equals(this.getWorkflowType()) == false)
            return false;
        if (other.getRunId() == null ^ this.getRunId() == null)
            return false;
        if (other.getRunId() != null && other.getRunId().equals(this.getRunId()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRunGroupId() == null ^ this.getRunGroupId() == null)
            return false;
        if (other.getRunGroupId() != null && other.getRunGroupId().equals(this.getRunGroupId()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getStorageCapacity() == null ^ this.getStorageCapacity() == null)
            return false;
        if (other.getStorageCapacity() != null && other.getStorageCapacity().equals(this.getStorageCapacity()) == false)
            return false;
        if (other.getOutputUri() == null ^ this.getOutputUri() == null)
            return false;
        if (other.getOutputUri() != null && other.getOutputUri().equals(this.getOutputUri()) == false)
            return false;
        if (other.getLogLevel() == null ^ this.getLogLevel() == null)
            return false;
        if (other.getLogLevel() != null && other.getLogLevel().equals(this.getLogLevel()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getRetentionMode() == null ^ this.getRetentionMode() == null)
            return false;
        if (other.getRetentionMode() != null && other.getRetentionMode().equals(this.getRetentionMode()) == false)
            return false;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        if (other.getWorkflowOwnerId() == null ^ this.getWorkflowOwnerId() == null)
            return false;
        if (other.getWorkflowOwnerId() != null && other.getWorkflowOwnerId().equals(this.getWorkflowOwnerId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkflowId() == null) ? 0 : getWorkflowId().hashCode());
        hashCode = prime * hashCode + ((getWorkflowType() == null) ? 0 : getWorkflowType().hashCode());
        hashCode = prime * hashCode + ((getRunId() == null) ? 0 : getRunId().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRunGroupId() == null) ? 0 : getRunGroupId().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getStorageCapacity() == null) ? 0 : getStorageCapacity().hashCode());
        hashCode = prime * hashCode + ((getOutputUri() == null) ? 0 : getOutputUri().hashCode());
        hashCode = prime * hashCode + ((getLogLevel() == null) ? 0 : getLogLevel().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getRetentionMode() == null) ? 0 : getRetentionMode().hashCode());
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getWorkflowOwnerId() == null) ? 0 : getWorkflowOwnerId().hashCode());
        return hashCode;
    }

    @Override
    public StartRunRequest clone() {
        return (StartRunRequest) super.clone();
    }

}
