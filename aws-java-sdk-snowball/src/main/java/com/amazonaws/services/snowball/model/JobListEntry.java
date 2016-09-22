/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Each <code>JobListEntry</code> object contains a job's state, a job's ID, and a value that indicates whether the job
 * is a job part, in the case of an export job.
 * </p>
 */
public class JobListEntry implements Serializable, Cloneable {

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
        this.jobState = jobState.toString();
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
        setJobState(jobState);
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
            sb.append("JobId: " + getJobId() + ",");
        if (getJobState() != null)
            sb.append("JobState: " + getJobState() + ",");
        if (getIsMaster() != null)
            sb.append("IsMaster: " + getIsMaster());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobState() == null) ? 0 : getJobState().hashCode());
        hashCode = prime * hashCode + ((getIsMaster() == null) ? 0 : getIsMaster().hashCode());
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
}
