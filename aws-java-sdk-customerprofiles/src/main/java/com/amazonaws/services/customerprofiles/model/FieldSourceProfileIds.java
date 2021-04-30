/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A duplicate customer profile that is to be merged into a main profile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/FieldSourceProfileIds"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FieldSourceProfileIds implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the account number field to be merged.
     * </p>
     */
    private String accountNumber;
    /**
     * <p>
     * A unique identifier for the additional information field to be merged.
     * </p>
     */
    private String additionalInformation;
    /**
     * <p>
     * A unique identifier for the party type field to be merged.
     * </p>
     */
    private String partyType;
    /**
     * <p>
     * A unique identifier for the business name field to be merged.
     * </p>
     */
    private String businessName;
    /**
     * <p>
     * A unique identifier for the first name field to be merged.
     * </p>
     */
    private String firstName;
    /**
     * <p>
     * A unique identifier for the middle name field to be merged.
     * </p>
     */
    private String middleName;
    /**
     * <p>
     * A unique identifier for the last name field to be merged.
     * </p>
     */
    private String lastName;
    /**
     * <p>
     * A unique identifier for the birthdate field to be merged.
     * </p>
     */
    private String birthDate;
    /**
     * <p>
     * A unique identifier for the gender field to be merged.
     * </p>
     */
    private String gender;
    /**
     * <p>
     * A unique identifier for the phone number field to be merged.
     * </p>
     */
    private String phoneNumber;
    /**
     * <p>
     * A unique identifier for the mobile phone number field to be merged.
     * </p>
     */
    private String mobilePhoneNumber;
    /**
     * <p>
     * A unique identifier for the home phone number field to be merged.
     * </p>
     */
    private String homePhoneNumber;
    /**
     * <p>
     * A unique identifier for the business phone number field to be merged.
     * </p>
     */
    private String businessPhoneNumber;
    /**
     * <p>
     * A unique identifier for the email address field to be merged.
     * </p>
     */
    private String emailAddress;
    /**
     * <p>
     * A unique identifier for the personal email address field to be merged.
     * </p>
     */
    private String personalEmailAddress;
    /**
     * <p>
     * A unique identifier for the party type field to be merged.
     * </p>
     */
    private String businessEmailAddress;
    /**
     * <p>
     * A unique identifier for the party type field to be merged.
     * </p>
     */
    private String address;
    /**
     * <p>
     * A unique identifier for the shipping address field to be merged.
     * </p>
     */
    private String shippingAddress;
    /**
     * <p>
     * A unique identifier for the mailing address field to be merged.
     * </p>
     */
    private String mailingAddress;
    /**
     * <p>
     * A unique identifier for the billing type field to be merged.
     * </p>
     */
    private String billingAddress;
    /**
     * <p>
     * A unique identifier for the attributes field to be merged.
     * </p>
     */
    private java.util.Map<String, String> attributes;

    /**
     * <p>
     * A unique identifier for the account number field to be merged.
     * </p>
     * 
     * @param accountNumber
     *        A unique identifier for the account number field to be merged.
     */

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * <p>
     * A unique identifier for the account number field to be merged.
     * </p>
     * 
     * @return A unique identifier for the account number field to be merged.
     */

    public String getAccountNumber() {
        return this.accountNumber;
    }

    /**
     * <p>
     * A unique identifier for the account number field to be merged.
     * </p>
     * 
     * @param accountNumber
     *        A unique identifier for the account number field to be merged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldSourceProfileIds withAccountNumber(String accountNumber) {
        setAccountNumber(accountNumber);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the additional information field to be merged.
     * </p>
     * 
     * @param additionalInformation
     *        A unique identifier for the additional information field to be merged.
     */

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    /**
     * <p>
     * A unique identifier for the additional information field to be merged.
     * </p>
     * 
     * @return A unique identifier for the additional information field to be merged.
     */

    public String getAdditionalInformation() {
        return this.additionalInformation;
    }

    /**
     * <p>
     * A unique identifier for the additional information field to be merged.
     * </p>
     * 
     * @param additionalInformation
     *        A unique identifier for the additional information field to be merged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldSourceProfileIds withAdditionalInformation(String additionalInformation) {
        setAdditionalInformation(additionalInformation);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the party type field to be merged.
     * </p>
     * 
     * @param partyType
     *        A unique identifier for the party type field to be merged.
     */

    public void setPartyType(String partyType) {
        this.partyType = partyType;
    }

    /**
     * <p>
     * A unique identifier for the party type field to be merged.
     * </p>
     * 
     * @return A unique identifier for the party type field to be merged.
     */

    public String getPartyType() {
        return this.partyType;
    }

    /**
     * <p>
     * A unique identifier for the party type field to be merged.
     * </p>
     * 
     * @param partyType
     *        A unique identifier for the party type field to be merged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldSourceProfileIds withPartyType(String partyType) {
        setPartyType(partyType);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the business name field to be merged.
     * </p>
     * 
     * @param businessName
     *        A unique identifier for the business name field to be merged.
     */

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    /**
     * <p>
     * A unique identifier for the business name field to be merged.
     * </p>
     * 
     * @return A unique identifier for the business name field to be merged.
     */

    public String getBusinessName() {
        return this.businessName;
    }

    /**
     * <p>
     * A unique identifier for the business name field to be merged.
     * </p>
     * 
     * @param businessName
     *        A unique identifier for the business name field to be merged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldSourceProfileIds withBusinessName(String businessName) {
        setBusinessName(businessName);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the first name field to be merged.
     * </p>
     * 
     * @param firstName
     *        A unique identifier for the first name field to be merged.
     */

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * <p>
     * A unique identifier for the first name field to be merged.
     * </p>
     * 
     * @return A unique identifier for the first name field to be merged.
     */

    public String getFirstName() {
        return this.firstName;
    }

    /**
     * <p>
     * A unique identifier for the first name field to be merged.
     * </p>
     * 
     * @param firstName
     *        A unique identifier for the first name field to be merged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldSourceProfileIds withFirstName(String firstName) {
        setFirstName(firstName);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the middle name field to be merged.
     * </p>
     * 
     * @param middleName
     *        A unique identifier for the middle name field to be merged.
     */

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * <p>
     * A unique identifier for the middle name field to be merged.
     * </p>
     * 
     * @return A unique identifier for the middle name field to be merged.
     */

    public String getMiddleName() {
        return this.middleName;
    }

    /**
     * <p>
     * A unique identifier for the middle name field to be merged.
     * </p>
     * 
     * @param middleName
     *        A unique identifier for the middle name field to be merged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldSourceProfileIds withMiddleName(String middleName) {
        setMiddleName(middleName);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the last name field to be merged.
     * </p>
     * 
     * @param lastName
     *        A unique identifier for the last name field to be merged.
     */

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * <p>
     * A unique identifier for the last name field to be merged.
     * </p>
     * 
     * @return A unique identifier for the last name field to be merged.
     */

    public String getLastName() {
        return this.lastName;
    }

    /**
     * <p>
     * A unique identifier for the last name field to be merged.
     * </p>
     * 
     * @param lastName
     *        A unique identifier for the last name field to be merged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldSourceProfileIds withLastName(String lastName) {
        setLastName(lastName);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the birthdate field to be merged.
     * </p>
     * 
     * @param birthDate
     *        A unique identifier for the birthdate field to be merged.
     */

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * <p>
     * A unique identifier for the birthdate field to be merged.
     * </p>
     * 
     * @return A unique identifier for the birthdate field to be merged.
     */

    public String getBirthDate() {
        return this.birthDate;
    }

    /**
     * <p>
     * A unique identifier for the birthdate field to be merged.
     * </p>
     * 
     * @param birthDate
     *        A unique identifier for the birthdate field to be merged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldSourceProfileIds withBirthDate(String birthDate) {
        setBirthDate(birthDate);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the gender field to be merged.
     * </p>
     * 
     * @param gender
     *        A unique identifier for the gender field to be merged.
     */

    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * <p>
     * A unique identifier for the gender field to be merged.
     * </p>
     * 
     * @return A unique identifier for the gender field to be merged.
     */

    public String getGender() {
        return this.gender;
    }

    /**
     * <p>
     * A unique identifier for the gender field to be merged.
     * </p>
     * 
     * @param gender
     *        A unique identifier for the gender field to be merged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldSourceProfileIds withGender(String gender) {
        setGender(gender);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the phone number field to be merged.
     * </p>
     * 
     * @param phoneNumber
     *        A unique identifier for the phone number field to be merged.
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * A unique identifier for the phone number field to be merged.
     * </p>
     * 
     * @return A unique identifier for the phone number field to be merged.
     */

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * <p>
     * A unique identifier for the phone number field to be merged.
     * </p>
     * 
     * @param phoneNumber
     *        A unique identifier for the phone number field to be merged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldSourceProfileIds withPhoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the mobile phone number field to be merged.
     * </p>
     * 
     * @param mobilePhoneNumber
     *        A unique identifier for the mobile phone number field to be merged.
     */

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    /**
     * <p>
     * A unique identifier for the mobile phone number field to be merged.
     * </p>
     * 
     * @return A unique identifier for the mobile phone number field to be merged.
     */

    public String getMobilePhoneNumber() {
        return this.mobilePhoneNumber;
    }

    /**
     * <p>
     * A unique identifier for the mobile phone number field to be merged.
     * </p>
     * 
     * @param mobilePhoneNumber
     *        A unique identifier for the mobile phone number field to be merged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldSourceProfileIds withMobilePhoneNumber(String mobilePhoneNumber) {
        setMobilePhoneNumber(mobilePhoneNumber);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the home phone number field to be merged.
     * </p>
     * 
     * @param homePhoneNumber
     *        A unique identifier for the home phone number field to be merged.
     */

    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
    }

    /**
     * <p>
     * A unique identifier for the home phone number field to be merged.
     * </p>
     * 
     * @return A unique identifier for the home phone number field to be merged.
     */

    public String getHomePhoneNumber() {
        return this.homePhoneNumber;
    }

    /**
     * <p>
     * A unique identifier for the home phone number field to be merged.
     * </p>
     * 
     * @param homePhoneNumber
     *        A unique identifier for the home phone number field to be merged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldSourceProfileIds withHomePhoneNumber(String homePhoneNumber) {
        setHomePhoneNumber(homePhoneNumber);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the business phone number field to be merged.
     * </p>
     * 
     * @param businessPhoneNumber
     *        A unique identifier for the business phone number field to be merged.
     */

    public void setBusinessPhoneNumber(String businessPhoneNumber) {
        this.businessPhoneNumber = businessPhoneNumber;
    }

    /**
     * <p>
     * A unique identifier for the business phone number field to be merged.
     * </p>
     * 
     * @return A unique identifier for the business phone number field to be merged.
     */

    public String getBusinessPhoneNumber() {
        return this.businessPhoneNumber;
    }

    /**
     * <p>
     * A unique identifier for the business phone number field to be merged.
     * </p>
     * 
     * @param businessPhoneNumber
     *        A unique identifier for the business phone number field to be merged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldSourceProfileIds withBusinessPhoneNumber(String businessPhoneNumber) {
        setBusinessPhoneNumber(businessPhoneNumber);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the email address field to be merged.
     * </p>
     * 
     * @param emailAddress
     *        A unique identifier for the email address field to be merged.
     */

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * <p>
     * A unique identifier for the email address field to be merged.
     * </p>
     * 
     * @return A unique identifier for the email address field to be merged.
     */

    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * <p>
     * A unique identifier for the email address field to be merged.
     * </p>
     * 
     * @param emailAddress
     *        A unique identifier for the email address field to be merged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldSourceProfileIds withEmailAddress(String emailAddress) {
        setEmailAddress(emailAddress);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the personal email address field to be merged.
     * </p>
     * 
     * @param personalEmailAddress
     *        A unique identifier for the personal email address field to be merged.
     */

    public void setPersonalEmailAddress(String personalEmailAddress) {
        this.personalEmailAddress = personalEmailAddress;
    }

    /**
     * <p>
     * A unique identifier for the personal email address field to be merged.
     * </p>
     * 
     * @return A unique identifier for the personal email address field to be merged.
     */

    public String getPersonalEmailAddress() {
        return this.personalEmailAddress;
    }

    /**
     * <p>
     * A unique identifier for the personal email address field to be merged.
     * </p>
     * 
     * @param personalEmailAddress
     *        A unique identifier for the personal email address field to be merged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldSourceProfileIds withPersonalEmailAddress(String personalEmailAddress) {
        setPersonalEmailAddress(personalEmailAddress);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the party type field to be merged.
     * </p>
     * 
     * @param businessEmailAddress
     *        A unique identifier for the party type field to be merged.
     */

    public void setBusinessEmailAddress(String businessEmailAddress) {
        this.businessEmailAddress = businessEmailAddress;
    }

    /**
     * <p>
     * A unique identifier for the party type field to be merged.
     * </p>
     * 
     * @return A unique identifier for the party type field to be merged.
     */

    public String getBusinessEmailAddress() {
        return this.businessEmailAddress;
    }

    /**
     * <p>
     * A unique identifier for the party type field to be merged.
     * </p>
     * 
     * @param businessEmailAddress
     *        A unique identifier for the party type field to be merged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldSourceProfileIds withBusinessEmailAddress(String businessEmailAddress) {
        setBusinessEmailAddress(businessEmailAddress);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the party type field to be merged.
     * </p>
     * 
     * @param address
     *        A unique identifier for the party type field to be merged.
     */

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * <p>
     * A unique identifier for the party type field to be merged.
     * </p>
     * 
     * @return A unique identifier for the party type field to be merged.
     */

    public String getAddress() {
        return this.address;
    }

    /**
     * <p>
     * A unique identifier for the party type field to be merged.
     * </p>
     * 
     * @param address
     *        A unique identifier for the party type field to be merged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldSourceProfileIds withAddress(String address) {
        setAddress(address);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the shipping address field to be merged.
     * </p>
     * 
     * @param shippingAddress
     *        A unique identifier for the shipping address field to be merged.
     */

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    /**
     * <p>
     * A unique identifier for the shipping address field to be merged.
     * </p>
     * 
     * @return A unique identifier for the shipping address field to be merged.
     */

    public String getShippingAddress() {
        return this.shippingAddress;
    }

    /**
     * <p>
     * A unique identifier for the shipping address field to be merged.
     * </p>
     * 
     * @param shippingAddress
     *        A unique identifier for the shipping address field to be merged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldSourceProfileIds withShippingAddress(String shippingAddress) {
        setShippingAddress(shippingAddress);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the mailing address field to be merged.
     * </p>
     * 
     * @param mailingAddress
     *        A unique identifier for the mailing address field to be merged.
     */

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    /**
     * <p>
     * A unique identifier for the mailing address field to be merged.
     * </p>
     * 
     * @return A unique identifier for the mailing address field to be merged.
     */

    public String getMailingAddress() {
        return this.mailingAddress;
    }

    /**
     * <p>
     * A unique identifier for the mailing address field to be merged.
     * </p>
     * 
     * @param mailingAddress
     *        A unique identifier for the mailing address field to be merged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldSourceProfileIds withMailingAddress(String mailingAddress) {
        setMailingAddress(mailingAddress);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the billing type field to be merged.
     * </p>
     * 
     * @param billingAddress
     *        A unique identifier for the billing type field to be merged.
     */

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    /**
     * <p>
     * A unique identifier for the billing type field to be merged.
     * </p>
     * 
     * @return A unique identifier for the billing type field to be merged.
     */

    public String getBillingAddress() {
        return this.billingAddress;
    }

    /**
     * <p>
     * A unique identifier for the billing type field to be merged.
     * </p>
     * 
     * @param billingAddress
     *        A unique identifier for the billing type field to be merged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldSourceProfileIds withBillingAddress(String billingAddress) {
        setBillingAddress(billingAddress);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the attributes field to be merged.
     * </p>
     * 
     * @return A unique identifier for the attributes field to be merged.
     */

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * A unique identifier for the attributes field to be merged.
     * </p>
     * 
     * @param attributes
     *        A unique identifier for the attributes field to be merged.
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * A unique identifier for the attributes field to be merged.
     * </p>
     * 
     * @param attributes
     *        A unique identifier for the attributes field to be merged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldSourceProfileIds withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * Add a single Attributes entry
     *
     * @see FieldSourceProfileIds#withAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public FieldSourceProfileIds addAttributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Attributes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FieldSourceProfileIds clearAttributesEntries() {
        this.attributes = null;
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
        if (getAccountNumber() != null)
            sb.append("AccountNumber: ").append(getAccountNumber()).append(",");
        if (getAdditionalInformation() != null)
            sb.append("AdditionalInformation: ").append(getAdditionalInformation()).append(",");
        if (getPartyType() != null)
            sb.append("PartyType: ").append(getPartyType()).append(",");
        if (getBusinessName() != null)
            sb.append("BusinessName: ").append(getBusinessName()).append(",");
        if (getFirstName() != null)
            sb.append("FirstName: ").append(getFirstName()).append(",");
        if (getMiddleName() != null)
            sb.append("MiddleName: ").append(getMiddleName()).append(",");
        if (getLastName() != null)
            sb.append("LastName: ").append(getLastName()).append(",");
        if (getBirthDate() != null)
            sb.append("BirthDate: ").append(getBirthDate()).append(",");
        if (getGender() != null)
            sb.append("Gender: ").append(getGender()).append(",");
        if (getPhoneNumber() != null)
            sb.append("PhoneNumber: ").append(getPhoneNumber()).append(",");
        if (getMobilePhoneNumber() != null)
            sb.append("MobilePhoneNumber: ").append(getMobilePhoneNumber()).append(",");
        if (getHomePhoneNumber() != null)
            sb.append("HomePhoneNumber: ").append(getHomePhoneNumber()).append(",");
        if (getBusinessPhoneNumber() != null)
            sb.append("BusinessPhoneNumber: ").append(getBusinessPhoneNumber()).append(",");
        if (getEmailAddress() != null)
            sb.append("EmailAddress: ").append(getEmailAddress()).append(",");
        if (getPersonalEmailAddress() != null)
            sb.append("PersonalEmailAddress: ").append(getPersonalEmailAddress()).append(",");
        if (getBusinessEmailAddress() != null)
            sb.append("BusinessEmailAddress: ").append(getBusinessEmailAddress()).append(",");
        if (getAddress() != null)
            sb.append("Address: ").append(getAddress()).append(",");
        if (getShippingAddress() != null)
            sb.append("ShippingAddress: ").append(getShippingAddress()).append(",");
        if (getMailingAddress() != null)
            sb.append("MailingAddress: ").append(getMailingAddress()).append(",");
        if (getBillingAddress() != null)
            sb.append("BillingAddress: ").append(getBillingAddress()).append(",");
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FieldSourceProfileIds == false)
            return false;
        FieldSourceProfileIds other = (FieldSourceProfileIds) obj;
        if (other.getAccountNumber() == null ^ this.getAccountNumber() == null)
            return false;
        if (other.getAccountNumber() != null && other.getAccountNumber().equals(this.getAccountNumber()) == false)
            return false;
        if (other.getAdditionalInformation() == null ^ this.getAdditionalInformation() == null)
            return false;
        if (other.getAdditionalInformation() != null && other.getAdditionalInformation().equals(this.getAdditionalInformation()) == false)
            return false;
        if (other.getPartyType() == null ^ this.getPartyType() == null)
            return false;
        if (other.getPartyType() != null && other.getPartyType().equals(this.getPartyType()) == false)
            return false;
        if (other.getBusinessName() == null ^ this.getBusinessName() == null)
            return false;
        if (other.getBusinessName() != null && other.getBusinessName().equals(this.getBusinessName()) == false)
            return false;
        if (other.getFirstName() == null ^ this.getFirstName() == null)
            return false;
        if (other.getFirstName() != null && other.getFirstName().equals(this.getFirstName()) == false)
            return false;
        if (other.getMiddleName() == null ^ this.getMiddleName() == null)
            return false;
        if (other.getMiddleName() != null && other.getMiddleName().equals(this.getMiddleName()) == false)
            return false;
        if (other.getLastName() == null ^ this.getLastName() == null)
            return false;
        if (other.getLastName() != null && other.getLastName().equals(this.getLastName()) == false)
            return false;
        if (other.getBirthDate() == null ^ this.getBirthDate() == null)
            return false;
        if (other.getBirthDate() != null && other.getBirthDate().equals(this.getBirthDate()) == false)
            return false;
        if (other.getGender() == null ^ this.getGender() == null)
            return false;
        if (other.getGender() != null && other.getGender().equals(this.getGender()) == false)
            return false;
        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        if (other.getMobilePhoneNumber() == null ^ this.getMobilePhoneNumber() == null)
            return false;
        if (other.getMobilePhoneNumber() != null && other.getMobilePhoneNumber().equals(this.getMobilePhoneNumber()) == false)
            return false;
        if (other.getHomePhoneNumber() == null ^ this.getHomePhoneNumber() == null)
            return false;
        if (other.getHomePhoneNumber() != null && other.getHomePhoneNumber().equals(this.getHomePhoneNumber()) == false)
            return false;
        if (other.getBusinessPhoneNumber() == null ^ this.getBusinessPhoneNumber() == null)
            return false;
        if (other.getBusinessPhoneNumber() != null && other.getBusinessPhoneNumber().equals(this.getBusinessPhoneNumber()) == false)
            return false;
        if (other.getEmailAddress() == null ^ this.getEmailAddress() == null)
            return false;
        if (other.getEmailAddress() != null && other.getEmailAddress().equals(this.getEmailAddress()) == false)
            return false;
        if (other.getPersonalEmailAddress() == null ^ this.getPersonalEmailAddress() == null)
            return false;
        if (other.getPersonalEmailAddress() != null && other.getPersonalEmailAddress().equals(this.getPersonalEmailAddress()) == false)
            return false;
        if (other.getBusinessEmailAddress() == null ^ this.getBusinessEmailAddress() == null)
            return false;
        if (other.getBusinessEmailAddress() != null && other.getBusinessEmailAddress().equals(this.getBusinessEmailAddress()) == false)
            return false;
        if (other.getAddress() == null ^ this.getAddress() == null)
            return false;
        if (other.getAddress() != null && other.getAddress().equals(this.getAddress()) == false)
            return false;
        if (other.getShippingAddress() == null ^ this.getShippingAddress() == null)
            return false;
        if (other.getShippingAddress() != null && other.getShippingAddress().equals(this.getShippingAddress()) == false)
            return false;
        if (other.getMailingAddress() == null ^ this.getMailingAddress() == null)
            return false;
        if (other.getMailingAddress() != null && other.getMailingAddress().equals(this.getMailingAddress()) == false)
            return false;
        if (other.getBillingAddress() == null ^ this.getBillingAddress() == null)
            return false;
        if (other.getBillingAddress() != null && other.getBillingAddress().equals(this.getBillingAddress()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountNumber() == null) ? 0 : getAccountNumber().hashCode());
        hashCode = prime * hashCode + ((getAdditionalInformation() == null) ? 0 : getAdditionalInformation().hashCode());
        hashCode = prime * hashCode + ((getPartyType() == null) ? 0 : getPartyType().hashCode());
        hashCode = prime * hashCode + ((getBusinessName() == null) ? 0 : getBusinessName().hashCode());
        hashCode = prime * hashCode + ((getFirstName() == null) ? 0 : getFirstName().hashCode());
        hashCode = prime * hashCode + ((getMiddleName() == null) ? 0 : getMiddleName().hashCode());
        hashCode = prime * hashCode + ((getLastName() == null) ? 0 : getLastName().hashCode());
        hashCode = prime * hashCode + ((getBirthDate() == null) ? 0 : getBirthDate().hashCode());
        hashCode = prime * hashCode + ((getGender() == null) ? 0 : getGender().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getMobilePhoneNumber() == null) ? 0 : getMobilePhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getHomePhoneNumber() == null) ? 0 : getHomePhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getBusinessPhoneNumber() == null) ? 0 : getBusinessPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getEmailAddress() == null) ? 0 : getEmailAddress().hashCode());
        hashCode = prime * hashCode + ((getPersonalEmailAddress() == null) ? 0 : getPersonalEmailAddress().hashCode());
        hashCode = prime * hashCode + ((getBusinessEmailAddress() == null) ? 0 : getBusinessEmailAddress().hashCode());
        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode());
        hashCode = prime * hashCode + ((getShippingAddress() == null) ? 0 : getShippingAddress().hashCode());
        hashCode = prime * hashCode + ((getMailingAddress() == null) ? 0 : getMailingAddress().hashCode());
        hashCode = prime * hashCode + ((getBillingAddress() == null) ? 0 : getBillingAddress().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public FieldSourceProfileIds clone() {
        try {
            return (FieldSourceProfileIds) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.customerprofiles.model.transform.FieldSourceProfileIdsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
