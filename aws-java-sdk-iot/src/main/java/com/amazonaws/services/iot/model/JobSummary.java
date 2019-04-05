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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The job summary.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The job ARN.
     * </p>
     */
    private String jobArn;
    /**
     * <p>
     * The unique identifier you assigned to this job when it was created.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The ID of the thing group.
     * </p>
     */
    private String thingGroupId;
    /**
     * <p>
     * Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things specified
     * as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing when a change is
     * detected in a target. For example, a job will run on a thing when the thing is added to a target group, even
     * after the job was completed by all things originally in the group.
     * </p>
     */
    private String targetSelection;
    /**
     * <p>
     * The job summary status.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The time, in seconds since the epoch, when the job was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The time, in seconds since the epoch, when the job was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The time, in seconds since the epoch, when the job completed.
     * </p>
     */
    private java.util.Date completedAt;

    /**
     * <p>
     * The job ARN.
     * </p>
     * 
     * @param jobArn
     *        The job ARN.
     */

    public void setJobArn(String jobArn) {
        this.jobArn = jobArn;
    }

    /**
     * <p>
     * The job ARN.
     * </p>
     * 
     * @return The job ARN.
     */

    public String getJobArn() {
        return this.jobArn;
    }

    /**
     * <p>
     * The job ARN.
     * </p>
     * 
     * @param jobArn
     *        The job ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSummary withJobArn(String jobArn) {
        setJobArn(jobArn);
        return this;
    }

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

    public JobSummary withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The ID of the thing group.
     * </p>
     * 
     * @param thingGroupId
     *        The ID of the thing group.
     */

    public void setThingGroupId(String thingGroupId) {
        this.thingGroupId = thingGroupId;
    }

    /**
     * <p>
     * The ID of the thing group.
     * </p>
     * 
     * @return The ID of the thing group.
     */

    public String getThingGroupId() {
        return this.thingGroupId;
    }

    /**
     * <p>
     * The ID of the thing group.
     * </p>
     * 
     * @param thingGroupId
     *        The ID of the thing group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSummary withThingGroupId(String thingGroupId) {
        setThingGroupId(thingGroupId);
        return this;
    }

    /**
     * <p>
     * Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things specified
     * as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing when a change is
     * detected in a target. For example, a job will run on a thing when the thing is added to a target group, even
     * after the job was completed by all things originally in the group.
     * </p>
     * 
     * @param targetSelection
     *        Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things
     *        specified as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing
     *        when a change is detected in a target. For example, a job will run on a thing when the thing is added to a
     *        target group, even after the job was completed by all things originally in the group.
     * @see TargetSelection
     */

    public void setTargetSelection(String targetSelection) {
        this.targetSelection = targetSelection;
    }

    /**
     * <p>
     * Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things specified
     * as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing when a change is
     * detected in a target. For example, a job will run on a thing when the thing is added to a target group, even
     * after the job was completed by all things originally in the group.
     * </p>
     * 
     * @return Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things
     *         specified as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing
     *         when a change is detected in a target. For example, a job will run on a thing when the thing is added to
     *         a target group, even after the job was completed by all things originally in the group.
     * @see TargetSelection
     */

    public String getTargetSelection() {
        return this.targetSelection;
    }

    /**
     * <p>
     * Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things specified
     * as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing when a change is
     * detected in a target. For example, a job will run on a thing when the thing is added to a target group, even
     * after the job was completed by all things originally in the group.
     * </p>
     * 
     * @param targetSelection
     *        Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things
     *        specified as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing
     *        when a change is detected in a target. For example, a job will run on a thing when the thing is added to a
     *        target group, even after the job was completed by all things originally in the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetSelection
     */

    public JobSummary withTargetSelection(String targetSelection) {
        setTargetSelection(targetSelection);
        return this;
    }

    /**
     * <p>
     * Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things specified
     * as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing when a change is
     * detected in a target. For example, a job will run on a thing when the thing is added to a target group, even
     * after the job was completed by all things originally in the group.
     * </p>
     * 
     * @param targetSelection
     *        Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things
     *        specified as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing
     *        when a change is detected in a target. For example, a job will run on a thing when the thing is added to a
     *        target group, even after the job was completed by all things originally in the group.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetSelection
     */

    public JobSummary withTargetSelection(TargetSelection targetSelection) {
        this.targetSelection = targetSelection.toString();
        return this;
    }

    /**
     * <p>
     * The job summary status.
     * </p>
     * 
     * @param status
     *        The job summary status.
     * @see JobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The job summary status.
     * </p>
     * 
     * @return The job summary status.
     * @see JobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The job summary status.
     * </p>
     * 
     * @param status
     *        The job summary status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public JobSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The job summary status.
     * </p>
     * 
     * @param status
     *        The job summary status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public JobSummary withStatus(JobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time, in seconds since the epoch, when the job was created.
     * </p>
     * 
     * @param createdAt
     *        The time, in seconds since the epoch, when the job was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time, in seconds since the epoch, when the job was created.
     * </p>
     * 
     * @return The time, in seconds since the epoch, when the job was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time, in seconds since the epoch, when the job was created.
     * </p>
     * 
     * @param createdAt
     *        The time, in seconds since the epoch, when the job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The time, in seconds since the epoch, when the job was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time, in seconds since the epoch, when the job was last updated.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The time, in seconds since the epoch, when the job was last updated.
     * </p>
     * 
     * @return The time, in seconds since the epoch, when the job was last updated.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The time, in seconds since the epoch, when the job was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time, in seconds since the epoch, when the job was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSummary withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The time, in seconds since the epoch, when the job completed.
     * </p>
     * 
     * @param completedAt
     *        The time, in seconds since the epoch, when the job completed.
     */

    public void setCompletedAt(java.util.Date completedAt) {
        this.completedAt = completedAt;
    }

    /**
     * <p>
     * The time, in seconds since the epoch, when the job completed.
     * </p>
     * 
     * @return The time, in seconds since the epoch, when the job completed.
     */

    public java.util.Date getCompletedAt() {
        return this.completedAt;
    }

    /**
     * <p>
     * The time, in seconds since the epoch, when the job completed.
     * </p>
     * 
     * @param completedAt
     *        The time, in seconds since the epoch, when the job completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSummary withCompletedAt(java.util.Date completedAt) {
        setCompletedAt(completedAt);
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
        if (getJobArn() != null)
            sb.append("JobArn: ").append(getJobArn()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getThingGroupId() != null)
            sb.append("ThingGroupId: ").append(getThingGroupId()).append(",");
        if (getTargetSelection() != null)
            sb.append("TargetSelection: ").append(getTargetSelection()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getCompletedAt() != null)
            sb.append("CompletedAt: ").append(getCompletedAt());
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
        if (other.getJobArn() == null ^ this.getJobArn() == null)
            return false;
        if (other.getJobArn() != null && other.getJobArn().equals(this.getJobArn()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getThingGroupId() == null ^ this.getThingGroupId() == null)
            return false;
        if (other.getThingGroupId() != null && other.getThingGroupId().equals(this.getThingGroupId()) == false)
            return false;
        if (other.getTargetSelection() == null ^ this.getTargetSelection() == null)
            return false;
        if (other.getTargetSelection() != null && other.getTargetSelection().equals(this.getTargetSelection()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getCompletedAt() == null ^ this.getCompletedAt() == null)
            return false;
        if (other.getCompletedAt() != null && other.getCompletedAt().equals(this.getCompletedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobArn() == null) ? 0 : getJobArn().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getThingGroupId() == null) ? 0 : getThingGroupId().hashCode());
        hashCode = prime * hashCode + ((getTargetSelection() == null) ? 0 : getTargetSelection().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getCompletedAt() == null) ? 0 : getCompletedAt().hashCode());
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
        com.amazonaws.services.iot.model.transform.JobSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
