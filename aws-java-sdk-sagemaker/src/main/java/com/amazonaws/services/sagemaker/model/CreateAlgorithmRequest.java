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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateAlgorithm" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAlgorithmRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the algorithm.
     * </p>
     */
    private String algorithmName;
    /**
     * <p>
     * A description of the algorithm.
     * </p>
     */
    private String algorithmDescription;
    /**
     * <p>
     * Specifies details about training jobs run by this algorithm, including the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The Amazon ECR path of the container and the version digest of the algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * The hyperparameters that the algorithm supports.
     * </p>
     * </li>
     * <li>
     * <p>
     * The instance types that the algorithm supports for training.
     * </p>
     * </li>
     * <li>
     * <p>
     * Whether the algorithm supports distributed training.
     * </p>
     * </li>
     * <li>
     * <p>
     * The metrics that the algorithm emits to Amazon CloudWatch.
     * </p>
     * </li>
     * <li>
     * <p>
     * Which metrics that the algorithm emits can be used as the objective metric for hyperparameter tuning jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * The input channels that the algorithm supports for training data. For example, an algorithm might support
     * <code>train</code>, <code>validation</code>, and <code>test</code> channels.
     * </p>
     * </li>
     * </ul>
     */
    private TrainingSpecification trainingSpecification;
    /**
     * <p>
     * Specifies details about inference jobs that the algorithm runs, including the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The Amazon ECR paths of containers that contain the inference code and model artifacts.
     * </p>
     * </li>
     * <li>
     * <p>
     * The instance types that the algorithm supports for transform jobs and real-time endpoints used for inference.
     * </p>
     * </li>
     * <li>
     * <p>
     * The input and output content formats that the algorithm supports for inference.
     * </p>
     * </li>
     * </ul>
     */
    private InferenceSpecification inferenceSpecification;
    /**
     * <p>
     * Specifies configurations for one or more training jobs and that Amazon SageMaker runs to test the algorithm's
     * training code and, optionally, one or more batch transform jobs that Amazon SageMaker runs to test the
     * algorithm's inference code.
     * </p>
     */
    private AlgorithmValidationSpecification validationSpecification;
    /**
     * <p>
     * Whether to certify the algorithm so that it can be listed in AWS Marketplace.
     * </p>
     */
    private Boolean certifyForMarketplace;

    /**
     * <p>
     * The name of the algorithm.
     * </p>
     * 
     * @param algorithmName
     *        The name of the algorithm.
     */

    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }

    /**
     * <p>
     * The name of the algorithm.
     * </p>
     * 
     * @return The name of the algorithm.
     */

    public String getAlgorithmName() {
        return this.algorithmName;
    }

    /**
     * <p>
     * The name of the algorithm.
     * </p>
     * 
     * @param algorithmName
     *        The name of the algorithm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAlgorithmRequest withAlgorithmName(String algorithmName) {
        setAlgorithmName(algorithmName);
        return this;
    }

    /**
     * <p>
     * A description of the algorithm.
     * </p>
     * 
     * @param algorithmDescription
     *        A description of the algorithm.
     */

    public void setAlgorithmDescription(String algorithmDescription) {
        this.algorithmDescription = algorithmDescription;
    }

    /**
     * <p>
     * A description of the algorithm.
     * </p>
     * 
     * @return A description of the algorithm.
     */

    public String getAlgorithmDescription() {
        return this.algorithmDescription;
    }

    /**
     * <p>
     * A description of the algorithm.
     * </p>
     * 
     * @param algorithmDescription
     *        A description of the algorithm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAlgorithmRequest withAlgorithmDescription(String algorithmDescription) {
        setAlgorithmDescription(algorithmDescription);
        return this;
    }

    /**
     * <p>
     * Specifies details about training jobs run by this algorithm, including the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The Amazon ECR path of the container and the version digest of the algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * The hyperparameters that the algorithm supports.
     * </p>
     * </li>
     * <li>
     * <p>
     * The instance types that the algorithm supports for training.
     * </p>
     * </li>
     * <li>
     * <p>
     * Whether the algorithm supports distributed training.
     * </p>
     * </li>
     * <li>
     * <p>
     * The metrics that the algorithm emits to Amazon CloudWatch.
     * </p>
     * </li>
     * <li>
     * <p>
     * Which metrics that the algorithm emits can be used as the objective metric for hyperparameter tuning jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * The input channels that the algorithm supports for training data. For example, an algorithm might support
     * <code>train</code>, <code>validation</code>, and <code>test</code> channels.
     * </p>
     * </li>
     * </ul>
     * 
     * @param trainingSpecification
     *        Specifies details about training jobs run by this algorithm, including the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The Amazon ECR path of the container and the version digest of the algorithm.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The hyperparameters that the algorithm supports.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The instance types that the algorithm supports for training.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Whether the algorithm supports distributed training.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The metrics that the algorithm emits to Amazon CloudWatch.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Which metrics that the algorithm emits can be used as the objective metric for hyperparameter tuning jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The input channels that the algorithm supports for training data. For example, an algorithm might support
     *        <code>train</code>, <code>validation</code>, and <code>test</code> channels.
     *        </p>
     *        </li>
     */

    public void setTrainingSpecification(TrainingSpecification trainingSpecification) {
        this.trainingSpecification = trainingSpecification;
    }

    /**
     * <p>
     * Specifies details about training jobs run by this algorithm, including the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The Amazon ECR path of the container and the version digest of the algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * The hyperparameters that the algorithm supports.
     * </p>
     * </li>
     * <li>
     * <p>
     * The instance types that the algorithm supports for training.
     * </p>
     * </li>
     * <li>
     * <p>
     * Whether the algorithm supports distributed training.
     * </p>
     * </li>
     * <li>
     * <p>
     * The metrics that the algorithm emits to Amazon CloudWatch.
     * </p>
     * </li>
     * <li>
     * <p>
     * Which metrics that the algorithm emits can be used as the objective metric for hyperparameter tuning jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * The input channels that the algorithm supports for training data. For example, an algorithm might support
     * <code>train</code>, <code>validation</code>, and <code>test</code> channels.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies details about training jobs run by this algorithm, including the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The Amazon ECR path of the container and the version digest of the algorithm.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The hyperparameters that the algorithm supports.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The instance types that the algorithm supports for training.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Whether the algorithm supports distributed training.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The metrics that the algorithm emits to Amazon CloudWatch.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Which metrics that the algorithm emits can be used as the objective metric for hyperparameter tuning
     *         jobs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The input channels that the algorithm supports for training data. For example, an algorithm might support
     *         <code>train</code>, <code>validation</code>, and <code>test</code> channels.
     *         </p>
     *         </li>
     */

    public TrainingSpecification getTrainingSpecification() {
        return this.trainingSpecification;
    }

    /**
     * <p>
     * Specifies details about training jobs run by this algorithm, including the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The Amazon ECR path of the container and the version digest of the algorithm.
     * </p>
     * </li>
     * <li>
     * <p>
     * The hyperparameters that the algorithm supports.
     * </p>
     * </li>
     * <li>
     * <p>
     * The instance types that the algorithm supports for training.
     * </p>
     * </li>
     * <li>
     * <p>
     * Whether the algorithm supports distributed training.
     * </p>
     * </li>
     * <li>
     * <p>
     * The metrics that the algorithm emits to Amazon CloudWatch.
     * </p>
     * </li>
     * <li>
     * <p>
     * Which metrics that the algorithm emits can be used as the objective metric for hyperparameter tuning jobs.
     * </p>
     * </li>
     * <li>
     * <p>
     * The input channels that the algorithm supports for training data. For example, an algorithm might support
     * <code>train</code>, <code>validation</code>, and <code>test</code> channels.
     * </p>
     * </li>
     * </ul>
     * 
     * @param trainingSpecification
     *        Specifies details about training jobs run by this algorithm, including the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The Amazon ECR path of the container and the version digest of the algorithm.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The hyperparameters that the algorithm supports.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The instance types that the algorithm supports for training.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Whether the algorithm supports distributed training.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The metrics that the algorithm emits to Amazon CloudWatch.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Which metrics that the algorithm emits can be used as the objective metric for hyperparameter tuning jobs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The input channels that the algorithm supports for training data. For example, an algorithm might support
     *        <code>train</code>, <code>validation</code>, and <code>test</code> channels.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAlgorithmRequest withTrainingSpecification(TrainingSpecification trainingSpecification) {
        setTrainingSpecification(trainingSpecification);
        return this;
    }

    /**
     * <p>
     * Specifies details about inference jobs that the algorithm runs, including the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The Amazon ECR paths of containers that contain the inference code and model artifacts.
     * </p>
     * </li>
     * <li>
     * <p>
     * The instance types that the algorithm supports for transform jobs and real-time endpoints used for inference.
     * </p>
     * </li>
     * <li>
     * <p>
     * The input and output content formats that the algorithm supports for inference.
     * </p>
     * </li>
     * </ul>
     * 
     * @param inferenceSpecification
     *        Specifies details about inference jobs that the algorithm runs, including the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The Amazon ECR paths of containers that contain the inference code and model artifacts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The instance types that the algorithm supports for transform jobs and real-time endpoints used for
     *        inference.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The input and output content formats that the algorithm supports for inference.
     *        </p>
     *        </li>
     */

    public void setInferenceSpecification(InferenceSpecification inferenceSpecification) {
        this.inferenceSpecification = inferenceSpecification;
    }

    /**
     * <p>
     * Specifies details about inference jobs that the algorithm runs, including the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The Amazon ECR paths of containers that contain the inference code and model artifacts.
     * </p>
     * </li>
     * <li>
     * <p>
     * The instance types that the algorithm supports for transform jobs and real-time endpoints used for inference.
     * </p>
     * </li>
     * <li>
     * <p>
     * The input and output content formats that the algorithm supports for inference.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies details about inference jobs that the algorithm runs, including the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The Amazon ECR paths of containers that contain the inference code and model artifacts.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The instance types that the algorithm supports for transform jobs and real-time endpoints used for
     *         inference.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The input and output content formats that the algorithm supports for inference.
     *         </p>
     *         </li>
     */

    public InferenceSpecification getInferenceSpecification() {
        return this.inferenceSpecification;
    }

    /**
     * <p>
     * Specifies details about inference jobs that the algorithm runs, including the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The Amazon ECR paths of containers that contain the inference code and model artifacts.
     * </p>
     * </li>
     * <li>
     * <p>
     * The instance types that the algorithm supports for transform jobs and real-time endpoints used for inference.
     * </p>
     * </li>
     * <li>
     * <p>
     * The input and output content formats that the algorithm supports for inference.
     * </p>
     * </li>
     * </ul>
     * 
     * @param inferenceSpecification
     *        Specifies details about inference jobs that the algorithm runs, including the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The Amazon ECR paths of containers that contain the inference code and model artifacts.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The instance types that the algorithm supports for transform jobs and real-time endpoints used for
     *        inference.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The input and output content formats that the algorithm supports for inference.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAlgorithmRequest withInferenceSpecification(InferenceSpecification inferenceSpecification) {
        setInferenceSpecification(inferenceSpecification);
        return this;
    }

    /**
     * <p>
     * Specifies configurations for one or more training jobs and that Amazon SageMaker runs to test the algorithm's
     * training code and, optionally, one or more batch transform jobs that Amazon SageMaker runs to test the
     * algorithm's inference code.
     * </p>
     * 
     * @param validationSpecification
     *        Specifies configurations for one or more training jobs and that Amazon SageMaker runs to test the
     *        algorithm's training code and, optionally, one or more batch transform jobs that Amazon SageMaker runs to
     *        test the algorithm's inference code.
     */

    public void setValidationSpecification(AlgorithmValidationSpecification validationSpecification) {
        this.validationSpecification = validationSpecification;
    }

    /**
     * <p>
     * Specifies configurations for one or more training jobs and that Amazon SageMaker runs to test the algorithm's
     * training code and, optionally, one or more batch transform jobs that Amazon SageMaker runs to test the
     * algorithm's inference code.
     * </p>
     * 
     * @return Specifies configurations for one or more training jobs and that Amazon SageMaker runs to test the
     *         algorithm's training code and, optionally, one or more batch transform jobs that Amazon SageMaker runs to
     *         test the algorithm's inference code.
     */

    public AlgorithmValidationSpecification getValidationSpecification() {
        return this.validationSpecification;
    }

    /**
     * <p>
     * Specifies configurations for one or more training jobs and that Amazon SageMaker runs to test the algorithm's
     * training code and, optionally, one or more batch transform jobs that Amazon SageMaker runs to test the
     * algorithm's inference code.
     * </p>
     * 
     * @param validationSpecification
     *        Specifies configurations for one or more training jobs and that Amazon SageMaker runs to test the
     *        algorithm's training code and, optionally, one or more batch transform jobs that Amazon SageMaker runs to
     *        test the algorithm's inference code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAlgorithmRequest withValidationSpecification(AlgorithmValidationSpecification validationSpecification) {
        setValidationSpecification(validationSpecification);
        return this;
    }

    /**
     * <p>
     * Whether to certify the algorithm so that it can be listed in AWS Marketplace.
     * </p>
     * 
     * @param certifyForMarketplace
     *        Whether to certify the algorithm so that it can be listed in AWS Marketplace.
     */

    public void setCertifyForMarketplace(Boolean certifyForMarketplace) {
        this.certifyForMarketplace = certifyForMarketplace;
    }

    /**
     * <p>
     * Whether to certify the algorithm so that it can be listed in AWS Marketplace.
     * </p>
     * 
     * @return Whether to certify the algorithm so that it can be listed in AWS Marketplace.
     */

    public Boolean getCertifyForMarketplace() {
        return this.certifyForMarketplace;
    }

    /**
     * <p>
     * Whether to certify the algorithm so that it can be listed in AWS Marketplace.
     * </p>
     * 
     * @param certifyForMarketplace
     *        Whether to certify the algorithm so that it can be listed in AWS Marketplace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAlgorithmRequest withCertifyForMarketplace(Boolean certifyForMarketplace) {
        setCertifyForMarketplace(certifyForMarketplace);
        return this;
    }

    /**
     * <p>
     * Whether to certify the algorithm so that it can be listed in AWS Marketplace.
     * </p>
     * 
     * @return Whether to certify the algorithm so that it can be listed in AWS Marketplace.
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
        if (getAlgorithmName() != null)
            sb.append("AlgorithmName: ").append(getAlgorithmName()).append(",");
        if (getAlgorithmDescription() != null)
            sb.append("AlgorithmDescription: ").append(getAlgorithmDescription()).append(",");
        if (getTrainingSpecification() != null)
            sb.append("TrainingSpecification: ").append(getTrainingSpecification()).append(",");
        if (getInferenceSpecification() != null)
            sb.append("InferenceSpecification: ").append(getInferenceSpecification()).append(",");
        if (getValidationSpecification() != null)
            sb.append("ValidationSpecification: ").append(getValidationSpecification()).append(",");
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

        if (obj instanceof CreateAlgorithmRequest == false)
            return false;
        CreateAlgorithmRequest other = (CreateAlgorithmRequest) obj;
        if (other.getAlgorithmName() == null ^ this.getAlgorithmName() == null)
            return false;
        if (other.getAlgorithmName() != null && other.getAlgorithmName().equals(this.getAlgorithmName()) == false)
            return false;
        if (other.getAlgorithmDescription() == null ^ this.getAlgorithmDescription() == null)
            return false;
        if (other.getAlgorithmDescription() != null && other.getAlgorithmDescription().equals(this.getAlgorithmDescription()) == false)
            return false;
        if (other.getTrainingSpecification() == null ^ this.getTrainingSpecification() == null)
            return false;
        if (other.getTrainingSpecification() != null && other.getTrainingSpecification().equals(this.getTrainingSpecification()) == false)
            return false;
        if (other.getInferenceSpecification() == null ^ this.getInferenceSpecification() == null)
            return false;
        if (other.getInferenceSpecification() != null && other.getInferenceSpecification().equals(this.getInferenceSpecification()) == false)
            return false;
        if (other.getValidationSpecification() == null ^ this.getValidationSpecification() == null)
            return false;
        if (other.getValidationSpecification() != null && other.getValidationSpecification().equals(this.getValidationSpecification()) == false)
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

        hashCode = prime * hashCode + ((getAlgorithmName() == null) ? 0 : getAlgorithmName().hashCode());
        hashCode = prime * hashCode + ((getAlgorithmDescription() == null) ? 0 : getAlgorithmDescription().hashCode());
        hashCode = prime * hashCode + ((getTrainingSpecification() == null) ? 0 : getTrainingSpecification().hashCode());
        hashCode = prime * hashCode + ((getInferenceSpecification() == null) ? 0 : getInferenceSpecification().hashCode());
        hashCode = prime * hashCode + ((getValidationSpecification() == null) ? 0 : getValidationSpecification().hashCode());
        hashCode = prime * hashCode + ((getCertifyForMarketplace() == null) ? 0 : getCertifyForMarketplace().hashCode());
        return hashCode;
    }

    @Override
    public CreateAlgorithmRequest clone() {
        return (CreateAlgorithmRequest) super.clone();
    }

}
