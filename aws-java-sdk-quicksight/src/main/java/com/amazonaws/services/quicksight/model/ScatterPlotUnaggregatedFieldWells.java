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
 * The unaggregated field wells of a scatter plot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ScatterPlotUnaggregatedFieldWells"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScatterPlotUnaggregatedFieldWells implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The x-axis field well of a scatter plot.
     * </p>
     * <p>
     * The x-axis is a dimension field and cannot be aggregated.
     * </p>
     */
    private java.util.List<DimensionField> xAxis;
    /**
     * <p>
     * The y-axis field well of a scatter plot.
     * </p>
     * <p>
     * The y-axis is a dimension field and cannot be aggregated.
     * </p>
     */
    private java.util.List<DimensionField> yAxis;
    /**
     * <p>
     * The size field well of a scatter plot.
     * </p>
     */
    private java.util.List<MeasureField> size;
    /**
     * <p>
     * The category field well of a scatter plot.
     * </p>
     */
    private java.util.List<DimensionField> category;
    /**
     * <p>
     * The label field well of a scatter plot.
     * </p>
     */
    private java.util.List<DimensionField> label;

    /**
     * <p>
     * The x-axis field well of a scatter plot.
     * </p>
     * <p>
     * The x-axis is a dimension field and cannot be aggregated.
     * </p>
     * 
     * @return The x-axis field well of a scatter plot.</p>
     *         <p>
     *         The x-axis is a dimension field and cannot be aggregated.
     */

    public java.util.List<DimensionField> getXAxis() {
        return xAxis;
    }

    /**
     * <p>
     * The x-axis field well of a scatter plot.
     * </p>
     * <p>
     * The x-axis is a dimension field and cannot be aggregated.
     * </p>
     * 
     * @param xAxis
     *        The x-axis field well of a scatter plot.</p>
     *        <p>
     *        The x-axis is a dimension field and cannot be aggregated.
     */

    public void setXAxis(java.util.Collection<DimensionField> xAxis) {
        if (xAxis == null) {
            this.xAxis = null;
            return;
        }

        this.xAxis = new java.util.ArrayList<DimensionField>(xAxis);
    }

    /**
     * <p>
     * The x-axis field well of a scatter plot.
     * </p>
     * <p>
     * The x-axis is a dimension field and cannot be aggregated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setXAxis(java.util.Collection)} or {@link #withXAxis(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param xAxis
     *        The x-axis field well of a scatter plot.</p>
     *        <p>
     *        The x-axis is a dimension field and cannot be aggregated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScatterPlotUnaggregatedFieldWells withXAxis(DimensionField... xAxis) {
        if (this.xAxis == null) {
            setXAxis(new java.util.ArrayList<DimensionField>(xAxis.length));
        }
        for (DimensionField ele : xAxis) {
            this.xAxis.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The x-axis field well of a scatter plot.
     * </p>
     * <p>
     * The x-axis is a dimension field and cannot be aggregated.
     * </p>
     * 
     * @param xAxis
     *        The x-axis field well of a scatter plot.</p>
     *        <p>
     *        The x-axis is a dimension field and cannot be aggregated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScatterPlotUnaggregatedFieldWells withXAxis(java.util.Collection<DimensionField> xAxis) {
        setXAxis(xAxis);
        return this;
    }

    /**
     * <p>
     * The y-axis field well of a scatter plot.
     * </p>
     * <p>
     * The y-axis is a dimension field and cannot be aggregated.
     * </p>
     * 
     * @return The y-axis field well of a scatter plot.</p>
     *         <p>
     *         The y-axis is a dimension field and cannot be aggregated.
     */

    public java.util.List<DimensionField> getYAxis() {
        return yAxis;
    }

    /**
     * <p>
     * The y-axis field well of a scatter plot.
     * </p>
     * <p>
     * The y-axis is a dimension field and cannot be aggregated.
     * </p>
     * 
     * @param yAxis
     *        The y-axis field well of a scatter plot.</p>
     *        <p>
     *        The y-axis is a dimension field and cannot be aggregated.
     */

    public void setYAxis(java.util.Collection<DimensionField> yAxis) {
        if (yAxis == null) {
            this.yAxis = null;
            return;
        }

        this.yAxis = new java.util.ArrayList<DimensionField>(yAxis);
    }

    /**
     * <p>
     * The y-axis field well of a scatter plot.
     * </p>
     * <p>
     * The y-axis is a dimension field and cannot be aggregated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setYAxis(java.util.Collection)} or {@link #withYAxis(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param yAxis
     *        The y-axis field well of a scatter plot.</p>
     *        <p>
     *        The y-axis is a dimension field and cannot be aggregated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScatterPlotUnaggregatedFieldWells withYAxis(DimensionField... yAxis) {
        if (this.yAxis == null) {
            setYAxis(new java.util.ArrayList<DimensionField>(yAxis.length));
        }
        for (DimensionField ele : yAxis) {
            this.yAxis.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The y-axis field well of a scatter plot.
     * </p>
     * <p>
     * The y-axis is a dimension field and cannot be aggregated.
     * </p>
     * 
     * @param yAxis
     *        The y-axis field well of a scatter plot.</p>
     *        <p>
     *        The y-axis is a dimension field and cannot be aggregated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScatterPlotUnaggregatedFieldWells withYAxis(java.util.Collection<DimensionField> yAxis) {
        setYAxis(yAxis);
        return this;
    }

    /**
     * <p>
     * The size field well of a scatter plot.
     * </p>
     * 
     * @return The size field well of a scatter plot.
     */

    public java.util.List<MeasureField> getSize() {
        return size;
    }

    /**
     * <p>
     * The size field well of a scatter plot.
     * </p>
     * 
     * @param size
     *        The size field well of a scatter plot.
     */

    public void setSize(java.util.Collection<MeasureField> size) {
        if (size == null) {
            this.size = null;
            return;
        }

        this.size = new java.util.ArrayList<MeasureField>(size);
    }

    /**
     * <p>
     * The size field well of a scatter plot.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSize(java.util.Collection)} or {@link #withSize(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param size
     *        The size field well of a scatter plot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScatterPlotUnaggregatedFieldWells withSize(MeasureField... size) {
        if (this.size == null) {
            setSize(new java.util.ArrayList<MeasureField>(size.length));
        }
        for (MeasureField ele : size) {
            this.size.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The size field well of a scatter plot.
     * </p>
     * 
     * @param size
     *        The size field well of a scatter plot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScatterPlotUnaggregatedFieldWells withSize(java.util.Collection<MeasureField> size) {
        setSize(size);
        return this;
    }

    /**
     * <p>
     * The category field well of a scatter plot.
     * </p>
     * 
     * @return The category field well of a scatter plot.
     */

    public java.util.List<DimensionField> getCategory() {
        return category;
    }

    /**
     * <p>
     * The category field well of a scatter plot.
     * </p>
     * 
     * @param category
     *        The category field well of a scatter plot.
     */

    public void setCategory(java.util.Collection<DimensionField> category) {
        if (category == null) {
            this.category = null;
            return;
        }

        this.category = new java.util.ArrayList<DimensionField>(category);
    }

    /**
     * <p>
     * The category field well of a scatter plot.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCategory(java.util.Collection)} or {@link #withCategory(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param category
     *        The category field well of a scatter plot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScatterPlotUnaggregatedFieldWells withCategory(DimensionField... category) {
        if (this.category == null) {
            setCategory(new java.util.ArrayList<DimensionField>(category.length));
        }
        for (DimensionField ele : category) {
            this.category.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The category field well of a scatter plot.
     * </p>
     * 
     * @param category
     *        The category field well of a scatter plot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScatterPlotUnaggregatedFieldWells withCategory(java.util.Collection<DimensionField> category) {
        setCategory(category);
        return this;
    }

    /**
     * <p>
     * The label field well of a scatter plot.
     * </p>
     * 
     * @return The label field well of a scatter plot.
     */

    public java.util.List<DimensionField> getLabel() {
        return label;
    }

    /**
     * <p>
     * The label field well of a scatter plot.
     * </p>
     * 
     * @param label
     *        The label field well of a scatter plot.
     */

    public void setLabel(java.util.Collection<DimensionField> label) {
        if (label == null) {
            this.label = null;
            return;
        }

        this.label = new java.util.ArrayList<DimensionField>(label);
    }

    /**
     * <p>
     * The label field well of a scatter plot.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLabel(java.util.Collection)} or {@link #withLabel(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param label
     *        The label field well of a scatter plot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScatterPlotUnaggregatedFieldWells withLabel(DimensionField... label) {
        if (this.label == null) {
            setLabel(new java.util.ArrayList<DimensionField>(label.length));
        }
        for (DimensionField ele : label) {
            this.label.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The label field well of a scatter plot.
     * </p>
     * 
     * @param label
     *        The label field well of a scatter plot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScatterPlotUnaggregatedFieldWells withLabel(java.util.Collection<DimensionField> label) {
        setLabel(label);
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
        if (getXAxis() != null)
            sb.append("XAxis: ").append(getXAxis()).append(",");
        if (getYAxis() != null)
            sb.append("YAxis: ").append(getYAxis()).append(",");
        if (getSize() != null)
            sb.append("Size: ").append(getSize()).append(",");
        if (getCategory() != null)
            sb.append("Category: ").append(getCategory()).append(",");
        if (getLabel() != null)
            sb.append("Label: ").append(getLabel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScatterPlotUnaggregatedFieldWells == false)
            return false;
        ScatterPlotUnaggregatedFieldWells other = (ScatterPlotUnaggregatedFieldWells) obj;
        if (other.getXAxis() == null ^ this.getXAxis() == null)
            return false;
        if (other.getXAxis() != null && other.getXAxis().equals(this.getXAxis()) == false)
            return false;
        if (other.getYAxis() == null ^ this.getYAxis() == null)
            return false;
        if (other.getYAxis() != null && other.getYAxis().equals(this.getYAxis()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getXAxis() == null) ? 0 : getXAxis().hashCode());
        hashCode = prime * hashCode + ((getYAxis() == null) ? 0 : getYAxis().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        return hashCode;
    }

    @Override
    public ScatterPlotUnaggregatedFieldWells clone() {
        try {
            return (ScatterPlotUnaggregatedFieldWells) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ScatterPlotUnaggregatedFieldWellsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
