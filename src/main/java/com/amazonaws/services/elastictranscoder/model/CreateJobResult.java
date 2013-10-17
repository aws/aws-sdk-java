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
 * The CreateJobResponse structure.
 * </p>
 */
public class CreateJobResult implements Serializable {

    /**
     * A section of the response body that provides information about the job
     * that is created.
     */
    private Job job;

    /**
     * A section of the response body that provides information about the job
     * that is created.
     *
     * @return A section of the response body that provides information about the job
     *         that is created.
     */
    public Job getJob() {
        return job;
    }
    
    /**
     * A section of the response body that provides information about the job
     * that is created.
     *
     * @param job A section of the response body that provides information about the job
     *         that is created.
     */
    public void setJob(Job job) {
        this.job = job;
    }
    
    /**
     * A section of the response body that provides information about the job
     * that is created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param job A section of the response body that provides information about the job
     *         that is created.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateJobResult withJob(Job job) {
        this.job = job;
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
        if (getJob() != null) sb.append("Job: " + getJob() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getJob() == null) ? 0 : getJob().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateJobResult == false) return false;
        CreateJobResult other = (CreateJobResult)obj;
        
        if (other.getJob() == null ^ this.getJob() == null) return false;
        if (other.getJob() != null && other.getJob().equals(this.getJob()) == false) return false; 
        return true;
    }
    
}
    