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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the summary of the actions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ActionSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the action.
     * </p>
     */
    private String actionId;
    /**
     * <p>
     * The ID of the action definition.
     * </p>
     */
    private String actionDefinitionId;
    /**
     * <p>
     * The resource the action will be taken on.
     * </p>
     */
    private TargetResource targetResource;

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

    public ActionSummary withActionId(String actionId) {
        setActionId(actionId);
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

    public ActionSummary withActionDefinitionId(String actionDefinitionId) {
        setActionDefinitionId(actionDefinitionId);
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

    public ActionSummary withTargetResource(TargetResource targetResource) {
        setTargetResource(targetResource);
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
        if (getActionDefinitionId() != null)
            sb.append("ActionDefinitionId: ").append(getActionDefinitionId()).append(",");
        if (getTargetResource() != null)
            sb.append("TargetResource: ").append(getTargetResource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActionSummary == false)
            return false;
        ActionSummary other = (ActionSummary) obj;
        if (other.getActionId() == null ^ this.getActionId() == null)
            return false;
        if (other.getActionId() != null && other.getActionId().equals(this.getActionId()) == false)
            return false;
        if (other.getActionDefinitionId() == null ^ this.getActionDefinitionId() == null)
            return false;
        if (other.getActionDefinitionId() != null && other.getActionDefinitionId().equals(this.getActionDefinitionId()) == false)
            return false;
        if (other.getTargetResource() == null ^ this.getTargetResource() == null)
            return false;
        if (other.getTargetResource() != null && other.getTargetResource().equals(this.getTargetResource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionId() == null) ? 0 : getActionId().hashCode());
        hashCode = prime * hashCode + ((getActionDefinitionId() == null) ? 0 : getActionDefinitionId().hashCode());
        hashCode = prime * hashCode + ((getTargetResource() == null) ? 0 : getTargetResource().hashCode());
        return hashCode;
    }

    @Override
    public ActionSummary clone() {
        try {
            return (ActionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.ActionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
