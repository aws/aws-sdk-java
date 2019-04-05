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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeTags" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTagsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * One or more filters to scope the tags to return. The maximum number of filters per filter type (for example,
     * <code>auto-scaling-group</code>) is 1000.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of items to return with this call. The default value is <code>50</code> and the maximum value
     * is <code>100</code>.
     * </p>
     */
    private Integer maxRecords;

    /**
     * <p>
     * One or more filters to scope the tags to return. The maximum number of filters per filter type (for example,
     * <code>auto-scaling-group</code>) is 1000.
     * </p>
     * 
     * @return One or more filters to scope the tags to return. The maximum number of filters per filter type (for
     *         example, <code>auto-scaling-group</code>) is 1000.
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * One or more filters to scope the tags to return. The maximum number of filters per filter type (for example,
     * <code>auto-scaling-group</code>) is 1000.
     * </p>
     * 
     * @param filters
     *        One or more filters to scope the tags to return. The maximum number of filters per filter type (for
     *        example, <code>auto-scaling-group</code>) is 1000.
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(filters);
    }

    /**
     * <p>
     * One or more filters to scope the tags to return. The maximum number of filters per filter type (for example,
     * <code>auto-scaling-group</code>) is 1000.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        One or more filters to scope the tags to return. The maximum number of filters per filter type (for
     *        example, <code>auto-scaling-group</code>) is 1000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTagsRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more filters to scope the tags to return. The maximum number of filters per filter type (for example,
     * <code>auto-scaling-group</code>) is 1000.
     * </p>
     * 
     * @param filters
     *        One or more filters to scope the tags to return. The maximum number of filters per filter type (for
     *        example, <code>auto-scaling-group</code>) is 1000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTagsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
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

    public DescribeTagsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return with this call. The default value is <code>50</code> and the maximum value
     * is <code>100</code>.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of items to return with this call. The default value is <code>50</code> and the maximum
     *        value is <code>100</code>.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of items to return with this call. The default value is <code>50</code> and the maximum value
     * is <code>100</code>.
     * </p>
     * 
     * @return The maximum number of items to return with this call. The default value is <code>50</code> and the
     *         maximum value is <code>100</code>.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of items to return with this call. The default value is <code>50</code> and the maximum value
     * is <code>100</code>.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of items to return with this call. The default value is <code>50</code> and the maximum
     *        value is <code>100</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTagsRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: ").append(getMaxRecords());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTagsRequest == false)
            return false;
        DescribeTagsRequest other = (DescribeTagsRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTagsRequest clone() {
        return (DescribeTagsRequest) super.clone();
    }

}
