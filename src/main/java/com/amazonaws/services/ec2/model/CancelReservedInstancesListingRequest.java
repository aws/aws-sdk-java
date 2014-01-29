/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#cancelReservedInstancesListing(CancelReservedInstancesListingRequest) CancelReservedInstancesListing operation}.
 * <p>
 * Cancels the specified Reserved Instance listing in the Reserved Instance Marketplace.
 * </p>
 * <p>
 * For more information, see <a href="http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ri-market-general.html"> Reserved Instance Marketplace </a> in
 * the <i>Amazon Elastic Compute Cloud User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#cancelReservedInstancesListing(CancelReservedInstancesListingRequest)
 */
public class CancelReservedInstancesListingRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The ID of the Reserved Instance listing.
     */
    private String reservedInstancesListingId;

    /**
     * The ID of the Reserved Instance listing.
     *
     * @return The ID of the Reserved Instance listing.
     */
    public String getReservedInstancesListingId() {
        return reservedInstancesListingId;
    }
    
    /**
     * The ID of the Reserved Instance listing.
     *
     * @param reservedInstancesListingId The ID of the Reserved Instance listing.
     */
    public void setReservedInstancesListingId(String reservedInstancesListingId) {
        this.reservedInstancesListingId = reservedInstancesListingId;
    }
    
    /**
     * The ID of the Reserved Instance listing.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesListingId The ID of the Reserved Instance listing.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CancelReservedInstancesListingRequest withReservedInstancesListingId(String reservedInstancesListingId) {
        this.reservedInstancesListingId = reservedInstancesListingId;
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
        if (getReservedInstancesListingId() != null) sb.append("ReservedInstancesListingId: " + getReservedInstancesListingId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReservedInstancesListingId() == null) ? 0 : getReservedInstancesListingId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CancelReservedInstancesListingRequest == false) return false;
        CancelReservedInstancesListingRequest other = (CancelReservedInstancesListingRequest)obj;
        
        if (other.getReservedInstancesListingId() == null ^ this.getReservedInstancesListingId() == null) return false;
        if (other.getReservedInstancesListingId() != null && other.getReservedInstancesListingId().equals(this.getReservedInstancesListingId()) == false) return false; 
        return true;
    }
    
}
    