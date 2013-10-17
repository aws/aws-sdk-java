/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#describeClusterSnapshots(DescribeClusterSnapshotsRequest) DescribeClusterSnapshots operation}.
 * <p>
 * Returns one or more snapshot objects, which contain metadata about your cluster snapshots. By default, this operation returns information about all
 * snapshots of all clusters that are owned by you AWS customer account. No information is returned for snapshots owned by inactive AWS customer
 * accounts.
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#describeClusterSnapshots(DescribeClusterSnapshotsRequest)
 */
public class DescribeClusterSnapshotsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The identifier of the cluster for which information about snapshots is
     * requested.
     */
    private String clusterIdentifier;

    /**
     * The snapshot identifier of the snapshot about which to return
     * information.
     */
    private String snapshotIdentifier;

    /**
     * The type of snapshots for which you are requesting information. By
     * default, snapshots of all types are returned. <p> Valid Values:
     * <code>automated</code> | <code>manual</code>
     */
    private String snapshotType;

    /**
     * A value that requests only snapshots created at or after the specified
     * time. The time value is specified in ISO 8601 format. For more
     * information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     * page.</a> <p>Example: <code>2012-07-16T18:00:00Z</code>
     */
    private java.util.Date startTime;

    /**
     * A time value that requests only snapshots created at or before the
     * specified time. The time value is specified in ISO 8601 format. For
     * more information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     * page.</a> <p>Example: <code>2012-07-16T18:00:00Z</code>
     */
    private java.util.Date endTime;

    /**
     * The maximum number of snapshot records to include in the response. If
     * more records exist than the specified <code>MaxRecords</code> value,
     * the response returns a marker that you can use in a subsequent
     * <a>DescribeClusterSnapshots</a> request in order to retrieve the next
     * set of snapshot records. <p>Default: <code>100</code> <p>Constraints:
     * Must be at least 20 and no more than 100.
     */
    private Integer maxRecords;

    /**
     * An optional marker returned by a previous
     * <a>DescribeClusterSnapshots</a> request to indicate the first snapshot
     * that the request will return.
     */
    private String marker;

    /**
     * The AWS customer account used to create or copy the snapshot. Use this
     * field to filter the results to snapshots owned by a particular
     * account. To describe snapshots you own, either specify your AWS
     * customer account, or do not specify the parameter.
     */
    private String ownerAccount;

    /**
     * The identifier of the cluster for which information about snapshots is
     * requested.
     *
     * @return The identifier of the cluster for which information about snapshots is
     *         requested.
     */
    public String getClusterIdentifier() {
        return clusterIdentifier;
    }
    
    /**
     * The identifier of the cluster for which information about snapshots is
     * requested.
     *
     * @param clusterIdentifier The identifier of the cluster for which information about snapshots is
     *         requested.
     */
    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }
    
    /**
     * The identifier of the cluster for which information about snapshots is
     * requested.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterIdentifier The identifier of the cluster for which information about snapshots is
     *         requested.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeClusterSnapshotsRequest withClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
        return this;
    }

    /**
     * The snapshot identifier of the snapshot about which to return
     * information.
     *
     * @return The snapshot identifier of the snapshot about which to return
     *         information.
     */
    public String getSnapshotIdentifier() {
        return snapshotIdentifier;
    }
    
    /**
     * The snapshot identifier of the snapshot about which to return
     * information.
     *
     * @param snapshotIdentifier The snapshot identifier of the snapshot about which to return
     *         information.
     */
    public void setSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
    }
    
    /**
     * The snapshot identifier of the snapshot about which to return
     * information.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotIdentifier The snapshot identifier of the snapshot about which to return
     *         information.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeClusterSnapshotsRequest withSnapshotIdentifier(String snapshotIdentifier) {
        this.snapshotIdentifier = snapshotIdentifier;
        return this;
    }

    /**
     * The type of snapshots for which you are requesting information. By
     * default, snapshots of all types are returned. <p> Valid Values:
     * <code>automated</code> | <code>manual</code>
     *
     * @return The type of snapshots for which you are requesting information. By
     *         default, snapshots of all types are returned. <p> Valid Values:
     *         <code>automated</code> | <code>manual</code>
     */
    public String getSnapshotType() {
        return snapshotType;
    }
    
    /**
     * The type of snapshots for which you are requesting information. By
     * default, snapshots of all types are returned. <p> Valid Values:
     * <code>automated</code> | <code>manual</code>
     *
     * @param snapshotType The type of snapshots for which you are requesting information. By
     *         default, snapshots of all types are returned. <p> Valid Values:
     *         <code>automated</code> | <code>manual</code>
     */
    public void setSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
    }
    
    /**
     * The type of snapshots for which you are requesting information. By
     * default, snapshots of all types are returned. <p> Valid Values:
     * <code>automated</code> | <code>manual</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotType The type of snapshots for which you are requesting information. By
     *         default, snapshots of all types are returned. <p> Valid Values:
     *         <code>automated</code> | <code>manual</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeClusterSnapshotsRequest withSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
        return this;
    }

    /**
     * A value that requests only snapshots created at or after the specified
     * time. The time value is specified in ISO 8601 format. For more
     * information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     * page.</a> <p>Example: <code>2012-07-16T18:00:00Z</code>
     *
     * @return A value that requests only snapshots created at or after the specified
     *         time. The time value is specified in ISO 8601 format. For more
     *         information about ISO 8601, go to the <a
     *         href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *         page.</a> <p>Example: <code>2012-07-16T18:00:00Z</code>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }
    
    /**
     * A value that requests only snapshots created at or after the specified
     * time. The time value is specified in ISO 8601 format. For more
     * information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     * page.</a> <p>Example: <code>2012-07-16T18:00:00Z</code>
     *
     * @param startTime A value that requests only snapshots created at or after the specified
     *         time. The time value is specified in ISO 8601 format. For more
     *         information about ISO 8601, go to the <a
     *         href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *         page.</a> <p>Example: <code>2012-07-16T18:00:00Z</code>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }
    
    /**
     * A value that requests only snapshots created at or after the specified
     * time. The time value is specified in ISO 8601 format. For more
     * information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     * page.</a> <p>Example: <code>2012-07-16T18:00:00Z</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startTime A value that requests only snapshots created at or after the specified
     *         time. The time value is specified in ISO 8601 format. For more
     *         information about ISO 8601, go to the <a
     *         href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *         page.</a> <p>Example: <code>2012-07-16T18:00:00Z</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeClusterSnapshotsRequest withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * A time value that requests only snapshots created at or before the
     * specified time. The time value is specified in ISO 8601 format. For
     * more information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     * page.</a> <p>Example: <code>2012-07-16T18:00:00Z</code>
     *
     * @return A time value that requests only snapshots created at or before the
     *         specified time. The time value is specified in ISO 8601 format. For
     *         more information about ISO 8601, go to the <a
     *         href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *         page.</a> <p>Example: <code>2012-07-16T18:00:00Z</code>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }
    
    /**
     * A time value that requests only snapshots created at or before the
     * specified time. The time value is specified in ISO 8601 format. For
     * more information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     * page.</a> <p>Example: <code>2012-07-16T18:00:00Z</code>
     *
     * @param endTime A time value that requests only snapshots created at or before the
     *         specified time. The time value is specified in ISO 8601 format. For
     *         more information about ISO 8601, go to the <a
     *         href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *         page.</a> <p>Example: <code>2012-07-16T18:00:00Z</code>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }
    
    /**
     * A time value that requests only snapshots created at or before the
     * specified time. The time value is specified in ISO 8601 format. For
     * more information about ISO 8601, go to the <a
     * href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     * page.</a> <p>Example: <code>2012-07-16T18:00:00Z</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param endTime A time value that requests only snapshots created at or before the
     *         specified time. The time value is specified in ISO 8601 format. For
     *         more information about ISO 8601, go to the <a
     *         href="http://en.wikipedia.org/wiki/ISO_8601">ISO8601 Wikipedia
     *         page.</a> <p>Example: <code>2012-07-16T18:00:00Z</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeClusterSnapshotsRequest withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * The maximum number of snapshot records to include in the response. If
     * more records exist than the specified <code>MaxRecords</code> value,
     * the response returns a marker that you can use in a subsequent
     * <a>DescribeClusterSnapshots</a> request in order to retrieve the next
     * set of snapshot records. <p>Default: <code>100</code> <p>Constraints:
     * Must be at least 20 and no more than 100.
     *
     * @return The maximum number of snapshot records to include in the response. If
     *         more records exist than the specified <code>MaxRecords</code> value,
     *         the response returns a marker that you can use in a subsequent
     *         <a>DescribeClusterSnapshots</a> request in order to retrieve the next
     *         set of snapshot records. <p>Default: <code>100</code> <p>Constraints:
     *         Must be at least 20 and no more than 100.
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * The maximum number of snapshot records to include in the response. If
     * more records exist than the specified <code>MaxRecords</code> value,
     * the response returns a marker that you can use in a subsequent
     * <a>DescribeClusterSnapshots</a> request in order to retrieve the next
     * set of snapshot records. <p>Default: <code>100</code> <p>Constraints:
     * Must be at least 20 and no more than 100.
     *
     * @param maxRecords The maximum number of snapshot records to include in the response. If
     *         more records exist than the specified <code>MaxRecords</code> value,
     *         the response returns a marker that you can use in a subsequent
     *         <a>DescribeClusterSnapshots</a> request in order to retrieve the next
     *         set of snapshot records. <p>Default: <code>100</code> <p>Constraints:
     *         Must be at least 20 and no more than 100.
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * The maximum number of snapshot records to include in the response. If
     * more records exist than the specified <code>MaxRecords</code> value,
     * the response returns a marker that you can use in a subsequent
     * <a>DescribeClusterSnapshots</a> request in order to retrieve the next
     * set of snapshot records. <p>Default: <code>100</code> <p>Constraints:
     * Must be at least 20 and no more than 100.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxRecords The maximum number of snapshot records to include in the response. If
     *         more records exist than the specified <code>MaxRecords</code> value,
     *         the response returns a marker that you can use in a subsequent
     *         <a>DescribeClusterSnapshots</a> request in order to retrieve the next
     *         set of snapshot records. <p>Default: <code>100</code> <p>Constraints:
     *         Must be at least 20 and no more than 100.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeClusterSnapshotsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }

    /**
     * An optional marker returned by a previous
     * <a>DescribeClusterSnapshots</a> request to indicate the first snapshot
     * that the request will return.
     *
     * @return An optional marker returned by a previous
     *         <a>DescribeClusterSnapshots</a> request to indicate the first snapshot
     *         that the request will return.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional marker returned by a previous
     * <a>DescribeClusterSnapshots</a> request to indicate the first snapshot
     * that the request will return.
     *
     * @param marker An optional marker returned by a previous
     *         <a>DescribeClusterSnapshots</a> request to indicate the first snapshot
     *         that the request will return.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional marker returned by a previous
     * <a>DescribeClusterSnapshots</a> request to indicate the first snapshot
     * that the request will return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional marker returned by a previous
     *         <a>DescribeClusterSnapshots</a> request to indicate the first snapshot
     *         that the request will return.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeClusterSnapshotsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * The AWS customer account used to create or copy the snapshot. Use this
     * field to filter the results to snapshots owned by a particular
     * account. To describe snapshots you own, either specify your AWS
     * customer account, or do not specify the parameter.
     *
     * @return The AWS customer account used to create or copy the snapshot. Use this
     *         field to filter the results to snapshots owned by a particular
     *         account. To describe snapshots you own, either specify your AWS
     *         customer account, or do not specify the parameter.
     */
    public String getOwnerAccount() {
        return ownerAccount;
    }
    
    /**
     * The AWS customer account used to create or copy the snapshot. Use this
     * field to filter the results to snapshots owned by a particular
     * account. To describe snapshots you own, either specify your AWS
     * customer account, or do not specify the parameter.
     *
     * @param ownerAccount The AWS customer account used to create or copy the snapshot. Use this
     *         field to filter the results to snapshots owned by a particular
     *         account. To describe snapshots you own, either specify your AWS
     *         customer account, or do not specify the parameter.
     */
    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }
    
    /**
     * The AWS customer account used to create or copy the snapshot. Use this
     * field to filter the results to snapshots owned by a particular
     * account. To describe snapshots you own, either specify your AWS
     * customer account, or do not specify the parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ownerAccount The AWS customer account used to create or copy the snapshot. Use this
     *         field to filter the results to snapshots owned by a particular
     *         account. To describe snapshots you own, either specify your AWS
     *         customer account, or do not specify the parameter.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeClusterSnapshotsRequest withOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
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
        if (getClusterIdentifier() != null) sb.append("ClusterIdentifier: " + getClusterIdentifier() + ",");
        if (getSnapshotIdentifier() != null) sb.append("SnapshotIdentifier: " + getSnapshotIdentifier() + ",");
        if (getSnapshotType() != null) sb.append("SnapshotType: " + getSnapshotType() + ",");
        if (getStartTime() != null) sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null) sb.append("EndTime: " + getEndTime() + ",");
        if (getMaxRecords() != null) sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (getOwnerAccount() != null) sb.append("OwnerAccount: " + getOwnerAccount() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getSnapshotIdentifier() == null) ? 0 : getSnapshotIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getSnapshotType() == null) ? 0 : getSnapshotType().hashCode()); 
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode()); 
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode()); 
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeClusterSnapshotsRequest == false) return false;
        DescribeClusterSnapshotsRequest other = (DescribeClusterSnapshotsRequest)obj;
        
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null) return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false) return false; 
        if (other.getSnapshotIdentifier() == null ^ this.getSnapshotIdentifier() == null) return false;
        if (other.getSnapshotIdentifier() != null && other.getSnapshotIdentifier().equals(this.getSnapshotIdentifier()) == false) return false; 
        if (other.getSnapshotType() == null ^ this.getSnapshotType() == null) return false;
        if (other.getSnapshotType() != null && other.getSnapshotType().equals(this.getSnapshotType()) == false) return false; 
        if (other.getStartTime() == null ^ this.getStartTime() == null) return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false) return false; 
        if (other.getEndTime() == null ^ this.getEndTime() == null) return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false) return false; 
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null) return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null) return false;
        if (other.getOwnerAccount() != null && other.getOwnerAccount().equals(this.getOwnerAccount()) == false) return false; 
        return true;
    }
    
}
    