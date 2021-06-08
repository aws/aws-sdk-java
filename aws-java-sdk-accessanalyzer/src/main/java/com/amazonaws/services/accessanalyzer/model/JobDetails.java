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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about the policy generation request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/JobDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A timestamp of when the job was completed.
     * </p>
     */
    private java.util.Date completedOn;

    private JobError jobError;
    /**
     * <p>
     * The <code>JobId</code> that is returned by the <code>StartPolicyGeneration</code> operation. The
     * <code>JobId</code> can be used with <code>GetGeneratedPolicy</code> to retrieve the generated policies or used
     * with <code>CancelPolicyGeneration</code> to cancel the policy generation request.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * A timestamp of when the job was started.
     * </p>
     */
    private java.util.Date startedOn;
    /**
     * <p>
     * The status of the job request.
     * </p>
     */
    private String status;

    /**
     * <p>
     * A timestamp of when the job was completed.
     * </p>
     * 
     * @param completedOn
     *        A timestamp of when the job was completed.
     */

    public void setCompletedOn(java.util.Date completedOn) {
        this.completedOn = completedOn;
    }

    /**
     * <p>
     * A timestamp of when the job was completed.
     * </p>
     * 
     * @return A timestamp of when the job was completed.
     */

    public java.util.Date getCompletedOn() {
        return this.completedOn;
    }

    /**
     * <p>
     * A timestamp of when the job was completed.
     * </p>
     * 
     * @param completedOn
     *        A timestamp of when the job was completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDetails withCompletedOn(java.util.Date completedOn) {
        setCompletedOn(completedOn);
        return this;
    }

    /**
     * @param jobError
     */

    public void setJobError(JobError jobError) {
        this.jobError = jobError;
    }

    /**
     * @return
     */

    public JobError getJobError() {
        return this.jobError;
    }

    /**
     * @param jobError
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDetails withJobError(JobError jobError) {
        setJobError(jobError);
        return this;
    }

    /**
     * <p>
     * The <code>JobId</code> that is returned by the <code>StartPolicyGeneration</code> operation. The
     * <code>JobId</code> can be used with <code>GetGeneratedPolicy</code> to retrieve the generated policies or used
     * with <code>CancelPolicyGeneration</code> to cancel the policy generation request.
     * </p>
     * 
     * @param jobId
     *        The <code>JobId</code> that is returned by the <code>StartPolicyGeneration</code> operation. The
     *        <code>JobId</code> can be used with <code>GetGeneratedPolicy</code> to retrieve the generated policies or
     *        used with <code>CancelPolicyGeneration</code> to cancel the policy generation request.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The <code>JobId</code> that is returned by the <code>StartPolicyGeneration</code> operation. The
     * <code>JobId</code> can be used with <code>GetGeneratedPolicy</code> to retrieve the generated policies or used
     * with <code>CancelPolicyGeneration</code> to cancel the policy generation request.
     * </p>
     * 
     * @return The <code>JobId</code> that is returned by the <code>StartPolicyGeneration</code> operation. The
     *         <code>JobId</code> can be used with <code>GetGeneratedPolicy</code> to retrieve the generated policies or
     *         used with <code>CancelPolicyGeneration</code> to cancel the policy generation request.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The <code>JobId</code> that is returned by the <code>StartPolicyGeneration</code> operation. The
     * <code>JobId</code> can be used with <code>GetGeneratedPolicy</code> to retrieve the generated policies or used
     * with <code>CancelPolicyGeneration</code> to cancel the policy generation request.
     * </p>
     * 
     * @param jobId
     *        The <code>JobId</code> that is returned by the <code>StartPolicyGeneration</code> operation. The
     *        <code>JobId</code> can be used with <code>GetGeneratedPolicy</code> to retrieve the generated policies or
     *        used with <code>CancelPolicyGeneration</code> to cancel the policy generation request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDetails withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * A timestamp of when the job was started.
     * </p>
     * 
     * @param startedOn
     *        A timestamp of when the job was started.
     */

    public void setStartedOn(java.util.Date startedOn) {
        this.startedOn = startedOn;
    }

    /**
     * <p>
     * A timestamp of when the job was started.
     * </p>
     * 
     * @return A timestamp of when the job was started.
     */

    public java.util.Date getStartedOn() {
        return this.startedOn;
    }

    /**
     * <p>
     * A timestamp of when the job was started.
     * </p>
     * 
     * @param startedOn
     *        A timestamp of when the job was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobDetails withStartedOn(java.util.Date startedOn) {
        setStartedOn(startedOn);
        return this;
    }

    /**
     * <p>
     * The status of the job request.
     * </p>
     * 
     * @param status
     *        The status of the job request.
     * @see JobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the job request.
     * </p>
     * 
     * @return The status of the job request.
     * @see JobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the job request.
     * </p>
     * 
     * @param status
     *        The status of the job request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public JobDetails withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the job request.
     * </p>
     * 
     * @param status
     *        The status of the job request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public JobDetails withStatus(JobStatus status) {
        this.status = status.toString();
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
        if (getCompletedOn() != null)
            sb.append("CompletedOn: ").append(getCompletedOn()).append(",");
        if (getJobError() != null)
            sb.append("JobError: ").append(getJobError()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getStartedOn() != null)
            sb.append("StartedOn: ").append(getStartedOn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobDetails == false)
            return false;
        JobDetails other = (JobDetails) obj;
        if (other.getCompletedOn() == null ^ this.getCompletedOn() == null)
            return false;
        if (other.getCompletedOn() != null && other.getCompletedOn().equals(this.getCompletedOn()) == false)
            return false;
        if (other.getJobError() == null ^ this.getJobError() == null)
            return false;
        if (other.getJobError() != null && other.getJobError().equals(this.getJobError()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getStartedOn() == null ^ this.getStartedOn() == null)
            return false;
        if (other.getStartedOn() != null && other.getStartedOn().equals(this.getStartedOn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCompletedOn() == null) ? 0 : getCompletedOn().hashCode());
        hashCode = prime * hashCode + ((getJobError() == null) ? 0 : getJobError().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getStartedOn() == null) ? 0 : getStartedOn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public JobDetails clone() {
        try {
            return (JobDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.JobDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
