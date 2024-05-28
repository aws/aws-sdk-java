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
 * Contains a definition for an action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/ActionDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the action definition.
     * </p>
     */
    private String actionDefinitionId;
    /**
     * <p>
     * The name of the action definition.
     * </p>
     */
    private String actionName;
    /**
     * <p>
     * The type of the action definition.
     * </p>
     */
    private String actionType;

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

    public ActionDefinition withActionDefinitionId(String actionDefinitionId) {
        setActionDefinitionId(actionDefinitionId);
        return this;
    }

    /**
     * <p>
     * The name of the action definition.
     * </p>
     * 
     * @param actionName
     *        The name of the action definition.
     */

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * <p>
     * The name of the action definition.
     * </p>
     * 
     * @return The name of the action definition.
     */

    public String getActionName() {
        return this.actionName;
    }

    /**
     * <p>
     * The name of the action definition.
     * </p>
     * 
     * @param actionName
     *        The name of the action definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionDefinition withActionName(String actionName) {
        setActionName(actionName);
        return this;
    }

    /**
     * <p>
     * The type of the action definition.
     * </p>
     * 
     * @param actionType
     *        The type of the action definition.
     */

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    /**
     * <p>
     * The type of the action definition.
     * </p>
     * 
     * @return The type of the action definition.
     */

    public String getActionType() {
        return this.actionType;
    }

    /**
     * <p>
     * The type of the action definition.
     * </p>
     * 
     * @param actionType
     *        The type of the action definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionDefinition withActionType(String actionType) {
        setActionType(actionType);
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
        if (getActionDefinitionId() != null)
            sb.append("ActionDefinitionId: ").append(getActionDefinitionId()).append(",");
        if (getActionName() != null)
            sb.append("ActionName: ").append(getActionName()).append(",");
        if (getActionType() != null)
            sb.append("ActionType: ").append(getActionType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActionDefinition == false)
            return false;
        ActionDefinition other = (ActionDefinition) obj;
        if (other.getActionDefinitionId() == null ^ this.getActionDefinitionId() == null)
            return false;
        if (other.getActionDefinitionId() != null && other.getActionDefinitionId().equals(this.getActionDefinitionId()) == false)
            return false;
        if (other.getActionName() == null ^ this.getActionName() == null)
            return false;
        if (other.getActionName() != null && other.getActionName().equals(this.getActionName()) == false)
            return false;
        if (other.getActionType() == null ^ this.getActionType() == null)
            return false;
        if (other.getActionType() != null && other.getActionType().equals(this.getActionType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActionDefinitionId() == null) ? 0 : getActionDefinitionId().hashCode());
        hashCode = prime * hashCode + ((getActionName() == null) ? 0 : getActionName().hashCode());
        hashCode = prime * hashCode + ((getActionType() == null) ? 0 : getActionType().hashCode());
        return hashCode;
    }

    @Override
    public ActionDefinition clone() {
        try {
            return (ActionDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.ActionDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
