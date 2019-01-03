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
package com.amazonaws.services.certificatemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/ResendValidationEmail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResendValidationEmailRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * String that contains the ARN of the requested certificate. The certificate ARN is generated and returned by the
     * <a>RequestCertificate</a> action as soon as the request is made. By default, using this parameter causes email to
     * be sent to all top-level domains you specified in the certificate request. The ARN must be of the form:
     * </p>
     * <p>
     * <code>arn:aws:acm:us-east-1:123456789012:certificate/12345678-1234-1234-1234-123456789012</code>
     * </p>
     */
    private String certificateArn;
    /**
     * <p>
     * The fully qualified domain name (FQDN) of the certificate that needs to be validated.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The base validation domain that will act as the suffix of the email addresses that are used to send the emails.
     * This must be the same as the <code>Domain</code> value or a superdomain of the <code>Domain</code> value. For
     * example, if you requested a certificate for <code>site.subdomain.example.com</code> and specify a
     * <b>ValidationDomain</b> of <code>subdomain.example.com</code>, ACM sends email to the domain registrant,
     * technical contact, and administrative contact in WHOIS and the following five addresses:
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
     * String that contains the ARN of the requested certificate. The certificate ARN is generated and returned by the
     * <a>RequestCertificate</a> action as soon as the request is made. By default, using this parameter causes email to
     * be sent to all top-level domains you specified in the certificate request. The ARN must be of the form:
     * </p>
     * <p>
     * <code>arn:aws:acm:us-east-1:123456789012:certificate/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * 
     * @param certificateArn
     *        String that contains the ARN of the requested certificate. The certificate ARN is generated and returned
     *        by the <a>RequestCertificate</a> action as soon as the request is made. By default, using this parameter
     *        causes email to be sent to all top-level domains you specified in the certificate request. The ARN must be
     *        of the form: </p>
     *        <p>
     *        <code>arn:aws:acm:us-east-1:123456789012:certificate/12345678-1234-1234-1234-123456789012</code>
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * String that contains the ARN of the requested certificate. The certificate ARN is generated and returned by the
     * <a>RequestCertificate</a> action as soon as the request is made. By default, using this parameter causes email to
     * be sent to all top-level domains you specified in the certificate request. The ARN must be of the form:
     * </p>
     * <p>
     * <code>arn:aws:acm:us-east-1:123456789012:certificate/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * 
     * @return String that contains the ARN of the requested certificate. The certificate ARN is generated and returned
     *         by the <a>RequestCertificate</a> action as soon as the request is made. By default, using this parameter
     *         causes email to be sent to all top-level domains you specified in the certificate request. The ARN must
     *         be of the form: </p>
     *         <p>
     *         <code>arn:aws:acm:us-east-1:123456789012:certificate/12345678-1234-1234-1234-123456789012</code>
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * <p>
     * String that contains the ARN of the requested certificate. The certificate ARN is generated and returned by the
     * <a>RequestCertificate</a> action as soon as the request is made. By default, using this parameter causes email to
     * be sent to all top-level domains you specified in the certificate request. The ARN must be of the form:
     * </p>
     * <p>
     * <code>arn:aws:acm:us-east-1:123456789012:certificate/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * 
     * @param certificateArn
     *        String that contains the ARN of the requested certificate. The certificate ARN is generated and returned
     *        by the <a>RequestCertificate</a> action as soon as the request is made. By default, using this parameter
     *        causes email to be sent to all top-level domains you specified in the certificate request. The ARN must be
     *        of the form: </p>
     *        <p>
     *        <code>arn:aws:acm:us-east-1:123456789012:certificate/12345678-1234-1234-1234-123456789012</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResendValidationEmailRequest withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
        return this;
    }

    /**
     * <p>
     * The fully qualified domain name (FQDN) of the certificate that needs to be validated.
     * </p>
     * 
     * @param domain
     *        The fully qualified domain name (FQDN) of the certificate that needs to be validated.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The fully qualified domain name (FQDN) of the certificate that needs to be validated.
     * </p>
     * 
     * @return The fully qualified domain name (FQDN) of the certificate that needs to be validated.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The fully qualified domain name (FQDN) of the certificate that needs to be validated.
     * </p>
     * 
     * @param domain
     *        The fully qualified domain name (FQDN) of the certificate that needs to be validated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResendValidationEmailRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The base validation domain that will act as the suffix of the email addresses that are used to send the emails.
     * This must be the same as the <code>Domain</code> value or a superdomain of the <code>Domain</code> value. For
     * example, if you requested a certificate for <code>site.subdomain.example.com</code> and specify a
     * <b>ValidationDomain</b> of <code>subdomain.example.com</code>, ACM sends email to the domain registrant,
     * technical contact, and administrative contact in WHOIS and the following five addresses:
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
     *        The base validation domain that will act as the suffix of the email addresses that are used to send the
     *        emails. This must be the same as the <code>Domain</code> value or a superdomain of the <code>Domain</code>
     *        value. For example, if you requested a certificate for <code>site.subdomain.example.com</code> and specify
     *        a <b>ValidationDomain</b> of <code>subdomain.example.com</code>, ACM sends email to the domain registrant,
     *        technical contact, and administrative contact in WHOIS and the following five addresses:</p>
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
     * The base validation domain that will act as the suffix of the email addresses that are used to send the emails.
     * This must be the same as the <code>Domain</code> value or a superdomain of the <code>Domain</code> value. For
     * example, if you requested a certificate for <code>site.subdomain.example.com</code> and specify a
     * <b>ValidationDomain</b> of <code>subdomain.example.com</code>, ACM sends email to the domain registrant,
     * technical contact, and administrative contact in WHOIS and the following five addresses:
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
     * @return The base validation domain that will act as the suffix of the email addresses that are used to send the
     *         emails. This must be the same as the <code>Domain</code> value or a superdomain of the
     *         <code>Domain</code> value. For example, if you requested a certificate for
     *         <code>site.subdomain.example.com</code> and specify a <b>ValidationDomain</b> of
     *         <code>subdomain.example.com</code>, ACM sends email to the domain registrant, technical contact, and
     *         administrative contact in WHOIS and the following five addresses:</p>
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
     * The base validation domain that will act as the suffix of the email addresses that are used to send the emails.
     * This must be the same as the <code>Domain</code> value or a superdomain of the <code>Domain</code> value. For
     * example, if you requested a certificate for <code>site.subdomain.example.com</code> and specify a
     * <b>ValidationDomain</b> of <code>subdomain.example.com</code>, ACM sends email to the domain registrant,
     * technical contact, and administrative contact in WHOIS and the following five addresses:
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
     *        The base validation domain that will act as the suffix of the email addresses that are used to send the
     *        emails. This must be the same as the <code>Domain</code> value or a superdomain of the <code>Domain</code>
     *        value. For example, if you requested a certificate for <code>site.subdomain.example.com</code> and specify
     *        a <b>ValidationDomain</b> of <code>subdomain.example.com</code>, ACM sends email to the domain registrant,
     *        technical contact, and administrative contact in WHOIS and the following five addresses:</p>
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

    public ResendValidationEmailRequest withValidationDomain(String validationDomain) {
        setValidationDomain(validationDomain);
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
        if (getCertificateArn() != null)
            sb.append("CertificateArn: ").append(getCertificateArn()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getValidationDomain() != null)
            sb.append("ValidationDomain: ").append(getValidationDomain());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResendValidationEmailRequest == false)
            return false;
        ResendValidationEmailRequest other = (ResendValidationEmailRequest) obj;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
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

        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getValidationDomain() == null) ? 0 : getValidationDomain().hashCode());
        return hashCode;
    }

    @Override
    public ResendValidationEmailRequest clone() {
        return (ResendValidationEmailRequest) super.clone();
    }

}
