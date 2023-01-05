/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the identity of a user.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/UserIdentityInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserIdentityInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The first name. This is required if you are using Amazon Connect or SAML for identity management.
     * </p>
     */
    private String firstName;
    /**
     * <p>
     * The last name. This is required if you are using Amazon Connect or SAML for identity management.
     * </p>
     */
    private String lastName;
    /**
     * <p>
     * The email address. If you are using SAML for identity management and include this parameter, an error is
     * returned.
     * </p>
     */
    private String email;
    /**
     * <p>
     * The user's secondary email address. If you provide a secondary email, the user receives email notifications -
     * other than password reset notifications - to this email address instead of to their primary email address.
     * </p>
     * <p>
     * Pattern: <code>(?=^.{0,265}$)[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,63}</code>
     * </p>
     */
    private String secondaryEmail;
    /**
     * <p>
     * The user's mobile number.
     * </p>
     */
    private String mobile;

    /**
     * <p>
     * The first name. This is required if you are using Amazon Connect or SAML for identity management.
     * </p>
     * 
     * @param firstName
     *        The first name. This is required if you are using Amazon Connect or SAML for identity management.
     */

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * <p>
     * The first name. This is required if you are using Amazon Connect or SAML for identity management.
     * </p>
     * 
     * @return The first name. This is required if you are using Amazon Connect or SAML for identity management.
     */

    public String getFirstName() {
        return this.firstName;
    }

    /**
     * <p>
     * The first name. This is required if you are using Amazon Connect or SAML for identity management.
     * </p>
     * 
     * @param firstName
     *        The first name. This is required if you are using Amazon Connect or SAML for identity management.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserIdentityInfo withFirstName(String firstName) {
        setFirstName(firstName);
        return this;
    }

    /**
     * <p>
     * The last name. This is required if you are using Amazon Connect or SAML for identity management.
     * </p>
     * 
     * @param lastName
     *        The last name. This is required if you are using Amazon Connect or SAML for identity management.
     */

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * <p>
     * The last name. This is required if you are using Amazon Connect or SAML for identity management.
     * </p>
     * 
     * @return The last name. This is required if you are using Amazon Connect or SAML for identity management.
     */

    public String getLastName() {
        return this.lastName;
    }

    /**
     * <p>
     * The last name. This is required if you are using Amazon Connect or SAML for identity management.
     * </p>
     * 
     * @param lastName
     *        The last name. This is required if you are using Amazon Connect or SAML for identity management.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserIdentityInfo withLastName(String lastName) {
        setLastName(lastName);
        return this;
    }

    /**
     * <p>
     * The email address. If you are using SAML for identity management and include this parameter, an error is
     * returned.
     * </p>
     * 
     * @param email
     *        The email address. If you are using SAML for identity management and include this parameter, an error is
     *        returned.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email address. If you are using SAML for identity management and include this parameter, an error is
     * returned.
     * </p>
     * 
     * @return The email address. If you are using SAML for identity management and include this parameter, an error is
     *         returned.
     */

    public String getEmail() {
        return this.email;
    }

    /**
     * <p>
     * The email address. If you are using SAML for identity management and include this parameter, an error is
     * returned.
     * </p>
     * 
     * @param email
     *        The email address. If you are using SAML for identity management and include this parameter, an error is
     *        returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserIdentityInfo withEmail(String email) {
        setEmail(email);
        return this;
    }

    /**
     * <p>
     * The user's secondary email address. If you provide a secondary email, the user receives email notifications -
     * other than password reset notifications - to this email address instead of to their primary email address.
     * </p>
     * <p>
     * Pattern: <code>(?=^.{0,265}$)[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,63}</code>
     * </p>
     * 
     * @param secondaryEmail
     *        The user's secondary email address. If you provide a secondary email, the user receives email
     *        notifications - other than password reset notifications - to this email address instead of to their
     *        primary email address.</p>
     *        <p>
     *        Pattern: <code>(?=^.{0,265}$)[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,63}</code>
     */

    public void setSecondaryEmail(String secondaryEmail) {
        this.secondaryEmail = secondaryEmail;
    }

    /**
     * <p>
     * The user's secondary email address. If you provide a secondary email, the user receives email notifications -
     * other than password reset notifications - to this email address instead of to their primary email address.
     * </p>
     * <p>
     * Pattern: <code>(?=^.{0,265}$)[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,63}</code>
     * </p>
     * 
     * @return The user's secondary email address. If you provide a secondary email, the user receives email
     *         notifications - other than password reset notifications - to this email address instead of to their
     *         primary email address.</p>
     *         <p>
     *         Pattern: <code>(?=^.{0,265}$)[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,63}</code>
     */

    public String getSecondaryEmail() {
        return this.secondaryEmail;
    }

    /**
     * <p>
     * The user's secondary email address. If you provide a secondary email, the user receives email notifications -
     * other than password reset notifications - to this email address instead of to their primary email address.
     * </p>
     * <p>
     * Pattern: <code>(?=^.{0,265}$)[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,63}</code>
     * </p>
     * 
     * @param secondaryEmail
     *        The user's secondary email address. If you provide a secondary email, the user receives email
     *        notifications - other than password reset notifications - to this email address instead of to their
     *        primary email address.</p>
     *        <p>
     *        Pattern: <code>(?=^.{0,265}$)[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,63}</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserIdentityInfo withSecondaryEmail(String secondaryEmail) {
        setSecondaryEmail(secondaryEmail);
        return this;
    }

    /**
     * <p>
     * The user's mobile number.
     * </p>
     * 
     * @param mobile
     *        The user's mobile number.
     */

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * <p>
     * The user's mobile number.
     * </p>
     * 
     * @return The user's mobile number.
     */

    public String getMobile() {
        return this.mobile;
    }

    /**
     * <p>
     * The user's mobile number.
     * </p>
     * 
     * @param mobile
     *        The user's mobile number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserIdentityInfo withMobile(String mobile) {
        setMobile(mobile);
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
        if (getFirstName() != null)
            sb.append("FirstName: ").append(getFirstName()).append(",");
        if (getLastName() != null)
            sb.append("LastName: ").append(getLastName()).append(",");
        if (getEmail() != null)
            sb.append("Email: ").append(getEmail()).append(",");
        if (getSecondaryEmail() != null)
            sb.append("SecondaryEmail: ").append(getSecondaryEmail()).append(",");
        if (getMobile() != null)
            sb.append("Mobile: ").append(getMobile());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserIdentityInfo == false)
            return false;
        UserIdentityInfo other = (UserIdentityInfo) obj;
        if (other.getFirstName() == null ^ this.getFirstName() == null)
            return false;
        if (other.getFirstName() != null && other.getFirstName().equals(this.getFirstName()) == false)
            return false;
        if (other.getLastName() == null ^ this.getLastName() == null)
            return false;
        if (other.getLastName() != null && other.getLastName().equals(this.getLastName()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getSecondaryEmail() == null ^ this.getSecondaryEmail() == null)
            return false;
        if (other.getSecondaryEmail() != null && other.getSecondaryEmail().equals(this.getSecondaryEmail()) == false)
            return false;
        if (other.getMobile() == null ^ this.getMobile() == null)
            return false;
        if (other.getMobile() != null && other.getMobile().equals(this.getMobile()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFirstName() == null) ? 0 : getFirstName().hashCode());
        hashCode = prime * hashCode + ((getLastName() == null) ? 0 : getLastName().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getSecondaryEmail() == null) ? 0 : getSecondaryEmail().hashCode());
        hashCode = prime * hashCode + ((getMobile() == null) ? 0 : getMobile().hashCode());
        return hashCode;
    }

    @Override
    public UserIdentityInfo clone() {
        try {
            return (UserIdentityInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.UserIdentityInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
