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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/GenerateMac"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GenerateMacRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The attributes and data values to use for MAC generation within Amazon Web Services Payment Cryptography.
     * </p>
     */
    private MacAttributes generationAttributes;
    /**
     * <p>
     * The <code>keyARN</code> of the MAC generation encryption key.
     * </p>
     */
    private String keyIdentifier;
    /**
     * <p>
     * The length of a MAC under generation.
     * </p>
     */
    private Integer macLength;
    /**
     * <p>
     * The data for which a MAC is under generation. This value must be hexBinary.
     * </p>
     */
    private String messageData;

    /**
     * <p>
     * The attributes and data values to use for MAC generation within Amazon Web Services Payment Cryptography.
     * </p>
     * 
     * @param generationAttributes
     *        The attributes and data values to use for MAC generation within Amazon Web Services Payment Cryptography.
     */

    public void setGenerationAttributes(MacAttributes generationAttributes) {
        this.generationAttributes = generationAttributes;
    }

    /**
     * <p>
     * The attributes and data values to use for MAC generation within Amazon Web Services Payment Cryptography.
     * </p>
     * 
     * @return The attributes and data values to use for MAC generation within Amazon Web Services Payment Cryptography.
     */

    public MacAttributes getGenerationAttributes() {
        return this.generationAttributes;
    }

    /**
     * <p>
     * The attributes and data values to use for MAC generation within Amazon Web Services Payment Cryptography.
     * </p>
     * 
     * @param generationAttributes
     *        The attributes and data values to use for MAC generation within Amazon Web Services Payment Cryptography.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateMacRequest withGenerationAttributes(MacAttributes generationAttributes) {
        setGenerationAttributes(generationAttributes);
        return this;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the MAC generation encryption key.
     * </p>
     * 
     * @param keyIdentifier
     *        The <code>keyARN</code> of the MAC generation encryption key.
     */

    public void setKeyIdentifier(String keyIdentifier) {
        this.keyIdentifier = keyIdentifier;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the MAC generation encryption key.
     * </p>
     * 
     * @return The <code>keyARN</code> of the MAC generation encryption key.
     */

    public String getKeyIdentifier() {
        return this.keyIdentifier;
    }

    /**
     * <p>
     * The <code>keyARN</code> of the MAC generation encryption key.
     * </p>
     * 
     * @param keyIdentifier
     *        The <code>keyARN</code> of the MAC generation encryption key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateMacRequest withKeyIdentifier(String keyIdentifier) {
        setKeyIdentifier(keyIdentifier);
        return this;
    }

    /**
     * <p>
     * The length of a MAC under generation.
     * </p>
     * 
     * @param macLength
     *        The length of a MAC under generation.
     */

    public void setMacLength(Integer macLength) {
        this.macLength = macLength;
    }

    /**
     * <p>
     * The length of a MAC under generation.
     * </p>
     * 
     * @return The length of a MAC under generation.
     */

    public Integer getMacLength() {
        return this.macLength;
    }

    /**
     * <p>
     * The length of a MAC under generation.
     * </p>
     * 
     * @param macLength
     *        The length of a MAC under generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateMacRequest withMacLength(Integer macLength) {
        setMacLength(macLength);
        return this;
    }

    /**
     * <p>
     * The data for which a MAC is under generation. This value must be hexBinary.
     * </p>
     * 
     * @param messageData
     *        The data for which a MAC is under generation. This value must be hexBinary.
     */

    public void setMessageData(String messageData) {
        this.messageData = messageData;
    }

    /**
     * <p>
     * The data for which a MAC is under generation. This value must be hexBinary.
     * </p>
     * 
     * @return The data for which a MAC is under generation. This value must be hexBinary.
     */

    public String getMessageData() {
        return this.messageData;
    }

    /**
     * <p>
     * The data for which a MAC is under generation. This value must be hexBinary.
     * </p>
     * 
     * @param messageData
     *        The data for which a MAC is under generation. This value must be hexBinary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateMacRequest withMessageData(String messageData) {
        setMessageData(messageData);
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
        if (getGenerationAttributes() != null)
            sb.append("GenerationAttributes: ").append(getGenerationAttributes()).append(",");
        if (getKeyIdentifier() != null)
            sb.append("KeyIdentifier: ").append(getKeyIdentifier()).append(",");
        if (getMacLength() != null)
            sb.append("MacLength: ").append(getMacLength()).append(",");
        if (getMessageData() != null)
            sb.append("MessageData: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenerateMacRequest == false)
            return false;
        GenerateMacRequest other = (GenerateMacRequest) obj;
        if (other.getGenerationAttributes() == null ^ this.getGenerationAttributes() == null)
            return false;
        if (other.getGenerationAttributes() != null && other.getGenerationAttributes().equals(this.getGenerationAttributes()) == false)
            return false;
        if (other.getKeyIdentifier() == null ^ this.getKeyIdentifier() == null)
            return false;
        if (other.getKeyIdentifier() != null && other.getKeyIdentifier().equals(this.getKeyIdentifier()) == false)
            return false;
        if (other.getMacLength() == null ^ this.getMacLength() == null)
            return false;
        if (other.getMacLength() != null && other.getMacLength().equals(this.getMacLength()) == false)
            return false;
        if (other.getMessageData() == null ^ this.getMessageData() == null)
            return false;
        if (other.getMessageData() != null && other.getMessageData().equals(this.getMessageData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGenerationAttributes() == null) ? 0 : getGenerationAttributes().hashCode());
        hashCode = prime * hashCode + ((getKeyIdentifier() == null) ? 0 : getKeyIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMacLength() == null) ? 0 : getMacLength().hashCode());
        hashCode = prime * hashCode + ((getMessageData() == null) ? 0 : getMessageData().hashCode());
        return hashCode;
    }

    @Override
    public GenerateMacRequest clone() {
        return (GenerateMacRequest) super.clone();
    }

}
