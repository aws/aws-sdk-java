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
 * The type of the data path value.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DataPathType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataPathType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of data path value utilized in a pivot table. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HIERARCHY_ROWS_LAYOUT_COLUMN</code> - The type of data path for the rows layout column, when
     * <code>RowsLayout</code> is set to <code>HIERARCHY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MULTIPLE_ROW_METRICS_COLUMN</code> - The type of data path for the metric column when the row is set to
     * Metric Placement.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EMPTY_COLUMN_HEADER</code> - The type of data path for the column with empty column header, when there is
     * no field in <code>ColumnsFieldWell</code> and the row is set to Metric Placement.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT_METRIC_COLUMN</code> - The type of data path for the column with <code>COUNT</code> as the metric,
     * when there is no field in the <code>ValuesFieldWell</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String pivotTableDataPathType;

    /**
     * <p>
     * The type of data path value utilized in a pivot table. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HIERARCHY_ROWS_LAYOUT_COLUMN</code> - The type of data path for the rows layout column, when
     * <code>RowsLayout</code> is set to <code>HIERARCHY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MULTIPLE_ROW_METRICS_COLUMN</code> - The type of data path for the metric column when the row is set to
     * Metric Placement.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EMPTY_COLUMN_HEADER</code> - The type of data path for the column with empty column header, when there is
     * no field in <code>ColumnsFieldWell</code> and the row is set to Metric Placement.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT_METRIC_COLUMN</code> - The type of data path for the column with <code>COUNT</code> as the metric,
     * when there is no field in the <code>ValuesFieldWell</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param pivotTableDataPathType
     *        The type of data path value utilized in a pivot table. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HIERARCHY_ROWS_LAYOUT_COLUMN</code> - The type of data path for the rows layout column, when
     *        <code>RowsLayout</code> is set to <code>HIERARCHY</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MULTIPLE_ROW_METRICS_COLUMN</code> - The type of data path for the metric column when the row is set
     *        to Metric Placement.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EMPTY_COLUMN_HEADER</code> - The type of data path for the column with empty column header, when
     *        there is no field in <code>ColumnsFieldWell</code> and the row is set to Metric Placement.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COUNT_METRIC_COLUMN</code> - The type of data path for the column with <code>COUNT</code> as the
     *        metric, when there is no field in the <code>ValuesFieldWell</code>.
     *        </p>
     *        </li>
     * @see PivotTableDataPathType
     */

    public void setPivotTableDataPathType(String pivotTableDataPathType) {
        this.pivotTableDataPathType = pivotTableDataPathType;
    }

    /**
     * <p>
     * The type of data path value utilized in a pivot table. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HIERARCHY_ROWS_LAYOUT_COLUMN</code> - The type of data path for the rows layout column, when
     * <code>RowsLayout</code> is set to <code>HIERARCHY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MULTIPLE_ROW_METRICS_COLUMN</code> - The type of data path for the metric column when the row is set to
     * Metric Placement.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EMPTY_COLUMN_HEADER</code> - The type of data path for the column with empty column header, when there is
     * no field in <code>ColumnsFieldWell</code> and the row is set to Metric Placement.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT_METRIC_COLUMN</code> - The type of data path for the column with <code>COUNT</code> as the metric,
     * when there is no field in the <code>ValuesFieldWell</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of data path value utilized in a pivot table. Choose one of the following options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>HIERARCHY_ROWS_LAYOUT_COLUMN</code> - The type of data path for the rows layout column, when
     *         <code>RowsLayout</code> is set to <code>HIERARCHY</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MULTIPLE_ROW_METRICS_COLUMN</code> - The type of data path for the metric column when the row is
     *         set to Metric Placement.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EMPTY_COLUMN_HEADER</code> - The type of data path for the column with empty column header, when
     *         there is no field in <code>ColumnsFieldWell</code> and the row is set to Metric Placement.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COUNT_METRIC_COLUMN</code> - The type of data path for the column with <code>COUNT</code> as the
     *         metric, when there is no field in the <code>ValuesFieldWell</code>.
     *         </p>
     *         </li>
     * @see PivotTableDataPathType
     */

    public String getPivotTableDataPathType() {
        return this.pivotTableDataPathType;
    }

    /**
     * <p>
     * The type of data path value utilized in a pivot table. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HIERARCHY_ROWS_LAYOUT_COLUMN</code> - The type of data path for the rows layout column, when
     * <code>RowsLayout</code> is set to <code>HIERARCHY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MULTIPLE_ROW_METRICS_COLUMN</code> - The type of data path for the metric column when the row is set to
     * Metric Placement.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EMPTY_COLUMN_HEADER</code> - The type of data path for the column with empty column header, when there is
     * no field in <code>ColumnsFieldWell</code> and the row is set to Metric Placement.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT_METRIC_COLUMN</code> - The type of data path for the column with <code>COUNT</code> as the metric,
     * when there is no field in the <code>ValuesFieldWell</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param pivotTableDataPathType
     *        The type of data path value utilized in a pivot table. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HIERARCHY_ROWS_LAYOUT_COLUMN</code> - The type of data path for the rows layout column, when
     *        <code>RowsLayout</code> is set to <code>HIERARCHY</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MULTIPLE_ROW_METRICS_COLUMN</code> - The type of data path for the metric column when the row is set
     *        to Metric Placement.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EMPTY_COLUMN_HEADER</code> - The type of data path for the column with empty column header, when
     *        there is no field in <code>ColumnsFieldWell</code> and the row is set to Metric Placement.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COUNT_METRIC_COLUMN</code> - The type of data path for the column with <code>COUNT</code> as the
     *        metric, when there is no field in the <code>ValuesFieldWell</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PivotTableDataPathType
     */

    public DataPathType withPivotTableDataPathType(String pivotTableDataPathType) {
        setPivotTableDataPathType(pivotTableDataPathType);
        return this;
    }

    /**
     * <p>
     * The type of data path value utilized in a pivot table. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>HIERARCHY_ROWS_LAYOUT_COLUMN</code> - The type of data path for the rows layout column, when
     * <code>RowsLayout</code> is set to <code>HIERARCHY</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MULTIPLE_ROW_METRICS_COLUMN</code> - The type of data path for the metric column when the row is set to
     * Metric Placement.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EMPTY_COLUMN_HEADER</code> - The type of data path for the column with empty column header, when there is
     * no field in <code>ColumnsFieldWell</code> and the row is set to Metric Placement.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COUNT_METRIC_COLUMN</code> - The type of data path for the column with <code>COUNT</code> as the metric,
     * when there is no field in the <code>ValuesFieldWell</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param pivotTableDataPathType
     *        The type of data path value utilized in a pivot table. Choose one of the following options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>HIERARCHY_ROWS_LAYOUT_COLUMN</code> - The type of data path for the rows layout column, when
     *        <code>RowsLayout</code> is set to <code>HIERARCHY</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MULTIPLE_ROW_METRICS_COLUMN</code> - The type of data path for the metric column when the row is set
     *        to Metric Placement.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EMPTY_COLUMN_HEADER</code> - The type of data path for the column with empty column header, when
     *        there is no field in <code>ColumnsFieldWell</code> and the row is set to Metric Placement.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COUNT_METRIC_COLUMN</code> - The type of data path for the column with <code>COUNT</code> as the
     *        metric, when there is no field in the <code>ValuesFieldWell</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PivotTableDataPathType
     */

    public DataPathType withPivotTableDataPathType(PivotTableDataPathType pivotTableDataPathType) {
        this.pivotTableDataPathType = pivotTableDataPathType.toString();
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
        if (getPivotTableDataPathType() != null)
            sb.append("PivotTableDataPathType: ").append(getPivotTableDataPathType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataPathType == false)
            return false;
        DataPathType other = (DataPathType) obj;
        if (other.getPivotTableDataPathType() == null ^ this.getPivotTableDataPathType() == null)
            return false;
        if (other.getPivotTableDataPathType() != null && other.getPivotTableDataPathType().equals(this.getPivotTableDataPathType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPivotTableDataPathType() == null) ? 0 : getPivotTableDataPathType().hashCode());
        return hashCode;
    }

    @Override
    public DataPathType clone() {
        try {
            return (DataPathType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DataPathTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
