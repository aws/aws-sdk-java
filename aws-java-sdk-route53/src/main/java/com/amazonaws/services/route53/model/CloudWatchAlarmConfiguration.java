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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A complex type that contains information about the CloudWatch alarm that Amazon Route 53 is monitoring for this
 * health check.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CloudWatchAlarmConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudWatchAlarmConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the number of periods that the metric is compared to
     * the threshold.
     * </p>
     */
    private Integer evaluationPeriods;
    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the value the metric is compared with.
     * </p>
     */
    private Double threshold;
    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the arithmetic operation that is used for the
     * comparison.
     * </p>
     */
    private String comparisonOperator;
    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the duration of one evaluation period in seconds.
     * </p>
     */
    private Integer period;
    /**
     * <p>
     * The name of the CloudWatch metric that the alarm is associated with.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The namespace of the metric that the alarm is associated with. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html">Amazon
     * CloudWatch Namespaces, Dimensions, and Metrics Reference</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the statistic that is applied to the metric.
     * </p>
     */
    private String statistic;
    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, a complex type that contains information about the
     * dimensions for the metric. For information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html">Amazon
     * CloudWatch Namespaces, Dimensions, and Metrics Reference</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Dimension> dimensions;

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the number of periods that the metric is compared to
     * the threshold.
     * </p>
     * 
     * @param evaluationPeriods
     *        For the metric that the CloudWatch alarm is associated with, the number of periods that the metric is
     *        compared to the threshold.
     */

    public void setEvaluationPeriods(Integer evaluationPeriods) {
        this.evaluationPeriods = evaluationPeriods;
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the number of periods that the metric is compared to
     * the threshold.
     * </p>
     * 
     * @return For the metric that the CloudWatch alarm is associated with, the number of periods that the metric is
     *         compared to the threshold.
     */

    public Integer getEvaluationPeriods() {
        return this.evaluationPeriods;
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the number of periods that the metric is compared to
     * the threshold.
     * </p>
     * 
     * @param evaluationPeriods
     *        For the metric that the CloudWatch alarm is associated with, the number of periods that the metric is
     *        compared to the threshold.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchAlarmConfiguration withEvaluationPeriods(Integer evaluationPeriods) {
        setEvaluationPeriods(evaluationPeriods);
        return this;
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the value the metric is compared with.
     * </p>
     * 
     * @param threshold
     *        For the metric that the CloudWatch alarm is associated with, the value the metric is compared with.
     */

    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the value the metric is compared with.
     * </p>
     * 
     * @return For the metric that the CloudWatch alarm is associated with, the value the metric is compared with.
     */

    public Double getThreshold() {
        return this.threshold;
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the value the metric is compared with.
     * </p>
     * 
     * @param threshold
     *        For the metric that the CloudWatch alarm is associated with, the value the metric is compared with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchAlarmConfiguration withThreshold(Double threshold) {
        setThreshold(threshold);
        return this;
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the arithmetic operation that is used for the
     * comparison.
     * </p>
     * 
     * @param comparisonOperator
     *        For the metric that the CloudWatch alarm is associated with, the arithmetic operation that is used for the
     *        comparison.
     * @see ComparisonOperator
     */

    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the arithmetic operation that is used for the
     * comparison.
     * </p>
     * 
     * @return For the metric that the CloudWatch alarm is associated with, the arithmetic operation that is used for
     *         the comparison.
     * @see ComparisonOperator
     */

    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the arithmetic operation that is used for the
     * comparison.
     * </p>
     * 
     * @param comparisonOperator
     *        For the metric that the CloudWatch alarm is associated with, the arithmetic operation that is used for the
     *        comparison.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComparisonOperator
     */

    public CloudWatchAlarmConfiguration withComparisonOperator(String comparisonOperator) {
        setComparisonOperator(comparisonOperator);
        return this;
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the arithmetic operation that is used for the
     * comparison.
     * </p>
     * 
     * @param comparisonOperator
     *        For the metric that the CloudWatch alarm is associated with, the arithmetic operation that is used for the
     *        comparison.
     * @see ComparisonOperator
     */

    public void setComparisonOperator(ComparisonOperator comparisonOperator) {
        withComparisonOperator(comparisonOperator);
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the arithmetic operation that is used for the
     * comparison.
     * </p>
     * 
     * @param comparisonOperator
     *        For the metric that the CloudWatch alarm is associated with, the arithmetic operation that is used for the
     *        comparison.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComparisonOperator
     */

    public CloudWatchAlarmConfiguration withComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
        return this;
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the duration of one evaluation period in seconds.
     * </p>
     * 
     * @param period
     *        For the metric that the CloudWatch alarm is associated with, the duration of one evaluation period in
     *        seconds.
     */

    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the duration of one evaluation period in seconds.
     * </p>
     * 
     * @return For the metric that the CloudWatch alarm is associated with, the duration of one evaluation period in
     *         seconds.
     */

    public Integer getPeriod() {
        return this.period;
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the duration of one evaluation period in seconds.
     * </p>
     * 
     * @param period
     *        For the metric that the CloudWatch alarm is associated with, the duration of one evaluation period in
     *        seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchAlarmConfiguration withPeriod(Integer period) {
        setPeriod(period);
        return this;
    }

    /**
     * <p>
     * The name of the CloudWatch metric that the alarm is associated with.
     * </p>
     * 
     * @param metricName
     *        The name of the CloudWatch metric that the alarm is associated with.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the CloudWatch metric that the alarm is associated with.
     * </p>
     * 
     * @return The name of the CloudWatch metric that the alarm is associated with.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the CloudWatch metric that the alarm is associated with.
     * </p>
     * 
     * @param metricName
     *        The name of the CloudWatch metric that the alarm is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchAlarmConfiguration withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The namespace of the metric that the alarm is associated with. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html">Amazon
     * CloudWatch Namespaces, Dimensions, and Metrics Reference</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * 
     * @param namespace
     *        The namespace of the metric that the alarm is associated with. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html">Amazon
     *        CloudWatch Namespaces, Dimensions, and Metrics Reference</a> in the <i>Amazon CloudWatch User Guide</i>.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace of the metric that the alarm is associated with. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html">Amazon
     * CloudWatch Namespaces, Dimensions, and Metrics Reference</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * 
     * @return The namespace of the metric that the alarm is associated with. For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html">Amazon
     *         CloudWatch Namespaces, Dimensions, and Metrics Reference</a> in the <i>Amazon CloudWatch User Guide</i>.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace of the metric that the alarm is associated with. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html">Amazon
     * CloudWatch Namespaces, Dimensions, and Metrics Reference</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * 
     * @param namespace
     *        The namespace of the metric that the alarm is associated with. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html">Amazon
     *        CloudWatch Namespaces, Dimensions, and Metrics Reference</a> in the <i>Amazon CloudWatch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchAlarmConfiguration withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the statistic that is applied to the metric.
     * </p>
     * 
     * @param statistic
     *        For the metric that the CloudWatch alarm is associated with, the statistic that is applied to the metric.
     * @see Statistic
     */

    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the statistic that is applied to the metric.
     * </p>
     * 
     * @return For the metric that the CloudWatch alarm is associated with, the statistic that is applied to the metric.
     * @see Statistic
     */

    public String getStatistic() {
        return this.statistic;
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the statistic that is applied to the metric.
     * </p>
     * 
     * @param statistic
     *        For the metric that the CloudWatch alarm is associated with, the statistic that is applied to the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Statistic
     */

    public CloudWatchAlarmConfiguration withStatistic(String statistic) {
        setStatistic(statistic);
        return this;
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the statistic that is applied to the metric.
     * </p>
     * 
     * @param statistic
     *        For the metric that the CloudWatch alarm is associated with, the statistic that is applied to the metric.
     * @see Statistic
     */

    public void setStatistic(Statistic statistic) {
        withStatistic(statistic);
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, the statistic that is applied to the metric.
     * </p>
     * 
     * @param statistic
     *        For the metric that the CloudWatch alarm is associated with, the statistic that is applied to the metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Statistic
     */

    public CloudWatchAlarmConfiguration withStatistic(Statistic statistic) {
        this.statistic = statistic.toString();
        return this;
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, a complex type that contains information about the
     * dimensions for the metric. For information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html">Amazon
     * CloudWatch Namespaces, Dimensions, and Metrics Reference</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * 
     * @return For the metric that the CloudWatch alarm is associated with, a complex type that contains information
     *         about the dimensions for the metric. For information, see <a
     *         href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html">Amazon
     *         CloudWatch Namespaces, Dimensions, and Metrics Reference</a> in the <i>Amazon CloudWatch User Guide</i>.
     */

    public java.util.List<Dimension> getDimensions() {
        if (dimensions == null) {
            dimensions = new com.amazonaws.internal.SdkInternalList<Dimension>();
        }
        return dimensions;
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, a complex type that contains information about the
     * dimensions for the metric. For information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html">Amazon
     * CloudWatch Namespaces, Dimensions, and Metrics Reference</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * 
     * @param dimensions
     *        For the metric that the CloudWatch alarm is associated with, a complex type that contains information
     *        about the dimensions for the metric. For information, see <a
     *        href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html">Amazon
     *        CloudWatch Namespaces, Dimensions, and Metrics Reference</a> in the <i>Amazon CloudWatch User Guide</i>.
     */

    public void setDimensions(java.util.Collection<Dimension> dimensions) {
        if (dimensions == null) {
            this.dimensions = null;
            return;
        }

        this.dimensions = new com.amazonaws.internal.SdkInternalList<Dimension>(dimensions);
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, a complex type that contains information about the
     * dimensions for the metric. For information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html">Amazon
     * CloudWatch Namespaces, Dimensions, and Metrics Reference</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDimensions(java.util.Collection)} or {@link #withDimensions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dimensions
     *        For the metric that the CloudWatch alarm is associated with, a complex type that contains information
     *        about the dimensions for the metric. For information, see <a
     *        href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html">Amazon
     *        CloudWatch Namespaces, Dimensions, and Metrics Reference</a> in the <i>Amazon CloudWatch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchAlarmConfiguration withDimensions(Dimension... dimensions) {
        if (this.dimensions == null) {
            setDimensions(new com.amazonaws.internal.SdkInternalList<Dimension>(dimensions.length));
        }
        for (Dimension ele : dimensions) {
            this.dimensions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For the metric that the CloudWatch alarm is associated with, a complex type that contains information about the
     * dimensions for the metric. For information, see <a
     * href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html">Amazon
     * CloudWatch Namespaces, Dimensions, and Metrics Reference</a> in the <i>Amazon CloudWatch User Guide</i>.
     * </p>
     * 
     * @param dimensions
     *        For the metric that the CloudWatch alarm is associated with, a complex type that contains information
     *        about the dimensions for the metric. For information, see <a
     *        href="http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html">Amazon
     *        CloudWatch Namespaces, Dimensions, and Metrics Reference</a> in the <i>Amazon CloudWatch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchAlarmConfiguration withDimensions(java.util.Collection<Dimension> dimensions) {
        setDimensions(dimensions);
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
        if (getEvaluationPeriods() != null)
            sb.append("EvaluationPeriods: ").append(getEvaluationPeriods()).append(",");
        if (getThreshold() != null)
            sb.append("Threshold: ").append(getThreshold()).append(",");
        if (getComparisonOperator() != null)
            sb.append("ComparisonOperator: ").append(getComparisonOperator()).append(",");
        if (getPeriod() != null)
            sb.append("Period: ").append(getPeriod()).append(",");
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getStatistic() != null)
            sb.append("Statistic: ").append(getStatistic()).append(",");
        if (getDimensions() != null)
            sb.append("Dimensions: ").append(getDimensions());
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
        if (other.getEvaluationPeriods() == null ^ this.getEvaluationPeriods() == null)
            return false;
        if (other.getEvaluationPeriods() != null && other.getEvaluationPeriods().equals(this.getEvaluationPeriods()) == false)
            return false;
        if (other.getThreshold() == null ^ this.getThreshold() == null)
            return false;
        if (other.getThreshold() != null && other.getThreshold().equals(this.getThreshold()) == false)
            return false;
        if (other.getComparisonOperator() == null ^ this.getComparisonOperator() == null)
            return false;
        if (other.getComparisonOperator() != null && other.getComparisonOperator().equals(this.getComparisonOperator()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getStatistic() == null ^ this.getStatistic() == null)
            return false;
        if (other.getStatistic() != null && other.getStatistic().equals(this.getStatistic()) == false)
            return false;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvaluationPeriods() == null) ? 0 : getEvaluationPeriods().hashCode());
        hashCode = prime * hashCode + ((getThreshold() == null) ? 0 : getThreshold().hashCode());
        hashCode = prime * hashCode + ((getComparisonOperator() == null) ? 0 : getComparisonOperator().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getStatistic() == null) ? 0 : getStatistic().hashCode());
        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        return hashCode;
    }

    @Override
    public CloudWatchAlarmConfiguration clone() {
        try {
            return (CloudWatchAlarmConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
