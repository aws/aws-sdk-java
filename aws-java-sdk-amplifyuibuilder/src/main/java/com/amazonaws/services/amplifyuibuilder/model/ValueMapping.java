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
 * Associates a complex object with a display value. Use <code>ValueMapping</code> to store how to represent complex
 * objects when they are displayed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/ValueMapping" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValueMapping implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value to display for the complex object.
     * </p>
     */
    private FormInputValueProperty displayValue;
    /**
     * <p>
     * The complex object.
     * </p>
     */
    private FormInputValueProperty value;

    /**
     * <p>
     * The value to display for the complex object.
     * </p>
     * 
     * @param displayValue
     *        The value to display for the complex object.
     */

    public void setDisplayValue(FormInputValueProperty displayValue) {
        this.displayValue = displayValue;
    }

    /**
     * <p>
     * The value to display for the complex object.
     * </p>
     * 
     * @return The value to display for the complex object.
     */

    public FormInputValueProperty getDisplayValue() {
        return this.displayValue;
    }

    /**
     * <p>
     * The value to display for the complex object.
     * </p>
     * 
     * @param displayValue
     *        The value to display for the complex object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValueMapping withDisplayValue(FormInputValueProperty displayValue) {
        setDisplayValue(displayValue);
        return this;
    }

    /**
     * <p>
     * The complex object.
     * </p>
     * 
     * @param value
     *        The complex object.
     */

    public void setValue(FormInputValueProperty value) {
        this.value = value;
    }

    /**
     * <p>
     * The complex object.
     * </p>
     * 
     * @return The complex object.
     */

    public FormInputValueProperty getValue() {
        return this.value;
    }

    /**
     * <p>
     * The complex object.
     * </p>
     * 
     * @param value
     *        The complex object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValueMapping withValue(FormInputValueProperty value) {
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
        if (getDisplayValue() != null)
            sb.append("DisplayValue: ").append(getDisplayValue()).append(",");
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

        if (obj instanceof ValueMapping == false)
            return false;
        ValueMapping other = (ValueMapping) obj;
        if (other.getDisplayValue() == null ^ this.getDisplayValue() == null)
            return false;
        if (other.getDisplayValue() != null && other.getDisplayValue().equals(this.getDisplayValue()) == false)
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

        hashCode = prime * hashCode + ((getDisplayValue() == null) ? 0 : getDisplayValue().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public ValueMapping clone() {
        try {
            return (ValueMapping) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplifyuibuilder.model.transform.ValueMappingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
