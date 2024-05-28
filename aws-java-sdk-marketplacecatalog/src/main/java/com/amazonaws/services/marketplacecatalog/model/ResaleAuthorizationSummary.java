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
 * Summarized information about a Resale Authorization.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-catalog-2018-09-17/ResaleAuthorizationSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResaleAuthorizationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the ResaleAuthorization.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The product ID of the ResaleAuthorization.
     * </p>
     */
    private String productId;
    /**
     * <p>
     * The product name of the ResaleAuthorization.
     * </p>
     */
    private String productName;
    /**
     * <p>
     * The manufacturer account ID of the ResaleAuthorization.
     * </p>
     */
    private String manufacturerAccountId;
    /**
     * <p>
     * The manufacturer legal name of the ResaleAuthorization.
     * </p>
     */
    private String manufacturerLegalName;
    /**
     * <p>
     * The reseller account ID of the ResaleAuthorization.
     * </p>
     */
    private String resellerAccountID;
    /**
     * <p>
     * The reseller legal name of the ResaleAuthorization
     * </p>
     */
    private String resellerLegalName;
    /**
     * <p>
     * The status of the ResaleAuthorization.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The offer extended status of the ResaleAuthorization
     * </p>
     */
    private String offerExtendedStatus;
    /**
     * <p>
     * The created date of the ResaleAuthorization.
     * </p>
     */
    private String createdDate;
    /**
     * <p>
     * The availability end date of the ResaleAuthorization.
     * </p>
     */
    private String availabilityEndDate;

    /**
     * <p>
     * The name of the ResaleAuthorization.
     * </p>
     * 
     * @param name
     *        The name of the ResaleAuthorization.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the ResaleAuthorization.
     * </p>
     * 
     * @return The name of the ResaleAuthorization.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the ResaleAuthorization.
     * </p>
     * 
     * @param name
     *        The name of the ResaleAuthorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResaleAuthorizationSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The product ID of the ResaleAuthorization.
     * </p>
     * 
     * @param productId
     *        The product ID of the ResaleAuthorization.
     */

    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * <p>
     * The product ID of the ResaleAuthorization.
     * </p>
     * 
     * @return The product ID of the ResaleAuthorization.
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     * <p>
     * The product ID of the ResaleAuthorization.
     * </p>
     * 
     * @param productId
     *        The product ID of the ResaleAuthorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResaleAuthorizationSummary withProductId(String productId) {
        setProductId(productId);
        return this;
    }

    /**
     * <p>
     * The product name of the ResaleAuthorization.
     * </p>
     * 
     * @param productName
     *        The product name of the ResaleAuthorization.
     */

    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * <p>
     * The product name of the ResaleAuthorization.
     * </p>
     * 
     * @return The product name of the ResaleAuthorization.
     */

    public String getProductName() {
        return this.productName;
    }

    /**
     * <p>
     * The product name of the ResaleAuthorization.
     * </p>
     * 
     * @param productName
     *        The product name of the ResaleAuthorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResaleAuthorizationSummary withProductName(String productName) {
        setProductName(productName);
        return this;
    }

    /**
     * <p>
     * The manufacturer account ID of the ResaleAuthorization.
     * </p>
     * 
     * @param manufacturerAccountId
     *        The manufacturer account ID of the ResaleAuthorization.
     */

    public void setManufacturerAccountId(String manufacturerAccountId) {
        this.manufacturerAccountId = manufacturerAccountId;
    }

    /**
     * <p>
     * The manufacturer account ID of the ResaleAuthorization.
     * </p>
     * 
     * @return The manufacturer account ID of the ResaleAuthorization.
     */

    public String getManufacturerAccountId() {
        return this.manufacturerAccountId;
    }

    /**
     * <p>
     * The manufacturer account ID of the ResaleAuthorization.
     * </p>
     * 
     * @param manufacturerAccountId
     *        The manufacturer account ID of the ResaleAuthorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResaleAuthorizationSummary withManufacturerAccountId(String manufacturerAccountId) {
        setManufacturerAccountId(manufacturerAccountId);
        return this;
    }

    /**
     * <p>
     * The manufacturer legal name of the ResaleAuthorization.
     * </p>
     * 
     * @param manufacturerLegalName
     *        The manufacturer legal name of the ResaleAuthorization.
     */

    public void setManufacturerLegalName(String manufacturerLegalName) {
        this.manufacturerLegalName = manufacturerLegalName;
    }

    /**
     * <p>
     * The manufacturer legal name of the ResaleAuthorization.
     * </p>
     * 
     * @return The manufacturer legal name of the ResaleAuthorization.
     */

    public String getManufacturerLegalName() {
        return this.manufacturerLegalName;
    }

    /**
     * <p>
     * The manufacturer legal name of the ResaleAuthorization.
     * </p>
     * 
     * @param manufacturerLegalName
     *        The manufacturer legal name of the ResaleAuthorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResaleAuthorizationSummary withManufacturerLegalName(String manufacturerLegalName) {
        setManufacturerLegalName(manufacturerLegalName);
        return this;
    }

    /**
     * <p>
     * The reseller account ID of the ResaleAuthorization.
     * </p>
     * 
     * @param resellerAccountID
     *        The reseller account ID of the ResaleAuthorization.
     */

    public void setResellerAccountID(String resellerAccountID) {
        this.resellerAccountID = resellerAccountID;
    }

    /**
     * <p>
     * The reseller account ID of the ResaleAuthorization.
     * </p>
     * 
     * @return The reseller account ID of the ResaleAuthorization.
     */

    public String getResellerAccountID() {
        return this.resellerAccountID;
    }

    /**
     * <p>
     * The reseller account ID of the ResaleAuthorization.
     * </p>
     * 
     * @param resellerAccountID
     *        The reseller account ID of the ResaleAuthorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResaleAuthorizationSummary withResellerAccountID(String resellerAccountID) {
        setResellerAccountID(resellerAccountID);
        return this;
    }

    /**
     * <p>
     * The reseller legal name of the ResaleAuthorization
     * </p>
     * 
     * @param resellerLegalName
     *        The reseller legal name of the ResaleAuthorization
     */

    public void setResellerLegalName(String resellerLegalName) {
        this.resellerLegalName = resellerLegalName;
    }

    /**
     * <p>
     * The reseller legal name of the ResaleAuthorization
     * </p>
     * 
     * @return The reseller legal name of the ResaleAuthorization
     */

    public String getResellerLegalName() {
        return this.resellerLegalName;
    }

    /**
     * <p>
     * The reseller legal name of the ResaleAuthorization
     * </p>
     * 
     * @param resellerLegalName
     *        The reseller legal name of the ResaleAuthorization
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResaleAuthorizationSummary withResellerLegalName(String resellerLegalName) {
        setResellerLegalName(resellerLegalName);
        return this;
    }

    /**
     * <p>
     * The status of the ResaleAuthorization.
     * </p>
     * 
     * @param status
     *        The status of the ResaleAuthorization.
     * @see ResaleAuthorizationStatusString
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the ResaleAuthorization.
     * </p>
     * 
     * @return The status of the ResaleAuthorization.
     * @see ResaleAuthorizationStatusString
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the ResaleAuthorization.
     * </p>
     * 
     * @param status
     *        The status of the ResaleAuthorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResaleAuthorizationStatusString
     */

    public ResaleAuthorizationSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the ResaleAuthorization.
     * </p>
     * 
     * @param status
     *        The status of the ResaleAuthorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResaleAuthorizationStatusString
     */

    public ResaleAuthorizationSummary withStatus(ResaleAuthorizationStatusString status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The offer extended status of the ResaleAuthorization
     * </p>
     * 
     * @param offerExtendedStatus
     *        The offer extended status of the ResaleAuthorization
     */

    public void setOfferExtendedStatus(String offerExtendedStatus) {
        this.offerExtendedStatus = offerExtendedStatus;
    }

    /**
     * <p>
     * The offer extended status of the ResaleAuthorization
     * </p>
     * 
     * @return The offer extended status of the ResaleAuthorization
     */

    public String getOfferExtendedStatus() {
        return this.offerExtendedStatus;
    }

    /**
     * <p>
     * The offer extended status of the ResaleAuthorization
     * </p>
     * 
     * @param offerExtendedStatus
     *        The offer extended status of the ResaleAuthorization
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResaleAuthorizationSummary withOfferExtendedStatus(String offerExtendedStatus) {
        setOfferExtendedStatus(offerExtendedStatus);
        return this;
    }

    /**
     * <p>
     * The created date of the ResaleAuthorization.
     * </p>
     * 
     * @param createdDate
     *        The created date of the ResaleAuthorization.
     */

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The created date of the ResaleAuthorization.
     * </p>
     * 
     * @return The created date of the ResaleAuthorization.
     */

    public String getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The created date of the ResaleAuthorization.
     * </p>
     * 
     * @param createdDate
     *        The created date of the ResaleAuthorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResaleAuthorizationSummary withCreatedDate(String createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The availability end date of the ResaleAuthorization.
     * </p>
     * 
     * @param availabilityEndDate
     *        The availability end date of the ResaleAuthorization.
     */

    public void setAvailabilityEndDate(String availabilityEndDate) {
        this.availabilityEndDate = availabilityEndDate;
    }

    /**
     * <p>
     * The availability end date of the ResaleAuthorization.
     * </p>
     * 
     * @return The availability end date of the ResaleAuthorization.
     */

    public String getAvailabilityEndDate() {
        return this.availabilityEndDate;
    }

    /**
     * <p>
     * The availability end date of the ResaleAuthorization.
     * </p>
     * 
     * @param availabilityEndDate
     *        The availability end date of the ResaleAuthorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResaleAuthorizationSummary withAvailabilityEndDate(String availabilityEndDate) {
        setAvailabilityEndDate(availabilityEndDate);
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
        if (getProductName() != null)
            sb.append("ProductName: ").append(getProductName()).append(",");
        if (getManufacturerAccountId() != null)
            sb.append("ManufacturerAccountId: ").append(getManufacturerAccountId()).append(",");
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
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getAvailabilityEndDate() != null)
            sb.append("AvailabilityEndDate: ").append(getAvailabilityEndDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResaleAuthorizationSummary == false)
            return false;
        ResaleAuthorizationSummary other = (ResaleAuthorizationSummary) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProductId() == null ^ this.getProductId() == null)
            return false;
        if (other.getProductId() != null && other.getProductId().equals(this.getProductId()) == false)
            return false;
        if (other.getProductName() == null ^ this.getProductName() == null)
            return false;
        if (other.getProductName() != null && other.getProductName().equals(this.getProductName()) == false)
            return false;
        if (other.getManufacturerAccountId() == null ^ this.getManufacturerAccountId() == null)
            return false;
        if (other.getManufacturerAccountId() != null && other.getManufacturerAccountId().equals(this.getManufacturerAccountId()) == false)
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
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getAvailabilityEndDate() == null ^ this.getAvailabilityEndDate() == null)
            return false;
        if (other.getAvailabilityEndDate() != null && other.getAvailabilityEndDate().equals(this.getAvailabilityEndDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        hashCode = prime * hashCode + ((getProductName() == null) ? 0 : getProductName().hashCode());
        hashCode = prime * hashCode + ((getManufacturerAccountId() == null) ? 0 : getManufacturerAccountId().hashCode());
        hashCode = prime * hashCode + ((getManufacturerLegalName() == null) ? 0 : getManufacturerLegalName().hashCode());
        hashCode = prime * hashCode + ((getResellerAccountID() == null) ? 0 : getResellerAccountID().hashCode());
        hashCode = prime * hashCode + ((getResellerLegalName() == null) ? 0 : getResellerLegalName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getOfferExtendedStatus() == null) ? 0 : getOfferExtendedStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityEndDate() == null) ? 0 : getAvailabilityEndDate().hashCode());
        return hashCode;
    }

    @Override
    public ResaleAuthorizationSummary clone() {
        try {
            return (ResaleAuthorizationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplacecatalog.model.transform.ResaleAuthorizationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
