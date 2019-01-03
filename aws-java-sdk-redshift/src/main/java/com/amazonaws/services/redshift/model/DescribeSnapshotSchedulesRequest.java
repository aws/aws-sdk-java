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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeSnapshotSchedules" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSnapshotSchedulesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the cluster whose snapshot schedules you want to view.
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * A unique identifier for a snapshot schedule.
     * </p>
     */
    private String scheduleIdentifier;
    /**
     * <p>
     * The key value for a snapshot schedule tag.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> tagKeys;
    /**
     * <p>
     * The value corresponding to the key of the snapshot schedule tag.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> tagValues;
    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned marker value
     * in the <code>marker</code> parameter and retrying the command. If the <code>marker</code> field is empty, all
     * response records have been retrieved for the request.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The maximum number or response records to return in each call. If the number of remaining response records
     * exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of the
     * response. You can retrieve the next set of records by retrying the command with the returned <code>marker</code>
     * value.
     * </p>
     */
    private Integer maxRecords;

    /**
     * <p>
     * The unique identifier for the cluster whose snapshot schedules you want to view.
     * </p>
     * 
     * @param clusterIdentifier
     *        The unique identifier for the cluster whose snapshot schedules you want to view.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier for the cluster whose snapshot schedules you want to view.
     * </p>
     * 
     * @return The unique identifier for the cluster whose snapshot schedules you want to view.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier for the cluster whose snapshot schedules you want to view.
     * </p>
     * 
     * @param clusterIdentifier
     *        The unique identifier for the cluster whose snapshot schedules you want to view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotSchedulesRequest withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * A unique identifier for a snapshot schedule.
     * </p>
     * 
     * @param scheduleIdentifier
     *        A unique identifier for a snapshot schedule.
     */

    public void setScheduleIdentifier(String scheduleIdentifier) {
        this.scheduleIdentifier = scheduleIdentifier;
    }

    /**
     * <p>
     * A unique identifier for a snapshot schedule.
     * </p>
     * 
     * @return A unique identifier for a snapshot schedule.
     */

    public String getScheduleIdentifier() {
        return this.scheduleIdentifier;
    }

    /**
     * <p>
     * A unique identifier for a snapshot schedule.
     * </p>
     * 
     * @param scheduleIdentifier
     *        A unique identifier for a snapshot schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotSchedulesRequest withScheduleIdentifier(String scheduleIdentifier) {
        setScheduleIdentifier(scheduleIdentifier);
        return this;
    }

    /**
     * <p>
     * The key value for a snapshot schedule tag.
     * </p>
     * 
     * @return The key value for a snapshot schedule tag.
     */

    public java.util.List<String> getTagKeys() {
        if (tagKeys == null) {
            tagKeys = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return tagKeys;
    }

    /**
     * <p>
     * The key value for a snapshot schedule tag.
     * </p>
     * 
     * @param tagKeys
     *        The key value for a snapshot schedule tag.
     */

    public void setTagKeys(java.util.Collection<String> tagKeys) {
        if (tagKeys == null) {
            this.tagKeys = null;
            return;
        }

        this.tagKeys = new com.amazonaws.internal.SdkInternalList<String>(tagKeys);
    }

    /**
     * <p>
     * The key value for a snapshot schedule tag.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagKeys(java.util.Collection)} or {@link #withTagKeys(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tagKeys
     *        The key value for a snapshot schedule tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotSchedulesRequest withTagKeys(String... tagKeys) {
        if (this.tagKeys == null) {
            setTagKeys(new com.amazonaws.internal.SdkInternalList<String>(tagKeys.length));
        }
        for (String ele : tagKeys) {
            this.tagKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The key value for a snapshot schedule tag.
     * </p>
     * 
     * @param tagKeys
     *        The key value for a snapshot schedule tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotSchedulesRequest withTagKeys(java.util.Collection<String> tagKeys) {
        setTagKeys(tagKeys);
        return this;
    }

    /**
     * <p>
     * The value corresponding to the key of the snapshot schedule tag.
     * </p>
     * 
     * @return The value corresponding to the key of the snapshot schedule tag.
     */

    public java.util.List<String> getTagValues() {
        if (tagValues == null) {
            tagValues = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return tagValues;
    }

    /**
     * <p>
     * The value corresponding to the key of the snapshot schedule tag.
     * </p>
     * 
     * @param tagValues
     *        The value corresponding to the key of the snapshot schedule tag.
     */

    public void setTagValues(java.util.Collection<String> tagValues) {
        if (tagValues == null) {
            this.tagValues = null;
            return;
        }

        this.tagValues = new com.amazonaws.internal.SdkInternalList<String>(tagValues);
    }

    /**
     * <p>
     * The value corresponding to the key of the snapshot schedule tag.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagValues(java.util.Collection)} or {@link #withTagValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tagValues
     *        The value corresponding to the key of the snapshot schedule tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotSchedulesRequest withTagValues(String... tagValues) {
        if (this.tagValues == null) {
            setTagValues(new com.amazonaws.internal.SdkInternalList<String>(tagValues.length));
        }
        for (String ele : tagValues) {
            this.tagValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The value corresponding to the key of the snapshot schedule tag.
     * </p>
     * 
     * @param tagValues
     *        The value corresponding to the key of the snapshot schedule tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotSchedulesRequest withTagValues(java.util.Collection<String> tagValues) {
        setTagValues(tagValues);
        return this;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned marker value
     * in the <code>marker</code> parameter and retrying the command. If the <code>marker</code> field is empty, all
     * response records have been retrieved for the request.
     * </p>
     * 
     * @param marker
     *        A value that indicates the starting point for the next set of response records in a subsequent request. If
     *        a value is returned in a response, you can retrieve the next set of records by providing this returned
     *        marker value in the <code>marker</code> parameter and retrying the command. If the <code>marker</code>
     *        field is empty, all response records have been retrieved for the request.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned marker value
     * in the <code>marker</code> parameter and retrying the command. If the <code>marker</code> field is empty, all
     * response records have been retrieved for the request.
     * </p>
     * 
     * @return A value that indicates the starting point for the next set of response records in a subsequent request.
     *         If a value is returned in a response, you can retrieve the next set of records by providing this returned
     *         marker value in the <code>marker</code> parameter and retrying the command. If the <code>marker</code>
     *         field is empty, all response records have been retrieved for the request.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * A value that indicates the starting point for the next set of response records in a subsequent request. If a
     * value is returned in a response, you can retrieve the next set of records by providing this returned marker value
     * in the <code>marker</code> parameter and retrying the command. If the <code>marker</code> field is empty, all
     * response records have been retrieved for the request.
     * </p>
     * 
     * @param marker
     *        A value that indicates the starting point for the next set of response records in a subsequent request. If
     *        a value is returned in a response, you can retrieve the next set of records by providing this returned
     *        marker value in the <code>marker</code> parameter and retrying the command. If the <code>marker</code>
     *        field is empty, all response records have been retrieved for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotSchedulesRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The maximum number or response records to return in each call. If the number of remaining response records
     * exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of the
     * response. You can retrieve the next set of records by retrying the command with the returned <code>marker</code>
     * value.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number or response records to return in each call. If the number of remaining response records
     *        exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of
     *        the response. You can retrieve the next set of records by retrying the command with the returned
     *        <code>marker</code> value.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number or response records to return in each call. If the number of remaining response records
     * exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of the
     * response. You can retrieve the next set of records by retrying the command with the returned <code>marker</code>
     * value.
     * </p>
     * 
     * @return The maximum number or response records to return in each call. If the number of remaining response
     *         records exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code>
     *         field of the response. You can retrieve the next set of records by retrying the command with the returned
     *         <code>marker</code> value.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number or response records to return in each call. If the number of remaining response records
     * exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of the
     * response. You can retrieve the next set of records by retrying the command with the returned <code>marker</code>
     * value.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number or response records to return in each call. If the number of remaining response records
     *        exceeds the specified <code>MaxRecords</code> value, a value is returned in a <code>marker</code> field of
     *        the response. You can retrieve the next set of records by retrying the command with the returned
     *        <code>marker</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotSchedulesRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
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
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: ").append(getClusterIdentifier()).append(",");
        if (getScheduleIdentifier() != null)
            sb.append("ScheduleIdentifier: ").append(getScheduleIdentifier()).append(",");
        if (getTagKeys() != null)
            sb.append("TagKeys: ").append(getTagKeys()).append(",");
        if (getTagValues() != null)
            sb.append("TagValues: ").append(getTagValues()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: ").append(getMaxRecords());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSnapshotSchedulesRequest == false)
            return false;
        DescribeSnapshotSchedulesRequest other = (DescribeSnapshotSchedulesRequest) obj;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getScheduleIdentifier() == null ^ this.getScheduleIdentifier() == null)
            return false;
        if (other.getScheduleIdentifier() != null && other.getScheduleIdentifier().equals(this.getScheduleIdentifier()) == false)
            return false;
        if (other.getTagKeys() == null ^ this.getTagKeys() == null)
            return false;
        if (other.getTagKeys() != null && other.getTagKeys().equals(this.getTagKeys()) == false)
            return false;
        if (other.getTagValues() == null ^ this.getTagValues() == null)
            return false;
        if (other.getTagValues() != null && other.getTagValues().equals(this.getTagValues()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getScheduleIdentifier() == null) ? 0 : getScheduleIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode());
        hashCode = prime * hashCode + ((getTagValues() == null) ? 0 : getTagValues().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSnapshotSchedulesRequest clone() {
        return (DescribeSnapshotSchedulesRequest) super.clone();
    }

}
