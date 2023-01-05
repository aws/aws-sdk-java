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
 * The field well configuration of a histogram.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/HistogramAggregatedFieldWells"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HistogramAggregatedFieldWells implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value field wells of a histogram. Values are aggregated by <code>COUNT</code> or <code>DISTINCT_COUNT</code>.
     * </p>
     */
    private java.util.List<MeasureField> values;

    /**
     * <p>
     * The value field wells of a histogram. Values are aggregated by <code>COUNT</code> or <code>DISTINCT_COUNT</code>.
     * </p>
     * 
     * @return The value field wells of a histogram. Values are aggregated by <code>COUNT</code> or
     *         <code>DISTINCT_COUNT</code>.
     */

    public java.util.List<MeasureField> getValues() {
        return values;
    }

    /**
     * <p>
     * The value field wells of a histogram. Values are aggregated by <code>COUNT</code> or <code>DISTINCT_COUNT</code>.
     * </p>
     * 
     * @param values
     *        The value field wells of a histogram. Values are aggregated by <code>COUNT</code> or
     *        <code>DISTINCT_COUNT</code>.
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
     * The value field wells of a histogram. Values are aggregated by <code>COUNT</code> or <code>DISTINCT_COUNT</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The value field wells of a histogram. Values are aggregated by <code>COUNT</code> or
     *        <code>DISTINCT_COUNT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistogramAggregatedFieldWells withValues(MeasureField... values) {
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
     * The value field wells of a histogram. Values are aggregated by <code>COUNT</code> or <code>DISTINCT_COUNT</code>.
     * </p>
     * 
     * @param values
     *        The value field wells of a histogram. Values are aggregated by <code>COUNT</code> or
     *        <code>DISTINCT_COUNT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistogramAggregatedFieldWells withValues(java.util.Collection<MeasureField> values) {
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

        if (obj instanceof HistogramAggregatedFieldWells == false)
            return false;
        HistogramAggregatedFieldWells other = (HistogramAggregatedFieldWells) obj;
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

        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public HistogramAggregatedFieldWells clone() {
        try {
            return (HistogramAggregatedFieldWells) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.HistogramAggregatedFieldWellsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
