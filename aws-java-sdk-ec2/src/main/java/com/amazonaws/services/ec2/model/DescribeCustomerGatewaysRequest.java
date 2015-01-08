/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.DescribeCustomerGatewaysRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeCustomerGateways(DescribeCustomerGatewaysRequest) DescribeCustomerGateways operation}.
 * <p>
 * Describes one or more of your VPN customer gateways.
 * </p>
 * <p>
 * For more information about VPN customer gateways, see
 * <a href="http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_VPN.html"> Adding a Hardware Virtual Private Gateway to Your VPC </a>
 * in the <i>Amazon Virtual Private Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeCustomerGateways(DescribeCustomerGatewaysRequest)
 */
public class DescribeCustomerGatewaysRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeCustomerGatewaysRequest> {

    /**
     * One or more customer gateway IDs. <p>Default: Describes all your
     * customer gateways.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> customerGatewayIds;

    /**
     * One or more filters. <ul> <li> <p><code>bgp-asn</code> - The customer
     * gateway's Border Gateway Protocol (BGP) Autonomous System Number
     * (ASN). </li> <li> <p><code>customer-gateway-id</code> - The ID of the
     * customer gateway. </li> <li> <p><code>ip-address</code> - The IP
     * address of the customer gateway's Internet-routable external
     * interface. </li> <li> <p><code>state</code> - The state of the
     * customer gateway (<code>pending</code> | <code>available</code> |
     * <code>deleting</code> | <code>deleted</code>). </li> <li>
     * <p><code>type</code> - The type of customer gateway. Currently, the
     * only supported type is <code>ipsec.1</code>. </li> <li>
     * <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     * combination of a tag assigned to the resource. </li> <li>
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
     * One or more customer gateway IDs. <p>Default: Describes all your
     * customer gateways.
     *
     * @return One or more customer gateway IDs. <p>Default: Describes all your
     *         customer gateways.
     */
    public java.util.List<String> getCustomerGatewayIds() {
        if (customerGatewayIds == null) {
              customerGatewayIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              customerGatewayIds.setAutoConstruct(true);
        }
        return customerGatewayIds;
    }
    
