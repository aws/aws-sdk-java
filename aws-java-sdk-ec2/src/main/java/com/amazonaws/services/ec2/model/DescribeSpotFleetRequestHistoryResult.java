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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * <p>
 * Contains the output of DescribeSpotFleetRequestHistory.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSpotFleetRequestHistoryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information about the events in the history of the Spot Fleet request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<HistoryRecord> historyRecords;
    /**
     * <p>
     * The last date and time for the events, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). All records up to this time were retrieved.
     * </p>
     * <p>
     * If <code>nextToken</code> indicates that there are more results, this value is not present.
     * </p>
     */
    private java.util.Date lastEvaluatedTime;
    /**
     * <p>
     * The token required to retrieve the next set of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The ID of the Spot Fleet request.
     * </p>
     */
    private String spotFleetRequestId;
    /**
     * <p>
     * The starting date and time for the events, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * Information about the events in the history of the Spot Fleet request.
     * </p>
     * 
     * @return Information about the events in the history of the Spot Fleet request.
     */

    public java.util.List<HistoryRecord> getHistoryRecords() {
        if (historyRecords == null) {
            historyRecords = new com.amazonaws.internal.SdkInternalList<HistoryRecord>();
        }
        return historyRecords;
    }

    /**
     * <p>
     * Information about the events in the history of the Spot Fleet request.
     * </p>
     * 
     * @param historyRecords
     *        Information about the events in the history of the Spot Fleet request.
     */

    public void setHistoryRecords(java.util.Collection<HistoryRecord> historyRecords) {
        if (historyRecords == null) {
            this.historyRecords = null;
            return;
        }

        this.historyRecords = new com.amazonaws.internal.SdkInternalList<HistoryRecord>(historyRecords);
    }

    /**
     * <p>
     * Information about the events in the history of the Spot Fleet request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHistoryRecords(java.util.Collection)} or {@link #withHistoryRecords(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param historyRecords
     *        Information about the events in the history of the Spot Fleet request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpotFleetRequestHistoryResult withHistoryRecords(HistoryRecord... historyRecords) {
        if (this.historyRecords == null) {
            setHistoryRecords(new com.amazonaws.internal.SdkInternalList<HistoryRecord>(historyRecords.length));
        }
        for (HistoryRecord ele : historyRecords) {
            this.historyRecords.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the events in the history of the Spot Fleet request.
     * </p>
     * 
     * @param historyRecords
     *        Information about the events in the history of the Spot Fleet request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpotFleetRequestHistoryResult withHistoryRecords(java.util.Collection<HistoryRecord> historyRecords) {
        setHistoryRecords(historyRecords);
        return this;
    }

    /**
     * <p>
     * The last date and time for the events, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). All records up to this time were retrieved.
     * </p>
     * <p>
     * If <code>nextToken</code> indicates that there are more results, this value is not present.
     * </p>
     * 
     * @param lastEvaluatedTime
     *        The last date and time for the events, in UTC format (for example,
     *        <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). All records up to this time were
     *        retrieved.</p>
     *        <p>
     *        If <code>nextToken</code> indicates that there are more results, this value is not present.
     */

    public void setLastEvaluatedTime(java.util.Date lastEvaluatedTime) {
        this.lastEvaluatedTime = lastEvaluatedTime;
    }

    /**
     * <p>
     * The last date and time for the events, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). All records up to this time were retrieved.
     * </p>
     * <p>
     * If <code>nextToken</code> indicates that there are more results, this value is not present.
     * </p>
     * 
     * @return The last date and time for the events, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). All records up to this time were
     *         retrieved.</p>
     *         <p>
     *         If <code>nextToken</code> indicates that there are more results, this value is not present.
     */

    public java.util.Date getLastEvaluatedTime() {
        return this.lastEvaluatedTime;
    }

    /**
     * <p>
     * The last date and time for the events, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). All records up to this time were retrieved.
     * </p>
     * <p>
     * If <code>nextToken</code> indicates that there are more results, this value is not present.
     * </p>
     * 
     * @param lastEvaluatedTime
     *        The last date and time for the events, in UTC format (for example,
     *        <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z). All records up to this time were
     *        retrieved.</p>
     *        <p>
     *        If <code>nextToken</code> indicates that there are more results, this value is not present.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpotFleetRequestHistoryResult withLastEvaluatedTime(java.util.Date lastEvaluatedTime) {
        setLastEvaluatedTime(lastEvaluatedTime);
        return this;
    }

    /**
     * <p>
     * The token required to retrieve the next set of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token required to retrieve the next set of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token required to retrieve the next set of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token required to retrieve the next set of results. This value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token required to retrieve the next set of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token required to retrieve the next set of results. This value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpotFleetRequestHistoryResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The ID of the Spot Fleet request.
     * </p>
     * 
     * @param spotFleetRequestId
     *        The ID of the Spot Fleet request.
     */

    public void setSpotFleetRequestId(String spotFleetRequestId) {
        this.spotFleetRequestId = spotFleetRequestId;
    }

    /**
     * <p>
     * The ID of the Spot Fleet request.
     * </p>
     * 
     * @return The ID of the Spot Fleet request.
     */

    public String getSpotFleetRequestId() {
        return this.spotFleetRequestId;
    }

    /**
     * <p>
     * The ID of the Spot Fleet request.
     * </p>
     * 
     * @param spotFleetRequestId
     *        The ID of the Spot Fleet request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpotFleetRequestHistoryResult withSpotFleetRequestId(String spotFleetRequestId) {
        setSpotFleetRequestId(spotFleetRequestId);
        return this;
    }

    /**
     * <p>
     * The starting date and time for the events, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     * 
     * @param startTime
     *        The starting date and time for the events, in UTC format (for example,
     *        <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The starting date and time for the events, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     * 
     * @return The starting date and time for the events, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The starting date and time for the events, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     * 
     * @param startTime
     *        The starting date and time for the events, in UTC format (for example,
     *        <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpotFleetRequestHistoryResult withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
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
        if (getHistoryRecords() != null)
            sb.append("HistoryRecords: ").append(getHistoryRecords()).append(",");
        if (getLastEvaluatedTime() != null)
            sb.append("LastEvaluatedTime: ").append(getLastEvaluatedTime()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSpotFleetRequestId() != null)
            sb.append("SpotFleetRequestId: ").append(getSpotFleetRequestId()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSpotFleetRequestHistoryResult == false)
            return false;
        DescribeSpotFleetRequestHistoryResult other = (DescribeSpotFleetRequestHistoryResult) obj;
        if (other.getHistoryRecords() == null ^ this.getHistoryRecords() == null)
            return false;
        if (other.getHistoryRecords() != null && other.getHistoryRecords().equals(this.getHistoryRecords()) == false)
            return false;
        if (other.getLastEvaluatedTime() == null ^ this.getLastEvaluatedTime() == null)
            return false;
        if (other.getLastEvaluatedTime() != null && other.getLastEvaluatedTime().equals(this.getLastEvaluatedTime()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSpotFleetRequestId() == null ^ this.getSpotFleetRequestId() == null)
            return false;
        if (other.getSpotFleetRequestId() != null && other.getSpotFleetRequestId().equals(this.getSpotFleetRequestId()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHistoryRecords() == null) ? 0 : getHistoryRecords().hashCode());
        hashCode = prime * hashCode + ((getLastEvaluatedTime() == null) ? 0 : getLastEvaluatedTime().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSpotFleetRequestId() == null) ? 0 : getSpotFleetRequestId().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSpotFleetRequestHistoryResult clone() {
        try {
            return (DescribeSpotFleetRequestHistoryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
