/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.snowball.model;

import java.io.Serializable;

/**
 * <p>
 * The address that you want the Snowball(s) associated with a specific job to
 * be shipped to. Addresses are validated at the time of creation. The address
 * you provide must be located within the serviceable area of your region.
 * Although no individual elements of the <code>Address</code> are required, if
 * the address is invalid or unsupported, then an exception is thrown.
 * </p>
 */
public class Address implements Serializable, Cloneable {

    /**
     * <p>
     * </p>
     */
    private String addressId;
    /**
     * <p>
     * </p>
     */
    private String name;
    /**
     * <p>
     * </p>
     */
    private String company;
    /**
     * <p>
     * </p>
     */
    private String street1;
    /**
     * <p>
     * </p>
     */
    private String street2;
    /**
     * <p>
     * </p>
     */
    private String street3;
    /**
     * <p>
     * </p>
     */
    private String city;
    /**
     * <p>
     * </p>
     */
    private String stateOrProvince;
    /**
     * <p>
     * </p>
     */
    private String prefectureOrDistrict;
    /**
     * <p>
     * </p>
     */
    private String landmark;
    /**
     * <p>
     * </p>
     */
    private String country;
    /**
     * <p>
     * </p>
     */
    private String postalCode;
    /**
     * <p>
     * </p>
     */
    private String phoneNumber;

    /**
     * <p>
     * </p>
     * 
     * @param addressId
     */

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public String getAddressId() {
        return this.addressId;
    }

    /**
     * <p>
     * </p>
     * 
     * @param addressId
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Address withAddressId(String addressId) {
        setAddressId(addressId);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * </p>
     * 
     * @param name
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Address withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param company
     */

    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public String getCompany() {
        return this.company;
    }

    /**
     * <p>
     * </p>
     * 
     * @param company
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Address withCompany(String company) {
        setCompany(company);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param street1
     */

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public String getStreet1() {
        return this.street1;
    }

    /**
     * <p>
     * </p>
     * 
     * @param street1
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Address withStreet1(String street1) {
        setStreet1(street1);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param street2
     */

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public String getStreet2() {
        return this.street2;
    }

    /**
     * <p>
     * </p>
     * 
     * @param street2
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Address withStreet2(String street2) {
        setStreet2(street2);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param street3
     */

