/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/DescribeFlow" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFlowResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The flow's Amazon Resource Name (ARN).
     * </p>
     */
    private String flowArn;
    /**
     * <p>
     * A description of the flow.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The specified name of the flow. Spaces are not allowed. Use underscores (_) or hyphens (-) only.
     * </p>
     */
    private String flowName;
    /**
     * <p>
     * The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is
     * required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here, Amazon
     * AppFlow uses the Amazon AppFlow-managed KMS key.
     * </p>
     */
    private String kmsArn;
    /**
     * <p>
     * Indicates the current status of the flow.
     * </p>
     */
    private String flowStatus;
    /**
     * <p>
     * Contains an error message if the flow status is in a suspended or error state. This applies only to scheduled or
     * event-triggered flows.
     * </p>
     */
    private String flowStatusMessage;
    /**
     * <p>
     * The configuration that controls how Amazon AppFlow retrieves data from the source connector.
     * </p>
     */
    private SourceFlowConfig sourceFlowConfig;
    /**
     * <p>
     * The configuration that controls how Amazon AppFlow transfers data to the destination connector.
     * </p>
     */
    private java.util.List<DestinationFlowConfig> destinationFlowConfigList;
    /**
     * <p>
     * Describes the details of the most recent flow run.
     * </p>
     */
    private ExecutionDetails lastRunExecutionDetails;
    /**
     * <p>
     * The trigger settings that determine how and when the flow runs.
     * </p>
     */
    private TriggerConfig triggerConfig;
    /**
     * <p>
     * A list of tasks that Amazon AppFlow performs while transferring the data in the flow run.
     * </p>
     */
    private java.util.List<Task> tasks;
    /**
     * <p>
     * Specifies when the flow was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * Specifies when the flow was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The ARN of the user who created the flow.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * Specifies the user name of the account that performed the most recent update.
     * </p>
     */
    private String lastUpdatedBy;
    /**
     * <p>
     * The tags used to organize, track, or control access for your flow.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The flow's Amazon Resource Name (ARN).
     * </p>
     * 
     * @param flowArn
     *        The flow's Amazon Resource Name (ARN).
     */

    public void setFlowArn(String flowArn) {
        this.flowArn = flowArn;
    }

    /**
     * <p>
     * The flow's Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The flow's Amazon Resource Name (ARN).
     */

    public String getFlowArn() {
        return this.flowArn;
    }

    /**
     * <p>
     * The flow's Amazon Resource Name (ARN).
     * </p>
     * 
     * @param flowArn
     *        The flow's Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFlowResult withFlowArn(String flowArn) {
        setFlowArn(flowArn);
        return this;
    }

    /**
     * <p>
     * A description of the flow.
     * </p>
     * 
     * @param description
     *        A description of the flow.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the flow.
     * </p>
     * 
     * @return A description of the flow.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the flow.
     * </p>
     * 
     * @param description
     *        A description of the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFlowResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The specified name of the flow. Spaces are not allowed. Use underscores (_) or hyphens (-) only.
     * </p>
     * 
     * @param flowName
     *        The specified name of the flow. Spaces are not allowed. Use underscores (_) or hyphens (-) only.
     */

    public void setFlowName(String flowName) {
        this.flowName = flowName;
    }

    /**
     * <p>
     * The specified name of the flow. Spaces are not allowed. Use underscores (_) or hyphens (-) only.
     * </p>
     * 
     * @return The specified name of the flow. Spaces are not allowed. Use underscores (_) or hyphens (-) only.
     */

    public String getFlowName() {
        return this.flowName;
    }

    /**
     * <p>
     * The specified name of the flow. Spaces are not allowed. Use underscores (_) or hyphens (-) only.
     * </p>
     * 
     * @param flowName
     *        The specified name of the flow. Spaces are not allowed. Use underscores (_) or hyphens (-) only.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFlowResult withFlowName(String flowName) {
        setFlowName(flowName);
        return this;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is
     * required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here, Amazon
     * AppFlow uses the Amazon AppFlow-managed KMS key.
     * </p>
     * 
     * @param kmsArn
     *        The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is
     *        required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here,
     *        Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
     */

    public void setKmsArn(String kmsArn) {
        this.kmsArn = kmsArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is
     * required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here, Amazon
     * AppFlow uses the Amazon AppFlow-managed KMS key.
     * </p>
     * 
     * @return The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This
     *         is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything
     *         here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
     */

    public String getKmsArn() {
        return this.kmsArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is
     * required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here, Amazon
     * AppFlow uses the Amazon AppFlow-managed KMS key.
     * </p>
     * 
     * @param kmsArn
     *        The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is
     *        required if you do not want to use the Amazon AppFlow-managed KMS key. If you don't provide anything here,
     *        Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFlowResult withKmsArn(String kmsArn) {
        setKmsArn(kmsArn);
        return this;
    }

    /**
     * <p>
     * Indicates the current status of the flow.
     * </p>
     * 
     * @param flowStatus
     *        Indicates the current status of the flow.
     * @see FlowStatus
     */

    public void setFlowStatus(String flowStatus) {
        this.flowStatus = flowStatus;
    }

    /**
     * <p>
     * Indicates the current status of the flow.
     * </p>
     * 
     * @return Indicates the current status of the flow.
     * @see FlowStatus
     */

    public String getFlowStatus() {
        return this.flowStatus;
    }

    /**
     * <p>
     * Indicates the current status of the flow.
     * </p>
     * 
     * @param flowStatus
     *        Indicates the current status of the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlowStatus
     */

    public DescribeFlowResult withFlowStatus(String flowStatus) {
        setFlowStatus(flowStatus);
        return this;
    }

    /**
     * <p>
     * Indicates the current status of the flow.
     * </p>
     * 
     * @param flowStatus
     *        Indicates the current status of the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FlowStatus
     */

    public DescribeFlowResult withFlowStatus(FlowStatus flowStatus) {
        this.flowStatus = flowStatus.toString();
        return this;
    }

    /**
     * <p>
     * Contains an error message if the flow status is in a suspended or error state. This applies only to scheduled or
     * event-triggered flows.
     * </p>
     * 
     * @param flowStatusMessage
     *        Contains an error message if the flow status is in a suspended or error state. This applies only to
     *        scheduled or event-triggered flows.
     */

    public void setFlowStatusMessage(String flowStatusMessage) {
        this.flowStatusMessage = flowStatusMessage;
    }

    /**
     * <p>
     * Contains an error message if the flow status is in a suspended or error state. This applies only to scheduled or
     * event-triggered flows.
     * </p>
     * 
     * @return Contains an error message if the flow status is in a suspended or error state. This applies only to
     *         scheduled or event-triggered flows.
     */

    public String getFlowStatusMessage() {
        return this.flowStatusMessage;
    }

    /**
     * <p>
     * Contains an error message if the flow status is in a suspended or error state. This applies only to scheduled or
     * event-triggered flows.
     * </p>
     * 
     * @param flowStatusMessage
     *        Contains an error message if the flow status is in a suspended or error state. This applies only to
     *        scheduled or event-triggered flows.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFlowResult withFlowStatusMessage(String flowStatusMessage) {
        setFlowStatusMessage(flowStatusMessage);
        return this;
    }

    /**
     * <p>
     * The configuration that controls how Amazon AppFlow retrieves data from the source connector.
     * </p>
     * 
     * @param sourceFlowConfig
     *        The configuration that controls how Amazon AppFlow retrieves data from the source connector.
     */

    public void setSourceFlowConfig(SourceFlowConfig sourceFlowConfig) {
        this.sourceFlowConfig = sourceFlowConfig;
    }

    /**
     * <p>
     * The configuration that controls how Amazon AppFlow retrieves data from the source connector.
     * </p>
     * 
     * @return The configuration that controls how Amazon AppFlow retrieves data from the source connector.
     */

    public SourceFlowConfig getSourceFlowConfig() {
        return this.sourceFlowConfig;
    }

    /**
     * <p>
     * The configuration that controls how Amazon AppFlow retrieves data from the source connector.
     * </p>
     * 
     * @param sourceFlowConfig
     *        The configuration that controls how Amazon AppFlow retrieves data from the source connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFlowResult withSourceFlowConfig(SourceFlowConfig sourceFlowConfig) {
        setSourceFlowConfig(sourceFlowConfig);
        return this;
    }

    /**
     * <p>
     * The configuration that controls how Amazon AppFlow transfers data to the destination connector.
     * </p>
     * 
     * @return The configuration that controls how Amazon AppFlow transfers data to the destination connector.
     */

    public java.util.List<DestinationFlowConfig> getDestinationFlowConfigList() {
        return destinationFlowConfigList;
    }

    /**
     * <p>
     * The configuration that controls how Amazon AppFlow transfers data to the destination connector.
     * </p>
     * 
     * @param destinationFlowConfigList
     *        The configuration that controls how Amazon AppFlow transfers data to the destination connector.
     */

    public void setDestinationFlowConfigList(java.util.Collection<DestinationFlowConfig> destinationFlowConfigList) {
        if (destinationFlowConfigList == null) {
            this.destinationFlowConfigList = null;
            return;
        }

        this.destinationFlowConfigList = new java.util.ArrayList<DestinationFlowConfig>(destinationFlowConfigList);
    }

    /**
     * <p>
     * The configuration that controls how Amazon AppFlow transfers data to the destination connector.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinationFlowConfigList(java.util.Collection)} or
     * {@link #withDestinationFlowConfigList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param destinationFlowConfigList
     *        The configuration that controls how Amazon AppFlow transfers data to the destination connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFlowResult withDestinationFlowConfigList(DestinationFlowConfig... destinationFlowConfigList) {
        if (this.destinationFlowConfigList == null) {
            setDestinationFlowConfigList(new java.util.ArrayList<DestinationFlowConfig>(destinationFlowConfigList.length));
        }
        for (DestinationFlowConfig ele : destinationFlowConfigList) {
            this.destinationFlowConfigList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The configuration that controls how Amazon AppFlow transfers data to the destination connector.
     * </p>
     * 
     * @param destinationFlowConfigList
     *        The configuration that controls how Amazon AppFlow transfers data to the destination connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFlowResult withDestinationFlowConfigList(java.util.Collection<DestinationFlowConfig> destinationFlowConfigList) {
        setDestinationFlowConfigList(destinationFlowConfigList);
        return this;
    }

    /**
     * <p>
     * Describes the details of the most recent flow run.
     * </p>
     * 
     * @param lastRunExecutionDetails
     *        Describes the details of the most recent flow run.
     */

    public void setLastRunExecutionDetails(ExecutionDetails lastRunExecutionDetails) {
        this.lastRunExecutionDetails = lastRunExecutionDetails;
    }

    /**
     * <p>
     * Describes the details of the most recent flow run.
     * </p>
     * 
     * @return Describes the details of the most recent flow run.
     */

    public ExecutionDetails getLastRunExecutionDetails() {
        return this.lastRunExecutionDetails;
    }

    /**
     * <p>
     * Describes the details of the most recent flow run.
     * </p>
     * 
     * @param lastRunExecutionDetails
     *        Describes the details of the most recent flow run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFlowResult withLastRunExecutionDetails(ExecutionDetails lastRunExecutionDetails) {
        setLastRunExecutionDetails(lastRunExecutionDetails);
        return this;
    }

    /**
     * <p>
     * The trigger settings that determine how and when the flow runs.
     * </p>
     * 
     * @param triggerConfig
     *        The trigger settings that determine how and when the flow runs.
     */

    public void setTriggerConfig(TriggerConfig triggerConfig) {
        this.triggerConfig = triggerConfig;
    }

    /**
     * <p>
     * The trigger settings that determine how and when the flow runs.
     * </p>
     * 
     * @return The trigger settings that determine how and when the flow runs.
     */

    public TriggerConfig getTriggerConfig() {
        return this.triggerConfig;
    }

    /**
     * <p>
     * The trigger settings that determine how and when the flow runs.
     * </p>
     * 
     * @param triggerConfig
     *        The trigger settings that determine how and when the flow runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFlowResult withTriggerConfig(TriggerConfig triggerConfig) {
        setTriggerConfig(triggerConfig);
        return this;
    }

    /**
     * <p>
     * A list of tasks that Amazon AppFlow performs while transferring the data in the flow run.
     * </p>
     * 
     * @return A list of tasks that Amazon AppFlow performs while transferring the data in the flow run.
     */

    public java.util.List<Task> getTasks() {
        return tasks;
    }

    /**
     * <p>
     * A list of tasks that Amazon AppFlow performs while transferring the data in the flow run.
     * </p>
     * 
     * @param tasks
     *        A list of tasks that Amazon AppFlow performs while transferring the data in the flow run.
     */

    public void setTasks(java.util.Collection<Task> tasks) {
        if (tasks == null) {
            this.tasks = null;
            return;
        }

        this.tasks = new java.util.ArrayList<Task>(tasks);
    }

    /**
     * <p>
     * A list of tasks that Amazon AppFlow performs while transferring the data in the flow run.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTasks(java.util.Collection)} or {@link #withTasks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tasks
     *        A list of tasks that Amazon AppFlow performs while transferring the data in the flow run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFlowResult withTasks(Task... tasks) {
        if (this.tasks == null) {
            setTasks(new java.util.ArrayList<Task>(tasks.length));
        }
        for (Task ele : tasks) {
            this.tasks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tasks that Amazon AppFlow performs while transferring the data in the flow run.
     * </p>
     * 
     * @param tasks
     *        A list of tasks that Amazon AppFlow performs while transferring the data in the flow run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFlowResult withTasks(java.util.Collection<Task> tasks) {
        setTasks(tasks);
        return this;
    }

    /**
     * <p>
     * Specifies when the flow was created.
     * </p>
     * 
     * @param createdAt
     *        Specifies when the flow was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * Specifies when the flow was created.
     * </p>
     * 
     * @return Specifies when the flow was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * Specifies when the flow was created.
     * </p>
     * 
     * @param createdAt
     *        Specifies when the flow was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFlowResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Specifies when the flow was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        Specifies when the flow was last updated.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * Specifies when the flow was last updated.
     * </p>
     * 
     * @return Specifies when the flow was last updated.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * Specifies when the flow was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        Specifies when the flow was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFlowResult withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The ARN of the user who created the flow.
     * </p>
     * 
     * @param createdBy
     *        The ARN of the user who created the flow.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The ARN of the user who created the flow.
     * </p>
     * 
     * @return The ARN of the user who created the flow.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The ARN of the user who created the flow.
     * </p>
     * 
     * @param createdBy
     *        The ARN of the user who created the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFlowResult withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * Specifies the user name of the account that performed the most recent update.
     * </p>
     * 
     * @param lastUpdatedBy
     *        Specifies the user name of the account that performed the most recent update.
     */

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /**
     * <p>
     * Specifies the user name of the account that performed the most recent update.
     * </p>
     * 
     * @return Specifies the user name of the account that performed the most recent update.
     */

    public String getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    /**
     * <p>
     * Specifies the user name of the account that performed the most recent update.
     * </p>
     * 
     * @param lastUpdatedBy
     *        Specifies the user name of the account that performed the most recent update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFlowResult withLastUpdatedBy(String lastUpdatedBy) {
        setLastUpdatedBy(lastUpdatedBy);
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for your flow.
     * </p>
     * 
     * @return The tags used to organize, track, or control access for your flow.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for your flow.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for your flow.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for your flow.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for your flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFlowResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see DescribeFlowResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFlowResult addTagsEntry(String key, String value) {
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

    public DescribeFlowResult clearTagsEntries() {
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
        if (getFlowArn() != null)
            sb.append("FlowArn: ").append(getFlowArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getFlowName() != null)
            sb.append("FlowName: ").append(getFlowName()).append(",");
        if (getKmsArn() != null)
            sb.append("KmsArn: ").append(getKmsArn()).append(",");
        if (getFlowStatus() != null)
            sb.append("FlowStatus: ").append(getFlowStatus()).append(",");
        if (getFlowStatusMessage() != null)
            sb.append("FlowStatusMessage: ").append(getFlowStatusMessage()).append(",");
        if (getSourceFlowConfig() != null)
            sb.append("SourceFlowConfig: ").append(getSourceFlowConfig()).append(",");
        if (getDestinationFlowConfigList() != null)
            sb.append("DestinationFlowConfigList: ").append(getDestinationFlowConfigList()).append(",");
        if (getLastRunExecutionDetails() != null)
            sb.append("LastRunExecutionDetails: ").append(getLastRunExecutionDetails()).append(",");
        if (getTriggerConfig() != null)
            sb.append("TriggerConfig: ").append(getTriggerConfig()).append(",");
        if (getTasks() != null)
            sb.append("Tasks: ").append(getTasks()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getLastUpdatedBy() != null)
            sb.append("LastUpdatedBy: ").append(getLastUpdatedBy()).append(",");
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

        if (obj instanceof DescribeFlowResult == false)
            return false;
        DescribeFlowResult other = (DescribeFlowResult) obj;
        if (other.getFlowArn() == null ^ this.getFlowArn() == null)
            return false;
        if (other.getFlowArn() != null && other.getFlowArn().equals(this.getFlowArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getFlowName() == null ^ this.getFlowName() == null)
            return false;
        if (other.getFlowName() != null && other.getFlowName().equals(this.getFlowName()) == false)
            return false;
        if (other.getKmsArn() == null ^ this.getKmsArn() == null)
            return false;
        if (other.getKmsArn() != null && other.getKmsArn().equals(this.getKmsArn()) == false)
            return false;
        if (other.getFlowStatus() == null ^ this.getFlowStatus() == null)
            return false;
        if (other.getFlowStatus() != null && other.getFlowStatus().equals(this.getFlowStatus()) == false)
            return false;
        if (other.getFlowStatusMessage() == null ^ this.getFlowStatusMessage() == null)
            return false;
        if (other.getFlowStatusMessage() != null && other.getFlowStatusMessage().equals(this.getFlowStatusMessage()) == false)
            return false;
        if (other.getSourceFlowConfig() == null ^ this.getSourceFlowConfig() == null)
            return false;
        if (other.getSourceFlowConfig() != null && other.getSourceFlowConfig().equals(this.getSourceFlowConfig()) == false)
            return false;
        if (other.getDestinationFlowConfigList() == null ^ this.getDestinationFlowConfigList() == null)
            return false;
        if (other.getDestinationFlowConfigList() != null && other.getDestinationFlowConfigList().equals(this.getDestinationFlowConfigList()) == false)
            return false;
        if (other.getLastRunExecutionDetails() == null ^ this.getLastRunExecutionDetails() == null)
            return false;
        if (other.getLastRunExecutionDetails() != null && other.getLastRunExecutionDetails().equals(this.getLastRunExecutionDetails()) == false)
            return false;
        if (other.getTriggerConfig() == null ^ this.getTriggerConfig() == null)
            return false;
        if (other.getTriggerConfig() != null && other.getTriggerConfig().equals(this.getTriggerConfig()) == false)
            return false;
        if (other.getTasks() == null ^ this.getTasks() == null)
            return false;
        if (other.getTasks() != null && other.getTasks().equals(this.getTasks()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getLastUpdatedBy() == null ^ this.getLastUpdatedBy() == null)
            return false;
        if (other.getLastUpdatedBy() != null && other.getLastUpdatedBy().equals(this.getLastUpdatedBy()) == false)
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

        hashCode = prime * hashCode + ((getFlowArn() == null) ? 0 : getFlowArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getFlowName() == null) ? 0 : getFlowName().hashCode());
        hashCode = prime * hashCode + ((getKmsArn() == null) ? 0 : getKmsArn().hashCode());
        hashCode = prime * hashCode + ((getFlowStatus() == null) ? 0 : getFlowStatus().hashCode());
        hashCode = prime * hashCode + ((getFlowStatusMessage() == null) ? 0 : getFlowStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getSourceFlowConfig() == null) ? 0 : getSourceFlowConfig().hashCode());
        hashCode = prime * hashCode + ((getDestinationFlowConfigList() == null) ? 0 : getDestinationFlowConfigList().hashCode());
        hashCode = prime * hashCode + ((getLastRunExecutionDetails() == null) ? 0 : getLastRunExecutionDetails().hashCode());
        hashCode = prime * hashCode + ((getTriggerConfig() == null) ? 0 : getTriggerConfig().hashCode());
        hashCode = prime * hashCode + ((getTasks() == null) ? 0 : getTasks().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedBy() == null) ? 0 : getLastUpdatedBy().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFlowResult clone() {
        try {
            return (DescribeFlowResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
