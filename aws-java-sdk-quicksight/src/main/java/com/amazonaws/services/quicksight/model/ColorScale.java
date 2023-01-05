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
 * Determines the color scale that is applied to the visual.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ColorScale" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColorScale implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines the list of colors that are applied to the visual.
     * </p>
     */
    private java.util.List<DataColor> colors;
    /**
     * <p>
     * Determines the color fill type.
     * </p>
     */
    private String colorFillType;
    /**
     * <p>
     * Determines the color that is applied to null values.
     * </p>
     */
    private DataColor nullValueColor;

    /**
     * <p>
     * Determines the list of colors that are applied to the visual.
     * </p>
     * 
     * @return Determines the list of colors that are applied to the visual.
     */

    public java.util.List<DataColor> getColors() {
        return colors;
    }

    /**
     * <p>
     * Determines the list of colors that are applied to the visual.
     * </p>
     * 
     * @param colors
     *        Determines the list of colors that are applied to the visual.
     */

    public void setColors(java.util.Collection<DataColor> colors) {
        if (colors == null) {
            this.colors = null;
            return;
        }

        this.colors = new java.util.ArrayList<DataColor>(colors);
    }

    /**
     * <p>
     * Determines the list of colors that are applied to the visual.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColors(java.util.Collection)} or {@link #withColors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param colors
     *        Determines the list of colors that are applied to the visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColorScale withColors(DataColor... colors) {
        if (this.colors == null) {
            setColors(new java.util.ArrayList<DataColor>(colors.length));
        }
        for (DataColor ele : colors) {
            this.colors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Determines the list of colors that are applied to the visual.
     * </p>
     * 
     * @param colors
     *        Determines the list of colors that are applied to the visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColorScale withColors(java.util.Collection<DataColor> colors) {
        setColors(colors);
        return this;
    }

    /**
     * <p>
     * Determines the color fill type.
     * </p>
     * 
     * @param colorFillType
     *        Determines the color fill type.
     * @see ColorFillType
     */

    public void setColorFillType(String colorFillType) {
        this.colorFillType = colorFillType;
    }

    /**
     * <p>
     * Determines the color fill type.
     * </p>
     * 
     * @return Determines the color fill type.
     * @see ColorFillType
     */

    public String getColorFillType() {
        return this.colorFillType;
    }

    /**
     * <p>
     * Determines the color fill type.
     * </p>
     * 
     * @param colorFillType
     *        Determines the color fill type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColorFillType
     */

    public ColorScale withColorFillType(String colorFillType) {
        setColorFillType(colorFillType);
        return this;
    }

    /**
     * <p>
     * Determines the color fill type.
     * </p>
     * 
     * @param colorFillType
     *        Determines the color fill type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColorFillType
     */

    public ColorScale withColorFillType(ColorFillType colorFillType) {
        this.colorFillType = colorFillType.toString();
        return this;
    }

    /**
     * <p>
     * Determines the color that is applied to null values.
     * </p>
     * 
     * @param nullValueColor
     *        Determines the color that is applied to null values.
     */

    public void setNullValueColor(DataColor nullValueColor) {
        this.nullValueColor = nullValueColor;
    }

    /**
     * <p>
     * Determines the color that is applied to null values.
     * </p>
     * 
     * @return Determines the color that is applied to null values.
     */

    public DataColor getNullValueColor() {
        return this.nullValueColor;
    }

    /**
     * <p>
     * Determines the color that is applied to null values.
     * </p>
     * 
     * @param nullValueColor
     *        Determines the color that is applied to null values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColorScale withNullValueColor(DataColor nullValueColor) {
        setNullValueColor(nullValueColor);
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
        if (getColors() != null)
            sb.append("Colors: ").append(getColors()).append(",");
        if (getColorFillType() != null)
            sb.append("ColorFillType: ").append(getColorFillType()).append(",");
        if (getNullValueColor() != null)
            sb.append("NullValueColor: ").append(getNullValueColor());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColorScale == false)
            return false;
        ColorScale other = (ColorScale) obj;
        if (other.getColors() == null ^ this.getColors() == null)
            return false;
        if (other.getColors() != null && other.getColors().equals(this.getColors()) == false)
            return false;
        if (other.getColorFillType() == null ^ this.getColorFillType() == null)
            return false;
        if (other.getColorFillType() != null && other.getColorFillType().equals(this.getColorFillType()) == false)
            return false;
        if (other.getNullValueColor() == null ^ this.getNullValueColor() == null)
            return false;
        if (other.getNullValueColor() != null && other.getNullValueColor().equals(this.getNullValueColor()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColors() == null) ? 0 : getColors().hashCode());
        hashCode = prime * hashCode + ((getColorFillType() == null) ? 0 : getColorFillType().hashCode());
        hashCode = prime * hashCode + ((getNullValueColor() == null) ? 0 : getNullValueColor().hashCode());
        return hashCode;
    }

    @Override
    public ColorScale clone() {
        try {
            return (ColorScale) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ColorScaleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