    public void setStreet3(String street3) {
        this.street3 = street3;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public String getStreet3() {
        return this.street3;
    }

    /**
     * <p>
     * </p>
     * 
     * @param street3
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Address withStreet3(String street3) {
        setStreet3(street3);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param city
     */

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public String getCity() {
        return this.city;
    }

    /**
     * <p>
     * </p>
     * 
     * @param city
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Address withCity(String city) {
        setCity(city);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param stateOrProvince
     */

    public void setStateOrProvince(String stateOrProvince) {
        this.stateOrProvince = stateOrProvince;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public String getStateOrProvince() {
        return this.stateOrProvince;
    }

    /**
     * <p>
     * </p>
     * 
     * @param stateOrProvince
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Address withStateOrProvince(String stateOrProvince) {
        setStateOrProvince(stateOrProvince);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param prefectureOrDistrict
     */

    public void setPrefectureOrDistrict(String prefectureOrDistrict) {
        this.prefectureOrDistrict = prefectureOrDistrict;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public String getPrefectureOrDistrict() {
        return this.prefectureOrDistrict;
    }

    /**
     * <p>
     * </p>
     * 
     * @param prefectureOrDistrict
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Address withPrefectureOrDistrict(String prefectureOrDistrict) {
        setPrefectureOrDistrict(prefectureOrDistrict);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param landmark
     */

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public String getLandmark() {
        return this.landmark;
    }

    /**
     * <p>
     * </p>
     * 
     * @param landmark
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Address withLandmark(String landmark) {
        setLandmark(landmark);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param country
     */

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public String getCountry() {
        return this.country;
    }

    /**
     * <p>
     * </p>
     * 
     * @param country
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Address withCountry(String country) {
        setCountry(country);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param postalCode
     */

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * <p>
     * </p>
     * 
     * @param postalCode
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Address withPostalCode(String postalCode) {
        setPostalCode(postalCode);
        return this;
    }

    /**
     * <p>
     * </p>
     * 
     * @param phoneNumber
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * </p>
     * 
     * @return
     */

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * <p>
     * </p>
     * 
     * @param phoneNumber
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Address withPhoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
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
            sb.append("AddressId: " + getAddressId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getCompany() != null)
            sb.append("Company: " + getCompany() + ",");
        if (getStreet1() != null)
            sb.append("Street1: " + getStreet1() + ",");
        if (getStreet2() != null)
            sb.append("Street2: " + getStreet2() + ",");
        if (getStreet3() != null)
            sb.append("Street3: " + getStreet3() + ",");
        if (getCity() != null)
            sb.append("City: " + getCity() + ",");
        if (getStateOrProvince() != null)
            sb.append("StateOrProvince: " + getStateOrProvince() + ",");
        if (getPrefectureOrDistrict() != null)
            sb.append("PrefectureOrDistrict: " + getPrefectureOrDistrict()
                    + ",");
        if (getLandmark() != null)
            sb.append("Landmark: " + getLandmark() + ",");
        if (getCountry() != null)
            sb.append("Country: " + getCountry() + ",");
        if (getPostalCode() != null)
            sb.append("PostalCode: " + getPostalCode() + ",");
        if (getPhoneNumber() != null)
            sb.append("PhoneNumber: " + getPhoneNumber());
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
        if (other.getAddressId() != null
                && other.getAddressId().equals(this.getAddressId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null
                && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCompany() == null ^ this.getCompany() == null)
            return false;
        if (other.getCompany() != null
                && other.getCompany().equals(this.getCompany()) == false)
            return false;
        if (other.getStreet1() == null ^ this.getStreet1() == null)
            return false;
        if (other.getStreet1() != null
                && other.getStreet1().equals(this.getStreet1()) == false)
            return false;
        if (other.getStreet2() == null ^ this.getStreet2() == null)
            return false;
        if (other.getStreet2() != null
                && other.getStreet2().equals(this.getStreet2()) == false)
            return false;
        if (other.getStreet3() == null ^ this.getStreet3() == null)
            return false;
        if (other.getStreet3() != null
                && other.getStreet3().equals(this.getStreet3()) == false)
            return false;
        if (other.getCity() == null ^ this.getCity() == null)
            return false;
        if (other.getCity() != null
                && other.getCity().equals(this.getCity()) == false)
            return false;
        if (other.getStateOrProvince() == null
                ^ this.getStateOrProvince() == null)
            return false;
        if (other.getStateOrProvince() != null
                && other.getStateOrProvince().equals(this.getStateOrProvince()) == false)
            return false;
        if (other.getPrefectureOrDistrict() == null
                ^ this.getPrefectureOrDistrict() == null)
            return false;
        if (other.getPrefectureOrDistrict() != null
                && other.getPrefectureOrDistrict().equals(
                        this.getPrefectureOrDistrict()) == false)
            return false;
        if (other.getLandmark() == null ^ this.getLandmark() == null)
            return false;
        if (other.getLandmark() != null
                && other.getLandmark().equals(this.getLandmark()) == false)
            return false;
        if (other.getCountry() == null ^ this.getCountry() == null)
            return false;
        if (other.getCountry() != null
                && other.getCountry().equals(this.getCountry()) == false)
            return false;
        if (other.getPostalCode() == null ^ this.getPostalCode() == null)
            return false;
        if (other.getPostalCode() != null
                && other.getPostalCode().equals(this.getPostalCode()) == false)
            return false;
        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null
                && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAddressId() == null) ? 0 : getAddressId().hashCode());
        hashCode = prime * hashCode
                + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getCompany() == null) ? 0 : getCompany().hashCode());
        hashCode = prime * hashCode
                + ((getStreet1() == null) ? 0 : getStreet1().hashCode());
        hashCode = prime * hashCode
                + ((getStreet2() == null) ? 0 : getStreet2().hashCode());
        hashCode = prime * hashCode
                + ((getStreet3() == null) ? 0 : getStreet3().hashCode());
        hashCode = prime * hashCode
                + ((getCity() == null) ? 0 : getCity().hashCode());
        hashCode = prime
                * hashCode
                + ((getStateOrProvince() == null) ? 0 : getStateOrProvince()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getPrefectureOrDistrict() == null) ? 0
                        : getPrefectureOrDistrict().hashCode());
        hashCode = prime * hashCode
                + ((getLandmark() == null) ? 0 : getLandmark().hashCode());
        hashCode = prime * hashCode
                + ((getCountry() == null) ? 0 : getCountry().hashCode());
        hashCode = prime * hashCode
                + ((getPostalCode() == null) ? 0 : getPostalCode().hashCode());
        hashCode = prime
                * hashCode
                + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        return hashCode;
    }

    @Override
    public Address clone() {
        try {
            return (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
