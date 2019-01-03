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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ImportCertificate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportCertificateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The customer-assigned name of the certificate. Valid characters are A-z and 0-9.
     * </p>
     */
    private String certificateIdentifier;
    /**
     * <p>
     * The contents of the .pem X.509 certificate file for the certificate.
     * </p>
     */
    private String certificatePem;
    /**
     * <p>
     * The location of the imported Oracle Wallet certificate for use with SSL.
     * </p>
     */
    private java.nio.ByteBuffer certificateWallet;
    /**
     * <p>
     * The tags associated with the certificate.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The customer-assigned name of the certificate. Valid characters are A-z and 0-9.
     * </p>
     * 
     * @param certificateIdentifier
     *        The customer-assigned name of the certificate. Valid characters are A-z and 0-9.
     */

    public void setCertificateIdentifier(String certificateIdentifier) {
        this.certificateIdentifier = certificateIdentifier;
    }

    /**
     * <p>
     * The customer-assigned name of the certificate. Valid characters are A-z and 0-9.
     * </p>
     * 
     * @return The customer-assigned name of the certificate. Valid characters are A-z and 0-9.
     */

    public String getCertificateIdentifier() {
        return this.certificateIdentifier;
    }

    /**
     * <p>
     * The customer-assigned name of the certificate. Valid characters are A-z and 0-9.
     * </p>
     * 
     * @param certificateIdentifier
     *        The customer-assigned name of the certificate. Valid characters are A-z and 0-9.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportCertificateRequest withCertificateIdentifier(String certificateIdentifier) {
        setCertificateIdentifier(certificateIdentifier);
        return this;
    }

    /**
     * <p>
     * The contents of the .pem X.509 certificate file for the certificate.
     * </p>
     * 
     * @param certificatePem
     *        The contents of the .pem X.509 certificate file for the certificate.
     */

    public void setCertificatePem(String certificatePem) {
        this.certificatePem = certificatePem;
    }

    /**
     * <p>
     * The contents of the .pem X.509 certificate file for the certificate.
     * </p>
     * 
     * @return The contents of the .pem X.509 certificate file for the certificate.
     */

    public String getCertificatePem() {
        return this.certificatePem;
    }

    /**
     * <p>
     * The contents of the .pem X.509 certificate file for the certificate.
     * </p>
     * 
     * @param certificatePem
     *        The contents of the .pem X.509 certificate file for the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportCertificateRequest withCertificatePem(String certificatePem) {
        setCertificatePem(certificatePem);
        return this;
    }

    /**
     * <p>
     * The location of the imported Oracle Wallet certificate for use with SSL.
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
     * @param certificateWallet
     *        The location of the imported Oracle Wallet certificate for use with SSL.
     */

    public void setCertificateWallet(java.nio.ByteBuffer certificateWallet) {
        this.certificateWallet = certificateWallet;
    }

    /**
     * <p>
     * The location of the imported Oracle Wallet certificate for use with SSL.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The location of the imported Oracle Wallet certificate for use with SSL.
     */

    public java.nio.ByteBuffer getCertificateWallet() {
        return this.certificateWallet;
    }

    /**
     * <p>
     * The location of the imported Oracle Wallet certificate for use with SSL.
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
     * @param certificateWallet
     *        The location of the imported Oracle Wallet certificate for use with SSL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportCertificateRequest withCertificateWallet(java.nio.ByteBuffer certificateWallet) {
        setCertificateWallet(certificateWallet);
        return this;
    }

    /**
     * <p>
     * The tags associated with the certificate.
     * </p>
     * 
     * @return The tags associated with the certificate.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags associated with the certificate.
     * </p>
     * 
     * @param tags
     *        The tags associated with the certificate.
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
     * The tags associated with the certificate.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags associated with the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportCertificateRequest withTags(Tag... tags) {
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
     * The tags associated with the certificate.
     * </p>
     * 
     * @param tags
     *        The tags associated with the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportCertificateRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getCertificateIdentifier() != null)
            sb.append("CertificateIdentifier: ").append(getCertificateIdentifier()).append(",");
        if (getCertificatePem() != null)
            sb.append("CertificatePem: ").append(getCertificatePem()).append(",");
        if (getCertificateWallet() != null)
            sb.append("CertificateWallet: ").append(getCertificateWallet()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportCertificateRequest == false)
            return false;
        ImportCertificateRequest other = (ImportCertificateRequest) obj;
        if (other.getCertificateIdentifier() == null ^ this.getCertificateIdentifier() == null)
            return false;
        if (other.getCertificateIdentifier() != null && other.getCertificateIdentifier().equals(this.getCertificateIdentifier()) == false)
            return false;
        if (other.getCertificatePem() == null ^ this.getCertificatePem() == null)
            return false;
        if (other.getCertificatePem() != null && other.getCertificatePem().equals(this.getCertificatePem()) == false)
            return false;
        if (other.getCertificateWallet() == null ^ this.getCertificateWallet() == null)
            return false;
        if (other.getCertificateWallet() != null && other.getCertificateWallet().equals(this.getCertificateWallet()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateIdentifier() == null) ? 0 : getCertificateIdentifier().hashCode());
        hashCode = prime * hashCode + ((getCertificatePem() == null) ? 0 : getCertificatePem().hashCode());
        hashCode = prime * hashCode + ((getCertificateWallet() == null) ? 0 : getCertificateWallet().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ImportCertificateRequest clone() {
        return (ImportCertificateRequest) super.clone();
    }

}
