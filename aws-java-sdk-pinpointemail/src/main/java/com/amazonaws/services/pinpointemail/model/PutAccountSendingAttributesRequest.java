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
package com.amazonaws.services.pinpointemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to change the ability of your account to send email.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutAccountSendingAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutAccountSendingAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Enables or disables your account's ability to send email. Set to <code>true</code> to enable email sending, or
     * set to <code>false</code> to disable email sending.
     * </p>
     * <note>
     * <p>
     * If AWS paused your account's ability to send email, you can't use this operation to resume your account's ability
     * to send email.
     * </p>
     * </note>
     */
    private Boolean sendingEnabled;

    /**
     * <p>
     * Enables or disables your account's ability to send email. Set to <code>true</code> to enable email sending, or
     * set to <code>false</code> to disable email sending.
     * </p>
     * <note>
     * <p>
     * If AWS paused your account's ability to send email, you can't use this operation to resume your account's ability
     * to send email.
     * </p>
     * </note>
     * 
     * @param sendingEnabled
     *        Enables or disables your account's ability to send email. Set to <code>true</code> to enable email
     *        sending, or set to <code>false</code> to disable email sending.</p> <note>
     *        <p>
     *        If AWS paused your account's ability to send email, you can't use this operation to resume your account's
     *        ability to send email.
     *        </p>
     */

    public void setSendingEnabled(Boolean sendingEnabled) {
        this.sendingEnabled = sendingEnabled;
    }

    /**
     * <p>
     * Enables or disables your account's ability to send email. Set to <code>true</code> to enable email sending, or
     * set to <code>false</code> to disable email sending.
     * </p>
     * <note>
     * <p>
     * If AWS paused your account's ability to send email, you can't use this operation to resume your account's ability
     * to send email.
     * </p>
     * </note>
     * 
     * @return Enables or disables your account's ability to send email. Set to <code>true</code> to enable email
     *         sending, or set to <code>false</code> to disable email sending.</p> <note>
     *         <p>
     *         If AWS paused your account's ability to send email, you can't use this operation to resume your account's
     *         ability to send email.
     *         </p>
     */

    public Boolean getSendingEnabled() {
        return this.sendingEnabled;
    }

    /**
     * <p>
     * Enables or disables your account's ability to send email. Set to <code>true</code> to enable email sending, or
     * set to <code>false</code> to disable email sending.
     * </p>
     * <note>
     * <p>
     * If AWS paused your account's ability to send email, you can't use this operation to resume your account's ability
     * to send email.
     * </p>
     * </note>
     * 
     * @param sendingEnabled
     *        Enables or disables your account's ability to send email. Set to <code>true</code> to enable email
     *        sending, or set to <code>false</code> to disable email sending.</p> <note>
     *        <p>
     *        If AWS paused your account's ability to send email, you can't use this operation to resume your account's
     *        ability to send email.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAccountSendingAttributesRequest withSendingEnabled(Boolean sendingEnabled) {
        setSendingEnabled(sendingEnabled);
        return this;
    }

    /**
     * <p>
     * Enables or disables your account's ability to send email. Set to <code>true</code> to enable email sending, or
     * set to <code>false</code> to disable email sending.
     * </p>
     * <note>
     * <p>
     * If AWS paused your account's ability to send email, you can't use this operation to resume your account's ability
     * to send email.
     * </p>
     * </note>
     * 
     * @return Enables or disables your account's ability to send email. Set to <code>true</code> to enable email
     *         sending, or set to <code>false</code> to disable email sending.</p> <note>
     *         <p>
     *         If AWS paused your account's ability to send email, you can't use this operation to resume your account's
     *         ability to send email.
     *         </p>
     */

    public Boolean isSendingEnabled() {
        return this.sendingEnabled;
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
        if (getSendingEnabled() != null)
            sb.append("SendingEnabled: ").append(getSendingEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutAccountSendingAttributesRequest == false)
            return false;
        PutAccountSendingAttributesRequest other = (PutAccountSendingAttributesRequest) obj;
        if (other.getSendingEnabled() == null ^ this.getSendingEnabled() == null)
            return false;
        if (other.getSendingEnabled() != null && other.getSendingEnabled().equals(this.getSendingEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSendingEnabled() == null) ? 0 : getSendingEnabled().hashCode());
        return hashCode;
    }

    @Override
    public PutAccountSendingAttributesRequest clone() {
        return (PutAccountSendingAttributesRequest) super.clone();
    }

}
