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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class RequestCertificateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Fully qualified domain name (FQDN), such as www.example.com, of the site you want to secure with an ACM
     * Certificate. Use an asterisk (*) to create a wildcard certificate that protects several sites in the same domain.
     * For example, *.example.com protects www.example.com, site.example.com, and images.example.com.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * Additional FQDNs to be included in the Subject Alternative Name extension of the ACM Certificate. For example,
     * add the name www.example.net to a certificate for which the <code>DomainName</code> field is www.example.com if
     * users can reach your site by using either name.
     * </p>
     */
    private java.util.List<String> subjectAlternativeNames;
    /**
     * <p>
     * Customer chosen string that can be used to distinguish between calls to <code>RequestCertificate</code>.
     * Idempotency tokens time out after one hour. Therefore, if you call <code>RequestCertificate</code> multiple times
     * with the same idempotency token within one hour, ACM recognizes that you are requesting only one certificate and
     * will issue only one. If you change the idempotency token for each call, ACM recognizes that you are requesting
     * multiple certificates.
     * </p>
     */
    private String idempotencyToken;
    /**
     * <p>
     * The base validation domain that will act as the suffix of the email addresses that are used to send the emails.
     * This must be the same as the <code>Domain</code> value or a superdomain of the <code>Domain</code> value. For
     * example, if you requested a certificate for <code>test.example.com</code> and specify
     * <b>DomainValidationOptions</b> of <code>example.com</code>, ACM sends email to the domain registrant, technical
     * contact, and administrative contact in WHOIS and the following five addresses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * admin@example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * administrator@example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * hostmaster@example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * postmaster@example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * webmaster@example.com
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<DomainValidationOption> domainValidationOptions;

    /**
     * <p>
     * Fully qualified domain name (FQDN), such as www.example.com, of the site you want to secure with an ACM
     * Certificate. Use an asterisk (*) to create a wildcard certificate that protects several sites in the same domain.
     * For example, *.example.com protects www.example.com, site.example.com, and images.example.com.
     * </p>
     * 
     * @param domainName
     *        Fully qualified domain name (FQDN), such as www.example.com, of the site you want to secure with an ACM
     *        Certificate. Use an asterisk (*) to create a wildcard certificate that protects several sites in the same
     *        domain. For example, *.example.com protects www.example.com, site.example.com, and images.example.com.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * Fully qualified domain name (FQDN), such as www.example.com, of the site you want to secure with an ACM
     * Certificate. Use an asterisk (*) to create a wildcard certificate that protects several sites in the same domain.
     * For example, *.example.com protects www.example.com, site.example.com, and images.example.com.
     * </p>
     * 
     * @return Fully qualified domain name (FQDN), such as www.example.com, of the site you want to secure with an ACM
     *         Certificate. Use an asterisk (*) to create a wildcard certificate that protects several sites in the same
     *         domain. For example, *.example.com protects www.example.com, site.example.com, and images.example.com.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * Fully qualified domain name (FQDN), such as www.example.com, of the site you want to secure with an ACM
     * Certificate. Use an asterisk (*) to create a wildcard certificate that protects several sites in the same domain.
     * For example, *.example.com protects www.example.com, site.example.com, and images.example.com.
     * </p>
     * 
     * @param domainName
     *        Fully qualified domain name (FQDN), such as www.example.com, of the site you want to secure with an ACM
     *        Certificate. Use an asterisk (*) to create a wildcard certificate that protects several sites in the same
     *        domain. For example, *.example.com protects www.example.com, site.example.com, and images.example.com.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestCertificateRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * Additional FQDNs to be included in the Subject Alternative Name extension of the ACM Certificate. For example,
     * add the name www.example.net to a certificate for which the <code>DomainName</code> field is www.example.com if
     * users can reach your site by using either name.
     * </p>
     * 
     * @return Additional FQDNs to be included in the Subject Alternative Name extension of the ACM Certificate. For
     *         example, add the name www.example.net to a certificate for which the <code>DomainName</code> field is
     *         www.example.com if users can reach your site by using either name.
     */

    public java.util.List<String> getSubjectAlternativeNames() {
        return subjectAlternativeNames;
    }

    /**
     * <p>
     * Additional FQDNs to be included in the Subject Alternative Name extension of the ACM Certificate. For example,
     * add the name www.example.net to a certificate for which the <code>DomainName</code> field is www.example.com if
     * users can reach your site by using either name.
     * </p>
     * 
     * @param subjectAlternativeNames
     *        Additional FQDNs to be included in the Subject Alternative Name extension of the ACM Certificate. For
     *        example, add the name www.example.net to a certificate for which the <code>DomainName</code> field is
     *        www.example.com if users can reach your site by using either name.
     */

    public void setSubjectAlternativeNames(java.util.Collection<String> subjectAlternativeNames) {
        if (subjectAlternativeNames == null) {
            this.subjectAlternativeNames = null;
            return;
        }

        this.subjectAlternativeNames = new java.util.ArrayList<String>(subjectAlternativeNames);
    }

    /**
     * <p>
     * Additional FQDNs to be included in the Subject Alternative Name extension of the ACM Certificate. For example,
     * add the name www.example.net to a certificate for which the <code>DomainName</code> field is www.example.com if
     * users can reach your site by using either name.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubjectAlternativeNames(java.util.Collection)} or
     * {@link #withSubjectAlternativeNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param subjectAlternativeNames
     *        Additional FQDNs to be included in the Subject Alternative Name extension of the ACM Certificate. For
     *        example, add the name www.example.net to a certificate for which the <code>DomainName</code> field is
     *        www.example.com if users can reach your site by using either name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestCertificateRequest withSubjectAlternativeNames(String... subjectAlternativeNames) {
        if (this.subjectAlternativeNames == null) {
            setSubjectAlternativeNames(new java.util.ArrayList<String>(subjectAlternativeNames.length));
        }
        for (String ele : subjectAlternativeNames) {
            this.subjectAlternativeNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Additional FQDNs to be included in the Subject Alternative Name extension of the ACM Certificate. For example,
     * add the name www.example.net to a certificate for which the <code>DomainName</code> field is www.example.com if
     * users can reach your site by using either name.
     * </p>
     * 
     * @param subjectAlternativeNames
     *        Additional FQDNs to be included in the Subject Alternative Name extension of the ACM Certificate. For
     *        example, add the name www.example.net to a certificate for which the <code>DomainName</code> field is
     *        www.example.com if users can reach your site by using either name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestCertificateRequest withSubjectAlternativeNames(java.util.Collection<String> subjectAlternativeNames) {
        setSubjectAlternativeNames(subjectAlternativeNames);
        return this;
    }

    /**
     * <p>
     * Customer chosen string that can be used to distinguish between calls to <code>RequestCertificate</code>.
     * Idempotency tokens time out after one hour. Therefore, if you call <code>RequestCertificate</code> multiple times
     * with the same idempotency token within one hour, ACM recognizes that you are requesting only one certificate and
     * will issue only one. If you change the idempotency token for each call, ACM recognizes that you are requesting
     * multiple certificates.
     * </p>
     * 
     * @param idempotencyToken
     *        Customer chosen string that can be used to distinguish between calls to <code>RequestCertificate</code>.
     *        Idempotency tokens time out after one hour. Therefore, if you call <code>RequestCertificate</code>
     *        multiple times with the same idempotency token within one hour, ACM recognizes that you are requesting
     *        only one certificate and will issue only one. If you change the idempotency token for each call, ACM
     *        recognizes that you are requesting multiple certificates.
     */

    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * Customer chosen string that can be used to distinguish between calls to <code>RequestCertificate</code>.
     * Idempotency tokens time out after one hour. Therefore, if you call <code>RequestCertificate</code> multiple times
     * with the same idempotency token within one hour, ACM recognizes that you are requesting only one certificate and
     * will issue only one. If you change the idempotency token for each call, ACM recognizes that you are requesting
     * multiple certificates.
     * </p>
     * 
     * @return Customer chosen string that can be used to distinguish between calls to <code>RequestCertificate</code>.
     *         Idempotency tokens time out after one hour. Therefore, if you call <code>RequestCertificate</code>
     *         multiple times with the same idempotency token within one hour, ACM recognizes that you are requesting
     *         only one certificate and will issue only one. If you change the idempotency token for each call, ACM
     *         recognizes that you are requesting multiple certificates.
     */

    public String getIdempotencyToken() {
        return this.idempotencyToken;
    }

    /**
     * <p>
     * Customer chosen string that can be used to distinguish between calls to <code>RequestCertificate</code>.
     * Idempotency tokens time out after one hour. Therefore, if you call <code>RequestCertificate</code> multiple times
     * with the same idempotency token within one hour, ACM recognizes that you are requesting only one certificate and
     * will issue only one. If you change the idempotency token for each call, ACM recognizes that you are requesting
     * multiple certificates.
     * </p>
     * 
     * @param idempotencyToken
     *        Customer chosen string that can be used to distinguish between calls to <code>RequestCertificate</code>.
     *        Idempotency tokens time out after one hour. Therefore, if you call <code>RequestCertificate</code>
     *        multiple times with the same idempotency token within one hour, ACM recognizes that you are requesting
     *        only one certificate and will issue only one. If you change the idempotency token for each call, ACM
     *        recognizes that you are requesting multiple certificates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestCertificateRequest withIdempotencyToken(String idempotencyToken) {
        setIdempotencyToken(idempotencyToken);
        return this;
    }

    /**
     * <p>
     * The base validation domain that will act as the suffix of the email addresses that are used to send the emails.
     * This must be the same as the <code>Domain</code> value or a superdomain of the <code>Domain</code> value. For
     * example, if you requested a certificate for <code>test.example.com</code> and specify
     * <b>DomainValidationOptions</b> of <code>example.com</code>, ACM sends email to the domain registrant, technical
     * contact, and administrative contact in WHOIS and the following five addresses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * admin@example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * administrator@example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * hostmaster@example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * postmaster@example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * webmaster@example.com
     * </p>
     * </li>
     * </ul>
     * 
     * @return The base validation domain that will act as the suffix of the email addresses that are used to send the
     *         emails. This must be the same as the <code>Domain</code> value or a superdomain of the
     *         <code>Domain</code> value. For example, if you requested a certificate for <code>test.example.com</code>
     *         and specify <b>DomainValidationOptions</b> of <code>example.com</code>, ACM sends email to the domain
     *         registrant, technical contact, and administrative contact in WHOIS and the following five addresses:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         admin@example.com
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         administrator@example.com
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         hostmaster@example.com
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         postmaster@example.com
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         webmaster@example.com
     *         </p>
     *         </li>
     */

    public java.util.List<DomainValidationOption> getDomainValidationOptions() {
        return domainValidationOptions;
    }

    /**
     * <p>
     * The base validation domain that will act as the suffix of the email addresses that are used to send the emails.
     * This must be the same as the <code>Domain</code> value or a superdomain of the <code>Domain</code> value. For
     * example, if you requested a certificate for <code>test.example.com</code> and specify
     * <b>DomainValidationOptions</b> of <code>example.com</code>, ACM sends email to the domain registrant, technical
     * contact, and administrative contact in WHOIS and the following five addresses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * admin@example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * administrator@example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * hostmaster@example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * postmaster@example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * webmaster@example.com
     * </p>
     * </li>
     * </ul>
     * 
     * @param domainValidationOptions
     *        The base validation domain that will act as the suffix of the email addresses that are used to send the
     *        emails. This must be the same as the <code>Domain</code> value or a superdomain of the <code>Domain</code>
     *        value. For example, if you requested a certificate for <code>test.example.com</code> and specify
     *        <b>DomainValidationOptions</b> of <code>example.com</code>, ACM sends email to the domain registrant,
     *        technical contact, and administrative contact in WHOIS and the following five addresses:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        admin@example.com
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        administrator@example.com
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        hostmaster@example.com
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        postmaster@example.com
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        webmaster@example.com
     *        </p>
     *        </li>
     */

    public void setDomainValidationOptions(java.util.Collection<DomainValidationOption> domainValidationOptions) {
        if (domainValidationOptions == null) {
            this.domainValidationOptions = null;
            return;
        }

        this.domainValidationOptions = new java.util.ArrayList<DomainValidationOption>(domainValidationOptions);
    }

    /**
     * <p>
     * The base validation domain that will act as the suffix of the email addresses that are used to send the emails.
     * This must be the same as the <code>Domain</code> value or a superdomain of the <code>Domain</code> value. For
     * example, if you requested a certificate for <code>test.example.com</code> and specify
     * <b>DomainValidationOptions</b> of <code>example.com</code>, ACM sends email to the domain registrant, technical
     * contact, and administrative contact in WHOIS and the following five addresses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * admin@example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * administrator@example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * hostmaster@example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * postmaster@example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * webmaster@example.com
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDomainValidationOptions(java.util.Collection)} or
     * {@link #withDomainValidationOptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param domainValidationOptions
     *        The base validation domain that will act as the suffix of the email addresses that are used to send the
     *        emails. This must be the same as the <code>Domain</code> value or a superdomain of the <code>Domain</code>
     *        value. For example, if you requested a certificate for <code>test.example.com</code> and specify
     *        <b>DomainValidationOptions</b> of <code>example.com</code>, ACM sends email to the domain registrant,
     *        technical contact, and administrative contact in WHOIS and the following five addresses:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        admin@example.com
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        administrator@example.com
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        hostmaster@example.com
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        postmaster@example.com
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        webmaster@example.com
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestCertificateRequest withDomainValidationOptions(DomainValidationOption... domainValidationOptions) {
        if (this.domainValidationOptions == null) {
            setDomainValidationOptions(new java.util.ArrayList<DomainValidationOption>(domainValidationOptions.length));
        }
        for (DomainValidationOption ele : domainValidationOptions) {
            this.domainValidationOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The base validation domain that will act as the suffix of the email addresses that are used to send the emails.
     * This must be the same as the <code>Domain</code> value or a superdomain of the <code>Domain</code> value. For
     * example, if you requested a certificate for <code>test.example.com</code> and specify
     * <b>DomainValidationOptions</b> of <code>example.com</code>, ACM sends email to the domain registrant, technical
     * contact, and administrative contact in WHOIS and the following five addresses:
     * </p>
     * <ul>
     * <li>
     * <p>
     * admin@example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * administrator@example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * hostmaster@example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * postmaster@example.com
     * </p>
     * </li>
     * <li>
     * <p>
     * webmaster@example.com
     * </p>
     * </li>
     * </ul>
     * 
     * @param domainValidationOptions
     *        The base validation domain that will act as the suffix of the email addresses that are used to send the
     *        emails. This must be the same as the <code>Domain</code> value or a superdomain of the <code>Domain</code>
     *        value. For example, if you requested a certificate for <code>test.example.com</code> and specify
     *        <b>DomainValidationOptions</b> of <code>example.com</code>, ACM sends email to the domain registrant,
     *        technical contact, and administrative contact in WHOIS and the following five addresses:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        admin@example.com
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        administrator@example.com
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        hostmaster@example.com
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        postmaster@example.com
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        webmaster@example.com
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestCertificateRequest withDomainValidationOptions(java.util.Collection<DomainValidationOption> domainValidationOptions) {
        setDomainValidationOptions(domainValidationOptions);
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
        if (getSubjectAlternativeNames() != null)
            sb.append("SubjectAlternativeNames: " + getSubjectAlternativeNames() + ",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: " + getIdempotencyToken() + ",");
        if (getDomainValidationOptions() != null)
            sb.append("DomainValidationOptions: " + getDomainValidationOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RequestCertificateRequest == false)
            return false;
        RequestCertificateRequest other = (RequestCertificateRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getSubjectAlternativeNames() == null ^ this.getSubjectAlternativeNames() == null)
            return false;
        if (other.getSubjectAlternativeNames() != null && other.getSubjectAlternativeNames().equals(this.getSubjectAlternativeNames()) == false)
            return false;
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
            return false;
        if (other.getDomainValidationOptions() == null ^ this.getDomainValidationOptions() == null)
            return false;
        if (other.getDomainValidationOptions() != null && other.getDomainValidationOptions().equals(this.getDomainValidationOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getSubjectAlternativeNames() == null) ? 0 : getSubjectAlternativeNames().hashCode());
        hashCode = prime * hashCode + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        hashCode = prime * hashCode + ((getDomainValidationOptions() == null) ? 0 : getDomainValidationOptions().hashCode());
        return hashCode;
    }

    @Override
    public RequestCertificateRequest clone() {
        return (RequestCertificateRequest) super.clone();
    }
}
