/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#enableMetricsCollection(EnableMetricsCollectionRequest) EnableMetricsCollection operation}.
 * <p>
 * Enables monitoring of group metrics for the Auto Scaling group
 * specified in AutoScalingGroupName. You can specify the list of enabled
 * metrics with the Metrics parameter.
 * </p>
 * <p>
 * Auto scaling metrics collection can be turned on only if the
 * <code>InstanceMonitoring.Enabled</code> flag, in the Auto Scaling
 * group's launch configuration, is set to <code>true</code> .
 * 
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#enableMetricsCollection(EnableMetricsCollectionRequest)
 */
public class EnableMetricsCollectionRequest extends AmazonWebServiceRequest {

    /**
     * The name or ARN of the Auto Scaling Group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupName;

    /**
     * The list of metrics to collect. If no metrics are specified, all
     * metrics are enabled. The following metrics are supported: <ul>
     * <li><p>GroupMinSize</li> <li><p>GroupMaxSize</li>
     * <li><p>GroupDesiredCapacity</li> <li><p>GroupInServiceInstances</li>
     * <li><p>GroupPendingInstances</li>
     * <li><p>GroupTerminatingInstances</li> <li><p>GroupTotalInstances</li>
     * </ul>
     */
    private java.util.List<String> metrics;

    /**
     * The granularity to associate with the metrics to collect. Currently,
     * the only legal granularity is "1Minute".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String granularity;

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
    public EnableMetricsCollectionRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }
    
    
    /**
     * The list of metrics to collect. If no metrics are specified, all
     * metrics are enabled. The following metrics are supported: <ul>
     * <li><p>GroupMinSize</li> <li><p>GroupMaxSize</li>
     * <li><p>GroupDesiredCapacity</li> <li><p>GroupInServiceInstances</li>
     * <li><p>GroupPendingInstances</li>
     * <li><p>GroupTerminatingInstances</li> <li><p>GroupTotalInstances</li>
     * </ul>
     *
     * @return The list of metrics to collect. If no metrics are specified, all
     *         metrics are enabled. The following metrics are supported: <ul>
     *         <li><p>GroupMinSize</li> <li><p>GroupMaxSize</li>
     *         <li><p>GroupDesiredCapacity</li> <li><p>GroupInServiceInstances</li>
     *         <li><p>GroupPendingInstances</li>
     *         <li><p>GroupTerminatingInstances</li> <li><p>GroupTotalInstances</li>
     *         </ul>
     */
    public java.util.List<String> getMetrics() {
        if (metrics == null) {
            metrics = new java.util.ArrayList<String>();
        }
        return metrics;
    }
    
    /**
     * The list of metrics to collect. If no metrics are specified, all
     * metrics are enabled. The following metrics are supported: <ul>
     * <li><p>GroupMinSize</li> <li><p>GroupMaxSize</li>
     * <li><p>GroupDesiredCapacity</li> <li><p>GroupInServiceInstances</li>
     * <li><p>GroupPendingInstances</li>
     * <li><p>GroupTerminatingInstances</li> <li><p>GroupTotalInstances</li>
     * </ul>
     *
     * @param metrics The list of metrics to collect. If no metrics are specified, all
     *         metrics are enabled. The following metrics are supported: <ul>
     *         <li><p>GroupMinSize</li> <li><p>GroupMaxSize</li>
     *         <li><p>GroupDesiredCapacity</li> <li><p>GroupInServiceInstances</li>
     *         <li><p>GroupPendingInstances</li>
     *         <li><p>GroupTerminatingInstances</li> <li><p>GroupTotalInstances</li>
     *         </ul>
     */
    public void setMetrics(java.util.Collection<String> metrics) {
        java.util.List<String> metricsCopy = new java.util.ArrayList<String>();
        if (metrics != null) {
            metricsCopy.addAll(metrics);
        }
        this.metrics = metricsCopy;
    }
    
    /**
     * The list of metrics to collect. If no metrics are specified, all
     * metrics are enabled. The following metrics are supported: <ul>
     * <li><p>GroupMinSize</li> <li><p>GroupMaxSize</li>
     * <li><p>GroupDesiredCapacity</li> <li><p>GroupInServiceInstances</li>
     * <li><p>GroupPendingInstances</li>
     * <li><p>GroupTerminatingInstances</li> <li><p>GroupTotalInstances</li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metrics The list of metrics to collect. If no metrics are specified, all
     *         metrics are enabled. The following metrics are supported: <ul>
     *         <li><p>GroupMinSize</li> <li><p>GroupMaxSize</li>
     *         <li><p>GroupDesiredCapacity</li> <li><p>GroupInServiceInstances</li>
     *         <li><p>GroupPendingInstances</li>
     *         <li><p>GroupTerminatingInstances</li> <li><p>GroupTotalInstances</li>
     *         </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public EnableMetricsCollectionRequest withMetrics(String... metrics) {
        for (String value : metrics) {
            getMetrics().add(value);
        }
        return this;
    }
    
    /**
     * The list of metrics to collect. If no metrics are specified, all
     * metrics are enabled. The following metrics are supported: <ul>
     * <li><p>GroupMinSize</li> <li><p>GroupMaxSize</li>
     * <li><p>GroupDesiredCapacity</li> <li><p>GroupInServiceInstances</li>
     * <li><p>GroupPendingInstances</li>
     * <li><p>GroupTerminatingInstances</li> <li><p>GroupTotalInstances</li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metrics The list of metrics to collect. If no metrics are specified, all
     *         metrics are enabled. The following metrics are supported: <ul>
     *         <li><p>GroupMinSize</li> <li><p>GroupMaxSize</li>
     *         <li><p>GroupDesiredCapacity</li> <li><p>GroupInServiceInstances</li>
     *         <li><p>GroupPendingInstances</li>
     *         <li><p>GroupTerminatingInstances</li> <li><p>GroupTotalInstances</li>
     *         </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public EnableMetricsCollectionRequest withMetrics(java.util.Collection<String> metrics) {
        java.util.List<String> metricsCopy = new java.util.ArrayList<String>();
        if (metrics != null) {
            metricsCopy.addAll(metrics);
        }
        this.metrics = metricsCopy;

        return this;
    }
    
    /**
     * The granularity to associate with the metrics to collect. Currently,
     * the only legal granularity is "1Minute".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The granularity to associate with the metrics to collect. Currently,
     *         the only legal granularity is "1Minute".
     */
    public String getGranularity() {
        return granularity;
    }
    
    /**
     * The granularity to associate with the metrics to collect. Currently,
     * the only legal granularity is "1Minute".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param granularity The granularity to associate with the metrics to collect. Currently,
     *         the only legal granularity is "1Minute".
     */
    public void setGranularity(String granularity) {
        this.granularity = granularity;
    }
    
    /**
     * The granularity to associate with the metrics to collect. Currently,
     * the only legal granularity is "1Minute".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param granularity The granularity to associate with the metrics to collect. Currently,
     *         the only legal granularity is "1Minute".
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
        sb.append("AutoScalingGroupName: " + autoScalingGroupName + ", ");
        sb.append("Metrics: " + metrics + ", ");
        sb.append("Granularity: " + granularity + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    