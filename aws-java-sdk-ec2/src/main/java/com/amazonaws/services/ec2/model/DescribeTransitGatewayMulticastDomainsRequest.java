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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeTransitGatewayMulticastDomainsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTransitGatewayMulticastDomainsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeTransitGatewayMulticastDomainsRequest> {

    /**
     * <p>
     * The ID of the transit gateway multicast domain.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> transitGatewayMulticastDomainIds;
    /**
     * <p>
     * One or more filters. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>state</code> - The state of the transit gateway multicast domain. Valid values are <code>pending</code> |
     * <code>available</code> | <code>deleting</code> | <code>deleted</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-id</code> - The ID of the transit gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-multicast-domain-id</code> - The ID of the transit gateway multicast domain.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ID of the transit gateway multicast domain.
     * </p>
     * 
     * @return The ID of the transit gateway multicast domain.
     */

    public java.util.List<String> getTransitGatewayMulticastDomainIds() {
        if (transitGatewayMulticastDomainIds == null) {
            transitGatewayMulticastDomainIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return transitGatewayMulticastDomainIds;
    }

    /**
     * <p>
     * The ID of the transit gateway multicast domain.
     * </p>
     * 
     * @param transitGatewayMulticastDomainIds
     *        The ID of the transit gateway multicast domain.
     */

    public void setTransitGatewayMulticastDomainIds(java.util.Collection<String> transitGatewayMulticastDomainIds) {
        if (transitGatewayMulticastDomainIds == null) {
            this.transitGatewayMulticastDomainIds = null;
            return;
        }

        this.transitGatewayMulticastDomainIds = new com.amazonaws.internal.SdkInternalList<String>(transitGatewayMulticastDomainIds);
    }

    /**
     * <p>
     * The ID of the transit gateway multicast domain.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTransitGatewayMulticastDomainIds(java.util.Collection)} or
     * {@link #withTransitGatewayMulticastDomainIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param transitGatewayMulticastDomainIds
     *        The ID of the transit gateway multicast domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTransitGatewayMulticastDomainsRequest withTransitGatewayMulticastDomainIds(String... transitGatewayMulticastDomainIds) {
        if (this.transitGatewayMulticastDomainIds == null) {
            setTransitGatewayMulticastDomainIds(new com.amazonaws.internal.SdkInternalList<String>(transitGatewayMulticastDomainIds.length));
        }
        for (String ele : transitGatewayMulticastDomainIds) {
            this.transitGatewayMulticastDomainIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ID of the transit gateway multicast domain.
     * </p>
     * 
     * @param transitGatewayMulticastDomainIds
     *        The ID of the transit gateway multicast domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTransitGatewayMulticastDomainsRequest withTransitGatewayMulticastDomainIds(java.util.Collection<String> transitGatewayMulticastDomainIds) {
        setTransitGatewayMulticastDomainIds(transitGatewayMulticastDomainIds);
        return this;
    }

    /**
     * <p>
     * One or more filters. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>state</code> - The state of the transit gateway multicast domain. Valid values are <code>pending</code> |
     * <code>available</code> | <code>deleting</code> | <code>deleted</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-id</code> - The ID of the transit gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-multicast-domain-id</code> - The ID of the transit gateway multicast domain.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters. The possible values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>state</code> - The state of the transit gateway multicast domain. Valid values are
     *         <code>pending</code> | <code>available</code> | <code>deleting</code> | <code>deleted</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>transit-gateway-id</code> - The ID of the transit gateway.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>transit-gateway-multicast-domain-id</code> - The ID of the transit gateway multicast domain.
     *         </p>
     *         </li>
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * One or more filters. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>state</code> - The state of the transit gateway multicast domain. Valid values are <code>pending</code> |
     * <code>available</code> | <code>deleting</code> | <code>deleted</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-id</code> - The ID of the transit gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-multicast-domain-id</code> - The ID of the transit gateway multicast domain.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters. The possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the transit gateway multicast domain. Valid values are
     *        <code>pending</code> | <code>available</code> | <code>deleting</code> | <code>deleted</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>transit-gateway-id</code> - The ID of the transit gateway.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>transit-gateway-multicast-domain-id</code> - The ID of the transit gateway multicast domain.
     *        </p>
     *        </li>
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
     * One or more filters. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>state</code> - The state of the transit gateway multicast domain. Valid values are <code>pending</code> |
     * <code>available</code> | <code>deleting</code> | <code>deleted</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-id</code> - The ID of the transit gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-multicast-domain-id</code> - The ID of the transit gateway multicast domain.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        One or more filters. The possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the transit gateway multicast domain. Valid values are
     *        <code>pending</code> | <code>available</code> | <code>deleting</code> | <code>deleted</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>transit-gateway-id</code> - The ID of the transit gateway.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>transit-gateway-multicast-domain-id</code> - The ID of the transit gateway multicast domain.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTransitGatewayMulticastDomainsRequest withFilters(Filter... filters) {
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
     * One or more filters. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>state</code> - The state of the transit gateway multicast domain. Valid values are <code>pending</code> |
     * <code>available</code> | <code>deleting</code> | <code>deleted</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-id</code> - The ID of the transit gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>transit-gateway-multicast-domain-id</code> - The ID of the transit gateway multicast domain.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters. The possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the transit gateway multicast domain. Valid values are
     *        <code>pending</code> | <code>available</code> | <code>deleting</code> | <code>deleted</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>transit-gateway-id</code> - The ID of the transit gateway.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>transit-gateway-multicast-domain-id</code> - The ID of the transit gateway multicast domain.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTransitGatewayMulticastDomainsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve the remaining results, make
     *        another call with the returned <code>nextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @return The maximum number of results to return with a single call. To retrieve the remaining results, make
     *         another call with the returned <code>nextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve the remaining results, make
     *        another call with the returned <code>nextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTransitGatewayMulticastDomainsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @return The token for the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTransitGatewayMulticastDomainsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeTransitGatewayMulticastDomainsRequest> getDryRunRequest() {
        Request<DescribeTransitGatewayMulticastDomainsRequest> request = new DescribeTransitGatewayMulticastDomainsRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getTransitGatewayMulticastDomainIds() != null)
            sb.append("TransitGatewayMulticastDomainIds: ").append(getTransitGatewayMulticastDomainIds()).append(",");
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

        if (obj instanceof DescribeTransitGatewayMulticastDomainsRequest == false)
            return false;
        DescribeTransitGatewayMulticastDomainsRequest other = (DescribeTransitGatewayMulticastDomainsRequest) obj;
        if (other.getTransitGatewayMulticastDomainIds() == null ^ this.getTransitGatewayMulticastDomainIds() == null)
            return false;
        if (other.getTransitGatewayMulticastDomainIds() != null
                && other.getTransitGatewayMulticastDomainIds().equals(this.getTransitGatewayMulticastDomainIds()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getTransitGatewayMulticastDomainIds() == null) ? 0 : getTransitGatewayMulticastDomainIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTransitGatewayMulticastDomainsRequest clone() {
        return (DescribeTransitGatewayMulticastDomainsRequest) super.clone();
    }
}
