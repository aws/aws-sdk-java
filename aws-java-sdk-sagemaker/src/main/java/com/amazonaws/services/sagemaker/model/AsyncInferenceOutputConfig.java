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
 * Specifies the configuration for asynchronous inference invocation outputs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AsyncInferenceOutputConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AsyncInferenceOutputConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that SageMaker uses to encrypt the
     * asynchronous inference output in Amazon S3.
     * </p>
     * <p/>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The Amazon S3 location to upload inference responses to.
     * </p>
     */
    private String s3OutputPath;
    /**
     * <p>
     * Specifies the configuration for notifications of inference results for asynchronous inference.
     * </p>
     */
    private AsyncInferenceNotificationConfig notificationConfig;

    /**
     * <p>
     * The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that SageMaker uses to encrypt the
     * asynchronous inference output in Amazon S3.
     * </p>
     * <p/>
     * 
     * @param kmsKeyId
     *        The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that SageMaker uses to
     *        encrypt the asynchronous inference output in Amazon S3.
     *        </p>
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that SageMaker uses to encrypt the
     * asynchronous inference output in Amazon S3.
     * </p>
     * <p/>
     * 
     * @return The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that SageMaker uses to
     *         encrypt the asynchronous inference output in Amazon S3.
     *         </p>
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that SageMaker uses to encrypt the
     * asynchronous inference output in Amazon S3.
     * </p>
     * <p/>
     * 
     * @param kmsKeyId
     *        The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that SageMaker uses to
     *        encrypt the asynchronous inference output in Amazon S3.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AsyncInferenceOutputConfig withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location to upload inference responses to.
     * </p>
     * 
     * @param s3OutputPath
     *        The Amazon S3 location to upload inference responses to.
     */

    public void setS3OutputPath(String s3OutputPath) {
        this.s3OutputPath = s3OutputPath;
    }

    /**
     * <p>
     * The Amazon S3 location to upload inference responses to.
     * </p>
     * 
     * @return The Amazon S3 location to upload inference responses to.
     */

    public String getS3OutputPath() {
        return this.s3OutputPath;
    }

    /**
     * <p>
     * The Amazon S3 location to upload inference responses to.
     * </p>
     * 
     * @param s3OutputPath
     *        The Amazon S3 location to upload inference responses to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AsyncInferenceOutputConfig withS3OutputPath(String s3OutputPath) {
        setS3OutputPath(s3OutputPath);
        return this;
    }

    /**
     * <p>
     * Specifies the configuration for notifications of inference results for asynchronous inference.
     * </p>
     * 
     * @param notificationConfig
     *        Specifies the configuration for notifications of inference results for asynchronous inference.
     */

    public void setNotificationConfig(AsyncInferenceNotificationConfig notificationConfig) {
        this.notificationConfig = notificationConfig;
    }

    /**
     * <p>
     * Specifies the configuration for notifications of inference results for asynchronous inference.
     * </p>
     * 
     * @return Specifies the configuration for notifications of inference results for asynchronous inference.
     */

    public AsyncInferenceNotificationConfig getNotificationConfig() {
        return this.notificationConfig;
    }

    /**
     * <p>
     * Specifies the configuration for notifications of inference results for asynchronous inference.
     * </p>
     * 
     * @param notificationConfig
     *        Specifies the configuration for notifications of inference results for asynchronous inference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AsyncInferenceOutputConfig withNotificationConfig(AsyncInferenceNotificationConfig notificationConfig) {
        setNotificationConfig(notificationConfig);
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
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getS3OutputPath() != null)
            sb.append("S3OutputPath: ").append(getS3OutputPath()).append(",");
        if (getNotificationConfig() != null)
            sb.append("NotificationConfig: ").append(getNotificationConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AsyncInferenceOutputConfig == false)
            return false;
        AsyncInferenceOutputConfig other = (AsyncInferenceOutputConfig) obj;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getS3OutputPath() == null ^ this.getS3OutputPath() == null)
            return false;
        if (other.getS3OutputPath() != null && other.getS3OutputPath().equals(this.getS3OutputPath()) == false)
            return false;
        if (other.getNotificationConfig() == null ^ this.getNotificationConfig() == null)
            return false;
        if (other.getNotificationConfig() != null && other.getNotificationConfig().equals(this.getNotificationConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getS3OutputPath() == null) ? 0 : getS3OutputPath().hashCode());
        hashCode = prime * hashCode + ((getNotificationConfig() == null) ? 0 : getNotificationConfig().hashCode());
        return hashCode;
    }

    @Override
    public AsyncInferenceOutputConfig clone() {
        try {
            return (AsyncInferenceOutputConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AsyncInferenceOutputConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
