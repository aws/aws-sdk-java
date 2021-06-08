/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a <code>PurchaseReservedCacheNodesOffering</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/PurchaseReservedCacheNodesOffering"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PurchaseReservedCacheNodesOfferingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the reserved cache node offering to purchase.
     * </p>
     * <p>
     * Example: <code>438012d3-4052-4cc7-b2e3-8d3372e0e706</code>
     * </p>
     */
    private String reservedCacheNodesOfferingId;
    /**
     * <p>
     * A customer-specified identifier to track this reservation.
     * </p>
     * <note>
     * <p>
     * The Reserved Cache Node ID is an unique customer-specified identifier to track this reservation. If this
     * parameter is not specified, ElastiCache automatically generates an identifier for the reservation.
     * </p>
     * </note>
     * <p>
     * Example: myreservationID
     * </p>
     */
    private String reservedCacheNodeId;
    /**
     * <p>
     * The number of cache node instances to reserve.
     * </p>
     * <p>
     * Default: <code>1</code>
     * </p>
     */
    private Integer cacheNodeCount;
    /**
     * <p>
     * A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a tag
     * value, although null is accepted.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The ID of the reserved cache node offering to purchase.
     * </p>
     * <p>
     * Example: <code>438012d3-4052-4cc7-b2e3-8d3372e0e706</code>
     * </p>
     * 
     * @param reservedCacheNodesOfferingId
     *        The ID of the reserved cache node offering to purchase.</p>
     *        <p>
     *        Example: <code>438012d3-4052-4cc7-b2e3-8d3372e0e706</code>
     */

    public void setReservedCacheNodesOfferingId(String reservedCacheNodesOfferingId) {
        this.reservedCacheNodesOfferingId = reservedCacheNodesOfferingId;
    }

    /**
     * <p>
     * The ID of the reserved cache node offering to purchase.
     * </p>
     * <p>
     * Example: <code>438012d3-4052-4cc7-b2e3-8d3372e0e706</code>
     * </p>
     * 
     * @return The ID of the reserved cache node offering to purchase.</p>
     *         <p>
     *         Example: <code>438012d3-4052-4cc7-b2e3-8d3372e0e706</code>
     */

    public String getReservedCacheNodesOfferingId() {
        return this.reservedCacheNodesOfferingId;
    }

    /**
     * <p>
     * The ID of the reserved cache node offering to purchase.
     * </p>
     * <p>
     * Example: <code>438012d3-4052-4cc7-b2e3-8d3372e0e706</code>
     * </p>
     * 
     * @param reservedCacheNodesOfferingId
     *        The ID of the reserved cache node offering to purchase.</p>
     *        <p>
     *        Example: <code>438012d3-4052-4cc7-b2e3-8d3372e0e706</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseReservedCacheNodesOfferingRequest withReservedCacheNodesOfferingId(String reservedCacheNodesOfferingId) {
        setReservedCacheNodesOfferingId(reservedCacheNodesOfferingId);
        return this;
    }

    /**
     * <p>
     * A customer-specified identifier to track this reservation.
     * </p>
     * <note>
     * <p>
     * The Reserved Cache Node ID is an unique customer-specified identifier to track this reservation. If this
     * parameter is not specified, ElastiCache automatically generates an identifier for the reservation.
     * </p>
     * </note>
     * <p>
     * Example: myreservationID
     * </p>
     * 
     * @param reservedCacheNodeId
     *        A customer-specified identifier to track this reservation.</p> <note>
     *        <p>
     *        The Reserved Cache Node ID is an unique customer-specified identifier to track this reservation. If this
     *        parameter is not specified, ElastiCache automatically generates an identifier for the reservation.
     *        </p>
     *        </note>
     *        <p>
     *        Example: myreservationID
     */

    public void setReservedCacheNodeId(String reservedCacheNodeId) {
        this.reservedCacheNodeId = reservedCacheNodeId;
    }

    /**
     * <p>
     * A customer-specified identifier to track this reservation.
     * </p>
     * <note>
     * <p>
     * The Reserved Cache Node ID is an unique customer-specified identifier to track this reservation. If this
     * parameter is not specified, ElastiCache automatically generates an identifier for the reservation.
     * </p>
     * </note>
     * <p>
     * Example: myreservationID
     * </p>
     * 
     * @return A customer-specified identifier to track this reservation.</p> <note>
     *         <p>
     *         The Reserved Cache Node ID is an unique customer-specified identifier to track this reservation. If this
     *         parameter is not specified, ElastiCache automatically generates an identifier for the reservation.
     *         </p>
     *         </note>
     *         <p>
     *         Example: myreservationID
     */

    public String getReservedCacheNodeId() {
        return this.reservedCacheNodeId;
    }

    /**
     * <p>
     * A customer-specified identifier to track this reservation.
     * </p>
     * <note>
     * <p>
     * The Reserved Cache Node ID is an unique customer-specified identifier to track this reservation. If this
     * parameter is not specified, ElastiCache automatically generates an identifier for the reservation.
     * </p>
     * </note>
     * <p>
     * Example: myreservationID
     * </p>
     * 
     * @param reservedCacheNodeId
     *        A customer-specified identifier to track this reservation.</p> <note>
     *        <p>
     *        The Reserved Cache Node ID is an unique customer-specified identifier to track this reservation. If this
     *        parameter is not specified, ElastiCache automatically generates an identifier for the reservation.
     *        </p>
     *        </note>
     *        <p>
     *        Example: myreservationID
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseReservedCacheNodesOfferingRequest withReservedCacheNodeId(String reservedCacheNodeId) {
        setReservedCacheNodeId(reservedCacheNodeId);
        return this;
    }

    /**
     * <p>
     * The number of cache node instances to reserve.
     * </p>
     * <p>
     * Default: <code>1</code>
     * </p>
     * 
     * @param cacheNodeCount
     *        The number of cache node instances to reserve.</p>
     *        <p>
     *        Default: <code>1</code>
     */

    public void setCacheNodeCount(Integer cacheNodeCount) {
        this.cacheNodeCount = cacheNodeCount;
    }

    /**
     * <p>
     * The number of cache node instances to reserve.
     * </p>
     * <p>
     * Default: <code>1</code>
     * </p>
     * 
     * @return The number of cache node instances to reserve.</p>
     *         <p>
     *         Default: <code>1</code>
     */

    public Integer getCacheNodeCount() {
        return this.cacheNodeCount;
    }

    /**
     * <p>
     * The number of cache node instances to reserve.
     * </p>
     * <p>
     * Default: <code>1</code>
     * </p>
     * 
     * @param cacheNodeCount
     *        The number of cache node instances to reserve.</p>
     *        <p>
     *        Default: <code>1</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseReservedCacheNodesOfferingRequest withCacheNodeCount(Integer cacheNodeCount) {
        setCacheNodeCount(cacheNodeCount);
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
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
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

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
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

    public PurchaseReservedCacheNodesOfferingRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
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

    public PurchaseReservedCacheNodesOfferingRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getReservedCacheNodesOfferingId() != null)
            sb.append("ReservedCacheNodesOfferingId: ").append(getReservedCacheNodesOfferingId()).append(",");
        if (getReservedCacheNodeId() != null)
            sb.append("ReservedCacheNodeId: ").append(getReservedCacheNodeId()).append(",");
        if (getCacheNodeCount() != null)
            sb.append("CacheNodeCount: ").append(getCacheNodeCount()).append(",");
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

        if (obj instanceof PurchaseReservedCacheNodesOfferingRequest == false)
            return false;
        PurchaseReservedCacheNodesOfferingRequest other = (PurchaseReservedCacheNodesOfferingRequest) obj;
        if (other.getReservedCacheNodesOfferingId() == null ^ this.getReservedCacheNodesOfferingId() == null)
            return false;
        if (other.getReservedCacheNodesOfferingId() != null && other.getReservedCacheNodesOfferingId().equals(this.getReservedCacheNodesOfferingId()) == false)
            return false;
        if (other.getReservedCacheNodeId() == null ^ this.getReservedCacheNodeId() == null)
            return false;
        if (other.getReservedCacheNodeId() != null && other.getReservedCacheNodeId().equals(this.getReservedCacheNodeId()) == false)
            return false;
        if (other.getCacheNodeCount() == null ^ this.getCacheNodeCount() == null)
            return false;
        if (other.getCacheNodeCount() != null && other.getCacheNodeCount().equals(this.getCacheNodeCount()) == false)
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

        hashCode = prime * hashCode + ((getReservedCacheNodesOfferingId() == null) ? 0 : getReservedCacheNodesOfferingId().hashCode());
        hashCode = prime * hashCode + ((getReservedCacheNodeId() == null) ? 0 : getReservedCacheNodeId().hashCode());
        hashCode = prime * hashCode + ((getCacheNodeCount() == null) ? 0 : getCacheNodeCount().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public PurchaseReservedCacheNodesOfferingRequest clone() {
        return (PurchaseReservedCacheNodesOfferingRequest) super.clone();
    }

}
