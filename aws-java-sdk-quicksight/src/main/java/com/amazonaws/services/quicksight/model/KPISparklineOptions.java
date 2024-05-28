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
 * The options that determine the visibility, color, type, and tooltip visibility of the sparkline of a KPI visual.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/KPISparklineOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KPISparklineOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The visibility of the sparkline.
     * </p>
     */
    private String visibility;
    /**
     * <p>
     * The type of the sparkline.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The color of the sparkline.
     * </p>
     */
    private String color;
    /**
     * <p>
     * The tooltip visibility of the sparkline.
     * </p>
     */
    private String tooltipVisibility;

    /**
     * <p>
     * The visibility of the sparkline.
     * </p>
     * 
     * @param visibility
     *        The visibility of the sparkline.
     * @see Visibility
     */

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * <p>
     * The visibility of the sparkline.
     * </p>
     * 
     * @return The visibility of the sparkline.
     * @see Visibility
     */

    public String getVisibility() {
        return this.visibility;
    }

    /**
     * <p>
     * The visibility of the sparkline.
     * </p>
     * 
     * @param visibility
     *        The visibility of the sparkline.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public KPISparklineOptions withVisibility(String visibility) {
        setVisibility(visibility);
        return this;
    }

    /**
     * <p>
     * The visibility of the sparkline.
     * </p>
     * 
     * @param visibility
     *        The visibility of the sparkline.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public KPISparklineOptions withVisibility(Visibility visibility) {
        this.visibility = visibility.toString();
        return this;
    }

    /**
     * <p>
     * The type of the sparkline.
     * </p>
     * 
     * @param type
     *        The type of the sparkline.
     * @see KPISparklineType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the sparkline.
     * </p>
     * 
     * @return The type of the sparkline.
     * @see KPISparklineType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the sparkline.
     * </p>
     * 
     * @param type
     *        The type of the sparkline.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KPISparklineType
     */

    public KPISparklineOptions withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the sparkline.
     * </p>
     * 
     * @param type
     *        The type of the sparkline.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KPISparklineType
     */

    public KPISparklineOptions withType(KPISparklineType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The color of the sparkline.
     * </p>
     * 
     * @param color
     *        The color of the sparkline.
     */

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * <p>
     * The color of the sparkline.
     * </p>
     * 
     * @return The color of the sparkline.
     */

    public String getColor() {
        return this.color;
    }

    /**
     * <p>
     * The color of the sparkline.
     * </p>
     * 
     * @param color
     *        The color of the sparkline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KPISparklineOptions withColor(String color) {
        setColor(color);
        return this;
    }

    /**
     * <p>
     * The tooltip visibility of the sparkline.
     * </p>
     * 
     * @param tooltipVisibility
     *        The tooltip visibility of the sparkline.
     * @see Visibility
     */

    public void setTooltipVisibility(String tooltipVisibility) {
        this.tooltipVisibility = tooltipVisibility;
    }

    /**
     * <p>
     * The tooltip visibility of the sparkline.
     * </p>
     * 
     * @return The tooltip visibility of the sparkline.
     * @see Visibility
     */

    public String getTooltipVisibility() {
        return this.tooltipVisibility;
    }

    /**
     * <p>
     * The tooltip visibility of the sparkline.
     * </p>
     * 
     * @param tooltipVisibility
     *        The tooltip visibility of the sparkline.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public KPISparklineOptions withTooltipVisibility(String tooltipVisibility) {
        setTooltipVisibility(tooltipVisibility);
        return this;
    }

    /**
     * <p>
     * The tooltip visibility of the sparkline.
     * </p>
     * 
     * @param tooltipVisibility
     *        The tooltip visibility of the sparkline.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public KPISparklineOptions withTooltipVisibility(Visibility tooltipVisibility) {
        this.tooltipVisibility = tooltipVisibility.toString();
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
        if (getVisibility() != null)
            sb.append("Visibility: ").append(getVisibility()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getColor() != null)
            sb.append("Color: ").append(getColor()).append(",");
        if (getTooltipVisibility() != null)
            sb.append("TooltipVisibility: ").append(getTooltipVisibility());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KPISparklineOptions == false)
            return false;
        KPISparklineOptions other = (KPISparklineOptions) obj;
        if (other.getVisibility() == null ^ this.getVisibility() == null)
            return false;
        if (other.getVisibility() != null && other.getVisibility().equals(this.getVisibility()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getColor() == null ^ this.getColor() == null)
            return false;
        if (other.getColor() != null && other.getColor().equals(this.getColor()) == false)
            return false;
        if (other.getTooltipVisibility() == null ^ this.getTooltipVisibility() == null)
            return false;
        if (other.getTooltipVisibility() != null && other.getTooltipVisibility().equals(this.getTooltipVisibility()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVisibility() == null) ? 0 : getVisibility().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getColor() == null) ? 0 : getColor().hashCode());
        hashCode = prime * hashCode + ((getTooltipVisibility() == null) ? 0 : getTooltipVisibility().hashCode());
        return hashCode;
    }

    @Override
    public KPISparklineOptions clone() {
        try {
            return (KPISparklineOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.KPISparklineOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
