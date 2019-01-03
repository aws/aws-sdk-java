/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * Describes the server-side encryption that will be applied to the restore results.
 */
public class Encryption implements Serializable, Cloneable {

    /**
     * The server-side encryption algorithm used when storing job results in Amazon S3 (e.g., AES256, aws:kms).
     */
    private String encryptionType;

    /**
     * Specifies the AWS KMS key ID to use for object encryption. All GET and PUT requests for an object protected by AWS KMS will fail if not made via SSL or using SigV4. Documentation on configuring any of the officially supported AWS SDKs and CLI can be found at http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingAWSSDK.html#specify-signature-version
     */
    private String kmsKeyId;

    /**
     * If the encryption type is aws:kms, this optional value can be used to specify the encryption context for the restore results.
     */
    private String kmsContext;

    /**
     * @return The server-side encryption algorithm used when storing job results in Amazon S3 (e.g., AES256, aws:kms).
     */
    public String getEncryptionType() {
        return encryptionType;
    }

    /**
     * Sets the server-side encryption algorithm used when storing job results in Amazon S3 (e.g., AES256, aws:kms).
     *
     * @param encryptionType The new encryptionType value.
     */
    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    /**
     * Sets the encryptionType
     *
     * @param encryptionType The new encryptionType value.
     * @return This object for method chaining.
     */
    public Encryption withEncryptionType(String encryptionType) {
        setEncryptionType(encryptionType);
        return this;
    }

    /**
     * Sets the encryptionType
     *
     * @param encryptionType The new encryptionType value.
     * @return This object for method chaining.
     */
    public Encryption withEncryptionType(SSEAlgorithm encryptionType) {
        setEncryptionType(encryptionType == null ? null : encryptionType.toString());
        return this;
    }

    /**
     * @return The AWS KMS key ID to use for object encryption. All GET and PUT requests for an object protected by AWS KMS will fail if not made via SSL or using SigV4.
     * @see <a href="http://docs.aws.amazon.com/AmazonS3/latest/dev/UsingAWSSDK.html#specify-signature-version">AWS Documentation</a>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * Sets the AWS KMS key ID used for object encryption.
     *
     * @param kmsKeyId The new kmsKeyId value.
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * Sets the AWS KMS key ID used for object encryption.
     *
     * @param kmsKeyId The new kmsKeyId value.
     * @return This object for method chaining.
     */
    public Encryption withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * @return encryption context for the restore results.
     */
    public String getKmsContext() {
        return kmsContext;
    }

    /**
     * Sets the optional value used to specify the encryption context for the restore results if the encryption type is aws:kms.
     *
     * @param kmsContext The new kmsContext value.
     */
    public void setKmsContext(String kmsContext) {
        this.kmsContext = kmsContext;
    }

    /**
     * Sets the optional value used to specify the encryption context for the restore results if the encryption type is aws:kms.
     *
     * @param kmsContext The new kmsContext value.
     * @return This object for method chaining.
     */
    public Encryption withKmsContext(String kmsContext) {
        setKmsContext(kmsContext);
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ! (obj instanceof Encryption)) {
            return false;
        }

        final Encryption other = (Encryption) obj;

        if (other.getKmsContext() == null ^ this.getKmsContext() == null)
            return false;
        if (other.getKmsContext() != null && !other.getKmsContext().equals(this.getKmsContext()))
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && !other.getKmsKeyId().equals(this.getKmsKeyId()))
            return false;
        if (other.getEncryptionType() == null ^ this.getEncryptionType() == null)
            return false;
        if (other.getEncryptionType() != null && !other.getEncryptionType().equals(this.getEncryptionType()))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getKmsContext() == null) ? 0 : getKmsContext().hashCode());
        hashCode = prime * hashCode + ((getEncryptionType() == null) ? 0 : getEncryptionType().hashCode());
        return hashCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getKmsContext() != null)
            sb.append("KmsContext: ").append(getKmsContext()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getEncryptionType() != null)
            sb.append("EncryptionType: ").append(getEncryptionType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public Encryption clone() {
        try {
            return (Encryption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
