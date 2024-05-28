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
 * Defines a prepaid payment model that allows buyers to configure the entitlements they want to purchase and the
 * duration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-agreement-2020-03-01/ConfigurableUpfrontPricingTerm"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigurableUpfrontPricingTerm implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Additional parameters specified by the acceptor while accepting the term.
     * </p>
     */
    private ConfigurableUpfrontPricingTermConfiguration configuration;
    /**
     * <p>
     * Defines the currency for the prices mentioned in the term.
     * </p>
     */
    private String currencyCode;
    /**
     * <p>
     * A rate card defines the per unit rates for product dimensions.
     * </p>
     */
    private java.util.List<ConfigurableUpfrontRateCardItem> rateCards;
    /**
     * <p>
     * Category of selector.
     * </p>
     */
    private String type;

    /**
     * <p>
     * Additional parameters specified by the acceptor while accepting the term.
     * </p>
     * 
     * @param configuration
     *        Additional parameters specified by the acceptor while accepting the term.
     */

    public void setConfiguration(ConfigurableUpfrontPricingTermConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * Additional parameters specified by the acceptor while accepting the term.
     * </p>
     * 
     * @return Additional parameters specified by the acceptor while accepting the term.
     */

    public ConfigurableUpfrontPricingTermConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * Additional parameters specified by the acceptor while accepting the term.
     * </p>
     * 
     * @param configuration
     *        Additional parameters specified by the acceptor while accepting the term.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurableUpfrontPricingTerm withConfiguration(ConfigurableUpfrontPricingTermConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * Defines the currency for the prices mentioned in the term.
     * </p>
     * 
     * @param currencyCode
     *        Defines the currency for the prices mentioned in the term.
     */

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * <p>
     * Defines the currency for the prices mentioned in the term.
     * </p>
     * 
     * @return Defines the currency for the prices mentioned in the term.
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * <p>
     * Defines the currency for the prices mentioned in the term.
     * </p>
     * 
     * @param currencyCode
     *        Defines the currency for the prices mentioned in the term.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurableUpfrontPricingTerm withCurrencyCode(String currencyCode) {
        setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * <p>
     * A rate card defines the per unit rates for product dimensions.
     * </p>
     * 
     * @return A rate card defines the per unit rates for product dimensions.
     */

    public java.util.List<ConfigurableUpfrontRateCardItem> getRateCards() {
        return rateCards;
    }

    /**
     * <p>
     * A rate card defines the per unit rates for product dimensions.
     * </p>
     * 
     * @param rateCards
     *        A rate card defines the per unit rates for product dimensions.
     */

    public void setRateCards(java.util.Collection<ConfigurableUpfrontRateCardItem> rateCards) {
        if (rateCards == null) {
            this.rateCards = null;
            return;
        }

        this.rateCards = new java.util.ArrayList<ConfigurableUpfrontRateCardItem>(rateCards);
    }

    /**
     * <p>
     * A rate card defines the per unit rates for product dimensions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRateCards(java.util.Collection)} or {@link #withRateCards(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param rateCards
     *        A rate card defines the per unit rates for product dimensions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurableUpfrontPricingTerm withRateCards(ConfigurableUpfrontRateCardItem... rateCards) {
        if (this.rateCards == null) {
            setRateCards(new java.util.ArrayList<ConfigurableUpfrontRateCardItem>(rateCards.length));
        }
        for (ConfigurableUpfrontRateCardItem ele : rateCards) {
            this.rateCards.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A rate card defines the per unit rates for product dimensions.
     * </p>
     * 
     * @param rateCards
     *        A rate card defines the per unit rates for product dimensions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurableUpfrontPricingTerm withRateCards(java.util.Collection<ConfigurableUpfrontRateCardItem> rateCards) {
        setRateCards(rateCards);
        return this;
    }

    /**
     * <p>
     * Category of selector.
     * </p>
     * 
     * @param type
     *        Category of selector.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Category of selector.
     * </p>
     * 
     * @return Category of selector.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Category of selector.
     * </p>
     * 
     * @param type
     *        Category of selector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfigurableUpfrontPricingTerm withType(String type) {
        setType(type);
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
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getCurrencyCode() != null)
            sb.append("CurrencyCode: ").append(getCurrencyCode()).append(",");
        if (getRateCards() != null)
            sb.append("RateCards: ").append(getRateCards()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigurableUpfrontPricingTerm == false)
            return false;
        ConfigurableUpfrontPricingTerm other = (ConfigurableUpfrontPricingTerm) obj;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getCurrencyCode() == null ^ this.getCurrencyCode() == null)
            return false;
        if (other.getCurrencyCode() != null && other.getCurrencyCode().equals(this.getCurrencyCode()) == false)
            return false;
        if (other.getRateCards() == null ^ this.getRateCards() == null)
            return false;
        if (other.getRateCards() != null && other.getRateCards().equals(this.getRateCards()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCurrencyCode() == null) ? 0 : getCurrencyCode().hashCode());
        hashCode = prime * hashCode + ((getRateCards() == null) ? 0 : getRateCards().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public ConfigurableUpfrontPricingTerm clone() {
        try {
            return (ConfigurableUpfrontPricingTerm) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplaceagreement.model.transform.ConfigurableUpfrontPricingTermMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
