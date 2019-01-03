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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeHyperParameterTuningJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeHyperParameterTuningJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The name of the tuning job.
     * </p>
     */
    private String hyperParameterTuningJobName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the tuning job.
     * </p>
     */
    private String hyperParameterTuningJobArn;
    /**
     * <p>
     * The <a>HyperParameterTuningJobConfig</a> object that specifies the configuration of the tuning job.
     * </p>
     */
    private HyperParameterTuningJobConfig hyperParameterTuningJobConfig;
    /**
     * <p>
     * The <a>HyperParameterTrainingJobDefinition</a> object that specifies the definition of the training jobs that
     * this tuning job launches.
     * </p>
     */
    private HyperParameterTrainingJobDefinition trainingJobDefinition;
    /**
     * <p>
     * The status of the tuning job: InProgress, Completed, Failed, Stopping, or Stopped.
     * </p>
     */
    private String hyperParameterTuningJobStatus;
    /**
     * <p>
     * The date and time that the tuning job started.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The date and time that the tuning job ended.
     * </p>
     */
    private java.util.Date hyperParameterTuningEndTime;
    /**
     * <p>
     * The date and time that the status of the tuning job was modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The <a>TrainingJobStatusCounters</a> object that specifies the number of training jobs, categorized by status,
     * that this tuning job launched.
     * </p>
     */
    private TrainingJobStatusCounters trainingJobStatusCounters;
    /**
     * <p>
     * The <a>ObjectiveStatusCounters</a> object that specifies the number of training jobs, categorized by the status
     * of their final objective metric, that this tuning job launched.
     * </p>
     */
    private ObjectiveStatusCounters objectiveStatusCounters;
    /**
     * <p>
     * A <a>TrainingJobSummary</a> object that describes the training job that completed with the best current
     * <a>HyperParameterTuningJobObjective</a>.
     * </p>
     */
    private HyperParameterTrainingJobSummary bestTrainingJob;
    /**
     * <p>
     * If the hyperparameter tuning job is an warm start tuning job with a <code>WarmStartType</code> of
     * <code>IDENTICAL_DATA_AND_ALGORITHM</code>, this is the <a>TrainingJobSummary</a> for the training job with the
     * best objective metric value of all training jobs launched by this tuning job and all parent jobs specified for
     * the warm start tuning job.
     * </p>
     */
    private HyperParameterTrainingJobSummary overallBestTrainingJob;
    /**
     * <p>
     * The configuration for starting the hyperparameter parameter tuning job using one or more previous tuning jobs as
     * a starting point. The results of previous tuning jobs are used to inform which combinations of hyperparameters to
     * search over in the new tuning job.
     * </p>
     */
    private HyperParameterTuningJobWarmStartConfig warmStartConfig;
    /**
     * <p>
     * If the tuning job failed, the reason it failed.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * The name of the tuning job.
     * </p>
     * 
     * @param hyperParameterTuningJobName
     *        The name of the tuning job.
     */

    public void setHyperParameterTuningJobName(String hyperParameterTuningJobName) {
        this.hyperParameterTuningJobName = hyperParameterTuningJobName;
    }

    /**
     * <p>
     * The name of the tuning job.
     * </p>
     * 
     * @return The name of the tuning job.
     */

    public String getHyperParameterTuningJobName() {
        return this.hyperParameterTuningJobName;
    }

    /**
     * <p>
     * The name of the tuning job.
     * </p>
     * 
     * @param hyperParameterTuningJobName
     *        The name of the tuning job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHyperParameterTuningJobResult withHyperParameterTuningJobName(String hyperParameterTuningJobName) {
        setHyperParameterTuningJobName(hyperParameterTuningJobName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the tuning job.
     * </p>
     * 
     * @param hyperParameterTuningJobArn
     *        The Amazon Resource Name (ARN) of the tuning job.
     */

    public void setHyperParameterTuningJobArn(String hyperParameterTuningJobArn) {
        this.hyperParameterTuningJobArn = hyperParameterTuningJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the tuning job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the tuning job.
     */

    public String getHyperParameterTuningJobArn() {
        return this.hyperParameterTuningJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the tuning job.
     * </p>
     * 
     * @param hyperParameterTuningJobArn
     *        The Amazon Resource Name (ARN) of the tuning job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHyperParameterTuningJobResult withHyperParameterTuningJobArn(String hyperParameterTuningJobArn) {
        setHyperParameterTuningJobArn(hyperParameterTuningJobArn);
        return this;
    }

    /**
     * <p>
     * The <a>HyperParameterTuningJobConfig</a> object that specifies the configuration of the tuning job.
     * </p>
     * 
     * @param hyperParameterTuningJobConfig
     *        The <a>HyperParameterTuningJobConfig</a> object that specifies the configuration of the tuning job.
     */

    public void setHyperParameterTuningJobConfig(HyperParameterTuningJobConfig hyperParameterTuningJobConfig) {
        this.hyperParameterTuningJobConfig = hyperParameterTuningJobConfig;
    }

    /**
     * <p>
     * The <a>HyperParameterTuningJobConfig</a> object that specifies the configuration of the tuning job.
     * </p>
     * 
     * @return The <a>HyperParameterTuningJobConfig</a> object that specifies the configuration of the tuning job.
     */

    public HyperParameterTuningJobConfig getHyperParameterTuningJobConfig() {
        return this.hyperParameterTuningJobConfig;
    }

    /**
     * <p>
     * The <a>HyperParameterTuningJobConfig</a> object that specifies the configuration of the tuning job.
     * </p>
     * 
     * @param hyperParameterTuningJobConfig
     *        The <a>HyperParameterTuningJobConfig</a> object that specifies the configuration of the tuning job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHyperParameterTuningJobResult withHyperParameterTuningJobConfig(HyperParameterTuningJobConfig hyperParameterTuningJobConfig) {
        setHyperParameterTuningJobConfig(hyperParameterTuningJobConfig);
        return this;
    }

    /**
     * <p>
     * The <a>HyperParameterTrainingJobDefinition</a> object that specifies the definition of the training jobs that
     * this tuning job launches.
     * </p>
     * 
     * @param trainingJobDefinition
     *        The <a>HyperParameterTrainingJobDefinition</a> object that specifies the definition of the training jobs
     *        that this tuning job launches.
     */

    public void setTrainingJobDefinition(HyperParameterTrainingJobDefinition trainingJobDefinition) {
        this.trainingJobDefinition = trainingJobDefinition;
    }

    /**
     * <p>
     * The <a>HyperParameterTrainingJobDefinition</a> object that specifies the definition of the training jobs that
     * this tuning job launches.
     * </p>
     * 
     * @return The <a>HyperParameterTrainingJobDefinition</a> object that specifies the definition of the training jobs
     *         that this tuning job launches.
     */

    public HyperParameterTrainingJobDefinition getTrainingJobDefinition() {
        return this.trainingJobDefinition;
    }

    /**
     * <p>
     * The <a>HyperParameterTrainingJobDefinition</a> object that specifies the definition of the training jobs that
     * this tuning job launches.
     * </p>
     * 
     * @param trainingJobDefinition
     *        The <a>HyperParameterTrainingJobDefinition</a> object that specifies the definition of the training jobs
     *        that this tuning job launches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHyperParameterTuningJobResult withTrainingJobDefinition(HyperParameterTrainingJobDefinition trainingJobDefinition) {
        setTrainingJobDefinition(trainingJobDefinition);
        return this;
    }

    /**
     * <p>
     * The status of the tuning job: InProgress, Completed, Failed, Stopping, or Stopped.
     * </p>
     * 
     * @param hyperParameterTuningJobStatus
     *        The status of the tuning job: InProgress, Completed, Failed, Stopping, or Stopped.
     * @see HyperParameterTuningJobStatus
     */

    public void setHyperParameterTuningJobStatus(String hyperParameterTuningJobStatus) {
        this.hyperParameterTuningJobStatus = hyperParameterTuningJobStatus;
    }

    /**
     * <p>
     * The status of the tuning job: InProgress, Completed, Failed, Stopping, or Stopped.
     * </p>
     * 
     * @return The status of the tuning job: InProgress, Completed, Failed, Stopping, or Stopped.
     * @see HyperParameterTuningJobStatus
     */

    public String getHyperParameterTuningJobStatus() {
        return this.hyperParameterTuningJobStatus;
    }

    /**
     * <p>
     * The status of the tuning job: InProgress, Completed, Failed, Stopping, or Stopped.
     * </p>
     * 
     * @param hyperParameterTuningJobStatus
     *        The status of the tuning job: InProgress, Completed, Failed, Stopping, or Stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HyperParameterTuningJobStatus
     */

    public DescribeHyperParameterTuningJobResult withHyperParameterTuningJobStatus(String hyperParameterTuningJobStatus) {
        setHyperParameterTuningJobStatus(hyperParameterTuningJobStatus);
        return this;
    }

    /**
     * <p>
     * The status of the tuning job: InProgress, Completed, Failed, Stopping, or Stopped.
     * </p>
     * 
     * @param hyperParameterTuningJobStatus
     *        The status of the tuning job: InProgress, Completed, Failed, Stopping, or Stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HyperParameterTuningJobStatus
     */

    public DescribeHyperParameterTuningJobResult withHyperParameterTuningJobStatus(HyperParameterTuningJobStatus hyperParameterTuningJobStatus) {
        this.hyperParameterTuningJobStatus = hyperParameterTuningJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the tuning job started.
     * </p>
     * 
     * @param creationTime
     *        The date and time that the tuning job started.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time that the tuning job started.
     * </p>
     * 
     * @return The date and time that the tuning job started.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time that the tuning job started.
     * </p>
     * 
     * @param creationTime
     *        The date and time that the tuning job started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHyperParameterTuningJobResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the tuning job ended.
     * </p>
     * 
     * @param hyperParameterTuningEndTime
     *        The date and time that the tuning job ended.
     */

    public void setHyperParameterTuningEndTime(java.util.Date hyperParameterTuningEndTime) {
        this.hyperParameterTuningEndTime = hyperParameterTuningEndTime;
    }

    /**
     * <p>
     * The date and time that the tuning job ended.
     * </p>
     * 
     * @return The date and time that the tuning job ended.
     */

    public java.util.Date getHyperParameterTuningEndTime() {
        return this.hyperParameterTuningEndTime;
    }

    /**
     * <p>
     * The date and time that the tuning job ended.
     * </p>
     * 
     * @param hyperParameterTuningEndTime
     *        The date and time that the tuning job ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHyperParameterTuningJobResult withHyperParameterTuningEndTime(java.util.Date hyperParameterTuningEndTime) {
        setHyperParameterTuningEndTime(hyperParameterTuningEndTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the status of the tuning job was modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time that the status of the tuning job was modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the status of the tuning job was modified.
     * </p>
     * 
     * @return The date and time that the status of the tuning job was modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the status of the tuning job was modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time that the status of the tuning job was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHyperParameterTuningJobResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The <a>TrainingJobStatusCounters</a> object that specifies the number of training jobs, categorized by status,
     * that this tuning job launched.
     * </p>
     * 
     * @param trainingJobStatusCounters
     *        The <a>TrainingJobStatusCounters</a> object that specifies the number of training jobs, categorized by
     *        status, that this tuning job launched.
     */

    public void setTrainingJobStatusCounters(TrainingJobStatusCounters trainingJobStatusCounters) {
        this.trainingJobStatusCounters = trainingJobStatusCounters;
    }

    /**
     * <p>
     * The <a>TrainingJobStatusCounters</a> object that specifies the number of training jobs, categorized by status,
     * that this tuning job launched.
     * </p>
     * 
     * @return The <a>TrainingJobStatusCounters</a> object that specifies the number of training jobs, categorized by
     *         status, that this tuning job launched.
     */

    public TrainingJobStatusCounters getTrainingJobStatusCounters() {
        return this.trainingJobStatusCounters;
    }

    /**
     * <p>
     * The <a>TrainingJobStatusCounters</a> object that specifies the number of training jobs, categorized by status,
     * that this tuning job launched.
     * </p>
     * 
     * @param trainingJobStatusCounters
     *        The <a>TrainingJobStatusCounters</a> object that specifies the number of training jobs, categorized by
     *        status, that this tuning job launched.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHyperParameterTuningJobResult withTrainingJobStatusCounters(TrainingJobStatusCounters trainingJobStatusCounters) {
        setTrainingJobStatusCounters(trainingJobStatusCounters);
        return this;
    }

    /**
     * <p>
     * The <a>ObjectiveStatusCounters</a> object that specifies the number of training jobs, categorized by the status
     * of their final objective metric, that this tuning job launched.
     * </p>
     * 
     * @param objectiveStatusCounters
     *        The <a>ObjectiveStatusCounters</a> object that specifies the number of training jobs, categorized by the
     *        status of their final objective metric, that this tuning job launched.
     */

    public void setObjectiveStatusCounters(ObjectiveStatusCounters objectiveStatusCounters) {
        this.objectiveStatusCounters = objectiveStatusCounters;
    }

    /**
     * <p>
     * The <a>ObjectiveStatusCounters</a> object that specifies the number of training jobs, categorized by the status
     * of their final objective metric, that this tuning job launched.
     * </p>
     * 
     * @return The <a>ObjectiveStatusCounters</a> object that specifies the number of training jobs, categorized by the
     *         status of their final objective metric, that this tuning job launched.
     */

    public ObjectiveStatusCounters getObjectiveStatusCounters() {
        return this.objectiveStatusCounters;
    }

    /**
     * <p>
     * The <a>ObjectiveStatusCounters</a> object that specifies the number of training jobs, categorized by the status
     * of their final objective metric, that this tuning job launched.
     * </p>
     * 
     * @param objectiveStatusCounters
     *        The <a>ObjectiveStatusCounters</a> object that specifies the number of training jobs, categorized by the
     *        status of their final objective metric, that this tuning job launched.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHyperParameterTuningJobResult withObjectiveStatusCounters(ObjectiveStatusCounters objectiveStatusCounters) {
        setObjectiveStatusCounters(objectiveStatusCounters);
        return this;
    }

    /**
     * <p>
     * A <a>TrainingJobSummary</a> object that describes the training job that completed with the best current
     * <a>HyperParameterTuningJobObjective</a>.
     * </p>
     * 
     * @param bestTrainingJob
     *        A <a>TrainingJobSummary</a> object that describes the training job that completed with the best current
     *        <a>HyperParameterTuningJobObjective</a>.
     */

    public void setBestTrainingJob(HyperParameterTrainingJobSummary bestTrainingJob) {
        this.bestTrainingJob = bestTrainingJob;
    }

    /**
     * <p>
     * A <a>TrainingJobSummary</a> object that describes the training job that completed with the best current
     * <a>HyperParameterTuningJobObjective</a>.
     * </p>
     * 
     * @return A <a>TrainingJobSummary</a> object that describes the training job that completed with the best current
     *         <a>HyperParameterTuningJobObjective</a>.
     */

    public HyperParameterTrainingJobSummary getBestTrainingJob() {
        return this.bestTrainingJob;
    }

    /**
     * <p>
     * A <a>TrainingJobSummary</a> object that describes the training job that completed with the best current
     * <a>HyperParameterTuningJobObjective</a>.
     * </p>
     * 
     * @param bestTrainingJob
     *        A <a>TrainingJobSummary</a> object that describes the training job that completed with the best current
     *        <a>HyperParameterTuningJobObjective</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHyperParameterTuningJobResult withBestTrainingJob(HyperParameterTrainingJobSummary bestTrainingJob) {
        setBestTrainingJob(bestTrainingJob);
        return this;
    }

    /**
     * <p>
     * If the hyperparameter tuning job is an warm start tuning job with a <code>WarmStartType</code> of
     * <code>IDENTICAL_DATA_AND_ALGORITHM</code>, this is the <a>TrainingJobSummary</a> for the training job with the
     * best objective metric value of all training jobs launched by this tuning job and all parent jobs specified for
     * the warm start tuning job.
     * </p>
     * 
     * @param overallBestTrainingJob
     *        If the hyperparameter tuning job is an warm start tuning job with a <code>WarmStartType</code> of
     *        <code>IDENTICAL_DATA_AND_ALGORITHM</code>, this is the <a>TrainingJobSummary</a> for the training job with
     *        the best objective metric value of all training jobs launched by this tuning job and all parent jobs
     *        specified for the warm start tuning job.
     */

    public void setOverallBestTrainingJob(HyperParameterTrainingJobSummary overallBestTrainingJob) {
        this.overallBestTrainingJob = overallBestTrainingJob;
    }

    /**
     * <p>
     * If the hyperparameter tuning job is an warm start tuning job with a <code>WarmStartType</code> of
     * <code>IDENTICAL_DATA_AND_ALGORITHM</code>, this is the <a>TrainingJobSummary</a> for the training job with the
     * best objective metric value of all training jobs launched by this tuning job and all parent jobs specified for
     * the warm start tuning job.
     * </p>
     * 
     * @return If the hyperparameter tuning job is an warm start tuning job with a <code>WarmStartType</code> of
     *         <code>IDENTICAL_DATA_AND_ALGORITHM</code>, this is the <a>TrainingJobSummary</a> for the training job
     *         with the best objective metric value of all training jobs launched by this tuning job and all parent jobs
     *         specified for the warm start tuning job.
     */

    public HyperParameterTrainingJobSummary getOverallBestTrainingJob() {
        return this.overallBestTrainingJob;
    }

    /**
     * <p>
     * If the hyperparameter tuning job is an warm start tuning job with a <code>WarmStartType</code> of
     * <code>IDENTICAL_DATA_AND_ALGORITHM</code>, this is the <a>TrainingJobSummary</a> for the training job with the
     * best objective metric value of all training jobs launched by this tuning job and all parent jobs specified for
     * the warm start tuning job.
     * </p>
     * 
     * @param overallBestTrainingJob
     *        If the hyperparameter tuning job is an warm start tuning job with a <code>WarmStartType</code> of
     *        <code>IDENTICAL_DATA_AND_ALGORITHM</code>, this is the <a>TrainingJobSummary</a> for the training job with
     *        the best objective metric value of all training jobs launched by this tuning job and all parent jobs
     *        specified for the warm start tuning job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHyperParameterTuningJobResult withOverallBestTrainingJob(HyperParameterTrainingJobSummary overallBestTrainingJob) {
        setOverallBestTrainingJob(overallBestTrainingJob);
        return this;
    }

    /**
     * <p>
     * The configuration for starting the hyperparameter parameter tuning job using one or more previous tuning jobs as
     * a starting point. The results of previous tuning jobs are used to inform which combinations of hyperparameters to
     * search over in the new tuning job.
     * </p>
     * 
     * @param warmStartConfig
     *        The configuration for starting the hyperparameter parameter tuning job using one or more previous tuning
     *        jobs as a starting point. The results of previous tuning jobs are used to inform which combinations of
     *        hyperparameters to search over in the new tuning job.
     */

    public void setWarmStartConfig(HyperParameterTuningJobWarmStartConfig warmStartConfig) {
        this.warmStartConfig = warmStartConfig;
    }

    /**
     * <p>
     * The configuration for starting the hyperparameter parameter tuning job using one or more previous tuning jobs as
     * a starting point. The results of previous tuning jobs are used to inform which combinations of hyperparameters to
     * search over in the new tuning job.
     * </p>
     * 
     * @return The configuration for starting the hyperparameter parameter tuning job using one or more previous tuning
     *         jobs as a starting point. The results of previous tuning jobs are used to inform which combinations of
     *         hyperparameters to search over in the new tuning job.
     */

    public HyperParameterTuningJobWarmStartConfig getWarmStartConfig() {
        return this.warmStartConfig;
    }

    /**
     * <p>
     * The configuration for starting the hyperparameter parameter tuning job using one or more previous tuning jobs as
     * a starting point. The results of previous tuning jobs are used to inform which combinations of hyperparameters to
     * search over in the new tuning job.
     * </p>
     * 
     * @param warmStartConfig
     *        The configuration for starting the hyperparameter parameter tuning job using one or more previous tuning
     *        jobs as a starting point. The results of previous tuning jobs are used to inform which combinations of
     *        hyperparameters to search over in the new tuning job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHyperParameterTuningJobResult withWarmStartConfig(HyperParameterTuningJobWarmStartConfig warmStartConfig) {
        setWarmStartConfig(warmStartConfig);
        return this;
    }

    /**
     * <p>
     * If the tuning job failed, the reason it failed.
     * </p>
     * 
     * @param failureReason
     *        If the tuning job failed, the reason it failed.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If the tuning job failed, the reason it failed.
     * </p>
     * 
     * @return If the tuning job failed, the reason it failed.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If the tuning job failed, the reason it failed.
     * </p>
     * 
     * @param failureReason
     *        If the tuning job failed, the reason it failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeHyperParameterTuningJobResult withFailureReason(String failureReason) {
        setFailureReason(failureReason);
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
        if (getHyperParameterTuningJobName() != null)
            sb.append("HyperParameterTuningJobName: ").append(getHyperParameterTuningJobName()).append(",");
        if (getHyperParameterTuningJobArn() != null)
            sb.append("HyperParameterTuningJobArn: ").append(getHyperParameterTuningJobArn()).append(",");
        if (getHyperParameterTuningJobConfig() != null)
            sb.append("HyperParameterTuningJobConfig: ").append(getHyperParameterTuningJobConfig()).append(",");
        if (getTrainingJobDefinition() != null)
            sb.append("TrainingJobDefinition: ").append(getTrainingJobDefinition()).append(",");
        if (getHyperParameterTuningJobStatus() != null)
            sb.append("HyperParameterTuningJobStatus: ").append(getHyperParameterTuningJobStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getHyperParameterTuningEndTime() != null)
            sb.append("HyperParameterTuningEndTime: ").append(getHyperParameterTuningEndTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getTrainingJobStatusCounters() != null)
            sb.append("TrainingJobStatusCounters: ").append(getTrainingJobStatusCounters()).append(",");
        if (getObjectiveStatusCounters() != null)
            sb.append("ObjectiveStatusCounters: ").append(getObjectiveStatusCounters()).append(",");
        if (getBestTrainingJob() != null)
            sb.append("BestTrainingJob: ").append(getBestTrainingJob()).append(",");
        if (getOverallBestTrainingJob() != null)
            sb.append("OverallBestTrainingJob: ").append(getOverallBestTrainingJob()).append(",");
        if (getWarmStartConfig() != null)
            sb.append("WarmStartConfig: ").append(getWarmStartConfig()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeHyperParameterTuningJobResult == false)
            return false;
        DescribeHyperParameterTuningJobResult other = (DescribeHyperParameterTuningJobResult) obj;
        if (other.getHyperParameterTuningJobName() == null ^ this.getHyperParameterTuningJobName() == null)
            return false;
        if (other.getHyperParameterTuningJobName() != null && other.getHyperParameterTuningJobName().equals(this.getHyperParameterTuningJobName()) == false)
            return false;
        if (other.getHyperParameterTuningJobArn() == null ^ this.getHyperParameterTuningJobArn() == null)
            return false;
        if (other.getHyperParameterTuningJobArn() != null && other.getHyperParameterTuningJobArn().equals(this.getHyperParameterTuningJobArn()) == false)
            return false;
        if (other.getHyperParameterTuningJobConfig() == null ^ this.getHyperParameterTuningJobConfig() == null)
            return false;
        if (other.getHyperParameterTuningJobConfig() != null
                && other.getHyperParameterTuningJobConfig().equals(this.getHyperParameterTuningJobConfig()) == false)
            return false;
        if (other.getTrainingJobDefinition() == null ^ this.getTrainingJobDefinition() == null)
            return false;
        if (other.getTrainingJobDefinition() != null && other.getTrainingJobDefinition().equals(this.getTrainingJobDefinition()) == false)
            return false;
        if (other.getHyperParameterTuningJobStatus() == null ^ this.getHyperParameterTuningJobStatus() == null)
            return false;
        if (other.getHyperParameterTuningJobStatus() != null
                && other.getHyperParameterTuningJobStatus().equals(this.getHyperParameterTuningJobStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getHyperParameterTuningEndTime() == null ^ this.getHyperParameterTuningEndTime() == null)
            return false;
        if (other.getHyperParameterTuningEndTime() != null && other.getHyperParameterTuningEndTime().equals(this.getHyperParameterTuningEndTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getTrainingJobStatusCounters() == null ^ this.getTrainingJobStatusCounters() == null)
            return false;
        if (other.getTrainingJobStatusCounters() != null && other.getTrainingJobStatusCounters().equals(this.getTrainingJobStatusCounters()) == false)
            return false;
        if (other.getObjectiveStatusCounters() == null ^ this.getObjectiveStatusCounters() == null)
            return false;
        if (other.getObjectiveStatusCounters() != null && other.getObjectiveStatusCounters().equals(this.getObjectiveStatusCounters()) == false)
            return false;
        if (other.getBestTrainingJob() == null ^ this.getBestTrainingJob() == null)
            return false;
        if (other.getBestTrainingJob() != null && other.getBestTrainingJob().equals(this.getBestTrainingJob()) == false)
            return false;
        if (other.getOverallBestTrainingJob() == null ^ this.getOverallBestTrainingJob() == null)
            return false;
        if (other.getOverallBestTrainingJob() != null && other.getOverallBestTrainingJob().equals(this.getOverallBestTrainingJob()) == false)
            return false;
        if (other.getWarmStartConfig() == null ^ this.getWarmStartConfig() == null)
            return false;
        if (other.getWarmStartConfig() != null && other.getWarmStartConfig().equals(this.getWarmStartConfig()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHyperParameterTuningJobName() == null) ? 0 : getHyperParameterTuningJobName().hashCode());
        hashCode = prime * hashCode + ((getHyperParameterTuningJobArn() == null) ? 0 : getHyperParameterTuningJobArn().hashCode());
        hashCode = prime * hashCode + ((getHyperParameterTuningJobConfig() == null) ? 0 : getHyperParameterTuningJobConfig().hashCode());
        hashCode = prime * hashCode + ((getTrainingJobDefinition() == null) ? 0 : getTrainingJobDefinition().hashCode());
        hashCode = prime * hashCode + ((getHyperParameterTuningJobStatus() == null) ? 0 : getHyperParameterTuningJobStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getHyperParameterTuningEndTime() == null) ? 0 : getHyperParameterTuningEndTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getTrainingJobStatusCounters() == null) ? 0 : getTrainingJobStatusCounters().hashCode());
        hashCode = prime * hashCode + ((getObjectiveStatusCounters() == null) ? 0 : getObjectiveStatusCounters().hashCode());
        hashCode = prime * hashCode + ((getBestTrainingJob() == null) ? 0 : getBestTrainingJob().hashCode());
        hashCode = prime * hashCode + ((getOverallBestTrainingJob() == null) ? 0 : getOverallBestTrainingJob().hashCode());
        hashCode = prime * hashCode + ((getWarmStartConfig() == null) ? 0 : getWarmStartConfig().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public DescribeHyperParameterTuningJobResult clone() {
        try {
            return (DescribeHyperParameterTuningJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
