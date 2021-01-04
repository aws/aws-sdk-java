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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the parameters for <code>CreateJobQueue</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/CreateJobQueue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateJobQueueRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the job queue. Up to 128 letters (uppercase and lowercase), numbers, and underscores are allowed.
     * </p>
     */
    private String jobQueueName;
    /**
     * <p>
     * The state of the job queue. If the job queue state is <code>ENABLED</code>, it is able to accept jobs. If the job
     * queue state is <code>DISABLED</code>, new jobs can't be added to the queue, but jobs already in the queue can
     * finish.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The priority of the job queue. Job queues with a higher priority (or a higher integer value for the
     * <code>priority</code> parameter) are evaluated first when associated with the same compute environment. Priority
     * is determined in descending order. For example, a job queue with a priority value of <code>10</code> is given
     * scheduling preference over a job queue with a priority value of <code>1</code>. All of the compute environments
     * must be either EC2 (<code>EC2</code> or <code>SPOT</code>) or Fargate (<code>FARGATE</code> or
     * <code>FARGATE_SPOT</code>); EC2 and Fargate compute environments cannot be mixed.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * The set of compute environments mapped to a job queue and their order relative to each other. The job scheduler
     * uses this parameter to determine which compute environment should run a specific job. Compute environments must
     * be in the <code>VALID</code> state before you can associate them with a job queue. You can associate up to three
     * compute environments with a job queue. All of the compute environments must be either EC2 (<code>EC2</code> or
     * <code>SPOT</code>) or Fargate (<code>FARGATE</code> or <code>FARGATE_SPOT</code>); EC2 and Fargate compute
     * environments can't be mixed.
     * </p>
     * <note>
     * <p>
     * All compute environments that are associated with a job queue must share the same architecture. AWS Batch doesn't
     * support mixing compute environment architecture types in a single job queue.
     * </p>
     * </note>
     */
    private java.util.List<ComputeEnvironmentOrder> computeEnvironmentOrder;
    /**
     * <p>
     * The tags that you apply to the job queue to help you categorize and organize your resources. Each tag consists of
     * a key and an optional value. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/using-tags.html">Tagging your AWS Batch resources</a> in
     * <i>AWS Batch User Guide</i>.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name of the job queue. Up to 128 letters (uppercase and lowercase), numbers, and underscores are allowed.
     * </p>
     * 
     * @param jobQueueName
     *        The name of the job queue. Up to 128 letters (uppercase and lowercase), numbers, and underscores are
     *        allowed.
     */

    public void setJobQueueName(String jobQueueName) {
        this.jobQueueName = jobQueueName;
    }

    /**
     * <p>
     * The name of the job queue. Up to 128 letters (uppercase and lowercase), numbers, and underscores are allowed.
     * </p>
     * 
     * @return The name of the job queue. Up to 128 letters (uppercase and lowercase), numbers, and underscores are
     *         allowed.
     */

    public String getJobQueueName() {
        return this.jobQueueName;
    }

    /**
     * <p>
     * The name of the job queue. Up to 128 letters (uppercase and lowercase), numbers, and underscores are allowed.
     * </p>
     * 
     * @param jobQueueName
     *        The name of the job queue. Up to 128 letters (uppercase and lowercase), numbers, and underscores are
     *        allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobQueueRequest withJobQueueName(String jobQueueName) {
        setJobQueueName(jobQueueName);
        return this;
    }

    /**
     * <p>
     * The state of the job queue. If the job queue state is <code>ENABLED</code>, it is able to accept jobs. If the job
     * queue state is <code>DISABLED</code>, new jobs can't be added to the queue, but jobs already in the queue can
     * finish.
     * </p>
     * 
     * @param state
     *        The state of the job queue. If the job queue state is <code>ENABLED</code>, it is able to accept jobs. If
     *        the job queue state is <code>DISABLED</code>, new jobs can't be added to the queue, but jobs already in
     *        the queue can finish.
     * @see JQState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the job queue. If the job queue state is <code>ENABLED</code>, it is able to accept jobs. If the job
     * queue state is <code>DISABLED</code>, new jobs can't be added to the queue, but jobs already in the queue can
     * finish.
     * </p>
     * 
     * @return The state of the job queue. If the job queue state is <code>ENABLED</code>, it is able to accept jobs. If
     *         the job queue state is <code>DISABLED</code>, new jobs can't be added to the queue, but jobs already in
     *         the queue can finish.
     * @see JQState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the job queue. If the job queue state is <code>ENABLED</code>, it is able to accept jobs. If the job
     * queue state is <code>DISABLED</code>, new jobs can't be added to the queue, but jobs already in the queue can
     * finish.
     * </p>
     * 
     * @param state
     *        The state of the job queue. If the job queue state is <code>ENABLED</code>, it is able to accept jobs. If
     *        the job queue state is <code>DISABLED</code>, new jobs can't be added to the queue, but jobs already in
     *        the queue can finish.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JQState
     */

    public CreateJobQueueRequest withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the job queue. If the job queue state is <code>ENABLED</code>, it is able to accept jobs. If the job
     * queue state is <code>DISABLED</code>, new jobs can't be added to the queue, but jobs already in the queue can
     * finish.
     * </p>
     * 
     * @param state
     *        The state of the job queue. If the job queue state is <code>ENABLED</code>, it is able to accept jobs. If
     *        the job queue state is <code>DISABLED</code>, new jobs can't be added to the queue, but jobs already in
     *        the queue can finish.
     * @see JQState
     */

    public void setState(JQState state) {
        withState(state);
    }

    /**
     * <p>
     * The state of the job queue. If the job queue state is <code>ENABLED</code>, it is able to accept jobs. If the job
     * queue state is <code>DISABLED</code>, new jobs can't be added to the queue, but jobs already in the queue can
     * finish.
     * </p>
     * 
     * @param state
     *        The state of the job queue. If the job queue state is <code>ENABLED</code>, it is able to accept jobs. If
     *        the job queue state is <code>DISABLED</code>, new jobs can't be added to the queue, but jobs already in
     *        the queue can finish.
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
     * is determined in descending order. For example, a job queue with a priority value of <code>10</code> is given
     * scheduling preference over a job queue with a priority value of <code>1</code>. All of the compute environments
     * must be either EC2 (<code>EC2</code> or <code>SPOT</code>) or Fargate (<code>FARGATE</code> or
     * <code>FARGATE_SPOT</code>); EC2 and Fargate compute environments cannot be mixed.
     * </p>
     * 
     * @param priority
     *        The priority of the job queue. Job queues with a higher priority (or a higher integer value for the
     *        <code>priority</code> parameter) are evaluated first when associated with the same compute environment.
     *        Priority is determined in descending order. For example, a job queue with a priority value of
     *        <code>10</code> is given scheduling preference over a job queue with a priority value of <code>1</code>.
     *        All of the compute environments must be either EC2 (<code>EC2</code> or <code>SPOT</code>) or Fargate (
     *        <code>FARGATE</code> or <code>FARGATE_SPOT</code>); EC2 and Fargate compute environments cannot be mixed.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The priority of the job queue. Job queues with a higher priority (or a higher integer value for the
     * <code>priority</code> parameter) are evaluated first when associated with the same compute environment. Priority
     * is determined in descending order. For example, a job queue with a priority value of <code>10</code> is given
     * scheduling preference over a job queue with a priority value of <code>1</code>. All of the compute environments
     * must be either EC2 (<code>EC2</code> or <code>SPOT</code>) or Fargate (<code>FARGATE</code> or
     * <code>FARGATE_SPOT</code>); EC2 and Fargate compute environments cannot be mixed.
     * </p>
     * 
     * @return The priority of the job queue. Job queues with a higher priority (or a higher integer value for the
     *         <code>priority</code> parameter) are evaluated first when associated with the same compute environment.
     *         Priority is determined in descending order. For example, a job queue with a priority value of
     *         <code>10</code> is given scheduling preference over a job queue with a priority value of <code>1</code>.
     *         All of the compute environments must be either EC2 (<code>EC2</code> or <code>SPOT</code>) or Fargate (
     *         <code>FARGATE</code> or <code>FARGATE_SPOT</code>); EC2 and Fargate compute environments cannot be mixed.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * The priority of the job queue. Job queues with a higher priority (or a higher integer value for the
     * <code>priority</code> parameter) are evaluated first when associated with the same compute environment. Priority
     * is determined in descending order. For example, a job queue with a priority value of <code>10</code> is given
     * scheduling preference over a job queue with a priority value of <code>1</code>. All of the compute environments
     * must be either EC2 (<code>EC2</code> or <code>SPOT</code>) or Fargate (<code>FARGATE</code> or
     * <code>FARGATE_SPOT</code>); EC2 and Fargate compute environments cannot be mixed.
     * </p>
     * 
     * @param priority
     *        The priority of the job queue. Job queues with a higher priority (or a higher integer value for the
     *        <code>priority</code> parameter) are evaluated first when associated with the same compute environment.
     *        Priority is determined in descending order. For example, a job queue with a priority value of
     *        <code>10</code> is given scheduling preference over a job queue with a priority value of <code>1</code>.
     *        All of the compute environments must be either EC2 (<code>EC2</code> or <code>SPOT</code>) or Fargate (
     *        <code>FARGATE</code> or <code>FARGATE_SPOT</code>); EC2 and Fargate compute environments cannot be mixed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobQueueRequest withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * The set of compute environments mapped to a job queue and their order relative to each other. The job scheduler
     * uses this parameter to determine which compute environment should run a specific job. Compute environments must
     * be in the <code>VALID</code> state before you can associate them with a job queue. You can associate up to three
     * compute environments with a job queue. All of the compute environments must be either EC2 (<code>EC2</code> or
     * <code>SPOT</code>) or Fargate (<code>FARGATE</code> or <code>FARGATE_SPOT</code>); EC2 and Fargate compute
     * environments can't be mixed.
     * </p>
     * <note>
     * <p>
     * All compute environments that are associated with a job queue must share the same architecture. AWS Batch doesn't
     * support mixing compute environment architecture types in a single job queue.
     * </p>
     * </note>
     * 
     * @return The set of compute environments mapped to a job queue and their order relative to each other. The job
     *         scheduler uses this parameter to determine which compute environment should run a specific job. Compute
     *         environments must be in the <code>VALID</code> state before you can associate them with a job queue. You
     *         can associate up to three compute environments with a job queue. All of the compute environments must be
     *         either EC2 (<code>EC2</code> or <code>SPOT</code>) or Fargate (<code>FARGATE</code> or
     *         <code>FARGATE_SPOT</code>); EC2 and Fargate compute environments can't be mixed.</p> <note>
     *         <p>
     *         All compute environments that are associated with a job queue must share the same architecture. AWS Batch
     *         doesn't support mixing compute environment architecture types in a single job queue.
     *         </p>
     */

    public java.util.List<ComputeEnvironmentOrder> getComputeEnvironmentOrder() {
        return computeEnvironmentOrder;
    }

    /**
     * <p>
     * The set of compute environments mapped to a job queue and their order relative to each other. The job scheduler
     * uses this parameter to determine which compute environment should run a specific job. Compute environments must
     * be in the <code>VALID</code> state before you can associate them with a job queue. You can associate up to three
     * compute environments with a job queue. All of the compute environments must be either EC2 (<code>EC2</code> or
     * <code>SPOT</code>) or Fargate (<code>FARGATE</code> or <code>FARGATE_SPOT</code>); EC2 and Fargate compute
     * environments can't be mixed.
     * </p>
     * <note>
     * <p>
     * All compute environments that are associated with a job queue must share the same architecture. AWS Batch doesn't
     * support mixing compute environment architecture types in a single job queue.
     * </p>
     * </note>
     * 
     * @param computeEnvironmentOrder
     *        The set of compute environments mapped to a job queue and their order relative to each other. The job
     *        scheduler uses this parameter to determine which compute environment should run a specific job. Compute
     *        environments must be in the <code>VALID</code> state before you can associate them with a job queue. You
     *        can associate up to three compute environments with a job queue. All of the compute environments must be
     *        either EC2 (<code>EC2</code> or <code>SPOT</code>) or Fargate (<code>FARGATE</code> or
     *        <code>FARGATE_SPOT</code>); EC2 and Fargate compute environments can't be mixed.</p> <note>
     *        <p>
     *        All compute environments that are associated with a job queue must share the same architecture. AWS Batch
     *        doesn't support mixing compute environment architecture types in a single job queue.
     *        </p>
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
     * uses this parameter to determine which compute environment should run a specific job. Compute environments must
     * be in the <code>VALID</code> state before you can associate them with a job queue. You can associate up to three
     * compute environments with a job queue. All of the compute environments must be either EC2 (<code>EC2</code> or
     * <code>SPOT</code>) or Fargate (<code>FARGATE</code> or <code>FARGATE_SPOT</code>); EC2 and Fargate compute
     * environments can't be mixed.
     * </p>
     * <note>
     * <p>
     * All compute environments that are associated with a job queue must share the same architecture. AWS Batch doesn't
     * support mixing compute environment architecture types in a single job queue.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComputeEnvironmentOrder(java.util.Collection)} or
     * {@link #withComputeEnvironmentOrder(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param computeEnvironmentOrder
     *        The set of compute environments mapped to a job queue and their order relative to each other. The job
     *        scheduler uses this parameter to determine which compute environment should run a specific job. Compute
     *        environments must be in the <code>VALID</code> state before you can associate them with a job queue. You
     *        can associate up to three compute environments with a job queue. All of the compute environments must be
     *        either EC2 (<code>EC2</code> or <code>SPOT</code>) or Fargate (<code>FARGATE</code> or
     *        <code>FARGATE_SPOT</code>); EC2 and Fargate compute environments can't be mixed.</p> <note>
     *        <p>
     *        All compute environments that are associated with a job queue must share the same architecture. AWS Batch
     *        doesn't support mixing compute environment architecture types in a single job queue.
     *        </p>
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
     * uses this parameter to determine which compute environment should run a specific job. Compute environments must
     * be in the <code>VALID</code> state before you can associate them with a job queue. You can associate up to three
     * compute environments with a job queue. All of the compute environments must be either EC2 (<code>EC2</code> or
     * <code>SPOT</code>) or Fargate (<code>FARGATE</code> or <code>FARGATE_SPOT</code>); EC2 and Fargate compute
     * environments can't be mixed.
     * </p>
     * <note>
     * <p>
     * All compute environments that are associated with a job queue must share the same architecture. AWS Batch doesn't
     * support mixing compute environment architecture types in a single job queue.
     * </p>
     * </note>
     * 
     * @param computeEnvironmentOrder
     *        The set of compute environments mapped to a job queue and their order relative to each other. The job
     *        scheduler uses this parameter to determine which compute environment should run a specific job. Compute
     *        environments must be in the <code>VALID</code> state before you can associate them with a job queue. You
     *        can associate up to three compute environments with a job queue. All of the compute environments must be
     *        either EC2 (<code>EC2</code> or <code>SPOT</code>) or Fargate (<code>FARGATE</code> or
     *        <code>FARGATE_SPOT</code>); EC2 and Fargate compute environments can't be mixed.</p> <note>
     *        <p>
     *        All compute environments that are associated with a job queue must share the same architecture. AWS Batch
     *        doesn't support mixing compute environment architecture types in a single job queue.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobQueueRequest withComputeEnvironmentOrder(java.util.Collection<ComputeEnvironmentOrder> computeEnvironmentOrder) {
        setComputeEnvironmentOrder(computeEnvironmentOrder);
        return this;
    }

    /**
     * <p>
     * The tags that you apply to the job queue to help you categorize and organize your resources. Each tag consists of
     * a key and an optional value. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/using-tags.html">Tagging your AWS Batch resources</a> in
     * <i>AWS Batch User Guide</i>.
     * </p>
     * 
     * @return The tags that you apply to the job queue to help you categorize and organize your resources. Each tag
     *         consists of a key and an optional value. For more information, see <a
     *         href="https://docs.aws.amazon.com/batch/latest/userguide/using-tags.html">Tagging your AWS Batch
     *         resources</a> in <i>AWS Batch User Guide</i>.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags that you apply to the job queue to help you categorize and organize your resources. Each tag consists of
     * a key and an optional value. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/using-tags.html">Tagging your AWS Batch resources</a> in
     * <i>AWS Batch User Guide</i>.
     * </p>
     * 
     * @param tags
     *        The tags that you apply to the job queue to help you categorize and organize your resources. Each tag
     *        consists of a key and an optional value. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/using-tags.html">Tagging your AWS Batch
     *        resources</a> in <i>AWS Batch User Guide</i>.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags that you apply to the job queue to help you categorize and organize your resources. Each tag consists of
     * a key and an optional value. For more information, see <a
     * href="https://docs.aws.amazon.com/batch/latest/userguide/using-tags.html">Tagging your AWS Batch resources</a> in
     * <i>AWS Batch User Guide</i>.
     * </p>
     * 
     * @param tags
     *        The tags that you apply to the job queue to help you categorize and organize your resources. Each tag
     *        consists of a key and an optional value. For more information, see <a
     *        href="https://docs.aws.amazon.com/batch/latest/userguide/using-tags.html">Tagging your AWS Batch
     *        resources</a> in <i>AWS Batch User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobQueueRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateJobQueueRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobQueueRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateJobQueueRequest clearTagsEntries() {
        this.tags = null;
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
            sb.append("ComputeEnvironmentOrder: ").append(getComputeEnvironmentOrder()).append(",");
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

        hashCode = prime * hashCode + ((getJobQueueName() == null) ? 0 : getJobQueueName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getComputeEnvironmentOrder() == null) ? 0 : getComputeEnvironmentOrder().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateJobQueueRequest clone() {
        return (CreateJobQueueRequest) super.clone();
    }

}
