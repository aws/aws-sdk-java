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
package com.amazonaws.services.amplifyuibuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the configuration for an input field on a form. Use <code>FormInputValueProperty</code> to specify the
 * values to render or bind by default.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/FormInputValueProperty"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FormInputValueProperty implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value to assign to the input field.
     * </p>
     */
    private String value;
    /**
     * <p>
     * The information to bind fields to data at runtime.
     * </p>
     */
    private FormInputValuePropertyBindingProperties bindingProperties;
    /**
     * <p>
     * A list of form properties to concatenate to create the value to assign to this field property.
     * </p>
     */
    private java.util.List<FormInputValueProperty> concat;

    /**
     * <p>
     * The value to assign to the input field.
     * </p>
     * 
     * @param value
     *        The value to assign to the input field.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value to assign to the input field.
     * </p>
     * 
     * @return The value to assign to the input field.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value to assign to the input field.
     * </p>
     * 
     * @param value
     *        The value to assign to the input field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FormInputValueProperty withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The information to bind fields to data at runtime.
     * </p>
     * 
     * @param bindingProperties
     *        The information to bind fields to data at runtime.
     */

    public void setBindingProperties(FormInputValuePropertyBindingProperties bindingProperties) {
        this.bindingProperties = bindingProperties;
    }

    /**
     * <p>
     * The information to bind fields to data at runtime.
     * </p>
     * 
     * @return The information to bind fields to data at runtime.
     */

    public FormInputValuePropertyBindingProperties getBindingProperties() {
        return this.bindingProperties;
    }

    /**
     * <p>
     * The information to bind fields to data at runtime.
     * </p>
     * 
     * @param bindingProperties
     *        The information to bind fields to data at runtime.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FormInputValueProperty withBindingProperties(FormInputValuePropertyBindingProperties bindingProperties) {
        setBindingProperties(bindingProperties);
        return this;
    }

    /**
     * <p>
     * A list of form properties to concatenate to create the value to assign to this field property.
     * </p>
     * 
     * @return A list of form properties to concatenate to create the value to assign to this field property.
     */

    public java.util.List<FormInputValueProperty> getConcat() {
        return concat;
    }

    /**
     * <p>
     * A list of form properties to concatenate to create the value to assign to this field property.
     * </p>
     * 
     * @param concat
     *        A list of form properties to concatenate to create the value to assign to this field property.
     */

    public void setConcat(java.util.Collection<FormInputValueProperty> concat) {
        if (concat == null) {
            this.concat = null;
            return;
        }

        this.concat = new java.util.ArrayList<FormInputValueProperty>(concat);
    }

    /**
     * <p>
     * A list of form properties to concatenate to create the value to assign to this field property.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConcat(java.util.Collection)} or {@link #withConcat(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param concat
     *        A list of form properties to concatenate to create the value to assign to this field property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FormInputValueProperty withConcat(FormInputValueProperty... concat) {
        if (this.concat == null) {
            setConcat(new java.util.ArrayList<FormInputValueProperty>(concat.length));
        }
        for (FormInputValueProperty ele : concat) {
            this.concat.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of form properties to concatenate to create the value to assign to this field property.
     * </p>
     * 
     * @param concat
     *        A list of form properties to concatenate to create the value to assign to this field property.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FormInputValueProperty withConcat(java.util.Collection<FormInputValueProperty> concat) {
        setConcat(concat);
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getBindingProperties() != null)
            sb.append("BindingProperties: ").append(getBindingProperties()).append(",");
        if (getConcat() != null)
            sb.append("Concat: ").append(getConcat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FormInputValueProperty == false)
            return false;
        FormInputValueProperty other = (FormInputValueProperty) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getBindingProperties() == null ^ this.getBindingProperties() == null)
            return false;
        if (other.getBindingProperties() != null && other.getBindingProperties().equals(this.getBindingProperties()) == false)
            return false;
        if (other.getConcat() == null ^ this.getConcat() == null)
            return false;
        if (other.getConcat() != null && other.getConcat().equals(this.getConcat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getBindingProperties() == null) ? 0 : getBindingProperties().hashCode());
        hashCode = prime * hashCode + ((getConcat() == null) ? 0 : getConcat().hashCode());
        return hashCode;
    }

    @Override
    public FormInputValueProperty clone() {
        try {
            return (FormInputValueProperty) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.FormInputValuePropertyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
