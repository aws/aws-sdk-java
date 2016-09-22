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
public class DescribeLogGroupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Will only return log groups that match the provided logGroupNamePrefix. If you don't specify a value, no prefix
     * filter is applied.
     * </p>
     */
    private String logGroupNamePrefix;
    /**
     * <p>
     * A string token used for pagination that points to the next page of results. It must be a value obtained from the
     * response of the previous <code>DescribeLogGroups</code> request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of items returned in the response. If you don't specify a value, the request would return up
     * to 50 items.
     * </p>
     */
    private Integer limit;

    /**
     * <p>
     * Will only return log groups that match the provided logGroupNamePrefix. If you don't specify a value, no prefix
     * filter is applied.
     * </p>
     * 
     * @param logGroupNamePrefix
     *        Will only return log groups that match the provided logGroupNamePrefix. If you don't specify a value, no
     *        prefix filter is applied.
     */

    public void setLogGroupNamePrefix(String logGroupNamePrefix) {
        this.logGroupNamePrefix = logGroupNamePrefix;
    }

    /**
     * <p>
     * Will only return log groups that match the provided logGroupNamePrefix. If you don't specify a value, no prefix
     * filter is applied.
     * </p>
     * 
     * @return Will only return log groups that match the provided logGroupNamePrefix. If you don't specify a value, no
     *         prefix filter is applied.
     */

    public String getLogGroupNamePrefix() {
        return this.logGroupNamePrefix;
    }

    /**
     * <p>
     * Will only return log groups that match the provided logGroupNamePrefix. If you don't specify a value, no prefix
     * filter is applied.
     * </p>
     * 
     * @param logGroupNamePrefix
     *        Will only return log groups that match the provided logGroupNamePrefix. If you don't specify a value, no
     *        prefix filter is applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLogGroupsRequest withLogGroupNamePrefix(String logGroupNamePrefix) {
        setLogGroupNamePrefix(logGroupNamePrefix);
        return this;
    }

    /**
     * <p>
     * A string token used for pagination that points to the next page of results. It must be a value obtained from the
     * response of the previous <code>DescribeLogGroups</code> request.
     * </p>
     * 
     * @param nextToken
     *        A string token used for pagination that points to the next page of results. It must be a value obtained
     *        from the response of the previous <code>DescribeLogGroups</code> request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A string token used for pagination that points to the next page of results. It must be a value obtained from the
     * response of the previous <code>DescribeLogGroups</code> request.
     * </p>
     * 
     * @return A string token used for pagination that points to the next page of results. It must be a value obtained
     *         from the response of the previous <code>DescribeLogGroups</code> request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A string token used for pagination that points to the next page of results. It must be a value obtained from the
     * response of the previous <code>DescribeLogGroups</code> request.
     * </p>
     * 
     * @param nextToken
     *        A string token used for pagination that points to the next page of results. It must be a value obtained
     *        from the response of the previous <code>DescribeLogGroups</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLogGroupsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items returned in the response. If you don't specify a value, the request would return up
     * to 50 items.
     * </p>
     * 
     * @param limit
     *        The maximum number of items returned in the response. If you don't specify a value, the request would
     *        return up to 50 items.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of items returned in the response. If you don't specify a value, the request would return up
     * to 50 items.
     * </p>
     * 
     * @return The maximum number of items returned in the response. If you don't specify a value, the request would
     *         return up to 50 items.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of items returned in the response. If you don't specify a value, the request would return up
     * to 50 items.
     * </p>
     * 
     * @param limit
     *        The maximum number of items returned in the response. If you don't specify a value, the request would
     *        return up to 50 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLogGroupsRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
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
        if (getLogGroupNamePrefix() != null)
            sb.append("LogGroupNamePrefix: " + getLogGroupNamePrefix() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getLimit() != null)
            sb.append("Limit: " + getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLogGroupsRequest == false)
            return false;
        DescribeLogGroupsRequest other = (DescribeLogGroupsRequest) obj;
        if (other.getLogGroupNamePrefix() == null ^ this.getLogGroupNamePrefix() == null)
            return false;
        if (other.getLogGroupNamePrefix() != null && other.getLogGroupNamePrefix().equals(this.getLogGroupNamePrefix()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLogGroupNamePrefix() == null) ? 0 : getLogGroupNamePrefix().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLogGroupsRequest clone() {
        return (DescribeLogGroupsRequest) super.clone();
    }
}
