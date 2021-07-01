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
 * Output configuration information for a labeling job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/LabelingJobOutputConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LabelingJobOutputConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 location to write output data.
     * </p>
     */
    private String s3OutputPath;
    /**
     * <p>
     * The Amazon Web Services Key Management Service ID of the key used to encrypt the output data, if any.
     * </p>
     * <p>
     * If you provide your own KMS key ID, you must add the required permissions to your KMS key described in <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-security-permission.html#sms-security-kms-permissions"
     * >Encrypt Output Data and Storage Volume with Amazon Web Services KMS</a>.
     * </p>
     * <p>
     * If you don't provide a KMS key ID, Amazon SageMaker uses the default Amazon Web Services KMS key for Amazon S3
     * for your role's account to encrypt your output data.
     * </p>
     * <p>
     * If you use a bucket policy with an <code>s3:PutObject</code> permission that only allows objects with server-side
     * encryption, set the condition key of <code>s3:x-amz-server-side-encryption</code> to <code>"aws:kms"</code>. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">KMS-Managed Encryption Keys</a> in
     * the <i>Amazon Simple Storage Service Developer Guide.</i>
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * An Amazon Simple Notification Service (Amazon SNS) output topic ARN. Provide a <code>SnsTopicArn</code> if you
     * want to do real time chaining to another streaming job and receive an Amazon SNS notifications each time a data
     * object is submitted by a worker.
     * </p>
     * <p>
     * If you provide an <code>SnsTopicArn</code> in <code>OutputConfig</code>, when workers complete labeling tasks,
     * Ground Truth will send labeling task output data to the SNS output topic you specify here.
     * </p>
     * <p>
     * To learn more, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-streaming-labeling-job.html#sms-streaming-how-it-works-output-data"
     * >Receive Output Data from a Streaming Labeling Job</a>.
     * </p>
     */
    private String snsTopicArn;

    /**
     * <p>
     * The Amazon S3 location to write output data.
     * </p>
     * 
     * @param s3OutputPath
     *        The Amazon S3 location to write output data.
     */

    public void setS3OutputPath(String s3OutputPath) {
        this.s3OutputPath = s3OutputPath;
    }

    /**
     * <p>
     * The Amazon S3 location to write output data.
     * </p>
     * 
     * @return The Amazon S3 location to write output data.
     */

    public String getS3OutputPath() {
        return this.s3OutputPath;
    }

    /**
     * <p>
     * The Amazon S3 location to write output data.
     * </p>
     * 
     * @param s3OutputPath
     *        The Amazon S3 location to write output data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelingJobOutputConfig withS3OutputPath(String s3OutputPath) {
        setS3OutputPath(s3OutputPath);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Key Management Service ID of the key used to encrypt the output data, if any.
     * </p>
     * <p>
     * If you provide your own KMS key ID, you must add the required permissions to your KMS key described in <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-security-permission.html#sms-security-kms-permissions"
     * >Encrypt Output Data and Storage Volume with Amazon Web Services KMS</a>.
     * </p>
     * <p>
     * If you don't provide a KMS key ID, Amazon SageMaker uses the default Amazon Web Services KMS key for Amazon S3
     * for your role's account to encrypt your output data.
     * </p>
     * <p>
     * If you use a bucket policy with an <code>s3:PutObject</code> permission that only allows objects with server-side
     * encryption, set the condition key of <code>s3:x-amz-server-side-encryption</code> to <code>"aws:kms"</code>. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">KMS-Managed Encryption Keys</a> in
     * the <i>Amazon Simple Storage Service Developer Guide.</i>
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Web Services Key Management Service ID of the key used to encrypt the output data, if any.</p>
     *        <p>
     *        If you provide your own KMS key ID, you must add the required permissions to your KMS key described in <a
     *        href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-security-permission.html#sms-security-kms-permissions"
     *        >Encrypt Output Data and Storage Volume with Amazon Web Services KMS</a>.
     *        </p>
     *        <p>
     *        If you don't provide a KMS key ID, Amazon SageMaker uses the default Amazon Web Services KMS key for
     *        Amazon S3 for your role's account to encrypt your output data.
     *        </p>
     *        <p>
     *        If you use a bucket policy with an <code>s3:PutObject</code> permission that only allows objects with
     *        server-side encryption, set the condition key of <code>s3:x-amz-server-side-encryption</code> to
     *        <code>"aws:kms"</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">KMS-Managed Encryption
     *        Keys</a> in the <i>Amazon Simple Storage Service Developer Guide.</i>
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services Key Management Service ID of the key used to encrypt the output data, if any.
     * </p>
     * <p>
     * If you provide your own KMS key ID, you must add the required permissions to your KMS key described in <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-security-permission.html#sms-security-kms-permissions"
     * >Encrypt Output Data and Storage Volume with Amazon Web Services KMS</a>.
     * </p>
     * <p>
     * If you don't provide a KMS key ID, Amazon SageMaker uses the default Amazon Web Services KMS key for Amazon S3
     * for your role's account to encrypt your output data.
     * </p>
     * <p>
     * If you use a bucket policy with an <code>s3:PutObject</code> permission that only allows objects with server-side
     * encryption, set the condition key of <code>s3:x-amz-server-side-encryption</code> to <code>"aws:kms"</code>. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">KMS-Managed Encryption Keys</a> in
     * the <i>Amazon Simple Storage Service Developer Guide.</i>
     * </p>
     * 
     * @return The Amazon Web Services Key Management Service ID of the key used to encrypt the output data, if any.</p>
     *         <p>
     *         If you provide your own KMS key ID, you must add the required permissions to your KMS key described in <a
     *         href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-security-permission.html#sms-security-kms-permissions"
     *         >Encrypt Output Data and Storage Volume with Amazon Web Services KMS</a>.
     *         </p>
     *         <p>
     *         If you don't provide a KMS key ID, Amazon SageMaker uses the default Amazon Web Services KMS key for
     *         Amazon S3 for your role's account to encrypt your output data.
     *         </p>
     *         <p>
     *         If you use a bucket policy with an <code>s3:PutObject</code> permission that only allows objects with
     *         server-side encryption, set the condition key of <code>s3:x-amz-server-side-encryption</code> to
     *         <code>"aws:kms"</code>. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">KMS-Managed Encryption
     *         Keys</a> in the <i>Amazon Simple Storage Service Developer Guide.</i>
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services Key Management Service ID of the key used to encrypt the output data, if any.
     * </p>
     * <p>
     * If you provide your own KMS key ID, you must add the required permissions to your KMS key described in <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-security-permission.html#sms-security-kms-permissions"
     * >Encrypt Output Data and Storage Volume with Amazon Web Services KMS</a>.
     * </p>
     * <p>
     * If you don't provide a KMS key ID, Amazon SageMaker uses the default Amazon Web Services KMS key for Amazon S3
     * for your role's account to encrypt your output data.
     * </p>
     * <p>
     * If you use a bucket policy with an <code>s3:PutObject</code> permission that only allows objects with server-side
     * encryption, set the condition key of <code>s3:x-amz-server-side-encryption</code> to <code>"aws:kms"</code>. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">KMS-Managed Encryption Keys</a> in
     * the <i>Amazon Simple Storage Service Developer Guide.</i>
     * </p>
     * 
     * @param kmsKeyId
     *        The Amazon Web Services Key Management Service ID of the key used to encrypt the output data, if any.</p>
     *        <p>
     *        If you provide your own KMS key ID, you must add the required permissions to your KMS key described in <a
     *        href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-security-permission.html#sms-security-kms-permissions"
     *        >Encrypt Output Data and Storage Volume with Amazon Web Services KMS</a>.
     *        </p>
     *        <p>
     *        If you don't provide a KMS key ID, Amazon SageMaker uses the default Amazon Web Services KMS key for
     *        Amazon S3 for your role's account to encrypt your output data.
     *        </p>
     *        <p>
     *        If you use a bucket policy with an <code>s3:PutObject</code> permission that only allows objects with
     *        server-side encryption, set the condition key of <code>s3:x-amz-server-side-encryption</code> to
     *        <code>"aws:kms"</code>. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">KMS-Managed Encryption
     *        Keys</a> in the <i>Amazon Simple Storage Service Developer Guide.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelingJobOutputConfig withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * An Amazon Simple Notification Service (Amazon SNS) output topic ARN. Provide a <code>SnsTopicArn</code> if you
     * want to do real time chaining to another streaming job and receive an Amazon SNS notifications each time a data
     * object is submitted by a worker.
     * </p>
     * <p>
     * If you provide an <code>SnsTopicArn</code> in <code>OutputConfig</code>, when workers complete labeling tasks,
     * Ground Truth will send labeling task output data to the SNS output topic you specify here.
     * </p>
     * <p>
     * To learn more, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-streaming-labeling-job.html#sms-streaming-how-it-works-output-data"
     * >Receive Output Data from a Streaming Labeling Job</a>.
     * </p>
     * 
     * @param snsTopicArn
     *        An Amazon Simple Notification Service (Amazon SNS) output topic ARN. Provide a <code>SnsTopicArn</code> if
     *        you want to do real time chaining to another streaming job and receive an Amazon SNS notifications each
     *        time a data object is submitted by a worker.</p>
     *        <p>
     *        If you provide an <code>SnsTopicArn</code> in <code>OutputConfig</code>, when workers complete labeling
     *        tasks, Ground Truth will send labeling task output data to the SNS output topic you specify here.
     *        </p>
     *        <p>
     *        To learn more, see <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-streaming-labeling-job.html#sms-streaming-how-it-works-output-data"
     *        >Receive Output Data from a Streaming Labeling Job</a>.
     */

    public void setSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    /**
     * <p>
     * An Amazon Simple Notification Service (Amazon SNS) output topic ARN. Provide a <code>SnsTopicArn</code> if you
     * want to do real time chaining to another streaming job and receive an Amazon SNS notifications each time a data
     * object is submitted by a worker.
     * </p>
     * <p>
     * If you provide an <code>SnsTopicArn</code> in <code>OutputConfig</code>, when workers complete labeling tasks,
     * Ground Truth will send labeling task output data to the SNS output topic you specify here.
     * </p>
     * <p>
     * To learn more, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-streaming-labeling-job.html#sms-streaming-how-it-works-output-data"
     * >Receive Output Data from a Streaming Labeling Job</a>.
     * </p>
     * 
     * @return An Amazon Simple Notification Service (Amazon SNS) output topic ARN. Provide a <code>SnsTopicArn</code>
     *         if you want to do real time chaining to another streaming job and receive an Amazon SNS notifications
     *         each time a data object is submitted by a worker.</p>
     *         <p>
     *         If you provide an <code>SnsTopicArn</code> in <code>OutputConfig</code>, when workers complete labeling
     *         tasks, Ground Truth will send labeling task output data to the SNS output topic you specify here.
     *         </p>
     *         <p>
     *         To learn more, see <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-streaming-labeling-job.html#sms-streaming-how-it-works-output-data"
     *         >Receive Output Data from a Streaming Labeling Job</a>.
     */

    public String getSnsTopicArn() {
        return this.snsTopicArn;
    }

    /**
     * <p>
     * An Amazon Simple Notification Service (Amazon SNS) output topic ARN. Provide a <code>SnsTopicArn</code> if you
     * want to do real time chaining to another streaming job and receive an Amazon SNS notifications each time a data
     * object is submitted by a worker.
     * </p>
     * <p>
     * If you provide an <code>SnsTopicArn</code> in <code>OutputConfig</code>, when workers complete labeling tasks,
     * Ground Truth will send labeling task output data to the SNS output topic you specify here.
     * </p>
     * <p>
     * To learn more, see <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-streaming-labeling-job.html#sms-streaming-how-it-works-output-data"
     * >Receive Output Data from a Streaming Labeling Job</a>.
     * </p>
     * 
     * @param snsTopicArn
     *        An Amazon Simple Notification Service (Amazon SNS) output topic ARN. Provide a <code>SnsTopicArn</code> if
     *        you want to do real time chaining to another streaming job and receive an Amazon SNS notifications each
     *        time a data object is submitted by a worker.</p>
     *        <p>
     *        If you provide an <code>SnsTopicArn</code> in <code>OutputConfig</code>, when workers complete labeling
     *        tasks, Ground Truth will send labeling task output data to the SNS output topic you specify here.
     *        </p>
     *        <p>
     *        To learn more, see <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/sms-streaming-labeling-job.html#sms-streaming-how-it-works-output-data"
     *        >Receive Output Data from a Streaming Labeling Job</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelingJobOutputConfig withSnsTopicArn(String snsTopicArn) {
        setSnsTopicArn(snsTopicArn);
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
        if (getS3OutputPath() != null)
            sb.append("S3OutputPath: ").append(getS3OutputPath()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getSnsTopicArn() != null)
            sb.append("SnsTopicArn: ").append(getSnsTopicArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LabelingJobOutputConfig == false)
            return false;
        LabelingJobOutputConfig other = (LabelingJobOutputConfig) obj;
        if (other.getS3OutputPath() == null ^ this.getS3OutputPath() == null)
            return false;
        if (other.getS3OutputPath() != null && other.getS3OutputPath().equals(this.getS3OutputPath()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getSnsTopicArn() == null ^ this.getSnsTopicArn() == null)
            return false;
        if (other.getSnsTopicArn() != null && other.getSnsTopicArn().equals(this.getSnsTopicArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3OutputPath() == null) ? 0 : getS3OutputPath().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getSnsTopicArn() == null) ? 0 : getSnsTopicArn().hashCode());
        return hashCode;
    }

    @Override
    public LabelingJobOutputConfig clone() {
        try {
            return (LabelingJobOutputConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.LabelingJobOutputConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
