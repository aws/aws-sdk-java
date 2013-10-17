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
package com.amazonaws.services.glacier.model;

import java.io.Serializable;


/**
 * <p>
 * Contains the Amazon Glacier response to your request.
 * </p>
 */
public class ListJobsResult implements Serializable {

    /**
     * A list of job objects. Each job object contains metadata describing
     * the job.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<GlacierJobDescription> jobList;

    /**
     * An opaque string that represents where to continue pagination of the
     * results. You use this value in a new List Jobs request to obtain more
     * jobs in the list. If there are no more jobs, this value is
     * <code>null</code>.
     */
    private String marker;

    /**
     * A list of job objects. Each job object contains metadata describing
     * the job.
     *
     * @return A list of job objects. Each job object contains metadata describing
     *         the job.
     */
    public java.util.List<GlacierJobDescription> getJobList() {
        if (jobList == null) {
              jobList = new com.amazonaws.internal.ListWithAutoConstructFlag<GlacierJobDescription>();
              jobList.setAutoConstruct(true);
        }
        return jobList;
    }
    
    /**
     * A list of job objects. Each job object contains metadata describing
     * the job.
     *
     * @param jobList A list of job objects. Each job object contains metadata describing
     *         the job.
     */
    public void setJobList(java.util.Collection<GlacierJobDescription> jobList) {
        if (jobList == null) {
            this.jobList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<GlacierJobDescription> jobListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<GlacierJobDescription>(jobList.size());
        jobListCopy.addAll(jobList);
        this.jobList = jobListCopy;
    }
    
    /**
     * A list of job objects. Each job object contains metadata describing
     * the job.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobList A list of job objects. Each job object contains metadata describing
     *         the job.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListJobsResult withJobList(GlacierJobDescription... jobList) {
        if (getJobList() == null) setJobList(new java.util.ArrayList<GlacierJobDescription>(jobList.length));
        for (GlacierJobDescription value : jobList) {
            getJobList().add(value);
        }
        return this;
    }
    
    /**
     * A list of job objects. Each job object contains metadata describing
     * the job.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobList A list of job objects. Each job object contains metadata describing
     *         the job.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListJobsResult withJobList(java.util.Collection<GlacierJobDescription> jobList) {
        if (jobList == null) {
            this.jobList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<GlacierJobDescription> jobListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<GlacierJobDescription>(jobList.size());
            jobListCopy.addAll(jobList);
            this.jobList = jobListCopy;
        }

        return this;
    }

    /**
     * An opaque string that represents where to continue pagination of the
     * results. You use this value in a new List Jobs request to obtain more
     * jobs in the list. If there are no more jobs, this value is
     * <code>null</code>.
     *
     * @return An opaque string that represents where to continue pagination of the
     *         results. You use this value in a new List Jobs request to obtain more
     *         jobs in the list. If there are no more jobs, this value is
     *         <code>null</code>.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An opaque string that represents where to continue pagination of the
     * results. You use this value in a new List Jobs request to obtain more
     * jobs in the list. If there are no more jobs, this value is
     * <code>null</code>.
     *
     * @param marker An opaque string that represents where to continue pagination of the
     *         results. You use this value in a new List Jobs request to obtain more
     *         jobs in the list. If there are no more jobs, this value is
     *         <code>null</code>.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An opaque string that represents where to continue pagination of the
     * results. You use this value in a new List Jobs request to obtain more
     * jobs in the list. If there are no more jobs, this value is
     * <code>null</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An opaque string that represents where to continue pagination of the
     *         results. You use this value in a new List Jobs request to obtain more
     *         jobs in the list. If there are no more jobs, this value is
     *         <code>null</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListJobsResult withMarker(String marker) {
        this.marker = marker;
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
        if (getJobList() != null) sb.append("JobList: " + getJobList() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getJobList() == null) ? 0 : getJobList().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListJobsResult == false) return false;
        ListJobsResult other = (ListJobsResult)obj;
        
        if (other.getJobList() == null ^ this.getJobList() == null) return false;
        if (other.getJobList() != null && other.getJobList().equals(this.getJobList()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    