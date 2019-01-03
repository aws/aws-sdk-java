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
import com.amazonaws.services.ec2.model.transform.DescribeNetworkInterfacesRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DescribeNetworkInterfaces.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeNetworkInterfacesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeNetworkInterfacesRequest> {

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>addresses.private-ip-address</code> - The private IPv4 addresses associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>addresses.primary</code> - Whether the private IPv4 address is the primary IP address associated with the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>addresses.association.public-ip</code> - The association ID returned when the network interface was
     * associated with the Elastic IP address (IPv4).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>addresses.association.owner-id</code> - The owner ID of the addresses associated with the network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.association-id</code> - The association ID returned when the network interface was associated
     * with an IPv4 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.allocation-id</code> - The allocation ID returned when you allocated the Elastic IP address
     * (IPv4) for your network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.ip-owner-id</code> - The owner of the Elastic IP address (IPv4) associated with the network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.public-ip</code> - The address of the Elastic IP address (IPv4) bound to the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.public-dns-name</code> - The public DNS name for the network interface (IPv4).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.attachment-id</code> - The ID of the interface attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.attach.time</code> - The time that the network interface was attached to an instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.delete-on-termination</code> - Indicates whether the attachment is deleted when an instance is
     * terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.device-index</code> - The device index to which the network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.instance-id</code> - The ID of the instance to which the network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.instance-owner-id</code> - The owner ID of the instance to which the network interface is
     * attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.nat-gateway-id</code> - The ID of the NAT gateway to which the network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.status</code> - The status of the attachment (<code>attaching</code> | <code>attached</code> |
     * <code>detaching</code> | <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>description</code> - The description of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-id</code> - The ID of a security group associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-name</code> - The name of a security group associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-addresses.ipv6-address</code> - An IPv6 address associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mac-address</code> - The MAC address of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-id</code> - The ID of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The AWS account ID of the network interface owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-ip-address</code> - The private IPv4 address or addresses of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-dns-name</code> - The private DNS name of the network interface (IPv4).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-id</code> - The ID of the entity that launched the instance on your behalf (for example, AWS
     * Management Console, Auto Scaling, and so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-managed</code> - Indicates whether the network interface is being managed by an AWS service (for
     * example, AWS Management Console, Auto Scaling, and so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>source-desk-check</code> - Indicates whether the network interface performs source/destination checking. A
     * value of <code>true</code> means checking is enabled, and <code>false</code> means checking is disabled. The
     * value must be <code>false</code> for the network interface to perform network address translation (NAT) in your
     * VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the network interface. If the network interface is not attached to an
     * instance, the status is <code>available</code>; if a network interface is attached to an instance the status is
     * <code>in-use</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-id</code> - The ID of the subnet for the network interface.
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
     * <li>
     * <p>
     * <code>vpc-id</code> - The ID of the VPC for the network interface.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * One or more network interface IDs.
     * </p>
     * <p>
     * Default: Describes all your network interfaces.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> networkInterfaceIds;
    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of items to return for this request. The request returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>addresses.private-ip-address</code> - The private IPv4 addresses associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>addresses.primary</code> - Whether the private IPv4 address is the primary IP address associated with the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>addresses.association.public-ip</code> - The association ID returned when the network interface was
     * associated with the Elastic IP address (IPv4).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>addresses.association.owner-id</code> - The owner ID of the addresses associated with the network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.association-id</code> - The association ID returned when the network interface was associated
     * with an IPv4 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.allocation-id</code> - The allocation ID returned when you allocated the Elastic IP address
     * (IPv4) for your network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.ip-owner-id</code> - The owner of the Elastic IP address (IPv4) associated with the network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.public-ip</code> - The address of the Elastic IP address (IPv4) bound to the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.public-dns-name</code> - The public DNS name for the network interface (IPv4).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.attachment-id</code> - The ID of the interface attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.attach.time</code> - The time that the network interface was attached to an instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.delete-on-termination</code> - Indicates whether the attachment is deleted when an instance is
     * terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.device-index</code> - The device index to which the network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.instance-id</code> - The ID of the instance to which the network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.instance-owner-id</code> - The owner ID of the instance to which the network interface is
     * attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.nat-gateway-id</code> - The ID of the NAT gateway to which the network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.status</code> - The status of the attachment (<code>attaching</code> | <code>attached</code> |
     * <code>detaching</code> | <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>description</code> - The description of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-id</code> - The ID of a security group associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-name</code> - The name of a security group associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-addresses.ipv6-address</code> - An IPv6 address associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mac-address</code> - The MAC address of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-id</code> - The ID of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The AWS account ID of the network interface owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-ip-address</code> - The private IPv4 address or addresses of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-dns-name</code> - The private DNS name of the network interface (IPv4).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-id</code> - The ID of the entity that launched the instance on your behalf (for example, AWS
     * Management Console, Auto Scaling, and so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-managed</code> - Indicates whether the network interface is being managed by an AWS service (for
     * example, AWS Management Console, Auto Scaling, and so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>source-desk-check</code> - Indicates whether the network interface performs source/destination checking. A
     * value of <code>true</code> means checking is enabled, and <code>false</code> means checking is disabled. The
     * value must be <code>false</code> for the network interface to perform network address translation (NAT) in your
     * VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the network interface. If the network interface is not attached to an
     * instance, the status is <code>available</code>; if a network interface is attached to an instance the status is
     * <code>in-use</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-id</code> - The ID of the subnet for the network interface.
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
     * <li>
     * <p>
     * <code>vpc-id</code> - The ID of the VPC for the network interface.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>addresses.private-ip-address</code> - The private IPv4 addresses associated with the network
     *         interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>addresses.primary</code> - Whether the private IPv4 address is the primary IP address associated
     *         with the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>addresses.association.public-ip</code> - The association ID returned when the network interface was
     *         associated with the Elastic IP address (IPv4).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>addresses.association.owner-id</code> - The owner ID of the addresses associated with the network
     *         interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>association.association-id</code> - The association ID returned when the network interface was
     *         associated with an IPv4 address.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>association.allocation-id</code> - The allocation ID returned when you allocated the Elastic IP
     *         address (IPv4) for your network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>association.ip-owner-id</code> - The owner of the Elastic IP address (IPv4) associated with the
     *         network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>association.public-ip</code> - The address of the Elastic IP address (IPv4) bound to the network
     *         interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>association.public-dns-name</code> - The public DNS name for the network interface (IPv4).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>attachment.attachment-id</code> - The ID of the interface attachment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>attachment.attach.time</code> - The time that the network interface was attached to an instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>attachment.delete-on-termination</code> - Indicates whether the attachment is deleted when an
     *         instance is terminated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>attachment.device-index</code> - The device index to which the network interface is attached.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>attachment.instance-id</code> - The ID of the instance to which the network interface is attached.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>attachment.instance-owner-id</code> - The owner ID of the instance to which the network interface
     *         is attached.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>attachment.nat-gateway-id</code> - The ID of the NAT gateway to which the network interface is
     *         attached.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>attachment.status</code> - The status of the attachment (<code>attaching</code> |
     *         <code>attached</code> | <code>detaching</code> | <code>detached</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>availability-zone</code> - The Availability Zone of the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>description</code> - The description of the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>group-id</code> - The ID of a security group associated with the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>group-name</code> - The name of a security group associated with the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ipv6-addresses.ipv6-address</code> - An IPv6 address associated with the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>mac-address</code> - The MAC address of the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface-id</code> - The ID of the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>owner-id</code> - The AWS account ID of the network interface owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>private-ip-address</code> - The private IPv4 address or addresses of the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>private-dns-name</code> - The private DNS name of the network interface (IPv4).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>requester-id</code> - The ID of the entity that launched the instance on your behalf (for example,
     *         AWS Management Console, Auto Scaling, and so on).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>requester-managed</code> - Indicates whether the network interface is being managed by an AWS
     *         service (for example, AWS Management Console, Auto Scaling, and so on).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>source-desk-check</code> - Indicates whether the network interface performs source/destination
     *         checking. A value of <code>true</code> means checking is enabled, and <code>false</code> means checking
     *         is disabled. The value must be <code>false</code> for the network interface to perform network address
     *         translation (NAT) in your VPC.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>status</code> - The status of the network interface. If the network interface is not attached to an
     *         instance, the status is <code>available</code>; if a network interface is attached to an instance the
     *         status is <code>in-use</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>subnet-id</code> - The ID of the subnet for the network interface.
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
     *         <li>
     *         <p>
     *         <code>vpc-id</code> - The ID of the VPC for the network interface.
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
     * <code>addresses.private-ip-address</code> - The private IPv4 addresses associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>addresses.primary</code> - Whether the private IPv4 address is the primary IP address associated with the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>addresses.association.public-ip</code> - The association ID returned when the network interface was
     * associated with the Elastic IP address (IPv4).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>addresses.association.owner-id</code> - The owner ID of the addresses associated with the network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.association-id</code> - The association ID returned when the network interface was associated
     * with an IPv4 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.allocation-id</code> - The allocation ID returned when you allocated the Elastic IP address
     * (IPv4) for your network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.ip-owner-id</code> - The owner of the Elastic IP address (IPv4) associated with the network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.public-ip</code> - The address of the Elastic IP address (IPv4) bound to the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.public-dns-name</code> - The public DNS name for the network interface (IPv4).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.attachment-id</code> - The ID of the interface attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.attach.time</code> - The time that the network interface was attached to an instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.delete-on-termination</code> - Indicates whether the attachment is deleted when an instance is
     * terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.device-index</code> - The device index to which the network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.instance-id</code> - The ID of the instance to which the network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.instance-owner-id</code> - The owner ID of the instance to which the network interface is
     * attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.nat-gateway-id</code> - The ID of the NAT gateway to which the network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.status</code> - The status of the attachment (<code>attaching</code> | <code>attached</code> |
     * <code>detaching</code> | <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>description</code> - The description of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-id</code> - The ID of a security group associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-name</code> - The name of a security group associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-addresses.ipv6-address</code> - An IPv6 address associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mac-address</code> - The MAC address of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-id</code> - The ID of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The AWS account ID of the network interface owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-ip-address</code> - The private IPv4 address or addresses of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-dns-name</code> - The private DNS name of the network interface (IPv4).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-id</code> - The ID of the entity that launched the instance on your behalf (for example, AWS
     * Management Console, Auto Scaling, and so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-managed</code> - Indicates whether the network interface is being managed by an AWS service (for
     * example, AWS Management Console, Auto Scaling, and so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>source-desk-check</code> - Indicates whether the network interface performs source/destination checking. A
     * value of <code>true</code> means checking is enabled, and <code>false</code> means checking is disabled. The
     * value must be <code>false</code> for the network interface to perform network address translation (NAT) in your
     * VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the network interface. If the network interface is not attached to an
     * instance, the status is <code>available</code>; if a network interface is attached to an instance the status is
     * <code>in-use</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-id</code> - The ID of the subnet for the network interface.
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
     * <li>
     * <p>
     * <code>vpc-id</code> - The ID of the VPC for the network interface.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>addresses.private-ip-address</code> - The private IPv4 addresses associated with the network
     *        interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>addresses.primary</code> - Whether the private IPv4 address is the primary IP address associated
     *        with the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>addresses.association.public-ip</code> - The association ID returned when the network interface was
     *        associated with the Elastic IP address (IPv4).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>addresses.association.owner-id</code> - The owner ID of the addresses associated with the network
     *        interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>association.association-id</code> - The association ID returned when the network interface was
     *        associated with an IPv4 address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>association.allocation-id</code> - The allocation ID returned when you allocated the Elastic IP
     *        address (IPv4) for your network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>association.ip-owner-id</code> - The owner of the Elastic IP address (IPv4) associated with the
     *        network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>association.public-ip</code> - The address of the Elastic IP address (IPv4) bound to the network
     *        interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>association.public-dns-name</code> - The public DNS name for the network interface (IPv4).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.attachment-id</code> - The ID of the interface attachment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.attach.time</code> - The time that the network interface was attached to an instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.delete-on-termination</code> - Indicates whether the attachment is deleted when an
     *        instance is terminated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.device-index</code> - The device index to which the network interface is attached.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.instance-id</code> - The ID of the instance to which the network interface is attached.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.instance-owner-id</code> - The owner ID of the instance to which the network interface is
     *        attached.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.nat-gateway-id</code> - The ID of the NAT gateway to which the network interface is
     *        attached.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.status</code> - The status of the attachment (<code>attaching</code> |
     *        <code>attached</code> | <code>detaching</code> | <code>detached</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone of the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>description</code> - The description of the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>group-id</code> - The ID of a security group associated with the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>group-name</code> - The name of a security group associated with the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ipv6-addresses.ipv6-address</code> - An IPv6 address associated with the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mac-address</code> - The MAC address of the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface-id</code> - The ID of the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code> - The AWS account ID of the network interface owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>private-ip-address</code> - The private IPv4 address or addresses of the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>private-dns-name</code> - The private DNS name of the network interface (IPv4).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>requester-id</code> - The ID of the entity that launched the instance on your behalf (for example,
     *        AWS Management Console, Auto Scaling, and so on).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>requester-managed</code> - Indicates whether the network interface is being managed by an AWS
     *        service (for example, AWS Management Console, Auto Scaling, and so on).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>source-desk-check</code> - Indicates whether the network interface performs source/destination
     *        checking. A value of <code>true</code> means checking is enabled, and <code>false</code> means checking is
     *        disabled. The value must be <code>false</code> for the network interface to perform network address
     *        translation (NAT) in your VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status</code> - The status of the network interface. If the network interface is not attached to an
     *        instance, the status is <code>available</code>; if a network interface is attached to an instance the
     *        status is <code>in-use</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>subnet-id</code> - The ID of the subnet for the network interface.
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
     *        <li>
     *        <p>
     *        <code>vpc-id</code> - The ID of the VPC for the network interface.
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
     * <code>addresses.private-ip-address</code> - The private IPv4 addresses associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>addresses.primary</code> - Whether the private IPv4 address is the primary IP address associated with the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>addresses.association.public-ip</code> - The association ID returned when the network interface was
     * associated with the Elastic IP address (IPv4).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>addresses.association.owner-id</code> - The owner ID of the addresses associated with the network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.association-id</code> - The association ID returned when the network interface was associated
     * with an IPv4 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.allocation-id</code> - The allocation ID returned when you allocated the Elastic IP address
     * (IPv4) for your network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.ip-owner-id</code> - The owner of the Elastic IP address (IPv4) associated with the network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.public-ip</code> - The address of the Elastic IP address (IPv4) bound to the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.public-dns-name</code> - The public DNS name for the network interface (IPv4).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.attachment-id</code> - The ID of the interface attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.attach.time</code> - The time that the network interface was attached to an instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.delete-on-termination</code> - Indicates whether the attachment is deleted when an instance is
     * terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.device-index</code> - The device index to which the network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.instance-id</code> - The ID of the instance to which the network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.instance-owner-id</code> - The owner ID of the instance to which the network interface is
     * attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.nat-gateway-id</code> - The ID of the NAT gateway to which the network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.status</code> - The status of the attachment (<code>attaching</code> | <code>attached</code> |
     * <code>detaching</code> | <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>description</code> - The description of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-id</code> - The ID of a security group associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-name</code> - The name of a security group associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-addresses.ipv6-address</code> - An IPv6 address associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mac-address</code> - The MAC address of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-id</code> - The ID of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The AWS account ID of the network interface owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-ip-address</code> - The private IPv4 address or addresses of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-dns-name</code> - The private DNS name of the network interface (IPv4).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-id</code> - The ID of the entity that launched the instance on your behalf (for example, AWS
     * Management Console, Auto Scaling, and so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-managed</code> - Indicates whether the network interface is being managed by an AWS service (for
     * example, AWS Management Console, Auto Scaling, and so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>source-desk-check</code> - Indicates whether the network interface performs source/destination checking. A
     * value of <code>true</code> means checking is enabled, and <code>false</code> means checking is disabled. The
     * value must be <code>false</code> for the network interface to perform network address translation (NAT) in your
     * VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the network interface. If the network interface is not attached to an
     * instance, the status is <code>available</code>; if a network interface is attached to an instance the status is
     * <code>in-use</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-id</code> - The ID of the subnet for the network interface.
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
     * <li>
     * <p>
     * <code>vpc-id</code> - The ID of the VPC for the network interface.
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
     *        <code>addresses.private-ip-address</code> - The private IPv4 addresses associated with the network
     *        interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>addresses.primary</code> - Whether the private IPv4 address is the primary IP address associated
     *        with the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>addresses.association.public-ip</code> - The association ID returned when the network interface was
     *        associated with the Elastic IP address (IPv4).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>addresses.association.owner-id</code> - The owner ID of the addresses associated with the network
     *        interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>association.association-id</code> - The association ID returned when the network interface was
     *        associated with an IPv4 address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>association.allocation-id</code> - The allocation ID returned when you allocated the Elastic IP
     *        address (IPv4) for your network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>association.ip-owner-id</code> - The owner of the Elastic IP address (IPv4) associated with the
     *        network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>association.public-ip</code> - The address of the Elastic IP address (IPv4) bound to the network
     *        interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>association.public-dns-name</code> - The public DNS name for the network interface (IPv4).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.attachment-id</code> - The ID of the interface attachment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.attach.time</code> - The time that the network interface was attached to an instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.delete-on-termination</code> - Indicates whether the attachment is deleted when an
     *        instance is terminated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.device-index</code> - The device index to which the network interface is attached.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.instance-id</code> - The ID of the instance to which the network interface is attached.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.instance-owner-id</code> - The owner ID of the instance to which the network interface is
     *        attached.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.nat-gateway-id</code> - The ID of the NAT gateway to which the network interface is
     *        attached.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.status</code> - The status of the attachment (<code>attaching</code> |
     *        <code>attached</code> | <code>detaching</code> | <code>detached</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone of the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>description</code> - The description of the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>group-id</code> - The ID of a security group associated with the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>group-name</code> - The name of a security group associated with the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ipv6-addresses.ipv6-address</code> - An IPv6 address associated with the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mac-address</code> - The MAC address of the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface-id</code> - The ID of the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code> - The AWS account ID of the network interface owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>private-ip-address</code> - The private IPv4 address or addresses of the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>private-dns-name</code> - The private DNS name of the network interface (IPv4).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>requester-id</code> - The ID of the entity that launched the instance on your behalf (for example,
     *        AWS Management Console, Auto Scaling, and so on).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>requester-managed</code> - Indicates whether the network interface is being managed by an AWS
     *        service (for example, AWS Management Console, Auto Scaling, and so on).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>source-desk-check</code> - Indicates whether the network interface performs source/destination
     *        checking. A value of <code>true</code> means checking is enabled, and <code>false</code> means checking is
     *        disabled. The value must be <code>false</code> for the network interface to perform network address
     *        translation (NAT) in your VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status</code> - The status of the network interface. If the network interface is not attached to an
     *        instance, the status is <code>available</code>; if a network interface is attached to an instance the
     *        status is <code>in-use</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>subnet-id</code> - The ID of the subnet for the network interface.
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
     *        <li>
     *        <p>
     *        <code>vpc-id</code> - The ID of the VPC for the network interface.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInterfacesRequest withFilters(Filter... filters) {
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
     * <code>addresses.private-ip-address</code> - The private IPv4 addresses associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>addresses.primary</code> - Whether the private IPv4 address is the primary IP address associated with the
     * network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>addresses.association.public-ip</code> - The association ID returned when the network interface was
     * associated with the Elastic IP address (IPv4).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>addresses.association.owner-id</code> - The owner ID of the addresses associated with the network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.association-id</code> - The association ID returned when the network interface was associated
     * with an IPv4 address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.allocation-id</code> - The allocation ID returned when you allocated the Elastic IP address
     * (IPv4) for your network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.ip-owner-id</code> - The owner of the Elastic IP address (IPv4) associated with the network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.public-ip</code> - The address of the Elastic IP address (IPv4) bound to the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>association.public-dns-name</code> - The public DNS name for the network interface (IPv4).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.attachment-id</code> - The ID of the interface attachment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.attach.time</code> - The time that the network interface was attached to an instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.delete-on-termination</code> - Indicates whether the attachment is deleted when an instance is
     * terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.device-index</code> - The device index to which the network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.instance-id</code> - The ID of the instance to which the network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.instance-owner-id</code> - The owner ID of the instance to which the network interface is
     * attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.nat-gateway-id</code> - The ID of the NAT gateway to which the network interface is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.status</code> - The status of the attachment (<code>attaching</code> | <code>attached</code> |
     * <code>detaching</code> | <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>description</code> - The description of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-id</code> - The ID of a security group associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>group-name</code> - The name of a security group associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ipv6-addresses.ipv6-address</code> - An IPv6 address associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mac-address</code> - The MAC address of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface-id</code> - The ID of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The AWS account ID of the network interface owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-ip-address</code> - The private IPv4 address or addresses of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>private-dns-name</code> - The private DNS name of the network interface (IPv4).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-id</code> - The ID of the entity that launched the instance on your behalf (for example, AWS
     * Management Console, Auto Scaling, and so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>requester-managed</code> - Indicates whether the network interface is being managed by an AWS service (for
     * example, AWS Management Console, Auto Scaling, and so on).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>source-desk-check</code> - Indicates whether the network interface performs source/destination checking. A
     * value of <code>true</code> means checking is enabled, and <code>false</code> means checking is disabled. The
     * value must be <code>false</code> for the network interface to perform network address translation (NAT) in your
     * VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the network interface. If the network interface is not attached to an
     * instance, the status is <code>available</code>; if a network interface is attached to an instance the status is
     * <code>in-use</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-id</code> - The ID of the subnet for the network interface.
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
     * <li>
     * <p>
     * <code>vpc-id</code> - The ID of the VPC for the network interface.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>addresses.private-ip-address</code> - The private IPv4 addresses associated with the network
     *        interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>addresses.primary</code> - Whether the private IPv4 address is the primary IP address associated
     *        with the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>addresses.association.public-ip</code> - The association ID returned when the network interface was
     *        associated with the Elastic IP address (IPv4).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>addresses.association.owner-id</code> - The owner ID of the addresses associated with the network
     *        interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>association.association-id</code> - The association ID returned when the network interface was
     *        associated with an IPv4 address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>association.allocation-id</code> - The allocation ID returned when you allocated the Elastic IP
     *        address (IPv4) for your network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>association.ip-owner-id</code> - The owner of the Elastic IP address (IPv4) associated with the
     *        network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>association.public-ip</code> - The address of the Elastic IP address (IPv4) bound to the network
     *        interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>association.public-dns-name</code> - The public DNS name for the network interface (IPv4).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.attachment-id</code> - The ID of the interface attachment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.attach.time</code> - The time that the network interface was attached to an instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.delete-on-termination</code> - Indicates whether the attachment is deleted when an
     *        instance is terminated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.device-index</code> - The device index to which the network interface is attached.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.instance-id</code> - The ID of the instance to which the network interface is attached.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.instance-owner-id</code> - The owner ID of the instance to which the network interface is
     *        attached.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.nat-gateway-id</code> - The ID of the NAT gateway to which the network interface is
     *        attached.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.status</code> - The status of the attachment (<code>attaching</code> |
     *        <code>attached</code> | <code>detaching</code> | <code>detached</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone of the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>description</code> - The description of the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>group-id</code> - The ID of a security group associated with the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>group-name</code> - The name of a security group associated with the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ipv6-addresses.ipv6-address</code> - An IPv6 address associated with the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mac-address</code> - The MAC address of the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface-id</code> - The ID of the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code> - The AWS account ID of the network interface owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>private-ip-address</code> - The private IPv4 address or addresses of the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>private-dns-name</code> - The private DNS name of the network interface (IPv4).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>requester-id</code> - The ID of the entity that launched the instance on your behalf (for example,
     *        AWS Management Console, Auto Scaling, and so on).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>requester-managed</code> - Indicates whether the network interface is being managed by an AWS
     *        service (for example, AWS Management Console, Auto Scaling, and so on).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>source-desk-check</code> - Indicates whether the network interface performs source/destination
     *        checking. A value of <code>true</code> means checking is enabled, and <code>false</code> means checking is
     *        disabled. The value must be <code>false</code> for the network interface to perform network address
     *        translation (NAT) in your VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status</code> - The status of the network interface. If the network interface is not attached to an
     *        instance, the status is <code>available</code>; if a network interface is attached to an instance the
     *        status is <code>in-use</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>subnet-id</code> - The ID of the subnet for the network interface.
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
     *        <li>
     *        <p>
     *        <code>vpc-id</code> - The ID of the VPC for the network interface.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInterfacesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * One or more network interface IDs.
     * </p>
     * <p>
     * Default: Describes all your network interfaces.
     * </p>
     * 
     * @return One or more network interface IDs.</p>
     *         <p>
     *         Default: Describes all your network interfaces.
     */

    public java.util.List<String> getNetworkInterfaceIds() {
        if (networkInterfaceIds == null) {
            networkInterfaceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return networkInterfaceIds;
    }

    /**
     * <p>
     * One or more network interface IDs.
     * </p>
     * <p>
     * Default: Describes all your network interfaces.
     * </p>
     * 
     * @param networkInterfaceIds
     *        One or more network interface IDs.</p>
     *        <p>
     *        Default: Describes all your network interfaces.
     */

    public void setNetworkInterfaceIds(java.util.Collection<String> networkInterfaceIds) {
        if (networkInterfaceIds == null) {
            this.networkInterfaceIds = null;
            return;
        }

        this.networkInterfaceIds = new com.amazonaws.internal.SdkInternalList<String>(networkInterfaceIds);
    }

    /**
     * <p>
     * One or more network interface IDs.
     * </p>
     * <p>
     * Default: Describes all your network interfaces.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkInterfaceIds(java.util.Collection)} or {@link #withNetworkInterfaceIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param networkInterfaceIds
     *        One or more network interface IDs.</p>
     *        <p>
     *        Default: Describes all your network interfaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInterfacesRequest withNetworkInterfaceIds(String... networkInterfaceIds) {
        if (this.networkInterfaceIds == null) {
            setNetworkInterfaceIds(new com.amazonaws.internal.SdkInternalList<String>(networkInterfaceIds.length));
        }
        for (String ele : networkInterfaceIds) {
            this.networkInterfaceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more network interface IDs.
     * </p>
     * <p>
     * Default: Describes all your network interfaces.
     * </p>
     * 
     * @param networkInterfaceIds
     *        One or more network interface IDs.</p>
     *        <p>
     *        Default: Describes all your network interfaces.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInterfacesRequest withNetworkInterfaceIds(java.util.Collection<String> networkInterfaceIds) {
        setNetworkInterfaceIds(networkInterfaceIds);
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

    public DescribeNetworkInterfacesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return for this request. The request returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this request. The request returns a token that you can specify
     *        in a subsequent call to get the next set of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this request. The request returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @return The maximum number of items to return for this request. The request returns a token that you can specify
     *         in a subsequent call to get the next set of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this request. The request returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this request. The request returns a token that you can specify
     *        in a subsequent call to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeNetworkInterfacesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeNetworkInterfacesRequest> getDryRunRequest() {
        Request<DescribeNetworkInterfacesRequest> request = new DescribeNetworkInterfacesRequestMarshaller().marshall(this);
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
        if (getNetworkInterfaceIds() != null)
            sb.append("NetworkInterfaceIds: ").append(getNetworkInterfaceIds()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeNetworkInterfacesRequest == false)
            return false;
        DescribeNetworkInterfacesRequest other = (DescribeNetworkInterfacesRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getNetworkInterfaceIds() == null ^ this.getNetworkInterfaceIds() == null)
            return false;
        if (other.getNetworkInterfaceIds() != null && other.getNetworkInterfaceIds().equals(this.getNetworkInterfaceIds()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceIds() == null) ? 0 : getNetworkInterfaceIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeNetworkInterfacesRequest clone() {
        return (DescribeNetworkInterfacesRequest) super.clone();
    }
}
