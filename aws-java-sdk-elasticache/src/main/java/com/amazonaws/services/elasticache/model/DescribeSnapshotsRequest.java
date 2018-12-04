/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a <i>DescribeSnapshotsMessage</i> action.
 * </p>
 */
public class DescribeSnapshotsRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * A user-supplied cluster identifier. If this parameter is specified, only
     * snapshots associated with that specific cache cluster will be described.
     * </p>
     */
    private String cacheClusterId;
    /**
     * <p>
     * A user-supplied name of the snapshot. If this parameter is specified,
     * only this snapshot will be described.
     * </p>
     */
    private String snapshotName;
    /**
     * <p>
     * If set to <code>system</code>, the output shows snapshots that were
     * automatically created by ElastiCache. If set to <code>user</code> the
     * output shows snapshots that were manually created. If omitted, the output
     * shows both automatically and manually created snapshots.
     * </p>
     */
    private String snapshotSource;
    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for
     * pagination of results from this action. If this parameter is specified,
     * the response includes only records beyond the marker, up to the value
     * specified by <i>MaxRecords</i>.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a marker is
     * included in the response so that the remaining results can be retrieved.
     * </p>
     * <p>
     * Default: 50
     * </p>
     * <p>
     * Constraints: minimum 20; maximum 50.
     * </p>
     */
    private Integer maxRecords;

    /**
     * <p>
     * A user-supplied cluster identifier. If this parameter is specified, only
     * snapshots associated with that specific cache cluster will be described.
     * </p>
     * 
     * @param cacheClusterId
     *        A user-supplied cluster identifier. If this parameter is
     *        specified, only snapshots associated with that specific cache
     *        cluster will be described.
     */

    public void setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
    }

    /**
     * <p>
     * A user-supplied cluster identifier. If this parameter is specified, only
     * snapshots associated with that specific cache cluster will be described.
     * </p>
     * 
     * @return A user-supplied cluster identifier. If this parameter is
     *         specified, only snapshots associated with that specific cache
     *         cluster will be described.
     */

    public String getCacheClusterId() {
        return this.cacheClusterId;
    }

    /**
     * <p>
     * A user-supplied cluster identifier. If this parameter is specified, only
     * snapshots associated with that specific cache cluster will be described.
     * </p>
     * 
     * @param cacheClusterId
     *        A user-supplied cluster identifier. If this parameter is
     *        specified, only snapshots associated with that specific cache
     *        cluster will be described.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeSnapshotsRequest withCacheClusterId(String cacheClusterId) {
        setCacheClusterId(cacheClusterId);
        return this;
    }

    /**
     * <p>
     * A user-supplied name of the snapshot. If this parameter is specified,
     * only this snapshot will be described.
     * </p>
     * 
     * @param snapshotName
     *        A user-supplied name of the snapshot. If this parameter is
     *        specified, only this snapshot will be described.
     */

    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }

    /**
     * <p>
     * A user-supplied name of the snapshot. If this parameter is specified,
     * only this snapshot will be described.
     * </p>
     * 
     * @return A user-supplied name of the snapshot. If this parameter is
     *         specified, only this snapshot will be described.
     */

    public String getSnapshotName() {
        return this.snapshotName;
    }

    /**
     * <p>
     * A user-supplied name of the snapshot. If this parameter is specified,
     * only this snapshot will be described.
     * </p>
     * 
     * @param snapshotName
     *        A user-supplied name of the snapshot. If this parameter is
     *        specified, only this snapshot will be described.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeSnapshotsRequest withSnapshotName(String snapshotName) {
        setSnapshotName(snapshotName);
        return this;
    }

    /**
     * <p>
     * If set to <code>system</code>, the output shows snapshots that were
     * automatically created by ElastiCache. If set to <code>user</code> the
     * output shows snapshots that were manually created. If omitted, the output
     * shows both automatically and manually created snapshots.
     * </p>
     * 
     * @param snapshotSource
     *        If set to <code>system</code>, the output shows snapshots that
     *        were automatically created by ElastiCache. If set to
     *        <code>user</code> the output shows snapshots that were manually
     *        created. If omitted, the output shows both automatically and
     *        manually created snapshots.
     */

    public void setSnapshotSource(String snapshotSource) {
        this.snapshotSource = snapshotSource;
    }

    /**
     * <p>
     * If set to <code>system</code>, the output shows snapshots that were
     * automatically created by ElastiCache. If set to <code>user</code> the
     * output shows snapshots that were manually created. If omitted, the output
     * shows both automatically and manually created snapshots.
     * </p>
     * 
     * @return If set to <code>system</code>, the output shows snapshots that
     *         were automatically created by ElastiCache. If set to
     *         <code>user</code> the output shows snapshots that were manually
     *         created. If omitted, the output shows both automatically and
     *         manually created snapshots.
     */

    public String getSnapshotSource() {
        return this.snapshotSource;
    }

    /**
     * <p>
     * If set to <code>system</code>, the output shows snapshots that were
     * automatically created by ElastiCache. If set to <code>user</code> the
     * output shows snapshots that were manually created. If omitted, the output
     * shows both automatically and manually created snapshots.
     * </p>
     * 
     * @param snapshotSource
     *        If set to <code>system</code>, the output shows snapshots that
     *        were automatically created by ElastiCache. If set to
     *        <code>user</code> the output shows snapshots that were manually
     *        created. If omitted, the output shows both automatically and
     *        manually created snapshots.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeSnapshotsRequest withSnapshotSource(String snapshotSource) {
        setSnapshotSource(snapshotSource);
        return this;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for
     * pagination of results from this action. If this parameter is specified,
     * the response includes only records beyond the marker, up to the value
     * specified by <i>MaxRecords</i>.
     * </p>
     * 
     * @param marker
     *        An optional marker returned from a prior request. Use this marker
     *        for pagination of results from this action. If this parameter is
     *        specified, the response includes only records beyond the marker,
     *        up to the value specified by <i>MaxRecords</i>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for
     * pagination of results from this action. If this parameter is specified,
     * the response includes only records beyond the marker, up to the value
     * specified by <i>MaxRecords</i>.
     * </p>
     * 
     * @return An optional marker returned from a prior request. Use this marker
     *         for pagination of results from this action. If this parameter is
     *         specified, the response includes only records beyond the marker,
     *         up to the value specified by <i>MaxRecords</i>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for
     * pagination of results from this action. If this parameter is specified,
     * the response includes only records beyond the marker, up to the value
     * specified by <i>MaxRecords</i>.
     * </p>
     * 
     * @param marker
     *        An optional marker returned from a prior request. Use this marker
     *        for pagination of results from this action. If this parameter is
     *        specified, the response includes only records beyond the marker,
     *        up to the value specified by <i>MaxRecords</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeSnapshotsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a marker is
     * included in the response so that the remaining results can be retrieved.
     * </p>
     * <p>
     * Default: 50
     * </p>
     * <p>
     * Constraints: minimum 20; maximum 50.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more
     *        records exist than the specified <code>MaxRecords</code> value, a
     *        marker is included in the response so that the remaining results
     *        can be retrieved.</p>
     *        <p>
     *        Default: 50
     *        </p>
     *        <p>
     *        Constraints: minimum 20; maximum 50.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a marker is
     * included in the response so that the remaining results can be retrieved.
     * </p>
     * <p>
     * Default: 50
     * </p>
     * <p>
     * Constraints: minimum 20; maximum 50.
     * </p>
     * 
     * @return The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         marker is included in the response so that the remaining results
     *         can be retrieved.</p>
     *         <p>
     *         Default: 50
     *         </p>
     *         <p>
     *         Constraints: minimum 20; maximum 50.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records
     * exist than the specified <code>MaxRecords</code> value, a marker is
     * included in the response so that the remaining results can be retrieved.
     * </p>
     * <p>
     * Default: 50
     * </p>
     * <p>
     * Constraints: minimum 20; maximum 50.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more
     *        records exist than the specified <code>MaxRecords</code> value, a
     *        marker is included in the response so that the remaining results
     *        can be retrieved.</p>
     *        <p>
     *        Default: 50
     *        </p>
     *        <p>
     *        Constraints: minimum 20; maximum 50.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeSnapshotsRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
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
        if (getCacheClusterId() != null)
            sb.append("CacheClusterId: " + getCacheClusterId() + ",");
        if (getSnapshotName() != null)
            sb.append("SnapshotName: " + getSnapshotName() + ",");
        if (getSnapshotSource() != null)
            sb.append("SnapshotSource: " + getSnapshotSource() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: " + getMaxRecords());
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
        if (other.getCacheClusterId() == null
                ^ this.getCacheClusterId() == null)
            return false;
        if (other.getCacheClusterId() != null
                && other.getCacheClusterId().equals(this.getCacheClusterId()) == false)
            return false;
        if (other.getSnapshotName() == null ^ this.getSnapshotName() == null)
            return false;
        if (other.getSnapshotName() != null
                && other.getSnapshotName().equals(this.getSnapshotName()) == false)
            return false;
        if (other.getSnapshotSource() == null
                ^ this.getSnapshotSource() == null)
            return false;
        if (other.getSnapshotSource() != null
                && other.getSnapshotSource().equals(this.getSnapshotSource()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null
                && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null
                && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCacheClusterId() == null) ? 0 : getCacheClusterId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSnapshotName() == null) ? 0 : getSnapshotName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSnapshotSource() == null) ? 0 : getSnapshotSource()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSnapshotsRequest clone() {
        return (DescribeSnapshotsRequest) super.clone();
    }
}