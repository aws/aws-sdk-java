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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UpdateAgentStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAgentStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The identifier of the agent status.
     * </p>
     */
    private String agentStatusId;
    /**
     * <p>
     * The name of the agent status.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the agent status.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The state of the agent status.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The display order of the agent status.
     * </p>
     */
    private Integer displayOrder;
    /**
     * <p>
     * A number indicating the reset order of the agent status.
     * </p>
     */
    private Boolean resetOrderNumber;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgentStatusRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The identifier of the agent status.
     * </p>
     * 
     * @param agentStatusId
     *        The identifier of the agent status.
     */

    public void setAgentStatusId(String agentStatusId) {
        this.agentStatusId = agentStatusId;
    }

    /**
     * <p>
     * The identifier of the agent status.
     * </p>
     * 
     * @return The identifier of the agent status.
     */

    public String getAgentStatusId() {
        return this.agentStatusId;
    }

    /**
     * <p>
     * The identifier of the agent status.
     * </p>
     * 
     * @param agentStatusId
     *        The identifier of the agent status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgentStatusRequest withAgentStatusId(String agentStatusId) {
        setAgentStatusId(agentStatusId);
        return this;
    }

    /**
     * <p>
     * The name of the agent status.
     * </p>
     * 
     * @param name
     *        The name of the agent status.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the agent status.
     * </p>
     * 
     * @return The name of the agent status.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the agent status.
     * </p>
     * 
     * @param name
     *        The name of the agent status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgentStatusRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the agent status.
     * </p>
     * 
     * @param description
     *        The description of the agent status.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the agent status.
     * </p>
     * 
     * @return The description of the agent status.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the agent status.
     * </p>
     * 
     * @param description
     *        The description of the agent status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgentStatusRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The state of the agent status.
     * </p>
     * 
     * @param state
     *        The state of the agent status.
     * @see AgentStatusState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the agent status.
     * </p>
     * 
     * @return The state of the agent status.
     * @see AgentStatusState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the agent status.
     * </p>
     * 
     * @param state
     *        The state of the agent status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentStatusState
     */

    public UpdateAgentStatusRequest withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the agent status.
     * </p>
     * 
     * @param state
     *        The state of the agent status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentStatusState
     */

    public UpdateAgentStatusRequest withState(AgentStatusState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The display order of the agent status.
     * </p>
     * 
     * @param displayOrder
     *        The display order of the agent status.
     */

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    /**
     * <p>
     * The display order of the agent status.
     * </p>
     * 
     * @return The display order of the agent status.
     */

    public Integer getDisplayOrder() {
        return this.displayOrder;
    }

    /**
     * <p>
     * The display order of the agent status.
     * </p>
     * 
     * @param displayOrder
     *        The display order of the agent status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgentStatusRequest withDisplayOrder(Integer displayOrder) {
        setDisplayOrder(displayOrder);
        return this;
    }

    /**
     * <p>
     * A number indicating the reset order of the agent status.
     * </p>
     * 
     * @param resetOrderNumber
     *        A number indicating the reset order of the agent status.
     */

    public void setResetOrderNumber(Boolean resetOrderNumber) {
        this.resetOrderNumber = resetOrderNumber;
    }

    /**
     * <p>
     * A number indicating the reset order of the agent status.
     * </p>
     * 
     * @return A number indicating the reset order of the agent status.
     */

    public Boolean getResetOrderNumber() {
        return this.resetOrderNumber;
    }

    /**
     * <p>
     * A number indicating the reset order of the agent status.
     * </p>
     * 
     * @param resetOrderNumber
     *        A number indicating the reset order of the agent status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAgentStatusRequest withResetOrderNumber(Boolean resetOrderNumber) {
        setResetOrderNumber(resetOrderNumber);
        return this;
    }

    /**
     * <p>
     * A number indicating the reset order of the agent status.
     * </p>
     * 
     * @return A number indicating the reset order of the agent status.
     */

    public Boolean isResetOrderNumber() {
        return this.resetOrderNumber;
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getAgentStatusId() != null)
            sb.append("AgentStatusId: ").append(getAgentStatusId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getDisplayOrder() != null)
            sb.append("DisplayOrder: ").append(getDisplayOrder()).append(",");
        if (getResetOrderNumber() != null)
            sb.append("ResetOrderNumber: ").append(getResetOrderNumber());
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
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getAgentStatusId() == null ^ this.getAgentStatusId() == null)
            return false;
        if (other.getAgentStatusId() != null && other.getAgentStatusId().equals(this.getAgentStatusId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getDisplayOrder() == null ^ this.getDisplayOrder() == null)
            return false;
        if (other.getDisplayOrder() != null && other.getDisplayOrder().equals(this.getDisplayOrder()) == false)
            return false;
        if (other.getResetOrderNumber() == null ^ this.getResetOrderNumber() == null)
            return false;
        if (other.getResetOrderNumber() != null && other.getResetOrderNumber().equals(this.getResetOrderNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getAgentStatusId() == null) ? 0 : getAgentStatusId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getDisplayOrder() == null) ? 0 : getDisplayOrder().hashCode());
        hashCode = prime * hashCode + ((getResetOrderNumber() == null) ? 0 : getResetOrderNumber().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAgentStatusRequest clone() {
        return (UpdateAgentStatusRequest) super.clone();
    }

}
