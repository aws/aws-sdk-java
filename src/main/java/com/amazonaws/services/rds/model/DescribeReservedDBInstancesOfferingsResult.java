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
 * Describe Reserved D B Instances Offerings Result
 */
public class DescribeReservedDBInstancesOfferingsResult {

    private String marker;

    private java.util.List<ReservedDBInstancesOffering> reservedDBInstancesOfferings;

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
    public DescribeReservedDBInstancesOfferingsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }
    
    
    /**
     * Returns the value of the ReservedDBInstancesOfferings property for
     * this object.
     *
     * @return The value of the ReservedDBInstancesOfferings property for this
     *         object.
     */
    public java.util.List<ReservedDBInstancesOffering> getReservedDBInstancesOfferings() {
        if (reservedDBInstancesOfferings == null) {
            reservedDBInstancesOfferings = new java.util.ArrayList<ReservedDBInstancesOffering>();
        }
        return reservedDBInstancesOfferings;
    }
    
    /**
     * Sets the value of the ReservedDBInstancesOfferings property for this
     * object.
     *
     * @param reservedDBInstancesOfferings The new value for the ReservedDBInstancesOfferings property for this
     *         object.
     */
    public void setReservedDBInstancesOfferings(java.util.Collection<ReservedDBInstancesOffering> reservedDBInstancesOfferings) {
        java.util.List<ReservedDBInstancesOffering> reservedDBInstancesOfferingsCopy = new java.util.ArrayList<ReservedDBInstancesOffering>();
        if (reservedDBInstancesOfferings != null) {
            reservedDBInstancesOfferingsCopy.addAll(reservedDBInstancesOfferings);
        }
        this.reservedDBInstancesOfferings = reservedDBInstancesOfferingsCopy;
    }
    
    /**
     * Sets the value of the ReservedDBInstancesOfferings property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedDBInstancesOfferings The new value for the ReservedDBInstancesOfferings property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedDBInstancesOfferingsResult withReservedDBInstancesOfferings(ReservedDBInstancesOffering... reservedDBInstancesOfferings) {
        for (ReservedDBInstancesOffering value : reservedDBInstancesOfferings) {
            getReservedDBInstancesOfferings().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the ReservedDBInstancesOfferings property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedDBInstancesOfferings The new value for the ReservedDBInstancesOfferings property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeReservedDBInstancesOfferingsResult withReservedDBInstancesOfferings(java.util.Collection<ReservedDBInstancesOffering> reservedDBInstancesOfferings) {
        java.util.List<ReservedDBInstancesOffering> reservedDBInstancesOfferingsCopy = new java.util.ArrayList<ReservedDBInstancesOffering>();
        if (reservedDBInstancesOfferings != null) {
            reservedDBInstancesOfferingsCopy.addAll(reservedDBInstancesOfferings);
        }
        this.reservedDBInstancesOfferings = reservedDBInstancesOfferingsCopy;

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
        sb.append("ReservedDBInstancesOfferings: " + reservedDBInstancesOfferings + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    