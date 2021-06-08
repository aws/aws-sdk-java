/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.healthlake.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/StartFHIRImportJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartFHIRImportJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS-generated job ID.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The status of an import job.
     * </p>
     */
    private String jobStatus;
    /**
     * <p>
     * The AWS-generated Data Store ID.
     * </p>
     */
    private String datastoreId;

    /**
     * <p>
     * The AWS-generated job ID.
     * </p>
     * 
     * @param jobId
     *        The AWS-generated job ID.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The AWS-generated job ID.
     * </p>
     * 
     * @return The AWS-generated job ID.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The AWS-generated job ID.
     * </p>
     * 
     * @param jobId
     *        The AWS-generated job ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartFHIRImportJobResult withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The status of an import job.
     * </p>
     * 
     * @param jobStatus
     *        The status of an import job.
     * @see JobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The status of an import job.
     * </p>
     * 
     * @return The status of an import job.
     * @see JobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * The status of an import job.
     * </p>
     * 
     * @param jobStatus
     *        The status of an import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public StartFHIRImportJobResult withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * The status of an import job.
     * </p>
     * 
     * @param jobStatus
     *        The status of an import job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public StartFHIRImportJobResult withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
        return this;
    }

    /**
     * <p>
     * The AWS-generated Data Store ID.
     * </p>
     * 
     * @param datastoreId
     *        The AWS-generated Data Store ID.
     */

    public void setDatastoreId(String datastoreId) {
        this.datastoreId = datastoreId;
    }

    /**
     * <p>
     * The AWS-generated Data Store ID.
     * </p>
     * 
     * @return The AWS-generated Data Store ID.
     */

    public String getDatastoreId() {
        return this.datastoreId;
    }

    /**
     * <p>
     * The AWS-generated Data Store ID.
     * </p>
     * 
     * @param datastoreId
     *        The AWS-generated Data Store ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartFHIRImportJobResult withDatastoreId(String datastoreId) {
        setDatastoreId(datastoreId);
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
        if (getJobStatus() != null)
            sb.append("JobStatus: ").append(getJobStatus()).append(",");
        if (getDatastoreId() != null)
            sb.append("DatastoreId: ").append(getDatastoreId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartFHIRImportJobResult == false)
            return false;
        StartFHIRImportJobResult other = (StartFHIRImportJobResult) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        if (other.getDatastoreId() == null ^ this.getDatastoreId() == null)
            return false;
        if (other.getDatastoreId() != null && other.getDatastoreId().equals(this.getDatastoreId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        hashCode = prime * hashCode + ((getDatastoreId() == null) ? 0 : getDatastoreId().hashCode());
        return hashCode;
    }

    @Override
    public StartFHIRImportJobResult clone() {
        try {
            return (StartFHIRImportJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
