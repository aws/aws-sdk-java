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
 * Represents the data binding configuration for a value map.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/ValueMappings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValueMappings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value and display value pairs.
     * </p>
     */
    private java.util.List<ValueMapping> values;
    /**
     * <p>
     * The information to bind fields to data at runtime.
     * </p>
     */
    private java.util.Map<String, FormInputBindingPropertiesValue> bindingProperties;

    /**
     * <p>
     * The value and display value pairs.
     * </p>
     * 
     * @return The value and display value pairs.
     */

    public java.util.List<ValueMapping> getValues() {
        return values;
    }

    /**
     * <p>
     * The value and display value pairs.
     * </p>
     * 
     * @param values
     *        The value and display value pairs.
     */

    public void setValues(java.util.Collection<ValueMapping> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<ValueMapping>(values);
    }

    /**
     * <p>
     * The value and display value pairs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The value and display value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValueMappings withValues(ValueMapping... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<ValueMapping>(values.length));
        }
        for (ValueMapping ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The value and display value pairs.
     * </p>
     * 
     * @param values
     *        The value and display value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValueMappings withValues(java.util.Collection<ValueMapping> values) {
        setValues(values);
        return this;
    }

    /**
     * <p>
     * The information to bind fields to data at runtime.
     * </p>
     * 
     * @return The information to bind fields to data at runtime.
     */

    public java.util.Map<String, FormInputBindingPropertiesValue> getBindingProperties() {
        return bindingProperties;
    }

    /**
     * <p>
     * The information to bind fields to data at runtime.
     * </p>
     * 
     * @param bindingProperties
     *        The information to bind fields to data at runtime.
     */

    public void setBindingProperties(java.util.Map<String, FormInputBindingPropertiesValue> bindingProperties) {
        this.bindingProperties = bindingProperties;
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

    public ValueMappings withBindingProperties(java.util.Map<String, FormInputBindingPropertiesValue> bindingProperties) {
        setBindingProperties(bindingProperties);
        return this;
    }

    /**
     * Add a single BindingProperties entry
     *
     * @see ValueMappings#withBindingProperties
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ValueMappings addBindingPropertiesEntry(String key, FormInputBindingPropertiesValue value) {
        if (null == this.bindingProperties) {
            this.bindingProperties = new java.util.HashMap<String, FormInputBindingPropertiesValue>();
        }
        if (this.bindingProperties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.bindingProperties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into BindingProperties.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValueMappings clearBindingPropertiesEntries() {
        this.bindingProperties = null;
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
        if (getValues() != null)
            sb.append("Values: ").append(getValues()).append(",");
        if (getBindingProperties() != null)
            sb.append("BindingProperties: ").append(getBindingProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValueMappings == false)
            return false;
        ValueMappings other = (ValueMappings) obj;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        if (other.getBindingProperties() == null ^ this.getBindingProperties() == null)
            return false;
        if (other.getBindingProperties() != null && other.getBindingProperties().equals(this.getBindingProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        hashCode = prime * hashCode + ((getBindingProperties() == null) ? 0 : getBindingProperties().hashCode());
        return hashCode;
    }

    @Override
    public ValueMappings clone() {
        try {
            return (ValueMappings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.ValueMappingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
