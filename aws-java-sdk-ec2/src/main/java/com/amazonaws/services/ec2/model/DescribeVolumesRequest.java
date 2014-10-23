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
import com.amazonaws.services.ec2.model.transform.DescribeVolumesRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeVolumes(DescribeVolumesRequest) DescribeVolumes operation}.
 * <p>
 * Describes the specified Amazon EBS volumes.
 * </p>
 * <p>
 * If you are describing a long list of volumes, you can paginate the
 * output to make the list more manageable. The <code>MaxResults</code>
 * parameter sets the maximum number of results returned in a single
 * page. If the list of results exceeds your <code>MaxResults</code>
 * value, then that number of results is returned along with a
 * <code>NextToken</code> value that can be passed to a subsequent
 * <code>DescribeVolumes</code> request to retrieve the remaining
 * results.
 * </p>
 * <p>
 * For more information about Amazon EBS volumes, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumes.html"> Amazon EBS Volumes </a>
 * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeVolumes(DescribeVolumesRequest)
 */
public class DescribeVolumesRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeVolumesRequest> {

    /**
     * One or more volume IDs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> volumeIds;

    /**
     * One or more filters. <ul> <li> <p><code>attachment.attach-time</code>
     * - The time stamp when the attachment initiated. </li> <li>
     * <p><code>attachment.delete-on-termination</code> - Whether the volume
     * is deleted on instance termination. </li> <li>
     * <p><code>attachment.device</code> - The device name that is exposed to
     * the instance (for example, <code>/dev/sda1</code>). </li> <li>
     * <p><code>attachment.instance-id</code> - The ID of the instance the
     * volume is attached to. </li> <li> <p><code>attachment.status</code> -
     * The attachment state (<code>attaching</code> | <code>attached</code> |
     * <code>detaching</code> | <code>detached</code>). </li> <li>
     * <p><code>availability-zone</code> - The Availability Zone in which the
     * volume was created. </li> <li> <p><code>create-time</code> - The time
     * stamp when the volume was created. </li> <li>
     * <p><code>encrypted</code> - The encryption status of the volume. </li>
     * <li> <p><code>size</code> - The size of the volume, in GiB. </li> <li>
     * <p><code>snapshot-id</code> - The snapshot from which the volume was
     * created. </li> <li> <p><code>status</code> - The status of the volume
     * (<code>creating</code> | <code>available</code> | <code>in-use</code>
     * | <code>deleting</code> | <code>deleted</code> | <code>error</code>).
     * </li> <li> <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
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
     * filter. </li> <li> <p><code>volume-id</code> - The volume ID. </li>
     * <li> <p><code>volume-type</code> - The Amazon EBS volume type. This
     * can be <code>gp2</code> for General Purpose (SSD) volumes,
     * <code>io1</code> for Provisioned IOPS (SSD) volumes, or
     * <code>standard</code> for Magnetic volumes. </li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * The <code>NextToken</code> value returned from a previous paginated
     * <code>DescribeVolumes</code> request where <code>MaxResults</code> was
     * used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the
     * <code>NextToken</code> value. This value is <code>null</code> when
     * there are no more results to return.
     */
    private String nextToken;

    /**
     * The maximum number of volume results returned by
     * <code>DescribeVolumes</code> in paginated output. When this parameter
     * is used, <code>DescribeVolumes</code> only returns
     * <code>MaxResults</code> results in a single page along with a
     * <code>NextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another
     * <code>DescribeVolumes</code> request with the returned
     * <code>NextToken</code> value. This value can be between 5 and 1000; if
     * <code>MaxResults</code> is given a value larger than 1000, only 1000
     * results are returned. If this parameter is not used, then
     * <code>DescribeVolumes</code> returns all results.
     */
    private Integer maxResults;

    /**
     * Default constructor for a new DescribeVolumesRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DescribeVolumesRequest() {}
    
    /**
     * Constructs a new DescribeVolumesRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param volumeIds One or more volume IDs.
     */
    public DescribeVolumesRequest(java.util.List<String> volumeIds) {
        setVolumeIds(volumeIds);
    }

    /**
     * One or more volume IDs.
     *
     * @return One or more volume IDs.
     */
    public java.util.List<String> getVolumeIds() {
        if (volumeIds == null) {
              volumeIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              volumeIds.setAutoConstruct(true);
        }
        return volumeIds;
    }
    
