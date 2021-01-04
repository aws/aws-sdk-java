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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the (pre-calculated) aggregate values for an asset property.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/Aggregates" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Aggregates implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The average (mean) value of the time series over a time interval window.
     * </p>
     */
    private Double average;
    /**
     * <p>
     * The count of data points in the time series over a time interval window.
     * </p>
     */
    private Double count;
    /**
     * <p>
     * The maximum value of the time series over a time interval window.
     * </p>
     */
    private Double maximum;
    /**
     * <p>
     * The minimum value of the time series over a time interval window.
     * </p>
     */
    private Double minimum;
    /**
     * <p>
     * The sum of the time series over a time interval window.
     * </p>
     */
    private Double sum;
    /**
     * <p>
     * The standard deviation of the time series over a time interval window.
     * </p>
     */
    private Double standardDeviation;

    /**
     * <p>
     * The average (mean) value of the time series over a time interval window.
     * </p>
     * 
     * @param average
     *        The average (mean) value of the time series over a time interval window.
     */

    public void setAverage(Double average) {
        this.average = average;
    }

    /**
     * <p>
     * The average (mean) value of the time series over a time interval window.
     * </p>
     * 
     * @return The average (mean) value of the time series over a time interval window.
     */

    public Double getAverage() {
        return this.average;
    }

    /**
     * <p>
     * The average (mean) value of the time series over a time interval window.
     * </p>
     * 
     * @param average
     *        The average (mean) value of the time series over a time interval window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Aggregates withAverage(Double average) {
        setAverage(average);
        return this;
    }

    /**
     * <p>
     * The count of data points in the time series over a time interval window.
     * </p>
     * 
     * @param count
     *        The count of data points in the time series over a time interval window.
     */

    public void setCount(Double count) {
        this.count = count;
    }

    /**
     * <p>
     * The count of data points in the time series over a time interval window.
     * </p>
     * 
     * @return The count of data points in the time series over a time interval window.
     */

    public Double getCount() {
        return this.count;
    }

    /**
     * <p>
     * The count of data points in the time series over a time interval window.
     * </p>
     * 
     * @param count
     *        The count of data points in the time series over a time interval window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Aggregates withCount(Double count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * The maximum value of the time series over a time interval window.
     * </p>
     * 
     * @param maximum
     *        The maximum value of the time series over a time interval window.
     */

    public void setMaximum(Double maximum) {
        this.maximum = maximum;
    }

    /**
     * <p>
     * The maximum value of the time series over a time interval window.
     * </p>
     * 
     * @return The maximum value of the time series over a time interval window.
     */

    public Double getMaximum() {
        return this.maximum;
    }

    /**
     * <p>
     * The maximum value of the time series over a time interval window.
     * </p>
     * 
     * @param maximum
     *        The maximum value of the time series over a time interval window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Aggregates withMaximum(Double maximum) {
        setMaximum(maximum);
        return this;
    }

    /**
     * <p>
     * The minimum value of the time series over a time interval window.
     * </p>
     * 
     * @param minimum
     *        The minimum value of the time series over a time interval window.
     */

    public void setMinimum(Double minimum) {
        this.minimum = minimum;
    }

    /**
     * <p>
     * The minimum value of the time series over a time interval window.
     * </p>
     * 
     * @return The minimum value of the time series over a time interval window.
     */

    public Double getMinimum() {
        return this.minimum;
    }

    /**
     * <p>
     * The minimum value of the time series over a time interval window.
     * </p>
     * 
     * @param minimum
     *        The minimum value of the time series over a time interval window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Aggregates withMinimum(Double minimum) {
        setMinimum(minimum);
        return this;
    }

    /**
     * <p>
     * The sum of the time series over a time interval window.
     * </p>
     * 
     * @param sum
     *        The sum of the time series over a time interval window.
     */

    public void setSum(Double sum) {
        this.sum = sum;
    }

    /**
     * <p>
     * The sum of the time series over a time interval window.
     * </p>
     * 
     * @return The sum of the time series over a time interval window.
     */

    public Double getSum() {
        return this.sum;
    }

    /**
     * <p>
     * The sum of the time series over a time interval window.
     * </p>
     * 
     * @param sum
     *        The sum of the time series over a time interval window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Aggregates withSum(Double sum) {
        setSum(sum);
        return this;
    }

    /**
     * <p>
     * The standard deviation of the time series over a time interval window.
     * </p>
     * 
     * @param standardDeviation
     *        The standard deviation of the time series over a time interval window.
     */

    public void setStandardDeviation(Double standardDeviation) {
        this.standardDeviation = standardDeviation;
    }

    /**
     * <p>
     * The standard deviation of the time series over a time interval window.
     * </p>
     * 
     * @return The standard deviation of the time series over a time interval window.
     */

    public Double getStandardDeviation() {
        return this.standardDeviation;
    }

    /**
     * <p>
     * The standard deviation of the time series over a time interval window.
     * </p>
     * 
     * @param standardDeviation
     *        The standard deviation of the time series over a time interval window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Aggregates withStandardDeviation(Double standardDeviation) {
        setStandardDeviation(standardDeviation);
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
        if (getAverage() != null)
            sb.append("Average: ").append(getAverage()).append(",");
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getMaximum() != null)
            sb.append("Maximum: ").append(getMaximum()).append(",");
        if (getMinimum() != null)
            sb.append("Minimum: ").append(getMinimum()).append(",");
        if (getSum() != null)
            sb.append("Sum: ").append(getSum()).append(",");
        if (getStandardDeviation() != null)
            sb.append("StandardDeviation: ").append(getStandardDeviation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Aggregates == false)
            return false;
        Aggregates other = (Aggregates) obj;
        if (other.getAverage() == null ^ this.getAverage() == null)
            return false;
        if (other.getAverage() != null && other.getAverage().equals(this.getAverage()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getMaximum() == null ^ this.getMaximum() == null)
            return false;
        if (other.getMaximum() != null && other.getMaximum().equals(this.getMaximum()) == false)
            return false;
        if (other.getMinimum() == null ^ this.getMinimum() == null)
            return false;
        if (other.getMinimum() != null && other.getMinimum().equals(this.getMinimum()) == false)
            return false;
        if (other.getSum() == null ^ this.getSum() == null)
            return false;
        if (other.getSum() != null && other.getSum().equals(this.getSum()) == false)
            return false;
        if (other.getStandardDeviation() == null ^ this.getStandardDeviation() == null)
            return false;
        if (other.getStandardDeviation() != null && other.getStandardDeviation().equals(this.getStandardDeviation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAverage() == null) ? 0 : getAverage().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getMaximum() == null) ? 0 : getMaximum().hashCode());
        hashCode = prime * hashCode + ((getMinimum() == null) ? 0 : getMinimum().hashCode());
        hashCode = prime * hashCode + ((getSum() == null) ? 0 : getSum().hashCode());
        hashCode = prime * hashCode + ((getStandardDeviation() == null) ? 0 : getStandardDeviation().hashCode());
        return hashCode;
    }

    @Override
    public Aggregates clone() {
        try {
            return (Aggregates) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.AggregatesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
