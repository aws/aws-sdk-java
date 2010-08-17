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
 * Describe Reserved D B Instances Result
 */
public class DescribeReservedDBInstancesResult {

    private String marker;

    private java.util.List<ReservedDBInstance> reservedDBInstances;

    /**
     * Returns the value of the Marker property for this object.
     *
     * @return The value of the Marker property for this object.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * Sets the value of the Marker property for this object.
     *
     * @param marker The new value for the Marker property for this object.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * Sets the value of the Marker property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker The new value for the Marker property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedDBInstancesResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }
    
    
    /**
     * Returns the value of the ReservedDBInstances property for this object.
     *
     * @return The value of the ReservedDBInstances property for this object.
     */
    public java.util.List<ReservedDBInstance> getReservedDBInstances() {
        if (reservedDBInstances == null) {
            reservedDBInstances = new java.util.ArrayList<ReservedDBInstance>();
        }
        return reservedDBInstances;
    }
    
    /**
     * Sets the value of the ReservedDBInstances property for this object.
     *
     * @param reservedDBInstances The new value for the ReservedDBInstances property for this object.
     */
    public void setReservedDBInstances(java.util.Collection<ReservedDBInstance> reservedDBInstances) {
        java.util.List<ReservedDBInstance> reservedDBInstancesCopy = new java.util.ArrayList<ReservedDBInstance>();
        if (reservedDBInstances != null) {
            reservedDBInstancesCopy.addAll(reservedDBInstances);
        }
        this.reservedDBInstances = reservedDBInstancesCopy;
    }
    
    /**
     * Sets the value of the ReservedDBInstances property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedDBInstances The new value for the ReservedDBInstances property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedDBInstancesResult withReservedDBInstances(ReservedDBInstance... reservedDBInstances) {
        for (ReservedDBInstance value : reservedDBInstances) {
            getReservedDBInstances().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the ReservedDBInstances property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedDBInstances The new value for the ReservedDBInstances property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedDBInstancesResult withReservedDBInstances(java.util.Collection<ReservedDBInstance> reservedDBInstances) {
        java.util.List<ReservedDBInstance> reservedDBInstancesCopy = new java.util.ArrayList<ReservedDBInstance>();
        if (reservedDBInstances != null) {
            reservedDBInstancesCopy.addAll(reservedDBInstances);
        }
        this.reservedDBInstances = reservedDBInstancesCopy;

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
        sb.append("ReservedDBInstances: " + reservedDBInstances + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    