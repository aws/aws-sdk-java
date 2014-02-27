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
import com.amazonaws.services.ec2.model.transform.DescribeSpotInstanceRequestsRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeSpotInstanceRequests(DescribeSpotInstanceRequestsRequest) DescribeSpotInstanceRequests operation}.
 * <p>
 * Describes the Spot Instance requests that belong to your account. Spot
 * Instances are instances that Amazon EC2 starts on your behalf when the
 * maximum price that you specify exceeds the current Spot Price. Amazon
 * EC2 periodically sets the Spot Price based on available Spot Instance
 * capacity and current Spot Instance requests. For more information
 * about Spot Instances, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-spot-instances.html"> Spot Instances </a>
 * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 * <p>
 * You can use <code>DescribeSpotInstanceRequests</code> to find a
 * running Spot Instance by examining the response. If the status of the
 * Spot Instance is <code>fulfilled</code> , the instance ID appears in
 * the response and contains the identifier of the instance.
 * Alternatively, you can use DescribeInstances with a filter to look for
 * instances where the instance lifecycle is <code>spot</code> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeSpotInstanceRequests(DescribeSpotInstanceRequestsRequest)
 */
public class DescribeSpotInstanceRequestsRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeSpotInstanceRequestsRequest> {

    /**
     * One or more Spot Instance request IDs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> spotInstanceRequestIds;

    /**
     * One or more filters. <ul> <li> <p><code>availability-zone-group</code>
     * - The Availability Zone group. </li> <li> <p><code>create-time</code>
     * - The time stamp when the Spot Instance request was created. </li>
     * <li> <p><code>fault-code</code> - The fault code related to the
     * request. </li> <li> <p><code>fault-message</code> - The fault message
     * related to the request. </li> <li> <p><code>instance-id</code> - The
     * ID of the instance that fulfilled the request. </li> <li>
     * <p><code>launch-group</code> - The Spot Instance launch group. </li>
     * <li> <p><code>launch.block-device-mapping.delete-on-termination</code>
     * - Indicates whether the Amazon EBS volume is deleted on instance
     * termination. </li> <li>
     * <p><code>launch.block-device-mapping.device-name</code> - The device
     * name for the Amazon EBS volume (for example, <code>/dev/sdh</code>).
     * </li> <li> <p><code>launch.block-device-mapping.snapshot-id</code> -
     * The ID of the snapshot used for the Amazon EBS volume. </li> <li>
     * <p><code>launch.block-device-mapping.volume-size</code> - The size of
     * the Amazon EBS volume, in GiB. </li> <li>
     * <p><code>launch.block-device-mapping.volume-type</code> - The type of
     * the Amazon EBS volume (<code>standard</code> | <code>io1</code>).
     * </li> <li> <p><code>launch.group-id</code> - The security group for
     * the instance. </li> <li> <p><code>launch.image-id</code> - The ID of
     * the AMI. </li> <li> <p><code>launch.instance-type</code> - The type of
     * instance (for example, <code>m1.small</code>). </li> <li>
     * <p><code>launch.kernel-id</code> - The kernel ID. </li> <li>
     * <p><code>launch.key-name</code> - The name of the key pair the
     * instance launched with. </li> <li>
     * <p><code>launch.monitoring-enabled</code> - Whether monitoring is
     * enabled for the Spot Instance. </li> <li>
     * <p><code>launch.ramdisk-id</code> - The RAM disk ID. </li> <li>
     * <p><code>launch.network-interface.network-interface-id</code> - The ID
     * of the network interface. </li> <li>
     * <p><code>launch.network-interface.device-index</code> - The index of
     * the device for the network interface attachment on the instance. </li>
     * <li> <p><code>launch.network-interface.subnet-id</code> - The ID of
     * the subnet for the instance. </li> <li>
     * <p><code>launch.network-interface.description</code> - A description
     * of the network interface. </li> <li>
     * <p><code>launch.network-interface.private-ip-address</code> - The
     * primary private IP address of the network interface. </li> <li>
     * <p><code>launch.network-interface.delete-on-termination</code> -
     * Indicates whether the network interface is deleted when the instance
     * is terminated. </li> <li>
     * <p><code>launch.network-interface.group-id</code> - The ID of the
     * security group associated with the network interface. </li> <li>
     * <p><code>launch.network-interface.group-name</code> - The name of the
     * security group associated with the network interface. </li> <li>
     * <p><code>launch.network-interface.addresses.primary</code> - Indicates
     * whether the IP address is the primary private IP address. </li> <li>
     * <p><code>product-description</code> - The product description
     * associated with the instance (<code>Linux/UNIX</code> |
     * <code>Windows</code>). </li> <li>
     * <p><code>spot-instance-request-id</code> - The Spot Instance request
     * ID. </li> <li> <p><code>spot-price</code> - The maximum hourly price
     * for any Spot Instance launched to fulfill the request. </li> <li>
     * <p><code>state</code> - The state of the Spot Instance request
     * (<code>open</code> | <code>active</code> | <code>closed</code> |
     * <code>cancelled</code> | <code>failed</code>). </li> <li>
     * <p><code>status-code</code> - The short code describing the most
     * recent evaluation of your Spot Instance request. </li> <li>
     * <p><code>status-message</code> - The message explaining the status of
     * the Spot Instance request. </li> <li>
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
     * filter. </li> <li> <p><code>type</code> - The type of Spot Instance
     * request (<code>one-time</code> | <code>persistent</code>). </li> <li>
     * <p><code>launched-availability-zone</code> - The Availability Zone in
     * which the bid is launched. </li> <li> <p><code>valid-from</code> - The
     * start date of the request. </li> <li> <p><code>valid-until</code> -
     * The end date of the request. </li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * One or more Spot Instance request IDs.
     *
     * @return One or more Spot Instance request IDs.
     */
    public java.util.List<String> getSpotInstanceRequestIds() {
        if (spotInstanceRequestIds == null) {
              spotInstanceRequestIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              spotInstanceRequestIds.setAutoConstruct(true);
        }
        return spotInstanceRequestIds;
    }
    
