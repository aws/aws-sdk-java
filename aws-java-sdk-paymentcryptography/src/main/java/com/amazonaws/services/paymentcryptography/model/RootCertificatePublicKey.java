/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.paymentcryptography.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Parameter information for root public key certificate import.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/RootCertificatePublicKey"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RootCertificatePublicKey implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The role of the key, the algorithm it supports, and the cryptographic operations allowed with the key. This data
     * is immutable after the root public key is imported.
     * </p>
     */
    private KeyAttributes keyAttributes;
    /**
     * <p>
     * Parameter information for root public key certificate import.
     * </p>
     */
    private String publicKeyCertificate;

    /**
     * <p>
     * The role of the key, the algorithm it supports, and the cryptographic operations allowed with the key. This data
     * is immutable after the root public key is imported.
     * </p>
     * 
     * @param keyAttributes
     *        The role of the key, the algorithm it supports, and the cryptographic operations allowed with the key.
     *        This data is immutable after the root public key is imported.
     */

    public void setKeyAttributes(KeyAttributes keyAttributes) {
        this.keyAttributes = keyAttributes;
    }

    /**
     * <p>
     * The role of the key, the algorithm it supports, and the cryptographic operations allowed with the key. This data
     * is immutable after the root public key is imported.
     * </p>
     * 
     * @return The role of the key, the algorithm it supports, and the cryptographic operations allowed with the key.
     *         This data is immutable after the root public key is imported.
     */

    public KeyAttributes getKeyAttributes() {
        return this.keyAttributes;
    }

    /**
     * <p>
     * The role of the key, the algorithm it supports, and the cryptographic operations allowed with the key. This data
     * is immutable after the root public key is imported.
     * </p>
     * 
     * @param keyAttributes
     *        The role of the key, the algorithm it supports, and the cryptographic operations allowed with the key.
     *        This data is immutable after the root public key is imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RootCertificatePublicKey withKeyAttributes(KeyAttributes keyAttributes) {
        setKeyAttributes(keyAttributes);
        return this;
    }

    /**
     * <p>
     * Parameter information for root public key certificate import.
     * </p>
     * 
     * @param publicKeyCertificate
     *        Parameter information for root public key certificate import.
     */

    public void setPublicKeyCertificate(String publicKeyCertificate) {
        this.publicKeyCertificate = publicKeyCertificate;
    }

    /**
     * <p>
     * Parameter information for root public key certificate import.
     * </p>
     * 
     * @return Parameter information for root public key certificate import.
     */

    public String getPublicKeyCertificate() {
        return this.publicKeyCertificate;
    }

    /**
     * <p>
     * Parameter information for root public key certificate import.
     * </p>
     * 
     * @param publicKeyCertificate
     *        Parameter information for root public key certificate import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RootCertificatePublicKey withPublicKeyCertificate(String publicKeyCertificate) {
        setPublicKeyCertificate(publicKeyCertificate);
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
        if (getKeyAttributes() != null)
            sb.append("KeyAttributes: ").append(getKeyAttributes()).append(",");
        if (getPublicKeyCertificate() != null)
            sb.append("PublicKeyCertificate: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RootCertificatePublicKey == false)
            return false;
        RootCertificatePublicKey other = (RootCertificatePublicKey) obj;
        if (other.getKeyAttributes() == null ^ this.getKeyAttributes() == null)
            return false;
        if (other.getKeyAttributes() != null && other.getKeyAttributes().equals(this.getKeyAttributes()) == false)
            return false;
        if (other.getPublicKeyCertificate() == null ^ this.getPublicKeyCertificate() == null)
            return false;
        if (other.getPublicKeyCertificate() != null && other.getPublicKeyCertificate().equals(this.getPublicKeyCertificate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyAttributes() == null) ? 0 : getKeyAttributes().hashCode());
        hashCode = prime * hashCode + ((getPublicKeyCertificate() == null) ? 0 : getPublicKeyCertificate().hashCode());
        return hashCode;
    }

    @Override
    public RootCertificatePublicKey clone() {
        try {
            return (RootCertificatePublicKey) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.paymentcryptography.model.transform.RootCertificatePublicKeyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
