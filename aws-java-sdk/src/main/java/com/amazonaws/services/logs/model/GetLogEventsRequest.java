/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.logs.AWSLogs#getLogEvents(GetLogEventsRequest) GetLogEvents operation}.
 * <p>
 * Retrieves log events from the specified log stream. You can provide
 * an optional time range to filter the results on the event
 * <code>timestamp</code> .
 * 
 * </p>
 * <p>
 * By default, this operation returns as much log events as can fit in a
 * response size of 1MB, up to 10,000 log events. The response will
 * always include a <code>nextForwardToken</code> and a
 * <code>nextBackwardToken</code> in the response body. You can use any
 * of these tokens in subsequent <code>GetLogEvents</code> requests to
 * paginate through events in either forward or backward direction. You
 * can also limit the number of log events returned in the response by
 * specifying the <code>limit</code> parameter in the request.
 * </p>
 *
 * @see com.amazonaws.services.logs.AWSLogs#getLogEvents(GetLogEventsRequest)
 */
public class GetLogEventsRequest extends AmazonWebServiceRequest implements Serializable {

    private String logGroupName;

    private String logStreamName;

    /**
     * A point in time expressed as the number milliseconds since Jan 1, 1970
     * 00:00:00 UTC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long startTime;

    /**
     * A point in time expressed as the number milliseconds since Jan 1, 1970
     * 00:00:00 UTC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long endTime;

    /**
     * A string token used for pagination that points to the next page of
     * results. It must be a value obtained from the <code
     * class="code">nextForwardToken</code> or <code
     * class="code">nextBackwardToken</code> fields in the response of the
     * previous <code class="code">GetLogEvents</code> request.
     */
    private String nextToken;

    /**
     * The maximum number of log events returned in the response. If you
     * don't specify a value, the request would return as much log events as
     * can fit in a response size of 1MB, up to 10,000 log events.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     */
    private Integer limit;

    /**
     * If set to true, the earliest log events would be returned first. The
     * default is false (the latest log events are returned first).
     */
    private Boolean startFromHead;

    /**
     * Default constructor for a new GetLogEventsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public GetLogEventsRequest() {}
    
    /**
     * Constructs a new GetLogEventsRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param logGroupName
     * @param logStreamName
     */
    public GetLogEventsRequest(String logGroupName, String logStreamName) {
        setLogGroupName(logGroupName);
        setLogStreamName(logStreamName);
    }

    /**
     * Returns the value of the LogGroupName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @return The value of the LogGroupName property for this object.
     */
    public String getLogGroupName() {
        return logGroupName;
    }
    
