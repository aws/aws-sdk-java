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
 * The subtotal options.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/SubtotalOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubtotalOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The visibility configuration for the subtotal cells.
     * </p>
     */
    private String totalsVisibility;
    /**
     * <p>
     * The custom label string for the subtotal cells.
     * </p>
     */
    private String customLabel;
    /**
     * <p>
     * The field level (all, custom, last) for the subtotal cells.
     * </p>
     */
    private String fieldLevel;
    /**
     * <p>
     * The optional configuration of subtotal cells.
     * </p>
     */
    private java.util.List<PivotTableFieldSubtotalOptions> fieldLevelOptions;
    /**
     * <p>
     * The cell styling options for the subtotal cells.
     * </p>
     */
    private TableCellStyle totalCellStyle;
    /**
     * <p>
     * The cell styling options for the subtotals of value cells.
     * </p>
     */
    private TableCellStyle valueCellStyle;
    /**
     * <p>
     * The cell styling options for the subtotals of header cells.
     * </p>
     */
    private TableCellStyle metricHeaderCellStyle;

    /**
     * <p>
     * The visibility configuration for the subtotal cells.
     * </p>
     * 
     * @param totalsVisibility
     *        The visibility configuration for the subtotal cells.
     * @see Visibility
     */

    public void setTotalsVisibility(String totalsVisibility) {
        this.totalsVisibility = totalsVisibility;
    }

    /**
     * <p>
     * The visibility configuration for the subtotal cells.
     * </p>
     * 
     * @return The visibility configuration for the subtotal cells.
     * @see Visibility
     */

    public String getTotalsVisibility() {
        return this.totalsVisibility;
    }

    /**
     * <p>
     * The visibility configuration for the subtotal cells.
     * </p>
     * 
     * @param totalsVisibility
     *        The visibility configuration for the subtotal cells.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public SubtotalOptions withTotalsVisibility(String totalsVisibility) {
        setTotalsVisibility(totalsVisibility);
        return this;
    }

    /**
     * <p>
     * The visibility configuration for the subtotal cells.
     * </p>
     * 
     * @param totalsVisibility
     *        The visibility configuration for the subtotal cells.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public SubtotalOptions withTotalsVisibility(Visibility totalsVisibility) {
        this.totalsVisibility = totalsVisibility.toString();
        return this;
    }

    /**
     * <p>
     * The custom label string for the subtotal cells.
     * </p>
     * 
     * @param customLabel
     *        The custom label string for the subtotal cells.
     */

    public void setCustomLabel(String customLabel) {
        this.customLabel = customLabel;
    }

    /**
     * <p>
     * The custom label string for the subtotal cells.
     * </p>
     * 
     * @return The custom label string for the subtotal cells.
     */

    public String getCustomLabel() {
        return this.customLabel;
    }

    /**
     * <p>
     * The custom label string for the subtotal cells.
     * </p>
     * 
     * @param customLabel
     *        The custom label string for the subtotal cells.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubtotalOptions withCustomLabel(String customLabel) {
        setCustomLabel(customLabel);
        return this;
    }

    /**
     * <p>
     * The field level (all, custom, last) for the subtotal cells.
     * </p>
     * 
     * @param fieldLevel
     *        The field level (all, custom, last) for the subtotal cells.
     * @see PivotTableSubtotalLevel
     */

    public void setFieldLevel(String fieldLevel) {
        this.fieldLevel = fieldLevel;
    }

    /**
     * <p>
     * The field level (all, custom, last) for the subtotal cells.
     * </p>
     * 
     * @return The field level (all, custom, last) for the subtotal cells.
     * @see PivotTableSubtotalLevel
     */

    public String getFieldLevel() {
        return this.fieldLevel;
    }

    /**
     * <p>
     * The field level (all, custom, last) for the subtotal cells.
     * </p>
     * 
     * @param fieldLevel
     *        The field level (all, custom, last) for the subtotal cells.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PivotTableSubtotalLevel
     */

    public SubtotalOptions withFieldLevel(String fieldLevel) {
        setFieldLevel(fieldLevel);
        return this;
    }

    /**
     * <p>
     * The field level (all, custom, last) for the subtotal cells.
     * </p>
     * 
     * @param fieldLevel
     *        The field level (all, custom, last) for the subtotal cells.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PivotTableSubtotalLevel
     */

    public SubtotalOptions withFieldLevel(PivotTableSubtotalLevel fieldLevel) {
        this.fieldLevel = fieldLevel.toString();
        return this;
    }

    /**
     * <p>
     * The optional configuration of subtotal cells.
     * </p>
     * 
     * @return The optional configuration of subtotal cells.
     */

    public java.util.List<PivotTableFieldSubtotalOptions> getFieldLevelOptions() {
        return fieldLevelOptions;
    }

    /**
     * <p>
     * The optional configuration of subtotal cells.
     * </p>
     * 
     * @param fieldLevelOptions
     *        The optional configuration of subtotal cells.
     */

    public void setFieldLevelOptions(java.util.Collection<PivotTableFieldSubtotalOptions> fieldLevelOptions) {
        if (fieldLevelOptions == null) {
            this.fieldLevelOptions = null;
            return;
        }

        this.fieldLevelOptions = new java.util.ArrayList<PivotTableFieldSubtotalOptions>(fieldLevelOptions);
    }

    /**
     * <p>
     * The optional configuration of subtotal cells.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFieldLevelOptions(java.util.Collection)} or {@link #withFieldLevelOptions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param fieldLevelOptions
     *        The optional configuration of subtotal cells.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubtotalOptions withFieldLevelOptions(PivotTableFieldSubtotalOptions... fieldLevelOptions) {
        if (this.fieldLevelOptions == null) {
            setFieldLevelOptions(new java.util.ArrayList<PivotTableFieldSubtotalOptions>(fieldLevelOptions.length));
        }
        for (PivotTableFieldSubtotalOptions ele : fieldLevelOptions) {
            this.fieldLevelOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The optional configuration of subtotal cells.
     * </p>
     * 
     * @param fieldLevelOptions
     *        The optional configuration of subtotal cells.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubtotalOptions withFieldLevelOptions(java.util.Collection<PivotTableFieldSubtotalOptions> fieldLevelOptions) {
        setFieldLevelOptions(fieldLevelOptions);
        return this;
    }

    /**
     * <p>
     * The cell styling options for the subtotal cells.
     * </p>
     * 
     * @param totalCellStyle
     *        The cell styling options for the subtotal cells.
     */

    public void setTotalCellStyle(TableCellStyle totalCellStyle) {
        this.totalCellStyle = totalCellStyle;
    }

    /**
     * <p>
     * The cell styling options for the subtotal cells.
     * </p>
     * 
     * @return The cell styling options for the subtotal cells.
     */

    public TableCellStyle getTotalCellStyle() {
        return this.totalCellStyle;
    }

    /**
     * <p>
     * The cell styling options for the subtotal cells.
     * </p>
     * 
     * @param totalCellStyle
     *        The cell styling options for the subtotal cells.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubtotalOptions withTotalCellStyle(TableCellStyle totalCellStyle) {
        setTotalCellStyle(totalCellStyle);
        return this;
    }

    /**
     * <p>
     * The cell styling options for the subtotals of value cells.
     * </p>
     * 
     * @param valueCellStyle
     *        The cell styling options for the subtotals of value cells.
     */

    public void setValueCellStyle(TableCellStyle valueCellStyle) {
        this.valueCellStyle = valueCellStyle;
    }

    /**
     * <p>
     * The cell styling options for the subtotals of value cells.
     * </p>
     * 
     * @return The cell styling options for the subtotals of value cells.
     */

    public TableCellStyle getValueCellStyle() {
        return this.valueCellStyle;
    }

    /**
     * <p>
     * The cell styling options for the subtotals of value cells.
     * </p>
     * 
     * @param valueCellStyle
     *        The cell styling options for the subtotals of value cells.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubtotalOptions withValueCellStyle(TableCellStyle valueCellStyle) {
        setValueCellStyle(valueCellStyle);
        return this;
    }

    /**
     * <p>
     * The cell styling options for the subtotals of header cells.
     * </p>
     * 
     * @param metricHeaderCellStyle
     *        The cell styling options for the subtotals of header cells.
     */

    public void setMetricHeaderCellStyle(TableCellStyle metricHeaderCellStyle) {
        this.metricHeaderCellStyle = metricHeaderCellStyle;
    }

    /**
     * <p>
     * The cell styling options for the subtotals of header cells.
     * </p>
     * 
     * @return The cell styling options for the subtotals of header cells.
     */

    public TableCellStyle getMetricHeaderCellStyle() {
        return this.metricHeaderCellStyle;
    }

    /**
     * <p>
     * The cell styling options for the subtotals of header cells.
     * </p>
     * 
     * @param metricHeaderCellStyle
     *        The cell styling options for the subtotals of header cells.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubtotalOptions withMetricHeaderCellStyle(TableCellStyle metricHeaderCellStyle) {
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
        if (getCustomLabel() != null)
            sb.append("CustomLabel: ").append(getCustomLabel()).append(",");
        if (getFieldLevel() != null)
            sb.append("FieldLevel: ").append(getFieldLevel()).append(",");
        if (getFieldLevelOptions() != null)
            sb.append("FieldLevelOptions: ").append(getFieldLevelOptions()).append(",");
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

        if (obj instanceof SubtotalOptions == false)
            return false;
        SubtotalOptions other = (SubtotalOptions) obj;
        if (other.getTotalsVisibility() == null ^ this.getTotalsVisibility() == null)
            return false;
        if (other.getTotalsVisibility() != null && other.getTotalsVisibility().equals(this.getTotalsVisibility()) == false)
            return false;
        if (other.getCustomLabel() == null ^ this.getCustomLabel() == null)
            return false;
        if (other.getCustomLabel() != null && other.getCustomLabel().equals(this.getCustomLabel()) == false)
            return false;
        if (other.getFieldLevel() == null ^ this.getFieldLevel() == null)
            return false;
        if (other.getFieldLevel() != null && other.getFieldLevel().equals(this.getFieldLevel()) == false)
            return false;
        if (other.getFieldLevelOptions() == null ^ this.getFieldLevelOptions() == null)
            return false;
        if (other.getFieldLevelOptions() != null && other.getFieldLevelOptions().equals(this.getFieldLevelOptions()) == false)
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
        hashCode = prime * hashCode + ((getCustomLabel() == null) ? 0 : getCustomLabel().hashCode());
        hashCode = prime * hashCode + ((getFieldLevel() == null) ? 0 : getFieldLevel().hashCode());
        hashCode = prime * hashCode + ((getFieldLevelOptions() == null) ? 0 : getFieldLevelOptions().hashCode());
        hashCode = prime * hashCode + ((getTotalCellStyle() == null) ? 0 : getTotalCellStyle().hashCode());
        hashCode = prime * hashCode + ((getValueCellStyle() == null) ? 0 : getValueCellStyle().hashCode());
        hashCode = prime * hashCode + ((getMetricHeaderCellStyle() == null) ? 0 : getMetricHeaderCellStyle().hashCode());
        return hashCode;
    }

    @Override
    public SubtotalOptions clone() {
        try {
            return (SubtotalOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.SubtotalOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
