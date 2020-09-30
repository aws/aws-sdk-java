/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about an AWS Certificate Manager certificate.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsCertificateManagerCertificateDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsCertificateManagerCertificateDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the private certificate authority (CA) that will be used to issue the certificate.
     * </p>
     */
    private String certificateAuthorityArn;
    /**
     * <p>
     * Indicates when the certificate was requested.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     */
    private String createdAt;
    /**
     * <p>
     * The fully qualified domain name (FQDN), such as www.example.com, that is secured by the certificate.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * Contains information about the initial validation of each domain name that occurs as a result of the
     * <code>RequestCertificate</code> request.
     * </p>
     * <p>
     * Only provided if the certificate type is <code>AMAZON_ISSUED</code>.
     * </p>
     */
    private java.util.List<AwsCertificateManagerCertificateDomainValidationOption> domainValidationOptions;
    /**
     * <p>
     * Contains a list of Extended Key Usage X.509 v3 extension objects. Each object specifies a purpose for which the
     * certificate public key can be used and consists of a name and an object identifier (OID).
     * </p>
     */
    private java.util.List<AwsCertificateManagerCertificateExtendedKeyUsage> extendedKeyUsages;
    /**
     * <p>
     * For a failed certificate request, the reason for the failure.
     * </p>
     * <p>
     * Valid values: <code>NO_AVAILABLE_CONTACTS</code> | <code>ADDITIONAL_VERIFICATION_REQUIRED</code> |
     * <code>DOMAIN_NOT_ALLOWED</code> | <code>INVALID_PUBLIC_DOMAIN</code> | <code>DOMAIN_VALIDATION_DENIED</code> |
     * <code>CAA_ERROR</code> | <code>PCA_LIMIT_EXCEEDED</code> | <code>PCA_INVALID_ARN</code> |
     * <code>PCA_INVALID_STATE</code> | <code>PCA_REQUEST_FAILED</code> | <code>PCA_NAME_CONSTRAINTS_VALIDATION</code> |
     * <code>PCA_RESOURCE_NOT_FOUND</code> | <code>PCA_INVALID_ARGS</code> | <code>PCA_INVALID_DURATION</code> |
     * <code>PCA_ACCESS_DENIED</code> | <code>SLR_NOT_FOUND</code> | <code>OTHER</code>
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * Indicates when the certificate was imported. Provided if the certificate type is <code>IMPORTED</code>.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     */
    private String importedAt;
    /**
     * <p>
     * The list of ARNs for the AWS resources that use the certificate.
     * </p>
     */
    private java.util.List<String> inUseBy;
    /**
     * <p>
     * Indicates when the certificate was issued. Provided if the certificate type is <code>AMAZON_ISSUED</code>.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     */
    private String issuedAt;
    /**
     * <p>
     * The name of the certificate authority that issued and signed the certificate.
     * </p>
     */
    private String issuer;
    /**
     * <p>
     * The algorithm that was used to generate the public-private key pair.
     * </p>
     * <p>
     * Valid values: <code>RSA_2048</code> | <code>RSA_1024</code> |<code> RSA_4096</code> | <code>EC_prime256v1</code>
     * | <code>EC_secp384r1</code> | <code>EC_secp521r1</code>
     * </p>
     */
    private String keyAlgorithm;
    /**
     * <p>
     * A list of key usage X.509 v3 extension objects.
     * </p>
     */
    private java.util.List<AwsCertificateManagerCertificateKeyUsage> keyUsages;
    /**
     * <p>
     * The time after which the certificate becomes invalid.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     */
    private String notAfter;
    /**
     * <p>
     * The time before which the certificate is not valid.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     */
    private String notBefore;
    /**
     * <p>
     * Provides a value that specifies whether to add the certificate to a transparency log.
     * </p>
     */
    private AwsCertificateManagerCertificateOptions options;
    /**
     * <p>
     * Whether the certificate is eligible for renewal.
     * </p>
     * <p>
     * Valid values: <code>ELIGIBLE</code> | <code>INELIGIBLE</code>
     * </p>
     */
    private String renewalEligibility;
    /**
     * <p>
     * Information about the status of the AWS Certificate Manager managed renewal for the certificate. Provided only
     * when the certificate type is <code>AMAZON_ISSUED</code>.
     * </p>
     */
    private AwsCertificateManagerCertificateRenewalSummary renewalSummary;
    /**
     * <p>
     * The serial number of the certificate.
     * </p>
     */
    private String serial;
    /**
     * <p>
     * The algorithm that was used to sign the certificate.
     * </p>
     */
    private String signatureAlgorithm;
    /**
     * <p>
     * The status of the certificate.
     * </p>
     * <p>
     * Valid values: <code>PENDING_VALIDATION</code> | <code>ISSUED</code> | <code>INACTIVE</code> |
     * <code>EXPIRED</code> | <code>VALIDATION_TIMED_OUT</code> | <code>REVOKED</code> | <code>FAILED</code>
     * </p>
     */
    private String status;
    /**
     * <p>
     * The name of the entity that is associated with the public key contained in the certificate.
     * </p>
     */
    private String subject;
    /**
     * <p>
     * One or more domain names (subject alternative names) included in the certificate. This list contains the domain
     * names that are bound to the public key that is contained in the certificate.
     * </p>
     * <p>
     * The subject alternative names include the canonical domain name (CN) of the certificate and additional domain
     * names that can be used to connect to the website.
     * </p>
     */
    private java.util.List<String> subjectAlternativeNames;
    /**
     * <p>
     * The source of the certificate. For certificates that AWS Certificate Manager provides, <code>Type</code> is
     * <code>AMAZON_ISSUED</code>. For certificates that are imported with <code>ImportCertificate</code>,
     * <code>Type</code> is <code>IMPORTED</code>.
     * </p>
     * <p>
     * Valid values: <code>IMPORTED</code> | <code>AMAZON_ISSUED</code> | <code>PRIVATE</code>
     * </p>
     */
    private String type;

    /**
     * <p>
     * The ARN of the private certificate authority (CA) that will be used to issue the certificate.
     * </p>
     * 
     * @param certificateAuthorityArn
     *        The ARN of the private certificate authority (CA) that will be used to issue the certificate.
     */

    public void setCertificateAuthorityArn(String certificateAuthorityArn) {
        this.certificateAuthorityArn = certificateAuthorityArn;
    }

    /**
     * <p>
     * The ARN of the private certificate authority (CA) that will be used to issue the certificate.
     * </p>
     * 
     * @return The ARN of the private certificate authority (CA) that will be used to issue the certificate.
     */

    public String getCertificateAuthorityArn() {
        return this.certificateAuthorityArn;
    }

    /**
     * <p>
     * The ARN of the private certificate authority (CA) that will be used to issue the certificate.
     * </p>
     * 
     * @param certificateAuthorityArn
     *        The ARN of the private certificate authority (CA) that will be used to issue the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCertificateManagerCertificateDetails withCertificateAuthorityArn(String certificateAuthorityArn) {
        setCertificateAuthorityArn(certificateAuthorityArn);
        return this;
    }

    /**
     * <p>
     * Indicates when the certificate was requested.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param createdAt
     *        Indicates when the certificate was requested.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * Indicates when the certificate was requested.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return Indicates when the certificate was requested.</p>
     *         <p>
     *         Uses the <code>date-time</code> format specified in <a
     *         href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *         Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * Indicates when the certificate was requested.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param createdAt
     *        Indicates when the certificate was requested.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCertificateManagerCertificateDetails withCreatedAt(String createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The fully qualified domain name (FQDN), such as www.example.com, that is secured by the certificate.
     * </p>
     * 
     * @param domainName
     *        The fully qualified domain name (FQDN), such as www.example.com, that is secured by the certificate.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The fully qualified domain name (FQDN), such as www.example.com, that is secured by the certificate.
     * </p>
     * 
     * @return The fully qualified domain name (FQDN), such as www.example.com, that is secured by the certificate.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The fully qualified domain name (FQDN), such as www.example.com, that is secured by the certificate.
     * </p>
     * 
     * @param domainName
     *        The fully qualified domain name (FQDN), such as www.example.com, that is secured by the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCertificateManagerCertificateDetails withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * Contains information about the initial validation of each domain name that occurs as a result of the
     * <code>RequestCertificate</code> request.
     * </p>
     * <p>
     * Only provided if the certificate type is <code>AMAZON_ISSUED</code>.
     * </p>
     * 
     * @return Contains information about the initial validation of each domain name that occurs as a result of the
     *         <code>RequestCertificate</code> request.</p>
     *         <p>
     *         Only provided if the certificate type is <code>AMAZON_ISSUED</code>.
     */

    public java.util.List<AwsCertificateManagerCertificateDomainValidationOption> getDomainValidationOptions() {
        return domainValidationOptions;
    }

    /**
     * <p>
     * Contains information about the initial validation of each domain name that occurs as a result of the
     * <code>RequestCertificate</code> request.
     * </p>
     * <p>
     * Only provided if the certificate type is <code>AMAZON_ISSUED</code>.
     * </p>
     * 
     * @param domainValidationOptions
     *        Contains information about the initial validation of each domain name that occurs as a result of the
     *        <code>RequestCertificate</code> request.</p>
     *        <p>
     *        Only provided if the certificate type is <code>AMAZON_ISSUED</code>.
     */

    public void setDomainValidationOptions(java.util.Collection<AwsCertificateManagerCertificateDomainValidationOption> domainValidationOptions) {
        if (domainValidationOptions == null) {
            this.domainValidationOptions = null;
            return;
        }

        this.domainValidationOptions = new java.util.ArrayList<AwsCertificateManagerCertificateDomainValidationOption>(domainValidationOptions);
    }

    /**
     * <p>
     * Contains information about the initial validation of each domain name that occurs as a result of the
     * <code>RequestCertificate</code> request.
     * </p>
     * <p>
     * Only provided if the certificate type is <code>AMAZON_ISSUED</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDomainValidationOptions(java.util.Collection)} or
     * {@link #withDomainValidationOptions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param domainValidationOptions
     *        Contains information about the initial validation of each domain name that occurs as a result of the
     *        <code>RequestCertificate</code> request.</p>
     *        <p>
     *        Only provided if the certificate type is <code>AMAZON_ISSUED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCertificateManagerCertificateDetails withDomainValidationOptions(
            AwsCertificateManagerCertificateDomainValidationOption... domainValidationOptions) {
        if (this.domainValidationOptions == null) {
            setDomainValidationOptions(new java.util.ArrayList<AwsCertificateManagerCertificateDomainValidationOption>(domainValidationOptions.length));
        }
        for (AwsCertificateManagerCertificateDomainValidationOption ele : domainValidationOptions) {
            this.domainValidationOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains information about the initial validation of each domain name that occurs as a result of the
     * <code>RequestCertificate</code> request.
     * </p>
     * <p>
     * Only provided if the certificate type is <code>AMAZON_ISSUED</code>.
     * </p>
     * 
     * @param domainValidationOptions
     *        Contains information about the initial validation of each domain name that occurs as a result of the
     *        <code>RequestCertificate</code> request.</p>
     *        <p>
     *        Only provided if the certificate type is <code>AMAZON_ISSUED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCertificateManagerCertificateDetails withDomainValidationOptions(
            java.util.Collection<AwsCertificateManagerCertificateDomainValidationOption> domainValidationOptions) {
        setDomainValidationOptions(domainValidationOptions);
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

    public java.util.List<AwsCertificateManagerCertificateExtendedKeyUsage> getExtendedKeyUsages() {
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

    public void setExtendedKeyUsages(java.util.Collection<AwsCertificateManagerCertificateExtendedKeyUsage> extendedKeyUsages) {
        if (extendedKeyUsages == null) {
            this.extendedKeyUsages = null;
            return;
        }

        this.extendedKeyUsages = new java.util.ArrayList<AwsCertificateManagerCertificateExtendedKeyUsage>(extendedKeyUsages);
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

    public AwsCertificateManagerCertificateDetails withExtendedKeyUsages(AwsCertificateManagerCertificateExtendedKeyUsage... extendedKeyUsages) {
        if (this.extendedKeyUsages == null) {
            setExtendedKeyUsages(new java.util.ArrayList<AwsCertificateManagerCertificateExtendedKeyUsage>(extendedKeyUsages.length));
        }
        for (AwsCertificateManagerCertificateExtendedKeyUsage ele : extendedKeyUsages) {
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

    public AwsCertificateManagerCertificateDetails withExtendedKeyUsages(
            java.util.Collection<AwsCertificateManagerCertificateExtendedKeyUsage> extendedKeyUsages) {
        setExtendedKeyUsages(extendedKeyUsages);
        return this;
    }

    /**
     * <p>
     * For a failed certificate request, the reason for the failure.
     * </p>
     * <p>
     * Valid values: <code>NO_AVAILABLE_CONTACTS</code> | <code>ADDITIONAL_VERIFICATION_REQUIRED</code> |
     * <code>DOMAIN_NOT_ALLOWED</code> | <code>INVALID_PUBLIC_DOMAIN</code> | <code>DOMAIN_VALIDATION_DENIED</code> |
     * <code>CAA_ERROR</code> | <code>PCA_LIMIT_EXCEEDED</code> | <code>PCA_INVALID_ARN</code> |
     * <code>PCA_INVALID_STATE</code> | <code>PCA_REQUEST_FAILED</code> | <code>PCA_NAME_CONSTRAINTS_VALIDATION</code> |
     * <code>PCA_RESOURCE_NOT_FOUND</code> | <code>PCA_INVALID_ARGS</code> | <code>PCA_INVALID_DURATION</code> |
     * <code>PCA_ACCESS_DENIED</code> | <code>SLR_NOT_FOUND</code> | <code>OTHER</code>
     * </p>
     * 
     * @param failureReason
     *        For a failed certificate request, the reason for the failure.</p>
     *        <p>
     *        Valid values: <code>NO_AVAILABLE_CONTACTS</code> | <code>ADDITIONAL_VERIFICATION_REQUIRED</code> |
     *        <code>DOMAIN_NOT_ALLOWED</code> | <code>INVALID_PUBLIC_DOMAIN</code> |
     *        <code>DOMAIN_VALIDATION_DENIED</code> | <code>CAA_ERROR</code> | <code>PCA_LIMIT_EXCEEDED</code> |
     *        <code>PCA_INVALID_ARN</code> | <code>PCA_INVALID_STATE</code> | <code>PCA_REQUEST_FAILED</code> |
     *        <code>PCA_NAME_CONSTRAINTS_VALIDATION</code> | <code>PCA_RESOURCE_NOT_FOUND</code> |
     *        <code>PCA_INVALID_ARGS</code> | <code>PCA_INVALID_DURATION</code> | <code>PCA_ACCESS_DENIED</code> |
     *        <code>SLR_NOT_FOUND</code> | <code>OTHER</code>
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * For a failed certificate request, the reason for the failure.
     * </p>
     * <p>
     * Valid values: <code>NO_AVAILABLE_CONTACTS</code> | <code>ADDITIONAL_VERIFICATION_REQUIRED</code> |
     * <code>DOMAIN_NOT_ALLOWED</code> | <code>INVALID_PUBLIC_DOMAIN</code> | <code>DOMAIN_VALIDATION_DENIED</code> |
     * <code>CAA_ERROR</code> | <code>PCA_LIMIT_EXCEEDED</code> | <code>PCA_INVALID_ARN</code> |
     * <code>PCA_INVALID_STATE</code> | <code>PCA_REQUEST_FAILED</code> | <code>PCA_NAME_CONSTRAINTS_VALIDATION</code> |
     * <code>PCA_RESOURCE_NOT_FOUND</code> | <code>PCA_INVALID_ARGS</code> | <code>PCA_INVALID_DURATION</code> |
     * <code>PCA_ACCESS_DENIED</code> | <code>SLR_NOT_FOUND</code> | <code>OTHER</code>
     * </p>
     * 
     * @return For a failed certificate request, the reason for the failure.</p>
     *         <p>
     *         Valid values: <code>NO_AVAILABLE_CONTACTS</code> | <code>ADDITIONAL_VERIFICATION_REQUIRED</code> |
     *         <code>DOMAIN_NOT_ALLOWED</code> | <code>INVALID_PUBLIC_DOMAIN</code> |
     *         <code>DOMAIN_VALIDATION_DENIED</code> | <code>CAA_ERROR</code> | <code>PCA_LIMIT_EXCEEDED</code> |
     *         <code>PCA_INVALID_ARN</code> | <code>PCA_INVALID_STATE</code> | <code>PCA_REQUEST_FAILED</code> |
     *         <code>PCA_NAME_CONSTRAINTS_VALIDATION</code> | <code>PCA_RESOURCE_NOT_FOUND</code> |
     *         <code>PCA_INVALID_ARGS</code> | <code>PCA_INVALID_DURATION</code> | <code>PCA_ACCESS_DENIED</code> |
     *         <code>SLR_NOT_FOUND</code> | <code>OTHER</code>
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * For a failed certificate request, the reason for the failure.
     * </p>
     * <p>
     * Valid values: <code>NO_AVAILABLE_CONTACTS</code> | <code>ADDITIONAL_VERIFICATION_REQUIRED</code> |
     * <code>DOMAIN_NOT_ALLOWED</code> | <code>INVALID_PUBLIC_DOMAIN</code> | <code>DOMAIN_VALIDATION_DENIED</code> |
     * <code>CAA_ERROR</code> | <code>PCA_LIMIT_EXCEEDED</code> | <code>PCA_INVALID_ARN</code> |
     * <code>PCA_INVALID_STATE</code> | <code>PCA_REQUEST_FAILED</code> | <code>PCA_NAME_CONSTRAINTS_VALIDATION</code> |
     * <code>PCA_RESOURCE_NOT_FOUND</code> | <code>PCA_INVALID_ARGS</code> | <code>PCA_INVALID_DURATION</code> |
     * <code>PCA_ACCESS_DENIED</code> | <code>SLR_NOT_FOUND</code> | <code>OTHER</code>
     * </p>
     * 
     * @param failureReason
     *        For a failed certificate request, the reason for the failure.</p>
     *        <p>
     *        Valid values: <code>NO_AVAILABLE_CONTACTS</code> | <code>ADDITIONAL_VERIFICATION_REQUIRED</code> |
     *        <code>DOMAIN_NOT_ALLOWED</code> | <code>INVALID_PUBLIC_DOMAIN</code> |
     *        <code>DOMAIN_VALIDATION_DENIED</code> | <code>CAA_ERROR</code> | <code>PCA_LIMIT_EXCEEDED</code> |
     *        <code>PCA_INVALID_ARN</code> | <code>PCA_INVALID_STATE</code> | <code>PCA_REQUEST_FAILED</code> |
     *        <code>PCA_NAME_CONSTRAINTS_VALIDATION</code> | <code>PCA_RESOURCE_NOT_FOUND</code> |
     *        <code>PCA_INVALID_ARGS</code> | <code>PCA_INVALID_DURATION</code> | <code>PCA_ACCESS_DENIED</code> |
     *        <code>SLR_NOT_FOUND</code> | <code>OTHER</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCertificateManagerCertificateDetails withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * Indicates when the certificate was imported. Provided if the certificate type is <code>IMPORTED</code>.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param importedAt
     *        Indicates when the certificate was imported. Provided if the certificate type is <code>IMPORTED</code>
     *        .</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public void setImportedAt(String importedAt) {
        this.importedAt = importedAt;
    }

    /**
     * <p>
     * Indicates when the certificate was imported. Provided if the certificate type is <code>IMPORTED</code>.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return Indicates when the certificate was imported. Provided if the certificate type is <code>IMPORTED</code>
     *         .</p>
     *         <p>
     *         Uses the <code>date-time</code> format specified in <a
     *         href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *         Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public String getImportedAt() {
        return this.importedAt;
    }

    /**
     * <p>
     * Indicates when the certificate was imported. Provided if the certificate type is <code>IMPORTED</code>.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param importedAt
     *        Indicates when the certificate was imported. Provided if the certificate type is <code>IMPORTED</code>
     *        .</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCertificateManagerCertificateDetails withImportedAt(String importedAt) {
        setImportedAt(importedAt);
        return this;
    }

    /**
     * <p>
     * The list of ARNs for the AWS resources that use the certificate.
     * </p>
     * 
     * @return The list of ARNs for the AWS resources that use the certificate.
     */

    public java.util.List<String> getInUseBy() {
        return inUseBy;
    }

    /**
     * <p>
     * The list of ARNs for the AWS resources that use the certificate.
     * </p>
     * 
     * @param inUseBy
     *        The list of ARNs for the AWS resources that use the certificate.
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
     * The list of ARNs for the AWS resources that use the certificate.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInUseBy(java.util.Collection)} or {@link #withInUseBy(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param inUseBy
     *        The list of ARNs for the AWS resources that use the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCertificateManagerCertificateDetails withInUseBy(String... inUseBy) {
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
     * The list of ARNs for the AWS resources that use the certificate.
     * </p>
     * 
     * @param inUseBy
     *        The list of ARNs for the AWS resources that use the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCertificateManagerCertificateDetails withInUseBy(java.util.Collection<String> inUseBy) {
        setInUseBy(inUseBy);
        return this;
    }

    /**
     * <p>
     * Indicates when the certificate was issued. Provided if the certificate type is <code>AMAZON_ISSUED</code>.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param issuedAt
     *        Indicates when the certificate was issued. Provided if the certificate type is <code>AMAZON_ISSUED</code>
     *        .</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public void setIssuedAt(String issuedAt) {
        this.issuedAt = issuedAt;
    }

    /**
     * <p>
     * Indicates when the certificate was issued. Provided if the certificate type is <code>AMAZON_ISSUED</code>.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return Indicates when the certificate was issued. Provided if the certificate type is <code>AMAZON_ISSUED</code>
     *         .</p>
     *         <p>
     *         Uses the <code>date-time</code> format specified in <a
     *         href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *         Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public String getIssuedAt() {
        return this.issuedAt;
    }

    /**
     * <p>
     * Indicates when the certificate was issued. Provided if the certificate type is <code>AMAZON_ISSUED</code>.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param issuedAt
     *        Indicates when the certificate was issued. Provided if the certificate type is <code>AMAZON_ISSUED</code>
     *        .</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCertificateManagerCertificateDetails withIssuedAt(String issuedAt) {
        setIssuedAt(issuedAt);
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

    public AwsCertificateManagerCertificateDetails withIssuer(String issuer) {
        setIssuer(issuer);
        return this;
    }

    /**
     * <p>
     * The algorithm that was used to generate the public-private key pair.
     * </p>
     * <p>
     * Valid values: <code>RSA_2048</code> | <code>RSA_1024</code> |<code> RSA_4096</code> | <code>EC_prime256v1</code>
     * | <code>EC_secp384r1</code> | <code>EC_secp521r1</code>
     * </p>
     * 
     * @param keyAlgorithm
     *        The algorithm that was used to generate the public-private key pair.</p>
     *        <p>
     *        Valid values: <code>RSA_2048</code> | <code>RSA_1024</code> |<code> RSA_4096</code> |
     *        <code>EC_prime256v1</code> | <code>EC_secp384r1</code> | <code>EC_secp521r1</code>
     */

    public void setKeyAlgorithm(String keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm;
    }

    /**
     * <p>
     * The algorithm that was used to generate the public-private key pair.
     * </p>
     * <p>
     * Valid values: <code>RSA_2048</code> | <code>RSA_1024</code> |<code> RSA_4096</code> | <code>EC_prime256v1</code>
     * | <code>EC_secp384r1</code> | <code>EC_secp521r1</code>
     * </p>
     * 
     * @return The algorithm that was used to generate the public-private key pair.</p>
     *         <p>
     *         Valid values: <code>RSA_2048</code> | <code>RSA_1024</code> |<code> RSA_4096</code> |
     *         <code>EC_prime256v1</code> | <code>EC_secp384r1</code> | <code>EC_secp521r1</code>
     */

    public String getKeyAlgorithm() {
        return this.keyAlgorithm;
    }

    /**
     * <p>
     * The algorithm that was used to generate the public-private key pair.
     * </p>
     * <p>
     * Valid values: <code>RSA_2048</code> | <code>RSA_1024</code> |<code> RSA_4096</code> | <code>EC_prime256v1</code>
     * | <code>EC_secp384r1</code> | <code>EC_secp521r1</code>
     * </p>
     * 
     * @param keyAlgorithm
     *        The algorithm that was used to generate the public-private key pair.</p>
     *        <p>
     *        Valid values: <code>RSA_2048</code> | <code>RSA_1024</code> |<code> RSA_4096</code> |
     *        <code>EC_prime256v1</code> | <code>EC_secp384r1</code> | <code>EC_secp521r1</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCertificateManagerCertificateDetails withKeyAlgorithm(String keyAlgorithm) {
        setKeyAlgorithm(keyAlgorithm);
        return this;
    }

    /**
     * <p>
     * A list of key usage X.509 v3 extension objects.
     * </p>
     * 
     * @return A list of key usage X.509 v3 extension objects.
     */

    public java.util.List<AwsCertificateManagerCertificateKeyUsage> getKeyUsages() {
        return keyUsages;
    }

    /**
     * <p>
     * A list of key usage X.509 v3 extension objects.
     * </p>
     * 
     * @param keyUsages
     *        A list of key usage X.509 v3 extension objects.
     */

    public void setKeyUsages(java.util.Collection<AwsCertificateManagerCertificateKeyUsage> keyUsages) {
        if (keyUsages == null) {
            this.keyUsages = null;
            return;
        }

        this.keyUsages = new java.util.ArrayList<AwsCertificateManagerCertificateKeyUsage>(keyUsages);
    }

    /**
     * <p>
     * A list of key usage X.509 v3 extension objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeyUsages(java.util.Collection)} or {@link #withKeyUsages(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param keyUsages
     *        A list of key usage X.509 v3 extension objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCertificateManagerCertificateDetails withKeyUsages(AwsCertificateManagerCertificateKeyUsage... keyUsages) {
        if (this.keyUsages == null) {
            setKeyUsages(new java.util.ArrayList<AwsCertificateManagerCertificateKeyUsage>(keyUsages.length));
        }
        for (AwsCertificateManagerCertificateKeyUsage ele : keyUsages) {
            this.keyUsages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of key usage X.509 v3 extension objects.
     * </p>
     * 
     * @param keyUsages
     *        A list of key usage X.509 v3 extension objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCertificateManagerCertificateDetails withKeyUsages(java.util.Collection<AwsCertificateManagerCertificateKeyUsage> keyUsages) {
        setKeyUsages(keyUsages);
        return this;
    }

    /**
     * <p>
     * The time after which the certificate becomes invalid.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param notAfter
     *        The time after which the certificate becomes invalid.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public void setNotAfter(String notAfter) {
        this.notAfter = notAfter;
    }

    /**
     * <p>
     * The time after which the certificate becomes invalid.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return The time after which the certificate becomes invalid.</p>
     *         <p>
     *         Uses the <code>date-time</code> format specified in <a
     *         href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *         Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public String getNotAfter() {
        return this.notAfter;
    }

    /**
     * <p>
     * The time after which the certificate becomes invalid.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param notAfter
     *        The time after which the certificate becomes invalid.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCertificateManagerCertificateDetails withNotAfter(String notAfter) {
        setNotAfter(notAfter);
        return this;
    }

    /**
     * <p>
     * The time before which the certificate is not valid.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param notBefore
     *        The time before which the certificate is not valid.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public void setNotBefore(String notBefore) {
        this.notBefore = notBefore;
    }

    /**
     * <p>
     * The time before which the certificate is not valid.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @return The time before which the certificate is not valid.</p>
     *         <p>
     *         Uses the <code>date-time</code> format specified in <a
     *         href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *         Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     */

    public String getNotBefore() {
        return this.notBefore;
    }

    /**
     * <p>
     * The time before which the certificate is not valid.
     * </p>
     * <p>
     * Uses the <code>date-time</code> format specified in <a href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC
     * 3339 section 5.6, Internet Date/Time Format</a>. The value cannot contain spaces. For example,
     * <code>2020-03-22T13:22:13.933Z</code>.
     * </p>
     * 
     * @param notBefore
     *        The time before which the certificate is not valid.</p>
     *        <p>
     *        Uses the <code>date-time</code> format specified in <a
     *        href="https://tools.ietf.org/html/rfc3339#section-5.6">RFC 3339 section 5.6, Internet Date/Time
     *        Format</a>. The value cannot contain spaces. For example, <code>2020-03-22T13:22:13.933Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCertificateManagerCertificateDetails withNotBefore(String notBefore) {
        setNotBefore(notBefore);
        return this;
    }

    /**
     * <p>
     * Provides a value that specifies whether to add the certificate to a transparency log.
     * </p>
     * 
     * @param options
     *        Provides a value that specifies whether to add the certificate to a transparency log.
     */

    public void setOptions(AwsCertificateManagerCertificateOptions options) {
        this.options = options;
    }

    /**
     * <p>
     * Provides a value that specifies whether to add the certificate to a transparency log.
     * </p>
     * 
     * @return Provides a value that specifies whether to add the certificate to a transparency log.
     */

    public AwsCertificateManagerCertificateOptions getOptions() {
        return this.options;
    }

    /**
     * <p>
     * Provides a value that specifies whether to add the certificate to a transparency log.
     * </p>
     * 
     * @param options
     *        Provides a value that specifies whether to add the certificate to a transparency log.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCertificateManagerCertificateDetails withOptions(AwsCertificateManagerCertificateOptions options) {
        setOptions(options);
        return this;
    }

    /**
     * <p>
     * Whether the certificate is eligible for renewal.
     * </p>
     * <p>
     * Valid values: <code>ELIGIBLE</code> | <code>INELIGIBLE</code>
     * </p>
     * 
     * @param renewalEligibility
     *        Whether the certificate is eligible for renewal.</p>
     *        <p>
     *        Valid values: <code>ELIGIBLE</code> | <code>INELIGIBLE</code>
     */

    public void setRenewalEligibility(String renewalEligibility) {
        this.renewalEligibility = renewalEligibility;
    }

    /**
     * <p>
     * Whether the certificate is eligible for renewal.
     * </p>
     * <p>
     * Valid values: <code>ELIGIBLE</code> | <code>INELIGIBLE</code>
     * </p>
     * 
     * @return Whether the certificate is eligible for renewal.</p>
     *         <p>
     *         Valid values: <code>ELIGIBLE</code> | <code>INELIGIBLE</code>
     */

    public String getRenewalEligibility() {
        return this.renewalEligibility;
    }

    /**
     * <p>
     * Whether the certificate is eligible for renewal.
     * </p>
     * <p>
     * Valid values: <code>ELIGIBLE</code> | <code>INELIGIBLE</code>
     * </p>
     * 
     * @param renewalEligibility
     *        Whether the certificate is eligible for renewal.</p>
     *        <p>
     *        Valid values: <code>ELIGIBLE</code> | <code>INELIGIBLE</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCertificateManagerCertificateDetails withRenewalEligibility(String renewalEligibility) {
        setRenewalEligibility(renewalEligibility);
        return this;
    }

    /**
     * <p>
     * Information about the status of the AWS Certificate Manager managed renewal for the certificate. Provided only
     * when the certificate type is <code>AMAZON_ISSUED</code>.
     * </p>
     * 
     * @param renewalSummary
     *        Information about the status of the AWS Certificate Manager managed renewal for the certificate. Provided
     *        only when the certificate type is <code>AMAZON_ISSUED</code>.
     */

    public void setRenewalSummary(AwsCertificateManagerCertificateRenewalSummary renewalSummary) {
        this.renewalSummary = renewalSummary;
    }

    /**
     * <p>
     * Information about the status of the AWS Certificate Manager managed renewal for the certificate. Provided only
     * when the certificate type is <code>AMAZON_ISSUED</code>.
     * </p>
     * 
     * @return Information about the status of the AWS Certificate Manager managed renewal for the certificate. Provided
     *         only when the certificate type is <code>AMAZON_ISSUED</code>.
     */

    public AwsCertificateManagerCertificateRenewalSummary getRenewalSummary() {
        return this.renewalSummary;
    }

    /**
     * <p>
     * Information about the status of the AWS Certificate Manager managed renewal for the certificate. Provided only
     * when the certificate type is <code>AMAZON_ISSUED</code>.
     * </p>
     * 
     * @param renewalSummary
     *        Information about the status of the AWS Certificate Manager managed renewal for the certificate. Provided
     *        only when the certificate type is <code>AMAZON_ISSUED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCertificateManagerCertificateDetails withRenewalSummary(AwsCertificateManagerCertificateRenewalSummary renewalSummary) {
        setRenewalSummary(renewalSummary);
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

    public AwsCertificateManagerCertificateDetails withSerial(String serial) {
        setSerial(serial);
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

    public AwsCertificateManagerCertificateDetails withSignatureAlgorithm(String signatureAlgorithm) {
        setSignatureAlgorithm(signatureAlgorithm);
        return this;
    }

    /**
     * <p>
     * The status of the certificate.
     * </p>
     * <p>
     * Valid values: <code>PENDING_VALIDATION</code> | <code>ISSUED</code> | <code>INACTIVE</code> |
     * <code>EXPIRED</code> | <code>VALIDATION_TIMED_OUT</code> | <code>REVOKED</code> | <code>FAILED</code>
     * </p>
     * 
     * @param status
     *        The status of the certificate.</p>
     *        <p>
     *        Valid values: <code>PENDING_VALIDATION</code> | <code>ISSUED</code> | <code>INACTIVE</code> |
     *        <code>EXPIRED</code> | <code>VALIDATION_TIMED_OUT</code> | <code>REVOKED</code> | <code>FAILED</code>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the certificate.
     * </p>
     * <p>
     * Valid values: <code>PENDING_VALIDATION</code> | <code>ISSUED</code> | <code>INACTIVE</code> |
     * <code>EXPIRED</code> | <code>VALIDATION_TIMED_OUT</code> | <code>REVOKED</code> | <code>FAILED</code>
     * </p>
     * 
     * @return The status of the certificate.</p>
     *         <p>
     *         Valid values: <code>PENDING_VALIDATION</code> | <code>ISSUED</code> | <code>INACTIVE</code> |
     *         <code>EXPIRED</code> | <code>VALIDATION_TIMED_OUT</code> | <code>REVOKED</code> | <code>FAILED</code>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the certificate.
     * </p>
     * <p>
     * Valid values: <code>PENDING_VALIDATION</code> | <code>ISSUED</code> | <code>INACTIVE</code> |
     * <code>EXPIRED</code> | <code>VALIDATION_TIMED_OUT</code> | <code>REVOKED</code> | <code>FAILED</code>
     * </p>
     * 
     * @param status
     *        The status of the certificate.</p>
     *        <p>
     *        Valid values: <code>PENDING_VALIDATION</code> | <code>ISSUED</code> | <code>INACTIVE</code> |
     *        <code>EXPIRED</code> | <code>VALIDATION_TIMED_OUT</code> | <code>REVOKED</code> | <code>FAILED</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCertificateManagerCertificateDetails withStatus(String status) {
        setStatus(status);
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

    public AwsCertificateManagerCertificateDetails withSubject(String subject) {
        setSubject(subject);
        return this;
    }

    /**
     * <p>
     * One or more domain names (subject alternative names) included in the certificate. This list contains the domain
     * names that are bound to the public key that is contained in the certificate.
     * </p>
     * <p>
     * The subject alternative names include the canonical domain name (CN) of the certificate and additional domain
     * names that can be used to connect to the website.
     * </p>
     * 
     * @return One or more domain names (subject alternative names) included in the certificate. This list contains the
     *         domain names that are bound to the public key that is contained in the certificate.</p>
     *         <p>
     *         The subject alternative names include the canonical domain name (CN) of the certificate and additional
     *         domain names that can be used to connect to the website.
     */

    public java.util.List<String> getSubjectAlternativeNames() {
        return subjectAlternativeNames;
    }

    /**
     * <p>
     * One or more domain names (subject alternative names) included in the certificate. This list contains the domain
     * names that are bound to the public key that is contained in the certificate.
     * </p>
     * <p>
     * The subject alternative names include the canonical domain name (CN) of the certificate and additional domain
     * names that can be used to connect to the website.
     * </p>
     * 
     * @param subjectAlternativeNames
     *        One or more domain names (subject alternative names) included in the certificate. This list contains the
     *        domain names that are bound to the public key that is contained in the certificate.</p>
     *        <p>
     *        The subject alternative names include the canonical domain name (CN) of the certificate and additional
     *        domain names that can be used to connect to the website.
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
     * names that are bound to the public key that is contained in the certificate.
     * </p>
     * <p>
     * The subject alternative names include the canonical domain name (CN) of the certificate and additional domain
     * names that can be used to connect to the website.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubjectAlternativeNames(java.util.Collection)} or
     * {@link #withSubjectAlternativeNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param subjectAlternativeNames
     *        One or more domain names (subject alternative names) included in the certificate. This list contains the
     *        domain names that are bound to the public key that is contained in the certificate.</p>
     *        <p>
     *        The subject alternative names include the canonical domain name (CN) of the certificate and additional
     *        domain names that can be used to connect to the website.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCertificateManagerCertificateDetails withSubjectAlternativeNames(String... subjectAlternativeNames) {
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
     * names that are bound to the public key that is contained in the certificate.
     * </p>
     * <p>
     * The subject alternative names include the canonical domain name (CN) of the certificate and additional domain
     * names that can be used to connect to the website.
     * </p>
     * 
     * @param subjectAlternativeNames
     *        One or more domain names (subject alternative names) included in the certificate. This list contains the
     *        domain names that are bound to the public key that is contained in the certificate.</p>
     *        <p>
     *        The subject alternative names include the canonical domain name (CN) of the certificate and additional
     *        domain names that can be used to connect to the website.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCertificateManagerCertificateDetails withSubjectAlternativeNames(java.util.Collection<String> subjectAlternativeNames) {
        setSubjectAlternativeNames(subjectAlternativeNames);
        return this;
    }

    /**
     * <p>
     * The source of the certificate. For certificates that AWS Certificate Manager provides, <code>Type</code> is
     * <code>AMAZON_ISSUED</code>. For certificates that are imported with <code>ImportCertificate</code>,
     * <code>Type</code> is <code>IMPORTED</code>.
     * </p>
     * <p>
     * Valid values: <code>IMPORTED</code> | <code>AMAZON_ISSUED</code> | <code>PRIVATE</code>
     * </p>
     * 
     * @param type
     *        The source of the certificate. For certificates that AWS Certificate Manager provides, <code>Type</code>
     *        is <code>AMAZON_ISSUED</code>. For certificates that are imported with <code>ImportCertificate</code>,
     *        <code>Type</code> is <code>IMPORTED</code>.</p>
     *        <p>
     *        Valid values: <code>IMPORTED</code> | <code>AMAZON_ISSUED</code> | <code>PRIVATE</code>
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The source of the certificate. For certificates that AWS Certificate Manager provides, <code>Type</code> is
     * <code>AMAZON_ISSUED</code>. For certificates that are imported with <code>ImportCertificate</code>,
     * <code>Type</code> is <code>IMPORTED</code>.
     * </p>
     * <p>
     * Valid values: <code>IMPORTED</code> | <code>AMAZON_ISSUED</code> | <code>PRIVATE</code>
     * </p>
     * 
     * @return The source of the certificate. For certificates that AWS Certificate Manager provides, <code>Type</code>
     *         is <code>AMAZON_ISSUED</code>. For certificates that are imported with <code>ImportCertificate</code>,
     *         <code>Type</code> is <code>IMPORTED</code>.</p>
     *         <p>
     *         Valid values: <code>IMPORTED</code> | <code>AMAZON_ISSUED</code> | <code>PRIVATE</code>
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The source of the certificate. For certificates that AWS Certificate Manager provides, <code>Type</code> is
     * <code>AMAZON_ISSUED</code>. For certificates that are imported with <code>ImportCertificate</code>,
     * <code>Type</code> is <code>IMPORTED</code>.
     * </p>
     * <p>
     * Valid values: <code>IMPORTED</code> | <code>AMAZON_ISSUED</code> | <code>PRIVATE</code>
     * </p>
     * 
     * @param type
     *        The source of the certificate. For certificates that AWS Certificate Manager provides, <code>Type</code>
     *        is <code>AMAZON_ISSUED</code>. For certificates that are imported with <code>ImportCertificate</code>,
     *        <code>Type</code> is <code>IMPORTED</code>.</p>
     *        <p>
     *        Valid values: <code>IMPORTED</code> | <code>AMAZON_ISSUED</code> | <code>PRIVATE</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCertificateManagerCertificateDetails withType(String type) {
        setType(type);
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
        if (getCertificateAuthorityArn() != null)
            sb.append("CertificateAuthorityArn: ").append(getCertificateAuthorityArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getDomainValidationOptions() != null)
            sb.append("DomainValidationOptions: ").append(getDomainValidationOptions()).append(",");
        if (getExtendedKeyUsages() != null)
            sb.append("ExtendedKeyUsages: ").append(getExtendedKeyUsages()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getImportedAt() != null)
            sb.append("ImportedAt: ").append(getImportedAt()).append(",");
        if (getInUseBy() != null)
            sb.append("InUseBy: ").append(getInUseBy()).append(",");
        if (getIssuedAt() != null)
            sb.append("IssuedAt: ").append(getIssuedAt()).append(",");
        if (getIssuer() != null)
            sb.append("Issuer: ").append(getIssuer()).append(",");
        if (getKeyAlgorithm() != null)
            sb.append("KeyAlgorithm: ").append(getKeyAlgorithm()).append(",");
        if (getKeyUsages() != null)
            sb.append("KeyUsages: ").append(getKeyUsages()).append(",");
        if (getNotAfter() != null)
            sb.append("NotAfter: ").append(getNotAfter()).append(",");
        if (getNotBefore() != null)
            sb.append("NotBefore: ").append(getNotBefore()).append(",");
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions()).append(",");
        if (getRenewalEligibility() != null)
            sb.append("RenewalEligibility: ").append(getRenewalEligibility()).append(",");
        if (getRenewalSummary() != null)
            sb.append("RenewalSummary: ").append(getRenewalSummary()).append(",");
        if (getSerial() != null)
            sb.append("Serial: ").append(getSerial()).append(",");
        if (getSignatureAlgorithm() != null)
            sb.append("SignatureAlgorithm: ").append(getSignatureAlgorithm()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSubject() != null)
            sb.append("Subject: ").append(getSubject()).append(",");
        if (getSubjectAlternativeNames() != null)
            sb.append("SubjectAlternativeNames: ").append(getSubjectAlternativeNames()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsCertificateManagerCertificateDetails == false)
            return false;
        AwsCertificateManagerCertificateDetails other = (AwsCertificateManagerCertificateDetails) obj;
        if (other.getCertificateAuthorityArn() == null ^ this.getCertificateAuthorityArn() == null)
            return false;
        if (other.getCertificateAuthorityArn() != null && other.getCertificateAuthorityArn().equals(this.getCertificateAuthorityArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getDomainValidationOptions() == null ^ this.getDomainValidationOptions() == null)
            return false;
        if (other.getDomainValidationOptions() != null && other.getDomainValidationOptions().equals(this.getDomainValidationOptions()) == false)
            return false;
        if (other.getExtendedKeyUsages() == null ^ this.getExtendedKeyUsages() == null)
            return false;
        if (other.getExtendedKeyUsages() != null && other.getExtendedKeyUsages().equals(this.getExtendedKeyUsages()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getImportedAt() == null ^ this.getImportedAt() == null)
            return false;
        if (other.getImportedAt() != null && other.getImportedAt().equals(this.getImportedAt()) == false)
            return false;
        if (other.getInUseBy() == null ^ this.getInUseBy() == null)
            return false;
        if (other.getInUseBy() != null && other.getInUseBy().equals(this.getInUseBy()) == false)
            return false;
        if (other.getIssuedAt() == null ^ this.getIssuedAt() == null)
            return false;
        if (other.getIssuedAt() != null && other.getIssuedAt().equals(this.getIssuedAt()) == false)
            return false;
        if (other.getIssuer() == null ^ this.getIssuer() == null)
            return false;
        if (other.getIssuer() != null && other.getIssuer().equals(this.getIssuer()) == false)
            return false;
        if (other.getKeyAlgorithm() == null ^ this.getKeyAlgorithm() == null)
            return false;
        if (other.getKeyAlgorithm() != null && other.getKeyAlgorithm().equals(this.getKeyAlgorithm()) == false)
            return false;
        if (other.getKeyUsages() == null ^ this.getKeyUsages() == null)
            return false;
        if (other.getKeyUsages() != null && other.getKeyUsages().equals(this.getKeyUsages()) == false)
            return false;
        if (other.getNotAfter() == null ^ this.getNotAfter() == null)
            return false;
        if (other.getNotAfter() != null && other.getNotAfter().equals(this.getNotAfter()) == false)
            return false;
        if (other.getNotBefore() == null ^ this.getNotBefore() == null)
            return false;
        if (other.getNotBefore() != null && other.getNotBefore().equals(this.getNotBefore()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        if (other.getRenewalEligibility() == null ^ this.getRenewalEligibility() == null)
            return false;
        if (other.getRenewalEligibility() != null && other.getRenewalEligibility().equals(this.getRenewalEligibility()) == false)
            return false;
        if (other.getRenewalSummary() == null ^ this.getRenewalSummary() == null)
            return false;
        if (other.getRenewalSummary() != null && other.getRenewalSummary().equals(this.getRenewalSummary()) == false)
            return false;
        if (other.getSerial() == null ^ this.getSerial() == null)
            return false;
        if (other.getSerial() != null && other.getSerial().equals(this.getSerial()) == false)
            return false;
        if (other.getSignatureAlgorithm() == null ^ this.getSignatureAlgorithm() == null)
            return false;
        if (other.getSignatureAlgorithm() != null && other.getSignatureAlgorithm().equals(this.getSignatureAlgorithm()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSubject() == null ^ this.getSubject() == null)
            return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false)
            return false;
        if (other.getSubjectAlternativeNames() == null ^ this.getSubjectAlternativeNames() == null)
            return false;
        if (other.getSubjectAlternativeNames() != null && other.getSubjectAlternativeNames().equals(this.getSubjectAlternativeNames()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateAuthorityArn() == null) ? 0 : getCertificateAuthorityArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getDomainValidationOptions() == null) ? 0 : getDomainValidationOptions().hashCode());
        hashCode = prime * hashCode + ((getExtendedKeyUsages() == null) ? 0 : getExtendedKeyUsages().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getImportedAt() == null) ? 0 : getImportedAt().hashCode());
        hashCode = prime * hashCode + ((getInUseBy() == null) ? 0 : getInUseBy().hashCode());
        hashCode = prime * hashCode + ((getIssuedAt() == null) ? 0 : getIssuedAt().hashCode());
        hashCode = prime * hashCode + ((getIssuer() == null) ? 0 : getIssuer().hashCode());
        hashCode = prime * hashCode + ((getKeyAlgorithm() == null) ? 0 : getKeyAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getKeyUsages() == null) ? 0 : getKeyUsages().hashCode());
        hashCode = prime * hashCode + ((getNotAfter() == null) ? 0 : getNotAfter().hashCode());
        hashCode = prime * hashCode + ((getNotBefore() == null) ? 0 : getNotBefore().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime * hashCode + ((getRenewalEligibility() == null) ? 0 : getRenewalEligibility().hashCode());
        hashCode = prime * hashCode + ((getRenewalSummary() == null) ? 0 : getRenewalSummary().hashCode());
        hashCode = prime * hashCode + ((getSerial() == null) ? 0 : getSerial().hashCode());
        hashCode = prime * hashCode + ((getSignatureAlgorithm() == null) ? 0 : getSignatureAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSubject() == null) ? 0 : getSubject().hashCode());
        hashCode = prime * hashCode + ((getSubjectAlternativeNames() == null) ? 0 : getSubjectAlternativeNames().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public AwsCertificateManagerCertificateDetails clone() {
        try {
            return (AwsCertificateManagerCertificateDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsCertificateManagerCertificateDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
