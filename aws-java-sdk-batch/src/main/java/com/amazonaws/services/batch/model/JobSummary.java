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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing summary details of a job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/JobSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the job.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The name of the job.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The Unix timestamp for when the job was created. For non-array jobs and parent array jobs, this is when the job
     * entered the <code>SUBMITTED</code> state (at the time <a>SubmitJob</a> was called). For array child jobs, this is
     * when the child job was spawned by its parent and entered the <code>PENDING</code> state.
     * </p>
     */
    private Long createdAt;
    /**
     * <p>
     * The current status for the job.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A short, human-readable string to provide additional details about the current status of the job.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * The Unix timestamp for when the job was started (when the job transitioned from the <code>STARTING</code> state
     * to the <code>RUNNING</code> state).
     * </p>
     */
    private Long startedAt;
    /**
     * <p>
     * The Unix timestamp for when the job was stopped (when the job transitioned from the <code>RUNNING</code> state to
     * a terminal state, such as <code>SUCCEEDED</code> or <code>FAILED</code>).
     * </p>
     */
    private Long stoppedAt;
    /**
     * <p>
     * An object representing the details of the container that is associated with the job.
     * </p>
     */
    private ContainerSummary container;
    /**
     * <p>
     * The array properties of the job, if it is an array job.
     * </p>
     */
    private ArrayPropertiesSummary arrayProperties;
    /**
     * <p>
     * The node properties for a single node in a job summary list.
     * </p>
     */
    private NodePropertiesSummary nodeProperties;

    /**
     * <p>
     * The ID of the job.
     * </p>
     * 
     * @param jobId
     *        The ID of the job.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The ID of the job.
     * </p>
     * 
     * @return The ID of the job.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The ID of the job.
     * </p>
     * 
     * @param jobId
     *        The ID of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSummary withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The name of the job.
     * </p>
     * 
     * @param jobName
     *        The name of the job.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of the job.
     * </p>
     * 
     * @return The name of the job.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name of the job.
     * </p>
     * 
     * @param jobName
     *        The name of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSummary withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the job was created. For non-array jobs and parent array jobs, this is when the job
     * entered the <code>SUBMITTED</code> state (at the time <a>SubmitJob</a> was called). For array child jobs, this is
     * when the child job was spawned by its parent and entered the <code>PENDING</code> state.
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp for when the job was created. For non-array jobs and parent array jobs, this is when
     *        the job entered the <code>SUBMITTED</code> state (at the time <a>SubmitJob</a> was called). For array
     *        child jobs, this is when the child job was spawned by its parent and entered the <code>PENDING</code>
     *        state.
     */

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the job was created. For non-array jobs and parent array jobs, this is when the job
     * entered the <code>SUBMITTED</code> state (at the time <a>SubmitJob</a> was called). For array child jobs, this is
     * when the child job was spawned by its parent and entered the <code>PENDING</code> state.
     * </p>
     * 
     * @return The Unix timestamp for when the job was created. For non-array jobs and parent array jobs, this is when
     *         the job entered the <code>SUBMITTED</code> state (at the time <a>SubmitJob</a> was called). For array
     *         child jobs, this is when the child job was spawned by its parent and entered the <code>PENDING</code>
     *         state.
     */

    public Long getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the job was created. For non-array jobs and parent array jobs, this is when the job
     * entered the <code>SUBMITTED</code> state (at the time <a>SubmitJob</a> was called). For array child jobs, this is
     * when the child job was spawned by its parent and entered the <code>PENDING</code> state.
     * </p>
     * 
     * @param createdAt
     *        The Unix timestamp for when the job was created. For non-array jobs and parent array jobs, this is when
     *        the job entered the <code>SUBMITTED</code> state (at the time <a>SubmitJob</a> was called). For array
     *        child jobs, this is when the child job was spawned by its parent and entered the <code>PENDING</code>
     *        state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSummary withCreatedAt(Long createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The current status for the job.
     * </p>
     * 
     * @param status
     *        The current status for the job.
     * @see JobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status for the job.
     * </p>
     * 
     * @return The current status for the job.
     * @see JobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status for the job.
     * </p>
     * 
     * @param status
     *        The current status for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public JobSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status for the job.
     * </p>
     * 
     * @param status
     *        The current status for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public JobSummary withStatus(JobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A short, human-readable string to provide additional details about the current status of the job.
     * </p>
     * 
     * @param statusReason
     *        A short, human-readable string to provide additional details about the current status of the job.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * A short, human-readable string to provide additional details about the current status of the job.
     * </p>
     * 
     * @return A short, human-readable string to provide additional details about the current status of the job.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * A short, human-readable string to provide additional details about the current status of the job.
     * </p>
     * 
     * @param statusReason
     *        A short, human-readable string to provide additional details about the current status of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSummary withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the job was started (when the job transitioned from the <code>STARTING</code> state
     * to the <code>RUNNING</code> state).
     * </p>
     * 
     * @param startedAt
     *        The Unix timestamp for when the job was started (when the job transitioned from the <code>STARTING</code>
     *        state to the <code>RUNNING</code> state).
     */

    public void setStartedAt(Long startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the job was started (when the job transitioned from the <code>STARTING</code> state
     * to the <code>RUNNING</code> state).
     * </p>
     * 
     * @return The Unix timestamp for when the job was started (when the job transitioned from the <code>STARTING</code>
     *         state to the <code>RUNNING</code> state).
     */

    public Long getStartedAt() {
        return this.startedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the job was started (when the job transitioned from the <code>STARTING</code> state
     * to the <code>RUNNING</code> state).
     * </p>
     * 
     * @param startedAt
     *        The Unix timestamp for when the job was started (when the job transitioned from the <code>STARTING</code>
     *        state to the <code>RUNNING</code> state).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSummary withStartedAt(Long startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * The Unix timestamp for when the job was stopped (when the job transitioned from the <code>RUNNING</code> state to
     * a terminal state, such as <code>SUCCEEDED</code> or <code>FAILED</code>).
     * </p>
     * 
     * @param stoppedAt
     *        The Unix timestamp for when the job was stopped (when the job transitioned from the <code>RUNNING</code>
     *        state to a terminal state, such as <code>SUCCEEDED</code> or <code>FAILED</code>).
     */

    public void setStoppedAt(Long stoppedAt) {
        this.stoppedAt = stoppedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the job was stopped (when the job transitioned from the <code>RUNNING</code> state to
     * a terminal state, such as <code>SUCCEEDED</code> or <code>FAILED</code>).
     * </p>
     * 
     * @return The Unix timestamp for when the job was stopped (when the job transitioned from the <code>RUNNING</code>
     *         state to a terminal state, such as <code>SUCCEEDED</code> or <code>FAILED</code>).
     */

    public Long getStoppedAt() {
        return this.stoppedAt;
    }

    /**
     * <p>
     * The Unix timestamp for when the job was stopped (when the job transitioned from the <code>RUNNING</code> state to
     * a terminal state, such as <code>SUCCEEDED</code> or <code>FAILED</code>).
     * </p>
     * 
     * @param stoppedAt
     *        The Unix timestamp for when the job was stopped (when the job transitioned from the <code>RUNNING</code>
     *        state to a terminal state, such as <code>SUCCEEDED</code> or <code>FAILED</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSummary withStoppedAt(Long stoppedAt) {
        setStoppedAt(stoppedAt);
        return this;
    }

    /**
     * <p>
     * An object representing the details of the container that is associated with the job.
     * </p>
     * 
     * @param container
     *        An object representing the details of the container that is associated with the job.
     */

    public void setContainer(ContainerSummary container) {
        this.container = container;
    }

    /**
     * <p>
     * An object representing the details of the container that is associated with the job.
     * </p>
     * 
     * @return An object representing the details of the container that is associated with the job.
     */

    public ContainerSummary getContainer() {
        return this.container;
    }

    /**
     * <p>
     * An object representing the details of the container that is associated with the job.
     * </p>
     * 
     * @param container
     *        An object representing the details of the container that is associated with the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSummary withContainer(ContainerSummary container) {
        setContainer(container);
        return this;
    }

    /**
     * <p>
     * The array properties of the job, if it is an array job.
     * </p>
     * 
     * @param arrayProperties
     *        The array properties of the job, if it is an array job.
     */

    public void setArrayProperties(ArrayPropertiesSummary arrayProperties) {
        this.arrayProperties = arrayProperties;
    }

    /**
     * <p>
     * The array properties of the job, if it is an array job.
     * </p>
     * 
     * @return The array properties of the job, if it is an array job.
     */

    public ArrayPropertiesSummary getArrayProperties() {
        return this.arrayProperties;
    }

    /**
     * <p>
     * The array properties of the job, if it is an array job.
     * </p>
     * 
     * @param arrayProperties
     *        The array properties of the job, if it is an array job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSummary withArrayProperties(ArrayPropertiesSummary arrayProperties) {
        setArrayProperties(arrayProperties);
        return this;
    }

    /**
     * <p>
     * The node properties for a single node in a job summary list.
     * </p>
     * 
     * @param nodeProperties
     *        The node properties for a single node in a job summary list.
     */

    public void setNodeProperties(NodePropertiesSummary nodeProperties) {
        this.nodeProperties = nodeProperties;
    }

    /**
     * <p>
     * The node properties for a single node in a job summary list.
     * </p>
     * 
     * @return The node properties for a single node in a job summary list.
     */

    public NodePropertiesSummary getNodeProperties() {
        return this.nodeProperties;
    }

    /**
     * <p>
     * The node properties for a single node in a job summary list.
     * </p>
     * 
     * @param nodeProperties
     *        The node properties for a single node in a job summary list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSummary withNodeProperties(NodePropertiesSummary nodeProperties) {
        setNodeProperties(nodeProperties);
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
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getStartedAt() != null)
            sb.append("StartedAt: ").append(getStartedAt()).append(",");
        if (getStoppedAt() != null)
            sb.append("StoppedAt: ").append(getStoppedAt()).append(",");
        if (getContainer() != null)
            sb.append("Container: ").append(getContainer()).append(",");
        if (getArrayProperties() != null)
            sb.append("ArrayProperties: ").append(getArrayProperties()).append(",");
        if (getNodeProperties() != null)
            sb.append("NodeProperties: ").append(getNodeProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobSummary == false)
            return false;
        JobSummary other = (JobSummary) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getStartedAt() == null ^ this.getStartedAt() == null)
            return false;
        if (other.getStartedAt() != null && other.getStartedAt().equals(this.getStartedAt()) == false)
            return false;
        if (other.getStoppedAt() == null ^ this.getStoppedAt() == null)
            return false;
        if (other.getStoppedAt() != null && other.getStoppedAt().equals(this.getStoppedAt()) == false)
            return false;
        if (other.getContainer() == null ^ this.getContainer() == null)
            return false;
        if (other.getContainer() != null && other.getContainer().equals(this.getContainer()) == false)
            return false;
        if (other.getArrayProperties() == null ^ this.getArrayProperties() == null)
            return false;
        if (other.getArrayProperties() != null && other.getArrayProperties().equals(this.getArrayProperties()) == false)
            return false;
        if (other.getNodeProperties() == null ^ this.getNodeProperties() == null)
            return false;
        if (other.getNodeProperties() != null && other.getNodeProperties().equals(this.getNodeProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getStoppedAt() == null) ? 0 : getStoppedAt().hashCode());
        hashCode = prime * hashCode + ((getContainer() == null) ? 0 : getContainer().hashCode());
        hashCode = prime * hashCode + ((getArrayProperties() == null) ? 0 : getArrayProperties().hashCode());
        hashCode = prime * hashCode + ((getNodeProperties() == null) ? 0 : getNodeProperties().hashCode());
        return hashCode;
    }

    @Override
    public JobSummary clone() {
        try {
            return (JobSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.JobSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
