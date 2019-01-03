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
package com.amazonaws.services.pi.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A time-ordered series of data points, correpsonding to a dimension of a Performance Insights metric.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/MetricKeyDataPoints" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricKeyDataPoints implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The dimension(s) to which the data points apply.
     * </p>
     */
    private ResponseResourceMetricKey key;
    /**
     * <p>
     * An array of timestamp-value pairs, representing measurements over a period of time.
     * </p>
     */
    private java.util.List<DataPoint> dataPoints;

    /**
     * <p>
     * The dimension(s) to which the data points apply.
     * </p>
     * 
     * @param key
     *        The dimension(s) to which the data points apply.
     */

    public void setKey(ResponseResourceMetricKey key) {
        this.key = key;
    }

    /**
     * <p>
     * The dimension(s) to which the data points apply.
     * </p>
     * 
     * @return The dimension(s) to which the data points apply.
     */

    public ResponseResourceMetricKey getKey() {
        return this.key;
    }

    /**
     * <p>
     * The dimension(s) to which the data points apply.
     * </p>
     * 
     * @param key
     *        The dimension(s) to which the data points apply.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricKeyDataPoints withKey(ResponseResourceMetricKey key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * An array of timestamp-value pairs, representing measurements over a period of time.
     * </p>
     * 
     * @return An array of timestamp-value pairs, representing measurements over a period of time.
     */

    public java.util.List<DataPoint> getDataPoints() {
        return dataPoints;
    }

    /**
     * <p>
     * An array of timestamp-value pairs, representing measurements over a period of time.
     * </p>
     * 
     * @param dataPoints
     *        An array of timestamp-value pairs, representing measurements over a period of time.
     */

    public void setDataPoints(java.util.Collection<DataPoint> dataPoints) {
        if (dataPoints == null) {
            this.dataPoints = null;
            return;
        }

        this.dataPoints = new java.util.ArrayList<DataPoint>(dataPoints);
    }

    /**
     * <p>
     * An array of timestamp-value pairs, representing measurements over a period of time.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataPoints(java.util.Collection)} or {@link #withDataPoints(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dataPoints
     *        An array of timestamp-value pairs, representing measurements over a period of time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricKeyDataPoints withDataPoints(DataPoint... dataPoints) {
        if (this.dataPoints == null) {
            setDataPoints(new java.util.ArrayList<DataPoint>(dataPoints.length));
        }
        for (DataPoint ele : dataPoints) {
            this.dataPoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of timestamp-value pairs, representing measurements over a period of time.
     * </p>
     * 
     * @param dataPoints
     *        An array of timestamp-value pairs, representing measurements over a period of time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetricKeyDataPoints withDataPoints(java.util.Collection<DataPoint> dataPoints) {
        setDataPoints(dataPoints);
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getDataPoints() != null)
            sb.append("DataPoints: ").append(getDataPoints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricKeyDataPoints == false)
            return false;
        MetricKeyDataPoints other = (MetricKeyDataPoints) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getDataPoints() == null ^ this.getDataPoints() == null)
            return false;
        if (other.getDataPoints() != null && other.getDataPoints().equals(this.getDataPoints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getDataPoints() == null) ? 0 : getDataPoints().hashCode());
        return hashCode;
    }

    @Override
    public MetricKeyDataPoints clone() {
        try {
            return (MetricKeyDataPoints) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pi.model.transform.MetricKeyDataPointsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
