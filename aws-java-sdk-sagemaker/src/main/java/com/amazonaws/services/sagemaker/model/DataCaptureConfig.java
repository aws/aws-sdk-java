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
 * Configuration to control how SageMaker captures inference data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DataCaptureConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataCaptureConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether data capture should be enabled or disabled (defaults to enabled).
     * </p>
     */
    private Boolean enableCapture;
    /**
     * <p>
     * The percentage of requests SageMaker will capture. A lower value is recommended for Endpoints with high traffic.
     * </p>
     */
    private Integer initialSamplingPercentage;
    /**
     * <p>
     * The Amazon S3 location used to capture the data.
     * </p>
     */
    private String destinationS3Uri;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Amazon Web Services Key Management Service key that SageMaker uses to encrypt
     * the captured data at rest using Amazon S3 server-side encryption.
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
     * Specifies data Model Monitor will capture. You can configure whether to collect only input, only output, or both
     * </p>
     */
    private java.util.List<CaptureOption> captureOptions;
    /**
     * <p>
     * Configuration specifying how to treat different headers. If no headers are specified SageMaker will by default
     * base64 encode when capturing the data.
     * </p>
     */
    private CaptureContentTypeHeader captureContentTypeHeader;

    /**
     * <p>
     * Whether data capture should be enabled or disabled (defaults to enabled).
     * </p>
     * 
     * @param enableCapture
     *        Whether data capture should be enabled or disabled (defaults to enabled).
     */

    public void setEnableCapture(Boolean enableCapture) {
        this.enableCapture = enableCapture;
    }

    /**
     * <p>
     * Whether data capture should be enabled or disabled (defaults to enabled).
     * </p>
     * 
     * @return Whether data capture should be enabled or disabled (defaults to enabled).
     */

    public Boolean getEnableCapture() {
        return this.enableCapture;
    }

    /**
     * <p>
     * Whether data capture should be enabled or disabled (defaults to enabled).
     * </p>
     * 
     * @param enableCapture
     *        Whether data capture should be enabled or disabled (defaults to enabled).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCaptureConfig withEnableCapture(Boolean enableCapture) {
        setEnableCapture(enableCapture);
        return this;
    }

    /**
     * <p>
     * Whether data capture should be enabled or disabled (defaults to enabled).
     * </p>
     * 
     * @return Whether data capture should be enabled or disabled (defaults to enabled).
     */

    public Boolean isEnableCapture() {
        return this.enableCapture;
    }

    /**
     * <p>
     * The percentage of requests SageMaker will capture. A lower value is recommended for Endpoints with high traffic.
     * </p>
     * 
     * @param initialSamplingPercentage
     *        The percentage of requests SageMaker will capture. A lower value is recommended for Endpoints with high
     *        traffic.
     */

    public void setInitialSamplingPercentage(Integer initialSamplingPercentage) {
        this.initialSamplingPercentage = initialSamplingPercentage;
    }

    /**
     * <p>
     * The percentage of requests SageMaker will capture. A lower value is recommended for Endpoints with high traffic.
     * </p>
     * 
     * @return The percentage of requests SageMaker will capture. A lower value is recommended for Endpoints with high
     *         traffic.
     */

    public Integer getInitialSamplingPercentage() {
        return this.initialSamplingPercentage;
    }

    /**
     * <p>
     * The percentage of requests SageMaker will capture. A lower value is recommended for Endpoints with high traffic.
     * </p>
     * 
     * @param initialSamplingPercentage
     *        The percentage of requests SageMaker will capture. A lower value is recommended for Endpoints with high
     *        traffic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCaptureConfig withInitialSamplingPercentage(Integer initialSamplingPercentage) {
        setInitialSamplingPercentage(initialSamplingPercentage);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location used to capture the data.
     * </p>
     * 
     * @param destinationS3Uri
     *        The Amazon S3 location used to capture the data.
     */

    public void setDestinationS3Uri(String destinationS3Uri) {
        this.destinationS3Uri = destinationS3Uri;
    }

    /**
     * <p>
     * The Amazon S3 location used to capture the data.
     * </p>
     * 
     * @return The Amazon S3 location used to capture the data.
     */

    public String getDestinationS3Uri() {
        return this.destinationS3Uri;
    }

    /**
     * <p>
     * The Amazon S3 location used to capture the data.
     * </p>
     * 
     * @param destinationS3Uri
     *        The Amazon S3 location used to capture the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCaptureConfig withDestinationS3Uri(String destinationS3Uri) {
        setDestinationS3Uri(destinationS3Uri);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Amazon Web Services Key Management Service key that SageMaker uses to encrypt
     * the captured data at rest using Amazon S3 server-side encryption.
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
     *        encrypt the captured data at rest using Amazon S3 server-side encryption.</p>
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
     * the captured data at rest using Amazon S3 server-side encryption.
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
     *         encrypt the captured data at rest using Amazon S3 server-side encryption.</p>
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
     * the captured data at rest using Amazon S3 server-side encryption.
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
     *        encrypt the captured data at rest using Amazon S3 server-side encryption.</p>
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

    public DataCaptureConfig withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * Specifies data Model Monitor will capture. You can configure whether to collect only input, only output, or both
     * </p>
     * 
     * @return Specifies data Model Monitor will capture. You can configure whether to collect only input, only output,
     *         or both
     */

    public java.util.List<CaptureOption> getCaptureOptions() {
        return captureOptions;
    }

    /**
     * <p>
     * Specifies data Model Monitor will capture. You can configure whether to collect only input, only output, or both
     * </p>
     * 
     * @param captureOptions
     *        Specifies data Model Monitor will capture. You can configure whether to collect only input, only output,
     *        or both
     */

    public void setCaptureOptions(java.util.Collection<CaptureOption> captureOptions) {
        if (captureOptions == null) {
            this.captureOptions = null;
            return;
        }

        this.captureOptions = new java.util.ArrayList<CaptureOption>(captureOptions);
    }

    /**
     * <p>
     * Specifies data Model Monitor will capture. You can configure whether to collect only input, only output, or both
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCaptureOptions(java.util.Collection)} or {@link #withCaptureOptions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param captureOptions
     *        Specifies data Model Monitor will capture. You can configure whether to collect only input, only output,
     *        or both
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCaptureConfig withCaptureOptions(CaptureOption... captureOptions) {
        if (this.captureOptions == null) {
            setCaptureOptions(new java.util.ArrayList<CaptureOption>(captureOptions.length));
        }
        for (CaptureOption ele : captureOptions) {
            this.captureOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies data Model Monitor will capture. You can configure whether to collect only input, only output, or both
     * </p>
     * 
     * @param captureOptions
     *        Specifies data Model Monitor will capture. You can configure whether to collect only input, only output,
     *        or both
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCaptureConfig withCaptureOptions(java.util.Collection<CaptureOption> captureOptions) {
        setCaptureOptions(captureOptions);
        return this;
    }

    /**
     * <p>
     * Configuration specifying how to treat different headers. If no headers are specified SageMaker will by default
     * base64 encode when capturing the data.
     * </p>
     * 
     * @param captureContentTypeHeader
     *        Configuration specifying how to treat different headers. If no headers are specified SageMaker will by
     *        default base64 encode when capturing the data.
     */

    public void setCaptureContentTypeHeader(CaptureContentTypeHeader captureContentTypeHeader) {
        this.captureContentTypeHeader = captureContentTypeHeader;
    }

    /**
     * <p>
     * Configuration specifying how to treat different headers. If no headers are specified SageMaker will by default
     * base64 encode when capturing the data.
     * </p>
     * 
     * @return Configuration specifying how to treat different headers. If no headers are specified SageMaker will by
     *         default base64 encode when capturing the data.
     */

    public CaptureContentTypeHeader getCaptureContentTypeHeader() {
        return this.captureContentTypeHeader;
    }

    /**
     * <p>
     * Configuration specifying how to treat different headers. If no headers are specified SageMaker will by default
     * base64 encode when capturing the data.
     * </p>
     * 
     * @param captureContentTypeHeader
     *        Configuration specifying how to treat different headers. If no headers are specified SageMaker will by
     *        default base64 encode when capturing the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataCaptureConfig withCaptureContentTypeHeader(CaptureContentTypeHeader captureContentTypeHeader) {
        setCaptureContentTypeHeader(captureContentTypeHeader);
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
        if (getEnableCapture() != null)
            sb.append("EnableCapture: ").append(getEnableCapture()).append(",");
        if (getInitialSamplingPercentage() != null)
            sb.append("InitialSamplingPercentage: ").append(getInitialSamplingPercentage()).append(",");
        if (getDestinationS3Uri() != null)
            sb.append("DestinationS3Uri: ").append(getDestinationS3Uri()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getCaptureOptions() != null)
            sb.append("CaptureOptions: ").append(getCaptureOptions()).append(",");
        if (getCaptureContentTypeHeader() != null)
            sb.append("CaptureContentTypeHeader: ").append(getCaptureContentTypeHeader());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataCaptureConfig == false)
            return false;
        DataCaptureConfig other = (DataCaptureConfig) obj;
        if (other.getEnableCapture() == null ^ this.getEnableCapture() == null)
            return false;
        if (other.getEnableCapture() != null && other.getEnableCapture().equals(this.getEnableCapture()) == false)
            return false;
        if (other.getInitialSamplingPercentage() == null ^ this.getInitialSamplingPercentage() == null)
            return false;
        if (other.getInitialSamplingPercentage() != null && other.getInitialSamplingPercentage().equals(this.getInitialSamplingPercentage()) == false)
            return false;
        if (other.getDestinationS3Uri() == null ^ this.getDestinationS3Uri() == null)
            return false;
        if (other.getDestinationS3Uri() != null && other.getDestinationS3Uri().equals(this.getDestinationS3Uri()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getCaptureOptions() == null ^ this.getCaptureOptions() == null)
            return false;
        if (other.getCaptureOptions() != null && other.getCaptureOptions().equals(this.getCaptureOptions()) == false)
            return false;
        if (other.getCaptureContentTypeHeader() == null ^ this.getCaptureContentTypeHeader() == null)
            return false;
        if (other.getCaptureContentTypeHeader() != null && other.getCaptureContentTypeHeader().equals(this.getCaptureContentTypeHeader()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnableCapture() == null) ? 0 : getEnableCapture().hashCode());
        hashCode = prime * hashCode + ((getInitialSamplingPercentage() == null) ? 0 : getInitialSamplingPercentage().hashCode());
        hashCode = prime * hashCode + ((getDestinationS3Uri() == null) ? 0 : getDestinationS3Uri().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getCaptureOptions() == null) ? 0 : getCaptureOptions().hashCode());
        hashCode = prime * hashCode + ((getCaptureContentTypeHeader() == null) ? 0 : getCaptureContentTypeHeader().hashCode());
        return hashCode;
    }

    @Override
    public DataCaptureConfig clone() {
        try {
            return (DataCaptureConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.DataCaptureConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
