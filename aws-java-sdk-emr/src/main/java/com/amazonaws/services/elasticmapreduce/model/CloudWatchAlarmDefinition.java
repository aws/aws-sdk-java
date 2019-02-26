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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The definition of a CloudWatch metric alarm, which determines when an automatic scaling activity is triggered. When
 * the defined alarm conditions are satisfied, scaling activity begins.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/CloudWatchAlarmDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudWatchAlarmDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines how the metric specified by <code>MetricName</code> is compared to the value specified by
     * <code>Threshold</code>.
     * </p>
     */
    private String comparisonOperator;
    /**
     * <p>
     * The number of periods, expressed in seconds using <code>Period</code>, during which the alarm condition must
     * exist before the alarm triggers automatic scaling activity. The default value is <code>1</code>.
     * </p>
     */
    private Integer evaluationPeriods;
    /**
     * <p>
     * The name of the CloudWatch metric that is watched to determine an alarm condition.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The namespace for the CloudWatch metric. The default is <code>AWS/ElasticMapReduce</code>.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * The period, in seconds, over which the statistic is applied. EMR CloudWatch metrics are emitted every five
     * minutes (300 seconds), so if an EMR CloudWatch metric is specified, specify <code>300</code>.
     * </p>
     */
    private Integer period;
    /**
     * <p>
     * The statistic to apply to the metric associated with the alarm. The default is <code>AVERAGE</code>.
     * </p>
     */
    private String statistic;
    /**
     * <p>
     * The value against which the specified statistic is compared.
     * </p>
     */
    private Double threshold;
    /**
     * <p>
     * The unit of measure associated with the CloudWatch metric being watched. The value specified for
     * <code>Unit</code> must correspond to the units specified in the CloudWatch metric.
     * </p>
     */
    private String unit;
    /**
     * <p>
     * A CloudWatch metric dimension.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MetricDimension> dimensions;

    /**
     * <p>
     * Determines how the metric specified by <code>MetricName</code> is compared to the value specified by
     * <code>Threshold</code>.
     * </p>
     * 
     * @param comparisonOperator
     *        Determines how the metric specified by <code>MetricName</code> is compared to the value specified by
     *        <code>Threshold</code>.
     * @see ComparisonOperator
     */

    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    /**
     * <p>
     * Determines how the metric specified by <code>MetricName</code> is compared to the value specified by
     * <code>Threshold</code>.
     * </p>
     * 
     * @return Determines how the metric specified by <code>MetricName</code> is compared to the value specified by
     *         <code>Threshold</code>.
     * @see ComparisonOperator
     */

    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    /**
     * <p>
     * Determines how the metric specified by <code>MetricName</code> is compared to the value specified by
     * <code>Threshold</code>.
     * </p>
     * 
     * @param comparisonOperator
     *        Determines how the metric specified by <code>MetricName</code> is compared to the value specified by
     *        <code>Threshold</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComparisonOperator
     */

    public CloudWatchAlarmDefinition withComparisonOperator(String comparisonOperator) {
        setComparisonOperator(comparisonOperator);
        return this;
    }

    /**
     * <p>
     * Determines how the metric specified by <code>MetricName</code> is compared to the value specified by
     * <code>Threshold</code>.
     * </p>
     * 
     * @param comparisonOperator
     *        Determines how the metric specified by <code>MetricName</code> is compared to the value specified by
     *        <code>Threshold</code>.
     * @see ComparisonOperator
     */

    public void setComparisonOperator(ComparisonOperator comparisonOperator) {
        withComparisonOperator(comparisonOperator);
    }

    /**
     * <p>
     * Determines how the metric specified by <code>MetricName</code> is compared to the value specified by
     * <code>Threshold</code>.
     * </p>
     * 
     * @param comparisonOperator
     *        Determines how the metric specified by <code>MetricName</code> is compared to the value specified by
     *        <code>Threshold</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComparisonOperator
     */

    public CloudWatchAlarmDefinition withComparisonOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator.toString();
        return this;
    }

    /**
     * <p>
     * The number of periods, expressed in seconds using <code>Period</code>, during which the alarm condition must
     * exist before the alarm triggers automatic scaling activity. The default value is <code>1</code>.
     * </p>
     * 
     * @param evaluationPeriods
     *        The number of periods, expressed in seconds using <code>Period</code>, during which the alarm condition
     *        must exist before the alarm triggers automatic scaling activity. The default value is <code>1</code>.
     */

    public void setEvaluationPeriods(Integer evaluationPeriods) {
        this.evaluationPeriods = evaluationPeriods;
    }

    /**
     * <p>
     * The number of periods, expressed in seconds using <code>Period</code>, during which the alarm condition must
     * exist before the alarm triggers automatic scaling activity. The default value is <code>1</code>.
     * </p>
     * 
     * @return The number of periods, expressed in seconds using <code>Period</code>, during which the alarm condition
     *         must exist before the alarm triggers automatic scaling activity. The default value is <code>1</code>.
     */

    public Integer getEvaluationPeriods() {
        return this.evaluationPeriods;
    }

    /**
     * <p>
     * The number of periods, expressed in seconds using <code>Period</code>, during which the alarm condition must
     * exist before the alarm triggers automatic scaling activity. The default value is <code>1</code>.
     * </p>
     * 
     * @param evaluationPeriods
     *        The number of periods, expressed in seconds using <code>Period</code>, during which the alarm condition
     *        must exist before the alarm triggers automatic scaling activity. The default value is <code>1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchAlarmDefinition withEvaluationPeriods(Integer evaluationPeriods) {
        setEvaluationPeriods(evaluationPeriods);
        return this;
    }

    /**
     * <p>
     * The name of the CloudWatch metric that is watched to determine an alarm condition.
     * </p>
     * 
     * @param metricName
     *        The name of the CloudWatch metric that is watched to determine an alarm condition.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the CloudWatch metric that is watched to determine an alarm condition.
     * </p>
     * 
     * @return The name of the CloudWatch metric that is watched to determine an alarm condition.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the CloudWatch metric that is watched to determine an alarm condition.
     * </p>
     * 
     * @param metricName
     *        The name of the CloudWatch metric that is watched to determine an alarm condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchAlarmDefinition withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The namespace for the CloudWatch metric. The default is <code>AWS/ElasticMapReduce</code>.
     * </p>
     * 
     * @param namespace
     *        The namespace for the CloudWatch metric. The default is <code>AWS/ElasticMapReduce</code>.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace for the CloudWatch metric. The default is <code>AWS/ElasticMapReduce</code>.
     * </p>
     * 
     * @return The namespace for the CloudWatch metric. The default is <code>AWS/ElasticMapReduce</code>.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace for the CloudWatch metric. The default is <code>AWS/ElasticMapReduce</code>.
     * </p>
     * 
     * @param namespace
     *        The namespace for the CloudWatch metric. The default is <code>AWS/ElasticMapReduce</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchAlarmDefinition withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The period, in seconds, over which the statistic is applied. EMR CloudWatch metrics are emitted every five
     * minutes (300 seconds), so if an EMR CloudWatch metric is specified, specify <code>300</code>.
     * </p>
     * 
     * @param period
     *        The period, in seconds, over which the statistic is applied. EMR CloudWatch metrics are emitted every five
     *        minutes (300 seconds), so if an EMR CloudWatch metric is specified, specify <code>300</code>.
     */

    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * <p>
     * The period, in seconds, over which the statistic is applied. EMR CloudWatch metrics are emitted every five
     * minutes (300 seconds), so if an EMR CloudWatch metric is specified, specify <code>300</code>.
     * </p>
     * 
     * @return The period, in seconds, over which the statistic is applied. EMR CloudWatch metrics are emitted every
     *         five minutes (300 seconds), so if an EMR CloudWatch metric is specified, specify <code>300</code>.
     */

    public Integer getPeriod() {
        return this.period;
    }

    /**
     * <p>
     * The period, in seconds, over which the statistic is applied. EMR CloudWatch metrics are emitted every five
     * minutes (300 seconds), so if an EMR CloudWatch metric is specified, specify <code>300</code>.
     * </p>
     * 
     * @param period
     *        The period, in seconds, over which the statistic is applied. EMR CloudWatch metrics are emitted every five
     *        minutes (300 seconds), so if an EMR CloudWatch metric is specified, specify <code>300</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchAlarmDefinition withPeriod(Integer period) {
        setPeriod(period);
        return this;
    }

    /**
     * <p>
     * The statistic to apply to the metric associated with the alarm. The default is <code>AVERAGE</code>.
     * </p>
     * 
     * @param statistic
     *        The statistic to apply to the metric associated with the alarm. The default is <code>AVERAGE</code>.
     * @see Statistic
     */

    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }

    /**
     * <p>
     * The statistic to apply to the metric associated with the alarm. The default is <code>AVERAGE</code>.
     * </p>
     * 
     * @return The statistic to apply to the metric associated with the alarm. The default is <code>AVERAGE</code>.
     * @see Statistic
     */

    public String getStatistic() {
        return this.statistic;
    }

    /**
     * <p>
     * The statistic to apply to the metric associated with the alarm. The default is <code>AVERAGE</code>.
     * </p>
     * 
     * @param statistic
     *        The statistic to apply to the metric associated with the alarm. The default is <code>AVERAGE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Statistic
     */

    public CloudWatchAlarmDefinition withStatistic(String statistic) {
        setStatistic(statistic);
        return this;
    }

    /**
     * <p>
     * The statistic to apply to the metric associated with the alarm. The default is <code>AVERAGE</code>.
     * </p>
     * 
     * @param statistic
     *        The statistic to apply to the metric associated with the alarm. The default is <code>AVERAGE</code>.
     * @see Statistic
     */

    public void setStatistic(Statistic statistic) {
        withStatistic(statistic);
    }

    /**
     * <p>
     * The statistic to apply to the metric associated with the alarm. The default is <code>AVERAGE</code>.
     * </p>
     * 
     * @param statistic
     *        The statistic to apply to the metric associated with the alarm. The default is <code>AVERAGE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Statistic
     */

    public CloudWatchAlarmDefinition withStatistic(Statistic statistic) {
        this.statistic = statistic.toString();
        return this;
    }

    /**
     * <p>
     * The value against which the specified statistic is compared.
     * </p>
     * 
     * @param threshold
     *        The value against which the specified statistic is compared.
     */

    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }

    /**
     * <p>
     * The value against which the specified statistic is compared.
     * </p>
     * 
     * @return The value against which the specified statistic is compared.
     */

    public Double getThreshold() {
        return this.threshold;
    }

    /**
     * <p>
     * The value against which the specified statistic is compared.
     * </p>
     * 
     * @param threshold
     *        The value against which the specified statistic is compared.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchAlarmDefinition withThreshold(Double threshold) {
        setThreshold(threshold);
        return this;
    }

    /**
     * <p>
     * The unit of measure associated with the CloudWatch metric being watched. The value specified for
     * <code>Unit</code> must correspond to the units specified in the CloudWatch metric.
     * </p>
     * 
     * @param unit
     *        The unit of measure associated with the CloudWatch metric being watched. The value specified for
     *        <code>Unit</code> must correspond to the units specified in the CloudWatch metric.
     * @see Unit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit of measure associated with the CloudWatch metric being watched. The value specified for
     * <code>Unit</code> must correspond to the units specified in the CloudWatch metric.
     * </p>
     * 
     * @return The unit of measure associated with the CloudWatch metric being watched. The value specified for
     *         <code>Unit</code> must correspond to the units specified in the CloudWatch metric.
     * @see Unit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit of measure associated with the CloudWatch metric being watched. The value specified for
     * <code>Unit</code> must correspond to the units specified in the CloudWatch metric.
     * </p>
     * 
     * @param unit
     *        The unit of measure associated with the CloudWatch metric being watched. The value specified for
     *        <code>Unit</code> must correspond to the units specified in the CloudWatch metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Unit
     */

    public CloudWatchAlarmDefinition withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * The unit of measure associated with the CloudWatch metric being watched. The value specified for
     * <code>Unit</code> must correspond to the units specified in the CloudWatch metric.
     * </p>
     * 
     * @param unit
     *        The unit of measure associated with the CloudWatch metric being watched. The value specified for
     *        <code>Unit</code> must correspond to the units specified in the CloudWatch metric.
     * @see Unit
     */

    public void setUnit(Unit unit) {
        withUnit(unit);
    }

    /**
     * <p>
     * The unit of measure associated with the CloudWatch metric being watched. The value specified for
     * <code>Unit</code> must correspond to the units specified in the CloudWatch metric.
     * </p>
     * 
     * @param unit
     *        The unit of measure associated with the CloudWatch metric being watched. The value specified for
     *        <code>Unit</code> must correspond to the units specified in the CloudWatch metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Unit
     */

    public CloudWatchAlarmDefinition withUnit(Unit unit) {
        this.unit = unit.toString();
        return this;
    }

    /**
     * <p>
     * A CloudWatch metric dimension.
     * </p>
     * 
     * @return A CloudWatch metric dimension.
     */

    public java.util.List<MetricDimension> getDimensions() {
        if (dimensions == null) {
            dimensions = new com.amazonaws.internal.SdkInternalList<MetricDimension>();
        }
        return dimensions;
    }

    /**
     * <p>
     * A CloudWatch metric dimension.
     * </p>
     * 
     * @param dimensions
     *        A CloudWatch metric dimension.
     */

    public void setDimensions(java.util.Collection<MetricDimension> dimensions) {
        if (dimensions == null) {
            this.dimensions = null;
            return;
        }

        this.dimensions = new com.amazonaws.internal.SdkInternalList<MetricDimension>(dimensions);
    }

    /**
     * <p>
     * A CloudWatch metric dimension.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDimensions(java.util.Collection)} or {@link #withDimensions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dimensions
     *        A CloudWatch metric dimension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchAlarmDefinition withDimensions(MetricDimension... dimensions) {
        if (this.dimensions == null) {
            setDimensions(new com.amazonaws.internal.SdkInternalList<MetricDimension>(dimensions.length));
        }
        for (MetricDimension ele : dimensions) {
            this.dimensions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A CloudWatch metric dimension.
     * </p>
     * 
     * @param dimensions
     *        A CloudWatch metric dimension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloudWatchAlarmDefinition withDimensions(java.util.Collection<MetricDimension> dimensions) {
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
        if (getComparisonOperator() != null)
            sb.append("ComparisonOperator: ").append(getComparisonOperator()).append(",");
        if (getEvaluationPeriods() != null)
            sb.append("EvaluationPeriods: ").append(getEvaluationPeriods()).append(",");
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getPeriod() != null)
            sb.append("Period: ").append(getPeriod()).append(",");
        if (getStatistic() != null)
            sb.append("Statistic: ").append(getStatistic()).append(",");
        if (getThreshold() != null)
            sb.append("Threshold: ").append(getThreshold()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit()).append(",");
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

        if (obj instanceof CloudWatchAlarmDefinition == false)
            return false;
        CloudWatchAlarmDefinition other = (CloudWatchAlarmDefinition) obj;
        if (other.getComparisonOperator() == null ^ this.getComparisonOperator() == null)
            return false;
        if (other.getComparisonOperator() != null && other.getComparisonOperator().equals(this.getComparisonOperator()) == false)
            return false;
        if (other.getEvaluationPeriods() == null ^ this.getEvaluationPeriods() == null)
            return false;
        if (other.getEvaluationPeriods() != null && other.getEvaluationPeriods().equals(this.getEvaluationPeriods()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        if (other.getStatistic() == null ^ this.getStatistic() == null)
            return false;
        if (other.getStatistic() != null && other.getStatistic().equals(this.getStatistic()) == false)
            return false;
        if (other.getThreshold() == null ^ this.getThreshold() == null)
            return false;
        if (other.getThreshold() != null && other.getThreshold().equals(this.getThreshold()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
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

        hashCode = prime * hashCode + ((getComparisonOperator() == null) ? 0 : getComparisonOperator().hashCode());
        hashCode = prime * hashCode + ((getEvaluationPeriods() == null) ? 0 : getEvaluationPeriods().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode + ((getStatistic() == null) ? 0 : getStatistic().hashCode());
        hashCode = prime * hashCode + ((getThreshold() == null) ? 0 : getThreshold().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        return hashCode;
    }

    @Override
    public CloudWatchAlarmDefinition clone() {
        try {
            return (CloudWatchAlarmDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.CloudWatchAlarmDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