    /**
     * Sets the value of the LogGroupName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroupName The new value for the LogGroupName property for this object.
     */
    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }
    
    /**
     * Sets the value of the LogGroupName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroupName The new value for the LogGroupName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetLogEventsRequest withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * Returns the value of the LogStreamName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @return The value of the LogStreamName property for this object.
     */
    public String getLogStreamName() {
        return logStreamName;
    }
    
    /**
     * Sets the value of the LogStreamName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param logStreamName The new value for the LogStreamName property for this object.
     */
    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }
    
    /**
     * Sets the value of the LogStreamName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param logStreamName The new value for the LogStreamName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetLogEventsRequest withLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
        return this;
    }

    /**
     * A point in time expressed as the number milliseconds since Jan 1, 1970
     * 00:00:00 UTC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return A point in time expressed as the number milliseconds since Jan 1, 1970
     *         00:00:00 UTC.
     */
    public Long getStartTime() {
        return startTime;
    }
    
    /**
     * A point in time expressed as the number milliseconds since Jan 1, 1970
     * 00:00:00 UTC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param startTime A point in time expressed as the number milliseconds since Jan 1, 1970
     *         00:00:00 UTC.
     */
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }
    
    /**
     * A point in time expressed as the number milliseconds since Jan 1, 1970
     * 00:00:00 UTC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param startTime A point in time expressed as the number milliseconds since Jan 1, 1970
     *         00:00:00 UTC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetLogEventsRequest withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * A point in time expressed as the number milliseconds since Jan 1, 1970
     * 00:00:00 UTC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return A point in time expressed as the number milliseconds since Jan 1, 1970
     *         00:00:00 UTC.
     */
    public Long getEndTime() {
        return endTime;
    }
    
    /**
     * A point in time expressed as the number milliseconds since Jan 1, 1970
     * 00:00:00 UTC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param endTime A point in time expressed as the number milliseconds since Jan 1, 1970
     *         00:00:00 UTC.
     */
    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }
    
    /**
     * A point in time expressed as the number milliseconds since Jan 1, 1970
     * 00:00:00 UTC.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param endTime A point in time expressed as the number milliseconds since Jan 1, 1970
     *         00:00:00 UTC.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetLogEventsRequest withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * A string token used for pagination that points to the next page of
     * results. It must be a value obtained from the <code
     * class="code">nextForwardToken</code> or <code
     * class="code">nextBackwardToken</code> fields in the response of the
     * previous <code class="code">GetLogEvents</code> request.
     *
     * @return A string token used for pagination that points to the next page of
     *         results. It must be a value obtained from the <code
     *         class="code">nextForwardToken</code> or <code
     *         class="code">nextBackwardToken</code> fields in the response of the
     *         previous <code class="code">GetLogEvents</code> request.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * A string token used for pagination that points to the next page of
     * results. It must be a value obtained from the <code
     * class="code">nextForwardToken</code> or <code
     * class="code">nextBackwardToken</code> fields in the response of the
     * previous <code class="code">GetLogEvents</code> request.
     *
     * @param nextToken A string token used for pagination that points to the next page of
     *         results. It must be a value obtained from the <code
     *         class="code">nextForwardToken</code> or <code
     *         class="code">nextBackwardToken</code> fields in the response of the
     *         previous <code class="code">GetLogEvents</code> request.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * A string token used for pagination that points to the next page of
     * results. It must be a value obtained from the <code
     * class="code">nextForwardToken</code> or <code
     * class="code">nextBackwardToken</code> fields in the response of the
     * previous <code class="code">GetLogEvents</code> request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken A string token used for pagination that points to the next page of
     *         results. It must be a value obtained from the <code
     *         class="code">nextForwardToken</code> or <code
     *         class="code">nextBackwardToken</code> fields in the response of the
     *         previous <code class="code">GetLogEvents</code> request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetLogEventsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * The maximum number of log events returned in the response. If you
     * don't specify a value, the request would return as much log events as
     * can fit in a response size of 1MB, up to 10,000 log events.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @return The maximum number of log events returned in the response. If you
     *         don't specify a value, the request would return as much log events as
     *         can fit in a response size of 1MB, up to 10,000 log events.
     */
    public Integer getLimit() {
        return limit;
    }
    
    /**
     * The maximum number of log events returned in the response. If you
     * don't specify a value, the request would return as much log events as
     * can fit in a response size of 1MB, up to 10,000 log events.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param limit The maximum number of log events returned in the response. If you
     *         don't specify a value, the request would return as much log events as
     *         can fit in a response size of 1MB, up to 10,000 log events.
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
    /**
     * The maximum number of log events returned in the response. If you
     * don't specify a value, the request would return as much log events as
     * can fit in a response size of 1MB, up to 10,000 log events.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10000<br/>
     *
     * @param limit The maximum number of log events returned in the response. If you
     *         don't specify a value, the request would return as much log events as
     *         can fit in a response size of 1MB, up to 10,000 log events.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetLogEventsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * If set to true, the earliest log events would be returned first. The
     * default is false (the latest log events are returned first).
     *
     * @return If set to true, the earliest log events would be returned first. The
     *         default is false (the latest log events are returned first).
     */
    public Boolean isStartFromHead() {
        return startFromHead;
    }
    
    /**
     * If set to true, the earliest log events would be returned first. The
     * default is false (the latest log events are returned first).
     *
     * @param startFromHead If set to true, the earliest log events would be returned first. The
     *         default is false (the latest log events are returned first).
     */
    public void setStartFromHead(Boolean startFromHead) {
        this.startFromHead = startFromHead;
    }
    
    /**
     * If set to true, the earliest log events would be returned first. The
     * default is false (the latest log events are returned first).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startFromHead If set to true, the earliest log events would be returned first. The
     *         default is false (the latest log events are returned first).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetLogEventsRequest withStartFromHead(Boolean startFromHead) {
        this.startFromHead = startFromHead;
        return this;
    }

    /**
     * If set to true, the earliest log events would be returned first. The
     * default is false (the latest log events are returned first).
     *
     * @return If set to true, the earliest log events would be returned first. The
     *         default is false (the latest log events are returned first).
     */
    public Boolean getStartFromHead() {
        return startFromHead;
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
        if (getLogStreamName() != null) sb.append("LogStreamName: " + getLogStreamName() + ",");
        if (getStartTime() != null) sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null) sb.append("EndTime: " + getEndTime() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getLimit() != null) sb.append("Limit: " + getLimit() + ",");
        if (isStartFromHead() != null) sb.append("StartFromHead: " + isStartFromHead() );
        sb.append("}");
        return sb.toString();
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
        hashCode = prime * hashCode + ((isStartFromHead() == null) ? 0 : isStartFromHead().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetLogEventsRequest == false) return false;
        GetLogEventsRequest other = (GetLogEventsRequest)obj;
        
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null) return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false) return false; 
        if (other.getLogStreamName() == null ^ this.getLogStreamName() == null) return false;
        if (other.getLogStreamName() != null && other.getLogStreamName().equals(this.getLogStreamName()) == false) return false; 
        if (other.getStartTime() == null ^ this.getStartTime() == null) return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false) return false; 
        if (other.getEndTime() == null ^ this.getEndTime() == null) return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getLimit() == null ^ this.getLimit() == null) return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false) return false; 
        if (other.isStartFromHead() == null ^ this.isStartFromHead() == null) return false;
        if (other.isStartFromHead() != null && other.isStartFromHead().equals(this.isStartFromHead()) == false) return false; 
        return true;
    }
    
}
    