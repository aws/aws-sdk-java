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
package com.amazonaws.services.ec2.model;

/**
 * <p>
 * The result of describing Amazon EC2 instances.
 * </p>
 */
public class DescribeInstancesResult {

    /**
     * The list of reservations containing the describes instances.
     */
    private java.util.List<Reservation> reservations;

    /**
     * The list of reservations containing the describes instances.
     *
     * @return The list of reservations containing the describes instances.
     */
    public java.util.List<Reservation> getReservations() {
        if (reservations == null) {
            reservations = new java.util.ArrayList<Reservation>();
        }
        return reservations;
    }
    
    /**
     * The list of reservations containing the describes instances.
     *
     * @param reservations The list of reservations containing the describes instances.
     */
    public void setReservations(java.util.Collection<Reservation> reservations) {
        java.util.List<Reservation> reservationsCopy = new java.util.ArrayList<Reservation>();
        if (reservations != null) {
            reservationsCopy.addAll(reservations);
        }
        this.reservations = reservationsCopy;
    }
    
    /**
     * The list of reservations containing the describes instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservations The list of reservations containing the describes instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeInstancesResult withReservations(Reservation... reservations) {
        for (Reservation value : reservations) {
            getReservations().add(value);
        }
        return this;
    }
    
    /**
     * The list of reservations containing the describes instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservations The list of reservations containing the describes instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeInstancesResult withReservations(java.util.Collection<Reservation> reservations) {
        java.util.List<Reservation> reservationsCopy = new java.util.ArrayList<Reservation>();
        if (reservations != null) {
            reservationsCopy.addAll(reservations);
        }
        this.reservations = reservationsCopy;

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
        sb.append("Reservations: " + reservations + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    