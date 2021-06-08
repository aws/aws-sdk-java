/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codeguruprofiler.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a frame metric and its values.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/FrameMetricDatum" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FrameMetricDatum implements Serializable, Cloneable, StructuredPojo {

    private FrameMetric frameMetric;
    /**
     * <p>
     * A list of values that are associated with a frame metric.
     * </p>
     */
    private java.util.List<Double> values;

    /**
     * @param frameMetric
     */

    public void setFrameMetric(FrameMetric frameMetric) {
        this.frameMetric = frameMetric;
    }

    /**
     * @return
     */

    public FrameMetric getFrameMetric() {
        return this.frameMetric;
    }

    /**
     * @param frameMetric
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FrameMetricDatum withFrameMetric(FrameMetric frameMetric) {
        setFrameMetric(frameMetric);
        return this;
    }

    /**
     * <p>
     * A list of values that are associated with a frame metric.
     * </p>
     * 
     * @return A list of values that are associated with a frame metric.
     */

    public java.util.List<Double> getValues() {
        return values;
    }

    /**
     * <p>
     * A list of values that are associated with a frame metric.
     * </p>
     * 
     * @param values
     *        A list of values that are associated with a frame metric.
     */

    public void setValues(java.util.Collection<Double> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<Double>(values);
    }

    /**
     * <p>
     * A list of values that are associated with a frame metric.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        A list of values that are associated with a frame metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FrameMetricDatum withValues(Double... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<Double>(values.length));
        }
        for (Double ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of values that are associated with a frame metric.
     * </p>
     * 
     * @param values
     *        A list of values that are associated with a frame metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FrameMetricDatum withValues(java.util.Collection<Double> values) {
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
        if (getFrameMetric() != null)
            sb.append("FrameMetric: ").append(getFrameMetric()).append(",");
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

        if (obj instanceof FrameMetricDatum == false)
            return false;
        FrameMetricDatum other = (FrameMetricDatum) obj;
        if (other.getFrameMetric() == null ^ this.getFrameMetric() == null)
            return false;
        if (other.getFrameMetric() != null && other.getFrameMetric().equals(this.getFrameMetric()) == false)
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

        hashCode = prime * hashCode + ((getFrameMetric() == null) ? 0 : getFrameMetric().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public FrameMetricDatum clone() {
        try {
            return (FrameMetricDatum) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codeguruprofiler.model.transform.FrameMetricDatumMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
