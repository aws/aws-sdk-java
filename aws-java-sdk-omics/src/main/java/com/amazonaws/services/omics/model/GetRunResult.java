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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/GetRun" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRunResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The run's ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * When the run was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The run's definition.
     * </p>
     */
    private String definition;
    /**
     * <p>
     * The run's digest.
     * </p>
     */
    private String digest;
    /**
     * <p>
     * The run's ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The run's log level.
     * </p>
     */
    private String logLevel;
    /**
     * <p>
     * The run's name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The run's output URI.
     * </p>
     */
    private String outputUri;
    /**
     * <p>
     * The run's priority.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * The run's resource digests.
     * </p>
     */
    private java.util.Map<String, String> resourceDigests;
    /**
     * <p>
     * The run's service role ARN.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The run's group ID.
     * </p>
     */
    private String runGroupId;
    /**
     * <p>
     * The run's ID.
     * </p>
     */
    private String runId;
    /**
     * <p>
     * When the run started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * Who started the run.
     * </p>
     */
    private String startedBy;
    /**
     * <p>
     * The run's status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The run's status message.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The run's stop time.
     * </p>
     */
    private java.util.Date stopTime;
    /**
     * <p>
     * The run's storage capacity.
     * </p>
     */
    private Integer storageCapacity;
    /**
     * <p>
     * The run's tags.
     * </p>
     */
    private java.util.Map<String, String> tags;
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
     * The run's ARN.
     * </p>
     * 
     * @param arn
     *        The run's ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The run's ARN.
     * </p>
     * 
     * @return The run's ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The run's ARN.
     * </p>
     * 
     * @param arn
     *        The run's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRunResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * When the run was created.
     * </p>
     * 
     * @param creationTime
     *        When the run was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the run was created.
     * </p>
     * 
     * @return When the run was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the run was created.
     * </p>
     * 
     * @param creationTime
     *        When the run was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRunResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The run's definition.
     * </p>
     * 
     * @param definition
     *        The run's definition.
     */

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    /**
     * <p>
     * The run's definition.
     * </p>
     * 
     * @return The run's definition.
     */

    public String getDefinition() {
        return this.definition;
    }

    /**
     * <p>
     * The run's definition.
     * </p>
     * 
     * @param definition
     *        The run's definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRunResult withDefinition(String definition) {
        setDefinition(definition);
        return this;
    }

    /**
     * <p>
     * The run's digest.
     * </p>
     * 
     * @param digest
     *        The run's digest.
     */

    public void setDigest(String digest) {
        this.digest = digest;
    }

    /**
     * <p>
     * The run's digest.
     * </p>
     * 
     * @return The run's digest.
     */

    public String getDigest() {
        return this.digest;
    }

    /**
     * <p>
     * The run's digest.
     * </p>
     * 
     * @param digest
     *        The run's digest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRunResult withDigest(String digest) {
        setDigest(digest);
        return this;
    }

    /**
     * <p>
     * The run's ID.
     * </p>
     * 
     * @param id
     *        The run's ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The run's ID.
     * </p>
     * 
     * @return The run's ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The run's ID.
     * </p>
     * 
     * @param id
     *        The run's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRunResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The run's log level.
     * </p>
     * 
     * @param logLevel
     *        The run's log level.
     * @see RunLogLevel
     */

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    /**
     * <p>
     * The run's log level.
     * </p>
     * 
     * @return The run's log level.
     * @see RunLogLevel
     */

    public String getLogLevel() {
        return this.logLevel;
    }

    /**
     * <p>
     * The run's log level.
     * </p>
     * 
     * @param logLevel
     *        The run's log level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RunLogLevel
     */

    public GetRunResult withLogLevel(String logLevel) {
        setLogLevel(logLevel);
        return this;
    }

    /**
     * <p>
     * The run's log level.
     * </p>
     * 
     * @param logLevel
     *        The run's log level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RunLogLevel
     */

    public GetRunResult withLogLevel(RunLogLevel logLevel) {
        this.logLevel = logLevel.toString();
        return this;
    }

    /**
     * <p>
     * The run's name.
     * </p>
     * 
     * @param name
     *        The run's name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The run's name.
     * </p>
     * 
     * @return The run's name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The run's name.
     * </p>
     * 
     * @param name
     *        The run's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRunResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The run's output URI.
     * </p>
     * 
     * @param outputUri
     *        The run's output URI.
     */

    public void setOutputUri(String outputUri) {
        this.outputUri = outputUri;
    }

    /**
     * <p>
     * The run's output URI.
     * </p>
     * 
     * @return The run's output URI.
     */

    public String getOutputUri() {
        return this.outputUri;
    }

    /**
     * <p>
     * The run's output URI.
     * </p>
     * 
     * @param outputUri
     *        The run's output URI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRunResult withOutputUri(String outputUri) {
        setOutputUri(outputUri);
        return this;
    }

    /**
     * <p>
     * The run's priority.
     * </p>
     * 
     * @param priority
     *        The run's priority.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The run's priority.
     * </p>
     * 
     * @return The run's priority.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The run's priority.
     * </p>
     * 
     * @param priority
     *        The run's priority.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRunResult withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * The run's resource digests.
     * </p>
     * 
     * @return The run's resource digests.
     */

    public java.util.Map<String, String> getResourceDigests() {
        return resourceDigests;
    }

    /**
     * <p>
     * The run's resource digests.
     * </p>
     * 
     * @param resourceDigests
     *        The run's resource digests.
     */

    public void setResourceDigests(java.util.Map<String, String> resourceDigests) {
        this.resourceDigests = resourceDigests;
    }

    /**
     * <p>
     * The run's resource digests.
     * </p>
     * 
     * @param resourceDigests
     *        The run's resource digests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRunResult withResourceDigests(java.util.Map<String, String> resourceDigests) {
        setResourceDigests(resourceDigests);
        return this;
    }

    /**
     * Add a single ResourceDigests entry
     *
     * @see GetRunResult#withResourceDigests
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetRunResult addResourceDigestsEntry(String key, String value) {
        if (null == this.resourceDigests) {
            this.resourceDigests = new java.util.HashMap<String, String>();
        }
        if (this.resourceDigests.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.resourceDigests.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ResourceDigests.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRunResult clearResourceDigestsEntries() {
        this.resourceDigests = null;
        return this;
    }

    /**
     * <p>
     * The run's service role ARN.
     * </p>
     * 
     * @param roleArn
     *        The run's service role ARN.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The run's service role ARN.
     * </p>
     * 
     * @return The run's service role ARN.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The run's service role ARN.
     * </p>
     * 
     * @param roleArn
     *        The run's service role ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRunResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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

    public GetRunResult withRunGroupId(String runGroupId) {
        setRunGroupId(runGroupId);
        return this;
    }

    /**
     * <p>
     * The run's ID.
     * </p>
     * 
     * @param runId
     *        The run's ID.
     */

    public void setRunId(String runId) {
        this.runId = runId;
    }

    /**
     * <p>
     * The run's ID.
     * </p>
     * 
     * @return The run's ID.
     */

    public String getRunId() {
        return this.runId;
    }

    /**
     * <p>
     * The run's ID.
     * </p>
     * 
     * @param runId
     *        The run's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRunResult withRunId(String runId) {
        setRunId(runId);
        return this;
    }

    /**
     * <p>
     * When the run started.
     * </p>
     * 
     * @param startTime
     *        When the run started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * When the run started.
     * </p>
     * 
     * @return When the run started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * When the run started.
     * </p>
     * 
     * @param startTime
     *        When the run started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRunResult withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * Who started the run.
     * </p>
     * 
     * @param startedBy
     *        Who started the run.
     */

    public void setStartedBy(String startedBy) {
        this.startedBy = startedBy;
    }

    /**
     * <p>
     * Who started the run.
     * </p>
     * 
     * @return Who started the run.
     */

    public String getStartedBy() {
        return this.startedBy;
    }

    /**
     * <p>
     * Who started the run.
     * </p>
     * 
     * @param startedBy
     *        Who started the run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRunResult withStartedBy(String startedBy) {
        setStartedBy(startedBy);
        return this;
    }

    /**
     * <p>
     * The run's status.
     * </p>
     * 
     * @param status
     *        The run's status.
     * @see RunStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The run's status.
     * </p>
     * 
     * @return The run's status.
     * @see RunStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The run's status.
     * </p>
     * 
     * @param status
     *        The run's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RunStatus
     */

    public GetRunResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The run's status.
     * </p>
     * 
     * @param status
     *        The run's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RunStatus
     */

    public GetRunResult withStatus(RunStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The run's status message.
     * </p>
     * 
     * @param statusMessage
     *        The run's status message.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * The run's status message.
     * </p>
     * 
     * @return The run's status message.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * The run's status message.
     * </p>
     * 
     * @param statusMessage
     *        The run's status message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRunResult withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The run's stop time.
     * </p>
     * 
     * @param stopTime
     *        The run's stop time.
     */

    public void setStopTime(java.util.Date stopTime) {
        this.stopTime = stopTime;
    }

    /**
     * <p>
     * The run's stop time.
     * </p>
     * 
     * @return The run's stop time.
     */

    public java.util.Date getStopTime() {
        return this.stopTime;
    }

    /**
     * <p>
     * The run's stop time.
     * </p>
     * 
     * @param stopTime
     *        The run's stop time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRunResult withStopTime(java.util.Date stopTime) {
        setStopTime(stopTime);
        return this;
    }

    /**
     * <p>
     * The run's storage capacity.
     * </p>
     * 
     * @param storageCapacity
     *        The run's storage capacity.
     */

    public void setStorageCapacity(Integer storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    /**
     * <p>
     * The run's storage capacity.
     * </p>
     * 
     * @return The run's storage capacity.
     */

    public Integer getStorageCapacity() {
        return this.storageCapacity;
    }

    /**
     * <p>
     * The run's storage capacity.
     * </p>
     * 
     * @param storageCapacity
     *        The run's storage capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRunResult withStorageCapacity(Integer storageCapacity) {
        setStorageCapacity(storageCapacity);
        return this;
    }

    /**
     * <p>
     * The run's tags.
     * </p>
     * 
     * @return The run's tags.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The run's tags.
     * </p>
     * 
     * @param tags
     *        The run's tags.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The run's tags.
     * </p>
     * 
     * @param tags
     *        The run's tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRunResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetRunResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetRunResult addTagsEntry(String key, String value) {
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

    public GetRunResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

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

    public GetRunResult withWorkflowId(String workflowId) {
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

    public GetRunResult withWorkflowType(String workflowType) {
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

    public GetRunResult withWorkflowType(WorkflowType workflowType) {
        this.workflowType = workflowType.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getDefinition() != null)
            sb.append("Definition: ").append(getDefinition()).append(",");
        if (getDigest() != null)
            sb.append("Digest: ").append(getDigest()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLogLevel() != null)
            sb.append("LogLevel: ").append(getLogLevel()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOutputUri() != null)
            sb.append("OutputUri: ").append(getOutputUri()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getResourceDigests() != null)
            sb.append("ResourceDigests: ").append(getResourceDigests()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getRunGroupId() != null)
            sb.append("RunGroupId: ").append(getRunGroupId()).append(",");
        if (getRunId() != null)
            sb.append("RunId: ").append(getRunId()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getStartedBy() != null)
            sb.append("StartedBy: ").append(getStartedBy()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getStopTime() != null)
            sb.append("StopTime: ").append(getStopTime()).append(",");
        if (getStorageCapacity() != null)
            sb.append("StorageCapacity: ").append(getStorageCapacity()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getWorkflowId() != null)
            sb.append("WorkflowId: ").append(getWorkflowId()).append(",");
        if (getWorkflowType() != null)
            sb.append("WorkflowType: ").append(getWorkflowType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRunResult == false)
            return false;
        GetRunResult other = (GetRunResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDefinition() == null ^ this.getDefinition() == null)
            return false;
        if (other.getDefinition() != null && other.getDefinition().equals(this.getDefinition()) == false)
            return false;
        if (other.getDigest() == null ^ this.getDigest() == null)
            return false;
        if (other.getDigest() != null && other.getDigest().equals(this.getDigest()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLogLevel() == null ^ this.getLogLevel() == null)
            return false;
        if (other.getLogLevel() != null && other.getLogLevel().equals(this.getLogLevel()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOutputUri() == null ^ this.getOutputUri() == null)
            return false;
        if (other.getOutputUri() != null && other.getOutputUri().equals(this.getOutputUri()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getResourceDigests() == null ^ this.getResourceDigests() == null)
            return false;
        if (other.getResourceDigests() != null && other.getResourceDigests().equals(this.getResourceDigests()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getRunGroupId() == null ^ this.getRunGroupId() == null)
            return false;
        if (other.getRunGroupId() != null && other.getRunGroupId().equals(this.getRunGroupId()) == false)
            return false;
        if (other.getRunId() == null ^ this.getRunId() == null)
            return false;
        if (other.getRunId() != null && other.getRunId().equals(this.getRunId()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getStartedBy() == null ^ this.getStartedBy() == null)
            return false;
        if (other.getStartedBy() != null && other.getStartedBy().equals(this.getStartedBy()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getStopTime() == null ^ this.getStopTime() == null)
            return false;
        if (other.getStopTime() != null && other.getStopTime().equals(this.getStopTime()) == false)
            return false;
        if (other.getStorageCapacity() == null ^ this.getStorageCapacity() == null)
            return false;
        if (other.getStorageCapacity() != null && other.getStorageCapacity().equals(this.getStorageCapacity()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getWorkflowId() == null ^ this.getWorkflowId() == null)
            return false;
        if (other.getWorkflowId() != null && other.getWorkflowId().equals(this.getWorkflowId()) == false)
            return false;
        if (other.getWorkflowType() == null ^ this.getWorkflowType() == null)
            return false;
        if (other.getWorkflowType() != null && other.getWorkflowType().equals(this.getWorkflowType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDefinition() == null) ? 0 : getDefinition().hashCode());
        hashCode = prime * hashCode + ((getDigest() == null) ? 0 : getDigest().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLogLevel() == null) ? 0 : getLogLevel().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOutputUri() == null) ? 0 : getOutputUri().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getResourceDigests() == null) ? 0 : getResourceDigests().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getRunGroupId() == null) ? 0 : getRunGroupId().hashCode());
        hashCode = prime * hashCode + ((getRunId() == null) ? 0 : getRunId().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getStartedBy() == null) ? 0 : getStartedBy().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getStopTime() == null) ? 0 : getStopTime().hashCode());
        hashCode = prime * hashCode + ((getStorageCapacity() == null) ? 0 : getStorageCapacity().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getWorkflowId() == null) ? 0 : getWorkflowId().hashCode());
        hashCode = prime * hashCode + ((getWorkflowType() == null) ? 0 : getWorkflowType().hashCode());
        return hashCode;
    }

    @Override
    public GetRunResult clone() {
        try {
            return (GetRunResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
