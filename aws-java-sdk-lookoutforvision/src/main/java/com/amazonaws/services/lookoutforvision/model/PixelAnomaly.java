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
package com.amazonaws.services.lookoutforvision.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the pixels in an anomaly mask. For more information, see <a>Anomaly</a>. <code>PixelAnomaly</code>
 * is only returned by image segmentation models.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/PixelAnomaly" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PixelAnomaly implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The percentage area of the image that the anomaly type covers.
     * </p>
     */
    private Float totalPercentageArea;
    /**
     * <p>
     * A hex color value for the mask that covers an anomaly type. Each anomaly type has a different mask color. The
     * color maps to the color of the anomaly type used in the training dataset.
     * </p>
     */
    private String color;

    /**
     * <p>
     * The percentage area of the image that the anomaly type covers.
     * </p>
     * 
     * @param totalPercentageArea
     *        The percentage area of the image that the anomaly type covers.
     */

    public void setTotalPercentageArea(Float totalPercentageArea) {
        this.totalPercentageArea = totalPercentageArea;
    }

    /**
     * <p>
     * The percentage area of the image that the anomaly type covers.
     * </p>
     * 
     * @return The percentage area of the image that the anomaly type covers.
     */

    public Float getTotalPercentageArea() {
        return this.totalPercentageArea;
    }

    /**
     * <p>
     * The percentage area of the image that the anomaly type covers.
     * </p>
     * 
     * @param totalPercentageArea
     *        The percentage area of the image that the anomaly type covers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PixelAnomaly withTotalPercentageArea(Float totalPercentageArea) {
        setTotalPercentageArea(totalPercentageArea);
        return this;
    }

    /**
     * <p>
     * A hex color value for the mask that covers an anomaly type. Each anomaly type has a different mask color. The
     * color maps to the color of the anomaly type used in the training dataset.
     * </p>
     * 
     * @param color
     *        A hex color value for the mask that covers an anomaly type. Each anomaly type has a different mask color.
     *        The color maps to the color of the anomaly type used in the training dataset.
     */

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * <p>
     * A hex color value for the mask that covers an anomaly type. Each anomaly type has a different mask color. The
     * color maps to the color of the anomaly type used in the training dataset.
     * </p>
     * 
     * @return A hex color value for the mask that covers an anomaly type. Each anomaly type has a different mask color.
     *         The color maps to the color of the anomaly type used in the training dataset.
     */

    public String getColor() {
        return this.color;
    }

    /**
     * <p>
     * A hex color value for the mask that covers an anomaly type. Each anomaly type has a different mask color. The
     * color maps to the color of the anomaly type used in the training dataset.
     * </p>
     * 
     * @param color
     *        A hex color value for the mask that covers an anomaly type. Each anomaly type has a different mask color.
     *        The color maps to the color of the anomaly type used in the training dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PixelAnomaly withColor(String color) {
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
        if (getTotalPercentageArea() != null)
            sb.append("TotalPercentageArea: ").append(getTotalPercentageArea()).append(",");
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

        if (obj instanceof PixelAnomaly == false)
            return false;
        PixelAnomaly other = (PixelAnomaly) obj;
        if (other.getTotalPercentageArea() == null ^ this.getTotalPercentageArea() == null)
            return false;
        if (other.getTotalPercentageArea() != null && other.getTotalPercentageArea().equals(this.getTotalPercentageArea()) == false)
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

        hashCode = prime * hashCode + ((getTotalPercentageArea() == null) ? 0 : getTotalPercentageArea().hashCode());
        hashCode = prime * hashCode + ((getColor() == null) ? 0 : getColor().hashCode());
        return hashCode;
    }

    @Override
    public PixelAnomaly clone() {
        try {
            return (PixelAnomaly) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutforvision.model.transform.PixelAnomalyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
