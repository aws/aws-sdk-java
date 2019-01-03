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
 * A <code>CurrentMetricData</code> object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/CurrentMetricData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CurrentMetricData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The metric in a <code>CurrentMetricData</code> object.
     * </p>
     */
    private CurrentMetric metric;
    /**
     * <p>
     * The value of the metric in the CurrentMetricData object.
     * </p>
     */
    private Double value;

    /**
     * <p>
     * The metric in a <code>CurrentMetricData</code> object.
     * </p>
     * 
     * @param metric
     *        The metric in a <code>CurrentMetricData</code> object.
     */

    public void setMetric(CurrentMetric metric) {
        this.metric = metric;
    }

    /**
     * <p>
     * The metric in a <code>CurrentMetricData</code> object.
     * </p>
     * 
     * @return The metric in a <code>CurrentMetricData</code> object.
     */

    public CurrentMetric getMetric() {
        return this.metric;
    }

    /**
     * <p>
     * The metric in a <code>CurrentMetricData</code> object.
     * </p>
     * 
     * @param metric
     *        The metric in a <code>CurrentMetricData</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CurrentMetricData withMetric(CurrentMetric metric) {
        setMetric(metric);
        return this;
    }

    /**
     * <p>
     * The value of the metric in the CurrentMetricData object.
     * </p>
     * 
     * @param value
     *        The value of the metric in the CurrentMetricData object.
     */

    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the metric in the CurrentMetricData object.
     * </p>
     * 
     * @return The value of the metric in the CurrentMetricData object.
     */

    public Double getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the metric in the CurrentMetricData object.
     * </p>
     * 
     * @param value
     *        The value of the metric in the CurrentMetricData object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CurrentMetricData withValue(Double value) {
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

        if (obj instanceof CurrentMetricData == false)
            return false;
        CurrentMetricData other = (CurrentMetricData) obj;
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
    public CurrentMetricData clone() {
        try {
            return (CurrentMetricData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.CurrentMetricDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
