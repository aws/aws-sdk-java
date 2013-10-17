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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;


/**
 * <p>
 * The result of calling the RunInstancesResult, contains the new reservation created by Amazon EC2.
 * </p>
 */
public class RunInstancesResult implements Serializable {

    /**
     * The newly created reservation, containing the new instances.
     */
    private Reservation reservation;

    /**
     * The newly created reservation, containing the new instances.
     *
     * @return The newly created reservation, containing the new instances.
     */
    public Reservation getReservation() {
        return reservation;
    }
    
    /**
     * The newly created reservation, containing the new instances.
     *
     * @param reservation The newly created reservation, containing the new instances.
     */
    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
    
    /**
     * The newly created reservation, containing the new instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservation The newly created reservation, containing the new instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RunInstancesResult withReservation(Reservation reservation) {
        this.reservation = reservation;
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
        if (getReservation() != null) sb.append("Reservation: " + getReservation() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReservation() == null) ? 0 : getReservation().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RunInstancesResult == false) return false;
        RunInstancesResult other = (RunInstancesResult)obj;
        
        if (other.getReservation() == null ^ this.getReservation() == null) return false;
        if (other.getReservation() != null && other.getReservation().equals(this.getReservation()) == false) return false; 
        return true;
    }
    
}
    