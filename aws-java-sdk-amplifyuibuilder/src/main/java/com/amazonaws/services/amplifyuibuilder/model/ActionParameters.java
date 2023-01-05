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
 * Represents the event action configuration for an element of a <code>Component</code> or <code>ComponentChild</code>.
 * Use for the workflow feature in Amplify Studio that allows you to bind events and actions to components.
 * <code>ActionParameters</code> defines the action that is performed when an event occurs on the component.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/ActionParameters" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The HTML anchor link to the location to open. Specify this value for a navigation action.
     * </p>
     */
    private ComponentProperty anchor;
    /**
     * <p>
     * A dictionary of key-value pairs mapping Amplify Studio properties to fields in a data model. Use when the action
     * performs an operation on an Amplify DataStore model.
     * </p>
     */
    private java.util.Map<String, ComponentProperty> fields;
    /**
     * <p>
     * Specifies whether the user should be signed out globally. Specify this value for an auth sign out action.
     * </p>
     */
    private ComponentProperty global;
    /**
     * <p>
     * The unique ID of the component that the <code>ActionParameters</code> apply to.
     * </p>
     */
    private ComponentProperty id;
    /**
     * <p>
     * The name of the data model. Use when the action performs an operation on an Amplify DataStore model.
     * </p>
     */
    private String model;
    /**
     * <p>
     * A key-value pair that specifies the state property name and its initial value.
     * </p>
     */
    private MutationActionSetStateParameter state;
    /**
     * <p>
     * The element within the same component to modify when the action occurs.
     * </p>
     */
    private ComponentProperty target;
    /**
     * <p>
     * The type of navigation action. Valid values are <code>url</code> and <code>anchor</code>. This value is required
     * for a navigation action.
     * </p>
     */
    private ComponentProperty type;
    /**
     * <p>
     * The URL to the location to open. Specify this value for a navigation action.
     * </p>
     */
    private ComponentProperty url;

    /**
     * <p>
     * The HTML anchor link to the location to open. Specify this value for a navigation action.
     * </p>
     * 
     * @param anchor
     *        The HTML anchor link to the location to open. Specify this value for a navigation action.
     */

    public void setAnchor(ComponentProperty anchor) {
        this.anchor = anchor;
    }

    /**
     * <p>
     * The HTML anchor link to the location to open. Specify this value for a navigation action.
     * </p>
     * 
     * @return The HTML anchor link to the location to open. Specify this value for a navigation action.
     */

    public ComponentProperty getAnchor() {
        return this.anchor;
    }

    /**
     * <p>
     * The HTML anchor link to the location to open. Specify this value for a navigation action.
     * </p>
     * 
     * @param anchor
     *        The HTML anchor link to the location to open. Specify this value for a navigation action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionParameters withAnchor(ComponentProperty anchor) {
        setAnchor(anchor);
        return this;
    }

    /**
     * <p>
     * A dictionary of key-value pairs mapping Amplify Studio properties to fields in a data model. Use when the action
     * performs an operation on an Amplify DataStore model.
     * </p>
     * 
     * @return A dictionary of key-value pairs mapping Amplify Studio properties to fields in a data model. Use when the
     *         action performs an operation on an Amplify DataStore model.
     */

    public java.util.Map<String, ComponentProperty> getFields() {
        return fields;
    }

    /**
     * <p>
     * A dictionary of key-value pairs mapping Amplify Studio properties to fields in a data model. Use when the action
     * performs an operation on an Amplify DataStore model.
     * </p>
     * 
     * @param fields
     *        A dictionary of key-value pairs mapping Amplify Studio properties to fields in a data model. Use when the
     *        action performs an operation on an Amplify DataStore model.
     */

    public void setFields(java.util.Map<String, ComponentProperty> fields) {
        this.fields = fields;
    }

    /**
     * <p>
     * A dictionary of key-value pairs mapping Amplify Studio properties to fields in a data model. Use when the action
     * performs an operation on an Amplify DataStore model.
     * </p>
     * 
     * @param fields
     *        A dictionary of key-value pairs mapping Amplify Studio properties to fields in a data model. Use when the
     *        action performs an operation on an Amplify DataStore model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionParameters withFields(java.util.Map<String, ComponentProperty> fields) {
        setFields(fields);
        return this;
    }

    /**
     * Add a single Fields entry
     *
     * @see ActionParameters#withFields
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ActionParameters addFieldsEntry(String key, ComponentProperty value) {
        if (null == this.fields) {
            this.fields = new java.util.HashMap<String, ComponentProperty>();
        }
        if (this.fields.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.fields.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Fields.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionParameters clearFieldsEntries() {
        this.fields = null;
        return this;
    }

    /**
     * <p>
     * Specifies whether the user should be signed out globally. Specify this value for an auth sign out action.
     * </p>
     * 
     * @param global
     *        Specifies whether the user should be signed out globally. Specify this value for an auth sign out action.
     */

    public void setGlobal(ComponentProperty global) {
        this.global = global;
    }

    /**
     * <p>
     * Specifies whether the user should be signed out globally. Specify this value for an auth sign out action.
     * </p>
     * 
     * @return Specifies whether the user should be signed out globally. Specify this value for an auth sign out action.
     */

    public ComponentProperty getGlobal() {
        return this.global;
    }

    /**
     * <p>
     * Specifies whether the user should be signed out globally. Specify this value for an auth sign out action.
     * </p>
     * 
     * @param global
     *        Specifies whether the user should be signed out globally. Specify this value for an auth sign out action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionParameters withGlobal(ComponentProperty global) {
        setGlobal(global);
        return this;
    }

    /**
     * <p>
     * The unique ID of the component that the <code>ActionParameters</code> apply to.
     * </p>
     * 
     * @param id
     *        The unique ID of the component that the <code>ActionParameters</code> apply to.
     */

    public void setId(ComponentProperty id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique ID of the component that the <code>ActionParameters</code> apply to.
     * </p>
     * 
     * @return The unique ID of the component that the <code>ActionParameters</code> apply to.
     */

    public ComponentProperty getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique ID of the component that the <code>ActionParameters</code> apply to.
     * </p>
     * 
     * @param id
     *        The unique ID of the component that the <code>ActionParameters</code> apply to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionParameters withId(ComponentProperty id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the data model. Use when the action performs an operation on an Amplify DataStore model.
     * </p>
     * 
     * @param model
     *        The name of the data model. Use when the action performs an operation on an Amplify DataStore model.
     */

    public void setModel(String model) {
        this.model = model;
    }

    /**
     * <p>
     * The name of the data model. Use when the action performs an operation on an Amplify DataStore model.
     * </p>
     * 
     * @return The name of the data model. Use when the action performs an operation on an Amplify DataStore model.
     */

    public String getModel() {
        return this.model;
    }

    /**
     * <p>
     * The name of the data model. Use when the action performs an operation on an Amplify DataStore model.
     * </p>
     * 
     * @param model
     *        The name of the data model. Use when the action performs an operation on an Amplify DataStore model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionParameters withModel(String model) {
        setModel(model);
        return this;
    }

    /**
     * <p>
     * A key-value pair that specifies the state property name and its initial value.
     * </p>
     * 
     * @param state
     *        A key-value pair that specifies the state property name and its initial value.
     */

    public void setState(MutationActionSetStateParameter state) {
        this.state = state;
    }

    /**
     * <p>
     * A key-value pair that specifies the state property name and its initial value.
     * </p>
     * 
     * @return A key-value pair that specifies the state property name and its initial value.
     */

    public MutationActionSetStateParameter getState() {
        return this.state;
    }

    /**
     * <p>
     * A key-value pair that specifies the state property name and its initial value.
     * </p>
     * 
     * @param state
     *        A key-value pair that specifies the state property name and its initial value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionParameters withState(MutationActionSetStateParameter state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The element within the same component to modify when the action occurs.
     * </p>
     * 
     * @param target
     *        The element within the same component to modify when the action occurs.
     */

    public void setTarget(ComponentProperty target) {
        this.target = target;
    }

    /**
     * <p>
     * The element within the same component to modify when the action occurs.
     * </p>
     * 
     * @return The element within the same component to modify when the action occurs.
     */

    public ComponentProperty getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The element within the same component to modify when the action occurs.
     * </p>
     * 
     * @param target
     *        The element within the same component to modify when the action occurs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionParameters withTarget(ComponentProperty target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * The type of navigation action. Valid values are <code>url</code> and <code>anchor</code>. This value is required
     * for a navigation action.
     * </p>
     * 
     * @param type
     *        The type of navigation action. Valid values are <code>url</code> and <code>anchor</code>. This value is
     *        required for a navigation action.
     */

    public void setType(ComponentProperty type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of navigation action. Valid values are <code>url</code> and <code>anchor</code>. This value is required
     * for a navigation action.
     * </p>
     * 
     * @return The type of navigation action. Valid values are <code>url</code> and <code>anchor</code>. This value is
     *         required for a navigation action.
     */

    public ComponentProperty getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of navigation action. Valid values are <code>url</code> and <code>anchor</code>. This value is required
     * for a navigation action.
     * </p>
     * 
     * @param type
     *        The type of navigation action. Valid values are <code>url</code> and <code>anchor</code>. This value is
     *        required for a navigation action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionParameters withType(ComponentProperty type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The URL to the location to open. Specify this value for a navigation action.
     * </p>
     * 
     * @param url
     *        The URL to the location to open. Specify this value for a navigation action.
     */

    public void setUrl(ComponentProperty url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL to the location to open. Specify this value for a navigation action.
     * </p>
     * 
     * @return The URL to the location to open. Specify this value for a navigation action.
     */

    public ComponentProperty getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The URL to the location to open. Specify this value for a navigation action.
     * </p>
     * 
     * @param url
     *        The URL to the location to open. Specify this value for a navigation action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActionParameters withUrl(ComponentProperty url) {
        setUrl(url);
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
        if (getAnchor() != null)
            sb.append("Anchor: ").append(getAnchor()).append(",");
        if (getFields() != null)
            sb.append("Fields: ").append(getFields()).append(",");
        if (getGlobal() != null)
            sb.append("Global: ").append(getGlobal()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getModel() != null)
            sb.append("Model: ").append(getModel()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActionParameters == false)
            return false;
        ActionParameters other = (ActionParameters) obj;
        if (other.getAnchor() == null ^ this.getAnchor() == null)
            return false;
        if (other.getAnchor() != null && other.getAnchor().equals(this.getAnchor()) == false)
            return false;
        if (other.getFields() == null ^ this.getFields() == null)
            return false;
        if (other.getFields() != null && other.getFields().equals(this.getFields()) == false)
            return false;
        if (other.getGlobal() == null ^ this.getGlobal() == null)
            return false;
        if (other.getGlobal() != null && other.getGlobal().equals(this.getGlobal()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getModel() == null ^ this.getModel() == null)
            return false;
        if (other.getModel() != null && other.getModel().equals(this.getModel()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnchor() == null) ? 0 : getAnchor().hashCode());
        hashCode = prime * hashCode + ((getFields() == null) ? 0 : getFields().hashCode());
        hashCode = prime * hashCode + ((getGlobal() == null) ? 0 : getGlobal().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getModel() == null) ? 0 : getModel().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return hashCode;
    }

    @Override
    public ActionParameters clone() {
        try {
            return (ActionParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.ActionParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
