/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Defines a container that provides the runtime environment for a model that you deploy with an inference component.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/InferenceComponentContainerSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InferenceComponentContainerSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Elastic Container Registry (Amazon ECR) path where the Docker image for the model is stored.
     * </p>
     */
    private String image;
    /**
     * <p>
     * The Amazon S3 path where the model artifacts, which result from model training, are stored. This path must point
     * to a single gzip compressed tar archive (.tar.gz suffix).
     * </p>
     */
    private String artifactUrl;
    /**
     * <p>
     * The environment variables to set in the Docker container. Each key and value in the Environment string-to-string
     * map can have length of up to 1024. We support up to 16 entries in the map.
     * </p>
     */
    private java.util.Map<String, String> environment;

    /**
     * <p>
     * The Amazon Elastic Container Registry (Amazon ECR) path where the Docker image for the model is stored.
     * </p>
     * 
     * @param image
     *        The Amazon Elastic Container Registry (Amazon ECR) path where the Docker image for the model is stored.
     */

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * <p>
     * The Amazon Elastic Container Registry (Amazon ECR) path where the Docker image for the model is stored.
     * </p>
     * 
     * @return The Amazon Elastic Container Registry (Amazon ECR) path where the Docker image for the model is stored.
     */

    public String getImage() {
        return this.image;
    }

    /**
     * <p>
     * The Amazon Elastic Container Registry (Amazon ECR) path where the Docker image for the model is stored.
     * </p>
     * 
     * @param image
     *        The Amazon Elastic Container Registry (Amazon ECR) path where the Docker image for the model is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceComponentContainerSpecification withImage(String image) {
        setImage(image);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 path where the model artifacts, which result from model training, are stored. This path must point
     * to a single gzip compressed tar archive (.tar.gz suffix).
     * </p>
     * 
     * @param artifactUrl
     *        The Amazon S3 path where the model artifacts, which result from model training, are stored. This path must
     *        point to a single gzip compressed tar archive (.tar.gz suffix).
     */

    public void setArtifactUrl(String artifactUrl) {
        this.artifactUrl = artifactUrl;
    }

    /**
     * <p>
     * The Amazon S3 path where the model artifacts, which result from model training, are stored. This path must point
     * to a single gzip compressed tar archive (.tar.gz suffix).
     * </p>
     * 
     * @return The Amazon S3 path where the model artifacts, which result from model training, are stored. This path
     *         must point to a single gzip compressed tar archive (.tar.gz suffix).
     */

    public String getArtifactUrl() {
        return this.artifactUrl;
    }

    /**
     * <p>
     * The Amazon S3 path where the model artifacts, which result from model training, are stored. This path must point
     * to a single gzip compressed tar archive (.tar.gz suffix).
     * </p>
     * 
     * @param artifactUrl
     *        The Amazon S3 path where the model artifacts, which result from model training, are stored. This path must
     *        point to a single gzip compressed tar archive (.tar.gz suffix).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceComponentContainerSpecification withArtifactUrl(String artifactUrl) {
        setArtifactUrl(artifactUrl);
        return this;
    }

    /**
     * <p>
     * The environment variables to set in the Docker container. Each key and value in the Environment string-to-string
     * map can have length of up to 1024. We support up to 16 entries in the map.
     * </p>
     * 
     * @return The environment variables to set in the Docker container. Each key and value in the Environment
     *         string-to-string map can have length of up to 1024. We support up to 16 entries in the map.
     */

    public java.util.Map<String, String> getEnvironment() {
        return environment;
    }

    /**
     * <p>
     * The environment variables to set in the Docker container. Each key and value in the Environment string-to-string
     * map can have length of up to 1024. We support up to 16 entries in the map.
     * </p>
     * 
     * @param environment
     *        The environment variables to set in the Docker container. Each key and value in the Environment
     *        string-to-string map can have length of up to 1024. We support up to 16 entries in the map.
     */

    public void setEnvironment(java.util.Map<String, String> environment) {
        this.environment = environment;
    }

    /**
     * <p>
     * The environment variables to set in the Docker container. Each key and value in the Environment string-to-string
     * map can have length of up to 1024. We support up to 16 entries in the map.
     * </p>
     * 
     * @param environment
     *        The environment variables to set in the Docker container. Each key and value in the Environment
     *        string-to-string map can have length of up to 1024. We support up to 16 entries in the map.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceComponentContainerSpecification withEnvironment(java.util.Map<String, String> environment) {
        setEnvironment(environment);
        return this;
    }

    /**
     * Add a single Environment entry
     *
     * @see InferenceComponentContainerSpecification#withEnvironment
     * @returns a reference to this object so that method calls can be chained together.
     */

    public InferenceComponentContainerSpecification addEnvironmentEntry(String key, String value) {
        if (null == this.environment) {
            this.environment = new java.util.HashMap<String, String>();
        }
        if (this.environment.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.environment.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Environment.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceComponentContainerSpecification clearEnvironmentEntries() {
        this.environment = null;
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
        if (getImage() != null)
            sb.append("Image: ").append(getImage()).append(",");
        if (getArtifactUrl() != null)
            sb.append("ArtifactUrl: ").append(getArtifactUrl()).append(",");
        if (getEnvironment() != null)
            sb.append("Environment: ").append(getEnvironment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InferenceComponentContainerSpecification == false)
            return false;
        InferenceComponentContainerSpecification other = (InferenceComponentContainerSpecification) obj;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getArtifactUrl() == null ^ this.getArtifactUrl() == null)
            return false;
        if (other.getArtifactUrl() != null && other.getArtifactUrl().equals(this.getArtifactUrl()) == false)
            return false;
        if (other.getEnvironment() == null ^ this.getEnvironment() == null)
            return false;
        if (other.getEnvironment() != null && other.getEnvironment().equals(this.getEnvironment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getArtifactUrl() == null) ? 0 : getArtifactUrl().hashCode());
        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        return hashCode;
    }

    @Override
    public InferenceComponentContainerSpecification clone() {
        try {
            return (InferenceComponentContainerSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.InferenceComponentContainerSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
