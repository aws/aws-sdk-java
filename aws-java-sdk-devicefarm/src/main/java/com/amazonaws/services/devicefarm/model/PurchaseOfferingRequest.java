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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request for a purchase offering.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/PurchaseOffering" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PurchaseOfferingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the offering.
     * </p>
     */
    private String offeringId;
    /**
     * <p>
     * The number of device slots you wish to purchase in an offering request.
     * </p>
     */
    private Integer quantity;
    /**
     * <p>
     * The ID of the offering promotion to be applied to the purchase.
     * </p>
     */
    private String offeringPromotionId;

    /**
     * <p>
     * The ID of the offering.
     * </p>
     * 
     * @param offeringId
     *        The ID of the offering.
     */

    public void setOfferingId(String offeringId) {
        this.offeringId = offeringId;
    }

    /**
     * <p>
     * The ID of the offering.
     * </p>
     * 
     * @return The ID of the offering.
     */

    public String getOfferingId() {
        return this.offeringId;
    }

    /**
     * <p>
     * The ID of the offering.
     * </p>
     * 
     * @param offeringId
     *        The ID of the offering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseOfferingRequest withOfferingId(String offeringId) {
        setOfferingId(offeringId);
        return this;
    }

    /**
     * <p>
     * The number of device slots you wish to purchase in an offering request.
     * </p>
     * 
     * @param quantity
     *        The number of device slots you wish to purchase in an offering request.
     */

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * The number of device slots you wish to purchase in an offering request.
     * </p>
     * 
     * @return The number of device slots you wish to purchase in an offering request.
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * <p>
     * The number of device slots you wish to purchase in an offering request.
     * </p>
     * 
     * @param quantity
     *        The number of device slots you wish to purchase in an offering request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseOfferingRequest withQuantity(Integer quantity) {
        setQuantity(quantity);
        return this;
    }

    /**
     * <p>
     * The ID of the offering promotion to be applied to the purchase.
     * </p>
     * 
     * @param offeringPromotionId
     *        The ID of the offering promotion to be applied to the purchase.
     */

    public void setOfferingPromotionId(String offeringPromotionId) {
        this.offeringPromotionId = offeringPromotionId;
    }

    /**
     * <p>
     * The ID of the offering promotion to be applied to the purchase.
     * </p>
     * 
     * @return The ID of the offering promotion to be applied to the purchase.
     */

    public String getOfferingPromotionId() {
        return this.offeringPromotionId;
    }

    /**
     * <p>
     * The ID of the offering promotion to be applied to the purchase.
     * </p>
     * 
     * @param offeringPromotionId
     *        The ID of the offering promotion to be applied to the purchase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PurchaseOfferingRequest withOfferingPromotionId(String offeringPromotionId) {
        setOfferingPromotionId(offeringPromotionId);
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
        if (getOfferingId() != null)
            sb.append("OfferingId: ").append(getOfferingId()).append(",");
        if (getQuantity() != null)
            sb.append("Quantity: ").append(getQuantity()).append(",");
        if (getOfferingPromotionId() != null)
            sb.append("OfferingPromotionId: ").append(getOfferingPromotionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PurchaseOfferingRequest == false)
            return false;
        PurchaseOfferingRequest other = (PurchaseOfferingRequest) obj;
        if (other.getOfferingId() == null ^ this.getOfferingId() == null)
            return false;
        if (other.getOfferingId() != null && other.getOfferingId().equals(this.getOfferingId()) == false)
            return false;
        if (other.getQuantity() == null ^ this.getQuantity() == null)
            return false;
        if (other.getQuantity() != null && other.getQuantity().equals(this.getQuantity()) == false)
            return false;
        if (other.getOfferingPromotionId() == null ^ this.getOfferingPromotionId() == null)
            return false;
        if (other.getOfferingPromotionId() != null && other.getOfferingPromotionId().equals(this.getOfferingPromotionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOfferingId() == null) ? 0 : getOfferingId().hashCode());
        hashCode = prime * hashCode + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        hashCode = prime * hashCode + ((getOfferingPromotionId() == null) ? 0 : getOfferingPromotionId().hashCode());
        return hashCode;
    }

    @Override
    public PurchaseOfferingRequest clone() {
        return (PurchaseOfferingRequest) super.clone();
    }

}
