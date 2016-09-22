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
public class GetLogEventsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the log group to query.
     * </p>
     */
    private String logGroupName;
    /**
     * <p>
     * The name of the log stream to query.
     * </p>
     */
    private String logStreamName;

    private Long startTime;

    private Long endTime;
    /**
     * <p>
     * A string token used for pagination that points to the next page of results. It must be a value obtained from the
     * <code>nextForwardToken</code> or <code>nextBackwardToken</code> fields in the response of the previous
     * <code>GetLogEvents</code> request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of log events returned in the response. If you don't specify a value, the request would return
     * as many log events as can fit in a response size of 1MB, up to 10,000 log events.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * If set to true, the earliest log events would be returned first. The default is false (the latest log events are
     * returned first).
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
     *        The name of the log group to query.
     * @param logStreamName
     *        The name of the log stream to query.
     */
    public GetLogEventsRequest(String logGroupName, String logStreamName) {
        setLogGroupName(logGroupName);
        setLogStreamName(logStreamName);
    }

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

    public GetLogEventsRequest withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the log stream to query.
     * </p>
     * 
     * @param logStreamName
     *        The name of the log stream to query.
     */

    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }

    /**
     * <p>
     * The name of the log stream to query.
     * </p>
     * 
     * @return The name of the log stream to query.
     */

    public String getLogStreamName() {
        return this.logStreamName;
    }

    /**
     * <p>
     * The name of the log stream to query.
     * </p>
     * 
     * @param logStreamName
     *        The name of the log stream to query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLogEventsRequest withLogStreamName(String logStreamName) {
        setLogStreamName(logStreamName);
        return this;
    }

    /**
     * @param startTime
     */

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    /**
     * @return
     */

    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @param startTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLogEventsRequest withStartTime(Long startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * @param endTime
     */

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    /**
     * @return
     */

    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @param endTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLogEventsRequest withEndTime(Long endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * A string token used for pagination that points to the next page of results. It must be a value obtained from the
     * <code>nextForwardToken</code> or <code>nextBackwardToken</code> fields in the response of the previous
     * <code>GetLogEvents</code> request.
     * </p>
     * 
     * @param nextToken
     *        A string token used for pagination that points to the next page of results. It must be a value obtained
     *        from the <code>nextForwardToken</code> or <code>nextBackwardToken</code> fields in the response of the
     *        previous <code>GetLogEvents</code> request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A string token used for pagination that points to the next page of results. It must be a value obtained from the
     * <code>nextForwardToken</code> or <code>nextBackwardToken</code> fields in the response of the previous
     * <code>GetLogEvents</code> request.
     * </p>
     * 
     * @return A string token used for pagination that points to the next page of results. It must be a value obtained
     *         from the <code>nextForwardToken</code> or <code>nextBackwardToken</code> fields in the response of the
     *         previous <code>GetLogEvents</code> request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A string token used for pagination that points to the next page of results. It must be a value obtained from the
     * <code>nextForwardToken</code> or <code>nextBackwardToken</code> fields in the response of the previous
     * <code>GetLogEvents</code> request.
     * </p>
     * 
     * @param nextToken
     *        A string token used for pagination that points to the next page of results. It must be a value obtained
     *        from the <code>nextForwardToken</code> or <code>nextBackwardToken</code> fields in the response of the
     *        previous <code>GetLogEvents</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLogEventsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of log events returned in the response. If you don't specify a value, the request would return
     * as many log events as can fit in a response size of 1MB, up to 10,000 log events.
     * </p>
     * 
     * @param limit
     *        The maximum number of log events returned in the response. If you don't specify a value, the request would
     *        return as many log events as can fit in a response size of 1MB, up to 10,000 log events.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of log events returned in the response. If you don't specify a value, the request would return
     * as many log events as can fit in a response size of 1MB, up to 10,000 log events.
     * </p>
     * 
     * @return The maximum number of log events returned in the response. If you don't specify a value, the request
     *         would return as many log events as can fit in a response size of 1MB, up to 10,000 log events.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of log events returned in the response. If you don't specify a value, the request would return
     * as many log events as can fit in a response size of 1MB, up to 10,000 log events.
     * </p>
     * 
     * @param limit
     *        The maximum number of log events returned in the response. If you don't specify a value, the request would
     *        return as many log events as can fit in a response size of 1MB, up to 10,000 log events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLogEventsRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * If set to true, the earliest log events would be returned first. The default is false (the latest log events are
     * returned first).
     * </p>
     * 
     * @param startFromHead
     *        If set to true, the earliest log events would be returned first. The default is false (the latest log
     *        events are returned first).
     */

    public void setStartFromHead(Boolean startFromHead) {
        this.startFromHead = startFromHead;
    }

    /**
     * <p>
     * If set to true, the earliest log events would be returned first. The default is false (the latest log events are
     * returned first).
     * </p>
     * 
     * @return If set to true, the earliest log events would be returned first. The default is false (the latest log
     *         events are returned first).
     */

    public Boolean getStartFromHead() {
        return this.startFromHead;
    }

    /**
     * <p>
     * If set to true, the earliest log events would be returned first. The default is false (the latest log events are
     * returned first).
     * </p>
     * 
     * @param startFromHead
     *        If set to true, the earliest log events would be returned first. The default is false (the latest log
     *        events are returned first).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLogEventsRequest withStartFromHead(Boolean startFromHead) {
        setStartFromHead(startFromHead);
        return this;
    }

    /**
     * <p>
     * If set to true, the earliest log events would be returned first. The default is false (the latest log events are
     * returned first).
     * </p>
     * 
     * @return If set to true, the earliest log events would be returned first. The default is false (the latest log
     *         events are returned first).
     */

    public Boolean isStartFromHead() {
        return this.startFromHead;
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
        if (getLogStreamName() != null)
            sb.append("LogStreamName: " + getLogStreamName() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getLimit() != null)
            sb.append("Limit: " + getLimit() + ",");
        if (getStartFromHead() != null)
            sb.append("StartFromHead: " + getStartFromHead());
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
