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
 * The output for the DescribeAlarmHistory action.
 * </p>
 */
public class DescribeAlarmHistoryResult {

    /**
     * A list of alarm histories in JSON format.
     */
    private java.util.List<AlarmHistoryItem> alarmHistoryItems;

    /**
     * A string that marks the start of the next batch of returned results.
     */
    private String nextToken;

    /**
     * A list of alarm histories in JSON format.
     *
     * @return A list of alarm histories in JSON format.
     */
    public java.util.List<AlarmHistoryItem> getAlarmHistoryItems() {
        
        if (alarmHistoryItems == null) {
            alarmHistoryItems = new java.util.ArrayList<AlarmHistoryItem>();
        }
        return alarmHistoryItems;
    }
    
    /**
     * A list of alarm histories in JSON format.
     *
     * @param alarmHistoryItems A list of alarm histories in JSON format.
     */
    public void setAlarmHistoryItems(java.util.Collection<AlarmHistoryItem> alarmHistoryItems) {
        java.util.List<AlarmHistoryItem> alarmHistoryItemsCopy = new java.util.ArrayList<AlarmHistoryItem>();
        if (alarmHistoryItems != null) {
            alarmHistoryItemsCopy.addAll(alarmHistoryItems);
        }
        this.alarmHistoryItems = alarmHistoryItemsCopy;
    }
    
    /**
     * A list of alarm histories in JSON format.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param alarmHistoryItems A list of alarm histories in JSON format.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAlarmHistoryResult withAlarmHistoryItems(AlarmHistoryItem... alarmHistoryItems) {
        if (getAlarmHistoryItems() == null) setAlarmHistoryItems(new java.util.ArrayList<AlarmHistoryItem>());
        for (AlarmHistoryItem value : alarmHistoryItems) {
            getAlarmHistoryItems().add(value);
        }
        return this;
    }
    
    /**
     * A list of alarm histories in JSON format.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param alarmHistoryItems A list of alarm histories in JSON format.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAlarmHistoryResult withAlarmHistoryItems(java.util.Collection<AlarmHistoryItem> alarmHistoryItems) {
        java.util.List<AlarmHistoryItem> alarmHistoryItemsCopy = new java.util.ArrayList<AlarmHistoryItem>();
        if (alarmHistoryItems != null) {
            alarmHistoryItemsCopy.addAll(alarmHistoryItems);
        }
        this.alarmHistoryItems = alarmHistoryItemsCopy;

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
    public DescribeAlarmHistoryResult withNextToken(String nextToken) {
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
        sb.append("AlarmHistoryItems: " + alarmHistoryItems + ", ");
        sb.append("NextToken: " + nextToken + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    