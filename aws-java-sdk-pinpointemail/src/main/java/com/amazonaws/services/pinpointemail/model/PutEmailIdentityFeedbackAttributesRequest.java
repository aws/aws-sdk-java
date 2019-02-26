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
 * A request to set the attributes that control how bounce and complaint events are processed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutEmailIdentityFeedbackAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutEmailIdentityFeedbackAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The email identity that you want to configure bounce and complaint feedback forwarding for.
     * </p>
     */
    private String emailIdentity;
    /**
     * <p>
     * Sets the feedback forwarding configuration for the identity.
     * </p>
     * <p>
     * If the value is <code>true</code>, Amazon Pinpoint sends you email notifications when bounce or complaint events
     * occur. Amazon Pinpoint sends this notification to the address that you specified in the Return-Path header of the
     * original email.
     * </p>
     * <p>
     * When you set this value to <code>false</code>, Amazon Pinpoint sends notifications through other mechanisms, such
     * as by notifying an Amazon SNS topic or another event destination. You're required to have a method of tracking
     * bounces and complaints. If you haven't set up another mechanism for receiving bounce or complaint notifications,
     * Amazon Pinpoint sends an email notification when these events occur (even if this setting is disabled).
     * </p>
     */
    private Boolean emailForwardingEnabled;

    /**
     * <p>
     * The email identity that you want to configure bounce and complaint feedback forwarding for.
     * </p>
     * 
     * @param emailIdentity
     *        The email identity that you want to configure bounce and complaint feedback forwarding for.
     */

    public void setEmailIdentity(String emailIdentity) {
        this.emailIdentity = emailIdentity;
    }

    /**
     * <p>
     * The email identity that you want to configure bounce and complaint feedback forwarding for.
     * </p>
     * 
     * @return The email identity that you want to configure bounce and complaint feedback forwarding for.
     */

    public String getEmailIdentity() {
        return this.emailIdentity;
    }

    /**
     * <p>
     * The email identity that you want to configure bounce and complaint feedback forwarding for.
     * </p>
     * 
     * @param emailIdentity
     *        The email identity that you want to configure bounce and complaint feedback forwarding for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEmailIdentityFeedbackAttributesRequest withEmailIdentity(String emailIdentity) {
        setEmailIdentity(emailIdentity);
        return this;
    }

    /**
     * <p>
     * Sets the feedback forwarding configuration for the identity.
     * </p>
     * <p>
     * If the value is <code>true</code>, Amazon Pinpoint sends you email notifications when bounce or complaint events
     * occur. Amazon Pinpoint sends this notification to the address that you specified in the Return-Path header of the
     * original email.
     * </p>
     * <p>
     * When you set this value to <code>false</code>, Amazon Pinpoint sends notifications through other mechanisms, such
     * as by notifying an Amazon SNS topic or another event destination. You're required to have a method of tracking
     * bounces and complaints. If you haven't set up another mechanism for receiving bounce or complaint notifications,
     * Amazon Pinpoint sends an email notification when these events occur (even if this setting is disabled).
     * </p>
     * 
     * @param emailForwardingEnabled
     *        Sets the feedback forwarding configuration for the identity.</p>
     *        <p>
     *        If the value is <code>true</code>, Amazon Pinpoint sends you email notifications when bounce or complaint
     *        events occur. Amazon Pinpoint sends this notification to the address that you specified in the Return-Path
     *        header of the original email.
     *        </p>
     *        <p>
     *        When you set this value to <code>false</code>, Amazon Pinpoint sends notifications through other
     *        mechanisms, such as by notifying an Amazon SNS topic or another event destination. You're required to have
     *        a method of tracking bounces and complaints. If you haven't set up another mechanism for receiving bounce
     *        or complaint notifications, Amazon Pinpoint sends an email notification when these events occur (even if
     *        this setting is disabled).
     */

    public void setEmailForwardingEnabled(Boolean emailForwardingEnabled) {
        this.emailForwardingEnabled = emailForwardingEnabled;
    }

    /**
     * <p>
     * Sets the feedback forwarding configuration for the identity.
     * </p>
     * <p>
     * If the value is <code>true</code>, Amazon Pinpoint sends you email notifications when bounce or complaint events
     * occur. Amazon Pinpoint sends this notification to the address that you specified in the Return-Path header of the
     * original email.
     * </p>
     * <p>
     * When you set this value to <code>false</code>, Amazon Pinpoint sends notifications through other mechanisms, such
     * as by notifying an Amazon SNS topic or another event destination. You're required to have a method of tracking
     * bounces and complaints. If you haven't set up another mechanism for receiving bounce or complaint notifications,
     * Amazon Pinpoint sends an email notification when these events occur (even if this setting is disabled).
     * </p>
     * 
     * @return Sets the feedback forwarding configuration for the identity.</p>
     *         <p>
     *         If the value is <code>true</code>, Amazon Pinpoint sends you email notifications when bounce or complaint
     *         events occur. Amazon Pinpoint sends this notification to the address that you specified in the
     *         Return-Path header of the original email.
     *         </p>
     *         <p>
     *         When you set this value to <code>false</code>, Amazon Pinpoint sends notifications through other
     *         mechanisms, such as by notifying an Amazon SNS topic or another event destination. You're required to
     *         have a method of tracking bounces and complaints. If you haven't set up another mechanism for receiving
     *         bounce or complaint notifications, Amazon Pinpoint sends an email notification when these events occur
     *         (even if this setting is disabled).
     */

    public Boolean getEmailForwardingEnabled() {
        return this.emailForwardingEnabled;
    }

    /**
     * <p>
     * Sets the feedback forwarding configuration for the identity.
     * </p>
     * <p>
     * If the value is <code>true</code>, Amazon Pinpoint sends you email notifications when bounce or complaint events
     * occur. Amazon Pinpoint sends this notification to the address that you specified in the Return-Path header of the
     * original email.
     * </p>
     * <p>
     * When you set this value to <code>false</code>, Amazon Pinpoint sends notifications through other mechanisms, such
     * as by notifying an Amazon SNS topic or another event destination. You're required to have a method of tracking
     * bounces and complaints. If you haven't set up another mechanism for receiving bounce or complaint notifications,
     * Amazon Pinpoint sends an email notification when these events occur (even if this setting is disabled).
     * </p>
     * 
     * @param emailForwardingEnabled
     *        Sets the feedback forwarding configuration for the identity.</p>
     *        <p>
     *        If the value is <code>true</code>, Amazon Pinpoint sends you email notifications when bounce or complaint
     *        events occur. Amazon Pinpoint sends this notification to the address that you specified in the Return-Path
     *        header of the original email.
     *        </p>
     *        <p>
     *        When you set this value to <code>false</code>, Amazon Pinpoint sends notifications through other
     *        mechanisms, such as by notifying an Amazon SNS topic or another event destination. You're required to have
     *        a method of tracking bounces and complaints. If you haven't set up another mechanism for receiving bounce
     *        or complaint notifications, Amazon Pinpoint sends an email notification when these events occur (even if
     *        this setting is disabled).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEmailIdentityFeedbackAttributesRequest withEmailForwardingEnabled(Boolean emailForwardingEnabled) {
        setEmailForwardingEnabled(emailForwardingEnabled);
        return this;
    }

    /**
     * <p>
     * Sets the feedback forwarding configuration for the identity.
     * </p>
     * <p>
     * If the value is <code>true</code>, Amazon Pinpoint sends you email notifications when bounce or complaint events
     * occur. Amazon Pinpoint sends this notification to the address that you specified in the Return-Path header of the
     * original email.
     * </p>
     * <p>
     * When you set this value to <code>false</code>, Amazon Pinpoint sends notifications through other mechanisms, such
     * as by notifying an Amazon SNS topic or another event destination. You're required to have a method of tracking
     * bounces and complaints. If you haven't set up another mechanism for receiving bounce or complaint notifications,
     * Amazon Pinpoint sends an email notification when these events occur (even if this setting is disabled).
     * </p>
     * 
     * @return Sets the feedback forwarding configuration for the identity.</p>
     *         <p>
     *         If the value is <code>true</code>, Amazon Pinpoint sends you email notifications when bounce or complaint
     *         events occur. Amazon Pinpoint sends this notification to the address that you specified in the
     *         Return-Path header of the original email.
     *         </p>
     *         <p>
     *         When you set this value to <code>false</code>, Amazon Pinpoint sends notifications through other
     *         mechanisms, such as by notifying an Amazon SNS topic or another event destination. You're required to
     *         have a method of tracking bounces and complaints. If you haven't set up another mechanism for receiving
     *         bounce or complaint notifications, Amazon Pinpoint sends an email notification when these events occur
     *         (even if this setting is disabled).
     */

    public Boolean isEmailForwardingEnabled() {
        return this.emailForwardingEnabled;
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
        if (getEmailForwardingEnabled() != null)
            sb.append("EmailForwardingEnabled: ").append(getEmailForwardingEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutEmailIdentityFeedbackAttributesRequest == false)
            return false;
        PutEmailIdentityFeedbackAttributesRequest other = (PutEmailIdentityFeedbackAttributesRequest) obj;
        if (other.getEmailIdentity() == null ^ this.getEmailIdentity() == null)
            return false;
        if (other.getEmailIdentity() != null && other.getEmailIdentity().equals(this.getEmailIdentity()) == false)
            return false;
        if (other.getEmailForwardingEnabled() == null ^ this.getEmailForwardingEnabled() == null)
            return false;
        if (other.getEmailForwardingEnabled() != null && other.getEmailForwardingEnabled().equals(this.getEmailForwardingEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEmailIdentity() == null) ? 0 : getEmailIdentity().hashCode());
        hashCode = prime * hashCode + ((getEmailForwardingEnabled() == null) ? 0 : getEmailForwardingEnabled().hashCode());
        return hashCode;
    }

    @Override
    public PutEmailIdentityFeedbackAttributesRequest clone() {
        return (PutEmailIdentityFeedbackAttributesRequest) super.clone();
    }

}
