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
 * Describes the container, as part of model definition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ContainerDefinition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * This parameter is ignored.
     * </p>
     */
    private String containerHostname;
    /**
     * <p>
     * The Amazon EC2 Container Registry (Amazon ECR) path where inference code is stored. If you are using your own
     * custom algorithm instead of an algorithm provided by Amazon SageMaker, the inference code must meet Amazon
     * SageMaker requirements. Amazon SageMaker supports both <code>registry/repository[:tag]</code> and
     * <code>registry/repository[@digest]</code> image path formats. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html">Using Your Own Algorithms with Amazon
     * SageMaker</a>
     * </p>
     */
    private String image;
    /**
     * <p>
     * The S3 path where the model artifacts, which result from model training, are stored. This path must point to a
     * single gzip compressed tar archive (.tar.gz suffix).
     * </p>
     * <p>
     * If you provide a value for this parameter, Amazon SageMaker uses AWS Security Token Service to download model
     * artifacts from the S3 path you provide. AWS STS is activated in your IAM user account by default. If you
     * previously deactivated AWS STS for a region, you need to reactivate AWS STS for that region. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">Activating and
     * Deactivating AWS STS in an AWS Region</a> in the <i>AWS Identity and Access Management User Guide</i>.
     * </p>
     */
    private String modelDataUrl;
    /**
     * <p>
     * The environment variables to set in the Docker container. Each key and value in the <code>Environment</code>
     * string to string map can have length of up to 1024. We support up to 16 entries in the map.
     * </p>
     */
    private java.util.Map<String, String> environment;
    /**
     * <p>
     * The name of the model package to use to create the model.
     * </p>
     */
    private String modelPackageName;

    /**
     * <p>
     * This parameter is ignored.
     * </p>
     * 
     * @param containerHostname
     *        This parameter is ignored.
     */

    public void setContainerHostname(String containerHostname) {
        this.containerHostname = containerHostname;
    }

    /**
     * <p>
     * This parameter is ignored.
     * </p>
     * 
     * @return This parameter is ignored.
     */

    public String getContainerHostname() {
        return this.containerHostname;
    }

    /**
     * <p>
     * This parameter is ignored.
     * </p>
     * 
     * @param containerHostname
     *        This parameter is ignored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withContainerHostname(String containerHostname) {
        setContainerHostname(containerHostname);
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 Container Registry (Amazon ECR) path where inference code is stored. If you are using your own
     * custom algorithm instead of an algorithm provided by Amazon SageMaker, the inference code must meet Amazon
     * SageMaker requirements. Amazon SageMaker supports both <code>registry/repository[:tag]</code> and
     * <code>registry/repository[@digest]</code> image path formats. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html">Using Your Own Algorithms with Amazon
     * SageMaker</a>
     * </p>
     * 
     * @param image
     *        The Amazon EC2 Container Registry (Amazon ECR) path where inference code is stored. If you are using your
     *        own custom algorithm instead of an algorithm provided by Amazon SageMaker, the inference code must meet
     *        Amazon SageMaker requirements. Amazon SageMaker supports both <code>registry/repository[:tag]</code> and
     *        <code>registry/repository[@digest]</code> image path formats. For more information, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html">Using Your Own Algorithms with
     *        Amazon SageMaker</a>
     */

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * <p>
     * The Amazon EC2 Container Registry (Amazon ECR) path where inference code is stored. If you are using your own
     * custom algorithm instead of an algorithm provided by Amazon SageMaker, the inference code must meet Amazon
     * SageMaker requirements. Amazon SageMaker supports both <code>registry/repository[:tag]</code> and
     * <code>registry/repository[@digest]</code> image path formats. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html">Using Your Own Algorithms with Amazon
     * SageMaker</a>
     * </p>
     * 
     * @return The Amazon EC2 Container Registry (Amazon ECR) path where inference code is stored. If you are using your
     *         own custom algorithm instead of an algorithm provided by Amazon SageMaker, the inference code must meet
     *         Amazon SageMaker requirements. Amazon SageMaker supports both <code>registry/repository[:tag]</code> and
     *         <code>registry/repository[@digest]</code> image path formats. For more information, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html">Using Your Own Algorithms
     *         with Amazon SageMaker</a>
     */

    public String getImage() {
        return this.image;
    }

    /**
     * <p>
     * The Amazon EC2 Container Registry (Amazon ECR) path where inference code is stored. If you are using your own
     * custom algorithm instead of an algorithm provided by Amazon SageMaker, the inference code must meet Amazon
     * SageMaker requirements. Amazon SageMaker supports both <code>registry/repository[:tag]</code> and
     * <code>registry/repository[@digest]</code> image path formats. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html">Using Your Own Algorithms with Amazon
     * SageMaker</a>
     * </p>
     * 
     * @param image
     *        The Amazon EC2 Container Registry (Amazon ECR) path where inference code is stored. If you are using your
     *        own custom algorithm instead of an algorithm provided by Amazon SageMaker, the inference code must meet
     *        Amazon SageMaker requirements. Amazon SageMaker supports both <code>registry/repository[:tag]</code> and
     *        <code>registry/repository[@digest]</code> image path formats. For more information, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/your-algorithms.html">Using Your Own Algorithms with
     *        Amazon SageMaker</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withImage(String image) {
        setImage(image);
        return this;
    }

    /**
     * <p>
     * The S3 path where the model artifacts, which result from model training, are stored. This path must point to a
     * single gzip compressed tar archive (.tar.gz suffix).
     * </p>
     * <p>
     * If you provide a value for this parameter, Amazon SageMaker uses AWS Security Token Service to download model
     * artifacts from the S3 path you provide. AWS STS is activated in your IAM user account by default. If you
     * previously deactivated AWS STS for a region, you need to reactivate AWS STS for that region. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">Activating and
     * Deactivating AWS STS in an AWS Region</a> in the <i>AWS Identity and Access Management User Guide</i>.
     * </p>
     * 
     * @param modelDataUrl
     *        The S3 path where the model artifacts, which result from model training, are stored. This path must point
     *        to a single gzip compressed tar archive (.tar.gz suffix). </p>
     *        <p>
     *        If you provide a value for this parameter, Amazon SageMaker uses AWS Security Token Service to download
     *        model artifacts from the S3 path you provide. AWS STS is activated in your IAM user account by default. If
     *        you previously deactivated AWS STS for a region, you need to reactivate AWS STS for that region. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">Activating
     *        and Deactivating AWS STS in an AWS Region</a> in the <i>AWS Identity and Access Management User Guide</i>.
     */

    public void setModelDataUrl(String modelDataUrl) {
        this.modelDataUrl = modelDataUrl;
    }

    /**
     * <p>
     * The S3 path where the model artifacts, which result from model training, are stored. This path must point to a
     * single gzip compressed tar archive (.tar.gz suffix).
     * </p>
     * <p>
     * If you provide a value for this parameter, Amazon SageMaker uses AWS Security Token Service to download model
     * artifacts from the S3 path you provide. AWS STS is activated in your IAM user account by default. If you
     * previously deactivated AWS STS for a region, you need to reactivate AWS STS for that region. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">Activating and
     * Deactivating AWS STS in an AWS Region</a> in the <i>AWS Identity and Access Management User Guide</i>.
     * </p>
     * 
     * @return The S3 path where the model artifacts, which result from model training, are stored. This path must point
     *         to a single gzip compressed tar archive (.tar.gz suffix). </p>
     *         <p>
     *         If you provide a value for this parameter, Amazon SageMaker uses AWS Security Token Service to download
     *         model artifacts from the S3 path you provide. AWS STS is activated in your IAM user account by default.
     *         If you previously deactivated AWS STS for a region, you need to reactivate AWS STS for that region. For
     *         more information, see <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">Activating
     *         and Deactivating AWS STS in an AWS Region</a> in the <i>AWS Identity and Access Management User
     *         Guide</i>.
     */

    public String getModelDataUrl() {
        return this.modelDataUrl;
    }

    /**
     * <p>
     * The S3 path where the model artifacts, which result from model training, are stored. This path must point to a
     * single gzip compressed tar archive (.tar.gz suffix).
     * </p>
     * <p>
     * If you provide a value for this parameter, Amazon SageMaker uses AWS Security Token Service to download model
     * artifacts from the S3 path you provide. AWS STS is activated in your IAM user account by default. If you
     * previously deactivated AWS STS for a region, you need to reactivate AWS STS for that region. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">Activating and
     * Deactivating AWS STS in an AWS Region</a> in the <i>AWS Identity and Access Management User Guide</i>.
     * </p>
     * 
     * @param modelDataUrl
     *        The S3 path where the model artifacts, which result from model training, are stored. This path must point
     *        to a single gzip compressed tar archive (.tar.gz suffix). </p>
     *        <p>
     *        If you provide a value for this parameter, Amazon SageMaker uses AWS Security Token Service to download
     *        model artifacts from the S3 path you provide. AWS STS is activated in your IAM user account by default. If
     *        you previously deactivated AWS STS for a region, you need to reactivate AWS STS for that region. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">Activating
     *        and Deactivating AWS STS in an AWS Region</a> in the <i>AWS Identity and Access Management User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withModelDataUrl(String modelDataUrl) {
        setModelDataUrl(modelDataUrl);
        return this;
    }

    /**
     * <p>
     * The environment variables to set in the Docker container. Each key and value in the <code>Environment</code>
     * string to string map can have length of up to 1024. We support up to 16 entries in the map.
     * </p>
     * 
     * @return The environment variables to set in the Docker container. Each key and value in the
     *         <code>Environment</code> string to string map can have length of up to 1024. We support up to 16 entries
     *         in the map.
     */

    public java.util.Map<String, String> getEnvironment() {
        return environment;
    }

    /**
     * <p>
     * The environment variables to set in the Docker container. Each key and value in the <code>Environment</code>
     * string to string map can have length of up to 1024. We support up to 16 entries in the map.
     * </p>
     * 
     * @param environment
     *        The environment variables to set in the Docker container. Each key and value in the
     *        <code>Environment</code> string to string map can have length of up to 1024. We support up to 16 entries
     *        in the map.
     */

    public void setEnvironment(java.util.Map<String, String> environment) {
        this.environment = environment;
    }

    /**
     * <p>
     * The environment variables to set in the Docker container. Each key and value in the <code>Environment</code>
     * string to string map can have length of up to 1024. We support up to 16 entries in the map.
     * </p>
     * 
     * @param environment
     *        The environment variables to set in the Docker container. Each key and value in the
     *        <code>Environment</code> string to string map can have length of up to 1024. We support up to 16 entries
     *        in the map.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withEnvironment(java.util.Map<String, String> environment) {
        setEnvironment(environment);
        return this;
    }

    public ContainerDefinition addEnvironmentEntry(String key, String value) {
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

    public ContainerDefinition clearEnvironmentEntries() {
        this.environment = null;
        return this;
    }

    /**
     * <p>
     * The name of the model package to use to create the model.
     * </p>
     * 
     * @param modelPackageName
     *        The name of the model package to use to create the model.
     */

    public void setModelPackageName(String modelPackageName) {
        this.modelPackageName = modelPackageName;
    }

    /**
     * <p>
     * The name of the model package to use to create the model.
     * </p>
     * 
     * @return The name of the model package to use to create the model.
     */

    public String getModelPackageName() {
        return this.modelPackageName;
    }

    /**
     * <p>
     * The name of the model package to use to create the model.
     * </p>
     * 
     * @param modelPackageName
     *        The name of the model package to use to create the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerDefinition withModelPackageName(String modelPackageName) {
        setModelPackageName(modelPackageName);
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
        if (getModelDataUrl() != null)
            sb.append("ModelDataUrl: ").append(getModelDataUrl()).append(",");
        if (getEnvironment() != null)
            sb.append("Environment: ").append(getEnvironment()).append(",");
        if (getModelPackageName() != null)
            sb.append("ModelPackageName: ").append(getModelPackageName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerDefinition == false)
            return false;
        ContainerDefinition other = (ContainerDefinition) obj;
        if (other.getContainerHostname() == null ^ this.getContainerHostname() == null)
            return false;
        if (other.getContainerHostname() != null && other.getContainerHostname().equals(this.getContainerHostname()) == false)
            return false;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getModelDataUrl() == null ^ this.getModelDataUrl() == null)
            return false;
        if (other.getModelDataUrl() != null && other.getModelDataUrl().equals(this.getModelDataUrl()) == false)
            return false;
        if (other.getEnvironment() == null ^ this.getEnvironment() == null)
            return false;
        if (other.getEnvironment() != null && other.getEnvironment().equals(this.getEnvironment()) == false)
            return false;
        if (other.getModelPackageName() == null ^ this.getModelPackageName() == null)
            return false;
        if (other.getModelPackageName() != null && other.getModelPackageName().equals(this.getModelPackageName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerHostname() == null) ? 0 : getContainerHostname().hashCode());
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getModelDataUrl() == null) ? 0 : getModelDataUrl().hashCode());
        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        hashCode = prime * hashCode + ((getModelPackageName() == null) ? 0 : getModelPackageName().hashCode());
        return hashCode;
    }

    @Override
    public ContainerDefinition clone() {
        try {
            return (ContainerDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ContainerDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
