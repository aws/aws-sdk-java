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
package com.amazonaws.services.timestreamquery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The timeseries datatype represents the values of a measure over time. A time series is an array of rows of timestamps
 * and measure values, with rows sorted in ascending order of time. A TimeSeriesDataPoint is a single data point in the
 * timeseries. It represents a tuple of (time, measure value) in a timeseries.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/TimeSeriesDataPoint"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimeSeriesDataPoint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The timestamp when the measure value was collected.
     * </p>
     */
    private String time;
    /**
     * <p>
     * The measure value for the data point.
     * </p>
     */
    private Datum value;

    /**
     * <p>
     * The timestamp when the measure value was collected.
     * </p>
     * 
     * @param time
     *        The timestamp when the measure value was collected.
     */

    public void setTime(String time) {
        this.time = time;
    }

    /**
     * <p>
     * The timestamp when the measure value was collected.
     * </p>
     * 
     * @return The timestamp when the measure value was collected.
     */

    public String getTime() {
        return this.time;
    }

    /**
     * <p>
     * The timestamp when the measure value was collected.
     * </p>
     * 
     * @param time
     *        The timestamp when the measure value was collected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesDataPoint withTime(String time) {
        setTime(time);
        return this;
    }

    /**
     * <p>
     * The measure value for the data point.
     * </p>
     * 
     * @param value
     *        The measure value for the data point.
     */

    public void setValue(Datum value) {
        this.value = value;
    }

    /**
     * <p>
     * The measure value for the data point.
     * </p>
     * 
     * @return The measure value for the data point.
     */

    public Datum getValue() {
        return this.value;
    }

    /**
     * <p>
     * The measure value for the data point.
     * </p>
     * 
     * @param value
     *        The measure value for the data point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSeriesDataPoint withValue(Datum value) {
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
        if (getTime() != null)
            sb.append("Time: ").append(getTime()).append(",");
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

        if (obj instanceof TimeSeriesDataPoint == false)
            return false;
        TimeSeriesDataPoint other = (TimeSeriesDataPoint) obj;
        if (other.getTime() == null ^ this.getTime() == null)
            return false;
        if (other.getTime() != null && other.getTime().equals(this.getTime()) == false)
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

        hashCode = prime * hashCode + ((getTime() == null) ? 0 : getTime().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public TimeSeriesDataPoint clone() {
        try {
            return (TimeSeriesDataPoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamquery.model.transform.TimeSeriesDataPointMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
