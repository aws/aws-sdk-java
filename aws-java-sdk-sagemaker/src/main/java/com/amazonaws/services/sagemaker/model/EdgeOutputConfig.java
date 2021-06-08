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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The output configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/EdgeOutputConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EdgeOutputConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Simple Storage (S3) bucker URI.
     * </p>
     */
    private String s3OutputLocation;
    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage volume
     * after compilation job. If you don't provide a KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3
     * for your role's account.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The Amazon Simple Storage (S3) bucker URI.
     * </p>
     * 
     * @param s3OutputLocation
     *        The Amazon Simple Storage (S3) bucker URI.
     */

    public void setS3OutputLocation(String s3OutputLocation) {
        this.s3OutputLocation = s3OutputLocation;
    }

    /**
     * <p>
     * The Amazon Simple Storage (S3) bucker URI.
     * </p>
     * 
     * @return The Amazon Simple Storage (S3) bucker URI.
     */

    public String getS3OutputLocation() {
        return this.s3OutputLocation;
    }

    /**
     * <p>
     * The Amazon Simple Storage (S3) bucker URI.
     * </p>
     * 
     * @param s3OutputLocation
     *        The Amazon Simple Storage (S3) bucker URI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgeOutputConfig withS3OutputLocation(String s3OutputLocation) {
        setS3OutputLocation(s3OutputLocation);
        return this;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage volume
     * after compilation job. If you don't provide a KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3
     * for your role's account.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage
     *        volume after compilation job. If you don't provide a KMS key ID, Amazon SageMaker uses the default KMS key
     *        for Amazon S3 for your role's account.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage volume
     * after compilation job. If you don't provide a KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3
     * for your role's account.
     * </p>
     * 
     * @return The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage
     *         volume after compilation job. If you don't provide a KMS key ID, Amazon SageMaker uses the default KMS
     *         key for Amazon S3 for your role's account.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage volume
     * after compilation job. If you don't provide a KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3
     * for your role's account.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage
     *        volume after compilation job. If you don't provide a KMS key ID, Amazon SageMaker uses the default KMS key
     *        for Amazon S3 for your role's account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EdgeOutputConfig withKmsKeyId(String kmsKeyId) {
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
        if (getS3OutputLocation() != null)
            sb.append("S3OutputLocation: ").append(getS3OutputLocation()).append(",");
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

        if (obj instanceof EdgeOutputConfig == false)
            return false;
        EdgeOutputConfig other = (EdgeOutputConfig) obj;
        if (other.getS3OutputLocation() == null ^ this.getS3OutputLocation() == null)
            return false;
        if (other.getS3OutputLocation() != null && other.getS3OutputLocation().equals(this.getS3OutputLocation()) == false)
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

        hashCode = prime * hashCode + ((getS3OutputLocation() == null) ? 0 : getS3OutputLocation().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public EdgeOutputConfig clone() {
        try {
            return (EdgeOutputConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.EdgeOutputConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
