/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/DescribeReservation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReservationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The Amazon Resource Name (ARN) of the reservation. */
    private String reservationArn;

    /**
     * The Amazon Resource Name (ARN) of the reservation.
     * 
     * @param reservationArn
     *        The Amazon Resource Name (ARN) of the reservation.
     */

    public void setReservationArn(String reservationArn) {
        this.reservationArn = reservationArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the reservation.
     * 
     * @return The Amazon Resource Name (ARN) of the reservation.
     */

    public String getReservationArn() {
        return this.reservationArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the reservation.
     * 
     * @param reservationArn
     *        The Amazon Resource Name (ARN) of the reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReservationRequest withReservationArn(String reservationArn) {
        setReservationArn(reservationArn);
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
        if (getReservationArn() != null)
            sb.append("ReservationArn: ").append(getReservationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReservationRequest == false)
            return false;
        DescribeReservationRequest other = (DescribeReservationRequest) obj;
        if (other.getReservationArn() == null ^ this.getReservationArn() == null)
            return false;
        if (other.getReservationArn() != null && other.getReservationArn().equals(this.getReservationArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReservationArn() == null) ? 0 : getReservationArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReservationRequest clone() {
        return (DescribeReservationRequest) super.clone();
    }

}
