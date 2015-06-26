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
 * Input structure for the CreateJob operation.
 */
public class CreateJobRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    private String jobType;

    private String manifest;

    private String manifestAddendum;

    private Boolean validateOnly;

    private String aPIVersion;

    /**
     * Sets the value of the JobType property for this object.
     * 
     * @param jobType
     *        The new value for the JobType property for this object.
     * @see JobType
     */
    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    /**
     * Returns the value of the JobType property for this object.
     * 
     * @return The value of the JobType property for this object.
     * @see JobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * Sets the value of the JobType property for this object.
     * 
     * @param jobType
     *        The new value for the JobType property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see JobType
     */
    public CreateJobRequest withJobType(String jobType) {
        setJobType(jobType);
        return this;
    }

    /**
     * Sets the value of the JobType property for this object.
     * 
     * @param jobType
     *        The new value for the JobType property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see JobType
     */
    public void setJobType(JobType jobType) {
        this.jobType = jobType.toString();
    }

    /**
     * Sets the value of the JobType property for this object.
     * 
     * @param jobType
     *        The new value for the JobType property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see JobType
     */
    public CreateJobRequest withJobType(JobType jobType) {
        setJobType(jobType);
        return this;
    }

    /**
     * Sets the value of the Manifest property for this object.
     * 
     * @param manifest
     *        The new value for the Manifest property for this object.
     */
    public void setManifest(String manifest) {
        this.manifest = manifest;
    }

    /**
     * Returns the value of the Manifest property for this object.
     * 
     * @return The value of the Manifest property for this object.
     */
    public String getManifest() {
        return this.manifest;
    }

    /**
     * Sets the value of the Manifest property for this object.
     * 
     * @param manifest
     *        The new value for the Manifest property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withManifest(String manifest) {
        setManifest(manifest);
        return this;
    }

    /**
     * Sets the value of the ManifestAddendum property for this object.
     * 
     * @param manifestAddendum
     *        The new value for the ManifestAddendum property for this object.
     */
    public void setManifestAddendum(String manifestAddendum) {
        this.manifestAddendum = manifestAddendum;
    }

    /**
     * Returns the value of the ManifestAddendum property for this object.
     * 
     * @return The value of the ManifestAddendum property for this object.
     */
    public String getManifestAddendum() {
        return this.manifestAddendum;
    }

    /**
     * Sets the value of the ManifestAddendum property for this object.
     * 
     * @param manifestAddendum
     *        The new value for the ManifestAddendum property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withManifestAddendum(String manifestAddendum) {
        setManifestAddendum(manifestAddendum);
        return this;
    }

    /**
     * Sets the value of the ValidateOnly property for this object.
     * 
     * @param validateOnly
     *        The new value for the ValidateOnly property for this object.
     */
    public void setValidateOnly(Boolean validateOnly) {
        this.validateOnly = validateOnly;
    }

    /**
     * Returns the value of the ValidateOnly property for this object.
     * 
     * @return The value of the ValidateOnly property for this object.
     */
    public Boolean getValidateOnly() {
        return this.validateOnly;
    }

    /**
     * Sets the value of the ValidateOnly property for this object.
     * 
     * @param validateOnly
     *        The new value for the ValidateOnly property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withValidateOnly(Boolean validateOnly) {
        setValidateOnly(validateOnly);
        return this;
    }

    /**
     * Returns the value of the ValidateOnly property for this object.
     * 
     * @return The value of the ValidateOnly property for this object.
     */
    public Boolean isValidateOnly() {
        return this.validateOnly;
    }

    /**
     * Sets the value of the APIVersion property for this object.
     * 
     * @param aPIVersion
     *        The new value for the APIVersion property for this object.
     */
    public void setAPIVersion(String aPIVersion) {
        this.aPIVersion = aPIVersion;
    }

    /**
     * Returns the value of the APIVersion property for this object.
     * 
     * @return The value of the APIVersion property for this object.
     */
    public String getAPIVersion() {
        return this.aPIVersion;
    }

    /**
     * Sets the value of the APIVersion property for this object.
     * 
     * @param aPIVersion
     *        The new value for the APIVersion property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateJobRequest withAPIVersion(String aPIVersion) {
        setAPIVersion(aPIVersion);
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
        if (getJobType() != null)
            sb.append("JobType: " + getJobType() + ",");
        if (getManifest() != null)
            sb.append("Manifest: " + getManifest() + ",");
        if (getManifestAddendum() != null)
            sb.append("ManifestAddendum: " + getManifestAddendum() + ",");
        if (getValidateOnly() != null)
            sb.append("ValidateOnly: " + getValidateOnly() + ",");
        if (getAPIVersion() != null)
            sb.append("APIVersion: " + getAPIVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateJobRequest == false)
            return false;
        CreateJobRequest other = (CreateJobRequest) obj;
        if (other.getJobType() == null ^ this.getJobType() == null)
            return false;
        if (other.getJobType() != null
                && other.getJobType().equals(this.getJobType()) == false)
            return false;
        if (other.getManifest() == null ^ this.getManifest() == null)
            return false;
        if (other.getManifest() != null
                && other.getManifest().equals(this.getManifest()) == false)
            return false;
        if (other.getManifestAddendum() == null
                ^ this.getManifestAddendum() == null)
            return false;
        if (other.getManifestAddendum() != null
                && other.getManifestAddendum().equals(
                        this.getManifestAddendum()) == false)
            return false;
        if (other.getValidateOnly() == null ^ this.getValidateOnly() == null)
            return false;
        if (other.getValidateOnly() != null
                && other.getValidateOnly().equals(this.getValidateOnly()) == false)
            return false;
        if (other.getAPIVersion() == null ^ this.getAPIVersion() == null)
            return false;
        if (other.getAPIVersion() != null
                && other.getAPIVersion().equals(this.getAPIVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getJobType() == null) ? 0 : getJobType().hashCode());
        hashCode = prime * hashCode
                + ((getManifest() == null) ? 0 : getManifest().hashCode());
        hashCode = prime
                * hashCode
                + ((getManifestAddendum() == null) ? 0 : getManifestAddendum()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getValidateOnly() == null) ? 0 : getValidateOnly()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getAPIVersion() == null) ? 0 : getAPIVersion().hashCode());
        return hashCode;
    }

    @Override
    public CreateJobRequest clone() {
        return (CreateJobRequest) super.clone();
    }
}