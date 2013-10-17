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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.redshift.AmazonRedshift#purchaseReservedNodeOffering(PurchaseReservedNodeOfferingRequest) PurchaseReservedNodeOffering operation}.
 * <p>
 * Allows you to purchase reserved nodes. Amazon Redshift offers a predefined set of reserved node offerings. You can purchase one of the offerings. You
 * can call the DescribeReservedNodeOfferings API to obtain the available reserved node offerings. You can call this API by providing a specific reserved
 * node offering and the number of nodes you want to reserve.
 * </p>
 * <p>
 * For more information about managing parameter groups, go to <a
 * href="http://docs.aws.amazon.com/redshift/latest/mgmt/purchase-reserved-node-instance.html"> Purchasing Reserved Nodes </a> in the <i>Amazon Redshift
 * Management Guide</i> .
 * 
 * 
 * </p>
 *
 * @see com.amazonaws.services.redshift.AmazonRedshift#purchaseReservedNodeOffering(PurchaseReservedNodeOfferingRequest)
 */
public class PurchaseReservedNodeOfferingRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The unique identifier of the reserved node offering you want to
     * purchase.
     */
    private String reservedNodeOfferingId;

    /**
     * The number of reserved nodes you want to purchase. <p>Default:
     * <code>1</code>
     */
    private Integer nodeCount;

    /**
     * The unique identifier of the reserved node offering you want to
     * purchase.
     *
     * @return The unique identifier of the reserved node offering you want to
     *         purchase.
     */
    public String getReservedNodeOfferingId() {
        return reservedNodeOfferingId;
    }
    
    /**
     * The unique identifier of the reserved node offering you want to
     * purchase.
     *
     * @param reservedNodeOfferingId The unique identifier of the reserved node offering you want to
     *         purchase.
     */
    public void setReservedNodeOfferingId(String reservedNodeOfferingId) {
        this.reservedNodeOfferingId = reservedNodeOfferingId;
    }
    
    /**
     * The unique identifier of the reserved node offering you want to
     * purchase.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedNodeOfferingId The unique identifier of the reserved node offering you want to
     *         purchase.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PurchaseReservedNodeOfferingRequest withReservedNodeOfferingId(String reservedNodeOfferingId) {
        this.reservedNodeOfferingId = reservedNodeOfferingId;
        return this;
    }

    /**
     * The number of reserved nodes you want to purchase. <p>Default:
     * <code>1</code>
     *
     * @return The number of reserved nodes you want to purchase. <p>Default:
     *         <code>1</code>
     */
    public Integer getNodeCount() {
        return nodeCount;
    }
    
    /**
     * The number of reserved nodes you want to purchase. <p>Default:
     * <code>1</code>
     *
     * @param nodeCount The number of reserved nodes you want to purchase. <p>Default:
     *         <code>1</code>
     */
    public void setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
    }
    
    /**
     * The number of reserved nodes you want to purchase. <p>Default:
     * <code>1</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nodeCount The number of reserved nodes you want to purchase. <p>Default:
     *         <code>1</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PurchaseReservedNodeOfferingRequest withNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
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
        if (getReservedNodeOfferingId() != null) sb.append("ReservedNodeOfferingId: " + getReservedNodeOfferingId() + ",");
        if (getNodeCount() != null) sb.append("NodeCount: " + getNodeCount() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getReservedNodeOfferingId() == null) ? 0 : getReservedNodeOfferingId().hashCode()); 
        hashCode = prime * hashCode + ((getNodeCount() == null) ? 0 : getNodeCount().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PurchaseReservedNodeOfferingRequest == false) return false;
        PurchaseReservedNodeOfferingRequest other = (PurchaseReservedNodeOfferingRequest)obj;
        
        if (other.getReservedNodeOfferingId() == null ^ this.getReservedNodeOfferingId() == null) return false;
        if (other.getReservedNodeOfferingId() != null && other.getReservedNodeOfferingId().equals(this.getReservedNodeOfferingId()) == false) return false; 
        if (other.getNodeCount() == null ^ this.getNodeCount() == null) return false;
        if (other.getNodeCount() != null && other.getNodeCount().equals(this.getNodeCount()) == false) return false; 
        return true;
    }
    
}
    