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
     * The Amazon Resource Name (ARN) that was returned when you called <a>CreateCertificateAuthority</a>. This must be
     * of the form:
     * </p>
     * <p>
     * <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     * </p>
     */
    private String certificateAuthorityArn;
    /**
     * <p>
     * The certificate signing request (CSR) for the certificate you want to issue. You can use the following OpenSSL
     * command to create the CSR and a 2048 bit RSA private key.
     * </p>
     * <p>
     * <code>openssl req -new -newkey rsa:2048 -days 365 -keyout private/test_cert_priv_key.pem -out csr/test_cert_.csr</code>
     * </p>
     * <p>
     * If you have a configuration file, you can use the following OpenSSL command. The <code>usr_cert</code> block in
     * the configuration file contains your X509 version 3 extensions.
     * </p>
     * <p>
     * <code>openssl req -new -config openssl_rsa.cnf -extensions usr_cert -newkey rsa:2048 -days -365 -keyout private/test_cert_priv_key.pem -out csr/test_cert_.csr</code>
     * </p>
     */
    private java.nio.ByteBuffer csr;
    /**
     * <p>
     * The name of the algorithm that will be used to sign the certificate to be issued.
     * </p>
     */
    private String signingAlgorithm;
    /**
     * <p>
     * The type of the validity period.
     * </p>
     */
    private Validity validity;
    /**
     * <p>
     * Custom string that can be used to distinguish between calls to the <b>IssueCertificate</b> operation. Idempotency
     * tokens time out after one hour. Therefore, if you call <b>IssueCertificate</b> multiple times with the same
     * idempotency token within 5 minutes, ACM PCA recognizes that you are requesting only one certificate and will
     * issue only one. If you change the idempotency token for each call, PCA recognizes that you are requesting
     * multiple certificates.
     * </p>
     */
    private String idempotencyToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a>CreateCertificateAuthority</a>. This must be
     * of the form:
     * </p>
     * <p>
     * <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     * </p>
     * 
     * @param certificateAuthorityArn
     *        The Amazon Resource Name (ARN) that was returned when you called <a>CreateCertificateAuthority</a>. This
     *        must be of the form:</p>
     *        <p>
     *        <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     */

    public void setCertificateAuthorityArn(String certificateAuthorityArn) {
        this.certificateAuthorityArn = certificateAuthorityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a>CreateCertificateAuthority</a>. This must be
     * of the form:
     * </p>
     * <p>
     * <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that was returned when you called <a>CreateCertificateAuthority</a>. This
     *         must be of the form:</p>
     *         <p>
     *         <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     */

    public String getCertificateAuthorityArn() {
        return this.certificateAuthorityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called <a>CreateCertificateAuthority</a>. This must be
     * of the form:
     * </p>
     * <p>
     * <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     * </p>
     * 
     * @param certificateAuthorityArn
     *        The Amazon Resource Name (ARN) that was returned when you called <a>CreateCertificateAuthority</a>. This
     *        must be of the form:</p>
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
     * The certificate signing request (CSR) for the certificate you want to issue. You can use the following OpenSSL
     * command to create the CSR and a 2048 bit RSA private key.
     * </p>
     * <p>
     * <code>openssl req -new -newkey rsa:2048 -days 365 -keyout private/test_cert_priv_key.pem -out csr/test_cert_.csr</code>
     * </p>
     * <p>
     * If you have a configuration file, you can use the following OpenSSL command. The <code>usr_cert</code> block in
     * the configuration file contains your X509 version 3 extensions.
     * </p>
     * <p>
     * <code>openssl req -new -config openssl_rsa.cnf -extensions usr_cert -newkey rsa:2048 -days -365 -keyout private/test_cert_priv_key.pem -out csr/test_cert_.csr</code>
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
     *        The certificate signing request (CSR) for the certificate you want to issue. You can use the following
     *        OpenSSL command to create the CSR and a 2048 bit RSA private key. </p>
     *        <p>
     *        <code>openssl req -new -newkey rsa:2048 -days 365 -keyout private/test_cert_priv_key.pem -out csr/test_cert_.csr</code>
     *        </p>
     *        <p>
     *        If you have a configuration file, you can use the following OpenSSL command. The <code>usr_cert</code>
     *        block in the configuration file contains your X509 version 3 extensions.
     *        </p>
     *        <p>
     *        <code>openssl req -new -config openssl_rsa.cnf -extensions usr_cert -newkey rsa:2048 -days -365 -keyout private/test_cert_priv_key.pem -out csr/test_cert_.csr</code>
     */

    public void setCsr(java.nio.ByteBuffer csr) {
        this.csr = csr;
    }

    /**
     * <p>
     * The certificate signing request (CSR) for the certificate you want to issue. You can use the following OpenSSL
     * command to create the CSR and a 2048 bit RSA private key.
     * </p>
     * <p>
     * <code>openssl req -new -newkey rsa:2048 -days 365 -keyout private/test_cert_priv_key.pem -out csr/test_cert_.csr</code>
     * </p>
     * <p>
     * If you have a configuration file, you can use the following OpenSSL command. The <code>usr_cert</code> block in
     * the configuration file contains your X509 version 3 extensions.
     * </p>
     * <p>
     * <code>openssl req -new -config openssl_rsa.cnf -extensions usr_cert -newkey rsa:2048 -days -365 -keyout private/test_cert_priv_key.pem -out csr/test_cert_.csr</code>
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The certificate signing request (CSR) for the certificate you want to issue. You can use the following
     *         OpenSSL command to create the CSR and a 2048 bit RSA private key. </p>
     *         <p>
     *         <code>openssl req -new -newkey rsa:2048 -days 365 -keyout private/test_cert_priv_key.pem -out csr/test_cert_.csr</code>
     *         </p>
     *         <p>
     *         If you have a configuration file, you can use the following OpenSSL command. The <code>usr_cert</code>
     *         block in the configuration file contains your X509 version 3 extensions.
     *         </p>
     *         <p>
     *         <code>openssl req -new -config openssl_rsa.cnf -extensions usr_cert -newkey rsa:2048 -days -365 -keyout private/test_cert_priv_key.pem -out csr/test_cert_.csr</code>
     */

    public java.nio.ByteBuffer getCsr() {
        return this.csr;
    }

    /**
     * <p>
     * The certificate signing request (CSR) for the certificate you want to issue. You can use the following OpenSSL
     * command to create the CSR and a 2048 bit RSA private key.
     * </p>
     * <p>
     * <code>openssl req -new -newkey rsa:2048 -days 365 -keyout private/test_cert_priv_key.pem -out csr/test_cert_.csr</code>
     * </p>
     * <p>
     * If you have a configuration file, you can use the following OpenSSL command. The <code>usr_cert</code> block in
     * the configuration file contains your X509 version 3 extensions.
     * </p>
     * <p>
     * <code>openssl req -new -config openssl_rsa.cnf -extensions usr_cert -newkey rsa:2048 -days -365 -keyout private/test_cert_priv_key.pem -out csr/test_cert_.csr</code>
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
     *        The certificate signing request (CSR) for the certificate you want to issue. You can use the following
     *        OpenSSL command to create the CSR and a 2048 bit RSA private key. </p>
     *        <p>
     *        <code>openssl req -new -newkey rsa:2048 -days 365 -keyout private/test_cert_priv_key.pem -out csr/test_cert_.csr</code>
     *        </p>
     *        <p>
     *        If you have a configuration file, you can use the following OpenSSL command. The <code>usr_cert</code>
     *        block in the configuration file contains your X509 version 3 extensions.
     *        </p>
     *        <p>
     *        <code>openssl req -new -config openssl_rsa.cnf -extensions usr_cert -newkey rsa:2048 -days -365 -keyout private/test_cert_priv_key.pem -out csr/test_cert_.csr</code>
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
     * 
     * @param signingAlgorithm
     *        The name of the algorithm that will be used to sign the certificate to be issued.
     * @see SigningAlgorithm
     */

    public void setSigningAlgorithm(String signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm;
    }

    /**
     * <p>
     * The name of the algorithm that will be used to sign the certificate to be issued.
     * </p>
     * 
     * @return The name of the algorithm that will be used to sign the certificate to be issued.
     * @see SigningAlgorithm
     */

    public String getSigningAlgorithm() {
        return this.signingAlgorithm;
    }

    /**
     * <p>
     * The name of the algorithm that will be used to sign the certificate to be issued.
     * </p>
     * 
     * @param signingAlgorithm
     *        The name of the algorithm that will be used to sign the certificate to be issued.
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
     * 
     * @param signingAlgorithm
     *        The name of the algorithm that will be used to sign the certificate to be issued.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SigningAlgorithm
     */

    public IssueCertificateRequest withSigningAlgorithm(SigningAlgorithm signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm.toString();
        return this;
    }

    /**
     * <p>
     * The type of the validity period.
     * </p>
     * 
     * @param validity
     *        The type of the validity period.
     */

    public void setValidity(Validity validity) {
        this.validity = validity;
    }

    /**
     * <p>
     * The type of the validity period.
     * </p>
     * 
     * @return The type of the validity period.
     */

    public Validity getValidity() {
        return this.validity;
    }

    /**
     * <p>
     * The type of the validity period.
     * </p>
     * 
     * @param validity
     *        The type of the validity period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IssueCertificateRequest withValidity(Validity validity) {
        setValidity(validity);
        return this;
    }

    /**
     * <p>
     * Custom string that can be used to distinguish between calls to the <b>IssueCertificate</b> operation. Idempotency
     * tokens time out after one hour. Therefore, if you call <b>IssueCertificate</b> multiple times with the same
     * idempotency token within 5 minutes, ACM PCA recognizes that you are requesting only one certificate and will
     * issue only one. If you change the idempotency token for each call, PCA recognizes that you are requesting
     * multiple certificates.
     * </p>
     * 
     * @param idempotencyToken
     *        Custom string that can be used to distinguish between calls to the <b>IssueCertificate</b> operation.
     *        Idempotency tokens time out after one hour. Therefore, if you call <b>IssueCertificate</b> multiple times
     *        with the same idempotency token within 5 minutes, ACM PCA recognizes that you are requesting only one
     *        certificate and will issue only one. If you change the idempotency token for each call, PCA recognizes
     *        that you are requesting multiple certificates.
     */

    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * Custom string that can be used to distinguish between calls to the <b>IssueCertificate</b> operation. Idempotency
     * tokens time out after one hour. Therefore, if you call <b>IssueCertificate</b> multiple times with the same
     * idempotency token within 5 minutes, ACM PCA recognizes that you are requesting only one certificate and will
     * issue only one. If you change the idempotency token for each call, PCA recognizes that you are requesting
     * multiple certificates.
     * </p>
     * 
     * @return Custom string that can be used to distinguish between calls to the <b>IssueCertificate</b> operation.
     *         Idempotency tokens time out after one hour. Therefore, if you call <b>IssueCertificate</b> multiple times
     *         with the same idempotency token within 5 minutes, ACM PCA recognizes that you are requesting only one
     *         certificate and will issue only one. If you change the idempotency token for each call, PCA recognizes
     *         that you are requesting multiple certificates.
     */

    public String getIdempotencyToken() {
        return this.idempotencyToken;
    }

    /**
     * <p>
     * Custom string that can be used to distinguish between calls to the <b>IssueCertificate</b> operation. Idempotency
     * tokens time out after one hour. Therefore, if you call <b>IssueCertificate</b> multiple times with the same
     * idempotency token within 5 minutes, ACM PCA recognizes that you are requesting only one certificate and will
     * issue only one. If you change the idempotency token for each call, PCA recognizes that you are requesting
     * multiple certificates.
     * </p>
     * 
     * @param idempotencyToken
     *        Custom string that can be used to distinguish between calls to the <b>IssueCertificate</b> operation.
     *        Idempotency tokens time out after one hour. Therefore, if you call <b>IssueCertificate</b> multiple times
     *        with the same idempotency token within 5 minutes, ACM PCA recognizes that you are requesting only one
     *        certificate and will issue only one. If you change the idempotency token for each call, PCA recognizes
     *        that you are requesting multiple certificates.
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
        if (getCertificateAuthorityArn() != null)
            sb.append("CertificateAuthorityArn: ").append(getCertificateAuthorityArn()).append(",");
        if (getCsr() != null)
            sb.append("Csr: ").append(getCsr()).append(",");
        if (getSigningAlgorithm() != null)
            sb.append("SigningAlgorithm: ").append(getSigningAlgorithm()).append(",");
        if (getValidity() != null)
            sb.append("Validity: ").append(getValidity()).append(",");
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
        if (other.getValidity() == null ^ this.getValidity() == null)
            return false;
        if (other.getValidity() != null && other.getValidity().equals(this.getValidity()) == false)
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

        hashCode = prime * hashCode + ((getCertificateAuthorityArn() == null) ? 0 : getCertificateAuthorityArn().hashCode());
        hashCode = prime * hashCode + ((getCsr() == null) ? 0 : getCsr().hashCode());
        hashCode = prime * hashCode + ((getSigningAlgorithm() == null) ? 0 : getSigningAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getValidity() == null) ? 0 : getValidity().hashCode());
        hashCode = prime * hashCode + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        return hashCode;
    }

    @Override
    public IssueCertificateRequest clone() {
        return (IssueCertificateRequest) super.clone();
    }

}
