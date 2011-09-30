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
 * The output for the DescribeAlarms action.
 * </p>
 */
public class DescribeAlarmsResult {

    /**
     * A list of information for the specified alarms.
     */
    private java.util.List<MetricAlarm> metricAlarms;

    /**
     * A string that marks the start of the next batch of returned results.
     */
    private String nextToken;

    /**
     * A list of information for the specified alarms.
     *
     * @return A list of information for the specified alarms.
     */
    public java.util.List<MetricAlarm> getMetricAlarms() {
        
        if (metricAlarms == null) {
            metricAlarms = new java.util.ArrayList<MetricAlarm>();
        }
        return metricAlarms;
    }
    
    /**
     * A list of information for the specified alarms.
     *
     * @param metricAlarms A list of information for the specified alarms.
     */
    public void setMetricAlarms(java.util.Collection<MetricAlarm> metricAlarms) {
        java.util.List<MetricAlarm> metricAlarmsCopy = new java.util.ArrayList<MetricAlarm>();
        if (metricAlarms != null) {
            metricAlarmsCopy.addAll(metricAlarms);
        }
        this.metricAlarms = metricAlarmsCopy;
    }
    
    /**
     * A list of information for the specified alarms.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metricAlarms A list of information for the specified alarms.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAlarmsResult withMetricAlarms(MetricAlarm... metricAlarms) {
        if (getMetricAlarms() == null) setMetricAlarms(new java.util.ArrayList<MetricAlarm>());
        for (MetricAlarm value : metricAlarms) {
            getMetricAlarms().add(value);
        }
        return this;
    }
    
    /**
     * A list of information for the specified alarms.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param metricAlarms A list of information for the specified alarms.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAlarmsResult withMetricAlarms(java.util.Collection<MetricAlarm> metricAlarms) {
        java.util.List<MetricAlarm> metricAlarmsCopy = new java.util.ArrayList<MetricAlarm>();
        if (metricAlarms != null) {
            metricAlarmsCopy.addAll(metricAlarms);
        }
        this.metricAlarms = metricAlarmsCopy;

        return this;
    }
    
    /**
     * A string that marks the start of the next batch of returned results.
     *
     * @return A string that marks the start of the next batch of returned results.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * A string that marks the start of the next batch of returned results.
     *
     * @param nextToken A string that marks the start of the next batch of returned results.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * A string that marks the start of the next batch of returned results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken A string that marks the start of the next batch of returned results.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAlarmsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        sb.append("NextToken: " + nextToken + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    