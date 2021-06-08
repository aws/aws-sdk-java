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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/CreateProfile" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * A unique account number that you have given to the customer.
     * </p>
     */
    private String accountNumber;
    /**
     * <p>
     * Any additional information relevant to the customer’s profile.
     * </p>
     */
    private String additionalInformation;
    /**
     * <p>
     * The type of profile used to describe the customer.
     * </p>
     */
    private String partyType;
    /**
     * <p>
     * The name of the customer’s business.
     * </p>
     */
    private String businessName;
    /**
     * <p>
     * The customer’s first name.
     * </p>
     */
    private String firstName;
    /**
     * <p>
     * The customer’s middle name.
     * </p>
     */
    private String middleName;
    /**
     * <p>
     * The customer’s last name.
     * </p>
     */
    private String lastName;
    /**
     * <p>
     * The customer’s birth date.
     * </p>
     */
    private String birthDate;
    /**
     * <p>
     * The gender with which the customer identifies.
     * </p>
     */
    private String gender;
    /**
     * <p>
     * The customer’s phone number, which has not been specified as a mobile, home, or business number.
     * </p>
     */
    private String phoneNumber;
    /**
     * <p>
     * The customer’s mobile phone number.
     * </p>
     */
    private String mobilePhoneNumber;
    /**
     * <p>
     * The customer’s home phone number.
     * </p>
     */
    private String homePhoneNumber;
    /**
     * <p>
     * The customer’s business phone number.
     * </p>
     */
    private String businessPhoneNumber;
    /**
     * <p>
     * The customer’s email address, which has not been specified as a personal or business address.
     * </p>
     */
    private String emailAddress;
    /**
     * <p>
     * The customer’s personal email address.
     * </p>
     */
    private String personalEmailAddress;
    /**
     * <p>
     * The customer’s business email address.
     * </p>
     */
    private String businessEmailAddress;
    /**
     * <p>
     * A generic address associated with the customer that is not mailing, shipping, or billing.
     * </p>
     */
    private Address address;
    /**
     * <p>
     * The customer’s shipping address.
     * </p>
     */
    private Address shippingAddress;
    /**
     * <p>
     * The customer’s mailing address.
     * </p>
     */
    private Address mailingAddress;
    /**
     * <p>
     * The customer’s billing address.
     * </p>
     */
    private Address billingAddress;
    /**
     * <p>
     * A key value pair of attributes of a customer profile.
     * </p>
     */
    private java.util.Map<String, String> attributes;

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @param domainName
     *        The unique name of the domain.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @return The unique name of the domain.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @param domainName
     *        The unique name of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * A unique account number that you have given to the customer.
     * </p>
     * 
     * @param accountNumber
     *        A unique account number that you have given to the customer.
     */

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * <p>
     * A unique account number that you have given to the customer.
     * </p>
     * 
     * @return A unique account number that you have given to the customer.
     */

    public String getAccountNumber() {
        return this.accountNumber;
    }

    /**
     * <p>
     * A unique account number that you have given to the customer.
     * </p>
     * 
     * @param accountNumber
     *        A unique account number that you have given to the customer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withAccountNumber(String accountNumber) {
        setAccountNumber(accountNumber);
        return this;
    }

    /**
     * <p>
     * Any additional information relevant to the customer’s profile.
     * </p>
     * 
     * @param additionalInformation
     *        Any additional information relevant to the customer’s profile.
     */

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    /**
     * <p>
     * Any additional information relevant to the customer’s profile.
     * </p>
     * 
     * @return Any additional information relevant to the customer’s profile.
     */

    public String getAdditionalInformation() {
        return this.additionalInformation;
    }

    /**
     * <p>
     * Any additional information relevant to the customer’s profile.
     * </p>
     * 
     * @param additionalInformation
     *        Any additional information relevant to the customer’s profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withAdditionalInformation(String additionalInformation) {
        setAdditionalInformation(additionalInformation);
        return this;
    }

    /**
     * <p>
     * The type of profile used to describe the customer.
     * </p>
     * 
     * @param partyType
     *        The type of profile used to describe the customer.
     * @see PartyType
     */

    public void setPartyType(String partyType) {
        this.partyType = partyType;
    }

    /**
     * <p>
     * The type of profile used to describe the customer.
     * </p>
     * 
     * @return The type of profile used to describe the customer.
     * @see PartyType
     */

    public String getPartyType() {
        return this.partyType;
    }

    /**
     * <p>
     * The type of profile used to describe the customer.
     * </p>
     * 
     * @param partyType
     *        The type of profile used to describe the customer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PartyType
     */

    public CreateProfileRequest withPartyType(String partyType) {
        setPartyType(partyType);
        return this;
    }

    /**
     * <p>
     * The type of profile used to describe the customer.
     * </p>
     * 
     * @param partyType
     *        The type of profile used to describe the customer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PartyType
     */

    public CreateProfileRequest withPartyType(PartyType partyType) {
        this.partyType = partyType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the customer’s business.
     * </p>
     * 
     * @param businessName
     *        The name of the customer’s business.
     */

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    /**
     * <p>
     * The name of the customer’s business.
     * </p>
     * 
     * @return The name of the customer’s business.
     */

    public String getBusinessName() {
        return this.businessName;
    }

    /**
     * <p>
     * The name of the customer’s business.
     * </p>
     * 
     * @param businessName
     *        The name of the customer’s business.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withBusinessName(String businessName) {
        setBusinessName(businessName);
        return this;
    }

    /**
     * <p>
     * The customer’s first name.
     * </p>
     * 
     * @param firstName
     *        The customer’s first name.
     */

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * <p>
     * The customer’s first name.
     * </p>
     * 
     * @return The customer’s first name.
     */

    public String getFirstName() {
        return this.firstName;
    }

    /**
     * <p>
     * The customer’s first name.
     * </p>
     * 
     * @param firstName
     *        The customer’s first name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withFirstName(String firstName) {
        setFirstName(firstName);
        return this;
    }

    /**
     * <p>
     * The customer’s middle name.
     * </p>
     * 
     * @param middleName
     *        The customer’s middle name.
     */

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     * <p>
     * The customer’s middle name.
     * </p>
     * 
     * @return The customer’s middle name.
     */

    public String getMiddleName() {
        return this.middleName;
    }

    /**
     * <p>
     * The customer’s middle name.
     * </p>
     * 
     * @param middleName
     *        The customer’s middle name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withMiddleName(String middleName) {
        setMiddleName(middleName);
        return this;
    }

    /**
     * <p>
     * The customer’s last name.
     * </p>
     * 
     * @param lastName
     *        The customer’s last name.
     */

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * <p>
     * The customer’s last name.
     * </p>
     * 
     * @return The customer’s last name.
     */

    public String getLastName() {
        return this.lastName;
    }

    /**
     * <p>
     * The customer’s last name.
     * </p>
     * 
     * @param lastName
     *        The customer’s last name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withLastName(String lastName) {
        setLastName(lastName);
        return this;
    }

    /**
     * <p>
     * The customer’s birth date.
     * </p>
     * 
     * @param birthDate
     *        The customer’s birth date.
     */

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * <p>
     * The customer’s birth date.
     * </p>
     * 
     * @return The customer’s birth date.
     */

    public String getBirthDate() {
        return this.birthDate;
    }

    /**
     * <p>
     * The customer’s birth date.
     * </p>
     * 
     * @param birthDate
     *        The customer’s birth date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withBirthDate(String birthDate) {
        setBirthDate(birthDate);
        return this;
    }

    /**
     * <p>
     * The gender with which the customer identifies.
     * </p>
     * 
     * @param gender
     *        The gender with which the customer identifies.
     * @see Gender
     */

    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * <p>
     * The gender with which the customer identifies.
     * </p>
     * 
     * @return The gender with which the customer identifies.
     * @see Gender
     */

    public String getGender() {
        return this.gender;
    }

    /**
     * <p>
     * The gender with which the customer identifies.
     * </p>
     * 
     * @param gender
     *        The gender with which the customer identifies.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Gender
     */

    public CreateProfileRequest withGender(String gender) {
        setGender(gender);
        return this;
    }

    /**
     * <p>
     * The gender with which the customer identifies.
     * </p>
     * 
     * @param gender
     *        The gender with which the customer identifies.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Gender
     */

    public CreateProfileRequest withGender(Gender gender) {
        this.gender = gender.toString();
        return this;
    }

    /**
     * <p>
     * The customer’s phone number, which has not been specified as a mobile, home, or business number.
     * </p>
     * 
     * @param phoneNumber
     *        The customer’s phone number, which has not been specified as a mobile, home, or business number.
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * The customer’s phone number, which has not been specified as a mobile, home, or business number.
     * </p>
     * 
     * @return The customer’s phone number, which has not been specified as a mobile, home, or business number.
     */

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * <p>
     * The customer’s phone number, which has not been specified as a mobile, home, or business number.
     * </p>
     * 
     * @param phoneNumber
     *        The customer’s phone number, which has not been specified as a mobile, home, or business number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withPhoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * <p>
     * The customer’s mobile phone number.
     * </p>
     * 
     * @param mobilePhoneNumber
     *        The customer’s mobile phone number.
     */

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    /**
     * <p>
     * The customer’s mobile phone number.
     * </p>
     * 
     * @return The customer’s mobile phone number.
     */

    public String getMobilePhoneNumber() {
        return this.mobilePhoneNumber;
    }

    /**
     * <p>
     * The customer’s mobile phone number.
     * </p>
     * 
     * @param mobilePhoneNumber
     *        The customer’s mobile phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withMobilePhoneNumber(String mobilePhoneNumber) {
        setMobilePhoneNumber(mobilePhoneNumber);
        return this;
    }

    /**
     * <p>
     * The customer’s home phone number.
     * </p>
     * 
     * @param homePhoneNumber
     *        The customer’s home phone number.
     */

    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
    }

    /**
     * <p>
     * The customer’s home phone number.
     * </p>
     * 
     * @return The customer’s home phone number.
     */

    public String getHomePhoneNumber() {
        return this.homePhoneNumber;
    }

    /**
     * <p>
     * The customer’s home phone number.
     * </p>
     * 
     * @param homePhoneNumber
     *        The customer’s home phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withHomePhoneNumber(String homePhoneNumber) {
        setHomePhoneNumber(homePhoneNumber);
        return this;
    }

    /**
     * <p>
     * The customer’s business phone number.
     * </p>
     * 
     * @param businessPhoneNumber
     *        The customer’s business phone number.
     */

    public void setBusinessPhoneNumber(String businessPhoneNumber) {
        this.businessPhoneNumber = businessPhoneNumber;
    }

    /**
     * <p>
     * The customer’s business phone number.
     * </p>
     * 
     * @return The customer’s business phone number.
     */

    public String getBusinessPhoneNumber() {
        return this.businessPhoneNumber;
    }

    /**
     * <p>
     * The customer’s business phone number.
     * </p>
     * 
     * @param businessPhoneNumber
     *        The customer’s business phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withBusinessPhoneNumber(String businessPhoneNumber) {
        setBusinessPhoneNumber(businessPhoneNumber);
        return this;
    }

    /**
     * <p>
     * The customer’s email address, which has not been specified as a personal or business address.
     * </p>
     * 
     * @param emailAddress
     *        The customer’s email address, which has not been specified as a personal or business address.
     */

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * <p>
     * The customer’s email address, which has not been specified as a personal or business address.
     * </p>
     * 
     * @return The customer’s email address, which has not been specified as a personal or business address.
     */

    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * <p>
     * The customer’s email address, which has not been specified as a personal or business address.
     * </p>
     * 
     * @param emailAddress
     *        The customer’s email address, which has not been specified as a personal or business address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withEmailAddress(String emailAddress) {
        setEmailAddress(emailAddress);
        return this;
    }

    /**
     * <p>
     * The customer’s personal email address.
     * </p>
     * 
     * @param personalEmailAddress
     *        The customer’s personal email address.
     */

    public void setPersonalEmailAddress(String personalEmailAddress) {
        this.personalEmailAddress = personalEmailAddress;
    }

    /**
     * <p>
     * The customer’s personal email address.
     * </p>
     * 
     * @return The customer’s personal email address.
     */

    public String getPersonalEmailAddress() {
        return this.personalEmailAddress;
    }

    /**
     * <p>
     * The customer’s personal email address.
     * </p>
     * 
     * @param personalEmailAddress
     *        The customer’s personal email address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withPersonalEmailAddress(String personalEmailAddress) {
        setPersonalEmailAddress(personalEmailAddress);
        return this;
    }

    /**
     * <p>
     * The customer’s business email address.
     * </p>
     * 
     * @param businessEmailAddress
     *        The customer’s business email address.
     */

    public void setBusinessEmailAddress(String businessEmailAddress) {
        this.businessEmailAddress = businessEmailAddress;
    }

    /**
     * <p>
     * The customer’s business email address.
     * </p>
     * 
     * @return The customer’s business email address.
     */

    public String getBusinessEmailAddress() {
        return this.businessEmailAddress;
    }

    /**
     * <p>
     * The customer’s business email address.
     * </p>
     * 
     * @param businessEmailAddress
     *        The customer’s business email address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withBusinessEmailAddress(String businessEmailAddress) {
        setBusinessEmailAddress(businessEmailAddress);
        return this;
    }

    /**
     * <p>
     * A generic address associated with the customer that is not mailing, shipping, or billing.
     * </p>
     * 
     * @param address
     *        A generic address associated with the customer that is not mailing, shipping, or billing.
     */

    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * <p>
     * A generic address associated with the customer that is not mailing, shipping, or billing.
     * </p>
     * 
     * @return A generic address associated with the customer that is not mailing, shipping, or billing.
     */

    public Address getAddress() {
        return this.address;
    }

    /**
     * <p>
     * A generic address associated with the customer that is not mailing, shipping, or billing.
     * </p>
     * 
     * @param address
     *        A generic address associated with the customer that is not mailing, shipping, or billing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withAddress(Address address) {
        setAddress(address);
        return this;
    }

    /**
     * <p>
     * The customer’s shipping address.
     * </p>
     * 
     * @param shippingAddress
     *        The customer’s shipping address.
     */

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    /**
     * <p>
     * The customer’s shipping address.
     * </p>
     * 
     * @return The customer’s shipping address.
     */

    public Address getShippingAddress() {
        return this.shippingAddress;
    }

    /**
     * <p>
     * The customer’s shipping address.
     * </p>
     * 
     * @param shippingAddress
     *        The customer’s shipping address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withShippingAddress(Address shippingAddress) {
        setShippingAddress(shippingAddress);
        return this;
    }

    /**
     * <p>
     * The customer’s mailing address.
     * </p>
     * 
     * @param mailingAddress
     *        The customer’s mailing address.
     */

    public void setMailingAddress(Address mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    /**
     * <p>
     * The customer’s mailing address.
     * </p>
     * 
     * @return The customer’s mailing address.
     */

    public Address getMailingAddress() {
        return this.mailingAddress;
    }

    /**
     * <p>
     * The customer’s mailing address.
     * </p>
     * 
     * @param mailingAddress
     *        The customer’s mailing address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withMailingAddress(Address mailingAddress) {
        setMailingAddress(mailingAddress);
        return this;
    }

    /**
     * <p>
     * The customer’s billing address.
     * </p>
     * 
     * @param billingAddress
     *        The customer’s billing address.
     */

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    /**
     * <p>
     * The customer’s billing address.
     * </p>
     * 
     * @return The customer’s billing address.
     */

    public Address getBillingAddress() {
        return this.billingAddress;
    }

    /**
     * <p>
     * The customer’s billing address.
     * </p>
     * 
     * @param billingAddress
     *        The customer’s billing address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withBillingAddress(Address billingAddress) {
        setBillingAddress(billingAddress);
        return this;
    }

    /**
     * <p>
     * A key value pair of attributes of a customer profile.
     * </p>
     * 
     * @return A key value pair of attributes of a customer profile.
     */

    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * A key value pair of attributes of a customer profile.
     * </p>
     * 
     * @param attributes
     *        A key value pair of attributes of a customer profile.
     */

    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * A key value pair of attributes of a customer profile.
     * </p>
     * 
     * @param attributes
     *        A key value pair of attributes of a customer profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest withAttributes(java.util.Map<String, String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * Add a single Attributes entry
     *
     * @see CreateProfileRequest#withAttributes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateProfileRequest addAttributesEntry(String key, String value) {
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

    public CreateProfileRequest clearAttributesEntries() {
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
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

        if (obj instanceof CreateProfileRequest == false)
            return false;
        CreateProfileRequest other = (CreateProfileRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
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
    public CreateProfileRequest clone() {
        return (CreateProfileRequest) super.clone();
    }

}
