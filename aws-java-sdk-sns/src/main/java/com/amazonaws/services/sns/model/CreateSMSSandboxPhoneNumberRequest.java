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
package com.amazonaws.services.sns.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/CreateSMSSandboxPhoneNumber" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSMSSandboxPhoneNumberRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The destination phone number to verify. On verification, Amazon SNS adds this phone number to the list of
     * verified phone numbers that you can send SMS messages to.
     * </p>
     */
    private String phoneNumber;
    /**
     * <p>
     * The language to use for sending the OTP. The default value is <code>en-US</code>.
     * </p>
     */
    private String languageCode;

    /**
     * <p>
     * The destination phone number to verify. On verification, Amazon SNS adds this phone number to the list of
     * verified phone numbers that you can send SMS messages to.
     * </p>
     * 
     * @param phoneNumber
     *        The destination phone number to verify. On verification, Amazon SNS adds this phone number to the list of
     *        verified phone numbers that you can send SMS messages to.
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * The destination phone number to verify. On verification, Amazon SNS adds this phone number to the list of
     * verified phone numbers that you can send SMS messages to.
     * </p>
     * 
     * @return The destination phone number to verify. On verification, Amazon SNS adds this phone number to the list of
     *         verified phone numbers that you can send SMS messages to.
     */

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * <p>
     * The destination phone number to verify. On verification, Amazon SNS adds this phone number to the list of
     * verified phone numbers that you can send SMS messages to.
     * </p>
     * 
     * @param phoneNumber
     *        The destination phone number to verify. On verification, Amazon SNS adds this phone number to the list of
     *        verified phone numbers that you can send SMS messages to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSMSSandboxPhoneNumberRequest withPhoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * <p>
     * The language to use for sending the OTP. The default value is <code>en-US</code>.
     * </p>
     * 
     * @param languageCode
     *        The language to use for sending the OTP. The default value is <code>en-US</code>.
     * @see LanguageCodeString
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language to use for sending the OTP. The default value is <code>en-US</code>.
     * </p>
     * 
     * @return The language to use for sending the OTP. The default value is <code>en-US</code>.
     * @see LanguageCodeString
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language to use for sending the OTP. The default value is <code>en-US</code>.
     * </p>
     * 
     * @param languageCode
     *        The language to use for sending the OTP. The default value is <code>en-US</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCodeString
     */

    public CreateSMSSandboxPhoneNumberRequest withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language to use for sending the OTP. The default value is <code>en-US</code>.
     * </p>
     * 
     * @param languageCode
     *        The language to use for sending the OTP. The default value is <code>en-US</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCodeString
     */

    public CreateSMSSandboxPhoneNumberRequest withLanguageCode(LanguageCodeString languageCode) {
        this.languageCode = languageCode.toString();
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
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSMSSandboxPhoneNumberRequest == false)
            return false;
        CreateSMSSandboxPhoneNumberRequest other = (CreateSMSSandboxPhoneNumberRequest) obj;
        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        return hashCode;
    }

    @Override
    public CreateSMSSandboxPhoneNumberRequest clone() {
        return (CreateSMSSandboxPhoneNumberRequest) super.clone();
    }

}
