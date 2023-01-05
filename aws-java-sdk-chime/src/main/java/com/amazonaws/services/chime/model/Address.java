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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A validated address.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/Address" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Address implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The address street, such as <code>8th Avenue</code>.
     * </p>
     */
    private String streetName;
    /**
     * <p>
     * The address suffix, such as the <code>N</code> in <code>8th Avenue N</code>.
     * </p>
     */
    private String streetSuffix;
    /**
     * <p>
     * An address suffix location, such as the <code>S. Unit A</code> in <code>Central Park S. Unit A</code>.
     * </p>
     */
    private String postDirectional;
    /**
     * <p>
     * An address prefix location, such as the <code>N</code> in <code>N. Third St.</code>.
     * </p>
     */
    private String preDirectional;
    /**
     * <p>
     * The numeric portion of an address.
     * </p>
     */
    private String streetNumber;
    /**
     * <p>
     * The city of an address.
     * </p>
     */
    private String city;
    /**
     * <p>
     * The state of an address.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The postal code of an address.
     * </p>
     */
    private String postalCode;
    /**
     * <p>
     * The Zip + 4 or postal code + 4 of an address.
     * </p>
     */
    private String postalCodePlus4;
    /**
     * <p>
     * The country of an address.
     * </p>
     */
    private String country;

    /**
     * <p>
     * The address street, such as <code>8th Avenue</code>.
     * </p>
     * 
     * @param streetName
     *        The address street, such as <code>8th Avenue</code>.
     */

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    /**
     * <p>
     * The address street, such as <code>8th Avenue</code>.
     * </p>
     * 
     * @return The address street, such as <code>8th Avenue</code>.
     */

    public String getStreetName() {
        return this.streetName;
    }

    /**
     * <p>
     * The address street, such as <code>8th Avenue</code>.
     * </p>
     * 
     * @param streetName
     *        The address street, such as <code>8th Avenue</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withStreetName(String streetName) {
        setStreetName(streetName);
        return this;
    }

    /**
     * <p>
     * The address suffix, such as the <code>N</code> in <code>8th Avenue N</code>.
     * </p>
     * 
     * @param streetSuffix
     *        The address suffix, such as the <code>N</code> in <code>8th Avenue N</code>.
     */

    public void setStreetSuffix(String streetSuffix) {
        this.streetSuffix = streetSuffix;
    }

    /**
     * <p>
     * The address suffix, such as the <code>N</code> in <code>8th Avenue N</code>.
     * </p>
     * 
     * @return The address suffix, such as the <code>N</code> in <code>8th Avenue N</code>.
     */

    public String getStreetSuffix() {
        return this.streetSuffix;
    }

    /**
     * <p>
     * The address suffix, such as the <code>N</code> in <code>8th Avenue N</code>.
     * </p>
     * 
     * @param streetSuffix
     *        The address suffix, such as the <code>N</code> in <code>8th Avenue N</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withStreetSuffix(String streetSuffix) {
        setStreetSuffix(streetSuffix);
        return this;
    }

    /**
     * <p>
     * An address suffix location, such as the <code>S. Unit A</code> in <code>Central Park S. Unit A</code>.
     * </p>
     * 
     * @param postDirectional
     *        An address suffix location, such as the <code>S. Unit A</code> in <code>Central Park S. Unit A</code>.
     */

    public void setPostDirectional(String postDirectional) {
        this.postDirectional = postDirectional;
    }

    /**
     * <p>
     * An address suffix location, such as the <code>S. Unit A</code> in <code>Central Park S. Unit A</code>.
     * </p>
     * 
     * @return An address suffix location, such as the <code>S. Unit A</code> in <code>Central Park S. Unit A</code>.
     */

    public String getPostDirectional() {
        return this.postDirectional;
    }

    /**
     * <p>
     * An address suffix location, such as the <code>S. Unit A</code> in <code>Central Park S. Unit A</code>.
     * </p>
     * 
     * @param postDirectional
     *        An address suffix location, such as the <code>S. Unit A</code> in <code>Central Park S. Unit A</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withPostDirectional(String postDirectional) {
        setPostDirectional(postDirectional);
        return this;
    }

    /**
     * <p>
     * An address prefix location, such as the <code>N</code> in <code>N. Third St.</code>.
     * </p>
     * 
     * @param preDirectional
     *        An address prefix location, such as the <code>N</code> in <code>N. Third St.</code>.
     */

    public void setPreDirectional(String preDirectional) {
        this.preDirectional = preDirectional;
    }

    /**
     * <p>
     * An address prefix location, such as the <code>N</code> in <code>N. Third St.</code>.
     * </p>
     * 
     * @return An address prefix location, such as the <code>N</code> in <code>N. Third St.</code>.
     */

    public String getPreDirectional() {
        return this.preDirectional;
    }

    /**
     * <p>
     * An address prefix location, such as the <code>N</code> in <code>N. Third St.</code>.
     * </p>
     * 
     * @param preDirectional
     *        An address prefix location, such as the <code>N</code> in <code>N. Third St.</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withPreDirectional(String preDirectional) {
        setPreDirectional(preDirectional);
        return this;
    }

    /**
     * <p>
     * The numeric portion of an address.
     * </p>
     * 
     * @param streetNumber
     *        The numeric portion of an address.
     */

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    /**
     * <p>
     * The numeric portion of an address.
     * </p>
     * 
     * @return The numeric portion of an address.
     */

    public String getStreetNumber() {
        return this.streetNumber;
    }

    /**
     * <p>
     * The numeric portion of an address.
     * </p>
     * 
     * @param streetNumber
     *        The numeric portion of an address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withStreetNumber(String streetNumber) {
        setStreetNumber(streetNumber);
        return this;
    }

    /**
     * <p>
     * The city of an address.
     * </p>
     * 
     * @param city
     *        The city of an address.
     */

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * <p>
     * The city of an address.
     * </p>
     * 
     * @return The city of an address.
     */

    public String getCity() {
        return this.city;
    }

    /**
     * <p>
     * The city of an address.
     * </p>
     * 
     * @param city
     *        The city of an address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withCity(String city) {
        setCity(city);
        return this;
    }

    /**
     * <p>
     * The state of an address.
     * </p>
     * 
     * @param state
     *        The state of an address.
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of an address.
     * </p>
     * 
     * @return The state of an address.
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of an address.
     * </p>
     * 
     * @param state
     *        The state of an address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The postal code of an address.
     * </p>
     * 
     * @param postalCode
     *        The postal code of an address.
     */

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * <p>
     * The postal code of an address.
     * </p>
     * 
     * @return The postal code of an address.
     */

    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * <p>
     * The postal code of an address.
     * </p>
     * 
     * @param postalCode
     *        The postal code of an address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withPostalCode(String postalCode) {
        setPostalCode(postalCode);
        return this;
    }

    /**
     * <p>
     * The Zip + 4 or postal code + 4 of an address.
     * </p>
     * 
     * @param postalCodePlus4
     *        The Zip + 4 or postal code + 4 of an address.
     */

    public void setPostalCodePlus4(String postalCodePlus4) {
        this.postalCodePlus4 = postalCodePlus4;
    }

    /**
     * <p>
     * The Zip + 4 or postal code + 4 of an address.
     * </p>
     * 
     * @return The Zip + 4 or postal code + 4 of an address.
     */

    public String getPostalCodePlus4() {
        return this.postalCodePlus4;
    }

    /**
     * <p>
     * The Zip + 4 or postal code + 4 of an address.
     * </p>
     * 
     * @param postalCodePlus4
     *        The Zip + 4 or postal code + 4 of an address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withPostalCodePlus4(String postalCodePlus4) {
        setPostalCodePlus4(postalCodePlus4);
        return this;
    }

    /**
     * <p>
     * The country of an address.
     * </p>
     * 
     * @param country
     *        The country of an address.
     */

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * <p>
     * The country of an address.
     * </p>
     * 
     * @return The country of an address.
     */

    public String getCountry() {
        return this.country;
    }

    /**
     * <p>
     * The country of an address.
     * </p>
     * 
     * @param country
     *        The country of an address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withCountry(String country) {
        setCountry(country);
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
        if (getStreetName() != null)
            sb.append("StreetName: ").append("***Sensitive Data Redacted***").append(",");
        if (getStreetSuffix() != null)
            sb.append("StreetSuffix: ").append("***Sensitive Data Redacted***").append(",");
        if (getPostDirectional() != null)
            sb.append("PostDirectional: ").append("***Sensitive Data Redacted***").append(",");
        if (getPreDirectional() != null)
            sb.append("PreDirectional: ").append("***Sensitive Data Redacted***").append(",");
        if (getStreetNumber() != null)
            sb.append("StreetNumber: ").append("***Sensitive Data Redacted***").append(",");
        if (getCity() != null)
            sb.append("City: ").append("***Sensitive Data Redacted***").append(",");
        if (getState() != null)
            sb.append("State: ").append("***Sensitive Data Redacted***").append(",");
        if (getPostalCode() != null)
            sb.append("PostalCode: ").append("***Sensitive Data Redacted***").append(",");
        if (getPostalCodePlus4() != null)
            sb.append("PostalCodePlus4: ").append("***Sensitive Data Redacted***").append(",");
        if (getCountry() != null)
            sb.append("Country: ").append("***Sensitive Data Redacted***");
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
        if (other.getStreetName() == null ^ this.getStreetName() == null)
            return false;
        if (other.getStreetName() != null && other.getStreetName().equals(this.getStreetName()) == false)
            return false;
        if (other.getStreetSuffix() == null ^ this.getStreetSuffix() == null)
            return false;
        if (other.getStreetSuffix() != null && other.getStreetSuffix().equals(this.getStreetSuffix()) == false)
            return false;
        if (other.getPostDirectional() == null ^ this.getPostDirectional() == null)
            return false;
        if (other.getPostDirectional() != null && other.getPostDirectional().equals(this.getPostDirectional()) == false)
            return false;
        if (other.getPreDirectional() == null ^ this.getPreDirectional() == null)
            return false;
        if (other.getPreDirectional() != null && other.getPreDirectional().equals(this.getPreDirectional()) == false)
            return false;
        if (other.getStreetNumber() == null ^ this.getStreetNumber() == null)
            return false;
        if (other.getStreetNumber() != null && other.getStreetNumber().equals(this.getStreetNumber()) == false)
            return false;
        if (other.getCity() == null ^ this.getCity() == null)
            return false;
        if (other.getCity() != null && other.getCity().equals(this.getCity()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getPostalCode() == null ^ this.getPostalCode() == null)
            return false;
        if (other.getPostalCode() != null && other.getPostalCode().equals(this.getPostalCode()) == false)
            return false;
        if (other.getPostalCodePlus4() == null ^ this.getPostalCodePlus4() == null)
            return false;
        if (other.getPostalCodePlus4() != null && other.getPostalCodePlus4().equals(this.getPostalCodePlus4()) == false)
            return false;
        if (other.getCountry() == null ^ this.getCountry() == null)
            return false;
        if (other.getCountry() != null && other.getCountry().equals(this.getCountry()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreetName() == null) ? 0 : getStreetName().hashCode());
        hashCode = prime * hashCode + ((getStreetSuffix() == null) ? 0 : getStreetSuffix().hashCode());
        hashCode = prime * hashCode + ((getPostDirectional() == null) ? 0 : getPostDirectional().hashCode());
        hashCode = prime * hashCode + ((getPreDirectional() == null) ? 0 : getPreDirectional().hashCode());
        hashCode = prime * hashCode + ((getStreetNumber() == null) ? 0 : getStreetNumber().hashCode());
        hashCode = prime * hashCode + ((getCity() == null) ? 0 : getCity().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getPostalCode() == null) ? 0 : getPostalCode().hashCode());
        hashCode = prime * hashCode + ((getPostalCodePlus4() == null) ? 0 : getPostalCodePlus4().hashCode());
        hashCode = prime * hashCode + ((getCountry() == null) ? 0 : getCountry().hashCode());
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
        com.amazonaws.services.chime.model.transform.AddressMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
