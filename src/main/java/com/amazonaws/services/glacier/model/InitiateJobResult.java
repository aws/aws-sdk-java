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
public class InitiateJobResult implements Serializable {

    /**
     * The relative URI path of the job.
     */
    private String location;

    /**
     * The ID of the job.
     */
    private String jobId;

    /**
     * The relative URI path of the job.
     *
     * @return The relative URI path of the job.
     */
    public String getLocation() {
        return location;
    }
    
    /**
     * The relative URI path of the job.
     *
     * @param location The relative URI path of the job.
     */
    public void setLocation(String location) {
        this.location = location;
    }
    
    /**
     * The relative URI path of the job.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param location The relative URI path of the job.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InitiateJobResult withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * The ID of the job.
     *
     * @return The ID of the job.
     */
    public String getJobId() {
        return jobId;
    }
    
    /**
     * The ID of the job.
     *
     * @param jobId The ID of the job.
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }
    
    /**
     * The ID of the job.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param jobId The ID of the job.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InitiateJobResult withJobId(String jobId) {
        this.jobId = jobId;
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
        if (getLocation() != null) sb.append("Location: " + getLocation() + ",");
        if (getJobId() != null) sb.append("JobId: " + getJobId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode()); 
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InitiateJobResult == false) return false;
        InitiateJobResult other = (InitiateJobResult)obj;
        
        if (other.getLocation() == null ^ this.getLocation() == null) return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false) return false; 
        if (other.getJobId() == null ^ this.getJobId() == null) return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false) return false; 
        return true;
    }
    
}
    