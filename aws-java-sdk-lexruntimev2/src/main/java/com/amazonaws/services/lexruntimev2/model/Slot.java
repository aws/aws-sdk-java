/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexruntimev2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A value that Amazon Lex V2 uses to fulfill an intent.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/runtime.lex.v2-2020-08-07/Slot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Slot implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The current value of the slot.
     * </p>
     */
    private Value value;
    /**
     * <p>
     * When the <code>shape</code> value is <code>List</code>, it indicates that the <code>values</code> field contains
     * a list of slot values. When the value is <code>Scalar</code>, it indicates that the <code>value</code> field
     * contains a single value.
     * </p>
     */
    private String shape;
    /**
     * <p>
     * A list of one or more values that the user provided for the slot. For example, if a for a slot that elicits pizza
     * toppings, the values might be "pepperoni" and "pineapple."
     * </p>
     */
    private java.util.List<Slot> values;

    /**
     * <p>
     * The current value of the slot.
     * </p>
     * 
     * @param value
     *        The current value of the slot.
     */

    public void setValue(Value value) {
        this.value = value;
    }

    /**
     * <p>
     * The current value of the slot.
     * </p>
     * 
     * @return The current value of the slot.
     */

    public Value getValue() {
        return this.value;
    }

    /**
     * <p>
     * The current value of the slot.
     * </p>
     * 
     * @param value
     *        The current value of the slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Slot withValue(Value value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * When the <code>shape</code> value is <code>List</code>, it indicates that the <code>values</code> field contains
     * a list of slot values. When the value is <code>Scalar</code>, it indicates that the <code>value</code> field
     * contains a single value.
     * </p>
     * 
     * @param shape
     *        When the <code>shape</code> value is <code>List</code>, it indicates that the <code>values</code> field
     *        contains a list of slot values. When the value is <code>Scalar</code>, it indicates that the
     *        <code>value</code> field contains a single value.
     * @see Shape
     */

    public void setShape(String shape) {
        this.shape = shape;
    }

    /**
     * <p>
     * When the <code>shape</code> value is <code>List</code>, it indicates that the <code>values</code> field contains
     * a list of slot values. When the value is <code>Scalar</code>, it indicates that the <code>value</code> field
     * contains a single value.
     * </p>
     * 
     * @return When the <code>shape</code> value is <code>List</code>, it indicates that the <code>values</code> field
     *         contains a list of slot values. When the value is <code>Scalar</code>, it indicates that the
     *         <code>value</code> field contains a single value.
     * @see Shape
     */

    public String getShape() {
        return this.shape;
    }

    /**
     * <p>
     * When the <code>shape</code> value is <code>List</code>, it indicates that the <code>values</code> field contains
     * a list of slot values. When the value is <code>Scalar</code>, it indicates that the <code>value</code> field
     * contains a single value.
     * </p>
     * 
     * @param shape
     *        When the <code>shape</code> value is <code>List</code>, it indicates that the <code>values</code> field
     *        contains a list of slot values. When the value is <code>Scalar</code>, it indicates that the
     *        <code>value</code> field contains a single value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Shape
     */

    public Slot withShape(String shape) {
        setShape(shape);
        return this;
    }

    /**
     * <p>
     * When the <code>shape</code> value is <code>List</code>, it indicates that the <code>values</code> field contains
     * a list of slot values. When the value is <code>Scalar</code>, it indicates that the <code>value</code> field
     * contains a single value.
     * </p>
     * 
     * @param shape
     *        When the <code>shape</code> value is <code>List</code>, it indicates that the <code>values</code> field
     *        contains a list of slot values. When the value is <code>Scalar</code>, it indicates that the
     *        <code>value</code> field contains a single value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Shape
     */

    public Slot withShape(Shape shape) {
        this.shape = shape.toString();
        return this;
    }

    /**
     * <p>
     * A list of one or more values that the user provided for the slot. For example, if a for a slot that elicits pizza
     * toppings, the values might be "pepperoni" and "pineapple."
     * </p>
     * 
     * @return A list of one or more values that the user provided for the slot. For example, if a for a slot that
     *         elicits pizza toppings, the values might be "pepperoni" and "pineapple."
     */

    public java.util.List<Slot> getValues() {
        return values;
    }

    /**
     * <p>
     * A list of one or more values that the user provided for the slot. For example, if a for a slot that elicits pizza
     * toppings, the values might be "pepperoni" and "pineapple."
     * </p>
     * 
     * @param values
     *        A list of one or more values that the user provided for the slot. For example, if a for a slot that
     *        elicits pizza toppings, the values might be "pepperoni" and "pineapple."
     */

    public void setValues(java.util.Collection<Slot> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<Slot>(values);
    }

    /**
     * <p>
     * A list of one or more values that the user provided for the slot. For example, if a for a slot that elicits pizza
     * toppings, the values might be "pepperoni" and "pineapple."
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        A list of one or more values that the user provided for the slot. For example, if a for a slot that
     *        elicits pizza toppings, the values might be "pepperoni" and "pineapple."
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Slot withValues(Slot... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<Slot>(values.length));
        }
        for (Slot ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of one or more values that the user provided for the slot. For example, if a for a slot that elicits pizza
     * toppings, the values might be "pepperoni" and "pineapple."
     * </p>
     * 
     * @param values
     *        A list of one or more values that the user provided for the slot. For example, if a for a slot that
     *        elicits pizza toppings, the values might be "pepperoni" and "pineapple."
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Slot withValues(java.util.Collection<Slot> values) {
        setValues(values);
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
        if (getShape() != null)
            sb.append("Shape: ").append(getShape()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Slot == false)
            return false;
        Slot other = (Slot) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getShape() == null ^ this.getShape() == null)
            return false;
        if (other.getShape() != null && other.getShape().equals(this.getShape()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getShape() == null) ? 0 : getShape().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public Slot clone() {
        try {
            return (Slot) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexruntimev2.model.transform.SlotMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
