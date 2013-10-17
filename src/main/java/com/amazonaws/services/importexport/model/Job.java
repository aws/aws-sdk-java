/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * Representation of a job returned by the ListJobs operation.
 * </p>
 */
public class Job implements Serializable {

    /**
     * A unique identifier which refers to a particular job.
     */
    private String jobId;

    /**
     * Timestamp of the CreateJob request in ISO8601 date format. For example
     * "2010-03-28T20:27:35Z".
     */
    private java.util.Date creationDate;

    /**
     * Indicates whether the job was canceled.
     */
    private Boolean isCanceled;

    /**
     * Specifies whether the job to initiate is an import or export job.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Import, Export
     */
    private String jobType;

    /**
     * A unique identifier which refers to a particular job.
     *
     * @return A unique identifier which refers to a particular job.
     */
    public String getJobId() {
        return jobId;
    }
    
    /**
     * A unique identifier which refers to a particular job.
     *
     * @param jobId A unique identifier which refers to a particular job.
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }
    
    /**
     * A unique identifier which refers to a particular job.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobId A unique identifier which refers to a particular job.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Job withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * Timestamp of the CreateJob request in ISO8601 date format. For example
     * "2010-03-28T20:27:35Z".
     *
     * @return Timestamp of the CreateJob request in ISO8601 date format. For example
     *         "2010-03-28T20:27:35Z".
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }
    
    /**
     * Timestamp of the CreateJob request in ISO8601 date format. For example
     * "2010-03-28T20:27:35Z".
     *
     * @param creationDate Timestamp of the CreateJob request in ISO8601 date format. For example
     *         "2010-03-28T20:27:35Z".
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }
    
    /**
     * Timestamp of the CreateJob request in ISO8601 date format. For example
     * "2010-03-28T20:27:35Z".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param creationDate Timestamp of the CreateJob request in ISO8601 date format. For example
     *         "2010-03-28T20:27:35Z".
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Job withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * Indicates whether the job was canceled.
     *
     * @return Indicates whether the job was canceled.
     */
    public Boolean isCanceled() {
        return isCanceled;
    }
    
    /**
     * Indicates whether the job was canceled.
     *
     * @param isCanceled Indicates whether the job was canceled.
     */
    public void setIsCanceled(Boolean isCanceled) {
        this.isCanceled = isCanceled;
    }
    
    /**
     * Indicates whether the job was canceled.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isCanceled Indicates whether the job was canceled.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Job withIsCanceled(Boolean isCanceled) {
        this.isCanceled = isCanceled;
        return this;
    }

    /**
     * Indicates whether the job was canceled.
     *
     * @return Indicates whether the job was canceled.
     */
    public Boolean getIsCanceled() {
        return isCanceled;
    }

    /**
     * Specifies whether the job to initiate is an import or export job.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Import, Export
     *
     * @return Specifies whether the job to initiate is an import or export job.
     *
     * @see JobType
     */
    public String getJobType() {
        return jobType;
    }
    
    /**
     * Specifies whether the job to initiate is an import or export job.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Import, Export
     *
     * @param jobType Specifies whether the job to initiate is an import or export job.
     *
     * @see JobType
     */
    public void setJobType(String jobType) {
        this.jobType = jobType;
    }
    
    /**
     * Specifies whether the job to initiate is an import or export job.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Import, Export
     *
     * @param jobType Specifies whether the job to initiate is an import or export job.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see JobType
     */
    public Job withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * Specifies whether the job to initiate is an import or export job.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Import, Export
     *
     * @param jobType Specifies whether the job to initiate is an import or export job.
     *
     * @see JobType
     */
    public void setJobType(JobType jobType) {
        this.jobType = jobType.toString();
    }
    
    /**
     * Specifies whether the job to initiate is an import or export job.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Import, Export
     *
     * @param jobType Specifies whether the job to initiate is an import or export job.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see JobType
     */
    public Job withJobType(JobType jobType) {
        this.jobType = jobType.toString();
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
        if (getJobId() != null) sb.append("JobId: " + getJobId() + ",");
        if (getCreationDate() != null) sb.append("CreationDate: " + getCreationDate() + ",");
        if (isCanceled() != null) sb.append("IsCanceled: " + isCanceled() + ",");
        if (getJobType() != null) sb.append("JobType: " + getJobType() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode()); 
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode()); 
        hashCode = prime * hashCode + ((isCanceled() == null) ? 0 : isCanceled().hashCode()); 
        hashCode = prime * hashCode + ((getJobType() == null) ? 0 : getJobType().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Job == false) return false;
        Job other = (Job)obj;
        
        if (other.getJobId() == null ^ this.getJobId() == null) return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false) return false; 
        if (other.getCreationDate() == null ^ this.getCreationDate() == null) return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false) return false; 
        if (other.isCanceled() == null ^ this.isCanceled() == null) return false;
        if (other.isCanceled() != null && other.isCanceled().equals(this.isCanceled()) == false) return false; 
        if (other.getJobType() == null ^ this.getJobType() == null) return false;
        if (other.getJobType() != null && other.getJobType().equals(this.getJobType()) == false) return false; 
        return true;
    }
    
}
    