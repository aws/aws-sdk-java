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
 * Contains the result of a successful invocation of the DescribeReservedDBInstances action.
 * </p>
 */
public class DescribeReservedDBInstancesResult {

    /**
     * The marker provided for paginated results.
     */
    private String marker;

    /**
     * A list of of reserved DB Instances.
     */
    private java.util.List<ReservedDBInstance> reservedDBInstances;

    /**
     * The marker provided for paginated results.
     *
     * @return The marker provided for paginated results.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * The marker provided for paginated results.
     *
     * @param marker The marker provided for paginated results.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * The marker provided for paginated results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker The marker provided for paginated results.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedDBInstancesResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }
    
    
    /**
     * A list of of reserved DB Instances.
     *
     * @return A list of of reserved DB Instances.
     */
    public java.util.List<ReservedDBInstance> getReservedDBInstances() {
        
        if (reservedDBInstances == null) {
            reservedDBInstances = new java.util.ArrayList<ReservedDBInstance>();
        }
        return reservedDBInstances;
    }
    
    /**
     * A list of of reserved DB Instances.
     *
     * @param reservedDBInstances A list of of reserved DB Instances.
     */
    public void setReservedDBInstances(java.util.Collection<ReservedDBInstance> reservedDBInstances) {
        if (reservedDBInstances == null) {
            this.reservedDBInstances = null;
            return;
        }

        java.util.List<ReservedDBInstance> reservedDBInstancesCopy = new java.util.ArrayList<ReservedDBInstance>(reservedDBInstances.size());
        reservedDBInstancesCopy.addAll(reservedDBInstances);
        this.reservedDBInstances = reservedDBInstancesCopy;
    }
    
    /**
     * A list of of reserved DB Instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedDBInstances A list of of reserved DB Instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedDBInstancesResult withReservedDBInstances(ReservedDBInstance... reservedDBInstances) {
        if (getReservedDBInstances() == null) setReservedDBInstances(new java.util.ArrayList<ReservedDBInstance>(reservedDBInstances.length));
        for (ReservedDBInstance value : reservedDBInstances) {
            getReservedDBInstances().add(value);
        }
        return this;
    }
    
    /**
     * A list of of reserved DB Instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedDBInstances A list of of reserved DB Instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedDBInstancesResult withReservedDBInstances(java.util.Collection<ReservedDBInstance> reservedDBInstances) {
        if (reservedDBInstances == null) {
            this.reservedDBInstances = null;
        } else {
            java.util.List<ReservedDBInstance> reservedDBInstancesCopy = new java.util.ArrayList<ReservedDBInstance>(reservedDBInstances.size());
            reservedDBInstancesCopy.addAll(reservedDBInstances);
            this.reservedDBInstances = reservedDBInstancesCopy;
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
        if (reservedDBInstances != null) sb.append("ReservedDBInstances: " + reservedDBInstances + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getReservedDBInstances() == null) ? 0 : getReservedDBInstances().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeReservedDBInstancesResult == false) return false;
        DescribeReservedDBInstancesResult other = (DescribeReservedDBInstancesResult)obj;
        
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getReservedDBInstances() == null ^ this.getReservedDBInstances() == null) return false;
        if (other.getReservedDBInstances() != null && other.getReservedDBInstances().equals(this.getReservedDBInstances()) == false) return false; 
        return true;
    }
    
}
    