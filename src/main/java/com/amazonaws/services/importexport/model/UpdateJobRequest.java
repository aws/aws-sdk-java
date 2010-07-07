/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.importexport.AmazonImportExport#updateJob(UpdateJobRequest) UpdateJob operation}.
 * <p>
 * You use this operation to change the parameters specified in the
 * original manifest file by supplying a new manifest file. The manifest
 * file attached to this request replaces the original manifest file. You
 * can only use the operation after a CreateJob request but before the
 * data transfer starts and you can only use it on jobs you own.
 * </p>
 *
 * @see com.amazonaws.services.importexport.AmazonImportExport#updateJob(UpdateJobRequest)
 */
public class UpdateJobRequest extends AmazonWebServiceRequest {

    /**
     * A unique identifier which refers to a particular job.
     */
    private String jobId;

    /**
     * The UTF-8 encoded text of the manifest file.
     */
    private String manifest;

    /**
     * Specifies whether the job to initiate is an import or export job.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Import, Export
     */
    private String jobType;

    /**
     * Validate the manifest and parameter values in the request but do not
     * actually create a job.
     */
    private Boolean validateOnly;

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
    public UpdateJobRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    
    
    /**
     * The UTF-8 encoded text of the manifest file.
     *
     * @return The UTF-8 encoded text of the manifest file.
     */
    public String getManifest() {
        return manifest;
    }
    
    /**
     * The UTF-8 encoded text of the manifest file.
     *
     * @param manifest The UTF-8 encoded text of the manifest file.
     */
    public void setManifest(String manifest) {
        this.manifest = manifest;
    }
    
    /**
     * The UTF-8 encoded text of the manifest file.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param manifest The UTF-8 encoded text of the manifest file.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateJobRequest withManifest(String manifest) {
        this.manifest = manifest;
        return this;
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
    public UpdateJobRequest withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    
    
    /**
     * Validate the manifest and parameter values in the request but do not
     * actually create a job.
     *
     * @return Validate the manifest and parameter values in the request but do not
     *         actually create a job.
     */
    public Boolean isValidateOnly() {
        return validateOnly;
    }
    
    /**
     * Validate the manifest and parameter values in the request but do not
     * actually create a job.
     *
     * @param validateOnly Validate the manifest and parameter values in the request but do not
     *         actually create a job.
     */
    public void setValidateOnly(Boolean validateOnly) {
        this.validateOnly = validateOnly;
    }
    
    /**
     * Validate the manifest and parameter values in the request but do not
     * actually create a job.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param validateOnly Validate the manifest and parameter values in the request but do not
     *         actually create a job.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public UpdateJobRequest withValidateOnly(Boolean validateOnly) {
        this.validateOnly = validateOnly;
        return this;
    }
    
    
    /**
     * Validate the manifest and parameter values in the request but do not
     * actually create a job.
     *
     * @return Validate the manifest and parameter values in the request but do not
     *         actually create a job.
     */
    public Boolean getValidateOnly() {
        return validateOnly;
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
        sb.append("JobId: " + jobId + ", ");
        sb.append("Manifest: " + manifest + ", ");
        sb.append("JobType: " + jobType + ", ");
        sb.append("ValidateOnly: " + validateOnly + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    