/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSubnetCidrReservationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the created subnet CIDR reservation.
     * </p>
     */
    private SubnetCidrReservation subnetCidrReservation;

    /**
     * <p>
     * Information about the created subnet CIDR reservation.
     * </p>
     * 
     * @param subnetCidrReservation
     *        Information about the created subnet CIDR reservation.
     */

    public void setSubnetCidrReservation(SubnetCidrReservation subnetCidrReservation) {
        this.subnetCidrReservation = subnetCidrReservation;
    }

    /**
     * <p>
     * Information about the created subnet CIDR reservation.
     * </p>
     * 
     * @return Information about the created subnet CIDR reservation.
     */

    public SubnetCidrReservation getSubnetCidrReservation() {
        return this.subnetCidrReservation;
    }

    /**
     * <p>
     * Information about the created subnet CIDR reservation.
     * </p>
     * 
     * @param subnetCidrReservation
     *        Information about the created subnet CIDR reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubnetCidrReservationResult withSubnetCidrReservation(SubnetCidrReservation subnetCidrReservation) {
        setSubnetCidrReservation(subnetCidrReservation);
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
        if (getSubnetCidrReservation() != null)
            sb.append("SubnetCidrReservation: ").append(getSubnetCidrReservation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSubnetCidrReservationResult == false)
            return false;
        CreateSubnetCidrReservationResult other = (CreateSubnetCidrReservationResult) obj;
        if (other.getSubnetCidrReservation() == null ^ this.getSubnetCidrReservation() == null)
            return false;
        if (other.getSubnetCidrReservation() != null && other.getSubnetCidrReservation().equals(this.getSubnetCidrReservation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubnetCidrReservation() == null) ? 0 : getSubnetCidrReservation().hashCode());
        return hashCode;
    }

    @Override
    public CreateSubnetCidrReservationResult clone() {
        try {
            return (CreateSubnetCidrReservationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
