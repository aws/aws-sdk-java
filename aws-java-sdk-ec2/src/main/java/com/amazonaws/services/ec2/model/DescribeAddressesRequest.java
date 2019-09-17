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
import com.amazonaws.services.ec2.model.transform.DescribeAddressesRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAddressesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribeAddressesRequest> {

    /**
     * <p>
     * One or more filters. Filter names and values are case-sensitive.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>allocation-id</code> - [EC2-VPC] The allocation ID for the address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association-id</code> - [EC2-VPC] The association ID for the address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>domain</code> - Indicates whether the address is for use in EC2-Classic (<code>standard</code>) or in a VPC
     * (<code>vpc</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance the address is associated with, if any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-id</code> - [EC2-VPC] The ID of the network interface that the address is associated
     * with, if any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-owner-id</code> - The AWS account ID of the owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-ip-address</code> - [EC2-VPC] The private IP address associated with the Elastic IP address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>public-ip</code> - The Elastic IP address.
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
     * One or more Elastic IP addresses.
     * </p>
     * <p>
     * Default: Describes all your Elastic IP addresses.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> publicIps;
    /**
     * <p>
     * [EC2-VPC] Information about the allocation IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> allocationIds;

    /**
     * <p>
     * One or more filters. Filter names and values are case-sensitive.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>allocation-id</code> - [EC2-VPC] The allocation ID for the address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association-id</code> - [EC2-VPC] The association ID for the address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>domain</code> - Indicates whether the address is for use in EC2-Classic (<code>standard</code>) or in a VPC
     * (<code>vpc</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance the address is associated with, if any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-id</code> - [EC2-VPC] The ID of the network interface that the address is associated
     * with, if any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-owner-id</code> - The AWS account ID of the owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-ip-address</code> - [EC2-VPC] The private IP address associated with the Elastic IP address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>public-ip</code> - The Elastic IP address.
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
     * @return One or more filters. Filter names and values are case-sensitive.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>allocation-id</code> - [EC2-VPC] The allocation ID for the address.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>association-id</code> - [EC2-VPC] The association ID for the address.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>domain</code> - Indicates whether the address is for use in EC2-Classic (<code>standard</code>) or
     *         in a VPC (<code>vpc</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-id</code> - The ID of the instance the address is associated with, if any.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface-id</code> - [EC2-VPC] The ID of the network interface that the address is
     *         associated with, if any.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface-owner-id</code> - The AWS account ID of the owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>private-ip-address</code> - [EC2-VPC] The private IP address associated with the Elastic IP
     *         address.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>public-ip</code> - The Elastic IP address.
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
     * One or more filters. Filter names and values are case-sensitive.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>allocation-id</code> - [EC2-VPC] The allocation ID for the address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association-id</code> - [EC2-VPC] The association ID for the address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>domain</code> - Indicates whether the address is for use in EC2-Classic (<code>standard</code>) or in a VPC
     * (<code>vpc</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance the address is associated with, if any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-id</code> - [EC2-VPC] The ID of the network interface that the address is associated
     * with, if any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-owner-id</code> - The AWS account ID of the owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-ip-address</code> - [EC2-VPC] The private IP address associated with the Elastic IP address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>public-ip</code> - The Elastic IP address.
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
     *        One or more filters. Filter names and values are case-sensitive.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>allocation-id</code> - [EC2-VPC] The allocation ID for the address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>association-id</code> - [EC2-VPC] The association ID for the address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>domain</code> - Indicates whether the address is for use in EC2-Classic (<code>standard</code>) or
     *        in a VPC (<code>vpc</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-id</code> - The ID of the instance the address is associated with, if any.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface-id</code> - [EC2-VPC] The ID of the network interface that the address is
     *        associated with, if any.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface-owner-id</code> - The AWS account ID of the owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>private-ip-address</code> - [EC2-VPC] The private IP address associated with the Elastic IP address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>public-ip</code> - The Elastic IP address.
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
     * One or more filters. Filter names and values are case-sensitive.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>allocation-id</code> - [EC2-VPC] The allocation ID for the address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association-id</code> - [EC2-VPC] The association ID for the address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>domain</code> - Indicates whether the address is for use in EC2-Classic (<code>standard</code>) or in a VPC
     * (<code>vpc</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance the address is associated with, if any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-id</code> - [EC2-VPC] The ID of the network interface that the address is associated
     * with, if any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-owner-id</code> - The AWS account ID of the owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-ip-address</code> - [EC2-VPC] The private IP address associated with the Elastic IP address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>public-ip</code> - The Elastic IP address.
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
     *        One or more filters. Filter names and values are case-sensitive.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>allocation-id</code> - [EC2-VPC] The allocation ID for the address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>association-id</code> - [EC2-VPC] The association ID for the address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>domain</code> - Indicates whether the address is for use in EC2-Classic (<code>standard</code>) or
     *        in a VPC (<code>vpc</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-id</code> - The ID of the instance the address is associated with, if any.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface-id</code> - [EC2-VPC] The ID of the network interface that the address is
     *        associated with, if any.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface-owner-id</code> - The AWS account ID of the owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>private-ip-address</code> - [EC2-VPC] The private IP address associated with the Elastic IP address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>public-ip</code> - The Elastic IP address.
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

    public DescribeAddressesRequest withFilters(Filter... filters) {
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
     * One or more filters. Filter names and values are case-sensitive.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>allocation-id</code> - [EC2-VPC] The allocation ID for the address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association-id</code> - [EC2-VPC] The association ID for the address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>domain</code> - Indicates whether the address is for use in EC2-Classic (<code>standard</code>) or in a VPC
     * (<code>vpc</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance the address is associated with, if any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-id</code> - [EC2-VPC] The ID of the network interface that the address is associated
     * with, if any.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-owner-id</code> - The AWS account ID of the owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-ip-address</code> - [EC2-VPC] The private IP address associated with the Elastic IP address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>public-ip</code> - The Elastic IP address.
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
     *        One or more filters. Filter names and values are case-sensitive.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>allocation-id</code> - [EC2-VPC] The allocation ID for the address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>association-id</code> - [EC2-VPC] The association ID for the address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>domain</code> - Indicates whether the address is for use in EC2-Classic (<code>standard</code>) or
     *        in a VPC (<code>vpc</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-id</code> - The ID of the instance the address is associated with, if any.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface-id</code> - [EC2-VPC] The ID of the network interface that the address is
     *        associated with, if any.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface-owner-id</code> - The AWS account ID of the owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>private-ip-address</code> - [EC2-VPC] The private IP address associated with the Elastic IP address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>public-ip</code> - The Elastic IP address.
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

    public DescribeAddressesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * One or more Elastic IP addresses.
     * </p>
     * <p>
     * Default: Describes all your Elastic IP addresses.
     * </p>
     * 
     * @return One or more Elastic IP addresses.</p>
     *         <p>
     *         Default: Describes all your Elastic IP addresses.
     */

    public java.util.List<String> getPublicIps() {
        if (publicIps == null) {
            publicIps = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return publicIps;
    }

    /**
     * <p>
     * One or more Elastic IP addresses.
     * </p>
     * <p>
     * Default: Describes all your Elastic IP addresses.
     * </p>
     * 
     * @param publicIps
     *        One or more Elastic IP addresses.</p>
     *        <p>
     *        Default: Describes all your Elastic IP addresses.
     */

    public void setPublicIps(java.util.Collection<String> publicIps) {
        if (publicIps == null) {
            this.publicIps = null;
            return;
        }

        this.publicIps = new com.amazonaws.internal.SdkInternalList<String>(publicIps);
    }

    /**
     * <p>
     * One or more Elastic IP addresses.
     * </p>
     * <p>
     * Default: Describes all your Elastic IP addresses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPublicIps(java.util.Collection)} or {@link #withPublicIps(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param publicIps
     *        One or more Elastic IP addresses.</p>
     *        <p>
     *        Default: Describes all your Elastic IP addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAddressesRequest withPublicIps(String... publicIps) {
        if (this.publicIps == null) {
            setPublicIps(new com.amazonaws.internal.SdkInternalList<String>(publicIps.length));
        }
        for (String ele : publicIps) {
            this.publicIps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more Elastic IP addresses.
     * </p>
     * <p>
     * Default: Describes all your Elastic IP addresses.
     * </p>
     * 
     * @param publicIps
     *        One or more Elastic IP addresses.</p>
     *        <p>
     *        Default: Describes all your Elastic IP addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAddressesRequest withPublicIps(java.util.Collection<String> publicIps) {
        setPublicIps(publicIps);
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] Information about the allocation IDs.
     * </p>
     * 
     * @return [EC2-VPC] Information about the allocation IDs.
     */

    public java.util.List<String> getAllocationIds() {
        if (allocationIds == null) {
            allocationIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return allocationIds;
    }

    /**
     * <p>
     * [EC2-VPC] Information about the allocation IDs.
     * </p>
     * 
     * @param allocationIds
     *        [EC2-VPC] Information about the allocation IDs.
     */

    public void setAllocationIds(java.util.Collection<String> allocationIds) {
        if (allocationIds == null) {
            this.allocationIds = null;
            return;
        }

        this.allocationIds = new com.amazonaws.internal.SdkInternalList<String>(allocationIds);
    }

    /**
     * <p>
     * [EC2-VPC] Information about the allocation IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllocationIds(java.util.Collection)} or {@link #withAllocationIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param allocationIds
     *        [EC2-VPC] Information about the allocation IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAddressesRequest withAllocationIds(String... allocationIds) {
        if (this.allocationIds == null) {
            setAllocationIds(new com.amazonaws.internal.SdkInternalList<String>(allocationIds.length));
        }
        for (String ele : allocationIds) {
            this.allocationIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * [EC2-VPC] Information about the allocation IDs.
     * </p>
     * 
     * @param allocationIds
     *        [EC2-VPC] Information about the allocation IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAddressesRequest withAllocationIds(java.util.Collection<String> allocationIds) {
        setAllocationIds(allocationIds);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeAddressesRequest> getDryRunRequest() {
        Request<DescribeAddressesRequest> request = new DescribeAddressesRequestMarshaller().marshall(this);
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
        if (getPublicIps() != null)
            sb.append("PublicIps: ").append(getPublicIps()).append(",");
        if (getAllocationIds() != null)
            sb.append("AllocationIds: ").append(getAllocationIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAddressesRequest == false)
            return false;
        DescribeAddressesRequest other = (DescribeAddressesRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getPublicIps() == null ^ this.getPublicIps() == null)
            return false;
        if (other.getPublicIps() != null && other.getPublicIps().equals(this.getPublicIps()) == false)
            return false;
        if (other.getAllocationIds() == null ^ this.getAllocationIds() == null)
            return false;
        if (other.getAllocationIds() != null && other.getAllocationIds().equals(this.getAllocationIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getPublicIps() == null) ? 0 : getPublicIps().hashCode());
        hashCode = prime * hashCode + ((getAllocationIds() == null) ? 0 : getAllocationIds().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAddressesRequest clone() {
        return (DescribeAddressesRequest) super.clone();
    }
}
