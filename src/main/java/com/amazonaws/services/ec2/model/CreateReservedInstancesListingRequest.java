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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#createReservedInstancesListing(CreateReservedInstancesListingRequest) CreateReservedInstancesListing operation}.
 * 
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#createReservedInstancesListing(CreateReservedInstancesListingRequest)
 */
public class CreateReservedInstancesListingRequest extends AmazonWebServiceRequest implements Serializable {

    private String reservedInstancesId;

    private Integer instanceCount;

    private com.amazonaws.internal.ListWithAutoConstructFlag<PriceScheduleSpecification> priceSchedules;

    private String clientToken;

    /**
     * Returns the value of the ReservedInstancesId property for this object.
     *
     * @return The value of the ReservedInstancesId property for this object.
     */
    public String getReservedInstancesId() {
        return reservedInstancesId;
    }
    
    /**
     * Sets the value of the ReservedInstancesId property for this object.
     *
     * @param reservedInstancesId The new value for the ReservedInstancesId property for this object.
     */
    public void setReservedInstancesId(String reservedInstancesId) {
        this.reservedInstancesId = reservedInstancesId;
    }
    
    /**
     * Sets the value of the ReservedInstancesId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesId The new value for the ReservedInstancesId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateReservedInstancesListingRequest withReservedInstancesId(String reservedInstancesId) {
        this.reservedInstancesId = reservedInstancesId;
        return this;
    }

    /**
     * Returns the value of the InstanceCount property for this object.
     *
     * @return The value of the InstanceCount property for this object.
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }
    
    /**
     * Sets the value of the InstanceCount property for this object.
     *
     * @param instanceCount The new value for the InstanceCount property for this object.
     */
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }
    
    /**
     * Sets the value of the InstanceCount property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceCount The new value for the InstanceCount property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateReservedInstancesListingRequest withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * Returns the value of the PriceSchedules property for this object.
     *
     * @return The value of the PriceSchedules property for this object.
     */
    public java.util.List<PriceScheduleSpecification> getPriceSchedules() {
        if (priceSchedules == null) {
              priceSchedules = new com.amazonaws.internal.ListWithAutoConstructFlag<PriceScheduleSpecification>();
              priceSchedules.setAutoConstruct(true);
        }
        return priceSchedules;
    }
    
    /**
     * Sets the value of the PriceSchedules property for this object.
     *
     * @param priceSchedules The new value for the PriceSchedules property for this object.
     */
    public void setPriceSchedules(java.util.Collection<PriceScheduleSpecification> priceSchedules) {
        if (priceSchedules == null) {
            this.priceSchedules = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<PriceScheduleSpecification> priceSchedulesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PriceScheduleSpecification>(priceSchedules.size());
        priceSchedulesCopy.addAll(priceSchedules);
        this.priceSchedules = priceSchedulesCopy;
    }
    
    /**
     * Sets the value of the PriceSchedules property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param priceSchedules The new value for the PriceSchedules property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateReservedInstancesListingRequest withPriceSchedules(PriceScheduleSpecification... priceSchedules) {
        if (getPriceSchedules() == null) setPriceSchedules(new java.util.ArrayList<PriceScheduleSpecification>(priceSchedules.length));
        for (PriceScheduleSpecification value : priceSchedules) {
            getPriceSchedules().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the PriceSchedules property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param priceSchedules The new value for the PriceSchedules property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateReservedInstancesListingRequest withPriceSchedules(java.util.Collection<PriceScheduleSpecification> priceSchedules) {
        if (priceSchedules == null) {
            this.priceSchedules = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<PriceScheduleSpecification> priceSchedulesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<PriceScheduleSpecification>(priceSchedules.size());
            priceSchedulesCopy.addAll(priceSchedules);
            this.priceSchedules = priceSchedulesCopy;
        }

        return this;
    }

    /**
     * Returns the value of the ClientToken property for this object.
     *
     * @return The value of the ClientToken property for this object.
     */
    public String getClientToken() {
        return clientToken;
    }
    
    /**
     * Sets the value of the ClientToken property for this object.
     *
     * @param clientToken The new value for the ClientToken property for this object.
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }
    
    /**
     * Sets the value of the ClientToken property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientToken The new value for the ClientToken property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateReservedInstancesListingRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
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
        if (getReservedInstancesId() != null) sb.append("ReservedInstancesId: " + getReservedInstancesId() + ",");
        if (getInstanceCount() != null) sb.append("InstanceCount: " + getInstanceCount() + ",");
        if (getPriceSchedules() != null) sb.append("PriceSchedules: " + getPriceSchedules() + ",");
        if (getClientToken() != null) sb.append("ClientToken: " + getClientToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReservedInstancesId() == null) ? 0 : getReservedInstancesId().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode()); 
        hashCode = prime * hashCode + ((getPriceSchedules() == null) ? 0 : getPriceSchedules().hashCode()); 
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateReservedInstancesListingRequest == false) return false;
        CreateReservedInstancesListingRequest other = (CreateReservedInstancesListingRequest)obj;
        
        if (other.getReservedInstancesId() == null ^ this.getReservedInstancesId() == null) return false;
        if (other.getReservedInstancesId() != null && other.getReservedInstancesId().equals(this.getReservedInstancesId()) == false) return false; 
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null) return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false) return false; 
        if (other.getPriceSchedules() == null ^ this.getPriceSchedules() == null) return false;
        if (other.getPriceSchedules() != null && other.getPriceSchedules().equals(this.getPriceSchedules()) == false) return false; 
        if (other.getClientToken() == null ^ this.getClientToken() == null) return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false) return false; 
        return true;
    }
    
}
    