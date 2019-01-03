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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/DescribeSubscriptionFilters" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSubscriptionFiltersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the log group.
     * </p>
     */
    private String logGroupName;
    /**
     * <p>
     * The prefix to match. If you don't specify a value, no prefix filter is applied.
     * </p>
     */
    private String filterNamePrefix;
    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
     * </p>
     */
    private Integer limit;

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

    public DescribeSubscriptionFiltersRequest withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * <p>
     * The prefix to match. If you don't specify a value, no prefix filter is applied.
     * </p>
     * 
     * @param filterNamePrefix
     *        The prefix to match. If you don't specify a value, no prefix filter is applied.
     */

    public void setFilterNamePrefix(String filterNamePrefix) {
        this.filterNamePrefix = filterNamePrefix;
    }

    /**
     * <p>
     * The prefix to match. If you don't specify a value, no prefix filter is applied.
     * </p>
     * 
     * @return The prefix to match. If you don't specify a value, no prefix filter is applied.
     */

    public String getFilterNamePrefix() {
        return this.filterNamePrefix;
    }

    /**
     * <p>
     * The prefix to match. If you don't specify a value, no prefix filter is applied.
     * </p>
     * 
     * @param filterNamePrefix
     *        The prefix to match. If you don't specify a value, no prefix filter is applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSubscriptionFiltersRequest withFilterNamePrefix(String filterNamePrefix) {
        setFilterNamePrefix(filterNamePrefix);
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

    public DescribeSubscriptionFiltersRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
     * </p>
     * 
     * @param limit
     *        The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
     * </p>
     * 
     * @return The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
     * </p>
     * 
     * @param limit
     *        The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSubscriptionFiltersRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
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
        if (getFilterNamePrefix() != null)
            sb.append("FilterNamePrefix: ").append(getFilterNamePrefix()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit());
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
