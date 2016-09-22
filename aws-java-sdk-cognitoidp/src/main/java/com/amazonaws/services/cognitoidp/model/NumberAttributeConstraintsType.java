/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;

/**
 * <p>
 * The minimum and maximum value of an attribute that is of the number data type.
 * </p>
 */
public class NumberAttributeConstraintsType implements Serializable, Cloneable {

    /**
     * <p>
     * The minimum value of an attribute that is of the number data type.
     * </p>
     */
    private String minValue;
    /**
     * <p>
     * The maximum value of an attribute that is of the number data type.
     * </p>
     */
    private String maxValue;

    /**
     * <p>
     * The minimum value of an attribute that is of the number data type.
     * </p>
     * 
     * @param minValue
     *        The minimum value of an attribute that is of the number data type.
     */

    public void setMinValue(String minValue) {
        this.minValue = minValue;
    }

    /**
     * <p>
     * The minimum value of an attribute that is of the number data type.
     * </p>
     * 
     * @return The minimum value of an attribute that is of the number data type.
     */

    public String getMinValue() {
        return this.minValue;
    }

    /**
     * <p>
     * The minimum value of an attribute that is of the number data type.
     * </p>
     * 
     * @param minValue
     *        The minimum value of an attribute that is of the number data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumberAttributeConstraintsType withMinValue(String minValue) {
        setMinValue(minValue);
        return this;
    }

    /**
     * <p>
     * The maximum value of an attribute that is of the number data type.
     * </p>
     * 
     * @param maxValue
     *        The maximum value of an attribute that is of the number data type.
     */

    public void setMaxValue(String maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * <p>
     * The maximum value of an attribute that is of the number data type.
     * </p>
     * 
     * @return The maximum value of an attribute that is of the number data type.
     */

    public String getMaxValue() {
        return this.maxValue;
    }

    /**
     * <p>
     * The maximum value of an attribute that is of the number data type.
     * </p>
     * 
     * @param maxValue
     *        The maximum value of an attribute that is of the number data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumberAttributeConstraintsType withMaxValue(String maxValue) {
        setMaxValue(maxValue);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMinValue() != null)
            sb.append("MinValue: " + getMinValue() + ",");
        if (getMaxValue() != null)
            sb.append("MaxValue: " + getMaxValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NumberAttributeConstraintsType == false)
            return false;
        NumberAttributeConstraintsType other = (NumberAttributeConstraintsType) obj;
        if (other.getMinValue() == null ^ this.getMinValue() == null)
            return false;
        if (other.getMinValue() != null && other.getMinValue().equals(this.getMinValue()) == false)
            return false;
        if (other.getMaxValue() == null ^ this.getMaxValue() == null)
            return false;
        if (other.getMaxValue() != null && other.getMaxValue().equals(this.getMaxValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMinValue() == null) ? 0 : getMinValue().hashCode());
        hashCode = prime * hashCode + ((getMaxValue() == null) ? 0 : getMaxValue().hashCode());
        return hashCode;
    }

    @Override
    public NumberAttributeConstraintsType clone() {
        try {
            return (NumberAttributeConstraintsType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
