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
package com.amazonaws.services.private5g.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about an address.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/Address" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Address implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The city for this address.
     * </p>
     */
    private String city;
    /**
     * <p>
     * The company name for this address.
     * </p>
     */
    private String company;
    /**
     * <p>
     * The country for this address.
     * </p>
     */
    private String country;
    /**
     * <p>
     * The recipient's name for this address.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The phone number for this address.
     * </p>
     */
    private String phoneNumber;
    /**
     * <p>
     * The postal code for this address.
     * </p>
     */
    private String postalCode;
    /**
     * <p>
     * The state or province for this address.
     * </p>
     */
    private String stateOrProvince;
    /**
     * <p>
     * The first line of the street address.
     * </p>
     */
    private String street1;
    /**
     * <p>
     * The second line of the street address.
     * </p>
     */
    private String street2;
    /**
     * <p>
     * The third line of the street address.
     * </p>
     */
    private String street3;

    /**
     * <p>
     * The city for this address.
     * </p>
     * 
     * @param city
     *        The city for this address.
     */

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * <p>
     * The city for this address.
     * </p>
     * 
     * @return The city for this address.
     */

    public String getCity() {
        return this.city;
    }

    /**
     * <p>
     * The city for this address.
     * </p>
     * 
     * @param city
     *        The city for this address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withCity(String city) {
        setCity(city);
        return this;
    }

    /**
     * <p>
     * The company name for this address.
     * </p>
     * 
     * @param company
     *        The company name for this address.
     */

    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * <p>
     * The company name for this address.
     * </p>
     * 
     * @return The company name for this address.
     */

    public String getCompany() {
        return this.company;
    }

    /**
     * <p>
     * The company name for this address.
     * </p>
     * 
     * @param company
     *        The company name for this address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withCompany(String company) {
        setCompany(company);
        return this;
    }

    /**
     * <p>
     * The country for this address.
     * </p>
     * 
     * @param country
     *        The country for this address.
     */

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * <p>
     * The country for this address.
     * </p>
     * 
     * @return The country for this address.
     */

    public String getCountry() {
        return this.country;
    }

    /**
     * <p>
     * The country for this address.
     * </p>
     * 
     * @param country
     *        The country for this address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withCountry(String country) {
        setCountry(country);
        return this;
    }

    /**
     * <p>
     * The recipient's name for this address.
     * </p>
     * 
     * @param name
     *        The recipient's name for this address.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The recipient's name for this address.
     * </p>
     * 
     * @return The recipient's name for this address.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The recipient's name for this address.
     * </p>
     * 
     * @param name
     *        The recipient's name for this address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The phone number for this address.
     * </p>
     * 
     * @param phoneNumber
     *        The phone number for this address.
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * The phone number for this address.
     * </p>
     * 
     * @return The phone number for this address.
     */

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * <p>
     * The phone number for this address.
     * </p>
     * 
     * @param phoneNumber
     *        The phone number for this address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withPhoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * <p>
     * The postal code for this address.
     * </p>
     * 
     * @param postalCode
     *        The postal code for this address.
     */

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * <p>
     * The postal code for this address.
     * </p>
     * 
     * @return The postal code for this address.
     */

    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * <p>
     * The postal code for this address.
     * </p>
     * 
     * @param postalCode
     *        The postal code for this address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withPostalCode(String postalCode) {
        setPostalCode(postalCode);
        return this;
    }

    /**
     * <p>
     * The state or province for this address.
     * </p>
     * 
     * @param stateOrProvince
     *        The state or province for this address.
     */

    public void setStateOrProvince(String stateOrProvince) {
        this.stateOrProvince = stateOrProvince;
    }

    /**
     * <p>
     * The state or province for this address.
     * </p>
     * 
     * @return The state or province for this address.
     */

    public String getStateOrProvince() {
        return this.stateOrProvince;
    }

    /**
     * <p>
     * The state or province for this address.
     * </p>
     * 
     * @param stateOrProvince
     *        The state or province for this address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withStateOrProvince(String stateOrProvince) {
        setStateOrProvince(stateOrProvince);
        return this;
    }

    /**
     * <p>
     * The first line of the street address.
     * </p>
     * 
     * @param street1
     *        The first line of the street address.
     */

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    /**
     * <p>
     * The first line of the street address.
     * </p>
     * 
     * @return The first line of the street address.
     */

    public String getStreet1() {
        return this.street1;
    }

    /**
     * <p>
     * The first line of the street address.
     * </p>
     * 
     * @param street1
     *        The first line of the street address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withStreet1(String street1) {
        setStreet1(street1);
        return this;
    }

    /**
     * <p>
     * The second line of the street address.
     * </p>
     * 
     * @param street2
     *        The second line of the street address.
     */

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    /**
     * <p>
     * The second line of the street address.
     * </p>
     * 
     * @return The second line of the street address.
     */

    public String getStreet2() {
        return this.street2;
    }

    /**
     * <p>
     * The second line of the street address.
     * </p>
     * 
     * @param street2
     *        The second line of the street address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withStreet2(String street2) {
        setStreet2(street2);
        return this;
    }

    /**
     * <p>
     * The third line of the street address.
     * </p>
     * 
     * @param street3
     *        The third line of the street address.
     */

    public void setStreet3(String street3) {
        this.street3 = street3;
    }

    /**
     * <p>
     * The third line of the street address.
     * </p>
     * 
     * @return The third line of the street address.
     */

    public String getStreet3() {
        return this.street3;
    }

    /**
     * <p>
     * The third line of the street address.
     * </p>
     * 
     * @param street3
     *        The third line of the street address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withStreet3(String street3) {
        setStreet3(street3);
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
        if (getCity() != null)
            sb.append("City: ").append("***Sensitive Data Redacted***").append(",");
        if (getCompany() != null)
            sb.append("Company: ").append("***Sensitive Data Redacted***").append(",");
        if (getCountry() != null)
            sb.append("Country: ").append("***Sensitive Data Redacted***").append(",");
        if (getName() != null)
            sb.append("Name: ").append("***Sensitive Data Redacted***").append(",");
        if (getPhoneNumber() != null)
            sb.append("PhoneNumber: ").append("***Sensitive Data Redacted***").append(",");
        if (getPostalCode() != null)
            sb.append("PostalCode: ").append("***Sensitive Data Redacted***").append(",");
        if (getStateOrProvince() != null)
            sb.append("StateOrProvince: ").append("***Sensitive Data Redacted***").append(",");
        if (getStreet1() != null)
            sb.append("Street1: ").append("***Sensitive Data Redacted***").append(",");
        if (getStreet2() != null)
            sb.append("Street2: ").append("***Sensitive Data Redacted***").append(",");
        if (getStreet3() != null)
            sb.append("Street3: ").append("***Sensitive Data Redacted***");
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
        if (other.getCity() == null ^ this.getCity() == null)
            return false;
        if (other.getCity() != null && other.getCity().equals(this.getCity()) == false)
            return false;
        if (other.getCompany() == null ^ this.getCompany() == null)
            return false;
        if (other.getCompany() != null && other.getCompany().equals(this.getCompany()) == false)
            return false;
        if (other.getCountry() == null ^ this.getCountry() == null)
            return false;
        if (other.getCountry() != null && other.getCountry().equals(this.getCountry()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        if (other.getPostalCode() == null ^ this.getPostalCode() == null)
            return false;
        if (other.getPostalCode() != null && other.getPostalCode().equals(this.getPostalCode()) == false)
            return false;
        if (other.getStateOrProvince() == null ^ this.getStateOrProvince() == null)
            return false;
        if (other.getStateOrProvince() != null && other.getStateOrProvince().equals(this.getStateOrProvince()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCity() == null) ? 0 : getCity().hashCode());
        hashCode = prime * hashCode + ((getCompany() == null) ? 0 : getCompany().hashCode());
        hashCode = prime * hashCode + ((getCountry() == null) ? 0 : getCountry().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getPostalCode() == null) ? 0 : getPostalCode().hashCode());
        hashCode = prime * hashCode + ((getStateOrProvince() == null) ? 0 : getStateOrProvince().hashCode());
        hashCode = prime * hashCode + ((getStreet1() == null) ? 0 : getStreet1().hashCode());
        hashCode = prime * hashCode + ((getStreet2() == null) ? 0 : getStreet2().hashCode());
        hashCode = prime * hashCode + ((getStreet3() == null) ? 0 : getStreet3().hashCode());
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
        com.amazonaws.services.private5g.model.transform.AddressMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
