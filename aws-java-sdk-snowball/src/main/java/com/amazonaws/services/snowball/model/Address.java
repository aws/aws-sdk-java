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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The address that you want the Snowball or Snowballs associated with a specific job to be shipped to. Addresses are
 * validated at the time of creation. The address you provide must be located within the serviceable area of your
 * region. Although no individual elements of the <code>Address</code> are required, if the address is invalid or
 * unsupported, then an exception is thrown.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/Address" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Address implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID for an address.
     * </p>
     */
    private String addressId;
    /**
     * <p>
     * The name of a person to receive a Snowball at an address.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the company to receive a Snowball at an address.
     * </p>
     */
    private String company;
    /**
     * <p>
     * The first line in a street address that a Snowball is to be delivered to.
     * </p>
     */
    private String street1;
    /**
     * <p>
     * The second line in a street address that a Snowball is to be delivered to.
     * </p>
     */
    private String street2;
    /**
     * <p>
     * The third line in a street address that a Snowball is to be delivered to.
     * </p>
     */
    private String street3;
    /**
     * <p>
     * The city in an address that a Snowball is to be delivered to.
     * </p>
     */
    private String city;
    /**
     * <p>
     * The state or province in an address that a Snowball is to be delivered to.
     * </p>
     */
    private String stateOrProvince;
    /**
     * <p>
     * This field is no longer used and the value is ignored.
     * </p>
     */
    private String prefectureOrDistrict;
    /**
     * <p>
     * This field is no longer used and the value is ignored.
     * </p>
     */
    private String landmark;
    /**
     * <p>
     * The country in an address that a Snowball is to be delivered to.
     * </p>
     */
    private String country;
    /**
     * <p>
     * The postal code in an address that a Snowball is to be delivered to.
     * </p>
     */
    private String postalCode;
    /**
     * <p>
     * The phone number associated with an address that a Snowball is to be delivered to.
     * </p>
     */
    private String phoneNumber;
    /**
     * <p>
     * If the address you are creating is a primary address, then set this option to true. This field is not supported
     * in most regions.
     * </p>
     */
    private Boolean isRestricted;

    /**
     * <p>
     * The unique ID for an address.
     * </p>
     * 
     * @param addressId
     *        The unique ID for an address.
     */

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    /**
     * <p>
     * The unique ID for an address.
     * </p>
     * 
     * @return The unique ID for an address.
     */

    public String getAddressId() {
        return this.addressId;
    }

    /**
     * <p>
     * The unique ID for an address.
     * </p>
     * 
     * @param addressId
     *        The unique ID for an address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withAddressId(String addressId) {
        setAddressId(addressId);
        return this;
    }

    /**
     * <p>
     * The name of a person to receive a Snowball at an address.
     * </p>
     * 
     * @param name
     *        The name of a person to receive a Snowball at an address.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of a person to receive a Snowball at an address.
     * </p>
     * 
     * @return The name of a person to receive a Snowball at an address.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of a person to receive a Snowball at an address.
     * </p>
     * 
     * @param name
     *        The name of a person to receive a Snowball at an address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the company to receive a Snowball at an address.
     * </p>
     * 
     * @param company
     *        The name of the company to receive a Snowball at an address.
     */

    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * <p>
     * The name of the company to receive a Snowball at an address.
     * </p>
     * 
     * @return The name of the company to receive a Snowball at an address.
     */

    public String getCompany() {
        return this.company;
    }

    /**
     * <p>
     * The name of the company to receive a Snowball at an address.
     * </p>
     * 
     * @param company
     *        The name of the company to receive a Snowball at an address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withCompany(String company) {
        setCompany(company);
        return this;
    }

    /**
     * <p>
     * The first line in a street address that a Snowball is to be delivered to.
     * </p>
     * 
     * @param street1
     *        The first line in a street address that a Snowball is to be delivered to.
     */

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    /**
     * <p>
     * The first line in a street address that a Snowball is to be delivered to.
     * </p>
     * 
     * @return The first line in a street address that a Snowball is to be delivered to.
     */

    public String getStreet1() {
        return this.street1;
    }

    /**
     * <p>
     * The first line in a street address that a Snowball is to be delivered to.
     * </p>
     * 
     * @param street1
     *        The first line in a street address that a Snowball is to be delivered to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withStreet1(String street1) {
        setStreet1(street1);
        return this;
    }

    /**
     * <p>
     * The second line in a street address that a Snowball is to be delivered to.
     * </p>
     * 
     * @param street2
     *        The second line in a street address that a Snowball is to be delivered to.
     */

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    /**
     * <p>
     * The second line in a street address that a Snowball is to be delivered to.
     * </p>
     * 
     * @return The second line in a street address that a Snowball is to be delivered to.
     */

    public String getStreet2() {
        return this.street2;
    }

    /**
     * <p>
     * The second line in a street address that a Snowball is to be delivered to.
     * </p>
     * 
     * @param street2
     *        The second line in a street address that a Snowball is to be delivered to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withStreet2(String street2) {
        setStreet2(street2);
        return this;
    }

    /**
     * <p>
     * The third line in a street address that a Snowball is to be delivered to.
     * </p>
     * 
     * @param street3
     *        The third line in a street address that a Snowball is to be delivered to.
     */

    public void setStreet3(String street3) {
        this.street3 = street3;
    }

    /**
     * <p>
     * The third line in a street address that a Snowball is to be delivered to.
     * </p>
     * 
     * @return The third line in a street address that a Snowball is to be delivered to.
     */

    public String getStreet3() {
        return this.street3;
    }

    /**
     * <p>
     * The third line in a street address that a Snowball is to be delivered to.
     * </p>
     * 
     * @param street3
     *        The third line in a street address that a Snowball is to be delivered to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withStreet3(String street3) {
        setStreet3(street3);
        return this;
    }

    /**
     * <p>
     * The city in an address that a Snowball is to be delivered to.
     * </p>
     * 
     * @param city
     *        The city in an address that a Snowball is to be delivered to.
     */

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * <p>
     * The city in an address that a Snowball is to be delivered to.
     * </p>
     * 
     * @return The city in an address that a Snowball is to be delivered to.
     */

    public String getCity() {
        return this.city;
    }

    /**
     * <p>
     * The city in an address that a Snowball is to be delivered to.
     * </p>
     * 
     * @param city
     *        The city in an address that a Snowball is to be delivered to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withCity(String city) {
        setCity(city);
        return this;
    }

    /**
     * <p>
     * The state or province in an address that a Snowball is to be delivered to.
     * </p>
     * 
     * @param stateOrProvince
     *        The state or province in an address that a Snowball is to be delivered to.
     */

    public void setStateOrProvince(String stateOrProvince) {
        this.stateOrProvince = stateOrProvince;
    }

    /**
     * <p>
     * The state or province in an address that a Snowball is to be delivered to.
     * </p>
     * 
     * @return The state or province in an address that a Snowball is to be delivered to.
     */

    public String getStateOrProvince() {
        return this.stateOrProvince;
    }

    /**
     * <p>
     * The state or province in an address that a Snowball is to be delivered to.
     * </p>
     * 
     * @param stateOrProvince
     *        The state or province in an address that a Snowball is to be delivered to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withStateOrProvince(String stateOrProvince) {
        setStateOrProvince(stateOrProvince);
        return this;
    }

    /**
     * <p>
     * This field is no longer used and the value is ignored.
     * </p>
     * 
     * @param prefectureOrDistrict
     *        This field is no longer used and the value is ignored.
     */

    public void setPrefectureOrDistrict(String prefectureOrDistrict) {
        this.prefectureOrDistrict = prefectureOrDistrict;
    }

    /**
     * <p>
     * This field is no longer used and the value is ignored.
     * </p>
     * 
     * @return This field is no longer used and the value is ignored.
     */

    public String getPrefectureOrDistrict() {
        return this.prefectureOrDistrict;
    }

    /**
     * <p>
     * This field is no longer used and the value is ignored.
     * </p>
     * 
     * @param prefectureOrDistrict
     *        This field is no longer used and the value is ignored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withPrefectureOrDistrict(String prefectureOrDistrict) {
        setPrefectureOrDistrict(prefectureOrDistrict);
        return this;
    }

    /**
     * <p>
     * This field is no longer used and the value is ignored.
     * </p>
     * 
     * @param landmark
     *        This field is no longer used and the value is ignored.
     */

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    /**
     * <p>
     * This field is no longer used and the value is ignored.
     * </p>
     * 
     * @return This field is no longer used and the value is ignored.
     */

    public String getLandmark() {
        return this.landmark;
    }

    /**
     * <p>
     * This field is no longer used and the value is ignored.
     * </p>
     * 
     * @param landmark
     *        This field is no longer used and the value is ignored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withLandmark(String landmark) {
        setLandmark(landmark);
        return this;
    }

    /**
     * <p>
     * The country in an address that a Snowball is to be delivered to.
     * </p>
     * 
     * @param country
     *        The country in an address that a Snowball is to be delivered to.
     */

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * <p>
     * The country in an address that a Snowball is to be delivered to.
     * </p>
     * 
     * @return The country in an address that a Snowball is to be delivered to.
     */

    public String getCountry() {
        return this.country;
    }

    /**
     * <p>
     * The country in an address that a Snowball is to be delivered to.
     * </p>
     * 
     * @param country
     *        The country in an address that a Snowball is to be delivered to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withCountry(String country) {
        setCountry(country);
        return this;
    }

    /**
     * <p>
     * The postal code in an address that a Snowball is to be delivered to.
     * </p>
     * 
     * @param postalCode
     *        The postal code in an address that a Snowball is to be delivered to.
     */

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * <p>
     * The postal code in an address that a Snowball is to be delivered to.
     * </p>
     * 
     * @return The postal code in an address that a Snowball is to be delivered to.
     */

    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * <p>
     * The postal code in an address that a Snowball is to be delivered to.
     * </p>
     * 
     * @param postalCode
     *        The postal code in an address that a Snowball is to be delivered to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withPostalCode(String postalCode) {
        setPostalCode(postalCode);
        return this;
    }

    /**
     * <p>
     * The phone number associated with an address that a Snowball is to be delivered to.
     * </p>
     * 
     * @param phoneNumber
     *        The phone number associated with an address that a Snowball is to be delivered to.
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * The phone number associated with an address that a Snowball is to be delivered to.
     * </p>
     * 
     * @return The phone number associated with an address that a Snowball is to be delivered to.
     */

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * <p>
     * The phone number associated with an address that a Snowball is to be delivered to.
     * </p>
     * 
     * @param phoneNumber
     *        The phone number associated with an address that a Snowball is to be delivered to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withPhoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * <p>
     * If the address you are creating is a primary address, then set this option to true. This field is not supported
     * in most regions.
     * </p>
     * 
     * @param isRestricted
     *        If the address you are creating is a primary address, then set this option to true. This field is not
     *        supported in most regions.
     */

    public void setIsRestricted(Boolean isRestricted) {
        this.isRestricted = isRestricted;
    }

    /**
     * <p>
     * If the address you are creating is a primary address, then set this option to true. This field is not supported
     * in most regions.
     * </p>
     * 
     * @return If the address you are creating is a primary address, then set this option to true. This field is not
     *         supported in most regions.
     */

    public Boolean getIsRestricted() {
        return this.isRestricted;
    }

    /**
     * <p>
     * If the address you are creating is a primary address, then set this option to true. This field is not supported
     * in most regions.
     * </p>
     * 
     * @param isRestricted
     *        If the address you are creating is a primary address, then set this option to true. This field is not
     *        supported in most regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withIsRestricted(Boolean isRestricted) {
        setIsRestricted(isRestricted);
        return this;
    }

    /**
     * <p>
     * If the address you are creating is a primary address, then set this option to true. This field is not supported
     * in most regions.
     * </p>
     * 
     * @return If the address you are creating is a primary address, then set this option to true. This field is not
     *         supported in most regions.
     */

    public Boolean isRestricted() {
        return this.isRestricted;
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
        if (getAddressId() != null)
            sb.append("AddressId: ").append(getAddressId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCompany() != null)
            sb.append("Company: ").append(getCompany()).append(",");
        if (getStreet1() != null)
            sb.append("Street1: ").append(getStreet1()).append(",");
        if (getStreet2() != null)
            sb.append("Street2: ").append(getStreet2()).append(",");
        if (getStreet3() != null)
            sb.append("Street3: ").append(getStreet3()).append(",");
        if (getCity() != null)
            sb.append("City: ").append(getCity()).append(",");
        if (getStateOrProvince() != null)
            sb.append("StateOrProvince: ").append(getStateOrProvince()).append(",");
        if (getPrefectureOrDistrict() != null)
            sb.append("PrefectureOrDistrict: ").append(getPrefectureOrDistrict()).append(",");
        if (getLandmark() != null)
            sb.append("Landmark: ").append(getLandmark()).append(",");
        if (getCountry() != null)
            sb.append("Country: ").append(getCountry()).append(",");
        if (getPostalCode() != null)
            sb.append("PostalCode: ").append(getPostalCode()).append(",");
        if (getPhoneNumber() != null)
            sb.append("PhoneNumber: ").append(getPhoneNumber()).append(",");
        if (getIsRestricted() != null)
            sb.append("IsRestricted: ").append(getIsRestricted());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Address == false)
            return false;
        Address other = (Address) obj;
        if (other.getAddressId() == null ^ this.getAddressId() == null)
            return false;
        if (other.getAddressId() != null && other.getAddressId().equals(this.getAddressId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCompany() == null ^ this.getCompany() == null)
            return false;
        if (other.getCompany() != null && other.getCompany().equals(this.getCompany()) == false)
            return false;
        if (other.getStreet1() == null ^ this.getStreet1() == null)
            return false;
        if (other.getStreet1() != null && other.getStreet1().equals(this.getStreet1()) == false)
            return false;
        if (other.getStreet2() == null ^ this.getStreet2() == null)
            return false;
        if (other.getStreet2() != null && other.getStreet2().equals(this.getStreet2()) == false)
            return false;
        if (other.getStreet3() == null ^ this.getStreet3() == null)
            return false;
        if (other.getStreet3() != null && other.getStreet3().equals(this.getStreet3()) == false)
            return false;
        if (other.getCity() == null ^ this.getCity() == null)
            return false;
        if (other.getCity() != null && other.getCity().equals(this.getCity()) == false)
            return false;
        if (other.getStateOrProvince() == null ^ this.getStateOrProvince() == null)
            return false;
        if (other.getStateOrProvince() != null && other.getStateOrProvince().equals(this.getStateOrProvince()) == false)
            return false;
        if (other.getPrefectureOrDistrict() == null ^ this.getPrefectureOrDistrict() == null)
            return false;
        if (other.getPrefectureOrDistrict() != null && other.getPrefectureOrDistrict().equals(this.getPrefectureOrDistrict()) == false)
            return false;
        if (other.getLandmark() == null ^ this.getLandmark() == null)
            return false;
        if (other.getLandmark() != null && other.getLandmark().equals(this.getLandmark()) == false)
            return false;
        if (other.getCountry() == null ^ this.getCountry() == null)
            return false;
        if (other.getCountry() != null && other.getCountry().equals(this.getCountry()) == false)
            return false;
        if (other.getPostalCode() == null ^ this.getPostalCode() == null)
            return false;
        if (other.getPostalCode() != null && other.getPostalCode().equals(this.getPostalCode()) == false)
            return false;
        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        if (other.getIsRestricted() == null ^ this.getIsRestricted() == null)
            return false;
        if (other.getIsRestricted() != null && other.getIsRestricted().equals(this.getIsRestricted()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddressId() == null) ? 0 : getAddressId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCompany() == null) ? 0 : getCompany().hashCode());
        hashCode = prime * hashCode + ((getStreet1() == null) ? 0 : getStreet1().hashCode());
        hashCode = prime * hashCode + ((getStreet2() == null) ? 0 : getStreet2().hashCode());
        hashCode = prime * hashCode + ((getStreet3() == null) ? 0 : getStreet3().hashCode());
        hashCode = prime * hashCode + ((getCity() == null) ? 0 : getCity().hashCode());
        hashCode = prime * hashCode + ((getStateOrProvince() == null) ? 0 : getStateOrProvince().hashCode());
        hashCode = prime * hashCode + ((getPrefectureOrDistrict() == null) ? 0 : getPrefectureOrDistrict().hashCode());
        hashCode = prime * hashCode + ((getLandmark() == null) ? 0 : getLandmark().hashCode());
        hashCode = prime * hashCode + ((getCountry() == null) ? 0 : getCountry().hashCode());
        hashCode = prime * hashCode + ((getPostalCode() == null) ? 0 : getPostalCode().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getIsRestricted() == null) ? 0 : getIsRestricted().hashCode());
        return hashCode;
    }

    @Override
    public Address clone() {
        try {
            return (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.snowball.model.transform.AddressMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
