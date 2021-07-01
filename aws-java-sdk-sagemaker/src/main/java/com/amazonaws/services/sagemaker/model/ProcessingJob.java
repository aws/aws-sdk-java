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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An Amazon SageMaker processing job that is used to analyze data and evaluate models. For more information, see <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/dg/processing-job.html">Process Data and Evaluate Models</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ProcessingJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProcessingJob implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * List of input configurations for the processing job.
     * </p>
     */
    private java.util.List<ProcessingInput> processingInputs;

    private ProcessingOutputConfig processingOutputConfig;
    /**
     * <p>
     * The name of the processing job.
     * </p>
     */
    private String processingJobName;

    private ProcessingResources processingResources;

    private ProcessingStoppingCondition stoppingCondition;

    private AppSpecification appSpecification;
    /**
     * <p>
     * Sets the environment variables in the Docker container.
     * </p>
     */
    private java.util.Map<String, String> environment;

    private NetworkConfig networkConfig;
    /**
     * <p>
     * The ARN of the role used to create the processing job.
     * </p>
     */
    private String roleArn;

    private ExperimentConfig experimentConfig;
    /**
     * <p>
     * The ARN of the processing job.
     * </p>
     */
    private String processingJobArn;
    /**
     * <p>
     * The status of the processing job.
     * </p>
     */
    private String processingJobStatus;
    /**
     * <p>
     * A string, up to one KB in size, that contains metadata from the processing container when the processing job
     * exits.
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
     * The time that the processing job ended.
     * </p>
     */
    private java.util.Date processingEndTime;
    /**
     * <p>
     * The time that the processing job started.
     * </p>
     */
    private java.util.Date processingStartTime;
    /**
     * <p>
     * The time the processing job was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The time the processing job was created.
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
     * The Amazon Resource Name (ARN) of the AutoML job associated with this processing job.
     * </p>
     */
    private String autoMLJobArn;
    /**
     * <p>
     * The ARN of the training job associated with this processing job.
     * </p>
     */
    private String trainingJobArn;
    /**
     * <p>
     * An array of key-value pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL">Using
     * Cost Allocation Tags</a> in the <i>Amazon Web Services Billing and Cost Management User Guide</i>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * List of input configurations for the processing job.
     * </p>
     * 
     * @return List of input configurations for the processing job.
     */

    public java.util.List<ProcessingInput> getProcessingInputs() {
        return processingInputs;
    }

    /**
     * <p>
     * List of input configurations for the processing job.
     * </p>
     * 
     * @param processingInputs
     *        List of input configurations for the processing job.
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
     * List of input configurations for the processing job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProcessingInputs(java.util.Collection)} or {@link #withProcessingInputs(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param processingInputs
     *        List of input configurations for the processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingJob withProcessingInputs(ProcessingInput... processingInputs) {
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
     * List of input configurations for the processing job.
     * </p>
     * 
     * @param processingInputs
     *        List of input configurations for the processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingJob withProcessingInputs(java.util.Collection<ProcessingInput> processingInputs) {
        setProcessingInputs(processingInputs);
        return this;
    }

    /**
     * @param processingOutputConfig
     */

    public void setProcessingOutputConfig(ProcessingOutputConfig processingOutputConfig) {
        this.processingOutputConfig = processingOutputConfig;
    }

    /**
     * @return
     */

    public ProcessingOutputConfig getProcessingOutputConfig() {
        return this.processingOutputConfig;
    }

    /**
     * @param processingOutputConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingJob withProcessingOutputConfig(ProcessingOutputConfig processingOutputConfig) {
        setProcessingOutputConfig(processingOutputConfig);
        return this;
    }

    /**
     * <p>
     * The name of the processing job.
     * </p>
     * 
     * @param processingJobName
     *        The name of the processing job.
     */

    public void setProcessingJobName(String processingJobName) {
        this.processingJobName = processingJobName;
    }

    /**
     * <p>
     * The name of the processing job.
     * </p>
     * 
     * @return The name of the processing job.
     */

    public String getProcessingJobName() {
        return this.processingJobName;
    }

    /**
     * <p>
     * The name of the processing job.
     * </p>
     * 
     * @param processingJobName
     *        The name of the processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingJob withProcessingJobName(String processingJobName) {
        setProcessingJobName(processingJobName);
        return this;
    }

    /**
     * @param processingResources
     */

    public void setProcessingResources(ProcessingResources processingResources) {
        this.processingResources = processingResources;
    }

    /**
     * @return
     */

    public ProcessingResources getProcessingResources() {
        return this.processingResources;
    }

    /**
     * @param processingResources
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingJob withProcessingResources(ProcessingResources processingResources) {
        setProcessingResources(processingResources);
        return this;
    }

    /**
     * @param stoppingCondition
     */

    public void setStoppingCondition(ProcessingStoppingCondition stoppingCondition) {
        this.stoppingCondition = stoppingCondition;
    }

    /**
     * @return
     */

    public ProcessingStoppingCondition getStoppingCondition() {
        return this.stoppingCondition;
    }

    /**
     * @param stoppingCondition
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingJob withStoppingCondition(ProcessingStoppingCondition stoppingCondition) {
        setStoppingCondition(stoppingCondition);
        return this;
    }

    /**
     * @param appSpecification
     */

    public void setAppSpecification(AppSpecification appSpecification) {
        this.appSpecification = appSpecification;
    }

    /**
     * @return
     */

    public AppSpecification getAppSpecification() {
        return this.appSpecification;
    }

    /**
     * @param appSpecification
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingJob withAppSpecification(AppSpecification appSpecification) {
        setAppSpecification(appSpecification);
        return this;
    }

    /**
     * <p>
     * Sets the environment variables in the Docker container.
     * </p>
     * 
     * @return Sets the environment variables in the Docker container.
     */

    public java.util.Map<String, String> getEnvironment() {
        return environment;
    }

    /**
     * <p>
     * Sets the environment variables in the Docker container.
     * </p>
     * 
     * @param environment
     *        Sets the environment variables in the Docker container.
     */

    public void setEnvironment(java.util.Map<String, String> environment) {
        this.environment = environment;
    }

    /**
     * <p>
     * Sets the environment variables in the Docker container.
     * </p>
     * 
     * @param environment
     *        Sets the environment variables in the Docker container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingJob withEnvironment(java.util.Map<String, String> environment) {
        setEnvironment(environment);
        return this;
    }

    /**
     * Add a single Environment entry
     *
     * @see ProcessingJob#withEnvironment
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingJob addEnvironmentEntry(String key, String value) {
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

    public ProcessingJob clearEnvironmentEntries() {
        this.environment = null;
        return this;
    }

    /**
     * @param networkConfig
     */

    public void setNetworkConfig(NetworkConfig networkConfig) {
        this.networkConfig = networkConfig;
    }

    /**
     * @return
     */

    public NetworkConfig getNetworkConfig() {
        return this.networkConfig;
    }

    /**
     * @param networkConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingJob withNetworkConfig(NetworkConfig networkConfig) {
        setNetworkConfig(networkConfig);
        return this;
    }

    /**
     * <p>
     * The ARN of the role used to create the processing job.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role used to create the processing job.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the role used to create the processing job.
     * </p>
     * 
     * @return The ARN of the role used to create the processing job.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the role used to create the processing job.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role used to create the processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingJob withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * @param experimentConfig
     */

    public void setExperimentConfig(ExperimentConfig experimentConfig) {
        this.experimentConfig = experimentConfig;
    }

    /**
     * @return
     */

    public ExperimentConfig getExperimentConfig() {
        return this.experimentConfig;
    }

    /**
     * @param experimentConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingJob withExperimentConfig(ExperimentConfig experimentConfig) {
        setExperimentConfig(experimentConfig);
        return this;
    }

    /**
     * <p>
     * The ARN of the processing job.
     * </p>
     * 
     * @param processingJobArn
     *        The ARN of the processing job.
     */

    public void setProcessingJobArn(String processingJobArn) {
        this.processingJobArn = processingJobArn;
    }

    /**
     * <p>
     * The ARN of the processing job.
     * </p>
     * 
     * @return The ARN of the processing job.
     */

    public String getProcessingJobArn() {
        return this.processingJobArn;
    }

    /**
     * <p>
     * The ARN of the processing job.
     * </p>
     * 
     * @param processingJobArn
     *        The ARN of the processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingJob withProcessingJobArn(String processingJobArn) {
        setProcessingJobArn(processingJobArn);
        return this;
    }

    /**
     * <p>
     * The status of the processing job.
     * </p>
     * 
     * @param processingJobStatus
     *        The status of the processing job.
     * @see ProcessingJobStatus
     */

    public void setProcessingJobStatus(String processingJobStatus) {
        this.processingJobStatus = processingJobStatus;
    }

    /**
     * <p>
     * The status of the processing job.
     * </p>
     * 
     * @return The status of the processing job.
     * @see ProcessingJobStatus
     */

    public String getProcessingJobStatus() {
        return this.processingJobStatus;
    }

    /**
     * <p>
     * The status of the processing job.
     * </p>
     * 
     * @param processingJobStatus
     *        The status of the processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProcessingJobStatus
     */

    public ProcessingJob withProcessingJobStatus(String processingJobStatus) {
        setProcessingJobStatus(processingJobStatus);
        return this;
    }

    /**
     * <p>
     * The status of the processing job.
     * </p>
     * 
     * @param processingJobStatus
     *        The status of the processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProcessingJobStatus
     */

    public ProcessingJob withProcessingJobStatus(ProcessingJobStatus processingJobStatus) {
        this.processingJobStatus = processingJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * A string, up to one KB in size, that contains metadata from the processing container when the processing job
     * exits.
     * </p>
     * 
     * @param exitMessage
     *        A string, up to one KB in size, that contains metadata from the processing container when the processing
     *        job exits.
     */

    public void setExitMessage(String exitMessage) {
        this.exitMessage = exitMessage;
    }

    /**
     * <p>
     * A string, up to one KB in size, that contains metadata from the processing container when the processing job
     * exits.
     * </p>
     * 
     * @return A string, up to one KB in size, that contains metadata from the processing container when the processing
     *         job exits.
     */

    public String getExitMessage() {
        return this.exitMessage;
    }

    /**
     * <p>
     * A string, up to one KB in size, that contains metadata from the processing container when the processing job
     * exits.
     * </p>
     * 
     * @param exitMessage
     *        A string, up to one KB in size, that contains metadata from the processing container when the processing
     *        job exits.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingJob withExitMessage(String exitMessage) {
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

    public ProcessingJob withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The time that the processing job ended.
     * </p>
     * 
     * @param processingEndTime
     *        The time that the processing job ended.
     */

    public void setProcessingEndTime(java.util.Date processingEndTime) {
        this.processingEndTime = processingEndTime;
    }

    /**
     * <p>
     * The time that the processing job ended.
     * </p>
     * 
     * @return The time that the processing job ended.
     */

    public java.util.Date getProcessingEndTime() {
        return this.processingEndTime;
    }

    /**
     * <p>
     * The time that the processing job ended.
     * </p>
     * 
     * @param processingEndTime
     *        The time that the processing job ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingJob withProcessingEndTime(java.util.Date processingEndTime) {
        setProcessingEndTime(processingEndTime);
        return this;
    }

    /**
     * <p>
     * The time that the processing job started.
     * </p>
     * 
     * @param processingStartTime
     *        The time that the processing job started.
     */

    public void setProcessingStartTime(java.util.Date processingStartTime) {
        this.processingStartTime = processingStartTime;
    }

    /**
     * <p>
     * The time that the processing job started.
     * </p>
     * 
     * @return The time that the processing job started.
     */

    public java.util.Date getProcessingStartTime() {
        return this.processingStartTime;
    }

    /**
     * <p>
     * The time that the processing job started.
     * </p>
     * 
     * @param processingStartTime
     *        The time that the processing job started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingJob withProcessingStartTime(java.util.Date processingStartTime) {
        setProcessingStartTime(processingStartTime);
        return this;
    }

    /**
     * <p>
     * The time the processing job was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The time the processing job was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The time the processing job was last modified.
     * </p>
     * 
     * @return The time the processing job was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The time the processing job was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The time the processing job was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingJob withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The time the processing job was created.
     * </p>
     * 
     * @param creationTime
     *        The time the processing job was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the processing job was created.
     * </p>
     * 
     * @return The time the processing job was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time the processing job was created.
     * </p>
     * 
     * @param creationTime
     *        The time the processing job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingJob withCreationTime(java.util.Date creationTime) {
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

    public ProcessingJob withMonitoringScheduleArn(String monitoringScheduleArn) {
        setMonitoringScheduleArn(monitoringScheduleArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AutoML job associated with this processing job.
     * </p>
     * 
     * @param autoMLJobArn
     *        The Amazon Resource Name (ARN) of the AutoML job associated with this processing job.
     */

    public void setAutoMLJobArn(String autoMLJobArn) {
        this.autoMLJobArn = autoMLJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AutoML job associated with this processing job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AutoML job associated with this processing job.
     */

    public String getAutoMLJobArn() {
        return this.autoMLJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AutoML job associated with this processing job.
     * </p>
     * 
     * @param autoMLJobArn
     *        The Amazon Resource Name (ARN) of the AutoML job associated with this processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingJob withAutoMLJobArn(String autoMLJobArn) {
        setAutoMLJobArn(autoMLJobArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the training job associated with this processing job.
     * </p>
     * 
     * @param trainingJobArn
     *        The ARN of the training job associated with this processing job.
     */

    public void setTrainingJobArn(String trainingJobArn) {
        this.trainingJobArn = trainingJobArn;
    }

    /**
     * <p>
     * The ARN of the training job associated with this processing job.
     * </p>
     * 
     * @return The ARN of the training job associated with this processing job.
     */

    public String getTrainingJobArn() {
        return this.trainingJobArn;
    }

    /**
     * <p>
     * The ARN of the training job associated with this processing job.
     * </p>
     * 
     * @param trainingJobArn
     *        The ARN of the training job associated with this processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingJob withTrainingJobArn(String trainingJobArn) {
        setTrainingJobArn(trainingJobArn);
        return this;
    }

    /**
     * <p>
     * An array of key-value pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL">Using
     * Cost Allocation Tags</a> in the <i>Amazon Web Services Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @return An array of key-value pairs. For more information, see <a
     *         href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL"
     *         >Using Cost Allocation Tags</a> in the <i>Amazon Web Services Billing and Cost Management User Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * An array of key-value pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL">Using
     * Cost Allocation Tags</a> in the <i>Amazon Web Services Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs. For more information, see <a href=
     *        "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL"
     *        >Using Cost Allocation Tags</a> in the <i>Amazon Web Services Billing and Cost Management User Guide</i>.
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
     * An array of key-value pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL">Using
     * Cost Allocation Tags</a> in the <i>Amazon Web Services Billing and Cost Management User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs. For more information, see <a href=
     *        "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL"
     *        >Using Cost Allocation Tags</a> in the <i>Amazon Web Services Billing and Cost Management User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingJob withTags(Tag... tags) {
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
     * An array of key-value pairs. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL">Using
     * Cost Allocation Tags</a> in the <i>Amazon Web Services Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param tags
     *        An array of key-value pairs. For more information, see <a href=
     *        "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html#allocation-whatURL"
     *        >Using Cost Allocation Tags</a> in the <i>Amazon Web Services Billing and Cost Management User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessingJob withTags(java.util.Collection<Tag> tags) {
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
            sb.append("TrainingJobArn: ").append(getTrainingJobArn()).append(",");
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

        if (obj instanceof ProcessingJob == false)
            return false;
        ProcessingJob other = (ProcessingJob) obj;
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ProcessingJob clone() {
        try {
            return (ProcessingJob) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ProcessingJobMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
