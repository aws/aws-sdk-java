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
import com.amazonaws.services.ec2.model.transform.DescribeVpcEndpointServicePermissionsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVpcEndpointServicePermissionsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeVpcEndpointServicePermissionsRequest> {

    /**
     * <p>
     * The ID of the service.
     * </p>
     */
    private String serviceId;
    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>principal</code> - The ARN of the principal.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>principal-type</code> - The principal type (<code>All</code> | <code>Service</code> |
     * <code>OrganizationUnit</code> | <code>Account</code> | <code>User</code> | <code>Role</code>).
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
     * The ID of the service.
     * </p>
     * 
     * @param serviceId
     *        The ID of the service.
     */

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * <p>
     * The ID of the service.
     * </p>
     * 
     * @return The ID of the service.
     */

    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * <p>
     * The ID of the service.
     * </p>
     * 
     * @param serviceId
     *        The ID of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcEndpointServicePermissionsRequest withServiceId(String serviceId) {
        setServiceId(serviceId);
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>principal</code> - The ARN of the principal.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>principal-type</code> - The principal type (<code>All</code> | <code>Service</code> |
     * <code>OrganizationUnit</code> | <code>Account</code> | <code>User</code> | <code>Role</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>principal</code> - The ARN of the principal.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>principal-type</code> - The principal type (<code>All</code> | <code>Service</code> |
     *         <code>OrganizationUnit</code> | <code>Account</code> | <code>User</code> | <code>Role</code>).
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
     * <code>principal</code> - The ARN of the principal.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>principal-type</code> - The principal type (<code>All</code> | <code>Service</code> |
     * <code>OrganizationUnit</code> | <code>Account</code> | <code>User</code> | <code>Role</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>principal</code> - The ARN of the principal.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>principal-type</code> - The principal type (<code>All</code> | <code>Service</code> |
     *        <code>OrganizationUnit</code> | <code>Account</code> | <code>User</code> | <code>Role</code>).
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
     * <code>principal</code> - The ARN of the principal.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>principal-type</code> - The principal type (<code>All</code> | <code>Service</code> |
     * <code>OrganizationUnit</code> | <code>Account</code> | <code>User</code> | <code>Role</code>).
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
     *        <code>principal</code> - The ARN of the principal.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>principal-type</code> - The principal type (<code>All</code> | <code>Service</code> |
     *        <code>OrganizationUnit</code> | <code>Account</code> | <code>User</code> | <code>Role</code>).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcEndpointServicePermissionsRequest withFilters(Filter... filters) {
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
     * <code>principal</code> - The ARN of the principal.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>principal-type</code> - The principal type (<code>All</code> | <code>Service</code> |
     * <code>OrganizationUnit</code> | <code>Account</code> | <code>User</code> | <code>Role</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>principal</code> - The ARN of the principal.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>principal-type</code> - The principal type (<code>All</code> | <code>Service</code> |
     *        <code>OrganizationUnit</code> | <code>Account</code> | <code>User</code> | <code>Role</code>).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcEndpointServicePermissionsRequest withFilters(java.util.Collection<Filter> filters) {
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

    public DescribeVpcEndpointServicePermissionsRequest withMaxResults(Integer maxResults) {
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

    public DescribeVpcEndpointServicePermissionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeVpcEndpointServicePermissionsRequest> getDryRunRequest() {
        Request<DescribeVpcEndpointServicePermissionsRequest> request = new DescribeVpcEndpointServicePermissionsRequestMarshaller().marshall(this);
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
        if (getServiceId() != null)
            sb.append("ServiceId: ").append(getServiceId()).append(",");
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

        if (obj instanceof DescribeVpcEndpointServicePermissionsRequest == false)
            return false;
        DescribeVpcEndpointServicePermissionsRequest other = (DescribeVpcEndpointServicePermissionsRequest) obj;
        if (other.getServiceId() == null ^ this.getServiceId() == null)
            return false;
        if (other.getServiceId() != null && other.getServiceId().equals(this.getServiceId()) == false)
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

        hashCode = prime * hashCode + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVpcEndpointServicePermissionsRequest clone() {
        return (DescribeVpcEndpointServicePermissionsRequest) super.clone();
    }
}
