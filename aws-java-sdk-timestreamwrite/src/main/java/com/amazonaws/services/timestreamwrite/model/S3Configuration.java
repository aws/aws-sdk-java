/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.timestreamwrite.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration specifing an S3 location.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/S3Configuration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Configuration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * &gt;Bucket name of the customer S3 bucket.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * Object key preview for the customer S3 location.
     * </p>
     */
    private String objectKeyPrefix;
    /**
     * <p>
     * Encryption option for the customer s3 location. Options are S3 server side encryption with an S3-managed key or
     * KMS managed key.
     * </p>
     */
    private String encryptionOption;
    /**
     * <p>
     * KMS key id for the customer s3 location when encrypting with a KMS managed key.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * &gt;Bucket name of the customer S3 bucket.
     * </p>
     * 
     * @param bucketName
     *        &gt;Bucket name of the customer S3 bucket.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * &gt;Bucket name of the customer S3 bucket.
     * </p>
     * 
     * @return &gt;Bucket name of the customer S3 bucket.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * &gt;Bucket name of the customer S3 bucket.
     * </p>
     * 
     * @param bucketName
     *        &gt;Bucket name of the customer S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Configuration withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * Object key preview for the customer S3 location.
     * </p>
     * 
     * @param objectKeyPrefix
     *        Object key preview for the customer S3 location.
     */

    public void setObjectKeyPrefix(String objectKeyPrefix) {
        this.objectKeyPrefix = objectKeyPrefix;
    }

    /**
     * <p>
     * Object key preview for the customer S3 location.
     * </p>
     * 
     * @return Object key preview for the customer S3 location.
     */

    public String getObjectKeyPrefix() {
        return this.objectKeyPrefix;
    }

    /**
     * <p>
     * Object key preview for the customer S3 location.
     * </p>
     * 
     * @param objectKeyPrefix
     *        Object key preview for the customer S3 location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Configuration withObjectKeyPrefix(String objectKeyPrefix) {
        setObjectKeyPrefix(objectKeyPrefix);
        return this;
    }

    /**
     * <p>
     * Encryption option for the customer s3 location. Options are S3 server side encryption with an S3-managed key or
     * KMS managed key.
     * </p>
     * 
     * @param encryptionOption
     *        Encryption option for the customer s3 location. Options are S3 server side encryption with an S3-managed
     *        key or KMS managed key.
     * @see S3EncryptionOption
     */

    public void setEncryptionOption(String encryptionOption) {
        this.encryptionOption = encryptionOption;
    }

    /**
     * <p>
     * Encryption option for the customer s3 location. Options are S3 server side encryption with an S3-managed key or
     * KMS managed key.
     * </p>
     * 
     * @return Encryption option for the customer s3 location. Options are S3 server side encryption with an S3-managed
     *         key or KMS managed key.
     * @see S3EncryptionOption
     */

    public String getEncryptionOption() {
        return this.encryptionOption;
    }

    /**
     * <p>
     * Encryption option for the customer s3 location. Options are S3 server side encryption with an S3-managed key or
     * KMS managed key.
     * </p>
     * 
     * @param encryptionOption
     *        Encryption option for the customer s3 location. Options are S3 server side encryption with an S3-managed
     *        key or KMS managed key.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3EncryptionOption
     */

    public S3Configuration withEncryptionOption(String encryptionOption) {
        setEncryptionOption(encryptionOption);
        return this;
    }

    /**
     * <p>
     * Encryption option for the customer s3 location. Options are S3 server side encryption with an S3-managed key or
     * KMS managed key.
     * </p>
     * 
     * @param encryptionOption
     *        Encryption option for the customer s3 location. Options are S3 server side encryption with an S3-managed
     *        key or KMS managed key.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3EncryptionOption
     */

    public S3Configuration withEncryptionOption(S3EncryptionOption encryptionOption) {
        this.encryptionOption = encryptionOption.toString();
        return this;
    }

    /**
     * <p>
     * KMS key id for the customer s3 location when encrypting with a KMS managed key.
     * </p>
     * 
     * @param kmsKeyId
     *        KMS key id for the customer s3 location when encrypting with a KMS managed key.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * KMS key id for the customer s3 location when encrypting with a KMS managed key.
     * </p>
     * 
     * @return KMS key id for the customer s3 location when encrypting with a KMS managed key.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * KMS key id for the customer s3 location when encrypting with a KMS managed key.
     * </p>
     * 
     * @param kmsKeyId
     *        KMS key id for the customer s3 location when encrypting with a KMS managed key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Configuration withKmsKeyId(String kmsKeyId) {
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
        if (getBucketName() != null)
            sb.append("BucketName: ").append(getBucketName()).append(",");
        if (getObjectKeyPrefix() != null)
            sb.append("ObjectKeyPrefix: ").append(getObjectKeyPrefix()).append(",");
        if (getEncryptionOption() != null)
            sb.append("EncryptionOption: ").append(getEncryptionOption()).append(",");
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

        if (obj instanceof S3Configuration == false)
            return false;
        S3Configuration other = (S3Configuration) obj;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getObjectKeyPrefix() == null ^ this.getObjectKeyPrefix() == null)
            return false;
        if (other.getObjectKeyPrefix() != null && other.getObjectKeyPrefix().equals(this.getObjectKeyPrefix()) == false)
            return false;
        if (other.getEncryptionOption() == null ^ this.getEncryptionOption() == null)
            return false;
        if (other.getEncryptionOption() != null && other.getEncryptionOption().equals(this.getEncryptionOption()) == false)
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

        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getObjectKeyPrefix() == null) ? 0 : getObjectKeyPrefix().hashCode());
        hashCode = prime * hashCode + ((getEncryptionOption() == null) ? 0 : getEncryptionOption().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public S3Configuration clone() {
        try {
            return (S3Configuration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamwrite.model.transform.S3ConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