    /**
     * One or more customer gateway IDs. <p>Default: Describes all your
     * customer gateways.
     *
     * @param customerGatewayIds One or more customer gateway IDs. <p>Default: Describes all your
     *         customer gateways.
     */
    public void setCustomerGatewayIds(java.util.Collection<String> customerGatewayIds) {
        if (customerGatewayIds == null) {
            this.customerGatewayIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> customerGatewayIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(customerGatewayIds.size());
        customerGatewayIdsCopy.addAll(customerGatewayIds);
        this.customerGatewayIds = customerGatewayIdsCopy;
    }
    
    /**
     * One or more customer gateway IDs. <p>Default: Describes all your
     * customer gateways.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customerGatewayIds One or more customer gateway IDs. <p>Default: Describes all your
     *         customer gateways.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeCustomerGatewaysRequest withCustomerGatewayIds(String... customerGatewayIds) {
        if (getCustomerGatewayIds() == null) setCustomerGatewayIds(new java.util.ArrayList<String>(customerGatewayIds.length));
        for (String value : customerGatewayIds) {
            getCustomerGatewayIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more customer gateway IDs. <p>Default: Describes all your
     * customer gateways.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customerGatewayIds One or more customer gateway IDs. <p>Default: Describes all your
     *         customer gateways.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeCustomerGatewaysRequest withCustomerGatewayIds(java.util.Collection<String> customerGatewayIds) {
        if (customerGatewayIds == null) {
            this.customerGatewayIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> customerGatewayIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(customerGatewayIds.size());
            customerGatewayIdsCopy.addAll(customerGatewayIds);
            this.customerGatewayIds = customerGatewayIdsCopy;
        }

        return this;
    }

    /**
     * One or more filters. <ul> <li> <p><code>bgp-asn</code> - The customer
     * gateway's Border Gateway Protocol (BGP) Autonomous System Number
     * (ASN). </li> <li> <p><code>customer-gateway-id</code> - The ID of the
     * customer gateway. </li> <li> <p><code>ip-address</code> - The IP
     * address of the customer gateway's Internet-routable external
     * interface. </li> <li> <p><code>state</code> - The state of the
     * customer gateway (<code>pending</code> | <code>available</code> |
     * <code>deleting</code> | <code>deleted</code>). </li> <li>
     * <p><code>type</code> - The type of customer gateway. Currently, the
     * only supported type is <code>ipsec.1</code>. </li> <li>
     * <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     * combination of a tag assigned to the resource. </li> <li>
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
     * @return One or more filters. <ul> <li> <p><code>bgp-asn</code> - The customer
     *         gateway's Border Gateway Protocol (BGP) Autonomous System Number
     *         (ASN). </li> <li> <p><code>customer-gateway-id</code> - The ID of the
     *         customer gateway. </li> <li> <p><code>ip-address</code> - The IP
     *         address of the customer gateway's Internet-routable external
     *         interface. </li> <li> <p><code>state</code> - The state of the
     *         customer gateway (<code>pending</code> | <code>available</code> |
     *         <code>deleting</code> | <code>deleted</code>). </li> <li>
     *         <p><code>type</code> - The type of customer gateway. Currently, the
     *         only supported type is <code>ipsec.1</code>. </li> <li>
     *         <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     *         combination of a tag assigned to the resource. </li> <li>
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
     * One or more filters. <ul> <li> <p><code>bgp-asn</code> - The customer
     * gateway's Border Gateway Protocol (BGP) Autonomous System Number
     * (ASN). </li> <li> <p><code>customer-gateway-id</code> - The ID of the
     * customer gateway. </li> <li> <p><code>ip-address</code> - The IP
     * address of the customer gateway's Internet-routable external
     * interface. </li> <li> <p><code>state</code> - The state of the
     * customer gateway (<code>pending</code> | <code>available</code> |
     * <code>deleting</code> | <code>deleted</code>). </li> <li>
     * <p><code>type</code> - The type of customer gateway. Currently, the
     * only supported type is <code>ipsec.1</code>. </li> <li>
     * <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     * combination of a tag assigned to the resource. </li> <li>
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
     * @param filters One or more filters. <ul> <li> <p><code>bgp-asn</code> - The customer
     *         gateway's Border Gateway Protocol (BGP) Autonomous System Number
     *         (ASN). </li> <li> <p><code>customer-gateway-id</code> - The ID of the
     *         customer gateway. </li> <li> <p><code>ip-address</code> - The IP
     *         address of the customer gateway's Internet-routable external
     *         interface. </li> <li> <p><code>state</code> - The state of the
     *         customer gateway (<code>pending</code> | <code>available</code> |
     *         <code>deleting</code> | <code>deleted</code>). </li> <li>
     *         <p><code>type</code> - The type of customer gateway. Currently, the
     *         only supported type is <code>ipsec.1</code>. </li> <li>
     *         <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     *         combination of a tag assigned to the resource. </li> <li>
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
     * One or more filters. <ul> <li> <p><code>bgp-asn</code> - The customer
     * gateway's Border Gateway Protocol (BGP) Autonomous System Number
     * (ASN). </li> <li> <p><code>customer-gateway-id</code> - The ID of the
     * customer gateway. </li> <li> <p><code>ip-address</code> - The IP
     * address of the customer gateway's Internet-routable external
     * interface. </li> <li> <p><code>state</code> - The state of the
     * customer gateway (<code>pending</code> | <code>available</code> |
     * <code>deleting</code> | <code>deleted</code>). </li> <li>
     * <p><code>type</code> - The type of customer gateway. Currently, the
     * only supported type is <code>ipsec.1</code>. </li> <li>
     * <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     * combination of a tag assigned to the resource. </li> <li>
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
     * @param filters One or more filters. <ul> <li> <p><code>bgp-asn</code> - The customer
     *         gateway's Border Gateway Protocol (BGP) Autonomous System Number
     *         (ASN). </li> <li> <p><code>customer-gateway-id</code> - The ID of the
     *         customer gateway. </li> <li> <p><code>ip-address</code> - The IP
     *         address of the customer gateway's Internet-routable external
     *         interface. </li> <li> <p><code>state</code> - The state of the
     *         customer gateway (<code>pending</code> | <code>available</code> |
     *         <code>deleting</code> | <code>deleted</code>). </li> <li>
     *         <p><code>type</code> - The type of customer gateway. Currently, the
     *         only supported type is <code>ipsec.1</code>. </li> <li>
     *         <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     *         combination of a tag assigned to the resource. </li> <li>
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
    public DescribeCustomerGatewaysRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>bgp-asn</code> - The customer
     * gateway's Border Gateway Protocol (BGP) Autonomous System Number
     * (ASN). </li> <li> <p><code>customer-gateway-id</code> - The ID of the
     * customer gateway. </li> <li> <p><code>ip-address</code> - The IP
     * address of the customer gateway's Internet-routable external
     * interface. </li> <li> <p><code>state</code> - The state of the
     * customer gateway (<code>pending</code> | <code>available</code> |
     * <code>deleting</code> | <code>deleted</code>). </li> <li>
     * <p><code>type</code> - The type of customer gateway. Currently, the
     * only supported type is <code>ipsec.1</code>. </li> <li>
     * <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     * combination of a tag assigned to the resource. </li> <li>
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
     * @param filters One or more filters. <ul> <li> <p><code>bgp-asn</code> - The customer
     *         gateway's Border Gateway Protocol (BGP) Autonomous System Number
     *         (ASN). </li> <li> <p><code>customer-gateway-id</code> - The ID of the
     *         customer gateway. </li> <li> <p><code>ip-address</code> - The IP
     *         address of the customer gateway's Internet-routable external
     *         interface. </li> <li> <p><code>state</code> - The state of the
     *         customer gateway (<code>pending</code> | <code>available</code> |
     *         <code>deleting</code> | <code>deleted</code>). </li> <li>
     *         <p><code>type</code> - The type of customer gateway. Currently, the
     *         only supported type is <code>ipsec.1</code>. </li> <li>
     *         <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     *         combination of a tag assigned to the resource. </li> <li>
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
    public DescribeCustomerGatewaysRequest withFilters(java.util.Collection<Filter> filters) {
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
    public Request<DescribeCustomerGatewaysRequest> getDryRunRequest() {
        Request<DescribeCustomerGatewaysRequest> request = new DescribeCustomerGatewaysRequestMarshaller().marshall(this);
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
        if (getCustomerGatewayIds() != null) sb.append("CustomerGatewayIds: " + getCustomerGatewayIds() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCustomerGatewayIds() == null) ? 0 : getCustomerGatewayIds().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeCustomerGatewaysRequest == false) return false;
        DescribeCustomerGatewaysRequest other = (DescribeCustomerGatewaysRequest)obj;
        
        if (other.getCustomerGatewayIds() == null ^ this.getCustomerGatewayIds() == null) return false;
        if (other.getCustomerGatewayIds() != null && other.getCustomerGatewayIds().equals(this.getCustomerGatewayIds()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        return true;
    }
    
}
    