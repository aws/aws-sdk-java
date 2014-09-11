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
import com.amazonaws.services.ec2.model.transform.DescribeSnapshotsRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeSnapshots(DescribeSnapshotsRequest) DescribeSnapshots operation}.
 * <p>
 * Describes one or more of the Amazon EBS snapshots available to you.
 * Available snapshots include public snapshots available for any AWS
 * account to launch, private snapshots that you own, and private
 * snapshots owned by another AWS account but for which you've been given
 * explicit create volume permissions.
 * </p>
 * <p>
 * The create volume permissions fall into the following categories:
 * </p>
 * 
 * <ul>
 * <li> <i>public</i> : The owner of the snapshot granted create volume
 * permissions for the snapshot to the <code>all</code> group. All AWS
 * accounts have create volume permissions for these snapshots.</li>
 * <li> <i>explicit</i> : The owner of the snapshot granted create
 * volume permissions to a specific AWS account.</li>
 * <li> <i>implicit</i> : An AWS account has implicit create volume
 * permissions for all snapshots it owns.</li>
 * 
 * </ul>
 * <p>
 * The list of snapshots returned can be modified by specifying snapshot
 * IDs, snapshot owners, or AWS accounts with create volume permissions.
 * If no options are specified, Amazon EC2 returns all snapshots for
 * which you have create volume permissions.
 * </p>
 * <p>
 * If you specify one or more snapshot IDs, only snapshots that have the
 * specified IDs are returned. If you specify an invalid snapshot ID, an
 * error is returned. If you specify a snapshot ID for which you do not
 * have access, it is not included in the returned results.
 * </p>
 * <p>
 * If you specify one or more snapshot owners, only snapshots from the
 * specified owners and for which you have access are returned. The
 * results can include the AWS account IDs of the specified owners,
 * <code>amazon</code> for snapshots owned by Amazon, or
 * <code>self</code> for snapshots that you own.
 * </p>
 * <p>
 * If you specify a list of restorable users, only snapshots with create
 * snapshot permissions for those users are returned. You can specify AWS
 * account IDs (if you own the snapshots), <code>self</code> for
 * snapshots for which you own or have explicit permissions, or
 * <code>all</code> for public snapshots.
 * </p>
 * <p>
 * For more information about Amazon EBS snapshots, see
 * <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSSnapshots.html"> Amazon EBS Snapshots </a>
 * in the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeSnapshots(DescribeSnapshotsRequest)
 */
public class DescribeSnapshotsRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeSnapshotsRequest> {

    /**
     * One or more snapshot IDs. <p>Default: Describes snapshots for which
     * you have launch permissions.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> snapshotIds;

    /**
     * Returns the snapshots owned by the specified owner. Multiple owners
     * can be specified.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> ownerIds;

    /**
     * One or more AWS accounts IDs that can create volumes from the
     * snapshot.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> restorableByUserIds;

    /**
     * One or more filters. <ul> <li> <p><code>description</code> - A
     * description of the snapshot. </li> <li> <p><code>owner-alias</code> -
     * The AWS account alias (for example, <code>amazon</code>) that owns the
     * snapshot. </li> <li> <p><code>owner-id</code> - The ID of the AWS
     * account that owns the snapshot. </li> <li> <p><code>progress</code> -
     * The progress of the snapshot, as a percentage (for example, 80%).
     * </li> <li> <p><code>snapshot-id</code> - The snapshot ID. </li> <li>
     * <p><code>start-time</code> - The time stamp when the snapshot was
     * initiated. </li> <li> <p><code>status</code> - The status of the
     * snapshot (<code>pending</code> | <code>completed</code> |
     * <code>error</code>). </li> <li>
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
     * filter. </li> <li> <p><code>volume-id</code> - The ID of the volume
     * the snapshot is for. </li> <li> <p><code>volume-size</code> - The size
     * of the volume, in GiB. </li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * One or more snapshot IDs. <p>Default: Describes snapshots for which
     * you have launch permissions.
     *
     * @return One or more snapshot IDs. <p>Default: Describes snapshots for which
     *         you have launch permissions.
     */
    public java.util.List<String> getSnapshotIds() {
        if (snapshotIds == null) {
              snapshotIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              snapshotIds.setAutoConstruct(true);
        }
        return snapshotIds;
    }
    
