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
 * A request to configure the custom MAIL FROM domain for a verified identity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/PutEmailIdentityMailFromAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutEmailIdentityMailFromAttributesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The verified email identity that you want to set up the custom MAIL FROM domain for.
     * </p>
     */
    private String emailIdentity;
    /**
     * <p>
     * The custom MAIL FROM domain that you want the verified identity to use. The MAIL FROM domain must meet the
     * following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It has to be a subdomain of the verified identity.
     * </p>
     * </li>
     * <li>
     * <p>
     * It can't be used to receive email.
     * </p>
     * </li>
     * <li>
     * <p>
     * It can't be used in a "From" address if the MAIL FROM domain is a destination for feedback forwarding emails.
     * </p>
     * </li>
     * </ul>
     */
    private String mailFromDomain;
    /**
     * <p>
     * The action that you want Amazon Pinpoint to take if it can't read the required MX record when you send an email.
     * When you set this value to <code>UseDefaultValue</code>, Amazon Pinpoint uses <i>amazonses.com</i> as the MAIL
     * FROM domain. When you set this value to <code>RejectMessage</code>, Amazon Pinpoint returns a
     * <code>MailFromDomainNotVerified</code> error, and doesn't attempt to deliver the email.
     * </p>
     * <p>
     * These behaviors are taken when the custom MAIL FROM domain configuration is in the <code>Pending</code>,
     * <code>Failed</code>, and <code>TemporaryFailure</code> states.
     * </p>
     */
    private String behaviorOnMxFailure;

    /**
     * <p>
     * The verified email identity that you want to set up the custom MAIL FROM domain for.
     * </p>
     * 
     * @param emailIdentity
     *        The verified email identity that you want to set up the custom MAIL FROM domain for.
     */

    public void setEmailIdentity(String emailIdentity) {
        this.emailIdentity = emailIdentity;
    }

    /**
     * <p>
     * The verified email identity that you want to set up the custom MAIL FROM domain for.
     * </p>
     * 
     * @return The verified email identity that you want to set up the custom MAIL FROM domain for.
     */

    public String getEmailIdentity() {
        return this.emailIdentity;
    }

    /**
     * <p>
     * The verified email identity that you want to set up the custom MAIL FROM domain for.
     * </p>
     * 
     * @param emailIdentity
     *        The verified email identity that you want to set up the custom MAIL FROM domain for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEmailIdentityMailFromAttributesRequest withEmailIdentity(String emailIdentity) {
        setEmailIdentity(emailIdentity);
        return this;
    }

    /**
     * <p>
     * The custom MAIL FROM domain that you want the verified identity to use. The MAIL FROM domain must meet the
     * following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It has to be a subdomain of the verified identity.
     * </p>
     * </li>
     * <li>
     * <p>
     * It can't be used to receive email.
     * </p>
     * </li>
     * <li>
     * <p>
     * It can't be used in a "From" address if the MAIL FROM domain is a destination for feedback forwarding emails.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mailFromDomain
     *        The custom MAIL FROM domain that you want the verified identity to use. The MAIL FROM domain must meet the
     *        following criteria:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        It has to be a subdomain of the verified identity.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        It can't be used to receive email.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        It can't be used in a "From" address if the MAIL FROM domain is a destination for feedback forwarding
     *        emails.
     *        </p>
     *        </li>
     */

    public void setMailFromDomain(String mailFromDomain) {
        this.mailFromDomain = mailFromDomain;
    }

    /**
     * <p>
     * The custom MAIL FROM domain that you want the verified identity to use. The MAIL FROM domain must meet the
     * following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It has to be a subdomain of the verified identity.
     * </p>
     * </li>
     * <li>
     * <p>
     * It can't be used to receive email.
     * </p>
     * </li>
     * <li>
     * <p>
     * It can't be used in a "From" address if the MAIL FROM domain is a destination for feedback forwarding emails.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The custom MAIL FROM domain that you want the verified identity to use. The MAIL FROM domain must meet
     *         the following criteria:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         It has to be a subdomain of the verified identity.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         It can't be used to receive email.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         It can't be used in a "From" address if the MAIL FROM domain is a destination for feedback forwarding
     *         emails.
     *         </p>
     *         </li>
     */

    public String getMailFromDomain() {
        return this.mailFromDomain;
    }

    /**
     * <p>
     * The custom MAIL FROM domain that you want the verified identity to use. The MAIL FROM domain must meet the
     * following criteria:
     * </p>
     * <ul>
     * <li>
     * <p>
     * It has to be a subdomain of the verified identity.
     * </p>
     * </li>
     * <li>
     * <p>
     * It can't be used to receive email.
     * </p>
     * </li>
     * <li>
     * <p>
     * It can't be used in a "From" address if the MAIL FROM domain is a destination for feedback forwarding emails.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mailFromDomain
     *        The custom MAIL FROM domain that you want the verified identity to use. The MAIL FROM domain must meet the
     *        following criteria:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        It has to be a subdomain of the verified identity.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        It can't be used to receive email.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        It can't be used in a "From" address if the MAIL FROM domain is a destination for feedback forwarding
     *        emails.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEmailIdentityMailFromAttributesRequest withMailFromDomain(String mailFromDomain) {
        setMailFromDomain(mailFromDomain);
        return this;
    }

    /**
     * <p>
     * The action that you want Amazon Pinpoint to take if it can't read the required MX record when you send an email.
     * When you set this value to <code>UseDefaultValue</code>, Amazon Pinpoint uses <i>amazonses.com</i> as the MAIL
     * FROM domain. When you set this value to <code>RejectMessage</code>, Amazon Pinpoint returns a
     * <code>MailFromDomainNotVerified</code> error, and doesn't attempt to deliver the email.
     * </p>
     * <p>
     * These behaviors are taken when the custom MAIL FROM domain configuration is in the <code>Pending</code>,
     * <code>Failed</code>, and <code>TemporaryFailure</code> states.
     * </p>
     * 
     * @param behaviorOnMxFailure
     *        The action that you want Amazon Pinpoint to take if it can't read the required MX record when you send an
     *        email. When you set this value to <code>UseDefaultValue</code>, Amazon Pinpoint uses <i>amazonses.com</i>
     *        as the MAIL FROM domain. When you set this value to <code>RejectMessage</code>, Amazon Pinpoint returns a
     *        <code>MailFromDomainNotVerified</code> error, and doesn't attempt to deliver the email.</p>
     *        <p>
     *        These behaviors are taken when the custom MAIL FROM domain configuration is in the <code>Pending</code>,
     *        <code>Failed</code>, and <code>TemporaryFailure</code> states.
     * @see BehaviorOnMxFailure
     */

    public void setBehaviorOnMxFailure(String behaviorOnMxFailure) {
        this.behaviorOnMxFailure = behaviorOnMxFailure;
    }

    /**
     * <p>
     * The action that you want Amazon Pinpoint to take if it can't read the required MX record when you send an email.
     * When you set this value to <code>UseDefaultValue</code>, Amazon Pinpoint uses <i>amazonses.com</i> as the MAIL
     * FROM domain. When you set this value to <code>RejectMessage</code>, Amazon Pinpoint returns a
     * <code>MailFromDomainNotVerified</code> error, and doesn't attempt to deliver the email.
     * </p>
     * <p>
     * These behaviors are taken when the custom MAIL FROM domain configuration is in the <code>Pending</code>,
     * <code>Failed</code>, and <code>TemporaryFailure</code> states.
     * </p>
     * 
     * @return The action that you want Amazon Pinpoint to take if it can't read the required MX record when you send an
     *         email. When you set this value to <code>UseDefaultValue</code>, Amazon Pinpoint uses <i>amazonses.com</i>
     *         as the MAIL FROM domain. When you set this value to <code>RejectMessage</code>, Amazon Pinpoint returns a
     *         <code>MailFromDomainNotVerified</code> error, and doesn't attempt to deliver the email.</p>
     *         <p>
     *         These behaviors are taken when the custom MAIL FROM domain configuration is in the <code>Pending</code>,
     *         <code>Failed</code>, and <code>TemporaryFailure</code> states.
     * @see BehaviorOnMxFailure
     */

    public String getBehaviorOnMxFailure() {
        return this.behaviorOnMxFailure;
    }

    /**
     * <p>
     * The action that you want Amazon Pinpoint to take if it can't read the required MX record when you send an email.
     * When you set this value to <code>UseDefaultValue</code>, Amazon Pinpoint uses <i>amazonses.com</i> as the MAIL
     * FROM domain. When you set this value to <code>RejectMessage</code>, Amazon Pinpoint returns a
     * <code>MailFromDomainNotVerified</code> error, and doesn't attempt to deliver the email.
     * </p>
     * <p>
     * These behaviors are taken when the custom MAIL FROM domain configuration is in the <code>Pending</code>,
     * <code>Failed</code>, and <code>TemporaryFailure</code> states.
     * </p>
     * 
     * @param behaviorOnMxFailure
     *        The action that you want Amazon Pinpoint to take if it can't read the required MX record when you send an
     *        email. When you set this value to <code>UseDefaultValue</code>, Amazon Pinpoint uses <i>amazonses.com</i>
     *        as the MAIL FROM domain. When you set this value to <code>RejectMessage</code>, Amazon Pinpoint returns a
     *        <code>MailFromDomainNotVerified</code> error, and doesn't attempt to deliver the email.</p>
     *        <p>
     *        These behaviors are taken when the custom MAIL FROM domain configuration is in the <code>Pending</code>,
     *        <code>Failed</code>, and <code>TemporaryFailure</code> states.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BehaviorOnMxFailure
     */

    public PutEmailIdentityMailFromAttributesRequest withBehaviorOnMxFailure(String behaviorOnMxFailure) {
        setBehaviorOnMxFailure(behaviorOnMxFailure);
        return this;
    }

    /**
     * <p>
     * The action that you want Amazon Pinpoint to take if it can't read the required MX record when you send an email.
     * When you set this value to <code>UseDefaultValue</code>, Amazon Pinpoint uses <i>amazonses.com</i> as the MAIL
     * FROM domain. When you set this value to <code>RejectMessage</code>, Amazon Pinpoint returns a
     * <code>MailFromDomainNotVerified</code> error, and doesn't attempt to deliver the email.
     * </p>
     * <p>
     * These behaviors are taken when the custom MAIL FROM domain configuration is in the <code>Pending</code>,
     * <code>Failed</code>, and <code>TemporaryFailure</code> states.
     * </p>
     * 
     * @param behaviorOnMxFailure
     *        The action that you want Amazon Pinpoint to take if it can't read the required MX record when you send an
     *        email. When you set this value to <code>UseDefaultValue</code>, Amazon Pinpoint uses <i>amazonses.com</i>
     *        as the MAIL FROM domain. When you set this value to <code>RejectMessage</code>, Amazon Pinpoint returns a
     *        <code>MailFromDomainNotVerified</code> error, and doesn't attempt to deliver the email.</p>
     *        <p>
     *        These behaviors are taken when the custom MAIL FROM domain configuration is in the <code>Pending</code>,
     *        <code>Failed</code>, and <code>TemporaryFailure</code> states.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BehaviorOnMxFailure
     */

    public PutEmailIdentityMailFromAttributesRequest withBehaviorOnMxFailure(BehaviorOnMxFailure behaviorOnMxFailure) {
        this.behaviorOnMxFailure = behaviorOnMxFailure.toString();
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
        if (getEmailIdentity() != null)
            sb.append("EmailIdentity: ").append(getEmailIdentity()).append(",");
        if (getMailFromDomain() != null)
            sb.append("MailFromDomain: ").append(getMailFromDomain()).append(",");
        if (getBehaviorOnMxFailure() != null)
            sb.append("BehaviorOnMxFailure: ").append(getBehaviorOnMxFailure());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutEmailIdentityMailFromAttributesRequest == false)
            return false;
        PutEmailIdentityMailFromAttributesRequest other = (PutEmailIdentityMailFromAttributesRequest) obj;
        if (other.getEmailIdentity() == null ^ this.getEmailIdentity() == null)
            return false;
        if (other.getEmailIdentity() != null && other.getEmailIdentity().equals(this.getEmailIdentity()) == false)
            return false;
        if (other.getMailFromDomain() == null ^ this.getMailFromDomain() == null)
            return false;
        if (other.getMailFromDomain() != null && other.getMailFromDomain().equals(this.getMailFromDomain()) == false)
            return false;
        if (other.getBehaviorOnMxFailure() == null ^ this.getBehaviorOnMxFailure() == null)
            return false;
        if (other.getBehaviorOnMxFailure() != null && other.getBehaviorOnMxFailure().equals(this.getBehaviorOnMxFailure()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEmailIdentity() == null) ? 0 : getEmailIdentity().hashCode());
        hashCode = prime * hashCode + ((getMailFromDomain() == null) ? 0 : getMailFromDomain().hashCode());
        hashCode = prime * hashCode + ((getBehaviorOnMxFailure() == null) ? 0 : getBehaviorOnMxFailure().hashCode());
        return hashCode;
    }

    @Override
    public PutEmailIdentityMailFromAttributesRequest clone() {
        return (PutEmailIdentityMailFromAttributesRequest) super.clone();
    }

}
