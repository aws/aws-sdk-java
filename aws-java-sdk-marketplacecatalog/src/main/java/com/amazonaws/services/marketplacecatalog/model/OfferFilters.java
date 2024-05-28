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
 * Object containing all the filter fields for offers entity. Client can add only one wildcard filter and a maximum of 8
 * filters in a single <code>ListEntities</code> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/OfferFilters" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OfferFilters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Allows filtering on <code>EntityId</code> of an offer.
     * </p>
     */
    private OfferEntityIdFilter entityId;
    /**
     * <p>
     * Allows filtering on the <code>Name</code> of an offer.
     * </p>
     */
    private OfferNameFilter name;
    /**
     * <p>
     * Allows filtering on the <code>ProductId</code> of an offer.
     * </p>
     */
    private OfferProductIdFilter productId;
    /**
     * <p>
     * Allows filtering on the <code>ResaleAuthorizationId</code> of an offer.
     * </p>
     * <note>
     * <p>
     * Not all offers have a <code>ResaleAuthorizationId</code>. The response will only include offers for which you
     * have permissions.
     * </p>
     * </note>
     */
    private OfferResaleAuthorizationIdFilter resaleAuthorizationId;
    /**
     * <p>
     * Allows filtering on the <code>ReleaseDate</code> of an offer.
     * </p>
     */
    private OfferReleaseDateFilter releaseDate;
    /**
     * <p>
     * Allows filtering on the <code>AvailabilityEndDate</code> of an offer.
     * </p>
     */
    private OfferAvailabilityEndDateFilter availabilityEndDate;
    /**
     * <p>
     * Allows filtering on the <code>BuyerAccounts</code> of an offer.
     * </p>
     */
    private OfferBuyerAccountsFilter buyerAccounts;
    /**
     * <p>
     * Allows filtering on the <code>State</code> of an offer.
     * </p>
     */
    private OfferStateFilter state;
    /**
     * <p>
     * Allows filtering on the <code>Targeting</code> of an offer.
     * </p>
     */
    private OfferTargetingFilter targeting;
    /**
     * <p>
     * Allows filtering on the <code>LastModifiedDate</code> of an offer.
     * </p>
     */
    private OfferLastModifiedDateFilter lastModifiedDate;

    /**
     * <p>
     * Allows filtering on <code>EntityId</code> of an offer.
     * </p>
     * 
     * @param entityId
     *        Allows filtering on <code>EntityId</code> of an offer.
     */

    public void setEntityId(OfferEntityIdFilter entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * Allows filtering on <code>EntityId</code> of an offer.
     * </p>
     * 
     * @return Allows filtering on <code>EntityId</code> of an offer.
     */

    public OfferEntityIdFilter getEntityId() {
        return this.entityId;
    }

    /**
     * <p>
     * Allows filtering on <code>EntityId</code> of an offer.
     * </p>
     * 
     * @param entityId
     *        Allows filtering on <code>EntityId</code> of an offer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OfferFilters withEntityId(OfferEntityIdFilter entityId) {
        setEntityId(entityId);
        return this;
    }

    /**
     * <p>
     * Allows filtering on the <code>Name</code> of an offer.
     * </p>
     * 
     * @param name
     *        Allows filtering on the <code>Name</code> of an offer.
     */

    public void setName(OfferNameFilter name) {
        this.name = name;
    }

    /**
     * <p>
     * Allows filtering on the <code>Name</code> of an offer.
     * </p>
     * 
     * @return Allows filtering on the <code>Name</code> of an offer.
     */

    public OfferNameFilter getName() {
        return this.name;
    }

    /**
     * <p>
     * Allows filtering on the <code>Name</code> of an offer.
     * </p>
     * 
     * @param name
     *        Allows filtering on the <code>Name</code> of an offer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OfferFilters withName(OfferNameFilter name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Allows filtering on the <code>ProductId</code> of an offer.
     * </p>
     * 
     * @param productId
     *        Allows filtering on the <code>ProductId</code> of an offer.
     */

    public void setProductId(OfferProductIdFilter productId) {
        this.productId = productId;
    }

    /**
     * <p>
     * Allows filtering on the <code>ProductId</code> of an offer.
     * </p>
     * 
     * @return Allows filtering on the <code>ProductId</code> of an offer.
     */

    public OfferProductIdFilter getProductId() {
        return this.productId;
    }

    /**
     * <p>
     * Allows filtering on the <code>ProductId</code> of an offer.
     * </p>
     * 
     * @param productId
     *        Allows filtering on the <code>ProductId</code> of an offer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OfferFilters withProductId(OfferProductIdFilter productId) {
        setProductId(productId);
        return this;
    }

    /**
     * <p>
     * Allows filtering on the <code>ResaleAuthorizationId</code> of an offer.
     * </p>
     * <note>
     * <p>
     * Not all offers have a <code>ResaleAuthorizationId</code>. The response will only include offers for which you
     * have permissions.
     * </p>
     * </note>
     * 
     * @param resaleAuthorizationId
     *        Allows filtering on the <code>ResaleAuthorizationId</code> of an offer.</p> <note>
     *        <p>
     *        Not all offers have a <code>ResaleAuthorizationId</code>. The response will only include offers for which
     *        you have permissions.
     *        </p>
     */

    public void setResaleAuthorizationId(OfferResaleAuthorizationIdFilter resaleAuthorizationId) {
        this.resaleAuthorizationId = resaleAuthorizationId;
    }

    /**
     * <p>
     * Allows filtering on the <code>ResaleAuthorizationId</code> of an offer.
     * </p>
     * <note>
     * <p>
     * Not all offers have a <code>ResaleAuthorizationId</code>. The response will only include offers for which you
     * have permissions.
     * </p>
     * </note>
     * 
     * @return Allows filtering on the <code>ResaleAuthorizationId</code> of an offer.</p> <note>
     *         <p>
     *         Not all offers have a <code>ResaleAuthorizationId</code>. The response will only include offers for which
     *         you have permissions.
     *         </p>
     */

    public OfferResaleAuthorizationIdFilter getResaleAuthorizationId() {
        return this.resaleAuthorizationId;
    }

    /**
     * <p>
     * Allows filtering on the <code>ResaleAuthorizationId</code> of an offer.
     * </p>
     * <note>
     * <p>
     * Not all offers have a <code>ResaleAuthorizationId</code>. The response will only include offers for which you
     * have permissions.
     * </p>
     * </note>
     * 
     * @param resaleAuthorizationId
     *        Allows filtering on the <code>ResaleAuthorizationId</code> of an offer.</p> <note>
     *        <p>
     *        Not all offers have a <code>ResaleAuthorizationId</code>. The response will only include offers for which
     *        you have permissions.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OfferFilters withResaleAuthorizationId(OfferResaleAuthorizationIdFilter resaleAuthorizationId) {
        setResaleAuthorizationId(resaleAuthorizationId);
        return this;
    }

    /**
     * <p>
     * Allows filtering on the <code>ReleaseDate</code> of an offer.
     * </p>
     * 
     * @param releaseDate
     *        Allows filtering on the <code>ReleaseDate</code> of an offer.
     */

    public void setReleaseDate(OfferReleaseDateFilter releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * <p>
     * Allows filtering on the <code>ReleaseDate</code> of an offer.
     * </p>
     * 
     * @return Allows filtering on the <code>ReleaseDate</code> of an offer.
     */

    public OfferReleaseDateFilter getReleaseDate() {
        return this.releaseDate;
    }

    /**
     * <p>
     * Allows filtering on the <code>ReleaseDate</code> of an offer.
     * </p>
     * 
     * @param releaseDate
     *        Allows filtering on the <code>ReleaseDate</code> of an offer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OfferFilters withReleaseDate(OfferReleaseDateFilter releaseDate) {
        setReleaseDate(releaseDate);
        return this;
    }

    /**
     * <p>
     * Allows filtering on the <code>AvailabilityEndDate</code> of an offer.
     * </p>
     * 
     * @param availabilityEndDate
     *        Allows filtering on the <code>AvailabilityEndDate</code> of an offer.
     */

    public void setAvailabilityEndDate(OfferAvailabilityEndDateFilter availabilityEndDate) {
        this.availabilityEndDate = availabilityEndDate;
    }

    /**
     * <p>
     * Allows filtering on the <code>AvailabilityEndDate</code> of an offer.
     * </p>
     * 
     * @return Allows filtering on the <code>AvailabilityEndDate</code> of an offer.
     */

    public OfferAvailabilityEndDateFilter getAvailabilityEndDate() {
        return this.availabilityEndDate;
    }

    /**
     * <p>
     * Allows filtering on the <code>AvailabilityEndDate</code> of an offer.
     * </p>
     * 
     * @param availabilityEndDate
     *        Allows filtering on the <code>AvailabilityEndDate</code> of an offer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OfferFilters withAvailabilityEndDate(OfferAvailabilityEndDateFilter availabilityEndDate) {
        setAvailabilityEndDate(availabilityEndDate);
        return this;
    }

    /**
     * <p>
     * Allows filtering on the <code>BuyerAccounts</code> of an offer.
     * </p>
     * 
     * @param buyerAccounts
     *        Allows filtering on the <code>BuyerAccounts</code> of an offer.
     */

    public void setBuyerAccounts(OfferBuyerAccountsFilter buyerAccounts) {
        this.buyerAccounts = buyerAccounts;
    }

    /**
     * <p>
     * Allows filtering on the <code>BuyerAccounts</code> of an offer.
     * </p>
     * 
     * @return Allows filtering on the <code>BuyerAccounts</code> of an offer.
     */

    public OfferBuyerAccountsFilter getBuyerAccounts() {
        return this.buyerAccounts;
    }

    /**
     * <p>
     * Allows filtering on the <code>BuyerAccounts</code> of an offer.
     * </p>
     * 
     * @param buyerAccounts
     *        Allows filtering on the <code>BuyerAccounts</code> of an offer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OfferFilters withBuyerAccounts(OfferBuyerAccountsFilter buyerAccounts) {
        setBuyerAccounts(buyerAccounts);
        return this;
    }

    /**
     * <p>
     * Allows filtering on the <code>State</code> of an offer.
     * </p>
     * 
     * @param state
     *        Allows filtering on the <code>State</code> of an offer.
     */

    public void setState(OfferStateFilter state) {
        this.state = state;
    }

    /**
     * <p>
     * Allows filtering on the <code>State</code> of an offer.
     * </p>
     * 
     * @return Allows filtering on the <code>State</code> of an offer.
     */

    public OfferStateFilter getState() {
        return this.state;
    }

    /**
     * <p>
     * Allows filtering on the <code>State</code> of an offer.
     * </p>
     * 
     * @param state
     *        Allows filtering on the <code>State</code> of an offer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OfferFilters withState(OfferStateFilter state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Allows filtering on the <code>Targeting</code> of an offer.
     * </p>
     * 
     * @param targeting
     *        Allows filtering on the <code>Targeting</code> of an offer.
     */

    public void setTargeting(OfferTargetingFilter targeting) {
        this.targeting = targeting;
    }

    /**
     * <p>
     * Allows filtering on the <code>Targeting</code> of an offer.
     * </p>
     * 
     * @return Allows filtering on the <code>Targeting</code> of an offer.
     */

    public OfferTargetingFilter getTargeting() {
        return this.targeting;
    }

    /**
     * <p>
     * Allows filtering on the <code>Targeting</code> of an offer.
     * </p>
     * 
     * @param targeting
     *        Allows filtering on the <code>Targeting</code> of an offer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OfferFilters withTargeting(OfferTargetingFilter targeting) {
        setTargeting(targeting);
        return this;
    }

    /**
     * <p>
     * Allows filtering on the <code>LastModifiedDate</code> of an offer.
     * </p>
     * 
     * @param lastModifiedDate
     *        Allows filtering on the <code>LastModifiedDate</code> of an offer.
     */

    public void setLastModifiedDate(OfferLastModifiedDateFilter lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * Allows filtering on the <code>LastModifiedDate</code> of an offer.
     * </p>
     * 
     * @return Allows filtering on the <code>LastModifiedDate</code> of an offer.
     */

    public OfferLastModifiedDateFilter getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * Allows filtering on the <code>LastModifiedDate</code> of an offer.
     * </p>
     * 
     * @param lastModifiedDate
     *        Allows filtering on the <code>LastModifiedDate</code> of an offer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OfferFilters withLastModifiedDate(OfferLastModifiedDateFilter lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
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
        if (getEntityId() != null)
            sb.append("EntityId: ").append(getEntityId()).append(",");
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
            sb.append("Targeting: ").append(getTargeting()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OfferFilters == false)
            return false;
        OfferFilters other = (OfferFilters) obj;
        if (other.getEntityId() == null ^ this.getEntityId() == null)
            return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false)
            return false;
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
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        hashCode = prime * hashCode + ((getResaleAuthorizationId() == null) ? 0 : getResaleAuthorizationId().hashCode());
        hashCode = prime * hashCode + ((getReleaseDate() == null) ? 0 : getReleaseDate().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityEndDate() == null) ? 0 : getAvailabilityEndDate().hashCode());
        hashCode = prime * hashCode + ((getBuyerAccounts() == null) ? 0 : getBuyerAccounts().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTargeting() == null) ? 0 : getTargeting().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        return hashCode;
    }

    @Override
    public OfferFilters clone() {
        try {
            return (OfferFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplacecatalog.model.transform.OfferFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
