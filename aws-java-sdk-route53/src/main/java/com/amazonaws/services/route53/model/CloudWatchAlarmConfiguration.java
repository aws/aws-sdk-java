/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * For CLOUDWATCH_METRIC health checks, a complex type that contains information
 * about the CloudWatch alarm that you're associating with the health check.
 * </p>
 */
public class CloudWatchAlarmConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * The number of periods over which data is compared to the specified
     * threshold.
     * </p>
     */
    private Integer evaluationPeriods;
    /**
     * <p>
     * The value that the metric is compared with to determine the state of the
     * alarm. For example, if you want the health check to fail if the average
     * TCP connection time is greater than 500 milliseconds for more than 60
     * seconds, the threshold is 500.
     * </p>
     */
    private Double threshold;
    /**
     * <p>
     * The arithmetic operation to use when comparing the specified Statistic
     * and Threshold.
     * </p>
     * <p>
     * Valid Values are <code>GreaterThanOrEqualToThreshold</code>,
     * <code>GreaterThanThreshold</code>, <code>LessThanThreshold</code> and
     * <code>LessThanOrEqualToThreshold</code>
     * </p>
     */
    private String comparisonOperator;
    /**
     * <p>
     * An integer that represents the period in seconds over which the statistic
     * is applied.
     * </p>
     */
    private Integer period;
    /**
     * <p>
     * The name of the CloudWatch metric that is associated with the CloudWatch
     * alarm.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The namespace of the CloudWatch metric that is associated with the
     * CloudWatch alarm.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * The statistic to apply to the CloudWatch metric that is associated with
     * the CloudWatch alarm.
     * </p>
     * <p>
     * Valid Values are <code>SampleCount</code>, <code>Average</code>,
     * <code>Sum</code>, <code>Minimum</code> and <code>Maximum</code>
     * </p>
     */
    private String statistic;
    /**
     * <p>
     * A list of <code>Dimension</code> elements for the CloudWatch metric that
     * is associated with the CloudWatch alarm. For information about the
     * metrics and dimensions that CloudWatch supports, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html"
     * >Amazon CloudWatch Namespaces, Dimensions, and Metrics Reference</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Dimension> dimensions;

    /**
     * <p>
     * The number of periods over which data is compared to the specified
     * threshold.
     * </p>
     * 
     * @param evaluationPeriods
     *        The number of periods over which data is compared to the specified
     *        threshold.
     */

    public void setEvaluationPeriods(Integer evaluationPeriods) {
        this.evaluationPeriods = evaluationPeriods;
    }

    /**
     * <p>
     * The number of periods over which data is compared to the specified
     * threshold.
     * </p>
     * 
     * @return The number of periods over which data is compared to the
     *         specified threshold.
     */

    public Integer getEvaluationPeriods() {
        return this.evaluationPeriods;
    }

    /**
     * <p>
     * The number of periods over which data is compared to the specified
     * threshold.
     * </p>
     * 
     * @param evaluationPeriods
     *        The number of periods over which data is compared to the specified
     *        threshold.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CloudWatchAlarmConfiguration withEvaluationPeriods(
            Integer evaluationPeriods) {
        setEvaluationPeriods(evaluationPeriods);
        return this;
    }

    /**
     * <p>
     * The value that the metric is compared with to determine the state of the
     * alarm. For example, if you want the health check to fail if the average
     * TCP connection time is greater than 500 milliseconds for more than 60
     * seconds, the threshold is 500.
     * </p>
     * 
     * @param threshold
     *        The value that the metric is compared with to determine the state
     *        of the alarm. For example, if you want the health check to fail if
     *        the average TCP connection time is greater than 500 milliseconds
     *        for more than 60 seconds, the threshold is 500.
     */

    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }

    /**
     * <p>
     * The value that the metric is compared with to determine the state of the
     * alarm. For example, if you want the health check to fail if the average
     * TCP connection time is greater than 500 milliseconds for more than 60
     * seconds, the threshold is 500.
     * </p>
     * 
     * @return The value that the metric is compared with to determine the state
     *         of the alarm. For example, if you want the health check to fail
     *         if the average TCP connection time is greater than 500
     *         milliseconds for more than 60 seconds, the threshold is 500.
     */

    public Double getThreshold() {
        return this.threshold;
    }

    /**
     * <p>
     * The value that the metric is compared with to determine the state of the
     * alarm. For example, if you want the health check to fail if the average
     * TCP connection time is greater than 500 milliseconds for more than 60
     * seconds, the threshold is 500.
     * </p>
     * 
     * @param threshold
     *        The value that the metric is compared with to determine the state
     *        of the alarm. For example, if you want the health check to fail if
     *        the average TCP connection time is greater than 500 milliseconds
     *        for more than 60 seconds, the threshold is 500.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CloudWatchAlarmConfiguration withThreshold(Double threshold) {
        setThreshold(threshold);
        return this;
    }

    /**
     * <p>
     * The arithmetic operation to use when comparing the specified Statistic
     * and Threshold.
     * </p>
     * <p>
     * Valid Values are <code>GreaterThanOrEqualToThreshold</code>,
     * <code>GreaterThanThreshold</code>, <code>LessThanThreshold</code> and
     * <code>LessThanOrEqualToThreshold</code>
     * </p>
     * 
     * @param comparisonOperator
     *        The arithmetic operation to use when comparing the specified
     *        Statistic and Threshold.</p>
     *        <p>
     *        Valid Values are <code>GreaterThanOrEqualToThreshold</code>,
     *        <code>GreaterThanThreshold</code>, <code>LessThanThreshold</code>
     *        and <code>LessThanOrEqualToThreshold</code>
     * @see ComparisonOperator
     */

    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    /**
     * <p>
     * The arithmetic operation to use when comparing the specified Statistic
     * and Threshold.
     * </p>
     * <p>
     * Valid Values are <code>GreaterThanOrEqualToThreshold</code>,
     * <code>GreaterThanThreshold</code>, <code>LessThanThreshold</code> and
     * <code>LessThanOrEqualToThreshold</code>
     * </p>
     * 
     * @return The arithmetic operation to use when comparing the specified
     *         Statistic and Threshold.</p>
     *         <p>
     *         Valid Values are <code>GreaterThanOrEqualToThreshold</code>,
     *         <code>GreaterThanThreshold</code>, <code>LessThanThreshold</code>
     *         and <code>LessThanOrEqualToThreshold</code>
     * @see ComparisonOperator
     */

    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    /**
     * <p>
     * The arithmetic operation to use when comparing the specified Statistic
     * and Threshold.
     * </p>
     * <p>
     * Valid Values are <code>GreaterThanOrEqualToThreshold</code>,
     * <code>GreaterThanThreshold</code>, <code>LessThanThreshold</code> and
     * <code>LessThanOrEqualToThreshold</code>
     * </p>
     * 
     * @param comparisonOperator
     *        The arithmetic operation to use when comparing the specified
     *        Statistic and Threshold.</p>
     *        <p>
     *        Valid Values are <code>GreaterThanOrEqualToThreshold</code>,
     *        <code>GreaterThanThreshold</code>, <code>LessThanThreshold</code>
     *        and <code>LessThanOrEqualToThreshold</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ComparisonOperator
     */

    public CloudWatchAlarmConfiguration withComparisonOperator(
            String comparisonOperator) {
        setComparisonOperator(comparisonOperator);
        return this;
    }

    /**
     * <p>
     * The arithmetic operation to use when comparing the specified Statistic
     * and Threshold.
     * </p>
     * <p>
     * Valid Values are <code>GreaterThanOrEqualToThreshold</code>,
     * <code>GreaterThanThreshold</code>, <code>LessThanThreshold</code> and
     * <code>LessThanOrEqualToThreshold</code>
     * </p>
     * 
     * @param comparisonOperator
     *        The arithmetic operation to use when comparing the specified
     *        Statistic and Threshold.</p>
     *        <p>
     *        Valid Values are <code>GreaterThanOrEqualToThreshold</code>,
     *        <code>GreaterThanThreshold</code>, <code>LessThanThreshold</code>
     *        and <code>LessThanOrEqualToThreshold</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ComparisonOperator
     */

    public void setComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
    }

    /**
     * <p>
     * The arithmetic operation to use when comparing the specified Statistic
     * and Threshold.
     * </p>
     * <p>
     * Valid Values are <code>GreaterThanOrEqualToThreshold</code>,
     * <code>GreaterThanThreshold</code>, <code>LessThanThreshold</code> and
     * <code>LessThanOrEqualToThreshold</code>
     * </p>
     * 
     * @param comparisonOperator
     *        The arithmetic operation to use when comparing the specified
     *        Statistic and Threshold.</p>
     *        <p>
     *        Valid Values are <code>GreaterThanOrEqualToThreshold</code>,
     *        <code>GreaterThanThreshold</code>, <code>LessThanThreshold</code>
     *        and <code>LessThanOrEqualToThreshold</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ComparisonOperator
     */

    public CloudWatchAlarmConfiguration withComparisonOperator(
            ComparisonOperator comparisonOperator) {
        setComparisonOperator(comparisonOperator);
        return this;
    }

    /**
     * <p>
     * An integer that represents the period in seconds over which the statistic
     * is applied.
     * </p>
     * 
     * @param period
     *        An integer that represents the period in seconds over which the
     *        statistic is applied.
     */

    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * <p>
     * An integer that represents the period in seconds over which the statistic
     * is applied.
     * </p>
     * 
     * @return An integer that represents the period in seconds over which the
     *         statistic is applied.
     */

    public Integer getPeriod() {
        return this.period;
    }

    /**
     * <p>
     * An integer that represents the period in seconds over which the statistic
     * is applied.
     * </p>
     * 
     * @param period
     *        An integer that represents the period in seconds over which the
     *        statistic is applied.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CloudWatchAlarmConfiguration withPeriod(Integer period) {
        setPeriod(period);
        return this;
    }

    /**
     * <p>
     * The name of the CloudWatch metric that is associated with the CloudWatch
     * alarm.
     * </p>
     * 
     * @param metricName
     *        The name of the CloudWatch metric that is associated with the
     *        CloudWatch alarm.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the CloudWatch metric that is associated with the CloudWatch
     * alarm.
     * </p>
     * 
     * @return The name of the CloudWatch metric that is associated with the
     *         CloudWatch alarm.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the CloudWatch metric that is associated with the CloudWatch
     * alarm.
     * </p>
     * 
     * @param metricName
     *        The name of the CloudWatch metric that is associated with the
     *        CloudWatch alarm.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CloudWatchAlarmConfiguration withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The namespace of the CloudWatch metric that is associated with the
     * CloudWatch alarm.
     * </p>
     * 
     * @param namespace
     *        The namespace of the CloudWatch metric that is associated with the
     *        CloudWatch alarm.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace of the CloudWatch metric that is associated with the
     * CloudWatch alarm.
     * </p>
     * 
     * @return The namespace of the CloudWatch metric that is associated with
     *         the CloudWatch alarm.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace of the CloudWatch metric that is associated with the
     * CloudWatch alarm.
     * </p>
     * 
     * @param namespace
     *        The namespace of the CloudWatch metric that is associated with the
     *        CloudWatch alarm.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CloudWatchAlarmConfiguration withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The statistic to apply to the CloudWatch metric that is associated with
     * the CloudWatch alarm.
     * </p>
     * <p>
     * Valid Values are <code>SampleCount</code>, <code>Average</code>,
     * <code>Sum</code>, <code>Minimum</code> and <code>Maximum</code>
     * </p>
     * 
     * @param statistic
     *        The statistic to apply to the CloudWatch metric that is associated
     *        with the CloudWatch alarm.</p>
     *        <p>
     *        Valid Values are <code>SampleCount</code>, <code>Average</code>,
     *        <code>Sum</code>, <code>Minimum</code> and <code>Maximum</code>
     * @see Statistic
     */

    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }

    /**
     * <p>
     * The statistic to apply to the CloudWatch metric that is associated with
     * the CloudWatch alarm.
     * </p>
     * <p>
     * Valid Values are <code>SampleCount</code>, <code>Average</code>,
     * <code>Sum</code>, <code>Minimum</code> and <code>Maximum</code>
     * </p>
     * 
     * @return The statistic to apply to the CloudWatch metric that is
     *         associated with the CloudWatch alarm.</p>
     *         <p>
     *         Valid Values are <code>SampleCount</code>, <code>Average</code>,
     *         <code>Sum</code>, <code>Minimum</code> and <code>Maximum</code>
     * @see Statistic
     */

    public String getStatistic() {
        return this.statistic;
    }

    /**
     * <p>
     * The statistic to apply to the CloudWatch metric that is associated with
     * the CloudWatch alarm.
     * </p>
     * <p>
     * Valid Values are <code>SampleCount</code>, <code>Average</code>,
     * <code>Sum</code>, <code>Minimum</code> and <code>Maximum</code>
     * </p>
     * 
     * @param statistic
     *        The statistic to apply to the CloudWatch metric that is associated
     *        with the CloudWatch alarm.</p>
     *        <p>
     *        Valid Values are <code>SampleCount</code>, <code>Average</code>,
     *        <code>Sum</code>, <code>Minimum</code> and <code>Maximum</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see Statistic
     */

    public CloudWatchAlarmConfiguration withStatistic(String statistic) {
        setStatistic(statistic);
        return this;
    }

    /**
     * <p>
     * The statistic to apply to the CloudWatch metric that is associated with
     * the CloudWatch alarm.
     * </p>
     * <p>
     * Valid Values are <code>SampleCount</code>, <code>Average</code>,
     * <code>Sum</code>, <code>Minimum</code> and <code>Maximum</code>
     * </p>
     * 
     * @param statistic
     *        The statistic to apply to the CloudWatch metric that is associated
     *        with the CloudWatch alarm.</p>
     *        <p>
     *        Valid Values are <code>SampleCount</code>, <code>Average</code>,
     *        <code>Sum</code>, <code>Minimum</code> and <code>Maximum</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see Statistic
     */

    public void setStatistic(Statistic statistic) {
        this.statistic = statistic.toString();
    }

    /**
     * <p>
     * The statistic to apply to the CloudWatch metric that is associated with
     * the CloudWatch alarm.
     * </p>
     * <p>
     * Valid Values are <code>SampleCount</code>, <code>Average</code>,
     * <code>Sum</code>, <code>Minimum</code> and <code>Maximum</code>
     * </p>
     * 
     * @param statistic
     *        The statistic to apply to the CloudWatch metric that is associated
     *        with the CloudWatch alarm.</p>
     *        <p>
     *        Valid Values are <code>SampleCount</code>, <code>Average</code>,
     *        <code>Sum</code>, <code>Minimum</code> and <code>Maximum</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see Statistic
     */

    public CloudWatchAlarmConfiguration withStatistic(Statistic statistic) {
        setStatistic(statistic);
        return this;
    }

    /**
     * <p>
     * A list of <code>Dimension</code> elements for the CloudWatch metric that
     * is associated with the CloudWatch alarm. For information about the
     * metrics and dimensions that CloudWatch supports, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html"
     * >Amazon CloudWatch Namespaces, Dimensions, and Metrics Reference</a>.
     * </p>
     * 
     * @return A list of <code>Dimension</code> elements for the CloudWatch
     *         metric that is associated with the CloudWatch alarm. For
     *         information about the metrics and dimensions that CloudWatch
     *         supports, see <a href=
     *         "http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html"
     *         >Amazon CloudWatch Namespaces, Dimensions, and Metrics
     *         Reference</a>.
     */

    public java.util.List<Dimension> getDimensions() {
        if (dimensions == null) {
            dimensions = new com.amazonaws.internal.SdkInternalList<Dimension>();
        }
        return dimensions;
    }

    /**
     * <p>
     * A list of <code>Dimension</code> elements for the CloudWatch metric that
     * is associated with the CloudWatch alarm. For information about the
     * metrics and dimensions that CloudWatch supports, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html"
     * >Amazon CloudWatch Namespaces, Dimensions, and Metrics Reference</a>.
     * </p>
     * 
     * @param dimensions
     *        A list of <code>Dimension</code> elements for the CloudWatch
     *        metric that is associated with the CloudWatch alarm. For
     *        information about the metrics and dimensions that CloudWatch
     *        supports, see <a href=
     *        "http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html"
     *        >Amazon CloudWatch Namespaces, Dimensions, and Metrics
     *        Reference</a>.
     */

    public void setDimensions(java.util.Collection<Dimension> dimensions) {
        if (dimensions == null) {
            this.dimensions = null;
            return;
        }

        this.dimensions = new com.amazonaws.internal.SdkInternalList<Dimension>(
                dimensions);
    }

    /**
     * <p>
     * A list of <code>Dimension</code> elements for the CloudWatch metric that
     * is associated with the CloudWatch alarm. For information about the
     * metrics and dimensions that CloudWatch supports, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html"
     * >Amazon CloudWatch Namespaces, Dimensions, and Metrics Reference</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setDimensions(java.util.Collection)} or
     * {@link #withDimensions(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param dimensions
     *        A list of <code>Dimension</code> elements for the CloudWatch
     *        metric that is associated with the CloudWatch alarm. For
     *        information about the metrics and dimensions that CloudWatch
     *        supports, see <a href=
     *        "http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html"
     *        >Amazon CloudWatch Namespaces, Dimensions, and Metrics
     *        Reference</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CloudWatchAlarmConfiguration withDimensions(Dimension... dimensions) {
        if (this.dimensions == null) {
            setDimensions(new com.amazonaws.internal.SdkInternalList<Dimension>(
                    dimensions.length));
        }
        for (Dimension ele : dimensions) {
            this.dimensions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>Dimension</code> elements for the CloudWatch metric that
     * is associated with the CloudWatch alarm. For information about the
     * metrics and dimensions that CloudWatch supports, see <a href=
     * "http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html"
     * >Amazon CloudWatch Namespaces, Dimensions, and Metrics Reference</a>.
     * </p>
     * 
     * @param dimensions
     *        A list of <code>Dimension</code> elements for the CloudWatch
     *        metric that is associated with the CloudWatch alarm. For
     *        information about the metrics and dimensions that CloudWatch
     *        supports, see <a href=
     *        "http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html"
     *        >Amazon CloudWatch Namespaces, Dimensions, and Metrics
     *        Reference</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CloudWatchAlarmConfiguration withDimensions(
            java.util.Collection<Dimension> dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEvaluationPeriods() != null)
            sb.append("EvaluationPeriods: " + getEvaluationPeriods() + ",");
        if (getThreshold() != null)
            sb.append("Threshold: " + getThreshold() + ",");
        if (getComparisonOperator() != null)
            sb.append("ComparisonOperator: " + getComparisonOperator() + ",");
        if (getPeriod() != null)
            sb.append("Period: " + getPeriod() + ",");
        if (getMetricName() != null)
            sb.append("MetricName: " + getMetricName() + ",");
        if (getNamespace() != null)
            sb.append("Namespace: " + getNamespace() + ",");
        if (getStatistic() != null)
            sb.append("Statistic: " + getStatistic() + ",");
        if (getDimensions() != null)
            sb.append("Dimensions: " + getDimensions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudWatchAlarmConfiguration == false)
            return false;
        CloudWatchAlarmConfiguration other = (CloudWatchAlarmConfiguration) obj;
        if (other.getEvaluationPeriods() == null
                ^ this.getEvaluationPeriods() == null)
            return false;
        if (other.getEvaluationPeriods() != null
                && other.getEvaluationPeriods().equals(
                        this.getEvaluationPeriods()) == false)
            return false;
        if (other.getThreshold() == null ^ this.getThreshold() == null)
            return false;
        if (other.getThreshold() != null
                && other.getThreshold().equals(this.getThreshold()) == false)
            return false;
        if (other.getComparisonOperator() == null
                ^ this.getComparisonOperator() == null)
            return false;
        if (other.getComparisonOperator() != null
                && other.getComparisonOperator().equals(
                        this.getComparisonOperator()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null
                && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null
                && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null
                && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getStatistic() == null ^ this.getStatistic() == null)
            return false;
        if (other.getStatistic() != null
                && other.getStatistic().equals(this.getStatistic()) == false)
            return false;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null
                && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getEvaluationPeriods() == null) ? 0
                        : getEvaluationPeriods().hashCode());
        hashCode = prime * hashCode
                + ((getThreshold() == null) ? 0 : getThreshold().hashCode());
        hashCode = prime
                * hashCode
                + ((getComparisonOperator() == null) ? 0
                        : getComparisonOperator().hashCode());
        hashCode = prime * hashCode
                + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode
                + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode
                + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode
                + ((getStatistic() == null) ? 0 : getStatistic().hashCode());
        hashCode = prime * hashCode
                + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        return hashCode;
    }

    @Override
    public CloudWatchAlarmConfiguration clone() {
        try {
            return (CloudWatchAlarmConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
