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
 * The aggregated field well configuration of a <code>RadarChartVisual</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/RadarChartAggregatedFieldWells"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RadarChartAggregatedFieldWells implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The aggregated field well categories of a radar chart.
     * </p>
     */
    private java.util.List<DimensionField> category;
    /**
     * <p>
     * The color that are assigned to the aggregated field wells of a radar chart.
     * </p>
     */
    private java.util.List<DimensionField> color;
    /**
     * <p>
     * The values that are assigned to the aggregated field wells of a radar chart.
     * </p>
     */
    private java.util.List<MeasureField> values;

    /**
     * <p>
     * The aggregated field well categories of a radar chart.
     * </p>
     * 
     * @return The aggregated field well categories of a radar chart.
     */

    public java.util.List<DimensionField> getCategory() {
        return category;
    }

    /**
     * <p>
     * The aggregated field well categories of a radar chart.
     * </p>
     * 
     * @param category
     *        The aggregated field well categories of a radar chart.
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
     * The aggregated field well categories of a radar chart.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCategory(java.util.Collection)} or {@link #withCategory(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param category
     *        The aggregated field well categories of a radar chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RadarChartAggregatedFieldWells withCategory(DimensionField... category) {
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
     * The aggregated field well categories of a radar chart.
     * </p>
     * 
     * @param category
     *        The aggregated field well categories of a radar chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RadarChartAggregatedFieldWells withCategory(java.util.Collection<DimensionField> category) {
        setCategory(category);
        return this;
    }

    /**
     * <p>
     * The color that are assigned to the aggregated field wells of a radar chart.
     * </p>
     * 
     * @return The color that are assigned to the aggregated field wells of a radar chart.
     */

    public java.util.List<DimensionField> getColor() {
        return color;
    }

    /**
     * <p>
     * The color that are assigned to the aggregated field wells of a radar chart.
     * </p>
     * 
     * @param color
     *        The color that are assigned to the aggregated field wells of a radar chart.
     */

    public void setColor(java.util.Collection<DimensionField> color) {
        if (color == null) {
            this.color = null;
            return;
        }

        this.color = new java.util.ArrayList<DimensionField>(color);
    }

    /**
     * <p>
     * The color that are assigned to the aggregated field wells of a radar chart.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColor(java.util.Collection)} or {@link #withColor(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param color
     *        The color that are assigned to the aggregated field wells of a radar chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RadarChartAggregatedFieldWells withColor(DimensionField... color) {
        if (this.color == null) {
            setColor(new java.util.ArrayList<DimensionField>(color.length));
        }
        for (DimensionField ele : color) {
            this.color.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The color that are assigned to the aggregated field wells of a radar chart.
     * </p>
     * 
     * @param color
     *        The color that are assigned to the aggregated field wells of a radar chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RadarChartAggregatedFieldWells withColor(java.util.Collection<DimensionField> color) {
        setColor(color);
        return this;
    }

    /**
     * <p>
     * The values that are assigned to the aggregated field wells of a radar chart.
     * </p>
     * 
     * @return The values that are assigned to the aggregated field wells of a radar chart.
     */

    public java.util.List<MeasureField> getValues() {
        return values;
    }

    /**
     * <p>
     * The values that are assigned to the aggregated field wells of a radar chart.
     * </p>
     * 
     * @param values
     *        The values that are assigned to the aggregated field wells of a radar chart.
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
     * The values that are assigned to the aggregated field wells of a radar chart.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The values that are assigned to the aggregated field wells of a radar chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RadarChartAggregatedFieldWells withValues(MeasureField... values) {
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
     * The values that are assigned to the aggregated field wells of a radar chart.
     * </p>
     * 
     * @param values
     *        The values that are assigned to the aggregated field wells of a radar chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RadarChartAggregatedFieldWells withValues(java.util.Collection<MeasureField> values) {
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
        if (getCategory() != null)
            sb.append("Category: ").append(getCategory()).append(",");
        if (getColor() != null)
            sb.append("Color: ").append(getColor()).append(",");
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

        if (obj instanceof RadarChartAggregatedFieldWells == false)
            return false;
        RadarChartAggregatedFieldWells other = (RadarChartAggregatedFieldWells) obj;
        if (other.getCategory() == null ^ this.getCategory() == null)
            return false;
        if (other.getCategory() != null && other.getCategory().equals(this.getCategory()) == false)
            return false;
        if (other.getColor() == null ^ this.getColor() == null)
            return false;
        if (other.getColor() != null && other.getColor().equals(this.getColor()) == false)
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

        hashCode = prime * hashCode + ((getCategory() == null) ? 0 : getCategory().hashCode());
        hashCode = prime * hashCode + ((getColor() == null) ? 0 : getColor().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public RadarChartAggregatedFieldWells clone() {
        try {
            return (RadarChartAggregatedFieldWells) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.RadarChartAggregatedFieldWellsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
