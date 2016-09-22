/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.certificatemanager.model;

import java.io.Serializable;

/**
 * <p>
 * This structure is used in the request object of the <a>RequestCertificate</a> action.
 * </p>
 */
public class DomainValidationOption implements Serializable, Cloneable {

    /**
     * <p>
     * Fully Qualified Domain Name (FQDN) of the certificate being requested.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The domain to which validation email is sent. This is the base validation domain that will act as the suffix of
     * the email addresses. This must be the same as the <code>DomainName</code> value or a superdomain of the
     * <code>DomainName</code> value. For example, if you requested a certificate for
     * <code>site.subdomain.example.com</code> and specify a <b>ValidationDomain</b> of
     * <code>subdomain.example.com</code>, ACM sends email to the domain registrant, technical contact, and
     * administrative contact in WHOIS for the base domain and the following five addresses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * admin@subdomain.example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * administrator@subdomain.example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * hostmaster@subdomain.example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * postmaster@subdomain.example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * webmaster@subdomain.example.com
     * </p>
     * </li>
     * </ul>
     */
    private String validationDomain;

    /**
     * <p>
     * Fully Qualified Domain Name (FQDN) of the certificate being requested.
     * </p>
     * 
     * @param domainName
     *        Fully Qualified Domain Name (FQDN) of the certificate being requested.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * Fully Qualified Domain Name (FQDN) of the certificate being requested.
     * </p>
     * 
     * @return Fully Qualified Domain Name (FQDN) of the certificate being requested.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * Fully Qualified Domain Name (FQDN) of the certificate being requested.
     * </p>
     * 
     * @param domainName
     *        Fully Qualified Domain Name (FQDN) of the certificate being requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainValidationOption withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The domain to which validation email is sent. This is the base validation domain that will act as the suffix of
     * the email addresses. This must be the same as the <code>DomainName</code> value or a superdomain of the
     * <code>DomainName</code> value. For example, if you requested a certificate for
     * <code>site.subdomain.example.com</code> and specify a <b>ValidationDomain</b> of
     * <code>subdomain.example.com</code>, ACM sends email to the domain registrant, technical contact, and
     * administrative contact in WHOIS for the base domain and the following five addresses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * admin@subdomain.example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * administrator@subdomain.example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * hostmaster@subdomain.example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * postmaster@subdomain.example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * webmaster@subdomain.example.com
     * </p>
     * </li>
     * </ul>
     * 
     * @param validationDomain
     *        The domain to which validation email is sent. This is the base validation domain that will act as the
     *        suffix of the email addresses. This must be the same as the <code>DomainName</code> value or a superdomain
     *        of the <code>DomainName</code> value. For example, if you requested a certificate for
     *        <code>site.subdomain.example.com</code> and specify a <b>ValidationDomain</b> of
     *        <code>subdomain.example.com</code>, ACM sends email to the domain registrant, technical contact, and
     *        administrative contact in WHOIS for the base domain and the following five addresses:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        admin@subdomain.example.com
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        administrator@subdomain.example.com
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        hostmaster@subdomain.example.com
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        postmaster@subdomain.example.com
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        webmaster@subdomain.example.com
     *        </p>
     *        </li>
     */

    public void setValidationDomain(String validationDomain) {
        this.validationDomain = validationDomain;
    }

    /**
     * <p>
     * The domain to which validation email is sent. This is the base validation domain that will act as the suffix of
     * the email addresses. This must be the same as the <code>DomainName</code> value or a superdomain of the
     * <code>DomainName</code> value. For example, if you requested a certificate for
     * <code>site.subdomain.example.com</code> and specify a <b>ValidationDomain</b> of
     * <code>subdomain.example.com</code>, ACM sends email to the domain registrant, technical contact, and
     * administrative contact in WHOIS for the base domain and the following five addresses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * admin@subdomain.example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * administrator@subdomain.example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * hostmaster@subdomain.example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * postmaster@subdomain.example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * webmaster@subdomain.example.com
     * </p>
     * </li>
     * </ul>
     * 
     * @return The domain to which validation email is sent. This is the base validation domain that will act as the
     *         suffix of the email addresses. This must be the same as the <code>DomainName</code> value or a
     *         superdomain of the <code>DomainName</code> value. For example, if you requested a certificate for
     *         <code>site.subdomain.example.com</code> and specify a <b>ValidationDomain</b> of
     *         <code>subdomain.example.com</code>, ACM sends email to the domain registrant, technical contact, and
     *         administrative contact in WHOIS for the base domain and the following five addresses:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         admin@subdomain.example.com
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         administrator@subdomain.example.com
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         hostmaster@subdomain.example.com
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         postmaster@subdomain.example.com
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         webmaster@subdomain.example.com
     *         </p>
     *         </li>
     */

    public String getValidationDomain() {
        return this.validationDomain;
    }

    /**
     * <p>
     * The domain to which validation email is sent. This is the base validation domain that will act as the suffix of
     * the email addresses. This must be the same as the <code>DomainName</code> value or a superdomain of the
     * <code>DomainName</code> value. For example, if you requested a certificate for
     * <code>site.subdomain.example.com</code> and specify a <b>ValidationDomain</b> of
     * <code>subdomain.example.com</code>, ACM sends email to the domain registrant, technical contact, and
     * administrative contact in WHOIS for the base domain and the following five addresses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * admin@subdomain.example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * administrator@subdomain.example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * hostmaster@subdomain.example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * postmaster@subdomain.example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * webmaster@subdomain.example.com
     * </p>
     * </li>
     * </ul>
     * 
     * @param validationDomain
     *        The domain to which validation email is sent. This is the base validation domain that will act as the
     *        suffix of the email addresses. This must be the same as the <code>DomainName</code> value or a superdomain
     *        of the <code>DomainName</code> value. For example, if you requested a certificate for
     *        <code>site.subdomain.example.com</code> and specify a <b>ValidationDomain</b> of
     *        <code>subdomain.example.com</code>, ACM sends email to the domain registrant, technical contact, and
     *        administrative contact in WHOIS for the base domain and the following five addresses:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        admin@subdomain.example.com
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        administrator@subdomain.example.com
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        hostmaster@subdomain.example.com
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        postmaster@subdomain.example.com
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        webmaster@subdomain.example.com
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainValidationOption withValidationDomain(String validationDomain) {
        setValidationDomain(validationDomain);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("DomainName: " + getDomainName() + ",");
        if (getValidationDomain() != null)
            sb.append("ValidationDomain: " + getValidationDomain());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainValidationOption == false)
            return false;
        DomainValidationOption other = (DomainValidationOption) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getValidationDomain() == null ^ this.getValidationDomain() == null)
            return false;
        if (other.getValidationDomain() != null && other.getValidationDomain().equals(this.getValidationDomain()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getValidationDomain() == null) ? 0 : getValidationDomain().hashCode());
        return hashCode;
    }

    @Override
    public DomainValidationOption clone() {
        try {
            return (DomainValidationOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
