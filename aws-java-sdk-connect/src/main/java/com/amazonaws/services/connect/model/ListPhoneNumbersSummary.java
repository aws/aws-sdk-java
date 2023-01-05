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
 * Information about phone numbers that have been claimed to your Amazon Connect instance or traffic distribution group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ListPhoneNumbersSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPhoneNumbersSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the phone number.
     * </p>
     */
    private String phoneNumberId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the phone number.
     * </p>
     */
    private String phoneNumberArn;
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
     * The Amazon Resource Name (ARN) for Amazon Connect instances or traffic distribution groups that phone numbers are
     * claimed to.
     * </p>
     */
    private String targetArn;

    /**
     * <p>
     * A unique identifier for the phone number.
     * </p>
     * 
     * @param phoneNumberId
     *        A unique identifier for the phone number.
     */

    public void setPhoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
    }

    /**
     * <p>
     * A unique identifier for the phone number.
     * </p>
     * 
     * @return A unique identifier for the phone number.
     */

    public String getPhoneNumberId() {
        return this.phoneNumberId;
    }

    /**
     * <p>
     * A unique identifier for the phone number.
     * </p>
     * 
     * @param phoneNumberId
     *        A unique identifier for the phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPhoneNumbersSummary withPhoneNumberId(String phoneNumberId) {
        setPhoneNumberId(phoneNumberId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the phone number.
     * </p>
     * 
     * @param phoneNumberArn
     *        The Amazon Resource Name (ARN) of the phone number.
     */

    public void setPhoneNumberArn(String phoneNumberArn) {
        this.phoneNumberArn = phoneNumberArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the phone number.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the phone number.
     */

    public String getPhoneNumberArn() {
        return this.phoneNumberArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the phone number.
     * </p>
     * 
     * @param phoneNumberArn
     *        The Amazon Resource Name (ARN) of the phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPhoneNumbersSummary withPhoneNumberArn(String phoneNumberArn) {
        setPhoneNumberArn(phoneNumberArn);
        return this;
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

    public ListPhoneNumbersSummary withPhoneNumber(String phoneNumber) {
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

    public ListPhoneNumbersSummary withPhoneNumberCountryCode(String phoneNumberCountryCode) {
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

    public ListPhoneNumbersSummary withPhoneNumberCountryCode(PhoneNumberCountryCode phoneNumberCountryCode) {
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

    public ListPhoneNumbersSummary withPhoneNumberType(String phoneNumberType) {
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

    public ListPhoneNumbersSummary withPhoneNumberType(PhoneNumberType phoneNumberType) {
        this.phoneNumberType = phoneNumberType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for Amazon Connect instances or traffic distribution groups that phone numbers are
     * claimed to.
     * </p>
     * 
     * @param targetArn
     *        The Amazon Resource Name (ARN) for Amazon Connect instances or traffic distribution groups that phone
     *        numbers are claimed to.
     */

    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for Amazon Connect instances or traffic distribution groups that phone numbers are
     * claimed to.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for Amazon Connect instances or traffic distribution groups that phone
     *         numbers are claimed to.
     */

    public String getTargetArn() {
        return this.targetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for Amazon Connect instances or traffic distribution groups that phone numbers are
     * claimed to.
     * </p>
     * 
     * @param targetArn
     *        The Amazon Resource Name (ARN) for Amazon Connect instances or traffic distribution groups that phone
     *        numbers are claimed to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPhoneNumbersSummary withTargetArn(String targetArn) {
        setTargetArn(targetArn);
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
        if (getPhoneNumberId() != null)
            sb.append("PhoneNumberId: ").append(getPhoneNumberId()).append(",");
        if (getPhoneNumberArn() != null)
            sb.append("PhoneNumberArn: ").append(getPhoneNumberArn()).append(",");
        if (getPhoneNumber() != null)
            sb.append("PhoneNumber: ").append(getPhoneNumber()).append(",");
        if (getPhoneNumberCountryCode() != null)
            sb.append("PhoneNumberCountryCode: ").append(getPhoneNumberCountryCode()).append(",");
        if (getPhoneNumberType() != null)
            sb.append("PhoneNumberType: ").append(getPhoneNumberType()).append(",");
        if (getTargetArn() != null)
            sb.append("TargetArn: ").append(getTargetArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPhoneNumbersSummary == false)
            return false;
        ListPhoneNumbersSummary other = (ListPhoneNumbersSummary) obj;
        if (other.getPhoneNumberId() == null ^ this.getPhoneNumberId() == null)
            return false;
        if (other.getPhoneNumberId() != null && other.getPhoneNumberId().equals(this.getPhoneNumberId()) == false)
            return false;
        if (other.getPhoneNumberArn() == null ^ this.getPhoneNumberArn() == null)
            return false;
        if (other.getPhoneNumberArn() != null && other.getPhoneNumberArn().equals(this.getPhoneNumberArn()) == false)
            return false;
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
        if (other.getTargetArn() == null ^ this.getTargetArn() == null)
            return false;
        if (other.getTargetArn() != null && other.getTargetArn().equals(this.getTargetArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPhoneNumberId() == null) ? 0 : getPhoneNumberId().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumberArn() == null) ? 0 : getPhoneNumberArn().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumberCountryCode() == null) ? 0 : getPhoneNumberCountryCode().hashCode());
        hashCode = prime * hashCode + ((getPhoneNumberType() == null) ? 0 : getPhoneNumberType().hashCode());
        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode());
        return hashCode;
    }

    @Override
    public ListPhoneNumbersSummary clone() {
        try {
            return (ListPhoneNumbersSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.ListPhoneNumbersSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
