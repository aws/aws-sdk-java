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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information related to a contact.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/ContactData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContactData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the contact.
     * </p>
     */
    private String contactArn;
    /**
     * <p>
     * The name of the contact to display on the console.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The first name of the contact, used to call the contact on the device.
     * </p>
     */
    private String firstName;
    /**
     * <p>
     * The last name of the contact, used to call the contact on the device.
     * </p>
     */
    private String lastName;
    /**
     * <p>
     * The phone number of the contact. The phone number type defaults to WORK. You can specify PhoneNumber or
     * PhoneNumbers. We recommend that you use PhoneNumbers, which lets you specify the phone number type and multiple
     * numbers.
     * </p>
     */
    private String phoneNumber;
    /**
     * <p>
     * The list of phone numbers for the contact.
     * </p>
     */
    private java.util.List<PhoneNumber> phoneNumbers;
    /**
     * <p>
     * The list of SIP addresses for the contact.
     * </p>
     */
    private java.util.List<SipAddress> sipAddresses;

    /**
     * <p>
     * The ARN of the contact.
     * </p>
     * 
     * @param contactArn
     *        The ARN of the contact.
     */

    public void setContactArn(String contactArn) {
        this.contactArn = contactArn;
    }

    /**
     * <p>
     * The ARN of the contact.
     * </p>
     * 
     * @return The ARN of the contact.
     */

    public String getContactArn() {
        return this.contactArn;
    }

    /**
     * <p>
     * The ARN of the contact.
     * </p>
     * 
     * @param contactArn
     *        The ARN of the contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactData withContactArn(String contactArn) {
        setContactArn(contactArn);
        return this;
    }

    /**
     * <p>
     * The name of the contact to display on the console.
     * </p>
     * 
     * @param displayName
     *        The name of the contact to display on the console.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the contact to display on the console.
     * </p>
     * 
     * @return The name of the contact to display on the console.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name of the contact to display on the console.
     * </p>
     * 
     * @param displayName
     *        The name of the contact to display on the console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactData withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The first name of the contact, used to call the contact on the device.
     * </p>
     * 
     * @param firstName
     *        The first name of the contact, used to call the contact on the device.
     */

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * <p>
     * The first name of the contact, used to call the contact on the device.
     * </p>
     * 
     * @return The first name of the contact, used to call the contact on the device.
     */

    public String getFirstName() {
        return this.firstName;
    }

    /**
     * <p>
     * The first name of the contact, used to call the contact on the device.
     * </p>
     * 
     * @param firstName
     *        The first name of the contact, used to call the contact on the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactData withFirstName(String firstName) {
        setFirstName(firstName);
        return this;
    }

    /**
     * <p>
     * The last name of the contact, used to call the contact on the device.
     * </p>
     * 
     * @param lastName
     *        The last name of the contact, used to call the contact on the device.
     */

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * <p>
     * The last name of the contact, used to call the contact on the device.
     * </p>
     * 
     * @return The last name of the contact, used to call the contact on the device.
     */

    public String getLastName() {
        return this.lastName;
    }

    /**
     * <p>
     * The last name of the contact, used to call the contact on the device.
     * </p>
     * 
     * @param lastName
     *        The last name of the contact, used to call the contact on the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactData withLastName(String lastName) {
        setLastName(lastName);
        return this;
    }

    /**
     * <p>
     * The phone number of the contact. The phone number type defaults to WORK. You can specify PhoneNumber or
     * PhoneNumbers. We recommend that you use PhoneNumbers, which lets you specify the phone number type and multiple
     * numbers.
     * </p>
     * 
     * @param phoneNumber
     *        The phone number of the contact. The phone number type defaults to WORK. You can specify PhoneNumber or
     *        PhoneNumbers. We recommend that you use PhoneNumbers, which lets you specify the phone number type and
     *        multiple numbers.
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * The phone number of the contact. The phone number type defaults to WORK. You can specify PhoneNumber or
     * PhoneNumbers. We recommend that you use PhoneNumbers, which lets you specify the phone number type and multiple
     * numbers.
     * </p>
     * 
     * @return The phone number of the contact. The phone number type defaults to WORK. You can specify PhoneNumber or
     *         PhoneNumbers. We recommend that you use PhoneNumbers, which lets you specify the phone number type and
     *         multiple numbers.
     */

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * <p>
     * The phone number of the contact. The phone number type defaults to WORK. You can specify PhoneNumber or
     * PhoneNumbers. We recommend that you use PhoneNumbers, which lets you specify the phone number type and multiple
     * numbers.
     * </p>
     * 
     * @param phoneNumber
     *        The phone number of the contact. The phone number type defaults to WORK. You can specify PhoneNumber or
     *        PhoneNumbers. We recommend that you use PhoneNumbers, which lets you specify the phone number type and
     *        multiple numbers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactData withPhoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * <p>
     * The list of phone numbers for the contact.
     * </p>
     * 
     * @return The list of phone numbers for the contact.
     */

    public java.util.List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    /**
     * <p>
     * The list of phone numbers for the contact.
     * </p>
     * 
     * @param phoneNumbers
     *        The list of phone numbers for the contact.
     */

    public void setPhoneNumbers(java.util.Collection<PhoneNumber> phoneNumbers) {
        if (phoneNumbers == null) {
            this.phoneNumbers = null;
            return;
        }

        this.phoneNumbers = new java.util.ArrayList<PhoneNumber>(phoneNumbers);
    }

    /**
     * <p>
     * The list of phone numbers for the contact.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPhoneNumbers(java.util.Collection)} or {@link #withPhoneNumbers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param phoneNumbers
     *        The list of phone numbers for the contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactData withPhoneNumbers(PhoneNumber... phoneNumbers) {
        if (this.phoneNumbers == null) {
            setPhoneNumbers(new java.util.ArrayList<PhoneNumber>(phoneNumbers.length));
        }
        for (PhoneNumber ele : phoneNumbers) {
            this.phoneNumbers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of phone numbers for the contact.
     * </p>
     * 
     * @param phoneNumbers
     *        The list of phone numbers for the contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactData withPhoneNumbers(java.util.Collection<PhoneNumber> phoneNumbers) {
        setPhoneNumbers(phoneNumbers);
        return this;
    }

    /**
     * <p>
     * The list of SIP addresses for the contact.
     * </p>
     * 
     * @return The list of SIP addresses for the contact.
     */

    public java.util.List<SipAddress> getSipAddresses() {
        return sipAddresses;
    }

    /**
     * <p>
     * The list of SIP addresses for the contact.
     * </p>
     * 
     * @param sipAddresses
     *        The list of SIP addresses for the contact.
     */

    public void setSipAddresses(java.util.Collection<SipAddress> sipAddresses) {
        if (sipAddresses == null) {
            this.sipAddresses = null;
            return;
        }

        this.sipAddresses = new java.util.ArrayList<SipAddress>(sipAddresses);
    }

    /**
     * <p>
     * The list of SIP addresses for the contact.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSipAddresses(java.util.Collection)} or {@link #withSipAddresses(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param sipAddresses
     *        The list of SIP addresses for the contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactData withSipAddresses(SipAddress... sipAddresses) {
        if (this.sipAddresses == null) {
            setSipAddresses(new java.util.ArrayList<SipAddress>(sipAddresses.length));
        }
        for (SipAddress ele : sipAddresses) {
            this.sipAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of SIP addresses for the contact.
     * </p>
     * 
     * @param sipAddresses
     *        The list of SIP addresses for the contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactData withSipAddresses(java.util.Collection<SipAddress> sipAddresses) {
        setSipAddresses(sipAddresses);
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
        if (getContactArn() != null)
            sb.append("ContactArn: ").append(getContactArn()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getFirstName() != null)
            sb.append("FirstName: ").append(getFirstName()).append(",");
        if (getLastName() != null)
            sb.append("LastName: ").append(getLastName()).append(",");
        if (getPhoneNumber() != null)
            sb.append("PhoneNumber: ").append("***Sensitive Data Redacted***").append(",");
        if (getPhoneNumbers() != null)
            sb.append("PhoneNumbers: ").append(getPhoneNumbers()).append(",");
        if (getSipAddresses() != null)
            sb.append("SipAddresses: ").append(getSipAddresses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContactData == false)
            return false;
        ContactData other = (ContactData) obj;
        if (other.getContactArn() == null ^ this.getContactArn() == null)
            return false;
        if (other.getContactArn() != null && other.getContactArn().equals(this.getContactArn()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getFirstName() == null ^ this.getFirstName() == null)
            return false;
        if (other.getFirstName() != null && other.getFirstName().equals(this.getFirstName()) == false)
            return false;
        if (other.getLastName() == null ^ this.getLastName() == null)
            return false;
        if (other.getLastName() != null && other.getLastName().equals(this.getLastName()) == false)
            return false;
        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        if (other.getPhoneNumbers() == null ^ this.getPhoneNumbers() == null)
            return false;
        if (other.getPhoneNumbers() != null && other.getPhoneNumbers().equals(this.getPhoneNumbers()) == false)
            return false;
        if (other.getSipAddresses() == null ^ this.getSipAddresses() == null)
            return false;
        if (other.getSipAddresses() != null && other.getSipAddresses().equals(this.getSipAddresses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContactArn() == null) ? 0 : getContactArn().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getFirstName() == null) ? 0 : getFirstName().hashCode());
        hashCode = prime * hashCode + ((getLastName() == null) ? 0 : getLastName().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumbers() == null) ? 0 : getPhoneNumbers().hashCode());
        hashCode = prime * hashCode + ((getSipAddresses() == null) ? 0 : getSipAddresses().hashCode());
        return hashCode;
    }

    @Override
    public ContactData clone() {
        try {
            return (ContactData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.alexaforbusiness.model.transform.ContactDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
