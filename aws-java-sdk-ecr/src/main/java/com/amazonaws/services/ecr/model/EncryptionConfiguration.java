/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The encryption configuration for the repository. This determines how the contents of your repository are encrypted at
 * rest.
 * </p>
 * <p>
 * By default, when no encryption configuration is set or the <code>AES256</code> encryption type is used, Amazon ECR
 * uses server-side encryption with Amazon S3-managed encryption keys which encrypts your data at rest using an AES-256
 * encryption algorithm. This does not require any action on your part.
 * </p>
 * <p>
 * For more control over the encryption of the contents of your repository, you can use server-side encryption with
 * customer master keys (CMKs) stored in AWS Key Management Service (AWS KMS) to encrypt your images. For more
 * information, see <a href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/encryption-at-rest.html">Amazon ECR
 * encryption at rest</a> in the <i>Amazon Elastic Container Registry User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/EncryptionConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EncryptionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The encryption type to use.
     * </p>
     * <p>
     * If you use the <code>KMS</code> encryption type, the contents of the repository will be encrypted using
     * server-side encryption with customer master keys (CMKs) stored in AWS KMS. When you use AWS KMS to encrypt your
     * data, you can either use the default AWS managed CMK for Amazon ECR, or specify your own CMK, which you already
     * created. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">Protecting Data Using Server-Side
     * Encryption with CMKs Stored in AWS Key Management Service (SSE-KMS)</a> in the <i>Amazon Simple Storage Service
     * Console Developer Guide.</i>.
     * </p>
     * <p>
     * If you use the <code>AES256</code> encryption type, Amazon ECR uses server-side encryption with Amazon S3-managed
     * encryption keys which encrypts the images in the repository using an AES-256 encryption algorithm. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingServerSideEncryption.html">Protecting Data Using
     * Server-Side Encryption with Amazon S3-Managed Encryption Keys (SSE-S3)</a> in the <i>Amazon Simple Storage
     * Service Console Developer Guide.</i>.
     * </p>
     */
    private String encryptionType;
    /**
     * <p>
     * If you use the <code>KMS</code> encryption type, specify the CMK to use for encryption. The alias, key ID, or
     * full ARN of the CMK can be specified. The key must exist in the same Region as the repository. If no key is
     * specified, the default AWS managed CMK for Amazon ECR will be used.
     * </p>
     */
    private String kmsKey;

    /**
     * <p>
     * The encryption type to use.
     * </p>
     * <p>
     * If you use the <code>KMS</code> encryption type, the contents of the repository will be encrypted using
     * server-side encryption with customer master keys (CMKs) stored in AWS KMS. When you use AWS KMS to encrypt your
     * data, you can either use the default AWS managed CMK for Amazon ECR, or specify your own CMK, which you already
     * created. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">Protecting Data Using Server-Side
     * Encryption with CMKs Stored in AWS Key Management Service (SSE-KMS)</a> in the <i>Amazon Simple Storage Service
     * Console Developer Guide.</i>.
     * </p>
     * <p>
     * If you use the <code>AES256</code> encryption type, Amazon ECR uses server-side encryption with Amazon S3-managed
     * encryption keys which encrypts the images in the repository using an AES-256 encryption algorithm. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingServerSideEncryption.html">Protecting Data Using
     * Server-Side Encryption with Amazon S3-Managed Encryption Keys (SSE-S3)</a> in the <i>Amazon Simple Storage
     * Service Console Developer Guide.</i>.
     * </p>
     * 
     * @param encryptionType
     *        The encryption type to use.</p>
     *        <p>
     *        If you use the <code>KMS</code> encryption type, the contents of the repository will be encrypted using
     *        server-side encryption with customer master keys (CMKs) stored in AWS KMS. When you use AWS KMS to encrypt
     *        your data, you can either use the default AWS managed CMK for Amazon ECR, or specify your own CMK, which
     *        you already created. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">Protecting Data Using
     *        Server-Side Encryption with CMKs Stored in AWS Key Management Service (SSE-KMS)</a> in the <i>Amazon
     *        Simple Storage Service Console Developer Guide.</i>.
     *        </p>
     *        <p>
     *        If you use the <code>AES256</code> encryption type, Amazon ECR uses server-side encryption with Amazon
     *        S3-managed encryption keys which encrypts the images in the repository using an AES-256 encryption
     *        algorithm. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingServerSideEncryption.html">Protecting Data
     *        Using Server-Side Encryption with Amazon S3-Managed Encryption Keys (SSE-S3)</a> in the <i>Amazon Simple
     *        Storage Service Console Developer Guide.</i>.
     * @see EncryptionType
     */

    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    /**
     * <p>
     * The encryption type to use.
     * </p>
     * <p>
     * If you use the <code>KMS</code> encryption type, the contents of the repository will be encrypted using
     * server-side encryption with customer master keys (CMKs) stored in AWS KMS. When you use AWS KMS to encrypt your
     * data, you can either use the default AWS managed CMK for Amazon ECR, or specify your own CMK, which you already
     * created. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">Protecting Data Using Server-Side
     * Encryption with CMKs Stored in AWS Key Management Service (SSE-KMS)</a> in the <i>Amazon Simple Storage Service
     * Console Developer Guide.</i>.
     * </p>
     * <p>
     * If you use the <code>AES256</code> encryption type, Amazon ECR uses server-side encryption with Amazon S3-managed
     * encryption keys which encrypts the images in the repository using an AES-256 encryption algorithm. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingServerSideEncryption.html">Protecting Data Using
     * Server-Side Encryption with Amazon S3-Managed Encryption Keys (SSE-S3)</a> in the <i>Amazon Simple Storage
     * Service Console Developer Guide.</i>.
     * </p>
     * 
     * @return The encryption type to use.</p>
     *         <p>
     *         If you use the <code>KMS</code> encryption type, the contents of the repository will be encrypted using
     *         server-side encryption with customer master keys (CMKs) stored in AWS KMS. When you use AWS KMS to
     *         encrypt your data, you can either use the default AWS managed CMK for Amazon ECR, or specify your own
     *         CMK, which you already created. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">Protecting Data Using
     *         Server-Side Encryption with CMKs Stored in AWS Key Management Service (SSE-KMS)</a> in the <i>Amazon
     *         Simple Storage Service Console Developer Guide.</i>.
     *         </p>
     *         <p>
     *         If you use the <code>AES256</code> encryption type, Amazon ECR uses server-side encryption with Amazon
     *         S3-managed encryption keys which encrypts the images in the repository using an AES-256 encryption
     *         algorithm. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingServerSideEncryption.html">Protecting Data
     *         Using Server-Side Encryption with Amazon S3-Managed Encryption Keys (SSE-S3)</a> in the <i>Amazon Simple
     *         Storage Service Console Developer Guide.</i>.
     * @see EncryptionType
     */

    public String getEncryptionType() {
        return this.encryptionType;
    }

    /**
     * <p>
     * The encryption type to use.
     * </p>
     * <p>
     * If you use the <code>KMS</code> encryption type, the contents of the repository will be encrypted using
     * server-side encryption with customer master keys (CMKs) stored in AWS KMS. When you use AWS KMS to encrypt your
     * data, you can either use the default AWS managed CMK for Amazon ECR, or specify your own CMK, which you already
     * created. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">Protecting Data Using Server-Side
     * Encryption with CMKs Stored in AWS Key Management Service (SSE-KMS)</a> in the <i>Amazon Simple Storage Service
     * Console Developer Guide.</i>.
     * </p>
     * <p>
     * If you use the <code>AES256</code> encryption type, Amazon ECR uses server-side encryption with Amazon S3-managed
     * encryption keys which encrypts the images in the repository using an AES-256 encryption algorithm. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingServerSideEncryption.html">Protecting Data Using
     * Server-Side Encryption with Amazon S3-Managed Encryption Keys (SSE-S3)</a> in the <i>Amazon Simple Storage
     * Service Console Developer Guide.</i>.
     * </p>
     * 
     * @param encryptionType
     *        The encryption type to use.</p>
     *        <p>
     *        If you use the <code>KMS</code> encryption type, the contents of the repository will be encrypted using
     *        server-side encryption with customer master keys (CMKs) stored in AWS KMS. When you use AWS KMS to encrypt
     *        your data, you can either use the default AWS managed CMK for Amazon ECR, or specify your own CMK, which
     *        you already created. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">Protecting Data Using
     *        Server-Side Encryption with CMKs Stored in AWS Key Management Service (SSE-KMS)</a> in the <i>Amazon
     *        Simple Storage Service Console Developer Guide.</i>.
     *        </p>
     *        <p>
     *        If you use the <code>AES256</code> encryption type, Amazon ECR uses server-side encryption with Amazon
     *        S3-managed encryption keys which encrypts the images in the repository using an AES-256 encryption
     *        algorithm. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingServerSideEncryption.html">Protecting Data
     *        Using Server-Side Encryption with Amazon S3-Managed Encryption Keys (SSE-S3)</a> in the <i>Amazon Simple
     *        Storage Service Console Developer Guide.</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionType
     */

    public EncryptionConfiguration withEncryptionType(String encryptionType) {
        setEncryptionType(encryptionType);
        return this;
    }

    /**
     * <p>
     * The encryption type to use.
     * </p>
     * <p>
     * If you use the <code>KMS</code> encryption type, the contents of the repository will be encrypted using
     * server-side encryption with customer master keys (CMKs) stored in AWS KMS. When you use AWS KMS to encrypt your
     * data, you can either use the default AWS managed CMK for Amazon ECR, or specify your own CMK, which you already
     * created. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">Protecting Data Using Server-Side
     * Encryption with CMKs Stored in AWS Key Management Service (SSE-KMS)</a> in the <i>Amazon Simple Storage Service
     * Console Developer Guide.</i>.
     * </p>
     * <p>
     * If you use the <code>AES256</code> encryption type, Amazon ECR uses server-side encryption with Amazon S3-managed
     * encryption keys which encrypts the images in the repository using an AES-256 encryption algorithm. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingServerSideEncryption.html">Protecting Data Using
     * Server-Side Encryption with Amazon S3-Managed Encryption Keys (SSE-S3)</a> in the <i>Amazon Simple Storage
     * Service Console Developer Guide.</i>.
     * </p>
     * 
     * @param encryptionType
     *        The encryption type to use.</p>
     *        <p>
     *        If you use the <code>KMS</code> encryption type, the contents of the repository will be encrypted using
     *        server-side encryption with customer master keys (CMKs) stored in AWS KMS. When you use AWS KMS to encrypt
     *        your data, you can either use the default AWS managed CMK for Amazon ECR, or specify your own CMK, which
     *        you already created. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">Protecting Data Using
     *        Server-Side Encryption with CMKs Stored in AWS Key Management Service (SSE-KMS)</a> in the <i>Amazon
     *        Simple Storage Service Console Developer Guide.</i>.
     *        </p>
     *        <p>
     *        If you use the <code>AES256</code> encryption type, Amazon ECR uses server-side encryption with Amazon
     *        S3-managed encryption keys which encrypts the images in the repository using an AES-256 encryption
     *        algorithm. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingServerSideEncryption.html">Protecting Data
     *        Using Server-Side Encryption with Amazon S3-Managed Encryption Keys (SSE-S3)</a> in the <i>Amazon Simple
     *        Storage Service Console Developer Guide.</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionType
     */

    public EncryptionConfiguration withEncryptionType(EncryptionType encryptionType) {
        this.encryptionType = encryptionType.toString();
        return this;
    }

    /**
     * <p>
     * If you use the <code>KMS</code> encryption type, specify the CMK to use for encryption. The alias, key ID, or
     * full ARN of the CMK can be specified. The key must exist in the same Region as the repository. If no key is
     * specified, the default AWS managed CMK for Amazon ECR will be used.
     * </p>
     * 
     * @param kmsKey
     *        If you use the <code>KMS</code> encryption type, specify the CMK to use for encryption. The alias, key ID,
     *        or full ARN of the CMK can be specified. The key must exist in the same Region as the repository. If no
     *        key is specified, the default AWS managed CMK for Amazon ECR will be used.
     */

    public void setKmsKey(String kmsKey) {
        this.kmsKey = kmsKey;
    }

    /**
     * <p>
     * If you use the <code>KMS</code> encryption type, specify the CMK to use for encryption. The alias, key ID, or
     * full ARN of the CMK can be specified. The key must exist in the same Region as the repository. If no key is
     * specified, the default AWS managed CMK for Amazon ECR will be used.
     * </p>
     * 
     * @return If you use the <code>KMS</code> encryption type, specify the CMK to use for encryption. The alias, key
     *         ID, or full ARN of the CMK can be specified. The key must exist in the same Region as the repository. If
     *         no key is specified, the default AWS managed CMK for Amazon ECR will be used.
     */

    public String getKmsKey() {
        return this.kmsKey;
    }

    /**
     * <p>
     * If you use the <code>KMS</code> encryption type, specify the CMK to use for encryption. The alias, key ID, or
     * full ARN of the CMK can be specified. The key must exist in the same Region as the repository. If no key is
     * specified, the default AWS managed CMK for Amazon ECR will be used.
     * </p>
     * 
     * @param kmsKey
     *        If you use the <code>KMS</code> encryption type, specify the CMK to use for encryption. The alias, key ID,
     *        or full ARN of the CMK can be specified. The key must exist in the same Region as the repository. If no
     *        key is specified, the default AWS managed CMK for Amazon ECR will be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncryptionConfiguration withKmsKey(String kmsKey) {
        setKmsKey(kmsKey);
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
        if (getEncryptionType() != null)
            sb.append("EncryptionType: ").append(getEncryptionType()).append(",");
        if (getKmsKey() != null)
            sb.append("KmsKey: ").append(getKmsKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EncryptionConfiguration == false)
            return false;
        EncryptionConfiguration other = (EncryptionConfiguration) obj;
        if (other.getEncryptionType() == null ^ this.getEncryptionType() == null)
            return false;
        if (other.getEncryptionType() != null && other.getEncryptionType().equals(this.getEncryptionType()) == false)
            return false;
        if (other.getKmsKey() == null ^ this.getKmsKey() == null)
            return false;
        if (other.getKmsKey() != null && other.getKmsKey().equals(this.getKmsKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncryptionType() == null) ? 0 : getEncryptionType().hashCode());
        hashCode = prime * hashCode + ((getKmsKey() == null) ? 0 : getKmsKey().hashCode());
        return hashCode;
    }

    @Override
    public EncryptionConfiguration clone() {
        try {
            return (EncryptionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecr.model.transform.EncryptionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
