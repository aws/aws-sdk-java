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
public class DescribeSubscriptionFiltersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The log group name for which subscription filters are to be listed.
     * </p>
     */
    private String logGroupName;
    /**
     * <p>
     * Will only return subscription filters that match the provided filterNamePrefix. If you don't specify a value, no
     * prefix filter is applied.
     * </p>
     */
    private String filterNamePrefix;

    private String nextToken;

    private Integer limit;

    /**
     * <p>
     * The log group name for which subscription filters are to be listed.
     * </p>
     * 
     * @param logGroupName
     *        The log group name for which subscription filters are to be listed.
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The log group name for which subscription filters are to be listed.
     * </p>
     * 
     * @return The log group name for which subscription filters are to be listed.
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * The log group name for which subscription filters are to be listed.
     * </p>
     * 
     * @param logGroupName
     *        The log group name for which subscription filters are to be listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSubscriptionFiltersRequest withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * <p>
     * Will only return subscription filters that match the provided filterNamePrefix. If you don't specify a value, no
     * prefix filter is applied.
     * </p>
     * 
     * @param filterNamePrefix
     *        Will only return subscription filters that match the provided filterNamePrefix. If you don't specify a
     *        value, no prefix filter is applied.
     */

    public void setFilterNamePrefix(String filterNamePrefix) {
        this.filterNamePrefix = filterNamePrefix;
    }

    /**
     * <p>
     * Will only return subscription filters that match the provided filterNamePrefix. If you don't specify a value, no
     * prefix filter is applied.
     * </p>
     * 
     * @return Will only return subscription filters that match the provided filterNamePrefix. If you don't specify a
     *         value, no prefix filter is applied.
     */

    public String getFilterNamePrefix() {
        return this.filterNamePrefix;
    }

    /**
     * <p>
     * Will only return subscription filters that match the provided filterNamePrefix. If you don't specify a value, no
     * prefix filter is applied.
     * </p>
     * 
     * @param filterNamePrefix
     *        Will only return subscription filters that match the provided filterNamePrefix. If you don't specify a
     *        value, no prefix filter is applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSubscriptionFiltersRequest withFilterNamePrefix(String filterNamePrefix) {
        setFilterNamePrefix(filterNamePrefix);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSubscriptionFiltersRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * @param limit
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * @return
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @param limit
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSubscriptionFiltersRequest withLimit(Integer limit) {
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
        if (getLogGroupName() != null)
            sb.append("LogGroupName: " + getLogGroupName() + ",");
        if (getFilterNamePrefix() != null)
            sb.append("FilterNamePrefix: " + getFilterNamePrefix() + ",");
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

        if (obj instanceof DescribeSubscriptionFiltersRequest == false)
            return false;
        DescribeSubscriptionFiltersRequest other = (DescribeSubscriptionFiltersRequest) obj;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getFilterNamePrefix() == null ^ this.getFilterNamePrefix() == null)
            return false;
        if (other.getFilterNamePrefix() != null && other.getFilterNamePrefix().equals(this.getFilterNamePrefix()) == false)
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

        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode());
        hashCode = prime * hashCode + ((getFilterNamePrefix() == null) ? 0 : getFilterNamePrefix().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSubscriptionFiltersRequest clone() {
        return (DescribeSubscriptionFiltersRequest) super.clone();
    }
}