    /**
     * One or more snapshot IDs. <p>Default: Describes snapshots for which
     * you have launch permissions.
     *
     * @param snapshotIds One or more snapshot IDs. <p>Default: Describes snapshots for which
     *         you have launch permissions.
     */
    public void setSnapshotIds(java.util.Collection<String> snapshotIds) {
        if (snapshotIds == null) {
            this.snapshotIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> snapshotIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(snapshotIds.size());
        snapshotIdsCopy.addAll(snapshotIds);
        this.snapshotIds = snapshotIdsCopy;
    }
    
    /**
     * One or more snapshot IDs. <p>Default: Describes snapshots for which
     * you have launch permissions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotIds One or more snapshot IDs. <p>Default: Describes snapshots for which
     *         you have launch permissions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSnapshotsRequest withSnapshotIds(String... snapshotIds) {
        if (getSnapshotIds() == null) setSnapshotIds(new java.util.ArrayList<String>(snapshotIds.length));
        for (String value : snapshotIds) {
            getSnapshotIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more snapshot IDs. <p>Default: Describes snapshots for which
     * you have launch permissions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotIds One or more snapshot IDs. <p>Default: Describes snapshots for which
     *         you have launch permissions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSnapshotsRequest withSnapshotIds(java.util.Collection<String> snapshotIds) {
        if (snapshotIds == null) {
            this.snapshotIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> snapshotIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(snapshotIds.size());
            snapshotIdsCopy.addAll(snapshotIds);
            this.snapshotIds = snapshotIdsCopy;
        }

        return this;
    }

    /**
     * Returns the snapshots owned by the specified owner. Multiple owners
     * can be specified.
     *
     * @return Returns the snapshots owned by the specified owner. Multiple owners
     *         can be specified.
     */
    public java.util.List<String> getOwnerIds() {
        if (ownerIds == null) {
              ownerIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              ownerIds.setAutoConstruct(true);
        }
        return ownerIds;
    }
    
    /**
     * Returns the snapshots owned by the specified owner. Multiple owners
     * can be specified.
     *
     * @param ownerIds Returns the snapshots owned by the specified owner. Multiple owners
     *         can be specified.
     */
    public void setOwnerIds(java.util.Collection<String> ownerIds) {
        if (ownerIds == null) {
            this.ownerIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> ownerIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(ownerIds.size());
        ownerIdsCopy.addAll(ownerIds);
        this.ownerIds = ownerIdsCopy;
    }
    
    /**
     * Returns the snapshots owned by the specified owner. Multiple owners
     * can be specified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ownerIds Returns the snapshots owned by the specified owner. Multiple owners
     *         can be specified.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSnapshotsRequest withOwnerIds(String... ownerIds) {
        if (getOwnerIds() == null) setOwnerIds(new java.util.ArrayList<String>(ownerIds.length));
        for (String value : ownerIds) {
            getOwnerIds().add(value);
        }
        return this;
    }
    
    /**
     * Returns the snapshots owned by the specified owner. Multiple owners
     * can be specified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ownerIds Returns the snapshots owned by the specified owner. Multiple owners
     *         can be specified.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSnapshotsRequest withOwnerIds(java.util.Collection<String> ownerIds) {
        if (ownerIds == null) {
            this.ownerIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> ownerIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(ownerIds.size());
            ownerIdsCopy.addAll(ownerIds);
            this.ownerIds = ownerIdsCopy;
        }

        return this;
    }

    /**
     * One or more AWS accounts IDs that can create volumes from the
     * snapshot.
     *
     * @return One or more AWS accounts IDs that can create volumes from the
     *         snapshot.
     */
    public java.util.List<String> getRestorableByUserIds() {
        if (restorableByUserIds == null) {
              restorableByUserIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              restorableByUserIds.setAutoConstruct(true);
        }
        return restorableByUserIds;
    }
    
    /**
     * One or more AWS accounts IDs that can create volumes from the
     * snapshot.
     *
     * @param restorableByUserIds One or more AWS accounts IDs that can create volumes from the
     *         snapshot.
     */
    public void setRestorableByUserIds(java.util.Collection<String> restorableByUserIds) {
        if (restorableByUserIds == null) {
            this.restorableByUserIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> restorableByUserIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(restorableByUserIds.size());
        restorableByUserIdsCopy.addAll(restorableByUserIds);
        this.restorableByUserIds = restorableByUserIdsCopy;
    }
    
    /**
     * One or more AWS accounts IDs that can create volumes from the
     * snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param restorableByUserIds One or more AWS accounts IDs that can create volumes from the
     *         snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSnapshotsRequest withRestorableByUserIds(String... restorableByUserIds) {
        if (getRestorableByUserIds() == null) setRestorableByUserIds(new java.util.ArrayList<String>(restorableByUserIds.length));
        for (String value : restorableByUserIds) {
            getRestorableByUserIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more AWS accounts IDs that can create volumes from the
     * snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param restorableByUserIds One or more AWS accounts IDs that can create volumes from the
     *         snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSnapshotsRequest withRestorableByUserIds(java.util.Collection<String> restorableByUserIds) {
        if (restorableByUserIds == null) {
            this.restorableByUserIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> restorableByUserIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(restorableByUserIds.size());
            restorableByUserIdsCopy.addAll(restorableByUserIds);
            this.restorableByUserIds = restorableByUserIdsCopy;
        }

        return this;
    }

    /**
     * One or more filters. <ul> <li> <p><code>description</code> - A
     * description of the snapshot. </li> <li> <p><code>owner-alias</code> -
     * The AWS account alias (for example, <code>amazon</code>) that owns the
     * snapshot. </li> <li> <p><code>owner-id</code> - The ID of the AWS
     * account that owns the snapshot. </li> <li> <p><code>progress</code> -
     * The progress of the snapshot, as a percentage (for example, 80%).
     * </li> <li> <p><code>snapshot-id</code> - The snapshot ID. </li> <li>
     * <p><code>start-time</code> - The time stamp when the snapshot was
     * initiated. </li> <li> <p><code>status</code> - The status of the
     * snapshot (<code>pending</code> | <code>completed</code> |
     * <code>error</code>). </li> <li>
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
     * filter. </li> <li> <p><code>volume-id</code> - The ID of the volume
     * the snapshot is for. </li> <li> <p><code>volume-size</code> - The size
     * of the volume, in GiB. </li> </ul>
     *
     * @return One or more filters. <ul> <li> <p><code>description</code> - A
     *         description of the snapshot. </li> <li> <p><code>owner-alias</code> -
     *         The AWS account alias (for example, <code>amazon</code>) that owns the
     *         snapshot. </li> <li> <p><code>owner-id</code> - The ID of the AWS
     *         account that owns the snapshot. </li> <li> <p><code>progress</code> -
     *         The progress of the snapshot, as a percentage (for example, 80%).
     *         </li> <li> <p><code>snapshot-id</code> - The snapshot ID. </li> <li>
     *         <p><code>start-time</code> - The time stamp when the snapshot was
     *         initiated. </li> <li> <p><code>status</code> - The status of the
     *         snapshot (<code>pending</code> | <code>completed</code> |
     *         <code>error</code>). </li> <li>
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
     *         filter. </li> <li> <p><code>volume-id</code> - The ID of the volume
     *         the snapshot is for. </li> <li> <p><code>volume-size</code> - The size
     *         of the volume, in GiB. </li> </ul>
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>description</code> - A
     * description of the snapshot. </li> <li> <p><code>owner-alias</code> -
     * The AWS account alias (for example, <code>amazon</code>) that owns the
     * snapshot. </li> <li> <p><code>owner-id</code> - The ID of the AWS
     * account that owns the snapshot. </li> <li> <p><code>progress</code> -
     * The progress of the snapshot, as a percentage (for example, 80%).
     * </li> <li> <p><code>snapshot-id</code> - The snapshot ID. </li> <li>
     * <p><code>start-time</code> - The time stamp when the snapshot was
     * initiated. </li> <li> <p><code>status</code> - The status of the
     * snapshot (<code>pending</code> | <code>completed</code> |
     * <code>error</code>). </li> <li>
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
     * filter. </li> <li> <p><code>volume-id</code> - The ID of the volume
     * the snapshot is for. </li> <li> <p><code>volume-size</code> - The size
     * of the volume, in GiB. </li> </ul>
     *
     * @param filters One or more filters. <ul> <li> <p><code>description</code> - A
     *         description of the snapshot. </li> <li> <p><code>owner-alias</code> -
     *         The AWS account alias (for example, <code>amazon</code>) that owns the
     *         snapshot. </li> <li> <p><code>owner-id</code> - The ID of the AWS
     *         account that owns the snapshot. </li> <li> <p><code>progress</code> -
     *         The progress of the snapshot, as a percentage (for example, 80%).
     *         </li> <li> <p><code>snapshot-id</code> - The snapshot ID. </li> <li>
     *         <p><code>start-time</code> - The time stamp when the snapshot was
     *         initiated. </li> <li> <p><code>status</code> - The status of the
     *         snapshot (<code>pending</code> | <code>completed</code> |
     *         <code>error</code>). </li> <li>
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
     *         filter. </li> <li> <p><code>volume-id</code> - The ID of the volume
     *         the snapshot is for. </li> <li> <p><code>volume-size</code> - The size
     *         of the volume, in GiB. </li> </ul>
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
     * One or more filters. <ul> <li> <p><code>description</code> - A
     * description of the snapshot. </li> <li> <p><code>owner-alias</code> -
     * The AWS account alias (for example, <code>amazon</code>) that owns the
     * snapshot. </li> <li> <p><code>owner-id</code> - The ID of the AWS
     * account that owns the snapshot. </li> <li> <p><code>progress</code> -
     * The progress of the snapshot, as a percentage (for example, 80%).
     * </li> <li> <p><code>snapshot-id</code> - The snapshot ID. </li> <li>
     * <p><code>start-time</code> - The time stamp when the snapshot was
     * initiated. </li> <li> <p><code>status</code> - The status of the
     * snapshot (<code>pending</code> | <code>completed</code> |
     * <code>error</code>). </li> <li>
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
     * filter. </li> <li> <p><code>volume-id</code> - The ID of the volume
     * the snapshot is for. </li> <li> <p><code>volume-size</code> - The size
     * of the volume, in GiB. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>description</code> - A
     *         description of the snapshot. </li> <li> <p><code>owner-alias</code> -
     *         The AWS account alias (for example, <code>amazon</code>) that owns the
     *         snapshot. </li> <li> <p><code>owner-id</code> - The ID of the AWS
     *         account that owns the snapshot. </li> <li> <p><code>progress</code> -
     *         The progress of the snapshot, as a percentage (for example, 80%).
     *         </li> <li> <p><code>snapshot-id</code> - The snapshot ID. </li> <li>
     *         <p><code>start-time</code> - The time stamp when the snapshot was
     *         initiated. </li> <li> <p><code>status</code> - The status of the
     *         snapshot (<code>pending</code> | <code>completed</code> |
     *         <code>error</code>). </li> <li>
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
     *         filter. </li> <li> <p><code>volume-id</code> - The ID of the volume
     *         the snapshot is for. </li> <li> <p><code>volume-size</code> - The size
     *         of the volume, in GiB. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSnapshotsRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>description</code> - A
     * description of the snapshot. </li> <li> <p><code>owner-alias</code> -
     * The AWS account alias (for example, <code>amazon</code>) that owns the
     * snapshot. </li> <li> <p><code>owner-id</code> - The ID of the AWS
     * account that owns the snapshot. </li> <li> <p><code>progress</code> -
     * The progress of the snapshot, as a percentage (for example, 80%).
     * </li> <li> <p><code>snapshot-id</code> - The snapshot ID. </li> <li>
     * <p><code>start-time</code> - The time stamp when the snapshot was
     * initiated. </li> <li> <p><code>status</code> - The status of the
     * snapshot (<code>pending</code> | <code>completed</code> |
     * <code>error</code>). </li> <li>
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
     * filter. </li> <li> <p><code>volume-id</code> - The ID of the volume
     * the snapshot is for. </li> <li> <p><code>volume-size</code> - The size
     * of the volume, in GiB. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>description</code> - A
     *         description of the snapshot. </li> <li> <p><code>owner-alias</code> -
     *         The AWS account alias (for example, <code>amazon</code>) that owns the
     *         snapshot. </li> <li> <p><code>owner-id</code> - The ID of the AWS
     *         account that owns the snapshot. </li> <li> <p><code>progress</code> -
     *         The progress of the snapshot, as a percentage (for example, 80%).
     *         </li> <li> <p><code>snapshot-id</code> - The snapshot ID. </li> <li>
     *         <p><code>start-time</code> - The time stamp when the snapshot was
     *         initiated. </li> <li> <p><code>status</code> - The status of the
     *         snapshot (<code>pending</code> | <code>completed</code> |
     *         <code>error</code>). </li> <li>
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
     *         filter. </li> <li> <p><code>volume-id</code> - The ID of the volume
     *         the snapshot is for. </li> <li> <p><code>volume-size</code> - The size
     *         of the volume, in GiB. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSnapshotsRequest withFilters(java.util.Collection<Filter> filters) {
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
    public Request<DescribeSnapshotsRequest> getDryRunRequest() {
        Request<DescribeSnapshotsRequest> request = new DescribeSnapshotsRequestMarshaller().marshall(this);
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
        if (getSnapshotIds() != null) sb.append("SnapshotIds: " + getSnapshotIds() + ",");
        if (getOwnerIds() != null) sb.append("OwnerIds: " + getOwnerIds() + ",");
        if (getRestorableByUserIds() != null) sb.append("RestorableByUserIds: " + getRestorableByUserIds() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSnapshotIds() == null) ? 0 : getSnapshotIds().hashCode()); 
        hashCode = prime * hashCode + ((getOwnerIds() == null) ? 0 : getOwnerIds().hashCode()); 
        hashCode = prime * hashCode + ((getRestorableByUserIds() == null) ? 0 : getRestorableByUserIds().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeSnapshotsRequest == false) return false;
        DescribeSnapshotsRequest other = (DescribeSnapshotsRequest)obj;
        
        if (other.getSnapshotIds() == null ^ this.getSnapshotIds() == null) return false;
        if (other.getSnapshotIds() != null && other.getSnapshotIds().equals(this.getSnapshotIds()) == false) return false; 
        if (other.getOwnerIds() == null ^ this.getOwnerIds() == null) return false;
        if (other.getOwnerIds() != null && other.getOwnerIds().equals(this.getOwnerIds()) == false) return false; 
        if (other.getRestorableByUserIds() == null ^ this.getRestorableByUserIds() == null) return false;
        if (other.getRestorableByUserIds() != null && other.getRestorableByUserIds().equals(this.getRestorableByUserIds()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        return true;
    }
    
}
    