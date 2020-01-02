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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An AutoPilot job will return recommendations, or candidates. Each candidate has futher details about the steps
 * involed, and the status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AutoMLCandidate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoMLCandidate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The candidate name.
     * </p>
     */
    private String candidateName;

    private FinalAutoMLJobObjectiveMetric finalAutoMLJobObjectiveMetric;
    /**
     * <p>
     * The objective status.
     * </p>
     */
    private String objectiveStatus;
    /**
     * <p>
     * The candidate's steps.
     * </p>
     */
    private java.util.List<AutoMLCandidateStep> candidateSteps;
    /**
     * <p>
     * The candidate's status.
     * </p>
     */
    private String candidateStatus;
    /**
     * <p>
     * The inference containers.
     * </p>
     */
    private java.util.List<AutoMLContainerDefinition> inferenceContainers;
    /**
     * <p>
     * The creation time.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The end time.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The last modified time.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The failure reason.
     * </p>
     */
    private String failureReason;

    /**
     * <p>
     * The candidate name.
     * </p>
     * 
     * @param candidateName
     *        The candidate name.
     */

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    /**
     * <p>
     * The candidate name.
     * </p>
     * 
     * @return The candidate name.
     */

    public String getCandidateName() {
        return this.candidateName;
    }

    /**
     * <p>
     * The candidate name.
     * </p>
     * 
     * @param candidateName
     *        The candidate name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLCandidate withCandidateName(String candidateName) {
        setCandidateName(candidateName);
        return this;
    }

    /**
     * @param finalAutoMLJobObjectiveMetric
     */

    public void setFinalAutoMLJobObjectiveMetric(FinalAutoMLJobObjectiveMetric finalAutoMLJobObjectiveMetric) {
        this.finalAutoMLJobObjectiveMetric = finalAutoMLJobObjectiveMetric;
    }

    /**
     * @return
     */

    public FinalAutoMLJobObjectiveMetric getFinalAutoMLJobObjectiveMetric() {
        return this.finalAutoMLJobObjectiveMetric;
    }

    /**
     * @param finalAutoMLJobObjectiveMetric
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLCandidate withFinalAutoMLJobObjectiveMetric(FinalAutoMLJobObjectiveMetric finalAutoMLJobObjectiveMetric) {
        setFinalAutoMLJobObjectiveMetric(finalAutoMLJobObjectiveMetric);
        return this;
    }

    /**
     * <p>
     * The objective status.
     * </p>
     * 
     * @param objectiveStatus
     *        The objective status.
     * @see ObjectiveStatus
     */

    public void setObjectiveStatus(String objectiveStatus) {
        this.objectiveStatus = objectiveStatus;
    }

    /**
     * <p>
     * The objective status.
     * </p>
     * 
     * @return The objective status.
     * @see ObjectiveStatus
     */

    public String getObjectiveStatus() {
        return this.objectiveStatus;
    }

    /**
     * <p>
     * The objective status.
     * </p>
     * 
     * @param objectiveStatus
     *        The objective status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ObjectiveStatus
     */

    public AutoMLCandidate withObjectiveStatus(String objectiveStatus) {
        setObjectiveStatus(objectiveStatus);
        return this;
    }

    /**
     * <p>
     * The objective status.
     * </p>
     * 
     * @param objectiveStatus
     *        The objective status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ObjectiveStatus
     */

    public AutoMLCandidate withObjectiveStatus(ObjectiveStatus objectiveStatus) {
        this.objectiveStatus = objectiveStatus.toString();
        return this;
    }

    /**
     * <p>
     * The candidate's steps.
     * </p>
     * 
     * @return The candidate's steps.
     */

    public java.util.List<AutoMLCandidateStep> getCandidateSteps() {
        return candidateSteps;
    }

    /**
     * <p>
     * The candidate's steps.
     * </p>
     * 
     * @param candidateSteps
     *        The candidate's steps.
     */

    public void setCandidateSteps(java.util.Collection<AutoMLCandidateStep> candidateSteps) {
        if (candidateSteps == null) {
            this.candidateSteps = null;
            return;
        }

        this.candidateSteps = new java.util.ArrayList<AutoMLCandidateStep>(candidateSteps);
    }

    /**
     * <p>
     * The candidate's steps.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCandidateSteps(java.util.Collection)} or {@link #withCandidateSteps(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param candidateSteps
     *        The candidate's steps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLCandidate withCandidateSteps(AutoMLCandidateStep... candidateSteps) {
        if (this.candidateSteps == null) {
            setCandidateSteps(new java.util.ArrayList<AutoMLCandidateStep>(candidateSteps.length));
        }
        for (AutoMLCandidateStep ele : candidateSteps) {
            this.candidateSteps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The candidate's steps.
     * </p>
     * 
     * @param candidateSteps
     *        The candidate's steps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLCandidate withCandidateSteps(java.util.Collection<AutoMLCandidateStep> candidateSteps) {
        setCandidateSteps(candidateSteps);
        return this;
    }

    /**
     * <p>
     * The candidate's status.
     * </p>
     * 
     * @param candidateStatus
     *        The candidate's status.
     * @see CandidateStatus
     */

    public void setCandidateStatus(String candidateStatus) {
        this.candidateStatus = candidateStatus;
    }

    /**
     * <p>
     * The candidate's status.
     * </p>
     * 
     * @return The candidate's status.
     * @see CandidateStatus
     */

    public String getCandidateStatus() {
        return this.candidateStatus;
    }

    /**
     * <p>
     * The candidate's status.
     * </p>
     * 
     * @param candidateStatus
     *        The candidate's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CandidateStatus
     */

    public AutoMLCandidate withCandidateStatus(String candidateStatus) {
        setCandidateStatus(candidateStatus);
        return this;
    }

    /**
     * <p>
     * The candidate's status.
     * </p>
     * 
     * @param candidateStatus
     *        The candidate's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CandidateStatus
     */

    public AutoMLCandidate withCandidateStatus(CandidateStatus candidateStatus) {
        this.candidateStatus = candidateStatus.toString();
        return this;
    }

    /**
     * <p>
     * The inference containers.
     * </p>
     * 
     * @return The inference containers.
     */

    public java.util.List<AutoMLContainerDefinition> getInferenceContainers() {
        return inferenceContainers;
    }

    /**
     * <p>
     * The inference containers.
     * </p>
     * 
     * @param inferenceContainers
     *        The inference containers.
     */

    public void setInferenceContainers(java.util.Collection<AutoMLContainerDefinition> inferenceContainers) {
        if (inferenceContainers == null) {
            this.inferenceContainers = null;
            return;
        }

        this.inferenceContainers = new java.util.ArrayList<AutoMLContainerDefinition>(inferenceContainers);
    }

    /**
     * <p>
     * The inference containers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInferenceContainers(java.util.Collection)} or {@link #withInferenceContainers(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param inferenceContainers
     *        The inference containers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLCandidate withInferenceContainers(AutoMLContainerDefinition... inferenceContainers) {
        if (this.inferenceContainers == null) {
            setInferenceContainers(new java.util.ArrayList<AutoMLContainerDefinition>(inferenceContainers.length));
        }
        for (AutoMLContainerDefinition ele : inferenceContainers) {
            this.inferenceContainers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The inference containers.
     * </p>
     * 
     * @param inferenceContainers
     *        The inference containers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLCandidate withInferenceContainers(java.util.Collection<AutoMLContainerDefinition> inferenceContainers) {
        setInferenceContainers(inferenceContainers);
        return this;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @param creationTime
     *        The creation time.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @return The creation time.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @param creationTime
     *        The creation time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLCandidate withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The end time.
     * </p>
     * 
     * @param endTime
     *        The end time.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time.
     * </p>
     * 
     * @return The end time.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end time.
     * </p>
     * 
     * @param endTime
     *        The end time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLCandidate withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The last modified time.
     * </p>
     * 
     * @param lastModifiedTime
     *        The last modified time.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The last modified time.
     * </p>
     * 
     * @return The last modified time.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The last modified time.
     * </p>
     * 
     * @param lastModifiedTime
     *        The last modified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLCandidate withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The failure reason.
     * </p>
     * 
     * @param failureReason
     *        The failure reason.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The failure reason.
     * </p>
     * 
     * @return The failure reason.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The failure reason.
     * </p>
     * 
     * @param failureReason
     *        The failure reason.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLCandidate withFailureReason(String failureReason) {
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
        if (getCandidateName() != null)
            sb.append("CandidateName: ").append(getCandidateName()).append(",");
        if (getFinalAutoMLJobObjectiveMetric() != null)
            sb.append("FinalAutoMLJobObjectiveMetric: ").append(getFinalAutoMLJobObjectiveMetric()).append(",");
        if (getObjectiveStatus() != null)
            sb.append("ObjectiveStatus: ").append(getObjectiveStatus()).append(",");
        if (getCandidateSteps() != null)
            sb.append("CandidateSteps: ").append(getCandidateSteps()).append(",");
        if (getCandidateStatus() != null)
            sb.append("CandidateStatus: ").append(getCandidateStatus()).append(",");
        if (getInferenceContainers() != null)
            sb.append("InferenceContainers: ").append(getInferenceContainers()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
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

        if (obj instanceof AutoMLCandidate == false)
            return false;
        AutoMLCandidate other = (AutoMLCandidate) obj;
        if (other.getCandidateName() == null ^ this.getCandidateName() == null)
            return false;
        if (other.getCandidateName() != null && other.getCandidateName().equals(this.getCandidateName()) == false)
            return false;
        if (other.getFinalAutoMLJobObjectiveMetric() == null ^ this.getFinalAutoMLJobObjectiveMetric() == null)
            return false;
        if (other.getFinalAutoMLJobObjectiveMetric() != null
                && other.getFinalAutoMLJobObjectiveMetric().equals(this.getFinalAutoMLJobObjectiveMetric()) == false)
            return false;
        if (other.getObjectiveStatus() == null ^ this.getObjectiveStatus() == null)
            return false;
        if (other.getObjectiveStatus() != null && other.getObjectiveStatus().equals(this.getObjectiveStatus()) == false)
            return false;
        if (other.getCandidateSteps() == null ^ this.getCandidateSteps() == null)
            return false;
        if (other.getCandidateSteps() != null && other.getCandidateSteps().equals(this.getCandidateSteps()) == false)
            return false;
        if (other.getCandidateStatus() == null ^ this.getCandidateStatus() == null)
            return false;
        if (other.getCandidateStatus() != null && other.getCandidateStatus().equals(this.getCandidateStatus()) == false)
            return false;
        if (other.getInferenceContainers() == null ^ this.getInferenceContainers() == null)
            return false;
        if (other.getInferenceContainers() != null && other.getInferenceContainers().equals(this.getInferenceContainers()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
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

        hashCode = prime * hashCode + ((getCandidateName() == null) ? 0 : getCandidateName().hashCode());
        hashCode = prime * hashCode + ((getFinalAutoMLJobObjectiveMetric() == null) ? 0 : getFinalAutoMLJobObjectiveMetric().hashCode());
        hashCode = prime * hashCode + ((getObjectiveStatus() == null) ? 0 : getObjectiveStatus().hashCode());
        hashCode = prime * hashCode + ((getCandidateSteps() == null) ? 0 : getCandidateSteps().hashCode());
        hashCode = prime * hashCode + ((getCandidateStatus() == null) ? 0 : getCandidateStatus().hashCode());
        hashCode = prime * hashCode + ((getInferenceContainers() == null) ? 0 : getInferenceContainers().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public AutoMLCandidate clone() {
        try {
            return (AutoMLCandidate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AutoMLCandidateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
