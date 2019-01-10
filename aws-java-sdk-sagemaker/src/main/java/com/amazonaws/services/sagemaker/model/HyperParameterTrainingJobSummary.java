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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies summary information about a training job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/HyperParameterTrainingJobSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HyperParameterTrainingJobSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the training job.
     * </p>
     */
    private String trainingJobName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training job.
     * </p>
     */
    private String trainingJobArn;
    /**
     * <p>
     * The HyperParameter tuning job that launched the training job.
     * </p>
     */
    private String tuningJobName;
    /**
     * <p>
     * The date and time that the training job was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The date and time that the training job started.
     * </p>
     */
    private java.util.Date trainingStartTime;
    /**
     * <p>
     * Specifies the time when the training job ends on training instances. You are billed for the time interval between
     * the value of <code>TrainingStartTime</code> and this time. For successful jobs and stopped jobs, this is the time
     * after model artifacts are uploaded. For failed jobs, this is the time when Amazon SageMaker detects a job
     * failure.
     * </p>
     */
    private java.util.Date trainingEndTime;
    /**
     * <p>
     * The status of the training job.
     * </p>
     */
    private String trainingJobStatus;
    /**
     * <p>
     * A list of the hyperparameters for which you specified ranges to search.
     * </p>
     */
    private java.util.Map<String, String> tunedHyperParameters;
    /**
     * <p>
     * The reason that the training job failed.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The <a>FinalHyperParameterTuningJobObjectiveMetric</a> object that specifies the value of the objective metric of
     * the tuning job that launched this training job.
     * </p>
     */
    private FinalHyperParameterTuningJobObjectiveMetric finalHyperParameterTuningJobObjectiveMetric;
    /**
     * <p>
     * The status of the objective metric for the training job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Succeeded: The final objective metric for the training job was evaluated by the hyperparameter tuning job and
     * used in the hyperparameter tuning process.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Pending: The training job is in progress and evaluation of its final objective metric is pending.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Failed: The final objective metric for the training job was not evaluated, and was not used in the hyperparameter
     * tuning process. This typically occurs when the training job failed or did not emit an objective metric.
     * </p>
     * </li>
     * </ul>
     */
    private String objectiveStatus;

    /**
     * <p>
     * The name of the training job.
     * </p>
     * 
     * @param trainingJobName
     *        The name of the training job.
     */

    public void setTrainingJobName(String trainingJobName) {
        this.trainingJobName = trainingJobName;
    }

    /**
     * <p>
     * The name of the training job.
     * </p>
     * 
     * @return The name of the training job.
     */

    public String getTrainingJobName() {
        return this.trainingJobName;
    }

    /**
     * <p>
     * The name of the training job.
     * </p>
     * 
     * @param trainingJobName
     *        The name of the training job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTrainingJobSummary withTrainingJobName(String trainingJobName) {
        setTrainingJobName(trainingJobName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training job.
     * </p>
     * 
     * @param trainingJobArn
     *        The Amazon Resource Name (ARN) of the training job.
     */

    public void setTrainingJobArn(String trainingJobArn) {
        this.trainingJobArn = trainingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the training job.
     */

    public String getTrainingJobArn() {
        return this.trainingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training job.
     * </p>
     * 
     * @param trainingJobArn
     *        The Amazon Resource Name (ARN) of the training job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTrainingJobSummary withTrainingJobArn(String trainingJobArn) {
        setTrainingJobArn(trainingJobArn);
        return this;
    }

    /**
     * <p>
     * The HyperParameter tuning job that launched the training job.
     * </p>
     * 
     * @param tuningJobName
     *        The HyperParameter tuning job that launched the training job.
     */

    public void setTuningJobName(String tuningJobName) {
        this.tuningJobName = tuningJobName;
    }

    /**
     * <p>
     * The HyperParameter tuning job that launched the training job.
     * </p>
     * 
     * @return The HyperParameter tuning job that launched the training job.
     */

    public String getTuningJobName() {
        return this.tuningJobName;
    }

    /**
     * <p>
     * The HyperParameter tuning job that launched the training job.
     * </p>
     * 
     * @param tuningJobName
     *        The HyperParameter tuning job that launched the training job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTrainingJobSummary withTuningJobName(String tuningJobName) {
        setTuningJobName(tuningJobName);
        return this;
    }

    /**
     * <p>
     * The date and time that the training job was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time that the training job was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time that the training job was created.
     * </p>
     * 
     * @return The date and time that the training job was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time that the training job was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time that the training job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTrainingJobSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the training job started.
     * </p>
     * 
     * @param trainingStartTime
     *        The date and time that the training job started.
     */

    public void setTrainingStartTime(java.util.Date trainingStartTime) {
        this.trainingStartTime = trainingStartTime;
    }

    /**
     * <p>
     * The date and time that the training job started.
     * </p>
     * 
     * @return The date and time that the training job started.
     */

    public java.util.Date getTrainingStartTime() {
        return this.trainingStartTime;
    }

    /**
     * <p>
     * The date and time that the training job started.
     * </p>
     * 
     * @param trainingStartTime
     *        The date and time that the training job started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTrainingJobSummary withTrainingStartTime(java.util.Date trainingStartTime) {
        setTrainingStartTime(trainingStartTime);
        return this;
    }

    /**
     * <p>
     * Specifies the time when the training job ends on training instances. You are billed for the time interval between
     * the value of <code>TrainingStartTime</code> and this time. For successful jobs and stopped jobs, this is the time
     * after model artifacts are uploaded. For failed jobs, this is the time when Amazon SageMaker detects a job
     * failure.
     * </p>
     * 
     * @param trainingEndTime
     *        Specifies the time when the training job ends on training instances. You are billed for the time interval
     *        between the value of <code>TrainingStartTime</code> and this time. For successful jobs and stopped jobs,
     *        this is the time after model artifacts are uploaded. For failed jobs, this is the time when Amazon
     *        SageMaker detects a job failure.
     */

    public void setTrainingEndTime(java.util.Date trainingEndTime) {
        this.trainingEndTime = trainingEndTime;
    }

    /**
     * <p>
     * Specifies the time when the training job ends on training instances. You are billed for the time interval between
     * the value of <code>TrainingStartTime</code> and this time. For successful jobs and stopped jobs, this is the time
     * after model artifacts are uploaded. For failed jobs, this is the time when Amazon SageMaker detects a job
     * failure.
     * </p>
     * 
     * @return Specifies the time when the training job ends on training instances. You are billed for the time interval
     *         between the value of <code>TrainingStartTime</code> and this time. For successful jobs and stopped jobs,
     *         this is the time after model artifacts are uploaded. For failed jobs, this is the time when Amazon
     *         SageMaker detects a job failure.
     */

    public java.util.Date getTrainingEndTime() {
        return this.trainingEndTime;
    }

    /**
     * <p>
     * Specifies the time when the training job ends on training instances. You are billed for the time interval between
     * the value of <code>TrainingStartTime</code> and this time. For successful jobs and stopped jobs, this is the time
     * after model artifacts are uploaded. For failed jobs, this is the time when Amazon SageMaker detects a job
     * failure.
     * </p>
     * 
     * @param trainingEndTime
     *        Specifies the time when the training job ends on training instances. You are billed for the time interval
     *        between the value of <code>TrainingStartTime</code> and this time. For successful jobs and stopped jobs,
     *        this is the time after model artifacts are uploaded. For failed jobs, this is the time when Amazon
     *        SageMaker detects a job failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTrainingJobSummary withTrainingEndTime(java.util.Date trainingEndTime) {
        setTrainingEndTime(trainingEndTime);
        return this;
    }

    /**
     * <p>
     * The status of the training job.
     * </p>
     * 
     * @param trainingJobStatus
     *        The status of the training job.
     * @see TrainingJobStatus
     */

    public void setTrainingJobStatus(String trainingJobStatus) {
        this.trainingJobStatus = trainingJobStatus;
    }

    /**
     * <p>
     * The status of the training job.
     * </p>
     * 
     * @return The status of the training job.
     * @see TrainingJobStatus
     */

    public String getTrainingJobStatus() {
        return this.trainingJobStatus;
    }

    /**
     * <p>
     * The status of the training job.
     * </p>
     * 
     * @param trainingJobStatus
     *        The status of the training job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingJobStatus
     */

    public HyperParameterTrainingJobSummary withTrainingJobStatus(String trainingJobStatus) {
        setTrainingJobStatus(trainingJobStatus);
        return this;
    }

    /**
     * <p>
     * The status of the training job.
     * </p>
     * 
     * @param trainingJobStatus
     *        The status of the training job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingJobStatus
     */

    public HyperParameterTrainingJobSummary withTrainingJobStatus(TrainingJobStatus trainingJobStatus) {
        this.trainingJobStatus = trainingJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * A list of the hyperparameters for which you specified ranges to search.
     * </p>
     * 
     * @return A list of the hyperparameters for which you specified ranges to search.
     */

    public java.util.Map<String, String> getTunedHyperParameters() {
        return tunedHyperParameters;
    }

    /**
     * <p>
     * A list of the hyperparameters for which you specified ranges to search.
     * </p>
     * 
     * @param tunedHyperParameters
     *        A list of the hyperparameters for which you specified ranges to search.
     */

    public void setTunedHyperParameters(java.util.Map<String, String> tunedHyperParameters) {
        this.tunedHyperParameters = tunedHyperParameters;
    }

    /**
     * <p>
     * A list of the hyperparameters for which you specified ranges to search.
     * </p>
     * 
     * @param tunedHyperParameters
     *        A list of the hyperparameters for which you specified ranges to search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTrainingJobSummary withTunedHyperParameters(java.util.Map<String, String> tunedHyperParameters) {
        setTunedHyperParameters(tunedHyperParameters);
        return this;
    }

    public HyperParameterTrainingJobSummary addTunedHyperParametersEntry(String key, String value) {
        if (null == this.tunedHyperParameters) {
            this.tunedHyperParameters = new java.util.HashMap<String, String>();
        }
        if (this.tunedHyperParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tunedHyperParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into TunedHyperParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTrainingJobSummary clearTunedHyperParametersEntries() {
        this.tunedHyperParameters = null;
        return this;
    }

    /**
     * <p>
     * The reason that the training job failed.
     * </p>
     * 
     * @param failureReason
     *        The reason that the training job failed.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The reason that the training job failed.
     * </p>
     * 
     * @return The reason that the training job failed.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The reason that the training job failed.
     * </p>
     * 
     * @param failureReason
     *        The reason that the training job failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTrainingJobSummary withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The <a>FinalHyperParameterTuningJobObjectiveMetric</a> object that specifies the value of the objective metric of
     * the tuning job that launched this training job.
     * </p>
     * 
     * @param finalHyperParameterTuningJobObjectiveMetric
     *        The <a>FinalHyperParameterTuningJobObjectiveMetric</a> object that specifies the value of the objective
     *        metric of the tuning job that launched this training job.
     */

    public void setFinalHyperParameterTuningJobObjectiveMetric(FinalHyperParameterTuningJobObjectiveMetric finalHyperParameterTuningJobObjectiveMetric) {
        this.finalHyperParameterTuningJobObjectiveMetric = finalHyperParameterTuningJobObjectiveMetric;
    }

    /**
     * <p>
     * The <a>FinalHyperParameterTuningJobObjectiveMetric</a> object that specifies the value of the objective metric of
     * the tuning job that launched this training job.
     * </p>
     * 
     * @return The <a>FinalHyperParameterTuningJobObjectiveMetric</a> object that specifies the value of the objective
     *         metric of the tuning job that launched this training job.
     */

    public FinalHyperParameterTuningJobObjectiveMetric getFinalHyperParameterTuningJobObjectiveMetric() {
        return this.finalHyperParameterTuningJobObjectiveMetric;
    }

    /**
     * <p>
     * The <a>FinalHyperParameterTuningJobObjectiveMetric</a> object that specifies the value of the objective metric of
     * the tuning job that launched this training job.
     * </p>
     * 
     * @param finalHyperParameterTuningJobObjectiveMetric
     *        The <a>FinalHyperParameterTuningJobObjectiveMetric</a> object that specifies the value of the objective
     *        metric of the tuning job that launched this training job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTrainingJobSummary withFinalHyperParameterTuningJobObjectiveMetric(
            FinalHyperParameterTuningJobObjectiveMetric finalHyperParameterTuningJobObjectiveMetric) {
        setFinalHyperParameterTuningJobObjectiveMetric(finalHyperParameterTuningJobObjectiveMetric);
        return this;
    }

    /**
     * <p>
     * The status of the objective metric for the training job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Succeeded: The final objective metric for the training job was evaluated by the hyperparameter tuning job and
     * used in the hyperparameter tuning process.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Pending: The training job is in progress and evaluation of its final objective metric is pending.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Failed: The final objective metric for the training job was not evaluated, and was not used in the hyperparameter
     * tuning process. This typically occurs when the training job failed or did not emit an objective metric.
     * </p>
     * </li>
     * </ul>
     * 
     * @param objectiveStatus
     *        The status of the objective metric for the training job:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Succeeded: The final objective metric for the training job was evaluated by the hyperparameter tuning job
     *        and used in the hyperparameter tuning process.
     *        </p>
     *        </li>
     *        </ul>
     *        <ul>
     *        <li>
     *        <p>
     *        Pending: The training job is in progress and evaluation of its final objective metric is pending.
     *        </p>
     *        </li>
     *        </ul>
     *        <ul>
     *        <li>
     *        <p>
     *        Failed: The final objective metric for the training job was not evaluated, and was not used in the
     *        hyperparameter tuning process. This typically occurs when the training job failed or did not emit an
     *        objective metric.
     *        </p>
     *        </li>
     * @see ObjectiveStatus
     */

    public void setObjectiveStatus(String objectiveStatus) {
        this.objectiveStatus = objectiveStatus;
    }

    /**
     * <p>
     * The status of the objective metric for the training job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Succeeded: The final objective metric for the training job was evaluated by the hyperparameter tuning job and
     * used in the hyperparameter tuning process.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Pending: The training job is in progress and evaluation of its final objective metric is pending.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Failed: The final objective metric for the training job was not evaluated, and was not used in the hyperparameter
     * tuning process. This typically occurs when the training job failed or did not emit an objective metric.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the objective metric for the training job:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Succeeded: The final objective metric for the training job was evaluated by the hyperparameter tuning job
     *         and used in the hyperparameter tuning process.
     *         </p>
     *         </li>
     *         </ul>
     *         <ul>
     *         <li>
     *         <p>
     *         Pending: The training job is in progress and evaluation of its final objective metric is pending.
     *         </p>
     *         </li>
     *         </ul>
     *         <ul>
     *         <li>
     *         <p>
     *         Failed: The final objective metric for the training job was not evaluated, and was not used in the
     *         hyperparameter tuning process. This typically occurs when the training job failed or did not emit an
     *         objective metric.
     *         </p>
     *         </li>
     * @see ObjectiveStatus
     */

    public String getObjectiveStatus() {
        return this.objectiveStatus;
    }

    /**
     * <p>
     * The status of the objective metric for the training job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Succeeded: The final objective metric for the training job was evaluated by the hyperparameter tuning job and
     * used in the hyperparameter tuning process.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Pending: The training job is in progress and evaluation of its final objective metric is pending.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Failed: The final objective metric for the training job was not evaluated, and was not used in the hyperparameter
     * tuning process. This typically occurs when the training job failed or did not emit an objective metric.
     * </p>
     * </li>
     * </ul>
     * 
     * @param objectiveStatus
     *        The status of the objective metric for the training job:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Succeeded: The final objective metric for the training job was evaluated by the hyperparameter tuning job
     *        and used in the hyperparameter tuning process.
     *        </p>
     *        </li>
     *        </ul>
     *        <ul>
     *        <li>
     *        <p>
     *        Pending: The training job is in progress and evaluation of its final objective metric is pending.
     *        </p>
     *        </li>
     *        </ul>
     *        <ul>
     *        <li>
     *        <p>
     *        Failed: The final objective metric for the training job was not evaluated, and was not used in the
     *        hyperparameter tuning process. This typically occurs when the training job failed or did not emit an
     *        objective metric.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ObjectiveStatus
     */

    public HyperParameterTrainingJobSummary withObjectiveStatus(String objectiveStatus) {
        setObjectiveStatus(objectiveStatus);
        return this;
    }

    /**
     * <p>
     * The status of the objective metric for the training job:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Succeeded: The final objective metric for the training job was evaluated by the hyperparameter tuning job and
     * used in the hyperparameter tuning process.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Pending: The training job is in progress and evaluation of its final objective metric is pending.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * Failed: The final objective metric for the training job was not evaluated, and was not used in the hyperparameter
     * tuning process. This typically occurs when the training job failed or did not emit an objective metric.
     * </p>
     * </li>
     * </ul>
     * 
     * @param objectiveStatus
     *        The status of the objective metric for the training job:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Succeeded: The final objective metric for the training job was evaluated by the hyperparameter tuning job
     *        and used in the hyperparameter tuning process.
     *        </p>
     *        </li>
     *        </ul>
     *        <ul>
     *        <li>
     *        <p>
     *        Pending: The training job is in progress and evaluation of its final objective metric is pending.
     *        </p>
     *        </li>
     *        </ul>
     *        <ul>
     *        <li>
     *        <p>
     *        Failed: The final objective metric for the training job was not evaluated, and was not used in the
     *        hyperparameter tuning process. This typically occurs when the training job failed or did not emit an
     *        objective metric.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ObjectiveStatus
     */

    public HyperParameterTrainingJobSummary withObjectiveStatus(ObjectiveStatus objectiveStatus) {
        this.objectiveStatus = objectiveStatus.toString();
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
        if (getTrainingJobName() != null)
            sb.append("TrainingJobName: ").append(getTrainingJobName()).append(",");
        if (getTrainingJobArn() != null)
            sb.append("TrainingJobArn: ").append(getTrainingJobArn()).append(",");
        if (getTuningJobName() != null)
            sb.append("TuningJobName: ").append(getTuningJobName()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getTrainingStartTime() != null)
            sb.append("TrainingStartTime: ").append(getTrainingStartTime()).append(",");
        if (getTrainingEndTime() != null)
            sb.append("TrainingEndTime: ").append(getTrainingEndTime()).append(",");
        if (getTrainingJobStatus() != null)
            sb.append("TrainingJobStatus: ").append(getTrainingJobStatus()).append(",");
        if (getTunedHyperParameters() != null)
            sb.append("TunedHyperParameters: ").append(getTunedHyperParameters()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getFinalHyperParameterTuningJobObjectiveMetric() != null)
            sb.append("FinalHyperParameterTuningJobObjectiveMetric: ").append(getFinalHyperParameterTuningJobObjectiveMetric()).append(",");
        if (getObjectiveStatus() != null)
            sb.append("ObjectiveStatus: ").append(getObjectiveStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HyperParameterTrainingJobSummary == false)
            return false;
        HyperParameterTrainingJobSummary other = (HyperParameterTrainingJobSummary) obj;
        if (other.getTrainingJobName() == null ^ this.getTrainingJobName() == null)
            return false;
        if (other.getTrainingJobName() != null && other.getTrainingJobName().equals(this.getTrainingJobName()) == false)
            return false;
        if (other.getTrainingJobArn() == null ^ this.getTrainingJobArn() == null)
            return false;
        if (other.getTrainingJobArn() != null && other.getTrainingJobArn().equals(this.getTrainingJobArn()) == false)
            return false;
        if (other.getTuningJobName() == null ^ this.getTuningJobName() == null)
            return false;
        if (other.getTuningJobName() != null && other.getTuningJobName().equals(this.getTuningJobName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getTrainingStartTime() == null ^ this.getTrainingStartTime() == null)
            return false;
        if (other.getTrainingStartTime() != null && other.getTrainingStartTime().equals(this.getTrainingStartTime()) == false)
            return false;
        if (other.getTrainingEndTime() == null ^ this.getTrainingEndTime() == null)
            return false;
        if (other.getTrainingEndTime() != null && other.getTrainingEndTime().equals(this.getTrainingEndTime()) == false)
            return false;
        if (other.getTrainingJobStatus() == null ^ this.getTrainingJobStatus() == null)
            return false;
        if (other.getTrainingJobStatus() != null && other.getTrainingJobStatus().equals(this.getTrainingJobStatus()) == false)
            return false;
        if (other.getTunedHyperParameters() == null ^ this.getTunedHyperParameters() == null)
            return false;
        if (other.getTunedHyperParameters() != null && other.getTunedHyperParameters().equals(this.getTunedHyperParameters()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getFinalHyperParameterTuningJobObjectiveMetric() == null ^ this.getFinalHyperParameterTuningJobObjectiveMetric() == null)
            return false;
        if (other.getFinalHyperParameterTuningJobObjectiveMetric() != null
                && other.getFinalHyperParameterTuningJobObjectiveMetric().equals(this.getFinalHyperParameterTuningJobObjectiveMetric()) == false)
            return false;
        if (other.getObjectiveStatus() == null ^ this.getObjectiveStatus() == null)
            return false;
        if (other.getObjectiveStatus() != null && other.getObjectiveStatus().equals(this.getObjectiveStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrainingJobName() == null) ? 0 : getTrainingJobName().hashCode());
        hashCode = prime * hashCode + ((getTrainingJobArn() == null) ? 0 : getTrainingJobArn().hashCode());
        hashCode = prime * hashCode + ((getTuningJobName() == null) ? 0 : getTuningJobName().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getTrainingStartTime() == null) ? 0 : getTrainingStartTime().hashCode());
        hashCode = prime * hashCode + ((getTrainingEndTime() == null) ? 0 : getTrainingEndTime().hashCode());
        hashCode = prime * hashCode + ((getTrainingJobStatus() == null) ? 0 : getTrainingJobStatus().hashCode());
        hashCode = prime * hashCode + ((getTunedHyperParameters() == null) ? 0 : getTunedHyperParameters().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode
                + ((getFinalHyperParameterTuningJobObjectiveMetric() == null) ? 0 : getFinalHyperParameterTuningJobObjectiveMetric().hashCode());
        hashCode = prime * hashCode + ((getObjectiveStatus() == null) ? 0 : getObjectiveStatus().hashCode());
        return hashCode;
    }

    @Override
    public HyperParameterTrainingJobSummary clone() {
        try {
            return (HyperParameterTrainingJobSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.HyperParameterTrainingJobSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
