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
import com.amazonaws.services.ec2.model.transform.DescribeTagsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTagsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribeTagsRequest> {

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>key</code> - The tag key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resource-id</code> - The ID of the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resource-type</code> - The resource type (<code>customer-gateway</code> | <code>dedicated-host</code> |
     * <code>dhcp-options</code> | <code>elastic-ip</code> | <code>fleet</code> | <code>fpga-image</code> |
     * <code>image</code> | <code>instance</code> | <code>host-reservation</code> | <code>internet-gateway</code> |
     * <code>launch-template</code> | <code>natgateway</code> | <code>network-acl</code> |
     * <code>network-interface</code> | <code>reserved-instances</code> | <code>route-table</code> |
     * <code>security-group</code> | <code>snapshot</code> | <code>spot-instances-request</code> | <code>subnet</code> |
     * <code>volume</code> | <code>vpc</code> | <code>vpc-peering-connection</code> | <code>vpn-connection</code> |
     * <code>vpn-gateway</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of the tag. For example, specify "tag:Owner" for the
     * filter name and "TeamA" for the filter value to find resources with the tag "Owner=TeamA".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>value</code> - The tag value.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The maximum number of results to return in a single call. This value can be between 5 and 1000. To retrieve the
     * remaining results, make another call with the returned <code>NextToken</code> value.
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
     * Default constructor for DescribeTagsRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public DescribeTagsRequest() {
    }

    /**
     * Constructs a new DescribeTagsRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>key</code> - The tag key.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>resource-id</code> - The ID of the resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>resource-type</code> - The resource type (<code>customer-gateway</code> |
     *        <code>dedicated-host</code> | <code>dhcp-options</code> | <code>elastic-ip</code> | <code>fleet</code> |
     *        <code>fpga-image</code> | <code>image</code> | <code>instance</code> | <code>host-reservation</code> |
     *        <code>internet-gateway</code> | <code>launch-template</code> | <code>natgateway</code> |
     *        <code>network-acl</code> | <code>network-interface</code> | <code>reserved-instances</code> |
     *        <code>route-table</code> | <code>security-group</code> | <code>snapshot</code> |
     *        <code>spot-instances-request</code> | <code>subnet</code> | <code>volume</code> | <code>vpc</code> |
     *        <code>vpc-peering-connection</code> | <code>vpn-connection</code> | <code>vpn-gateway</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:&lt;key&gt; - The key/value combination of the tag. For example, specify "tag:Owner" for
     *        the filter name and "TeamA" for the filter value to find resources with the tag "Owner=TeamA".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>value</code> - The tag value.
     *        </p>
     *        </li>
     */
    public DescribeTagsRequest(java.util.List<Filter> filters) {
        setFilters(filters);
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>key</code> - The tag key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resource-id</code> - The ID of the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resource-type</code> - The resource type (<code>customer-gateway</code> | <code>dedicated-host</code> |
     * <code>dhcp-options</code> | <code>elastic-ip</code> | <code>fleet</code> | <code>fpga-image</code> |
     * <code>image</code> | <code>instance</code> | <code>host-reservation</code> | <code>internet-gateway</code> |
     * <code>launch-template</code> | <code>natgateway</code> | <code>network-acl</code> |
     * <code>network-interface</code> | <code>reserved-instances</code> | <code>route-table</code> |
     * <code>security-group</code> | <code>snapshot</code> | <code>spot-instances-request</code> | <code>subnet</code> |
     * <code>volume</code> | <code>vpc</code> | <code>vpc-peering-connection</code> | <code>vpn-connection</code> |
     * <code>vpn-gateway</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of the tag. For example, specify "tag:Owner" for the
     * filter name and "TeamA" for the filter value to find resources with the tag "Owner=TeamA".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>value</code> - The tag value.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>key</code> - The tag key.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>resource-id</code> - The ID of the resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>resource-type</code> - The resource type (<code>customer-gateway</code> |
     *         <code>dedicated-host</code> | <code>dhcp-options</code> | <code>elastic-ip</code> | <code>fleet</code> |
     *         <code>fpga-image</code> | <code>image</code> | <code>instance</code> | <code>host-reservation</code> |
     *         <code>internet-gateway</code> | <code>launch-template</code> | <code>natgateway</code> |
     *         <code>network-acl</code> | <code>network-interface</code> | <code>reserved-instances</code> |
     *         <code>route-table</code> | <code>security-group</code> | <code>snapshot</code> |
     *         <code>spot-instances-request</code> | <code>subnet</code> | <code>volume</code> | <code>vpc</code> |
     *         <code>vpc-peering-connection</code> | <code>vpn-connection</code> | <code>vpn-gateway</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag</code>:&lt;key&gt; - The key/value combination of the tag. For example, specify "tag:Owner" for
     *         the filter name and "TeamA" for the filter value to find resources with the tag "Owner=TeamA".
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>value</code> - The tag value.
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
     * <code>key</code> - The tag key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resource-id</code> - The ID of the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resource-type</code> - The resource type (<code>customer-gateway</code> | <code>dedicated-host</code> |
     * <code>dhcp-options</code> | <code>elastic-ip</code> | <code>fleet</code> | <code>fpga-image</code> |
     * <code>image</code> | <code>instance</code> | <code>host-reservation</code> | <code>internet-gateway</code> |
     * <code>launch-template</code> | <code>natgateway</code> | <code>network-acl</code> |
     * <code>network-interface</code> | <code>reserved-instances</code> | <code>route-table</code> |
     * <code>security-group</code> | <code>snapshot</code> | <code>spot-instances-request</code> | <code>subnet</code> |
     * <code>volume</code> | <code>vpc</code> | <code>vpc-peering-connection</code> | <code>vpn-connection</code> |
     * <code>vpn-gateway</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of the tag. For example, specify "tag:Owner" for the
     * filter name and "TeamA" for the filter value to find resources with the tag "Owner=TeamA".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>value</code> - The tag value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>key</code> - The tag key.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>resource-id</code> - The ID of the resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>resource-type</code> - The resource type (<code>customer-gateway</code> |
     *        <code>dedicated-host</code> | <code>dhcp-options</code> | <code>elastic-ip</code> | <code>fleet</code> |
     *        <code>fpga-image</code> | <code>image</code> | <code>instance</code> | <code>host-reservation</code> |
     *        <code>internet-gateway</code> | <code>launch-template</code> | <code>natgateway</code> |
     *        <code>network-acl</code> | <code>network-interface</code> | <code>reserved-instances</code> |
     *        <code>route-table</code> | <code>security-group</code> | <code>snapshot</code> |
     *        <code>spot-instances-request</code> | <code>subnet</code> | <code>volume</code> | <code>vpc</code> |
     *        <code>vpc-peering-connection</code> | <code>vpn-connection</code> | <code>vpn-gateway</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:&lt;key&gt; - The key/value combination of the tag. For example, specify "tag:Owner" for
     *        the filter name and "TeamA" for the filter value to find resources with the tag "Owner=TeamA".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>value</code> - The tag value.
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
     * <code>key</code> - The tag key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resource-id</code> - The ID of the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resource-type</code> - The resource type (<code>customer-gateway</code> | <code>dedicated-host</code> |
     * <code>dhcp-options</code> | <code>elastic-ip</code> | <code>fleet</code> | <code>fpga-image</code> |
     * <code>image</code> | <code>instance</code> | <code>host-reservation</code> | <code>internet-gateway</code> |
     * <code>launch-template</code> | <code>natgateway</code> | <code>network-acl</code> |
     * <code>network-interface</code> | <code>reserved-instances</code> | <code>route-table</code> |
     * <code>security-group</code> | <code>snapshot</code> | <code>spot-instances-request</code> | <code>subnet</code> |
     * <code>volume</code> | <code>vpc</code> | <code>vpc-peering-connection</code> | <code>vpn-connection</code> |
     * <code>vpn-gateway</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of the tag. For example, specify "tag:Owner" for the
     * filter name and "TeamA" for the filter value to find resources with the tag "Owner=TeamA".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>value</code> - The tag value.
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
     *        <code>key</code> - The tag key.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>resource-id</code> - The ID of the resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>resource-type</code> - The resource type (<code>customer-gateway</code> |
     *        <code>dedicated-host</code> | <code>dhcp-options</code> | <code>elastic-ip</code> | <code>fleet</code> |
     *        <code>fpga-image</code> | <code>image</code> | <code>instance</code> | <code>host-reservation</code> |
     *        <code>internet-gateway</code> | <code>launch-template</code> | <code>natgateway</code> |
     *        <code>network-acl</code> | <code>network-interface</code> | <code>reserved-instances</code> |
     *        <code>route-table</code> | <code>security-group</code> | <code>snapshot</code> |
     *        <code>spot-instances-request</code> | <code>subnet</code> | <code>volume</code> | <code>vpc</code> |
     *        <code>vpc-peering-connection</code> | <code>vpn-connection</code> | <code>vpn-gateway</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:&lt;key&gt; - The key/value combination of the tag. For example, specify "tag:Owner" for
     *        the filter name and "TeamA" for the filter value to find resources with the tag "Owner=TeamA".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>value</code> - The tag value.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTagsRequest withFilters(Filter... filters) {
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
     * <code>key</code> - The tag key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resource-id</code> - The ID of the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resource-type</code> - The resource type (<code>customer-gateway</code> | <code>dedicated-host</code> |
     * <code>dhcp-options</code> | <code>elastic-ip</code> | <code>fleet</code> | <code>fpga-image</code> |
     * <code>image</code> | <code>instance</code> | <code>host-reservation</code> | <code>internet-gateway</code> |
     * <code>launch-template</code> | <code>natgateway</code> | <code>network-acl</code> |
     * <code>network-interface</code> | <code>reserved-instances</code> | <code>route-table</code> |
     * <code>security-group</code> | <code>snapshot</code> | <code>spot-instances-request</code> | <code>subnet</code> |
     * <code>volume</code> | <code>vpc</code> | <code>vpc-peering-connection</code> | <code>vpn-connection</code> |
     * <code>vpn-gateway</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of the tag. For example, specify "tag:Owner" for the
     * filter name and "TeamA" for the filter value to find resources with the tag "Owner=TeamA".
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>value</code> - The tag value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>key</code> - The tag key.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>resource-id</code> - The ID of the resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>resource-type</code> - The resource type (<code>customer-gateway</code> |
     *        <code>dedicated-host</code> | <code>dhcp-options</code> | <code>elastic-ip</code> | <code>fleet</code> |
     *        <code>fpga-image</code> | <code>image</code> | <code>instance</code> | <code>host-reservation</code> |
     *        <code>internet-gateway</code> | <code>launch-template</code> | <code>natgateway</code> |
     *        <code>network-acl</code> | <code>network-interface</code> | <code>reserved-instances</code> |
     *        <code>route-table</code> | <code>security-group</code> | <code>snapshot</code> |
     *        <code>spot-instances-request</code> | <code>subnet</code> | <code>volume</code> | <code>vpc</code> |
     *        <code>vpc-peering-connection</code> | <code>vpn-connection</code> | <code>vpn-gateway</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:&lt;key&gt; - The key/value combination of the tag. For example, specify "tag:Owner" for
     *        the filter name and "TeamA" for the filter value to find resources with the tag "Owner=TeamA".
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>value</code> - The tag value.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTagsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. This value can be between 5 and 1000. To retrieve the
     * remaining results, make another call with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. This value can be between 5 and 1000. To
     *        retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. This value can be between 5 and 1000. To retrieve the
     * remaining results, make another call with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @return The maximum number of results to return in a single call. This value can be between 5 and 1000. To
     *         retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. This value can be between 5 and 1000. To retrieve the
     * remaining results, make another call with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. This value can be between 5 and 1000. To
     *        retrieve the remaining results, make another call with the returned <code>NextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeTagsRequest withMaxResults(Integer maxResults) {
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

    public DescribeTagsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeTagsRequest> getDryRunRequest() {
        Request<DescribeTagsRequest> request = new DescribeTagsRequestMarshaller().marshall(this);
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

        if (obj instanceof DescribeTagsRequest == false)
            return false;
        DescribeTagsRequest other = (DescribeTagsRequest) obj;
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

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTagsRequest clone() {
        return (DescribeTagsRequest) super.clone();
    }
}
