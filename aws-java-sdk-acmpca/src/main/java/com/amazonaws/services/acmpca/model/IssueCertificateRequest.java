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
package com.amazonaws.services.acmpca.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/IssueCertificate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IssueCertificateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies X.509 certificate information to be included in the issued certificate. An <code>APIPassthrough</code>
     * or <code>APICSRPassthrough</code> template variant must be selected, or else this parameter is ignored. For more
     * information about using these templates, see <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/userguide/UsingTemplates.html">Understanding Certificate
     * Templates</a>.
     * </p>
     * <p>
     * If conflicting or duplicate certificate information is supplied during certificate issuance, ACM Private CA
     * applies <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/userguide/UsingTemplates.html#template-order-of-operations"
     * >order of operation rules</a> to determine what information is used.
     * </p>
     */
    private ApiPassthrough apiPassthrough;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_CreateCertificateAuthority.html"
     * >CreateCertificateAuthority</a>. This must be of the form:
     * </p>
     * <p>
     * <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     * </p>
     */
    private String certificateAuthorityArn;
    /**
     * <p>
     * The certificate signing request (CSR) for the certificate you want to issue. As an example, you can use the
     * following OpenSSL command to create the CSR and a 2048 bit RSA private key.
     * </p>
     * <p>
     * <code>openssl req -new -newkey rsa:2048 -days 365 -keyout private/test_cert_priv_key.pem -out csr/test_cert_.csr</code>
     * </p>
     * <p>
     * If you have a configuration file, you can then use the following OpenSSL command. The <code>usr_cert</code> block
     * in the configuration file contains your X509 version 3 extensions.
     * </p>
     * <p>
     * <code>openssl req -new -config openssl_rsa.cnf -extensions usr_cert -newkey rsa:2048 -days -365 -keyout private/test_cert_priv_key.pem -out csr/test_cert_.csr</code>
     * </p>
     * <p>
     * Note: A CSR must provide either a <i>subject name</i> or a <i>subject alternative name</i> or the request will be
     * rejected.
     * </p>
     */
    private java.nio.ByteBuffer csr;
    /**
     * <p>
     * The name of the algorithm that will be used to sign the certificate to be issued.
     * </p>
     * <p>
     * This parameter should not be confused with the <code>SigningAlgorithm</code> parameter used to sign a CSR in the
     * <code>CreateCertificateAuthority</code> action.
     * </p>
     */
    private String signingAlgorithm;
    /**
     * <p>
     * Specifies a custom configuration template to use when issuing a certificate. If this parameter is not provided,
     * ACM Private CA defaults to the <code>EndEntityCertificate/V1</code> template. For CA certificates, you should
     * choose the shortest path length that meets your needs. The path length is indicated by the PathLen<i>N</i>
     * portion of the ARN, where <i>N</i> is the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/userguide/PcaTerms.html#terms-cadepth">CA depth</a>.
     * </p>
     * <p>
     * Note: The CA depth configured on a subordinate CA certificate must not exceed the limit set by its parents in the
     * CA hierarchy.
     * </p>
     * <p>
     * For a list of <code>TemplateArn</code> values supported by ACM Private CA, see <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/userguide/UsingTemplates.html">Understanding Certificate
     * Templates</a>.
     * </p>
     */
    private String templateArn;
    /**
     * <p>
     * Information describing the end of the validity period of the certificate. This parameter sets the “Not After”
     * date for the certificate.
     * </p>
     * <p>
     * Certificate validity is the period of time during which a certificate is valid. Validity can be expressed as an
     * explicit date and time when the certificate expires, or as a span of time after issuance, stated in days, months,
     * or years. For more information, see <a href="https://tools.ietf.org/html/rfc5280#section-4.1.2.5">Validity</a> in
     * RFC 5280.
     * </p>
     * <p>
     * This value is unaffected when <code>ValidityNotBefore</code> is also specified. For example, if
     * <code>Validity</code> is set to 20 days in the future, the certificate will expire 20 days from issuance time
     * regardless of the <code>ValidityNotBefore</code> value.
     * </p>
     * <p>
     * The end of the validity period configured on a certificate must not exceed the limit set on its parents in the CA
     * hierarchy.
     * </p>
     */
    private Validity validity;
    /**
     * <p>
     * Information describing the start of the validity period of the certificate. This parameter sets the “Not Before"
     * date for the certificate.
     * </p>
     * <p>
     * By default, when issuing a certificate, ACM Private CA sets the "Not Before" date to the issuance time minus 60
     * minutes. This compensates for clock inconsistencies across computer systems. The <code>ValidityNotBefore</code>
     * parameter can be used to customize the “Not Before” value.
     * </p>
     * <p>
     * Unlike the <code>Validity</code> parameter, the <code>ValidityNotBefore</code> parameter is optional.
     * </p>
     * <p>
     * The <code>ValidityNotBefore</code> value is expressed as an explicit date and time, using the
     * <code>Validity</code> type value <code>ABSOLUTE</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_Validity.html">Validity</a> in this API
     * reference and <a href="https://tools.ietf.org/html/rfc5280#section-4.1.2.5">Validity</a> in RFC 5280.
     * </p>
     */
    private Validity validityNotBefore;
    /**
     * <p>
     * Alphanumeric string that can be used to distinguish between calls to the <b>IssueCertificate</b> action.
     * Idempotency tokens for <b>IssueCertificate</b> time out after one minute. Therefore, if you call
     * <b>IssueCertificate</b> multiple times with the same idempotency token within one minute, ACM Private CA
     * recognizes that you are requesting only one certificate and will issue only one. If you change the idempotency
     * token for each call, PCA recognizes that you are requesting multiple certificates.
     * </p>
     */
    private String idempotencyToken;

    /**
     * <p>
     * Specifies X.509 certificate information to be included in the issued certificate. An <code>APIPassthrough</code>
     * or <code>APICSRPassthrough</code> template variant must be selected, or else this parameter is ignored. For more
     * information about using these templates, see <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/userguide/UsingTemplates.html">Understanding Certificate
     * Templates</a>.
     * </p>
     * <p>
     * If conflicting or duplicate certificate information is supplied during certificate issuance, ACM Private CA
     * applies <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/userguide/UsingTemplates.html#template-order-of-operations"
     * >order of operation rules</a> to determine what information is used.
     * </p>
     * 
     * @param apiPassthrough
     *        Specifies X.509 certificate information to be included in the issued certificate. An
     *        <code>APIPassthrough</code> or <code>APICSRPassthrough</code> template variant must be selected, or else
     *        this parameter is ignored. For more information about using these templates, see <a
     *        href="https://docs.aws.amazon.com/acm-pca/latest/userguide/UsingTemplates.html">Understanding Certificate
     *        Templates</a>.</p>
     *        <p>
     *        If conflicting or duplicate certificate information is supplied during certificate issuance, ACM Private
     *        CA applies <a href=
     *        "https://docs.aws.amazon.com/acm-pca/latest/userguide/UsingTemplates.html#template-order-of-operations"
     *        >order of operation rules</a> to determine what information is used.
     */

    public void setApiPassthrough(ApiPassthrough apiPassthrough) {
        this.apiPassthrough = apiPassthrough;
    }

    /**
     * <p>
     * Specifies X.509 certificate information to be included in the issued certificate. An <code>APIPassthrough</code>
     * or <code>APICSRPassthrough</code> template variant must be selected, or else this parameter is ignored. For more
     * information about using these templates, see <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/userguide/UsingTemplates.html">Understanding Certificate
     * Templates</a>.
     * </p>
     * <p>
     * If conflicting or duplicate certificate information is supplied during certificate issuance, ACM Private CA
     * applies <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/userguide/UsingTemplates.html#template-order-of-operations"
     * >order of operation rules</a> to determine what information is used.
     * </p>
     * 
     * @return Specifies X.509 certificate information to be included in the issued certificate. An
     *         <code>APIPassthrough</code> or <code>APICSRPassthrough</code> template variant must be selected, or else
     *         this parameter is ignored. For more information about using these templates, see <a
     *         href="https://docs.aws.amazon.com/acm-pca/latest/userguide/UsingTemplates.html">Understanding Certificate
     *         Templates</a>.</p>
     *         <p>
     *         If conflicting or duplicate certificate information is supplied during certificate issuance, ACM Private
     *         CA applies <a href=
     *         "https://docs.aws.amazon.com/acm-pca/latest/userguide/UsingTemplates.html#template-order-of-operations"
     *         >order of operation rules</a> to determine what information is used.
     */

    public ApiPassthrough getApiPassthrough() {
        return this.apiPassthrough;
    }

    /**
     * <p>
     * Specifies X.509 certificate information to be included in the issued certificate. An <code>APIPassthrough</code>
     * or <code>APICSRPassthrough</code> template variant must be selected, or else this parameter is ignored. For more
     * information about using these templates, see <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/userguide/UsingTemplates.html">Understanding Certificate
     * Templates</a>.
     * </p>
     * <p>
     * If conflicting or duplicate certificate information is supplied during certificate issuance, ACM Private CA
     * applies <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/userguide/UsingTemplates.html#template-order-of-operations"
     * >order of operation rules</a> to determine what information is used.
     * </p>
     * 
     * @param apiPassthrough
     *        Specifies X.509 certificate information to be included in the issued certificate. An
     *        <code>APIPassthrough</code> or <code>APICSRPassthrough</code> template variant must be selected, or else
     *        this parameter is ignored. For more information about using these templates, see <a
     *        href="https://docs.aws.amazon.com/acm-pca/latest/userguide/UsingTemplates.html">Understanding Certificate
     *        Templates</a>.</p>
     *        <p>
     *        If conflicting or duplicate certificate information is supplied during certificate issuance, ACM Private
     *        CA applies <a href=
     *        "https://docs.aws.amazon.com/acm-pca/latest/userguide/UsingTemplates.html#template-order-of-operations"
     *        >order of operation rules</a> to determine what information is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IssueCertificateRequest withApiPassthrough(ApiPassthrough apiPassthrough) {
        setApiPassthrough(apiPassthrough);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_CreateCertificateAuthority.html"
     * >CreateCertificateAuthority</a>. This must be of the form:
     * </p>
     * <p>
     * <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     * </p>
     * 
     * @param certificateAuthorityArn
     *        The Amazon Resource Name (ARN) that was returned when you called <a
     *        href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_CreateCertificateAuthority.html"
     *        >CreateCertificateAuthority</a>. This must be of the form:</p>
     *        <p>
     *        <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     */

    public void setCertificateAuthorityArn(String certificateAuthorityArn) {
        this.certificateAuthorityArn = certificateAuthorityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_CreateCertificateAuthority.html"
     * >CreateCertificateAuthority</a>. This must be of the form:
     * </p>
     * <p>
     * <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that was returned when you called <a
     *         href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_CreateCertificateAuthority.html"
     *         >CreateCertificateAuthority</a>. This must be of the form:</p>
     *         <p>
     *         <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     */

    public String getCertificateAuthorityArn() {
        return this.certificateAuthorityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_CreateCertificateAuthority.html"
     * >CreateCertificateAuthority</a>. This must be of the form:
     * </p>
     * <p>
     * <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     * </p>
     * 
     * @param certificateAuthorityArn
     *        The Amazon Resource Name (ARN) that was returned when you called <a
     *        href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_CreateCertificateAuthority.html"
     *        >CreateCertificateAuthority</a>. This must be of the form:</p>
     *        <p>
     *        <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IssueCertificateRequest withCertificateAuthorityArn(String certificateAuthorityArn) {
        setCertificateAuthorityArn(certificateAuthorityArn);
        return this;
    }

    /**
     * <p>
     * The certificate signing request (CSR) for the certificate you want to issue. As an example, you can use the
     * following OpenSSL command to create the CSR and a 2048 bit RSA private key.
     * </p>
     * <p>
     * <code>openssl req -new -newkey rsa:2048 -days 365 -keyout private/test_cert_priv_key.pem -out csr/test_cert_.csr</code>
     * </p>
     * <p>
     * If you have a configuration file, you can then use the following OpenSSL command. The <code>usr_cert</code> block
     * in the configuration file contains your X509 version 3 extensions.
     * </p>
     * <p>
     * <code>openssl req -new -config openssl_rsa.cnf -extensions usr_cert -newkey rsa:2048 -days -365 -keyout private/test_cert_priv_key.pem -out csr/test_cert_.csr</code>
     * </p>
     * <p>
     * Note: A CSR must provide either a <i>subject name</i> or a <i>subject alternative name</i> or the request will be
     * rejected.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param csr
     *        The certificate signing request (CSR) for the certificate you want to issue. As an example, you can use
     *        the following OpenSSL command to create the CSR and a 2048 bit RSA private key. </p>
     *        <p>
     *        <code>openssl req -new -newkey rsa:2048 -days 365 -keyout private/test_cert_priv_key.pem -out csr/test_cert_.csr</code>
     *        </p>
     *        <p>
     *        If you have a configuration file, you can then use the following OpenSSL command. The
     *        <code>usr_cert</code> block in the configuration file contains your X509 version 3 extensions.
     *        </p>
     *        <p>
     *        <code>openssl req -new -config openssl_rsa.cnf -extensions usr_cert -newkey rsa:2048 -days -365 -keyout private/test_cert_priv_key.pem -out csr/test_cert_.csr</code>
     *        </p>
     *        <p>
     *        Note: A CSR must provide either a <i>subject name</i> or a <i>subject alternative name</i> or the request
     *        will be rejected.
     */

    public void setCsr(java.nio.ByteBuffer csr) {
        this.csr = csr;
    }

    /**
     * <p>
     * The certificate signing request (CSR) for the certificate you want to issue. As an example, you can use the
     * following OpenSSL command to create the CSR and a 2048 bit RSA private key.
     * </p>
     * <p>
     * <code>openssl req -new -newkey rsa:2048 -days 365 -keyout private/test_cert_priv_key.pem -out csr/test_cert_.csr</code>
     * </p>
     * <p>
     * If you have a configuration file, you can then use the following OpenSSL command. The <code>usr_cert</code> block
     * in the configuration file contains your X509 version 3 extensions.
     * </p>
     * <p>
     * <code>openssl req -new -config openssl_rsa.cnf -extensions usr_cert -newkey rsa:2048 -days -365 -keyout private/test_cert_priv_key.pem -out csr/test_cert_.csr</code>
     * </p>
     * <p>
     * Note: A CSR must provide either a <i>subject name</i> or a <i>subject alternative name</i> or the request will be
     * rejected.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The certificate signing request (CSR) for the certificate you want to issue. As an example, you can use
     *         the following OpenSSL command to create the CSR and a 2048 bit RSA private key. </p>
     *         <p>
     *         <code>openssl req -new -newkey rsa:2048 -days 365 -keyout private/test_cert_priv_key.pem -out csr/test_cert_.csr</code>
     *         </p>
     *         <p>
     *         If you have a configuration file, you can then use the following OpenSSL command. The
     *         <code>usr_cert</code> block in the configuration file contains your X509 version 3 extensions.
     *         </p>
     *         <p>
     *         <code>openssl req -new -config openssl_rsa.cnf -extensions usr_cert -newkey rsa:2048 -days -365 -keyout private/test_cert_priv_key.pem -out csr/test_cert_.csr</code>
     *         </p>
     *         <p>
     *         Note: A CSR must provide either a <i>subject name</i> or a <i>subject alternative name</i> or the request
     *         will be rejected.
     */

    public java.nio.ByteBuffer getCsr() {
        return this.csr;
    }

    /**
     * <p>
     * The certificate signing request (CSR) for the certificate you want to issue. As an example, you can use the
     * following OpenSSL command to create the CSR and a 2048 bit RSA private key.
     * </p>
     * <p>
     * <code>openssl req -new -newkey rsa:2048 -days 365 -keyout private/test_cert_priv_key.pem -out csr/test_cert_.csr</code>
     * </p>
     * <p>
     * If you have a configuration file, you can then use the following OpenSSL command. The <code>usr_cert</code> block
     * in the configuration file contains your X509 version 3 extensions.
     * </p>
     * <p>
     * <code>openssl req -new -config openssl_rsa.cnf -extensions usr_cert -newkey rsa:2048 -days -365 -keyout private/test_cert_priv_key.pem -out csr/test_cert_.csr</code>
     * </p>
     * <p>
     * Note: A CSR must provide either a <i>subject name</i> or a <i>subject alternative name</i> or the request will be
     * rejected.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param csr
     *        The certificate signing request (CSR) for the certificate you want to issue. As an example, you can use
     *        the following OpenSSL command to create the CSR and a 2048 bit RSA private key. </p>
     *        <p>
     *        <code>openssl req -new -newkey rsa:2048 -days 365 -keyout private/test_cert_priv_key.pem -out csr/test_cert_.csr</code>
     *        </p>
     *        <p>
     *        If you have a configuration file, you can then use the following OpenSSL command. The
     *        <code>usr_cert</code> block in the configuration file contains your X509 version 3 extensions.
     *        </p>
     *        <p>
     *        <code>openssl req -new -config openssl_rsa.cnf -extensions usr_cert -newkey rsa:2048 -days -365 -keyout private/test_cert_priv_key.pem -out csr/test_cert_.csr</code>
     *        </p>
     *        <p>
     *        Note: A CSR must provide either a <i>subject name</i> or a <i>subject alternative name</i> or the request
     *        will be rejected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IssueCertificateRequest withCsr(java.nio.ByteBuffer csr) {
        setCsr(csr);
        return this;
    }

    /**
     * <p>
     * The name of the algorithm that will be used to sign the certificate to be issued.
     * </p>
     * <p>
     * This parameter should not be confused with the <code>SigningAlgorithm</code> parameter used to sign a CSR in the
     * <code>CreateCertificateAuthority</code> action.
     * </p>
     * 
     * @param signingAlgorithm
     *        The name of the algorithm that will be used to sign the certificate to be issued. </p>
     *        <p>
     *        This parameter should not be confused with the <code>SigningAlgorithm</code> parameter used to sign a CSR
     *        in the <code>CreateCertificateAuthority</code> action.
     * @see SigningAlgorithm
     */

    public void setSigningAlgorithm(String signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm;
    }

    /**
     * <p>
     * The name of the algorithm that will be used to sign the certificate to be issued.
     * </p>
     * <p>
     * This parameter should not be confused with the <code>SigningAlgorithm</code> parameter used to sign a CSR in the
     * <code>CreateCertificateAuthority</code> action.
     * </p>
     * 
     * @return The name of the algorithm that will be used to sign the certificate to be issued. </p>
     *         <p>
     *         This parameter should not be confused with the <code>SigningAlgorithm</code> parameter used to sign a CSR
     *         in the <code>CreateCertificateAuthority</code> action.
     * @see SigningAlgorithm
     */

    public String getSigningAlgorithm() {
        return this.signingAlgorithm;
    }

    /**
     * <p>
     * The name of the algorithm that will be used to sign the certificate to be issued.
     * </p>
     * <p>
     * This parameter should not be confused with the <code>SigningAlgorithm</code> parameter used to sign a CSR in the
     * <code>CreateCertificateAuthority</code> action.
     * </p>
     * 
     * @param signingAlgorithm
     *        The name of the algorithm that will be used to sign the certificate to be issued. </p>
     *        <p>
     *        This parameter should not be confused with the <code>SigningAlgorithm</code> parameter used to sign a CSR
     *        in the <code>CreateCertificateAuthority</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SigningAlgorithm
     */

    public IssueCertificateRequest withSigningAlgorithm(String signingAlgorithm) {
        setSigningAlgorithm(signingAlgorithm);
        return this;
    }

    /**
     * <p>
     * The name of the algorithm that will be used to sign the certificate to be issued.
     * </p>
     * <p>
     * This parameter should not be confused with the <code>SigningAlgorithm</code> parameter used to sign a CSR in the
     * <code>CreateCertificateAuthority</code> action.
     * </p>
     * 
     * @param signingAlgorithm
     *        The name of the algorithm that will be used to sign the certificate to be issued. </p>
     *        <p>
     *        This parameter should not be confused with the <code>SigningAlgorithm</code> parameter used to sign a CSR
     *        in the <code>CreateCertificateAuthority</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SigningAlgorithm
     */

    public IssueCertificateRequest withSigningAlgorithm(SigningAlgorithm signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm.toString();
        return this;
    }

    /**
     * <p>
     * Specifies a custom configuration template to use when issuing a certificate. If this parameter is not provided,
     * ACM Private CA defaults to the <code>EndEntityCertificate/V1</code> template. For CA certificates, you should
     * choose the shortest path length that meets your needs. The path length is indicated by the PathLen<i>N</i>
     * portion of the ARN, where <i>N</i> is the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/userguide/PcaTerms.html#terms-cadepth">CA depth</a>.
     * </p>
     * <p>
     * Note: The CA depth configured on a subordinate CA certificate must not exceed the limit set by its parents in the
     * CA hierarchy.
     * </p>
     * <p>
     * For a list of <code>TemplateArn</code> values supported by ACM Private CA, see <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/userguide/UsingTemplates.html">Understanding Certificate
     * Templates</a>.
     * </p>
     * 
     * @param templateArn
     *        Specifies a custom configuration template to use when issuing a certificate. If this parameter is not
     *        provided, ACM Private CA defaults to the <code>EndEntityCertificate/V1</code> template. For CA
     *        certificates, you should choose the shortest path length that meets your needs. The path length is
     *        indicated by the PathLen<i>N</i> portion of the ARN, where <i>N</i> is the <a
     *        href="https://docs.aws.amazon.com/acm-pca/latest/userguide/PcaTerms.html#terms-cadepth">CA depth</a>.</p>
     *        <p>
     *        Note: The CA depth configured on a subordinate CA certificate must not exceed the limit set by its parents
     *        in the CA hierarchy.
     *        </p>
     *        <p>
     *        For a list of <code>TemplateArn</code> values supported by ACM Private CA, see <a
     *        href="https://docs.aws.amazon.com/acm-pca/latest/userguide/UsingTemplates.html">Understanding Certificate
     *        Templates</a>.
     */

    public void setTemplateArn(String templateArn) {
        this.templateArn = templateArn;
    }

    /**
     * <p>
     * Specifies a custom configuration template to use when issuing a certificate. If this parameter is not provided,
     * ACM Private CA defaults to the <code>EndEntityCertificate/V1</code> template. For CA certificates, you should
     * choose the shortest path length that meets your needs. The path length is indicated by the PathLen<i>N</i>
     * portion of the ARN, where <i>N</i> is the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/userguide/PcaTerms.html#terms-cadepth">CA depth</a>.
     * </p>
     * <p>
     * Note: The CA depth configured on a subordinate CA certificate must not exceed the limit set by its parents in the
     * CA hierarchy.
     * </p>
     * <p>
     * For a list of <code>TemplateArn</code> values supported by ACM Private CA, see <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/userguide/UsingTemplates.html">Understanding Certificate
     * Templates</a>.
     * </p>
     * 
     * @return Specifies a custom configuration template to use when issuing a certificate. If this parameter is not
     *         provided, ACM Private CA defaults to the <code>EndEntityCertificate/V1</code> template. For CA
     *         certificates, you should choose the shortest path length that meets your needs. The path length is
     *         indicated by the PathLen<i>N</i> portion of the ARN, where <i>N</i> is the <a
     *         href="https://docs.aws.amazon.com/acm-pca/latest/userguide/PcaTerms.html#terms-cadepth">CA depth</a>.</p>
     *         <p>
     *         Note: The CA depth configured on a subordinate CA certificate must not exceed the limit set by its
     *         parents in the CA hierarchy.
     *         </p>
     *         <p>
     *         For a list of <code>TemplateArn</code> values supported by ACM Private CA, see <a
     *         href="https://docs.aws.amazon.com/acm-pca/latest/userguide/UsingTemplates.html">Understanding Certificate
     *         Templates</a>.
     */

    public String getTemplateArn() {
        return this.templateArn;
    }

    /**
     * <p>
     * Specifies a custom configuration template to use when issuing a certificate. If this parameter is not provided,
     * ACM Private CA defaults to the <code>EndEntityCertificate/V1</code> template. For CA certificates, you should
     * choose the shortest path length that meets your needs. The path length is indicated by the PathLen<i>N</i>
     * portion of the ARN, where <i>N</i> is the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/userguide/PcaTerms.html#terms-cadepth">CA depth</a>.
     * </p>
     * <p>
     * Note: The CA depth configured on a subordinate CA certificate must not exceed the limit set by its parents in the
     * CA hierarchy.
     * </p>
     * <p>
     * For a list of <code>TemplateArn</code> values supported by ACM Private CA, see <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/userguide/UsingTemplates.html">Understanding Certificate
     * Templates</a>.
     * </p>
     * 
     * @param templateArn
     *        Specifies a custom configuration template to use when issuing a certificate. If this parameter is not
     *        provided, ACM Private CA defaults to the <code>EndEntityCertificate/V1</code> template. For CA
     *        certificates, you should choose the shortest path length that meets your needs. The path length is
     *        indicated by the PathLen<i>N</i> portion of the ARN, where <i>N</i> is the <a
     *        href="https://docs.aws.amazon.com/acm-pca/latest/userguide/PcaTerms.html#terms-cadepth">CA depth</a>.</p>
     *        <p>
     *        Note: The CA depth configured on a subordinate CA certificate must not exceed the limit set by its parents
     *        in the CA hierarchy.
     *        </p>
     *        <p>
     *        For a list of <code>TemplateArn</code> values supported by ACM Private CA, see <a
     *        href="https://docs.aws.amazon.com/acm-pca/latest/userguide/UsingTemplates.html">Understanding Certificate
     *        Templates</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IssueCertificateRequest withTemplateArn(String templateArn) {
        setTemplateArn(templateArn);
        return this;
    }

    /**
     * <p>
     * Information describing the end of the validity period of the certificate. This parameter sets the “Not After”
     * date for the certificate.
     * </p>
     * <p>
     * Certificate validity is the period of time during which a certificate is valid. Validity can be expressed as an
     * explicit date and time when the certificate expires, or as a span of time after issuance, stated in days, months,
     * or years. For more information, see <a href="https://tools.ietf.org/html/rfc5280#section-4.1.2.5">Validity</a> in
     * RFC 5280.
     * </p>
     * <p>
     * This value is unaffected when <code>ValidityNotBefore</code> is also specified. For example, if
     * <code>Validity</code> is set to 20 days in the future, the certificate will expire 20 days from issuance time
     * regardless of the <code>ValidityNotBefore</code> value.
     * </p>
     * <p>
     * The end of the validity period configured on a certificate must not exceed the limit set on its parents in the CA
     * hierarchy.
     * </p>
     * 
     * @param validity
     *        Information describing the end of the validity period of the certificate. This parameter sets the “Not
     *        After” date for the certificate.</p>
     *        <p>
     *        Certificate validity is the period of time during which a certificate is valid. Validity can be expressed
     *        as an explicit date and time when the certificate expires, or as a span of time after issuance, stated in
     *        days, months, or years. For more information, see <a
     *        href="https://tools.ietf.org/html/rfc5280#section-4.1.2.5">Validity</a> in RFC 5280.
     *        </p>
     *        <p>
     *        This value is unaffected when <code>ValidityNotBefore</code> is also specified. For example, if
     *        <code>Validity</code> is set to 20 days in the future, the certificate will expire 20 days from issuance
     *        time regardless of the <code>ValidityNotBefore</code> value.
     *        </p>
     *        <p>
     *        The end of the validity period configured on a certificate must not exceed the limit set on its parents in
     *        the CA hierarchy.
     */

    public void setValidity(Validity validity) {
        this.validity = validity;
    }

    /**
     * <p>
     * Information describing the end of the validity period of the certificate. This parameter sets the “Not After”
     * date for the certificate.
     * </p>
     * <p>
     * Certificate validity is the period of time during which a certificate is valid. Validity can be expressed as an
     * explicit date and time when the certificate expires, or as a span of time after issuance, stated in days, months,
     * or years. For more information, see <a href="https://tools.ietf.org/html/rfc5280#section-4.1.2.5">Validity</a> in
     * RFC 5280.
     * </p>
     * <p>
     * This value is unaffected when <code>ValidityNotBefore</code> is also specified. For example, if
     * <code>Validity</code> is set to 20 days in the future, the certificate will expire 20 days from issuance time
     * regardless of the <code>ValidityNotBefore</code> value.
     * </p>
     * <p>
     * The end of the validity period configured on a certificate must not exceed the limit set on its parents in the CA
     * hierarchy.
     * </p>
     * 
     * @return Information describing the end of the validity period of the certificate. This parameter sets the “Not
     *         After” date for the certificate.</p>
     *         <p>
     *         Certificate validity is the period of time during which a certificate is valid. Validity can be expressed
     *         as an explicit date and time when the certificate expires, or as a span of time after issuance, stated in
     *         days, months, or years. For more information, see <a
     *         href="https://tools.ietf.org/html/rfc5280#section-4.1.2.5">Validity</a> in RFC 5280.
     *         </p>
     *         <p>
     *         This value is unaffected when <code>ValidityNotBefore</code> is also specified. For example, if
     *         <code>Validity</code> is set to 20 days in the future, the certificate will expire 20 days from issuance
     *         time regardless of the <code>ValidityNotBefore</code> value.
     *         </p>
     *         <p>
     *         The end of the validity period configured on a certificate must not exceed the limit set on its parents
     *         in the CA hierarchy.
     */

    public Validity getValidity() {
        return this.validity;
    }

    /**
     * <p>
     * Information describing the end of the validity period of the certificate. This parameter sets the “Not After”
     * date for the certificate.
     * </p>
     * <p>
     * Certificate validity is the period of time during which a certificate is valid. Validity can be expressed as an
     * explicit date and time when the certificate expires, or as a span of time after issuance, stated in days, months,
     * or years. For more information, see <a href="https://tools.ietf.org/html/rfc5280#section-4.1.2.5">Validity</a> in
     * RFC 5280.
     * </p>
     * <p>
     * This value is unaffected when <code>ValidityNotBefore</code> is also specified. For example, if
     * <code>Validity</code> is set to 20 days in the future, the certificate will expire 20 days from issuance time
     * regardless of the <code>ValidityNotBefore</code> value.
     * </p>
     * <p>
     * The end of the validity period configured on a certificate must not exceed the limit set on its parents in the CA
     * hierarchy.
     * </p>
     * 
     * @param validity
     *        Information describing the end of the validity period of the certificate. This parameter sets the “Not
     *        After” date for the certificate.</p>
     *        <p>
     *        Certificate validity is the period of time during which a certificate is valid. Validity can be expressed
     *        as an explicit date and time when the certificate expires, or as a span of time after issuance, stated in
     *        days, months, or years. For more information, see <a
     *        href="https://tools.ietf.org/html/rfc5280#section-4.1.2.5">Validity</a> in RFC 5280.
     *        </p>
     *        <p>
     *        This value is unaffected when <code>ValidityNotBefore</code> is also specified. For example, if
     *        <code>Validity</code> is set to 20 days in the future, the certificate will expire 20 days from issuance
     *        time regardless of the <code>ValidityNotBefore</code> value.
     *        </p>
     *        <p>
     *        The end of the validity period configured on a certificate must not exceed the limit set on its parents in
     *        the CA hierarchy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IssueCertificateRequest withValidity(Validity validity) {
        setValidity(validity);
        return this;
    }

    /**
     * <p>
     * Information describing the start of the validity period of the certificate. This parameter sets the “Not Before"
     * date for the certificate.
     * </p>
     * <p>
     * By default, when issuing a certificate, ACM Private CA sets the "Not Before" date to the issuance time minus 60
     * minutes. This compensates for clock inconsistencies across computer systems. The <code>ValidityNotBefore</code>
     * parameter can be used to customize the “Not Before” value.
     * </p>
     * <p>
     * Unlike the <code>Validity</code> parameter, the <code>ValidityNotBefore</code> parameter is optional.
     * </p>
     * <p>
     * The <code>ValidityNotBefore</code> value is expressed as an explicit date and time, using the
     * <code>Validity</code> type value <code>ABSOLUTE</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_Validity.html">Validity</a> in this API
     * reference and <a href="https://tools.ietf.org/html/rfc5280#section-4.1.2.5">Validity</a> in RFC 5280.
     * </p>
     * 
     * @param validityNotBefore
     *        Information describing the start of the validity period of the certificate. This parameter sets the “Not
     *        Before" date for the certificate.</p>
     *        <p>
     *        By default, when issuing a certificate, ACM Private CA sets the "Not Before" date to the issuance time
     *        minus 60 minutes. This compensates for clock inconsistencies across computer systems. The
     *        <code>ValidityNotBefore</code> parameter can be used to customize the “Not Before” value.
     *        </p>
     *        <p>
     *        Unlike the <code>Validity</code> parameter, the <code>ValidityNotBefore</code> parameter is optional.
     *        </p>
     *        <p>
     *        The <code>ValidityNotBefore</code> value is expressed as an explicit date and time, using the
     *        <code>Validity</code> type value <code>ABSOLUTE</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_Validity.html">Validity</a> in this API
     *        reference and <a href="https://tools.ietf.org/html/rfc5280#section-4.1.2.5">Validity</a> in RFC 5280.
     */

    public void setValidityNotBefore(Validity validityNotBefore) {
        this.validityNotBefore = validityNotBefore;
    }

    /**
     * <p>
     * Information describing the start of the validity period of the certificate. This parameter sets the “Not Before"
     * date for the certificate.
     * </p>
     * <p>
     * By default, when issuing a certificate, ACM Private CA sets the "Not Before" date to the issuance time minus 60
     * minutes. This compensates for clock inconsistencies across computer systems. The <code>ValidityNotBefore</code>
     * parameter can be used to customize the “Not Before” value.
     * </p>
     * <p>
     * Unlike the <code>Validity</code> parameter, the <code>ValidityNotBefore</code> parameter is optional.
     * </p>
     * <p>
     * The <code>ValidityNotBefore</code> value is expressed as an explicit date and time, using the
     * <code>Validity</code> type value <code>ABSOLUTE</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_Validity.html">Validity</a> in this API
     * reference and <a href="https://tools.ietf.org/html/rfc5280#section-4.1.2.5">Validity</a> in RFC 5280.
     * </p>
     * 
     * @return Information describing the start of the validity period of the certificate. This parameter sets the “Not
     *         Before" date for the certificate.</p>
     *         <p>
     *         By default, when issuing a certificate, ACM Private CA sets the "Not Before" date to the issuance time
     *         minus 60 minutes. This compensates for clock inconsistencies across computer systems. The
     *         <code>ValidityNotBefore</code> parameter can be used to customize the “Not Before” value.
     *         </p>
     *         <p>
     *         Unlike the <code>Validity</code> parameter, the <code>ValidityNotBefore</code> parameter is optional.
     *         </p>
     *         <p>
     *         The <code>ValidityNotBefore</code> value is expressed as an explicit date and time, using the
     *         <code>Validity</code> type value <code>ABSOLUTE</code>. For more information, see <a
     *         href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_Validity.html">Validity</a> in this API
     *         reference and <a href="https://tools.ietf.org/html/rfc5280#section-4.1.2.5">Validity</a> in RFC 5280.
     */

    public Validity getValidityNotBefore() {
        return this.validityNotBefore;
    }

    /**
     * <p>
     * Information describing the start of the validity period of the certificate. This parameter sets the “Not Before"
     * date for the certificate.
     * </p>
     * <p>
     * By default, when issuing a certificate, ACM Private CA sets the "Not Before" date to the issuance time minus 60
     * minutes. This compensates for clock inconsistencies across computer systems. The <code>ValidityNotBefore</code>
     * parameter can be used to customize the “Not Before” value.
     * </p>
     * <p>
     * Unlike the <code>Validity</code> parameter, the <code>ValidityNotBefore</code> parameter is optional.
     * </p>
     * <p>
     * The <code>ValidityNotBefore</code> value is expressed as an explicit date and time, using the
     * <code>Validity</code> type value <code>ABSOLUTE</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_Validity.html">Validity</a> in this API
     * reference and <a href="https://tools.ietf.org/html/rfc5280#section-4.1.2.5">Validity</a> in RFC 5280.
     * </p>
     * 
     * @param validityNotBefore
     *        Information describing the start of the validity period of the certificate. This parameter sets the “Not
     *        Before" date for the certificate.</p>
     *        <p>
     *        By default, when issuing a certificate, ACM Private CA sets the "Not Before" date to the issuance time
     *        minus 60 minutes. This compensates for clock inconsistencies across computer systems. The
     *        <code>ValidityNotBefore</code> parameter can be used to customize the “Not Before” value.
     *        </p>
     *        <p>
     *        Unlike the <code>Validity</code> parameter, the <code>ValidityNotBefore</code> parameter is optional.
     *        </p>
     *        <p>
     *        The <code>ValidityNotBefore</code> value is expressed as an explicit date and time, using the
     *        <code>Validity</code> type value <code>ABSOLUTE</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_Validity.html">Validity</a> in this API
     *        reference and <a href="https://tools.ietf.org/html/rfc5280#section-4.1.2.5">Validity</a> in RFC 5280.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IssueCertificateRequest withValidityNotBefore(Validity validityNotBefore) {
        setValidityNotBefore(validityNotBefore);
        return this;
    }

    /**
     * <p>
     * Alphanumeric string that can be used to distinguish between calls to the <b>IssueCertificate</b> action.
     * Idempotency tokens for <b>IssueCertificate</b> time out after one minute. Therefore, if you call
     * <b>IssueCertificate</b> multiple times with the same idempotency token within one minute, ACM Private CA
     * recognizes that you are requesting only one certificate and will issue only one. If you change the idempotency
     * token for each call, PCA recognizes that you are requesting multiple certificates.
     * </p>
     * 
     * @param idempotencyToken
     *        Alphanumeric string that can be used to distinguish between calls to the <b>IssueCertificate</b> action.
     *        Idempotency tokens for <b>IssueCertificate</b> time out after one minute. Therefore, if you call
     *        <b>IssueCertificate</b> multiple times with the same idempotency token within one minute, ACM Private CA
     *        recognizes that you are requesting only one certificate and will issue only one. If you change the
     *        idempotency token for each call, PCA recognizes that you are requesting multiple certificates.
     */

    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * Alphanumeric string that can be used to distinguish between calls to the <b>IssueCertificate</b> action.
     * Idempotency tokens for <b>IssueCertificate</b> time out after one minute. Therefore, if you call
     * <b>IssueCertificate</b> multiple times with the same idempotency token within one minute, ACM Private CA
     * recognizes that you are requesting only one certificate and will issue only one. If you change the idempotency
     * token for each call, PCA recognizes that you are requesting multiple certificates.
     * </p>
     * 
     * @return Alphanumeric string that can be used to distinguish between calls to the <b>IssueCertificate</b> action.
     *         Idempotency tokens for <b>IssueCertificate</b> time out after one minute. Therefore, if you call
     *         <b>IssueCertificate</b> multiple times with the same idempotency token within one minute, ACM Private CA
     *         recognizes that you are requesting only one certificate and will issue only one. If you change the
     *         idempotency token for each call, PCA recognizes that you are requesting multiple certificates.
     */

    public String getIdempotencyToken() {
        return this.idempotencyToken;
    }

    /**
     * <p>
     * Alphanumeric string that can be used to distinguish between calls to the <b>IssueCertificate</b> action.
     * Idempotency tokens for <b>IssueCertificate</b> time out after one minute. Therefore, if you call
     * <b>IssueCertificate</b> multiple times with the same idempotency token within one minute, ACM Private CA
     * recognizes that you are requesting only one certificate and will issue only one. If you change the idempotency
     * token for each call, PCA recognizes that you are requesting multiple certificates.
     * </p>
     * 
     * @param idempotencyToken
     *        Alphanumeric string that can be used to distinguish between calls to the <b>IssueCertificate</b> action.
     *        Idempotency tokens for <b>IssueCertificate</b> time out after one minute. Therefore, if you call
     *        <b>IssueCertificate</b> multiple times with the same idempotency token within one minute, ACM Private CA
     *        recognizes that you are requesting only one certificate and will issue only one. If you change the
     *        idempotency token for each call, PCA recognizes that you are requesting multiple certificates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IssueCertificateRequest withIdempotencyToken(String idempotencyToken) {
        setIdempotencyToken(idempotencyToken);
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
        if (getApiPassthrough() != null)
            sb.append("ApiPassthrough: ").append(getApiPassthrough()).append(",");
        if (getCertificateAuthorityArn() != null)
            sb.append("CertificateAuthorityArn: ").append(getCertificateAuthorityArn()).append(",");
        if (getCsr() != null)
            sb.append("Csr: ").append(getCsr()).append(",");
        if (getSigningAlgorithm() != null)
            sb.append("SigningAlgorithm: ").append(getSigningAlgorithm()).append(",");
        if (getTemplateArn() != null)
            sb.append("TemplateArn: ").append(getTemplateArn()).append(",");
        if (getValidity() != null)
            sb.append("Validity: ").append(getValidity()).append(",");
        if (getValidityNotBefore() != null)
            sb.append("ValidityNotBefore: ").append(getValidityNotBefore()).append(",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: ").append(getIdempotencyToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IssueCertificateRequest == false)
            return false;
        IssueCertificateRequest other = (IssueCertificateRequest) obj;
        if (other.getApiPassthrough() == null ^ this.getApiPassthrough() == null)
            return false;
        if (other.getApiPassthrough() != null && other.getApiPassthrough().equals(this.getApiPassthrough()) == false)
            return false;
        if (other.getCertificateAuthorityArn() == null ^ this.getCertificateAuthorityArn() == null)
            return false;
        if (other.getCertificateAuthorityArn() != null && other.getCertificateAuthorityArn().equals(this.getCertificateAuthorityArn()) == false)
            return false;
        if (other.getCsr() == null ^ this.getCsr() == null)
            return false;
        if (other.getCsr() != null && other.getCsr().equals(this.getCsr()) == false)
            return false;
        if (other.getSigningAlgorithm() == null ^ this.getSigningAlgorithm() == null)
            return false;
        if (other.getSigningAlgorithm() != null && other.getSigningAlgorithm().equals(this.getSigningAlgorithm()) == false)
            return false;
        if (other.getTemplateArn() == null ^ this.getTemplateArn() == null)
            return false;
        if (other.getTemplateArn() != null && other.getTemplateArn().equals(this.getTemplateArn()) == false)
            return false;
        if (other.getValidity() == null ^ this.getValidity() == null)
            return false;
        if (other.getValidity() != null && other.getValidity().equals(this.getValidity()) == false)
            return false;
        if (other.getValidityNotBefore() == null ^ this.getValidityNotBefore() == null)
            return false;
        if (other.getValidityNotBefore() != null && other.getValidityNotBefore().equals(this.getValidityNotBefore()) == false)
            return false;
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiPassthrough() == null) ? 0 : getApiPassthrough().hashCode());
        hashCode = prime * hashCode + ((getCertificateAuthorityArn() == null) ? 0 : getCertificateAuthorityArn().hashCode());
        hashCode = prime * hashCode + ((getCsr() == null) ? 0 : getCsr().hashCode());
        hashCode = prime * hashCode + ((getSigningAlgorithm() == null) ? 0 : getSigningAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getTemplateArn() == null) ? 0 : getTemplateArn().hashCode());
        hashCode = prime * hashCode + ((getValidity() == null) ? 0 : getValidity().hashCode());
        hashCode = prime * hashCode + ((getValidityNotBefore() == null) ? 0 : getValidityNotBefore().hashCode());
        hashCode = prime * hashCode + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        return hashCode;
    }

    @Override
    public IssueCertificateRequest clone() {
        return (IssueCertificateRequest) super.clone();
    }

}
