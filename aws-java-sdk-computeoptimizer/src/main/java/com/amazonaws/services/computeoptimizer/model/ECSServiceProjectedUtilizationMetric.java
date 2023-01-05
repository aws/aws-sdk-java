/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the projected utilization metrics of an Amazon ECS service recommendation option.
 * </p>
 * <p>
 * To determine the performance difference between your current ECS service and the recommended option, compare the
 * utilization metric data of your service against its projected utilization metric data.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/ECSServiceProjectedUtilizationMetric"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ECSServiceProjectedUtilizationMetric implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the projected utilization metric.
     * </p>
     * <p>
     * The following utilization metrics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CPU</code> — The percentage of allocated compute units that are currently in use on the ECS service tasks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Memory</code> — The percentage of memory that is currently in use on the ECS service tasks.
     * </p>
     * </li>
     * </ul>
     */
    private String name;
    /**
     * <p>
     * The statistic of the projected utilization metric.
     * </p>
     * <p>
     * The Compute Optimizer API, Command Line Interface (CLI), and SDKs return utilization metrics using only the
     * <code>Maximum</code> statistic, which is the highest value observed during the specified period.
     * </p>
     * <p>
     * The Compute Optimizer console displays graphs for some utilization metrics using the <code>Average</code>
     * statistic, which is the value of <code>Sum</code> / <code>SampleCount</code> during the specified period. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/viewing-recommendations.html">Viewing resource
     * recommendations</a> in the <i>Compute Optimizer User Guide</i>. You can also get averaged utilization metric data
     * for your resources using Amazon CloudWatch. For more information, see the <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/WhatIsCloudWatch.html">Amazon CloudWatch
     * User Guide</a>.
     * </p>
     */
    private String statistic;
    /**
     * <p>
     * The lower bound values for the projected utilization metrics.
     * </p>
     */
    private Double lowerBoundValue;
    /**
     * <p>
     * The upper bound values for the projected utilization metrics.
     * </p>
     */
    private Double upperBoundValue;

    /**
     * <p>
     * The name of the projected utilization metric.
     * </p>
     * <p>
     * The following utilization metrics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CPU</code> — The percentage of allocated compute units that are currently in use on the ECS service tasks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Memory</code> — The percentage of memory that is currently in use on the ECS service tasks.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The name of the projected utilization metric. </p>
     *        <p>
     *        The following utilization metrics are available:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CPU</code> — The percentage of allocated compute units that are currently in use on the ECS service
     *        tasks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Memory</code> — The percentage of memory that is currently in use on the ECS service tasks.
     *        </p>
     *        </li>
     * @see ECSServiceMetricName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the projected utilization metric.
     * </p>
     * <p>
     * The following utilization metrics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CPU</code> — The percentage of allocated compute units that are currently in use on the ECS service tasks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Memory</code> — The percentage of memory that is currently in use on the ECS service tasks.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the projected utilization metric. </p>
     *         <p>
     *         The following utilization metrics are available:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CPU</code> — The percentage of allocated compute units that are currently in use on the ECS service
     *         tasks.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Memory</code> — The percentage of memory that is currently in use on the ECS service tasks.
     *         </p>
     *         </li>
     * @see ECSServiceMetricName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the projected utilization metric.
     * </p>
     * <p>
     * The following utilization metrics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CPU</code> — The percentage of allocated compute units that are currently in use on the ECS service tasks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Memory</code> — The percentage of memory that is currently in use on the ECS service tasks.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The name of the projected utilization metric. </p>
     *        <p>
     *        The following utilization metrics are available:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CPU</code> — The percentage of allocated compute units that are currently in use on the ECS service
     *        tasks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Memory</code> — The percentage of memory that is currently in use on the ECS service tasks.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ECSServiceMetricName
     */

    public ECSServiceProjectedUtilizationMetric withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the projected utilization metric.
     * </p>
     * <p>
     * The following utilization metrics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CPU</code> — The percentage of allocated compute units that are currently in use on the ECS service tasks.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Memory</code> — The percentage of memory that is currently in use on the ECS service tasks.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The name of the projected utilization metric. </p>
     *        <p>
     *        The following utilization metrics are available:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CPU</code> — The percentage of allocated compute units that are currently in use on the ECS service
     *        tasks.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Memory</code> — The percentage of memory that is currently in use on the ECS service tasks.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ECSServiceMetricName
     */

    public ECSServiceProjectedUtilizationMetric withName(ECSServiceMetricName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The statistic of the projected utilization metric.
     * </p>
     * <p>
     * The Compute Optimizer API, Command Line Interface (CLI), and SDKs return utilization metrics using only the
     * <code>Maximum</code> statistic, which is the highest value observed during the specified period.
     * </p>
     * <p>
     * The Compute Optimizer console displays graphs for some utilization metrics using the <code>Average</code>
     * statistic, which is the value of <code>Sum</code> / <code>SampleCount</code> during the specified period. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/viewing-recommendations.html">Viewing resource
     * recommendations</a> in the <i>Compute Optimizer User Guide</i>. You can also get averaged utilization metric data
     * for your resources using Amazon CloudWatch. For more information, see the <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/WhatIsCloudWatch.html">Amazon CloudWatch
     * User Guide</a>.
     * </p>
     * 
     * @param statistic
     *        The statistic of the projected utilization metric.</p>
     *        <p>
     *        The Compute Optimizer API, Command Line Interface (CLI), and SDKs return utilization metrics using only
     *        the <code>Maximum</code> statistic, which is the highest value observed during the specified period.
     *        </p>
     *        <p>
     *        The Compute Optimizer console displays graphs for some utilization metrics using the <code>Average</code>
     *        statistic, which is the value of <code>Sum</code> / <code>SampleCount</code> during the specified period.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/viewing-recommendations.html">Viewing
     *        resource recommendations</a> in the <i>Compute Optimizer User Guide</i>. You can also get averaged
     *        utilization metric data for your resources using Amazon CloudWatch. For more information, see the <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/WhatIsCloudWatch.html">Amazon
     *        CloudWatch User Guide</a>.
     * @see ECSServiceMetricStatistic
     */

    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }

    /**
     * <p>
     * The statistic of the projected utilization metric.
     * </p>
     * <p>
     * The Compute Optimizer API, Command Line Interface (CLI), and SDKs return utilization metrics using only the
     * <code>Maximum</code> statistic, which is the highest value observed during the specified period.
     * </p>
     * <p>
     * The Compute Optimizer console displays graphs for some utilization metrics using the <code>Average</code>
     * statistic, which is the value of <code>Sum</code> / <code>SampleCount</code> during the specified period. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/viewing-recommendations.html">Viewing resource
     * recommendations</a> in the <i>Compute Optimizer User Guide</i>. You can also get averaged utilization metric data
     * for your resources using Amazon CloudWatch. For more information, see the <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/WhatIsCloudWatch.html">Amazon CloudWatch
     * User Guide</a>.
     * </p>
     * 
     * @return The statistic of the projected utilization metric.</p>
     *         <p>
     *         The Compute Optimizer API, Command Line Interface (CLI), and SDKs return utilization metrics using only
     *         the <code>Maximum</code> statistic, which is the highest value observed during the specified period.
     *         </p>
     *         <p>
     *         The Compute Optimizer console displays graphs for some utilization metrics using the <code>Average</code>
     *         statistic, which is the value of <code>Sum</code> / <code>SampleCount</code> during the specified period.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/viewing-recommendations.html">Viewing
     *         resource recommendations</a> in the <i>Compute Optimizer User Guide</i>. You can also get averaged
     *         utilization metric data for your resources using Amazon CloudWatch. For more information, see the <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/WhatIsCloudWatch.html">Amazon
     *         CloudWatch User Guide</a>.
     * @see ECSServiceMetricStatistic
     */

    public String getStatistic() {
        return this.statistic;
    }

    /**
     * <p>
     * The statistic of the projected utilization metric.
     * </p>
     * <p>
     * The Compute Optimizer API, Command Line Interface (CLI), and SDKs return utilization metrics using only the
     * <code>Maximum</code> statistic, which is the highest value observed during the specified period.
     * </p>
     * <p>
     * The Compute Optimizer console displays graphs for some utilization metrics using the <code>Average</code>
     * statistic, which is the value of <code>Sum</code> / <code>SampleCount</code> during the specified period. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/viewing-recommendations.html">Viewing resource
     * recommendations</a> in the <i>Compute Optimizer User Guide</i>. You can also get averaged utilization metric data
     * for your resources using Amazon CloudWatch. For more information, see the <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/WhatIsCloudWatch.html">Amazon CloudWatch
     * User Guide</a>.
     * </p>
     * 
     * @param statistic
     *        The statistic of the projected utilization metric.</p>
     *        <p>
     *        The Compute Optimizer API, Command Line Interface (CLI), and SDKs return utilization metrics using only
     *        the <code>Maximum</code> statistic, which is the highest value observed during the specified period.
     *        </p>
     *        <p>
     *        The Compute Optimizer console displays graphs for some utilization metrics using the <code>Average</code>
     *        statistic, which is the value of <code>Sum</code> / <code>SampleCount</code> during the specified period.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/viewing-recommendations.html">Viewing
     *        resource recommendations</a> in the <i>Compute Optimizer User Guide</i>. You can also get averaged
     *        utilization metric data for your resources using Amazon CloudWatch. For more information, see the <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/WhatIsCloudWatch.html">Amazon
     *        CloudWatch User Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ECSServiceMetricStatistic
     */

    public ECSServiceProjectedUtilizationMetric withStatistic(String statistic) {
        setStatistic(statistic);
        return this;
    }

    /**
     * <p>
     * The statistic of the projected utilization metric.
     * </p>
     * <p>
     * The Compute Optimizer API, Command Line Interface (CLI), and SDKs return utilization metrics using only the
     * <code>Maximum</code> statistic, which is the highest value observed during the specified period.
     * </p>
     * <p>
     * The Compute Optimizer console displays graphs for some utilization metrics using the <code>Average</code>
     * statistic, which is the value of <code>Sum</code> / <code>SampleCount</code> during the specified period. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/viewing-recommendations.html">Viewing resource
     * recommendations</a> in the <i>Compute Optimizer User Guide</i>. You can also get averaged utilization metric data
     * for your resources using Amazon CloudWatch. For more information, see the <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/WhatIsCloudWatch.html">Amazon CloudWatch
     * User Guide</a>.
     * </p>
     * 
     * @param statistic
     *        The statistic of the projected utilization metric.</p>
     *        <p>
     *        The Compute Optimizer API, Command Line Interface (CLI), and SDKs return utilization metrics using only
     *        the <code>Maximum</code> statistic, which is the highest value observed during the specified period.
     *        </p>
     *        <p>
     *        The Compute Optimizer console displays graphs for some utilization metrics using the <code>Average</code>
     *        statistic, which is the value of <code>Sum</code> / <code>SampleCount</code> during the specified period.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/viewing-recommendations.html">Viewing
     *        resource recommendations</a> in the <i>Compute Optimizer User Guide</i>. You can also get averaged
     *        utilization metric data for your resources using Amazon CloudWatch. For more information, see the <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/WhatIsCloudWatch.html">Amazon
     *        CloudWatch User Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ECSServiceMetricStatistic
     */

    public ECSServiceProjectedUtilizationMetric withStatistic(ECSServiceMetricStatistic statistic) {
        this.statistic = statistic.toString();
        return this;
    }

    /**
     * <p>
     * The lower bound values for the projected utilization metrics.
     * </p>
     * 
     * @param lowerBoundValue
     *        The lower bound values for the projected utilization metrics.
     */

    public void setLowerBoundValue(Double lowerBoundValue) {
        this.lowerBoundValue = lowerBoundValue;
    }

    /**
     * <p>
     * The lower bound values for the projected utilization metrics.
     * </p>
     * 
     * @return The lower bound values for the projected utilization metrics.
     */

    public Double getLowerBoundValue() {
        return this.lowerBoundValue;
    }

    /**
     * <p>
     * The lower bound values for the projected utilization metrics.
     * </p>
     * 
     * @param lowerBoundValue
     *        The lower bound values for the projected utilization metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSServiceProjectedUtilizationMetric withLowerBoundValue(Double lowerBoundValue) {
        setLowerBoundValue(lowerBoundValue);
        return this;
    }

    /**
     * <p>
     * The upper bound values for the projected utilization metrics.
     * </p>
     * 
     * @param upperBoundValue
     *        The upper bound values for the projected utilization metrics.
     */

    public void setUpperBoundValue(Double upperBoundValue) {
        this.upperBoundValue = upperBoundValue;
    }

    /**
     * <p>
     * The upper bound values for the projected utilization metrics.
     * </p>
     * 
     * @return The upper bound values for the projected utilization metrics.
     */

    public Double getUpperBoundValue() {
        return this.upperBoundValue;
    }

    /**
     * <p>
     * The upper bound values for the projected utilization metrics.
     * </p>
     * 
     * @param upperBoundValue
     *        The upper bound values for the projected utilization metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ECSServiceProjectedUtilizationMetric withUpperBoundValue(Double upperBoundValue) {
        setUpperBoundValue(upperBoundValue);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatistic() != null)
            sb.append("Statistic: ").append(getStatistic()).append(",");
        if (getLowerBoundValue() != null)
            sb.append("LowerBoundValue: ").append(getLowerBoundValue()).append(",");
        if (getUpperBoundValue() != null)
            sb.append("UpperBoundValue: ").append(getUpperBoundValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ECSServiceProjectedUtilizationMetric == false)
            return false;
        ECSServiceProjectedUtilizationMetric other = (ECSServiceProjectedUtilizationMetric) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatistic() == null ^ this.getStatistic() == null)
            return false;
        if (other.getStatistic() != null && other.getStatistic().equals(this.getStatistic()) == false)
            return false;
        if (other.getLowerBoundValue() == null ^ this.getLowerBoundValue() == null)
            return false;
        if (other.getLowerBoundValue() != null && other.getLowerBoundValue().equals(this.getLowerBoundValue()) == false)
            return false;
        if (other.getUpperBoundValue() == null ^ this.getUpperBoundValue() == null)
            return false;
        if (other.getUpperBoundValue() != null && other.getUpperBoundValue().equals(this.getUpperBoundValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatistic() == null) ? 0 : getStatistic().hashCode());
        hashCode = prime * hashCode + ((getLowerBoundValue() == null) ? 0 : getLowerBoundValue().hashCode());
        hashCode = prime * hashCode + ((getUpperBoundValue() == null) ? 0 : getUpperBoundValue().hashCode());
        return hashCode;
    }

    @Override
    public ECSServiceProjectedUtilizationMetric clone() {
        try {
            return (ECSServiceProjectedUtilizationMetric) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.ECSServiceProjectedUtilizationMetricMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
