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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A custom action defined on a visual.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/VisualCustomAction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VisualCustomAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the <code>VisualCustomAction</code>.
     * </p>
     */
    private String customActionId;
    /**
     * <p>
     * The name of the <code>VisualCustomAction</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of the <code>VisualCustomAction</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The trigger of the <code>VisualCustomAction</code>.
     * </p>
     * <p>
     * Valid values are defined as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DATA_POINT_CLICK</code>: Initiates a custom action by a left pointer click on a data point.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DATA_POINT_MENU</code>: Initiates a custom action by right pointer click from the menu.
     * </p>
     * </li>
     * </ul>
     */
    private String trigger;
    /**
     * <p>
     * A list of <code>VisualCustomActionOperations</code>.
     * </p>
     * <p>
     * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
     * </p>
     */
    private java.util.List<VisualCustomActionOperation> actionOperations;

    /**
     * <p>
     * The ID of the <code>VisualCustomAction</code>.
     * </p>
     * 
     * @param customActionId
     *        The ID of the <code>VisualCustomAction</code>.
     */

    public void setCustomActionId(String customActionId) {
        this.customActionId = customActionId;
    }

    /**
     * <p>
     * The ID of the <code>VisualCustomAction</code>.
     * </p>
     * 
     * @return The ID of the <code>VisualCustomAction</code>.
     */

    public String getCustomActionId() {
        return this.customActionId;
    }

    /**
     * <p>
     * The ID of the <code>VisualCustomAction</code>.
     * </p>
     * 
     * @param customActionId
     *        The ID of the <code>VisualCustomAction</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VisualCustomAction withCustomActionId(String customActionId) {
        setCustomActionId(customActionId);
        return this;
    }

    /**
     * <p>
     * The name of the <code>VisualCustomAction</code>.
     * </p>
     * 
     * @param name
     *        The name of the <code>VisualCustomAction</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the <code>VisualCustomAction</code>.
     * </p>
     * 
     * @return The name of the <code>VisualCustomAction</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the <code>VisualCustomAction</code>.
     * </p>
     * 
     * @param name
     *        The name of the <code>VisualCustomAction</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VisualCustomAction withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the <code>VisualCustomAction</code>.
     * </p>
     * 
     * @param status
     *        The status of the <code>VisualCustomAction</code>.
     * @see WidgetStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the <code>VisualCustomAction</code>.
     * </p>
     * 
     * @return The status of the <code>VisualCustomAction</code>.
     * @see WidgetStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the <code>VisualCustomAction</code>.
     * </p>
     * 
     * @param status
     *        The status of the <code>VisualCustomAction</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WidgetStatus
     */

    public VisualCustomAction withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the <code>VisualCustomAction</code>.
     * </p>
     * 
     * @param status
     *        The status of the <code>VisualCustomAction</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WidgetStatus
     */

    public VisualCustomAction withStatus(WidgetStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The trigger of the <code>VisualCustomAction</code>.
     * </p>
     * <p>
     * Valid values are defined as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DATA_POINT_CLICK</code>: Initiates a custom action by a left pointer click on a data point.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DATA_POINT_MENU</code>: Initiates a custom action by right pointer click from the menu.
     * </p>
     * </li>
     * </ul>
     * 
     * @param trigger
     *        The trigger of the <code>VisualCustomAction</code>.</p>
     *        <p>
     *        Valid values are defined as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DATA_POINT_CLICK</code>: Initiates a custom action by a left pointer click on a data point.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DATA_POINT_MENU</code>: Initiates a custom action by right pointer click from the menu.
     *        </p>
     *        </li>
     * @see VisualCustomActionTrigger
     */

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    /**
     * <p>
     * The trigger of the <code>VisualCustomAction</code>.
     * </p>
     * <p>
     * Valid values are defined as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DATA_POINT_CLICK</code>: Initiates a custom action by a left pointer click on a data point.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DATA_POINT_MENU</code>: Initiates a custom action by right pointer click from the menu.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The trigger of the <code>VisualCustomAction</code>.</p>
     *         <p>
     *         Valid values are defined as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DATA_POINT_CLICK</code>: Initiates a custom action by a left pointer click on a data point.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DATA_POINT_MENU</code>: Initiates a custom action by right pointer click from the menu.
     *         </p>
     *         </li>
     * @see VisualCustomActionTrigger
     */

    public String getTrigger() {
        return this.trigger;
    }

    /**
     * <p>
     * The trigger of the <code>VisualCustomAction</code>.
     * </p>
     * <p>
     * Valid values are defined as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DATA_POINT_CLICK</code>: Initiates a custom action by a left pointer click on a data point.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DATA_POINT_MENU</code>: Initiates a custom action by right pointer click from the menu.
     * </p>
     * </li>
     * </ul>
     * 
     * @param trigger
     *        The trigger of the <code>VisualCustomAction</code>.</p>
     *        <p>
     *        Valid values are defined as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DATA_POINT_CLICK</code>: Initiates a custom action by a left pointer click on a data point.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DATA_POINT_MENU</code>: Initiates a custom action by right pointer click from the menu.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VisualCustomActionTrigger
     */

    public VisualCustomAction withTrigger(String trigger) {
        setTrigger(trigger);
        return this;
    }

    /**
     * <p>
     * The trigger of the <code>VisualCustomAction</code>.
     * </p>
     * <p>
     * Valid values are defined as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DATA_POINT_CLICK</code>: Initiates a custom action by a left pointer click on a data point.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DATA_POINT_MENU</code>: Initiates a custom action by right pointer click from the menu.
     * </p>
     * </li>
     * </ul>
     * 
     * @param trigger
     *        The trigger of the <code>VisualCustomAction</code>.</p>
     *        <p>
     *        Valid values are defined as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DATA_POINT_CLICK</code>: Initiates a custom action by a left pointer click on a data point.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DATA_POINT_MENU</code>: Initiates a custom action by right pointer click from the menu.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VisualCustomActionTrigger
     */

    public VisualCustomAction withTrigger(VisualCustomActionTrigger trigger) {
        this.trigger = trigger.toString();
        return this;
    }

    /**
     * <p>
     * A list of <code>VisualCustomActionOperations</code>.
     * </p>
     * <p>
     * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
     * </p>
     * 
     * @return A list of <code>VisualCustomActionOperations</code>.</p>
     *         <p>
     *         This is a union type structure. For this structure to be valid, only one of the attributes can be
     *         defined.
     */

    public java.util.List<VisualCustomActionOperation> getActionOperations() {
        return actionOperations;
    }

    /**
     * <p>
     * A list of <code>VisualCustomActionOperations</code>.
     * </p>
     * <p>
     * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
     * </p>
     * 
     * @param actionOperations
     *        A list of <code>VisualCustomActionOperations</code>.</p>
     *        <p>
     *        This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
     */

    public void setActionOperations(java.util.Collection<VisualCustomActionOperation> actionOperations) {
        if (actionOperations == null) {
            this.actionOperations = null;
            return;
        }

        this.actionOperations = new java.util.ArrayList<VisualCustomActionOperation>(actionOperations);
    }

    /**
     * <p>
     * A list of <code>VisualCustomActionOperations</code>.
     * </p>
     * <p>
     * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActionOperations(java.util.Collection)} or {@link #withActionOperations(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param actionOperations
     *        A list of <code>VisualCustomActionOperations</code>.</p>
     *        <p>
     *        This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VisualCustomAction withActionOperations(VisualCustomActionOperation... actionOperations) {
        if (this.actionOperations == null) {
            setActionOperations(new java.util.ArrayList<VisualCustomActionOperation>(actionOperations.length));
        }
        for (VisualCustomActionOperation ele : actionOperations) {
            this.actionOperations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>VisualCustomActionOperations</code>.
     * </p>
     * <p>
     * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
     * </p>
     * 
     * @param actionOperations
     *        A list of <code>VisualCustomActionOperations</code>.</p>
     *        <p>
     *        This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VisualCustomAction withActionOperations(java.util.Collection<VisualCustomActionOperation> actionOperations) {
        setActionOperations(actionOperations);
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
        if (getCustomActionId() != null)
            sb.append("CustomActionId: ").append(getCustomActionId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTrigger() != null)
            sb.append("Trigger: ").append(getTrigger()).append(",");
        if (getActionOperations() != null)
            sb.append("ActionOperations: ").append(getActionOperations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VisualCustomAction == false)
            return false;
        VisualCustomAction other = (VisualCustomAction) obj;
        if (other.getCustomActionId() == null ^ this.getCustomActionId() == null)
            return false;
        if (other.getCustomActionId() != null && other.getCustomActionId().equals(this.getCustomActionId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTrigger() == null ^ this.getTrigger() == null)
            return false;
        if (other.getTrigger() != null && other.getTrigger().equals(this.getTrigger()) == false)
            return false;
        if (other.getActionOperations() == null ^ this.getActionOperations() == null)
            return false;
        if (other.getActionOperations() != null && other.getActionOperations().equals(this.getActionOperations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomActionId() == null) ? 0 : getCustomActionId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTrigger() == null) ? 0 : getTrigger().hashCode());
        hashCode = prime * hashCode + ((getActionOperations() == null) ? 0 : getActionOperations().hashCode());
        return hashCode;
    }

    @Override
    public VisualCustomAction clone() {
        try {
            return (VisualCustomAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.VisualCustomActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
