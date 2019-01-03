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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-2015-12-08/ExportCertificate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportCertificateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An Amazon Resource Name (ARN) of the issued certificate. This must be of the form:
     * </p>
     * <p>
     * <code>arn:aws:acm:region:account:certificate/12345678-1234-1234-1234-123456789012</code>
     * </p>
     */
    private String certificateArn;
    /**
     * <p>
     * Passphrase to associate with the encrypted exported private key. If you want to later decrypt the private key,
     * you must have the passphrase. You can use the following OpenSSL command to decrypt a private key:
     * </p>
     * <p>
     * <code>openssl rsa -in encrypted_key.pem -out decrypted_key.pem</code>
     * </p>
     */
    private java.nio.ByteBuffer passphrase;

    /**
     * <p>
     * An Amazon Resource Name (ARN) of the issued certificate. This must be of the form:
     * </p>
     * <p>
     * <code>arn:aws:acm:region:account:certificate/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * 
     * @param certificateArn
     *        An Amazon Resource Name (ARN) of the issued certificate. This must be of the form:</p>
     *        <p>
     *        <code>arn:aws:acm:region:account:certificate/12345678-1234-1234-1234-123456789012</code>
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) of the issued certificate. This must be of the form:
     * </p>
     * <p>
     * <code>arn:aws:acm:region:account:certificate/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * 
     * @return An Amazon Resource Name (ARN) of the issued certificate. This must be of the form:</p>
     *         <p>
     *         <code>arn:aws:acm:region:account:certificate/12345678-1234-1234-1234-123456789012</code>
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) of the issued certificate. This must be of the form:
     * </p>
     * <p>
     * <code>arn:aws:acm:region:account:certificate/12345678-1234-1234-1234-123456789012</code>
     * </p>
     * 
     * @param certificateArn
     *        An Amazon Resource Name (ARN) of the issued certificate. This must be of the form:</p>
     *        <p>
     *        <code>arn:aws:acm:region:account:certificate/12345678-1234-1234-1234-123456789012</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportCertificateRequest withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
        return this;
    }

    /**
     * <p>
     * Passphrase to associate with the encrypted exported private key. If you want to later decrypt the private key,
     * you must have the passphrase. You can use the following OpenSSL command to decrypt a private key:
     * </p>
     * <p>
     * <code>openssl rsa -in encrypted_key.pem -out decrypted_key.pem</code>
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
     * @param passphrase
     *        Passphrase to associate with the encrypted exported private key. If you want to later decrypt the private
     *        key, you must have the passphrase. You can use the following OpenSSL command to decrypt a private key:
     *        </p>
     *        <p>
     *        <code>openssl rsa -in encrypted_key.pem -out decrypted_key.pem</code>
     */

    public void setPassphrase(java.nio.ByteBuffer passphrase) {
        this.passphrase = passphrase;
    }

    /**
     * <p>
     * Passphrase to associate with the encrypted exported private key. If you want to later decrypt the private key,
     * you must have the passphrase. You can use the following OpenSSL command to decrypt a private key:
     * </p>
     * <p>
     * <code>openssl rsa -in encrypted_key.pem -out decrypted_key.pem</code>
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return Passphrase to associate with the encrypted exported private key. If you want to later decrypt the private
     *         key, you must have the passphrase. You can use the following OpenSSL command to decrypt a private key:
     *         </p>
     *         <p>
     *         <code>openssl rsa -in encrypted_key.pem -out decrypted_key.pem</code>
     */

    public java.nio.ByteBuffer getPassphrase() {
        return this.passphrase;
    }

    /**
     * <p>
     * Passphrase to associate with the encrypted exported private key. If you want to later decrypt the private key,
     * you must have the passphrase. You can use the following OpenSSL command to decrypt a private key:
     * </p>
     * <p>
     * <code>openssl rsa -in encrypted_key.pem -out decrypted_key.pem</code>
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
     * @param passphrase
     *        Passphrase to associate with the encrypted exported private key. If you want to later decrypt the private
     *        key, you must have the passphrase. You can use the following OpenSSL command to decrypt a private key:
     *        </p>
     *        <p>
     *        <code>openssl rsa -in encrypted_key.pem -out decrypted_key.pem</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportCertificateRequest withPassphrase(java.nio.ByteBuffer passphrase) {
        setPassphrase(passphrase);
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
        if (getPassphrase() != null)
            sb.append("Passphrase: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportCertificateRequest == false)
            return false;
        ExportCertificateRequest other = (ExportCertificateRequest) obj;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getPassphrase() == null ^ this.getPassphrase() == null)
            return false;
        if (other.getPassphrase() != null && other.getPassphrase().equals(this.getPassphrase()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getPassphrase() == null) ? 0 : getPassphrase().hashCode());
        return hashCode;
    }

    @Override
    public ExportCertificateRequest clone() {
        return (ExportCertificateRequest) super.clone();
    }

}
