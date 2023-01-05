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
 * A versioned model that can be deployed for SageMaker inference.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ModelPackage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelPackage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the model.
     * </p>
     */
    private String modelPackageName;
    /**
     * <p>
     * The model group to which the model belongs.
     * </p>
     */
    private String modelPackageGroupName;
    /**
     * <p>
     * The version number of a versioned model.
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
     * The description of the model package.
     * </p>
     */
    private String modelPackageDescription;
    /**
     * <p>
     * The time that the model package was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Defines how to perform inference generation after a training job is run.
     * </p>
     */
    private InferenceSpecification inferenceSpecification;
    /**
     * <p>
     * A list of algorithms that were used to create a model package.
     * </p>
     */
    private SourceAlgorithmSpecification sourceAlgorithmSpecification;
    /**
     * <p>
     * Specifies batch transform jobs that SageMaker runs to validate your model package.
     * </p>
     */
    private ModelPackageValidationSpecification validationSpecification;
    /**
     * <p>
     * The status of the model package. This can be one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - The model package is pending being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - The model package is in the process of being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code> - The model package was successfully created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The model package failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The model package is in the process of being deleted.
     * </p>
     * </li>
     * </ul>
     */
    private String modelPackageStatus;
    /**
     * <p>
     * Specifies the validation and image scan statuses of the model package.
     * </p>
     */
    private ModelPackageStatusDetails modelPackageStatusDetails;
    /**
     * <p>
     * Whether the model package is to be certified to be listed on Amazon Web Services Marketplace. For information
     * about listing model packages on Amazon Web Services Marketplace, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-mkt-list.html">List Your Algorithm or Model
     * Package on Amazon Web Services Marketplace</a>.
     * </p>
     */
    private Boolean certifyForMarketplace;
    /**
     * <p>
     * The approval status of the model. This can be one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>APPROVED</code> - The model is approved
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REJECTED</code> - The model is rejected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_MANUAL_APPROVAL</code> - The model is waiting for manual approval.
     * </p>
     * </li>
     * </ul>
     */
    private String modelApprovalStatus;
    /**
     * <p>
     * Information about the user who created or modified an experiment, trial, trial component, lineage group, or
     * project.
     * </p>
     */
    private UserContext createdBy;
    /**
     * <p>
     * Metadata properties of the tracking entity, trial, or trial component.
     * </p>
     */
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
    /**
     * <p>
     * Information about the user who created or modified an experiment, trial, trial component, lineage group, or
     * project.
     * </p>
     */
    private UserContext lastModifiedBy;
    /**
     * <p>
     * A description provided when the model approval is set.
     * </p>
     */
    private String approvalDescription;
    /**
     * <p>
     * The machine learning domain of your model package and its components. Common machine learning domains include
     * computer vision and natural language processing.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The machine learning task your model package accomplishes. Common machine learning tasks include object detection
     * and image classification.
     * </p>
     */
    private String task;
    /**
     * <p>
     * The Amazon Simple Storage Service path where the sample payload are stored. This path must point to a single gzip
     * compressed tar archive (.tar.gz suffix).
     * </p>
     */
    private String samplePayloadUrl;
    /**
     * <p>
     * An array of additional Inference Specification objects.
     * </p>
     */
    private java.util.List<AdditionalInferenceSpecificationDefinition> additionalInferenceSpecifications;
    /**
     * <p>
     * A list of the tags associated with the model package. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The metadata properties for the model package.
     * </p>
     */
    private java.util.Map<String, String> customerMetadataProperties;
    /**
     * <p>
     * Represents the drift check baselines that can be used when the model monitor is set using the model package.
     * </p>
     */
    private DriftCheckBaselines driftCheckBaselines;

    /**
     * <p>
     * The name of the model.
     * </p>
     * 
     * @param modelPackageName
     *        The name of the model.
     */

    public void setModelPackageName(String modelPackageName) {
        this.modelPackageName = modelPackageName;
    }

    /**
     * <p>
     * The name of the model.
     * </p>
     * 
     * @return The name of the model.
     */

    public String getModelPackageName() {
        return this.modelPackageName;
    }

    /**
     * <p>
     * The name of the model.
     * </p>
     * 
     * @param modelPackageName
     *        The name of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackage withModelPackageName(String modelPackageName) {
        setModelPackageName(modelPackageName);
        return this;
    }

    /**
     * <p>
     * The model group to which the model belongs.
     * </p>
     * 
     * @param modelPackageGroupName
     *        The model group to which the model belongs.
     */

    public void setModelPackageGroupName(String modelPackageGroupName) {
        this.modelPackageGroupName = modelPackageGroupName;
    }

    /**
     * <p>
     * The model group to which the model belongs.
     * </p>
     * 
     * @return The model group to which the model belongs.
     */

    public String getModelPackageGroupName() {
        return this.modelPackageGroupName;
    }

    /**
     * <p>
     * The model group to which the model belongs.
     * </p>
     * 
     * @param modelPackageGroupName
     *        The model group to which the model belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackage withModelPackageGroupName(String modelPackageGroupName) {
        setModelPackageGroupName(modelPackageGroupName);
        return this;
    }

    /**
     * <p>
     * The version number of a versioned model.
     * </p>
     * 
     * @param modelPackageVersion
     *        The version number of a versioned model.
     */

    public void setModelPackageVersion(Integer modelPackageVersion) {
        this.modelPackageVersion = modelPackageVersion;
    }

    /**
     * <p>
     * The version number of a versioned model.
     * </p>
     * 
     * @return The version number of a versioned model.
     */

    public Integer getModelPackageVersion() {
        return this.modelPackageVersion;
    }

    /**
     * <p>
     * The version number of a versioned model.
     * </p>
     * 
     * @param modelPackageVersion
     *        The version number of a versioned model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackage withModelPackageVersion(Integer modelPackageVersion) {
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

    public ModelPackage withModelPackageArn(String modelPackageArn) {
        setModelPackageArn(modelPackageArn);
        return this;
    }

    /**
     * <p>
     * The description of the model package.
     * </p>
     * 
     * @param modelPackageDescription
     *        The description of the model package.
     */

    public void setModelPackageDescription(String modelPackageDescription) {
        this.modelPackageDescription = modelPackageDescription;
    }

    /**
     * <p>
     * The description of the model package.
     * </p>
     * 
     * @return The description of the model package.
     */

    public String getModelPackageDescription() {
        return this.modelPackageDescription;
    }

    /**
     * <p>
     * The description of the model package.
     * </p>
     * 
     * @param modelPackageDescription
     *        The description of the model package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackage withModelPackageDescription(String modelPackageDescription) {
        setModelPackageDescription(modelPackageDescription);
        return this;
    }

    /**
     * <p>
     * The time that the model package was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the model package was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that the model package was created.
     * </p>
     * 
     * @return The time that the model package was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time that the model package was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the model package was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackage withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Defines how to perform inference generation after a training job is run.
     * </p>
     * 
     * @param inferenceSpecification
     *        Defines how to perform inference generation after a training job is run.
     */

    public void setInferenceSpecification(InferenceSpecification inferenceSpecification) {
        this.inferenceSpecification = inferenceSpecification;
    }

    /**
     * <p>
     * Defines how to perform inference generation after a training job is run.
     * </p>
     * 
     * @return Defines how to perform inference generation after a training job is run.
     */

    public InferenceSpecification getInferenceSpecification() {
        return this.inferenceSpecification;
    }

    /**
     * <p>
     * Defines how to perform inference generation after a training job is run.
     * </p>
     * 
     * @param inferenceSpecification
     *        Defines how to perform inference generation after a training job is run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackage withInferenceSpecification(InferenceSpecification inferenceSpecification) {
        setInferenceSpecification(inferenceSpecification);
        return this;
    }

    /**
     * <p>
     * A list of algorithms that were used to create a model package.
     * </p>
     * 
     * @param sourceAlgorithmSpecification
     *        A list of algorithms that were used to create a model package.
     */

    public void setSourceAlgorithmSpecification(SourceAlgorithmSpecification sourceAlgorithmSpecification) {
        this.sourceAlgorithmSpecification = sourceAlgorithmSpecification;
    }

    /**
     * <p>
     * A list of algorithms that were used to create a model package.
     * </p>
     * 
     * @return A list of algorithms that were used to create a model package.
     */

    public SourceAlgorithmSpecification getSourceAlgorithmSpecification() {
        return this.sourceAlgorithmSpecification;
    }

    /**
     * <p>
     * A list of algorithms that were used to create a model package.
     * </p>
     * 
     * @param sourceAlgorithmSpecification
     *        A list of algorithms that were used to create a model package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackage withSourceAlgorithmSpecification(SourceAlgorithmSpecification sourceAlgorithmSpecification) {
        setSourceAlgorithmSpecification(sourceAlgorithmSpecification);
        return this;
    }

    /**
     * <p>
     * Specifies batch transform jobs that SageMaker runs to validate your model package.
     * </p>
     * 
     * @param validationSpecification
     *        Specifies batch transform jobs that SageMaker runs to validate your model package.
     */

    public void setValidationSpecification(ModelPackageValidationSpecification validationSpecification) {
        this.validationSpecification = validationSpecification;
    }

    /**
     * <p>
     * Specifies batch transform jobs that SageMaker runs to validate your model package.
     * </p>
     * 
     * @return Specifies batch transform jobs that SageMaker runs to validate your model package.
     */

    public ModelPackageValidationSpecification getValidationSpecification() {
        return this.validationSpecification;
    }

    /**
     * <p>
     * Specifies batch transform jobs that SageMaker runs to validate your model package.
     * </p>
     * 
     * @param validationSpecification
     *        Specifies batch transform jobs that SageMaker runs to validate your model package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackage withValidationSpecification(ModelPackageValidationSpecification validationSpecification) {
        setValidationSpecification(validationSpecification);
        return this;
    }

    /**
     * <p>
     * The status of the model package. This can be one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - The model package is pending being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - The model package is in the process of being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code> - The model package was successfully created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The model package failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The model package is in the process of being deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param modelPackageStatus
     *        The status of the model package. This can be one of the following values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - The model package is pending being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code> - The model package is in the process of being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code> - The model package was successfully created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - The model package failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The model package is in the process of being deleted.
     *        </p>
     *        </li>
     * @see ModelPackageStatus
     */

    public void setModelPackageStatus(String modelPackageStatus) {
        this.modelPackageStatus = modelPackageStatus;
    }

    /**
     * <p>
     * The status of the model package. This can be one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - The model package is pending being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - The model package is in the process of being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code> - The model package was successfully created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The model package failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The model package is in the process of being deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the model package. This can be one of the following values.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PENDING</code> - The model package is pending being created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN_PROGRESS</code> - The model package is in the process of being created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COMPLETED</code> - The model package was successfully created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> - The model package failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code> - The model package is in the process of being deleted.
     *         </p>
     *         </li>
     * @see ModelPackageStatus
     */

    public String getModelPackageStatus() {
        return this.modelPackageStatus;
    }

    /**
     * <p>
     * The status of the model package. This can be one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - The model package is pending being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - The model package is in the process of being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code> - The model package was successfully created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The model package failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The model package is in the process of being deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param modelPackageStatus
     *        The status of the model package. This can be one of the following values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - The model package is pending being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code> - The model package is in the process of being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code> - The model package was successfully created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - The model package failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The model package is in the process of being deleted.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelPackageStatus
     */

    public ModelPackage withModelPackageStatus(String modelPackageStatus) {
        setModelPackageStatus(modelPackageStatus);
        return this;
    }

    /**
     * <p>
     * The status of the model package. This can be one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code> - The model package is pending being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code> - The model package is in the process of being created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code> - The model package was successfully created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - The model package failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The model package is in the process of being deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param modelPackageStatus
     *        The status of the model package. This can be one of the following values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - The model package is pending being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code> - The model package is in the process of being created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code> - The model package was successfully created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - The model package failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The model package is in the process of being deleted.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelPackageStatus
     */

    public ModelPackage withModelPackageStatus(ModelPackageStatus modelPackageStatus) {
        this.modelPackageStatus = modelPackageStatus.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the validation and image scan statuses of the model package.
     * </p>
     * 
     * @param modelPackageStatusDetails
     *        Specifies the validation and image scan statuses of the model package.
     */

    public void setModelPackageStatusDetails(ModelPackageStatusDetails modelPackageStatusDetails) {
        this.modelPackageStatusDetails = modelPackageStatusDetails;
    }

    /**
     * <p>
     * Specifies the validation and image scan statuses of the model package.
     * </p>
     * 
     * @return Specifies the validation and image scan statuses of the model package.
     */

    public ModelPackageStatusDetails getModelPackageStatusDetails() {
        return this.modelPackageStatusDetails;
    }

    /**
     * <p>
     * Specifies the validation and image scan statuses of the model package.
     * </p>
     * 
     * @param modelPackageStatusDetails
     *        Specifies the validation and image scan statuses of the model package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackage withModelPackageStatusDetails(ModelPackageStatusDetails modelPackageStatusDetails) {
        setModelPackageStatusDetails(modelPackageStatusDetails);
        return this;
    }

    /**
     * <p>
     * Whether the model package is to be certified to be listed on Amazon Web Services Marketplace. For information
     * about listing model packages on Amazon Web Services Marketplace, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-mkt-list.html">List Your Algorithm or Model
     * Package on Amazon Web Services Marketplace</a>.
     * </p>
     * 
     * @param certifyForMarketplace
     *        Whether the model package is to be certified to be listed on Amazon Web Services Marketplace. For
     *        information about listing model packages on Amazon Web Services Marketplace, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-mkt-list.html">List Your Algorithm or
     *        Model Package on Amazon Web Services Marketplace</a>.
     */

    public void setCertifyForMarketplace(Boolean certifyForMarketplace) {
        this.certifyForMarketplace = certifyForMarketplace;
    }

    /**
     * <p>
     * Whether the model package is to be certified to be listed on Amazon Web Services Marketplace. For information
     * about listing model packages on Amazon Web Services Marketplace, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-mkt-list.html">List Your Algorithm or Model
     * Package on Amazon Web Services Marketplace</a>.
     * </p>
     * 
     * @return Whether the model package is to be certified to be listed on Amazon Web Services Marketplace. For
     *         information about listing model packages on Amazon Web Services Marketplace, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-mkt-list.html">List Your Algorithm or
     *         Model Package on Amazon Web Services Marketplace</a>.
     */

    public Boolean getCertifyForMarketplace() {
        return this.certifyForMarketplace;
    }

    /**
     * <p>
     * Whether the model package is to be certified to be listed on Amazon Web Services Marketplace. For information
     * about listing model packages on Amazon Web Services Marketplace, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-mkt-list.html">List Your Algorithm or Model
     * Package on Amazon Web Services Marketplace</a>.
     * </p>
     * 
     * @param certifyForMarketplace
     *        Whether the model package is to be certified to be listed on Amazon Web Services Marketplace. For
     *        information about listing model packages on Amazon Web Services Marketplace, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-mkt-list.html">List Your Algorithm or
     *        Model Package on Amazon Web Services Marketplace</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackage withCertifyForMarketplace(Boolean certifyForMarketplace) {
        setCertifyForMarketplace(certifyForMarketplace);
        return this;
    }

    /**
     * <p>
     * Whether the model package is to be certified to be listed on Amazon Web Services Marketplace. For information
     * about listing model packages on Amazon Web Services Marketplace, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-mkt-list.html">List Your Algorithm or Model
     * Package on Amazon Web Services Marketplace</a>.
     * </p>
     * 
     * @return Whether the model package is to be certified to be listed on Amazon Web Services Marketplace. For
     *         information about listing model packages on Amazon Web Services Marketplace, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-mkt-list.html">List Your Algorithm or
     *         Model Package on Amazon Web Services Marketplace</a>.
     */

    public Boolean isCertifyForMarketplace() {
        return this.certifyForMarketplace;
    }

    /**
     * <p>
     * The approval status of the model. This can be one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>APPROVED</code> - The model is approved
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REJECTED</code> - The model is rejected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_MANUAL_APPROVAL</code> - The model is waiting for manual approval.
     * </p>
     * </li>
     * </ul>
     * 
     * @param modelApprovalStatus
     *        The approval status of the model. This can be one of the following values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>APPROVED</code> - The model is approved
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REJECTED</code> - The model is rejected.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING_MANUAL_APPROVAL</code> - The model is waiting for manual approval.
     *        </p>
     *        </li>
     * @see ModelApprovalStatus
     */

    public void setModelApprovalStatus(String modelApprovalStatus) {
        this.modelApprovalStatus = modelApprovalStatus;
    }

    /**
     * <p>
     * The approval status of the model. This can be one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>APPROVED</code> - The model is approved
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REJECTED</code> - The model is rejected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_MANUAL_APPROVAL</code> - The model is waiting for manual approval.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The approval status of the model. This can be one of the following values.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>APPROVED</code> - The model is approved
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>REJECTED</code> - The model is rejected.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PENDING_MANUAL_APPROVAL</code> - The model is waiting for manual approval.
     *         </p>
     *         </li>
     * @see ModelApprovalStatus
     */

    public String getModelApprovalStatus() {
        return this.modelApprovalStatus;
    }

    /**
     * <p>
     * The approval status of the model. This can be one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>APPROVED</code> - The model is approved
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REJECTED</code> - The model is rejected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_MANUAL_APPROVAL</code> - The model is waiting for manual approval.
     * </p>
     * </li>
     * </ul>
     * 
     * @param modelApprovalStatus
     *        The approval status of the model. This can be one of the following values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>APPROVED</code> - The model is approved
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REJECTED</code> - The model is rejected.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING_MANUAL_APPROVAL</code> - The model is waiting for manual approval.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelApprovalStatus
     */

    public ModelPackage withModelApprovalStatus(String modelApprovalStatus) {
        setModelApprovalStatus(modelApprovalStatus);
        return this;
    }

    /**
     * <p>
     * The approval status of the model. This can be one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>APPROVED</code> - The model is approved
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REJECTED</code> - The model is rejected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_MANUAL_APPROVAL</code> - The model is waiting for manual approval.
     * </p>
     * </li>
     * </ul>
     * 
     * @param modelApprovalStatus
     *        The approval status of the model. This can be one of the following values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>APPROVED</code> - The model is approved
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REJECTED</code> - The model is rejected.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING_MANUAL_APPROVAL</code> - The model is waiting for manual approval.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelApprovalStatus
     */

    public ModelPackage withModelApprovalStatus(ModelApprovalStatus modelApprovalStatus) {
        this.modelApprovalStatus = modelApprovalStatus.toString();
        return this;
    }

    /**
     * <p>
     * Information about the user who created or modified an experiment, trial, trial component, lineage group, or
     * project.
     * </p>
     * 
     * @param createdBy
     *        Information about the user who created or modified an experiment, trial, trial component, lineage group,
     *        or project.
     */

    public void setCreatedBy(UserContext createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * Information about the user who created or modified an experiment, trial, trial component, lineage group, or
     * project.
     * </p>
     * 
     * @return Information about the user who created or modified an experiment, trial, trial component, lineage group,
     *         or project.
     */

    public UserContext getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * Information about the user who created or modified an experiment, trial, trial component, lineage group, or
     * project.
     * </p>
     * 
     * @param createdBy
     *        Information about the user who created or modified an experiment, trial, trial component, lineage group,
     *        or project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackage withCreatedBy(UserContext createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * Metadata properties of the tracking entity, trial, or trial component.
     * </p>
     * 
     * @param metadataProperties
     *        Metadata properties of the tracking entity, trial, or trial component.
     */

    public void setMetadataProperties(MetadataProperties metadataProperties) {
        this.metadataProperties = metadataProperties;
    }

    /**
     * <p>
     * Metadata properties of the tracking entity, trial, or trial component.
     * </p>
     * 
     * @return Metadata properties of the tracking entity, trial, or trial component.
     */

    public MetadataProperties getMetadataProperties() {
        return this.metadataProperties;
    }

    /**
     * <p>
     * Metadata properties of the tracking entity, trial, or trial component.
     * </p>
     * 
     * @param metadataProperties
     *        Metadata properties of the tracking entity, trial, or trial component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackage withMetadataProperties(MetadataProperties metadataProperties) {
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

    public ModelPackage withModelMetrics(ModelMetrics modelMetrics) {
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

    public ModelPackage withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * Information about the user who created or modified an experiment, trial, trial component, lineage group, or
     * project.
     * </p>
     * 
     * @param lastModifiedBy
     *        Information about the user who created or modified an experiment, trial, trial component, lineage group,
     *        or project.
     */

    public void setLastModifiedBy(UserContext lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * <p>
     * Information about the user who created or modified an experiment, trial, trial component, lineage group, or
     * project.
     * </p>
     * 
     * @return Information about the user who created or modified an experiment, trial, trial component, lineage group,
     *         or project.
     */

    public UserContext getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * <p>
     * Information about the user who created or modified an experiment, trial, trial component, lineage group, or
     * project.
     * </p>
     * 
     * @param lastModifiedBy
     *        Information about the user who created or modified an experiment, trial, trial component, lineage group,
     *        or project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackage withLastModifiedBy(UserContext lastModifiedBy) {
        setLastModifiedBy(lastModifiedBy);
        return this;
    }

    /**
     * <p>
     * A description provided when the model approval is set.
     * </p>
     * 
     * @param approvalDescription
     *        A description provided when the model approval is set.
     */

    public void setApprovalDescription(String approvalDescription) {
        this.approvalDescription = approvalDescription;
    }

    /**
     * <p>
     * A description provided when the model approval is set.
     * </p>
     * 
     * @return A description provided when the model approval is set.
     */

    public String getApprovalDescription() {
        return this.approvalDescription;
    }

    /**
     * <p>
     * A description provided when the model approval is set.
     * </p>
     * 
     * @param approvalDescription
     *        A description provided when the model approval is set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackage withApprovalDescription(String approvalDescription) {
        setApprovalDescription(approvalDescription);
        return this;
    }

    /**
     * <p>
     * The machine learning domain of your model package and its components. Common machine learning domains include
     * computer vision and natural language processing.
     * </p>
     * 
     * @param domain
     *        The machine learning domain of your model package and its components. Common machine learning domains
     *        include computer vision and natural language processing.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The machine learning domain of your model package and its components. Common machine learning domains include
     * computer vision and natural language processing.
     * </p>
     * 
     * @return The machine learning domain of your model package and its components. Common machine learning domains
     *         include computer vision and natural language processing.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The machine learning domain of your model package and its components. Common machine learning domains include
     * computer vision and natural language processing.
     * </p>
     * 
     * @param domain
     *        The machine learning domain of your model package and its components. Common machine learning domains
     *        include computer vision and natural language processing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackage withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The machine learning task your model package accomplishes. Common machine learning tasks include object detection
     * and image classification.
     * </p>
     * 
     * @param task
     *        The machine learning task your model package accomplishes. Common machine learning tasks include object
     *        detection and image classification.
     */

    public void setTask(String task) {
        this.task = task;
    }

    /**
     * <p>
     * The machine learning task your model package accomplishes. Common machine learning tasks include object detection
     * and image classification.
     * </p>
     * 
     * @return The machine learning task your model package accomplishes. Common machine learning tasks include object
     *         detection and image classification.
     */

    public String getTask() {
        return this.task;
    }

    /**
     * <p>
     * The machine learning task your model package accomplishes. Common machine learning tasks include object detection
     * and image classification.
     * </p>
     * 
     * @param task
     *        The machine learning task your model package accomplishes. Common machine learning tasks include object
     *        detection and image classification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackage withTask(String task) {
        setTask(task);
        return this;
    }

    /**
     * <p>
     * The Amazon Simple Storage Service path where the sample payload are stored. This path must point to a single gzip
     * compressed tar archive (.tar.gz suffix).
     * </p>
     * 
     * @param samplePayloadUrl
     *        The Amazon Simple Storage Service path where the sample payload are stored. This path must point to a
     *        single gzip compressed tar archive (.tar.gz suffix).
     */

    public void setSamplePayloadUrl(String samplePayloadUrl) {
        this.samplePayloadUrl = samplePayloadUrl;
    }

    /**
     * <p>
     * The Amazon Simple Storage Service path where the sample payload are stored. This path must point to a single gzip
     * compressed tar archive (.tar.gz suffix).
     * </p>
     * 
     * @return The Amazon Simple Storage Service path where the sample payload are stored. This path must point to a
     *         single gzip compressed tar archive (.tar.gz suffix).
     */

    public String getSamplePayloadUrl() {
        return this.samplePayloadUrl;
    }

    /**
     * <p>
     * The Amazon Simple Storage Service path where the sample payload are stored. This path must point to a single gzip
     * compressed tar archive (.tar.gz suffix).
     * </p>
     * 
     * @param samplePayloadUrl
     *        The Amazon Simple Storage Service path where the sample payload are stored. This path must point to a
     *        single gzip compressed tar archive (.tar.gz suffix).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackage withSamplePayloadUrl(String samplePayloadUrl) {
        setSamplePayloadUrl(samplePayloadUrl);
        return this;
    }

    /**
     * <p>
     * An array of additional Inference Specification objects.
     * </p>
     * 
     * @return An array of additional Inference Specification objects.
     */

    public java.util.List<AdditionalInferenceSpecificationDefinition> getAdditionalInferenceSpecifications() {
        return additionalInferenceSpecifications;
    }

    /**
     * <p>
     * An array of additional Inference Specification objects.
     * </p>
     * 
     * @param additionalInferenceSpecifications
     *        An array of additional Inference Specification objects.
     */

    public void setAdditionalInferenceSpecifications(java.util.Collection<AdditionalInferenceSpecificationDefinition> additionalInferenceSpecifications) {
        if (additionalInferenceSpecifications == null) {
            this.additionalInferenceSpecifications = null;
            return;
        }

        this.additionalInferenceSpecifications = new java.util.ArrayList<AdditionalInferenceSpecificationDefinition>(additionalInferenceSpecifications);
    }

    /**
     * <p>
     * An array of additional Inference Specification objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdditionalInferenceSpecifications(java.util.Collection)} or
     * {@link #withAdditionalInferenceSpecifications(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param additionalInferenceSpecifications
     *        An array of additional Inference Specification objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackage withAdditionalInferenceSpecifications(AdditionalInferenceSpecificationDefinition... additionalInferenceSpecifications) {
        if (this.additionalInferenceSpecifications == null) {
            setAdditionalInferenceSpecifications(new java.util.ArrayList<AdditionalInferenceSpecificationDefinition>(additionalInferenceSpecifications.length));
        }
        for (AdditionalInferenceSpecificationDefinition ele : additionalInferenceSpecifications) {
            this.additionalInferenceSpecifications.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of additional Inference Specification objects.
     * </p>
     * 
     * @param additionalInferenceSpecifications
     *        An array of additional Inference Specification objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackage withAdditionalInferenceSpecifications(java.util.Collection<AdditionalInferenceSpecificationDefinition> additionalInferenceSpecifications) {
        setAdditionalInferenceSpecifications(additionalInferenceSpecifications);
        return this;
    }

    /**
     * <p>
     * A list of the tags associated with the model package. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference Guide</i>.
     * </p>
     * 
     * @return A list of the tags associated with the model package. For more information, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *         resources</a> in the <i>Amazon Web Services General Reference Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of the tags associated with the model package. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of the tags associated with the model package. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        resources</a> in the <i>Amazon Web Services General Reference Guide</i>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of the tags associated with the model package. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of the tags associated with the model package. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        resources</a> in the <i>Amazon Web Services General Reference Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackage withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the tags associated with the model package. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of the tags associated with the model package. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        resources</a> in the <i>Amazon Web Services General Reference Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackage withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The metadata properties for the model package.
     * </p>
     * 
     * @return The metadata properties for the model package.
     */

    public java.util.Map<String, String> getCustomerMetadataProperties() {
        return customerMetadataProperties;
    }

    /**
     * <p>
     * The metadata properties for the model package.
     * </p>
     * 
     * @param customerMetadataProperties
     *        The metadata properties for the model package.
     */

    public void setCustomerMetadataProperties(java.util.Map<String, String> customerMetadataProperties) {
        this.customerMetadataProperties = customerMetadataProperties;
    }

    /**
     * <p>
     * The metadata properties for the model package.
     * </p>
     * 
     * @param customerMetadataProperties
     *        The metadata properties for the model package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackage withCustomerMetadataProperties(java.util.Map<String, String> customerMetadataProperties) {
        setCustomerMetadataProperties(customerMetadataProperties);
        return this;
    }

    /**
     * Add a single CustomerMetadataProperties entry
     *
     * @see ModelPackage#withCustomerMetadataProperties
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackage addCustomerMetadataPropertiesEntry(String key, String value) {
        if (null == this.customerMetadataProperties) {
            this.customerMetadataProperties = new java.util.HashMap<String, String>();
        }
        if (this.customerMetadataProperties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.customerMetadataProperties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into CustomerMetadataProperties.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackage clearCustomerMetadataPropertiesEntries() {
        this.customerMetadataProperties = null;
        return this;
    }

    /**
     * <p>
     * Represents the drift check baselines that can be used when the model monitor is set using the model package.
     * </p>
     * 
     * @param driftCheckBaselines
     *        Represents the drift check baselines that can be used when the model monitor is set using the model
     *        package.
     */

    public void setDriftCheckBaselines(DriftCheckBaselines driftCheckBaselines) {
        this.driftCheckBaselines = driftCheckBaselines;
    }

    /**
     * <p>
     * Represents the drift check baselines that can be used when the model monitor is set using the model package.
     * </p>
     * 
     * @return Represents the drift check baselines that can be used when the model monitor is set using the model
     *         package.
     */

    public DriftCheckBaselines getDriftCheckBaselines() {
        return this.driftCheckBaselines;
    }

    /**
     * <p>
     * Represents the drift check baselines that can be used when the model monitor is set using the model package.
     * </p>
     * 
     * @param driftCheckBaselines
     *        Represents the drift check baselines that can be used when the model monitor is set using the model
     *        package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelPackage withDriftCheckBaselines(DriftCheckBaselines driftCheckBaselines) {
        setDriftCheckBaselines(driftCheckBaselines);
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
            sb.append("ApprovalDescription: ").append(getApprovalDescription()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getTask() != null)
            sb.append("Task: ").append(getTask()).append(",");
        if (getSamplePayloadUrl() != null)
            sb.append("SamplePayloadUrl: ").append(getSamplePayloadUrl()).append(",");
        if (getAdditionalInferenceSpecifications() != null)
            sb.append("AdditionalInferenceSpecifications: ").append(getAdditionalInferenceSpecifications()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getCustomerMetadataProperties() != null)
            sb.append("CustomerMetadataProperties: ").append(getCustomerMetadataProperties()).append(",");
        if (getDriftCheckBaselines() != null)
            sb.append("DriftCheckBaselines: ").append(getDriftCheckBaselines());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelPackage == false)
            return false;
        ModelPackage other = (ModelPackage) obj;
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
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getTask() == null ^ this.getTask() == null)
            return false;
        if (other.getTask() != null && other.getTask().equals(this.getTask()) == false)
            return false;
        if (other.getSamplePayloadUrl() == null ^ this.getSamplePayloadUrl() == null)
            return false;
        if (other.getSamplePayloadUrl() != null && other.getSamplePayloadUrl().equals(this.getSamplePayloadUrl()) == false)
            return false;
        if (other.getAdditionalInferenceSpecifications() == null ^ this.getAdditionalInferenceSpecifications() == null)
            return false;
        if (other.getAdditionalInferenceSpecifications() != null
                && other.getAdditionalInferenceSpecifications().equals(this.getAdditionalInferenceSpecifications()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getCustomerMetadataProperties() == null ^ this.getCustomerMetadataProperties() == null)
            return false;
        if (other.getCustomerMetadataProperties() != null && other.getCustomerMetadataProperties().equals(this.getCustomerMetadataProperties()) == false)
            return false;
        if (other.getDriftCheckBaselines() == null ^ this.getDriftCheckBaselines() == null)
            return false;
        if (other.getDriftCheckBaselines() != null && other.getDriftCheckBaselines().equals(this.getDriftCheckBaselines()) == false)
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
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getTask() == null) ? 0 : getTask().hashCode());
        hashCode = prime * hashCode + ((getSamplePayloadUrl() == null) ? 0 : getSamplePayloadUrl().hashCode());
        hashCode = prime * hashCode + ((getAdditionalInferenceSpecifications() == null) ? 0 : getAdditionalInferenceSpecifications().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getCustomerMetadataProperties() == null) ? 0 : getCustomerMetadataProperties().hashCode());
        hashCode = prime * hashCode + ((getDriftCheckBaselines() == null) ? 0 : getDriftCheckBaselines().hashCode());
        return hashCode;
    }

    @Override
    public ModelPackage clone() {
        try {
            return (ModelPackage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ModelPackageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
