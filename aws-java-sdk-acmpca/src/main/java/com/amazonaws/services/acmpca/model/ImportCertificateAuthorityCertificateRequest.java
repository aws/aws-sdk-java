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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/ImportCertificateAuthorityCertificate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportCertificateAuthorityCertificateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The PEM-encoded certificate for your private CA. This must be signed by using your on-premises CA.
     * </p>
     */
    private java.nio.ByteBuffer certificate;
    /**
     * <p>
     * A PEM-encoded file that contains all of your certificates, other than the certificate you're importing, chaining
     * up to your root CA. Your on-premises root certificate is the last in the chain, and each certificate in the chain
     * signs the one preceding.
     * </p>
     */
    private java.nio.ByteBuffer certificateChain;

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
     *        must be of the form: </p>
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
     *         must be of the form: </p>
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
     *        must be of the form: </p>
     *        <p>
     *        <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportCertificateAuthorityCertificateRequest withCertificateAuthorityArn(String certificateAuthorityArn) {
        setCertificateAuthorityArn(certificateAuthorityArn);
        return this;
    }

    /**
     * <p>
     * The PEM-encoded certificate for your private CA. This must be signed by using your on-premises CA.
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
     * @param certificate
     *        The PEM-encoded certificate for your private CA. This must be signed by using your on-premises CA.
     */

    public void setCertificate(java.nio.ByteBuffer certificate) {
        this.certificate = certificate;
    }

    /**
     * <p>
     * The PEM-encoded certificate for your private CA. This must be signed by using your on-premises CA.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The PEM-encoded certificate for your private CA. This must be signed by using your on-premises CA.
     */

    public java.nio.ByteBuffer getCertificate() {
        return this.certificate;
    }

    /**
     * <p>
     * The PEM-encoded certificate for your private CA. This must be signed by using your on-premises CA.
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
     * @param certificate
     *        The PEM-encoded certificate for your private CA. This must be signed by using your on-premises CA.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportCertificateAuthorityCertificateRequest withCertificate(java.nio.ByteBuffer certificate) {
        setCertificate(certificate);
        return this;
    }

    /**
     * <p>
     * A PEM-encoded file that contains all of your certificates, other than the certificate you're importing, chaining
     * up to your root CA. Your on-premises root certificate is the last in the chain, and each certificate in the chain
     * signs the one preceding.
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
     * @param certificateChain
     *        A PEM-encoded file that contains all of your certificates, other than the certificate you're importing,
     *        chaining up to your root CA. Your on-premises root certificate is the last in the chain, and each
     *        certificate in the chain signs the one preceding.
     */

    public void setCertificateChain(java.nio.ByteBuffer certificateChain) {
        this.certificateChain = certificateChain;
    }

    /**
     * <p>
     * A PEM-encoded file that contains all of your certificates, other than the certificate you're importing, chaining
     * up to your root CA. Your on-premises root certificate is the last in the chain, and each certificate in the chain
     * signs the one preceding.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return A PEM-encoded file that contains all of your certificates, other than the certificate you're importing,
     *         chaining up to your root CA. Your on-premises root certificate is the last in the chain, and each
     *         certificate in the chain signs the one preceding.
     */

    public java.nio.ByteBuffer getCertificateChain() {
        return this.certificateChain;
    }

    /**
     * <p>
     * A PEM-encoded file that contains all of your certificates, other than the certificate you're importing, chaining
     * up to your root CA. Your on-premises root certificate is the last in the chain, and each certificate in the chain
     * signs the one preceding.
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
     * @param certificateChain
     *        A PEM-encoded file that contains all of your certificates, other than the certificate you're importing,
     *        chaining up to your root CA. Your on-premises root certificate is the last in the chain, and each
     *        certificate in the chain signs the one preceding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportCertificateAuthorityCertificateRequest withCertificateChain(java.nio.ByteBuffer certificateChain) {
        setCertificateChain(certificateChain);
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
        if (getCertificate() != null)
            sb.append("Certificate: ").append(getCertificate()).append(",");
        if (getCertificateChain() != null)
            sb.append("CertificateChain: ").append(getCertificateChain());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportCertificateAuthorityCertificateRequest == false)
            return false;
        ImportCertificateAuthorityCertificateRequest other = (ImportCertificateAuthorityCertificateRequest) obj;
        if (other.getCertificateAuthorityArn() == null ^ this.getCertificateAuthorityArn() == null)
            return false;
        if (other.getCertificateAuthorityArn() != null && other.getCertificateAuthorityArn().equals(this.getCertificateAuthorityArn()) == false)
            return false;
        if (other.getCertificate() == null ^ this.getCertificate() == null)
            return false;
        if (other.getCertificate() != null && other.getCertificate().equals(this.getCertificate()) == false)
            return false;
        if (other.getCertificateChain() == null ^ this.getCertificateChain() == null)
            return false;
        if (other.getCertificateChain() != null && other.getCertificateChain().equals(this.getCertificateChain()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateAuthorityArn() == null) ? 0 : getCertificateAuthorityArn().hashCode());
        hashCode = prime * hashCode + ((getCertificate() == null) ? 0 : getCertificate().hashCode());
        hashCode = prime * hashCode + ((getCertificateChain() == null) ? 0 : getCertificateChain().hashCode());
        return hashCode;
    }

    @Override
    public ImportCertificateAuthorityCertificateRequest clone() {
        return (ImportCertificateAuthorityCertificateRequest) super.clone();
    }

}
