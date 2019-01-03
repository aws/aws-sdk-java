/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A <code>HistoricalMetricData</code> object than contains a <code>Metric</code> and a <code>Value</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/HistoricalMetricData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HistoricalMetricData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A <code>HistoricalMetric</code> object.
     * </p>
     */
    private HistoricalMetric metric;
    /**
     * <p>
     * The <code>Value</code> of the metric.
     * </p>
     */
    private Double value;

    /**
     * <p>
     * A <code>HistoricalMetric</code> object.
     * </p>
     * 
     * @param metric
     *        A <code>HistoricalMetric</code> object.
     */

    public void setMetric(HistoricalMetric metric) {
        this.metric = metric;
    }

    /**
     * <p>
     * A <code>HistoricalMetric</code> object.
     * </p>
     * 
     * @return A <code>HistoricalMetric</code> object.
     */

    public HistoricalMetric getMetric() {
        return this.metric;
    }

    /**
     * <p>
     * A <code>HistoricalMetric</code> object.
     * </p>
     * 
     * @param metric
     *        A <code>HistoricalMetric</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoricalMetricData withMetric(HistoricalMetric metric) {
        setMetric(metric);
        return this;
    }

    /**
     * <p>
     * The <code>Value</code> of the metric.
     * </p>
     * 
     * @param value
     *        The <code>Value</code> of the metric.
     */

    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * <p>
     * The <code>Value</code> of the metric.
     * </p>
     * 
     * @return The <code>Value</code> of the metric.
     */

    public Double getValue() {
        return this.value;
    }

    /**
     * <p>
     * The <code>Value</code> of the metric.
     * </p>
     * 
     * @param value
     *        The <code>Value</code> of the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoricalMetricData withValue(Double value) {
        setValue(value);
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
        if (getMetric() != null)
            sb.append("Metric: ").append(getMetric()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HistoricalMetricData == false)
            return false;
        HistoricalMetricData other = (HistoricalMetricData) obj;
        if (other.getMetric() == null ^ this.getMetric() == null)
            return false;
        if (other.getMetric() != null && other.getMetric().equals(this.getMetric()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetric() == null) ? 0 : getMetric().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public HistoricalMetricData clone() {
        try {
            return (HistoricalMetricData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.HistoricalMetricDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
