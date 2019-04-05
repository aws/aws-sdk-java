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
 * Describes the Docker container for the model package.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ModelPackageContainerDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelPackageContainerDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The DNS host name for the Docker container.
     * </p>
     */
    private String containerHostname;
    /**
     * <p>
     * The Amazon EC2 Container Registry (Amazon ECR) path where inference code is stored.
     * </p>
     * <p>
     * If you are using your own custom algorithm instead of an algorithm provided by Amazon SageMaker, the inference
     * code must meet Amazon SageMaker requirements. Amazon SageMaker supports both
     * <code>registry/repository[:tag]</code> and <code>registry/repository[@digest]</code> image path formats. For more
     * information, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html">Using Your Own
     * Algorithms with Amazon SageMaker</a>.
     * </p>
     */
    private String image;
    /**
     * <p>
     * An MD5 hash of the training algorithm that identifies the Docker image used for training.
     * </p>
     */
    private String imageDigest;
    /**
     * <p>
     * The Amazon S3 path where the model artifacts, which result from model training, are stored. This path must point
     * to a single <code>gzip</code> compressed tar archive (<code>.tar.gz</code> suffix).
     * </p>
     */
    private String modelDataUrl;
    /**
     * <p>
     * The AWS Marketplace product ID of the model package.
     * </p>
     */
    private String productId;

    /**
     * <p>
     * The DNS host name for the Docker container.
     * </p>
     * 
     * @param containerHostname
     *        The DNS host name for the Docker container.
     */

    public void setContainerHostname(String containerHostname) {
        this.containerHostname = containerHostname;
    }

    /**
     * <p>
     * The DNS host name for the Docker container.
     * </p>
     * 
     * @return The DNS host name for the Docker container.
     */

    public String getContainerHostname() {
        return this.containerHostname;
    }

    /**
     * <p>
     * The DNS host name for the Docker container.
     * </p>
     * 
     * @param containerHostname
     *        The DNS host name for the Docker container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackageContainerDefinition withContainerHostname(String containerHostname) {
        setContainerHostname(containerHostname);
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 Container Registry (Amazon ECR) path where inference code is stored.
     * </p>
     * <p>
     * If you are using your own custom algorithm instead of an algorithm provided by Amazon SageMaker, the inference
     * code must meet Amazon SageMaker requirements. Amazon SageMaker supports both
     * <code>registry/repository[:tag]</code> and <code>registry/repository[@digest]</code> image path formats. For more
     * information, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html">Using Your Own
     * Algorithms with Amazon SageMaker</a>.
     * </p>
     * 
     * @param image
     *        The Amazon EC2 Container Registry (Amazon ECR) path where inference code is stored.</p>
     *        <p>
     *        If you are using your own custom algorithm instead of an algorithm provided by Amazon SageMaker, the
     *        inference code must meet Amazon SageMaker requirements. Amazon SageMaker supports both
     *        <code>registry/repository[:tag]</code> and <code>registry/repository[@digest]</code> image path formats.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html">Using Your Own Algorithms with
     *        Amazon SageMaker</a>.
     */

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * <p>
     * The Amazon EC2 Container Registry (Amazon ECR) path where inference code is stored.
     * </p>
     * <p>
     * If you are using your own custom algorithm instead of an algorithm provided by Amazon SageMaker, the inference
     * code must meet Amazon SageMaker requirements. Amazon SageMaker supports both
     * <code>registry/repository[:tag]</code> and <code>registry/repository[@digest]</code> image path formats. For more
     * information, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html">Using Your Own
     * Algorithms with Amazon SageMaker</a>.
     * </p>
     * 
     * @return The Amazon EC2 Container Registry (Amazon ECR) path where inference code is stored.</p>
     *         <p>
     *         If you are using your own custom algorithm instead of an algorithm provided by Amazon SageMaker, the
     *         inference code must meet Amazon SageMaker requirements. Amazon SageMaker supports both
     *         <code>registry/repository[:tag]</code> and <code>registry/repository[@digest]</code> image path formats.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html">Using Your Own Algorithms
     *         with Amazon SageMaker</a>.
     */

    public String getImage() {
        return this.image;
    }

    /**
     * <p>
     * The Amazon EC2 Container Registry (Amazon ECR) path where inference code is stored.
     * </p>
     * <p>
     * If you are using your own custom algorithm instead of an algorithm provided by Amazon SageMaker, the inference
     * code must meet Amazon SageMaker requirements. Amazon SageMaker supports both
     * <code>registry/repository[:tag]</code> and <code>registry/repository[@digest]</code> image path formats. For more
     * information, see <a href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html">Using Your Own
     * Algorithms with Amazon SageMaker</a>.
     * </p>
     * 
     * @param image
     *        The Amazon EC2 Container Registry (Amazon ECR) path where inference code is stored.</p>
     *        <p>
     *        If you are using your own custom algorithm instead of an algorithm provided by Amazon SageMaker, the
     *        inference code must meet Amazon SageMaker requirements. Amazon SageMaker supports both
     *        <code>registry/repository[:tag]</code> and <code>registry/repository[@digest]</code> image path formats.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html">Using Your Own Algorithms with
     *        Amazon SageMaker</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackageContainerDefinition withImage(String image) {
        setImage(image);
        return this;
    }

    /**
     * <p>
     * An MD5 hash of the training algorithm that identifies the Docker image used for training.
     * </p>
     * 
     * @param imageDigest
     *        An MD5 hash of the training algorithm that identifies the Docker image used for training.
     */

    public void setImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
    }

    /**
     * <p>
     * An MD5 hash of the training algorithm that identifies the Docker image used for training.
     * </p>
     * 
     * @return An MD5 hash of the training algorithm that identifies the Docker image used for training.
     */

    public String getImageDigest() {
        return this.imageDigest;
    }

    /**
     * <p>
     * An MD5 hash of the training algorithm that identifies the Docker image used for training.
     * </p>
     * 
     * @param imageDigest
     *        An MD5 hash of the training algorithm that identifies the Docker image used for training.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackageContainerDefinition withImageDigest(String imageDigest) {
        setImageDigest(imageDigest);
        return this;
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

    public ModelPackageContainerDefinition withModelDataUrl(String modelDataUrl) {
        setModelDataUrl(modelDataUrl);
        return this;
    }

    /**
     * <p>
     * The AWS Marketplace product ID of the model package.
     * </p>
     * 
     * @param productId
     *        The AWS Marketplace product ID of the model package.
     */

    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * <p>
     * The AWS Marketplace product ID of the model package.
     * </p>
     * 
     * @return The AWS Marketplace product ID of the model package.
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     * <p>
     * The AWS Marketplace product ID of the model package.
     * </p>
     * 
     * @param productId
     *        The AWS Marketplace product ID of the model package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackageContainerDefinition withProductId(String productId) {
        setProductId(productId);
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
        if (getContainerHostname() != null)
            sb.append("ContainerHostname: ").append(getContainerHostname()).append(",");
        if (getImage() != null)
            sb.append("Image: ").append(getImage()).append(",");
        if (getImageDigest() != null)
            sb.append("ImageDigest: ").append(getImageDigest()).append(",");
        if (getModelDataUrl() != null)
            sb.append("ModelDataUrl: ").append(getModelDataUrl()).append(",");
        if (getProductId() != null)
            sb.append("ProductId: ").append(getProductId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelPackageContainerDefinition == false)
            return false;
        ModelPackageContainerDefinition other = (ModelPackageContainerDefinition) obj;
        if (other.getContainerHostname() == null ^ this.getContainerHostname() == null)
            return false;
        if (other.getContainerHostname() != null && other.getContainerHostname().equals(this.getContainerHostname()) == false)
            return false;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getImageDigest() == null ^ this.getImageDigest() == null)
            return false;
        if (other.getImageDigest() != null && other.getImageDigest().equals(this.getImageDigest()) == false)
            return false;
        if (other.getModelDataUrl() == null ^ this.getModelDataUrl() == null)
            return false;
        if (other.getModelDataUrl() != null && other.getModelDataUrl().equals(this.getModelDataUrl()) == false)
            return false;
        if (other.getProductId() == null ^ this.getProductId() == null)
            return false;
        if (other.getProductId() != null && other.getProductId().equals(this.getProductId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerHostname() == null) ? 0 : getContainerHostname().hashCode());
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getImageDigest() == null) ? 0 : getImageDigest().hashCode());
        hashCode = prime * hashCode + ((getModelDataUrl() == null) ? 0 : getModelDataUrl().hashCode());
        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        return hashCode;
    }

    @Override
    public ModelPackageContainerDefinition clone() {
        try {
            return (ModelPackageContainerDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ModelPackageContainerDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