    /**
     * One or more Spot Instance request IDs.
     *
     * @param spotInstanceRequestIds One or more Spot Instance request IDs.
     */
    public void setSpotInstanceRequestIds(java.util.Collection<String> spotInstanceRequestIds) {
        if (spotInstanceRequestIds == null) {
            this.spotInstanceRequestIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> spotInstanceRequestIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(spotInstanceRequestIds.size());
        spotInstanceRequestIdsCopy.addAll(spotInstanceRequestIds);
        this.spotInstanceRequestIds = spotInstanceRequestIdsCopy;
    }
    
    /**
     * One or more Spot Instance request IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotInstanceRequestIds One or more Spot Instance request IDs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSpotInstanceRequestsRequest withSpotInstanceRequestIds(String... spotInstanceRequestIds) {
        if (getSpotInstanceRequestIds() == null) setSpotInstanceRequestIds(new java.util.ArrayList<String>(spotInstanceRequestIds.length));
        for (String value : spotInstanceRequestIds) {
            getSpotInstanceRequestIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more Spot Instance request IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotInstanceRequestIds One or more Spot Instance request IDs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSpotInstanceRequestsRequest withSpotInstanceRequestIds(java.util.Collection<String> spotInstanceRequestIds) {
        if (spotInstanceRequestIds == null) {
            this.spotInstanceRequestIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> spotInstanceRequestIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(spotInstanceRequestIds.size());
            spotInstanceRequestIdsCopy.addAll(spotInstanceRequestIds);
            this.spotInstanceRequestIds = spotInstanceRequestIdsCopy;
        }

        return this;
    }

    /**
     * One or more filters. <ul> <li> <p><code>availability-zone-group</code>
     * - The Availability Zone group. </li> <li> <p><code>create-time</code>
     * - The time stamp when the Spot Instance request was created. </li>
     * <li> <p><code>fault-code</code> - The fault code related to the
     * request. </li> <li> <p><code>fault-message</code> - The fault message
     * related to the request. </li> <li> <p><code>instance-id</code> - The
     * ID of the instance that fulfilled the request. </li> <li>
     * <p><code>launch-group</code> - The Spot Instance launch group. </li>
     * <li> <p><code>launch.block-device-mapping.delete-on-termination</code>
     * - Indicates whether the Amazon EBS volume is deleted on instance
     * termination. </li> <li>
     * <p><code>launch.block-device-mapping.device-name</code> - The device
     * name for the Amazon EBS volume (for example, <code>/dev/sdh</code>).
     * </li> <li> <p><code>launch.block-device-mapping.snapshot-id</code> -
     * The ID of the snapshot used for the Amazon EBS volume. </li> <li>
     * <p><code>launch.block-device-mapping.volume-size</code> - The size of
     * the Amazon EBS volume, in GiB. </li> <li>
     * <p><code>launch.block-device-mapping.volume-type</code> - The type of
     * the Amazon EBS volume (<code>standard</code> | <code>io1</code>).
     * </li> <li> <p><code>launch.group-id</code> - The security group for
     * the instance. </li> <li> <p><code>launch.image-id</code> - The ID of
     * the AMI. </li> <li> <p><code>launch.instance-type</code> - The type of
     * instance (for example, <code>m1.small</code>). </li> <li>
     * <p><code>launch.kernel-id</code> - The kernel ID. </li> <li>
     * <p><code>launch.key-name</code> - The name of the key pair the
     * instance launched with. </li> <li>
     * <p><code>launch.monitoring-enabled</code> - Whether monitoring is
     * enabled for the Spot Instance. </li> <li>
     * <p><code>launch.ramdisk-id</code> - The RAM disk ID. </li> <li>
     * <p><code>launch.network-interface.network-interface-id</code> - The ID
     * of the network interface. </li> <li>
     * <p><code>launch.network-interface.device-index</code> - The index of
     * the device for the network interface attachment on the instance. </li>
     * <li> <p><code>launch.network-interface.subnet-id</code> - The ID of
     * the subnet for the instance. </li> <li>
     * <p><code>launch.network-interface.description</code> - A description
     * of the network interface. </li> <li>
     * <p><code>launch.network-interface.private-ip-address</code> - The
     * primary private IP address of the network interface. </li> <li>
     * <p><code>launch.network-interface.delete-on-termination</code> -
     * Indicates whether the network interface is deleted when the instance
     * is terminated. </li> <li>
     * <p><code>launch.network-interface.group-id</code> - The ID of the
     * security group associated with the network interface. </li> <li>
     * <p><code>launch.network-interface.group-name</code> - The name of the
     * security group associated with the network interface. </li> <li>
     * <p><code>launch.network-interface.addresses.primary</code> - Indicates
     * whether the IP address is the primary private IP address. </li> <li>
     * <p><code>product-description</code> - The product description
     * associated with the instance (<code>Linux/UNIX</code> |
     * <code>Windows</code>). </li> <li>
     * <p><code>spot-instance-request-id</code> - The Spot Instance request
     * ID. </li> <li> <p><code>spot-price</code> - The maximum hourly price
     * for any Spot Instance launched to fulfill the request. </li> <li>
     * <p><code>state</code> - The state of the Spot Instance request
     * (<code>open</code> | <code>active</code> | <code>closed</code> |
     * <code>cancelled</code> | <code>failed</code>). </li> <li>
     * <p><code>status-code</code> - The short code describing the most
     * recent evaluation of your Spot Instance request. </li> <li>
     * <p><code>status-message</code> - The message explaining the status of
     * the Spot Instance request. </li> <li>
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
     * filter. </li> <li> <p><code>type</code> - The type of Spot Instance
     * request (<code>one-time</code> | <code>persistent</code>). </li> <li>
     * <p><code>launched-availability-zone</code> - The Availability Zone in
     * which the bid is launched. </li> <li> <p><code>valid-from</code> - The
     * start date of the request. </li> <li> <p><code>valid-until</code> -
     * The end date of the request. </li> </ul>
     *
     * @return One or more filters. <ul> <li> <p><code>availability-zone-group</code>
     *         - The Availability Zone group. </li> <li> <p><code>create-time</code>
     *         - The time stamp when the Spot Instance request was created. </li>
     *         <li> <p><code>fault-code</code> - The fault code related to the
     *         request. </li> <li> <p><code>fault-message</code> - The fault message
     *         related to the request. </li> <li> <p><code>instance-id</code> - The
     *         ID of the instance that fulfilled the request. </li> <li>
     *         <p><code>launch-group</code> - The Spot Instance launch group. </li>
     *         <li> <p><code>launch.block-device-mapping.delete-on-termination</code>
     *         - Indicates whether the Amazon EBS volume is deleted on instance
     *         termination. </li> <li>
     *         <p><code>launch.block-device-mapping.device-name</code> - The device
     *         name for the Amazon EBS volume (for example, <code>/dev/sdh</code>).
     *         </li> <li> <p><code>launch.block-device-mapping.snapshot-id</code> -
     *         The ID of the snapshot used for the Amazon EBS volume. </li> <li>
     *         <p><code>launch.block-device-mapping.volume-size</code> - The size of
     *         the Amazon EBS volume, in GiB. </li> <li>
     *         <p><code>launch.block-device-mapping.volume-type</code> - The type of
     *         the Amazon EBS volume (<code>standard</code> | <code>io1</code>).
     *         </li> <li> <p><code>launch.group-id</code> - The security group for
     *         the instance. </li> <li> <p><code>launch.image-id</code> - The ID of
     *         the AMI. </li> <li> <p><code>launch.instance-type</code> - The type of
     *         instance (for example, <code>m1.small</code>). </li> <li>
     *         <p><code>launch.kernel-id</code> - The kernel ID. </li> <li>
     *         <p><code>launch.key-name</code> - The name of the key pair the
     *         instance launched with. </li> <li>
     *         <p><code>launch.monitoring-enabled</code> - Whether monitoring is
     *         enabled for the Spot Instance. </li> <li>
     *         <p><code>launch.ramdisk-id</code> - The RAM disk ID. </li> <li>
     *         <p><code>launch.network-interface.network-interface-id</code> - The ID
     *         of the network interface. </li> <li>
     *         <p><code>launch.network-interface.device-index</code> - The index of
     *         the device for the network interface attachment on the instance. </li>
     *         <li> <p><code>launch.network-interface.subnet-id</code> - The ID of
     *         the subnet for the instance. </li> <li>
     *         <p><code>launch.network-interface.description</code> - A description
     *         of the network interface. </li> <li>
     *         <p><code>launch.network-interface.private-ip-address</code> - The
     *         primary private IP address of the network interface. </li> <li>
     *         <p><code>launch.network-interface.delete-on-termination</code> -
     *         Indicates whether the network interface is deleted when the instance
     *         is terminated. </li> <li>
     *         <p><code>launch.network-interface.group-id</code> - The ID of the
     *         security group associated with the network interface. </li> <li>
     *         <p><code>launch.network-interface.group-name</code> - The name of the
     *         security group associated with the network interface. </li> <li>
     *         <p><code>launch.network-interface.addresses.primary</code> - Indicates
     *         whether the IP address is the primary private IP address. </li> <li>
     *         <p><code>product-description</code> - The product description
     *         associated with the instance (<code>Linux/UNIX</code> |
     *         <code>Windows</code>). </li> <li>
     *         <p><code>spot-instance-request-id</code> - The Spot Instance request
     *         ID. </li> <li> <p><code>spot-price</code> - The maximum hourly price
     *         for any Spot Instance launched to fulfill the request. </li> <li>
     *         <p><code>state</code> - The state of the Spot Instance request
     *         (<code>open</code> | <code>active</code> | <code>closed</code> |
     *         <code>cancelled</code> | <code>failed</code>). </li> <li>
     *         <p><code>status-code</code> - The short code describing the most
     *         recent evaluation of your Spot Instance request. </li> <li>
     *         <p><code>status-message</code> - The message explaining the status of
     *         the Spot Instance request. </li> <li>
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
     *         filter. </li> <li> <p><code>type</code> - The type of Spot Instance
     *         request (<code>one-time</code> | <code>persistent</code>). </li> <li>
     *         <p><code>launched-availability-zone</code> - The Availability Zone in
     *         which the bid is launched. </li> <li> <p><code>valid-from</code> - The
     *         start date of the request. </li> <li> <p><code>valid-until</code> -
     *         The end date of the request. </li> </ul>
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>availability-zone-group</code>
     * - The Availability Zone group. </li> <li> <p><code>create-time</code>
     * - The time stamp when the Spot Instance request was created. </li>
     * <li> <p><code>fault-code</code> - The fault code related to the
     * request. </li> <li> <p><code>fault-message</code> - The fault message
     * related to the request. </li> <li> <p><code>instance-id</code> - The
     * ID of the instance that fulfilled the request. </li> <li>
     * <p><code>launch-group</code> - The Spot Instance launch group. </li>
     * <li> <p><code>launch.block-device-mapping.delete-on-termination</code>
     * - Indicates whether the Amazon EBS volume is deleted on instance
     * termination. </li> <li>
     * <p><code>launch.block-device-mapping.device-name</code> - The device
     * name for the Amazon EBS volume (for example, <code>/dev/sdh</code>).
     * </li> <li> <p><code>launch.block-device-mapping.snapshot-id</code> -
     * The ID of the snapshot used for the Amazon EBS volume. </li> <li>
     * <p><code>launch.block-device-mapping.volume-size</code> - The size of
     * the Amazon EBS volume, in GiB. </li> <li>
     * <p><code>launch.block-device-mapping.volume-type</code> - The type of
     * the Amazon EBS volume (<code>standard</code> | <code>io1</code>).
     * </li> <li> <p><code>launch.group-id</code> - The security group for
     * the instance. </li> <li> <p><code>launch.image-id</code> - The ID of
     * the AMI. </li> <li> <p><code>launch.instance-type</code> - The type of
     * instance (for example, <code>m1.small</code>). </li> <li>
     * <p><code>launch.kernel-id</code> - The kernel ID. </li> <li>
     * <p><code>launch.key-name</code> - The name of the key pair the
     * instance launched with. </li> <li>
     * <p><code>launch.monitoring-enabled</code> - Whether monitoring is
     * enabled for the Spot Instance. </li> <li>
     * <p><code>launch.ramdisk-id</code> - The RAM disk ID. </li> <li>
     * <p><code>launch.network-interface.network-interface-id</code> - The ID
     * of the network interface. </li> <li>
     * <p><code>launch.network-interface.device-index</code> - The index of
     * the device for the network interface attachment on the instance. </li>
     * <li> <p><code>launch.network-interface.subnet-id</code> - The ID of
     * the subnet for the instance. </li> <li>
     * <p><code>launch.network-interface.description</code> - A description
     * of the network interface. </li> <li>
     * <p><code>launch.network-interface.private-ip-address</code> - The
     * primary private IP address of the network interface. </li> <li>
     * <p><code>launch.network-interface.delete-on-termination</code> -
     * Indicates whether the network interface is deleted when the instance
     * is terminated. </li> <li>
     * <p><code>launch.network-interface.group-id</code> - The ID of the
     * security group associated with the network interface. </li> <li>
     * <p><code>launch.network-interface.group-name</code> - The name of the
     * security group associated with the network interface. </li> <li>
     * <p><code>launch.network-interface.addresses.primary</code> - Indicates
     * whether the IP address is the primary private IP address. </li> <li>
     * <p><code>product-description</code> - The product description
     * associated with the instance (<code>Linux/UNIX</code> |
     * <code>Windows</code>). </li> <li>
     * <p><code>spot-instance-request-id</code> - The Spot Instance request
     * ID. </li> <li> <p><code>spot-price</code> - The maximum hourly price
     * for any Spot Instance launched to fulfill the request. </li> <li>
     * <p><code>state</code> - The state of the Spot Instance request
     * (<code>open</code> | <code>active</code> | <code>closed</code> |
     * <code>cancelled</code> | <code>failed</code>). </li> <li>
     * <p><code>status-code</code> - The short code describing the most
     * recent evaluation of your Spot Instance request. </li> <li>
     * <p><code>status-message</code> - The message explaining the status of
     * the Spot Instance request. </li> <li>
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
     * filter. </li> <li> <p><code>type</code> - The type of Spot Instance
     * request (<code>one-time</code> | <code>persistent</code>). </li> <li>
     * <p><code>launched-availability-zone</code> - The Availability Zone in
     * which the bid is launched. </li> <li> <p><code>valid-from</code> - The
     * start date of the request. </li> <li> <p><code>valid-until</code> -
     * The end date of the request. </li> </ul>
     *
     * @param filters One or more filters. <ul> <li> <p><code>availability-zone-group</code>
     *         - The Availability Zone group. </li> <li> <p><code>create-time</code>
     *         - The time stamp when the Spot Instance request was created. </li>
     *         <li> <p><code>fault-code</code> - The fault code related to the
     *         request. </li> <li> <p><code>fault-message</code> - The fault message
     *         related to the request. </li> <li> <p><code>instance-id</code> - The
     *         ID of the instance that fulfilled the request. </li> <li>
     *         <p><code>launch-group</code> - The Spot Instance launch group. </li>
     *         <li> <p><code>launch.block-device-mapping.delete-on-termination</code>
     *         - Indicates whether the Amazon EBS volume is deleted on instance
     *         termination. </li> <li>
     *         <p><code>launch.block-device-mapping.device-name</code> - The device
     *         name for the Amazon EBS volume (for example, <code>/dev/sdh</code>).
     *         </li> <li> <p><code>launch.block-device-mapping.snapshot-id</code> -
     *         The ID of the snapshot used for the Amazon EBS volume. </li> <li>
     *         <p><code>launch.block-device-mapping.volume-size</code> - The size of
     *         the Amazon EBS volume, in GiB. </li> <li>
     *         <p><code>launch.block-device-mapping.volume-type</code> - The type of
     *         the Amazon EBS volume (<code>standard</code> | <code>io1</code>).
     *         </li> <li> <p><code>launch.group-id</code> - The security group for
     *         the instance. </li> <li> <p><code>launch.image-id</code> - The ID of
     *         the AMI. </li> <li> <p><code>launch.instance-type</code> - The type of
     *         instance (for example, <code>m1.small</code>). </li> <li>
     *         <p><code>launch.kernel-id</code> - The kernel ID. </li> <li>
     *         <p><code>launch.key-name</code> - The name of the key pair the
     *         instance launched with. </li> <li>
     *         <p><code>launch.monitoring-enabled</code> - Whether monitoring is
     *         enabled for the Spot Instance. </li> <li>
     *         <p><code>launch.ramdisk-id</code> - The RAM disk ID. </li> <li>
     *         <p><code>launch.network-interface.network-interface-id</code> - The ID
     *         of the network interface. </li> <li>
     *         <p><code>launch.network-interface.device-index</code> - The index of
     *         the device for the network interface attachment on the instance. </li>
     *         <li> <p><code>launch.network-interface.subnet-id</code> - The ID of
     *         the subnet for the instance. </li> <li>
     *         <p><code>launch.network-interface.description</code> - A description
     *         of the network interface. </li> <li>
     *         <p><code>launch.network-interface.private-ip-address</code> - The
     *         primary private IP address of the network interface. </li> <li>
     *         <p><code>launch.network-interface.delete-on-termination</code> -
     *         Indicates whether the network interface is deleted when the instance
     *         is terminated. </li> <li>
     *         <p><code>launch.network-interface.group-id</code> - The ID of the
     *         security group associated with the network interface. </li> <li>
     *         <p><code>launch.network-interface.group-name</code> - The name of the
     *         security group associated with the network interface. </li> <li>
     *         <p><code>launch.network-interface.addresses.primary</code> - Indicates
     *         whether the IP address is the primary private IP address. </li> <li>
     *         <p><code>product-description</code> - The product description
     *         associated with the instance (<code>Linux/UNIX</code> |
     *         <code>Windows</code>). </li> <li>
     *         <p><code>spot-instance-request-id</code> - The Spot Instance request
     *         ID. </li> <li> <p><code>spot-price</code> - The maximum hourly price
     *         for any Spot Instance launched to fulfill the request. </li> <li>
     *         <p><code>state</code> - The state of the Spot Instance request
     *         (<code>open</code> | <code>active</code> | <code>closed</code> |
     *         <code>cancelled</code> | <code>failed</code>). </li> <li>
     *         <p><code>status-code</code> - The short code describing the most
     *         recent evaluation of your Spot Instance request. </li> <li>
     *         <p><code>status-message</code> - The message explaining the status of
     *         the Spot Instance request. </li> <li>
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
     *         filter. </li> <li> <p><code>type</code> - The type of Spot Instance
     *         request (<code>one-time</code> | <code>persistent</code>). </li> <li>
     *         <p><code>launched-availability-zone</code> - The Availability Zone in
     *         which the bid is launched. </li> <li> <p><code>valid-from</code> - The
     *         start date of the request. </li> <li> <p><code>valid-until</code> -
     *         The end date of the request. </li> </ul>
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
     * One or more filters. <ul> <li> <p><code>availability-zone-group</code>
     * - The Availability Zone group. </li> <li> <p><code>create-time</code>
     * - The time stamp when the Spot Instance request was created. </li>
     * <li> <p><code>fault-code</code> - The fault code related to the
     * request. </li> <li> <p><code>fault-message</code> - The fault message
     * related to the request. </li> <li> <p><code>instance-id</code> - The
     * ID of the instance that fulfilled the request. </li> <li>
     * <p><code>launch-group</code> - The Spot Instance launch group. </li>
     * <li> <p><code>launch.block-device-mapping.delete-on-termination</code>
     * - Indicates whether the Amazon EBS volume is deleted on instance
     * termination. </li> <li>
     * <p><code>launch.block-device-mapping.device-name</code> - The device
     * name for the Amazon EBS volume (for example, <code>/dev/sdh</code>).
     * </li> <li> <p><code>launch.block-device-mapping.snapshot-id</code> -
     * The ID of the snapshot used for the Amazon EBS volume. </li> <li>
     * <p><code>launch.block-device-mapping.volume-size</code> - The size of
     * the Amazon EBS volume, in GiB. </li> <li>
     * <p><code>launch.block-device-mapping.volume-type</code> - The type of
     * the Amazon EBS volume (<code>standard</code> | <code>io1</code>).
     * </li> <li> <p><code>launch.group-id</code> - The security group for
     * the instance. </li> <li> <p><code>launch.image-id</code> - The ID of
     * the AMI. </li> <li> <p><code>launch.instance-type</code> - The type of
     * instance (for example, <code>m1.small</code>). </li> <li>
     * <p><code>launch.kernel-id</code> - The kernel ID. </li> <li>
     * <p><code>launch.key-name</code> - The name of the key pair the
     * instance launched with. </li> <li>
     * <p><code>launch.monitoring-enabled</code> - Whether monitoring is
     * enabled for the Spot Instance. </li> <li>
     * <p><code>launch.ramdisk-id</code> - The RAM disk ID. </li> <li>
     * <p><code>launch.network-interface.network-interface-id</code> - The ID
     * of the network interface. </li> <li>
     * <p><code>launch.network-interface.device-index</code> - The index of
     * the device for the network interface attachment on the instance. </li>
     * <li> <p><code>launch.network-interface.subnet-id</code> - The ID of
     * the subnet for the instance. </li> <li>
     * <p><code>launch.network-interface.description</code> - A description
     * of the network interface. </li> <li>
     * <p><code>launch.network-interface.private-ip-address</code> - The
     * primary private IP address of the network interface. </li> <li>
     * <p><code>launch.network-interface.delete-on-termination</code> -
     * Indicates whether the network interface is deleted when the instance
     * is terminated. </li> <li>
     * <p><code>launch.network-interface.group-id</code> - The ID of the
     * security group associated with the network interface. </li> <li>
     * <p><code>launch.network-interface.group-name</code> - The name of the
     * security group associated with the network interface. </li> <li>
     * <p><code>launch.network-interface.addresses.primary</code> - Indicates
     * whether the IP address is the primary private IP address. </li> <li>
     * <p><code>product-description</code> - The product description
     * associated with the instance (<code>Linux/UNIX</code> |
     * <code>Windows</code>). </li> <li>
     * <p><code>spot-instance-request-id</code> - The Spot Instance request
     * ID. </li> <li> <p><code>spot-price</code> - The maximum hourly price
     * for any Spot Instance launched to fulfill the request. </li> <li>
     * <p><code>state</code> - The state of the Spot Instance request
     * (<code>open</code> | <code>active</code> | <code>closed</code> |
     * <code>cancelled</code> | <code>failed</code>). </li> <li>
     * <p><code>status-code</code> - The short code describing the most
     * recent evaluation of your Spot Instance request. </li> <li>
     * <p><code>status-message</code> - The message explaining the status of
     * the Spot Instance request. </li> <li>
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
     * filter. </li> <li> <p><code>type</code> - The type of Spot Instance
     * request (<code>one-time</code> | <code>persistent</code>). </li> <li>
     * <p><code>launched-availability-zone</code> - The Availability Zone in
     * which the bid is launched. </li> <li> <p><code>valid-from</code> - The
     * start date of the request. </li> <li> <p><code>valid-until</code> -
     * The end date of the request. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>availability-zone-group</code>
     *         - The Availability Zone group. </li> <li> <p><code>create-time</code>
     *         - The time stamp when the Spot Instance request was created. </li>
     *         <li> <p><code>fault-code</code> - The fault code related to the
     *         request. </li> <li> <p><code>fault-message</code> - The fault message
     *         related to the request. </li> <li> <p><code>instance-id</code> - The
     *         ID of the instance that fulfilled the request. </li> <li>
     *         <p><code>launch-group</code> - The Spot Instance launch group. </li>
     *         <li> <p><code>launch.block-device-mapping.delete-on-termination</code>
     *         - Indicates whether the Amazon EBS volume is deleted on instance
     *         termination. </li> <li>
     *         <p><code>launch.block-device-mapping.device-name</code> - The device
     *         name for the Amazon EBS volume (for example, <code>/dev/sdh</code>).
     *         </li> <li> <p><code>launch.block-device-mapping.snapshot-id</code> -
     *         The ID of the snapshot used for the Amazon EBS volume. </li> <li>
     *         <p><code>launch.block-device-mapping.volume-size</code> - The size of
     *         the Amazon EBS volume, in GiB. </li> <li>
     *         <p><code>launch.block-device-mapping.volume-type</code> - The type of
     *         the Amazon EBS volume (<code>standard</code> | <code>io1</code>).
     *         </li> <li> <p><code>launch.group-id</code> - The security group for
     *         the instance. </li> <li> <p><code>launch.image-id</code> - The ID of
     *         the AMI. </li> <li> <p><code>launch.instance-type</code> - The type of
     *         instance (for example, <code>m1.small</code>). </li> <li>
     *         <p><code>launch.kernel-id</code> - The kernel ID. </li> <li>
     *         <p><code>launch.key-name</code> - The name of the key pair the
     *         instance launched with. </li> <li>
     *         <p><code>launch.monitoring-enabled</code> - Whether monitoring is
     *         enabled for the Spot Instance. </li> <li>
     *         <p><code>launch.ramdisk-id</code> - The RAM disk ID. </li> <li>
     *         <p><code>launch.network-interface.network-interface-id</code> - The ID
     *         of the network interface. </li> <li>
     *         <p><code>launch.network-interface.device-index</code> - The index of
     *         the device for the network interface attachment on the instance. </li>
     *         <li> <p><code>launch.network-interface.subnet-id</code> - The ID of
     *         the subnet for the instance. </li> <li>
     *         <p><code>launch.network-interface.description</code> - A description
     *         of the network interface. </li> <li>
     *         <p><code>launch.network-interface.private-ip-address</code> - The
     *         primary private IP address of the network interface. </li> <li>
     *         <p><code>launch.network-interface.delete-on-termination</code> -
     *         Indicates whether the network interface is deleted when the instance
     *         is terminated. </li> <li>
     *         <p><code>launch.network-interface.group-id</code> - The ID of the
     *         security group associated with the network interface. </li> <li>
     *         <p><code>launch.network-interface.group-name</code> - The name of the
     *         security group associated with the network interface. </li> <li>
     *         <p><code>launch.network-interface.addresses.primary</code> - Indicates
     *         whether the IP address is the primary private IP address. </li> <li>
     *         <p><code>product-description</code> - The product description
     *         associated with the instance (<code>Linux/UNIX</code> |
     *         <code>Windows</code>). </li> <li>
     *         <p><code>spot-instance-request-id</code> - The Spot Instance request
     *         ID. </li> <li> <p><code>spot-price</code> - The maximum hourly price
     *         for any Spot Instance launched to fulfill the request. </li> <li>
     *         <p><code>state</code> - The state of the Spot Instance request
     *         (<code>open</code> | <code>active</code> | <code>closed</code> |
     *         <code>cancelled</code> | <code>failed</code>). </li> <li>
     *         <p><code>status-code</code> - The short code describing the most
     *         recent evaluation of your Spot Instance request. </li> <li>
     *         <p><code>status-message</code> - The message explaining the status of
     *         the Spot Instance request. </li> <li>
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
     *         filter. </li> <li> <p><code>type</code> - The type of Spot Instance
     *         request (<code>one-time</code> | <code>persistent</code>). </li> <li>
     *         <p><code>launched-availability-zone</code> - The Availability Zone in
     *         which the bid is launched. </li> <li> <p><code>valid-from</code> - The
     *         start date of the request. </li> <li> <p><code>valid-until</code> -
     *         The end date of the request. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSpotInstanceRequestsRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>availability-zone-group</code>
     * - The Availability Zone group. </li> <li> <p><code>create-time</code>
     * - The time stamp when the Spot Instance request was created. </li>
     * <li> <p><code>fault-code</code> - The fault code related to the
     * request. </li> <li> <p><code>fault-message</code> - The fault message
     * related to the request. </li> <li> <p><code>instance-id</code> - The
     * ID of the instance that fulfilled the request. </li> <li>
     * <p><code>launch-group</code> - The Spot Instance launch group. </li>
     * <li> <p><code>launch.block-device-mapping.delete-on-termination</code>
     * - Indicates whether the Amazon EBS volume is deleted on instance
     * termination. </li> <li>
     * <p><code>launch.block-device-mapping.device-name</code> - The device
     * name for the Amazon EBS volume (for example, <code>/dev/sdh</code>).
     * </li> <li> <p><code>launch.block-device-mapping.snapshot-id</code> -
     * The ID of the snapshot used for the Amazon EBS volume. </li> <li>
     * <p><code>launch.block-device-mapping.volume-size</code> - The size of
     * the Amazon EBS volume, in GiB. </li> <li>
     * <p><code>launch.block-device-mapping.volume-type</code> - The type of
     * the Amazon EBS volume (<code>standard</code> | <code>io1</code>).
     * </li> <li> <p><code>launch.group-id</code> - The security group for
     * the instance. </li> <li> <p><code>launch.image-id</code> - The ID of
     * the AMI. </li> <li> <p><code>launch.instance-type</code> - The type of
     * instance (for example, <code>m1.small</code>). </li> <li>
     * <p><code>launch.kernel-id</code> - The kernel ID. </li> <li>
     * <p><code>launch.key-name</code> - The name of the key pair the
     * instance launched with. </li> <li>
     * <p><code>launch.monitoring-enabled</code> - Whether monitoring is
     * enabled for the Spot Instance. </li> <li>
     * <p><code>launch.ramdisk-id</code> - The RAM disk ID. </li> <li>
     * <p><code>launch.network-interface.network-interface-id</code> - The ID
     * of the network interface. </li> <li>
     * <p><code>launch.network-interface.device-index</code> - The index of
     * the device for the network interface attachment on the instance. </li>
     * <li> <p><code>launch.network-interface.subnet-id</code> - The ID of
     * the subnet for the instance. </li> <li>
     * <p><code>launch.network-interface.description</code> - A description
     * of the network interface. </li> <li>
     * <p><code>launch.network-interface.private-ip-address</code> - The
     * primary private IP address of the network interface. </li> <li>
     * <p><code>launch.network-interface.delete-on-termination</code> -
     * Indicates whether the network interface is deleted when the instance
     * is terminated. </li> <li>
     * <p><code>launch.network-interface.group-id</code> - The ID of the
     * security group associated with the network interface. </li> <li>
     * <p><code>launch.network-interface.group-name</code> - The name of the
     * security group associated with the network interface. </li> <li>
     * <p><code>launch.network-interface.addresses.primary</code> - Indicates
     * whether the IP address is the primary private IP address. </li> <li>
     * <p><code>product-description</code> - The product description
     * associated with the instance (<code>Linux/UNIX</code> |
     * <code>Windows</code>). </li> <li>
     * <p><code>spot-instance-request-id</code> - The Spot Instance request
     * ID. </li> <li> <p><code>spot-price</code> - The maximum hourly price
     * for any Spot Instance launched to fulfill the request. </li> <li>
     * <p><code>state</code> - The state of the Spot Instance request
     * (<code>open</code> | <code>active</code> | <code>closed</code> |
     * <code>cancelled</code> | <code>failed</code>). </li> <li>
     * <p><code>status-code</code> - The short code describing the most
     * recent evaluation of your Spot Instance request. </li> <li>
     * <p><code>status-message</code> - The message explaining the status of
     * the Spot Instance request. </li> <li>
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
     * filter. </li> <li> <p><code>type</code> - The type of Spot Instance
     * request (<code>one-time</code> | <code>persistent</code>). </li> <li>
     * <p><code>launched-availability-zone</code> - The Availability Zone in
     * which the bid is launched. </li> <li> <p><code>valid-from</code> - The
     * start date of the request. </li> <li> <p><code>valid-until</code> -
     * The end date of the request. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>availability-zone-group</code>
     *         - The Availability Zone group. </li> <li> <p><code>create-time</code>
     *         - The time stamp when the Spot Instance request was created. </li>
     *         <li> <p><code>fault-code</code> - The fault code related to the
     *         request. </li> <li> <p><code>fault-message</code> - The fault message
     *         related to the request. </li> <li> <p><code>instance-id</code> - The
     *         ID of the instance that fulfilled the request. </li> <li>
     *         <p><code>launch-group</code> - The Spot Instance launch group. </li>
     *         <li> <p><code>launch.block-device-mapping.delete-on-termination</code>
     *         - Indicates whether the Amazon EBS volume is deleted on instance
     *         termination. </li> <li>
     *         <p><code>launch.block-device-mapping.device-name</code> - The device
     *         name for the Amazon EBS volume (for example, <code>/dev/sdh</code>).
     *         </li> <li> <p><code>launch.block-device-mapping.snapshot-id</code> -
     *         The ID of the snapshot used for the Amazon EBS volume. </li> <li>
     *         <p><code>launch.block-device-mapping.volume-size</code> - The size of
     *         the Amazon EBS volume, in GiB. </li> <li>
     *         <p><code>launch.block-device-mapping.volume-type</code> - The type of
     *         the Amazon EBS volume (<code>standard</code> | <code>io1</code>).
     *         </li> <li> <p><code>launch.group-id</code> - The security group for
     *         the instance. </li> <li> <p><code>launch.image-id</code> - The ID of
     *         the AMI. </li> <li> <p><code>launch.instance-type</code> - The type of
     *         instance (for example, <code>m1.small</code>). </li> <li>
     *         <p><code>launch.kernel-id</code> - The kernel ID. </li> <li>
     *         <p><code>launch.key-name</code> - The name of the key pair the
     *         instance launched with. </li> <li>
     *         <p><code>launch.monitoring-enabled</code> - Whether monitoring is
     *         enabled for the Spot Instance. </li> <li>
     *         <p><code>launch.ramdisk-id</code> - The RAM disk ID. </li> <li>
     *         <p><code>launch.network-interface.network-interface-id</code> - The ID
     *         of the network interface. </li> <li>
     *         <p><code>launch.network-interface.device-index</code> - The index of
     *         the device for the network interface attachment on the instance. </li>
     *         <li> <p><code>launch.network-interface.subnet-id</code> - The ID of
     *         the subnet for the instance. </li> <li>
     *         <p><code>launch.network-interface.description</code> - A description
     *         of the network interface. </li> <li>
     *         <p><code>launch.network-interface.private-ip-address</code> - The
     *         primary private IP address of the network interface. </li> <li>
     *         <p><code>launch.network-interface.delete-on-termination</code> -
     *         Indicates whether the network interface is deleted when the instance
     *         is terminated. </li> <li>
     *         <p><code>launch.network-interface.group-id</code> - The ID of the
     *         security group associated with the network interface. </li> <li>
     *         <p><code>launch.network-interface.group-name</code> - The name of the
     *         security group associated with the network interface. </li> <li>
     *         <p><code>launch.network-interface.addresses.primary</code> - Indicates
     *         whether the IP address is the primary private IP address. </li> <li>
     *         <p><code>product-description</code> - The product description
     *         associated with the instance (<code>Linux/UNIX</code> |
     *         <code>Windows</code>). </li> <li>
     *         <p><code>spot-instance-request-id</code> - The Spot Instance request
     *         ID. </li> <li> <p><code>spot-price</code> - The maximum hourly price
     *         for any Spot Instance launched to fulfill the request. </li> <li>
     *         <p><code>state</code> - The state of the Spot Instance request
     *         (<code>open</code> | <code>active</code> | <code>closed</code> |
     *         <code>cancelled</code> | <code>failed</code>). </li> <li>
     *         <p><code>status-code</code> - The short code describing the most
     *         recent evaluation of your Spot Instance request. </li> <li>
     *         <p><code>status-message</code> - The message explaining the status of
     *         the Spot Instance request. </li> <li>
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
     *         filter. </li> <li> <p><code>type</code> - The type of Spot Instance
     *         request (<code>one-time</code> | <code>persistent</code>). </li> <li>
     *         <p><code>launched-availability-zone</code> - The Availability Zone in
     *         which the bid is launched. </li> <li> <p><code>valid-from</code> - The
     *         start date of the request. </li> <li> <p><code>valid-until</code> -
     *         The end date of the request. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSpotInstanceRequestsRequest withFilters(java.util.Collection<Filter> filters) {
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
    public Request<DescribeSpotInstanceRequestsRequest> getDryRunRequest() {
        Request<DescribeSpotInstanceRequestsRequest> request = new DescribeSpotInstanceRequestsRequestMarshaller().marshall(this);
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
        if (getSpotInstanceRequestIds() != null) sb.append("SpotInstanceRequestIds: " + getSpotInstanceRequestIds() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeSpotInstanceRequestsRequest == false) return false;
        DescribeSpotInstanceRequestsRequest other = (DescribeSpotInstanceRequestsRequest)obj;
        
        if (other.getSpotInstanceRequestIds() == null ^ this.getSpotInstanceRequestIds() == null) return false;
        if (other.getSpotInstanceRequestIds() != null && other.getSpotInstanceRequestIds().equals(this.getSpotInstanceRequestIds()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        return true;
    }
    
}
    