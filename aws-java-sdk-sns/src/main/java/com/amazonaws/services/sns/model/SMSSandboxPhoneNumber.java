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

/**
 * <p>
 * A verified or pending destination phone number in the SMS sandbox.
 * </p>
 * <p>
 * When you start using Amazon SNS to send SMS messages, your account is in the <i>SMS sandbox</i>. The SMS sandbox
 * provides a safe environment for you to try Amazon SNS features without risking your reputation as an SMS sender.
 * While your account is in the SMS sandbox, you can use all of the features of Amazon SNS. However, you can send SMS
 * messages only to verified destination phone numbers. For more information, including how to move out of the sandbox
 * to send messages without restrictions, see <a
 * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">SMS sandbox</a> in the <i>Amazon SNS Developer
 * Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/SMSSandboxPhoneNumber" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SMSSandboxPhoneNumber implements Serializable, Cloneable {

    /**
     * <p>
     * The destination phone number.
     * </p>
     */
    private String phoneNumber;
    /**
     * <p>
     * The destination phone number's verification status.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The destination phone number.
     * </p>
     * 
     * @param phoneNumber
     *        The destination phone number.
     */

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * <p>
     * The destination phone number.
     * </p>
     * 
     * @return The destination phone number.
     */

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * <p>
     * The destination phone number.
     * </p>
     * 
     * @param phoneNumber
     *        The destination phone number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSSandboxPhoneNumber withPhoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * <p>
     * The destination phone number's verification status.
     * </p>
     * 
     * @param status
     *        The destination phone number's verification status.
     * @see SMSSandboxPhoneNumberVerificationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The destination phone number's verification status.
     * </p>
     * 
     * @return The destination phone number's verification status.
     * @see SMSSandboxPhoneNumberVerificationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The destination phone number's verification status.
     * </p>
     * 
     * @param status
     *        The destination phone number's verification status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SMSSandboxPhoneNumberVerificationStatus
     */

    public SMSSandboxPhoneNumber withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The destination phone number's verification status.
     * </p>
     * 
     * @param status
     *        The destination phone number's verification status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SMSSandboxPhoneNumberVerificationStatus
     */

    public SMSSandboxPhoneNumber withStatus(SMSSandboxPhoneNumberVerificationStatus status) {
        this.status = status.toString();
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SMSSandboxPhoneNumber == false)
            return false;
        SMSSandboxPhoneNumber other = (SMSSandboxPhoneNumber) obj;
        if (other.getPhoneNumber() == null ^ this.getPhoneNumber() == null)
            return false;
        if (other.getPhoneNumber() != null && other.getPhoneNumber().equals(this.getPhoneNumber()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public SMSSandboxPhoneNumber clone() {
        try {
            return (SMSSandboxPhoneNumber) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
