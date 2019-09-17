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
import com.amazonaws.services.ec2.model.transform.DescribeSpotInstanceRequestsRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DescribeSpotInstanceRequests.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSpotInstanceRequestsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeSpotInstanceRequestsRequest> {

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone-group</code> - The Availability Zone group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>create-time</code> - The time stamp when the Spot Instance request was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fault-code</code> - The fault code related to the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fault-message</code> - The fault message related to the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance that fulfilled the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch-group</code> - The Spot Instance launch group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.delete-on-termination</code> - Indicates whether the EBS volume is deleted on
     * instance termination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.device-name</code> - The device name for the volume in the block device mapping
     * (for example, <code>/dev/sdh</code> or <code>xvdh</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.snapshot-id</code> - The ID of the snapshot for the EBS volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.volume-size</code> - The size of the EBS volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.volume-type</code> - The type of EBS volume: <code>gp2</code> for General
     * Purpose SSD, <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for Throughput Optimized HDD,
     * <code>sc1</code>for Cold HDD, or <code>standard</code> for Magnetic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.group-id</code> - The ID of the security group for the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.group-name</code> - The name of the security group for the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.image-id</code> - The ID of the AMI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.instance-type</code> - The type of instance (for example, <code>m3.medium</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.kernel-id</code> - The kernel ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.key-name</code> - The name of the key pair the instance launched with.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.monitoring-enabled</code> - Whether detailed monitoring is enabled for the Spot Instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.ramdisk-id</code> - The RAM disk ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launched-availability-zone</code> - The Availability Zone in which the request is launched.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.primary</code> - Indicates whether the IP address is the primary private IP
     * address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.delete-on-termination</code> - Indicates whether the network interface is deleted when
     * the instance is terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.description</code> - A description of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.device-index</code> - The index of the device for the network interface attachment on the
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.group-id</code> - The ID of the security group associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.network-interface-id</code> - The ID of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.private-ip-address</code> - The primary private IP address of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.subnet-id</code> - The ID of the subnet for the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-description</code> - The product description associated with the instance (<code>Linux/UNIX</code>
     * | <code>Windows</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spot-instance-request-id</code> - The Spot Instance request ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spot-price</code> - The maximum hourly price for any Spot Instance launched to fulfill the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the Spot Instance request (<code>open</code> | <code>active</code> |
     * <code>closed</code> | <code>cancelled</code> | <code>failed</code>). Spot request status information can help you
     * track your Amazon EC2 Spot Instance requests. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html">Spot Request Status</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-code</code> - The short code describing the most recent evaluation of your Spot Instance request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-message</code> - The message explaining the status of the Spot Instance request.
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
     * <code>type</code> - The type of Spot Instance request (<code>one-time</code> | <code>persistent</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>valid-from</code> - The start date of the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>valid-until</code> - The end date of the request.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * One or more Spot Instance request IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> spotInstanceRequestIds;
    /**
     * <p>
     * The token to request the next set of results. This value is <code>null</code> when there are no more results to
     * return.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return in a single call. Specify a value between 5 and 1000. To retrieve the
     * remaining results, make another call with the returned <code>NextToken</code> value.
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
     * <code>availability-zone-group</code> - The Availability Zone group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>create-time</code> - The time stamp when the Spot Instance request was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fault-code</code> - The fault code related to the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fault-message</code> - The fault message related to the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance that fulfilled the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch-group</code> - The Spot Instance launch group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.delete-on-termination</code> - Indicates whether the EBS volume is deleted on
     * instance termination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.device-name</code> - The device name for the volume in the block device mapping
     * (for example, <code>/dev/sdh</code> or <code>xvdh</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.snapshot-id</code> - The ID of the snapshot for the EBS volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.volume-size</code> - The size of the EBS volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.volume-type</code> - The type of EBS volume: <code>gp2</code> for General
     * Purpose SSD, <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for Throughput Optimized HDD,
     * <code>sc1</code>for Cold HDD, or <code>standard</code> for Magnetic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.group-id</code> - The ID of the security group for the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.group-name</code> - The name of the security group for the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.image-id</code> - The ID of the AMI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.instance-type</code> - The type of instance (for example, <code>m3.medium</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.kernel-id</code> - The kernel ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.key-name</code> - The name of the key pair the instance launched with.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.monitoring-enabled</code> - Whether detailed monitoring is enabled for the Spot Instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.ramdisk-id</code> - The RAM disk ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launched-availability-zone</code> - The Availability Zone in which the request is launched.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.primary</code> - Indicates whether the IP address is the primary private IP
     * address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.delete-on-termination</code> - Indicates whether the network interface is deleted when
     * the instance is terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.description</code> - A description of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.device-index</code> - The index of the device for the network interface attachment on the
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.group-id</code> - The ID of the security group associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.network-interface-id</code> - The ID of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.private-ip-address</code> - The primary private IP address of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.subnet-id</code> - The ID of the subnet for the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-description</code> - The product description associated with the instance (<code>Linux/UNIX</code>
     * | <code>Windows</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spot-instance-request-id</code> - The Spot Instance request ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spot-price</code> - The maximum hourly price for any Spot Instance launched to fulfill the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the Spot Instance request (<code>open</code> | <code>active</code> |
     * <code>closed</code> | <code>cancelled</code> | <code>failed</code>). Spot request status information can help you
     * track your Amazon EC2 Spot Instance requests. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html">Spot Request Status</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-code</code> - The short code describing the most recent evaluation of your Spot Instance request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-message</code> - The message explaining the status of the Spot Instance request.
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
     * <code>type</code> - The type of Spot Instance request (<code>one-time</code> | <code>persistent</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>valid-from</code> - The start date of the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>valid-until</code> - The end date of the request.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>availability-zone-group</code> - The Availability Zone group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>create-time</code> - The time stamp when the Spot Instance request was created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>fault-code</code> - The fault code related to the request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>fault-message</code> - The fault message related to the request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>instance-id</code> - The ID of the instance that fulfilled the request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>launch-group</code> - The Spot Instance launch group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>launch.block-device-mapping.delete-on-termination</code> - Indicates whether the EBS volume is
     *         deleted on instance termination.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>launch.block-device-mapping.device-name</code> - The device name for the volume in the block device
     *         mapping (for example, <code>/dev/sdh</code> or <code>xvdh</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>launch.block-device-mapping.snapshot-id</code> - The ID of the snapshot for the EBS volume.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>launch.block-device-mapping.volume-size</code> - The size of the EBS volume, in GiB.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>launch.block-device-mapping.volume-type</code> - The type of EBS volume: <code>gp2</code> for
     *         General Purpose SSD, <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for Throughput Optimized
     *         HDD, <code>sc1</code>for Cold HDD, or <code>standard</code> for Magnetic.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>launch.group-id</code> - The ID of the security group for the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>launch.group-name</code> - The name of the security group for the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>launch.image-id</code> - The ID of the AMI.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>launch.instance-type</code> - The type of instance (for example, <code>m3.medium</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>launch.kernel-id</code> - The kernel ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>launch.key-name</code> - The name of the key pair the instance launched with.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>launch.monitoring-enabled</code> - Whether detailed monitoring is enabled for the Spot Instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>launch.ramdisk-id</code> - The RAM disk ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>launched-availability-zone</code> - The Availability Zone in which the request is launched.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.addresses.primary</code> - Indicates whether the IP address is the primary
     *         private IP address.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.delete-on-termination</code> - Indicates whether the network interface is deleted
     *         when the instance is terminated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.description</code> - A description of the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.device-index</code> - The index of the device for the network interface
     *         attachment on the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.group-id</code> - The ID of the security group associated with the network
     *         interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.network-interface-id</code> - The ID of the network interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.private-ip-address</code> - The primary private IP address of the network
     *         interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.subnet-id</code> - The ID of the subnet for the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>product-description</code> - The product description associated with the instance (
     *         <code>Linux/UNIX</code> | <code>Windows</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>spot-instance-request-id</code> - The Spot Instance request ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>spot-price</code> - The maximum hourly price for any Spot Instance launched to fulfill the request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state</code> - The state of the Spot Instance request (<code>open</code> | <code>active</code> |
     *         <code>closed</code> | <code>cancelled</code> | <code>failed</code>). Spot request status information can
     *         help you track your Amazon EC2 Spot Instance requests. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html">Spot Request Status</a>
     *         in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>status-code</code> - The short code describing the most recent evaluation of your Spot Instance
     *         request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>status-message</code> - The message explaining the status of the Spot Instance request.
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
     *         <code>type</code> - The type of Spot Instance request (<code>one-time</code> | <code>persistent</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>valid-from</code> - The start date of the request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>valid-until</code> - The end date of the request.
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
     * <code>availability-zone-group</code> - The Availability Zone group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>create-time</code> - The time stamp when the Spot Instance request was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fault-code</code> - The fault code related to the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fault-message</code> - The fault message related to the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance that fulfilled the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch-group</code> - The Spot Instance launch group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.delete-on-termination</code> - Indicates whether the EBS volume is deleted on
     * instance termination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.device-name</code> - The device name for the volume in the block device mapping
     * (for example, <code>/dev/sdh</code> or <code>xvdh</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.snapshot-id</code> - The ID of the snapshot for the EBS volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.volume-size</code> - The size of the EBS volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.volume-type</code> - The type of EBS volume: <code>gp2</code> for General
     * Purpose SSD, <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for Throughput Optimized HDD,
     * <code>sc1</code>for Cold HDD, or <code>standard</code> for Magnetic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.group-id</code> - The ID of the security group for the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.group-name</code> - The name of the security group for the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.image-id</code> - The ID of the AMI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.instance-type</code> - The type of instance (for example, <code>m3.medium</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.kernel-id</code> - The kernel ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.key-name</code> - The name of the key pair the instance launched with.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.monitoring-enabled</code> - Whether detailed monitoring is enabled for the Spot Instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.ramdisk-id</code> - The RAM disk ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launched-availability-zone</code> - The Availability Zone in which the request is launched.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.primary</code> - Indicates whether the IP address is the primary private IP
     * address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.delete-on-termination</code> - Indicates whether the network interface is deleted when
     * the instance is terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.description</code> - A description of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.device-index</code> - The index of the device for the network interface attachment on the
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.group-id</code> - The ID of the security group associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.network-interface-id</code> - The ID of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.private-ip-address</code> - The primary private IP address of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.subnet-id</code> - The ID of the subnet for the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-description</code> - The product description associated with the instance (<code>Linux/UNIX</code>
     * | <code>Windows</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spot-instance-request-id</code> - The Spot Instance request ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spot-price</code> - The maximum hourly price for any Spot Instance launched to fulfill the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the Spot Instance request (<code>open</code> | <code>active</code> |
     * <code>closed</code> | <code>cancelled</code> | <code>failed</code>). Spot request status information can help you
     * track your Amazon EC2 Spot Instance requests. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html">Spot Request Status</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-code</code> - The short code describing the most recent evaluation of your Spot Instance request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-message</code> - The message explaining the status of the Spot Instance request.
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
     * <code>type</code> - The type of Spot Instance request (<code>one-time</code> | <code>persistent</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>valid-from</code> - The start date of the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>valid-until</code> - The end date of the request.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>availability-zone-group</code> - The Availability Zone group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>create-time</code> - The time stamp when the Spot Instance request was created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fault-code</code> - The fault code related to the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fault-message</code> - The fault message related to the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-id</code> - The ID of the instance that fulfilled the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch-group</code> - The Spot Instance launch group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.block-device-mapping.delete-on-termination</code> - Indicates whether the EBS volume is
     *        deleted on instance termination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.block-device-mapping.device-name</code> - The device name for the volume in the block device
     *        mapping (for example, <code>/dev/sdh</code> or <code>xvdh</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.block-device-mapping.snapshot-id</code> - The ID of the snapshot for the EBS volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.block-device-mapping.volume-size</code> - The size of the EBS volume, in GiB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.block-device-mapping.volume-type</code> - The type of EBS volume: <code>gp2</code> for
     *        General Purpose SSD, <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for Throughput Optimized
     *        HDD, <code>sc1</code>for Cold HDD, or <code>standard</code> for Magnetic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.group-id</code> - The ID of the security group for the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.group-name</code> - The name of the security group for the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.image-id</code> - The ID of the AMI.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.instance-type</code> - The type of instance (for example, <code>m3.medium</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.kernel-id</code> - The kernel ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.key-name</code> - The name of the key pair the instance launched with.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.monitoring-enabled</code> - Whether detailed monitoring is enabled for the Spot Instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.ramdisk-id</code> - The RAM disk ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launched-availability-zone</code> - The Availability Zone in which the request is launched.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.addresses.primary</code> - Indicates whether the IP address is the primary private
     *        IP address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.delete-on-termination</code> - Indicates whether the network interface is deleted
     *        when the instance is terminated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.description</code> - A description of the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.device-index</code> - The index of the device for the network interface attachment
     *        on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.group-id</code> - The ID of the security group associated with the network
     *        interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.network-interface-id</code> - The ID of the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.private-ip-address</code> - The primary private IP address of the network
     *        interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.subnet-id</code> - The ID of the subnet for the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>product-description</code> - The product description associated with the instance (
     *        <code>Linux/UNIX</code> | <code>Windows</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>spot-instance-request-id</code> - The Spot Instance request ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>spot-price</code> - The maximum hourly price for any Spot Instance launched to fulfill the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the Spot Instance request (<code>open</code> | <code>active</code> |
     *        <code>closed</code> | <code>cancelled</code> | <code>failed</code>). Spot request status information can
     *        help you track your Amazon EC2 Spot Instance requests. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html">Spot Request Status</a> in
     *        the <i>Amazon EC2 User Guide for Linux Instances</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status-code</code> - The short code describing the most recent evaluation of your Spot Instance
     *        request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status-message</code> - The message explaining the status of the Spot Instance request.
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
     *        <code>type</code> - The type of Spot Instance request (<code>one-time</code> | <code>persistent</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>valid-from</code> - The start date of the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>valid-until</code> - The end date of the request.
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
     * <code>availability-zone-group</code> - The Availability Zone group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>create-time</code> - The time stamp when the Spot Instance request was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fault-code</code> - The fault code related to the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fault-message</code> - The fault message related to the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance that fulfilled the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch-group</code> - The Spot Instance launch group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.delete-on-termination</code> - Indicates whether the EBS volume is deleted on
     * instance termination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.device-name</code> - The device name for the volume in the block device mapping
     * (for example, <code>/dev/sdh</code> or <code>xvdh</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.snapshot-id</code> - The ID of the snapshot for the EBS volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.volume-size</code> - The size of the EBS volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.volume-type</code> - The type of EBS volume: <code>gp2</code> for General
     * Purpose SSD, <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for Throughput Optimized HDD,
     * <code>sc1</code>for Cold HDD, or <code>standard</code> for Magnetic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.group-id</code> - The ID of the security group for the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.group-name</code> - The name of the security group for the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.image-id</code> - The ID of the AMI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.instance-type</code> - The type of instance (for example, <code>m3.medium</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.kernel-id</code> - The kernel ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.key-name</code> - The name of the key pair the instance launched with.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.monitoring-enabled</code> - Whether detailed monitoring is enabled for the Spot Instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.ramdisk-id</code> - The RAM disk ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launched-availability-zone</code> - The Availability Zone in which the request is launched.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.primary</code> - Indicates whether the IP address is the primary private IP
     * address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.delete-on-termination</code> - Indicates whether the network interface is deleted when
     * the instance is terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.description</code> - A description of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.device-index</code> - The index of the device for the network interface attachment on the
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.group-id</code> - The ID of the security group associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.network-interface-id</code> - The ID of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.private-ip-address</code> - The primary private IP address of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.subnet-id</code> - The ID of the subnet for the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-description</code> - The product description associated with the instance (<code>Linux/UNIX</code>
     * | <code>Windows</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spot-instance-request-id</code> - The Spot Instance request ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spot-price</code> - The maximum hourly price for any Spot Instance launched to fulfill the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the Spot Instance request (<code>open</code> | <code>active</code> |
     * <code>closed</code> | <code>cancelled</code> | <code>failed</code>). Spot request status information can help you
     * track your Amazon EC2 Spot Instance requests. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html">Spot Request Status</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-code</code> - The short code describing the most recent evaluation of your Spot Instance request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-message</code> - The message explaining the status of the Spot Instance request.
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
     * <code>type</code> - The type of Spot Instance request (<code>one-time</code> | <code>persistent</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>valid-from</code> - The start date of the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>valid-until</code> - The end date of the request.
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
     *        <code>availability-zone-group</code> - The Availability Zone group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>create-time</code> - The time stamp when the Spot Instance request was created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fault-code</code> - The fault code related to the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fault-message</code> - The fault message related to the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-id</code> - The ID of the instance that fulfilled the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch-group</code> - The Spot Instance launch group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.block-device-mapping.delete-on-termination</code> - Indicates whether the EBS volume is
     *        deleted on instance termination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.block-device-mapping.device-name</code> - The device name for the volume in the block device
     *        mapping (for example, <code>/dev/sdh</code> or <code>xvdh</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.block-device-mapping.snapshot-id</code> - The ID of the snapshot for the EBS volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.block-device-mapping.volume-size</code> - The size of the EBS volume, in GiB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.block-device-mapping.volume-type</code> - The type of EBS volume: <code>gp2</code> for
     *        General Purpose SSD, <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for Throughput Optimized
     *        HDD, <code>sc1</code>for Cold HDD, or <code>standard</code> for Magnetic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.group-id</code> - The ID of the security group for the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.group-name</code> - The name of the security group for the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.image-id</code> - The ID of the AMI.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.instance-type</code> - The type of instance (for example, <code>m3.medium</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.kernel-id</code> - The kernel ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.key-name</code> - The name of the key pair the instance launched with.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.monitoring-enabled</code> - Whether detailed monitoring is enabled for the Spot Instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.ramdisk-id</code> - The RAM disk ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launched-availability-zone</code> - The Availability Zone in which the request is launched.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.addresses.primary</code> - Indicates whether the IP address is the primary private
     *        IP address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.delete-on-termination</code> - Indicates whether the network interface is deleted
     *        when the instance is terminated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.description</code> - A description of the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.device-index</code> - The index of the device for the network interface attachment
     *        on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.group-id</code> - The ID of the security group associated with the network
     *        interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.network-interface-id</code> - The ID of the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.private-ip-address</code> - The primary private IP address of the network
     *        interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.subnet-id</code> - The ID of the subnet for the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>product-description</code> - The product description associated with the instance (
     *        <code>Linux/UNIX</code> | <code>Windows</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>spot-instance-request-id</code> - The Spot Instance request ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>spot-price</code> - The maximum hourly price for any Spot Instance launched to fulfill the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the Spot Instance request (<code>open</code> | <code>active</code> |
     *        <code>closed</code> | <code>cancelled</code> | <code>failed</code>). Spot request status information can
     *        help you track your Amazon EC2 Spot Instance requests. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html">Spot Request Status</a> in
     *        the <i>Amazon EC2 User Guide for Linux Instances</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status-code</code> - The short code describing the most recent evaluation of your Spot Instance
     *        request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status-message</code> - The message explaining the status of the Spot Instance request.
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
     *        <code>type</code> - The type of Spot Instance request (<code>one-time</code> | <code>persistent</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>valid-from</code> - The start date of the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>valid-until</code> - The end date of the request.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpotInstanceRequestsRequest withFilters(Filter... filters) {
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
     * <code>availability-zone-group</code> - The Availability Zone group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>create-time</code> - The time stamp when the Spot Instance request was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fault-code</code> - The fault code related to the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>fault-message</code> - The fault message related to the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>instance-id</code> - The ID of the instance that fulfilled the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch-group</code> - The Spot Instance launch group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.delete-on-termination</code> - Indicates whether the EBS volume is deleted on
     * instance termination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.device-name</code> - The device name for the volume in the block device mapping
     * (for example, <code>/dev/sdh</code> or <code>xvdh</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.snapshot-id</code> - The ID of the snapshot for the EBS volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.volume-size</code> - The size of the EBS volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.volume-type</code> - The type of EBS volume: <code>gp2</code> for General
     * Purpose SSD, <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for Throughput Optimized HDD,
     * <code>sc1</code>for Cold HDD, or <code>standard</code> for Magnetic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.group-id</code> - The ID of the security group for the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.group-name</code> - The name of the security group for the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.image-id</code> - The ID of the AMI.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.instance-type</code> - The type of instance (for example, <code>m3.medium</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.kernel-id</code> - The kernel ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.key-name</code> - The name of the key pair the instance launched with.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.monitoring-enabled</code> - Whether detailed monitoring is enabled for the Spot Instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.ramdisk-id</code> - The RAM disk ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launched-availability-zone</code> - The Availability Zone in which the request is launched.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.addresses.primary</code> - Indicates whether the IP address is the primary private IP
     * address.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.delete-on-termination</code> - Indicates whether the network interface is deleted when
     * the instance is terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.description</code> - A description of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.device-index</code> - The index of the device for the network interface attachment on the
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.group-id</code> - The ID of the security group associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.network-interface-id</code> - The ID of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.private-ip-address</code> - The primary private IP address of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.subnet-id</code> - The ID of the subnet for the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>product-description</code> - The product description associated with the instance (<code>Linux/UNIX</code>
     * | <code>Windows</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spot-instance-request-id</code> - The Spot Instance request ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spot-price</code> - The maximum hourly price for any Spot Instance launched to fulfill the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the Spot Instance request (<code>open</code> | <code>active</code> |
     * <code>closed</code> | <code>cancelled</code> | <code>failed</code>). Spot request status information can help you
     * track your Amazon EC2 Spot Instance requests. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html">Spot Request Status</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-code</code> - The short code describing the most recent evaluation of your Spot Instance request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-message</code> - The message explaining the status of the Spot Instance request.
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
     * <code>type</code> - The type of Spot Instance request (<code>one-time</code> | <code>persistent</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>valid-from</code> - The start date of the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>valid-until</code> - The end date of the request.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>availability-zone-group</code> - The Availability Zone group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>create-time</code> - The time stamp when the Spot Instance request was created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fault-code</code> - The fault code related to the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>fault-message</code> - The fault message related to the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>instance-id</code> - The ID of the instance that fulfilled the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch-group</code> - The Spot Instance launch group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.block-device-mapping.delete-on-termination</code> - Indicates whether the EBS volume is
     *        deleted on instance termination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.block-device-mapping.device-name</code> - The device name for the volume in the block device
     *        mapping (for example, <code>/dev/sdh</code> or <code>xvdh</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.block-device-mapping.snapshot-id</code> - The ID of the snapshot for the EBS volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.block-device-mapping.volume-size</code> - The size of the EBS volume, in GiB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.block-device-mapping.volume-type</code> - The type of EBS volume: <code>gp2</code> for
     *        General Purpose SSD, <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for Throughput Optimized
     *        HDD, <code>sc1</code>for Cold HDD, or <code>standard</code> for Magnetic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.group-id</code> - The ID of the security group for the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.group-name</code> - The name of the security group for the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.image-id</code> - The ID of the AMI.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.instance-type</code> - The type of instance (for example, <code>m3.medium</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.kernel-id</code> - The kernel ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.key-name</code> - The name of the key pair the instance launched with.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.monitoring-enabled</code> - Whether detailed monitoring is enabled for the Spot Instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.ramdisk-id</code> - The RAM disk ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launched-availability-zone</code> - The Availability Zone in which the request is launched.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.addresses.primary</code> - Indicates whether the IP address is the primary private
     *        IP address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.delete-on-termination</code> - Indicates whether the network interface is deleted
     *        when the instance is terminated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.description</code> - A description of the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.device-index</code> - The index of the device for the network interface attachment
     *        on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.group-id</code> - The ID of the security group associated with the network
     *        interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.network-interface-id</code> - The ID of the network interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.private-ip-address</code> - The primary private IP address of the network
     *        interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.subnet-id</code> - The ID of the subnet for the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>product-description</code> - The product description associated with the instance (
     *        <code>Linux/UNIX</code> | <code>Windows</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>spot-instance-request-id</code> - The Spot Instance request ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>spot-price</code> - The maximum hourly price for any Spot Instance launched to fulfill the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the Spot Instance request (<code>open</code> | <code>active</code> |
     *        <code>closed</code> | <code>cancelled</code> | <code>failed</code>). Spot request status information can
     *        help you track your Amazon EC2 Spot Instance requests. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html">Spot Request Status</a> in
     *        the <i>Amazon EC2 User Guide for Linux Instances</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status-code</code> - The short code describing the most recent evaluation of your Spot Instance
     *        request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status-message</code> - The message explaining the status of the Spot Instance request.
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
     *        <code>type</code> - The type of Spot Instance request (<code>one-time</code> | <code>persistent</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>valid-from</code> - The start date of the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>valid-until</code> - The end date of the request.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpotInstanceRequestsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * One or more Spot Instance request IDs.
     * </p>
     * 
     * @return One or more Spot Instance request IDs.
     */

    public java.util.List<String> getSpotInstanceRequestIds() {
        if (spotInstanceRequestIds == null) {
            spotInstanceRequestIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return spotInstanceRequestIds;
    }

    /**
     * <p>
     * One or more Spot Instance request IDs.
     * </p>
     * 
     * @param spotInstanceRequestIds
     *        One or more Spot Instance request IDs.
     */

    public void setSpotInstanceRequestIds(java.util.Collection<String> spotInstanceRequestIds) {
        if (spotInstanceRequestIds == null) {
            this.spotInstanceRequestIds = null;
            return;
        }

        this.spotInstanceRequestIds = new com.amazonaws.internal.SdkInternalList<String>(spotInstanceRequestIds);
    }

    /**
     * <p>
     * One or more Spot Instance request IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSpotInstanceRequestIds(java.util.Collection)} or
     * {@link #withSpotInstanceRequestIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param spotInstanceRequestIds
     *        One or more Spot Instance request IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpotInstanceRequestsRequest withSpotInstanceRequestIds(String... spotInstanceRequestIds) {
        if (this.spotInstanceRequestIds == null) {
            setSpotInstanceRequestIds(new com.amazonaws.internal.SdkInternalList<String>(spotInstanceRequestIds.length));
        }
        for (String ele : spotInstanceRequestIds) {
            this.spotInstanceRequestIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more Spot Instance request IDs.
     * </p>
     * 
     * @param spotInstanceRequestIds
     *        One or more Spot Instance request IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpotInstanceRequestsRequest withSpotInstanceRequestIds(java.util.Collection<String> spotInstanceRequestIds) {
        setSpotInstanceRequestIds(spotInstanceRequestIds);
        return this;
    }

    /**
     * <p>
     * The token to request the next set of results. This value is <code>null</code> when there are no more results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The token to request the next set of results. This value is <code>null</code> when there are no more
     *        results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to request the next set of results. This value is <code>null</code> when there are no more results to
     * return.
     * </p>
     * 
     * @return The token to request the next set of results. This value is <code>null</code> when there are no more
     *         results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to request the next set of results. This value is <code>null</code> when there are no more results to
     * return.
     * </p>
     * 
     * @param nextToken
     *        The token to request the next set of results. This value is <code>null</code> when there are no more
     *        results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpotInstanceRequestsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. Specify a value between 5 and 1000. To retrieve the
     * remaining results, make another call with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. Specify a value between 5 and 1000. To retrieve
     *        the remaining results, make another call with the returned <code>NextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. Specify a value between 5 and 1000. To retrieve the
     * remaining results, make another call with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @return The maximum number of results to return in a single call. Specify a value between 5 and 1000. To retrieve
     *         the remaining results, make another call with the returned <code>NextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. Specify a value between 5 and 1000. To retrieve the
     * remaining results, make another call with the returned <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in a single call. Specify a value between 5 and 1000. To retrieve
     *        the remaining results, make another call with the returned <code>NextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpotInstanceRequestsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeSpotInstanceRequestsRequest> getDryRunRequest() {
        Request<DescribeSpotInstanceRequestsRequest> request = new DescribeSpotInstanceRequestsRequestMarshaller().marshall(this);
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
        if (getSpotInstanceRequestIds() != null)
            sb.append("SpotInstanceRequestIds: ").append(getSpotInstanceRequestIds()).append(",");
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

        if (obj instanceof DescribeSpotInstanceRequestsRequest == false)
            return false;
        DescribeSpotInstanceRequestsRequest other = (DescribeSpotInstanceRequestsRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getSpotInstanceRequestIds() == null ^ this.getSpotInstanceRequestIds() == null)
            return false;
        if (other.getSpotInstanceRequestIds() != null && other.getSpotInstanceRequestIds().equals(this.getSpotInstanceRequestIds()) == false)
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
        hashCode = prime * hashCode + ((getSpotInstanceRequestIds() == null) ? 0 : getSpotInstanceRequestIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSpotInstanceRequestsRequest clone() {
        return (DescribeSpotInstanceRequestsRequest) super.clone();
    }
}
