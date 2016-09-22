/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a put job failure result action.
 * </p>
 */
public class PutJobFailureResultRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique system-generated ID of the job that failed. This is the same ID returned from PollForJobs.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The details about the failure of a job.
     * </p>
     */
    private FailureDetails failureDetails;

    /**
     * <p>
     * The unique system-generated ID of the job that failed. This is the same ID returned from PollForJobs.
     * </p>
     * 
     * @param jobId
     *        The unique system-generated ID of the job that failed. This is the same ID returned from PollForJobs.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The unique system-generated ID of the job that failed. This is the same ID returned from PollForJobs.
     * </p>
     * 
     * @return The unique system-generated ID of the job that failed. This is the same ID returned from PollForJobs.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The unique system-generated ID of the job that failed. This is the same ID returned from PollForJobs.
     * </p>
     * 
     * @param jobId
     *        The unique system-generated ID of the job that failed. This is the same ID returned from PollForJobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutJobFailureResultRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The details about the failure of a job.
     * </p>
     * 
     * @param failureDetails
     *        The details about the failure of a job.
     */

    public void setFailureDetails(FailureDetails failureDetails) {
        this.failureDetails = failureDetails;
    }

    /**
     * <p>
     * The details about the failure of a job.
     * </p>
     * 
     * @return The details about the failure of a job.
     */

    public FailureDetails getFailureDetails() {
        return this.failureDetails;
    }

    /**
     * <p>
     * The details about the failure of a job.
     * </p>
     * 
     * @param failureDetails
     *        The details about the failure of a job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutJobFailureResultRequest withFailureDetails(FailureDetails failureDetails) {
        setFailureDetails(failureDetails);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
        if (getFailureDetails() != null)
            sb.append("FailureDetails: " + getFailureDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutJobFailureResultRequest == false)
            return false;
        PutJobFailureResultRequest other = (PutJobFailureResultRequest) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getFailureDetails() == null ^ this.getFailureDetails() == null)
            return false;
        if (other.getFailureDetails() != null && other.getFailureDetails().equals(this.getFailureDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getFailureDetails() == null) ? 0 : getFailureDetails().hashCode());
        return hashCode;
    }

    @Override
    public PutJobFailureResultRequest clone() {
        return (PutJobFailureResultRequest) super.clone();
    }
}
