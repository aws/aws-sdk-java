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
import com.amazonaws.services.ec2.model.transform.DescribeVpcEndpointServicesRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DescribeVpcEndpointServices.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVpcEndpointServicesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeVpcEndpointServicesRequest> {

    /**
     * <p>
     * One or more service names.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> serviceNames;
    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>service-name</code>: The name of the service.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The maximum number of items to return for this request. The request returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * <p>
     * Constraint: If the value is greater than 1000, we return only 1000 items.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a prior call.)
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * One or more service names.
     * </p>
     * 
     * @return One or more service names.
     */

    public java.util.List<String> getServiceNames() {
        if (serviceNames == null) {
            serviceNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return serviceNames;
    }

    /**
     * <p>
     * One or more service names.
     * </p>
     * 
     * @param serviceNames
     *        One or more service names.
     */

    public void setServiceNames(java.util.Collection<String> serviceNames) {
        if (serviceNames == null) {
            this.serviceNames = null;
            return;
        }

        this.serviceNames = new com.amazonaws.internal.SdkInternalList<String>(serviceNames);
    }

    /**
     * <p>
     * One or more service names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServiceNames(java.util.Collection)} or {@link #withServiceNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param serviceNames
     *        One or more service names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcEndpointServicesRequest withServiceNames(String... serviceNames) {
        if (this.serviceNames == null) {
            setServiceNames(new com.amazonaws.internal.SdkInternalList<String>(serviceNames.length));
        }
        for (String ele : serviceNames) {
            this.serviceNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more service names.
     * </p>
     * 
     * @param serviceNames
     *        One or more service names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcEndpointServicesRequest withServiceNames(java.util.Collection<String> serviceNames) {
        setServiceNames(serviceNames);
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>service-name</code>: The name of the service.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>service-name</code>: The name of the service.
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
     * <code>service-name</code>: The name of the service.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>service-name</code>: The name of the service.
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
     * <code>service-name</code>: The name of the service.
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
     *        <code>service-name</code>: The name of the service.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcEndpointServicesRequest withFilters(Filter... filters) {
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
     * <code>service-name</code>: The name of the service.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>service-name</code>: The name of the service.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcEndpointServicesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return for this request. The request returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * <p>
     * Constraint: If the value is greater than 1000, we return only 1000 items.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this request. The request returns a token that you can specify
     *        in a subsequent call to get the next set of results.</p>
     *        <p>
     *        Constraint: If the value is greater than 1000, we return only 1000 items.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this request. The request returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * <p>
     * Constraint: If the value is greater than 1000, we return only 1000 items.
     * </p>
     * 
     * @return The maximum number of items to return for this request. The request returns a token that you can specify
     *         in a subsequent call to get the next set of results.</p>
     *         <p>
     *         Constraint: If the value is greater than 1000, we return only 1000 items.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this request. The request returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * <p>
     * Constraint: If the value is greater than 1000, we return only 1000 items.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this request. The request returns a token that you can specify
     *        in a subsequent call to get the next set of results.</p>
     *        <p>
     *        Constraint: If the value is greater than 1000, we return only 1000 items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcEndpointServicesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a prior call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this token from a prior call.)
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a prior call.)
     * </p>
     * 
     * @return The token for the next set of items to return. (You received this token from a prior call.)
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a prior call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this token from a prior call.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVpcEndpointServicesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeVpcEndpointServicesRequest> getDryRunRequest() {
        Request<DescribeVpcEndpointServicesRequest> request = new DescribeVpcEndpointServicesRequestMarshaller().marshall(this);
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
        if (getServiceNames() != null)
            sb.append("ServiceNames: ").append(getServiceNames()).append(",");
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

        if (obj instanceof DescribeVpcEndpointServicesRequest == false)
            return false;
        DescribeVpcEndpointServicesRequest other = (DescribeVpcEndpointServicesRequest) obj;
        if (other.getServiceNames() == null ^ this.getServiceNames() == null)
            return false;
        if (other.getServiceNames() != null && other.getServiceNames().equals(this.getServiceNames()) == false)
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

        hashCode = prime * hashCode + ((getServiceNames() == null) ? 0 : getServiceNames().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVpcEndpointServicesRequest clone() {
        return (DescribeVpcEndpointServicesRequest) super.clone();
    }
}
