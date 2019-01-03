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
import com.amazonaws.services.ec2.model.transform.DescribeCustomerGatewaysRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DescribeCustomerGateways.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCustomerGatewaysRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeCustomerGatewaysRequest> {

    /**
     * <p>
     * One or more customer gateway IDs.
     * </p>
     * <p>
     * Default: Describes all your customer gateways.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> customerGatewayIds;
    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>bgp-asn</code> - The customer gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>customer-gateway-id</code> - The ID of the customer gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-address</code> - The IP address of the customer gateway's Internet-routable external interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the customer gateway (<code>pending</code> | <code>available</code> |
     * <code>deleting</code> | <code>deleted</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code> - The type of customer gateway. Currently, the only supported type is <code>ipsec.1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in
     * the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     * and <code>TeamA</code> for the filter value.
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
    private com.amazonaws.internal.SdkInternalList<Filter> filters;

    /**
     * <p>
     * One or more customer gateway IDs.
     * </p>
     * <p>
     * Default: Describes all your customer gateways.
     * </p>
     * 
     * @return One or more customer gateway IDs.</p>
     *         <p>
     *         Default: Describes all your customer gateways.
     */

    public java.util.List<String> getCustomerGatewayIds() {
        if (customerGatewayIds == null) {
            customerGatewayIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return customerGatewayIds;
    }

    /**
     * <p>
     * One or more customer gateway IDs.
     * </p>
     * <p>
     * Default: Describes all your customer gateways.
     * </p>
     * 
     * @param customerGatewayIds
     *        One or more customer gateway IDs.</p>
     *        <p>
     *        Default: Describes all your customer gateways.
     */

    public void setCustomerGatewayIds(java.util.Collection<String> customerGatewayIds) {
        if (customerGatewayIds == null) {
            this.customerGatewayIds = null;
            return;
        }

        this.customerGatewayIds = new com.amazonaws.internal.SdkInternalList<String>(customerGatewayIds);
    }

    /**
     * <p>
     * One or more customer gateway IDs.
     * </p>
     * <p>
     * Default: Describes all your customer gateways.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomerGatewayIds(java.util.Collection)} or {@link #withCustomerGatewayIds(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param customerGatewayIds
     *        One or more customer gateway IDs.</p>
     *        <p>
     *        Default: Describes all your customer gateways.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCustomerGatewaysRequest withCustomerGatewayIds(String... customerGatewayIds) {
        if (this.customerGatewayIds == null) {
            setCustomerGatewayIds(new com.amazonaws.internal.SdkInternalList<String>(customerGatewayIds.length));
        }
        for (String ele : customerGatewayIds) {
            this.customerGatewayIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more customer gateway IDs.
     * </p>
     * <p>
     * Default: Describes all your customer gateways.
     * </p>
     * 
     * @param customerGatewayIds
     *        One or more customer gateway IDs.</p>
     *        <p>
     *        Default: Describes all your customer gateways.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCustomerGatewaysRequest withCustomerGatewayIds(java.util.Collection<String> customerGatewayIds) {
        setCustomerGatewayIds(customerGatewayIds);
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>bgp-asn</code> - The customer gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>customer-gateway-id</code> - The ID of the customer gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-address</code> - The IP address of the customer gateway's Internet-routable external interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the customer gateway (<code>pending</code> | <code>available</code> |
     * <code>deleting</code> | <code>deleted</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code> - The type of customer gateway. Currently, the only supported type is <code>ipsec.1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in
     * the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     * and <code>TeamA</code> for the filter value.
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
     *         <code>bgp-asn</code> - The customer gateway's Border Gateway Protocol (BGP) Autonomous System Number
     *         (ASN).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>customer-gateway-id</code> - The ID of the customer gateway.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ip-address</code> - The IP address of the customer gateway's Internet-routable external interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state</code> - The state of the customer gateway (<code>pending</code> | <code>available</code> |
     *         <code>deleting</code> | <code>deleted</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>type</code> - The type of customer gateway. Currently, the only supported type is
     *         <code>ipsec.1</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag
     *         key in the filter name and the tag value as the filter value. For example, to find all resources that
     *         have a tag with the key <code>Owner</code> and the value <code>TeamA</code>, specify
     *         <code>tag:Owner</code> for the filter name and <code>TeamA</code> for the filter value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources
     *         assigned a tag with a specific key, regardless of the tag value.
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
     * <code>bgp-asn</code> - The customer gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>customer-gateway-id</code> - The ID of the customer gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-address</code> - The IP address of the customer gateway's Internet-routable external interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the customer gateway (<code>pending</code> | <code>available</code> |
     * <code>deleting</code> | <code>deleted</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code> - The type of customer gateway. Currently, the only supported type is <code>ipsec.1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in
     * the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     * and <code>TeamA</code> for the filter value.
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
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>bgp-asn</code> - The customer gateway's Border Gateway Protocol (BGP) Autonomous System Number
     *        (ASN).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>customer-gateway-id</code> - The ID of the customer gateway.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ip-address</code> - The IP address of the customer gateway's Internet-routable external interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the customer gateway (<code>pending</code> | <code>available</code> |
     *        <code>deleting</code> | <code>deleted</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>type</code> - The type of customer gateway. Currently, the only supported type is
     *        <code>ipsec.1</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag
     *        key in the filter name and the tag value as the filter value. For example, to find all resources that have
     *        a tag with the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for
     *        the filter name and <code>TeamA</code> for the filter value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource. Use this filter to find all resources
     *        assigned a tag with a specific key, regardless of the tag value.
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
     * <code>bgp-asn</code> - The customer gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>customer-gateway-id</code> - The ID of the customer gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-address</code> - The IP address of the customer gateway's Internet-routable external interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the customer gateway (<code>pending</code> | <code>available</code> |
     * <code>deleting</code> | <code>deleted</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code> - The type of customer gateway. Currently, the only supported type is <code>ipsec.1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in
     * the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     * and <code>TeamA</code> for the filter value.
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
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>bgp-asn</code> - The customer gateway's Border Gateway Protocol (BGP) Autonomous System Number
     *        (ASN).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>customer-gateway-id</code> - The ID of the customer gateway.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ip-address</code> - The IP address of the customer gateway's Internet-routable external interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the customer gateway (<code>pending</code> | <code>available</code> |
     *        <code>deleting</code> | <code>deleted</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>type</code> - The type of customer gateway. Currently, the only supported type is
     *        <code>ipsec.1</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag
     *        key in the filter name and the tag value as the filter value. For example, to find all resources that have
     *        a tag with the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for
     *        the filter name and <code>TeamA</code> for the filter value.
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

    public DescribeCustomerGatewaysRequest withFilters(Filter... filters) {
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
     * <code>bgp-asn</code> - The customer gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>customer-gateway-id</code> - The ID of the customer gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ip-address</code> - The IP address of the customer gateway's Internet-routable external interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the customer gateway (<code>pending</code> | <code>available</code> |
     * <code>deleting</code> | <code>deleted</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code> - The type of customer gateway. Currently, the only supported type is <code>ipsec.1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in
     * the filter name and the tag value as the filter value. For example, to find all resources that have a tag with
     * the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for the filter name
     * and <code>TeamA</code> for the filter value.
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
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>bgp-asn</code> - The customer gateway's Border Gateway Protocol (BGP) Autonomous System Number
     *        (ASN).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>customer-gateway-id</code> - The ID of the customer gateway.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ip-address</code> - The IP address of the customer gateway's Internet-routable external interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the customer gateway (<code>pending</code> | <code>available</code> |
     *        <code>deleting</code> | <code>deleted</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>type</code> - The type of customer gateway. Currently, the only supported type is
     *        <code>ipsec.1</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag
     *        key in the filter name and the tag value as the filter value. For example, to find all resources that have
     *        a tag with the key <code>Owner</code> and the value <code>TeamA</code>, specify <code>tag:Owner</code> for
     *        the filter name and <code>TeamA</code> for the filter value.
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

    public DescribeCustomerGatewaysRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeCustomerGatewaysRequest> getDryRunRequest() {
        Request<DescribeCustomerGatewaysRequest> request = new DescribeCustomerGatewaysRequestMarshaller().marshall(this);
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
        if (getCustomerGatewayIds() != null)
            sb.append("CustomerGatewayIds: ").append(getCustomerGatewayIds()).append(",");
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

        if (obj instanceof DescribeCustomerGatewaysRequest == false)
            return false;
        DescribeCustomerGatewaysRequest other = (DescribeCustomerGatewaysRequest) obj;
        if (other.getCustomerGatewayIds() == null ^ this.getCustomerGatewayIds() == null)
            return false;
        if (other.getCustomerGatewayIds() != null && other.getCustomerGatewayIds().equals(this.getCustomerGatewayIds()) == false)
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

        hashCode = prime * hashCode + ((getCustomerGatewayIds() == null) ? 0 : getCustomerGatewayIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCustomerGatewaysRequest clone() {
        return (DescribeCustomerGatewaysRequest) super.clone();
    }
}
