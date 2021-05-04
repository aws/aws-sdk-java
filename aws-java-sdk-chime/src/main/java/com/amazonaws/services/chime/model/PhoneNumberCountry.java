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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The phone number country.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/PhoneNumberCountry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PhoneNumberCountry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The phone number country code. Format: ISO 3166-1 alpha-2.
     * </p>
     */
    private String countryCode;
    /**
     * <p>
     * The supported phone number types.
     * </p>
     */
    private java.util.List<String> supportedPhoneNumberTypes;

    /**
     * <p>
     * The phone number country code. Format: ISO 3166-1 alpha-2.
     * </p>
     * 
     * @param countryCode
     *        The phone number country code. Format: ISO 3166-1 alpha-2.
     */

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * <p>
     * The phone number country code. Format: ISO 3166-1 alpha-2.
     * </p>
     * 
     * @return The phone number country code. Format: ISO 3166-1 alpha-2.
     */

    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * <p>
     * The phone number country code. Format: ISO 3166-1 alpha-2.
     * </p>
     * 
     * @param countryCode
     *        The phone number country code. Format: ISO 3166-1 alpha-2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhoneNumberCountry withCountryCode(String countryCode) {
        setCountryCode(countryCode);
        return this;
    }

    /**
     * <p>
     * The supported phone number types.
     * </p>
     * 
     * @return The supported phone number types.
     * @see PhoneNumberType
     */

    public java.util.List<String> getSupportedPhoneNumberTypes() {
        return supportedPhoneNumberTypes;
    }

    /**
     * <p>
     * The supported phone number types.
     * </p>
     * 
     * @param supportedPhoneNumberTypes
     *        The supported phone number types.
     * @see PhoneNumberType
     */

    public void setSupportedPhoneNumberTypes(java.util.Collection<String> supportedPhoneNumberTypes) {
        if (supportedPhoneNumberTypes == null) {
            this.supportedPhoneNumberTypes = null;
            return;
        }

        this.supportedPhoneNumberTypes = new java.util.ArrayList<String>(supportedPhoneNumberTypes);
    }

    /**
     * <p>
     * The supported phone number types.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedPhoneNumberTypes(java.util.Collection)} or
     * {@link #withSupportedPhoneNumberTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedPhoneNumberTypes
     *        The supported phone number types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberType
     */

    public PhoneNumberCountry withSupportedPhoneNumberTypes(String... supportedPhoneNumberTypes) {
        if (this.supportedPhoneNumberTypes == null) {
            setSupportedPhoneNumberTypes(new java.util.ArrayList<String>(supportedPhoneNumberTypes.length));
        }
        for (String ele : supportedPhoneNumberTypes) {
            this.supportedPhoneNumberTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The supported phone number types.
     * </p>
     * 
     * @param supportedPhoneNumberTypes
     *        The supported phone number types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberType
     */

    public PhoneNumberCountry withSupportedPhoneNumberTypes(java.util.Collection<String> supportedPhoneNumberTypes) {
        setSupportedPhoneNumberTypes(supportedPhoneNumberTypes);
        return this;
    }

    /**
     * <p>
     * The supported phone number types.
     * </p>
     * 
     * @param supportedPhoneNumberTypes
     *        The supported phone number types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberType
     */

    public PhoneNumberCountry withSupportedPhoneNumberTypes(PhoneNumberType... supportedPhoneNumberTypes) {
        java.util.ArrayList<String> supportedPhoneNumberTypesCopy = new java.util.ArrayList<String>(supportedPhoneNumberTypes.length);
        for (PhoneNumberType value : supportedPhoneNumberTypes) {
            supportedPhoneNumberTypesCopy.add(value.toString());
        }
        if (getSupportedPhoneNumberTypes() == null) {
            setSupportedPhoneNumberTypes(supportedPhoneNumberTypesCopy);
        } else {
            getSupportedPhoneNumberTypes().addAll(supportedPhoneNumberTypesCopy);
        }
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
        if (getCountryCode() != null)
            sb.append("CountryCode: ").append(getCountryCode()).append(",");
        if (getSupportedPhoneNumberTypes() != null)
            sb.append("SupportedPhoneNumberTypes: ").append(getSupportedPhoneNumberTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PhoneNumberCountry == false)
            return false;
        PhoneNumberCountry other = (PhoneNumberCountry) obj;
        if (other.getCountryCode() == null ^ this.getCountryCode() == null)
            return false;
        if (other.getCountryCode() != null && other.getCountryCode().equals(this.getCountryCode()) == false)
            return false;
        if (other.getSupportedPhoneNumberTypes() == null ^ this.getSupportedPhoneNumberTypes() == null)
            return false;
        if (other.getSupportedPhoneNumberTypes() != null && other.getSupportedPhoneNumberTypes().equals(this.getSupportedPhoneNumberTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCountryCode() == null) ? 0 : getCountryCode().hashCode());
        hashCode = prime * hashCode + ((getSupportedPhoneNumberTypes() == null) ? 0 : getSupportedPhoneNumberTypes().hashCode());
        return hashCode;
    }

    @Override
    public PhoneNumberCountry clone() {
        try {
            return (PhoneNumberCountry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.PhoneNumberCountryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
