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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The user type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UserType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The user name of the user you wish to describe.
     * </p>
     */
    private String username;
    /**
     * <p>
     * A container with information about the user type attributes.
     * </p>
     */
    private java.util.List<AttributeType> attributes;
    /**
     * <p>
     * The creation date of the user.
     * </p>
     */
    private java.util.Date userCreateDate;
    /**
     * <p>
     * The last modified date of the user.
     * </p>
     */
    private java.util.Date userLastModifiedDate;
    /**
     * <p>
     * Specifies whether the user is enabled.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The user status. Can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * UNCONFIRMED - User has been created but not confirmed.
     * </p>
     * </li>
     * <li>
     * <p>
     * CONFIRMED - User has been confirmed.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARCHIVED - User is no longer active.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPROMISED - User is disabled due to a potential security threat.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN - User status is not known.
     * </p>
     * </li>
     * <li>
     * <p>
     * RESET_REQUIRED - User is confirmed, but the user must request a code and reset his or her password before he or
     * she can sign in.
     * </p>
     * </li>
     * <li>
     * <p>
     * FORCE_CHANGE_PASSWORD - The user is confirmed and the user can sign in using a temporary password, but on first
     * sign-in, the user must change his or her password to a new value before doing anything else.
     * </p>
     * </li>
     * </ul>
     */
    private String userStatus;
    /**
     * <p>
     * The MFA options for the user.
     * </p>
     */
    private java.util.List<MFAOptionType> mFAOptions;

    /**
     * <p>
     * The user name of the user you wish to describe.
     * </p>
     * 
     * @param username
     *        The user name of the user you wish to describe.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name of the user you wish to describe.
     * </p>
     * 
     * @return The user name of the user you wish to describe.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The user name of the user you wish to describe.
     * </p>
     * 
     * @param username
     *        The user name of the user you wish to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserType withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * A container with information about the user type attributes.
     * </p>
     * 
     * @return A container with information about the user type attributes.
     */

    public java.util.List<AttributeType> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * A container with information about the user type attributes.
     * </p>
     * 
     * @param attributes
     *        A container with information about the user type attributes.
     */

    public void setAttributes(java.util.Collection<AttributeType> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new java.util.ArrayList<AttributeType>(attributes);
    }

    /**
     * <p>
     * A container with information about the user type attributes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributes(java.util.Collection)} or {@link #withAttributes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attributes
     *        A container with information about the user type attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserType withAttributes(AttributeType... attributes) {
        if (this.attributes == null) {
            setAttributes(new java.util.ArrayList<AttributeType>(attributes.length));
        }
        for (AttributeType ele : attributes) {
            this.attributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A container with information about the user type attributes.
     * </p>
     * 
     * @param attributes
     *        A container with information about the user type attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserType withAttributes(java.util.Collection<AttributeType> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * <p>
     * The creation date of the user.
     * </p>
     * 
     * @param userCreateDate
     *        The creation date of the user.
     */

    public void setUserCreateDate(java.util.Date userCreateDate) {
        this.userCreateDate = userCreateDate;
    }

    /**
     * <p>
     * The creation date of the user.
     * </p>
     * 
     * @return The creation date of the user.
     */

    public java.util.Date getUserCreateDate() {
        return this.userCreateDate;
    }

    /**
     * <p>
     * The creation date of the user.
     * </p>
     * 
     * @param userCreateDate
     *        The creation date of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserType withUserCreateDate(java.util.Date userCreateDate) {
        setUserCreateDate(userCreateDate);
        return this;
    }

    /**
     * <p>
     * The last modified date of the user.
     * </p>
     * 
     * @param userLastModifiedDate
     *        The last modified date of the user.
     */

    public void setUserLastModifiedDate(java.util.Date userLastModifiedDate) {
        this.userLastModifiedDate = userLastModifiedDate;
    }

    /**
     * <p>
     * The last modified date of the user.
     * </p>
     * 
     * @return The last modified date of the user.
     */

    public java.util.Date getUserLastModifiedDate() {
        return this.userLastModifiedDate;
    }

    /**
     * <p>
     * The last modified date of the user.
     * </p>
     * 
     * @param userLastModifiedDate
     *        The last modified date of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserType withUserLastModifiedDate(java.util.Date userLastModifiedDate) {
        setUserLastModifiedDate(userLastModifiedDate);
        return this;
    }

    /**
     * <p>
     * Specifies whether the user is enabled.
     * </p>
     * 
     * @param enabled
     *        Specifies whether the user is enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether the user is enabled.
     * </p>
     * 
     * @return Specifies whether the user is enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies whether the user is enabled.
     * </p>
     * 
     * @param enabled
     *        Specifies whether the user is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserType withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether the user is enabled.
     * </p>
     * 
     * @return Specifies whether the user is enabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The user status. Can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * UNCONFIRMED - User has been created but not confirmed.
     * </p>
     * </li>
     * <li>
     * <p>
     * CONFIRMED - User has been confirmed.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARCHIVED - User is no longer active.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPROMISED - User is disabled due to a potential security threat.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN - User status is not known.
     * </p>
     * </li>
     * <li>
     * <p>
     * RESET_REQUIRED - User is confirmed, but the user must request a code and reset his or her password before he or
     * she can sign in.
     * </p>
     * </li>
     * <li>
     * <p>
     * FORCE_CHANGE_PASSWORD - The user is confirmed and the user can sign in using a temporary password, but on first
     * sign-in, the user must change his or her password to a new value before doing anything else.
     * </p>
     * </li>
     * </ul>
     * 
     * @param userStatus
     *        The user status. Can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        UNCONFIRMED - User has been created but not confirmed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CONFIRMED - User has been confirmed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARCHIVED - User is no longer active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        COMPROMISED - User is disabled due to a potential security threat.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNKNOWN - User status is not known.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RESET_REQUIRED - User is confirmed, but the user must request a code and reset his or her password before
     *        he or she can sign in.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FORCE_CHANGE_PASSWORD - The user is confirmed and the user can sign in using a temporary password, but on
     *        first sign-in, the user must change his or her password to a new value before doing anything else.
     *        </p>
     *        </li>
     * @see UserStatusType
     */

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * <p>
     * The user status. Can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * UNCONFIRMED - User has been created but not confirmed.
     * </p>
     * </li>
     * <li>
     * <p>
     * CONFIRMED - User has been confirmed.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARCHIVED - User is no longer active.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPROMISED - User is disabled due to a potential security threat.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN - User status is not known.
     * </p>
     * </li>
     * <li>
     * <p>
     * RESET_REQUIRED - User is confirmed, but the user must request a code and reset his or her password before he or
     * she can sign in.
     * </p>
     * </li>
     * <li>
     * <p>
     * FORCE_CHANGE_PASSWORD - The user is confirmed and the user can sign in using a temporary password, but on first
     * sign-in, the user must change his or her password to a new value before doing anything else.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The user status. Can be one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         UNCONFIRMED - User has been created but not confirmed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CONFIRMED - User has been confirmed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ARCHIVED - User is no longer active.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         COMPROMISED - User is disabled due to a potential security threat.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNKNOWN - User status is not known.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RESET_REQUIRED - User is confirmed, but the user must request a code and reset his or her password before
     *         he or she can sign in.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FORCE_CHANGE_PASSWORD - The user is confirmed and the user can sign in using a temporary password, but on
     *         first sign-in, the user must change his or her password to a new value before doing anything else.
     *         </p>
     *         </li>
     * @see UserStatusType
     */

    public String getUserStatus() {
        return this.userStatus;
    }

    /**
     * <p>
     * The user status. Can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * UNCONFIRMED - User has been created but not confirmed.
     * </p>
     * </li>
     * <li>
     * <p>
     * CONFIRMED - User has been confirmed.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARCHIVED - User is no longer active.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPROMISED - User is disabled due to a potential security threat.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN - User status is not known.
     * </p>
     * </li>
     * <li>
     * <p>
     * RESET_REQUIRED - User is confirmed, but the user must request a code and reset his or her password before he or
     * she can sign in.
     * </p>
     * </li>
     * <li>
     * <p>
     * FORCE_CHANGE_PASSWORD - The user is confirmed and the user can sign in using a temporary password, but on first
     * sign-in, the user must change his or her password to a new value before doing anything else.
     * </p>
     * </li>
     * </ul>
     * 
     * @param userStatus
     *        The user status. Can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        UNCONFIRMED - User has been created but not confirmed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CONFIRMED - User has been confirmed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARCHIVED - User is no longer active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        COMPROMISED - User is disabled due to a potential security threat.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNKNOWN - User status is not known.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RESET_REQUIRED - User is confirmed, but the user must request a code and reset his or her password before
     *        he or she can sign in.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FORCE_CHANGE_PASSWORD - The user is confirmed and the user can sign in using a temporary password, but on
     *        first sign-in, the user must change his or her password to a new value before doing anything else.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserStatusType
     */

    public UserType withUserStatus(String userStatus) {
        setUserStatus(userStatus);
        return this;
    }

    /**
     * <p>
     * The user status. Can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * UNCONFIRMED - User has been created but not confirmed.
     * </p>
     * </li>
     * <li>
     * <p>
     * CONFIRMED - User has been confirmed.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARCHIVED - User is no longer active.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPROMISED - User is disabled due to a potential security threat.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN - User status is not known.
     * </p>
     * </li>
     * <li>
     * <p>
     * RESET_REQUIRED - User is confirmed, but the user must request a code and reset his or her password before he or
     * she can sign in.
     * </p>
     * </li>
     * <li>
     * <p>
     * FORCE_CHANGE_PASSWORD - The user is confirmed and the user can sign in using a temporary password, but on first
     * sign-in, the user must change his or her password to a new value before doing anything else.
     * </p>
     * </li>
     * </ul>
     * 
     * @param userStatus
     *        The user status. Can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        UNCONFIRMED - User has been created but not confirmed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CONFIRMED - User has been confirmed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARCHIVED - User is no longer active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        COMPROMISED - User is disabled due to a potential security threat.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNKNOWN - User status is not known.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RESET_REQUIRED - User is confirmed, but the user must request a code and reset his or her password before
     *        he or she can sign in.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FORCE_CHANGE_PASSWORD - The user is confirmed and the user can sign in using a temporary password, but on
     *        first sign-in, the user must change his or her password to a new value before doing anything else.
     *        </p>
     *        </li>
     * @see UserStatusType
     */

    public void setUserStatus(UserStatusType userStatus) {
        withUserStatus(userStatus);
    }

    /**
     * <p>
     * The user status. Can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * UNCONFIRMED - User has been created but not confirmed.
     * </p>
     * </li>
     * <li>
     * <p>
     * CONFIRMED - User has been confirmed.
     * </p>
     * </li>
     * <li>
     * <p>
     * ARCHIVED - User is no longer active.
     * </p>
     * </li>
     * <li>
     * <p>
     * COMPROMISED - User is disabled due to a potential security threat.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN - User status is not known.
     * </p>
     * </li>
     * <li>
     * <p>
     * RESET_REQUIRED - User is confirmed, but the user must request a code and reset his or her password before he or
     * she can sign in.
     * </p>
     * </li>
     * <li>
     * <p>
     * FORCE_CHANGE_PASSWORD - The user is confirmed and the user can sign in using a temporary password, but on first
     * sign-in, the user must change his or her password to a new value before doing anything else.
     * </p>
     * </li>
     * </ul>
     * 
     * @param userStatus
     *        The user status. Can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        UNCONFIRMED - User has been created but not confirmed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CONFIRMED - User has been confirmed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARCHIVED - User is no longer active.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        COMPROMISED - User is disabled due to a potential security threat.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        UNKNOWN - User status is not known.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RESET_REQUIRED - User is confirmed, but the user must request a code and reset his or her password before
     *        he or she can sign in.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FORCE_CHANGE_PASSWORD - The user is confirmed and the user can sign in using a temporary password, but on
     *        first sign-in, the user must change his or her password to a new value before doing anything else.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UserStatusType
     */

    public UserType withUserStatus(UserStatusType userStatus) {
        this.userStatus = userStatus.toString();
        return this;
    }

    /**
     * <p>
     * The MFA options for the user.
     * </p>
     * 
     * @return The MFA options for the user.
     */

    public java.util.List<MFAOptionType> getMFAOptions() {
        return mFAOptions;
    }

    /**
     * <p>
     * The MFA options for the user.
     * </p>
     * 
     * @param mFAOptions
     *        The MFA options for the user.
     */

    public void setMFAOptions(java.util.Collection<MFAOptionType> mFAOptions) {
        if (mFAOptions == null) {
            this.mFAOptions = null;
            return;
        }

        this.mFAOptions = new java.util.ArrayList<MFAOptionType>(mFAOptions);
    }

    /**
     * <p>
     * The MFA options for the user.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMFAOptions(java.util.Collection)} or {@link #withMFAOptions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param mFAOptions
     *        The MFA options for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserType withMFAOptions(MFAOptionType... mFAOptions) {
        if (this.mFAOptions == null) {
            setMFAOptions(new java.util.ArrayList<MFAOptionType>(mFAOptions.length));
        }
        for (MFAOptionType ele : mFAOptions) {
            this.mFAOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The MFA options for the user.
     * </p>
     * 
     * @param mFAOptions
     *        The MFA options for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserType withMFAOptions(java.util.Collection<MFAOptionType> mFAOptions) {
        setMFAOptions(mFAOptions);
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
        if (getUsername() != null)
            sb.append("Username: ").append("***Sensitive Data Redacted***").append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes()).append(",");
        if (getUserCreateDate() != null)
            sb.append("UserCreateDate: ").append(getUserCreateDate()).append(",");
        if (getUserLastModifiedDate() != null)
            sb.append("UserLastModifiedDate: ").append(getUserLastModifiedDate()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getUserStatus() != null)
            sb.append("UserStatus: ").append(getUserStatus()).append(",");
        if (getMFAOptions() != null)
            sb.append("MFAOptions: ").append(getMFAOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserType == false)
            return false;
        UserType other = (UserType) obj;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        if (other.getUserCreateDate() == null ^ this.getUserCreateDate() == null)
            return false;
        if (other.getUserCreateDate() != null && other.getUserCreateDate().equals(this.getUserCreateDate()) == false)
            return false;
        if (other.getUserLastModifiedDate() == null ^ this.getUserLastModifiedDate() == null)
            return false;
        if (other.getUserLastModifiedDate() != null && other.getUserLastModifiedDate().equals(this.getUserLastModifiedDate()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getUserStatus() == null ^ this.getUserStatus() == null)
            return false;
        if (other.getUserStatus() != null && other.getUserStatus().equals(this.getUserStatus()) == false)
            return false;
        if (other.getMFAOptions() == null ^ this.getMFAOptions() == null)
            return false;
        if (other.getMFAOptions() != null && other.getMFAOptions().equals(this.getMFAOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        hashCode = prime * hashCode + ((getUserCreateDate() == null) ? 0 : getUserCreateDate().hashCode());
        hashCode = prime * hashCode + ((getUserLastModifiedDate() == null) ? 0 : getUserLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getUserStatus() == null) ? 0 : getUserStatus().hashCode());
        hashCode = prime * hashCode + ((getMFAOptions() == null) ? 0 : getMFAOptions().hashCode());
        return hashCode;
    }

    @Override
    public UserType clone() {
        try {
            return (UserType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.UserTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
