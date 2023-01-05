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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration to control how SageMaker captures inference data for batch transform jobs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/BatchDataCaptureConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDataCaptureConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 location being used to capture the data.
     * </p>
     */
    private String destinationS3Uri;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Amazon Web Services Key Management Service key that SageMaker uses to encrypt
     * data on the storage volume attached to the ML compute instance that hosts the batch transform job.
     * </p>
     * <p>
     * The KmsKeyId can be any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name ARN: <code>arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     */
    private String kmsKeyId;
    /**
     * <p>
     * Flag that indicates whether to append inference id to the output.
     * </p>
     */
    private Boolean generateInferenceId;

    /**
     * <p>
     * The Amazon S3 location being used to capture the data.
     * </p>
     * 
     * @param destinationS3Uri
     *        The Amazon S3 location being used to capture the data.
     */

    public void setDestinationS3Uri(String destinationS3Uri) {
        this.destinationS3Uri = destinationS3Uri;
    }

    /**
     * <p>
     * The Amazon S3 location being used to capture the data.
     * </p>
     * 
     * @return The Amazon S3 location being used to capture the data.
     */

    public String getDestinationS3Uri() {
        return this.destinationS3Uri;
    }

    /**
     * <p>
     * The Amazon S3 location being used to capture the data.
     * </p>
     * 
     * @param destinationS3Uri
     *        The Amazon S3 location being used to capture the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDataCaptureConfig withDestinationS3Uri(String destinationS3Uri) {
        setDestinationS3Uri(destinationS3Uri);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Amazon Web Services Key Management Service key that SageMaker uses to encrypt
     * data on the storage volume attached to the ML compute instance that hosts the batch transform job.
     * </p>
     * <p>
     * The KmsKeyId can be any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name ARN: <code>arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param kmsKeyId
     *        The Amazon Resource Name (ARN) of a Amazon Web Services Key Management Service key that SageMaker uses to
     *        encrypt data on the storage volume attached to the ML compute instance that hosts the batch transform
     *        job.</p>
     *        <p>
     *        The KmsKeyId can be any of the following formats:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key ARN: <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias name: <code>alias/ExampleAlias</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias name ARN: <code>arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias</code>
     *        </p>
     *        </li>
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Amazon Web Services Key Management Service key that SageMaker uses to encrypt
     * data on the storage volume attached to the ML compute instance that hosts the batch transform job.
     * </p>
     * <p>
     * The KmsKeyId can be any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name ARN: <code>arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Resource Name (ARN) of a Amazon Web Services Key Management Service key that SageMaker uses to
     *         encrypt data on the storage volume attached to the ML compute instance that hosts the batch transform
     *         job.</p>
     *         <p>
     *         The KmsKeyId can be any of the following formats:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key ARN: <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Alias name: <code>alias/ExampleAlias</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Alias name ARN: <code>arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias</code>
     *         </p>
     *         </li>
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Amazon Web Services Key Management Service key that SageMaker uses to encrypt
     * data on the storage volume attached to the ML compute instance that hosts the batch transform job.
     * </p>
     * <p>
     * The KmsKeyId can be any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name ARN: <code>arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param kmsKeyId
     *        The Amazon Resource Name (ARN) of a Amazon Web Services Key Management Service key that SageMaker uses to
     *        encrypt data on the storage volume attached to the ML compute instance that hosts the batch transform
     *        job.</p>
     *        <p>
     *        The KmsKeyId can be any of the following formats:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key ARN: <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias name: <code>alias/ExampleAlias</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias name ARN: <code>arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDataCaptureConfig withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * Flag that indicates whether to append inference id to the output.
     * </p>
     * 
     * @param generateInferenceId
     *        Flag that indicates whether to append inference id to the output.
     */

    public void setGenerateInferenceId(Boolean generateInferenceId) {
        this.generateInferenceId = generateInferenceId;
    }

    /**
     * <p>
     * Flag that indicates whether to append inference id to the output.
     * </p>
     * 
     * @return Flag that indicates whether to append inference id to the output.
     */

    public Boolean getGenerateInferenceId() {
        return this.generateInferenceId;
    }

    /**
     * <p>
     * Flag that indicates whether to append inference id to the output.
     * </p>
     * 
     * @param generateInferenceId
     *        Flag that indicates whether to append inference id to the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDataCaptureConfig withGenerateInferenceId(Boolean generateInferenceId) {
        setGenerateInferenceId(generateInferenceId);
        return this;
    }

    /**
     * <p>
     * Flag that indicates whether to append inference id to the output.
     * </p>
     * 
     * @return Flag that indicates whether to append inference id to the output.
     */

    public Boolean isGenerateInferenceId() {
        return this.generateInferenceId;
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
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getGenerateInferenceId() != null)
            sb.append("GenerateInferenceId: ").append(getGenerateInferenceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDataCaptureConfig == false)
            return false;
        BatchDataCaptureConfig other = (BatchDataCaptureConfig) obj;
        if (other.getDestinationS3Uri() == null ^ this.getDestinationS3Uri() == null)
            return false;
        if (other.getDestinationS3Uri() != null && other.getDestinationS3Uri().equals(this.getDestinationS3Uri()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getGenerateInferenceId() == null ^ this.getGenerateInferenceId() == null)
            return false;
        if (other.getGenerateInferenceId() != null && other.getGenerateInferenceId().equals(this.getGenerateInferenceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationS3Uri() == null) ? 0 : getDestinationS3Uri().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getGenerateInferenceId() == null) ? 0 : getGenerateInferenceId().hashCode());
        return hashCode;
    }

    @Override
    public BatchDataCaptureConfig clone() {
        try {
            return (BatchDataCaptureConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.BatchDataCaptureConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
