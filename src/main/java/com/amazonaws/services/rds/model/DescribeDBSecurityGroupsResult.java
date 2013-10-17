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
 * Contains the result of a successful invocation of the DescribeDBSecurityGroups action.
 * </p>
 */
public class DescribeDBSecurityGroupsResult implements Serializable {

    /**
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     */
    private String marker;

    /**
     * A list of <a>DBSecurityGroup</a> instances.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<DBSecurityGroup> dBSecurityGroups;

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
    public DescribeDBSecurityGroupsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * A list of <a>DBSecurityGroup</a> instances.
     *
     * @return A list of <a>DBSecurityGroup</a> instances.
     */
    public java.util.List<DBSecurityGroup> getDBSecurityGroups() {
        if (dBSecurityGroups == null) {
              dBSecurityGroups = new com.amazonaws.internal.ListWithAutoConstructFlag<DBSecurityGroup>();
              dBSecurityGroups.setAutoConstruct(true);
        }
        return dBSecurityGroups;
    }
    
    /**
     * A list of <a>DBSecurityGroup</a> instances.
     *
     * @param dBSecurityGroups A list of <a>DBSecurityGroup</a> instances.
     */
    public void setDBSecurityGroups(java.util.Collection<DBSecurityGroup> dBSecurityGroups) {
        if (dBSecurityGroups == null) {
            this.dBSecurityGroups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<DBSecurityGroup> dBSecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DBSecurityGroup>(dBSecurityGroups.size());
        dBSecurityGroupsCopy.addAll(dBSecurityGroups);
        this.dBSecurityGroups = dBSecurityGroupsCopy;
    }
    
    /**
     * A list of <a>DBSecurityGroup</a> instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroups A list of <a>DBSecurityGroup</a> instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeDBSecurityGroupsResult withDBSecurityGroups(DBSecurityGroup... dBSecurityGroups) {
        if (getDBSecurityGroups() == null) setDBSecurityGroups(new java.util.ArrayList<DBSecurityGroup>(dBSecurityGroups.length));
        for (DBSecurityGroup value : dBSecurityGroups) {
            getDBSecurityGroups().add(value);
        }
        return this;
    }
    
    /**
     * A list of <a>DBSecurityGroup</a> instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSecurityGroups A list of <a>DBSecurityGroup</a> instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeDBSecurityGroupsResult withDBSecurityGroups(java.util.Collection<DBSecurityGroup> dBSecurityGroups) {
        if (dBSecurityGroups == null) {
            this.dBSecurityGroups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<DBSecurityGroup> dBSecurityGroupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DBSecurityGroup>(dBSecurityGroups.size());
            dBSecurityGroupsCopy.addAll(dBSecurityGroups);
            this.dBSecurityGroups = dBSecurityGroupsCopy;
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
        if (getDBSecurityGroups() != null) sb.append("DBSecurityGroups: " + getDBSecurityGroups() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getDBSecurityGroups() == null) ? 0 : getDBSecurityGroups().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeDBSecurityGroupsResult == false) return false;
        DescribeDBSecurityGroupsResult other = (DescribeDBSecurityGroupsResult)obj;
        
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getDBSecurityGroups() == null ^ this.getDBSecurityGroups() == null) return false;
        if (other.getDBSecurityGroups() != null && other.getDBSecurityGroups().equals(this.getDBSecurityGroups()) == false) return false; 
        return true;
    }
    
}
    