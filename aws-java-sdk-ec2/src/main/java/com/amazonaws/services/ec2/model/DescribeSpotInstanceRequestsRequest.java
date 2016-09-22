/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeSpotInstanceRequestsRequestMarshaller;

/**
 * <p>
 * Contains the parameters for DescribeSpotInstanceRequests.
 * </p>
 */
public class DescribeSpotInstanceRequestsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeSpotInstanceRequestsRequest> {

    /**
     * <p>
     * One or more Spot instance request IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> spotInstanceRequestIds;
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
     * <code>create-time</code> - The time stamp when the Spot instance request was created.
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
     * <code>launch-group</code> - The Spot instance launch group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.delete-on-termination</code> - Indicates whether the Amazon EBS volume is
     * deleted on instance termination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.device-name</code> - The device name for the Amazon EBS volume (for example,
     * <code>/dev/sdh</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.snapshot-id</code> - The ID of the snapshot used for the Amazon EBS volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.volume-size</code> - The size of the Amazon EBS volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.volume-type</code> - The type of the Amazon EBS volume: <code>gp2</code> for
     * General Purpose SSD, <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for Throughput Optimized HDD,
     * <code>sc1</code>for Cold HDD, or <code>standard</code> for Magnetic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.group-id</code> - The security group for the instance.
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
     * <code>launch.monitoring-enabled</code> - Whether monitoring is enabled for the Spot instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.ramdisk-id</code> - The RAM disk ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.network-interface-id</code> - The ID of the network interface.
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
     * <code>network-interface.subnet-id</code> - The ID of the subnet for the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.description</code> - A description of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.private-ip-address</code> - The primary private IP address of the network interface.
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
     * <code>network-interface.group-id</code> - The ID of the security group associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.group-name</code> - The name of the security group associated with the network interface.
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
     * <code>product-description</code> - The product description associated with the instance (<code>Linux/UNIX</code>
     * | <code>Windows</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spot-instance-request-id</code> - The Spot instance request ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spot-price</code> - The maximum hourly price for any Spot instance launched to fulfill the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the Spot instance request (<code>open</code> | <code>active</code> |
     * <code>closed</code> | <code>cancelled</code> | <code>failed</code>). Spot bid status information can help you
     * track your Amazon EC2 Spot instance requests. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html">Spot Bid Status</a> in the Amazon
     * Elastic Compute Cloud User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-code</code> - The short code describing the most recent evaluation of your Spot instance request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-message</code> - The message explaining the status of the Spot instance request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a tag assigned to the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. This filter is independent of the
     * <code>tag-value</code> filter. For example, if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose (regardless of what the tag's value is),
     * and the tag value X (regardless of what the tag's key is). If you want to list only resources where Purpose is X,
     * see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-value</code> - The value of a tag assigned to the resource. This filter is independent of the
     * <code>tag-key</code> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code> - The type of Spot instance request (<code>one-time</code> | <code>persistent</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launched-availability-zone</code> - The Availability Zone in which the bid is launched.
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
     * One or more Spot instance request IDs.
     * </p>
     * 
     * @return One or more Spot instance request IDs.
     */

