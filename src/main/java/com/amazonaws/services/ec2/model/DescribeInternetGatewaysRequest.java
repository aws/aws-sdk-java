/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeInternetGatewaysRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeInternetGateways(DescribeInternetGatewaysRequest) DescribeInternetGateways operation}.
 * <p>
 * Describes one or more of your Internet gateways.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeInternetGateways(DescribeInternetGatewaysRequest)
 */
public class DescribeInternetGatewaysRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeInternetGatewaysRequest> {

    /**
     * One or more Internet gateway IDs. <p>Default: Describes all your
     * Internet gateways.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> internetGatewayIds;

    /**
     * One or more filters. <ul> <li> <p><code>attachment.state</code> - The
     * current state of the attachment between the gateway and the VPC.
     * Present only if a VPC is attached. </li> <li>
     * <p><code>attachment.vpc-id</code> - The ID of an attached VPC. </li>
     * <li> <p><code>internet-gateway-id</code> - The ID of the Internet
     * gateway. </li> <li> <p><code>tag</code>:<i>key</i>=<i>value</i> - The
     * key/value combination of a tag assigned to the resource. </li> <li>
     * <p><code>tag-key</code> - The key of a tag assigned to the resource.
     * This filter is independent of the <code>tag-value</code> filter. For
     * example, if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose
     * (regardless of what the tag's value is), and the tag value X
     * (regardless of what the tag's key is). If you want to list only
     * resources where Purpose is X, see the
     * <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     * <p><code>tag-value</code> - The value of a tag assigned to the
     * resource. This filter is independent of the <code>tag-key</code>
     * filter. </li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * One or more Internet gateway IDs. <p>Default: Describes all your
     * Internet gateways.
     *
     * @return One or more Internet gateway IDs. <p>Default: Describes all your
     *         Internet gateways.
     */
    public java.util.List<String> getInternetGatewayIds() {
        if (internetGatewayIds == null) {
              internetGatewayIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              internetGatewayIds.setAutoConstruct(true);
        }
        return internetGatewayIds;
    }
    
