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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a phone number to validate and retrieve information about.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/NumberValidateRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NumberValidateRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region where the phone number was
     * originally registered.
     * </p>
     */
    private String isoCountryCode;
    /**
     * <p>
     * The phone number to retrieve information about. The phone number that you provide should include a valid numeric
     * country code. Otherwise, the operation might result in an error.
     * </p>
     */
    private String phoneNumber;

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region where the phone number was
     * originally registered.
     * </p>
     * 
     * @param isoCountryCode
     *        The two-character code, in ISO 3166-1 alpha-2 format, for the country or region where the phone number was
     *        originally registered.
     */

    public void setIsoCountryCode(String isoCountryCode) {
        this.isoCountryCode = isoCountryCode;
    }

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region where the phone number was
     * originally registered.
     * </p>
     * 
     * @return The two-character code, in ISO 3166-1 alpha-2 format, for the country or region where the phone number
     *         was originally registered.
     */

    public String getIsoCountryCode() {
        return this.isoCountryCode;
    }

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region where the phone number was
     * originally registered.
     * </p>
     * 
     * @param isoCountryCode
     *        The two-character code, in ISO 3166-1 alpha-2 format, for the country or region where the phone number was
     *        originally registered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumberValidateRequest withIsoCountryCode(String isoCountryCode) {
        setIsoCountryCode(isoCountryCode);
        return this;
    }

    /**
     * <p>
     * The phone number to retrieve information about. The phone number that you provide should include a valid numeric
     * country code. Otherwise, the operation might result in an error.
     * </p>
     * 
     * @param phoneNumber
     *        The phone number to retrieve information about. The phone number that you provide should include a valid
     *        numeric country code. Otherwise, the operation might result in an error.
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * The phone number to retrieve information about. The phone number that you provide should include a valid numeric
     * country code. Otherwise, the operation might result in an error.
     * </p>
     * 
     * @return The phone number to retrieve information about. The phone number that you provide should include a valid
     *         numeric country code. Otherwise, the operation might result in an error.
     */

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * <p>
     * The phone number to retrieve information about. The phone number that you provide should include a valid numeric
     * country code. Otherwise, the operation might result in an error.
     * </p>
     * 
     * @param phoneNumber
     *        The phone number to retrieve information about. The phone number that you provide should include a valid
     *        numeric country code. Otherwise, the operation might result in an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumberValidateRequest withPhoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
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
        if (getIsoCountryCode() != null)
            sb.append("IsoCountryCode: ").append(getIsoCountryCode()).append(",");
        if (getPhoneNumber() != null)
            sb.append("PhoneNumber: ").append(getPhoneNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NumberValidateRequest == false)
            return false;
        NumberValidateRequest other = (NumberValidateRequest) obj;
        if (other.getIsoCountryCode() == null ^ this.getIsoCountryCode() == null)
            return false;
        if (other.getIsoCountryCode() != null && other.getIsoCountryCode().equals(this.getIsoCountryCode()) == false)
            return false;
        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsoCountryCode() == null) ? 0 : getIsoCountryCode().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        return hashCode;
    }

    @Override
    public NumberValidateRequest clone() {
        try {
            return (NumberValidateRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.NumberValidateRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
