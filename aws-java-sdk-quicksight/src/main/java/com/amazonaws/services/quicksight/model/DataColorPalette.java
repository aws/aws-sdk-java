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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The theme colors that are used for data colors in charts. The colors description is a hexadecimal color code that
 * consists of six alphanumerical characters, prefixed with <code>#</code>, for example #37BFF5.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DataColorPalette" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataColorPalette implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The hexadecimal codes for the colors.
     * </p>
     */
    private java.util.List<String> colors;
    /**
     * <p>
     * The minimum and maximum hexadecimal codes that describe a color gradient.
     * </p>
     */
    private java.util.List<String> minMaxGradient;
    /**
     * <p>
     * The hexadecimal code of a color that applies to charts where a lack of data is highlighted.
     * </p>
     */
    private String emptyFillColor;

    /**
     * <p>
     * The hexadecimal codes for the colors.
     * </p>
     * 
     * @return The hexadecimal codes for the colors.
     */

    public java.util.List<String> getColors() {
        return colors;
    }

    /**
     * <p>
     * The hexadecimal codes for the colors.
     * </p>
     * 
     * @param colors
     *        The hexadecimal codes for the colors.
     */

    public void setColors(java.util.Collection<String> colors) {
        if (colors == null) {
            this.colors = null;
            return;
        }

        this.colors = new java.util.ArrayList<String>(colors);
    }

    /**
     * <p>
     * The hexadecimal codes for the colors.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColors(java.util.Collection)} or {@link #withColors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param colors
     *        The hexadecimal codes for the colors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataColorPalette withColors(String... colors) {
        if (this.colors == null) {
            setColors(new java.util.ArrayList<String>(colors.length));
        }
        for (String ele : colors) {
            this.colors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The hexadecimal codes for the colors.
     * </p>
     * 
     * @param colors
     *        The hexadecimal codes for the colors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataColorPalette withColors(java.util.Collection<String> colors) {
        setColors(colors);
        return this;
    }

    /**
     * <p>
     * The minimum and maximum hexadecimal codes that describe a color gradient.
     * </p>
     * 
     * @return The minimum and maximum hexadecimal codes that describe a color gradient.
     */

    public java.util.List<String> getMinMaxGradient() {
        return minMaxGradient;
    }

    /**
     * <p>
     * The minimum and maximum hexadecimal codes that describe a color gradient.
     * </p>
     * 
     * @param minMaxGradient
     *        The minimum and maximum hexadecimal codes that describe a color gradient.
     */

    public void setMinMaxGradient(java.util.Collection<String> minMaxGradient) {
        if (minMaxGradient == null) {
            this.minMaxGradient = null;
            return;
        }

        this.minMaxGradient = new java.util.ArrayList<String>(minMaxGradient);
    }

    /**
     * <p>
     * The minimum and maximum hexadecimal codes that describe a color gradient.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMinMaxGradient(java.util.Collection)} or {@link #withMinMaxGradient(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param minMaxGradient
     *        The minimum and maximum hexadecimal codes that describe a color gradient.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataColorPalette withMinMaxGradient(String... minMaxGradient) {
        if (this.minMaxGradient == null) {
            setMinMaxGradient(new java.util.ArrayList<String>(minMaxGradient.length));
        }
        for (String ele : minMaxGradient) {
            this.minMaxGradient.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The minimum and maximum hexadecimal codes that describe a color gradient.
     * </p>
     * 
     * @param minMaxGradient
     *        The minimum and maximum hexadecimal codes that describe a color gradient.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataColorPalette withMinMaxGradient(java.util.Collection<String> minMaxGradient) {
        setMinMaxGradient(minMaxGradient);
        return this;
    }

    /**
     * <p>
     * The hexadecimal code of a color that applies to charts where a lack of data is highlighted.
     * </p>
     * 
     * @param emptyFillColor
     *        The hexadecimal code of a color that applies to charts where a lack of data is highlighted.
     */

    public void setEmptyFillColor(String emptyFillColor) {
        this.emptyFillColor = emptyFillColor;
    }

    /**
     * <p>
     * The hexadecimal code of a color that applies to charts where a lack of data is highlighted.
     * </p>
     * 
     * @return The hexadecimal code of a color that applies to charts where a lack of data is highlighted.
     */

    public String getEmptyFillColor() {
        return this.emptyFillColor;
    }

    /**
     * <p>
     * The hexadecimal code of a color that applies to charts where a lack of data is highlighted.
     * </p>
     * 
     * @param emptyFillColor
     *        The hexadecimal code of a color that applies to charts where a lack of data is highlighted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataColorPalette withEmptyFillColor(String emptyFillColor) {
        setEmptyFillColor(emptyFillColor);
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
        if (getMinMaxGradient() != null)
            sb.append("MinMaxGradient: ").append(getMinMaxGradient()).append(",");
        if (getEmptyFillColor() != null)
            sb.append("EmptyFillColor: ").append(getEmptyFillColor());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataColorPalette == false)
            return false;
        DataColorPalette other = (DataColorPalette) obj;
        if (other.getColors() == null ^ this.getColors() == null)
            return false;
        if (other.getColors() != null && other.getColors().equals(this.getColors()) == false)
            return false;
        if (other.getMinMaxGradient() == null ^ this.getMinMaxGradient() == null)
            return false;
        if (other.getMinMaxGradient() != null && other.getMinMaxGradient().equals(this.getMinMaxGradient()) == false)
            return false;
        if (other.getEmptyFillColor() == null ^ this.getEmptyFillColor() == null)
            return false;
        if (other.getEmptyFillColor() != null && other.getEmptyFillColor().equals(this.getEmptyFillColor()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColors() == null) ? 0 : getColors().hashCode());
        hashCode = prime * hashCode + ((getMinMaxGradient() == null) ? 0 : getMinMaxGradient().hashCode());
        hashCode = prime * hashCode + ((getEmptyFillColor() == null) ? 0 : getEmptyFillColor().hashCode());
        return hashCode;
    }

    @Override
    public DataColorPalette clone() {
        try {
            return (DataColorPalette) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DataColorPaletteMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
