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
 * <p>
 * Contains the output of CreateReservedInstancesListing.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateReservedInstancesListingResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information about the Standard Reserved Instance listing.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ReservedInstancesListing> reservedInstancesListings;

    /**
     * <p>
     * Information about the Standard Reserved Instance listing.
     * </p>
     * 
     * @return Information about the Standard Reserved Instance listing.
     */

    public java.util.List<ReservedInstancesListing> getReservedInstancesListings() {
        if (reservedInstancesListings == null) {
            reservedInstancesListings = new com.amazonaws.internal.SdkInternalList<ReservedInstancesListing>();
        }
        return reservedInstancesListings;
    }

    /**
     * <p>
     * Information about the Standard Reserved Instance listing.
     * </p>
     * 
     * @param reservedInstancesListings
     *        Information about the Standard Reserved Instance listing.
     */

    public void setReservedInstancesListings(java.util.Collection<ReservedInstancesListing> reservedInstancesListings) {
        if (reservedInstancesListings == null) {
            this.reservedInstancesListings = null;
            return;
        }

        this.reservedInstancesListings = new com.amazonaws.internal.SdkInternalList<ReservedInstancesListing>(reservedInstancesListings);
    }

    /**
     * <p>
     * Information about the Standard Reserved Instance listing.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReservedInstancesListings(java.util.Collection)} or
     * {@link #withReservedInstancesListings(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param reservedInstancesListings
     *        Information about the Standard Reserved Instance listing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReservedInstancesListingResult withReservedInstancesListings(ReservedInstancesListing... reservedInstancesListings) {
        if (this.reservedInstancesListings == null) {
            setReservedInstancesListings(new com.amazonaws.internal.SdkInternalList<ReservedInstancesListing>(reservedInstancesListings.length));
        }
        for (ReservedInstancesListing ele : reservedInstancesListings) {
            this.reservedInstancesListings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the Standard Reserved Instance listing.
     * </p>
     * 
     * @param reservedInstancesListings
     *        Information about the Standard Reserved Instance listing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateReservedInstancesListingResult withReservedInstancesListings(java.util.Collection<ReservedInstancesListing> reservedInstancesListings) {
        setReservedInstancesListings(reservedInstancesListings);
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
        if (getReservedInstancesListings() != null)
            sb.append("ReservedInstancesListings: ").append(getReservedInstancesListings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateReservedInstancesListingResult == false)
            return false;
        CreateReservedInstancesListingResult other = (CreateReservedInstancesListingResult) obj;
        if (other.getReservedInstancesListings() == null ^ this.getReservedInstancesListings() == null)
            return false;
        if (other.getReservedInstancesListings() != null && other.getReservedInstancesListings().equals(this.getReservedInstancesListings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReservedInstancesListings() == null) ? 0 : getReservedInstancesListings().hashCode());
        return hashCode;
    }

    @Override
    public CreateReservedInstancesListingResult clone() {
        try {
            return (CreateReservedInstancesListingResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
