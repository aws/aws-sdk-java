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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of DescribeSpotFleetRequestHistory.
 * </p>
 */
public class DescribeSpotFleetRequestHistoryResult implements Serializable, Cloneable {

    /**
     * The ID of the Spot fleet request.
     */
    private String spotFleetRequestId;

    /**
     * The starting date and time for the events, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     */
    private java.util.Date startTime;

    /**
     * The last date and time for the events, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). All
     * records up to this time were retrieved. <p>If <code>nextToken</code>
     * indicates that there are more results, this value is not present.
     */
    private java.util.Date lastEvaluatedTime;

    /**
     * Information about the events in the history of the Spot fleet request.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<HistoryRecord> historyRecords;

    /**
     * The token required to retrieve the next set of results. This value is
     * <code>null</code> when there are no more results to return.
     */
    private String nextToken;

    /**
     * The ID of the Spot fleet request.
     *
     * @return The ID of the Spot fleet request.
     */
    public String getSpotFleetRequestId() {
        return spotFleetRequestId;
    }
    
    /**
     * The ID of the Spot fleet request.
     *
     * @param spotFleetRequestId The ID of the Spot fleet request.
     */
    public void setSpotFleetRequestId(String spotFleetRequestId) {
        this.spotFleetRequestId = spotFleetRequestId;
    }
    
    /**
     * The ID of the Spot fleet request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotFleetRequestId The ID of the Spot fleet request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSpotFleetRequestHistoryResult withSpotFleetRequestId(String spotFleetRequestId) {
        this.spotFleetRequestId = spotFleetRequestId;
        return this;
    }

    /**
     * The starting date and time for the events, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     *
     * @return The starting date and time for the events, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     */
    public java.util.Date getStartTime() {
        return startTime;
    }
    
    /**
     * The starting date and time for the events, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     *
     * @param startTime The starting date and time for the events, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }
    
    /**
     * The starting date and time for the events, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startTime The starting date and time for the events, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSpotFleetRequestHistoryResult withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * The last date and time for the events, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). All
     * records up to this time were retrieved. <p>If <code>nextToken</code>
     * indicates that there are more results, this value is not present.
     *
     * @return The last date and time for the events, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). All
     *         records up to this time were retrieved. <p>If <code>nextToken</code>
     *         indicates that there are more results, this value is not present.
     */
    public java.util.Date getLastEvaluatedTime() {
        return lastEvaluatedTime;
    }
    
    /**
     * The last date and time for the events, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). All
     * records up to this time were retrieved. <p>If <code>nextToken</code>
     * indicates that there are more results, this value is not present.
     *
     * @param lastEvaluatedTime The last date and time for the events, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). All
     *         records up to this time were retrieved. <p>If <code>nextToken</code>
     *         indicates that there are more results, this value is not present.
     */
    public void setLastEvaluatedTime(java.util.Date lastEvaluatedTime) {
        this.lastEvaluatedTime = lastEvaluatedTime;
    }
    
    /**
     * The last date and time for the events, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). All
     * records up to this time were retrieved. <p>If <code>nextToken</code>
     * indicates that there are more results, this value is not present.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastEvaluatedTime The last date and time for the events, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). All
     *         records up to this time were retrieved. <p>If <code>nextToken</code>
     *         indicates that there are more results, this value is not present.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSpotFleetRequestHistoryResult withLastEvaluatedTime(java.util.Date lastEvaluatedTime) {
        this.lastEvaluatedTime = lastEvaluatedTime;
        return this;
    }

    /**
     * Information about the events in the history of the Spot fleet request.
     *
     * @return Information about the events in the history of the Spot fleet request.
     */
    public java.util.List<HistoryRecord> getHistoryRecords() {
        if (historyRecords == null) {
              historyRecords = new com.amazonaws.internal.ListWithAutoConstructFlag<HistoryRecord>();
              historyRecords.setAutoConstruct(true);
        }
        return historyRecords;
    }
    
