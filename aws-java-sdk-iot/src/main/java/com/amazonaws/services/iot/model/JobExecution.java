/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The job execution object represents the execution of a job on a particular device.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobExecution implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier you assigned to the job when it was created.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The status of the job execution (IN_PROGRESS, QUEUED, FAILED, SUCCESS, CANCELED, or REJECTED).
     * </p>
     */
    private String status;
    /**
     * <p>
     * A collection of name/value pairs that describe the status of the job execution.
     * </p>
     */
    private JobExecutionStatusDetails statusDetails;
    /**
     * <p>
     * The ARN of the thing on which the job execution is running.
     * </p>
     */
    private String thingArn;
    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job execution was queued.
     * </p>
     */
    private java.util.Date queuedAt;
    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job execution started.
     * </p>
     */
    private java.util.Date startedAt;
    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job execution was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * A string (consisting of the digits "0" through "9") which identifies this particular job execution on this
     * particular device. It can be used in commands which return or update job execution information.
     * </p>
     */
    private Long executionNumber;

    /**
     * <p>
     * The unique identifier you assigned to the job when it was created.
     * </p>
     * 
     * @param jobId
     *        The unique identifier you assigned to the job when it was created.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The unique identifier you assigned to the job when it was created.
     * </p>
     * 
     * @return The unique identifier you assigned to the job when it was created.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The unique identifier you assigned to the job when it was created.
     * </p>
     * 
     * @param jobId
     *        The unique identifier you assigned to the job when it was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobExecution withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The status of the job execution (IN_PROGRESS, QUEUED, FAILED, SUCCESS, CANCELED, or REJECTED).
     * </p>
     * 
     * @param status
     *        The status of the job execution (IN_PROGRESS, QUEUED, FAILED, SUCCESS, CANCELED, or REJECTED).
     * @see JobExecutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the job execution (IN_PROGRESS, QUEUED, FAILED, SUCCESS, CANCELED, or REJECTED).
     * </p>
     * 
     * @return The status of the job execution (IN_PROGRESS, QUEUED, FAILED, SUCCESS, CANCELED, or REJECTED).
     * @see JobExecutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the job execution (IN_PROGRESS, QUEUED, FAILED, SUCCESS, CANCELED, or REJECTED).
     * </p>
     * 
     * @param status
     *        The status of the job execution (IN_PROGRESS, QUEUED, FAILED, SUCCESS, CANCELED, or REJECTED).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobExecutionStatus
     */

    public JobExecution withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the job execution (IN_PROGRESS, QUEUED, FAILED, SUCCESS, CANCELED, or REJECTED).
     * </p>
     * 
     * @param status
     *        The status of the job execution (IN_PROGRESS, QUEUED, FAILED, SUCCESS, CANCELED, or REJECTED).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobExecutionStatus
     */

    public JobExecution withStatus(JobExecutionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A collection of name/value pairs that describe the status of the job execution.
     * </p>
     * 
     * @param statusDetails
     *        A collection of name/value pairs that describe the status of the job execution.
     */

    public void setStatusDetails(JobExecutionStatusDetails statusDetails) {
        this.statusDetails = statusDetails;
    }

    /**
     * <p>
     * A collection of name/value pairs that describe the status of the job execution.
     * </p>
     * 
     * @return A collection of name/value pairs that describe the status of the job execution.
     */

    public JobExecutionStatusDetails getStatusDetails() {
        return this.statusDetails;
    }

    /**
     * <p>
     * A collection of name/value pairs that describe the status of the job execution.
     * </p>
     * 
     * @param statusDetails
     *        A collection of name/value pairs that describe the status of the job execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobExecution withStatusDetails(JobExecutionStatusDetails statusDetails) {
        setStatusDetails(statusDetails);
        return this;
    }

    /**
     * <p>
     * The ARN of the thing on which the job execution is running.
     * </p>
     * 
     * @param thingArn
     *        The ARN of the thing on which the job execution is running.
     */

    public void setThingArn(String thingArn) {
        this.thingArn = thingArn;
    }

    /**
     * <p>
     * The ARN of the thing on which the job execution is running.
     * </p>
     * 
     * @return The ARN of the thing on which the job execution is running.
     */

    public String getThingArn() {
        return this.thingArn;
    }

    /**
     * <p>
     * The ARN of the thing on which the job execution is running.
     * </p>
     * 
     * @param thingArn
     *        The ARN of the thing on which the job execution is running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobExecution withThingArn(String thingArn) {
        setThingArn(thingArn);
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job execution was queued.
     * </p>
     * 
     * @param queuedAt
     *        The time, in milliseconds since the epoch, when the job execution was queued.
     */

    public void setQueuedAt(java.util.Date queuedAt) {
        this.queuedAt = queuedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job execution was queued.
     * </p>
     * 
     * @return The time, in milliseconds since the epoch, when the job execution was queued.
     */

    public java.util.Date getQueuedAt() {
        return this.queuedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job execution was queued.
     * </p>
     * 
     * @param queuedAt
     *        The time, in milliseconds since the epoch, when the job execution was queued.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobExecution withQueuedAt(java.util.Date queuedAt) {
        setQueuedAt(queuedAt);
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job execution started.
     * </p>
     * 
     * @param startedAt
     *        The time, in milliseconds since the epoch, when the job execution started.
     */

    public void setStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job execution started.
     * </p>
     * 
     * @return The time, in milliseconds since the epoch, when the job execution started.
     */

    public java.util.Date getStartedAt() {
        return this.startedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job execution started.
     * </p>
     * 
     * @param startedAt
     *        The time, in milliseconds since the epoch, when the job execution started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobExecution withStartedAt(java.util.Date startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job execution was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time, in milliseconds since the epoch, when the job execution was last updated.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job execution was last updated.
     * </p>
     * 
     * @return The time, in milliseconds since the epoch, when the job execution was last updated.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job execution was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time, in milliseconds since the epoch, when the job execution was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobExecution withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * A string (consisting of the digits "0" through "9") which identifies this particular job execution on this
     * particular device. It can be used in commands which return or update job execution information.
     * </p>
     * 
     * @param executionNumber
     *        A string (consisting of the digits "0" through "9") which identifies this particular job execution on this
     *        particular device. It can be used in commands which return or update job execution information.
     */

    public void setExecutionNumber(Long executionNumber) {
        this.executionNumber = executionNumber;
    }

    /**
     * <p>
     * A string (consisting of the digits "0" through "9") which identifies this particular job execution on this
     * particular device. It can be used in commands which return or update job execution information.
     * </p>
     * 
     * @return A string (consisting of the digits "0" through "9") which identifies this particular job execution on
     *         this particular device. It can be used in commands which return or update job execution information.
     */

    public Long getExecutionNumber() {
        return this.executionNumber;
    }

    /**
     * <p>
     * A string (consisting of the digits "0" through "9") which identifies this particular job execution on this
     * particular device. It can be used in commands which return or update job execution information.
     * </p>
     * 
     * @param executionNumber
     *        A string (consisting of the digits "0" through "9") which identifies this particular job execution on this
     *        particular device. It can be used in commands which return or update job execution information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobExecution withExecutionNumber(Long executionNumber) {
        setExecutionNumber(executionNumber);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusDetails() != null)
            sb.append("StatusDetails: ").append(getStatusDetails()).append(",");
        if (getThingArn() != null)
            sb.append("ThingArn: ").append(getThingArn()).append(",");
        if (getQueuedAt() != null)
            sb.append("QueuedAt: ").append(getQueuedAt()).append(",");
        if (getStartedAt() != null)
            sb.append("StartedAt: ").append(getStartedAt()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getExecutionNumber() != null)
            sb.append("ExecutionNumber: ").append(getExecutionNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobExecution == false)
            return false;
        JobExecution other = (JobExecution) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusDetails() == null ^ this.getStatusDetails() == null)
            return false;
        if (other.getStatusDetails() != null && other.getStatusDetails().equals(this.getStatusDetails()) == false)
            return false;
        if (other.getThingArn() == null ^ this.getThingArn() == null)
            return false;
        if (other.getThingArn() != null && other.getThingArn().equals(this.getThingArn()) == false)
            return false;
        if (other.getQueuedAt() == null ^ this.getQueuedAt() == null)
            return false;
        if (other.getQueuedAt() != null && other.getQueuedAt().equals(this.getQueuedAt()) == false)
            return false;
        if (other.getStartedAt() == null ^ this.getStartedAt() == null)
            return false;
        if (other.getStartedAt() != null && other.getStartedAt().equals(this.getStartedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getExecutionNumber() == null ^ this.getExecutionNumber() == null)
            return false;
        if (other.getExecutionNumber() != null && other.getExecutionNumber().equals(this.getExecutionNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusDetails() == null) ? 0 : getStatusDetails().hashCode());
        hashCode = prime * hashCode + ((getThingArn() == null) ? 0 : getThingArn().hashCode());
        hashCode = prime * hashCode + ((getQueuedAt() == null) ? 0 : getQueuedAt().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getExecutionNumber() == null) ? 0 : getExecutionNumber().hashCode());
        return hashCode;
    }

    @Override
    public JobExecution clone() {
        try {
            return (JobExecution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.JobExecutionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
