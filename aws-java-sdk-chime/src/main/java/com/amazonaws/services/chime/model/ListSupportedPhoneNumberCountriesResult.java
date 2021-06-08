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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ListSupportedPhoneNumberCountries"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSupportedPhoneNumberCountriesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The supported phone number countries.
     * </p>
     */
    private java.util.List<PhoneNumberCountry> phoneNumberCountries;

    /**
     * <p>
     * The supported phone number countries.
     * </p>
     * 
     * @return The supported phone number countries.
     */

    public java.util.List<PhoneNumberCountry> getPhoneNumberCountries() {
        return phoneNumberCountries;
    }

    /**
     * <p>
     * The supported phone number countries.
     * </p>
     * 
     * @param phoneNumberCountries
     *        The supported phone number countries.
     */

    public void setPhoneNumberCountries(java.util.Collection<PhoneNumberCountry> phoneNumberCountries) {
        if (phoneNumberCountries == null) {
            this.phoneNumberCountries = null;
            return;
        }

        this.phoneNumberCountries = new java.util.ArrayList<PhoneNumberCountry>(phoneNumberCountries);
    }

    /**
     * <p>
     * The supported phone number countries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPhoneNumberCountries(java.util.Collection)} or {@link #withPhoneNumberCountries(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param phoneNumberCountries
     *        The supported phone number countries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSupportedPhoneNumberCountriesResult withPhoneNumberCountries(PhoneNumberCountry... phoneNumberCountries) {
        if (this.phoneNumberCountries == null) {
            setPhoneNumberCountries(new java.util.ArrayList<PhoneNumberCountry>(phoneNumberCountries.length));
        }
        for (PhoneNumberCountry ele : phoneNumberCountries) {
            this.phoneNumberCountries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The supported phone number countries.
     * </p>
     * 
     * @param phoneNumberCountries
     *        The supported phone number countries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSupportedPhoneNumberCountriesResult withPhoneNumberCountries(java.util.Collection<PhoneNumberCountry> phoneNumberCountries) {
        setPhoneNumberCountries(phoneNumberCountries);
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
        if (getPhoneNumberCountries() != null)
            sb.append("PhoneNumberCountries: ").append(getPhoneNumberCountries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSupportedPhoneNumberCountriesResult == false)
            return false;
        ListSupportedPhoneNumberCountriesResult other = (ListSupportedPhoneNumberCountriesResult) obj;
        if (other.getPhoneNumberCountries() == null ^ this.getPhoneNumberCountries() == null)
            return false;
        if (other.getPhoneNumberCountries() != null && other.getPhoneNumberCountries().equals(this.getPhoneNumberCountries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPhoneNumberCountries() == null) ? 0 : getPhoneNumberCountries().hashCode());
        return hashCode;
    }

    @Override
    public ListSupportedPhoneNumberCountriesResult clone() {
        try {
            return (ListSupportedPhoneNumberCountriesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
