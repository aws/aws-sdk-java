/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * A simple result wrapper around the Reservation object that was sent over the wire.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RunInstancesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Describes a reservation.
     * </p>
     */
    private Reservation reservation;

    /**
     * <p>
     * Describes a reservation.
     * </p>
     * 
     * @param reservation
     *        Describes a reservation.
     */

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    /**
     * <p>
     * Describes a reservation.
     * </p>
     * 
     * @return Describes a reservation.
     */

    public Reservation getReservation() {
        return this.reservation;
    }

    /**
     * <p>
     * Describes a reservation.
     * </p>
     * 
     * @param reservation
     *        Describes a reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunInstancesResult withReservation(Reservation reservation) {
        setReservation(reservation);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getReservation() != null)
            sb.append("Reservation: ").append(getReservation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RunInstancesResult == false)
            return false;
        RunInstancesResult other = (RunInstancesResult) obj;
        if (other.getReservation() == null ^ this.getReservation() == null)
            return false;
        if (other.getReservation() != null && other.getReservation().equals(this.getReservation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReservation() == null) ? 0 : getReservation().hashCode());
        return hashCode;
    }

    @Override
    public RunInstancesResult clone() {
        try {
            return (RunInstancesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
