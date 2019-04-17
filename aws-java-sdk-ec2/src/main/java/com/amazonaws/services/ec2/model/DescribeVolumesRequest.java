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
import com.amazonaws.services.ec2.model.transform.DescribeVolumesRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVolumesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribeVolumesRequest> {

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>attachment.attach-time</code> - The time stamp when the attachment initiated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.delete-on-termination</code> - Whether the volume is deleted on instance termination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.device</code> - The device name specified in the block device mapping (for example,
     * <code>/dev/sda1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.instance-id</code> - The ID of the instance the volume is attached to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.status</code> - The attachment state (<code>attaching</code> | <code>attached</code> |
     * <code>detaching</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone in which the volume was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>create-time</code> - The time stamp when the volume was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>encrypted</code> - The encryption status of the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>size</code> - The size of the volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>snapshot-id</code> - The snapshot from which the volume was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the volume (<code>creating</code> | <code>available</code> |
     * <code>in-use</code> | <code>deleting</code> | <code>deleted</code> | <code>error</code>).
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
     * <code>volume-id</code> - The volume ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-type</code> - The Amazon EBS volume type. This can be <code>gp2</code> for General Purpose SSD,
     * <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for Throughput Optimized HDD, <code>sc1</code> for
     * Cold HDD, or <code>standard</code> for Magnetic volumes.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The volume IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> volumeIds;
    /**
     * <p>
     * The maximum number of volume results returned by <code>DescribeVolumes</code> in paginated output. When this
     * parameter is used, <code>DescribeVolumes</code> only returns <code>MaxResults</code> results in a single page
     * along with a <code>NextToken</code> response element. The remaining results of the initial request can be seen by
     * sending another <code>DescribeVolumes</code> request with the returned <code>NextToken</code> value. This value
     * can be between 5 and 500; if <code>MaxResults</code> is given a value larger than 500, only 500 results are
     * returned. If this parameter is not used, then <code>DescribeVolumes</code> returns all results. You cannot
     * specify this parameter and the volume IDs parameter in the same request.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The <code>NextToken</code> value returned from a previous paginated <code>DescribeVolumes</code> request where
     * <code>MaxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>NextToken</code> value. This value is <code>null</code>
     * when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * Default constructor for DescribeVolumesRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public DescribeVolumesRequest() {
    }

    /**
     * Constructs a new DescribeVolumesRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize any additional object members.
     * 
     * @param volumeIds
     *        The volume IDs.
     */
    public DescribeVolumesRequest(java.util.List<String> volumeIds) {
        setVolumeIds(volumeIds);
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>attachment.attach-time</code> - The time stamp when the attachment initiated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.delete-on-termination</code> - Whether the volume is deleted on instance termination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.device</code> - The device name specified in the block device mapping (for example,
     * <code>/dev/sda1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.instance-id</code> - The ID of the instance the volume is attached to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.status</code> - The attachment state (<code>attaching</code> | <code>attached</code> |
     * <code>detaching</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone in which the volume was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>create-time</code> - The time stamp when the volume was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>encrypted</code> - The encryption status of the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>size</code> - The size of the volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>snapshot-id</code> - The snapshot from which the volume was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the volume (<code>creating</code> | <code>available</code> |
     * <code>in-use</code> | <code>deleting</code> | <code>deleted</code> | <code>error</code>).
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
     * <code>volume-id</code> - The volume ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-type</code> - The Amazon EBS volume type. This can be <code>gp2</code> for General Purpose SSD,
     * <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for Throughput Optimized HDD, <code>sc1</code> for
     * Cold HDD, or <code>standard</code> for Magnetic volumes.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>attachment.attach-time</code> - The time stamp when the attachment initiated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>attachment.delete-on-termination</code> - Whether the volume is deleted on instance termination.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>attachment.device</code> - The device name specified in the block device mapping (for example,
     *         <code>/dev/sda1</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>attachment.instance-id</code> - The ID of the instance the volume is attached to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>attachment.status</code> - The attachment state (<code>attaching</code> | <code>attached</code> |
     *         <code>detaching</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>availability-zone</code> - The Availability Zone in which the volume was created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>create-time</code> - The time stamp when the volume was created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>encrypted</code> - The encryption status of the volume.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>size</code> - The size of the volume, in GiB.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>snapshot-id</code> - The snapshot from which the volume was created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>status</code> - The status of the volume (<code>creating</code> | <code>available</code> |
     *         <code>in-use</code> | <code>deleting</code> | <code>deleted</code> | <code>error</code>).
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
     *         <code>volume-id</code> - The volume ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>volume-type</code> - The Amazon EBS volume type. This can be <code>gp2</code> for General Purpose
     *         SSD, <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for Throughput Optimized HDD,
     *         <code>sc1</code> for Cold HDD, or <code>standard</code> for Magnetic volumes.
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
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>attachment.attach-time</code> - The time stamp when the attachment initiated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.delete-on-termination</code> - Whether the volume is deleted on instance termination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.device</code> - The device name specified in the block device mapping (for example,
     * <code>/dev/sda1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.instance-id</code> - The ID of the instance the volume is attached to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.status</code> - The attachment state (<code>attaching</code> | <code>attached</code> |
     * <code>detaching</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone in which the volume was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>create-time</code> - The time stamp when the volume was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>encrypted</code> - The encryption status of the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>size</code> - The size of the volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>snapshot-id</code> - The snapshot from which the volume was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the volume (<code>creating</code> | <code>available</code> |
     * <code>in-use</code> | <code>deleting</code> | <code>deleted</code> | <code>error</code>).
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
     * <code>volume-id</code> - The volume ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-type</code> - The Amazon EBS volume type. This can be <code>gp2</code> for General Purpose SSD,
     * <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for Throughput Optimized HDD, <code>sc1</code> for
     * Cold HDD, or <code>standard</code> for Magnetic volumes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        The filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>attachment.attach-time</code> - The time stamp when the attachment initiated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.delete-on-termination</code> - Whether the volume is deleted on instance termination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.device</code> - The device name specified in the block device mapping (for example,
     *        <code>/dev/sda1</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.instance-id</code> - The ID of the instance the volume is attached to.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.status</code> - The attachment state (<code>attaching</code> | <code>attached</code> |
     *        <code>detaching</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone in which the volume was created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>create-time</code> - The time stamp when the volume was created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>encrypted</code> - The encryption status of the volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>size</code> - The size of the volume, in GiB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>snapshot-id</code> - The snapshot from which the volume was created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status</code> - The status of the volume (<code>creating</code> | <code>available</code> |
     *        <code>in-use</code> | <code>deleting</code> | <code>deleted</code> | <code>error</code>).
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
     *        <code>volume-id</code> - The volume ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>volume-type</code> - The Amazon EBS volume type. This can be <code>gp2</code> for General Purpose
     *        SSD, <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for Throughput Optimized HDD,
     *        <code>sc1</code> for Cold HDD, or <code>standard</code> for Magnetic volumes.
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
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>attachment.attach-time</code> - The time stamp when the attachment initiated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.delete-on-termination</code> - Whether the volume is deleted on instance termination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.device</code> - The device name specified in the block device mapping (for example,
     * <code>/dev/sda1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.instance-id</code> - The ID of the instance the volume is attached to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.status</code> - The attachment state (<code>attaching</code> | <code>attached</code> |
     * <code>detaching</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone in which the volume was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>create-time</code> - The time stamp when the volume was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>encrypted</code> - The encryption status of the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>size</code> - The size of the volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>snapshot-id</code> - The snapshot from which the volume was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the volume (<code>creating</code> | <code>available</code> |
     * <code>in-use</code> | <code>deleting</code> | <code>deleted</code> | <code>error</code>).
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
     * <code>volume-id</code> - The volume ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-type</code> - The Amazon EBS volume type. This can be <code>gp2</code> for General Purpose SSD,
     * <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for Throughput Optimized HDD, <code>sc1</code> for
     * Cold HDD, or <code>standard</code> for Magnetic volumes.
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
     *        The filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>attachment.attach-time</code> - The time stamp when the attachment initiated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.delete-on-termination</code> - Whether the volume is deleted on instance termination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.device</code> - The device name specified in the block device mapping (for example,
     *        <code>/dev/sda1</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.instance-id</code> - The ID of the instance the volume is attached to.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.status</code> - The attachment state (<code>attaching</code> | <code>attached</code> |
     *        <code>detaching</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone in which the volume was created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>create-time</code> - The time stamp when the volume was created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>encrypted</code> - The encryption status of the volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>size</code> - The size of the volume, in GiB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>snapshot-id</code> - The snapshot from which the volume was created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status</code> - The status of the volume (<code>creating</code> | <code>available</code> |
     *        <code>in-use</code> | <code>deleting</code> | <code>deleted</code> | <code>error</code>).
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
     *        <code>volume-id</code> - The volume ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>volume-type</code> - The Amazon EBS volume type. This can be <code>gp2</code> for General Purpose
     *        SSD, <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for Throughput Optimized HDD,
     *        <code>sc1</code> for Cold HDD, or <code>standard</code> for Magnetic volumes.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVolumesRequest withFilters(Filter... filters) {
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
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>attachment.attach-time</code> - The time stamp when the attachment initiated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.delete-on-termination</code> - Whether the volume is deleted on instance termination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.device</code> - The device name specified in the block device mapping (for example,
     * <code>/dev/sda1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.instance-id</code> - The ID of the instance the volume is attached to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.status</code> - The attachment state (<code>attaching</code> | <code>attached</code> |
     * <code>detaching</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone in which the volume was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>create-time</code> - The time stamp when the volume was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>encrypted</code> - The encryption status of the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>size</code> - The size of the volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>snapshot-id</code> - The snapshot from which the volume was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the volume (<code>creating</code> | <code>available</code> |
     * <code>in-use</code> | <code>deleting</code> | <code>deleted</code> | <code>error</code>).
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
     * <code>volume-id</code> - The volume ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-type</code> - The Amazon EBS volume type. This can be <code>gp2</code> for General Purpose SSD,
     * <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for Throughput Optimized HDD, <code>sc1</code> for
     * Cold HDD, or <code>standard</code> for Magnetic volumes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        The filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>attachment.attach-time</code> - The time stamp when the attachment initiated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.delete-on-termination</code> - Whether the volume is deleted on instance termination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.device</code> - The device name specified in the block device mapping (for example,
     *        <code>/dev/sda1</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.instance-id</code> - The ID of the instance the volume is attached to.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.status</code> - The attachment state (<code>attaching</code> | <code>attached</code> |
     *        <code>detaching</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone in which the volume was created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>create-time</code> - The time stamp when the volume was created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>encrypted</code> - The encryption status of the volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>size</code> - The size of the volume, in GiB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>snapshot-id</code> - The snapshot from which the volume was created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status</code> - The status of the volume (<code>creating</code> | <code>available</code> |
     *        <code>in-use</code> | <code>deleting</code> | <code>deleted</code> | <code>error</code>).
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
     *        <code>volume-id</code> - The volume ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>volume-type</code> - The Amazon EBS volume type. This can be <code>gp2</code> for General Purpose
     *        SSD, <code>io1</code> for Provisioned IOPS SSD, <code>st1</code> for Throughput Optimized HDD,
     *        <code>sc1</code> for Cold HDD, or <code>standard</code> for Magnetic volumes.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVolumesRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The volume IDs.
     * </p>
     * 
     * @return The volume IDs.
     */

    public java.util.List<String> getVolumeIds() {
        if (volumeIds == null) {
            volumeIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return volumeIds;
    }

    /**
     * <p>
     * The volume IDs.
     * </p>
     * 
     * @param volumeIds
     *        The volume IDs.
     */

    public void setVolumeIds(java.util.Collection<String> volumeIds) {
        if (volumeIds == null) {
            this.volumeIds = null;
            return;
        }

        this.volumeIds = new com.amazonaws.internal.SdkInternalList<String>(volumeIds);
    }

    /**
     * <p>
     * The volume IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVolumeIds(java.util.Collection)} or {@link #withVolumeIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param volumeIds
     *        The volume IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVolumesRequest withVolumeIds(String... volumeIds) {
        if (this.volumeIds == null) {
            setVolumeIds(new com.amazonaws.internal.SdkInternalList<String>(volumeIds.length));
        }
        for (String ele : volumeIds) {
            this.volumeIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The volume IDs.
     * </p>
     * 
     * @param volumeIds
     *        The volume IDs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVolumesRequest withVolumeIds(java.util.Collection<String> volumeIds) {
        setVolumeIds(volumeIds);
        return this;
    }

    /**
     * <p>
     * The maximum number of volume results returned by <code>DescribeVolumes</code> in paginated output. When this
     * parameter is used, <code>DescribeVolumes</code> only returns <code>MaxResults</code> results in a single page
     * along with a <code>NextToken</code> response element. The remaining results of the initial request can be seen by
     * sending another <code>DescribeVolumes</code> request with the returned <code>NextToken</code> value. This value
     * can be between 5 and 500; if <code>MaxResults</code> is given a value larger than 500, only 500 results are
     * returned. If this parameter is not used, then <code>DescribeVolumes</code> returns all results. You cannot
     * specify this parameter and the volume IDs parameter in the same request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of volume results returned by <code>DescribeVolumes</code> in paginated output. When
     *        this parameter is used, <code>DescribeVolumes</code> only returns <code>MaxResults</code> results in a
     *        single page along with a <code>NextToken</code> response element. The remaining results of the initial
     *        request can be seen by sending another <code>DescribeVolumes</code> request with the returned
     *        <code>NextToken</code> value. This value can be between 5 and 500; if <code>MaxResults</code> is given a
     *        value larger than 500, only 500 results are returned. If this parameter is not used, then
     *        <code>DescribeVolumes</code> returns all results. You cannot specify this parameter and the volume IDs
     *        parameter in the same request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of volume results returned by <code>DescribeVolumes</code> in paginated output. When this
     * parameter is used, <code>DescribeVolumes</code> only returns <code>MaxResults</code> results in a single page
     * along with a <code>NextToken</code> response element. The remaining results of the initial request can be seen by
     * sending another <code>DescribeVolumes</code> request with the returned <code>NextToken</code> value. This value
     * can be between 5 and 500; if <code>MaxResults</code> is given a value larger than 500, only 500 results are
     * returned. If this parameter is not used, then <code>DescribeVolumes</code> returns all results. You cannot
     * specify this parameter and the volume IDs parameter in the same request.
     * </p>
     * 
     * @return The maximum number of volume results returned by <code>DescribeVolumes</code> in paginated output. When
     *         this parameter is used, <code>DescribeVolumes</code> only returns <code>MaxResults</code> results in a
     *         single page along with a <code>NextToken</code> response element. The remaining results of the initial
     *         request can be seen by sending another <code>DescribeVolumes</code> request with the returned
     *         <code>NextToken</code> value. This value can be between 5 and 500; if <code>MaxResults</code> is given a
     *         value larger than 500, only 500 results are returned. If this parameter is not used, then
     *         <code>DescribeVolumes</code> returns all results. You cannot specify this parameter and the volume IDs
     *         parameter in the same request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of volume results returned by <code>DescribeVolumes</code> in paginated output. When this
     * parameter is used, <code>DescribeVolumes</code> only returns <code>MaxResults</code> results in a single page
     * along with a <code>NextToken</code> response element. The remaining results of the initial request can be seen by
     * sending another <code>DescribeVolumes</code> request with the returned <code>NextToken</code> value. This value
     * can be between 5 and 500; if <code>MaxResults</code> is given a value larger than 500, only 500 results are
     * returned. If this parameter is not used, then <code>DescribeVolumes</code> returns all results. You cannot
     * specify this parameter and the volume IDs parameter in the same request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of volume results returned by <code>DescribeVolumes</code> in paginated output. When
     *        this parameter is used, <code>DescribeVolumes</code> only returns <code>MaxResults</code> results in a
     *        single page along with a <code>NextToken</code> response element. The remaining results of the initial
     *        request can be seen by sending another <code>DescribeVolumes</code> request with the returned
     *        <code>NextToken</code> value. This value can be between 5 and 500; if <code>MaxResults</code> is given a
     *        value larger than 500, only 500 results are returned. If this parameter is not used, then
     *        <code>DescribeVolumes</code> returns all results. You cannot specify this parameter and the volume IDs
     *        parameter in the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVolumesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The <code>NextToken</code> value returned from a previous paginated <code>DescribeVolumes</code> request where
     * <code>MaxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>NextToken</code> value. This value is <code>null</code>
     * when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value returned from a previous paginated <code>DescribeVolumes</code> request
     *        where <code>MaxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *        continues from the end of the previous results that returned the <code>NextToken</code> value. This value
     *        is <code>null</code> when there are no more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value returned from a previous paginated <code>DescribeVolumes</code> request where
     * <code>MaxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>NextToken</code> value. This value is <code>null</code>
     * when there are no more results to return.
     * </p>
     * 
     * @return The <code>NextToken</code> value returned from a previous paginated <code>DescribeVolumes</code> request
     *         where <code>MaxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *         continues from the end of the previous results that returned the <code>NextToken</code> value. This value
     *         is <code>null</code> when there are no more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value returned from a previous paginated <code>DescribeVolumes</code> request where
     * <code>MaxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>NextToken</code> value. This value is <code>null</code>
     * when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value returned from a previous paginated <code>DescribeVolumes</code> request
     *        where <code>MaxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *        continues from the end of the previous results that returned the <code>NextToken</code> value. This value
     *        is <code>null</code> when there are no more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVolumesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeVolumesRequest> getDryRunRequest() {
        Request<DescribeVolumesRequest> request = new DescribeVolumesRequestMarshaller().marshall(this);
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
        if (getVolumeIds() != null)
            sb.append("VolumeIds: ").append(getVolumeIds()).append(",");
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

        if (obj instanceof DescribeVolumesRequest == false)
            return false;
        DescribeVolumesRequest other = (DescribeVolumesRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getVolumeIds() == null ^ this.getVolumeIds() == null)
            return false;
        if (other.getVolumeIds() != null && other.getVolumeIds().equals(this.getVolumeIds()) == false)
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
        hashCode = prime * hashCode + ((getVolumeIds() == null) ? 0 : getVolumeIds().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVolumesRequest clone() {
        return (DescribeVolumesRequest) super.clone();
    }
}
