/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.importexport.model;

import java.io.Serializable;

/**
 * Representation of a job returned by the ListJobs operation.
 */
public class Job implements Serializable, Cloneable {

    private String jobId;

    private java.util.Date creationDate;

    private Boolean isCanceled;

    private String jobType;

    /**
     * Sets the value of the JobId property for this object.
     * 
     * @param jobId
     *        The new value for the JobId property for this object.
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * Returns the value of the JobId property for this object.
     * 
     * @return The value of the JobId property for this object.
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * Sets the value of the JobId property for this object.
     * 
     * @param jobId
     *        The new value for the JobId property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Job withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * Sets the value of the CreationDate property for this object.
     * 
     * @param creationDate
     *        The new value for the CreationDate property for this object.
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * Returns the value of the CreationDate property for this object.
     * 
     * @return The value of the CreationDate property for this object.
     */
    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * Sets the value of the CreationDate property for this object.
     * 
     * @param creationDate
     *        The new value for the CreationDate property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Job withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * Sets the value of the IsCanceled property for this object.
     * 
     * @param isCanceled
     *        The new value for the IsCanceled property for this object.
     */
    public void setIsCanceled(Boolean isCanceled) {
        this.isCanceled = isCanceled;
    }

    /**
     * Returns the value of the IsCanceled property for this object.
     * 
     * @return The value of the IsCanceled property for this object.
     */
    public Boolean getIsCanceled() {
        return this.isCanceled;
    }

    /**
     * Sets the value of the IsCanceled property for this object.
     * 
     * @param isCanceled
     *        The new value for the IsCanceled property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public Job withIsCanceled(Boolean isCanceled) {
        setIsCanceled(isCanceled);
        return this;
    }

    /**
     * Returns the value of the IsCanceled property for this object.
     * 
     * @return The value of the IsCanceled property for this object.
     */
    public Boolean isCanceled() {
        return this.isCanceled;
    }

    /**
     * Sets the value of the JobType property for this object.
     * 
     * @param jobType
     *        The new value for the JobType property for this object.
     * @see JobType
     */
    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    /**
     * Returns the value of the JobType property for this object.
     * 
     * @return The value of the JobType property for this object.
     * @see JobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * Sets the value of the JobType property for this object.
     * 
     * @param jobType
     *        The new value for the JobType property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see JobType
     */
    public Job withJobType(String jobType) {
        setJobType(jobType);
        return this;
    }

    /**
     * Sets the value of the JobType property for this object.
     * 
     * @param jobType
     *        The new value for the JobType property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see JobType
     */
    public void setJobType(JobType jobType) {
        this.jobType = jobType.toString();
    }

    /**
     * Sets the value of the JobType property for this object.
     * 
     * @param jobType
     *        The new value for the JobType property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see JobType
     */
    public Job withJobType(JobType jobType) {
        setJobType(jobType);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
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
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate() + ",");
        if (getIsCanceled() != null)
            sb.append("IsCanceled: " + getIsCanceled() + ",");
        if (getJobType() != null)
            sb.append("JobType: " + getJobType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Job == false)
            return false;
        Job other = (Job) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null
                && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getIsCanceled() == null ^ this.getIsCanceled() == null)
            return false;
        if (other.getIsCanceled() != null
                && other.getIsCanceled().equals(this.getIsCanceled()) == false)
            return false;
        if (other.getJobType() == null ^ this.getJobType() == null)
            return false;
        if (other.getJobType() != null
                && other.getJobType().equals(this.getJobType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime
                * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getIsCanceled() == null) ? 0 : getIsCanceled().hashCode());
        hashCode = prime * hashCode
                + ((getJobType() == null) ? 0 : getJobType().hashCode());
        return hashCode;
    }

    @Override
    public Job clone() {
        try {
            return (Job) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}