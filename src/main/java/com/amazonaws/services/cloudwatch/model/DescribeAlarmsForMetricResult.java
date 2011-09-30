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
package com.amazonaws.services.cloudwatch.model;

/**
 * <p>
 * The output for the DescribeAlarmsForMetric action.
 * </p>
 */
public class DescribeAlarmsForMetricResult {

    /**
     * A list of information for each alarm with the specified metric.
     */
    private java.util.List<MetricAlarm> metricAlarms;

    /**
     * A list of information for each alarm with the specified metric.
     *
     * @return A list of information for each alarm with the specified metric.
     */
    public java.util.List<MetricAlarm> getMetricAlarms() {
        
        if (metricAlarms == null) {
            metricAlarms = new java.util.ArrayList<MetricAlarm>();
        }
        return metricAlarms;
    }
    
    /**
     * A list of information for each alarm with the specified metric.
     *
     * @param metricAlarms A list of information for each alarm with the specified metric.
     */
    public void setMetricAlarms(java.util.Collection<MetricAlarm> metricAlarms) {
        java.util.List<MetricAlarm> metricAlarmsCopy = new java.util.ArrayList<MetricAlarm>();
        if (metricAlarms != null) {
            metricAlarmsCopy.addAll(metricAlarms);
        }
        this.metricAlarms = metricAlarmsCopy;
    }
    
    /**
     * A list of information for each alarm with the specified metric.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metricAlarms A list of information for each alarm with the specified metric.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAlarmsForMetricResult withMetricAlarms(MetricAlarm... metricAlarms) {
        if (getMetricAlarms() == null) setMetricAlarms(new java.util.ArrayList<MetricAlarm>());
        for (MetricAlarm value : metricAlarms) {
            getMetricAlarms().add(value);
        }
        return this;
    }
    
    /**
     * A list of information for each alarm with the specified metric.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metricAlarms A list of information for each alarm with the specified metric.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAlarmsForMetricResult withMetricAlarms(java.util.Collection<MetricAlarm> metricAlarms) {
        java.util.List<MetricAlarm> metricAlarmsCopy = new java.util.ArrayList<MetricAlarm>();
        if (metricAlarms != null) {
            metricAlarmsCopy.addAll(metricAlarms);
        }
        this.metricAlarms = metricAlarmsCopy;

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
        sb.append("MetricAlarms: " + metricAlarms + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    