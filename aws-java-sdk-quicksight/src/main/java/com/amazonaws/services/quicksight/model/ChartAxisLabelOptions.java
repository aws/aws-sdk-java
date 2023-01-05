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
 * The label options for an axis on a chart.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ChartAxisLabelOptions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChartAxisLabelOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The visibility of an axis label on a chart. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VISIBLE</code>: Shows the axis.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HIDDEN</code>: Hides the axis.
     * </p>
     * </li>
     * </ul>
     */
    private String visibility;
    /**
     * <p>
     * The visibility configuration of the sort icon on a chart's axis label.
     * </p>
     */
    private String sortIconVisibility;
    /**
     * <p>
     * The label options for a chart axis.
     * </p>
     */
    private java.util.List<AxisLabelOptions> axisLabelOptions;

    /**
     * <p>
     * The visibility of an axis label on a chart. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VISIBLE</code>: Shows the axis.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HIDDEN</code>: Hides the axis.
     * </p>
     * </li>
     * </ul>
     * 
     * @param visibility
     *        The visibility of an axis label on a chart. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>VISIBLE</code>: Shows the axis.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HIDDEN</code>: Hides the axis.
     *        </p>
     *        </li>
     * @see Visibility
     */

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
     * <p>
     * The visibility of an axis label on a chart. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VISIBLE</code>: Shows the axis.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HIDDEN</code>: Hides the axis.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The visibility of an axis label on a chart. Choose one of the following options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>VISIBLE</code>: Shows the axis.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>HIDDEN</code>: Hides the axis.
     *         </p>
     *         </li>
     * @see Visibility
     */

    public String getVisibility() {
        return this.visibility;
    }

    /**
     * <p>
     * The visibility of an axis label on a chart. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VISIBLE</code>: Shows the axis.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HIDDEN</code>: Hides the axis.
     * </p>
     * </li>
     * </ul>
     * 
     * @param visibility
     *        The visibility of an axis label on a chart. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>VISIBLE</code>: Shows the axis.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HIDDEN</code>: Hides the axis.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public ChartAxisLabelOptions withVisibility(String visibility) {
        setVisibility(visibility);
        return this;
    }

    /**
     * <p>
     * The visibility of an axis label on a chart. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>VISIBLE</code>: Shows the axis.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HIDDEN</code>: Hides the axis.
     * </p>
     * </li>
     * </ul>
     * 
     * @param visibility
     *        The visibility of an axis label on a chart. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>VISIBLE</code>: Shows the axis.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HIDDEN</code>: Hides the axis.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public ChartAxisLabelOptions withVisibility(Visibility visibility) {
        this.visibility = visibility.toString();
        return this;
    }

    /**
     * <p>
     * The visibility configuration of the sort icon on a chart's axis label.
     * </p>
     * 
     * @param sortIconVisibility
     *        The visibility configuration of the sort icon on a chart's axis label.
     * @see Visibility
     */

    public void setSortIconVisibility(String sortIconVisibility) {
        this.sortIconVisibility = sortIconVisibility;
    }

    /**
     * <p>
     * The visibility configuration of the sort icon on a chart's axis label.
     * </p>
     * 
     * @return The visibility configuration of the sort icon on a chart's axis label.
     * @see Visibility
     */

    public String getSortIconVisibility() {
        return this.sortIconVisibility;
    }

    /**
     * <p>
     * The visibility configuration of the sort icon on a chart's axis label.
     * </p>
     * 
     * @param sortIconVisibility
     *        The visibility configuration of the sort icon on a chart's axis label.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public ChartAxisLabelOptions withSortIconVisibility(String sortIconVisibility) {
        setSortIconVisibility(sortIconVisibility);
        return this;
    }

    /**
     * <p>
     * The visibility configuration of the sort icon on a chart's axis label.
     * </p>
     * 
     * @param sortIconVisibility
     *        The visibility configuration of the sort icon on a chart's axis label.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public ChartAxisLabelOptions withSortIconVisibility(Visibility sortIconVisibility) {
        this.sortIconVisibility = sortIconVisibility.toString();
        return this;
    }

    /**
     * <p>
     * The label options for a chart axis.
     * </p>
     * 
     * @return The label options for a chart axis.
     */

    public java.util.List<AxisLabelOptions> getAxisLabelOptions() {
        return axisLabelOptions;
    }

    /**
     * <p>
     * The label options for a chart axis.
     * </p>
     * 
     * @param axisLabelOptions
     *        The label options for a chart axis.
     */

    public void setAxisLabelOptions(java.util.Collection<AxisLabelOptions> axisLabelOptions) {
        if (axisLabelOptions == null) {
            this.axisLabelOptions = null;
            return;
        }

        this.axisLabelOptions = new java.util.ArrayList<AxisLabelOptions>(axisLabelOptions);
    }

    /**
     * <p>
     * The label options for a chart axis.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAxisLabelOptions(java.util.Collection)} or {@link #withAxisLabelOptions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param axisLabelOptions
     *        The label options for a chart axis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChartAxisLabelOptions withAxisLabelOptions(AxisLabelOptions... axisLabelOptions) {
        if (this.axisLabelOptions == null) {
            setAxisLabelOptions(new java.util.ArrayList<AxisLabelOptions>(axisLabelOptions.length));
        }
        for (AxisLabelOptions ele : axisLabelOptions) {
            this.axisLabelOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The label options for a chart axis.
     * </p>
     * 
     * @param axisLabelOptions
     *        The label options for a chart axis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChartAxisLabelOptions withAxisLabelOptions(java.util.Collection<AxisLabelOptions> axisLabelOptions) {
        setAxisLabelOptions(axisLabelOptions);
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
        if (getSortIconVisibility() != null)
            sb.append("SortIconVisibility: ").append(getSortIconVisibility()).append(",");
        if (getAxisLabelOptions() != null)
            sb.append("AxisLabelOptions: ").append(getAxisLabelOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChartAxisLabelOptions == false)
            return false;
        ChartAxisLabelOptions other = (ChartAxisLabelOptions) obj;
        if (other.getVisibility() == null ^ this.getVisibility() == null)
            return false;
        if (other.getVisibility() != null && other.getVisibility().equals(this.getVisibility()) == false)
            return false;
        if (other.getSortIconVisibility() == null ^ this.getSortIconVisibility() == null)
            return false;
        if (other.getSortIconVisibility() != null && other.getSortIconVisibility().equals(this.getSortIconVisibility()) == false)
            return false;
        if (other.getAxisLabelOptions() == null ^ this.getAxisLabelOptions() == null)
            return false;
        if (other.getAxisLabelOptions() != null && other.getAxisLabelOptions().equals(this.getAxisLabelOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVisibility() == null) ? 0 : getVisibility().hashCode());
        hashCode = prime * hashCode + ((getSortIconVisibility() == null) ? 0 : getSortIconVisibility().hashCode());
        hashCode = prime * hashCode + ((getAxisLabelOptions() == null) ? 0 : getAxisLabelOptions().hashCode());
        return hashCode;
    }

    @Override
    public ChartAxisLabelOptions clone() {
        try {
            return (ChartAxisLabelOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ChartAxisLabelOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
