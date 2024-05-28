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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Determines the color that's applied to a particular data value in a column.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CustomColor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomColor implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The data value that the color is applied to.
     * </p>
     */
    private String fieldValue;
    /**
     * <p>
     * The color that is applied to the data value.
     * </p>
     */
    private String color;
    /**
     * <p>
     * The value of a special data value.
     * </p>
     */
    private String specialValue;

    /**
     * <p>
     * The data value that the color is applied to.
     * </p>
     * 
     * @param fieldValue
     *        The data value that the color is applied to.
     */

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    /**
     * <p>
     * The data value that the color is applied to.
     * </p>
     * 
     * @return The data value that the color is applied to.
     */

    public String getFieldValue() {
        return this.fieldValue;
    }

    /**
     * <p>
     * The data value that the color is applied to.
     * </p>
     * 
     * @param fieldValue
     *        The data value that the color is applied to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomColor withFieldValue(String fieldValue) {
        setFieldValue(fieldValue);
        return this;
    }

    /**
     * <p>
     * The color that is applied to the data value.
     * </p>
     * 
     * @param color
     *        The color that is applied to the data value.
     */

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * <p>
     * The color that is applied to the data value.
     * </p>
     * 
     * @return The color that is applied to the data value.
     */

    public String getColor() {
        return this.color;
    }

    /**
     * <p>
     * The color that is applied to the data value.
     * </p>
     * 
     * @param color
     *        The color that is applied to the data value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomColor withColor(String color) {
        setColor(color);
        return this;
    }

    /**
     * <p>
     * The value of a special data value.
     * </p>
     * 
     * @param specialValue
     *        The value of a special data value.
     * @see SpecialValue
     */

    public void setSpecialValue(String specialValue) {
        this.specialValue = specialValue;
    }

    /**
     * <p>
     * The value of a special data value.
     * </p>
     * 
     * @return The value of a special data value.
     * @see SpecialValue
     */

    public String getSpecialValue() {
        return this.specialValue;
    }

    /**
     * <p>
     * The value of a special data value.
     * </p>
     * 
     * @param specialValue
     *        The value of a special data value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SpecialValue
     */

    public CustomColor withSpecialValue(String specialValue) {
        setSpecialValue(specialValue);
        return this;
    }

    /**
     * <p>
     * The value of a special data value.
     * </p>
     * 
     * @param specialValue
     *        The value of a special data value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SpecialValue
     */

    public CustomColor withSpecialValue(SpecialValue specialValue) {
        this.specialValue = specialValue.toString();
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
        if (getFieldValue() != null)
            sb.append("FieldValue: ").append("***Sensitive Data Redacted***").append(",");
        if (getColor() != null)
            sb.append("Color: ").append(getColor()).append(",");
        if (getSpecialValue() != null)
            sb.append("SpecialValue: ").append(getSpecialValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomColor == false)
            return false;
        CustomColor other = (CustomColor) obj;
        if (other.getFieldValue() == null ^ this.getFieldValue() == null)
            return false;
        if (other.getFieldValue() != null && other.getFieldValue().equals(this.getFieldValue()) == false)
            return false;
        if (other.getColor() == null ^ this.getColor() == null)
            return false;
        if (other.getColor() != null && other.getColor().equals(this.getColor()) == false)
            return false;
        if (other.getSpecialValue() == null ^ this.getSpecialValue() == null)
            return false;
        if (other.getSpecialValue() != null && other.getSpecialValue().equals(this.getSpecialValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldValue() == null) ? 0 : getFieldValue().hashCode());
        hashCode = prime * hashCode + ((getColor() == null) ? 0 : getColor().hashCode());
        hashCode = prime * hashCode + ((getSpecialValue() == null) ? 0 : getSpecialValue().hashCode());
        return hashCode;
    }

    @Override
    public CustomColor clone() {
        try {
            return (CustomColor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.CustomColorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