    /**
     * Information about the events in the history of the Spot fleet request.
     *
     * @param historyRecords Information about the events in the history of the Spot fleet request.
     */
    public void setHistoryRecords(java.util.Collection<HistoryRecord> historyRecords) {
        if (historyRecords == null) {
            this.historyRecords = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<HistoryRecord> historyRecordsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<HistoryRecord>(historyRecords.size());
        historyRecordsCopy.addAll(historyRecords);
        this.historyRecords = historyRecordsCopy;
    }
    
    /**
     * Information about the events in the history of the Spot fleet request.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setHistoryRecords(java.util.Collection)} or {@link
     * #withHistoryRecords(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param historyRecords Information about the events in the history of the Spot fleet request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSpotFleetRequestHistoryResult withHistoryRecords(HistoryRecord... historyRecords) {
        if (getHistoryRecords() == null) setHistoryRecords(new java.util.ArrayList<HistoryRecord>(historyRecords.length));
        for (HistoryRecord value : historyRecords) {
            getHistoryRecords().add(value);
        }
        return this;
    }
    
    /**
     * Information about the events in the history of the Spot fleet request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param historyRecords Information about the events in the history of the Spot fleet request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSpotFleetRequestHistoryResult withHistoryRecords(java.util.Collection<HistoryRecord> historyRecords) {
        if (historyRecords == null) {
            this.historyRecords = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<HistoryRecord> historyRecordsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<HistoryRecord>(historyRecords.size());
            historyRecordsCopy.addAll(historyRecords);
            this.historyRecords = historyRecordsCopy;
        }

        return this;
    }

    /**
     * The token required to retrieve the next set of results. This value is
     * <code>null</code> when there are no more results to return.
     *
     * @return The token required to retrieve the next set of results. This value is
     *         <code>null</code> when there are no more results to return.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token required to retrieve the next set of results. This value is
     * <code>null</code> when there are no more results to return.
     *
     * @param nextToken The token required to retrieve the next set of results. This value is
     *         <code>null</code> when there are no more results to return.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token required to retrieve the next set of results. This value is
     * <code>null</code> when there are no more results to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The token required to retrieve the next set of results. This value is
     *         <code>null</code> when there are no more results to return.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSpotFleetRequestHistoryResult withNextToken(String nextToken) {
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
        if (getSpotFleetRequestId() != null) sb.append("SpotFleetRequestId: " + getSpotFleetRequestId() + ",");
        if (getStartTime() != null) sb.append("StartTime: " + getStartTime() + ",");
        if (getLastEvaluatedTime() != null) sb.append("LastEvaluatedTime: " + getLastEvaluatedTime() + ",");
        if (getHistoryRecords() != null) sb.append("HistoryRecords: " + getHistoryRecords() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSpotFleetRequestId() == null) ? 0 : getSpotFleetRequestId().hashCode()); 
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode()); 
        hashCode = prime * hashCode + ((getLastEvaluatedTime() == null) ? 0 : getLastEvaluatedTime().hashCode()); 
        hashCode = prime * hashCode + ((getHistoryRecords() == null) ? 0 : getHistoryRecords().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeSpotFleetRequestHistoryResult == false) return false;
        DescribeSpotFleetRequestHistoryResult other = (DescribeSpotFleetRequestHistoryResult)obj;
        
        if (other.getSpotFleetRequestId() == null ^ this.getSpotFleetRequestId() == null) return false;
        if (other.getSpotFleetRequestId() != null && other.getSpotFleetRequestId().equals(this.getSpotFleetRequestId()) == false) return false; 
        if (other.getStartTime() == null ^ this.getStartTime() == null) return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false) return false; 
        if (other.getLastEvaluatedTime() == null ^ this.getLastEvaluatedTime() == null) return false;
        if (other.getLastEvaluatedTime() != null && other.getLastEvaluatedTime().equals(this.getLastEvaluatedTime()) == false) return false; 
        if (other.getHistoryRecords() == null ^ this.getHistoryRecords() == null) return false;
        if (other.getHistoryRecords() != null && other.getHistoryRecords().equals(this.getHistoryRecords()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeSpotFleetRequestHistoryResult clone() {
        try {
            return (DescribeSpotFleetRequestHistoryResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    