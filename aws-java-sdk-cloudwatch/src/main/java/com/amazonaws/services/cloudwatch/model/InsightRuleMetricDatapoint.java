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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * One data point from the metric time series returned in a Contributor Insights rule report.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_GetInsightRuleReport.html"
 * >GetInsightRuleReport</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/InsightRuleMetricDatapoint"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InsightRuleMetricDatapoint implements Serializable, Cloneable {

    /**
     * <p>
     * The timestamp of the data point.
     * </p>
     */
    private java.util.Date timestamp;
    /**
     * <p>
     * The number of unique contributors who published data during this timestamp.
     * </p>
     * <p>
     * This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     * </p>
     */
    private Double uniqueContributors;
    /**
     * <p>
     * The maximum value provided by one contributor during this timestamp. Each timestamp is evaluated separately, so
     * the identity of the max contributor could be different for each timestamp.
     * </p>
     * <p>
     * This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     * </p>
     */
    private Double maxContributorValue;
    /**
     * <p>
     * The number of occurrences that matched the rule during this data point.
     * </p>
     * <p>
     * This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     * </p>
     */
    private Double sampleCount;
    /**
     * <p>
     * The average value from all contributors during the time period represented by that data point.
     * </p>
     * <p>
     * This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     * </p>
     */
    private Double average;
    /**
     * <p>
     * The sum of the values from all contributors during the time period represented by that data point.
     * </p>
     * <p>
     * This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     * </p>
     */
    private Double sum;
    /**
     * <p>
     * The minimum value from a single contributor during the time period represented by that data point.
     * </p>
     * <p>
     * This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     * </p>
     */
    private Double minimum;
    /**
     * <p>
     * The maximum value from a single occurence from a single contributor during the time period represented by that
     * data point.
     * </p>
     * <p>
     * This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     * </p>
     */
    private Double maximum;

    /**
     * <p>
     * The timestamp of the data point.
     * </p>
     * 
     * @param timestamp
     *        The timestamp of the data point.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The timestamp of the data point.
     * </p>
     * 
     * @return The timestamp of the data point.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The timestamp of the data point.
     * </p>
     * 
     * @param timestamp
     *        The timestamp of the data point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightRuleMetricDatapoint withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * The number of unique contributors who published data during this timestamp.
     * </p>
     * <p>
     * This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     * </p>
     * 
     * @param uniqueContributors
     *        The number of unique contributors who published data during this timestamp.</p>
     *        <p>
     *        This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     */

    public void setUniqueContributors(Double uniqueContributors) {
        this.uniqueContributors = uniqueContributors;
    }

    /**
     * <p>
     * The number of unique contributors who published data during this timestamp.
     * </p>
     * <p>
     * This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     * </p>
     * 
     * @return The number of unique contributors who published data during this timestamp.</p>
     *         <p>
     *         This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     */

    public Double getUniqueContributors() {
        return this.uniqueContributors;
    }

    /**
     * <p>
     * The number of unique contributors who published data during this timestamp.
     * </p>
     * <p>
     * This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     * </p>
     * 
     * @param uniqueContributors
     *        The number of unique contributors who published data during this timestamp.</p>
     *        <p>
     *        This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightRuleMetricDatapoint withUniqueContributors(Double uniqueContributors) {
        setUniqueContributors(uniqueContributors);
        return this;
    }

    /**
     * <p>
     * The maximum value provided by one contributor during this timestamp. Each timestamp is evaluated separately, so
     * the identity of the max contributor could be different for each timestamp.
     * </p>
     * <p>
     * This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     * </p>
     * 
     * @param maxContributorValue
     *        The maximum value provided by one contributor during this timestamp. Each timestamp is evaluated
     *        separately, so the identity of the max contributor could be different for each timestamp.</p>
     *        <p>
     *        This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     */

    public void setMaxContributorValue(Double maxContributorValue) {
        this.maxContributorValue = maxContributorValue;
    }

    /**
     * <p>
     * The maximum value provided by one contributor during this timestamp. Each timestamp is evaluated separately, so
     * the identity of the max contributor could be different for each timestamp.
     * </p>
     * <p>
     * This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     * </p>
     * 
     * @return The maximum value provided by one contributor during this timestamp. Each timestamp is evaluated
     *         separately, so the identity of the max contributor could be different for each timestamp.</p>
     *         <p>
     *         This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     */

    public Double getMaxContributorValue() {
        return this.maxContributorValue;
    }

    /**
     * <p>
     * The maximum value provided by one contributor during this timestamp. Each timestamp is evaluated separately, so
     * the identity of the max contributor could be different for each timestamp.
     * </p>
     * <p>
     * This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     * </p>
     * 
     * @param maxContributorValue
     *        The maximum value provided by one contributor during this timestamp. Each timestamp is evaluated
     *        separately, so the identity of the max contributor could be different for each timestamp.</p>
     *        <p>
     *        This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightRuleMetricDatapoint withMaxContributorValue(Double maxContributorValue) {
        setMaxContributorValue(maxContributorValue);
        return this;
    }

    /**
     * <p>
     * The number of occurrences that matched the rule during this data point.
     * </p>
     * <p>
     * This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     * </p>
     * 
     * @param sampleCount
     *        The number of occurrences that matched the rule during this data point.</p>
     *        <p>
     *        This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     */

    public void setSampleCount(Double sampleCount) {
        this.sampleCount = sampleCount;
    }

    /**
     * <p>
     * The number of occurrences that matched the rule during this data point.
     * </p>
     * <p>
     * This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     * </p>
     * 
     * @return The number of occurrences that matched the rule during this data point.</p>
     *         <p>
     *         This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     */

    public Double getSampleCount() {
        return this.sampleCount;
    }

    /**
     * <p>
     * The number of occurrences that matched the rule during this data point.
     * </p>
     * <p>
     * This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     * </p>
     * 
     * @param sampleCount
     *        The number of occurrences that matched the rule during this data point.</p>
     *        <p>
     *        This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightRuleMetricDatapoint withSampleCount(Double sampleCount) {
        setSampleCount(sampleCount);
        return this;
    }

    /**
     * <p>
     * The average value from all contributors during the time period represented by that data point.
     * </p>
     * <p>
     * This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     * </p>
     * 
     * @param average
     *        The average value from all contributors during the time period represented by that data point.</p>
     *        <p>
     *        This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     */

    public void setAverage(Double average) {
        this.average = average;
    }

    /**
     * <p>
     * The average value from all contributors during the time period represented by that data point.
     * </p>
     * <p>
     * This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     * </p>
     * 
     * @return The average value from all contributors during the time period represented by that data point.</p>
     *         <p>
     *         This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     */

    public Double getAverage() {
        return this.average;
    }

    /**
     * <p>
     * The average value from all contributors during the time period represented by that data point.
     * </p>
     * <p>
     * This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     * </p>
     * 
     * @param average
     *        The average value from all contributors during the time period represented by that data point.</p>
     *        <p>
     *        This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightRuleMetricDatapoint withAverage(Double average) {
        setAverage(average);
        return this;
    }

    /**
     * <p>
     * The sum of the values from all contributors during the time period represented by that data point.
     * </p>
     * <p>
     * This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     * </p>
     * 
     * @param sum
     *        The sum of the values from all contributors during the time period represented by that data point.</p>
     *        <p>
     *        This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     */

    public void setSum(Double sum) {
        this.sum = sum;
    }

    /**
     * <p>
     * The sum of the values from all contributors during the time period represented by that data point.
     * </p>
     * <p>
     * This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     * </p>
     * 
     * @return The sum of the values from all contributors during the time period represented by that data point.</p>
     *         <p>
     *         This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     */

    public Double getSum() {
        return this.sum;
    }

    /**
     * <p>
     * The sum of the values from all contributors during the time period represented by that data point.
     * </p>
     * <p>
     * This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     * </p>
     * 
     * @param sum
     *        The sum of the values from all contributors during the time period represented by that data point.</p>
     *        <p>
     *        This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightRuleMetricDatapoint withSum(Double sum) {
        setSum(sum);
        return this;
    }

    /**
     * <p>
     * The minimum value from a single contributor during the time period represented by that data point.
     * </p>
     * <p>
     * This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     * </p>
     * 
     * @param minimum
     *        The minimum value from a single contributor during the time period represented by that data point.</p>
     *        <p>
     *        This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     */

    public void setMinimum(Double minimum) {
        this.minimum = minimum;
    }

    /**
     * <p>
     * The minimum value from a single contributor during the time period represented by that data point.
     * </p>
     * <p>
     * This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     * </p>
     * 
     * @return The minimum value from a single contributor during the time period represented by that data point.</p>
     *         <p>
     *         This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     */

    public Double getMinimum() {
        return this.minimum;
    }

    /**
     * <p>
     * The minimum value from a single contributor during the time period represented by that data point.
     * </p>
     * <p>
     * This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     * </p>
     * 
     * @param minimum
     *        The minimum value from a single contributor during the time period represented by that data point.</p>
     *        <p>
     *        This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightRuleMetricDatapoint withMinimum(Double minimum) {
        setMinimum(minimum);
        return this;
    }

    /**
     * <p>
     * The maximum value from a single occurence from a single contributor during the time period represented by that
     * data point.
     * </p>
     * <p>
     * This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     * </p>
     * 
     * @param maximum
     *        The maximum value from a single occurence from a single contributor during the time period represented by
     *        that data point.</p>
     *        <p>
     *        This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     */

    public void setMaximum(Double maximum) {
        this.maximum = maximum;
    }

    /**
     * <p>
     * The maximum value from a single occurence from a single contributor during the time period represented by that
     * data point.
     * </p>
     * <p>
     * This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     * </p>
     * 
     * @return The maximum value from a single occurence from a single contributor during the time period represented by
     *         that data point.</p>
     *         <p>
     *         This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     */

    public Double getMaximum() {
        return this.maximum;
    }

    /**
     * <p>
     * The maximum value from a single occurence from a single contributor during the time period represented by that
     * data point.
     * </p>
     * <p>
     * This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     * </p>
     * 
     * @param maximum
     *        The maximum value from a single occurence from a single contributor during the time period represented by
     *        that data point.</p>
     *        <p>
     *        This statistic is returned only if you included it in the <code>Metrics</code> array in your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightRuleMetricDatapoint withMaximum(Double maximum) {
        setMaximum(maximum);
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
        if (getUniqueContributors() != null)
            sb.append("UniqueContributors: ").append(getUniqueContributors()).append(",");
        if (getMaxContributorValue() != null)
            sb.append("MaxContributorValue: ").append(getMaxContributorValue()).append(",");
        if (getSampleCount() != null)
            sb.append("SampleCount: ").append(getSampleCount()).append(",");
        if (getAverage() != null)
            sb.append("Average: ").append(getAverage()).append(",");
        if (getSum() != null)
            sb.append("Sum: ").append(getSum()).append(",");
        if (getMinimum() != null)
            sb.append("Minimum: ").append(getMinimum()).append(",");
        if (getMaximum() != null)
            sb.append("Maximum: ").append(getMaximum());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InsightRuleMetricDatapoint == false)
            return false;
        InsightRuleMetricDatapoint other = (InsightRuleMetricDatapoint) obj;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getUniqueContributors() == null ^ this.getUniqueContributors() == null)
            return false;
        if (other.getUniqueContributors() != null && other.getUniqueContributors().equals(this.getUniqueContributors()) == false)
            return false;
        if (other.getMaxContributorValue() == null ^ this.getMaxContributorValue() == null)
            return false;
        if (other.getMaxContributorValue() != null && other.getMaxContributorValue().equals(this.getMaxContributorValue()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getUniqueContributors() == null) ? 0 : getUniqueContributors().hashCode());
        hashCode = prime * hashCode + ((getMaxContributorValue() == null) ? 0 : getMaxContributorValue().hashCode());
        hashCode = prime * hashCode + ((getSampleCount() == null) ? 0 : getSampleCount().hashCode());
        hashCode = prime * hashCode + ((getAverage() == null) ? 0 : getAverage().hashCode());
        hashCode = prime * hashCode + ((getSum() == null) ? 0 : getSum().hashCode());
        hashCode = prime * hashCode + ((getMinimum() == null) ? 0 : getMinimum().hashCode());
        hashCode = prime * hashCode + ((getMaximum() == null) ? 0 : getMaximum().hashCode());
        return hashCode;
    }

    @Override
    public InsightRuleMetricDatapoint clone() {
        try {
            return (InsightRuleMetricDatapoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
