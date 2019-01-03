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
package com.amazonaws.services.importexport.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * Representation of a job returned by the ListJobs operation.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Job implements Serializable, Cloneable {

    private String jobId;

    private java.util.Date creationDate;

    private Boolean isCanceled;

    private String jobType;

    /**
     * @param jobId
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * @return
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * @param jobId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * @param creationDate
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * @return
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * @param creationDate
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * @param isCanceled
     */

    public void setIsCanceled(Boolean isCanceled) {
        this.isCanceled = isCanceled;
    }

    /**
     * @return
     */

    public Boolean getIsCanceled() {
        return this.isCanceled;
    }

    /**
     * @param isCanceled
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Job withIsCanceled(Boolean isCanceled) {
        setIsCanceled(isCanceled);
        return this;
    }

    /**
     * @return
     */

    public Boolean isCanceled() {
        return this.isCanceled;
    }

    /**
     * @param jobType
     * @see JobType
     */

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    /**
     * @return
     * @see JobType
     */

    public String getJobType() {
        return this.jobType;
    }

    /**
     * @param jobType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobType
     */

    public Job withJobType(String jobType) {
        setJobType(jobType);
        return this;
    }

    /**
     * @param jobType
     * @see JobType
     */

    public void setJobType(JobType jobType) {
        withJobType(jobType);
    }

    /**
     * @param jobType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobType
     */

    public Job withJobType(JobType jobType) {
        this.jobType = jobType.toString();
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
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getIsCanceled() != null)
            sb.append("IsCanceled: ").append(getIsCanceled()).append(",");
        if (getJobType() != null)
            sb.append("JobType: ").append(getJobType());
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
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getIsCanceled() == null ^ this.getIsCanceled() == null)
            return false;
        if (other.getIsCanceled() != null && other.getIsCanceled().equals(this.getIsCanceled()) == false)
            return false;
        if (other.getJobType() == null ^ this.getJobType() == null)
            return false;
        if (other.getJobType() != null && other.getJobType().equals(this.getJobType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getIsCanceled() == null) ? 0 : getIsCanceled().hashCode());
        hashCode = prime * hashCode + ((getJobType() == null) ? 0 : getJobType().hashCode());
        return hashCode;
    }

    @Override
    public Job clone() {
        try {
            return (Job) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
