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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/CreateJobQueue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateJobQueueRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the job queue.
     * </p>
     */
    private String jobQueueName;
    /**
     * <p>
     * The state of the job queue. If the job queue state is <code>ENABLED</code>, it is able to accept jobs.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The priority of the job queue. Job queues with a higher priority (or a higher integer value for the
     * <code>priority</code> parameter) are evaluated first when associated with the same compute environment. Priority
     * is determined in descending order, for example, a job queue with a priority value of <code>10</code> is given
     * scheduling preference over a job queue with a priority value of <code>1</code>.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * The set of compute environments mapped to a job queue and their order relative to each other. The job scheduler
     * uses this parameter to determine which compute environment should execute a given job. Compute environments must
     * be in the <code>VALID</code> state before you can associate them with a job queue. You can associate up to three
     * compute environments with a job queue.
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

    public CreateJobQueueRequest withJobQueueName(String jobQueueName) {
        setJobQueueName(jobQueueName);
        return this;
    }

    /**
     * <p>
     * The state of the job queue. If the job queue state is <code>ENABLED</code>, it is able to accept jobs.
     * </p>
     * 
     * @param state
     *        The state of the job queue. If the job queue state is <code>ENABLED</code>, it is able to accept jobs.
     * @see JQState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the job queue. If the job queue state is <code>ENABLED</code>, it is able to accept jobs.
     * </p>
     * 
     * @return The state of the job queue. If the job queue state is <code>ENABLED</code>, it is able to accept jobs.
     * @see JQState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the job queue. If the job queue state is <code>ENABLED</code>, it is able to accept jobs.
     * </p>
     * 
     * @param state
     *        The state of the job queue. If the job queue state is <code>ENABLED</code>, it is able to accept jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JQState
     */

    public CreateJobQueueRequest withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the job queue. If the job queue state is <code>ENABLED</code>, it is able to accept jobs.
     * </p>
     * 
     * @param state
     *        The state of the job queue. If the job queue state is <code>ENABLED</code>, it is able to accept jobs.
     * @see JQState
     */

    public void setState(JQState state) {
        withState(state);
    }

    /**
     * <p>
     * The state of the job queue. If the job queue state is <code>ENABLED</code>, it is able to accept jobs.
     * </p>
     * 
     * @param state
     *        The state of the job queue. If the job queue state is <code>ENABLED</code>, it is able to accept jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JQState
     */

    public CreateJobQueueRequest withState(JQState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The priority of the job queue. Job queues with a higher priority (or a higher integer value for the
     * <code>priority</code> parameter) are evaluated first when associated with the same compute environment. Priority
     * is determined in descending order, for example, a job queue with a priority value of <code>10</code> is given
     * scheduling preference over a job queue with a priority value of <code>1</code>.
     * </p>
     * 
     * @param priority
     *        The priority of the job queue. Job queues with a higher priority (or a higher integer value for the
     *        <code>priority</code> parameter) are evaluated first when associated with the same compute environment.
     *        Priority is determined in descending order, for example, a job queue with a priority value of
     *        <code>10</code> is given scheduling preference over a job queue with a priority value of <code>1</code>.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The priority of the job queue. Job queues with a higher priority (or a higher integer value for the
     * <code>priority</code> parameter) are evaluated first when associated with the same compute environment. Priority
     * is determined in descending order, for example, a job queue with a priority value of <code>10</code> is given
     * scheduling preference over a job queue with a priority value of <code>1</code>.
     * </p>
     * 
     * @return The priority of the job queue. Job queues with a higher priority (or a higher integer value for the
     *         <code>priority</code> parameter) are evaluated first when associated with the same compute environment.
     *         Priority is determined in descending order, for example, a job queue with a priority value of
     *         <code>10</code> is given scheduling preference over a job queue with a priority value of <code>1</code>.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The priority of the job queue. Job queues with a higher priority (or a higher integer value for the
     * <code>priority</code> parameter) are evaluated first when associated with the same compute environment. Priority
     * is determined in descending order, for example, a job queue with a priority value of <code>10</code> is given
     * scheduling preference over a job queue with a priority value of <code>1</code>.
     * </p>
     * 
     * @param priority
     *        The priority of the job queue. Job queues with a higher priority (or a higher integer value for the
     *        <code>priority</code> parameter) are evaluated first when associated with the same compute environment.
     *        Priority is determined in descending order, for example, a job queue with a priority value of
     *        <code>10</code> is given scheduling preference over a job queue with a priority value of <code>1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobQueueRequest withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * The set of compute environments mapped to a job queue and their order relative to each other. The job scheduler
     * uses this parameter to determine which compute environment should execute a given job. Compute environments must
     * be in the <code>VALID</code> state before you can associate them with a job queue. You can associate up to three
     * compute environments with a job queue.
     * </p>
     * 
     * @return The set of compute environments mapped to a job queue and their order relative to each other. The job
     *         scheduler uses this parameter to determine which compute environment should execute a given job. Compute
     *         environments must be in the <code>VALID</code> state before you can associate them with a job queue. You
     *         can associate up to three compute environments with a job queue.
     */

    public java.util.List<ComputeEnvironmentOrder> getComputeEnvironmentOrder() {
        return computeEnvironmentOrder;
    }

    /**
     * <p>
     * The set of compute environments mapped to a job queue and their order relative to each other. The job scheduler
     * uses this parameter to determine which compute environment should execute a given job. Compute environments must
     * be in the <code>VALID</code> state before you can associate them with a job queue. You can associate up to three
     * compute environments with a job queue.
     * </p>
     * 
     * @param computeEnvironmentOrder
     *        The set of compute environments mapped to a job queue and their order relative to each other. The job
     *        scheduler uses this parameter to determine which compute environment should execute a given job. Compute
     *        environments must be in the <code>VALID</code> state before you can associate them with a job queue. You
     *        can associate up to three compute environments with a job queue.
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
     * The set of compute environments mapped to a job queue and their order relative to each other. The job scheduler
     * uses this parameter to determine which compute environment should execute a given job. Compute environments must
     * be in the <code>VALID</code> state before you can associate them with a job queue. You can associate up to three
     * compute environments with a job queue.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComputeEnvironmentOrder(java.util.Collection)} or
     * {@link #withComputeEnvironmentOrder(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param computeEnvironmentOrder
     *        The set of compute environments mapped to a job queue and their order relative to each other. The job
     *        scheduler uses this parameter to determine which compute environment should execute a given job. Compute
     *        environments must be in the <code>VALID</code> state before you can associate them with a job queue. You
     *        can associate up to three compute environments with a job queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobQueueRequest withComputeEnvironmentOrder(ComputeEnvironmentOrder... computeEnvironmentOrder) {
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
     * The set of compute environments mapped to a job queue and their order relative to each other. The job scheduler
     * uses this parameter to determine which compute environment should execute a given job. Compute environments must
     * be in the <code>VALID</code> state before you can associate them with a job queue. You can associate up to three
     * compute environments with a job queue.
     * </p>
     * 
     * @param computeEnvironmentOrder
     *        The set of compute environments mapped to a job queue and their order relative to each other. The job
     *        scheduler uses this parameter to determine which compute environment should execute a given job. Compute
     *        environments must be in the <code>VALID</code> state before you can associate them with a job queue. You
     *        can associate up to three compute environments with a job queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobQueueRequest withComputeEnvironmentOrder(java.util.Collection<ComputeEnvironmentOrder> computeEnvironmentOrder) {
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
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
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

        if (obj instanceof CreateJobQueueRequest == false)
            return false;
        CreateJobQueueRequest other = (CreateJobQueueRequest) obj;
        if (other.getJobQueueName() == null ^ this.getJobQueueName() == null)
            return false;
        if (other.getJobQueueName() != null && other.getJobQueueName().equals(this.getJobQueueName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
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
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getComputeEnvironmentOrder() == null) ? 0 : getComputeEnvironmentOrder().hashCode());
        return hashCode;
    }

    @Override
    public CreateJobQueueRequest clone() {
        return (CreateJobQueueRequest) super.clone();
    }

}
