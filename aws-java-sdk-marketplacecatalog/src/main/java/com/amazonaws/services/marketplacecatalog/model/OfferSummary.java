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
package com.amazonaws.services.marketplacecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summarized information about an offer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/OfferSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OfferSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the offer.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The product ID of the offer.
     * </p>
     */
    private String productId;
    /**
     * <p>
     * The ResaleAuthorizationId of the offer.
     * </p>
     */
    private String resaleAuthorizationId;
    /**
     * <p>
     * The release date of the offer.
     * </p>
     */
    private String releaseDate;
    /**
     * <p>
     * The availability end date of the offer.
     * </p>
     */
    private String availabilityEndDate;
    /**
     * <p>
     * The buyer accounts in the offer.
     * </p>
     */
    private java.util.List<String> buyerAccounts;
    /**
     * <p>
     * The status of the offer.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The targeting in the offer.
     * </p>
     */
    private java.util.List<String> targeting;

    /**
     * <p>
     * The name of the offer.
     * </p>
     * 
     * @param name
     *        The name of the offer.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the offer.
     * </p>
     * 
     * @return The name of the offer.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the offer.
     * </p>
     * 
     * @param name
     *        The name of the offer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OfferSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The product ID of the offer.
     * </p>
     * 
     * @param productId
     *        The product ID of the offer.
     */

    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * <p>
     * The product ID of the offer.
     * </p>
     * 
     * @return The product ID of the offer.
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     * <p>
     * The product ID of the offer.
     * </p>
     * 
     * @param productId
     *        The product ID of the offer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OfferSummary withProductId(String productId) {
        setProductId(productId);
        return this;
    }

    /**
     * <p>
     * The ResaleAuthorizationId of the offer.
     * </p>
     * 
     * @param resaleAuthorizationId
     *        The ResaleAuthorizationId of the offer.
     */

    public void setResaleAuthorizationId(String resaleAuthorizationId) {
        this.resaleAuthorizationId = resaleAuthorizationId;
    }

    /**
     * <p>
     * The ResaleAuthorizationId of the offer.
     * </p>
     * 
     * @return The ResaleAuthorizationId of the offer.
     */

    public String getResaleAuthorizationId() {
        return this.resaleAuthorizationId;
    }

    /**
     * <p>
     * The ResaleAuthorizationId of the offer.
     * </p>
     * 
     * @param resaleAuthorizationId
     *        The ResaleAuthorizationId of the offer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OfferSummary withResaleAuthorizationId(String resaleAuthorizationId) {
        setResaleAuthorizationId(resaleAuthorizationId);
        return this;
    }

    /**
     * <p>
     * The release date of the offer.
     * </p>
     * 
     * @param releaseDate
     *        The release date of the offer.
     */

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * <p>
     * The release date of the offer.
     * </p>
     * 
     * @return The release date of the offer.
     */

    public String getReleaseDate() {
        return this.releaseDate;
    }

    /**
     * <p>
     * The release date of the offer.
     * </p>
     * 
     * @param releaseDate
     *        The release date of the offer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OfferSummary withReleaseDate(String releaseDate) {
        setReleaseDate(releaseDate);
        return this;
    }

    /**
     * <p>
     * The availability end date of the offer.
     * </p>
     * 
     * @param availabilityEndDate
     *        The availability end date of the offer.
     */

    public void setAvailabilityEndDate(String availabilityEndDate) {
        this.availabilityEndDate = availabilityEndDate;
    }

    /**
     * <p>
     * The availability end date of the offer.
     * </p>
     * 
     * @return The availability end date of the offer.
     */

    public String getAvailabilityEndDate() {
        return this.availabilityEndDate;
    }

    /**
     * <p>
     * The availability end date of the offer.
     * </p>
     * 
     * @param availabilityEndDate
     *        The availability end date of the offer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OfferSummary withAvailabilityEndDate(String availabilityEndDate) {
        setAvailabilityEndDate(availabilityEndDate);
        return this;
    }

    /**
     * <p>
     * The buyer accounts in the offer.
     * </p>
     * 
     * @return The buyer accounts in the offer.
     */

    public java.util.List<String> getBuyerAccounts() {
        return buyerAccounts;
    }

    /**
     * <p>
     * The buyer accounts in the offer.
     * </p>
     * 
     * @param buyerAccounts
     *        The buyer accounts in the offer.
     */

    public void setBuyerAccounts(java.util.Collection<String> buyerAccounts) {
        if (buyerAccounts == null) {
            this.buyerAccounts = null;
            return;
        }

        this.buyerAccounts = new java.util.ArrayList<String>(buyerAccounts);
    }

    /**
     * <p>
     * The buyer accounts in the offer.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBuyerAccounts(java.util.Collection)} or {@link #withBuyerAccounts(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param buyerAccounts
     *        The buyer accounts in the offer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OfferSummary withBuyerAccounts(String... buyerAccounts) {
        if (this.buyerAccounts == null) {
            setBuyerAccounts(new java.util.ArrayList<String>(buyerAccounts.length));
        }
        for (String ele : buyerAccounts) {
            this.buyerAccounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The buyer accounts in the offer.
     * </p>
     * 
     * @param buyerAccounts
     *        The buyer accounts in the offer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OfferSummary withBuyerAccounts(java.util.Collection<String> buyerAccounts) {
        setBuyerAccounts(buyerAccounts);
        return this;
    }

    /**
     * <p>
     * The status of the offer.
     * </p>
     * 
     * @param state
     *        The status of the offer.
     * @see OfferStateString
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The status of the offer.
     * </p>
     * 
     * @return The status of the offer.
     * @see OfferStateString
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The status of the offer.
     * </p>
     * 
     * @param state
     *        The status of the offer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OfferStateString
     */

    public OfferSummary withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The status of the offer.
     * </p>
     * 
     * @param state
     *        The status of the offer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OfferStateString
     */

    public OfferSummary withState(OfferStateString state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The targeting in the offer.
     * </p>
     * 
     * @return The targeting in the offer.
     * @see OfferTargetingString
     */

    public java.util.List<String> getTargeting() {
        return targeting;
    }

    /**
     * <p>
     * The targeting in the offer.
     * </p>
     * 
     * @param targeting
     *        The targeting in the offer.
     * @see OfferTargetingString
     */

    public void setTargeting(java.util.Collection<String> targeting) {
        if (targeting == null) {
            this.targeting = null;
            return;
        }

        this.targeting = new java.util.ArrayList<String>(targeting);
    }

    /**
     * <p>
     * The targeting in the offer.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargeting(java.util.Collection)} or {@link #withTargeting(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param targeting
     *        The targeting in the offer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OfferTargetingString
     */

    public OfferSummary withTargeting(String... targeting) {
        if (this.targeting == null) {
            setTargeting(new java.util.ArrayList<String>(targeting.length));
        }
        for (String ele : targeting) {
            this.targeting.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The targeting in the offer.
     * </p>
     * 
     * @param targeting
     *        The targeting in the offer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OfferTargetingString
     */

    public OfferSummary withTargeting(java.util.Collection<String> targeting) {
        setTargeting(targeting);
        return this;
    }

    /**
     * <p>
     * The targeting in the offer.
     * </p>
     * 
     * @param targeting
     *        The targeting in the offer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OfferTargetingString
     */

    public OfferSummary withTargeting(OfferTargetingString... targeting) {
        java.util.ArrayList<String> targetingCopy = new java.util.ArrayList<String>(targeting.length);
        for (OfferTargetingString value : targeting) {
            targetingCopy.add(value.toString());
        }
        if (getTargeting() == null) {
            setTargeting(targetingCopy);
        } else {
            getTargeting().addAll(targetingCopy);
        }
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getProductId() != null)
            sb.append("ProductId: ").append(getProductId()).append(",");
        if (getResaleAuthorizationId() != null)
            sb.append("ResaleAuthorizationId: ").append(getResaleAuthorizationId()).append(",");
        if (getReleaseDate() != null)
            sb.append("ReleaseDate: ").append(getReleaseDate()).append(",");
        if (getAvailabilityEndDate() != null)
            sb.append("AvailabilityEndDate: ").append(getAvailabilityEndDate()).append(",");
        if (getBuyerAccounts() != null)
            sb.append("BuyerAccounts: ").append(getBuyerAccounts()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getTargeting() != null)
            sb.append("Targeting: ").append(getTargeting());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OfferSummary == false)
            return false;
        OfferSummary other = (OfferSummary) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProductId() == null ^ this.getProductId() == null)
            return false;
        if (other.getProductId() != null && other.getProductId().equals(this.getProductId()) == false)
            return false;
        if (other.getResaleAuthorizationId() == null ^ this.getResaleAuthorizationId() == null)
            return false;
        if (other.getResaleAuthorizationId() != null && other.getResaleAuthorizationId().equals(this.getResaleAuthorizationId()) == false)
            return false;
        if (other.getReleaseDate() == null ^ this.getReleaseDate() == null)
            return false;
        if (other.getReleaseDate() != null && other.getReleaseDate().equals(this.getReleaseDate()) == false)
            return false;
        if (other.getAvailabilityEndDate() == null ^ this.getAvailabilityEndDate() == null)
            return false;
        if (other.getAvailabilityEndDate() != null && other.getAvailabilityEndDate().equals(this.getAvailabilityEndDate()) == false)
            return false;
        if (other.getBuyerAccounts() == null ^ this.getBuyerAccounts() == null)
            return false;
        if (other.getBuyerAccounts() != null && other.getBuyerAccounts().equals(this.getBuyerAccounts()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getTargeting() == null ^ this.getTargeting() == null)
            return false;
        if (other.getTargeting() != null && other.getTargeting().equals(this.getTargeting()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        hashCode = prime * hashCode + ((getResaleAuthorizationId() == null) ? 0 : getResaleAuthorizationId().hashCode());
        hashCode = prime * hashCode + ((getReleaseDate() == null) ? 0 : getReleaseDate().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityEndDate() == null) ? 0 : getAvailabilityEndDate().hashCode());
        hashCode = prime * hashCode + ((getBuyerAccounts() == null) ? 0 : getBuyerAccounts().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTargeting() == null) ? 0 : getTargeting().hashCode());
        return hashCode;
    }

    @Override
    public OfferSummary clone() {
        try {
            return (OfferSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplacecatalog.model.transform.OfferSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
