/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.importexport.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Input structure for the UpateJob operation.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String jobId;

    private String manifest;

    private String jobType;

    private Boolean validateOnly;

    private String aPIVersion;

    /**
     * @param jobId
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * @return
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * @param jobId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * @param manifest
     */

    public void setManifest(String manifest) {
        this.manifest = manifest;
    }

    /**
     * @return
     */

    public String getManifest() {
        return this.manifest;
    }

    /**
     * @param manifest
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobRequest withManifest(String manifest) {
        setManifest(manifest);
        return this;
    }

    /**
     * @param jobType
     * @see JobType
     */

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    /**
     * @return
     * @see JobType
     */

    public String getJobType() {
        return this.jobType;
    }

    /**
     * @param jobType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobType
     */

    public UpdateJobRequest withJobType(String jobType) {
        setJobType(jobType);
        return this;
    }

    /**
     * @param jobType
     * @see JobType
     */

    public void setJobType(JobType jobType) {
        withJobType(jobType);
    }

    /**
     * @param jobType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobType
     */

    public UpdateJobRequest withJobType(JobType jobType) {
        this.jobType = jobType.toString();
        return this;
    }

    /**
     * @param validateOnly
     */

    public void setValidateOnly(Boolean validateOnly) {
        this.validateOnly = validateOnly;
    }

    /**
     * @return
     */

    public Boolean getValidateOnly() {
        return this.validateOnly;
    }

    /**
     * @param validateOnly
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobRequest withValidateOnly(Boolean validateOnly) {
        setValidateOnly(validateOnly);
        return this;
    }

    /**
     * @return
     */

    public Boolean isValidateOnly() {
        return this.validateOnly;
    }

    /**
     * @param aPIVersion
     */

    public void setAPIVersion(String aPIVersion) {
        this.aPIVersion = aPIVersion;
    }

    /**
     * @return
     */

    public String getAPIVersion() {
        return this.aPIVersion;
    }

    /**
     * @param aPIVersion
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobRequest withAPIVersion(String aPIVersion) {
        setAPIVersion(aPIVersion);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getManifest() != null)
            sb.append("Manifest: ").append(getManifest()).append(",");
        if (getJobType() != null)
            sb.append("JobType: ").append(getJobType()).append(",");
        if (getValidateOnly() != null)
            sb.append("ValidateOnly: ").append(getValidateOnly()).append(",");
        if (getAPIVersion() != null)
            sb.append("APIVersion: ").append(getAPIVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateJobRequest == false)
            return false;
        UpdateJobRequest other = (UpdateJobRequest) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getManifest() == null ^ this.getManifest() == null)
            return false;
        if (other.getManifest() != null && other.getManifest().equals(this.getManifest()) == false)
            return false;
        if (other.getJobType() == null ^ this.getJobType() == null)
            return false;
        if (other.getJobType() != null && other.getJobType().equals(this.getJobType()) == false)
            return false;
        if (other.getValidateOnly() == null ^ this.getValidateOnly() == null)
            return false;
        if (other.getValidateOnly() != null && other.getValidateOnly().equals(this.getValidateOnly()) == false)
            return false;
        if (other.getAPIVersion() == null ^ this.getAPIVersion() == null)
            return false;
        if (other.getAPIVersion() != null && other.getAPIVersion().equals(this.getAPIVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getManifest() == null) ? 0 : getManifest().hashCode());
        hashCode = prime * hashCode + ((getJobType() == null) ? 0 : getJobType().hashCode());
        hashCode = prime * hashCode + ((getValidateOnly() == null) ? 0 : getValidateOnly().hashCode());
        hashCode = prime * hashCode + ((getAPIVersion() == null) ? 0 : getAPIVersion().hashCode());
        return hashCode;
    }

    @Override
    public UpdateJobRequest clone() {
        return (UpdateJobRequest) super.clone();
    }

}
