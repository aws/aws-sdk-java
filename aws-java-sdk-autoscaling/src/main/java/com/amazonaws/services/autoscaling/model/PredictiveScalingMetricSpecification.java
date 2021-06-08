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
 * This structure specifies the metrics and target utilization settings for a predictive scaling policy.
 * </p>
 * <p>
 * You must specify either a metric pair, or a load metric and a scaling metric individually. Specifying a metric pair
 * instead of individual metrics provides a simpler way to configure metrics for a scaling policy. You choose the metric
 * pair, and the policy automatically knows the correct sum and average statistics to use for the load metric and the
 * scaling metric.
 * </p>
 * <p>
 * Example
 * </p>
 * <ul>
 * <li>
 * <p>
 * You create a predictive scaling policy and specify <code>ALBRequestCount</code> as the value for the metric pair and
 * <code>1000.0</code> as the target value. For this type of metric, you must provide the metric dimension for the
 * corresponding target group, so you also provide a resource label for the Application Load Balancer target group that
 * is attached to your Auto Scaling group.
 * </p>
 * </li>
 * <li>
 * <p>
 * The number of requests the target group receives per minute provides the load metric, and the request count averaged
 * between the members of the target group provides the scaling metric. In CloudWatch, this refers to the
 * <code>RequestCount</code> and <code>RequestCountPerTarget</code> metrics, respectively.
 * </p>
 * </li>
 * <li>
 * <p>
 * For optimal use of predictive scaling, you adhere to the best practice of using a dynamic scaling policy to
 * automatically scale between the minimum capacity and maximum capacity in response to real-time changes in resource
 * utilization.
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon EC2 Auto Scaling consumes data points for the load metric over the last 14 days and creates an hourly load
 * forecast for predictive scaling. (A minimum of 24 hours of data is required.)
 * </p>
 * </li>
 * <li>
 * <p>
 * After creating the load forecast, Amazon EC2 Auto Scaling determines when to reduce or increase the capacity of your
 * Auto Scaling group in each hour of the forecast period so that the average number of requests received by each
 * instance is as close to 1000 requests per minute as possible at all times.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/PredictiveScalingMetricSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PredictiveScalingMetricSpecification implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the target utilization.
     * </p>
     */
    private Double targetValue;
    /**
     * <p>
     * The metric pair specification from which Amazon EC2 Auto Scaling determines the appropriate scaling metric and
     * load metric to use.
     * </p>
     */
    private PredictiveScalingPredefinedMetricPair predefinedMetricPairSpecification;
    /**
     * <p>
     * The scaling metric specification.
     * </p>
     */
    private PredictiveScalingPredefinedScalingMetric predefinedScalingMetricSpecification;
    /**
     * <p>
     * The load metric specification.
     * </p>
     */
    private PredictiveScalingPredefinedLoadMetric predefinedLoadMetricSpecification;

    /**
     * <p>
     * Specifies the target utilization.
     * </p>
     * 
     * @param targetValue
     *        Specifies the target utilization.
     */

    public void setTargetValue(Double targetValue) {
        this.targetValue = targetValue;
    }

    /**
     * <p>
     * Specifies the target utilization.
     * </p>
     * 
     * @return Specifies the target utilization.
     */

    public Double getTargetValue() {
        return this.targetValue;
    }

    /**
     * <p>
     * Specifies the target utilization.
     * </p>
     * 
     * @param targetValue
     *        Specifies the target utilization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictiveScalingMetricSpecification withTargetValue(Double targetValue) {
        setTargetValue(targetValue);
        return this;
    }

    /**
     * <p>
     * The metric pair specification from which Amazon EC2 Auto Scaling determines the appropriate scaling metric and
     * load metric to use.
     * </p>
     * 
     * @param predefinedMetricPairSpecification
     *        The metric pair specification from which Amazon EC2 Auto Scaling determines the appropriate scaling metric
     *        and load metric to use.
     */

    public void setPredefinedMetricPairSpecification(PredictiveScalingPredefinedMetricPair predefinedMetricPairSpecification) {
        this.predefinedMetricPairSpecification = predefinedMetricPairSpecification;
    }

    /**
     * <p>
     * The metric pair specification from which Amazon EC2 Auto Scaling determines the appropriate scaling metric and
     * load metric to use.
     * </p>
     * 
     * @return The metric pair specification from which Amazon EC2 Auto Scaling determines the appropriate scaling
     *         metric and load metric to use.
     */

    public PredictiveScalingPredefinedMetricPair getPredefinedMetricPairSpecification() {
        return this.predefinedMetricPairSpecification;
    }

    /**
     * <p>
     * The metric pair specification from which Amazon EC2 Auto Scaling determines the appropriate scaling metric and
     * load metric to use.
     * </p>
     * 
     * @param predefinedMetricPairSpecification
     *        The metric pair specification from which Amazon EC2 Auto Scaling determines the appropriate scaling metric
     *        and load metric to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictiveScalingMetricSpecification withPredefinedMetricPairSpecification(PredictiveScalingPredefinedMetricPair predefinedMetricPairSpecification) {
        setPredefinedMetricPairSpecification(predefinedMetricPairSpecification);
        return this;
    }

    /**
     * <p>
     * The scaling metric specification.
     * </p>
     * 
     * @param predefinedScalingMetricSpecification
     *        The scaling metric specification.
     */

    public void setPredefinedScalingMetricSpecification(PredictiveScalingPredefinedScalingMetric predefinedScalingMetricSpecification) {
        this.predefinedScalingMetricSpecification = predefinedScalingMetricSpecification;
    }

    /**
     * <p>
     * The scaling metric specification.
     * </p>
     * 
     * @return The scaling metric specification.
     */

    public PredictiveScalingPredefinedScalingMetric getPredefinedScalingMetricSpecification() {
        return this.predefinedScalingMetricSpecification;
    }

    /**
     * <p>
     * The scaling metric specification.
     * </p>
     * 
     * @param predefinedScalingMetricSpecification
     *        The scaling metric specification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictiveScalingMetricSpecification withPredefinedScalingMetricSpecification(
            PredictiveScalingPredefinedScalingMetric predefinedScalingMetricSpecification) {
        setPredefinedScalingMetricSpecification(predefinedScalingMetricSpecification);
        return this;
    }

    /**
     * <p>
     * The load metric specification.
     * </p>
     * 
     * @param predefinedLoadMetricSpecification
     *        The load metric specification.
     */

    public void setPredefinedLoadMetricSpecification(PredictiveScalingPredefinedLoadMetric predefinedLoadMetricSpecification) {
        this.predefinedLoadMetricSpecification = predefinedLoadMetricSpecification;
    }

    /**
     * <p>
     * The load metric specification.
     * </p>
     * 
     * @return The load metric specification.
     */

    public PredictiveScalingPredefinedLoadMetric getPredefinedLoadMetricSpecification() {
        return this.predefinedLoadMetricSpecification;
    }

    /**
     * <p>
     * The load metric specification.
     * </p>
     * 
     * @param predefinedLoadMetricSpecification
     *        The load metric specification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictiveScalingMetricSpecification withPredefinedLoadMetricSpecification(PredictiveScalingPredefinedLoadMetric predefinedLoadMetricSpecification) {
        setPredefinedLoadMetricSpecification(predefinedLoadMetricSpecification);
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
        if (getTargetValue() != null)
            sb.append("TargetValue: ").append(getTargetValue()).append(",");
        if (getPredefinedMetricPairSpecification() != null)
            sb.append("PredefinedMetricPairSpecification: ").append(getPredefinedMetricPairSpecification()).append(",");
        if (getPredefinedScalingMetricSpecification() != null)
            sb.append("PredefinedScalingMetricSpecification: ").append(getPredefinedScalingMetricSpecification()).append(",");
        if (getPredefinedLoadMetricSpecification() != null)
            sb.append("PredefinedLoadMetricSpecification: ").append(getPredefinedLoadMetricSpecification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PredictiveScalingMetricSpecification == false)
            return false;
        PredictiveScalingMetricSpecification other = (PredictiveScalingMetricSpecification) obj;
        if (other.getTargetValue() == null ^ this.getTargetValue() == null)
            return false;
        if (other.getTargetValue() != null && other.getTargetValue().equals(this.getTargetValue()) == false)
            return false;
        if (other.getPredefinedMetricPairSpecification() == null ^ this.getPredefinedMetricPairSpecification() == null)
            return false;
        if (other.getPredefinedMetricPairSpecification() != null
                && other.getPredefinedMetricPairSpecification().equals(this.getPredefinedMetricPairSpecification()) == false)
            return false;
        if (other.getPredefinedScalingMetricSpecification() == null ^ this.getPredefinedScalingMetricSpecification() == null)
            return false;
        if (other.getPredefinedScalingMetricSpecification() != null
                && other.getPredefinedScalingMetricSpecification().equals(this.getPredefinedScalingMetricSpecification()) == false)
            return false;
        if (other.getPredefinedLoadMetricSpecification() == null ^ this.getPredefinedLoadMetricSpecification() == null)
            return false;
        if (other.getPredefinedLoadMetricSpecification() != null
                && other.getPredefinedLoadMetricSpecification().equals(this.getPredefinedLoadMetricSpecification()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetValue() == null) ? 0 : getTargetValue().hashCode());
        hashCode = prime * hashCode + ((getPredefinedMetricPairSpecification() == null) ? 0 : getPredefinedMetricPairSpecification().hashCode());
        hashCode = prime * hashCode + ((getPredefinedScalingMetricSpecification() == null) ? 0 : getPredefinedScalingMetricSpecification().hashCode());
        hashCode = prime * hashCode + ((getPredefinedLoadMetricSpecification() == null) ? 0 : getPredefinedLoadMetricSpecification().hashCode());
        return hashCode;
    }

    @Override
    public PredictiveScalingMetricSpecification clone() {
        try {
            return (PredictiveScalingMetricSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
