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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a single entry in the list of values for a <code>FilterExpression</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/FilterValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilterValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of filter value.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The value to be associated.
     * </p>
     */
    private java.util.List<String> value;

    /**
     * <p>
     * The type of filter value.
     * </p>
     * 
     * @param type
     *        The type of filter value.
     * @see FilterValueType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of filter value.
     * </p>
     * 
     * @return The type of filter value.
     * @see FilterValueType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of filter value.
     * </p>
     * 
     * @param type
     *        The type of filter value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterValueType
     */

    public FilterValue withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of filter value.
     * </p>
     * 
     * @param type
     *        The type of filter value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterValueType
     */

    public FilterValue withType(FilterValueType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The value to be associated.
     * </p>
     * 
     * @return The value to be associated.
     */

    public java.util.List<String> getValue() {
        return value;
    }

    /**
     * <p>
     * The value to be associated.
     * </p>
     * 
     * @param value
     *        The value to be associated.
     */

    public void setValue(java.util.Collection<String> value) {
        if (value == null) {
            this.value = null;
            return;
        }

        this.value = new java.util.ArrayList<String>(value);
    }

    /**
     * <p>
     * The value to be associated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValue(java.util.Collection)} or {@link #withValue(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param value
     *        The value to be associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterValue withValue(String... value) {
        if (this.value == null) {
            setValue(new java.util.ArrayList<String>(value.length));
        }
        for (String ele : value) {
            this.value.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The value to be associated.
     * </p>
     * 
     * @param value
     *        The value to be associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterValue withValue(java.util.Collection<String> value) {
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
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

        if (obj instanceof FilterValue == false)
            return false;
        FilterValue other = (FilterValue) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
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

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public FilterValue clone() {
        try {
            return (FilterValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.FilterValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
