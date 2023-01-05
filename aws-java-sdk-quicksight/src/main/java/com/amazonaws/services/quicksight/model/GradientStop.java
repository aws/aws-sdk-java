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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Determines the gradient stop configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/GradientStop" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GradientStop implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines gradient offset value.
     * </p>
     */
    private Double gradientOffset;
    /**
     * <p>
     * Determines the data value.
     * </p>
     */
    private Double dataValue;
    /**
     * <p>
     * Determines the color.
     * </p>
     */
    private String color;

    /**
     * <p>
     * Determines gradient offset value.
     * </p>
     * 
     * @param gradientOffset
     *        Determines gradient offset value.
     */

    public void setGradientOffset(Double gradientOffset) {
        this.gradientOffset = gradientOffset;
    }

    /**
     * <p>
     * Determines gradient offset value.
     * </p>
     * 
     * @return Determines gradient offset value.
     */

    public Double getGradientOffset() {
        return this.gradientOffset;
    }

    /**
     * <p>
     * Determines gradient offset value.
     * </p>
     * 
     * @param gradientOffset
     *        Determines gradient offset value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GradientStop withGradientOffset(Double gradientOffset) {
        setGradientOffset(gradientOffset);
        return this;
    }

    /**
     * <p>
     * Determines the data value.
     * </p>
     * 
     * @param dataValue
     *        Determines the data value.
     */

    public void setDataValue(Double dataValue) {
        this.dataValue = dataValue;
    }

    /**
     * <p>
     * Determines the data value.
     * </p>
     * 
     * @return Determines the data value.
     */

    public Double getDataValue() {
        return this.dataValue;
    }

    /**
     * <p>
     * Determines the data value.
     * </p>
     * 
     * @param dataValue
     *        Determines the data value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GradientStop withDataValue(Double dataValue) {
        setDataValue(dataValue);
        return this;
    }

    /**
     * <p>
     * Determines the color.
     * </p>
     * 
     * @param color
     *        Determines the color.
     */

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * <p>
     * Determines the color.
     * </p>
     * 
     * @return Determines the color.
     */

    public String getColor() {
        return this.color;
    }

    /**
     * <p>
     * Determines the color.
     * </p>
     * 
     * @param color
     *        Determines the color.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GradientStop withColor(String color) {
        setColor(color);
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
        if (getGradientOffset() != null)
            sb.append("GradientOffset: ").append(getGradientOffset()).append(",");
        if (getDataValue() != null)
            sb.append("DataValue: ").append(getDataValue()).append(",");
        if (getColor() != null)
            sb.append("Color: ").append(getColor());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GradientStop == false)
            return false;
        GradientStop other = (GradientStop) obj;
        if (other.getGradientOffset() == null ^ this.getGradientOffset() == null)
            return false;
        if (other.getGradientOffset() != null && other.getGradientOffset().equals(this.getGradientOffset()) == false)
            return false;
        if (other.getDataValue() == null ^ this.getDataValue() == null)
            return false;
        if (other.getDataValue() != null && other.getDataValue().equals(this.getDataValue()) == false)
            return false;
        if (other.getColor() == null ^ this.getColor() == null)
            return false;
        if (other.getColor() != null && other.getColor().equals(this.getColor()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGradientOffset() == null) ? 0 : getGradientOffset().hashCode());
        hashCode = prime * hashCode + ((getDataValue() == null) ? 0 : getDataValue().hashCode());
        hashCode = prime * hashCode + ((getColor() == null) ? 0 : getColor().hashCode());
        return hashCode;
    }

    @Override
    public GradientStop clone() {
        try {
            return (GradientStop) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.GradientStopMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
