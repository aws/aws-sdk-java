/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeProcessingJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeProcessingJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The inputs for a processing job.
     * </p>
     */
    private java.util.List<ProcessingInput> processingInputs;
    /**
     * <p>
     * Output configuration for the processing job.
     * </p>
     */
    private ProcessingOutputConfig processingOutputConfig;
    /**
     * <p>
     * The name of the processing job. The name must be unique within an AWS Region in the AWS account.
     * </p>
     */
    private String processingJobName;
    /**
     * <p>
     * Identifies the resources, ML compute instances, and ML storage volumes to deploy for a processing job. In
     * distributed training, you specify more than one instance.
     * </p>
     */
    private ProcessingResources processingResources;
    /**
     * <p>
     * The time limit for how long the processing job is allowed to run.
     * </p>
     */
    private ProcessingStoppingCondition stoppingCondition;
    /**
     * <p>
     * Configures the processing job to run a specified container image.
     * </p>
     */
    private AppSpecification appSpecification;
    /**
     * <p>
     * The environment variables set in the Docker container.
     * </p>
     */
    private java.util.Map<String, String> environment;
    /**
     * <p>
     * Networking options for a processing job.
     * </p>
     */
    private NetworkConfig networkConfig;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The configuration information used to create an experiment.
     * </p>
     */
    private ExperimentConfig experimentConfig;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the processing job.
     * </p>
     */
    private String processingJobArn;
    /**
     * <p>
     * Provides the status of a processing job.
     * </p>
     */
    private String processingJobStatus;
    /**
     * <p>
     * An optional string, up to one KB in size, that contains metadata from the processing container when the
     * processing job exits.
     * </p>
     */
    private String exitMessage;
    /**
     * <p>
     * A string, up to one KB in size, that contains the reason a processing job failed, if it failed.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The time at which the processing job completed.
     * </p>
     */
    private java.util.Date processingEndTime;
    /**
     * <p>
     * The time at which the processing job started.
     * </p>
     */
    private java.util.Date processingStartTime;
    /**
     * <p>
     * The time at which the processing job was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The time at which the processing job was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The ARN of a monitoring schedule for an endpoint associated with this processing job.
     * </p>
     */
    private String monitoringScheduleArn;
    /**
     * <p>
     * The ARN of an AutoML job associated with this processing job.
     * </p>
     */
    private String autoMLJobArn;
    /**
     * <p>
     * The ARN of a training job associated with this processing job.
     * </p>
     */
    private String trainingJobArn;

    /**
     * <p>
     * The inputs for a processing job.
     * </p>
     * 
     * @return The inputs for a processing job.
     */

    public java.util.List<ProcessingInput> getProcessingInputs() {
        return processingInputs;
    }

    /**
     * <p>
     * The inputs for a processing job.
     * </p>
     * 
     * @param processingInputs
     *        The inputs for a processing job.
     */

    public void setProcessingInputs(java.util.Collection<ProcessingInput> processingInputs) {
        if (processingInputs == null) {
            this.processingInputs = null;
            return;
        }

        this.processingInputs = new java.util.ArrayList<ProcessingInput>(processingInputs);
    }

    /**
     * <p>
     * The inputs for a processing job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProcessingInputs(java.util.Collection)} or {@link #withProcessingInputs(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param processingInputs
     *        The inputs for a processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProcessingJobResult withProcessingInputs(ProcessingInput... processingInputs) {
        if (this.processingInputs == null) {
            setProcessingInputs(new java.util.ArrayList<ProcessingInput>(processingInputs.length));
        }
        for (ProcessingInput ele : processingInputs) {
            this.processingInputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The inputs for a processing job.
     * </p>
     * 
     * @param processingInputs
     *        The inputs for a processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProcessingJobResult withProcessingInputs(java.util.Collection<ProcessingInput> processingInputs) {
        setProcessingInputs(processingInputs);
        return this;
    }

    /**
     * <p>
     * Output configuration for the processing job.
     * </p>
     * 
     * @param processingOutputConfig
     *        Output configuration for the processing job.
     */

    public void setProcessingOutputConfig(ProcessingOutputConfig processingOutputConfig) {
        this.processingOutputConfig = processingOutputConfig;
    }

    /**
     * <p>
     * Output configuration for the processing job.
     * </p>
     * 
     * @return Output configuration for the processing job.
     */

    public ProcessingOutputConfig getProcessingOutputConfig() {
        return this.processingOutputConfig;
    }

    /**
     * <p>
     * Output configuration for the processing job.
     * </p>
     * 
     * @param processingOutputConfig
     *        Output configuration for the processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProcessingJobResult withProcessingOutputConfig(ProcessingOutputConfig processingOutputConfig) {
        setProcessingOutputConfig(processingOutputConfig);
        return this;
    }

    /**
     * <p>
     * The name of the processing job. The name must be unique within an AWS Region in the AWS account.
     * </p>
     * 
     * @param processingJobName
     *        The name of the processing job. The name must be unique within an AWS Region in the AWS account.
     */

    public void setProcessingJobName(String processingJobName) {
        this.processingJobName = processingJobName;
    }

    /**
     * <p>
     * The name of the processing job. The name must be unique within an AWS Region in the AWS account.
     * </p>
     * 
     * @return The name of the processing job. The name must be unique within an AWS Region in the AWS account.
     */

    public String getProcessingJobName() {
        return this.processingJobName;
    }

    /**
     * <p>
     * The name of the processing job. The name must be unique within an AWS Region in the AWS account.
     * </p>
     * 
     * @param processingJobName
     *        The name of the processing job. The name must be unique within an AWS Region in the AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProcessingJobResult withProcessingJobName(String processingJobName) {
        setProcessingJobName(processingJobName);
        return this;
    }

    /**
     * <p>
     * Identifies the resources, ML compute instances, and ML storage volumes to deploy for a processing job. In
     * distributed training, you specify more than one instance.
     * </p>
     * 
     * @param processingResources
     *        Identifies the resources, ML compute instances, and ML storage volumes to deploy for a processing job. In
     *        distributed training, you specify more than one instance.
     */

    public void setProcessingResources(ProcessingResources processingResources) {
        this.processingResources = processingResources;
    }

    /**
     * <p>
     * Identifies the resources, ML compute instances, and ML storage volumes to deploy for a processing job. In
     * distributed training, you specify more than one instance.
     * </p>
     * 
     * @return Identifies the resources, ML compute instances, and ML storage volumes to deploy for a processing job. In
     *         distributed training, you specify more than one instance.
     */

    public ProcessingResources getProcessingResources() {
        return this.processingResources;
    }

    /**
     * <p>
     * Identifies the resources, ML compute instances, and ML storage volumes to deploy for a processing job. In
     * distributed training, you specify more than one instance.
     * </p>
     * 
     * @param processingResources
     *        Identifies the resources, ML compute instances, and ML storage volumes to deploy for a processing job. In
     *        distributed training, you specify more than one instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProcessingJobResult withProcessingResources(ProcessingResources processingResources) {
        setProcessingResources(processingResources);
        return this;
    }

    /**
     * <p>
     * The time limit for how long the processing job is allowed to run.
     * </p>
     * 
     * @param stoppingCondition
     *        The time limit for how long the processing job is allowed to run.
     */

    public void setStoppingCondition(ProcessingStoppingCondition stoppingCondition) {
        this.stoppingCondition = stoppingCondition;
    }

    /**
     * <p>
     * The time limit for how long the processing job is allowed to run.
     * </p>
     * 
     * @return The time limit for how long the processing job is allowed to run.
     */

    public ProcessingStoppingCondition getStoppingCondition() {
        return this.stoppingCondition;
    }

    /**
     * <p>
     * The time limit for how long the processing job is allowed to run.
     * </p>
     * 
     * @param stoppingCondition
     *        The time limit for how long the processing job is allowed to run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProcessingJobResult withStoppingCondition(ProcessingStoppingCondition stoppingCondition) {
        setStoppingCondition(stoppingCondition);
        return this;
    }

    /**
     * <p>
     * Configures the processing job to run a specified container image.
     * </p>
     * 
     * @param appSpecification
     *        Configures the processing job to run a specified container image.
     */

    public void setAppSpecification(AppSpecification appSpecification) {
        this.appSpecification = appSpecification;
    }

    /**
     * <p>
     * Configures the processing job to run a specified container image.
     * </p>
     * 
     * @return Configures the processing job to run a specified container image.
     */

    public AppSpecification getAppSpecification() {
        return this.appSpecification;
    }

    /**
     * <p>
     * Configures the processing job to run a specified container image.
     * </p>
     * 
     * @param appSpecification
     *        Configures the processing job to run a specified container image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProcessingJobResult withAppSpecification(AppSpecification appSpecification) {
        setAppSpecification(appSpecification);
        return this;
    }

    /**
     * <p>
     * The environment variables set in the Docker container.
     * </p>
     * 
     * @return The environment variables set in the Docker container.
     */

    public java.util.Map<String, String> getEnvironment() {
        return environment;
    }

    /**
     * <p>
     * The environment variables set in the Docker container.
     * </p>
     * 
     * @param environment
     *        The environment variables set in the Docker container.
     */

    public void setEnvironment(java.util.Map<String, String> environment) {
        this.environment = environment;
    }

    /**
     * <p>
     * The environment variables set in the Docker container.
     * </p>
     * 
     * @param environment
     *        The environment variables set in the Docker container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProcessingJobResult withEnvironment(java.util.Map<String, String> environment) {
        setEnvironment(environment);
        return this;
    }

    /**
     * Add a single Environment entry
     *
     * @see DescribeProcessingJobResult#withEnvironment
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProcessingJobResult addEnvironmentEntry(String key, String value) {
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

    public DescribeProcessingJobResult clearEnvironmentEntries() {
        this.environment = null;
        return this;
    }

    /**
     * <p>
     * Networking options for a processing job.
     * </p>
     * 
     * @param networkConfig
     *        Networking options for a processing job.
     */

    public void setNetworkConfig(NetworkConfig networkConfig) {
        this.networkConfig = networkConfig;
    }

    /**
     * <p>
     * Networking options for a processing job.
     * </p>
     * 
     * @return Networking options for a processing job.
     */

    public NetworkConfig getNetworkConfig() {
        return this.networkConfig;
    }

    /**
     * <p>
     * Networking options for a processing job.
     * </p>
     * 
     * @param networkConfig
     *        Networking options for a processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProcessingJobResult withNetworkConfig(NetworkConfig networkConfig) {
        setNetworkConfig(networkConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your
     *        behalf.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your
     *         behalf.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your
     *        behalf.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProcessingJobResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The configuration information used to create an experiment.
     * </p>
     * 
     * @param experimentConfig
     *        The configuration information used to create an experiment.
     */

    public void setExperimentConfig(ExperimentConfig experimentConfig) {
        this.experimentConfig = experimentConfig;
    }

    /**
     * <p>
     * The configuration information used to create an experiment.
     * </p>
     * 
     * @return The configuration information used to create an experiment.
     */

    public ExperimentConfig getExperimentConfig() {
        return this.experimentConfig;
    }

    /**
     * <p>
     * The configuration information used to create an experiment.
     * </p>
     * 
     * @param experimentConfig
     *        The configuration information used to create an experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProcessingJobResult withExperimentConfig(ExperimentConfig experimentConfig) {
        setExperimentConfig(experimentConfig);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the processing job.
     * </p>
     * 
     * @param processingJobArn
     *        The Amazon Resource Name (ARN) of the processing job.
     */

    public void setProcessingJobArn(String processingJobArn) {
        this.processingJobArn = processingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the processing job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the processing job.
     */

    public String getProcessingJobArn() {
        return this.processingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the processing job.
     * </p>
     * 
     * @param processingJobArn
     *        The Amazon Resource Name (ARN) of the processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProcessingJobResult withProcessingJobArn(String processingJobArn) {
        setProcessingJobArn(processingJobArn);
        return this;
    }

    /**
     * <p>
     * Provides the status of a processing job.
     * </p>
     * 
     * @param processingJobStatus
     *        Provides the status of a processing job.
     * @see ProcessingJobStatus
     */

    public void setProcessingJobStatus(String processingJobStatus) {
        this.processingJobStatus = processingJobStatus;
    }

    /**
     * <p>
     * Provides the status of a processing job.
     * </p>
     * 
     * @return Provides the status of a processing job.
     * @see ProcessingJobStatus
     */

    public String getProcessingJobStatus() {
        return this.processingJobStatus;
    }

    /**
     * <p>
     * Provides the status of a processing job.
     * </p>
     * 
     * @param processingJobStatus
     *        Provides the status of a processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProcessingJobStatus
     */

    public DescribeProcessingJobResult withProcessingJobStatus(String processingJobStatus) {
        setProcessingJobStatus(processingJobStatus);
        return this;
    }

    /**
     * <p>
     * Provides the status of a processing job.
     * </p>
     * 
     * @param processingJobStatus
     *        Provides the status of a processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProcessingJobStatus
     */

    public DescribeProcessingJobResult withProcessingJobStatus(ProcessingJobStatus processingJobStatus) {
        this.processingJobStatus = processingJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * An optional string, up to one KB in size, that contains metadata from the processing container when the
     * processing job exits.
     * </p>
     * 
     * @param exitMessage
     *        An optional string, up to one KB in size, that contains metadata from the processing container when the
     *        processing job exits.
     */

    public void setExitMessage(String exitMessage) {
        this.exitMessage = exitMessage;
    }

    /**
     * <p>
     * An optional string, up to one KB in size, that contains metadata from the processing container when the
     * processing job exits.
     * </p>
     * 
     * @return An optional string, up to one KB in size, that contains metadata from the processing container when the
     *         processing job exits.
     */

    public String getExitMessage() {
        return this.exitMessage;
    }

    /**
     * <p>
     * An optional string, up to one KB in size, that contains metadata from the processing container when the
     * processing job exits.
     * </p>
     * 
     * @param exitMessage
     *        An optional string, up to one KB in size, that contains metadata from the processing container when the
     *        processing job exits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProcessingJobResult withExitMessage(String exitMessage) {
        setExitMessage(exitMessage);
        return this;
    }

    /**
     * <p>
     * A string, up to one KB in size, that contains the reason a processing job failed, if it failed.
     * </p>
     * 
     * @param failureReason
     *        A string, up to one KB in size, that contains the reason a processing job failed, if it failed.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * A string, up to one KB in size, that contains the reason a processing job failed, if it failed.
     * </p>
     * 
     * @return A string, up to one KB in size, that contains the reason a processing job failed, if it failed.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * A string, up to one KB in size, that contains the reason a processing job failed, if it failed.
     * </p>
     * 
     * @param failureReason
     *        A string, up to one KB in size, that contains the reason a processing job failed, if it failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProcessingJobResult withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The time at which the processing job completed.
     * </p>
     * 
     * @param processingEndTime
     *        The time at which the processing job completed.
     */

    public void setProcessingEndTime(java.util.Date processingEndTime) {
        this.processingEndTime = processingEndTime;
    }

    /**
     * <p>
     * The time at which the processing job completed.
     * </p>
     * 
     * @return The time at which the processing job completed.
     */

    public java.util.Date getProcessingEndTime() {
        return this.processingEndTime;
    }

    /**
     * <p>
     * The time at which the processing job completed.
     * </p>
     * 
     * @param processingEndTime
     *        The time at which the processing job completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProcessingJobResult withProcessingEndTime(java.util.Date processingEndTime) {
        setProcessingEndTime(processingEndTime);
        return this;
    }

    /**
     * <p>
     * The time at which the processing job started.
     * </p>
     * 
     * @param processingStartTime
     *        The time at which the processing job started.
     */

    public void setProcessingStartTime(java.util.Date processingStartTime) {
        this.processingStartTime = processingStartTime;
    }

    /**
     * <p>
     * The time at which the processing job started.
     * </p>
     * 
     * @return The time at which the processing job started.
     */

    public java.util.Date getProcessingStartTime() {
        return this.processingStartTime;
    }

    /**
     * <p>
     * The time at which the processing job started.
     * </p>
     * 
     * @param processingStartTime
     *        The time at which the processing job started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProcessingJobResult withProcessingStartTime(java.util.Date processingStartTime) {
        setProcessingStartTime(processingStartTime);
        return this;
    }

    /**
     * <p>
     * The time at which the processing job was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The time at which the processing job was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The time at which the processing job was last modified.
     * </p>
     * 
     * @return The time at which the processing job was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The time at which the processing job was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The time at which the processing job was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProcessingJobResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The time at which the processing job was created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the processing job was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time at which the processing job was created.
     * </p>
     * 
     * @return The time at which the processing job was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time at which the processing job was created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the processing job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProcessingJobResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The ARN of a monitoring schedule for an endpoint associated with this processing job.
     * </p>
     * 
     * @param monitoringScheduleArn
     *        The ARN of a monitoring schedule for an endpoint associated with this processing job.
     */

    public void setMonitoringScheduleArn(String monitoringScheduleArn) {
        this.monitoringScheduleArn = monitoringScheduleArn;
    }

    /**
     * <p>
     * The ARN of a monitoring schedule for an endpoint associated with this processing job.
     * </p>
     * 
     * @return The ARN of a monitoring schedule for an endpoint associated with this processing job.
     */

    public String getMonitoringScheduleArn() {
        return this.monitoringScheduleArn;
    }

    /**
     * <p>
     * The ARN of a monitoring schedule for an endpoint associated with this processing job.
     * </p>
     * 
     * @param monitoringScheduleArn
     *        The ARN of a monitoring schedule for an endpoint associated with this processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProcessingJobResult withMonitoringScheduleArn(String monitoringScheduleArn) {
        setMonitoringScheduleArn(monitoringScheduleArn);
        return this;
    }

    /**
     * <p>
     * The ARN of an AutoML job associated with this processing job.
     * </p>
     * 
     * @param autoMLJobArn
     *        The ARN of an AutoML job associated with this processing job.
     */

    public void setAutoMLJobArn(String autoMLJobArn) {
        this.autoMLJobArn = autoMLJobArn;
    }

    /**
     * <p>
     * The ARN of an AutoML job associated with this processing job.
     * </p>
     * 
     * @return The ARN of an AutoML job associated with this processing job.
     */

    public String getAutoMLJobArn() {
        return this.autoMLJobArn;
    }

    /**
     * <p>
     * The ARN of an AutoML job associated with this processing job.
     * </p>
     * 
     * @param autoMLJobArn
     *        The ARN of an AutoML job associated with this processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProcessingJobResult withAutoMLJobArn(String autoMLJobArn) {
        setAutoMLJobArn(autoMLJobArn);
        return this;
    }

    /**
     * <p>
     * The ARN of a training job associated with this processing job.
     * </p>
     * 
     * @param trainingJobArn
     *        The ARN of a training job associated with this processing job.
     */

    public void setTrainingJobArn(String trainingJobArn) {
        this.trainingJobArn = trainingJobArn;
    }

    /**
     * <p>
     * The ARN of a training job associated with this processing job.
     * </p>
     * 
     * @return The ARN of a training job associated with this processing job.
     */

    public String getTrainingJobArn() {
        return this.trainingJobArn;
    }

    /**
     * <p>
     * The ARN of a training job associated with this processing job.
     * </p>
     * 
     * @param trainingJobArn
     *        The ARN of a training job associated with this processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeProcessingJobResult withTrainingJobArn(String trainingJobArn) {
        setTrainingJobArn(trainingJobArn);
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
        if (getProcessingInputs() != null)
            sb.append("ProcessingInputs: ").append(getProcessingInputs()).append(",");
        if (getProcessingOutputConfig() != null)
            sb.append("ProcessingOutputConfig: ").append(getProcessingOutputConfig()).append(",");
        if (getProcessingJobName() != null)
            sb.append("ProcessingJobName: ").append(getProcessingJobName()).append(",");
        if (getProcessingResources() != null)
            sb.append("ProcessingResources: ").append(getProcessingResources()).append(",");
        if (getStoppingCondition() != null)
            sb.append("StoppingCondition: ").append(getStoppingCondition()).append(",");
        if (getAppSpecification() != null)
            sb.append("AppSpecification: ").append(getAppSpecification()).append(",");
        if (getEnvironment() != null)
            sb.append("Environment: ").append(getEnvironment()).append(",");
        if (getNetworkConfig() != null)
            sb.append("NetworkConfig: ").append(getNetworkConfig()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getExperimentConfig() != null)
            sb.append("ExperimentConfig: ").append(getExperimentConfig()).append(",");
        if (getProcessingJobArn() != null)
            sb.append("ProcessingJobArn: ").append(getProcessingJobArn()).append(",");
        if (getProcessingJobStatus() != null)
            sb.append("ProcessingJobStatus: ").append(getProcessingJobStatus()).append(",");
        if (getExitMessage() != null)
            sb.append("ExitMessage: ").append(getExitMessage()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getProcessingEndTime() != null)
            sb.append("ProcessingEndTime: ").append(getProcessingEndTime()).append(",");
        if (getProcessingStartTime() != null)
            sb.append("ProcessingStartTime: ").append(getProcessingStartTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getMonitoringScheduleArn() != null)
            sb.append("MonitoringScheduleArn: ").append(getMonitoringScheduleArn()).append(",");
        if (getAutoMLJobArn() != null)
            sb.append("AutoMLJobArn: ").append(getAutoMLJobArn()).append(",");
        if (getTrainingJobArn() != null)
            sb.append("TrainingJobArn: ").append(getTrainingJobArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeProcessingJobResult == false)
            return false;
        DescribeProcessingJobResult other = (DescribeProcessingJobResult) obj;
        if (other.getProcessingInputs() == null ^ this.getProcessingInputs() == null)
            return false;
        if (other.getProcessingInputs() != null && other.getProcessingInputs().equals(this.getProcessingInputs()) == false)
            return false;
        if (other.getProcessingOutputConfig() == null ^ this.getProcessingOutputConfig() == null)
            return false;
        if (other.getProcessingOutputConfig() != null && other.getProcessingOutputConfig().equals(this.getProcessingOutputConfig()) == false)
            return false;
        if (other.getProcessingJobName() == null ^ this.getProcessingJobName() == null)
            return false;
        if (other.getProcessingJobName() != null && other.getProcessingJobName().equals(this.getProcessingJobName()) == false)
            return false;
        if (other.getProcessingResources() == null ^ this.getProcessingResources() == null)
            return false;
        if (other.getProcessingResources() != null && other.getProcessingResources().equals(this.getProcessingResources()) == false)
            return false;
        if (other.getStoppingCondition() == null ^ this.getStoppingCondition() == null)
            return false;
        if (other.getStoppingCondition() != null && other.getStoppingCondition().equals(this.getStoppingCondition()) == false)
            return false;
        if (other.getAppSpecification() == null ^ this.getAppSpecification() == null)
            return false;
        if (other.getAppSpecification() != null && other.getAppSpecification().equals(this.getAppSpecification()) == false)
            return false;
        if (other.getEnvironment() == null ^ this.getEnvironment() == null)
            return false;
        if (other.getEnvironment() != null && other.getEnvironment().equals(this.getEnvironment()) == false)
            return false;
        if (other.getNetworkConfig() == null ^ this.getNetworkConfig() == null)
            return false;
        if (other.getNetworkConfig() != null && other.getNetworkConfig().equals(this.getNetworkConfig()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getExperimentConfig() == null ^ this.getExperimentConfig() == null)
            return false;
        if (other.getExperimentConfig() != null && other.getExperimentConfig().equals(this.getExperimentConfig()) == false)
            return false;
        if (other.getProcessingJobArn() == null ^ this.getProcessingJobArn() == null)
            return false;
        if (other.getProcessingJobArn() != null && other.getProcessingJobArn().equals(this.getProcessingJobArn()) == false)
            return false;
        if (other.getProcessingJobStatus() == null ^ this.getProcessingJobStatus() == null)
            return false;
        if (other.getProcessingJobStatus() != null && other.getProcessingJobStatus().equals(this.getProcessingJobStatus()) == false)
            return false;
        if (other.getExitMessage() == null ^ this.getExitMessage() == null)
            return false;
        if (other.getExitMessage() != null && other.getExitMessage().equals(this.getExitMessage()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getProcessingEndTime() == null ^ this.getProcessingEndTime() == null)
            return false;
        if (other.getProcessingEndTime() != null && other.getProcessingEndTime().equals(this.getProcessingEndTime()) == false)
            return false;
        if (other.getProcessingStartTime() == null ^ this.getProcessingStartTime() == null)
            return false;
        if (other.getProcessingStartTime() != null && other.getProcessingStartTime().equals(this.getProcessingStartTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getMonitoringScheduleArn() == null ^ this.getMonitoringScheduleArn() == null)
            return false;
        if (other.getMonitoringScheduleArn() != null && other.getMonitoringScheduleArn().equals(this.getMonitoringScheduleArn()) == false)
            return false;
        if (other.getAutoMLJobArn() == null ^ this.getAutoMLJobArn() == null)
            return false;
        if (other.getAutoMLJobArn() != null && other.getAutoMLJobArn().equals(this.getAutoMLJobArn()) == false)
            return false;
        if (other.getTrainingJobArn() == null ^ this.getTrainingJobArn() == null)
            return false;
        if (other.getTrainingJobArn() != null && other.getTrainingJobArn().equals(this.getTrainingJobArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProcessingInputs() == null) ? 0 : getProcessingInputs().hashCode());
        hashCode = prime * hashCode + ((getProcessingOutputConfig() == null) ? 0 : getProcessingOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getProcessingJobName() == null) ? 0 : getProcessingJobName().hashCode());
        hashCode = prime * hashCode + ((getProcessingResources() == null) ? 0 : getProcessingResources().hashCode());
        hashCode = prime * hashCode + ((getStoppingCondition() == null) ? 0 : getStoppingCondition().hashCode());
        hashCode = prime * hashCode + ((getAppSpecification() == null) ? 0 : getAppSpecification().hashCode());
        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        hashCode = prime * hashCode + ((getNetworkConfig() == null) ? 0 : getNetworkConfig().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getExperimentConfig() == null) ? 0 : getExperimentConfig().hashCode());
        hashCode = prime * hashCode + ((getProcessingJobArn() == null) ? 0 : getProcessingJobArn().hashCode());
        hashCode = prime * hashCode + ((getProcessingJobStatus() == null) ? 0 : getProcessingJobStatus().hashCode());
        hashCode = prime * hashCode + ((getExitMessage() == null) ? 0 : getExitMessage().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getProcessingEndTime() == null) ? 0 : getProcessingEndTime().hashCode());
        hashCode = prime * hashCode + ((getProcessingStartTime() == null) ? 0 : getProcessingStartTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getMonitoringScheduleArn() == null) ? 0 : getMonitoringScheduleArn().hashCode());
        hashCode = prime * hashCode + ((getAutoMLJobArn() == null) ? 0 : getAutoMLJobArn().hashCode());
        hashCode = prime * hashCode + ((getTrainingJobArn() == null) ? 0 : getTrainingJobArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeProcessingJobResult clone() {
        try {
            return (DescribeProcessingJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
