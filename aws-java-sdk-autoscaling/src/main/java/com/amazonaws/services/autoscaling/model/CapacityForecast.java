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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A <code>GetPredictiveScalingForecast</code> call returns the capacity forecast for a predictive scaling policy. This
 * structure includes the data points for that capacity forecast, along with the timestamps of those data points.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/CapacityForecast" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CapacityForecast implements Serializable, Cloneable {

    /**
     * <p>
     * The time stamps for the data points, in UTC format.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<java.util.Date> timestamps;
    /**
     * <p>
     * The values of the data points.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Double> values;

    /**
     * <p>
     * The time stamps for the data points, in UTC format.
     * </p>
     * 
     * @return The time stamps for the data points, in UTC format.
     */

    public java.util.List<java.util.Date> getTimestamps() {
        if (timestamps == null) {
            timestamps = new com.amazonaws.internal.SdkInternalList<java.util.Date>();
        }
        return timestamps;
    }

    /**
     * <p>
     * The time stamps for the data points, in UTC format.
     * </p>
     * 
     * @param timestamps
     *        The time stamps for the data points, in UTC format.
     */

    public void setTimestamps(java.util.Collection<java.util.Date> timestamps) {
        if (timestamps == null) {
            this.timestamps = null;
            return;
        }

        this.timestamps = new com.amazonaws.internal.SdkInternalList<java.util.Date>(timestamps);
    }

    /**
     * <p>
     * The time stamps for the data points, in UTC format.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTimestamps(java.util.Collection)} or {@link #withTimestamps(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param timestamps
     *        The time stamps for the data points, in UTC format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityForecast withTimestamps(java.util.Date... timestamps) {
        if (this.timestamps == null) {
            setTimestamps(new com.amazonaws.internal.SdkInternalList<java.util.Date>(timestamps.length));
        }
        for (java.util.Date ele : timestamps) {
            this.timestamps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The time stamps for the data points, in UTC format.
     * </p>
     * 
     * @param timestamps
     *        The time stamps for the data points, in UTC format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityForecast withTimestamps(java.util.Collection<java.util.Date> timestamps) {
        setTimestamps(timestamps);
        return this;
    }

    /**
     * <p>
     * The values of the data points.
     * </p>
     * 
     * @return The values of the data points.
     */

    public java.util.List<Double> getValues() {
        if (values == null) {
            values = new com.amazonaws.internal.SdkInternalList<Double>();
        }
        return values;
    }

    /**
     * <p>
     * The values of the data points.
     * </p>
     * 
     * @param values
     *        The values of the data points.
     */

    public void setValues(java.util.Collection<Double> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new com.amazonaws.internal.SdkInternalList<Double>(values);
    }

    /**
     * <p>
     * The values of the data points.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The values of the data points.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityForecast withValues(Double... values) {
        if (this.values == null) {
            setValues(new com.amazonaws.internal.SdkInternalList<Double>(values.length));
        }
        for (Double ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The values of the data points.
     * </p>
     * 
     * @param values
     *        The values of the data points.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityForecast withValues(java.util.Collection<Double> values) {
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
        if (getTimestamps() != null)
            sb.append("Timestamps: ").append(getTimestamps()).append(",");
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

        if (obj instanceof CapacityForecast == false)
            return false;
        CapacityForecast other = (CapacityForecast) obj;
        if (other.getTimestamps() == null ^ this.getTimestamps() == null)
            return false;
        if (other.getTimestamps() != null && other.getTimestamps().equals(this.getTimestamps()) == false)
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

        hashCode = prime * hashCode + ((getTimestamps() == null) ? 0 : getTimestamps().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public CapacityForecast clone() {
        try {
            return (CapacityForecast) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
