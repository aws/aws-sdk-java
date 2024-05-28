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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdateRepositoryEncryptionKey"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRepositoryEncryptionKeyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the repository for which you want to update the KMS encryption key used to encrypt and decrypt the
     * repository.
     * </p>
     */
    private String repositoryName;
    /**
     * <p>
     * The ID of the encryption key. You can view the ID of an encryption key in the KMS console, or use the KMS APIs to
     * programmatically retrieve a key ID. For more information about acceptable values for keyID, see <a
     * href="https://docs.aws.amazon.com/APIReference/API_Decrypt.html#KMS-Decrypt-request-KeyId">KeyId</a> in the
     * Decrypt API description in the <i>Key Management Service API Reference</i>.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The name of the repository for which you want to update the KMS encryption key used to encrypt and decrypt the
     * repository.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository for which you want to update the KMS encryption key used to encrypt and decrypt
     *        the repository.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The name of the repository for which you want to update the KMS encryption key used to encrypt and decrypt the
     * repository.
     * </p>
     * 
     * @return The name of the repository for which you want to update the KMS encryption key used to encrypt and
     *         decrypt the repository.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The name of the repository for which you want to update the KMS encryption key used to encrypt and decrypt the
     * repository.
     * </p>
     * 
     * @param repositoryName
     *        The name of the repository for which you want to update the KMS encryption key used to encrypt and decrypt
     *        the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRepositoryEncryptionKeyRequest withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The ID of the encryption key. You can view the ID of an encryption key in the KMS console, or use the KMS APIs to
     * programmatically retrieve a key ID. For more information about acceptable values for keyID, see <a
     * href="https://docs.aws.amazon.com/APIReference/API_Decrypt.html#KMS-Decrypt-request-KeyId">KeyId</a> in the
     * Decrypt API description in the <i>Key Management Service API Reference</i>.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the encryption key. You can view the ID of an encryption key in the KMS console, or use the KMS
     *        APIs to programmatically retrieve a key ID. For more information about acceptable values for keyID, see <a
     *        href="https://docs.aws.amazon.com/APIReference/API_Decrypt.html#KMS-Decrypt-request-KeyId">KeyId</a> in
     *        the Decrypt API description in the <i>Key Management Service API Reference</i>.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ID of the encryption key. You can view the ID of an encryption key in the KMS console, or use the KMS APIs to
     * programmatically retrieve a key ID. For more information about acceptable values for keyID, see <a
     * href="https://docs.aws.amazon.com/APIReference/API_Decrypt.html#KMS-Decrypt-request-KeyId">KeyId</a> in the
     * Decrypt API description in the <i>Key Management Service API Reference</i>.
     * </p>
     * 
     * @return The ID of the encryption key. You can view the ID of an encryption key in the KMS console, or use the KMS
     *         APIs to programmatically retrieve a key ID. For more information about acceptable values for keyID, see
     *         <a href="https://docs.aws.amazon.com/APIReference/API_Decrypt.html#KMS-Decrypt-request-KeyId">KeyId</a>
     *         in the Decrypt API description in the <i>Key Management Service API Reference</i>.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The ID of the encryption key. You can view the ID of an encryption key in the KMS console, or use the KMS APIs to
     * programmatically retrieve a key ID. For more information about acceptable values for keyID, see <a
     * href="https://docs.aws.amazon.com/APIReference/API_Decrypt.html#KMS-Decrypt-request-KeyId">KeyId</a> in the
     * Decrypt API description in the <i>Key Management Service API Reference</i>.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the encryption key. You can view the ID of an encryption key in the KMS console, or use the KMS
     *        APIs to programmatically retrieve a key ID. For more information about acceptable values for keyID, see <a
     *        href="https://docs.aws.amazon.com/APIReference/API_Decrypt.html#KMS-Decrypt-request-KeyId">KeyId</a> in
     *        the Decrypt API description in the <i>Key Management Service API Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRepositoryEncryptionKeyRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
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
        if (getRepositoryName() != null)
            sb.append("RepositoryName: ").append(getRepositoryName()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRepositoryEncryptionKeyRequest == false)
            return false;
        UpdateRepositoryEncryptionKeyRequest other = (UpdateRepositoryEncryptionKeyRequest) obj;
        if (other.getRepositoryName() == null ^ this.getRepositoryName() == null)
            return false;
        if (other.getRepositoryName() != null && other.getRepositoryName().equals(this.getRepositoryName()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryName() == null) ? 0 : getRepositoryName().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRepositoryEncryptionKeyRequest clone() {
        return (UpdateRepositoryEncryptionKeyRequest) super.clone();
    }

}
