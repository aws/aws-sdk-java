/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The farm ID of the farm connected to the task.
     * </p>
     */
    private String farmId;
    /**
     * <p>
     * The job ID of the job connected to the task.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The queue ID for the queue connected to the task.
     * </p>
     */
    private String queueId;
    /**
     * <p>
     * The step ID for the step connected to the task.
     * </p>
     */
    private String stepId;
    /**
     * <p>
     * The task ID.
     * </p>
     */
    private String taskId;

    /**
     * <p>
     * The farm ID of the farm connected to the task.
     * </p>
     * 
     * @param farmId
     *        The farm ID of the farm connected to the task.
     */

    public void setFarmId(String farmId) {
        this.farmId = farmId;
    }

    /**
     * <p>
     * The farm ID of the farm connected to the task.
     * </p>
     * 
     * @return The farm ID of the farm connected to the task.
     */

    public String getFarmId() {
        return this.farmId;
    }

    /**
     * <p>
     * The farm ID of the farm connected to the task.
     * </p>
     * 
     * @param farmId
     *        The farm ID of the farm connected to the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTaskRequest withFarmId(String farmId) {
        setFarmId(farmId);
        return this;
    }

    /**
     * <p>
     * The job ID of the job connected to the task.
     * </p>
     * 
     * @param jobId
     *        The job ID of the job connected to the task.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The job ID of the job connected to the task.
     * </p>
     * 
     * @return The job ID of the job connected to the task.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The job ID of the job connected to the task.
     * </p>
     * 
     * @param jobId
     *        The job ID of the job connected to the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTaskRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The queue ID for the queue connected to the task.
     * </p>
     * 
     * @param queueId
     *        The queue ID for the queue connected to the task.
     */

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    /**
     * <p>
     * The queue ID for the queue connected to the task.
     * </p>
     * 
     * @return The queue ID for the queue connected to the task.
     */

    public String getQueueId() {
        return this.queueId;
    }

    /**
     * <p>
     * The queue ID for the queue connected to the task.
     * </p>
     * 
     * @param queueId
     *        The queue ID for the queue connected to the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTaskRequest withQueueId(String queueId) {
        setQueueId(queueId);
        return this;
    }

    /**
     * <p>
     * The step ID for the step connected to the task.
     * </p>
     * 
     * @param stepId
     *        The step ID for the step connected to the task.
     */

    public void setStepId(String stepId) {
        this.stepId = stepId;
    }

    /**
     * <p>
     * The step ID for the step connected to the task.
     * </p>
     * 
     * @return The step ID for the step connected to the task.
     */

    public String getStepId() {
        return this.stepId;
    }

    /**
     * <p>
     * The step ID for the step connected to the task.
     * </p>
     * 
     * @param stepId
     *        The step ID for the step connected to the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTaskRequest withStepId(String stepId) {
        setStepId(stepId);
        return this;
    }

    /**
     * <p>
     * The task ID.
     * </p>
     * 
     * @param taskId
     *        The task ID.
     */

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The task ID.
     * </p>
     * 
     * @return The task ID.
     */

    public String getTaskId() {
        return this.taskId;
    }

    /**
     * <p>
     * The task ID.
     * </p>
     * 
     * @param taskId
     *        The task ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTaskRequest withTaskId(String taskId) {
        setTaskId(taskId);
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
        if (getFarmId() != null)
            sb.append("FarmId: ").append(getFarmId()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getQueueId() != null)
            sb.append("QueueId: ").append(getQueueId()).append(",");
        if (getStepId() != null)
            sb.append("StepId: ").append(getStepId()).append(",");
        if (getTaskId() != null)
            sb.append("TaskId: ").append(getTaskId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTaskRequest == false)
            return false;
        GetTaskRequest other = (GetTaskRequest) obj;
        if (other.getFarmId() == null ^ this.getFarmId() == null)
            return false;
        if (other.getFarmId() != null && other.getFarmId().equals(this.getFarmId()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getQueueId() == null ^ this.getQueueId() == null)
            return false;
        if (other.getQueueId() != null && other.getQueueId().equals(this.getQueueId()) == false)
            return false;
        if (other.getStepId() == null ^ this.getStepId() == null)
            return false;
        if (other.getStepId() != null && other.getStepId().equals(this.getStepId()) == false)
            return false;
        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFarmId() == null) ? 0 : getFarmId().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getQueueId() == null) ? 0 : getQueueId().hashCode());
        hashCode = prime * hashCode + ((getStepId() == null) ? 0 : getStepId().hashCode());
        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        return hashCode;
    }

    @Override
    public GetTaskRequest clone() {
        return (GetTaskRequest) super.clone();
    }

}
