/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Represents the output of a <i>DescribeSnapshots</i> action.
 * </p>
 */
public class DescribeSnapshotsResult implements Serializable, Cloneable {

    /**
     * An optional marker returned from a prior request. Use this marker for
     * pagination of results from this action. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <i>MaxRecords</i>.
     */
    private String marker;

    /**
     * A list of snapshots. Each item in the list contains detailed
     * information about one snapshot.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Snapshot> snapshots;

    /**
     * An optional marker returned from a prior request. Use this marker for
     * pagination of results from this action. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <i>MaxRecords</i>.
     *
     * @return An optional marker returned from a prior request. Use this marker for
     *         pagination of results from this action. If this parameter is
     *         specified, the response includes only records beyond the marker, up to
     *         the value specified by <i>MaxRecords</i>.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional marker returned from a prior request. Use this marker for
     * pagination of results from this action. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <i>MaxRecords</i>.
     *
     * @param marker An optional marker returned from a prior request. Use this marker for
     *         pagination of results from this action. If this parameter is
     *         specified, the response includes only records beyond the marker, up to
     *         the value specified by <i>MaxRecords</i>.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional marker returned from a prior request. Use this marker for
     * pagination of results from this action. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <i>MaxRecords</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional marker returned from a prior request. Use this marker for
     *         pagination of results from this action. If this parameter is
     *         specified, the response includes only records beyond the marker, up to
     *         the value specified by <i>MaxRecords</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSnapshotsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * A list of snapshots. Each item in the list contains detailed
     * information about one snapshot.
     *
     * @return A list of snapshots. Each item in the list contains detailed
     *         information about one snapshot.
     */
    public java.util.List<Snapshot> getSnapshots() {
        if (snapshots == null) {
              snapshots = new com.amazonaws.internal.ListWithAutoConstructFlag<Snapshot>();
              snapshots.setAutoConstruct(true);
        }
        return snapshots;
    }
    
    /**
     * A list of snapshots. Each item in the list contains detailed
     * information about one snapshot.
     *
     * @param snapshots A list of snapshots. Each item in the list contains detailed
     *         information about one snapshot.
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
     * A list of snapshots. Each item in the list contains detailed
     * information about one snapshot.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSnapshots(java.util.Collection)} or {@link
     * #withSnapshots(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshots A list of snapshots. Each item in the list contains detailed
     *         information about one snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSnapshotsResult withSnapshots(Snapshot... snapshots) {
        if (getSnapshots() == null) setSnapshots(new java.util.ArrayList<Snapshot>(snapshots.length));
        for (Snapshot value : snapshots) {
            getSnapshots().add(value);
        }
        return this;
    }
    
    /**
     * A list of snapshots. Each item in the list contains detailed
     * information about one snapshot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshots A list of snapshots. Each item in the list contains detailed
     *         information about one snapshot.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSnapshotsResult withSnapshots(java.util.Collection<Snapshot> snapshots) {
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

        if (obj instanceof DescribeSnapshotsResult == false) return false;
        DescribeSnapshotsResult other = (DescribeSnapshotsResult)obj;
        
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getSnapshots() == null ^ this.getSnapshots() == null) return false;
        if (other.getSnapshots() != null && other.getSnapshots().equals(this.getSnapshots()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeSnapshotsResult clone() {
        try {
            return (DescribeSnapshotsResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    