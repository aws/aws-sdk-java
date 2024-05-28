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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/TranslatePinData"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TranslatePinDataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The encrypted PIN block data that Amazon Web Services Payment Cryptography translates.
     * </p>
     */
    private String encryptedPinBlock;
    /**
     * <p>
     * The attributes and values to use for incoming DUKPT encryption key for PIN block translation.
     * </p>
     */
    private DukptDerivationAttributes incomingDukptAttributes;
    /**
     * <p>
     * The <code>keyARN</code> of the encryption key under which incoming PIN block data is encrypted. This key type can
     * be PEK or BDK.
     * </p>
     */
    private String incomingKeyIdentifier;
    /**
     * <p>
     * The format of the incoming PIN block data for translation within Amazon Web Services Payment Cryptography.
     * </p>
     */
    private TranslationIsoFormats incomingTranslationAttributes;
    /**
     * <p>
     * The attributes and values to use for outgoing DUKPT encryption key after PIN block translation.
     * </p>
     */
    private DukptDerivationAttributes outgoingDukptAttributes;
    /**
     * <p>
     * The <code>keyARN</code> of the encryption key for encrypting outgoing PIN block data. This key type can be PEK or
     * BDK.
     * </p>
     */
    private String outgoingKeyIdentifier;
    /**
     * <p>
     * The format of the outgoing PIN block data after translation by Amazon Web Services Payment Cryptography.
     * </p>
     */
    private TranslationIsoFormats outgoingTranslationAttributes;

    /**
     * <p>
     * The encrypted PIN block data that Amazon Web Services Payment Cryptography translates.
     * </p>
     * 
     * @param encryptedPinBlock
     *        The encrypted PIN block data that Amazon Web Services Payment Cryptography translates.
     */

    public void setEncryptedPinBlock(String encryptedPinBlock) {
        this.encryptedPinBlock = encryptedPinBlock;
    }

    /**
     * <p>
     * The encrypted PIN block data that Amazon Web Services Payment Cryptography translates.
     * </p>
     * 
     * @return The encrypted PIN block data that Amazon Web Services Payment Cryptography translates.
     */

    public String getEncryptedPinBlock() {
        return this.encryptedPinBlock;
    }

    /**
     * <p>
     * The encrypted PIN block data that Amazon Web Services Payment Cryptography translates.
     * </p>
     * 
     * @param encryptedPinBlock
     *        The encrypted PIN block data that Amazon Web Services Payment Cryptography translates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranslatePinDataRequest withEncryptedPinBlock(String encryptedPinBlock) {
        setEncryptedPinBlock(encryptedPinBlock);
        return this;
    }

    /**
     * <p>
     * The attributes and values to use for incoming DUKPT encryption key for PIN block translation.
     * </p>
     * 
     * @param incomingDukptAttributes
     *        The attributes and values to use for incoming DUKPT encryption key for PIN block translation.
     */

    public void setIncomingDukptAttributes(DukptDerivationAttributes incomingDukptAttributes) {
        this.incomingDukptAttributes = incomingDukptAttributes;
    }

    /**
     * <p>
     * The attributes and values to use for incoming DUKPT encryption key for PIN block translation.
     * </p>
     * 
     * @return The attributes and values to use for incoming DUKPT encryption key for PIN block translation.
     */

    public DukptDerivationAttributes getIncomingDukptAttributes() {
        return this.incomingDukptAttributes;
    }

    /**
     * <p>
     * The attributes and values to use for incoming DUKPT encryption key for PIN block translation.
     * </p>
     * 
     * @param incomingDukptAttributes
     *        The attributes and values to use for incoming DUKPT encryption key for PIN block translation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranslatePinDataRequest withIncomingDukptAttributes(DukptDerivationAttributes incomingDukptAttributes) {
        setIncomingDukptAttributes(incomingDukptAttributes);
        return this;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the encryption key under which incoming PIN block data is encrypted. This key type can
     * be PEK or BDK.
     * </p>
     * 
     * @param incomingKeyIdentifier
     *        The <code>keyARN</code> of the encryption key under which incoming PIN block data is encrypted. This key
     *        type can be PEK or BDK.
     */

    public void setIncomingKeyIdentifier(String incomingKeyIdentifier) {
        this.incomingKeyIdentifier = incomingKeyIdentifier;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the encryption key under which incoming PIN block data is encrypted. This key type can
     * be PEK or BDK.
     * </p>
     * 
     * @return The <code>keyARN</code> of the encryption key under which incoming PIN block data is encrypted. This key
     *         type can be PEK or BDK.
     */

    public String getIncomingKeyIdentifier() {
        return this.incomingKeyIdentifier;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the encryption key under which incoming PIN block data is encrypted. This key type can
     * be PEK or BDK.
     * </p>
     * 
     * @param incomingKeyIdentifier
     *        The <code>keyARN</code> of the encryption key under which incoming PIN block data is encrypted. This key
     *        type can be PEK or BDK.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranslatePinDataRequest withIncomingKeyIdentifier(String incomingKeyIdentifier) {
        setIncomingKeyIdentifier(incomingKeyIdentifier);
        return this;
    }

    /**
     * <p>
     * The format of the incoming PIN block data for translation within Amazon Web Services Payment Cryptography.
     * </p>
     * 
     * @param incomingTranslationAttributes
     *        The format of the incoming PIN block data for translation within Amazon Web Services Payment Cryptography.
     */

    public void setIncomingTranslationAttributes(TranslationIsoFormats incomingTranslationAttributes) {
        this.incomingTranslationAttributes = incomingTranslationAttributes;
    }

    /**
     * <p>
     * The format of the incoming PIN block data for translation within Amazon Web Services Payment Cryptography.
     * </p>
     * 
     * @return The format of the incoming PIN block data for translation within Amazon Web Services Payment
     *         Cryptography.
     */

    public TranslationIsoFormats getIncomingTranslationAttributes() {
        return this.incomingTranslationAttributes;
    }

    /**
     * <p>
     * The format of the incoming PIN block data for translation within Amazon Web Services Payment Cryptography.
     * </p>
     * 
     * @param incomingTranslationAttributes
     *        The format of the incoming PIN block data for translation within Amazon Web Services Payment Cryptography.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranslatePinDataRequest withIncomingTranslationAttributes(TranslationIsoFormats incomingTranslationAttributes) {
        setIncomingTranslationAttributes(incomingTranslationAttributes);
        return this;
    }

    /**
     * <p>
     * The attributes and values to use for outgoing DUKPT encryption key after PIN block translation.
     * </p>
     * 
     * @param outgoingDukptAttributes
     *        The attributes and values to use for outgoing DUKPT encryption key after PIN block translation.
     */

    public void setOutgoingDukptAttributes(DukptDerivationAttributes outgoingDukptAttributes) {
        this.outgoingDukptAttributes = outgoingDukptAttributes;
    }

    /**
     * <p>
     * The attributes and values to use for outgoing DUKPT encryption key after PIN block translation.
     * </p>
     * 
     * @return The attributes and values to use for outgoing DUKPT encryption key after PIN block translation.
     */

    public DukptDerivationAttributes getOutgoingDukptAttributes() {
        return this.outgoingDukptAttributes;
    }

    /**
     * <p>
     * The attributes and values to use for outgoing DUKPT encryption key after PIN block translation.
     * </p>
     * 
     * @param outgoingDukptAttributes
     *        The attributes and values to use for outgoing DUKPT encryption key after PIN block translation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranslatePinDataRequest withOutgoingDukptAttributes(DukptDerivationAttributes outgoingDukptAttributes) {
        setOutgoingDukptAttributes(outgoingDukptAttributes);
        return this;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the encryption key for encrypting outgoing PIN block data. This key type can be PEK or
     * BDK.
     * </p>
     * 
     * @param outgoingKeyIdentifier
     *        The <code>keyARN</code> of the encryption key for encrypting outgoing PIN block data. This key type can be
     *        PEK or BDK.
     */

    public void setOutgoingKeyIdentifier(String outgoingKeyIdentifier) {
        this.outgoingKeyIdentifier = outgoingKeyIdentifier;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the encryption key for encrypting outgoing PIN block data. This key type can be PEK or
     * BDK.
     * </p>
     * 
     * @return The <code>keyARN</code> of the encryption key for encrypting outgoing PIN block data. This key type can
     *         be PEK or BDK.
     */

    public String getOutgoingKeyIdentifier() {
        return this.outgoingKeyIdentifier;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the encryption key for encrypting outgoing PIN block data. This key type can be PEK or
     * BDK.
     * </p>
     * 
     * @param outgoingKeyIdentifier
     *        The <code>keyARN</code> of the encryption key for encrypting outgoing PIN block data. This key type can be
     *        PEK or BDK.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranslatePinDataRequest withOutgoingKeyIdentifier(String outgoingKeyIdentifier) {
        setOutgoingKeyIdentifier(outgoingKeyIdentifier);
        return this;
    }

    /**
     * <p>
     * The format of the outgoing PIN block data after translation by Amazon Web Services Payment Cryptography.
     * </p>
     * 
     * @param outgoingTranslationAttributes
     *        The format of the outgoing PIN block data after translation by Amazon Web Services Payment Cryptography.
     */

    public void setOutgoingTranslationAttributes(TranslationIsoFormats outgoingTranslationAttributes) {
        this.outgoingTranslationAttributes = outgoingTranslationAttributes;
    }

    /**
     * <p>
     * The format of the outgoing PIN block data after translation by Amazon Web Services Payment Cryptography.
     * </p>
     * 
     * @return The format of the outgoing PIN block data after translation by Amazon Web Services Payment Cryptography.
     */

    public TranslationIsoFormats getOutgoingTranslationAttributes() {
        return this.outgoingTranslationAttributes;
    }

    /**
     * <p>
     * The format of the outgoing PIN block data after translation by Amazon Web Services Payment Cryptography.
     * </p>
     * 
     * @param outgoingTranslationAttributes
     *        The format of the outgoing PIN block data after translation by Amazon Web Services Payment Cryptography.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranslatePinDataRequest withOutgoingTranslationAttributes(TranslationIsoFormats outgoingTranslationAttributes) {
        setOutgoingTranslationAttributes(outgoingTranslationAttributes);
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
        if (getEncryptedPinBlock() != null)
            sb.append("EncryptedPinBlock: ").append("***Sensitive Data Redacted***").append(",");
        if (getIncomingDukptAttributes() != null)
            sb.append("IncomingDukptAttributes: ").append(getIncomingDukptAttributes()).append(",");
        if (getIncomingKeyIdentifier() != null)
            sb.append("IncomingKeyIdentifier: ").append(getIncomingKeyIdentifier()).append(",");
        if (getIncomingTranslationAttributes() != null)
            sb.append("IncomingTranslationAttributes: ").append(getIncomingTranslationAttributes()).append(",");
        if (getOutgoingDukptAttributes() != null)
            sb.append("OutgoingDukptAttributes: ").append(getOutgoingDukptAttributes()).append(",");
        if (getOutgoingKeyIdentifier() != null)
            sb.append("OutgoingKeyIdentifier: ").append(getOutgoingKeyIdentifier()).append(",");
        if (getOutgoingTranslationAttributes() != null)
            sb.append("OutgoingTranslationAttributes: ").append(getOutgoingTranslationAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TranslatePinDataRequest == false)
            return false;
        TranslatePinDataRequest other = (TranslatePinDataRequest) obj;
        if (other.getEncryptedPinBlock() == null ^ this.getEncryptedPinBlock() == null)
            return false;
        if (other.getEncryptedPinBlock() != null && other.getEncryptedPinBlock().equals(this.getEncryptedPinBlock()) == false)
            return false;
        if (other.getIncomingDukptAttributes() == null ^ this.getIncomingDukptAttributes() == null)
            return false;
        if (other.getIncomingDukptAttributes() != null && other.getIncomingDukptAttributes().equals(this.getIncomingDukptAttributes()) == false)
            return false;
        if (other.getIncomingKeyIdentifier() == null ^ this.getIncomingKeyIdentifier() == null)
            return false;
        if (other.getIncomingKeyIdentifier() != null && other.getIncomingKeyIdentifier().equals(this.getIncomingKeyIdentifier()) == false)
            return false;
        if (other.getIncomingTranslationAttributes() == null ^ this.getIncomingTranslationAttributes() == null)
            return false;
        if (other.getIncomingTranslationAttributes() != null
                && other.getIncomingTranslationAttributes().equals(this.getIncomingTranslationAttributes()) == false)
            return false;
        if (other.getOutgoingDukptAttributes() == null ^ this.getOutgoingDukptAttributes() == null)
            return false;
        if (other.getOutgoingDukptAttributes() != null && other.getOutgoingDukptAttributes().equals(this.getOutgoingDukptAttributes()) == false)
            return false;
        if (other.getOutgoingKeyIdentifier() == null ^ this.getOutgoingKeyIdentifier() == null)
            return false;
        if (other.getOutgoingKeyIdentifier() != null && other.getOutgoingKeyIdentifier().equals(this.getOutgoingKeyIdentifier()) == false)
            return false;
        if (other.getOutgoingTranslationAttributes() == null ^ this.getOutgoingTranslationAttributes() == null)
            return false;
        if (other.getOutgoingTranslationAttributes() != null
                && other.getOutgoingTranslationAttributes().equals(this.getOutgoingTranslationAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncryptedPinBlock() == null) ? 0 : getEncryptedPinBlock().hashCode());
        hashCode = prime * hashCode + ((getIncomingDukptAttributes() == null) ? 0 : getIncomingDukptAttributes().hashCode());
        hashCode = prime * hashCode + ((getIncomingKeyIdentifier() == null) ? 0 : getIncomingKeyIdentifier().hashCode());
        hashCode = prime * hashCode + ((getIncomingTranslationAttributes() == null) ? 0 : getIncomingTranslationAttributes().hashCode());
        hashCode = prime * hashCode + ((getOutgoingDukptAttributes() == null) ? 0 : getOutgoingDukptAttributes().hashCode());
        hashCode = prime * hashCode + ((getOutgoingKeyIdentifier() == null) ? 0 : getOutgoingKeyIdentifier().hashCode());
        hashCode = prime * hashCode + ((getOutgoingTranslationAttributes() == null) ? 0 : getOutgoingTranslationAttributes().hashCode());
        return hashCode;
    }

    @Override
    public TranslatePinDataRequest clone() {
        return (TranslatePinDataRequest) super.clone();
    }

}
