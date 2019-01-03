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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information about a pipeline execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/PipelineExecutionSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipelineExecutionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the pipeline execution.
     * </p>
     */
    private String pipelineExecutionId;
    /**
     * <p>
     * The status of the pipeline execution.
     * </p>
     * <ul>
     * <li>
     * <p>
     * InProgress: The pipeline execution is currently running.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: The pipeline execution was completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * Superseded: While this pipeline execution was waiting for the next stage to be completed, a newer pipeline
     * execution advanced and continued through the pipeline instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The pipeline execution was not completed successfully.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The date and time when the pipeline execution began, in timestamp format.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The date and time of the last change to the pipeline execution, in timestamp format.
     * </p>
     */
    private java.util.Date lastUpdateTime;
    /**
     * <p>
     * A list of the source artifact revisions that initiated a pipeline execution.
     * </p>
     */
    private java.util.List<SourceRevision> sourceRevisions;

    /**
     * <p>
     * The ID of the pipeline execution.
     * </p>
     * 
     * @param pipelineExecutionId
     *        The ID of the pipeline execution.
     */

    public void setPipelineExecutionId(String pipelineExecutionId) {
        this.pipelineExecutionId = pipelineExecutionId;
    }

    /**
     * <p>
     * The ID of the pipeline execution.
     * </p>
     * 
     * @return The ID of the pipeline execution.
     */

    public String getPipelineExecutionId() {
        return this.pipelineExecutionId;
    }

    /**
     * <p>
     * The ID of the pipeline execution.
     * </p>
     * 
     * @param pipelineExecutionId
     *        The ID of the pipeline execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineExecutionSummary withPipelineExecutionId(String pipelineExecutionId) {
        setPipelineExecutionId(pipelineExecutionId);
        return this;
    }

    /**
     * <p>
     * The status of the pipeline execution.
     * </p>
     * <ul>
     * <li>
     * <p>
     * InProgress: The pipeline execution is currently running.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: The pipeline execution was completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * Superseded: While this pipeline execution was waiting for the next stage to be completed, a newer pipeline
     * execution advanced and continued through the pipeline instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The pipeline execution was not completed successfully.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the pipeline execution.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        InProgress: The pipeline execution is currently running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Succeeded: The pipeline execution was completed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Superseded: While this pipeline execution was waiting for the next stage to be completed, a newer pipeline
     *        execution advanced and continued through the pipeline instead.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed: The pipeline execution was not completed successfully.
     *        </p>
     *        </li>
     * @see PipelineExecutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the pipeline execution.
     * </p>
     * <ul>
     * <li>
     * <p>
     * InProgress: The pipeline execution is currently running.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: The pipeline execution was completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * Superseded: While this pipeline execution was waiting for the next stage to be completed, a newer pipeline
     * execution advanced and continued through the pipeline instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The pipeline execution was not completed successfully.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the pipeline execution.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         InProgress: The pipeline execution is currently running.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Succeeded: The pipeline execution was completed successfully.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Superseded: While this pipeline execution was waiting for the next stage to be completed, a newer
     *         pipeline execution advanced and continued through the pipeline instead.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Failed: The pipeline execution was not completed successfully.
     *         </p>
     *         </li>
     * @see PipelineExecutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the pipeline execution.
     * </p>
     * <ul>
     * <li>
     * <p>
     * InProgress: The pipeline execution is currently running.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: The pipeline execution was completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * Superseded: While this pipeline execution was waiting for the next stage to be completed, a newer pipeline
     * execution advanced and continued through the pipeline instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The pipeline execution was not completed successfully.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the pipeline execution.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        InProgress: The pipeline execution is currently running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Succeeded: The pipeline execution was completed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Superseded: While this pipeline execution was waiting for the next stage to be completed, a newer pipeline
     *        execution advanced and continued through the pipeline instead.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed: The pipeline execution was not completed successfully.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PipelineExecutionStatus
     */

    public PipelineExecutionSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the pipeline execution.
     * </p>
     * <ul>
     * <li>
     * <p>
     * InProgress: The pipeline execution is currently running.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: The pipeline execution was completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * Superseded: While this pipeline execution was waiting for the next stage to be completed, a newer pipeline
     * execution advanced and continued through the pipeline instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The pipeline execution was not completed successfully.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the pipeline execution.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        InProgress: The pipeline execution is currently running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Succeeded: The pipeline execution was completed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Superseded: While this pipeline execution was waiting for the next stage to be completed, a newer pipeline
     *        execution advanced and continued through the pipeline instead.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed: The pipeline execution was not completed successfully.
     *        </p>
     *        </li>
     * @see PipelineExecutionStatus
     */

    public void setStatus(PipelineExecutionStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the pipeline execution.
     * </p>
     * <ul>
     * <li>
     * <p>
     * InProgress: The pipeline execution is currently running.
     * </p>
     * </li>
     * <li>
     * <p>
     * Succeeded: The pipeline execution was completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * Superseded: While this pipeline execution was waiting for the next stage to be completed, a newer pipeline
     * execution advanced and continued through the pipeline instead.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed: The pipeline execution was not completed successfully.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the pipeline execution.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        InProgress: The pipeline execution is currently running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Succeeded: The pipeline execution was completed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Superseded: While this pipeline execution was waiting for the next stage to be completed, a newer pipeline
     *        execution advanced and continued through the pipeline instead.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed: The pipeline execution was not completed successfully.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PipelineExecutionStatus
     */

    public PipelineExecutionSummary withStatus(PipelineExecutionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date and time when the pipeline execution began, in timestamp format.
     * </p>
     * 
     * @param startTime
     *        The date and time when the pipeline execution began, in timestamp format.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The date and time when the pipeline execution began, in timestamp format.
     * </p>
     * 
     * @return The date and time when the pipeline execution began, in timestamp format.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The date and time when the pipeline execution began, in timestamp format.
     * </p>
     * 
     * @param startTime
     *        The date and time when the pipeline execution began, in timestamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineExecutionSummary withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The date and time of the last change to the pipeline execution, in timestamp format.
     * </p>
     * 
     * @param lastUpdateTime
     *        The date and time of the last change to the pipeline execution, in timestamp format.
     */

    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * The date and time of the last change to the pipeline execution, in timestamp format.
     * </p>
     * 
     * @return The date and time of the last change to the pipeline execution, in timestamp format.
     */

    public java.util.Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * <p>
     * The date and time of the last change to the pipeline execution, in timestamp format.
     * </p>
     * 
     * @param lastUpdateTime
     *        The date and time of the last change to the pipeline execution, in timestamp format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineExecutionSummary withLastUpdateTime(java.util.Date lastUpdateTime) {
        setLastUpdateTime(lastUpdateTime);
        return this;
    }

    /**
     * <p>
     * A list of the source artifact revisions that initiated a pipeline execution.
     * </p>
     * 
     * @return A list of the source artifact revisions that initiated a pipeline execution.
     */

    public java.util.List<SourceRevision> getSourceRevisions() {
        return sourceRevisions;
    }

    /**
     * <p>
     * A list of the source artifact revisions that initiated a pipeline execution.
     * </p>
     * 
     * @param sourceRevisions
     *        A list of the source artifact revisions that initiated a pipeline execution.
     */

    public void setSourceRevisions(java.util.Collection<SourceRevision> sourceRevisions) {
        if (sourceRevisions == null) {
            this.sourceRevisions = null;
            return;
        }

        this.sourceRevisions = new java.util.ArrayList<SourceRevision>(sourceRevisions);
    }

    /**
     * <p>
     * A list of the source artifact revisions that initiated a pipeline execution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceRevisions(java.util.Collection)} or {@link #withSourceRevisions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param sourceRevisions
     *        A list of the source artifact revisions that initiated a pipeline execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineExecutionSummary withSourceRevisions(SourceRevision... sourceRevisions) {
        if (this.sourceRevisions == null) {
            setSourceRevisions(new java.util.ArrayList<SourceRevision>(sourceRevisions.length));
        }
        for (SourceRevision ele : sourceRevisions) {
            this.sourceRevisions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the source artifact revisions that initiated a pipeline execution.
     * </p>
     * 
     * @param sourceRevisions
     *        A list of the source artifact revisions that initiated a pipeline execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineExecutionSummary withSourceRevisions(java.util.Collection<SourceRevision> sourceRevisions) {
        setSourceRevisions(sourceRevisions);
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
        if (getPipelineExecutionId() != null)
            sb.append("PipelineExecutionId: ").append(getPipelineExecutionId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getLastUpdateTime() != null)
            sb.append("LastUpdateTime: ").append(getLastUpdateTime()).append(",");
        if (getSourceRevisions() != null)
            sb.append("SourceRevisions: ").append(getSourceRevisions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PipelineExecutionSummary == false)
            return false;
        PipelineExecutionSummary other = (PipelineExecutionSummary) obj;
        if (other.getPipelineExecutionId() == null ^ this.getPipelineExecutionId() == null)
            return false;
        if (other.getPipelineExecutionId() != null && other.getPipelineExecutionId().equals(this.getPipelineExecutionId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getLastUpdateTime() == null ^ this.getLastUpdateTime() == null)
            return false;
        if (other.getLastUpdateTime() != null && other.getLastUpdateTime().equals(this.getLastUpdateTime()) == false)
            return false;
        if (other.getSourceRevisions() == null ^ this.getSourceRevisions() == null)
            return false;
        if (other.getSourceRevisions() != null && other.getSourceRevisions().equals(this.getSourceRevisions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineExecutionId() == null) ? 0 : getPipelineExecutionId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getSourceRevisions() == null) ? 0 : getSourceRevisions().hashCode());
        return hashCode;
    }

    @Override
    public PipelineExecutionSummary clone() {
        try {
            return (PipelineExecutionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.PipelineExecutionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
