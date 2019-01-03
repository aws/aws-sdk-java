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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/EnableMetricsCollection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnableMetricsCollectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * One or more of the following metrics. If you omit this parameter, all metrics are enabled.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GroupMinSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupMaxSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupDesiredCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupInServiceInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupPendingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupStandbyInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTerminatingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTotalInstances</code>
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<String> metrics;
    /**
     * <p>
     * The granularity to associate with the metrics to collect. The only valid value is <code>1Minute</code>.
     * </p>
     */
    private String granularity;

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group.
     */

    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @return The name of the Auto Scaling group.
     */

    public String getAutoScalingGroupName() {
        return this.autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableMetricsCollectionRequest withAutoScalingGroupName(String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * One or more of the following metrics. If you omit this parameter, all metrics are enabled.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GroupMinSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupMaxSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupDesiredCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupInServiceInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupPendingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupStandbyInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTerminatingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTotalInstances</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more of the following metrics. If you omit this parameter, all metrics are enabled.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>GroupMinSize</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupMaxSize</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupDesiredCapacity</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupInServiceInstances</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupPendingInstances</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupStandbyInstances</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupTerminatingInstances</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GroupTotalInstances</code>
     *         </p>
     *         </li>
     */

    public java.util.List<String> getMetrics() {
        if (metrics == null) {
            metrics = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return metrics;
    }

    /**
     * <p>
     * One or more of the following metrics. If you omit this parameter, all metrics are enabled.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GroupMinSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupMaxSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupDesiredCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupInServiceInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupPendingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupStandbyInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTerminatingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTotalInstances</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param metrics
     *        One or more of the following metrics. If you omit this parameter, all metrics are enabled.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>GroupMinSize</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupMaxSize</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupDesiredCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupInServiceInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupPendingInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupStandbyInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupTerminatingInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupTotalInstances</code>
     *        </p>
     *        </li>
     */

    public void setMetrics(java.util.Collection<String> metrics) {
        if (metrics == null) {
            this.metrics = null;
            return;
        }

        this.metrics = new com.amazonaws.internal.SdkInternalList<String>(metrics);
    }

    /**
     * <p>
     * One or more of the following metrics. If you omit this parameter, all metrics are enabled.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GroupMinSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupMaxSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupDesiredCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupInServiceInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupPendingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupStandbyInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTerminatingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTotalInstances</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetrics(java.util.Collection)} or {@link #withMetrics(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param metrics
     *        One or more of the following metrics. If you omit this parameter, all metrics are enabled.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>GroupMinSize</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupMaxSize</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupDesiredCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupInServiceInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupPendingInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupStandbyInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupTerminatingInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupTotalInstances</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableMetricsCollectionRequest withMetrics(String... metrics) {
        if (this.metrics == null) {
            setMetrics(new com.amazonaws.internal.SdkInternalList<String>(metrics.length));
        }
        for (String ele : metrics) {
            this.metrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more of the following metrics. If you omit this parameter, all metrics are enabled.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GroupMinSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupMaxSize</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupDesiredCapacity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupInServiceInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupPendingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupStandbyInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTerminatingInstances</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GroupTotalInstances</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param metrics
     *        One or more of the following metrics. If you omit this parameter, all metrics are enabled.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>GroupMinSize</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupMaxSize</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupDesiredCapacity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupInServiceInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupPendingInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupStandbyInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupTerminatingInstances</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GroupTotalInstances</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableMetricsCollectionRequest withMetrics(java.util.Collection<String> metrics) {
        setMetrics(metrics);
        return this;
    }

    /**
     * <p>
     * The granularity to associate with the metrics to collect. The only valid value is <code>1Minute</code>.
     * </p>
     * 
     * @param granularity
     *        The granularity to associate with the metrics to collect. The only valid value is <code>1Minute</code>.
     */

    public void setGranularity(String granularity) {
        this.granularity = granularity;
    }

    /**
     * <p>
     * The granularity to associate with the metrics to collect. The only valid value is <code>1Minute</code>.
     * </p>
     * 
     * @return The granularity to associate with the metrics to collect. The only valid value is <code>1Minute</code>.
     */

    public String getGranularity() {
        return this.granularity;
    }

    /**
     * <p>
     * The granularity to associate with the metrics to collect. The only valid value is <code>1Minute</code>.
     * </p>
     * 
     * @param granularity
     *        The granularity to associate with the metrics to collect. The only valid value is <code>1Minute</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableMetricsCollectionRequest withGranularity(String granularity) {
        setGranularity(granularity);
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
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: ").append(getAutoScalingGroupName()).append(",");
        if (getMetrics() != null)
            sb.append("Metrics: ").append(getMetrics()).append(",");
        if (getGranularity() != null)
            sb.append("Granularity: ").append(getGranularity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableMetricsCollectionRequest == false)
            return false;
        EnableMetricsCollectionRequest other = (EnableMetricsCollectionRequest) obj;
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        if (other.getGranularity() == null ^ this.getGranularity() == null)
            return false;
        if (other.getGranularity() != null && other.getGranularity().equals(this.getGranularity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        hashCode = prime * hashCode + ((getGranularity() == null) ? 0 : getGranularity().hashCode());
        return hashCode;
    }

    @Override
    public EnableMetricsCollectionRequest clone() {
        return (EnableMetricsCollectionRequest) super.clone();
    }

}
