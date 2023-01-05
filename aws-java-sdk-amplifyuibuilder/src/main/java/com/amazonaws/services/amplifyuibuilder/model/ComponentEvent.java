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
package com.amazonaws.services.amplifyuibuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the configuration of an event. You can bind an event and a corresponding action to a <code>Component</code>
 * or a <code>ComponentChild</code>. A button click is an example of an event.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/ComponentEvent" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComponentEvent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The action to perform when a specific event is raised.
     * </p>
     */
    private String action;
    /**
     * <p>
     * Binds an event to an action on a component. When you specify a <code>bindingEvent</code>, the event is called
     * when the action is performed.
     * </p>
     */
    private String bindingEvent;
    /**
     * <p>
     * Describes information about the action.
     * </p>
     */
    private ActionParameters parameters;

    /**
     * <p>
     * The action to perform when a specific event is raised.
     * </p>
     * 
     * @param action
     *        The action to perform when a specific event is raised.
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action to perform when a specific event is raised.
     * </p>
     * 
     * @return The action to perform when a specific event is raised.
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The action to perform when a specific event is raised.
     * </p>
     * 
     * @param action
     *        The action to perform when a specific event is raised.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentEvent withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * Binds an event to an action on a component. When you specify a <code>bindingEvent</code>, the event is called
     * when the action is performed.
     * </p>
     * 
     * @param bindingEvent
     *        Binds an event to an action on a component. When you specify a <code>bindingEvent</code>, the event is
     *        called when the action is performed.
     */

    public void setBindingEvent(String bindingEvent) {
        this.bindingEvent = bindingEvent;
    }

    /**
     * <p>
     * Binds an event to an action on a component. When you specify a <code>bindingEvent</code>, the event is called
     * when the action is performed.
     * </p>
     * 
     * @return Binds an event to an action on a component. When you specify a <code>bindingEvent</code>, the event is
     *         called when the action is performed.
     */

    public String getBindingEvent() {
        return this.bindingEvent;
    }

    /**
     * <p>
     * Binds an event to an action on a component. When you specify a <code>bindingEvent</code>, the event is called
     * when the action is performed.
     * </p>
     * 
     * @param bindingEvent
     *        Binds an event to an action on a component. When you specify a <code>bindingEvent</code>, the event is
     *        called when the action is performed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentEvent withBindingEvent(String bindingEvent) {
        setBindingEvent(bindingEvent);
        return this;
    }

    /**
     * <p>
     * Describes information about the action.
     * </p>
     * 
     * @param parameters
     *        Describes information about the action.
     */

    public void setParameters(ActionParameters parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * Describes information about the action.
     * </p>
     * 
     * @return Describes information about the action.
     */

    public ActionParameters getParameters() {
        return this.parameters;
    }

    /**
     * <p>
     * Describes information about the action.
     * </p>
     * 
     * @param parameters
     *        Describes information about the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentEvent withParameters(ActionParameters parameters) {
        setParameters(parameters);
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
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getBindingEvent() != null)
            sb.append("BindingEvent: ").append(getBindingEvent()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComponentEvent == false)
            return false;
        ComponentEvent other = (ComponentEvent) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getBindingEvent() == null ^ this.getBindingEvent() == null)
            return false;
        if (other.getBindingEvent() != null && other.getBindingEvent().equals(this.getBindingEvent()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getBindingEvent() == null) ? 0 : getBindingEvent().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public ComponentEvent clone() {
        try {
            return (ComponentEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.ComponentEventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
