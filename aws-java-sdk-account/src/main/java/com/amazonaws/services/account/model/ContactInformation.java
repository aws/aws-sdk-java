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
 * Contains the details of the primary contact information associated with an Amazon Web Services account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/account-2021-02-01/ContactInformation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContactInformation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The first line of the primary contact address.
     * </p>
     */
    private String addressLine1;
    /**
     * <p>
     * The second line of the primary contact address, if any.
     * </p>
     */
    private String addressLine2;
    /**
     * <p>
     * The third line of the primary contact address, if any.
     * </p>
     */
    private String addressLine3;
    /**
     * <p>
     * The city of the primary contact address.
     * </p>
     */
    private String city;
    /**
     * <p>
     * The name of the company associated with the primary contact information, if any.
     * </p>
     */
    private String companyName;
    /**
     * <p>
     * The ISO-3166 two-letter country code for the primary contact address.
     * </p>
     */
    private String countryCode;
    /**
     * <p>
     * The district or county of the primary contact address, if any.
     * </p>
     */
    private String districtOrCounty;
    /**
     * <p>
     * The full name of the primary contact address.
     * </p>
     */
    private String fullName;
    /**
     * <p>
     * The phone number of the primary contact information. The number will be validated and, in some countries, checked
     * for activation.
     * </p>
     */
    private String phoneNumber;
    /**
     * <p>
     * The postal code of the primary contact address.
     * </p>
     */
    private String postalCode;
    /**
     * <p>
     * The state or region of the primary contact address. This field is required in selected countries.
     * </p>
     */
    private String stateOrRegion;
    /**
     * <p>
     * The URL of the website associated with the primary contact information, if any.
     * </p>
     */
    private String websiteUrl;

    /**
     * <p>
     * The first line of the primary contact address.
     * </p>
     * 
     * @param addressLine1
     *        The first line of the primary contact address.
     */

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    /**
     * <p>
     * The first line of the primary contact address.
     * </p>
     * 
     * @return The first line of the primary contact address.
     */

    public String getAddressLine1() {
        return this.addressLine1;
    }

    /**
     * <p>
     * The first line of the primary contact address.
     * </p>
     * 
     * @param addressLine1
     *        The first line of the primary contact address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactInformation withAddressLine1(String addressLine1) {
        setAddressLine1(addressLine1);
        return this;
    }

    /**
     * <p>
     * The second line of the primary contact address, if any.
     * </p>
     * 
     * @param addressLine2
     *        The second line of the primary contact address, if any.
     */

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    /**
     * <p>
     * The second line of the primary contact address, if any.
     * </p>
     * 
     * @return The second line of the primary contact address, if any.
     */

    public String getAddressLine2() {
        return this.addressLine2;
    }

    /**
     * <p>
     * The second line of the primary contact address, if any.
     * </p>
     * 
     * @param addressLine2
     *        The second line of the primary contact address, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactInformation withAddressLine2(String addressLine2) {
        setAddressLine2(addressLine2);
        return this;
    }

    /**
     * <p>
     * The third line of the primary contact address, if any.
     * </p>
     * 
     * @param addressLine3
     *        The third line of the primary contact address, if any.
     */

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    /**
     * <p>
     * The third line of the primary contact address, if any.
     * </p>
     * 
     * @return The third line of the primary contact address, if any.
     */

    public String getAddressLine3() {
        return this.addressLine3;
    }

    /**
     * <p>
     * The third line of the primary contact address, if any.
     * </p>
     * 
     * @param addressLine3
     *        The third line of the primary contact address, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactInformation withAddressLine3(String addressLine3) {
        setAddressLine3(addressLine3);
        return this;
    }

    /**
     * <p>
     * The city of the primary contact address.
     * </p>
     * 
     * @param city
     *        The city of the primary contact address.
     */

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * <p>
     * The city of the primary contact address.
     * </p>
     * 
     * @return The city of the primary contact address.
     */

    public String getCity() {
        return this.city;
    }

    /**
     * <p>
     * The city of the primary contact address.
     * </p>
     * 
     * @param city
     *        The city of the primary contact address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactInformation withCity(String city) {
        setCity(city);
        return this;
    }

    /**
     * <p>
     * The name of the company associated with the primary contact information, if any.
     * </p>
     * 
     * @param companyName
     *        The name of the company associated with the primary contact information, if any.
     */

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * <p>
     * The name of the company associated with the primary contact information, if any.
     * </p>
     * 
     * @return The name of the company associated with the primary contact information, if any.
     */

    public String getCompanyName() {
        return this.companyName;
    }

    /**
     * <p>
     * The name of the company associated with the primary contact information, if any.
     * </p>
     * 
     * @param companyName
     *        The name of the company associated with the primary contact information, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactInformation withCompanyName(String companyName) {
        setCompanyName(companyName);
        return this;
    }

    /**
     * <p>
     * The ISO-3166 two-letter country code for the primary contact address.
     * </p>
     * 
     * @param countryCode
     *        The ISO-3166 two-letter country code for the primary contact address.
     */

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * <p>
     * The ISO-3166 two-letter country code for the primary contact address.
     * </p>
     * 
     * @return The ISO-3166 two-letter country code for the primary contact address.
     */

    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * <p>
     * The ISO-3166 two-letter country code for the primary contact address.
     * </p>
     * 
     * @param countryCode
     *        The ISO-3166 two-letter country code for the primary contact address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactInformation withCountryCode(String countryCode) {
        setCountryCode(countryCode);
        return this;
    }

    /**
     * <p>
     * The district or county of the primary contact address, if any.
     * </p>
     * 
     * @param districtOrCounty
     *        The district or county of the primary contact address, if any.
     */

    public void setDistrictOrCounty(String districtOrCounty) {
        this.districtOrCounty = districtOrCounty;
    }

    /**
     * <p>
     * The district or county of the primary contact address, if any.
     * </p>
     * 
     * @return The district or county of the primary contact address, if any.
     */

    public String getDistrictOrCounty() {
        return this.districtOrCounty;
    }

    /**
     * <p>
     * The district or county of the primary contact address, if any.
     * </p>
     * 
     * @param districtOrCounty
     *        The district or county of the primary contact address, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactInformation withDistrictOrCounty(String districtOrCounty) {
        setDistrictOrCounty(districtOrCounty);
        return this;
    }

    /**
     * <p>
     * The full name of the primary contact address.
     * </p>
     * 
     * @param fullName
     *        The full name of the primary contact address.
     */

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * <p>
     * The full name of the primary contact address.
     * </p>
     * 
     * @return The full name of the primary contact address.
     */

    public String getFullName() {
        return this.fullName;
    }

    /**
     * <p>
     * The full name of the primary contact address.
     * </p>
     * 
     * @param fullName
     *        The full name of the primary contact address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactInformation withFullName(String fullName) {
        setFullName(fullName);
        return this;
    }

    /**
     * <p>
     * The phone number of the primary contact information. The number will be validated and, in some countries, checked
     * for activation.
     * </p>
     * 
     * @param phoneNumber
     *        The phone number of the primary contact information. The number will be validated and, in some countries,
     *        checked for activation.
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * The phone number of the primary contact information. The number will be validated and, in some countries, checked
     * for activation.
     * </p>
     * 
     * @return The phone number of the primary contact information. The number will be validated and, in some countries,
     *         checked for activation.
     */

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * <p>
     * The phone number of the primary contact information. The number will be validated and, in some countries, checked
     * for activation.
     * </p>
     * 
     * @param phoneNumber
     *        The phone number of the primary contact information. The number will be validated and, in some countries,
     *        checked for activation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactInformation withPhoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * <p>
     * The postal code of the primary contact address.
     * </p>
     * 
     * @param postalCode
     *        The postal code of the primary contact address.
     */

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * <p>
     * The postal code of the primary contact address.
     * </p>
     * 
     * @return The postal code of the primary contact address.
     */

    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * <p>
     * The postal code of the primary contact address.
     * </p>
     * 
     * @param postalCode
     *        The postal code of the primary contact address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactInformation withPostalCode(String postalCode) {
        setPostalCode(postalCode);
        return this;
    }

    /**
     * <p>
     * The state or region of the primary contact address. This field is required in selected countries.
     * </p>
     * 
     * @param stateOrRegion
     *        The state or region of the primary contact address. This field is required in selected countries.
     */

    public void setStateOrRegion(String stateOrRegion) {
        this.stateOrRegion = stateOrRegion;
    }

    /**
     * <p>
     * The state or region of the primary contact address. This field is required in selected countries.
     * </p>
     * 
     * @return The state or region of the primary contact address. This field is required in selected countries.
     */

    public String getStateOrRegion() {
        return this.stateOrRegion;
    }

    /**
     * <p>
     * The state or region of the primary contact address. This field is required in selected countries.
     * </p>
     * 
     * @param stateOrRegion
     *        The state or region of the primary contact address. This field is required in selected countries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactInformation withStateOrRegion(String stateOrRegion) {
        setStateOrRegion(stateOrRegion);
        return this;
    }

    /**
     * <p>
     * The URL of the website associated with the primary contact information, if any.
     * </p>
     * 
     * @param websiteUrl
     *        The URL of the website associated with the primary contact information, if any.
     */

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    /**
     * <p>
     * The URL of the website associated with the primary contact information, if any.
     * </p>
     * 
     * @return The URL of the website associated with the primary contact information, if any.
     */

    public String getWebsiteUrl() {
        return this.websiteUrl;
    }

    /**
     * <p>
     * The URL of the website associated with the primary contact information, if any.
     * </p>
     * 
     * @param websiteUrl
     *        The URL of the website associated with the primary contact information, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContactInformation withWebsiteUrl(String websiteUrl) {
        setWebsiteUrl(websiteUrl);
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
        if (getAddressLine1() != null)
            sb.append("AddressLine1: ").append("***Sensitive Data Redacted***").append(",");
        if (getAddressLine2() != null)
            sb.append("AddressLine2: ").append("***Sensitive Data Redacted***").append(",");
        if (getAddressLine3() != null)
            sb.append("AddressLine3: ").append("***Sensitive Data Redacted***").append(",");
        if (getCity() != null)
            sb.append("City: ").append("***Sensitive Data Redacted***").append(",");
        if (getCompanyName() != null)
            sb.append("CompanyName: ").append("***Sensitive Data Redacted***").append(",");
        if (getCountryCode() != null)
            sb.append("CountryCode: ").append("***Sensitive Data Redacted***").append(",");
        if (getDistrictOrCounty() != null)
            sb.append("DistrictOrCounty: ").append("***Sensitive Data Redacted***").append(",");
        if (getFullName() != null)
            sb.append("FullName: ").append("***Sensitive Data Redacted***").append(",");
        if (getPhoneNumber() != null)
            sb.append("PhoneNumber: ").append("***Sensitive Data Redacted***").append(",");
        if (getPostalCode() != null)
            sb.append("PostalCode: ").append("***Sensitive Data Redacted***").append(",");
        if (getStateOrRegion() != null)
            sb.append("StateOrRegion: ").append("***Sensitive Data Redacted***").append(",");
        if (getWebsiteUrl() != null)
            sb.append("WebsiteUrl: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContactInformation == false)
            return false;
        ContactInformation other = (ContactInformation) obj;
        if (other.getAddressLine1() == null ^ this.getAddressLine1() == null)
            return false;
        if (other.getAddressLine1() != null && other.getAddressLine1().equals(this.getAddressLine1()) == false)
            return false;
        if (other.getAddressLine2() == null ^ this.getAddressLine2() == null)
            return false;
        if (other.getAddressLine2() != null && other.getAddressLine2().equals(this.getAddressLine2()) == false)
            return false;
        if (other.getAddressLine3() == null ^ this.getAddressLine3() == null)
            return false;
        if (other.getAddressLine3() != null && other.getAddressLine3().equals(this.getAddressLine3()) == false)
            return false;
        if (other.getCity() == null ^ this.getCity() == null)
            return false;
        if (other.getCity() != null && other.getCity().equals(this.getCity()) == false)
            return false;
        if (other.getCompanyName() == null ^ this.getCompanyName() == null)
            return false;
        if (other.getCompanyName() != null && other.getCompanyName().equals(this.getCompanyName()) == false)
            return false;
        if (other.getCountryCode() == null ^ this.getCountryCode() == null)
            return false;
        if (other.getCountryCode() != null && other.getCountryCode().equals(this.getCountryCode()) == false)
            return false;
        if (other.getDistrictOrCounty() == null ^ this.getDistrictOrCounty() == null)
            return false;
        if (other.getDistrictOrCounty() != null && other.getDistrictOrCounty().equals(this.getDistrictOrCounty()) == false)
            return false;
        if (other.getFullName() == null ^ this.getFullName() == null)
            return false;
        if (other.getFullName() != null && other.getFullName().equals(this.getFullName()) == false)
            return false;
        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        if (other.getPostalCode() == null ^ this.getPostalCode() == null)
            return false;
        if (other.getPostalCode() != null && other.getPostalCode().equals(this.getPostalCode()) == false)
            return false;
        if (other.getStateOrRegion() == null ^ this.getStateOrRegion() == null)
            return false;
        if (other.getStateOrRegion() != null && other.getStateOrRegion().equals(this.getStateOrRegion()) == false)
            return false;
        if (other.getWebsiteUrl() == null ^ this.getWebsiteUrl() == null)
            return false;
        if (other.getWebsiteUrl() != null && other.getWebsiteUrl().equals(this.getWebsiteUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddressLine1() == null) ? 0 : getAddressLine1().hashCode());
        hashCode = prime * hashCode + ((getAddressLine2() == null) ? 0 : getAddressLine2().hashCode());
        hashCode = prime * hashCode + ((getAddressLine3() == null) ? 0 : getAddressLine3().hashCode());
        hashCode = prime * hashCode + ((getCity() == null) ? 0 : getCity().hashCode());
        hashCode = prime * hashCode + ((getCompanyName() == null) ? 0 : getCompanyName().hashCode());
        hashCode = prime * hashCode + ((getCountryCode() == null) ? 0 : getCountryCode().hashCode());
        hashCode = prime * hashCode + ((getDistrictOrCounty() == null) ? 0 : getDistrictOrCounty().hashCode());
        hashCode = prime * hashCode + ((getFullName() == null) ? 0 : getFullName().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getPostalCode() == null) ? 0 : getPostalCode().hashCode());
        hashCode = prime * hashCode + ((getStateOrRegion() == null) ? 0 : getStateOrRegion().hashCode());
        hashCode = prime * hashCode + ((getWebsiteUrl() == null) ? 0 : getWebsiteUrl().hashCode());
        return hashCode;
    }

    @Override
    public ContactInformation clone() {
        try {
            return (ContactInformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.account.model.transform.ContactInformationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
