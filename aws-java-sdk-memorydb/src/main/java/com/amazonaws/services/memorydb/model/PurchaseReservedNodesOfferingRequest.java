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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/PurchaseReservedNodesOffering"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PurchaseReservedNodesOfferingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the reserved node offering to purchase.
     * </p>
     */
    private String reservedNodesOfferingId;
    /**
     * <p>
     * A customer-specified identifier to track this reservation.
     * </p>
     */
    private String reservationId;
    /**
     * <p>
     * The number of node instances to reserve.
     * </p>
     */
    private Integer nodeCount;
    /**
     * <p>
     * A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a tag
     * value, although null is accepted.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ID of the reserved node offering to purchase.
     * </p>
     * 
     * @param reservedNodesOfferingId
     *        The ID of the reserved node offering to purchase.
     */

    public void setReservedNodesOfferingId(String reservedNodesOfferingId) {
        this.reservedNodesOfferingId = reservedNodesOfferingId;
    }

    /**
     * <p>
     * The ID of the reserved node offering to purchase.
     * </p>
     * 
     * @return The ID of the reserved node offering to purchase.
     */

    public String getReservedNodesOfferingId() {
        return this.reservedNodesOfferingId;
    }

    /**
     * <p>
     * The ID of the reserved node offering to purchase.
     * </p>
     * 
     * @param reservedNodesOfferingId
     *        The ID of the reserved node offering to purchase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseReservedNodesOfferingRequest withReservedNodesOfferingId(String reservedNodesOfferingId) {
        setReservedNodesOfferingId(reservedNodesOfferingId);
        return this;
    }

    /**
     * <p>
     * A customer-specified identifier to track this reservation.
     * </p>
     * 
     * @param reservationId
     *        A customer-specified identifier to track this reservation.
     */

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    /**
     * <p>
     * A customer-specified identifier to track this reservation.
     * </p>
     * 
     * @return A customer-specified identifier to track this reservation.
     */

    public String getReservationId() {
        return this.reservationId;
    }

    /**
     * <p>
     * A customer-specified identifier to track this reservation.
     * </p>
     * 
     * @param reservationId
     *        A customer-specified identifier to track this reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseReservedNodesOfferingRequest withReservationId(String reservationId) {
        setReservationId(reservationId);
        return this;
    }

    /**
     * <p>
     * The number of node instances to reserve.
     * </p>
     * 
     * @param nodeCount
     *        The number of node instances to reserve.
     */

    public void setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
    }

    /**
     * <p>
     * The number of node instances to reserve.
     * </p>
     * 
     * @return The number of node instances to reserve.
     */

    public Integer getNodeCount() {
        return this.nodeCount;
    }

    /**
     * <p>
     * The number of node instances to reserve.
     * </p>
     * 
     * @param nodeCount
     *        The number of node instances to reserve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseReservedNodesOfferingRequest withNodeCount(Integer nodeCount) {
        setNodeCount(nodeCount);
        return this;
    }

    /**
     * <p>
     * A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a tag
     * value, although null is accepted.
     * </p>
     * 
     * @return A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by
     *         a tag value, although null is accepted.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a tag
     * value, although null is accepted.
     * </p>
     * 
     * @param tags
     *        A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a
     *        tag value, although null is accepted.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a tag
     * value, although null is accepted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a
     *        tag value, although null is accepted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseReservedNodesOfferingRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a tag
     * value, although null is accepted.
     * </p>
     * 
     * @param tags
     *        A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a
     *        tag value, although null is accepted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseReservedNodesOfferingRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getReservationId() != null)
            sb.append("ReservationId: ").append(getReservationId()).append(",");
        if (getNodeCount() != null)
            sb.append("NodeCount: ").append(getNodeCount()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PurchaseReservedNodesOfferingRequest == false)
            return false;
        PurchaseReservedNodesOfferingRequest other = (PurchaseReservedNodesOfferingRequest) obj;
        if (other.getReservedNodesOfferingId() == null ^ this.getReservedNodesOfferingId() == null)
            return false;
        if (other.getReservedNodesOfferingId() != null && other.getReservedNodesOfferingId().equals(this.getReservedNodesOfferingId()) == false)
            return false;
        if (other.getReservationId() == null ^ this.getReservationId() == null)
            return false;
        if (other.getReservationId() != null && other.getReservationId().equals(this.getReservationId()) == false)
            return false;
        if (other.getNodeCount() == null ^ this.getNodeCount() == null)
            return false;
        if (other.getNodeCount() != null && other.getNodeCount().equals(this.getNodeCount()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReservedNodesOfferingId() == null) ? 0 : getReservedNodesOfferingId().hashCode());
        hashCode = prime * hashCode + ((getReservationId() == null) ? 0 : getReservationId().hashCode());
        hashCode = prime * hashCode + ((getNodeCount() == null) ? 0 : getNodeCount().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public PurchaseReservedNodesOfferingRequest clone() {
        return (PurchaseReservedNodesOfferingRequest) super.clone();
    }

}
