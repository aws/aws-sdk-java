/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListResolverDnssecConfigs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResolverDnssecConfigsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * <i>Optional</i>: An integer that specifies the maximum number of DNSSEC configuration results that you want
     * Amazon Route 53 to return. If you don't specify a value for <code>MaxResults</code>, Route 53 returns up to 100
     * configuration per page.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * (Optional) If the current AWS account has more than <code>MaxResults</code> DNSSEC configurations, use
     * <code>NextToken</code> to get the second and subsequent pages of results.
     * </p>
     * <p>
     * For the first <code>ListResolverDnssecConfigs</code> request, omit this value.
     * </p>
     * <p>
     * For the second and subsequent requests, get the value of <code>NextToken</code> from the previous response and
     * specify that value for <code>NextToken</code> in the request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * An optional specification to return a subset of objects.
     * </p>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * <i>Optional</i>: An integer that specifies the maximum number of DNSSEC configuration results that you want
     * Amazon Route 53 to return. If you don't specify a value for <code>MaxResults</code>, Route 53 returns up to 100
     * configuration per page.
     * </p>
     * 
     * @param maxResults
     *        <i>Optional</i>: An integer that specifies the maximum number of DNSSEC configuration results that you
     *        want Amazon Route 53 to return. If you don't specify a value for <code>MaxResults</code>, Route 53 returns
     *        up to 100 configuration per page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * <i>Optional</i>: An integer that specifies the maximum number of DNSSEC configuration results that you want
     * Amazon Route 53 to return. If you don't specify a value for <code>MaxResults</code>, Route 53 returns up to 100
     * configuration per page.
     * </p>
     * 
     * @return <i>Optional</i>: An integer that specifies the maximum number of DNSSEC configuration results that you
     *         want Amazon Route 53 to return. If you don't specify a value for <code>MaxResults</code>, Route 53
     *         returns up to 100 configuration per page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * <i>Optional</i>: An integer that specifies the maximum number of DNSSEC configuration results that you want
     * Amazon Route 53 to return. If you don't specify a value for <code>MaxResults</code>, Route 53 returns up to 100
     * configuration per page.
     * </p>
     * 
     * @param maxResults
     *        <i>Optional</i>: An integer that specifies the maximum number of DNSSEC configuration results that you
     *        want Amazon Route 53 to return. If you don't specify a value for <code>MaxResults</code>, Route 53 returns
     *        up to 100 configuration per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverDnssecConfigsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * (Optional) If the current AWS account has more than <code>MaxResults</code> DNSSEC configurations, use
     * <code>NextToken</code> to get the second and subsequent pages of results.
     * </p>
     * <p>
     * For the first <code>ListResolverDnssecConfigs</code> request, omit this value.
     * </p>
     * <p>
     * For the second and subsequent requests, get the value of <code>NextToken</code> from the previous response and
     * specify that value for <code>NextToken</code> in the request.
     * </p>
     * 
     * @param nextToken
     *        (Optional) If the current AWS account has more than <code>MaxResults</code> DNSSEC configurations, use
     *        <code>NextToken</code> to get the second and subsequent pages of results.</p>
     *        <p>
     *        For the first <code>ListResolverDnssecConfigs</code> request, omit this value.
     *        </p>
     *        <p>
     *        For the second and subsequent requests, get the value of <code>NextToken</code> from the previous response
     *        and specify that value for <code>NextToken</code> in the request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * (Optional) If the current AWS account has more than <code>MaxResults</code> DNSSEC configurations, use
     * <code>NextToken</code> to get the second and subsequent pages of results.
     * </p>
     * <p>
     * For the first <code>ListResolverDnssecConfigs</code> request, omit this value.
     * </p>
     * <p>
     * For the second and subsequent requests, get the value of <code>NextToken</code> from the previous response and
     * specify that value for <code>NextToken</code> in the request.
     * </p>
     * 
     * @return (Optional) If the current AWS account has more than <code>MaxResults</code> DNSSEC configurations, use
     *         <code>NextToken</code> to get the second and subsequent pages of results.</p>
     *         <p>
     *         For the first <code>ListResolverDnssecConfigs</code> request, omit this value.
     *         </p>
     *         <p>
     *         For the second and subsequent requests, get the value of <code>NextToken</code> from the previous
     *         response and specify that value for <code>NextToken</code> in the request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * (Optional) If the current AWS account has more than <code>MaxResults</code> DNSSEC configurations, use
     * <code>NextToken</code> to get the second and subsequent pages of results.
     * </p>
     * <p>
     * For the first <code>ListResolverDnssecConfigs</code> request, omit this value.
     * </p>
     * <p>
     * For the second and subsequent requests, get the value of <code>NextToken</code> from the previous response and
     * specify that value for <code>NextToken</code> in the request.
     * </p>
     * 
     * @param nextToken
     *        (Optional) If the current AWS account has more than <code>MaxResults</code> DNSSEC configurations, use
     *        <code>NextToken</code> to get the second and subsequent pages of results.</p>
     *        <p>
     *        For the first <code>ListResolverDnssecConfigs</code> request, omit this value.
     *        </p>
     *        <p>
     *        For the second and subsequent requests, get the value of <code>NextToken</code> from the previous response
     *        and specify that value for <code>NextToken</code> in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverDnssecConfigsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * An optional specification to return a subset of objects.
     * </p>
     * 
     * @return An optional specification to return a subset of objects.
     */

    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * An optional specification to return a subset of objects.
     * </p>
     * 
     * @param filters
     *        An optional specification to return a subset of objects.
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * An optional specification to return a subset of objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        An optional specification to return a subset of objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverDnssecConfigsRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An optional specification to return a subset of objects.
     * </p>
     * 
     * @param filters
     *        An optional specification to return a subset of objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResolverDnssecConfigsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListResolverDnssecConfigsRequest == false)
            return false;
        ListResolverDnssecConfigsRequest other = (ListResolverDnssecConfigsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public ListResolverDnssecConfigsRequest clone() {
        return (ListResolverDnssecConfigsRequest) super.clone();
    }

}
