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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Encapsulates the statistical data that CloudWatch computes from metric data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/Datapoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Datapoint implements Serializable, Cloneable {

    /**
     * <p>
     * The time stamp used for the data point.
     * </p>
     */
    private java.util.Date timestamp;
    /**
     * <p>
     * The number of metric values that contributed to the aggregate value of this data point.
     * </p>
     */
    private Double sampleCount;
    /**
     * <p>
     * The average of the metric values that correspond to the data point.
     * </p>
     */
    private Double average;
    /**
     * <p>
     * The sum of the metric values for the data point.
     * </p>
     */
    private Double sum;
    /**
     * <p>
     * The minimum metric value for the data point.
     * </p>
     */
    private Double minimum;
    /**
     * <p>
     * The maximum metric value for the data point.
     * </p>
     */
    private Double maximum;
    /**
     * <p>
     * The standard unit for the data point.
     * </p>
     */
    private String unit;
    /**
     * <p>
     * The percentile statistic for the data point.
     * </p>
     */
    private java.util.Map<String, Double> extendedStatistics;

    /**
     * <p>
     * The time stamp used for the data point.
     * </p>
     * 
     * @param timestamp
     *        The time stamp used for the data point.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The time stamp used for the data point.
     * </p>
     * 
     * @return The time stamp used for the data point.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The time stamp used for the data point.
     * </p>
     * 
     * @param timestamp
     *        The time stamp used for the data point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Datapoint withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * The number of metric values that contributed to the aggregate value of this data point.
     * </p>
     * 
     * @param sampleCount
     *        The number of metric values that contributed to the aggregate value of this data point.
     */

    public void setSampleCount(Double sampleCount) {
        this.sampleCount = sampleCount;
    }

    /**
     * <p>
     * The number of metric values that contributed to the aggregate value of this data point.
     * </p>
     * 
     * @return The number of metric values that contributed to the aggregate value of this data point.
     */

    public Double getSampleCount() {
        return this.sampleCount;
    }

    /**
     * <p>
     * The number of metric values that contributed to the aggregate value of this data point.
     * </p>
     * 
     * @param sampleCount
     *        The number of metric values that contributed to the aggregate value of this data point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Datapoint withSampleCount(Double sampleCount) {
        setSampleCount(sampleCount);
        return this;
    }

    /**
     * <p>
     * The average of the metric values that correspond to the data point.
     * </p>
     * 
     * @param average
     *        The average of the metric values that correspond to the data point.
     */

    public void setAverage(Double average) {
        this.average = average;
    }

    /**
     * <p>
     * The average of the metric values that correspond to the data point.
     * </p>
     * 
     * @return The average of the metric values that correspond to the data point.
     */

    public Double getAverage() {
        return this.average;
    }

    /**
     * <p>
     * The average of the metric values that correspond to the data point.
     * </p>
     * 
     * @param average
     *        The average of the metric values that correspond to the data point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Datapoint withAverage(Double average) {
        setAverage(average);
        return this;
    }

    /**
     * <p>
     * The sum of the metric values for the data point.
     * </p>
     * 
     * @param sum
     *        The sum of the metric values for the data point.
     */

    public void setSum(Double sum) {
        this.sum = sum;
    }

    /**
     * <p>
     * The sum of the metric values for the data point.
     * </p>
     * 
     * @return The sum of the metric values for the data point.
     */

    public Double getSum() {
        return this.sum;
    }

    /**
     * <p>
     * The sum of the metric values for the data point.
     * </p>
     * 
     * @param sum
     *        The sum of the metric values for the data point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Datapoint withSum(Double sum) {
        setSum(sum);
        return this;
    }

    /**
     * <p>
     * The minimum metric value for the data point.
     * </p>
     * 
     * @param minimum
     *        The minimum metric value for the data point.
     */

    public void setMinimum(Double minimum) {
        this.minimum = minimum;
    }

    /**
     * <p>
     * The minimum metric value for the data point.
     * </p>
     * 
     * @return The minimum metric value for the data point.
     */

    public Double getMinimum() {
        return this.minimum;
    }

    /**
     * <p>
     * The minimum metric value for the data point.
     * </p>
     * 
     * @param minimum
     *        The minimum metric value for the data point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Datapoint withMinimum(Double minimum) {
        setMinimum(minimum);
        return this;
    }

    /**
     * <p>
     * The maximum metric value for the data point.
     * </p>
     * 
     * @param maximum
     *        The maximum metric value for the data point.
     */

    public void setMaximum(Double maximum) {
        this.maximum = maximum;
    }

    /**
     * <p>
     * The maximum metric value for the data point.
     * </p>
     * 
     * @return The maximum metric value for the data point.
     */

    public Double getMaximum() {
        return this.maximum;
    }

    /**
     * <p>
     * The maximum metric value for the data point.
     * </p>
     * 
     * @param maximum
     *        The maximum metric value for the data point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Datapoint withMaximum(Double maximum) {
        setMaximum(maximum);
        return this;
    }

    /**
     * <p>
     * The standard unit for the data point.
     * </p>
     * 
     * @param unit
     *        The standard unit for the data point.
     * @see StandardUnit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The standard unit for the data point.
     * </p>
     * 
     * @return The standard unit for the data point.
     * @see StandardUnit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The standard unit for the data point.
     * </p>
     * 
     * @param unit
     *        The standard unit for the data point.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StandardUnit
     */

    public Datapoint withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * The standard unit for the data point.
     * </p>
     * 
     * @param unit
     *        The standard unit for the data point.
     * @see StandardUnit
     */

    public void setUnit(StandardUnit unit) {
        withUnit(unit);
    }

    /**
     * <p>
     * The standard unit for the data point.
     * </p>
     * 
     * @param unit
     *        The standard unit for the data point.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StandardUnit
     */

    public Datapoint withUnit(StandardUnit unit) {
        this.unit = unit.toString();
        return this;
    }

    /**
     * <p>
     * The percentile statistic for the data point.
     * </p>
     * 
     * @return The percentile statistic for the data point.
     */

    public java.util.Map<String, Double> getExtendedStatistics() {
        return extendedStatistics;
    }

    /**
     * <p>
     * The percentile statistic for the data point.
     * </p>
     * 
     * @param extendedStatistics
     *        The percentile statistic for the data point.
     */

    public void setExtendedStatistics(java.util.Map<String, Double> extendedStatistics) {
        this.extendedStatistics = extendedStatistics;
    }

    /**
     * <p>
     * The percentile statistic for the data point.
     * </p>
     * 
     * @param extendedStatistics
     *        The percentile statistic for the data point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Datapoint withExtendedStatistics(java.util.Map<String, Double> extendedStatistics) {
        setExtendedStatistics(extendedStatistics);
        return this;
    }

    public Datapoint addExtendedStatisticsEntry(String key, Double value) {
        if (null == this.extendedStatistics) {
            this.extendedStatistics = new java.util.HashMap<String, Double>();
        }
        if (this.extendedStatistics.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.extendedStatistics.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ExtendedStatistics.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Datapoint clearExtendedStatisticsEntries() {
        this.extendedStatistics = null;
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
        if (getSampleCount() != null)
            sb.append("SampleCount: ").append(getSampleCount()).append(",");
        if (getAverage() != null)
            sb.append("Average: ").append(getAverage()).append(",");
        if (getSum() != null)
            sb.append("Sum: ").append(getSum()).append(",");
        if (getMinimum() != null)
            sb.append("Minimum: ").append(getMinimum()).append(",");
        if (getMaximum() != null)
            sb.append("Maximum: ").append(getMaximum()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit()).append(",");
        if (getExtendedStatistics() != null)
            sb.append("ExtendedStatistics: ").append(getExtendedStatistics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Datapoint == false)
            return false;
        Datapoint other = (Datapoint) obj;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getSampleCount() == null ^ this.getSampleCount() == null)
            return false;
        if (other.getSampleCount() != null && other.getSampleCount().equals(this.getSampleCount()) == false)
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
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        if (other.getExtendedStatistics() == null ^ this.getExtendedStatistics() == null)
            return false;
        if (other.getExtendedStatistics() != null && other.getExtendedStatistics().equals(this.getExtendedStatistics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getSampleCount() == null) ? 0 : getSampleCount().hashCode());
        hashCode = prime * hashCode + ((getAverage() == null) ? 0 : getAverage().hashCode());
        hashCode = prime * hashCode + ((getSum() == null) ? 0 : getSum().hashCode());
        hashCode = prime * hashCode + ((getMinimum() == null) ? 0 : getMinimum().hashCode());
        hashCode = prime * hashCode + ((getMaximum() == null) ? 0 : getMaximum().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getExtendedStatistics() == null) ? 0 : getExtendedStatistics().hashCode());
        return hashCode;
    }

    @Override
    public Datapoint clone() {
        try {
            return (Datapoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
