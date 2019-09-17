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

/**
 * <p>
 * Represents the output of a <code>PurchaseReservedElasticsearchInstanceOffering</code> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PurchaseReservedElasticsearchInstanceOfferingResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * Details of the reserved Elasticsearch instance which was purchased.
     * </p>
     */
    private String reservedElasticsearchInstanceId;
    /**
     * <p>
     * The customer-specified identifier used to track this reservation.
     * </p>
     */
    private String reservationName;

    /**
     * <p>
     * Details of the reserved Elasticsearch instance which was purchased.
     * </p>
     * 
     * @param reservedElasticsearchInstanceId
     *        Details of the reserved Elasticsearch instance which was purchased.
     */

    public void setReservedElasticsearchInstanceId(String reservedElasticsearchInstanceId) {
        this.reservedElasticsearchInstanceId = reservedElasticsearchInstanceId;
    }

    /**
     * <p>
     * Details of the reserved Elasticsearch instance which was purchased.
     * </p>
     * 
     * @return Details of the reserved Elasticsearch instance which was purchased.
     */

    public String getReservedElasticsearchInstanceId() {
        return this.reservedElasticsearchInstanceId;
    }

    /**
     * <p>
     * Details of the reserved Elasticsearch instance which was purchased.
     * </p>
     * 
     * @param reservedElasticsearchInstanceId
     *        Details of the reserved Elasticsearch instance which was purchased.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseReservedElasticsearchInstanceOfferingResult withReservedElasticsearchInstanceId(String reservedElasticsearchInstanceId) {
        setReservedElasticsearchInstanceId(reservedElasticsearchInstanceId);
        return this;
    }

    /**
     * <p>
     * The customer-specified identifier used to track this reservation.
     * </p>
     * 
     * @param reservationName
     *        The customer-specified identifier used to track this reservation.
     */

    public void setReservationName(String reservationName) {
        this.reservationName = reservationName;
    }

    /**
     * <p>
     * The customer-specified identifier used to track this reservation.
     * </p>
     * 
     * @return The customer-specified identifier used to track this reservation.
     */

    public String getReservationName() {
        return this.reservationName;
    }

    /**
     * <p>
     * The customer-specified identifier used to track this reservation.
     * </p>
     * 
     * @param reservationName
     *        The customer-specified identifier used to track this reservation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseReservedElasticsearchInstanceOfferingResult withReservationName(String reservationName) {
        setReservationName(reservationName);
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
        if (getReservedElasticsearchInstanceId() != null)
            sb.append("ReservedElasticsearchInstanceId: ").append(getReservedElasticsearchInstanceId()).append(",");
        if (getReservationName() != null)
            sb.append("ReservationName: ").append(getReservationName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PurchaseReservedElasticsearchInstanceOfferingResult == false)
            return false;
        PurchaseReservedElasticsearchInstanceOfferingResult other = (PurchaseReservedElasticsearchInstanceOfferingResult) obj;
        if (other.getReservedElasticsearchInstanceId() == null ^ this.getReservedElasticsearchInstanceId() == null)
            return false;
        if (other.getReservedElasticsearchInstanceId() != null
                && other.getReservedElasticsearchInstanceId().equals(this.getReservedElasticsearchInstanceId()) == false)
            return false;
        if (other.getReservationName() == null ^ this.getReservationName() == null)
            return false;
        if (other.getReservationName() != null && other.getReservationName().equals(this.getReservationName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReservedElasticsearchInstanceId() == null) ? 0 : getReservedElasticsearchInstanceId().hashCode());
        hashCode = prime * hashCode + ((getReservationName() == null) ? 0 : getReservationName().hashCode());
        return hashCode;
    }

    @Override
    public PurchaseReservedElasticsearchInstanceOfferingResult clone() {
        try {
            return (PurchaseReservedElasticsearchInstanceOfferingResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
