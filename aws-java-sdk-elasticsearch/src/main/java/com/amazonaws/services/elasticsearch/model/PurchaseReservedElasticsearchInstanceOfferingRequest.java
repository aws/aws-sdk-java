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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Container for parameters to <code>PurchaseReservedElasticsearchInstanceOffering</code>
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PurchaseReservedElasticsearchInstanceOfferingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the reserved Elasticsearch instance offering to purchase.
     * </p>
     */
    private String reservedElasticsearchInstanceOfferingId;
    /**
     * <p>
     * A customer-specified identifier to track this reservation.
     * </p>
     */
    private String reservationName;
    /**
     * <p>
     * The number of Elasticsearch instances to reserve.
     * </p>
     */
    private Integer instanceCount;

    /**
     * <p>
     * The ID of the reserved Elasticsearch instance offering to purchase.
     * </p>
     * 
     * @param reservedElasticsearchInstanceOfferingId
     *        The ID of the reserved Elasticsearch instance offering to purchase.
     */

    public void setReservedElasticsearchInstanceOfferingId(String reservedElasticsearchInstanceOfferingId) {
        this.reservedElasticsearchInstanceOfferingId = reservedElasticsearchInstanceOfferingId;
    }

    /**
     * <p>
     * The ID of the reserved Elasticsearch instance offering to purchase.
     * </p>
     * 
     * @return The ID of the reserved Elasticsearch instance offering to purchase.
     */

    public String getReservedElasticsearchInstanceOfferingId() {
        return this.reservedElasticsearchInstanceOfferingId;
    }

    /**
     * <p>
     * The ID of the reserved Elasticsearch instance offering to purchase.
     * </p>
     * 
     * @param reservedElasticsearchInstanceOfferingId
     *        The ID of the reserved Elasticsearch instance offering to purchase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseReservedElasticsearchInstanceOfferingRequest withReservedElasticsearchInstanceOfferingId(String reservedElasticsearchInstanceOfferingId) {
        setReservedElasticsearchInstanceOfferingId(reservedElasticsearchInstanceOfferingId);
        return this;
    }

    /**
     * <p>
     * A customer-specified identifier to track this reservation.
     * </p>
     * 
     * @param reservationName
     *        A customer-specified identifier to track this reservation.
     */

    public void setReservationName(String reservationName) {
        this.reservationName = reservationName;
    }

    /**
     * <p>
     * A customer-specified identifier to track this reservation.
     * </p>
     * 
     * @return A customer-specified identifier to track this reservation.
     */

    public String getReservationName() {
        return this.reservationName;
    }

    /**
     * <p>
     * A customer-specified identifier to track this reservation.
     * </p>
     * 
     * @param reservationName
     *        A customer-specified identifier to track this reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseReservedElasticsearchInstanceOfferingRequest withReservationName(String reservationName) {
        setReservationName(reservationName);
        return this;
    }

    /**
     * <p>
     * The number of Elasticsearch instances to reserve.
     * </p>
     * 
     * @param instanceCount
     *        The number of Elasticsearch instances to reserve.
     */

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of Elasticsearch instances to reserve.
     * </p>
     * 
     * @return The number of Elasticsearch instances to reserve.
     */

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * The number of Elasticsearch instances to reserve.
     * </p>
     * 
     * @param instanceCount
     *        The number of Elasticsearch instances to reserve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseReservedElasticsearchInstanceOfferingRequest withInstanceCount(Integer instanceCount) {
        setInstanceCount(instanceCount);
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
        if (getReservedElasticsearchInstanceOfferingId() != null)
            sb.append("ReservedElasticsearchInstanceOfferingId: ").append(getReservedElasticsearchInstanceOfferingId()).append(",");
        if (getReservationName() != null)
            sb.append("ReservationName: ").append(getReservationName()).append(",");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: ").append(getInstanceCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PurchaseReservedElasticsearchInstanceOfferingRequest == false)
            return false;
        PurchaseReservedElasticsearchInstanceOfferingRequest other = (PurchaseReservedElasticsearchInstanceOfferingRequest) obj;
        if (other.getReservedElasticsearchInstanceOfferingId() == null ^ this.getReservedElasticsearchInstanceOfferingId() == null)
            return false;
        if (other.getReservedElasticsearchInstanceOfferingId() != null
                && other.getReservedElasticsearchInstanceOfferingId().equals(this.getReservedElasticsearchInstanceOfferingId()) == false)
            return false;
        if (other.getReservationName() == null ^ this.getReservationName() == null)
            return false;
        if (other.getReservationName() != null && other.getReservationName().equals(this.getReservationName()) == false)
            return false;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReservedElasticsearchInstanceOfferingId() == null) ? 0 : getReservedElasticsearchInstanceOfferingId().hashCode());
        hashCode = prime * hashCode + ((getReservationName() == null) ? 0 : getReservationName().hashCode());
        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        return hashCode;
    }

    @Override
    public PurchaseReservedElasticsearchInstanceOfferingRequest clone() {
        return (PurchaseReservedElasticsearchInstanceOfferingRequest) super.clone();
    }

}
