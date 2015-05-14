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
package com.amazonaws.services.logs.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.logs.AWSLogs#filterLogEvents(FilterLogEventsRequest) FilterLogEvents operation}.
 * <p>
 * Retrieves log events, optionally filtered by a filter pattern from
 * the specified log group. You can provide an optional time range to
 * filter the results on the event <code>timestamp</code> . You can limit
 * the streams searched to an explicit list of
 * <code>logStreamNames</code> .
 * 
 * </p>
 * <p>
 * By default, this operation returns as much matching log events as can
 * fit in a response size of 1MB, up to 10,000 log events, or all the
 * events found within a time-bounded scan window. If the response
 * includes a <code>nextToken</code> , then there is more data to search,
 * and the search can be resumed with a new request providing the
 * nextToken. The response will contain a list of
 * <code>searchedLogStreams</code> that contains information about which
 * streams were searched in the request and whether they have been
 * searched completely or require further pagination. The
 * <code>limit</code> parameter in the request. can be used to specify
 * the maximum number of events to return in a page.
 * </p>
 *
 * @see com.amazonaws.services.logs.AWSLogs#filterLogEvents(FilterLogEventsRequest)
 */
public class FilterLogEventsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name of the log group to query
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     */
    private String logGroupName;

    /**
     * Optional list of log stream names within the specified log group to
     * search. Defaults to all the log streams in the log group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> logStreamNames;

    /**
     * A unix timestamp indicating the start time of the range for the
     * request. If provided, events with a timestamp prior to this time will
     * not be returned.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long startTime;

    /**
     * A unix timestamp indicating the end time of the range for the request.
     * If provided, events with a timestamp later than this time will not be
     * returned.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long endTime;

    /**
     * A valid CloudWatch Logs filter pattern to use for filtering the
     * response. If not provided, all the events are matched.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     */
    private String filterPattern;

    /**
     * A pagination token obtained from a <code
     * class="code">FilterLogEvents</code> response to continue paginating
     * the FilterLogEvents results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String nextToken;

    /**
     * The maximum number of events to return in a page of results. Default
     * is 10,000 events.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     */
    private Integer limit;

    /**
     * If provided, the API will make a best effort to provide responses that
     * contain events from multiple log streams within the log group
     * interleaved in a single response. If not provided, all the matched log
     * events in the first log stream will be searched first, then those in
     * the next log stream, etc.
     */
    private Boolean interleaved;

    /**
     * The name of the log group to query
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @return The name of the log group to query
     */
    public String getLogGroupName() {
        return logGroupName;
    }
    
    /**
     * The name of the log group to query
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroupName The name of the log group to query
     */
    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }
    
    /**
     * The name of the log group to query
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroupName The name of the log group to query
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public FilterLogEventsRequest withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * Optional list of log stream names within the specified log group to
     * search. Defaults to all the log streams in the log group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return Optional list of log stream names within the specified log group to
     *         search. Defaults to all the log streams in the log group.
     */
    public java.util.List<String> getLogStreamNames() {
        if (logStreamNames == null) {
              logStreamNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              logStreamNames.setAutoConstruct(true);
        }
        return logStreamNames;
    }
    
    /**
     * Optional list of log stream names within the specified log group to
     * search. Defaults to all the log streams in the log group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param logStreamNames Optional list of log stream names within the specified log group to
     *         search. Defaults to all the log streams in the log group.
     */
    public void setLogStreamNames(java.util.Collection<String> logStreamNames) {
        if (logStreamNames == null) {
            this.logStreamNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> logStreamNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(logStreamNames.size());
        logStreamNamesCopy.addAll(logStreamNames);
        this.logStreamNames = logStreamNamesCopy;
    }
    
    /**
     * Optional list of log stream names within the specified log group to
     * search. Defaults to all the log streams in the log group.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setLogStreamNames(java.util.Collection)} or {@link
     * #withLogStreamNames(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param logStreamNames Optional list of log stream names within the specified log group to
     *         search. Defaults to all the log streams in the log group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public FilterLogEventsRequest withLogStreamNames(String... logStreamNames) {
        if (getLogStreamNames() == null) setLogStreamNames(new java.util.ArrayList<String>(logStreamNames.length));
        for (String value : logStreamNames) {
            getLogStreamNames().add(value);
        }
        return this;
    }
    
    /**
     * Optional list of log stream names within the specified log group to
     * search. Defaults to all the log streams in the log group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param logStreamNames Optional list of log stream names within the specified log group to
     *         search. Defaults to all the log streams in the log group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public FilterLogEventsRequest withLogStreamNames(java.util.Collection<String> logStreamNames) {
        if (logStreamNames == null) {
            this.logStreamNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> logStreamNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(logStreamNames.size());
            logStreamNamesCopy.addAll(logStreamNames);
            this.logStreamNames = logStreamNamesCopy;
        }

        return this;
    }

    /**
     * A unix timestamp indicating the start time of the range for the
     * request. If provided, events with a timestamp prior to this time will
     * not be returned.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return A unix timestamp indicating the start time of the range for the
     *         request. If provided, events with a timestamp prior to this time will
     *         not be returned.
     */
    public Long getStartTime() {
        return startTime;
    }
    
    /**
     * A unix timestamp indicating the start time of the range for the
     * request. If provided, events with a timestamp prior to this time will
     * not be returned.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param startTime A unix timestamp indicating the start time of the range for the
     *         request. If provided, events with a timestamp prior to this time will
     *         not be returned.
     */
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }
    
    /**
     * A unix timestamp indicating the start time of the range for the
     * request. If provided, events with a timestamp prior to this time will
     * not be returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param startTime A unix timestamp indicating the start time of the range for the
     *         request. If provided, events with a timestamp prior to this time will
     *         not be returned.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public FilterLogEventsRequest withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * A unix timestamp indicating the end time of the range for the request.
     * If provided, events with a timestamp later than this time will not be
     * returned.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return A unix timestamp indicating the end time of the range for the request.
     *         If provided, events with a timestamp later than this time will not be
     *         returned.
     */
    public Long getEndTime() {
        return endTime;
    }
    
    /**
     * A unix timestamp indicating the end time of the range for the request.
     * If provided, events with a timestamp later than this time will not be
     * returned.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param endTime A unix timestamp indicating the end time of the range for the request.
     *         If provided, events with a timestamp later than this time will not be
     *         returned.
     */
    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }
    
    /**
     * A unix timestamp indicating the end time of the range for the request.
     * If provided, events with a timestamp later than this time will not be
     * returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param endTime A unix timestamp indicating the end time of the range for the request.
     *         If provided, events with a timestamp later than this time will not be
     *         returned.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public FilterLogEventsRequest withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * A valid CloudWatch Logs filter pattern to use for filtering the
     * response. If not provided, all the events are matched.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     *
     * @return A valid CloudWatch Logs filter pattern to use for filtering the
     *         response. If not provided, all the events are matched.
     */
    public String getFilterPattern() {
        return filterPattern;
    }
    
    /**
     * A valid CloudWatch Logs filter pattern to use for filtering the
     * response. If not provided, all the events are matched.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     *
     * @param filterPattern A valid CloudWatch Logs filter pattern to use for filtering the
     *         response. If not provided, all the events are matched.
     */
    public void setFilterPattern(String filterPattern) {
        this.filterPattern = filterPattern;
    }
    
    /**
     * A valid CloudWatch Logs filter pattern to use for filtering the
     * response. If not provided, all the events are matched.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     *
     * @param filterPattern A valid CloudWatch Logs filter pattern to use for filtering the
     *         response. If not provided, all the events are matched.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public FilterLogEventsRequest withFilterPattern(String filterPattern) {
        this.filterPattern = filterPattern;
        return this;
    }

    /**
     * A pagination token obtained from a <code
     * class="code">FilterLogEvents</code> response to continue paginating
     * the FilterLogEvents results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return A pagination token obtained from a <code
     *         class="code">FilterLogEvents</code> response to continue paginating
     *         the FilterLogEvents results.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * A pagination token obtained from a <code
     * class="code">FilterLogEvents</code> response to continue paginating
     * the FilterLogEvents results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken A pagination token obtained from a <code
     *         class="code">FilterLogEvents</code> response to continue paginating
     *         the FilterLogEvents results.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * A pagination token obtained from a <code
     * class="code">FilterLogEvents</code> response to continue paginating
     * the FilterLogEvents results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken A pagination token obtained from a <code
     *         class="code">FilterLogEvents</code> response to continue paginating
     *         the FilterLogEvents results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public FilterLogEventsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * The maximum number of events to return in a page of results. Default
     * is 10,000 events.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @return The maximum number of events to return in a page of results. Default
     *         is 10,000 events.
     */
    public Integer getLimit() {
        return limit;
    }
    
    /**
     * The maximum number of events to return in a page of results. Default
     * is 10,000 events.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param limit The maximum number of events to return in a page of results. Default
     *         is 10,000 events.
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
    /**
     * The maximum number of events to return in a page of results. Default
     * is 10,000 events.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param limit The maximum number of events to return in a page of results. Default
     *         is 10,000 events.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public FilterLogEventsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * If provided, the API will make a best effort to provide responses that
     * contain events from multiple log streams within the log group
     * interleaved in a single response. If not provided, all the matched log
     * events in the first log stream will be searched first, then those in
     * the next log stream, etc.
     *
     * @return If provided, the API will make a best effort to provide responses that
     *         contain events from multiple log streams within the log group
     *         interleaved in a single response. If not provided, all the matched log
     *         events in the first log stream will be searched first, then those in
     *         the next log stream, etc.
     */
    public Boolean isInterleaved() {
        return interleaved;
    }
    
    /**
     * If provided, the API will make a best effort to provide responses that
     * contain events from multiple log streams within the log group
     * interleaved in a single response. If not provided, all the matched log
     * events in the first log stream will be searched first, then those in
     * the next log stream, etc.
     *
     * @param interleaved If provided, the API will make a best effort to provide responses that
     *         contain events from multiple log streams within the log group
     *         interleaved in a single response. If not provided, all the matched log
     *         events in the first log stream will be searched first, then those in
     *         the next log stream, etc.
     */
    public void setInterleaved(Boolean interleaved) {
        this.interleaved = interleaved;
    }
    
    /**
     * If provided, the API will make a best effort to provide responses that
     * contain events from multiple log streams within the log group
     * interleaved in a single response. If not provided, all the matched log
     * events in the first log stream will be searched first, then those in
     * the next log stream, etc.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param interleaved If provided, the API will make a best effort to provide responses that
     *         contain events from multiple log streams within the log group
     *         interleaved in a single response. If not provided, all the matched log
     *         events in the first log stream will be searched first, then those in
     *         the next log stream, etc.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public FilterLogEventsRequest withInterleaved(Boolean interleaved) {
        this.interleaved = interleaved;
        return this;
    }

    /**
     * If provided, the API will make a best effort to provide responses that
     * contain events from multiple log streams within the log group
     * interleaved in a single response. If not provided, all the matched log
     * events in the first log stream will be searched first, then those in
     * the next log stream, etc.
     *
     * @return If provided, the API will make a best effort to provide responses that
     *         contain events from multiple log streams within the log group
     *         interleaved in a single response. If not provided, all the matched log
     *         events in the first log stream will be searched first, then those in
     *         the next log stream, etc.
     */
    public Boolean getInterleaved() {
        return interleaved;
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
        if (getLogGroupName() != null) sb.append("LogGroupName: " + getLogGroupName() + ",");
        if (getLogStreamNames() != null) sb.append("LogStreamNames: " + getLogStreamNames() + ",");
        if (getStartTime() != null) sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null) sb.append("EndTime: " + getEndTime() + ",");
        if (getFilterPattern() != null) sb.append("FilterPattern: " + getFilterPattern() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getLimit() != null) sb.append("Limit: " + getLimit() + ",");
        if (isInterleaved() != null) sb.append("Interleaved: " + isInterleaved() );
        sb.append("}");
        return sb.toString();
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
        hashCode = prime * hashCode + ((isInterleaved() == null) ? 0 : isInterleaved().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof FilterLogEventsRequest == false) return false;
        FilterLogEventsRequest other = (FilterLogEventsRequest)obj;
        
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null) return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false) return false; 
        if (other.getLogStreamNames() == null ^ this.getLogStreamNames() == null) return false;
        if (other.getLogStreamNames() != null && other.getLogStreamNames().equals(this.getLogStreamNames()) == false) return false; 
        if (other.getStartTime() == null ^ this.getStartTime() == null) return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false) return false; 
        if (other.getEndTime() == null ^ this.getEndTime() == null) return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false) return false; 
        if (other.getFilterPattern() == null ^ this.getFilterPattern() == null) return false;
        if (other.getFilterPattern() != null && other.getFilterPattern().equals(this.getFilterPattern()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getLimit() == null ^ this.getLimit() == null) return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false) return false; 
        if (other.isInterleaved() == null ^ this.isInterleaved() == null) return false;
        if (other.isInterleaved() != null && other.isInterleaved().equals(this.isInterleaved()) == false) return false; 
        return true;
    }
    
    @Override
    public FilterLogEventsRequest clone() {
        
            return (FilterLogEventsRequest) super.clone();
    }

}
    