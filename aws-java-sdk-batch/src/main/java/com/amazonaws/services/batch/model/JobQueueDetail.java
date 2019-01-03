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
 * An object representing the details of an AWS Batch job queue.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/JobQueueDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobQueueDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the job queue.
     * </p>
     */
    private String jobQueueName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the job queue.
     * </p>
     */
    private String jobQueueArn;
    /**
     * <p>
     * Describes the ability of the queue to accept new jobs.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The status of the job queue (for example, <code>CREATING</code> or <code>VALID</code>).
     * </p>
     */
    private String status;
    /**
     * <p>
     * A short, human-readable string to provide additional details about the current status of the job queue.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * The priority of the job queue.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * The compute environments that are attached to the job queue and the order in which job placement is preferred.
     * Compute environments are selected for job placement in ascending order.
     * </p>
     */
    private java.util.List<ComputeEnvironmentOrder> computeEnvironmentOrder;

    /**
     * <p>
     * The name of the job queue.
     * </p>
     * 
     * @param jobQueueName
     *        The name of the job queue.
     */

    public void setJobQueueName(String jobQueueName) {
        this.jobQueueName = jobQueueName;
    }

    /**
     * <p>
     * The name of the job queue.
     * </p>
     * 
     * @return The name of the job queue.
     */

    public String getJobQueueName() {
        return this.jobQueueName;
    }

    /**
     * <p>
     * The name of the job queue.
     * </p>
     * 
     * @param jobQueueName
     *        The name of the job queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobQueueDetail withJobQueueName(String jobQueueName) {
        setJobQueueName(jobQueueName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the job queue.
     * </p>
     * 
     * @param jobQueueArn
     *        The Amazon Resource Name (ARN) of the job queue.
     */

    public void setJobQueueArn(String jobQueueArn) {
        this.jobQueueArn = jobQueueArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the job queue.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the job queue.
     */

    public String getJobQueueArn() {
        return this.jobQueueArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the job queue.
     * </p>
     * 
     * @param jobQueueArn
     *        The Amazon Resource Name (ARN) of the job queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobQueueDetail withJobQueueArn(String jobQueueArn) {
        setJobQueueArn(jobQueueArn);
        return this;
    }

    /**
     * <p>
     * Describes the ability of the queue to accept new jobs.
     * </p>
     * 
     * @param state
     *        Describes the ability of the queue to accept new jobs.
     * @see JQState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Describes the ability of the queue to accept new jobs.
     * </p>
     * 
     * @return Describes the ability of the queue to accept new jobs.
     * @see JQState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * Describes the ability of the queue to accept new jobs.
     * </p>
     * 
     * @param state
     *        Describes the ability of the queue to accept new jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JQState
     */

    public JobQueueDetail withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Describes the ability of the queue to accept new jobs.
     * </p>
     * 
     * @param state
     *        Describes the ability of the queue to accept new jobs.
     * @see JQState
     */

    public void setState(JQState state) {
        withState(state);
    }

    /**
     * <p>
     * Describes the ability of the queue to accept new jobs.
     * </p>
     * 
     * @param state
     *        Describes the ability of the queue to accept new jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JQState
     */

    public JobQueueDetail withState(JQState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The status of the job queue (for example, <code>CREATING</code> or <code>VALID</code>).
     * </p>
     * 
     * @param status
     *        The status of the job queue (for example, <code>CREATING</code> or <code>VALID</code>).
     * @see JQStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the job queue (for example, <code>CREATING</code> or <code>VALID</code>).
     * </p>
     * 
     * @return The status of the job queue (for example, <code>CREATING</code> or <code>VALID</code>).
     * @see JQStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the job queue (for example, <code>CREATING</code> or <code>VALID</code>).
     * </p>
     * 
     * @param status
     *        The status of the job queue (for example, <code>CREATING</code> or <code>VALID</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JQStatus
     */

    public JobQueueDetail withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the job queue (for example, <code>CREATING</code> or <code>VALID</code>).
     * </p>
     * 
     * @param status
     *        The status of the job queue (for example, <code>CREATING</code> or <code>VALID</code>).
     * @see JQStatus
     */

    public void setStatus(JQStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the job queue (for example, <code>CREATING</code> or <code>VALID</code>).
     * </p>
     * 
     * @param status
     *        The status of the job queue (for example, <code>CREATING</code> or <code>VALID</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JQStatus
     */

    public JobQueueDetail withStatus(JQStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A short, human-readable string to provide additional details about the current status of the job queue.
     * </p>
     * 
     * @param statusReason
     *        A short, human-readable string to provide additional details about the current status of the job queue.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * A short, human-readable string to provide additional details about the current status of the job queue.
     * </p>
     * 
     * @return A short, human-readable string to provide additional details about the current status of the job queue.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * A short, human-readable string to provide additional details about the current status of the job queue.
     * </p>
     * 
     * @param statusReason
     *        A short, human-readable string to provide additional details about the current status of the job queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobQueueDetail withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * The priority of the job queue.
     * </p>
     * 
     * @param priority
     *        The priority of the job queue.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The priority of the job queue.
     * </p>
     * 
     * @return The priority of the job queue.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The priority of the job queue.
     * </p>
     * 
     * @param priority
     *        The priority of the job queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobQueueDetail withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * The compute environments that are attached to the job queue and the order in which job placement is preferred.
     * Compute environments are selected for job placement in ascending order.
     * </p>
     * 
     * @return The compute environments that are attached to the job queue and the order in which job placement is
     *         preferred. Compute environments are selected for job placement in ascending order.
     */

    public java.util.List<ComputeEnvironmentOrder> getComputeEnvironmentOrder() {
        return computeEnvironmentOrder;
    }

    /**
     * <p>
     * The compute environments that are attached to the job queue and the order in which job placement is preferred.
     * Compute environments are selected for job placement in ascending order.
     * </p>
     * 
     * @param computeEnvironmentOrder
     *        The compute environments that are attached to the job queue and the order in which job placement is
     *        preferred. Compute environments are selected for job placement in ascending order.
     */

    public void setComputeEnvironmentOrder(java.util.Collection<ComputeEnvironmentOrder> computeEnvironmentOrder) {
        if (computeEnvironmentOrder == null) {
            this.computeEnvironmentOrder = null;
            return;
        }

        this.computeEnvironmentOrder = new java.util.ArrayList<ComputeEnvironmentOrder>(computeEnvironmentOrder);
    }

    /**
     * <p>
     * The compute environments that are attached to the job queue and the order in which job placement is preferred.
     * Compute environments are selected for job placement in ascending order.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComputeEnvironmentOrder(java.util.Collection)} or
     * {@link #withComputeEnvironmentOrder(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param computeEnvironmentOrder
     *        The compute environments that are attached to the job queue and the order in which job placement is
     *        preferred. Compute environments are selected for job placement in ascending order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobQueueDetail withComputeEnvironmentOrder(ComputeEnvironmentOrder... computeEnvironmentOrder) {
        if (this.computeEnvironmentOrder == null) {
            setComputeEnvironmentOrder(new java.util.ArrayList<ComputeEnvironmentOrder>(computeEnvironmentOrder.length));
        }
        for (ComputeEnvironmentOrder ele : computeEnvironmentOrder) {
            this.computeEnvironmentOrder.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The compute environments that are attached to the job queue and the order in which job placement is preferred.
     * Compute environments are selected for job placement in ascending order.
     * </p>
     * 
     * @param computeEnvironmentOrder
     *        The compute environments that are attached to the job queue and the order in which job placement is
     *        preferred. Compute environments are selected for job placement in ascending order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobQueueDetail withComputeEnvironmentOrder(java.util.Collection<ComputeEnvironmentOrder> computeEnvironmentOrder) {
        setComputeEnvironmentOrder(computeEnvironmentOrder);
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
        if (getJobQueueName() != null)
            sb.append("JobQueueName: ").append(getJobQueueName()).append(",");
        if (getJobQueueArn() != null)
            sb.append("JobQueueArn: ").append(getJobQueueArn()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getComputeEnvironmentOrder() != null)
            sb.append("ComputeEnvironmentOrder: ").append(getComputeEnvironmentOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobQueueDetail == false)
            return false;
        JobQueueDetail other = (JobQueueDetail) obj;
        if (other.getJobQueueName() == null ^ this.getJobQueueName() == null)
            return false;
        if (other.getJobQueueName() != null && other.getJobQueueName().equals(this.getJobQueueName()) == false)
            return false;
        if (other.getJobQueueArn() == null ^ this.getJobQueueArn() == null)
            return false;
        if (other.getJobQueueArn() != null && other.getJobQueueArn().equals(this.getJobQueueArn()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getComputeEnvironmentOrder() == null ^ this.getComputeEnvironmentOrder() == null)
            return false;
        if (other.getComputeEnvironmentOrder() != null && other.getComputeEnvironmentOrder().equals(this.getComputeEnvironmentOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobQueueName() == null) ? 0 : getJobQueueName().hashCode());
        hashCode = prime * hashCode + ((getJobQueueArn() == null) ? 0 : getJobQueueArn().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getComputeEnvironmentOrder() == null) ? 0 : getComputeEnvironmentOrder().hashCode());
        return hashCode;
    }

    @Override
    public JobQueueDetail clone() {
        try {
            return (JobQueueDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.batch.model.transform.JobQueueDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
