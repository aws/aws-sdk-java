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
 * </p>
 */
public class DescribeDBClusterParameterGroupsResult implements Serializable, Cloneable {

    /**
     * An optional pagination token provided by a previous
     * <code>DescribeDBClusterParameterGroups</code> request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     */
    private String marker;

    /**
     * A list of DB cluster parameter groups.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<DBClusterParameterGroup> dBClusterParameterGroups;

    /**
     * An optional pagination token provided by a previous
     * <code>DescribeDBClusterParameterGroups</code> request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     *
     * @return An optional pagination token provided by a previous
     *         <code>DescribeDBClusterParameterGroups</code> request. If this
     *         parameter is specified, the response includes only records beyond the
     *         marker, up to the value specified by <code>MaxRecords</code>.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional pagination token provided by a previous
     * <code>DescribeDBClusterParameterGroups</code> request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     *
     * @param marker An optional pagination token provided by a previous
     *         <code>DescribeDBClusterParameterGroups</code> request. If this
     *         parameter is specified, the response includes only records beyond the
     *         marker, up to the value specified by <code>MaxRecords</code>.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional pagination token provided by a previous
     * <code>DescribeDBClusterParameterGroups</code> request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional pagination token provided by a previous
     *         <code>DescribeDBClusterParameterGroups</code> request. If this
     *         parameter is specified, the response includes only records beyond the
     *         marker, up to the value specified by <code>MaxRecords</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDBClusterParameterGroupsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * A list of DB cluster parameter groups.
     *
     * @return A list of DB cluster parameter groups.
     */
    public java.util.List<DBClusterParameterGroup> getDBClusterParameterGroups() {
        if (dBClusterParameterGroups == null) {
              dBClusterParameterGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<DBClusterParameterGroup>();
              dBClusterParameterGroups.setAutoConstruct(true);
        }
        return dBClusterParameterGroups;
    }
    
    /**
     * A list of DB cluster parameter groups.
     *
     * @param dBClusterParameterGroups A list of DB cluster parameter groups.
     */
    public void setDBClusterParameterGroups(java.util.Collection<DBClusterParameterGroup> dBClusterParameterGroups) {
        if (dBClusterParameterGroups == null) {
            this.dBClusterParameterGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<DBClusterParameterGroup> dBClusterParameterGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DBClusterParameterGroup>(dBClusterParameterGroups.size());
        dBClusterParameterGroupsCopy.addAll(dBClusterParameterGroups);
        this.dBClusterParameterGroups = dBClusterParameterGroupsCopy;
    }
    
    /**
     * A list of DB cluster parameter groups.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setDBClusterParameterGroups(java.util.Collection)}
     * or {@link #withDBClusterParameterGroups(java.util.Collection)} if you
     * want to override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBClusterParameterGroups A list of DB cluster parameter groups.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDBClusterParameterGroupsResult withDBClusterParameterGroups(DBClusterParameterGroup... dBClusterParameterGroups) {
        if (getDBClusterParameterGroups() == null) setDBClusterParameterGroups(new java.util.ArrayList<DBClusterParameterGroup>(dBClusterParameterGroups.length));
        for (DBClusterParameterGroup value : dBClusterParameterGroups) {
            getDBClusterParameterGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of DB cluster parameter groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBClusterParameterGroups A list of DB cluster parameter groups.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDBClusterParameterGroupsResult withDBClusterParameterGroups(java.util.Collection<DBClusterParameterGroup> dBClusterParameterGroups) {
        if (dBClusterParameterGroups == null) {
            this.dBClusterParameterGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<DBClusterParameterGroup> dBClusterParameterGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DBClusterParameterGroup>(dBClusterParameterGroups.size());
            dBClusterParameterGroupsCopy.addAll(dBClusterParameterGroups);
            this.dBClusterParameterGroups = dBClusterParameterGroupsCopy;
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
        if (getDBClusterParameterGroups() != null) sb.append("DBClusterParameterGroups: " + getDBClusterParameterGroups() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getDBClusterParameterGroups() == null) ? 0 : getDBClusterParameterGroups().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeDBClusterParameterGroupsResult == false) return false;
        DescribeDBClusterParameterGroupsResult other = (DescribeDBClusterParameterGroupsResult)obj;
        
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getDBClusterParameterGroups() == null ^ this.getDBClusterParameterGroups() == null) return false;
        if (other.getDBClusterParameterGroups() != null && other.getDBClusterParameterGroups().equals(this.getDBClusterParameterGroups()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeDBClusterParameterGroupsResult clone() {
        try {
            return (DescribeDBClusterParameterGroupsResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    