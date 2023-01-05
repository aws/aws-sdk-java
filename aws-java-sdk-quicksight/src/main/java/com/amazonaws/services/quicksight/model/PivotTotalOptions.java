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
 * The optional configuration of totals cells in a <code>PivotTableVisual</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/PivotTotalOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PivotTotalOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The visibility configuration for the total cells.
     * </p>
     */
    private String totalsVisibility;
    /**
     * <p>
     * The placement (start, end) for the total cells.
     * </p>
     */
    private String placement;
    /**
     * <p>
     * The scroll status (pinned, scrolled) for the total cells.
     * </p>
     */
    private String scrollStatus;
    /**
     * <p>
     * The custom label string for the total cells.
     * </p>
     */
    private String customLabel;
    /**
     * <p>
     * The cell styling options for the total cells.
     * </p>
     */
    private TableCellStyle totalCellStyle;
    /**
     * <p>
     * The cell styling options for the totals of value cells.
     * </p>
     */
    private TableCellStyle valueCellStyle;
    /**
     * <p>
     * The cell styling options for the total of header cells.
     * </p>
     */
    private TableCellStyle metricHeaderCellStyle;

    /**
     * <p>
     * The visibility configuration for the total cells.
     * </p>
     * 
     * @param totalsVisibility
     *        The visibility configuration for the total cells.
     * @see Visibility
     */

    public void setTotalsVisibility(String totalsVisibility) {
        this.totalsVisibility = totalsVisibility;
    }

    /**
     * <p>
     * The visibility configuration for the total cells.
     * </p>
     * 
     * @return The visibility configuration for the total cells.
     * @see Visibility
     */

    public String getTotalsVisibility() {
        return this.totalsVisibility;
    }

    /**
     * <p>
     * The visibility configuration for the total cells.
     * </p>
     * 
     * @param totalsVisibility
     *        The visibility configuration for the total cells.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public PivotTotalOptions withTotalsVisibility(String totalsVisibility) {
        setTotalsVisibility(totalsVisibility);
        return this;
    }

    /**
     * <p>
     * The visibility configuration for the total cells.
     * </p>
     * 
     * @param totalsVisibility
     *        The visibility configuration for the total cells.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public PivotTotalOptions withTotalsVisibility(Visibility totalsVisibility) {
        this.totalsVisibility = totalsVisibility.toString();
        return this;
    }

    /**
     * <p>
     * The placement (start, end) for the total cells.
     * </p>
     * 
     * @param placement
     *        The placement (start, end) for the total cells.
     * @see TableTotalsPlacement
     */

    public void setPlacement(String placement) {
        this.placement = placement;
    }

    /**
     * <p>
     * The placement (start, end) for the total cells.
     * </p>
     * 
     * @return The placement (start, end) for the total cells.
     * @see TableTotalsPlacement
     */

    public String getPlacement() {
        return this.placement;
    }

    /**
     * <p>
     * The placement (start, end) for the total cells.
     * </p>
     * 
     * @param placement
     *        The placement (start, end) for the total cells.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TableTotalsPlacement
     */

    public PivotTotalOptions withPlacement(String placement) {
        setPlacement(placement);
        return this;
    }

    /**
     * <p>
     * The placement (start, end) for the total cells.
     * </p>
     * 
     * @param placement
     *        The placement (start, end) for the total cells.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TableTotalsPlacement
     */

    public PivotTotalOptions withPlacement(TableTotalsPlacement placement) {
        this.placement = placement.toString();
        return this;
    }

    /**
     * <p>
     * The scroll status (pinned, scrolled) for the total cells.
     * </p>
     * 
     * @param scrollStatus
     *        The scroll status (pinned, scrolled) for the total cells.
     * @see TableTotalsScrollStatus
     */

    public void setScrollStatus(String scrollStatus) {
        this.scrollStatus = scrollStatus;
    }

    /**
     * <p>
     * The scroll status (pinned, scrolled) for the total cells.
     * </p>
     * 
     * @return The scroll status (pinned, scrolled) for the total cells.
     * @see TableTotalsScrollStatus
     */

    public String getScrollStatus() {
        return this.scrollStatus;
    }

    /**
     * <p>
     * The scroll status (pinned, scrolled) for the total cells.
     * </p>
     * 
     * @param scrollStatus
     *        The scroll status (pinned, scrolled) for the total cells.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TableTotalsScrollStatus
     */

    public PivotTotalOptions withScrollStatus(String scrollStatus) {
        setScrollStatus(scrollStatus);
        return this;
    }

    /**
     * <p>
     * The scroll status (pinned, scrolled) for the total cells.
     * </p>
     * 
     * @param scrollStatus
     *        The scroll status (pinned, scrolled) for the total cells.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TableTotalsScrollStatus
     */

    public PivotTotalOptions withScrollStatus(TableTotalsScrollStatus scrollStatus) {
        this.scrollStatus = scrollStatus.toString();
        return this;
    }

    /**
     * <p>
     * The custom label string for the total cells.
     * </p>
     * 
     * @param customLabel
     *        The custom label string for the total cells.
     */

    public void setCustomLabel(String customLabel) {
        this.customLabel = customLabel;
    }

    /**
     * <p>
     * The custom label string for the total cells.
     * </p>
     * 
     * @return The custom label string for the total cells.
     */

    public String getCustomLabel() {
        return this.customLabel;
    }

    /**
     * <p>
     * The custom label string for the total cells.
     * </p>
     * 
     * @param customLabel
     *        The custom label string for the total cells.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTotalOptions withCustomLabel(String customLabel) {
        setCustomLabel(customLabel);
        return this;
    }

    /**
     * <p>
     * The cell styling options for the total cells.
     * </p>
     * 
     * @param totalCellStyle
     *        The cell styling options for the total cells.
     */

    public void setTotalCellStyle(TableCellStyle totalCellStyle) {
        this.totalCellStyle = totalCellStyle;
    }

    /**
     * <p>
     * The cell styling options for the total cells.
     * </p>
     * 
     * @return The cell styling options for the total cells.
     */

    public TableCellStyle getTotalCellStyle() {
        return this.totalCellStyle;
    }

    /**
     * <p>
     * The cell styling options for the total cells.
     * </p>
     * 
     * @param totalCellStyle
     *        The cell styling options for the total cells.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTotalOptions withTotalCellStyle(TableCellStyle totalCellStyle) {
        setTotalCellStyle(totalCellStyle);
        return this;
    }

    /**
     * <p>
     * The cell styling options for the totals of value cells.
     * </p>
     * 
     * @param valueCellStyle
     *        The cell styling options for the totals of value cells.
     */

    public void setValueCellStyle(TableCellStyle valueCellStyle) {
        this.valueCellStyle = valueCellStyle;
    }

    /**
     * <p>
     * The cell styling options for the totals of value cells.
     * </p>
     * 
     * @return The cell styling options for the totals of value cells.
     */

    public TableCellStyle getValueCellStyle() {
        return this.valueCellStyle;
    }

    /**
     * <p>
     * The cell styling options for the totals of value cells.
     * </p>
     * 
     * @param valueCellStyle
     *        The cell styling options for the totals of value cells.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTotalOptions withValueCellStyle(TableCellStyle valueCellStyle) {
        setValueCellStyle(valueCellStyle);
        return this;
    }

    /**
     * <p>
     * The cell styling options for the total of header cells.
     * </p>
     * 
     * @param metricHeaderCellStyle
     *        The cell styling options for the total of header cells.
     */

    public void setMetricHeaderCellStyle(TableCellStyle metricHeaderCellStyle) {
        this.metricHeaderCellStyle = metricHeaderCellStyle;
    }

    /**
     * <p>
     * The cell styling options for the total of header cells.
     * </p>
     * 
     * @return The cell styling options for the total of header cells.
     */

    public TableCellStyle getMetricHeaderCellStyle() {
        return this.metricHeaderCellStyle;
    }

    /**
     * <p>
     * The cell styling options for the total of header cells.
     * </p>
     * 
     * @param metricHeaderCellStyle
     *        The cell styling options for the total of header cells.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTotalOptions withMetricHeaderCellStyle(TableCellStyle metricHeaderCellStyle) {
        setMetricHeaderCellStyle(metricHeaderCellStyle);
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
        if (getTotalsVisibility() != null)
            sb.append("TotalsVisibility: ").append(getTotalsVisibility()).append(",");
        if (getPlacement() != null)
            sb.append("Placement: ").append(getPlacement()).append(",");
        if (getScrollStatus() != null)
            sb.append("ScrollStatus: ").append(getScrollStatus()).append(",");
        if (getCustomLabel() != null)
            sb.append("CustomLabel: ").append(getCustomLabel()).append(",");
        if (getTotalCellStyle() != null)
            sb.append("TotalCellStyle: ").append(getTotalCellStyle()).append(",");
        if (getValueCellStyle() != null)
            sb.append("ValueCellStyle: ").append(getValueCellStyle()).append(",");
        if (getMetricHeaderCellStyle() != null)
            sb.append("MetricHeaderCellStyle: ").append(getMetricHeaderCellStyle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PivotTotalOptions == false)
            return false;
        PivotTotalOptions other = (PivotTotalOptions) obj;
        if (other.getTotalsVisibility() == null ^ this.getTotalsVisibility() == null)
            return false;
        if (other.getTotalsVisibility() != null && other.getTotalsVisibility().equals(this.getTotalsVisibility()) == false)
            return false;
        if (other.getPlacement() == null ^ this.getPlacement() == null)
            return false;
        if (other.getPlacement() != null && other.getPlacement().equals(this.getPlacement()) == false)
            return false;
        if (other.getScrollStatus() == null ^ this.getScrollStatus() == null)
            return false;
        if (other.getScrollStatus() != null && other.getScrollStatus().equals(this.getScrollStatus()) == false)
            return false;
        if (other.getCustomLabel() == null ^ this.getCustomLabel() == null)
            return false;
        if (other.getCustomLabel() != null && other.getCustomLabel().equals(this.getCustomLabel()) == false)
            return false;
        if (other.getTotalCellStyle() == null ^ this.getTotalCellStyle() == null)
            return false;
        if (other.getTotalCellStyle() != null && other.getTotalCellStyle().equals(this.getTotalCellStyle()) == false)
            return false;
        if (other.getValueCellStyle() == null ^ this.getValueCellStyle() == null)
            return false;
        if (other.getValueCellStyle() != null && other.getValueCellStyle().equals(this.getValueCellStyle()) == false)
            return false;
        if (other.getMetricHeaderCellStyle() == null ^ this.getMetricHeaderCellStyle() == null)
            return false;
        if (other.getMetricHeaderCellStyle() != null && other.getMetricHeaderCellStyle().equals(this.getMetricHeaderCellStyle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTotalsVisibility() == null) ? 0 : getTotalsVisibility().hashCode());
        hashCode = prime * hashCode + ((getPlacement() == null) ? 0 : getPlacement().hashCode());
        hashCode = prime * hashCode + ((getScrollStatus() == null) ? 0 : getScrollStatus().hashCode());
        hashCode = prime * hashCode + ((getCustomLabel() == null) ? 0 : getCustomLabel().hashCode());
        hashCode = prime * hashCode + ((getTotalCellStyle() == null) ? 0 : getTotalCellStyle().hashCode());
        hashCode = prime * hashCode + ((getValueCellStyle() == null) ? 0 : getValueCellStyle().hashCode());
        hashCode = prime * hashCode + ((getMetricHeaderCellStyle() == null) ? 0 : getMetricHeaderCellStyle().hashCode());
        return hashCode;
    }

    @Override
    public PivotTotalOptions clone() {
        try {
            return (PivotTotalOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.PivotTotalOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
