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
 * The Amazon S3 location and configuration for storing inference request and response data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/InferenceExperimentDataStorageConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InferenceExperimentDataStorageConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 bucket where the inference request and response data is stored.
     * </p>
     */
    private String destination;
    /**
     * <p>
     * The Amazon Web Services Key Management Service key that Amazon SageMaker uses to encrypt captured data at rest
     * using Amazon S3 server-side encryption.
     * </p>
     */
    private String kmsKey;

    private CaptureContentTypeHeader contentType;

    /**
     * <p>
     * The Amazon S3 bucket where the inference request and response data is stored.
     * </p>
     * 
     * @param destination
     *        The Amazon S3 bucket where the inference request and response data is stored.
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The Amazon S3 bucket where the inference request and response data is stored.
     * </p>
     * 
     * @return The Amazon S3 bucket where the inference request and response data is stored.
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The Amazon S3 bucket where the inference request and response data is stored.
     * </p>
     * 
     * @param destination
     *        The Amazon S3 bucket where the inference request and response data is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceExperimentDataStorageConfig withDestination(String destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Key Management Service key that Amazon SageMaker uses to encrypt captured data at rest
     * using Amazon S3 server-side encryption.
     * </p>
     * 
     * @param kmsKey
     *        The Amazon Web Services Key Management Service key that Amazon SageMaker uses to encrypt captured data at
     *        rest using Amazon S3 server-side encryption.
     */

    public void setKmsKey(String kmsKey) {
        this.kmsKey = kmsKey;
    }

    /**
     * <p>
     * The Amazon Web Services Key Management Service key that Amazon SageMaker uses to encrypt captured data at rest
     * using Amazon S3 server-side encryption.
     * </p>
     * 
     * @return The Amazon Web Services Key Management Service key that Amazon SageMaker uses to encrypt captured data at
     *         rest using Amazon S3 server-side encryption.
     */

    public String getKmsKey() {
        return this.kmsKey;
    }

    /**
     * <p>
     * The Amazon Web Services Key Management Service key that Amazon SageMaker uses to encrypt captured data at rest
     * using Amazon S3 server-side encryption.
     * </p>
     * 
     * @param kmsKey
     *        The Amazon Web Services Key Management Service key that Amazon SageMaker uses to encrypt captured data at
     *        rest using Amazon S3 server-side encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceExperimentDataStorageConfig withKmsKey(String kmsKey) {
        setKmsKey(kmsKey);
        return this;
    }

    /**
     * @param contentType
     */

    public void setContentType(CaptureContentTypeHeader contentType) {
        this.contentType = contentType;
    }

    /**
     * @return
     */

    public CaptureContentTypeHeader getContentType() {
        return this.contentType;
    }

    /**
     * @param contentType
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceExperimentDataStorageConfig withContentType(CaptureContentTypeHeader contentType) {
        setContentType(contentType);
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
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getKmsKey() != null)
            sb.append("KmsKey: ").append(getKmsKey()).append(",");
        if (getContentType() != null)
            sb.append("ContentType: ").append(getContentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InferenceExperimentDataStorageConfig == false)
            return false;
        InferenceExperimentDataStorageConfig other = (InferenceExperimentDataStorageConfig) obj;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getKmsKey() == null ^ this.getKmsKey() == null)
            return false;
        if (other.getKmsKey() != null && other.getKmsKey().equals(this.getKmsKey()) == false)
            return false;
        if (other.getContentType() == null ^ this.getContentType() == null)
            return false;
        if (other.getContentType() != null && other.getContentType().equals(this.getContentType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getKmsKey() == null) ? 0 : getKmsKey().hashCode());
        hashCode = prime * hashCode + ((getContentType() == null) ? 0 : getContentType().hashCode());
        return hashCode;
    }

    @Override
    public InferenceExperimentDataStorageConfig clone() {
        try {
            return (InferenceExperimentDataStorageConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.InferenceExperimentDataStorageConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
