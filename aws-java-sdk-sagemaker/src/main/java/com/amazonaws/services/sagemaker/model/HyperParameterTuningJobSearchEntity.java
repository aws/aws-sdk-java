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
 * An entity returned by the <a
 * href="https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_SearchRecord.html">SearchRecord</a> API
 * containing the properties of a hyperparameter tuning job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/HyperParameterTuningJobSearchEntity"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HyperParameterTuningJobSearchEntity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a hyperparameter tuning job.
     * </p>
     */
    private String hyperParameterTuningJobName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of a hyperparameter tuning job.
     * </p>
     */
    private String hyperParameterTuningJobArn;

    private HyperParameterTuningJobConfig hyperParameterTuningJobConfig;

    private HyperParameterTrainingJobDefinition trainingJobDefinition;
    /**
     * <p>
     * The job definitions included in a hyperparameter tuning job.
     * </p>
     */
    private java.util.List<HyperParameterTrainingJobDefinition> trainingJobDefinitions;
    /**
     * <p>
     * The status of a hyperparameter tuning job.
     * </p>
     */
    private String hyperParameterTuningJobStatus;
    /**
     * <p>
     * The time that a hyperparameter tuning job was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time that a hyperparameter tuning job ended.
     * </p>
     */
    private java.util.Date hyperParameterTuningEndTime;
    /**
     * <p>
     * The time that a hyperparameter tuning job was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    private TrainingJobStatusCounters trainingJobStatusCounters;

    private ObjectiveStatusCounters objectiveStatusCounters;

    private HyperParameterTrainingJobSummary bestTrainingJob;

    private HyperParameterTrainingJobSummary overallBestTrainingJob;

    private HyperParameterTuningJobWarmStartConfig warmStartConfig;
    /**
     * <p>
     * The error that was created when a hyperparameter tuning job failed.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The tags associated with a hyperparameter tuning job. For more information see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of a hyperparameter tuning job.
     * </p>
     * 
     * @param hyperParameterTuningJobName
     *        The name of a hyperparameter tuning job.
     */

    public void setHyperParameterTuningJobName(String hyperParameterTuningJobName) {
        this.hyperParameterTuningJobName = hyperParameterTuningJobName;
    }

    /**
     * <p>
     * The name of a hyperparameter tuning job.
     * </p>
     * 
     * @return The name of a hyperparameter tuning job.
     */

    public String getHyperParameterTuningJobName() {
        return this.hyperParameterTuningJobName;
    }

    /**
     * <p>
     * The name of a hyperparameter tuning job.
     * </p>
     * 
     * @param hyperParameterTuningJobName
     *        The name of a hyperparameter tuning job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTuningJobSearchEntity withHyperParameterTuningJobName(String hyperParameterTuningJobName) {
        setHyperParameterTuningJobName(hyperParameterTuningJobName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a hyperparameter tuning job.
     * </p>
     * 
     * @param hyperParameterTuningJobArn
     *        The Amazon Resource Name (ARN) of a hyperparameter tuning job.
     */

    public void setHyperParameterTuningJobArn(String hyperParameterTuningJobArn) {
        this.hyperParameterTuningJobArn = hyperParameterTuningJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a hyperparameter tuning job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of a hyperparameter tuning job.
     */

    public String getHyperParameterTuningJobArn() {
        return this.hyperParameterTuningJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a hyperparameter tuning job.
     * </p>
     * 
     * @param hyperParameterTuningJobArn
     *        The Amazon Resource Name (ARN) of a hyperparameter tuning job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTuningJobSearchEntity withHyperParameterTuningJobArn(String hyperParameterTuningJobArn) {
        setHyperParameterTuningJobArn(hyperParameterTuningJobArn);
        return this;
    }

    /**
     * @param hyperParameterTuningJobConfig
     */

    public void setHyperParameterTuningJobConfig(HyperParameterTuningJobConfig hyperParameterTuningJobConfig) {
        this.hyperParameterTuningJobConfig = hyperParameterTuningJobConfig;
    }

    /**
     * @return
     */

    public HyperParameterTuningJobConfig getHyperParameterTuningJobConfig() {
        return this.hyperParameterTuningJobConfig;
    }

    /**
     * @param hyperParameterTuningJobConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTuningJobSearchEntity withHyperParameterTuningJobConfig(HyperParameterTuningJobConfig hyperParameterTuningJobConfig) {
        setHyperParameterTuningJobConfig(hyperParameterTuningJobConfig);
        return this;
    }

    /**
     * @param trainingJobDefinition
     */

    public void setTrainingJobDefinition(HyperParameterTrainingJobDefinition trainingJobDefinition) {
        this.trainingJobDefinition = trainingJobDefinition;
    }

    /**
     * @return
     */

    public HyperParameterTrainingJobDefinition getTrainingJobDefinition() {
        return this.trainingJobDefinition;
    }

    /**
     * @param trainingJobDefinition
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTuningJobSearchEntity withTrainingJobDefinition(HyperParameterTrainingJobDefinition trainingJobDefinition) {
        setTrainingJobDefinition(trainingJobDefinition);
        return this;
    }

    /**
     * <p>
     * The job definitions included in a hyperparameter tuning job.
     * </p>
     * 
     * @return The job definitions included in a hyperparameter tuning job.
     */

    public java.util.List<HyperParameterTrainingJobDefinition> getTrainingJobDefinitions() {
        return trainingJobDefinitions;
    }

    /**
     * <p>
     * The job definitions included in a hyperparameter tuning job.
     * </p>
     * 
     * @param trainingJobDefinitions
     *        The job definitions included in a hyperparameter tuning job.
     */

    public void setTrainingJobDefinitions(java.util.Collection<HyperParameterTrainingJobDefinition> trainingJobDefinitions) {
        if (trainingJobDefinitions == null) {
            this.trainingJobDefinitions = null;
            return;
        }

        this.trainingJobDefinitions = new java.util.ArrayList<HyperParameterTrainingJobDefinition>(trainingJobDefinitions);
    }

    /**
     * <p>
     * The job definitions included in a hyperparameter tuning job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTrainingJobDefinitions(java.util.Collection)} or
     * {@link #withTrainingJobDefinitions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param trainingJobDefinitions
     *        The job definitions included in a hyperparameter tuning job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTuningJobSearchEntity withTrainingJobDefinitions(HyperParameterTrainingJobDefinition... trainingJobDefinitions) {
        if (this.trainingJobDefinitions == null) {
            setTrainingJobDefinitions(new java.util.ArrayList<HyperParameterTrainingJobDefinition>(trainingJobDefinitions.length));
        }
        for (HyperParameterTrainingJobDefinition ele : trainingJobDefinitions) {
            this.trainingJobDefinitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The job definitions included in a hyperparameter tuning job.
     * </p>
     * 
     * @param trainingJobDefinitions
     *        The job definitions included in a hyperparameter tuning job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTuningJobSearchEntity withTrainingJobDefinitions(java.util.Collection<HyperParameterTrainingJobDefinition> trainingJobDefinitions) {
        setTrainingJobDefinitions(trainingJobDefinitions);
        return this;
    }

    /**
     * <p>
     * The status of a hyperparameter tuning job.
     * </p>
     * 
     * @param hyperParameterTuningJobStatus
     *        The status of a hyperparameter tuning job.
     * @see HyperParameterTuningJobStatus
     */

    public void setHyperParameterTuningJobStatus(String hyperParameterTuningJobStatus) {
        this.hyperParameterTuningJobStatus = hyperParameterTuningJobStatus;
    }

    /**
     * <p>
     * The status of a hyperparameter tuning job.
     * </p>
     * 
     * @return The status of a hyperparameter tuning job.
     * @see HyperParameterTuningJobStatus
     */

    public String getHyperParameterTuningJobStatus() {
        return this.hyperParameterTuningJobStatus;
    }

    /**
     * <p>
     * The status of a hyperparameter tuning job.
     * </p>
     * 
     * @param hyperParameterTuningJobStatus
     *        The status of a hyperparameter tuning job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HyperParameterTuningJobStatus
     */

    public HyperParameterTuningJobSearchEntity withHyperParameterTuningJobStatus(String hyperParameterTuningJobStatus) {
        setHyperParameterTuningJobStatus(hyperParameterTuningJobStatus);
        return this;
    }

    /**
     * <p>
     * The status of a hyperparameter tuning job.
     * </p>
     * 
     * @param hyperParameterTuningJobStatus
     *        The status of a hyperparameter tuning job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HyperParameterTuningJobStatus
     */

    public HyperParameterTuningJobSearchEntity withHyperParameterTuningJobStatus(HyperParameterTuningJobStatus hyperParameterTuningJobStatus) {
        this.hyperParameterTuningJobStatus = hyperParameterTuningJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The time that a hyperparameter tuning job was created.
     * </p>
     * 
     * @param creationTime
     *        The time that a hyperparameter tuning job was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that a hyperparameter tuning job was created.
     * </p>
     * 
     * @return The time that a hyperparameter tuning job was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time that a hyperparameter tuning job was created.
     * </p>
     * 
     * @param creationTime
     *        The time that a hyperparameter tuning job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTuningJobSearchEntity withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time that a hyperparameter tuning job ended.
     * </p>
     * 
     * @param hyperParameterTuningEndTime
     *        The time that a hyperparameter tuning job ended.
     */

    public void setHyperParameterTuningEndTime(java.util.Date hyperParameterTuningEndTime) {
        this.hyperParameterTuningEndTime = hyperParameterTuningEndTime;
    }

    /**
     * <p>
     * The time that a hyperparameter tuning job ended.
     * </p>
     * 
     * @return The time that a hyperparameter tuning job ended.
     */

    public java.util.Date getHyperParameterTuningEndTime() {
        return this.hyperParameterTuningEndTime;
    }

    /**
     * <p>
     * The time that a hyperparameter tuning job ended.
     * </p>
     * 
     * @param hyperParameterTuningEndTime
     *        The time that a hyperparameter tuning job ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTuningJobSearchEntity withHyperParameterTuningEndTime(java.util.Date hyperParameterTuningEndTime) {
        setHyperParameterTuningEndTime(hyperParameterTuningEndTime);
        return this;
    }

    /**
     * <p>
     * The time that a hyperparameter tuning job was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The time that a hyperparameter tuning job was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The time that a hyperparameter tuning job was last modified.
     * </p>
     * 
     * @return The time that a hyperparameter tuning job was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The time that a hyperparameter tuning job was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The time that a hyperparameter tuning job was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTuningJobSearchEntity withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * @param trainingJobStatusCounters
     */

    public void setTrainingJobStatusCounters(TrainingJobStatusCounters trainingJobStatusCounters) {
        this.trainingJobStatusCounters = trainingJobStatusCounters;
    }

    /**
     * @return
     */

    public TrainingJobStatusCounters getTrainingJobStatusCounters() {
        return this.trainingJobStatusCounters;
    }

    /**
     * @param trainingJobStatusCounters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTuningJobSearchEntity withTrainingJobStatusCounters(TrainingJobStatusCounters trainingJobStatusCounters) {
        setTrainingJobStatusCounters(trainingJobStatusCounters);
        return this;
    }

    /**
     * @param objectiveStatusCounters
     */

    public void setObjectiveStatusCounters(ObjectiveStatusCounters objectiveStatusCounters) {
        this.objectiveStatusCounters = objectiveStatusCounters;
    }

    /**
     * @return
     */

    public ObjectiveStatusCounters getObjectiveStatusCounters() {
        return this.objectiveStatusCounters;
    }

    /**
     * @param objectiveStatusCounters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTuningJobSearchEntity withObjectiveStatusCounters(ObjectiveStatusCounters objectiveStatusCounters) {
        setObjectiveStatusCounters(objectiveStatusCounters);
        return this;
    }

    /**
     * @param bestTrainingJob
     */

    public void setBestTrainingJob(HyperParameterTrainingJobSummary bestTrainingJob) {
        this.bestTrainingJob = bestTrainingJob;
    }

    /**
     * @return
     */

    public HyperParameterTrainingJobSummary getBestTrainingJob() {
        return this.bestTrainingJob;
    }

    /**
     * @param bestTrainingJob
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTuningJobSearchEntity withBestTrainingJob(HyperParameterTrainingJobSummary bestTrainingJob) {
        setBestTrainingJob(bestTrainingJob);
        return this;
    }

    /**
     * @param overallBestTrainingJob
     */

    public void setOverallBestTrainingJob(HyperParameterTrainingJobSummary overallBestTrainingJob) {
        this.overallBestTrainingJob = overallBestTrainingJob;
    }

    /**
     * @return
     */

    public HyperParameterTrainingJobSummary getOverallBestTrainingJob() {
        return this.overallBestTrainingJob;
    }

    /**
     * @param overallBestTrainingJob
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTuningJobSearchEntity withOverallBestTrainingJob(HyperParameterTrainingJobSummary overallBestTrainingJob) {
        setOverallBestTrainingJob(overallBestTrainingJob);
        return this;
    }

    /**
     * @param warmStartConfig
     */

    public void setWarmStartConfig(HyperParameterTuningJobWarmStartConfig warmStartConfig) {
        this.warmStartConfig = warmStartConfig;
    }

    /**
     * @return
     */

    public HyperParameterTuningJobWarmStartConfig getWarmStartConfig() {
        return this.warmStartConfig;
    }

    /**
     * @param warmStartConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTuningJobSearchEntity withWarmStartConfig(HyperParameterTuningJobWarmStartConfig warmStartConfig) {
        setWarmStartConfig(warmStartConfig);
        return this;
    }

    /**
     * <p>
     * The error that was created when a hyperparameter tuning job failed.
     * </p>
     * 
     * @param failureReason
     *        The error that was created when a hyperparameter tuning job failed.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The error that was created when a hyperparameter tuning job failed.
     * </p>
     * 
     * @return The error that was created when a hyperparameter tuning job failed.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The error that was created when a hyperparameter tuning job failed.
     * </p>
     * 
     * @param failureReason
     *        The error that was created when a hyperparameter tuning job failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTuningJobSearchEntity withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The tags associated with a hyperparameter tuning job. For more information see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>.
     * </p>
     * 
     * @return The tags associated with a hyperparameter tuning job. For more information see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *         resources</a>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags associated with a hyperparameter tuning job. For more information see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>.
     * </p>
     * 
     * @param tags
     *        The tags associated with a hyperparameter tuning job. For more information see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        resources</a>.
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
     * The tags associated with a hyperparameter tuning job. For more information see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags associated with a hyperparameter tuning job. For more information see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        resources</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTuningJobSearchEntity withTags(Tag... tags) {
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
     * The tags associated with a hyperparameter tuning job. For more information see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>.
     * </p>
     * 
     * @param tags
     *        The tags associated with a hyperparameter tuning job. For more information see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        resources</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTuningJobSearchEntity withTags(java.util.Collection<Tag> tags) {
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
        if (getHyperParameterTuningJobName() != null)
            sb.append("HyperParameterTuningJobName: ").append(getHyperParameterTuningJobName()).append(",");
        if (getHyperParameterTuningJobArn() != null)
            sb.append("HyperParameterTuningJobArn: ").append(getHyperParameterTuningJobArn()).append(",");
        if (getHyperParameterTuningJobConfig() != null)
            sb.append("HyperParameterTuningJobConfig: ").append(getHyperParameterTuningJobConfig()).append(",");
        if (getTrainingJobDefinition() != null)
            sb.append("TrainingJobDefinition: ").append(getTrainingJobDefinition()).append(",");
        if (getTrainingJobDefinitions() != null)
            sb.append("TrainingJobDefinitions: ").append(getTrainingJobDefinitions()).append(",");
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
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
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

        if (obj instanceof HyperParameterTuningJobSearchEntity == false)
            return false;
        HyperParameterTuningJobSearchEntity other = (HyperParameterTuningJobSearchEntity) obj;
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
        if (other.getTrainingJobDefinitions() == null ^ this.getTrainingJobDefinitions() == null)
            return false;
        if (other.getTrainingJobDefinitions() != null && other.getTrainingJobDefinitions().equals(this.getTrainingJobDefinitions()) == false)
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

        hashCode = prime * hashCode + ((getHyperParameterTuningJobName() == null) ? 0 : getHyperParameterTuningJobName().hashCode());
        hashCode = prime * hashCode + ((getHyperParameterTuningJobArn() == null) ? 0 : getHyperParameterTuningJobArn().hashCode());
        hashCode = prime * hashCode + ((getHyperParameterTuningJobConfig() == null) ? 0 : getHyperParameterTuningJobConfig().hashCode());
        hashCode = prime * hashCode + ((getTrainingJobDefinition() == null) ? 0 : getTrainingJobDefinition().hashCode());
        hashCode = prime * hashCode + ((getTrainingJobDefinitions() == null) ? 0 : getTrainingJobDefinitions().hashCode());
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
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public HyperParameterTuningJobSearchEntity clone() {
        try {
            return (HyperParameterTuningJobSearchEntity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.HyperParameterTuningJobSearchEntityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
