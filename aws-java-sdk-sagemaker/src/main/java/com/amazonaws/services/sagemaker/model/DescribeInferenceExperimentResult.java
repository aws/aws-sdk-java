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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeInferenceExperiment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInferenceExperimentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the inference experiment being described.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the inference experiment.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of the inference experiment.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The duration for which the inference experiment ran or will run.
     * </p>
     */
    private InferenceExperimentSchedule schedule;
    /**
     * <p>
     * The status of the inference experiment. The following are the possible statuses for an inference experiment:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Creating</code> - Amazon SageMaker is creating your experiment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Created</code> - Amazon SageMaker has finished the creation of your experiment and will begin the
     * experiment at the scheduled time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Updating</code> - When you make changes to your experiment, your experiment shows as updating.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Starting</code> - Amazon SageMaker is beginning your experiment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Running</code> - Your experiment is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopping</code> - Amazon SageMaker is stopping your experiment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Completed</code> - Your experiment has completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Cancelled</code> - When you conclude your experiment early using the <a>StopInferenceExperiment</a> API, or
     * if any operation fails with an unexpected error, it shows as cancelled.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The error message or client-specified <code>Reason</code> from the <a>StopInferenceExperiment</a> API, that
     * explains the status of the inference experiment.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * The description of the inference experiment.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The timestamp at which you created the inference experiment.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The timestamp at which the inference experiment was completed.
     * </p>
     */
    private java.util.Date completionTime;
    /**
     * <p>
     * The timestamp at which you last modified the inference experiment.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The ARN of the IAM role that Amazon SageMaker can assume to access model artifacts and container images, and
     * manage Amazon SageMaker Inference endpoints for model deployment.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The metadata of the endpoint on which the inference experiment ran.
     * </p>
     */
    private EndpointMetadata endpointMetadata;
    /**
     * <p>
     * An array of <code>ModelVariantConfigSummary</code> objects. There is one for each variant in the inference
     * experiment. Each <code>ModelVariantConfigSummary</code> object in the array describes the infrastructure
     * configuration for deploying the corresponding variant.
     * </p>
     */
    private java.util.List<ModelVariantConfigSummary> modelVariants;
    /**
     * <p>
     * The Amazon S3 location and configuration for storing inference request and response data.
     * </p>
     */
    private InferenceExperimentDataStorageConfig dataStorageConfig;
    /**
     * <p>
     * The configuration of <code>ShadowMode</code> inference experiment type, which shows the production variant that
     * takes all the inference requests, and the shadow variant to which Amazon SageMaker replicates a percentage of the
     * inference requests. For the shadow variant it also shows the percentage of requests that Amazon SageMaker
     * replicates.
     * </p>
     */
    private ShadowModeConfig shadowModeConfig;
    /**
     * <p>
     * The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to
     * encrypt data on the storage volume attached to the ML compute instance that hosts the endpoint. For more
     * information, see <a>CreateInferenceExperimentRequest$KmsKey</a>.
     * </p>
     */
    private String kmsKey;

    /**
     * <p>
     * The ARN of the inference experiment being described.
     * </p>
     * 
     * @param arn
     *        The ARN of the inference experiment being described.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the inference experiment being described.
     * </p>
     * 
     * @return The ARN of the inference experiment being described.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the inference experiment being described.
     * </p>
     * 
     * @param arn
     *        The ARN of the inference experiment being described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInferenceExperimentResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the inference experiment.
     * </p>
     * 
     * @param name
     *        The name of the inference experiment.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the inference experiment.
     * </p>
     * 
     * @return The name of the inference experiment.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the inference experiment.
     * </p>
     * 
     * @param name
     *        The name of the inference experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInferenceExperimentResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of the inference experiment.
     * </p>
     * 
     * @param type
     *        The type of the inference experiment.
     * @see InferenceExperimentType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the inference experiment.
     * </p>
     * 
     * @return The type of the inference experiment.
     * @see InferenceExperimentType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the inference experiment.
     * </p>
     * 
     * @param type
     *        The type of the inference experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferenceExperimentType
     */

    public DescribeInferenceExperimentResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the inference experiment.
     * </p>
     * 
     * @param type
     *        The type of the inference experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferenceExperimentType
     */

    public DescribeInferenceExperimentResult withType(InferenceExperimentType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The duration for which the inference experiment ran or will run.
     * </p>
     * 
     * @param schedule
     *        The duration for which the inference experiment ran or will run.
     */

    public void setSchedule(InferenceExperimentSchedule schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * The duration for which the inference experiment ran or will run.
     * </p>
     * 
     * @return The duration for which the inference experiment ran or will run.
     */

    public InferenceExperimentSchedule getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * The duration for which the inference experiment ran or will run.
     * </p>
     * 
     * @param schedule
     *        The duration for which the inference experiment ran or will run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInferenceExperimentResult withSchedule(InferenceExperimentSchedule schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * The status of the inference experiment. The following are the possible statuses for an inference experiment:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Creating</code> - Amazon SageMaker is creating your experiment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Created</code> - Amazon SageMaker has finished the creation of your experiment and will begin the
     * experiment at the scheduled time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Updating</code> - When you make changes to your experiment, your experiment shows as updating.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Starting</code> - Amazon SageMaker is beginning your experiment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Running</code> - Your experiment is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopping</code> - Amazon SageMaker is stopping your experiment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Completed</code> - Your experiment has completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Cancelled</code> - When you conclude your experiment early using the <a>StopInferenceExperiment</a> API, or
     * if any operation fails with an unexpected error, it shows as cancelled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the inference experiment. The following are the possible statuses for an inference
     *        experiment: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Creating</code> - Amazon SageMaker is creating your experiment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Created</code> - Amazon SageMaker has finished the creation of your experiment and will begin the
     *        experiment at the scheduled time.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Updating</code> - When you make changes to your experiment, your experiment shows as updating.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Starting</code> - Amazon SageMaker is beginning your experiment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Running</code> - Your experiment is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Stopping</code> - Amazon SageMaker is stopping your experiment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Completed</code> - Your experiment has completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Cancelled</code> - When you conclude your experiment early using the <a>StopInferenceExperiment</a>
     *        API, or if any operation fails with an unexpected error, it shows as cancelled.
     *        </p>
     *        </li>
     * @see InferenceExperimentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the inference experiment. The following are the possible statuses for an inference experiment:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Creating</code> - Amazon SageMaker is creating your experiment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Created</code> - Amazon SageMaker has finished the creation of your experiment and will begin the
     * experiment at the scheduled time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Updating</code> - When you make changes to your experiment, your experiment shows as updating.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Starting</code> - Amazon SageMaker is beginning your experiment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Running</code> - Your experiment is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopping</code> - Amazon SageMaker is stopping your experiment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Completed</code> - Your experiment has completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Cancelled</code> - When you conclude your experiment early using the <a>StopInferenceExperiment</a> API, or
     * if any operation fails with an unexpected error, it shows as cancelled.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the inference experiment. The following are the possible statuses for an inference
     *         experiment: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Creating</code> - Amazon SageMaker is creating your experiment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Created</code> - Amazon SageMaker has finished the creation of your experiment and will begin the
     *         experiment at the scheduled time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Updating</code> - When you make changes to your experiment, your experiment shows as updating.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Starting</code> - Amazon SageMaker is beginning your experiment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Running</code> - Your experiment is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Stopping</code> - Amazon SageMaker is stopping your experiment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Completed</code> - Your experiment has completed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Cancelled</code> - When you conclude your experiment early using the <a>StopInferenceExperiment</a>
     *         API, or if any operation fails with an unexpected error, it shows as cancelled.
     *         </p>
     *         </li>
     * @see InferenceExperimentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the inference experiment. The following are the possible statuses for an inference experiment:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Creating</code> - Amazon SageMaker is creating your experiment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Created</code> - Amazon SageMaker has finished the creation of your experiment and will begin the
     * experiment at the scheduled time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Updating</code> - When you make changes to your experiment, your experiment shows as updating.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Starting</code> - Amazon SageMaker is beginning your experiment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Running</code> - Your experiment is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopping</code> - Amazon SageMaker is stopping your experiment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Completed</code> - Your experiment has completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Cancelled</code> - When you conclude your experiment early using the <a>StopInferenceExperiment</a> API, or
     * if any operation fails with an unexpected error, it shows as cancelled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the inference experiment. The following are the possible statuses for an inference
     *        experiment: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Creating</code> - Amazon SageMaker is creating your experiment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Created</code> - Amazon SageMaker has finished the creation of your experiment and will begin the
     *        experiment at the scheduled time.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Updating</code> - When you make changes to your experiment, your experiment shows as updating.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Starting</code> - Amazon SageMaker is beginning your experiment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Running</code> - Your experiment is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Stopping</code> - Amazon SageMaker is stopping your experiment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Completed</code> - Your experiment has completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Cancelled</code> - When you conclude your experiment early using the <a>StopInferenceExperiment</a>
     *        API, or if any operation fails with an unexpected error, it shows as cancelled.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferenceExperimentStatus
     */

    public DescribeInferenceExperimentResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the inference experiment. The following are the possible statuses for an inference experiment:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Creating</code> - Amazon SageMaker is creating your experiment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Created</code> - Amazon SageMaker has finished the creation of your experiment and will begin the
     * experiment at the scheduled time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Updating</code> - When you make changes to your experiment, your experiment shows as updating.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Starting</code> - Amazon SageMaker is beginning your experiment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Running</code> - Your experiment is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Stopping</code> - Amazon SageMaker is stopping your experiment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Completed</code> - Your experiment has completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Cancelled</code> - When you conclude your experiment early using the <a>StopInferenceExperiment</a> API, or
     * if any operation fails with an unexpected error, it shows as cancelled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the inference experiment. The following are the possible statuses for an inference
     *        experiment: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Creating</code> - Amazon SageMaker is creating your experiment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Created</code> - Amazon SageMaker has finished the creation of your experiment and will begin the
     *        experiment at the scheduled time.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Updating</code> - When you make changes to your experiment, your experiment shows as updating.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Starting</code> - Amazon SageMaker is beginning your experiment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Running</code> - Your experiment is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Stopping</code> - Amazon SageMaker is stopping your experiment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Completed</code> - Your experiment has completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Cancelled</code> - When you conclude your experiment early using the <a>StopInferenceExperiment</a>
     *        API, or if any operation fails with an unexpected error, it shows as cancelled.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferenceExperimentStatus
     */

    public DescribeInferenceExperimentResult withStatus(InferenceExperimentStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The error message or client-specified <code>Reason</code> from the <a>StopInferenceExperiment</a> API, that
     * explains the status of the inference experiment.
     * </p>
     * 
     * @param statusReason
     *        The error message or client-specified <code>Reason</code> from the <a>StopInferenceExperiment</a> API,
     *        that explains the status of the inference experiment.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The error message or client-specified <code>Reason</code> from the <a>StopInferenceExperiment</a> API, that
     * explains the status of the inference experiment.
     * </p>
     * 
     * @return The error message or client-specified <code>Reason</code> from the <a>StopInferenceExperiment</a> API,
     *         that explains the status of the inference experiment.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The error message or client-specified <code>Reason</code> from the <a>StopInferenceExperiment</a> API, that
     * explains the status of the inference experiment.
     * </p>
     * 
     * @param statusReason
     *        The error message or client-specified <code>Reason</code> from the <a>StopInferenceExperiment</a> API,
     *        that explains the status of the inference experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInferenceExperimentResult withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * The description of the inference experiment.
     * </p>
     * 
     * @param description
     *        The description of the inference experiment.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the inference experiment.
     * </p>
     * 
     * @return The description of the inference experiment.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the inference experiment.
     * </p>
     * 
     * @param description
     *        The description of the inference experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInferenceExperimentResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The timestamp at which you created the inference experiment.
     * </p>
     * 
     * @param creationTime
     *        The timestamp at which you created the inference experiment.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The timestamp at which you created the inference experiment.
     * </p>
     * 
     * @return The timestamp at which you created the inference experiment.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The timestamp at which you created the inference experiment.
     * </p>
     * 
     * @param creationTime
     *        The timestamp at which you created the inference experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInferenceExperimentResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The timestamp at which the inference experiment was completed.
     * </p>
     * 
     * @param completionTime
     *        The timestamp at which the inference experiment was completed.
     */

    public void setCompletionTime(java.util.Date completionTime) {
        this.completionTime = completionTime;
    }

    /**
     * <p>
     * The timestamp at which the inference experiment was completed.
     * </p>
     * 
     * @return The timestamp at which the inference experiment was completed.
     */

    public java.util.Date getCompletionTime() {
        return this.completionTime;
    }

    /**
     * <p>
     * The timestamp at which the inference experiment was completed.
     * </p>
     * 
     * @param completionTime
     *        The timestamp at which the inference experiment was completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInferenceExperimentResult withCompletionTime(java.util.Date completionTime) {
        setCompletionTime(completionTime);
        return this;
    }

    /**
     * <p>
     * The timestamp at which you last modified the inference experiment.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp at which you last modified the inference experiment.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp at which you last modified the inference experiment.
     * </p>
     * 
     * @return The timestamp at which you last modified the inference experiment.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp at which you last modified the inference experiment.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp at which you last modified the inference experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInferenceExperimentResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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

    public DescribeInferenceExperimentResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The metadata of the endpoint on which the inference experiment ran.
     * </p>
     * 
     * @param endpointMetadata
     *        The metadata of the endpoint on which the inference experiment ran.
     */

    public void setEndpointMetadata(EndpointMetadata endpointMetadata) {
        this.endpointMetadata = endpointMetadata;
    }

    /**
     * <p>
     * The metadata of the endpoint on which the inference experiment ran.
     * </p>
     * 
     * @return The metadata of the endpoint on which the inference experiment ran.
     */

    public EndpointMetadata getEndpointMetadata() {
        return this.endpointMetadata;
    }

    /**
     * <p>
     * The metadata of the endpoint on which the inference experiment ran.
     * </p>
     * 
     * @param endpointMetadata
     *        The metadata of the endpoint on which the inference experiment ran.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInferenceExperimentResult withEndpointMetadata(EndpointMetadata endpointMetadata) {
        setEndpointMetadata(endpointMetadata);
        return this;
    }

    /**
     * <p>
     * An array of <code>ModelVariantConfigSummary</code> objects. There is one for each variant in the inference
     * experiment. Each <code>ModelVariantConfigSummary</code> object in the array describes the infrastructure
     * configuration for deploying the corresponding variant.
     * </p>
     * 
     * @return An array of <code>ModelVariantConfigSummary</code> objects. There is one for each variant in the
     *         inference experiment. Each <code>ModelVariantConfigSummary</code> object in the array describes the
     *         infrastructure configuration for deploying the corresponding variant.
     */

    public java.util.List<ModelVariantConfigSummary> getModelVariants() {
        return modelVariants;
    }

    /**
     * <p>
     * An array of <code>ModelVariantConfigSummary</code> objects. There is one for each variant in the inference
     * experiment. Each <code>ModelVariantConfigSummary</code> object in the array describes the infrastructure
     * configuration for deploying the corresponding variant.
     * </p>
     * 
     * @param modelVariants
     *        An array of <code>ModelVariantConfigSummary</code> objects. There is one for each variant in the inference
     *        experiment. Each <code>ModelVariantConfigSummary</code> object in the array describes the infrastructure
     *        configuration for deploying the corresponding variant.
     */

    public void setModelVariants(java.util.Collection<ModelVariantConfigSummary> modelVariants) {
        if (modelVariants == null) {
            this.modelVariants = null;
            return;
        }

        this.modelVariants = new java.util.ArrayList<ModelVariantConfigSummary>(modelVariants);
    }

    /**
     * <p>
     * An array of <code>ModelVariantConfigSummary</code> objects. There is one for each variant in the inference
     * experiment. Each <code>ModelVariantConfigSummary</code> object in the array describes the infrastructure
     * configuration for deploying the corresponding variant.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setModelVariants(java.util.Collection)} or {@link #withModelVariants(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param modelVariants
     *        An array of <code>ModelVariantConfigSummary</code> objects. There is one for each variant in the inference
     *        experiment. Each <code>ModelVariantConfigSummary</code> object in the array describes the infrastructure
     *        configuration for deploying the corresponding variant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInferenceExperimentResult withModelVariants(ModelVariantConfigSummary... modelVariants) {
        if (this.modelVariants == null) {
            setModelVariants(new java.util.ArrayList<ModelVariantConfigSummary>(modelVariants.length));
        }
        for (ModelVariantConfigSummary ele : modelVariants) {
            this.modelVariants.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>ModelVariantConfigSummary</code> objects. There is one for each variant in the inference
     * experiment. Each <code>ModelVariantConfigSummary</code> object in the array describes the infrastructure
     * configuration for deploying the corresponding variant.
     * </p>
     * 
     * @param modelVariants
     *        An array of <code>ModelVariantConfigSummary</code> objects. There is one for each variant in the inference
     *        experiment. Each <code>ModelVariantConfigSummary</code> object in the array describes the infrastructure
     *        configuration for deploying the corresponding variant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInferenceExperimentResult withModelVariants(java.util.Collection<ModelVariantConfigSummary> modelVariants) {
        setModelVariants(modelVariants);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location and configuration for storing inference request and response data.
     * </p>
     * 
     * @param dataStorageConfig
     *        The Amazon S3 location and configuration for storing inference request and response data.
     */

    public void setDataStorageConfig(InferenceExperimentDataStorageConfig dataStorageConfig) {
        this.dataStorageConfig = dataStorageConfig;
    }

    /**
     * <p>
     * The Amazon S3 location and configuration for storing inference request and response data.
     * </p>
     * 
     * @return The Amazon S3 location and configuration for storing inference request and response data.
     */

    public InferenceExperimentDataStorageConfig getDataStorageConfig() {
        return this.dataStorageConfig;
    }

    /**
     * <p>
     * The Amazon S3 location and configuration for storing inference request and response data.
     * </p>
     * 
     * @param dataStorageConfig
     *        The Amazon S3 location and configuration for storing inference request and response data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInferenceExperimentResult withDataStorageConfig(InferenceExperimentDataStorageConfig dataStorageConfig) {
        setDataStorageConfig(dataStorageConfig);
        return this;
    }

    /**
     * <p>
     * The configuration of <code>ShadowMode</code> inference experiment type, which shows the production variant that
     * takes all the inference requests, and the shadow variant to which Amazon SageMaker replicates a percentage of the
     * inference requests. For the shadow variant it also shows the percentage of requests that Amazon SageMaker
     * replicates.
     * </p>
     * 
     * @param shadowModeConfig
     *        The configuration of <code>ShadowMode</code> inference experiment type, which shows the production variant
     *        that takes all the inference requests, and the shadow variant to which Amazon SageMaker replicates a
     *        percentage of the inference requests. For the shadow variant it also shows the percentage of requests that
     *        Amazon SageMaker replicates.
     */

    public void setShadowModeConfig(ShadowModeConfig shadowModeConfig) {
        this.shadowModeConfig = shadowModeConfig;
    }

    /**
     * <p>
     * The configuration of <code>ShadowMode</code> inference experiment type, which shows the production variant that
     * takes all the inference requests, and the shadow variant to which Amazon SageMaker replicates a percentage of the
     * inference requests. For the shadow variant it also shows the percentage of requests that Amazon SageMaker
     * replicates.
     * </p>
     * 
     * @return The configuration of <code>ShadowMode</code> inference experiment type, which shows the production
     *         variant that takes all the inference requests, and the shadow variant to which Amazon SageMaker
     *         replicates a percentage of the inference requests. For the shadow variant it also shows the percentage of
     *         requests that Amazon SageMaker replicates.
     */

    public ShadowModeConfig getShadowModeConfig() {
        return this.shadowModeConfig;
    }

    /**
     * <p>
     * The configuration of <code>ShadowMode</code> inference experiment type, which shows the production variant that
     * takes all the inference requests, and the shadow variant to which Amazon SageMaker replicates a percentage of the
     * inference requests. For the shadow variant it also shows the percentage of requests that Amazon SageMaker
     * replicates.
     * </p>
     * 
     * @param shadowModeConfig
     *        The configuration of <code>ShadowMode</code> inference experiment type, which shows the production variant
     *        that takes all the inference requests, and the shadow variant to which Amazon SageMaker replicates a
     *        percentage of the inference requests. For the shadow variant it also shows the percentage of requests that
     *        Amazon SageMaker replicates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInferenceExperimentResult withShadowModeConfig(ShadowModeConfig shadowModeConfig) {
        setShadowModeConfig(shadowModeConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to
     * encrypt data on the storage volume attached to the ML compute instance that hosts the endpoint. For more
     * information, see <a>CreateInferenceExperimentRequest$KmsKey</a>.
     * </p>
     * 
     * @param kmsKey
     *        The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to
     *        encrypt data on the storage volume attached to the ML compute instance that hosts the endpoint. For more
     *        information, see <a>CreateInferenceExperimentRequest$KmsKey</a>.
     */

    public void setKmsKey(String kmsKey) {
        this.kmsKey = kmsKey;
    }

    /**
     * <p>
     * The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to
     * encrypt data on the storage volume attached to the ML compute instance that hosts the endpoint. For more
     * information, see <a>CreateInferenceExperimentRequest$KmsKey</a>.
     * </p>
     * 
     * @return The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses
     *         to encrypt data on the storage volume attached to the ML compute instance that hosts the endpoint. For
     *         more information, see <a>CreateInferenceExperimentRequest$KmsKey</a>.
     */

    public String getKmsKey() {
        return this.kmsKey;
    }

    /**
     * <p>
     * The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to
     * encrypt data on the storage volume attached to the ML compute instance that hosts the endpoint. For more
     * information, see <a>CreateInferenceExperimentRequest$KmsKey</a>.
     * </p>
     * 
     * @param kmsKey
     *        The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to
     *        encrypt data on the storage volume attached to the ML compute instance that hosts the endpoint. For more
     *        information, see <a>CreateInferenceExperimentRequest$KmsKey</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInferenceExperimentResult withKmsKey(String kmsKey) {
        setKmsKey(kmsKey);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getSchedule() != null)
            sb.append("Schedule: ").append(getSchedule()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getCompletionTime() != null)
            sb.append("CompletionTime: ").append(getCompletionTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getEndpointMetadata() != null)
            sb.append("EndpointMetadata: ").append(getEndpointMetadata()).append(",");
        if (getModelVariants() != null)
            sb.append("ModelVariants: ").append(getModelVariants()).append(",");
        if (getDataStorageConfig() != null)
            sb.append("DataStorageConfig: ").append(getDataStorageConfig()).append(",");
        if (getShadowModeConfig() != null)
            sb.append("ShadowModeConfig: ").append(getShadowModeConfig()).append(",");
        if (getKmsKey() != null)
            sb.append("KmsKey: ").append(getKmsKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInferenceExperimentResult == false)
            return false;
        DescribeInferenceExperimentResult other = (DescribeInferenceExperimentResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getCompletionTime() == null ^ this.getCompletionTime() == null)
            return false;
        if (other.getCompletionTime() != null && other.getCompletionTime().equals(this.getCompletionTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getEndpointMetadata() == null ^ this.getEndpointMetadata() == null)
            return false;
        if (other.getEndpointMetadata() != null && other.getEndpointMetadata().equals(this.getEndpointMetadata()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getCompletionTime() == null) ? 0 : getCompletionTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getEndpointMetadata() == null) ? 0 : getEndpointMetadata().hashCode());
        hashCode = prime * hashCode + ((getModelVariants() == null) ? 0 : getModelVariants().hashCode());
        hashCode = prime * hashCode + ((getDataStorageConfig() == null) ? 0 : getDataStorageConfig().hashCode());
        hashCode = prime * hashCode + ((getShadowModeConfig() == null) ? 0 : getShadowModeConfig().hashCode());
        hashCode = prime * hashCode + ((getKmsKey() == null) ? 0 : getKmsKey().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInferenceExperimentResult clone() {
        try {
            return (DescribeInferenceExperimentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
