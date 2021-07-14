/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the full details of an Amazon Lightsail SSL/TLS certificate.
 * </p>
 * <note>
 * <p>
 * To get a summary of a certificate, use the <code>GetCertificates</code> action and ommit
 * <code>includeCertificateDetails</code> from your request. The response will include only the certificate Amazon
 * Resource Name (ARN), certificate name, domain name, and tags.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/Certificate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Certificate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the certificate (e.g., <code>my-certificate</code>).
     * </p>
     */
    private String name;
    /**
     * <p>
     * The domain name of the certificate.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The validation status of the certificate.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The serial number of the certificate.
     * </p>
     */
    private String serialNumber;
    /**
     * <p>
     * An array of strings that specify the alternate domains (e.g., <code>example2.com</code>) and subdomains (e.g.,
     * <code>blog.example.com</code>) of the certificate.
     * </p>
     */
    private java.util.List<String> subjectAlternativeNames;
    /**
     * <p>
     * An array of objects that describe the domain validation records of the certificate.
     * </p>
     */
    private java.util.List<DomainValidationRecord> domainValidationRecords;
    /**
     * <p>
     * The validation failure reason, if any, of the certificate.
     * </p>
     * <p>
     * The following failure reasons are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>NO_AVAILABLE_CONTACTS</code> </b> - This failure applies to email validation, which is not available
     * for Lightsail certificates.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>ADDITIONAL_VERIFICATION_REQUIRED</code> </b> - Lightsail requires additional information to process
     * this certificate request. This can happen as a fraud-protection measure, such as when the domain ranks within the
     * Alexa top 1000 websites. To provide the required information, use the <a
     * href="https://console.aws.amazon.com/support/home">AWS Support Center</a> to contact AWS Support.
     * </p>
     * <note>
     * <p>
     * You cannot request a certificate for Amazon-owned domain names such as those ending in amazonaws.com,
     * cloudfront.net, or elasticbeanstalk.com.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <b> <code>DOMAIN_NOT_ALLOWED</code> </b> - One or more of the domain names in the certificate request was
     * reported as an unsafe domain by <a href="https://www.virustotal.com/gui/home/url">VirusTotal</a>. To correct the
     * problem, search for your domain name on the <a href="https://www.virustotal.com/gui/home/url">VirusTotal</a>
     * website. If your domain is reported as suspicious, see <a
     * href="https://developers.google.com/web/fundamentals/security/hacked">Google Help for Hacked Websites</a> to
     * learn what you can do.
     * </p>
     * <p>
     * If you believe that the result is a false positive, notify the organization that is reporting the domain.
     * VirusTotal is an aggregate of several antivirus and URL scanners and cannot remove your domain from a block list
     * itself. After you correct the problem and the VirusTotal registry has been updated, request a new certificate.
     * </p>
     * <p>
     * If you see this error and your domain is not included in the VirusTotal list, visit the <a
     * href="https://console.aws.amazon.com/support/home">AWS Support Center</a> and create a case.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>INVALID_PUBLIC_DOMAIN</code> </b> - One or more of the domain names in the certificate request is not
     * valid. Typically, this is because a domain name in the request is not a valid top-level domain. Try to request a
     * certificate again, correcting any spelling errors or typos that were in the failed request, and ensure that all
     * domain names in the request are for valid top-level domains. For example, you cannot request a certificate for
     * <code>example.invalidpublicdomain</code> because <code>invalidpublicdomain</code> is not a valid top-level
     * domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>OTHER</code> </b> - Typically, this failure occurs when there is a typographical error in one or more
     * of the domain names in the certificate request. Try to request a certificate again, correcting any spelling
     * errors or typos that were in the failed request.
     * </p>
     * </li>
     * </ul>
     */
    private String requestFailureReason;
    /**
     * <p>
     * The number of Lightsail resources that the certificate is attached to.
     * </p>
     */
    private Integer inUseResourceCount;
    /**
     * <p>
     * The algorithm used to generate the key pair (the public and private key) of the certificate.
     * </p>
     */
    private String keyAlgorithm;
    /**
     * <p>
     * The timestamp when the certificate was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The timestamp when the certificate was issued.
     * </p>
     */
    private java.util.Date issuedAt;
    /**
     * <p>
     * The certificate authority that issued the certificate.
     * </p>
     */
    private String issuerCA;
    /**
     * <p>
     * The timestamp when the certificate is first valid.
     * </p>
     */
    private java.util.Date notBefore;
    /**
     * <p>
     * The timestamp when the certificate expires.
     * </p>
     */
    private java.util.Date notAfter;
    /**
     * <p>
     * The renewal eligibility of the certificate.
     * </p>
     */
    private String eligibleToRenew;
    /**
     * <p>
     * An object that describes the status of the certificate renewal managed by Lightsail.
     * </p>
     */
    private RenewalSummary renewalSummary;
    /**
     * <p>
     * The timestamp when the certificate was revoked. This value is present only when the certificate status is
     * <code>REVOKED</code>.
     * </p>
     */
    private java.util.Date revokedAt;
    /**
     * <p>
     * The reason the certificate was revoked. This value is present only when the certificate status is
     * <code>REVOKED</code>.
     * </p>
     */
    private String revocationReason;
    /**
     * <p>
     * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-tags">Amazon Lightsail Developer
     * Guide</a>.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The support code. Include this code in your email to support when you have questions about your Lightsail
     * certificate. This code enables our support team to look up your Lightsail information more easily.
     * </p>
     */
    private String supportCode;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the certificate.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the certificate.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the certificate.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the certificate (e.g., <code>my-certificate</code>).
     * </p>
     * 
     * @param name
     *        The name of the certificate (e.g., <code>my-certificate</code>).
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the certificate (e.g., <code>my-certificate</code>).
     * </p>
     * 
     * @return The name of the certificate (e.g., <code>my-certificate</code>).
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the certificate (e.g., <code>my-certificate</code>).
     * </p>
     * 
     * @param name
     *        The name of the certificate (e.g., <code>my-certificate</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The domain name of the certificate.
     * </p>
     * 
     * @param domainName
     *        The domain name of the certificate.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name of the certificate.
     * </p>
     * 
     * @return The domain name of the certificate.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The domain name of the certificate.
     * </p>
     * 
     * @param domainName
     *        The domain name of the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The validation status of the certificate.
     * </p>
     * 
     * @param status
     *        The validation status of the certificate.
     * @see CertificateStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The validation status of the certificate.
     * </p>
     * 
     * @return The validation status of the certificate.
     * @see CertificateStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The validation status of the certificate.
     * </p>
     * 
     * @param status
     *        The validation status of the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateStatus
     */

    public Certificate withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The validation status of the certificate.
     * </p>
     * 
     * @param status
     *        The validation status of the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateStatus
     */

    public Certificate withStatus(CertificateStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The serial number of the certificate.
     * </p>
     * 
     * @param serialNumber
     *        The serial number of the certificate.
     */

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * <p>
     * The serial number of the certificate.
     * </p>
     * 
     * @return The serial number of the certificate.
     */

    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * <p>
     * The serial number of the certificate.
     * </p>
     * 
     * @param serialNumber
     *        The serial number of the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withSerialNumber(String serialNumber) {
        setSerialNumber(serialNumber);
        return this;
    }

    /**
     * <p>
     * An array of strings that specify the alternate domains (e.g., <code>example2.com</code>) and subdomains (e.g.,
     * <code>blog.example.com</code>) of the certificate.
     * </p>
     * 
     * @return An array of strings that specify the alternate domains (e.g., <code>example2.com</code>) and subdomains
     *         (e.g., <code>blog.example.com</code>) of the certificate.
     */

    public java.util.List<String> getSubjectAlternativeNames() {
        return subjectAlternativeNames;
    }

    /**
     * <p>
     * An array of strings that specify the alternate domains (e.g., <code>example2.com</code>) and subdomains (e.g.,
     * <code>blog.example.com</code>) of the certificate.
     * </p>
     * 
     * @param subjectAlternativeNames
     *        An array of strings that specify the alternate domains (e.g., <code>example2.com</code>) and subdomains
     *        (e.g., <code>blog.example.com</code>) of the certificate.
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
     * An array of strings that specify the alternate domains (e.g., <code>example2.com</code>) and subdomains (e.g.,
     * <code>blog.example.com</code>) of the certificate.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubjectAlternativeNames(java.util.Collection)} or
     * {@link #withSubjectAlternativeNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param subjectAlternativeNames
     *        An array of strings that specify the alternate domains (e.g., <code>example2.com</code>) and subdomains
     *        (e.g., <code>blog.example.com</code>) of the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withSubjectAlternativeNames(String... subjectAlternativeNames) {
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
     * An array of strings that specify the alternate domains (e.g., <code>example2.com</code>) and subdomains (e.g.,
     * <code>blog.example.com</code>) of the certificate.
     * </p>
     * 
     * @param subjectAlternativeNames
     *        An array of strings that specify the alternate domains (e.g., <code>example2.com</code>) and subdomains
     *        (e.g., <code>blog.example.com</code>) of the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withSubjectAlternativeNames(java.util.Collection<String> subjectAlternativeNames) {
        setSubjectAlternativeNames(subjectAlternativeNames);
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the domain validation records of the certificate.
     * </p>
     * 
     * @return An array of objects that describe the domain validation records of the certificate.
     */

    public java.util.List<DomainValidationRecord> getDomainValidationRecords() {
        return domainValidationRecords;
    }

    /**
     * <p>
     * An array of objects that describe the domain validation records of the certificate.
     * </p>
     * 
     * @param domainValidationRecords
     *        An array of objects that describe the domain validation records of the certificate.
     */

    public void setDomainValidationRecords(java.util.Collection<DomainValidationRecord> domainValidationRecords) {
        if (domainValidationRecords == null) {
            this.domainValidationRecords = null;
            return;
        }

        this.domainValidationRecords = new java.util.ArrayList<DomainValidationRecord>(domainValidationRecords);
    }

    /**
     * <p>
     * An array of objects that describe the domain validation records of the certificate.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDomainValidationRecords(java.util.Collection)} or
     * {@link #withDomainValidationRecords(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param domainValidationRecords
     *        An array of objects that describe the domain validation records of the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withDomainValidationRecords(DomainValidationRecord... domainValidationRecords) {
        if (this.domainValidationRecords == null) {
            setDomainValidationRecords(new java.util.ArrayList<DomainValidationRecord>(domainValidationRecords.length));
        }
        for (DomainValidationRecord ele : domainValidationRecords) {
            this.domainValidationRecords.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that describe the domain validation records of the certificate.
     * </p>
     * 
     * @param domainValidationRecords
     *        An array of objects that describe the domain validation records of the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withDomainValidationRecords(java.util.Collection<DomainValidationRecord> domainValidationRecords) {
        setDomainValidationRecords(domainValidationRecords);
        return this;
    }

    /**
     * <p>
     * The validation failure reason, if any, of the certificate.
     * </p>
     * <p>
     * The following failure reasons are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>NO_AVAILABLE_CONTACTS</code> </b> - This failure applies to email validation, which is not available
     * for Lightsail certificates.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>ADDITIONAL_VERIFICATION_REQUIRED</code> </b> - Lightsail requires additional information to process
     * this certificate request. This can happen as a fraud-protection measure, such as when the domain ranks within the
     * Alexa top 1000 websites. To provide the required information, use the <a
     * href="https://console.aws.amazon.com/support/home">AWS Support Center</a> to contact AWS Support.
     * </p>
     * <note>
     * <p>
     * You cannot request a certificate for Amazon-owned domain names such as those ending in amazonaws.com,
     * cloudfront.net, or elasticbeanstalk.com.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <b> <code>DOMAIN_NOT_ALLOWED</code> </b> - One or more of the domain names in the certificate request was
     * reported as an unsafe domain by <a href="https://www.virustotal.com/gui/home/url">VirusTotal</a>. To correct the
     * problem, search for your domain name on the <a href="https://www.virustotal.com/gui/home/url">VirusTotal</a>
     * website. If your domain is reported as suspicious, see <a
     * href="https://developers.google.com/web/fundamentals/security/hacked">Google Help for Hacked Websites</a> to
     * learn what you can do.
     * </p>
     * <p>
     * If you believe that the result is a false positive, notify the organization that is reporting the domain.
     * VirusTotal is an aggregate of several antivirus and URL scanners and cannot remove your domain from a block list
     * itself. After you correct the problem and the VirusTotal registry has been updated, request a new certificate.
     * </p>
     * <p>
     * If you see this error and your domain is not included in the VirusTotal list, visit the <a
     * href="https://console.aws.amazon.com/support/home">AWS Support Center</a> and create a case.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>INVALID_PUBLIC_DOMAIN</code> </b> - One or more of the domain names in the certificate request is not
     * valid. Typically, this is because a domain name in the request is not a valid top-level domain. Try to request a
     * certificate again, correcting any spelling errors or typos that were in the failed request, and ensure that all
     * domain names in the request are for valid top-level domains. For example, you cannot request a certificate for
     * <code>example.invalidpublicdomain</code> because <code>invalidpublicdomain</code> is not a valid top-level
     * domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>OTHER</code> </b> - Typically, this failure occurs when there is a typographical error in one or more
     * of the domain names in the certificate request. Try to request a certificate again, correcting any spelling
     * errors or typos that were in the failed request.
     * </p>
     * </li>
     * </ul>
     * 
     * @param requestFailureReason
     *        The validation failure reason, if any, of the certificate.</p>
     *        <p>
     *        The following failure reasons are possible:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>NO_AVAILABLE_CONTACTS</code> </b> - This failure applies to email validation, which is not
     *        available for Lightsail certificates.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>ADDITIONAL_VERIFICATION_REQUIRED</code> </b> - Lightsail requires additional information to
     *        process this certificate request. This can happen as a fraud-protection measure, such as when the domain
     *        ranks within the Alexa top 1000 websites. To provide the required information, use the <a
     *        href="https://console.aws.amazon.com/support/home">AWS Support Center</a> to contact AWS Support.
     *        </p>
     *        <note>
     *        <p>
     *        You cannot request a certificate for Amazon-owned domain names such as those ending in amazonaws.com,
     *        cloudfront.net, or elasticbeanstalk.com.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <b> <code>DOMAIN_NOT_ALLOWED</code> </b> - One or more of the domain names in the certificate request was
     *        reported as an unsafe domain by <a href="https://www.virustotal.com/gui/home/url">VirusTotal</a>. To
     *        correct the problem, search for your domain name on the <a
     *        href="https://www.virustotal.com/gui/home/url">VirusTotal</a> website. If your domain is reported as
     *        suspicious, see <a href="https://developers.google.com/web/fundamentals/security/hacked">Google Help for
     *        Hacked Websites</a> to learn what you can do.
     *        </p>
     *        <p>
     *        If you believe that the result is a false positive, notify the organization that is reporting the domain.
     *        VirusTotal is an aggregate of several antivirus and URL scanners and cannot remove your domain from a
     *        block list itself. After you correct the problem and the VirusTotal registry has been updated, request a
     *        new certificate.
     *        </p>
     *        <p>
     *        If you see this error and your domain is not included in the VirusTotal list, visit the <a
     *        href="https://console.aws.amazon.com/support/home">AWS Support Center</a> and create a case.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>INVALID_PUBLIC_DOMAIN</code> </b> - One or more of the domain names in the certificate request
     *        is not valid. Typically, this is because a domain name in the request is not a valid top-level domain. Try
     *        to request a certificate again, correcting any spelling errors or typos that were in the failed request,
     *        and ensure that all domain names in the request are for valid top-level domains. For example, you cannot
     *        request a certificate for <code>example.invalidpublicdomain</code> because
     *        <code>invalidpublicdomain</code> is not a valid top-level domain.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>OTHER</code> </b> - Typically, this failure occurs when there is a typographical error in one or
     *        more of the domain names in the certificate request. Try to request a certificate again, correcting any
     *        spelling errors or typos that were in the failed request.
     *        </p>
     *        </li>
     */

    public void setRequestFailureReason(String requestFailureReason) {
        this.requestFailureReason = requestFailureReason;
    }

    /**
     * <p>
     * The validation failure reason, if any, of the certificate.
     * </p>
     * <p>
     * The following failure reasons are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>NO_AVAILABLE_CONTACTS</code> </b> - This failure applies to email validation, which is not available
     * for Lightsail certificates.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>ADDITIONAL_VERIFICATION_REQUIRED</code> </b> - Lightsail requires additional information to process
     * this certificate request. This can happen as a fraud-protection measure, such as when the domain ranks within the
     * Alexa top 1000 websites. To provide the required information, use the <a
     * href="https://console.aws.amazon.com/support/home">AWS Support Center</a> to contact AWS Support.
     * </p>
     * <note>
     * <p>
     * You cannot request a certificate for Amazon-owned domain names such as those ending in amazonaws.com,
     * cloudfront.net, or elasticbeanstalk.com.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <b> <code>DOMAIN_NOT_ALLOWED</code> </b> - One or more of the domain names in the certificate request was
     * reported as an unsafe domain by <a href="https://www.virustotal.com/gui/home/url">VirusTotal</a>. To correct the
     * problem, search for your domain name on the <a href="https://www.virustotal.com/gui/home/url">VirusTotal</a>
     * website. If your domain is reported as suspicious, see <a
     * href="https://developers.google.com/web/fundamentals/security/hacked">Google Help for Hacked Websites</a> to
     * learn what you can do.
     * </p>
     * <p>
     * If you believe that the result is a false positive, notify the organization that is reporting the domain.
     * VirusTotal is an aggregate of several antivirus and URL scanners and cannot remove your domain from a block list
     * itself. After you correct the problem and the VirusTotal registry has been updated, request a new certificate.
     * </p>
     * <p>
     * If you see this error and your domain is not included in the VirusTotal list, visit the <a
     * href="https://console.aws.amazon.com/support/home">AWS Support Center</a> and create a case.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>INVALID_PUBLIC_DOMAIN</code> </b> - One or more of the domain names in the certificate request is not
     * valid. Typically, this is because a domain name in the request is not a valid top-level domain. Try to request a
     * certificate again, correcting any spelling errors or typos that were in the failed request, and ensure that all
     * domain names in the request are for valid top-level domains. For example, you cannot request a certificate for
     * <code>example.invalidpublicdomain</code> because <code>invalidpublicdomain</code> is not a valid top-level
     * domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>OTHER</code> </b> - Typically, this failure occurs when there is a typographical error in one or more
     * of the domain names in the certificate request. Try to request a certificate again, correcting any spelling
     * errors or typos that were in the failed request.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The validation failure reason, if any, of the certificate.</p>
     *         <p>
     *         The following failure reasons are possible:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>NO_AVAILABLE_CONTACTS</code> </b> - This failure applies to email validation, which is not
     *         available for Lightsail certificates.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>ADDITIONAL_VERIFICATION_REQUIRED</code> </b> - Lightsail requires additional information to
     *         process this certificate request. This can happen as a fraud-protection measure, such as when the domain
     *         ranks within the Alexa top 1000 websites. To provide the required information, use the <a
     *         href="https://console.aws.amazon.com/support/home">AWS Support Center</a> to contact AWS Support.
     *         </p>
     *         <note>
     *         <p>
     *         You cannot request a certificate for Amazon-owned domain names such as those ending in amazonaws.com,
     *         cloudfront.net, or elasticbeanstalk.com.
     *         </p>
     *         </note></li>
     *         <li>
     *         <p>
     *         <b> <code>DOMAIN_NOT_ALLOWED</code> </b> - One or more of the domain names in the certificate request was
     *         reported as an unsafe domain by <a href="https://www.virustotal.com/gui/home/url">VirusTotal</a>. To
     *         correct the problem, search for your domain name on the <a
     *         href="https://www.virustotal.com/gui/home/url">VirusTotal</a> website. If your domain is reported as
     *         suspicious, see <a href="https://developers.google.com/web/fundamentals/security/hacked">Google Help for
     *         Hacked Websites</a> to learn what you can do.
     *         </p>
     *         <p>
     *         If you believe that the result is a false positive, notify the organization that is reporting the domain.
     *         VirusTotal is an aggregate of several antivirus and URL scanners and cannot remove your domain from a
     *         block list itself. After you correct the problem and the VirusTotal registry has been updated, request a
     *         new certificate.
     *         </p>
     *         <p>
     *         If you see this error and your domain is not included in the VirusTotal list, visit the <a
     *         href="https://console.aws.amazon.com/support/home">AWS Support Center</a> and create a case.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>INVALID_PUBLIC_DOMAIN</code> </b> - One or more of the domain names in the certificate request
     *         is not valid. Typically, this is because a domain name in the request is not a valid top-level domain.
     *         Try to request a certificate again, correcting any spelling errors or typos that were in the failed
     *         request, and ensure that all domain names in the request are for valid top-level domains. For example,
     *         you cannot request a certificate for <code>example.invalidpublicdomain</code> because
     *         <code>invalidpublicdomain</code> is not a valid top-level domain.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>OTHER</code> </b> - Typically, this failure occurs when there is a typographical error in one
     *         or more of the domain names in the certificate request. Try to request a certificate again, correcting
     *         any spelling errors or typos that were in the failed request.
     *         </p>
     *         </li>
     */

    public String getRequestFailureReason() {
        return this.requestFailureReason;
    }

    /**
     * <p>
     * The validation failure reason, if any, of the certificate.
     * </p>
     * <p>
     * The following failure reasons are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>NO_AVAILABLE_CONTACTS</code> </b> - This failure applies to email validation, which is not available
     * for Lightsail certificates.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>ADDITIONAL_VERIFICATION_REQUIRED</code> </b> - Lightsail requires additional information to process
     * this certificate request. This can happen as a fraud-protection measure, such as when the domain ranks within the
     * Alexa top 1000 websites. To provide the required information, use the <a
     * href="https://console.aws.amazon.com/support/home">AWS Support Center</a> to contact AWS Support.
     * </p>
     * <note>
     * <p>
     * You cannot request a certificate for Amazon-owned domain names such as those ending in amazonaws.com,
     * cloudfront.net, or elasticbeanstalk.com.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <b> <code>DOMAIN_NOT_ALLOWED</code> </b> - One or more of the domain names in the certificate request was
     * reported as an unsafe domain by <a href="https://www.virustotal.com/gui/home/url">VirusTotal</a>. To correct the
     * problem, search for your domain name on the <a href="https://www.virustotal.com/gui/home/url">VirusTotal</a>
     * website. If your domain is reported as suspicious, see <a
     * href="https://developers.google.com/web/fundamentals/security/hacked">Google Help for Hacked Websites</a> to
     * learn what you can do.
     * </p>
     * <p>
     * If you believe that the result is a false positive, notify the organization that is reporting the domain.
     * VirusTotal is an aggregate of several antivirus and URL scanners and cannot remove your domain from a block list
     * itself. After you correct the problem and the VirusTotal registry has been updated, request a new certificate.
     * </p>
     * <p>
     * If you see this error and your domain is not included in the VirusTotal list, visit the <a
     * href="https://console.aws.amazon.com/support/home">AWS Support Center</a> and create a case.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>INVALID_PUBLIC_DOMAIN</code> </b> - One or more of the domain names in the certificate request is not
     * valid. Typically, this is because a domain name in the request is not a valid top-level domain. Try to request a
     * certificate again, correcting any spelling errors or typos that were in the failed request, and ensure that all
     * domain names in the request are for valid top-level domains. For example, you cannot request a certificate for
     * <code>example.invalidpublicdomain</code> because <code>invalidpublicdomain</code> is not a valid top-level
     * domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>OTHER</code> </b> - Typically, this failure occurs when there is a typographical error in one or more
     * of the domain names in the certificate request. Try to request a certificate again, correcting any spelling
     * errors or typos that were in the failed request.
     * </p>
     * </li>
     * </ul>
     * 
     * @param requestFailureReason
     *        The validation failure reason, if any, of the certificate.</p>
     *        <p>
     *        The following failure reasons are possible:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>NO_AVAILABLE_CONTACTS</code> </b> - This failure applies to email validation, which is not
     *        available for Lightsail certificates.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>ADDITIONAL_VERIFICATION_REQUIRED</code> </b> - Lightsail requires additional information to
     *        process this certificate request. This can happen as a fraud-protection measure, such as when the domain
     *        ranks within the Alexa top 1000 websites. To provide the required information, use the <a
     *        href="https://console.aws.amazon.com/support/home">AWS Support Center</a> to contact AWS Support.
     *        </p>
     *        <note>
     *        <p>
     *        You cannot request a certificate for Amazon-owned domain names such as those ending in amazonaws.com,
     *        cloudfront.net, or elasticbeanstalk.com.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <b> <code>DOMAIN_NOT_ALLOWED</code> </b> - One or more of the domain names in the certificate request was
     *        reported as an unsafe domain by <a href="https://www.virustotal.com/gui/home/url">VirusTotal</a>. To
     *        correct the problem, search for your domain name on the <a
     *        href="https://www.virustotal.com/gui/home/url">VirusTotal</a> website. If your domain is reported as
     *        suspicious, see <a href="https://developers.google.com/web/fundamentals/security/hacked">Google Help for
     *        Hacked Websites</a> to learn what you can do.
     *        </p>
     *        <p>
     *        If you believe that the result is a false positive, notify the organization that is reporting the domain.
     *        VirusTotal is an aggregate of several antivirus and URL scanners and cannot remove your domain from a
     *        block list itself. After you correct the problem and the VirusTotal registry has been updated, request a
     *        new certificate.
     *        </p>
     *        <p>
     *        If you see this error and your domain is not included in the VirusTotal list, visit the <a
     *        href="https://console.aws.amazon.com/support/home">AWS Support Center</a> and create a case.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>INVALID_PUBLIC_DOMAIN</code> </b> - One or more of the domain names in the certificate request
     *        is not valid. Typically, this is because a domain name in the request is not a valid top-level domain. Try
     *        to request a certificate again, correcting any spelling errors or typos that were in the failed request,
     *        and ensure that all domain names in the request are for valid top-level domains. For example, you cannot
     *        request a certificate for <code>example.invalidpublicdomain</code> because
     *        <code>invalidpublicdomain</code> is not a valid top-level domain.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>OTHER</code> </b> - Typically, this failure occurs when there is a typographical error in one or
     *        more of the domain names in the certificate request. Try to request a certificate again, correcting any
     *        spelling errors or typos that were in the failed request.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withRequestFailureReason(String requestFailureReason) {
        setRequestFailureReason(requestFailureReason);
        return this;
    }

    /**
     * <p>
     * The number of Lightsail resources that the certificate is attached to.
     * </p>
     * 
     * @param inUseResourceCount
     *        The number of Lightsail resources that the certificate is attached to.
     */

    public void setInUseResourceCount(Integer inUseResourceCount) {
        this.inUseResourceCount = inUseResourceCount;
    }

    /**
     * <p>
     * The number of Lightsail resources that the certificate is attached to.
     * </p>
     * 
     * @return The number of Lightsail resources that the certificate is attached to.
     */

    public Integer getInUseResourceCount() {
        return this.inUseResourceCount;
    }

    /**
     * <p>
     * The number of Lightsail resources that the certificate is attached to.
     * </p>
     * 
     * @param inUseResourceCount
     *        The number of Lightsail resources that the certificate is attached to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withInUseResourceCount(Integer inUseResourceCount) {
        setInUseResourceCount(inUseResourceCount);
        return this;
    }

    /**
     * <p>
     * The algorithm used to generate the key pair (the public and private key) of the certificate.
     * </p>
     * 
     * @param keyAlgorithm
     *        The algorithm used to generate the key pair (the public and private key) of the certificate.
     */

    public void setKeyAlgorithm(String keyAlgorithm) {
        this.keyAlgorithm = keyAlgorithm;
    }

    /**
     * <p>
     * The algorithm used to generate the key pair (the public and private key) of the certificate.
     * </p>
     * 
     * @return The algorithm used to generate the key pair (the public and private key) of the certificate.
     */

    public String getKeyAlgorithm() {
        return this.keyAlgorithm;
    }

    /**
     * <p>
     * The algorithm used to generate the key pair (the public and private key) of the certificate.
     * </p>
     * 
     * @param keyAlgorithm
     *        The algorithm used to generate the key pair (the public and private key) of the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withKeyAlgorithm(String keyAlgorithm) {
        setKeyAlgorithm(keyAlgorithm);
        return this;
    }

    /**
     * <p>
     * The timestamp when the certificate was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the certificate was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp when the certificate was created.
     * </p>
     * 
     * @return The timestamp when the certificate was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp when the certificate was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the certificate was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The timestamp when the certificate was issued.
     * </p>
     * 
     * @param issuedAt
     *        The timestamp when the certificate was issued.
     */

    public void setIssuedAt(java.util.Date issuedAt) {
        this.issuedAt = issuedAt;
    }

    /**
     * <p>
     * The timestamp when the certificate was issued.
     * </p>
     * 
     * @return The timestamp when the certificate was issued.
     */

    public java.util.Date getIssuedAt() {
        return this.issuedAt;
    }

    /**
     * <p>
     * The timestamp when the certificate was issued.
     * </p>
     * 
     * @param issuedAt
     *        The timestamp when the certificate was issued.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withIssuedAt(java.util.Date issuedAt) {
        setIssuedAt(issuedAt);
        return this;
    }

    /**
     * <p>
     * The certificate authority that issued the certificate.
     * </p>
     * 
     * @param issuerCA
     *        The certificate authority that issued the certificate.
     */

    public void setIssuerCA(String issuerCA) {
        this.issuerCA = issuerCA;
    }

    /**
     * <p>
     * The certificate authority that issued the certificate.
     * </p>
     * 
     * @return The certificate authority that issued the certificate.
     */

    public String getIssuerCA() {
        return this.issuerCA;
    }

    /**
     * <p>
     * The certificate authority that issued the certificate.
     * </p>
     * 
     * @param issuerCA
     *        The certificate authority that issued the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withIssuerCA(String issuerCA) {
        setIssuerCA(issuerCA);
        return this;
    }

    /**
     * <p>
     * The timestamp when the certificate is first valid.
     * </p>
     * 
     * @param notBefore
     *        The timestamp when the certificate is first valid.
     */

    public void setNotBefore(java.util.Date notBefore) {
        this.notBefore = notBefore;
    }

    /**
     * <p>
     * The timestamp when the certificate is first valid.
     * </p>
     * 
     * @return The timestamp when the certificate is first valid.
     */

    public java.util.Date getNotBefore() {
        return this.notBefore;
    }

    /**
     * <p>
     * The timestamp when the certificate is first valid.
     * </p>
     * 
     * @param notBefore
     *        The timestamp when the certificate is first valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withNotBefore(java.util.Date notBefore) {
        setNotBefore(notBefore);
        return this;
    }

    /**
     * <p>
     * The timestamp when the certificate expires.
     * </p>
     * 
     * @param notAfter
     *        The timestamp when the certificate expires.
     */

    public void setNotAfter(java.util.Date notAfter) {
        this.notAfter = notAfter;
    }

    /**
     * <p>
     * The timestamp when the certificate expires.
     * </p>
     * 
     * @return The timestamp when the certificate expires.
     */

    public java.util.Date getNotAfter() {
        return this.notAfter;
    }

    /**
     * <p>
     * The timestamp when the certificate expires.
     * </p>
     * 
     * @param notAfter
     *        The timestamp when the certificate expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withNotAfter(java.util.Date notAfter) {
        setNotAfter(notAfter);
        return this;
    }

    /**
     * <p>
     * The renewal eligibility of the certificate.
     * </p>
     * 
     * @param eligibleToRenew
     *        The renewal eligibility of the certificate.
     */

    public void setEligibleToRenew(String eligibleToRenew) {
        this.eligibleToRenew = eligibleToRenew;
    }

    /**
     * <p>
     * The renewal eligibility of the certificate.
     * </p>
     * 
     * @return The renewal eligibility of the certificate.
     */

    public String getEligibleToRenew() {
        return this.eligibleToRenew;
    }

    /**
     * <p>
     * The renewal eligibility of the certificate.
     * </p>
     * 
     * @param eligibleToRenew
     *        The renewal eligibility of the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withEligibleToRenew(String eligibleToRenew) {
        setEligibleToRenew(eligibleToRenew);
        return this;
    }

    /**
     * <p>
     * An object that describes the status of the certificate renewal managed by Lightsail.
     * </p>
     * 
     * @param renewalSummary
     *        An object that describes the status of the certificate renewal managed by Lightsail.
     */

    public void setRenewalSummary(RenewalSummary renewalSummary) {
        this.renewalSummary = renewalSummary;
    }

    /**
     * <p>
     * An object that describes the status of the certificate renewal managed by Lightsail.
     * </p>
     * 
     * @return An object that describes the status of the certificate renewal managed by Lightsail.
     */

    public RenewalSummary getRenewalSummary() {
        return this.renewalSummary;
    }

    /**
     * <p>
     * An object that describes the status of the certificate renewal managed by Lightsail.
     * </p>
     * 
     * @param renewalSummary
     *        An object that describes the status of the certificate renewal managed by Lightsail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withRenewalSummary(RenewalSummary renewalSummary) {
        setRenewalSummary(renewalSummary);
        return this;
    }

    /**
     * <p>
     * The timestamp when the certificate was revoked. This value is present only when the certificate status is
     * <code>REVOKED</code>.
     * </p>
     * 
     * @param revokedAt
     *        The timestamp when the certificate was revoked. This value is present only when the certificate status is
     *        <code>REVOKED</code>.
     */

    public void setRevokedAt(java.util.Date revokedAt) {
        this.revokedAt = revokedAt;
    }

    /**
     * <p>
     * The timestamp when the certificate was revoked. This value is present only when the certificate status is
     * <code>REVOKED</code>.
     * </p>
     * 
     * @return The timestamp when the certificate was revoked. This value is present only when the certificate status is
     *         <code>REVOKED</code>.
     */

    public java.util.Date getRevokedAt() {
        return this.revokedAt;
    }

    /**
     * <p>
     * The timestamp when the certificate was revoked. This value is present only when the certificate status is
     * <code>REVOKED</code>.
     * </p>
     * 
     * @param revokedAt
     *        The timestamp when the certificate was revoked. This value is present only when the certificate status is
     *        <code>REVOKED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withRevokedAt(java.util.Date revokedAt) {
        setRevokedAt(revokedAt);
        return this;
    }

    /**
     * <p>
     * The reason the certificate was revoked. This value is present only when the certificate status is
     * <code>REVOKED</code>.
     * </p>
     * 
     * @param revocationReason
     *        The reason the certificate was revoked. This value is present only when the certificate status is
     *        <code>REVOKED</code>.
     */

    public void setRevocationReason(String revocationReason) {
        this.revocationReason = revocationReason;
    }

    /**
     * <p>
     * The reason the certificate was revoked. This value is present only when the certificate status is
     * <code>REVOKED</code>.
     * </p>
     * 
     * @return The reason the certificate was revoked. This value is present only when the certificate status is
     *         <code>REVOKED</code>.
     */

    public String getRevocationReason() {
        return this.revocationReason;
    }

    /**
     * <p>
     * The reason the certificate was revoked. This value is present only when the certificate status is
     * <code>REVOKED</code>.
     * </p>
     * 
     * @param revocationReason
     *        The reason the certificate was revoked. This value is present only when the certificate status is
     *        <code>REVOKED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withRevocationReason(String revocationReason) {
        setRevocationReason(revocationReason);
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-tags">Amazon Lightsail Developer
     * Guide</a>.
     * </p>
     * 
     * @return The tag keys and optional values for the resource. For more information about tags in Lightsail, see the
     *         <a href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-tags">Amazon Lightsail
     *         Developer Guide</a>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-tags">Amazon Lightsail Developer
     * Guide</a>.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values for the resource. For more information about tags in Lightsail, see the
     *        <a href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-tags">Amazon Lightsail
     *        Developer Guide</a>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-tags">Amazon Lightsail Developer
     * Guide</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values for the resource. For more information about tags in Lightsail, see the
     *        <a href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-tags">Amazon Lightsail
     *        Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the <a
     * href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-tags">Amazon Lightsail Developer
     * Guide</a>.
     * </p>
     * 
     * @param tags
     *        The tag keys and optional values for the resource. For more information about tags in Lightsail, see the
     *        <a href="https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-tags">Amazon Lightsail
     *        Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you have questions about your Lightsail
     * certificate. This code enables our support team to look up your Lightsail information more easily.
     * </p>
     * 
     * @param supportCode
     *        The support code. Include this code in your email to support when you have questions about your Lightsail
     *        certificate. This code enables our support team to look up your Lightsail information more easily.
     */

    public void setSupportCode(String supportCode) {
        this.supportCode = supportCode;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you have questions about your Lightsail
     * certificate. This code enables our support team to look up your Lightsail information more easily.
     * </p>
     * 
     * @return The support code. Include this code in your email to support when you have questions about your Lightsail
     *         certificate. This code enables our support team to look up your Lightsail information more easily.
     */

    public String getSupportCode() {
        return this.supportCode;
    }

    /**
     * <p>
     * The support code. Include this code in your email to support when you have questions about your Lightsail
     * certificate. This code enables our support team to look up your Lightsail information more easily.
     * </p>
     * 
     * @param supportCode
     *        The support code. Include this code in your email to support when you have questions about your Lightsail
     *        certificate. This code enables our support team to look up your Lightsail information more easily.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Certificate withSupportCode(String supportCode) {
        setSupportCode(supportCode);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSerialNumber() != null)
            sb.append("SerialNumber: ").append(getSerialNumber()).append(",");
        if (getSubjectAlternativeNames() != null)
            sb.append("SubjectAlternativeNames: ").append(getSubjectAlternativeNames()).append(",");
        if (getDomainValidationRecords() != null)
            sb.append("DomainValidationRecords: ").append(getDomainValidationRecords()).append(",");
        if (getRequestFailureReason() != null)
            sb.append("RequestFailureReason: ").append(getRequestFailureReason()).append(",");
        if (getInUseResourceCount() != null)
            sb.append("InUseResourceCount: ").append(getInUseResourceCount()).append(",");
        if (getKeyAlgorithm() != null)
            sb.append("KeyAlgorithm: ").append(getKeyAlgorithm()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getIssuedAt() != null)
            sb.append("IssuedAt: ").append(getIssuedAt()).append(",");
        if (getIssuerCA() != null)
            sb.append("IssuerCA: ").append(getIssuerCA()).append(",");
        if (getNotBefore() != null)
            sb.append("NotBefore: ").append(getNotBefore()).append(",");
        if (getNotAfter() != null)
            sb.append("NotAfter: ").append(getNotAfter()).append(",");
        if (getEligibleToRenew() != null)
            sb.append("EligibleToRenew: ").append(getEligibleToRenew()).append(",");
        if (getRenewalSummary() != null)
            sb.append("RenewalSummary: ").append(getRenewalSummary()).append(",");
        if (getRevokedAt() != null)
            sb.append("RevokedAt: ").append(getRevokedAt()).append(",");
        if (getRevocationReason() != null)
            sb.append("RevocationReason: ").append(getRevocationReason()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getSupportCode() != null)
            sb.append("SupportCode: ").append(getSupportCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Certificate == false)
            return false;
        Certificate other = (Certificate) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSerialNumber() == null ^ this.getSerialNumber() == null)
            return false;
        if (other.getSerialNumber() != null && other.getSerialNumber().equals(this.getSerialNumber()) == false)
            return false;
        if (other.getSubjectAlternativeNames() == null ^ this.getSubjectAlternativeNames() == null)
            return false;
        if (other.getSubjectAlternativeNames() != null && other.getSubjectAlternativeNames().equals(this.getSubjectAlternativeNames()) == false)
            return false;
        if (other.getDomainValidationRecords() == null ^ this.getDomainValidationRecords() == null)
            return false;
        if (other.getDomainValidationRecords() != null && other.getDomainValidationRecords().equals(this.getDomainValidationRecords()) == false)
            return false;
        if (other.getRequestFailureReason() == null ^ this.getRequestFailureReason() == null)
            return false;
        if (other.getRequestFailureReason() != null && other.getRequestFailureReason().equals(this.getRequestFailureReason()) == false)
            return false;
        if (other.getInUseResourceCount() == null ^ this.getInUseResourceCount() == null)
            return false;
        if (other.getInUseResourceCount() != null && other.getInUseResourceCount().equals(this.getInUseResourceCount()) == false)
            return false;
        if (other.getKeyAlgorithm() == null ^ this.getKeyAlgorithm() == null)
            return false;
        if (other.getKeyAlgorithm() != null && other.getKeyAlgorithm().equals(this.getKeyAlgorithm()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getIssuedAt() == null ^ this.getIssuedAt() == null)
            return false;
        if (other.getIssuedAt() != null && other.getIssuedAt().equals(this.getIssuedAt()) == false)
            return false;
        if (other.getIssuerCA() == null ^ this.getIssuerCA() == null)
            return false;
        if (other.getIssuerCA() != null && other.getIssuerCA().equals(this.getIssuerCA()) == false)
            return false;
        if (other.getNotBefore() == null ^ this.getNotBefore() == null)
            return false;
        if (other.getNotBefore() != null && other.getNotBefore().equals(this.getNotBefore()) == false)
            return false;
        if (other.getNotAfter() == null ^ this.getNotAfter() == null)
            return false;
        if (other.getNotAfter() != null && other.getNotAfter().equals(this.getNotAfter()) == false)
            return false;
        if (other.getEligibleToRenew() == null ^ this.getEligibleToRenew() == null)
            return false;
        if (other.getEligibleToRenew() != null && other.getEligibleToRenew().equals(this.getEligibleToRenew()) == false)
            return false;
        if (other.getRenewalSummary() == null ^ this.getRenewalSummary() == null)
            return false;
        if (other.getRenewalSummary() != null && other.getRenewalSummary().equals(this.getRenewalSummary()) == false)
            return false;
        if (other.getRevokedAt() == null ^ this.getRevokedAt() == null)
            return false;
        if (other.getRevokedAt() != null && other.getRevokedAt().equals(this.getRevokedAt()) == false)
            return false;
        if (other.getRevocationReason() == null ^ this.getRevocationReason() == null)
            return false;
        if (other.getRevocationReason() != null && other.getRevocationReason().equals(this.getRevocationReason()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getSupportCode() == null ^ this.getSupportCode() == null)
            return false;
        if (other.getSupportCode() != null && other.getSupportCode().equals(this.getSupportCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSerialNumber() == null) ? 0 : getSerialNumber().hashCode());
        hashCode = prime * hashCode + ((getSubjectAlternativeNames() == null) ? 0 : getSubjectAlternativeNames().hashCode());
        hashCode = prime * hashCode + ((getDomainValidationRecords() == null) ? 0 : getDomainValidationRecords().hashCode());
        hashCode = prime * hashCode + ((getRequestFailureReason() == null) ? 0 : getRequestFailureReason().hashCode());
        hashCode = prime * hashCode + ((getInUseResourceCount() == null) ? 0 : getInUseResourceCount().hashCode());
        hashCode = prime * hashCode + ((getKeyAlgorithm() == null) ? 0 : getKeyAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getIssuedAt() == null) ? 0 : getIssuedAt().hashCode());
        hashCode = prime * hashCode + ((getIssuerCA() == null) ? 0 : getIssuerCA().hashCode());
        hashCode = prime * hashCode + ((getNotBefore() == null) ? 0 : getNotBefore().hashCode());
        hashCode = prime * hashCode + ((getNotAfter() == null) ? 0 : getNotAfter().hashCode());
        hashCode = prime * hashCode + ((getEligibleToRenew() == null) ? 0 : getEligibleToRenew().hashCode());
        hashCode = prime * hashCode + ((getRenewalSummary() == null) ? 0 : getRenewalSummary().hashCode());
        hashCode = prime * hashCode + ((getRevokedAt() == null) ? 0 : getRevokedAt().hashCode());
        hashCode = prime * hashCode + ((getRevocationReason() == null) ? 0 : getRevocationReason().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getSupportCode() == null) ? 0 : getSupportCode().hashCode());
        return hashCode;
    }

    @Override
    public Certificate clone() {
        try {
            return (Certificate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.CertificateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
