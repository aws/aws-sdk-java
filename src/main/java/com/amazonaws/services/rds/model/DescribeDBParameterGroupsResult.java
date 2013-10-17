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
 * Contains the result of a successful invocation of the DescribeDBParameterGroups action.
 * </p>
 */
public class DescribeDBParameterGroupsResult implements Serializable {

    /**
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     */
    private String marker;

    /**
     * A list of <a>DBParameterGroup</a> instances.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<DBParameterGroup> dBParameterGroups;

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
    public DescribeDBParameterGroupsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * A list of <a>DBParameterGroup</a> instances.
     *
     * @return A list of <a>DBParameterGroup</a> instances.
     */
    public java.util.List<DBParameterGroup> getDBParameterGroups() {
        if (dBParameterGroups == null) {
              dBParameterGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<DBParameterGroup>();
              dBParameterGroups.setAutoConstruct(true);
        }
        return dBParameterGroups;
    }
    
    /**
     * A list of <a>DBParameterGroup</a> instances.
     *
     * @param dBParameterGroups A list of <a>DBParameterGroup</a> instances.
     */
    public void setDBParameterGroups(java.util.Collection<DBParameterGroup> dBParameterGroups) {
        if (dBParameterGroups == null) {
            this.dBParameterGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<DBParameterGroup> dBParameterGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DBParameterGroup>(dBParameterGroups.size());
        dBParameterGroupsCopy.addAll(dBParameterGroups);
        this.dBParameterGroups = dBParameterGroupsCopy;
    }
    
    /**
     * A list of <a>DBParameterGroup</a> instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBParameterGroups A list of <a>DBParameterGroup</a> instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeDBParameterGroupsResult withDBParameterGroups(DBParameterGroup... dBParameterGroups) {
        if (getDBParameterGroups() == null) setDBParameterGroups(new java.util.ArrayList<DBParameterGroup>(dBParameterGroups.length));
        for (DBParameterGroup value : dBParameterGroups) {
            getDBParameterGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of <a>DBParameterGroup</a> instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBParameterGroups A list of <a>DBParameterGroup</a> instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeDBParameterGroupsResult withDBParameterGroups(java.util.Collection<DBParameterGroup> dBParameterGroups) {
        if (dBParameterGroups == null) {
            this.dBParameterGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<DBParameterGroup> dBParameterGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DBParameterGroup>(dBParameterGroups.size());
            dBParameterGroupsCopy.addAll(dBParameterGroups);
            this.dBParameterGroups = dBParameterGroupsCopy;
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
        if (getDBParameterGroups() != null) sb.append("DBParameterGroups: " + getDBParameterGroups() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getDBParameterGroups() == null) ? 0 : getDBParameterGroups().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeDBParameterGroupsResult == false) return false;
        DescribeDBParameterGroupsResult other = (DescribeDBParameterGroupsResult)obj;
        
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getDBParameterGroups() == null ^ this.getDBParameterGroups() == null) return false;
        if (other.getDBParameterGroups() != null && other.getDBParameterGroups().equals(this.getDBParameterGroups()) == false) return false; 
        return true;
    }
    
}
    