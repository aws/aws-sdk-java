/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for request parameters to <code> <a>DescribePackage</a> </code> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePackagesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Only returns packages that match the <code>DescribePackagesFilterList</code> values.
     * </p>
     */
    private java.util.List<DescribePackagesFilter> filters;
    /**
     * <p>
     * Limits results to a maximum number of packages.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Used for pagination. Only necessary if a previous API call includes a non-null NextToken value. If provided,
     * returns results for the next page.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Only returns packages that match the <code>DescribePackagesFilterList</code> values.
     * </p>
     * 
     * @return Only returns packages that match the <code>DescribePackagesFilterList</code> values.
     */

    public java.util.List<DescribePackagesFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * Only returns packages that match the <code>DescribePackagesFilterList</code> values.
     * </p>
     * 
     * @param filters
     *        Only returns packages that match the <code>DescribePackagesFilterList</code> values.
     */

    public void setFilters(java.util.Collection<DescribePackagesFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<DescribePackagesFilter>(filters);
    }

    /**
     * <p>
     * Only returns packages that match the <code>DescribePackagesFilterList</code> values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        Only returns packages that match the <code>DescribePackagesFilterList</code> values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePackagesRequest withFilters(DescribePackagesFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<DescribePackagesFilter>(filters.length));
        }
        for (DescribePackagesFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Only returns packages that match the <code>DescribePackagesFilterList</code> values.
     * </p>
     * 
     * @param filters
     *        Only returns packages that match the <code>DescribePackagesFilterList</code> values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePackagesRequest withFilters(java.util.Collection<DescribePackagesFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * Limits results to a maximum number of packages.
     * </p>
     * 
     * @param maxResults
     *        Limits results to a maximum number of packages.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Limits results to a maximum number of packages.
     * </p>
     * 
     * @return Limits results to a maximum number of packages.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Limits results to a maximum number of packages.
     * </p>
     * 
     * @param maxResults
     *        Limits results to a maximum number of packages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePackagesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Used for pagination. Only necessary if a previous API call includes a non-null NextToken value. If provided,
     * returns results for the next page.
     * </p>
     * 
     * @param nextToken
     *        Used for pagination. Only necessary if a previous API call includes a non-null NextToken value. If
     *        provided, returns results for the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Used for pagination. Only necessary if a previous API call includes a non-null NextToken value. If provided,
     * returns results for the next page.
     * </p>
     * 
     * @return Used for pagination. Only necessary if a previous API call includes a non-null NextToken value. If
     *         provided, returns results for the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Used for pagination. Only necessary if a previous API call includes a non-null NextToken value. If provided,
     * returns results for the next page.
     * </p>
     * 
     * @param nextToken
     *        Used for pagination. Only necessary if a previous API call includes a non-null NextToken value. If
     *        provided, returns results for the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePackagesRequest withNextToken(String nextToken) {
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

        if (obj instanceof DescribePackagesRequest == false)
            return false;
        DescribePackagesRequest other = (DescribePackagesRequest) obj;
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
    public DescribePackagesRequest clone() {
        return (DescribePackagesRequest) super.clone();
    }

}
