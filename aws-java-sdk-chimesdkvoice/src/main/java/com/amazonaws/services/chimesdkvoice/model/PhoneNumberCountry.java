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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/PhoneNumberCountry" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PhoneNumberCountry implements Serializable, Cloneable, StructuredPojo {

    private String countryCode;

    private java.util.List<String> supportedPhoneNumberTypes;

    /**
     * @param countryCode
     */

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * @return
     */

    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * @param countryCode
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhoneNumberCountry withCountryCode(String countryCode) {
        setCountryCode(countryCode);
        return this;
    }

    /**
     * @return
     * @see PhoneNumberType
     */

    public java.util.List<String> getSupportedPhoneNumberTypes() {
        return supportedPhoneNumberTypes;
    }

    /**
     * @param supportedPhoneNumberTypes
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
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedPhoneNumberTypes(java.util.Collection)} or
     * {@link #withSupportedPhoneNumberTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedPhoneNumberTypes
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
     * @param supportedPhoneNumberTypes
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberType
     */

    public PhoneNumberCountry withSupportedPhoneNumberTypes(java.util.Collection<String> supportedPhoneNumberTypes) {
        setSupportedPhoneNumberTypes(supportedPhoneNumberTypes);
        return this;
    }

    /**
     * @param supportedPhoneNumberTypes
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
        com.amazonaws.services.chimesdkvoice.model.transform.PhoneNumberCountryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
