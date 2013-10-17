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
 * Output structure for the ListJobs operation.
 * </p>
 */
public class ListJobsResult implements Serializable {

    /**
     * A list container for Jobs returned by the ListJobs operation.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Job> jobs;

    /**
     * Indicates whether the list of jobs was truncated. If true, then call
     * ListJobs again using the last JobId element as the marker.
     */
    private Boolean isTruncated;

    /**
     * A list container for Jobs returned by the ListJobs operation.
     *
     * @return A list container for Jobs returned by the ListJobs operation.
     */
    public java.util.List<Job> getJobs() {
        if (jobs == null) {
              jobs = new com.amazonaws.internal.ListWithAutoConstructFlag<Job>();
              jobs.setAutoConstruct(true);
        }
        return jobs;
    }
    
    /**
     * A list container for Jobs returned by the ListJobs operation.
     *
     * @param jobs A list container for Jobs returned by the ListJobs operation.
     */
    public void setJobs(java.util.Collection<Job> jobs) {
        if (jobs == null) {
            this.jobs = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Job> jobsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Job>(jobs.size());
        jobsCopy.addAll(jobs);
        this.jobs = jobsCopy;
    }
    
    /**
     * A list container for Jobs returned by the ListJobs operation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobs A list container for Jobs returned by the ListJobs operation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListJobsResult withJobs(Job... jobs) {
        if (getJobs() == null) setJobs(new java.util.ArrayList<Job>(jobs.length));
        for (Job value : jobs) {
            getJobs().add(value);
        }
        return this;
    }
    
    /**
     * A list container for Jobs returned by the ListJobs operation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobs A list container for Jobs returned by the ListJobs operation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListJobsResult withJobs(java.util.Collection<Job> jobs) {
        if (jobs == null) {
            this.jobs = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Job> jobsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Job>(jobs.size());
            jobsCopy.addAll(jobs);
            this.jobs = jobsCopy;
        }

        return this;
    }

    /**
     * Indicates whether the list of jobs was truncated. If true, then call
     * ListJobs again using the last JobId element as the marker.
     *
     * @return Indicates whether the list of jobs was truncated. If true, then call
     *         ListJobs again using the last JobId element as the marker.
     */
    public Boolean isTruncated() {
        return isTruncated;
    }
    
    /**
     * Indicates whether the list of jobs was truncated. If true, then call
     * ListJobs again using the last JobId element as the marker.
     *
     * @param isTruncated Indicates whether the list of jobs was truncated. If true, then call
     *         ListJobs again using the last JobId element as the marker.
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }
    
    /**
     * Indicates whether the list of jobs was truncated. If true, then call
     * ListJobs again using the last JobId element as the marker.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isTruncated Indicates whether the list of jobs was truncated. If true, then call
     *         ListJobs again using the last JobId element as the marker.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListJobsResult withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    /**
     * Indicates whether the list of jobs was truncated. If true, then call
     * ListJobs again using the last JobId element as the marker.
     *
     * @return Indicates whether the list of jobs was truncated. If true, then call
     *         ListJobs again using the last JobId element as the marker.
     */
    public Boolean getIsTruncated() {
        return isTruncated;
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
        if (getJobs() != null) sb.append("Jobs: " + getJobs() + ",");
        if (isTruncated() != null) sb.append("IsTruncated: " + isTruncated() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getJobs() == null) ? 0 : getJobs().hashCode()); 
        hashCode = prime * hashCode + ((isTruncated() == null) ? 0 : isTruncated().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListJobsResult == false) return false;
        ListJobsResult other = (ListJobsResult)obj;
        
        if (other.getJobs() == null ^ this.getJobs() == null) return false;
        if (other.getJobs() != null && other.getJobs().equals(this.getJobs()) == false) return false; 
        if (other.isTruncated() == null ^ this.isTruncated() == null) return false;
        if (other.isTruncated() != null && other.isTruncated().equals(this.isTruncated()) == false) return false; 
        return true;
    }
    
}
    