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
import com.amazonaws.services.ec2.model.transform.DescribeMacHostsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMacHostsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribeMacHostsRequest> {

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the EC2 Mac Dedicated Host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type size that the EC2 Mac Dedicated Host is configured to support.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The IDs of the EC2 Mac Dedicated Hosts.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> hostIds;
    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results can be seen by
     * sending another request with the returned <code>nextToken</code> value. This value can be between 5 and 500. If
     * <code>maxResults</code> is given a larger value than 500, you receive an error.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the EC2 Mac Dedicated Host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type size that the EC2 Mac Dedicated Host is configured to support.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>availability-zone</code> - The Availability Zone of the EC2 Mac Dedicated Host.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-type</code> - The instance type size that the EC2 Mac Dedicated Host is configured to
     *         support.
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
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the EC2 Mac Dedicated Host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type size that the EC2 Mac Dedicated Host is configured to support.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        The filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone of the EC2 Mac Dedicated Host.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-type</code> - The instance type size that the EC2 Mac Dedicated Host is configured to
     *        support.
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
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the EC2 Mac Dedicated Host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type size that the EC2 Mac Dedicated Host is configured to support.
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
     *        The filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone of the EC2 Mac Dedicated Host.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-type</code> - The instance type size that the EC2 Mac Dedicated Host is configured to
     *        support.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMacHostsRequest withFilters(Filter... filters) {
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
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the EC2 Mac Dedicated Host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type size that the EC2 Mac Dedicated Host is configured to support.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        The filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone of the EC2 Mac Dedicated Host.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-type</code> - The instance type size that the EC2 Mac Dedicated Host is configured to
     *        support.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMacHostsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The IDs of the EC2 Mac Dedicated Hosts.
     * </p>
     * 
     * @return The IDs of the EC2 Mac Dedicated Hosts.
     */

    public java.util.List<String> getHostIds() {
        if (hostIds == null) {
            hostIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return hostIds;
    }

    /**
     * <p>
     * The IDs of the EC2 Mac Dedicated Hosts.
     * </p>
     * 
     * @param hostIds
     *        The IDs of the EC2 Mac Dedicated Hosts.
     */

    public void setHostIds(java.util.Collection<String> hostIds) {
        if (hostIds == null) {
            this.hostIds = null;
            return;
        }

        this.hostIds = new com.amazonaws.internal.SdkInternalList<String>(hostIds);
    }

    /**
     * <p>
     * The IDs of the EC2 Mac Dedicated Hosts.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHostIds(java.util.Collection)} or {@link #withHostIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param hostIds
     *        The IDs of the EC2 Mac Dedicated Hosts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMacHostsRequest withHostIds(String... hostIds) {
        if (this.hostIds == null) {
            setHostIds(new com.amazonaws.internal.SdkInternalList<String>(hostIds.length));
        }
        for (String ele : hostIds) {
            this.hostIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the EC2 Mac Dedicated Hosts.
     * </p>
     * 
     * @param hostIds
     *        The IDs of the EC2 Mac Dedicated Hosts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMacHostsRequest withHostIds(java.util.Collection<String> hostIds) {
        setHostIds(hostIds);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results can be seen by
     * sending another request with the returned <code>nextToken</code> value. This value can be between 5 and 500. If
     * <code>maxResults</code> is given a larger value than 500, you receive an error.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for the request in a single page. The remaining results can be
     *        seen by sending another request with the returned <code>nextToken</code> value. This value can be between
     *        5 and 500. If <code>maxResults</code> is given a larger value than 500, you receive an error.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results can be seen by
     * sending another request with the returned <code>nextToken</code> value. This value can be between 5 and 500. If
     * <code>maxResults</code> is given a larger value than 500, you receive an error.
     * </p>
     * 
     * @return The maximum number of results to return for the request in a single page. The remaining results can be
     *         seen by sending another request with the returned <code>nextToken</code> value. This value can be between
     *         5 and 500. If <code>maxResults</code> is given a larger value than 500, you receive an error.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results can be seen by
     * sending another request with the returned <code>nextToken</code> value. This value can be between 5 and 500. If
     * <code>maxResults</code> is given a larger value than 500, you receive an error.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for the request in a single page. The remaining results can be
     *        seen by sending another request with the returned <code>nextToken</code> value. This value can be between
     *        5 and 500. If <code>maxResults</code> is given a larger value than 500, you receive an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMacHostsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMacHostsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeMacHostsRequest> getDryRunRequest() {
        Request<DescribeMacHostsRequest> request = new DescribeMacHostsRequestMarshaller().marshall(this);
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getHostIds() != null)
            sb.append("HostIds: ").append(getHostIds()).append(",");
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

        if (obj instanceof DescribeMacHostsRequest == false)
            return false;
        DescribeMacHostsRequest other = (DescribeMacHostsRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getHostIds() == null ^ this.getHostIds() == null)
            return false;
        if (other.getHostIds() != null && other.getHostIds().equals(this.getHostIds()) == false)
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
        hashCode = prime * hashCode + ((getHostIds() == null) ? 0 : getHostIds().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeMacHostsRequest clone() {
        return (DescribeMacHostsRequest) super.clone();
    }
}
