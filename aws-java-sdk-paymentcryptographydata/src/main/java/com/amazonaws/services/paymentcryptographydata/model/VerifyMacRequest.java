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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/VerifyMac"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VerifyMacRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>keyARN</code> of the encryption key that Amazon Web Services Payment Cryptography uses to verify MAC
     * data.
     * </p>
     */
    private String keyIdentifier;
    /**
     * <p>
     * The MAC being verified.
     * </p>
     */
    private String mac;
    /**
     * <p>
     * The length of the MAC.
     * </p>
     */
    private Integer macLength;
    /**
     * <p>
     * The data on for which MAC is under verification. This value must be hexBinary.
     * </p>
     */
    private String messageData;
    /**
     * <p>
     * The attributes and data values to use for MAC verification within Amazon Web Services Payment Cryptography.
     * </p>
     */
    private MacAttributes verificationAttributes;

    /**
     * <p>
     * The <code>keyARN</code> of the encryption key that Amazon Web Services Payment Cryptography uses to verify MAC
     * data.
     * </p>
     * 
     * @param keyIdentifier
     *        The <code>keyARN</code> of the encryption key that Amazon Web Services Payment Cryptography uses to verify
     *        MAC data.
     */

    public void setKeyIdentifier(String keyIdentifier) {
        this.keyIdentifier = keyIdentifier;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the encryption key that Amazon Web Services Payment Cryptography uses to verify MAC
     * data.
     * </p>
     * 
     * @return The <code>keyARN</code> of the encryption key that Amazon Web Services Payment Cryptography uses to
     *         verify MAC data.
     */

    public String getKeyIdentifier() {
        return this.keyIdentifier;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the encryption key that Amazon Web Services Payment Cryptography uses to verify MAC
     * data.
     * </p>
     * 
     * @param keyIdentifier
     *        The <code>keyARN</code> of the encryption key that Amazon Web Services Payment Cryptography uses to verify
     *        MAC data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifyMacRequest withKeyIdentifier(String keyIdentifier) {
        setKeyIdentifier(keyIdentifier);
        return this;
    }

    /**
     * <p>
     * The MAC being verified.
     * </p>
     * 
     * @param mac
     *        The MAC being verified.
     */

    public void setMac(String mac) {
        this.mac = mac;
    }

    /**
     * <p>
     * The MAC being verified.
     * </p>
     * 
     * @return The MAC being verified.
     */

    public String getMac() {
        return this.mac;
    }

    /**
     * <p>
     * The MAC being verified.
     * </p>
     * 
     * @param mac
     *        The MAC being verified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifyMacRequest withMac(String mac) {
        setMac(mac);
        return this;
    }

    /**
     * <p>
     * The length of the MAC.
     * </p>
     * 
     * @param macLength
     *        The length of the MAC.
     */

    public void setMacLength(Integer macLength) {
        this.macLength = macLength;
    }

    /**
     * <p>
     * The length of the MAC.
     * </p>
     * 
     * @return The length of the MAC.
     */

    public Integer getMacLength() {
        return this.macLength;
    }

    /**
     * <p>
     * The length of the MAC.
     * </p>
     * 
     * @param macLength
     *        The length of the MAC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifyMacRequest withMacLength(Integer macLength) {
        setMacLength(macLength);
        return this;
    }

    /**
     * <p>
     * The data on for which MAC is under verification. This value must be hexBinary.
     * </p>
     * 
     * @param messageData
     *        The data on for which MAC is under verification. This value must be hexBinary.
     */

    public void setMessageData(String messageData) {
        this.messageData = messageData;
    }

    /**
     * <p>
     * The data on for which MAC is under verification. This value must be hexBinary.
     * </p>
     * 
     * @return The data on for which MAC is under verification. This value must be hexBinary.
     */

    public String getMessageData() {
        return this.messageData;
    }

    /**
     * <p>
     * The data on for which MAC is under verification. This value must be hexBinary.
     * </p>
     * 
     * @param messageData
     *        The data on for which MAC is under verification. This value must be hexBinary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifyMacRequest withMessageData(String messageData) {
        setMessageData(messageData);
        return this;
    }

    /**
     * <p>
     * The attributes and data values to use for MAC verification within Amazon Web Services Payment Cryptography.
     * </p>
     * 
     * @param verificationAttributes
     *        The attributes and data values to use for MAC verification within Amazon Web Services Payment
     *        Cryptography.
     */

    public void setVerificationAttributes(MacAttributes verificationAttributes) {
        this.verificationAttributes = verificationAttributes;
    }

    /**
     * <p>
     * The attributes and data values to use for MAC verification within Amazon Web Services Payment Cryptography.
     * </p>
     * 
     * @return The attributes and data values to use for MAC verification within Amazon Web Services Payment
     *         Cryptography.
     */

    public MacAttributes getVerificationAttributes() {
        return this.verificationAttributes;
    }

    /**
     * <p>
     * The attributes and data values to use for MAC verification within Amazon Web Services Payment Cryptography.
     * </p>
     * 
     * @param verificationAttributes
     *        The attributes and data values to use for MAC verification within Amazon Web Services Payment
     *        Cryptography.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifyMacRequest withVerificationAttributes(MacAttributes verificationAttributes) {
        setVerificationAttributes(verificationAttributes);
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
        if (getKeyIdentifier() != null)
            sb.append("KeyIdentifier: ").append(getKeyIdentifier()).append(",");
        if (getMac() != null)
            sb.append("Mac: ").append("***Sensitive Data Redacted***").append(",");
        if (getMacLength() != null)
            sb.append("MacLength: ").append(getMacLength()).append(",");
        if (getMessageData() != null)
            sb.append("MessageData: ").append("***Sensitive Data Redacted***").append(",");
        if (getVerificationAttributes() != null)
            sb.append("VerificationAttributes: ").append(getVerificationAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VerifyMacRequest == false)
            return false;
        VerifyMacRequest other = (VerifyMacRequest) obj;
        if (other.getKeyIdentifier() == null ^ this.getKeyIdentifier() == null)
            return false;
        if (other.getKeyIdentifier() != null && other.getKeyIdentifier().equals(this.getKeyIdentifier()) == false)
            return false;
        if (other.getMac() == null ^ this.getMac() == null)
            return false;
        if (other.getMac() != null && other.getMac().equals(this.getMac()) == false)
            return false;
        if (other.getMacLength() == null ^ this.getMacLength() == null)
            return false;
        if (other.getMacLength() != null && other.getMacLength().equals(this.getMacLength()) == false)
            return false;
        if (other.getMessageData() == null ^ this.getMessageData() == null)
            return false;
        if (other.getMessageData() != null && other.getMessageData().equals(this.getMessageData()) == false)
            return false;
        if (other.getVerificationAttributes() == null ^ this.getVerificationAttributes() == null)
            return false;
        if (other.getVerificationAttributes() != null && other.getVerificationAttributes().equals(this.getVerificationAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyIdentifier() == null) ? 0 : getKeyIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMac() == null) ? 0 : getMac().hashCode());
        hashCode = prime * hashCode + ((getMacLength() == null) ? 0 : getMacLength().hashCode());
        hashCode = prime * hashCode + ((getMessageData() == null) ? 0 : getMessageData().hashCode());
        hashCode = prime * hashCode + ((getVerificationAttributes() == null) ? 0 : getVerificationAttributes().hashCode());
        return hashCode;
    }

    @Override
    public VerifyMacRequest clone() {
        return (VerifyMacRequest) super.clone();
    }

}
