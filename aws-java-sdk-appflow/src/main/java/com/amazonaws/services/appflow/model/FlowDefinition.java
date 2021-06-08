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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The properties of the flow, such as its source, destination, trigger type, and so on.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/FlowDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FlowDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The flow's Amazon Resource Name (ARN).
     * </p>
     */
    private String flowArn;
    /**
     * <p>
     * A user-entered description of the flow.
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
     * Indicates the current status of the flow.
     * </p>
     */
    private String flowStatus;
    /**
     * <p>
     * Specifies the source connector type, such as Salesforce, Amazon S3, Amplitude, and so on.
     * </p>
     */
    private String sourceConnectorType;
    /**
     * <p>
     * Specifies the destination connector type, such as Salesforce, Amazon S3, Amplitude, and so on.
     * </p>
     */
    private String destinationConnectorType;
    /**
     * <p>
     * Specifies the type of flow trigger. This can be <code>OnDemand</code>, <code>Scheduled</code>, or
     * <code>Event</code>.
     * </p>
     */
    private String triggerType;
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
     * Specifies the account user name that most recently updated the flow.
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
     * Describes the details of the most recent flow run.
     * </p>
     */
    private ExecutionDetails lastRunExecutionDetails;

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

    public FlowDefinition withFlowArn(String flowArn) {
        setFlowArn(flowArn);
        return this;
    }

    /**
     * <p>
     * A user-entered description of the flow.
     * </p>
     * 
     * @param description
     *        A user-entered description of the flow.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A user-entered description of the flow.
     * </p>
     * 
     * @return A user-entered description of the flow.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A user-entered description of the flow.
     * </p>
     * 
     * @param description
     *        A user-entered description of the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowDefinition withDescription(String description) {
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

    public FlowDefinition withFlowName(String flowName) {
        setFlowName(flowName);
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

    public FlowDefinition withFlowStatus(String flowStatus) {
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

    public FlowDefinition withFlowStatus(FlowStatus flowStatus) {
        this.flowStatus = flowStatus.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the source connector type, such as Salesforce, Amazon S3, Amplitude, and so on.
     * </p>
     * 
     * @param sourceConnectorType
     *        Specifies the source connector type, such as Salesforce, Amazon S3, Amplitude, and so on.
     * @see ConnectorType
     */

    public void setSourceConnectorType(String sourceConnectorType) {
        this.sourceConnectorType = sourceConnectorType;
    }

    /**
     * <p>
     * Specifies the source connector type, such as Salesforce, Amazon S3, Amplitude, and so on.
     * </p>
     * 
     * @return Specifies the source connector type, such as Salesforce, Amazon S3, Amplitude, and so on.
     * @see ConnectorType
     */

    public String getSourceConnectorType() {
        return this.sourceConnectorType;
    }

    /**
     * <p>
     * Specifies the source connector type, such as Salesforce, Amazon S3, Amplitude, and so on.
     * </p>
     * 
     * @param sourceConnectorType
     *        Specifies the source connector type, such as Salesforce, Amazon S3, Amplitude, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorType
     */

    public FlowDefinition withSourceConnectorType(String sourceConnectorType) {
        setSourceConnectorType(sourceConnectorType);
        return this;
    }

    /**
     * <p>
     * Specifies the source connector type, such as Salesforce, Amazon S3, Amplitude, and so on.
     * </p>
     * 
     * @param sourceConnectorType
     *        Specifies the source connector type, such as Salesforce, Amazon S3, Amplitude, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorType
     */

    public FlowDefinition withSourceConnectorType(ConnectorType sourceConnectorType) {
        this.sourceConnectorType = sourceConnectorType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the destination connector type, such as Salesforce, Amazon S3, Amplitude, and so on.
     * </p>
     * 
     * @param destinationConnectorType
     *        Specifies the destination connector type, such as Salesforce, Amazon S3, Amplitude, and so on.
     * @see ConnectorType
     */

    public void setDestinationConnectorType(String destinationConnectorType) {
        this.destinationConnectorType = destinationConnectorType;
    }

    /**
     * <p>
     * Specifies the destination connector type, such as Salesforce, Amazon S3, Amplitude, and so on.
     * </p>
     * 
     * @return Specifies the destination connector type, such as Salesforce, Amazon S3, Amplitude, and so on.
     * @see ConnectorType
     */

    public String getDestinationConnectorType() {
        return this.destinationConnectorType;
    }

    /**
     * <p>
     * Specifies the destination connector type, such as Salesforce, Amazon S3, Amplitude, and so on.
     * </p>
     * 
     * @param destinationConnectorType
     *        Specifies the destination connector type, such as Salesforce, Amazon S3, Amplitude, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorType
     */

    public FlowDefinition withDestinationConnectorType(String destinationConnectorType) {
        setDestinationConnectorType(destinationConnectorType);
        return this;
    }

    /**
     * <p>
     * Specifies the destination connector type, such as Salesforce, Amazon S3, Amplitude, and so on.
     * </p>
     * 
     * @param destinationConnectorType
     *        Specifies the destination connector type, such as Salesforce, Amazon S3, Amplitude, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectorType
     */

    public FlowDefinition withDestinationConnectorType(ConnectorType destinationConnectorType) {
        this.destinationConnectorType = destinationConnectorType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the type of flow trigger. This can be <code>OnDemand</code>, <code>Scheduled</code>, or
     * <code>Event</code>.
     * </p>
     * 
     * @param triggerType
     *        Specifies the type of flow trigger. This can be <code>OnDemand</code>, <code>Scheduled</code>, or
     *        <code>Event</code>.
     * @see TriggerType
     */

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    /**
     * <p>
     * Specifies the type of flow trigger. This can be <code>OnDemand</code>, <code>Scheduled</code>, or
     * <code>Event</code>.
     * </p>
     * 
     * @return Specifies the type of flow trigger. This can be <code>OnDemand</code>, <code>Scheduled</code>, or
     *         <code>Event</code>.
     * @see TriggerType
     */

    public String getTriggerType() {
        return this.triggerType;
    }

    /**
     * <p>
     * Specifies the type of flow trigger. This can be <code>OnDemand</code>, <code>Scheduled</code>, or
     * <code>Event</code>.
     * </p>
     * 
     * @param triggerType
     *        Specifies the type of flow trigger. This can be <code>OnDemand</code>, <code>Scheduled</code>, or
     *        <code>Event</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TriggerType
     */

    public FlowDefinition withTriggerType(String triggerType) {
        setTriggerType(triggerType);
        return this;
    }

    /**
     * <p>
     * Specifies the type of flow trigger. This can be <code>OnDemand</code>, <code>Scheduled</code>, or
     * <code>Event</code>.
     * </p>
     * 
     * @param triggerType
     *        Specifies the type of flow trigger. This can be <code>OnDemand</code>, <code>Scheduled</code>, or
     *        <code>Event</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TriggerType
     */

    public FlowDefinition withTriggerType(TriggerType triggerType) {
        this.triggerType = triggerType.toString();
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

    public FlowDefinition withCreatedAt(java.util.Date createdAt) {
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

    public FlowDefinition withLastUpdatedAt(java.util.Date lastUpdatedAt) {
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

    public FlowDefinition withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * Specifies the account user name that most recently updated the flow.
     * </p>
     * 
     * @param lastUpdatedBy
     *        Specifies the account user name that most recently updated the flow.
     */

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /**
     * <p>
     * Specifies the account user name that most recently updated the flow.
     * </p>
     * 
     * @return Specifies the account user name that most recently updated the flow.
     */

    public String getLastUpdatedBy() {
        return this.lastUpdatedBy;
    }

    /**
     * <p>
     * Specifies the account user name that most recently updated the flow.
     * </p>
     * 
     * @param lastUpdatedBy
     *        Specifies the account user name that most recently updated the flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FlowDefinition withLastUpdatedBy(String lastUpdatedBy) {
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

    public FlowDefinition withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see FlowDefinition#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public FlowDefinition addTagsEntry(String key, String value) {
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

    public FlowDefinition clearTagsEntries() {
        this.tags = null;
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

    public FlowDefinition withLastRunExecutionDetails(ExecutionDetails lastRunExecutionDetails) {
        setLastRunExecutionDetails(lastRunExecutionDetails);
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
        if (getFlowStatus() != null)
            sb.append("FlowStatus: ").append(getFlowStatus()).append(",");
        if (getSourceConnectorType() != null)
            sb.append("SourceConnectorType: ").append(getSourceConnectorType()).append(",");
        if (getDestinationConnectorType() != null)
            sb.append("DestinationConnectorType: ").append(getDestinationConnectorType()).append(",");
        if (getTriggerType() != null)
            sb.append("TriggerType: ").append(getTriggerType()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getLastUpdatedBy() != null)
            sb.append("LastUpdatedBy: ").append(getLastUpdatedBy()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getLastRunExecutionDetails() != null)
            sb.append("LastRunExecutionDetails: ").append(getLastRunExecutionDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FlowDefinition == false)
            return false;
        FlowDefinition other = (FlowDefinition) obj;
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
        if (other.getFlowStatus() == null ^ this.getFlowStatus() == null)
            return false;
        if (other.getFlowStatus() != null && other.getFlowStatus().equals(this.getFlowStatus()) == false)
            return false;
        if (other.getSourceConnectorType() == null ^ this.getSourceConnectorType() == null)
            return false;
        if (other.getSourceConnectorType() != null && other.getSourceConnectorType().equals(this.getSourceConnectorType()) == false)
            return false;
        if (other.getDestinationConnectorType() == null ^ this.getDestinationConnectorType() == null)
            return false;
        if (other.getDestinationConnectorType() != null && other.getDestinationConnectorType().equals(this.getDestinationConnectorType()) == false)
            return false;
        if (other.getTriggerType() == null ^ this.getTriggerType() == null)
            return false;
        if (other.getTriggerType() != null && other.getTriggerType().equals(this.getTriggerType()) == false)
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
        if (other.getLastRunExecutionDetails() == null ^ this.getLastRunExecutionDetails() == null)
            return false;
        if (other.getLastRunExecutionDetails() != null && other.getLastRunExecutionDetails().equals(this.getLastRunExecutionDetails()) == false)
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
        hashCode = prime * hashCode + ((getFlowStatus() == null) ? 0 : getFlowStatus().hashCode());
        hashCode = prime * hashCode + ((getSourceConnectorType() == null) ? 0 : getSourceConnectorType().hashCode());
        hashCode = prime * hashCode + ((getDestinationConnectorType() == null) ? 0 : getDestinationConnectorType().hashCode());
        hashCode = prime * hashCode + ((getTriggerType() == null) ? 0 : getTriggerType().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedBy() == null) ? 0 : getLastUpdatedBy().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getLastRunExecutionDetails() == null) ? 0 : getLastRunExecutionDetails().hashCode());
        return hashCode;
    }

    @Override
    public FlowDefinition clone() {
        try {
            return (FlowDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.FlowDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
