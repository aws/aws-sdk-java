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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies an S3 bucket to store data classification results in, and the encryption settings to use when storing
 * results in that bucket.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/S3Destination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Destination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the bucket.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * The path prefix to use in the path to the location in the bucket. This prefix specifies where to store
     * classification results in the bucket.
     * </p>
     */
    private String keyPrefix;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use for
     * encryption of the results. This must be the ARN of an existing CMK that's in the same AWS Region as the bucket.
     * </p>
     */
    private String kmsKeyArn;

    /**
     * <p>
     * The name of the bucket.
     * </p>
     * 
     * @param bucketName
     *        The name of the bucket.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The name of the bucket.
     * </p>
     * 
     * @return The name of the bucket.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * The name of the bucket.
     * </p>
     * 
     * @param bucketName
     *        The name of the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Destination withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * The path prefix to use in the path to the location in the bucket. This prefix specifies where to store
     * classification results in the bucket.
     * </p>
     * 
     * @param keyPrefix
     *        The path prefix to use in the path to the location in the bucket. This prefix specifies where to store
     *        classification results in the bucket.
     */

    public void setKeyPrefix(String keyPrefix) {
        this.keyPrefix = keyPrefix;
    }

    /**
     * <p>
     * The path prefix to use in the path to the location in the bucket. This prefix specifies where to store
     * classification results in the bucket.
     * </p>
     * 
     * @return The path prefix to use in the path to the location in the bucket. This prefix specifies where to store
     *         classification results in the bucket.
     */

    public String getKeyPrefix() {
        return this.keyPrefix;
    }

    /**
     * <p>
     * The path prefix to use in the path to the location in the bucket. This prefix specifies where to store
     * classification results in the bucket.
     * </p>
     * 
     * @param keyPrefix
     *        The path prefix to use in the path to the location in the bucket. This prefix specifies where to store
     *        classification results in the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Destination withKeyPrefix(String keyPrefix) {
        setKeyPrefix(keyPrefix);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use for
     * encryption of the results. This must be the ARN of an existing CMK that's in the same AWS Region as the bucket.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of the AWS Key Management Service (AWS KMS) customer master key (CMK) to
     *        use for encryption of the results. This must be the ARN of an existing CMK that's in the same AWS Region
     *        as the bucket.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use for
     * encryption of the results. This must be the ARN of an existing CMK that's in the same AWS Region as the bucket.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS Key Management Service (AWS KMS) customer master key (CMK) to
     *         use for encryption of the results. This must be the ARN of an existing CMK that's in the same AWS Region
     *         as the bucket.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use for
     * encryption of the results. This must be the ARN of an existing CMK that's in the same AWS Region as the bucket.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of the AWS Key Management Service (AWS KMS) customer master key (CMK) to
     *        use for encryption of the results. This must be the ARN of an existing CMK that's in the same AWS Region
     *        as the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Destination withKmsKeyArn(String kmsKeyArn) {
        setKmsKeyArn(kmsKeyArn);
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
        if (getKeyPrefix() != null)
            sb.append("KeyPrefix: ").append(getKeyPrefix()).append(",");
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: ").append(getKmsKeyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Destination == false)
            return false;
        S3Destination other = (S3Destination) obj;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getKeyPrefix() == null ^ this.getKeyPrefix() == null)
            return false;
        if (other.getKeyPrefix() != null && other.getKeyPrefix().equals(this.getKeyPrefix()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getKeyPrefix() == null) ? 0 : getKeyPrefix().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public S3Destination clone() {
        try {
            return (S3Destination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.S3DestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
