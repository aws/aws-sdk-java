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
 * The style options of the box plot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/BoxPlotStyleOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BoxPlotStyleOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The fill styles (solid, transparent) of the box plot.
     * </p>
     */
    private String fillStyle;

    /**
     * <p>
     * The fill styles (solid, transparent) of the box plot.
     * </p>
     * 
     * @param fillStyle
     *        The fill styles (solid, transparent) of the box plot.
     * @see BoxPlotFillStyle
     */

    public void setFillStyle(String fillStyle) {
        this.fillStyle = fillStyle;
    }

    /**
     * <p>
     * The fill styles (solid, transparent) of the box plot.
     * </p>
     * 
     * @return The fill styles (solid, transparent) of the box plot.
     * @see BoxPlotFillStyle
     */

    public String getFillStyle() {
        return this.fillStyle;
    }

    /**
     * <p>
     * The fill styles (solid, transparent) of the box plot.
     * </p>
     * 
     * @param fillStyle
     *        The fill styles (solid, transparent) of the box plot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BoxPlotFillStyle
     */

    public BoxPlotStyleOptions withFillStyle(String fillStyle) {
        setFillStyle(fillStyle);
        return this;
    }

    /**
     * <p>
     * The fill styles (solid, transparent) of the box plot.
     * </p>
     * 
     * @param fillStyle
     *        The fill styles (solid, transparent) of the box plot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BoxPlotFillStyle
     */

    public BoxPlotStyleOptions withFillStyle(BoxPlotFillStyle fillStyle) {
        this.fillStyle = fillStyle.toString();
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
        if (getFillStyle() != null)
            sb.append("FillStyle: ").append(getFillStyle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BoxPlotStyleOptions == false)
            return false;
        BoxPlotStyleOptions other = (BoxPlotStyleOptions) obj;
        if (other.getFillStyle() == null ^ this.getFillStyle() == null)
            return false;
        if (other.getFillStyle() != null && other.getFillStyle().equals(this.getFillStyle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFillStyle() == null) ? 0 : getFillStyle().hashCode());
        return hashCode;
    }

    @Override
    public BoxPlotStyleOptions clone() {
        try {
            return (BoxPlotStyleOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.BoxPlotStyleOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
