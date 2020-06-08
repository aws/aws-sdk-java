/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.shield.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contact information that the DRT can use to contact you if you have proactive engagement enabled, for escalations to
 * the DRT and to initiate proactive customer support.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/EmergencyContact" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EmergencyContact implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The email address for the contact.
     * </p>
     */
    private String emailAddress;
    /**
     * <p>
     * The phone number for the contact.
     * </p>
     */
    private String phoneNumber;
    /**
     * <p>
     * Additional notes regarding the contact.
     * </p>
     */
    private String contactNotes;

    /**
     * <p>
     * The email address for the contact.
     * </p>
     * 
     * @param emailAddress
     *        The email address for the contact.
     */

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * <p>
     * The email address for the contact.
     * </p>
     * 
     * @return The email address for the contact.
     */

    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * <p>
     * The email address for the contact.
     * </p>
     * 
     * @param emailAddress
     *        The email address for the contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmergencyContact withEmailAddress(String emailAddress) {
        setEmailAddress(emailAddress);
        return this;
    }

    /**
     * <p>
     * The phone number for the contact.
     * </p>
     * 
     * @param phoneNumber
     *        The phone number for the contact.
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * The phone number for the contact.
     * </p>
     * 
     * @return The phone number for the contact.
     */

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * <p>
     * The phone number for the contact.
     * </p>
     * 
     * @param phoneNumber
     *        The phone number for the contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmergencyContact withPhoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * <p>
     * Additional notes regarding the contact.
     * </p>
     * 
     * @param contactNotes
     *        Additional notes regarding the contact.
     */

    public void setContactNotes(String contactNotes) {
        this.contactNotes = contactNotes;
    }

    /**
     * <p>
     * Additional notes regarding the contact.
     * </p>
     * 
     * @return Additional notes regarding the contact.
     */

    public String getContactNotes() {
        return this.contactNotes;
    }

    /**
     * <p>
     * Additional notes regarding the contact.
     * </p>
     * 
     * @param contactNotes
     *        Additional notes regarding the contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmergencyContact withContactNotes(String contactNotes) {
        setContactNotes(contactNotes);
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
        if (getEmailAddress() != null)
            sb.append("EmailAddress: ").append(getEmailAddress()).append(",");
        if (getPhoneNumber() != null)
            sb.append("PhoneNumber: ").append(getPhoneNumber()).append(",");
        if (getContactNotes() != null)
            sb.append("ContactNotes: ").append(getContactNotes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EmergencyContact == false)
            return false;
        EmergencyContact other = (EmergencyContact) obj;
        if (other.getEmailAddress() == null ^ this.getEmailAddress() == null)
            return false;
        if (other.getEmailAddress() != null && other.getEmailAddress().equals(this.getEmailAddress()) == false)
            return false;
        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        if (other.getContactNotes() == null ^ this.getContactNotes() == null)
            return false;
        if (other.getContactNotes() != null && other.getContactNotes().equals(this.getContactNotes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEmailAddress() == null) ? 0 : getEmailAddress().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getContactNotes() == null) ? 0 : getContactNotes().hashCode());
        return hashCode;
    }

    @Override
    public EmergencyContact clone() {
        try {
            return (EmergencyContact) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.shield.model.transform.EmergencyContactMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
