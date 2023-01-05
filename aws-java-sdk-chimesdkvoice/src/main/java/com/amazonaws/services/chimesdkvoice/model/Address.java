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
package com.amazonaws.services.chimesdkvoice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/Address" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Address implements Serializable, Cloneable, StructuredPojo {

    private String streetName;

    private String streetSuffix;

    private String postDirectional;

    private String preDirectional;

    private String streetNumber;

    private String city;

    private String state;

    private String postalCode;

    private String postalCodePlus4;

    private String country;

    /**
     * @param streetName
     */

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    /**
     * @return
     */

    public String getStreetName() {
        return this.streetName;
    }

    /**
     * @param streetName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withStreetName(String streetName) {
        setStreetName(streetName);
        return this;
    }

    /**
     * @param streetSuffix
     */

    public void setStreetSuffix(String streetSuffix) {
        this.streetSuffix = streetSuffix;
    }

    /**
     * @return
     */

    public String getStreetSuffix() {
        return this.streetSuffix;
    }

    /**
     * @param streetSuffix
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withStreetSuffix(String streetSuffix) {
        setStreetSuffix(streetSuffix);
        return this;
    }

    /**
     * @param postDirectional
     */

    public void setPostDirectional(String postDirectional) {
        this.postDirectional = postDirectional;
    }

    /**
     * @return
     */

    public String getPostDirectional() {
        return this.postDirectional;
    }

    /**
     * @param postDirectional
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withPostDirectional(String postDirectional) {
        setPostDirectional(postDirectional);
        return this;
    }

    /**
     * @param preDirectional
     */

    public void setPreDirectional(String preDirectional) {
        this.preDirectional = preDirectional;
    }

    /**
     * @return
     */

    public String getPreDirectional() {
        return this.preDirectional;
    }

    /**
     * @param preDirectional
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withPreDirectional(String preDirectional) {
        setPreDirectional(preDirectional);
        return this;
    }

    /**
     * @param streetNumber
     */

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    /**
     * @return
     */

    public String getStreetNumber() {
        return this.streetNumber;
    }

    /**
     * @param streetNumber
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withStreetNumber(String streetNumber) {
        setStreetNumber(streetNumber);
        return this;
    }

    /**
     * @param city
     */

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return
     */

    public String getCity() {
        return this.city;
    }

    /**
     * @param city
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withCity(String city) {
        setCity(city);
        return this;
    }

    /**
     * @param state
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return
     */

    public String getState() {
        return this.state;
    }

    /**
     * @param state
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withState(String state) {
        setState(state);
        return this;
    }

    /**
     * @param postalCode
     */

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * @return
     */

    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * @param postalCode
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withPostalCode(String postalCode) {
        setPostalCode(postalCode);
        return this;
    }

    /**
     * @param postalCodePlus4
     */

    public void setPostalCodePlus4(String postalCodePlus4) {
        this.postalCodePlus4 = postalCodePlus4;
    }

    /**
     * @return
     */

    public String getPostalCodePlus4() {
        return this.postalCodePlus4;
    }

    /**
     * @param postalCodePlus4
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Address withPostalCodePlus4(String postalCodePlus4) {
        setPostalCodePlus4(postalCodePlus4);
        return this;
    }

    /**
     * @param country
     */

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return
     */

    public String getCountry() {
        return this.country;
    }

    /**
     * @param country
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
        com.amazonaws.services.chimesdkvoice.model.transform.AddressMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
