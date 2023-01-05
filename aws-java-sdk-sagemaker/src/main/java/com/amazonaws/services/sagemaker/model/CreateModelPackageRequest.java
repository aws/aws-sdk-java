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
     * <p>
     * This parameter is required for unversioned models. It is not applicable to versioned models.
     * </p>
     */
    private String modelPackageName;
    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the model package group that this model version belongs to.
     * </p>
     * <p>
     * This parameter is required for versioned models, and does not apply to unversioned models.
     * </p>
     */
    private String modelPackageGroupName;
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
     * Specifies configurations for one or more transform jobs that SageMaker runs to test the model package.
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
     * Whether to certify the model package for listing on Amazon Web Services Marketplace.
     * </p>
     * <p>
     * This parameter is optional for unversioned models, and does not apply to versioned models.
     * </p>
     */
    private Boolean certifyForMarketplace;
    /**
     * <p>
     * A list of key value pairs associated with the model. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * Whether the model is approved for deployment.
     * </p>
     * <p>
     * This parameter is optional for versioned models, and does not apply to unversioned models.
     * </p>
     * <p>
     * For versioned models, the value of this parameter must be set to <code>Approved</code> to deploy the model.
     * </p>
     */
    private String modelApprovalStatus;

    private MetadataProperties metadataProperties;
    /**
     * <p>
     * A structure that contains model metrics reports.
     * </p>
     */
    private ModelMetrics modelMetrics;
    /**
     * <p>
     * A unique token that guarantees that the call to this API is idempotent.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The metadata properties associated with the model package versions.
     * </p>
     */
    private java.util.Map<String, String> customerMetadataProperties;
    /**
     * <p>
     * Represents the drift check baselines that can be used when the model monitor is set using the model package. For
     * more information, see the topic on <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/pipelines-quality-clarify-baseline-lifecycle.html#pipelines-quality-clarify-baseline-drift-detection"
     * >Drift Detection against Previous Baselines in SageMaker Pipelines</a> in the <i>Amazon SageMaker Developer
     * Guide</i>.
     * </p>
     */
    private DriftCheckBaselines driftCheckBaselines;
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
     * and image classification. The following tasks are supported by Inference Recommender:
     * <code>"IMAGE_CLASSIFICATION"</code> | <code>"OBJECT_DETECTION"</code> | <code>"TEXT_GENERATION"</code> |
     * <code>"IMAGE_SEGMENTATION"</code> | <code>"FILL_MASK"</code> | <code>"CLASSIFICATION"</code> |
     * <code>"REGRESSION"</code> | <code>"OTHER"</code>.
     * </p>
     * <p>
     * Specify "OTHER" if none of the tasks listed fit your use case.
     * </p>
     */
    private String task;
    /**
     * <p>
     * The Amazon Simple Storage Service (Amazon S3) path where the sample payload are stored. This path must point to a
     * single gzip compressed tar archive (.tar.gz suffix).
     * </p>
     */
    private String samplePayloadUrl;
    /**
     * <p>
     * An array of additional Inference Specification objects. Each additional Inference Specification specifies
     * artifacts based on this model package that can be used on inference endpoints. Generally used with SageMaker Neo
     * to store the compiled artifacts.
     * </p>
     */
    private java.util.List<AdditionalInferenceSpecificationDefinition> additionalInferenceSpecifications;

    /**
     * <p>
     * The name of the model package. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9, and -
     * (hyphen).
     * </p>
     * <p>
     * This parameter is required for unversioned models. It is not applicable to versioned models.
     * </p>
     * 
     * @param modelPackageName
     *        The name of the model package. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9,
     *        and - (hyphen).</p>
     *        <p>
     *        This parameter is required for unversioned models. It is not applicable to versioned models.
     */

    public void setModelPackageName(String modelPackageName) {
        this.modelPackageName = modelPackageName;
    }

    /**
     * <p>
     * The name of the model package. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9, and -
     * (hyphen).
     * </p>
     * <p>
     * This parameter is required for unversioned models. It is not applicable to versioned models.
     * </p>
     * 
     * @return The name of the model package. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9,
     *         and - (hyphen).</p>
     *         <p>
     *         This parameter is required for unversioned models. It is not applicable to versioned models.
     */

    public String getModelPackageName() {
        return this.modelPackageName;
    }

    /**
     * <p>
     * The name of the model package. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9, and -
     * (hyphen).
     * </p>
     * <p>
     * This parameter is required for unversioned models. It is not applicable to versioned models.
     * </p>
     * 
     * @param modelPackageName
     *        The name of the model package. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9,
     *        and - (hyphen).</p>
     *        <p>
     *        This parameter is required for unversioned models. It is not applicable to versioned models.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelPackageRequest withModelPackageName(String modelPackageName) {
        setModelPackageName(modelPackageName);
        return this;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the model package group that this model version belongs to.
     * </p>
     * <p>
     * This parameter is required for versioned models, and does not apply to unversioned models.
     * </p>
     * 
     * @param modelPackageGroupName
     *        The name or Amazon Resource Name (ARN) of the model package group that this model version belongs to.</p>
     *        <p>
     *        This parameter is required for versioned models, and does not apply to unversioned models.
     */

    public void setModelPackageGroupName(String modelPackageGroupName) {
        this.modelPackageGroupName = modelPackageGroupName;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the model package group that this model version belongs to.
     * </p>
     * <p>
     * This parameter is required for versioned models, and does not apply to unversioned models.
     * </p>
     * 
     * @return The name or Amazon Resource Name (ARN) of the model package group that this model version belongs to.</p>
     *         <p>
     *         This parameter is required for versioned models, and does not apply to unversioned models.
     */

    public String getModelPackageGroupName() {
        return this.modelPackageGroupName;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the model package group that this model version belongs to.
     * </p>
     * <p>
     * This parameter is required for versioned models, and does not apply to unversioned models.
     * </p>
     * 
     * @param modelPackageGroupName
     *        The name or Amazon Resource Name (ARN) of the model package group that this model version belongs to.</p>
     *        <p>
     *        This parameter is required for versioned models, and does not apply to unversioned models.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelPackageRequest withModelPackageGroupName(String modelPackageGroupName) {
        setModelPackageGroupName(modelPackageGroupName);
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
     * Specifies configurations for one or more transform jobs that SageMaker runs to test the model package.
     * </p>
     * 
     * @param validationSpecification
     *        Specifies configurations for one or more transform jobs that SageMaker runs to test the model package.
     */

    public void setValidationSpecification(ModelPackageValidationSpecification validationSpecification) {
        this.validationSpecification = validationSpecification;
    }

    /**
     * <p>
     * Specifies configurations for one or more transform jobs that SageMaker runs to test the model package.
     * </p>
     * 
     * @return Specifies configurations for one or more transform jobs that SageMaker runs to test the model package.
     */

    public ModelPackageValidationSpecification getValidationSpecification() {
        return this.validationSpecification;
    }

    /**
     * <p>
     * Specifies configurations for one or more transform jobs that SageMaker runs to test the model package.
     * </p>
     * 
     * @param validationSpecification
     *        Specifies configurations for one or more transform jobs that SageMaker runs to test the model package.
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
     * Whether to certify the model package for listing on Amazon Web Services Marketplace.
     * </p>
     * <p>
     * This parameter is optional for unversioned models, and does not apply to versioned models.
     * </p>
     * 
     * @param certifyForMarketplace
     *        Whether to certify the model package for listing on Amazon Web Services Marketplace.</p>
     *        <p>
     *        This parameter is optional for unversioned models, and does not apply to versioned models.
     */

    public void setCertifyForMarketplace(Boolean certifyForMarketplace) {
        this.certifyForMarketplace = certifyForMarketplace;
    }

    /**
     * <p>
     * Whether to certify the model package for listing on Amazon Web Services Marketplace.
     * </p>
     * <p>
     * This parameter is optional for unversioned models, and does not apply to versioned models.
     * </p>
     * 
     * @return Whether to certify the model package for listing on Amazon Web Services Marketplace.</p>
     *         <p>
     *         This parameter is optional for unversioned models, and does not apply to versioned models.
     */

    public Boolean getCertifyForMarketplace() {
        return this.certifyForMarketplace;
    }

    /**
     * <p>
     * Whether to certify the model package for listing on Amazon Web Services Marketplace.
     * </p>
     * <p>
     * This parameter is optional for unversioned models, and does not apply to versioned models.
     * </p>
     * 
     * @param certifyForMarketplace
     *        Whether to certify the model package for listing on Amazon Web Services Marketplace.</p>
     *        <p>
     *        This parameter is optional for unversioned models, and does not apply to versioned models.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelPackageRequest withCertifyForMarketplace(Boolean certifyForMarketplace) {
        setCertifyForMarketplace(certifyForMarketplace);
        return this;
    }

    /**
     * <p>
     * Whether to certify the model package for listing on Amazon Web Services Marketplace.
     * </p>
     * <p>
     * This parameter is optional for unversioned models, and does not apply to versioned models.
     * </p>
     * 
     * @return Whether to certify the model package for listing on Amazon Web Services Marketplace.</p>
     *         <p>
     *         This parameter is optional for unversioned models, and does not apply to versioned models.
     */

    public Boolean isCertifyForMarketplace() {
        return this.certifyForMarketplace;
    }

    /**
     * <p>
     * A list of key value pairs associated with the model. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference Guide</i>.
     * </p>
     * 
     * @return A list of key value pairs associated with the model. For more information, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *         resources</a> in the <i>Amazon Web Services General Reference Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key value pairs associated with the model. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of key value pairs associated with the model. For more information, see <a
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
     * A list of key value pairs associated with the model. For more information, see <a
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
     *        A list of key value pairs associated with the model. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        resources</a> in the <i>Amazon Web Services General Reference Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelPackageRequest withTags(Tag... tags) {
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
     * A list of key value pairs associated with the model. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of key value pairs associated with the model. For more information, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        resources</a> in the <i>Amazon Web Services General Reference Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelPackageRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Whether the model is approved for deployment.
     * </p>
     * <p>
     * This parameter is optional for versioned models, and does not apply to unversioned models.
     * </p>
     * <p>
     * For versioned models, the value of this parameter must be set to <code>Approved</code> to deploy the model.
     * </p>
     * 
     * @param modelApprovalStatus
     *        Whether the model is approved for deployment.</p>
     *        <p>
     *        This parameter is optional for versioned models, and does not apply to unversioned models.
     *        </p>
     *        <p>
     *        For versioned models, the value of this parameter must be set to <code>Approved</code> to deploy the
     *        model.
     * @see ModelApprovalStatus
     */

    public void setModelApprovalStatus(String modelApprovalStatus) {
        this.modelApprovalStatus = modelApprovalStatus;
    }

    /**
     * <p>
     * Whether the model is approved for deployment.
     * </p>
     * <p>
     * This parameter is optional for versioned models, and does not apply to unversioned models.
     * </p>
     * <p>
     * For versioned models, the value of this parameter must be set to <code>Approved</code> to deploy the model.
     * </p>
     * 
     * @return Whether the model is approved for deployment.</p>
     *         <p>
     *         This parameter is optional for versioned models, and does not apply to unversioned models.
     *         </p>
     *         <p>
     *         For versioned models, the value of this parameter must be set to <code>Approved</code> to deploy the
     *         model.
     * @see ModelApprovalStatus
     */

    public String getModelApprovalStatus() {
        return this.modelApprovalStatus;
    }

    /**
     * <p>
     * Whether the model is approved for deployment.
     * </p>
     * <p>
     * This parameter is optional for versioned models, and does not apply to unversioned models.
     * </p>
     * <p>
     * For versioned models, the value of this parameter must be set to <code>Approved</code> to deploy the model.
     * </p>
     * 
     * @param modelApprovalStatus
     *        Whether the model is approved for deployment.</p>
     *        <p>
     *        This parameter is optional for versioned models, and does not apply to unversioned models.
     *        </p>
     *        <p>
     *        For versioned models, the value of this parameter must be set to <code>Approved</code> to deploy the
     *        model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelApprovalStatus
     */

    public CreateModelPackageRequest withModelApprovalStatus(String modelApprovalStatus) {
        setModelApprovalStatus(modelApprovalStatus);
        return this;
    }

    /**
     * <p>
     * Whether the model is approved for deployment.
     * </p>
     * <p>
     * This parameter is optional for versioned models, and does not apply to unversioned models.
     * </p>
     * <p>
     * For versioned models, the value of this parameter must be set to <code>Approved</code> to deploy the model.
     * </p>
     * 
     * @param modelApprovalStatus
     *        Whether the model is approved for deployment.</p>
     *        <p>
     *        This parameter is optional for versioned models, and does not apply to unversioned models.
     *        </p>
     *        <p>
     *        For versioned models, the value of this parameter must be set to <code>Approved</code> to deploy the
     *        model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelApprovalStatus
     */

    public CreateModelPackageRequest withModelApprovalStatus(ModelApprovalStatus modelApprovalStatus) {
        this.modelApprovalStatus = modelApprovalStatus.toString();
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

    public CreateModelPackageRequest withMetadataProperties(MetadataProperties metadataProperties) {
        setMetadataProperties(metadataProperties);
        return this;
    }

    /**
     * <p>
     * A structure that contains model metrics reports.
     * </p>
     * 
     * @param modelMetrics
     *        A structure that contains model metrics reports.
     */

    public void setModelMetrics(ModelMetrics modelMetrics) {
        this.modelMetrics = modelMetrics;
    }

    /**
     * <p>
     * A structure that contains model metrics reports.
     * </p>
     * 
     * @return A structure that contains model metrics reports.
     */

    public ModelMetrics getModelMetrics() {
        return this.modelMetrics;
    }

    /**
     * <p>
     * A structure that contains model metrics reports.
     * </p>
     * 
     * @param modelMetrics
     *        A structure that contains model metrics reports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelPackageRequest withModelMetrics(ModelMetrics modelMetrics) {
        setModelMetrics(modelMetrics);
        return this;
    }

    /**
     * <p>
     * A unique token that guarantees that the call to this API is idempotent.
     * </p>
     * 
     * @param clientToken
     *        A unique token that guarantees that the call to this API is idempotent.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique token that guarantees that the call to this API is idempotent.
     * </p>
     * 
     * @return A unique token that guarantees that the call to this API is idempotent.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A unique token that guarantees that the call to this API is idempotent.
     * </p>
     * 
     * @param clientToken
     *        A unique token that guarantees that the call to this API is idempotent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelPackageRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The metadata properties associated with the model package versions.
     * </p>
     * 
     * @return The metadata properties associated with the model package versions.
     */

    public java.util.Map<String, String> getCustomerMetadataProperties() {
        return customerMetadataProperties;
    }

    /**
     * <p>
     * The metadata properties associated with the model package versions.
     * </p>
     * 
     * @param customerMetadataProperties
     *        The metadata properties associated with the model package versions.
     */

    public void setCustomerMetadataProperties(java.util.Map<String, String> customerMetadataProperties) {
        this.customerMetadataProperties = customerMetadataProperties;
    }

    /**
     * <p>
     * The metadata properties associated with the model package versions.
     * </p>
     * 
     * @param customerMetadataProperties
     *        The metadata properties associated with the model package versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelPackageRequest withCustomerMetadataProperties(java.util.Map<String, String> customerMetadataProperties) {
        setCustomerMetadataProperties(customerMetadataProperties);
        return this;
    }

    /**
     * Add a single CustomerMetadataProperties entry
     *
     * @see CreateModelPackageRequest#withCustomerMetadataProperties
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelPackageRequest addCustomerMetadataPropertiesEntry(String key, String value) {
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

    public CreateModelPackageRequest clearCustomerMetadataPropertiesEntries() {
        this.customerMetadataProperties = null;
        return this;
    }

    /**
     * <p>
     * Represents the drift check baselines that can be used when the model monitor is set using the model package. For
     * more information, see the topic on <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/pipelines-quality-clarify-baseline-lifecycle.html#pipelines-quality-clarify-baseline-drift-detection"
     * >Drift Detection against Previous Baselines in SageMaker Pipelines</a> in the <i>Amazon SageMaker Developer
     * Guide</i>.
     * </p>
     * 
     * @param driftCheckBaselines
     *        Represents the drift check baselines that can be used when the model monitor is set using the model
     *        package. For more information, see the topic on <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/pipelines-quality-clarify-baseline-lifecycle.html#pipelines-quality-clarify-baseline-drift-detection"
     *        >Drift Detection against Previous Baselines in SageMaker Pipelines</a> in the <i>Amazon SageMaker
     *        Developer Guide</i>.
     */

    public void setDriftCheckBaselines(DriftCheckBaselines driftCheckBaselines) {
        this.driftCheckBaselines = driftCheckBaselines;
    }

    /**
     * <p>
     * Represents the drift check baselines that can be used when the model monitor is set using the model package. For
     * more information, see the topic on <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/pipelines-quality-clarify-baseline-lifecycle.html#pipelines-quality-clarify-baseline-drift-detection"
     * >Drift Detection against Previous Baselines in SageMaker Pipelines</a> in the <i>Amazon SageMaker Developer
     * Guide</i>.
     * </p>
     * 
     * @return Represents the drift check baselines that can be used when the model monitor is set using the model
     *         package. For more information, see the topic on <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/pipelines-quality-clarify-baseline-lifecycle.html#pipelines-quality-clarify-baseline-drift-detection"
     *         >Drift Detection against Previous Baselines in SageMaker Pipelines</a> in the <i>Amazon SageMaker
     *         Developer Guide</i>.
     */

    public DriftCheckBaselines getDriftCheckBaselines() {
        return this.driftCheckBaselines;
    }

    /**
     * <p>
     * Represents the drift check baselines that can be used when the model monitor is set using the model package. For
     * more information, see the topic on <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/pipelines-quality-clarify-baseline-lifecycle.html#pipelines-quality-clarify-baseline-drift-detection"
     * >Drift Detection against Previous Baselines in SageMaker Pipelines</a> in the <i>Amazon SageMaker Developer
     * Guide</i>.
     * </p>
     * 
     * @param driftCheckBaselines
     *        Represents the drift check baselines that can be used when the model monitor is set using the model
     *        package. For more information, see the topic on <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/pipelines-quality-clarify-baseline-lifecycle.html#pipelines-quality-clarify-baseline-drift-detection"
     *        >Drift Detection against Previous Baselines in SageMaker Pipelines</a> in the <i>Amazon SageMaker
     *        Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelPackageRequest withDriftCheckBaselines(DriftCheckBaselines driftCheckBaselines) {
        setDriftCheckBaselines(driftCheckBaselines);
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

    public CreateModelPackageRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The machine learning task your model package accomplishes. Common machine learning tasks include object detection
     * and image classification. The following tasks are supported by Inference Recommender:
     * <code>"IMAGE_CLASSIFICATION"</code> | <code>"OBJECT_DETECTION"</code> | <code>"TEXT_GENERATION"</code> |
     * <code>"IMAGE_SEGMENTATION"</code> | <code>"FILL_MASK"</code> | <code>"CLASSIFICATION"</code> |
     * <code>"REGRESSION"</code> | <code>"OTHER"</code>.
     * </p>
     * <p>
     * Specify "OTHER" if none of the tasks listed fit your use case.
     * </p>
     * 
     * @param task
     *        The machine learning task your model package accomplishes. Common machine learning tasks include object
     *        detection and image classification. The following tasks are supported by Inference Recommender:
     *        <code>"IMAGE_CLASSIFICATION"</code> | <code>"OBJECT_DETECTION"</code> | <code>"TEXT_GENERATION"</code> |
     *        <code>"IMAGE_SEGMENTATION"</code> | <code>"FILL_MASK"</code> | <code>"CLASSIFICATION"</code> |
     *        <code>"REGRESSION"</code> | <code>"OTHER"</code>.</p>
     *        <p>
     *        Specify "OTHER" if none of the tasks listed fit your use case.
     */

    public void setTask(String task) {
        this.task = task;
    }

    /**
     * <p>
     * The machine learning task your model package accomplishes. Common machine learning tasks include object detection
     * and image classification. The following tasks are supported by Inference Recommender:
     * <code>"IMAGE_CLASSIFICATION"</code> | <code>"OBJECT_DETECTION"</code> | <code>"TEXT_GENERATION"</code> |
     * <code>"IMAGE_SEGMENTATION"</code> | <code>"FILL_MASK"</code> | <code>"CLASSIFICATION"</code> |
     * <code>"REGRESSION"</code> | <code>"OTHER"</code>.
     * </p>
     * <p>
     * Specify "OTHER" if none of the tasks listed fit your use case.
     * </p>
     * 
     * @return The machine learning task your model package accomplishes. Common machine learning tasks include object
     *         detection and image classification. The following tasks are supported by Inference Recommender:
     *         <code>"IMAGE_CLASSIFICATION"</code> | <code>"OBJECT_DETECTION"</code> | <code>"TEXT_GENERATION"</code> |
     *         <code>"IMAGE_SEGMENTATION"</code> | <code>"FILL_MASK"</code> | <code>"CLASSIFICATION"</code> |
     *         <code>"REGRESSION"</code> | <code>"OTHER"</code>.</p>
     *         <p>
     *         Specify "OTHER" if none of the tasks listed fit your use case.
     */

    public String getTask() {
        return this.task;
    }

    /**
     * <p>
     * The machine learning task your model package accomplishes. Common machine learning tasks include object detection
     * and image classification. The following tasks are supported by Inference Recommender:
     * <code>"IMAGE_CLASSIFICATION"</code> | <code>"OBJECT_DETECTION"</code> | <code>"TEXT_GENERATION"</code> |
     * <code>"IMAGE_SEGMENTATION"</code> | <code>"FILL_MASK"</code> | <code>"CLASSIFICATION"</code> |
     * <code>"REGRESSION"</code> | <code>"OTHER"</code>.
     * </p>
     * <p>
     * Specify "OTHER" if none of the tasks listed fit your use case.
     * </p>
     * 
     * @param task
     *        The machine learning task your model package accomplishes. Common machine learning tasks include object
     *        detection and image classification. The following tasks are supported by Inference Recommender:
     *        <code>"IMAGE_CLASSIFICATION"</code> | <code>"OBJECT_DETECTION"</code> | <code>"TEXT_GENERATION"</code> |
     *        <code>"IMAGE_SEGMENTATION"</code> | <code>"FILL_MASK"</code> | <code>"CLASSIFICATION"</code> |
     *        <code>"REGRESSION"</code> | <code>"OTHER"</code>.</p>
     *        <p>
     *        Specify "OTHER" if none of the tasks listed fit your use case.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelPackageRequest withTask(String task) {
        setTask(task);
        return this;
    }

    /**
     * <p>
     * The Amazon Simple Storage Service (Amazon S3) path where the sample payload are stored. This path must point to a
     * single gzip compressed tar archive (.tar.gz suffix).
     * </p>
     * 
     * @param samplePayloadUrl
     *        The Amazon Simple Storage Service (Amazon S3) path where the sample payload are stored. This path must
     *        point to a single gzip compressed tar archive (.tar.gz suffix).
     */

    public void setSamplePayloadUrl(String samplePayloadUrl) {
        this.samplePayloadUrl = samplePayloadUrl;
    }

    /**
     * <p>
     * The Amazon Simple Storage Service (Amazon S3) path where the sample payload are stored. This path must point to a
     * single gzip compressed tar archive (.tar.gz suffix).
     * </p>
     * 
     * @return The Amazon Simple Storage Service (Amazon S3) path where the sample payload are stored. This path must
     *         point to a single gzip compressed tar archive (.tar.gz suffix).
     */

    public String getSamplePayloadUrl() {
        return this.samplePayloadUrl;
    }

    /**
     * <p>
     * The Amazon Simple Storage Service (Amazon S3) path where the sample payload are stored. This path must point to a
     * single gzip compressed tar archive (.tar.gz suffix).
     * </p>
     * 
     * @param samplePayloadUrl
     *        The Amazon Simple Storage Service (Amazon S3) path where the sample payload are stored. This path must
     *        point to a single gzip compressed tar archive (.tar.gz suffix).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelPackageRequest withSamplePayloadUrl(String samplePayloadUrl) {
        setSamplePayloadUrl(samplePayloadUrl);
        return this;
    }

    /**
     * <p>
     * An array of additional Inference Specification objects. Each additional Inference Specification specifies
     * artifacts based on this model package that can be used on inference endpoints. Generally used with SageMaker Neo
     * to store the compiled artifacts.
     * </p>
     * 
     * @return An array of additional Inference Specification objects. Each additional Inference Specification specifies
     *         artifacts based on this model package that can be used on inference endpoints. Generally used with
     *         SageMaker Neo to store the compiled artifacts.
     */

    public java.util.List<AdditionalInferenceSpecificationDefinition> getAdditionalInferenceSpecifications() {
        return additionalInferenceSpecifications;
    }

    /**
     * <p>
     * An array of additional Inference Specification objects. Each additional Inference Specification specifies
     * artifacts based on this model package that can be used on inference endpoints. Generally used with SageMaker Neo
     * to store the compiled artifacts.
     * </p>
     * 
     * @param additionalInferenceSpecifications
     *        An array of additional Inference Specification objects. Each additional Inference Specification specifies
     *        artifacts based on this model package that can be used on inference endpoints. Generally used with
     *        SageMaker Neo to store the compiled artifacts.
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
     * An array of additional Inference Specification objects. Each additional Inference Specification specifies
     * artifacts based on this model package that can be used on inference endpoints. Generally used with SageMaker Neo
     * to store the compiled artifacts.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdditionalInferenceSpecifications(java.util.Collection)} or
     * {@link #withAdditionalInferenceSpecifications(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param additionalInferenceSpecifications
     *        An array of additional Inference Specification objects. Each additional Inference Specification specifies
     *        artifacts based on this model package that can be used on inference endpoints. Generally used with
     *        SageMaker Neo to store the compiled artifacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelPackageRequest withAdditionalInferenceSpecifications(AdditionalInferenceSpecificationDefinition... additionalInferenceSpecifications) {
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
     * An array of additional Inference Specification objects. Each additional Inference Specification specifies
     * artifacts based on this model package that can be used on inference endpoints. Generally used with SageMaker Neo
     * to store the compiled artifacts.
     * </p>
     * 
     * @param additionalInferenceSpecifications
     *        An array of additional Inference Specification objects. Each additional Inference Specification specifies
     *        artifacts based on this model package that can be used on inference endpoints. Generally used with
     *        SageMaker Neo to store the compiled artifacts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelPackageRequest withAdditionalInferenceSpecifications(
            java.util.Collection<AdditionalInferenceSpecificationDefinition> additionalInferenceSpecifications) {
        setAdditionalInferenceSpecifications(additionalInferenceSpecifications);
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
        if (getModelPackageDescription() != null)
            sb.append("ModelPackageDescription: ").append(getModelPackageDescription()).append(",");
        if (getInferenceSpecification() != null)
            sb.append("InferenceSpecification: ").append(getInferenceSpecification()).append(",");
        if (getValidationSpecification() != null)
            sb.append("ValidationSpecification: ").append(getValidationSpecification()).append(",");
        if (getSourceAlgorithmSpecification() != null)
            sb.append("SourceAlgorithmSpecification: ").append(getSourceAlgorithmSpecification()).append(",");
        if (getCertifyForMarketplace() != null)
            sb.append("CertifyForMarketplace: ").append(getCertifyForMarketplace()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getModelApprovalStatus() != null)
            sb.append("ModelApprovalStatus: ").append(getModelApprovalStatus()).append(",");
        if (getMetadataProperties() != null)
            sb.append("MetadataProperties: ").append(getMetadataProperties()).append(",");
        if (getModelMetrics() != null)
            sb.append("ModelMetrics: ").append(getModelMetrics()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getCustomerMetadataProperties() != null)
            sb.append("CustomerMetadataProperties: ").append(getCustomerMetadataProperties()).append(",");
        if (getDriftCheckBaselines() != null)
            sb.append("DriftCheckBaselines: ").append(getDriftCheckBaselines()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getTask() != null)
            sb.append("Task: ").append(getTask()).append(",");
        if (getSamplePayloadUrl() != null)
            sb.append("SamplePayloadUrl: ").append(getSamplePayloadUrl()).append(",");
        if (getAdditionalInferenceSpecifications() != null)
            sb.append("AdditionalInferenceSpecifications: ").append(getAdditionalInferenceSpecifications());
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
        if (other.getModelPackageGroupName() == null ^ this.getModelPackageGroupName() == null)
            return false;
        if (other.getModelPackageGroupName() != null && other.getModelPackageGroupName().equals(this.getModelPackageGroupName()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getModelApprovalStatus() == null ^ this.getModelApprovalStatus() == null)
            return false;
        if (other.getModelApprovalStatus() != null && other.getModelApprovalStatus().equals(this.getModelApprovalStatus()) == false)
            return false;
        if (other.getMetadataProperties() == null ^ this.getMetadataProperties() == null)
            return false;
        if (other.getMetadataProperties() != null && other.getMetadataProperties().equals(this.getMetadataProperties()) == false)
            return false;
        if (other.getModelMetrics() == null ^ this.getModelMetrics() == null)
            return false;
        if (other.getModelMetrics() != null && other.getModelMetrics().equals(this.getModelMetrics()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getCustomerMetadataProperties() == null ^ this.getCustomerMetadataProperties() == null)
            return false;
        if (other.getCustomerMetadataProperties() != null && other.getCustomerMetadataProperties().equals(this.getCustomerMetadataProperties()) == false)
            return false;
        if (other.getDriftCheckBaselines() == null ^ this.getDriftCheckBaselines() == null)
            return false;
        if (other.getDriftCheckBaselines() != null && other.getDriftCheckBaselines().equals(this.getDriftCheckBaselines()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelPackageName() == null) ? 0 : getModelPackageName().hashCode());
        hashCode = prime * hashCode + ((getModelPackageGroupName() == null) ? 0 : getModelPackageGroupName().hashCode());
        hashCode = prime * hashCode + ((getModelPackageDescription() == null) ? 0 : getModelPackageDescription().hashCode());
        hashCode = prime * hashCode + ((getInferenceSpecification() == null) ? 0 : getInferenceSpecification().hashCode());
        hashCode = prime * hashCode + ((getValidationSpecification() == null) ? 0 : getValidationSpecification().hashCode());
        hashCode = prime * hashCode + ((getSourceAlgorithmSpecification() == null) ? 0 : getSourceAlgorithmSpecification().hashCode());
        hashCode = prime * hashCode + ((getCertifyForMarketplace() == null) ? 0 : getCertifyForMarketplace().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getModelApprovalStatus() == null) ? 0 : getModelApprovalStatus().hashCode());
        hashCode = prime * hashCode + ((getMetadataProperties() == null) ? 0 : getMetadataProperties().hashCode());
        hashCode = prime * hashCode + ((getModelMetrics() == null) ? 0 : getModelMetrics().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getCustomerMetadataProperties() == null) ? 0 : getCustomerMetadataProperties().hashCode());
        hashCode = prime * hashCode + ((getDriftCheckBaselines() == null) ? 0 : getDriftCheckBaselines().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getTask() == null) ? 0 : getTask().hashCode());
        hashCode = prime * hashCode + ((getSamplePayloadUrl() == null) ? 0 : getSamplePayloadUrl().hashCode());
        hashCode = prime * hashCode + ((getAdditionalInferenceSpecifications() == null) ? 0 : getAdditionalInferenceSpecifications().hashCode());
        return hashCode;
    }

    @Override
    public CreateModelPackageRequest clone() {
        return (CreateModelPackageRequest) super.clone();
    }

}
