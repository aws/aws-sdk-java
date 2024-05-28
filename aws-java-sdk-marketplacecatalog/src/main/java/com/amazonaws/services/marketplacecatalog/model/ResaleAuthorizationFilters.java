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
 * Object containing all the filter fields for resale authorization entity. Client can add only one wildcard filter and
 * a maximum of 8 filters in a single <code>ListEntities</code> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/ResaleAuthorizationFilters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResaleAuthorizationFilters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Allows filtering on the <code>EntityId</code> of a ResaleAuthorization.
     * </p>
     */
    private ResaleAuthorizationEntityIdFilter entityId;
    /**
     * <p>
     * Allows filtering on the <code>Name</code> of a ResaleAuthorization.
     * </p>
     */
    private ResaleAuthorizationNameFilter name;
    /**
     * <p>
     * Allows filtering on the <code>ProductId</code> of a ResaleAuthorization.
     * </p>
     */
    private ResaleAuthorizationProductIdFilter productId;
    /**
     * <p>
     * Allows filtering on the <code>CreatedDate</code> of a ResaleAuthorization.
     * </p>
     */
    private ResaleAuthorizationCreatedDateFilter createdDate;
    /**
     * <p>
     * Allows filtering on the <code>AvailabilityEndDate</code> of a ResaleAuthorization.
     * </p>
     */
    private ResaleAuthorizationAvailabilityEndDateFilter availabilityEndDate;
    /**
     * <p>
     * Allows filtering on the <code>ManufacturerAccountId</code> of a ResaleAuthorization.
     * </p>
     */
    private ResaleAuthorizationManufacturerAccountIdFilter manufacturerAccountId;
    /**
     * <p>
     * Allows filtering on the <code>ProductName</code> of a ResaleAuthorization.
     * </p>
     */
    private ResaleAuthorizationProductNameFilter productName;
    /**
     * <p>
     * Allows filtering on the <code>ManufacturerLegalName</code> of a ResaleAuthorization.
     * </p>
     */
    private ResaleAuthorizationManufacturerLegalNameFilter manufacturerLegalName;
    /**
     * <p>
     * Allows filtering on the <code>ResellerAccountID</code> of a ResaleAuthorization.
     * </p>
     */
    private ResaleAuthorizationResellerAccountIDFilter resellerAccountID;
    /**
     * <p>
     * Allows filtering on the <code>ResellerLegalName</code> of a ResaleAuthorization.
     * </p>
     */
    private ResaleAuthorizationResellerLegalNameFilter resellerLegalName;
    /**
     * <p>
     * Allows filtering on the <code>Status</code> of a ResaleAuthorization.
     * </p>
     */
    private ResaleAuthorizationStatusFilter status;
    /**
     * <p>
     * Allows filtering on the <code>OfferExtendedStatus</code> of a ResaleAuthorization.
     * </p>
     */
    private ResaleAuthorizationOfferExtendedStatusFilter offerExtendedStatus;
    /**
     * <p>
     * Allows filtering on the <code>LastModifiedDate</code> of a ResaleAuthorization.
     * </p>
     */
    private ResaleAuthorizationLastModifiedDateFilter lastModifiedDate;

    /**
     * <p>
     * Allows filtering on the <code>EntityId</code> of a ResaleAuthorization.
     * </p>
     * 
     * @param entityId
     *        Allows filtering on the <code>EntityId</code> of a ResaleAuthorization.
     */

    public void setEntityId(ResaleAuthorizationEntityIdFilter entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * Allows filtering on the <code>EntityId</code> of a ResaleAuthorization.
     * </p>
     * 
     * @return Allows filtering on the <code>EntityId</code> of a ResaleAuthorization.
     */

    public ResaleAuthorizationEntityIdFilter getEntityId() {
        return this.entityId;
    }

    /**
     * <p>
     * Allows filtering on the <code>EntityId</code> of a ResaleAuthorization.
     * </p>
     * 
     * @param entityId
     *        Allows filtering on the <code>EntityId</code> of a ResaleAuthorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResaleAuthorizationFilters withEntityId(ResaleAuthorizationEntityIdFilter entityId) {
        setEntityId(entityId);
        return this;
    }

    /**
     * <p>
     * Allows filtering on the <code>Name</code> of a ResaleAuthorization.
     * </p>
     * 
     * @param name
     *        Allows filtering on the <code>Name</code> of a ResaleAuthorization.
     */

    public void setName(ResaleAuthorizationNameFilter name) {
        this.name = name;
    }

    /**
     * <p>
     * Allows filtering on the <code>Name</code> of a ResaleAuthorization.
     * </p>
     * 
     * @return Allows filtering on the <code>Name</code> of a ResaleAuthorization.
     */

    public ResaleAuthorizationNameFilter getName() {
        return this.name;
    }

    /**
     * <p>
     * Allows filtering on the <code>Name</code> of a ResaleAuthorization.
     * </p>
     * 
     * @param name
     *        Allows filtering on the <code>Name</code> of a ResaleAuthorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResaleAuthorizationFilters withName(ResaleAuthorizationNameFilter name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Allows filtering on the <code>ProductId</code> of a ResaleAuthorization.
     * </p>
     * 
     * @param productId
     *        Allows filtering on the <code>ProductId</code> of a ResaleAuthorization.
     */

    public void setProductId(ResaleAuthorizationProductIdFilter productId) {
        this.productId = productId;
    }

    /**
     * <p>
     * Allows filtering on the <code>ProductId</code> of a ResaleAuthorization.
     * </p>
     * 
     * @return Allows filtering on the <code>ProductId</code> of a ResaleAuthorization.
     */

    public ResaleAuthorizationProductIdFilter getProductId() {
        return this.productId;
    }

    /**
     * <p>
     * Allows filtering on the <code>ProductId</code> of a ResaleAuthorization.
     * </p>
     * 
     * @param productId
     *        Allows filtering on the <code>ProductId</code> of a ResaleAuthorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResaleAuthorizationFilters withProductId(ResaleAuthorizationProductIdFilter productId) {
        setProductId(productId);
        return this;
    }

    /**
     * <p>
     * Allows filtering on the <code>CreatedDate</code> of a ResaleAuthorization.
     * </p>
     * 
     * @param createdDate
     *        Allows filtering on the <code>CreatedDate</code> of a ResaleAuthorization.
     */

    public void setCreatedDate(ResaleAuthorizationCreatedDateFilter createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * Allows filtering on the <code>CreatedDate</code> of a ResaleAuthorization.
     * </p>
     * 
     * @return Allows filtering on the <code>CreatedDate</code> of a ResaleAuthorization.
     */

    public ResaleAuthorizationCreatedDateFilter getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * Allows filtering on the <code>CreatedDate</code> of a ResaleAuthorization.
     * </p>
     * 
     * @param createdDate
     *        Allows filtering on the <code>CreatedDate</code> of a ResaleAuthorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResaleAuthorizationFilters withCreatedDate(ResaleAuthorizationCreatedDateFilter createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * Allows filtering on the <code>AvailabilityEndDate</code> of a ResaleAuthorization.
     * </p>
     * 
     * @param availabilityEndDate
     *        Allows filtering on the <code>AvailabilityEndDate</code> of a ResaleAuthorization.
     */

    public void setAvailabilityEndDate(ResaleAuthorizationAvailabilityEndDateFilter availabilityEndDate) {
        this.availabilityEndDate = availabilityEndDate;
    }

    /**
     * <p>
     * Allows filtering on the <code>AvailabilityEndDate</code> of a ResaleAuthorization.
     * </p>
     * 
     * @return Allows filtering on the <code>AvailabilityEndDate</code> of a ResaleAuthorization.
     */

    public ResaleAuthorizationAvailabilityEndDateFilter getAvailabilityEndDate() {
        return this.availabilityEndDate;
    }

    /**
     * <p>
     * Allows filtering on the <code>AvailabilityEndDate</code> of a ResaleAuthorization.
     * </p>
     * 
     * @param availabilityEndDate
     *        Allows filtering on the <code>AvailabilityEndDate</code> of a ResaleAuthorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResaleAuthorizationFilters withAvailabilityEndDate(ResaleAuthorizationAvailabilityEndDateFilter availabilityEndDate) {
        setAvailabilityEndDate(availabilityEndDate);
        return this;
    }

    /**
     * <p>
     * Allows filtering on the <code>ManufacturerAccountId</code> of a ResaleAuthorization.
     * </p>
     * 
     * @param manufacturerAccountId
     *        Allows filtering on the <code>ManufacturerAccountId</code> of a ResaleAuthorization.
     */

    public void setManufacturerAccountId(ResaleAuthorizationManufacturerAccountIdFilter manufacturerAccountId) {
        this.manufacturerAccountId = manufacturerAccountId;
    }

    /**
     * <p>
     * Allows filtering on the <code>ManufacturerAccountId</code> of a ResaleAuthorization.
     * </p>
     * 
     * @return Allows filtering on the <code>ManufacturerAccountId</code> of a ResaleAuthorization.
     */

    public ResaleAuthorizationManufacturerAccountIdFilter getManufacturerAccountId() {
        return this.manufacturerAccountId;
    }

    /**
     * <p>
     * Allows filtering on the <code>ManufacturerAccountId</code> of a ResaleAuthorization.
     * </p>
     * 
     * @param manufacturerAccountId
     *        Allows filtering on the <code>ManufacturerAccountId</code> of a ResaleAuthorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResaleAuthorizationFilters withManufacturerAccountId(ResaleAuthorizationManufacturerAccountIdFilter manufacturerAccountId) {
        setManufacturerAccountId(manufacturerAccountId);
        return this;
    }

    /**
     * <p>
     * Allows filtering on the <code>ProductName</code> of a ResaleAuthorization.
     * </p>
     * 
     * @param productName
     *        Allows filtering on the <code>ProductName</code> of a ResaleAuthorization.
     */

    public void setProductName(ResaleAuthorizationProductNameFilter productName) {
        this.productName = productName;
    }

    /**
     * <p>
     * Allows filtering on the <code>ProductName</code> of a ResaleAuthorization.
     * </p>
     * 
     * @return Allows filtering on the <code>ProductName</code> of a ResaleAuthorization.
     */

    public ResaleAuthorizationProductNameFilter getProductName() {
        return this.productName;
    }

    /**
     * <p>
     * Allows filtering on the <code>ProductName</code> of a ResaleAuthorization.
     * </p>
     * 
     * @param productName
     *        Allows filtering on the <code>ProductName</code> of a ResaleAuthorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResaleAuthorizationFilters withProductName(ResaleAuthorizationProductNameFilter productName) {
        setProductName(productName);
        return this;
    }

    /**
     * <p>
     * Allows filtering on the <code>ManufacturerLegalName</code> of a ResaleAuthorization.
     * </p>
     * 
     * @param manufacturerLegalName
     *        Allows filtering on the <code>ManufacturerLegalName</code> of a ResaleAuthorization.
     */

    public void setManufacturerLegalName(ResaleAuthorizationManufacturerLegalNameFilter manufacturerLegalName) {
        this.manufacturerLegalName = manufacturerLegalName;
    }

    /**
     * <p>
     * Allows filtering on the <code>ManufacturerLegalName</code> of a ResaleAuthorization.
     * </p>
     * 
     * @return Allows filtering on the <code>ManufacturerLegalName</code> of a ResaleAuthorization.
     */

    public ResaleAuthorizationManufacturerLegalNameFilter getManufacturerLegalName() {
        return this.manufacturerLegalName;
    }

    /**
     * <p>
     * Allows filtering on the <code>ManufacturerLegalName</code> of a ResaleAuthorization.
     * </p>
     * 
     * @param manufacturerLegalName
     *        Allows filtering on the <code>ManufacturerLegalName</code> of a ResaleAuthorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResaleAuthorizationFilters withManufacturerLegalName(ResaleAuthorizationManufacturerLegalNameFilter manufacturerLegalName) {
        setManufacturerLegalName(manufacturerLegalName);
        return this;
    }

    /**
     * <p>
     * Allows filtering on the <code>ResellerAccountID</code> of a ResaleAuthorization.
     * </p>
     * 
     * @param resellerAccountID
     *        Allows filtering on the <code>ResellerAccountID</code> of a ResaleAuthorization.
     */

    public void setResellerAccountID(ResaleAuthorizationResellerAccountIDFilter resellerAccountID) {
        this.resellerAccountID = resellerAccountID;
    }

    /**
     * <p>
     * Allows filtering on the <code>ResellerAccountID</code> of a ResaleAuthorization.
     * </p>
     * 
     * @return Allows filtering on the <code>ResellerAccountID</code> of a ResaleAuthorization.
     */

    public ResaleAuthorizationResellerAccountIDFilter getResellerAccountID() {
        return this.resellerAccountID;
    }

    /**
     * <p>
     * Allows filtering on the <code>ResellerAccountID</code> of a ResaleAuthorization.
     * </p>
     * 
     * @param resellerAccountID
     *        Allows filtering on the <code>ResellerAccountID</code> of a ResaleAuthorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResaleAuthorizationFilters withResellerAccountID(ResaleAuthorizationResellerAccountIDFilter resellerAccountID) {
        setResellerAccountID(resellerAccountID);
        return this;
    }

    /**
     * <p>
     * Allows filtering on the <code>ResellerLegalName</code> of a ResaleAuthorization.
     * </p>
     * 
     * @param resellerLegalName
     *        Allows filtering on the <code>ResellerLegalName</code> of a ResaleAuthorization.
     */

    public void setResellerLegalName(ResaleAuthorizationResellerLegalNameFilter resellerLegalName) {
        this.resellerLegalName = resellerLegalName;
    }

    /**
     * <p>
     * Allows filtering on the <code>ResellerLegalName</code> of a ResaleAuthorization.
     * </p>
     * 
     * @return Allows filtering on the <code>ResellerLegalName</code> of a ResaleAuthorization.
     */

    public ResaleAuthorizationResellerLegalNameFilter getResellerLegalName() {
        return this.resellerLegalName;
    }

    /**
     * <p>
     * Allows filtering on the <code>ResellerLegalName</code> of a ResaleAuthorization.
     * </p>
     * 
     * @param resellerLegalName
     *        Allows filtering on the <code>ResellerLegalName</code> of a ResaleAuthorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResaleAuthorizationFilters withResellerLegalName(ResaleAuthorizationResellerLegalNameFilter resellerLegalName) {
        setResellerLegalName(resellerLegalName);
        return this;
    }

    /**
     * <p>
     * Allows filtering on the <code>Status</code> of a ResaleAuthorization.
     * </p>
     * 
     * @param status
     *        Allows filtering on the <code>Status</code> of a ResaleAuthorization.
     */

    public void setStatus(ResaleAuthorizationStatusFilter status) {
        this.status = status;
    }

    /**
     * <p>
     * Allows filtering on the <code>Status</code> of a ResaleAuthorization.
     * </p>
     * 
     * @return Allows filtering on the <code>Status</code> of a ResaleAuthorization.
     */

    public ResaleAuthorizationStatusFilter getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Allows filtering on the <code>Status</code> of a ResaleAuthorization.
     * </p>
     * 
     * @param status
     *        Allows filtering on the <code>Status</code> of a ResaleAuthorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResaleAuthorizationFilters withStatus(ResaleAuthorizationStatusFilter status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Allows filtering on the <code>OfferExtendedStatus</code> of a ResaleAuthorization.
     * </p>
     * 
     * @param offerExtendedStatus
     *        Allows filtering on the <code>OfferExtendedStatus</code> of a ResaleAuthorization.
     */

    public void setOfferExtendedStatus(ResaleAuthorizationOfferExtendedStatusFilter offerExtendedStatus) {
        this.offerExtendedStatus = offerExtendedStatus;
    }

    /**
     * <p>
     * Allows filtering on the <code>OfferExtendedStatus</code> of a ResaleAuthorization.
     * </p>
     * 
     * @return Allows filtering on the <code>OfferExtendedStatus</code> of a ResaleAuthorization.
     */

    public ResaleAuthorizationOfferExtendedStatusFilter getOfferExtendedStatus() {
        return this.offerExtendedStatus;
    }

    /**
     * <p>
     * Allows filtering on the <code>OfferExtendedStatus</code> of a ResaleAuthorization.
     * </p>
     * 
     * @param offerExtendedStatus
     *        Allows filtering on the <code>OfferExtendedStatus</code> of a ResaleAuthorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResaleAuthorizationFilters withOfferExtendedStatus(ResaleAuthorizationOfferExtendedStatusFilter offerExtendedStatus) {
        setOfferExtendedStatus(offerExtendedStatus);
        return this;
    }

    /**
     * <p>
     * Allows filtering on the <code>LastModifiedDate</code> of a ResaleAuthorization.
     * </p>
     * 
     * @param lastModifiedDate
     *        Allows filtering on the <code>LastModifiedDate</code> of a ResaleAuthorization.
     */

    public void setLastModifiedDate(ResaleAuthorizationLastModifiedDateFilter lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * Allows filtering on the <code>LastModifiedDate</code> of a ResaleAuthorization.
     * </p>
     * 
     * @return Allows filtering on the <code>LastModifiedDate</code> of a ResaleAuthorization.
     */

    public ResaleAuthorizationLastModifiedDateFilter getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * Allows filtering on the <code>LastModifiedDate</code> of a ResaleAuthorization.
     * </p>
     * 
     * @param lastModifiedDate
     *        Allows filtering on the <code>LastModifiedDate</code> of a ResaleAuthorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResaleAuthorizationFilters withLastModifiedDate(ResaleAuthorizationLastModifiedDateFilter lastModifiedDate) {
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
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getAvailabilityEndDate() != null)
            sb.append("AvailabilityEndDate: ").append(getAvailabilityEndDate()).append(",");
        if (getManufacturerAccountId() != null)
            sb.append("ManufacturerAccountId: ").append(getManufacturerAccountId()).append(",");
        if (getProductName() != null)
            sb.append("ProductName: ").append(getProductName()).append(",");
        if (getManufacturerLegalName() != null)
            sb.append("ManufacturerLegalName: ").append(getManufacturerLegalName()).append(",");
        if (getResellerAccountID() != null)
            sb.append("ResellerAccountID: ").append(getResellerAccountID()).append(",");
        if (getResellerLegalName() != null)
            sb.append("ResellerLegalName: ").append(getResellerLegalName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getOfferExtendedStatus() != null)
            sb.append("OfferExtendedStatus: ").append(getOfferExtendedStatus()).append(",");
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

        if (obj instanceof ResaleAuthorizationFilters == false)
            return false;
        ResaleAuthorizationFilters other = (ResaleAuthorizationFilters) obj;
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
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getAvailabilityEndDate() == null ^ this.getAvailabilityEndDate() == null)
            return false;
        if (other.getAvailabilityEndDate() != null && other.getAvailabilityEndDate().equals(this.getAvailabilityEndDate()) == false)
            return false;
        if (other.getManufacturerAccountId() == null ^ this.getManufacturerAccountId() == null)
            return false;
        if (other.getManufacturerAccountId() != null && other.getManufacturerAccountId().equals(this.getManufacturerAccountId()) == false)
            return false;
        if (other.getProductName() == null ^ this.getProductName() == null)
            return false;
        if (other.getProductName() != null && other.getProductName().equals(this.getProductName()) == false)
            return false;
        if (other.getManufacturerLegalName() == null ^ this.getManufacturerLegalName() == null)
            return false;
        if (other.getManufacturerLegalName() != null && other.getManufacturerLegalName().equals(this.getManufacturerLegalName()) == false)
            return false;
        if (other.getResellerAccountID() == null ^ this.getResellerAccountID() == null)
            return false;
        if (other.getResellerAccountID() != null && other.getResellerAccountID().equals(this.getResellerAccountID()) == false)
            return false;
        if (other.getResellerLegalName() == null ^ this.getResellerLegalName() == null)
            return false;
        if (other.getResellerLegalName() != null && other.getResellerLegalName().equals(this.getResellerLegalName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getOfferExtendedStatus() == null ^ this.getOfferExtendedStatus() == null)
            return false;
        if (other.getOfferExtendedStatus() != null && other.getOfferExtendedStatus().equals(this.getOfferExtendedStatus()) == false)
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
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityEndDate() == null) ? 0 : getAvailabilityEndDate().hashCode());
        hashCode = prime * hashCode + ((getManufacturerAccountId() == null) ? 0 : getManufacturerAccountId().hashCode());
        hashCode = prime * hashCode + ((getProductName() == null) ? 0 : getProductName().hashCode());
        hashCode = prime * hashCode + ((getManufacturerLegalName() == null) ? 0 : getManufacturerLegalName().hashCode());
        hashCode = prime * hashCode + ((getResellerAccountID() == null) ? 0 : getResellerAccountID().hashCode());
        hashCode = prime * hashCode + ((getResellerLegalName() == null) ? 0 : getResellerLegalName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getOfferExtendedStatus() == null) ? 0 : getOfferExtendedStatus().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        return hashCode;
    }

    @Override
    public ResaleAuthorizationFilters clone() {
        try {
            return (ResaleAuthorizationFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplacecatalog.model.transform.ResaleAuthorizationFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
