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

/**
 * <p>
 * Describes a target Capacity Reservation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/CapacityReservationTarget" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CapacityReservationTarget implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     */
    private String capacityReservationId;

    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     * 
     * @param capacityReservationId
     *        The ID of the Capacity Reservation.
     */

    public void setCapacityReservationId(String capacityReservationId) {
        this.capacityReservationId = capacityReservationId;
    }

    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     * 
     * @return The ID of the Capacity Reservation.
     */

    public String getCapacityReservationId() {
        return this.capacityReservationId;
    }

    /**
     * <p>
     * The ID of the Capacity Reservation.
     * </p>
     * 
     * @param capacityReservationId
     *        The ID of the Capacity Reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityReservationTarget withCapacityReservationId(String capacityReservationId) {
        setCapacityReservationId(capacityReservationId);
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
        if (getCapacityReservationId() != null)
            sb.append("CapacityReservationId: ").append(getCapacityReservationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CapacityReservationTarget == false)
            return false;
        CapacityReservationTarget other = (CapacityReservationTarget) obj;
        if (other.getCapacityReservationId() == null ^ this.getCapacityReservationId() == null)
            return false;
        if (other.getCapacityReservationId() != null && other.getCapacityReservationId().equals(this.getCapacityReservationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapacityReservationId() == null) ? 0 : getCapacityReservationId().hashCode());
        return hashCode;
    }

    @Override
    public CapacityReservationTarget clone() {
        try {
            return (CapacityReservationTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
