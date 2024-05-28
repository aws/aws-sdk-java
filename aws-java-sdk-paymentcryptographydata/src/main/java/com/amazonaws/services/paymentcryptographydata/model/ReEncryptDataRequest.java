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
package com.amazonaws.services.paymentcryptographydata.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/ReEncryptData"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReEncryptDataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Ciphertext to be encrypted. The minimum allowed length is 16 bytes and maximum allowed length is 4096 bytes.
     * </p>
     */
    private String cipherText;
    /**
     * <p>
     * The attributes and values for incoming ciphertext.
     * </p>
     */
    private ReEncryptionAttributes incomingEncryptionAttributes;
    /**
     * <p>
     * The <code>keyARN</code> of the encryption key of incoming ciphertext data.
     * </p>
     */
    private String incomingKeyIdentifier;
    /**
     * <p>
     * The attributes and values for outgoing ciphertext data after encryption by Amazon Web Services Payment
     * Cryptography.
     * </p>
     */
    private ReEncryptionAttributes outgoingEncryptionAttributes;
    /**
     * <p>
     * The <code>keyARN</code> of the encryption key of outgoing ciphertext data after encryption by Amazon Web Services
     * Payment Cryptography.
     * </p>
     */
    private String outgoingKeyIdentifier;

    /**
     * <p>
     * Ciphertext to be encrypted. The minimum allowed length is 16 bytes and maximum allowed length is 4096 bytes.
     * </p>
     * 
     * @param cipherText
     *        Ciphertext to be encrypted. The minimum allowed length is 16 bytes and maximum allowed length is 4096
     *        bytes.
     */

    public void setCipherText(String cipherText) {
        this.cipherText = cipherText;
    }

    /**
     * <p>
     * Ciphertext to be encrypted. The minimum allowed length is 16 bytes and maximum allowed length is 4096 bytes.
     * </p>
     * 
     * @return Ciphertext to be encrypted. The minimum allowed length is 16 bytes and maximum allowed length is 4096
     *         bytes.
     */

    public String getCipherText() {
        return this.cipherText;
    }

    /**
     * <p>
     * Ciphertext to be encrypted. The minimum allowed length is 16 bytes and maximum allowed length is 4096 bytes.
     * </p>
     * 
     * @param cipherText
     *        Ciphertext to be encrypted. The minimum allowed length is 16 bytes and maximum allowed length is 4096
     *        bytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReEncryptDataRequest withCipherText(String cipherText) {
        setCipherText(cipherText);
        return this;
    }

    /**
     * <p>
     * The attributes and values for incoming ciphertext.
     * </p>
     * 
     * @param incomingEncryptionAttributes
     *        The attributes and values for incoming ciphertext.
     */

    public void setIncomingEncryptionAttributes(ReEncryptionAttributes incomingEncryptionAttributes) {
        this.incomingEncryptionAttributes = incomingEncryptionAttributes;
    }

    /**
     * <p>
     * The attributes and values for incoming ciphertext.
     * </p>
     * 
     * @return The attributes and values for incoming ciphertext.
     */

    public ReEncryptionAttributes getIncomingEncryptionAttributes() {
        return this.incomingEncryptionAttributes;
    }

    /**
     * <p>
     * The attributes and values for incoming ciphertext.
     * </p>
     * 
     * @param incomingEncryptionAttributes
     *        The attributes and values for incoming ciphertext.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReEncryptDataRequest withIncomingEncryptionAttributes(ReEncryptionAttributes incomingEncryptionAttributes) {
        setIncomingEncryptionAttributes(incomingEncryptionAttributes);
        return this;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the encryption key of incoming ciphertext data.
     * </p>
     * 
     * @param incomingKeyIdentifier
     *        The <code>keyARN</code> of the encryption key of incoming ciphertext data.
     */

    public void setIncomingKeyIdentifier(String incomingKeyIdentifier) {
        this.incomingKeyIdentifier = incomingKeyIdentifier;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the encryption key of incoming ciphertext data.
     * </p>
     * 
     * @return The <code>keyARN</code> of the encryption key of incoming ciphertext data.
     */

    public String getIncomingKeyIdentifier() {
        return this.incomingKeyIdentifier;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the encryption key of incoming ciphertext data.
     * </p>
     * 
     * @param incomingKeyIdentifier
     *        The <code>keyARN</code> of the encryption key of incoming ciphertext data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReEncryptDataRequest withIncomingKeyIdentifier(String incomingKeyIdentifier) {
        setIncomingKeyIdentifier(incomingKeyIdentifier);
        return this;
    }

    /**
     * <p>
     * The attributes and values for outgoing ciphertext data after encryption by Amazon Web Services Payment
     * Cryptography.
     * </p>
     * 
     * @param outgoingEncryptionAttributes
     *        The attributes and values for outgoing ciphertext data after encryption by Amazon Web Services Payment
     *        Cryptography.
     */

    public void setOutgoingEncryptionAttributes(ReEncryptionAttributes outgoingEncryptionAttributes) {
        this.outgoingEncryptionAttributes = outgoingEncryptionAttributes;
    }

    /**
     * <p>
     * The attributes and values for outgoing ciphertext data after encryption by Amazon Web Services Payment
     * Cryptography.
     * </p>
     * 
     * @return The attributes and values for outgoing ciphertext data after encryption by Amazon Web Services Payment
     *         Cryptography.
     */

    public ReEncryptionAttributes getOutgoingEncryptionAttributes() {
        return this.outgoingEncryptionAttributes;
    }

    /**
     * <p>
     * The attributes and values for outgoing ciphertext data after encryption by Amazon Web Services Payment
     * Cryptography.
     * </p>
     * 
     * @param outgoingEncryptionAttributes
     *        The attributes and values for outgoing ciphertext data after encryption by Amazon Web Services Payment
     *        Cryptography.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReEncryptDataRequest withOutgoingEncryptionAttributes(ReEncryptionAttributes outgoingEncryptionAttributes) {
        setOutgoingEncryptionAttributes(outgoingEncryptionAttributes);
        return this;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the encryption key of outgoing ciphertext data after encryption by Amazon Web Services
     * Payment Cryptography.
     * </p>
     * 
     * @param outgoingKeyIdentifier
     *        The <code>keyARN</code> of the encryption key of outgoing ciphertext data after encryption by Amazon Web
     *        Services Payment Cryptography.
     */

    public void setOutgoingKeyIdentifier(String outgoingKeyIdentifier) {
        this.outgoingKeyIdentifier = outgoingKeyIdentifier;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the encryption key of outgoing ciphertext data after encryption by Amazon Web Services
     * Payment Cryptography.
     * </p>
     * 
     * @return The <code>keyARN</code> of the encryption key of outgoing ciphertext data after encryption by Amazon Web
     *         Services Payment Cryptography.
     */

    public String getOutgoingKeyIdentifier() {
        return this.outgoingKeyIdentifier;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the encryption key of outgoing ciphertext data after encryption by Amazon Web Services
     * Payment Cryptography.
     * </p>
     * 
     * @param outgoingKeyIdentifier
     *        The <code>keyARN</code> of the encryption key of outgoing ciphertext data after encryption by Amazon Web
     *        Services Payment Cryptography.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReEncryptDataRequest withOutgoingKeyIdentifier(String outgoingKeyIdentifier) {
        setOutgoingKeyIdentifier(outgoingKeyIdentifier);
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
        if (getCipherText() != null)
            sb.append("CipherText: ").append("***Sensitive Data Redacted***").append(",");
        if (getIncomingEncryptionAttributes() != null)
            sb.append("IncomingEncryptionAttributes: ").append(getIncomingEncryptionAttributes()).append(",");
        if (getIncomingKeyIdentifier() != null)
            sb.append("IncomingKeyIdentifier: ").append(getIncomingKeyIdentifier()).append(",");
        if (getOutgoingEncryptionAttributes() != null)
            sb.append("OutgoingEncryptionAttributes: ").append(getOutgoingEncryptionAttributes()).append(",");
        if (getOutgoingKeyIdentifier() != null)
            sb.append("OutgoingKeyIdentifier: ").append(getOutgoingKeyIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReEncryptDataRequest == false)
            return false;
        ReEncryptDataRequest other = (ReEncryptDataRequest) obj;
        if (other.getCipherText() == null ^ this.getCipherText() == null)
            return false;
        if (other.getCipherText() != null && other.getCipherText().equals(this.getCipherText()) == false)
            return false;
        if (other.getIncomingEncryptionAttributes() == null ^ this.getIncomingEncryptionAttributes() == null)
            return false;
        if (other.getIncomingEncryptionAttributes() != null && other.getIncomingEncryptionAttributes().equals(this.getIncomingEncryptionAttributes()) == false)
            return false;
        if (other.getIncomingKeyIdentifier() == null ^ this.getIncomingKeyIdentifier() == null)
            return false;
        if (other.getIncomingKeyIdentifier() != null && other.getIncomingKeyIdentifier().equals(this.getIncomingKeyIdentifier()) == false)
            return false;
        if (other.getOutgoingEncryptionAttributes() == null ^ this.getOutgoingEncryptionAttributes() == null)
            return false;
        if (other.getOutgoingEncryptionAttributes() != null && other.getOutgoingEncryptionAttributes().equals(this.getOutgoingEncryptionAttributes()) == false)
            return false;
        if (other.getOutgoingKeyIdentifier() == null ^ this.getOutgoingKeyIdentifier() == null)
            return false;
        if (other.getOutgoingKeyIdentifier() != null && other.getOutgoingKeyIdentifier().equals(this.getOutgoingKeyIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCipherText() == null) ? 0 : getCipherText().hashCode());
        hashCode = prime * hashCode + ((getIncomingEncryptionAttributes() == null) ? 0 : getIncomingEncryptionAttributes().hashCode());
        hashCode = prime * hashCode + ((getIncomingKeyIdentifier() == null) ? 0 : getIncomingKeyIdentifier().hashCode());
        hashCode = prime * hashCode + ((getOutgoingEncryptionAttributes() == null) ? 0 : getOutgoingEncryptionAttributes().hashCode());
        hashCode = prime * hashCode + ((getOutgoingKeyIdentifier() == null) ? 0 : getOutgoingKeyIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public ReEncryptDataRequest clone() {
        return (ReEncryptDataRequest) super.clone();
    }

}
