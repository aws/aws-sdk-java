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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains metadata about an ACM certificate. This structure is returned in the response to a
 * <a>DescribeCertificate</a> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/CertificateDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CertificateDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate. For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     */
    private String certificateArn;
    /**
     * <p>
     * The fully qualified domain name for the certificate, such as www.example.com or example.com.
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
     */
    private java.util.List<String> subjectAlternativeNames;
    /**
     * <p>
     * Contains information about the initial validation of each domain name that occurs as a result of the
     * <a>RequestCertificate</a> request. This field exists only when the certificate type is <code>AMAZON_ISSUED</code>
     * .
     * </p>
     */
    private java.util.List<DomainValidation> domainValidationOptions;
    /**
     * <p>
     * The serial number of the certificate.
     * </p>
     */
    private String serial;
    /**
     * <p>
     * The name of the entity that is associated with the public key contained in the certificate.
     * </p>
     */
    private String subject;
    /**
     * <p>
     * The name of the certificate authority that issued and signed the certificate.
     * </p>
     */
    private String issuer;
    /**
     * <p>
     * The time at which the certificate was requested. This value exists only when the certificate type is
     * <code>AMAZON_ISSUED</code>.
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
     * The date and time at which the certificate was imported. This value exists only when the certificate type is
     * <code>IMPORTED</code>.
     * </p>
     */
    private java.util.Date importedAt;
    /**
     * <p>
     * The status of the certificate.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The time at which the certificate was revoked. This value exists only when the certificate status is
     * <code>REVOKED</code>.
     * </p>
     */
    private java.util.Date revokedAt;
    /**
     * <p>
     * The reason the certificate was revoked. This value exists only when the certificate status is
     * <code>REVOKED</code>.
     * </p>
     */
    private String revocationReason;
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
     * The algorithm that was used to generate the public-private key pair.
     * </p>
     */
    private String keyAlgorithm;
    /**
     * <p>
     * The algorithm that was used to sign the certificate.
     * </p>
     */
    private String signatureAlgorithm;
    /**
     * <p>
     * A list of ARNs for the AWS resources that are using the certificate. A certificate can be used by multiple AWS
     * resources.
     * </p>
     */
    private java.util.List<String> inUseBy;
    /**
     * <p>
     * The reason the certificate request failed. This value exists only when the certificate status is
     * <code>FAILED</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/troubleshooting.html#troubleshooting-failed">Certificate
     * Request Failed</a> in the <i>AWS Certificate Manager User Guide</i>.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The source of the certificate. For certificates provided by ACM, this value is <code>AMAZON_ISSUED</code>. For
     * certificates that you imported with <a>ImportCertificate</a>, this value is <code>IMPORTED</code>. ACM does not
     * provide <a href="https://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed renewal</a> for
     * imported certificates. For more information about the differences between certificates that you import and those
     * that ACM provides, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing Certificates</a> in the
     * <i>AWS Certificate Manager User Guide</i>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Contains information about the status of ACM's <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed renewal</a> for the certificate.
     * This field exists only when the certificate type is <code>AMAZON_ISSUED</code>.
     * </p>
     */
    private RenewalSummary renewalSummary;
    /**
     * <p>
     * A list of Key Usage X.509 v3 extension objects. Each object is a string value that identifies the purpose of the
     * public key contained in the certificate. Possible extension values include DIGITAL_SIGNATURE, KEY_ENCHIPHERMENT,
     * NON_REPUDIATION, and more.
     * </p>
     */
    private java.util.List<KeyUsage> keyUsages;
    /**
     * <p>
     * Contains a list of Extended Key Usage X.509 v3 extension objects. Each object specifies a purpose for which the
     * certificate public key can be used and consists of a name and an object identifier (OID).
     * </p>
     */
    private java.util.List<ExtendedKeyUsage> extendedKeyUsages;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ACM PCA private certificate authority (CA) that issued the certificate.
     * This has the following format:
     * </p>
     * <p>
     * <code>arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012</code>
     * </p>
     */
    private String certificateAuthorityArn;
    /**
     * <p>
     * Specifies whether the certificate is eligible for renewal. At this time, only exported private certificates can
     * be renewed with the <a>RenewCertificate</a> command.
     * </p>
     */
    private String renewalEligibility;
    /**
     * <p>
     * Value that specifies whether to add the certificate to a transparency log. Certificate transparency makes it
     * possible to detect SSL certificates that have been mistakenly or maliciously issued. A browser might respond to
     * certificate that has not been logged by showing an error message. The logs are cryptographically secure.
     * </p>
     */
    private CertificateOptions options;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate. For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param certificateArn
     *        The Amazon Resource Name (ARN) of the certificate. For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate. For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the certificate. For more information about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate. For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs)
     * and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param certificateArn
     *        The Amazon Resource Name (ARN) of the certificate. For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a> in the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateDetail withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
        return this;
    }

    /**
     * <p>
     * The fully qualified domain name for the certificate, such as www.example.com or example.com.
     * </p>
     * 
     * @param domainName
     *        The fully qualified domain name for the certificate, such as www.example.com or example.com.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The fully qualified domain name for the certificate, such as www.example.com or example.com.
     * </p>
     * 
     * @return The fully qualified domain name for the certificate, such as www.example.com or example.com.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The fully qualified domain name for the certificate, such as www.example.com or example.com.
     * </p>
     * 
     * @param domainName
     *        The fully qualified domain name for the certificate, such as www.example.com or example.com.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateDetail withDomainName(String domainName) {
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
     * 
     * @return One or more domain names (subject alternative names) included in the certificate. This list contains the
     *         domain names that are bound to the public key that is contained in the certificate. The subject
     *         alternative names include the canonical domain name (CN) of the certificate and additional domain names
     *         that can be used to connect to the website.
     */

    public java.util.List<String> getSubjectAlternativeNames() {
        return subjectAlternativeNames;
    }

    /**
     * <p>
     * One or more domain names (subject alternative names) included in the certificate. This list contains the domain
     * names that are bound to the public key that is contained in the certificate. The subject alternative names
     * include the canonical domain name (CN) of the certificate and additional domain names that can be used to connect
     * to the website.
     * </p>
     * 
     * @param subjectAlternativeNames
     *        One or more domain names (subject alternative names) included in the certificate. This list contains the
     *        domain names that are bound to the public key that is contained in the certificate. The subject
     *        alternative names include the canonical domain name (CN) of the certificate and additional domain names
     *        that can be used to connect to the website.
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
     * One or more domain names (subject alternative names) included in the certificate. This list contains the domain
     * names that are bound to the public key that is contained in the certificate. The subject alternative names
     * include the canonical domain name (CN) of the certificate and additional domain names that can be used to connect
     * to the website.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubjectAlternativeNames(java.util.Collection)} or
     * {@link #withSubjectAlternativeNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param subjectAlternativeNames
     *        One or more domain names (subject alternative names) included in the certificate. This list contains the
     *        domain names that are bound to the public key that is contained in the certificate. The subject
     *        alternative names include the canonical domain name (CN) of the certificate and additional domain names
     *        that can be used to connect to the website.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateDetail withSubjectAlternativeNames(String... subjectAlternativeNames) {
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
     * One or more domain names (subject alternative names) included in the certificate. This list contains the domain
     * names that are bound to the public key that is contained in the certificate. The subject alternative names
     * include the canonical domain name (CN) of the certificate and additional domain names that can be used to connect
     * to the website.
     * </p>
     * 
     * @param subjectAlternativeNames
     *        One or more domain names (subject alternative names) included in the certificate. This list contains the
     *        domain names that are bound to the public key that is contained in the certificate. The subject
     *        alternative names include the canonical domain name (CN) of the certificate and additional domain names
     *        that can be used to connect to the website.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateDetail withSubjectAlternativeNames(java.util.Collection<String> subjectAlternativeNames) {
        setSubjectAlternativeNames(subjectAlternativeNames);
        return this;
    }

    /**
     * <p>
     * Contains information about the initial validation of each domain name that occurs as a result of the
     * <a>RequestCertificate</a> request. This field exists only when the certificate type is <code>AMAZON_ISSUED</code>
     * .
     * </p>
     * 
     * @return Contains information about the initial validation of each domain name that occurs as a result of the
     *         <a>RequestCertificate</a> request. This field exists only when the certificate type is
     *         <code>AMAZON_ISSUED</code>.
     */

    public java.util.List<DomainValidation> getDomainValidationOptions() {
        return domainValidationOptions;
    }

    /**
     * <p>
     * Contains information about the initial validation of each domain name that occurs as a result of the
     * <a>RequestCertificate</a> request. This field exists only when the certificate type is <code>AMAZON_ISSUED</code>
     * .
     * </p>
     * 
     * @param domainValidationOptions
     *        Contains information about the initial validation of each domain name that occurs as a result of the
     *        <a>RequestCertificate</a> request. This field exists only when the certificate type is
     *        <code>AMAZON_ISSUED</code>.
     */

    public void setDomainValidationOptions(java.util.Collection<DomainValidation> domainValidationOptions) {
        if (domainValidationOptions == null) {
            this.domainValidationOptions = null;
            return;
        }

        this.domainValidationOptions = new java.util.ArrayList<DomainValidation>(domainValidationOptions);
    }

    /**
     * <p>
     * Contains information about the initial validation of each domain name that occurs as a result of the
     * <a>RequestCertificate</a> request. This field exists only when the certificate type is <code>AMAZON_ISSUED</code>
     * .
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDomainValidationOptions(java.util.Collection)} or
     * {@link #withDomainValidationOptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param domainValidationOptions
     *        Contains information about the initial validation of each domain name that occurs as a result of the
     *        <a>RequestCertificate</a> request. This field exists only when the certificate type is
     *        <code>AMAZON_ISSUED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateDetail withDomainValidationOptions(DomainValidation... domainValidationOptions) {
        if (this.domainValidationOptions == null) {
            setDomainValidationOptions(new java.util.ArrayList<DomainValidation>(domainValidationOptions.length));
        }
        for (DomainValidation ele : domainValidationOptions) {
            this.domainValidationOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains information about the initial validation of each domain name that occurs as a result of the
     * <a>RequestCertificate</a> request. This field exists only when the certificate type is <code>AMAZON_ISSUED</code>
     * .
     * </p>
     * 
     * @param domainValidationOptions
     *        Contains information about the initial validation of each domain name that occurs as a result of the
     *        <a>RequestCertificate</a> request. This field exists only when the certificate type is
     *        <code>AMAZON_ISSUED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateDetail withDomainValidationOptions(java.util.Collection<DomainValidation> domainValidationOptions) {
        setDomainValidationOptions(domainValidationOptions);
        return this;
    }

    /**
     * <p>
     * The serial number of the certificate.
     * </p>
     * 
     * @param serial
     *        The serial number of the certificate.
     */

    public void setSerial(String serial) {
        this.serial = serial;
    }

    /**
     * <p>
     * The serial number of the certificate.
     * </p>
     * 
     * @return The serial number of the certificate.
     */

    public String getSerial() {
        return this.serial;
    }

    /**
     * <p>
     * The serial number of the certificate.
     * </p>
     * 
     * @param serial
     *        The serial number of the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateDetail withSerial(String serial) {
        setSerial(serial);
        return this;
    }

    /**
     * <p>
     * The name of the entity that is associated with the public key contained in the certificate.
     * </p>
     * 
     * @param subject
     *        The name of the entity that is associated with the public key contained in the certificate.
     */

    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * <p>
     * The name of the entity that is associated with the public key contained in the certificate.
     * </p>
     * 
     * @return The name of the entity that is associated with the public key contained in the certificate.
     */

    public String getSubject() {
        return this.subject;
    }

    /**
     * <p>
     * The name of the entity that is associated with the public key contained in the certificate.
     * </p>
     * 
     * @param subject
     *        The name of the entity that is associated with the public key contained in the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateDetail withSubject(String subject) {
        setSubject(subject);
        return this;
    }

    /**
     * <p>
     * The name of the certificate authority that issued and signed the certificate.
     * </p>
     * 
     * @param issuer
     *        The name of the certificate authority that issued and signed the certificate.
     */

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    /**
     * <p>
     * The name of the certificate authority that issued and signed the certificate.
     * </p>
     * 
     * @return The name of the certificate authority that issued and signed the certificate.
     */

    public String getIssuer() {
        return this.issuer;
    }

    /**
     * <p>
     * The name of the certificate authority that issued and signed the certificate.
     * </p>
     * 
     * @param issuer
     *        The name of the certificate authority that issued and signed the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateDetail withIssuer(String issuer) {
        setIssuer(issuer);
        return this;
    }

    /**
     * <p>
     * The time at which the certificate was requested. This value exists only when the certificate type is
     * <code>AMAZON_ISSUED</code>.
     * </p>
     * 
     * @param createdAt
     *        The time at which the certificate was requested. This value exists only when the certificate type is
     *        <code>AMAZON_ISSUED</code>.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time at which the certificate was requested. This value exists only when the certificate type is
     * <code>AMAZON_ISSUED</code>.
     * </p>
     * 
     * @return The time at which the certificate was requested. This value exists only when the certificate type is
     *         <code>AMAZON_ISSUED</code>.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time at which the certificate was requested. This value exists only when the certificate type is
     * <code>AMAZON_ISSUED</code>.
     * </p>
     * 
     * @param createdAt
     *        The time at which the certificate was requested. This value exists only when the certificate type is
     *        <code>AMAZON_ISSUED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateDetail withCreatedAt(java.util.Date createdAt) {
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

    public CertificateDetail withIssuedAt(java.util.Date issuedAt) {
        setIssuedAt(issuedAt);
        return this;
    }

    /**
     * <p>
     * The date and time at which the certificate was imported. This value exists only when the certificate type is
     * <code>IMPORTED</code>.
     * </p>
     * 
     * @param importedAt
     *        The date and time at which the certificate was imported. This value exists only when the certificate type
     *        is <code>IMPORTED</code>.
     */

    public void setImportedAt(java.util.Date importedAt) {
        this.importedAt = importedAt;
    }

    /**
     * <p>
     * The date and time at which the certificate was imported. This value exists only when the certificate type is
     * <code>IMPORTED</code>.
     * </p>
     * 
     * @return The date and time at which the certificate was imported. This value exists only when the certificate type
     *         is <code>IMPORTED</code>.
     */

    public java.util.Date getImportedAt() {
        return this.importedAt;
    }

    /**
     * <p>
     * The date and time at which the certificate was imported. This value exists only when the certificate type is
     * <code>IMPORTED</code>.
     * </p>
     * 
     * @param importedAt
     *        The date and time at which the certificate was imported. This value exists only when the certificate type
     *        is <code>IMPORTED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateDetail withImportedAt(java.util.Date importedAt) {
        setImportedAt(importedAt);
        return this;
    }

    /**
     * <p>
     * The status of the certificate.
     * </p>
     * 
     * @param status
     *        The status of the certificate.
     * @see CertificateStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the certificate.
     * </p>
     * 
     * @return The status of the certificate.
     * @see CertificateStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the certificate.
     * </p>
     * 
     * @param status
     *        The status of the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateStatus
     */

    public CertificateDetail withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the certificate.
     * </p>
     * 
     * @param status
     *        The status of the certificate.
     * @see CertificateStatus
     */

    public void setStatus(CertificateStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the certificate.
     * </p>
     * 
     * @param status
     *        The status of the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateStatus
     */

    public CertificateDetail withStatus(CertificateStatus status) {
        this.status = status.toString();
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

    public CertificateDetail withRevokedAt(java.util.Date revokedAt) {
        setRevokedAt(revokedAt);
        return this;
    }

    /**
     * <p>
     * The reason the certificate was revoked. This value exists only when the certificate status is
     * <code>REVOKED</code>.
     * </p>
     * 
     * @param revocationReason
     *        The reason the certificate was revoked. This value exists only when the certificate status is
     *        <code>REVOKED</code>.
     * @see RevocationReason
     */

    public void setRevocationReason(String revocationReason) {
        this.revocationReason = revocationReason;
    }

    /**
     * <p>
     * The reason the certificate was revoked. This value exists only when the certificate status is
     * <code>REVOKED</code>.
     * </p>
     * 
     * @return The reason the certificate was revoked. This value exists only when the certificate status is
     *         <code>REVOKED</code>.
     * @see RevocationReason
     */

    public String getRevocationReason() {
        return this.revocationReason;
    }

    /**
     * <p>
     * The reason the certificate was revoked. This value exists only when the certificate status is
     * <code>REVOKED</code>.
     * </p>
     * 
     * @param revocationReason
     *        The reason the certificate was revoked. This value exists only when the certificate status is
     *        <code>REVOKED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RevocationReason
     */

    public CertificateDetail withRevocationReason(String revocationReason) {
        setRevocationReason(revocationReason);
        return this;
    }

    /**
     * <p>
     * The reason the certificate was revoked. This value exists only when the certificate status is
     * <code>REVOKED</code>.
     * </p>
     * 
     * @param revocationReason
     *        The reason the certificate was revoked. This value exists only when the certificate status is
     *        <code>REVOKED</code>.
     * @see RevocationReason
     */

    public void setRevocationReason(RevocationReason revocationReason) {
        withRevocationReason(revocationReason);
    }

    /**
     * <p>
     * The reason the certificate was revoked. This value exists only when the certificate status is
     * <code>REVOKED</code>.
     * </p>
     * 
     * @param revocationReason
     *        The reason the certificate was revoked. This value exists only when the certificate status is
     *        <code>REVOKED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RevocationReason
     */

    public CertificateDetail withRevocationReason(RevocationReason revocationReason) {
        this.revocationReason = revocationReason.toString();
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

    public CertificateDetail withNotBefore(java.util.Date notBefore) {
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

    public CertificateDetail withNotAfter(java.util.Date notAfter) {
        setNotAfter(notAfter);
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

    public CertificateDetail withKeyAlgorithm(String keyAlgorithm) {
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
     * @see KeyAlgorithm
     */

    public void setKeyAlgorithm(KeyAlgorithm keyAlgorithm) {
        withKeyAlgorithm(keyAlgorithm);
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

    public CertificateDetail withKeyAlgorithm(KeyAlgorithm keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm.toString();
        return this;
    }

    /**
     * <p>
     * The algorithm that was used to sign the certificate.
     * </p>
     * 
     * @param signatureAlgorithm
     *        The algorithm that was used to sign the certificate.
     */

    public void setSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
    }

    /**
     * <p>
     * The algorithm that was used to sign the certificate.
     * </p>
     * 
     * @return The algorithm that was used to sign the certificate.
     */

    public String getSignatureAlgorithm() {
        return this.signatureAlgorithm;
    }

    /**
     * <p>
     * The algorithm that was used to sign the certificate.
     * </p>
     * 
     * @param signatureAlgorithm
     *        The algorithm that was used to sign the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateDetail withSignatureAlgorithm(String signatureAlgorithm) {
        setSignatureAlgorithm(signatureAlgorithm);
        return this;
    }

    /**
     * <p>
     * A list of ARNs for the AWS resources that are using the certificate. A certificate can be used by multiple AWS
     * resources.
     * </p>
     * 
     * @return A list of ARNs for the AWS resources that are using the certificate. A certificate can be used by
     *         multiple AWS resources.
     */

    public java.util.List<String> getInUseBy() {
        return inUseBy;
    }

    /**
     * <p>
     * A list of ARNs for the AWS resources that are using the certificate. A certificate can be used by multiple AWS
     * resources.
     * </p>
     * 
     * @param inUseBy
     *        A list of ARNs for the AWS resources that are using the certificate. A certificate can be used by multiple
     *        AWS resources.
     */

    public void setInUseBy(java.util.Collection<String> inUseBy) {
        if (inUseBy == null) {
            this.inUseBy = null;
            return;
        }

        this.inUseBy = new java.util.ArrayList<String>(inUseBy);
    }

    /**
     * <p>
     * A list of ARNs for the AWS resources that are using the certificate. A certificate can be used by multiple AWS
     * resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInUseBy(java.util.Collection)} or {@link #withInUseBy(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param inUseBy
     *        A list of ARNs for the AWS resources that are using the certificate. A certificate can be used by multiple
     *        AWS resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateDetail withInUseBy(String... inUseBy) {
        if (this.inUseBy == null) {
            setInUseBy(new java.util.ArrayList<String>(inUseBy.length));
        }
        for (String ele : inUseBy) {
            this.inUseBy.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of ARNs for the AWS resources that are using the certificate. A certificate can be used by multiple AWS
     * resources.
     * </p>
     * 
     * @param inUseBy
     *        A list of ARNs for the AWS resources that are using the certificate. A certificate can be used by multiple
     *        AWS resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateDetail withInUseBy(java.util.Collection<String> inUseBy) {
        setInUseBy(inUseBy);
        return this;
    }

    /**
     * <p>
     * The reason the certificate request failed. This value exists only when the certificate status is
     * <code>FAILED</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/troubleshooting.html#troubleshooting-failed">Certificate
     * Request Failed</a> in the <i>AWS Certificate Manager User Guide</i>.
     * </p>
     * 
     * @param failureReason
     *        The reason the certificate request failed. This value exists only when the certificate status is
     *        <code>FAILED</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/troubleshooting.html#troubleshooting-failed"
     *        >Certificate Request Failed</a> in the <i>AWS Certificate Manager User Guide</i>.
     * @see FailureReason
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The reason the certificate request failed. This value exists only when the certificate status is
     * <code>FAILED</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/troubleshooting.html#troubleshooting-failed">Certificate
     * Request Failed</a> in the <i>AWS Certificate Manager User Guide</i>.
     * </p>
     * 
     * @return The reason the certificate request failed. This value exists only when the certificate status is
     *         <code>FAILED</code>. For more information, see <a
     *         href="https://docs.aws.amazon.com/acm/latest/userguide/troubleshooting.html#troubleshooting-failed"
     *         >Certificate Request Failed</a> in the <i>AWS Certificate Manager User Guide</i>.
     * @see FailureReason
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The reason the certificate request failed. This value exists only when the certificate status is
     * <code>FAILED</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/troubleshooting.html#troubleshooting-failed">Certificate
     * Request Failed</a> in the <i>AWS Certificate Manager User Guide</i>.
     * </p>
     * 
     * @param failureReason
     *        The reason the certificate request failed. This value exists only when the certificate status is
     *        <code>FAILED</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/troubleshooting.html#troubleshooting-failed"
     *        >Certificate Request Failed</a> in the <i>AWS Certificate Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FailureReason
     */

    public CertificateDetail withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The reason the certificate request failed. This value exists only when the certificate status is
     * <code>FAILED</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/troubleshooting.html#troubleshooting-failed">Certificate
     * Request Failed</a> in the <i>AWS Certificate Manager User Guide</i>.
     * </p>
     * 
     * @param failureReason
     *        The reason the certificate request failed. This value exists only when the certificate status is
     *        <code>FAILED</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/troubleshooting.html#troubleshooting-failed"
     *        >Certificate Request Failed</a> in the <i>AWS Certificate Manager User Guide</i>.
     * @see FailureReason
     */

    public void setFailureReason(FailureReason failureReason) {
        withFailureReason(failureReason);
    }

    /**
     * <p>
     * The reason the certificate request failed. This value exists only when the certificate status is
     * <code>FAILED</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/troubleshooting.html#troubleshooting-failed">Certificate
     * Request Failed</a> in the <i>AWS Certificate Manager User Guide</i>.
     * </p>
     * 
     * @param failureReason
     *        The reason the certificate request failed. This value exists only when the certificate status is
     *        <code>FAILED</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/troubleshooting.html#troubleshooting-failed"
     *        >Certificate Request Failed</a> in the <i>AWS Certificate Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FailureReason
     */

    public CertificateDetail withFailureReason(FailureReason failureReason) {
        this.failureReason = failureReason.toString();
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
     * <i>AWS Certificate Manager User Guide</i>.
     * </p>
     * 
     * @param type
     *        The source of the certificate. For certificates provided by ACM, this value is <code>AMAZON_ISSUED</code>.
     *        For certificates that you imported with <a>ImportCertificate</a>, this value is <code>IMPORTED</code>. ACM
     *        does not provide <a href="https://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed
     *        renewal</a> for imported certificates. For more information about the differences between certificates
     *        that you import and those that ACM provides, see <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing Certificates</a>
     *        in the <i>AWS Certificate Manager User Guide</i>.
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
     * <i>AWS Certificate Manager User Guide</i>.
     * </p>
     * 
     * @return The source of the certificate. For certificates provided by ACM, this value is <code>AMAZON_ISSUED</code>
     *         . For certificates that you imported with <a>ImportCertificate</a>, this value is <code>IMPORTED</code>.
     *         ACM does not provide <a href="https://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed
     *         renewal</a> for imported certificates. For more information about the differences between certificates
     *         that you import and those that ACM provides, see <a
     *         href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing
     *         Certificates</a> in the <i>AWS Certificate Manager User Guide</i>.
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
     * <i>AWS Certificate Manager User Guide</i>.
     * </p>
     * 
     * @param type
     *        The source of the certificate. For certificates provided by ACM, this value is <code>AMAZON_ISSUED</code>.
     *        For certificates that you imported with <a>ImportCertificate</a>, this value is <code>IMPORTED</code>. ACM
     *        does not provide <a href="https://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed
     *        renewal</a> for imported certificates. For more information about the differences between certificates
     *        that you import and those that ACM provides, see <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing Certificates</a>
     *        in the <i>AWS Certificate Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateType
     */

    public CertificateDetail withType(String type) {
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
     * <i>AWS Certificate Manager User Guide</i>.
     * </p>
     * 
     * @param type
     *        The source of the certificate. For certificates provided by ACM, this value is <code>AMAZON_ISSUED</code>.
     *        For certificates that you imported with <a>ImportCertificate</a>, this value is <code>IMPORTED</code>. ACM
     *        does not provide <a href="https://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed
     *        renewal</a> for imported certificates. For more information about the differences between certificates
     *        that you import and those that ACM provides, see <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing Certificates</a>
     *        in the <i>AWS Certificate Manager User Guide</i>.
     * @see CertificateType
     */

    public void setType(CertificateType type) {
        withType(type);
    }

    /**
     * <p>
     * The source of the certificate. For certificates provided by ACM, this value is <code>AMAZON_ISSUED</code>. For
     * certificates that you imported with <a>ImportCertificate</a>, this value is <code>IMPORTED</code>. ACM does not
     * provide <a href="https://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed renewal</a> for
     * imported certificates. For more information about the differences between certificates that you import and those
     * that ACM provides, see <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing Certificates</a> in the
     * <i>AWS Certificate Manager User Guide</i>.
     * </p>
     * 
     * @param type
     *        The source of the certificate. For certificates provided by ACM, this value is <code>AMAZON_ISSUED</code>.
     *        For certificates that you imported with <a>ImportCertificate</a>, this value is <code>IMPORTED</code>. ACM
     *        does not provide <a href="https://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed
     *        renewal</a> for imported certificates. For more information about the differences between certificates
     *        that you import and those that ACM provides, see <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html">Importing Certificates</a>
     *        in the <i>AWS Certificate Manager User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateType
     */

    public CertificateDetail withType(CertificateType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Contains information about the status of ACM's <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed renewal</a> for the certificate.
     * This field exists only when the certificate type is <code>AMAZON_ISSUED</code>.
     * </p>
     * 
     * @param renewalSummary
     *        Contains information about the status of ACM's <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed renewal</a> for the
     *        certificate. This field exists only when the certificate type is <code>AMAZON_ISSUED</code>.
     */

    public void setRenewalSummary(RenewalSummary renewalSummary) {
        this.renewalSummary = renewalSummary;
    }

    /**
     * <p>
     * Contains information about the status of ACM's <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed renewal</a> for the certificate.
     * This field exists only when the certificate type is <code>AMAZON_ISSUED</code>.
     * </p>
     * 
     * @return Contains information about the status of ACM's <a
     *         href="https://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed renewal</a> for the
     *         certificate. This field exists only when the certificate type is <code>AMAZON_ISSUED</code>.
     */

    public RenewalSummary getRenewalSummary() {
        return this.renewalSummary;
    }

    /**
     * <p>
     * Contains information about the status of ACM's <a
     * href="https://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed renewal</a> for the certificate.
     * This field exists only when the certificate type is <code>AMAZON_ISSUED</code>.
     * </p>
     * 
     * @param renewalSummary
     *        Contains information about the status of ACM's <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/acm-renewal.html">managed renewal</a> for the
     *        certificate. This field exists only when the certificate type is <code>AMAZON_ISSUED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateDetail withRenewalSummary(RenewalSummary renewalSummary) {
        setRenewalSummary(renewalSummary);
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
     */

    public java.util.List<KeyUsage> getKeyUsages() {
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
     */

    public void setKeyUsages(java.util.Collection<KeyUsage> keyUsages) {
        if (keyUsages == null) {
            this.keyUsages = null;
            return;
        }

        this.keyUsages = new java.util.ArrayList<KeyUsage>(keyUsages);
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
     */

    public CertificateDetail withKeyUsages(KeyUsage... keyUsages) {
        if (this.keyUsages == null) {
            setKeyUsages(new java.util.ArrayList<KeyUsage>(keyUsages.length));
        }
        for (KeyUsage ele : keyUsages) {
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
     */

    public CertificateDetail withKeyUsages(java.util.Collection<KeyUsage> keyUsages) {
        setKeyUsages(keyUsages);
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
     */

    public java.util.List<ExtendedKeyUsage> getExtendedKeyUsages() {
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
     */

    public void setExtendedKeyUsages(java.util.Collection<ExtendedKeyUsage> extendedKeyUsages) {
        if (extendedKeyUsages == null) {
            this.extendedKeyUsages = null;
            return;
        }

        this.extendedKeyUsages = new java.util.ArrayList<ExtendedKeyUsage>(extendedKeyUsages);
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
     */

    public CertificateDetail withExtendedKeyUsages(ExtendedKeyUsage... extendedKeyUsages) {
        if (this.extendedKeyUsages == null) {
            setExtendedKeyUsages(new java.util.ArrayList<ExtendedKeyUsage>(extendedKeyUsages.length));
        }
        for (ExtendedKeyUsage ele : extendedKeyUsages) {
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
     */

    public CertificateDetail withExtendedKeyUsages(java.util.Collection<ExtendedKeyUsage> extendedKeyUsages) {
        setExtendedKeyUsages(extendedKeyUsages);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ACM PCA private certificate authority (CA) that issued the certificate.
     * This has the following format:
     * </p>
     * <p>
     * <code>arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * 
     * @param certificateAuthorityArn
     *        The Amazon Resource Name (ARN) of the ACM PCA private certificate authority (CA) that issued the
     *        certificate. This has the following format: </p>
     *        <p>
     *        <code>arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012</code>
     */

    public void setCertificateAuthorityArn(String certificateAuthorityArn) {
        this.certificateAuthorityArn = certificateAuthorityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ACM PCA private certificate authority (CA) that issued the certificate.
     * This has the following format:
     * </p>
     * <p>
     * <code>arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the ACM PCA private certificate authority (CA) that issued the
     *         certificate. This has the following format: </p>
     *         <p>
     *         <code>arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012</code>
     */

    public String getCertificateAuthorityArn() {
        return this.certificateAuthorityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the ACM PCA private certificate authority (CA) that issued the certificate.
     * This has the following format:
     * </p>
     * <p>
     * <code>arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * 
     * @param certificateAuthorityArn
     *        The Amazon Resource Name (ARN) of the ACM PCA private certificate authority (CA) that issued the
     *        certificate. This has the following format: </p>
     *        <p>
     *        <code>arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateDetail withCertificateAuthorityArn(String certificateAuthorityArn) {
        setCertificateAuthorityArn(certificateAuthorityArn);
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

    public CertificateDetail withRenewalEligibility(String renewalEligibility) {
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
     * @see RenewalEligibility
     */

    public void setRenewalEligibility(RenewalEligibility renewalEligibility) {
        withRenewalEligibility(renewalEligibility);
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

    public CertificateDetail withRenewalEligibility(RenewalEligibility renewalEligibility) {
        this.renewalEligibility = renewalEligibility.toString();
        return this;
    }

    /**
     * <p>
     * Value that specifies whether to add the certificate to a transparency log. Certificate transparency makes it
     * possible to detect SSL certificates that have been mistakenly or maliciously issued. A browser might respond to
     * certificate that has not been logged by showing an error message. The logs are cryptographically secure.
     * </p>
     * 
     * @param options
     *        Value that specifies whether to add the certificate to a transparency log. Certificate transparency makes
     *        it possible to detect SSL certificates that have been mistakenly or maliciously issued. A browser might
     *        respond to certificate that has not been logged by showing an error message. The logs are
     *        cryptographically secure.
     */

    public void setOptions(CertificateOptions options) {
        this.options = options;
    }

    /**
     * <p>
     * Value that specifies whether to add the certificate to a transparency log. Certificate transparency makes it
     * possible to detect SSL certificates that have been mistakenly or maliciously issued. A browser might respond to
     * certificate that has not been logged by showing an error message. The logs are cryptographically secure.
     * </p>
     * 
     * @return Value that specifies whether to add the certificate to a transparency log. Certificate transparency makes
     *         it possible to detect SSL certificates that have been mistakenly or maliciously issued. A browser might
     *         respond to certificate that has not been logged by showing an error message. The logs are
     *         cryptographically secure.
     */

    public CertificateOptions getOptions() {
        return this.options;
    }

    /**
     * <p>
     * Value that specifies whether to add the certificate to a transparency log. Certificate transparency makes it
     * possible to detect SSL certificates that have been mistakenly or maliciously issued. A browser might respond to
     * certificate that has not been logged by showing an error message. The logs are cryptographically secure.
     * </p>
     * 
     * @param options
     *        Value that specifies whether to add the certificate to a transparency log. Certificate transparency makes
     *        it possible to detect SSL certificates that have been mistakenly or maliciously issued. A browser might
     *        respond to certificate that has not been logged by showing an error message. The logs are
     *        cryptographically secure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CertificateDetail withOptions(CertificateOptions options) {
        setOptions(options);
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
        if (getSubjectAlternativeNames() != null)
            sb.append("SubjectAlternativeNames: ").append(getSubjectAlternativeNames()).append(",");
        if (getDomainValidationOptions() != null)
            sb.append("DomainValidationOptions: ").append(getDomainValidationOptions()).append(",");
        if (getSerial() != null)
            sb.append("Serial: ").append(getSerial()).append(",");
        if (getSubject() != null)
            sb.append("Subject: ").append(getSubject()).append(",");
        if (getIssuer() != null)
            sb.append("Issuer: ").append(getIssuer()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getIssuedAt() != null)
            sb.append("IssuedAt: ").append(getIssuedAt()).append(",");
        if (getImportedAt() != null)
            sb.append("ImportedAt: ").append(getImportedAt()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getRevokedAt() != null)
            sb.append("RevokedAt: ").append(getRevokedAt()).append(",");
        if (getRevocationReason() != null)
            sb.append("RevocationReason: ").append(getRevocationReason()).append(",");
        if (getNotBefore() != null)
            sb.append("NotBefore: ").append(getNotBefore()).append(",");
        if (getNotAfter() != null)
            sb.append("NotAfter: ").append(getNotAfter()).append(",");
        if (getKeyAlgorithm() != null)
            sb.append("KeyAlgorithm: ").append(getKeyAlgorithm()).append(",");
        if (getSignatureAlgorithm() != null)
            sb.append("SignatureAlgorithm: ").append(getSignatureAlgorithm()).append(",");
        if (getInUseBy() != null)
            sb.append("InUseBy: ").append(getInUseBy()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getRenewalSummary() != null)
            sb.append("RenewalSummary: ").append(getRenewalSummary()).append(",");
        if (getKeyUsages() != null)
            sb.append("KeyUsages: ").append(getKeyUsages()).append(",");
        if (getExtendedKeyUsages() != null)
            sb.append("ExtendedKeyUsages: ").append(getExtendedKeyUsages()).append(",");
        if (getCertificateAuthorityArn() != null)
            sb.append("CertificateAuthorityArn: ").append(getCertificateAuthorityArn()).append(",");
        if (getRenewalEligibility() != null)
            sb.append("RenewalEligibility: ").append(getRenewalEligibility()).append(",");
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CertificateDetail == false)
            return false;
        CertificateDetail other = (CertificateDetail) obj;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getSubjectAlternativeNames() == null ^ this.getSubjectAlternativeNames() == null)
            return false;
        if (other.getSubjectAlternativeNames() != null && other.getSubjectAlternativeNames().equals(this.getSubjectAlternativeNames()) == false)
            return false;
        if (other.getDomainValidationOptions() == null ^ this.getDomainValidationOptions() == null)
            return false;
        if (other.getDomainValidationOptions() != null && other.getDomainValidationOptions().equals(this.getDomainValidationOptions()) == false)
            return false;
        if (other.getSerial() == null ^ this.getSerial() == null)
            return false;
        if (other.getSerial() != null && other.getSerial().equals(this.getSerial()) == false)
            return false;
        if (other.getSubject() == null ^ this.getSubject() == null)
            return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false)
            return false;
        if (other.getIssuer() == null ^ this.getIssuer() == null)
            return false;
        if (other.getIssuer() != null && other.getIssuer().equals(this.getIssuer()) == false)
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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getRevokedAt() == null ^ this.getRevokedAt() == null)
            return false;
        if (other.getRevokedAt() != null && other.getRevokedAt().equals(this.getRevokedAt()) == false)
            return false;
        if (other.getRevocationReason() == null ^ this.getRevocationReason() == null)
            return false;
        if (other.getRevocationReason() != null && other.getRevocationReason().equals(this.getRevocationReason()) == false)
            return false;
        if (other.getNotBefore() == null ^ this.getNotBefore() == null)
            return false;
        if (other.getNotBefore() != null && other.getNotBefore().equals(this.getNotBefore()) == false)
            return false;
        if (other.getNotAfter() == null ^ this.getNotAfter() == null)
            return false;
        if (other.getNotAfter() != null && other.getNotAfter().equals(this.getNotAfter()) == false)
            return false;
        if (other.getKeyAlgorithm() == null ^ this.getKeyAlgorithm() == null)
            return false;
        if (other.getKeyAlgorithm() != null && other.getKeyAlgorithm().equals(this.getKeyAlgorithm()) == false)
            return false;
        if (other.getSignatureAlgorithm() == null ^ this.getSignatureAlgorithm() == null)
            return false;
        if (other.getSignatureAlgorithm() != null && other.getSignatureAlgorithm().equals(this.getSignatureAlgorithm()) == false)
            return false;
        if (other.getInUseBy() == null ^ this.getInUseBy() == null)
            return false;
        if (other.getInUseBy() != null && other.getInUseBy().equals(this.getInUseBy()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getRenewalSummary() == null ^ this.getRenewalSummary() == null)
            return false;
        if (other.getRenewalSummary() != null && other.getRenewalSummary().equals(this.getRenewalSummary()) == false)
            return false;
        if (other.getKeyUsages() == null ^ this.getKeyUsages() == null)
            return false;
        if (other.getKeyUsages() != null && other.getKeyUsages().equals(this.getKeyUsages()) == false)
            return false;
        if (other.getExtendedKeyUsages() == null ^ this.getExtendedKeyUsages() == null)
            return false;
        if (other.getExtendedKeyUsages() != null && other.getExtendedKeyUsages().equals(this.getExtendedKeyUsages()) == false)
            return false;
        if (other.getCertificateAuthorityArn() == null ^ this.getCertificateAuthorityArn() == null)
            return false;
        if (other.getCertificateAuthorityArn() != null && other.getCertificateAuthorityArn().equals(this.getCertificateAuthorityArn()) == false)
            return false;
        if (other.getRenewalEligibility() == null ^ this.getRenewalEligibility() == null)
            return false;
        if (other.getRenewalEligibility() != null && other.getRenewalEligibility().equals(this.getRenewalEligibility()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getSubjectAlternativeNames() == null) ? 0 : getSubjectAlternativeNames().hashCode());
        hashCode = prime * hashCode + ((getDomainValidationOptions() == null) ? 0 : getDomainValidationOptions().hashCode());
        hashCode = prime * hashCode + ((getSerial() == null) ? 0 : getSerial().hashCode());
        hashCode = prime * hashCode + ((getSubject() == null) ? 0 : getSubject().hashCode());
        hashCode = prime * hashCode + ((getIssuer() == null) ? 0 : getIssuer().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getIssuedAt() == null) ? 0 : getIssuedAt().hashCode());
        hashCode = prime * hashCode + ((getImportedAt() == null) ? 0 : getImportedAt().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getRevokedAt() == null) ? 0 : getRevokedAt().hashCode());
        hashCode = prime * hashCode + ((getRevocationReason() == null) ? 0 : getRevocationReason().hashCode());
        hashCode = prime * hashCode + ((getNotBefore() == null) ? 0 : getNotBefore().hashCode());
        hashCode = prime * hashCode + ((getNotAfter() == null) ? 0 : getNotAfter().hashCode());
        hashCode = prime * hashCode + ((getKeyAlgorithm() == null) ? 0 : getKeyAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getSignatureAlgorithm() == null) ? 0 : getSignatureAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getInUseBy() == null) ? 0 : getInUseBy().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getRenewalSummary() == null) ? 0 : getRenewalSummary().hashCode());
        hashCode = prime * hashCode + ((getKeyUsages() == null) ? 0 : getKeyUsages().hashCode());
        hashCode = prime * hashCode + ((getExtendedKeyUsages() == null) ? 0 : getExtendedKeyUsages().hashCode());
        hashCode = prime * hashCode + ((getCertificateAuthorityArn() == null) ? 0 : getCertificateAuthorityArn().hashCode());
        hashCode = prime * hashCode + ((getRenewalEligibility() == null) ? 0 : getRenewalEligibility().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        return hashCode;
    }

    @Override
    public CertificateDetail clone() {
        try {
            return (CertificateDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.certificatemanager.model.transform.CertificateDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
