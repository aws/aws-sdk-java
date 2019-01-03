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
package com.amazonaws.services.iotjobsdataplane.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains data about a job execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot-jobs-data-2017-09-29/JobExecution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobExecution implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier you assigned to this job when it was created.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The name of the thing that is executing the job.
     * </p>
     */
    private String thingName;
    /**
     * <p>
     * The status of the job execution. Can be one of: "QUEUED", "IN_PROGRESS", "FAILED", "SUCCESS", "CANCELED",
     * "REJECTED", or "REMOVED".
     * </p>
     */
    private String status;
    /**
     * <p>
     * A collection of name/value pairs that describe the status of the job execution.
     * </p>
     */
    private java.util.Map<String, String> statusDetails;
    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job execution was enqueued.
     * </p>
     */
    private Long queuedAt;
    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job execution was started.
     * </p>
     */
    private Long startedAt;
    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job execution was last updated.
     * </p>
     */
    private Long lastUpdatedAt;
    /**
     * <p>
     * The estimated number of seconds that remain before the job execution status will be changed to
     * <code>TIMED_OUT</code>.
     * </p>
     */
    private Long approximateSecondsBeforeTimedOut;
    /**
     * <p>
     * The version of the job execution. Job execution versions are incremented each time they are updated by a device.
     * </p>
     */
    private Long versionNumber;
    /**
     * <p>
     * A number that identifies a particular job execution on a particular device. It can be used later in commands that
     * return or update job execution information.
     * </p>
     */
    private Long executionNumber;
    /**
     * <p>
     * The content of the job document.
     * </p>
     */
    private String jobDocument;

    /**
     * <p>
     * The unique identifier you assigned to this job when it was created.
     * </p>
     * 
     * @param jobId
     *        The unique identifier you assigned to this job when it was created.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The unique identifier you assigned to this job when it was created.
     * </p>
     * 
     * @return The unique identifier you assigned to this job when it was created.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The unique identifier you assigned to this job when it was created.
     * </p>
     * 
     * @param jobId
     *        The unique identifier you assigned to this job when it was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobExecution withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The name of the thing that is executing the job.
     * </p>
     * 
     * @param thingName
     *        The name of the thing that is executing the job.
     */

    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The name of the thing that is executing the job.
     * </p>
     * 
     * @return The name of the thing that is executing the job.
     */

    public String getThingName() {
        return this.thingName;
    }

    /**
     * <p>
     * The name of the thing that is executing the job.
     * </p>
     * 
     * @param thingName
     *        The name of the thing that is executing the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobExecution withThingName(String thingName) {
        setThingName(thingName);
        return this;
    }

    /**
     * <p>
     * The status of the job execution. Can be one of: "QUEUED", "IN_PROGRESS", "FAILED", "SUCCESS", "CANCELED",
     * "REJECTED", or "REMOVED".
     * </p>
     * 
     * @param status
     *        The status of the job execution. Can be one of: "QUEUED", "IN_PROGRESS", "FAILED", "SUCCESS", "CANCELED",
     *        "REJECTED", or "REMOVED".
     * @see JobExecutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the job execution. Can be one of: "QUEUED", "IN_PROGRESS", "FAILED", "SUCCESS", "CANCELED",
     * "REJECTED", or "REMOVED".
     * </p>
     * 
     * @return The status of the job execution. Can be one of: "QUEUED", "IN_PROGRESS", "FAILED", "SUCCESS", "CANCELED",
     *         "REJECTED", or "REMOVED".
     * @see JobExecutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the job execution. Can be one of: "QUEUED", "IN_PROGRESS", "FAILED", "SUCCESS", "CANCELED",
     * "REJECTED", or "REMOVED".
     * </p>
     * 
     * @param status
     *        The status of the job execution. Can be one of: "QUEUED", "IN_PROGRESS", "FAILED", "SUCCESS", "CANCELED",
     *        "REJECTED", or "REMOVED".
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobExecutionStatus
     */

    public JobExecution withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the job execution. Can be one of: "QUEUED", "IN_PROGRESS", "FAILED", "SUCCESS", "CANCELED",
     * "REJECTED", or "REMOVED".
     * </p>
     * 
     * @param status
     *        The status of the job execution. Can be one of: "QUEUED", "IN_PROGRESS", "FAILED", "SUCCESS", "CANCELED",
     *        "REJECTED", or "REMOVED".
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
     * @return A collection of name/value pairs that describe the status of the job execution.
     */

    public java.util.Map<String, String> getStatusDetails() {
        return statusDetails;
    }

    /**
     * <p>
     * A collection of name/value pairs that describe the status of the job execution.
     * </p>
     * 
     * @param statusDetails
     *        A collection of name/value pairs that describe the status of the job execution.
     */

    public void setStatusDetails(java.util.Map<String, String> statusDetails) {
        this.statusDetails = statusDetails;
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

    public JobExecution withStatusDetails(java.util.Map<String, String> statusDetails) {
        setStatusDetails(statusDetails);
        return this;
    }

    public JobExecution addStatusDetailsEntry(String key, String value) {
        if (null == this.statusDetails) {
            this.statusDetails = new java.util.HashMap<String, String>();
        }
        if (this.statusDetails.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.statusDetails.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into StatusDetails.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobExecution clearStatusDetailsEntries() {
        this.statusDetails = null;
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job execution was enqueued.
     * </p>
     * 
     * @param queuedAt
     *        The time, in milliseconds since the epoch, when the job execution was enqueued.
     */

    public void setQueuedAt(Long queuedAt) {
        this.queuedAt = queuedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job execution was enqueued.
     * </p>
     * 
     * @return The time, in milliseconds since the epoch, when the job execution was enqueued.
     */

    public Long getQueuedAt() {
        return this.queuedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job execution was enqueued.
     * </p>
     * 
     * @param queuedAt
     *        The time, in milliseconds since the epoch, when the job execution was enqueued.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobExecution withQueuedAt(Long queuedAt) {
        setQueuedAt(queuedAt);
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job execution was started.
     * </p>
     * 
     * @param startedAt
     *        The time, in milliseconds since the epoch, when the job execution was started.
     */

    public void setStartedAt(Long startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job execution was started.
     * </p>
     * 
     * @return The time, in milliseconds since the epoch, when the job execution was started.
     */

    public Long getStartedAt() {
        return this.startedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job execution was started.
     * </p>
     * 
     * @param startedAt
     *        The time, in milliseconds since the epoch, when the job execution was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobExecution withStartedAt(Long startedAt) {
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

    public void setLastUpdatedAt(Long lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the job execution was last updated.
     * </p>
     * 
     * @return The time, in milliseconds since the epoch, when the job execution was last updated.
     */

    public Long getLastUpdatedAt() {
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

    public JobExecution withLastUpdatedAt(Long lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The estimated number of seconds that remain before the job execution status will be changed to
     * <code>TIMED_OUT</code>.
     * </p>
     * 
     * @param approximateSecondsBeforeTimedOut
     *        The estimated number of seconds that remain before the job execution status will be changed to
     *        <code>TIMED_OUT</code>.
     */

    public void setApproximateSecondsBeforeTimedOut(Long approximateSecondsBeforeTimedOut) {
        this.approximateSecondsBeforeTimedOut = approximateSecondsBeforeTimedOut;
    }

    /**
     * <p>
     * The estimated number of seconds that remain before the job execution status will be changed to
     * <code>TIMED_OUT</code>.
     * </p>
     * 
     * @return The estimated number of seconds that remain before the job execution status will be changed to
     *         <code>TIMED_OUT</code>.
     */

    public Long getApproximateSecondsBeforeTimedOut() {
        return this.approximateSecondsBeforeTimedOut;
    }

    /**
     * <p>
     * The estimated number of seconds that remain before the job execution status will be changed to
     * <code>TIMED_OUT</code>.
     * </p>
     * 
     * @param approximateSecondsBeforeTimedOut
     *        The estimated number of seconds that remain before the job execution status will be changed to
     *        <code>TIMED_OUT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobExecution withApproximateSecondsBeforeTimedOut(Long approximateSecondsBeforeTimedOut) {
        setApproximateSecondsBeforeTimedOut(approximateSecondsBeforeTimedOut);
        return this;
    }

    /**
     * <p>
     * The version of the job execution. Job execution versions are incremented each time they are updated by a device.
     * </p>
     * 
     * @param versionNumber
     *        The version of the job execution. Job execution versions are incremented each time they are updated by a
     *        device.
     */

    public void setVersionNumber(Long versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * <p>
     * The version of the job execution. Job execution versions are incremented each time they are updated by a device.
     * </p>
     * 
     * @return The version of the job execution. Job execution versions are incremented each time they are updated by a
     *         device.
     */

    public Long getVersionNumber() {
        return this.versionNumber;
    }

    /**
     * <p>
     * The version of the job execution. Job execution versions are incremented each time they are updated by a device.
     * </p>
     * 
     * @param versionNumber
     *        The version of the job execution. Job execution versions are incremented each time they are updated by a
     *        device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobExecution withVersionNumber(Long versionNumber) {
        setVersionNumber(versionNumber);
        return this;
    }

    /**
     * <p>
     * A number that identifies a particular job execution on a particular device. It can be used later in commands that
     * return or update job execution information.
     * </p>
     * 
     * @param executionNumber
     *        A number that identifies a particular job execution on a particular device. It can be used later in
     *        commands that return or update job execution information.
     */

    public void setExecutionNumber(Long executionNumber) {
        this.executionNumber = executionNumber;
    }

    /**
     * <p>
     * A number that identifies a particular job execution on a particular device. It can be used later in commands that
     * return or update job execution information.
     * </p>
     * 
     * @return A number that identifies a particular job execution on a particular device. It can be used later in
     *         commands that return or update job execution information.
     */

    public Long getExecutionNumber() {
        return this.executionNumber;
    }

    /**
     * <p>
     * A number that identifies a particular job execution on a particular device. It can be used later in commands that
     * return or update job execution information.
     * </p>
     * 
     * @param executionNumber
     *        A number that identifies a particular job execution on a particular device. It can be used later in
     *        commands that return or update job execution information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobExecution withExecutionNumber(Long executionNumber) {
        setExecutionNumber(executionNumber);
        return this;
    }

    /**
     * <p>
     * The content of the job document.
     * </p>
     * 
     * @param jobDocument
     *        The content of the job document.
     */

    public void setJobDocument(String jobDocument) {
        this.jobDocument = jobDocument;
    }

    /**
     * <p>
     * The content of the job document.
     * </p>
     * 
     * @return The content of the job document.
     */

    public String getJobDocument() {
        return this.jobDocument;
    }

    /**
     * <p>
     * The content of the job document.
     * </p>
     * 
     * @param jobDocument
     *        The content of the job document.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobExecution withJobDocument(String jobDocument) {
        setJobDocument(jobDocument);
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
        if (getThingName() != null)
            sb.append("ThingName: ").append(getThingName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusDetails() != null)
            sb.append("StatusDetails: ").append(getStatusDetails()).append(",");
        if (getQueuedAt() != null)
            sb.append("QueuedAt: ").append(getQueuedAt()).append(",");
        if (getStartedAt() != null)
            sb.append("StartedAt: ").append(getStartedAt()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getApproximateSecondsBeforeTimedOut() != null)
            sb.append("ApproximateSecondsBeforeTimedOut: ").append(getApproximateSecondsBeforeTimedOut()).append(",");
        if (getVersionNumber() != null)
            sb.append("VersionNumber: ").append(getVersionNumber()).append(",");
        if (getExecutionNumber() != null)
            sb.append("ExecutionNumber: ").append(getExecutionNumber()).append(",");
        if (getJobDocument() != null)
            sb.append("JobDocument: ").append(getJobDocument());
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
        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null && other.getThingName().equals(this.getThingName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusDetails() == null ^ this.getStatusDetails() == null)
            return false;
        if (other.getStatusDetails() != null && other.getStatusDetails().equals(this.getStatusDetails()) == false)
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
        if (other.getApproximateSecondsBeforeTimedOut() == null ^ this.getApproximateSecondsBeforeTimedOut() == null)
            return false;
        if (other.getApproximateSecondsBeforeTimedOut() != null
                && other.getApproximateSecondsBeforeTimedOut().equals(this.getApproximateSecondsBeforeTimedOut()) == false)
            return false;
        if (other.getVersionNumber() == null ^ this.getVersionNumber() == null)
            return false;
        if (other.getVersionNumber() != null && other.getVersionNumber().equals(this.getVersionNumber()) == false)
            return false;
        if (other.getExecutionNumber() == null ^ this.getExecutionNumber() == null)
            return false;
        if (other.getExecutionNumber() != null && other.getExecutionNumber().equals(this.getExecutionNumber()) == false)
            return false;
        if (other.getJobDocument() == null ^ this.getJobDocument() == null)
            return false;
        if (other.getJobDocument() != null && other.getJobDocument().equals(this.getJobDocument()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusDetails() == null) ? 0 : getStatusDetails().hashCode());
        hashCode = prime * hashCode + ((getQueuedAt() == null) ? 0 : getQueuedAt().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getApproximateSecondsBeforeTimedOut() == null) ? 0 : getApproximateSecondsBeforeTimedOut().hashCode());
        hashCode = prime * hashCode + ((getVersionNumber() == null) ? 0 : getVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getExecutionNumber() == null) ? 0 : getExecutionNumber().hashCode());
        hashCode = prime * hashCode + ((getJobDocument() == null) ? 0 : getJobDocument().hashCode());
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
        com.amazonaws.services.iotjobsdataplane.model.transform.JobExecutionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
