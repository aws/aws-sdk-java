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
 * Represents the data binding configuration for a component at runtime. You can use
 * <code>ComponentBindingPropertiesValue</code> to add exposed properties to a component to allow different values to be
 * entered when a component is reused in different places in an app.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/ComponentBindingPropertiesValue"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComponentBindingPropertiesValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes the properties to customize with data at runtime.
     * </p>
     */
    private ComponentBindingPropertiesValueProperties bindingProperties;
    /**
     * <p>
     * The default value of the property.
     * </p>
     */
    private String defaultValue;
    /**
     * <p>
     * The property type.
     * </p>
     */
    private String type;

    /**
     * <p>
     * Describes the properties to customize with data at runtime.
     * </p>
     * 
     * @param bindingProperties
     *        Describes the properties to customize with data at runtime.
     */

    public void setBindingProperties(ComponentBindingPropertiesValueProperties bindingProperties) {
        this.bindingProperties = bindingProperties;
    }

    /**
     * <p>
     * Describes the properties to customize with data at runtime.
     * </p>
     * 
     * @return Describes the properties to customize with data at runtime.
     */

    public ComponentBindingPropertiesValueProperties getBindingProperties() {
        return this.bindingProperties;
    }

    /**
     * <p>
     * Describes the properties to customize with data at runtime.
     * </p>
     * 
     * @param bindingProperties
     *        Describes the properties to customize with data at runtime.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentBindingPropertiesValue withBindingProperties(ComponentBindingPropertiesValueProperties bindingProperties) {
        setBindingProperties(bindingProperties);
        return this;
    }

    /**
     * <p>
     * The default value of the property.
     * </p>
     * 
     * @param defaultValue
     *        The default value of the property.
     */

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    /**
     * <p>
     * The default value of the property.
     * </p>
     * 
     * @return The default value of the property.
     */

    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * <p>
     * The default value of the property.
     * </p>
     * 
     * @param defaultValue
     *        The default value of the property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentBindingPropertiesValue withDefaultValue(String defaultValue) {
        setDefaultValue(defaultValue);
        return this;
    }

    /**
     * <p>
     * The property type.
     * </p>
     * 
     * @param type
     *        The property type.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The property type.
     * </p>
     * 
     * @return The property type.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The property type.
     * </p>
     * 
     * @param type
     *        The property type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComponentBindingPropertiesValue withType(String type) {
        setType(type);
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
        if (getDefaultValue() != null)
            sb.append("DefaultValue: ").append(getDefaultValue()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComponentBindingPropertiesValue == false)
            return false;
        ComponentBindingPropertiesValue other = (ComponentBindingPropertiesValue) obj;
        if (other.getBindingProperties() == null ^ this.getBindingProperties() == null)
            return false;
        if (other.getBindingProperties() != null && other.getBindingProperties().equals(this.getBindingProperties()) == false)
            return false;
        if (other.getDefaultValue() == null ^ this.getDefaultValue() == null)
            return false;
        if (other.getDefaultValue() != null && other.getDefaultValue().equals(this.getDefaultValue()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBindingProperties() == null) ? 0 : getBindingProperties().hashCode());
        hashCode = prime * hashCode + ((getDefaultValue() == null) ? 0 : getDefaultValue().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public ComponentBindingPropertiesValue clone() {
        try {
            return (ComponentBindingPropertiesValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.ComponentBindingPropertiesValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
