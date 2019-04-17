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
import com.amazonaws.services.ec2.model.transform.DescribeSnapshotsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSnapshotsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribeSnapshotsRequest> {

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>description</code> - A description of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-alias</code> - Value from an Amazon-maintained list (<code>amazon</code> | <code>self</code> |
     * <code>all</code> | <code>aws-marketplace</code> | <code>microsoft</code>) of snapshot owners. Not to be confused
     * with the user-configured AWS account alias, which is set from the IAM console.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>progress</code> - The progress of the snapshot, as a percentage (for example, 80%).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>snapshot-id</code> - The snapshot ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start-time</code> - The time stamp when the snapshot was initiated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the snapshot (<code>pending</code> | <code>completed</code> |
     * <code>error</code>).
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
     * <code>volume-id</code> - The ID of the volume the snapshot is for.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-size</code> - The size of the volume, in GiB.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The maximum number of snapshot results returned by <code>DescribeSnapshots</code> in paginated output. When this
     * parameter is used, <code>DescribeSnapshots</code> only returns <code>MaxResults</code> results in a single page
     * along with a <code>NextToken</code> response element. The remaining results of the initial request can be seen by
     * sending another <code>DescribeSnapshots</code> request with the returned <code>NextToken</code> value. This value
     * can be between 5 and 1000; if <code>MaxResults</code> is given a value larger than 1000, only 1000 results are
     * returned. If this parameter is not used, then <code>DescribeSnapshots</code> returns all results. You cannot
     * specify this parameter and the snapshot IDs parameter in the same request.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The <code>NextToken</code> value returned from a previous paginated <code>DescribeSnapshots</code> request where
     * <code>MaxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>NextToken</code> value. This value is <code>null</code>
     * when there are no more results to return.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Describes the snapshots owned by these owners.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> ownerIds;
    /**
     * <p>
     * The IDs of the AWS accounts that can create volumes from the snapshot.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> restorableByUserIds;
    /**
     * <p>
     * The snapshot IDs.
     * </p>
     * <p>
     * Default: Describes the snapshots for which you have create volume permissions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> snapshotIds;

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>description</code> - A description of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-alias</code> - Value from an Amazon-maintained list (<code>amazon</code> | <code>self</code> |
     * <code>all</code> | <code>aws-marketplace</code> | <code>microsoft</code>) of snapshot owners. Not to be confused
     * with the user-configured AWS account alias, which is set from the IAM console.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>progress</code> - The progress of the snapshot, as a percentage (for example, 80%).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>snapshot-id</code> - The snapshot ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start-time</code> - The time stamp when the snapshot was initiated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the snapshot (<code>pending</code> | <code>completed</code> |
     * <code>error</code>).
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
     * <code>volume-id</code> - The ID of the volume the snapshot is for.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-size</code> - The size of the volume, in GiB.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>description</code> - A description of the snapshot.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>owner-alias</code> - Value from an Amazon-maintained list (<code>amazon</code> | <code>self</code>
     *         | <code>all</code> | <code>aws-marketplace</code> | <code>microsoft</code>) of snapshot owners. Not to be
     *         confused with the user-configured AWS account alias, which is set from the IAM console.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>owner-id</code> - The ID of the AWS account that owns the snapshot.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>progress</code> - The progress of the snapshot, as a percentage (for example, 80%).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>snapshot-id</code> - The snapshot ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>start-time</code> - The time stamp when the snapshot was initiated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>status</code> - The status of the snapshot (<code>pending</code> | <code>completed</code> |
     *         <code>error</code>).
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
     *         <code>volume-id</code> - The ID of the volume the snapshot is for.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>volume-size</code> - The size of the volume, in GiB.
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
     * <code>description</code> - A description of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-alias</code> - Value from an Amazon-maintained list (<code>amazon</code> | <code>self</code> |
     * <code>all</code> | <code>aws-marketplace</code> | <code>microsoft</code>) of snapshot owners. Not to be confused
     * with the user-configured AWS account alias, which is set from the IAM console.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>progress</code> - The progress of the snapshot, as a percentage (for example, 80%).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>snapshot-id</code> - The snapshot ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start-time</code> - The time stamp when the snapshot was initiated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the snapshot (<code>pending</code> | <code>completed</code> |
     * <code>error</code>).
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
     * <code>volume-id</code> - The ID of the volume the snapshot is for.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-size</code> - The size of the volume, in GiB.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        The filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>description</code> - A description of the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-alias</code> - Value from an Amazon-maintained list (<code>amazon</code> | <code>self</code> |
     *        <code>all</code> | <code>aws-marketplace</code> | <code>microsoft</code>) of snapshot owners. Not to be
     *        confused with the user-configured AWS account alias, which is set from the IAM console.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code> - The ID of the AWS account that owns the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>progress</code> - The progress of the snapshot, as a percentage (for example, 80%).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>snapshot-id</code> - The snapshot ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>start-time</code> - The time stamp when the snapshot was initiated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status</code> - The status of the snapshot (<code>pending</code> | <code>completed</code> |
     *        <code>error</code>).
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
     *        <code>volume-id</code> - The ID of the volume the snapshot is for.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>volume-size</code> - The size of the volume, in GiB.
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
     * <code>description</code> - A description of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-alias</code> - Value from an Amazon-maintained list (<code>amazon</code> | <code>self</code> |
     * <code>all</code> | <code>aws-marketplace</code> | <code>microsoft</code>) of snapshot owners. Not to be confused
     * with the user-configured AWS account alias, which is set from the IAM console.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>progress</code> - The progress of the snapshot, as a percentage (for example, 80%).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>snapshot-id</code> - The snapshot ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start-time</code> - The time stamp when the snapshot was initiated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the snapshot (<code>pending</code> | <code>completed</code> |
     * <code>error</code>).
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
     * <code>volume-id</code> - The ID of the volume the snapshot is for.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-size</code> - The size of the volume, in GiB.
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
     *        <code>description</code> - A description of the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-alias</code> - Value from an Amazon-maintained list (<code>amazon</code> | <code>self</code> |
     *        <code>all</code> | <code>aws-marketplace</code> | <code>microsoft</code>) of snapshot owners. Not to be
     *        confused with the user-configured AWS account alias, which is set from the IAM console.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code> - The ID of the AWS account that owns the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>progress</code> - The progress of the snapshot, as a percentage (for example, 80%).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>snapshot-id</code> - The snapshot ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>start-time</code> - The time stamp when the snapshot was initiated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status</code> - The status of the snapshot (<code>pending</code> | <code>completed</code> |
     *        <code>error</code>).
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
     *        <code>volume-id</code> - The ID of the volume the snapshot is for.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>volume-size</code> - The size of the volume, in GiB.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotsRequest withFilters(Filter... filters) {
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
     * <code>description</code> - A description of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-alias</code> - Value from an Amazon-maintained list (<code>amazon</code> | <code>self</code> |
     * <code>all</code> | <code>aws-marketplace</code> | <code>microsoft</code>) of snapshot owners. Not to be confused
     * with the user-configured AWS account alias, which is set from the IAM console.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code> - The ID of the AWS account that owns the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>progress</code> - The progress of the snapshot, as a percentage (for example, 80%).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>snapshot-id</code> - The snapshot ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start-time</code> - The time stamp when the snapshot was initiated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the snapshot (<code>pending</code> | <code>completed</code> |
     * <code>error</code>).
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
     * <code>volume-id</code> - The ID of the volume the snapshot is for.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-size</code> - The size of the volume, in GiB.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        The filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>description</code> - A description of the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-alias</code> - Value from an Amazon-maintained list (<code>amazon</code> | <code>self</code> |
     *        <code>all</code> | <code>aws-marketplace</code> | <code>microsoft</code>) of snapshot owners. Not to be
     *        confused with the user-configured AWS account alias, which is set from the IAM console.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code> - The ID of the AWS account that owns the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>progress</code> - The progress of the snapshot, as a percentage (for example, 80%).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>snapshot-id</code> - The snapshot ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>start-time</code> - The time stamp when the snapshot was initiated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status</code> - The status of the snapshot (<code>pending</code> | <code>completed</code> |
     *        <code>error</code>).
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
     *        <code>volume-id</code> - The ID of the volume the snapshot is for.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>volume-size</code> - The size of the volume, in GiB.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of snapshot results returned by <code>DescribeSnapshots</code> in paginated output. When this
     * parameter is used, <code>DescribeSnapshots</code> only returns <code>MaxResults</code> results in a single page
     * along with a <code>NextToken</code> response element. The remaining results of the initial request can be seen by
     * sending another <code>DescribeSnapshots</code> request with the returned <code>NextToken</code> value. This value
     * can be between 5 and 1000; if <code>MaxResults</code> is given a value larger than 1000, only 1000 results are
     * returned. If this parameter is not used, then <code>DescribeSnapshots</code> returns all results. You cannot
     * specify this parameter and the snapshot IDs parameter in the same request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of snapshot results returned by <code>DescribeSnapshots</code> in paginated output.
     *        When this parameter is used, <code>DescribeSnapshots</code> only returns <code>MaxResults</code> results
     *        in a single page along with a <code>NextToken</code> response element. The remaining results of the
     *        initial request can be seen by sending another <code>DescribeSnapshots</code> request with the returned
     *        <code>NextToken</code> value. This value can be between 5 and 1000; if <code>MaxResults</code> is given a
     *        value larger than 1000, only 1000 results are returned. If this parameter is not used, then
     *        <code>DescribeSnapshots</code> returns all results. You cannot specify this parameter and the snapshot IDs
     *        parameter in the same request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of snapshot results returned by <code>DescribeSnapshots</code> in paginated output. When this
     * parameter is used, <code>DescribeSnapshots</code> only returns <code>MaxResults</code> results in a single page
     * along with a <code>NextToken</code> response element. The remaining results of the initial request can be seen by
     * sending another <code>DescribeSnapshots</code> request with the returned <code>NextToken</code> value. This value
     * can be between 5 and 1000; if <code>MaxResults</code> is given a value larger than 1000, only 1000 results are
     * returned. If this parameter is not used, then <code>DescribeSnapshots</code> returns all results. You cannot
     * specify this parameter and the snapshot IDs parameter in the same request.
     * </p>
     * 
     * @return The maximum number of snapshot results returned by <code>DescribeSnapshots</code> in paginated output.
     *         When this parameter is used, <code>DescribeSnapshots</code> only returns <code>MaxResults</code> results
     *         in a single page along with a <code>NextToken</code> response element. The remaining results of the
     *         initial request can be seen by sending another <code>DescribeSnapshots</code> request with the returned
     *         <code>NextToken</code> value. This value can be between 5 and 1000; if <code>MaxResults</code> is given a
     *         value larger than 1000, only 1000 results are returned. If this parameter is not used, then
     *         <code>DescribeSnapshots</code> returns all results. You cannot specify this parameter and the snapshot
     *         IDs parameter in the same request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of snapshot results returned by <code>DescribeSnapshots</code> in paginated output. When this
     * parameter is used, <code>DescribeSnapshots</code> only returns <code>MaxResults</code> results in a single page
     * along with a <code>NextToken</code> response element. The remaining results of the initial request can be seen by
     * sending another <code>DescribeSnapshots</code> request with the returned <code>NextToken</code> value. This value
     * can be between 5 and 1000; if <code>MaxResults</code> is given a value larger than 1000, only 1000 results are
     * returned. If this parameter is not used, then <code>DescribeSnapshots</code> returns all results. You cannot
     * specify this parameter and the snapshot IDs parameter in the same request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of snapshot results returned by <code>DescribeSnapshots</code> in paginated output.
     *        When this parameter is used, <code>DescribeSnapshots</code> only returns <code>MaxResults</code> results
     *        in a single page along with a <code>NextToken</code> response element. The remaining results of the
     *        initial request can be seen by sending another <code>DescribeSnapshots</code> request with the returned
     *        <code>NextToken</code> value. This value can be between 5 and 1000; if <code>MaxResults</code> is given a
     *        value larger than 1000, only 1000 results are returned. If this parameter is not used, then
     *        <code>DescribeSnapshots</code> returns all results. You cannot specify this parameter and the snapshot IDs
     *        parameter in the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The <code>NextToken</code> value returned from a previous paginated <code>DescribeSnapshots</code> request where
     * <code>MaxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>NextToken</code> value. This value is <code>null</code>
     * when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value returned from a previous paginated <code>DescribeSnapshots</code> request
     *        where <code>MaxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *        continues from the end of the previous results that returned the <code>NextToken</code> value. This value
     *        is <code>null</code> when there are no more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value returned from a previous paginated <code>DescribeSnapshots</code> request where
     * <code>MaxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>NextToken</code> value. This value is <code>null</code>
     * when there are no more results to return.
     * </p>
     * 
     * @return The <code>NextToken</code> value returned from a previous paginated <code>DescribeSnapshots</code>
     *         request where <code>MaxResults</code> was used and the results exceeded the value of that parameter.
     *         Pagination continues from the end of the previous results that returned the <code>NextToken</code> value.
     *         This value is <code>null</code> when there are no more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value returned from a previous paginated <code>DescribeSnapshots</code> request where
     * <code>MaxResults</code> was used and the results exceeded the value of that parameter. Pagination continues from
     * the end of the previous results that returned the <code>NextToken</code> value. This value is <code>null</code>
     * when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value returned from a previous paginated <code>DescribeSnapshots</code> request
     *        where <code>MaxResults</code> was used and the results exceeded the value of that parameter. Pagination
     *        continues from the end of the previous results that returned the <code>NextToken</code> value. This value
     *        is <code>null</code> when there are no more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Describes the snapshots owned by these owners.
     * </p>
     * 
     * @return Describes the snapshots owned by these owners.
     */

    public java.util.List<String> getOwnerIds() {
        if (ownerIds == null) {
            ownerIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return ownerIds;
    }

    /**
     * <p>
     * Describes the snapshots owned by these owners.
     * </p>
     * 
     * @param ownerIds
     *        Describes the snapshots owned by these owners.
     */

    public void setOwnerIds(java.util.Collection<String> ownerIds) {
        if (ownerIds == null) {
            this.ownerIds = null;
            return;
        }

        this.ownerIds = new com.amazonaws.internal.SdkInternalList<String>(ownerIds);
    }

    /**
     * <p>
     * Describes the snapshots owned by these owners.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOwnerIds(java.util.Collection)} or {@link #withOwnerIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param ownerIds
     *        Describes the snapshots owned by these owners.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotsRequest withOwnerIds(String... ownerIds) {
        if (this.ownerIds == null) {
            setOwnerIds(new com.amazonaws.internal.SdkInternalList<String>(ownerIds.length));
        }
        for (String ele : ownerIds) {
            this.ownerIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes the snapshots owned by these owners.
     * </p>
     * 
     * @param ownerIds
     *        Describes the snapshots owned by these owners.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotsRequest withOwnerIds(java.util.Collection<String> ownerIds) {
        setOwnerIds(ownerIds);
        return this;
    }

    /**
     * <p>
     * The IDs of the AWS accounts that can create volumes from the snapshot.
     * </p>
     * 
     * @return The IDs of the AWS accounts that can create volumes from the snapshot.
     */

    public java.util.List<String> getRestorableByUserIds() {
        if (restorableByUserIds == null) {
            restorableByUserIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return restorableByUserIds;
    }

    /**
     * <p>
     * The IDs of the AWS accounts that can create volumes from the snapshot.
     * </p>
     * 
     * @param restorableByUserIds
     *        The IDs of the AWS accounts that can create volumes from the snapshot.
     */

    public void setRestorableByUserIds(java.util.Collection<String> restorableByUserIds) {
        if (restorableByUserIds == null) {
            this.restorableByUserIds = null;
            return;
        }

        this.restorableByUserIds = new com.amazonaws.internal.SdkInternalList<String>(restorableByUserIds);
    }

    /**
     * <p>
     * The IDs of the AWS accounts that can create volumes from the snapshot.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRestorableByUserIds(java.util.Collection)} or {@link #withRestorableByUserIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param restorableByUserIds
     *        The IDs of the AWS accounts that can create volumes from the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotsRequest withRestorableByUserIds(String... restorableByUserIds) {
        if (this.restorableByUserIds == null) {
            setRestorableByUserIds(new com.amazonaws.internal.SdkInternalList<String>(restorableByUserIds.length));
        }
        for (String ele : restorableByUserIds) {
            this.restorableByUserIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the AWS accounts that can create volumes from the snapshot.
     * </p>
     * 
     * @param restorableByUserIds
     *        The IDs of the AWS accounts that can create volumes from the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotsRequest withRestorableByUserIds(java.util.Collection<String> restorableByUserIds) {
        setRestorableByUserIds(restorableByUserIds);
        return this;
    }

    /**
     * <p>
     * The snapshot IDs.
     * </p>
     * <p>
     * Default: Describes the snapshots for which you have create volume permissions.
     * </p>
     * 
     * @return The snapshot IDs.</p>
     *         <p>
     *         Default: Describes the snapshots for which you have create volume permissions.
     */

    public java.util.List<String> getSnapshotIds() {
        if (snapshotIds == null) {
            snapshotIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return snapshotIds;
    }

    /**
     * <p>
     * The snapshot IDs.
     * </p>
     * <p>
     * Default: Describes the snapshots for which you have create volume permissions.
     * </p>
     * 
     * @param snapshotIds
     *        The snapshot IDs.</p>
     *        <p>
     *        Default: Describes the snapshots for which you have create volume permissions.
     */

    public void setSnapshotIds(java.util.Collection<String> snapshotIds) {
        if (snapshotIds == null) {
            this.snapshotIds = null;
            return;
        }

        this.snapshotIds = new com.amazonaws.internal.SdkInternalList<String>(snapshotIds);
    }

    /**
     * <p>
     * The snapshot IDs.
     * </p>
     * <p>
     * Default: Describes the snapshots for which you have create volume permissions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSnapshotIds(java.util.Collection)} or {@link #withSnapshotIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param snapshotIds
     *        The snapshot IDs.</p>
     *        <p>
     *        Default: Describes the snapshots for which you have create volume permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotsRequest withSnapshotIds(String... snapshotIds) {
        if (this.snapshotIds == null) {
            setSnapshotIds(new com.amazonaws.internal.SdkInternalList<String>(snapshotIds.length));
        }
        for (String ele : snapshotIds) {
            this.snapshotIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The snapshot IDs.
     * </p>
     * <p>
     * Default: Describes the snapshots for which you have create volume permissions.
     * </p>
     * 
     * @param snapshotIds
     *        The snapshot IDs.</p>
     *        <p>
     *        Default: Describes the snapshots for which you have create volume permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotsRequest withSnapshotIds(java.util.Collection<String> snapshotIds) {
        setSnapshotIds(snapshotIds);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeSnapshotsRequest> getDryRunRequest() {
        Request<DescribeSnapshotsRequest> request = new DescribeSnapshotsRequestMarshaller().marshall(this);
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getOwnerIds() != null)
            sb.append("OwnerIds: ").append(getOwnerIds()).append(",");
        if (getRestorableByUserIds() != null)
            sb.append("RestorableByUserIds: ").append(getRestorableByUserIds()).append(",");
        if (getSnapshotIds() != null)
            sb.append("SnapshotIds: ").append(getSnapshotIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSnapshotsRequest == false)
            return false;
        DescribeSnapshotsRequest other = (DescribeSnapshotsRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getOwnerIds() == null ^ this.getOwnerIds() == null)
            return false;
        if (other.getOwnerIds() != null && other.getOwnerIds().equals(this.getOwnerIds()) == false)
            return false;
        if (other.getRestorableByUserIds() == null ^ this.getRestorableByUserIds() == null)
            return false;
        if (other.getRestorableByUserIds() != null && other.getRestorableByUserIds().equals(this.getRestorableByUserIds()) == false)
            return false;
        if (other.getSnapshotIds() == null ^ this.getSnapshotIds() == null)
            return false;
        if (other.getSnapshotIds() != null && other.getSnapshotIds().equals(this.getSnapshotIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getOwnerIds() == null) ? 0 : getOwnerIds().hashCode());
        hashCode = prime * hashCode + ((getRestorableByUserIds() == null) ? 0 : getRestorableByUserIds().hashCode());
        hashCode = prime * hashCode + ((getSnapshotIds() == null) ? 0 : getSnapshotIds().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSnapshotsRequest clone() {
        return (DescribeSnapshotsRequest) super.clone();
    }
}
