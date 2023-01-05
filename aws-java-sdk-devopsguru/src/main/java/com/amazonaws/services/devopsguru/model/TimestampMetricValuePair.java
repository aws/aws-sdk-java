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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A pair that contains metric values at the respective timestamp.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/TimestampMetricValuePair"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimestampMetricValuePair implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A <code>Timestamp</code> that specifies the time the event occurred.
     * </p>
     */
    private java.util.Date timestamp;
    /**
     * <p>
     * Value of the anomalous metric data point at respective Timestamp.
     * </p>
     */
    private Double metricValue;

    /**
     * <p>
     * A <code>Timestamp</code> that specifies the time the event occurred.
     * </p>
     * 
     * @param timestamp
     *        A <code>Timestamp</code> that specifies the time the event occurred.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * A <code>Timestamp</code> that specifies the time the event occurred.
     * </p>
     * 
     * @return A <code>Timestamp</code> that specifies the time the event occurred.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * A <code>Timestamp</code> that specifies the time the event occurred.
     * </p>
     * 
     * @param timestamp
     *        A <code>Timestamp</code> that specifies the time the event occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimestampMetricValuePair withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * Value of the anomalous metric data point at respective Timestamp.
     * </p>
     * 
     * @param metricValue
     *        Value of the anomalous metric data point at respective Timestamp.
     */

    public void setMetricValue(Double metricValue) {
        this.metricValue = metricValue;
    }

    /**
     * <p>
     * Value of the anomalous metric data point at respective Timestamp.
     * </p>
     * 
     * @return Value of the anomalous metric data point at respective Timestamp.
     */

    public Double getMetricValue() {
        return this.metricValue;
    }

    /**
     * <p>
     * Value of the anomalous metric data point at respective Timestamp.
     * </p>
     * 
     * @param metricValue
     *        Value of the anomalous metric data point at respective Timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimestampMetricValuePair withMetricValue(Double metricValue) {
        setMetricValue(metricValue);
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
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
        if (getMetricValue() != null)
            sb.append("MetricValue: ").append(getMetricValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimestampMetricValuePair == false)
            return false;
        TimestampMetricValuePair other = (TimestampMetricValuePair) obj;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getMetricValue() == null ^ this.getMetricValue() == null)
            return false;
        if (other.getMetricValue() != null && other.getMetricValue().equals(this.getMetricValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getMetricValue() == null) ? 0 : getMetricValue().hashCode());
        return hashCode;
    }

    @Override
    public TimestampMetricValuePair clone() {
        try {
            return (TimestampMetricValuePair) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.TimestampMetricValuePairMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
