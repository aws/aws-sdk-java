/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#enableMetricsCollection(EnableMetricsCollectionRequest) EnableMetricsCollection operation}.
 * <p>
 * Enables monitoring of the specified metrics for the specified Auto
 * Scaling group.
 * </p>
 * <p>
 * You can only enable metrics collection if
 * <code>InstanceMonitoring</code> in the launch configuration for the
 * group is set to <code>True</code> .
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#enableMetricsCollection(EnableMetricsCollectionRequest)
 */
public class EnableMetricsCollectionRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name or ARN of the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupName;

    /**
     * One or more metrics. If you omit this parameter, all metrics are
     * enabled. <ul> <li><p><code>GroupMinSize</code></li>
     * <li><p><code>GroupMaxSize</code></li>
     * <li><p><code>GroupDesiredCapacity</code></li>
     * <li><p><code>GroupInServiceInstances</code></li>
     * <li><p><code>GroupPendingInstances</code></li>
     * <li><p><code>GroupStandbyInstances</code></li>
     * <li><p><code>GroupTerminatingInstances</code></li>
     * <li><p><code>GroupTotalInstances</code></li> </ul> <p>Note that the
     * <code>GroupStandbyInstances</code> metric is not enabled by default.
     * You must explicitly request this metric.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> metrics;

    /**
     * The granularity to associate with the metrics to collect. The only
     * valid value is <code>1Minute</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String granularity;

    /**
     * The name or ARN of the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The name or ARN of the Auto Scaling group.
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }
    
    /**
     * The name or ARN of the Auto Scaling group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name or ARN of the Auto Scaling group.
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }
    
    /**
     * The name or ARN of the Auto Scaling group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name or ARN of the Auto Scaling group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EnableMetricsCollectionRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * One or more metrics. If you omit this parameter, all metrics are
     * enabled. <ul> <li><p><code>GroupMinSize</code></li>
     * <li><p><code>GroupMaxSize</code></li>
     * <li><p><code>GroupDesiredCapacity</code></li>
     * <li><p><code>GroupInServiceInstances</code></li>
     * <li><p><code>GroupPendingInstances</code></li>
     * <li><p><code>GroupStandbyInstances</code></li>
     * <li><p><code>GroupTerminatingInstances</code></li>
     * <li><p><code>GroupTotalInstances</code></li> </ul> <p>Note that the
     * <code>GroupStandbyInstances</code> metric is not enabled by default.
     * You must explicitly request this metric.
     *
     * @return One or more metrics. If you omit this parameter, all metrics are
     *         enabled. <ul> <li><p><code>GroupMinSize</code></li>
     *         <li><p><code>GroupMaxSize</code></li>
     *         <li><p><code>GroupDesiredCapacity</code></li>
     *         <li><p><code>GroupInServiceInstances</code></li>
     *         <li><p><code>GroupPendingInstances</code></li>
     *         <li><p><code>GroupStandbyInstances</code></li>
     *         <li><p><code>GroupTerminatingInstances</code></li>
     *         <li><p><code>GroupTotalInstances</code></li> </ul> <p>Note that the
     *         <code>GroupStandbyInstances</code> metric is not enabled by default.
     *         You must explicitly request this metric.
     */
    public java.util.List<String> getMetrics() {
        if (metrics == null) {
              metrics = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              metrics.setAutoConstruct(true);
        }
        return metrics;
    }
    
    /**
     * One or more metrics. If you omit this parameter, all metrics are
     * enabled. <ul> <li><p><code>GroupMinSize</code></li>
     * <li><p><code>GroupMaxSize</code></li>
     * <li><p><code>GroupDesiredCapacity</code></li>
     * <li><p><code>GroupInServiceInstances</code></li>
     * <li><p><code>GroupPendingInstances</code></li>
     * <li><p><code>GroupStandbyInstances</code></li>
     * <li><p><code>GroupTerminatingInstances</code></li>
     * <li><p><code>GroupTotalInstances</code></li> </ul> <p>Note that the
     * <code>GroupStandbyInstances</code> metric is not enabled by default.
     * You must explicitly request this metric.
     *
     * @param metrics One or more metrics. If you omit this parameter, all metrics are
     *         enabled. <ul> <li><p><code>GroupMinSize</code></li>
     *         <li><p><code>GroupMaxSize</code></li>
     *         <li><p><code>GroupDesiredCapacity</code></li>
     *         <li><p><code>GroupInServiceInstances</code></li>
     *         <li><p><code>GroupPendingInstances</code></li>
     *         <li><p><code>GroupStandbyInstances</code></li>
     *         <li><p><code>GroupTerminatingInstances</code></li>
     *         <li><p><code>GroupTotalInstances</code></li> </ul> <p>Note that the
     *         <code>GroupStandbyInstances</code> metric is not enabled by default.
     *         You must explicitly request this metric.
     */
    public void setMetrics(java.util.Collection<String> metrics) {
        if (metrics == null) {
            this.metrics = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> metricsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(metrics.size());
        metricsCopy.addAll(metrics);
        this.metrics = metricsCopy;
    }
    
    /**
     * One or more metrics. If you omit this parameter, all metrics are
     * enabled. <ul> <li><p><code>GroupMinSize</code></li>
     * <li><p><code>GroupMaxSize</code></li>
     * <li><p><code>GroupDesiredCapacity</code></li>
     * <li><p><code>GroupInServiceInstances</code></li>
     * <li><p><code>GroupPendingInstances</code></li>
     * <li><p><code>GroupStandbyInstances</code></li>
     * <li><p><code>GroupTerminatingInstances</code></li>
     * <li><p><code>GroupTotalInstances</code></li> </ul> <p>Note that the
     * <code>GroupStandbyInstances</code> metric is not enabled by default.
     * You must explicitly request this metric.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setMetrics(java.util.Collection)} or {@link
     * #withMetrics(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metrics One or more metrics. If you omit this parameter, all metrics are
     *         enabled. <ul> <li><p><code>GroupMinSize</code></li>
     *         <li><p><code>GroupMaxSize</code></li>
     *         <li><p><code>GroupDesiredCapacity</code></li>
     *         <li><p><code>GroupInServiceInstances</code></li>
     *         <li><p><code>GroupPendingInstances</code></li>
     *         <li><p><code>GroupStandbyInstances</code></li>
     *         <li><p><code>GroupTerminatingInstances</code></li>
     *         <li><p><code>GroupTotalInstances</code></li> </ul> <p>Note that the
     *         <code>GroupStandbyInstances</code> metric is not enabled by default.
     *         You must explicitly request this metric.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EnableMetricsCollectionRequest withMetrics(String... metrics) {
        if (getMetrics() == null) setMetrics(new java.util.ArrayList<String>(metrics.length));
        for (String value : metrics) {
            getMetrics().add(value);
        }
        return this;
    }
    
    /**
     * One or more metrics. If you omit this parameter, all metrics are
     * enabled. <ul> <li><p><code>GroupMinSize</code></li>
     * <li><p><code>GroupMaxSize</code></li>
     * <li><p><code>GroupDesiredCapacity</code></li>
     * <li><p><code>GroupInServiceInstances</code></li>
     * <li><p><code>GroupPendingInstances</code></li>
     * <li><p><code>GroupStandbyInstances</code></li>
     * <li><p><code>GroupTerminatingInstances</code></li>
     * <li><p><code>GroupTotalInstances</code></li> </ul> <p>Note that the
     * <code>GroupStandbyInstances</code> metric is not enabled by default.
     * You must explicitly request this metric.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metrics One or more metrics. If you omit this parameter, all metrics are
     *         enabled. <ul> <li><p><code>GroupMinSize</code></li>
     *         <li><p><code>GroupMaxSize</code></li>
     *         <li><p><code>GroupDesiredCapacity</code></li>
     *         <li><p><code>GroupInServiceInstances</code></li>
     *         <li><p><code>GroupPendingInstances</code></li>
     *         <li><p><code>GroupStandbyInstances</code></li>
     *         <li><p><code>GroupTerminatingInstances</code></li>
     *         <li><p><code>GroupTotalInstances</code></li> </ul> <p>Note that the
     *         <code>GroupStandbyInstances</code> metric is not enabled by default.
     *         You must explicitly request this metric.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EnableMetricsCollectionRequest withMetrics(java.util.Collection<String> metrics) {
        if (metrics == null) {
            this.metrics = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> metricsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(metrics.size());
            metricsCopy.addAll(metrics);
            this.metrics = metricsCopy;
        }

        return this;
    }

    /**
     * The granularity to associate with the metrics to collect. The only
     * valid value is <code>1Minute</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The granularity to associate with the metrics to collect. The only
     *         valid value is <code>1Minute</code>.
     */
    public String getGranularity() {
        return granularity;
    }
    
    /**
     * The granularity to associate with the metrics to collect. The only
     * valid value is <code>1Minute</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param granularity The granularity to associate with the metrics to collect. The only
     *         valid value is <code>1Minute</code>.
     */
    public void setGranularity(String granularity) {
        this.granularity = granularity;
    }
    
    /**
     * The granularity to associate with the metrics to collect. The only
     * valid value is <code>1Minute</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param granularity The granularity to associate with the metrics to collect. The only
     *         valid value is <code>1Minute</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EnableMetricsCollectionRequest withGranularity(String granularity) {
        this.granularity = granularity;
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
        if (getAutoScalingGroupName() != null) sb.append("AutoScalingGroupName: " + getAutoScalingGroupName() + ",");
        if (getMetrics() != null) sb.append("Metrics: " + getMetrics() + ",");
        if (getGranularity() != null) sb.append("Granularity: " + getGranularity() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof EnableMetricsCollectionRequest == false) return false;
        EnableMetricsCollectionRequest other = (EnableMetricsCollectionRequest)obj;
        
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null) return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false) return false; 
        if (other.getMetrics() == null ^ this.getMetrics() == null) return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false) return false; 
        if (other.getGranularity() == null ^ this.getGranularity() == null) return false;
        if (other.getGranularity() != null && other.getGranularity().equals(this.getGranularity()) == false) return false; 
        return true;
    }
    
    @Override
    public EnableMetricsCollectionRequest clone() {
        
            return (EnableMetricsCollectionRequest) super.clone();
    }

}
    