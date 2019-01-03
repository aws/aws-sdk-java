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
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFleetHistoryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the events in the history of the EC2 Fleet.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<HistoryRecordEntry> historyRecords;
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
     * The token for the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The ID of the EC Fleet.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * The start date and time for the events, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * Information about the events in the history of the EC2 Fleet.
     * </p>
     * 
     * @return Information about the events in the history of the EC2 Fleet.
     */

    public java.util.List<HistoryRecordEntry> getHistoryRecords() {
        if (historyRecords == null) {
            historyRecords = new com.amazonaws.internal.SdkInternalList<HistoryRecordEntry>();
        }
        return historyRecords;
    }

    /**
     * <p>
     * Information about the events in the history of the EC2 Fleet.
     * </p>
     * 
     * @param historyRecords
     *        Information about the events in the history of the EC2 Fleet.
     */

    public void setHistoryRecords(java.util.Collection<HistoryRecordEntry> historyRecords) {
        if (historyRecords == null) {
            this.historyRecords = null;
            return;
        }

        this.historyRecords = new com.amazonaws.internal.SdkInternalList<HistoryRecordEntry>(historyRecords);
    }

    /**
     * <p>
     * Information about the events in the history of the EC2 Fleet.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHistoryRecords(java.util.Collection)} or {@link #withHistoryRecords(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param historyRecords
     *        Information about the events in the history of the EC2 Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetHistoryResult withHistoryRecords(HistoryRecordEntry... historyRecords) {
        if (this.historyRecords == null) {
            setHistoryRecords(new com.amazonaws.internal.SdkInternalList<HistoryRecordEntry>(historyRecords.length));
        }
        for (HistoryRecordEntry ele : historyRecords) {
            this.historyRecords.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the events in the history of the EC2 Fleet.
     * </p>
     * 
     * @param historyRecords
     *        Information about the events in the history of the EC2 Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetHistoryResult withHistoryRecords(java.util.Collection<HistoryRecordEntry> historyRecords) {
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

    public DescribeFleetHistoryResult withLastEvaluatedTime(java.util.Date lastEvaluatedTime) {
        setLastEvaluatedTime(lastEvaluatedTime);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @return The token for the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetHistoryResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The ID of the EC Fleet.
     * </p>
     * 
     * @param fleetId
     *        The ID of the EC Fleet.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * The ID of the EC Fleet.
     * </p>
     * 
     * @return The ID of the EC Fleet.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * The ID of the EC Fleet.
     * </p>
     * 
     * @param fleetId
     *        The ID of the EC Fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetHistoryResult withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * The start date and time for the events, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     * 
     * @param startTime
     *        The start date and time for the events, in UTC format (for example,
     *        <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start date and time for the events, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     * 
     * @return The start date and time for the events, in UTC format (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start date and time for the events, in UTC format (for example,
     * <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     * 
     * @param startTime
     *        The start date and time for the events, in UTC format (for example,
     *        <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFleetHistoryResult withStartTime(java.util.Date startTime) {
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
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId()).append(",");
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

        if (obj instanceof DescribeFleetHistoryResult == false)
            return false;
        DescribeFleetHistoryResult other = (DescribeFleetHistoryResult) obj;
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
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
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
        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFleetHistoryResult clone() {
        try {
            return (DescribeFleetHistoryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
