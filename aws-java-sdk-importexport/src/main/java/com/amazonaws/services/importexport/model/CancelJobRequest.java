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
 * Input structure for the CancelJob operation.
 */
public class CancelJobRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    private String jobId;

    private String aPIVersion;

    /**
     * Sets the value of the JobId property for this object.
     * 
     * @param jobId
     *        The new value for the JobId property for this object.
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * Returns the value of the JobId property for this object.
     * 
     * @return The value of the JobId property for this object.
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * Sets the value of the JobId property for this object.
     * 
     * @param jobId
     *        The new value for the JobId property for this object.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CancelJobRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
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
    public CancelJobRequest withAPIVersion(String aPIVersion) {
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
        if (getJobId() != null)
            sb.append("JobId: " + getJobId() + ",");
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

        if (obj instanceof CancelJobRequest == false)
            return false;
        CancelJobRequest other = (CancelJobRequest) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null
                && other.getJobId().equals(this.getJobId()) == false)
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
                + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode
                + ((getAPIVersion() == null) ? 0 : getAPIVersion().hashCode());
        return hashCode;
    }

    @Override
    public CancelJobRequest clone() {
        return (CancelJobRequest) super.clone();
    }
}