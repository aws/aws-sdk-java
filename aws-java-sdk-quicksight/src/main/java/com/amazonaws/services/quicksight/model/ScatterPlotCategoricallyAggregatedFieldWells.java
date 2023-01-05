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
 * The aggregated field well of a scatter plot.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ScatterPlotCategoricallyAggregatedFieldWells"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScatterPlotCategoricallyAggregatedFieldWells implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The x-axis field well of a scatter plot.
     * </p>
     * <p>
     * The x-axis is aggregated by category.
     * </p>
     */
    private java.util.List<MeasureField> xAxis;
    /**
     * <p>
     * The y-axis field well of a scatter plot.
     * </p>
     * <p>
     * The y-axis is aggregated by category.
     * </p>
     */
    private java.util.List<MeasureField> yAxis;
    /**
     * <p>
     * The category field well of a scatter plot.
     * </p>
     */
    private java.util.List<DimensionField> category;
    /**
     * <p>
     * The size field well of a scatter plot.
     * </p>
     */
    private java.util.List<MeasureField> size;

    /**
     * <p>
     * The x-axis field well of a scatter plot.
     * </p>
     * <p>
     * The x-axis is aggregated by category.
     * </p>
     * 
     * @return The x-axis field well of a scatter plot.</p>
     *         <p>
     *         The x-axis is aggregated by category.
     */

    public java.util.List<MeasureField> getXAxis() {
        return xAxis;
    }

    /**
     * <p>
     * The x-axis field well of a scatter plot.
     * </p>
     * <p>
     * The x-axis is aggregated by category.
     * </p>
     * 
     * @param xAxis
     *        The x-axis field well of a scatter plot.</p>
     *        <p>
     *        The x-axis is aggregated by category.
     */

    public void setXAxis(java.util.Collection<MeasureField> xAxis) {
        if (xAxis == null) {
            this.xAxis = null;
            return;
        }

        this.xAxis = new java.util.ArrayList<MeasureField>(xAxis);
    }

    /**
     * <p>
     * The x-axis field well of a scatter plot.
     * </p>
     * <p>
     * The x-axis is aggregated by category.
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
     *        The x-axis is aggregated by category.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScatterPlotCategoricallyAggregatedFieldWells withXAxis(MeasureField... xAxis) {
        if (this.xAxis == null) {
            setXAxis(new java.util.ArrayList<MeasureField>(xAxis.length));
        }
        for (MeasureField ele : xAxis) {
            this.xAxis.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The x-axis field well of a scatter plot.
     * </p>
     * <p>
     * The x-axis is aggregated by category.
     * </p>
     * 
     * @param xAxis
     *        The x-axis field well of a scatter plot.</p>
     *        <p>
     *        The x-axis is aggregated by category.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScatterPlotCategoricallyAggregatedFieldWells withXAxis(java.util.Collection<MeasureField> xAxis) {
        setXAxis(xAxis);
        return this;
    }

    /**
     * <p>
     * The y-axis field well of a scatter plot.
     * </p>
     * <p>
     * The y-axis is aggregated by category.
     * </p>
     * 
     * @return The y-axis field well of a scatter plot.</p>
     *         <p>
     *         The y-axis is aggregated by category.
     */

    public java.util.List<MeasureField> getYAxis() {
        return yAxis;
    }

    /**
     * <p>
     * The y-axis field well of a scatter plot.
     * </p>
     * <p>
     * The y-axis is aggregated by category.
     * </p>
     * 
     * @param yAxis
     *        The y-axis field well of a scatter plot.</p>
     *        <p>
     *        The y-axis is aggregated by category.
     */

    public void setYAxis(java.util.Collection<MeasureField> yAxis) {
        if (yAxis == null) {
            this.yAxis = null;
            return;
        }

        this.yAxis = new java.util.ArrayList<MeasureField>(yAxis);
    }

    /**
     * <p>
     * The y-axis field well of a scatter plot.
     * </p>
     * <p>
     * The y-axis is aggregated by category.
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
     *        The y-axis is aggregated by category.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScatterPlotCategoricallyAggregatedFieldWells withYAxis(MeasureField... yAxis) {
        if (this.yAxis == null) {
            setYAxis(new java.util.ArrayList<MeasureField>(yAxis.length));
        }
        for (MeasureField ele : yAxis) {
            this.yAxis.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The y-axis field well of a scatter plot.
     * </p>
     * <p>
     * The y-axis is aggregated by category.
     * </p>
     * 
     * @param yAxis
     *        The y-axis field well of a scatter plot.</p>
     *        <p>
     *        The y-axis is aggregated by category.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScatterPlotCategoricallyAggregatedFieldWells withYAxis(java.util.Collection<MeasureField> yAxis) {
        setYAxis(yAxis);
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

    public ScatterPlotCategoricallyAggregatedFieldWells withCategory(DimensionField... category) {
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

    public ScatterPlotCategoricallyAggregatedFieldWells withCategory(java.util.Collection<DimensionField> category) {
        setCategory(category);
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

    public ScatterPlotCategoricallyAggregatedFieldWells withSize(MeasureField... size) {
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

    public ScatterPlotCategoricallyAggregatedFieldWells withSize(java.util.Collection<MeasureField> size) {
        setSize(size);
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
        if (getCategory() != null)
            sb.append("Category: ").append(getCategory()).append(",");
        if (getSize() != null)
            sb.append("Size: ").append(getSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScatterPlotCategoricallyAggregatedFieldWells == false)
            return false;
        ScatterPlotCategoricallyAggregatedFieldWells other = (ScatterPlotCategoricallyAggregatedFieldWells) obj;
        if (other.getXAxis() == null ^ this.getXAxis() == null)
            return false;
        if (other.getXAxis() != null && other.getXAxis().equals(this.getXAxis()) == false)
            return false;
        if (other.getYAxis() == null ^ this.getYAxis() == null)
            return false;
        if (other.getYAxis() != null && other.getYAxis().equals(this.getYAxis()) == false)
            return false;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getXAxis() == null) ? 0 : getXAxis().hashCode());
        hashCode = prime * hashCode + ((getYAxis() == null) ? 0 : getYAxis().hashCode());
        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        return hashCode;
    }

    @Override
    public ScatterPlotCategoricallyAggregatedFieldWells clone() {
        try {
            return (ScatterPlotCategoricallyAggregatedFieldWells) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ScatterPlotCategoricallyAggregatedFieldWellsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
