/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Provides information about how to store model training results (model artifacts).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/OutputDataConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutputDataConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at rest
     * using Amazon S3 server-side encryption.
     * </p>
     * <note>
     * <p>
     * If the configuration of the output S3 bucket requires server-side encryption for objects, and you don't provide
     * the KMS key ID, Amazon SageMaker uses the default service key. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">KMS-Managed Encryption Keys</a> in
     * Amazon Simple Storage Service developer guide.
     * </p>
     * </note> <note>
     * <p>
     * The KMS key policy must grant permission to the IAM role you specify in your <code>CreateTrainingJob</code>
     * request. <a href="http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Using Key Policies in
     * AWS KMS</a> in the AWS Key Management Service Developer Guide.
     * </p>
     * </note>
     */
    private String kmsKeyId;
    /**
     * <p>
     * Identifies the S3 path where you want Amazon SageMaker to store the model artifacts. For example,
     * <code>s3://bucket-name/key-name-prefix</code>.
     * </p>
     */
    private String s3OutputPath;

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at rest
     * using Amazon S3 server-side encryption.
     * </p>
     * <note>
     * <p>
     * If the configuration of the output S3 bucket requires server-side encryption for objects, and you don't provide
     * the KMS key ID, Amazon SageMaker uses the default service key. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">KMS-Managed Encryption Keys</a> in
     * Amazon Simple Storage Service developer guide.
     * </p>
     * </note> <note>
     * <p>
     * The KMS key policy must grant permission to the IAM role you specify in your <code>CreateTrainingJob</code>
     * request. <a href="http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Using Key Policies in
     * AWS KMS</a> in the AWS Key Management Service Developer Guide.
     * </p>
     * </note>
     * 
     * @param kmsKeyId
     *        The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at
     *        rest using Amazon S3 server-side encryption. </p> <note>
     *        <p>
     *        If the configuration of the output S3 bucket requires server-side encryption for objects, and you don't
     *        provide the KMS key ID, Amazon SageMaker uses the default service key. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">KMS-Managed Encryption
     *        Keys</a> in Amazon Simple Storage Service developer guide.
     *        </p>
     *        </note> <note>
     *        <p>
     *        The KMS key policy must grant permission to the IAM role you specify in your
     *        <code>CreateTrainingJob</code> request. <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Using Key Policies in AWS
     *        KMS</a> in the AWS Key Management Service Developer Guide.
     *        </p>
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at rest
     * using Amazon S3 server-side encryption.
     * </p>
     * <note>
     * <p>
     * If the configuration of the output S3 bucket requires server-side encryption for objects, and you don't provide
     * the KMS key ID, Amazon SageMaker uses the default service key. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">KMS-Managed Encryption Keys</a> in
     * Amazon Simple Storage Service developer guide.
     * </p>
     * </note> <note>
     * <p>
     * The KMS key policy must grant permission to the IAM role you specify in your <code>CreateTrainingJob</code>
     * request. <a href="http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Using Key Policies in
     * AWS KMS</a> in the AWS Key Management Service Developer Guide.
     * </p>
     * </note>
     * 
     * @return The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at
     *         rest using Amazon S3 server-side encryption. </p> <note>
     *         <p>
     *         If the configuration of the output S3 bucket requires server-side encryption for objects, and you don't
     *         provide the KMS key ID, Amazon SageMaker uses the default service key. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">KMS-Managed Encryption
     *         Keys</a> in Amazon Simple Storage Service developer guide.
     *         </p>
     *         </note> <note>
     *         <p>
     *         The KMS key policy must grant permission to the IAM role you specify in your
     *         <code>CreateTrainingJob</code> request. <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Using Key Policies in AWS
     *         KMS</a> in the AWS Key Management Service Developer Guide.
     *         </p>
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at rest
     * using Amazon S3 server-side encryption.
     * </p>
     * <note>
     * <p>
     * If the configuration of the output S3 bucket requires server-side encryption for objects, and you don't provide
     * the KMS key ID, Amazon SageMaker uses the default service key. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">KMS-Managed Encryption Keys</a> in
     * Amazon Simple Storage Service developer guide.
     * </p>
     * </note> <note>
     * <p>
     * The KMS key policy must grant permission to the IAM role you specify in your <code>CreateTrainingJob</code>
     * request. <a href="http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Using Key Policies in
     * AWS KMS</a> in the AWS Key Management Service Developer Guide.
     * </p>
     * </note>
     * 
     * @param kmsKeyId
     *        The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at
     *        rest using Amazon S3 server-side encryption. </p> <note>
     *        <p>
     *        If the configuration of the output S3 bucket requires server-side encryption for objects, and you don't
     *        provide the KMS key ID, Amazon SageMaker uses the default service key. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">KMS-Managed Encryption
     *        Keys</a> in Amazon Simple Storage Service developer guide.
     *        </p>
     *        </note> <note>
     *        <p>
     *        The KMS key policy must grant permission to the IAM role you specify in your
     *        <code>CreateTrainingJob</code> request. <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Using Key Policies in AWS
     *        KMS</a> in the AWS Key Management Service Developer Guide.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputDataConfig withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * Identifies the S3 path where you want Amazon SageMaker to store the model artifacts. For example,
     * <code>s3://bucket-name/key-name-prefix</code>.
     * </p>
     * 
     * @param s3OutputPath
     *        Identifies the S3 path where you want Amazon SageMaker to store the model artifacts. For example,
     *        <code>s3://bucket-name/key-name-prefix</code>.
     */

    public void setS3OutputPath(String s3OutputPath) {
        this.s3OutputPath = s3OutputPath;
    }

    /**
     * <p>
     * Identifies the S3 path where you want Amazon SageMaker to store the model artifacts. For example,
     * <code>s3://bucket-name/key-name-prefix</code>.
     * </p>
     * 
     * @return Identifies the S3 path where you want Amazon SageMaker to store the model artifacts. For example,
     *         <code>s3://bucket-name/key-name-prefix</code>.
     */

    public String getS3OutputPath() {
        return this.s3OutputPath;
    }

    /**
     * <p>
     * Identifies the S3 path where you want Amazon SageMaker to store the model artifacts. For example,
     * <code>s3://bucket-name/key-name-prefix</code>.
     * </p>
     * 
     * @param s3OutputPath
     *        Identifies the S3 path where you want Amazon SageMaker to store the model artifacts. For example,
     *        <code>s3://bucket-name/key-name-prefix</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputDataConfig withS3OutputPath(String s3OutputPath) {
        setS3OutputPath(s3OutputPath);
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
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getS3OutputPath() != null)
            sb.append("S3OutputPath: ").append(getS3OutputPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputDataConfig == false)
            return false;
        OutputDataConfig other = (OutputDataConfig) obj;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getS3OutputPath() == null ^ this.getS3OutputPath() == null)
            return false;
        if (other.getS3OutputPath() != null && other.getS3OutputPath().equals(this.getS3OutputPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getS3OutputPath() == null) ? 0 : getS3OutputPath().hashCode());
        return hashCode;
    }

    @Override
    public OutputDataConfig clone() {
        try {
            return (OutputDataConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.OutputDataConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
