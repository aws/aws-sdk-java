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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/DescribeAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeActionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the action.
     * </p>
     */
    private String actionId;
    /**
     * <p>
     * The resource the action will be taken on.
     * </p>
     */
    private TargetResource targetResource;
    /**
     * <p>
     * The ID of the action definition.
     * </p>
     */
    private String actionDefinitionId;
    /**
     * <p>
     * The JSON payload of the action.
     * </p>
     */
    private ActionPayload actionPayload;
    /**
     * <p>
     * The time the action was executed.
     * </p>
     */
    private java.util.Date executionTime;

    /**
     * <p>
     * The ID of the action.
     * </p>
     * 
     * @param actionId
     *        The ID of the action.
     */

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    /**
     * <p>
     * The ID of the action.
     * </p>
     * 
     * @return The ID of the action.
     */

    public String getActionId() {
        return this.actionId;
    }

    /**
     * <p>
     * The ID of the action.
     * </p>
     * 
     * @param actionId
     *        The ID of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeActionResult withActionId(String actionId) {
        setActionId(actionId);
        return this;
    }

    /**
     * <p>
     * The resource the action will be taken on.
     * </p>
     * 
     * @param targetResource
     *        The resource the action will be taken on.
     */

    public void setTargetResource(TargetResource targetResource) {
        this.targetResource = targetResource;
    }

    /**
     * <p>
     * The resource the action will be taken on.
     * </p>
     * 
     * @return The resource the action will be taken on.
     */

    public TargetResource getTargetResource() {
        return this.targetResource;
    }

    /**
     * <p>
     * The resource the action will be taken on.
     * </p>
     * 
     * @param targetResource
     *        The resource the action will be taken on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeActionResult withTargetResource(TargetResource targetResource) {
        setTargetResource(targetResource);
        return this;
    }

    /**
     * <p>
     * The ID of the action definition.
     * </p>
     * 
     * @param actionDefinitionId
     *        The ID of the action definition.
     */

    public void setActionDefinitionId(String actionDefinitionId) {
        this.actionDefinitionId = actionDefinitionId;
    }

    /**
     * <p>
     * The ID of the action definition.
     * </p>
     * 
     * @return The ID of the action definition.
     */

    public String getActionDefinitionId() {
        return this.actionDefinitionId;
    }

    /**
     * <p>
     * The ID of the action definition.
     * </p>
     * 
     * @param actionDefinitionId
     *        The ID of the action definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeActionResult withActionDefinitionId(String actionDefinitionId) {
        setActionDefinitionId(actionDefinitionId);
        return this;
    }

    /**
     * <p>
     * The JSON payload of the action.
     * </p>
     * 
     * @param actionPayload
     *        The JSON payload of the action.
     */

    public void setActionPayload(ActionPayload actionPayload) {
        this.actionPayload = actionPayload;
    }

    /**
     * <p>
     * The JSON payload of the action.
     * </p>
     * 
     * @return The JSON payload of the action.
     */

    public ActionPayload getActionPayload() {
        return this.actionPayload;
    }

    /**
     * <p>
     * The JSON payload of the action.
     * </p>
     * 
     * @param actionPayload
     *        The JSON payload of the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeActionResult withActionPayload(ActionPayload actionPayload) {
        setActionPayload(actionPayload);
        return this;
    }

    /**
     * <p>
     * The time the action was executed.
     * </p>
     * 
     * @param executionTime
     *        The time the action was executed.
     */

    public void setExecutionTime(java.util.Date executionTime) {
        this.executionTime = executionTime;
    }

    /**
     * <p>
     * The time the action was executed.
     * </p>
     * 
     * @return The time the action was executed.
     */

    public java.util.Date getExecutionTime() {
        return this.executionTime;
    }

    /**
     * <p>
     * The time the action was executed.
     * </p>
     * 
     * @param executionTime
     *        The time the action was executed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeActionResult withExecutionTime(java.util.Date executionTime) {
        setExecutionTime(executionTime);
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
        if (getActionId() != null)
            sb.append("ActionId: ").append(getActionId()).append(",");
        if (getTargetResource() != null)
            sb.append("TargetResource: ").append(getTargetResource()).append(",");
        if (getActionDefinitionId() != null)
            sb.append("ActionDefinitionId: ").append(getActionDefinitionId()).append(",");
        if (getActionPayload() != null)
            sb.append("ActionPayload: ").append(getActionPayload()).append(",");
        if (getExecutionTime() != null)
            sb.append("ExecutionTime: ").append(getExecutionTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeActionResult == false)
            return false;
        DescribeActionResult other = (DescribeActionResult) obj;
        if (other.getActionId() == null ^ this.getActionId() == null)
            return false;
        if (other.getActionId() != null && other.getActionId().equals(this.getActionId()) == false)
            return false;
        if (other.getTargetResource() == null ^ this.getTargetResource() == null)
            return false;
        if (other.getTargetResource() != null && other.getTargetResource().equals(this.getTargetResource()) == false)
            return false;
        if (other.getActionDefinitionId() == null ^ this.getActionDefinitionId() == null)
            return false;
        if (other.getActionDefinitionId() != null && other.getActionDefinitionId().equals(this.getActionDefinitionId()) == false)
            return false;
        if (other.getActionPayload() == null ^ this.getActionPayload() == null)
            return false;
        if (other.getActionPayload() != null && other.getActionPayload().equals(this.getActionPayload()) == false)
            return false;
        if (other.getExecutionTime() == null ^ this.getExecutionTime() == null)
            return false;
        if (other.getExecutionTime() != null && other.getExecutionTime().equals(this.getExecutionTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionId() == null) ? 0 : getActionId().hashCode());
        hashCode = prime * hashCode + ((getTargetResource() == null) ? 0 : getTargetResource().hashCode());
        hashCode = prime * hashCode + ((getActionDefinitionId() == null) ? 0 : getActionDefinitionId().hashCode());
        hashCode = prime * hashCode + ((getActionPayload() == null) ? 0 : getActionPayload().hashCode());
        hashCode = prime * hashCode + ((getExecutionTime() == null) ? 0 : getExecutionTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeActionResult clone() {
        try {
            return (DescribeActionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
