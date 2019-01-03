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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/PurchaseReservedNodeOffering"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PurchaseReservedNodeOfferingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the reserved node offering you want to purchase.
     * </p>
     */
    private String reservedNodeOfferingId;
    /**
     * <p>
     * The number of reserved nodes that you want to purchase.
     * </p>
     * <p>
     * Default: <code>1</code>
     * </p>
     */
    private Integer nodeCount;

    /**
     * <p>
     * The unique identifier of the reserved node offering you want to purchase.
     * </p>
     * 
     * @param reservedNodeOfferingId
     *        The unique identifier of the reserved node offering you want to purchase.
     */

    public void setReservedNodeOfferingId(String reservedNodeOfferingId) {
        this.reservedNodeOfferingId = reservedNodeOfferingId;
    }

    /**
     * <p>
     * The unique identifier of the reserved node offering you want to purchase.
     * </p>
     * 
     * @return The unique identifier of the reserved node offering you want to purchase.
     */

    public String getReservedNodeOfferingId() {
        return this.reservedNodeOfferingId;
    }

    /**
     * <p>
     * The unique identifier of the reserved node offering you want to purchase.
     * </p>
     * 
     * @param reservedNodeOfferingId
     *        The unique identifier of the reserved node offering you want to purchase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseReservedNodeOfferingRequest withReservedNodeOfferingId(String reservedNodeOfferingId) {
        setReservedNodeOfferingId(reservedNodeOfferingId);
        return this;
    }

    /**
     * <p>
     * The number of reserved nodes that you want to purchase.
     * </p>
     * <p>
     * Default: <code>1</code>
     * </p>
     * 
     * @param nodeCount
     *        The number of reserved nodes that you want to purchase.</p>
     *        <p>
     *        Default: <code>1</code>
     */

    public void setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
    }

    /**
     * <p>
     * The number of reserved nodes that you want to purchase.
     * </p>
     * <p>
     * Default: <code>1</code>
     * </p>
     * 
     * @return The number of reserved nodes that you want to purchase.</p>
     *         <p>
     *         Default: <code>1</code>
     */

    public Integer getNodeCount() {
        return this.nodeCount;
    }

    /**
     * <p>
     * The number of reserved nodes that you want to purchase.
     * </p>
     * <p>
     * Default: <code>1</code>
     * </p>
     * 
     * @param nodeCount
     *        The number of reserved nodes that you want to purchase.</p>
     *        <p>
     *        Default: <code>1</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseReservedNodeOfferingRequest withNodeCount(Integer nodeCount) {
        setNodeCount(nodeCount);
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
        if (getReservedNodeOfferingId() != null)
            sb.append("ReservedNodeOfferingId: ").append(getReservedNodeOfferingId()).append(",");
        if (getNodeCount() != null)
            sb.append("NodeCount: ").append(getNodeCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PurchaseReservedNodeOfferingRequest == false)
            return false;
        PurchaseReservedNodeOfferingRequest other = (PurchaseReservedNodeOfferingRequest) obj;
        if (other.getReservedNodeOfferingId() == null ^ this.getReservedNodeOfferingId() == null)
            return false;
        if (other.getReservedNodeOfferingId() != null && other.getReservedNodeOfferingId().equals(this.getReservedNodeOfferingId()) == false)
            return false;
        if (other.getNodeCount() == null ^ this.getNodeCount() == null)
            return false;
        if (other.getNodeCount() != null && other.getNodeCount().equals(this.getNodeCount()) == false)
            return false;
        return true;
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
    public PurchaseReservedNodeOfferingRequest clone() {
        return (PurchaseReservedNodeOfferingRequest) super.clone();
    }

}
