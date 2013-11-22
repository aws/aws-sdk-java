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
 * Contains the result of a successful invocation of the DescribeReservedDBInstances action.
 * </p>
 */
public class DescribeReservedDBInstancesResult implements Serializable {

    /**
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     */
    private String marker;

    /**
     * A list of reserved DB instances.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ReservedDBInstance> reservedDBInstances;

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
    public DescribeReservedDBInstancesResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * A list of reserved DB instances.
     *
     * @return A list of reserved DB instances.
     */
    public java.util.List<ReservedDBInstance> getReservedDBInstances() {
        if (reservedDBInstances == null) {
              reservedDBInstances = new com.amazonaws.internal.ListWithAutoConstructFlag<ReservedDBInstance>();
              reservedDBInstances.setAutoConstruct(true);
        }
        return reservedDBInstances;
    }
    
    /**
     * A list of reserved DB instances.
     *
     * @param reservedDBInstances A list of reserved DB instances.
     */
    public void setReservedDBInstances(java.util.Collection<ReservedDBInstance> reservedDBInstances) {
        if (reservedDBInstances == null) {
            this.reservedDBInstances = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ReservedDBInstance> reservedDBInstancesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ReservedDBInstance>(reservedDBInstances.size());
        reservedDBInstancesCopy.addAll(reservedDBInstances);
        this.reservedDBInstances = reservedDBInstancesCopy;
    }
    
    /**
     * A list of reserved DB instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedDBInstances A list of reserved DB instances.
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
     * A list of reserved DB instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedDBInstances A list of reserved DB instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedDBInstancesResult withReservedDBInstances(java.util.Collection<ReservedDBInstance> reservedDBInstances) {
        if (reservedDBInstances == null) {
            this.reservedDBInstances = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ReservedDBInstance> reservedDBInstancesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ReservedDBInstance>(reservedDBInstances.size());
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
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (getReservedDBInstances() != null) sb.append("ReservedDBInstances: " + getReservedDBInstances() );
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
    