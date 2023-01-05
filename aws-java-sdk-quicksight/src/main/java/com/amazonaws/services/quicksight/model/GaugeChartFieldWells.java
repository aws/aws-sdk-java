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
 * The field well configuration of a <code>GaugeChartVisual</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/GaugeChartFieldWells" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GaugeChartFieldWells implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value field wells of a <code>GaugeChartVisual</code>.
     * </p>
     */
    private java.util.List<MeasureField> values;
    /**
     * <p>
     * The target value field wells of a <code>GaugeChartVisual</code>.
     * </p>
     */
    private java.util.List<MeasureField> targetValues;

    /**
     * <p>
     * The value field wells of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @return The value field wells of a <code>GaugeChartVisual</code>.
     */

    public java.util.List<MeasureField> getValues() {
        return values;
    }

    /**
     * <p>
     * The value field wells of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @param values
     *        The value field wells of a <code>GaugeChartVisual</code>.
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
     * The value field wells of a <code>GaugeChartVisual</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The value field wells of a <code>GaugeChartVisual</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GaugeChartFieldWells withValues(MeasureField... values) {
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
     * The value field wells of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @param values
     *        The value field wells of a <code>GaugeChartVisual</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GaugeChartFieldWells withValues(java.util.Collection<MeasureField> values) {
        setValues(values);
        return this;
    }

    /**
     * <p>
     * The target value field wells of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @return The target value field wells of a <code>GaugeChartVisual</code>.
     */

    public java.util.List<MeasureField> getTargetValues() {
        return targetValues;
    }

    /**
     * <p>
     * The target value field wells of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @param targetValues
     *        The target value field wells of a <code>GaugeChartVisual</code>.
     */

    public void setTargetValues(java.util.Collection<MeasureField> targetValues) {
        if (targetValues == null) {
            this.targetValues = null;
            return;
        }

        this.targetValues = new java.util.ArrayList<MeasureField>(targetValues);
    }

    /**
     * <p>
     * The target value field wells of a <code>GaugeChartVisual</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetValues(java.util.Collection)} or {@link #withTargetValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param targetValues
     *        The target value field wells of a <code>GaugeChartVisual</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GaugeChartFieldWells withTargetValues(MeasureField... targetValues) {
        if (this.targetValues == null) {
            setTargetValues(new java.util.ArrayList<MeasureField>(targetValues.length));
        }
        for (MeasureField ele : targetValues) {
            this.targetValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The target value field wells of a <code>GaugeChartVisual</code>.
     * </p>
     * 
     * @param targetValues
     *        The target value field wells of a <code>GaugeChartVisual</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GaugeChartFieldWells withTargetValues(java.util.Collection<MeasureField> targetValues) {
        setTargetValues(targetValues);
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
        if (getValues() != null)
            sb.append("Values: ").append(getValues()).append(",");
        if (getTargetValues() != null)
            sb.append("TargetValues: ").append(getTargetValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GaugeChartFieldWells == false)
            return false;
        GaugeChartFieldWells other = (GaugeChartFieldWells) obj;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        if (other.getTargetValues() == null ^ this.getTargetValues() == null)
            return false;
        if (other.getTargetValues() != null && other.getTargetValues().equals(this.getTargetValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        hashCode = prime * hashCode + ((getTargetValues() == null) ? 0 : getTargetValues().hashCode());
        return hashCode;
    }

    @Override
    public GaugeChartFieldWells clone() {
        try {
            return (GaugeChartFieldWells) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.GaugeChartFieldWellsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
