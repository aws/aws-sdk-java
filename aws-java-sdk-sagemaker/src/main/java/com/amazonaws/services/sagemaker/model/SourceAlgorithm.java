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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies an algorithm that was used to create the model package. The algorithm must be either an algorithm resource
 * in your Amazon SageMaker account or an algorithm in AWS Marketplace that you are subscribed to.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/SourceAlgorithm" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceAlgorithm implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 path where the model artifacts, which result from model training, are stored. This path must point
     * to a single <code>gzip</code> compressed tar archive (<code>.tar.gz</code> suffix).
     * </p>
     */
    private String modelDataUrl;
    /**
     * <p>
     * The name of an algorithm that was used to create the model package. The algorithm must be either an algorithm
     * resource in your Amazon SageMaker account or an algorithm in AWS Marketplace that you are subscribed to.
     * </p>
     */
    private String algorithmName;

    /**
     * <p>
     * The Amazon S3 path where the model artifacts, which result from model training, are stored. This path must point
     * to a single <code>gzip</code> compressed tar archive (<code>.tar.gz</code> suffix).
     * </p>
     * 
     * @param modelDataUrl
     *        The Amazon S3 path where the model artifacts, which result from model training, are stored. This path must
     *        point to a single <code>gzip</code> compressed tar archive (<code>.tar.gz</code> suffix).
     */

    public void setModelDataUrl(String modelDataUrl) {
        this.modelDataUrl = modelDataUrl;
    }

    /**
     * <p>
     * The Amazon S3 path where the model artifacts, which result from model training, are stored. This path must point
     * to a single <code>gzip</code> compressed tar archive (<code>.tar.gz</code> suffix).
     * </p>
     * 
     * @return The Amazon S3 path where the model artifacts, which result from model training, are stored. This path
     *         must point to a single <code>gzip</code> compressed tar archive (<code>.tar.gz</code> suffix).
     */

    public String getModelDataUrl() {
        return this.modelDataUrl;
    }

    /**
     * <p>
     * The Amazon S3 path where the model artifacts, which result from model training, are stored. This path must point
     * to a single <code>gzip</code> compressed tar archive (<code>.tar.gz</code> suffix).
     * </p>
     * 
     * @param modelDataUrl
     *        The Amazon S3 path where the model artifacts, which result from model training, are stored. This path must
     *        point to a single <code>gzip</code> compressed tar archive (<code>.tar.gz</code> suffix).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceAlgorithm withModelDataUrl(String modelDataUrl) {
        setModelDataUrl(modelDataUrl);
        return this;
    }

    /**
     * <p>
     * The name of an algorithm that was used to create the model package. The algorithm must be either an algorithm
     * resource in your Amazon SageMaker account or an algorithm in AWS Marketplace that you are subscribed to.
     * </p>
     * 
     * @param algorithmName
     *        The name of an algorithm that was used to create the model package. The algorithm must be either an
     *        algorithm resource in your Amazon SageMaker account or an algorithm in AWS Marketplace that you are
     *        subscribed to.
     */

    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }

    /**
     * <p>
     * The name of an algorithm that was used to create the model package. The algorithm must be either an algorithm
     * resource in your Amazon SageMaker account or an algorithm in AWS Marketplace that you are subscribed to.
     * </p>
     * 
     * @return The name of an algorithm that was used to create the model package. The algorithm must be either an
     *         algorithm resource in your Amazon SageMaker account or an algorithm in AWS Marketplace that you are
     *         subscribed to.
     */

    public String getAlgorithmName() {
        return this.algorithmName;
    }

    /**
     * <p>
     * The name of an algorithm that was used to create the model package. The algorithm must be either an algorithm
     * resource in your Amazon SageMaker account or an algorithm in AWS Marketplace that you are subscribed to.
     * </p>
     * 
     * @param algorithmName
     *        The name of an algorithm that was used to create the model package. The algorithm must be either an
     *        algorithm resource in your Amazon SageMaker account or an algorithm in AWS Marketplace that you are
     *        subscribed to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SourceAlgorithm withAlgorithmName(String algorithmName) {
        setAlgorithmName(algorithmName);
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
        if (getModelDataUrl() != null)
            sb.append("ModelDataUrl: ").append(getModelDataUrl()).append(",");
        if (getAlgorithmName() != null)
            sb.append("AlgorithmName: ").append(getAlgorithmName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceAlgorithm == false)
            return false;
        SourceAlgorithm other = (SourceAlgorithm) obj;
        if (other.getModelDataUrl() == null ^ this.getModelDataUrl() == null)
            return false;
        if (other.getModelDataUrl() != null && other.getModelDataUrl().equals(this.getModelDataUrl()) == false)
            return false;
        if (other.getAlgorithmName() == null ^ this.getAlgorithmName() == null)
            return false;
        if (other.getAlgorithmName() != null && other.getAlgorithmName().equals(this.getAlgorithmName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelDataUrl() == null) ? 0 : getModelDataUrl().hashCode());
        hashCode = prime * hashCode + ((getAlgorithmName() == null) ? 0 : getAlgorithmName().hashCode());
        return hashCode;
    }

    @Override
    public SourceAlgorithm clone() {
        try {
            return (SourceAlgorithm) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.SourceAlgorithmMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
