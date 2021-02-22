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
 * Specifies configuration for a core dump from the model container when the process crashes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ProductionVariantCoreDumpConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProductionVariantCoreDumpConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 bucket to send the core dump to.
     * </p>
     */
    private String destinationS3Uri;
    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the core dump data at rest
     * using Amazon S3 server-side encryption. The <code>KmsKeyId</code> can be any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * // KMS Key ID
     * </p>
     * <p>
     * <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key
     * </p>
     * <p>
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // KMS Key Alias
     * </p>
     * <p>
     * <code>"alias/ExampleAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key Alias
     * </p>
     * <p>
     * <code>"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use a KMS key ID or an alias of your master key, the Amazon SageMaker execution role must include
     * permissions to call <code>kms:Encrypt</code>. If you don't provide a KMS key ID, Amazon SageMaker uses the
     * default KMS key for Amazon S3 for your role's account. Amazon SageMaker uses server-side encryption with
     * KMS-managed keys for <code>OutputDataConfig</code>. If you use a bucket policy with an <code>s3:PutObject</code>
     * permission that only allows objects with server-side encryption, set the condition key of
     * <code>s3:x-amz-server-side-encryption</code> to <code>"aws:kms"</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">KMS-Managed Encryption Keys</a> in
     * the <i>Amazon Simple Storage Service Developer Guide.</i>
     * </p>
     * <p>
     * The KMS key policy must grant permission to the IAM role that you specify in your <code>CreateEndpoint</code> and
     * <code>UpdateEndpoint</code> requests. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Using Key Policies in AWS KMS</a>
     * in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The Amazon S3 bucket to send the core dump to.
     * </p>
     * 
     * @param destinationS3Uri
     *        The Amazon S3 bucket to send the core dump to.
     */

    public void setDestinationS3Uri(String destinationS3Uri) {
        this.destinationS3Uri = destinationS3Uri;
    }

    /**
     * <p>
     * The Amazon S3 bucket to send the core dump to.
     * </p>
     * 
     * @return The Amazon S3 bucket to send the core dump to.
     */

    public String getDestinationS3Uri() {
        return this.destinationS3Uri;
    }

    /**
     * <p>
     * The Amazon S3 bucket to send the core dump to.
     * </p>
     * 
     * @param destinationS3Uri
     *        The Amazon S3 bucket to send the core dump to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductionVariantCoreDumpConfig withDestinationS3Uri(String destinationS3Uri) {
        setDestinationS3Uri(destinationS3Uri);
        return this;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the core dump data at rest
     * using Amazon S3 server-side encryption. The <code>KmsKeyId</code> can be any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * // KMS Key ID
     * </p>
     * <p>
     * <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key
     * </p>
     * <p>
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // KMS Key Alias
     * </p>
     * <p>
     * <code>"alias/ExampleAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key Alias
     * </p>
     * <p>
     * <code>"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use a KMS key ID or an alias of your master key, the Amazon SageMaker execution role must include
     * permissions to call <code>kms:Encrypt</code>. If you don't provide a KMS key ID, Amazon SageMaker uses the
     * default KMS key for Amazon S3 for your role's account. Amazon SageMaker uses server-side encryption with
     * KMS-managed keys for <code>OutputDataConfig</code>. If you use a bucket policy with an <code>s3:PutObject</code>
     * permission that only allows objects with server-side encryption, set the condition key of
     * <code>s3:x-amz-server-side-encryption</code> to <code>"aws:kms"</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">KMS-Managed Encryption Keys</a> in
     * the <i>Amazon Simple Storage Service Developer Guide.</i>
     * </p>
     * <p>
     * The KMS key policy must grant permission to the IAM role that you specify in your <code>CreateEndpoint</code> and
     * <code>UpdateEndpoint</code> requests. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Using Key Policies in AWS KMS</a>
     * in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the core dump data at
     *        rest using Amazon S3 server-side encryption. The <code>KmsKeyId</code> can be any of the following
     *        formats: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        // KMS Key ID
     *        </p>
     *        <p>
     *        <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        // Amazon Resource Name (ARN) of a KMS Key
     *        </p>
     *        <p>
     *        <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        // KMS Key Alias
     *        </p>
     *        <p>
     *        <code>"alias/ExampleAlias"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        // Amazon Resource Name (ARN) of a KMS Key Alias
     *        </p>
     *        <p>
     *        <code>"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you use a KMS key ID or an alias of your master key, the Amazon SageMaker execution role must include
     *        permissions to call <code>kms:Encrypt</code>. If you don't provide a KMS key ID, Amazon SageMaker uses the
     *        default KMS key for Amazon S3 for your role's account. Amazon SageMaker uses server-side encryption with
     *        KMS-managed keys for <code>OutputDataConfig</code>. If you use a bucket policy with an
     *        <code>s3:PutObject</code> permission that only allows objects with server-side encryption, set the
     *        condition key of <code>s3:x-amz-server-side-encryption</code> to <code>"aws:kms"</code>. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">KMS-Managed Encryption
     *        Keys</a> in the <i>Amazon Simple Storage Service Developer Guide.</i>
     *        </p>
     *        <p>
     *        The KMS key policy must grant permission to the IAM role that you specify in your
     *        <code>CreateEndpoint</code> and <code>UpdateEndpoint</code> requests. For more information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Using Key Policies in AWS
     *        KMS</a> in the <i>AWS Key Management Service Developer Guide</i>.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the core dump data at rest
     * using Amazon S3 server-side encryption. The <code>KmsKeyId</code> can be any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * // KMS Key ID
     * </p>
     * <p>
     * <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key
     * </p>
     * <p>
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // KMS Key Alias
     * </p>
     * <p>
     * <code>"alias/ExampleAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key Alias
     * </p>
     * <p>
     * <code>"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use a KMS key ID or an alias of your master key, the Amazon SageMaker execution role must include
     * permissions to call <code>kms:Encrypt</code>. If you don't provide a KMS key ID, Amazon SageMaker uses the
     * default KMS key for Amazon S3 for your role's account. Amazon SageMaker uses server-side encryption with
     * KMS-managed keys for <code>OutputDataConfig</code>. If you use a bucket policy with an <code>s3:PutObject</code>
     * permission that only allows objects with server-side encryption, set the condition key of
     * <code>s3:x-amz-server-side-encryption</code> to <code>"aws:kms"</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">KMS-Managed Encryption Keys</a> in
     * the <i>Amazon Simple Storage Service Developer Guide.</i>
     * </p>
     * <p>
     * The KMS key policy must grant permission to the IAM role that you specify in your <code>CreateEndpoint</code> and
     * <code>UpdateEndpoint</code> requests. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Using Key Policies in AWS KMS</a>
     * in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @return The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the core dump data at
     *         rest using Amazon S3 server-side encryption. The <code>KmsKeyId</code> can be any of the following
     *         formats: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         // KMS Key ID
     *         </p>
     *         <p>
     *         <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         // Amazon Resource Name (ARN) of a KMS Key
     *         </p>
     *         <p>
     *         <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         // KMS Key Alias
     *         </p>
     *         <p>
     *         <code>"alias/ExampleAlias"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         // Amazon Resource Name (ARN) of a KMS Key Alias
     *         </p>
     *         <p>
     *         <code>"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you use a KMS key ID or an alias of your master key, the Amazon SageMaker execution role must include
     *         permissions to call <code>kms:Encrypt</code>. If you don't provide a KMS key ID, Amazon SageMaker uses
     *         the default KMS key for Amazon S3 for your role's account. Amazon SageMaker uses server-side encryption
     *         with KMS-managed keys for <code>OutputDataConfig</code>. If you use a bucket policy with an
     *         <code>s3:PutObject</code> permission that only allows objects with server-side encryption, set the
     *         condition key of <code>s3:x-amz-server-side-encryption</code> to <code>"aws:kms"</code>. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">KMS-Managed Encryption
     *         Keys</a> in the <i>Amazon Simple Storage Service Developer Guide.</i>
     *         </p>
     *         <p>
     *         The KMS key policy must grant permission to the IAM role that you specify in your
     *         <code>CreateEndpoint</code> and <code>UpdateEndpoint</code> requests. For more information, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Using Key Policies in AWS
     *         KMS</a> in the <i>AWS Key Management Service Developer Guide</i>.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the core dump data at rest
     * using Amazon S3 server-side encryption. The <code>KmsKeyId</code> can be any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * // KMS Key ID
     * </p>
     * <p>
     * <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key
     * </p>
     * <p>
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // KMS Key Alias
     * </p>
     * <p>
     * <code>"alias/ExampleAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key Alias
     * </p>
     * <p>
     * <code>"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use a KMS key ID or an alias of your master key, the Amazon SageMaker execution role must include
     * permissions to call <code>kms:Encrypt</code>. If you don't provide a KMS key ID, Amazon SageMaker uses the
     * default KMS key for Amazon S3 for your role's account. Amazon SageMaker uses server-side encryption with
     * KMS-managed keys for <code>OutputDataConfig</code>. If you use a bucket policy with an <code>s3:PutObject</code>
     * permission that only allows objects with server-side encryption, set the condition key of
     * <code>s3:x-amz-server-side-encryption</code> to <code>"aws:kms"</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">KMS-Managed Encryption Keys</a> in
     * the <i>Amazon Simple Storage Service Developer Guide.</i>
     * </p>
     * <p>
     * The KMS key policy must grant permission to the IAM role that you specify in your <code>CreateEndpoint</code> and
     * <code>UpdateEndpoint</code> requests. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Using Key Policies in AWS KMS</a>
     * in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the core dump data at
     *        rest using Amazon S3 server-side encryption. The <code>KmsKeyId</code> can be any of the following
     *        formats: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        // KMS Key ID
     *        </p>
     *        <p>
     *        <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        // Amazon Resource Name (ARN) of a KMS Key
     *        </p>
     *        <p>
     *        <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        // KMS Key Alias
     *        </p>
     *        <p>
     *        <code>"alias/ExampleAlias"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        // Amazon Resource Name (ARN) of a KMS Key Alias
     *        </p>
     *        <p>
     *        <code>"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you use a KMS key ID or an alias of your master key, the Amazon SageMaker execution role must include
     *        permissions to call <code>kms:Encrypt</code>. If you don't provide a KMS key ID, Amazon SageMaker uses the
     *        default KMS key for Amazon S3 for your role's account. Amazon SageMaker uses server-side encryption with
     *        KMS-managed keys for <code>OutputDataConfig</code>. If you use a bucket policy with an
     *        <code>s3:PutObject</code> permission that only allows objects with server-side encryption, set the
     *        condition key of <code>s3:x-amz-server-side-encryption</code> to <code>"aws:kms"</code>. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">KMS-Managed Encryption
     *        Keys</a> in the <i>Amazon Simple Storage Service Developer Guide.</i>
     *        </p>
     *        <p>
     *        The KMS key policy must grant permission to the IAM role that you specify in your
     *        <code>CreateEndpoint</code> and <code>UpdateEndpoint</code> requests. For more information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Using Key Policies in AWS
     *        KMS</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductionVariantCoreDumpConfig withKmsKeyId(String kmsKeyId) {
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
        if (getDestinationS3Uri() != null)
            sb.append("DestinationS3Uri: ").append(getDestinationS3Uri()).append(",");
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

        if (obj instanceof ProductionVariantCoreDumpConfig == false)
            return false;
        ProductionVariantCoreDumpConfig other = (ProductionVariantCoreDumpConfig) obj;
        if (other.getDestinationS3Uri() == null ^ this.getDestinationS3Uri() == null)
            return false;
        if (other.getDestinationS3Uri() != null && other.getDestinationS3Uri().equals(this.getDestinationS3Uri()) == false)
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

        hashCode = prime * hashCode + ((getDestinationS3Uri() == null) ? 0 : getDestinationS3Uri().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public ProductionVariantCoreDumpConfig clone() {
        try {
            return (ProductionVariantCoreDumpConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ProductionVariantCoreDumpConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
