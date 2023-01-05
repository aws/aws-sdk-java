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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateInferenceExperiment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateInferenceExperimentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the inference experiment.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of the inference experiment that you want to run. The following types of experiments are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ShadowMode</code>: You can use this type to validate a shadow variant. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/shadow-tests.html">Shadow tests</a>.
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * The duration for which you want the inference experiment to run. If you don't specify this field, the experiment
     * automatically starts immediately upon creation and concludes after 7 days.
     * </p>
     */
    private InferenceExperimentSchedule schedule;
    /**
     * <p>
     * A description for the inference experiment.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ARN of the IAM role that Amazon SageMaker can assume to access model artifacts and container images, and
     * manage Amazon SageMaker Inference endpoints for model deployment.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The name of the Amazon SageMaker endpoint on which you want to run the inference experiment.
     * </p>
     */
    private String endpointName;
    /**
     * <p>
     * An array of <code>ModelVariantConfig</code> objects. There is one for each variant in the inference experiment.
     * Each <code>ModelVariantConfig</code> object in the array describes the infrastructure configuration for the
     * corresponding variant.
     * </p>
     */
    private java.util.List<ModelVariantConfig> modelVariants;
    /**
     * <p>
     * The Amazon S3 location and configuration for storing inference request and response data.
     * </p>
     * <p>
     * This is an optional parameter that you can use for data capture. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-data-capture.html">Capture data</a>.
     * </p>
     */
    private InferenceExperimentDataStorageConfig dataStorageConfig;
    /**
     * <p>
     * The configuration of <code>ShadowMode</code> inference experiment type. Use this field to specify a production
     * variant which takes all the inference requests, and a shadow variant to which Amazon SageMaker replicates a
     * percentage of the inference requests. For the shadow variant also specify the percentage of requests that Amazon
     * SageMaker replicates.
     * </p>
     */
    private ShadowModeConfig shadowModeConfig;
    /**
     * <p>
     * The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to
     * encrypt data on the storage volume attached to the ML compute instance that hosts the endpoint. The
     * <code>KmsKey</code> can be any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS key ID
     * </p>
     * <p>
     * <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS key
     * </p>
     * <p>
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * KMS key Alias
     * </p>
     * <p>
     * <code>"alias/ExampleAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS key Alias
     * </p>
     * <p>
     * <code>"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use a KMS key ID or an alias of your KMS key, the Amazon SageMaker execution role must include permissions
     * to call <code>kms:Encrypt</code>. If you don't provide a KMS key ID, Amazon SageMaker uses the default KMS key
     * for Amazon S3 for your role's account. Amazon SageMaker uses server-side encryption with KMS managed keys for
     * <code>OutputDataConfig</code>. If you use a bucket policy with an <code>s3:PutObject</code> permission that only
     * allows objects with server-side encryption, set the condition key of <code>s3:x-amz-server-side-encryption</code>
     * to <code>"aws:kms"</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">KMS managed Encryption Keys</a> in
     * the <i>Amazon Simple Storage Service Developer Guide.</i>
     * </p>
     * <p>
     * The KMS key policy must grant permission to the IAM role that you specify in your <code>CreateEndpoint</code> and
     * <code>UpdateEndpoint</code> requests. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Using Key Policies in Amazon Web
     * Services KMS</a> in the <i>Amazon Web Services Key Management Service Developer Guide</i>.
     * </p>
     */
    private String kmsKey;
    /**
     * <p>
     * Array of key-value pairs. You can use tags to categorize your Amazon Web Services resources in different ways,
     * for example, by purpose, owner, or environment. For more information, see <a
     * href="https://docs.aws.amazon.com/ARG/latest/userguide/tagging.html">Tagging your Amazon Web Services
     * Resources</a>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name for the inference experiment.
     * </p>
     * 
     * @param name
     *        The name for the inference experiment.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the inference experiment.
     * </p>
     * 
     * @return The name for the inference experiment.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the inference experiment.
     * </p>
     * 
     * @param name
     *        The name for the inference experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInferenceExperimentRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of the inference experiment that you want to run. The following types of experiments are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ShadowMode</code>: You can use this type to validate a shadow variant. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/shadow-tests.html">Shadow tests</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of the inference experiment that you want to run. The following types of experiments are
     *        possible: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ShadowMode</code>: You can use this type to validate a shadow variant. For more information, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/shadow-tests.html">Shadow tests</a>.
     *        </p>
     *        </li>
     * @see InferenceExperimentType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the inference experiment that you want to run. The following types of experiments are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ShadowMode</code>: You can use this type to validate a shadow variant. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/shadow-tests.html">Shadow tests</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of the inference experiment that you want to run. The following types of experiments are
     *         possible: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ShadowMode</code>: You can use this type to validate a shadow variant. For more information, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/shadow-tests.html">Shadow tests</a>.
     *         </p>
     *         </li>
     * @see InferenceExperimentType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the inference experiment that you want to run. The following types of experiments are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ShadowMode</code>: You can use this type to validate a shadow variant. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/shadow-tests.html">Shadow tests</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of the inference experiment that you want to run. The following types of experiments are
     *        possible: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ShadowMode</code>: You can use this type to validate a shadow variant. For more information, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/shadow-tests.html">Shadow tests</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferenceExperimentType
     */

    public CreateInferenceExperimentRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the inference experiment that you want to run. The following types of experiments are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ShadowMode</code>: You can use this type to validate a shadow variant. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/shadow-tests.html">Shadow tests</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of the inference experiment that you want to run. The following types of experiments are
     *        possible: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ShadowMode</code>: You can use this type to validate a shadow variant. For more information, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/shadow-tests.html">Shadow tests</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferenceExperimentType
     */

    public CreateInferenceExperimentRequest withType(InferenceExperimentType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The duration for which you want the inference experiment to run. If you don't specify this field, the experiment
     * automatically starts immediately upon creation and concludes after 7 days.
     * </p>
     * 
     * @param schedule
     *        The duration for which you want the inference experiment to run. If you don't specify this field, the
     *        experiment automatically starts immediately upon creation and concludes after 7 days.
     */

    public void setSchedule(InferenceExperimentSchedule schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * The duration for which you want the inference experiment to run. If you don't specify this field, the experiment
     * automatically starts immediately upon creation and concludes after 7 days.
     * </p>
     * 
     * @return The duration for which you want the inference experiment to run. If you don't specify this field, the
     *         experiment automatically starts immediately upon creation and concludes after 7 days.
     */

    public InferenceExperimentSchedule getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * The duration for which you want the inference experiment to run. If you don't specify this field, the experiment
     * automatically starts immediately upon creation and concludes after 7 days.
     * </p>
     * 
     * @param schedule
     *        The duration for which you want the inference experiment to run. If you don't specify this field, the
     *        experiment automatically starts immediately upon creation and concludes after 7 days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInferenceExperimentRequest withSchedule(InferenceExperimentSchedule schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * A description for the inference experiment.
     * </p>
     * 
     * @param description
     *        A description for the inference experiment.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the inference experiment.
     * </p>
     * 
     * @return A description for the inference experiment.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the inference experiment.
     * </p>
     * 
     * @param description
     *        A description for the inference experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInferenceExperimentRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that Amazon SageMaker can assume to access model artifacts and container images, and
     * manage Amazon SageMaker Inference endpoints for model deployment.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that Amazon SageMaker can assume to access model artifacts and container images,
     *        and manage Amazon SageMaker Inference endpoints for model deployment.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that Amazon SageMaker can assume to access model artifacts and container images, and
     * manage Amazon SageMaker Inference endpoints for model deployment.
     * </p>
     * 
     * @return The ARN of the IAM role that Amazon SageMaker can assume to access model artifacts and container images,
     *         and manage Amazon SageMaker Inference endpoints for model deployment.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that Amazon SageMaker can assume to access model artifacts and container images, and
     * manage Amazon SageMaker Inference endpoints for model deployment.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that Amazon SageMaker can assume to access model artifacts and container images,
     *        and manage Amazon SageMaker Inference endpoints for model deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInferenceExperimentRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon SageMaker endpoint on which you want to run the inference experiment.
     * </p>
     * 
     * @param endpointName
     *        The name of the Amazon SageMaker endpoint on which you want to run the inference experiment.
     */

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The name of the Amazon SageMaker endpoint on which you want to run the inference experiment.
     * </p>
     * 
     * @return The name of the Amazon SageMaker endpoint on which you want to run the inference experiment.
     */

    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * <p>
     * The name of the Amazon SageMaker endpoint on which you want to run the inference experiment.
     * </p>
     * 
     * @param endpointName
     *        The name of the Amazon SageMaker endpoint on which you want to run the inference experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInferenceExperimentRequest withEndpointName(String endpointName) {
        setEndpointName(endpointName);
        return this;
    }

    /**
     * <p>
     * An array of <code>ModelVariantConfig</code> objects. There is one for each variant in the inference experiment.
     * Each <code>ModelVariantConfig</code> object in the array describes the infrastructure configuration for the
     * corresponding variant.
     * </p>
     * 
     * @return An array of <code>ModelVariantConfig</code> objects. There is one for each variant in the inference
     *         experiment. Each <code>ModelVariantConfig</code> object in the array describes the infrastructure
     *         configuration for the corresponding variant.
     */

    public java.util.List<ModelVariantConfig> getModelVariants() {
        return modelVariants;
    }

    /**
     * <p>
     * An array of <code>ModelVariantConfig</code> objects. There is one for each variant in the inference experiment.
     * Each <code>ModelVariantConfig</code> object in the array describes the infrastructure configuration for the
     * corresponding variant.
     * </p>
     * 
     * @param modelVariants
     *        An array of <code>ModelVariantConfig</code> objects. There is one for each variant in the inference
     *        experiment. Each <code>ModelVariantConfig</code> object in the array describes the infrastructure
     *        configuration for the corresponding variant.
     */

    public void setModelVariants(java.util.Collection<ModelVariantConfig> modelVariants) {
        if (modelVariants == null) {
            this.modelVariants = null;
            return;
        }

        this.modelVariants = new java.util.ArrayList<ModelVariantConfig>(modelVariants);
    }

    /**
     * <p>
     * An array of <code>ModelVariantConfig</code> objects. There is one for each variant in the inference experiment.
     * Each <code>ModelVariantConfig</code> object in the array describes the infrastructure configuration for the
     * corresponding variant.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setModelVariants(java.util.Collection)} or {@link #withModelVariants(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param modelVariants
     *        An array of <code>ModelVariantConfig</code> objects. There is one for each variant in the inference
     *        experiment. Each <code>ModelVariantConfig</code> object in the array describes the infrastructure
     *        configuration for the corresponding variant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInferenceExperimentRequest withModelVariants(ModelVariantConfig... modelVariants) {
        if (this.modelVariants == null) {
            setModelVariants(new java.util.ArrayList<ModelVariantConfig>(modelVariants.length));
        }
        for (ModelVariantConfig ele : modelVariants) {
            this.modelVariants.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>ModelVariantConfig</code> objects. There is one for each variant in the inference experiment.
     * Each <code>ModelVariantConfig</code> object in the array describes the infrastructure configuration for the
     * corresponding variant.
     * </p>
     * 
     * @param modelVariants
     *        An array of <code>ModelVariantConfig</code> objects. There is one for each variant in the inference
     *        experiment. Each <code>ModelVariantConfig</code> object in the array describes the infrastructure
     *        configuration for the corresponding variant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInferenceExperimentRequest withModelVariants(java.util.Collection<ModelVariantConfig> modelVariants) {
        setModelVariants(modelVariants);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location and configuration for storing inference request and response data.
     * </p>
     * <p>
     * This is an optional parameter that you can use for data capture. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-data-capture.html">Capture data</a>.
     * </p>
     * 
     * @param dataStorageConfig
     *        The Amazon S3 location and configuration for storing inference request and response data. </p>
     *        <p>
     *        This is an optional parameter that you can use for data capture. For more information, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-data-capture.html">Capture data</a>.
     */

    public void setDataStorageConfig(InferenceExperimentDataStorageConfig dataStorageConfig) {
        this.dataStorageConfig = dataStorageConfig;
    }

    /**
     * <p>
     * The Amazon S3 location and configuration for storing inference request and response data.
     * </p>
     * <p>
     * This is an optional parameter that you can use for data capture. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-data-capture.html">Capture data</a>.
     * </p>
     * 
     * @return The Amazon S3 location and configuration for storing inference request and response data. </p>
     *         <p>
     *         This is an optional parameter that you can use for data capture. For more information, see <a
     *         href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-data-capture.html">Capture data</a>.
     */

    public InferenceExperimentDataStorageConfig getDataStorageConfig() {
        return this.dataStorageConfig;
    }

    /**
     * <p>
     * The Amazon S3 location and configuration for storing inference request and response data.
     * </p>
     * <p>
     * This is an optional parameter that you can use for data capture. For more information, see <a
     * href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-data-capture.html">Capture data</a>.
     * </p>
     * 
     * @param dataStorageConfig
     *        The Amazon S3 location and configuration for storing inference request and response data. </p>
     *        <p>
     *        This is an optional parameter that you can use for data capture. For more information, see <a
     *        href="https://docs.aws.amazon.com/sagemaker/latest/dg/model-monitor-data-capture.html">Capture data</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInferenceExperimentRequest withDataStorageConfig(InferenceExperimentDataStorageConfig dataStorageConfig) {
        setDataStorageConfig(dataStorageConfig);
        return this;
    }

    /**
     * <p>
     * The configuration of <code>ShadowMode</code> inference experiment type. Use this field to specify a production
     * variant which takes all the inference requests, and a shadow variant to which Amazon SageMaker replicates a
     * percentage of the inference requests. For the shadow variant also specify the percentage of requests that Amazon
     * SageMaker replicates.
     * </p>
     * 
     * @param shadowModeConfig
     *        The configuration of <code>ShadowMode</code> inference experiment type. Use this field to specify a
     *        production variant which takes all the inference requests, and a shadow variant to which Amazon SageMaker
     *        replicates a percentage of the inference requests. For the shadow variant also specify the percentage of
     *        requests that Amazon SageMaker replicates.
     */

    public void setShadowModeConfig(ShadowModeConfig shadowModeConfig) {
        this.shadowModeConfig = shadowModeConfig;
    }

    /**
     * <p>
     * The configuration of <code>ShadowMode</code> inference experiment type. Use this field to specify a production
     * variant which takes all the inference requests, and a shadow variant to which Amazon SageMaker replicates a
     * percentage of the inference requests. For the shadow variant also specify the percentage of requests that Amazon
     * SageMaker replicates.
     * </p>
     * 
     * @return The configuration of <code>ShadowMode</code> inference experiment type. Use this field to specify a
     *         production variant which takes all the inference requests, and a shadow variant to which Amazon SageMaker
     *         replicates a percentage of the inference requests. For the shadow variant also specify the percentage of
     *         requests that Amazon SageMaker replicates.
     */

    public ShadowModeConfig getShadowModeConfig() {
        return this.shadowModeConfig;
    }

    /**
     * <p>
     * The configuration of <code>ShadowMode</code> inference experiment type. Use this field to specify a production
     * variant which takes all the inference requests, and a shadow variant to which Amazon SageMaker replicates a
     * percentage of the inference requests. For the shadow variant also specify the percentage of requests that Amazon
     * SageMaker replicates.
     * </p>
     * 
     * @param shadowModeConfig
     *        The configuration of <code>ShadowMode</code> inference experiment type. Use this field to specify a
     *        production variant which takes all the inference requests, and a shadow variant to which Amazon SageMaker
     *        replicates a percentage of the inference requests. For the shadow variant also specify the percentage of
     *        requests that Amazon SageMaker replicates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInferenceExperimentRequest withShadowModeConfig(ShadowModeConfig shadowModeConfig) {
        setShadowModeConfig(shadowModeConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to
     * encrypt data on the storage volume attached to the ML compute instance that hosts the endpoint. The
     * <code>KmsKey</code> can be any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS key ID
     * </p>
     * <p>
     * <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS key
     * </p>
     * <p>
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * KMS key Alias
     * </p>
     * <p>
     * <code>"alias/ExampleAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS key Alias
     * </p>
     * <p>
     * <code>"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use a KMS key ID or an alias of your KMS key, the Amazon SageMaker execution role must include permissions
     * to call <code>kms:Encrypt</code>. If you don't provide a KMS key ID, Amazon SageMaker uses the default KMS key
     * for Amazon S3 for your role's account. Amazon SageMaker uses server-side encryption with KMS managed keys for
     * <code>OutputDataConfig</code>. If you use a bucket policy with an <code>s3:PutObject</code> permission that only
     * allows objects with server-side encryption, set the condition key of <code>s3:x-amz-server-side-encryption</code>
     * to <code>"aws:kms"</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">KMS managed Encryption Keys</a> in
     * the <i>Amazon Simple Storage Service Developer Guide.</i>
     * </p>
     * <p>
     * The KMS key policy must grant permission to the IAM role that you specify in your <code>CreateEndpoint</code> and
     * <code>UpdateEndpoint</code> requests. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Using Key Policies in Amazon Web
     * Services KMS</a> in the <i>Amazon Web Services Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param kmsKey
     *        The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to
     *        encrypt data on the storage volume attached to the ML compute instance that hosts the endpoint. The
     *        <code>KmsKey</code> can be any of the following formats: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        KMS key ID
     *        </p>
     *        <p>
     *        <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Resource Name (ARN) of a KMS key
     *        </p>
     *        <p>
     *        <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        KMS key Alias
     *        </p>
     *        <p>
     *        <code>"alias/ExampleAlias"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Resource Name (ARN) of a KMS key Alias
     *        </p>
     *        <p>
     *        <code>"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you use a KMS key ID or an alias of your KMS key, the Amazon SageMaker execution role must include
     *        permissions to call <code>kms:Encrypt</code>. If you don't provide a KMS key ID, Amazon SageMaker uses the
     *        default KMS key for Amazon S3 for your role's account. Amazon SageMaker uses server-side encryption with
     *        KMS managed keys for <code>OutputDataConfig</code>. If you use a bucket policy with an
     *        <code>s3:PutObject</code> permission that only allows objects with server-side encryption, set the
     *        condition key of <code>s3:x-amz-server-side-encryption</code> to <code>"aws:kms"</code>. For more
     *        information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">KMS
     *        managed Encryption Keys</a> in the <i>Amazon Simple Storage Service Developer Guide.</i>
     *        </p>
     *        <p>
     *        The KMS key policy must grant permission to the IAM role that you specify in your
     *        <code>CreateEndpoint</code> and <code>UpdateEndpoint</code> requests. For more information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Using Key Policies in
     *        Amazon Web Services KMS</a> in the <i>Amazon Web Services Key Management Service Developer Guide</i>.
     */

    public void setKmsKey(String kmsKey) {
        this.kmsKey = kmsKey;
    }

    /**
     * <p>
     * The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to
     * encrypt data on the storage volume attached to the ML compute instance that hosts the endpoint. The
     * <code>KmsKey</code> can be any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS key ID
     * </p>
     * <p>
     * <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS key
     * </p>
     * <p>
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * KMS key Alias
     * </p>
     * <p>
     * <code>"alias/ExampleAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS key Alias
     * </p>
     * <p>
     * <code>"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use a KMS key ID or an alias of your KMS key, the Amazon SageMaker execution role must include permissions
     * to call <code>kms:Encrypt</code>. If you don't provide a KMS key ID, Amazon SageMaker uses the default KMS key
     * for Amazon S3 for your role's account. Amazon SageMaker uses server-side encryption with KMS managed keys for
     * <code>OutputDataConfig</code>. If you use a bucket policy with an <code>s3:PutObject</code> permission that only
     * allows objects with server-side encryption, set the condition key of <code>s3:x-amz-server-side-encryption</code>
     * to <code>"aws:kms"</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">KMS managed Encryption Keys</a> in
     * the <i>Amazon Simple Storage Service Developer Guide.</i>
     * </p>
     * <p>
     * The KMS key policy must grant permission to the IAM role that you specify in your <code>CreateEndpoint</code> and
     * <code>UpdateEndpoint</code> requests. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Using Key Policies in Amazon Web
     * Services KMS</a> in the <i>Amazon Web Services Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @return The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses
     *         to encrypt data on the storage volume attached to the ML compute instance that hosts the endpoint. The
     *         <code>KmsKey</code> can be any of the following formats: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         KMS key ID
     *         </p>
     *         <p>
     *         <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Resource Name (ARN) of a KMS key
     *         </p>
     *         <p>
     *         <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         KMS key Alias
     *         </p>
     *         <p>
     *         <code>"alias/ExampleAlias"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Amazon Resource Name (ARN) of a KMS key Alias
     *         </p>
     *         <p>
     *         <code>"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you use a KMS key ID or an alias of your KMS key, the Amazon SageMaker execution role must include
     *         permissions to call <code>kms:Encrypt</code>. If you don't provide a KMS key ID, Amazon SageMaker uses
     *         the default KMS key for Amazon S3 for your role's account. Amazon SageMaker uses server-side encryption
     *         with KMS managed keys for <code>OutputDataConfig</code>. If you use a bucket policy with an
     *         <code>s3:PutObject</code> permission that only allows objects with server-side encryption, set the
     *         condition key of <code>s3:x-amz-server-side-encryption</code> to <code>"aws:kms"</code>. For more
     *         information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">KMS
     *         managed Encryption Keys</a> in the <i>Amazon Simple Storage Service Developer Guide.</i>
     *         </p>
     *         <p>
     *         The KMS key policy must grant permission to the IAM role that you specify in your
     *         <code>CreateEndpoint</code> and <code>UpdateEndpoint</code> requests. For more information, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Using Key Policies in
     *         Amazon Web Services KMS</a> in the <i>Amazon Web Services Key Management Service Developer Guide</i>.
     */

    public String getKmsKey() {
        return this.kmsKey;
    }

    /**
     * <p>
     * The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to
     * encrypt data on the storage volume attached to the ML compute instance that hosts the endpoint. The
     * <code>KmsKey</code> can be any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * KMS key ID
     * </p>
     * <p>
     * <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS key
     * </p>
     * <p>
     * <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * KMS key Alias
     * </p>
     * <p>
     * <code>"alias/ExampleAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Resource Name (ARN) of a KMS key Alias
     * </p>
     * <p>
     * <code>"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you use a KMS key ID or an alias of your KMS key, the Amazon SageMaker execution role must include permissions
     * to call <code>kms:Encrypt</code>. If you don't provide a KMS key ID, Amazon SageMaker uses the default KMS key
     * for Amazon S3 for your role's account. Amazon SageMaker uses server-side encryption with KMS managed keys for
     * <code>OutputDataConfig</code>. If you use a bucket policy with an <code>s3:PutObject</code> permission that only
     * allows objects with server-side encryption, set the condition key of <code>s3:x-amz-server-side-encryption</code>
     * to <code>"aws:kms"</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">KMS managed Encryption Keys</a> in
     * the <i>Amazon Simple Storage Service Developer Guide.</i>
     * </p>
     * <p>
     * The KMS key policy must grant permission to the IAM role that you specify in your <code>CreateEndpoint</code> and
     * <code>UpdateEndpoint</code> requests. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Using Key Policies in Amazon Web
     * Services KMS</a> in the <i>Amazon Web Services Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param kmsKey
     *        The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to
     *        encrypt data on the storage volume attached to the ML compute instance that hosts the endpoint. The
     *        <code>KmsKey</code> can be any of the following formats: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        KMS key ID
     *        </p>
     *        <p>
     *        <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Resource Name (ARN) of a KMS key
     *        </p>
     *        <p>
     *        <code>"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        KMS key Alias
     *        </p>
     *        <p>
     *        <code>"alias/ExampleAlias"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Amazon Resource Name (ARN) of a KMS key Alias
     *        </p>
     *        <p>
     *        <code>"arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you use a KMS key ID or an alias of your KMS key, the Amazon SageMaker execution role must include
     *        permissions to call <code>kms:Encrypt</code>. If you don't provide a KMS key ID, Amazon SageMaker uses the
     *        default KMS key for Amazon S3 for your role's account. Amazon SageMaker uses server-side encryption with
     *        KMS managed keys for <code>OutputDataConfig</code>. If you use a bucket policy with an
     *        <code>s3:PutObject</code> permission that only allows objects with server-side encryption, set the
     *        condition key of <code>s3:x-amz-server-side-encryption</code> to <code>"aws:kms"</code>. For more
     *        information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingKMSEncryption.html">KMS
     *        managed Encryption Keys</a> in the <i>Amazon Simple Storage Service Developer Guide.</i>
     *        </p>
     *        <p>
     *        The KMS key policy must grant permission to the IAM role that you specify in your
     *        <code>CreateEndpoint</code> and <code>UpdateEndpoint</code> requests. For more information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html">Using Key Policies in
     *        Amazon Web Services KMS</a> in the <i>Amazon Web Services Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInferenceExperimentRequest withKmsKey(String kmsKey) {
        setKmsKey(kmsKey);
        return this;
    }

    /**
     * <p>
     * Array of key-value pairs. You can use tags to categorize your Amazon Web Services resources in different ways,
     * for example, by purpose, owner, or environment. For more information, see <a
     * href="https://docs.aws.amazon.com/ARG/latest/userguide/tagging.html">Tagging your Amazon Web Services
     * Resources</a>.
     * </p>
     * 
     * @return Array of key-value pairs. You can use tags to categorize your Amazon Web Services resources in different
     *         ways, for example, by purpose, owner, or environment. For more information, see <a
     *         href="https://docs.aws.amazon.com/ARG/latest/userguide/tagging.html">Tagging your Amazon Web Services
     *         Resources</a>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Array of key-value pairs. You can use tags to categorize your Amazon Web Services resources in different ways,
     * for example, by purpose, owner, or environment. For more information, see <a
     * href="https://docs.aws.amazon.com/ARG/latest/userguide/tagging.html">Tagging your Amazon Web Services
     * Resources</a>.
     * </p>
     * 
     * @param tags
     *        Array of key-value pairs. You can use tags to categorize your Amazon Web Services resources in different
     *        ways, for example, by purpose, owner, or environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/ARG/latest/userguide/tagging.html">Tagging your Amazon Web Services
     *        Resources</a>.
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
     * Array of key-value pairs. You can use tags to categorize your Amazon Web Services resources in different ways,
     * for example, by purpose, owner, or environment. For more information, see <a
     * href="https://docs.aws.amazon.com/ARG/latest/userguide/tagging.html">Tagging your Amazon Web Services
     * Resources</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Array of key-value pairs. You can use tags to categorize your Amazon Web Services resources in different
     *        ways, for example, by purpose, owner, or environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/ARG/latest/userguide/tagging.html">Tagging your Amazon Web Services
     *        Resources</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInferenceExperimentRequest withTags(Tag... tags) {
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
     * Array of key-value pairs. You can use tags to categorize your Amazon Web Services resources in different ways,
     * for example, by purpose, owner, or environment. For more information, see <a
     * href="https://docs.aws.amazon.com/ARG/latest/userguide/tagging.html">Tagging your Amazon Web Services
     * Resources</a>.
     * </p>
     * 
     * @param tags
     *        Array of key-value pairs. You can use tags to categorize your Amazon Web Services resources in different
     *        ways, for example, by purpose, owner, or environment. For more information, see <a
     *        href="https://docs.aws.amazon.com/ARG/latest/userguide/tagging.html">Tagging your Amazon Web Services
     *        Resources</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInferenceExperimentRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getSchedule() != null)
            sb.append("Schedule: ").append(getSchedule()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getEndpointName() != null)
            sb.append("EndpointName: ").append(getEndpointName()).append(",");
        if (getModelVariants() != null)
            sb.append("ModelVariants: ").append(getModelVariants()).append(",");
        if (getDataStorageConfig() != null)
            sb.append("DataStorageConfig: ").append(getDataStorageConfig()).append(",");
        if (getShadowModeConfig() != null)
            sb.append("ShadowModeConfig: ").append(getShadowModeConfig()).append(",");
        if (getKmsKey() != null)
            sb.append("KmsKey: ").append(getKmsKey()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateInferenceExperimentRequest == false)
            return false;
        CreateInferenceExperimentRequest other = (CreateInferenceExperimentRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        if (other.getModelVariants() == null ^ this.getModelVariants() == null)
            return false;
        if (other.getModelVariants() != null && other.getModelVariants().equals(this.getModelVariants()) == false)
            return false;
        if (other.getDataStorageConfig() == null ^ this.getDataStorageConfig() == null)
            return false;
        if (other.getDataStorageConfig() != null && other.getDataStorageConfig().equals(this.getDataStorageConfig()) == false)
            return false;
        if (other.getShadowModeConfig() == null ^ this.getShadowModeConfig() == null)
            return false;
        if (other.getShadowModeConfig() != null && other.getShadowModeConfig().equals(this.getShadowModeConfig()) == false)
            return false;
        if (other.getKmsKey() == null ^ this.getKmsKey() == null)
            return false;
        if (other.getKmsKey() != null && other.getKmsKey().equals(this.getKmsKey()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime * hashCode + ((getModelVariants() == null) ? 0 : getModelVariants().hashCode());
        hashCode = prime * hashCode + ((getDataStorageConfig() == null) ? 0 : getDataStorageConfig().hashCode());
        hashCode = prime * hashCode + ((getShadowModeConfig() == null) ? 0 : getShadowModeConfig().hashCode());
        hashCode = prime * hashCode + ((getKmsKey() == null) ? 0 : getKmsKey().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateInferenceExperimentRequest clone() {
        return (CreateInferenceExperimentRequest) super.clone();
    }

}
