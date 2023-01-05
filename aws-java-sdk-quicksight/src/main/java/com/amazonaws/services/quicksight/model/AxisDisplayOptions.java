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
 * The display options for the axis label.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AxisDisplayOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AxisDisplayOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The tick label options of an axis.
     * </p>
     */
    private AxisTickLabelOptions tickLabelOptions;
    /**
     * <p>
     * Determines whether or not the axis line is visible.
     * </p>
     */
    private String axisLineVisibility;
    /**
     * <p>
     * Determines whether or not the grid line is visible.
     * </p>
     */
    private String gridLineVisibility;
    /**
     * <p>
     * The data options for an axis.
     * </p>
     */
    private AxisDataOptions dataOptions;
    /**
     * <p>
     * The scroll bar options for an axis.
     * </p>
     */
    private ScrollBarOptions scrollbarOptions;
    /**
     * <p>
     * The offset value that determines the starting placement of the axis within a visual's bounds.
     * </p>
     */
    private String axisOffset;

    /**
     * <p>
     * The tick label options of an axis.
     * </p>
     * 
     * @param tickLabelOptions
     *        The tick label options of an axis.
     */

    public void setTickLabelOptions(AxisTickLabelOptions tickLabelOptions) {
        this.tickLabelOptions = tickLabelOptions;
    }

    /**
     * <p>
     * The tick label options of an axis.
     * </p>
     * 
     * @return The tick label options of an axis.
     */

    public AxisTickLabelOptions getTickLabelOptions() {
        return this.tickLabelOptions;
    }

    /**
     * <p>
     * The tick label options of an axis.
     * </p>
     * 
     * @param tickLabelOptions
     *        The tick label options of an axis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AxisDisplayOptions withTickLabelOptions(AxisTickLabelOptions tickLabelOptions) {
        setTickLabelOptions(tickLabelOptions);
        return this;
    }

    /**
     * <p>
     * Determines whether or not the axis line is visible.
     * </p>
     * 
     * @param axisLineVisibility
     *        Determines whether or not the axis line is visible.
     * @see Visibility
     */

    public void setAxisLineVisibility(String axisLineVisibility) {
        this.axisLineVisibility = axisLineVisibility;
    }

    /**
     * <p>
     * Determines whether or not the axis line is visible.
     * </p>
     * 
     * @return Determines whether or not the axis line is visible.
     * @see Visibility
     */

    public String getAxisLineVisibility() {
        return this.axisLineVisibility;
    }

    /**
     * <p>
     * Determines whether or not the axis line is visible.
     * </p>
     * 
     * @param axisLineVisibility
     *        Determines whether or not the axis line is visible.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public AxisDisplayOptions withAxisLineVisibility(String axisLineVisibility) {
        setAxisLineVisibility(axisLineVisibility);
        return this;
    }

    /**
     * <p>
     * Determines whether or not the axis line is visible.
     * </p>
     * 
     * @param axisLineVisibility
     *        Determines whether or not the axis line is visible.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public AxisDisplayOptions withAxisLineVisibility(Visibility axisLineVisibility) {
        this.axisLineVisibility = axisLineVisibility.toString();
        return this;
    }

    /**
     * <p>
     * Determines whether or not the grid line is visible.
     * </p>
     * 
     * @param gridLineVisibility
     *        Determines whether or not the grid line is visible.
     * @see Visibility
     */

    public void setGridLineVisibility(String gridLineVisibility) {
        this.gridLineVisibility = gridLineVisibility;
    }

    /**
     * <p>
     * Determines whether or not the grid line is visible.
     * </p>
     * 
     * @return Determines whether or not the grid line is visible.
     * @see Visibility
     */

    public String getGridLineVisibility() {
        return this.gridLineVisibility;
    }

    /**
     * <p>
     * Determines whether or not the grid line is visible.
     * </p>
     * 
     * @param gridLineVisibility
     *        Determines whether or not the grid line is visible.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public AxisDisplayOptions withGridLineVisibility(String gridLineVisibility) {
        setGridLineVisibility(gridLineVisibility);
        return this;
    }

    /**
     * <p>
     * Determines whether or not the grid line is visible.
     * </p>
     * 
     * @param gridLineVisibility
     *        Determines whether or not the grid line is visible.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public AxisDisplayOptions withGridLineVisibility(Visibility gridLineVisibility) {
        this.gridLineVisibility = gridLineVisibility.toString();
        return this;
    }

    /**
     * <p>
     * The data options for an axis.
     * </p>
     * 
     * @param dataOptions
     *        The data options for an axis.
     */

    public void setDataOptions(AxisDataOptions dataOptions) {
        this.dataOptions = dataOptions;
    }

    /**
     * <p>
     * The data options for an axis.
     * </p>
     * 
     * @return The data options for an axis.
     */

    public AxisDataOptions getDataOptions() {
        return this.dataOptions;
    }

    /**
     * <p>
     * The data options for an axis.
     * </p>
     * 
     * @param dataOptions
     *        The data options for an axis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AxisDisplayOptions withDataOptions(AxisDataOptions dataOptions) {
        setDataOptions(dataOptions);
        return this;
    }

    /**
     * <p>
     * The scroll bar options for an axis.
     * </p>
     * 
     * @param scrollbarOptions
     *        The scroll bar options for an axis.
     */

    public void setScrollbarOptions(ScrollBarOptions scrollbarOptions) {
        this.scrollbarOptions = scrollbarOptions;
    }

    /**
     * <p>
     * The scroll bar options for an axis.
     * </p>
     * 
     * @return The scroll bar options for an axis.
     */

    public ScrollBarOptions getScrollbarOptions() {
        return this.scrollbarOptions;
    }

    /**
     * <p>
     * The scroll bar options for an axis.
     * </p>
     * 
     * @param scrollbarOptions
     *        The scroll bar options for an axis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AxisDisplayOptions withScrollbarOptions(ScrollBarOptions scrollbarOptions) {
        setScrollbarOptions(scrollbarOptions);
        return this;
    }

    /**
     * <p>
     * The offset value that determines the starting placement of the axis within a visual's bounds.
     * </p>
     * 
     * @param axisOffset
     *        The offset value that determines the starting placement of the axis within a visual's bounds.
     */

    public void setAxisOffset(String axisOffset) {
        this.axisOffset = axisOffset;
    }

    /**
     * <p>
     * The offset value that determines the starting placement of the axis within a visual's bounds.
     * </p>
     * 
     * @return The offset value that determines the starting placement of the axis within a visual's bounds.
     */

    public String getAxisOffset() {
        return this.axisOffset;
    }

    /**
     * <p>
     * The offset value that determines the starting placement of the axis within a visual's bounds.
     * </p>
     * 
     * @param axisOffset
     *        The offset value that determines the starting placement of the axis within a visual's bounds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AxisDisplayOptions withAxisOffset(String axisOffset) {
        setAxisOffset(axisOffset);
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
        if (getTickLabelOptions() != null)
            sb.append("TickLabelOptions: ").append(getTickLabelOptions()).append(",");
        if (getAxisLineVisibility() != null)
            sb.append("AxisLineVisibility: ").append(getAxisLineVisibility()).append(",");
        if (getGridLineVisibility() != null)
            sb.append("GridLineVisibility: ").append(getGridLineVisibility()).append(",");
        if (getDataOptions() != null)
            sb.append("DataOptions: ").append(getDataOptions()).append(",");
        if (getScrollbarOptions() != null)
            sb.append("ScrollbarOptions: ").append(getScrollbarOptions()).append(",");
        if (getAxisOffset() != null)
            sb.append("AxisOffset: ").append(getAxisOffset());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AxisDisplayOptions == false)
            return false;
        AxisDisplayOptions other = (AxisDisplayOptions) obj;
        if (other.getTickLabelOptions() == null ^ this.getTickLabelOptions() == null)
            return false;
        if (other.getTickLabelOptions() != null && other.getTickLabelOptions().equals(this.getTickLabelOptions()) == false)
            return false;
        if (other.getAxisLineVisibility() == null ^ this.getAxisLineVisibility() == null)
            return false;
        if (other.getAxisLineVisibility() != null && other.getAxisLineVisibility().equals(this.getAxisLineVisibility()) == false)
            return false;
        if (other.getGridLineVisibility() == null ^ this.getGridLineVisibility() == null)
            return false;
        if (other.getGridLineVisibility() != null && other.getGridLineVisibility().equals(this.getGridLineVisibility()) == false)
            return false;
        if (other.getDataOptions() == null ^ this.getDataOptions() == null)
            return false;
        if (other.getDataOptions() != null && other.getDataOptions().equals(this.getDataOptions()) == false)
            return false;
        if (other.getScrollbarOptions() == null ^ this.getScrollbarOptions() == null)
            return false;
        if (other.getScrollbarOptions() != null && other.getScrollbarOptions().equals(this.getScrollbarOptions()) == false)
            return false;
        if (other.getAxisOffset() == null ^ this.getAxisOffset() == null)
            return false;
        if (other.getAxisOffset() != null && other.getAxisOffset().equals(this.getAxisOffset()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTickLabelOptions() == null) ? 0 : getTickLabelOptions().hashCode());
        hashCode = prime * hashCode + ((getAxisLineVisibility() == null) ? 0 : getAxisLineVisibility().hashCode());
        hashCode = prime * hashCode + ((getGridLineVisibility() == null) ? 0 : getGridLineVisibility().hashCode());
        hashCode = prime * hashCode + ((getDataOptions() == null) ? 0 : getDataOptions().hashCode());
        hashCode = prime * hashCode + ((getScrollbarOptions() == null) ? 0 : getScrollbarOptions().hashCode());
        hashCode = prime * hashCode + ((getAxisOffset() == null) ? 0 : getAxisOffset().hashCode());
        return hashCode;
    }

    @Override
    public AxisDisplayOptions clone() {
        try {
            return (AxisDisplayOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AxisDisplayOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