    /**
     * One or more volume IDs.
     *
     * @param volumeIds One or more volume IDs.
     */
    public void setVolumeIds(java.util.Collection<String> volumeIds) {
        if (volumeIds == null) {
            this.volumeIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> volumeIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(volumeIds.size());
        volumeIdsCopy.addAll(volumeIds);
        this.volumeIds = volumeIdsCopy;
    }
    
    /**
     * One or more volume IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeIds One or more volume IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVolumesRequest withVolumeIds(String... volumeIds) {
        if (getVolumeIds() == null) setVolumeIds(new java.util.ArrayList<String>(volumeIds.length));
        for (String value : volumeIds) {
            getVolumeIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more volume IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeIds One or more volume IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVolumesRequest withVolumeIds(java.util.Collection<String> volumeIds) {
        if (volumeIds == null) {
            this.volumeIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> volumeIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(volumeIds.size());
            volumeIdsCopy.addAll(volumeIds);
            this.volumeIds = volumeIdsCopy;
        }

        return this;
    }

    /**
     * One or more filters. <ul> <li> <p><code>attachment.attach-time</code>
     * - The time stamp when the attachment initiated. </li> <li>
     * <p><code>attachment.delete-on-termination</code> - Whether the volume
     * is deleted on instance termination. </li> <li>
     * <p><code>attachment.device</code> - The device name that is exposed to
     * the instance (for example, <code>/dev/sda1</code>). </li> <li>
     * <p><code>attachment.instance-id</code> - The ID of the instance the
     * volume is attached to. </li> <li> <p><code>attachment.status</code> -
     * The attachment state (<code>attaching</code> | <code>attached</code> |
     * <code>detaching</code> | <code>detached</code>). </li> <li>
     * <p><code>availability-zone</code> - The Availability Zone in which the
     * volume was created. </li> <li> <p><code>create-time</code> - The time
     * stamp when the volume was created. </li> <li>
     * <p><code>encrypted</code> - The encryption status of the volume. </li>
     * <li> <p><code>size</code> - The size of the volume, in GiB. </li> <li>
     * <p><code>snapshot-id</code> - The snapshot from which the volume was
     * created. </li> <li> <p><code>status</code> - The status of the volume
     * (<code>creating</code> | <code>available</code> | <code>in-use</code>
     * | <code>deleting</code> | <code>deleted</code> | <code>error</code>).
     * </li> <li> <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
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
     * filter. </li> <li> <p><code>volume-id</code> - The volume ID. </li>
     * <li> <p><code>volume-type</code> - The Amazon EBS volume type. This
     * can be <code>gp2</code> for General Purpose (SSD) volumes,
     * <code>io1</code> for Provisioned IOPS (SSD) volumes, or
     * <code>standard</code> for Magnetic volumes. </li> </ul>
     *
     * @return One or more filters. <ul> <li> <p><code>attachment.attach-time</code>
     *         - The time stamp when the attachment initiated. </li> <li>
     *         <p><code>attachment.delete-on-termination</code> - Whether the volume
     *         is deleted on instance termination. </li> <li>
     *         <p><code>attachment.device</code> - The device name that is exposed to
     *         the instance (for example, <code>/dev/sda1</code>). </li> <li>
     *         <p><code>attachment.instance-id</code> - The ID of the instance the
     *         volume is attached to. </li> <li> <p><code>attachment.status</code> -
     *         The attachment state (<code>attaching</code> | <code>attached</code> |
     *         <code>detaching</code> | <code>detached</code>). </li> <li>
     *         <p><code>availability-zone</code> - The Availability Zone in which the
     *         volume was created. </li> <li> <p><code>create-time</code> - The time
     *         stamp when the volume was created. </li> <li>
     *         <p><code>encrypted</code> - The encryption status of the volume. </li>
     *         <li> <p><code>size</code> - The size of the volume, in GiB. </li> <li>
     *         <p><code>snapshot-id</code> - The snapshot from which the volume was
     *         created. </li> <li> <p><code>status</code> - The status of the volume
     *         (<code>creating</code> | <code>available</code> | <code>in-use</code>
     *         | <code>deleting</code> | <code>deleted</code> | <code>error</code>).
     *         </li> <li> <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
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
     *         filter. </li> <li> <p><code>volume-id</code> - The volume ID. </li>
     *         <li> <p><code>volume-type</code> - The Amazon EBS volume type. This
     *         can be <code>gp2</code> for General Purpose (SSD) volumes,
     *         <code>io1</code> for Provisioned IOPS (SSD) volumes, or
     *         <code>standard</code> for Magnetic volumes. </li> </ul>
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>attachment.attach-time</code>
     * - The time stamp when the attachment initiated. </li> <li>
     * <p><code>attachment.delete-on-termination</code> - Whether the volume
     * is deleted on instance termination. </li> <li>
     * <p><code>attachment.device</code> - The device name that is exposed to
     * the instance (for example, <code>/dev/sda1</code>). </li> <li>
     * <p><code>attachment.instance-id</code> - The ID of the instance the
     * volume is attached to. </li> <li> <p><code>attachment.status</code> -
     * The attachment state (<code>attaching</code> | <code>attached</code> |
     * <code>detaching</code> | <code>detached</code>). </li> <li>
     * <p><code>availability-zone</code> - The Availability Zone in which the
     * volume was created. </li> <li> <p><code>create-time</code> - The time
     * stamp when the volume was created. </li> <li>
     * <p><code>encrypted</code> - The encryption status of the volume. </li>
     * <li> <p><code>size</code> - The size of the volume, in GiB. </li> <li>
     * <p><code>snapshot-id</code> - The snapshot from which the volume was
     * created. </li> <li> <p><code>status</code> - The status of the volume
     * (<code>creating</code> | <code>available</code> | <code>in-use</code>
     * | <code>deleting</code> | <code>deleted</code> | <code>error</code>).
     * </li> <li> <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
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
     * filter. </li> <li> <p><code>volume-id</code> - The volume ID. </li>
     * <li> <p><code>volume-type</code> - The Amazon EBS volume type. This
     * can be <code>gp2</code> for General Purpose (SSD) volumes,
     * <code>io1</code> for Provisioned IOPS (SSD) volumes, or
     * <code>standard</code> for Magnetic volumes. </li> </ul>
     *
     * @param filters One or more filters. <ul> <li> <p><code>attachment.attach-time</code>
     *         - The time stamp when the attachment initiated. </li> <li>
     *         <p><code>attachment.delete-on-termination</code> - Whether the volume
     *         is deleted on instance termination. </li> <li>
     *         <p><code>attachment.device</code> - The device name that is exposed to
     *         the instance (for example, <code>/dev/sda1</code>). </li> <li>
     *         <p><code>attachment.instance-id</code> - The ID of the instance the
     *         volume is attached to. </li> <li> <p><code>attachment.status</code> -
     *         The attachment state (<code>attaching</code> | <code>attached</code> |
     *         <code>detaching</code> | <code>detached</code>). </li> <li>
     *         <p><code>availability-zone</code> - The Availability Zone in which the
     *         volume was created. </li> <li> <p><code>create-time</code> - The time
     *         stamp when the volume was created. </li> <li>
     *         <p><code>encrypted</code> - The encryption status of the volume. </li>
     *         <li> <p><code>size</code> - The size of the volume, in GiB. </li> <li>
     *         <p><code>snapshot-id</code> - The snapshot from which the volume was
     *         created. </li> <li> <p><code>status</code> - The status of the volume
     *         (<code>creating</code> | <code>available</code> | <code>in-use</code>
     *         | <code>deleting</code> | <code>deleted</code> | <code>error</code>).
     *         </li> <li> <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
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
     *         filter. </li> <li> <p><code>volume-id</code> - The volume ID. </li>
     *         <li> <p><code>volume-type</code> - The Amazon EBS volume type. This
     *         can be <code>gp2</code> for General Purpose (SSD) volumes,
     *         <code>io1</code> for Provisioned IOPS (SSD) volumes, or
     *         <code>standard</code> for Magnetic volumes. </li> </ul>
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
     * One or more filters. <ul> <li> <p><code>attachment.attach-time</code>
     * - The time stamp when the attachment initiated. </li> <li>
     * <p><code>attachment.delete-on-termination</code> - Whether the volume
     * is deleted on instance termination. </li> <li>
     * <p><code>attachment.device</code> - The device name that is exposed to
     * the instance (for example, <code>/dev/sda1</code>). </li> <li>
     * <p><code>attachment.instance-id</code> - The ID of the instance the
     * volume is attached to. </li> <li> <p><code>attachment.status</code> -
     * The attachment state (<code>attaching</code> | <code>attached</code> |
     * <code>detaching</code> | <code>detached</code>). </li> <li>
     * <p><code>availability-zone</code> - The Availability Zone in which the
     * volume was created. </li> <li> <p><code>create-time</code> - The time
     * stamp when the volume was created. </li> <li>
     * <p><code>encrypted</code> - The encryption status of the volume. </li>
     * <li> <p><code>size</code> - The size of the volume, in GiB. </li> <li>
     * <p><code>snapshot-id</code> - The snapshot from which the volume was
     * created. </li> <li> <p><code>status</code> - The status of the volume
     * (<code>creating</code> | <code>available</code> | <code>in-use</code>
     * | <code>deleting</code> | <code>deleted</code> | <code>error</code>).
     * </li> <li> <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
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
     * filter. </li> <li> <p><code>volume-id</code> - The volume ID. </li>
     * <li> <p><code>volume-type</code> - The Amazon EBS volume type. This
     * can be <code>gp2</code> for General Purpose (SSD) volumes,
     * <code>io1</code> for Provisioned IOPS (SSD) volumes, or
     * <code>standard</code> for Magnetic volumes. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>attachment.attach-time</code>
     *         - The time stamp when the attachment initiated. </li> <li>
     *         <p><code>attachment.delete-on-termination</code> - Whether the volume
     *         is deleted on instance termination. </li> <li>
     *         <p><code>attachment.device</code> - The device name that is exposed to
     *         the instance (for example, <code>/dev/sda1</code>). </li> <li>
     *         <p><code>attachment.instance-id</code> - The ID of the instance the
     *         volume is attached to. </li> <li> <p><code>attachment.status</code> -
     *         The attachment state (<code>attaching</code> | <code>attached</code> |
     *         <code>detaching</code> | <code>detached</code>). </li> <li>
     *         <p><code>availability-zone</code> - The Availability Zone in which the
     *         volume was created. </li> <li> <p><code>create-time</code> - The time
     *         stamp when the volume was created. </li> <li>
     *         <p><code>encrypted</code> - The encryption status of the volume. </li>
     *         <li> <p><code>size</code> - The size of the volume, in GiB. </li> <li>
     *         <p><code>snapshot-id</code> - The snapshot from which the volume was
     *         created. </li> <li> <p><code>status</code> - The status of the volume
     *         (<code>creating</code> | <code>available</code> | <code>in-use</code>
     *         | <code>deleting</code> | <code>deleted</code> | <code>error</code>).
     *         </li> <li> <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
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
     *         filter. </li> <li> <p><code>volume-id</code> - The volume ID. </li>
     *         <li> <p><code>volume-type</code> - The Amazon EBS volume type. This
     *         can be <code>gp2</code> for General Purpose (SSD) volumes,
     *         <code>io1</code> for Provisioned IOPS (SSD) volumes, or
     *         <code>standard</code> for Magnetic volumes. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVolumesRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>attachment.attach-time</code>
     * - The time stamp when the attachment initiated. </li> <li>
     * <p><code>attachment.delete-on-termination</code> - Whether the volume
     * is deleted on instance termination. </li> <li>
     * <p><code>attachment.device</code> - The device name that is exposed to
     * the instance (for example, <code>/dev/sda1</code>). </li> <li>
     * <p><code>attachment.instance-id</code> - The ID of the instance the
     * volume is attached to. </li> <li> <p><code>attachment.status</code> -
     * The attachment state (<code>attaching</code> | <code>attached</code> |
     * <code>detaching</code> | <code>detached</code>). </li> <li>
     * <p><code>availability-zone</code> - The Availability Zone in which the
     * volume was created. </li> <li> <p><code>create-time</code> - The time
     * stamp when the volume was created. </li> <li>
     * <p><code>encrypted</code> - The encryption status of the volume. </li>
     * <li> <p><code>size</code> - The size of the volume, in GiB. </li> <li>
     * <p><code>snapshot-id</code> - The snapshot from which the volume was
     * created. </li> <li> <p><code>status</code> - The status of the volume
     * (<code>creating</code> | <code>available</code> | <code>in-use</code>
     * | <code>deleting</code> | <code>deleted</code> | <code>error</code>).
     * </li> <li> <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
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
     * filter. </li> <li> <p><code>volume-id</code> - The volume ID. </li>
     * <li> <p><code>volume-type</code> - The Amazon EBS volume type. This
     * can be <code>gp2</code> for General Purpose (SSD) volumes,
     * <code>io1</code> for Provisioned IOPS (SSD) volumes, or
     * <code>standard</code> for Magnetic volumes. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>attachment.attach-time</code>
     *         - The time stamp when the attachment initiated. </li> <li>
     *         <p><code>attachment.delete-on-termination</code> - Whether the volume
     *         is deleted on instance termination. </li> <li>
     *         <p><code>attachment.device</code> - The device name that is exposed to
     *         the instance (for example, <code>/dev/sda1</code>). </li> <li>
     *         <p><code>attachment.instance-id</code> - The ID of the instance the
     *         volume is attached to. </li> <li> <p><code>attachment.status</code> -
     *         The attachment state (<code>attaching</code> | <code>attached</code> |
     *         <code>detaching</code> | <code>detached</code>). </li> <li>
     *         <p><code>availability-zone</code> - The Availability Zone in which the
     *         volume was created. </li> <li> <p><code>create-time</code> - The time
     *         stamp when the volume was created. </li> <li>
     *         <p><code>encrypted</code> - The encryption status of the volume. </li>
     *         <li> <p><code>size</code> - The size of the volume, in GiB. </li> <li>
     *         <p><code>snapshot-id</code> - The snapshot from which the volume was
     *         created. </li> <li> <p><code>status</code> - The status of the volume
     *         (<code>creating</code> | <code>available</code> | <code>in-use</code>
     *         | <code>deleting</code> | <code>deleted</code> | <code>error</code>).
     *         </li> <li> <p><code>tag</code>:<i>key</i>=<i>value</i> - The key/value
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
     *         filter. </li> <li> <p><code>volume-id</code> - The volume ID. </li>
     *         <li> <p><code>volume-type</code> - The Amazon EBS volume type. This
     *         can be <code>gp2</code> for General Purpose (SSD) volumes,
     *         <code>io1</code> for Provisioned IOPS (SSD) volumes, or
     *         <code>standard</code> for Magnetic volumes. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVolumesRequest withFilters(java.util.Collection<Filter> filters) {
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
     * The <code>NextToken</code> value returned from a previous paginated
     * <code>DescribeVolumes</code> request where <code>MaxResults</code> was
     * used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the
     * <code>NextToken</code> value. This value is <code>null</code> when
     * there are no more results to return.
     *
     * @return The <code>NextToken</code> value returned from a previous paginated
     *         <code>DescribeVolumes</code> request where <code>MaxResults</code> was
     *         used and the results exceeded the value of that parameter. Pagination
     *         continues from the end of the previous results that returned the
     *         <code>NextToken</code> value. This value is <code>null</code> when
     *         there are no more results to return.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The <code>NextToken</code> value returned from a previous paginated
     * <code>DescribeVolumes</code> request where <code>MaxResults</code> was
     * used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the
     * <code>NextToken</code> value. This value is <code>null</code> when
     * there are no more results to return.
     *
     * @param nextToken The <code>NextToken</code> value returned from a previous paginated
     *         <code>DescribeVolumes</code> request where <code>MaxResults</code> was
     *         used and the results exceeded the value of that parameter. Pagination
     *         continues from the end of the previous results that returned the
     *         <code>NextToken</code> value. This value is <code>null</code> when
     *         there are no more results to return.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The <code>NextToken</code> value returned from a previous paginated
     * <code>DescribeVolumes</code> request where <code>MaxResults</code> was
     * used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the
     * <code>NextToken</code> value. This value is <code>null</code> when
     * there are no more results to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The <code>NextToken</code> value returned from a previous paginated
     *         <code>DescribeVolumes</code> request where <code>MaxResults</code> was
     *         used and the results exceeded the value of that parameter. Pagination
     *         continues from the end of the previous results that returned the
     *         <code>NextToken</code> value. This value is <code>null</code> when
     *         there are no more results to return.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVolumesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * The maximum number of volume results returned by
     * <code>DescribeVolumes</code> in paginated output. When this parameter
     * is used, <code>DescribeVolumes</code> only returns
     * <code>MaxResults</code> results in a single page along with a
     * <code>NextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another
     * <code>DescribeVolumes</code> request with the returned
     * <code>NextToken</code> value. This value can be between 5 and 1000; if
     * <code>MaxResults</code> is given a value larger than 1000, only 1000
     * results are returned. If this parameter is not used, then
     * <code>DescribeVolumes</code> returns all results.
     *
     * @return The maximum number of volume results returned by
     *         <code>DescribeVolumes</code> in paginated output. When this parameter
     *         is used, <code>DescribeVolumes</code> only returns
     *         <code>MaxResults</code> results in a single page along with a
     *         <code>NextToken</code> response element. The remaining results of the
     *         initial request can be seen by sending another
     *         <code>DescribeVolumes</code> request with the returned
     *         <code>NextToken</code> value. This value can be between 5 and 1000; if
     *         <code>MaxResults</code> is given a value larger than 1000, only 1000
     *         results are returned. If this parameter is not used, then
     *         <code>DescribeVolumes</code> returns all results.
     */
    public Integer getMaxResults() {
        return maxResults;
    }
    
    /**
     * The maximum number of volume results returned by
     * <code>DescribeVolumes</code> in paginated output. When this parameter
     * is used, <code>DescribeVolumes</code> only returns
     * <code>MaxResults</code> results in a single page along with a
     * <code>NextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another
     * <code>DescribeVolumes</code> request with the returned
     * <code>NextToken</code> value. This value can be between 5 and 1000; if
     * <code>MaxResults</code> is given a value larger than 1000, only 1000
     * results are returned. If this parameter is not used, then
     * <code>DescribeVolumes</code> returns all results.
     *
     * @param maxResults The maximum number of volume results returned by
     *         <code>DescribeVolumes</code> in paginated output. When this parameter
     *         is used, <code>DescribeVolumes</code> only returns
     *         <code>MaxResults</code> results in a single page along with a
     *         <code>NextToken</code> response element. The remaining results of the
     *         initial request can be seen by sending another
     *         <code>DescribeVolumes</code> request with the returned
     *         <code>NextToken</code> value. This value can be between 5 and 1000; if
     *         <code>MaxResults</code> is given a value larger than 1000, only 1000
     *         results are returned. If this parameter is not used, then
     *         <code>DescribeVolumes</code> returns all results.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }
    
    /**
     * The maximum number of volume results returned by
     * <code>DescribeVolumes</code> in paginated output. When this parameter
     * is used, <code>DescribeVolumes</code> only returns
     * <code>MaxResults</code> results in a single page along with a
     * <code>NextToken</code> response element. The remaining results of the
     * initial request can be seen by sending another
     * <code>DescribeVolumes</code> request with the returned
     * <code>NextToken</code> value. This value can be between 5 and 1000; if
     * <code>MaxResults</code> is given a value larger than 1000, only 1000
     * results are returned. If this parameter is not used, then
     * <code>DescribeVolumes</code> returns all results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxResults The maximum number of volume results returned by
     *         <code>DescribeVolumes</code> in paginated output. When this parameter
     *         is used, <code>DescribeVolumes</code> only returns
     *         <code>MaxResults</code> results in a single page along with a
     *         <code>NextToken</code> response element. The remaining results of the
     *         initial request can be seen by sending another
     *         <code>DescribeVolumes</code> request with the returned
     *         <code>NextToken</code> value. This value can be between 5 and 1000; if
     *         <code>MaxResults</code> is given a value larger than 1000, only 1000
     *         results are returned. If this parameter is not used, then
     *         <code>DescribeVolumes</code> returns all results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVolumesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeVolumesRequest> getDryRunRequest() {
        Request<DescribeVolumesRequest> request = new DescribeVolumesRequestMarshaller().marshall(this);
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
        if (getVolumeIds() != null) sb.append("VolumeIds: " + getVolumeIds() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVolumeIds() == null) ? 0 : getVolumeIds().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeVolumesRequest == false) return false;
        DescribeVolumesRequest other = (DescribeVolumesRequest)obj;
        
        if (other.getVolumeIds() == null ^ this.getVolumeIds() == null) return false;
        if (other.getVolumeIds() != null && other.getVolumeIds().equals(this.getVolumeIds()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false; 
        return true;
    }
    
}
    