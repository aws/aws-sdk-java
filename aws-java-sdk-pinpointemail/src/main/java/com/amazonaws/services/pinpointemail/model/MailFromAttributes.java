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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of attributes that are associated with a MAIL FROM domain.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-email-2018-07-26/MailFromAttributes" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MailFromAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a domain that an email identity uses as a custom MAIL FROM domain.
     * </p>
     */
    private String mailFromDomain;
    /**
     * <p>
     * The status of the MAIL FROM domain. This status can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> – Amazon Pinpoint hasn't started searching for the MX record yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code> – Amazon Pinpoint detected the required MX record for the MAIL FROM domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> – Amazon Pinpoint can't find the required MX record, or the record no longer exists.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEMPORARY_FAILURE</code> – A temporary issue occurred, which prevented Amazon Pinpoint from determining the
     * status of the MAIL FROM domain.
     * </p>
     * </li>
     * </ul>
     */
    private String mailFromDomainStatus;
    /**
     * <p>
     * The action that Amazon Pinpoint to takes if it can't read the required MX record for a custom MAIL FROM domain.
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
     * The name of a domain that an email identity uses as a custom MAIL FROM domain.
     * </p>
     * 
     * @param mailFromDomain
     *        The name of a domain that an email identity uses as a custom MAIL FROM domain.
     */

    public void setMailFromDomain(String mailFromDomain) {
        this.mailFromDomain = mailFromDomain;
    }

    /**
     * <p>
     * The name of a domain that an email identity uses as a custom MAIL FROM domain.
     * </p>
     * 
     * @return The name of a domain that an email identity uses as a custom MAIL FROM domain.
     */

    public String getMailFromDomain() {
        return this.mailFromDomain;
    }

    /**
     * <p>
     * The name of a domain that an email identity uses as a custom MAIL FROM domain.
     * </p>
     * 
     * @param mailFromDomain
     *        The name of a domain that an email identity uses as a custom MAIL FROM domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MailFromAttributes withMailFromDomain(String mailFromDomain) {
        setMailFromDomain(mailFromDomain);
        return this;
    }

    /**
     * <p>
     * The status of the MAIL FROM domain. This status can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> – Amazon Pinpoint hasn't started searching for the MX record yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code> – Amazon Pinpoint detected the required MX record for the MAIL FROM domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> – Amazon Pinpoint can't find the required MX record, or the record no longer exists.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEMPORARY_FAILURE</code> – A temporary issue occurred, which prevented Amazon Pinpoint from determining the
     * status of the MAIL FROM domain.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mailFromDomainStatus
     *        The status of the MAIL FROM domain. This status can have the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code> – Amazon Pinpoint hasn't started searching for the MX record yet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCESS</code> – Amazon Pinpoint detected the required MX record for the MAIL FROM domain.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> – Amazon Pinpoint can't find the required MX record, or the record no longer exists.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TEMPORARY_FAILURE</code> – A temporary issue occurred, which prevented Amazon Pinpoint from
     *        determining the status of the MAIL FROM domain.
     *        </p>
     *        </li>
     * @see MailFromDomainStatus
     */

    public void setMailFromDomainStatus(String mailFromDomainStatus) {
        this.mailFromDomainStatus = mailFromDomainStatus;
    }

    /**
     * <p>
     * The status of the MAIL FROM domain. This status can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> – Amazon Pinpoint hasn't started searching for the MX record yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code> – Amazon Pinpoint detected the required MX record for the MAIL FROM domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> – Amazon Pinpoint can't find the required MX record, or the record no longer exists.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEMPORARY_FAILURE</code> – A temporary issue occurred, which prevented Amazon Pinpoint from determining the
     * status of the MAIL FROM domain.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the MAIL FROM domain. This status can have the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PENDING</code> – Amazon Pinpoint hasn't started searching for the MX record yet.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUCCESS</code> – Amazon Pinpoint detected the required MX record for the MAIL FROM domain.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> – Amazon Pinpoint can't find the required MX record, or the record no longer exists.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TEMPORARY_FAILURE</code> – A temporary issue occurred, which prevented Amazon Pinpoint from
     *         determining the status of the MAIL FROM domain.
     *         </p>
     *         </li>
     * @see MailFromDomainStatus
     */

    public String getMailFromDomainStatus() {
        return this.mailFromDomainStatus;
    }

    /**
     * <p>
     * The status of the MAIL FROM domain. This status can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> – Amazon Pinpoint hasn't started searching for the MX record yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code> – Amazon Pinpoint detected the required MX record for the MAIL FROM domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> – Amazon Pinpoint can't find the required MX record, or the record no longer exists.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEMPORARY_FAILURE</code> – A temporary issue occurred, which prevented Amazon Pinpoint from determining the
     * status of the MAIL FROM domain.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mailFromDomainStatus
     *        The status of the MAIL FROM domain. This status can have the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code> – Amazon Pinpoint hasn't started searching for the MX record yet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCESS</code> – Amazon Pinpoint detected the required MX record for the MAIL FROM domain.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> – Amazon Pinpoint can't find the required MX record, or the record no longer exists.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TEMPORARY_FAILURE</code> – A temporary issue occurred, which prevented Amazon Pinpoint from
     *        determining the status of the MAIL FROM domain.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MailFromDomainStatus
     */

    public MailFromAttributes withMailFromDomainStatus(String mailFromDomainStatus) {
        setMailFromDomainStatus(mailFromDomainStatus);
        return this;
    }

    /**
     * <p>
     * The status of the MAIL FROM domain. This status can have the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> – Amazon Pinpoint hasn't started searching for the MX record yet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code> – Amazon Pinpoint detected the required MX record for the MAIL FROM domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> – Amazon Pinpoint can't find the required MX record, or the record no longer exists.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TEMPORARY_FAILURE</code> – A temporary issue occurred, which prevented Amazon Pinpoint from determining the
     * status of the MAIL FROM domain.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mailFromDomainStatus
     *        The status of the MAIL FROM domain. This status can have the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code> – Amazon Pinpoint hasn't started searching for the MX record yet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCESS</code> – Amazon Pinpoint detected the required MX record for the MAIL FROM domain.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> – Amazon Pinpoint can't find the required MX record, or the record no longer exists.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TEMPORARY_FAILURE</code> – A temporary issue occurred, which prevented Amazon Pinpoint from
     *        determining the status of the MAIL FROM domain.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MailFromDomainStatus
     */

    public MailFromAttributes withMailFromDomainStatus(MailFromDomainStatus mailFromDomainStatus) {
        this.mailFromDomainStatus = mailFromDomainStatus.toString();
        return this;
    }

    /**
     * <p>
     * The action that Amazon Pinpoint to takes if it can't read the required MX record for a custom MAIL FROM domain.
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
     *        The action that Amazon Pinpoint to takes if it can't read the required MX record for a custom MAIL FROM
     *        domain. When you set this value to <code>UseDefaultValue</code>, Amazon Pinpoint uses <i>amazonses.com</i>
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
     * The action that Amazon Pinpoint to takes if it can't read the required MX record for a custom MAIL FROM domain.
     * When you set this value to <code>UseDefaultValue</code>, Amazon Pinpoint uses <i>amazonses.com</i> as the MAIL
     * FROM domain. When you set this value to <code>RejectMessage</code>, Amazon Pinpoint returns a
     * <code>MailFromDomainNotVerified</code> error, and doesn't attempt to deliver the email.
     * </p>
     * <p>
     * These behaviors are taken when the custom MAIL FROM domain configuration is in the <code>Pending</code>,
     * <code>Failed</code>, and <code>TemporaryFailure</code> states.
     * </p>
     * 
     * @return The action that Amazon Pinpoint to takes if it can't read the required MX record for a custom MAIL FROM
     *         domain. When you set this value to <code>UseDefaultValue</code>, Amazon Pinpoint uses
     *         <i>amazonses.com</i> as the MAIL FROM domain. When you set this value to <code>RejectMessage</code>,
     *         Amazon Pinpoint returns a <code>MailFromDomainNotVerified</code> error, and doesn't attempt to deliver
     *         the email.</p>
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
     * The action that Amazon Pinpoint to takes if it can't read the required MX record for a custom MAIL FROM domain.
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
     *        The action that Amazon Pinpoint to takes if it can't read the required MX record for a custom MAIL FROM
     *        domain. When you set this value to <code>UseDefaultValue</code>, Amazon Pinpoint uses <i>amazonses.com</i>
     *        as the MAIL FROM domain. When you set this value to <code>RejectMessage</code>, Amazon Pinpoint returns a
     *        <code>MailFromDomainNotVerified</code> error, and doesn't attempt to deliver the email.</p>
     *        <p>
     *        These behaviors are taken when the custom MAIL FROM domain configuration is in the <code>Pending</code>,
     *        <code>Failed</code>, and <code>TemporaryFailure</code> states.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BehaviorOnMxFailure
     */

    public MailFromAttributes withBehaviorOnMxFailure(String behaviorOnMxFailure) {
        setBehaviorOnMxFailure(behaviorOnMxFailure);
        return this;
    }

    /**
     * <p>
     * The action that Amazon Pinpoint to takes if it can't read the required MX record for a custom MAIL FROM domain.
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
     *        The action that Amazon Pinpoint to takes if it can't read the required MX record for a custom MAIL FROM
     *        domain. When you set this value to <code>UseDefaultValue</code>, Amazon Pinpoint uses <i>amazonses.com</i>
     *        as the MAIL FROM domain. When you set this value to <code>RejectMessage</code>, Amazon Pinpoint returns a
     *        <code>MailFromDomainNotVerified</code> error, and doesn't attempt to deliver the email.</p>
     *        <p>
     *        These behaviors are taken when the custom MAIL FROM domain configuration is in the <code>Pending</code>,
     *        <code>Failed</code>, and <code>TemporaryFailure</code> states.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BehaviorOnMxFailure
     */

    public MailFromAttributes withBehaviorOnMxFailure(BehaviorOnMxFailure behaviorOnMxFailure) {
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
        if (getMailFromDomain() != null)
            sb.append("MailFromDomain: ").append(getMailFromDomain()).append(",");
        if (getMailFromDomainStatus() != null)
            sb.append("MailFromDomainStatus: ").append(getMailFromDomainStatus()).append(",");
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

        if (obj instanceof MailFromAttributes == false)
            return false;
        MailFromAttributes other = (MailFromAttributes) obj;
        if (other.getMailFromDomain() == null ^ this.getMailFromDomain() == null)
            return false;
        if (other.getMailFromDomain() != null && other.getMailFromDomain().equals(this.getMailFromDomain()) == false)
            return false;
        if (other.getMailFromDomainStatus() == null ^ this.getMailFromDomainStatus() == null)
            return false;
        if (other.getMailFromDomainStatus() != null && other.getMailFromDomainStatus().equals(this.getMailFromDomainStatus()) == false)
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

        hashCode = prime * hashCode + ((getMailFromDomain() == null) ? 0 : getMailFromDomain().hashCode());
        hashCode = prime * hashCode + ((getMailFromDomainStatus() == null) ? 0 : getMailFromDomainStatus().hashCode());
        hashCode = prime * hashCode + ((getBehaviorOnMxFailure() == null) ? 0 : getBehaviorOnMxFailure().hashCode());
        return hashCode;
    }

    @Override
    public MailFromAttributes clone() {
        try {
            return (MailFromAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpointemail.model.transform.MailFromAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
