/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;

/**
 * <p>
 * The Amazon S3 location where artifacts are stored for the pipeline. If this Amazon S3 bucket is created manually, it
 * must meet the requirements for AWS CodePipeline. For more information, see the <a
 * href="http://docs.aws.amazon.com/codepipeline/latest/userguide/concepts.html#CPS3Bucket">Concepts</a>.
 * </p>
 */
public class ArtifactStore implements Serializable, Cloneable {

    /**
     * <p>
     * The type of the artifact store, such as S3.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The location for storing the artifacts for a pipeline, such as an S3 bucket or folder.
     * </p>
     */
    private String location;
    /**
     * <p>
     * The encryption key used to encrypt the data in the artifact store, such as an AWS Key Management Service (AWS
     * KMS) key. If this is undefined, the default key for Amazon S3 is used.
     * </p>
     */
    private EncryptionKey encryptionKey;

    /**
     * <p>
     * The type of the artifact store, such as S3.
     * </p>
     * 
     * @param type
     *        The type of the artifact store, such as S3.
     * @see ArtifactStoreType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the artifact store, such as S3.
     * </p>
     * 
     * @return The type of the artifact store, such as S3.
     * @see ArtifactStoreType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the artifact store, such as S3.
     * </p>
     * 
     * @param type
     *        The type of the artifact store, such as S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArtifactStoreType
     */

    public ArtifactStore withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the artifact store, such as S3.
     * </p>
     * 
     * @param type
     *        The type of the artifact store, such as S3.
     * @see ArtifactStoreType
     */

    public void setType(ArtifactStoreType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of the artifact store, such as S3.
     * </p>
     * 
     * @param type
     *        The type of the artifact store, such as S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArtifactStoreType
     */

    public ArtifactStore withType(ArtifactStoreType type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The location for storing the artifacts for a pipeline, such as an S3 bucket or folder.
     * </p>
     * 
     * @param location
     *        The location for storing the artifacts for a pipeline, such as an S3 bucket or folder.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The location for storing the artifacts for a pipeline, such as an S3 bucket or folder.
     * </p>
     * 
     * @return The location for storing the artifacts for a pipeline, such as an S3 bucket or folder.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The location for storing the artifacts for a pipeline, such as an S3 bucket or folder.
     * </p>
     * 
     * @param location
     *        The location for storing the artifacts for a pipeline, such as an S3 bucket or folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArtifactStore withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * The encryption key used to encrypt the data in the artifact store, such as an AWS Key Management Service (AWS
     * KMS) key. If this is undefined, the default key for Amazon S3 is used.
     * </p>
     * 
     * @param encryptionKey
     *        The encryption key used to encrypt the data in the artifact store, such as an AWS Key Management Service
     *        (AWS KMS) key. If this is undefined, the default key for Amazon S3 is used.
     */

    public void setEncryptionKey(EncryptionKey encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    /**
     * <p>
     * The encryption key used to encrypt the data in the artifact store, such as an AWS Key Management Service (AWS
     * KMS) key. If this is undefined, the default key for Amazon S3 is used.
     * </p>
     * 
     * @return The encryption key used to encrypt the data in the artifact store, such as an AWS Key Management Service
     *         (AWS KMS) key. If this is undefined, the default key for Amazon S3 is used.
     */

    public EncryptionKey getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * <p>
     * The encryption key used to encrypt the data in the artifact store, such as an AWS Key Management Service (AWS
     * KMS) key. If this is undefined, the default key for Amazon S3 is used.
     * </p>
     * 
     * @param encryptionKey
     *        The encryption key used to encrypt the data in the artifact store, such as an AWS Key Management Service
     *        (AWS KMS) key. If this is undefined, the default key for Amazon S3 is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArtifactStore withEncryptionKey(EncryptionKey encryptionKey) {
        setEncryptionKey(encryptionKey);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getLocation() != null)
            sb.append("Location: " + getLocation() + ",");
        if (getEncryptionKey() != null)
            sb.append("EncryptionKey: " + getEncryptionKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ArtifactStore == false)
            return false;
        ArtifactStore other = (ArtifactStore) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getEncryptionKey() == null ^ this.getEncryptionKey() == null)
            return false;
        if (other.getEncryptionKey() != null && other.getEncryptionKey().equals(this.getEncryptionKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getEncryptionKey() == null) ? 0 : getEncryptionKey().hashCode());
        return hashCode;
    }

    @Override
    public ArtifactStore clone() {
        try {
            return (ArtifactStore) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
