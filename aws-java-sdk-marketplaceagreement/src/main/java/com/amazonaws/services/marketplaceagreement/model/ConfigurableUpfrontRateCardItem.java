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
 * Within the prepaid payment model defined under <code>ConfigurableUpfrontPricingTerm</code>, the
 * <code>RateCardItem</code> defines all the various rate cards (including pricing and dimensions) that have been
 * proposed.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-agreement-2020-03-01/ConfigurableUpfrontRateCardItem"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigurableUpfrontRateCardItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Defines limits on how the term can be configured by acceptors.
     * </p>
     */
    private Constraints constraints;
    /**
     * <p>
     * Defines the per unit rates for product dimensions.
     * </p>
     */
    private java.util.List<RateCardItem> rateCard;
    /**
     * <p>
     * Differentiates between the mutually exclusive rate cards in the same pricing term to be selected by the buyer.
     * </p>
     */
    private Selector selector;

    /**
     * <p>
     * Defines limits on how the term can be configured by acceptors.
     * </p>
     * 
     * @param constraints
     *        Defines limits on how the term can be configured by acceptors.
     */

    public void setConstraints(Constraints constraints) {
        this.constraints = constraints;
    }

    /**
     * <p>
     * Defines limits on how the term can be configured by acceptors.
     * </p>
     * 
     * @return Defines limits on how the term can be configured by acceptors.
     */

    public Constraints getConstraints() {
        return this.constraints;
    }

    /**
     * <p>
     * Defines limits on how the term can be configured by acceptors.
     * </p>
     * 
     * @param constraints
     *        Defines limits on how the term can be configured by acceptors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurableUpfrontRateCardItem withConstraints(Constraints constraints) {
        setConstraints(constraints);
        return this;
    }

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

    public ConfigurableUpfrontRateCardItem withRateCard(RateCardItem... rateCard) {
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

    public ConfigurableUpfrontRateCardItem withRateCard(java.util.Collection<RateCardItem> rateCard) {
        setRateCard(rateCard);
        return this;
    }

    /**
     * <p>
     * Differentiates between the mutually exclusive rate cards in the same pricing term to be selected by the buyer.
     * </p>
     * 
     * @param selector
     *        Differentiates between the mutually exclusive rate cards in the same pricing term to be selected by the
     *        buyer.
     */

    public void setSelector(Selector selector) {
        this.selector = selector;
    }

    /**
     * <p>
     * Differentiates between the mutually exclusive rate cards in the same pricing term to be selected by the buyer.
     * </p>
     * 
     * @return Differentiates between the mutually exclusive rate cards in the same pricing term to be selected by the
     *         buyer.
     */

    public Selector getSelector() {
        return this.selector;
    }

    /**
     * <p>
     * Differentiates between the mutually exclusive rate cards in the same pricing term to be selected by the buyer.
     * </p>
     * 
     * @param selector
     *        Differentiates between the mutually exclusive rate cards in the same pricing term to be selected by the
     *        buyer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurableUpfrontRateCardItem withSelector(Selector selector) {
        setSelector(selector);
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
        if (getConstraints() != null)
            sb.append("Constraints: ").append(getConstraints()).append(",");
        if (getRateCard() != null)
            sb.append("RateCard: ").append(getRateCard()).append(",");
        if (getSelector() != null)
            sb.append("Selector: ").append(getSelector());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigurableUpfrontRateCardItem == false)
            return false;
        ConfigurableUpfrontRateCardItem other = (ConfigurableUpfrontRateCardItem) obj;
        if (other.getConstraints() == null ^ this.getConstraints() == null)
            return false;
        if (other.getConstraints() != null && other.getConstraints().equals(this.getConstraints()) == false)
            return false;
        if (other.getRateCard() == null ^ this.getRateCard() == null)
            return false;
        if (other.getRateCard() != null && other.getRateCard().equals(this.getRateCard()) == false)
            return false;
        if (other.getSelector() == null ^ this.getSelector() == null)
            return false;
        if (other.getSelector() != null && other.getSelector().equals(this.getSelector()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConstraints() == null) ? 0 : getConstraints().hashCode());
        hashCode = prime * hashCode + ((getRateCard() == null) ? 0 : getRateCard().hashCode());
        hashCode = prime * hashCode + ((getSelector() == null) ? 0 : getSelector().hashCode());
        return hashCode;
    }

    @Override
    public ConfigurableUpfrontRateCardItem clone() {
        try {
            return (ConfigurableUpfrontRateCardItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplaceagreement.model.transform.ConfigurableUpfrontRateCardItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
