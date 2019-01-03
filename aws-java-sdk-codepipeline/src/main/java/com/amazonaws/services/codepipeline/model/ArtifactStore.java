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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon S3 bucket where artifacts are stored for the pipeline.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/ArtifactStore" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ArtifactStore implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of the artifact store, such as S3.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The Amazon S3 bucket used for storing the artifacts for a pipeline. You can specify the name of an S3 bucket but
     * not a folder within the bucket. A folder to contain the pipeline artifacts is created for you based on the name
     * of the pipeline. You can use any Amazon S3 bucket in the same AWS Region as the pipeline to store your pipeline
     * artifacts.
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
        withType(type);
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
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket used for storing the artifacts for a pipeline. You can specify the name of an S3 bucket but
     * not a folder within the bucket. A folder to contain the pipeline artifacts is created for you based on the name
     * of the pipeline. You can use any Amazon S3 bucket in the same AWS Region as the pipeline to store your pipeline
     * artifacts.
     * </p>
     * 
     * @param location
     *        The Amazon S3 bucket used for storing the artifacts for a pipeline. You can specify the name of an S3
     *        bucket but not a folder within the bucket. A folder to contain the pipeline artifacts is created for you
     *        based on the name of the pipeline. You can use any Amazon S3 bucket in the same AWS Region as the pipeline
     *        to store your pipeline artifacts.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The Amazon S3 bucket used for storing the artifacts for a pipeline. You can specify the name of an S3 bucket but
     * not a folder within the bucket. A folder to contain the pipeline artifacts is created for you based on the name
     * of the pipeline. You can use any Amazon S3 bucket in the same AWS Region as the pipeline to store your pipeline
     * artifacts.
     * </p>
     * 
     * @return The Amazon S3 bucket used for storing the artifacts for a pipeline. You can specify the name of an S3
     *         bucket but not a folder within the bucket. A folder to contain the pipeline artifacts is created for you
     *         based on the name of the pipeline. You can use any Amazon S3 bucket in the same AWS Region as the
     *         pipeline to store your pipeline artifacts.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The Amazon S3 bucket used for storing the artifacts for a pipeline. You can specify the name of an S3 bucket but
     * not a folder within the bucket. A folder to contain the pipeline artifacts is created for you based on the name
     * of the pipeline. You can use any Amazon S3 bucket in the same AWS Region as the pipeline to store your pipeline
     * artifacts.
     * </p>
     * 
     * @param location
     *        The Amazon S3 bucket used for storing the artifacts for a pipeline. You can specify the name of an S3
     *        bucket but not a folder within the bucket. A folder to contain the pipeline artifacts is created for you
     *        based on the name of the pipeline. You can use any Amazon S3 bucket in the same AWS Region as the pipeline
     *        to store your pipeline artifacts.
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getEncryptionKey() != null)
            sb.append("EncryptionKey: ").append(getEncryptionKey());
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.ArtifactStoreMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
