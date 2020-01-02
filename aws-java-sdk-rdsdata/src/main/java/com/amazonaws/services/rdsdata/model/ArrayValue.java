/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rdsdata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains an array.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/ArrayValue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ArrayValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of arrays.
     * </p>
     */
    private java.util.List<ArrayValue> arrayValues;
    /**
     * <p>
     * An array of Boolean values.
     * </p>
     */
    private java.util.List<Boolean> booleanValues;
    /**
     * <p>
     * An array of integers.
     * </p>
     */
    private java.util.List<Double> doubleValues;
    /**
     * <p>
     * An array of floating point numbers.
     * </p>
     */
    private java.util.List<Long> longValues;
    /**
     * <p>
     * An array of strings.
     * </p>
     */
    private java.util.List<String> stringValues;

    /**
     * <p>
     * An array of arrays.
     * </p>
     * 
     * @return An array of arrays.
     */

    public java.util.List<ArrayValue> getArrayValues() {
        return arrayValues;
    }

    /**
     * <p>
     * An array of arrays.
     * </p>
     * 
     * @param arrayValues
     *        An array of arrays.
     */

    public void setArrayValues(java.util.Collection<ArrayValue> arrayValues) {
        if (arrayValues == null) {
            this.arrayValues = null;
            return;
        }

        this.arrayValues = new java.util.ArrayList<ArrayValue>(arrayValues);
    }

    /**
     * <p>
     * An array of arrays.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setArrayValues(java.util.Collection)} or {@link #withArrayValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param arrayValues
     *        An array of arrays.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArrayValue withArrayValues(ArrayValue... arrayValues) {
        if (this.arrayValues == null) {
            setArrayValues(new java.util.ArrayList<ArrayValue>(arrayValues.length));
        }
        for (ArrayValue ele : arrayValues) {
            this.arrayValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of arrays.
     * </p>
     * 
     * @param arrayValues
     *        An array of arrays.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArrayValue withArrayValues(java.util.Collection<ArrayValue> arrayValues) {
        setArrayValues(arrayValues);
        return this;
    }

    /**
     * <p>
     * An array of Boolean values.
     * </p>
     * 
     * @return An array of Boolean values.
     */

    public java.util.List<Boolean> getBooleanValues() {
        return booleanValues;
    }

    /**
     * <p>
     * An array of Boolean values.
     * </p>
     * 
     * @param booleanValues
     *        An array of Boolean values.
     */

    public void setBooleanValues(java.util.Collection<Boolean> booleanValues) {
        if (booleanValues == null) {
            this.booleanValues = null;
            return;
        }

        this.booleanValues = new java.util.ArrayList<Boolean>(booleanValues);
    }

    /**
     * <p>
     * An array of Boolean values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBooleanValues(java.util.Collection)} or {@link #withBooleanValues(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param booleanValues
     *        An array of Boolean values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArrayValue withBooleanValues(Boolean... booleanValues) {
        if (this.booleanValues == null) {
            setBooleanValues(new java.util.ArrayList<Boolean>(booleanValues.length));
        }
        for (Boolean ele : booleanValues) {
            this.booleanValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of Boolean values.
     * </p>
     * 
     * @param booleanValues
     *        An array of Boolean values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArrayValue withBooleanValues(java.util.Collection<Boolean> booleanValues) {
        setBooleanValues(booleanValues);
        return this;
    }

    /**
     * <p>
     * An array of integers.
     * </p>
     * 
     * @return An array of integers.
     */

    public java.util.List<Double> getDoubleValues() {
        return doubleValues;
    }

    /**
     * <p>
     * An array of integers.
     * </p>
     * 
     * @param doubleValues
     *        An array of integers.
     */

    public void setDoubleValues(java.util.Collection<Double> doubleValues) {
        if (doubleValues == null) {
            this.doubleValues = null;
            return;
        }

        this.doubleValues = new java.util.ArrayList<Double>(doubleValues);
    }

    /**
     * <p>
     * An array of integers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDoubleValues(java.util.Collection)} or {@link #withDoubleValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param doubleValues
     *        An array of integers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArrayValue withDoubleValues(Double... doubleValues) {
        if (this.doubleValues == null) {
            setDoubleValues(new java.util.ArrayList<Double>(doubleValues.length));
        }
        for (Double ele : doubleValues) {
            this.doubleValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of integers.
     * </p>
     * 
     * @param doubleValues
     *        An array of integers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArrayValue withDoubleValues(java.util.Collection<Double> doubleValues) {
        setDoubleValues(doubleValues);
        return this;
    }

    /**
     * <p>
     * An array of floating point numbers.
     * </p>
     * 
     * @return An array of floating point numbers.
     */

    public java.util.List<Long> getLongValues() {
        return longValues;
    }

    /**
     * <p>
     * An array of floating point numbers.
     * </p>
     * 
     * @param longValues
     *        An array of floating point numbers.
     */

    public void setLongValues(java.util.Collection<Long> longValues) {
        if (longValues == null) {
            this.longValues = null;
            return;
        }

        this.longValues = new java.util.ArrayList<Long>(longValues);
    }

    /**
     * <p>
     * An array of floating point numbers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLongValues(java.util.Collection)} or {@link #withLongValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param longValues
     *        An array of floating point numbers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArrayValue withLongValues(Long... longValues) {
        if (this.longValues == null) {
            setLongValues(new java.util.ArrayList<Long>(longValues.length));
        }
        for (Long ele : longValues) {
            this.longValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of floating point numbers.
     * </p>
     * 
     * @param longValues
     *        An array of floating point numbers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArrayValue withLongValues(java.util.Collection<Long> longValues) {
        setLongValues(longValues);
        return this;
    }

    /**
     * <p>
     * An array of strings.
     * </p>
     * 
     * @return An array of strings.
     */

    public java.util.List<String> getStringValues() {
        return stringValues;
    }

    /**
     * <p>
     * An array of strings.
     * </p>
     * 
     * @param stringValues
     *        An array of strings.
     */

    public void setStringValues(java.util.Collection<String> stringValues) {
        if (stringValues == null) {
            this.stringValues = null;
            return;
        }

        this.stringValues = new java.util.ArrayList<String>(stringValues);
    }

    /**
     * <p>
     * An array of strings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStringValues(java.util.Collection)} or {@link #withStringValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param stringValues
     *        An array of strings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArrayValue withStringValues(String... stringValues) {
        if (this.stringValues == null) {
            setStringValues(new java.util.ArrayList<String>(stringValues.length));
        }
        for (String ele : stringValues) {
            this.stringValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings.
     * </p>
     * 
     * @param stringValues
     *        An array of strings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArrayValue withStringValues(java.util.Collection<String> stringValues) {
        setStringValues(stringValues);
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
        if (getArrayValues() != null)
            sb.append("ArrayValues: ").append(getArrayValues()).append(",");
        if (getBooleanValues() != null)
            sb.append("BooleanValues: ").append(getBooleanValues()).append(",");
        if (getDoubleValues() != null)
            sb.append("DoubleValues: ").append(getDoubleValues()).append(",");
        if (getLongValues() != null)
            sb.append("LongValues: ").append(getLongValues()).append(",");
        if (getStringValues() != null)
            sb.append("StringValues: ").append(getStringValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ArrayValue == false)
            return false;
        ArrayValue other = (ArrayValue) obj;
        if (other.getArrayValues() == null ^ this.getArrayValues() == null)
            return false;
        if (other.getArrayValues() != null && other.getArrayValues().equals(this.getArrayValues()) == false)
            return false;
        if (other.getBooleanValues() == null ^ this.getBooleanValues() == null)
            return false;
        if (other.getBooleanValues() != null && other.getBooleanValues().equals(this.getBooleanValues()) == false)
            return false;
        if (other.getDoubleValues() == null ^ this.getDoubleValues() == null)
            return false;
        if (other.getDoubleValues() != null && other.getDoubleValues().equals(this.getDoubleValues()) == false)
            return false;
        if (other.getLongValues() == null ^ this.getLongValues() == null)
            return false;
        if (other.getLongValues() != null && other.getLongValues().equals(this.getLongValues()) == false)
            return false;
        if (other.getStringValues() == null ^ this.getStringValues() == null)
            return false;
        if (other.getStringValues() != null && other.getStringValues().equals(this.getStringValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArrayValues() == null) ? 0 : getArrayValues().hashCode());
        hashCode = prime * hashCode + ((getBooleanValues() == null) ? 0 : getBooleanValues().hashCode());
        hashCode = prime * hashCode + ((getDoubleValues() == null) ? 0 : getDoubleValues().hashCode());
        hashCode = prime * hashCode + ((getLongValues() == null) ? 0 : getLongValues().hashCode());
        hashCode = prime * hashCode + ((getStringValues() == null) ? 0 : getStringValues().hashCode());
        return hashCode;
    }

    @Override
    public ArrayValue clone() {
        try {
            return (ArrayValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rdsdata.model.transform.ArrayValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
