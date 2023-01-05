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
package com.amazonaws.services.account.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains the details of an alternate contact associated with an Amazon Web Services account
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/account-2021-02-01/AlternateContact" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AlternateContact implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of alternate contact.
     * </p>
     */
    private String alternateContactType;
    /**
     * <p>
     * The email address associated with this alternate contact.
     * </p>
     */
    private String emailAddress;
    /**
     * <p>
     * The name associated with this alternate contact.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The phone number associated with this alternate contact.
     * </p>
     */
    private String phoneNumber;
    /**
     * <p>
     * The title associated with this alternate contact.
     * </p>
     */
    private String title;

    /**
     * <p>
     * The type of alternate contact.
     * </p>
     * 
     * @param alternateContactType
     *        The type of alternate contact.
     * @see AlternateContactType
     */

    public void setAlternateContactType(String alternateContactType) {
        this.alternateContactType = alternateContactType;
    }

    /**
     * <p>
     * The type of alternate contact.
     * </p>
     * 
     * @return The type of alternate contact.
     * @see AlternateContactType
     */

    public String getAlternateContactType() {
        return this.alternateContactType;
    }

    /**
     * <p>
     * The type of alternate contact.
     * </p>
     * 
     * @param alternateContactType
     *        The type of alternate contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlternateContactType
     */

    public AlternateContact withAlternateContactType(String alternateContactType) {
        setAlternateContactType(alternateContactType);
        return this;
    }

    /**
     * <p>
     * The type of alternate contact.
     * </p>
     * 
     * @param alternateContactType
     *        The type of alternate contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlternateContactType
     */

    public AlternateContact withAlternateContactType(AlternateContactType alternateContactType) {
        this.alternateContactType = alternateContactType.toString();
        return this;
    }

    /**
     * <p>
     * The email address associated with this alternate contact.
     * </p>
     * 
     * @param emailAddress
     *        The email address associated with this alternate contact.
     */

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * <p>
     * The email address associated with this alternate contact.
     * </p>
     * 
     * @return The email address associated with this alternate contact.
     */

    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * <p>
     * The email address associated with this alternate contact.
     * </p>
     * 
     * @param emailAddress
     *        The email address associated with this alternate contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlternateContact withEmailAddress(String emailAddress) {
        setEmailAddress(emailAddress);
        return this;
    }

    /**
     * <p>
     * The name associated with this alternate contact.
     * </p>
     * 
     * @param name
     *        The name associated with this alternate contact.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name associated with this alternate contact.
     * </p>
     * 
     * @return The name associated with this alternate contact.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name associated with this alternate contact.
     * </p>
     * 
     * @param name
     *        The name associated with this alternate contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlternateContact withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The phone number associated with this alternate contact.
     * </p>
     * 
     * @param phoneNumber
     *        The phone number associated with this alternate contact.
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * The phone number associated with this alternate contact.
     * </p>
     * 
     * @return The phone number associated with this alternate contact.
     */

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * <p>
     * The phone number associated with this alternate contact.
     * </p>
     * 
     * @param phoneNumber
     *        The phone number associated with this alternate contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlternateContact withPhoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * <p>
     * The title associated with this alternate contact.
     * </p>
     * 
     * @param title
     *        The title associated with this alternate contact.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The title associated with this alternate contact.
     * </p>
     * 
     * @return The title associated with this alternate contact.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The title associated with this alternate contact.
     * </p>
     * 
     * @param title
     *        The title associated with this alternate contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlternateContact withTitle(String title) {
        setTitle(title);
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
        if (getAlternateContactType() != null)
            sb.append("AlternateContactType: ").append(getAlternateContactType()).append(",");
        if (getEmailAddress() != null)
            sb.append("EmailAddress: ").append("***Sensitive Data Redacted***").append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getPhoneNumber() != null)
            sb.append("PhoneNumber: ").append("***Sensitive Data Redacted***").append(",");
        if (getTitle() != null)
            sb.append("Title: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AlternateContact == false)
            return false;
        AlternateContact other = (AlternateContact) obj;
        if (other.getAlternateContactType() == null ^ this.getAlternateContactType() == null)
            return false;
        if (other.getAlternateContactType() != null && other.getAlternateContactType().equals(this.getAlternateContactType()) == false)
            return false;
        if (other.getEmailAddress() == null ^ this.getEmailAddress() == null)
            return false;
        if (other.getEmailAddress() != null && other.getEmailAddress().equals(this.getEmailAddress()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlternateContactType() == null) ? 0 : getAlternateContactType().hashCode());
        hashCode = prime * hashCode + ((getEmailAddress() == null) ? 0 : getEmailAddress().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        return hashCode;
    }

    @Override
    public AlternateContact clone() {
        try {
            return (AlternateContact) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.account.model.transform.AlternateContactMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
