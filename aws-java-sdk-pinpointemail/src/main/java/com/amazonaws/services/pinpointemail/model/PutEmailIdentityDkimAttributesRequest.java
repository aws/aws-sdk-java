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
 * A request to enable or disable DKIM signing of email that you send from an email identity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutEmailIdentityDkimAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutEmailIdentityDkimAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The email identity that you want to change the DKIM settings for.
     * </p>
     */
    private String emailIdentity;
    /**
     * <p>
     * Sets the DKIM signing configuration for the identity.
     * </p>
     * <p>
     * When you set this value <code>true</code>, then the messages that Amazon Pinpoint sends from the identity are
     * DKIM-signed. When you set this value to <code>false</code>, then the messages that Amazon Pinpoint sends from the
     * identity aren't DKIM-signed.
     * </p>
     */
    private Boolean signingEnabled;

    /**
     * <p>
     * The email identity that you want to change the DKIM settings for.
     * </p>
     * 
     * @param emailIdentity
     *        The email identity that you want to change the DKIM settings for.
     */

    public void setEmailIdentity(String emailIdentity) {
        this.emailIdentity = emailIdentity;
    }

    /**
     * <p>
     * The email identity that you want to change the DKIM settings for.
     * </p>
     * 
     * @return The email identity that you want to change the DKIM settings for.
     */

    public String getEmailIdentity() {
        return this.emailIdentity;
    }

    /**
     * <p>
     * The email identity that you want to change the DKIM settings for.
     * </p>
     * 
     * @param emailIdentity
     *        The email identity that you want to change the DKIM settings for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEmailIdentityDkimAttributesRequest withEmailIdentity(String emailIdentity) {
        setEmailIdentity(emailIdentity);
        return this;
    }

    /**
     * <p>
     * Sets the DKIM signing configuration for the identity.
     * </p>
     * <p>
     * When you set this value <code>true</code>, then the messages that Amazon Pinpoint sends from the identity are
     * DKIM-signed. When you set this value to <code>false</code>, then the messages that Amazon Pinpoint sends from the
     * identity aren't DKIM-signed.
     * </p>
     * 
     * @param signingEnabled
     *        Sets the DKIM signing configuration for the identity.</p>
     *        <p>
     *        When you set this value <code>true</code>, then the messages that Amazon Pinpoint sends from the identity
     *        are DKIM-signed. When you set this value to <code>false</code>, then the messages that Amazon Pinpoint
     *        sends from the identity aren't DKIM-signed.
     */

    public void setSigningEnabled(Boolean signingEnabled) {
        this.signingEnabled = signingEnabled;
    }

    /**
     * <p>
     * Sets the DKIM signing configuration for the identity.
     * </p>
     * <p>
     * When you set this value <code>true</code>, then the messages that Amazon Pinpoint sends from the identity are
     * DKIM-signed. When you set this value to <code>false</code>, then the messages that Amazon Pinpoint sends from the
     * identity aren't DKIM-signed.
     * </p>
     * 
     * @return Sets the DKIM signing configuration for the identity.</p>
     *         <p>
     *         When you set this value <code>true</code>, then the messages that Amazon Pinpoint sends from the identity
     *         are DKIM-signed. When you set this value to <code>false</code>, then the messages that Amazon Pinpoint
     *         sends from the identity aren't DKIM-signed.
     */

    public Boolean getSigningEnabled() {
        return this.signingEnabled;
    }

    /**
     * <p>
     * Sets the DKIM signing configuration for the identity.
     * </p>
     * <p>
     * When you set this value <code>true</code>, then the messages that Amazon Pinpoint sends from the identity are
     * DKIM-signed. When you set this value to <code>false</code>, then the messages that Amazon Pinpoint sends from the
     * identity aren't DKIM-signed.
     * </p>
     * 
     * @param signingEnabled
     *        Sets the DKIM signing configuration for the identity.</p>
     *        <p>
     *        When you set this value <code>true</code>, then the messages that Amazon Pinpoint sends from the identity
     *        are DKIM-signed. When you set this value to <code>false</code>, then the messages that Amazon Pinpoint
     *        sends from the identity aren't DKIM-signed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEmailIdentityDkimAttributesRequest withSigningEnabled(Boolean signingEnabled) {
        setSigningEnabled(signingEnabled);
        return this;
    }

    /**
     * <p>
     * Sets the DKIM signing configuration for the identity.
     * </p>
     * <p>
     * When you set this value <code>true</code>, then the messages that Amazon Pinpoint sends from the identity are
     * DKIM-signed. When you set this value to <code>false</code>, then the messages that Amazon Pinpoint sends from the
     * identity aren't DKIM-signed.
     * </p>
     * 
     * @return Sets the DKIM signing configuration for the identity.</p>
     *         <p>
     *         When you set this value <code>true</code>, then the messages that Amazon Pinpoint sends from the identity
     *         are DKIM-signed. When you set this value to <code>false</code>, then the messages that Amazon Pinpoint
     *         sends from the identity aren't DKIM-signed.
     */

    public Boolean isSigningEnabled() {
        return this.signingEnabled;
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
        if (getEmailIdentity() != null)
            sb.append("EmailIdentity: ").append(getEmailIdentity()).append(",");
        if (getSigningEnabled() != null)
            sb.append("SigningEnabled: ").append(getSigningEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutEmailIdentityDkimAttributesRequest == false)
            return false;
        PutEmailIdentityDkimAttributesRequest other = (PutEmailIdentityDkimAttributesRequest) obj;
        if (other.getEmailIdentity() == null ^ this.getEmailIdentity() == null)
            return false;
        if (other.getEmailIdentity() != null && other.getEmailIdentity().equals(this.getEmailIdentity()) == false)
            return false;
        if (other.getSigningEnabled() == null ^ this.getSigningEnabled() == null)
            return false;
        if (other.getSigningEnabled() != null && other.getSigningEnabled().equals(this.getSigningEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEmailIdentity() == null) ? 0 : getEmailIdentity().hashCode());
        hashCode = prime * hashCode + ((getSigningEnabled() == null) ? 0 : getSigningEnabled().hashCode());
        return hashCode;
    }

    @Override
    public PutEmailIdentityDkimAttributesRequest clone() {
        return (PutEmailIdentityDkimAttributesRequest) super.clone();
    }

}
