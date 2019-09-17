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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/RequestCertificate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RequestCertificateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Fully qualified domain name (FQDN), such as www.example.com, that you want to secure with an ACM certificate. Use
     * an asterisk (*) to create a wildcard certificate that protects several sites in the same domain. For example,
     * *.example.com protects www.example.com, site.example.com, and images.example.com.
     * </p>
     * <p>
     * The first domain name you enter cannot exceed 63 octets, including periods. Each subsequent Subject Alternative
     * Name (SAN), however, can be up to 253 octets in length.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The method you want to use if you are requesting a public certificate to validate that you own or control domain.
     * You can <a href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-validate-dns.html">validate with DNS</a>
     * or <a href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-validate-email.html">validate with email</a>.
     * We recommend that you use DNS validation.
     * </p>
     */
    private String validationMethod;
    /**
     * <p>
     * Additional FQDNs to be included in the Subject Alternative Name extension of the ACM certificate. For example,
     * add the name www.example.net to a certificate for which the <code>DomainName</code> field is www.example.com if
     * users can reach your site by using either name. The maximum number of domain names that you can add to an ACM
     * certificate is 100. However, the initial limit is 10 domain names. If you need more than 10 names, you must
     * request a limit increase. For more information, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/acm-limits.html">Limits</a>.
     * </p>
     * <p>
     * The maximum length of a SAN DNS name is 253 octets. The name is made up of multiple labels separated by periods.
     * No label can be longer than 63 octets. Consider the following examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>(63 octets).(63 octets).(63 octets).(61 octets)</code> is legal because the total length is 253 octets
     * (63+1+63+1+63+1+61) and no label exceeds 63 octets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>(64 octets).(63 octets).(63 octets).(61 octets)</code> is not legal because the total length exceeds 253
     * octets (64+1+63+1+63+1+61) and the first label exceeds 63 octets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>(63 octets).(63 octets).(63 octets).(62 octets)</code> is not legal because the total length of the DNS
     * name (63+1+63+1+63+1+62) exceeds 253 octets.
     * </p>
     * </li>
     * </ul>
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
     * The domain name that you want ACM to use to send you emails so that you can validate domain ownership.
     * </p>
     */
    private java.util.List<DomainValidationOption> domainValidationOptions;
    /**
     * <p>
     * Currently, you can use this parameter to specify whether to add the certificate to a certificate transparency
     * log. Certificate transparency makes it possible to detect SSL/TLS certificates that have been mistakenly or
     * maliciously issued. Certificates that have not been logged typically produce an error message in a browser. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/acm-bestpractices.html#best-practices-transparency">Opting
     * Out of Certificate Transparency Logging</a>.
     * </p>
     */
    private CertificateOptions options;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the private certificate authority (CA) that will be used to issue the
     * certificate. If you do not provide an ARN and you are trying to request a private certificate, ACM will attempt
     * to issue a public certificate. For more information about private CAs, see the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/userguide/PcaWelcome.html">AWS Certificate Manager Private
     * Certificate Authority (PCA)</a> user guide. The ARN must have the following form:
     * </p>
     * <p>
     * <code>arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012</code>
     * </p>
     */
    private String certificateAuthorityArn;

    /**
     * <p>
     * Fully qualified domain name (FQDN), such as www.example.com, that you want to secure with an ACM certificate. Use
     * an asterisk (*) to create a wildcard certificate that protects several sites in the same domain. For example,
     * *.example.com protects www.example.com, site.example.com, and images.example.com.
     * </p>
     * <p>
     * The first domain name you enter cannot exceed 63 octets, including periods. Each subsequent Subject Alternative
     * Name (SAN), however, can be up to 253 octets in length.
     * </p>
     * 
     * @param domainName
     *        Fully qualified domain name (FQDN), such as www.example.com, that you want to secure with an ACM
     *        certificate. Use an asterisk (*) to create a wildcard certificate that protects several sites in the same
     *        domain. For example, *.example.com protects www.example.com, site.example.com, and images.example.com.
     *        </p>
     *        <p>
     *        The first domain name you enter cannot exceed 63 octets, including periods. Each subsequent Subject
     *        Alternative Name (SAN), however, can be up to 253 octets in length.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * Fully qualified domain name (FQDN), such as www.example.com, that you want to secure with an ACM certificate. Use
     * an asterisk (*) to create a wildcard certificate that protects several sites in the same domain. For example,
     * *.example.com protects www.example.com, site.example.com, and images.example.com.
     * </p>
     * <p>
     * The first domain name you enter cannot exceed 63 octets, including periods. Each subsequent Subject Alternative
     * Name (SAN), however, can be up to 253 octets in length.
     * </p>
     * 
     * @return Fully qualified domain name (FQDN), such as www.example.com, that you want to secure with an ACM
     *         certificate. Use an asterisk (*) to create a wildcard certificate that protects several sites in the same
     *         domain. For example, *.example.com protects www.example.com, site.example.com, and images.example.com.
     *         </p>
     *         <p>
     *         The first domain name you enter cannot exceed 63 octets, including periods. Each subsequent Subject
     *         Alternative Name (SAN), however, can be up to 253 octets in length.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * Fully qualified domain name (FQDN), such as www.example.com, that you want to secure with an ACM certificate. Use
     * an asterisk (*) to create a wildcard certificate that protects several sites in the same domain. For example,
     * *.example.com protects www.example.com, site.example.com, and images.example.com.
     * </p>
     * <p>
     * The first domain name you enter cannot exceed 63 octets, including periods. Each subsequent Subject Alternative
     * Name (SAN), however, can be up to 253 octets in length.
     * </p>
     * 
     * @param domainName
     *        Fully qualified domain name (FQDN), such as www.example.com, that you want to secure with an ACM
     *        certificate. Use an asterisk (*) to create a wildcard certificate that protects several sites in the same
     *        domain. For example, *.example.com protects www.example.com, site.example.com, and images.example.com.
     *        </p>
     *        <p>
     *        The first domain name you enter cannot exceed 63 octets, including periods. Each subsequent Subject
     *        Alternative Name (SAN), however, can be up to 253 octets in length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestCertificateRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The method you want to use if you are requesting a public certificate to validate that you own or control domain.
     * You can <a href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-validate-dns.html">validate with DNS</a>
     * or <a href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-validate-email.html">validate with email</a>.
     * We recommend that you use DNS validation.
     * </p>
     * 
     * @param validationMethod
     *        The method you want to use if you are requesting a public certificate to validate that you own or control
     *        domain. You can <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-validate-dns.html">validate with DNS</a> or
     *        <a href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-validate-email.html">validate with
     *        email</a>. We recommend that you use DNS validation.
     * @see ValidationMethod
     */

    public void setValidationMethod(String validationMethod) {
        this.validationMethod = validationMethod;
    }

    /**
     * <p>
     * The method you want to use if you are requesting a public certificate to validate that you own or control domain.
     * You can <a href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-validate-dns.html">validate with DNS</a>
     * or <a href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-validate-email.html">validate with email</a>.
     * We recommend that you use DNS validation.
     * </p>
     * 
     * @return The method you want to use if you are requesting a public certificate to validate that you own or control
     *         domain. You can <a
     *         href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-validate-dns.html">validate with DNS</a> or
     *         <a href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-validate-email.html">validate with
     *         email</a>. We recommend that you use DNS validation.
     * @see ValidationMethod
     */

    public String getValidationMethod() {
        return this.validationMethod;
    }

    /**
     * <p>
     * The method you want to use if you are requesting a public certificate to validate that you own or control domain.
     * You can <a href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-validate-dns.html">validate with DNS</a>
     * or <a href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-validate-email.html">validate with email</a>.
     * We recommend that you use DNS validation.
     * </p>
     * 
     * @param validationMethod
     *        The method you want to use if you are requesting a public certificate to validate that you own or control
     *        domain. You can <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-validate-dns.html">validate with DNS</a> or
     *        <a href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-validate-email.html">validate with
     *        email</a>. We recommend that you use DNS validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidationMethod
     */

    public RequestCertificateRequest withValidationMethod(String validationMethod) {
        setValidationMethod(validationMethod);
        return this;
    }

    /**
     * <p>
     * The method you want to use if you are requesting a public certificate to validate that you own or control domain.
     * You can <a href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-validate-dns.html">validate with DNS</a>
     * or <a href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-validate-email.html">validate with email</a>.
     * We recommend that you use DNS validation.
     * </p>
     * 
     * @param validationMethod
     *        The method you want to use if you are requesting a public certificate to validate that you own or control
     *        domain. You can <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-validate-dns.html">validate with DNS</a> or
     *        <a href="https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-validate-email.html">validate with
     *        email</a>. We recommend that you use DNS validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ValidationMethod
     */

    public RequestCertificateRequest withValidationMethod(ValidationMethod validationMethod) {
        this.validationMethod = validationMethod.toString();
        return this;
    }

    /**
     * <p>
     * Additional FQDNs to be included in the Subject Alternative Name extension of the ACM certificate. For example,
     * add the name www.example.net to a certificate for which the <code>DomainName</code> field is www.example.com if
     * users can reach your site by using either name. The maximum number of domain names that you can add to an ACM
     * certificate is 100. However, the initial limit is 10 domain names. If you need more than 10 names, you must
     * request a limit increase. For more information, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/acm-limits.html">Limits</a>.
     * </p>
     * <p>
     * The maximum length of a SAN DNS name is 253 octets. The name is made up of multiple labels separated by periods.
     * No label can be longer than 63 octets. Consider the following examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>(63 octets).(63 octets).(63 octets).(61 octets)</code> is legal because the total length is 253 octets
     * (63+1+63+1+63+1+61) and no label exceeds 63 octets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>(64 octets).(63 octets).(63 octets).(61 octets)</code> is not legal because the total length exceeds 253
     * octets (64+1+63+1+63+1+61) and the first label exceeds 63 octets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>(63 octets).(63 octets).(63 octets).(62 octets)</code> is not legal because the total length of the DNS
     * name (63+1+63+1+63+1+62) exceeds 253 octets.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Additional FQDNs to be included in the Subject Alternative Name extension of the ACM certificate. For
     *         example, add the name www.example.net to a certificate for which the <code>DomainName</code> field is
     *         www.example.com if users can reach your site by using either name. The maximum number of domain names
     *         that you can add to an ACM certificate is 100. However, the initial limit is 10 domain names. If you need
     *         more than 10 names, you must request a limit increase. For more information, see <a
     *         href="https://docs.aws.amazon.com/acm/latest/userguide/acm-limits.html">Limits</a>.</p>
     *         <p>
     *         The maximum length of a SAN DNS name is 253 octets. The name is made up of multiple labels separated by
     *         periods. No label can be longer than 63 octets. Consider the following examples:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>(63 octets).(63 octets).(63 octets).(61 octets)</code> is legal because the total length is 253
     *         octets (63+1+63+1+63+1+61) and no label exceeds 63 octets.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>(64 octets).(63 octets).(63 octets).(61 octets)</code> is not legal because the total length
     *         exceeds 253 octets (64+1+63+1+63+1+61) and the first label exceeds 63 octets.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>(63 octets).(63 octets).(63 octets).(62 octets)</code> is not legal because the total length of the
     *         DNS name (63+1+63+1+63+1+62) exceeds 253 octets.
     *         </p>
     *         </li>
     */

    public java.util.List<String> getSubjectAlternativeNames() {
        return subjectAlternativeNames;
    }

    /**
     * <p>
     * Additional FQDNs to be included in the Subject Alternative Name extension of the ACM certificate. For example,
     * add the name www.example.net to a certificate for which the <code>DomainName</code> field is www.example.com if
     * users can reach your site by using either name. The maximum number of domain names that you can add to an ACM
     * certificate is 100. However, the initial limit is 10 domain names. If you need more than 10 names, you must
     * request a limit increase. For more information, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/acm-limits.html">Limits</a>.
     * </p>
     * <p>
     * The maximum length of a SAN DNS name is 253 octets. The name is made up of multiple labels separated by periods.
     * No label can be longer than 63 octets. Consider the following examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>(63 octets).(63 octets).(63 octets).(61 octets)</code> is legal because the total length is 253 octets
     * (63+1+63+1+63+1+61) and no label exceeds 63 octets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>(64 octets).(63 octets).(63 octets).(61 octets)</code> is not legal because the total length exceeds 253
     * octets (64+1+63+1+63+1+61) and the first label exceeds 63 octets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>(63 octets).(63 octets).(63 octets).(62 octets)</code> is not legal because the total length of the DNS
     * name (63+1+63+1+63+1+62) exceeds 253 octets.
     * </p>
     * </li>
     * </ul>
     * 
     * @param subjectAlternativeNames
     *        Additional FQDNs to be included in the Subject Alternative Name extension of the ACM certificate. For
     *        example, add the name www.example.net to a certificate for which the <code>DomainName</code> field is
     *        www.example.com if users can reach your site by using either name. The maximum number of domain names that
     *        you can add to an ACM certificate is 100. However, the initial limit is 10 domain names. If you need more
     *        than 10 names, you must request a limit increase. For more information, see <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/acm-limits.html">Limits</a>.</p>
     *        <p>
     *        The maximum length of a SAN DNS name is 253 octets. The name is made up of multiple labels separated by
     *        periods. No label can be longer than 63 octets. Consider the following examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>(63 octets).(63 octets).(63 octets).(61 octets)</code> is legal because the total length is 253
     *        octets (63+1+63+1+63+1+61) and no label exceeds 63 octets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>(64 octets).(63 octets).(63 octets).(61 octets)</code> is not legal because the total length exceeds
     *        253 octets (64+1+63+1+63+1+61) and the first label exceeds 63 octets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>(63 octets).(63 octets).(63 octets).(62 octets)</code> is not legal because the total length of the
     *        DNS name (63+1+63+1+63+1+62) exceeds 253 octets.
     *        </p>
     *        </li>
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
     * Additional FQDNs to be included in the Subject Alternative Name extension of the ACM certificate. For example,
     * add the name www.example.net to a certificate for which the <code>DomainName</code> field is www.example.com if
     * users can reach your site by using either name. The maximum number of domain names that you can add to an ACM
     * certificate is 100. However, the initial limit is 10 domain names. If you need more than 10 names, you must
     * request a limit increase. For more information, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/acm-limits.html">Limits</a>.
     * </p>
     * <p>
     * The maximum length of a SAN DNS name is 253 octets. The name is made up of multiple labels separated by periods.
     * No label can be longer than 63 octets. Consider the following examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>(63 octets).(63 octets).(63 octets).(61 octets)</code> is legal because the total length is 253 octets
     * (63+1+63+1+63+1+61) and no label exceeds 63 octets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>(64 octets).(63 octets).(63 octets).(61 octets)</code> is not legal because the total length exceeds 253
     * octets (64+1+63+1+63+1+61) and the first label exceeds 63 octets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>(63 octets).(63 octets).(63 octets).(62 octets)</code> is not legal because the total length of the DNS
     * name (63+1+63+1+63+1+62) exceeds 253 octets.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubjectAlternativeNames(java.util.Collection)} or
     * {@link #withSubjectAlternativeNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param subjectAlternativeNames
     *        Additional FQDNs to be included in the Subject Alternative Name extension of the ACM certificate. For
     *        example, add the name www.example.net to a certificate for which the <code>DomainName</code> field is
     *        www.example.com if users can reach your site by using either name. The maximum number of domain names that
     *        you can add to an ACM certificate is 100. However, the initial limit is 10 domain names. If you need more
     *        than 10 names, you must request a limit increase. For more information, see <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/acm-limits.html">Limits</a>.</p>
     *        <p>
     *        The maximum length of a SAN DNS name is 253 octets. The name is made up of multiple labels separated by
     *        periods. No label can be longer than 63 octets. Consider the following examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>(63 octets).(63 octets).(63 octets).(61 octets)</code> is legal because the total length is 253
     *        octets (63+1+63+1+63+1+61) and no label exceeds 63 octets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>(64 octets).(63 octets).(63 octets).(61 octets)</code> is not legal because the total length exceeds
     *        253 octets (64+1+63+1+63+1+61) and the first label exceeds 63 octets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>(63 octets).(63 octets).(63 octets).(62 octets)</code> is not legal because the total length of the
     *        DNS name (63+1+63+1+63+1+62) exceeds 253 octets.
     *        </p>
     *        </li>
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
     * Additional FQDNs to be included in the Subject Alternative Name extension of the ACM certificate. For example,
     * add the name www.example.net to a certificate for which the <code>DomainName</code> field is www.example.com if
     * users can reach your site by using either name. The maximum number of domain names that you can add to an ACM
     * certificate is 100. However, the initial limit is 10 domain names. If you need more than 10 names, you must
     * request a limit increase. For more information, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/acm-limits.html">Limits</a>.
     * </p>
     * <p>
     * The maximum length of a SAN DNS name is 253 octets. The name is made up of multiple labels separated by periods.
     * No label can be longer than 63 octets. Consider the following examples:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>(63 octets).(63 octets).(63 octets).(61 octets)</code> is legal because the total length is 253 octets
     * (63+1+63+1+63+1+61) and no label exceeds 63 octets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>(64 octets).(63 octets).(63 octets).(61 octets)</code> is not legal because the total length exceeds 253
     * octets (64+1+63+1+63+1+61) and the first label exceeds 63 octets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>(63 octets).(63 octets).(63 octets).(62 octets)</code> is not legal because the total length of the DNS
     * name (63+1+63+1+63+1+62) exceeds 253 octets.
     * </p>
     * </li>
     * </ul>
     * 
     * @param subjectAlternativeNames
     *        Additional FQDNs to be included in the Subject Alternative Name extension of the ACM certificate. For
     *        example, add the name www.example.net to a certificate for which the <code>DomainName</code> field is
     *        www.example.com if users can reach your site by using either name. The maximum number of domain names that
     *        you can add to an ACM certificate is 100. However, the initial limit is 10 domain names. If you need more
     *        than 10 names, you must request a limit increase. For more information, see <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/acm-limits.html">Limits</a>.</p>
     *        <p>
     *        The maximum length of a SAN DNS name is 253 octets. The name is made up of multiple labels separated by
     *        periods. No label can be longer than 63 octets. Consider the following examples:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>(63 octets).(63 octets).(63 octets).(61 octets)</code> is legal because the total length is 253
     *        octets (63+1+63+1+63+1+61) and no label exceeds 63 octets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>(64 octets).(63 octets).(63 octets).(61 octets)</code> is not legal because the total length exceeds
     *        253 octets (64+1+63+1+63+1+61) and the first label exceeds 63 octets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>(63 octets).(63 octets).(63 octets).(62 octets)</code> is not legal because the total length of the
     *        DNS name (63+1+63+1+63+1+62) exceeds 253 octets.
     *        </p>
     *        </li>
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
     * The domain name that you want ACM to use to send you emails so that you can validate domain ownership.
     * </p>
     * 
     * @return The domain name that you want ACM to use to send you emails so that you can validate domain ownership.
     */

    public java.util.List<DomainValidationOption> getDomainValidationOptions() {
        return domainValidationOptions;
    }

    /**
     * <p>
     * The domain name that you want ACM to use to send you emails so that you can validate domain ownership.
     * </p>
     * 
     * @param domainValidationOptions
     *        The domain name that you want ACM to use to send you emails so that you can validate domain ownership.
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
     * The domain name that you want ACM to use to send you emails so that you can validate domain ownership.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDomainValidationOptions(java.util.Collection)} or
     * {@link #withDomainValidationOptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param domainValidationOptions
     *        The domain name that you want ACM to use to send you emails so that you can validate domain ownership.
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
     * The domain name that you want ACM to use to send you emails so that you can validate domain ownership.
     * </p>
     * 
     * @param domainValidationOptions
     *        The domain name that you want ACM to use to send you emails so that you can validate domain ownership.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestCertificateRequest withDomainValidationOptions(java.util.Collection<DomainValidationOption> domainValidationOptions) {
        setDomainValidationOptions(domainValidationOptions);
        return this;
    }

    /**
     * <p>
     * Currently, you can use this parameter to specify whether to add the certificate to a certificate transparency
     * log. Certificate transparency makes it possible to detect SSL/TLS certificates that have been mistakenly or
     * maliciously issued. Certificates that have not been logged typically produce an error message in a browser. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/acm-bestpractices.html#best-practices-transparency">Opting
     * Out of Certificate Transparency Logging</a>.
     * </p>
     * 
     * @param options
     *        Currently, you can use this parameter to specify whether to add the certificate to a certificate
     *        transparency log. Certificate transparency makes it possible to detect SSL/TLS certificates that have been
     *        mistakenly or maliciously issued. Certificates that have not been logged typically produce an error
     *        message in a browser. For more information, see <a href=
     *        "https://docs.aws.amazon.com/acm/latest/userguide/acm-bestpractices.html#best-practices-transparency"
     *        >Opting Out of Certificate Transparency Logging</a>.
     */

    public void setOptions(CertificateOptions options) {
        this.options = options;
    }

    /**
     * <p>
     * Currently, you can use this parameter to specify whether to add the certificate to a certificate transparency
     * log. Certificate transparency makes it possible to detect SSL/TLS certificates that have been mistakenly or
     * maliciously issued. Certificates that have not been logged typically produce an error message in a browser. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/acm-bestpractices.html#best-practices-transparency">Opting
     * Out of Certificate Transparency Logging</a>.
     * </p>
     * 
     * @return Currently, you can use this parameter to specify whether to add the certificate to a certificate
     *         transparency log. Certificate transparency makes it possible to detect SSL/TLS certificates that have
     *         been mistakenly or maliciously issued. Certificates that have not been logged typically produce an error
     *         message in a browser. For more information, see <a href=
     *         "https://docs.aws.amazon.com/acm/latest/userguide/acm-bestpractices.html#best-practices-transparency"
     *         >Opting Out of Certificate Transparency Logging</a>.
     */

    public CertificateOptions getOptions() {
        return this.options;
    }

    /**
     * <p>
     * Currently, you can use this parameter to specify whether to add the certificate to a certificate transparency
     * log. Certificate transparency makes it possible to detect SSL/TLS certificates that have been mistakenly or
     * maliciously issued. Certificates that have not been logged typically produce an error message in a browser. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/acm-bestpractices.html#best-practices-transparency">Opting
     * Out of Certificate Transparency Logging</a>.
     * </p>
     * 
     * @param options
     *        Currently, you can use this parameter to specify whether to add the certificate to a certificate
     *        transparency log. Certificate transparency makes it possible to detect SSL/TLS certificates that have been
     *        mistakenly or maliciously issued. Certificates that have not been logged typically produce an error
     *        message in a browser. For more information, see <a href=
     *        "https://docs.aws.amazon.com/acm/latest/userguide/acm-bestpractices.html#best-practices-transparency"
     *        >Opting Out of Certificate Transparency Logging</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestCertificateRequest withOptions(CertificateOptions options) {
        setOptions(options);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the private certificate authority (CA) that will be used to issue the
     * certificate. If you do not provide an ARN and you are trying to request a private certificate, ACM will attempt
     * to issue a public certificate. For more information about private CAs, see the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/userguide/PcaWelcome.html">AWS Certificate Manager Private
     * Certificate Authority (PCA)</a> user guide. The ARN must have the following form:
     * </p>
     * <p>
     * <code>arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * 
     * @param certificateAuthorityArn
     *        The Amazon Resource Name (ARN) of the private certificate authority (CA) that will be used to issue the
     *        certificate. If you do not provide an ARN and you are trying to request a private certificate, ACM will
     *        attempt to issue a public certificate. For more information about private CAs, see the <a
     *        href="https://docs.aws.amazon.com/acm-pca/latest/userguide/PcaWelcome.html">AWS Certificate Manager
     *        Private Certificate Authority (PCA)</a> user guide. The ARN must have the following form: </p>
     *        <p>
     *        <code>arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012</code>
     */

    public void setCertificateAuthorityArn(String certificateAuthorityArn) {
        this.certificateAuthorityArn = certificateAuthorityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the private certificate authority (CA) that will be used to issue the
     * certificate. If you do not provide an ARN and you are trying to request a private certificate, ACM will attempt
     * to issue a public certificate. For more information about private CAs, see the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/userguide/PcaWelcome.html">AWS Certificate Manager Private
     * Certificate Authority (PCA)</a> user guide. The ARN must have the following form:
     * </p>
     * <p>
     * <code>arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the private certificate authority (CA) that will be used to issue the
     *         certificate. If you do not provide an ARN and you are trying to request a private certificate, ACM will
     *         attempt to issue a public certificate. For more information about private CAs, see the <a
     *         href="https://docs.aws.amazon.com/acm-pca/latest/userguide/PcaWelcome.html">AWS Certificate Manager
     *         Private Certificate Authority (PCA)</a> user guide. The ARN must have the following form: </p>
     *         <p>
     *         <code>arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012</code>
     */

    public String getCertificateAuthorityArn() {
        return this.certificateAuthorityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the private certificate authority (CA) that will be used to issue the
     * certificate. If you do not provide an ARN and you are trying to request a private certificate, ACM will attempt
     * to issue a public certificate. For more information about private CAs, see the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/userguide/PcaWelcome.html">AWS Certificate Manager Private
     * Certificate Authority (PCA)</a> user guide. The ARN must have the following form:
     * </p>
     * <p>
     * <code>arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * 
     * @param certificateAuthorityArn
     *        The Amazon Resource Name (ARN) of the private certificate authority (CA) that will be used to issue the
     *        certificate. If you do not provide an ARN and you are trying to request a private certificate, ACM will
     *        attempt to issue a public certificate. For more information about private CAs, see the <a
     *        href="https://docs.aws.amazon.com/acm-pca/latest/userguide/PcaWelcome.html">AWS Certificate Manager
     *        Private Certificate Authority (PCA)</a> user guide. The ARN must have the following form: </p>
     *        <p>
     *        <code>arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RequestCertificateRequest withCertificateAuthorityArn(String certificateAuthorityArn) {
        setCertificateAuthorityArn(certificateAuthorityArn);
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getValidationMethod() != null)
            sb.append("ValidationMethod: ").append(getValidationMethod()).append(",");
        if (getSubjectAlternativeNames() != null)
            sb.append("SubjectAlternativeNames: ").append(getSubjectAlternativeNames()).append(",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: ").append(getIdempotencyToken()).append(",");
        if (getDomainValidationOptions() != null)
            sb.append("DomainValidationOptions: ").append(getDomainValidationOptions()).append(",");
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions()).append(",");
        if (getCertificateAuthorityArn() != null)
            sb.append("CertificateAuthorityArn: ").append(getCertificateAuthorityArn());
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
        if (other.getValidationMethod() == null ^ this.getValidationMethod() == null)
            return false;
        if (other.getValidationMethod() != null && other.getValidationMethod().equals(this.getValidationMethod()) == false)
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
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        if (other.getCertificateAuthorityArn() == null ^ this.getCertificateAuthorityArn() == null)
            return false;
        if (other.getCertificateAuthorityArn() != null && other.getCertificateAuthorityArn().equals(this.getCertificateAuthorityArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getValidationMethod() == null) ? 0 : getValidationMethod().hashCode());
        hashCode = prime * hashCode + ((getSubjectAlternativeNames() == null) ? 0 : getSubjectAlternativeNames().hashCode());
        hashCode = prime * hashCode + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        hashCode = prime * hashCode + ((getDomainValidationOptions() == null) ? 0 : getDomainValidationOptions().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime * hashCode + ((getCertificateAuthorityArn() == null) ? 0 : getCertificateAuthorityArn().hashCode());
        return hashCode;
    }

    @Override
    public RequestCertificateRequest clone() {
        return (RequestCertificateRequest) super.clone();
    }

}
