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
 * The border options for a table border.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TableBorderOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableBorderOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The color of a table border.
     * </p>
     */
    private String color;
    /**
     * <p>
     * The thickness of a table border.
     * </p>
     */
    private Integer thickness;
    /**
     * <p>
     * The style (none, solid) of a table border.
     * </p>
     */
    private String style;

    /**
     * <p>
     * The color of a table border.
     * </p>
     * 
     * @param color
     *        The color of a table border.
     */

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * <p>
     * The color of a table border.
     * </p>
     * 
     * @return The color of a table border.
     */

    public String getColor() {
        return this.color;
    }

    /**
     * <p>
     * The color of a table border.
     * </p>
     * 
     * @param color
     *        The color of a table border.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableBorderOptions withColor(String color) {
        setColor(color);
        return this;
    }

    /**
     * <p>
     * The thickness of a table border.
     * </p>
     * 
     * @param thickness
     *        The thickness of a table border.
     */

    public void setThickness(Integer thickness) {
        this.thickness = thickness;
    }

    /**
     * <p>
     * The thickness of a table border.
     * </p>
     * 
     * @return The thickness of a table border.
     */

    public Integer getThickness() {
        return this.thickness;
    }

    /**
     * <p>
     * The thickness of a table border.
     * </p>
     * 
     * @param thickness
     *        The thickness of a table border.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableBorderOptions withThickness(Integer thickness) {
        setThickness(thickness);
        return this;
    }

    /**
     * <p>
     * The style (none, solid) of a table border.
     * </p>
     * 
     * @param style
     *        The style (none, solid) of a table border.
     * @see TableBorderStyle
     */

    public void setStyle(String style) {
        this.style = style;
    }

    /**
     * <p>
     * The style (none, solid) of a table border.
     * </p>
     * 
     * @return The style (none, solid) of a table border.
     * @see TableBorderStyle
     */

    public String getStyle() {
        return this.style;
    }

    /**
     * <p>
     * The style (none, solid) of a table border.
     * </p>
     * 
     * @param style
     *        The style (none, solid) of a table border.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TableBorderStyle
     */

    public TableBorderOptions withStyle(String style) {
        setStyle(style);
        return this;
    }

    /**
     * <p>
     * The style (none, solid) of a table border.
     * </p>
     * 
     * @param style
     *        The style (none, solid) of a table border.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TableBorderStyle
     */

    public TableBorderOptions withStyle(TableBorderStyle style) {
        this.style = style.toString();
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
        if (getColor() != null)
            sb.append("Color: ").append(getColor()).append(",");
        if (getThickness() != null)
            sb.append("Thickness: ").append(getThickness()).append(",");
        if (getStyle() != null)
            sb.append("Style: ").append(getStyle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableBorderOptions == false)
            return false;
        TableBorderOptions other = (TableBorderOptions) obj;
        if (other.getColor() == null ^ this.getColor() == null)
            return false;
        if (other.getColor() != null && other.getColor().equals(this.getColor()) == false)
            return false;
        if (other.getThickness() == null ^ this.getThickness() == null)
            return false;
        if (other.getThickness() != null && other.getThickness().equals(this.getThickness()) == false)
            return false;
        if (other.getStyle() == null ^ this.getStyle() == null)
            return false;
        if (other.getStyle() != null && other.getStyle().equals(this.getStyle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColor() == null) ? 0 : getColor().hashCode());
        hashCode = prime * hashCode + ((getThickness() == null) ? 0 : getThickness().hashCode());
        hashCode = prime * hashCode + ((getStyle() == null) ? 0 : getStyle().hashCode());
        return hashCode;
    }

    @Override
    public TableBorderOptions clone() {
        try {
            return (TableBorderOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TableBorderOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
