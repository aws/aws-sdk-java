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
package com.amazonaws.services.servicediscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/ListServices" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListServicesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * For the first <code>ListServices</code> request, omit this value.
     * </p>
     * <p>
     * If the response contains <code>NextToken</code>, submit another <code>ListServices</code> request to get the next
     * group of results. Specify the value of <code>NextToken</code> from the previous response in the next request.
     * </p>
     * <note>
     * <p>
     * AWS Cloud Map gets <code>MaxResults</code> services and then filters them based on the specified criteria. It's
     * possible that no services in the first <code>MaxResults</code> services matched the specified criteria but that
     * subsequent groups of <code>MaxResults</code> services do contain services that match the criteria.
     * </p>
     * </note>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of services that you want AWS Cloud Map to return in the response to a
     * <code>ListServices</code> request. If you don't specify a value for <code>MaxResults</code>, AWS Cloud Map
     * returns up to 100 services.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A complex type that contains specifications for the namespaces that you want to list services for.
     * </p>
     * <p>
     * If you specify more than one filter, an operation must match all filters to be returned by
     * <code>ListServices</code>.
     * </p>
     */
    private java.util.List<ServiceFilter> filters;

    /**
     * <p>
     * For the first <code>ListServices</code> request, omit this value.
     * </p>
     * <p>
     * If the response contains <code>NextToken</code>, submit another <code>ListServices</code> request to get the next
     * group of results. Specify the value of <code>NextToken</code> from the previous response in the next request.
     * </p>
     * <note>
     * <p>
     * AWS Cloud Map gets <code>MaxResults</code> services and then filters them based on the specified criteria. It's
     * possible that no services in the first <code>MaxResults</code> services matched the specified criteria but that
     * subsequent groups of <code>MaxResults</code> services do contain services that match the criteria.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        For the first <code>ListServices</code> request, omit this value.</p>
     *        <p>
     *        If the response contains <code>NextToken</code>, submit another <code>ListServices</code> request to get
     *        the next group of results. Specify the value of <code>NextToken</code> from the previous response in the
     *        next request.
     *        </p>
     *        <note>
     *        <p>
     *        AWS Cloud Map gets <code>MaxResults</code> services and then filters them based on the specified criteria.
     *        It's possible that no services in the first <code>MaxResults</code> services matched the specified
     *        criteria but that subsequent groups of <code>MaxResults</code> services do contain services that match the
     *        criteria.
     *        </p>
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * For the first <code>ListServices</code> request, omit this value.
     * </p>
     * <p>
     * If the response contains <code>NextToken</code>, submit another <code>ListServices</code> request to get the next
     * group of results. Specify the value of <code>NextToken</code> from the previous response in the next request.
     * </p>
     * <note>
     * <p>
     * AWS Cloud Map gets <code>MaxResults</code> services and then filters them based on the specified criteria. It's
     * possible that no services in the first <code>MaxResults</code> services matched the specified criteria but that
     * subsequent groups of <code>MaxResults</code> services do contain services that match the criteria.
     * </p>
     * </note>
     * 
     * @return For the first <code>ListServices</code> request, omit this value.</p>
     *         <p>
     *         If the response contains <code>NextToken</code>, submit another <code>ListServices</code> request to get
     *         the next group of results. Specify the value of <code>NextToken</code> from the previous response in the
     *         next request.
     *         </p>
     *         <note>
     *         <p>
     *         AWS Cloud Map gets <code>MaxResults</code> services and then filters them based on the specified
     *         criteria. It's possible that no services in the first <code>MaxResults</code> services matched the
     *         specified criteria but that subsequent groups of <code>MaxResults</code> services do contain services
     *         that match the criteria.
     *         </p>
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * For the first <code>ListServices</code> request, omit this value.
     * </p>
     * <p>
     * If the response contains <code>NextToken</code>, submit another <code>ListServices</code> request to get the next
     * group of results. Specify the value of <code>NextToken</code> from the previous response in the next request.
     * </p>
     * <note>
     * <p>
     * AWS Cloud Map gets <code>MaxResults</code> services and then filters them based on the specified criteria. It's
     * possible that no services in the first <code>MaxResults</code> services matched the specified criteria but that
     * subsequent groups of <code>MaxResults</code> services do contain services that match the criteria.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        For the first <code>ListServices</code> request, omit this value.</p>
     *        <p>
     *        If the response contains <code>NextToken</code>, submit another <code>ListServices</code> request to get
     *        the next group of results. Specify the value of <code>NextToken</code> from the previous response in the
     *        next request.
     *        </p>
     *        <note>
     *        <p>
     *        AWS Cloud Map gets <code>MaxResults</code> services and then filters them based on the specified criteria.
     *        It's possible that no services in the first <code>MaxResults</code> services matched the specified
     *        criteria but that subsequent groups of <code>MaxResults</code> services do contain services that match the
     *        criteria.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServicesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of services that you want AWS Cloud Map to return in the response to a
     * <code>ListServices</code> request. If you don't specify a value for <code>MaxResults</code>, AWS Cloud Map
     * returns up to 100 services.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of services that you want AWS Cloud Map to return in the response to a
     *        <code>ListServices</code> request. If you don't specify a value for <code>MaxResults</code>, AWS Cloud Map
     *        returns up to 100 services.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of services that you want AWS Cloud Map to return in the response to a
     * <code>ListServices</code> request. If you don't specify a value for <code>MaxResults</code>, AWS Cloud Map
     * returns up to 100 services.
     * </p>
     * 
     * @return The maximum number of services that you want AWS Cloud Map to return in the response to a
     *         <code>ListServices</code> request. If you don't specify a value for <code>MaxResults</code>, AWS Cloud
     *         Map returns up to 100 services.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of services that you want AWS Cloud Map to return in the response to a
     * <code>ListServices</code> request. If you don't specify a value for <code>MaxResults</code>, AWS Cloud Map
     * returns up to 100 services.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of services that you want AWS Cloud Map to return in the response to a
     *        <code>ListServices</code> request. If you don't specify a value for <code>MaxResults</code>, AWS Cloud Map
     *        returns up to 100 services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServicesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A complex type that contains specifications for the namespaces that you want to list services for.
     * </p>
     * <p>
     * If you specify more than one filter, an operation must match all filters to be returned by
     * <code>ListServices</code>.
     * </p>
     * 
     * @return A complex type that contains specifications for the namespaces that you want to list services for. </p>
     *         <p>
     *         If you specify more than one filter, an operation must match all filters to be returned by
     *         <code>ListServices</code>.
     */

    public java.util.List<ServiceFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * A complex type that contains specifications for the namespaces that you want to list services for.
     * </p>
     * <p>
     * If you specify more than one filter, an operation must match all filters to be returned by
     * <code>ListServices</code>.
     * </p>
     * 
     * @param filters
     *        A complex type that contains specifications for the namespaces that you want to list services for. </p>
     *        <p>
     *        If you specify more than one filter, an operation must match all filters to be returned by
     *        <code>ListServices</code>.
     */

    public void setFilters(java.util.Collection<ServiceFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<ServiceFilter>(filters);
    }

    /**
     * <p>
     * A complex type that contains specifications for the namespaces that you want to list services for.
     * </p>
     * <p>
     * If you specify more than one filter, an operation must match all filters to be returned by
     * <code>ListServices</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        A complex type that contains specifications for the namespaces that you want to list services for. </p>
     *        <p>
     *        If you specify more than one filter, an operation must match all filters to be returned by
     *        <code>ListServices</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServicesRequest withFilters(ServiceFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<ServiceFilter>(filters.length));
        }
        for (ServiceFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains specifications for the namespaces that you want to list services for.
     * </p>
     * <p>
     * If you specify more than one filter, an operation must match all filters to be returned by
     * <code>ListServices</code>.
     * </p>
     * 
     * @param filters
     *        A complex type that contains specifications for the namespaces that you want to list services for. </p>
     *        <p>
     *        If you specify more than one filter, an operation must match all filters to be returned by
     *        <code>ListServices</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListServicesRequest withFilters(java.util.Collection<ServiceFilter> filters) {
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListServicesRequest == false)
            return false;
        ListServicesRequest other = (ListServicesRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public ListServicesRequest clone() {
        return (ListServicesRequest) super.clone();
    }

}
