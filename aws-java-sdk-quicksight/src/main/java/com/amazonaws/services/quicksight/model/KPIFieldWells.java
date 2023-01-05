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
 * The field well configuration of a KPI visual.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/KPIFieldWells" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KPIFieldWells implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value field wells of a KPI visual.
     * </p>
     */
    private java.util.List<MeasureField> values;
    /**
     * <p>
     * The target value field wells of a KPI visual.
     * </p>
     */
    private java.util.List<MeasureField> targetValues;
    /**
     * <p>
     * The trend group field wells of a KPI visual.
     * </p>
     */
    private java.util.List<DimensionField> trendGroups;

    /**
     * <p>
     * The value field wells of a KPI visual.
     * </p>
     * 
     * @return The value field wells of a KPI visual.
     */

    public java.util.List<MeasureField> getValues() {
        return values;
    }

    /**
     * <p>
     * The value field wells of a KPI visual.
     * </p>
     * 
     * @param values
     *        The value field wells of a KPI visual.
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
     * The value field wells of a KPI visual.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The value field wells of a KPI visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KPIFieldWells withValues(MeasureField... values) {
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
     * The value field wells of a KPI visual.
     * </p>
     * 
     * @param values
     *        The value field wells of a KPI visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KPIFieldWells withValues(java.util.Collection<MeasureField> values) {
        setValues(values);
        return this;
    }

    /**
     * <p>
     * The target value field wells of a KPI visual.
     * </p>
     * 
     * @return The target value field wells of a KPI visual.
     */

    public java.util.List<MeasureField> getTargetValues() {
        return targetValues;
    }

    /**
     * <p>
     * The target value field wells of a KPI visual.
     * </p>
     * 
     * @param targetValues
     *        The target value field wells of a KPI visual.
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
     * The target value field wells of a KPI visual.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetValues(java.util.Collection)} or {@link #withTargetValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param targetValues
     *        The target value field wells of a KPI visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KPIFieldWells withTargetValues(MeasureField... targetValues) {
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
     * The target value field wells of a KPI visual.
     * </p>
     * 
     * @param targetValues
     *        The target value field wells of a KPI visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KPIFieldWells withTargetValues(java.util.Collection<MeasureField> targetValues) {
        setTargetValues(targetValues);
        return this;
    }

    /**
     * <p>
     * The trend group field wells of a KPI visual.
     * </p>
     * 
     * @return The trend group field wells of a KPI visual.
     */

    public java.util.List<DimensionField> getTrendGroups() {
        return trendGroups;
    }

    /**
     * <p>
     * The trend group field wells of a KPI visual.
     * </p>
     * 
     * @param trendGroups
     *        The trend group field wells of a KPI visual.
     */

    public void setTrendGroups(java.util.Collection<DimensionField> trendGroups) {
        if (trendGroups == null) {
            this.trendGroups = null;
            return;
        }

        this.trendGroups = new java.util.ArrayList<DimensionField>(trendGroups);
    }

    /**
     * <p>
     * The trend group field wells of a KPI visual.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTrendGroups(java.util.Collection)} or {@link #withTrendGroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param trendGroups
     *        The trend group field wells of a KPI visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KPIFieldWells withTrendGroups(DimensionField... trendGroups) {
        if (this.trendGroups == null) {
            setTrendGroups(new java.util.ArrayList<DimensionField>(trendGroups.length));
        }
        for (DimensionField ele : trendGroups) {
            this.trendGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The trend group field wells of a KPI visual.
     * </p>
     * 
     * @param trendGroups
     *        The trend group field wells of a KPI visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KPIFieldWells withTrendGroups(java.util.Collection<DimensionField> trendGroups) {
        setTrendGroups(trendGroups);
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
            sb.append("TargetValues: ").append(getTargetValues()).append(",");
        if (getTrendGroups() != null)
            sb.append("TrendGroups: ").append(getTrendGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KPIFieldWells == false)
            return false;
        KPIFieldWells other = (KPIFieldWells) obj;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        if (other.getTargetValues() == null ^ this.getTargetValues() == null)
            return false;
        if (other.getTargetValues() != null && other.getTargetValues().equals(this.getTargetValues()) == false)
            return false;
        if (other.getTrendGroups() == null ^ this.getTrendGroups() == null)
            return false;
        if (other.getTrendGroups() != null && other.getTrendGroups().equals(this.getTrendGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        hashCode = prime * hashCode + ((getTargetValues() == null) ? 0 : getTargetValues().hashCode());
        hashCode = prime * hashCode + ((getTrendGroups() == null) ? 0 : getTrendGroups().hashCode());
        return hashCode;
    }

    @Override
    public KPIFieldWells clone() {
        try {
            return (KPIFieldWells) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.KPIFieldWellsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
