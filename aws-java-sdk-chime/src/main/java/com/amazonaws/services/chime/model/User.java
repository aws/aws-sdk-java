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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The user on the Amazon Chime account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/User" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class User implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The user ID.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The primary email address of the user.
     * </p>
     */
    private String primaryEmail;
    /**
     * <p>
     * The primary phone number associated with the user.
     * </p>
     */
    private String primaryProvisionedNumber;
    /**
     * <p>
     * The display name of the user.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The license type for the user.
     * </p>
     */
    private String licenseType;
    /**
     * <p>
     * The user registration status.
     * </p>
     */
    private String userRegistrationStatus;
    /**
     * <p>
     * The user invite status.
     * </p>
     */
    private String userInvitationStatus;
    /**
     * <p>
     * Date and time when the user is registered, in ISO 8601 format.
     * </p>
     */
    private java.util.Date registeredOn;
    /**
     * <p>
     * Date and time when the user is invited to the Amazon Chime account, in ISO 8601 format.
     * </p>
     */
    private java.util.Date invitedOn;
    /**
     * <p>
     * The user's personal meeting PIN.
     * </p>
     */
    private String personalPIN;

    /**
     * <p>
     * The user ID.
     * </p>
     * 
     * @param userId
     *        The user ID.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The user ID.
     * </p>
     * 
     * @return The user ID.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The user ID.
     * </p>
     * 
     * @param userId
     *        The user ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * 
     * @param accountId
     *        The Amazon Chime account ID.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * 
     * @return The Amazon Chime account ID.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * 
     * @param accountId
     *        The Amazon Chime account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The primary email address of the user.
     * </p>
     * 
     * @param primaryEmail
     *        The primary email address of the user.
     */

    public void setPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
    }

    /**
     * <p>
     * The primary email address of the user.
     * </p>
     * 
     * @return The primary email address of the user.
     */

    public String getPrimaryEmail() {
        return this.primaryEmail;
    }

    /**
     * <p>
     * The primary email address of the user.
     * </p>
     * 
     * @param primaryEmail
     *        The primary email address of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withPrimaryEmail(String primaryEmail) {
        setPrimaryEmail(primaryEmail);
        return this;
    }

    /**
     * <p>
     * The primary phone number associated with the user.
     * </p>
     * 
     * @param primaryProvisionedNumber
     *        The primary phone number associated with the user.
     */

    public void setPrimaryProvisionedNumber(String primaryProvisionedNumber) {
        this.primaryProvisionedNumber = primaryProvisionedNumber;
    }

    /**
     * <p>
     * The primary phone number associated with the user.
     * </p>
     * 
     * @return The primary phone number associated with the user.
     */

    public String getPrimaryProvisionedNumber() {
        return this.primaryProvisionedNumber;
    }

    /**
     * <p>
     * The primary phone number associated with the user.
     * </p>
     * 
     * @param primaryProvisionedNumber
     *        The primary phone number associated with the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withPrimaryProvisionedNumber(String primaryProvisionedNumber) {
        setPrimaryProvisionedNumber(primaryProvisionedNumber);
        return this;
    }

    /**
     * <p>
     * The display name of the user.
     * </p>
     * 
     * @param displayName
     *        The display name of the user.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the user.
     * </p>
     * 
     * @return The display name of the user.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name of the user.
     * </p>
     * 
     * @param displayName
     *        The display name of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The license type for the user.
     * </p>
     * 
     * @param licenseType
     *        The license type for the user.
     * @see License
     */

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    /**
     * <p>
     * The license type for the user.
     * </p>
     * 
     * @return The license type for the user.
     * @see License
     */

    public String getLicenseType() {
        return this.licenseType;
    }

    /**
     * <p>
     * The license type for the user.
     * </p>
     * 
     * @param licenseType
     *        The license type for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see License
     */

    public User withLicenseType(String licenseType) {
        setLicenseType(licenseType);
        return this;
    }

    /**
     * <p>
     * The license type for the user.
     * </p>
     * 
     * @param licenseType
     *        The license type for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see License
     */

    public User withLicenseType(License licenseType) {
        this.licenseType = licenseType.toString();
        return this;
    }

    /**
     * <p>
     * The user registration status.
     * </p>
     * 
     * @param userRegistrationStatus
     *        The user registration status.
     * @see RegistrationStatus
     */

    public void setUserRegistrationStatus(String userRegistrationStatus) {
        this.userRegistrationStatus = userRegistrationStatus;
    }

    /**
     * <p>
     * The user registration status.
     * </p>
     * 
     * @return The user registration status.
     * @see RegistrationStatus
     */

    public String getUserRegistrationStatus() {
        return this.userRegistrationStatus;
    }

    /**
     * <p>
     * The user registration status.
     * </p>
     * 
     * @param userRegistrationStatus
     *        The user registration status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistrationStatus
     */

    public User withUserRegistrationStatus(String userRegistrationStatus) {
        setUserRegistrationStatus(userRegistrationStatus);
        return this;
    }

    /**
     * <p>
     * The user registration status.
     * </p>
     * 
     * @param userRegistrationStatus
     *        The user registration status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistrationStatus
     */

    public User withUserRegistrationStatus(RegistrationStatus userRegistrationStatus) {
        this.userRegistrationStatus = userRegistrationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The user invite status.
     * </p>
     * 
     * @param userInvitationStatus
     *        The user invite status.
     * @see InviteStatus
     */

    public void setUserInvitationStatus(String userInvitationStatus) {
        this.userInvitationStatus = userInvitationStatus;
    }

    /**
     * <p>
     * The user invite status.
     * </p>
     * 
     * @return The user invite status.
     * @see InviteStatus
     */

    public String getUserInvitationStatus() {
        return this.userInvitationStatus;
    }

    /**
     * <p>
     * The user invite status.
     * </p>
     * 
     * @param userInvitationStatus
     *        The user invite status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InviteStatus
     */

    public User withUserInvitationStatus(String userInvitationStatus) {
        setUserInvitationStatus(userInvitationStatus);
        return this;
    }

    /**
     * <p>
     * The user invite status.
     * </p>
     * 
     * @param userInvitationStatus
     *        The user invite status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InviteStatus
     */

    public User withUserInvitationStatus(InviteStatus userInvitationStatus) {
        this.userInvitationStatus = userInvitationStatus.toString();
        return this;
    }

    /**
     * <p>
     * Date and time when the user is registered, in ISO 8601 format.
     * </p>
     * 
     * @param registeredOn
     *        Date and time when the user is registered, in ISO 8601 format.
     */

    public void setRegisteredOn(java.util.Date registeredOn) {
        this.registeredOn = registeredOn;
    }

    /**
     * <p>
     * Date and time when the user is registered, in ISO 8601 format.
     * </p>
     * 
     * @return Date and time when the user is registered, in ISO 8601 format.
     */

    public java.util.Date getRegisteredOn() {
        return this.registeredOn;
    }

    /**
     * <p>
     * Date and time when the user is registered, in ISO 8601 format.
     * </p>
     * 
     * @param registeredOn
     *        Date and time when the user is registered, in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withRegisteredOn(java.util.Date registeredOn) {
        setRegisteredOn(registeredOn);
        return this;
    }

    /**
     * <p>
     * Date and time when the user is invited to the Amazon Chime account, in ISO 8601 format.
     * </p>
     * 
     * @param invitedOn
     *        Date and time when the user is invited to the Amazon Chime account, in ISO 8601 format.
     */

    public void setInvitedOn(java.util.Date invitedOn) {
        this.invitedOn = invitedOn;
    }

    /**
     * <p>
     * Date and time when the user is invited to the Amazon Chime account, in ISO 8601 format.
     * </p>
     * 
     * @return Date and time when the user is invited to the Amazon Chime account, in ISO 8601 format.
     */

    public java.util.Date getInvitedOn() {
        return this.invitedOn;
    }

    /**
     * <p>
     * Date and time when the user is invited to the Amazon Chime account, in ISO 8601 format.
     * </p>
     * 
     * @param invitedOn
     *        Date and time when the user is invited to the Amazon Chime account, in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withInvitedOn(java.util.Date invitedOn) {
        setInvitedOn(invitedOn);
        return this;
    }

    /**
     * <p>
     * The user's personal meeting PIN.
     * </p>
     * 
     * @param personalPIN
     *        The user's personal meeting PIN.
     */

    public void setPersonalPIN(String personalPIN) {
        this.personalPIN = personalPIN;
    }

    /**
     * <p>
     * The user's personal meeting PIN.
     * </p>
     * 
     * @return The user's personal meeting PIN.
     */

    public String getPersonalPIN() {
        return this.personalPIN;
    }

    /**
     * <p>
     * The user's personal meeting PIN.
     * </p>
     * 
     * @param personalPIN
     *        The user's personal meeting PIN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public User withPersonalPIN(String personalPIN) {
        setPersonalPIN(personalPIN);
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
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getPrimaryEmail() != null)
            sb.append("PrimaryEmail: ").append("***Sensitive Data Redacted***").append(",");
        if (getPrimaryProvisionedNumber() != null)
            sb.append("PrimaryProvisionedNumber: ").append("***Sensitive Data Redacted***").append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append("***Sensitive Data Redacted***").append(",");
        if (getLicenseType() != null)
            sb.append("LicenseType: ").append(getLicenseType()).append(",");
        if (getUserRegistrationStatus() != null)
            sb.append("UserRegistrationStatus: ").append(getUserRegistrationStatus()).append(",");
        if (getUserInvitationStatus() != null)
            sb.append("UserInvitationStatus: ").append(getUserInvitationStatus()).append(",");
        if (getRegisteredOn() != null)
            sb.append("RegisteredOn: ").append(getRegisteredOn()).append(",");
        if (getInvitedOn() != null)
            sb.append("InvitedOn: ").append(getInvitedOn()).append(",");
        if (getPersonalPIN() != null)
            sb.append("PersonalPIN: ").append(getPersonalPIN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof User == false)
            return false;
        User other = (User) obj;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getPrimaryEmail() == null ^ this.getPrimaryEmail() == null)
            return false;
        if (other.getPrimaryEmail() != null && other.getPrimaryEmail().equals(this.getPrimaryEmail()) == false)
            return false;
        if (other.getPrimaryProvisionedNumber() == null ^ this.getPrimaryProvisionedNumber() == null)
            return false;
        if (other.getPrimaryProvisionedNumber() != null && other.getPrimaryProvisionedNumber().equals(this.getPrimaryProvisionedNumber()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getLicenseType() == null ^ this.getLicenseType() == null)
            return false;
        if (other.getLicenseType() != null && other.getLicenseType().equals(this.getLicenseType()) == false)
            return false;
        if (other.getUserRegistrationStatus() == null ^ this.getUserRegistrationStatus() == null)
            return false;
        if (other.getUserRegistrationStatus() != null && other.getUserRegistrationStatus().equals(this.getUserRegistrationStatus()) == false)
            return false;
        if (other.getUserInvitationStatus() == null ^ this.getUserInvitationStatus() == null)
            return false;
        if (other.getUserInvitationStatus() != null && other.getUserInvitationStatus().equals(this.getUserInvitationStatus()) == false)
            return false;
        if (other.getRegisteredOn() == null ^ this.getRegisteredOn() == null)
            return false;
        if (other.getRegisteredOn() != null && other.getRegisteredOn().equals(this.getRegisteredOn()) == false)
            return false;
        if (other.getInvitedOn() == null ^ this.getInvitedOn() == null)
            return false;
        if (other.getInvitedOn() != null && other.getInvitedOn().equals(this.getInvitedOn()) == false)
            return false;
        if (other.getPersonalPIN() == null ^ this.getPersonalPIN() == null)
            return false;
        if (other.getPersonalPIN() != null && other.getPersonalPIN().equals(this.getPersonalPIN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getPrimaryEmail() == null) ? 0 : getPrimaryEmail().hashCode());
        hashCode = prime * hashCode + ((getPrimaryProvisionedNumber() == null) ? 0 : getPrimaryProvisionedNumber().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getLicenseType() == null) ? 0 : getLicenseType().hashCode());
        hashCode = prime * hashCode + ((getUserRegistrationStatus() == null) ? 0 : getUserRegistrationStatus().hashCode());
        hashCode = prime * hashCode + ((getUserInvitationStatus() == null) ? 0 : getUserInvitationStatus().hashCode());
        hashCode = prime * hashCode + ((getRegisteredOn() == null) ? 0 : getRegisteredOn().hashCode());
        hashCode = prime * hashCode + ((getInvitedOn() == null) ? 0 : getInvitedOn().hashCode());
        hashCode = prime * hashCode + ((getPersonalPIN() == null) ? 0 : getPersonalPIN().hashCode());
        return hashCode;
    }

    @Override
    public User clone() {
        try {
            return (User) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.UserMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
