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
package com.amazonaws.services.amplify.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Structure for the summary of a Job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplify-2017-07-25/JobSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Arn for the Job.
     * </p>
     */
    private String jobArn;
    /**
     * <p>
     * Unique Id for the Job.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * Commit Id from 3rd party repository provider for the Job.
     * </p>
     */
    private String commitId;
    /**
     * <p>
     * Commit message from 3rd party repository provider for the Job.
     * </p>
     */
    private String commitMessage;
    /**
     * <p>
     * Commit date / time for the Job.
     * </p>
     */
    private java.util.Date commitTime;
    /**
     * <p>
     * Start date / time for the Job.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * Status for the Job.
     * </p>
     */
    private String status;
    /**
     * <p>
     * End date / time for the Job.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * Type for the Job.
     * </p>
     */
    private String jobType;

    /**
     * <p>
     * Arn for the Job.
     * </p>
     * 
     * @param jobArn
     *        Arn for the Job.
     */

    public void setJobArn(String jobArn) {
        this.jobArn = jobArn;
    }

    /**
     * <p>
     * Arn for the Job.
     * </p>
     * 
     * @return Arn for the Job.
     */

    public String getJobArn() {
        return this.jobArn;
    }

    /**
     * <p>
     * Arn for the Job.
     * </p>
     * 
     * @param jobArn
     *        Arn for the Job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSummary withJobArn(String jobArn) {
        setJobArn(jobArn);
        return this;
    }

    /**
     * <p>
     * Unique Id for the Job.
     * </p>
     * 
     * @param jobId
     *        Unique Id for the Job.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * Unique Id for the Job.
     * </p>
     * 
     * @return Unique Id for the Job.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * Unique Id for the Job.
     * </p>
     * 
     * @param jobId
     *        Unique Id for the Job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSummary withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * Commit Id from 3rd party repository provider for the Job.
     * </p>
     * 
     * @param commitId
     *        Commit Id from 3rd party repository provider for the Job.
     */

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    /**
     * <p>
     * Commit Id from 3rd party repository provider for the Job.
     * </p>
     * 
     * @return Commit Id from 3rd party repository provider for the Job.
     */

    public String getCommitId() {
        return this.commitId;
    }

    /**
     * <p>
     * Commit Id from 3rd party repository provider for the Job.
     * </p>
     * 
     * @param commitId
     *        Commit Id from 3rd party repository provider for the Job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSummary withCommitId(String commitId) {
        setCommitId(commitId);
        return this;
    }

    /**
     * <p>
     * Commit message from 3rd party repository provider for the Job.
     * </p>
     * 
     * @param commitMessage
     *        Commit message from 3rd party repository provider for the Job.
     */

    public void setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
    }

    /**
     * <p>
     * Commit message from 3rd party repository provider for the Job.
     * </p>
     * 
     * @return Commit message from 3rd party repository provider for the Job.
     */

    public String getCommitMessage() {
        return this.commitMessage;
    }

    /**
     * <p>
     * Commit message from 3rd party repository provider for the Job.
     * </p>
     * 
     * @param commitMessage
     *        Commit message from 3rd party repository provider for the Job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSummary withCommitMessage(String commitMessage) {
        setCommitMessage(commitMessage);
        return this;
    }

    /**
     * <p>
     * Commit date / time for the Job.
     * </p>
     * 
     * @param commitTime
     *        Commit date / time for the Job.
     */

    public void setCommitTime(java.util.Date commitTime) {
        this.commitTime = commitTime;
    }

    /**
     * <p>
     * Commit date / time for the Job.
     * </p>
     * 
     * @return Commit date / time for the Job.
     */

    public java.util.Date getCommitTime() {
        return this.commitTime;
    }

    /**
     * <p>
     * Commit date / time for the Job.
     * </p>
     * 
     * @param commitTime
     *        Commit date / time for the Job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSummary withCommitTime(java.util.Date commitTime) {
        setCommitTime(commitTime);
        return this;
    }

    /**
     * <p>
     * Start date / time for the Job.
     * </p>
     * 
     * @param startTime
     *        Start date / time for the Job.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * Start date / time for the Job.
     * </p>
     * 
     * @return Start date / time for the Job.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * Start date / time for the Job.
     * </p>
     * 
     * @param startTime
     *        Start date / time for the Job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSummary withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * Status for the Job.
     * </p>
     * 
     * @param status
     *        Status for the Job.
     * @see JobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status for the Job.
     * </p>
     * 
     * @return Status for the Job.
     * @see JobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status for the Job.
     * </p>
     * 
     * @param status
     *        Status for the Job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public JobSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status for the Job.
     * </p>
     * 
     * @param status
     *        Status for the Job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public JobSummary withStatus(JobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * End date / time for the Job.
     * </p>
     * 
     * @param endTime
     *        End date / time for the Job.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * End date / time for the Job.
     * </p>
     * 
     * @return End date / time for the Job.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * End date / time for the Job.
     * </p>
     * 
     * @param endTime
     *        End date / time for the Job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobSummary withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * Type for the Job.
     * </p>
     * 
     * @param jobType
     *        Type for the Job.
     * @see JobType
     */

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    /**
     * <p>
     * Type for the Job.
     * </p>
     * 
     * @return Type for the Job.
     * @see JobType
     */

    public String getJobType() {
        return this.jobType;
    }

    /**
     * <p>
     * Type for the Job.
     * </p>
     * 
     * @param jobType
     *        Type for the Job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobType
     */

    public JobSummary withJobType(String jobType) {
        setJobType(jobType);
        return this;
    }

    /**
     * <p>
     * Type for the Job.
     * </p>
     * 
     * @param jobType
     *        Type for the Job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobType
     */

    public JobSummary withJobType(JobType jobType) {
        this.jobType = jobType.toString();
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
        if (getJobArn() != null)
            sb.append("JobArn: ").append(getJobArn()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getCommitId() != null)
            sb.append("CommitId: ").append(getCommitId()).append(",");
        if (getCommitMessage() != null)
            sb.append("CommitMessage: ").append(getCommitMessage()).append(",");
        if (getCommitTime() != null)
            sb.append("CommitTime: ").append(getCommitTime()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getJobType() != null)
            sb.append("JobType: ").append(getJobType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobSummary == false)
            return false;
        JobSummary other = (JobSummary) obj;
        if (other.getJobArn() == null ^ this.getJobArn() == null)
            return false;
        if (other.getJobArn() != null && other.getJobArn().equals(this.getJobArn()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getCommitId() == null ^ this.getCommitId() == null)
            return false;
        if (other.getCommitId() != null && other.getCommitId().equals(this.getCommitId()) == false)
            return false;
        if (other.getCommitMessage() == null ^ this.getCommitMessage() == null)
            return false;
        if (other.getCommitMessage() != null && other.getCommitMessage().equals(this.getCommitMessage()) == false)
            return false;
        if (other.getCommitTime() == null ^ this.getCommitTime() == null)
            return false;
        if (other.getCommitTime() != null && other.getCommitTime().equals(this.getCommitTime()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getJobType() == null ^ this.getJobType() == null)
            return false;
        if (other.getJobType() != null && other.getJobType().equals(this.getJobType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobArn() == null) ? 0 : getJobArn().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getCommitId() == null) ? 0 : getCommitId().hashCode());
        hashCode = prime * hashCode + ((getCommitMessage() == null) ? 0 : getCommitMessage().hashCode());
        hashCode = prime * hashCode + ((getCommitTime() == null) ? 0 : getCommitTime().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getJobType() == null) ? 0 : getJobType().hashCode());
        return hashCode;
    }

    @Override
    public JobSummary clone() {
        try {
            return (JobSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.amplify.model.transform.JobSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
