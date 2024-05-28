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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/UpdateRepositoryEncryptionKey"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRepositoryEncryptionKeyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ID of the repository.
     * </p>
     */
    private String repositoryId;
    /**
     * <p>
     * The ID of the encryption key.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The ID of the encryption key formerly used to encrypt and decrypt the repository.
     * </p>
     */
    private String originalKmsKeyId;

    /**
     * <p>
     * The ID of the repository.
     * </p>
     * 
     * @param repositoryId
     *        The ID of the repository.
     */

    public void setRepositoryId(String repositoryId) {
        this.repositoryId = repositoryId;
    }

    /**
     * <p>
     * The ID of the repository.
     * </p>
     * 
     * @return The ID of the repository.
     */

    public String getRepositoryId() {
        return this.repositoryId;
    }

    /**
     * <p>
     * The ID of the repository.
     * </p>
     * 
     * @param repositoryId
     *        The ID of the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRepositoryEncryptionKeyResult withRepositoryId(String repositoryId) {
        setRepositoryId(repositoryId);
        return this;
    }

    /**
     * <p>
     * The ID of the encryption key.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the encryption key.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ID of the encryption key.
     * </p>
     * 
     * @return The ID of the encryption key.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The ID of the encryption key.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the encryption key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRepositoryEncryptionKeyResult withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The ID of the encryption key formerly used to encrypt and decrypt the repository.
     * </p>
     * 
     * @param originalKmsKeyId
     *        The ID of the encryption key formerly used to encrypt and decrypt the repository.
     */

    public void setOriginalKmsKeyId(String originalKmsKeyId) {
        this.originalKmsKeyId = originalKmsKeyId;
    }

    /**
     * <p>
     * The ID of the encryption key formerly used to encrypt and decrypt the repository.
     * </p>
     * 
     * @return The ID of the encryption key formerly used to encrypt and decrypt the repository.
     */

    public String getOriginalKmsKeyId() {
        return this.originalKmsKeyId;
    }

    /**
     * <p>
     * The ID of the encryption key formerly used to encrypt and decrypt the repository.
     * </p>
     * 
     * @param originalKmsKeyId
     *        The ID of the encryption key formerly used to encrypt and decrypt the repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRepositoryEncryptionKeyResult withOriginalKmsKeyId(String originalKmsKeyId) {
        setOriginalKmsKeyId(originalKmsKeyId);
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
        if (getRepositoryId() != null)
            sb.append("RepositoryId: ").append(getRepositoryId()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getOriginalKmsKeyId() != null)
            sb.append("OriginalKmsKeyId: ").append(getOriginalKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRepositoryEncryptionKeyResult == false)
            return false;
        UpdateRepositoryEncryptionKeyResult other = (UpdateRepositoryEncryptionKeyResult) obj;
        if (other.getRepositoryId() == null ^ this.getRepositoryId() == null)
            return false;
        if (other.getRepositoryId() != null && other.getRepositoryId().equals(this.getRepositoryId()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getOriginalKmsKeyId() == null ^ this.getOriginalKmsKeyId() == null)
            return false;
        if (other.getOriginalKmsKeyId() != null && other.getOriginalKmsKeyId().equals(this.getOriginalKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRepositoryId() == null) ? 0 : getRepositoryId().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getOriginalKmsKeyId() == null) ? 0 : getOriginalKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRepositoryEncryptionKeyResult clone() {
        try {
            return (UpdateRepositoryEncryptionKeyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
