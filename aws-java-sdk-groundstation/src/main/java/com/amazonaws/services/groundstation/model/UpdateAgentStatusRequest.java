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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/UpdateAgentStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAgentStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * UUID of agent to update.
     * </p>
     */
    private String agentId;
    /**
     * <p>
     * Aggregate status for agent.
     * </p>
     */
    private AggregateStatus aggregateStatus;
    /**
     * <p>
     * List of component statuses for agent.
     * </p>
     */
    private java.util.List<ComponentStatusData> componentStatuses;
    /**
     * <p>
     * GUID of agent task.
     * </p>
     */
    private String taskId;

    /**
     * <p>
     * UUID of agent to update.
     * </p>
     * 
     * @param agentId
     *        UUID of agent to update.
     */

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    /**
     * <p>
     * UUID of agent to update.
     * </p>
     * 
     * @return UUID of agent to update.
     */

    public String getAgentId() {
        return this.agentId;
    }

    /**
     * <p>
     * UUID of agent to update.
     * </p>
     * 
     * @param agentId
     *        UUID of agent to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgentStatusRequest withAgentId(String agentId) {
        setAgentId(agentId);
        return this;
    }

    /**
     * <p>
     * Aggregate status for agent.
     * </p>
     * 
     * @param aggregateStatus
     *        Aggregate status for agent.
     */

    public void setAggregateStatus(AggregateStatus aggregateStatus) {
        this.aggregateStatus = aggregateStatus;
    }

    /**
     * <p>
     * Aggregate status for agent.
     * </p>
     * 
     * @return Aggregate status for agent.
     */

    public AggregateStatus getAggregateStatus() {
        return this.aggregateStatus;
    }

    /**
     * <p>
     * Aggregate status for agent.
     * </p>
     * 
     * @param aggregateStatus
     *        Aggregate status for agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgentStatusRequest withAggregateStatus(AggregateStatus aggregateStatus) {
        setAggregateStatus(aggregateStatus);
        return this;
    }

    /**
     * <p>
     * List of component statuses for agent.
     * </p>
     * 
     * @return List of component statuses for agent.
     */

    public java.util.List<ComponentStatusData> getComponentStatuses() {
        return componentStatuses;
    }

    /**
     * <p>
     * List of component statuses for agent.
     * </p>
     * 
     * @param componentStatuses
     *        List of component statuses for agent.
     */

    public void setComponentStatuses(java.util.Collection<ComponentStatusData> componentStatuses) {
        if (componentStatuses == null) {
            this.componentStatuses = null;
            return;
        }

        this.componentStatuses = new java.util.ArrayList<ComponentStatusData>(componentStatuses);
    }

    /**
     * <p>
     * List of component statuses for agent.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComponentStatuses(java.util.Collection)} or {@link #withComponentStatuses(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param componentStatuses
     *        List of component statuses for agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgentStatusRequest withComponentStatuses(ComponentStatusData... componentStatuses) {
        if (this.componentStatuses == null) {
            setComponentStatuses(new java.util.ArrayList<ComponentStatusData>(componentStatuses.length));
        }
        for (ComponentStatusData ele : componentStatuses) {
            this.componentStatuses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of component statuses for agent.
     * </p>
     * 
     * @param componentStatuses
     *        List of component statuses for agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgentStatusRequest withComponentStatuses(java.util.Collection<ComponentStatusData> componentStatuses) {
        setComponentStatuses(componentStatuses);
        return this;
    }

    /**
     * <p>
     * GUID of agent task.
     * </p>
     * 
     * @param taskId
     *        GUID of agent task.
     */

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * GUID of agent task.
     * </p>
     * 
     * @return GUID of agent task.
     */

    public String getTaskId() {
        return this.taskId;
    }

    /**
     * <p>
     * GUID of agent task.
     * </p>
     * 
     * @param taskId
     *        GUID of agent task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgentStatusRequest withTaskId(String taskId) {
        setTaskId(taskId);
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
        if (getAgentId() != null)
            sb.append("AgentId: ").append(getAgentId()).append(",");
        if (getAggregateStatus() != null)
            sb.append("AggregateStatus: ").append(getAggregateStatus()).append(",");
        if (getComponentStatuses() != null)
            sb.append("ComponentStatuses: ").append(getComponentStatuses()).append(",");
        if (getTaskId() != null)
            sb.append("TaskId: ").append(getTaskId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAgentStatusRequest == false)
            return false;
        UpdateAgentStatusRequest other = (UpdateAgentStatusRequest) obj;
        if (other.getAgentId() == null ^ this.getAgentId() == null)
            return false;
        if (other.getAgentId() != null && other.getAgentId().equals(this.getAgentId()) == false)
            return false;
        if (other.getAggregateStatus() == null ^ this.getAggregateStatus() == null)
            return false;
        if (other.getAggregateStatus() != null && other.getAggregateStatus().equals(this.getAggregateStatus()) == false)
            return false;
        if (other.getComponentStatuses() == null ^ this.getComponentStatuses() == null)
            return false;
        if (other.getComponentStatuses() != null && other.getComponentStatuses().equals(this.getComponentStatuses()) == false)
            return false;
        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        hashCode = prime * hashCode + ((getAggregateStatus() == null) ? 0 : getAggregateStatus().hashCode());
        hashCode = prime * hashCode + ((getComponentStatuses() == null) ? 0 : getComponentStatuses().hashCode());
        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAgentStatusRequest clone() {
        return (UpdateAgentStatusRequest) super.clone();
    }

}
