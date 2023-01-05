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
 * The input configuration of the recommendation job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/RecommendationJobInputConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationJobInputConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a versioned model package.
     * </p>
     */
    private String modelPackageVersionArn;
    /**
     * <p>
     * Specifies the maximum duration of the job, in seconds.&gt;
     * </p>
     */
    private Integer jobDurationInSeconds;
    /**
     * <p>
     * Specifies the traffic pattern of the job.
     * </p>
     */
    private TrafficPattern trafficPattern;
    /**
     * <p>
     * Defines the resource limit of the job.
     * </p>
     */
    private RecommendationJobResourceLimit resourceLimit;
    /**
     * <p>
     * Specifies the endpoint configuration to use for a job.
     * </p>
     */
    private java.util.List<EndpointInputConfiguration> endpointConfigurations;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Amazon Web Services Key Management Service (Amazon Web Services KMS) key that
     * Amazon SageMaker uses to encrypt data on the storage volume attached to the ML compute instance that hosts the
     * endpoint. This key will be passed to SageMaker Hosting for endpoint creation.
     * </p>
     * <p>
     * The SageMaker execution role must have <code>kms:CreateGrant</code> permission in order to encrypt data on the
     * storage volume of the endpoints created for inference recommendation. The inference recommendation job will fail
     * asynchronously during endpoint configuration creation if the role passed does not have
     * <code>kms:CreateGrant</code> permission.
     * </p>
     * <p>
     * The <code>KmsKeyId</code> can be any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * // KMS Key ID
     * </p>
     * <p>
     * <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key
     * </p>
     * <p>
     * <code>"arn:aws:kms:&lt;region&gt;:&lt;account&gt;:key/&lt;key-id-12ab-34cd-56ef-1234567890ab&gt;"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // KMS Key Alias
     * </p>
     * <p>
     * <code>"alias/ExampleAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key Alias
     * </p>
     * <p>
     * <code>"arn:aws:kms:&lt;region&gt;:&lt;account&gt;:alias/&lt;ExampleAlias&gt;"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about key identifiers, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-id">Key identifiers
     * (KeyID)</a> in the Amazon Web Services Key Management Service (Amazon Web Services KMS) documentation.
     * </p>
     */
    private String volumeKmsKeyId;
    /**
     * <p>
     * Specifies mandatory fields for running an Inference Recommender job. The fields specified in
     * <code>ContainerConfig</code> override the corresponding fields in the model package.
     * </p>
     */
    private RecommendationJobContainerConfig containerConfig;
    /**
     * <p>
     * Existing customer endpoints on which to run an Inference Recommender job.
     * </p>
     */
    private java.util.List<EndpointInfo> endpoints;
    /**
     * <p>
     * Inference Recommender provisions SageMaker endpoints with access to VPC in the inference recommendation job.
     * </p>
     */
    private RecommendationJobVpcConfig vpcConfig;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a versioned model package.
     * </p>
     * 
     * @param modelPackageVersionArn
     *        The Amazon Resource Name (ARN) of a versioned model package.
     */

    public void setModelPackageVersionArn(String modelPackageVersionArn) {
        this.modelPackageVersionArn = modelPackageVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a versioned model package.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a versioned model package.
     */

    public String getModelPackageVersionArn() {
        return this.modelPackageVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a versioned model package.
     * </p>
     * 
     * @param modelPackageVersionArn
     *        The Amazon Resource Name (ARN) of a versioned model package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationJobInputConfig withModelPackageVersionArn(String modelPackageVersionArn) {
        setModelPackageVersionArn(modelPackageVersionArn);
        return this;
    }

    /**
     * <p>
     * Specifies the maximum duration of the job, in seconds.&gt;
     * </p>
     * 
     * @param jobDurationInSeconds
     *        Specifies the maximum duration of the job, in seconds.&gt;
     */

    public void setJobDurationInSeconds(Integer jobDurationInSeconds) {
        this.jobDurationInSeconds = jobDurationInSeconds;
    }

    /**
     * <p>
     * Specifies the maximum duration of the job, in seconds.&gt;
     * </p>
     * 
     * @return Specifies the maximum duration of the job, in seconds.&gt;
     */

    public Integer getJobDurationInSeconds() {
        return this.jobDurationInSeconds;
    }

    /**
     * <p>
     * Specifies the maximum duration of the job, in seconds.&gt;
     * </p>
     * 
     * @param jobDurationInSeconds
     *        Specifies the maximum duration of the job, in seconds.&gt;
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationJobInputConfig withJobDurationInSeconds(Integer jobDurationInSeconds) {
        setJobDurationInSeconds(jobDurationInSeconds);
        return this;
    }

    /**
     * <p>
     * Specifies the traffic pattern of the job.
     * </p>
     * 
     * @param trafficPattern
     *        Specifies the traffic pattern of the job.
     */

    public void setTrafficPattern(TrafficPattern trafficPattern) {
        this.trafficPattern = trafficPattern;
    }

    /**
     * <p>
     * Specifies the traffic pattern of the job.
     * </p>
     * 
     * @return Specifies the traffic pattern of the job.
     */

    public TrafficPattern getTrafficPattern() {
        return this.trafficPattern;
    }

    /**
     * <p>
     * Specifies the traffic pattern of the job.
     * </p>
     * 
     * @param trafficPattern
     *        Specifies the traffic pattern of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationJobInputConfig withTrafficPattern(TrafficPattern trafficPattern) {
        setTrafficPattern(trafficPattern);
        return this;
    }

    /**
     * <p>
     * Defines the resource limit of the job.
     * </p>
     * 
     * @param resourceLimit
     *        Defines the resource limit of the job.
     */

    public void setResourceLimit(RecommendationJobResourceLimit resourceLimit) {
        this.resourceLimit = resourceLimit;
    }

    /**
     * <p>
     * Defines the resource limit of the job.
     * </p>
     * 
     * @return Defines the resource limit of the job.
     */

    public RecommendationJobResourceLimit getResourceLimit() {
        return this.resourceLimit;
    }

    /**
     * <p>
     * Defines the resource limit of the job.
     * </p>
     * 
     * @param resourceLimit
     *        Defines the resource limit of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationJobInputConfig withResourceLimit(RecommendationJobResourceLimit resourceLimit) {
        setResourceLimit(resourceLimit);
        return this;
    }

    /**
     * <p>
     * Specifies the endpoint configuration to use for a job.
     * </p>
     * 
     * @return Specifies the endpoint configuration to use for a job.
     */

    public java.util.List<EndpointInputConfiguration> getEndpointConfigurations() {
        return endpointConfigurations;
    }

    /**
     * <p>
     * Specifies the endpoint configuration to use for a job.
     * </p>
     * 
     * @param endpointConfigurations
     *        Specifies the endpoint configuration to use for a job.
     */

    public void setEndpointConfigurations(java.util.Collection<EndpointInputConfiguration> endpointConfigurations) {
        if (endpointConfigurations == null) {
            this.endpointConfigurations = null;
            return;
        }

        this.endpointConfigurations = new java.util.ArrayList<EndpointInputConfiguration>(endpointConfigurations);
    }

    /**
     * <p>
     * Specifies the endpoint configuration to use for a job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEndpointConfigurations(java.util.Collection)} or
     * {@link #withEndpointConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param endpointConfigurations
     *        Specifies the endpoint configuration to use for a job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationJobInputConfig withEndpointConfigurations(EndpointInputConfiguration... endpointConfigurations) {
        if (this.endpointConfigurations == null) {
            setEndpointConfigurations(new java.util.ArrayList<EndpointInputConfiguration>(endpointConfigurations.length));
        }
        for (EndpointInputConfiguration ele : endpointConfigurations) {
            this.endpointConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the endpoint configuration to use for a job.
     * </p>
     * 
     * @param endpointConfigurations
     *        Specifies the endpoint configuration to use for a job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationJobInputConfig withEndpointConfigurations(java.util.Collection<EndpointInputConfiguration> endpointConfigurations) {
        setEndpointConfigurations(endpointConfigurations);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Amazon Web Services Key Management Service (Amazon Web Services KMS) key that
     * Amazon SageMaker uses to encrypt data on the storage volume attached to the ML compute instance that hosts the
     * endpoint. This key will be passed to SageMaker Hosting for endpoint creation.
     * </p>
     * <p>
     * The SageMaker execution role must have <code>kms:CreateGrant</code> permission in order to encrypt data on the
     * storage volume of the endpoints created for inference recommendation. The inference recommendation job will fail
     * asynchronously during endpoint configuration creation if the role passed does not have
     * <code>kms:CreateGrant</code> permission.
     * </p>
     * <p>
     * The <code>KmsKeyId</code> can be any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * // KMS Key ID
     * </p>
     * <p>
     * <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key
     * </p>
     * <p>
     * <code>"arn:aws:kms:&lt;region&gt;:&lt;account&gt;:key/&lt;key-id-12ab-34cd-56ef-1234567890ab&gt;"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // KMS Key Alias
     * </p>
     * <p>
     * <code>"alias/ExampleAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key Alias
     * </p>
     * <p>
     * <code>"arn:aws:kms:&lt;region&gt;:&lt;account&gt;:alias/&lt;ExampleAlias&gt;"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about key identifiers, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-id">Key identifiers
     * (KeyID)</a> in the Amazon Web Services Key Management Service (Amazon Web Services KMS) documentation.
     * </p>
     * 
     * @param volumeKmsKeyId
     *        The Amazon Resource Name (ARN) of a Amazon Web Services Key Management Service (Amazon Web Services KMS)
     *        key that Amazon SageMaker uses to encrypt data on the storage volume attached to the ML compute instance
     *        that hosts the endpoint. This key will be passed to SageMaker Hosting for endpoint creation. </p>
     *        <p>
     *        The SageMaker execution role must have <code>kms:CreateGrant</code> permission in order to encrypt data on
     *        the storage volume of the endpoints created for inference recommendation. The inference recommendation job
     *        will fail asynchronously during endpoint configuration creation if the role passed does not have
     *        <code>kms:CreateGrant</code> permission.
     *        </p>
     *        <p>
     *        The <code>KmsKeyId</code> can be any of the following formats:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        // KMS Key ID
     *        </p>
     *        <p>
     *        <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        // Amazon Resource Name (ARN) of a KMS Key
     *        </p>
     *        <p>
     *        <code>"arn:aws:kms:&lt;region&gt;:&lt;account&gt;:key/&lt;key-id-12ab-34cd-56ef-1234567890ab&gt;"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        // KMS Key Alias
     *        </p>
     *        <p>
     *        <code>"alias/ExampleAlias"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        // Amazon Resource Name (ARN) of a KMS Key Alias
     *        </p>
     *        <p>
     *        <code>"arn:aws:kms:&lt;region&gt;:&lt;account&gt;:alias/&lt;ExampleAlias&gt;"</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about key identifiers, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-id">Key identifiers
     *        (KeyID)</a> in the Amazon Web Services Key Management Service (Amazon Web Services KMS) documentation.
     */

    public void setVolumeKmsKeyId(String volumeKmsKeyId) {
        this.volumeKmsKeyId = volumeKmsKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Amazon Web Services Key Management Service (Amazon Web Services KMS) key that
     * Amazon SageMaker uses to encrypt data on the storage volume attached to the ML compute instance that hosts the
     * endpoint. This key will be passed to SageMaker Hosting for endpoint creation.
     * </p>
     * <p>
     * The SageMaker execution role must have <code>kms:CreateGrant</code> permission in order to encrypt data on the
     * storage volume of the endpoints created for inference recommendation. The inference recommendation job will fail
     * asynchronously during endpoint configuration creation if the role passed does not have
     * <code>kms:CreateGrant</code> permission.
     * </p>
     * <p>
     * The <code>KmsKeyId</code> can be any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * // KMS Key ID
     * </p>
     * <p>
     * <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key
     * </p>
     * <p>
     * <code>"arn:aws:kms:&lt;region&gt;:&lt;account&gt;:key/&lt;key-id-12ab-34cd-56ef-1234567890ab&gt;"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // KMS Key Alias
     * </p>
     * <p>
     * <code>"alias/ExampleAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key Alias
     * </p>
     * <p>
     * <code>"arn:aws:kms:&lt;region&gt;:&lt;account&gt;:alias/&lt;ExampleAlias&gt;"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about key identifiers, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-id">Key identifiers
     * (KeyID)</a> in the Amazon Web Services Key Management Service (Amazon Web Services KMS) documentation.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a Amazon Web Services Key Management Service (Amazon Web Services KMS)
     *         key that Amazon SageMaker uses to encrypt data on the storage volume attached to the ML compute instance
     *         that hosts the endpoint. This key will be passed to SageMaker Hosting for endpoint creation. </p>
     *         <p>
     *         The SageMaker execution role must have <code>kms:CreateGrant</code> permission in order to encrypt data
     *         on the storage volume of the endpoints created for inference recommendation. The inference recommendation
     *         job will fail asynchronously during endpoint configuration creation if the role passed does not have
     *         <code>kms:CreateGrant</code> permission.
     *         </p>
     *         <p>
     *         The <code>KmsKeyId</code> can be any of the following formats:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         // KMS Key ID
     *         </p>
     *         <p>
     *         <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         // Amazon Resource Name (ARN) of a KMS Key
     *         </p>
     *         <p>
     *         <code>"arn:aws:kms:&lt;region&gt;:&lt;account&gt;:key/&lt;key-id-12ab-34cd-56ef-1234567890ab&gt;"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         // KMS Key Alias
     *         </p>
     *         <p>
     *         <code>"alias/ExampleAlias"</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         // Amazon Resource Name (ARN) of a KMS Key Alias
     *         </p>
     *         <p>
     *         <code>"arn:aws:kms:&lt;region&gt;:&lt;account&gt;:alias/&lt;ExampleAlias&gt;"</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information about key identifiers, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-id">Key identifiers
     *         (KeyID)</a> in the Amazon Web Services Key Management Service (Amazon Web Services KMS) documentation.
     */

    public String getVolumeKmsKeyId() {
        return this.volumeKmsKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a Amazon Web Services Key Management Service (Amazon Web Services KMS) key that
     * Amazon SageMaker uses to encrypt data on the storage volume attached to the ML compute instance that hosts the
     * endpoint. This key will be passed to SageMaker Hosting for endpoint creation.
     * </p>
     * <p>
     * The SageMaker execution role must have <code>kms:CreateGrant</code> permission in order to encrypt data on the
     * storage volume of the endpoints created for inference recommendation. The inference recommendation job will fail
     * asynchronously during endpoint configuration creation if the role passed does not have
     * <code>kms:CreateGrant</code> permission.
     * </p>
     * <p>
     * The <code>KmsKeyId</code> can be any of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * // KMS Key ID
     * </p>
     * <p>
     * <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key
     * </p>
     * <p>
     * <code>"arn:aws:kms:&lt;region&gt;:&lt;account&gt;:key/&lt;key-id-12ab-34cd-56ef-1234567890ab&gt;"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // KMS Key Alias
     * </p>
     * <p>
     * <code>"alias/ExampleAlias"</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * // Amazon Resource Name (ARN) of a KMS Key Alias
     * </p>
     * <p>
     * <code>"arn:aws:kms:&lt;region&gt;:&lt;account&gt;:alias/&lt;ExampleAlias&gt;"</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information about key identifiers, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-id">Key identifiers
     * (KeyID)</a> in the Amazon Web Services Key Management Service (Amazon Web Services KMS) documentation.
     * </p>
     * 
     * @param volumeKmsKeyId
     *        The Amazon Resource Name (ARN) of a Amazon Web Services Key Management Service (Amazon Web Services KMS)
     *        key that Amazon SageMaker uses to encrypt data on the storage volume attached to the ML compute instance
     *        that hosts the endpoint. This key will be passed to SageMaker Hosting for endpoint creation. </p>
     *        <p>
     *        The SageMaker execution role must have <code>kms:CreateGrant</code> permission in order to encrypt data on
     *        the storage volume of the endpoints created for inference recommendation. The inference recommendation job
     *        will fail asynchronously during endpoint configuration creation if the role passed does not have
     *        <code>kms:CreateGrant</code> permission.
     *        </p>
     *        <p>
     *        The <code>KmsKeyId</code> can be any of the following formats:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        // KMS Key ID
     *        </p>
     *        <p>
     *        <code>"1234abcd-12ab-34cd-56ef-1234567890ab"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        // Amazon Resource Name (ARN) of a KMS Key
     *        </p>
     *        <p>
     *        <code>"arn:aws:kms:&lt;region&gt;:&lt;account&gt;:key/&lt;key-id-12ab-34cd-56ef-1234567890ab&gt;"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        // KMS Key Alias
     *        </p>
     *        <p>
     *        <code>"alias/ExampleAlias"</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        // Amazon Resource Name (ARN) of a KMS Key Alias
     *        </p>
     *        <p>
     *        <code>"arn:aws:kms:&lt;region&gt;:&lt;account&gt;:alias/&lt;ExampleAlias&gt;"</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information about key identifiers, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-id">Key identifiers
     *        (KeyID)</a> in the Amazon Web Services Key Management Service (Amazon Web Services KMS) documentation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationJobInputConfig withVolumeKmsKeyId(String volumeKmsKeyId) {
        setVolumeKmsKeyId(volumeKmsKeyId);
        return this;
    }

    /**
     * <p>
     * Specifies mandatory fields for running an Inference Recommender job. The fields specified in
     * <code>ContainerConfig</code> override the corresponding fields in the model package.
     * </p>
     * 
     * @param containerConfig
     *        Specifies mandatory fields for running an Inference Recommender job. The fields specified in
     *        <code>ContainerConfig</code> override the corresponding fields in the model package.
     */

    public void setContainerConfig(RecommendationJobContainerConfig containerConfig) {
        this.containerConfig = containerConfig;
    }

    /**
     * <p>
     * Specifies mandatory fields for running an Inference Recommender job. The fields specified in
     * <code>ContainerConfig</code> override the corresponding fields in the model package.
     * </p>
     * 
     * @return Specifies mandatory fields for running an Inference Recommender job. The fields specified in
     *         <code>ContainerConfig</code> override the corresponding fields in the model package.
     */

    public RecommendationJobContainerConfig getContainerConfig() {
        return this.containerConfig;
    }

    /**
     * <p>
     * Specifies mandatory fields for running an Inference Recommender job. The fields specified in
     * <code>ContainerConfig</code> override the corresponding fields in the model package.
     * </p>
     * 
     * @param containerConfig
     *        Specifies mandatory fields for running an Inference Recommender job. The fields specified in
     *        <code>ContainerConfig</code> override the corresponding fields in the model package.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationJobInputConfig withContainerConfig(RecommendationJobContainerConfig containerConfig) {
        setContainerConfig(containerConfig);
        return this;
    }

    /**
     * <p>
     * Existing customer endpoints on which to run an Inference Recommender job.
     * </p>
     * 
     * @return Existing customer endpoints on which to run an Inference Recommender job.
     */

    public java.util.List<EndpointInfo> getEndpoints() {
        return endpoints;
    }

    /**
     * <p>
     * Existing customer endpoints on which to run an Inference Recommender job.
     * </p>
     * 
     * @param endpoints
     *        Existing customer endpoints on which to run an Inference Recommender job.
     */

    public void setEndpoints(java.util.Collection<EndpointInfo> endpoints) {
        if (endpoints == null) {
            this.endpoints = null;
            return;
        }

        this.endpoints = new java.util.ArrayList<EndpointInfo>(endpoints);
    }

    /**
     * <p>
     * Existing customer endpoints on which to run an Inference Recommender job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEndpoints(java.util.Collection)} or {@link #withEndpoints(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param endpoints
     *        Existing customer endpoints on which to run an Inference Recommender job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationJobInputConfig withEndpoints(EndpointInfo... endpoints) {
        if (this.endpoints == null) {
            setEndpoints(new java.util.ArrayList<EndpointInfo>(endpoints.length));
        }
        for (EndpointInfo ele : endpoints) {
            this.endpoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Existing customer endpoints on which to run an Inference Recommender job.
     * </p>
     * 
     * @param endpoints
     *        Existing customer endpoints on which to run an Inference Recommender job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationJobInputConfig withEndpoints(java.util.Collection<EndpointInfo> endpoints) {
        setEndpoints(endpoints);
        return this;
    }

    /**
     * <p>
     * Inference Recommender provisions SageMaker endpoints with access to VPC in the inference recommendation job.
     * </p>
     * 
     * @param vpcConfig
     *        Inference Recommender provisions SageMaker endpoints with access to VPC in the inference recommendation
     *        job.
     */

    public void setVpcConfig(RecommendationJobVpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * Inference Recommender provisions SageMaker endpoints with access to VPC in the inference recommendation job.
     * </p>
     * 
     * @return Inference Recommender provisions SageMaker endpoints with access to VPC in the inference recommendation
     *         job.
     */

    public RecommendationJobVpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * <p>
     * Inference Recommender provisions SageMaker endpoints with access to VPC in the inference recommendation job.
     * </p>
     * 
     * @param vpcConfig
     *        Inference Recommender provisions SageMaker endpoints with access to VPC in the inference recommendation
     *        job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommendationJobInputConfig withVpcConfig(RecommendationJobVpcConfig vpcConfig) {
        setVpcConfig(vpcConfig);
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
        if (getModelPackageVersionArn() != null)
            sb.append("ModelPackageVersionArn: ").append(getModelPackageVersionArn()).append(",");
        if (getJobDurationInSeconds() != null)
            sb.append("JobDurationInSeconds: ").append(getJobDurationInSeconds()).append(",");
        if (getTrafficPattern() != null)
            sb.append("TrafficPattern: ").append(getTrafficPattern()).append(",");
        if (getResourceLimit() != null)
            sb.append("ResourceLimit: ").append(getResourceLimit()).append(",");
        if (getEndpointConfigurations() != null)
            sb.append("EndpointConfigurations: ").append(getEndpointConfigurations()).append(",");
        if (getVolumeKmsKeyId() != null)
            sb.append("VolumeKmsKeyId: ").append(getVolumeKmsKeyId()).append(",");
        if (getContainerConfig() != null)
            sb.append("ContainerConfig: ").append(getContainerConfig()).append(",");
        if (getEndpoints() != null)
            sb.append("Endpoints: ").append(getEndpoints()).append(",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: ").append(getVpcConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommendationJobInputConfig == false)
            return false;
        RecommendationJobInputConfig other = (RecommendationJobInputConfig) obj;
        if (other.getModelPackageVersionArn() == null ^ this.getModelPackageVersionArn() == null)
            return false;
        if (other.getModelPackageVersionArn() != null && other.getModelPackageVersionArn().equals(this.getModelPackageVersionArn()) == false)
            return false;
        if (other.getJobDurationInSeconds() == null ^ this.getJobDurationInSeconds() == null)
            return false;
        if (other.getJobDurationInSeconds() != null && other.getJobDurationInSeconds().equals(this.getJobDurationInSeconds()) == false)
            return false;
        if (other.getTrafficPattern() == null ^ this.getTrafficPattern() == null)
            return false;
        if (other.getTrafficPattern() != null && other.getTrafficPattern().equals(this.getTrafficPattern()) == false)
            return false;
        if (other.getResourceLimit() == null ^ this.getResourceLimit() == null)
            return false;
        if (other.getResourceLimit() != null && other.getResourceLimit().equals(this.getResourceLimit()) == false)
            return false;
        if (other.getEndpointConfigurations() == null ^ this.getEndpointConfigurations() == null)
            return false;
        if (other.getEndpointConfigurations() != null && other.getEndpointConfigurations().equals(this.getEndpointConfigurations()) == false)
            return false;
        if (other.getVolumeKmsKeyId() == null ^ this.getVolumeKmsKeyId() == null)
            return false;
        if (other.getVolumeKmsKeyId() != null && other.getVolumeKmsKeyId().equals(this.getVolumeKmsKeyId()) == false)
            return false;
        if (other.getContainerConfig() == null ^ this.getContainerConfig() == null)
            return false;
        if (other.getContainerConfig() != null && other.getContainerConfig().equals(this.getContainerConfig()) == false)
            return false;
        if (other.getEndpoints() == null ^ this.getEndpoints() == null)
            return false;
        if (other.getEndpoints() != null && other.getEndpoints().equals(this.getEndpoints()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelPackageVersionArn() == null) ? 0 : getModelPackageVersionArn().hashCode());
        hashCode = prime * hashCode + ((getJobDurationInSeconds() == null) ? 0 : getJobDurationInSeconds().hashCode());
        hashCode = prime * hashCode + ((getTrafficPattern() == null) ? 0 : getTrafficPattern().hashCode());
        hashCode = prime * hashCode + ((getResourceLimit() == null) ? 0 : getResourceLimit().hashCode());
        hashCode = prime * hashCode + ((getEndpointConfigurations() == null) ? 0 : getEndpointConfigurations().hashCode());
        hashCode = prime * hashCode + ((getVolumeKmsKeyId() == null) ? 0 : getVolumeKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getContainerConfig() == null) ? 0 : getContainerConfig().hashCode());
        hashCode = prime * hashCode + ((getEndpoints() == null) ? 0 : getEndpoints().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        return hashCode;
    }

    @Override
    public RecommendationJobInputConfig clone() {
        try {
            return (RecommendationJobInputConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.RecommendationJobInputConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
