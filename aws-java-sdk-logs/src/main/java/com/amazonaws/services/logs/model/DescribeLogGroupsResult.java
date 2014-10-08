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
 * Describe Log Groups Result
 */
public class DescribeLogGroupsResult implements Serializable {

    /**
     * A list of log groups.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<LogGroup> logGroups;

    /**
     * A string token used for pagination that points to the next page of
     * results. It must be a value obtained from the response of the previous
     * request. The token expires after 24 hours.
     */
    private String nextToken;

    /**
     * A list of log groups.
     *
     * @return A list of log groups.
     */
    public java.util.List<LogGroup> getLogGroups() {
        if (logGroups == null) {
              logGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<LogGroup>();
              logGroups.setAutoConstruct(true);
        }
        return logGroups;
    }
    
    /**
     * A list of log groups.
     *
     * @param logGroups A list of log groups.
     */
    public void setLogGroups(java.util.Collection<LogGroup> logGroups) {
        if (logGroups == null) {
            this.logGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<LogGroup> logGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<LogGroup>(logGroups.size());
        logGroupsCopy.addAll(logGroups);
        this.logGroups = logGroupsCopy;
    }
    
    /**
     * A list of log groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param logGroups A list of log groups.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeLogGroupsResult withLogGroups(LogGroup... logGroups) {
        if (getLogGroups() == null) setLogGroups(new java.util.ArrayList<LogGroup>(logGroups.length));
        for (LogGroup value : logGroups) {
            getLogGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of log groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param logGroups A list of log groups.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeLogGroupsResult withLogGroups(java.util.Collection<LogGroup> logGroups) {
        if (logGroups == null) {
            this.logGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<LogGroup> logGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<LogGroup>(logGroups.size());
            logGroupsCopy.addAll(logGroups);
            this.logGroups = logGroupsCopy;
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
    public DescribeLogGroupsResult withNextToken(String nextToken) {
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
        if (getLogGroups() != null) sb.append("LogGroups: " + getLogGroups() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLogGroups() == null) ? 0 : getLogGroups().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeLogGroupsResult == false) return false;
        DescribeLogGroupsResult other = (DescribeLogGroupsResult)obj;
        
        if (other.getLogGroups() == null ^ this.getLogGroups() == null) return false;
        if (other.getLogGroups() != null && other.getLogGroups().equals(this.getLogGroups()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    