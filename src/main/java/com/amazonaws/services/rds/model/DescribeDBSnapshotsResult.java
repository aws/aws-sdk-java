/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * 
 * </p>
 */
public class DescribeDBSnapshotsResult {

    /**
     * The marker obtained from a previous operation response.
     */
    private String marker;

    /**
     * A list of <a>DBSnapshot</a> instances.
     */
    private java.util.List<DBSnapshot> dBSnapshots;

    /**
     * The marker obtained from a previous operation response.
     *
     * @return The marker obtained from a previous operation response.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * The marker obtained from a previous operation response.
     *
     * @param marker The marker obtained from a previous operation response.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * The marker obtained from a previous operation response.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker The marker obtained from a previous operation response.
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
            dBSnapshots = new java.util.ArrayList<DBSnapshot>();
        }
        return dBSnapshots;
    }
    
    /**
     * A list of <a>DBSnapshot</a> instances.
     *
     * @param dBSnapshots A list of <a>DBSnapshot</a> instances.
     */
    public void setDBSnapshots(java.util.Collection<DBSnapshot> dBSnapshots) {
        java.util.List<DBSnapshot> dBSnapshotsCopy = new java.util.ArrayList<DBSnapshot>();
        if (dBSnapshots != null) {
            dBSnapshotsCopy.addAll(dBSnapshots);
        }
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
        java.util.List<DBSnapshot> dBSnapshotsCopy = new java.util.ArrayList<DBSnapshot>();
        if (dBSnapshots != null) {
            dBSnapshotsCopy.addAll(dBSnapshots);
        }
        this.dBSnapshots = dBSnapshotsCopy;

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
        
        sb.append("Marker: " + marker + ", ");
        sb.append("DBSnapshots: " + dBSnapshots + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    