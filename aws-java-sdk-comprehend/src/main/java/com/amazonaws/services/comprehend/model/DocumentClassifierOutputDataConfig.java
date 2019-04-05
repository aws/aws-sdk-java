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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides output results configuration parameters for custom classifier jobs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DocumentClassifierOutputDataConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentClassifierOutputDataConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * When you use the <code>OutputDataConfig</code> object while creating a custom classifier, you specify the Amazon
     * S3 location where you want to write the confusion matrix. The URI must be in the same region as the API endpoint
     * that you are calling. The location is used as the prefix for the actual location of this output file.
     * </p>
     * <p>
     * When the custom classifier job is finished, the service creates the output file in a directory specific to the
     * job. The <code>S3Uri</code> field contains the location of the output file, called <code>output.tar.gz</code>. It
     * is a compressed archive that contains the confusion matrix.
     * </p>
     */
    private String s3Uri;
    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt the output results from an
     * analysis job. The KmsKeyId can be one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * KMS Key Alias: <code>"alias/ExampleAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN of a KMS Key Alias: <code>"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"</code>
     * </p>
     * </li>
     * </ul>
     */
    private String kmsKeyId;

    /**
     * <p>
     * When you use the <code>OutputDataConfig</code> object while creating a custom classifier, you specify the Amazon
     * S3 location where you want to write the confusion matrix. The URI must be in the same region as the API endpoint
     * that you are calling. The location is used as the prefix for the actual location of this output file.
     * </p>
     * <p>
     * When the custom classifier job is finished, the service creates the output file in a directory specific to the
     * job. The <code>S3Uri</code> field contains the location of the output file, called <code>output.tar.gz</code>. It
     * is a compressed archive that contains the confusion matrix.
     * </p>
     * 
     * @param s3Uri
     *        When you use the <code>OutputDataConfig</code> object while creating a custom classifier, you specify the
     *        Amazon S3 location where you want to write the confusion matrix. The URI must be in the same region as the
     *        API endpoint that you are calling. The location is used as the prefix for the actual location of this
     *        output file.</p>
     *        <p>
     *        When the custom classifier job is finished, the service creates the output file in a directory specific to
     *        the job. The <code>S3Uri</code> field contains the location of the output file, called
     *        <code>output.tar.gz</code>. It is a compressed archive that contains the confusion matrix.
     */

    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * <p>
     * When you use the <code>OutputDataConfig</code> object while creating a custom classifier, you specify the Amazon
     * S3 location where you want to write the confusion matrix. The URI must be in the same region as the API endpoint
     * that you are calling. The location is used as the prefix for the actual location of this output file.
     * </p>
     * <p>
     * When the custom classifier job is finished, the service creates the output file in a directory specific to the
     * job. The <code>S3Uri</code> field contains the location of the output file, called <code>output.tar.gz</code>. It
     * is a compressed archive that contains the confusion matrix.
     * </p>
     * 
     * @return When you use the <code>OutputDataConfig</code> object while creating a custom classifier, you specify the
     *         Amazon S3 location where you want to write the confusion matrix. The URI must be in the same region as
     *         the API endpoint that you are calling. The location is used as the prefix for the actual location of this
     *         output file.</p>
     *         <p>
     *         When the custom classifier job is finished, the service creates the output file in a directory specific
     *         to the job. The <code>S3Uri</code> field contains the location of the output file, called
     *         <code>output.tar.gz</code>. It is a compressed archive that contains the confusion matrix.
     */

    public String getS3Uri() {
        return this.s3Uri;
    }

    /**
     * <p>
     * When you use the <code>OutputDataConfig</code> object while creating a custom classifier, you specify the Amazon
     * S3 location where you want to write the confusion matrix. The URI must be in the same region as the API endpoint
     * that you are calling. The location is used as the prefix for the actual location of this output file.
     * </p>
     * <p>
     * When the custom classifier job is finished, the service creates the output file in a directory specific to the
     * job. The <code>S3Uri</code> field contains the location of the output file, called <code>output.tar.gz</code>. It
     * is a compressed archive that contains the confusion matrix.
     * </p>
     * 
     * @param s3Uri
     *        When you use the <code>OutputDataConfig</code> object while creating a custom classifier, you specify the
     *        Amazon S3 location where you want to write the confusion matrix. The URI must be in the same region as the
     *        API endpoint that you are calling. The location is used as the prefix for the actual location of this
     *        output file.</p>
     *        <p>
     *        When the custom classifier job is finished, the service creates the output file in a directory specific to
     *        the job. The <code>S3Uri</code> field contains the location of the output file, called
     *        <code>output.tar.gz</code>. It is a compressed archive that contains the confusion matrix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentClassifierOutputDataConfig withS3Uri(String s3Uri) {
        setS3Uri(s3Uri);
        return this;
    }

    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt the output results from an
     * analysis job. The KmsKeyId can be one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * KMS Key Alias: <code>"alias/ExampleAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN of a KMS Key Alias: <code>"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param kmsKeyId
     *        ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt the output results
     *        from an analysis job. The KmsKeyId can be one of the following formats:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Resource Name (ARN) of a KMS Key:
     *        <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        KMS Key Alias: <code>"alias/ExampleAlias"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARN of a KMS Key Alias: <code>"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"</code>
     *        </p>
     *        </li>
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt the output results from an
     * analysis job. The KmsKeyId can be one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * KMS Key Alias: <code>"alias/ExampleAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN of a KMS Key Alias: <code>"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt the output results
     *         from an analysis job. The KmsKeyId can be one of the following formats:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Resource Name (ARN) of a KMS Key:
     *         <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         KMS Key Alias: <code>"alias/ExampleAlias"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ARN of a KMS Key Alias: <code>"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"</code>
     *         </p>
     *         </li>
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt the output results from an
     * analysis job. The KmsKeyId can be one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS Key:
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * KMS Key Alias: <code>"alias/ExampleAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * ARN of a KMS Key Alias: <code>"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param kmsKeyId
     *        ID for the AWS Key Management Service (KMS) key that Amazon Comprehend uses to encrypt the output results
     *        from an analysis job. The KmsKeyId can be one of the following formats:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        KMS Key ID: <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Resource Name (ARN) of a KMS Key:
     *        <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        KMS Key Alias: <code>"alias/ExampleAlias"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ARN of a KMS Key Alias: <code>"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentClassifierOutputDataConfig withKmsKeyId(String kmsKeyId) {
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
        if (getS3Uri() != null)
            sb.append("S3Uri: ").append(getS3Uri()).append(",");
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

        if (obj instanceof DocumentClassifierOutputDataConfig == false)
            return false;
        DocumentClassifierOutputDataConfig other = (DocumentClassifierOutputDataConfig) obj;
        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
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

        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public DocumentClassifierOutputDataConfig clone() {
        try {
            return (DocumentClassifierOutputDataConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.DocumentClassifierOutputDataConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
