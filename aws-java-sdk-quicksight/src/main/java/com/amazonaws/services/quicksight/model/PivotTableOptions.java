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
 * The table options for a pivot table visual.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/PivotTableOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PivotTableOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The metric placement (row, column) options.
     * </p>
     */
    private String metricPlacement;
    /**
     * <p>
     * The visibility of the single metric options.
     * </p>
     */
    private String singleMetricVisibility;
    /**
     * <p>
     * The visibility of the column names.
     * </p>
     */
    private String columnNamesVisibility;
    /**
     * <p>
     * Determines the visibility of the pivot table.
     * </p>
     */
    private String toggleButtonsVisibility;
    /**
     * <p>
     * The table cell style of the column header.
     * </p>
     */
    private TableCellStyle columnHeaderStyle;
    /**
     * <p>
     * The table cell style of the row headers.
     * </p>
     */
    private TableCellStyle rowHeaderStyle;
    /**
     * <p>
     * The table cell style of cells.
     * </p>
     */
    private TableCellStyle cellStyle;
    /**
     * <p>
     * The table cell style of row field names.
     * </p>
     */
    private TableCellStyle rowFieldNamesStyle;
    /**
     * <p>
     * The row alternate color options (widget status, row alternate colors).
     * </p>
     */
    private RowAlternateColorOptions rowAlternateColorOptions;

    /**
     * <p>
     * The metric placement (row, column) options.
     * </p>
     * 
     * @param metricPlacement
     *        The metric placement (row, column) options.
     * @see PivotTableMetricPlacement
     */

    public void setMetricPlacement(String metricPlacement) {
        this.metricPlacement = metricPlacement;
    }

    /**
     * <p>
     * The metric placement (row, column) options.
     * </p>
     * 
     * @return The metric placement (row, column) options.
     * @see PivotTableMetricPlacement
     */

    public String getMetricPlacement() {
        return this.metricPlacement;
    }

    /**
     * <p>
     * The metric placement (row, column) options.
     * </p>
     * 
     * @param metricPlacement
     *        The metric placement (row, column) options.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PivotTableMetricPlacement
     */

    public PivotTableOptions withMetricPlacement(String metricPlacement) {
        setMetricPlacement(metricPlacement);
        return this;
    }

    /**
     * <p>
     * The metric placement (row, column) options.
     * </p>
     * 
     * @param metricPlacement
     *        The metric placement (row, column) options.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PivotTableMetricPlacement
     */

    public PivotTableOptions withMetricPlacement(PivotTableMetricPlacement metricPlacement) {
        this.metricPlacement = metricPlacement.toString();
        return this;
    }

    /**
     * <p>
     * The visibility of the single metric options.
     * </p>
     * 
     * @param singleMetricVisibility
     *        The visibility of the single metric options.
     * @see Visibility
     */

    public void setSingleMetricVisibility(String singleMetricVisibility) {
        this.singleMetricVisibility = singleMetricVisibility;
    }

    /**
     * <p>
     * The visibility of the single metric options.
     * </p>
     * 
     * @return The visibility of the single metric options.
     * @see Visibility
     */

    public String getSingleMetricVisibility() {
        return this.singleMetricVisibility;
    }

    /**
     * <p>
     * The visibility of the single metric options.
     * </p>
     * 
     * @param singleMetricVisibility
     *        The visibility of the single metric options.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public PivotTableOptions withSingleMetricVisibility(String singleMetricVisibility) {
        setSingleMetricVisibility(singleMetricVisibility);
        return this;
    }

    /**
     * <p>
     * The visibility of the single metric options.
     * </p>
     * 
     * @param singleMetricVisibility
     *        The visibility of the single metric options.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public PivotTableOptions withSingleMetricVisibility(Visibility singleMetricVisibility) {
        this.singleMetricVisibility = singleMetricVisibility.toString();
        return this;
    }

    /**
     * <p>
     * The visibility of the column names.
     * </p>
     * 
     * @param columnNamesVisibility
     *        The visibility of the column names.
     * @see Visibility
     */

    public void setColumnNamesVisibility(String columnNamesVisibility) {
        this.columnNamesVisibility = columnNamesVisibility;
    }

    /**
     * <p>
     * The visibility of the column names.
     * </p>
     * 
     * @return The visibility of the column names.
     * @see Visibility
     */

    public String getColumnNamesVisibility() {
        return this.columnNamesVisibility;
    }

    /**
     * <p>
     * The visibility of the column names.
     * </p>
     * 
     * @param columnNamesVisibility
     *        The visibility of the column names.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public PivotTableOptions withColumnNamesVisibility(String columnNamesVisibility) {
        setColumnNamesVisibility(columnNamesVisibility);
        return this;
    }

    /**
     * <p>
     * The visibility of the column names.
     * </p>
     * 
     * @param columnNamesVisibility
     *        The visibility of the column names.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public PivotTableOptions withColumnNamesVisibility(Visibility columnNamesVisibility) {
        this.columnNamesVisibility = columnNamesVisibility.toString();
        return this;
    }

    /**
     * <p>
     * Determines the visibility of the pivot table.
     * </p>
     * 
     * @param toggleButtonsVisibility
     *        Determines the visibility of the pivot table.
     * @see Visibility
     */

    public void setToggleButtonsVisibility(String toggleButtonsVisibility) {
        this.toggleButtonsVisibility = toggleButtonsVisibility;
    }

    /**
     * <p>
     * Determines the visibility of the pivot table.
     * </p>
     * 
     * @return Determines the visibility of the pivot table.
     * @see Visibility
     */

    public String getToggleButtonsVisibility() {
        return this.toggleButtonsVisibility;
    }

    /**
     * <p>
     * Determines the visibility of the pivot table.
     * </p>
     * 
     * @param toggleButtonsVisibility
     *        Determines the visibility of the pivot table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public PivotTableOptions withToggleButtonsVisibility(String toggleButtonsVisibility) {
        setToggleButtonsVisibility(toggleButtonsVisibility);
        return this;
    }

    /**
     * <p>
     * Determines the visibility of the pivot table.
     * </p>
     * 
     * @param toggleButtonsVisibility
     *        Determines the visibility of the pivot table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Visibility
     */

    public PivotTableOptions withToggleButtonsVisibility(Visibility toggleButtonsVisibility) {
        this.toggleButtonsVisibility = toggleButtonsVisibility.toString();
        return this;
    }

    /**
     * <p>
     * The table cell style of the column header.
     * </p>
     * 
     * @param columnHeaderStyle
     *        The table cell style of the column header.
     */

    public void setColumnHeaderStyle(TableCellStyle columnHeaderStyle) {
        this.columnHeaderStyle = columnHeaderStyle;
    }

    /**
     * <p>
     * The table cell style of the column header.
     * </p>
     * 
     * @return The table cell style of the column header.
     */

    public TableCellStyle getColumnHeaderStyle() {
        return this.columnHeaderStyle;
    }

    /**
     * <p>
     * The table cell style of the column header.
     * </p>
     * 
     * @param columnHeaderStyle
     *        The table cell style of the column header.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTableOptions withColumnHeaderStyle(TableCellStyle columnHeaderStyle) {
        setColumnHeaderStyle(columnHeaderStyle);
        return this;
    }

    /**
     * <p>
     * The table cell style of the row headers.
     * </p>
     * 
     * @param rowHeaderStyle
     *        The table cell style of the row headers.
     */

    public void setRowHeaderStyle(TableCellStyle rowHeaderStyle) {
        this.rowHeaderStyle = rowHeaderStyle;
    }

    /**
     * <p>
     * The table cell style of the row headers.
     * </p>
     * 
     * @return The table cell style of the row headers.
     */

    public TableCellStyle getRowHeaderStyle() {
        return this.rowHeaderStyle;
    }

    /**
     * <p>
     * The table cell style of the row headers.
     * </p>
     * 
     * @param rowHeaderStyle
     *        The table cell style of the row headers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTableOptions withRowHeaderStyle(TableCellStyle rowHeaderStyle) {
        setRowHeaderStyle(rowHeaderStyle);
        return this;
    }

    /**
     * <p>
     * The table cell style of cells.
     * </p>
     * 
     * @param cellStyle
     *        The table cell style of cells.
     */

    public void setCellStyle(TableCellStyle cellStyle) {
        this.cellStyle = cellStyle;
    }

    /**
     * <p>
     * The table cell style of cells.
     * </p>
     * 
     * @return The table cell style of cells.
     */

    public TableCellStyle getCellStyle() {
        return this.cellStyle;
    }

    /**
     * <p>
     * The table cell style of cells.
     * </p>
     * 
     * @param cellStyle
     *        The table cell style of cells.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTableOptions withCellStyle(TableCellStyle cellStyle) {
        setCellStyle(cellStyle);
        return this;
    }

    /**
     * <p>
     * The table cell style of row field names.
     * </p>
     * 
     * @param rowFieldNamesStyle
     *        The table cell style of row field names.
     */

    public void setRowFieldNamesStyle(TableCellStyle rowFieldNamesStyle) {
        this.rowFieldNamesStyle = rowFieldNamesStyle;
    }

    /**
     * <p>
     * The table cell style of row field names.
     * </p>
     * 
     * @return The table cell style of row field names.
     */

    public TableCellStyle getRowFieldNamesStyle() {
        return this.rowFieldNamesStyle;
    }

    /**
     * <p>
     * The table cell style of row field names.
     * </p>
     * 
     * @param rowFieldNamesStyle
     *        The table cell style of row field names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTableOptions withRowFieldNamesStyle(TableCellStyle rowFieldNamesStyle) {
        setRowFieldNamesStyle(rowFieldNamesStyle);
        return this;
    }

    /**
     * <p>
     * The row alternate color options (widget status, row alternate colors).
     * </p>
     * 
     * @param rowAlternateColorOptions
     *        The row alternate color options (widget status, row alternate colors).
     */

    public void setRowAlternateColorOptions(RowAlternateColorOptions rowAlternateColorOptions) {
        this.rowAlternateColorOptions = rowAlternateColorOptions;
    }

    /**
     * <p>
     * The row alternate color options (widget status, row alternate colors).
     * </p>
     * 
     * @return The row alternate color options (widget status, row alternate colors).
     */

    public RowAlternateColorOptions getRowAlternateColorOptions() {
        return this.rowAlternateColorOptions;
    }

    /**
     * <p>
     * The row alternate color options (widget status, row alternate colors).
     * </p>
     * 
     * @param rowAlternateColorOptions
     *        The row alternate color options (widget status, row alternate colors).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTableOptions withRowAlternateColorOptions(RowAlternateColorOptions rowAlternateColorOptions) {
        setRowAlternateColorOptions(rowAlternateColorOptions);
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
        if (getMetricPlacement() != null)
            sb.append("MetricPlacement: ").append(getMetricPlacement()).append(",");
        if (getSingleMetricVisibility() != null)
            sb.append("SingleMetricVisibility: ").append(getSingleMetricVisibility()).append(",");
        if (getColumnNamesVisibility() != null)
            sb.append("ColumnNamesVisibility: ").append(getColumnNamesVisibility()).append(",");
        if (getToggleButtonsVisibility() != null)
            sb.append("ToggleButtonsVisibility: ").append(getToggleButtonsVisibility()).append(",");
        if (getColumnHeaderStyle() != null)
            sb.append("ColumnHeaderStyle: ").append(getColumnHeaderStyle()).append(",");
        if (getRowHeaderStyle() != null)
            sb.append("RowHeaderStyle: ").append(getRowHeaderStyle()).append(",");
        if (getCellStyle() != null)
            sb.append("CellStyle: ").append(getCellStyle()).append(",");
        if (getRowFieldNamesStyle() != null)
            sb.append("RowFieldNamesStyle: ").append(getRowFieldNamesStyle()).append(",");
        if (getRowAlternateColorOptions() != null)
            sb.append("RowAlternateColorOptions: ").append(getRowAlternateColorOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PivotTableOptions == false)
            return false;
        PivotTableOptions other = (PivotTableOptions) obj;
        if (other.getMetricPlacement() == null ^ this.getMetricPlacement() == null)
            return false;
        if (other.getMetricPlacement() != null && other.getMetricPlacement().equals(this.getMetricPlacement()) == false)
            return false;
        if (other.getSingleMetricVisibility() == null ^ this.getSingleMetricVisibility() == null)
            return false;
        if (other.getSingleMetricVisibility() != null && other.getSingleMetricVisibility().equals(this.getSingleMetricVisibility()) == false)
            return false;
        if (other.getColumnNamesVisibility() == null ^ this.getColumnNamesVisibility() == null)
            return false;
        if (other.getColumnNamesVisibility() != null && other.getColumnNamesVisibility().equals(this.getColumnNamesVisibility()) == false)
            return false;
        if (other.getToggleButtonsVisibility() == null ^ this.getToggleButtonsVisibility() == null)
            return false;
        if (other.getToggleButtonsVisibility() != null && other.getToggleButtonsVisibility().equals(this.getToggleButtonsVisibility()) == false)
            return false;
        if (other.getColumnHeaderStyle() == null ^ this.getColumnHeaderStyle() == null)
            return false;
        if (other.getColumnHeaderStyle() != null && other.getColumnHeaderStyle().equals(this.getColumnHeaderStyle()) == false)
            return false;
        if (other.getRowHeaderStyle() == null ^ this.getRowHeaderStyle() == null)
            return false;
        if (other.getRowHeaderStyle() != null && other.getRowHeaderStyle().equals(this.getRowHeaderStyle()) == false)
            return false;
        if (other.getCellStyle() == null ^ this.getCellStyle() == null)
            return false;
        if (other.getCellStyle() != null && other.getCellStyle().equals(this.getCellStyle()) == false)
            return false;
        if (other.getRowFieldNamesStyle() == null ^ this.getRowFieldNamesStyle() == null)
            return false;
        if (other.getRowFieldNamesStyle() != null && other.getRowFieldNamesStyle().equals(this.getRowFieldNamesStyle()) == false)
            return false;
        if (other.getRowAlternateColorOptions() == null ^ this.getRowAlternateColorOptions() == null)
            return false;
        if (other.getRowAlternateColorOptions() != null && other.getRowAlternateColorOptions().equals(this.getRowAlternateColorOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricPlacement() == null) ? 0 : getMetricPlacement().hashCode());
        hashCode = prime * hashCode + ((getSingleMetricVisibility() == null) ? 0 : getSingleMetricVisibility().hashCode());
        hashCode = prime * hashCode + ((getColumnNamesVisibility() == null) ? 0 : getColumnNamesVisibility().hashCode());
        hashCode = prime * hashCode + ((getToggleButtonsVisibility() == null) ? 0 : getToggleButtonsVisibility().hashCode());
        hashCode = prime * hashCode + ((getColumnHeaderStyle() == null) ? 0 : getColumnHeaderStyle().hashCode());
        hashCode = prime * hashCode + ((getRowHeaderStyle() == null) ? 0 : getRowHeaderStyle().hashCode());
        hashCode = prime * hashCode + ((getCellStyle() == null) ? 0 : getCellStyle().hashCode());
        hashCode = prime * hashCode + ((getRowFieldNamesStyle() == null) ? 0 : getRowFieldNamesStyle().hashCode());
        hashCode = prime * hashCode + ((getRowAlternateColorOptions() == null) ? 0 : getRowAlternateColorOptions().hashCode());
        return hashCode;
    }

    @Override
    public PivotTableOptions clone() {
        try {
            return (PivotTableOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.PivotTableOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
