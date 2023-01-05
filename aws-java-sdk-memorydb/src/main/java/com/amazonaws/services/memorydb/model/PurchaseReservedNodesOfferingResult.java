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
package com.amazonaws.services.memorydb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/PurchaseReservedNodesOffering"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PurchaseReservedNodesOfferingResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Represents the output of a <code>PurchaseReservedNodesOffering</code> operation.
     * </p>
     */
    private ReservedNode reservedNode;

    /**
     * <p>
     * Represents the output of a <code>PurchaseReservedNodesOffering</code> operation.
     * </p>
     * 
     * @param reservedNode
     *        Represents the output of a <code>PurchaseReservedNodesOffering</code> operation.
     */

    public void setReservedNode(ReservedNode reservedNode) {
        this.reservedNode = reservedNode;
    }

    /**
     * <p>
     * Represents the output of a <code>PurchaseReservedNodesOffering</code> operation.
     * </p>
     * 
     * @return Represents the output of a <code>PurchaseReservedNodesOffering</code> operation.
     */

    public ReservedNode getReservedNode() {
        return this.reservedNode;
    }

    /**
     * <p>
     * Represents the output of a <code>PurchaseReservedNodesOffering</code> operation.
     * </p>
     * 
     * @param reservedNode
     *        Represents the output of a <code>PurchaseReservedNodesOffering</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseReservedNodesOfferingResult withReservedNode(ReservedNode reservedNode) {
        setReservedNode(reservedNode);
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
        if (getReservedNode() != null)
            sb.append("ReservedNode: ").append(getReservedNode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PurchaseReservedNodesOfferingResult == false)
            return false;
        PurchaseReservedNodesOfferingResult other = (PurchaseReservedNodesOfferingResult) obj;
        if (other.getReservedNode() == null ^ this.getReservedNode() == null)
            return false;
        if (other.getReservedNode() != null && other.getReservedNode().equals(this.getReservedNode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReservedNode() == null) ? 0 : getReservedNode().hashCode());
        return hashCode;
    }

    @Override
    public PurchaseReservedNodesOfferingResult clone() {
        try {
            return (PurchaseReservedNodesOfferingResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
