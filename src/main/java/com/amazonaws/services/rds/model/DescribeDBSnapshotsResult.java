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
package com.amazonaws.services.rds.model;

import java.io.Serializable;


/**
 * <p>
 * Contains the result of a successful invocation of the DescribeDBSnapshots action.
 * </p>
 */
public class DescribeDBSnapshotsResult implements Serializable {

    /**
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     */
    private String marker;

    /**
     * A list of <a>DBSnapshot</a> instances.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<DBSnapshot> dBSnapshots;

    /**
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     *
     * @return An optional pagination token provided by a previous request. If this
     *         parameter is specified, the response includes only records beyond the
     *         marker, up to the value specified by <code>MaxRecords</code>.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     *
     * @param marker An optional pagination token provided by a previous request. If this
     *         parameter is specified, the response includes only records beyond the
     *         marker, up to the value specified by <code>MaxRecords</code>.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional pagination token provided by a previous request. If this
     *         parameter is specified, the response includes only records beyond the
     *         marker, up to the value specified by <code>MaxRecords</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeDBSnapshotsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * A list of <a>DBSnapshot</a> instances.
     *
     * @return A list of <a>DBSnapshot</a> instances.
     */
    public java.util.List<DBSnapshot> getDBSnapshots() {
        if (dBSnapshots == null) {
              dBSnapshots = new com.amazonaws.internal.ListWithAutoConstructFlag<DBSnapshot>();
              dBSnapshots.setAutoConstruct(true);
        }
        return dBSnapshots;
    }
    
    /**
     * A list of <a>DBSnapshot</a> instances.
     *
     * @param dBSnapshots A list of <a>DBSnapshot</a> instances.
     */
    public void setDBSnapshots(java.util.Collection<DBSnapshot> dBSnapshots) {
        if (dBSnapshots == null) {
            this.dBSnapshots = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<DBSnapshot> dBSnapshotsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DBSnapshot>(dBSnapshots.size());
        dBSnapshotsCopy.addAll(dBSnapshots);
        this.dBSnapshots = dBSnapshotsCopy;
    }
    
    /**
     * A list of <a>DBSnapshot</a> instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSnapshots A list of <a>DBSnapshot</a> instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeDBSnapshotsResult withDBSnapshots(DBSnapshot... dBSnapshots) {
        if (getDBSnapshots() == null) setDBSnapshots(new java.util.ArrayList<DBSnapshot>(dBSnapshots.length));
        for (DBSnapshot value : dBSnapshots) {
            getDBSnapshots().add(value);
        }
        return this;
    }
    
    /**
     * A list of <a>DBSnapshot</a> instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSnapshots A list of <a>DBSnapshot</a> instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeDBSnapshotsResult withDBSnapshots(java.util.Collection<DBSnapshot> dBSnapshots) {
        if (dBSnapshots == null) {
            this.dBSnapshots = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<DBSnapshot> dBSnapshotsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DBSnapshot>(dBSnapshots.size());
            dBSnapshotsCopy.addAll(dBSnapshots);
            this.dBSnapshots = dBSnapshotsCopy;
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
        if (getDBSnapshots() != null) sb.append("DBSnapshots: " + getDBSnapshots() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getDBSnapshots() == null) ? 0 : getDBSnapshots().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeDBSnapshotsResult == false) return false;
        DescribeDBSnapshotsResult other = (DescribeDBSnapshotsResult)obj;
        
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getDBSnapshots() == null ^ this.getDBSnapshots() == null) return false;
        if (other.getDBSnapshots() != null && other.getDBSnapshots().equals(this.getDBSnapshots()) == false) return false; 
        return true;
    }
    
}
    