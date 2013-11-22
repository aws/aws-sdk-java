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
 * Contains the result of a successful invocation of the DescribeReservedDBInstancesOfferings action.
 * </p>
 */
public class DescribeReservedDBInstancesOfferingsResult implements Serializable {

    /**
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     */
    private String marker;

    /**
     * A list of reserved DB instance offerings.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ReservedDBInstancesOffering> reservedDBInstancesOfferings;

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
    public DescribeReservedDBInstancesOfferingsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * A list of reserved DB instance offerings.
     *
     * @return A list of reserved DB instance offerings.
     */
    public java.util.List<ReservedDBInstancesOffering> getReservedDBInstancesOfferings() {
        if (reservedDBInstancesOfferings == null) {
              reservedDBInstancesOfferings = new com.amazonaws.internal.ListWithAutoConstructFlag<ReservedDBInstancesOffering>();
              reservedDBInstancesOfferings.setAutoConstruct(true);
        }
        return reservedDBInstancesOfferings;
    }
    
    /**
     * A list of reserved DB instance offerings.
     *
     * @param reservedDBInstancesOfferings A list of reserved DB instance offerings.
     */
    public void setReservedDBInstancesOfferings(java.util.Collection<ReservedDBInstancesOffering> reservedDBInstancesOfferings) {
        if (reservedDBInstancesOfferings == null) {
            this.reservedDBInstancesOfferings = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ReservedDBInstancesOffering> reservedDBInstancesOfferingsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ReservedDBInstancesOffering>(reservedDBInstancesOfferings.size());
        reservedDBInstancesOfferingsCopy.addAll(reservedDBInstancesOfferings);
        this.reservedDBInstancesOfferings = reservedDBInstancesOfferingsCopy;
    }
    
    /**
     * A list of reserved DB instance offerings.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedDBInstancesOfferings A list of reserved DB instance offerings.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedDBInstancesOfferingsResult withReservedDBInstancesOfferings(ReservedDBInstancesOffering... reservedDBInstancesOfferings) {
        if (getReservedDBInstancesOfferings() == null) setReservedDBInstancesOfferings(new java.util.ArrayList<ReservedDBInstancesOffering>(reservedDBInstancesOfferings.length));
        for (ReservedDBInstancesOffering value : reservedDBInstancesOfferings) {
            getReservedDBInstancesOfferings().add(value);
        }
        return this;
    }
    
    /**
     * A list of reserved DB instance offerings.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedDBInstancesOfferings A list of reserved DB instance offerings.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedDBInstancesOfferingsResult withReservedDBInstancesOfferings(java.util.Collection<ReservedDBInstancesOffering> reservedDBInstancesOfferings) {
        if (reservedDBInstancesOfferings == null) {
            this.reservedDBInstancesOfferings = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ReservedDBInstancesOffering> reservedDBInstancesOfferingsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ReservedDBInstancesOffering>(reservedDBInstancesOfferings.size());
            reservedDBInstancesOfferingsCopy.addAll(reservedDBInstancesOfferings);
            this.reservedDBInstancesOfferings = reservedDBInstancesOfferingsCopy;
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
        if (getReservedDBInstancesOfferings() != null) sb.append("ReservedDBInstancesOfferings: " + getReservedDBInstancesOfferings() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getReservedDBInstancesOfferings() == null) ? 0 : getReservedDBInstancesOfferings().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeReservedDBInstancesOfferingsResult == false) return false;
        DescribeReservedDBInstancesOfferingsResult other = (DescribeReservedDBInstancesOfferingsResult)obj;
        
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getReservedDBInstancesOfferings() == null ^ this.getReservedDBInstancesOfferings() == null) return false;
        if (other.getReservedDBInstancesOfferings() != null && other.getReservedDBInstancesOfferings().equals(this.getReservedDBInstancesOfferings()) == false) return false; 
        return true;
    }
    
}
    