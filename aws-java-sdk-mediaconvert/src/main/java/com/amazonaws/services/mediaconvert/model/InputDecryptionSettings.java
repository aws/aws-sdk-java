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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Specify the decryption settings used to decrypt encrypted input
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/InputDecryptionSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputDecryptionSettings implements Serializable, Cloneable, StructuredPojo {

    private String decryptionMode;
    /** Decryption key either 128 or 192 or 256 bits encrypted with KMS */
    private String encryptedDecryptionKey;
    /** Initialization Vector 96 bits (CTR/GCM mode only) or 128 bits. */
    private String initializationVector;
    /** The AWS region in which decryption key was encrypted with KMS */
    private String kmsKeyRegion;

    /**
     * @param decryptionMode
     * @see DecryptionMode
     */

    public void setDecryptionMode(String decryptionMode) {
        this.decryptionMode = decryptionMode;
    }

    /**
     * @return
     * @see DecryptionMode
     */

    public String getDecryptionMode() {
        return this.decryptionMode;
    }

    /**
     * @param decryptionMode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DecryptionMode
     */

    public InputDecryptionSettings withDecryptionMode(String decryptionMode) {
        setDecryptionMode(decryptionMode);
        return this;
    }

    /**
     * @param decryptionMode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DecryptionMode
     */

    public InputDecryptionSettings withDecryptionMode(DecryptionMode decryptionMode) {
        this.decryptionMode = decryptionMode.toString();
        return this;
    }

    /**
     * Decryption key either 128 or 192 or 256 bits encrypted with KMS
     * 
     * @param encryptedDecryptionKey
     *        Decryption key either 128 or 192 or 256 bits encrypted with KMS
     */

    public void setEncryptedDecryptionKey(String encryptedDecryptionKey) {
        this.encryptedDecryptionKey = encryptedDecryptionKey;
    }

    /**
     * Decryption key either 128 or 192 or 256 bits encrypted with KMS
     * 
     * @return Decryption key either 128 or 192 or 256 bits encrypted with KMS
     */

    public String getEncryptedDecryptionKey() {
        return this.encryptedDecryptionKey;
    }

    /**
     * Decryption key either 128 or 192 or 256 bits encrypted with KMS
     * 
     * @param encryptedDecryptionKey
     *        Decryption key either 128 or 192 or 256 bits encrypted with KMS
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDecryptionSettings withEncryptedDecryptionKey(String encryptedDecryptionKey) {
        setEncryptedDecryptionKey(encryptedDecryptionKey);
        return this;
    }

    /**
     * Initialization Vector 96 bits (CTR/GCM mode only) or 128 bits.
     * 
     * @param initializationVector
     *        Initialization Vector 96 bits (CTR/GCM mode only) or 128 bits.
     */

    public void setInitializationVector(String initializationVector) {
        this.initializationVector = initializationVector;
    }

    /**
     * Initialization Vector 96 bits (CTR/GCM mode only) or 128 bits.
     * 
     * @return Initialization Vector 96 bits (CTR/GCM mode only) or 128 bits.
     */

    public String getInitializationVector() {
        return this.initializationVector;
    }

    /**
     * Initialization Vector 96 bits (CTR/GCM mode only) or 128 bits.
     * 
     * @param initializationVector
     *        Initialization Vector 96 bits (CTR/GCM mode only) or 128 bits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDecryptionSettings withInitializationVector(String initializationVector) {
        setInitializationVector(initializationVector);
        return this;
    }

    /**
     * The AWS region in which decryption key was encrypted with KMS
     * 
     * @param kmsKeyRegion
     *        The AWS region in which decryption key was encrypted with KMS
     */

    public void setKmsKeyRegion(String kmsKeyRegion) {
        this.kmsKeyRegion = kmsKeyRegion;
    }

    /**
     * The AWS region in which decryption key was encrypted with KMS
     * 
     * @return The AWS region in which decryption key was encrypted with KMS
     */

    public String getKmsKeyRegion() {
        return this.kmsKeyRegion;
    }

    /**
     * The AWS region in which decryption key was encrypted with KMS
     * 
     * @param kmsKeyRegion
     *        The AWS region in which decryption key was encrypted with KMS
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDecryptionSettings withKmsKeyRegion(String kmsKeyRegion) {
        setKmsKeyRegion(kmsKeyRegion);
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
        if (getDecryptionMode() != null)
            sb.append("DecryptionMode: ").append(getDecryptionMode()).append(",");
        if (getEncryptedDecryptionKey() != null)
            sb.append("EncryptedDecryptionKey: ").append(getEncryptedDecryptionKey()).append(",");
        if (getInitializationVector() != null)
            sb.append("InitializationVector: ").append(getInitializationVector()).append(",");
        if (getKmsKeyRegion() != null)
            sb.append("KmsKeyRegion: ").append(getKmsKeyRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputDecryptionSettings == false)
            return false;
        InputDecryptionSettings other = (InputDecryptionSettings) obj;
        if (other.getDecryptionMode() == null ^ this.getDecryptionMode() == null)
            return false;
        if (other.getDecryptionMode() != null && other.getDecryptionMode().equals(this.getDecryptionMode()) == false)
            return false;
        if (other.getEncryptedDecryptionKey() == null ^ this.getEncryptedDecryptionKey() == null)
            return false;
        if (other.getEncryptedDecryptionKey() != null && other.getEncryptedDecryptionKey().equals(this.getEncryptedDecryptionKey()) == false)
            return false;
        if (other.getInitializationVector() == null ^ this.getInitializationVector() == null)
            return false;
        if (other.getInitializationVector() != null && other.getInitializationVector().equals(this.getInitializationVector()) == false)
            return false;
        if (other.getKmsKeyRegion() == null ^ this.getKmsKeyRegion() == null)
            return false;
        if (other.getKmsKeyRegion() != null && other.getKmsKeyRegion().equals(this.getKmsKeyRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDecryptionMode() == null) ? 0 : getDecryptionMode().hashCode());
        hashCode = prime * hashCode + ((getEncryptedDecryptionKey() == null) ? 0 : getEncryptedDecryptionKey().hashCode());
        hashCode = prime * hashCode + ((getInitializationVector() == null) ? 0 : getInitializationVector().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyRegion() == null) ? 0 : getKmsKeyRegion().hashCode());
        return hashCode;
    }

    @Override
    public InputDecryptionSettings clone() {
        try {
            return (InputDecryptionSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.InputDecryptionSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
