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
 * A suggested address.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CandidateAddress" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CandidateAddress implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The street information of a candidate address
     * </p>
     */
    private String streetInfo;
    /**
     * <p>
     * The numeric portion of a candidate address.
     * </p>
     */
    private String streetNumber;
    /**
     * <p>
     * The city of a candidate address.
     * </p>
     */
    private String city;
    /**
     * <p>
     * The state of a candidate address.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The postal code of a candidate address.
     * </p>
     */
    private String postalCode;
    /**
     * <p>
     * The Zip + 4 or postal code + 4 of a candidate address.
     * </p>
     */
    private String postalCodePlus4;
    /**
     * <p>
     * The country of a candidate address.
     * </p>
     */
    private String country;

    /**
     * <p>
     * The street information of a candidate address
     * </p>
     * 
     * @param streetInfo
     *        The street information of a candidate address
     */

    public void setStreetInfo(String streetInfo) {
        this.streetInfo = streetInfo;
    }

    /**
     * <p>
     * The street information of a candidate address
     * </p>
     * 
     * @return The street information of a candidate address
     */

    public String getStreetInfo() {
        return this.streetInfo;
    }

    /**
     * <p>
     * The street information of a candidate address
     * </p>
     * 
     * @param streetInfo
     *        The street information of a candidate address
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CandidateAddress withStreetInfo(String streetInfo) {
        setStreetInfo(streetInfo);
        return this;
    }

    /**
     * <p>
     * The numeric portion of a candidate address.
     * </p>
     * 
     * @param streetNumber
     *        The numeric portion of a candidate address.
     */

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    /**
     * <p>
     * The numeric portion of a candidate address.
     * </p>
     * 
     * @return The numeric portion of a candidate address.
     */

    public String getStreetNumber() {
        return this.streetNumber;
    }

    /**
     * <p>
     * The numeric portion of a candidate address.
     * </p>
     * 
     * @param streetNumber
     *        The numeric portion of a candidate address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CandidateAddress withStreetNumber(String streetNumber) {
        setStreetNumber(streetNumber);
        return this;
    }

    /**
     * <p>
     * The city of a candidate address.
     * </p>
     * 
     * @param city
     *        The city of a candidate address.
     */

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * <p>
     * The city of a candidate address.
     * </p>
     * 
     * @return The city of a candidate address.
     */

    public String getCity() {
        return this.city;
    }

    /**
     * <p>
     * The city of a candidate address.
     * </p>
     * 
     * @param city
     *        The city of a candidate address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CandidateAddress withCity(String city) {
        setCity(city);
        return this;
    }

    /**
     * <p>
     * The state of a candidate address.
     * </p>
     * 
     * @param state
     *        The state of a candidate address.
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of a candidate address.
     * </p>
     * 
     * @return The state of a candidate address.
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of a candidate address.
     * </p>
     * 
     * @param state
     *        The state of a candidate address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CandidateAddress withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The postal code of a candidate address.
     * </p>
     * 
     * @param postalCode
     *        The postal code of a candidate address.
     */

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * <p>
     * The postal code of a candidate address.
     * </p>
     * 
     * @return The postal code of a candidate address.
     */

    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * <p>
     * The postal code of a candidate address.
     * </p>
     * 
     * @param postalCode
     *        The postal code of a candidate address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CandidateAddress withPostalCode(String postalCode) {
        setPostalCode(postalCode);
        return this;
    }

    /**
     * <p>
     * The Zip + 4 or postal code + 4 of a candidate address.
     * </p>
     * 
     * @param postalCodePlus4
     *        The Zip + 4 or postal code + 4 of a candidate address.
     */

    public void setPostalCodePlus4(String postalCodePlus4) {
        this.postalCodePlus4 = postalCodePlus4;
    }

    /**
     * <p>
     * The Zip + 4 or postal code + 4 of a candidate address.
     * </p>
     * 
     * @return The Zip + 4 or postal code + 4 of a candidate address.
     */

    public String getPostalCodePlus4() {
        return this.postalCodePlus4;
    }

    /**
     * <p>
     * The Zip + 4 or postal code + 4 of a candidate address.
     * </p>
     * 
     * @param postalCodePlus4
     *        The Zip + 4 or postal code + 4 of a candidate address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CandidateAddress withPostalCodePlus4(String postalCodePlus4) {
        setPostalCodePlus4(postalCodePlus4);
        return this;
    }

    /**
     * <p>
     * The country of a candidate address.
     * </p>
     * 
     * @param country
     *        The country of a candidate address.
     */

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * <p>
     * The country of a candidate address.
     * </p>
     * 
     * @return The country of a candidate address.
     */

    public String getCountry() {
        return this.country;
    }

    /**
     * <p>
     * The country of a candidate address.
     * </p>
     * 
     * @param country
     *        The country of a candidate address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CandidateAddress withCountry(String country) {
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
        if (getStreetInfo() != null)
            sb.append("StreetInfo: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof CandidateAddress == false)
            return false;
        CandidateAddress other = (CandidateAddress) obj;
        if (other.getStreetInfo() == null ^ this.getStreetInfo() == null)
            return false;
        if (other.getStreetInfo() != null && other.getStreetInfo().equals(this.getStreetInfo()) == false)
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

        hashCode = prime * hashCode + ((getStreetInfo() == null) ? 0 : getStreetInfo().hashCode());
        hashCode = prime * hashCode + ((getStreetNumber() == null) ? 0 : getStreetNumber().hashCode());
        hashCode = prime * hashCode + ((getCity() == null) ? 0 : getCity().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getPostalCode() == null) ? 0 : getPostalCode().hashCode());
        hashCode = prime * hashCode + ((getPostalCodePlus4() == null) ? 0 : getPostalCodePlus4().hashCode());
        hashCode = prime * hashCode + ((getCountry() == null) ? 0 : getCountry().hashCode());
        return hashCode;
    }

    @Override
    public CandidateAddress clone() {
        try {
            return (CandidateAddress) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.CandidateAddressMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
