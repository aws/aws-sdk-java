/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class FilterLogEventsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the log group to query.
     * </p>
     */
    private String logGroupName;
    /**
     * <p>
     * Optional list of log stream names within the specified log group to search. Defaults to all the log streams in
     * the log group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> logStreamNames;
    /**
     * <p>
     * A point in time expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC. If provided, events with
     * a timestamp prior to this time are not returned.
     * </p>
     */
    private Long startTime;
    /**
     * <p>
     * A point in time expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC. If provided, events with
     * a timestamp later than this time are not returned.
     * </p>
     */
    private Long endTime;
    /**
     * <p>
     * A valid CloudWatch Logs filter pattern to use for filtering the response. If not provided, all the events are
     * matched.
     * </p>
     */
    private String filterPattern;
    /**
     * <p>
     * A pagination token obtained from a <code>FilterLogEvents</code> response to continue paginating the
     * FilterLogEvents results. This token is omitted from the response when there are no other events to display.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of events to return in a page of results. Default is 10,000 events.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * If provided, the API will make a best effort to provide responses that contain events from multiple log streams
     * within the log group interleaved in a single response. If not provided, all the matched log events in the first
     * log stream will be searched first, then those in the next log stream, etc.
     * </p>
     */
    private Boolean interleaved;

    /**
     * <p>
     * The name of the log group to query.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group to query.
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of the log group to query.
     * </p>
     * 
     * @return The name of the log group to query.
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * The name of the log group to query.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group to query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterLogEventsRequest withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * <p>
     * Optional list of log stream names within the specified log group to search. Defaults to all the log streams in
     * the log group.
     * </p>
     * 
     * @return Optional list of log stream names within the specified log group to search. Defaults to all the log
     *         streams in the log group.
     */

    public java.util.List<String> getLogStreamNames() {
        if (logStreamNames == null) {
            logStreamNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return logStreamNames;
    }

    /**
     * <p>
     * Optional list of log stream names within the specified log group to search. Defaults to all the log streams in
     * the log group.
     * </p>
     * 
     * @param logStreamNames
     *        Optional list of log stream names within the specified log group to search. Defaults to all the log
     *        streams in the log group.
     */

    public void setLogStreamNames(java.util.Collection<String> logStreamNames) {
        if (logStreamNames == null) {
            this.logStreamNames = null;
            return;
        }

        this.logStreamNames = new com.amazonaws.internal.SdkInternalList<String>(logStreamNames);
    }

    /**
     * <p>
     * Optional list of log stream names within the specified log group to search. Defaults to all the log streams in
     * the log group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogStreamNames(java.util.Collection)} or {@link #withLogStreamNames(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param logStreamNames
     *        Optional list of log stream names within the specified log group to search. Defaults to all the log
     *        streams in the log group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterLogEventsRequest withLogStreamNames(String... logStreamNames) {
        if (this.logStreamNames == null) {
            setLogStreamNames(new com.amazonaws.internal.SdkInternalList<String>(logStreamNames.length));
        }
        for (String ele : logStreamNames) {
            this.logStreamNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Optional list of log stream names within the specified log group to search. Defaults to all the log streams in
     * the log group.
     * </p>
     * 
     * @param logStreamNames
     *        Optional list of log stream names within the specified log group to search. Defaults to all the log
     *        streams in the log group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterLogEventsRequest withLogStreamNames(java.util.Collection<String> logStreamNames) {
        setLogStreamNames(logStreamNames);
        return this;
    }

    /**
     * <p>
     * A point in time expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC. If provided, events with
     * a timestamp prior to this time are not returned.
     * </p>
     * 
     * @param startTime
     *        A point in time expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC. If provided,
     *        events with a timestamp prior to this time are not returned.
     */

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * A point in time expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC. If provided, events with
     * a timestamp prior to this time are not returned.
     * </p>
     * 
     * @return A point in time expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC. If provided,
     *         events with a timestamp prior to this time are not returned.
     */

    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * A point in time expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC. If provided, events with
     * a timestamp prior to this time are not returned.
     * </p>
     * 
     * @param startTime
     *        A point in time expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC. If provided,
     *        events with a timestamp prior to this time are not returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterLogEventsRequest withStartTime(Long startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * A point in time expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC. If provided, events with
     * a timestamp later than this time are not returned.
     * </p>
     * 
     * @param endTime
     *        A point in time expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC. If provided,
     *        events with a timestamp later than this time are not returned.
     */

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * A point in time expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC. If provided, events with
     * a timestamp later than this time are not returned.
     * </p>
     * 
     * @return A point in time expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC. If provided,
     *         events with a timestamp later than this time are not returned.
     */

    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * A point in time expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC. If provided, events with
     * a timestamp later than this time are not returned.
     * </p>
     * 
     * @param endTime
     *        A point in time expressed as the number of milliseconds since Jan 1, 1970 00:00:00 UTC. If provided,
     *        events with a timestamp later than this time are not returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterLogEventsRequest withEndTime(Long endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * A valid CloudWatch Logs filter pattern to use for filtering the response. If not provided, all the events are
     * matched.
     * </p>
     * 
     * @param filterPattern
     *        A valid CloudWatch Logs filter pattern to use for filtering the response. If not provided, all the events
     *        are matched.
     */

    public void setFilterPattern(String filterPattern) {
        this.filterPattern = filterPattern;
    }

    /**
     * <p>
     * A valid CloudWatch Logs filter pattern to use for filtering the response. If not provided, all the events are
     * matched.
     * </p>
     * 
     * @return A valid CloudWatch Logs filter pattern to use for filtering the response. If not provided, all the events
     *         are matched.
     */

    public String getFilterPattern() {
        return this.filterPattern;
    }

    /**
     * <p>
     * A valid CloudWatch Logs filter pattern to use for filtering the response. If not provided, all the events are
     * matched.
     * </p>
     * 
     * @param filterPattern
     *        A valid CloudWatch Logs filter pattern to use for filtering the response. If not provided, all the events
     *        are matched.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterLogEventsRequest withFilterPattern(String filterPattern) {
        setFilterPattern(filterPattern);
        return this;
    }

    /**
     * <p>
     * A pagination token obtained from a <code>FilterLogEvents</code> response to continue paginating the
     * FilterLogEvents results. This token is omitted from the response when there are no other events to display.
     * </p>
     * 
     * @param nextToken
     *        A pagination token obtained from a <code>FilterLogEvents</code> response to continue paginating the
     *        FilterLogEvents results. This token is omitted from the response when there are no other events to
     *        display.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token obtained from a <code>FilterLogEvents</code> response to continue paginating the
     * FilterLogEvents results. This token is omitted from the response when there are no other events to display.
     * </p>
     * 
     * @return A pagination token obtained from a <code>FilterLogEvents</code> response to continue paginating the
     *         FilterLogEvents results. This token is omitted from the response when there are no other events to
     *         display.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token obtained from a <code>FilterLogEvents</code> response to continue paginating the
     * FilterLogEvents results. This token is omitted from the response when there are no other events to display.
     * </p>
     * 
     * @param nextToken
     *        A pagination token obtained from a <code>FilterLogEvents</code> response to continue paginating the
     *        FilterLogEvents results. This token is omitted from the response when there are no other events to
     *        display.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterLogEventsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of events to return in a page of results. Default is 10,000 events.
     * </p>
     * 
     * @param limit
     *        The maximum number of events to return in a page of results. Default is 10,000 events.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of events to return in a page of results. Default is 10,000 events.
     * </p>
     * 
     * @return The maximum number of events to return in a page of results. Default is 10,000 events.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of events to return in a page of results. Default is 10,000 events.
     * </p>
     * 
     * @param limit
     *        The maximum number of events to return in a page of results. Default is 10,000 events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterLogEventsRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * If provided, the API will make a best effort to provide responses that contain events from multiple log streams
     * within the log group interleaved in a single response. If not provided, all the matched log events in the first
     * log stream will be searched first, then those in the next log stream, etc.
     * </p>
     * 
     * @param interleaved
     *        If provided, the API will make a best effort to provide responses that contain events from multiple log
     *        streams within the log group interleaved in a single response. If not provided, all the matched log events
     *        in the first log stream will be searched first, then those in the next log stream, etc.
     */

    public void setInterleaved(Boolean interleaved) {
        this.interleaved = interleaved;
    }

    /**
     * <p>
     * If provided, the API will make a best effort to provide responses that contain events from multiple log streams
     * within the log group interleaved in a single response. If not provided, all the matched log events in the first
     * log stream will be searched first, then those in the next log stream, etc.
     * </p>
     * 
     * @return If provided, the API will make a best effort to provide responses that contain events from multiple log
     *         streams within the log group interleaved in a single response. If not provided, all the matched log
     *         events in the first log stream will be searched first, then those in the next log stream, etc.
     */

    public Boolean getInterleaved() {
        return this.interleaved;
    }

    /**
     * <p>
     * If provided, the API will make a best effort to provide responses that contain events from multiple log streams
     * within the log group interleaved in a single response. If not provided, all the matched log events in the first
     * log stream will be searched first, then those in the next log stream, etc.
     * </p>
     * 
     * @param interleaved
     *        If provided, the API will make a best effort to provide responses that contain events from multiple log
     *        streams within the log group interleaved in a single response. If not provided, all the matched log events
     *        in the first log stream will be searched first, then those in the next log stream, etc.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterLogEventsRequest withInterleaved(Boolean interleaved) {
        setInterleaved(interleaved);
        return this;
    }

    /**
     * <p>
     * If provided, the API will make a best effort to provide responses that contain events from multiple log streams
     * within the log group interleaved in a single response. If not provided, all the matched log events in the first
     * log stream will be searched first, then those in the next log stream, etc.
     * </p>
     * 
     * @return If provided, the API will make a best effort to provide responses that contain events from multiple log
     *         streams within the log group interleaved in a single response. If not provided, all the matched log
     *         events in the first log stream will be searched first, then those in the next log stream, etc.
     */

    public Boolean isInterleaved() {
        return this.interleaved;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLogGroupName() != null)
            sb.append("LogGroupName: " + getLogGroupName() + ",");
        if (getLogStreamNames() != null)
            sb.append("LogStreamNames: " + getLogStreamNames() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getFilterPattern() != null)
            sb.append("FilterPattern: " + getFilterPattern() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getLimit() != null)
            sb.append("Limit: " + getLimit() + ",");
        if (getInterleaved() != null)
            sb.append("Interleaved: " + getInterleaved());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FilterLogEventsRequest == false)
            return false;
        FilterLogEventsRequest other = (FilterLogEventsRequest) obj;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getLogStreamNames() == null ^ this.getLogStreamNames() == null)
            return false;
        if (other.getLogStreamNames() != null && other.getLogStreamNames().equals(this.getLogStreamNames()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getFilterPattern() == null ^ this.getFilterPattern() == null)
            return false;
        if (other.getFilterPattern() != null && other.getFilterPattern().equals(this.getFilterPattern()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getInterleaved() == null ^ this.getInterleaved() == null)
            return false;
        if (other.getInterleaved() != null && other.getInterleaved().equals(this.getInterleaved()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getLogStreamNames() == null) ? 0 : getLogStreamNames().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getFilterPattern() == null) ? 0 : getFilterPattern().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getInterleaved() == null) ? 0 : getInterleaved().hashCode());
        return hashCode;
    }

    @Override
    public FilterLogEventsRequest clone() {
        return (FilterLogEventsRequest) super.clone();
    }
}
