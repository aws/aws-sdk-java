/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeHosts(DescribeHostsRequest) DescribeHosts operation}.
 * <p>
 * Describes one or more of your Dedicated hosts.
 * </p>
 * <p>
 * The results describe only the Dedicated hosts in the region you're
 * currently using. All listed instances consume capacity on your
 * Dedicated host. Dedicated hosts that have recently been released will
 * be listed with the state <code>released</code> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeHosts(DescribeHostsRequest)
 */
public class DescribeHostsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The IDs of the Dedicated hosts. The IDs are used for targeted instance
     * launches.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> hostIds;

    /**
     * The token to retrieve the next page of results.
     */
    private String nextToken;

    /**
     * The maximum number of results to return for the request in a single
     * page. The remaining results can be seen by sending another request
     * with the returned <code>nextToken</code> value. This value can be
     * between 5 and 500; if <code>maxResults</code> is given a larger value
     * than 500, you will receive an error. You cannot specify this parameter
     * and the host IDs parameter in the same request.
     */
    private Integer maxResults;

    /**
     * One or more filters. <ul> <li><p><code>instance-type</code> - The
     * instance type size that the Dedicated host is configured to
     * support.</li> <li><p><code>auto-placement</code> - Whether
     * auto-placement is enabled or disabled (<code>on</code> |
     * <code>off</code>).</li> <li><p><code>host-reservation-id</code> - The
     * ID of the reservation associated with this host.</li>
     * <li><p><code>client-token</code> - The idempotency token you provided
     * when you launched the instance</li> <li><p><code>state</code>- The
     * allocation state of the Dedicated host (<code>available</code> |
     * <code>under-assessment</code> | <code>permanent-failure</code> |
     * <code>released</code> | <code>released-permanent-failure</code>).</li>
     * <li><p><code>availability-zone</code> - The Availability Zone of the
     * host. </li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filter;

    /**
     * The IDs of the Dedicated hosts. The IDs are used for targeted instance
     * launches.
     *
     * @return The IDs of the Dedicated hosts. The IDs are used for targeted instance
     *         launches.
     */
    public java.util.List<String> getHostIds() {
        if (hostIds == null) {
              hostIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              hostIds.setAutoConstruct(true);
        }
        return hostIds;
    }
    
    /**
     * The IDs of the Dedicated hosts. The IDs are used for targeted instance
     * launches.
     *
     * @param hostIds The IDs of the Dedicated hosts. The IDs are used for targeted instance
     *         launches.
     */
    public void setHostIds(java.util.Collection<String> hostIds) {
        if (hostIds == null) {
            this.hostIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> hostIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(hostIds.size());
        hostIdsCopy.addAll(hostIds);
        this.hostIds = hostIdsCopy;
    }
    
    /**
     * The IDs of the Dedicated hosts. The IDs are used for targeted instance
     * launches.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setHostIds(java.util.Collection)} or {@link
     * #withHostIds(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hostIds The IDs of the Dedicated hosts. The IDs are used for targeted instance
     *         launches.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHostsRequest withHostIds(String... hostIds) {
        if (getHostIds() == null) setHostIds(new java.util.ArrayList<String>(hostIds.length));
        for (String value : hostIds) {
            getHostIds().add(value);
        }
        return this;
    }
    
    /**
     * The IDs of the Dedicated hosts. The IDs are used for targeted instance
     * launches.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hostIds The IDs of the Dedicated hosts. The IDs are used for targeted instance
     *         launches.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHostsRequest withHostIds(java.util.Collection<String> hostIds) {
        if (hostIds == null) {
            this.hostIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> hostIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(hostIds.size());
            hostIdsCopy.addAll(hostIds);
            this.hostIds = hostIdsCopy;
        }

        return this;
    }

    /**
     * The token to retrieve the next page of results.
     *
     * @return The token to retrieve the next page of results.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token to retrieve the next page of results.
     *
     * @param nextToken The token to retrieve the next page of results.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token to retrieve the next page of results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The token to retrieve the next page of results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHostsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * The maximum number of results to return for the request in a single
     * page. The remaining results can be seen by sending another request
     * with the returned <code>nextToken</code> value. This value can be
     * between 5 and 500; if <code>maxResults</code> is given a larger value
     * than 500, you will receive an error. You cannot specify this parameter
     * and the host IDs parameter in the same request.
     *
     * @return The maximum number of results to return for the request in a single
     *         page. The remaining results can be seen by sending another request
     *         with the returned <code>nextToken</code> value. This value can be
     *         between 5 and 500; if <code>maxResults</code> is given a larger value
     *         than 500, you will receive an error. You cannot specify this parameter
     *         and the host IDs parameter in the same request.
     */
    public Integer getMaxResults() {
        return maxResults;
    }
    
    /**
     * The maximum number of results to return for the request in a single
     * page. The remaining results can be seen by sending another request
     * with the returned <code>nextToken</code> value. This value can be
     * between 5 and 500; if <code>maxResults</code> is given a larger value
     * than 500, you will receive an error. You cannot specify this parameter
     * and the host IDs parameter in the same request.
     *
     * @param maxResults The maximum number of results to return for the request in a single
     *         page. The remaining results can be seen by sending another request
     *         with the returned <code>nextToken</code> value. This value can be
     *         between 5 and 500; if <code>maxResults</code> is given a larger value
     *         than 500, you will receive an error. You cannot specify this parameter
     *         and the host IDs parameter in the same request.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }
    
    /**
     * The maximum number of results to return for the request in a single
     * page. The remaining results can be seen by sending another request
     * with the returned <code>nextToken</code> value. This value can be
     * between 5 and 500; if <code>maxResults</code> is given a larger value
     * than 500, you will receive an error. You cannot specify this parameter
     * and the host IDs parameter in the same request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxResults The maximum number of results to return for the request in a single
     *         page. The remaining results can be seen by sending another request
     *         with the returned <code>nextToken</code> value. This value can be
     *         between 5 and 500; if <code>maxResults</code> is given a larger value
     *         than 500, you will receive an error. You cannot specify this parameter
     *         and the host IDs parameter in the same request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHostsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * One or more filters. <ul> <li><p><code>instance-type</code> - The
     * instance type size that the Dedicated host is configured to
     * support.</li> <li><p><code>auto-placement</code> - Whether
     * auto-placement is enabled or disabled (<code>on</code> |
     * <code>off</code>).</li> <li><p><code>host-reservation-id</code> - The
     * ID of the reservation associated with this host.</li>
     * <li><p><code>client-token</code> - The idempotency token you provided
     * when you launched the instance</li> <li><p><code>state</code>- The
     * allocation state of the Dedicated host (<code>available</code> |
     * <code>under-assessment</code> | <code>permanent-failure</code> |
     * <code>released</code> | <code>released-permanent-failure</code>).</li>
     * <li><p><code>availability-zone</code> - The Availability Zone of the
     * host. </li> </ul>
     *
     * @return One or more filters. <ul> <li><p><code>instance-type</code> - The
     *         instance type size that the Dedicated host is configured to
     *         support.</li> <li><p><code>auto-placement</code> - Whether
     *         auto-placement is enabled or disabled (<code>on</code> |
     *         <code>off</code>).</li> <li><p><code>host-reservation-id</code> - The
     *         ID of the reservation associated with this host.</li>
     *         <li><p><code>client-token</code> - The idempotency token you provided
     *         when you launched the instance</li> <li><p><code>state</code>- The
     *         allocation state of the Dedicated host (<code>available</code> |
     *         <code>under-assessment</code> | <code>permanent-failure</code> |
     *         <code>released</code> | <code>released-permanent-failure</code>).</li>
     *         <li><p><code>availability-zone</code> - The Availability Zone of the
     *         host. </li> </ul>
     */
    public java.util.List<Filter> getFilter() {
        if (filter == null) {
              filter = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filter.setAutoConstruct(true);
        }
        return filter;
    }
    
    /**
     * One or more filters. <ul> <li><p><code>instance-type</code> - The
     * instance type size that the Dedicated host is configured to
     * support.</li> <li><p><code>auto-placement</code> - Whether
     * auto-placement is enabled or disabled (<code>on</code> |
     * <code>off</code>).</li> <li><p><code>host-reservation-id</code> - The
     * ID of the reservation associated with this host.</li>
     * <li><p><code>client-token</code> - The idempotency token you provided
     * when you launched the instance</li> <li><p><code>state</code>- The
     * allocation state of the Dedicated host (<code>available</code> |
     * <code>under-assessment</code> | <code>permanent-failure</code> |
     * <code>released</code> | <code>released-permanent-failure</code>).</li>
     * <li><p><code>availability-zone</code> - The Availability Zone of the
     * host. </li> </ul>
     *
     * @param filter One or more filters. <ul> <li><p><code>instance-type</code> - The
     *         instance type size that the Dedicated host is configured to
     *         support.</li> <li><p><code>auto-placement</code> - Whether
     *         auto-placement is enabled or disabled (<code>on</code> |
     *         <code>off</code>).</li> <li><p><code>host-reservation-id</code> - The
     *         ID of the reservation associated with this host.</li>
     *         <li><p><code>client-token</code> - The idempotency token you provided
     *         when you launched the instance</li> <li><p><code>state</code>- The
     *         allocation state of the Dedicated host (<code>available</code> |
     *         <code>under-assessment</code> | <code>permanent-failure</code> |
     *         <code>released</code> | <code>released-permanent-failure</code>).</li>
     *         <li><p><code>availability-zone</code> - The Availability Zone of the
     *         host. </li> </ul>
     */
    public void setFilter(java.util.Collection<Filter> filter) {
        if (filter == null) {
            this.filter = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filterCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filter.size());
        filterCopy.addAll(filter);
        this.filter = filterCopy;
    }
    
    /**
     * One or more filters. <ul> <li><p><code>instance-type</code> - The
     * instance type size that the Dedicated host is configured to
     * support.</li> <li><p><code>auto-placement</code> - Whether
     * auto-placement is enabled or disabled (<code>on</code> |
     * <code>off</code>).</li> <li><p><code>host-reservation-id</code> - The
     * ID of the reservation associated with this host.</li>
     * <li><p><code>client-token</code> - The idempotency token you provided
     * when you launched the instance</li> <li><p><code>state</code>- The
     * allocation state of the Dedicated host (<code>available</code> |
     * <code>under-assessment</code> | <code>permanent-failure</code> |
     * <code>released</code> | <code>released-permanent-failure</code>).</li>
     * <li><p><code>availability-zone</code> - The Availability Zone of the
     * host. </li> </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setFilter(java.util.Collection)} or {@link
     * #withFilter(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filter One or more filters. <ul> <li><p><code>instance-type</code> - The
     *         instance type size that the Dedicated host is configured to
     *         support.</li> <li><p><code>auto-placement</code> - Whether
     *         auto-placement is enabled or disabled (<code>on</code> |
     *         <code>off</code>).</li> <li><p><code>host-reservation-id</code> - The
     *         ID of the reservation associated with this host.</li>
     *         <li><p><code>client-token</code> - The idempotency token you provided
     *         when you launched the instance</li> <li><p><code>state</code>- The
     *         allocation state of the Dedicated host (<code>available</code> |
     *         <code>under-assessment</code> | <code>permanent-failure</code> |
     *         <code>released</code> | <code>released-permanent-failure</code>).</li>
     *         <li><p><code>availability-zone</code> - The Availability Zone of the
     *         host. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHostsRequest withFilter(Filter... filter) {
        if (getFilter() == null) setFilter(new java.util.ArrayList<Filter>(filter.length));
        for (Filter value : filter) {
            getFilter().add(value);
        }
        return this;
    }
    
    /**
     * One or more filters. <ul> <li><p><code>instance-type</code> - The
     * instance type size that the Dedicated host is configured to
     * support.</li> <li><p><code>auto-placement</code> - Whether
     * auto-placement is enabled or disabled (<code>on</code> |
     * <code>off</code>).</li> <li><p><code>host-reservation-id</code> - The
     * ID of the reservation associated with this host.</li>
     * <li><p><code>client-token</code> - The idempotency token you provided
     * when you launched the instance</li> <li><p><code>state</code>- The
     * allocation state of the Dedicated host (<code>available</code> |
     * <code>under-assessment</code> | <code>permanent-failure</code> |
     * <code>released</code> | <code>released-permanent-failure</code>).</li>
     * <li><p><code>availability-zone</code> - The Availability Zone of the
     * host. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filter One or more filters. <ul> <li><p><code>instance-type</code> - The
     *         instance type size that the Dedicated host is configured to
     *         support.</li> <li><p><code>auto-placement</code> - Whether
     *         auto-placement is enabled or disabled (<code>on</code> |
     *         <code>off</code>).</li> <li><p><code>host-reservation-id</code> - The
     *         ID of the reservation associated with this host.</li>
     *         <li><p><code>client-token</code> - The idempotency token you provided
     *         when you launched the instance</li> <li><p><code>state</code>- The
     *         allocation state of the Dedicated host (<code>available</code> |
     *         <code>under-assessment</code> | <code>permanent-failure</code> |
     *         <code>released</code> | <code>released-permanent-failure</code>).</li>
     *         <li><p><code>availability-zone</code> - The Availability Zone of the
     *         host. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeHostsRequest withFilter(java.util.Collection<Filter> filter) {
        if (filter == null) {
            this.filter = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filterCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filter.size());
            filterCopy.addAll(filter);
            this.filter = filterCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getHostIds() != null) sb.append("HostIds: " + getHostIds() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() + ",");
        if (getFilter() != null) sb.append("Filter: " + getFilter() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getHostIds() == null) ? 0 : getHostIds().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode()); 
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeHostsRequest == false) return false;
        DescribeHostsRequest other = (DescribeHostsRequest)obj;
        
        if (other.getHostIds() == null ^ this.getHostIds() == null) return false;
        if (other.getHostIds() != null && other.getHostIds().equals(this.getHostIds()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false; 
        if (other.getFilter() == null ^ this.getFilter() == null) return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeHostsRequest clone() {
        
            return (DescribeHostsRequest) super.clone();
    }

}
    