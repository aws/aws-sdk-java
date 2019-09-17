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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTagsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * You can filter the list using a <i>key</i>-<i>value</i> format. You can separate these items by using logical
     * operators. Allowed filters include <code>tagKey</code>, <code>tagValue</code>, and <code>configurationId</code>.
     * </p>
     */
    private java.util.List<TagFilter> filters;
    /**
     * <p>
     * The total number of items to return in a single page of output. The maximum value is 100.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * You can filter the list using a <i>key</i>-<i>value</i> format. You can separate these items by using logical
     * operators. Allowed filters include <code>tagKey</code>, <code>tagValue</code>, and <code>configurationId</code>.
     * </p>
     * 
     * @return You can filter the list using a <i>key</i>-<i>value</i> format. You can separate these items by using
     *         logical operators. Allowed filters include <code>tagKey</code>, <code>tagValue</code>, and
     *         <code>configurationId</code>.
     */

    public java.util.List<TagFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * You can filter the list using a <i>key</i>-<i>value</i> format. You can separate these items by using logical
     * operators. Allowed filters include <code>tagKey</code>, <code>tagValue</code>, and <code>configurationId</code>.
     * </p>
     * 
     * @param filters
     *        You can filter the list using a <i>key</i>-<i>value</i> format. You can separate these items by using
     *        logical operators. Allowed filters include <code>tagKey</code>, <code>tagValue</code>, and
     *        <code>configurationId</code>.
     */

    public void setFilters(java.util.Collection<TagFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<TagFilter>(filters);
    }

    /**
     * <p>
     * You can filter the list using a <i>key</i>-<i>value</i> format. You can separate these items by using logical
     * operators. Allowed filters include <code>tagKey</code>, <code>tagValue</code>, and <code>configurationId</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        You can filter the list using a <i>key</i>-<i>value</i> format. You can separate these items by using
     *        logical operators. Allowed filters include <code>tagKey</code>, <code>tagValue</code>, and
     *        <code>configurationId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTagsRequest withFilters(TagFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<TagFilter>(filters.length));
        }
        for (TagFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * You can filter the list using a <i>key</i>-<i>value</i> format. You can separate these items by using logical
     * operators. Allowed filters include <code>tagKey</code>, <code>tagValue</code>, and <code>configurationId</code>.
     * </p>
     * 
     * @param filters
     *        You can filter the list using a <i>key</i>-<i>value</i> format. You can separate these items by using
     *        logical operators. Allowed filters include <code>tagKey</code>, <code>tagValue</code>, and
     *        <code>configurationId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTagsRequest withFilters(java.util.Collection<TagFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The total number of items to return in a single page of output. The maximum value is 100.
     * </p>
     * 
     * @param maxResults
     *        The total number of items to return in a single page of output. The maximum value is 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The total number of items to return in a single page of output. The maximum value is 100.
     * </p>
     * 
     * @return The total number of items to return in a single page of output. The maximum value is 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The total number of items to return in a single page of output. The maximum value is 100.
     * </p>
     * 
     * @param maxResults
     *        The total number of items to return in a single page of output. The maximum value is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTagsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token to start the list. Use this token to get the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     * 
     * @return A token to start the list. Use this token to get the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token to start the list. Use this token to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTagsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
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
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTagsRequest clone() {
        return (DescribeTagsRequest) super.clone();
    }

}
