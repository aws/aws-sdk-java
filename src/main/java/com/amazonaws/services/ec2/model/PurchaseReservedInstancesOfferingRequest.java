/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#purchaseReservedInstancesOffering(PurchaseReservedInstancesOfferingRequest) PurchaseReservedInstancesOffering operation}.
 * <p>
 * The PurchaseReservedInstancesOffering operation purchases a Reserved Instance for use with your account. With Amazon EC2 Reserved Instances, you
 * purchase the right to launch Amazon EC2 instances for a period of time (without getting insufficient capacity errors) and pay a lower usage rate for
 * the actual time used.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#purchaseReservedInstancesOffering(PurchaseReservedInstancesOfferingRequest)
 */
public class PurchaseReservedInstancesOfferingRequest extends AmazonWebServiceRequest {

    /**
     * The unique ID of the Reserved Instances offering being purchased.
     */
    private String reservedInstancesOfferingId;

    /**
     * The number of Reserved Instances to purchase.
     */
    private Integer instanceCount;

    /**
     * Default constructor for a new PurchaseReservedInstancesOfferingRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public PurchaseReservedInstancesOfferingRequest() {}
    
    /**
     * Constructs a new PurchaseReservedInstancesOfferingRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param reservedInstancesOfferingId The unique ID of the Reserved
     * Instances offering being purchased.
     * @param instanceCount The number of Reserved Instances to purchase.
     */
    public PurchaseReservedInstancesOfferingRequest(String reservedInstancesOfferingId, Integer instanceCount) {
        this.reservedInstancesOfferingId = reservedInstancesOfferingId;
        this.instanceCount = instanceCount;
    }

    
    
    /**
     * The unique ID of the Reserved Instances offering being purchased.
     *
     * @return The unique ID of the Reserved Instances offering being purchased.
     */
    public String getReservedInstancesOfferingId() {
        return reservedInstancesOfferingId;
    }
    
    /**
     * The unique ID of the Reserved Instances offering being purchased.
     *
     * @param reservedInstancesOfferingId The unique ID of the Reserved Instances offering being purchased.
     */
    public void setReservedInstancesOfferingId(String reservedInstancesOfferingId) {
        this.reservedInstancesOfferingId = reservedInstancesOfferingId;
    }
    
    /**
     * The unique ID of the Reserved Instances offering being purchased.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedInstancesOfferingId The unique ID of the Reserved Instances offering being purchased.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PurchaseReservedInstancesOfferingRequest withReservedInstancesOfferingId(String reservedInstancesOfferingId) {
        this.reservedInstancesOfferingId = reservedInstancesOfferingId;
        return this;
    }
    
    
    /**
     * The number of Reserved Instances to purchase.
     *
     * @return The number of Reserved Instances to purchase.
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }
    
    /**
     * The number of Reserved Instances to purchase.
     *
     * @param instanceCount The number of Reserved Instances to purchase.
     */
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }
    
    /**
     * The number of Reserved Instances to purchase.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceCount The number of Reserved Instances to purchase.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public PurchaseReservedInstancesOfferingRequest withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
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
        if (reservedInstancesOfferingId != null) sb.append("ReservedInstancesOfferingId: " + reservedInstancesOfferingId + ", ");
        if (instanceCount != null) sb.append("InstanceCount: " + instanceCount + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReservedInstancesOfferingId() == null) ? 0 : getReservedInstancesOfferingId().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof PurchaseReservedInstancesOfferingRequest == false) return false;
        PurchaseReservedInstancesOfferingRequest other = (PurchaseReservedInstancesOfferingRequest)obj;
        
        if (other.getReservedInstancesOfferingId() == null ^ this.getReservedInstancesOfferingId() == null) return false;
        if (other.getReservedInstancesOfferingId() != null && other.getReservedInstancesOfferingId().equals(this.getReservedInstancesOfferingId()) == false) return false; 
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null) return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false) return false; 
        return true;
    }
    
}
    