    public java.util.List<String> getSpotInstanceRequestIds() {
        if (spotInstanceRequestIds == null) {
            spotInstanceRequestIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return spotInstanceRequestIds;
    }

    /**
     * <p>
     * One or more Spot instance request IDs.
     * </p>
     * 
     * @param spotInstanceRequestIds
     *        One or more Spot instance request IDs.
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
     * One or more Spot instance request IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSpotInstanceRequestIds(java.util.Collection)} or
     * {@link #withSpotInstanceRequestIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param spotInstanceRequestIds
     *        One or more Spot instance request IDs.
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
     * One or more Spot instance request IDs.
     * </p>
     * 
     * @param spotInstanceRequestIds
     *        One or more Spot instance request IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSpotInstanceRequestsRequest withSpotInstanceRequestIds(java.util.Collection<String> spotInstanceRequestIds) {
        setSpotInstanceRequestIds(spotInstanceRequestIds);
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
     * <code>create-time</code> - The time stamp when the Spot instance request was created.
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
     * <code>launch-group</code> - The Spot instance launch group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.delete-on-termination</code> - Indicates whether the Amazon EBS volume is
     * deleted on instance termination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.device-name</code> - The device name for the Amazon EBS volume (for example,
     * <code>/dev/sdh</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.snapshot-id</code> - The ID of the snapshot used for the Amazon EBS volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.volume-size</code> - The size of the Amazon EBS volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.volume-type</code> - The type of the Amazon EBS volume: <code>gp2</code> for
     * General Purpose SSD, <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for Throughput Optimized HDD,
     * <code>sc1</code>for Cold HDD, or <code>standard</code> for Magnetic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.group-id</code> - The security group for the instance.
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
     * <code>launch.monitoring-enabled</code> - Whether monitoring is enabled for the Spot instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.ramdisk-id</code> - The RAM disk ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.network-interface-id</code> - The ID of the network interface.
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
     * <code>network-interface.subnet-id</code> - The ID of the subnet for the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.description</code> - A description of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.private-ip-address</code> - The primary private IP address of the network interface.
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
     * <code>network-interface.group-id</code> - The ID of the security group associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.group-name</code> - The name of the security group associated with the network interface.
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
     * <code>product-description</code> - The product description associated with the instance (<code>Linux/UNIX</code>
     * | <code>Windows</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spot-instance-request-id</code> - The Spot instance request ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spot-price</code> - The maximum hourly price for any Spot instance launched to fulfill the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the Spot instance request (<code>open</code> | <code>active</code> |
     * <code>closed</code> | <code>cancelled</code> | <code>failed</code>). Spot bid status information can help you
     * track your Amazon EC2 Spot instance requests. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html">Spot Bid Status</a> in the Amazon
     * Elastic Compute Cloud User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-code</code> - The short code describing the most recent evaluation of your Spot instance request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-message</code> - The message explaining the status of the Spot instance request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a tag assigned to the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. This filter is independent of the
     * <code>tag-value</code> filter. For example, if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose (regardless of what the tag's value is),
     * and the tag value X (regardless of what the tag's key is). If you want to list only resources where Purpose is X,
     * see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-value</code> - The value of a tag assigned to the resource. This filter is independent of the
     * <code>tag-key</code> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code> - The type of Spot instance request (<code>one-time</code> | <code>persistent</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launched-availability-zone</code> - The Availability Zone in which the bid is launched.
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
     *         <code>create-time</code> - The time stamp when the Spot instance request was created.
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
     *         <code>launch-group</code> - The Spot instance launch group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>launch.block-device-mapping.delete-on-termination</code> - Indicates whether the Amazon EBS volume
     *         is deleted on instance termination.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>launch.block-device-mapping.device-name</code> - The device name for the Amazon EBS volume (for
     *         example, <code>/dev/sdh</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>launch.block-device-mapping.snapshot-id</code> - The ID of the snapshot used for the Amazon EBS
     *         volume.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>launch.block-device-mapping.volume-size</code> - The size of the Amazon EBS volume, in GiB.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>launch.block-device-mapping.volume-type</code> - The type of the Amazon EBS volume:
     *         <code>gp2</code> for General Purpose SSD, <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for
     *         Throughput Optimized HDD, <code>sc1</code>for Cold HDD, or <code>standard</code> for Magnetic.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>launch.group-id</code> - The security group for the instance.
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
     *         <code>launch.monitoring-enabled</code> - Whether monitoring is enabled for the Spot instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>launch.ramdisk-id</code> - The RAM disk ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.network-interface-id</code> - The ID of the network interface.
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
     *         <code>network-interface.subnet-id</code> - The ID of the subnet for the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>network-interface.description</code> - A description of the network interface.
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
     *         <code>network-interface.delete-on-termination</code> - Indicates whether the network interface is deleted
     *         when the instance is terminated.
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
     *         <code>network-interface.group-name</code> - The name of the security group associated with the network
     *         interface.
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
     *         <code>product-description</code> - The product description associated with the instance (
     *         <code>Linux/UNIX</code> | <code>Windows</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>spot-instance-request-id</code> - The Spot instance request ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>spot-price</code> - The maximum hourly price for any Spot instance launched to fulfill the request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state</code> - The state of the Spot instance request (<code>open</code> | <code>active</code> |
     *         <code>closed</code> | <code>cancelled</code> | <code>failed</code>). Spot bid status information can help
     *         you track your Amazon EC2 Spot instance requests. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html">Spot Bid Status</a> in the
     *         Amazon Elastic Compute Cloud User Guide.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>status-code</code> - The short code describing the most recent evaluation of your Spot instance
     *         request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>status-message</code> - The message explaining the status of the Spot instance request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a tag assigned to the resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag-key</code> - The key of a tag assigned to the resource. This filter is independent of the
     *         <code>tag-value</code> filter. For example, if you use both the filter "tag-key=Purpose" and the filter
     *         "tag-value=X", you get any resources assigned both the tag key Purpose (regardless of what the tag's
     *         value is), and the tag value X (regardless of what the tag's key is). If you want to list only resources
     *         where Purpose is X, see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag-value</code> - The value of a tag assigned to the resource. This filter is independent of the
     *         <code>tag-key</code> filter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>type</code> - The type of Spot instance request (<code>one-time</code> | <code>persistent</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>launched-availability-zone</code> - The Availability Zone in which the bid is launched.
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
     * <code>create-time</code> - The time stamp when the Spot instance request was created.
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
     * <code>launch-group</code> - The Spot instance launch group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.delete-on-termination</code> - Indicates whether the Amazon EBS volume is
     * deleted on instance termination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.device-name</code> - The device name for the Amazon EBS volume (for example,
     * <code>/dev/sdh</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.snapshot-id</code> - The ID of the snapshot used for the Amazon EBS volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.volume-size</code> - The size of the Amazon EBS volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.volume-type</code> - The type of the Amazon EBS volume: <code>gp2</code> for
     * General Purpose SSD, <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for Throughput Optimized HDD,
     * <code>sc1</code>for Cold HDD, or <code>standard</code> for Magnetic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.group-id</code> - The security group for the instance.
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
     * <code>launch.monitoring-enabled</code> - Whether monitoring is enabled for the Spot instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.ramdisk-id</code> - The RAM disk ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.network-interface-id</code> - The ID of the network interface.
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
     * <code>network-interface.subnet-id</code> - The ID of the subnet for the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.description</code> - A description of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.private-ip-address</code> - The primary private IP address of the network interface.
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
     * <code>network-interface.group-id</code> - The ID of the security group associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.group-name</code> - The name of the security group associated with the network interface.
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
     * <code>product-description</code> - The product description associated with the instance (<code>Linux/UNIX</code>
     * | <code>Windows</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spot-instance-request-id</code> - The Spot instance request ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spot-price</code> - The maximum hourly price for any Spot instance launched to fulfill the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the Spot instance request (<code>open</code> | <code>active</code> |
     * <code>closed</code> | <code>cancelled</code> | <code>failed</code>). Spot bid status information can help you
     * track your Amazon EC2 Spot instance requests. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html">Spot Bid Status</a> in the Amazon
     * Elastic Compute Cloud User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-code</code> - The short code describing the most recent evaluation of your Spot instance request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-message</code> - The message explaining the status of the Spot instance request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a tag assigned to the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. This filter is independent of the
     * <code>tag-value</code> filter. For example, if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose (regardless of what the tag's value is),
     * and the tag value X (regardless of what the tag's key is). If you want to list only resources where Purpose is X,
     * see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-value</code> - The value of a tag assigned to the resource. This filter is independent of the
     * <code>tag-key</code> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code> - The type of Spot instance request (<code>one-time</code> | <code>persistent</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launched-availability-zone</code> - The Availability Zone in which the bid is launched.
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
     *        <code>create-time</code> - The time stamp when the Spot instance request was created.
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
     *        <code>launch-group</code> - The Spot instance launch group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.block-device-mapping.delete-on-termination</code> - Indicates whether the Amazon EBS volume
     *        is deleted on instance termination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.block-device-mapping.device-name</code> - The device name for the Amazon EBS volume (for
     *        example, <code>/dev/sdh</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.block-device-mapping.snapshot-id</code> - The ID of the snapshot used for the Amazon EBS
     *        volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.block-device-mapping.volume-size</code> - The size of the Amazon EBS volume, in GiB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.block-device-mapping.volume-type</code> - The type of the Amazon EBS volume: <code>gp2</code>
     *        for General Purpose SSD, <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for Throughput
     *        Optimized HDD, <code>sc1</code>for Cold HDD, or <code>standard</code> for Magnetic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.group-id</code> - The security group for the instance.
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
     *        <code>launch.monitoring-enabled</code> - Whether monitoring is enabled for the Spot instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.ramdisk-id</code> - The RAM disk ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.network-interface-id</code> - The ID of the network interface.
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
     *        <code>network-interface.subnet-id</code> - The ID of the subnet for the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.description</code> - A description of the network interface.
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
     *        <code>network-interface.delete-on-termination</code> - Indicates whether the network interface is deleted
     *        when the instance is terminated.
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
     *        <code>network-interface.group-name</code> - The name of the security group associated with the network
     *        interface.
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
     *        <code>product-description</code> - The product description associated with the instance (
     *        <code>Linux/UNIX</code> | <code>Windows</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>spot-instance-request-id</code> - The Spot instance request ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>spot-price</code> - The maximum hourly price for any Spot instance launched to fulfill the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the Spot instance request (<code>open</code> | <code>active</code> |
     *        <code>closed</code> | <code>cancelled</code> | <code>failed</code>). Spot bid status information can help
     *        you track your Amazon EC2 Spot instance requests. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html">Spot Bid Status</a> in the
     *        Amazon Elastic Compute Cloud User Guide.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status-code</code> - The short code describing the most recent evaluation of your Spot instance
     *        request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status-message</code> - The message explaining the status of the Spot instance request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a tag assigned to the resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource. This filter is independent of the
     *        <code>tag-value</code> filter. For example, if you use both the filter "tag-key=Purpose" and the filter
     *        "tag-value=X", you get any resources assigned both the tag key Purpose (regardless of what the tag's value
     *        is), and the tag value X (regardless of what the tag's key is). If you want to list only resources where
     *        Purpose is X, see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-value</code> - The value of a tag assigned to the resource. This filter is independent of the
     *        <code>tag-key</code> filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>type</code> - The type of Spot instance request (<code>one-time</code> | <code>persistent</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launched-availability-zone</code> - The Availability Zone in which the bid is launched.
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
     * <code>create-time</code> - The time stamp when the Spot instance request was created.
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
     * <code>launch-group</code> - The Spot instance launch group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.delete-on-termination</code> - Indicates whether the Amazon EBS volume is
     * deleted on instance termination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.device-name</code> - The device name for the Amazon EBS volume (for example,
     * <code>/dev/sdh</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.snapshot-id</code> - The ID of the snapshot used for the Amazon EBS volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.volume-size</code> - The size of the Amazon EBS volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.volume-type</code> - The type of the Amazon EBS volume: <code>gp2</code> for
     * General Purpose SSD, <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for Throughput Optimized HDD,
     * <code>sc1</code>for Cold HDD, or <code>standard</code> for Magnetic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.group-id</code> - The security group for the instance.
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
     * <code>launch.monitoring-enabled</code> - Whether monitoring is enabled for the Spot instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.ramdisk-id</code> - The RAM disk ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.network-interface-id</code> - The ID of the network interface.
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
     * <code>network-interface.subnet-id</code> - The ID of the subnet for the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.description</code> - A description of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.private-ip-address</code> - The primary private IP address of the network interface.
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
     * <code>network-interface.group-id</code> - The ID of the security group associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.group-name</code> - The name of the security group associated with the network interface.
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
     * <code>product-description</code> - The product description associated with the instance (<code>Linux/UNIX</code>
     * | <code>Windows</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spot-instance-request-id</code> - The Spot instance request ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spot-price</code> - The maximum hourly price for any Spot instance launched to fulfill the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the Spot instance request (<code>open</code> | <code>active</code> |
     * <code>closed</code> | <code>cancelled</code> | <code>failed</code>). Spot bid status information can help you
     * track your Amazon EC2 Spot instance requests. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html">Spot Bid Status</a> in the Amazon
     * Elastic Compute Cloud User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-code</code> - The short code describing the most recent evaluation of your Spot instance request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-message</code> - The message explaining the status of the Spot instance request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a tag assigned to the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. This filter is independent of the
     * <code>tag-value</code> filter. For example, if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose (regardless of what the tag's value is),
     * and the tag value X (regardless of what the tag's key is). If you want to list only resources where Purpose is X,
     * see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-value</code> - The value of a tag assigned to the resource. This filter is independent of the
     * <code>tag-key</code> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code> - The type of Spot instance request (<code>one-time</code> | <code>persistent</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launched-availability-zone</code> - The Availability Zone in which the bid is launched.
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
     *        <code>create-time</code> - The time stamp when the Spot instance request was created.
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
     *        <code>launch-group</code> - The Spot instance launch group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.block-device-mapping.delete-on-termination</code> - Indicates whether the Amazon EBS volume
     *        is deleted on instance termination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.block-device-mapping.device-name</code> - The device name for the Amazon EBS volume (for
     *        example, <code>/dev/sdh</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.block-device-mapping.snapshot-id</code> - The ID of the snapshot used for the Amazon EBS
     *        volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.block-device-mapping.volume-size</code> - The size of the Amazon EBS volume, in GiB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.block-device-mapping.volume-type</code> - The type of the Amazon EBS volume: <code>gp2</code>
     *        for General Purpose SSD, <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for Throughput
     *        Optimized HDD, <code>sc1</code>for Cold HDD, or <code>standard</code> for Magnetic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.group-id</code> - The security group for the instance.
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
     *        <code>launch.monitoring-enabled</code> - Whether monitoring is enabled for the Spot instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.ramdisk-id</code> - The RAM disk ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.network-interface-id</code> - The ID of the network interface.
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
     *        <code>network-interface.subnet-id</code> - The ID of the subnet for the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.description</code> - A description of the network interface.
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
     *        <code>network-interface.delete-on-termination</code> - Indicates whether the network interface is deleted
     *        when the instance is terminated.
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
     *        <code>network-interface.group-name</code> - The name of the security group associated with the network
     *        interface.
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
     *        <code>product-description</code> - The product description associated with the instance (
     *        <code>Linux/UNIX</code> | <code>Windows</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>spot-instance-request-id</code> - The Spot instance request ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>spot-price</code> - The maximum hourly price for any Spot instance launched to fulfill the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the Spot instance request (<code>open</code> | <code>active</code> |
     *        <code>closed</code> | <code>cancelled</code> | <code>failed</code>). Spot bid status information can help
     *        you track your Amazon EC2 Spot instance requests. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html">Spot Bid Status</a> in the
     *        Amazon Elastic Compute Cloud User Guide.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status-code</code> - The short code describing the most recent evaluation of your Spot instance
     *        request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status-message</code> - The message explaining the status of the Spot instance request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a tag assigned to the resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource. This filter is independent of the
     *        <code>tag-value</code> filter. For example, if you use both the filter "tag-key=Purpose" and the filter
     *        "tag-value=X", you get any resources assigned both the tag key Purpose (regardless of what the tag's value
     *        is), and the tag value X (regardless of what the tag's key is). If you want to list only resources where
     *        Purpose is X, see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-value</code> - The value of a tag assigned to the resource. This filter is independent of the
     *        <code>tag-key</code> filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>type</code> - The type of Spot instance request (<code>one-time</code> | <code>persistent</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launched-availability-zone</code> - The Availability Zone in which the bid is launched.
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
     * <code>create-time</code> - The time stamp when the Spot instance request was created.
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
     * <code>launch-group</code> - The Spot instance launch group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.delete-on-termination</code> - Indicates whether the Amazon EBS volume is
     * deleted on instance termination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.device-name</code> - The device name for the Amazon EBS volume (for example,
     * <code>/dev/sdh</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.snapshot-id</code> - The ID of the snapshot used for the Amazon EBS volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.volume-size</code> - The size of the Amazon EBS volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.block-device-mapping.volume-type</code> - The type of the Amazon EBS volume: <code>gp2</code> for
     * General Purpose SSD, <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for Throughput Optimized HDD,
     * <code>sc1</code>for Cold HDD, or <code>standard</code> for Magnetic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.group-id</code> - The security group for the instance.
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
     * <code>launch.monitoring-enabled</code> - Whether monitoring is enabled for the Spot instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launch.ramdisk-id</code> - The RAM disk ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.network-interface-id</code> - The ID of the network interface.
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
     * <code>network-interface.subnet-id</code> - The ID of the subnet for the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.description</code> - A description of the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.private-ip-address</code> - The primary private IP address of the network interface.
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
     * <code>network-interface.group-id</code> - The ID of the security group associated with the network interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>network-interface.group-name</code> - The name of the security group associated with the network interface.
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
     * <code>product-description</code> - The product description associated with the instance (<code>Linux/UNIX</code>
     * | <code>Windows</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spot-instance-request-id</code> - The Spot instance request ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>spot-price</code> - The maximum hourly price for any Spot instance launched to fulfill the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the Spot instance request (<code>open</code> | <code>active</code> |
     * <code>closed</code> | <code>cancelled</code> | <code>failed</code>). Spot bid status information can help you
     * track your Amazon EC2 Spot instance requests. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html">Spot Bid Status</a> in the Amazon
     * Elastic Compute Cloud User Guide.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-code</code> - The short code describing the most recent evaluation of your Spot instance request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status-message</code> - The message explaining the status of the Spot instance request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a tag assigned to the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. This filter is independent of the
     * <code>tag-value</code> filter. For example, if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose (regardless of what the tag's value is),
     * and the tag value X (regardless of what the tag's key is). If you want to list only resources where Purpose is X,
     * see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-value</code> - The value of a tag assigned to the resource. This filter is independent of the
     * <code>tag-key</code> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>type</code> - The type of Spot instance request (<code>one-time</code> | <code>persistent</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>launched-availability-zone</code> - The Availability Zone in which the bid is launched.
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
     *        <code>create-time</code> - The time stamp when the Spot instance request was created.
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
     *        <code>launch-group</code> - The Spot instance launch group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.block-device-mapping.delete-on-termination</code> - Indicates whether the Amazon EBS volume
     *        is deleted on instance termination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.block-device-mapping.device-name</code> - The device name for the Amazon EBS volume (for
     *        example, <code>/dev/sdh</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.block-device-mapping.snapshot-id</code> - The ID of the snapshot used for the Amazon EBS
     *        volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.block-device-mapping.volume-size</code> - The size of the Amazon EBS volume, in GiB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.block-device-mapping.volume-type</code> - The type of the Amazon EBS volume: <code>gp2</code>
     *        for General Purpose SSD, <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for Throughput
     *        Optimized HDD, <code>sc1</code>for Cold HDD, or <code>standard</code> for Magnetic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.group-id</code> - The security group for the instance.
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
     *        <code>launch.monitoring-enabled</code> - Whether monitoring is enabled for the Spot instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launch.ramdisk-id</code> - The RAM disk ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.network-interface-id</code> - The ID of the network interface.
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
     *        <code>network-interface.subnet-id</code> - The ID of the subnet for the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>network-interface.description</code> - A description of the network interface.
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
     *        <code>network-interface.delete-on-termination</code> - Indicates whether the network interface is deleted
     *        when the instance is terminated.
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
     *        <code>network-interface.group-name</code> - The name of the security group associated with the network
     *        interface.
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
     *        <code>product-description</code> - The product description associated with the instance (
     *        <code>Linux/UNIX</code> | <code>Windows</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>spot-instance-request-id</code> - The Spot instance request ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>spot-price</code> - The maximum hourly price for any Spot instance launched to fulfill the request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the Spot instance request (<code>open</code> | <code>active</code> |
     *        <code>closed</code> | <code>cancelled</code> | <code>failed</code>). Spot bid status information can help
     *        you track your Amazon EC2 Spot instance requests. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html">Spot Bid Status</a> in the
     *        Amazon Elastic Compute Cloud User Guide.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status-code</code> - The short code describing the most recent evaluation of your Spot instance
     *        request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status-message</code> - The message explaining the status of the Spot instance request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a tag assigned to the resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource. This filter is independent of the
     *        <code>tag-value</code> filter. For example, if you use both the filter "tag-key=Purpose" and the filter
     *        "tag-value=X", you get any resources assigned both the tag key Purpose (regardless of what the tag's value
     *        is), and the tag value X (regardless of what the tag's key is). If you want to list only resources where
     *        Purpose is X, see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-value</code> - The value of a tag assigned to the resource. This filter is independent of the
     *        <code>tag-key</code> filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>type</code> - The type of Spot instance request (<code>one-time</code> | <code>persistent</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>launched-availability-zone</code> - The Availability Zone in which the bid is launched.
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
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSpotInstanceRequestIds() != null)
            sb.append("SpotInstanceRequestIds: " + getSpotInstanceRequestIds() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters());
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
        if (other.getSpotInstanceRequestIds() == null ^ this.getSpotInstanceRequestIds() == null)
            return false;
        if (other.getSpotInstanceRequestIds() != null && other.getSpotInstanceRequestIds().equals(this.getSpotInstanceRequestIds()) == false)
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

        hashCode = prime * hashCode + ((getSpotInstanceRequestIds() == null) ? 0 : getSpotInstanceRequestIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSpotInstanceRequestsRequest clone() {
        return (DescribeSpotInstanceRequestsRequest) super.clone();
    }
}
