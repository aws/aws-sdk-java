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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the metadata of an offering transaction.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/OfferingTransaction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OfferingTransaction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status of an offering transaction.
     * </p>
     */
    private OfferingStatus offeringStatus;
    /**
     * <p>
     * The transaction ID of the offering transaction.
     * </p>
     */
    private String transactionId;
    /**
     * <p>
     * The ID that corresponds to a device offering promotion.
     * </p>
     */
    private String offeringPromotionId;
    /**
     * <p>
     * The date on which an offering transaction was created.
     * </p>
     */
    private java.util.Date createdOn;
    /**
     * <p>
     * The cost of an offering transaction.
     * </p>
     */
    private MonetaryAmount cost;

    /**
     * <p>
     * The status of an offering transaction.
     * </p>
     * 
     * @param offeringStatus
     *        The status of an offering transaction.
     */

    public void setOfferingStatus(OfferingStatus offeringStatus) {
        this.offeringStatus = offeringStatus;
    }

    /**
     * <p>
     * The status of an offering transaction.
     * </p>
     * 
     * @return The status of an offering transaction.
     */

    public OfferingStatus getOfferingStatus() {
        return this.offeringStatus;
    }

    /**
     * <p>
     * The status of an offering transaction.
     * </p>
     * 
     * @param offeringStatus
     *        The status of an offering transaction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OfferingTransaction withOfferingStatus(OfferingStatus offeringStatus) {
        setOfferingStatus(offeringStatus);
        return this;
    }

    /**
     * <p>
     * The transaction ID of the offering transaction.
     * </p>
     * 
     * @param transactionId
     *        The transaction ID of the offering transaction.
     */

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * <p>
     * The transaction ID of the offering transaction.
     * </p>
     * 
     * @return The transaction ID of the offering transaction.
     */

    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     * <p>
     * The transaction ID of the offering transaction.
     * </p>
     * 
     * @param transactionId
     *        The transaction ID of the offering transaction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OfferingTransaction withTransactionId(String transactionId) {
        setTransactionId(transactionId);
        return this;
    }

    /**
     * <p>
     * The ID that corresponds to a device offering promotion.
     * </p>
     * 
     * @param offeringPromotionId
     *        The ID that corresponds to a device offering promotion.
     */

    public void setOfferingPromotionId(String offeringPromotionId) {
        this.offeringPromotionId = offeringPromotionId;
    }

    /**
     * <p>
     * The ID that corresponds to a device offering promotion.
     * </p>
     * 
     * @return The ID that corresponds to a device offering promotion.
     */

    public String getOfferingPromotionId() {
        return this.offeringPromotionId;
    }

    /**
     * <p>
     * The ID that corresponds to a device offering promotion.
     * </p>
     * 
     * @param offeringPromotionId
     *        The ID that corresponds to a device offering promotion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OfferingTransaction withOfferingPromotionId(String offeringPromotionId) {
        setOfferingPromotionId(offeringPromotionId);
        return this;
    }

    /**
     * <p>
     * The date on which an offering transaction was created.
     * </p>
     * 
     * @param createdOn
     *        The date on which an offering transaction was created.
     */

    public void setCreatedOn(java.util.Date createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * <p>
     * The date on which an offering transaction was created.
     * </p>
     * 
     * @return The date on which an offering transaction was created.
     */

    public java.util.Date getCreatedOn() {
        return this.createdOn;
    }

    /**
     * <p>
     * The date on which an offering transaction was created.
     * </p>
     * 
     * @param createdOn
     *        The date on which an offering transaction was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OfferingTransaction withCreatedOn(java.util.Date createdOn) {
        setCreatedOn(createdOn);
        return this;
    }

    /**
     * <p>
     * The cost of an offering transaction.
     * </p>
     * 
     * @param cost
     *        The cost of an offering transaction.
     */

    public void setCost(MonetaryAmount cost) {
        this.cost = cost;
    }

    /**
     * <p>
     * The cost of an offering transaction.
     * </p>
     * 
     * @return The cost of an offering transaction.
     */

    public MonetaryAmount getCost() {
        return this.cost;
    }

    /**
     * <p>
     * The cost of an offering transaction.
     * </p>
     * 
     * @param cost
     *        The cost of an offering transaction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OfferingTransaction withCost(MonetaryAmount cost) {
        setCost(cost);
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
        if (getOfferingStatus() != null)
            sb.append("OfferingStatus: ").append(getOfferingStatus()).append(",");
        if (getTransactionId() != null)
            sb.append("TransactionId: ").append(getTransactionId()).append(",");
        if (getOfferingPromotionId() != null)
            sb.append("OfferingPromotionId: ").append(getOfferingPromotionId()).append(",");
        if (getCreatedOn() != null)
            sb.append("CreatedOn: ").append(getCreatedOn()).append(",");
        if (getCost() != null)
            sb.append("Cost: ").append(getCost());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OfferingTransaction == false)
            return false;
        OfferingTransaction other = (OfferingTransaction) obj;
        if (other.getOfferingStatus() == null ^ this.getOfferingStatus() == null)
            return false;
        if (other.getOfferingStatus() != null && other.getOfferingStatus().equals(this.getOfferingStatus()) == false)
            return false;
        if (other.getTransactionId() == null ^ this.getTransactionId() == null)
            return false;
        if (other.getTransactionId() != null && other.getTransactionId().equals(this.getTransactionId()) == false)
            return false;
        if (other.getOfferingPromotionId() == null ^ this.getOfferingPromotionId() == null)
            return false;
        if (other.getOfferingPromotionId() != null && other.getOfferingPromotionId().equals(this.getOfferingPromotionId()) == false)
            return false;
        if (other.getCreatedOn() == null ^ this.getCreatedOn() == null)
            return false;
        if (other.getCreatedOn() != null && other.getCreatedOn().equals(this.getCreatedOn()) == false)
            return false;
        if (other.getCost() == null ^ this.getCost() == null)
            return false;
        if (other.getCost() != null && other.getCost().equals(this.getCost()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOfferingStatus() == null) ? 0 : getOfferingStatus().hashCode());
        hashCode = prime * hashCode + ((getTransactionId() == null) ? 0 : getTransactionId().hashCode());
        hashCode = prime * hashCode + ((getOfferingPromotionId() == null) ? 0 : getOfferingPromotionId().hashCode());
        hashCode = prime * hashCode + ((getCreatedOn() == null) ? 0 : getCreatedOn().hashCode());
        hashCode = prime * hashCode + ((getCost() == null) ? 0 : getCost().hashCode());
        return hashCode;
    }

    @Override
    public OfferingTransaction clone() {
        try {
            return (OfferingTransaction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devicefarm.model.transform.OfferingTransactionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
