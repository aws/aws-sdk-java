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
 * The total value of the Convertible Reserved Instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ReservedInstanceReservationValue"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservedInstanceReservationValue implements Serializable, Cloneable {

    /**
     * <p>
     * The total value of the Convertible Reserved Instance that you are exchanging.
     * </p>
     */
    private ReservationValue reservationValue;
    /**
     * <p>
     * The ID of the Convertible Reserved Instance that you are exchanging.
     * </p>
     */
    private String reservedInstanceId;

    /**
     * <p>
     * The total value of the Convertible Reserved Instance that you are exchanging.
     * </p>
     * 
     * @param reservationValue
     *        The total value of the Convertible Reserved Instance that you are exchanging.
     */

    public void setReservationValue(ReservationValue reservationValue) {
        this.reservationValue = reservationValue;
    }

    /**
     * <p>
     * The total value of the Convertible Reserved Instance that you are exchanging.
     * </p>
     * 
     * @return The total value of the Convertible Reserved Instance that you are exchanging.
     */

    public ReservationValue getReservationValue() {
        return this.reservationValue;
    }

    /**
     * <p>
     * The total value of the Convertible Reserved Instance that you are exchanging.
     * </p>
     * 
     * @param reservationValue
     *        The total value of the Convertible Reserved Instance that you are exchanging.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstanceReservationValue withReservationValue(ReservationValue reservationValue) {
        setReservationValue(reservationValue);
        return this;
    }

    /**
     * <p>
     * The ID of the Convertible Reserved Instance that you are exchanging.
     * </p>
     * 
     * @param reservedInstanceId
     *        The ID of the Convertible Reserved Instance that you are exchanging.
     */

    public void setReservedInstanceId(String reservedInstanceId) {
        this.reservedInstanceId = reservedInstanceId;
    }

    /**
     * <p>
     * The ID of the Convertible Reserved Instance that you are exchanging.
     * </p>
     * 
     * @return The ID of the Convertible Reserved Instance that you are exchanging.
     */

    public String getReservedInstanceId() {
        return this.reservedInstanceId;
    }

    /**
     * <p>
     * The ID of the Convertible Reserved Instance that you are exchanging.
     * </p>
     * 
     * @param reservedInstanceId
     *        The ID of the Convertible Reserved Instance that you are exchanging.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedInstanceReservationValue withReservedInstanceId(String reservedInstanceId) {
        setReservedInstanceId(reservedInstanceId);
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
        if (getReservationValue() != null)
            sb.append("ReservationValue: ").append(getReservationValue()).append(",");
        if (getReservedInstanceId() != null)
            sb.append("ReservedInstanceId: ").append(getReservedInstanceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservedInstanceReservationValue == false)
            return false;
        ReservedInstanceReservationValue other = (ReservedInstanceReservationValue) obj;
        if (other.getReservationValue() == null ^ this.getReservationValue() == null)
            return false;
        if (other.getReservationValue() != null && other.getReservationValue().equals(this.getReservationValue()) == false)
            return false;
        if (other.getReservedInstanceId() == null ^ this.getReservedInstanceId() == null)
            return false;
        if (other.getReservedInstanceId() != null && other.getReservedInstanceId().equals(this.getReservedInstanceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReservationValue() == null) ? 0 : getReservationValue().hashCode());
        hashCode = prime * hashCode + ((getReservedInstanceId() == null) ? 0 : getReservedInstanceId().hashCode());
        return hashCode;
    }

    @Override
    public ReservedInstanceReservationValue clone() {
        try {
            return (ReservedInstanceReservationValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
