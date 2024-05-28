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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetStep" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetStepRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The farm ID for the step.
     * </p>
     */
    private String farmId;
    /**
     * <p>
     * The job ID for the step.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The queue ID for the step.
     * </p>
     */
    private String queueId;
    /**
     * <p>
     * The step ID.
     * </p>
     */
    private String stepId;

    /**
     * <p>
     * The farm ID for the step.
     * </p>
     * 
     * @param farmId
     *        The farm ID for the step.
     */

    public void setFarmId(String farmId) {
        this.farmId = farmId;
    }

    /**
     * <p>
     * The farm ID for the step.
     * </p>
     * 
     * @return The farm ID for the step.
     */

    public String getFarmId() {
        return this.farmId;
    }

    /**
     * <p>
     * The farm ID for the step.
     * </p>
     * 
     * @param farmId
     *        The farm ID for the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStepRequest withFarmId(String farmId) {
        setFarmId(farmId);
        return this;
    }

    /**
     * <p>
     * The job ID for the step.
     * </p>
     * 
     * @param jobId
     *        The job ID for the step.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The job ID for the step.
     * </p>
     * 
     * @return The job ID for the step.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The job ID for the step.
     * </p>
     * 
     * @param jobId
     *        The job ID for the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStepRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The queue ID for the step.
     * </p>
     * 
     * @param queueId
     *        The queue ID for the step.
     */

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    /**
     * <p>
     * The queue ID for the step.
     * </p>
     * 
     * @return The queue ID for the step.
     */

    public String getQueueId() {
        return this.queueId;
    }

    /**
     * <p>
     * The queue ID for the step.
     * </p>
     * 
     * @param queueId
     *        The queue ID for the step.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStepRequest withQueueId(String queueId) {
        setQueueId(queueId);
        return this;
    }

    /**
     * <p>
     * The step ID.
     * </p>
     * 
     * @param stepId
     *        The step ID.
     */

    public void setStepId(String stepId) {
        this.stepId = stepId;
    }

    /**
     * <p>
     * The step ID.
     * </p>
     * 
     * @return The step ID.
     */

    public String getStepId() {
        return this.stepId;
    }

    /**
     * <p>
     * The step ID.
     * </p>
     * 
     * @param stepId
     *        The step ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStepRequest withStepId(String stepId) {
        setStepId(stepId);
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
            sb.append("StepId: ").append(getStepId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetStepRequest == false)
            return false;
        GetStepRequest other = (GetStepRequest) obj;
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
        return hashCode;
    }

    @Override
    public GetStepRequest clone() {
        return (GetStepRequest) super.clone();
    }

}
