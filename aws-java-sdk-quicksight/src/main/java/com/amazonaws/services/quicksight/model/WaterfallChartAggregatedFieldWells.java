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
 * The field well configuration of a waterfall visual.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/WaterfallChartAggregatedFieldWells"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WaterfallChartAggregatedFieldWells implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The category field wells of a waterfall visual.
     * </p>
     */
    private java.util.List<DimensionField> categories;
    /**
     * <p>
     * The value field wells of a waterfall visual.
     * </p>
     */
    private java.util.List<MeasureField> values;
    /**
     * <p>
     * The breakdown field wells of a waterfall visual.
     * </p>
     */
    private java.util.List<DimensionField> breakdowns;

    /**
     * <p>
     * The category field wells of a waterfall visual.
     * </p>
     * 
     * @return The category field wells of a waterfall visual.
     */

    public java.util.List<DimensionField> getCategories() {
        return categories;
    }

    /**
     * <p>
     * The category field wells of a waterfall visual.
     * </p>
     * 
     * @param categories
     *        The category field wells of a waterfall visual.
     */

    public void setCategories(java.util.Collection<DimensionField> categories) {
        if (categories == null) {
            this.categories = null;
            return;
        }

        this.categories = new java.util.ArrayList<DimensionField>(categories);
    }

    /**
     * <p>
     * The category field wells of a waterfall visual.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCategories(java.util.Collection)} or {@link #withCategories(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param categories
     *        The category field wells of a waterfall visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WaterfallChartAggregatedFieldWells withCategories(DimensionField... categories) {
        if (this.categories == null) {
            setCategories(new java.util.ArrayList<DimensionField>(categories.length));
        }
        for (DimensionField ele : categories) {
            this.categories.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The category field wells of a waterfall visual.
     * </p>
     * 
     * @param categories
     *        The category field wells of a waterfall visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WaterfallChartAggregatedFieldWells withCategories(java.util.Collection<DimensionField> categories) {
        setCategories(categories);
        return this;
    }

    /**
     * <p>
     * The value field wells of a waterfall visual.
     * </p>
     * 
     * @return The value field wells of a waterfall visual.
     */

    public java.util.List<MeasureField> getValues() {
        return values;
    }

    /**
     * <p>
     * The value field wells of a waterfall visual.
     * </p>
     * 
     * @param values
     *        The value field wells of a waterfall visual.
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
     * The value field wells of a waterfall visual.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The value field wells of a waterfall visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WaterfallChartAggregatedFieldWells withValues(MeasureField... values) {
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
     * The value field wells of a waterfall visual.
     * </p>
     * 
     * @param values
     *        The value field wells of a waterfall visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WaterfallChartAggregatedFieldWells withValues(java.util.Collection<MeasureField> values) {
        setValues(values);
        return this;
    }

    /**
     * <p>
     * The breakdown field wells of a waterfall visual.
     * </p>
     * 
     * @return The breakdown field wells of a waterfall visual.
     */

    public java.util.List<DimensionField> getBreakdowns() {
        return breakdowns;
    }

    /**
     * <p>
     * The breakdown field wells of a waterfall visual.
     * </p>
     * 
     * @param breakdowns
     *        The breakdown field wells of a waterfall visual.
     */

    public void setBreakdowns(java.util.Collection<DimensionField> breakdowns) {
        if (breakdowns == null) {
            this.breakdowns = null;
            return;
        }

        this.breakdowns = new java.util.ArrayList<DimensionField>(breakdowns);
    }

    /**
     * <p>
     * The breakdown field wells of a waterfall visual.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBreakdowns(java.util.Collection)} or {@link #withBreakdowns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param breakdowns
     *        The breakdown field wells of a waterfall visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WaterfallChartAggregatedFieldWells withBreakdowns(DimensionField... breakdowns) {
        if (this.breakdowns == null) {
            setBreakdowns(new java.util.ArrayList<DimensionField>(breakdowns.length));
        }
        for (DimensionField ele : breakdowns) {
            this.breakdowns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The breakdown field wells of a waterfall visual.
     * </p>
     * 
     * @param breakdowns
     *        The breakdown field wells of a waterfall visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WaterfallChartAggregatedFieldWells withBreakdowns(java.util.Collection<DimensionField> breakdowns) {
        setBreakdowns(breakdowns);
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
        if (getCategories() != null)
            sb.append("Categories: ").append(getCategories()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues()).append(",");
        if (getBreakdowns() != null)
            sb.append("Breakdowns: ").append(getBreakdowns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WaterfallChartAggregatedFieldWells == false)
            return false;
        WaterfallChartAggregatedFieldWells other = (WaterfallChartAggregatedFieldWells) obj;
        if (other.getCategories() == null ^ this.getCategories() == null)
            return false;
        if (other.getCategories() != null && other.getCategories().equals(this.getCategories()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        if (other.getBreakdowns() == null ^ this.getBreakdowns() == null)
            return false;
        if (other.getBreakdowns() != null && other.getBreakdowns().equals(this.getBreakdowns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCategories() == null) ? 0 : getCategories().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        hashCode = prime * hashCode + ((getBreakdowns() == null) ? 0 : getBreakdowns().hashCode());
        return hashCode;
    }

    @Override
    public WaterfallChartAggregatedFieldWells clone() {
        try {
            return (WaterfallChartAggregatedFieldWells) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.WaterfallChartAggregatedFieldWellsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
