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
 * The aggregated field wells of a heat map.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/HeatMapAggregatedFieldWells"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HeatMapAggregatedFieldWells implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The rows field well of a heat map.
     * </p>
     */
    private java.util.List<DimensionField> rows;
    /**
     * <p>
     * The columns field well of a heat map.
     * </p>
     */
    private java.util.List<DimensionField> columns;
    /**
     * <p>
     * The values field well of a heat map.
     * </p>
     */
    private java.util.List<MeasureField> values;

    /**
     * <p>
     * The rows field well of a heat map.
     * </p>
     * 
     * @return The rows field well of a heat map.
     */

    public java.util.List<DimensionField> getRows() {
        return rows;
    }

    /**
     * <p>
     * The rows field well of a heat map.
     * </p>
     * 
     * @param rows
     *        The rows field well of a heat map.
     */

    public void setRows(java.util.Collection<DimensionField> rows) {
        if (rows == null) {
            this.rows = null;
            return;
        }

        this.rows = new java.util.ArrayList<DimensionField>(rows);
    }

    /**
     * <p>
     * The rows field well of a heat map.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRows(java.util.Collection)} or {@link #withRows(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rows
     *        The rows field well of a heat map.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HeatMapAggregatedFieldWells withRows(DimensionField... rows) {
        if (this.rows == null) {
            setRows(new java.util.ArrayList<DimensionField>(rows.length));
        }
        for (DimensionField ele : rows) {
            this.rows.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The rows field well of a heat map.
     * </p>
     * 
     * @param rows
     *        The rows field well of a heat map.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HeatMapAggregatedFieldWells withRows(java.util.Collection<DimensionField> rows) {
        setRows(rows);
        return this;
    }

    /**
     * <p>
     * The columns field well of a heat map.
     * </p>
     * 
     * @return The columns field well of a heat map.
     */

    public java.util.List<DimensionField> getColumns() {
        return columns;
    }

    /**
     * <p>
     * The columns field well of a heat map.
     * </p>
     * 
     * @param columns
     *        The columns field well of a heat map.
     */

    public void setColumns(java.util.Collection<DimensionField> columns) {
        if (columns == null) {
            this.columns = null;
            return;
        }

        this.columns = new java.util.ArrayList<DimensionField>(columns);
    }

    /**
     * <p>
     * The columns field well of a heat map.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumns(java.util.Collection)} or {@link #withColumns(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param columns
     *        The columns field well of a heat map.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HeatMapAggregatedFieldWells withColumns(DimensionField... columns) {
        if (this.columns == null) {
            setColumns(new java.util.ArrayList<DimensionField>(columns.length));
        }
        for (DimensionField ele : columns) {
            this.columns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The columns field well of a heat map.
     * </p>
     * 
     * @param columns
     *        The columns field well of a heat map.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HeatMapAggregatedFieldWells withColumns(java.util.Collection<DimensionField> columns) {
        setColumns(columns);
        return this;
    }

    /**
     * <p>
     * The values field well of a heat map.
     * </p>
     * 
     * @return The values field well of a heat map.
     */

    public java.util.List<MeasureField> getValues() {
        return values;
    }

    /**
     * <p>
     * The values field well of a heat map.
     * </p>
     * 
     * @param values
     *        The values field well of a heat map.
     */

    public void setValues(java.util.Collection<MeasureField> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<MeasureField>(values);
    }

    /**
     * <p>
     * The values field well of a heat map.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The values field well of a heat map.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HeatMapAggregatedFieldWells withValues(MeasureField... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<MeasureField>(values.length));
        }
        for (MeasureField ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The values field well of a heat map.
     * </p>
     * 
     * @param values
     *        The values field well of a heat map.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HeatMapAggregatedFieldWells withValues(java.util.Collection<MeasureField> values) {
        setValues(values);
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
        if (getRows() != null)
            sb.append("Rows: ").append(getRows()).append(",");
        if (getColumns() != null)
            sb.append("Columns: ").append(getColumns()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HeatMapAggregatedFieldWells == false)
            return false;
        HeatMapAggregatedFieldWells other = (HeatMapAggregatedFieldWells) obj;
        if (other.getRows() == null ^ this.getRows() == null)
            return false;
        if (other.getRows() != null && other.getRows().equals(this.getRows()) == false)
            return false;
        if (other.getColumns() == null ^ this.getColumns() == null)
            return false;
        if (other.getColumns() != null && other.getColumns().equals(this.getColumns()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRows() == null) ? 0 : getRows().hashCode());
        hashCode = prime * hashCode + ((getColumns() == null) ? 0 : getColumns().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public HeatMapAggregatedFieldWells clone() {
        try {
            return (HeatMapAggregatedFieldWells) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.HeatMapAggregatedFieldWellsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
