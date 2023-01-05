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
 * The aggregated field wells of a combo chart.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ComboChartAggregatedFieldWells"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComboChartAggregatedFieldWells implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The aggregated category field wells of a combo chart.
     * </p>
     */
    private java.util.List<DimensionField> category;
    /**
     * <p>
     * The aggregated <code>BarValues</code> field well of a combo chart.
     * </p>
     */
    private java.util.List<MeasureField> barValues;
    /**
     * <p>
     * The aggregated colors field well of a combo chart.
     * </p>
     */
    private java.util.List<DimensionField> colors;
    /**
     * <p>
     * The aggregated <code>LineValues</code> field well of a combo chart.
     * </p>
     */
    private java.util.List<MeasureField> lineValues;

    /**
     * <p>
     * The aggregated category field wells of a combo chart.
     * </p>
     * 
     * @return The aggregated category field wells of a combo chart.
     */

    public java.util.List<DimensionField> getCategory() {
        return category;
    }

    /**
     * <p>
     * The aggregated category field wells of a combo chart.
     * </p>
     * 
     * @param category
     *        The aggregated category field wells of a combo chart.
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
     * The aggregated category field wells of a combo chart.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCategory(java.util.Collection)} or {@link #withCategory(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param category
     *        The aggregated category field wells of a combo chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComboChartAggregatedFieldWells withCategory(DimensionField... category) {
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
     * The aggregated category field wells of a combo chart.
     * </p>
     * 
     * @param category
     *        The aggregated category field wells of a combo chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComboChartAggregatedFieldWells withCategory(java.util.Collection<DimensionField> category) {
        setCategory(category);
        return this;
    }

    /**
     * <p>
     * The aggregated <code>BarValues</code> field well of a combo chart.
     * </p>
     * 
     * @return The aggregated <code>BarValues</code> field well of a combo chart.
     */

    public java.util.List<MeasureField> getBarValues() {
        return barValues;
    }

    /**
     * <p>
     * The aggregated <code>BarValues</code> field well of a combo chart.
     * </p>
     * 
     * @param barValues
     *        The aggregated <code>BarValues</code> field well of a combo chart.
     */

    public void setBarValues(java.util.Collection<MeasureField> barValues) {
        if (barValues == null) {
            this.barValues = null;
            return;
        }

        this.barValues = new java.util.ArrayList<MeasureField>(barValues);
    }

    /**
     * <p>
     * The aggregated <code>BarValues</code> field well of a combo chart.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBarValues(java.util.Collection)} or {@link #withBarValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param barValues
     *        The aggregated <code>BarValues</code> field well of a combo chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComboChartAggregatedFieldWells withBarValues(MeasureField... barValues) {
        if (this.barValues == null) {
            setBarValues(new java.util.ArrayList<MeasureField>(barValues.length));
        }
        for (MeasureField ele : barValues) {
            this.barValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The aggregated <code>BarValues</code> field well of a combo chart.
     * </p>
     * 
     * @param barValues
     *        The aggregated <code>BarValues</code> field well of a combo chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComboChartAggregatedFieldWells withBarValues(java.util.Collection<MeasureField> barValues) {
        setBarValues(barValues);
        return this;
    }

    /**
     * <p>
     * The aggregated colors field well of a combo chart.
     * </p>
     * 
     * @return The aggregated colors field well of a combo chart.
     */

    public java.util.List<DimensionField> getColors() {
        return colors;
    }

    /**
     * <p>
     * The aggregated colors field well of a combo chart.
     * </p>
     * 
     * @param colors
     *        The aggregated colors field well of a combo chart.
     */

    public void setColors(java.util.Collection<DimensionField> colors) {
        if (colors == null) {
            this.colors = null;
            return;
        }

        this.colors = new java.util.ArrayList<DimensionField>(colors);
    }

    /**
     * <p>
     * The aggregated colors field well of a combo chart.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColors(java.util.Collection)} or {@link #withColors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param colors
     *        The aggregated colors field well of a combo chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComboChartAggregatedFieldWells withColors(DimensionField... colors) {
        if (this.colors == null) {
            setColors(new java.util.ArrayList<DimensionField>(colors.length));
        }
        for (DimensionField ele : colors) {
            this.colors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The aggregated colors field well of a combo chart.
     * </p>
     * 
     * @param colors
     *        The aggregated colors field well of a combo chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComboChartAggregatedFieldWells withColors(java.util.Collection<DimensionField> colors) {
        setColors(colors);
        return this;
    }

    /**
     * <p>
     * The aggregated <code>LineValues</code> field well of a combo chart.
     * </p>
     * 
     * @return The aggregated <code>LineValues</code> field well of a combo chart.
     */

    public java.util.List<MeasureField> getLineValues() {
        return lineValues;
    }

    /**
     * <p>
     * The aggregated <code>LineValues</code> field well of a combo chart.
     * </p>
     * 
     * @param lineValues
     *        The aggregated <code>LineValues</code> field well of a combo chart.
     */

    public void setLineValues(java.util.Collection<MeasureField> lineValues) {
        if (lineValues == null) {
            this.lineValues = null;
            return;
        }

        this.lineValues = new java.util.ArrayList<MeasureField>(lineValues);
    }

    /**
     * <p>
     * The aggregated <code>LineValues</code> field well of a combo chart.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLineValues(java.util.Collection)} or {@link #withLineValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param lineValues
     *        The aggregated <code>LineValues</code> field well of a combo chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComboChartAggregatedFieldWells withLineValues(MeasureField... lineValues) {
        if (this.lineValues == null) {
            setLineValues(new java.util.ArrayList<MeasureField>(lineValues.length));
        }
        for (MeasureField ele : lineValues) {
            this.lineValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The aggregated <code>LineValues</code> field well of a combo chart.
     * </p>
     * 
     * @param lineValues
     *        The aggregated <code>LineValues</code> field well of a combo chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ComboChartAggregatedFieldWells withLineValues(java.util.Collection<MeasureField> lineValues) {
        setLineValues(lineValues);
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
        if (getCategory() != null)
            sb.append("Category: ").append(getCategory()).append(",");
        if (getBarValues() != null)
            sb.append("BarValues: ").append(getBarValues()).append(",");
        if (getColors() != null)
            sb.append("Colors: ").append(getColors()).append(",");
        if (getLineValues() != null)
            sb.append("LineValues: ").append(getLineValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ComboChartAggregatedFieldWells == false)
            return false;
        ComboChartAggregatedFieldWells other = (ComboChartAggregatedFieldWells) obj;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getBarValues() == null ^ this.getBarValues() == null)
            return false;
        if (other.getBarValues() != null && other.getBarValues().equals(this.getBarValues()) == false)
            return false;
        if (other.getColors() == null ^ this.getColors() == null)
            return false;
        if (other.getColors() != null && other.getColors().equals(this.getColors()) == false)
            return false;
        if (other.getLineValues() == null ^ this.getLineValues() == null)
            return false;
        if (other.getLineValues() != null && other.getLineValues().equals(this.getLineValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getBarValues() == null) ? 0 : getBarValues().hashCode());
        hashCode = prime * hashCode + ((getColors() == null) ? 0 : getColors().hashCode());
        hashCode = prime * hashCode + ((getLineValues() == null) ? 0 : getLineValues().hashCode());
        return hashCode;
    }

    @Override
    public ComboChartAggregatedFieldWells clone() {
        try {
            return (ComboChartAggregatedFieldWells) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ComboChartAggregatedFieldWellsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
