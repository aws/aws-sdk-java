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
import com.amazonaws.services.ec2.model.transform.DescribeHostsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeHostsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribeHostsRequest> {

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>auto-placement</code> - Whether auto-placement is enabled or disabled (<code>on</code> | <code>off</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>client-token</code> - The idempotency token that you provided when you allocated the host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>host-reservation-id</code> - The ID of the reservation assigned to this host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type size that the Dedicated Host is configured to support.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The allocation state of the Dedicated Host (<code>available</code> |
     * <code>under-assessment</code> | <code>permanent-failure</code> | <code>released</code> |
     * <code>released-permanent-failure</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources assigned
     * a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filter;
    /**
     * <p>
     * The IDs of the Dedicated Hosts. The IDs are used for targeted instance launches.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> hostIds;
    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results can be seen by
     * sending another request with the returned <code>nextToken</code> value. This value can be between 5 and 500. If
     * <code>maxResults</code> is given a larger value than 500, you receive an error. You cannot specify this parameter
     * and the host IDs parameter in the same request.
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
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>auto-placement</code> - Whether auto-placement is enabled or disabled (<code>on</code> | <code>off</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>client-token</code> - The idempotency token that you provided when you allocated the host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>host-reservation-id</code> - The ID of the reservation assigned to this host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type size that the Dedicated Host is configured to support.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The allocation state of the Dedicated Host (<code>available</code> |
     * <code>under-assessment</code> | <code>permanent-failure</code> | <code>released</code> |
     * <code>released-permanent-failure</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources assigned
     * a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>auto-placement</code> - Whether auto-placement is enabled or disabled (<code>on</code> |
     *         <code>off</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>availability-zone</code> - The Availability Zone of the host.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>client-token</code> - The idempotency token that you provided when you allocated the host.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>host-reservation-id</code> - The ID of the reservation assigned to this host.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-type</code> - The instance type size that the Dedicated Host is configured to support.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state</code> - The allocation state of the Dedicated Host (<code>available</code> |
     *         <code>under-assessment</code> | <code>permanent-failure</code> | <code>released</code> |
     *         <code>released-permanent-failure</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources
     *         assigned a tag with a specific key, regardless of the tag value.
     *         </p>
     *         </li>
     */

    public java.util.List<Filter> getFilter() {
        if (filter == null) {
            filter = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filter;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>auto-placement</code> - Whether auto-placement is enabled or disabled (<code>on</code> | <code>off</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>client-token</code> - The idempotency token that you provided when you allocated the host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>host-reservation-id</code> - The ID of the reservation assigned to this host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type size that the Dedicated Host is configured to support.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The allocation state of the Dedicated Host (<code>available</code> |
     * <code>under-assessment</code> | <code>permanent-failure</code> | <code>released</code> |
     * <code>released-permanent-failure</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources assigned
     * a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filter
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>auto-placement</code> - Whether auto-placement is enabled or disabled (<code>on</code> |
     *        <code>off</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone of the host.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>client-token</code> - The idempotency token that you provided when you allocated the host.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>host-reservation-id</code> - The ID of the reservation assigned to this host.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-type</code> - The instance type size that the Dedicated Host is configured to support.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The allocation state of the Dedicated Host (<code>available</code> |
     *        <code>under-assessment</code> | <code>permanent-failure</code> | <code>released</code> |
     *        <code>released-permanent-failure</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources
     *        assigned a tag with a specific key, regardless of the tag value.
     *        </p>
     *        </li>
     */

    public void setFilter(java.util.Collection<Filter> filter) {
        if (filter == null) {
            this.filter = null;
            return;
        }

        this.filter = new com.amazonaws.internal.SdkInternalList<Filter>(filter);
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>auto-placement</code> - Whether auto-placement is enabled or disabled (<code>on</code> | <code>off</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>client-token</code> - The idempotency token that you provided when you allocated the host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>host-reservation-id</code> - The ID of the reservation assigned to this host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type size that the Dedicated Host is configured to support.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The allocation state of the Dedicated Host (<code>available</code> |
     * <code>under-assessment</code> | <code>permanent-failure</code> | <code>released</code> |
     * <code>released-permanent-failure</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources assigned
     * a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilter(java.util.Collection)} or {@link #withFilter(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param filter
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>auto-placement</code> - Whether auto-placement is enabled or disabled (<code>on</code> |
     *        <code>off</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone of the host.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>client-token</code> - The idempotency token that you provided when you allocated the host.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>host-reservation-id</code> - The ID of the reservation assigned to this host.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-type</code> - The instance type size that the Dedicated Host is configured to support.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The allocation state of the Dedicated Host (<code>available</code> |
     *        <code>under-assessment</code> | <code>permanent-failure</code> | <code>released</code> |
     *        <code>released-permanent-failure</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources
     *        assigned a tag with a specific key, regardless of the tag value.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHostsRequest withFilter(Filter... filter) {
        if (this.filter == null) {
            setFilter(new com.amazonaws.internal.SdkInternalList<Filter>(filter.length));
        }
        for (Filter ele : filter) {
            this.filter.add(ele);
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
     * <code>auto-placement</code> - Whether auto-placement is enabled or disabled (<code>on</code> | <code>off</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>client-token</code> - The idempotency token that you provided when you allocated the host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>host-reservation-id</code> - The ID of the reservation assigned to this host.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-type</code> - The instance type size that the Dedicated Host is configured to support.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The allocation state of the Dedicated Host (<code>available</code> |
     * <code>under-assessment</code> | <code>permanent-failure</code> | <code>released</code> |
     * <code>released-permanent-failure</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources assigned
     * a tag with a specific key, regardless of the tag value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filter
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>auto-placement</code> - Whether auto-placement is enabled or disabled (<code>on</code> |
     *        <code>off</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone of the host.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>client-token</code> - The idempotency token that you provided when you allocated the host.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>host-reservation-id</code> - The ID of the reservation assigned to this host.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-type</code> - The instance type size that the Dedicated Host is configured to support.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The allocation state of the Dedicated Host (<code>available</code> |
     *        <code>under-assessment</code> | <code>permanent-failure</code> | <code>released</code> |
     *        <code>released-permanent-failure</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources
     *        assigned a tag with a specific key, regardless of the tag value.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHostsRequest withFilter(java.util.Collection<Filter> filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts. The IDs are used for targeted instance launches.
     * </p>
     * 
     * @return The IDs of the Dedicated Hosts. The IDs are used for targeted instance launches.
     */

    public java.util.List<String> getHostIds() {
        if (hostIds == null) {
            hostIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return hostIds;
    }

    /**
     * <p>
     * The IDs of the Dedicated Hosts. The IDs are used for targeted instance launches.
     * </p>
     * 
     * @param hostIds
     *        The IDs of the Dedicated Hosts. The IDs are used for targeted instance launches.
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
     * The IDs of the Dedicated Hosts. The IDs are used for targeted instance launches.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHostIds(java.util.Collection)} or {@link #withHostIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param hostIds
     *        The IDs of the Dedicated Hosts. The IDs are used for targeted instance launches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHostsRequest withHostIds(String... hostIds) {
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
     * The IDs of the Dedicated Hosts. The IDs are used for targeted instance launches.
     * </p>
     * 
     * @param hostIds
     *        The IDs of the Dedicated Hosts. The IDs are used for targeted instance launches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHostsRequest withHostIds(java.util.Collection<String> hostIds) {
        setHostIds(hostIds);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results can be seen by
     * sending another request with the returned <code>nextToken</code> value. This value can be between 5 and 500. If
     * <code>maxResults</code> is given a larger value than 500, you receive an error. You cannot specify this parameter
     * and the host IDs parameter in the same request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for the request in a single page. The remaining results can be
     *        seen by sending another request with the returned <code>nextToken</code> value. This value can be between
     *        5 and 500. If <code>maxResults</code> is given a larger value than 500, you receive an error. You cannot
     *        specify this parameter and the host IDs parameter in the same request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results can be seen by
     * sending another request with the returned <code>nextToken</code> value. This value can be between 5 and 500. If
     * <code>maxResults</code> is given a larger value than 500, you receive an error. You cannot specify this parameter
     * and the host IDs parameter in the same request.
     * </p>
     * 
     * @return The maximum number of results to return for the request in a single page. The remaining results can be
     *         seen by sending another request with the returned <code>nextToken</code> value. This value can be between
     *         5 and 500. If <code>maxResults</code> is given a larger value than 500, you receive an error. You cannot
     *         specify this parameter and the host IDs parameter in the same request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page. The remaining results can be seen by
     * sending another request with the returned <code>nextToken</code> value. This value can be between 5 and 500. If
     * <code>maxResults</code> is given a larger value than 500, you receive an error. You cannot specify this parameter
     * and the host IDs parameter in the same request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for the request in a single page. The remaining results can be
     *        seen by sending another request with the returned <code>nextToken</code> value. This value can be between
     *        5 and 500. If <code>maxResults</code> is given a larger value than 500, you receive an error. You cannot
     *        specify this parameter and the host IDs parameter in the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHostsRequest withMaxResults(Integer maxResults) {
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

    public DescribeHostsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeHostsRequest> getDryRunRequest() {
        Request<DescribeHostsRequest> request = new DescribeHostsRequestMarshaller().marshall(this);
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
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
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

        if (obj instanceof DescribeHostsRequest == false)
            return false;
        DescribeHostsRequest other = (DescribeHostsRequest) obj;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
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

        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getHostIds() == null) ? 0 : getHostIds().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeHostsRequest clone() {
        return (DescribeHostsRequest) super.clone();
    }
}
