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
 * The aggregated field wells of a bar chart.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/BarChartAggregatedFieldWells"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BarChartAggregatedFieldWells implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The category (y-axis) field well of a bar chart.
     * </p>
     */
    private java.util.List<DimensionField> category;
    /**
     * <p>
     * The value field wells of a bar chart. Values are aggregated by category.
     * </p>
     */
    private java.util.List<MeasureField> values;
    /**
     * <p>
     * The color (group/color) field well of a bar chart.
     * </p>
     */
    private java.util.List<DimensionField> colors;
    /**
     * <p>
     * The small multiples field well of a bar chart.
     * </p>
     */
    private java.util.List<DimensionField> smallMultiples;

    /**
     * <p>
     * The category (y-axis) field well of a bar chart.
     * </p>
     * 
     * @return The category (y-axis) field well of a bar chart.
     */

    public java.util.List<DimensionField> getCategory() {
        return category;
    }

    /**
     * <p>
     * The category (y-axis) field well of a bar chart.
     * </p>
     * 
     * @param category
     *        The category (y-axis) field well of a bar chart.
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
     * The category (y-axis) field well of a bar chart.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCategory(java.util.Collection)} or {@link #withCategory(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param category
     *        The category (y-axis) field well of a bar chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BarChartAggregatedFieldWells withCategory(DimensionField... category) {
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
     * The category (y-axis) field well of a bar chart.
     * </p>
     * 
     * @param category
     *        The category (y-axis) field well of a bar chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BarChartAggregatedFieldWells withCategory(java.util.Collection<DimensionField> category) {
        setCategory(category);
        return this;
    }

    /**
     * <p>
     * The value field wells of a bar chart. Values are aggregated by category.
     * </p>
     * 
     * @return The value field wells of a bar chart. Values are aggregated by category.
     */

    public java.util.List<MeasureField> getValues() {
        return values;
    }

    /**
     * <p>
     * The value field wells of a bar chart. Values are aggregated by category.
     * </p>
     * 
     * @param values
     *        The value field wells of a bar chart. Values are aggregated by category.
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
     * The value field wells of a bar chart. Values are aggregated by category.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The value field wells of a bar chart. Values are aggregated by category.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BarChartAggregatedFieldWells withValues(MeasureField... values) {
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
     * The value field wells of a bar chart. Values are aggregated by category.
     * </p>
     * 
     * @param values
     *        The value field wells of a bar chart. Values are aggregated by category.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BarChartAggregatedFieldWells withValues(java.util.Collection<MeasureField> values) {
        setValues(values);
        return this;
    }

    /**
     * <p>
     * The color (group/color) field well of a bar chart.
     * </p>
     * 
     * @return The color (group/color) field well of a bar chart.
     */

    public java.util.List<DimensionField> getColors() {
        return colors;
    }

    /**
     * <p>
     * The color (group/color) field well of a bar chart.
     * </p>
     * 
     * @param colors
     *        The color (group/color) field well of a bar chart.
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
     * The color (group/color) field well of a bar chart.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColors(java.util.Collection)} or {@link #withColors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param colors
     *        The color (group/color) field well of a bar chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BarChartAggregatedFieldWells withColors(DimensionField... colors) {
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
     * The color (group/color) field well of a bar chart.
     * </p>
     * 
     * @param colors
     *        The color (group/color) field well of a bar chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BarChartAggregatedFieldWells withColors(java.util.Collection<DimensionField> colors) {
        setColors(colors);
        return this;
    }

    /**
     * <p>
     * The small multiples field well of a bar chart.
     * </p>
     * 
     * @return The small multiples field well of a bar chart.
     */

    public java.util.List<DimensionField> getSmallMultiples() {
        return smallMultiples;
    }

    /**
     * <p>
     * The small multiples field well of a bar chart.
     * </p>
     * 
     * @param smallMultiples
     *        The small multiples field well of a bar chart.
     */

    public void setSmallMultiples(java.util.Collection<DimensionField> smallMultiples) {
        if (smallMultiples == null) {
            this.smallMultiples = null;
            return;
        }

        this.smallMultiples = new java.util.ArrayList<DimensionField>(smallMultiples);
    }

    /**
     * <p>
     * The small multiples field well of a bar chart.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSmallMultiples(java.util.Collection)} or {@link #withSmallMultiples(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param smallMultiples
     *        The small multiples field well of a bar chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BarChartAggregatedFieldWells withSmallMultiples(DimensionField... smallMultiples) {
        if (this.smallMultiples == null) {
            setSmallMultiples(new java.util.ArrayList<DimensionField>(smallMultiples.length));
        }
        for (DimensionField ele : smallMultiples) {
            this.smallMultiples.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The small multiples field well of a bar chart.
     * </p>
     * 
     * @param smallMultiples
     *        The small multiples field well of a bar chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BarChartAggregatedFieldWells withSmallMultiples(java.util.Collection<DimensionField> smallMultiples) {
        setSmallMultiples(smallMultiples);
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
        if (getValues() != null)
            sb.append("Values: ").append(getValues()).append(",");
        if (getColors() != null)
            sb.append("Colors: ").append(getColors()).append(",");
        if (getSmallMultiples() != null)
            sb.append("SmallMultiples: ").append(getSmallMultiples());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BarChartAggregatedFieldWells == false)
            return false;
        BarChartAggregatedFieldWells other = (BarChartAggregatedFieldWells) obj;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        if (other.getColors() == null ^ this.getColors() == null)
            return false;
        if (other.getColors() != null && other.getColors().equals(this.getColors()) == false)
            return false;
        if (other.getSmallMultiples() == null ^ this.getSmallMultiples() == null)
            return false;
        if (other.getSmallMultiples() != null && other.getSmallMultiples().equals(this.getSmallMultiples()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        hashCode = prime * hashCode + ((getColors() == null) ? 0 : getColors().hashCode());
        hashCode = prime * hashCode + ((getSmallMultiples() == null) ? 0 : getSmallMultiples().hashCode());
        return hashCode;
    }

    @Override
    public BarChartAggregatedFieldWells clone() {
        try {
            return (BarChartAggregatedFieldWells) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.BarChartAggregatedFieldWellsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
