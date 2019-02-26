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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * ContactDetail includes the following elements.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/ContactDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContactDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * First name of contact.
     * </p>
     */
    private String firstName;
    /**
     * <p>
     * Last name of contact.
     * </p>
     */
    private String lastName;
    /**
     * <p>
     * Indicates whether the contact is a person, company, association, or public organization. If you choose an option
     * other than <code>PERSON</code>, you must enter an organization name, and you can't enable privacy protection for
     * the contact.
     * </p>
     */
    private String contactType;
    /**
     * <p>
     * Name of the organization for contact types other than <code>PERSON</code>.
     * </p>
     */
    private String organizationName;
    /**
     * <p>
     * First line of the contact's address.
     * </p>
     */
    private String addressLine1;
    /**
     * <p>
     * Second line of contact's address, if any.
     * </p>
     */
    private String addressLine2;
    /**
     * <p>
     * The city of the contact's address.
     * </p>
     */
    private String city;
    /**
     * <p>
     * The state or province of the contact's city.
     * </p>
     */
    private String state;
    /**
     * <p>
     * Code for the country of the contact's address.
     * </p>
     */
    private String countryCode;
    /**
     * <p>
     * The zip or postal code of the contact's address.
     * </p>
     */
    private String zipCode;
    /**
     * <p>
     * The phone number of the contact.
     * </p>
     * <p>
     * Constraints: Phone number must be specified in the format
     * "+[country dialing code].[number including any area code&gt;]". For example, a US phone number might appear as
     * <code>"+1.1234567890"</code>.
     * </p>
     */
    private String phoneNumber;
    /**
     * <p>
     * Email address of the contact.
     * </p>
     */
    private String email;
    /**
     * <p>
     * Fax number of the contact.
     * </p>
     * <p>
     * Constraints: Phone number must be specified in the format
     * "+[country dialing code].[number including any area code]". For example, a US phone number might appear as
     * <code>"+1.1234567890"</code>.
     * </p>
     */
    private String fax;
    /**
     * <p>
     * A list of name-value pairs for parameters required by certain top-level domains.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ExtraParam> extraParams;

    /**
     * <p>
     * First name of contact.
     * </p>
     * 
     * @param firstName
     *        First name of contact.
     */

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * <p>
     * First name of contact.
     * </p>
     * 
     * @return First name of contact.
     */

    public String getFirstName() {
        return this.firstName;
    }

    /**
     * <p>
     * First name of contact.
     * </p>
     * 
     * @param firstName
     *        First name of contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactDetail withFirstName(String firstName) {
        setFirstName(firstName);
        return this;
    }

    /**
     * <p>
     * Last name of contact.
     * </p>
     * 
     * @param lastName
     *        Last name of contact.
     */

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * <p>
     * Last name of contact.
     * </p>
     * 
     * @return Last name of contact.
     */

    public String getLastName() {
        return this.lastName;
    }

    /**
     * <p>
     * Last name of contact.
     * </p>
     * 
     * @param lastName
     *        Last name of contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactDetail withLastName(String lastName) {
        setLastName(lastName);
        return this;
    }

    /**
     * <p>
     * Indicates whether the contact is a person, company, association, or public organization. If you choose an option
     * other than <code>PERSON</code>, you must enter an organization name, and you can't enable privacy protection for
     * the contact.
     * </p>
     * 
     * @param contactType
     *        Indicates whether the contact is a person, company, association, or public organization. If you choose an
     *        option other than <code>PERSON</code>, you must enter an organization name, and you can't enable privacy
     *        protection for the contact.
     * @see ContactType
     */

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    /**
     * <p>
     * Indicates whether the contact is a person, company, association, or public organization. If you choose an option
     * other than <code>PERSON</code>, you must enter an organization name, and you can't enable privacy protection for
     * the contact.
     * </p>
     * 
     * @return Indicates whether the contact is a person, company, association, or public organization. If you choose an
     *         option other than <code>PERSON</code>, you must enter an organization name, and you can't enable privacy
     *         protection for the contact.
     * @see ContactType
     */

    public String getContactType() {
        return this.contactType;
    }

    /**
     * <p>
     * Indicates whether the contact is a person, company, association, or public organization. If you choose an option
     * other than <code>PERSON</code>, you must enter an organization name, and you can't enable privacy protection for
     * the contact.
     * </p>
     * 
     * @param contactType
     *        Indicates whether the contact is a person, company, association, or public organization. If you choose an
     *        option other than <code>PERSON</code>, you must enter an organization name, and you can't enable privacy
     *        protection for the contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactType
     */

    public ContactDetail withContactType(String contactType) {
        setContactType(contactType);
        return this;
    }

    /**
     * <p>
     * Indicates whether the contact is a person, company, association, or public organization. If you choose an option
     * other than <code>PERSON</code>, you must enter an organization name, and you can't enable privacy protection for
     * the contact.
     * </p>
     * 
     * @param contactType
     *        Indicates whether the contact is a person, company, association, or public organization. If you choose an
     *        option other than <code>PERSON</code>, you must enter an organization name, and you can't enable privacy
     *        protection for the contact.
     * @see ContactType
     */

    public void setContactType(ContactType contactType) {
        withContactType(contactType);
    }

    /**
     * <p>
     * Indicates whether the contact is a person, company, association, or public organization. If you choose an option
     * other than <code>PERSON</code>, you must enter an organization name, and you can't enable privacy protection for
     * the contact.
     * </p>
     * 
     * @param contactType
     *        Indicates whether the contact is a person, company, association, or public organization. If you choose an
     *        option other than <code>PERSON</code>, you must enter an organization name, and you can't enable privacy
     *        protection for the contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactType
     */

    public ContactDetail withContactType(ContactType contactType) {
        this.contactType = contactType.toString();
        return this;
    }

    /**
     * <p>
     * Name of the organization for contact types other than <code>PERSON</code>.
     * </p>
     * 
     * @param organizationName
     *        Name of the organization for contact types other than <code>PERSON</code>.
     */

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /**
     * <p>
     * Name of the organization for contact types other than <code>PERSON</code>.
     * </p>
     * 
     * @return Name of the organization for contact types other than <code>PERSON</code>.
     */

    public String getOrganizationName() {
        return this.organizationName;
    }

    /**
     * <p>
     * Name of the organization for contact types other than <code>PERSON</code>.
     * </p>
     * 
     * @param organizationName
     *        Name of the organization for contact types other than <code>PERSON</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactDetail withOrganizationName(String organizationName) {
        setOrganizationName(organizationName);
        return this;
    }

    /**
     * <p>
     * First line of the contact's address.
     * </p>
     * 
     * @param addressLine1
     *        First line of the contact's address.
     */

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    /**
     * <p>
     * First line of the contact's address.
     * </p>
     * 
     * @return First line of the contact's address.
     */

    public String getAddressLine1() {
        return this.addressLine1;
    }

    /**
     * <p>
     * First line of the contact's address.
     * </p>
     * 
     * @param addressLine1
     *        First line of the contact's address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactDetail withAddressLine1(String addressLine1) {
        setAddressLine1(addressLine1);
        return this;
    }

    /**
     * <p>
     * Second line of contact's address, if any.
     * </p>
     * 
     * @param addressLine2
     *        Second line of contact's address, if any.
     */

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    /**
     * <p>
     * Second line of contact's address, if any.
     * </p>
     * 
     * @return Second line of contact's address, if any.
     */

    public String getAddressLine2() {
        return this.addressLine2;
    }

    /**
     * <p>
     * Second line of contact's address, if any.
     * </p>
     * 
     * @param addressLine2
     *        Second line of contact's address, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactDetail withAddressLine2(String addressLine2) {
        setAddressLine2(addressLine2);
        return this;
    }

    /**
     * <p>
     * The city of the contact's address.
     * </p>
     * 
     * @param city
     *        The city of the contact's address.
     */

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * <p>
     * The city of the contact's address.
     * </p>
     * 
     * @return The city of the contact's address.
     */

    public String getCity() {
        return this.city;
    }

    /**
     * <p>
     * The city of the contact's address.
     * </p>
     * 
     * @param city
     *        The city of the contact's address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactDetail withCity(String city) {
        setCity(city);
        return this;
    }

    /**
     * <p>
     * The state or province of the contact's city.
     * </p>
     * 
     * @param state
     *        The state or province of the contact's city.
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state or province of the contact's city.
     * </p>
     * 
     * @return The state or province of the contact's city.
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state or province of the contact's city.
     * </p>
     * 
     * @param state
     *        The state or province of the contact's city.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactDetail withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Code for the country of the contact's address.
     * </p>
     * 
     * @param countryCode
     *        Code for the country of the contact's address.
     * @see CountryCode
     */

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * <p>
     * Code for the country of the contact's address.
     * </p>
     * 
     * @return Code for the country of the contact's address.
     * @see CountryCode
     */

    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * <p>
     * Code for the country of the contact's address.
     * </p>
     * 
     * @param countryCode
     *        Code for the country of the contact's address.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CountryCode
     */

    public ContactDetail withCountryCode(String countryCode) {
        setCountryCode(countryCode);
        return this;
    }

    /**
     * <p>
     * Code for the country of the contact's address.
     * </p>
     * 
     * @param countryCode
     *        Code for the country of the contact's address.
     * @see CountryCode
     */

    public void setCountryCode(CountryCode countryCode) {
        withCountryCode(countryCode);
    }

    /**
     * <p>
     * Code for the country of the contact's address.
     * </p>
     * 
     * @param countryCode
     *        Code for the country of the contact's address.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CountryCode
     */

    public ContactDetail withCountryCode(CountryCode countryCode) {
        this.countryCode = countryCode.toString();
        return this;
    }

    /**
     * <p>
     * The zip or postal code of the contact's address.
     * </p>
     * 
     * @param zipCode
     *        The zip or postal code of the contact's address.
     */

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * <p>
     * The zip or postal code of the contact's address.
     * </p>
     * 
     * @return The zip or postal code of the contact's address.
     */

    public String getZipCode() {
        return this.zipCode;
    }

    /**
     * <p>
     * The zip or postal code of the contact's address.
     * </p>
     * 
     * @param zipCode
     *        The zip or postal code of the contact's address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactDetail withZipCode(String zipCode) {
        setZipCode(zipCode);
        return this;
    }

    /**
     * <p>
     * The phone number of the contact.
     * </p>
     * <p>
     * Constraints: Phone number must be specified in the format
     * "+[country dialing code].[number including any area code&gt;]". For example, a US phone number might appear as
     * <code>"+1.1234567890"</code>.
     * </p>
     * 
     * @param phoneNumber
     *        The phone number of the contact.</p>
     *        <p>
     *        Constraints: Phone number must be specified in the format
     *        "+[country dialing code].[number including any area code&gt;]". For example, a US phone number might
     *        appear as <code>"+1.1234567890"</code>.
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * The phone number of the contact.
     * </p>
     * <p>
     * Constraints: Phone number must be specified in the format
     * "+[country dialing code].[number including any area code&gt;]". For example, a US phone number might appear as
     * <code>"+1.1234567890"</code>.
     * </p>
     * 
     * @return The phone number of the contact.</p>
     *         <p>
     *         Constraints: Phone number must be specified in the format
     *         "+[country dialing code].[number including any area code&gt;]". For example, a US phone number might
     *         appear as <code>"+1.1234567890"</code>.
     */

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * <p>
     * The phone number of the contact.
     * </p>
     * <p>
     * Constraints: Phone number must be specified in the format
     * "+[country dialing code].[number including any area code&gt;]". For example, a US phone number might appear as
     * <code>"+1.1234567890"</code>.
     * </p>
     * 
     * @param phoneNumber
     *        The phone number of the contact.</p>
     *        <p>
     *        Constraints: Phone number must be specified in the format
     *        "+[country dialing code].[number including any area code&gt;]". For example, a US phone number might
     *        appear as <code>"+1.1234567890"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactDetail withPhoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * <p>
     * Email address of the contact.
     * </p>
     * 
     * @param email
     *        Email address of the contact.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * Email address of the contact.
     * </p>
     * 
     * @return Email address of the contact.
     */

    public String getEmail() {
        return this.email;
    }

    /**
     * <p>
     * Email address of the contact.
     * </p>
     * 
     * @param email
     *        Email address of the contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactDetail withEmail(String email) {
        setEmail(email);
        return this;
    }

    /**
     * <p>
     * Fax number of the contact.
     * </p>
     * <p>
     * Constraints: Phone number must be specified in the format
     * "+[country dialing code].[number including any area code]". For example, a US phone number might appear as
     * <code>"+1.1234567890"</code>.
     * </p>
     * 
     * @param fax
     *        Fax number of the contact.</p>
     *        <p>
     *        Constraints: Phone number must be specified in the format
     *        "+[country dialing code].[number including any area code]". For example, a US phone number might appear as
     *        <code>"+1.1234567890"</code>.
     */

    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * <p>
     * Fax number of the contact.
     * </p>
     * <p>
     * Constraints: Phone number must be specified in the format
     * "+[country dialing code].[number including any area code]". For example, a US phone number might appear as
     * <code>"+1.1234567890"</code>.
     * </p>
     * 
     * @return Fax number of the contact.</p>
     *         <p>
     *         Constraints: Phone number must be specified in the format
     *         "+[country dialing code].[number including any area code]". For example, a US phone number might appear
     *         as <code>"+1.1234567890"</code>.
     */

    public String getFax() {
        return this.fax;
    }

    /**
     * <p>
     * Fax number of the contact.
     * </p>
     * <p>
     * Constraints: Phone number must be specified in the format
     * "+[country dialing code].[number including any area code]". For example, a US phone number might appear as
     * <code>"+1.1234567890"</code>.
     * </p>
     * 
     * @param fax
     *        Fax number of the contact.</p>
     *        <p>
     *        Constraints: Phone number must be specified in the format
     *        "+[country dialing code].[number including any area code]". For example, a US phone number might appear as
     *        <code>"+1.1234567890"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactDetail withFax(String fax) {
        setFax(fax);
        return this;
    }

    /**
     * <p>
     * A list of name-value pairs for parameters required by certain top-level domains.
     * </p>
     * 
     * @return A list of name-value pairs for parameters required by certain top-level domains.
     */

    public java.util.List<ExtraParam> getExtraParams() {
        if (extraParams == null) {
            extraParams = new com.amazonaws.internal.SdkInternalList<ExtraParam>();
        }
        return extraParams;
    }

    /**
     * <p>
     * A list of name-value pairs for parameters required by certain top-level domains.
     * </p>
     * 
     * @param extraParams
     *        A list of name-value pairs for parameters required by certain top-level domains.
     */

    public void setExtraParams(java.util.Collection<ExtraParam> extraParams) {
        if (extraParams == null) {
            this.extraParams = null;
            return;
        }

        this.extraParams = new com.amazonaws.internal.SdkInternalList<ExtraParam>(extraParams);
    }

    /**
     * <p>
     * A list of name-value pairs for parameters required by certain top-level domains.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExtraParams(java.util.Collection)} or {@link #withExtraParams(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param extraParams
     *        A list of name-value pairs for parameters required by certain top-level domains.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactDetail withExtraParams(ExtraParam... extraParams) {
        if (this.extraParams == null) {
            setExtraParams(new com.amazonaws.internal.SdkInternalList<ExtraParam>(extraParams.length));
        }
        for (ExtraParam ele : extraParams) {
            this.extraParams.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of name-value pairs for parameters required by certain top-level domains.
     * </p>
     * 
     * @param extraParams
     *        A list of name-value pairs for parameters required by certain top-level domains.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactDetail withExtraParams(java.util.Collection<ExtraParam> extraParams) {
        setExtraParams(extraParams);
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
        if (getContactType() != null)
            sb.append("ContactType: ").append(getContactType()).append(",");
        if (getOrganizationName() != null)
            sb.append("OrganizationName: ").append(getOrganizationName()).append(",");
        if (getAddressLine1() != null)
            sb.append("AddressLine1: ").append(getAddressLine1()).append(",");
        if (getAddressLine2() != null)
            sb.append("AddressLine2: ").append(getAddressLine2()).append(",");
        if (getCity() != null)
            sb.append("City: ").append(getCity()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getCountryCode() != null)
            sb.append("CountryCode: ").append(getCountryCode()).append(",");
        if (getZipCode() != null)
            sb.append("ZipCode: ").append(getZipCode()).append(",");
        if (getPhoneNumber() != null)
            sb.append("PhoneNumber: ").append(getPhoneNumber()).append(",");
        if (getEmail() != null)
            sb.append("Email: ").append(getEmail()).append(",");
        if (getFax() != null)
            sb.append("Fax: ").append(getFax()).append(",");
        if (getExtraParams() != null)
            sb.append("ExtraParams: ").append(getExtraParams());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContactDetail == false)
            return false;
        ContactDetail other = (ContactDetail) obj;
        if (other.getFirstName() == null ^ this.getFirstName() == null)
            return false;
        if (other.getFirstName() != null && other.getFirstName().equals(this.getFirstName()) == false)
            return false;
        if (other.getLastName() == null ^ this.getLastName() == null)
            return false;
        if (other.getLastName() != null && other.getLastName().equals(this.getLastName()) == false)
            return false;
        if (other.getContactType() == null ^ this.getContactType() == null)
            return false;
        if (other.getContactType() != null && other.getContactType().equals(this.getContactType()) == false)
            return false;
        if (other.getOrganizationName() == null ^ this.getOrganizationName() == null)
            return false;
        if (other.getOrganizationName() != null && other.getOrganizationName().equals(this.getOrganizationName()) == false)
            return false;
        if (other.getAddressLine1() == null ^ this.getAddressLine1() == null)
            return false;
        if (other.getAddressLine1() != null && other.getAddressLine1().equals(this.getAddressLine1()) == false)
            return false;
        if (other.getAddressLine2() == null ^ this.getAddressLine2() == null)
            return false;
        if (other.getAddressLine2() != null && other.getAddressLine2().equals(this.getAddressLine2()) == false)
            return false;
        if (other.getCity() == null ^ this.getCity() == null)
            return false;
        if (other.getCity() != null && other.getCity().equals(this.getCity()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getCountryCode() == null ^ this.getCountryCode() == null)
            return false;
        if (other.getCountryCode() != null && other.getCountryCode().equals(this.getCountryCode()) == false)
            return false;
        if (other.getZipCode() == null ^ this.getZipCode() == null)
            return false;
        if (other.getZipCode() != null && other.getZipCode().equals(this.getZipCode()) == false)
            return false;
        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getFax() == null ^ this.getFax() == null)
            return false;
        if (other.getFax() != null && other.getFax().equals(this.getFax()) == false)
            return false;
        if (other.getExtraParams() == null ^ this.getExtraParams() == null)
            return false;
        if (other.getExtraParams() != null && other.getExtraParams().equals(this.getExtraParams()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFirstName() == null) ? 0 : getFirstName().hashCode());
        hashCode = prime * hashCode + ((getLastName() == null) ? 0 : getLastName().hashCode());
        hashCode = prime * hashCode + ((getContactType() == null) ? 0 : getContactType().hashCode());
        hashCode = prime * hashCode + ((getOrganizationName() == null) ? 0 : getOrganizationName().hashCode());
        hashCode = prime * hashCode + ((getAddressLine1() == null) ? 0 : getAddressLine1().hashCode());
        hashCode = prime * hashCode + ((getAddressLine2() == null) ? 0 : getAddressLine2().hashCode());
        hashCode = prime * hashCode + ((getCity() == null) ? 0 : getCity().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getCountryCode() == null) ? 0 : getCountryCode().hashCode());
        hashCode = prime * hashCode + ((getZipCode() == null) ? 0 : getZipCode().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getFax() == null) ? 0 : getFax().hashCode());
        hashCode = prime * hashCode + ((getExtraParams() == null) ? 0 : getExtraParams().hashCode());
        return hashCode;
    }

    @Override
    public ContactDetail clone() {
        try {
            return (ContactDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53domains.model.transform.ContactDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
