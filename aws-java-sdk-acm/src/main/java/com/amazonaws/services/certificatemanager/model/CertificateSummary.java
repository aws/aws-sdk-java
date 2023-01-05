/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This structure is returned in the response object of <a>ListCertificates</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/CertificateSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CertificateSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Amazon Resource Name (ARN) of the certificate. This is of the form:
     * </p>
     * <p>
     * <code>arn:aws:acm:region:123456789012:certificate/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a>.
     * </p>
     */
    private String certificateArn;
    /**
     * <p>
     * Fully qualified domain name (FQDN), such as www.example.com or example.com, for the certificate.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * One or more domain names (subject alternative names) included in the certificate. This list contains the domain
     * names that are bound to the public key that is contained in the certificate. The subject alternative names
     * include the canonical domain name (CN) of the certificate and additional domain names that can be used to connect
     * to the website.
     * </p>
     * <p>
     * When called by <a
     * href="https://docs.aws.amazon.com/acm/latestAPIReference/API_ListCertificates.html">ListCertificates</a>, this
     * parameter will only return the first 100 subject alternative names included in the certificate. To display the
     * full list of subject alternative names, use <a
     * href="https://docs.aws.amazon.com/acm/latestAPIReference/API_DescribeCertificate.html">DescribeCertificate</a>.
     * </p>
     */
    private java.util.List<String> subjectAlternativeNameSummaries;
    /**
     * <p>
     * When called by <a
     * href="https://docs.aws.amazon.com/acm/latestAPIReference/API_ListCertificates.html">ListCertificates</a>,
     * indicates whether the full list of subject alternative names has been included in the response. If false, the
     * response includes all of the subject alternative names included in the certificate. If true, the response only
     * includes the first 100 subject alternative names included in the certificate. To display the full list of subject
     * alternative names, use <a
     * href="https://docs.aws.amazon.com/acm/latestAPIReference/API_DescribeCertificate.html">DescribeCertificate</a>.
     * </p>
     */
    private Boolean hasAdditionalSubjectAlternativeNames;
    /**
     * <p>
     * The status of the certificate.
     * </p>
     * <p>
     * A certificate enters status PENDING_VALIDATION upon being requested, unless it fails for any of the reasons given
     * in the troubleshooting topic <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/troubleshooting-failed.html">Certificate request
     * fails</a>. ACM makes repeated attempts to validate a certificate for 72 hours and then times out. If a
     * certificate shows status FAILED or VALIDATION_TIMED_OUT, delete the request, correct the issue with <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/dns-validation.html">DNS validation</a> or <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/email-validation.html">Email validation</a>, and try
     * again. If validation succeeds, the certificate enters status ISSUED.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The source of the certificate. For certificates provided by ACM, this value is <code>AMAZON_ISSUED</code>. For
     * certificates that you imported with <a>ImportCertificate</a>, this value is <code>IMPORTED</code>. ACM does not
     * provide <a href="https://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed renewal</a> for
     * imported certificates. For more information about the differences between certificates that you import and those
     * that ACM provides, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing Certificates</a> in the
     * <i>Certificate Manager User Guide</i>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The algorithm that was used to generate the public-private key pair.
     * </p>
     */
    private String keyAlgorithm;
    /**
     * <p>
     * A list of Key Usage X.509 v3 extension objects. Each object is a string value that identifies the purpose of the
     * public key contained in the certificate. Possible extension values include DIGITAL_SIGNATURE, KEY_ENCHIPHERMENT,
     * NON_REPUDIATION, and more.
     * </p>
     */
    private java.util.List<String> keyUsages;
    /**
     * <p>
     * Contains a list of Extended Key Usage X.509 v3 extension objects. Each object specifies a purpose for which the
     * certificate public key can be used and consists of a name and an object identifier (OID).
     * </p>
     */
    private java.util.List<String> extendedKeyUsages;
    /**
     * <p>
     * Indicates whether the certificate is currently in use by any Amazon Web Services resources.
     * </p>
     */
    private Boolean inUse;
    /**
     * <p>
     * Indicates whether the certificate has been exported. This value exists only when the certificate type is
     * <code>PRIVATE</code>.
     * </p>
     */
    private Boolean exported;
    /**
     * <p>
     * Specifies whether the certificate is eligible for renewal. At this time, only exported private certificates can
     * be renewed with the <a>RenewCertificate</a> command.
     * </p>
     */
    private String renewalEligibility;
    /**
     * <p>
     * The time before which the certificate is not valid.
     * </p>
     */
    private java.util.Date notBefore;
    /**
     * <p>
     * The time after which the certificate is not valid.
     * </p>
     */
    private java.util.Date notAfter;
    /**
     * <p>
     * The time at which the certificate was requested.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The time at which the certificate was issued. This value exists only when the certificate type is
     * <code>AMAZON_ISSUED</code>.
     * </p>
     */
    private java.util.Date issuedAt;
    /**
     * <p>
     * The date and time when the certificate was imported. This value exists only when the certificate type is
     * <code>IMPORTED</code>.
     * </p>
     */
    private java.util.Date importedAt;
    /**
     * <p>
     * The time at which the certificate was revoked. This value exists only when the certificate status is
     * <code>REVOKED</code>.
     * </p>
     */
    private java.util.Date revokedAt;

    /**
     * <p>
     * Amazon Resource Name (ARN) of the certificate. This is of the form:
     * </p>
     * <p>
     * <code>arn:aws:acm:region:123456789012:certificate/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a>.
     * </p>
     * 
     * @param certificateArn
     *        Amazon Resource Name (ARN) of the certificate. This is of the form:</p>
     *        <p>
     *        <code>arn:aws:acm:region:123456789012:certificate/12345678-1234-1234-1234-123456789012</code>
     *        </p>
     *        <p>
     *        For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a>.
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the certificate. This is of the form:
     * </p>
     * <p>
     * <code>arn:aws:acm:region:123456789012:certificate/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a>.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the certificate. This is of the form:</p>
     *         <p>
     *         <code>arn:aws:acm:region:123456789012:certificate/12345678-1234-1234-1234-123456789012</code>
     *         </p>
     *         <p>
     *         For more information about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs)</a>.
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the certificate. This is of the form:
     * </p>
     * <p>
     * <code>arn:aws:acm:region:123456789012:certificate/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a>.
     * </p>
     * 
     * @param certificateArn
     *        Amazon Resource Name (ARN) of the certificate. This is of the form:</p>
     *        <p>
     *        <code>arn:aws:acm:region:123456789012:certificate/12345678-1234-1234-1234-123456789012</code>
     *        </p>
     *        <p>
     *        For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateSummary withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
        return this;
    }

    /**
     * <p>
     * Fully qualified domain name (FQDN), such as www.example.com or example.com, for the certificate.
     * </p>
     * 
     * @param domainName
     *        Fully qualified domain name (FQDN), such as www.example.com or example.com, for the certificate.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * Fully qualified domain name (FQDN), such as www.example.com or example.com, for the certificate.
     * </p>
     * 
     * @return Fully qualified domain name (FQDN), such as www.example.com or example.com, for the certificate.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * Fully qualified domain name (FQDN), such as www.example.com or example.com, for the certificate.
     * </p>
     * 
     * @param domainName
     *        Fully qualified domain name (FQDN), such as www.example.com or example.com, for the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateSummary withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * One or more domain names (subject alternative names) included in the certificate. This list contains the domain
     * names that are bound to the public key that is contained in the certificate. The subject alternative names
     * include the canonical domain name (CN) of the certificate and additional domain names that can be used to connect
     * to the website.
     * </p>
     * <p>
     * When called by <a
     * href="https://docs.aws.amazon.com/acm/latestAPIReference/API_ListCertificates.html">ListCertificates</a>, this
     * parameter will only return the first 100 subject alternative names included in the certificate. To display the
     * full list of subject alternative names, use <a
     * href="https://docs.aws.amazon.com/acm/latestAPIReference/API_DescribeCertificate.html">DescribeCertificate</a>.
     * </p>
     * 
     * @return One or more domain names (subject alternative names) included in the certificate. This list contains the
     *         domain names that are bound to the public key that is contained in the certificate. The subject
     *         alternative names include the canonical domain name (CN) of the certificate and additional domain names
     *         that can be used to connect to the website. </p>
     *         <p>
     *         When called by <a
     *         href="https://docs.aws.amazon.com/acm/latestAPIReference/API_ListCertificates.html">ListCertificates</a>,
     *         this parameter will only return the first 100 subject alternative names included in the certificate. To
     *         display the full list of subject alternative names, use <a
     *         href="https://docs.aws.amazon.com/acm/latestAPIReference/API_DescribeCertificate.html"
     *         >DescribeCertificate</a>.
     */

    public java.util.List<String> getSubjectAlternativeNameSummaries() {
        return subjectAlternativeNameSummaries;
    }

    /**
     * <p>
     * One or more domain names (subject alternative names) included in the certificate. This list contains the domain
     * names that are bound to the public key that is contained in the certificate. The subject alternative names
     * include the canonical domain name (CN) of the certificate and additional domain names that can be used to connect
     * to the website.
     * </p>
     * <p>
     * When called by <a
     * href="https://docs.aws.amazon.com/acm/latestAPIReference/API_ListCertificates.html">ListCertificates</a>, this
     * parameter will only return the first 100 subject alternative names included in the certificate. To display the
     * full list of subject alternative names, use <a
     * href="https://docs.aws.amazon.com/acm/latestAPIReference/API_DescribeCertificate.html">DescribeCertificate</a>.
     * </p>
     * 
     * @param subjectAlternativeNameSummaries
     *        One or more domain names (subject alternative names) included in the certificate. This list contains the
     *        domain names that are bound to the public key that is contained in the certificate. The subject
     *        alternative names include the canonical domain name (CN) of the certificate and additional domain names
     *        that can be used to connect to the website. </p>
     *        <p>
     *        When called by <a
     *        href="https://docs.aws.amazon.com/acm/latestAPIReference/API_ListCertificates.html">ListCertificates</a>,
     *        this parameter will only return the first 100 subject alternative names included in the certificate. To
     *        display the full list of subject alternative names, use <a
     *        href="https://docs.aws.amazon.com/acm/latestAPIReference/API_DescribeCertificate.html"
     *        >DescribeCertificate</a>.
     */

    public void setSubjectAlternativeNameSummaries(java.util.Collection<String> subjectAlternativeNameSummaries) {
        if (subjectAlternativeNameSummaries == null) {
            this.subjectAlternativeNameSummaries = null;
            return;
        }

        this.subjectAlternativeNameSummaries = new java.util.ArrayList<String>(subjectAlternativeNameSummaries);
    }

    /**
     * <p>
     * One or more domain names (subject alternative names) included in the certificate. This list contains the domain
     * names that are bound to the public key that is contained in the certificate. The subject alternative names
     * include the canonical domain name (CN) of the certificate and additional domain names that can be used to connect
     * to the website.
     * </p>
     * <p>
     * When called by <a
     * href="https://docs.aws.amazon.com/acm/latestAPIReference/API_ListCertificates.html">ListCertificates</a>, this
     * parameter will only return the first 100 subject alternative names included in the certificate. To display the
     * full list of subject alternative names, use <a
     * href="https://docs.aws.amazon.com/acm/latestAPIReference/API_DescribeCertificate.html">DescribeCertificate</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubjectAlternativeNameSummaries(java.util.Collection)} or
     * {@link #withSubjectAlternativeNameSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param subjectAlternativeNameSummaries
     *        One or more domain names (subject alternative names) included in the certificate. This list contains the
     *        domain names that are bound to the public key that is contained in the certificate. The subject
     *        alternative names include the canonical domain name (CN) of the certificate and additional domain names
     *        that can be used to connect to the website. </p>
     *        <p>
     *        When called by <a
     *        href="https://docs.aws.amazon.com/acm/latestAPIReference/API_ListCertificates.html">ListCertificates</a>,
     *        this parameter will only return the first 100 subject alternative names included in the certificate. To
     *        display the full list of subject alternative names, use <a
     *        href="https://docs.aws.amazon.com/acm/latestAPIReference/API_DescribeCertificate.html"
     *        >DescribeCertificate</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateSummary withSubjectAlternativeNameSummaries(String... subjectAlternativeNameSummaries) {
        if (this.subjectAlternativeNameSummaries == null) {
            setSubjectAlternativeNameSummaries(new java.util.ArrayList<String>(subjectAlternativeNameSummaries.length));
        }
        for (String ele : subjectAlternativeNameSummaries) {
            this.subjectAlternativeNameSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more domain names (subject alternative names) included in the certificate. This list contains the domain
     * names that are bound to the public key that is contained in the certificate. The subject alternative names
     * include the canonical domain name (CN) of the certificate and additional domain names that can be used to connect
     * to the website.
     * </p>
     * <p>
     * When called by <a
     * href="https://docs.aws.amazon.com/acm/latestAPIReference/API_ListCertificates.html">ListCertificates</a>, this
     * parameter will only return the first 100 subject alternative names included in the certificate. To display the
     * full list of subject alternative names, use <a
     * href="https://docs.aws.amazon.com/acm/latestAPIReference/API_DescribeCertificate.html">DescribeCertificate</a>.
     * </p>
     * 
     * @param subjectAlternativeNameSummaries
     *        One or more domain names (subject alternative names) included in the certificate. This list contains the
     *        domain names that are bound to the public key that is contained in the certificate. The subject
     *        alternative names include the canonical domain name (CN) of the certificate and additional domain names
     *        that can be used to connect to the website. </p>
     *        <p>
     *        When called by <a
     *        href="https://docs.aws.amazon.com/acm/latestAPIReference/API_ListCertificates.html">ListCertificates</a>,
     *        this parameter will only return the first 100 subject alternative names included in the certificate. To
     *        display the full list of subject alternative names, use <a
     *        href="https://docs.aws.amazon.com/acm/latestAPIReference/API_DescribeCertificate.html"
     *        >DescribeCertificate</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateSummary withSubjectAlternativeNameSummaries(java.util.Collection<String> subjectAlternativeNameSummaries) {
        setSubjectAlternativeNameSummaries(subjectAlternativeNameSummaries);
        return this;
    }

    /**
     * <p>
     * When called by <a
     * href="https://docs.aws.amazon.com/acm/latestAPIReference/API_ListCertificates.html">ListCertificates</a>,
     * indicates whether the full list of subject alternative names has been included in the response. If false, the
     * response includes all of the subject alternative names included in the certificate. If true, the response only
     * includes the first 100 subject alternative names included in the certificate. To display the full list of subject
     * alternative names, use <a
     * href="https://docs.aws.amazon.com/acm/latestAPIReference/API_DescribeCertificate.html">DescribeCertificate</a>.
     * </p>
     * 
     * @param hasAdditionalSubjectAlternativeNames
     *        When called by <a
     *        href="https://docs.aws.amazon.com/acm/latestAPIReference/API_ListCertificates.html">ListCertificates</a>,
     *        indicates whether the full list of subject alternative names has been included in the response. If false,
     *        the response includes all of the subject alternative names included in the certificate. If true, the
     *        response only includes the first 100 subject alternative names included in the certificate. To display the
     *        full list of subject alternative names, use <a
     *        href="https://docs.aws.amazon.com/acm/latestAPIReference/API_DescribeCertificate.html"
     *        >DescribeCertificate</a>.
     */

    public void setHasAdditionalSubjectAlternativeNames(Boolean hasAdditionalSubjectAlternativeNames) {
        this.hasAdditionalSubjectAlternativeNames = hasAdditionalSubjectAlternativeNames;
    }

    /**
     * <p>
     * When called by <a
     * href="https://docs.aws.amazon.com/acm/latestAPIReference/API_ListCertificates.html">ListCertificates</a>,
     * indicates whether the full list of subject alternative names has been included in the response. If false, the
     * response includes all of the subject alternative names included in the certificate. If true, the response only
     * includes the first 100 subject alternative names included in the certificate. To display the full list of subject
     * alternative names, use <a
     * href="https://docs.aws.amazon.com/acm/latestAPIReference/API_DescribeCertificate.html">DescribeCertificate</a>.
     * </p>
     * 
     * @return When called by <a
     *         href="https://docs.aws.amazon.com/acm/latestAPIReference/API_ListCertificates.html">ListCertificates</a>,
     *         indicates whether the full list of subject alternative names has been included in the response. If false,
     *         the response includes all of the subject alternative names included in the certificate. If true, the
     *         response only includes the first 100 subject alternative names included in the certificate. To display
     *         the full list of subject alternative names, use <a
     *         href="https://docs.aws.amazon.com/acm/latestAPIReference/API_DescribeCertificate.html"
     *         >DescribeCertificate</a>.
     */

    public Boolean getHasAdditionalSubjectAlternativeNames() {
        return this.hasAdditionalSubjectAlternativeNames;
    }

    /**
     * <p>
     * When called by <a
     * href="https://docs.aws.amazon.com/acm/latestAPIReference/API_ListCertificates.html">ListCertificates</a>,
     * indicates whether the full list of subject alternative names has been included in the response. If false, the
     * response includes all of the subject alternative names included in the certificate. If true, the response only
     * includes the first 100 subject alternative names included in the certificate. To display the full list of subject
     * alternative names, use <a
     * href="https://docs.aws.amazon.com/acm/latestAPIReference/API_DescribeCertificate.html">DescribeCertificate</a>.
     * </p>
     * 
     * @param hasAdditionalSubjectAlternativeNames
     *        When called by <a
     *        href="https://docs.aws.amazon.com/acm/latestAPIReference/API_ListCertificates.html">ListCertificates</a>,
     *        indicates whether the full list of subject alternative names has been included in the response. If false,
     *        the response includes all of the subject alternative names included in the certificate. If true, the
     *        response only includes the first 100 subject alternative names included in the certificate. To display the
     *        full list of subject alternative names, use <a
     *        href="https://docs.aws.amazon.com/acm/latestAPIReference/API_DescribeCertificate.html"
     *        >DescribeCertificate</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateSummary withHasAdditionalSubjectAlternativeNames(Boolean hasAdditionalSubjectAlternativeNames) {
        setHasAdditionalSubjectAlternativeNames(hasAdditionalSubjectAlternativeNames);
        return this;
    }

    /**
     * <p>
     * When called by <a
     * href="https://docs.aws.amazon.com/acm/latestAPIReference/API_ListCertificates.html">ListCertificates</a>,
     * indicates whether the full list of subject alternative names has been included in the response. If false, the
     * response includes all of the subject alternative names included in the certificate. If true, the response only
     * includes the first 100 subject alternative names included in the certificate. To display the full list of subject
     * alternative names, use <a
     * href="https://docs.aws.amazon.com/acm/latestAPIReference/API_DescribeCertificate.html">DescribeCertificate</a>.
     * </p>
     * 
     * @return When called by <a
     *         href="https://docs.aws.amazon.com/acm/latestAPIReference/API_ListCertificates.html">ListCertificates</a>,
     *         indicates whether the full list of subject alternative names has been included in the response. If false,
     *         the response includes all of the subject alternative names included in the certificate. If true, the
     *         response only includes the first 100 subject alternative names included in the certificate. To display
     *         the full list of subject alternative names, use <a
     *         href="https://docs.aws.amazon.com/acm/latestAPIReference/API_DescribeCertificate.html"
     *         >DescribeCertificate</a>.
     */

    public Boolean isHasAdditionalSubjectAlternativeNames() {
        return this.hasAdditionalSubjectAlternativeNames;
    }

    /**
     * <p>
     * The status of the certificate.
     * </p>
     * <p>
     * A certificate enters status PENDING_VALIDATION upon being requested, unless it fails for any of the reasons given
     * in the troubleshooting topic <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/troubleshooting-failed.html">Certificate request
     * fails</a>. ACM makes repeated attempts to validate a certificate for 72 hours and then times out. If a
     * certificate shows status FAILED or VALIDATION_TIMED_OUT, delete the request, correct the issue with <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/dns-validation.html">DNS validation</a> or <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/email-validation.html">Email validation</a>, and try
     * again. If validation succeeds, the certificate enters status ISSUED.
     * </p>
     * 
     * @param status
     *        The status of the certificate.</p>
     *        <p>
     *        A certificate enters status PENDING_VALIDATION upon being requested, unless it fails for any of the
     *        reasons given in the troubleshooting topic <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/troubleshooting-failed.html">Certificate request
     *        fails</a>. ACM makes repeated attempts to validate a certificate for 72 hours and then times out. If a
     *        certificate shows status FAILED or VALIDATION_TIMED_OUT, delete the request, correct the issue with <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/dns-validation.html">DNS validation</a> or <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/email-validation.html">Email validation</a>, and
     *        try again. If validation succeeds, the certificate enters status ISSUED.
     * @see CertificateStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the certificate.
     * </p>
     * <p>
     * A certificate enters status PENDING_VALIDATION upon being requested, unless it fails for any of the reasons given
     * in the troubleshooting topic <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/troubleshooting-failed.html">Certificate request
     * fails</a>. ACM makes repeated attempts to validate a certificate for 72 hours and then times out. If a
     * certificate shows status FAILED or VALIDATION_TIMED_OUT, delete the request, correct the issue with <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/dns-validation.html">DNS validation</a> or <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/email-validation.html">Email validation</a>, and try
     * again. If validation succeeds, the certificate enters status ISSUED.
     * </p>
     * 
     * @return The status of the certificate.</p>
     *         <p>
     *         A certificate enters status PENDING_VALIDATION upon being requested, unless it fails for any of the
     *         reasons given in the troubleshooting topic <a
     *         href="https://docs.aws.amazon.com/acm/latest/userguide/troubleshooting-failed.html">Certificate request
     *         fails</a>. ACM makes repeated attempts to validate a certificate for 72 hours and then times out. If a
     *         certificate shows status FAILED or VALIDATION_TIMED_OUT, delete the request, correct the issue with <a
     *         href="https://docs.aws.amazon.com/acm/latest/userguide/dns-validation.html">DNS validation</a> or <a
     *         href="https://docs.aws.amazon.com/acm/latest/userguide/email-validation.html">Email validation</a>, and
     *         try again. If validation succeeds, the certificate enters status ISSUED.
     * @see CertificateStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the certificate.
     * </p>
     * <p>
     * A certificate enters status PENDING_VALIDATION upon being requested, unless it fails for any of the reasons given
     * in the troubleshooting topic <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/troubleshooting-failed.html">Certificate request
     * fails</a>. ACM makes repeated attempts to validate a certificate for 72 hours and then times out. If a
     * certificate shows status FAILED or VALIDATION_TIMED_OUT, delete the request, correct the issue with <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/dns-validation.html">DNS validation</a> or <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/email-validation.html">Email validation</a>, and try
     * again. If validation succeeds, the certificate enters status ISSUED.
     * </p>
     * 
     * @param status
     *        The status of the certificate.</p>
     *        <p>
     *        A certificate enters status PENDING_VALIDATION upon being requested, unless it fails for any of the
     *        reasons given in the troubleshooting topic <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/troubleshooting-failed.html">Certificate request
     *        fails</a>. ACM makes repeated attempts to validate a certificate for 72 hours and then times out. If a
     *        certificate shows status FAILED or VALIDATION_TIMED_OUT, delete the request, correct the issue with <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/dns-validation.html">DNS validation</a> or <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/email-validation.html">Email validation</a>, and
     *        try again. If validation succeeds, the certificate enters status ISSUED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateStatus
     */

    public CertificateSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the certificate.
     * </p>
     * <p>
     * A certificate enters status PENDING_VALIDATION upon being requested, unless it fails for any of the reasons given
     * in the troubleshooting topic <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/troubleshooting-failed.html">Certificate request
     * fails</a>. ACM makes repeated attempts to validate a certificate for 72 hours and then times out. If a
     * certificate shows status FAILED or VALIDATION_TIMED_OUT, delete the request, correct the issue with <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/dns-validation.html">DNS validation</a> or <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/email-validation.html">Email validation</a>, and try
     * again. If validation succeeds, the certificate enters status ISSUED.
     * </p>
     * 
     * @param status
     *        The status of the certificate.</p>
     *        <p>
     *        A certificate enters status PENDING_VALIDATION upon being requested, unless it fails for any of the
     *        reasons given in the troubleshooting topic <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/troubleshooting-failed.html">Certificate request
     *        fails</a>. ACM makes repeated attempts to validate a certificate for 72 hours and then times out. If a
     *        certificate shows status FAILED or VALIDATION_TIMED_OUT, delete the request, correct the issue with <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/dns-validation.html">DNS validation</a> or <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/email-validation.html">Email validation</a>, and
     *        try again. If validation succeeds, the certificate enters status ISSUED.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateStatus
     */

    public CertificateSummary withStatus(CertificateStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The source of the certificate. For certificates provided by ACM, this value is <code>AMAZON_ISSUED</code>. For
     * certificates that you imported with <a>ImportCertificate</a>, this value is <code>IMPORTED</code>. ACM does not
     * provide <a href="https://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed renewal</a> for
     * imported certificates. For more information about the differences between certificates that you import and those
     * that ACM provides, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing Certificates</a> in the
     * <i>Certificate Manager User Guide</i>.
     * </p>
     * 
     * @param type
     *        The source of the certificate. For certificates provided by ACM, this value is <code>AMAZON_ISSUED</code>.
     *        For certificates that you imported with <a>ImportCertificate</a>, this value is <code>IMPORTED</code>. ACM
     *        does not provide <a href="https://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed
     *        renewal</a> for imported certificates. For more information about the differences between certificates
     *        that you import and those that ACM provides, see <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing Certificates</a>
     *        in the <i>Certificate Manager User Guide</i>.
     * @see CertificateType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The source of the certificate. For certificates provided by ACM, this value is <code>AMAZON_ISSUED</code>. For
     * certificates that you imported with <a>ImportCertificate</a>, this value is <code>IMPORTED</code>. ACM does not
     * provide <a href="https://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed renewal</a> for
     * imported certificates. For more information about the differences between certificates that you import and those
     * that ACM provides, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing Certificates</a> in the
     * <i>Certificate Manager User Guide</i>.
     * </p>
     * 
     * @return The source of the certificate. For certificates provided by ACM, this value is <code>AMAZON_ISSUED</code>
     *         . For certificates that you imported with <a>ImportCertificate</a>, this value is <code>IMPORTED</code>.
     *         ACM does not provide <a href="https://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed
     *         renewal</a> for imported certificates. For more information about the differences between certificates
     *         that you import and those that ACM provides, see <a
     *         href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing
     *         Certificates</a> in the <i>Certificate Manager User Guide</i>.
     * @see CertificateType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The source of the certificate. For certificates provided by ACM, this value is <code>AMAZON_ISSUED</code>. For
     * certificates that you imported with <a>ImportCertificate</a>, this value is <code>IMPORTED</code>. ACM does not
     * provide <a href="https://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed renewal</a> for
     * imported certificates. For more information about the differences between certificates that you import and those
     * that ACM provides, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing Certificates</a> in the
     * <i>Certificate Manager User Guide</i>.
     * </p>
     * 
     * @param type
     *        The source of the certificate. For certificates provided by ACM, this value is <code>AMAZON_ISSUED</code>.
     *        For certificates that you imported with <a>ImportCertificate</a>, this value is <code>IMPORTED</code>. ACM
     *        does not provide <a href="https://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed
     *        renewal</a> for imported certificates. For more information about the differences between certificates
     *        that you import and those that ACM provides, see <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing Certificates</a>
     *        in the <i>Certificate Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateType
     */

    public CertificateSummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The source of the certificate. For certificates provided by ACM, this value is <code>AMAZON_ISSUED</code>. For
     * certificates that you imported with <a>ImportCertificate</a>, this value is <code>IMPORTED</code>. ACM does not
     * provide <a href="https://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed renewal</a> for
     * imported certificates. For more information about the differences between certificates that you import and those
     * that ACM provides, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing Certificates</a> in the
     * <i>Certificate Manager User Guide</i>.
     * </p>
     * 
     * @param type
     *        The source of the certificate. For certificates provided by ACM, this value is <code>AMAZON_ISSUED</code>.
     *        For certificates that you imported with <a>ImportCertificate</a>, this value is <code>IMPORTED</code>. ACM
     *        does not provide <a href="https://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed
     *        renewal</a> for imported certificates. For more information about the differences between certificates
     *        that you import and those that ACM provides, see <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing Certificates</a>
     *        in the <i>Certificate Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateType
     */

    public CertificateSummary withType(CertificateType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The algorithm that was used to generate the public-private key pair.
     * </p>
     * 
     * @param keyAlgorithm
     *        The algorithm that was used to generate the public-private key pair.
     * @see KeyAlgorithm
     */

    public void setKeyAlgorithm(String keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm;
    }

    /**
     * <p>
     * The algorithm that was used to generate the public-private key pair.
     * </p>
     * 
     * @return The algorithm that was used to generate the public-private key pair.
     * @see KeyAlgorithm
     */

    public String getKeyAlgorithm() {
        return this.keyAlgorithm;
    }

    /**
     * <p>
     * The algorithm that was used to generate the public-private key pair.
     * </p>
     * 
     * @param keyAlgorithm
     *        The algorithm that was used to generate the public-private key pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyAlgorithm
     */

    public CertificateSummary withKeyAlgorithm(String keyAlgorithm) {
        setKeyAlgorithm(keyAlgorithm);
        return this;
    }

    /**
     * <p>
     * The algorithm that was used to generate the public-private key pair.
     * </p>
     * 
     * @param keyAlgorithm
     *        The algorithm that was used to generate the public-private key pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyAlgorithm
     */

    public CertificateSummary withKeyAlgorithm(KeyAlgorithm keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm.toString();
        return this;
    }

    /**
     * <p>
     * A list of Key Usage X.509 v3 extension objects. Each object is a string value that identifies the purpose of the
     * public key contained in the certificate. Possible extension values include DIGITAL_SIGNATURE, KEY_ENCHIPHERMENT,
     * NON_REPUDIATION, and more.
     * </p>
     * 
     * @return A list of Key Usage X.509 v3 extension objects. Each object is a string value that identifies the purpose
     *         of the public key contained in the certificate. Possible extension values include DIGITAL_SIGNATURE,
     *         KEY_ENCHIPHERMENT, NON_REPUDIATION, and more.
     * @see KeyUsageName
     */

    public java.util.List<String> getKeyUsages() {
        return keyUsages;
    }

    /**
     * <p>
     * A list of Key Usage X.509 v3 extension objects. Each object is a string value that identifies the purpose of the
     * public key contained in the certificate. Possible extension values include DIGITAL_SIGNATURE, KEY_ENCHIPHERMENT,
     * NON_REPUDIATION, and more.
     * </p>
     * 
     * @param keyUsages
     *        A list of Key Usage X.509 v3 extension objects. Each object is a string value that identifies the purpose
     *        of the public key contained in the certificate. Possible extension values include DIGITAL_SIGNATURE,
     *        KEY_ENCHIPHERMENT, NON_REPUDIATION, and more.
     * @see KeyUsageName
     */

    public void setKeyUsages(java.util.Collection<String> keyUsages) {
        if (keyUsages == null) {
            this.keyUsages = null;
            return;
        }

        this.keyUsages = new java.util.ArrayList<String>(keyUsages);
    }

    /**
     * <p>
     * A list of Key Usage X.509 v3 extension objects. Each object is a string value that identifies the purpose of the
     * public key contained in the certificate. Possible extension values include DIGITAL_SIGNATURE, KEY_ENCHIPHERMENT,
     * NON_REPUDIATION, and more.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeyUsages(java.util.Collection)} or {@link #withKeyUsages(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param keyUsages
     *        A list of Key Usage X.509 v3 extension objects. Each object is a string value that identifies the purpose
     *        of the public key contained in the certificate. Possible extension values include DIGITAL_SIGNATURE,
     *        KEY_ENCHIPHERMENT, NON_REPUDIATION, and more.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyUsageName
     */

    public CertificateSummary withKeyUsages(String... keyUsages) {
        if (this.keyUsages == null) {
            setKeyUsages(new java.util.ArrayList<String>(keyUsages.length));
        }
        for (String ele : keyUsages) {
            this.keyUsages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Key Usage X.509 v3 extension objects. Each object is a string value that identifies the purpose of the
     * public key contained in the certificate. Possible extension values include DIGITAL_SIGNATURE, KEY_ENCHIPHERMENT,
     * NON_REPUDIATION, and more.
     * </p>
     * 
     * @param keyUsages
     *        A list of Key Usage X.509 v3 extension objects. Each object is a string value that identifies the purpose
     *        of the public key contained in the certificate. Possible extension values include DIGITAL_SIGNATURE,
     *        KEY_ENCHIPHERMENT, NON_REPUDIATION, and more.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyUsageName
     */

    public CertificateSummary withKeyUsages(java.util.Collection<String> keyUsages) {
        setKeyUsages(keyUsages);
        return this;
    }

    /**
     * <p>
     * A list of Key Usage X.509 v3 extension objects. Each object is a string value that identifies the purpose of the
     * public key contained in the certificate. Possible extension values include DIGITAL_SIGNATURE, KEY_ENCHIPHERMENT,
     * NON_REPUDIATION, and more.
     * </p>
     * 
     * @param keyUsages
     *        A list of Key Usage X.509 v3 extension objects. Each object is a string value that identifies the purpose
     *        of the public key contained in the certificate. Possible extension values include DIGITAL_SIGNATURE,
     *        KEY_ENCHIPHERMENT, NON_REPUDIATION, and more.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyUsageName
     */

    public CertificateSummary withKeyUsages(KeyUsageName... keyUsages) {
        java.util.ArrayList<String> keyUsagesCopy = new java.util.ArrayList<String>(keyUsages.length);
        for (KeyUsageName value : keyUsages) {
            keyUsagesCopy.add(value.toString());
        }
        if (getKeyUsages() == null) {
            setKeyUsages(keyUsagesCopy);
        } else {
            getKeyUsages().addAll(keyUsagesCopy);
        }
        return this;
    }

    /**
     * <p>
     * Contains a list of Extended Key Usage X.509 v3 extension objects. Each object specifies a purpose for which the
     * certificate public key can be used and consists of a name and an object identifier (OID).
     * </p>
     * 
     * @return Contains a list of Extended Key Usage X.509 v3 extension objects. Each object specifies a purpose for
     *         which the certificate public key can be used and consists of a name and an object identifier (OID).
     * @see ExtendedKeyUsageName
     */

    public java.util.List<String> getExtendedKeyUsages() {
        return extendedKeyUsages;
    }

    /**
     * <p>
     * Contains a list of Extended Key Usage X.509 v3 extension objects. Each object specifies a purpose for which the
     * certificate public key can be used and consists of a name and an object identifier (OID).
     * </p>
     * 
     * @param extendedKeyUsages
     *        Contains a list of Extended Key Usage X.509 v3 extension objects. Each object specifies a purpose for
     *        which the certificate public key can be used and consists of a name and an object identifier (OID).
     * @see ExtendedKeyUsageName
     */

    public void setExtendedKeyUsages(java.util.Collection<String> extendedKeyUsages) {
        if (extendedKeyUsages == null) {
            this.extendedKeyUsages = null;
            return;
        }

        this.extendedKeyUsages = new java.util.ArrayList<String>(extendedKeyUsages);
    }

    /**
     * <p>
     * Contains a list of Extended Key Usage X.509 v3 extension objects. Each object specifies a purpose for which the
     * certificate public key can be used and consists of a name and an object identifier (OID).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExtendedKeyUsages(java.util.Collection)} or {@link #withExtendedKeyUsages(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param extendedKeyUsages
     *        Contains a list of Extended Key Usage X.509 v3 extension objects. Each object specifies a purpose for
     *        which the certificate public key can be used and consists of a name and an object identifier (OID).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExtendedKeyUsageName
     */

    public CertificateSummary withExtendedKeyUsages(String... extendedKeyUsages) {
        if (this.extendedKeyUsages == null) {
            setExtendedKeyUsages(new java.util.ArrayList<String>(extendedKeyUsages.length));
        }
        for (String ele : extendedKeyUsages) {
            this.extendedKeyUsages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains a list of Extended Key Usage X.509 v3 extension objects. Each object specifies a purpose for which the
     * certificate public key can be used and consists of a name and an object identifier (OID).
     * </p>
     * 
     * @param extendedKeyUsages
     *        Contains a list of Extended Key Usage X.509 v3 extension objects. Each object specifies a purpose for
     *        which the certificate public key can be used and consists of a name and an object identifier (OID).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExtendedKeyUsageName
     */

    public CertificateSummary withExtendedKeyUsages(java.util.Collection<String> extendedKeyUsages) {
        setExtendedKeyUsages(extendedKeyUsages);
        return this;
    }

    /**
     * <p>
     * Contains a list of Extended Key Usage X.509 v3 extension objects. Each object specifies a purpose for which the
     * certificate public key can be used and consists of a name and an object identifier (OID).
     * </p>
     * 
     * @param extendedKeyUsages
     *        Contains a list of Extended Key Usage X.509 v3 extension objects. Each object specifies a purpose for
     *        which the certificate public key can be used and consists of a name and an object identifier (OID).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExtendedKeyUsageName
     */

    public CertificateSummary withExtendedKeyUsages(ExtendedKeyUsageName... extendedKeyUsages) {
        java.util.ArrayList<String> extendedKeyUsagesCopy = new java.util.ArrayList<String>(extendedKeyUsages.length);
        for (ExtendedKeyUsageName value : extendedKeyUsages) {
            extendedKeyUsagesCopy.add(value.toString());
        }
        if (getExtendedKeyUsages() == null) {
            setExtendedKeyUsages(extendedKeyUsagesCopy);
        } else {
            getExtendedKeyUsages().addAll(extendedKeyUsagesCopy);
        }
        return this;
    }

    /**
     * <p>
     * Indicates whether the certificate is currently in use by any Amazon Web Services resources.
     * </p>
     * 
     * @param inUse
     *        Indicates whether the certificate is currently in use by any Amazon Web Services resources.
     */

    public void setInUse(Boolean inUse) {
        this.inUse = inUse;
    }

    /**
     * <p>
     * Indicates whether the certificate is currently in use by any Amazon Web Services resources.
     * </p>
     * 
     * @return Indicates whether the certificate is currently in use by any Amazon Web Services resources.
     */

    public Boolean getInUse() {
        return this.inUse;
    }

    /**
     * <p>
     * Indicates whether the certificate is currently in use by any Amazon Web Services resources.
     * </p>
     * 
     * @param inUse
     *        Indicates whether the certificate is currently in use by any Amazon Web Services resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateSummary withInUse(Boolean inUse) {
        setInUse(inUse);
        return this;
    }

    /**
     * <p>
     * Indicates whether the certificate is currently in use by any Amazon Web Services resources.
     * </p>
     * 
     * @return Indicates whether the certificate is currently in use by any Amazon Web Services resources.
     */

    public Boolean isInUse() {
        return this.inUse;
    }

    /**
     * <p>
     * Indicates whether the certificate has been exported. This value exists only when the certificate type is
     * <code>PRIVATE</code>.
     * </p>
     * 
     * @param exported
     *        Indicates whether the certificate has been exported. This value exists only when the certificate type is
     *        <code>PRIVATE</code>.
     */

    public void setExported(Boolean exported) {
        this.exported = exported;
    }

    /**
     * <p>
     * Indicates whether the certificate has been exported. This value exists only when the certificate type is
     * <code>PRIVATE</code>.
     * </p>
     * 
     * @return Indicates whether the certificate has been exported. This value exists only when the certificate type is
     *         <code>PRIVATE</code>.
     */

    public Boolean getExported() {
        return this.exported;
    }

    /**
     * <p>
     * Indicates whether the certificate has been exported. This value exists only when the certificate type is
     * <code>PRIVATE</code>.
     * </p>
     * 
     * @param exported
     *        Indicates whether the certificate has been exported. This value exists only when the certificate type is
     *        <code>PRIVATE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateSummary withExported(Boolean exported) {
        setExported(exported);
        return this;
    }

    /**
     * <p>
     * Indicates whether the certificate has been exported. This value exists only when the certificate type is
     * <code>PRIVATE</code>.
     * </p>
     * 
     * @return Indicates whether the certificate has been exported. This value exists only when the certificate type is
     *         <code>PRIVATE</code>.
     */

    public Boolean isExported() {
        return this.exported;
    }

    /**
     * <p>
     * Specifies whether the certificate is eligible for renewal. At this time, only exported private certificates can
     * be renewed with the <a>RenewCertificate</a> command.
     * </p>
     * 
     * @param renewalEligibility
     *        Specifies whether the certificate is eligible for renewal. At this time, only exported private
     *        certificates can be renewed with the <a>RenewCertificate</a> command.
     * @see RenewalEligibility
     */

    public void setRenewalEligibility(String renewalEligibility) {
        this.renewalEligibility = renewalEligibility;
    }

    /**
     * <p>
     * Specifies whether the certificate is eligible for renewal. At this time, only exported private certificates can
     * be renewed with the <a>RenewCertificate</a> command.
     * </p>
     * 
     * @return Specifies whether the certificate is eligible for renewal. At this time, only exported private
     *         certificates can be renewed with the <a>RenewCertificate</a> command.
     * @see RenewalEligibility
     */

    public String getRenewalEligibility() {
        return this.renewalEligibility;
    }

    /**
     * <p>
     * Specifies whether the certificate is eligible for renewal. At this time, only exported private certificates can
     * be renewed with the <a>RenewCertificate</a> command.
     * </p>
     * 
     * @param renewalEligibility
     *        Specifies whether the certificate is eligible for renewal. At this time, only exported private
     *        certificates can be renewed with the <a>RenewCertificate</a> command.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RenewalEligibility
     */

    public CertificateSummary withRenewalEligibility(String renewalEligibility) {
        setRenewalEligibility(renewalEligibility);
        return this;
    }

    /**
     * <p>
     * Specifies whether the certificate is eligible for renewal. At this time, only exported private certificates can
     * be renewed with the <a>RenewCertificate</a> command.
     * </p>
     * 
     * @param renewalEligibility
     *        Specifies whether the certificate is eligible for renewal. At this time, only exported private
     *        certificates can be renewed with the <a>RenewCertificate</a> command.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RenewalEligibility
     */

    public CertificateSummary withRenewalEligibility(RenewalEligibility renewalEligibility) {
        this.renewalEligibility = renewalEligibility.toString();
        return this;
    }

    /**
     * <p>
     * The time before which the certificate is not valid.
     * </p>
     * 
     * @param notBefore
     *        The time before which the certificate is not valid.
     */

    public void setNotBefore(java.util.Date notBefore) {
        this.notBefore = notBefore;
    }

    /**
     * <p>
     * The time before which the certificate is not valid.
     * </p>
     * 
     * @return The time before which the certificate is not valid.
     */

    public java.util.Date getNotBefore() {
        return this.notBefore;
    }

    /**
     * <p>
     * The time before which the certificate is not valid.
     * </p>
     * 
     * @param notBefore
     *        The time before which the certificate is not valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateSummary withNotBefore(java.util.Date notBefore) {
        setNotBefore(notBefore);
        return this;
    }

    /**
     * <p>
     * The time after which the certificate is not valid.
     * </p>
     * 
     * @param notAfter
     *        The time after which the certificate is not valid.
     */

    public void setNotAfter(java.util.Date notAfter) {
        this.notAfter = notAfter;
    }

    /**
     * <p>
     * The time after which the certificate is not valid.
     * </p>
     * 
     * @return The time after which the certificate is not valid.
     */

    public java.util.Date getNotAfter() {
        return this.notAfter;
    }

    /**
     * <p>
     * The time after which the certificate is not valid.
     * </p>
     * 
     * @param notAfter
     *        The time after which the certificate is not valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateSummary withNotAfter(java.util.Date notAfter) {
        setNotAfter(notAfter);
        return this;
    }

    /**
     * <p>
     * The time at which the certificate was requested.
     * </p>
     * 
     * @param createdAt
     *        The time at which the certificate was requested.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time at which the certificate was requested.
     * </p>
     * 
     * @return The time at which the certificate was requested.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time at which the certificate was requested.
     * </p>
     * 
     * @param createdAt
     *        The time at which the certificate was requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The time at which the certificate was issued. This value exists only when the certificate type is
     * <code>AMAZON_ISSUED</code>.
     * </p>
     * 
     * @param issuedAt
     *        The time at which the certificate was issued. This value exists only when the certificate type is
     *        <code>AMAZON_ISSUED</code>.
     */

    public void setIssuedAt(java.util.Date issuedAt) {
        this.issuedAt = issuedAt;
    }

    /**
     * <p>
     * The time at which the certificate was issued. This value exists only when the certificate type is
     * <code>AMAZON_ISSUED</code>.
     * </p>
     * 
     * @return The time at which the certificate was issued. This value exists only when the certificate type is
     *         <code>AMAZON_ISSUED</code>.
     */

    public java.util.Date getIssuedAt() {
        return this.issuedAt;
    }

    /**
     * <p>
     * The time at which the certificate was issued. This value exists only when the certificate type is
     * <code>AMAZON_ISSUED</code>.
     * </p>
     * 
     * @param issuedAt
     *        The time at which the certificate was issued. This value exists only when the certificate type is
     *        <code>AMAZON_ISSUED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateSummary withIssuedAt(java.util.Date issuedAt) {
        setIssuedAt(issuedAt);
        return this;
    }

    /**
     * <p>
     * The date and time when the certificate was imported. This value exists only when the certificate type is
     * <code>IMPORTED</code>.
     * </p>
     * 
     * @param importedAt
     *        The date and time when the certificate was imported. This value exists only when the certificate type is
     *        <code>IMPORTED</code>.
     */

    public void setImportedAt(java.util.Date importedAt) {
        this.importedAt = importedAt;
    }

    /**
     * <p>
     * The date and time when the certificate was imported. This value exists only when the certificate type is
     * <code>IMPORTED</code>.
     * </p>
     * 
     * @return The date and time when the certificate was imported. This value exists only when the certificate type is
     *         <code>IMPORTED</code>.
     */

    public java.util.Date getImportedAt() {
        return this.importedAt;
    }

    /**
     * <p>
     * The date and time when the certificate was imported. This value exists only when the certificate type is
     * <code>IMPORTED</code>.
     * </p>
     * 
     * @param importedAt
     *        The date and time when the certificate was imported. This value exists only when the certificate type is
     *        <code>IMPORTED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateSummary withImportedAt(java.util.Date importedAt) {
        setImportedAt(importedAt);
        return this;
    }

    /**
     * <p>
     * The time at which the certificate was revoked. This value exists only when the certificate status is
     * <code>REVOKED</code>.
     * </p>
     * 
     * @param revokedAt
     *        The time at which the certificate was revoked. This value exists only when the certificate status is
     *        <code>REVOKED</code>.
     */

    public void setRevokedAt(java.util.Date revokedAt) {
        this.revokedAt = revokedAt;
    }

    /**
     * <p>
     * The time at which the certificate was revoked. This value exists only when the certificate status is
     * <code>REVOKED</code>.
     * </p>
     * 
     * @return The time at which the certificate was revoked. This value exists only when the certificate status is
     *         <code>REVOKED</code>.
     */

    public java.util.Date getRevokedAt() {
        return this.revokedAt;
    }

    /**
     * <p>
     * The time at which the certificate was revoked. This value exists only when the certificate status is
     * <code>REVOKED</code>.
     * </p>
     * 
     * @param revokedAt
     *        The time at which the certificate was revoked. This value exists only when the certificate status is
     *        <code>REVOKED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateSummary withRevokedAt(java.util.Date revokedAt) {
        setRevokedAt(revokedAt);
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getSubjectAlternativeNameSummaries() != null)
            sb.append("SubjectAlternativeNameSummaries: ").append(getSubjectAlternativeNameSummaries()).append(",");
        if (getHasAdditionalSubjectAlternativeNames() != null)
            sb.append("HasAdditionalSubjectAlternativeNames: ").append(getHasAdditionalSubjectAlternativeNames()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getKeyAlgorithm() != null)
            sb.append("KeyAlgorithm: ").append(getKeyAlgorithm()).append(",");
        if (getKeyUsages() != null)
            sb.append("KeyUsages: ").append(getKeyUsages()).append(",");
        if (getExtendedKeyUsages() != null)
            sb.append("ExtendedKeyUsages: ").append(getExtendedKeyUsages()).append(",");
        if (getInUse() != null)
            sb.append("InUse: ").append(getInUse()).append(",");
        if (getExported() != null)
            sb.append("Exported: ").append(getExported()).append(",");
        if (getRenewalEligibility() != null)
            sb.append("RenewalEligibility: ").append(getRenewalEligibility()).append(",");
        if (getNotBefore() != null)
            sb.append("NotBefore: ").append(getNotBefore()).append(",");
        if (getNotAfter() != null)
            sb.append("NotAfter: ").append(getNotAfter()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getIssuedAt() != null)
            sb.append("IssuedAt: ").append(getIssuedAt()).append(",");
        if (getImportedAt() != null)
            sb.append("ImportedAt: ").append(getImportedAt()).append(",");
        if (getRevokedAt() != null)
            sb.append("RevokedAt: ").append(getRevokedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CertificateSummary == false)
            return false;
        CertificateSummary other = (CertificateSummary) obj;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getSubjectAlternativeNameSummaries() == null ^ this.getSubjectAlternativeNameSummaries() == null)
            return false;
        if (other.getSubjectAlternativeNameSummaries() != null
                && other.getSubjectAlternativeNameSummaries().equals(this.getSubjectAlternativeNameSummaries()) == false)
            return false;
        if (other.getHasAdditionalSubjectAlternativeNames() == null ^ this.getHasAdditionalSubjectAlternativeNames() == null)
            return false;
        if (other.getHasAdditionalSubjectAlternativeNames() != null
                && other.getHasAdditionalSubjectAlternativeNames().equals(this.getHasAdditionalSubjectAlternativeNames()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getKeyAlgorithm() == null ^ this.getKeyAlgorithm() == null)
            return false;
        if (other.getKeyAlgorithm() != null && other.getKeyAlgorithm().equals(this.getKeyAlgorithm()) == false)
            return false;
        if (other.getKeyUsages() == null ^ this.getKeyUsages() == null)
            return false;
        if (other.getKeyUsages() != null && other.getKeyUsages().equals(this.getKeyUsages()) == false)
            return false;
        if (other.getExtendedKeyUsages() == null ^ this.getExtendedKeyUsages() == null)
            return false;
        if (other.getExtendedKeyUsages() != null && other.getExtendedKeyUsages().equals(this.getExtendedKeyUsages()) == false)
            return false;
        if (other.getInUse() == null ^ this.getInUse() == null)
            return false;
        if (other.getInUse() != null && other.getInUse().equals(this.getInUse()) == false)
            return false;
        if (other.getExported() == null ^ this.getExported() == null)
            return false;
        if (other.getExported() != null && other.getExported().equals(this.getExported()) == false)
            return false;
        if (other.getRenewalEligibility() == null ^ this.getRenewalEligibility() == null)
            return false;
        if (other.getRenewalEligibility() != null && other.getRenewalEligibility().equals(this.getRenewalEligibility()) == false)
            return false;
        if (other.getNotBefore() == null ^ this.getNotBefore() == null)
            return false;
        if (other.getNotBefore() != null && other.getNotBefore().equals(this.getNotBefore()) == false)
            return false;
        if (other.getNotAfter() == null ^ this.getNotAfter() == null)
            return false;
        if (other.getNotAfter() != null && other.getNotAfter().equals(this.getNotAfter()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getIssuedAt() == null ^ this.getIssuedAt() == null)
            return false;
        if (other.getIssuedAt() != null && other.getIssuedAt().equals(this.getIssuedAt()) == false)
            return false;
        if (other.getImportedAt() == null ^ this.getImportedAt() == null)
            return false;
        if (other.getImportedAt() != null && other.getImportedAt().equals(this.getImportedAt()) == false)
            return false;
        if (other.getRevokedAt() == null ^ this.getRevokedAt() == null)
            return false;
        if (other.getRevokedAt() != null && other.getRevokedAt().equals(this.getRevokedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getSubjectAlternativeNameSummaries() == null) ? 0 : getSubjectAlternativeNameSummaries().hashCode());
        hashCode = prime * hashCode + ((getHasAdditionalSubjectAlternativeNames() == null) ? 0 : getHasAdditionalSubjectAlternativeNames().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getKeyAlgorithm() == null) ? 0 : getKeyAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getKeyUsages() == null) ? 0 : getKeyUsages().hashCode());
        hashCode = prime * hashCode + ((getExtendedKeyUsages() == null) ? 0 : getExtendedKeyUsages().hashCode());
        hashCode = prime * hashCode + ((getInUse() == null) ? 0 : getInUse().hashCode());
        hashCode = prime * hashCode + ((getExported() == null) ? 0 : getExported().hashCode());
        hashCode = prime * hashCode + ((getRenewalEligibility() == null) ? 0 : getRenewalEligibility().hashCode());
        hashCode = prime * hashCode + ((getNotBefore() == null) ? 0 : getNotBefore().hashCode());
        hashCode = prime * hashCode + ((getNotAfter() == null) ? 0 : getNotAfter().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getIssuedAt() == null) ? 0 : getIssuedAt().hashCode());
        hashCode = prime * hashCode + ((getImportedAt() == null) ? 0 : getImportedAt().hashCode());
        hashCode = prime * hashCode + ((getRevokedAt() == null) ? 0 : getRevokedAt().hashCode());
        return hashCode;
    }

    @Override
    public CertificateSummary clone() {
        try {
            return (CertificateSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.certificatemanager.model.transform.CertificateSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
