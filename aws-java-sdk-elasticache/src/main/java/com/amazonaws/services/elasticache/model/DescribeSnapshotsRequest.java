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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a <code>DescribeSnapshotsMessage</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeSnapshots" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSnapshotsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A user-supplied replication group identifier. If this parameter is specified, only snapshots associated with that
     * specific replication group are described.
     * </p>
     */
    private String replicationGroupId;
    /**
     * <p>
     * A user-supplied cluster identifier. If this parameter is specified, only snapshots associated with that specific
     * cluster are described.
     * </p>
     */
    private String cacheClusterId;
    /**
     * <p>
     * A user-supplied name of the snapshot. If this parameter is specified, only this snapshot are described.
     * </p>
     */
    private String snapshotName;
    /**
     * <p>
     * If set to <code>system</code>, the output shows snapshots that were automatically created by ElastiCache. If set
     * to <code>user</code> the output shows snapshots that were manually created. If omitted, the output shows both
     * automatically and manually created snapshots.
     * </p>
     */
    private String snapshotSource;
    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a marker is included in the response so that the remaining results can be
     * retrieved.
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
     * A Boolean value which if true, the node group (shard) configuration is included in the snapshot description.
     * </p>
     */
    private Boolean showNodeGroupConfig;

    /**
     * <p>
     * A user-supplied replication group identifier. If this parameter is specified, only snapshots associated with that
     * specific replication group are described.
     * </p>
     * 
     * @param replicationGroupId
     *        A user-supplied replication group identifier. If this parameter is specified, only snapshots associated
     *        with that specific replication group are described.
     */

    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }

    /**
     * <p>
     * A user-supplied replication group identifier. If this parameter is specified, only snapshots associated with that
     * specific replication group are described.
     * </p>
     * 
     * @return A user-supplied replication group identifier. If this parameter is specified, only snapshots associated
     *         with that specific replication group are described.
     */

    public String getReplicationGroupId() {
        return this.replicationGroupId;
    }

    /**
     * <p>
     * A user-supplied replication group identifier. If this parameter is specified, only snapshots associated with that
     * specific replication group are described.
     * </p>
     * 
     * @param replicationGroupId
     *        A user-supplied replication group identifier. If this parameter is specified, only snapshots associated
     *        with that specific replication group are described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotsRequest withReplicationGroupId(String replicationGroupId) {
        setReplicationGroupId(replicationGroupId);
        return this;
    }

    /**
     * <p>
     * A user-supplied cluster identifier. If this parameter is specified, only snapshots associated with that specific
     * cluster are described.
     * </p>
     * 
     * @param cacheClusterId
     *        A user-supplied cluster identifier. If this parameter is specified, only snapshots associated with that
     *        specific cluster are described.
     */

    public void setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
    }

    /**
     * <p>
     * A user-supplied cluster identifier. If this parameter is specified, only snapshots associated with that specific
     * cluster are described.
     * </p>
     * 
     * @return A user-supplied cluster identifier. If this parameter is specified, only snapshots associated with that
     *         specific cluster are described.
     */

    public String getCacheClusterId() {
        return this.cacheClusterId;
    }

    /**
     * <p>
     * A user-supplied cluster identifier. If this parameter is specified, only snapshots associated with that specific
     * cluster are described.
     * </p>
     * 
     * @param cacheClusterId
     *        A user-supplied cluster identifier. If this parameter is specified, only snapshots associated with that
     *        specific cluster are described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotsRequest withCacheClusterId(String cacheClusterId) {
        setCacheClusterId(cacheClusterId);
        return this;
    }

    /**
     * <p>
     * A user-supplied name of the snapshot. If this parameter is specified, only this snapshot are described.
     * </p>
     * 
     * @param snapshotName
     *        A user-supplied name of the snapshot. If this parameter is specified, only this snapshot are described.
     */

    public void setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
    }

    /**
     * <p>
     * A user-supplied name of the snapshot. If this parameter is specified, only this snapshot are described.
     * </p>
     * 
     * @return A user-supplied name of the snapshot. If this parameter is specified, only this snapshot are described.
     */

    public String getSnapshotName() {
        return this.snapshotName;
    }

    /**
     * <p>
     * A user-supplied name of the snapshot. If this parameter is specified, only this snapshot are described.
     * </p>
     * 
     * @param snapshotName
     *        A user-supplied name of the snapshot. If this parameter is specified, only this snapshot are described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotsRequest withSnapshotName(String snapshotName) {
        setSnapshotName(snapshotName);
        return this;
    }

    /**
     * <p>
     * If set to <code>system</code>, the output shows snapshots that were automatically created by ElastiCache. If set
     * to <code>user</code> the output shows snapshots that were manually created. If omitted, the output shows both
     * automatically and manually created snapshots.
     * </p>
     * 
     * @param snapshotSource
     *        If set to <code>system</code>, the output shows snapshots that were automatically created by ElastiCache.
     *        If set to <code>user</code> the output shows snapshots that were manually created. If omitted, the output
     *        shows both automatically and manually created snapshots.
     */

    public void setSnapshotSource(String snapshotSource) {
        this.snapshotSource = snapshotSource;
    }

    /**
     * <p>
     * If set to <code>system</code>, the output shows snapshots that were automatically created by ElastiCache. If set
     * to <code>user</code> the output shows snapshots that were manually created. If omitted, the output shows both
     * automatically and manually created snapshots.
     * </p>
     * 
     * @return If set to <code>system</code>, the output shows snapshots that were automatically created by ElastiCache.
     *         If set to <code>user</code> the output shows snapshots that were manually created. If omitted, the output
     *         shows both automatically and manually created snapshots.
     */

    public String getSnapshotSource() {
        return this.snapshotSource;
    }

    /**
     * <p>
     * If set to <code>system</code>, the output shows snapshots that were automatically created by ElastiCache. If set
     * to <code>user</code> the output shows snapshots that were manually created. If omitted, the output shows both
     * automatically and manually created snapshots.
     * </p>
     * 
     * @param snapshotSource
     *        If set to <code>system</code>, the output shows snapshots that were automatically created by ElastiCache.
     *        If set to <code>user</code> the output shows snapshots that were manually created. If omitted, the output
     *        shows both automatically and manually created snapshots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotsRequest withSnapshotSource(String snapshotSource) {
        setSnapshotSource(snapshotSource);
        return this;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional marker returned from a prior request. Use this marker for pagination of results from this
     *        operation. If this parameter is specified, the response includes only records beyond the marker, up to the
     *        value specified by <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional marker returned from a prior request. Use this marker for pagination of results from this
     *         operation. If this parameter is specified, the response includes only records beyond the marker, up to
     *         the value specified by <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional marker returned from a prior request. Use this marker for pagination of results from this
     *        operation. If this parameter is specified, the response includes only records beyond the marker, up to the
     *        value specified by <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a marker is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     * <p>
     * Default: 50
     * </p>
     * <p>
     * Constraints: minimum 20; maximum 50.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        <code>MaxRecords</code> value, a marker is included in the response so that the remaining results can be
     *        retrieved.</p>
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
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a marker is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     * <p>
     * Default: 50
     * </p>
     * <p>
     * Constraints: minimum 20; maximum 50.
     * </p>
     * 
     * @return The maximum number of records to include in the response. If more records exist than the specified
     *         <code>MaxRecords</code> value, a marker is included in the response so that the remaining results can be
     *         retrieved.</p>
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
     * The maximum number of records to include in the response. If more records exist than the specified
     * <code>MaxRecords</code> value, a marker is included in the response so that the remaining results can be
     * retrieved.
     * </p>
     * <p>
     * Default: 50
     * </p>
     * <p>
     * Constraints: minimum 20; maximum 50.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of records to include in the response. If more records exist than the specified
     *        <code>MaxRecords</code> value, a marker is included in the response so that the remaining results can be
     *        retrieved.</p>
     *        <p>
     *        Default: 50
     *        </p>
     *        <p>
     *        Constraints: minimum 20; maximum 50.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotsRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * A Boolean value which if true, the node group (shard) configuration is included in the snapshot description.
     * </p>
     * 
     * @param showNodeGroupConfig
     *        A Boolean value which if true, the node group (shard) configuration is included in the snapshot
     *        description.
     */

    public void setShowNodeGroupConfig(Boolean showNodeGroupConfig) {
        this.showNodeGroupConfig = showNodeGroupConfig;
    }

    /**
     * <p>
     * A Boolean value which if true, the node group (shard) configuration is included in the snapshot description.
     * </p>
     * 
     * @return A Boolean value which if true, the node group (shard) configuration is included in the snapshot
     *         description.
     */

    public Boolean getShowNodeGroupConfig() {
        return this.showNodeGroupConfig;
    }

    /**
     * <p>
     * A Boolean value which if true, the node group (shard) configuration is included in the snapshot description.
     * </p>
     * 
     * @param showNodeGroupConfig
     *        A Boolean value which if true, the node group (shard) configuration is included in the snapshot
     *        description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotsRequest withShowNodeGroupConfig(Boolean showNodeGroupConfig) {
        setShowNodeGroupConfig(showNodeGroupConfig);
        return this;
    }

    /**
     * <p>
     * A Boolean value which if true, the node group (shard) configuration is included in the snapshot description.
     * </p>
     * 
     * @return A Boolean value which if true, the node group (shard) configuration is included in the snapshot
     *         description.
     */

    public Boolean isShowNodeGroupConfig() {
        return this.showNodeGroupConfig;
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
        if (getReplicationGroupId() != null)
            sb.append("ReplicationGroupId: ").append(getReplicationGroupId()).append(",");
        if (getCacheClusterId() != null)
            sb.append("CacheClusterId: ").append(getCacheClusterId()).append(",");
        if (getSnapshotName() != null)
            sb.append("SnapshotName: ").append(getSnapshotName()).append(",");
        if (getSnapshotSource() != null)
            sb.append("SnapshotSource: ").append(getSnapshotSource()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: ").append(getMaxRecords()).append(",");
        if (getShowNodeGroupConfig() != null)
            sb.append("ShowNodeGroupConfig: ").append(getShowNodeGroupConfig());
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
        if (other.getReplicationGroupId() == null ^ this.getReplicationGroupId() == null)
            return false;
        if (other.getReplicationGroupId() != null && other.getReplicationGroupId().equals(this.getReplicationGroupId()) == false)
            return false;
        if (other.getCacheClusterId() == null ^ this.getCacheClusterId() == null)
            return false;
        if (other.getCacheClusterId() != null && other.getCacheClusterId().equals(this.getCacheClusterId()) == false)
            return false;
        if (other.getSnapshotName() == null ^ this.getSnapshotName() == null)
            return false;
        if (other.getSnapshotName() != null && other.getSnapshotName().equals(this.getSnapshotName()) == false)
            return false;
        if (other.getSnapshotSource() == null ^ this.getSnapshotSource() == null)
            return false;
        if (other.getSnapshotSource() != null && other.getSnapshotSource().equals(this.getSnapshotSource()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getShowNodeGroupConfig() == null ^ this.getShowNodeGroupConfig() == null)
            return false;
        if (other.getShowNodeGroupConfig() != null && other.getShowNodeGroupConfig().equals(this.getShowNodeGroupConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationGroupId() == null) ? 0 : getReplicationGroupId().hashCode());
        hashCode = prime * hashCode + ((getCacheClusterId() == null) ? 0 : getCacheClusterId().hashCode());
        hashCode = prime * hashCode + ((getSnapshotName() == null) ? 0 : getSnapshotName().hashCode());
        hashCode = prime * hashCode + ((getSnapshotSource() == null) ? 0 : getSnapshotSource().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode + ((getShowNodeGroupConfig() == null) ? 0 : getShowNodeGroupConfig().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSnapshotsRequest clone() {
        return (DescribeSnapshotsRequest) super.clone();
    }

}
