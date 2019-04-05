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
package com.amazonaws.services.batch.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/batch-2016-08-10/TerminateJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TerminateJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS Batch job ID of the job to terminate.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * A message to attach to the job that explains the reason for canceling it. This message is returned by future
     * <a>DescribeJobs</a> operations on the job. This message is also recorded in the AWS Batch activity logs.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * The AWS Batch job ID of the job to terminate.
     * </p>
     * 
     * @param jobId
     *        The AWS Batch job ID of the job to terminate.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The AWS Batch job ID of the job to terminate.
     * </p>
     * 
     * @return The AWS Batch job ID of the job to terminate.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The AWS Batch job ID of the job to terminate.
     * </p>
     * 
     * @param jobId
     *        The AWS Batch job ID of the job to terminate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateJobRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * A message to attach to the job that explains the reason for canceling it. This message is returned by future
     * <a>DescribeJobs</a> operations on the job. This message is also recorded in the AWS Batch activity logs.
     * </p>
     * 
     * @param reason
     *        A message to attach to the job that explains the reason for canceling it. This message is returned by
     *        future <a>DescribeJobs</a> operations on the job. This message is also recorded in the AWS Batch activity
     *        logs.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * A message to attach to the job that explains the reason for canceling it. This message is returned by future
     * <a>DescribeJobs</a> operations on the job. This message is also recorded in the AWS Batch activity logs.
     * </p>
     * 
     * @return A message to attach to the job that explains the reason for canceling it. This message is returned by
     *         future <a>DescribeJobs</a> operations on the job. This message is also recorded in the AWS Batch activity
     *         logs.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * A message to attach to the job that explains the reason for canceling it. This message is returned by future
     * <a>DescribeJobs</a> operations on the job. This message is also recorded in the AWS Batch activity logs.
     * </p>
     * 
     * @param reason
     *        A message to attach to the job that explains the reason for canceling it. This message is returned by
     *        future <a>DescribeJobs</a> operations on the job. This message is also recorded in the AWS Batch activity
     *        logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateJobRequest withReason(String reason) {
        setReason(reason);
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
        if (getReason() != null)
            sb.append("Reason: ").append(getReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TerminateJobRequest == false)
            return false;
        TerminateJobRequest other = (TerminateJobRequest) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public TerminateJobRequest clone() {
        return (TerminateJobRequest) super.clone();
    }

}
