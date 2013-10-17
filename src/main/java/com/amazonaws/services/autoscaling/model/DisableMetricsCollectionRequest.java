/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#disableMetricsCollection(DisableMetricsCollectionRequest) DisableMetricsCollection operation}.
 * <p>
 * Disables monitoring of group metrics for the Auto Scaling group specified in <code>AutoScalingGroupName</code> .
 * You can specify the list of affected metrics with the <code>Metrics</code> parameter.
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#disableMetricsCollection(DisableMetricsCollectionRequest)
 */
public class DisableMetricsCollectionRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name or ARN of the Auto Scaling Group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupName;

    /**
     * The list of metrics to disable. If no metrics are specified, all
     * metrics are disabled. The following metrics are supported: <ul>
     * <li><p>GroupMinSize</li> <li><p>GroupMaxSize</li>
     * <li><p>GroupDesiredCapacity</li> <li><p>GroupInServiceInstances</li>
     * <li><p>GroupPendingInstances</li>
     * <li><p>GroupTerminatingInstances</li> <li><p>GroupTotalInstances</li>
     * </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> metrics;

    /**
     * The name or ARN of the Auto Scaling Group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The name or ARN of the Auto Scaling Group.
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }
    
    /**
     * The name or ARN of the Auto Scaling Group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name or ARN of the Auto Scaling Group.
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }
    
    /**
     * The name or ARN of the Auto Scaling Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name or ARN of the Auto Scaling Group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DisableMetricsCollectionRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * The list of metrics to disable. If no metrics are specified, all
     * metrics are disabled. The following metrics are supported: <ul>
     * <li><p>GroupMinSize</li> <li><p>GroupMaxSize</li>
     * <li><p>GroupDesiredCapacity</li> <li><p>GroupInServiceInstances</li>
     * <li><p>GroupPendingInstances</li>
     * <li><p>GroupTerminatingInstances</li> <li><p>GroupTotalInstances</li>
     * </ul>
     *
     * @return The list of metrics to disable. If no metrics are specified, all
     *         metrics are disabled. The following metrics are supported: <ul>
     *         <li><p>GroupMinSize</li> <li><p>GroupMaxSize</li>
     *         <li><p>GroupDesiredCapacity</li> <li><p>GroupInServiceInstances</li>
     *         <li><p>GroupPendingInstances</li>
     *         <li><p>GroupTerminatingInstances</li> <li><p>GroupTotalInstances</li>
     *         </ul>
     */
    public java.util.List<String> getMetrics() {
        if (metrics == null) {
              metrics = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              metrics.setAutoConstruct(true);
        }
        return metrics;
    }
    
    /**
     * The list of metrics to disable. If no metrics are specified, all
     * metrics are disabled. The following metrics are supported: <ul>
     * <li><p>GroupMinSize</li> <li><p>GroupMaxSize</li>
     * <li><p>GroupDesiredCapacity</li> <li><p>GroupInServiceInstances</li>
     * <li><p>GroupPendingInstances</li>
     * <li><p>GroupTerminatingInstances</li> <li><p>GroupTotalInstances</li>
     * </ul>
     *
     * @param metrics The list of metrics to disable. If no metrics are specified, all
     *         metrics are disabled. The following metrics are supported: <ul>
     *         <li><p>GroupMinSize</li> <li><p>GroupMaxSize</li>
     *         <li><p>GroupDesiredCapacity</li> <li><p>GroupInServiceInstances</li>
     *         <li><p>GroupPendingInstances</li>
     *         <li><p>GroupTerminatingInstances</li> <li><p>GroupTotalInstances</li>
     *         </ul>
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
     * The list of metrics to disable. If no metrics are specified, all
     * metrics are disabled. The following metrics are supported: <ul>
     * <li><p>GroupMinSize</li> <li><p>GroupMaxSize</li>
     * <li><p>GroupDesiredCapacity</li> <li><p>GroupInServiceInstances</li>
     * <li><p>GroupPendingInstances</li>
     * <li><p>GroupTerminatingInstances</li> <li><p>GroupTotalInstances</li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metrics The list of metrics to disable. If no metrics are specified, all
     *         metrics are disabled. The following metrics are supported: <ul>
     *         <li><p>GroupMinSize</li> <li><p>GroupMaxSize</li>
     *         <li><p>GroupDesiredCapacity</li> <li><p>GroupInServiceInstances</li>
     *         <li><p>GroupPendingInstances</li>
     *         <li><p>GroupTerminatingInstances</li> <li><p>GroupTotalInstances</li>
     *         </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DisableMetricsCollectionRequest withMetrics(String... metrics) {
        if (getMetrics() == null) setMetrics(new java.util.ArrayList<String>(metrics.length));
        for (String value : metrics) {
            getMetrics().add(value);
        }
        return this;
    }
    
    /**
     * The list of metrics to disable. If no metrics are specified, all
     * metrics are disabled. The following metrics are supported: <ul>
     * <li><p>GroupMinSize</li> <li><p>GroupMaxSize</li>
     * <li><p>GroupDesiredCapacity</li> <li><p>GroupInServiceInstances</li>
     * <li><p>GroupPendingInstances</li>
     * <li><p>GroupTerminatingInstances</li> <li><p>GroupTotalInstances</li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metrics The list of metrics to disable. If no metrics are specified, all
     *         metrics are disabled. The following metrics are supported: <ul>
     *         <li><p>GroupMinSize</li> <li><p>GroupMaxSize</li>
     *         <li><p>GroupDesiredCapacity</li> <li><p>GroupInServiceInstances</li>
     *         <li><p>GroupPendingInstances</li>
     *         <li><p>GroupTerminatingInstances</li> <li><p>GroupTotalInstances</li>
     *         </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DisableMetricsCollectionRequest withMetrics(java.util.Collection<String> metrics) {
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
        if (getMetrics() != null) sb.append("Metrics: " + getMetrics() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DisableMetricsCollectionRequest == false) return false;
        DisableMetricsCollectionRequest other = (DisableMetricsCollectionRequest)obj;
        
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null) return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false) return false; 
        if (other.getMetrics() == null ^ this.getMetrics() == null) return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false) return false; 
        return true;
    }
    
}
    