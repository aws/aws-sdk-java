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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.importexport.AmazonImportExport#listJobs(ListJobsRequest) ListJobs operation}.
 * <p>
 * This operation returns the jobs associated with the requester. AWS Import/Export lists the jobs in reverse chronological order based on the date of
 * creation. For example if Job Test1 was created 2009Dec30 and Test2 was created 2010Feb05, the ListJobs operation would return Test2 followed by Test1.
 * </p>
 *
 * @see com.amazonaws.services.importexport.AmazonImportExport#listJobs(ListJobsRequest)
 */
public class ListJobsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * Sets the maximum number of jobs returned in the response. If there are
     * additional jobs that were not returned because MaxJobs was exceeded,
     * the response contains <IsTruncated>true</IsTruncated>. To return the
     * additional jobs, see Marker.
     */
    private Integer maxJobs;

    /**
     * Specifies the JOBID to start after when listing the jobs created with
     * your account. AWS Import/Export lists your jobs in reverse
     * chronological order. See MaxJobs.
     */
    private String marker;

    /**
     * Sets the maximum number of jobs returned in the response. If there are
     * additional jobs that were not returned because MaxJobs was exceeded,
     * the response contains <IsTruncated>true</IsTruncated>. To return the
     * additional jobs, see Marker.
     *
     * @return Sets the maximum number of jobs returned in the response. If there are
     *         additional jobs that were not returned because MaxJobs was exceeded,
     *         the response contains <IsTruncated>true</IsTruncated>. To return the
     *         additional jobs, see Marker.
     */
    public Integer getMaxJobs() {
        return maxJobs;
    }
    
    /**
     * Sets the maximum number of jobs returned in the response. If there are
     * additional jobs that were not returned because MaxJobs was exceeded,
     * the response contains <IsTruncated>true</IsTruncated>. To return the
     * additional jobs, see Marker.
     *
     * @param maxJobs Sets the maximum number of jobs returned in the response. If there are
     *         additional jobs that were not returned because MaxJobs was exceeded,
     *         the response contains <IsTruncated>true</IsTruncated>. To return the
     *         additional jobs, see Marker.
     */
    public void setMaxJobs(Integer maxJobs) {
        this.maxJobs = maxJobs;
    }
    
    /**
     * Sets the maximum number of jobs returned in the response. If there are
     * additional jobs that were not returned because MaxJobs was exceeded,
     * the response contains <IsTruncated>true</IsTruncated>. To return the
     * additional jobs, see Marker.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxJobs Sets the maximum number of jobs returned in the response. If there are
     *         additional jobs that were not returned because MaxJobs was exceeded,
     *         the response contains <IsTruncated>true</IsTruncated>. To return the
     *         additional jobs, see Marker.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListJobsRequest withMaxJobs(Integer maxJobs) {
        this.maxJobs = maxJobs;
        return this;
    }

    /**
     * Specifies the JOBID to start after when listing the jobs created with
     * your account. AWS Import/Export lists your jobs in reverse
     * chronological order. See MaxJobs.
     *
     * @return Specifies the JOBID to start after when listing the jobs created with
     *         your account. AWS Import/Export lists your jobs in reverse
     *         chronological order. See MaxJobs.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * Specifies the JOBID to start after when listing the jobs created with
     * your account. AWS Import/Export lists your jobs in reverse
     * chronological order. See MaxJobs.
     *
     * @param marker Specifies the JOBID to start after when listing the jobs created with
     *         your account. AWS Import/Export lists your jobs in reverse
     *         chronological order. See MaxJobs.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * Specifies the JOBID to start after when listing the jobs created with
     * your account. AWS Import/Export lists your jobs in reverse
     * chronological order. See MaxJobs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker Specifies the JOBID to start after when listing the jobs created with
     *         your account. AWS Import/Export lists your jobs in reverse
     *         chronological order. See MaxJobs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListJobsRequest withMarker(String marker) {
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
        if (getMaxJobs() != null) sb.append("MaxJobs: " + getMaxJobs() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMaxJobs() == null) ? 0 : getMaxJobs().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListJobsRequest == false) return false;
        ListJobsRequest other = (ListJobsRequest)obj;
        
        if (other.getMaxJobs() == null ^ this.getMaxJobs() == null) return false;
        if (other.getMaxJobs() != null && other.getMaxJobs().equals(this.getMaxJobs()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    