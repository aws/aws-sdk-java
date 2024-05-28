/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.marketplaceagreement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Within the pay-as-you-go model defined under <code>UsageBasedPricingTerm</code>, the
 * <code>UsageBasedRateCardItem</code> defines an individual rate for a product dimension.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-agreement-2020-03-01/UsageBasedRateCardItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UsageBasedRateCardItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines the per unit rates for product dimensions.
     * </p>
     */
    private java.util.List<RateCardItem> rateCard;

    /**
     * <p>
     * Defines the per unit rates for product dimensions.
     * </p>
     * 
     * @return Defines the per unit rates for product dimensions.
     */

    public java.util.List<RateCardItem> getRateCard() {
        return rateCard;
    }

    /**
     * <p>
     * Defines the per unit rates for product dimensions.
     * </p>
     * 
     * @param rateCard
     *        Defines the per unit rates for product dimensions.
     */

    public void setRateCard(java.util.Collection<RateCardItem> rateCard) {
        if (rateCard == null) {
            this.rateCard = null;
            return;
        }

        this.rateCard = new java.util.ArrayList<RateCardItem>(rateCard);
    }

    /**
     * <p>
     * Defines the per unit rates for product dimensions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRateCard(java.util.Collection)} or {@link #withRateCard(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param rateCard
     *        Defines the per unit rates for product dimensions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageBasedRateCardItem withRateCard(RateCardItem... rateCard) {
        if (this.rateCard == null) {
            setRateCard(new java.util.ArrayList<RateCardItem>(rateCard.length));
        }
        for (RateCardItem ele : rateCard) {
            this.rateCard.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Defines the per unit rates for product dimensions.
     * </p>
     * 
     * @param rateCard
     *        Defines the per unit rates for product dimensions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageBasedRateCardItem withRateCard(java.util.Collection<RateCardItem> rateCard) {
        setRateCard(rateCard);
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
        if (getRateCard() != null)
            sb.append("RateCard: ").append(getRateCard());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UsageBasedRateCardItem == false)
            return false;
        UsageBasedRateCardItem other = (UsageBasedRateCardItem) obj;
        if (other.getRateCard() == null ^ this.getRateCard() == null)
            return false;
        if (other.getRateCard() != null && other.getRateCard().equals(this.getRateCard()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRateCard() == null) ? 0 : getRateCard().hashCode());
        return hashCode;
    }

    @Override
    public UsageBasedRateCardItem clone() {
        try {
            return (UsageBasedRateCardItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplaceagreement.model.transform.UsageBasedRateCardItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
