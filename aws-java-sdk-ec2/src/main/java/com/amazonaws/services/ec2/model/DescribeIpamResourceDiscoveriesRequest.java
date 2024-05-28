/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.DescribeIpamResourceDiscoveriesRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeIpamResourceDiscoveriesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeIpamResourceDiscoveriesRequest> {

    /**
     * <p>
     * The IPAM resource discovery IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> ipamResourceDiscoveryIds;
    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of resource discoveries to return in one page of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The resource discovery filters.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;

    /**
     * <p>
     * The IPAM resource discovery IDs.
     * </p>
     * 
     * @return The IPAM resource discovery IDs.
     */

    public java.util.List<String> getIpamResourceDiscoveryIds() {
        if (ipamResourceDiscoveryIds == null) {
            ipamResourceDiscoveryIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return ipamResourceDiscoveryIds;
    }

    /**
     * <p>
     * The IPAM resource discovery IDs.
     * </p>
     * 
     * @param ipamResourceDiscoveryIds
     *        The IPAM resource discovery IDs.
     */

    public void setIpamResourceDiscoveryIds(java.util.Collection<String> ipamResourceDiscoveryIds) {
        if (ipamResourceDiscoveryIds == null) {
            this.ipamResourceDiscoveryIds = null;
            return;
        }

        this.ipamResourceDiscoveryIds = new com.amazonaws.internal.SdkInternalList<String>(ipamResourceDiscoveryIds);
    }

    /**
     * <p>
     * The IPAM resource discovery IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpamResourceDiscoveryIds(java.util.Collection)} or
     * {@link #withIpamResourceDiscoveryIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param ipamResourceDiscoveryIds
     *        The IPAM resource discovery IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIpamResourceDiscoveriesRequest withIpamResourceDiscoveryIds(String... ipamResourceDiscoveryIds) {
        if (this.ipamResourceDiscoveryIds == null) {
            setIpamResourceDiscoveryIds(new com.amazonaws.internal.SdkInternalList<String>(ipamResourceDiscoveryIds.length));
        }
        for (String ele : ipamResourceDiscoveryIds) {
            this.ipamResourceDiscoveryIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IPAM resource discovery IDs.
     * </p>
     * 
     * @param ipamResourceDiscoveryIds
     *        The IPAM resource discovery IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIpamResourceDiscoveriesRequest withIpamResourceDiscoveryIds(java.util.Collection<String> ipamResourceDiscoveryIds) {
        setIpamResourceDiscoveryIds(ipamResourceDiscoveryIds);
        return this;
    }

    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Specify the pagination token from a previous request to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     * 
     * @return Specify the pagination token from a previous request to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Specify the pagination token from a previous request to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Specify the pagination token from a previous request to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIpamResourceDiscoveriesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of resource discoveries to return in one page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of resource discoveries to return in one page of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of resource discoveries to return in one page of results.
     * </p>
     * 
     * @return The maximum number of resource discoveries to return in one page of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of resource discoveries to return in one page of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of resource discoveries to return in one page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIpamResourceDiscoveriesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The resource discovery filters.
     * </p>
     * 
     * @return The resource discovery filters.
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * The resource discovery filters.
     * </p>
     * 
     * @param filters
     *        The resource discovery filters.
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
     * The resource discovery filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        The resource discovery filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIpamResourceDiscoveriesRequest withFilters(Filter... filters) {
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
     * The resource discovery filters.
     * </p>
     * 
     * @param filters
     *        The resource discovery filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeIpamResourceDiscoveriesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeIpamResourceDiscoveriesRequest> getDryRunRequest() {
        Request<DescribeIpamResourceDiscoveriesRequest> request = new DescribeIpamResourceDiscoveriesRequestMarshaller().marshall(this);
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
        if (getIpamResourceDiscoveryIds() != null)
            sb.append("IpamResourceDiscoveryIds: ").append(getIpamResourceDiscoveryIds()).append(",");
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

        if (obj instanceof DescribeIpamResourceDiscoveriesRequest == false)
            return false;
        DescribeIpamResourceDiscoveriesRequest other = (DescribeIpamResourceDiscoveriesRequest) obj;
        if (other.getIpamResourceDiscoveryIds() == null ^ this.getIpamResourceDiscoveryIds() == null)
            return false;
        if (other.getIpamResourceDiscoveryIds() != null && other.getIpamResourceDiscoveryIds().equals(this.getIpamResourceDiscoveryIds()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getIpamResourceDiscoveryIds() == null) ? 0 : getIpamResourceDiscoveryIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public DescribeIpamResourceDiscoveriesRequest clone() {
        return (DescribeIpamResourceDiscoveriesRequest) super.clone();
    }
}
