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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Each <code>JobListEntry</code> object contains a job's state, a job's ID, and a value that indicates whether the job
 * is a job part, in the case of an export job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/JobListEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobListEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The automatically generated ID for a job, for example <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The current state of this job.
     * </p>
     */
    private String jobState;
    /**
     * <p>
     * A value that indicates that this job is a master job. A master job represents a successful request to create an
     * export job. Master jobs aren't associated with any Snowballs. Instead, each master job will have at least one job
     * part, and each job part is associated with a Snowball. It might take some time before the job parts associated
     * with a particular master job are listed, because they are created after the master job is created.
     * </p>
     */
    private Boolean isMaster;
    /**
     * <p>
     * The type of job.
     * </p>
     */
    private String jobType;
    /**
     * <p>
     * The type of device used with this job.
     * </p>
     */
    private String snowballType;
    /**
     * <p>
     * The creation date for this job.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The optional description of this specific job, for example <code>Important Photos 2016-08-11</code>.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The automatically generated ID for a job, for example <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * 
     * @param jobId
     *        The automatically generated ID for a job, for example <code>JID123e4567-e89b-12d3-a456-426655440000</code>
     *        .
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The automatically generated ID for a job, for example <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * 
     * @return The automatically generated ID for a job, for example
     *         <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The automatically generated ID for a job, for example <code>JID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * 
     * @param jobId
     *        The automatically generated ID for a job, for example <code>JID123e4567-e89b-12d3-a456-426655440000</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobListEntry withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The current state of this job.
     * </p>
     * 
     * @param jobState
     *        The current state of this job.
     * @see JobState
     */

    public void setJobState(String jobState) {
        this.jobState = jobState;
    }

    /**
     * <p>
     * The current state of this job.
     * </p>
     * 
     * @return The current state of this job.
     * @see JobState
     */

    public String getJobState() {
        return this.jobState;
    }

    /**
     * <p>
     * The current state of this job.
     * </p>
     * 
     * @param jobState
     *        The current state of this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobState
     */

    public JobListEntry withJobState(String jobState) {
        setJobState(jobState);
        return this;
    }

    /**
     * <p>
     * The current state of this job.
     * </p>
     * 
     * @param jobState
     *        The current state of this job.
     * @see JobState
     */

    public void setJobState(JobState jobState) {
        withJobState(jobState);
    }

    /**
     * <p>
     * The current state of this job.
     * </p>
     * 
     * @param jobState
     *        The current state of this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobState
     */

    public JobListEntry withJobState(JobState jobState) {
        this.jobState = jobState.toString();
        return this;
    }

    /**
     * <p>
     * A value that indicates that this job is a master job. A master job represents a successful request to create an
     * export job. Master jobs aren't associated with any Snowballs. Instead, each master job will have at least one job
     * part, and each job part is associated with a Snowball. It might take some time before the job parts associated
     * with a particular master job are listed, because they are created after the master job is created.
     * </p>
     * 
     * @param isMaster
     *        A value that indicates that this job is a master job. A master job represents a successful request to
     *        create an export job. Master jobs aren't associated with any Snowballs. Instead, each master job will have
     *        at least one job part, and each job part is associated with a Snowball. It might take some time before the
     *        job parts associated with a particular master job are listed, because they are created after the master
     *        job is created.
     */

    public void setIsMaster(Boolean isMaster) {
        this.isMaster = isMaster;
    }

    /**
     * <p>
     * A value that indicates that this job is a master job. A master job represents a successful request to create an
     * export job. Master jobs aren't associated with any Snowballs. Instead, each master job will have at least one job
     * part, and each job part is associated with a Snowball. It might take some time before the job parts associated
     * with a particular master job are listed, because they are created after the master job is created.
     * </p>
     * 
     * @return A value that indicates that this job is a master job. A master job represents a successful request to
     *         create an export job. Master jobs aren't associated with any Snowballs. Instead, each master job will
     *         have at least one job part, and each job part is associated with a Snowball. It might take some time
     *         before the job parts associated with a particular master job are listed, because they are created after
     *         the master job is created.
     */

    public Boolean getIsMaster() {
        return this.isMaster;
    }

    /**
     * <p>
     * A value that indicates that this job is a master job. A master job represents a successful request to create an
     * export job. Master jobs aren't associated with any Snowballs. Instead, each master job will have at least one job
     * part, and each job part is associated with a Snowball. It might take some time before the job parts associated
     * with a particular master job are listed, because they are created after the master job is created.
     * </p>
     * 
     * @param isMaster
     *        A value that indicates that this job is a master job. A master job represents a successful request to
     *        create an export job. Master jobs aren't associated with any Snowballs. Instead, each master job will have
     *        at least one job part, and each job part is associated with a Snowball. It might take some time before the
     *        job parts associated with a particular master job are listed, because they are created after the master
     *        job is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobListEntry withIsMaster(Boolean isMaster) {
        setIsMaster(isMaster);
        return this;
    }

    /**
     * <p>
     * A value that indicates that this job is a master job. A master job represents a successful request to create an
     * export job. Master jobs aren't associated with any Snowballs. Instead, each master job will have at least one job
     * part, and each job part is associated with a Snowball. It might take some time before the job parts associated
     * with a particular master job are listed, because they are created after the master job is created.
     * </p>
     * 
     * @return A value that indicates that this job is a master job. A master job represents a successful request to
     *         create an export job. Master jobs aren't associated with any Snowballs. Instead, each master job will
     *         have at least one job part, and each job part is associated with a Snowball. It might take some time
     *         before the job parts associated with a particular master job are listed, because they are created after
     *         the master job is created.
     */

    public Boolean isMaster() {
        return this.isMaster;
    }

    /**
     * <p>
     * The type of job.
     * </p>
     * 
     * @param jobType
     *        The type of job.
     * @see JobType
     */

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    /**
     * <p>
     * The type of job.
     * </p>
     * 
     * @return The type of job.
     * @see JobType
     */

    public String getJobType() {
        return this.jobType;
    }

    /**
     * <p>
     * The type of job.
     * </p>
     * 
     * @param jobType
     *        The type of job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobType
     */

    public JobListEntry withJobType(String jobType) {
        setJobType(jobType);
        return this;
    }

    /**
     * <p>
     * The type of job.
     * </p>
     * 
     * @param jobType
     *        The type of job.
     * @see JobType
     */

    public void setJobType(JobType jobType) {
        withJobType(jobType);
    }

    /**
     * <p>
     * The type of job.
     * </p>
     * 
     * @param jobType
     *        The type of job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobType
     */

    public JobListEntry withJobType(JobType jobType) {
        this.jobType = jobType.toString();
        return this;
    }

    /**
     * <p>
     * The type of device used with this job.
     * </p>
     * 
     * @param snowballType
     *        The type of device used with this job.
     * @see SnowballType
     */

    public void setSnowballType(String snowballType) {
        this.snowballType = snowballType;
    }

    /**
     * <p>
     * The type of device used with this job.
     * </p>
     * 
     * @return The type of device used with this job.
     * @see SnowballType
     */

    public String getSnowballType() {
        return this.snowballType;
    }

    /**
     * <p>
     * The type of device used with this job.
     * </p>
     * 
     * @param snowballType
     *        The type of device used with this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnowballType
     */

    public JobListEntry withSnowballType(String snowballType) {
        setSnowballType(snowballType);
        return this;
    }

    /**
     * <p>
     * The type of device used with this job.
     * </p>
     * 
     * @param snowballType
     *        The type of device used with this job.
     * @see SnowballType
     */

    public void setSnowballType(SnowballType snowballType) {
        withSnowballType(snowballType);
    }

    /**
     * <p>
     * The type of device used with this job.
     * </p>
     * 
     * @param snowballType
     *        The type of device used with this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnowballType
     */

    public JobListEntry withSnowballType(SnowballType snowballType) {
        this.snowballType = snowballType.toString();
        return this;
    }

    /**
     * <p>
     * The creation date for this job.
     * </p>
     * 
     * @param creationDate
     *        The creation date for this job.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The creation date for this job.
     * </p>
     * 
     * @return The creation date for this job.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The creation date for this job.
     * </p>
     * 
     * @param creationDate
     *        The creation date for this job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobListEntry withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The optional description of this specific job, for example <code>Important Photos 2016-08-11</code>.
     * </p>
     * 
     * @param description
     *        The optional description of this specific job, for example <code>Important Photos 2016-08-11</code>.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The optional description of this specific job, for example <code>Important Photos 2016-08-11</code>.
     * </p>
     * 
     * @return The optional description of this specific job, for example <code>Important Photos 2016-08-11</code>.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The optional description of this specific job, for example <code>Important Photos 2016-08-11</code>.
     * </p>
     * 
     * @param description
     *        The optional description of this specific job, for example <code>Important Photos 2016-08-11</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobListEntry withDescription(String description) {
        setDescription(description);
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
        if (getJobState() != null)
            sb.append("JobState: ").append(getJobState()).append(",");
        if (getIsMaster() != null)
            sb.append("IsMaster: ").append(getIsMaster()).append(",");
        if (getJobType() != null)
            sb.append("JobType: ").append(getJobType()).append(",");
        if (getSnowballType() != null)
            sb.append("SnowballType: ").append(getSnowballType()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobListEntry == false)
            return false;
        JobListEntry other = (JobListEntry) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobState() == null ^ this.getJobState() == null)
            return false;
        if (other.getJobState() != null && other.getJobState().equals(this.getJobState()) == false)
            return false;
        if (other.getIsMaster() == null ^ this.getIsMaster() == null)
            return false;
        if (other.getIsMaster() != null && other.getIsMaster().equals(this.getIsMaster()) == false)
            return false;
        if (other.getJobType() == null ^ this.getJobType() == null)
            return false;
        if (other.getJobType() != null && other.getJobType().equals(this.getJobType()) == false)
            return false;
        if (other.getSnowballType() == null ^ this.getSnowballType() == null)
            return false;
        if (other.getSnowballType() != null && other.getSnowballType().equals(this.getSnowballType()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobState() == null) ? 0 : getJobState().hashCode());
        hashCode = prime * hashCode + ((getIsMaster() == null) ? 0 : getIsMaster().hashCode());
        hashCode = prime * hashCode + ((getJobType() == null) ? 0 : getJobType().hashCode());
        hashCode = prime * hashCode + ((getSnowballType() == null) ? 0 : getSnowballType().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public JobListEntry clone() {
        try {
            return (JobListEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.snowball.model.transform.JobListEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
