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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/FilterLogEvents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilterLogEventsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the log group to search.
     * </p>
     */
    private String logGroupName;
    /**
     * <p>
     * Filters the results to only logs from the log streams in this list.
     * </p>
     * <p>
     * If you specify a value for both <code>logStreamNamePrefix</code> and <code>logStreamNames</code>, the action
     * returns an <code>InvalidParameterException</code> error.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> logStreamNames;
    /**
     * <p>
     * Filters the results to include only events from log streams that have names starting with this prefix.
     * </p>
     * <p>
     * If you specify a value for both <code>logStreamNamePrefix</code> and <code>logStreamNames</code>, but the value
     * for <code>logStreamNamePrefix</code> does not match any log stream names specified in <code>logStreamNames</code>
     * , the action returns an <code>InvalidParameterException</code> error.
     * </p>
     */
    private String logStreamNamePrefix;
    /**
     * <p>
     * The start of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with
     * a timestamp before this time are not returned.
     * </p>
     */
    private Long startTime;
    /**
     * <p>
     * The end of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a
     * timestamp later than this time are not returned.
     * </p>
     */
    private Long endTime;
    /**
     * <p>
     * The filter pattern to use. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html">Filter and Pattern
     * Syntax</a>.
     * </p>
     * <p>
     * If not provided, all the events are matched.
     * </p>
     */
    private String filterPattern;
    /**
     * <p>
     * The token for the next set of events to return. (You received this token from a previous call.)
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of events to return. The default is 10,000 events.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * If the value is true, the operation makes a best effort to provide responses that contain events from multiple
     * log streams within the log group, interleaved in a single response. If the value is false, all the matched log
     * events in the first log stream are searched first, then those in the next log stream, and so on. The default is
     * false.
     * </p>
     */
    private Boolean interleaved;

    /**
     * <p>
     * The name of the log group to search.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group to search.
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of the log group to search.
     * </p>
     * 
     * @return The name of the log group to search.
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * The name of the log group to search.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group to search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterLogEventsRequest withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * <p>
     * Filters the results to only logs from the log streams in this list.
     * </p>
     * <p>
     * If you specify a value for both <code>logStreamNamePrefix</code> and <code>logStreamNames</code>, the action
     * returns an <code>InvalidParameterException</code> error.
     * </p>
     * 
     * @return Filters the results to only logs from the log streams in this list.</p>
     *         <p>
     *         If you specify a value for both <code>logStreamNamePrefix</code> and <code>logStreamNames</code>, the
     *         action returns an <code>InvalidParameterException</code> error.
     */

    public java.util.List<String> getLogStreamNames() {
        if (logStreamNames == null) {
            logStreamNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return logStreamNames;
    }

    /**
     * <p>
     * Filters the results to only logs from the log streams in this list.
     * </p>
     * <p>
     * If you specify a value for both <code>logStreamNamePrefix</code> and <code>logStreamNames</code>, the action
     * returns an <code>InvalidParameterException</code> error.
     * </p>
     * 
     * @param logStreamNames
     *        Filters the results to only logs from the log streams in this list.</p>
     *        <p>
     *        If you specify a value for both <code>logStreamNamePrefix</code> and <code>logStreamNames</code>, the
     *        action returns an <code>InvalidParameterException</code> error.
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
     * Filters the results to only logs from the log streams in this list.
     * </p>
     * <p>
     * If you specify a value for both <code>logStreamNamePrefix</code> and <code>logStreamNames</code>, the action
     * returns an <code>InvalidParameterException</code> error.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogStreamNames(java.util.Collection)} or {@link #withLogStreamNames(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param logStreamNames
     *        Filters the results to only logs from the log streams in this list.</p>
     *        <p>
     *        If you specify a value for both <code>logStreamNamePrefix</code> and <code>logStreamNames</code>, the
     *        action returns an <code>InvalidParameterException</code> error.
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
     * Filters the results to only logs from the log streams in this list.
     * </p>
     * <p>
     * If you specify a value for both <code>logStreamNamePrefix</code> and <code>logStreamNames</code>, the action
     * returns an <code>InvalidParameterException</code> error.
     * </p>
     * 
     * @param logStreamNames
     *        Filters the results to only logs from the log streams in this list.</p>
     *        <p>
     *        If you specify a value for both <code>logStreamNamePrefix</code> and <code>logStreamNames</code>, the
     *        action returns an <code>InvalidParameterException</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterLogEventsRequest withLogStreamNames(java.util.Collection<String> logStreamNames) {
        setLogStreamNames(logStreamNames);
        return this;
    }

    /**
     * <p>
     * Filters the results to include only events from log streams that have names starting with this prefix.
     * </p>
     * <p>
     * If you specify a value for both <code>logStreamNamePrefix</code> and <code>logStreamNames</code>, but the value
     * for <code>logStreamNamePrefix</code> does not match any log stream names specified in <code>logStreamNames</code>
     * , the action returns an <code>InvalidParameterException</code> error.
     * </p>
     * 
     * @param logStreamNamePrefix
     *        Filters the results to include only events from log streams that have names starting with this prefix.</p>
     *        <p>
     *        If you specify a value for both <code>logStreamNamePrefix</code> and <code>logStreamNames</code>, but the
     *        value for <code>logStreamNamePrefix</code> does not match any log stream names specified in
     *        <code>logStreamNames</code>, the action returns an <code>InvalidParameterException</code> error.
     */

    public void setLogStreamNamePrefix(String logStreamNamePrefix) {
        this.logStreamNamePrefix = logStreamNamePrefix;
    }

    /**
     * <p>
     * Filters the results to include only events from log streams that have names starting with this prefix.
     * </p>
     * <p>
     * If you specify a value for both <code>logStreamNamePrefix</code> and <code>logStreamNames</code>, but the value
     * for <code>logStreamNamePrefix</code> does not match any log stream names specified in <code>logStreamNames</code>
     * , the action returns an <code>InvalidParameterException</code> error.
     * </p>
     * 
     * @return Filters the results to include only events from log streams that have names starting with this
     *         prefix.</p>
     *         <p>
     *         If you specify a value for both <code>logStreamNamePrefix</code> and <code>logStreamNames</code>, but the
     *         value for <code>logStreamNamePrefix</code> does not match any log stream names specified in
     *         <code>logStreamNames</code>, the action returns an <code>InvalidParameterException</code> error.
     */

    public String getLogStreamNamePrefix() {
        return this.logStreamNamePrefix;
    }

    /**
     * <p>
     * Filters the results to include only events from log streams that have names starting with this prefix.
     * </p>
     * <p>
     * If you specify a value for both <code>logStreamNamePrefix</code> and <code>logStreamNames</code>, but the value
     * for <code>logStreamNamePrefix</code> does not match any log stream names specified in <code>logStreamNames</code>
     * , the action returns an <code>InvalidParameterException</code> error.
     * </p>
     * 
     * @param logStreamNamePrefix
     *        Filters the results to include only events from log streams that have names starting with this prefix.</p>
     *        <p>
     *        If you specify a value for both <code>logStreamNamePrefix</code> and <code>logStreamNames</code>, but the
     *        value for <code>logStreamNamePrefix</code> does not match any log stream names specified in
     *        <code>logStreamNames</code>, the action returns an <code>InvalidParameterException</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterLogEventsRequest withLogStreamNamePrefix(String logStreamNamePrefix) {
        setLogStreamNamePrefix(logStreamNamePrefix);
        return this;
    }

    /**
     * <p>
     * The start of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with
     * a timestamp before this time are not returned.
     * </p>
     * 
     * @param startTime
     *        The start of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     *        Events with a timestamp before this time are not returned.
     */

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with
     * a timestamp before this time are not returned.
     * </p>
     * 
     * @return The start of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     *         Events with a timestamp before this time are not returned.
     */

    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with
     * a timestamp before this time are not returned.
     * </p>
     * 
     * @param startTime
     *        The start of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
     *        Events with a timestamp before this time are not returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterLogEventsRequest withStartTime(Long startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a
     * timestamp later than this time are not returned.
     * </p>
     * 
     * @param endTime
     *        The end of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events
     *        with a timestamp later than this time are not returned.
     */

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a
     * timestamp later than this time are not returned.
     * </p>
     * 
     * @return The end of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events
     *         with a timestamp later than this time are not returned.
     */

    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events with a
     * timestamp later than this time are not returned.
     * </p>
     * 
     * @param endTime
     *        The end of the time range, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. Events
     *        with a timestamp later than this time are not returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterLogEventsRequest withEndTime(Long endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The filter pattern to use. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html">Filter and Pattern
     * Syntax</a>.
     * </p>
     * <p>
     * If not provided, all the events are matched.
     * </p>
     * 
     * @param filterPattern
     *        The filter pattern to use. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html">Filter and
     *        Pattern Syntax</a>.</p>
     *        <p>
     *        If not provided, all the events are matched.
     */

    public void setFilterPattern(String filterPattern) {
        this.filterPattern = filterPattern;
    }

    /**
     * <p>
     * The filter pattern to use. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html">Filter and Pattern
     * Syntax</a>.
     * </p>
     * <p>
     * If not provided, all the events are matched.
     * </p>
     * 
     * @return The filter pattern to use. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html">Filter and
     *         Pattern Syntax</a>.</p>
     *         <p>
     *         If not provided, all the events are matched.
     */

    public String getFilterPattern() {
        return this.filterPattern;
    }

    /**
     * <p>
     * The filter pattern to use. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html">Filter and Pattern
     * Syntax</a>.
     * </p>
     * <p>
     * If not provided, all the events are matched.
     * </p>
     * 
     * @param filterPattern
     *        The filter pattern to use. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html">Filter and
     *        Pattern Syntax</a>.</p>
     *        <p>
     *        If not provided, all the events are matched.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterLogEventsRequest withFilterPattern(String filterPattern) {
        setFilterPattern(filterPattern);
        return this;
    }

    /**
     * <p>
     * The token for the next set of events to return. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of events to return. (You received this token from a previous call.)
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of events to return. (You received this token from a previous call.)
     * </p>
     * 
     * @return The token for the next set of events to return. (You received this token from a previous call.)
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of events to return. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of events to return. (You received this token from a previous call.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterLogEventsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of events to return. The default is 10,000 events.
     * </p>
     * 
     * @param limit
     *        The maximum number of events to return. The default is 10,000 events.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of events to return. The default is 10,000 events.
     * </p>
     * 
     * @return The maximum number of events to return. The default is 10,000 events.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of events to return. The default is 10,000 events.
     * </p>
     * 
     * @param limit
     *        The maximum number of events to return. The default is 10,000 events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterLogEventsRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * If the value is true, the operation makes a best effort to provide responses that contain events from multiple
     * log streams within the log group, interleaved in a single response. If the value is false, all the matched log
     * events in the first log stream are searched first, then those in the next log stream, and so on. The default is
     * false.
     * </p>
     * 
     * @param interleaved
     *        If the value is true, the operation makes a best effort to provide responses that contain events from
     *        multiple log streams within the log group, interleaved in a single response. If the value is false, all
     *        the matched log events in the first log stream are searched first, then those in the next log stream, and
     *        so on. The default is false.
     */

    public void setInterleaved(Boolean interleaved) {
        this.interleaved = interleaved;
    }

    /**
     * <p>
     * If the value is true, the operation makes a best effort to provide responses that contain events from multiple
     * log streams within the log group, interleaved in a single response. If the value is false, all the matched log
     * events in the first log stream are searched first, then those in the next log stream, and so on. The default is
     * false.
     * </p>
     * 
     * @return If the value is true, the operation makes a best effort to provide responses that contain events from
     *         multiple log streams within the log group, interleaved in a single response. If the value is false, all
     *         the matched log events in the first log stream are searched first, then those in the next log stream, and
     *         so on. The default is false.
     */

    public Boolean getInterleaved() {
        return this.interleaved;
    }

    /**
     * <p>
     * If the value is true, the operation makes a best effort to provide responses that contain events from multiple
     * log streams within the log group, interleaved in a single response. If the value is false, all the matched log
     * events in the first log stream are searched first, then those in the next log stream, and so on. The default is
     * false.
     * </p>
     * 
     * @param interleaved
     *        If the value is true, the operation makes a best effort to provide responses that contain events from
     *        multiple log streams within the log group, interleaved in a single response. If the value is false, all
     *        the matched log events in the first log stream are searched first, then those in the next log stream, and
     *        so on. The default is false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterLogEventsRequest withInterleaved(Boolean interleaved) {
        setInterleaved(interleaved);
        return this;
    }

    /**
     * <p>
     * If the value is true, the operation makes a best effort to provide responses that contain events from multiple
     * log streams within the log group, interleaved in a single response. If the value is false, all the matched log
     * events in the first log stream are searched first, then those in the next log stream, and so on. The default is
     * false.
     * </p>
     * 
     * @return If the value is true, the operation makes a best effort to provide responses that contain events from
     *         multiple log streams within the log group, interleaved in a single response. If the value is false, all
     *         the matched log events in the first log stream are searched first, then those in the next log stream, and
     *         so on. The default is false.
     */

    public Boolean isInterleaved() {
        return this.interleaved;
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
        if (getLogStreamNames() != null)
            sb.append("LogStreamNames: ").append(getLogStreamNames()).append(",");
        if (getLogStreamNamePrefix() != null)
            sb.append("LogStreamNamePrefix: ").append(getLogStreamNamePrefix()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getFilterPattern() != null)
            sb.append("FilterPattern: ").append(getFilterPattern()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getInterleaved() != null)
            sb.append("Interleaved: ").append(getInterleaved());
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
        if (other.getLogStreamNamePrefix() == null ^ this.getLogStreamNamePrefix() == null)
            return false;
        if (other.getLogStreamNamePrefix() != null && other.getLogStreamNamePrefix().equals(this.getLogStreamNamePrefix()) == false)
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
        hashCode = prime * hashCode + ((getLogStreamNamePrefix() == null) ? 0 : getLogStreamNamePrefix().hashCode());
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
