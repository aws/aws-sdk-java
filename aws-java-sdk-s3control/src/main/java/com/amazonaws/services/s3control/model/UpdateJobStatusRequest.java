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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/UpdateJobStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateJobStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** <p/> */
    private String accountId;
    /**
     * <p>
     * The ID of the job whose status you want to update.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The status that you want to move the specified job to.
     * </p>
     */
    private String requestedJobStatus;
    /**
     * <p>
     * A description of the reason why you want to change the specified job's status. This field can be any string up to
     * the maximum length.
     * </p>
     */
    private String statusUpdateReason;

    /**
     * <p/>
     * 
     * @param accountId
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p/>
     * 
     * @param accountId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobStatusRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The ID of the job whose status you want to update.
     * </p>
     * 
     * @param jobId
     *        The ID of the job whose status you want to update.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The ID of the job whose status you want to update.
     * </p>
     * 
     * @return The ID of the job whose status you want to update.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The ID of the job whose status you want to update.
     * </p>
     * 
     * @param jobId
     *        The ID of the job whose status you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobStatusRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The status that you want to move the specified job to.
     * </p>
     * 
     * @param requestedJobStatus
     *        The status that you want to move the specified job to.
     * @see RequestedJobStatus
     */

    public void setRequestedJobStatus(String requestedJobStatus) {
        this.requestedJobStatus = requestedJobStatus;
    }

    /**
     * <p>
     * The status that you want to move the specified job to.
     * </p>
     * 
     * @return The status that you want to move the specified job to.
     * @see RequestedJobStatus
     */

    public String getRequestedJobStatus() {
        return this.requestedJobStatus;
    }

    /**
     * <p>
     * The status that you want to move the specified job to.
     * </p>
     * 
     * @param requestedJobStatus
     *        The status that you want to move the specified job to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RequestedJobStatus
     */

    public UpdateJobStatusRequest withRequestedJobStatus(String requestedJobStatus) {
        setRequestedJobStatus(requestedJobStatus);
        return this;
    }

    /**
     * <p>
     * The status that you want to move the specified job to.
     * </p>
     * 
     * @param requestedJobStatus
     *        The status that you want to move the specified job to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RequestedJobStatus
     */

    public UpdateJobStatusRequest withRequestedJobStatus(RequestedJobStatus requestedJobStatus) {
        this.requestedJobStatus = requestedJobStatus.toString();
        return this;
    }

    /**
     * <p>
     * A description of the reason why you want to change the specified job's status. This field can be any string up to
     * the maximum length.
     * </p>
     * 
     * @param statusUpdateReason
     *        A description of the reason why you want to change the specified job's status. This field can be any
     *        string up to the maximum length.
     */

    public void setStatusUpdateReason(String statusUpdateReason) {
        this.statusUpdateReason = statusUpdateReason;
    }

    /**
     * <p>
     * A description of the reason why you want to change the specified job's status. This field can be any string up to
     * the maximum length.
     * </p>
     * 
     * @return A description of the reason why you want to change the specified job's status. This field can be any
     *         string up to the maximum length.
     */

    public String getStatusUpdateReason() {
        return this.statusUpdateReason;
    }

    /**
     * <p>
     * A description of the reason why you want to change the specified job's status. This field can be any string up to
     * the maximum length.
     * </p>
     * 
     * @param statusUpdateReason
     *        A description of the reason why you want to change the specified job's status. This field can be any
     *        string up to the maximum length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateJobStatusRequest withStatusUpdateReason(String statusUpdateReason) {
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getRequestedJobStatus() != null)
            sb.append("RequestedJobStatus: ").append(getRequestedJobStatus()).append(",");
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

        if (obj instanceof UpdateJobStatusRequest == false)
            return false;
        UpdateJobStatusRequest other = (UpdateJobStatusRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getRequestedJobStatus() == null ^ this.getRequestedJobStatus() == null)
            return false;
        if (other.getRequestedJobStatus() != null && other.getRequestedJobStatus().equals(this.getRequestedJobStatus()) == false)
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

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getRequestedJobStatus() == null) ? 0 : getRequestedJobStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusUpdateReason() == null) ? 0 : getStatusUpdateReason().hashCode());
        return hashCode;
    }

    @Override
    public UpdateJobStatusRequest clone() {
        return (UpdateJobStatusRequest) super.clone();
    }

}
