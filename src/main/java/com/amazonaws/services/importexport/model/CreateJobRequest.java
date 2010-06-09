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
 * Container for the parameters to the {@link com.amazonaws.services.importexport.AmazonImportExport#createJob(CreateJobRequest) CreateJob operation}.
 * <p>
 * This operation initiates the process of scheduling an upload or
 * download of your data. You include in the request a manifest that
 * describes the data transfer specifics. The response to the request
 * includes a job ID, which you can use in other operations, a signature
 * that you use to identify your storage device, and the address where
 * you should ship your storage device.
 * </p>
 *
 * @see com.amazonaws.services.importexport.AmazonImportExport#createJob(CreateJobRequest)
 */
public class CreateJobRequest extends AmazonWebServiceRequest {

    /**
     * Specifies whether the job to initiate is an import or export job.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Import, Export
     */
    private String jobType;

    /**
     * The UTF-8 encoded text of the manifest file.
     */
    private String manifest;

    /**
     * For internal use only.
     */
    private String manifestAddendum;

    /**
     * Validate the manifest and parameter values in the request but do not
     * actually create a job.
     */
    private Boolean validateOnly;

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
    public CreateJobRequest withJobType(String jobType) {
        this.jobType = jobType;
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
    public CreateJobRequest withManifest(String manifest) {
        this.manifest = manifest;
        return this;
    }
    
    
    /**
     * For internal use only.
     *
     * @return For internal use only.
     */
    public String getManifestAddendum() {
        return manifestAddendum;
    }
    
    /**
     * For internal use only.
     *
     * @param manifestAddendum For internal use only.
     */
    public void setManifestAddendum(String manifestAddendum) {
        this.manifestAddendum = manifestAddendum;
    }
    
    /**
     * For internal use only.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param manifestAddendum For internal use only.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateJobRequest withManifestAddendum(String manifestAddendum) {
        this.manifestAddendum = manifestAddendum;
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
    public CreateJobRequest withValidateOnly(Boolean validateOnly) {
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
        
        sb.append("JobType: " + jobType + ", ");
        sb.append("Manifest: " + manifest + ", ");
        sb.append("ManifestAddendum: " + manifestAddendum + ", ");
        sb.append("ValidateOnly: " + validateOnly + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    