    /**
     * One or more Internet gateway IDs. <p>Default: Describes all your
     * Internet gateways.
     *
     * @param internetGatewayIds One or more Internet gateway IDs. <p>Default: Describes all your
     *         Internet gateways.
     */
    public void setInternetGatewayIds(java.util.Collection<String> internetGatewayIds) {
        if (internetGatewayIds == null) {
            this.internetGatewayIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> internetGatewayIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(internetGatewayIds.size());
        internetGatewayIdsCopy.addAll(internetGatewayIds);
        this.internetGatewayIds = internetGatewayIdsCopy;
    }
    
    /**
     * One or more Internet gateway IDs. <p>Default: Describes all your
     * Internet gateways.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param internetGatewayIds One or more Internet gateway IDs. <p>Default: Describes all your
     *         Internet gateways.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeInternetGatewaysRequest withInternetGatewayIds(String... internetGatewayIds) {
        if (getInternetGatewayIds() == null) setInternetGatewayIds(new java.util.ArrayList<String>(internetGatewayIds.length));
        for (String value : internetGatewayIds) {
            getInternetGatewayIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more Internet gateway IDs. <p>Default: Describes all your
     * Internet gateways.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param internetGatewayIds One or more Internet gateway IDs. <p>Default: Describes all your
     *         Internet gateways.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeInternetGatewaysRequest withInternetGatewayIds(java.util.Collection<String> internetGatewayIds) {
        if (internetGatewayIds == null) {
            this.internetGatewayIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> internetGatewayIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(internetGatewayIds.size());
            internetGatewayIdsCopy.addAll(internetGatewayIds);
            this.internetGatewayIds = internetGatewayIdsCopy;
        }

        return this;
    }

    /**
     * One or more filters. <ul> <li> <p><code>attachment.state</code> - The
     * current state of the attachment between the gateway and the VPC.
     * Present only if a VPC is attached. </li> <li>
     * <p><code>attachment.vpc-id</code> - The ID of an attached VPC. </li>
     * <li> <p><code>internet-gateway-id</code> - The ID of the Internet
     * gateway. </li> <li> <p><code>tag</code>:<i>key</i>=<i>value</i> - The
     * key/value combination of a tag assigned to the resource. </li> <li>
     * <p><code>tag-key</code> - The key of a tag assigned to the resource.
     * This filter is independent of the <code>tag-value</code> filter. For
     * example, if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose
     * (regardless of what the tag's value is), and the tag value X
     * (regardless of what the tag's key is). If you want to list only
     * resources where Purpose is X, see the
     * <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     * <p><code>tag-value</code> - The value of a tag assigned to the
     * resource. This filter is independent of the <code>tag-key</code>
     * filter. </li> </ul>
     *
     * @return One or more filters. <ul> <li> <p><code>attachment.state</code> - The
     *         current state of the attachment between the gateway and the VPC.
     *         Present only if a VPC is attached. </li> <li>
     *         <p><code>attachment.vpc-id</code> - The ID of an attached VPC. </li>
     *         <li> <p><code>internet-gateway-id</code> - The ID of the Internet
     *         gateway. </li> <li> <p><code>tag</code>:<i>key</i>=<i>value</i> - The
     *         key/value combination of a tag assigned to the resource. </li> <li>
     *         <p><code>tag-key</code> - The key of a tag assigned to the resource.
     *         This filter is independent of the <code>tag-value</code> filter. For
     *         example, if you use both the filter "tag-key=Purpose" and the filter
     *         "tag-value=X", you get any resources assigned both the tag key Purpose
     *         (regardless of what the tag's value is), and the tag value X
     *         (regardless of what the tag's key is). If you want to list only
     *         resources where Purpose is X, see the
     *         <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     *         <p><code>tag-value</code> - The value of a tag assigned to the
     *         resource. This filter is independent of the <code>tag-key</code>
     *         filter. </li> </ul>
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>attachment.state</code> - The
     * current state of the attachment between the gateway and the VPC.
     * Present only if a VPC is attached. </li> <li>
     * <p><code>attachment.vpc-id</code> - The ID of an attached VPC. </li>
     * <li> <p><code>internet-gateway-id</code> - The ID of the Internet
     * gateway. </li> <li> <p><code>tag</code>:<i>key</i>=<i>value</i> - The
     * key/value combination of a tag assigned to the resource. </li> <li>
     * <p><code>tag-key</code> - The key of a tag assigned to the resource.
     * This filter is independent of the <code>tag-value</code> filter. For
     * example, if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose
     * (regardless of what the tag's value is), and the tag value X
     * (regardless of what the tag's key is). If you want to list only
     * resources where Purpose is X, see the
     * <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     * <p><code>tag-value</code> - The value of a tag assigned to the
     * resource. This filter is independent of the <code>tag-key</code>
     * filter. </li> </ul>
     *
     * @param filters One or more filters. <ul> <li> <p><code>attachment.state</code> - The
     *         current state of the attachment between the gateway and the VPC.
     *         Present only if a VPC is attached. </li> <li>
     *         <p><code>attachment.vpc-id</code> - The ID of an attached VPC. </li>
     *         <li> <p><code>internet-gateway-id</code> - The ID of the Internet
     *         gateway. </li> <li> <p><code>tag</code>:<i>key</i>=<i>value</i> - The
     *         key/value combination of a tag assigned to the resource. </li> <li>
     *         <p><code>tag-key</code> - The key of a tag assigned to the resource.
     *         This filter is independent of the <code>tag-value</code> filter. For
     *         example, if you use both the filter "tag-key=Purpose" and the filter
     *         "tag-value=X", you get any resources assigned both the tag key Purpose
     *         (regardless of what the tag's value is), and the tag value X
     *         (regardless of what the tag's key is). If you want to list only
     *         resources where Purpose is X, see the
     *         <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     *         <p><code>tag-value</code> - The value of a tag assigned to the
     *         resource. This filter is independent of the <code>tag-key</code>
     *         filter. </li> </ul>
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
        filtersCopy.addAll(filters);
        this.filters = filtersCopy;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>attachment.state</code> - The
     * current state of the attachment between the gateway and the VPC.
     * Present only if a VPC is attached. </li> <li>
     * <p><code>attachment.vpc-id</code> - The ID of an attached VPC. </li>
     * <li> <p><code>internet-gateway-id</code> - The ID of the Internet
     * gateway. </li> <li> <p><code>tag</code>:<i>key</i>=<i>value</i> - The
     * key/value combination of a tag assigned to the resource. </li> <li>
     * <p><code>tag-key</code> - The key of a tag assigned to the resource.
     * This filter is independent of the <code>tag-value</code> filter. For
     * example, if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose
     * (regardless of what the tag's value is), and the tag value X
     * (regardless of what the tag's key is). If you want to list only
     * resources where Purpose is X, see the
     * <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     * <p><code>tag-value</code> - The value of a tag assigned to the
     * resource. This filter is independent of the <code>tag-key</code>
     * filter. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>attachment.state</code> - The
     *         current state of the attachment between the gateway and the VPC.
     *         Present only if a VPC is attached. </li> <li>
     *         <p><code>attachment.vpc-id</code> - The ID of an attached VPC. </li>
     *         <li> <p><code>internet-gateway-id</code> - The ID of the Internet
     *         gateway. </li> <li> <p><code>tag</code>:<i>key</i>=<i>value</i> - The
     *         key/value combination of a tag assigned to the resource. </li> <li>
     *         <p><code>tag-key</code> - The key of a tag assigned to the resource.
     *         This filter is independent of the <code>tag-value</code> filter. For
     *         example, if you use both the filter "tag-key=Purpose" and the filter
     *         "tag-value=X", you get any resources assigned both the tag key Purpose
     *         (regardless of what the tag's value is), and the tag value X
     *         (regardless of what the tag's key is). If you want to list only
     *         resources where Purpose is X, see the
     *         <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     *         <p><code>tag-value</code> - The value of a tag assigned to the
     *         resource. This filter is independent of the <code>tag-key</code>
     *         filter. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeInternetGatewaysRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>attachment.state</code> - The
     * current state of the attachment between the gateway and the VPC.
     * Present only if a VPC is attached. </li> <li>
     * <p><code>attachment.vpc-id</code> - The ID of an attached VPC. </li>
     * <li> <p><code>internet-gateway-id</code> - The ID of the Internet
     * gateway. </li> <li> <p><code>tag</code>:<i>key</i>=<i>value</i> - The
     * key/value combination of a tag assigned to the resource. </li> <li>
     * <p><code>tag-key</code> - The key of a tag assigned to the resource.
     * This filter is independent of the <code>tag-value</code> filter. For
     * example, if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose
     * (regardless of what the tag's value is), and the tag value X
     * (regardless of what the tag's key is). If you want to list only
     * resources where Purpose is X, see the
     * <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     * <p><code>tag-value</code> - The value of a tag assigned to the
     * resource. This filter is independent of the <code>tag-key</code>
     * filter. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>attachment.state</code> - The
     *         current state of the attachment between the gateway and the VPC.
     *         Present only if a VPC is attached. </li> <li>
     *         <p><code>attachment.vpc-id</code> - The ID of an attached VPC. </li>
     *         <li> <p><code>internet-gateway-id</code> - The ID of the Internet
     *         gateway. </li> <li> <p><code>tag</code>:<i>key</i>=<i>value</i> - The
     *         key/value combination of a tag assigned to the resource. </li> <li>
     *         <p><code>tag-key</code> - The key of a tag assigned to the resource.
     *         This filter is independent of the <code>tag-value</code> filter. For
     *         example, if you use both the filter "tag-key=Purpose" and the filter
     *         "tag-value=X", you get any resources assigned both the tag key Purpose
     *         (regardless of what the tag's value is), and the tag value X
     *         (regardless of what the tag's key is). If you want to list only
     *         resources where Purpose is X, see the
     *         <code>tag</code>:<i>key</i>=<i>value</i> filter. </li> <li>
     *         <p><code>tag-value</code> - The value of a tag assigned to the
     *         resource. This filter is independent of the <code>tag-key</code>
     *         filter. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeInternetGatewaysRequest withFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
            filtersCopy.addAll(filters);
            this.filters = filtersCopy;
        }

        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeInternetGatewaysRequest> getDryRunRequest() {
        Request<DescribeInternetGatewaysRequest> request = new DescribeInternetGatewaysRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getInternetGatewayIds() != null) sb.append("InternetGatewayIds: " + getInternetGatewayIds() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInternetGatewayIds() == null) ? 0 : getInternetGatewayIds().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeInternetGatewaysRequest == false) return false;
        DescribeInternetGatewaysRequest other = (DescribeInternetGatewaysRequest)obj;
        
        if (other.getInternetGatewayIds() == null ^ this.getInternetGatewayIds() == null) return false;
        if (other.getInternetGatewayIds() != null && other.getInternetGatewayIds().equals(this.getInternetGatewayIds()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        return true;
    }
    
}
    