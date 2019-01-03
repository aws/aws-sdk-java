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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53domains-2014-05-15/ResendContactReachabilityEmail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResendContactReachabilityEmailResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The domain name for which you requested a confirmation email.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The email address for the registrant contact at the time that we sent the verification email.
     * </p>
     */
    private String emailAddress;
    /**
     * <p>
     * <code>True</code> if the email address for the registrant contact has already been verified, and
     * <code>false</code> otherwise. If the email address has already been verified, we don't send another confirmation
     * email.
     * </p>
     */
    private Boolean isAlreadyVerified;

    /**
     * <p>
     * The domain name for which you requested a confirmation email.
     * </p>
     * 
     * @param domainName
     *        The domain name for which you requested a confirmation email.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name for which you requested a confirmation email.
     * </p>
     * 
     * @return The domain name for which you requested a confirmation email.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The domain name for which you requested a confirmation email.
     * </p>
     * 
     * @param domainName
     *        The domain name for which you requested a confirmation email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResendContactReachabilityEmailResult withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The email address for the registrant contact at the time that we sent the verification email.
     * </p>
     * 
     * @param emailAddress
     *        The email address for the registrant contact at the time that we sent the verification email.
     */

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * <p>
     * The email address for the registrant contact at the time that we sent the verification email.
     * </p>
     * 
     * @return The email address for the registrant contact at the time that we sent the verification email.
     */

    public String getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * <p>
     * The email address for the registrant contact at the time that we sent the verification email.
     * </p>
     * 
     * @param emailAddress
     *        The email address for the registrant contact at the time that we sent the verification email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResendContactReachabilityEmailResult withEmailAddress(String emailAddress) {
        setEmailAddress(emailAddress);
        return this;
    }

    /**
     * <p>
     * <code>True</code> if the email address for the registrant contact has already been verified, and
     * <code>false</code> otherwise. If the email address has already been verified, we don't send another confirmation
     * email.
     * </p>
     * 
     * @param isAlreadyVerified
     *        <code>True</code> if the email address for the registrant contact has already been verified, and
     *        <code>false</code> otherwise. If the email address has already been verified, we don't send another
     *        confirmation email.
     */

    public void setIsAlreadyVerified(Boolean isAlreadyVerified) {
        this.isAlreadyVerified = isAlreadyVerified;
    }

    /**
     * <p>
     * <code>True</code> if the email address for the registrant contact has already been verified, and
     * <code>false</code> otherwise. If the email address has already been verified, we don't send another confirmation
     * email.
     * </p>
     * 
     * @return <code>True</code> if the email address for the registrant contact has already been verified, and
     *         <code>false</code> otherwise. If the email address has already been verified, we don't send another
     *         confirmation email.
     */

    public Boolean getIsAlreadyVerified() {
        return this.isAlreadyVerified;
    }

    /**
     * <p>
     * <code>True</code> if the email address for the registrant contact has already been verified, and
     * <code>false</code> otherwise. If the email address has already been verified, we don't send another confirmation
     * email.
     * </p>
     * 
     * @param isAlreadyVerified
     *        <code>True</code> if the email address for the registrant contact has already been verified, and
     *        <code>false</code> otherwise. If the email address has already been verified, we don't send another
     *        confirmation email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResendContactReachabilityEmailResult withIsAlreadyVerified(Boolean isAlreadyVerified) {
        setIsAlreadyVerified(isAlreadyVerified);
        return this;
    }

    /**
     * <p>
     * <code>True</code> if the email address for the registrant contact has already been verified, and
     * <code>false</code> otherwise. If the email address has already been verified, we don't send another confirmation
     * email.
     * </p>
     * 
     * @return <code>True</code> if the email address for the registrant contact has already been verified, and
     *         <code>false</code> otherwise. If the email address has already been verified, we don't send another
     *         confirmation email.
     */

    public Boolean isAlreadyVerified() {
        return this.isAlreadyVerified;
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getEmailAddress() != null)
            sb.append("EmailAddress: ").append(getEmailAddress()).append(",");
        if (getIsAlreadyVerified() != null)
            sb.append("IsAlreadyVerified: ").append(getIsAlreadyVerified());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResendContactReachabilityEmailResult == false)
            return false;
        ResendContactReachabilityEmailResult other = (ResendContactReachabilityEmailResult) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getEmailAddress() == null ^ this.getEmailAddress() == null)
            return false;
        if (other.getEmailAddress() != null && other.getEmailAddress().equals(this.getEmailAddress()) == false)
            return false;
        if (other.getIsAlreadyVerified() == null ^ this.getIsAlreadyVerified() == null)
            return false;
        if (other.getIsAlreadyVerified() != null && other.getIsAlreadyVerified().equals(this.getIsAlreadyVerified()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getEmailAddress() == null) ? 0 : getEmailAddress().hashCode());
        hashCode = prime * hashCode + ((getIsAlreadyVerified() == null) ? 0 : getIsAlreadyVerified().hashCode());
        return hashCode;
    }

    @Override
    public ResendContactReachabilityEmailResult clone() {
        try {
            return (ResendContactReachabilityEmailResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
