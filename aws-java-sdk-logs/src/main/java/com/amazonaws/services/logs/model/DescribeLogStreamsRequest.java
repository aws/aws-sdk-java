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
public class DescribeLogStreamsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The log group name for which log streams are to be listed.
     * </p>
     */
    private String logGroupName;
    /**
     * <p>
     * Will only return log streams that match the provided logStreamNamePrefix. If you don't specify a value, no prefix
     * filter is applied.
     * </p>
     */
    private String logStreamNamePrefix;
    /**
     * <p>
     * Specifies what to order the returned log streams by. Valid arguments are 'LogStreamName' or 'LastEventTime'. If
     * you don't specify a value, results are ordered by LogStreamName. If 'LastEventTime' is chosen, the request cannot
     * also contain a logStreamNamePrefix.
     * </p>
     */
    private String orderBy;
    /**
     * <p>
     * If set to true, results are returned in descending order. If you don't specify a value or set it to false,
     * results are returned in ascending order.
     * </p>
     */
    private Boolean descending;
    /**
     * <p>
     * A string token used for pagination that points to the next page of results. It must be a value obtained from the
     * response of the previous <code>DescribeLogStreams</code> request.
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
     * Default constructor for DescribeLogStreamsRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public DescribeLogStreamsRequest() {
    }

    /**
     * Constructs a new DescribeLogStreamsRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param logGroupName
     *        The log group name for which log streams are to be listed.
     */
    public DescribeLogStreamsRequest(String logGroupName) {
        setLogGroupName(logGroupName);
    }

    /**
     * <p>
     * The log group name for which log streams are to be listed.
     * </p>
     * 
     * @param logGroupName
     *        The log group name for which log streams are to be listed.
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The log group name for which log streams are to be listed.
     * </p>
     * 
     * @return The log group name for which log streams are to be listed.
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * The log group name for which log streams are to be listed.
     * </p>
     * 
     * @param logGroupName
     *        The log group name for which log streams are to be listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLogStreamsRequest withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * <p>
     * Will only return log streams that match the provided logStreamNamePrefix. If you don't specify a value, no prefix
     * filter is applied.
     * </p>
     * 
     * @param logStreamNamePrefix
     *        Will only return log streams that match the provided logStreamNamePrefix. If you don't specify a value, no
     *        prefix filter is applied.
     */

    public void setLogStreamNamePrefix(String logStreamNamePrefix) {
        this.logStreamNamePrefix = logStreamNamePrefix;
    }

    /**
     * <p>
     * Will only return log streams that match the provided logStreamNamePrefix. If you don't specify a value, no prefix
     * filter is applied.
     * </p>
     * 
     * @return Will only return log streams that match the provided logStreamNamePrefix. If you don't specify a value,
     *         no prefix filter is applied.
     */

    public String getLogStreamNamePrefix() {
        return this.logStreamNamePrefix;
    }

    /**
     * <p>
     * Will only return log streams that match the provided logStreamNamePrefix. If you don't specify a value, no prefix
     * filter is applied.
     * </p>
     * 
     * @param logStreamNamePrefix
     *        Will only return log streams that match the provided logStreamNamePrefix. If you don't specify a value, no
     *        prefix filter is applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLogStreamsRequest withLogStreamNamePrefix(String logStreamNamePrefix) {
        setLogStreamNamePrefix(logStreamNamePrefix);
        return this;
    }

    /**
     * <p>
     * Specifies what to order the returned log streams by. Valid arguments are 'LogStreamName' or 'LastEventTime'. If
     * you don't specify a value, results are ordered by LogStreamName. If 'LastEventTime' is chosen, the request cannot
     * also contain a logStreamNamePrefix.
     * </p>
     * 
     * @param orderBy
     *        Specifies what to order the returned log streams by. Valid arguments are 'LogStreamName' or
     *        'LastEventTime'. If you don't specify a value, results are ordered by LogStreamName. If 'LastEventTime' is
     *        chosen, the request cannot also contain a logStreamNamePrefix.
     * @see OrderBy
     */

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    /**
     * <p>
     * Specifies what to order the returned log streams by. Valid arguments are 'LogStreamName' or 'LastEventTime'. If
     * you don't specify a value, results are ordered by LogStreamName. If 'LastEventTime' is chosen, the request cannot
     * also contain a logStreamNamePrefix.
     * </p>
     * 
     * @return Specifies what to order the returned log streams by. Valid arguments are 'LogStreamName' or
     *         'LastEventTime'. If you don't specify a value, results are ordered by LogStreamName. If 'LastEventTime'
     *         is chosen, the request cannot also contain a logStreamNamePrefix.
     * @see OrderBy
     */

    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * <p>
     * Specifies what to order the returned log streams by. Valid arguments are 'LogStreamName' or 'LastEventTime'. If
     * you don't specify a value, results are ordered by LogStreamName. If 'LastEventTime' is chosen, the request cannot
     * also contain a logStreamNamePrefix.
     * </p>
     * 
     * @param orderBy
     *        Specifies what to order the returned log streams by. Valid arguments are 'LogStreamName' or
     *        'LastEventTime'. If you don't specify a value, results are ordered by LogStreamName. If 'LastEventTime' is
     *        chosen, the request cannot also contain a logStreamNamePrefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrderBy
     */

    public DescribeLogStreamsRequest withOrderBy(String orderBy) {
        setOrderBy(orderBy);
        return this;
    }

    /**
     * <p>
     * Specifies what to order the returned log streams by. Valid arguments are 'LogStreamName' or 'LastEventTime'. If
     * you don't specify a value, results are ordered by LogStreamName. If 'LastEventTime' is chosen, the request cannot
     * also contain a logStreamNamePrefix.
     * </p>
     * 
     * @param orderBy
     *        Specifies what to order the returned log streams by. Valid arguments are 'LogStreamName' or
     *        'LastEventTime'. If you don't specify a value, results are ordered by LogStreamName. If 'LastEventTime' is
     *        chosen, the request cannot also contain a logStreamNamePrefix.
     * @see OrderBy
     */

    public void setOrderBy(OrderBy orderBy) {
        this.orderBy = orderBy.toString();
    }

    /**
     * <p>
     * Specifies what to order the returned log streams by. Valid arguments are 'LogStreamName' or 'LastEventTime'. If
     * you don't specify a value, results are ordered by LogStreamName. If 'LastEventTime' is chosen, the request cannot
     * also contain a logStreamNamePrefix.
     * </p>
     * 
     * @param orderBy
     *        Specifies what to order the returned log streams by. Valid arguments are 'LogStreamName' or
     *        'LastEventTime'. If you don't specify a value, results are ordered by LogStreamName. If 'LastEventTime' is
     *        chosen, the request cannot also contain a logStreamNamePrefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrderBy
     */

    public DescribeLogStreamsRequest withOrderBy(OrderBy orderBy) {
        setOrderBy(orderBy);
        return this;
    }

    /**
     * <p>
     * If set to true, results are returned in descending order. If you don't specify a value or set it to false,
     * results are returned in ascending order.
     * </p>
     * 
     * @param descending
     *        If set to true, results are returned in descending order. If you don't specify a value or set it to false,
     *        results are returned in ascending order.
     */

    public void setDescending(Boolean descending) {
        this.descending = descending;
    }

    /**
     * <p>
     * If set to true, results are returned in descending order. If you don't specify a value or set it to false,
     * results are returned in ascending order.
     * </p>
     * 
     * @return If set to true, results are returned in descending order. If you don't specify a value or set it to
     *         false, results are returned in ascending order.
     */

    public Boolean getDescending() {
        return this.descending;
    }

    /**
     * <p>
     * If set to true, results are returned in descending order. If you don't specify a value or set it to false,
     * results are returned in ascending order.
     * </p>
     * 
     * @param descending
     *        If set to true, results are returned in descending order. If you don't specify a value or set it to false,
     *        results are returned in ascending order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLogStreamsRequest withDescending(Boolean descending) {
        setDescending(descending);
        return this;
    }

    /**
     * <p>
     * If set to true, results are returned in descending order. If you don't specify a value or set it to false,
     * results are returned in ascending order.
     * </p>
     * 
     * @return If set to true, results are returned in descending order. If you don't specify a value or set it to
     *         false, results are returned in ascending order.
     */

    public Boolean isDescending() {
        return this.descending;
    }

    /**
     * <p>
     * A string token used for pagination that points to the next page of results. It must be a value obtained from the
     * response of the previous <code>DescribeLogStreams</code> request.
     * </p>
     * 
     * @param nextToken
     *        A string token used for pagination that points to the next page of results. It must be a value obtained
     *        from the response of the previous <code>DescribeLogStreams</code> request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A string token used for pagination that points to the next page of results. It must be a value obtained from the
     * response of the previous <code>DescribeLogStreams</code> request.
     * </p>
     * 
     * @return A string token used for pagination that points to the next page of results. It must be a value obtained
     *         from the response of the previous <code>DescribeLogStreams</code> request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A string token used for pagination that points to the next page of results. It must be a value obtained from the
     * response of the previous <code>DescribeLogStreams</code> request.
     * </p>
     * 
     * @param nextToken
     *        A string token used for pagination that points to the next page of results. It must be a value obtained
     *        from the response of the previous <code>DescribeLogStreams</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLogStreamsRequest withNextToken(String nextToken) {
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

    public DescribeLogStreamsRequest withLimit(Integer limit) {
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
        if (getLogStreamNamePrefix() != null)
            sb.append("LogStreamNamePrefix: " + getLogStreamNamePrefix() + ",");
        if (getOrderBy() != null)
            sb.append("OrderBy: " + getOrderBy() + ",");
        if (getDescending() != null)
            sb.append("Descending: " + getDescending() + ",");
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

        if (obj instanceof DescribeLogStreamsRequest == false)
            return false;
        DescribeLogStreamsRequest other = (DescribeLogStreamsRequest) obj;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getLogStreamNamePrefix() == null ^ this.getLogStreamNamePrefix() == null)
            return false;
        if (other.getLogStreamNamePrefix() != null && other.getLogStreamNamePrefix().equals(this.getLogStreamNamePrefix()) == false)
            return false;
        if (other.getOrderBy() == null ^ this.getOrderBy() == null)
            return false;
        if (other.getOrderBy() != null && other.getOrderBy().equals(this.getOrderBy()) == false)
            return false;
        if (other.getDescending() == null ^ this.getDescending() == null)
            return false;
        if (other.getDescending() != null && other.getDescending().equals(this.getDescending()) == false)
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
        hashCode = prime * hashCode + ((getLogStreamNamePrefix() == null) ? 0 : getLogStreamNamePrefix().hashCode());
        hashCode = prime * hashCode + ((getOrderBy() == null) ? 0 : getOrderBy().hashCode());
        hashCode = prime * hashCode + ((getDescending() == null) ? 0 : getDescending().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public DescribeLogStreamsRequest clone() {
        return (DescribeLogStreamsRequest) super.clone();
    }
}
