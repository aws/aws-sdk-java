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
        java.util.List<ReservedDBInstance> reservedDBInstancesCopy = new java.util.ArrayList<ReservedDBInstance>();
        if (reservedDBInstances != null) {
            reservedDBInstancesCopy.addAll(reservedDBInstances);
        }
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
    