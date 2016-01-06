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
package com.amazonaws.services.rds.model;

import java.io.Serializable;

/**
 * <p>
 * Provides a list of DB cluster snapshots for the user as the result of
 * a call to the DescribeDBClusterSnapshots action.
 * </p>
 */
public class DescribeDBClusterSnapshotsResult implements Serializable, Cloneable {

    /**
     * An optional pagination token provided by a previous
     * <a>DescribeDBClusterSnapshots</a> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     */
    private String marker;

    /**
     * Provides a list of DB cluster snapshots for the user.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<DBClusterSnapshot> dBClusterSnapshots;

    /**
     * An optional pagination token provided by a previous
     * <a>DescribeDBClusterSnapshots</a> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     *
     * @return An optional pagination token provided by a previous
     *         <a>DescribeDBClusterSnapshots</a> request. If this parameter is
     *         specified, the response includes only records beyond the marker, up to
     *         the value specified by <code>MaxRecords</code>.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional pagination token provided by a previous
     * <a>DescribeDBClusterSnapshots</a> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     *
     * @param marker An optional pagination token provided by a previous
     *         <a>DescribeDBClusterSnapshots</a> request. If this parameter is
     *         specified, the response includes only records beyond the marker, up to
     *         the value specified by <code>MaxRecords</code>.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional pagination token provided by a previous
     * <a>DescribeDBClusterSnapshots</a> request. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <code>MaxRecords</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional pagination token provided by a previous
     *         <a>DescribeDBClusterSnapshots</a> request. If this parameter is
     *         specified, the response includes only records beyond the marker, up to
     *         the value specified by <code>MaxRecords</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDBClusterSnapshotsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Provides a list of DB cluster snapshots for the user.
     *
     * @return Provides a list of DB cluster snapshots for the user.
     */
    public java.util.List<DBClusterSnapshot> getDBClusterSnapshots() {
        if (dBClusterSnapshots == null) {
              dBClusterSnapshots = new com.amazonaws.internal.ListWithAutoConstructFlag<DBClusterSnapshot>();
              dBClusterSnapshots.setAutoConstruct(true);
        }
        return dBClusterSnapshots;
    }
    
    /**
     * Provides a list of DB cluster snapshots for the user.
     *
     * @param dBClusterSnapshots Provides a list of DB cluster snapshots for the user.
     */
    public void setDBClusterSnapshots(java.util.Collection<DBClusterSnapshot> dBClusterSnapshots) {
        if (dBClusterSnapshots == null) {
            this.dBClusterSnapshots = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<DBClusterSnapshot> dBClusterSnapshotsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DBClusterSnapshot>(dBClusterSnapshots.size());
        dBClusterSnapshotsCopy.addAll(dBClusterSnapshots);
        this.dBClusterSnapshots = dBClusterSnapshotsCopy;
    }
    
    /**
     * Provides a list of DB cluster snapshots for the user.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setDBClusterSnapshots(java.util.Collection)} or
     * {@link #withDBClusterSnapshots(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBClusterSnapshots Provides a list of DB cluster snapshots for the user.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDBClusterSnapshotsResult withDBClusterSnapshots(DBClusterSnapshot... dBClusterSnapshots) {
        if (getDBClusterSnapshots() == null) setDBClusterSnapshots(new java.util.ArrayList<DBClusterSnapshot>(dBClusterSnapshots.length));
        for (DBClusterSnapshot value : dBClusterSnapshots) {
            getDBClusterSnapshots().add(value);
        }
        return this;
    }
    
    /**
     * Provides a list of DB cluster snapshots for the user.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBClusterSnapshots Provides a list of DB cluster snapshots for the user.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDBClusterSnapshotsResult withDBClusterSnapshots(java.util.Collection<DBClusterSnapshot> dBClusterSnapshots) {
        if (dBClusterSnapshots == null) {
            this.dBClusterSnapshots = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<DBClusterSnapshot> dBClusterSnapshotsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DBClusterSnapshot>(dBClusterSnapshots.size());
            dBClusterSnapshotsCopy.addAll(dBClusterSnapshots);
            this.dBClusterSnapshots = dBClusterSnapshotsCopy;
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
        if (getDBClusterSnapshots() != null) sb.append("DBClusterSnapshots: " + getDBClusterSnapshots() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getDBClusterSnapshots() == null) ? 0 : getDBClusterSnapshots().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeDBClusterSnapshotsResult == false) return false;
        DescribeDBClusterSnapshotsResult other = (DescribeDBClusterSnapshotsResult)obj;
        
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getDBClusterSnapshots() == null ^ this.getDBClusterSnapshots() == null) return false;
        if (other.getDBClusterSnapshots() != null && other.getDBClusterSnapshots().equals(this.getDBClusterSnapshots()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeDBClusterSnapshotsResult clone() {
        try {
            return (DescribeDBClusterSnapshotsResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    