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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeAlgorithm" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAlgorithmResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the algorithm being described.
     * </p>
     */
    private String algorithmName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm.
     * </p>
     */
    private String algorithmArn;
    /**
     * <p>
     * A brief summary about the algorithm.
     * </p>
     */
    private String algorithmDescription;
    /**
     * <p>
     * A timestamp specifying when the algorithm was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Details about training jobs run by this algorithm.
     * </p>
     */
    private TrainingSpecification trainingSpecification;
    /**
     * <p>
     * Details about inference jobs that the algorithm runs.
     * </p>
     */
    private InferenceSpecification inferenceSpecification;
    /**
     * <p>
     * Details about configurations for one or more training jobs that Amazon SageMaker runs to test the algorithm.
     * </p>
     */
    private AlgorithmValidationSpecification validationSpecification;
    /**
     * <p>
     * The current status of the algorithm.
     * </p>
     */
    private String algorithmStatus;
    /**
     * <p>
     * Details about the current status of the algorithm.
     * </p>
     */
    private AlgorithmStatusDetails algorithmStatusDetails;
    /**
     * <p>
     * The product identifier of the algorithm.
     * </p>
     */
    private String productId;
    /**
     * <p>
     * Whether the algorithm is certified to be listed in AWS Marketplace.
     * </p>
     */
    private Boolean certifyForMarketplace;

    /**
     * <p>
     * The name of the algorithm being described.
     * </p>
     * 
     * @param algorithmName
     *        The name of the algorithm being described.
     */

    public void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }

    /**
     * <p>
     * The name of the algorithm being described.
     * </p>
     * 
     * @return The name of the algorithm being described.
     */

    public String getAlgorithmName() {
        return this.algorithmName;
    }

    /**
     * <p>
     * The name of the algorithm being described.
     * </p>
     * 
     * @param algorithmName
     *        The name of the algorithm being described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlgorithmResult withAlgorithmName(String algorithmName) {
        setAlgorithmName(algorithmName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm.
     * </p>
     * 
     * @param algorithmArn
     *        The Amazon Resource Name (ARN) of the algorithm.
     */

    public void setAlgorithmArn(String algorithmArn) {
        this.algorithmArn = algorithmArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the algorithm.
     */

    public String getAlgorithmArn() {
        return this.algorithmArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm.
     * </p>
     * 
     * @param algorithmArn
     *        The Amazon Resource Name (ARN) of the algorithm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlgorithmResult withAlgorithmArn(String algorithmArn) {
        setAlgorithmArn(algorithmArn);
        return this;
    }

    /**
     * <p>
     * A brief summary about the algorithm.
     * </p>
     * 
     * @param algorithmDescription
     *        A brief summary about the algorithm.
     */

    public void setAlgorithmDescription(String algorithmDescription) {
        this.algorithmDescription = algorithmDescription;
    }

    /**
     * <p>
     * A brief summary about the algorithm.
     * </p>
     * 
     * @return A brief summary about the algorithm.
     */

    public String getAlgorithmDescription() {
        return this.algorithmDescription;
    }

    /**
     * <p>
     * A brief summary about the algorithm.
     * </p>
     * 
     * @param algorithmDescription
     *        A brief summary about the algorithm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlgorithmResult withAlgorithmDescription(String algorithmDescription) {
        setAlgorithmDescription(algorithmDescription);
        return this;
    }

    /**
     * <p>
     * A timestamp specifying when the algorithm was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp specifying when the algorithm was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp specifying when the algorithm was created.
     * </p>
     * 
     * @return A timestamp specifying when the algorithm was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A timestamp specifying when the algorithm was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp specifying when the algorithm was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlgorithmResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Details about training jobs run by this algorithm.
     * </p>
     * 
     * @param trainingSpecification
     *        Details about training jobs run by this algorithm.
     */

    public void setTrainingSpecification(TrainingSpecification trainingSpecification) {
        this.trainingSpecification = trainingSpecification;
    }

    /**
     * <p>
     * Details about training jobs run by this algorithm.
     * </p>
     * 
     * @return Details about training jobs run by this algorithm.
     */

    public TrainingSpecification getTrainingSpecification() {
        return this.trainingSpecification;
    }

    /**
     * <p>
     * Details about training jobs run by this algorithm.
     * </p>
     * 
     * @param trainingSpecification
     *        Details about training jobs run by this algorithm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlgorithmResult withTrainingSpecification(TrainingSpecification trainingSpecification) {
        setTrainingSpecification(trainingSpecification);
        return this;
    }

    /**
     * <p>
     * Details about inference jobs that the algorithm runs.
     * </p>
     * 
     * @param inferenceSpecification
     *        Details about inference jobs that the algorithm runs.
     */

    public void setInferenceSpecification(InferenceSpecification inferenceSpecification) {
        this.inferenceSpecification = inferenceSpecification;
    }

    /**
     * <p>
     * Details about inference jobs that the algorithm runs.
     * </p>
     * 
     * @return Details about inference jobs that the algorithm runs.
     */

    public InferenceSpecification getInferenceSpecification() {
        return this.inferenceSpecification;
    }

    /**
     * <p>
     * Details about inference jobs that the algorithm runs.
     * </p>
     * 
     * @param inferenceSpecification
     *        Details about inference jobs that the algorithm runs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlgorithmResult withInferenceSpecification(InferenceSpecification inferenceSpecification) {
        setInferenceSpecification(inferenceSpecification);
        return this;
    }

    /**
     * <p>
     * Details about configurations for one or more training jobs that Amazon SageMaker runs to test the algorithm.
     * </p>
     * 
     * @param validationSpecification
     *        Details about configurations for one or more training jobs that Amazon SageMaker runs to test the
     *        algorithm.
     */

    public void setValidationSpecification(AlgorithmValidationSpecification validationSpecification) {
        this.validationSpecification = validationSpecification;
    }

    /**
     * <p>
     * Details about configurations for one or more training jobs that Amazon SageMaker runs to test the algorithm.
     * </p>
     * 
     * @return Details about configurations for one or more training jobs that Amazon SageMaker runs to test the
     *         algorithm.
     */

    public AlgorithmValidationSpecification getValidationSpecification() {
        return this.validationSpecification;
    }

    /**
     * <p>
     * Details about configurations for one or more training jobs that Amazon SageMaker runs to test the algorithm.
     * </p>
     * 
     * @param validationSpecification
     *        Details about configurations for one or more training jobs that Amazon SageMaker runs to test the
     *        algorithm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlgorithmResult withValidationSpecification(AlgorithmValidationSpecification validationSpecification) {
        setValidationSpecification(validationSpecification);
        return this;
    }

    /**
     * <p>
     * The current status of the algorithm.
     * </p>
     * 
     * @param algorithmStatus
     *        The current status of the algorithm.
     * @see AlgorithmStatus
     */

    public void setAlgorithmStatus(String algorithmStatus) {
        this.algorithmStatus = algorithmStatus;
    }

    /**
     * <p>
     * The current status of the algorithm.
     * </p>
     * 
     * @return The current status of the algorithm.
     * @see AlgorithmStatus
     */

    public String getAlgorithmStatus() {
        return this.algorithmStatus;
    }

    /**
     * <p>
     * The current status of the algorithm.
     * </p>
     * 
     * @param algorithmStatus
     *        The current status of the algorithm.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlgorithmStatus
     */

    public DescribeAlgorithmResult withAlgorithmStatus(String algorithmStatus) {
        setAlgorithmStatus(algorithmStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the algorithm.
     * </p>
     * 
     * @param algorithmStatus
     *        The current status of the algorithm.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AlgorithmStatus
     */

    public DescribeAlgorithmResult withAlgorithmStatus(AlgorithmStatus algorithmStatus) {
        this.algorithmStatus = algorithmStatus.toString();
        return this;
    }

    /**
     * <p>
     * Details about the current status of the algorithm.
     * </p>
     * 
     * @param algorithmStatusDetails
     *        Details about the current status of the algorithm.
     */

    public void setAlgorithmStatusDetails(AlgorithmStatusDetails algorithmStatusDetails) {
        this.algorithmStatusDetails = algorithmStatusDetails;
    }

    /**
     * <p>
     * Details about the current status of the algorithm.
     * </p>
     * 
     * @return Details about the current status of the algorithm.
     */

    public AlgorithmStatusDetails getAlgorithmStatusDetails() {
        return this.algorithmStatusDetails;
    }

    /**
     * <p>
     * Details about the current status of the algorithm.
     * </p>
     * 
     * @param algorithmStatusDetails
     *        Details about the current status of the algorithm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlgorithmResult withAlgorithmStatusDetails(AlgorithmStatusDetails algorithmStatusDetails) {
        setAlgorithmStatusDetails(algorithmStatusDetails);
        return this;
    }

    /**
     * <p>
     * The product identifier of the algorithm.
     * </p>
     * 
     * @param productId
     *        The product identifier of the algorithm.
     */

    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * <p>
     * The product identifier of the algorithm.
     * </p>
     * 
     * @return The product identifier of the algorithm.
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     * <p>
     * The product identifier of the algorithm.
     * </p>
     * 
     * @param productId
     *        The product identifier of the algorithm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlgorithmResult withProductId(String productId) {
        setProductId(productId);
        return this;
    }

    /**
     * <p>
     * Whether the algorithm is certified to be listed in AWS Marketplace.
     * </p>
     * 
     * @param certifyForMarketplace
     *        Whether the algorithm is certified to be listed in AWS Marketplace.
     */

    public void setCertifyForMarketplace(Boolean certifyForMarketplace) {
        this.certifyForMarketplace = certifyForMarketplace;
    }

    /**
     * <p>
     * Whether the algorithm is certified to be listed in AWS Marketplace.
     * </p>
     * 
     * @return Whether the algorithm is certified to be listed in AWS Marketplace.
     */

    public Boolean getCertifyForMarketplace() {
        return this.certifyForMarketplace;
    }

    /**
     * <p>
     * Whether the algorithm is certified to be listed in AWS Marketplace.
     * </p>
     * 
     * @param certifyForMarketplace
     *        Whether the algorithm is certified to be listed in AWS Marketplace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAlgorithmResult withCertifyForMarketplace(Boolean certifyForMarketplace) {
        setCertifyForMarketplace(certifyForMarketplace);
        return this;
    }

    /**
     * <p>
     * Whether the algorithm is certified to be listed in AWS Marketplace.
     * </p>
     * 
     * @return Whether the algorithm is certified to be listed in AWS Marketplace.
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
        if (getAlgorithmArn() != null)
            sb.append("AlgorithmArn: ").append(getAlgorithmArn()).append(",");
        if (getAlgorithmDescription() != null)
            sb.append("AlgorithmDescription: ").append(getAlgorithmDescription()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getTrainingSpecification() != null)
            sb.append("TrainingSpecification: ").append(getTrainingSpecification()).append(",");
        if (getInferenceSpecification() != null)
            sb.append("InferenceSpecification: ").append(getInferenceSpecification()).append(",");
        if (getValidationSpecification() != null)
            sb.append("ValidationSpecification: ").append(getValidationSpecification()).append(",");
        if (getAlgorithmStatus() != null)
            sb.append("AlgorithmStatus: ").append(getAlgorithmStatus()).append(",");
        if (getAlgorithmStatusDetails() != null)
            sb.append("AlgorithmStatusDetails: ").append(getAlgorithmStatusDetails()).append(",");
        if (getProductId() != null)
            sb.append("ProductId: ").append(getProductId()).append(",");
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

        if (obj instanceof DescribeAlgorithmResult == false)
            return false;
        DescribeAlgorithmResult other = (DescribeAlgorithmResult) obj;
        if (other.getAlgorithmName() == null ^ this.getAlgorithmName() == null)
            return false;
        if (other.getAlgorithmName() != null && other.getAlgorithmName().equals(this.getAlgorithmName()) == false)
            return false;
        if (other.getAlgorithmArn() == null ^ this.getAlgorithmArn() == null)
            return false;
        if (other.getAlgorithmArn() != null && other.getAlgorithmArn().equals(this.getAlgorithmArn()) == false)
            return false;
        if (other.getAlgorithmDescription() == null ^ this.getAlgorithmDescription() == null)
            return false;
        if (other.getAlgorithmDescription() != null && other.getAlgorithmDescription().equals(this.getAlgorithmDescription()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
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
        if (other.getAlgorithmStatus() == null ^ this.getAlgorithmStatus() == null)
            return false;
        if (other.getAlgorithmStatus() != null && other.getAlgorithmStatus().equals(this.getAlgorithmStatus()) == false)
            return false;
        if (other.getAlgorithmStatusDetails() == null ^ this.getAlgorithmStatusDetails() == null)
            return false;
        if (other.getAlgorithmStatusDetails() != null && other.getAlgorithmStatusDetails().equals(this.getAlgorithmStatusDetails()) == false)
            return false;
        if (other.getProductId() == null ^ this.getProductId() == null)
            return false;
        if (other.getProductId() != null && other.getProductId().equals(this.getProductId()) == false)
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
        hashCode = prime * hashCode + ((getAlgorithmArn() == null) ? 0 : getAlgorithmArn().hashCode());
        hashCode = prime * hashCode + ((getAlgorithmDescription() == null) ? 0 : getAlgorithmDescription().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getTrainingSpecification() == null) ? 0 : getTrainingSpecification().hashCode());
        hashCode = prime * hashCode + ((getInferenceSpecification() == null) ? 0 : getInferenceSpecification().hashCode());
        hashCode = prime * hashCode + ((getValidationSpecification() == null) ? 0 : getValidationSpecification().hashCode());
        hashCode = prime * hashCode + ((getAlgorithmStatus() == null) ? 0 : getAlgorithmStatus().hashCode());
        hashCode = prime * hashCode + ((getAlgorithmStatusDetails() == null) ? 0 : getAlgorithmStatusDetails().hashCode());
        hashCode = prime * hashCode + ((getProductId() == null) ? 0 : getProductId().hashCode());
        hashCode = prime * hashCode + ((getCertifyForMarketplace() == null) ? 0 : getCertifyForMarketplace().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAlgorithmResult clone() {
        try {
            return (DescribeAlgorithmResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
