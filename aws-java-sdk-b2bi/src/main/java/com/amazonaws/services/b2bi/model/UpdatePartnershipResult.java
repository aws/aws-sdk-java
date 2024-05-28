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
package com.amazonaws.services.b2bi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/b2bi-2022-06-23/UpdatePartnership" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePartnershipResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns the unique, system-generated identifier for the profile connected to this partnership.
     * </p>
     */
    private String profileId;
    /**
     * <p>
     * Returns the unique, system-generated identifier for a partnership.
     * </p>
     */
    private String partnershipId;
    /**
     * <p>
     * Returns an Amazon Resource Name (ARN) for a specific Amazon Web Services resource, such as a capability,
     * partnership, profile, or transformer.
     * </p>
     */
    private String partnershipArn;
    /**
     * <p>
     * The name of the partnership, used to identify it.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Returns the email address associated with this trading partner.
     * </p>
     */
    private String email;
    /**
     * <p>
     * Returns the phone number associated with the partnership.
     * </p>
     */
    private String phone;
    /**
     * <p>
     * Returns one or more capabilities associated with this partnership.
     * </p>
     */
    private java.util.List<String> capabilities;
    /**
     * <p>
     * Returns the unique, system-generated identifier for a trading partner.
     * </p>
     */
    private String tradingPartnerId;
    /**
     * <p>
     * Returns a timestamp that identifies the most recent date and time that the partnership was modified.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * Returns a timestamp that identifies the most recent date and time that the partnership was modified.
     * </p>
     */
    private java.util.Date modifiedAt;

    /**
     * <p>
     * Returns the unique, system-generated identifier for the profile connected to this partnership.
     * </p>
     * 
     * @param profileId
     *        Returns the unique, system-generated identifier for the profile connected to this partnership.
     */

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    /**
     * <p>
     * Returns the unique, system-generated identifier for the profile connected to this partnership.
     * </p>
     * 
     * @return Returns the unique, system-generated identifier for the profile connected to this partnership.
     */

    public String getProfileId() {
        return this.profileId;
    }

    /**
     * <p>
     * Returns the unique, system-generated identifier for the profile connected to this partnership.
     * </p>
     * 
     * @param profileId
     *        Returns the unique, system-generated identifier for the profile connected to this partnership.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePartnershipResult withProfileId(String profileId) {
        setProfileId(profileId);
        return this;
    }

    /**
     * <p>
     * Returns the unique, system-generated identifier for a partnership.
     * </p>
     * 
     * @param partnershipId
     *        Returns the unique, system-generated identifier for a partnership.
     */

    public void setPartnershipId(String partnershipId) {
        this.partnershipId = partnershipId;
    }

    /**
     * <p>
     * Returns the unique, system-generated identifier for a partnership.
     * </p>
     * 
     * @return Returns the unique, system-generated identifier for a partnership.
     */

    public String getPartnershipId() {
        return this.partnershipId;
    }

    /**
     * <p>
     * Returns the unique, system-generated identifier for a partnership.
     * </p>
     * 
     * @param partnershipId
     *        Returns the unique, system-generated identifier for a partnership.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePartnershipResult withPartnershipId(String partnershipId) {
        setPartnershipId(partnershipId);
        return this;
    }

    /**
     * <p>
     * Returns an Amazon Resource Name (ARN) for a specific Amazon Web Services resource, such as a capability,
     * partnership, profile, or transformer.
     * </p>
     * 
     * @param partnershipArn
     *        Returns an Amazon Resource Name (ARN) for a specific Amazon Web Services resource, such as a capability,
     *        partnership, profile, or transformer.
     */

    public void setPartnershipArn(String partnershipArn) {
        this.partnershipArn = partnershipArn;
    }

    /**
     * <p>
     * Returns an Amazon Resource Name (ARN) for a specific Amazon Web Services resource, such as a capability,
     * partnership, profile, or transformer.
     * </p>
     * 
     * @return Returns an Amazon Resource Name (ARN) for a specific Amazon Web Services resource, such as a capability,
     *         partnership, profile, or transformer.
     */

    public String getPartnershipArn() {
        return this.partnershipArn;
    }

    /**
     * <p>
     * Returns an Amazon Resource Name (ARN) for a specific Amazon Web Services resource, such as a capability,
     * partnership, profile, or transformer.
     * </p>
     * 
     * @param partnershipArn
     *        Returns an Amazon Resource Name (ARN) for a specific Amazon Web Services resource, such as a capability,
     *        partnership, profile, or transformer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePartnershipResult withPartnershipArn(String partnershipArn) {
        setPartnershipArn(partnershipArn);
        return this;
    }

    /**
     * <p>
     * The name of the partnership, used to identify it.
     * </p>
     * 
     * @param name
     *        The name of the partnership, used to identify it.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the partnership, used to identify it.
     * </p>
     * 
     * @return The name of the partnership, used to identify it.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the partnership, used to identify it.
     * </p>
     * 
     * @param name
     *        The name of the partnership, used to identify it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePartnershipResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Returns the email address associated with this trading partner.
     * </p>
     * 
     * @param email
     *        Returns the email address associated with this trading partner.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * Returns the email address associated with this trading partner.
     * </p>
     * 
     * @return Returns the email address associated with this trading partner.
     */

    public String getEmail() {
        return this.email;
    }

    /**
     * <p>
     * Returns the email address associated with this trading partner.
     * </p>
     * 
     * @param email
     *        Returns the email address associated with this trading partner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePartnershipResult withEmail(String email) {
        setEmail(email);
        return this;
    }

    /**
     * <p>
     * Returns the phone number associated with the partnership.
     * </p>
     * 
     * @param phone
     *        Returns the phone number associated with the partnership.
     */

    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * <p>
     * Returns the phone number associated with the partnership.
     * </p>
     * 
     * @return Returns the phone number associated with the partnership.
     */

    public String getPhone() {
        return this.phone;
    }

    /**
     * <p>
     * Returns the phone number associated with the partnership.
     * </p>
     * 
     * @param phone
     *        Returns the phone number associated with the partnership.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePartnershipResult withPhone(String phone) {
        setPhone(phone);
        return this;
    }

    /**
     * <p>
     * Returns one or more capabilities associated with this partnership.
     * </p>
     * 
     * @return Returns one or more capabilities associated with this partnership.
     */

    public java.util.List<String> getCapabilities() {
        return capabilities;
    }

    /**
     * <p>
     * Returns one or more capabilities associated with this partnership.
     * </p>
     * 
     * @param capabilities
     *        Returns one or more capabilities associated with this partnership.
     */

    public void setCapabilities(java.util.Collection<String> capabilities) {
        if (capabilities == null) {
            this.capabilities = null;
            return;
        }

        this.capabilities = new java.util.ArrayList<String>(capabilities);
    }

    /**
     * <p>
     * Returns one or more capabilities associated with this partnership.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCapabilities(java.util.Collection)} or {@link #withCapabilities(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param capabilities
     *        Returns one or more capabilities associated with this partnership.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePartnershipResult withCapabilities(String... capabilities) {
        if (this.capabilities == null) {
            setCapabilities(new java.util.ArrayList<String>(capabilities.length));
        }
        for (String ele : capabilities) {
            this.capabilities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns one or more capabilities associated with this partnership.
     * </p>
     * 
     * @param capabilities
     *        Returns one or more capabilities associated with this partnership.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePartnershipResult withCapabilities(java.util.Collection<String> capabilities) {
        setCapabilities(capabilities);
        return this;
    }

    /**
     * <p>
     * Returns the unique, system-generated identifier for a trading partner.
     * </p>
     * 
     * @param tradingPartnerId
     *        Returns the unique, system-generated identifier for a trading partner.
     */

    public void setTradingPartnerId(String tradingPartnerId) {
        this.tradingPartnerId = tradingPartnerId;
    }

    /**
     * <p>
     * Returns the unique, system-generated identifier for a trading partner.
     * </p>
     * 
     * @return Returns the unique, system-generated identifier for a trading partner.
     */

    public String getTradingPartnerId() {
        return this.tradingPartnerId;
    }

    /**
     * <p>
     * Returns the unique, system-generated identifier for a trading partner.
     * </p>
     * 
     * @param tradingPartnerId
     *        Returns the unique, system-generated identifier for a trading partner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePartnershipResult withTradingPartnerId(String tradingPartnerId) {
        setTradingPartnerId(tradingPartnerId);
        return this;
    }

    /**
     * <p>
     * Returns a timestamp that identifies the most recent date and time that the partnership was modified.
     * </p>
     * 
     * @param createdAt
     *        Returns a timestamp that identifies the most recent date and time that the partnership was modified.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * Returns a timestamp that identifies the most recent date and time that the partnership was modified.
     * </p>
     * 
     * @return Returns a timestamp that identifies the most recent date and time that the partnership was modified.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * Returns a timestamp that identifies the most recent date and time that the partnership was modified.
     * </p>
     * 
     * @param createdAt
     *        Returns a timestamp that identifies the most recent date and time that the partnership was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePartnershipResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Returns a timestamp that identifies the most recent date and time that the partnership was modified.
     * </p>
     * 
     * @param modifiedAt
     *        Returns a timestamp that identifies the most recent date and time that the partnership was modified.
     */

    public void setModifiedAt(java.util.Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    /**
     * <p>
     * Returns a timestamp that identifies the most recent date and time that the partnership was modified.
     * </p>
     * 
     * @return Returns a timestamp that identifies the most recent date and time that the partnership was modified.
     */

    public java.util.Date getModifiedAt() {
        return this.modifiedAt;
    }

    /**
     * <p>
     * Returns a timestamp that identifies the most recent date and time that the partnership was modified.
     * </p>
     * 
     * @param modifiedAt
     *        Returns a timestamp that identifies the most recent date and time that the partnership was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePartnershipResult withModifiedAt(java.util.Date modifiedAt) {
        setModifiedAt(modifiedAt);
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
        if (getProfileId() != null)
            sb.append("ProfileId: ").append(getProfileId()).append(",");
        if (getPartnershipId() != null)
            sb.append("PartnershipId: ").append(getPartnershipId()).append(",");
        if (getPartnershipArn() != null)
            sb.append("PartnershipArn: ").append(getPartnershipArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getEmail() != null)
            sb.append("Email: ").append("***Sensitive Data Redacted***").append(",");
        if (getPhone() != null)
            sb.append("Phone: ").append("***Sensitive Data Redacted***").append(",");
        if (getCapabilities() != null)
            sb.append("Capabilities: ").append(getCapabilities()).append(",");
        if (getTradingPartnerId() != null)
            sb.append("TradingPartnerId: ").append(getTradingPartnerId()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getModifiedAt() != null)
            sb.append("ModifiedAt: ").append(getModifiedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePartnershipResult == false)
            return false;
        UpdatePartnershipResult other = (UpdatePartnershipResult) obj;
        if (other.getProfileId() == null ^ this.getProfileId() == null)
            return false;
        if (other.getProfileId() != null && other.getProfileId().equals(this.getProfileId()) == false)
            return false;
        if (other.getPartnershipId() == null ^ this.getPartnershipId() == null)
            return false;
        if (other.getPartnershipId() != null && other.getPartnershipId().equals(this.getPartnershipId()) == false)
            return false;
        if (other.getPartnershipArn() == null ^ this.getPartnershipArn() == null)
            return false;
        if (other.getPartnershipArn() != null && other.getPartnershipArn().equals(this.getPartnershipArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getPhone() == null ^ this.getPhone() == null)
            return false;
        if (other.getPhone() != null && other.getPhone().equals(this.getPhone()) == false)
            return false;
        if (other.getCapabilities() == null ^ this.getCapabilities() == null)
            return false;
        if (other.getCapabilities() != null && other.getCapabilities().equals(this.getCapabilities()) == false)
            return false;
        if (other.getTradingPartnerId() == null ^ this.getTradingPartnerId() == null)
            return false;
        if (other.getTradingPartnerId() != null && other.getTradingPartnerId().equals(this.getTradingPartnerId()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getModifiedAt() == null ^ this.getModifiedAt() == null)
            return false;
        if (other.getModifiedAt() != null && other.getModifiedAt().equals(this.getModifiedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProfileId() == null) ? 0 : getProfileId().hashCode());
        hashCode = prime * hashCode + ((getPartnershipId() == null) ? 0 : getPartnershipId().hashCode());
        hashCode = prime * hashCode + ((getPartnershipArn() == null) ? 0 : getPartnershipArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getPhone() == null) ? 0 : getPhone().hashCode());
        hashCode = prime * hashCode + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
        hashCode = prime * hashCode + ((getTradingPartnerId() == null) ? 0 : getTradingPartnerId().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getModifiedAt() == null) ? 0 : getModifiedAt().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePartnershipResult clone() {
        try {
            return (UpdatePartnershipResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
