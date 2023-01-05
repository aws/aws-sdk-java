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
package com.amazonaws.services.mainframemodernization.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A subset of the possible batch job attributes. Used in the batch job list.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/m2-2021-04-28/BatchJobExecutionSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchJobExecutionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the application that hosts this batch job.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The timestamp when this batch job execution ended.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The unique identifier of this execution of the batch job.
     * </p>
     */
    private String executionId;
    /**
     * <p>
     * The unique identifier of a particular batch job.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The name of a particular batch job.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The type of a particular batch job execution.
     * </p>
     */
    private String jobType;
    /**
     * <p>
     * The timestamp when a particular batch job execution started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The status of a particular batch job execution.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The unique identifier of the application that hosts this batch job.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier of the application that hosts this batch job.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier of the application that hosts this batch job.
     * </p>
     * 
     * @return The unique identifier of the application that hosts this batch job.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The unique identifier of the application that hosts this batch job.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier of the application that hosts this batch job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchJobExecutionSummary withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The timestamp when this batch job execution ended.
     * </p>
     * 
     * @param endTime
     *        The timestamp when this batch job execution ended.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The timestamp when this batch job execution ended.
     * </p>
     * 
     * @return The timestamp when this batch job execution ended.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The timestamp when this batch job execution ended.
     * </p>
     * 
     * @param endTime
     *        The timestamp when this batch job execution ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchJobExecutionSummary withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The unique identifier of this execution of the batch job.
     * </p>
     * 
     * @param executionId
     *        The unique identifier of this execution of the batch job.
     */

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    /**
     * <p>
     * The unique identifier of this execution of the batch job.
     * </p>
     * 
     * @return The unique identifier of this execution of the batch job.
     */

    public String getExecutionId() {
        return this.executionId;
    }

    /**
     * <p>
     * The unique identifier of this execution of the batch job.
     * </p>
     * 
     * @param executionId
     *        The unique identifier of this execution of the batch job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchJobExecutionSummary withExecutionId(String executionId) {
        setExecutionId(executionId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of a particular batch job.
     * </p>
     * 
     * @param jobId
     *        The unique identifier of a particular batch job.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The unique identifier of a particular batch job.
     * </p>
     * 
     * @return The unique identifier of a particular batch job.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The unique identifier of a particular batch job.
     * </p>
     * 
     * @param jobId
     *        The unique identifier of a particular batch job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchJobExecutionSummary withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The name of a particular batch job.
     * </p>
     * 
     * @param jobName
     *        The name of a particular batch job.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The name of a particular batch job.
     * </p>
     * 
     * @return The name of a particular batch job.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The name of a particular batch job.
     * </p>
     * 
     * @param jobName
     *        The name of a particular batch job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchJobExecutionSummary withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The type of a particular batch job execution.
     * </p>
     * 
     * @param jobType
     *        The type of a particular batch job execution.
     * @see BatchJobType
     */

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    /**
     * <p>
     * The type of a particular batch job execution.
     * </p>
     * 
     * @return The type of a particular batch job execution.
     * @see BatchJobType
     */

    public String getJobType() {
        return this.jobType;
    }

    /**
     * <p>
     * The type of a particular batch job execution.
     * </p>
     * 
     * @param jobType
     *        The type of a particular batch job execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchJobType
     */

    public BatchJobExecutionSummary withJobType(String jobType) {
        setJobType(jobType);
        return this;
    }

    /**
     * <p>
     * The type of a particular batch job execution.
     * </p>
     * 
     * @param jobType
     *        The type of a particular batch job execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchJobType
     */

    public BatchJobExecutionSummary withJobType(BatchJobType jobType) {
        this.jobType = jobType.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp when a particular batch job execution started.
     * </p>
     * 
     * @param startTime
     *        The timestamp when a particular batch job execution started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The timestamp when a particular batch job execution started.
     * </p>
     * 
     * @return The timestamp when a particular batch job execution started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The timestamp when a particular batch job execution started.
     * </p>
     * 
     * @param startTime
     *        The timestamp when a particular batch job execution started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchJobExecutionSummary withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The status of a particular batch job execution.
     * </p>
     * 
     * @param status
     *        The status of a particular batch job execution.
     * @see BatchJobExecutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a particular batch job execution.
     * </p>
     * 
     * @return The status of a particular batch job execution.
     * @see BatchJobExecutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of a particular batch job execution.
     * </p>
     * 
     * @param status
     *        The status of a particular batch job execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchJobExecutionStatus
     */

    public BatchJobExecutionSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of a particular batch job execution.
     * </p>
     * 
     * @param status
     *        The status of a particular batch job execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BatchJobExecutionStatus
     */

    public BatchJobExecutionSummary withStatus(BatchJobExecutionStatus status) {
        this.status = status.toString();
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getExecutionId() != null)
            sb.append("ExecutionId: ").append(getExecutionId()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getJobType() != null)
            sb.append("JobType: ").append(getJobType()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchJobExecutionSummary == false)
            return false;
        BatchJobExecutionSummary other = (BatchJobExecutionSummary) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getExecutionId() == null ^ this.getExecutionId() == null)
            return false;
        if (other.getExecutionId() != null && other.getExecutionId().equals(this.getExecutionId()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getJobType() == null ^ this.getJobType() == null)
            return false;
        if (other.getJobType() != null && other.getJobType().equals(this.getJobType()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getExecutionId() == null) ? 0 : getExecutionId().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getJobType() == null) ? 0 : getJobType().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public BatchJobExecutionSummary clone() {
        try {
            return (BatchJobExecutionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mainframemodernization.model.transform.BatchJobExecutionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
