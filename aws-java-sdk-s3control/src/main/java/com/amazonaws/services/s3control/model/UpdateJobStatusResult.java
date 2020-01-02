/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/UpdateJobStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateJobStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.services.s3control.S3ControlResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The ID for the job whose status was updated.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The current status for the specified job.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The reason that the specified job's status was updated.
     * </p>
     */
    private String statusUpdateReason;

    /**
     * <p>
     * The ID for the job whose status was updated.
     * </p>
     * 
     * @param jobId
     *        The ID for the job whose status was updated.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The ID for the job whose status was updated.
     * </p>
     * 
     * @return The ID for the job whose status was updated.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The ID for the job whose status was updated.
     * </p>
     * 
     * @param jobId
     *        The ID for the job whose status was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobStatusResult withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The current status for the specified job.
     * </p>
     * 
     * @param status
     *        The current status for the specified job.
     * @see JobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status for the specified job.
     * </p>
     * 
     * @return The current status for the specified job.
     * @see JobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status for the specified job.
     * </p>
     * 
     * @param status
     *        The current status for the specified job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public UpdateJobStatusResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status for the specified job.
     * </p>
     * 
     * @param status
     *        The current status for the specified job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public UpdateJobStatusResult withStatus(JobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The reason that the specified job's status was updated.
     * </p>
     * 
     * @param statusUpdateReason
     *        The reason that the specified job's status was updated.
     */

    public void setStatusUpdateReason(String statusUpdateReason) {
        this.statusUpdateReason = statusUpdateReason;
    }

    /**
     * <p>
     * The reason that the specified job's status was updated.
     * </p>
     * 
     * @return The reason that the specified job's status was updated.
     */

    public String getStatusUpdateReason() {
        return this.statusUpdateReason;
    }

    /**
     * <p>
     * The reason that the specified job's status was updated.
     * </p>
     * 
     * @param statusUpdateReason
     *        The reason that the specified job's status was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobStatusResult withStatusUpdateReason(String statusUpdateReason) {
        setStatusUpdateReason(statusUpdateReason);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusUpdateReason() != null)
            sb.append("StatusUpdateReason: ").append(getStatusUpdateReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateJobStatusResult == false)
            return false;
        UpdateJobStatusResult other = (UpdateJobStatusResult) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusUpdateReason() == null ^ this.getStatusUpdateReason() == null)
            return false;
        if (other.getStatusUpdateReason() != null && other.getStatusUpdateReason().equals(this.getStatusUpdateReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusUpdateReason() == null) ? 0 : getStatusUpdateReason().hashCode());
        return hashCode;
    }

    @Override
    public UpdateJobStatusResult clone() {
        try {
            return (UpdateJobStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
