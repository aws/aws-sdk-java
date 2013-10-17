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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;


/**
 * <p>
 * The output for the DescribeAlarmsForMetric action.
 * </p>
 */
public class DescribeAlarmsForMetricResult implements Serializable {

    /**
     * A list of information for each alarm with the specified metric.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<MetricAlarm> metricAlarms;

    /**
     * A list of information for each alarm with the specified metric.
     *
     * @return A list of information for each alarm with the specified metric.
     */
    public java.util.List<MetricAlarm> getMetricAlarms() {
        if (metricAlarms == null) {
              metricAlarms = new com.amazonaws.internal.ListWithAutoConstructFlag<MetricAlarm>();
              metricAlarms.setAutoConstruct(true);
        }
        return metricAlarms;
    }
    
    /**
     * A list of information for each alarm with the specified metric.
     *
     * @param metricAlarms A list of information for each alarm with the specified metric.
     */
    public void setMetricAlarms(java.util.Collection<MetricAlarm> metricAlarms) {
        if (metricAlarms == null) {
            this.metricAlarms = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<MetricAlarm> metricAlarmsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<MetricAlarm>(metricAlarms.size());
        metricAlarmsCopy.addAll(metricAlarms);
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
        if (getMetricAlarms() == null) setMetricAlarms(new java.util.ArrayList<MetricAlarm>(metricAlarms.length));
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
        if (metricAlarms == null) {
            this.metricAlarms = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<MetricAlarm> metricAlarmsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<MetricAlarm>(metricAlarms.size());
            metricAlarmsCopy.addAll(metricAlarms);
            this.metricAlarms = metricAlarmsCopy;
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
        if (getMetricAlarms() != null) sb.append("MetricAlarms: " + getMetricAlarms() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMetricAlarms() == null) ? 0 : getMetricAlarms().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeAlarmsForMetricResult == false) return false;
        DescribeAlarmsForMetricResult other = (DescribeAlarmsForMetricResult)obj;
        
        if (other.getMetricAlarms() == null ^ this.getMetricAlarms() == null) return false;
        if (other.getMetricAlarms() != null && other.getMetricAlarms().equals(this.getMetricAlarms()) == false) return false; 
        return true;
    }
    
}
    