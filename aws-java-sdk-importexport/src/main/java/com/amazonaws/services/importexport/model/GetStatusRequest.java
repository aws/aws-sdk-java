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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.importexport.AmazonImportExport#getStatus(GetStatusRequest) GetStatus operation}.
 * <p>
 * This operation returns information about a job, including where the
 * job is in the processing pipeline, the status of the results, and the
 * signature value associated with the job. You can only return
 * information about jobs you own.
 * </p>
 *
 * @see com.amazonaws.services.importexport.AmazonImportExport#getStatus(GetStatusRequest)
 */
public class GetStatusRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * A unique identifier which refers to a particular job.
     */
    private String jobId;

    /**
     * Specifies the version of the client tool.
     */
    private String aPIVersion;

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
    public GetStatusRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * Specifies the version of the client tool.
     *
     * @return Specifies the version of the client tool.
     */
    public String getAPIVersion() {
        return aPIVersion;
    }
    
    /**
     * Specifies the version of the client tool.
     *
     * @param aPIVersion Specifies the version of the client tool.
     */
    public void setAPIVersion(String aPIVersion) {
        this.aPIVersion = aPIVersion;
    }
    
    /**
     * Specifies the version of the client tool.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param aPIVersion Specifies the version of the client tool.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetStatusRequest withAPIVersion(String aPIVersion) {
        this.aPIVersion = aPIVersion;
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
        if (getAPIVersion() != null) sb.append("APIVersion: " + getAPIVersion() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode()); 
        hashCode = prime * hashCode + ((getAPIVersion() == null) ? 0 : getAPIVersion().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetStatusRequest == false) return false;
        GetStatusRequest other = (GetStatusRequest)obj;
        
        if (other.getJobId() == null ^ this.getJobId() == null) return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false) return false; 
        if (other.getAPIVersion() == null ^ this.getAPIVersion() == null) return false;
        if (other.getAPIVersion() != null && other.getAPIVersion().equals(this.getAPIVersion()) == false) return false; 
        return true;
    }
    
    @Override
    public GetStatusRequest clone() {
        
            return (GetStatusRequest) super.clone();
    }

}
    