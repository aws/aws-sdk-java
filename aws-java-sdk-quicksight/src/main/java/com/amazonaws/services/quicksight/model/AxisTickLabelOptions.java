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
 * The tick label options of an axis.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AxisTickLabelOptions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AxisTickLabelOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines whether or not the axis ticks are visible.
     * </p>
     */
    private LabelOptions labelOptions;
    /**
     * <p>
     * The rotation angle of the axis tick labels.
     * </p>
     */
    private Double rotationAngle;

    /**
     * <p>
     * Determines whether or not the axis ticks are visible.
     * </p>
     * 
     * @param labelOptions
     *        Determines whether or not the axis ticks are visible.
     */

    public void setLabelOptions(LabelOptions labelOptions) {
        this.labelOptions = labelOptions;
    }

    /**
     * <p>
     * Determines whether or not the axis ticks are visible.
     * </p>
     * 
     * @return Determines whether or not the axis ticks are visible.
     */

    public LabelOptions getLabelOptions() {
        return this.labelOptions;
    }

    /**
     * <p>
     * Determines whether or not the axis ticks are visible.
     * </p>
     * 
     * @param labelOptions
     *        Determines whether or not the axis ticks are visible.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AxisTickLabelOptions withLabelOptions(LabelOptions labelOptions) {
        setLabelOptions(labelOptions);
        return this;
    }

    /**
     * <p>
     * The rotation angle of the axis tick labels.
     * </p>
     * 
     * @param rotationAngle
     *        The rotation angle of the axis tick labels.
     */

    public void setRotationAngle(Double rotationAngle) {
        this.rotationAngle = rotationAngle;
    }

    /**
     * <p>
     * The rotation angle of the axis tick labels.
     * </p>
     * 
     * @return The rotation angle of the axis tick labels.
     */

    public Double getRotationAngle() {
        return this.rotationAngle;
    }

    /**
     * <p>
     * The rotation angle of the axis tick labels.
     * </p>
     * 
     * @param rotationAngle
     *        The rotation angle of the axis tick labels.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AxisTickLabelOptions withRotationAngle(Double rotationAngle) {
        setRotationAngle(rotationAngle);
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
        if (getLabelOptions() != null)
            sb.append("LabelOptions: ").append(getLabelOptions()).append(",");
        if (getRotationAngle() != null)
            sb.append("RotationAngle: ").append(getRotationAngle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AxisTickLabelOptions == false)
            return false;
        AxisTickLabelOptions other = (AxisTickLabelOptions) obj;
        if (other.getLabelOptions() == null ^ this.getLabelOptions() == null)
            return false;
        if (other.getLabelOptions() != null && other.getLabelOptions().equals(this.getLabelOptions()) == false)
            return false;
        if (other.getRotationAngle() == null ^ this.getRotationAngle() == null)
            return false;
        if (other.getRotationAngle() != null && other.getRotationAngle().equals(this.getRotationAngle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLabelOptions() == null) ? 0 : getLabelOptions().hashCode());
        hashCode = prime * hashCode + ((getRotationAngle() == null) ? 0 : getRotationAngle().hashCode());
        return hashCode;
    }

    @Override
    public AxisTickLabelOptions clone() {
        try {
            return (AxisTickLabelOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AxisTickLabelOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
