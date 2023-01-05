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
 * Describes the configuration for all of a component's properties. Use <code>ComponentProperty</code> to specify the
 * values to render or bind by default.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/ComponentProperty" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComponentProperty implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The information to bind the component property to data at runtime.
     * </p>
     */
    private ComponentPropertyBindingProperties bindingProperties;
    /**
     * <p>
     * The information to bind the component property to form data.
     * </p>
     */
    private java.util.Map<String, FormBindingElement> bindings;
    /**
     * <p>
     * The information to bind the component property to data at runtime. Use this for collection components.
     * </p>
     */
    private ComponentPropertyBindingProperties collectionBindingProperties;
    /**
     * <p>
     * The name of the component that is affected by an event.
     * </p>
     */
    private String componentName;
    /**
     * <p>
     * A list of component properties to concatenate to create the value to assign to this component property.
     * </p>
     */
    private java.util.List<ComponentProperty> concat;
    /**
     * <p>
     * The conditional expression to use to assign a value to the component property.
     * </p>
     */
    private ComponentConditionProperty condition;
    /**
     * <p>
     * Specifies whether the user configured the property in Amplify Studio after importing it.
     * </p>
     */
    private Boolean configured;
    /**
     * <p>
     * The default value to assign to the component property.
     * </p>
     */
    private String defaultValue;
    /**
     * <p>
     * An event that occurs in your app. Use this for workflow data binding.
     * </p>
     */
    private String event;
    /**
     * <p>
     * The default value assigned to the property when the component is imported into an app.
     * </p>
     */
    private String importedValue;
    /**
     * <p>
     * The data model to use to assign a value to the component property.
     * </p>
     */
    private String model;
    /**
     * <p>
     * The name of the component's property that is affected by an event.
     * </p>
     */
    private String property;
    /**
     * <p>
     * The component type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * An authenticated user attribute to use to assign a value to the component property.
     * </p>
     */
    private String userAttribute;
    /**
     * <p>
     * The value to assign to the component property.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The information to bind the component property to data at runtime.
     * </p>
     * 
     * @param bindingProperties
     *        The information to bind the component property to data at runtime.
     */

    public void setBindingProperties(ComponentPropertyBindingProperties bindingProperties) {
        this.bindingProperties = bindingProperties;
    }

    /**
     * <p>
     * The information to bind the component property to data at runtime.
     * </p>
     * 
     * @return The information to bind the component property to data at runtime.
     */

    public ComponentPropertyBindingProperties getBindingProperties() {
        return this.bindingProperties;
    }

    /**
     * <p>
     * The information to bind the component property to data at runtime.
     * </p>
     * 
     * @param bindingProperties
     *        The information to bind the component property to data at runtime.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentProperty withBindingProperties(ComponentPropertyBindingProperties bindingProperties) {
        setBindingProperties(bindingProperties);
        return this;
    }

    /**
     * <p>
     * The information to bind the component property to form data.
     * </p>
     * 
     * @return The information to bind the component property to form data.
     */

    public java.util.Map<String, FormBindingElement> getBindings() {
        return bindings;
    }

    /**
     * <p>
     * The information to bind the component property to form data.
     * </p>
     * 
     * @param bindings
     *        The information to bind the component property to form data.
     */

    public void setBindings(java.util.Map<String, FormBindingElement> bindings) {
        this.bindings = bindings;
    }

    /**
     * <p>
     * The information to bind the component property to form data.
     * </p>
     * 
     * @param bindings
     *        The information to bind the component property to form data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentProperty withBindings(java.util.Map<String, FormBindingElement> bindings) {
        setBindings(bindings);
        return this;
    }

    /**
     * Add a single Bindings entry
     *
     * @see ComponentProperty#withBindings
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ComponentProperty addBindingsEntry(String key, FormBindingElement value) {
        if (null == this.bindings) {
            this.bindings = new java.util.HashMap<String, FormBindingElement>();
        }
        if (this.bindings.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.bindings.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Bindings.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentProperty clearBindingsEntries() {
        this.bindings = null;
        return this;
    }

    /**
     * <p>
     * The information to bind the component property to data at runtime. Use this for collection components.
     * </p>
     * 
     * @param collectionBindingProperties
     *        The information to bind the component property to data at runtime. Use this for collection components.
     */

    public void setCollectionBindingProperties(ComponentPropertyBindingProperties collectionBindingProperties) {
        this.collectionBindingProperties = collectionBindingProperties;
    }

    /**
     * <p>
     * The information to bind the component property to data at runtime. Use this for collection components.
     * </p>
     * 
     * @return The information to bind the component property to data at runtime. Use this for collection components.
     */

    public ComponentPropertyBindingProperties getCollectionBindingProperties() {
        return this.collectionBindingProperties;
    }

    /**
     * <p>
     * The information to bind the component property to data at runtime. Use this for collection components.
     * </p>
     * 
     * @param collectionBindingProperties
     *        The information to bind the component property to data at runtime. Use this for collection components.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentProperty withCollectionBindingProperties(ComponentPropertyBindingProperties collectionBindingProperties) {
        setCollectionBindingProperties(collectionBindingProperties);
        return this;
    }

    /**
     * <p>
     * The name of the component that is affected by an event.
     * </p>
     * 
     * @param componentName
     *        The name of the component that is affected by an event.
     */

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    /**
     * <p>
     * The name of the component that is affected by an event.
     * </p>
     * 
     * @return The name of the component that is affected by an event.
     */

    public String getComponentName() {
        return this.componentName;
    }

    /**
     * <p>
     * The name of the component that is affected by an event.
     * </p>
     * 
     * @param componentName
     *        The name of the component that is affected by an event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentProperty withComponentName(String componentName) {
        setComponentName(componentName);
        return this;
    }

    /**
     * <p>
     * A list of component properties to concatenate to create the value to assign to this component property.
     * </p>
     * 
     * @return A list of component properties to concatenate to create the value to assign to this component property.
     */

    public java.util.List<ComponentProperty> getConcat() {
        return concat;
    }

    /**
     * <p>
     * A list of component properties to concatenate to create the value to assign to this component property.
     * </p>
     * 
     * @param concat
     *        A list of component properties to concatenate to create the value to assign to this component property.
     */

    public void setConcat(java.util.Collection<ComponentProperty> concat) {
        if (concat == null) {
            this.concat = null;
            return;
        }

        this.concat = new java.util.ArrayList<ComponentProperty>(concat);
    }

    /**
     * <p>
     * A list of component properties to concatenate to create the value to assign to this component property.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConcat(java.util.Collection)} or {@link #withConcat(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param concat
     *        A list of component properties to concatenate to create the value to assign to this component property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentProperty withConcat(ComponentProperty... concat) {
        if (this.concat == null) {
            setConcat(new java.util.ArrayList<ComponentProperty>(concat.length));
        }
        for (ComponentProperty ele : concat) {
            this.concat.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of component properties to concatenate to create the value to assign to this component property.
     * </p>
     * 
     * @param concat
     *        A list of component properties to concatenate to create the value to assign to this component property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentProperty withConcat(java.util.Collection<ComponentProperty> concat) {
        setConcat(concat);
        return this;
    }

    /**
     * <p>
     * The conditional expression to use to assign a value to the component property.
     * </p>
     * 
     * @param condition
     *        The conditional expression to use to assign a value to the component property.
     */

    public void setCondition(ComponentConditionProperty condition) {
        this.condition = condition;
    }

    /**
     * <p>
     * The conditional expression to use to assign a value to the component property.
     * </p>
     * 
     * @return The conditional expression to use to assign a value to the component property.
     */

    public ComponentConditionProperty getCondition() {
        return this.condition;
    }

    /**
     * <p>
     * The conditional expression to use to assign a value to the component property.
     * </p>
     * 
     * @param condition
     *        The conditional expression to use to assign a value to the component property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentProperty withCondition(ComponentConditionProperty condition) {
        setCondition(condition);
        return this;
    }

    /**
     * <p>
     * Specifies whether the user configured the property in Amplify Studio after importing it.
     * </p>
     * 
     * @param configured
     *        Specifies whether the user configured the property in Amplify Studio after importing it.
     */

    public void setConfigured(Boolean configured) {
        this.configured = configured;
    }

    /**
     * <p>
     * Specifies whether the user configured the property in Amplify Studio after importing it.
     * </p>
     * 
     * @return Specifies whether the user configured the property in Amplify Studio after importing it.
     */

    public Boolean getConfigured() {
        return this.configured;
    }

    /**
     * <p>
     * Specifies whether the user configured the property in Amplify Studio after importing it.
     * </p>
     * 
     * @param configured
     *        Specifies whether the user configured the property in Amplify Studio after importing it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentProperty withConfigured(Boolean configured) {
        setConfigured(configured);
        return this;
    }

    /**
     * <p>
     * Specifies whether the user configured the property in Amplify Studio after importing it.
     * </p>
     * 
     * @return Specifies whether the user configured the property in Amplify Studio after importing it.
     */

    public Boolean isConfigured() {
        return this.configured;
    }

    /**
     * <p>
     * The default value to assign to the component property.
     * </p>
     * 
     * @param defaultValue
     *        The default value to assign to the component property.
     */

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The default value to assign to the component property.
     * </p>
     * 
     * @return The default value to assign to the component property.
     */

    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * <p>
     * The default value to assign to the component property.
     * </p>
     * 
     * @param defaultValue
     *        The default value to assign to the component property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentProperty withDefaultValue(String defaultValue) {
        setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <p>
     * An event that occurs in your app. Use this for workflow data binding.
     * </p>
     * 
     * @param event
     *        An event that occurs in your app. Use this for workflow data binding.
     */

    public void setEvent(String event) {
        this.event = event;
    }

    /**
     * <p>
     * An event that occurs in your app. Use this for workflow data binding.
     * </p>
     * 
     * @return An event that occurs in your app. Use this for workflow data binding.
     */

    public String getEvent() {
        return this.event;
    }

    /**
     * <p>
     * An event that occurs in your app. Use this for workflow data binding.
     * </p>
     * 
     * @param event
     *        An event that occurs in your app. Use this for workflow data binding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentProperty withEvent(String event) {
        setEvent(event);
        return this;
    }

    /**
     * <p>
     * The default value assigned to the property when the component is imported into an app.
     * </p>
     * 
     * @param importedValue
     *        The default value assigned to the property when the component is imported into an app.
     */

    public void setImportedValue(String importedValue) {
        this.importedValue = importedValue;
    }

    /**
     * <p>
     * The default value assigned to the property when the component is imported into an app.
     * </p>
     * 
     * @return The default value assigned to the property when the component is imported into an app.
     */

    public String getImportedValue() {
        return this.importedValue;
    }

    /**
     * <p>
     * The default value assigned to the property when the component is imported into an app.
     * </p>
     * 
     * @param importedValue
     *        The default value assigned to the property when the component is imported into an app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentProperty withImportedValue(String importedValue) {
        setImportedValue(importedValue);
        return this;
    }

    /**
     * <p>
     * The data model to use to assign a value to the component property.
     * </p>
     * 
     * @param model
     *        The data model to use to assign a value to the component property.
     */

    public void setModel(String model) {
        this.model = model;
    }

    /**
     * <p>
     * The data model to use to assign a value to the component property.
     * </p>
     * 
     * @return The data model to use to assign a value to the component property.
     */

    public String getModel() {
        return this.model;
    }

    /**
     * <p>
     * The data model to use to assign a value to the component property.
     * </p>
     * 
     * @param model
     *        The data model to use to assign a value to the component property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentProperty withModel(String model) {
        setModel(model);
        return this;
    }

    /**
     * <p>
     * The name of the component's property that is affected by an event.
     * </p>
     * 
     * @param property
     *        The name of the component's property that is affected by an event.
     */

    public void setProperty(String property) {
        this.property = property;
    }

    /**
     * <p>
     * The name of the component's property that is affected by an event.
     * </p>
     * 
     * @return The name of the component's property that is affected by an event.
     */

    public String getProperty() {
        return this.property;
    }

    /**
     * <p>
     * The name of the component's property that is affected by an event.
     * </p>
     * 
     * @param property
     *        The name of the component's property that is affected by an event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentProperty withProperty(String property) {
        setProperty(property);
        return this;
    }

    /**
     * <p>
     * The component type.
     * </p>
     * 
     * @param type
     *        The component type.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The component type.
     * </p>
     * 
     * @return The component type.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The component type.
     * </p>
     * 
     * @param type
     *        The component type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentProperty withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * An authenticated user attribute to use to assign a value to the component property.
     * </p>
     * 
     * @param userAttribute
     *        An authenticated user attribute to use to assign a value to the component property.
     */

    public void setUserAttribute(String userAttribute) {
        this.userAttribute = userAttribute;
    }

    /**
     * <p>
     * An authenticated user attribute to use to assign a value to the component property.
     * </p>
     * 
     * @return An authenticated user attribute to use to assign a value to the component property.
     */

    public String getUserAttribute() {
        return this.userAttribute;
    }

    /**
     * <p>
     * An authenticated user attribute to use to assign a value to the component property.
     * </p>
     * 
     * @param userAttribute
     *        An authenticated user attribute to use to assign a value to the component property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentProperty withUserAttribute(String userAttribute) {
        setUserAttribute(userAttribute);
        return this;
    }

    /**
     * <p>
     * The value to assign to the component property.
     * </p>
     * 
     * @param value
     *        The value to assign to the component property.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value to assign to the component property.
     * </p>
     * 
     * @return The value to assign to the component property.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value to assign to the component property.
     * </p>
     * 
     * @param value
     *        The value to assign to the component property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentProperty withValue(String value) {
        setValue(value);
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
        if (getBindingProperties() != null)
            sb.append("BindingProperties: ").append(getBindingProperties()).append(",");
        if (getBindings() != null)
            sb.append("Bindings: ").append(getBindings()).append(",");
        if (getCollectionBindingProperties() != null)
            sb.append("CollectionBindingProperties: ").append(getCollectionBindingProperties()).append(",");
        if (getComponentName() != null)
            sb.append("ComponentName: ").append(getComponentName()).append(",");
        if (getConcat() != null)
            sb.append("Concat: ").append(getConcat()).append(",");
        if (getCondition() != null)
            sb.append("Condition: ").append(getCondition()).append(",");
        if (getConfigured() != null)
            sb.append("Configured: ").append(getConfigured()).append(",");
        if (getDefaultValue() != null)
            sb.append("DefaultValue: ").append(getDefaultValue()).append(",");
        if (getEvent() != null)
            sb.append("Event: ").append(getEvent()).append(",");
        if (getImportedValue() != null)
            sb.append("ImportedValue: ").append(getImportedValue()).append(",");
        if (getModel() != null)
            sb.append("Model: ").append(getModel()).append(",");
        if (getProperty() != null)
            sb.append("Property: ").append(getProperty()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getUserAttribute() != null)
            sb.append("UserAttribute: ").append(getUserAttribute()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComponentProperty == false)
            return false;
        ComponentProperty other = (ComponentProperty) obj;
        if (other.getBindingProperties() == null ^ this.getBindingProperties() == null)
            return false;
        if (other.getBindingProperties() != null && other.getBindingProperties().equals(this.getBindingProperties()) == false)
            return false;
        if (other.getBindings() == null ^ this.getBindings() == null)
            return false;
        if (other.getBindings() != null && other.getBindings().equals(this.getBindings()) == false)
            return false;
        if (other.getCollectionBindingProperties() == null ^ this.getCollectionBindingProperties() == null)
            return false;
        if (other.getCollectionBindingProperties() != null && other.getCollectionBindingProperties().equals(this.getCollectionBindingProperties()) == false)
            return false;
        if (other.getComponentName() == null ^ this.getComponentName() == null)
            return false;
        if (other.getComponentName() != null && other.getComponentName().equals(this.getComponentName()) == false)
            return false;
        if (other.getConcat() == null ^ this.getConcat() == null)
            return false;
        if (other.getConcat() != null && other.getConcat().equals(this.getConcat()) == false)
            return false;
        if (other.getCondition() == null ^ this.getCondition() == null)
            return false;
        if (other.getCondition() != null && other.getCondition().equals(this.getCondition()) == false)
            return false;
        if (other.getConfigured() == null ^ this.getConfigured() == null)
            return false;
        if (other.getConfigured() != null && other.getConfigured().equals(this.getConfigured()) == false)
            return false;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        if (other.getEvent() == null ^ this.getEvent() == null)
            return false;
        if (other.getEvent() != null && other.getEvent().equals(this.getEvent()) == false)
            return false;
        if (other.getImportedValue() == null ^ this.getImportedValue() == null)
            return false;
        if (other.getImportedValue() != null && other.getImportedValue().equals(this.getImportedValue()) == false)
            return false;
        if (other.getModel() == null ^ this.getModel() == null)
            return false;
        if (other.getModel() != null && other.getModel().equals(this.getModel()) == false)
            return false;
        if (other.getProperty() == null ^ this.getProperty() == null)
            return false;
        if (other.getProperty() != null && other.getProperty().equals(this.getProperty()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getUserAttribute() == null ^ this.getUserAttribute() == null)
            return false;
        if (other.getUserAttribute() != null && other.getUserAttribute().equals(this.getUserAttribute()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBindingProperties() == null) ? 0 : getBindingProperties().hashCode());
        hashCode = prime * hashCode + ((getBindings() == null) ? 0 : getBindings().hashCode());
        hashCode = prime * hashCode + ((getCollectionBindingProperties() == null) ? 0 : getCollectionBindingProperties().hashCode());
        hashCode = prime * hashCode + ((getComponentName() == null) ? 0 : getComponentName().hashCode());
        hashCode = prime * hashCode + ((getConcat() == null) ? 0 : getConcat().hashCode());
        hashCode = prime * hashCode + ((getCondition() == null) ? 0 : getCondition().hashCode());
        hashCode = prime * hashCode + ((getConfigured() == null) ? 0 : getConfigured().hashCode());
        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        hashCode = prime * hashCode + ((getEvent() == null) ? 0 : getEvent().hashCode());
        hashCode = prime * hashCode + ((getImportedValue() == null) ? 0 : getImportedValue().hashCode());
        hashCode = prime * hashCode + ((getModel() == null) ? 0 : getModel().hashCode());
        hashCode = prime * hashCode + ((getProperty() == null) ? 0 : getProperty().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getUserAttribute() == null) ? 0 : getUserAttribute().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public ComponentProperty clone() {
        try {
            return (ComponentProperty) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.ComponentPropertyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
