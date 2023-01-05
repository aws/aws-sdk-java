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
 * A nested UI configuration within a parent <code>Component</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/ComponentChild" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComponentChild implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of <code>ComponentChild</code> instances for this component.
     * </p>
     */
    private java.util.List<ComponentChild> children;
    /**
     * <p>
     * The type of the child component.
     * </p>
     */
    private String componentType;
    /**
     * <p>
     * Describes the events that can be raised on the child component. Use for the workflow feature in Amplify Studio
     * that allows you to bind events and actions to components.
     * </p>
     */
    private java.util.Map<String, ComponentEvent> events;
    /**
     * <p>
     * The name of the child component.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Describes the properties of the child component. You can't specify <code>tags</code> as a valid property for
     * <code>properties</code>.
     * </p>
     */
    private java.util.Map<String, ComponentProperty> properties;
    /**
     * <p>
     * The unique ID of the child component in its original source system, such as Figma.
     * </p>
     */
    private String sourceId;

    /**
     * <p>
     * The list of <code>ComponentChild</code> instances for this component.
     * </p>
     * 
     * @return The list of <code>ComponentChild</code> instances for this component.
     */

    public java.util.List<ComponentChild> getChildren() {
        return children;
    }

    /**
     * <p>
     * The list of <code>ComponentChild</code> instances for this component.
     * </p>
     * 
     * @param children
     *        The list of <code>ComponentChild</code> instances for this component.
     */

    public void setChildren(java.util.Collection<ComponentChild> children) {
        if (children == null) {
            this.children = null;
            return;
        }

        this.children = new java.util.ArrayList<ComponentChild>(children);
    }

    /**
     * <p>
     * The list of <code>ComponentChild</code> instances for this component.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChildren(java.util.Collection)} or {@link #withChildren(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param children
     *        The list of <code>ComponentChild</code> instances for this component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentChild withChildren(ComponentChild... children) {
        if (this.children == null) {
            setChildren(new java.util.ArrayList<ComponentChild>(children.length));
        }
        for (ComponentChild ele : children) {
            this.children.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of <code>ComponentChild</code> instances for this component.
     * </p>
     * 
     * @param children
     *        The list of <code>ComponentChild</code> instances for this component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentChild withChildren(java.util.Collection<ComponentChild> children) {
        setChildren(children);
        return this;
    }

    /**
     * <p>
     * The type of the child component.
     * </p>
     * 
     * @param componentType
     *        The type of the child component.
     */

    public void setComponentType(String componentType) {
        this.componentType = componentType;
    }

    /**
     * <p>
     * The type of the child component.
     * </p>
     * 
     * @return The type of the child component.
     */

    public String getComponentType() {
        return this.componentType;
    }

    /**
     * <p>
     * The type of the child component.
     * </p>
     * 
     * @param componentType
     *        The type of the child component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentChild withComponentType(String componentType) {
        setComponentType(componentType);
        return this;
    }

    /**
     * <p>
     * Describes the events that can be raised on the child component. Use for the workflow feature in Amplify Studio
     * that allows you to bind events and actions to components.
     * </p>
     * 
     * @return Describes the events that can be raised on the child component. Use for the workflow feature in Amplify
     *         Studio that allows you to bind events and actions to components.
     */

    public java.util.Map<String, ComponentEvent> getEvents() {
        return events;
    }

    /**
     * <p>
     * Describes the events that can be raised on the child component. Use for the workflow feature in Amplify Studio
     * that allows you to bind events and actions to components.
     * </p>
     * 
     * @param events
     *        Describes the events that can be raised on the child component. Use for the workflow feature in Amplify
     *        Studio that allows you to bind events and actions to components.
     */

    public void setEvents(java.util.Map<String, ComponentEvent> events) {
        this.events = events;
    }

    /**
     * <p>
     * Describes the events that can be raised on the child component. Use for the workflow feature in Amplify Studio
     * that allows you to bind events and actions to components.
     * </p>
     * 
     * @param events
     *        Describes the events that can be raised on the child component. Use for the workflow feature in Amplify
     *        Studio that allows you to bind events and actions to components.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentChild withEvents(java.util.Map<String, ComponentEvent> events) {
        setEvents(events);
        return this;
    }

    /**
     * Add a single Events entry
     *
     * @see ComponentChild#withEvents
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ComponentChild addEventsEntry(String key, ComponentEvent value) {
        if (null == this.events) {
            this.events = new java.util.HashMap<String, ComponentEvent>();
        }
        if (this.events.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.events.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Events.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentChild clearEventsEntries() {
        this.events = null;
        return this;
    }

    /**
     * <p>
     * The name of the child component.
     * </p>
     * 
     * @param name
     *        The name of the child component.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the child component.
     * </p>
     * 
     * @return The name of the child component.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the child component.
     * </p>
     * 
     * @param name
     *        The name of the child component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentChild withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Describes the properties of the child component. You can't specify <code>tags</code> as a valid property for
     * <code>properties</code>.
     * </p>
     * 
     * @return Describes the properties of the child component. You can't specify <code>tags</code> as a valid property
     *         for <code>properties</code>.
     */

    public java.util.Map<String, ComponentProperty> getProperties() {
        return properties;
    }

    /**
     * <p>
     * Describes the properties of the child component. You can't specify <code>tags</code> as a valid property for
     * <code>properties</code>.
     * </p>
     * 
     * @param properties
     *        Describes the properties of the child component. You can't specify <code>tags</code> as a valid property
     *        for <code>properties</code>.
     */

    public void setProperties(java.util.Map<String, ComponentProperty> properties) {
        this.properties = properties;
    }

    /**
     * <p>
     * Describes the properties of the child component. You can't specify <code>tags</code> as a valid property for
     * <code>properties</code>.
     * </p>
     * 
     * @param properties
     *        Describes the properties of the child component. You can't specify <code>tags</code> as a valid property
     *        for <code>properties</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentChild withProperties(java.util.Map<String, ComponentProperty> properties) {
        setProperties(properties);
        return this;
    }

    /**
     * Add a single Properties entry
     *
     * @see ComponentChild#withProperties
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ComponentChild addPropertiesEntry(String key, ComponentProperty value) {
        if (null == this.properties) {
            this.properties = new java.util.HashMap<String, ComponentProperty>();
        }
        if (this.properties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.properties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Properties.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentChild clearPropertiesEntries() {
        this.properties = null;
        return this;
    }

    /**
     * <p>
     * The unique ID of the child component in its original source system, such as Figma.
     * </p>
     * 
     * @param sourceId
     *        The unique ID of the child component in its original source system, such as Figma.
     */

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * <p>
     * The unique ID of the child component in its original source system, such as Figma.
     * </p>
     * 
     * @return The unique ID of the child component in its original source system, such as Figma.
     */

    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * <p>
     * The unique ID of the child component in its original source system, such as Figma.
     * </p>
     * 
     * @param sourceId
     *        The unique ID of the child component in its original source system, such as Figma.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentChild withSourceId(String sourceId) {
        setSourceId(sourceId);
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
        if (getChildren() != null)
            sb.append("Children: ").append(getChildren()).append(",");
        if (getComponentType() != null)
            sb.append("ComponentType: ").append(getComponentType()).append(",");
        if (getEvents() != null)
            sb.append("Events: ").append(getEvents()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getProperties() != null)
            sb.append("Properties: ").append(getProperties()).append(",");
        if (getSourceId() != null)
            sb.append("SourceId: ").append(getSourceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComponentChild == false)
            return false;
        ComponentChild other = (ComponentChild) obj;
        if (other.getChildren() == null ^ this.getChildren() == null)
            return false;
        if (other.getChildren() != null && other.getChildren().equals(this.getChildren()) == false)
            return false;
        if (other.getComponentType() == null ^ this.getComponentType() == null)
            return false;
        if (other.getComponentType() != null && other.getComponentType().equals(this.getComponentType()) == false)
            return false;
        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false)
            return false;
        if (other.getSourceId() == null ^ this.getSourceId() == null)
            return false;
        if (other.getSourceId() != null && other.getSourceId().equals(this.getSourceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChildren() == null) ? 0 : getChildren().hashCode());
        hashCode = prime * hashCode + ((getComponentType() == null) ? 0 : getComponentType().hashCode());
        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        hashCode = prime * hashCode + ((getSourceId() == null) ? 0 : getSourceId().hashCode());
        return hashCode;
    }

    @Override
    public ComponentChild clone() {
        try {
            return (ComponentChild) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.ComponentChildMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
