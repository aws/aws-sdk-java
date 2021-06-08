/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.services.ec2.model.transform.DescribeVolumesModificationsRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVolumesModificationsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeVolumesModificationsRequest> {

    /**
     * <p>
     * The IDs of the volumes.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> volumeIds;
    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>modification-state</code> - The current modification state (modifying | optimizing | completed | failed).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>original-iops</code> - The original IOPS rate of the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>original-size</code> - The original size of the volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>original-volume-type</code> - The original volume type of the volume (standard | io1 | io2 | gp2 | sc1 |
     * st1).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>originalMultiAttachEnabled</code> - Indicates whether Multi-Attach support was enabled (true | false).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start-time</code> - The modification start time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>target-iops</code> - The target IOPS rate of the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>target-size</code> - The target size of the volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>target-volume-type</code> - The target volume type of the volume (standard | io1 | io2 | gp2 | sc1 | st1).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>targetMultiAttachEnabled</code> - Indicates whether Multi-Attach support is to be enabled (true | false).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-id</code> - The ID of the volume.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The <code>nextToken</code> value returned by a previous paginated request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results (up to a limit of 500) to be returned in a paginated request.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The IDs of the volumes.
     * </p>
     * 
     * @return The IDs of the volumes.
     */

    public java.util.List<String> getVolumeIds() {
        if (volumeIds == null) {
            volumeIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return volumeIds;
    }

    /**
     * <p>
     * The IDs of the volumes.
     * </p>
     * 
     * @param volumeIds
     *        The IDs of the volumes.
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
     * The IDs of the volumes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVolumeIds(java.util.Collection)} or {@link #withVolumeIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param volumeIds
     *        The IDs of the volumes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVolumesModificationsRequest withVolumeIds(String... volumeIds) {
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
     * The IDs of the volumes.
     * </p>
     * 
     * @param volumeIds
     *        The IDs of the volumes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVolumesModificationsRequest withVolumeIds(java.util.Collection<String> volumeIds) {
        setVolumeIds(volumeIds);
        return this;
    }

    /**
     * <p>
     * The filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>modification-state</code> - The current modification state (modifying | optimizing | completed | failed).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>original-iops</code> - The original IOPS rate of the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>original-size</code> - The original size of the volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>original-volume-type</code> - The original volume type of the volume (standard | io1 | io2 | gp2 | sc1 |
     * st1).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>originalMultiAttachEnabled</code> - Indicates whether Multi-Attach support was enabled (true | false).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start-time</code> - The modification start time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>target-iops</code> - The target IOPS rate of the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>target-size</code> - The target size of the volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>target-volume-type</code> - The target volume type of the volume (standard | io1 | io2 | gp2 | sc1 | st1).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>targetMultiAttachEnabled</code> - Indicates whether Multi-Attach support is to be enabled (true | false).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-id</code> - The ID of the volume.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>modification-state</code> - The current modification state (modifying | optimizing | completed |
     *         failed).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>original-iops</code> - The original IOPS rate of the volume.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>original-size</code> - The original size of the volume, in GiB.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>original-volume-type</code> - The original volume type of the volume (standard | io1 | io2 | gp2 |
     *         sc1 | st1).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>originalMultiAttachEnabled</code> - Indicates whether Multi-Attach support was enabled (true |
     *         false).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>start-time</code> - The modification start time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>target-iops</code> - The target IOPS rate of the volume.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>target-size</code> - The target size of the volume, in GiB.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>target-volume-type</code> - The target volume type of the volume (standard | io1 | io2 | gp2 | sc1
     *         | st1).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>targetMultiAttachEnabled</code> - Indicates whether Multi-Attach support is to be enabled (true |
     *         false).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>volume-id</code> - The ID of the volume.
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
     * <code>modification-state</code> - The current modification state (modifying | optimizing | completed | failed).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>original-iops</code> - The original IOPS rate of the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>original-size</code> - The original size of the volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>original-volume-type</code> - The original volume type of the volume (standard | io1 | io2 | gp2 | sc1 |
     * st1).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>originalMultiAttachEnabled</code> - Indicates whether Multi-Attach support was enabled (true | false).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start-time</code> - The modification start time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>target-iops</code> - The target IOPS rate of the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>target-size</code> - The target size of the volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>target-volume-type</code> - The target volume type of the volume (standard | io1 | io2 | gp2 | sc1 | st1).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>targetMultiAttachEnabled</code> - Indicates whether Multi-Attach support is to be enabled (true | false).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-id</code> - The ID of the volume.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        The filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>modification-state</code> - The current modification state (modifying | optimizing | completed |
     *        failed).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>original-iops</code> - The original IOPS rate of the volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>original-size</code> - The original size of the volume, in GiB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>original-volume-type</code> - The original volume type of the volume (standard | io1 | io2 | gp2 |
     *        sc1 | st1).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>originalMultiAttachEnabled</code> - Indicates whether Multi-Attach support was enabled (true |
     *        false).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>start-time</code> - The modification start time.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>target-iops</code> - The target IOPS rate of the volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>target-size</code> - The target size of the volume, in GiB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>target-volume-type</code> - The target volume type of the volume (standard | io1 | io2 | gp2 | sc1 |
     *        st1).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>targetMultiAttachEnabled</code> - Indicates whether Multi-Attach support is to be enabled (true |
     *        false).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>volume-id</code> - The ID of the volume.
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
     * <code>modification-state</code> - The current modification state (modifying | optimizing | completed | failed).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>original-iops</code> - The original IOPS rate of the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>original-size</code> - The original size of the volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>original-volume-type</code> - The original volume type of the volume (standard | io1 | io2 | gp2 | sc1 |
     * st1).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>originalMultiAttachEnabled</code> - Indicates whether Multi-Attach support was enabled (true | false).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start-time</code> - The modification start time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>target-iops</code> - The target IOPS rate of the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>target-size</code> - The target size of the volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>target-volume-type</code> - The target volume type of the volume (standard | io1 | io2 | gp2 | sc1 | st1).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>targetMultiAttachEnabled</code> - Indicates whether Multi-Attach support is to be enabled (true | false).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-id</code> - The ID of the volume.
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
     *        <code>modification-state</code> - The current modification state (modifying | optimizing | completed |
     *        failed).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>original-iops</code> - The original IOPS rate of the volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>original-size</code> - The original size of the volume, in GiB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>original-volume-type</code> - The original volume type of the volume (standard | io1 | io2 | gp2 |
     *        sc1 | st1).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>originalMultiAttachEnabled</code> - Indicates whether Multi-Attach support was enabled (true |
     *        false).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>start-time</code> - The modification start time.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>target-iops</code> - The target IOPS rate of the volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>target-size</code> - The target size of the volume, in GiB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>target-volume-type</code> - The target volume type of the volume (standard | io1 | io2 | gp2 | sc1 |
     *        st1).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>targetMultiAttachEnabled</code> - Indicates whether Multi-Attach support is to be enabled (true |
     *        false).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>volume-id</code> - The ID of the volume.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVolumesModificationsRequest withFilters(Filter... filters) {
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
     * <code>modification-state</code> - The current modification state (modifying | optimizing | completed | failed).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>original-iops</code> - The original IOPS rate of the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>original-size</code> - The original size of the volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>original-volume-type</code> - The original volume type of the volume (standard | io1 | io2 | gp2 | sc1 |
     * st1).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>originalMultiAttachEnabled</code> - Indicates whether Multi-Attach support was enabled (true | false).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>start-time</code> - The modification start time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>target-iops</code> - The target IOPS rate of the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>target-size</code> - The target size of the volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>target-volume-type</code> - The target volume type of the volume (standard | io1 | io2 | gp2 | sc1 | st1).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>targetMultiAttachEnabled</code> - Indicates whether Multi-Attach support is to be enabled (true | false).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-id</code> - The ID of the volume.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        The filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>modification-state</code> - The current modification state (modifying | optimizing | completed |
     *        failed).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>original-iops</code> - The original IOPS rate of the volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>original-size</code> - The original size of the volume, in GiB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>original-volume-type</code> - The original volume type of the volume (standard | io1 | io2 | gp2 |
     *        sc1 | st1).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>originalMultiAttachEnabled</code> - Indicates whether Multi-Attach support was enabled (true |
     *        false).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>start-time</code> - The modification start time.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>target-iops</code> - The target IOPS rate of the volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>target-size</code> - The target size of the volume, in GiB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>target-volume-type</code> - The target volume type of the volume (standard | io1 | io2 | gp2 | sc1 |
     *        st1).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>targetMultiAttachEnabled</code> - Indicates whether Multi-Attach support is to be enabled (true |
     *        false).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>volume-id</code> - The ID of the volume.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVolumesModificationsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned by a previous paginated request.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned by a previous paginated request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned by a previous paginated request.
     * </p>
     * 
     * @return The <code>nextToken</code> value returned by a previous paginated request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value returned by a previous paginated request.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> value returned by a previous paginated request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVolumesModificationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results (up to a limit of 500) to be returned in a paginated request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results (up to a limit of 500) to be returned in a paginated request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results (up to a limit of 500) to be returned in a paginated request.
     * </p>
     * 
     * @return The maximum number of results (up to a limit of 500) to be returned in a paginated request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results (up to a limit of 500) to be returned in a paginated request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results (up to a limit of 500) to be returned in a paginated request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVolumesModificationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeVolumesModificationsRequest> getDryRunRequest() {
        Request<DescribeVolumesModificationsRequest> request = new DescribeVolumesModificationsRequestMarshaller().marshall(this);
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
        if (getVolumeIds() != null)
            sb.append("VolumeIds: ").append(getVolumeIds()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
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

        if (obj instanceof DescribeVolumesModificationsRequest == false)
            return false;
        DescribeVolumesModificationsRequest other = (DescribeVolumesModificationsRequest) obj;
        if (other.getVolumeIds() == null ^ this.getVolumeIds() == null)
            return false;
        if (other.getVolumeIds() != null && other.getVolumeIds().equals(this.getVolumeIds()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
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

        hashCode = prime * hashCode + ((getVolumeIds() == null) ? 0 : getVolumeIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVolumesModificationsRequest clone() {
        return (DescribeVolumesModificationsRequest) super.clone();
    }
}
