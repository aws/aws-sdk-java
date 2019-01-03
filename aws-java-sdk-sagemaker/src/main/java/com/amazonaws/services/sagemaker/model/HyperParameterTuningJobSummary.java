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
 * Provides summary information about a hyperparameter tuning job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/HyperParameterTuningJobSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HyperParameterTuningJobSummary implements Serializable, Cloneable, StructuredPojo {

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
     * The status of the tuning job.
     * </p>
     */
    private String hyperParameterTuningJobStatus;
    /**
     * <p>
     * Specifies the search strategy hyperparameter tuning uses to choose which hyperparameters to use for each
     * iteration. Currently, the only valid value is Bayesian.
     * </p>
     */
    private String strategy;
    /**
     * <p>
     * The date and time that the tuning job was created.
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
     * The date and time that the tuning job was modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The <a>TrainingJobStatusCounters</a> object that specifies the numbers of training jobs, categorized by status,
     * that this tuning job launched.
     * </p>
     */
    private TrainingJobStatusCounters trainingJobStatusCounters;
    /**
     * <p>
     * The <a>ObjectiveStatusCounters</a> object that specifies the numbers of training jobs, categorized by objective
     * metric status, that this tuning job launched.
     * </p>
     */
    private ObjectiveStatusCounters objectiveStatusCounters;
    /**
     * <p>
     * The <a>ResourceLimits</a> object that specifies the maximum number of training jobs and parallel training jobs
     * allowed for this tuning job.
     * </p>
     */
    private ResourceLimits resourceLimits;

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

    public HyperParameterTuningJobSummary withHyperParameterTuningJobName(String hyperParameterTuningJobName) {
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

    public HyperParameterTuningJobSummary withHyperParameterTuningJobArn(String hyperParameterTuningJobArn) {
        setHyperParameterTuningJobArn(hyperParameterTuningJobArn);
        return this;
    }

    /**
     * <p>
     * The status of the tuning job.
     * </p>
     * 
     * @param hyperParameterTuningJobStatus
     *        The status of the tuning job.
     * @see HyperParameterTuningJobStatus
     */

    public void setHyperParameterTuningJobStatus(String hyperParameterTuningJobStatus) {
        this.hyperParameterTuningJobStatus = hyperParameterTuningJobStatus;
    }

    /**
     * <p>
     * The status of the tuning job.
     * </p>
     * 
     * @return The status of the tuning job.
     * @see HyperParameterTuningJobStatus
     */

    public String getHyperParameterTuningJobStatus() {
        return this.hyperParameterTuningJobStatus;
    }

    /**
     * <p>
     * The status of the tuning job.
     * </p>
     * 
     * @param hyperParameterTuningJobStatus
     *        The status of the tuning job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HyperParameterTuningJobStatus
     */

    public HyperParameterTuningJobSummary withHyperParameterTuningJobStatus(String hyperParameterTuningJobStatus) {
        setHyperParameterTuningJobStatus(hyperParameterTuningJobStatus);
        return this;
    }

    /**
     * <p>
     * The status of the tuning job.
     * </p>
     * 
     * @param hyperParameterTuningJobStatus
     *        The status of the tuning job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HyperParameterTuningJobStatus
     */

    public HyperParameterTuningJobSummary withHyperParameterTuningJobStatus(HyperParameterTuningJobStatus hyperParameterTuningJobStatus) {
        this.hyperParameterTuningJobStatus = hyperParameterTuningJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the search strategy hyperparameter tuning uses to choose which hyperparameters to use for each
     * iteration. Currently, the only valid value is Bayesian.
     * </p>
     * 
     * @param strategy
     *        Specifies the search strategy hyperparameter tuning uses to choose which hyperparameters to use for each
     *        iteration. Currently, the only valid value is Bayesian.
     * @see HyperParameterTuningJobStrategyType
     */

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    /**
     * <p>
     * Specifies the search strategy hyperparameter tuning uses to choose which hyperparameters to use for each
     * iteration. Currently, the only valid value is Bayesian.
     * </p>
     * 
     * @return Specifies the search strategy hyperparameter tuning uses to choose which hyperparameters to use for each
     *         iteration. Currently, the only valid value is Bayesian.
     * @see HyperParameterTuningJobStrategyType
     */

    public String getStrategy() {
        return this.strategy;
    }

    /**
     * <p>
     * Specifies the search strategy hyperparameter tuning uses to choose which hyperparameters to use for each
     * iteration. Currently, the only valid value is Bayesian.
     * </p>
     * 
     * @param strategy
     *        Specifies the search strategy hyperparameter tuning uses to choose which hyperparameters to use for each
     *        iteration. Currently, the only valid value is Bayesian.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HyperParameterTuningJobStrategyType
     */

    public HyperParameterTuningJobSummary withStrategy(String strategy) {
        setStrategy(strategy);
        return this;
    }

    /**
     * <p>
     * Specifies the search strategy hyperparameter tuning uses to choose which hyperparameters to use for each
     * iteration. Currently, the only valid value is Bayesian.
     * </p>
     * 
     * @param strategy
     *        Specifies the search strategy hyperparameter tuning uses to choose which hyperparameters to use for each
     *        iteration. Currently, the only valid value is Bayesian.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HyperParameterTuningJobStrategyType
     */

    public HyperParameterTuningJobSummary withStrategy(HyperParameterTuningJobStrategyType strategy) {
        this.strategy = strategy.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the tuning job was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time that the tuning job was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The date and time that the tuning job was created.
     * </p>
     * 
     * @return The date and time that the tuning job was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The date and time that the tuning job was created.
     * </p>
     * 
     * @param creationTime
     *        The date and time that the tuning job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTuningJobSummary withCreationTime(java.util.Date creationTime) {
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

    public HyperParameterTuningJobSummary withHyperParameterTuningEndTime(java.util.Date hyperParameterTuningEndTime) {
        setHyperParameterTuningEndTime(hyperParameterTuningEndTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the tuning job was modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time that the tuning job was modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the tuning job was modified.
     * </p>
     * 
     * @return The date and time that the tuning job was modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The date and time that the tuning job was modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The date and time that the tuning job was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTuningJobSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The <a>TrainingJobStatusCounters</a> object that specifies the numbers of training jobs, categorized by status,
     * that this tuning job launched.
     * </p>
     * 
     * @param trainingJobStatusCounters
     *        The <a>TrainingJobStatusCounters</a> object that specifies the numbers of training jobs, categorized by
     *        status, that this tuning job launched.
     */

    public void setTrainingJobStatusCounters(TrainingJobStatusCounters trainingJobStatusCounters) {
        this.trainingJobStatusCounters = trainingJobStatusCounters;
    }

    /**
     * <p>
     * The <a>TrainingJobStatusCounters</a> object that specifies the numbers of training jobs, categorized by status,
     * that this tuning job launched.
     * </p>
     * 
     * @return The <a>TrainingJobStatusCounters</a> object that specifies the numbers of training jobs, categorized by
     *         status, that this tuning job launched.
     */

    public TrainingJobStatusCounters getTrainingJobStatusCounters() {
        return this.trainingJobStatusCounters;
    }

    /**
     * <p>
     * The <a>TrainingJobStatusCounters</a> object that specifies the numbers of training jobs, categorized by status,
     * that this tuning job launched.
     * </p>
     * 
     * @param trainingJobStatusCounters
     *        The <a>TrainingJobStatusCounters</a> object that specifies the numbers of training jobs, categorized by
     *        status, that this tuning job launched.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTuningJobSummary withTrainingJobStatusCounters(TrainingJobStatusCounters trainingJobStatusCounters) {
        setTrainingJobStatusCounters(trainingJobStatusCounters);
        return this;
    }

    /**
     * <p>
     * The <a>ObjectiveStatusCounters</a> object that specifies the numbers of training jobs, categorized by objective
     * metric status, that this tuning job launched.
     * </p>
     * 
     * @param objectiveStatusCounters
     *        The <a>ObjectiveStatusCounters</a> object that specifies the numbers of training jobs, categorized by
     *        objective metric status, that this tuning job launched.
     */

    public void setObjectiveStatusCounters(ObjectiveStatusCounters objectiveStatusCounters) {
        this.objectiveStatusCounters = objectiveStatusCounters;
    }

    /**
     * <p>
     * The <a>ObjectiveStatusCounters</a> object that specifies the numbers of training jobs, categorized by objective
     * metric status, that this tuning job launched.
     * </p>
     * 
     * @return The <a>ObjectiveStatusCounters</a> object that specifies the numbers of training jobs, categorized by
     *         objective metric status, that this tuning job launched.
     */

    public ObjectiveStatusCounters getObjectiveStatusCounters() {
        return this.objectiveStatusCounters;
    }

    /**
     * <p>
     * The <a>ObjectiveStatusCounters</a> object that specifies the numbers of training jobs, categorized by objective
     * metric status, that this tuning job launched.
     * </p>
     * 
     * @param objectiveStatusCounters
     *        The <a>ObjectiveStatusCounters</a> object that specifies the numbers of training jobs, categorized by
     *        objective metric status, that this tuning job launched.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTuningJobSummary withObjectiveStatusCounters(ObjectiveStatusCounters objectiveStatusCounters) {
        setObjectiveStatusCounters(objectiveStatusCounters);
        return this;
    }

    /**
     * <p>
     * The <a>ResourceLimits</a> object that specifies the maximum number of training jobs and parallel training jobs
     * allowed for this tuning job.
     * </p>
     * 
     * @param resourceLimits
     *        The <a>ResourceLimits</a> object that specifies the maximum number of training jobs and parallel training
     *        jobs allowed for this tuning job.
     */

    public void setResourceLimits(ResourceLimits resourceLimits) {
        this.resourceLimits = resourceLimits;
    }

    /**
     * <p>
     * The <a>ResourceLimits</a> object that specifies the maximum number of training jobs and parallel training jobs
     * allowed for this tuning job.
     * </p>
     * 
     * @return The <a>ResourceLimits</a> object that specifies the maximum number of training jobs and parallel training
     *         jobs allowed for this tuning job.
     */

    public ResourceLimits getResourceLimits() {
        return this.resourceLimits;
    }

    /**
     * <p>
     * The <a>ResourceLimits</a> object that specifies the maximum number of training jobs and parallel training jobs
     * allowed for this tuning job.
     * </p>
     * 
     * @param resourceLimits
     *        The <a>ResourceLimits</a> object that specifies the maximum number of training jobs and parallel training
     *        jobs allowed for this tuning job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HyperParameterTuningJobSummary withResourceLimits(ResourceLimits resourceLimits) {
        setResourceLimits(resourceLimits);
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
        if (getHyperParameterTuningJobStatus() != null)
            sb.append("HyperParameterTuningJobStatus: ").append(getHyperParameterTuningJobStatus()).append(",");
        if (getStrategy() != null)
            sb.append("Strategy: ").append(getStrategy()).append(",");
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
        if (getResourceLimits() != null)
            sb.append("ResourceLimits: ").append(getResourceLimits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HyperParameterTuningJobSummary == false)
            return false;
        HyperParameterTuningJobSummary other = (HyperParameterTuningJobSummary) obj;
        if (other.getHyperParameterTuningJobName() == null ^ this.getHyperParameterTuningJobName() == null)
            return false;
        if (other.getHyperParameterTuningJobName() != null && other.getHyperParameterTuningJobName().equals(this.getHyperParameterTuningJobName()) == false)
            return false;
        if (other.getHyperParameterTuningJobArn() == null ^ this.getHyperParameterTuningJobArn() == null)
            return false;
        if (other.getHyperParameterTuningJobArn() != null && other.getHyperParameterTuningJobArn().equals(this.getHyperParameterTuningJobArn()) == false)
            return false;
        if (other.getHyperParameterTuningJobStatus() == null ^ this.getHyperParameterTuningJobStatus() == null)
            return false;
        if (other.getHyperParameterTuningJobStatus() != null
                && other.getHyperParameterTuningJobStatus().equals(this.getHyperParameterTuningJobStatus()) == false)
            return false;
        if (other.getStrategy() == null ^ this.getStrategy() == null)
            return false;
        if (other.getStrategy() != null && other.getStrategy().equals(this.getStrategy()) == false)
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
        if (other.getResourceLimits() == null ^ this.getResourceLimits() == null)
            return false;
        if (other.getResourceLimits() != null && other.getResourceLimits().equals(this.getResourceLimits()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHyperParameterTuningJobName() == null) ? 0 : getHyperParameterTuningJobName().hashCode());
        hashCode = prime * hashCode + ((getHyperParameterTuningJobArn() == null) ? 0 : getHyperParameterTuningJobArn().hashCode());
        hashCode = prime * hashCode + ((getHyperParameterTuningJobStatus() == null) ? 0 : getHyperParameterTuningJobStatus().hashCode());
        hashCode = prime * hashCode + ((getStrategy() == null) ? 0 : getStrategy().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getHyperParameterTuningEndTime() == null) ? 0 : getHyperParameterTuningEndTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getTrainingJobStatusCounters() == null) ? 0 : getTrainingJobStatusCounters().hashCode());
        hashCode = prime * hashCode + ((getObjectiveStatusCounters() == null) ? 0 : getObjectiveStatusCounters().hashCode());
        hashCode = prime * hashCode + ((getResourceLimits() == null) ? 0 : getResourceLimits().hashCode());
        return hashCode;
    }

    @Override
    public HyperParameterTuningJobSummary clone() {
        try {
            return (HyperParameterTuningJobSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.HyperParameterTuningJobSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
