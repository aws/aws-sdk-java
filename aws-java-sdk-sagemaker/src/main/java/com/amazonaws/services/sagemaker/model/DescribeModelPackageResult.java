/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeModelPackage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeModelPackageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the model package being described.
     * </p>
     */
    private String modelPackageName;
    /**
     * <p>
     * If the model is a versioned model, the name of the model group that the versioned model belongs to.
     * </p>
     */
    private String modelPackageGroupName;
    /**
     * <p>
     * The version of the model package.
     * </p>
     */
    private Integer modelPackageVersion;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model package.
     * </p>
     */
    private String modelPackageArn;
    /**
     * <p>
     * A brief summary of the model package.
     * </p>
     */
    private String modelPackageDescription;
    /**
     * <p>
     * A timestamp specifying when the model package was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Details about inference jobs that can be run with models based on this model package.
     * </p>
     */
    private InferenceSpecification inferenceSpecification;
    /**
     * <p>
     * Details about the algorithm that was used to create the model package.
     * </p>
     */
    private SourceAlgorithmSpecification sourceAlgorithmSpecification;
    /**
     * <p>
     * Configurations for one or more transform jobs that Amazon SageMaker runs to test the model package.
     * </p>
     */
    private ModelPackageValidationSpecification validationSpecification;
    /**
     * <p>
     * The current status of the model package.
     * </p>
     */
    private String modelPackageStatus;
    /**
     * <p>
     * Details about the current status of the model package.
     * </p>
     */
    private ModelPackageStatusDetails modelPackageStatusDetails;
    /**
     * <p>
     * Whether the model package is certified for listing on Amazon Web Services Marketplace.
     * </p>
     */
    private Boolean certifyForMarketplace;
    /**
     * <p>
     * The approval status of the model package.
     * </p>
     */
    private String modelApprovalStatus;

    private UserContext createdBy;

    private MetadataProperties metadataProperties;
    /**
     * <p>
     * Metrics for the model.
     * </p>
     */
    private ModelMetrics modelMetrics;
    /**
     * <p>
     * The last time the model package was modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    private UserContext lastModifiedBy;
    /**
     * <p>
     * A description provided for the model approval.
     * </p>
     */
    private String approvalDescription;

    /**
     * <p>
     * The name of the model package being described.
     * </p>
     * 
     * @param modelPackageName
     *        The name of the model package being described.
     */

    public void setModelPackageName(String modelPackageName) {
        this.modelPackageName = modelPackageName;
    }

    /**
     * <p>
     * The name of the model package being described.
     * </p>
     * 
     * @return The name of the model package being described.
     */

    public String getModelPackageName() {
        return this.modelPackageName;
    }

    /**
     * <p>
     * The name of the model package being described.
     * </p>
     * 
     * @param modelPackageName
     *        The name of the model package being described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelPackageResult withModelPackageName(String modelPackageName) {
        setModelPackageName(modelPackageName);
        return this;
    }

    /**
     * <p>
     * If the model is a versioned model, the name of the model group that the versioned model belongs to.
     * </p>
     * 
     * @param modelPackageGroupName
     *        If the model is a versioned model, the name of the model group that the versioned model belongs to.
     */

    public void setModelPackageGroupName(String modelPackageGroupName) {
        this.modelPackageGroupName = modelPackageGroupName;
    }

    /**
     * <p>
     * If the model is a versioned model, the name of the model group that the versioned model belongs to.
     * </p>
     * 
     * @return If the model is a versioned model, the name of the model group that the versioned model belongs to.
     */

    public String getModelPackageGroupName() {
        return this.modelPackageGroupName;
    }

    /**
     * <p>
     * If the model is a versioned model, the name of the model group that the versioned model belongs to.
     * </p>
     * 
     * @param modelPackageGroupName
     *        If the model is a versioned model, the name of the model group that the versioned model belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelPackageResult withModelPackageGroupName(String modelPackageGroupName) {
        setModelPackageGroupName(modelPackageGroupName);
        return this;
    }

    /**
     * <p>
     * The version of the model package.
     * </p>
     * 
     * @param modelPackageVersion
     *        The version of the model package.
     */

    public void setModelPackageVersion(Integer modelPackageVersion) {
        this.modelPackageVersion = modelPackageVersion;
    }

    /**
     * <p>
     * The version of the model package.
     * </p>
     * 
     * @return The version of the model package.
     */

    public Integer getModelPackageVersion() {
        return this.modelPackageVersion;
    }

    /**
     * <p>
     * The version of the model package.
     * </p>
     * 
     * @param modelPackageVersion
     *        The version of the model package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelPackageResult withModelPackageVersion(Integer modelPackageVersion) {
        setModelPackageVersion(modelPackageVersion);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model package.
     * </p>
     * 
     * @param modelPackageArn
     *        The Amazon Resource Name (ARN) of the model package.
     */

    public void setModelPackageArn(String modelPackageArn) {
        this.modelPackageArn = modelPackageArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model package.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the model package.
     */

    public String getModelPackageArn() {
        return this.modelPackageArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model package.
     * </p>
     * 
     * @param modelPackageArn
     *        The Amazon Resource Name (ARN) of the model package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelPackageResult withModelPackageArn(String modelPackageArn) {
        setModelPackageArn(modelPackageArn);
        return this;
    }

    /**
     * <p>
     * A brief summary of the model package.
     * </p>
     * 
     * @param modelPackageDescription
     *        A brief summary of the model package.
     */

    public void setModelPackageDescription(String modelPackageDescription) {
        this.modelPackageDescription = modelPackageDescription;
    }

    /**
     * <p>
     * A brief summary of the model package.
     * </p>
     * 
     * @return A brief summary of the model package.
     */

    public String getModelPackageDescription() {
        return this.modelPackageDescription;
    }

    /**
     * <p>
     * A brief summary of the model package.
     * </p>
     * 
     * @param modelPackageDescription
     *        A brief summary of the model package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelPackageResult withModelPackageDescription(String modelPackageDescription) {
        setModelPackageDescription(modelPackageDescription);
        return this;
    }

    /**
     * <p>
     * A timestamp specifying when the model package was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp specifying when the model package was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp specifying when the model package was created.
     * </p>
     * 
     * @return A timestamp specifying when the model package was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A timestamp specifying when the model package was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp specifying when the model package was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelPackageResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Details about inference jobs that can be run with models based on this model package.
     * </p>
     * 
     * @param inferenceSpecification
     *        Details about inference jobs that can be run with models based on this model package.
     */

    public void setInferenceSpecification(InferenceSpecification inferenceSpecification) {
        this.inferenceSpecification = inferenceSpecification;
    }

    /**
     * <p>
     * Details about inference jobs that can be run with models based on this model package.
     * </p>
     * 
     * @return Details about inference jobs that can be run with models based on this model package.
     */

    public InferenceSpecification getInferenceSpecification() {
        return this.inferenceSpecification;
    }

    /**
     * <p>
     * Details about inference jobs that can be run with models based on this model package.
     * </p>
     * 
     * @param inferenceSpecification
     *        Details about inference jobs that can be run with models based on this model package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelPackageResult withInferenceSpecification(InferenceSpecification inferenceSpecification) {
        setInferenceSpecification(inferenceSpecification);
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

    public DescribeModelPackageResult withSourceAlgorithmSpecification(SourceAlgorithmSpecification sourceAlgorithmSpecification) {
        setSourceAlgorithmSpecification(sourceAlgorithmSpecification);
        return this;
    }

    /**
     * <p>
     * Configurations for one or more transform jobs that Amazon SageMaker runs to test the model package.
     * </p>
     * 
     * @param validationSpecification
     *        Configurations for one or more transform jobs that Amazon SageMaker runs to test the model package.
     */

    public void setValidationSpecification(ModelPackageValidationSpecification validationSpecification) {
        this.validationSpecification = validationSpecification;
    }

    /**
     * <p>
     * Configurations for one or more transform jobs that Amazon SageMaker runs to test the model package.
     * </p>
     * 
     * @return Configurations for one or more transform jobs that Amazon SageMaker runs to test the model package.
     */

    public ModelPackageValidationSpecification getValidationSpecification() {
        return this.validationSpecification;
    }

    /**
     * <p>
     * Configurations for one or more transform jobs that Amazon SageMaker runs to test the model package.
     * </p>
     * 
     * @param validationSpecification
     *        Configurations for one or more transform jobs that Amazon SageMaker runs to test the model package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelPackageResult withValidationSpecification(ModelPackageValidationSpecification validationSpecification) {
        setValidationSpecification(validationSpecification);
        return this;
    }

    /**
     * <p>
     * The current status of the model package.
     * </p>
     * 
     * @param modelPackageStatus
     *        The current status of the model package.
     * @see ModelPackageStatus
     */

    public void setModelPackageStatus(String modelPackageStatus) {
        this.modelPackageStatus = modelPackageStatus;
    }

    /**
     * <p>
     * The current status of the model package.
     * </p>
     * 
     * @return The current status of the model package.
     * @see ModelPackageStatus
     */

    public String getModelPackageStatus() {
        return this.modelPackageStatus;
    }

    /**
     * <p>
     * The current status of the model package.
     * </p>
     * 
     * @param modelPackageStatus
     *        The current status of the model package.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelPackageStatus
     */

    public DescribeModelPackageResult withModelPackageStatus(String modelPackageStatus) {
        setModelPackageStatus(modelPackageStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the model package.
     * </p>
     * 
     * @param modelPackageStatus
     *        The current status of the model package.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelPackageStatus
     */

    public DescribeModelPackageResult withModelPackageStatus(ModelPackageStatus modelPackageStatus) {
        this.modelPackageStatus = modelPackageStatus.toString();
        return this;
    }

    /**
     * <p>
     * Details about the current status of the model package.
     * </p>
     * 
     * @param modelPackageStatusDetails
     *        Details about the current status of the model package.
     */

    public void setModelPackageStatusDetails(ModelPackageStatusDetails modelPackageStatusDetails) {
        this.modelPackageStatusDetails = modelPackageStatusDetails;
    }

    /**
     * <p>
     * Details about the current status of the model package.
     * </p>
     * 
     * @return Details about the current status of the model package.
     */

    public ModelPackageStatusDetails getModelPackageStatusDetails() {
        return this.modelPackageStatusDetails;
    }

    /**
     * <p>
     * Details about the current status of the model package.
     * </p>
     * 
     * @param modelPackageStatusDetails
     *        Details about the current status of the model package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelPackageResult withModelPackageStatusDetails(ModelPackageStatusDetails modelPackageStatusDetails) {
        setModelPackageStatusDetails(modelPackageStatusDetails);
        return this;
    }

    /**
     * <p>
     * Whether the model package is certified for listing on Amazon Web Services Marketplace.
     * </p>
     * 
     * @param certifyForMarketplace
     *        Whether the model package is certified for listing on Amazon Web Services Marketplace.
     */

    public void setCertifyForMarketplace(Boolean certifyForMarketplace) {
        this.certifyForMarketplace = certifyForMarketplace;
    }

    /**
     * <p>
     * Whether the model package is certified for listing on Amazon Web Services Marketplace.
     * </p>
     * 
     * @return Whether the model package is certified for listing on Amazon Web Services Marketplace.
     */

    public Boolean getCertifyForMarketplace() {
        return this.certifyForMarketplace;
    }

    /**
     * <p>
     * Whether the model package is certified for listing on Amazon Web Services Marketplace.
     * </p>
     * 
     * @param certifyForMarketplace
     *        Whether the model package is certified for listing on Amazon Web Services Marketplace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelPackageResult withCertifyForMarketplace(Boolean certifyForMarketplace) {
        setCertifyForMarketplace(certifyForMarketplace);
        return this;
    }

    /**
     * <p>
     * Whether the model package is certified for listing on Amazon Web Services Marketplace.
     * </p>
     * 
     * @return Whether the model package is certified for listing on Amazon Web Services Marketplace.
     */

    public Boolean isCertifyForMarketplace() {
        return this.certifyForMarketplace;
    }

    /**
     * <p>
     * The approval status of the model package.
     * </p>
     * 
     * @param modelApprovalStatus
     *        The approval status of the model package.
     * @see ModelApprovalStatus
     */

    public void setModelApprovalStatus(String modelApprovalStatus) {
        this.modelApprovalStatus = modelApprovalStatus;
    }

    /**
     * <p>
     * The approval status of the model package.
     * </p>
     * 
     * @return The approval status of the model package.
     * @see ModelApprovalStatus
     */

    public String getModelApprovalStatus() {
        return this.modelApprovalStatus;
    }

    /**
     * <p>
     * The approval status of the model package.
     * </p>
     * 
     * @param modelApprovalStatus
     *        The approval status of the model package.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelApprovalStatus
     */

    public DescribeModelPackageResult withModelApprovalStatus(String modelApprovalStatus) {
        setModelApprovalStatus(modelApprovalStatus);
        return this;
    }

    /**
     * <p>
     * The approval status of the model package.
     * </p>
     * 
     * @param modelApprovalStatus
     *        The approval status of the model package.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelApprovalStatus
     */

    public DescribeModelPackageResult withModelApprovalStatus(ModelApprovalStatus modelApprovalStatus) {
        this.modelApprovalStatus = modelApprovalStatus.toString();
        return this;
    }

    /**
     * @param createdBy
     */

    public void setCreatedBy(UserContext createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * @return
     */

    public UserContext getCreatedBy() {
        return this.createdBy;
    }

    /**
     * @param createdBy
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelPackageResult withCreatedBy(UserContext createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * @param metadataProperties
     */

    public void setMetadataProperties(MetadataProperties metadataProperties) {
        this.metadataProperties = metadataProperties;
    }

    /**
     * @return
     */

    public MetadataProperties getMetadataProperties() {
        return this.metadataProperties;
    }

    /**
     * @param metadataProperties
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelPackageResult withMetadataProperties(MetadataProperties metadataProperties) {
        setMetadataProperties(metadataProperties);
        return this;
    }

    /**
     * <p>
     * Metrics for the model.
     * </p>
     * 
     * @param modelMetrics
     *        Metrics for the model.
     */

    public void setModelMetrics(ModelMetrics modelMetrics) {
        this.modelMetrics = modelMetrics;
    }

    /**
     * <p>
     * Metrics for the model.
     * </p>
     * 
     * @return Metrics for the model.
     */

    public ModelMetrics getModelMetrics() {
        return this.modelMetrics;
    }

    /**
     * <p>
     * Metrics for the model.
     * </p>
     * 
     * @param modelMetrics
     *        Metrics for the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelPackageResult withModelMetrics(ModelMetrics modelMetrics) {
        setModelMetrics(modelMetrics);
        return this;
    }

    /**
     * <p>
     * The last time the model package was modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The last time the model package was modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The last time the model package was modified.
     * </p>
     * 
     * @return The last time the model package was modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The last time the model package was modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The last time the model package was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelPackageResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * @param lastModifiedBy
     */

    public void setLastModifiedBy(UserContext lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * @return
     */

    public UserContext getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * @param lastModifiedBy
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelPackageResult withLastModifiedBy(UserContext lastModifiedBy) {
        setLastModifiedBy(lastModifiedBy);
        return this;
    }

    /**
     * <p>
     * A description provided for the model approval.
     * </p>
     * 
     * @param approvalDescription
     *        A description provided for the model approval.
     */

    public void setApprovalDescription(String approvalDescription) {
        this.approvalDescription = approvalDescription;
    }

    /**
     * <p>
     * A description provided for the model approval.
     * </p>
     * 
     * @return A description provided for the model approval.
     */

    public String getApprovalDescription() {
        return this.approvalDescription;
    }

    /**
     * <p>
     * A description provided for the model approval.
     * </p>
     * 
     * @param approvalDescription
     *        A description provided for the model approval.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelPackageResult withApprovalDescription(String approvalDescription) {
        setApprovalDescription(approvalDescription);
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
        if (getModelPackageName() != null)
            sb.append("ModelPackageName: ").append(getModelPackageName()).append(",");
        if (getModelPackageGroupName() != null)
            sb.append("ModelPackageGroupName: ").append(getModelPackageGroupName()).append(",");
        if (getModelPackageVersion() != null)
            sb.append("ModelPackageVersion: ").append(getModelPackageVersion()).append(",");
        if (getModelPackageArn() != null)
            sb.append("ModelPackageArn: ").append(getModelPackageArn()).append(",");
        if (getModelPackageDescription() != null)
            sb.append("ModelPackageDescription: ").append(getModelPackageDescription()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getInferenceSpecification() != null)
            sb.append("InferenceSpecification: ").append(getInferenceSpecification()).append(",");
        if (getSourceAlgorithmSpecification() != null)
            sb.append("SourceAlgorithmSpecification: ").append(getSourceAlgorithmSpecification()).append(",");
        if (getValidationSpecification() != null)
            sb.append("ValidationSpecification: ").append(getValidationSpecification()).append(",");
        if (getModelPackageStatus() != null)
            sb.append("ModelPackageStatus: ").append(getModelPackageStatus()).append(",");
        if (getModelPackageStatusDetails() != null)
            sb.append("ModelPackageStatusDetails: ").append(getModelPackageStatusDetails()).append(",");
        if (getCertifyForMarketplace() != null)
            sb.append("CertifyForMarketplace: ").append(getCertifyForMarketplace()).append(",");
        if (getModelApprovalStatus() != null)
            sb.append("ModelApprovalStatus: ").append(getModelApprovalStatus()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getMetadataProperties() != null)
            sb.append("MetadataProperties: ").append(getMetadataProperties()).append(",");
        if (getModelMetrics() != null)
            sb.append("ModelMetrics: ").append(getModelMetrics()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getLastModifiedBy() != null)
            sb.append("LastModifiedBy: ").append(getLastModifiedBy()).append(",");
        if (getApprovalDescription() != null)
            sb.append("ApprovalDescription: ").append(getApprovalDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeModelPackageResult == false)
            return false;
        DescribeModelPackageResult other = (DescribeModelPackageResult) obj;
        if (other.getModelPackageName() == null ^ this.getModelPackageName() == null)
            return false;
        if (other.getModelPackageName() != null && other.getModelPackageName().equals(this.getModelPackageName()) == false)
            return false;
        if (other.getModelPackageGroupName() == null ^ this.getModelPackageGroupName() == null)
            return false;
        if (other.getModelPackageGroupName() != null && other.getModelPackageGroupName().equals(this.getModelPackageGroupName()) == false)
            return false;
        if (other.getModelPackageVersion() == null ^ this.getModelPackageVersion() == null)
            return false;
        if (other.getModelPackageVersion() != null && other.getModelPackageVersion().equals(this.getModelPackageVersion()) == false)
            return false;
        if (other.getModelPackageArn() == null ^ this.getModelPackageArn() == null)
            return false;
        if (other.getModelPackageArn() != null && other.getModelPackageArn().equals(this.getModelPackageArn()) == false)
            return false;
        if (other.getModelPackageDescription() == null ^ this.getModelPackageDescription() == null)
            return false;
        if (other.getModelPackageDescription() != null && other.getModelPackageDescription().equals(this.getModelPackageDescription()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getInferenceSpecification() == null ^ this.getInferenceSpecification() == null)
            return false;
        if (other.getInferenceSpecification() != null && other.getInferenceSpecification().equals(this.getInferenceSpecification()) == false)
            return false;
        if (other.getSourceAlgorithmSpecification() == null ^ this.getSourceAlgorithmSpecification() == null)
            return false;
        if (other.getSourceAlgorithmSpecification() != null && other.getSourceAlgorithmSpecification().equals(this.getSourceAlgorithmSpecification()) == false)
            return false;
        if (other.getValidationSpecification() == null ^ this.getValidationSpecification() == null)
            return false;
        if (other.getValidationSpecification() != null && other.getValidationSpecification().equals(this.getValidationSpecification()) == false)
            return false;
        if (other.getModelPackageStatus() == null ^ this.getModelPackageStatus() == null)
            return false;
        if (other.getModelPackageStatus() != null && other.getModelPackageStatus().equals(this.getModelPackageStatus()) == false)
            return false;
        if (other.getModelPackageStatusDetails() == null ^ this.getModelPackageStatusDetails() == null)
            return false;
        if (other.getModelPackageStatusDetails() != null && other.getModelPackageStatusDetails().equals(this.getModelPackageStatusDetails()) == false)
            return false;
        if (other.getCertifyForMarketplace() == null ^ this.getCertifyForMarketplace() == null)
            return false;
        if (other.getCertifyForMarketplace() != null && other.getCertifyForMarketplace().equals(this.getCertifyForMarketplace()) == false)
            return false;
        if (other.getModelApprovalStatus() == null ^ this.getModelApprovalStatus() == null)
            return false;
        if (other.getModelApprovalStatus() != null && other.getModelApprovalStatus().equals(this.getModelApprovalStatus()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getMetadataProperties() == null ^ this.getMetadataProperties() == null)
            return false;
        if (other.getMetadataProperties() != null && other.getMetadataProperties().equals(this.getMetadataProperties()) == false)
            return false;
        if (other.getModelMetrics() == null ^ this.getModelMetrics() == null)
            return false;
        if (other.getModelMetrics() != null && other.getModelMetrics().equals(this.getModelMetrics()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getLastModifiedBy() == null ^ this.getLastModifiedBy() == null)
            return false;
        if (other.getLastModifiedBy() != null && other.getLastModifiedBy().equals(this.getLastModifiedBy()) == false)
            return false;
        if (other.getApprovalDescription() == null ^ this.getApprovalDescription() == null)
            return false;
        if (other.getApprovalDescription() != null && other.getApprovalDescription().equals(this.getApprovalDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelPackageName() == null) ? 0 : getModelPackageName().hashCode());
        hashCode = prime * hashCode + ((getModelPackageGroupName() == null) ? 0 : getModelPackageGroupName().hashCode());
        hashCode = prime * hashCode + ((getModelPackageVersion() == null) ? 0 : getModelPackageVersion().hashCode());
        hashCode = prime * hashCode + ((getModelPackageArn() == null) ? 0 : getModelPackageArn().hashCode());
        hashCode = prime * hashCode + ((getModelPackageDescription() == null) ? 0 : getModelPackageDescription().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getInferenceSpecification() == null) ? 0 : getInferenceSpecification().hashCode());
        hashCode = prime * hashCode + ((getSourceAlgorithmSpecification() == null) ? 0 : getSourceAlgorithmSpecification().hashCode());
        hashCode = prime * hashCode + ((getValidationSpecification() == null) ? 0 : getValidationSpecification().hashCode());
        hashCode = prime * hashCode + ((getModelPackageStatus() == null) ? 0 : getModelPackageStatus().hashCode());
        hashCode = prime * hashCode + ((getModelPackageStatusDetails() == null) ? 0 : getModelPackageStatusDetails().hashCode());
        hashCode = prime * hashCode + ((getCertifyForMarketplace() == null) ? 0 : getCertifyForMarketplace().hashCode());
        hashCode = prime * hashCode + ((getModelApprovalStatus() == null) ? 0 : getModelApprovalStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getMetadataProperties() == null) ? 0 : getMetadataProperties().hashCode());
        hashCode = prime * hashCode + ((getModelMetrics() == null) ? 0 : getModelMetrics().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        hashCode = prime * hashCode + ((getApprovalDescription() == null) ? 0 : getApprovalDescription().hashCode());
        return hashCode;
    }

    @Override
    public DescribeModelPackageResult clone() {
        try {
            return (DescribeModelPackageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
