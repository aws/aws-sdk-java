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

/**
 * Describe Log Streams Result
 */
public class DescribeLogStreamsResult implements Serializable {

    /**
     * A list of log streams.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<LogStream> logStreams;

    /**
     * A string token used for pagination that points to the next page of
     * results. It must be a value obtained from the response of the previous
     * request. The token expires after 24 hours.
     */
    private String nextToken;

    /**
     * A list of log streams.
     *
     * @return A list of log streams.
     */
    public java.util.List<LogStream> getLogStreams() {
        if (logStreams == null) {
              logStreams = new com.amazonaws.internal.ListWithAutoConstructFlag<LogStream>();
              logStreams.setAutoConstruct(true);
        }
        return logStreams;
    }
    
    /**
     * A list of log streams.
     *
     * @param logStreams A list of log streams.
     */
    public void setLogStreams(java.util.Collection<LogStream> logStreams) {
        if (logStreams == null) {
            this.logStreams = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<LogStream> logStreamsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<LogStream>(logStreams.size());
        logStreamsCopy.addAll(logStreams);
        this.logStreams = logStreamsCopy;
    }
    
    /**
     * A list of log streams.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param logStreams A list of log streams.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeLogStreamsResult withLogStreams(LogStream... logStreams) {
        if (getLogStreams() == null) setLogStreams(new java.util.ArrayList<LogStream>(logStreams.length));
        for (LogStream value : logStreams) {
            getLogStreams().add(value);
        }
        return this;
    }
    
    /**
     * A list of log streams.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param logStreams A list of log streams.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeLogStreamsResult withLogStreams(java.util.Collection<LogStream> logStreams) {
        if (logStreams == null) {
            this.logStreams = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<LogStream> logStreamsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<LogStream>(logStreams.size());
            logStreamsCopy.addAll(logStreams);
            this.logStreams = logStreamsCopy;
        }

        return this;
    }

    /**
     * A string token used for pagination that points to the next page of
     * results. It must be a value obtained from the response of the previous
     * request. The token expires after 24 hours.
     *
     * @return A string token used for pagination that points to the next page of
     *         results. It must be a value obtained from the response of the previous
     *         request. The token expires after 24 hours.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * A string token used for pagination that points to the next page of
     * results. It must be a value obtained from the response of the previous
     * request. The token expires after 24 hours.
     *
     * @param nextToken A string token used for pagination that points to the next page of
     *         results. It must be a value obtained from the response of the previous
     *         request. The token expires after 24 hours.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * A string token used for pagination that points to the next page of
     * results. It must be a value obtained from the response of the previous
     * request. The token expires after 24 hours.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken A string token used for pagination that points to the next page of
     *         results. It must be a value obtained from the response of the previous
     *         request. The token expires after 24 hours.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeLogStreamsResult withNextToken(String nextToken) {
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
        if (getLogStreams() != null) sb.append("LogStreams: " + getLogStreams() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLogStreams() == null) ? 0 : getLogStreams().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeLogStreamsResult == false) return false;
        DescribeLogStreamsResult other = (DescribeLogStreamsResult)obj;
        
        if (other.getLogStreams() == null ^ this.getLogStreams() == null) return false;
        if (other.getLogStreams() != null && other.getLogStreams().equals(this.getLogStreams()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    