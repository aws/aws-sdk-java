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


/**
 * <p>
 * Contains the output from the DescribeClusterSnapshots action.
 * </p>
 */
public class DescribeClusterSnapshotsResult implements Serializable {

    /**
     * A marker that indicates the first snapshot that a subsequent
     * <a>DescribeClusterSnapshots</a> request will return. The response
     * returns a marker only if there are more snapshots to list than the
     * current response can return.
     */
    private String marker;

    /**
     * A list of <a>Snapshot</a> instances.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Snapshot> snapshots;

    /**
     * A marker that indicates the first snapshot that a subsequent
     * <a>DescribeClusterSnapshots</a> request will return. The response
     * returns a marker only if there are more snapshots to list than the
     * current response can return.
     *
     * @return A marker that indicates the first snapshot that a subsequent
     *         <a>DescribeClusterSnapshots</a> request will return. The response
     *         returns a marker only if there are more snapshots to list than the
     *         current response can return.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * A marker that indicates the first snapshot that a subsequent
     * <a>DescribeClusterSnapshots</a> request will return. The response
     * returns a marker only if there are more snapshots to list than the
     * current response can return.
     *
     * @param marker A marker that indicates the first snapshot that a subsequent
     *         <a>DescribeClusterSnapshots</a> request will return. The response
     *         returns a marker only if there are more snapshots to list than the
     *         current response can return.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * A marker that indicates the first snapshot that a subsequent
     * <a>DescribeClusterSnapshots</a> request will return. The response
     * returns a marker only if there are more snapshots to list than the
     * current response can return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker A marker that indicates the first snapshot that a subsequent
     *         <a>DescribeClusterSnapshots</a> request will return. The response
     *         returns a marker only if there are more snapshots to list than the
     *         current response can return.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeClusterSnapshotsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * A list of <a>Snapshot</a> instances.
     *
     * @return A list of <a>Snapshot</a> instances.
     */
    public java.util.List<Snapshot> getSnapshots() {
        if (snapshots == null) {
              snapshots = new com.amazonaws.internal.ListWithAutoConstructFlag<Snapshot>();
              snapshots.setAutoConstruct(true);
        }
        return snapshots;
    }
    
    /**
     * A list of <a>Snapshot</a> instances.
     *
     * @param snapshots A list of <a>Snapshot</a> instances.
     */
    public void setSnapshots(java.util.Collection<Snapshot> snapshots) {
        if (snapshots == null) {
            this.snapshots = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Snapshot> snapshotsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Snapshot>(snapshots.size());
        snapshotsCopy.addAll(snapshots);
        this.snapshots = snapshotsCopy;
    }
    
    /**
     * A list of <a>Snapshot</a> instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshots A list of <a>Snapshot</a> instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeClusterSnapshotsResult withSnapshots(Snapshot... snapshots) {
        if (getSnapshots() == null) setSnapshots(new java.util.ArrayList<Snapshot>(snapshots.length));
        for (Snapshot value : snapshots) {
            getSnapshots().add(value);
        }
        return this;
    }
    
    /**
     * A list of <a>Snapshot</a> instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshots A list of <a>Snapshot</a> instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeClusterSnapshotsResult withSnapshots(java.util.Collection<Snapshot> snapshots) {
        if (snapshots == null) {
            this.snapshots = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Snapshot> snapshotsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Snapshot>(snapshots.size());
            snapshotsCopy.addAll(snapshots);
            this.snapshots = snapshotsCopy;
        }

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
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (getSnapshots() != null) sb.append("Snapshots: " + getSnapshots() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getSnapshots() == null) ? 0 : getSnapshots().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeClusterSnapshotsResult == false) return false;
        DescribeClusterSnapshotsResult other = (DescribeClusterSnapshotsResult)obj;
        
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getSnapshots() == null ^ this.getSnapshots() == null) return false;
        if (other.getSnapshots() != null && other.getSnapshots().equals(this.getSnapshots()) == false) return false; 
        return true;
    }
    
}
    