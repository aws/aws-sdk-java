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
     * The name of the log group.
     * </p>
     */
    private String logGroupName;
    /**
     * <p>
     * The prefix to match.
     * </p>
     * <p>
     * You cannot specify this parameter if <code>orderBy</code> is <code>LastEventTime</code>.
     * </p>
     */
    private String logStreamNamePrefix;
    /**
     * <p>
     * If the value is <code>LogStreamName</code>, the results are ordered by log stream name. If the value is
     * <code>LastEventTime</code>, the results are ordered by the event time. The default value is
     * <code>LogStreamName</code>.
     * </p>
     * <p>
     * If you order the results by event time, you cannot specify the <code>logStreamNamePrefix</code> parameter.
     * </p>
     */
    private String orderBy;
    /**
     * <p>
     * If the value is true, results are returned in descending order. If the value is to false, results are returned in
     * ascending order. The default value is false.
     * </p>
     */
    private Boolean descending;
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
     *        The name of the log group.
     */
    public DescribeLogStreamsRequest(String logGroupName) {
        setLogGroupName(logGroupName);
    }

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

    public DescribeLogStreamsRequest withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * <p>
     * The prefix to match.
     * </p>
     * <p>
     * You cannot specify this parameter if <code>orderBy</code> is <code>LastEventTime</code>.
     * </p>
     * 
     * @param logStreamNamePrefix
     *        The prefix to match.</p>
     *        <p>
     *        You cannot specify this parameter if <code>orderBy</code> is <code>LastEventTime</code>.
     */

    public void setLogStreamNamePrefix(String logStreamNamePrefix) {
        this.logStreamNamePrefix = logStreamNamePrefix;
    }

    /**
     * <p>
     * The prefix to match.
     * </p>
     * <p>
     * You cannot specify this parameter if <code>orderBy</code> is <code>LastEventTime</code>.
     * </p>
     * 
     * @return The prefix to match.</p>
     *         <p>
     *         You cannot specify this parameter if <code>orderBy</code> is <code>LastEventTime</code>.
     */

    public String getLogStreamNamePrefix() {
        return this.logStreamNamePrefix;
    }

    /**
     * <p>
     * The prefix to match.
     * </p>
     * <p>
     * You cannot specify this parameter if <code>orderBy</code> is <code>LastEventTime</code>.
     * </p>
     * 
     * @param logStreamNamePrefix
     *        The prefix to match.</p>
     *        <p>
     *        You cannot specify this parameter if <code>orderBy</code> is <code>LastEventTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLogStreamsRequest withLogStreamNamePrefix(String logStreamNamePrefix) {
        setLogStreamNamePrefix(logStreamNamePrefix);
        return this;
    }

    /**
     * <p>
     * If the value is <code>LogStreamName</code>, the results are ordered by log stream name. If the value is
     * <code>LastEventTime</code>, the results are ordered by the event time. The default value is
     * <code>LogStreamName</code>.
     * </p>
     * <p>
     * If you order the results by event time, you cannot specify the <code>logStreamNamePrefix</code> parameter.
     * </p>
     * 
     * @param orderBy
     *        If the value is <code>LogStreamName</code>, the results are ordered by log stream name. If the value is
     *        <code>LastEventTime</code>, the results are ordered by the event time. The default value is
     *        <code>LogStreamName</code>.</p>
     *        <p>
     *        If you order the results by event time, you cannot specify the <code>logStreamNamePrefix</code> parameter.
     * @see OrderBy
     */

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    /**
     * <p>
     * If the value is <code>LogStreamName</code>, the results are ordered by log stream name. If the value is
     * <code>LastEventTime</code>, the results are ordered by the event time. The default value is
     * <code>LogStreamName</code>.
     * </p>
     * <p>
     * If you order the results by event time, you cannot specify the <code>logStreamNamePrefix</code> parameter.
     * </p>
     * 
     * @return If the value is <code>LogStreamName</code>, the results are ordered by log stream name. If the value is
     *         <code>LastEventTime</code>, the results are ordered by the event time. The default value is
     *         <code>LogStreamName</code>.</p>
     *         <p>
     *         If you order the results by event time, you cannot specify the <code>logStreamNamePrefix</code>
     *         parameter.
     * @see OrderBy
     */

    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * <p>
     * If the value is <code>LogStreamName</code>, the results are ordered by log stream name. If the value is
     * <code>LastEventTime</code>, the results are ordered by the event time. The default value is
     * <code>LogStreamName</code>.
     * </p>
     * <p>
     * If you order the results by event time, you cannot specify the <code>logStreamNamePrefix</code> parameter.
     * </p>
     * 
     * @param orderBy
     *        If the value is <code>LogStreamName</code>, the results are ordered by log stream name. If the value is
     *        <code>LastEventTime</code>, the results are ordered by the event time. The default value is
     *        <code>LogStreamName</code>.</p>
     *        <p>
     *        If you order the results by event time, you cannot specify the <code>logStreamNamePrefix</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrderBy
     */

    public DescribeLogStreamsRequest withOrderBy(String orderBy) {
        setOrderBy(orderBy);
        return this;
    }

    /**
     * <p>
     * If the value is <code>LogStreamName</code>, the results are ordered by log stream name. If the value is
     * <code>LastEventTime</code>, the results are ordered by the event time. The default value is
     * <code>LogStreamName</code>.
     * </p>
     * <p>
     * If you order the results by event time, you cannot specify the <code>logStreamNamePrefix</code> parameter.
     * </p>
     * 
     * @param orderBy
     *        If the value is <code>LogStreamName</code>, the results are ordered by log stream name. If the value is
     *        <code>LastEventTime</code>, the results are ordered by the event time. The default value is
     *        <code>LogStreamName</code>.</p>
     *        <p>
     *        If you order the results by event time, you cannot specify the <code>logStreamNamePrefix</code> parameter.
     * @see OrderBy
     */

    public void setOrderBy(OrderBy orderBy) {
        this.orderBy = orderBy.toString();
    }

    /**
     * <p>
     * If the value is <code>LogStreamName</code>, the results are ordered by log stream name. If the value is
     * <code>LastEventTime</code>, the results are ordered by the event time. The default value is
     * <code>LogStreamName</code>.
     * </p>
     * <p>
     * If you order the results by event time, you cannot specify the <code>logStreamNamePrefix</code> parameter.
     * </p>
     * 
     * @param orderBy
     *        If the value is <code>LogStreamName</code>, the results are ordered by log stream name. If the value is
     *        <code>LastEventTime</code>, the results are ordered by the event time. The default value is
     *        <code>LogStreamName</code>.</p>
     *        <p>
     *        If you order the results by event time, you cannot specify the <code>logStreamNamePrefix</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrderBy
     */

    public DescribeLogStreamsRequest withOrderBy(OrderBy orderBy) {
        setOrderBy(orderBy);
        return this;
    }

    /**
     * <p>
     * If the value is true, results are returned in descending order. If the value is to false, results are returned in
     * ascending order. The default value is false.
     * </p>
     * 
     * @param descending
     *        If the value is true, results are returned in descending order. If the value is to false, results are
     *        returned in ascending order. The default value is false.
     */

    public void setDescending(Boolean descending) {
        this.descending = descending;
    }

    /**
     * <p>
     * If the value is true, results are returned in descending order. If the value is to false, results are returned in
     * ascending order. The default value is false.
     * </p>
     * 
     * @return If the value is true, results are returned in descending order. If the value is to false, results are
     *         returned in ascending order. The default value is false.
     */

    public Boolean getDescending() {
        return this.descending;
    }

    /**
     * <p>
     * If the value is true, results are returned in descending order. If the value is to false, results are returned in
     * ascending order. The default value is false.
     * </p>
     * 
     * @param descending
     *        If the value is true, results are returned in descending order. If the value is to false, results are
     *        returned in ascending order. The default value is false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeLogStreamsRequest withDescending(Boolean descending) {
        setDescending(descending);
        return this;
    }

    /**
     * <p>
     * If the value is true, results are returned in descending order. If the value is to false, results are returned in
     * ascending order. The default value is false.
     * </p>
     * 
     * @return If the value is true, results are returned in descending order. If the value is to false, results are
     *         returned in ascending order. The default value is false.
     */

    public Boolean isDescending() {
        return this.descending;
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

    public DescribeLogStreamsRequest withNextToken(String nextToken) {
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
