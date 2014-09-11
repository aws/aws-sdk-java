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
 * Container for the parameters to the {@link com.amazonaws.services.logs.AWSLogs#describeLogStreams(DescribeLogStreamsRequest) DescribeLogStreams operation}.
 * <p>
 * Returns all the log streams that are associated with the specified
 * log group. The list returned in the response is ASCII-sorted by log
 * stream name.
 * </p>
 * <p>
 * By default, this operation returns up to 50 log streams. If there are
 * more log streams to list, the response would contain a
 * <code>nextToken</code> value in the response body. You can also limit
 * the number of log streams returned in the response by specifying the
 * <code>limit</code> parameter in the request.
 * </p>
 *
 * @see com.amazonaws.services.logs.AWSLogs#describeLogStreams(DescribeLogStreamsRequest)
 */
public class DescribeLogStreamsRequest extends AmazonWebServiceRequest implements Serializable {

    private String logGroupName;

    private String logStreamNamePrefix;

    /**
     * A string token used for pagination that points to the next page of
     * results. It must be a value obtained from the response of the previous
     * <code class="code">DescribeLogStreams</code> request.
     */
    private String nextToken;

    /**
     * The maximum number of items returned in the response. If you don't
     * specify a value, the request would return up to 50 items.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     */
    private Integer limit;

    /**
     * Default constructor for a new DescribeLogStreamsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DescribeLogStreamsRequest() {}
    
    /**
     * Constructs a new DescribeLogStreamsRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param logGroupName
     */
    public DescribeLogStreamsRequest(String logGroupName) {
        setLogGroupName(logGroupName);
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
    public DescribeLogStreamsRequest withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * Returns the value of the LogStreamNamePrefix property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @return The value of the LogStreamNamePrefix property for this object.
     */
    public String getLogStreamNamePrefix() {
        return logStreamNamePrefix;
    }
    
    /**
     * Sets the value of the LogStreamNamePrefix property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param logStreamNamePrefix The new value for the LogStreamNamePrefix property for this object.
     */
    public void setLogStreamNamePrefix(String logStreamNamePrefix) {
        this.logStreamNamePrefix = logStreamNamePrefix;
    }
    
    /**
     * Sets the value of the LogStreamNamePrefix property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param logStreamNamePrefix The new value for the LogStreamNamePrefix property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeLogStreamsRequest withLogStreamNamePrefix(String logStreamNamePrefix) {
        this.logStreamNamePrefix = logStreamNamePrefix;
        return this;
    }

    /**
     * A string token used for pagination that points to the next page of
     * results. It must be a value obtained from the response of the previous
     * <code class="code">DescribeLogStreams</code> request.
     *
     * @return A string token used for pagination that points to the next page of
     *         results. It must be a value obtained from the response of the previous
     *         <code class="code">DescribeLogStreams</code> request.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * A string token used for pagination that points to the next page of
     * results. It must be a value obtained from the response of the previous
     * <code class="code">DescribeLogStreams</code> request.
     *
     * @param nextToken A string token used for pagination that points to the next page of
     *         results. It must be a value obtained from the response of the previous
     *         <code class="code">DescribeLogStreams</code> request.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * A string token used for pagination that points to the next page of
     * results. It must be a value obtained from the response of the previous
     * <code class="code">DescribeLogStreams</code> request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken A string token used for pagination that points to the next page of
     *         results. It must be a value obtained from the response of the previous
     *         <code class="code">DescribeLogStreams</code> request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeLogStreamsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * The maximum number of items returned in the response. If you don't
     * specify a value, the request would return up to 50 items.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @return The maximum number of items returned in the response. If you don't
     *         specify a value, the request would return up to 50 items.
     */
    public Integer getLimit() {
        return limit;
    }
    
    /**
     * The maximum number of items returned in the response. If you don't
     * specify a value, the request would return up to 50 items.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param limit The maximum number of items returned in the response. If you don't
     *         specify a value, the request would return up to 50 items.
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
    /**
     * The maximum number of items returned in the response. If you don't
     * specify a value, the request would return up to 50 items.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param limit The maximum number of items returned in the response. If you don't
     *         specify a value, the request would return up to 50 items.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeLogStreamsRequest withLimit(Integer limit) {
        this.limit = limit;
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
        if (getLogGroupName() != null) sb.append("LogGroupName: " + getLogGroupName() + ",");
        if (getLogStreamNamePrefix() != null) sb.append("LogStreamNamePrefix: " + getLogStreamNamePrefix() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getLimit() != null) sb.append("Limit: " + getLimit() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getLogStreamNamePrefix() == null) ? 0 : getLogStreamNamePrefix().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeLogStreamsRequest == false) return false;
        DescribeLogStreamsRequest other = (DescribeLogStreamsRequest)obj;
        
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null) return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false) return false; 
        if (other.getLogStreamNamePrefix() == null ^ this.getLogStreamNamePrefix() == null) return false;
        if (other.getLogStreamNamePrefix() != null && other.getLogStreamNamePrefix().equals(this.getLogStreamNamePrefix()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getLimit() == null ^ this.getLimit() == null) return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false) return false; 
        return true;
    }
    
}
    