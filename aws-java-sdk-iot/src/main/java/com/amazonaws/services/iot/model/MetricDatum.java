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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A metric.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricDatum implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time the metric value was reported.
     * </p>
     */
    private java.util.Date timestamp;
    /**
     * <p>
     * The value reported for the metric.
     * </p>
     */
    private MetricValue value;

    /**
     * <p>
     * The time the metric value was reported.
     * </p>
     * 
     * @param timestamp
     *        The time the metric value was reported.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The time the metric value was reported.
     * </p>
     * 
     * @return The time the metric value was reported.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The time the metric value was reported.
     * </p>
     * 
     * @param timestamp
     *        The time the metric value was reported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDatum withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * The value reported for the metric.
     * </p>
     * 
     * @param value
     *        The value reported for the metric.
     */

    public void setValue(MetricValue value) {
        this.value = value;
    }

    /**
     * <p>
     * The value reported for the metric.
     * </p>
     * 
     * @return The value reported for the metric.
     */

    public MetricValue getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value reported for the metric.
     * </p>
     * 
     * @param value
     *        The value reported for the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricDatum withValue(MetricValue value) {
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
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
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

        if (obj instanceof MetricDatum == false)
            return false;
        MetricDatum other = (MetricDatum) obj;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
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

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public MetricDatum clone() {
        try {
            return (MetricDatum) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.MetricDatumMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
