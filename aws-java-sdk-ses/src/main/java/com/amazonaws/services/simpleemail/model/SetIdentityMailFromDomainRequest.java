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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to enable or disable the Amazon SES custom MAIL FROM domain setup for a verified identity. For
 * information about using a custom MAIL FROM domain, see the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from.html">Amazon SES Developer Guide</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/email-2010-12-01/SetIdentityMailFromDomain" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetIdentityMailFromDomainRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The verified identity for which you want to enable or disable the specified custom MAIL FROM domain.
     * </p>
     */
    private String identity;
    /**
     * <p>
     * The custom MAIL FROM domain that you want the verified identity to use. The MAIL FROM domain must 1) be a
     * subdomain of the verified identity, 2) not be used in a "From" address if the MAIL FROM domain is the destination
     * of email feedback forwarding (for more information, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from.html">Amazon SES Developer Guide</a>), and
     * 3) not be used to receive emails. A value of <code>null</code> disables the custom MAIL FROM setting for the
     * identity.
     * </p>
     */
    private String mailFromDomain;
    /**
     * <p>
     * The action that you want Amazon SES to take if it cannot successfully read the required MX record when you send
     * an email. If you choose <code>UseDefaultValue</code>, Amazon SES will use amazonses.com (or a subdomain of that)
     * as the MAIL FROM domain. If you choose <code>RejectMessage</code>, Amazon SES will return a
     * <code>MailFromDomainNotVerified</code> error and not send the email.
     * </p>
     * <p>
     * The action specified in <code>BehaviorOnMXFailure</code> is taken when the custom MAIL FROM domain setup is in
     * the <code>Pending</code>, <code>Failed</code>, and <code>TemporaryFailure</code> states.
     * </p>
     */
    private String behaviorOnMXFailure;

    /**
     * <p>
     * The verified identity for which you want to enable or disable the specified custom MAIL FROM domain.
     * </p>
     * 
     * @param identity
     *        The verified identity for which you want to enable or disable the specified custom MAIL FROM domain.
     */

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    /**
     * <p>
     * The verified identity for which you want to enable or disable the specified custom MAIL FROM domain.
     * </p>
     * 
     * @return The verified identity for which you want to enable or disable the specified custom MAIL FROM domain.
     */

    public String getIdentity() {
        return this.identity;
    }

    /**
     * <p>
     * The verified identity for which you want to enable or disable the specified custom MAIL FROM domain.
     * </p>
     * 
     * @param identity
     *        The verified identity for which you want to enable or disable the specified custom MAIL FROM domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetIdentityMailFromDomainRequest withIdentity(String identity) {
        setIdentity(identity);
        return this;
    }

    /**
     * <p>
     * The custom MAIL FROM domain that you want the verified identity to use. The MAIL FROM domain must 1) be a
     * subdomain of the verified identity, 2) not be used in a "From" address if the MAIL FROM domain is the destination
     * of email feedback forwarding (for more information, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from.html">Amazon SES Developer Guide</a>), and
     * 3) not be used to receive emails. A value of <code>null</code> disables the custom MAIL FROM setting for the
     * identity.
     * </p>
     * 
     * @param mailFromDomain
     *        The custom MAIL FROM domain that you want the verified identity to use. The MAIL FROM domain must 1) be a
     *        subdomain of the verified identity, 2) not be used in a "From" address if the MAIL FROM domain is the
     *        destination of email feedback forwarding (for more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from.html">Amazon SES Developer
     *        Guide</a>), and 3) not be used to receive emails. A value of <code>null</code> disables the custom MAIL
     *        FROM setting for the identity.
     */

    public void setMailFromDomain(String mailFromDomain) {
        this.mailFromDomain = mailFromDomain;
    }

    /**
     * <p>
     * The custom MAIL FROM domain that you want the verified identity to use. The MAIL FROM domain must 1) be a
     * subdomain of the verified identity, 2) not be used in a "From" address if the MAIL FROM domain is the destination
     * of email feedback forwarding (for more information, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from.html">Amazon SES Developer Guide</a>), and
     * 3) not be used to receive emails. A value of <code>null</code> disables the custom MAIL FROM setting for the
     * identity.
     * </p>
     * 
     * @return The custom MAIL FROM domain that you want the verified identity to use. The MAIL FROM domain must 1) be a
     *         subdomain of the verified identity, 2) not be used in a "From" address if the MAIL FROM domain is the
     *         destination of email feedback forwarding (for more information, see the <a
     *         href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from.html">Amazon SES Developer
     *         Guide</a>), and 3) not be used to receive emails. A value of <code>null</code> disables the custom MAIL
     *         FROM setting for the identity.
     */

    public String getMailFromDomain() {
        return this.mailFromDomain;
    }

    /**
     * <p>
     * The custom MAIL FROM domain that you want the verified identity to use. The MAIL FROM domain must 1) be a
     * subdomain of the verified identity, 2) not be used in a "From" address if the MAIL FROM domain is the destination
     * of email feedback forwarding (for more information, see the <a
     * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from.html">Amazon SES Developer Guide</a>), and
     * 3) not be used to receive emails. A value of <code>null</code> disables the custom MAIL FROM setting for the
     * identity.
     * </p>
     * 
     * @param mailFromDomain
     *        The custom MAIL FROM domain that you want the verified identity to use. The MAIL FROM domain must 1) be a
     *        subdomain of the verified identity, 2) not be used in a "From" address if the MAIL FROM domain is the
     *        destination of email feedback forwarding (for more information, see the <a
     *        href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/mail-from.html">Amazon SES Developer
     *        Guide</a>), and 3) not be used to receive emails. A value of <code>null</code> disables the custom MAIL
     *        FROM setting for the identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetIdentityMailFromDomainRequest withMailFromDomain(String mailFromDomain) {
        setMailFromDomain(mailFromDomain);
        return this;
    }

    /**
     * <p>
     * The action that you want Amazon SES to take if it cannot successfully read the required MX record when you send
     * an email. If you choose <code>UseDefaultValue</code>, Amazon SES will use amazonses.com (or a subdomain of that)
     * as the MAIL FROM domain. If you choose <code>RejectMessage</code>, Amazon SES will return a
     * <code>MailFromDomainNotVerified</code> error and not send the email.
     * </p>
     * <p>
     * The action specified in <code>BehaviorOnMXFailure</code> is taken when the custom MAIL FROM domain setup is in
     * the <code>Pending</code>, <code>Failed</code>, and <code>TemporaryFailure</code> states.
     * </p>
     * 
     * @param behaviorOnMXFailure
     *        The action that you want Amazon SES to take if it cannot successfully read the required MX record when you
     *        send an email. If you choose <code>UseDefaultValue</code>, Amazon SES will use amazonses.com (or a
     *        subdomain of that) as the MAIL FROM domain. If you choose <code>RejectMessage</code>, Amazon SES will
     *        return a <code>MailFromDomainNotVerified</code> error and not send the email.</p>
     *        <p>
     *        The action specified in <code>BehaviorOnMXFailure</code> is taken when the custom MAIL FROM domain setup
     *        is in the <code>Pending</code>, <code>Failed</code>, and <code>TemporaryFailure</code> states.
     * @see BehaviorOnMXFailure
     */

    public void setBehaviorOnMXFailure(String behaviorOnMXFailure) {
        this.behaviorOnMXFailure = behaviorOnMXFailure;
    }

    /**
     * <p>
     * The action that you want Amazon SES to take if it cannot successfully read the required MX record when you send
     * an email. If you choose <code>UseDefaultValue</code>, Amazon SES will use amazonses.com (or a subdomain of that)
     * as the MAIL FROM domain. If you choose <code>RejectMessage</code>, Amazon SES will return a
     * <code>MailFromDomainNotVerified</code> error and not send the email.
     * </p>
     * <p>
     * The action specified in <code>BehaviorOnMXFailure</code> is taken when the custom MAIL FROM domain setup is in
     * the <code>Pending</code>, <code>Failed</code>, and <code>TemporaryFailure</code> states.
     * </p>
     * 
     * @return The action that you want Amazon SES to take if it cannot successfully read the required MX record when
     *         you send an email. If you choose <code>UseDefaultValue</code>, Amazon SES will use amazonses.com (or a
     *         subdomain of that) as the MAIL FROM domain. If you choose <code>RejectMessage</code>, Amazon SES will
     *         return a <code>MailFromDomainNotVerified</code> error and not send the email.</p>
     *         <p>
     *         The action specified in <code>BehaviorOnMXFailure</code> is taken when the custom MAIL FROM domain setup
     *         is in the <code>Pending</code>, <code>Failed</code>, and <code>TemporaryFailure</code> states.
     * @see BehaviorOnMXFailure
     */

    public String getBehaviorOnMXFailure() {
        return this.behaviorOnMXFailure;
    }

    /**
     * <p>
     * The action that you want Amazon SES to take if it cannot successfully read the required MX record when you send
     * an email. If you choose <code>UseDefaultValue</code>, Amazon SES will use amazonses.com (or a subdomain of that)
     * as the MAIL FROM domain. If you choose <code>RejectMessage</code>, Amazon SES will return a
     * <code>MailFromDomainNotVerified</code> error and not send the email.
     * </p>
     * <p>
     * The action specified in <code>BehaviorOnMXFailure</code> is taken when the custom MAIL FROM domain setup is in
     * the <code>Pending</code>, <code>Failed</code>, and <code>TemporaryFailure</code> states.
     * </p>
     * 
     * @param behaviorOnMXFailure
     *        The action that you want Amazon SES to take if it cannot successfully read the required MX record when you
     *        send an email. If you choose <code>UseDefaultValue</code>, Amazon SES will use amazonses.com (or a
     *        subdomain of that) as the MAIL FROM domain. If you choose <code>RejectMessage</code>, Amazon SES will
     *        return a <code>MailFromDomainNotVerified</code> error and not send the email.</p>
     *        <p>
     *        The action specified in <code>BehaviorOnMXFailure</code> is taken when the custom MAIL FROM domain setup
     *        is in the <code>Pending</code>, <code>Failed</code>, and <code>TemporaryFailure</code> states.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BehaviorOnMXFailure
     */

    public SetIdentityMailFromDomainRequest withBehaviorOnMXFailure(String behaviorOnMXFailure) {
        setBehaviorOnMXFailure(behaviorOnMXFailure);
        return this;
    }

    /**
     * <p>
     * The action that you want Amazon SES to take if it cannot successfully read the required MX record when you send
     * an email. If you choose <code>UseDefaultValue</code>, Amazon SES will use amazonses.com (or a subdomain of that)
     * as the MAIL FROM domain. If you choose <code>RejectMessage</code>, Amazon SES will return a
     * <code>MailFromDomainNotVerified</code> error and not send the email.
     * </p>
     * <p>
     * The action specified in <code>BehaviorOnMXFailure</code> is taken when the custom MAIL FROM domain setup is in
     * the <code>Pending</code>, <code>Failed</code>, and <code>TemporaryFailure</code> states.
     * </p>
     * 
     * @param behaviorOnMXFailure
     *        The action that you want Amazon SES to take if it cannot successfully read the required MX record when you
     *        send an email. If you choose <code>UseDefaultValue</code>, Amazon SES will use amazonses.com (or a
     *        subdomain of that) as the MAIL FROM domain. If you choose <code>RejectMessage</code>, Amazon SES will
     *        return a <code>MailFromDomainNotVerified</code> error and not send the email.</p>
     *        <p>
     *        The action specified in <code>BehaviorOnMXFailure</code> is taken when the custom MAIL FROM domain setup
     *        is in the <code>Pending</code>, <code>Failed</code>, and <code>TemporaryFailure</code> states.
     * @see BehaviorOnMXFailure
     */

    public void setBehaviorOnMXFailure(BehaviorOnMXFailure behaviorOnMXFailure) {
        withBehaviorOnMXFailure(behaviorOnMXFailure);
    }

    /**
     * <p>
     * The action that you want Amazon SES to take if it cannot successfully read the required MX record when you send
     * an email. If you choose <code>UseDefaultValue</code>, Amazon SES will use amazonses.com (or a subdomain of that)
     * as the MAIL FROM domain. If you choose <code>RejectMessage</code>, Amazon SES will return a
     * <code>MailFromDomainNotVerified</code> error and not send the email.
     * </p>
     * <p>
     * The action specified in <code>BehaviorOnMXFailure</code> is taken when the custom MAIL FROM domain setup is in
     * the <code>Pending</code>, <code>Failed</code>, and <code>TemporaryFailure</code> states.
     * </p>
     * 
     * @param behaviorOnMXFailure
     *        The action that you want Amazon SES to take if it cannot successfully read the required MX record when you
     *        send an email. If you choose <code>UseDefaultValue</code>, Amazon SES will use amazonses.com (or a
     *        subdomain of that) as the MAIL FROM domain. If you choose <code>RejectMessage</code>, Amazon SES will
     *        return a <code>MailFromDomainNotVerified</code> error and not send the email.</p>
     *        <p>
     *        The action specified in <code>BehaviorOnMXFailure</code> is taken when the custom MAIL FROM domain setup
     *        is in the <code>Pending</code>, <code>Failed</code>, and <code>TemporaryFailure</code> states.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BehaviorOnMXFailure
     */

    public SetIdentityMailFromDomainRequest withBehaviorOnMXFailure(BehaviorOnMXFailure behaviorOnMXFailure) {
        this.behaviorOnMXFailure = behaviorOnMXFailure.toString();
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
        if (getIdentity() != null)
            sb.append("Identity: ").append(getIdentity()).append(",");
        if (getMailFromDomain() != null)
            sb.append("MailFromDomain: ").append(getMailFromDomain()).append(",");
        if (getBehaviorOnMXFailure() != null)
            sb.append("BehaviorOnMXFailure: ").append(getBehaviorOnMXFailure());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetIdentityMailFromDomainRequest == false)
            return false;
        SetIdentityMailFromDomainRequest other = (SetIdentityMailFromDomainRequest) obj;
        if (other.getIdentity() == null ^ this.getIdentity() == null)
            return false;
        if (other.getIdentity() != null && other.getIdentity().equals(this.getIdentity()) == false)
            return false;
        if (other.getMailFromDomain() == null ^ this.getMailFromDomain() == null)
            return false;
        if (other.getMailFromDomain() != null && other.getMailFromDomain().equals(this.getMailFromDomain()) == false)
            return false;
        if (other.getBehaviorOnMXFailure() == null ^ this.getBehaviorOnMXFailure() == null)
            return false;
        if (other.getBehaviorOnMXFailure() != null && other.getBehaviorOnMXFailure().equals(this.getBehaviorOnMXFailure()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentity() == null) ? 0 : getIdentity().hashCode());
        hashCode = prime * hashCode + ((getMailFromDomain() == null) ? 0 : getMailFromDomain().hashCode());
        hashCode = prime * hashCode + ((getBehaviorOnMXFailure() == null) ? 0 : getBehaviorOnMXFailure().hashCode());
        return hashCode;
    }

    @Override
    public SetIdentityMailFromDomainRequest clone() {
        return (SetIdentityMailFromDomainRequest) super.clone();
    }

}
