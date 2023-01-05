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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about available phone numbers.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/AvailableNumberSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AvailableNumberSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The phone number. Phone numbers are formatted
     * <code>[+] [country code] [subscriber number including area code]</code>.
     * </p>
     */
    private String phoneNumber;
    /**
     * <p>
     * The ISO country code.
     * </p>
     */
    private String phoneNumberCountryCode;
    /**
     * <p>
     * The type of phone number.
     * </p>
     */
    private String phoneNumberType;

    /**
     * <p>
     * The phone number. Phone numbers are formatted
     * <code>[+] [country code] [subscriber number including area code]</code>.
     * </p>
     * 
     * @param phoneNumber
     *        The phone number. Phone numbers are formatted
     *        <code>[+] [country code] [subscriber number including area code]</code>.
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * The phone number. Phone numbers are formatted
     * <code>[+] [country code] [subscriber number including area code]</code>.
     * </p>
     * 
     * @return The phone number. Phone numbers are formatted
     *         <code>[+] [country code] [subscriber number including area code]</code>.
     */

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * <p>
     * The phone number. Phone numbers are formatted
     * <code>[+] [country code] [subscriber number including area code]</code>.
     * </p>
     * 
     * @param phoneNumber
     *        The phone number. Phone numbers are formatted
     *        <code>[+] [country code] [subscriber number including area code]</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AvailableNumberSummary withPhoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * <p>
     * The ISO country code.
     * </p>
     * 
     * @param phoneNumberCountryCode
     *        The ISO country code.
     * @see PhoneNumberCountryCode
     */

    public void setPhoneNumberCountryCode(String phoneNumberCountryCode) {
        this.phoneNumberCountryCode = phoneNumberCountryCode;
    }

    /**
     * <p>
     * The ISO country code.
     * </p>
     * 
     * @return The ISO country code.
     * @see PhoneNumberCountryCode
     */

    public String getPhoneNumberCountryCode() {
        return this.phoneNumberCountryCode;
    }

    /**
     * <p>
     * The ISO country code.
     * </p>
     * 
     * @param phoneNumberCountryCode
     *        The ISO country code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberCountryCode
     */

    public AvailableNumberSummary withPhoneNumberCountryCode(String phoneNumberCountryCode) {
        setPhoneNumberCountryCode(phoneNumberCountryCode);
        return this;
    }

    /**
     * <p>
     * The ISO country code.
     * </p>
     * 
     * @param phoneNumberCountryCode
     *        The ISO country code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberCountryCode
     */

    public AvailableNumberSummary withPhoneNumberCountryCode(PhoneNumberCountryCode phoneNumberCountryCode) {
        this.phoneNumberCountryCode = phoneNumberCountryCode.toString();
        return this;
    }

    /**
     * <p>
     * The type of phone number.
     * </p>
     * 
     * @param phoneNumberType
     *        The type of phone number.
     * @see PhoneNumberType
     */

    public void setPhoneNumberType(String phoneNumberType) {
        this.phoneNumberType = phoneNumberType;
    }

    /**
     * <p>
     * The type of phone number.
     * </p>
     * 
     * @return The type of phone number.
     * @see PhoneNumberType
     */

    public String getPhoneNumberType() {
        return this.phoneNumberType;
    }

    /**
     * <p>
     * The type of phone number.
     * </p>
     * 
     * @param phoneNumberType
     *        The type of phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberType
     */

    public AvailableNumberSummary withPhoneNumberType(String phoneNumberType) {
        setPhoneNumberType(phoneNumberType);
        return this;
    }

    /**
     * <p>
     * The type of phone number.
     * </p>
     * 
     * @param phoneNumberType
     *        The type of phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhoneNumberType
     */

    public AvailableNumberSummary withPhoneNumberType(PhoneNumberType phoneNumberType) {
        this.phoneNumberType = phoneNumberType.toString();
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
        if (getPhoneNumber() != null)
            sb.append("PhoneNumber: ").append(getPhoneNumber()).append(",");
        if (getPhoneNumberCountryCode() != null)
            sb.append("PhoneNumberCountryCode: ").append(getPhoneNumberCountryCode()).append(",");
        if (getPhoneNumberType() != null)
            sb.append("PhoneNumberType: ").append(getPhoneNumberType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AvailableNumberSummary == false)
            return false;
        AvailableNumberSummary other = (AvailableNumberSummary) obj;
        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        if (other.getPhoneNumberCountryCode() == null ^ this.getPhoneNumberCountryCode() == null)
            return false;
        if (other.getPhoneNumberCountryCode() != null && other.getPhoneNumberCountryCode().equals(this.getPhoneNumberCountryCode()) == false)
            return false;
        if (other.getPhoneNumberType() == null ^ this.getPhoneNumberType() == null)
            return false;
        if (other.getPhoneNumberType() != null && other.getPhoneNumberType().equals(this.getPhoneNumberType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumberCountryCode() == null) ? 0 : getPhoneNumberCountryCode().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumberType() == null) ? 0 : getPhoneNumberType().hashCode());
        return hashCode;
    }

    @Override
    public AvailableNumberSummary clone() {
        try {
            return (AvailableNumberSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.AvailableNumberSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
