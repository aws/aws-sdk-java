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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/GetLogEvents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLogEventsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the log group.
     * </p>
     */
    private String logGroupName;
    /**
     * <p>
     * The name of the log stream.
     * </p>
     */
    private String logStreamName;
    /**
     * <p>
     * The start of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with
     * a timestamp equal to this time or later than this time are included. Events with a timestamp earlier than this
     * time are not included.
     * </p>
     */
    private Long startTime;
    /**
     * <p>
     * The end of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a
     * timestamp equal to or later than this time are not included.
     * </p>
     */
    private Long endTime;
    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of log events returned. If you don't specify a value, the maximum is as many log events as can
     * fit in a response size of 1 MB, up to 10,000 log events.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * If the value is true, the earliest log events are returned first. If the value is false, the latest log events
     * are returned first. The default value is false.
     * </p>
     */
    private Boolean startFromHead;

    /**
     * Default constructor for GetLogEventsRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public GetLogEventsRequest() {
    }

    /**
     * Constructs a new GetLogEventsRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param logGroupName
     *        The name of the log group.
     * @param logStreamName
     *        The name of the log stream.
     */
    public GetLogEventsRequest(String logGroupName, String logStreamName) {
        setLogGroupName(logGroupName);
        setLogStreamName(logStreamName);
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group.
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * 
     * @return The name of the log group.
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * The name of the log group.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLogEventsRequest withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the log stream.
     * </p>
     * 
     * @param logStreamName
     *        The name of the log stream.
     */

    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }

    /**
     * <p>
     * The name of the log stream.
     * </p>
     * 
     * @return The name of the log stream.
     */

    public String getLogStreamName() {
        return this.logStreamName;
    }

    /**
     * <p>
     * The name of the log stream.
     * </p>
     * 
     * @param logStreamName
     *        The name of the log stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLogEventsRequest withLogStreamName(String logStreamName) {
        setLogStreamName(logStreamName);
        return this;
    }

    /**
     * <p>
     * The start of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with
     * a timestamp equal to this time or later than this time are included. Events with a timestamp earlier than this
     * time are not included.
     * </p>
     * 
     * @param startTime
     *        The start of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     *        Events with a timestamp equal to this time or later than this time are included. Events with a timestamp
     *        earlier than this time are not included.
     */

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with
     * a timestamp equal to this time or later than this time are included. Events with a timestamp earlier than this
     * time are not included.
     * </p>
     * 
     * @return The start of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     *         Events with a timestamp equal to this time or later than this time are included. Events with a timestamp
     *         earlier than this time are not included.
     */

    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with
     * a timestamp equal to this time or later than this time are included. Events with a timestamp earlier than this
     * time are not included.
     * </p>
     * 
     * @param startTime
     *        The start of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     *        Events with a timestamp equal to this time or later than this time are included. Events with a timestamp
     *        earlier than this time are not included.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLogEventsRequest withStartTime(Long startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a
     * timestamp equal to or later than this time are not included.
     * </p>
     * 
     * @param endTime
     *        The end of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events
     *        with a timestamp equal to or later than this time are not included.
     */

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a
     * timestamp equal to or later than this time are not included.
     * </p>
     * 
     * @return The end of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events
     *         with a timestamp equal to or later than this time are not included.
     */

    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a
     * timestamp equal to or later than this time are not included.
     * </p>
     * 
     * @param endTime
     *        The end of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events
     *        with a timestamp equal to or later than this time are not included.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLogEventsRequest withEndTime(Long endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this token from a previous call.)
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @return The token for the next set of items to return. (You received this token from a previous call.)
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this token from a previous call.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLogEventsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of log events returned. If you don't specify a value, the maximum is as many log events as can
     * fit in a response size of 1 MB, up to 10,000 log events.
     * </p>
     * 
     * @param limit
     *        The maximum number of log events returned. If you don't specify a value, the maximum is as many log events
     *        as can fit in a response size of 1 MB, up to 10,000 log events.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of log events returned. If you don't specify a value, the maximum is as many log events as can
     * fit in a response size of 1 MB, up to 10,000 log events.
     * </p>
     * 
     * @return The maximum number of log events returned. If you don't specify a value, the maximum is as many log
     *         events as can fit in a response size of 1 MB, up to 10,000 log events.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of log events returned. If you don't specify a value, the maximum is as many log events as can
     * fit in a response size of 1 MB, up to 10,000 log events.
     * </p>
     * 
     * @param limit
     *        The maximum number of log events returned. If you don't specify a value, the maximum is as many log events
     *        as can fit in a response size of 1 MB, up to 10,000 log events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLogEventsRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * If the value is true, the earliest log events are returned first. If the value is false, the latest log events
     * are returned first. The default value is false.
     * </p>
     * 
     * @param startFromHead
     *        If the value is true, the earliest log events are returned first. If the value is false, the latest log
     *        events are returned first. The default value is false.
     */

    public void setStartFromHead(Boolean startFromHead) {
        this.startFromHead = startFromHead;
    }

    /**
     * <p>
     * If the value is true, the earliest log events are returned first. If the value is false, the latest log events
     * are returned first. The default value is false.
     * </p>
     * 
     * @return If the value is true, the earliest log events are returned first. If the value is false, the latest log
     *         events are returned first. The default value is false.
     */

    public Boolean getStartFromHead() {
        return this.startFromHead;
    }

    /**
     * <p>
     * If the value is true, the earliest log events are returned first. If the value is false, the latest log events
     * are returned first. The default value is false.
     * </p>
     * 
     * @param startFromHead
     *        If the value is true, the earliest log events are returned first. If the value is false, the latest log
     *        events are returned first. The default value is false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLogEventsRequest withStartFromHead(Boolean startFromHead) {
        setStartFromHead(startFromHead);
        return this;
    }

    /**
     * <p>
     * If the value is true, the earliest log events are returned first. If the value is false, the latest log events
     * are returned first. The default value is false.
     * </p>
     * 
     * @return If the value is true, the earliest log events are returned first. If the value is false, the latest log
     *         events are returned first. The default value is false.
     */

    public Boolean isStartFromHead() {
        return this.startFromHead;
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
        if (getLogGroupName() != null)
            sb.append("LogGroupName: ").append(getLogGroupName()).append(",");
        if (getLogStreamName() != null)
            sb.append("LogStreamName: ").append(getLogStreamName()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getStartFromHead() != null)
            sb.append("StartFromHead: ").append(getStartFromHead());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLogEventsRequest == false)
            return false;
        GetLogEventsRequest other = (GetLogEventsRequest) obj;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getLogStreamName() == null ^ this.getLogStreamName() == null)
            return false;
        if (other.getLogStreamName() != null && other.getLogStreamName().equals(this.getLogStreamName()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getStartFromHead() == null ^ this.getStartFromHead() == null)
            return false;
        if (other.getStartFromHead() != null && other.getStartFromHead().equals(this.getStartFromHead()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getLogStreamName() == null) ? 0 : getLogStreamName().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getStartFromHead() == null) ? 0 : getStartFromHead().hashCode());
        return hashCode;
    }

    @Override
    public GetLogEventsRequest clone() {
        return (GetLogEventsRequest) super.clone();
    }

}
