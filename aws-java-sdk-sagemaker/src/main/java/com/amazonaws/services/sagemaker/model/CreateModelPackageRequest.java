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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateModelPackage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateModelPackageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the model package. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9, and -
     * (hyphen).
     * </p>
     */
    private String modelPackageName;
    /**
     * <p>
     * A description of the model package.
     * </p>
     */
    private String modelPackageDescription;
    /**
     * <p>
     * Specifies details about inference jobs that can be run with models based on this model package, including the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The Amazon ECR paths of containers that contain the inference code and model artifacts.
     * </p>
     * </li>
     * <li>
     * <p>
     * The instance types that the model package supports for transform jobs and real-time endpoints used for inference.
     * </p>
     * </li>
     * <li>
     * <p>
     * The input and output content formats that the model package supports for inference.
     * </p>
     * </li>
     * </ul>
     */
    private InferenceSpecification inferenceSpecification;
    /**
     * <p>
     * Specifies configurations for one or more transform jobs that Amazon SageMaker runs to test the model package.
     * </p>
     */
    private ModelPackageValidationSpecification validationSpecification;
    /**
     * <p>
     * Details about the algorithm that was used to create the model package.
     * </p>
     */
    private SourceAlgorithmSpecification sourceAlgorithmSpecification;
    /**
     * <p>
     * Whether to certify the model package for listing on AWS Marketplace.
     * </p>
     */
    private Boolean certifyForMarketplace;

    /**
     * <p>
     * The name of the model package. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9, and -
     * (hyphen).
     * </p>
     * 
     * @param modelPackageName
     *        The name of the model package. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9,
     *        and - (hyphen).
     */

    public void setModelPackageName(String modelPackageName) {
        this.modelPackageName = modelPackageName;
    }

    /**
     * <p>
     * The name of the model package. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9, and -
     * (hyphen).
     * </p>
     * 
     * @return The name of the model package. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9,
     *         and - (hyphen).
     */

    public String getModelPackageName() {
        return this.modelPackageName;
    }

    /**
     * <p>
     * The name of the model package. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9, and -
     * (hyphen).
     * </p>
     * 
     * @param modelPackageName
     *        The name of the model package. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9,
     *        and - (hyphen).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelPackageRequest withModelPackageName(String modelPackageName) {
        setModelPackageName(modelPackageName);
        return this;
    }

    /**
     * <p>
     * A description of the model package.
     * </p>
     * 
     * @param modelPackageDescription
     *        A description of the model package.
     */

    public void setModelPackageDescription(String modelPackageDescription) {
        this.modelPackageDescription = modelPackageDescription;
    }

    /**
     * <p>
     * A description of the model package.
     * </p>
     * 
     * @return A description of the model package.
     */

    public String getModelPackageDescription() {
        return this.modelPackageDescription;
    }

    /**
     * <p>
     * A description of the model package.
     * </p>
     * 
     * @param modelPackageDescription
     *        A description of the model package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelPackageRequest withModelPackageDescription(String modelPackageDescription) {
        setModelPackageDescription(modelPackageDescription);
        return this;
    }

    /**
     * <p>
     * Specifies details about inference jobs that can be run with models based on this model package, including the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The Amazon ECR paths of containers that contain the inference code and model artifacts.
     * </p>
     * </li>
     * <li>
     * <p>
     * The instance types that the model package supports for transform jobs and real-time endpoints used for inference.
     * </p>
     * </li>
     * <li>
     * <p>
     * The input and output content formats that the model package supports for inference.
     * </p>
     * </li>
     * </ul>
     * 
     * @param inferenceSpecification
     *        Specifies details about inference jobs that can be run with models based on this model package, including
     *        the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The Amazon ECR paths of containers that contain the inference code and model artifacts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The instance types that the model package supports for transform jobs and real-time endpoints used for
     *        inference.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The input and output content formats that the model package supports for inference.
     *        </p>
     *        </li>
     */

    public void setInferenceSpecification(InferenceSpecification inferenceSpecification) {
        this.inferenceSpecification = inferenceSpecification;
    }

    /**
     * <p>
     * Specifies details about inference jobs that can be run with models based on this model package, including the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The Amazon ECR paths of containers that contain the inference code and model artifacts.
     * </p>
     * </li>
     * <li>
     * <p>
     * The instance types that the model package supports for transform jobs and real-time endpoints used for inference.
     * </p>
     * </li>
     * <li>
     * <p>
     * The input and output content formats that the model package supports for inference.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies details about inference jobs that can be run with models based on this model package, including
     *         the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The Amazon ECR paths of containers that contain the inference code and model artifacts.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The instance types that the model package supports for transform jobs and real-time endpoints used for
     *         inference.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The input and output content formats that the model package supports for inference.
     *         </p>
     *         </li>
     */

    public InferenceSpecification getInferenceSpecification() {
        return this.inferenceSpecification;
    }

    /**
     * <p>
     * Specifies details about inference jobs that can be run with models based on this model package, including the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The Amazon ECR paths of containers that contain the inference code and model artifacts.
     * </p>
     * </li>
     * <li>
     * <p>
     * The instance types that the model package supports for transform jobs and real-time endpoints used for inference.
     * </p>
     * </li>
     * <li>
     * <p>
     * The input and output content formats that the model package supports for inference.
     * </p>
     * </li>
     * </ul>
     * 
     * @param inferenceSpecification
     *        Specifies details about inference jobs that can be run with models based on this model package, including
     *        the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The Amazon ECR paths of containers that contain the inference code and model artifacts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The instance types that the model package supports for transform jobs and real-time endpoints used for
     *        inference.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The input and output content formats that the model package supports for inference.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelPackageRequest withInferenceSpecification(InferenceSpecification inferenceSpecification) {
        setInferenceSpecification(inferenceSpecification);
        return this;
    }

    /**
     * <p>
     * Specifies configurations for one or more transform jobs that Amazon SageMaker runs to test the model package.
     * </p>
     * 
     * @param validationSpecification
     *        Specifies configurations for one or more transform jobs that Amazon SageMaker runs to test the model
     *        package.
     */

    public void setValidationSpecification(ModelPackageValidationSpecification validationSpecification) {
        this.validationSpecification = validationSpecification;
    }

    /**
     * <p>
     * Specifies configurations for one or more transform jobs that Amazon SageMaker runs to test the model package.
     * </p>
     * 
     * @return Specifies configurations for one or more transform jobs that Amazon SageMaker runs to test the model
     *         package.
     */

    public ModelPackageValidationSpecification getValidationSpecification() {
        return this.validationSpecification;
    }

    /**
     * <p>
     * Specifies configurations for one or more transform jobs that Amazon SageMaker runs to test the model package.
     * </p>
     * 
     * @param validationSpecification
     *        Specifies configurations for one or more transform jobs that Amazon SageMaker runs to test the model
     *        package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelPackageRequest withValidationSpecification(ModelPackageValidationSpecification validationSpecification) {
        setValidationSpecification(validationSpecification);
        return this;
    }

    /**
     * <p>
     * Details about the algorithm that was used to create the model package.
     * </p>
     * 
     * @param sourceAlgorithmSpecification
     *        Details about the algorithm that was used to create the model package.
     */

    public void setSourceAlgorithmSpecification(SourceAlgorithmSpecification sourceAlgorithmSpecification) {
        this.sourceAlgorithmSpecification = sourceAlgorithmSpecification;
    }

    /**
     * <p>
     * Details about the algorithm that was used to create the model package.
     * </p>
     * 
     * @return Details about the algorithm that was used to create the model package.
     */

    public SourceAlgorithmSpecification getSourceAlgorithmSpecification() {
        return this.sourceAlgorithmSpecification;
    }

    /**
     * <p>
     * Details about the algorithm that was used to create the model package.
     * </p>
     * 
     * @param sourceAlgorithmSpecification
     *        Details about the algorithm that was used to create the model package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelPackageRequest withSourceAlgorithmSpecification(SourceAlgorithmSpecification sourceAlgorithmSpecification) {
        setSourceAlgorithmSpecification(sourceAlgorithmSpecification);
        return this;
    }

    /**
     * <p>
     * Whether to certify the model package for listing on AWS Marketplace.
     * </p>
     * 
     * @param certifyForMarketplace
     *        Whether to certify the model package for listing on AWS Marketplace.
     */

    public void setCertifyForMarketplace(Boolean certifyForMarketplace) {
        this.certifyForMarketplace = certifyForMarketplace;
    }

    /**
     * <p>
     * Whether to certify the model package for listing on AWS Marketplace.
     * </p>
     * 
     * @return Whether to certify the model package for listing on AWS Marketplace.
     */

    public Boolean getCertifyForMarketplace() {
        return this.certifyForMarketplace;
    }

    /**
     * <p>
     * Whether to certify the model package for listing on AWS Marketplace.
     * </p>
     * 
     * @param certifyForMarketplace
     *        Whether to certify the model package for listing on AWS Marketplace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelPackageRequest withCertifyForMarketplace(Boolean certifyForMarketplace) {
        setCertifyForMarketplace(certifyForMarketplace);
        return this;
    }

    /**
     * <p>
     * Whether to certify the model package for listing on AWS Marketplace.
     * </p>
     * 
     * @return Whether to certify the model package for listing on AWS Marketplace.
     */

    public Boolean isCertifyForMarketplace() {
        return this.certifyForMarketplace;
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
        if (getModelPackageName() != null)
            sb.append("ModelPackageName: ").append(getModelPackageName()).append(",");
        if (getModelPackageDescription() != null)
            sb.append("ModelPackageDescription: ").append(getModelPackageDescription()).append(",");
        if (getInferenceSpecification() != null)
            sb.append("InferenceSpecification: ").append(getInferenceSpecification()).append(",");
        if (getValidationSpecification() != null)
            sb.append("ValidationSpecification: ").append(getValidationSpecification()).append(",");
        if (getSourceAlgorithmSpecification() != null)
            sb.append("SourceAlgorithmSpecification: ").append(getSourceAlgorithmSpecification()).append(",");
        if (getCertifyForMarketplace() != null)
            sb.append("CertifyForMarketplace: ").append(getCertifyForMarketplace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateModelPackageRequest == false)
            return false;
        CreateModelPackageRequest other = (CreateModelPackageRequest) obj;
        if (other.getModelPackageName() == null ^ this.getModelPackageName() == null)
            return false;
        if (other.getModelPackageName() != null && other.getModelPackageName().equals(this.getModelPackageName()) == false)
            return false;
        if (other.getModelPackageDescription() == null ^ this.getModelPackageDescription() == null)
            return false;
        if (other.getModelPackageDescription() != null && other.getModelPackageDescription().equals(this.getModelPackageDescription()) == false)
            return false;
        if (other.getInferenceSpecification() == null ^ this.getInferenceSpecification() == null)
            return false;
        if (other.getInferenceSpecification() != null && other.getInferenceSpecification().equals(this.getInferenceSpecification()) == false)
            return false;
        if (other.getValidationSpecification() == null ^ this.getValidationSpecification() == null)
            return false;
        if (other.getValidationSpecification() != null && other.getValidationSpecification().equals(this.getValidationSpecification()) == false)
            return false;
        if (other.getSourceAlgorithmSpecification() == null ^ this.getSourceAlgorithmSpecification() == null)
            return false;
        if (other.getSourceAlgorithmSpecification() != null && other.getSourceAlgorithmSpecification().equals(this.getSourceAlgorithmSpecification()) == false)
            return false;
        if (other.getCertifyForMarketplace() == null ^ this.getCertifyForMarketplace() == null)
            return false;
        if (other.getCertifyForMarketplace() != null && other.getCertifyForMarketplace().equals(this.getCertifyForMarketplace()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelPackageName() == null) ? 0 : getModelPackageName().hashCode());
        hashCode = prime * hashCode + ((getModelPackageDescription() == null) ? 0 : getModelPackageDescription().hashCode());
        hashCode = prime * hashCode + ((getInferenceSpecification() == null) ? 0 : getInferenceSpecification().hashCode());
        hashCode = prime * hashCode + ((getValidationSpecification() == null) ? 0 : getValidationSpecification().hashCode());
        hashCode = prime * hashCode + ((getSourceAlgorithmSpecification() == null) ? 0 : getSourceAlgorithmSpecification().hashCode());
        hashCode = prime * hashCode + ((getCertifyForMarketplace() == null) ? 0 : getCertifyForMarketplace().hashCode());
        return hashCode;
    }

    @Override
    public CreateModelPackageRequest clone() {
        return (CreateModelPackageRequest) super.clone();
    }

}
