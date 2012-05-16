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
 * Contains the result of a successful invocation of the DescribeDBInstances action.
 * </p>
 */
public class DescribeDBInstancesResult {

    /**
     * The marker obtained from a previous operation response.
     */
    private String marker;

    /**
     * A list of <a>DBInstance</a> instances.
     */
    private java.util.List<DBInstance> dBInstances;

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
    public DescribeDBInstancesResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }
    
    
    /**
     * A list of <a>DBInstance</a> instances.
     *
     * @return A list of <a>DBInstance</a> instances.
     */
    public java.util.List<DBInstance> getDBInstances() {
        
        if (dBInstances == null) {
            dBInstances = new java.util.ArrayList<DBInstance>();
        }
        return dBInstances;
    }
    
    /**
     * A list of <a>DBInstance</a> instances.
     *
     * @param dBInstances A list of <a>DBInstance</a> instances.
     */
    public void setDBInstances(java.util.Collection<DBInstance> dBInstances) {
        if (dBInstances == null) {
            this.dBInstances = null;
            return;
        }

        java.util.List<DBInstance> dBInstancesCopy = new java.util.ArrayList<DBInstance>(dBInstances.size());
        dBInstancesCopy.addAll(dBInstances);
        this.dBInstances = dBInstancesCopy;
    }
    
    /**
     * A list of <a>DBInstance</a> instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstances A list of <a>DBInstance</a> instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeDBInstancesResult withDBInstances(DBInstance... dBInstances) {
        if (getDBInstances() == null) setDBInstances(new java.util.ArrayList<DBInstance>(dBInstances.length));
        for (DBInstance value : dBInstances) {
            getDBInstances().add(value);
        }
        return this;
    }
    
    /**
     * A list of <a>DBInstance</a> instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstances A list of <a>DBInstance</a> instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeDBInstancesResult withDBInstances(java.util.Collection<DBInstance> dBInstances) {
        if (dBInstances == null) {
            this.dBInstances = null;
        } else {
            java.util.List<DBInstance> dBInstancesCopy = new java.util.ArrayList<DBInstance>(dBInstances.size());
            dBInstancesCopy.addAll(dBInstances);
            this.dBInstances = dBInstancesCopy;
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
        if (dBInstances != null) sb.append("DBInstances: " + dBInstances + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getDBInstances() == null) ? 0 : getDBInstances().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeDBInstancesResult == false) return false;
        DescribeDBInstancesResult other = (DescribeDBInstancesResult)obj;
        
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getDBInstances() == null ^ this.getDBInstances() == null) return false;
        if (other.getDBInstances() != null && other.getDBInstances().equals(this.getDBInstances()) == false) return false; 
        return true;
    }
    
}
    