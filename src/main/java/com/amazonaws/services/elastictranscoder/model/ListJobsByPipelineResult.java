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
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;


/**
 * <p>
 * The <code>ListJobsByPipelineResponse</code> structure.
 * </p>
 */
public class ListJobsByPipelineResult implements Serializable {

    /**
     * An array of <code>Job</code> objects that are in the specified
     * pipeline.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Job> jobs;

    /**
     * A value that you use to access the second and subsequent pages of
     * results, if any. When the jobs in the specified pipeline fit on one
     * page or when you've reached the last page of results, the value of
     * <code>NextPageToken</code> is <code>null</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     */
    private String nextPageToken;

    /**
     * An array of <code>Job</code> objects that are in the specified
     * pipeline.
     *
     * @return An array of <code>Job</code> objects that are in the specified
     *         pipeline.
     */
    public java.util.List<Job> getJobs() {
        if (jobs == null) {
              jobs = new com.amazonaws.internal.ListWithAutoConstructFlag<Job>();
              jobs.setAutoConstruct(true);
        }
        return jobs;
    }
    
    /**
     * An array of <code>Job</code> objects that are in the specified
     * pipeline.
     *
     * @param jobs An array of <code>Job</code> objects that are in the specified
     *         pipeline.
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
     * An array of <code>Job</code> objects that are in the specified
     * pipeline.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobs An array of <code>Job</code> objects that are in the specified
     *         pipeline.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListJobsByPipelineResult withJobs(Job... jobs) {
        if (getJobs() == null) setJobs(new java.util.ArrayList<Job>(jobs.length));
        for (Job value : jobs) {
            getJobs().add(value);
        }
        return this;
    }
    
    /**
     * An array of <code>Job</code> objects that are in the specified
     * pipeline.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobs An array of <code>Job</code> objects that are in the specified
     *         pipeline.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListJobsByPipelineResult withJobs(java.util.Collection<Job> jobs) {
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
     * A value that you use to access the second and subsequent pages of
     * results, if any. When the jobs in the specified pipeline fit on one
     * page or when you've reached the last page of results, the value of
     * <code>NextPageToken</code> is <code>null</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     *
     * @return A value that you use to access the second and subsequent pages of
     *         results, if any. When the jobs in the specified pipeline fit on one
     *         page or when you've reached the last page of results, the value of
     *         <code>NextPageToken</code> is <code>null</code>.
     */
    public String getNextPageToken() {
        return nextPageToken;
    }
    
    /**
     * A value that you use to access the second and subsequent pages of
     * results, if any. When the jobs in the specified pipeline fit on one
     * page or when you've reached the last page of results, the value of
     * <code>NextPageToken</code> is <code>null</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     *
     * @param nextPageToken A value that you use to access the second and subsequent pages of
     *         results, if any. When the jobs in the specified pipeline fit on one
     *         page or when you've reached the last page of results, the value of
     *         <code>NextPageToken</code> is <code>null</code>.
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }
    
    /**
     * A value that you use to access the second and subsequent pages of
     * results, if any. When the jobs in the specified pipeline fit on one
     * page or when you've reached the last page of results, the value of
     * <code>NextPageToken</code> is <code>null</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{13}-\w{6}$<br/>
     *
     * @param nextPageToken A value that you use to access the second and subsequent pages of
     *         results, if any. When the jobs in the specified pipeline fit on one
     *         page or when you've reached the last page of results, the value of
     *         <code>NextPageToken</code> is <code>null</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListJobsByPipelineResult withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
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
        if (getJobs() != null) sb.append("Jobs: " + getJobs() + ",");
        if (getNextPageToken() != null) sb.append("NextPageToken: " + getNextPageToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getJobs() == null) ? 0 : getJobs().hashCode()); 
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListJobsByPipelineResult == false) return false;
        ListJobsByPipelineResult other = (ListJobsByPipelineResult)obj;
        
        if (other.getJobs() == null ^ this.getJobs() == null) return false;
        if (other.getJobs() != null && other.getJobs().equals(this.getJobs()) == false) return false; 
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null) return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false) return false; 
        return true;
    }
    
}
    