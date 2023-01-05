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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The offering type of this node.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/ReservedNodesOffering" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservedNodesOffering implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The offering identifier.
     * </p>
     */
    private String reservedNodesOfferingId;
    /**
     * <p>
     * The node type for the reserved nodes. For more information, see <a
     * href="https://docs.aws.amazon.com/memorydb/latest/devguide/nodes.reserved.html#reserved-nodes-supported"
     * >Supported node types</a>.
     * </p>
     */
    private String nodeType;
    /**
     * <p>
     * The duration of the reservation in seconds.
     * </p>
     */
    private Integer duration;
    /**
     * <p>
     * The fixed price charged for this reserved node.
     * </p>
     */
    private Double fixedPrice;
    /**
     * <p>
     * The offering type of this reserved node.
     * </p>
     */
    private String offeringType;
    /**
     * <p>
     * The recurring price charged to run this reserved node.
     * </p>
     */
    private java.util.List<RecurringCharge> recurringCharges;

    /**
     * <p>
     * The offering identifier.
     * </p>
     * 
     * @param reservedNodesOfferingId
     *        The offering identifier.
     */

    public void setReservedNodesOfferingId(String reservedNodesOfferingId) {
        this.reservedNodesOfferingId = reservedNodesOfferingId;
    }

    /**
     * <p>
     * The offering identifier.
     * </p>
     * 
     * @return The offering identifier.
     */

    public String getReservedNodesOfferingId() {
        return this.reservedNodesOfferingId;
    }

    /**
     * <p>
     * The offering identifier.
     * </p>
     * 
     * @param reservedNodesOfferingId
     *        The offering identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNodesOffering withReservedNodesOfferingId(String reservedNodesOfferingId) {
        setReservedNodesOfferingId(reservedNodesOfferingId);
        return this;
    }

    /**
     * <p>
     * The node type for the reserved nodes. For more information, see <a
     * href="https://docs.aws.amazon.com/memorydb/latest/devguide/nodes.reserved.html#reserved-nodes-supported"
     * >Supported node types</a>.
     * </p>
     * 
     * @param nodeType
     *        The node type for the reserved nodes. For more information, see <a
     *        href="https://docs.aws.amazon.com/memorydb/latest/devguide/nodes.reserved.html#reserved-nodes-supported"
     *        >Supported node types</a>.
     */

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * <p>
     * The node type for the reserved nodes. For more information, see <a
     * href="https://docs.aws.amazon.com/memorydb/latest/devguide/nodes.reserved.html#reserved-nodes-supported"
     * >Supported node types</a>.
     * </p>
     * 
     * @return The node type for the reserved nodes. For more information, see <a
     *         href="https://docs.aws.amazon.com/memorydb/latest/devguide/nodes.reserved.html#reserved-nodes-supported"
     *         >Supported node types</a>.
     */

    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * <p>
     * The node type for the reserved nodes. For more information, see <a
     * href="https://docs.aws.amazon.com/memorydb/latest/devguide/nodes.reserved.html#reserved-nodes-supported"
     * >Supported node types</a>.
     * </p>
     * 
     * @param nodeType
     *        The node type for the reserved nodes. For more information, see <a
     *        href="https://docs.aws.amazon.com/memorydb/latest/devguide/nodes.reserved.html#reserved-nodes-supported"
     *        >Supported node types</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNodesOffering withNodeType(String nodeType) {
        setNodeType(nodeType);
        return this;
    }

    /**
     * <p>
     * The duration of the reservation in seconds.
     * </p>
     * 
     * @param duration
     *        The duration of the reservation in seconds.
     */

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The duration of the reservation in seconds.
     * </p>
     * 
     * @return The duration of the reservation in seconds.
     */

    public Integer getDuration() {
        return this.duration;
    }

    /**
     * <p>
     * The duration of the reservation in seconds.
     * </p>
     * 
     * @param duration
     *        The duration of the reservation in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNodesOffering withDuration(Integer duration) {
        setDuration(duration);
        return this;
    }

    /**
     * <p>
     * The fixed price charged for this reserved node.
     * </p>
     * 
     * @param fixedPrice
     *        The fixed price charged for this reserved node.
     */

    public void setFixedPrice(Double fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    /**
     * <p>
     * The fixed price charged for this reserved node.
     * </p>
     * 
     * @return The fixed price charged for this reserved node.
     */

    public Double getFixedPrice() {
        return this.fixedPrice;
    }

    /**
     * <p>
     * The fixed price charged for this reserved node.
     * </p>
     * 
     * @param fixedPrice
     *        The fixed price charged for this reserved node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNodesOffering withFixedPrice(Double fixedPrice) {
        setFixedPrice(fixedPrice);
        return this;
    }

    /**
     * <p>
     * The offering type of this reserved node.
     * </p>
     * 
     * @param offeringType
     *        The offering type of this reserved node.
     */

    public void setOfferingType(String offeringType) {
        this.offeringType = offeringType;
    }

    /**
     * <p>
     * The offering type of this reserved node.
     * </p>
     * 
     * @return The offering type of this reserved node.
     */

    public String getOfferingType() {
        return this.offeringType;
    }

    /**
     * <p>
     * The offering type of this reserved node.
     * </p>
     * 
     * @param offeringType
     *        The offering type of this reserved node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNodesOffering withOfferingType(String offeringType) {
        setOfferingType(offeringType);
        return this;
    }

    /**
     * <p>
     * The recurring price charged to run this reserved node.
     * </p>
     * 
     * @return The recurring price charged to run this reserved node.
     */

    public java.util.List<RecurringCharge> getRecurringCharges() {
        return recurringCharges;
    }

    /**
     * <p>
     * The recurring price charged to run this reserved node.
     * </p>
     * 
     * @param recurringCharges
     *        The recurring price charged to run this reserved node.
     */

    public void setRecurringCharges(java.util.Collection<RecurringCharge> recurringCharges) {
        if (recurringCharges == null) {
            this.recurringCharges = null;
            return;
        }

        this.recurringCharges = new java.util.ArrayList<RecurringCharge>(recurringCharges);
    }

    /**
     * <p>
     * The recurring price charged to run this reserved node.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecurringCharges(java.util.Collection)} or {@link #withRecurringCharges(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param recurringCharges
     *        The recurring price charged to run this reserved node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNodesOffering withRecurringCharges(RecurringCharge... recurringCharges) {
        if (this.recurringCharges == null) {
            setRecurringCharges(new java.util.ArrayList<RecurringCharge>(recurringCharges.length));
        }
        for (RecurringCharge ele : recurringCharges) {
            this.recurringCharges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The recurring price charged to run this reserved node.
     * </p>
     * 
     * @param recurringCharges
     *        The recurring price charged to run this reserved node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReservedNodesOffering withRecurringCharges(java.util.Collection<RecurringCharge> recurringCharges) {
        setRecurringCharges(recurringCharges);
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
        if (getReservedNodesOfferingId() != null)
            sb.append("ReservedNodesOfferingId: ").append(getReservedNodesOfferingId()).append(",");
        if (getNodeType() != null)
            sb.append("NodeType: ").append(getNodeType()).append(",");
        if (getDuration() != null)
            sb.append("Duration: ").append(getDuration()).append(",");
        if (getFixedPrice() != null)
            sb.append("FixedPrice: ").append(getFixedPrice()).append(",");
        if (getOfferingType() != null)
            sb.append("OfferingType: ").append(getOfferingType()).append(",");
        if (getRecurringCharges() != null)
            sb.append("RecurringCharges: ").append(getRecurringCharges());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservedNodesOffering == false)
            return false;
        ReservedNodesOffering other = (ReservedNodesOffering) obj;
        if (other.getReservedNodesOfferingId() == null ^ this.getReservedNodesOfferingId() == null)
            return false;
        if (other.getReservedNodesOfferingId() != null && other.getReservedNodesOfferingId().equals(this.getReservedNodesOfferingId()) == false)
            return false;
        if (other.getNodeType() == null ^ this.getNodeType() == null)
            return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getFixedPrice() == null ^ this.getFixedPrice() == null)
            return false;
        if (other.getFixedPrice() != null && other.getFixedPrice().equals(this.getFixedPrice()) == false)
            return false;
        if (other.getOfferingType() == null ^ this.getOfferingType() == null)
            return false;
        if (other.getOfferingType() != null && other.getOfferingType().equals(this.getOfferingType()) == false)
            return false;
        if (other.getRecurringCharges() == null ^ this.getRecurringCharges() == null)
            return false;
        if (other.getRecurringCharges() != null && other.getRecurringCharges().equals(this.getRecurringCharges()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReservedNodesOfferingId() == null) ? 0 : getReservedNodesOfferingId().hashCode());
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getFixedPrice() == null) ? 0 : getFixedPrice().hashCode());
        hashCode = prime * hashCode + ((getOfferingType() == null) ? 0 : getOfferingType().hashCode());
        hashCode = prime * hashCode + ((getRecurringCharges() == null) ? 0 : getRecurringCharges().hashCode());
        return hashCode;
    }

    @Override
    public ReservedNodesOffering clone() {
        try {
            return (ReservedNodesOffering) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.memorydb.model.transform.ReservedNodesOfferingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
