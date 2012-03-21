/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains the result of a successful invocation of the
 * DescribeDBSubnetGroups action.
 * </p>
 */
public class DescribeDBSubnetGroupsResult {

    /**
     * The marker obtained from a previous operation response.
     */
    private String marker;

    /**
     * A list of <a>DBSubnetGroup</a> instances.
     */
    private java.util.List<DBSubnetGroup> dBSubnetGroups;

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
    public DescribeDBSubnetGroupsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }
    
    
    /**
     * A list of <a>DBSubnetGroup</a> instances.
     *
     * @return A list of <a>DBSubnetGroup</a> instances.
     */
    public java.util.List<DBSubnetGroup> getDBSubnetGroups() {
        
        if (dBSubnetGroups == null) {
            dBSubnetGroups = new java.util.ArrayList<DBSubnetGroup>();
        }
        return dBSubnetGroups;
    }
    
    /**
     * A list of <a>DBSubnetGroup</a> instances.
     *
     * @param dBSubnetGroups A list of <a>DBSubnetGroup</a> instances.
     */
    public void setDBSubnetGroups(java.util.Collection<DBSubnetGroup> dBSubnetGroups) {
        if (dBSubnetGroups == null) {
            this.dBSubnetGroups = null;
            return;
        }

        java.util.List<DBSubnetGroup> dBSubnetGroupsCopy = new java.util.ArrayList<DBSubnetGroup>(dBSubnetGroups.size());
        dBSubnetGroupsCopy.addAll(dBSubnetGroups);
        this.dBSubnetGroups = dBSubnetGroupsCopy;
    }
    
    /**
     * A list of <a>DBSubnetGroup</a> instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSubnetGroups A list of <a>DBSubnetGroup</a> instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeDBSubnetGroupsResult withDBSubnetGroups(DBSubnetGroup... dBSubnetGroups) {
        if (getDBSubnetGroups() == null) setDBSubnetGroups(new java.util.ArrayList<DBSubnetGroup>(dBSubnetGroups.length));
        for (DBSubnetGroup value : dBSubnetGroups) {
            getDBSubnetGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of <a>DBSubnetGroup</a> instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSubnetGroups A list of <a>DBSubnetGroup</a> instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeDBSubnetGroupsResult withDBSubnetGroups(java.util.Collection<DBSubnetGroup> dBSubnetGroups) {
        if (dBSubnetGroups == null) {
            this.dBSubnetGroups = null;
        } else {
            java.util.List<DBSubnetGroup> dBSubnetGroupsCopy = new java.util.ArrayList<DBSubnetGroup>(dBSubnetGroups.size());
            dBSubnetGroupsCopy.addAll(dBSubnetGroups);
            this.dBSubnetGroups = dBSubnetGroupsCopy;
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
        if (marker != null) sb.append("Marker: " + marker + ", ");
        if (dBSubnetGroups != null) sb.append("DBSubnetGroups: " + dBSubnetGroups + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getDBSubnetGroups() == null) ? 0 : getDBSubnetGroups().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeDBSubnetGroupsResult == false) return false;
        DescribeDBSubnetGroupsResult other = (DescribeDBSubnetGroupsResult)obj;
        
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getDBSubnetGroups() == null ^ this.getDBSubnetGroups() == null) return false;
        if (other.getDBSubnetGroups() != null && other.getDBSubnetGroups().equals(this.getDBSubnetGroups()) == false) return false; 
        return true;
    }
    
}
    