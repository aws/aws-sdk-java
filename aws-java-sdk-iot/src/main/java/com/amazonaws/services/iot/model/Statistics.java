/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A map of key-value pairs for all supported statistics. Currently, only count is supported.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Statistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The count of things that match the query.
     * </p>
     */
    private Integer count;
    /**
     * <p>
     * The average of the aggregated field values.
     * </p>
     */
    private Double average;
    /**
     * <p>
     * The sum of the aggregated field values.
     * </p>
     */
    private Double sum;
    /**
     * <p>
     * The minimum aggregated field value.
     * </p>
     */
    private Double minimum;
    /**
     * <p>
     * The maximum aggregated field value.
     * </p>
     */
    private Double maximum;
    /**
     * <p>
     * The sum of the squares of the aggregated field values.
     * </p>
     */
    private Double sumOfSquares;
    /**
     * <p>
     * The variance of the aggregated field values.
     * </p>
     */
    private Double variance;
    /**
     * <p>
     * The standard deviation of the aggregated field values.
     * </p>
     */
    private Double stdDeviation;

    /**
     * <p>
     * The count of things that match the query.
     * </p>
     * 
     * @param count
     *        The count of things that match the query.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The count of things that match the query.
     * </p>
     * 
     * @return The count of things that match the query.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * The count of things that match the query.
     * </p>
     * 
     * @param count
     *        The count of things that match the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statistics withCount(Integer count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * The average of the aggregated field values.
     * </p>
     * 
     * @param average
     *        The average of the aggregated field values.
     */

    public void setAverage(Double average) {
        this.average = average;
    }

    /**
     * <p>
     * The average of the aggregated field values.
     * </p>
     * 
     * @return The average of the aggregated field values.
     */

    public Double getAverage() {
        return this.average;
    }

    /**
     * <p>
     * The average of the aggregated field values.
     * </p>
     * 
     * @param average
     *        The average of the aggregated field values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statistics withAverage(Double average) {
        setAverage(average);
        return this;
    }

    /**
     * <p>
     * The sum of the aggregated field values.
     * </p>
     * 
     * @param sum
     *        The sum of the aggregated field values.
     */

    public void setSum(Double sum) {
        this.sum = sum;
    }

    /**
     * <p>
     * The sum of the aggregated field values.
     * </p>
     * 
     * @return The sum of the aggregated field values.
     */

    public Double getSum() {
        return this.sum;
    }

    /**
     * <p>
     * The sum of the aggregated field values.
     * </p>
     * 
     * @param sum
     *        The sum of the aggregated field values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statistics withSum(Double sum) {
        setSum(sum);
        return this;
    }

    /**
     * <p>
     * The minimum aggregated field value.
     * </p>
     * 
     * @param minimum
     *        The minimum aggregated field value.
     */

    public void setMinimum(Double minimum) {
        this.minimum = minimum;
    }

    /**
     * <p>
     * The minimum aggregated field value.
     * </p>
     * 
     * @return The minimum aggregated field value.
     */

    public Double getMinimum() {
        return this.minimum;
    }

    /**
     * <p>
     * The minimum aggregated field value.
     * </p>
     * 
     * @param minimum
     *        The minimum aggregated field value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statistics withMinimum(Double minimum) {
        setMinimum(minimum);
        return this;
    }

    /**
     * <p>
     * The maximum aggregated field value.
     * </p>
     * 
     * @param maximum
     *        The maximum aggregated field value.
     */

    public void setMaximum(Double maximum) {
        this.maximum = maximum;
    }

    /**
     * <p>
     * The maximum aggregated field value.
     * </p>
     * 
     * @return The maximum aggregated field value.
     */

    public Double getMaximum() {
        return this.maximum;
    }

    /**
     * <p>
     * The maximum aggregated field value.
     * </p>
     * 
     * @param maximum
     *        The maximum aggregated field value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statistics withMaximum(Double maximum) {
        setMaximum(maximum);
        return this;
    }

    /**
     * <p>
     * The sum of the squares of the aggregated field values.
     * </p>
     * 
     * @param sumOfSquares
     *        The sum of the squares of the aggregated field values.
     */

    public void setSumOfSquares(Double sumOfSquares) {
        this.sumOfSquares = sumOfSquares;
    }

    /**
     * <p>
     * The sum of the squares of the aggregated field values.
     * </p>
     * 
     * @return The sum of the squares of the aggregated field values.
     */

    public Double getSumOfSquares() {
        return this.sumOfSquares;
    }

    /**
     * <p>
     * The sum of the squares of the aggregated field values.
     * </p>
     * 
     * @param sumOfSquares
     *        The sum of the squares of the aggregated field values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statistics withSumOfSquares(Double sumOfSquares) {
        setSumOfSquares(sumOfSquares);
        return this;
    }

    /**
     * <p>
     * The variance of the aggregated field values.
     * </p>
     * 
     * @param variance
     *        The variance of the aggregated field values.
     */

    public void setVariance(Double variance) {
        this.variance = variance;
    }

    /**
     * <p>
     * The variance of the aggregated field values.
     * </p>
     * 
     * @return The variance of the aggregated field values.
     */

    public Double getVariance() {
        return this.variance;
    }

    /**
     * <p>
     * The variance of the aggregated field values.
     * </p>
     * 
     * @param variance
     *        The variance of the aggregated field values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statistics withVariance(Double variance) {
        setVariance(variance);
        return this;
    }

    /**
     * <p>
     * The standard deviation of the aggregated field values.
     * </p>
     * 
     * @param stdDeviation
     *        The standard deviation of the aggregated field values.
     */

    public void setStdDeviation(Double stdDeviation) {
        this.stdDeviation = stdDeviation;
    }

    /**
     * <p>
     * The standard deviation of the aggregated field values.
     * </p>
     * 
     * @return The standard deviation of the aggregated field values.
     */

    public Double getStdDeviation() {
        return this.stdDeviation;
    }

    /**
     * <p>
     * The standard deviation of the aggregated field values.
     * </p>
     * 
     * @param stdDeviation
     *        The standard deviation of the aggregated field values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statistics withStdDeviation(Double stdDeviation) {
        setStdDeviation(stdDeviation);
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
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getAverage() != null)
            sb.append("Average: ").append(getAverage()).append(",");
        if (getSum() != null)
            sb.append("Sum: ").append(getSum()).append(",");
        if (getMinimum() != null)
            sb.append("Minimum: ").append(getMinimum()).append(",");
        if (getMaximum() != null)
            sb.append("Maximum: ").append(getMaximum()).append(",");
        if (getSumOfSquares() != null)
            sb.append("SumOfSquares: ").append(getSumOfSquares()).append(",");
        if (getVariance() != null)
            sb.append("Variance: ").append(getVariance()).append(",");
        if (getStdDeviation() != null)
            sb.append("StdDeviation: ").append(getStdDeviation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Statistics == false)
            return false;
        Statistics other = (Statistics) obj;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getAverage() == null ^ this.getAverage() == null)
            return false;
        if (other.getAverage() != null && other.getAverage().equals(this.getAverage()) == false)
            return false;
        if (other.getSum() == null ^ this.getSum() == null)
            return false;
        if (other.getSum() != null && other.getSum().equals(this.getSum()) == false)
            return false;
        if (other.getMinimum() == null ^ this.getMinimum() == null)
            return false;
        if (other.getMinimum() != null && other.getMinimum().equals(this.getMinimum()) == false)
            return false;
        if (other.getMaximum() == null ^ this.getMaximum() == null)
            return false;
        if (other.getMaximum() != null && other.getMaximum().equals(this.getMaximum()) == false)
            return false;
        if (other.getSumOfSquares() == null ^ this.getSumOfSquares() == null)
            return false;
        if (other.getSumOfSquares() != null && other.getSumOfSquares().equals(this.getSumOfSquares()) == false)
            return false;
        if (other.getVariance() == null ^ this.getVariance() == null)
            return false;
        if (other.getVariance() != null && other.getVariance().equals(this.getVariance()) == false)
            return false;
        if (other.getStdDeviation() == null ^ this.getStdDeviation() == null)
            return false;
        if (other.getStdDeviation() != null && other.getStdDeviation().equals(this.getStdDeviation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getAverage() == null) ? 0 : getAverage().hashCode());
        hashCode = prime * hashCode + ((getSum() == null) ? 0 : getSum().hashCode());
        hashCode = prime * hashCode + ((getMinimum() == null) ? 0 : getMinimum().hashCode());
        hashCode = prime * hashCode + ((getMaximum() == null) ? 0 : getMaximum().hashCode());
        hashCode = prime * hashCode + ((getSumOfSquares() == null) ? 0 : getSumOfSquares().hashCode());
        hashCode = prime * hashCode + ((getVariance() == null) ? 0 : getVariance().hashCode());
        hashCode = prime * hashCode + ((getStdDeviation() == null) ? 0 : getStdDeviation().hashCode());
        return hashCode;
    }

    @Override
    public Statistics clone() {
        try {
            return (Statistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.StatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
