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
 * Settings for decrypting any input files that you encrypt before you upload them to Amazon S3. MediaConvert can
 * decrypt files only when you use AWS Key Management Service (KMS) to encrypt the data key that you use to encrypt your
 * content.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/InputDecryptionSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputDecryptionSettings implements Serializable, Cloneable, StructuredPojo {

    /** Specify the encryption mode that you used to encrypt your input files. */
    private String decryptionMode;
    /**
     * Warning! Don't provide your encryption key in plaintext. Your job settings could be intercepted, making your
     * encrypted content vulnerable. Specify the encrypted version of the data key that you used to encrypt your
     * content. The data key must be encrypted by AWS Key Management Service (KMS). The key can be 128, 192, or 256 bits.
     */
    private String encryptedDecryptionKey;
    /**
     * Specify the initialization vector that you used when you encrypted your content before uploading it to Amazon S3.
     * You can use a 16-byte initialization vector with any encryption mode. Or, you can use a 12-byte initialization
     * vector with GCM or CTR. MediaConvert accepts only initialization vectors that are base64-encoded.
     */
    private String initializationVector;
    /**
     * Specify the AWS Region for AWS Key Management Service (KMS) that you used to encrypt your data key, if that
     * Region is different from the one you are using for AWS Elemental MediaConvert.
     */
    private String kmsKeyRegion;

    /**
     * Specify the encryption mode that you used to encrypt your input files.
     * 
     * @param decryptionMode
     *        Specify the encryption mode that you used to encrypt your input files.
     * @see DecryptionMode
     */

    public void setDecryptionMode(String decryptionMode) {
        this.decryptionMode = decryptionMode;
    }

    /**
     * Specify the encryption mode that you used to encrypt your input files.
     * 
     * @return Specify the encryption mode that you used to encrypt your input files.
     * @see DecryptionMode
     */

    public String getDecryptionMode() {
        return this.decryptionMode;
    }

    /**
     * Specify the encryption mode that you used to encrypt your input files.
     * 
     * @param decryptionMode
     *        Specify the encryption mode that you used to encrypt your input files.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DecryptionMode
     */

    public InputDecryptionSettings withDecryptionMode(String decryptionMode) {
        setDecryptionMode(decryptionMode);
        return this;
    }

    /**
     * Specify the encryption mode that you used to encrypt your input files.
     * 
     * @param decryptionMode
     *        Specify the encryption mode that you used to encrypt your input files.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DecryptionMode
     */

    public InputDecryptionSettings withDecryptionMode(DecryptionMode decryptionMode) {
        this.decryptionMode = decryptionMode.toString();
        return this;
    }

    /**
     * Warning! Don't provide your encryption key in plaintext. Your job settings could be intercepted, making your
     * encrypted content vulnerable. Specify the encrypted version of the data key that you used to encrypt your
     * content. The data key must be encrypted by AWS Key Management Service (KMS). The key can be 128, 192, or 256 bits.
     * 
     * @param encryptedDecryptionKey
     *        Warning! Don't provide your encryption key in plaintext. Your job settings could be intercepted, making
     *        your encrypted content vulnerable. Specify the encrypted version of the data key that you used to encrypt
     *        your content. The data key must be encrypted by AWS Key Management Service (KMS). The key can be 128, 192,
     *        or 256 bits.
     */

    public void setEncryptedDecryptionKey(String encryptedDecryptionKey) {
        this.encryptedDecryptionKey = encryptedDecryptionKey;
    }

    /**
     * Warning! Don't provide your encryption key in plaintext. Your job settings could be intercepted, making your
     * encrypted content vulnerable. Specify the encrypted version of the data key that you used to encrypt your
     * content. The data key must be encrypted by AWS Key Management Service (KMS). The key can be 128, 192, or 256 bits.
     * 
     * @return Warning! Don't provide your encryption key in plaintext. Your job settings could be intercepted, making
     *         your encrypted content vulnerable. Specify the encrypted version of the data key that you used to encrypt
     *         your content. The data key must be encrypted by AWS Key Management Service (KMS). The key can be 128,
     *         192, or 256 bits.
     */

    public String getEncryptedDecryptionKey() {
        return this.encryptedDecryptionKey;
    }

    /**
     * Warning! Don't provide your encryption key in plaintext. Your job settings could be intercepted, making your
     * encrypted content vulnerable. Specify the encrypted version of the data key that you used to encrypt your
     * content. The data key must be encrypted by AWS Key Management Service (KMS). The key can be 128, 192, or 256 bits.
     * 
     * @param encryptedDecryptionKey
     *        Warning! Don't provide your encryption key in plaintext. Your job settings could be intercepted, making
     *        your encrypted content vulnerable. Specify the encrypted version of the data key that you used to encrypt
     *        your content. The data key must be encrypted by AWS Key Management Service (KMS). The key can be 128, 192,
     *        or 256 bits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDecryptionSettings withEncryptedDecryptionKey(String encryptedDecryptionKey) {
        setEncryptedDecryptionKey(encryptedDecryptionKey);
        return this;
    }

    /**
     * Specify the initialization vector that you used when you encrypted your content before uploading it to Amazon S3.
     * You can use a 16-byte initialization vector with any encryption mode. Or, you can use a 12-byte initialization
     * vector with GCM or CTR. MediaConvert accepts only initialization vectors that are base64-encoded.
     * 
     * @param initializationVector
     *        Specify the initialization vector that you used when you encrypted your content before uploading it to
     *        Amazon S3. You can use a 16-byte initialization vector with any encryption mode. Or, you can use a 12-byte
     *        initialization vector with GCM or CTR. MediaConvert accepts only initialization vectors that are
     *        base64-encoded.
     */

    public void setInitializationVector(String initializationVector) {
        this.initializationVector = initializationVector;
    }

    /**
     * Specify the initialization vector that you used when you encrypted your content before uploading it to Amazon S3.
     * You can use a 16-byte initialization vector with any encryption mode. Or, you can use a 12-byte initialization
     * vector with GCM or CTR. MediaConvert accepts only initialization vectors that are base64-encoded.
     * 
     * @return Specify the initialization vector that you used when you encrypted your content before uploading it to
     *         Amazon S3. You can use a 16-byte initialization vector with any encryption mode. Or, you can use a
     *         12-byte initialization vector with GCM or CTR. MediaConvert accepts only initialization vectors that are
     *         base64-encoded.
     */

    public String getInitializationVector() {
        return this.initializationVector;
    }

    /**
     * Specify the initialization vector that you used when you encrypted your content before uploading it to Amazon S3.
     * You can use a 16-byte initialization vector with any encryption mode. Or, you can use a 12-byte initialization
     * vector with GCM or CTR. MediaConvert accepts only initialization vectors that are base64-encoded.
     * 
     * @param initializationVector
     *        Specify the initialization vector that you used when you encrypted your content before uploading it to
     *        Amazon S3. You can use a 16-byte initialization vector with any encryption mode. Or, you can use a 12-byte
     *        initialization vector with GCM or CTR. MediaConvert accepts only initialization vectors that are
     *        base64-encoded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDecryptionSettings withInitializationVector(String initializationVector) {
        setInitializationVector(initializationVector);
        return this;
    }

    /**
     * Specify the AWS Region for AWS Key Management Service (KMS) that you used to encrypt your data key, if that
     * Region is different from the one you are using for AWS Elemental MediaConvert.
     * 
     * @param kmsKeyRegion
     *        Specify the AWS Region for AWS Key Management Service (KMS) that you used to encrypt your data key, if
     *        that Region is different from the one you are using for AWS Elemental MediaConvert.
     */

    public void setKmsKeyRegion(String kmsKeyRegion) {
        this.kmsKeyRegion = kmsKeyRegion;
    }

    /**
     * Specify the AWS Region for AWS Key Management Service (KMS) that you used to encrypt your data key, if that
     * Region is different from the one you are using for AWS Elemental MediaConvert.
     * 
     * @return Specify the AWS Region for AWS Key Management Service (KMS) that you used to encrypt your data key, if
     *         that Region is different from the one you are using for AWS Elemental MediaConvert.
     */

    public String getKmsKeyRegion() {
        return this.kmsKeyRegion;
    }

    /**
     * Specify the AWS Region for AWS Key Management Service (KMS) that you used to encrypt your data key, if that
     * Region is different from the one you are using for AWS Elemental MediaConvert.
     * 
     * @param kmsKeyRegion
     *        Specify the AWS Region for AWS Key Management Service (KMS) that you used to encrypt your data key, if
     *        that Region is different from the one you are using for AWS Elemental MediaConvert.
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
