/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration based on which FinSpace will scale in or scale out nodes in your cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/AutoScalingConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoScalingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The lowest number of nodes to scale. This value must be at least 1 and less than the <code>maxNodeCount</code>.
     * If the nodes in a cluster belong to multiple availability zones, then <code>minNodeCount</code> must be at least
     * 3.
     * </p>
     */
    private Integer minNodeCount;
    /**
     * <p>
     * The highest number of nodes to scale. This value cannot be greater than 5.
     * </p>
     */
    private Integer maxNodeCount;
    /**
     * <p>
     * The metric your cluster will track in order to scale in and out. For example,
     * <code>CPU_UTILIZATION_PERCENTAGE</code> is the average CPU usage across all the nodes in a cluster.
     * </p>
     */
    private String autoScalingMetric;
    /**
     * <p>
     * The desired value of the chosen <code>autoScalingMetric</code>. When the metric drops below this value, the
     * cluster will scale in. When the metric goes above this value, the cluster will scale out. You can set the target
     * value between 1 and 100 percent.
     * </p>
     */
    private Double metricTarget;
    /**
     * <p>
     * The duration in seconds that FinSpace will wait after a scale in event before initiating another scaling event.
     * </p>
     */
    private Double scaleInCooldownSeconds;
    /**
     * <p>
     * The duration in seconds that FinSpace will wait after a scale out event before initiating another scaling event.
     * </p>
     */
    private Double scaleOutCooldownSeconds;

    /**
     * <p>
     * The lowest number of nodes to scale. This value must be at least 1 and less than the <code>maxNodeCount</code>.
     * If the nodes in a cluster belong to multiple availability zones, then <code>minNodeCount</code> must be at least
     * 3.
     * </p>
     * 
     * @param minNodeCount
     *        The lowest number of nodes to scale. This value must be at least 1 and less than the
     *        <code>maxNodeCount</code>. If the nodes in a cluster belong to multiple availability zones, then
     *        <code>minNodeCount</code> must be at least 3.
     */

    public void setMinNodeCount(Integer minNodeCount) {
        this.minNodeCount = minNodeCount;
    }

    /**
     * <p>
     * The lowest number of nodes to scale. This value must be at least 1 and less than the <code>maxNodeCount</code>.
     * If the nodes in a cluster belong to multiple availability zones, then <code>minNodeCount</code> must be at least
     * 3.
     * </p>
     * 
     * @return The lowest number of nodes to scale. This value must be at least 1 and less than the
     *         <code>maxNodeCount</code>. If the nodes in a cluster belong to multiple availability zones, then
     *         <code>minNodeCount</code> must be at least 3.
     */

    public Integer getMinNodeCount() {
        return this.minNodeCount;
    }

    /**
     * <p>
     * The lowest number of nodes to scale. This value must be at least 1 and less than the <code>maxNodeCount</code>.
     * If the nodes in a cluster belong to multiple availability zones, then <code>minNodeCount</code> must be at least
     * 3.
     * </p>
     * 
     * @param minNodeCount
     *        The lowest number of nodes to scale. This value must be at least 1 and less than the
     *        <code>maxNodeCount</code>. If the nodes in a cluster belong to multiple availability zones, then
     *        <code>minNodeCount</code> must be at least 3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingConfiguration withMinNodeCount(Integer minNodeCount) {
        setMinNodeCount(minNodeCount);
        return this;
    }

    /**
     * <p>
     * The highest number of nodes to scale. This value cannot be greater than 5.
     * </p>
     * 
     * @param maxNodeCount
     *        The highest number of nodes to scale. This value cannot be greater than 5.
     */

    public void setMaxNodeCount(Integer maxNodeCount) {
        this.maxNodeCount = maxNodeCount;
    }

    /**
     * <p>
     * The highest number of nodes to scale. This value cannot be greater than 5.
     * </p>
     * 
     * @return The highest number of nodes to scale. This value cannot be greater than 5.
     */

    public Integer getMaxNodeCount() {
        return this.maxNodeCount;
    }

    /**
     * <p>
     * The highest number of nodes to scale. This value cannot be greater than 5.
     * </p>
     * 
     * @param maxNodeCount
     *        The highest number of nodes to scale. This value cannot be greater than 5.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingConfiguration withMaxNodeCount(Integer maxNodeCount) {
        setMaxNodeCount(maxNodeCount);
        return this;
    }

    /**
     * <p>
     * The metric your cluster will track in order to scale in and out. For example,
     * <code>CPU_UTILIZATION_PERCENTAGE</code> is the average CPU usage across all the nodes in a cluster.
     * </p>
     * 
     * @param autoScalingMetric
     *        The metric your cluster will track in order to scale in and out. For example,
     *        <code>CPU_UTILIZATION_PERCENTAGE</code> is the average CPU usage across all the nodes in a cluster.
     * @see AutoScalingMetric
     */

    public void setAutoScalingMetric(String autoScalingMetric) {
        this.autoScalingMetric = autoScalingMetric;
    }

    /**
     * <p>
     * The metric your cluster will track in order to scale in and out. For example,
     * <code>CPU_UTILIZATION_PERCENTAGE</code> is the average CPU usage across all the nodes in a cluster.
     * </p>
     * 
     * @return The metric your cluster will track in order to scale in and out. For example,
     *         <code>CPU_UTILIZATION_PERCENTAGE</code> is the average CPU usage across all the nodes in a cluster.
     * @see AutoScalingMetric
     */

    public String getAutoScalingMetric() {
        return this.autoScalingMetric;
    }

    /**
     * <p>
     * The metric your cluster will track in order to scale in and out. For example,
     * <code>CPU_UTILIZATION_PERCENTAGE</code> is the average CPU usage across all the nodes in a cluster.
     * </p>
     * 
     * @param autoScalingMetric
     *        The metric your cluster will track in order to scale in and out. For example,
     *        <code>CPU_UTILIZATION_PERCENTAGE</code> is the average CPU usage across all the nodes in a cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoScalingMetric
     */

    public AutoScalingConfiguration withAutoScalingMetric(String autoScalingMetric) {
        setAutoScalingMetric(autoScalingMetric);
        return this;
    }

    /**
     * <p>
     * The metric your cluster will track in order to scale in and out. For example,
     * <code>CPU_UTILIZATION_PERCENTAGE</code> is the average CPU usage across all the nodes in a cluster.
     * </p>
     * 
     * @param autoScalingMetric
     *        The metric your cluster will track in order to scale in and out. For example,
     *        <code>CPU_UTILIZATION_PERCENTAGE</code> is the average CPU usage across all the nodes in a cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoScalingMetric
     */

    public AutoScalingConfiguration withAutoScalingMetric(AutoScalingMetric autoScalingMetric) {
        this.autoScalingMetric = autoScalingMetric.toString();
        return this;
    }

    /**
     * <p>
     * The desired value of the chosen <code>autoScalingMetric</code>. When the metric drops below this value, the
     * cluster will scale in. When the metric goes above this value, the cluster will scale out. You can set the target
     * value between 1 and 100 percent.
     * </p>
     * 
     * @param metricTarget
     *        The desired value of the chosen <code>autoScalingMetric</code>. When the metric drops below this value,
     *        the cluster will scale in. When the metric goes above this value, the cluster will scale out. You can set
     *        the target value between 1 and 100 percent.
     */

    public void setMetricTarget(Double metricTarget) {
        this.metricTarget = metricTarget;
    }

    /**
     * <p>
     * The desired value of the chosen <code>autoScalingMetric</code>. When the metric drops below this value, the
     * cluster will scale in. When the metric goes above this value, the cluster will scale out. You can set the target
     * value between 1 and 100 percent.
     * </p>
     * 
     * @return The desired value of the chosen <code>autoScalingMetric</code>. When the metric drops below this value,
     *         the cluster will scale in. When the metric goes above this value, the cluster will scale out. You can set
     *         the target value between 1 and 100 percent.
     */

    public Double getMetricTarget() {
        return this.metricTarget;
    }

    /**
     * <p>
     * The desired value of the chosen <code>autoScalingMetric</code>. When the metric drops below this value, the
     * cluster will scale in. When the metric goes above this value, the cluster will scale out. You can set the target
     * value between 1 and 100 percent.
     * </p>
     * 
     * @param metricTarget
     *        The desired value of the chosen <code>autoScalingMetric</code>. When the metric drops below this value,
     *        the cluster will scale in. When the metric goes above this value, the cluster will scale out. You can set
     *        the target value between 1 and 100 percent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingConfiguration withMetricTarget(Double metricTarget) {
        setMetricTarget(metricTarget);
        return this;
    }

    /**
     * <p>
     * The duration in seconds that FinSpace will wait after a scale in event before initiating another scaling event.
     * </p>
     * 
     * @param scaleInCooldownSeconds
     *        The duration in seconds that FinSpace will wait after a scale in event before initiating another scaling
     *        event.
     */

    public void setScaleInCooldownSeconds(Double scaleInCooldownSeconds) {
        this.scaleInCooldownSeconds = scaleInCooldownSeconds;
    }

    /**
     * <p>
     * The duration in seconds that FinSpace will wait after a scale in event before initiating another scaling event.
     * </p>
     * 
     * @return The duration in seconds that FinSpace will wait after a scale in event before initiating another scaling
     *         event.
     */

    public Double getScaleInCooldownSeconds() {
        return this.scaleInCooldownSeconds;
    }

    /**
     * <p>
     * The duration in seconds that FinSpace will wait after a scale in event before initiating another scaling event.
     * </p>
     * 
     * @param scaleInCooldownSeconds
     *        The duration in seconds that FinSpace will wait after a scale in event before initiating another scaling
     *        event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingConfiguration withScaleInCooldownSeconds(Double scaleInCooldownSeconds) {
        setScaleInCooldownSeconds(scaleInCooldownSeconds);
        return this;
    }

    /**
     * <p>
     * The duration in seconds that FinSpace will wait after a scale out event before initiating another scaling event.
     * </p>
     * 
     * @param scaleOutCooldownSeconds
     *        The duration in seconds that FinSpace will wait after a scale out event before initiating another scaling
     *        event.
     */

    public void setScaleOutCooldownSeconds(Double scaleOutCooldownSeconds) {
        this.scaleOutCooldownSeconds = scaleOutCooldownSeconds;
    }

    /**
     * <p>
     * The duration in seconds that FinSpace will wait after a scale out event before initiating another scaling event.
     * </p>
     * 
     * @return The duration in seconds that FinSpace will wait after a scale out event before initiating another scaling
     *         event.
     */

    public Double getScaleOutCooldownSeconds() {
        return this.scaleOutCooldownSeconds;
    }

    /**
     * <p>
     * The duration in seconds that FinSpace will wait after a scale out event before initiating another scaling event.
     * </p>
     * 
     * @param scaleOutCooldownSeconds
     *        The duration in seconds that FinSpace will wait after a scale out event before initiating another scaling
     *        event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoScalingConfiguration withScaleOutCooldownSeconds(Double scaleOutCooldownSeconds) {
        setScaleOutCooldownSeconds(scaleOutCooldownSeconds);
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
        if (getMinNodeCount() != null)
            sb.append("MinNodeCount: ").append(getMinNodeCount()).append(",");
        if (getMaxNodeCount() != null)
            sb.append("MaxNodeCount: ").append(getMaxNodeCount()).append(",");
        if (getAutoScalingMetric() != null)
            sb.append("AutoScalingMetric: ").append(getAutoScalingMetric()).append(",");
        if (getMetricTarget() != null)
            sb.append("MetricTarget: ").append(getMetricTarget()).append(",");
        if (getScaleInCooldownSeconds() != null)
            sb.append("ScaleInCooldownSeconds: ").append(getScaleInCooldownSeconds()).append(",");
        if (getScaleOutCooldownSeconds() != null)
            sb.append("ScaleOutCooldownSeconds: ").append(getScaleOutCooldownSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoScalingConfiguration == false)
            return false;
        AutoScalingConfiguration other = (AutoScalingConfiguration) obj;
        if (other.getMinNodeCount() == null ^ this.getMinNodeCount() == null)
            return false;
        if (other.getMinNodeCount() != null && other.getMinNodeCount().equals(this.getMinNodeCount()) == false)
            return false;
        if (other.getMaxNodeCount() == null ^ this.getMaxNodeCount() == null)
            return false;
        if (other.getMaxNodeCount() != null && other.getMaxNodeCount().equals(this.getMaxNodeCount()) == false)
            return false;
        if (other.getAutoScalingMetric() == null ^ this.getAutoScalingMetric() == null)
            return false;
        if (other.getAutoScalingMetric() != null && other.getAutoScalingMetric().equals(this.getAutoScalingMetric()) == false)
            return false;
        if (other.getMetricTarget() == null ^ this.getMetricTarget() == null)
            return false;
        if (other.getMetricTarget() != null && other.getMetricTarget().equals(this.getMetricTarget()) == false)
            return false;
        if (other.getScaleInCooldownSeconds() == null ^ this.getScaleInCooldownSeconds() == null)
            return false;
        if (other.getScaleInCooldownSeconds() != null && other.getScaleInCooldownSeconds().equals(this.getScaleInCooldownSeconds()) == false)
            return false;
        if (other.getScaleOutCooldownSeconds() == null ^ this.getScaleOutCooldownSeconds() == null)
            return false;
        if (other.getScaleOutCooldownSeconds() != null && other.getScaleOutCooldownSeconds().equals(this.getScaleOutCooldownSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMinNodeCount() == null) ? 0 : getMinNodeCount().hashCode());
        hashCode = prime * hashCode + ((getMaxNodeCount() == null) ? 0 : getMaxNodeCount().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingMetric() == null) ? 0 : getAutoScalingMetric().hashCode());
        hashCode = prime * hashCode + ((getMetricTarget() == null) ? 0 : getMetricTarget().hashCode());
        hashCode = prime * hashCode + ((getScaleInCooldownSeconds() == null) ? 0 : getScaleInCooldownSeconds().hashCode());
        hashCode = prime * hashCode + ((getScaleOutCooldownSeconds() == null) ? 0 : getScaleOutCooldownSeconds().hashCode());
        return hashCode;
    }

    @Override
    public AutoScalingConfiguration clone() {
        try {
            return (AutoScalingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.finspace.model.transform.AutoScalingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
