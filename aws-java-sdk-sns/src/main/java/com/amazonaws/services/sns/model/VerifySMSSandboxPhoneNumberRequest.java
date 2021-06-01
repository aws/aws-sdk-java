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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/VerifySMSSandboxPhoneNumber" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VerifySMSSandboxPhoneNumberRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The destination phone number to verify.
     * </p>
     */
    private String phoneNumber;
    /**
     * <p>
     * The OTP sent to the destination number from the <code>CreateSMSSandBoxPhoneNumber</code> call.
     * </p>
     */
    private String oneTimePassword;

    /**
     * <p>
     * The destination phone number to verify.
     * </p>
     * 
     * @param phoneNumber
     *        The destination phone number to verify.
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * The destination phone number to verify.
     * </p>
     * 
     * @return The destination phone number to verify.
     */

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * <p>
     * The destination phone number to verify.
     * </p>
     * 
     * @param phoneNumber
     *        The destination phone number to verify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifySMSSandboxPhoneNumberRequest withPhoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * <p>
     * The OTP sent to the destination number from the <code>CreateSMSSandBoxPhoneNumber</code> call.
     * </p>
     * 
     * @param oneTimePassword
     *        The OTP sent to the destination number from the <code>CreateSMSSandBoxPhoneNumber</code> call.
     */

    public void setOneTimePassword(String oneTimePassword) {
        this.oneTimePassword = oneTimePassword;
    }

    /**
     * <p>
     * The OTP sent to the destination number from the <code>CreateSMSSandBoxPhoneNumber</code> call.
     * </p>
     * 
     * @return The OTP sent to the destination number from the <code>CreateSMSSandBoxPhoneNumber</code> call.
     */

    public String getOneTimePassword() {
        return this.oneTimePassword;
    }

    /**
     * <p>
     * The OTP sent to the destination number from the <code>CreateSMSSandBoxPhoneNumber</code> call.
     * </p>
     * 
     * @param oneTimePassword
     *        The OTP sent to the destination number from the <code>CreateSMSSandBoxPhoneNumber</code> call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifySMSSandboxPhoneNumberRequest withOneTimePassword(String oneTimePassword) {
        setOneTimePassword(oneTimePassword);
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
        if (getOneTimePassword() != null)
            sb.append("OneTimePassword: ").append(getOneTimePassword());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VerifySMSSandboxPhoneNumberRequest == false)
            return false;
        VerifySMSSandboxPhoneNumberRequest other = (VerifySMSSandboxPhoneNumberRequest) obj;
        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        if (other.getOneTimePassword() == null ^ this.getOneTimePassword() == null)
            return false;
        if (other.getOneTimePassword() != null && other.getOneTimePassword().equals(this.getOneTimePassword()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getOneTimePassword() == null) ? 0 : getOneTimePassword().hashCode());
        return hashCode;
    }

    @Override
    public VerifySMSSandboxPhoneNumberRequest clone() {
        return (VerifySMSSandboxPhoneNumberRequest) super.clone();
    }

}
