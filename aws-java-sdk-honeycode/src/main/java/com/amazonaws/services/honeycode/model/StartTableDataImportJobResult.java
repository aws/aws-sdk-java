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
package com.amazonaws.services.honeycode.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/honeycode-2020-03-01/StartTableDataImportJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartTableDataImportJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The id that is assigned to this import job. Future requests to find out the status of this import job need to
     * send this id in the appropriate parameter in the request.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The status of the import job immediately after submitting the request.
     * </p>
     */
    private String jobStatus;

    /**
     * <p>
     * The id that is assigned to this import job. Future requests to find out the status of this import job need to
     * send this id in the appropriate parameter in the request.
     * </p>
     * 
     * @param jobId
     *        The id that is assigned to this import job. Future requests to find out the status of this import job need
     *        to send this id in the appropriate parameter in the request.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The id that is assigned to this import job. Future requests to find out the status of this import job need to
     * send this id in the appropriate parameter in the request.
     * </p>
     * 
     * @return The id that is assigned to this import job. Future requests to find out the status of this import job
     *         need to send this id in the appropriate parameter in the request.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The id that is assigned to this import job. Future requests to find out the status of this import job need to
     * send this id in the appropriate parameter in the request.
     * </p>
     * 
     * @param jobId
     *        The id that is assigned to this import job. Future requests to find out the status of this import job need
     *        to send this id in the appropriate parameter in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartTableDataImportJobResult withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The status of the import job immediately after submitting the request.
     * </p>
     * 
     * @param jobStatus
     *        The status of the import job immediately after submitting the request.
     * @see TableDataImportJobStatus
     */

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    /**
     * <p>
     * The status of the import job immediately after submitting the request.
     * </p>
     * 
     * @return The status of the import job immediately after submitting the request.
     * @see TableDataImportJobStatus
     */

    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * <p>
     * The status of the import job immediately after submitting the request.
     * </p>
     * 
     * @param jobStatus
     *        The status of the import job immediately after submitting the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TableDataImportJobStatus
     */

    public StartTableDataImportJobResult withJobStatus(String jobStatus) {
        setJobStatus(jobStatus);
        return this;
    }

    /**
     * <p>
     * The status of the import job immediately after submitting the request.
     * </p>
     * 
     * @param jobStatus
     *        The status of the import job immediately after submitting the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TableDataImportJobStatus
     */

    public StartTableDataImportJobResult withJobStatus(TableDataImportJobStatus jobStatus) {
        this.jobStatus = jobStatus.toString();
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
            sb.append("JobStatus: ").append(getJobStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartTableDataImportJobResult == false)
            return false;
        StartTableDataImportJobResult other = (StartTableDataImportJobResult) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobStatus() == null ^ this.getJobStatus() == null)
            return false;
        if (other.getJobStatus() != null && other.getJobStatus().equals(this.getJobStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        return hashCode;
    }

    @Override
    public StartTableDataImportJobResult clone() {
        try {
            return (StartTableDataImportJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
