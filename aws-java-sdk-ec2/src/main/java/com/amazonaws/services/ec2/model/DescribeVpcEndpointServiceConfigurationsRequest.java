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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeVpcEndpointServiceConfigurationsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVpcEndpointServiceConfigurationsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeVpcEndpointServiceConfigurationsRequest> {

    /**
     * <p>
     * The IDs of one or more services.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> serviceIds;
    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>service-name</code> - The name of the service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>service-id</code> - The ID of the service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>service-state</code> - The state of the service (<code>Pending</code> | <code>Available</code> |
     * <code>Deleting</code> | <code>Deleted</code> | <code>Failed</code>).
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results of the initial
     * request can be seen by sending another request with the returned <code>NextToken</code> value. This value can be
     * between 5 and 1000; if <code>MaxResults</code> is given a value larger than 1000, only 1000 results are returned.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The IDs of one or more services.
     * </p>
     * 
     * @return The IDs of one or more services.
     */

    public java.util.List<String> getServiceIds() {
        if (serviceIds == null) {
            serviceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return serviceIds;
    }

    /**
     * <p>
     * The IDs of one or more services.
     * </p>
     * 
     * @param serviceIds
     *        The IDs of one or more services.
     */

    public void setServiceIds(java.util.Collection<String> serviceIds) {
        if (serviceIds == null) {
            this.serviceIds = null;
            return;
        }

        this.serviceIds = new com.amazonaws.internal.SdkInternalList<String>(serviceIds);
    }

    /**
     * <p>
     * The IDs of one or more services.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServiceIds(java.util.Collection)} or {@link #withServiceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param serviceIds
     *        The IDs of one or more services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcEndpointServiceConfigurationsRequest withServiceIds(String... serviceIds) {
        if (this.serviceIds == null) {
            setServiceIds(new com.amazonaws.internal.SdkInternalList<String>(serviceIds.length));
        }
        for (String ele : serviceIds) {
            this.serviceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of one or more services.
     * </p>
     * 
     * @param serviceIds
     *        The IDs of one or more services.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcEndpointServiceConfigurationsRequest withServiceIds(java.util.Collection<String> serviceIds) {
        setServiceIds(serviceIds);
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>service-name</code> - The name of the service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>service-id</code> - The ID of the service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>service-state</code> - The state of the service (<code>Pending</code> | <code>Available</code> |
     * <code>Deleting</code> | <code>Deleted</code> | <code>Failed</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>service-name</code> - The name of the service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>service-id</code> - The ID of the service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>service-state</code> - The state of the service (<code>Pending</code> | <code>Available</code> |
     *         <code>Deleting</code> | <code>Deleted</code> | <code>Failed</code>).
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
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>service-name</code> - The name of the service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>service-id</code> - The ID of the service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>service-state</code> - The state of the service (<code>Pending</code> | <code>Available</code> |
     * <code>Deleting</code> | <code>Deleted</code> | <code>Failed</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>service-name</code> - The name of the service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>service-id</code> - The ID of the service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>service-state</code> - The state of the service (<code>Pending</code> | <code>Available</code> |
     *        <code>Deleting</code> | <code>Deleted</code> | <code>Failed</code>).
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
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>service-name</code> - The name of the service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>service-id</code> - The ID of the service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>service-state</code> - The state of the service (<code>Pending</code> | <code>Available</code> |
     * <code>Deleting</code> | <code>Deleted</code> | <code>Failed</code>).
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
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>service-name</code> - The name of the service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>service-id</code> - The ID of the service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>service-state</code> - The state of the service (<code>Pending</code> | <code>Available</code> |
     *        <code>Deleting</code> | <code>Deleted</code> | <code>Failed</code>).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcEndpointServiceConfigurationsRequest withFilters(Filter... filters) {
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
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>service-name</code> - The name of the service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>service-id</code> - The ID of the service.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>service-state</code> - The state of the service (<code>Pending</code> | <code>Available</code> |
     * <code>Deleting</code> | <code>Deleted</code> | <code>Failed</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>service-name</code> - The name of the service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>service-id</code> - The ID of the service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>service-state</code> - The state of the service (<code>Pending</code> | <code>Available</code> |
     *        <code>Deleting</code> | <code>Deleted</code> | <code>Failed</code>).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcEndpointServiceConfigurationsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results of the initial
     * request can be seen by sending another request with the returned <code>NextToken</code> value. This value can be
     * between 5 and 1000; if <code>MaxResults</code> is given a value larger than 1000, only 1000 results are returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for the request in a single page. The remaining results of the
     *        initial request can be seen by sending another request with the returned <code>NextToken</code> value.
     *        This value can be between 5 and 1000; if <code>MaxResults</code> is given a value larger than 1000, only
     *        1000 results are returned.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results of the initial
     * request can be seen by sending another request with the returned <code>NextToken</code> value. This value can be
     * between 5 and 1000; if <code>MaxResults</code> is given a value larger than 1000, only 1000 results are returned.
     * </p>
     * 
     * @return The maximum number of results to return for the request in a single page. The remaining results of the
     *         initial request can be seen by sending another request with the returned <code>NextToken</code> value.
     *         This value can be between 5 and 1000; if <code>MaxResults</code> is given a value larger than 1000, only
     *         1000 results are returned.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results of the initial
     * request can be seen by sending another request with the returned <code>NextToken</code> value. This value can be
     * between 5 and 1000; if <code>MaxResults</code> is given a value larger than 1000, only 1000 results are returned.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for the request in a single page. The remaining results of the
     *        initial request can be seen by sending another request with the returned <code>NextToken</code> value.
     *        This value can be between 5 and 1000; if <code>MaxResults</code> is given a value larger than 1000, only
     *        1000 results are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcEndpointServiceConfigurationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     * 
     * @return The token to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcEndpointServiceConfigurationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeVpcEndpointServiceConfigurationsRequest> getDryRunRequest() {
        Request<DescribeVpcEndpointServiceConfigurationsRequest> request = new DescribeVpcEndpointServiceConfigurationsRequestMarshaller().marshall(this);
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
        if (getServiceIds() != null)
            sb.append("ServiceIds: ").append(getServiceIds()).append(",");
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

        if (obj instanceof DescribeVpcEndpointServiceConfigurationsRequest == false)
            return false;
        DescribeVpcEndpointServiceConfigurationsRequest other = (DescribeVpcEndpointServiceConfigurationsRequest) obj;
        if (other.getServiceIds() == null ^ this.getServiceIds() == null)
            return false;
        if (other.getServiceIds() != null && other.getServiceIds().equals(this.getServiceIds()) == false)
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

        hashCode = prime * hashCode + ((getServiceIds() == null) ? 0 : getServiceIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVpcEndpointServiceConfigurationsRequest clone() {
        return (DescribeVpcEndpointServiceConfigurationsRequest) super.clone();
    }
}
